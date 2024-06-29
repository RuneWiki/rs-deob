import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class39 {

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "Lpja;")
    private class43 field650 = new class43(64);

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
    public int field656 = 0;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "Lgj;")
    private class662 field653;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public int field654;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V")
    public final void method236(int arg0, int arg1) {
        class43 var3 = this.field650;
        synchronized (this.field650) {
            if (arg1 != 12369) {
                method241(91, null);
            }
            this.field650.method265(arg0, -20);
        }
        field655++;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V")
    public final void method237(boolean arg0) {
        class43 var2 = this.field650;
        synchronized (this.field650) {
            this.field650.method272(20);
            if (!arg0) {
                this.field650 = null;
            }
        }
        field651++;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZ)Lcda;")
    public final class184 method238(int arg0, boolean arg1) {
        field647++;
        class43 var3 = this.field650;
        class184 var4;
        synchronized (this.field650) {
            var4 = (class184) this.field650.method266((byte) -99, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class662 var5 = this.field653;
        byte[] var6;
        synchronized (this.field653) {
            var6 = this.field653.method3732(arg0, 8906, 4);
        }
        class184 var7 = new class184();
        var7.field2863 = this;
        var7.field2854 = arg0;
        if (var6 != null) {
            var7.method1370(-1, new class93(var6));
        }
        var7.method1373((byte) -103);
        if (arg1) {
            method240(-34, 109);
        }
        class43 var8 = this.field650;
        synchronized (this.field650) {
            this.field650.method270(var7, (long) arg0, -122);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public final void method239(int arg0) {
        class43 var2 = this.field650;
        synchronized (this.field650) {
            this.field650.method273(126);
        }
        int var3 = 2 % ((-arg0 - 48) / 36);
        field652++;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)V")
    public static final void method240(int arg0, int arg1) {
        field648++;
        class281 var2 = class54.method395((byte) -53, (long) arg0, 5);
        if (arg1 >= -78) {
            method241(-127, null);
        }
        var2.method1818((byte) 108);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILs;)V")
    public static final void method241(int arg0, class296 arg1) {
        class745.field10286[arg0] = arg1;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lim;ILgj;)V")
    public class39(class598 arg0, int arg1, class662 arg2) {
        this.field653 = arg2;
        this.field654 = this.field653.method3730((byte) -92, 4);
    }
}
