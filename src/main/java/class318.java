import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class318 {

    @OriginalMember(owner = "client!mu", name = "j", descriptor = "Lpja;")
    private class43 field4335 = new class43(64);

    @OriginalMember(owner = "client!mu", name = "p", descriptor = "Lpja;")
    public class43 field4341 = new class43(50);

    @OriginalMember(owner = "client!mu", name = "q", descriptor = "Lpja;")
    public class43 field4342 = new class43(5);

    @OriginalMember(owner = "client!mu", name = "n", descriptor = "Lgj;")
    public class662 field4339;

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "Lgj;")
    private class662 field4327;

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "Z")
    public boolean field4332;

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "Lim;")
    public class598 field4331;

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "[I")
    public static int[] field4328 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!mu", name = "i", descriptor = "Z")
    public static boolean field4334 = false;

    @OriginalMember(owner = "client!mu", name = "h", descriptor = "Z")
    public static boolean field4333 = false;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!mu", name = "k", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!mu", name = "l", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!mu", name = "m", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!mu", name = "o", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!mu", name = "r", descriptor = "I")
    public int field4343;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(II)V", line = 3)
    public final void method1998(int arg0, int arg1) {
        if (arg0 != 5) {
            field4334 = true;
        }
        field4326++;
        class43 var3 = this.field4335;
        synchronized (this.field4335) {
            this.field4335.method265(arg1, arg0 - 114);
        }
        class43 var4 = this.field4341;
        synchronized (this.field4341) {
            this.field4341.method265(arg1, arg0 ^ 0xFFFFFF98);
        }
        class43 var5 = this.field4342;
        synchronized (this.field4342) {
            this.field4342.method265(arg1, -69);
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(ZB)V", line = 24)
    public final void method1999(boolean arg0, byte arg1) {
        field4330++;
        if (arg0 != this.field4332) {
            this.field4332 = arg0;
            int var3 = -75 / ((-arg1 - 66) / 43);
            this.method2004(3);
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(BI)V", line = 38)
    public final void method2000(byte arg0, int arg1) {
        field4336++;
        this.field4343 = arg1;
        if (arg0 <= 55) {
            return;
        }
        class43 var3 = this.field4341;
        synchronized (this.field4341) {
            this.field4341.method273(126);
        }
        class43 var4 = this.field4342;
        synchronized (this.field4342) {
            this.field4342.method273(-56);
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Z)V", line = 57)
    public final void method2001(boolean arg0) {
        if (!arg0) {
            field4328 = null;
        }
        class43 var2 = this.field4335;
        synchronized (this.field4335) {
            this.field4335.method272(20);
        }
        field4340++;
        class43 var3 = this.field4341;
        synchronized (this.field4341) {
            this.field4341.method272(20);
        }
        class43 var4 = this.field4342;
        synchronized (this.field4342) {
            this.field4342.method272(20);
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V", line = 80)
    public final void method2002(int arg0) {
        field4329++;
        class43 var2 = this.field4341;
        synchronized (this.field4341) {
            this.field4341.method273(127);
            if (arg0 != 4) {
                field4328 = null;
            }
        }
        class43 var3 = this.field4342;
        synchronized (this.field4342) {
            this.field4342.method273(-111);
        }
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)V", line = 103)
    public static void method2003(int arg0) {
        field4328 = null;
        if (arg0 != 64) {
            method2003(-112);
        }
    }

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "(I)V", line = 119)
    public final void method2004(int arg0) {
        class43 var2 = this.field4335;
        synchronized (this.field4335) {
            this.field4335.method273(-95);
        }
        field4338++;
        class43 var3 = this.field4341;
        synchronized (this.field4341) {
            this.field4341.method273(arg0 - 99);
        }
        if (arg0 == 3) {
            class43 var4 = this.field4342;
            synchronized (this.field4342) {
                this.field4342.method273(-56);
            }
        }
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lim;IZLgj;Lgj;)V", line = 187)
    public class318(class598 arg0, int arg1, boolean arg2, class662 arg3, class662 arg4) {
        this.field4339 = arg4;
        this.field4327 = arg3;
        this.field4332 = arg2;
        this.field4331 = arg0;
        if (this.field4327 != null) {
            int var6 = this.field4327.method3723(5) - 1;
            this.field4327.method3730((byte) -122, var6);
        }
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(II)Lac;", line = 146)
    public final class568 method2005(int arg0, int arg1) {
        field4337++;
        class43 var3 = this.field4335;
        class568 var4;
        synchronized (this.field4335) {
            var4 = (class568) this.field4335.method266((byte) -103, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class662 var5 = this.field4327;
        byte[] var6;
        synchronized (this.field4327) {
            var6 = this.field4327.method3732(class420.method2467(127, arg1), 8906, class735.method4077(arg1, 1737677767));
        }
        if (arg0 != 6) {
            this.method2000((byte) 10, 89);
        }
        class568 var7 = new class568();
        var7.field8087 = arg1;
        var7.field8098 = this;
        if (var6 != null) {
            var7.method3289(new class93(var6), (byte) 123);
        }
        var7.method3286(false);
        class43 var8 = this.field4335;
        synchronized (this.field4335) {
            this.field4335.method270(var7, (long) arg1, -125);
            return var7;
        }
    }
}
