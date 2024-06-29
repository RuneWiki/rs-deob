import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class615 implements class681 {

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "Ljava/lang/String;")
    private String field8769;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "Lla;")
    private class423 field8771;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "Z")
    public static boolean field8768 = false;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field8767;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field8770;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public static int field8772;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)Lwea;")
    public final class115 method2019(int arg0) {
        field8770++;
        if (arg0 != 10251) {
            this.field8771 = null;
        }
        return class115.field1601;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)V")
    public static final void method3574(int arg0, int arg1) {
        class63.field1005 = arg0;
        field8772++;
        if (arg1 == 100) {
            class141.field1924.method2220(false);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)I")
    public final int method2020(int arg0) {
        field8767++;
        if (arg0 != 28170) {
            field8768 = false;
        }
        return this.field8771.method2604(this.field8769, arg0 ^ 0xFFFF918D) ? 100 : this.field8771.method2603(this.field8769, false);
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lla;Ljava/lang/String;)V")
    public class615(class423 arg0, String arg1) {
        this.field8769 = arg1;
        this.field8771 = arg0;
    }
}
