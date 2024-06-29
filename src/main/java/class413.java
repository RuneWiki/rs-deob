import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class413 {

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "Lsu;")
    public class219 field5842 = new class219();

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "[I")
    public static int[] field5835 = new int[14];

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "[C")
    public static char[] field5839 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field5834;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field5836;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field5838;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field5840;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field5841;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    public static int field5843;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "Ld;")
    public static class159 field5837;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "Lsu;")
    private class219 field5844;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lsu;I)V", line = 3)
    public final void method2475(class219 arg0, int arg1) {
        field5841++;
        if (arg0.field3125 != null) {
            arg0.method1512(false);
        }
        if (arg1 != -19680) {
            this.method2480(-90);
        }
        arg0.field3126 = this.field5842;
        arg0.field3125 = this.field5842.field3125;
        arg0.field3125.field3126 = arg0;
        arg0.field3126.field3125 = arg0;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)Lsu;", line = 21)
    public final class219 method2476(byte arg0) {
        field5840++;
        if (arg0 != 18) {
            return null;
        }
        class219 var2 = this.field5844;
        if (this.field5842 == var2) {
            this.field5844 = null;
            return null;
        } else {
            this.field5844 = var2.field3126;
            return var2;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V", line = 46)
    public final void method2477(boolean arg0) {
        field5836++;
        while (true) {
            class219 var2 = this.field5842.field3126;
            if (this.field5842 == var2) {
                this.field5844 = null;
                if (arg0) {
                    return;
                } else {
                    field5839 = null;
                    return;
                }
            }
            var2.method1512(false);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V", line = 67)
    public static void method2478(int arg0) {
        field5835 = null;
        if (arg0 != 8212) {
            method2478(-65);
        }
        field5839 = null;
        field5837 = null;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(Z)I", line = 82)
    public final int method2479(boolean arg0) {
        field5834++;
        int var2 = 0;
        class219 var3 = this.field5842.field3126;
        while (this.field5842 != var3) {
            var3 = var3.field3126;
            var2++;
        }
        if (!arg0) {
            this.method2481((byte) 70);
        }
        return var2;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)Lsu;", line = 115)
    public final class219 method2480(int arg0) {
        field5838++;
        class219 var2 = this.field5842.field3126;
        if (arg0 != 381) {
            field5839 = null;
        }
        if (this.field5842 == var2) {
            this.field5844 = null;
            return null;
        } else {
            this.field5844 = var2.field3126;
            return var2;
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)Lsu;", line = 147)
    public final class219 method2481(byte arg0) {
        field5843++;
        class219 var2 = this.field5842.field3126;
        if (this.field5842 == var2) {
            return null;
        }
        if (arg0 <= 61) {
            this.field5842 = null;
        }
        var2.method1512(false);
        return var2;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V", line = 168)
    public class413() {
        this.field5842.field3125 = this.field5842;
        this.field5842.field3126 = this.field5842;
    }
}
