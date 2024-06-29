import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class398 {

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "D")
    public static double field5448 = -1.0D;

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!jba", name = "e", descriptor = "I")
    public static int field5452;

    @OriginalMember(owner = "client!jba", name = "f", descriptor = "I")
    public static int field5453;

    @OriginalMember(owner = "client!jba", name = "g", descriptor = "I")
    public static int field5454;

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "Lcs;")
    public class340 field5449;

    @OriginalMember(owner = "client!jba", name = "d", descriptor = "Ljba;")
    public class398 field5451;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(IZI)Z")
    public static final boolean method2438(int arg0, boolean arg1, int arg2) {
        field5453++;
        if (arg1) {
            return false;
        } else if (arg0 >= 1000 && arg2 < 1000) {
            return true;
        } else if (arg0 >= 1000 || arg2 >= 1000) {
            return arg0 >= 1000 && arg2 >= 1000;
        } else if (class542.method3189(-12, arg0)) {
            return false;
        } else {
            return class542.method3189(-12, arg2);
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(B)V")
    public final void method2439(byte arg0) {
        field5454++;
        if (arg0 == 44 && class738.field10313 < 500) {
            this.field5449 = null;
            this.field5451 = class75.field782;
            class738.field10313++;
            class75.field782 = this;
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(IZII)I")
    public static final int method2440(int arg0, boolean arg1, int arg2, int arg3) {
        field5450++;
        class755 var4 = class149.method926(arg3 ^ Integer.MIN_VALUE, arg1, arg0);
        if (var4 == null) {
            return 0;
        } else if (arg2 >= 0 && var4.field10534.length > arg2) {
            if (arg3 != 0) {
                method2438(18, true, 1);
            }
            return var4.field10534[arg2];
        } else {
            return 0;
        }
    }
}
