import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jha")
public class class696 {

    @OriginalMember(owner = "client!jha", name = "g", descriptor = "Lqr;")
    private class65 field9694 = new class65(64);

    @OriginalMember(owner = "client!jha", name = "k", descriptor = "Lqr;")
    public class65 field9698 = new class65(60);

    @OriginalMember(owner = "client!jha", name = "h", descriptor = "Lwu;")
    public class376 field9695;

    @OriginalMember(owner = "client!jha", name = "j", descriptor = "Lwu;")
    private class376 field9697;

    @OriginalMember(owner = "client!jha", name = "i", descriptor = "I")
    public static int field9696 = 0;

    @OriginalMember(owner = "client!jha", name = "c", descriptor = "Lhda;")
    public static class752 field9690 = new class752(19, 0);

    @OriginalMember(owner = "client!jha", name = "n", descriptor = "I")
    public static int field9701 = -1;

    @OriginalMember(owner = "client!jha", name = "l", descriptor = "[F")
    public static float[] field9699 = new float[4];

    @OriginalMember(owner = "client!jha", name = "o", descriptor = "Z")
    public static boolean field9702 = false;

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "I")
    public static int field9688;

    @OriginalMember(owner = "client!jha", name = "b", descriptor = "I")
    public static int field9689;

    @OriginalMember(owner = "client!jha", name = "d", descriptor = "I")
    public static int field9691;

    @OriginalMember(owner = "client!jha", name = "e", descriptor = "I")
    public static int field9692;

    @OriginalMember(owner = "client!jha", name = "f", descriptor = "I")
    public static int field9693;

    @OriginalMember(owner = "client!jha", name = "m", descriptor = "I")
    public int field9700;

    @OriginalMember(owner = "client!jha", name = "p", descriptor = "I")
    public static int field9703;

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(Z)V")
    public final void method3925(boolean arg0) {
        class65 var2 = this.field9694;
        synchronized (this.field9694) {
            if (arg0) {
                this.field9700 = 57;
            }
            this.field9694.method558(0);
        }
        field9693++;
        class65 var3 = this.field9698;
        synchronized (this.field9698) {
            this.field9698.method558(0);
        }
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(I)V")
    public final void method3926(int arg0) {
        field9689++;
        class65 var2 = this.field9694;
        synchronized (this.field9694) {
            this.field9694.method561((byte) -78);
        }
        class65 var3 = this.field9698;
        synchronized (this.field9698) {
            this.field9698.method561((byte) -78);
            if (arg0 >= -27) {
                field9703 = -70;
            }
        }
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(B)V")
    public static void method3927(byte arg0) {
        field9690 = null;
        if (arg0 == -50) {
            field9699 = null;
        }
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(II)V")
    public final void method3928(int arg0, int arg1) {
        field9691++;
        this.field9700 = arg0;
        class65 var3 = this.field9698;
        synchronized (this.field9698) {
            this.field9698.method561((byte) -78);
        }
        if (arg1 != -1) {
            this.field9700 = -66;
        }
    }

    @OriginalMember(owner = "client!jha", name = "b", descriptor = "(II)Ldba;")
    public final class94 method3929(int arg0, int arg1) {
        field9692++;
        class65 var3 = this.field9694;
        class94 var4;
        synchronized (this.field9694) {
            var4 = (class94) this.field9694.method552(4, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class376 var5 = this.field9697;
        byte[] var6;
        synchronized (this.field9697) {
            var6 = this.field9697.method2218((byte) 119, class672.method3708((byte) 122, arg0), class672.method3726((byte) -103, arg0));
        }
        if (arg1 != -1) {
            this.method3929(61, 63);
        }
        class94 var7 = new class94();
        var7.field1131 = arg0;
        var7.field1147 = this;
        if (var6 != null) {
            var7.method705(arg1 ^ 0xFFFFFFB9, new class677(var6));
        }
        class65 var8 = this.field9694;
        synchronized (this.field9694) {
            this.field9694.method556((byte) 0, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(IZ)V")
    public final void method3930(int arg0, boolean arg1) {
        field9688++;
        if (arg1) {
            this.method3928(-100, -94);
        }
        class65 var3 = this.field9694;
        synchronized (this.field9694) {
            this.field9694.method553(arg0, -15782);
        }
        class65 var4 = this.field9698;
        synchronized (this.field9698) {
            this.field9698.method553(arg0, -15782);
        }
    }

    @OriginalMember(owner = "client!jha", name = "<init>", descriptor = "(Lms;ILwu;Lwu;)V")
    public class696(class763 arg0, int arg1, class376 arg2, class376 arg3) {
        this.field9695 = arg3;
        this.field9697 = arg2;
        int var5 = this.field9697.method2198(0) - 1;
        this.field9697.method2195(var5, 0);
    }
}
