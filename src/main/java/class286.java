import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class286 {

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "Ljk;")
    private class449 field3663 = new class449(64);

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "Lqn;")
    private class47 field3660;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public static int field3667 = 1;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V", line = 4)
    public final void method1685(int arg0) {
        class449 var2 = this.field3663;
        synchronized (this.field3663) {
            if (arg0 <= 46) {
                field3665 = -113;
            }
            this.field3663.method2640(94);
        }
        field3664++;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V", line = 18)
    public final void method1686(int arg0) {
        class449 var2 = this.field3663;
        synchronized (this.field3663) {
            this.field3663.method2642(arg0 ^ arg0);
        }
        field3661++;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IB)V", line = 32)
    public final void method1687(int arg0, byte arg1) {
        field3662++;
        if (arg1 >= -116) {
            method1689(-125, -48, -122);
        }
        class449 var3 = this.field3663;
        synchronized (this.field3663) {
            this.field3663.method2648(false, arg0);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lrd;B)V", line = 48)
    public static final void method1688(class223 arg0, byte arg1) {
        field3659++;
        if (arg1 > -56) {
            field3667 = -70;
        }
        class433 var2 = (class433) class437.field6263.method2022(-1, (long) arg0.field4890);
        if (var2 == null) {
            return;
        }
        if (var2.field6148 != null) {
            class113.field1506.method2532(var2.field6148);
            var2.field6148 = null;
        }
        var2.method2165(16225);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)Z", line = 77)
    public static final boolean method1689(int arg0, int arg1, int arg2) {
        field3657++;
        if (arg2 != 2048) {
            field3665 = -50;
        }
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)Lgr;", line = 88)
    public final class300 method1690(int arg0, int arg1) {
        field3666++;
        class449 var3 = this.field3663;
        class300 var4;
        synchronized (this.field3663) {
            var4 = (class300) this.field3663.method2647(arg0 ^ 0xFFFFFF80, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class47 var5 = this.field3660;
        byte[] var6;
        synchronized (this.field3660) {
            var6 = this.field3660.method481(class477.method2902(121, arg1), class349.method2009(arg0 ^ arg0, arg1), -124);
        }
        class300 var7 = new class300();
        if (var6 != null) {
            var7.method1777((byte) 125, new class463(var6));
        }
        class449 var8 = this.field3663;
        synchronized (this.field3663) {
            this.field3663.method2635((long) arg1, arg0 - 26591, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lae;ILqn;)V", line = 121)
    public class286(class165 arg0, int arg1, class47 arg2) {
        this.field3660 = arg2;
        if (this.field3660 != null) {
            int var4 = this.field3660.method472((byte) -82) - 1;
            this.field3660.method469(30322, var4);
        }
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)V", line = 145)
    public static final void method1691(int arg0) {
        field3668++;
        if (class218.field2784 == class128.field1703) {
            return;
        }
        try {
            class114.method825("tbrefresh", 13324, class349.field4492);
        } catch (Throwable var2) {
        }
        int var1 = 86 / ((arg0 + 31) / 43);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BI)V", line = 167)
    public final void method1692(byte arg0, int arg1) {
        if (arg0 > -24) {
            return;
        }
        field3658++;
        class449 var3 = this.field3663;
        synchronized (this.field3663) {
            this.field3663.method2642(0);
            this.field3663 = new class449(arg1);
        }
    }
}
