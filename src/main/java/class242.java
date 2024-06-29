import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class242 {

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "Z")
    public static boolean field4099 = false;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "Lce;")
    public static class126 field4102 = class206.method1445(-7923, "Librairie 3D d-Bmarr-Be");

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "Lce;")
    public static class126 field4100 = class206.method1445(-7923, "www)2wtqa");

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "Lce;")
    private static class126 field4105 = class206.method1445(-7923, "Opened title screen");

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "[I")
    public static int[] field4106 = new int[5];

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "Lce;")
    public static class126 field4101 = field4105;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "Laf;")
    public static class181 field4104 = new class181();

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "Lce;")
    public static class126 field4107 = class206.method1445(-7923, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "[I")
    public static int[] field4108 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)Lha;", line = 5)
    public static final class26 method1667(boolean arg0) {
        field4098++;
        if (arg0) {
            method1669(46, -81, 78, -65, (byte) -81, -29, 39);
        }
        class26 var1;
        if (class56.field846) {
            var1 = new class115(class307.field5187, class290.field4802, class27.field386[0], class63.field1032[0], class279.field4643[0], class263.field4389[0], class190.field3255[0], class241.field4062);
        } else {
            var1 = new class2(class307.field5187, class290.field4802, class27.field386[0], class63.field1032[0], class279.field4643[0], class263.field4389[0], class190.field3255[0], class241.field4062);
        }
        class197.method1395((byte) 127);
        return var1;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 27)
    public static void method1668(int arg0) {
        field4105 = null;
        field4102 = null;
        field4107 = null;
        if (arg0 != 26828) {
            method1669(52, 80, -128, 59, (byte) 115, -56, 56);
        }
        field4104 = null;
        field4100 = null;
        field4101 = null;
        field4108 = null;
        field4106 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIBII)V", line = 50)
    public static final void method1669(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field4103++;
        if (class257.field4316 == 0) {
            int var7 = class265.field4492;
            int var8 = class87.field1370;
            int var9 = class58.field915;
            int var10 = class269.field4551;
            int var11 = (var10 - var8) * (arg1 - arg6) / arg2 + var8;
            int var12 = (arg0 - arg3) * (var9 - var7) / arg5 + var7;
            if (class313.field5371 && (class9.field105 & 0x40) == 64) {
                class112 var13 = class53.method337((byte) -127, class189.field3250, class52.field797);
                if (var13 == null) {
                    class300.method2017(-123);
                } else {
                    class224.method1536(class128.field2203, class85.field1345, -128, var12, (short) 23, 0L, -1, var11);
                }
            } else {
                class14.field189++;
                if (class23.field335 == 1) {
                    class224.method1536(class224.field3772, class65.field1096, -118, var12, (short) 51, 0L, -1, var11);
                }
                class224.method1536(class224.field3772, class286.field4745, -117, var12, (short) 32, 0L, -1, var11);
            }
        }
        if (arg4 >= -90) {
            method1669(-45, -79, -120, 10, (byte) -76, -71, 32);
        }
        long var14 = -1L;
        for (int var16 = 0; var16 < class1.field8; var16++) {
            long var17 = class263.field4392[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = (int) var17 >> 7 & 0x7F;
            int var21 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            int var22 = (int) var17 >> 29 & 0x3;
            if (var14 != var17) {
                var14 = var17;
                if (var22 == 2 && class318.method2216(class131.field2250, var19, var20, var17)) {
                    class265 var23 = class185.method1338(var21, -7153);
                    if (var23.field4435 != null) {
                        var23 = var23.method1788(-1);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class257.field4316 == 1) {
                        class165.field2945++;
                        class224.method1536(class12.method69(new class126[] { class279.field4640, class13.field179, var23.field4420 }, (byte) 115), class286.field4731, -113, var19, (short) 30, var17, class96.field1538, var20);
                    } else if (!class313.field5371) {
                        class55.field830++;
                        class126[] var24 = var23.field4484;
                        if (class91.field1447) {
                            var24 = class190.method1361(var24, 0);
                        }
                        if (var24 != null) {
                            for (int var25 = 4; var25 >= 0; var25--) {
                                if (var24[var25] != null) {
                                    class30.field424++;
                                    int var26 = -1;
                                    if (var23.field4450 == var25) {
                                        var26 = var23.field4475;
                                    }
                                    short var27 = 0;
                                    if (var25 == 0) {
                                        var27 = 8;
                                    }
                                    if (var25 == 1) {
                                        var27 = 7;
                                    }
                                    if (var25 == 2) {
                                        var27 = 4;
                                    }
                                    if (var23.field4414 == var25) {
                                        var26 = var23.field4421;
                                    }
                                    if (var25 == 3) {
                                        var27 = 6;
                                    }
                                    if (var25 == 4) {
                                        var27 = 1002;
                                    }
                                    class224.method1536(class12.method69(new class126[] { class93.field1457, var23.field4420 }, (byte) 118), var24[var25], -116, var19, var27, var17, var26, var20);
                                }
                            }
                        }
                        class224.method1536(class12.method69(new class126[] { class93.field1457, var23.field4420 }, (byte) 115), class207.field3547, -125, var19, (short) 1003, (long) var23.field4481, class265.field4442, var20);
                    } else if ((class9.field105 & 0x4) == 4) {
                        class224.method1536(class12.method69(new class126[] { class187.field3236, class13.field179, var23.field4420 }, (byte) 121), class85.field1345, -120, var19, (short) 5, var17, -1, var20);
                        class8.field94++;
                    }
                }
                if (var22 == 1) {
                    class89 var28 = class199.field3391[var21];
                    if (var28.field1389.field5109 == 1 && (var28.field2461 & 0x7F) == 64 && (var28.field2487 & 0x7F) == 64) {
                        for (int var29 = 0; var29 < class30.field425; var29++) {
                            class89 var30 = class199.field3391[class279.field4639[var29]];
                            if (var30 != null && var28 != var30 && var30.field1389.field5109 == 1 && var28.field2461 == var30.field2461 && var28.field2487 == var30.field2487) {
                                class33.method180(127, class279.field4639[var29], var19, var20, var30.field1389);
                            }
                        }
                        for (int var31 = 0; var31 < class239.field4036; var31++) {
                            class301 var32 = class85.field1352[class166.field2958[var31]];
                            if (var32 != null && var28.field2461 == var32.field2461 && var28.field2487 == var32.field2487) {
                                class314.method2193(class166.field2958[var31], (byte) -122, var32, var20, var19);
                            }
                        }
                    }
                    class33.method180(124, var21, var19, var20, var28.field1389);
                }
                if (var22 == 0) {
                    class301 var33 = class85.field1352[var21];
                    if ((var33.field2461 & 0x7F) == 64 && (var33.field2487 & 0x7F) == 64) {
                        for (int var34 = 0; var34 < class30.field425; var34++) {
                            class89 var35 = class199.field3391[class279.field4639[var34]];
                            if (var35 != null && var35.field1389.field5109 == 1 && var33.field2461 == var35.field2461 && var33.field2487 == var35.field2487) {
                                class33.method180(126, class279.field4639[var34], var19, var20, var35.field1389);
                            }
                        }
                        for (int var36 = 0; var36 < class239.field4036; var36++) {
                            class301 var37 = class85.field1352[class166.field2958[var36]];
                            if (var37 != null && var33 != var37 && var33.field2461 == var37.field2461 && var33.field2487 == var37.field2487) {
                                class314.method2193(class166.field2958[var36], (byte) -124, var37, var20, var19);
                            }
                        }
                    }
                    class314.method2193(var21, (byte) -119, var33, var20, var19);
                }
                if (var22 == 3) {
                    class129 var38 = class89.field1388[class131.field2250][var19][var20];
                    if (var38 != null) {
                        for (class81 var39 = (class81) var38.method904(-112); var39 != null; var39 = (class81) var38.method894(-16)) {
                            int var40 = var39.field1303.field3826;
                            class137 var41 = class68.method498(112, var40);
                            if (class257.field4316 == 1) {
                                class241.field4076++;
                                class224.method1536(class12.method69(new class126[] { class279.field4640, class25.field357, var41.field2396 }, (byte) 124), class286.field4731, -122, var19, (short) 1, (long) var40, class96.field1538, var20);
                            } else if (!class313.field5371) {
                                class264.field4411++;
                                class126[] var42 = var41.field2430;
                                if (class91.field1447) {
                                    var42 = class190.method1361(var42, 0);
                                }
                                for (int var43 = 4; var43 >= 0; var43--) {
                                    if (var42 != null && var42[var43] != null) {
                                        class267.field4530++;
                                        byte var44 = 0;
                                        int var45 = -1;
                                        if (var41.field2366 == var43) {
                                            var45 = var41.field2372;
                                        }
                                        if (var41.field2406 == var43) {
                                            var45 = var41.field2415;
                                        }
                                        if (var43 == 0) {
                                            var44 = 2;
                                        }
                                        if (var43 == 1) {
                                            var44 = 15;
                                        }
                                        if (var43 == 2) {
                                            var44 = 28;
                                        }
                                        if (var43 == 3) {
                                            var44 = 17;
                                        }
                                        if (var43 == 4) {
                                            var44 = 29;
                                        }
                                        class224.method1536(class12.method69(new class126[] { class99.field1598, var41.field2396 }, (byte) 127), var42[var43], -115, var19, var44, (long) var40, var45, var20);
                                    }
                                }
                                class224.method1536(class12.method69(new class126[] { class99.field1598, var41.field2396 }, (byte) 118), class207.field3547, -118, var19, (short) 1004, (long) var40, class265.field4442, var20);
                            } else if ((class9.field105 & 0x1) == 1) {
                                class224.method1536(class12.method69(new class126[] { class187.field3236, class25.field357, var41.field2396 }, (byte) 119), class85.field1345, -113, var19, (short) 38, (long) var40, -1, var20);
                                class200.field3410++;
                            }
                        }
                    }
                }
            }
        }
    }
}
