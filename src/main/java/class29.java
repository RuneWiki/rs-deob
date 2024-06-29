import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class29 {

    @OriginalMember(owner = "client!o", name = "i", descriptor = "Lpha;")
    private class166 field232 = new class166();

    @OriginalMember(owner = "client!o", name = "f", descriptor = "[I")
    public static int[] field229 = new int[14];

    @OriginalMember(owner = "client!o", name = "c", descriptor = "Lvea;")
    public static class276 field226 = new class276(12, 0, 1, 0);

    @OriginalMember(owner = "client!o", name = "o", descriptor = "I")
    public static int field238 = 100;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "Lpha;")
    private class166 field236;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "Lnp;")
    public static class491 field237;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "Ljava/lang/String;")
    public static String field239;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V", line = 4)
    public final void method112(int arg0) {
        int var2 = 72 / ((-arg0 - 43) / 56);
        field235++;
        while (true) {
            class166 var3 = this.field232.field2080;
            if (this.field232 == var3) {
                this.field236 = null;
                return;
            }
            var3.method975((byte) -2);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)Lpha;", line = 25)
    public final class166 method113(byte arg0) {
        field224++;
        if (arg0 != 15) {
            field226 = null;
        }
        class166 var2 = this.field232.field2080;
        if (this.field232 == var2) {
            this.field236 = null;
            return null;
        } else {
            this.field236 = var2.field2080;
            return var2;
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V", line = 47)
    public static void method114(byte arg0) {
        field239 = null;
        field226 = null;
        field237 = null;
        field229 = null;
        int var1 = 32 / ((74 - arg0) / 33);
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(B)Lpha;", line = 59)
    public final class166 method115(byte arg0) {
        if (arg0 != -72) {
            field237 = null;
        }
        field227++;
        class166 var2 = this.field232.field2080;
        if (this.field232 == var2) {
            return null;
        } else {
            var2.method975((byte) -63);
            return var2;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIZ)V", line = 77)
    public static final void method116(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method116(-21, -126, true);
        }
        field228++;
        class252 var3 = class150.method916(arg0, -104, 5);
        var3.method1502((byte) -103);
        var3.field3251 = arg1;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III)V", line = 99)
    public static final void method117(int arg0, int arg1, int arg2) {
        class624 var3 = class77.field947[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class440.method2487(var3.field8738);
        class440.method2487(var3.field8730);
        if (var3.field8738 != null) {
            var3.field8738 = null;
        }
        if (var3.field8730 != null) {
            var3.field8730 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZLpha;)V", line = 120)
    public final void method118(boolean arg0, class166 arg1) {
        if (!arg0) {
            this.method121(119);
        }
        if (arg1.field2079 != null) {
            arg1.method975((byte) 127);
        }
        field234++;
        arg1.field2079 = this.field232.field2079;
        arg1.field2080 = this.field232;
        arg1.field2079.field2080 = arg1;
        arg1.field2080.field2079 = arg1;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V", line = 226)
    public class29() {
        this.field232.field2080 = this.field232;
        this.field232.field2079 = this.field232;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)Lpha;", line = 142)
    public final class166 method119(boolean arg0) {
        field233++;
        class166 var2 = this.field236;
        if (this.field232 == var2) {
            this.field236 = null;
            return null;
        } else if (arg0) {
            return null;
        } else {
            this.field236 = var2.field2080;
            return var2;
        }
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(B)Lpha;", line = 162)
    public final class166 method120(byte arg0) {
        field225++;
        class166 var2 = this.field232.field2079;
        if (arg0 > -33) {
            field239 = null;
        }
        if (this.field232 == var2) {
            this.field236 = null;
            return null;
        } else {
            this.field236 = var2.field2079;
            return var2;
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)I", line = 187)
    public final int method121(int arg0) {
        field231++;
        if (arg0 != 15) {
            method114((byte) -5);
        }
        int var2 = 0;
        class166 var3 = this.field232.field2080;
        while (this.field232 != var3) {
            var3 = var3.field2080;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(Z)Z", line = 208)
    public final boolean method122(boolean arg0) {
        if (!arg0) {
            field239 = null;
        }
        field230++;
        return this.field232.field2080 == this.field232;
    }
}
