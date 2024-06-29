import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class683 extends class55 {

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
    public static int field9519 = 0;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "[Z")
    public static boolean[] field9516 = new boolean[8];

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "Lal;")
    public static class102 field9520 = new class102("game4", 3);

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "I")
    public static int field9525 = 0;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
    public static int field9513;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
    public static int field9514;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    public static int field9515;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
    public static int field9518;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
    public static int field9521;

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "I")
    public static int field9522;

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "I")
    public static int field9523;

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "I")
    public static int field9524;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "Z")
    public static boolean field9517;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)I")
    public static int method3840(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIZ)V")
    public final void method199(int arg0, int arg1, boolean arg2) {
        ++field9513;
        if (!arg2) {
            this.method197(false, (byte) 110);
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)V")
    public static void method3841(byte arg0) {
        field9516 = null;
        if (arg0 > -2) {
            method3841((byte) -80);
        }
        field9520 = null;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lij;)V")
    public class683(class424 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)Z")
    public final boolean method202(int arg0) {
        ++field9522;
        if (arg0 != 1) {
            field9517 = true;
        }
        return false;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILfe;)V")
    public final void method200(int arg0, int arg1, class572 arg2) {
        if (arg1 < 30) {
            field9515 = 12;
        }
        ++field9524;
        super.field759.method2396(22357, arg2);
        super.field759.method2379(arg0, -15829);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V")
    public final void method201(boolean arg0) {
        ++field9523;
        if (!arg0) {
            field9525 = 99;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZB)V")
    public final void method197(boolean arg0, byte arg1) {
        int var3 = -39 / ((-61 - arg1) / 44);
        ++field9518;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IZ)V")
    public final void method196(int arg0, boolean arg1) {
        if (arg0 != 5) {
            this.method200(-76, 54, (class572) null);
        }
        ++field9514;
    }
}
