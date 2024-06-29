import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class188 {

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "J")
    public static long field3250 = 0L;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field3252 = 0;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "Lia;")
    public static class257 field3253 = class28.method234(115, ")1j");

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "Lia;")
    public static class257 field3248 = class28.method234(-29, "<col=ffffff>");

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)V")
    public static final void method1268(int arg0, int arg1) {
        field3249++;
        class177.method1191(124);
        class53.method412((byte) 127);
        int var2 = class250.method1638(false, arg1).field430;
        if (var2 == 0) {
            return;
        }
        int var3 = class117.field2100[arg1];
        if (~var2 == arg0) {
            class21.field441 = var3;
        }
        if (var2 == 5) {
            class227.field3821 = var3;
        }
        if (var2 == 6) {
            class229.field3849 = var3;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V")
    public static void method1269(boolean arg0) {
        if (!arg0) {
            method1270(8, (class178) null, (class178) null);
        }
        field3253 = null;
        field3248 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILmb;Lmb;)V")
    public static final void method1270(int arg0, class178 arg1, class178 arg2) {
        if (arg0 >= 88) {
            class151.field2605 = arg1;
            field3251++;
            class69.field1371 = arg2;
        }
    }
}
