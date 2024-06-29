import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public abstract class class187 {

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "Ltl;")
    public static class222 field3040 = new class222(4);

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "Ljava/lang/String;")
    public static String field3042 = " has logged in.";

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
    public static int field3044 = -1;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public int field3029;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public int field3034;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
    public int field3041;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "Lkb;")
    public static class39 field3038;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "Lkb;")
    public static class39 field3043;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "[I")
    public static int[] field3035;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "[[B")
    public static byte[][] field3037;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)Z", line = 9)
    public final boolean method1318(byte arg0) {
        int var2 = -43 % ((-arg0 - 3) / 50);
        field3039++;
        return (this.field3034 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)I", line = 25)
    public static final int method1319(int arg0) {
        class19.field269 = arg0;
        field3033++;
        return class219.method1603(false);
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)Z", line = 48)
    public final boolean method1320(int arg0) {
        if (arg0 < 4) {
            return true;
        } else {
            field3031++;
            return (this.field3034 & 0x8) != 0;
        }
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)Z", line = 62)
    public final boolean method1321(int arg0) {
        if (arg0 < 39) {
            this.field3041 = -107;
        }
        field3036++;
        return (this.field3034 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)Z", line = 73)
    public final boolean method1322(byte arg0) {
        field3028++;
        if (arg0 <= 56) {
            this.method1321(-60);
        }
        return (this.field3034 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)V", line = 84)
    public static void method1323(boolean arg0) {
        field3040 = null;
        field3037 = (byte[][]) null;
        field3035 = null;
        if (!arg0) {
            field3043 = null;
            field3038 = null;
            field3042 = null;
        }
    }
}
