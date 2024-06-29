import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class188 {

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "[I")
    private int[] field3385;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "[B")
    private byte[] field3383;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "[I")
    private int[] field3377;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field3376 = 0;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "Llb;")
    public static class127 field3380 = new class127(500);

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "Loh;")
    public static class263 field3386 = class253.method1681(-117, "weiss:");

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "Loh;")
    public static class263 field3387 = class253.method1681(-126, "Lade Liste der Welten");

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "Loh;")
    public static class263 field3388 = class253.method1681(-124, "_");

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "Lsb;")
    public static class216 field3391 = new class216(64);

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
    public static int field3393 = 0;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "F")
    public static float field3390;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)V")
    public static final void method1232(int arg0, int arg1, int arg2) {
        field3379++;
        if (arg0 != -28330) {
            method1238(true, 109, true, -125, -119, 9, -74);
        }
        class64 var3 = class84.method563(12, arg1, 83);
        var3.method396(true);
        var3.field1290 = arg2;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V")
    public static final void method1233(boolean arg0) {
        if (!arg0) {
            method1232(38, 55, -87);
        }
        field3392++;
        int var1 = class100.method679((byte) -75);
        if (var1 == 0) {
            class214.field3812 = null;
            class21.method158((byte) 72, 0);
        } else if (var1 == 1) {
            class177.method1163((byte) -96, (byte) 0);
            class21.method158((byte) 72, 512);
            class4.method26(-3415);
        } else {
            class177.method1163((byte) -96, (byte) (class150.field2711 - 4 & 0xFF));
            class21.method158((byte) 72, 2);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "([BI[BIII)I")
    public final int method1234(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field3389++;
        int var7 = arg4 << 3;
        int var8 = 0;
        int var9 = arg1 + arg5;
        while (arg5 < var9) {
            int var10 = arg2[arg5] & 0xFF;
            int var11 = this.field3385[var10];
            byte var12 = this.field3383[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var7 & 0x7;
            int var14 = var8 & -var13 >> 31;
            int var15 = var7 >> 3;
            int var16 = (var12 + var13 - 1 >> 3) + var15;
            int var17 = var13 + 24;
            arg0[var15] = (byte) (var8 = class160.method1052(var14, var11 >>> var17));
            if (var16 > var15) {
                var13 = var17 - 8;
                var15++;
                arg0[var15] = (byte) (var8 = var11 >>> var13);
                if (var16 > var15) {
                    var15++;
                    var13 -= 8;
                    arg0[var15] = (byte) (var8 = var11 >>> var13);
                    if (var16 > var15) {
                        var15++;
                        var13 -= 8;
                        arg0[var15] = (byte) (var8 = var11 >>> var13);
                        if (var16 > var15) {
                            var13 -= 8;
                            var15++;
                            arg0[var15] = (byte) (var8 = var11 << -var13);
                        }
                    }
                }
            }
            var7 += var12;
            arg5++;
        }
        if (arg3 <= 17) {
            field3388 = null;
        }
        return (var7 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
    public static void method1235(int arg0) {
        field3388 = null;
        field3391 = null;
        field3386 = null;
        field3387 = null;
        if (arg0 == 16) {
            field3380 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ltg;ILue;Lue;Lue;)Z")
    public static final boolean method1236(class177 arg0, int arg1, class86 arg2, class86 arg3, class86 arg4) {
        class205.field3729 = arg2;
        class63.field1275 = arg0;
        class145.field2657 = arg4;
        field3375++;
        if (arg1 != 3119) {
            method1238(true, 22, false, -9, 114, 65, 62);
        }
        class146.field2671 = arg3;
        return true;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "([B)V")
    public class188(byte[] arg0) {
        int var2 = arg0.length;
        this.field3385 = new int[var2];
        int[] var3 = new int[33];
        this.field3383 = arg0;
        this.field3377 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field3385[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    var9 = var8 | var7;
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
                        var3[var10] = class160.method1052(var11, var12);
                    }
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
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field3377[var14] == 0) {
                            this.field3377[var14] = var4;
                        }
                        var14 = this.field3377[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field3377.length) {
                        int[] var18 = new int[this.field3377.length * 2];
                        for (int var19 = 0; var19 < this.field3377.length; var19++) {
                            var18[var19] = this.field3377[var19];
                        }
                        this.field3377 = var18;
                    }
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field3377[var14] = ~var5;
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I[BI[BBI)I")
    public final int method1237(int arg0, byte[] arg1, int arg2, byte[] arg3, byte arg4, int arg5) {
        field3384++;
        if (arg2 == 0) {
            return 0;
        }
        if (arg4 != 44) {
            method1233(true);
        }
        int var7 = arg0 + arg2;
        int var8 = 0;
        int var9 = arg5;
        while (true) {
            byte var10 = arg3[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field3377[var8];
            }
            int var11;
            if ((var11 = this.field3377[var8]) < 0) {
                arg1[arg0++] = (byte) (~var11);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field3377[var8];
            }
            int var12;
            if ((var12 = this.field3377[var8]) < 0) {
                arg1[arg0++] = (byte) (~var12);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field3377[var8];
            }
            int var13;
            if ((var13 = this.field3377[var8]) < 0) {
                arg1[arg0++] = (byte) (~var13);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field3377[var8];
            }
            int var14;
            if ((var14 = this.field3377[var8]) < 0) {
                arg1[arg0++] = (byte) (~var14);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field3377[var8];
            }
            int var15;
            if ((var15 = this.field3377[var8]) < 0) {
                arg1[arg0++] = (byte) (~var15);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field3377[var8];
            }
            int var16;
            if ((var16 = this.field3377[var8]) < 0) {
                arg1[arg0++] = (byte) (~var16);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field3377[var8];
            }
            int var17;
            if ((var17 = this.field3377[var8]) < 0) {
                arg1[arg0++] = (byte) (~var17);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field3377[var8];
            }
            int var18;
            if ((var18 = this.field3377[var8]) < 0) {
                arg1[arg0++] = (byte) (~var18);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg5;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZIZIIII)V")
    public static final void method1238(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 < arg6) {
            int var7 = (arg1 + arg6) / 2;
            int var8 = arg1;
            class130 var9 = class214.field3810[var7];
            class214.field3810[var7] = class214.field3810[arg6];
            class214.field3810[arg6] = var9;
            for (int var10 = arg1; var10 < arg6; var10++) {
                if (class173.method1141(0, var9, arg2, arg3, arg4, class214.field3810[var10], arg0) <= 0) {
                    class130 var11 = class214.field3810[var10];
                    class214.field3810[var10] = class214.field3810[var8];
                    class214.field3810[var8++] = var11;
                }
            }
            class214.field3810[arg6] = class214.field3810[var8];
            class214.field3810[var8] = var9;
            method1238(arg0, arg1, arg2, arg3, arg4, -108, var8 - 1);
            method1238(arg0, var8 + 1, arg2, arg3, arg4, 16, arg6);
        }
        int var12 = -89 % ((arg5 + 39) / 38);
        field3378++;
    }
}
