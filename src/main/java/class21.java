import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class21 {

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public int field430 = 0;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "Lia;")
    public static class257 field432 = class28.method234(-20, ")4l=");

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field438 = 0;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "Lie;")
    public static class117 field435 = new class117(64);

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "Lia;")
    public static class257 field439 = class28.method234(80, "Spielwelt erstellt)3");

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    public static int field441 = 0;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "[[[I")
    public static int[][][] field443 = new int[2][][];

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "Lte;")
    public static class184 field434;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "[Lte;")
    public static class184[] field440;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "[[[B")
    public static byte[][][] field442;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lmb;Lmb;Lmb;I)V")
    public static final void method180(class178 arg0, class178 arg1, class178 arg2, int arg3) {
        class152.field2634 = arg2;
        class242.field4195 = arg0;
        if (arg3 == 6819) {
            field429++;
            class203.field3493 = arg1;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)Loa;")
    public static final class9 method181(byte arg0) {
        field431++;
        try {
            if (arg0 < 42) {
                field441 = -127;
            }
            return (class9) Class.forName("ng").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public static void method182(int arg0) {
        field440 = null;
        field435 = null;
        field443 = null;
        field439 = null;
        field432 = null;
        field434 = null;
        field442 = null;
        if (arg0 != 10924) {
            method181((byte) 55);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lk;II)V")
    private final void method183(class152 arg0, int arg1, int arg2) {
        if (arg2 == 5) {
            this.field430 = arg0.method1063(-17162);
        }
        field433++;
        if (arg1 != 2) {
            field434 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIB)I")
    public static final int method184(int arg0, int arg1, byte arg2) {
        int var3 = arg0 >>> 31;
        field436++;
        return arg2 == -86 ? (arg0 + var3) / arg1 - var3 : -114;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZLk;)V")
    public final void method185(boolean arg0, class152 arg1) {
        if (!arg0) {
            field438 = 43;
        }
        field437++;
        while (true) {
            int var3 = arg1.method1051((byte) 99);
            if (var3 == 0) {
                return;
            }
            this.method183(arg1, 2, var3);
        }
    }
}
