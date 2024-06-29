import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class298 {

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "[I")
    public static int[] field5068 = new int[100];

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "Lok;")
    public static class146 field5065 = class235.method1724(-12908, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "Lok;")
    public static class146 field5069 = class235.method1724(-12908, "hint_mapedge");

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "[[[B")
    public static byte[][][] field5067;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIBI)V", line = 31)
    public static final void method2111(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg4 >= class123.field2008 && class318.field5394 >= arg4) {
            int var5 = class21.method153(-127, arg2, class151.field2564, class126.field2058);
            int var6 = class21.method153(-123, arg1, class151.field2564, class126.field2058);
            class173.method1337(arg0, var5, -27551, var6, arg4);
        }
        field5063++;
        if (arg3 > -104) {
            method2114(-101, -68, true, 8, 58, 124);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V", line = 59)
    public static void method2112(int arg0) {
        if (arg0 != 0) {
            field5068 = (int[]) null;
        }
        field5067 = (byte[][][]) null;
        field5065 = null;
        field5069 = null;
        field5068 = null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(III[[[BIBII)V", line = 75)
    public static final void method2113(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class40.field725++;
        class46.field817 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class121.field1988; var12 < class161.field2732; var12++) {
            class11[][] var13 = class203.field3382[var12];
            for (int var14 = class218.field3611; var14 < class43.field740; var14++) {
                for (int var15 = class189.field3129; var15 < class36.field664; var15++) {
                    class11 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class202.field3364[var14 + class132.field2230 - class106.field1703][var15 + class132.field2230 - class175.field2932] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field207 = true;
                            var16.field224 = true;
                            if (var16.field218 > 0) {
                                var16.field220 = true;
                            } else {
                                var16.field220 = false;
                            }
                            class46.field817++;
                        } else {
                            var16.field207 = false;
                            var16.field224 = false;
                            var16.field227 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field212 != null) {
                                    class278 var17 = var16.field212;
                                    var17.field4779.method316(0, var12, var17.field4775, var17.field4782, var17.field4777);
                                    if (var17.field4774 != null) {
                                        var17.field4774.method316(0, var12, var17.field4775, var17.field4782, var17.field4777);
                                    }
                                }
                                if (var16.field223 != null) {
                                    class19 var18 = var16.field223;
                                    var18.field371.method316(var18.field376, var12, var18.field370, var18.field379, var18.field375);
                                    if (var18.field373 != null) {
                                        var18.field373.method316(var18.field376, var12, var18.field370, var18.field379, var18.field375);
                                    }
                                }
                                if (var16.field205 != null) {
                                    class164 var19 = var16.field205;
                                    var19.field2785.method316(0, var12, var19.field2781, var19.field2773, var19.field2782);
                                }
                                if (var16.field217 != null) {
                                    for (int var20 = 0; var20 < var16.field218; var20++) {
                                        class311 var21 = var16.field217[var20];
                                        var21.field5300.method316(var21.field5291, var12, var21.field5288, var21.field5301, var21.field5290);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class297.field5051 == class174.field2914;
        if (class271.field4640) {
            GL var23 = class271.field4641;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class159.method1247();
                class140.method1033(-1, 3, -5);
                class212.field3508 = true;
                class69.method513();
                class225.field3756 = -1;
                class175.field2937 = -1;
                for (int var24 = 0; var24 < class281.field4823[0].length; var24++) {
                    class286 var25 = class281.field4823[0][var24];
                    float var26 = 251.5F - (var25.field4874 ? 1.0F : 0.5F);
                    if (class225.field3756 != var25.field4882) {
                        class225.field3756 = var25.field4882;
                        class40.method282(var25.field4882, 5000);
                        class231.method1693(class51.method416(31));
                    }
                    var25.method2056(class203.field3382, var26, false);
                }
                class69.method511();
            } else {
                int var27 = class121.field1988;
                while (true) {
                    if (var27 >= class161.field2732) {
                        class53.method431(class106.field1703, class175.field2932, class203.field3382);
                        break;
                    }
                    for (int var28 = 0; var28 < class281.field4823[var27].length; var28++) {
                        class286 var29 = class281.field4823[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field4874 ? 1.0F : 0.5F);
                        if (var29.field4871 != -1 && class109.field1747.method822(var29.field4871, (byte) 34) == 4 && class117.field1888) {
                            class40.method282(var29.field4882, 5000);
                        }
                        var29.method2056(class203.field3382, var30, false);
                    }
                    if (var27 == 0 && class27.field478 > 0) {
                        class271.method1979(101.5F);
                        class48.method393(class106.field1703, class175.field2932, class132.field2230, arg1, class202.field3364, class174.field2914[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class121.field1988; var31 < class161.field2732; var31++) {
            class11[][] var32 = class203.field3382[var31];
            for (int var33 = -class132.field2230; var33 <= 0; var33++) {
                int var34 = class106.field1703 + var33;
                int var35 = class106.field1703 - var33;
                if (var34 >= class218.field3611 || var35 < class43.field740) {
                    for (int var36 = -class132.field2230; var36 <= 0; var36++) {
                        int var37 = class175.field2932 + var36;
                        int var38 = class175.field2932 - var36;
                        if (var34 >= class218.field3611) {
                            if (var37 >= class189.field3129) {
                                class11 var39 = var32[var34][var37];
                                if (var39 != null && var39.field207) {
                                    class182.method1443(var39, true);
                                }
                            }
                            if (var38 < class36.field664) {
                                class11 var40 = var32[var34][var38];
                                if (var40 != null && var40.field207) {
                                    class182.method1443(var40, true);
                                }
                            }
                        }
                        if (var35 < class43.field740) {
                            if (var37 >= class189.field3129) {
                                class11 var41 = var32[var35][var37];
                                if (var41 != null && var41.field207) {
                                    class182.method1443(var41, true);
                                }
                            }
                            if (var38 < class36.field664) {
                                class11 var42 = var32[var35][var38];
                                if (var42 != null && var42.field207) {
                                    class182.method1443(var42, true);
                                }
                            }
                        }
                        if (class46.field817 == 0) {
                            if (!var22) {
                                class143.field2385 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class121.field1988; var43 < class161.field2732; var43++) {
            class11[][] var44 = class203.field3382[var43];
            for (int var45 = -class132.field2230; var45 <= 0; var45++) {
                int var46 = class106.field1703 + var45;
                int var47 = class106.field1703 - var45;
                if (var46 >= class218.field3611 || var47 < class43.field740) {
                    for (int var48 = -class132.field2230; var48 <= 0; var48++) {
                        int var49 = class175.field2932 + var48;
                        int var50 = class175.field2932 - var48;
                        if (var46 >= class218.field3611) {
                            if (var49 >= class189.field3129) {
                                class11 var51 = var44[var46][var49];
                                if (var51 != null && var51.field207) {
                                    class182.method1443(var51, false);
                                }
                            }
                            if (var50 < class36.field664) {
                                class11 var52 = var44[var46][var50];
                                if (var52 != null && var52.field207) {
                                    class182.method1443(var52, false);
                                }
                            }
                        }
                        if (var47 < class43.field740) {
                            if (var49 >= class189.field3129) {
                                class11 var53 = var44[var47][var49];
                                if (var53 != null && var53.field207) {
                                    class182.method1443(var53, false);
                                }
                            }
                            if (var50 < class36.field664) {
                                class11 var54 = var44[var47][var50];
                                if (var54 != null && var54.field207) {
                                    class182.method1443(var54, false);
                                }
                            }
                        }
                        if (class46.field817 == 0) {
                            if (!var22) {
                                class143.field2385 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class143.field2385 = false;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIZIII)V", line = 449)
    public static final void method2114(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg2) {
            return;
        }
        if (arg0 <= class318.field5394 && arg4 >= class123.field2008) {
            boolean var6;
            if (arg5 < class151.field2564) {
                var6 = false;
                arg5 = class151.field2564;
            } else if (arg5 <= class126.field2058) {
                var6 = true;
            } else {
                arg5 = class126.field2058;
                var6 = false;
            }
            boolean var7;
            if (arg3 < class151.field2564) {
                var7 = false;
                arg3 = class151.field2564;
            } else if (class126.field2058 >= arg3) {
                var7 = true;
            } else {
                arg3 = class126.field2058;
                var7 = false;
            }
            if (class123.field2008 <= arg0) {
                class40.method281(arg1, arg5, class81.field1297[arg0++], arg3, 7);
            } else {
                arg0 = class123.field2008;
            }
            if (arg4 > class318.field5394) {
                arg4 = class318.field5394;
            } else {
                class40.method281(arg1, arg5, class81.field1297[arg4--], arg3, 7);
            }
            if (var6 && var7) {
                for (int var8 = arg0; var8 <= arg4; var8++) {
                    int[] var9 = class81.field1297[var8];
                    var9[arg5] = var9[arg3] = arg1;
                }
            } else if (var6) {
                for (int var11 = arg0; var11 <= arg4; var11++) {
                    class81.field1297[var11][arg5] = arg1;
                }
            } else if (var7) {
                for (int var10 = arg0; var10 <= arg4; var10++) {
                    class81.field1297[var10][arg3] = arg1;
                }
            }
        }
        field5064++;
    }
}
