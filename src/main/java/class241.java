import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class241 extends class406 {

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "[I")
    public static int[] field3427 = new int[50];

    @OriginalMember(owner = "client!ij", name = "A", descriptor = "Liq;")
    public static class362 field3431 = new class362(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "I")
    public int field3420;

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "I")
    public int field3421;

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "I")
    public int field3424;

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "I")
    public int field3425;

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "I")
    public int field3426;

    @OriginalMember(owner = "client!ij", name = "x", descriptor = "I")
    public int field3428;

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "I")
    public int field3430;

    @OriginalMember(owner = "client!ij", name = "B", descriptor = "I")
    public int field3432;

    @OriginalMember(owner = "client!ij", name = "C", descriptor = "I")
    public int field3433;

    @OriginalMember(owner = "client!ij", name = "D", descriptor = "I")
    public int field3434;

    @OriginalMember(owner = "client!ij", name = "G", descriptor = "I")
    public int field3436;

    @OriginalMember(owner = "client!ij", name = "H", descriptor = "I")
    public int field3437;

    @OriginalMember(owner = "client!ij", name = "F", descriptor = "Ltq;")
    public static class376 field3435;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Luj;I)V")
    public static final void method1647(class214 arg0, int arg1) {
        class240.field3417 = arg0;
        if (arg1 >= -58) {
            method1649(-27, (byte) -86);
        }
        field3423++;
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(B)V")
    public static void method1648(byte arg0) {
        field3435 = null;
        int var1 = -38 / ((arg0 + 10) / 35);
        field3427 = null;
        field3431 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB)V")
    public static final void method1649(int arg0, byte arg1) {
        class237 var2 = class334.field4723;
        synchronized (class334.field4723) {
            if (arg1 > -122) {
                return;
            }
            class334.field4723.method1629(arg0, 121);
        }
        field3422++;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILtq;)V")
    public static final void method1650(int arg0, class376 arg1) {
        field3429++;
        class54.field648 = arg1;
        if (arg0 != 50) {
            field3427 = null;
        }
    }
}
