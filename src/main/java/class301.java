import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class301 {

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "[I")
    private int[] field4798;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "[I")
    private int[] field4804;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "[B")
    private byte[] field4801;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field4799 = new String[200];

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II[BI[BI)I")
    public final int method2024(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        field4805++;
        if (arg3 == 0) {
            return 0;
        }
        int var7 = arg0 + arg3;
        int var8 = arg5;
        int var9 = arg1;
        while (true) {
            byte var10 = arg2[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field4798[var8];
            }
            int var11;
            if ((var11 = this.field4798[var8]) < 0) {
                arg4[arg0++] = (byte) (~var11);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field4798[var8];
            }
            int var12;
            if ((var12 = this.field4798[var8]) < 0) {
                arg4[arg0++] = (byte) (~var12);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field4798[var8];
            }
            int var13;
            if ((var13 = this.field4798[var8]) < 0) {
                arg4[arg0++] = (byte) (~var13);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field4798[var8];
            }
            int var14;
            if ((var14 = this.field4798[var8]) < 0) {
                arg4[arg0++] = (byte) (~var14);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field4798[var8];
            }
            int var15;
            if ((var15 = this.field4798[var8]) < 0) {
                arg4[arg0++] = (byte) (~var15);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field4798[var8];
            }
            int var16;
            if ((var16 = this.field4798[var8]) < 0) {
                arg4[arg0++] = (byte) (~var16);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field4798[var8];
            }
            int var17;
            if ((var17 = this.field4798[var8]) < 0) {
                arg4[arg0++] = (byte) (~var17);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field4798[var8];
            }
            int var18;
            if ((var18 = this.field4798[var8]) < 0) {
                arg4[arg0++] = (byte) (~var18);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 - (arg1 - 1);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIII)V")
    public static final void method2025(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class182 var5 = (class182) class38.field464.method1064(arg1, (long) arg0);
        if (var5 == null) {
            var5 = new class182();
            class38.field464.method1054(-3510, var5, (long) arg0);
        }
        if (arg4 >= var5.field2864.length) {
            int[] var6 = new int[arg4 + 1];
            int[] var7 = new int[arg4 + 1];
            for (int var8 = 0; var8 < var5.field2864.length; var8++) {
                var7[var8] = var5.field2864[var8];
                var6[var8] = var5.field2866[var8];
            }
            for (int var9 = var5.field2864.length; var9 < arg4; var9++) {
                var7[var9] = -1;
                var6[var9] = 0;
            }
            var5.field2864 = var7;
            var5.field2866 = var6;
        }
        field4803++;
        var5.field2864[arg4] = arg3;
        var5.field2866[arg4] = arg2;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    public static void method2026(int arg0) {
        int var1 = 36 / ((60 - arg0) / 37);
        field4799 = null;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "([B)V")
    public class301(byte[] arg0) {
        int var2 = arg0.length;
        this.field4798 = new int[8];
        this.field4804 = new int[var2];
        this.field4801 = arg0;
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field4804[var5] = var8;
                int var12;
                if ((var7 & var8) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var3[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var10 & var11) != 0) {
                            var3[var9] = var3[var9 - 1];
                            break;
                        }
                        var3[var9] = class243.method1723(var11, var10);
                    }
                    var12 = var8 | var7;
                } else {
                    var12 = var3[var6 - 1];
                }
                var3[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field4798[var14] == 0) {
                            this.field4798[var14] = var4;
                        }
                        var14 = this.field4798[var14];
                    }
                    if (this.field4798.length <= var14) {
                        int[] var17 = new int[this.field4798.length * 2];
                        for (int var18 = 0; var18 < this.field4798.length; var18++) {
                            var17[var18] = this.field4798[var18];
                        }
                        this.field4798 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field4798[var14] = ~var5;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III[B[BI)I")
    public final int method2027(int arg0, int arg1, int arg2, byte[] arg3, byte[] arg4, int arg5) {
        if (arg0 != 699173731) {
            method2028(-62);
        }
        field4802++;
        int var7 = arg1 + arg5;
        int var8 = 0;
        int var9 = arg2 << 3;
        while (var7 > arg5) {
            int var10 = arg3[arg5] & 0xFF;
            int var11 = this.field4804[var10];
            byte var12 = this.field4801[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var8 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            var9 += var12;
            int var17 = var14 + 24;
            arg4[var13] = (byte) (var8 = class243.method1723(var15, var11 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg4[var13] = (byte) (var8 = var11 >>> var14);
                if (var16 > var13) {
                    var13++;
                    var14 -= 8;
                    arg4[var13] = (byte) (var8 = var11 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg4[var13] = (byte) (var8 = var11 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg4[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            arg5++;
        }
        return (var9 + 7 >> 3) - arg2;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)Lgl;")
    public static final class181 method2028(int arg0) {
        field4800++;
        class181 var1 = (class181) class220.field3455.method1146(-51);
        if (var1 != null) {
            var1.method1764(64);
            var1.method378((byte) -111);
            return var1;
        } else if (arg0 > -7) {
            return null;
        } else {
            class181 var2;
            do {
                var2 = (class181) class196.field3101.method1146(-72);
                if (var2 == null) {
                    return null;
                }
                if (var2.method1288(-11701) > class98.method665(true)) {
                    return null;
                }
                var2.method1764(64);
                var2.method378((byte) -117);
            } while ((Long.MIN_VALUE & var2.field874) == 0L);
            return var2;
        }
    }
}
