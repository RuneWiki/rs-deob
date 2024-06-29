import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public abstract class class207 {

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "[Z")
    public static boolean[] field3707 = new boolean[8];

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "Lsf;")
    public static class108 field3708 = class140.method973(255, "<br>");

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "Lsf;")
    public static class108 field3710 = class140.method973(255, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "Lsf;")
    private static class108 field3709 = class140.method973(255, "Take");

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "Lsf;")
    public static class108 field3711 = field3709;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "[Lsf;")
    public static class108[] field3712;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIBI)V", line = 8)
    public static final void method1445(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3706++;
        class126.field2121 = class152.field2757 * arg0 / arg1;
        class301.field5243 = -1;
        if (arg3 == -85) {
            class25.field382 = -1;
            class202.field3652 = class74.field1113 * arg4 / arg2;
            class137.method943(arg3 ^ 0x54);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(III[[[BIBII)V", line = 30)
    public static final void method1446(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class60.field960++;
        class103.field1804 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class209.field3738; var12 < class60.field893; var12++) {
            class74[][] var13 = class99.field1759[var12];
            for (int var14 = class269.field4719; var14 < class64.field1024; var14++) {
                for (int var15 = class62.field992; var15 < class14.field188; var15++) {
                    class74 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class78.field1179[var14 + class288.field5040 - class209.field3730][var15 + class288.field5040 - class131.field2237] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field1114 = true;
                            var16.field1138 = true;
                            if (var16.field1119 > 0) {
                                var16.field1145 = true;
                            } else {
                                var16.field1145 = false;
                            }
                            class103.field1804++;
                        } else {
                            var16.field1114 = false;
                            var16.field1138 = false;
                            var16.field1132 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field1117 != null) {
                                    class174 var17 = var16.field1117;
                                    var17.field3183.method99(0, var12, var17.field3189, var17.field3181, var17.field3187);
                                    if (var17.field3173 != null) {
                                        var17.field3173.method99(0, var12, var17.field3189, var17.field3181, var17.field3187);
                                    }
                                }
                                if (var16.field1140 != null) {
                                    class36 var18 = var16.field1140;
                                    var18.field513.method99(var18.field503, var12, var18.field498, var18.field496, var18.field501);
                                    if (var18.field510 != null) {
                                        var18.field510.method99(var18.field503, var12, var18.field498, var18.field496, var18.field501);
                                    }
                                }
                                if (var16.field1141 != null) {
                                    class258 var19 = var16.field1141;
                                    var19.field4557.method99(0, var12, var19.field4553, var19.field4563, var19.field4559);
                                }
                                if (var16.field1118 != null) {
                                    for (int var20 = 0; var20 < var16.field1119; var20++) {
                                        class326 var21 = var16.field1118[var20];
                                        var21.field5570.method99(var21.field5566, var12, var21.field5550, var21.field5560, var21.field5549);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class278.field4883 == class105.field1819;
        if (class231.field4051) {
            GL var23 = class231.field4052;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class126.method868();
                class59.method403(-1, (byte) -91, 3);
                class1.field18 = true;
                class150.method1065();
                class169.field3036 = -1;
                class304.field5291 = -1;
                for (int var24 = 0; var24 < class36.field499[0].length; var24++) {
                    class133 var25 = class36.field499[0][var24];
                    float var26 = 251.5F - (var25.field2270 ? 1.0F : 0.5F);
                    if (class169.field3036 != var25.field2279) {
                        class169.field3036 = var25.field2279;
                        class221.method1517(var25.field2279, -64);
                        class217.method1493(class288.method2059(0));
                    }
                    var25.method915(class99.field1759, var26, false);
                }
                class150.method1068();
            } else {
                int var27 = class209.field3738;
                while (true) {
                    if (var27 >= class60.field893) {
                        class267.method1935(class209.field3730, class131.field2237, class99.field1759);
                        break;
                    }
                    for (int var28 = 0; var28 < class36.field499[var27].length; var28++) {
                        class133 var29 = class36.field499[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field2270 ? 1.0F : 0.5F);
                        if (var29.field2288 != -1 && class263.field4661.method569((byte) -96, var29.field2288) == 4 && class60.field962) {
                            class221.method1517(var29.field2279, -72);
                        }
                        var29.method915(class99.field1759, var30, false);
                    }
                    if (var27 == 0 && class247.field4280 > 0) {
                        class231.method1581(101.5F);
                        class238.method1639(class209.field3730, class131.field2237, class288.field5040, arg1, class78.field1179, class278.field4883[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class209.field3738; var31 < class60.field893; var31++) {
            class74[][] var32 = class99.field1759[var31];
            for (int var33 = -class288.field5040; var33 <= 0; var33++) {
                int var34 = class209.field3730 + var33;
                int var35 = class209.field3730 - var33;
                if (var34 >= class269.field4719 || var35 < class64.field1024) {
                    for (int var36 = -class288.field5040; var36 <= 0; var36++) {
                        int var37 = class131.field2237 + var36;
                        int var38 = class131.field2237 - var36;
                        if (var34 >= class269.field4719) {
                            if (var37 >= class62.field992) {
                                class74 var39 = var32[var34][var37];
                                if (var39 != null && var39.field1114) {
                                    class109.method794(var39, true);
                                }
                            }
                            if (var38 < class14.field188) {
                                class74 var40 = var32[var34][var38];
                                if (var40 != null && var40.field1114) {
                                    class109.method794(var40, true);
                                }
                            }
                        }
                        if (var35 < class64.field1024) {
                            if (var37 >= class62.field992) {
                                class74 var41 = var32[var35][var37];
                                if (var41 != null && var41.field1114) {
                                    class109.method794(var41, true);
                                }
                            }
                            if (var38 < class14.field188) {
                                class74 var42 = var32[var35][var38];
                                if (var42 != null && var42.field1114) {
                                    class109.method794(var42, true);
                                }
                            }
                        }
                        if (class103.field1804 == 0) {
                            if (!var22) {
                                class1.field7 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class209.field3738; var43 < class60.field893; var43++) {
            class74[][] var44 = class99.field1759[var43];
            for (int var45 = -class288.field5040; var45 <= 0; var45++) {
                int var46 = class209.field3730 + var45;
                int var47 = class209.field3730 - var45;
                if (var46 >= class269.field4719 || var47 < class64.field1024) {
                    for (int var48 = -class288.field5040; var48 <= 0; var48++) {
                        int var49 = class131.field2237 + var48;
                        int var50 = class131.field2237 - var48;
                        if (var46 >= class269.field4719) {
                            if (var49 >= class62.field992) {
                                class74 var51 = var44[var46][var49];
                                if (var51 != null && var51.field1114) {
                                    class109.method794(var51, false);
                                }
                            }
                            if (var50 < class14.field188) {
                                class74 var52 = var44[var46][var50];
                                if (var52 != null && var52.field1114) {
                                    class109.method794(var52, false);
                                }
                            }
                        }
                        if (var47 < class64.field1024) {
                            if (var49 >= class62.field992) {
                                class74 var53 = var44[var47][var49];
                                if (var53 != null && var53.field1114) {
                                    class109.method794(var53, false);
                                }
                            }
                            if (var50 < class14.field188) {
                                class74 var54 = var44[var47][var50];
                                if (var54 != null && var54.field1114) {
                                    class109.method794(var54, false);
                                }
                            }
                        }
                        if (class103.field1804 == 0) {
                            if (!var22) {
                                class1.field7 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class1.field7 = false;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V", line = 441)
    public static void method1447(int arg0) {
        field3708 = null;
        field3710 = null;
        field3712 = null;
        field3711 = null;
        field3707 = null;
        int var1 = -41 % ((-arg0 - 45) / 51);
        field3709 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I[B)V")
    public abstract void method216(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)[B")
    public abstract byte[] method215(int arg0);
}
