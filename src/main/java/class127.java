import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class127 {

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field2129 = 0;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "Leg;")
    public static class37 field2132 = class174.method1167("0", -74);

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "Lid;")
    public static class226 field2130 = new class226();

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "Leg;")
    public static class37 field2134 = class174.method1167("m-Ochte mit Ihnen handeln)3", 102);

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "Lgh;")
    public static class212 field2127;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method905(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class228 var20 = new class228(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class286.field5048[var21][arg1][arg2] == null) {
                    class286.field5048[var21][arg1][arg2] = new class111(var21, arg1, arg2);
                }
            }
            class286.field5048[arg0][arg1][arg2].field1862 = var20;
        } else if (arg3 == 1) {
            class228 var22 = new class228(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class286.field5048[var23][arg1][arg2] == null) {
                    class286.field5048[var23][arg1][arg2] = new class111(var23, arg1, arg2);
                }
            }
            class286.field5048[arg0][arg1][arg2].field1862 = var22;
        } else {
            class164 var24 = new class164(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class286.field5048[var25][arg1][arg2] == null) {
                    class286.field5048[var25][arg1][arg2] = new class111(var25, arg1, arg2);
                }
            }
            class286.field5048[arg0][arg1][arg2].field1865 = var24;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public static final void method906(int arg0) {
        field2133++;
        int var1 = -106 % ((arg0 - 59) / 62);
        int var2 = class213.field3680.method1705((byte) 101, 8);
        if (class138.field2360 > var2) {
            for (int var3 = var2; var3 < class138.field2360; var3++) {
                class223.field3833[class131.field2182++] = class285.field5020[var3];
            }
        }
        if (class138.field2360 < var2) {
            throw new RuntimeException("gppov1");
        }
        class138.field2360 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            int var5 = class285.field5020[var4];
            class188 var6 = class98.field1526[var5];
            int var7 = class213.field3680.method1705((byte) 120, 1);
            if (var7 == 0) {
                class285.field5020[class138.field2360++] = var5;
                var6.field1759 = class72.field1146;
            } else {
                int var8 = class213.field3680.method1705((byte) 101, 2);
                if (var8 == 0) {
                    class285.field5020[class138.field2360++] = var5;
                    var6.field1759 = class72.field1146;
                    class203.field3463[class255.field4524++] = var5;
                } else if (var8 == 1) {
                    class285.field5020[class138.field2360++] = var5;
                    var6.field1759 = class72.field1146;
                    int var9 = class213.field3680.method1705((byte) 119, 3);
                    var6.method769(false, var9, 24138);
                    int var10 = class213.field3680.method1705((byte) 127, 1);
                    if (var10 == 1) {
                        class203.field3463[class255.field4524++] = var5;
                    }
                } else if (var8 == 2) {
                    class285.field5020[class138.field2360++] = var5;
                    var6.field1759 = class72.field1146;
                    int var11 = class213.field3680.method1705((byte) 102, 3);
                    var6.method769(true, var11, 24138);
                    int var12 = class213.field3680.method1705((byte) 117, 3);
                    var6.method769(true, var12, 24138);
                    int var13 = class213.field3680.method1705((byte) 101, 1);
                    if (var13 == 1) {
                        class203.field3463[class255.field4524++] = var5;
                    }
                } else if (var8 == 3) {
                    class223.field3833[class131.field2182++] = var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIII)V")
    public static final void method907(int arg0, int arg1, int arg2, int arg3) {
        class111 var4 = class286.field5048[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class273 var5 = var4.field1875;
        if (var5 != null) {
            var5.field4786 = var5.field4786 * arg3 / 16;
            var5.field4784 = var5.field4784 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V")
    public static void method908(boolean arg0) {
        field2134 = null;
        field2130 = null;
        field2132 = null;
        if (arg0) {
            method905(99, -69, -68, 10, 46, -80, -122, -52, -45, 106, -41, 39, 108, -120, -68, 66, 57, -73, -81, 114);
        }
        field2127 = null;
    }
}
