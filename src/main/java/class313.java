import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class313 {

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "Ljk;")
    private class449 field4000 = new class449(64);

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "Ljk;")
    public class449 field4004 = new class449(30);

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "Lqn;")
    public class47 field4002;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "Lqn;")
    private class47 field3995;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public static int field3998 = 0;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public int field4005;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "Lcw;")
    public static class121 field3993;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "[Lj;")
    public static class380[] field3994;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)V", line = 3)
    public final void method1835(int arg0, int arg1) {
        field4003++;
        class449 var3 = this.field4000;
        synchronized (this.field4000) {
            this.field4000.method2648(false, arg1);
        }
        class449 var4 = this.field4004;
        synchronized (this.field4004) {
            this.field4004.method2648(false, arg1);
            if (arg0 != 1) {
                this.field4004 = null;
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(II)Lmj;", line = 25)
    public final class466 method1836(int arg0, int arg1) {
        field4001++;
        class449 var3 = this.field4000;
        class466 var4;
        synchronized (this.field4000) {
            var4 = (class466) this.field4000.method2647(-127, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class47 var5 = this.field3995;
        byte[] var6;
        synchronized (this.field3995) {
            var6 = this.field3995.method481(class230.method1401(true, arg1), class115.method829(255, arg1), -103);
        }
        class466 var7 = new class466();
        var7.field6718 = this;
        var7.field6731 = arg1;
        if (var6 != null) {
            var7.method2813(new class463(var6), (byte) 81);
        }
        class449 var8 = this.field4000;
        synchronized (this.field4000) {
            this.field4000.method2635((long) arg1, -26591, var7);
            int var9 = -31 % ((79 - arg0) / 36);
            return var7;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V", line = 59)
    public static void method1837(int arg0) {
        if (arg0 != 30) {
            field3993 = null;
        }
        field3993 = null;
        field3994 = null;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V", line = 76)
    public final void method1838(int arg0) {
        field3999++;
        class449 var2 = this.field4000;
        synchronized (this.field4000) {
            this.field4000.method2642(0);
        }
        if (arg0 >= -73) {
            this.method1836(104, 4);
        }
        class449 var3 = this.field4004;
        synchronized (this.field4004) {
            this.field4004.method2642(0);
        }
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(II)V", line = 96)
    public final void method1839(int arg0, int arg1) {
        this.field4005 = arg1;
        field3996++;
        class449 var3 = this.field4004;
        synchronized (this.field4004) {
            this.field4004.method2642(arg0);
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lae;ILqn;Lqn;)V", line = 130)
    public class313(class165 arg0, int arg1, class47 arg2, class47 arg3) {
        this.field4002 = arg3;
        this.field3995 = arg2;
        int var5 = this.field3995.method472((byte) -82) - 1;
        this.field3995.method469(30322, var5);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)V", line = 110)
    public final void method1840(boolean arg0) {
        field3997++;
        class449 var2 = this.field4000;
        synchronized (this.field4000) {
            if (!arg0) {
                field3993 = null;
            }
            this.field4000.method2640(115);
        }
        class449 var3 = this.field4004;
        synchronized (this.field4004) {
            this.field4004.method2640(111);
        }
    }
}
