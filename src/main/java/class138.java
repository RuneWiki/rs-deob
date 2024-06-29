import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public abstract class class138 {

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public int field2522;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public int field2527;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public int field2526;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "Lvf;")
    public static class265 field2524 = class87.method582(-46, " ");

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field2528 = 0;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)V")
    public abstract void method380(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public static void method955(int arg0) {
        field2524 = null;
        if (arg0 != 10) {
            field2524 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(III)V")
    public class138(int arg0, int arg1, int arg2) {
        this.field2522 = arg2;
        this.field2527 = arg1;
        this.field2526 = arg0;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IBI)V")
    public abstract void method375(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B[[I)V")
    public static final void method956(byte arg0, int[][] arg1) {
        field2525++;
        if (arg0 >= -82) {
            field2524 = null;
        }
        class44.field973 = arg1;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZI)V")
    public static final void method957(boolean arg0, int arg1) {
        field2523++;
        if (!arg0) {
            field2524 = null;
        }
        class178 var2 = class188.method1282(arg1, 10, 261360480);
        var2.method1160(120);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIZ)V")
    public abstract void method378(int arg0, int arg1, boolean arg2);
}
