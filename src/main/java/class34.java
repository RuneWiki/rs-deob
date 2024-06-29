import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class34 extends class197 {

    @OriginalMember(owner = "client!fj", name = "P", descriptor = "Loh;")
    public static class258 field398 = class153.method1046("", 104);

    @OriginalMember(owner = "client!fj", name = "S", descriptor = "Loh;")
    public static class258 field401 = class153.method1046("gr-Un:", 116);

    @OriginalMember(owner = "client!fj", name = "N", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!fj", name = "O", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!fj", name = "Q", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!fj", name = "R", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!fj", name = "T", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!fj", name = "W", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!fj", name = "M", descriptor = "Lgb;")
    public static class213 field395;

    @OriginalMember(owner = "client!fj", name = "U", descriptor = "[Lti;")
    public static class220[] field403;

    @OriginalMember(owner = "client!fj", name = "V", descriptor = "[Loh;")
    public static class258[] field404;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "(B)V", line = 5)
    public static final void method239(byte arg0) {
        if (arg0 < 117) {
            field398 = (class258) null;
        }
        field396++;
        if (class295.field5075.toLowerCase().indexOf("microsoft") != -1) {
            class61.field1042[189] = 26;
            class61.field1042[190] = 72;
            class61.field1042[191] = 73;
            class61.field1042[188] = 71;
            class61.field1042[192] = 58;
            class61.field1042[186] = 57;
            class61.field1042[222] = 59;
            class61.field1042[221] = 43;
            class61.field1042[187] = 27;
            class61.field1042[219] = 42;
            class61.field1042[220] = 74;
            class61.field1042[223] = 28;
            return;
        }
        class61.field1042[45] = 26;
        class61.field1042[44] = 71;
        class61.field1042[59] = 57;
        class61.field1042[47] = 73;
        class61.field1042[46] = 72;
        class61.field1042[61] = 27;
        class61.field1042[93] = 43;
        class61.field1042[92] = 74;
        if (class295.field5077 == null) {
            class61.field1042[192] = 58;
            class61.field1042[222] = 59;
        } else {
            class61.field1042[192] = 28;
            class61.field1042[520] = 59;
            class61.field1042[222] = 58;
        }
        class61.field1042[91] = 42;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIILnd;II)V", line = 55)
    public static final void method240(int arg0, int arg1, int arg2, int arg3, class58 arg4, int arg5, int arg6) {
        if (arg2 != -5415) {
            method242((byte) -73);
        }
        class88.method631(arg1, 16329, arg4.field934, arg4.field912, arg0, arg6, arg3, arg5);
        field397++;
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(III)I", line = 71)
    private final int method241(int arg0, int arg1, int arg2) {
        if (arg0 == 4096) {
            int var4 = arg1 * 57 + arg2;
            field402++;
            int var5 = var4 ^ var4 << 1;
            return 4096 - ((Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589) / 262144);
        } else {
            return 7;
        }
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V", line = 85)
    public class34() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "(B)V", line = 98)
    public static void method242(byte arg0) {
        int var1 = -17 / ((46 - arg0) / 54);
        field398 = null;
        field401 = null;
        field395 = null;
        field403 = null;
        field404 = null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)[I", line = 118)
    public final int[] method96(int arg0, int arg1) {
        if (arg0 != -16221) {
            this.method241(86, -19, -126);
        }
        field399++;
        int[] var3 = this.field3456.method2104(arg1, 0);
        if (this.field3456.field5115) {
            int var4 = class268.field4670[arg1];
            for (int var5 = 0; var5 < class190.field3362; var5++) {
                var3[var5] = this.method241(4096, var4, class166.field2822[var5]) % 4096;
            }
        }
        return var3;
    }
}
