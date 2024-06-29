import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class513 {

    @OriginalMember(owner = "client!cba", name = "f", descriptor = "Lcm;")
    private class678 field7241 = new class678();

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "I")
    public static int field7236;

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "I")
    public static int field7237;

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "I")
    public static int field7238;

    @OriginalMember(owner = "client!cba", name = "h", descriptor = "I")
    public static int field7243;

    @OriginalMember(owner = "client!cba", name = "i", descriptor = "I")
    public static int field7244;

    @OriginalMember(owner = "client!cba", name = "k", descriptor = "I")
    public static int field7246;

    @OriginalMember(owner = "client!cba", name = "l", descriptor = "I")
    public static int field7247;

    @OriginalMember(owner = "client!cba", name = "m", descriptor = "I")
    public static int field7248;

    @OriginalMember(owner = "client!cba", name = "n", descriptor = "I")
    public static int field7249;

    @OriginalMember(owner = "client!cba", name = "e", descriptor = "Lfa;")
    public static class214 field7240;

    @OriginalMember(owner = "client!cba", name = "g", descriptor = "Ldh;")
    public static class295 field7242;

    @OriginalMember(owner = "client!cba", name = "j", descriptor = "Lcm;")
    private class678 field7245;

    @OriginalMember(owner = "client!cba", name = "d", descriptor = "[Lf;")
    public static class702[] field7239;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)V")
    public final void method3021(int arg0) {
        while (true) {
            class678 var2 = this.field7241.field9624;
            if (this.field7241 == var2) {
                field7244++;
                this.field7245 = null;
                if (arg0 != -28912) {
                    field7240 = null;
                    return;
                }
                return;
            }
            var2.method3813(arg0 ^ 0xFFFF8F55);
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lcm;I)V")
    public final void method3022(class678 arg0, int arg1) {
        field7243++;
        if (arg0.field9625 != null) {
            arg0.method3813(arg1 ^ 0xFFFFFF9D);
        }
        arg0.field9624 = this.field7241.field9624;
        if (arg1 != 0) {
            field7237 = 105;
        }
        arg0.field9625 = this.field7241;
        arg0.field9625.field9624 = arg0;
        arg0.field9624.field9625 = arg0;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(BLcm;)V")
    public final void method3023(byte arg0, class678 arg1) {
        if (arg1.field9625 != null) {
            arg1.method3813(102);
        }
        field7236++;
        if (arg0 < 38) {
            this.field7241 = null;
        }
        arg1.field9625 = this.field7241.field9625;
        arg1.field9624 = this.field7241;
        arg1.field9625.field9624 = arg1;
        arg1.field9624.field9625 = arg1;
    }

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)Lcm;")
    public final class678 method3024(int arg0) {
        field7246++;
        class678 var2 = this.field7241.field9624;
        if (this.field7241 == var2) {
            this.field7245 = null;
            return null;
        }
        this.field7245 = var2.field9624;
        if (arg0 != 5572) {
            this.method3022(null, 16);
        }
        return var2;
    }

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "(I)I")
    public final int method3025(int arg0) {
        field7248++;
        int var2 = arg0;
        for (class678 var3 = this.field7241.field9624; var3 != this.field7241; var3 = var3.field9624) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cba", name = "d", descriptor = "(I)Lcm;")
    public final class678 method3026(int arg0) {
        field7238++;
        if (arg0 != 0) {
            return null;
        }
        class678 var2 = this.field7245;
        if (this.field7241 == var2) {
            this.field7245 = null;
            return null;
        } else {
            this.field7245 = var2.field9624;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cba", name = "e", descriptor = "(I)Lcm;")
    public final class678 method3027(int arg0) {
        field7249++;
        if (arg0 != 0) {
            return null;
        }
        class678 var2 = this.field7241.field9624;
        if (this.field7241 == var2) {
            return null;
        } else {
            var2.method3813(arg0 ^ 0xFFFFFFA4);
            return var2;
        }
    }

    @OriginalMember(owner = "client!cba", name = "<init>", descriptor = "()V")
    public class513() {
        this.field7241.field9625 = this.field7241;
        this.field7241.field9624 = this.field7241;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(B)Lcm;")
    public final class678 method3028(byte arg0) {
        field7247++;
        class678 var2 = this.field7241.field9625;
        if (this.field7241 == var2) {
            return null;
        } else {
            var2.method3813(-94);
            return arg0 < 56 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(Z)V")
    public static void method3029(boolean arg0) {
        field7239 = null;
        if (!arg0) {
            field7242 = null;
        }
        field7240 = null;
        field7242 = null;
    }
}
