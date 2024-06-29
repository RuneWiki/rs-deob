import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class199 {

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "Z")
    public static boolean field3114 = true;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "[I")
    public static int[] field3120 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public static int field3121 = -1;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "[I")
    public static int[] field3115 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3122 = "Created gameworld";

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "Z")
    public static boolean field3123 = true;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public int field3116;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "Ldl;")
    public static class123 field3124;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "Lwj;")
    public class6 field3119;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "[I")
    public int[] field3112;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method1372(int arg0, int arg1, int arg2, long arg3) {
        class49 var5 = class90.field1382[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field627 != null && var5.field627.field962 == arg3) {
            return true;
        } else if (var5.field631 != null && var5.field631.field4265 == arg3) {
            return true;
        } else if (var5.field635 != null && var5.field635.field201 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field639; var6++) {
                if (var5.field643[var6].field4497 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II[S[Ljava/lang/String;I)V")
    public static final void method1373(int arg0, int arg1, short[] arg2, String[] arg3, int arg4) {
        field3118++;
        if (arg1 < arg0) {
            int var5 = (arg0 + arg1) / 2;
            String var6 = arg3[var5];
            int var7 = arg1;
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var6;
            short var8 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var8;
            for (int var9 = arg1; var9 < arg0; var9++) {
                if (var6 == null || arg3[var9] != null && (var9 & 0x1) > arg3[var9].compareTo(var6)) {
                    String var10 = arg3[var9];
                    arg3[var9] = arg3[var7];
                    arg3[var7] = var10;
                    short var11 = arg2[var9];
                    arg2[var9] = arg2[var7];
                    arg2[var7++] = var11;
                }
            }
            arg3[arg0] = arg3[var7];
            arg3[var7] = var6;
            arg2[arg0] = arg2[var7];
            arg2[var7] = var8;
            method1373(var7 - 1, arg1, arg2, arg3, -3);
            method1373(arg0, var7 + 1, arg2, arg3, -3);
        }
        if (arg4 != -3) {
            field3115 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1374(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 > -123) {
            field3120 = null;
        }
        for (int var9 = 0; var9 < class107.field1644.field1110; var9++) {
            if (class107.field1644.method530(-34, var9)) {
                int var10 = class120.field1751 + class104.field1611 - class107.field1644.field1096[var9] - 1;
                int var11 = class107.field1644.field1105[var9] - class47.field599;
                int var12 = arg4 + ((arg6 - arg4) * (var10 - arg0) / (arg3 - arg0));
                int var13 = class107.field1644.method523(var9, 25488);
                int var14 = (var11 - arg2) * (arg8 - arg7) / (arg5 - arg2) + arg7;
                int var15 = 16777215;
                class180 var16 = null;
                if (var13 == 0) {
                    if ((double) class7.field106 == 3.0D) {
                        var16 = class285.field4519;
                    }
                    if ((double) class7.field106 == 4.0D) {
                        var16 = class184.field2891;
                    }
                    if ((double) class7.field106 == 6.0D) {
                        var16 = class192.field3039;
                    }
                    if ((double) class7.field106 >= 8.0D) {
                        var16 = class94.field1461;
                    }
                }
                if (var13 == 1) {
                    if ((double) class7.field106 == 3.0D) {
                        var16 = class192.field3039;
                    }
                    if ((double) class7.field106 == 4.0D) {
                        var16 = class94.field1461;
                    }
                    if ((double) class7.field106 == 6.0D) {
                        var16 = class37.field503;
                    }
                    if ((double) class7.field106 >= 8.0D) {
                        var16 = class253.field4043;
                    }
                }
                if (var13 == 2) {
                    if ((double) class7.field106 == 3.0D) {
                        var16 = class37.field503;
                    }
                    if ((double) class7.field106 == 4.0D) {
                        var16 = class253.field4043;
                    }
                    if ((double) class7.field106 == 6.0D) {
                        var16 = class123.field1811;
                    }
                    var15 = 16755200;
                    if ((double) class7.field106 >= 8.0D) {
                        var16 = class35.field451;
                    }
                }
                if (class107.field1644.field1095[var9] != -1) {
                    var15 = class107.field1644.field1095[var9];
                }
                if (var16 != null) {
                    int var17 = class144.field2118.method1303(class107.field1644.field1112[var9], (int[]) null, class249.field3994);
                    int var18 = var12 - var16.method1246() * (var17 - 1) / 2;
                    int var19 = var18 + var16.method1245() / 2;
                    for (int var20 = 0; var20 < var17; var20++) {
                        String var21 = class249.field3994[var20];
                        if (var20 < var17 - 1) {
                            var21 = var21.substring(0, var21.length() - 4);
                        }
                        var16.method1248(var21, var14, var19, var15, true);
                        var19 += var16.method1246();
                    }
                }
            }
        }
        field3117++;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V")
    public static void method1375(boolean arg0) {
        field3115 = null;
        field3120 = null;
        field3122 = null;
        if (arg0) {
            field3124 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(Z)V")
    public static final void method1376(boolean arg0) {
        int var1 = class70.method476(true);
        field3113++;
        if (arg0) {
            method1376(true);
        }
        if (var1 == 0) {
            class66.field929 = null;
            class249.method1678(0, -109);
        } else if (var1 == 1) {
            class23.method157((byte) 0, 4);
            class249.method1678(512, -54);
            class80.method556((byte) -114);
        } else {
            class23.method157((byte) (class64.field900 - 4 & 0xFF), 4);
            class249.method1678(2, -123);
        }
    }
}
