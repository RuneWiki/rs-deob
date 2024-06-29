import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class591 {

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "Lwg;")
    public class389 field8273 = new class389();

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "Ldg;")
    public static class376 field8274 = new class376(65, -1);

    @OriginalMember(owner = "client!wda", name = "d", descriptor = "Lnea;")
    public static class664 field8276 = new class664(38, 2);

    @OriginalMember(owner = "client!wda", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field8280 = new String[100];

    @OriginalMember(owner = "client!wda", name = "k", descriptor = "I")
    public static int field8283 = -1;

    @OriginalMember(owner = "client!wda", name = "j", descriptor = "Lmf;")
    public static class382 field8282 = new class382(8);

    @OriginalMember(owner = "client!wda", name = "c", descriptor = "I")
    public static int field8275;

    @OriginalMember(owner = "client!wda", name = "e", descriptor = "I")
    public static int field8277;

    @OriginalMember(owner = "client!wda", name = "f", descriptor = "I")
    public static int field8278;

    @OriginalMember(owner = "client!wda", name = "g", descriptor = "I")
    public static int field8279;

    @OriginalMember(owner = "client!wda", name = "m", descriptor = "I")
    public static int field8285;

    @OriginalMember(owner = "client!wda", name = "l", descriptor = "Lwg;")
    private class389 field8284;

    @OriginalMember(owner = "client!wda", name = "i", descriptor = "[Z")
    public static boolean[] field8281;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Z)V")
    public static void method3340(boolean arg0) {
        field8274 = null;
        if (!arg0) {
            method3340(false);
        }
        field8282 = null;
        field8280 = null;
        field8276 = null;
        field8281 = null;
    }

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(Z)Lwg;")
    public final class389 method3341(boolean arg0) {
        field8285++;
        class389 var2 = this.field8273.field5773;
        if (arg0) {
            this.method3343(null, -78);
        }
        if (this.field8273 == var2) {
            this.field8284 = null;
            return null;
        } else {
            this.field8284 = var2.field5773;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(I)Lwg;")
    public final class389 method3342(int arg0) {
        if (arg0 < 45) {
            field8282 = null;
        }
        field8278++;
        class389 var2 = this.field8284;
        if (this.field8273 == var2) {
            this.field8284 = null;
            return null;
        } else {
            this.field8284 = var2.field5773;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lwg;I)V")
    public final void method3343(class389 arg0, int arg1) {
        field8275++;
        if (arg0.field5770 != null) {
            arg0.method2396(1000);
        }
        arg0.field5773 = this.field8273;
        arg0.field5770 = this.field8273.field5770;
        arg0.field5770.field5773 = arg0;
        if (arg1 != 38) {
            field8281 = null;
        }
        arg0.field5773.field5770 = arg0;
    }

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(I)V")
    public final void method3344(int arg0) {
        while (true) {
            class389 var2 = this.field8273.field5773;
            if (this.field8273 == var2) {
                field8279++;
                this.field8284 = null;
                if (arg0 != -27732) {
                    field8276 = null;
                    return;
                }
                return;
            }
            var2.method2396(1000);
        }
    }

    @OriginalMember(owner = "client!wda", name = "c", descriptor = "(Z)I")
    public final int method3345(boolean arg0) {
        field8277++;
        int var2 = 0;
        class389 var3 = this.field8273.field5773;
        if (!arg0) {
            return -54;
        }
        while (this.field8273 != var3) {
            var3 = var3.field5773;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wda", name = "<init>", descriptor = "()V")
    public class591() {
        this.field8273.field5770 = this.field8273;
        this.field8273.field5773 = this.field8273;
    }
}
