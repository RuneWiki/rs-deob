import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class264 {

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "Lpja;")
    private class43 field3715 = new class43(64);

    @OriginalMember(owner = "client!kw", name = "g", descriptor = "Lgj;")
    private class662 field3720;

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "Lfja;")
    public static class783 field3717 = new class783(128, -1);

    @OriginalMember(owner = "client!kw", name = "i", descriptor = "Lpja;")
    public static class43 field3722 = new class43(64);

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!kw", name = "f", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!kw", name = "h", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!kw", name = "j", descriptor = "J")
    public static long field3723;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)V", line = 5)
    public final void method1722(int arg0) {
        class43 var2 = this.field3715;
        synchronized (this.field3715) {
            this.field3715.method273(-113);
        }
        field3718++;
        if (arg0 != 5928) {
            this.field3715 = null;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(II)V", line = 22)
    public final void method1723(int arg0, int arg1) {
        class43 var3 = this.field3715;
        synchronized (this.field3715) {
            this.field3715.method265(arg1, -118);
        }
        if (arg0 != 28739) {
            this.method1725(77);
        }
        field3716++;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(BI)Lik;", line = 35)
    public final class223 method1724(byte arg0, int arg1) {
        field3714++;
        class43 var3 = this.field3715;
        class223 var4;
        synchronized (this.field3715) {
            var4 = (class223) this.field3715.method266((byte) -117, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class662 var5 = this.field3720;
        byte[] var6;
        synchronized (this.field3720) {
            if (arg0 > -44) {
                this.method1725(3);
            }
            var6 = this.field3720.method3732(arg1, 8906, 31);
        }
        class223 var7 = new class223();
        if (var6 != null) {
            var7.method1524(0, new class93(var6));
        }
        class43 var8 = this.field3715;
        synchronized (this.field3715) {
            this.field3715.method270(var7, (long) arg1, -124);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(I)V", line = 68)
    public final void method1725(int arg0) {
        class43 var2 = this.field3715;
        synchronized (this.field3715) {
            this.field3715.method272(20);
        }
        field3721++;
        if (arg0 != 64) {
            field3719 = 64;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(B)V", line = 87)
    public static void method1726(byte arg0) {
        int var1 = 2 % ((-arg0 - 25) / 56);
        field3717 = null;
        field3722 = null;
    }

    @OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Lim;ILgj;)V", line = 100)
    public class264(class598 arg0, int arg1, class662 arg2) {
        this.field3720 = arg2;
        this.field3720.method3730((byte) 34, 31);
    }
}
