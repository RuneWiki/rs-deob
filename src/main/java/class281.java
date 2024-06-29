import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class281 {

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "Leg;")
    public static class37 field4954 = class174.method1167("::fpsoff", -71);

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "[I")
    public static int[] field4957 = new int[50];

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "Lle;")
    public static class114 field4958 = null;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "Lid;")
    public static class226 field4956 = new class226();

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "Leg;")
    public static class37 field4959 = class174.method1167(")2", -20);

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "Lol;")
    public static class108 field4952;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "[Ldi;")
    public static class42[] field4955;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIIIILme;IZJ)Z")
    public static final boolean method1884(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class67 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class39.field635 == class218.field3754;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var24 = arg2; var24 < arg2 + arg4; var24++) {
                if (var15 < 0 || var24 < 0 || var15 >= class175.field2936 || var24 >= class160.field2675) {
                    return false;
                }
                class111 var25 = class286.field5048[arg0][var15][var24];
                if (var25 != null && var25.field1880 >= 5) {
                    return false;
                }
            }
        }
        class27 var16 = new class27();
        var16.field381 = arg11;
        var16.field383 = arg0;
        var16.field386 = arg5;
        var16.field395 = arg6;
        var16.field392 = arg7;
        var16.field400 = arg8;
        var16.field394 = arg9;
        var16.field402 = arg1;
        var16.field397 = arg2;
        var16.field387 = arg1 + arg3 - 1;
        var16.field399 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; var17++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var17 > arg1) {
                    var21++;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class286.field5048[var22][var17][var20] == null) {
                        class286.field5048[var22][var17][var20] = new class111(var22, var17, var20);
                    }
                }
                class111 var23 = class286.field5048[arg0][var17][var20];
                var23.field1858[var23.field1880] = var16;
                var23.field1877[var23.field1880] = var21;
                var23.field1881 |= var21;
                var23.field1880++;
                if (var13 && class167.field2800[var17][var20] != 0) {
                    var14 = class167.field2800[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
                for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
                    if (class167.field2800[var18][var19] == 0) {
                        class167.field2800[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class134.field2320[class224.field3839++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V")
    public static void method1885(int arg0) {
        field4958 = null;
        if (arg0 != 1) {
            return;
        }
        field4952 = null;
        field4955 = null;
        field4956 = null;
        field4957 = null;
        field4959 = null;
        field4954 = null;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZLeg;)V")
    public static final void method1886(boolean arg0, class37 arg1) {
        field4953++;
        if (arg0) {
            int var2 = class107.method719(4, arg1);
            if (var2 != -1) {
                class28.method159(-25, class146.field2477.field68[var2], class146.field2477.field69[var2]);
            }
        }
    }
}
