import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class110 extends class213 {

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public int field2114;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "Lob;")
    public static class141 field2113 = class175.method1195(40, "Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

    @OriginalMember(owner = "client!la", name = "t", descriptor = "Lob;")
    public static class141 field2117 = class175.method1195(40, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!la", name = "u", descriptor = "Lob;")
    private static class141 field2118 = class175.method1195(40, "Click to switch");

    @OriginalMember(owner = "client!la", name = "r", descriptor = "Lob;")
    public static class141 field2115 = field2118;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "[I")
    public static int[] field2112 = new int[4096];

    @OriginalMember(owner = "client!la", name = "y", descriptor = "Z")
    public static boolean field2122;

    @OriginalMember(owner = "client!la", name = "A", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!la", name = "B", descriptor = "[I")
    public static int[] field2125;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!la", name = "z", descriptor = "[[I")
    public static int[][] field2123;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "[[S")
    public static short[][] field2121;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "[[[I")
    public static int[][][] field2119;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(I)V")
    public static void method723(int arg0) {
        field2123 = null;
        if (arg0 != -2) {
            method725(112, 17, -25, -71, -47);
        }
        field2112 = null;
        field2115 = null;
        field2118 = null;
        field2121 = null;
        field2119 = null;
        field2113 = null;
        field2125 = null;
        field2117 = null;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V")
    public class110() {
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(I)V")
    public class110(int arg0) {
        this.field2114 = arg0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BLog;)Lm;")
    public static final class119 method724(byte arg0, class146 arg1) {
        field2116++;
        if (arg0 <= 16) {
            method725(-14, -57, 18, -90, -83);
        }
        return new class119(arg1.method992((byte) -67), arg1.method992((byte) -67), arg1.method992((byte) -67), arg1.method992((byte) -67), arg1.method1012(101), arg1.method1012(-127), arg1.method991(255));
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIII)V")
    public static final void method725(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2120++;
        if (class29.field568 == 0 && !class61.field1194) {
            class61.field1202++;
            class65.method430(class111.field2128, class211.field4025, 0, (short) 43, 0L, arg4 - arg2, -arg3 + arg1);
        }
        long var5 = -1L;
        for (int var7 = 0; var7 < class138.field2650; var7++) {
            long var8 = class132.field2518[var7];
            int var10 = (int) var8 & 0x7F;
            int var11 = (int) var8 >> 7 & 0x7F;
            int var12 = (int) var8 >> 29 & 0x3;
            int var13 = (int) (var8 >>> 32) & Integer.MAX_VALUE;
            if (var5 != var8) {
                var5 = var8;
                if (var12 == 2 && class106.method702(class66.field1287, var10, var11, var8)) {
                    class54 var14 = class175.method1198(-14098, var13);
                    if (var14.field1024 != null) {
                        var14 = var14.method372((byte) -3);
                    }
                    if (var14 == null) {
                        continue;
                    }
                    if (class29.field568 == 1) {
                        class97.field1922++;
                        class65.method430(class220.method1422(new class141[] { class179.field3522, class2.field22, var14.field1027 }, arg0 ^ 0xFFFFD2E7), class59.field1150, 0, (short) 47, var8, var10, var11);
                    } else if (!class61.field1194) {
                        class178.field3518++;
                        class141[] var15 = var14.field1063;
                        if (class72.field1446) {
                            var15 = class195.method1316(true, var15);
                        }
                        if (var15 != null) {
                            for (int var16 = 4; var16 >= 0; var16--) {
                                if (var15[var16] != null) {
                                    short var17 = 0;
                                    if (var16 == 0) {
                                        var17 = 51;
                                    }
                                    if (var16 == 1) {
                                        var17 = 17;
                                    }
                                    if (var16 == 2) {
                                        var17 = 23;
                                    }
                                    if (var16 == 3) {
                                        var17 = 46;
                                    }
                                    if (var16 == 4) {
                                        var17 = 1007;
                                    }
                                    class65.method430(class220.method1422(new class141[] { class77.field1571, var14.field1027 }, -3), var15[var16], 0, var17, var8, var10, var11);
                                    class144.field2784++;
                                }
                            }
                        }
                        class65.method430(class220.method1422(new class141[] { class77.field1571, var14.field1027 }, -3), class96.field1896, 0, (short) 1004, (long) var14.field1028, var10, var11);
                    } else if ((class111.field2155 & 0x4) == 4) {
                        class213.field4059++;
                        class65.method430(class220.method1422(new class141[] { class185.field3607, class2.field22, var14.field1027 }, -3), class4.field45, 0, (short) 5, var8, var10, var11);
                    }
                }
                if (var12 == 1) {
                    class131 var18 = class10.field172[var13];
                    if (var18.field2507.field205 == 1 && (var18.field3889 & 0x7F) == 64 && (var18.field3854 & 0x7F) == 64) {
                        for (int var19 = 0; var19 < class195.field3738; var19++) {
                            class131 var22 = class10.field172[class203.field3888[var19]];
                            if (var22 != null && var18 != var22 && var22.field2507.field205 == 1 && var18.field3889 == var22.field3889 && var18.field3854 == var22.field3854) {
                                class11.method72(var10, -2, class203.field3888[var19], var22.field2507, var11);
                            }
                        }
                        for (int var20 = 0; var20 < class184.field3587; var20++) {
                            class38 var21 = class116.field2231[class188.field3647[var20]];
                            if (var21 != null && var18.field3889 == var21.field3889 && var18.field3854 == var21.field3854) {
                                class176.method1205(var11, -126, var10, var21, class188.field3647[var20]);
                            }
                        }
                    }
                    class11.method72(var10, -2, var13, var18.field2507, var11);
                }
                if (var12 == 0) {
                    class38 var23 = class116.field2231[var13];
                    if ((var23.field3889 & 0x7F) == 64 && (var23.field3854 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < class195.field3738; var24++) {
                            class131 var27 = class10.field172[class203.field3888[var24]];
                            if (var27 != null && var27.field2507.field205 == 1 && var23.field3889 == var27.field3889 && var23.field3854 == var27.field3854) {
                                class11.method72(var10, -2, class203.field3888[var24], var27.field2507, var11);
                            }
                        }
                        for (int var25 = 0; var25 < class184.field3587; var25++) {
                            class38 var26 = class116.field2231[class188.field3647[var25]];
                            if (var26 != null && var23 != var26 && var23.field3889 == var26.field3889 && var23.field3854 == var26.field3854) {
                                class176.method1205(var11, -105, var10, var26, class188.field3647[var25]);
                            }
                        }
                    }
                    class176.method1205(var11, 37, var10, var23, var13);
                }
                if (var12 == 3) {
                    class158 var28 = class76.field1559[class66.field1287][var10][var11];
                    if (var28 != null) {
                        for (class190 var29 = (class190) var28.method1104(50); var29 != null; var29 = (class190) var28.method1105(-21824)) {
                            class50 var30 = class96.method645((byte) -61, var29.field3669);
                            if (class29.field568 == 1) {
                                class91.field1823++;
                                class65.method430(class220.method1422(new class141[] { class179.field3522, class215.field4102, var30.field937 }, -3), class59.field1150, 0, (short) 38, (long) var29.field3669, var10, var11);
                            } else if (!class61.field1194) {
                                class141[] var31 = var30.field932;
                                class125.field2402++;
                                if (class72.field1446) {
                                    var31 = class195.method1316(true, var31);
                                }
                                for (int var32 = 4; var32 >= 0; var32--) {
                                    if (var31 != null && var31[var32] != null) {
                                        class201.field3795++;
                                        byte var33 = 0;
                                        if (var32 == 0) {
                                            var33 = 13;
                                        }
                                        if (var32 == 1) {
                                            var33 = 48;
                                        }
                                        if (var32 == 2) {
                                            var33 = 34;
                                        }
                                        if (var32 == 3) {
                                            var33 = 57;
                                        }
                                        if (var32 == 4) {
                                            var33 = 45;
                                        }
                                        class65.method430(class220.method1422(new class141[] { class114.field2185, var30.field937 }, -3), var31[var32], arg0 ^ 0x2D1A, var33, (long) var29.field3669, var10, var11);
                                    } else if (var32 == 2) {
                                        class196.field3749++;
                                        class65.method430(class220.method1422(new class141[] { class114.field2185, var30.field937 }, -3), class60.field1176, 0, (short) 34, (long) var29.field3669, var10, var11);
                                    }
                                }
                                class65.method430(class220.method1422(new class141[] { class114.field2185, var30.field937 }, arg0 - 11549), class96.field1896, arg0 - 11546, (short) 1005, (long) var29.field3669, var10, var11);
                            } else if ((class111.field2155 & 0x1) == 1) {
                                class66.field1274++;
                                class65.method430(class220.method1422(new class141[] { class185.field3607, class215.field4102, var30.field937 }, arg0 - 11549), class4.field45, arg0 ^ 0x2D1A, (short) 26, (long) var29.field3669, var10, var11);
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != 11546) {
            field2123 = null;
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field2112[var0] = class118.method763(var0, -56441588);
        }
        field2122 = false;
        field2124 = -1;
        field2125 = new int[32];
    }
}
