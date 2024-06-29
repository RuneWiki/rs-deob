import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class216 extends class25 {

    @OriginalMember(owner = "client!gj", name = "H", descriptor = "I")
    public int field3745 = 0;

    @OriginalMember(owner = "client!gj", name = "P", descriptor = "[Lva;")
    public static class33[] field3752 = new class33[5000];

    @OriginalMember(owner = "client!gj", name = "M", descriptor = "[Ldf;")
    public static class51[] field3749 = new class51[200];

    @OriginalMember(owner = "client!gj", name = "F", descriptor = "Ldf;")
    public static class51 field3743 = class46.method233("Lade Sprites )2 ", 100);

    @OriginalMember(owner = "client!gj", name = "Q", descriptor = "Ldf;")
    public static class51 field3753 = class46.method233(" )2> <col=00ffff>", 100);

    @OriginalMember(owner = "client!gj", name = "O", descriptor = "Ldf;")
    public static class51 field3751 = class46.method233(")3runescape)3com", 100);

    @OriginalMember(owner = "client!gj", name = "E", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!gj", name = "I", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!gj", name = "J", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!gj", name = "L", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!gj", name = "N", descriptor = "Lsc;")
    public static class229 field3750;

    @OriginalMember(owner = "client!gj", name = "G", descriptor = "Lja;")
    public static class55 field3744;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(B)V")
    public static void method1482(byte arg0) {
        field3744 = null;
        field3751 = null;
        field3752 = null;
        field3750 = null;
        field3743 = null;
        int var1 = 61 / ((arg0 + 52) / 36);
        field3749 = null;
        field3753 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILdf;)I")
    public static final int method1483(int arg0, class51 arg1) {
        int var2 = 41 % ((arg0 + 12) / 61);
        field3748++;
        return arg1.method293(false) + 1;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILlb;)V")
    public final void method1484(int arg0, class121 arg1) {
        field3746++;
        while (true) {
            int var3 = arg1.method897(arg0 + 30280);
            if (var3 == 0) {
                if (arg0 == -30342) {
                    return;
                } else {
                    this.method1485(-81, (byte) 6, (class121) null);
                    return;
                }
            }
            this.method1485(var3, (byte) 127, arg1);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IBLlb;)V")
    private final void method1485(int arg0, byte arg1, class121 arg2) {
        if (arg1 <= 123) {
            field3749 = null;
        }
        field3747++;
        if (arg0 == 2) {
            this.field3745 = arg2.method876(false);
        }
    }
}
