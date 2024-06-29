import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public abstract class class521 {

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "Lbda;")
    public class428 field7319;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "Z")
    public static boolean field7315 = false;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "Lrg;")
    public static class548 field7313 = new class548(72, 15);

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field7311;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public static int field7312;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public static int field7314;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    public static int field7316;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public static int field7317;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public static int field7318;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "I")
    public static int field7320;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "I")
    public static int field7321;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
    public static int field7322;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(Z)V", line = 6)
    public void method635(boolean arg0) {
        field7320++;
        if (!arg0) {
            this.field7319 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIB)Z", line = 16)
    public static final boolean method2968(int arg0, int arg1, byte arg2) {
        field7317++;
        if (arg2 != 122) {
            method2968(48, 49, (byte) 100);
        }
        return (arg0 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V", line = 30)
    public void method636(int arg0) {
        field7316++;
        if (arg0 != 256) {
            field7314 = 54;
        }
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)V", line = 56)
    public static void method2969(int arg0) {
        if (arg0 <= -50) {
            field7313 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)V", line = 67)
    public void method634(int arg0) {
        field7322++;
        if (arg0 != 72) {
            this.method634(-81);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V", line = 77)
    public void method633(byte arg0) {
        if (arg0 != -44) {
            method2969(81);
        }
        field7318++;
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)V", line = 88)
    public void method447(int arg0) {
        field7311++;
        if (arg0 != 15) {
            this.method2833(0);
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lbda;)V", line = 99)
    public class521(class428 arg0) {
        this.field7319 = arg0;
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "(I)V", line = 110)
    public void method2833(int arg0) {
        field7312++;
        int var2 = 50 % ((arg0 - 87) / 38);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZ)V")
    public abstract void method449(int arg0, boolean arg1);

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)V")
    public abstract void method448(boolean arg0);

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(III)V")
    public abstract void method455(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BZ)V")
    public abstract void method454(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILhv;I)V")
    public abstract void method446(int arg0, class440 arg1, int arg2);

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)Z")
    public abstract boolean method452(int arg0);
}
