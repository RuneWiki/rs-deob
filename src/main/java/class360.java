import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class360 {

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "Lhm;")
    private class208 field4624 = new class208(64);

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "Lpfa;")
    private class275 field4621;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
    public int field4627;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "Luc;")
    public static class27 field4620 = new class27(14, 14);

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "Lgca;")
    public static class234 field4628;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V", line = 4)
    public final void method2092(int arg0) {
        class208 var2 = this.field4624;
        synchronized (this.field4624) {
            this.field4624.method1224(false);
        }
        if (arg0 < 41) {
            field4620 = null;
        }
        field4623++;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)Lug;", line = 19)
    public final class527 method2093(int arg0, int arg1) {
        field4622++;
        class208 var3 = this.field4624;
        class527 var4;
        synchronized (this.field4624) {
            var4 = (class527) this.field4624.method1221((long) arg0, true);
        }
        if (var4 != null) {
            return var4;
        }
        class275 var5 = this.field4621;
        byte[] var6;
        synchronized (this.field4621) {
            var6 = this.field4621.method1659(-128, arg0, 16);
        }
        class527 var7 = new class527();
        if (var6 != null) {
            var7.method2846(arg1 ^ 0xFFFFB1B8, new class572(var6));
        }
        class208 var8 = this.field4624;
        synchronized (this.field4624) {
            this.field4624.method1230((byte) 76, (long) arg0, var7);
        }
        if (arg1 != 20039) {
            this.method2092(-74);
        }
        return var7;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(II)V", line = 51)
    public final void method2094(int arg0, int arg1) {
        class208 var3 = this.field4624;
        synchronized (this.field4624) {
            this.field4624.method1222(14564, arg0);
        }
        if (arg1 == 4604) {
            field4625++;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Z)V", line = 68)
    public final void method2095(boolean arg0) {
        if (arg0) {
            this.field4621 = null;
        }
        class208 var2 = this.field4624;
        synchronized (this.field4624) {
            this.field4624.method1218(124);
        }
        field4626++;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V", line = 82)
    public static void method2096(int arg0) {
        if (arg0 != 14) {
            method2096(83);
        }
        field4620 = null;
        field4628 = null;
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lbs;ILpfa;)V", line = 100)
    public class360(class643 arg0, int arg1, class275 arg2) {
        this.field4621 = arg2;
        if (this.field4621 == null) {
            this.field4627 = 0;
        } else {
            this.field4627 = this.field4621.method1655(16, (byte) -82);
        }
    }
}
