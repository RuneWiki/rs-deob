import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class19 extends class181 {

    @OriginalMember(owner = "client!lh", name = "M", descriptor = "[B")
    public byte[] field305;

    @OriginalMember(owner = "client!lh", name = "K", descriptor = "Lli;")
    private static class185 field303 = class245.method1649("Loading sprites )2 ", 125);

    @OriginalMember(owner = "client!lh", name = "O", descriptor = "Z")
    public static boolean field307 = false;

    @OriginalMember(owner = "client!lh", name = "Q", descriptor = "Lli;")
    public static class185 field309 = field303;

    @OriginalMember(owner = "client!lh", name = "L", descriptor = "Lli;")
    public static class185 field304 = class245.method1649(")4j", 125);

    @OriginalMember(owner = "client!lh", name = "I", descriptor = "Lfl;")
    public static class191 field301 = new class191();

    @OriginalMember(owner = "client!lh", name = "N", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!lh", name = "P", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!lh", name = "R", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!lh", name = "S", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!lh", name = "J", descriptor = "Lda;")
    public static class101 field302;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BI)Z")
    public static final boolean method131(byte arg0, int arg1) {
        if (arg0 >= -50) {
            method132(91, (class142) null, 24);
        }
        field308++;
        return (arg1 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "([B)V")
    public class19(byte[] arg0) {
        this.field305 = arg0;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILgb;I)V")
    public static final void method132(int arg0, class142 arg1, int arg2) {
        if (class211.field3851 < arg1.field2702) {
            class210.method1477((byte) 58, arg1);
        } else if (arg1.field2672 < class211.field3851) {
            class40.method255(arg1, 115);
        } else {
            class252.method1709(128, arg1);
        }
        if (arg1.field2694 < 128 || arg1.field2687 < 128 || arg1.field2694 >= 13184 || arg1.field2687 >= 13184) {
            arg1.field2655 = -1;
            arg1.field2672 = 0;
            arg1.field2702 = 0;
            arg1.field2709 = -1;
            arg1.field2694 = arg1.field2651[0] * 128 + (arg1.method1014(-1) * 64);
            arg1.field2687 = arg1.field2720[0] * 128 + arg1.method1014(-1) * 64;
            arg1.method1023(127);
        }
        field306++;
        if (class241.field4310 == arg1 && (arg1.field2694 < 1536 || arg1.field2687 < 1536 || arg1.field2694 >= 11776 || arg1.field2687 >= 11776)) {
            arg1.field2702 = 0;
            arg1.field2672 = 0;
            arg1.field2709 = -1;
            arg1.field2655 = -1;
            arg1.field2694 = arg1.field2651[0] * 128 + (arg1.method1014(-1) * 64);
            arg1.field2687 = arg1.field2720[0] * 128 + (arg1.method1014(-1) * 64);
            arg1.method1023(-91);
        }
        int var3 = 72 / ((arg2 - 24) / 39);
        class103.method729(10383, arg1);
        class207.method1469(-79, arg1);
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(Z)V")
    public static void method133(boolean arg0) {
        field304 = null;
        field302 = null;
        field301 = null;
        field309 = null;
        if (arg0) {
            field303 = null;
        }
        field303 = null;
    }
}
