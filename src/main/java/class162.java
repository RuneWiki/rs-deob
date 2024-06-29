import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class162 {

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field3088 = 0;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "Lsd;")
    public static class166 field3090 = class135.method935("titlebutton", 0);

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field3092 = 0;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public abstract void method1093(int arg0);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)V")
    public static void method1094(boolean arg0) {
        field3090 = null;
        if (!arg0) {
            field3090 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)I")
    public abstract int method1095(int arg0, int arg1, int arg2);
}
