import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public abstract class class739 extends class168 {

    @OriginalMember(owner = "client!au", name = "l", descriptor = "Z")
    public boolean field10297;

    @OriginalMember(owner = "client!au", name = "C", descriptor = "[Lau;")
    public class739[] field10314;

    @OriginalMember(owner = "client!au", name = "D", descriptor = "I")
    public static int field10315 = 0;

    @OriginalMember(owner = "client!au", name = "j", descriptor = "I")
    public static int field10295;

    @OriginalMember(owner = "client!au", name = "k", descriptor = "I")
    public int field10296;

    @OriginalMember(owner = "client!au", name = "m", descriptor = "I")
    public static int field10298;

    @OriginalMember(owner = "client!au", name = "n", descriptor = "I")
    public static int field10299;

    @OriginalMember(owner = "client!au", name = "o", descriptor = "I")
    public static int field10300;

    @OriginalMember(owner = "client!au", name = "p", descriptor = "I")
    public static int field10301;

    @OriginalMember(owner = "client!au", name = "q", descriptor = "I")
    public static int field10302;

    @OriginalMember(owner = "client!au", name = "s", descriptor = "I")
    public static int field10304;

    @OriginalMember(owner = "client!au", name = "t", descriptor = "I")
    public static int field10305;

    @OriginalMember(owner = "client!au", name = "u", descriptor = "I")
    public static int field10306;

    @OriginalMember(owner = "client!au", name = "w", descriptor = "I")
    public static int field10308;

    @OriginalMember(owner = "client!au", name = "x", descriptor = "I")
    public static int field10309;

    @OriginalMember(owner = "client!au", name = "y", descriptor = "I")
    public static int field10310;

    @OriginalMember(owner = "client!au", name = "B", descriptor = "I")
    public static int field10313;

    @OriginalMember(owner = "client!au", name = "z", descriptor = "Luia;")
    public class366 field10311;

    @OriginalMember(owner = "client!au", name = "A", descriptor = "Ldda;")
    public class385 field10312;

    @OriginalMember(owner = "client!au", name = "r", descriptor = "Lha;")
    public static class60 field10303;

    @OriginalMember(owner = "client!au", name = "v", descriptor = "[[I")
    public static int[][] field10307;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)I", line = 5)
    public int method3336(int arg0) {
        if (arg0 != -1) {
            this.field10296 = 126;
        }
        field10306++;
        return -1;
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(I)V", line = 16)
    public static void method4114(int arg0) {
        field10303 = null;
        if (arg0 > -97) {
            field10315 = -73;
        }
        field10307 = null;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Z)V", line = 28)
    public void method1886(boolean arg0) {
        field10305++;
        if (this.field10297) {
            this.field10311.method2117(0);
            this.field10311 = null;
        } else {
            this.field10312.method2192(-89);
            this.field10312 = null;
        }
        if (arg0) {
            this.field10297 = false;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(BII)V", line = 57)
    public void method3338(byte arg0, int arg1, int arg2) {
        field10302++;
        int var4 = this.field10296 == 255 ? arg2 : this.field10296;
        if (this.field10297) {
            this.field10311 = new class366(var4, arg2, arg1);
        } else {
            this.field10312 = new class385(var4, arg2, arg1);
        }
        if (arg0 != -66) {
            this.method4119(-26, -5, 92);
        }
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(III)[I", line = 84)
    public final int[] method4115(int arg0, int arg1, int arg2) {
        field10298++;
        if (arg0 >= -114) {
            return null;
        } else if (this.field10314[arg2].field10297) {
            return this.field10314[arg2].method215(-23347, arg1);
        } else {
            return this.field10314[arg2].method223((byte) 57, arg1)[0];
        }
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(Z)I", line = 106)
    public int method1889(boolean arg0) {
        field10309++;
        if (arg0) {
            this.method215(109, -39);
        }
        return -1;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Lr;III[Z)Z", line = 118)
    public static final boolean method4116(class185 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class395.field5009 != class195.field2669) {
            int var6 = class707.field9826[arg1].method1676(arg2, true, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class282 var8 = class707.field9826[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method1676(arg2, true, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method1675(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method1684(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Lsl;II)V", line = 154)
    public void method214(class461 arg0, int arg1, int arg2) {
        field10299++;
        if (arg2 != -3) {
            method4120(true);
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Lrba;IIIII)V", line = 174)
    public static final void method4117(class435 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class29.field515 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class289.field3784) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class463.field6223 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class14 var14 = class197.field2689[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class195.field2669[var11].method1677(var13, (byte) 39, var12) + class195.field2669[var11].method1677(var13, (byte) 17, var12 + 1) + class195.field2669[var11].method1677(var13 + 1, (byte) 94, var12) + class195.field2669[var11].method1677(var13 + 1, (byte) 99, var12 + 1)) / 4 - (class195.field2669[arg1].method1677(arg3, (byte) 41, arg2) + class195.field2669[arg1].method1677(arg3, (byte) 78, arg2 + 1) + class195.field2669[arg1].method1677(arg3 + 1, (byte) 53, arg2) + class195.field2669[arg1].method1677(arg3 + 1, (byte) 86, arg2 + 1)) / 4;
                                    class374 var16 = var14.field278;
                                    class374 var17 = var14.field283;
                                    if (var16 != null && var16.method759(0)) {
                                        arg0.method754(30558, var15, var16, class681.field9504, var6, (var13 - arg3) * class699.field9729 + (1 - arg5) * class139.field1991, (var12 - arg2) * class699.field9729 + (1 - arg4) * class139.field1991);
                                    }
                                    if (var17 != null && var17.method759(0)) {
                                        arg0.method754(30558, var15, var17, class681.field9504, var6, (var13 - arg3) * class699.field9729 + (1 - arg5) * class139.field1991, (var12 - arg2) * class699.field9729 + (1 - arg4) * class139.field1991);
                                    }
                                    for (class621 var18 = var14.field289; var18 != null; var18 = var18.field8560) {
                                        class556 var19 = var18.field8559;
                                        if (var19 != null && var19.method759(0) && (var19.field7734 == var12 || var7 == var12) && (var19.field7746 == var13 || var9 == var13)) {
                                            int var20 = var19.field7741 + 1 - var19.field7734;
                                            int var21 = var19.field7744 + 1 - var19.field7746;
                                            arg0.method754(30558, var15, var19, class681.field9504, var6, (var19.field7746 - arg3) * class699.field9729 + (var21 - arg5) * class139.field1991, (var19.field7734 - arg2) * class699.field9729 + (var20 - arg4) * class139.field1991);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IILnd;I)Ljl;", line = 262)
    public static final class274 method4118(int arg0, int arg1, class547 arg2, int arg3) {
        field10300++;
        if (arg3 == -1072) {
            byte[] var4 = arg2.method3153(arg1, 0, arg0);
            return var4 == null ? null : new class274(var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!au", name = "c", descriptor = "(III)[[I", line = 281)
    public final int[][] method4119(int arg0, int arg1, int arg2) {
        field10304++;
        if (arg0 != 2) {
            this.method214(null, 111, -56);
        }
        if (this.field10314[arg1].field10297) {
            int[] var4 = this.field10314[arg1].method215(arg0 ^ 0xFFFFA4CF, arg2);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field10314[arg1].method223((byte) 41, arg2);
        }
    }

    @OriginalMember(owner = "client!au", name = "c", descriptor = "(Z)V", line = 315)
    public static final void method4120(boolean arg0) {
        class198.method1308(false, (byte) 29);
        field10301++;
        class4.field38 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class385.field4921.length; var2++) {
            if (class222.field2975[var2] != -1 && class385.field4921[var2] == null) {
                class385.field4921[var2] = class238.field3094.method3153(0, 0, class222.field2975[var2]);
                if (class385.field4921[var2] == null) {
                    var1 = false;
                    class4.field38++;
                }
            }
            if (class480.field6528[var2] != -1 && class412.field5243[var2] == null) {
                class412.field5243[var2] = class238.field3094.method3183(true, class480.field6528[var2], 0, field10307[var2]);
                if (class412.field5243[var2] == null) {
                    class4.field38++;
                    var1 = false;
                }
            }
            if (class731.field10169[var2] != -1 && class273.field3430[var2] == null) {
                class273.field3430[var2] = class238.field3094.method3153(0, 0, class731.field10169[var2]);
                if (class273.field3430[var2] == null) {
                    class4.field38++;
                    var1 = false;
                }
            }
            if (class393.field4990[var2] != -1 && class256.field3258[var2] == null) {
                class256.field3258[var2] = class238.field3094.method3153(0, 0, class393.field4990[var2]);
                if (class256.field3258[var2] == null) {
                    class4.field38++;
                    var1 = false;
                }
            }
            if (class470.field6312 != null && class33.field545[var2] == null && class470.field6312[var2] != -1) {
                class33.field545[var2] = class238.field3094.method3183(!arg0, class470.field6312[var2], 0, field10307[var2]);
                if (class33.field545[var2] == null) {
                    var1 = false;
                    class4.field38++;
                }
            }
        }
        if (class583.field8162 == null) {
            if (class678.field9471 == null || !class55.field758.method3169(0, class678.field9471.field6968 + "_staticelements")) {
                class583.field8162 = new class76(0);
            } else if (class55.field758.method3156(!arg0, class678.field9471.field6968 + "_staticelements")) {
                class583.field8162 = class607.method3418(class258.field3268, true, class678.field9471.field6968 + "_staticelements", class55.field758);
            } else {
                class4.field38++;
                var1 = false;
            }
        }
        if (!var1) {
            class575.field8090 = 1;
            return;
        }
        boolean var3 = true;
        class628.field8657 = 0;
        for (int var4 = 0; var4 < class385.field4921.length; var4++) {
            byte[] var21 = class412.field5243[var4];
            if (var21 != null) {
                int var22 = (class201.field2708[var4] >> 8) * 64 - class332.field4232;
                int var23 = (class201.field2708[var4] & 0xFF) * 64 - class447.field5936;
                if (class547.field7642 != 0) {
                    var23 = 10;
                    var22 = 10;
                }
                var3 &= class238.method1490(class409.field5183, var21, false, var23, class543.field7597, var22);
            }
            byte[] var24 = class256.field3258[var4];
            if (var24 != null) {
                int var25 = (class201.field2708[var4] >> 8) * 64 - class332.field4232;
                int var26 = (class201.field2708[var4] & 0xFF) * 64 - class447.field5936;
                if (class547.field7642 != 0) {
                    var26 = 10;
                    var25 = 10;
                }
                var3 &= class238.method1490(class409.field5183, var24, arg0, var26, class543.field7597, var25);
            }
        }
        if (!var3) {
            class575.field8090 = 2;
            return;
        }
        if (class575.field8090 != 0) {
            class163.method1139(class372.field4774, class386.field4930, 101, true, class697.field9708, class454.field6015.method2547(-65, class243.field3143) + "<br>(100%)");
        }
        class14.method102(true);
        class660.method3714(0);
        class382.method2173(-11715);
        boolean var5 = false;
        if (class386.field4930.method482() && class748.field10451.field10414.method2470((byte) -71) == 2) {
            for (int var6 = 0; var6 < class385.field4921.length; var6++) {
                if (class256.field3258[var6] != null || class273.field3430[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class748.field10451.field10418.method3928((byte) 57) == 1) {
            var7 = class654.field9102[class71.field999];
        } else {
            var7 = class172.field2370[class71.field999];
        }
        if (class386.field4930.method526()) {
            var7++;
        }
        class762.method4233(class386.field4930, class306.field4039, 9, 4, class409.field5183, class543.field7597, var7, var5, class386.field4930.method436() > 0);
        class685.method3851(class566.field7947);
        if (class566.field7947 == 0) {
            class142.method1030(null);
        } else {
            class142.method1030(class164.field2272);
        }
        for (int var8 = 0; var8 < 4; var8++) {
            class526.field7350[var8].method2253(true);
        }
        class387.method2199(-1);
        class94.method765(false, 100);
        class299.method1789((byte) 69);
        class1.field4 = null;
        class38.field592 = false;
        class14.method102(!arg0);
        System.gc();
        class198.method1308(true, (byte) 29);
        class556.method3213((byte) 48);
        class753.field10508 = class748.field10451.field10410.method3447((byte) 62);
        class701.field9751 = client.field3992 >= 96;
        class719.field10018 = class748.field10451.field10414.method2470((byte) -113) == 2;
        class546.field7614 = class748.field10451.field10427.method4196((byte) 119) == 1;
        class526.field7349 = class748.field10451.field10412.method1806((byte) 104) == 1 ? -1 : class440.field5865;
        class16.field324 = class748.field10451.field10405.method3198((byte) -56) == 1;
        class170.field2362 = class748.field10451.field10420.method1877((byte) -55) == 1;
        class197.field2685 = new class207(4, class409.field5183, class543.field7597, arg0);
        if (class547.field7642 == 0) {
            class88.method725(124, class385.field4921, class197.field2685);
        } else {
            class232.method1469(class197.field2685, -86, class385.field4921);
        }
        class538.method3092(class409.field5183 >> 4, class543.field7597 >> 4, (byte) -63);
        class562.method3243(42);
        if (var5) {
            class629.method3537(true);
            class623.field8572 = new class207(1, class409.field5183, class543.field7597, true);
            if (class547.field7642 == 0) {
                class88.method725(123, class273.field3430, class623.field8572);
                class198.method1308(true, (byte) 29);
            } else {
                class232.method1469(class623.field8572, 80, class273.field3430);
                class198.method1308(true, (byte) 29);
            }
            class623.field8572.method2301(112, 0, class197.field2685.field5224[0]);
            class623.field8572.method2294(-128, class386.field4930, null, null);
            class629.method3537(false);
        }
        class197.field2685.method2294(73, class386.field4930, class526.field7350, var5 ? class623.field8572.field5224 : null);
        if (class547.field7642 == 0) {
            class198.method1308(true, (byte) 29);
            class337.method1942(-28983, class412.field5243, class197.field2685);
            if (class33.field545 != null) {
                class163.method1140(124);
            }
        } else {
            class198.method1308(true, (byte) 29);
            class313.method1867(class197.field2685, class412.field5243, 8);
        }
        class660.method3714(0);
        if (client.field3992 < 96) {
            class84.method696(-93);
        }
        class198.method1308(true, (byte) 29);
        class197.field2685.method2290(class386.field4930, (byte) -28, var5 ? class395.field5009[0] : null, null);
        class197.field2685.method1341(false, (byte) 109, class386.field4930);
        class198.method1308(true, (byte) 29);
        if (var5) {
            class629.method3537(true);
            class198.method1308(true, (byte) 29);
            if (class547.field7642 == 0) {
                class337.method1942(-28983, class256.field3258, class623.field8572);
            } else {
                class313.method1867(class623.field8572, class256.field3258, 8);
            }
            class660.method3714(0);
            class198.method1308(true, (byte) 29);
            class623.field8572.method2290(class386.field4930, (byte) 119, null, class707.field9826[0]);
            class623.field8572.method1341(true, (byte) 109, class386.field4930);
            class198.method1308(true, (byte) 29);
            class629.method3537(false);
        }
        class621.method3494(0);
        int var9 = class197.field2685.field2741;
        if (class472.field6329 < var9) {
            var9 = class472.field6329;
        }
        if (class472.field6329 - 1 > var9) {
            var9 = class472.field6329 - 1;
        }
        if (class748.field10451.field10412.method1806((byte) -82) == 0) {
            class585.method3324(var9);
        } else {
            class585.method3324(0);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var19 = 0; var19 < class409.field5183; var19++) {
                for (int var20 = 0; var20 < class543.field7597; var20++) {
                    class220.method1429(var20, var10, var19, (byte) -16);
                }
            }
        }
        class582.method3316((byte) -94);
        class14.method102(true);
        class592.method3357(-89);
        class660.method3714(0);
        class106.method858(-1);
        if (class731.field10179 != null && class12.field143 != null && class27.field484 == 11) {
            class468.field6280++;
            class589 var11 = class514.method2994(-29488, class760.field10605, class522.field7316);
            var11.field8251.method2568(1057001181, -535701016);
            class737.method4107(var11, 7);
        }
        if (class547.field7642 == 0) {
            int var12 = (class21.field384 - (class409.field5183 >> 4)) / 8;
            int var13 = (class21.field384 + (class409.field5183 >> 4)) / 8;
            int var14 = (class409.field5196 - (class543.field7597 >> 4)) / 8;
            int var15 = ((class543.field7597 >> 4) + class409.field5196) / 8;
            for (int var16 = var12 - 1; var16 <= (var13 + 1); var16++) {
                for (int var17 = var14 - 1; var17 <= var15 + 1; var17++) {
                    if (var16 < var12 || var13 < var16 || var17 < var14 || var17 > var15) {
                        class238.field3094.method3176(0, "m" + var16 + "_" + var17);
                        class238.field3094.method3176(0, "l" + var16 + "_" + var17);
                    }
                }
            }
        }
        if (class27.field484 == 4) {
            class571.method3275(27461, 3);
        } else if (class27.field484 == 8) {
            class571.method3275(27461, 7);
        } else {
            class571.method3275(27461, 10);
            if (class12.field143 != null) {
                class589 var18 = class514.method2994(-29488, class760.field10605, class190.field2618);
                class737.method4107(var18, 7);
            }
        }
        class582.method3318(!arg0);
        class14.method102(!arg0);
        class490.method2894(-79);
        class563.field7924 = true;
        if (class721.field10037) {
            class320.method1883((byte) -60, "Took: " + (class446.method2525(500) - class199.field2706) + "ms");
            class721.field10037 = false;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(II)[I", line = 797)
    public int[] method215(int arg0, int arg1) {
        if (arg0 != -23347) {
            this.field10296 = 28;
        }
        field10313++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(BI)[[I", line = 810)
    public int[][] method223(byte arg0, int arg1) {
        field10308++;
        if (arg0 <= 26) {
            this.method1886(true);
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!au", name = "c", descriptor = "(I)V", line = 822)
    public void method216(int arg0) {
        field10310++;
        if (arg0 != -21773) {
            this.field10297 = false;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I[BLjava/lang/String;I)I", line = 832)
    public static final int method4121(int arg0, byte[] arg1, String arg2, int arg3) {
        field10295++;
        if (arg3 != -1) {
            return 62;
        }
        int var4 = arg0;
        int var5 = arg2.length();
        for (int var6 = 0; var6 < var5; var6 += 4) {
            int var7 = class475.method2716(~arg3, arg2.charAt(var6));
            int var8 = var6 + 1 < var5 ? class475.method2716(arg3 + 1, arg2.charAt(var6 + 1)) : -1;
            int var9 = (var6 + 2) >= var5 ? -1 : class475.method2716(0, arg2.charAt(var6 + 2));
            int var10 = var5 > (var6 + 3) ? class475.method2716(0, arg2.charAt(var6 + 3)) : -1;
            arg1[arg0++] = (byte) class683.method3840(var8 >>> 4, var7 << 2);
            if (var9 == -1) {
                break;
            }
            arg1[arg0++] = (byte) class683.method3840(var9 >>> 2, class702.method3949(var8, 15) << 4);
            if (var10 == -1) {
                break;
            }
            arg1[arg0++] = (byte) class683.method3840(class702.method3949(192, var9 << 6), var10);
        }
        return arg0 - var4;
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(IZ)V", line = 879)
    public class739(int arg0, boolean arg1) {
        this.field10297 = arg1;
        this.field10314 = new class739[arg0];
    }
}
