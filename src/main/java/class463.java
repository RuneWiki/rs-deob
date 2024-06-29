import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class463 {

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "Z")
    public static boolean field6530 = false;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public static int field6533 = 100;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "Lef;")
    public static class512 field6532 = new class512();

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "Lsaa;")
    public static class345 field6534 = new class345(6, 1);

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public static int field6528;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field6529;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field6531;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "[Ljd;")
    public static class241[] field6535;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V")
    public static void method2780(boolean arg0) {
        field6532 = null;
        field6534 = null;
        if (arg0) {
            method2780(false);
        }
        field6535 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)I")
    public final int method2781(int arg0, int arg1, int arg2) {
        field6531++;
        int var4 = class714.field9895 <= arg2 ? arg2 : class714.field9895;
        if (class100.field1155 == this) {
            return 0;
        } else if (arg1 != 0) {
            return 56;
        } else if (class564.field8005 == this) {
            return var4 - arg0;
        } else if (class784.field10758 == this) {
            return (var4 - arg0) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ti", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6529++;
        throw new IllegalStateException();
    }
}
