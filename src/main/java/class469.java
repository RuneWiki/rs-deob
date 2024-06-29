import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class469 {

    @OriginalMember(owner = "client!so", name = "q", descriptor = "Lpca;")
    private class714 field6660 = new class714(64);

    @OriginalMember(owner = "client!so", name = "t", descriptor = "Lpca;")
    public class714 field6663 = new class714(50);

    @OriginalMember(owner = "client!so", name = "u", descriptor = "Lpca;")
    public class714 field6664 = new class714(5);

    @OriginalMember(owner = "client!so", name = "e", descriptor = "Lsaa;")
    public class326 field6648;

    @OriginalMember(owner = "client!so", name = "h", descriptor = "Lfp;")
    public class323 field6651;

    @OriginalMember(owner = "client!so", name = "j", descriptor = "Lfp;")
    private class323 field6653;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "Z")
    public boolean field6644;

    @OriginalMember(owner = "client!so", name = "l", descriptor = "I")
    public static int field6655 = 0;

    @OriginalMember(owner = "client!so", name = "f", descriptor = "I")
    public static int field6649 = 0;

    @OriginalMember(owner = "client!so", name = "m", descriptor = "I")
    public static int field6656 = 0;

    @OriginalMember(owner = "client!so", name = "p", descriptor = "I")
    public static int field6659 = 0;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "I")
    public static int field6645;

    @OriginalMember(owner = "client!so", name = "c", descriptor = "I")
    public static int field6646;

    @OriginalMember(owner = "client!so", name = "d", descriptor = "I")
    public static int field6647;

    @OriginalMember(owner = "client!so", name = "g", descriptor = "I")
    public static int field6650;

    @OriginalMember(owner = "client!so", name = "i", descriptor = "I")
    public static int field6652;

    @OriginalMember(owner = "client!so", name = "k", descriptor = "I")
    public static int field6654;

    @OriginalMember(owner = "client!so", name = "n", descriptor = "I")
    public static int field6657;

    @OriginalMember(owner = "client!so", name = "o", descriptor = "I")
    public static int field6658;

    @OriginalMember(owner = "client!so", name = "r", descriptor = "I")
    public static int field6661;

    @OriginalMember(owner = "client!so", name = "s", descriptor = "I")
    public static int field6662;

    @OriginalMember(owner = "client!so", name = "v", descriptor = "I")
    public int field6665;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(II)V", line = 6)
    public final void method2795(int arg0, int arg1) {
        field6646++;
        this.field6665 = arg0;
        class714 var3 = this.field6663;
        synchronized (this.field6663) {
            this.field6663.method4023((byte) 46);
            if (arg1 != 50) {
                this.method2801(false);
            }
        }
        class714 var4 = this.field6664;
        synchronized (this.field6664) {
            this.field6664.method4023((byte) -126);
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(BI)V", line = 23)
    public final void method2796(byte arg0, int arg1) {
        field6650++;
        class714 var3 = this.field6660;
        synchronized (this.field6660) {
            this.field6660.method4016(arg1, (byte) -73);
            if (arg0 != -78) {
                this.field6663 = null;
            }
        }
        class714 var4 = this.field6663;
        synchronized (this.field6663) {
            this.field6663.method4016(arg1, (byte) -73);
        }
        class714 var5 = this.field6664;
        synchronized (this.field6664) {
            this.field6664.method4016(arg1, (byte) -73);
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IZ)Lkm;", line = 42)
    public final class353 method2797(int arg0, boolean arg1) {
        field6647++;
        class714 var3 = this.field6660;
        class353 var4;
        synchronized (this.field6660) {
            var4 = (class353) this.field6660.method4022((long) arg0, (byte) 121);
        }
        if (var4 != null) {
            return var4;
        }
        class323 var5 = this.field6653;
        byte[] var6;
        synchronized (this.field6653) {
            var6 = this.field6653.method2100(class759.method4215(arg0, 127), (byte) 112, class430.method2626(arg0, 0));
        }
        class353 var7 = new class353();
        if (arg1) {
            return null;
        }
        var7.field4980 = arg0;
        var7.field4977 = this;
        if (var6 != null) {
            var7.method2276(new class675(var6), 105);
        }
        var7.method2278(-113);
        class714 var8 = this.field6660;
        synchronized (this.field6660) {
            this.field6660.method4018((byte) 127, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IIII)I", line = 75)
    public static final int method2798(int arg0, int arg1, int arg2, int arg3) {
        field6661++;
        if (class459.field6474 == null) {
            return 0;
        }
        int var4 = arg3 >> 9;
        int var5 = arg1 >> 9;
        if (var4 < 0 || var5 < 0 || (class336.field4683 - 1) < var4 || var5 > class700.field9768 - 1) {
            return 0;
        }
        int var6 = arg2;
        if (arg0 <= 67) {
            field6649 = -111;
        }
        if (arg2 < 3 && (class651.field8948[1][var4][var5] & 0x2) != 0) {
            var6 = arg2 + 1;
        }
        return class459.field6474[var6].method1815(arg1, arg3, 58);
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(IZ)V", line = 103)
    public final void method2799(int arg0, boolean arg1) {
        if (arg0 > -72) {
            method2798(115, 121, -96, 104);
        }
        field6652++;
        if (this.field6644 != arg1) {
            this.field6644 = arg1;
            this.method2801(true);
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Z)V", line = 121)
    public final void method2800(boolean arg0) {
        class714 var2 = this.field6663;
        synchronized (this.field6663) {
            this.field6663.method4023((byte) -127);
        }
        field6658++;
        class714 var3 = this.field6664;
        synchronized (this.field6664) {
            this.field6664.method4023((byte) 12);
            if (arg0) {
                method2803((byte) -20, 94, null);
            }
        }
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(Z)V", line = 145)
    public final void method2801(boolean arg0) {
        if (!arg0) {
            method2803((byte) -9, -59, null);
        }
        field6645++;
        class714 var2 = this.field6660;
        synchronized (this.field6660) {
            this.field6660.method4023((byte) 23);
        }
        class714 var3 = this.field6663;
        synchronized (this.field6663) {
            this.field6663.method4023((byte) 84);
        }
        class714 var4 = this.field6664;
        synchronized (this.field6664) {
            this.field6664.method4023((byte) 74);
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V", line = 166)
    public final void method2802(int arg0) {
        field6662++;
        class714 var2 = this.field6660;
        synchronized (this.field6660) {
            this.field6660.method4024(0);
        }
        class714 var3 = this.field6663;
        synchronized (this.field6663) {
            this.field6663.method4024(arg0 ^ arg0);
        }
        class714 var4 = this.field6664;
        synchronized (this.field6664) {
            this.field6664.method4024(arg0 + 51);
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(BILmga;)V", line = 196)
    public static final void method2803(byte arg0, int arg1, class709 arg2) {
        field6657++;
        if (class557.field7828 >= 50 || arg2 == null || arg2.field9845 == null || arg2.field9845.length <= arg1 || arg2.field9845[arg1] == null) {
            return;
        }
        int var3 = arg2.field9845[arg1][0];
        int var4 = var3 >> 8;
        if (arg2.field9845[arg1].length > 1) {
            int var5 = (int) (Math.random() * (double) arg2.field9845[arg1].length);
            if (var5 > 0) {
                var4 = arg2.field9845[arg1][var5];
            }
        }
        if (arg0 <= 114) {
            method2798(-55, 45, 28, 58);
        }
        int var6 = var3 >> 5 & 0x7;
        int var7 = 256;
        if (arg2.field9844 != null && arg2.field9825 != null) {
            var7 = class8.method50(-111, arg2.field9825[arg1], arg2.field9844[arg1]);
        }
        if (arg2.field9832) {
            class220.method1349(var4, false, var6, var7, 9400, 255, 0);
        } else {
            class420.method2576(var7, 255, (byte) 67, var6, var4, 0);
        }
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lsaa;IZLfp;Lfp;)V", line = 253)
    public class469(class326 arg0, int arg1, boolean arg2, class323 arg3, class323 arg4) {
        this.field6648 = arg0;
        this.field6651 = arg4;
        this.field6653 = arg3;
        this.field6644 = arg2;
        if (this.field6653 != null) {
            int var6 = this.field6653.method2098((byte) 20) - 1;
            this.field6653.method2084(var6, 0);
        }
    }
}
