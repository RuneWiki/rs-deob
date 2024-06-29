import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class354 {

    @OriginalMember(owner = "client!fs", name = "k", descriptor = "Lwg;")
    private class58 field4961 = new class58(64);

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "Lkr;")
    private class329 field4953;

    @OriginalMember(owner = "client!fs", name = "j", descriptor = "I")
    public int field4960;

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "Z")
    public static boolean field4958 = false;

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "S")
    public static short field4956 = 1;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "Lim;")
    public static class353 field4952 = new class353(98, 0);

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!fs", name = "i", descriptor = "Lha;")
    public static class116 field4959;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(BLjq;)V")
    public static final void method2206(byte arg0, class447 arg1) {
        if (arg0 <= -91) {
            field4954++;
            if (arg1.field6336 == 5 && arg1.field6263 != -1) {
                class104.method575(arg1, (byte) 117, class301.field3918);
            }
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)I")
    public static final int method2207(int arg0, int arg1) {
        field4955++;
        if (arg1 <= 81) {
            return 33;
        } else {
            int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
            int var3 = arg0 * 6 - 61440;
            int var4 = (arg0 * var3 >> 12) + 40960;
            return var2 * var4 >> 12;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IB)Lbca;")
    public final class285 method2208(int arg0, byte arg1) {
        field4951++;
        if (arg1 != 17) {
            this.field4961 = null;
        }
        class58 var3 = this.field4961;
        class285 var4;
        synchronized (this.field4961) {
            var4 = (class285) this.field4961.method323((long) arg0, -19814);
        }
        if (var4 != null) {
            return var4;
        }
        class329 var5 = this.field4953;
        byte[] var6;
        synchronized (this.field4953) {
            var6 = this.field4953.method2054(true, 19, arg0);
        }
        class285 var7 = new class285();
        if (var6 != null) {
            var7.method1769(new class551(var6), (byte) -110);
        }
        class58 var8 = this.field4961;
        synchronized (this.field4961) {
            this.field4961.method316((long) arg0, (byte) -127, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Z)V")
    public static void method2209(boolean arg0) {
        field4952 = null;
        if (arg0) {
            field4958 = true;
        }
        field4959 = null;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class276 var7 = new class276();
        var7.field3607 = arg1 >> class400.field5480;
        var7.field3610 = arg2 >> class400.field5480;
        var7.field3611 = arg3 >> class400.field5480;
        var7.field3596 = arg4 >> class400.field5480;
        var7.field3600 = arg0;
        var7.field3593 = arg1;
        var7.field3604 = arg2;
        var7.field3603 = arg3;
        var7.field3595 = arg4;
        var7.field3606 = arg5;
        var7.field3609 = arg6;
        class247.field3114[class355.field4976++] = var7;
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lg;ILkr;)V")
    public class354(class513 arg0, int arg1, class329 arg2) {
        this.field4953 = arg2;
        this.field4960 = this.field4953.method2064(0, 19);
    }
}
