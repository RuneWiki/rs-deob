import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class252 {

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "Leda;")
    private class14 field4008 = new class14(64);

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "Lla;")
    private class422 field4001;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "Ltm;")
    public static class334 field4006 = new class334(80, 2);

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "B")
    public static byte field4005;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V", line = 4)
    public final void method1714(int arg0, int arg1) {
        field4003++;
        class14 var3 = this.field4008;
        synchronized (this.field4008) {
            if (arg0 == 2) {
                this.field4008.method68(-16878, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)Lta;", line = 19)
    public final class27 method1715(int arg0, int arg1) {
        field4004++;
        class14 var3 = this.field4008;
        class27 var5;
        synchronized (this.field4008) {
            int var4 = 6 % ((23 - arg1) / 34);
            var5 = (class27) this.field4008.method80((byte) -100, (long) arg0);
        }
        if (var5 != null) {
            return var5;
        }
        class422 var6 = this.field4001;
        byte[] var7;
        synchronized (this.field4001) {
            var7 = this.field4001.method2624(0, class612.method3494(arg0, 15), class541.method3170(arg0, (byte) -36));
        }
        class27 var8 = new class27();
        if (var7 != null) {
            var8.method153((byte) 59, new class301(var7));
        }
        class14 var9 = this.field4008;
        synchronized (this.field4008) {
            this.field4008.method67((long) arg0, var8, -6772);
            return var8;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)V", line = 53)
    public final void method1716(int arg0, byte arg1) {
        int var3 = -110 % ((arg1 - 59) / 59);
        class14 var4 = this.field4008;
        synchronized (this.field4008) {
            this.field4008.method76(37);
            this.field4008 = new class14(arg0);
        }
        field4009++;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V", line = 66)
    public final void method1717(byte arg0) {
        field4002++;
        class14 var2 = this.field4008;
        synchronized (this.field4008) {
            this.field4008.method76(42);
            if (arg0 != -9) {
                this.method1716(-85, (byte) -124);
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)V", line = 83)
    public final void method1718(byte arg0) {
        field4010++;
        int var2 = 121 / ((arg0 - 11) / 59);
        class14 var3 = this.field4008;
        synchronized (this.field4008) {
            this.field4008.method71((byte) 44);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V", line = 102)
    public static void method1719(int arg0) {
        int var1 = 102 / ((-arg0 - 5) / 50);
        field4006 = null;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lcr;ILla;)V", line = 114)
    public class252(class292 arg0, int arg1, class422 arg2) {
        this.field4001 = arg2;
        if (this.field4001 != null) {
            int var4 = this.field4001.method2628(-119) - 1;
            this.field4001.method2615(0, var4);
        }
    }
}
