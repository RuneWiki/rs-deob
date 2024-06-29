import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class532 extends class561 {

    @OriginalMember(owner = "client!ws", name = "y", descriptor = "Luda;")
    public static class509 field7430 = new class509(4);

    @OriginalMember(owner = "client!ws", name = "B", descriptor = "Lg;")
    public static class513 field7433 = new class513("stellardawn", 1);

    @OriginalMember(owner = "client!ws", name = "D", descriptor = "Luv;")
    public static class3 field7435;

    @OriginalMember(owner = "client!ws", name = "p", descriptor = "I")
    public int field7421;

    @OriginalMember(owner = "client!ws", name = "q", descriptor = "I")
    public int field7422;

    @OriginalMember(owner = "client!ws", name = "r", descriptor = "I")
    public int field7423;

    @OriginalMember(owner = "client!ws", name = "u", descriptor = "I")
    public int field7426;

    @OriginalMember(owner = "client!ws", name = "w", descriptor = "I")
    public static int field7428;

    @OriginalMember(owner = "client!ws", name = "A", descriptor = "I")
    public static int field7432;

    @OriginalMember(owner = "client!ws", name = "x", descriptor = "Ldh;")
    public class321 field7429;

    @OriginalMember(owner = "client!ws", name = "C", descriptor = "Lkr;")
    public static class329 field7434;

    @OriginalMember(owner = "client!ws", name = "v", descriptor = "Ljava/lang/String;")
    public String field7427;

    @OriginalMember(owner = "client!ws", name = "o", descriptor = "[I")
    public int[] field7420;

    @OriginalMember(owner = "client!ws", name = "s", descriptor = "[I")
    public int[] field7424;

    @OriginalMember(owner = "client!ws", name = "z", descriptor = "[Lba;")
    public class607[] field7431;

    @OriginalMember(owner = "client!ws", name = "t", descriptor = "[Ljava/lang/String;")
    public String[] field7425;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)V")
    public static final void method2958(byte arg0) {
        class635.field9234.method3472((byte) -128);
        field7432++;
        if (arg0 == -102) {
            class545.field7595.method2227(16383);
            class413.field5685.method2227(16383);
        }
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(Z)V")
    public static void method2959(boolean arg0) {
        field7434 = null;
        field7430 = null;
        field7433 = null;
        if (!arg0) {
            method2960(-111, null, 8, 118);
        }
        field7435 = null;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(ILjq;II)V")
    public static final void method2960(int arg0, class447 arg1, int arg2, int arg3) {
        if (arg3 <= 8) {
            return;
        }
        field7428++;
        class594 var4 = arg1.method2608(94, class301.field3918);
        if (var4 == null) {
            return;
        }
        class301.field3918.method977(arg0, arg2, arg1.field6330 + arg0, arg1.field6218 + arg2);
        if (class598.field8638 >= 3) {
            class301.field3918.method930(-16777216, var4, arg0, arg2);
        } else {
            class453.field6424.method635((float) arg1.field6330 / 2.0F + (float) arg0, (float) arg1.field6218 / 2.0F + (float) arg2, 4096, ((int) (-class521.field7250) & 0x3FFF) << 2, var4, arg0, arg2);
        }
    }

    static {
        new class344("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
        field7435 = new class3(74, 2);
    }
}
