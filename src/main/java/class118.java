import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class118 {

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "Lmga;")
    private class666 field2008 = new class666(64);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "Lbi;")
    private class449 field2005;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field2010 = -1;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "Lkf;")
    public static class235 field2012 = new class235();

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "Lgj;")
    public static class593 field2013 = new class593();

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)Liq;")
    public final class568 method923(int arg0, int arg1) {
        field2006++;
        class666 var3 = this.field2008;
        class568 var4;
        synchronized (this.field2008) {
            var4 = (class568) this.field2008.method3750((long) arg1, false);
        }
        if (var4 != null) {
            return var4;
        }
        class449 var5 = this.field2005;
        byte[] var6;
        synchronized (this.field2005) {
            var6 = this.field2005.method2537(false, 35, arg1);
        }
        class568 var7 = new class568();
        if (var6 != null) {
            var7.method3128(new class335(var6), (byte) 61);
        }
        var7.method3130(false);
        class666 var8 = this.field2008;
        synchronized (this.field2008) {
            this.field2008.method3745(1, (long) arg1, var7);
            if (arg0 != -1) {
                field2013 = null;
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)V")
    public final void method924(int arg0, int arg1) {
        class666 var3 = this.field2008;
        synchronized (this.field2008) {
            this.field2008.method3740((byte) 60, arg1);
        }
        field2011++;
        if (arg0 != 64) {
            method925(-64);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public static void method925(int arg0) {
        field2013 = null;
        field2012 = null;
        if (arg0 < 78) {
            method925(-122);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V")
    public final void method926(boolean arg0) {
        field2007++;
        class666 var2 = this.field2008;
        synchronized (this.field2008) {
            this.field2008.method3748(6);
        }
        if (arg0) {
            field2010 = 118;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public final void method927(byte arg0) {
        if (arg0 != -42) {
            this.method924(89, -73);
        }
        field2009++;
        class666 var2 = this.field2008;
        synchronized (this.field2008) {
            this.field2008.method3739(0);
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lpca;ILbi;)V")
    public class118(class671 arg0, int arg1, class449 arg2) {
        this.field2005 = arg2;
        if (this.field2005 != null) {
            this.field2005.method2527(0, 35);
        }
    }
}
