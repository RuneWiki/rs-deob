import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class33 {

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "Lmf;")
    private class382 field524 = new class382(64);

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "Lmf;")
    public class382 field528 = new class382(50);

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "Lmf;")
    public class382 field529 = new class382(5);

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "Z")
    public boolean field523;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "Lpu;")
    public class522 field518;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "Lkr;")
    public class693 field525;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "Lpu;")
    private class522 field527;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "Lwba;")
    public static class46 field521 = new class46();

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    public int field530;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)Lav;")
    public final class592 method362(int arg0, byte arg1) {
        field526++;
        class382 var3 = this.field524;
        class592 var4;
        synchronized (this.field524) {
            var4 = (class592) this.field524.method2287(1, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class522 var5 = this.field527;
        byte[] var6;
        synchronized (this.field527) {
            var6 = this.field527.method3007(class226.method1485(22, arg0), class157.method1096(arg0, false), 5);
            if (arg1 <= 72) {
                this.method364(false);
            }
        }
        class592 var7 = new class592();
        var7.field8316 = arg0;
        var7.field8341 = this;
        if (var6 != null) {
            var7.method3357(new class695(var6), -1);
        }
        var7.method3347((byte) 0);
        class382 var8 = this.field524;
        synchronized (this.field524) {
            this.field524.method2291(var7, (long) arg0, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V")
    public static final void method363(int arg0, int arg1) {
        field515++;
        if (arg0 == -30052) {
            class151.method1066(arg1, class274.field4128.method1804(7175, class512.field7203), true);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V")
    public final void method364(boolean arg0) {
        if (!arg0) {
            this.field518 = null;
        }
        field520++;
        class382 var2 = this.field524;
        synchronized (this.field524) {
            this.field524.method2279(0);
        }
        class382 var3 = this.field528;
        synchronized (this.field528) {
            this.field528.method2279(0);
        }
        class382 var4 = this.field529;
        synchronized (this.field529) {
            this.field529.method2279(0);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZZ)V")
    public final void method365(boolean arg0, boolean arg1) {
        field517++;
        if (this.field523 == arg1) {
            return;
        }
        this.field523 = arg1;
        this.method369(-107);
        if (!arg0) {
            this.method364(false);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static void method366(int arg0) {
        field521 = null;
        if (arg0 != 0) {
            field521 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)V")
    public final void method367(int arg0, int arg1) {
        this.field530 = arg1;
        field522++;
        class382 var3 = this.field528;
        synchronized (this.field528) {
            this.field528.method2285((byte) -109);
            if (arg0 != 50) {
                this.field530 = -95;
            }
        }
        class382 var4 = this.field529;
        synchronized (this.field529) {
            this.field529.method2285((byte) -84);
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(IB)V")
    public final void method368(int arg0, byte arg1) {
        field513++;
        class382 var3 = this.field524;
        synchronized (this.field524) {
            if (arg1 <= 32) {
                this.method369(28);
            }
            this.field524.method2290(false, arg0);
        }
        class382 var4 = this.field528;
        synchronized (this.field528) {
            this.field528.method2290(false, arg0);
        }
        class382 var5 = this.field529;
        synchronized (this.field529) {
            this.field529.method2290(false, arg0);
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
    public final void method369(int arg0) {
        field516++;
        class382 var2 = this.field524;
        synchronized (this.field524) {
            this.field524.method2285((byte) -103);
        }
        class382 var3 = this.field528;
        synchronized (this.field528) {
            this.field528.method2285((byte) -117);
        }
        if (arg0 <= -72) {
            class382 var4 = this.field529;
            synchronized (this.field529) {
                this.field529.method2285((byte) -107);
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIII)I")
    public static final int method370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field514++;
        if (class296.field4340 == null) {
            return 0;
        }
        if (arg4 < 3) {
            int var6 = arg2 >> 9;
            int var7 = arg3 >> 9;
            if (arg1 < 0 || arg0 < 0 || class199.field2812 - 1 < arg1 || (class232.field3611 - 1) < arg0) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || (class199.field2812 - 1) < var6 || var7 > (class232.field3611 - 1)) {
                return 0;
            }
            boolean var8 = (class672.field9500[1][arg2 >> 9][arg3 >> 9] & 0x2) != 0;
            if ((arg2 & 0x1FF) == 0) {
                boolean var9 = (class672.field9500[1][var6 - 1][arg3 >> 9] & 0x2) != 0;
                boolean var10 = (class672.field9500[1][var6][arg3 >> 9] & 0x2) != 0;
                if (var10 != var9) {
                    var8 = (class672.field9500[1][arg1][arg0] & 0x2) != 0;
                }
            }
            if ((arg3 & 0x1FF) == 0) {
                boolean var11 = (class672.field9500[1][arg2 >> 9][var7 - 1] & 0x2) != 0;
                boolean var12 = (class672.field9500[1][arg2 >> 9][var7] & 0x2) != 0;
                if (var11 != var12) {
                    var8 = (class672.field9500[1][arg1][arg0] & 0x2) != 0;
                }
            }
            if (var8) {
                arg4++;
            }
        }
        if (arg5 != -12634) {
            field521 = null;
        }
        return class296.field4340[arg4].method442(arg2, true, arg3);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
    public final void method371(byte arg0) {
        class382 var2 = this.field528;
        synchronized (this.field528) {
            this.field528.method2285((byte) -100);
        }
        int var3 = 127 / ((arg0 + 55) / 58);
        field519++;
        class382 var4 = this.field529;
        synchronized (this.field529) {
            this.field529.method2285((byte) -79);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)Z")
    public static final boolean method372(int arg0, int arg1, int arg2) {
        field512++;
        int var3 = 123 % ((arg2 - 24) / 58);
        return class553.method3136((byte) 103, arg0, arg1) | (arg0 & 0x800) != 0 || class328.method2064(arg1, arg0, 128);
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lkr;IZLpu;Lpu;)V")
    public class33(class693 arg0, int arg1, boolean arg2, class522 arg3, class522 arg4) {
        this.field523 = arg2;
        this.field518 = arg4;
        this.field525 = arg0;
        this.field527 = arg3;
        if (this.field527 != null) {
            int var6 = this.field527.method2977((byte) -95) - 1;
            this.field527.method2988(-61, var6);
        }
    }
}
