import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class93 extends class183 {

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "[I")
    public int[] field1729 = new int[] { -1 };

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "[I")
    public int[] field1734 = new int[1];

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "Ldj;")
    public static class44 field1732 = class89.method650(255, "M");

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V")
    public static final void method663(int arg0) {
        if (arg0 == -4515) {
            class74.field1431.method1179((byte) -77);
            field1727++;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II[BI)Ldj;")
    public static final class44 method664(int arg0, int arg1, byte[] arg2, int arg3) {
        int var4 = -12 / ((34 - arg1) / 36);
        field1733++;
        class44 var5 = new class44();
        var5.field822 = new byte[arg0];
        var5.field849 = 0;
        for (int var6 = arg3; var6 < arg0 + arg3; var6++) {
            if (arg2[var6] != 0) {
                var5.field822[var5.field849++] = arg2[var6];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)[Lod;")
    public static final class155[] method665(byte arg0) {
        field1735++;
        class155[] var1 = new class155[class106.field1942];
        if (arg0 != -122) {
            field1732 = null;
        }
        for (int var2 = 0; var2 < class106.field1942; var2++) {
            class155 var3 = new class155();
            var3.field2689 = class92.field1725;
            var3.field2692 = class227.field4275;
            var3.field2690 = class88.field1684[var2];
            var3.field2688 = class38.field672[var2];
            var3.field2693 = class94.field1745[var2];
            var3.field2687 = class175.field3039[var2];
            int var4 = var3.field2693 * var3.field2687;
            byte[] var5 = class58.field1082[var2];
            var3.field2691 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var3.field2691[var6] = class170.field2933[class29.method202(var5[var6], 255)];
            }
            var1[var2] = var3;
        }
        class122.method840(-33);
        return var1;
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(B)V")
    public static void method666(byte arg0) {
        field1732 = null;
        if (arg0 != -109) {
            field1728 = 54;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BILvi;ILjava/awt/Component;)Lpg;")
    public static final class168 method667(byte arg0, int arg1, class229 arg2, int arg3, Component arg4) {
        field1731++;
        if (class170.field2935 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class168 var5 = (class168) Class.forName("hh").getDeclaredConstructor().newInstance();
                var5.field2901 = arg1;
                if (arg0 >= -57) {
                    method667((byte) 123, 42, null, -32, null);
                }
                var5.field2889 = new int[(class158.field2748 ? 2 : 1) * 256];
                var5.method634(arg4);
                var5.field2903 = (-1024 & arg1) + 1024;
                if (var5.field2903 > 16384) {
                    var5.field2903 = 16384;
                }
                var5.method635(var5.field2903);
                if (class118.field2099 > 0 && class27.field477 == null) {
                    class27.field477 = new class146();
                    class27.field477.field2578 = arg2;
                    arg2.method1501(class118.field2099, class27.field477, false);
                }
                if (class27.field477 != null) {
                    if (class27.field477.field2575[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class27.field477.field2575[arg3] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class159 var6 = new class159(arg2, arg3);
                    var6.field2901 = arg1;
                    var6.field2889 = new int[(class158.field2748 ? 2 : 1) * 256];
                    var6.method634(arg4);
                    var6.field2903 = 16384;
                    var6.method635(var6.field2903);
                    if (class118.field2099 > 0 && class27.field477 == null) {
                        class27.field477 = new class146();
                        class27.field477.field2578 = arg2;
                        arg2.method1501(class118.field2099, class27.field477, false);
                    }
                    if (class27.field477 != null) {
                        if (class27.field477.field2575[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class27.field477.field2575[arg3] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class168();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
