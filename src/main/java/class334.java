import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class334 {

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "Z")
    public boolean field4737 = false;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "Lqr;")
    private class65 field4743 = new class65(64);

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "Lqr;")
    public class65 field4754 = new class65(500);

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "Lqr;")
    public class65 field4755 = new class65(30);

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "Lqr;")
    public class65 field4756 = new class65(50);

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "Lwu;")
    public class376 field4748;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "Z")
    public boolean field4742;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "Lwu;")
    private class376 field4753;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "[I")
    public static int[] field4744 = new int[2];

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "Lro;")
    public static class2 field4747 = new class2();

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
    public int field4758;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)V", line = 4)
    public static void method2006(boolean arg0) {
        if (arg0) {
            field4747 = null;
            field4744 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IZ)V", line = 15)
    public final void method2007(int arg0, boolean arg1) {
        field4738++;
        if (this.field4742 == arg1) {
            return;
        }
        this.field4742 = arg1;
        if (arg0 < 12) {
            method2006(false);
        }
        this.method2013(-12021);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)Lqfa;", line = 37)
    public final class100 method2008(byte arg0, int arg1) {
        field4741++;
        class65 var3 = this.field4743;
        class100 var4;
        synchronized (this.field4743) {
            var4 = (class100) this.field4743.method552(4, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class376 var5 = this.field4753;
        byte[] var6;
        synchronized (this.field4753) {
            var6 = this.field4753.method2218((byte) 115, class35.method292(arg1, 10663), class643.method3527(-75, arg1));
        }
        class100 var7 = new class100();
        var7.field1301 = arg1;
        var7.field1368 = this;
        if (var6 != null) {
            var7.method738(new class677(var6), -87);
        }
        var7.method735(false);
        if (var7.field1340) {
            var7.field1351 = 0;
            var7.field1369 = false;
        }
        if (!this.field4742 && var7.field1274) {
            var7.field1333 = null;
            var7.field1287 = null;
        }
        class65 var8 = this.field4743;
        synchronized (this.field4743) {
            this.field4743.method556((byte) 0, (long) arg1, var7);
        }
        if (arg0 > -6) {
            field4744 = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V", line = 83)
    public final void method2009(int arg0, int arg1) {
        field4745++;
        if (arg0 != 64) {
            method2006(true);
        }
        class65 var3 = this.field4743;
        synchronized (this.field4743) {
            this.field4743.method553(arg1, -15782);
        }
        class65 var4 = this.field4754;
        synchronized (this.field4754) {
            this.field4754.method553(arg1, arg0 ^ 0xFFFFC21A);
        }
        class65 var5 = this.field4755;
        synchronized (this.field4755) {
            this.field4755.method553(arg1, arg0 ^ 0xFFFFC21A);
        }
        class65 var6 = this.field4756;
        synchronized (this.field4756) {
            this.field4756.method553(arg1, -15782);
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)V", line = 112)
    public final void method2010(int arg0, int arg1) {
        this.field4758 = arg0;
        field4751++;
        int var3 = -11 / ((arg1 + 70) / 48);
        class65 var4 = this.field4754;
        synchronized (this.field4754) {
            this.field4754.method561((byte) -78);
        }
        class65 var5 = this.field4755;
        synchronized (this.field4755) {
            this.field4755.method561((byte) -78);
        }
        class65 var6 = this.field4756;
        synchronized (this.field4756) {
            this.field4756.method561((byte) -78);
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lms;IZLwu;Lwu;)V", line = 247)
    public class334(class763 arg0, int arg1, boolean arg2, class376 arg3, class376 arg4) {
        this.field4748 = arg4;
        this.field4742 = arg2;
        this.field4753 = arg3;
        if (this.field4753 != null) {
            int var6 = this.field4753.method2198(0) - 1;
            this.field4753.method2195(var6, 0);
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(Z)V", line = 138)
    public final void method2011(boolean arg0) {
        field4746++;
        class65 var2 = this.field4743;
        synchronized (this.field4743) {
            this.field4743.method558(0);
        }
        if (!arg0) {
            this.method2007(-19, false);
        }
        class65 var3 = this.field4754;
        synchronized (this.field4754) {
            this.field4754.method558(0);
        }
        class65 var4 = this.field4755;
        synchronized (this.field4755) {
            this.field4755.method558(0);
        }
        class65 var5 = this.field4756;
        synchronized (this.field4756) {
            this.field4756.method558(0);
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(IZ)V", line = 163)
    public final void method2012(int arg0, boolean arg1) {
        this.field4743 = new class65(arg0);
        if (!arg1) {
            this.field4756 = null;
        }
        field4752++;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V", line = 174)
    public final void method2013(int arg0) {
        class65 var2 = this.field4743;
        synchronized (this.field4743) {
            this.field4743.method561((byte) -78);
        }
        field4739++;
        class65 var3 = this.field4754;
        synchronized (this.field4754) {
            this.field4754.method561((byte) -78);
        }
        class65 var4 = this.field4755;
        synchronized (this.field4755) {
            this.field4755.method561((byte) -78);
        }
        class65 var5 = this.field4756;
        synchronized (this.field4756) {
            this.field4756.method561((byte) -78);
        }
        if (arg0 != -12021) {
            this.field4756 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(Z)V", line = 197)
    public static final void method2014(boolean arg0) {
        field4740++;
        class65 var1 = class573.field7516;
        synchronized (class573.field7516) {
            class573.field7516.method558(0);
        }
        if (arg0) {
            method2014(true);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BZ)V", line = 213)
    public final void method2015(byte arg0, boolean arg1) {
        field4749++;
        if (this.field4737 != arg1 && arg0 < -40) {
            this.field4737 = arg1;
            this.method2013(-12021);
        }
    }
}
