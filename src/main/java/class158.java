import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class158 extends class148 {

    @OriginalMember(owner = "client!dt", name = "v", descriptor = "Liv;")
    public static class64 field2467 = new class64(7, 4);

    @OriginalMember(owner = "client!dt", name = "w", descriptor = "Z")
    public static boolean field2468 = false;

    @OriginalMember(owner = "client!dt", name = "s", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!dt", name = "t", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!dt", name = "u", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!dt", name = "r", descriptor = "Liv;")
    public static class64 field2463;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IILli;ILjava/awt/Component;)Lkc;", line = 11)
    public static final class86 method1180(int arg0, int arg1, class293 arg2, int arg3, Component arg4) {
        field2466++;
        if (class256.field3725 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                class86 var5 = (class86) Class.forName("on").getDeclaredConstructor().newInstance();
                var5.field1518 = arg0;
                var5.field1489 = new int[(class320.field4899 ? 2 : 1) * 256];
                var5.method671(arg4);
                var5.field1509 = (arg0 & 0xFFFFFC00) + 1024;
                if (var5.field1509 > 16384) {
                    var5.field1509 = 16384;
                }
                var5.method674(var5.field1509);
                if (class183.field2746 > 0 && class364.field5515 == null) {
                    class364.field5515 = new class195();
                    class364.field5515.field2863 = arg2;
                    arg2.method1859(class183.field2746, true, class364.field5515);
                }
                if (class364.field5515 != null) {
                    if (class364.field5515.field2861[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class364.field5515.field2861[arg3] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class450 var6 = new class450(arg2, arg3);
                    var6.field1518 = arg0;
                    var6.field1489 = new int[(class320.field4899 ? 2 : 1) * 256];
                    var6.method671(arg4);
                    var6.field1509 = 16384;
                    var6.method674(var6.field1509);
                    if (class183.field2746 > 0 && class364.field5515 == null) {
                        class364.field5515 = new class195();
                        class364.field5515.field2863 = arg2;
                        arg2.method1859(class183.field2746, true, class364.field5515);
                    }
                    if (class364.field5515 != null) {
                        if (class364.field5515.field2861[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class364.field5515.field2861[arg3] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return arg1 == 2 ? new class86() : null;
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(Z)V", line = 115)
    public static void method1181(boolean arg0) {
        field2463 = null;
        field2467 = null;
        if (!arg0) {
            method1181(false);
        }
    }
}
