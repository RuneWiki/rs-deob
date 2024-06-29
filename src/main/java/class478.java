import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public abstract class class478 {

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "[I")
    public static int[] field5956 = new int[2];

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "I")
    public static int field5958 = 0;

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "I")
    public static int field5957;

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V", line = 15)
    public static void method2613(int arg0) {
        field5956 = null;
        if (arg0 != -11370) {
            field5956 = null;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)V", line = 25)
    public static final void method2614(int arg0, int arg1) {
        class208 var2 = class634.field8597;
        synchronized (class634.field8597) {
            class634.field8597.method1222(arg0 + 23344, arg1);
        }
        if (arg0 != -8780) {
            field5958 = 55;
        }
        field5957++;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IB)I")
    public abstract int method2610(int arg0, byte arg1);

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(BI)V")
    public abstract void method2611(byte arg0, int arg1);

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)Laca;")
    public abstract class682 method2612(int arg0);

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(II)[B")
    public abstract byte[] method2615(int arg0, int arg1);
}
