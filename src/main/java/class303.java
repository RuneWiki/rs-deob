import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class303 {

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "Lfj;")
    public class242 field5146 = new class242();

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "[I")
    public static int[] field5145 = new int[2];

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "[I")
    public static int[] field5151 = new int[5];

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "Ljf;")
    public static class229 field5143 = null;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static int field5150 = 0;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public static int field5153 = 0;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "Z")
    public static boolean field5159 = false;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "Lek;")
    public static class185 field5149;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "Lfj;")
    private class242 field5158;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)V", line = 9)
    public final void method2073(boolean arg0) {
        field5148++;
        if (!arg0) {
            return;
        }
        while (true) {
            class242 var2 = this.field5146.field4273;
            if (this.field5146 == var2) {
                this.field5158 = null;
                return;
            }
            var2.method1747((byte) -40);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lfj;B)V", line = 32)
    public final void method2074(class242 arg0, byte arg1) {
        if (arg0.field4264 != null) {
            arg0.method1747((byte) -107);
        }
        arg0.field4264 = this.field5146;
        field5144++;
        arg0.field4273 = this.field5146.field4273;
        arg0.field4264.field4273 = arg0;
        if (arg1 < 32) {
            this.method2077(99);
        }
        arg0.field4273.field4264 = arg0;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V", line = 51)
    public static void method2075(byte arg0) {
        if (arg0 < -83) {
            field5145 = null;
            field5151 = null;
            field5143 = null;
            field5149 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)Lfj;", line = 68)
    public final class242 method2076(byte arg0) {
        class242 var2 = this.field5146.field4273;
        field5157++;
        if (arg0 >= -91) {
            field5143 = (class229) null;
        }
        if (this.field5146 == var2) {
            return null;
        } else {
            var2.method1747((byte) -36);
            return var2;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)Lfj;", line = 93)
    public final class242 method2077(int arg0) {
        field5152++;
        if (arg0 != -25670) {
            this.method2078(-53);
        }
        class242 var2 = this.field5146.field4264;
        if (this.field5146 == var2) {
            this.field5158 = null;
            return null;
        } else {
            this.field5158 = var2.field4264;
            return var2;
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)Lfj;", line = 136)
    public final class242 method2078(int arg0) {
        field5147++;
        class242 var2 = this.field5146.field4273;
        if (this.field5146 == var2) {
            this.field5158 = null;
            return null;
        }
        this.field5158 = var2.field4273;
        if (arg0 >= -91) {
            this.field5146 = (class242) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lfj;I)V", line = 160)
    public final void method2079(class242 arg0, int arg1) {
        if (arg0.field4264 != null) {
            arg0.method1747((byte) -79);
        }
        arg0.field4273 = this.field5146;
        field5156++;
        arg0.field4264 = this.field5146.field4264;
        if (arg1 < 31) {
            method2075((byte) 32);
        }
        arg0.field4264.field4273 = arg0;
        arg0.field4273.field4264 = arg0;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V", line = 212)
    public class303() {
        this.field5146.field4264 = this.field5146;
        this.field5146.field4273 = this.field5146;
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)Lfj;", line = 194)
    public final class242 method2080(int arg0) {
        field5154++;
        class242 var2 = this.field5158;
        if (this.field5146 == var2) {
            this.field5158 = null;
            return null;
        }
        if (arg0 != 5) {
            this.method2077(118);
        }
        this.field5158 = var2.field4273;
        return var2;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(Z)Lfj;", line = 228)
    public final class242 method2081(boolean arg0) {
        if (!arg0) {
            this.method2073(true);
        }
        class242 var2 = this.field5158;
        field5155++;
        if (this.field5146 == var2) {
            this.field5158 = null;
            return null;
        } else {
            this.field5158 = var2.field4264;
            return var2;
        }
    }
}
