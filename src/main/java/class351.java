import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class351 {

    @OriginalMember(owner = "client!td", name = "h", descriptor = "[I")
    private int[] field5354;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "[B")
    private byte[] field5348;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "[I")
    private int[] field5356;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "[I")
    public static int[] field5351 = new int[32];

    @OriginalMember(owner = "client!td", name = "d", descriptor = "[C")
    public static char[] field5350 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!td", name = "a", descriptor = "Lsh;")
    public static class472 field5347 = new class472(99, -2);

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public static int field5353;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "[I")
    public static int[] field5355;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II[B[BBI)I", line = 5)
    public final int method2167(int arg0, int arg1, byte[] arg2, byte[] arg3, byte arg4, int arg5) {
        field5353++;
        if (arg0 == 0) {
            return 0;
        } else if (arg4 == 42) {
            int var7 = 0;
            int var8 = arg0 + arg1;
            int var9 = arg5;
            while (true) {
                byte var10 = arg3[var9];
                if (var10 < 0) {
                    var7 = this.field5356[var7];
                } else {
                    var7++;
                }
                int var11;
                if ((var11 = this.field5356[var7]) < 0) {
                    arg2[arg1++] = (byte) (~var11);
                    if (arg1 >= var8) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x40) == 0) {
                    var7++;
                } else {
                    var7 = this.field5356[var7];
                }
                int var12;
                if ((var12 = this.field5356[var7]) < 0) {
                    arg2[arg1++] = (byte) (~var12);
                    if (var8 <= arg1) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x20) == 0) {
                    var7++;
                } else {
                    var7 = this.field5356[var7];
                }
                int var13;
                if ((var13 = this.field5356[var7]) < 0) {
                    arg2[arg1++] = (byte) (~var13);
                    if (var8 <= arg1) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x10) == 0) {
                    var7++;
                } else {
                    var7 = this.field5356[var7];
                }
                int var14;
                if ((var14 = this.field5356[var7]) < 0) {
                    arg2[arg1++] = (byte) (~var14);
                    if (arg1 >= var8) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x8) == 0) {
                    var7++;
                } else {
                    var7 = this.field5356[var7];
                }
                int var15;
                if ((var15 = this.field5356[var7]) < 0) {
                    arg2[arg1++] = (byte) (~var15);
                    if (var8 <= arg1) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x4) == 0) {
                    var7++;
                } else {
                    var7 = this.field5356[var7];
                }
                int var16;
                if ((var16 = this.field5356[var7]) < 0) {
                    arg2[arg1++] = (byte) (~var16);
                    if (var8 <= arg1) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x2) == 0) {
                    var7++;
                } else {
                    var7 = this.field5356[var7];
                }
                int var17;
                if ((var17 = this.field5356[var7]) < 0) {
                    arg2[arg1++] = (byte) (~var17);
                    if (arg1 >= var8) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x1) == 0) {
                    var7++;
                } else {
                    var7 = this.field5356[var7];
                }
                int var18;
                if ((var18 = this.field5356[var7]) < 0) {
                    arg2[arg1++] = (byte) (~var18);
                    if (var8 <= arg1) {
                        break;
                    }
                    var7 = 0;
                }
                var9++;
            }
            return var9 + 1 - arg5;
        } else {
            return 113;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V", line = 162)
    public static void method2168(int arg0) {
        field5347 = null;
        if (arg0 != 0) {
            method2168(-76);
        }
        field5351 = null;
        field5355 = null;
        field5350 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IZBII)V", line = 177)
    public static final void method2169(int arg0, boolean arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != 103) {
            field5351 = null;
        }
        field5352++;
        if (class161.method1094(2007241424, arg3)) {
            class315.method1947(arg4, -1, arg0, arg2 ^ 0x67, arg1, class467.field6572[arg3]);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I[BIII[B)I", line = 199)
    public final int method2170(int arg0, byte[] arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field5349++;
        if (arg4 != -14737) {
            return 92;
        }
        int var7 = 0;
        int var8 = arg0 + arg3;
        int var9 = arg2 << 3;
        while (arg0 < var8) {
            int var10 = arg5[arg0] & 0xFF;
            int var11 = this.field5354[var10];
            byte var12 = this.field5348[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg1[var13] = (byte) (var7 = class347.method2139(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg1[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var13++;
                    var14 -= 8;
                    arg1[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var13++;
                        var14 -= 8;
                        arg1[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg1[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var9 += var12;
            arg0++;
        }
        return (var9 + 7 >> 3) - arg2;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "([B)V", line = 278)
    public class351(byte[] arg0) {
        int var2 = arg0.length;
        this.field5354 = new int[var2];
        this.field5348 = arg0;
        int[] var3 = new int[33];
        this.field5356 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field5354[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class347.method2139(var11, var12);
                    }
                    var9 = var8 | var7;
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
                        if (this.field5356[var14] == 0) {
                            this.field5356[var14] = var4;
                        }
                        var14 = this.field5356[var14];
                    }
                    if (var14 >= this.field5356.length) {
                        int[] var17 = new int[this.field5356.length * 2];
                        for (int var18 = 0; var18 < this.field5356.length; var18++) {
                            var17[var18] = this.field5356[var18];
                        }
                        this.field5356 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field5356[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
