import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class69 {

    @OriginalMember(owner = "client!he", name = "c", descriptor = "[I")
    private int[] field1293;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "[B")
    private byte[] field1302;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "[I")
    private int[] field1299;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field1294 = 0;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field1292 = 0;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field1291 = -1;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field1298 = 0;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "Lhe;")
    public static class69 field1297;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "[I")
    public static int[] field1295;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)Lsg;")
    public static final class169 method431(int arg0, int arg1) {
        field1301++;
        if (arg1 != -24488) {
            method433((byte) -49);
        }
        if (arg0 < 100000) {
            return class165.method1058(0, new class169[] { class56.field1035, class2.method18((byte) -62, arg0), class64.field1200 });
        } else if (arg0 < 10000000) {
            return class165.method1058(arg1 + 24488, new class169[] { class156.field2989, class2.method18((byte) -62, arg0 / 1000), class22.field471, class64.field1200 });
        } else {
            return class165.method1058(arg1 ^ 0xFFFFA058, new class169[] { class3.field70, class2.method18((byte) -62, arg0 / 1000000), class201.field3928, class64.field1200 });
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(III[BI[B)I")
    public final int method432(int arg0, int arg1, int arg2, byte[] arg3, int arg4, byte[] arg5) {
        if (arg1 < 6) {
            return 99;
        }
        int var7 = 0;
        int var8 = arg0 + arg4;
        field1304++;
        int var9 = arg2 << 3;
        while (var8 > arg4) {
            int var10 = arg5[arg4] & 0xFF;
            int var11 = this.field1293[var10];
            byte var12 = this.field1302[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            var9 += var12;
            int var15 = var7 & -var14 >> 31;
            int var16 = var13 + (var14 + var12 - 1 >> 3);
            int var17 = var14 + 24;
            arg3[var13] = (byte) (var7 = class10.method56(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg3[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg3[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var14 -= 8;
                        var13++;
                        arg3[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var14 -= 8;
                            var13++;
                            arg3[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg4++;
        }
        return (var9 + 7 >> 3) - arg2;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
    public static void method433(byte arg0) {
        if (arg0 == 15) {
            field1297 = null;
            field1295 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "([B[BIZII)I")
    public final int method434(byte[] arg0, byte[] arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field1300++;
        if (arg3) {
            this.method434(null, null, -77, false, 19, 27);
        }
        if (arg4 == 0) {
            return 0;
        }
        int var7 = arg2 + arg4;
        int var8 = 0;
        int var9 = arg5;
        while (true) {
            byte var10 = arg1[var9];
            if (var10 < 0) {
                var8 = this.field1299[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field1299[var8]) < 0) {
                arg0[arg2++] = (byte) ~var11;
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field1299[var8];
            }
            int var12;
            if ((var12 = this.field1299[var8]) < 0) {
                arg0[arg2++] = (byte) ~var12;
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field1299[var8];
            }
            int var13;
            if ((var13 = this.field1299[var8]) < 0) {
                arg0[arg2++] = (byte) ~var13;
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field1299[var8];
            }
            int var14;
            if ((var14 = this.field1299[var8]) < 0) {
                arg0[arg2++] = (byte) ~var14;
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field1299[var8];
            }
            int var15;
            if ((var15 = this.field1299[var8]) < 0) {
                arg0[arg2++] = (byte) ~var15;
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field1299[var8];
            }
            int var16;
            if ((var16 = this.field1299[var8]) < 0) {
                arg0[arg2++] = (byte) ~var16;
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field1299[var8];
            }
            int var17;
            if ((var17 = this.field1299[var8]) < 0) {
                arg0[arg2++] = (byte) ~var17;
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field1299[var8];
            }
            int var18;
            if ((var18 = this.field1299[var8]) < 0) {
                arg0[arg2++] = (byte) ~var18;
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg5;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "([B)V")
    public class69(byte[] arg0) {
        int var2 = arg0.length;
        this.field1293 = new int[var2];
        this.field1302 = arg0;
        this.field1299 = new int[8];
        int var3 = 0;
        int[] var4 = new int[33];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var4[var6];
                this.field1293[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    var9 = var8 | var7;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var4[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var4[var10] = var4[var10 - 1];
                            break;
                        }
                        var4[var10] = class10.method56(var11, var12);
                    }
                } else {
                    var9 = var4[var6 - 1];
                }
                var4[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var4[var13] == var8) {
                        var4[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field1299[var14] == 0) {
                            this.field1299[var14] = var3;
                        }
                        var14 = this.field1299[var14];
                    }
                    if (this.field1299.length <= var14) {
                        int[] var17 = new int[this.field1299.length * 2];
                        for (int var18 = 0; var18 < this.field1299.length; var18++) {
                            var17[var18] = this.field1299[var18];
                        }
                        this.field1299 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var3 <= var14) {
                    var3 = var14 + 1;
                }
                this.field1299[var14] = ~var5;
            }
        }
    }
}
