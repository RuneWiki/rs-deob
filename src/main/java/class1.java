import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class1 {

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "[B")
    private byte[] field9;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "[I")
    private int[] field6;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "[I")
    private int[] field3;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "Lea;")
    public static class243 field4 = new class243();

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "Lqj;")
    public static class196 field11 = class80.method502("null", -48);

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field8 = 0;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "Lec;")
    public static class178 field7;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "Lij;")
    public static class24 field13;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)I")
    public static final int method1(byte arg0, int arg1) {
        if (arg0 >= -45) {
            method4(-81, 27, -14, 27, -102, -56, 126, -26);
        }
        field1++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public static void method2(int arg0) {
        if (arg0 != -2) {
            method1((byte) -107, -111);
        }
        field4 = null;
        field13 = null;
        field7 = null;
        field11 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II[BB[BI)I")
    public final int method3(int arg0, int arg1, byte[] arg2, byte arg3, byte[] arg4, int arg5) {
        int var7 = arg0 + arg5;
        field12++;
        int var8 = arg1 << 3;
        int var9 = 0;
        if (arg3 <= 56) {
            field11 = null;
        }
        while (arg5 < var7) {
            int var10 = arg2[arg5] & 0xFF;
            int var11 = this.field3[var10];
            byte var12 = this.field9[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var9 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            var8 += var12;
            int var17 = var14 + 24;
            arg4[var13] = (byte) (var9 = method6(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg4[var13] = (byte) (var9 = var11 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg4[var13] = (byte) (var9 = var11 >>> var14);
                    if (var13 < var16) {
                        var13++;
                        var14 -= 8;
                        arg4[var13] = (byte) (var9 = var11 >>> var14);
                        if (var16 > var13) {
                            var14 -= 8;
                            var13++;
                            arg4[var13] = (byte) (var9 = var11 << -var14);
                        }
                    }
                }
            }
            arg5++;
        }
        return (var8 + 7 >> 3) - arg1;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method4(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        class175 var8 = new class175();
        var8.field2955 = arg2 / 128;
        var8.field2961 = arg3 / 128;
        var8.field2953 = arg4 / 128;
        var8.field2958 = arg5 / 128;
        var8.field2963 = arg1;
        var8.field2942 = arg2;
        var8.field2948 = arg3;
        var8.field2950 = arg4;
        var8.field2960 = arg5;
        var8.field2954 = arg6;
        var8.field2952 = arg7;
        class61.field811[arg0][class61.field813[arg0]++] = var8;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
    public static final void method5(int arg0) {
        for (int var1 = 0; var1 < class63.field863; var1++) {
            int var2 = class188.field3295[var1];
            class164 var3 = class153.field2482[var2];
            if (var3 != null) {
                class67.method431(113, var3, var3.field2648.field1599);
            }
        }
        field2++;
        if (arg0 <= 70) {
            method4(-32, 22, -97, 117, -104, -95, 81, 11);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)I")
    public static int method6(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "([B)V")
    public class1(byte[] arg0) {
        int var2 = arg0.length;
        this.field9 = arg0;
        this.field6 = new int[8];
        int[] var3 = new int[33];
        this.field3 = new int[var2];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field3[var5] = var8;
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
                        var3[var10] = method6(var12, var11);
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
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field6[var14] == 0) {
                            this.field6[var14] = var4;
                        }
                        var14 = this.field6[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field6.length <= var14) {
                        int[] var18 = new int[this.field6.length * 2];
                        for (int var19 = 0; var19 < this.field6.length; var19++) {
                            var18[var19] = this.field6[var19];
                        }
                        this.field6 = var18;
                    }
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field6[var14] = ~var5;
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I[BIIB[B)I")
    public final int method7(int arg0, byte[] arg1, int arg2, int arg3, byte arg4, byte[] arg5) {
        field5++;
        if (arg0 == 0) {
            return 0;
        }
        int var7 = arg0 + arg3;
        if (arg4 != -101) {
            return 92;
        }
        int var8 = 0;
        int var9 = arg2;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field6[var8];
            }
            int var11;
            if ((var11 = this.field6[var8]) < 0) {
                arg1[arg3++] = (byte) ~var11;
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field6[var8];
            }
            int var12;
            if ((var12 = this.field6[var8]) < 0) {
                arg1[arg3++] = (byte) ~var12;
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field6[var8];
            }
            int var13;
            if ((var13 = this.field6[var8]) < 0) {
                arg1[arg3++] = (byte) ~var13;
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field6[var8];
            }
            int var14;
            if ((var14 = this.field6[var8]) < 0) {
                arg1[arg3++] = (byte) ~var14;
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field6[var8];
            }
            int var15;
            if ((var15 = this.field6[var8]) < 0) {
                arg1[arg3++] = (byte) ~var15;
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field6[var8];
            }
            int var16;
            if ((var16 = this.field6[var8]) < 0) {
                arg1[arg3++] = (byte) ~var16;
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field6[var8];
            }
            int var17;
            if ((var17 = this.field6[var8]) < 0) {
                arg1[arg3++] = (byte) ~var17;
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field6[var8];
            }
            int var18;
            if ((var18 = this.field6[var8]) < 0) {
                arg1[arg3++] = (byte) ~var18;
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg2;
    }
}
