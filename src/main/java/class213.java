import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class213 {

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3522 = "";

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "[Leb;")
    public static class133[] field3520 = new class133[14];

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "[Z")
    public static boolean[] field3524 = new boolean[100];

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field3526 = 0;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "Lek;")
    public static class206 field3523;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "[S")
    public static short[] field3525;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III[[[BIBII)V", line = 3)
    public static final void method1468(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class264.field4332++;
        class57.field1118 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class209.field3490; var12 < class138.field2345; var12++) {
            class312[][] var13 = class353.field5644[var12];
            for (int var14 = class266.field4341; var14 < class129.field2247; var14++) {
                for (int var15 = class26.field673; var15 < class251.field4121; var15++) {
                    class312 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class200.field3358[var14 + class111.field2035 - class107.field1943][var15 + class111.field2035 - class274.field4465] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field5081 = true;
                            var16.field5093 = true;
                            if (var16.field5078 > 0) {
                                var16.field5083 = true;
                            } else {
                                var16.field5083 = false;
                            }
                            class57.field1118++;
                        } else {
                            var16.field5081 = false;
                            var16.field5093 = false;
                            var16.field5100 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field5102 != null) {
                                    class16 var17 = var16.field5102;
                                    var17.field473.method334(0, var12, var17.field472, var17.field464, var17.field468);
                                    if (var17.field465 != null) {
                                        var17.field465.method334(0, var12, var17.field472, var17.field464, var17.field468);
                                    }
                                }
                                if (var16.field5082 != null) {
                                    class332 var18 = var16.field5082;
                                    var18.field5307.method334(var18.field5311, var12, var18.field5309, var18.field5310, var18.field5313);
                                    if (var18.field5305 != null) {
                                        var18.field5305.method334(var18.field5311, var12, var18.field5309, var18.field5310, var18.field5313);
                                    }
                                }
                                if (var16.field5092 != null) {
                                    class94 var19 = var16.field5092;
                                    var19.field1653.method334(0, var12, var19.field1655, var19.field1654, var19.field1649);
                                }
                                if (var16.field5089 != null) {
                                    for (int var20 = 0; var20 < var16.field5078; var20++) {
                                        class278 var21 = var16.field5089[var20];
                                        var21.field4529.method334(var21.field4531, var12, var21.field4521, var21.field4536, var21.field4522);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class55.field1085 == class144.field2427;
        if (class241.field4016) {
            GL var23 = class241.field4012;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class37.method268();
                class109.method815(-118, -1, 3);
                class269.field4384 = true;
                class64.method514();
                class222.field3678 = -1;
                class362.field5728 = -1;
                for (int var24 = 0; var24 < class197.field3294[0].length; var24++) {
                    class102 var25 = class197.field3294[0][var24];
                    float var26 = 251.5F - (var25.field1858 ? 1.0F : 0.5F);
                    if (class222.field3678 != var25.field1872) {
                        class222.field3678 = var25.field1872;
                        class27.method219(var25.field1872, -126);
                        class259.method1818(class198.method1356((byte) 100));
                    }
                    var25.method773(class353.field5644, var26, false);
                }
                class64.method517();
            } else {
                int var27 = class209.field3490;
                while (true) {
                    if (var27 >= class138.field2345) {
                        class2.method26(class107.field1943, class274.field4465, class353.field5644);
                        break;
                    }
                    for (int var28 = 0; var28 < class197.field3294[var27].length; var28++) {
                        class102 var29 = class197.field3294[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field1858 ? 1.0F : 0.5F);
                        if (var29.field1861 != -1 && class125.method899((byte) 96, class305.field4968.method63(var29.field1861, -1)) && class68.field1254) {
                            class27.method219(var29.field1872, -125);
                        }
                        var29.method773(class353.field5644, var30, false);
                    }
                    if (var27 == 0 && class111.field2032 > 0) {
                        class241.method1699(101.5F);
                        class221.method1547(class107.field1943, class274.field4465, class111.field2035, arg1, class200.field3358, class144.field2427[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class209.field3490; var31 < class138.field2345; var31++) {
            class312[][] var32 = class353.field5644[var31];
            for (int var33 = -class111.field2035; var33 <= 0; var33++) {
                int var34 = class107.field1943 + var33;
                int var35 = class107.field1943 - var33;
                if (var34 >= class266.field4341 || var35 < class129.field2247) {
                    for (int var36 = -class111.field2035; var36 <= 0; var36++) {
                        int var37 = class274.field4465 + var36;
                        int var38 = class274.field4465 - var36;
                        if (var34 >= class266.field4341) {
                            if (var37 >= class26.field673) {
                                class312 var39 = var32[var34][var37];
                                if (var39 != null && var39.field5081) {
                                    class164.method1179(var39, true);
                                }
                            }
                            if (var38 < class251.field4121) {
                                class312 var40 = var32[var34][var38];
                                if (var40 != null && var40.field5081) {
                                    class164.method1179(var40, true);
                                }
                            }
                        }
                        if (var35 < class129.field2247) {
                            if (var37 >= class26.field673) {
                                class312 var41 = var32[var35][var37];
                                if (var41 != null && var41.field5081) {
                                    class164.method1179(var41, true);
                                }
                            }
                            if (var38 < class251.field4121) {
                                class312 var42 = var32[var35][var38];
                                if (var42 != null && var42.field5081) {
                                    class164.method1179(var42, true);
                                }
                            }
                        }
                        if (class57.field1118 == 0) {
                            if (!var22) {
                                class31.field712 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class209.field3490; var43 < class138.field2345; var43++) {
            class312[][] var44 = class353.field5644[var43];
            for (int var45 = -class111.field2035; var45 <= 0; var45++) {
                int var46 = class107.field1943 + var45;
                int var47 = class107.field1943 - var45;
                if (var46 >= class266.field4341 || var47 < class129.field2247) {
                    for (int var48 = -class111.field2035; var48 <= 0; var48++) {
                        int var49 = class274.field4465 + var48;
                        int var50 = class274.field4465 - var48;
                        if (var46 >= class266.field4341) {
                            if (var49 >= class26.field673) {
                                class312 var51 = var44[var46][var49];
                                if (var51 != null && var51.field5081) {
                                    class164.method1179(var51, false);
                                }
                            }
                            if (var50 < class251.field4121) {
                                class312 var52 = var44[var46][var50];
                                if (var52 != null && var52.field5081) {
                                    class164.method1179(var52, false);
                                }
                            }
                        }
                        if (var47 < class129.field2247) {
                            if (var49 >= class26.field673) {
                                class312 var53 = var44[var47][var49];
                                if (var53 != null && var53.field5081) {
                                    class164.method1179(var53, false);
                                }
                            }
                            if (var50 < class251.field4121) {
                                class312 var54 = var44[var47][var50];
                                if (var54 != null && var54.field5081) {
                                    class164.method1179(var54, false);
                                }
                            }
                        }
                        if (class57.field1118 == 0) {
                            if (!var22) {
                                class31.field712 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class31.field712 = false;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)I", line = 384)
    public static final int method1469(boolean arg0) {
        field3521++;
        if (arg0) {
            field3520 = (class133[]) null;
        }
        if (class224.field3700) {
            return 0;
        } else if (class14.method137(256)) {
            return class166.field2784 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(Z)V", line = 414)
    public static final void method1470(boolean arg0) {
        class9.field284 = null;
        class232.field3804 = null;
        class321.field5218 = null;
        class323.field5225 = null;
        if (arg0) {
            method1468(114, 104, 65, (byte[][][]) ((byte[][][]) null), 103, (byte) -83, -62, -61);
        }
        field3527++;
        class309.field5053 = (byte[][]) null;
        class76.field1367 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V", line = 434)
    public static void method1471(int arg0) {
        field3525 = null;
        int var1 = 3 % ((50 - arg0) / 46);
        field3524 = null;
        field3520 = null;
        field3522 = null;
        field3523 = null;
    }
}
