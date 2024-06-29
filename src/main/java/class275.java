import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class275 {

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "Ljk;")
    private class449 field3447 = new class449(128);

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "Ljk;")
    public class449 field3456 = new class449(64);

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "Lqn;")
    public class47 field3448;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "Lqn;")
    private class47 field3450;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "Lkg;")
    public static class179 field3452;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "Lft;")
    public static class4 field3455;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)V")
    public final void method1619(int arg0, int arg1, int arg2) {
        field3451++;
        this.field3447 = new class449(arg0);
        if (arg1 != -1) {
            this.field3456 = null;
        }
        this.field3456 = new class449(arg2);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)Lgp;")
    public final class36 method1620(int arg0, int arg1) {
        field3449++;
        class449 var3 = this.field3447;
        class36 var4;
        synchronized (this.field3447) {
            var4 = (class36) this.field3447.method2647(-99, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class47 var5 = this.field3450;
        byte[] var6;
        synchronized (this.field3450) {
            var6 = this.field3450.method481(arg1, arg0, -90);
        }
        class36 var7 = new class36();
        var7.field482 = arg0;
        var7.field454 = this;
        if (var6 != null) {
            var7.method259(new class463(var6), -5851);
        }
        var7.method263(2);
        class449 var8 = this.field3447;
        synchronized (this.field3447) {
            this.field3447.method2635((long) arg0, -26591, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1621(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg5 != 25587) {
            method1621(-88, 41, 8, -90, -36, 7, 54, -53, 115);
        }
        class409.method2431(arg3, arg1, arg2, arg0, arg8, arg6, 0, arg4, true, arg7);
        field3457++;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public static void method1622(int arg0) {
        field3455 = null;
        field3452 = null;
        if (arg0 >= -126) {
            method1622(115);
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
    public final void method1623(int arg0) {
        class449 var2 = this.field3447;
        synchronized (this.field3447) {
            this.field3447.method2640(102);
        }
        field3454++;
        if (arg0 == 36) {
            class449 var3 = this.field3456;
            synchronized (this.field3456) {
                this.field3456.method2640(100);
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)V")
    public final void method1624(int arg0, int arg1) {
        class449 var3 = this.field3447;
        synchronized (this.field3447) {
            this.field3447.method2648(false, arg0);
        }
        field3445++;
        class449 var4 = this.field3456;
        synchronized (this.field3456) {
            this.field3456.method2648(false, arg0);
        }
        if (arg1 != -22345) {
            this.field3456 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V")
    public final void method1625(int arg0) {
        field3446++;
        class449 var2 = this.field3447;
        synchronized (this.field3447) {
            this.field3447.method2642(0);
        }
        class449 var3 = this.field3456;
        synchronized (this.field3456) {
            if (arg0 != 29252) {
                this.method1625(4);
            }
            this.field3456.method2642(0);
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lae;ILqn;Lqn;)V")
    public class275(class165 arg0, int arg1, class47 arg2, class47 arg3) {
        this.field3448 = arg3;
        this.field3450 = arg2;
        this.field3450.method469(30322, 36);
    }

    static {
        new class335("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
        field3452 = new class179(1, -1);
    }
}
