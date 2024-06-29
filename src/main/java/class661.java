import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class661 {

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "Z")
    public boolean field9522 = false;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "Low;")
    public static class319 field9521 = new class319();

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field9518;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field9520;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field9523;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field9524;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field9525;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public int field9526;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    public static int field9528;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public int field9529;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public static int field9530;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "Lve;")
    public class469 field9527;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "Lmk;")
    public static class51 field9519;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lr;IZI)Lf;")
    public final class702 method3759(class167 arg0, int arg1, boolean arg2, int arg3) {
        field9530++;
        long var5 = (long) (this.field9526 | arg3 << 16 | (arg2 ? 262144 : 0) | arg0.field2783 << 19);
        class702 var7 = (class702) this.field9527.field6644.method1900(var5, -33);
        if (var7 != null) {
            return var7;
        } else if (arg1 != -1) {
            return null;
        } else if (this.field9527.field6639.method2230((byte) -101, this.field9526)) {
            class279 var8 = class279.method1841(this.field9527.field6639, this.field9526, 0);
            if (var8 != null) {
                var8.field4175 = var8.field4168 = var8.field4173 = var8.field4172 = 0;
                if (arg2) {
                    var8.method1853();
                }
                for (int var9 = 0; var9 < arg3; var9++) {
                    var8.method1851();
                }
            }
            class702 var10 = arg0.method170(var8, true);
            if (var10 != null) {
                this.field9527.field6644.method1904(var10, var5, -1);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BC)Z")
    public static final boolean method3760(byte arg0, char arg1) {
        field9525++;
        if (arg0 != -115) {
            field9521 = null;
        }
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            char[] var2 = class343.field5108;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
    public static void method3761(byte arg0) {
        field9521 = null;
        if (arg0 != 21) {
            field9521 = null;
        }
        field9519 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lsw;Z)V")
    public static final void method3762(class701 arg0, boolean arg1) {
        arg0.field9861 = null;
        field9520++;
        if (class202.field3113 < 20) {
            class698.field9825.method3322(arg0, -87);
            class202.field3113++;
        }
        if (!arg1) {
            field9521 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lju;I)Z")
    public static final boolean method3763(class111 arg0, int arg1) {
        field9524++;
        if (arg1 == 28850) {
            return class585.field8446 == arg0 || class643.field9240 == arg0 || class72.field1495 == arg0 || class368.field5453 == arg0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILqh;)V")
    private final void method3764(int arg0, int arg1, class61 arg2) {
        if (arg0 == 1) {
            this.field9526 = arg2.method723((byte) -25);
        } else if (arg0 == 2) {
            this.field9529 = arg2.method740((byte) 91);
        } else if (arg0 == 3) {
            this.field9522 = true;
        } else if (arg0 == 4) {
            this.field9526 = -1;
        }
        field9523++;
        if (arg1 != 262144) {
            method3761((byte) 63);
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)Z")
    public final boolean method3765(byte arg0) {
        field9528++;
        int var2 = 2 / ((arg0 - 64) / 40);
        return this.field9527.field6639.method2230((byte) 72, this.field9526);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lqh;I)V")
    public final void method3766(class61 arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        while (true) {
            int var3 = arg0.method732(-559537960);
            if (var3 == 0) {
                field9518++;
                return;
            }
            this.method3764(var3, 262144, arg0);
        }
    }
}
