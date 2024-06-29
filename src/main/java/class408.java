import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class408 {

    @OriginalMember(owner = "client!qba", name = "g", descriptor = "Z")
    public boolean field5741 = false;

    @OriginalMember(owner = "client!qba", name = "c", descriptor = "Lqk;")
    public static class1 field5737 = new class1(75, 6);

    @OriginalMember(owner = "client!qba", name = "i", descriptor = "I")
    public static int field5743 = 0;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "I")
    public static int field5736;

    @OriginalMember(owner = "client!qba", name = "d", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!qba", name = "e", descriptor = "I")
    public int field5739;

    @OriginalMember(owner = "client!qba", name = "f", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!qba", name = "j", descriptor = "I")
    public int field5744;

    @OriginalMember(owner = "client!qba", name = "k", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!qba", name = "h", descriptor = "Lkb;")
    public class495 field5742;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IILgga;)V", line = 4)
    private final void method2494(int arg0, int arg1, class511 arg2) {
        if (arg0 != 2) {
            return;
        }
        if (arg1 == 1) {
            this.field5744 = arg2.method3002(-1);
        } else if (arg1 == 2) {
            this.field5739 = arg2.method2983(true);
        } else if (arg1 == 3) {
            this.field5741 = true;
        } else if (arg1 == 4) {
            this.field5744 = -1;
        }
        field5745++;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(B)V", line = 32)
    public static void method2495(byte arg0) {
        int var1 = -29 % ((arg0 + 46) / 56);
        field5737 = null;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(III)I", line = 41)
    public static final int method2496(int arg0, int arg1, int arg2) {
        field5735++;
        if (arg1 > -85) {
            method2495((byte) 22);
        }
        int var3 = class379.method2367(59, arg2 - 1, arg0 - 1) + class379.method2367(45, arg2 + 1, arg0 + -1) - (-class379.method2367(103, arg2 + -1, arg0 + 1) + -class379.method2367(88, arg2 + 1, arg0 + 1));
        int var4 = class379.method2367(65, arg2 - 1, arg0) + class379.method2367(60, arg2 + 1, arg0) - (-class379.method2367(27, arg2, arg0 + -1) + -class379.method2367(55, arg2, arg0 - -1));
        int var5 = class379.method2367(108, arg2, arg0);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(Lgga;I)V", line = 63)
    public final void method2497(class511 arg0, int arg1) {
        if (arg1 != -7421) {
            field5737 = null;
        }
        field5736++;
        while (true) {
            int var3 = arg0.method3013(69);
            if (var3 == 0) {
                return;
            }
            this.method2494(arg1 + 7423, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IBZLha;)Lho;", line = 83)
    public final class318 method2498(int arg0, byte arg1, boolean arg2, class473 arg3) {
        field5740++;
        long var5 = (long) (this.field5744 | arg0 << 16 | (arg2 ? 262144 : 0) | arg3.field6555 << 19);
        class318 var7 = (class318) this.field5742.field6814.method312(0, var5);
        if (arg1 != -41) {
            return null;
        } else if (var7 != null) {
            return var7;
        } else if (this.field5742.field6802.method1860(this.field5744, (byte) 124)) {
            class279 var8 = class279.method1821(this.field5742.field6802, this.field5744, 0);
            if (var8 != null) {
                var8.field4015 = var8.field4016 = var8.field4013 = var8.field4011 = 0;
                if (arg2) {
                    var8.method1815();
                }
                for (int var9 = 0; var9 < arg0; var9++) {
                    var8.method1810();
                }
            }
            class318 var10 = arg3.method192(var8, true);
            if (var10 != null) {
                this.field5742.field6814.method305(var10, var5, arg1 + 18361);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "(B)Z", line = 141)
    public final boolean method2499(byte arg0) {
        if (arg0 >= -68) {
            field5737 = null;
        }
        field5738++;
        return this.field5742.field6802.method1860(this.field5744, (byte) 124);
    }
}
