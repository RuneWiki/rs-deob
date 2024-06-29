import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class251 {

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "Lpja;")
    private class43 field3530 = new class43(16);

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "Lgj;")
    private class662 field3534;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "F")
    public static float field3529;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)Ljka;", line = 5)
    private final class689 method1652(int arg0, int arg1) {
        field3531++;
        class43 var3 = this.field3530;
        class689 var4;
        synchronized (this.field3530) {
            var4 = (class689) this.field3530.method266((byte) -104, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class662 var5 = this.field3534;
        byte[] var6;
        synchronized (this.field3534) {
            var6 = this.field3534.method3732(arg0, 8906, 29);
            if (arg1 < 35) {
                field3528 = 21;
            }
        }
        class689 var7 = new class689();
        if (var6 != null) {
            var7.method3866(-1, new class93(var6));
        }
        class43 var8 = this.field3530;
        synchronized (this.field3530) {
            this.field3530.method270(var7, (long) arg0, -127);
            return var7;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V", line = 43)
    public final void method1653(int arg0) {
        field3527++;
        class43 var2 = this.field3530;
        synchronized (this.field3530) {
            this.field3530.method273(126);
            int var3 = -33 % ((5 - arg0) / 35);
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V", line = 58)
    public final void method1654(int arg0) {
        field3533++;
        if (arg0 != 29) {
            this.field3534 = null;
        }
        class43 var2 = this.field3530;
        synchronized (this.field3530) {
            this.field3530.method272(20);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)V", line = 72)
    public final void method1655(boolean arg0, int arg1) {
        if (!arg0) {
            field3529 = 0.2896834F;
        }
        class43 var3 = this.field3530;
        synchronized (this.field3530) {
            this.field3530.method265(arg1, -28);
        }
        field3532++;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lsfa;IIIBI)Laf;", line = 85)
    public final class461 method1656(class725 arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field3535++;
        class667[] var7 = null;
        class689 var8 = this.method1652(arg3, 64);
        int var9 = 20 % ((arg4 + 73) / 35);
        if (var8.field9559 != null) {
            var7 = new class667[var8.field9559.length];
            for (int var10 = 0; var10 < var7.length; var10++) {
                class304 var11 = arg0.method4022(var8.field9559[var10], 30);
                var7[var10] = new class667(var11.field4177, var11.field4173, var11.field4171, var11.field4174, var11.field4170, var11.field4168, var11.field4175, var11.field4172);
            }
        }
        return new class461(var8.field9563, var7, var8.field9557, arg2, arg1, arg5);
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lim;ILgj;)V", line = 121)
    public class251(class598 arg0, int arg1, class662 arg2) {
        this.field3534 = arg2;
        this.field3534.method3730((byte) 34, 29);
    }
}
