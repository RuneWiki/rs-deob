import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class414 {

    @OriginalMember(owner = "client!br", name = "a", descriptor = "Ltja;")
    private class288 field5400 = new class288(64);

    @OriginalMember(owner = "client!br", name = "h", descriptor = "Ltja;")
    public class288 field5407 = new class288(2);

    @OriginalMember(owner = "client!br", name = "d", descriptor = "Lbt;")
    private class48 field5403;

    @OriginalMember(owner = "client!br", name = "c", descriptor = "Lbt;")
    public class48 field5402;

    @OriginalMember(owner = "client!br", name = "b", descriptor = "I")
    public static int field5401;

    @OriginalMember(owner = "client!br", name = "e", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!br", name = "f", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!br", name = "g", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!br", name = "i", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IZ)Lo;", line = 7)
    public final class31 method2465(int arg0, boolean arg1) {
        field5404++;
        class288 var3 = this.field5400;
        class31 var4;
        synchronized (this.field5400) {
            var4 = (class31) this.field5400.method1684((long) arg0, -359);
        }
        if (var4 != null) {
            return var4;
        }
        class48 var5 = this.field5403;
        byte[] var6;
        synchronized (this.field5403) {
            var6 = this.field5403.method437(33, (byte) 85, arg0);
        }
        class31 var7 = new class31();
        var7.field497 = this;
        if (arg1) {
            this.field5403 = null;
        }
        if (var6 != null) {
            var7.method298(new class403(var6), 92);
        }
        class288 var8 = this.field5400;
        synchronized (this.field5400) {
            this.field5400.method1686(-25638, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IBI)Z", line = 38)
    public static final boolean method2466(int arg0, byte arg1, int arg2) {
        if (arg1 < 18) {
            return true;
        } else {
            field5406++;
            return class86.method794(arg0, (byte) -37, arg2) & class132.method980(arg0, 71, arg2);
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(II)V", line = 50)
    public final void method2467(int arg0, int arg1) {
        class288 var3 = this.field5400;
        synchronized (this.field5400) {
            this.field5400.method1694(arg0, arg1 - 16547);
        }
        field5408++;
        class288 var4 = this.field5407;
        synchronized (this.field5407) {
            if (arg1 != 16463) {
                this.field5407 = null;
            }
            this.field5407.method1694(arg0, -85);
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(B)V", line = 66)
    public final void method2468(byte arg0) {
        class288 var2 = this.field5400;
        synchronized (this.field5400) {
            this.field5400.method1690(0);
            if (arg0 != 0) {
                method2466(-48, (byte) -8, 53);
            }
        }
        field5401++;
        class288 var3 = this.field5407;
        synchronized (this.field5407) {
            this.field5407.method1690(0);
        }
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lmja;ILbt;Lbt;)V", line = 111)
    public class414(class441 arg0, int arg1, class48 arg2, class48 arg3) {
        this.field5403 = arg2;
        this.field5402 = arg3;
        this.field5403.method431(4, 33);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Z)V", line = 92)
    public final void method2469(boolean arg0) {
        class288 var2 = this.field5400;
        synchronized (this.field5400) {
            this.field5400.method1687((byte) 61);
        }
        field5405++;
        class288 var3 = this.field5407;
        synchronized (this.field5407) {
            if (!arg0) {
                this.field5400 = null;
            }
            this.field5407.method1687((byte) 61);
        }
    }
}
