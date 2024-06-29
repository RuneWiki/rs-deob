import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class644 {

    @OriginalMember(owner = "client!aaa", name = "f", descriptor = "Ltja;")
    private class288 field8778 = new class288(64);

    @OriginalMember(owner = "client!aaa", name = "k", descriptor = "Ltja;")
    private class288 field8783 = new class288(100);

    @OriginalMember(owner = "client!aaa", name = "g", descriptor = "Lbt;")
    private class48 field8779;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "I")
    public static int field8773;

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "I")
    public static int field8775;

    @OriginalMember(owner = "client!aaa", name = "d", descriptor = "I")
    public static int field8776;

    @OriginalMember(owner = "client!aaa", name = "e", descriptor = "I")
    public static int field8777;

    @OriginalMember(owner = "client!aaa", name = "h", descriptor = "I")
    public static int field8780;

    @OriginalMember(owner = "client!aaa", name = "i", descriptor = "I")
    public static int field8781;

    @OriginalMember(owner = "client!aaa", name = "j", descriptor = "I")
    public static int field8782;

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "[I")
    public static int[] field8774;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)V")
    public static void method3597(int arg0) {
        if (arg0 != 100) {
            field8774 = null;
        }
        field8774 = null;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(BI)V")
    public final void method3598(byte arg0, int arg1) {
        field8773++;
        class288 var3 = this.field8778;
        synchronized (this.field8778) {
            this.field8778.method1694(arg1, -74);
        }
        if (arg0 == -29) {
            class288 var4 = this.field8783;
            synchronized (this.field8783) {
                this.field8783.method1694(arg1, -34);
            }
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Z)I")
    public static final int method3599(boolean arg0) {
        field8782++;
        class288 var1 = class692.field9424;
        synchronized (class692.field9424) {
            if (!arg0) {
                method3599(true);
            }
            return class692.field9424.method1691((byte) 121);
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(II)Lfs;")
    public final class582 method3600(int arg0, int arg1) {
        field8775++;
        class288 var3 = this.field8778;
        class582 var4;
        synchronized (this.field8778) {
            var4 = (class582) this.field8778.method1684((long) arg1, -359);
        }
        if (var4 != null) {
            return var4;
        }
        class48 var5 = this.field8779;
        byte[] var6;
        synchronized (this.field8779) {
            var6 = this.field8779.method437(class274.method1602(arg1, true), (byte) -61, class673.method3782(1990162540, arg1));
        }
        if (arg0 >= -36) {
            this.method3603(78);
        }
        class582 var7 = new class582();
        var7.field7952 = arg1;
        var7.field7939 = this;
        if (var6 != null) {
            var7.method3350(new class403(var6), (byte) 82);
        }
        var7.method3356((byte) 42);
        class288 var8 = this.field8778;
        synchronized (this.field8778) {
            this.field8778.method1686(-25638, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "(I)V")
    public final void method3601(int arg0) {
        class288 var2 = this.field8778;
        synchronized (this.field8778) {
            this.field8778.method1690(0);
        }
        field8777++;
        class288 var3 = this.field8783;
        synchronized (this.field8783) {
            this.field8783.method1690(arg0 ^ arg0);
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IB)Lne;")
    public final class338 method3602(int arg0, byte arg1) {
        if (arg1 >= -33) {
            return null;
        }
        field8781++;
        class288 var3 = this.field8783;
        synchronized (this.field8783) {
            class338 var4 = (class338) this.field8783.method1684((long) arg0, -359);
            if (var4 == null) {
                var4 = new class338(arg0);
                this.field8783.method1686(-25638, (long) arg0, var4);
            }
            return var4.method1999(true) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "(I)V")
    public final void method3603(int arg0) {
        class288 var2 = this.field8778;
        synchronized (this.field8778) {
            this.field8778.method1687((byte) 61);
        }
        field8776++;
        class288 var3 = this.field8783;
        synchronized (this.field8783) {
            this.field8783.method1687((byte) 61);
        }
        if (arg0 > -17) {
            this.field8779 = null;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lmja;ILbt;Lbt;Lbt;)V")
    public class644(class441 arg0, int arg1, class48 arg2, class48 arg3, class48 arg4) {
        this.field8779 = arg2;
        if (this.field8779 != null) {
            int var6 = this.field8779.method445(-86) - 1;
            this.field8779.method431(4, var6);
        }
        class655.method3699(arg4, 2, arg3, 15845);
    }
}
