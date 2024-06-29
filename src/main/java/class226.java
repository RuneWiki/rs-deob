import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class226 extends class287 {

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
    public int field3644;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
    public int field3643;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
    public int field3646;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
    public int field3641;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "Ltl;")
    public static class59 field3639 = class85.method639("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100", 9588);

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
    public static int field3647 = 2;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "Ltl;")
    public static class59 field3645 = class85.method639("b12_full", 9588);

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)V", line = 4)
    public static final void method1553(int arg0, int arg1) {
        field3648++;
        class297.field5088.method1486(false, arg1);
        if (arg0 != 0) {
            method1556(-101);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)Z", line = 22)
    public final boolean method1554(int arg0, int arg1, int arg2) {
        if (arg1 == -6181) {
            field3642++;
            return arg0 >= this.field3641 && this.field3646 >= arg0 && arg2 >= this.field3643 && arg2 <= this.field3644;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(III)Ljb;", line = 46)
    public static final class296 method1555(int arg0, int arg1, int arg2) {
        class245 var3 = class120.field2010[arg0][arg1][arg2];
        return var3 == null || var3.field4085 == null ? null : var3.field4085;
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)V", line = 59)
    public static void method1556(int arg0) {
        field3639 = null;
        if (arg0 == 3062) {
            field3645 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "(I)V", line = 71)
    public static final void method1557(int arg0) {
        int var1 = (class286.field4920.field1774 >> 7) + class197.field3249;
        class255.field4239 = 0;
        if (arg0 >= -108) {
            return;
        }
        field3638++;
        int var2 = (class286.field4920.field1769 >> 7) + class187.field3135;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class255.field4239 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class255.field4239 = 1;
        }
        if (class255.field4239 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class255.field4239 = 0;
        }
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(IIII)V", line = 107)
    public class226(int arg0, int arg1, int arg2, int arg3) {
        this.field3644 = arg3;
        this.field3643 = arg1;
        this.field3646 = arg2;
        this.field3641 = arg0;
    }
}
