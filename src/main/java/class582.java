import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class582 {

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "Llga;")
    private class663 field8195 = new class663(64);

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "Lsea;")
    private class648 field8192;

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "Lsea;")
    public class648 field8196;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
    public static int field8190;

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "I")
    public static int field8191;

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
    public static int field8193;

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "I")
    public static int field8194;

    @OriginalMember(owner = "client!tq", name = "i", descriptor = "I")
    public static int field8198;

    @OriginalMember(owner = "client!tq", name = "j", descriptor = "I")
    public static int field8199;

    @OriginalMember(owner = "client!tq", name = "h", descriptor = "[I")
    public static int[] field8197;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)Z")
    public static final boolean method3316(int arg0, int arg1) {
        field8193++;
        if (arg0 > -35) {
            field8197 = null;
        }
        return arg1 >= 12 && arg1 <= 17;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(BI)Ltt;")
    public final class79 method3317(byte arg0, int arg1) {
        field8194++;
        class663 var3 = this.field8195;
        class79 var4;
        synchronized (this.field8195) {
            var4 = (class79) this.field8195.method3747((byte) -66, (long) arg1);
        }
        if (arg0 >= -78) {
            return null;
        } else if (var4 == null) {
            class648 var5 = this.field8192;
            byte[] var6;
            synchronized (this.field8192) {
                var6 = this.field8192.method3654(-15615, 3, arg1);
            }
            class79 var7 = new class79();
            var7.field1190 = this;
            if (var6 != null) {
                var7.method620(new class501(var6), 0);
            }
            class663 var8 = this.field8195;
            synchronized (this.field8195) {
                this.field8195.method3748((long) arg1, var7, 12537);
                return var7;
            }
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V")
    public final void method3318(byte arg0) {
        field8190++;
        class663 var2 = this.field8195;
        synchronized (this.field8195) {
            if (arg0 != -87) {
                this.field8196 = null;
            }
            this.field8195.method3749(7648);
        }
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(BI)Lin;")
    public static final class78 method3319(byte arg0, int arg1) {
        if (arg0 >= -8) {
            method3319((byte) 42, 54);
        }
        field8198++;
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (class167.field2439[var2] == null || class167.field2439[var2][var3] == null) {
            boolean var4 = client.method1683(var2, (byte) 103);
            if (!var4) {
                return null;
            }
        }
        return class167.field2439[var2][var3];
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(II)V")
    public final void method3320(int arg0, int arg1) {
        class663 var3 = this.field8195;
        synchronized (this.field8195) {
            this.field8195.method3754(arg1, true);
            if (arg0 != 137147152) {
                this.field8192 = null;
            }
        }
        field8191++;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V")
    public static void method3321(int arg0) {
        if (arg0 <= -88) {
            field8197 = null;
        }
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(B)V")
    public final void method3322(byte arg0) {
        field8199++;
        class663 var2 = this.field8195;
        synchronized (this.field8195) {
            this.field8195.method3755(19713);
            if (arg0 < 53) {
                this.field8195 = null;
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lci;ILsea;Lsea;)V")
    public class582(class414 arg0, int arg1, class648 arg2, class648 arg3) {
        this.field8192 = arg2;
        this.field8196 = arg3;
        this.field8192.method3653(3, true);
    }
}
