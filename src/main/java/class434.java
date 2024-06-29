import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class434 {

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "Lfr;")
    private class231 field6471 = new class231(64);

    @OriginalMember(owner = "client!dt", name = "n", descriptor = "Lfr;")
    public class231 field6484 = new class231(30);

    @OriginalMember(owner = "client!dt", name = "f", descriptor = "Lqs;")
    private class496 field6476;

    @OriginalMember(owner = "client!dt", name = "l", descriptor = "Lqs;")
    public class496 field6482;

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "[B")
    public static byte[] field6474 = new byte[2048];

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "Lnk;")
    public static class326 field6477 = new class326(52, 4);

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "I")
    public static int field6472;

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "I")
    public static int field6473;

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!dt", name = "h", descriptor = "I")
    public static int field6478;

    @OriginalMember(owner = "client!dt", name = "j", descriptor = "I")
    public static int field6480;

    @OriginalMember(owner = "client!dt", name = "k", descriptor = "I")
    public static int field6481;

    @OriginalMember(owner = "client!dt", name = "m", descriptor = "I")
    public static int field6483;

    @OriginalMember(owner = "client!dt", name = "o", descriptor = "I")
    public int field6485;

    @OriginalMember(owner = "client!dt", name = "i", descriptor = "[I")
    public static int[] field6479;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(III)I", line = 3)
    public static final int method2629(int arg0, int arg1, int arg2) {
        field6480++;
        return arg0 == arg2 || arg2 == 5 ? class54.field876[arg1 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(BI)Lsa;", line = 22)
    public final class526 method2630(byte arg0, int arg1) {
        field6481++;
        if (arg0 <= 96) {
            this.method2632((byte) 82);
        }
        class231 var3 = this.field6471;
        class526 var4;
        synchronized (this.field6471) {
            var4 = (class526) this.field6471.method1593((byte) 126, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class496 var5 = this.field6476;
        byte[] var6;
        synchronized (this.field6476) {
            var6 = this.field6476.method2926(class404.method2506(arg1, 32693), -56, class44.method320(false, arg1));
        }
        class526 var7 = new class526();
        var7.field7742 = arg1;
        var7.field7763 = this;
        if (var6 != null) {
            var7.method3114(new class23(var6), -124);
        }
        class231 var8 = this.field6471;
        synchronized (this.field6471) {
            this.field6471.method1595(var7, (long) arg1, (byte) -112);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(II)V", line = 55)
    public final void method2631(int arg0, int arg1) {
        if (arg1 != 3) {
            return;
        }
        this.field6485 = arg0;
        field6472++;
        class231 var3 = this.field6484;
        synchronized (this.field6484) {
            this.field6484.method1604(4);
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)V", line = 69)
    public final void method2632(byte arg0) {
        class231 var2 = this.field6471;
        synchronized (this.field6471) {
            this.field6471.method1604(4);
        }
        field6473++;
        class231 var3 = this.field6484;
        synchronized (this.field6484) {
            this.field6484.method1604(4);
        }
        if (arg0 > -6) {
            this.method2630((byte) 118, -85);
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IB)V", line = 88)
    public final void method2633(int arg0, byte arg1) {
        field6475++;
        class231 var3 = this.field6471;
        synchronized (this.field6471) {
            this.field6471.method1603((byte) -118, arg0);
            if (arg1 <= 39) {
                this.method2633(-80, (byte) 124);
            }
        }
        class231 var4 = this.field6484;
        synchronized (this.field6484) {
            this.field6484.method1603((byte) -100, arg0);
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V", line = 107)
    public final void method2634(int arg0) {
        class231 var2 = this.field6471;
        synchronized (this.field6471) {
            this.field6471.method1598(-104);
        }
        if (arg0 != 64) {
            this.method2634(-45);
        }
        field6478++;
        class231 var3 = this.field6484;
        synchronized (this.field6484) {
            this.field6484.method1598(-104);
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Z)V", line = 125)
    public static void method2635(boolean arg0) {
        field6474 = null;
        if (!arg0) {
            field6477 = null;
        }
        field6477 = null;
        field6479 = null;
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Lwv;ILqs;Lqs;)V", line = 151)
    public class434(class535 arg0, int arg1, class496 arg2, class496 arg3) {
        this.field6476 = arg2;
        this.field6482 = arg3;
        int var5 = this.field6476.method2919((byte) -76) - 1;
        this.field6476.method2940(var5, -10511);
    }
}
