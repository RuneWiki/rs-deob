import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class679 extends class24 {

    @OriginalMember(owner = "client!fh", name = "D", descriptor = "I")
    private int field9493 = -1;

    @OriginalMember(owner = "client!fh", name = "E", descriptor = "I")
    public static int field9494 = 0;

    @OriginalMember(owner = "client!fh", name = "C", descriptor = "Ljw;")
    public static class581 field9492 = new class581(91, 0);

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "I")
    public static int field9487;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "I")
    public static int field9488;

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "I")
    public static int field9489;

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "I")
    public static int field9490;

    @OriginalMember(owner = "client!fh", name = "B", descriptor = "I")
    public static int field9491;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILjp;)V")
    public final void method191(int arg0, class376 arg1) {
        if (arg0 > -56) {
            field9494 = -74;
        }
        field9487++;
        this.field9493 = arg1.method2359(-1);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)V")
    public static final void method3752(int arg0, int arg1) {
        field9488++;
        class274.field4062 = arg0;
        class239 var2 = class87.field1228;
        synchronized (class87.field1228) {
            class87.field1228.method1555((byte) -3);
        }
        class239 var3 = class332.field4802;
        synchronized (class332.field4802) {
            if (arg1 == 0) {
                class332.field4802.method1555((byte) -3);
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lke;I)V")
    public final void method190(class625 arg0, int arg1) {
        field9489++;
        if (arg1 != 5) {
            method3753(true, true, false);
        }
        arg0.method3440(this.field9493, false);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZZZ)V")
    public static final void method3753(boolean arg0, boolean arg1, boolean arg2) {
        field9491++;
        if (arg1) {
            class476.field6619++;
            class473.method2778(false);
        }
        if (!arg2) {
            field9492 = null;
        }
        if (arg0) {
            class347.field5095++;
            class276.method1787(21);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)V")
    public static void method3754(boolean arg0) {
        if (arg0) {
            field9492 = null;
        }
        field9492 = null;
    }
}
