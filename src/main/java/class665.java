import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class665 {

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "Lad;")
    private class19 field9300 = new class19(64);

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "Ltf;")
    private class701 field9294;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public int field9297;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field9293;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field9296;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field9298;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field9299;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public static int field9301;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "[I")
    public static int[] field9295;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public final void method3687(int arg0) {
        class19 var2 = this.field9300;
        synchronized (this.field9300) {
            this.field9300.method80((byte) -73);
        }
        field9298++;
        if (arg0 >= -34) {
            this.field9294 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)Lpca;")
    public final class400 method3688(int arg0, byte arg1) {
        field9296++;
        class19 var3 = this.field9300;
        class400 var4;
        synchronized (this.field9300) {
            var4 = (class400) this.field9300.method78(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class701 var5 = this.field9294;
        byte[] var6;
        synchronized (this.field9294) {
            var6 = this.field9294.method3854((byte) 64, 16, arg0);
        }
        class400 var7 = new class400();
        if (var6 != null) {
            var7.method2253(21, new class115(var6));
        }
        class19 var8 = this.field9300;
        synchronized (this.field9300) {
            int var9 = 81 / ((arg1 - 5) / 60);
            this.field9300.method92(1, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(IB)V")
    public final void method3689(int arg0, byte arg1) {
        if (arg1 != 33) {
            method3691(-85, -87, 84, 85, 75, 80);
        }
        field9301++;
        class19 var3 = this.field9300;
        synchronized (this.field9300) {
            this.field9300.method83((byte) -2, arg0);
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
    public static void method3690(int arg0) {
        if (arg0 < -66) {
            field9295 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIII)V")
    public static final void method3691(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 >= class412.field5526 && arg0 <= class72.field740 && class93.field949 <= arg3 && arg1 <= class360.field4834) {
            class414.method2333(-89, arg0, arg3, arg4, arg1, arg2);
        } else {
            class180.method1094(arg3, arg4, (byte) 89, arg2, arg1, arg0);
        }
        field9293++;
        if (arg5 != 16) {
            method3690(14);
        }
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)V")
    public final void method3692(int arg0) {
        field9299++;
        class19 var2 = this.field9300;
        synchronized (this.field9300) {
            this.field9300.method88(116);
        }
        if (arg0 != 0) {
            this.method3692(16);
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lqh;ILtf;)V")
    public class665(class320 arg0, int arg1, class701 arg2) {
        this.field9294 = arg2;
        if (this.field9294 == null) {
            this.field9297 = 0;
        } else {
            this.field9297 = this.field9294.method3883(16, 0);
        }
    }
}
