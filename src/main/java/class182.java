import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class182 extends class623 {

    @OriginalMember(owner = "client!r", name = "x", descriptor = "F")
    public static float field2147;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "Lmea;")
    public static class428 field2148;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public static void method1125(int arg0) {
        if (arg0 <= -14) {
            field2148 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(CI)Z")
    public static final boolean method1126(char arg0, int arg1) {
        field2146++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class412.method2524(48, arg0)) {
            return true;
        } else if (arg1 == 15555) {
            char[] var2 = class100.field1045;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg0 == var7) {
                    return true;
                }
            }
            char[] var4 = class93.field981;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }
}
