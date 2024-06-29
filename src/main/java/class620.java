import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class620 {

    @OriginalMember(owner = "client!rda", name = "n", descriptor = "Ldaa;")
    private class11 field8230 = new class11();

    @OriginalMember(owner = "client!rda", name = "m", descriptor = "Lob;")
    public static class691 field8229 = new class691();

    @OriginalMember(owner = "client!rda", name = "g", descriptor = "F")
    public static float field8223;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "I")
    public static int field8217;

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "I")
    public static int field8218;

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "I")
    public static int field8219;

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "I")
    public static int field8220;

    @OriginalMember(owner = "client!rda", name = "e", descriptor = "I")
    public static int field8221;

    @OriginalMember(owner = "client!rda", name = "f", descriptor = "I")
    public static int field8222;

    @OriginalMember(owner = "client!rda", name = "h", descriptor = "I")
    public static int field8224;

    @OriginalMember(owner = "client!rda", name = "i", descriptor = "I")
    public static int field8225;

    @OriginalMember(owner = "client!rda", name = "j", descriptor = "I")
    public static int field8226;

    @OriginalMember(owner = "client!rda", name = "k", descriptor = "I")
    public static int field8227;

    @OriginalMember(owner = "client!rda", name = "l", descriptor = "I")
    public static int field8228;

    @OriginalMember(owner = "client!rda", name = "o", descriptor = "Ldaa;")
    private class11 field8231;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(B)Ldaa;")
    public final class11 method3390(byte arg0) {
        if (arg0 < 70) {
            return null;
        }
        field8217++;
        class11 var2 = this.field8230.field211;
        if (this.field8230 == var2) {
            this.field8231 = null;
            return null;
        } else {
            this.field8231 = var2.field211;
            return var2;
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ldaa;Z)V")
    public final void method3391(class11 arg0, boolean arg1) {
        if (arg0.field208 != null) {
            arg0.method131(122);
        }
        field8218++;
        arg0.field211 = this.field8230.field211;
        arg0.field208 = this.field8230;
        if (!arg1) {
            arg0.field208.field211 = arg0;
            arg0.field211.field208 = arg0;
        }
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(B)Ldaa;")
    public final class11 method3392(byte arg0) {
        field8221++;
        class11 var2 = this.field8230.field211;
        if (arg0 <= 44) {
            return null;
        } else if (this.field8230 == var2) {
            return null;
        } else {
            var2.method131(127);
            return var2;
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Z)I")
    public final int method3393(boolean arg0) {
        field8227++;
        int var2 = 0;
        if (arg0) {
            this.method3391(null, true);
        }
        for (class11 var3 = this.field8230.field211; var3 != this.field8230; var3 = var3.field211) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "(B)V")
    public static final void method3394(byte arg0) {
        field8225++;
        class116.field1988++;
        class402 var1 = class390.method2252(class528.field7037, -82, class262.field3644);
        var1.field5354.method1980(-345277664, class662.method3719(-1));
        if (arg0 <= 33) {
            field8229 = null;
        }
        var1.field5354.method2031((byte) 54, class627.field8461);
        var1.field5354.method2031((byte) 54, class149.field2387);
        var1.field5354.method1980(-345277664, class344.field4718.field5449);
        class36.method278(0, var1);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(I)V")
    public static void method3395(int arg0) {
        if (arg0 >= -95) {
            field8229 = null;
        }
        field8229 = null;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ldaa;I)V")
    public final void method3396(class11 arg0, int arg1) {
        if (arg1 != -1) {
            this.field8230 = null;
        }
        if (arg0.field208 != null) {
            arg0.method131(121);
        }
        field8220++;
        arg0.field211 = this.field8230;
        arg0.field208 = this.field8230.field208;
        arg0.field208.field211 = arg0;
        arg0.field211.field208 = arg0;
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(Z)Lo;")
    public static final class28 method3397(boolean arg0) {
        if (arg0) {
            field8223 = 2.0354624F;
        }
        field8226++;
        return class567.field7494;
    }

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "(Z)V")
    public final void method3398(boolean arg0) {
        if (arg0) {
            this.field8231 = null;
        }
        field8224++;
        while (true) {
            class11 var2 = this.field8230.field211;
            if (this.field8230 == var2) {
                this.field8231 = null;
                return;
            }
            var2.method131(125);
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(BII)Z")
    public static final boolean method3399(byte arg0, int arg1, int arg2) {
        field8228++;
        if (arg0 != 75) {
            field8223 = 1.5288004F;
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "(B)Ldaa;")
    public final class11 method3400(byte arg0) {
        field8219++;
        int var2 = 65 / ((-arg0 - 5) / 44);
        class11 var3 = this.field8230.field208;
        if (this.field8230 == var3) {
            return null;
        } else {
            var3.method131(126);
            return var3;
        }
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(I)Ldaa;")
    public final class11 method3401(int arg0) {
        field8222++;
        class11 var2 = this.field8231;
        if (this.field8230 == var2) {
            this.field8231 = null;
            return null;
        } else if (arg0 == -10265) {
            this.field8231 = var2.field211;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rda", name = "<init>", descriptor = "()V")
    public class620() {
        this.field8230.field208 = this.field8230;
        this.field8230.field211 = this.field8230;
    }
}
