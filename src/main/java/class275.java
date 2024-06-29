import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class275 {

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "Lhn;")
    private class509 field3656 = new class509(64);

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "Lhn;")
    public class509 field3669 = new class509(50);

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "Lhn;")
    public class509 field3670 = new class509(5);

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "Ld;")
    public class104 field3653;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "Z")
    public boolean field3666;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "Lfo;")
    private class361 field3664;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "Lfo;")
    public class361 field3659;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field3658 = 0;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
    public int field3671;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "Lza;")
    public static class287 field3667;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "[[Lie;")
    public static class6[][] field3657;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZI)V")
    public final void method1669(boolean arg0, int arg1) {
        field3660++;
        if (this.field3666 != arg0 && arg1 == -11453) {
            this.field3666 = arg0;
            this.method1671((byte) -93);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BI)Ldh;")
    public final class212 method1670(byte arg0, int arg1) {
        field3668++;
        class509 var3 = this.field3656;
        class212 var4;
        synchronized (this.field3656) {
            var4 = (class212) this.field3656.method3032(3589, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class361 var5 = this.field3664;
        byte[] var6;
        synchronized (this.field3664) {
            if (arg0 >= -22) {
                this.method1669(false, -63);
            }
            var6 = this.field3664.method2130(class23.method137(false, arg1), class273.method1662(arg1, false), -93);
        }
        class212 var7 = new class212();
        var7.field2914 = this;
        var7.field2850 = arg1;
        if (var6 != null) {
            var7.method1352(new class396(var6), (byte) -65);
        }
        var7.method1360(16384);
        class509 var8 = this.field3656;
        synchronized (this.field3656) {
            this.field3656.method3046((long) arg1, var7, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
    public final void method1671(byte arg0) {
        field3663++;
        class509 var2 = this.field3656;
        synchronized (this.field3656) {
            this.field3656.method3045(48);
        }
        class509 var3 = this.field3669;
        synchronized (this.field3669) {
            this.field3669.method3045(48);
        }
        class509 var4 = this.field3670;
        synchronized (this.field3670) {
            this.field3670.method3045(48);
        }
        if (arg0 >= -92) {
            this.method1675(false, -61);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)V")
    public final void method1672(int arg0, int arg1) {
        field3661++;
        this.field3671 = arg0;
        if (arg1 != 0) {
            return;
        }
        class509 var3 = this.field3669;
        synchronized (this.field3669) {
            this.field3669.method3045(48);
        }
        class509 var4 = this.field3670;
        synchronized (this.field3670) {
            this.field3670.method3045(48);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public static void method1673(int arg0) {
        if (arg0 == 64) {
            field3667 = null;
            field3657 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)V")
    public final void method1674(byte arg0) {
        class509 var2 = this.field3669;
        synchronized (this.field3669) {
            this.field3669.method3045(48);
        }
        field3652++;
        if (arg0 >= -41) {
            this.field3659 = null;
        }
        class509 var3 = this.field3670;
        synchronized (this.field3670) {
            this.field3670.method3045(48);
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(ZI)V")
    public final void method1675(boolean arg0, int arg1) {
        field3665++;
        class509 var3 = this.field3656;
        synchronized (this.field3656) {
            this.field3656.method3036(arg1, (byte) -60);
        }
        class509 var4 = this.field3669;
        synchronized (this.field3669) {
            this.field3669.method3036(arg1, (byte) -60);
        }
        class509 var5 = this.field3670;
        synchronized (this.field3670) {
            this.field3670.method3036(arg1, (byte) -58);
            if (arg0) {
                this.method1675(true, 37);
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
    public final void method1676(int arg0) {
        field3654++;
        class509 var2 = this.field3656;
        synchronized (this.field3656) {
            this.field3656.method3034((byte) 111);
        }
        class509 var3 = this.field3669;
        synchronized (this.field3669) {
            if (arg0 != 5) {
                return;
            }
            this.field3669.method3034((byte) 93);
        }
        class509 var4 = this.field3670;
        synchronized (this.field3670) {
            this.field3670.method3034((byte) 98);
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Ld;IZLfo;Lfo;)V")
    public class275(class104 arg0, int arg1, boolean arg2, class361 arg3, class361 arg4) {
        this.field3653 = arg0;
        this.field3666 = arg2;
        this.field3664 = arg3;
        this.field3659 = arg4;
        if (this.field3664 != null) {
            int var6 = this.field3664.method2138(-1) - 1;
            this.field3664.method2136(-97, var6);
        }
    }
}
