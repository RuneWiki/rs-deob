import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class607 {

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
    public int field8813 = 128;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "I")
    public int field8815 = 128;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
    public int field8816;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public int field8808;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public int field8809;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public int field8810;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "[I")
    public static int[] field8811 = new int[3];

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "Lqaa;")
    public static class27 field8817 = new class27(42, 6);

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public static int field8807;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public static int field8812;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "I")
    public static int field8814;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILji;)V")
    public final void method3510(int arg0, class607 arg1) {
        this.field8810 = arg1.field8810;
        this.field8815 = arg1.field8815;
        this.field8813 = arg1.field8813;
        this.field8809 = arg1.field8809;
        int var3 = 8 / ((59 - arg0) / 45);
        field8814++;
        this.field8808 = arg1.field8808;
        this.field8816 = arg1.field8816;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
    public static void method3511(int arg0) {
        field8817 = null;
        field8811 = null;
        if (arg0 < 73) {
            method3511(21);
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)Lji;")
    public final class607 method3512(int arg0) {
        if (arg0 <= 31) {
            return null;
        } else {
            field8812++;
            return new class607(this.field8816, this.field8813, this.field8815, this.field8808, this.field8809, this.field8810);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIZI)V")
    public static final void method3513(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class460.field6635 = arg3;
        field8807++;
        if (arg4 < 74) {
            method3513(110, -50, -9, 23, 84, false, 98);
        }
        class435.field6080 = arg2;
        class432.field6036 = arg0;
        class268.field3874 = arg6;
        class208.field2974 = arg1;
        if (arg5 && class460.field6635 >= 100) {
            class685.field9660 = class435.field6080 * 512 + 256;
            class260.field3810 = class268.field3874 * 512 + 256;
            class136.field2118 = class534.method3136(1, class312.field4409, class685.field9660, class260.field3810) - class432.field6036;
        }
        class666.field9338 = 2;
        class411.field5689 = -1;
        class679.field9569 = -1;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(I)V")
    public class607(int arg0) {
        this.field8816 = arg0;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(IIIIII)V")
    private class607(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8816 = arg0;
        this.field8808 = arg3;
        this.field8809 = arg4;
        this.field8813 = arg1;
        this.field8810 = arg5;
        this.field8815 = arg2;
    }
}
