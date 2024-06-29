import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class333 extends class114 {

    @OriginalMember(owner = "client!so", name = "v", descriptor = "I")
    public int field5181 = 0;

    @OriginalMember(owner = "client!so", name = "y", descriptor = "Lpa;")
    public static class254 field5184 = new class254(14, 19);

    @OriginalMember(owner = "client!so", name = "A", descriptor = "Lla;")
    public static class319 field5186 = new class319(55, 0);

    @OriginalMember(owner = "client!so", name = "B", descriptor = "I")
    public static int field5187 = 0;

    @OriginalMember(owner = "client!so", name = "t", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!so", name = "u", descriptor = "I")
    public static int field5180;

    @OriginalMember(owner = "client!so", name = "w", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!so", name = "x", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!so", name = "z", descriptor = "I")
    public static int field5185;

    // $FF: synthetic field
    @OriginalMember(owner = "client!so", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field5188;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Lnj;B)V")
    public final void method2148(class164 arg0, byte arg1) {
        field5180++;
        if (arg1 != 12) {
            method2150(95, -13, 6, (byte) -35);
        }
        while (true) {
            int var3 = arg0.method1087(false);
            if (var3 == 0) {
                return;
            }
            this.method2149(var3, -9839, arg0);
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IILnj;)V")
    private final void method2149(int arg0, int arg1, class164 arg2) {
        if (arg0 == 2) {
            this.field5181 = arg2.method1074(arg1 - 635979313);
        }
        if (arg1 != -9839) {
            this.method2148(null, (byte) -120);
        }
        field5179++;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIB)I")
    public static final int method2150(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0 & 0x3;
        field5182++;
        if (arg3 >= -111) {
            method2151(-120);
        }
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!so", name = "f", descriptor = "(I)V")
    public static void method2151(int arg0) {
        if (arg0 < 13) {
            method2152(null, (byte) -15, 27);
        }
        field5184 = null;
        field5186 = null;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Lqa;BI)Z")
    public static final boolean method2152(class165 arg0, byte arg1, int arg2) {
        field5185++;
        int var3 = (class398.field6071 - 104) / 2;
        int var4 = (class528.field7734 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < var3 + 104; var6++) {
            for (int var51 = var4; var51 < var4 + 104; var51++) {
                for (int var52 = arg2; var52 <= 3; var52++) {
                    if (class519.method3091(var51, arg2, var6, var52, 100)) {
                        int var53 = var52;
                        if (class28.method249(var6, var51, -66)) {
                            var53 = var52 - 1;
                        }
                        if (var53 >= 0) {
                            var5 &= class189.method1263(var6, var53, var51, false);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class430.field6552 = arg0.method767(var7, 0, 512, 512, 512);
        class241.method1587((byte) 64);
        int var9 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 16) + (-10 + (int) (Math.random() * 20.0D) + 238 << 8) + 238 - 10 | 0xFF000000;
        int var10 = (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00 << 16;
        int var11 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
        boolean[][] var12 = new boolean[class91.field1328][class91.field1328];
        for (int var13 = var3; var13 < var3 + 104; var13 += class91.field1328) {
            for (int var36 = var4; var36 < var4 + 104; var36 += class91.field1328) {
                arg0.method739(0, 0, class91.field1328 * 4, class91.field1328 * 4);
                arg0.method834(-16777216);
                for (int var37 = arg2; var37 <= 3; var37++) {
                    for (int var44 = 0; var44 < class91.field1328; var44++) {
                        for (int var50 = 0; var50 < class91.field1328; var50++) {
                            var12[var44][var50] = class519.method3091(var36 + var50, arg2, var13 + var44, var37, -123);
                        }
                    }
                    class414.field6317[var37].method208(0, 0, 1024, var13, var36, var13 + class91.field1328, class91.field1328 + var36, var12);
                    if (!class353.field5456) {
                        for (int var45 = -4; var45 < class91.field1328; var45++) {
                            for (int var46 = -4; var46 < class91.field1328; var46++) {
                                int var47 = var13 + var45;
                                int var48 = var36 + var46;
                                if (var47 >= var3 && var4 <= var48 && class519.method3091(var48, arg2, var47, var37, -49)) {
                                    int var49 = var37;
                                    if (class28.method249(var47, var48, -92)) {
                                        var49 = var37 - 1;
                                    }
                                    if (var49 >= 0) {
                                        class296.method1892(arg0, (class91.field1328 - var46) * 4 - 4, var10, var45 * 4, var9, true, var47, var48, var49);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class353.field5456) {
                    class181 var38 = class9.field174[arg2];
                    for (int var39 = 0; var39 < class91.field1328; var39++) {
                        for (int var40 = 0; var40 < class91.field1328; var40++) {
                            int var41 = var13 + var39;
                            int var42 = var36 + var40;
                            int var43 = var38.field2451[var41 - var38.field2433][var42 - var38.field2434];
                            if ((var43 & 0x40240000) != 0) {
                                arg0.method1117(4, (class91.field1328 - var40) * 4 - 4, -1713569622, var39 * 4, 4, (byte) 73);
                            } else if ((var43 & 0x800000) != 0) {
                                arg0.method1129(4, (class91.field1328 - var40) * 4 - 4, 43, -1713569622, var39 * 4);
                            } else if ((var43 & 0x2000000) != 0) {
                                arg0.method1121(-1713569622, (class91.field1328 - var40) * 4 - 4, 4, var39 * 4 + 3, -26030);
                            } else if ((var43 & 0x8000000) != 0) {
                                arg0.method1129(4, (class91.field1328 - var40) * 4 + 3 - 4, 43, -1713569622, var39 * 4);
                            } else if ((var43 & 0x20000000) != 0) {
                                arg0.method1121(-1713569622, (class91.field1328 - var40) * 4 - 4, 4, var39 * 4, -26030);
                            }
                        }
                    }
                }
                arg0.method747(0, 0, class91.field1328 * 4, class91.field1328 * 4, var11, 2);
                class430.field6552.method290(((var13 - var3) * 4) + 48, -(class91.field1328 * 4) + 464 + -((-var4 + var36) * 4), class91.field1328 * 4, class91.field1328 * 4, 0, 0);
            }
        }
        arg0.method753();
        arg0.method834(-16777215);
        class141.method950(0);
        class116.field1600 = 0;
        class48.field683.method450((byte) 73);
        if (!class353.field5456) {
            for (int var14 = var3; var14 < (var3 + 104); var14++) {
                for (int var20 = var4; var20 < (var4 + 104); var20++) {
                    for (int var21 = arg2; var21 <= arg2 + 1 && var21 <= 3; var21++) {
                        if (class519.method3091(var20, arg2, var14, var21, -74)) {
                            class68 var22 = (class68) class471.method2823(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class68) class172.method1169(var21, var14, var20, field5188 == null ? (field5188 = method2154("jt")) : field5188);
                            }
                            if (var22 == null) {
                                var22 = (class68) class309.method1938(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class68) class307.method1926(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class209 var23 = class432.field6575.method1872(var22.method338(100), false);
                                if (!var23.field2922 || class414.field6307) {
                                    int var24 = var23.field2945;
                                    if (var23.field2934 != null) {
                                        for (int var25 = 0; var25 < var23.field2934.length; var25++) {
                                            if (var23.field2934[var25] != -1) {
                                                class209 var26 = class432.field6575.method1872(var23.field2934[var25], false);
                                                if (var26.field2945 >= 0) {
                                                    var24 = var26.field2945;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class38 var28 = class509.field7484.method1851(36, var24);
                                            if (var28 != null && var28.field535) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class9.field174[var21].field2451;
                                            int var32 = class9.field174[var21].field2433;
                                            int var33 = class9.field174[var21].field2434;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var29 > var3 && var14 - 3 < var29 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && (var3 + 104 - 1) > var29 && var29 < var14 + 3 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var4 < var30 && (var20 - 3) < var30 && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var4 + 104 - 1 > var30 && var20 + 3 > var30 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class414.field6320[class116.field1600] = var23.field2936;
                                        class412.field6265[class116.field1600] = var29;
                                        class390.field5957[class116.field1600] = var30;
                                        class116.field1600++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class401.field6112 != null) {
                class315.field4587.field2559 = 1;
                class509.field7484.method1850(1024, 64, 5);
                for (int var15 = 0; var15 < class401.field6112.field1938; var15++) {
                    int var16 = class401.field6112.field1942[var15];
                    if ((var16 >> 28) == class56.field800.field1866) {
                        int var17 = ((var16 & 0xFFFF544) >> 14) - class331.field5162;
                        int var18 = (var16 & 0x3FFF) - class328.field5099;
                        if (var17 >= 0 && var17 < class398.field6071 && var18 >= 0 && class528.field7734 > var18) {
                            class48.field683.method453((byte) 109, new class160(var15));
                        } else {
                            class38 var19 = class509.field7484.method1851(36, class401.field6112.field1935[var15]);
                            if (var19.field576 != null && var17 + var19.field534 >= 0 && class398.field6071 > var19.field555 + var17 && var19.field572 + var18 >= 0 && class528.field7734 > (var18 + var19.field568)) {
                                class48.field683.method453((byte) 115, new class160(var15));
                            }
                        }
                    }
                }
                class509.field7484.method1850(128, 64, 5);
                class315.field4587.field2559 = 2;
                class315.field4587.method1269(100);
            }
        }
        if (arg1 < 21) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method2153(int arg0, String arg1, int arg2) {
        field5183++;
        class177 var3 = class344.method2229(3, arg0, (byte) 115);
        var3.method1191(112);
        var3.field2367 = arg1;
        if (arg2 > -44) {
            field5186 = null;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2154(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
