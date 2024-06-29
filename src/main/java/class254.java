import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public class class254 implements class159 {

    @OriginalMember(owner = "client!fga", name = "i", descriptor = "Ldj;")
    private class342 field3717;

    @OriginalMember(owner = "client!fga", name = "f", descriptor = "Lfp;")
    private class323 field3714;

    @OriginalMember(owner = "client!fga", name = "h", descriptor = "Lfp;")
    private class323 field3716;

    @OriginalMember(owner = "client!fga", name = "m", descriptor = "Lht;")
    public static class581 field3721 = new class581();

    @OriginalMember(owner = "client!fga", name = "p", descriptor = "Z")
    public static boolean field3724 = false;

    @OriginalMember(owner = "client!fga", name = "o", descriptor = "Z")
    public static boolean field3723 = false;

    @OriginalMember(owner = "client!fga", name = "n", descriptor = "Lgda;")
    public static class53 field3722 = new class53(57, 12);

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!fga", name = "c", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!fga", name = "d", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!fga", name = "e", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!fga", name = "j", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!fga", name = "k", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!fga", name = "l", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!fga", name = "g", descriptor = "Lda;")
    private class59 field3715;

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(ZI)V", line = 6)
    public final void method1056(boolean arg0, int arg1) {
        if (arg0) {
            int var3 = this.field3717.field4777.method12(class192.field2561, this.field3717.field4771, -104) + this.field3717.field4782;
            int var4 = this.field3717.field4766.method826(this.field3717.field4770, 0, class191.field2553) + this.field3717.field4781;
            this.field3715.method510(var4, 0, this.field3717.field4771, null, this.field3717.field4774, this.field3717.field4773, null, this.field3717.field4779, this.field3717.field4768, this.field3717.field4770, this.field3717.field4775, 0, var3, null, this.field3717.field4767, (byte) 100);
        }
        field3713++;
        if (arg1 != -3340) {
            method1683((byte) 95, 98);
        }
    }

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "(I)V", line = 25)
    public final void method55(int arg0) {
        field3720++;
        if (arg0 != 11133) {
            method1687((byte) 76);
        }
        class143 var2 = class228.method1422(this.field3714, 2, this.field3717.field4772);
        this.field3715 = class268.field3831.method459(var2, class204.method1236(this.field3716, this.field3717.field4772), true);
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIIIIIZ)I", line = 38)
    public static final int method1682(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if ((arg5 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg3;
            arg3 = var7;
        }
        if (!arg6) {
            field3722 = null;
        }
        field3710++;
        int var8 = arg4 & 0x3;
        if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return arg0;
        } else if (var8 == 2) {
            return 7 + 1 - arg2 - arg1;
        } else {
            return 1 + 7 - arg3 - arg0;
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(I)Z", line = 68)
    public final boolean method49(int arg0) {
        field3711++;
        boolean var2 = true;
        if (arg0 != -32252) {
            field3723 = true;
        }
        if (!this.field3716.method2088(this.field3717.field4772, 113)) {
            var2 = false;
        }
        if (!this.field3714.method2088(this.field3717.field4772, -45)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(BI)Lbl;", line = 90)
    public static final class648 method1683(byte arg0, int arg1) {
        int var2 = 71 / ((arg0 + 31) / 53);
        field3719++;
        class648 var3 = (class648) class746.field10368.method3612(-117, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class164.field2255.method2100(0, (byte) 112, arg1);
        if (var4 == null || var4.length <= 1) {
            return null;
        }
        class648 var5;
        try {
            var5 = class582.method3306(var4, 0);
        } catch (Exception var7) {
            throw new RuntimeException(var7.getMessage() + " S: " + arg1);
        }
        class746.field10368.method3611(var5, (byte) 36, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(IZ)V", line = 116)
    public static final void method1684(int arg0, boolean arg1) {
        class274.field3912.method344(class263.field3799.method436());
        field3709++;
        int[] var2 = class263.field3799.method395();
        class467.field6618 = var2[arg0];
        class596.field8383 = var2[1];
        class519.field7385 = var2[0];
        class195.field2603 = var2[3];
        if (arg1) {
            class263.field3799.method391(class248.field3294, class208.field2730, class399.field5644, class177.field2379);
            class649.method3578(class589.field8304, (byte) -126);
        } else {
            class263.field3799.method391(class21.field320, class654.field8963, class151.field2146, class473.field6701);
            class649.method3578(class195.field2595, (byte) -126);
        }
    }

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "(BI)I", line = 145)
    public static final int method1685(byte arg0, int arg1) {
        if (arg0 == -58) {
            field3712++;
            return arg1 >>> 8;
        } else {
            return 64;
        }
    }

    @OriginalMember(owner = "client!fga", name = "<init>", descriptor = "(Lfp;Lfp;Ldj;)V", line = 156)
    public class254(class323 arg0, class323 arg1, class342 arg2) {
        this.field3717 = arg2;
        this.field3714 = arg1;
        this.field3716 = arg0;
    }

    @OriginalMember(owner = "client!fga", name = "c", descriptor = "(I)V", line = 166)
    public static void method1686(int arg0) {
        field3722 = null;
        if (arg0 <= 27) {
            method1685((byte) 92, 22);
        }
        field3721 = null;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(B)Z", line = 180)
    public static final boolean method1687(byte arg0) {
        field3718++;
        if (arg0 == 127) {
            return class25.field341 > 0;
        } else {
            return true;
        }
    }
}
