import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class212 {

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "Lhi;")
    public static class45 field3017 = new class45(37, -1);

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "Lmg;")
    public static class530 field3021 = new class530();

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "[I")
    public static int[] field3023 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "Lrb;")
    public static class283 field3022 = new class283(10, 5);

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public int field3013;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public int field3014;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public int field3020;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lsv;B)V", line = 5)
    public final void method1341(class319 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1869(-109);
            if (var3 == 0) {
                field3015++;
                if (arg1 <= 24) {
                    this.method1345(-27, null, -36);
                    return;
                }
                return;
            }
            this.method1345(var3, arg0, -88);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V", line = 25)
    public static final void method1342(byte arg0) {
        if (class301.method1749((byte) 94)) {
            if (class379.field5448 == null) {
                class411.method2417((byte) 41);
            }
            class338.field4903 = 0;
            class250.field3408 = true;
            try {
                class232.field3237 = class502.field7343.getToolkit().getSystemClipboard();
            } catch (Exception var1) {
            }
        }
        field3016++;
        if (arg0 >= -21) {
            field3021 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIB)I", line = 52)
    public static final int method1343(int arg0, int arg1, byte arg2) {
        int var3 = -9 % ((-arg2 - 67) / 41);
        field3019++;
        return arg0 == 1 || arg0 == 3 ? class184.field2738[arg1 & 0x3] : class97.field1556[arg1 & 0x3];
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V", line = 66)
    public static void method1344(int arg0) {
        field3017 = null;
        field3023 = null;
        field3021 = null;
        field3022 = null;
        if (arg0 != -2) {
            field3023 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILsv;I)V", line = 84)
    private final void method1345(int arg0, class319 arg1, int arg2) {
        if (arg2 > -65) {
            return;
        }
        if (arg0 == 1) {
            this.field3014 = arg1.method1844(-119);
            this.field3020 = arg1.method1869(-82);
            this.field3013 = arg1.method1869(-80);
        }
        field3018++;
    }
}
