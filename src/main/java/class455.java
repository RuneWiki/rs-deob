import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public class class455 {

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "Lqr;")
    private class65 field6204 = new class65(64);

    @OriginalMember(owner = "client!uda", name = "d", descriptor = "Lwu;")
    private class376 field6207;

    @OriginalMember(owner = "client!uda", name = "g", descriptor = "D")
    public static double field6210;

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "I")
    public static int field6205;

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "I")
    public static int field6206;

    @OriginalMember(owner = "client!uda", name = "e", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!uda", name = "f", descriptor = "I")
    public static int field6209;

    @OriginalMember(owner = "client!uda", name = "h", descriptor = "I")
    public static int field6211;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(B)V")
    public final void method2586(byte arg0) {
        class65 var2 = this.field6204;
        synchronized (this.field6204) {
            int var3 = 91 / ((arg0 - 62) / 34);
            this.field6204.method558(0);
        }
        field6205++;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)V")
    public final void method2587(int arg0) {
        class65 var2 = this.field6204;
        synchronized (this.field6204) {
            this.field6204.method561((byte) -78);
        }
        field6206++;
        if (arg0 != 21185) {
            this.field6207 = null;
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(II)Lpc;")
    public final class671 method2588(int arg0, int arg1) {
        field6208++;
        class65 var3 = this.field6204;
        class671 var5;
        synchronized (this.field6204) {
            if (arg0 >= -87) {
                return null;
            }
            var5 = (class671) this.field6204.method552(4, (long) arg1);
        }
        if (var5 != null) {
            return var5;
        }
        class376 var6 = this.field6207;
        byte[] var7;
        synchronized (this.field6207) {
            var7 = this.field6207.method2218((byte) 108, class135.method1054(-106, arg1), class327.method1974((byte) -124, arg1));
        }
        class671 var8 = new class671();
        if (var7 != null) {
            var8.method3700(38, new class677(var7));
        }
        class65 var9 = this.field6204;
        synchronized (this.field6204) {
            this.field6204.method556((byte) 0, (long) arg1, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IZ)V")
    public final void method2589(int arg0, boolean arg1) {
        field6209++;
        class65 var3 = this.field6204;
        synchronized (this.field6204) {
            this.field6204.method553(arg0, -15782);
            if (arg1) {
                this.method2586((byte) 34);
            }
        }
    }

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "(II)V")
    public final void method2590(int arg0, int arg1) {
        if (arg1 != -886) {
            this.method2590(-84, 106);
        }
        class65 var3 = this.field6204;
        synchronized (this.field6204) {
            this.field6204.method561((byte) -78);
            this.field6204 = new class65(arg0);
        }
        field6211++;
    }

    @OriginalMember(owner = "client!uda", name = "<init>", descriptor = "(Lms;ILwu;)V")
    public class455(class763 arg0, int arg1, class376 arg2) {
        this.field6207 = arg2;
        if (this.field6207 != null) {
            int var4 = this.field6207.method2198(0) - 1;
            this.field6207.method2195(var4, 0);
        }
    }
}
