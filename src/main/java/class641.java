import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class641 extends class416 {

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public int field8994;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "F")
    public static float field8990;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field8987;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field8989;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
    public static int field8992;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public static int field8993;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "J")
    public static long field8991;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "Lri;")
    public static class97 field8988;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3716(int arg0, int arg1, byte arg2) {
        if (arg2 > -108) {
            field8990 = 0.28657743F;
        }
        field8987++;
        return (arg0 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)Lcw;")
    public static final class165 method3717(int arg0) {
        field8989++;
        class165 var1 = class1.method1(-109);
        var1.field2771 = 0;
        var1.field2777 = null;
        var1.field2776 = new class580(5000);
        return arg0 == 8592 ? var1 : null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)I")
    public static final int method3718(boolean arg0) {
        field8993++;
        if (arg0) {
            method3718(false);
        }
        return 46;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
    public static void method3719(int arg0) {
        field8988 = null;
        int var1 = 89 % ((arg0 + 52) / 32);
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(I)V")
    public class641(int arg0) {
        this.field8994 = arg0;
    }
}
