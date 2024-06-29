import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class378 extends class621 {

    @OriginalMember(owner = "client!mea", name = "D", descriptor = "[[I")
    public static int[][] field5296 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!mea", name = "z", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!mea", name = "B", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!mea", name = "C", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!mea", name = "A", descriptor = "Lkha;")
    public static class687 field5293;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(BF)V", line = 4)
    public final void method597(byte arg0, float arg1) {
        super.field8690 = arg1;
        if (arg0 < 69) {
            method2294(123, (byte) -112);
        }
        ++field5292;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(IZII)V", line = 21)
    public final void method594(int arg0, boolean arg1, int arg2, int arg3) {
        super.field8677 = arg3;
        super.field8683 = arg2;
        super.field8686 = arg0;
        if (arg1) {
            method2294(127, (byte) -29);
        }
        ++field5294;
    }

    @OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(IIIIIF)V", line = 35)
    public class378(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!mea", name = "e", descriptor = "(I)V", line = 43)
    public static void method2293(int arg0) {
        field5296 = null;
        if (arg0 != 2) {
            method2293(77);
        }
        field5293 = null;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(IB)V", line = 54)
    public static final void method2294(int arg0, byte arg1) {
        if (class406.field5734 == null) {
            class406.field5734 = new byte[4][class613.field8591][class1.field3];
        }
        ++field5295;
        if (arg0 <= 30) {
            field5296 = null;
        }
        for (int var2 = 0; ~var2 > -5; ++var2) {
            for (int var3 = 0; var3 < class613.field8591; ++var3) {
                for (int var4 = 0; ~class1.field3 < ~var4; ++var4) {
                    class406.field5734[var2][var3][var4] = arg1;
                }
            }
        }
    }
}
