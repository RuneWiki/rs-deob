import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class460 {

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "Lpja;")
    private class43 field6248 = new class43(64);

    @OriginalMember(owner = "client!gr", name = "m", descriptor = "Lpja;")
    public class43 field6255 = new class43(2);

    @OriginalMember(owner = "client!gr", name = "k", descriptor = "Lgj;")
    private class662 field6253;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "Lgj;")
    public class662 field6245;

    @OriginalMember(owner = "client!gr", name = "l", descriptor = "Z")
    public static boolean field6254 = false;

    @OriginalMember(owner = "client!gr", name = "n", descriptor = "I")
    public static int field6256 = -1;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
    public static int field6243;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "I")
    public static int field6246;

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
    public static int field6247;

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "I")
    public static int field6249;

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!gr", name = "i", descriptor = "I")
    public static int field6251;

    @OriginalMember(owner = "client!gr", name = "j", descriptor = "I")
    public static int field6252;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IBI)Z", line = 5)
    public static final boolean method2642(int arg0, byte arg1, int arg2) {
        if (arg1 <= 81) {
            return true;
        } else {
            field6247++;
            return (arg0 & 0x20) != 0;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V", line = 16)
    public final void method2643(byte arg0) {
        class43 var2 = this.field6248;
        synchronized (this.field6248) {
            this.field6248.method272(20);
        }
        field6244++;
        class43 var3 = this.field6255;
        synchronized (this.field6255) {
            if (arg0 == 59) {
                this.field6255.method272(20);
            }
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V", line = 34)
    public final void method2644(int arg0) {
        field6243++;
        class43 var2 = this.field6248;
        synchronized (this.field6248) {
            this.field6248.method273(-39);
            if (arg0 != -14166) {
                this.field6245 = null;
            }
        }
        class43 var3 = this.field6255;
        synchronized (this.field6255) {
            this.field6255.method273(16);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(JJ)J", line = 50)
    public static long method2645(long arg0, long arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIZIIIII)V", line = 64)
    public static final void method2646(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6251++;
        if ((arg2 ? class111.field1911.field6724.method925((byte) 76) : class111.field1911.field6762.method925((byte) 52)) != 0 && arg4 != 0 && class57.field806 < 50 && arg5 != -1) {
            class531.field7189[class57.field806++] = new class481((byte) (arg2 ? 3 : 2), arg5, arg4, arg3, arg6, arg1, arg7, null);
        }
        if (arg0 != 12370) {
            method2642(70, (byte) 107, -119);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIII)V", line = 86)
    public static final void method2647(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6252++;
        class281 var5 = class54.method395((byte) -53, (long) arg1, arg0);
        var5.method1821((byte) 127);
        var5.field3910 = arg2;
        var5.field3901 = arg4;
        var5.field3909 = arg3;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)V", line = 103)
    public final void method2648(int arg0, int arg1) {
        field6250++;
        if (arg1 >= -47) {
            method2647(43, 38, -119, -88, 118);
        }
        class43 var3 = this.field6248;
        synchronized (this.field6248) {
            this.field6248.method265(arg0, -13);
        }
        class43 var4 = this.field6255;
        synchronized (this.field6255) {
            this.field6255.method265(arg0, -18);
        }
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lim;ILgj;Lgj;)V", line = 164)
    public class460(class598 arg0, int arg1, class662 arg2, class662 arg3) {
        this.field6253 = arg2;
        this.field6245 = arg3;
        this.field6253.method3730((byte) -99, 33);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IB)Lnw;", line = 124)
    public final class613 method2649(int arg0, byte arg1) {
        field6246++;
        class43 var3 = this.field6248;
        class613 var4;
        synchronized (this.field6248) {
            var4 = (class613) this.field6248.method266((byte) -99, (long) arg0);
        }
        if (arg1 != -82) {
            method2642(2, (byte) -15, 74);
        }
        if (var4 != null) {
            return var4;
        }
        class662 var5 = this.field6253;
        byte[] var6;
        synchronized (this.field6253) {
            var6 = this.field6253.method3732(arg0, 8906, 33);
        }
        class613 var7 = new class613();
        var7.field8540 = this;
        if (var6 != null) {
            var7.method3472(new class93(var6), -73);
        }
        class43 var8 = this.field6248;
        synchronized (this.field6248) {
            this.field6248.method270(var7, (long) arg0, arg1 - 41);
            return var7;
        }
    }
}
