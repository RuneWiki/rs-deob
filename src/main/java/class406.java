import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public abstract class class406 extends class154 {

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public static int field5583 = 0;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "Z")
    public static boolean field5581 = false;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public static int field5582;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
    public static final void method2425(byte arg0) {
        field5582++;
        class289.method1845(0);
        int var1 = 58 % ((45 - arg0) / 39);
        class618.field8597 = false;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lfca;Z)V")
    public abstract void method1292(class93 arg0, boolean arg1);

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZLgca;)V")
    public abstract void method1291(boolean arg0, class265 arg1);
}
