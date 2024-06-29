import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class131 {

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "J")
    public long field2822 = 0L;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field2813 = 0;

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "Ldd;")
    public static class35 field2829 = class180.method1196((byte) -67, "(U4");

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "Lld;")
    public static class111 field2823 = new class111(64);

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "I")
    public static int field2833 = 0;

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "Lld;")
    public static class111 field2832 = new class111(5);

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "Ldd;")
    public static class35 field2834 = class180.method1196((byte) 126, "Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public int field2812;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public int field2815;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public int field2816;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public int field2818;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public int field2819;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public int field2820;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public int field2821;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
    public int field2824;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
    public int field2826;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "I")
    public int field2827;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "I")
    public int field2828;

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "Llc;")
    public class110 field2814;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)Lfd;")
    public static final class55 method903(int arg0, int arg1) {
        field2825++;
        int var2 = arg1 & 0xFFFF;
        int var3 = arg1 >> 16;
        if (class163.field3299[var3] == null || class163.field3299[var3][var2] == null) {
            boolean var4 = class193.method1261((byte) 111, var3);
            if (!var4) {
                return null;
            }
        }
        return arg0 == 609074640 ? class163.field3299[var3][var2] : null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
    public static final void method904(int arg0) {
        field2817++;
        if (arg0 != 127) {
            field2813 = 6;
        }
        class61 var1 = class111.field2443;
        synchronized (class111.field2443) {
            class184.field3777 = class176.field3593;
            if (class79.field1854 >= 0) {
                while (class89.field1998 != class79.field1854) {
                    int var2 = class71.field1700[class89.field1998];
                    class89.field1998 = class89.field1998 + 1 & 0x7F;
                    if (var2 >= 0) {
                        class198.field3944[var2] = true;
                    } else {
                        class198.field3944[~var2] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class198.field3944[var3] = false;
                }
                class79.field1854 = class89.field1998;
            }
            class176.field3593 = class115.field2558;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BI)V")
    public static final void method905(byte arg0, int arg1) {
        if (arg0 < 28) {
            field2813 = -25;
        }
        class173.field3469 = 1000 / arg1;
        field2830++;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
    public static void method906(byte arg0) {
        field2834 = null;
        if (arg0 != 12) {
            method904(35);
        }
        field2832 = null;
        field2829 = null;
        field2823 = null;
    }
}
