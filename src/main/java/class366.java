import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public abstract class class366 {

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public int field5241;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public int field5242;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public int field5239;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field5237 = -1;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "Lpn;")
    public static class72 field5240 = new class72(42, 12);

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BII)V")
    public abstract void method375(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
    public static void method2214(int arg0) {
        if (arg0 != 12) {
            field5240 = null;
        }
        field5240 = null;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)Lfg;")
    public static final class21 method2215(int arg0) {
        field5238++;
        if (class429.field6197 == null || class218.field3062 == null) {
            return null;
        }
        if (arg0 != -1) {
            method2214(-5);
        }
        class218.field3062.method2584((byte) -25, class429.field6197);
        class21 var1 = (class21) class218.field3062.method2583(0);
        if (var1 == null) {
            return null;
        } else {
            class334 var2 = class429.field6187.method1898(36, var1.field295);
            return var2 != null && var2.field4803 && var2.method2026(2, class429.field6181) ? var1 : class299.method1883((byte) 62);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIZ)V")
    public abstract void method370(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZII)V")
    public abstract void method374(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(III)V")
    public class366(int arg0, int arg1, int arg2) {
        this.field5241 = arg1;
        this.field5242 = arg0;
        this.field5239 = arg2;
    }
}
