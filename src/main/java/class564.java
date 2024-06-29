import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class564 {

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "Lqj;")
    private class535 field7726 = new class535(64);

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "Luq;")
    private class172 field7724;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "Ljea;")
    public static class474 field7723 = new class474(4, 7);

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "Z")
    public static boolean field7727 = false;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "Lg;")
    public static class166 field7728 = new class166(2);

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field7718;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field7719;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field7720;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field7721;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field7722;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field7725;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V", line = 5)
    public final void method3210(byte arg0) {
        if (arg0 <= 40) {
            this.method3211(80, 72);
        }
        field7718++;
        class535 var2 = this.field7726;
        synchronized (this.field7726) {
            this.field7726.method3113(-127);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)V", line = 19)
    public final void method3211(int arg0, int arg1) {
        class535 var3 = this.field7726;
        synchronized (this.field7726) {
            this.field7726.method3101(false, arg1);
        }
        if (arg0 == -12837) {
            field7721++;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIII)V", line = 35)
    public static final void method3212(int arg0, int arg1, int arg2, int arg3) {
        field7722++;
        int var4 = 3 % ((8 - arg1) / 48);
        int var5 = arg0 * class125.field1721.field5173.method1871(43) >> 8;
        if (var5 == 0 || arg2 == -1) {
            return;
        }
        if (!class72.field973 && class264.field3886 != -1 && class81.method647(-3610) && !class671.method3702(21573)) {
            class757.field10247 = class384.method2382((byte) 115);
            class64 var6 = class557.method3191(-110, class757.field10247);
            class651.method3620(true, true, var6);
        }
        class414.method2491(0, class560.field7680, false, 11889, var5, arg2);
        class714.method3955(16, -1, 255);
        class72.field973 = true;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)V", line = 63)
    public final void method3213(byte arg0) {
        field7725++;
        class535 var2 = this.field7726;
        synchronized (this.field7726) {
            this.field7726.method3103(-11294);
            if (arg0 != -54) {
                field7728 = null;
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILgj;Lgj;)V", line = 77)
    public static final void method3214(int arg0, class659 arg1, class659 arg2) {
        if (arg2.field8887 != null) {
            arg2.method3659(arg0 + 30252);
        }
        if (arg0 != -30251) {
            field7723 = null;
        }
        field7720++;
        arg2.field8885 = arg1.field8885;
        arg2.field8887 = arg1;
        arg2.field8887.field8885 = arg2;
        arg2.field8885.field8887 = arg2;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V", line = 99)
    public static void method3215(boolean arg0) {
        if (arg0) {
            method3215(true);
        }
        field7723 = null;
        field7728 = null;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lkw;ILuq;)V", line = 118)
    public class564(class263 arg0, int arg1, class172 arg2) {
        this.field7724 = arg2;
        if (this.field7724 != null) {
            this.field7724.method1175(35, (byte) 81);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IB)Lbe;", line = 146)
    public final class41 method3216(int arg0, byte arg1) {
        field7719++;
        class535 var3 = this.field7726;
        class41 var4;
        synchronized (this.field7726) {
            var4 = (class41) this.field7726.method3109((byte) 116, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class172 var5 = this.field7724;
        byte[] var6;
        synchronized (this.field7724) {
            var6 = this.field7724.method1188(35, -18047, arg0);
        }
        class41 var7 = new class41();
        if (var6 != null) {
            var7.method234(1, new class254(var6));
        }
        var7.method232(75);
        class535 var8 = this.field7726;
        synchronized (this.field7726) {
            int var9 = 64 / ((-arg1 - 93) / 33);
            this.field7726.method3108((long) arg0, 16337, var7);
            return var7;
        }
    }
}
