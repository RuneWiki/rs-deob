import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class63 {

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "Ldc;")
    private class5 field929 = new class5(64);

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "Lhe;")
    private class239 field936;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field933 = 100;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "[I")
    public static int[] field932 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "Z")
    public static boolean field930 = false;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZ)V", line = 5)
    public final void method439(int arg0, boolean arg1) {
        class5 var3 = this.field929;
        synchronized (this.field929) {
            this.field929.method39(!arg1, arg0);
            if (!arg1) {
                this.field936 = null;
            }
        }
        field938++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BI)Lcj;", line = 23)
    public final class470 method440(byte arg0, int arg1) {
        field934++;
        class5 var3 = this.field929;
        class470 var4;
        synchronized (this.field929) {
            var4 = (class470) this.field929.method40(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        } else if (arg0 > -38) {
            return null;
        } else {
            byte[] var5 = this.field936.method1470(4, class221.method1364(false, arg1), client.method1185(arg1, -1875451670));
            class470 var6 = new class470();
            if (var5 != null) {
                var6.method2752(-108, new class156(var5));
            }
            class5 var7 = this.field929;
            synchronized (this.field929) {
                this.field929.method36(-20960, var6, (long) arg1);
                return var6;
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(BI)V", line = 52)
    public final void method441(byte arg0, int arg1) {
        field935++;
        class5 var3 = this.field929;
        synchronized (this.field929) {
            this.field929.method38((byte) -88);
            this.field929 = new class5(arg1);
            if (arg0 <= 66) {
                this.method441((byte) -97, 115);
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V", line = 66)
    public final void method442(int arg0) {
        field937++;
        if (arg0 != 0) {
            this.field929 = null;
        }
        class5 var2 = this.field929;
        synchronized (this.field929) {
            this.field929.method38((byte) -90);
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V", line = 84)
    public final void method443(int arg0) {
        if (arg0 != 100) {
            this.field929 = null;
        }
        class5 var2 = this.field929;
        synchronized (this.field929) {
            this.field929.method35((byte) -1);
        }
        field928++;
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lci;ILhe;)V", line = 123)
    public class63(class298 arg0, int arg1, class239 arg2) {
        this.field936 = arg2;
        if (this.field936 != null) {
            int var4 = this.field936.method1466(false) - 1;
            this.field936.method1473(4309, var4);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V", line = 114)
    public static void method444(byte arg0) {
        if (arg0 <= -13) {
            field932 = null;
        }
    }
}
