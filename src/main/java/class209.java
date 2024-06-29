import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class209 {

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "Z")
    public boolean field2683 = false;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "Lqj;")
    private class535 field2686 = new class535(64);

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "Lqj;")
    public class535 field2696 = new class535(500);

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "Lqj;")
    public class535 field2697 = new class535(30);

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "Lqj;")
    public class535 field2698 = new class535(50);

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "Z")
    public boolean field2689;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "Luq;")
    private class172 field2691;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "Luq;")
    public class172 field2695;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "I")
    public int field2699;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
    public final void method1361(byte arg0) {
        field2685++;
        class535 var2 = this.field2686;
        synchronized (this.field2686) {
            this.field2686.method3113(-127);
        }
        class535 var3 = this.field2696;
        synchronized (this.field2696) {
            this.field2696.method3113(-128);
        }
        class535 var4 = this.field2697;
        synchronized (this.field2697) {
            this.field2697.method3113(-128);
            if (arg0 >= -100) {
                this.method1368(false, -86);
            }
        }
        class535 var5 = this.field2698;
        synchronized (this.field2698) {
            this.field2698.method3113(-128);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)Llp;")
    public final class412 method1362(int arg0, int arg1) {
        field2687++;
        class535 var3 = this.field2686;
        class412 var4;
        synchronized (this.field2686) {
            var4 = (class412) this.field2686.method3109((byte) 114, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class172 var5 = this.field2691;
        byte[] var6;
        synchronized (this.field2691) {
            var6 = this.field2691.method1188(class498.method2928(arg1, arg0 + 108), arg0 - 18047, class549.method3157(12, arg1));
        }
        class412 var7 = new class412();
        var7.field5888 = this;
        var7.field5850 = arg1;
        if (var6 != null) {
            var7.method2480(new class254(var6), 0);
        }
        var7.method2481((byte) 81);
        if (var7.field5931) {
            var7.field5895 = 0;
            var7.field5885 = false;
        }
        if (arg0 != 0) {
            this.method1362(61, -114);
        }
        if (!this.field2689 && var7.field5889) {
            var7.field5938 = null;
            var7.field5920 = null;
        }
        class535 var8 = this.field2686;
        synchronized (this.field2686) {
            this.field2686.method3108((long) arg1, 16337, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IB)V")
    public final void method1363(int arg0, byte arg1) {
        int var3 = 121 % ((60 - arg1) / 63);
        this.field2686 = new class535(arg0);
        field2684++;
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)V")
    public final void method1364(int arg0, int arg1) {
        this.field2699 = arg0;
        field2693++;
        class535 var3 = this.field2696;
        synchronized (this.field2696) {
            this.field2696.method3103(-11294);
        }
        if (arg1 >= -68) {
            this.method1364(118, 119);
        }
        class535 var4 = this.field2697;
        synchronized (this.field2697) {
            this.field2697.method3103(-11294);
        }
        class535 var5 = this.field2698;
        synchronized (this.field2698) {
            this.field2698.method3103(-11294);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZ)V")
    public final void method1365(int arg0, boolean arg1) {
        int var3 = -85 % ((-arg0 - 58) / 50);
        field2688++;
        if (this.field2683 != arg1) {
            this.field2683 = arg1;
            this.method1367(-1);
        }
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(II)V")
    public final void method1366(int arg0, int arg1) {
        field2690++;
        class535 var3 = this.field2686;
        synchronized (this.field2686) {
            this.field2686.method3101(false, arg0);
        }
        class535 var4 = this.field2696;
        synchronized (this.field2696) {
            this.field2696.method3101(false, arg0);
        }
        class535 var5 = this.field2697;
        synchronized (this.field2697) {
            this.field2697.method3101(false, arg0);
        }
        if (arg1 == 64) {
            class535 var6 = this.field2698;
            synchronized (this.field2698) {
                this.field2698.method3101(false, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
    public final void method1367(int arg0) {
        class535 var2 = this.field2686;
        synchronized (this.field2686) {
            this.field2686.method3103(-11294);
        }
        field2694++;
        class535 var3 = this.field2696;
        synchronized (this.field2696) {
            if (arg0 != -1) {
                this.method1368(false, 71);
            }
            this.field2696.method3103(arg0 ^ 0x2C1D);
        }
        class535 var4 = this.field2697;
        synchronized (this.field2697) {
            this.field2697.method3103(-11294);
        }
        class535 var5 = this.field2698;
        synchronized (this.field2698) {
            this.field2698.method3103(arg0 ^ 0x2C1D);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZI)V")
    public final void method1368(boolean arg0, int arg1) {
        field2692++;
        if (this.field2689 == arg0) {
            return;
        }
        this.field2689 = arg0;
        this.method1367(-1);
        if (arg1 != 30) {
            this.method1367(-89);
        }
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lkw;IZLuq;Luq;)V")
    public class209(class263 arg0, int arg1, boolean arg2, class172 arg3, class172 arg4) {
        this.field2689 = arg2;
        this.field2691 = arg3;
        this.field2695 = arg4;
        if (this.field2691 != null) {
            int var6 = this.field2691.method1193(true) - 1;
            this.field2691.method1175(var6, (byte) 104);
        }
    }
}
