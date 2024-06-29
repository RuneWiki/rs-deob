import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class53 {

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "Z")
    public static boolean field653 = true;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "Ljk;")
    public static class76 field655 = new class76();

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "Lej;")
    public static class204 field656 = new class204(4);

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "[Luf;")
    public static class168[] field657;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V", line = 15)
    public static void method293(int arg0) {
        field657 = null;
        field656 = null;
        if (arg0 <= 103) {
            field653 = true;
        }
        field655 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(III[[[BIBII)V", line = 46)
    public static final void method294(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class238.field3842++;
        class28.field365 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class231.field3724; var12 < class300.field5087; var12++) {
            class127[][] var13 = class92.field1424[var12];
            for (int var14 = class145.field2245; var14 < class85.field1292; var14++) {
                for (int var15 = class297.field5020; var15 < class27.field343; var15++) {
                    class127 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class83.field1252[var14 + class289.field4875 - class125.field1937][var15 + class289.field4875 - class55.field706] && arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5) {
                            var16.field1975 = true;
                            var16.field1964 = true;
                            if (var16.field1970 > 0) {
                                var16.field1962 = true;
                            } else {
                                var16.field1962 = false;
                            }
                            class28.field365++;
                        } else {
                            var16.field1975 = false;
                            var16.field1964 = false;
                            var16.field1988 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field1981 != null) {
                                    class28 var17 = var16.field1981;
                                    var17.field358.method920(30592, var17.field362, var17.field362, var17.field354, var17.field354);
                                    if (var17.field361 != null) {
                                        var17.field361.method920(30592, var17.field362, var17.field362, var17.field354, var17.field354);
                                    }
                                }
                                if (var16.field1979 != null) {
                                    class40 var18 = var16.field1979;
                                    var18.field494.method920(30592, var18.field509, var18.field509, var18.field508, var18.field508);
                                    if (var18.field499 != null) {
                                        var18.field499.method920(30592, var18.field509, var18.field509, var18.field508, var18.field508);
                                    }
                                }
                                if (var16.field1969 != null) {
                                    class292 var19 = var16.field1969;
                                    var19.field4919.method920(30592, var19.field4923, var19.field4923, var19.field4925, var19.field4925);
                                }
                                if (var16.field1971 != null) {
                                    for (int var20 = 0; var20 < var16.field1970; var20++) {
                                        class91 var21 = var16.field1971[var20];
                                        var21.field1408.method920(30592, var21.field1412, var21.field1400, var21.field1410, var21.field1406);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class227.field3686 == class118.field1835;
        GL var23 = class90.field1390;
        var23.glPushMatrix();
        var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
        if (var22) {
            class103.method771();
            class284.method1960(-1, 3, 15);
            class8.field105 = true;
            class88.method602();
            class244.field4156 = -1;
            class111.field1736 = -1;
            for (int var24 = 0; var24 < class216.field3514[0].length; var24++) {
                class192 var25 = class216.field3514[0][var24];
                float var26 = 251.5F - (var25.field3133 ? 1.0F : 0.5F);
                if (class244.field4156 != var25.field3123) {
                    class244.field4156 = var25.field3123;
                    class76.method445(var25.field3123, 125);
                    class34.method171(class289.method1985(true));
                }
                var25.method1355(class92.field1424, var26, false);
            }
            class88.method603();
        } else {
            for (int var27 = class231.field3724; var27 < class300.field5087; var27++) {
                for (int var28 = 0; var28 < class216.field3514[var27].length; var28++) {
                    class192 var29 = class216.field3514[var27][var28];
                    float var30 = 201.5F - (float) var27 * 50.0F - (var29.field3133 ? 1.0F : 0.5F);
                    if (var29.field3124 != -1 && class173.field2815.method513(var29.field3124, 0) == 4 && client.field4939) {
                        class76.method445(var29.field3123, 125);
                    }
                    var29.method1355(class92.field1424, var30, false);
                }
                if (var27 == 0 && class201.field3310 > 0) {
                    class90.method622(101.5F);
                    class100.method755(class125.field1937, class55.field706, class289.field4875, arg1, class83.field1252, class227.field3686[0]);
                }
            }
            class257.method1769(class125.field1937, class55.field706, class92.field1424);
        }
        var23.glPopMatrix();
        for (int var31 = class231.field3724; var31 < class300.field5087; var31++) {
            class127[][] var32 = class92.field1424[var31];
            for (int var33 = -class289.field4875; var33 <= 0; var33++) {
                int var34 = class125.field1937 + var33;
                int var35 = class125.field1937 - var33;
                if (var34 >= class145.field2245 || var35 < class85.field1292) {
                    for (int var36 = -class289.field4875; var36 <= 0; var36++) {
                        int var37 = class55.field706 + var36;
                        int var38 = class55.field706 - var36;
                        if (var34 >= class145.field2245) {
                            if (var37 >= class297.field5020) {
                                class127 var39 = var32[var34][var37];
                                if (var39 != null && var39.field1975) {
                                    class225.method1546(var39, true);
                                }
                            }
                            if (var38 < class27.field343) {
                                class127 var40 = var32[var34][var38];
                                if (var40 != null && var40.field1975) {
                                    class225.method1546(var40, true);
                                }
                            }
                        }
                        if (var35 < class85.field1292) {
                            if (var37 >= class297.field5020) {
                                class127 var41 = var32[var35][var37];
                                if (var41 != null && var41.field1975) {
                                    class225.method1546(var41, true);
                                }
                            }
                            if (var38 < class27.field343) {
                                class127 var42 = var32[var35][var38];
                                if (var42 != null && var42.field1975) {
                                    class225.method1546(var42, true);
                                }
                            }
                        }
                        if (class28.field365 == 0) {
                            if (!var22) {
                                class72.field965 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class231.field3724; var43 < class300.field5087; var43++) {
            class127[][] var44 = class92.field1424[var43];
            for (int var45 = -class289.field4875; var45 <= 0; var45++) {
                int var46 = class125.field1937 + var45;
                int var47 = class125.field1937 - var45;
                if (var46 >= class145.field2245 || var47 < class85.field1292) {
                    for (int var48 = -class289.field4875; var48 <= 0; var48++) {
                        int var49 = class55.field706 + var48;
                        int var50 = class55.field706 - var48;
                        if (var46 >= class145.field2245) {
                            if (var49 >= class297.field5020) {
                                class127 var51 = var44[var46][var49];
                                if (var51 != null && var51.field1975) {
                                    class225.method1546(var51, false);
                                }
                            }
                            if (var50 < class27.field343) {
                                class127 var52 = var44[var46][var50];
                                if (var52 != null && var52.field1975) {
                                    class225.method1546(var52, false);
                                }
                            }
                        }
                        if (var47 < class85.field1292) {
                            if (var49 >= class297.field5020) {
                                class127 var53 = var44[var47][var49];
                                if (var53 != null && var53.field1975) {
                                    class225.method1546(var53, false);
                                }
                            }
                            if (var50 < class27.field343) {
                                class127 var54 = var44[var47][var50];
                                if (var54 != null && var54.field1975) {
                                    class225.method1546(var54, false);
                                }
                            }
                        }
                        if (class28.field365 == 0) {
                            if (!var22) {
                                class72.field965 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class72.field965 = false;
    }
}
