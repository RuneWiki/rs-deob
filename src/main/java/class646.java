import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class646 {

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "[B")
    private byte[] field9304;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "[I")
    private int[] field9301;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "[I")
    private int[] field9309;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field9300 = 0;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "Lqfa;")
    public static class85 field9310 = new class85(105, 12);

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "Lsb;")
    public static class266 field9311 = new class266(4, 6);

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field9302;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field9303;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public static int field9305;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public static int field9306;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    public static int field9307;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public static int field9308;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IBI)V")
    public static final void method3683(int arg0, byte arg1, int arg2) {
        field9308++;
        if (arg1 != -3) {
            field9310 = null;
        }
        class19 var3 = class373.method2355(arg1 + 85, arg0, 14);
        var3.method432(86);
        var3.field829 = arg2;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(III[B[BI)I")
    public final int method3684(int arg0, int arg1, int arg2, byte[] arg3, byte[] arg4, int arg5) {
        field9305++;
        if (arg5 == 0) {
            return 0;
        }
        if (arg0 != 8) {
            field9300 = -103;
        }
        int var7 = 0;
        int var8 = arg2 + arg5;
        int var9 = arg1;
        while (true) {
            byte var10 = arg3[var9];
            if (var10 < 0) {
                var7 = this.field9309[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field9309[var7]) < 0) {
                arg4[arg2++] = (byte) (~var11);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field9309[var7];
            }
            int var12;
            if ((var12 = this.field9309[var7]) < 0) {
                arg4[arg2++] = (byte) (~var12);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field9309[var7];
            }
            int var13;
            if ((var13 = this.field9309[var7]) < 0) {
                arg4[arg2++] = (byte) (~var13);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field9309[var7];
            }
            int var14;
            if ((var14 = this.field9309[var7]) < 0) {
                arg4[arg2++] = (byte) (~var14);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field9309[var7];
            }
            int var15;
            if ((var15 = this.field9309[var7]) < 0) {
                arg4[arg2++] = (byte) (~var15);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field9309[var7];
            }
            int var16;
            if ((var16 = this.field9309[var7]) < 0) {
                arg4[arg2++] = (byte) (~var16);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field9309[var7];
            }
            int var17;
            if ((var17 = this.field9309[var7]) < 0) {
                arg4[arg2++] = (byte) (~var17);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field9309[var7];
            }
            int var18;
            if ((var18 = this.field9309[var7]) < 0) {
                arg4[arg2++] = (byte) (~var18);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg1;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3685(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9307++;
        if (arg1 != 20052) {
            return;
        }
        if (arg2 - arg5 >= class704.field9911 && class379.field5612 >= arg2 + arg5 && class309.field4556 <= arg3 - arg5 && arg3 + arg5 <= client.field4115) {
            class323.method2092(arg2, arg6, arg0, arg3, arg4, (byte) -3, arg5);
        } else {
            class86.method861(arg2, arg3, arg6, arg5, arg0, (byte) -125, arg4);
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(III[B[BI)I")
    public final int method3686(int arg0, int arg1, int arg2, byte[] arg3, byte[] arg4, int arg5) {
        field9303++;
        if (arg2 != -12135) {
            field9310 = null;
        }
        int var7 = 0;
        int var8 = arg0 << 3;
        int var9 = arg1 + arg5;
        while (var9 > arg5) {
            int var10 = arg4[arg5] & 0xFF;
            int var11 = this.field9301[var10];
            byte var12 = this.field9304[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg3[var13] = (byte) (var7 = class2.method189(var15, var11 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg3[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var13++;
                    var14 -= 8;
                    arg3[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg3[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg3[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var8 += var12;
            arg5++;
        }
        return (var8 + 7 >> 3) - arg0;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)V")
    public static final void method3687(boolean arg0) {
        if (!arg0) {
            method3683(-35, (byte) 116, 17);
        }
        for (class300 var1 = (class300) class126.field2292.method1224(-2); var1 != null; var1 = (class300) class126.field2292.method1232(-2)) {
            if (class10.method281(var1.field4465, true)) {
                class89.method872((byte) 26, var1);
            }
        }
        field9306++;
        if (class481.field6904 == 1) {
            class679.method3819(22);
            return;
        }
        class521.method3066(class337.field5033, class640.field9206, (byte) 86, class134.field2391, class43.field1086);
        int var2 = class141.field2478.method286(class265.field3899.method1733(255, class140.field2466), -5113);
        for (class300 var3 = (class300) class126.field2292.method1224(-2); var3 != null; var3 = (class300) class126.field2292.method1232(-2)) {
            int var4 = class103.method960(var3, (byte) 40);
            if (var4 > var2) {
                var2 = var4;
            }
        }
        class337.field5033 = class481.field6904 * 16 + (class163.field2740 ? 26 : 22);
        class134.field2391 = var2 + 8;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
    public static void method3688(int arg0) {
        field9310 = null;
        if (arg0 >= -116) {
            field9300 = -43;
        }
        field9311 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IILmu;ZI)V")
    public static final void method3689(int arg0, int arg1, class275 arg2, boolean arg3, int arg4) {
        arg2.field4103.method715(arg1, 1949991176);
        field9302++;
        arg2.field4103.method709(arg0, -104);
        arg2.field4103.method709(arg4, -110);
        if (!arg3) {
            field9310 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "([B)V")
    public class646(byte[] arg0) {
        int var2 = arg0.length;
        this.field9304 = arg0;
        this.field9301 = new int[var2];
        this.field9309 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field9301[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
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
                        var3[var10] = class2.method189(var11, var12);
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
                        if (this.field9309[var14] == 0) {
                            this.field9309[var14] = var4;
                        }
                        var14 = this.field9309[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field9309.length) {
                        int[] var18 = new int[this.field9309.length * 2];
                        for (int var19 = 0; var19 < this.field9309.length; var19++) {
                            var18[var19] = this.field9309[var19];
                        }
                        this.field9309 = var18;
                    }
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field9309[var14] = ~var5;
            }
        }
    }
}
