import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public abstract class class262 {

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field4378 = 500;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field4383 = 0;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "[I")
    public static int[] field4381 = new int[200];

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Lce;")
    public static class126 field4379 = class206.method1445(-7923, "Impossible de trouver ");

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V", line = 13)
    public static void method1766(byte arg0) {
        if (arg0 != -89) {
            method1768(-74, (class313) null);
        }
        field4379 = null;
        field4381 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZILjava/lang/Object;)[B", line = 44)
    public static final byte[] method1767(boolean arg0, int arg1, Object arg2) {
        field4382++;
        if (arg2 == null) {
            return null;
        } else if ((arg2 instanceof byte[])) {
            byte[] var4 = (byte[]) ((byte[]) arg2);
            return arg0 ? class7.method41(var4, true) : var4;
        } else if ((arg2 instanceof class200)) {
            class200 var3 = (class200) arg2;
            return var3.method716(-58);
        } else if (arg1 <= 36) {
            return (byte[]) null;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILcc;)V", line = 86)
    public static final void method1768(int arg0, class313 arg1) {
        if (arg0 == -15198) {
            class95.field1501 = arg1;
            field4377++;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public abstract void method113(int arg0);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)I")
    public abstract int method112(int arg0, int arg1, int arg2);
}
