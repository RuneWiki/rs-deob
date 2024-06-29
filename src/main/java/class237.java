import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class237 {

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "Lvh;")
    private class328 field3398 = new class328(64);

    @OriginalMember(owner = "client!oba", name = "o", descriptor = "Lvh;")
    public class328 field3412 = new class328(50);

    @OriginalMember(owner = "client!oba", name = "q", descriptor = "Lvh;")
    public class328 field3414 = new class328(5);

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "Lpj;")
    private class132 field3399;

    @OriginalMember(owner = "client!oba", name = "i", descriptor = "Ldd;")
    public class647 field3406;

    @OriginalMember(owner = "client!oba", name = "e", descriptor = "Lpj;")
    public class132 field3402;

    @OriginalMember(owner = "client!oba", name = "m", descriptor = "Z")
    public boolean field3410;

    @OriginalMember(owner = "client!oba", name = "p", descriptor = "Lfc;")
    public static class235 field3413 = new class235(57, 3);

    @OriginalMember(owner = "client!oba", name = "c", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!oba", name = "d", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!oba", name = "f", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!oba", name = "g", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!oba", name = "h", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!oba", name = "j", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!oba", name = "k", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!oba", name = "l", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!oba", name = "n", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!oba", name = "r", descriptor = "I")
    public int field3415;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(I)V")
    public final void method1490(int arg0) {
        class328 var2 = this.field3412;
        synchronized (this.field3412) {
            this.field3412.method1997(1);
        }
        field3400++;
        class328 var3 = this.field3414;
        synchronized (this.field3414) {
            this.field3414.method1997(1);
            if (arg0 >= -115) {
                this.field3402 = null;
            }
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(ZZ)V")
    public final void method1491(boolean arg0, boolean arg1) {
        field3405++;
        if (this.field3410 == arg1) {
            return;
        }
        this.field3410 = arg1;
        this.method1492(6876);
        if (!arg0) {
            method1500(109, null, false, null);
        }
    }

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "(I)V")
    public final void method1492(int arg0) {
        class328 var2 = this.field3398;
        synchronized (this.field3398) {
            this.field3398.method1997(arg0 - 6875);
        }
        field3407++;
        class328 var3 = this.field3412;
        synchronized (this.field3412) {
            this.field3412.method1997(1);
        }
        class328 var4 = this.field3414;
        synchronized (this.field3414) {
            this.field3414.method1997(1);
            if (arg0 != 6876) {
                method1500(9, null, true, null);
            }
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IB)Lei;")
    public final class161 method1493(int arg0, byte arg1) {
        field3411++;
        if (arg1 != -71) {
            return null;
        }
        class328 var3 = this.field3398;
        class161 var4;
        synchronized (this.field3398) {
            var4 = (class161) this.field3398.method1986((byte) -101, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class132 var5 = this.field3399;
        byte[] var6;
        synchronized (this.field3399) {
            var6 = this.field3399.method940(class446.method2568(false, arg0), class170.method1169(arg0, -91), arg1 + 71);
        }
        class161 var7 = new class161();
        var7.field2452 = this;
        var7.field2459 = arg0;
        if (var6 != null) {
            var7.method1115(new class96(var6), -1);
        }
        var7.method1119((byte) 117);
        class328 var8 = this.field3398;
        synchronized (this.field3398) {
            this.field3398.method1985(var7, (long) arg0, (byte) -102);
            return var7;
        }
    }

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "(IB)V")
    public final void method1494(int arg0, byte arg1) {
        field3404++;
        class328 var3 = this.field3398;
        synchronized (this.field3398) {
            this.field3398.method1989(arg0, (byte) 85);
        }
        class328 var4 = this.field3412;
        synchronized (this.field3412) {
            if (arg1 >= -65) {
                method1500(36, null, true, null);
            }
            this.field3412.method1989(arg0, (byte) 82);
        }
        class328 var5 = this.field3414;
        synchronized (this.field3414) {
            this.field3414.method1989(arg0, (byte) 81);
        }
    }

    @OriginalMember(owner = "client!oba", name = "c", descriptor = "(I)V")
    public static void method1495(int arg0) {
        if (arg0 != 5) {
            field3413 = null;
        }
        field3413 = null;
    }

    @OriginalMember(owner = "client!oba", name = "d", descriptor = "(I)V")
    public final void method1496(int arg0) {
        field3409++;
        class328 var2 = this.field3398;
        synchronized (this.field3398) {
            this.field3398.method1987(-31085);
        }
        class328 var3 = this.field3412;
        synchronized (this.field3412) {
            this.field3412.method1987(arg0 - 31090);
        }
        class328 var4 = this.field3414;
        synchronized (this.field3414) {
            this.field3414.method1987(-31085);
        }
        if (arg0 != 5) {
            method1500(44, null, false, null);
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(III)Les;")
    public static final class348 method1497(int arg0, int arg1, int arg2) {
        class486 var3 = class658.field9266[arg0][arg1][arg2];
        return var3 == null || var3.field6748 == null ? null : var3.field6748;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IC)Z")
    public static final boolean method1498(int arg0, char arg1) {
        field3401++;
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class625.method3479(-66, arg1)) {
            return true;
        } else {
            char[] var2 = class679.field9568;
            for (int var3 = arg0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg1 == var7) {
                    return true;
                }
            }
            char[] var4 = class83.field1163;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg1 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(BI)V")
    public final void method1499(byte arg0, int arg1) {
        field3408++;
        int var3 = -41 % ((arg0 + 44) / 49);
        this.field3415 = arg1;
        class328 var4 = this.field3412;
        synchronized (this.field3412) {
            this.field3412.method1997(1);
        }
        class328 var5 = this.field3414;
        synchronized (this.field3414) {
            this.field3414.method1997(1);
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(ILe;ZLjava/awt/Canvas;)Loa;")
    public static final class638 method1500(int arg0, class489 arg1, boolean arg2, Canvas arg3) {
        if (arg0 != 1673) {
            method1498(-47, (char) 65535);
        }
        field3403++;
        return arg2 ? new class581(arg3, arg1) : new class54(arg3, arg1);
    }

    @OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(Ldd;IZLpj;Lpj;)V")
    public class237(class647 arg0, int arg1, boolean arg2, class132 arg3, class132 arg4) {
        this.field3399 = arg3;
        this.field3406 = arg0;
        this.field3402 = arg4;
        this.field3410 = arg2;
        if (this.field3399 != null) {
            int var6 = this.field3399.method917((byte) -74) - 1;
            this.field3399.method936(var6, -118);
        }
    }
}
