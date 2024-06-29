import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class318 {

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "Lvh;")
    private class328 field4715 = new class328(16);

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "Lpj;")
    private class132 field4717;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "Z")
    public static boolean field4711 = false;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "Lfc;")
    public static class235 field4721 = new class235(80, 5);

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "[[S")
    public static short[][] field4723 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "Ldu;")
    public static class324 field4722 = new class324("WIP", 2);

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
    public static void method1943(byte arg0) {
        field4722 = null;
        if (arg0 != 89) {
            field4711 = true;
        }
        field4723 = null;
        field4721 = null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IB)Lts;")
    private final class491 method1944(int arg0, byte arg1) {
        field4712++;
        class328 var3 = this.field4715;
        class491 var4;
        synchronized (this.field4715) {
            var4 = (class491) this.field4715.method1986((byte) -125, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class132 var5 = this.field4717;
        byte[] var6;
        synchronized (this.field4717) {
            if (arg1 <= 95) {
                field4720 = -97;
            }
            var6 = this.field4717.method940(29, arg0, 0);
        }
        class491 var7 = new class491();
        if (var6 != null) {
            var7.method2750(new class96(var6), (byte) 126);
        }
        class328 var8 = this.field4715;
        synchronized (this.field4715) {
            this.field4715.method1985(var7, (long) arg0, (byte) -102);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BI)V")
    public final void method1945(byte arg0, int arg1) {
        class328 var3 = this.field4715;
        synchronized (this.field4715) {
            this.field4715.method1989(arg1, (byte) 117);
        }
        if (arg0 == 68) {
            field4714++;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIILgd;II)Liea;")
    public final class439 method1946(int arg0, int arg1, int arg2, class309 arg3, int arg4, int arg5) {
        field4713++;
        if (arg0 != 29045) {
            this.field4715 = null;
        }
        class279[] var7 = null;
        class491 var8 = this.method1944(arg5, (byte) 100);
        if (var8.field6783 != null) {
            var7 = new class279[var8.field6783.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class100 var10 = arg3.method1902(30, var8.field6783[var9]);
                var7[var9] = new class279(var10.field1364, var10.field1360, var10.field1363, var10.field1368, var10.field1357, var10.field1362, var10.field1358, var10.field1365);
            }
        }
        return new class439(var8.field6785, var7, var8.field6786, arg4, arg2, arg1);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V")
    public final void method1947(boolean arg0) {
        field4719++;
        class328 var2 = this.field4715;
        synchronized (this.field4715) {
            if (!arg0) {
                this.method1946(-85, 119, -89, null, -81, 33);
            }
            this.field4715.method1997(1);
        }
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Ldd;ILpj;)V")
    public class318(class647 arg0, int arg1, class132 arg2) {
        this.field4717 = arg2;
        this.field4717.method936(29, -117);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
    public final void method1948(int arg0) {
        if (arg0 != 28946) {
            return;
        }
        field4710++;
        class328 var2 = this.field4715;
        synchronized (this.field4715) {
            this.field4715.method1987(-31085);
        }
    }
}
