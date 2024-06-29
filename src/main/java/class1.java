import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class1 {

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "Lmc;")
    public class184 field8 = new class184();

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "Lsf;")
    public static class108 field6 = class140.method973(255, " ");

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "Lsf;")
    public static class108 field13 = class140.method973(255, "compass");

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "Z")
    public static boolean field7 = false;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "I")
    public static int field19 = 0;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "Lsf;")
    private static class108 field2 = class140.method973(255, "wishes to trade with you)3");

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "Z")
    public static boolean field18 = false;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "Lsf;")
    public static class108 field21 = field2;

    @OriginalMember(owner = "client!aj", name = "z", descriptor = "I")
    public static int field26 = 0;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!aj", name = "y", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "Lmc;")
    private class184 field24;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "Lik;")
    public static class262 field16;

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "Lik;")
    public static class262 field23;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)Lmc;", line = 6)
    public final class184 method1(int arg0) {
        field4++;
        int var2 = 74 / ((-arg0 - 69) / 52);
        class184 var3 = this.field24;
        if (this.field8 == var3) {
            this.field24 = null;
            return null;
        } else {
            this.field24 = var3.field3376;
            return var3;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V", line = 36)
    public static final void method2(boolean arg0) {
        if (arg0) {
            class99.field1759 = class206.field3701;
            class278.field4883 = class105.field1819;
            class36.field499 = class200.field3623;
        } else {
            class99.field1759 = class303.field5269;
            class278.field4883 = class104.field1809;
            class36.field499 = class295.field5149;
        }
        class60.field893 = class99.field1759.length;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V", line = 58)
    public static final void method3(byte arg0) {
        class259.field4572 = 0;
        class312.field5400 = 0;
        class16.method103(-5580);
        field15++;
        class94.method638(0);
        class96.method659(true);
        class92.method623((byte) 26);
        for (int var1 = 0; var1 < class259.field4572; var1++) {
            int var2 = class26.field409[var1];
            if (class116.field2000 != class96.field1558[var2].field4459) {
                if (class96.field1558[var2].field753 > 0) {
                    class274.method1982((byte) 37, class96.field1558[var2]);
                }
                class96.field1558[var2] = null;
            }
        }
        if (arg0 < 123) {
            return;
        }
        if (class191.field3471 != class293.field5127.field4314) {
            throw new RuntimeException("gpp1 pos:" + class293.field5127.field4314 + " psize:" + class191.field3471);
        }
        for (int var3 = 0; var3 < class43.field569; var3++) {
            if (class96.field1558[class194.field3511[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class43.field569);
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II[Lsf;B)Lsf;", line = 111)
    public static final class108 method4(int arg0, int arg1, class108[] arg2, byte arg3) {
        field17++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg1; var5++) {
            if (arg2[arg0 + var5] == null) {
                arg2[arg0 + var5] = class167.field3014;
            }
            var4 += arg2[arg0 + var5].field1870;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg1; var8++) {
            class108 var9 = arg2[arg0 + var8];
            class23.method156(var9.field1884, 0, var6, var7, var9.field1870);
            var7 += var9.field1870;
        }
        if (arg3 <= 30) {
            method7((byte) -30);
        }
        class108 var10 = new class108();
        var10.field1870 = var4;
        var10.field1884 = var6;
        return var10;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lmc;B)V", line = 160)
    public final void method5(class184 arg0, byte arg1) {
        field3++;
        if (arg0.field3376 != null) {
            arg0.method1325(0);
        }
        arg0.field3373 = this.field8;
        arg0.field3376 = this.field8.field3376;
        arg0.field3376.field3373 = arg0;
        int var3 = 53 % ((arg1 + 63) / 47);
        arg0.field3373.field3376 = arg0;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V", line = 184)
    public static final void method6(int arg0) {
        if (arg0 != 0) {
            return;
        }
        if (class324.field5528 == 2) {
            if (class184.field3382 == class134.field2314 && class261.field4604 == class195.field3537) {
                class324.field5528 = 0;
                if (class92.field1450 && class144.field2529[81] && class311.field5374 > 2) {
                    class92.method616(arg0 ^ 0x3B, class311.field5374 - 2);
                } else {
                    class92.method616(31, class311.field5374 - 1);
                }
            }
        } else if (class87.field1382 == class184.field3382 && class195.field3537 == class170.field3041) {
            class324.field5528 = 0;
            if (class92.field1450 && class144.field2529[81] && class311.field5374 > 2) {
                class92.method616(45, class311.field5374 - 2);
            } else {
                class92.method616(75, class311.field5374 - 1);
            }
        } else {
            class134.field2314 = class87.field1382;
            class261.field4604 = class170.field3041;
            class324.field5528 = 2;
        }
        field1++;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)V", line = 240)
    public static void method7(byte arg0) {
        if (arg0 != 35) {
            return;
        }
        field13 = null;
        field23 = null;
        field6 = null;
        field21 = null;
        field2 = null;
        field16 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILca;II)V", line = 261)
    public static final void method8(int arg0, class98 arg1, int arg2, int arg3) {
        field25++;
        if (arg1.field1563 == 0) {
            arg1.field1730 = arg1.field1727;
        } else if (arg1.field1563 == 1) {
            arg1.field1730 = (arg3 - arg1.field1673) / 2 + arg1.field1727;
        } else if (arg1.field1563 == 2) {
            arg1.field1730 = arg3 - arg1.field1673 - arg1.field1727;
        } else if (arg1.field1563 == 3) {
            arg1.field1730 = arg1.field1727 * arg3 >> 14;
        } else if (arg1.field1563 == 4) {
            arg1.field1730 = (arg3 - arg1.field1673) / 2 + (arg1.field1727 * arg3 >> 14);
        } else {
            arg1.field1730 = arg3 - (arg1.field1727 * arg3 >> 14) - arg1.field1673;
        }
        if (arg1.field1651 == 0) {
            arg1.field1590 = arg1.field1710;
        } else if (arg1.field1651 == 1) {
            arg1.field1590 = (arg0 - arg1.field1688) / 2 + arg1.field1710;
        } else if (arg1.field1651 == 2) {
            arg1.field1590 = arg0 - arg1.field1688 - arg1.field1710;
        } else if (arg1.field1651 == 3) {
            arg1.field1590 = arg1.field1710 * arg0 >> 14;
        } else if (arg1.field1651 == 4) {
            arg1.field1590 = (arg1.field1710 * arg0 >> 14) + (arg0 - arg1.field1688) / 2;
        } else {
            arg1.field1590 = arg0 - arg1.field1688 - (arg1.field1710 * arg0 >> 14);
        }
        if (arg2 < 40) {
            field10 = 54;
        }
        if (!class46.field673 || !(client.method1815(arg1) != 0 || arg1.field1677 == 0)) {
            return;
        }
        if (arg1.field1590 < 0) {
            arg1.field1590 = 0;
        } else if (arg0 < (arg1.field1688 + arg1.field1590)) {
            arg1.field1590 = arg0 - arg1.field1688;
        }
        if (arg1.field1730 < 0) {
            arg1.field1730 = 0;
        } else if ((arg1.field1730 + arg1.field1673) > arg3) {
            arg1.field1730 = arg3 - arg1.field1673;
        }
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(B)V", line = 333)
    public final void method9(byte arg0) {
        if (arg0 >= -84) {
            this.method1(-78);
        }
        while (true) {
            class184 var2 = this.field8.field3373;
            if (this.field8 == var2) {
                this.field24 = null;
                field5++;
                return;
            }
            var2.method1325(0);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II[[FLfk;[ILsb;[[F[[II[[FI)V", line = 354)
    public static final void method10(int arg0, int arg1, float[][] arg2, class46 arg3, int[] arg4, class111 arg5, float[][] arg6, int[][] arg7, int arg8, float[][] arg9, int arg10) {
        field11++;
        if (arg0 <= 24) {
            return;
        }
        int[] var11 = new int[arg4.length / 2];
        for (int var12 = 0; var12 < var11.length; var12++) {
            int var13 = arg4[var12 + var12];
            int var14 = arg4[var12 - (-var12 - 1)];
            if (arg8 == 1) {
                int var16 = var13;
                var13 = var14;
                var14 = 128 - var16;
            } else if (arg8 == 2) {
                var13 = 128 - var13;
                var14 = 128 - var14;
            } else if (arg8 == 3) {
                int var15 = var13;
                var13 = 128 - var14;
                var14 = var15;
            }
            float var17;
            float var18;
            float var19;
            if (var13 == 0 && var14 == 0) {
                var17 = arg2[arg1][arg10];
                var18 = arg6[arg1][arg10];
                var19 = arg9[arg1][arg10];
            } else if (var13 == 128 && var14 == 0) {
                var19 = arg9[arg1 + 1][arg10];
                var18 = arg6[arg1 + 1][arg10];
                var17 = arg2[arg1 + 1][arg10];
            } else if (var13 == 128 && var14 == 128) {
                var18 = arg6[arg1 + 1][arg10 + 1];
                var19 = arg9[arg1 + 1][arg10 + 1];
                var17 = arg2[arg1 + 1][arg10 + 1];
            } else if (var13 == 0 && var14 == 128) {
                var17 = arg2[arg1][arg10 + 1];
                var18 = arg6[arg1][arg10 + 1];
                var19 = arg9[arg1][arg10 + 1];
            } else {
                float var20 = arg6[arg1][arg10];
                float var21 = arg2[arg1][arg10];
                float var22 = (float) var13 / 128.0F;
                float var23 = arg9[arg1][arg10];
                float var24 = (arg2[arg1 + 1][arg10] - var21) * var22 + var21;
                float var25 = (float) var14 / 128.0F;
                float var26 = (arg6[arg1 + 1][arg10] - var20) * var22 + var20;
                float var27 = arg2[arg1][arg10 + 1];
                float var28 = arg6[arg1][arg10 + 1];
                float var29 = (arg2[arg1 + 1][arg10 + 1] - var27) * var22 + var27;
                float var30 = (arg6[arg1 + 1][arg10 + 1] - var28) * var22 + var28;
                var17 = (var29 - var24) * var25 + var24;
                var18 = (var30 - var26) * var25 + var26;
                float var31 = arg9[arg1][arg10 + 1];
                float var32 = (arg9[arg1 + 1][arg10] - var23) * var22 + var23;
                float var33 = (arg9[arg1 + 1][arg10 + 1] - var31) * var22 + var31;
                var19 = (var33 - var32) * var25 + var32;
            }
            int var34 = (arg1 << 7) + var13;
            int var35 = class220.method1513(-16244, arg1, var13, var14, arg10, arg7);
            int var36 = (arg10 << 7) + var14;
            var11[var12] = arg5.method800(arg3, var34, var35, var36, var19, var18, var17);
        }
        arg5.method803(var11);
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(B)Lmc;", line = 475)
    public final class184 method11(byte arg0) {
        if (arg0 < 44) {
            return (class184) null;
        }
        class184 var2 = this.field8.field3376;
        field14++;
        if (this.field8 == var2) {
            this.field24 = null;
            return null;
        } else {
            this.field24 = var2.field3376;
            return var2;
        }
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)Lmc;", line = 496)
    public final class184 method12(int arg0) {
        field22++;
        class184 var2 = this.field8.field3373;
        if (this.field8 == var2) {
            return null;
        }
        if (arg0 <= 46) {
            field23 = (class262) null;
        }
        var2.method1325(0);
        return var2;
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(I)Lmc;", line = 515)
    public final class184 method13(int arg0) {
        field9++;
        class184 var2 = this.field8.field3373;
        if (this.field8 == var2) {
            this.field24 = null;
            return null;
        } else if (arg0 == 0) {
            this.field24 = var2.field3373;
            return var2;
        } else {
            return (class184) null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V", line = 611)
    public class1() {
        this.field8.field3373 = this.field8;
        this.field8.field3376 = this.field8;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BLmc;)V", line = 561)
    public final void method14(byte arg0, class184 arg1) {
        field12++;
        if (arg1.field3376 != null) {
            arg1.method1325(0);
        }
        if (arg0 >= 66) {
            arg1.field3373 = this.field8.field3373;
            arg1.field3376 = this.field8;
            arg1.field3376.field3373 = arg1;
            arg1.field3373.field3376 = arg1;
        }
    }

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "(B)Lmc;", line = 583)
    public final class184 method15(byte arg0) {
        class184 var2 = this.field24;
        field20++;
        if (arg0 != 47) {
            return (class184) null;
        } else if (this.field8 == var2) {
            this.field24 = null;
            return null;
        } else {
            this.field24 = var2.field3373;
            return var2;
        }
    }
}
