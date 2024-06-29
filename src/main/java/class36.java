import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class36 {

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "Lkb;")
    private class62 field711 = new class62();

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "Lwc;")
    private class128 field730 = new class128();

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "I")
    private int field729;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    private int field719;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "Lqc;")
    private class98 field728;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "Llc;")
    public static class69 field714 = class69.method470((byte) -128, "backhmid1");

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "[Llc;")
    public static class69[] field722 = new class69[100];

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "Llc;")
    public static class69 field721 = class69.method470((byte) -119, "Moderator option: Mute player for 48 hours: <ON>");

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public static int field723 = 0;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "Llc;")
    public static class69 field731 = class69.method470((byte) -99, "Please try again)3");

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "[Lw;")
    public static class125[] field735 = new class125[12];

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "[I")
    public static int[] field726 = new int[128];

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Lnb;")
    public static class80 field712 = new class80();

    @OriginalMember(owner = "client!fe", name = "C", descriptor = "Llc;")
    private static class69 field739 = class69.method470((byte) -105, "Login to a members(W server to use this object)3");

    @OriginalMember(owner = "client!fe", name = "B", descriptor = "Llc;")
    public static class69 field738 = field739;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!fe", name = "A", descriptor = "Lcb;")
    public static class15 field737;

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "Lhc;")
    public static class45 field733;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "Lkc;")
    public static class63 field732;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "Loa;")
    public static class85 field720;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "Ljava/awt/Font;")
    public static Font field718;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lib;I)V")
    public static final void method218(class50 arg0, int arg1) {
        if (class62.field1282 == arg0.field1085 || arg0.field1070 == -1 || arg0.field1032 != 0 || arg0.field1022 + 1 > class67.method435(124, arg0.field1070).field1658[arg0.field1033]) {
            int var2 = class62.field1282 - arg0.field1075;
            int var3 = arg0.field1046 * 128 + arg0.field1042 * 64;
            int var4 = arg0.field1089 * 128 + arg0.field1042 * 64;
            int var5 = arg0.field1085 - arg0.field1075;
            arg0.field1058 = ((var5 - var2) * var3 + var2 * var4) / var5;
            int var6 = arg0.field1047 * 128 + arg0.field1042 * 64;
            int var7 = arg0.field1096 * 128 + arg0.field1042 * 64;
            arg0.field1065 = ((var5 - var2) * var7 + var2 * var6) / var5;
        }
        arg0.field1035 = 0;
        field715++;
        if (arg0.field1039 == 0) {
            arg0.field1080 = 1024;
        }
        if (arg0.field1039 == 1) {
            arg0.field1080 = 1536;
        }
        if (arg0.field1039 == 2) {
            arg0.field1080 = 0;
        }
        if (arg0.field1039 == 3) {
            arg0.field1080 = 512;
        }
        arg0.field1037 = arg0.field1080;
        if (arg1 != 1536) {
            field732 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
    public static void method219(byte arg0) {
        field721 = null;
        field718 = null;
        if (arg0 < 2) {
            method222(84);
        }
        field733 = null;
        field720 = null;
        field735 = null;
        field731 = null;
        field732 = null;
        field712 = null;
        field722 = null;
        field738 = null;
        field737 = null;
        field714 = null;
        field739 = null;
        field726 = null;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)V")
    public final void method220(byte arg0) {
        while (true) {
            class62 var2 = this.field730.method940(-1);
            if (var2 == null) {
                this.field719 = this.field729;
                field725++;
                if (arg0 >= -109) {
                    field739 = null;
                    return;
                }
                return;
            }
            var2.method502(0);
            var2.method380(-102);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lkb;ZJ)V")
    public final void method221(class62 arg0, boolean arg1, long arg2) {
        field736++;
        if (this.field719 == 0) {
            class62 var5 = this.field730.method940(-1);
            var5.method502(0);
            var5.method380(-69);
            if (this.field711 == var5) {
                class62 var6 = this.field730.method940(-1);
                var6.method502(0);
                var6.method380(-49);
            }
        } else {
            this.field719--;
        }
        if (arg1) {
            this.field728.method745(arg0, arg2, -1);
            this.field730.method936(85, arg0);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public static final void method222(int arg0) {
        field727++;
        class22.field454.method220((byte) -116);
        if (arg0 != 220) {
            field739 = null;
        }
        class6.field110.method220((byte) -125);
        class35.field702.method220((byte) -119);
        class63.field1298.method220((byte) -118);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BJ)V")
    public final void method223(byte arg0, long arg1) {
        if (arg0 != 88) {
            field726 = null;
        }
        field717++;
        class62 var4 = (class62) this.field728.method744(-1, arg1);
        if (var4 != null) {
            var4.method502(0);
            var4.method380(-122);
            this.field719++;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(JB)Lkb;")
    public final class62 method224(long arg0, byte arg1) {
        field734++;
        int var4 = 126 / ((arg1 - 54) / 62);
        class62 var5 = (class62) this.field728.method744(-1, arg0);
        if (var5 != null) {
            this.field730.method936(26, var5);
        }
        return var5;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIII)I")
    public static final int method225(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg5 & 0x3;
        if ((arg4 & 0x1) == 1) {
            int var8 = arg3;
            arg3 = arg2;
            arg2 = var8;
        }
        field716++;
        if (var7 == 0) {
            return arg0;
        }
        if (arg1 != 16691) {
            method226(-63);
        }
        if (var7 == 1) {
            return arg6;
        } else if (var7 == 2) {
            return 7 + 1 - arg0 - arg3;
        } else {
            return 8 - arg6 - arg2;
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(I)V")
    public class36(int arg0) {
        this.field729 = arg0;
        this.field719 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field728 = new class98(var2);
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
    public static final void method226(int arg0) {
        if (class99.field2180.toLowerCase().indexOf("microsoft") == -1) {
            class78.field1770[44] = 71;
            class78.field1770[45] = 26;
            class78.field1770[46] = 72;
            class78.field1770[47] = 73;
            class78.field1770[59] = 57;
            class78.field1770[61] = 27;
            class78.field1770[91] = 42;
            class78.field1770[92] = 74;
            class78.field1770[93] = 43;
            if (class99.field2177 == null) {
                class78.field1770[192] = 58;
                class78.field1770[222] = 59;
            } else {
                class78.field1770[192] = 28;
                class78.field1770[222] = 58;
                class78.field1770[520] = 59;
            }
        } else {
            class78.field1770[186] = 57;
            class78.field1770[187] = 27;
            class78.field1770[188] = 71;
            class78.field1770[189] = 26;
            class78.field1770[190] = 72;
            class78.field1770[191] = 73;
            class78.field1770[192] = 58;
            class78.field1770[219] = 42;
            class78.field1770[220] = 74;
            class78.field1770[221] = 43;
            class78.field1770[222] = 59;
            class78.field1770[223] = 28;
        }
        if (arg0 != 58) {
            field726 = null;
        }
        field724++;
    }
}
