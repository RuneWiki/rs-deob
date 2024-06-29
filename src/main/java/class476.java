import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public class class476 {

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "Ltja;")
    public class288 field6609 = new class288(20);

    @OriginalMember(owner = "client!uda", name = "k", descriptor = "Ltja;")
    private class288 field6617 = new class288(64);

    @OriginalMember(owner = "client!uda", name = "d", descriptor = "Lbt;")
    private class48 field6610;

    @OriginalMember(owner = "client!uda", name = "e", descriptor = "Lbt;")
    public class48 field6611;

    @OriginalMember(owner = "client!uda", name = "g", descriptor = "I")
    public static int field6613 = -60;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "I")
    public static int field6607;

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "I")
    public static int field6608;

    @OriginalMember(owner = "client!uda", name = "h", descriptor = "I")
    public static int field6614;

    @OriginalMember(owner = "client!uda", name = "i", descriptor = "I")
    public static int field6615;

    @OriginalMember(owner = "client!uda", name = "j", descriptor = "I")
    public static int field6616;

    @OriginalMember(owner = "client!uda", name = "f", descriptor = "Lifa;")
    public static class450 field6612;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)V")
    public static void method2829(int arg0) {
        field6612 = null;
        if (arg0 != 16204) {
            method2829(-8);
        }
    }

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "(I)V")
    public final void method2830(int arg0) {
        field6614++;
        if (arg0 != 46) {
            field6612 = null;
        }
        class288 var2 = this.field6617;
        synchronized (this.field6617) {
            this.field6617.method1687((byte) 61);
        }
        class288 var3 = this.field6609;
        synchronized (this.field6609) {
            this.field6609.method1687((byte) 61);
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(II)Lhr;")
    public final class552 method2831(int arg0, int arg1) {
        field6616++;
        class288 var3 = this.field6617;
        class552 var4;
        synchronized (this.field6617) {
            var4 = (class552) this.field6617.method1684((long) arg1, -359);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 != 10248) {
            this.field6609 = null;
        }
        class48 var5 = this.field6610;
        byte[] var6;
        synchronized (this.field6610) {
            var6 = this.field6610.method437(46, (byte) 94, arg1);
        }
        class552 var7 = new class552();
        var7.field7670 = this;
        if (var6 != null) {
            var7.method3230(new class403(var6), true);
        }
        class288 var8 = this.field6617;
        synchronized (this.field6617) {
            this.field6617.method1686(-25638, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "(II)V")
    public final void method2832(int arg0, int arg1) {
        if (arg1 != 46) {
            field6613 = -38;
        }
        field6608++;
        class288 var3 = this.field6617;
        synchronized (this.field6617) {
            this.field6617.method1694(arg0, -112);
        }
        class288 var4 = this.field6609;
        synchronized (this.field6609) {
            this.field6609.method1694(arg0, -76);
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(B)V")
    public final void method2833(byte arg0) {
        if (arg0 < 44) {
            this.method2833((byte) 121);
        }
        class288 var2 = this.field6617;
        synchronized (this.field6617) {
            this.field6617.method1690(0);
        }
        field6607++;
        class288 var3 = this.field6609;
        synchronized (this.field6609) {
            this.field6609.method1690(0);
        }
    }

    @OriginalMember(owner = "client!uda", name = "<init>", descriptor = "(Lmja;ILbt;Lbt;)V")
    public class476(class441 arg0, int arg1, class48 arg2, class48 arg3) {
        this.field6610 = arg2;
        this.field6611 = arg3;
        this.field6610.method431(4, 46);
    }
}
