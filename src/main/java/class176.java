import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class176 {

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field3083 = 0;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "Leb;")
    public static class230 field3092 = class68.method589(0, ")1o");

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "S")
    public static short field3094 = 320;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "Leb;")
    public static class230 field3098 = class68.method589(0, "Texturen geladen)3");

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public int field3088;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public int field3089;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public int field3091;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public int field3095;

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "J")
    public long field3097;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "Lhj;")
    public class70 field3086;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "Lhj;")
    public class70 field3087;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "Lhj;")
    public class70 field3096;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "[[[Lqf;")
    public static class233[][][] field3090;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public static final void method1282(int arg0) {
        field3085++;
        class178.field3120.method1122(10);
        if (arg0 != 320) {
            method1283(-28, -45, 90);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)J")
    public static final long method1283(int arg0, int arg1, int arg2) {
        class233 var3 = class53.field916[arg0][arg1][arg2];
        return var3 == null || var3.field4056 == null ? 0L : var3.field4056.field1942;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
    public static void method1284(int arg0) {
        field3090 = null;
        if (arg0 >= -41) {
            field3099 = -15;
        }
        field3098 = null;
        field3092 = null;
    }
}
