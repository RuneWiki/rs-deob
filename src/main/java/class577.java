import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class577 {

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "Lpja;")
    public class43 field8176 = new class43(20);

    @OriginalMember(owner = "client!cba", name = "k", descriptor = "Lpja;")
    private class43 field8186 = new class43(64);

    @OriginalMember(owner = "client!cba", name = "f", descriptor = "Lgj;")
    public class662 field8181;

    @OriginalMember(owner = "client!cba", name = "e", descriptor = "Lgj;")
    private class662 field8180;

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "I")
    public static int field8177;

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "I")
    public static int field8178;

    @OriginalMember(owner = "client!cba", name = "d", descriptor = "I")
    public static int field8179;

    @OriginalMember(owner = "client!cba", name = "g", descriptor = "I")
    public static int field8182;

    @OriginalMember(owner = "client!cba", name = "h", descriptor = "I")
    public static int field8183;

    @OriginalMember(owner = "client!cba", name = "i", descriptor = "I")
    public static int field8184;

    @OriginalMember(owner = "client!cba", name = "j", descriptor = "I")
    public static int field8185;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(II)V", line = 5)
    public final void method3326(int arg0, int arg1) {
        field8182++;
        class43 var3 = this.field8186;
        synchronized (this.field8186) {
            this.field8186.method265(arg0, -78);
            if (arg1 != 27851) {
                this.method3330(false, -93);
            }
        }
        class43 var4 = this.field8176;
        synchronized (this.field8176) {
            this.field8176.method265(arg0, -119);
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(B)V", line = 21)
    public final void method3327(byte arg0) {
        class43 var2 = this.field8186;
        synchronized (this.field8186) {
            this.field8186.method272(20);
            int var3 = -111 / ((arg0 - 37) / 60);
        }
        field8177++;
        class43 var4 = this.field8176;
        synchronized (this.field8176) {
            this.field8176.method272(20);
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)V", line = 45)
    public static final void method3328(int arg0) {
        if (class706.field9696 == null) {
            class584 var1 = new class584();
            byte[] var2 = var1.method3356(128, 128, 16, true);
            class706.field9696 = class513.method2938(var2, false, -18);
        }
        field8183++;
        if (arg0 >= -64) {
            field8185 = 30;
        }
        if (class684.field9517 == null) {
            class129 var3 = new class129();
            byte[] var4 = var3.method1096(128, 128, 16, 5066);
            class684.field9517 = class513.method2938(var4, false, -112);
        }
    }

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)V", line = 75)
    public final void method3329(int arg0) {
        field8179++;
        class43 var2 = this.field8186;
        synchronized (this.field8186) {
            this.field8186.method273(126);
            if (arg0 != 64) {
                method3331(62, -52, (byte) -117);
            }
        }
        class43 var3 = this.field8176;
        synchronized (this.field8176) {
            this.field8176.method273(-55);
        }
    }

    @OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(Lim;ILgj;Lgj;)V", line = 147)
    public class577(class598 arg0, int arg1, class662 arg2, class662 arg3) {
        this.field8181 = arg3;
        this.field8180 = arg2;
        this.field8180.method3730((byte) -85, 46);
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(ZI)Lhha;", line = 95)
    public final class547 method3330(boolean arg0, int arg1) {
        field8178++;
        class43 var3 = this.field8186;
        class547 var4;
        synchronized (this.field8186) {
            var4 = (class547) this.field8186.method266((byte) -114, (long) arg1);
        }
        if (!arg0) {
            this.field8180 = null;
        }
        if (var4 != null) {
            return var4;
        }
        class662 var5 = this.field8180;
        byte[] var6;
        synchronized (this.field8180) {
            var6 = this.field8180.method3732(arg1, 8906, 46);
        }
        class547 var7 = new class547();
        var7.field7425 = this;
        if (var6 != null) {
            var7.method3071(-14212, new class93(var6));
        }
        class43 var8 = this.field8186;
        synchronized (this.field8186) {
            this.field8186.method270(var7, (long) arg1, -125);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIB)Z", line = 131)
    public static final boolean method3331(int arg0, int arg1, byte arg2) {
        field8184++;
        if (arg2 == 20) {
            boolean var3 = (arg0 & 0x37) == 0 ? class104.method895(arg1, arg0, 0) : class504.method2880(arg0, arg1, false);
            return var3 | (arg1 & 0x10000) != 0 | class303.method1937(arg0, (byte) 125, arg1);
        } else {
            return false;
        }
    }
}
