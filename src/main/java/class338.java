import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class338 {

    @OriginalMember(owner = "client!np", name = "g", descriptor = "Lff;")
    private class9 field4661 = new class9(64);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "Lvh;")
    private class240 field4655;

    @OriginalMember(owner = "client!np", name = "e", descriptor = "Ljm;")
    public static class485 field4659 = new class485(1, 2);

    @OriginalMember(owner = "client!np", name = "h", descriptor = "[I")
    public static int[] field4662 = new int[32];

    @OriginalMember(owner = "client!np", name = "b", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!np", name = "d", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!np", name = "f", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!np", name = "i", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(II)V", line = 6)
    public final void method1876(int arg0, int arg1) {
        class9 var3 = this.field4661;
        synchronized (this.field4661) {
            this.field4661.method67(60);
            this.field4661 = new class9(arg0);
        }
        field4657++;
        if (arg1 >= -54) {
            this.method1879(74, (byte) -3);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V", line = 20)
    public final void method1877(int arg0) {
        class9 var2 = this.field4661;
        synchronized (this.field4661) {
            this.field4661.method65(false);
        }
        if (arg0 != 1) {
            this.field4661 = null;
        }
        field4663++;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(BI)V", line = 35)
    public final void method1878(byte arg0, int arg1) {
        class9 var3 = this.field4661;
        synchronized (this.field4661) {
            this.field4661.method61((byte) -67, arg1);
        }
        if (arg0 <= 110) {
            this.method1876(-95, -4);
        }
        field4660++;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IB)Lfe;", line = 53)
    public final class401 method1879(int arg0, byte arg1) {
        field4656++;
        class9 var3 = this.field4661;
        class401 var4;
        synchronized (this.field4661) {
            var4 = (class401) this.field4661.method56((long) arg0, 48);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1 >= -31) {
            method1880((byte) -69);
        }
        byte[] var5 = this.field4655.method1411(true, class451.method2656(arg0, -121), class48.method300(arg0, (byte) -93));
        class401 var6 = new class401();
        if (var5 != null) {
            var6.method2327(new class365(var5), 0);
        }
        class9 var7 = this.field4661;
        synchronized (this.field4661) {
            this.field4661.method73((long) arg0, var6, 26425);
            return var6;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(B)V", line = 81)
    public static void method1880(byte arg0) {
        field4659 = null;
        field4662 = null;
        if (arg0 > -72) {
            method1880((byte) 65);
        }
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(I)V", line = 93)
    public final void method1881(int arg0) {
        field4658++;
        if (arg0 != 1) {
            field4662 = null;
        }
        class9 var2 = this.field4661;
        synchronized (this.field4661) {
            this.field4661.method67(29);
        }
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Llf;ILvh;)V", line = 117)
    public class338(class157 arg0, int arg1, class240 arg2) {
        this.field4655 = arg2;
        if (this.field4655 != null) {
            int var4 = this.field4655.method1410(0) - 1;
            this.field4655.method1397((byte) -115, var4);
        }
    }
}
