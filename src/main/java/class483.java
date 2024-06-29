import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class483 {

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "Lof;")
    private class328 field7338 = new class328(64);

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "Lof;")
    public class328 field7353 = new class328(50);

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "Lof;")
    public class328 field7354 = new class328(5);

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "Z")
    public boolean field7342;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "Lpr;")
    public class236 field7347;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "Lmn;")
    public class162 field7349;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "Lmn;")
    private class162 field7352;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field7344 = -50;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field7337;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field7339;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field7341;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field7343;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    public static int field7345;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
    public static int field7348;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
    public static int field7350;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
    public static int field7351;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "I")
    public int field7355;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "Lmn;")
    public static class162 field7346;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "Lqv;")
    public static class49 field7340;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
    public final void method2972(byte arg0) {
        field7345++;
        class328 var2 = this.field7338;
        synchronized (this.field7338) {
            this.field7338.method2187(-1);
        }
        class328 var3 = this.field7353;
        synchronized (this.field7353) {
            this.field7353.method2187(-1);
            int var4 = 71 / ((arg0 - 37) / 40);
        }
        class328 var5 = this.field7354;
        synchronized (this.field7354) {
            this.field7354.method2187(-1);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)V")
    public final void method2973(boolean arg0) {
        field7348++;
        class328 var2 = this.field7353;
        synchronized (this.field7353) {
            if (!arg0) {
                this.method2972((byte) 13);
            }
            this.field7353.method2189(false);
        }
        class328 var3 = this.field7354;
        synchronized (this.field7354) {
            this.field7354.method2189(false);
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)V")
    public static void method2974(byte arg0) {
        int var1 = -121 % ((-arg0 - 12) / 52);
        field7340 = null;
        field7346 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZB)V")
    public static final void method2975(int arg0, boolean arg1, byte arg2) {
        if (arg2 != -52) {
            field7340 = null;
        }
        field7351++;
        class339 var3 = class154.method940(arg0, arg1, (byte) 119);
        if (var3 != null) {
            var3.method3149(122);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
    public final void method2976(int arg0) {
        field7341++;
        class328 var2 = this.field7338;
        synchronized (this.field7338) {
            this.field7338.method2189(false);
        }
        if (arg0 != -50) {
            method2974((byte) 5);
        }
        class328 var3 = this.field7353;
        synchronized (this.field7353) {
            this.field7353.method2189(false);
        }
        class328 var4 = this.field7354;
        synchronized (this.field7354) {
            this.field7354.method2189(false);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)Lfm;")
    public final class191 method2977(int arg0, int arg1) {
        field7339++;
        class328 var3 = this.field7338;
        class191 var4;
        synchronized (this.field7338) {
            if (arg1 != 50) {
                this.method2978(false, 59);
            }
            var4 = (class191) this.field7338.method2191((byte) -73, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class162 var5 = this.field7352;
        byte[] var6;
        synchronized (this.field7352) {
            var6 = this.field7352.method1004(class532.method3162(arg0, (byte) 24), false, class241.method1681(arg0, true));
        }
        class191 var7 = new class191();
        var7.field2781 = arg0;
        var7.field2834 = this;
        if (var6 != null) {
            var7.method1188(new class208(var6), -18566);
        }
        var7.method1197(false);
        class328 var8 = this.field7338;
        synchronized (this.field7338) {
            this.field7338.method2188(-123, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZI)V")
    public final void method2978(boolean arg0, int arg1) {
        field7343++;
        class328 var3 = this.field7338;
        synchronized (this.field7338) {
            this.field7338.method2202(0, arg1);
            if (arg0) {
                this.field7352 = null;
            }
        }
        class328 var4 = this.field7353;
        synchronized (this.field7353) {
            this.field7353.method2202(0, arg1);
        }
        class328 var5 = this.field7354;
        synchronized (this.field7354) {
            this.field7354.method2202(0, arg1);
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(ZI)V")
    public final void method2979(boolean arg0, int arg1) {
        this.field7355 = arg1;
        field7350++;
        class328 var3 = this.field7353;
        synchronized (this.field7353) {
            this.field7353.method2189(!arg0);
        }
        class328 var4 = this.field7354;
        synchronized (this.field7354) {
            this.field7354.method2189(false);
            if (!arg0) {
                this.field7342 = true;
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZB)V")
    public final void method2980(boolean arg0, byte arg1) {
        field7337++;
        int var3 = 83 % ((arg1 - 23) / 56);
        if (arg0 != this.field7342) {
            this.field7342 = arg0;
            this.method2976(-50);
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lpr;IZLmn;Lmn;)V")
    public class483(class236 arg0, int arg1, boolean arg2, class162 arg3, class162 arg4) {
        this.field7342 = arg2;
        this.field7347 = arg0;
        this.field7349 = arg4;
        this.field7352 = arg3;
        if (this.field7352 != null) {
            int var6 = this.field7352.method1023(127) - 1;
            this.field7352.method1008(var6, (byte) -21);
        }
    }
}
