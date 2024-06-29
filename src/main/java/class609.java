import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public class class609 extends class412 {

    @OriginalMember(owner = "client!lea", name = "I", descriptor = "I")
    public static int field8824 = -1;

    @OriginalMember(owner = "client!lea", name = "G", descriptor = "I")
    public static int field8822;

    @OriginalMember(owner = "client!lea", name = "H", descriptor = "I")
    public static int field8823;

    @OriginalMember(owner = "client!lea", name = "J", descriptor = "J")
    public static long field8825;

    @OriginalMember(owner = "client!lea", name = "E", descriptor = "Lkr;")
    public static class743 field8821;

    @OriginalMember(owner = "client!lea", name = "K", descriptor = "Lsw;")
    public static class752 field8826;

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3516(int arg0, int arg1, byte arg2) {
        if (arg2 != 70) {
            method3516(72, 108, (byte) 125);
        }
        ++field8823;
        return ~(arg0 & 1048832) != -1;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIII)V")
    public final void method2507(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8822;
        int var6 = super.field5701.method82();
        int var7 = ((class525) super.field2610).field7462 * class742.method4129(arg2) / 10 % var6;
        super.field5701.method4137(-var6 + arg0 + var7, arg4, arg3 - -var6 + -var7, arg1);
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(Z)V")
    public static void method3517(boolean arg0) {
        field8821 = null;
        if (!arg0) {
            method3516(-107, 17, (byte) 18);
        }
        field8826 = null;
    }

    @OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(Leq;Leq;Lhl;)V")
    public class609(class209 arg0, class209 arg1, class525 arg2) {
        super(arg0, arg1, arg2);
    }
}
