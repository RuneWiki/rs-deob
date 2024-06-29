import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class57 extends class424 {

    @OriginalMember(owner = "client!oi", name = "F", descriptor = "I")
    public int field776;

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "Ljava/lang/String;")
    public String field770;

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "Z")
    public boolean field766;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    public int field759;

    @OriginalMember(owner = "client!oi", name = "E", descriptor = "Z")
    public boolean field775;

    @OriginalMember(owner = "client!oi", name = "A", descriptor = "I")
    public int field771;

    @OriginalMember(owner = "client!oi", name = "D", descriptor = "J")
    public long field774;

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "Ljava/lang/String;")
    public String field761;

    @OriginalMember(owner = "client!oi", name = "H", descriptor = "I")
    public int field778;

    @OriginalMember(owner = "client!oi", name = "G", descriptor = "I")
    public int field777;

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "[[Z")
    public static boolean[][] field765 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "[I")
    public static int[] field764 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "I")
    public static int field767 = 0;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
    public static int field758 = 0;

    @OriginalMember(owner = "client!oi", name = "C", descriptor = "[I")
    public static int[] field773 = new int[2];

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!oi", name = "B", descriptor = "[Lmca;")
    public static class34[] field772;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V")
    public static final void method501(byte arg0) {
        if (class140.field1834.toLowerCase().indexOf("microsoft") == -1) {
            class503.field6622[46] = 72;
            class503.field6622[91] = 42;
            class503.field6622[92] = 74;
            class503.field6622[93] = 43;
            class503.field6622[44] = 71;
            class503.field6622[59] = 57;
            class503.field6622[47] = 73;
            class503.field6622[61] = 27;
            if (class140.field1840 == null) {
                class503.field6622[222] = 59;
                class503.field6622[192] = 58;
            } else {
                class503.field6622[222] = 58;
                class503.field6622[192] = 28;
                class503.field6622[520] = 59;
            }
            class503.field6622[45] = 26;
        } else {
            class503.field6622[191] = 73;
            class503.field6622[186] = 57;
            class503.field6622[190] = 72;
            class503.field6622[223] = 28;
            class503.field6622[221] = 43;
            class503.field6622[220] = 74;
            class503.field6622[189] = 26;
            class503.field6622[187] = 27;
            class503.field6622[192] = 58;
            class503.field6622[219] = 42;
            class503.field6622[222] = 59;
            class503.field6622[188] = 71;
        }
        field763++;
        if (arg0 != 93) {
            field772 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(BII)Z")
    public static final boolean method502(byte arg0, int arg1, int arg2) {
        if (arg0 < 107) {
            return false;
        } else {
            field760++;
            return false;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V")
    public static void method503(boolean arg0) {
        field772 = null;
        field764 = null;
        field773 = null;
        field765 = null;
        if (arg0) {
            field758 = -43;
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
    public class57(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field776 = arg3;
        this.field770 = arg1;
        this.field766 = arg9;
        this.field759 = arg4;
        this.field775 = arg8;
        this.field771 = arg2;
        this.field774 = arg5;
        this.field761 = arg0;
        this.field778 = arg6;
        this.field777 = arg7;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZIIZ)V")
    public static final void method504(int arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 == 24829) {
            class12.method60(arg1, arg0, (byte) -116, class202.field2638.length - 1, arg3, arg4, 0);
            field762++;
            class690.field9430 = 0;
            class28.field433 = null;
        }
    }
}
