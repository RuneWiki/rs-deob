import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class770 extends class766 {

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "I")
    public int field10634 = -1;

    @OriginalMember(owner = "client!jg", name = "w", descriptor = "Z")
    public boolean field10635 = false;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "Z")
    public static boolean field10631 = false;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "Lvb;")
    public static class396 field10630 = new class396(14, 8);

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
    public int field10626;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public static int field10627;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "I")
    public int field10628;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
    public int field10629;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "I")
    public static int field10632;

    @OriginalMember(owner = "client!jg", name = "x", descriptor = "I")
    public int field10636;

    @OriginalMember(owner = "client!jg", name = "y", descriptor = "I")
    public int field10637;

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "[I")
    public static int[] field10633;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
    public static void method4258(byte arg0) {
        field10630 = null;
        field10633 = null;
        if (arg0 != 105) {
            method4258((byte) 17);
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)V")
    public static final void method4259(byte arg0) {
        field10632++;
        class624.field8861 = 0;
        int var1 = (class719.field10041.field10347 >> 9) + class222.field3266;
        int var2 = (class719.field10041.field10350 >> 9) + class697.field9798;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class624.field8861 = 1;
        }
        if (arg0 != 10) {
            field10627 = -36;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class624.field8861 = 1;
        }
        if (class624.field8861 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class624.field8861 = 0;
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(I)V")
    public class770(int arg0) {
        this.field10634 = arg0;
    }
}
