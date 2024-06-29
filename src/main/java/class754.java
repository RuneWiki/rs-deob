import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class754 {

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "I")
    public static int field10534;

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "I")
    public static int field10535;

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "I")
    public static int field10536;

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "I")
    public static int field10538;

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "I")
    public static int field10539;

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "I")
    public static int field10541;

    @OriginalMember(owner = "client!lr", name = "k", descriptor = "Loda;")
    public class119 field10542;

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "Ljda;")
    public static class227 field10540;

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "Llr;")
    public class754 field10537;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "Ljava/io/FileOutputStream;")
    public static FileOutputStream field10532;

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "[I")
    public static int[] field10533;

    static {
        new class73("", 73);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Z)V", line = 4)
    public final void method4201(boolean arg0) {
        field10534++;
        if (class359.field5216 >= 500) {
            return;
        }
        this.field10542 = null;
        this.field10537 = class726.field10141;
        class726.field10141 = this;
        if (!arg0) {
            method4204(-61, null, -110, -45);
        }
        class359.field5216++;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V", line = 25)
    public static void method4202(int arg0) {
        field10532 = null;
        if (arg0 != -2114) {
            method4203(false);
        }
        field10533 = null;
        field10540 = null;
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(Z)V", line = 48)
    public static final void method4203(boolean arg0) {
        field10538++;
        class581.field8252 = arg0;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILsca;II)V", line = 57)
    public static final void method4204(int arg0, class46 arg1, int arg2, int arg3) {
        field10536++;
        if (arg1 == null) {
            return;
        }
        if (arg1.field588 != null) {
            class177 var4 = new class177();
            var4.field2737 = arg1.field588;
            var4.field2743 = arg1;
            class709.method4025(var4);
        }
        class745.field10436 = arg1.field603;
        class226.field3314 = arg1.field687;
        if (arg2 != 5131) {
            return;
        }
        class76.field1062 = arg1.field610;
        class295.field4202 = arg0;
        class389.field5865 = arg1.field657;
        class282.field3986 = true;
        class616.field8673 = arg3;
        class488.field6984 = arg1.field667;
        class673.method3850(arg1, (byte) -21);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lok;I)I", line = 92)
    public static final int method4205(class256 arg0, int arg1) {
        field10535++;
        if (arg1 <= 42) {
            field10532 = null;
        }
        if (class256.field3670 == arg0) {
            return 5120;
        } else if (class256.field3675 == arg0) {
            return 5122;
        } else if (class256.field3676 == arg0) {
            return 5124;
        } else if (class256.field3677 == arg0) {
            return 5121;
        } else if (class256.field3678 == arg0) {
            return 5123;
        } else if (class256.field3679 == arg0) {
            return 5125;
        } else if (class256.field3680 == arg0) {
            return 5131;
        } else if (class256.field3681 == arg0) {
            return 5126;
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
