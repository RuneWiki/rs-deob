import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class163 extends class185 {

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
    public static int field2250 = 0;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "Ljava/lang/String;")
    public static String field2251 = "Loading - please wait.";

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "Ljava/lang/String;")
    public static String field2255 = "Loaded sprites";

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "Z")
    public static boolean field2247 = false;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "Lle;")
    public static class259 field2256 = new class259(0, 0);

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "I")
    public static int field2260 = 0;

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "F")
    public static float field2261 = 0.0F;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "I")
    public int field2254;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "Loh;")
    public static class18 field2259;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "Ljava/lang/String;")
    public String field2248;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "Ljava/lang/String;")
    public String field2249;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "Ljava/lang/String;")
    public static String field2257;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(IIII)I", line = 10)
    public static final int method1070(int arg0, int arg1, int arg2, int arg3) {
        field2253++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg3;
        }
        if (arg2 >= -10) {
            method1072(true);
        }
        if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)Lri;", line = 33)
    public final class74 method1071(int arg0) {
        field2252++;
        return arg0 == 7 ? class179.field2605[this.field2677] : (class74) null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V", line = 44)
    public static void method1072(boolean arg0) {
        field2257 = null;
        field2259 = null;
        if (arg0) {
            method1072(false);
        }
        field2256 = null;
        field2251 = null;
        field2255 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)Lm;", line = 91)
    public static final class54 method1073(int arg0, int arg1, int arg2) {
        class225 var3 = class158.field2184[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class54 var4 = var3.field3213;
            var3.field3213 = null;
            return var4;
        }
    }
}
