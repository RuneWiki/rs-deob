import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class438 {

    @OriginalMember(owner = "client!qp", name = "j", descriptor = "Z")
    public boolean field6388 = false;

    @OriginalMember(owner = "client!qp", name = "l", descriptor = "Lau;")
    private class692 field6390 = new class692(64);

    @OriginalMember(owner = "client!qp", name = "o", descriptor = "Lau;")
    public class692 field6393 = new class692(500);

    @OriginalMember(owner = "client!qp", name = "p", descriptor = "Lau;")
    public class692 field6394 = new class692(30);

    @OriginalMember(owner = "client!qp", name = "q", descriptor = "Lau;")
    public class692 field6395 = new class692(50);

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "Lmv;")
    private class295 field6383;

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "Z")
    public boolean field6387;

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "Lmv;")
    public class295 field6386;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "I")
    public static int field6380;

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "I")
    public static int field6381;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "I")
    public static int field6384;

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!qp", name = "k", descriptor = "I")
    public static int field6389;

    @OriginalMember(owner = "client!qp", name = "m", descriptor = "I")
    public static int field6391;

    @OriginalMember(owner = "client!qp", name = "n", descriptor = "I")
    public static int field6392;

    @OriginalMember(owner = "client!qp", name = "r", descriptor = "I")
    public int field6396;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZB)V")
    public final void method2594(boolean arg0, byte arg1) {
        int var3 = -2 / ((-arg1 - 30) / 59);
        field6384++;
        if (this.field6388 != arg0) {
            this.field6388 = arg0;
            this.method2599(-95);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZI)V")
    public final void method2595(boolean arg0, int arg1) {
        field6389++;
        this.field6396 = arg1;
        if (!arg0) {
            return;
        }
        class692 var3 = this.field6393;
        synchronized (this.field6393) {
            this.field6393.method3890(-1);
        }
        class692 var4 = this.field6394;
        synchronized (this.field6394) {
            this.field6394.method3890(-1);
        }
        class692 var5 = this.field6395;
        synchronized (this.field6395) {
            this.field6395.method3890(-1);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)Llt;")
    public final class289 method2596(int arg0, int arg1) {
        field6385++;
        class692 var3 = this.field6390;
        class289 var4;
        synchronized (this.field6390) {
            if (arg0 != 0) {
                this.method2595(false, 8);
            }
            var4 = (class289) this.field6390.method3901((long) arg1, -75);
        }
        if (var4 != null) {
            return var4;
        }
        class295 var5 = this.field6383;
        byte[] var6;
        synchronized (this.field6383) {
            var6 = this.field6383.method1844(class418.method2541(23341, arg1), 31330, class608.method3476((byte) -114, arg1));
        }
        class289 var7 = new class289();
        var7.field4224 = arg1;
        var7.field4205 = this;
        if (var6 != null) {
            var7.method1786(new class540(var6), false);
        }
        var7.method1776(arg0 - 60);
        if (!this.field6387 && var7.field4265) {
            var7.field4247 = null;
            var7.field4218 = null;
        }
        if (var7.field4221) {
            var7.field4240 = false;
            var7.field4273 = 0;
        }
        class692 var8 = this.field6390;
        synchronized (this.field6390) {
            this.field6390.method3894(var7, (byte) 60, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V")
    public final void method2597(int arg0) {
        class692 var2 = this.field6390;
        synchronized (this.field6390) {
            this.field6390.method3891(13747);
        }
        field6379++;
        if (arg0 <= 94) {
            this.method2602(false, (byte) -26);
        }
        class692 var3 = this.field6393;
        synchronized (this.field6393) {
            this.field6393.method3891(13747);
        }
        class692 var4 = this.field6394;
        synchronized (this.field6394) {
            this.field6394.method3891(13747);
        }
        class692 var5 = this.field6395;
        synchronized (this.field6395) {
            this.field6395.method3891(13747);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IZ)V")
    public final void method2598(int arg0, boolean arg1) {
        if (arg1) {
            method2601(126, 77, 20);
        }
        field6381++;
        this.field6390 = new class692(arg0);
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V")
    public final void method2599(int arg0) {
        class692 var2 = this.field6390;
        synchronized (this.field6390) {
            this.field6390.method3890(-1);
            if (arg0 >= -76) {
                this.field6386 = null;
            }
        }
        field6380++;
        class692 var3 = this.field6393;
        synchronized (this.field6393) {
            this.field6393.method3890(-1);
        }
        class692 var4 = this.field6394;
        synchronized (this.field6394) {
            this.field6394.method3890(-1);
        }
        class692 var5 = this.field6395;
        synchronized (this.field6395) {
            this.field6395.method3890(-1);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(BI)V")
    public final void method2600(byte arg0, int arg1) {
        class692 var3 = this.field6390;
        synchronized (this.field6390) {
            this.field6390.method3900(arg1, arg0 ^ 0xFFFFFFD5);
        }
        field6382++;
        class692 var4 = this.field6393;
        synchronized (this.field6393) {
            this.field6393.method3900(arg1, 0);
        }
        class692 var5 = this.field6394;
        synchronized (this.field6394) {
            this.field6394.method3900(arg1, 0);
        }
        class692 var6 = this.field6395;
        synchronized (this.field6395) {
            this.field6395.method3900(arg1, arg0 + 43);
        }
        if (arg0 != -43) {
            this.method2598(30, true);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(III)Z")
    public static final boolean method2601(int arg0, int arg1, int arg2) {
        if (arg1 <= 6) {
            return true;
        } else {
            field6392++;
            return class373.method2298(arg0, 16383, arg2) & class162.method1149(arg2, arg0, 94);
        }
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(ZB)V")
    public final void method2602(boolean arg0, byte arg1) {
        if (arg1 >= -112) {
            method2601(76, 83, -62);
        }
        field6391++;
        if (arg0 != this.field6387) {
            this.field6387 = arg0;
            this.method2599(-98);
        }
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lsea;IZLmv;Lmv;)V")
    public class438(class373 arg0, int arg1, boolean arg2, class295 arg3, class295 arg4) {
        this.field6383 = arg3;
        this.field6387 = arg2;
        this.field6386 = arg4;
        if (this.field6383 != null) {
            int var6 = this.field6383.method1816(-128) - 1;
            this.field6383.method1845(var6, true);
        }
    }
}
