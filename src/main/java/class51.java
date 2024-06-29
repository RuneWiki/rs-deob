import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class51 {

    @OriginalMember(owner = "client!i", name = "m", descriptor = "[I")
    private int[] field1298;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "[B")
    private byte[] field1299;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "[I")
    private int[] field1305;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "Lke;")
    public static class65 field1286 = null;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "Lke;")
    public static class65 field1291 = class1.method17("backleft2", -121);

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public static int field1294 = 0;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "Lke;")
    public static class65 field1296 = class1.method17("::noclip", -118);

    @OriginalMember(owner = "client!i", name = "p", descriptor = "Lke;")
    public static class65 field1301 = class1.method17("Der Anmelde)2Server ist offline)3", -123);

    @OriginalMember(owner = "client!i", name = "r", descriptor = "Lke;")
    private static class65 field1303 = class1.method17("Moderator option: Mute player for 48 hours: <OFF>", -124);

    @OriginalMember(owner = "client!i", name = "c", descriptor = "Lke;")
    public static class65 field1288 = field1303;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "Lke;")
    private static class65 field1289 = class1.method17("level)2", -112);

    @OriginalMember(owner = "client!i", name = "q", descriptor = "Lke;")
    public static class65 field1302 = class1.method17("Menge eingeben:", -121);

    @OriginalMember(owner = "client!i", name = "v", descriptor = "Lke;")
    public static class65 field1307 = class1.method17("lila:", -125);

    @OriginalMember(owner = "client!i", name = "u", descriptor = "Lke;")
    public static class65 field1306 = field1289;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "Lie;")
    public static class53 field1292 = new class53();

    @OriginalMember(owner = "client!i", name = "A", descriptor = "I")
    public static int field1312 = -1;

    @OriginalMember(owner = "client!i", name = "y", descriptor = "Lke;")
    private static class65 field1310 = class1.method17("Loaded config", -112);

    @OriginalMember(owner = "client!i", name = "B", descriptor = "Lke;")
    public static class65 field1313 = field1310;

    @OriginalMember(owner = "client!i", name = "z", descriptor = "I")
    public static int field1311 = 0;

    @OriginalMember(owner = "client!i", name = "x", descriptor = "I")
    public static int field1309 = 0;

    @OriginalMember(owner = "client!i", name = "C", descriptor = "[Lkb;")
    public static class61[] field1314 = new class61[1000];

    @OriginalMember(owner = "client!i", name = "E", descriptor = "I")
    public static int field1315 = 0;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!i", name = "w", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIZIII)I", line = 14)
    public static final int method406(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg3) {
            return 62;
        }
        int var7 = arg4 & 0x3;
        field1297++;
        if ((arg0 & 0x1) == 1) {
            int var8 = arg6;
            arg6 = arg5;
            arg5 = var8;
        }
        if (var7 == 0) {
            return arg1;
        } else if (var7 == 1) {
            return arg2;
        } else if (var7 == 2) {
            return 7 + 1 - arg1 - arg6;
        } else {
            return 7 + 1 - arg2 - arg5;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B[B[BIII)I", line = 47)
    public final int method407(byte arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field1308++;
        if (arg0 >= -26) {
            method411(89);
        }
        if (arg3 == 0) {
            return 0;
        }
        int var7 = arg3 + arg4;
        int var8 = 0;
        int var9 = arg5;
        while (true) {
            byte var10 = arg1[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field1298[var8];
            }
            int var11;
            if ((var11 = this.field1298[var8]) < 0) {
                arg2[arg4++] = (byte) ~var11;
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field1298[var8];
            }
            int var12;
            if ((var12 = this.field1298[var8]) < 0) {
                arg2[arg4++] = (byte) ~var12;
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field1298[var8];
            }
            int var13;
            if ((var13 = this.field1298[var8]) < 0) {
                arg2[arg4++] = (byte) ~var13;
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field1298[var8];
            }
            int var14;
            if ((var14 = this.field1298[var8]) < 0) {
                arg2[arg4++] = (byte) ~var14;
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field1298[var8];
            }
            int var15;
            if ((var15 = this.field1298[var8]) < 0) {
                arg2[arg4++] = (byte) ~var15;
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field1298[var8];
            }
            int var16;
            if ((var16 = this.field1298[var8]) < 0) {
                arg2[arg4++] = (byte) ~var16;
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field1298[var8];
            }
            int var17;
            if ((var17 = this.field1298[var8]) < 0) {
                arg2[arg4++] = (byte) ~var17;
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field1298[var8];
            }
            int var18;
            if ((var18 = this.field1298[var8]) < 0) {
                arg2[arg4++] = (byte) ~var18;
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg5;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IZ)Lke;", line = 231)
    public static final class65 method408(int arg0, boolean arg1) {
        if (arg1) {
            field1287++;
            return class21.method172(-57, new class65[] { class39.method320(arg0 >> 24 & 0xFF, (byte) -36), class113.field2825, class39.method320(arg0 >> 16 & 0xFF, (byte) -36), class113.field2825, class39.method320(arg0 >> 8 & 0xFF, (byte) -36), class113.field2825, class39.method320(arg0 & 0xFF, (byte) -36) });
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II[B[Lne;BII)V", line = 256)
    public static final void method409(int arg0, int arg1, byte[] arg2, class83[] arg3, byte arg4, int arg5, int arg6) {
        field1300++;
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg1 + var12 > 0 && arg1 + var12 < 103 && arg0 + var13 > 0 && arg0 + var13 < 103) {
                        arg3[var7].field2174[arg1 + var12][arg0 + var13] = class114.method934(arg3[var7].field2174[arg1 + var12][arg0 + var13], -16777217);
                    }
                }
            }
        }
        if (arg4 != 106) {
            field1289 = null;
        }
        class39 var8 = new class39(arg2);
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class6.method40(arg5, 0, var8, var9, arg0 + var11, arg1 + var10, arg6, 8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([BIIB[BI)I", line = 321)
    public final int method410(byte[] arg0, int arg1, int arg2, byte arg3, byte[] arg4, int arg5) {
        field1290++;
        int var7 = arg2 + arg5;
        int var8 = 0;
        int var9 = arg1 << 3;
        while (var7 > arg5) {
            int var10 = arg4[arg5] & 0xFF;
            int var11 = this.field1305[var10];
            byte var12 = this.field1299[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var8 & -var14 >> 31;
            int var16 = var13 + (var12 + var14 - 1 >> 3);
            var9 += var12;
            int var17 = var14 + 24;
            arg0[var13] = (byte) (var8 = class5.method37(var15, var11 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg0[var13] = (byte) (var8 = var11 >>> var14);
                if (var13 < var16) {
                    var13++;
                    var14 -= 8;
                    arg0[var13] = (byte) (var8 = var11 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg0[var13] = (byte) (var8 = var11 >>> var14);
                        if (var13 < var16) {
                            var13++;
                            var14 -= 8;
                            arg0[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            arg5++;
        }
        if (arg3 != 126) {
            field1292 = null;
        }
        return (var9 + 7 >> 3) - arg1;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V", line = 395)
    public static final void method411(int arg0) {
        field1304++;
        class12.method70(-124);
        class20.method168((byte) -83);
        class70.method583(103);
        class90.method791(117);
        class70.method577(0);
        class74.method656(-111);
        class70.method574(120);
        class80.method700(111);
        class114.method931(512);
        class121.method969(286896358);
        class79.method693(-34);
        class9.method55((byte) 78);
        ((class111) class127.field3078).method911((byte) 13);
        class19.field467.method471((byte) -23);
        class6.field125.method471((byte) -23);
        class117.field2934.method471((byte) -23);
        class70.field1809.method471((byte) -23);
        class20.field491.method471((byte) -23);
        class56.field1468.method471((byte) -23);
        class26.field645.method471((byte) -23);
        class23.field569.method471((byte) -23);
        class57.field1529.method471((byte) -23);
        if (arg0 >= -48) {
            method409(81, -48, null, null, (byte) 120, 33, -46);
        }
        class100.field2604.method471((byte) -23);
        class55.field1409.method471((byte) -23);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "([B)V", line = 432)
    public class51(byte[] arg0) {
        int var2 = arg0.length;
        this.field1298 = new int[8];
        this.field1299 = arg0;
        int[] var3 = new int[33];
        this.field1305 = new int[var2];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field1305[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class5.method37(var11, var12);
                    }
                    var9 = var7 | var8;
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field1298[var14] == 0) {
                            this.field1298[var14] = var4;
                        }
                        var14 = this.field1298[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field1298.length) {
                        int[] var18 = new int[this.field1298.length * 2];
                        for (int var19 = 0; var19 < this.field1298.length; var19++) {
                            var18[var19] = this.field1298[var19];
                        }
                        this.field1298 = var18;
                    }
                }
                this.field1298[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V", line = 568)
    public static void method412(byte arg0) {
        field1313 = null;
        field1296 = null;
        field1302 = null;
        field1292 = null;
        field1314 = null;
        field1291 = null;
        field1307 = null;
        field1310 = null;
        field1289 = null;
        field1306 = null;
        field1286 = null;
        field1303 = null;
        if (arg0 <= 12) {
            method406(7, 19, -125, false, 71, 17, 97);
        }
        field1288 = null;
        field1301 = null;
    }
}
