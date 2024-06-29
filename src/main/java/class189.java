import java.awt.Component;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public abstract class class189 {

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field2967 = 2;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "Lve;")
    public static class266 field2969;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "[[[I")
    public static int[][][] field2970;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)Z", line = 15)
    public static final boolean method1290(int arg0, byte arg1) {
        if (arg1 != -25) {
            field2967 = 102;
        }
        class101.field1615 = arg0 + 1 & 0xFFFF;
        field2968++;
        class236.field3790 = true;
        return true;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)I", line = 30)
    public static final int method1291(int arg0, int arg1) {
        int var2 = (arg0 >>> 1 & 0xD5555555) + (arg0 & 0x55555555);
        int var3 = ((var2 & 0xCCCCCCCC) >>> 2) + (var2 & 0x33333333);
        field2971++;
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        int var7 = -9 / ((arg1 + 80) / 42);
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V", line = 46)
    public static void method1292(int arg0) {
        field2970 = (int[][][]) null;
        if (arg0 == 0) {
            field2969 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III[[[BIBII)V", line = 66)
    public static final void method1294(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class118.field1863++;
        class325.field5619 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class219.field3497; var12 < class235.field3723; var12++) {
            class55[][] var13 = class36.field585[var12];
            for (int var14 = class139.field2121; var14 < class9.field114; var14++) {
                for (int var15 = class8.field94; var15 < class136.field2079; var15++) {
                    class55 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class38.field626[var14 + class261.field4272 - class314.field5377][var15 + class261.field4272 - class309.field5315] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field878 = true;
                            var16.field881 = true;
                            if (var16.field879 > 0) {
                                var16.field892 = true;
                            } else {
                                var16.field892 = false;
                            }
                            class325.field5619++;
                        } else {
                            var16.field878 = false;
                            var16.field881 = false;
                            var16.field883 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field890 != null) {
                                    class267 var17 = var16.field890;
                                    var17.field4409.method675(0, var12, var17.field4419, var17.field4415, var17.field4405);
                                    if (var17.field4412 != null) {
                                        var17.field4412.method675(0, var12, var17.field4419, var17.field4415, var17.field4405);
                                    }
                                }
                                if (var16.field889 != null) {
                                    class164 var18 = var16.field889;
                                    var18.field2550.method675(var18.field2541, var12, var18.field2546, var18.field2545, var18.field2548);
                                    if (var18.field2544 != null) {
                                        var18.field2544.method675(var18.field2541, var12, var18.field2546, var18.field2545, var18.field2548);
                                    }
                                }
                                if (var16.field886 != null) {
                                    class137 var19 = var16.field886;
                                    var19.field2095.method675(0, var12, var19.field2101, var19.field2099, var19.field2107);
                                }
                                if (var16.field877 != null) {
                                    for (int var20 = 0; var20 < var16.field879; var20++) {
                                        class39 var21 = var16.field877[var20];
                                        var21.field632.method675(var21.field653, var12, var21.field644, var21.field635, var21.field639);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class8.field96 == class229.field3635;
        if (class255.field4184) {
            GL var23 = class255.field4181;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class47.method359();
                class281.method1973(0, -1, 3);
                class74.field1130 = true;
                class288.method2028();
                class285.field4795 = -1;
                class310.field5332 = -1;
                for (int var24 = 0; var24 < class323.field5561[0].length; var24++) {
                    class172 var25 = class323.field5561[0][var24];
                    float var26 = 251.5F - (var25.field2699 ? 1.0F : 0.5F);
                    if (class285.field4795 != var25.field2690) {
                        class285.field4795 = var25.field2690;
                        class63.method478((byte) 56, var25.field2690);
                        class289.method2037(class149.method1018((byte) -50));
                    }
                    var25.method1183(class36.field585, var26, false);
                }
                class288.method2027();
            } else {
                int var27 = class219.field3497;
                while (true) {
                    if (var27 >= class235.field3723) {
                        class226.method1514(class314.field5377, class309.field5315, class36.field585);
                        break;
                    }
                    for (int var28 = 0; var28 < class323.field5561[var27].length; var28++) {
                        class172 var29 = class323.field5561[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field2699 ? 1.0F : 0.5F);
                        if (var29.field2686 != -1 && class200.field3102.method89(var29.field2686, 255) == 4 && class244.field4012) {
                            class63.method478((byte) 56, var29.field2690);
                        }
                        var29.method1183(class36.field585, var30, false);
                    }
                    if (var27 == 0 && class295.field4918 > 0) {
                        class255.method1772(101.5F);
                        class179.method1235(class314.field5377, class309.field5315, class261.field4272, arg1, class38.field626, class229.field3635[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class219.field3497; var31 < class235.field3723; var31++) {
            class55[][] var32 = class36.field585[var31];
            for (int var33 = -class261.field4272; var33 <= 0; var33++) {
                int var34 = class314.field5377 + var33;
                int var35 = class314.field5377 - var33;
                if (var34 >= class139.field2121 || var35 < class9.field114) {
                    for (int var36 = -class261.field4272; var36 <= 0; var36++) {
                        int var37 = class309.field5315 + var36;
                        int var38 = class309.field5315 - var36;
                        if (var34 >= class139.field2121) {
                            if (var37 >= class8.field94) {
                                class55 var39 = var32[var34][var37];
                                if (var39 != null && var39.field878) {
                                    class21.method136(var39, true);
                                }
                            }
                            if (var38 < class136.field2079) {
                                class55 var40 = var32[var34][var38];
                                if (var40 != null && var40.field878) {
                                    class21.method136(var40, true);
                                }
                            }
                        }
                        if (var35 < class9.field114) {
                            if (var37 >= class8.field94) {
                                class55 var41 = var32[var35][var37];
                                if (var41 != null && var41.field878) {
                                    class21.method136(var41, true);
                                }
                            }
                            if (var38 < class136.field2079) {
                                class55 var42 = var32[var35][var38];
                                if (var42 != null && var42.field878) {
                                    class21.method136(var42, true);
                                }
                            }
                        }
                        if (class325.field5619 == 0) {
                            if (!var22) {
                                class135.field2063 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class219.field3497; var43 < class235.field3723; var43++) {
            class55[][] var44 = class36.field585[var43];
            for (int var45 = -class261.field4272; var45 <= 0; var45++) {
                int var46 = class314.field5377 + var45;
                int var47 = class314.field5377 - var45;
                if (var46 >= class139.field2121 || var47 < class9.field114) {
                    for (int var48 = -class261.field4272; var48 <= 0; var48++) {
                        int var49 = class309.field5315 + var48;
                        int var50 = class309.field5315 - var48;
                        if (var46 >= class139.field2121) {
                            if (var49 >= class8.field94) {
                                class55 var51 = var44[var46][var49];
                                if (var51 != null && var51.field878) {
                                    class21.method136(var51, false);
                                }
                            }
                            if (var50 < class136.field2079) {
                                class55 var52 = var44[var46][var50];
                                if (var52 != null && var52.field878) {
                                    class21.method136(var52, false);
                                }
                            }
                        }
                        if (var47 < class9.field114) {
                            if (var49 >= class8.field94) {
                                class55 var53 = var44[var47][var49];
                                if (var53 != null && var53.field878) {
                                    class21.method136(var53, false);
                                }
                            }
                            if (var50 < class136.field2079) {
                                class55 var54 = var44[var47][var50];
                                if (var54 != null && var54.field878) {
                                    class21.method136(var54, false);
                                }
                            }
                        }
                        if (class325.field5619 == 0) {
                            if (!var22) {
                                class135.field2063 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class135.field2063 = false;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)I")
    public abstract int method1289(int arg0);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public abstract void method1293(boolean arg0, Component arg1);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method1295(Component arg0, int arg1);
}
