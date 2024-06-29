import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public abstract class class381 {

    @OriginalMember(owner = "client!or", name = "a", descriptor = "[I")
    public static int[] field5399 = new int[128];

    @OriginalMember(owner = "client!or", name = "b", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!or", name = "c", descriptor = "I")
    public static int field5401;

    @OriginalMember(owner = "client!or", name = "d", descriptor = "I")
    public static int field5402;

    @OriginalMember(owner = "client!or", name = "e", descriptor = "I")
    public static int field5403;

    @OriginalMember(owner = "client!or", name = "f", descriptor = "Lrj;")
    public static class352 field5404;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(II)I")
    public abstract int method2483(int arg0, int arg1);

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)Lmd;")
    public abstract class321 method2484(int arg0);

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(I)V")
    public static void method2485(int arg0) {
        if (arg0 != 128) {
            field5399 = null;
        }
        field5399 = null;
        field5404 = null;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(BI)V")
    public abstract void method2486(byte arg0, int arg1);

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V")
    public static final void method2487(byte arg0) {
        field5403++;
        class307.field4207.method1418((byte) -95);
        class61.field879.method1529(-123);
        class103.field1556.method1529(-125);
        if (arg0 != 81) {
            field5399 = null;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IB)[B")
    public abstract byte[] method2488(int arg0, byte arg1);

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(II)V")
    public static final void method2489(int arg0, int arg1) {
        class190 var2 = class62.field966;
        synchronized (class62.field966) {
            if (arg1 != 128) {
                field5399 = null;
            }
            class62.field966.method1254(arg0, -33);
        }
        field5400++;
        class190 var3 = class362.field5084;
        synchronized (class362.field5084) {
            class362.field5084.method1254(arg0, -99);
        }
    }
}
