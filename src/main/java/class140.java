import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class140 {

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "Ljk;")
    private class449 field1803 = new class449(64);

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "Ljk;")
    public class449 field1812 = new class449(64);

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "Lqn;")
    private class47 field1800;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "Lqn;")
    public class47 field1811;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "Ldq;")
    public static class493 field1799 = new class493(17, 2);

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "Z")
    public static volatile boolean field1805 = true;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
    public static int field1810 = -1;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "J")
    public static long field1806 = -1L;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "[Lta;")
    public static class143[] field1808;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "[[I")
    public static int[][] field1804;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)V", line = 8)
    public final void method948(boolean arg0) {
        class449 var2 = this.field1803;
        synchronized (this.field1803) {
            this.field1803.method2642(0);
        }
        field1807++;
        if (!arg0) {
            class449 var3 = this.field1812;
            synchronized (this.field1812) {
                this.field1812.method2642(0);
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)V", line = 27)
    public final void method949(int arg0, int arg1, int arg2) {
        field1802++;
        int var4 = 94 % ((-arg2 - 7) / 45);
        this.field1803 = new class449(arg1);
        this.field1812 = new class449(arg0);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V", line = 38)
    public static void method950(byte arg0) {
        if (arg0 < 106) {
            field1804 = null;
        }
        field1804 = null;
        field1808 = null;
        field1799 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)Lpa;", line = 51)
    public final class250 method951(int arg0, int arg1) {
        if (arg0 > -18) {
            this.method954(83);
        }
        field1798++;
        class449 var3 = this.field1803;
        class250 var4;
        synchronized (this.field1803) {
            var4 = (class250) this.field1803.method2647(-107, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class47 var5 = this.field1800;
        byte[] var6;
        synchronized (this.field1800) {
            var6 = this.field1800.method481(34, arg1, -90);
        }
        class250 var7 = new class250();
        var7.field3204 = this;
        if (var6 != null) {
            var7.method1518((byte) 54, new class463(var6));
        }
        class449 var8 = this.field1803;
        synchronized (this.field1803) {
            this.field1803.method2635((long) arg1, -26591, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(III)Le;", line = 90)
    public static final class372 method952(int arg0, int arg1, int arg2) {
        class490 var3 = class125.field1664[arg0][arg1][arg2];
        return var3 == null ? null : var3.field7138;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(II)V", line = 100)
    public final void method953(int arg0, int arg1) {
        field1809++;
        class449 var3 = this.field1803;
        synchronized (this.field1803) {
            this.field1803.method2648(false, arg0);
        }
        class449 var4 = this.field1812;
        synchronized (this.field1812) {
            this.field1812.method2648(false, arg0);
        }
        if (arg1 != 34) {
            this.method954(46);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V", line = 133)
    public final void method954(int arg0) {
        if (arg0 >= -15) {
            field1799 = null;
        }
        class449 var2 = this.field1803;
        synchronized (this.field1803) {
            this.field1803.method2640(98);
        }
        field1801++;
        class449 var3 = this.field1812;
        synchronized (this.field1812) {
            this.field1812.method2640(120);
        }
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lae;ILqn;Lqn;)V", line = 160)
    public class140(class165 arg0, int arg1, class47 arg2, class47 arg3) {
        this.field1800 = arg2;
        this.field1811 = arg3;
        this.field1800.method469(30322, 34);
    }
}
