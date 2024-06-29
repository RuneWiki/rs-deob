import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public class class419 {

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "I")
    public int field5773;

    @OriginalMember(owner = "client!mha", name = "b", descriptor = "[I")
    public static int[] field5774 = new int[2];

    @OriginalMember(owner = "client!mha", name = "c", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!mha", name = "d", descriptor = "I")
    public static int field5776;

    @OriginalMember(owner = "client!mha", name = "e", descriptor = "I")
    public static int field5777;

    @OriginalMember(owner = "client!mha", name = "f", descriptor = "I")
    public static int field5778;

    @OriginalMember(owner = "client!mha", name = "g", descriptor = "I")
    public static int field5779;

    @OriginalMember(owner = "client!mha", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field5779++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(I)V", line = 16)
    public static void method2428(int arg0) {
        if (arg0 <= 30) {
            method2429(false, null);
        }
        field5774 = null;
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(ZLjava/lang/String;)I", line = 28)
    public static final int method2429(boolean arg0, String arg1) {
        if (!arg0) {
            method2428(55);
        }
        field5775++;
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(IB)I", line = 40)
    public static final int method2430(int arg0, byte arg1) {
        if (arg1 != -86) {
            method2429(false, null);
        }
        field5777++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!mha", name = "b", descriptor = "(IB)V", line = 51)
    public static final void method2431(int arg0, byte arg1) {
        class442.field6091.method553(arg0, -15782);
        if (arg1 < 119) {
            method2429(true, null);
        }
        field5776++;
        class96.field1190.method553(arg0, -15782);
        class472.field6469.method553(arg0, -15782);
        class637.field8463.method553(arg0, -15782);
    }

    @OriginalMember(owner = "client!mha", name = "<init>", descriptor = "(II)V", line = 64)
    public class419(int arg0, int arg1) {
        this.field5773 = arg1;
    }
}
