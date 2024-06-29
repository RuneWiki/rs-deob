import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class438 {

    @OriginalMember(owner = "client!la", name = "c", descriptor = "Ljn;")
    public static class134 field6069 = new class134(112, 6);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field6067;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field6068;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIBI)Z")
    public static final boolean method2631(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field6068++;
        if (!class623.field8736 || !class19.field125) {
            return false;
        } else if (class380.field5448 < 100) {
            return false;
        } else if (class322.method2044(arg4, arg2, arg0, 1)) {
            if (arg3 != 14) {
                method2632(true);
            }
            int var5 = arg4 << class732.field10110;
            int var6 = arg2 << class732.field10110;
            if (class554.method3262(class661.field9303[arg0].method2525(arg4, arg2, (byte) 114), class179.field2263, arg1, var6, -10796, var5, class179.field2263)) {
                class329.field4619++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V")
    public static void method2632(boolean arg0) {
        field6069 = null;
        if (arg0) {
            field6069 = null;
        }
    }
}
