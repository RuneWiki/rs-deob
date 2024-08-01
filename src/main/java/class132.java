import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ob")
public class class132 {

    @OriginalMember(owner = "ob", name = "m", descriptor = "B")
    private byte field2553;

    @OriginalMember(owner = "ob", name = "g", descriptor = "I")
    public int field2547;

    @OriginalMember(owner = "ob", name = "l", descriptor = "I")
    public int field2552;

    @OriginalMember(owner = "ob", name = "p", descriptor = "I")
    public int field2556;

    @OriginalMember(owner = "ob", name = "i", descriptor = "I")
    public int field2549;

    @OriginalMember(owner = "ob", name = "k", descriptor = "I")
    public int field2551;

    @OriginalMember(owner = "ob", name = "j", descriptor = "Llf;")
    public static class109 field2550 = class35.method275("Null", 2);

    @OriginalMember(owner = "ob", name = "f", descriptor = "Llf;")
    public static class109 field2546 = class35.method275("title)3jpg", 2);

    @OriginalMember(owner = "ob", name = "e", descriptor = "[Lmh;")
    public static class120[] field2545 = new class120[50];

    @OriginalMember(owner = "ob", name = "b", descriptor = "Lrc;")
    public static class160 field2542 = new class160(64);

    @OriginalMember(owner = "ob", name = "a", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "ob", name = "c", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "ob", name = "d", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "ob", name = "h", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "ob", name = "o", descriptor = "Loh;")
    public static class138 field2555;

    @OriginalMember(owner = "ob", name = "n", descriptor = "Lda;")
    public static class32 field2554;

    @OriginalMember(owner = "ob", name = "a", descriptor = "(I)I")
    public final int method943(int arg0) {
        if (arg0 != 7) {
            method945(32, 110, 52);
        }
        field2543++;
        return this.field2553 & 0x7;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Z)I")
    public final int method944(boolean arg0) {
        field2544++;
        if (!arg0) {
            this.method943(71);
        }
        return (this.field2553 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(III)V")
    public static final void method945(int arg0, int arg1, int arg2) {
        class128.field2485 = true;
        class5.field72 = arg0;
        class34.field776 = arg1;
        class177.field3345 = arg2;
        class9.field142 = -1;
        client.field662 = -1;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(B)V")
    public static void method946(byte arg0) {
        field2554 = null;
        field2545 = null;
        int var1 = -18 / ((arg0 - 61) / 44);
        field2550 = null;
        field2555 = null;
        field2542 = null;
        field2546 = null;
    }

    @OriginalMember(owner = "ob", name = "<init>", descriptor = "()V")
    public class132() {
    }

    @OriginalMember(owner = "ob", name = "<init>", descriptor = "(Lja;)V")
    public class132(class86 arg0) {
        this.field2553 = arg0.method584(3);
        this.field2547 = arg0.method569(true);
        this.field2552 = arg0.method582(15);
        this.field2556 = arg0.method582(15);
        this.field2549 = arg0.method582(15);
        this.field2551 = arg0.method582(15);
    }
}
