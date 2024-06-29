import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class121 {

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "Z")
    public boolean field2834 = true;

    @OriginalMember(owner = "client!tc", name = "D", descriptor = "I")
    public int field2855;

    @OriginalMember(owner = "client!tc", name = "F", descriptor = "I")
    public int field2857;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
    public int field2838;

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "I")
    public int field2851;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
    public int field2841;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public int field2831;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "Lkc;")
    public static class67 field2828 = class19.method144("(X100(U(Y", 86);

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "Lkc;")
    public static class67 field2832 = class19.method144("overlay_multiway", 74);

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "Lkc;")
    private static class67 field2840 = class19.method144("Enter name of player to add to list", 109);

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    public static int field2839 = 0;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "Lkc;")
    public static class67 field2827 = class19.method144("p12_full", 120);

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "Lkc;")
    public static class67 field2844 = field2840;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field2830 = 0;

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "I")
    public static int field2847 = 128;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "Lkc;")
    private static class67 field2843 = class19.method144("go back to the main RuneScape webpage", 112);

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "I")
    public static volatile int field2850 = -1;

    @OriginalMember(owner = "client!tc", name = "B", descriptor = "Lkc;")
    public static class67 field2853 = class19.method144("Lade Ignorieren)2Liste)3)3)3", 100);

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "Z")
    public static boolean field2849 = false;

    @OriginalMember(owner = "client!tc", name = "C", descriptor = "I")
    public static int field2854 = 0;

    @OriginalMember(owner = "client!tc", name = "E", descriptor = "Lkc;")
    public static class67 field2856 = field2843;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!tc", name = "A", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "Lw;")
    public static class136 field2836;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "Lje;")
    public static class63 field2826;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "Lje;")
    public static class63 field2837;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "Ljava/awt/Font;")
    public static Font field2845;

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "[Z")
    public static boolean[] field2858;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)Ldf;", line = 5)
    public static final class28 method945(int arg0) {
        field2848++;
        class28 var1 = new class28(class80.field1906, class112.field2596, class46.field1121, class55.field1345, class54.field1310);
        if (arg0 == -1) {
            class50.method411((byte) 39);
            return var1;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IB)Z", line = 26)
    public static final boolean method946(int arg0, byte arg1) {
        field2846++;
        if (arg1 > -36) {
            return false;
        } else {
            return (arg0 >> 29 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)Lke;", line = 46)
    public static final class69 method947(boolean arg0) {
        field2842++;
        if (arg0) {
            return null;
        }
        try {
            return (class69) Class.forName("ia").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class128();
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V", line = 61)
    public static void method948(byte arg0) {
        field2827 = null;
        field2858 = null;
        field2836 = null;
        if (arg0 != 74) {
            return;
        }
        field2843 = null;
        field2828 = null;
        field2844 = null;
        field2826 = null;
        field2832 = null;
        field2840 = null;
        field2853 = null;
        field2856 = null;
        field2837 = null;
        field2845 = null;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(IIIIIIZ)V", line = 215)
    public class121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field2855 = arg5;
        this.field2857 = arg3;
        this.field2838 = arg4;
        this.field2851 = arg1;
        this.field2841 = arg2;
        this.field2831 = arg0;
        this.field2834 = arg6;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)Lkc;", line = 88)
    public static final class67 method949(int arg0, int arg1) {
        class67 var2 = new class67();
        if (arg0 > -39) {
            method947(false);
        }
        var2.field1597 = new byte[arg1];
        field2829++;
        var2.field1572 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lac;IIII)[B", line = 106)
    public static final byte[] method950(class4 arg0, int arg1, int arg2, int arg3, int arg4) {
        field2835++;
        if (arg4 != 0) {
            return null;
        }
        long var5 = ((long) arg1 << 32) + ((long) (arg2 << 16)) + (long) (arg2 * 37 + arg3 & 0xFFFF);
        if (class11.field243 != null) {
            class34 var7 = (class34) class11.field243.method373((byte) 104, var5);
            if (var7 != null) {
                return var7.field841;
            }
        }
        byte[] var8 = arg0.method27(arg3, true, arg2);
        if (var8 == null) {
            return null;
        } else {
            if (class11.field243 != null) {
                class11.field243.method374(0, new class34(var8), var5);
            }
            return var8;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BII)Z", line = 143)
    public static final boolean method951(byte arg0, int arg1, int arg2) {
        field2852++;
        int var3 = -29 % ((arg0 + 15) / 38);
        return (arg2 >> arg1 + 1 & 0x1) != 0;
    }
}
