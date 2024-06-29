import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class367 {

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "Lqe;")
    private class433 field5757 = new class433();

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "Ljava/lang/String;")
    public String field5748;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field5751;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field5752;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field5758;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    private volatile int field5760;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "Lkj;")
    private class526 field5759;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "[I")
    public static int[] field5756;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lpn;I)V")
    public final void method2426(class692 arg0, int arg1) {
        if (arg1 != 7775) {
            return;
        }
        field5754++;
        arg0.field9698 = true;
        class433 var3 = this.field5757;
        synchronized (this.field5757) {
            this.field5757.method2757(arg0, -1);
            this.field5760++;
        }
        if (this.field5759 != null) {
            class526 var4 = this.field5759;
            synchronized (this.field5759) {
                this.field5759.notify();
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(III[II)V")
    public static final void method2427(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        arg4--;
        field5753++;
        int var6 = arg2 - 1;
        int var5 = var6 - 7;
        while (arg4 < var5) {
            int var7 = arg4 + 1;
            arg3[var7] = arg1;
            int var8 = var7 + 1;
            arg3[var8] = arg1;
            int var9 = var8 + 1;
            arg3[var9] = arg1;
            int var10 = var9 + 1;
            arg3[var10] = arg1;
            int var11 = var10 + 1;
            arg3[var11] = arg1;
            int var12 = var11 + 1;
            arg3[var12] = arg1;
            int var13 = var12 + 1;
            arg3[var13] = arg1;
            arg4 = var13 + 1;
            arg3[arg4] = arg1;
        }
        while (var6 > arg4) {
            arg4++;
            arg3[arg4] = arg1;
        }
        if (arg0 != 3803) {
            field5756 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)Ljea;")
    public final class416 method2428(int arg0) {
        if (arg0 != -4634) {
            return null;
        }
        field5751++;
        Object var2 = null;
        class433 var3 = this.field5757;
        synchronized (this.field5757) {
            class416 var4 = this.field5757.method2754((byte) 116);
            var4.method2648((byte) -25);
            this.field5760--;
            return var4;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILkb;)V")
    public final void method2429(int arg0, class641 arg1) {
        field5750++;
        class433 var3 = this.field5757;
        synchronized (this.field5757) {
            this.field5757.method2757(arg1, ~arg0);
            this.field5760++;
        }
        if (arg0 != 0) {
            method2434(57, 6, -33, 6, -12);
        }
        if (this.field5759 != null) {
            class526 var4 = this.field5759;
            synchronized (this.field5759) {
                this.field5759.notify();
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
    public static void method2430(int arg0) {
        if (arg0 != 0) {
            method2434(107, -88, 98, -109, 48);
        }
        field5756 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILkj;)V")
    public final void method2431(int arg0, class526 arg1) {
        field5752++;
        int var3 = 16 % ((arg0 + 81) / 33);
        this.field5759 = arg1;
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)Z")
    public final boolean method2432(int arg0) {
        field5755++;
        if (arg0 >= -82) {
            return false;
        } else {
            return this.field5760 == 0;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILpn;)V")
    public final void method2433(int arg0, class692 arg1) {
        field5758++;
        arg1.field9698 = false;
        if (arg0 < 113) {
            return;
        }
        class433 var3 = this.field5757;
        synchronized (this.field5757) {
            this.field5757.method2757(arg1, -1);
            this.field5760++;
        }
        if (this.field5759 != null) {
            class526 var4 = this.field5759;
            synchronized (this.field5759) {
                this.field5759.notify();
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIII)V")
    public static final void method2434(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5749++;
        int var5 = 0;
        int var6 = arg0;
        int var7 = -arg0;
        method2427(3803, arg1, arg2 + arg0, class39.field527[arg3], arg2 - arg0);
        if (arg4 <= 111) {
            field5756 = null;
        }
        int var8 = -1;
        while (var6 > var5) {
            var8 += 2;
            var5++;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class39.field527[arg3 + var6];
                int[] var10 = class39.field527[arg3 - var6];
                int var11 = arg2 + var5;
                int var12 = arg2 - var5;
                method2427(3803, arg1, var11, var9, var12);
                method2427(3803, arg1, var11, var10, var12);
            }
            int var13 = arg2 + var6;
            int var14 = arg2 - var6;
            int[] var15 = class39.field527[arg3 + var5];
            int[] var16 = class39.field527[arg3 - var5];
            method2427(3803, arg1, var13, var15, var14);
            method2427(3803, arg1, var13, var16, var14);
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class367(String arg0) {
        this.field5748 = arg0;
    }
}
