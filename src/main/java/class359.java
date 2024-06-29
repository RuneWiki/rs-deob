import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public abstract class class359 {

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "I")
    public static int field5699 = 500;

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "[I")
    public static int[] field5700 = new int[2048];

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
    public static int field5697;

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "Lfk;")
    public static class606 field5698;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(III)Z", line = 6)
    public static final boolean method2404(int arg0, int arg1, int arg2) {
        if (arg1 != 500) {
            field5699 = -14;
        }
        field5697++;
        return class575.method3375(arg0, arg2, (byte) -124) || class136.method1170(arg1 - 402, arg2, arg0);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V", line = 20)
    public static void method2406(int arg0) {
        field5700 = null;
        field5698 = null;
        if (arg0 < 80) {
            method2406(33);
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILvaa;)Lvaa;")
    public abstract class434 method2405(int arg0, class434 arg1);
}
