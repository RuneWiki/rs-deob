import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class448 {

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "I")
    public int field6604;

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "Lbg;")
    public static class324 field6606 = new class324(66, 0);

    @OriginalMember(owner = "client!sp", name = "h", descriptor = "[[I")
    public static int[][] field6611 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "I")
    public static int field6605;

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "I")
    public static int field6608;

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "I")
    public static int field6609;

    @OriginalMember(owner = "client!sp", name = "g", descriptor = "I")
    public static int field6610;

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "Ll;")
    public static class16 field6607;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIIIILr;)V", line = 3)
    public static final void method2715(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class121 arg6) {
        class274.method1762(arg4, arg6.field6335, arg6.field6334, arg3, arg1, arg0, arg5, 503, arg6.field6328, arg2);
        field6608++;
    }

    @OriginalMember(owner = "client!sp", name = "toString", descriptor = "()Ljava/lang/String;", line = 16)
    public final String toString() {
        field6609++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 29)
    public class448(String arg0, int arg1) {
        this.field6604 = arg1;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)V", line = 41)
    public static final void method2716(int arg0) {
        field6605++;
        if (arg0 == -11712) {
            for (int var1 = 0; var1 < 100; var1++) {
                class342.field4736[var1] = true;
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(I)V", line = 58)
    public static void method2717(int arg0) {
        field6607 = null;
        field6611 = null;
        field6606 = null;
        if (arg0 < 116) {
            field6607 = null;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(BI)V", line = 71)
    public static final void method2718(byte arg0, int arg1) {
        field6610++;
        if (arg0 <= 123) {
            method2717(95);
        }
        class215 var2 = class171.method1208(arg1, (byte) 123, 8);
        var2.method1469((byte) -91);
    }
}
