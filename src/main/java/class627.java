import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class627 {

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "Lgw;")
    private class690 field8433 = new class690(256);

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "Luu;")
    private class237 field8431;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "Lkr;")
    public static class602 field8432 = new class602(27, 0);

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field8427;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field8428;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field8429;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field8430;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public static int field8434;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public static int field8435;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    public static int field8437;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "Laea;")
    public static class261 field8436;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIBI)I", line = 5)
    public static final int method3528(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 <= 80) {
            method3530(-121);
        }
        int var4 = arg0 & 0x3;
        field8429++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IBIII)I", line = 32)
    public static final int method3529(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field8437++;
        int var5 = arg0 & 0xF;
        int var6 = var5 >= 8 ? arg4 : arg2;
        int var7 = 123 % ((29 - arg1) / 49);
        int var8 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg2 : arg3) : arg4;
        return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var8 : -var8);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V", line = 52)
    public static void method3530(int arg0) {
        field8432 = null;
        field8436 = null;
        if (arg0 < 29) {
            method3528(1, 91, (byte) -32, -104);
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lgp;ILuu;)V", line = 90)
    public class627(class553 arg0, int arg1, class237 arg2) {
        this.field8431 = arg2;
        this.field8431.method1597(26, 0);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IBII)I", line = 68)
    public static final int method3531(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field8430++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else if (arg1 == 19) {
            return 7 - arg0;
        } else {
            return 48;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V", line = 105)
    public final void method3532(boolean arg0) {
        field8434++;
        class690 var2 = this.field8433;
        synchronized (this.field8433) {
            this.field8433.method3906(-98);
        }
        if (!arg0) {
            field8432 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZ)Ltt;", line = 122)
    public final class494 method3533(int arg0, boolean arg1) {
        field8427++;
        class690 var3 = this.field8433;
        class494 var4;
        synchronized (this.field8433) {
            var4 = (class494) this.field8433.method3898((byte) -42, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class237 var5 = this.field8431;
        byte[] var6;
        synchronized (this.field8431) {
            var6 = this.field8431.method1572(26, 0, arg0);
            if (!arg1) {
                method3529(90, (byte) 72, -53, -125, -15);
            }
        }
        class494 var7 = new class494();
        if (var6 != null) {
            var7.method2989(new class63(var6), 29949);
        }
        class690 var8 = this.field8433;
        synchronized (this.field8433) {
            this.field8433.method3899(40, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IB)V", line = 151)
    public final void method3534(int arg0, byte arg1) {
        field8435++;
        class690 var3 = this.field8433;
        synchronized (this.field8433) {
            this.field8433.method3896(1, arg0);
            if (arg1 != -53) {
                this.field8433 = null;
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V", line = 165)
    public final void method3535(byte arg0) {
        field8428++;
        class690 var2 = this.field8433;
        synchronized (this.field8433) {
            this.field8433.method3902(0);
        }
        if (arg0 != -46) {
            this.method3533(32, true);
        }
    }
}
