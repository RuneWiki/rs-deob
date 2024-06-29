import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class384 {

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "Loo;")
    private class652 field5288 = new class652(64);

    @OriginalMember(owner = "client!ll", name = "l", descriptor = "Loo;")
    public class652 field5289 = new class652(60);

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "Lwia;")
    private class791 field5279;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "Lwia;")
    public class791 field5280;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "Lsaa;")
    public static class345 field5287 = new class345(7, 2);

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "Lfba;")
    public static class27 field5292 = new class27(64, 7);

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!ll", name = "m", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!ll", name = "n", descriptor = "I")
    public int field5291;

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "Lwia;")
    public static class791 field5284;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "Lwia;")
    public static class791 field5285;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "Ljava/awt/Frame;")
    public static Frame field5278;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z)V", line = 5)
    public static void method2381(boolean arg0) {
        field5287 = null;
        if (!arg0) {
            field5278 = null;
        }
        field5285 = null;
        field5284 = null;
        field5292 = null;
        field5278 = null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IB)Lcl;", line = 20)
    public final class278 method2382(int arg0, byte arg1) {
        field5283++;
        class652 var3 = this.field5288;
        class278 var4;
        synchronized (this.field5288) {
            var4 = (class278) this.field5288.method3742((byte) 67, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class791 var5 = this.field5279;
        byte[] var6;
        synchronized (this.field5279) {
            var6 = this.field5279.method4339(class205.method1428((byte) 121, arg0), 0, class735.method4099(false, arg0));
        }
        class278 var7 = new class278();
        var7.field4051 = this;
        var7.field4045 = arg0;
        if (var6 != null) {
            var7.method1816(-13079, new class494(var6));
        }
        class652 var8 = this.field5288;
        synchronized (this.field5288) {
            this.field5288.method3739((long) arg0, (byte) 124, var7);
        }
        if (arg1 >= -75) {
            method2384(6, -120, -111, 81, 48);
        }
        return var7;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V", line = 59)
    public final void method2383(byte arg0) {
        class652 var2 = this.field5288;
        synchronized (this.field5288) {
            if (arg0 <= 50) {
                this.field5291 = -14;
            }
            this.field5288.method3743(8);
        }
        field5281++;
        class652 var3 = this.field5289;
        synchronized (this.field5289) {
            this.field5289.method3743(8);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIII)V", line = 76)
    public static final void method2384(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class734.field10153 = arg0;
        class407.field5535 = arg4;
        field5293++;
        class463.field6533 = arg1;
        if (arg3 != -11197) {
            field5284 = null;
        }
        class618.field8645 = arg2;
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Ldt;ILwia;Lwia;)V", line = 139)
    public class384(class252 arg0, int arg1, class791 arg2, class791 arg3) {
        this.field5279 = arg2;
        this.field5280 = arg3;
        int var5 = this.field5279.method4332((byte) -47) - 1;
        this.field5279.method4353(var5, true);
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(Z)V", line = 98)
    public final void method2385(boolean arg0) {
        field5282++;
        if (arg0) {
            this.field5288 = null;
        }
        class652 var2 = this.field5288;
        synchronized (this.field5288) {
            this.field5288.method3735(2);
        }
        class652 var3 = this.field5289;
        synchronized (this.field5289) {
            this.field5289.method3735(2);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)V", line = 122)
    public final void method2386(int arg0, int arg1) {
        if (arg1 != 32765) {
            return;
        }
        field5286++;
        this.field5291 = arg0;
        class652 var3 = this.field5289;
        synchronized (this.field5289) {
            this.field5289.method3735(2);
        }
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(II)V", line = 158)
    public final void method2387(int arg0, int arg1) {
        field5290++;
        if (arg1 != 64) {
            return;
        }
        class652 var3 = this.field5288;
        synchronized (this.field5288) {
            this.field5288.method3741(arg0, 0);
        }
        class652 var4 = this.field5289;
        synchronized (this.field5289) {
            this.field5289.method3741(arg0, 0);
        }
    }
}
