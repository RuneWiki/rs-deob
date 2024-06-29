import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class258 extends class171 {

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "[I")
    public int[] field4284 = new int[] { 0 };

    @OriginalMember(owner = "client!jl", name = "D", descriptor = "[I")
    public int[] field4293 = new int[] { -1 };

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
    public static int field4280 = 0;

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "[[I")
    public static int[][] field4285 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "Lok;")
    private static class146 field4281 = class235.method1724(-12908, "Connection lost)3");

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "Lok;")
    public static class146 field4282 = field4281;

    @OriginalMember(owner = "client!jl", name = "F", descriptor = "I")
    public static int field4295 = 0;

    @OriginalMember(owner = "client!jl", name = "x", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!jl", name = "y", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!jl", name = "z", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!jl", name = "A", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!jl", name = "B", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!jl", name = "C", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!jl", name = "E", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "Loh;")
    public static class15 field4286;

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "[Lwj;")
    public static class211[] field4283;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZI)V", line = 16)
    public static final void method1871(boolean arg0, int arg1) {
        field4288++;
        class168.field2833.method794(-17435, arg1);
        if (!arg0) {
            field4295 = 0;
        }
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)V", line = 28)
    public static final void method1872(int arg0) {
        field4289++;
        if (arg0 != 12) {
            field4281 = (class146) null;
        }
        class119.field1920.method793((byte) -106);
        class280.field4797.method793((byte) -84);
        class7.field141.method793((byte) -68);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(III)I", line = 53)
    public static final int method1873(int arg0, int arg1, int arg2) {
        field4287++;
        class258 var3 = (class258) class115.field1854.method810((byte) -107, (long) arg0);
        if (var3 == null) {
            return -1;
        } else if (~arg2 <= arg1 && var3.field4293.length > arg2) {
            return var3.field4293[arg2];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)V", line = 76)
    public static void method1874(boolean arg0) {
        field4286 = null;
        field4281 = null;
        field4285 = (int[][]) null;
        if (!arg0) {
            method1871(true, -2);
        }
        field4282 = null;
        field4283 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILml;IILjava/awt/Component;)Lfa;", line = 99)
    public static final class192 method1875(int arg0, class129 arg1, int arg2, int arg3, Component arg4) {
        field4291++;
        if (class218.field3594 == 0) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && arg0 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class192 var5 = (class192) Class.forName("qa").getDeclaredConstructor().newInstance();
                if (arg3 > -86) {
                    method1876(32, -21, (class15) null, 4);
                }
                var5.field3201 = new int[(class159.field2694 ? 2 : 1) * 256];
                var5.field3211 = arg2;
                var5.method858(arg4);
                var5.field3210 = (arg2 & 0xFFFFFC00) + 1024;
                if (var5.field3210 > 16384) {
                    var5.field3210 = 16384;
                }
                var5.method861(var5.field3210);
                if (class196.field3265 > 0 && class316.field5365 == null) {
                    class316.field5365 = new class119();
                    class316.field5365.field1922 = arg1;
                    arg1.method920(class316.field5365, class196.field3265, 0);
                }
                if (class316.field5365 != null) {
                    if (class316.field5365.field1925[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class316.field5365.field1925[arg0] = var5;
                }
                return var5;
            } catch (Throwable var10) {
                try {
                    class270 var7 = new class270(arg1, arg0);
                    var7.field3211 = arg2;
                    var7.field3201 = new int[(class159.field2694 ? 2 : 1) * 256];
                    var7.method858(arg4);
                    var7.field3210 = 16384;
                    var7.method861(var7.field3210);
                    if (class196.field3265 > 0 && class316.field5365 == null) {
                        class316.field5365 = new class119();
                        class316.field5365.field1922 = arg1;
                        arg1.method920(class316.field5365, class196.field3265, 0);
                    }
                    if (class316.field5365 != null) {
                        if (class316.field5365.field1925[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class316.field5365.field1925[arg0] = var7;
                    }
                    return var7;
                } catch (Throwable var9) {
                    return new class192();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IILoh;I)Ltg;", line = 184)
    public static final class307 method1876(int arg0, int arg1, class15 arg2, int arg3) {
        field4290++;
        if (class230.method1688(arg0, arg3, 1221, arg2)) {
            if (arg1 >= -119) {
                field4281 = (class146) null;
            }
            return class216.method1605(0);
        } else {
            return null;
        }
    }
}
