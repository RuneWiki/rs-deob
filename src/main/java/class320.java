import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class320 {

    @OriginalMember(owner = "client!caa", name = "k", descriptor = "Ltja;")
    private class288 field3969 = new class288(64);

    @OriginalMember(owner = "client!caa", name = "h", descriptor = "Lbt;")
    private class48 field3966;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "Llja;")
    public static class744 field3959 = new class744(28, -1);

    @OriginalMember(owner = "client!caa", name = "i", descriptor = "Lhj;")
    public static class596 field3967 = null;

    @OriginalMember(owner = "client!caa", name = "m", descriptor = "[Lmfa;")
    public static class643[] field3971 = new class643[2048];

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!caa", name = "d", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!caa", name = "e", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!caa", name = "f", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!caa", name = "g", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!caa", name = "j", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!caa", name = "l", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)V")
    public static void method1909(int arg0) {
        field3967 = null;
        if (arg0 != 35) {
            method1909(-6);
        }
        field3971 = null;
        field3959 = null;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(IB)V")
    public static final void method1910(int arg0, byte arg1) {
        class678.field9298 = false;
        class753.field10443 = arg0;
        if (arg1 != -54) {
            field3971 = null;
        }
        class300.field3598 = null;
        class8.field138 = null;
        class486.field6774 = 0;
        class558.field7751 = 1;
        class677.field9292 = -1;
        class174.field2167 = -1;
        field3964++;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIIII)V")
    public static final void method1911(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3965++;
        class714 var5 = class350.method2072((long) arg4, 10, (byte) 118);
        var5.method4043(arg3 + 6379);
        var5.field10021 = arg2;
        var5.field10018 = arg0;
        var5.field10023 = arg1;
        if (arg3 != 1) {
            method1911(81, 124, -56, -12, -87);
        }
    }

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "(I)V")
    public final void method1912(int arg0) {
        class288 var2 = this.field3969;
        synchronized (this.field3969) {
            this.field3969.method1687((byte) 61);
            if (arg0 != -9182) {
                this.field3969 = null;
            }
        }
        field3962++;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(BI)V")
    public final void method1913(byte arg0, int arg1) {
        if (arg0 != -39) {
            field3971 = null;
        }
        field3970++;
        class288 var3 = this.field3969;
        synchronized (this.field3969) {
            this.field3969.method1694(arg1, -50);
        }
    }

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "(I)V")
    public final void method1914(int arg0) {
        field3963++;
        class288 var2 = this.field3969;
        synchronized (this.field3969) {
            this.field3969.method1690(0);
            if (arg0 != 31196) {
                this.field3966 = null;
            }
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(II)Lkr;")
    public final class777 method1915(int arg0, int arg1) {
        field3961++;
        class288 var3 = this.field3969;
        class777 var4;
        synchronized (this.field3969) {
            var4 = (class777) this.field3969.method1684((long) arg0, arg1 - 394);
        }
        if (var4 != null) {
            return var4;
        }
        class48 var5 = this.field3966;
        byte[] var6;
        synchronized (this.field3966) {
            var6 = this.field3966.method437(arg1, (byte) -97, arg0);
        }
        class777 var7 = new class777();
        if (var6 != null) {
            var7.method4313(new class403(var6), arg1 - 22);
        }
        var7.method4315(false);
        class288 var8 = this.field3969;
        synchronized (this.field3969) {
            this.field3969.method1686(-25638, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(Lmja;ILbt;)V")
    public class320(class441 arg0, int arg1, class48 arg2) {
        this.field3966 = arg2;
        if (this.field3966 != null) {
            this.field3966.method431(4, 35);
        }
    }
}
