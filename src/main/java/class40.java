import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class40 extends class16 {

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "I")
    private int field733 = 0;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
    private int field731 = 0;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
    private int field729 = -32768;

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "Z")
    public boolean field749 = false;

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "I")
    public int field734;

    @OriginalMember(owner = "client!ra", name = "D", descriptor = "I")
    public int field739;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
    public int field728;

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "I")
    private int field746;

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "I")
    public int field745;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
    public int field727;

    @OriginalMember(owner = "client!ra", name = "I", descriptor = "Lig;")
    private class186 field744;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "Lij;")
    private static class50 field732 = class78.method578(121, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "I")
    public static int field737 = 0;

    @OriginalMember(owner = "client!ra", name = "C", descriptor = "Lij;")
    public static class50 field738 = field732;

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "Lij;")
    public static class50 field748 = class78.method578(125, "leuchten2:");

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!ra", name = "A", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!ra", name = "E", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!ra", name = "F", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!ra", name = "G", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "[I")
    public static int[] field730;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(II)V")
    public final void method306(int arg0, int arg1) {
        field736++;
        if (this.field749) {
            return;
        }
        this.field731 += arg1;
        if (arg0 != -32684) {
            return;
        }
        while (this.field744.field3038[this.field733] < this.field731) {
            this.field731 -= this.field744.field3038[this.field733];
            this.field733++;
            if (this.field744.field3043.length <= this.field733) {
                this.field749 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "()I")
    public final int method126() {
        field743++;
        return this.field729;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field735++;
        class98 var11 = this.method309((byte) -89);
        if (var11 != null) {
            var11.method129(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field729 = var11.method126();
        }
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V")
    public static void method307(int arg0) {
        if (arg0 != -7) {
            field732 = null;
        }
        field732 = null;
        field730 = null;
        field748 = null;
        field738 = null;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(II)V")
    public static final void method308(int arg0, int arg1) {
        field741++;
        class90.method703(arg1 + 12);
        class231.method1572((byte) -71);
        int var2 = class16.method128(false, arg0).field4488;
        if (arg1 == var2) {
            return;
        }
        int var3 = class54.field968[arg0];
        if (var2 == 6) {
            class236.field3956 = var3;
        }
        if (var2 == 5) {
            class231.field3888 = var3;
        }
        if (var2 == 9) {
            class93.field1738 = var3;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)Lwg;")
    private final class98 method309(byte arg0) {
        field742++;
        if (arg0 >= -22) {
            this.method129(-46, -121, -92, 35, 37, -65, -74, 79, -87L);
        }
        class109 var2 = class210.method1405(1, this.field746);
        class98 var3;
        if (this.field749) {
            var3 = var2.method809(-1, -1);
        } else {
            var3 = var2.method809(this.field733, -1);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILtf;)I")
    public static final int method310(int arg0, class53 arg1) {
        field740++;
        class62 var2 = arg1.field959;
        if (var2.field1160 != null) {
            var2 = var2.method486((byte) -97);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field1172;
        if (arg1.field3996 == arg1.field3965) {
            var3 = var2.field1187;
        } else if (arg1.field4023 == arg1.field3996) {
            var3 = var2.field1191;
        }
        if (arg0 != -1) {
            field732 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(IIIIIII)V")
    public class40(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field734 = arg6 + arg5;
        this.field739 = arg3;
        this.field728 = arg4;
        this.field746 = arg0;
        this.field745 = arg2;
        this.field727 = arg1;
        int var8 = class210.method1405(1, this.field746).field1951;
        if (var8 == -1) {
            this.field749 = true;
        } else {
            this.field749 = false;
            this.field744 = class123.method891(-5664, var8);
        }
    }
}
