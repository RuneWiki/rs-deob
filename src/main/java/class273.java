import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public class class273 {

    @OriginalMember(owner = "client!sda", name = "d", descriptor = "Lfja;")
    public static class783 field3803 = new class783(7, -2);

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "I")
    public int field3800;

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!sda", name = "c", descriptor = "I")
    public int field3802;

    @OriginalMember(owner = "client!sda", name = "e", descriptor = "I")
    public int field3804;

    @OriginalMember(owner = "client!sda", name = "f", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!sda", name = "g", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(Lfca;IZ)V", line = 8)
    private final void method1762(class93 arg0, int arg1, boolean arg2) {
        if (arg2) {
            field3803 = null;
        }
        field3801++;
        if (arg1 == 1) {
            this.field3802 = arg0.method763(113);
            this.field3804 = arg0.method793((byte) 61);
            this.field3800 = arg0.method793((byte) 75);
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(ILfca;)V", line = 29)
    public final void method1763(int arg0, class93 arg1) {
        field3805++;
        if (arg0 != -1) {
            method1764(-85);
        }
        while (true) {
            int var3 = arg1.method793((byte) 51);
            if (var3 == 0) {
                return;
            }
            this.method1762(arg1, var3, false);
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)V", line = 56)
    public static void method1764(int arg0) {
        field3803 = null;
        if (arg0 != -1) {
            method1764(-9);
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(B)V", line = 69)
    public static final void method1765(byte arg0) {
        field3806++;
        int var1 = 91 % ((arg0 + 12) / 47);
        if (!class378.field5158) {
            class663.field9212 += (12.0F - class663.field9212) / 2.0F;
            class429.field5846 = true;
            class378.field5158 = true;
        }
    }
}
