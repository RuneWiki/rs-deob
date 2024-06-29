import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public abstract class class573 {

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "Lrv;")
    public class111 field7517;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
    public static int field7522 = 0;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "Lqr;")
    public static class65 field7516 = new class65(32);

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "[I")
    public static int[] field7528 = new int[1000];

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "Z")
    public static boolean field7527 = false;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "Lhda;")
    public static class752 field7525 = new class752(58, 8);

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "F")
    public static float field7530;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field7513;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field7514;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public static int field7515;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field7518;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
    public static int field7519;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field7520;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
    public static int field7521;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "I")
    public static int field7523;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
    public static int field7524;

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "[Liu;")
    public static class579[] field7529;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "[Ljm;")
    public static class690[] field7526;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V", line = 3)
    public void method1139(int arg0) {
        if (arg0 == 4095) {
            field7523++;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIII)I", line = 16)
    public static final int method3151(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field7521++;
        if (var4 == 0) {
            return arg0;
        } else if (arg2 != 4095) {
            return 40;
        } else if (var4 == 1) {
            return 4095 - arg3;
        } else if (var4 == 2) {
            return 4095 - arg0;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)V", line = 38)
    public void method1138(int arg0) {
        if (arg0 != 3) {
            field7525 = null;
        }
        field7514++;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V", line = 50)
    public void method1140(boolean arg0) {
        field7519++;
        if (!arg0) {
            method3151(-1, 35, 21, 103);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V", line = 62)
    public void method1141(byte arg0) {
        if (arg0 <= 115) {
            this.field7517 = null;
        }
        field7520++;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(B)V", line = 72)
    public void method3152(byte arg0) {
        int var2 = -127 / ((arg0 + 46) / 55);
        field7513++;
    }

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "(I)V", line = 82)
    public static void method3153(int arg0) {
        field7516 = null;
        field7528 = null;
        field7526 = null;
        field7525 = null;
        field7529 = null;
        if (arg0 != -12296) {
            method3151(-93, 52, -107, 120);
        }
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lrv;)V", line = 100)
    public class573(class111 arg0) {
        this.field7517 = arg0;
    }

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "(I)V", line = 114)
    public void method1142(int arg0) {
        if (arg0 != 4095) {
            field7530 = -0.25924885F;
        }
        field7518++;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(III)Z", line = 124)
    public static final boolean method3154(int arg0, int arg1, int arg2) {
        if (arg2 == 8) {
            field7515++;
            return class435.method2501(arg0, arg1, 33) | (arg0 & 0x70000) != 0 || class601.method3269(arg0, arg1, (byte) 8);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)Z")
    public abstract boolean method605(int arg0);

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)V")
    public abstract void method602(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZI)V")
    public abstract void method610(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(Z)V")
    public abstract void method603(boolean arg0);

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lwc;IB)V")
    public abstract void method607(class67 arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZZ)V")
    public abstract void method611(boolean arg0, boolean arg1);
}
