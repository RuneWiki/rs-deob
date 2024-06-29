import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class341 {

    @OriginalMember(owner = "client!om", name = "g", descriptor = "Llga;")
    private class663 field4570 = new class663(64);

    @OriginalMember(owner = "client!om", name = "q", descriptor = "Llga;")
    public class663 field4580 = new class663(60);

    @OriginalMember(owner = "client!om", name = "o", descriptor = "Lsea;")
    private class648 field4578;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "Lsea;")
    public class648 field4571;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "Lgca;")
    public static class227 field4566 = new class227();

    @OriginalMember(owner = "client!om", name = "n", descriptor = "[I")
    public static int[] field4577 = new int[4096];

    @OriginalMember(owner = "client!om", name = "m", descriptor = "Lem;")
    public static class206 field4576 = new class206(2, -1);

    @OriginalMember(owner = "client!om", name = "k", descriptor = "F")
    public static float field4574;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!om", name = "l", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!om", name = "r", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!om", name = "s", descriptor = "I")
    public int field4582;

    @OriginalMember(owner = "client!om", name = "p", descriptor = "Lsea;")
    public static class648 field4579;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)Lhga;", line = 8)
    public final class157 method1993(int arg0, int arg1) {
        field4565++;
        if (arg1 != 64) {
            return null;
        }
        class663 var3 = this.field4570;
        class157 var4;
        synchronized (this.field4570) {
            var4 = (class157) this.field4570.method3747((byte) -66, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class648 var5 = this.field4578;
        byte[] var6;
        synchronized (this.field4578) {
            var6 = this.field4578.method3654(-15615, class550.method3094(true, arg0), class303.method1846((byte) 105, arg0));
        }
        class157 var7 = new class157();
        var7.field2284 = arg0;
        var7.field2281 = this;
        if (var6 != null) {
            var7.method1111(arg1 - 65, new class501(var6));
        }
        class663 var8 = this.field4570;
        synchronized (this.field4570) {
            this.field4570.method3748((long) arg0, var7, 12537);
            return var7;
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(II)V", line = 40)
    public final void method1994(int arg0, int arg1) {
        field4568++;
        class663 var3 = this.field4570;
        synchronized (this.field4570) {
            if (arg0 != -19187) {
                return;
            }
            this.field4570.method3754(arg1, true);
        }
        class663 var4 = this.field4580;
        synchronized (this.field4580) {
            this.field4580.method3754(arg1, true);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "([BIIIIIB)Z", line = 56)
    public static final boolean method1995(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field4569++;
        int var7 = arg3 % arg5;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg5 - var7;
        }
        int var9 = -((arg2 + arg5 - 1) / arg5);
        int var10 = -((arg3 + arg5 - 1) / arg5);
        if (arg6 >= -62) {
            field4576 = null;
        }
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg0[arg4] == 0) {
                    return true;
                }
                arg4 += arg5;
            }
            int var13 = arg4 - var8;
            if (arg0[var13 - 1] == 0) {
                return true;
            }
            arg4 = arg1 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V", line = 106)
    public static void method1996(int arg0) {
        field4577 = null;
        field4576 = null;
        if (arg0 < 94) {
            field4577 = null;
        }
        field4566 = null;
        field4579 = null;
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(II)V", line = 120)
    public final void method1997(int arg0, int arg1) {
        field4573++;
        this.field4582 = arg1;
        class663 var3 = this.field4580;
        synchronized (this.field4580) {
            this.field4580.method3749(7648);
        }
        if (arg0 != -20444) {
            this.method2000(-75);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lin;I)V", line = 140)
    public static final void method1998(class78 arg0, int arg1) {
        field4572++;
        if (!class426.field5971) {
            return;
        }
        class545.field7393++;
        if (arg0.field1070 != null) {
            class78 var2 = class89.method650(-109, class340.field4555, class544.field7389);
            if (var2 != null) {
                class368 var3 = new class368();
                var3.field4962 = arg0.field1070;
                var3.field4952 = var2;
                var3.field4957 = arg0;
                class97.method708(var3);
            }
        }
        class352 var4 = class290.method1786(98, class199.field2836, class618.field8609);
        var4.field4686.method2836(arg0.field1129, -22164);
        var4.field4686.method2837(arg0.field1145, -2);
        var4.field4686.method2837(class544.field7389, -2);
        var4.field4686.method2818(arg0.field1034, -27787);
        var4.field4686.method2812(98, class301.field4099);
        int var5 = -114 % ((arg1 - 4) / 61);
        var4.field4686.method2856(class340.field4555, (byte) -60);
        class602.method3388(var4, (byte) 28);
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V", line = 182)
    public final void method1999(int arg0) {
        class663 var2 = this.field4570;
        synchronized (this.field4570) {
            this.field4570.method3755(19713);
        }
        field4575++;
        class663 var3 = this.field4580;
        synchronized (this.field4580) {
            this.field4580.method3755(19713);
            if (arg0 <= 115) {
                this.method1994(-47, 61);
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(I)V", line = 198)
    public final void method2000(int arg0) {
        field4567++;
        class663 var2 = this.field4570;
        synchronized (this.field4570) {
            this.field4570.method3749(7648);
            if (arg0 != 9368) {
                this.field4571 = null;
            }
        }
        class663 var3 = this.field4580;
        synchronized (this.field4580) {
            this.field4580.method3749(7648);
        }
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lci;ILsea;Lsea;)V", line = 241)
    public class341(class414 arg0, int arg1, class648 arg2, class648 arg3) {
        this.field4578 = arg2;
        this.field4571 = arg3;
        int var5 = this.field4578.method3649((byte) 112) - 1;
        this.field4578.method3653(var5, true);
    }
}
