import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class147 {

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "[I")
    public static int[] field1986 = new int[16384];

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "[I")
    public static int[] field1988 = new int[16384];

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "I")
    public static int field1990;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sq", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field1991;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZZLec;Lec;IIZ)I")
    public static final int method892(boolean arg0, boolean arg1, class68 arg2, class68 arg3, int arg4, int arg5, boolean arg6) {
        field1983++;
        int var7 = class165.method1043(arg2, arg3, 246, arg6, arg5);
        if (var7 != 0) {
            return arg6 ? -var7 : var7;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var8 = class165.method1043(arg2, arg3, 246, arg1, arg4);
            if (arg0) {
                return arg1 ? -var8 : var8;
            } else {
                return 54;
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V")
    public static final void method893(byte arg0) {
        field1982++;
        class60 var1 = (class60) class322.field5026.method2123(-34);
        if (arg0 != -93) {
            return;
        }
        while (var1 != null) {
            class441 var2 = var1.field948;
            if (class88.field1278 > var2.field6854) {
                var1.method3149(arg0 + 159);
                var2.method2795(9828);
            } else if (var2.field6829 <= class88.field1278) {
                if (var2.field6868 > 0) {
                    class38 var3 = (class38) class365.field5659.method1122((byte) 59, (long) (var2.field6868 - 1));
                    if (var3 != null) {
                        class378 var4 = var3.field378;
                        if (var4.field6417 >= 0 && (class135.field1839 * 128) > var4.field6417 && var4.field6410 >= 0 && var4.field6410 < class197.field3038 * 128) {
                            var2.method2793(class88.field1278, class532.method3165(var2.field6419, var4.field6417, false, var4.field6410) - var2.field6834, var4.field6417, var4.field6410, arg0 ^ 0xFFFFFFA2);
                        }
                    }
                }
                if (var2.field6868 < 0) {
                    int var5 = -var2.field6868 - 1;
                    class350 var6;
                    if (class528.field7772 == var5) {
                        var6 = class358.field5565;
                    } else {
                        var6 = class264.field4276[var5];
                    }
                    if (var6 != null && var6.field6417 >= 0 && class135.field1839 * 128 > var6.field6417 && var6.field6410 >= 0 && var6.field6410 < (class197.field3038 * 128)) {
                        var2.method2793(class88.field1278, class532.method3165(var2.field6419, var6.field6417, false, var6.field6410) - var2.field6834, var6.field6417, var6.field6410, arg0 ^ 0xFFFFFFA2);
                    }
                }
                var2.method2797(class376.field5786, (byte) -33);
                class186.method1160(var2, true);
            }
            var1 = (class60) class322.field5026.method2126((byte) 61);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lza;B)V")
    public static final void method894(class497 arg0, byte arg1) {
        field1987++;
        if (arg1 <= 57) {
            return;
        }
        int var2 = class296.field4670;
        int var3 = class521.field7715;
        int var4 = class201.field3054;
        int var5 = class64.field1007 - 3;
        byte var6 = 20;
        if (class490.field7412 == null || class52.field708 == null) {
            if (class120.field1646.method1012(class122.field1665, true) && class120.field1646.method1012(class303.field4771, true)) {
                class490.field7412 = arg0.method1278(class175.method1115(class120.field1646, class122.field1665, 0), true);
                class175 var7 = class175.method1115(class120.field1646, class303.field4771, 0);
                class52.field708 = arg0.method1278(var7, true);
                var7.method1114();
                class361.field5591 = arg0.method1278(var7, true);
            } else {
                arg0.method1260(var2, var3, var4, var6, class217.field3696 | 255 - class10.field103 << 24, 1);
            }
        }
        if (class490.field7412 != null && class52.field708 != null) {
            int var8 = (var4 - (class52.field708.method626() * 2)) / class490.field7412.method626();
            for (int var9 = 0; var9 < var8; var9++) {
                class490.field7412.method852(var2 - (-class52.field708.method626() - (class490.field7412.method626() * var9)), var3);
            }
            class52.field708.method852(var2, var3);
            class361.field5591.method852(var2 + var4 - class361.field5591.method626(), var3);
        }
        class289.field4571.method2009(class126.field1720 | 0xFF000000, -1, class340.field5312.method1583(80, class12.field131), var2 + 3, false, var3 + 14);
        arg0.method1260(var2, var3 + var6, var4, var5 - var6, class217.field3696 | -class10.field103 + 255 << 24, 1);
        int var10 = class472.field7240.method2038(-49);
        int var11 = class472.field7240.method2043((byte) -90);
        int var12 = 0;
        for (class140 var13 = (class140) class392.field5958.method2123(82); var13 != null; var13 = (class140) class392.field5958.method2126((byte) 61)) {
            int var31 = (class501.field7514 - var12 - 1) * 16 + var6 + var3 + 13;
            if (var2 < var10 && var10 < (var2 + var4) && var31 - 13 < var11 && var31 + 4 > var11 && var13.field1900) {
                arg0.method1260(var2, var31 - 12, var4, 16, class149.field2011 | 255 - class92.field1351 << 24, 1);
            }
            var12++;
        }
        if ((class189.field2751 == null || class417.field6327 == null || class467.field7155 == null) && class120.field1646.method1012(class352.field5489, true) && class120.field1646.method1012(class261.field4201, true) && class120.field1646.method1012(class16.field165, true)) {
            class175 var14 = class175.method1115(class120.field1646, class261.field4201, 0);
            class417.field6327 = arg0.method1278(var14, true);
            var14.method1114();
            class9.field98 = arg0.method1278(var14, true);
            class189.field2751 = arg0.method1278(class175.method1115(class120.field1646, class352.field5489, 0), true);
            class175 var15 = class175.method1115(class120.field1646, class16.field165, 0);
            class467.field7155 = arg0.method1278(var15, true);
            var15.method1114();
            class7.field79 = arg0.method1278(var15, true);
        }
        int var16 = 0;
        if (class189.field2751 != null && class417.field6327 != null && class467.field7155 != null) {
            int var17 = (var4 - (class467.field7155.method626() * 2)) / class189.field2751.method626();
            for (int var18 = 0; var18 < var17; var18++) {
                class189.field2751.method852(var2 - (-class467.field7155.method626() - (class189.field2751.method626() * var18)), -class189.field2751.method622() + var5 + var3);
            }
            int var19 = (var5 - var6 - class467.field7155.method622()) / class417.field6327.method622();
            for (int var20 = 0; var20 < var19; var20++) {
                class417.field6327.method852(var2, class417.field6327.method622() * var20 + var3 + var6);
                class9.field98.method852(var2 - (class9.field98.method626() - var4), var20 * class417.field6327.method622() + var3 + var6);
            }
            class467.field7155.method852(var2, var5 + var3 - class467.field7155.method622());
            class7.field79.method852(var2 + var4 - class467.field7155.method626(), var5 + (var3 - class467.field7155.method622()));
        }
        for (class140 var21 = (class140) class392.field5958.method2123(-29); var21 != null; var21 = (class140) class392.field5958.method2126((byte) 61)) {
            int var22 = (class501.field7514 - var16 - 1) * 16 + var3 + var6 + 13;
            int var23 = class126.field1720 | 0xFF000000;
            if (var2 < var10 && var2 + var4 > var10 && var11 > (var22 - 13) && var11 < var22 + 4 && var21.field1900) {
                var23 = class172.field2525 | 0xFF000000;
            }
            int[] var24 = null;
            if (class518.method3108((byte) 118, var21.field1894)) {
                var24 = class337.field5262.method2077((byte) -65, (int) var21.field1895).field2995;
            } else if (var21.field1898 != -1) {
                var24 = class337.field5262.method2077((byte) -65, var21.field1898).field2995;
            } else if (class433.method2725((byte) -70, var21.field1894)) {
                class38 var25 = (class38) class365.field5659.method1122((byte) 59, (long) ((int) var21.field1895));
                if (var25 != null) {
                    class378 var26 = var25.field378;
                    class191 var27 = var26.field5809;
                    if (var27.field2798 != null) {
                        var27 = var27.method1190(-1, class96.field1394);
                    }
                    if (var27 != null) {
                        var24 = var27.field2837;
                    }
                }
            } else if (class61.method454(var21.field1894, 1002)) {
                Object var28 = null;
                class156 var29;
                if (var21.field1894 == 1007) {
                    var29 = class454.field7029.method3002(-1, (int) var21.field1895);
                } else {
                    var29 = class454.field7029.method3002(-1, (int) (var21.field1895 >>> 32 & 0x7FFFFFFFL));
                }
                if (var29.field2134 != null) {
                    var29 = var29.method962((byte) 107, class96.field1394);
                }
                if (var29 != null) {
                    var24 = var29.field2101;
                }
            }
            String var30 = class169.method1071(var21, (byte) -5);
            if (var24 != null) {
                var30 = var30 + class326.method2180(var24, -75);
            }
            class289.field4571.method2017((byte) -23, var22, class181.field2633, var2 + 3, var23, var30, class243.field3946, 0);
            var16++;
            if (var21.field1904) {
                class120.field1645.method852(class306.field4807.method2252(var30, 0) + var2 + 5, var22 - 12);
            }
        }
        class401.method2580(-60, class201.field3054, class521.field7715, class64.field1007, class296.field4670);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "()V")
    public static final void method895() {
        for (int var0 = 0; var0 < class368.field5683; var0++) {
            if (!class310.field4846[var0]) {
                class169 var1 = class60.field950[var0];
                class415 var2 = var1.field2461;
                int var3 = var1.field2473;
                int var4 = var2.method2651(-119) - class376.field5781;
                int var5 = (var4 * 2 >> class56.field908) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method2650(121) - var4 >> class56.field908;
                int var9 = var2.method2654(0) - var4 >> class56.field908;
                int var10 = var2.method2654(0) + var4 >> class56.field908;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class131.field1773) {
                    var10 = class131.field1773 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field2463[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class252.field4075) {
                        var16 = class252.field4075 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class423 var19 = class49.method352(var3, var17, var11, field1991 == null ? (field1991 = method900("tm")) : field1991);
                        if (var19 != null && var19.field6416 != 0) {
                            if (var19.field6416 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field2463[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field2463[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 0xFF) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field2463[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field2463[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 0xFF) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    var6++;
                }
                class310.field4846[var0] = true;
                class53.field732[var3].method694(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method896(String arg0, byte arg1) {
        field1984++;
        if (arg1 != -99) {
            method892(false, true, null, null, 12, -83, false);
        }
        return arg0.length() + 1;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(III)Z")
    public static final boolean method897(int arg0, int arg1, int arg2) {
        if (arg2 != 55) {
            field1988 = null;
        }
        field1985++;
        return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IZ)V")
    public static final void method898(int arg0, boolean arg1) {
        field1989++;
        class473.field7255 = arg0;
        if (!arg1) {
            class491.field7427.method2189(arg1);
        }
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(B)V")
    public static void method899(byte arg0) {
        field1988 = null;
        field1986 = null;
        if (arg0 > -62) {
            field1990 = -30;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method900(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field1988[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field1986[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
    }
}
