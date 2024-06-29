import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class664 {

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "Z")
    public boolean field9443 = false;

    @OriginalMember(owner = "client!cm", name = "q", descriptor = "Lpca;")
    private class653 field9450 = new class653(64);

    @OriginalMember(owner = "client!cm", name = "r", descriptor = "Lpca;")
    public class653 field9451 = new class653(500);

    @OriginalMember(owner = "client!cm", name = "s", descriptor = "Lpca;")
    public class653 field9452 = new class653(30);

    @OriginalMember(owner = "client!cm", name = "t", descriptor = "Lpca;")
    public class653 field9453 = new class653(50);

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "Z")
    public boolean field9447;

    @OriginalMember(owner = "client!cm", name = "o", descriptor = "Ljo;")
    public class303 field9448;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "Ljo;")
    private class303 field9435;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public static int field9436 = 0;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "I")
    public static int field9446 = 0;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "Lgl;")
    public static class547 field9438 = new class547(8, 3);

    @OriginalMember(owner = "client!cm", name = "p", descriptor = "[I")
    public static int[] field9449 = new int[1024];

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
    public static int field9434;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public static int field9437;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
    public static int field9439;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
    public static int field9440;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
    public static int field9441;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
    public static int field9442;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "I")
    public static int field9444;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
    public static int field9445;

    @OriginalMember(owner = "client!cm", name = "u", descriptor = "I")
    public int field9454;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IB)V")
    public final void method3726(int arg0, byte arg1) {
        field9442++;
        class653 var3 = this.field9450;
        synchronized (this.field9450) {
            this.field9450.method3691(false, arg0);
            if (arg1 <= 61) {
                this.field9447 = false;
            }
        }
        class653 var4 = this.field9451;
        synchronized (this.field9451) {
            this.field9451.method3691(false, arg0);
        }
        class653 var5 = this.field9452;
        synchronized (this.field9452) {
            this.field9452.method3691(false, arg0);
        }
        class653 var6 = this.field9453;
        synchronized (this.field9453) {
            this.field9453.method3691(false, arg0);
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(IB)V")
    public final void method3727(int arg0, byte arg1) {
        this.field9454 = arg0;
        field9434++;
        class653 var3 = this.field9451;
        synchronized (this.field9451) {
            this.field9451.method3687((byte) -10);
        }
        if (arg1 != 67) {
            this.method3726(-63, (byte) -116);
        }
        class653 var4 = this.field9452;
        synchronized (this.field9452) {
            this.field9452.method3687((byte) -10);
        }
        class653 var5 = this.field9453;
        synchronized (this.field9453) {
            this.field9453.method3687((byte) -10);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V")
    public final void method3728(int arg0) {
        class653 var2 = this.field9450;
        synchronized (this.field9450) {
            if (arg0 != 32639) {
                this.field9454 = 1;
            }
            this.field9450.method3684(-17200);
        }
        field9439++;
        class653 var3 = this.field9451;
        synchronized (this.field9451) {
            this.field9451.method3684(-17200);
        }
        class653 var4 = this.field9452;
        synchronized (this.field9452) {
            this.field9452.method3684(-17200);
        }
        class653 var5 = this.field9453;
        synchronized (this.field9453) {
            this.field9453.method3684(arg0 ^ 0xFFFFC3AF);
        }
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(IB)Lbfa;")
    public final class335 method3729(int arg0, byte arg1) {
        field9441++;
        class653 var3 = this.field9450;
        class335 var4;
        synchronized (this.field9450) {
            var4 = (class335) this.field9450.method3690((byte) 115, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class303 var5 = this.field9435;
        byte[] var6;
        synchronized (this.field9435) {
            var6 = this.field9435.method1719(class536.method3049(arg0, 56), class59.method400(arg0, arg1 ^ 0xFFFFFF90), 4);
        }
        class335 var7 = new class335();
        var7.field4372 = this;
        var7.field4324 = arg0;
        if (var6 != null) {
            var7.method1894(arg1 ^ 0xFFFFD329, new class452(var6));
        }
        var7.method1883(arg1 - 192);
        if (!this.field9447 && var7.field4358) {
            var7.field4350 = null;
            var7.field4375 = null;
        }
        if (var7.field4335) {
            var7.field4383 = 0;
            var7.field4398 = false;
        }
        class653 var8 = this.field9450;
        synchronized (this.field9450) {
            this.field9450.method3683(var7, (byte) 116, (long) arg0);
        }
        return arg1 == 109 ? var7 : null;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZI)V")
    public final void method3730(boolean arg0, int arg1) {
        field9445++;
        if (arg1 == 0 && this.field9447 != arg0) {
            this.field9447 = arg0;
            this.method3731((byte) 33);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)V")
    public final void method3731(byte arg0) {
        field9444++;
        class653 var2 = this.field9450;
        synchronized (this.field9450) {
            this.field9450.method3687((byte) -10);
        }
        class653 var3 = this.field9451;
        synchronized (this.field9451) {
            if (arg0 != 33) {
                this.method3728(68);
            }
            this.field9451.method3687((byte) -10);
        }
        class653 var4 = this.field9452;
        synchronized (this.field9452) {
            this.field9452.method3687((byte) -10);
        }
        class653 var5 = this.field9453;
        synchronized (this.field9453) {
            this.field9453.method3687((byte) -10);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)V")
    public final void method3732(int arg0, int arg1) {
        this.field9450 = new class653(arg1);
        field9437++;
        if (arg0 != 3) {
            this.field9453 = null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)V")
    public static void method3733(int arg0) {
        if (arg0 != 30) {
            field9449 = null;
        }
        field9449 = null;
        field9438 = null;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(ZI)V")
    public final void method3734(boolean arg0, int arg1) {
        if (arg1 != 500) {
            this.method3726(-106, (byte) -80);
        }
        field9440++;
        if (arg0 != this.field9443) {
            this.field9443 = arg0;
            this.method3731((byte) 33);
        }
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Ljda;IZLjo;Ljo;)V")
    public class664(class207 arg0, int arg1, boolean arg2, class303 arg3, class303 arg4) {
        this.field9447 = arg2;
        this.field9448 = arg4;
        this.field9435 = arg3;
        if (this.field9435 != null) {
            int var6 = this.field9435.method1740((byte) 53) - 1;
            this.field9435.method1727(-77, var6);
        }
    }
}
