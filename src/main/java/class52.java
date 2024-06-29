import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class52 {

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "I")
    public static int field652 = 3;

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "[I")
    public static int[] field648 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ip", name = "j", descriptor = "I")
    public static int field655 = 0;

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "Lvq;")
    public static class24 field651 = new class24(61, 14);

    @OriginalMember(owner = "client!ip", name = "l", descriptor = "Ljn;")
    public static class409 field657 = new class409("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
    public int field647;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!ip", name = "h", descriptor = "I")
    public int field653;

    @OriginalMember(owner = "client!ip", name = "i", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!ip", name = "k", descriptor = "I")
    private int field656;

    @OriginalMember(owner = "client!ip", name = "n", descriptor = "Lct;")
    public static class104 field659;

    @OriginalMember(owner = "client!ip", name = "m", descriptor = "[S")
    public static short[] field658;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
    public static void method401(int arg0) {
        field651 = null;
        field657 = null;
        field659 = null;
        field648 = null;
        field658 = null;
        if (arg0 != -1) {
            method401(-72);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILat;BI)V")
    private final void method402(int arg0, class256 arg1, byte arg2, int arg3) {
        if (arg3 == 1) {
            this.field656 = arg1.method1767(1930493576);
        } else if (arg3 == 2) {
            this.field653 = arg1.method1738((byte) 103);
            this.field647 = arg1.method1738((byte) -81);
        }
        int var5 = -33 % ((arg2 + 28) / 62);
        field649++;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)Ltr;")
    public final class144 method403(byte arg0) {
        field654++;
        class144 var2 = (class144) class403.field5830.method2310((byte) -128, (long) this.field656);
        if (var2 != null) {
            return var2;
        }
        class144 var3 = class144.method991(class367.field5303, this.field656, 0);
        if (var3 != null) {
            class403.field5830.method2299(true, var3, (long) this.field656);
        }
        if (arg0 != -19) {
            method404(false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Z)V")
    public static final void method404(boolean arg0) {
        class249.field3666 = null;
        class115.field1559 = null;
        class376.field5490 = null;
        class56.field685 = null;
        class100.field1245 = null;
        class130.field1781 = null;
        class226.field3383 = null;
        class13.field215 = null;
        class163.field2157 = null;
        field646++;
        class111.field1540 = null;
        class136.field1870 = null;
        if (!arg0) {
            field658 = null;
        }
        class269.field3995 = null;
        class328.field4886 = null;
        class403.field5831 = null;
        class458.field6760 = null;
        class253.field3719 = null;
        class369.field5353 = null;
        class55.field675 = null;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILat;I)V")
    public final void method405(int arg0, class256 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method1738((byte) -128);
            if (var4 == 0) {
                if (arg2 != 3) {
                    field652 = -120;
                }
                field650++;
                return;
            }
            this.method402(arg0, arg1, (byte) -110, var4);
        }
    }
}
