import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class267 extends class166 {

    @OriginalMember(owner = "client!mda", name = "j", descriptor = "Llga;")
    public static class712 field3531 = new class712(30, 4);

    @OriginalMember(owner = "client!mda", name = "k", descriptor = "I")
    public int field3532;

    @OriginalMember(owner = "client!mda", name = "l", descriptor = "I")
    public int field3533;

    @OriginalMember(owner = "client!mda", name = "m", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!mda", name = "n", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!mda", name = "o", descriptor = "I")
    public int field3536;

    @OriginalMember(owner = "client!mda", name = "q", descriptor = "I")
    public int field3538;

    @OriginalMember(owner = "client!mda", name = "s", descriptor = "I")
    public int field3540;

    @OriginalMember(owner = "client!mda", name = "t", descriptor = "I")
    public int field3541;

    @OriginalMember(owner = "client!mda", name = "p", descriptor = "Ldi;")
    public static class128 field3537;

    @OriginalMember(owner = "client!mda", name = "r", descriptor = "Ljava/lang/String;")
    public String field3539;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(IJ)V", line = 4)
    public static final void method1599(int arg0, long arg1) {
        field3534++;
        if (arg0 != 0) {
            field3537 = null;
        }
        if (arg1 <= 0L) {
            return;
        }
        if ((arg1 % 10L) == 0L) {
            class423.method2424(arg1 - 1L, 60);
            class423.method2424(1L, arg0 + 116);
        } else {
            class423.method2424(arg1, 75);
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(IBI)I", line = 34)
    public static final int method1600(int arg0, byte arg1, int arg2) {
        if (arg1 != 118) {
            return 45;
        }
        field3535++;
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(B)V", line = 60)
    public static void method1601(byte arg0) {
        field3537 = null;
        field3531 = null;
        if (arg0 != 64) {
            method1601((byte) -73);
        }
    }
}
