import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class514 implements class46 {

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
    public int field7528;

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "I")
    public int field7532;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
    public int field7529;

    @OriginalMember(owner = "client!fs", name = "j", descriptor = "I")
    public int field7537;

    @OriginalMember(owner = "client!fs", name = "k", descriptor = "I")
    public int field7538;

    @OriginalMember(owner = "client!fs", name = "m", descriptor = "I")
    public int field7540;

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
    public int field7530;

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "Lop;")
    public class172 field7535;

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "Lpe;")
    public class564 field7533;

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "Lwo;")
    public static class690 field7534 = new class690(101, 7);

    @OriginalMember(owner = "client!fs", name = "n", descriptor = "Lmq;")
    public static class472 field7541 = new class472(8);

    @OriginalMember(owner = "client!fs", name = "l", descriptor = "F")
    public static float field7539;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
    public static int field7531;

    @OriginalMember(owner = "client!fs", name = "i", descriptor = "I")
    public static int field7536;

    @OriginalMember(owner = "client!fs", name = "o", descriptor = "I")
    public static int field7542;

    @OriginalMember(owner = "client!fs", name = "p", descriptor = "I")
    public static int field7543;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)Lsq;")
    public class161 method448(byte arg0) {
        if (arg0 != 25) {
            this.field7538 = -105;
        }
        field7536++;
        return null;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V")
    public static void method3049(int arg0) {
        field7534 = null;
        if (arg0 == 8) {
            field7541 = null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(ZII)Z")
    public static final boolean method3050(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method3049(-35);
        }
        field7542++;
        return class486.method2839((byte) -104, arg1, arg2) | (arg2 & 0x800) != 0 || class541.method3173(arg2, arg1, 55);
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lpe;Lop;IIIIIII)V")
    public class514(class564 arg0, class172 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field7528 = arg5;
        this.field7532 = arg3;
        this.field7529 = arg6;
        this.field7537 = arg7;
        this.field7538 = arg8;
        this.field7540 = arg4;
        this.field7530 = arg2;
        this.field7535 = arg1;
        this.field7533 = arg0;
    }
}
