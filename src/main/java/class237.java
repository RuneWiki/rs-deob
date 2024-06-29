import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class237 {

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "Lbm;")
    private class130 field3996 = new class130();

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field3995 = 0;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field4004 = 0;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "[Lcd;")
    public static class64[] field4002 = new class64[100];

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "Lcd;")
    public static class64 field4007 = class44.method335((byte) 71, "Hierhin gehen");

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "Lbm;")
    private class130 field4000;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZIIIZ)V", line = 5)
    public static final void method1692(boolean arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class211.method1482(0, arg2 - 101, class297.field5122.length + -1, arg1, arg0, arg3, arg4);
        if (arg2 != 100) {
            field4007 = (class64) null;
        }
        field3999++;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)Lbm;", line = 16)
    public final class130 method1693(int arg0) {
        field4001++;
        class130 var2 = this.field4000;
        if (this.field3996 == var2) {
            this.field4000 = null;
            return null;
        } else {
            int var3 = -37 / ((arg0 + 84) / 39);
            this.field4000 = var2.field2314;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lbm;I)V", line = 38)
    public final void method1694(class130 arg0, int arg1) {
        if (arg0.field2313 != null) {
            arg0.method938(0);
        }
        arg0.field2313 = this.field3996.field2313;
        arg0.field2314 = this.field3996;
        arg0.field2313.field2314 = arg0;
        field4003++;
        if (arg1 != 0) {
            this.method1693(33);
        }
        arg0.field2314.field2313 = arg0;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V", line = 197)
    public class237() {
        this.field3996.field2314 = this.field3996;
        this.field3996.field2313 = this.field3996;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)I", line = 64)
    public final int method1695(byte arg0) {
        if (arg0 >= -13) {
            return -5;
        }
        field3997++;
        int var2 = 0;
        class130 var3 = this.field3996.field2314;
        while (this.field3996 != var3) {
            var3 = var3.field2314;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V", line = 106)
    public final void method1696(int arg0) {
        field4005++;
        while (true) {
            class130 var2 = this.field3996.field2314;
            if (this.field3996 == var2) {
                this.field4000 = null;
                if (arg0 != 26846) {
                    this.field4000 = (class130) null;
                }
                return;
            }
            var2.method938(0);
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)Lbm;", line = 139)
    public final class130 method1697(int arg0) {
        if (arg0 < 51) {
            this.method1696(50);
        }
        field4006++;
        class130 var2 = this.field3996.field2314;
        if (this.field3996 == var2) {
            return null;
        } else {
            var2.method938(0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)Lbm;", line = 157)
    public final class130 method1698(byte arg0) {
        class130 var2 = this.field3996.field2314;
        if (arg0 >= -89) {
            method1692(false, 81, -42, -41, true);
        }
        field3994++;
        if (this.field3996 == var2) {
            this.field4000 = null;
            return null;
        } else {
            this.field4000 = var2.field2314;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(B)V", line = 178)
    public static void method1699(byte arg0) {
        field4007 = null;
        field4002 = null;
        if (arg0 != -69) {
            field4007 = (class64) null;
        }
    }
}
