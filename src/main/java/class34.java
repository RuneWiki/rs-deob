import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class34 {

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "[I")
    public static int[] field640 = new int[1000];

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "Lsc;")
    private static class128 field639 = class129.method1017(false, "Loading)3)3)3");

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field638 = 2;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field641 = 0;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field644 = 0;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "Lsc;")
    public static class128 field643 = field639;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
    public static final void method249(byte arg0) {
        if (arg0 >= -107) {
            method251(-15, 115, (byte) 13);
        }
        field642++;
        if (class148.field3417 != null) {
            class69 var1 = class148.field3417;
            synchronized (class148.field3417) {
                class148.field3417 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static void method250(int arg0) {
        field639 = null;
        if (arg0 < 103) {
            method250(67);
        }
        field643 = null;
        field640 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIB)I")
    public static final int method251(int arg0, int arg1, byte arg2) {
        field645++;
        int var3 = class43.method310(arg0 - 1, (byte) -101, arg1 - 1) + class43.method310(arg0 - 1, (byte) -101, arg1 + 1) + class43.method310(arg0 + 1, (byte) -101, arg1 + -1) + class43.method310(arg0 + 1, (byte) -101, arg1 - -1);
        int var4 = class43.method310(arg0, (byte) -101, arg1 - 1) + class43.method310(arg0, (byte) -101, arg1 + 1) + class43.method310(arg0 - 1, (byte) -101, arg1) + class43.method310(arg0 + 1, (byte) -101, arg1);
        int var5 = class43.method310(arg0, (byte) -101, arg1);
        int var6 = 54 / ((arg2 + 78) / 39);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }
}
