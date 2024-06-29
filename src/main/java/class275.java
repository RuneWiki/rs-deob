import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class275 {

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "Ljt;")
    private class106 field3908 = new class106(16);

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "Lvd;")
    private class39 field3909;

    @OriginalMember(owner = "client!vea", name = "c", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!vea", name = "d", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!vea", name = "e", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!vea", name = "f", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!vea", name = "g", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(IZ)V")
    public final void method1745(int arg0, boolean arg1) {
        if (!arg1) {
            this.method1746(80);
        }
        field3914++;
        class106 var3 = this.field3908;
        synchronized (this.field3908) {
            this.field3908.method807(arg0, -1);
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(I)V")
    public final void method1746(int arg0) {
        if (arg0 != 16) {
            return;
        }
        field3910++;
        class106 var2 = this.field3908;
        synchronized (this.field3908) {
            this.field3908.method809(true);
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(B)V")
    public final void method1747(byte arg0) {
        if (arg0 != 90) {
            this.field3908 = null;
        }
        field3913++;
        class106 var2 = this.field3908;
        synchronized (this.field3908) {
            this.field3908.method800(arg0 ^ 0x33);
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(II)Lmp;")
    private final class763 method1748(int arg0, int arg1) {
        field3911++;
        class106 var3 = this.field3908;
        class763 var4;
        synchronized (this.field3908) {
            var4 = (class763) this.field3908.method803(107, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class39 var5 = this.field3909;
        byte[] var6;
        synchronized (this.field3909) {
            var6 = this.field3909.method211(true, 29, arg1);
        }
        class763 var7 = new class763();
        int var8 = -59 % ((arg0 + 18) / 60);
        if (var6 != null) {
            var7.method4237(new class645(var6), false);
        }
        class106 var9 = this.field3908;
        synchronized (this.field3908) {
            this.field3908.method801(1, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lve;IIIII)Lq;")
    public final class429 method1749(class505 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3912++;
        class540[] var7 = null;
        class763 var8 = this.method1748(-78, arg3);
        if (arg4 != 16) {
            this.field3909 = null;
        }
        if (var8.field10628 != null) {
            var7 = new class540[var8.field10628.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class493 var10 = arg0.method2995(var8.field10628[var9], 2);
                var7[var9] = new class540(var10.field7022, var10.field7027, var10.field7020, var10.field7024, var10.field7025, var10.field7026, var10.field7028, var10.field7023);
            }
        }
        return new class429(var8.field10621, var7, var8.field10627, arg1, arg5, arg2);
    }

    @OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(Lqg;ILvd;)V")
    public class275(class464 arg0, int arg1, class39 arg2) {
        this.field3909 = arg2;
        this.field3909.method229(29, 0);
    }
}
