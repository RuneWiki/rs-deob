import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class7 {

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "Llm;")
    private class45 field100 = new class45();

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "[I")
    public static int[] field99 = new int[128];

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "Lac;")
    public static class153 field98 = new class153(16);

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "Ljava/lang/String;")
    public static String field102 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "Llm;")
    private class45 field101;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)Llm;")
    public final class45 method37(int arg0) {
        if (arg0 < 45) {
            this.field101 = null;
        }
        field96++;
        class45 var2 = this.field100.field546;
        if (this.field100 == var2) {
            this.field101 = null;
            return null;
        } else {
            this.field101 = var2.field546;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)I")
    public final int method38(byte arg0) {
        field93++;
        int var2 = 0;
        class45 var3 = this.field100.field546;
        if (arg0 != 46) {
            this.method38((byte) 112);
        }
        while (this.field100 != var3) {
            var2++;
            var3 = var3.field546;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Llm;Z)V")
    public final void method39(class45 arg0, boolean arg1) {
        if (arg0.field537 != null) {
            arg0.method252(93);
        }
        arg0.field537 = this.field100.field537;
        arg0.field546 = this.field100;
        arg0.field537.field546 = arg0;
        field95++;
        if (!arg1) {
            arg0.field546.field537 = arg0;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V")
    public static void method40(byte arg0) {
        field98 = null;
        field102 = null;
        if (arg0 != 94) {
            field102 = null;
        }
        field99 = null;
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(B)V")
    public static final void method41(byte arg0) {
        field92++;
        class295.field4722.method1511((byte) 97);
        if (arg0 <= 107) {
            method43(127, -18L);
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)Llm;")
    public final class45 method42(int arg0) {
        class45 var2 = this.field101;
        field94++;
        if (arg0 != 0) {
            return null;
        } else if (this.field100 == var2) {
            this.field101 = null;
            return null;
        } else {
            this.field101 = var2.field546;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
    public class7() {
        this.field100.field546 = this.field100;
        this.field100.field537 = this.field100;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IJ)V")
    public static final void method43(int arg0, long arg1) {
        field97++;
        if (arg1 <= 0L || arg0 >= -54) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class291.method1978(true, arg1 - 1L);
            class291.method1978(true, 1L);
        } else {
            class291.method1978(true, arg1);
        }
    }
}
