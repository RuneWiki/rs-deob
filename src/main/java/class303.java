import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class303 {

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "Lnj;")
    private class162 field4149 = new class162(64);

    @OriginalMember(owner = "client!ks", name = "k", descriptor = "I")
    public int field4154 = 0;

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "Lmg;")
    private class101 field4147;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "I")
    public int field4144;

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "Ldi;")
    public static class83 field4145 = new class83(64, 8);

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "Lqp;")
    public static class466 field4151 = new class466("M", "M", "M", "M");

    @OriginalMember(owner = "client!ks", name = "j", descriptor = "Lkl;")
    public static class55 field4153 = new class55(1, 2, 2, 0);

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!ks", name = "i", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V", line = 8)
    public static void method1764(int arg0) {
        if (arg0 != 0) {
            field4153 = null;
        }
        field4151 = null;
        field4145 = null;
        field4153 = null;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)Lbh;", line = 22)
    public final class28 method1765(int arg0, int arg1) {
        field4148++;
        class162 var3 = this.field4149;
        class28 var4;
        synchronized (this.field4149) {
            var4 = (class28) this.field4149.method1073((long) arg1, false);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4147.method727(arg1, 4, 49);
        if (arg0 <= 55) {
            this.method1766(121, 107);
        }
        class28 var6 = new class28();
        var6.field373 = this;
        var6.field375 = arg1;
        if (var5 != null) {
            var6.method158(new class391(var5), (byte) 120);
        }
        var6.method160(36);
        class162 var7 = this.field4149;
        synchronized (this.field4149) {
            this.field4149.method1072((long) arg1, var6, false);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(II)V", line = 54)
    public final void method1766(int arg0, int arg1) {
        field4150++;
        class162 var3 = this.field4149;
        synchronized (this.field4149) {
            this.field4149.method1065((byte) -95, arg0);
        }
        if (arg1 != 64) {
            this.field4149 = null;
        }
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)V", line = 67)
    public final void method1767(int arg0) {
        field4146++;
        class162 var2 = this.field4149;
        synchronized (this.field4149) {
            if (arg0 == 8) {
                this.field4149.method1068(arg0 - 8);
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(I)V", line = 88)
    public final void method1768(int arg0) {
        class162 var2 = this.field4149;
        synchronized (this.field4149) {
            this.field4149.method1066(4080);
        }
        field4152++;
        if (arg0 > -125) {
            this.method1767(-92);
        }
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Lal;ILmg;)V", line = 115)
    public class303(class66 arg0, int arg1, class101 arg2) {
        this.field4147 = arg2;
        this.field4144 = this.field4147.method753(4, -100);
    }
}
