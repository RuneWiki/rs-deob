import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class19 extends class119 {

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "[I")
    public static int[] field278 = new int[5];

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "Lai;")
    public static class10 field284 = class44.method278(")4l", -121);

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "[I")
    public static int[] field276 = new int[32];

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    public int field269;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
    public int field270;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    public int field271;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    public int field272;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
    public int field273;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
    public int field275;

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "I")
    public int field277;

    @OriginalMember(owner = "client!bh", name = "A", descriptor = "I")
    public int field280;

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "I")
    public int field282;

    @OriginalMember(owner = "client!bh", name = "D", descriptor = "I")
    public int field283;

    @OriginalMember(owner = "client!bh", name = "F", descriptor = "I")
    public int field285;

    @OriginalMember(owner = "client!bh", name = "H", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!bh", name = "J", descriptor = "I")
    public int field289;

    @OriginalMember(owner = "client!bh", name = "L", descriptor = "I")
    public int field290;

    @OriginalMember(owner = "client!bh", name = "M", descriptor = "I")
    public int field291;

    @OriginalMember(owner = "client!bh", name = "O", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!bh", name = "Q", descriptor = "I")
    public int field294;

    @OriginalMember(owner = "client!bh", name = "R", descriptor = "I")
    public int field295;

    @OriginalMember(owner = "client!bh", name = "S", descriptor = "I")
    public int field296;

    @OriginalMember(owner = "client!bh", name = "I", descriptor = "Llf;")
    public class106 field288;

    @OriginalMember(owner = "client!bh", name = "N", descriptor = "Lqe;")
    public class150 field292;

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "Lra;")
    public class155 field281;

    @OriginalMember(owner = "client!bh", name = "G", descriptor = "Lc;")
    public static class21 field286;

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "Lf;")
    public class48 field279;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
    public static void method127(int arg0) {
        if (arg0 != 127) {
            method129(null, -67, 0);
        }
        field278 = null;
        field286 = null;
        field276 = null;
        field284 = null;
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V")
    public final void method128(int arg0) {
        this.field292 = null;
        this.field279 = null;
        if (arg0 > -7) {
            method127(-95);
        }
        field274++;
        this.field288 = null;
        this.field281 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lh;II)V")
    public static final void method129(class65 arg0, int arg1, int arg2) {
        field293++;
        int var3 = 90 / ((-arg1 - 2) / 57);
        class43.method272(arg0.field1100, arg2, arg0.field1097, true);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
    public static final void method130(byte arg0) {
        class27 var1 = class98.field1819;
        synchronized (class98.field1819) {
            class153.field2954 = class75.field1295;
            if (class87.field1548 >= 0) {
                while (class87.field1548 != class170.field3294) {
                    int var2 = class65.field1120[class170.field3294];
                    class170.field3294 = class170.field3294 + 1 & 0x7F;
                    if (var2 < 0) {
                        class182.field3477[~var2] = false;
                    } else {
                        class182.field3477[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class182.field3477[var3] = false;
                }
                class87.field1548 = class170.field3294;
            }
            class75.field1295 = class200.field3789;
            if (arg0 != 66) {
                method130((byte) -97);
            }
        }
        field287++;
    }
}
