import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class180 {

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public int field2734;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "[I")
    public int[] field2747;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "[I")
    public int[] field2739;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "[B")
    public byte[] field2736;

    @OriginalMember(owner = "client!am", name = "r", descriptor = "[Ljava/lang/String;")
    public String[] field2750;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "I")
    public static int field2741 = 0;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "[I")
    public static int[] field2735 = new int[2];

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!am", name = "p", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "Lja;")
    public static class60 field2743;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ZI)I")
    public static final int method1123(boolean arg0, int arg1) {
        field2742++;
        long var2 = class263.method1754(7);
        if (arg1 >= -120) {
            return 3;
        }
        for (class63 var4 = arg0 ? (class63) class273.field4110.method1665(16) : (class63) class273.field4110.method1659((byte) -118); var4 != null; var4 = (class63) class273.field4110.method1659((byte) -118)) {
            if ((var4.field987 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field987 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field1321;
                    class35.field494[var5] = class186.field2823[var5];
                    var4.method538(68);
                    return var5;
                }
                var4.method538(99);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
    public static final void method1124(int arg0) {
        class166.field2549 = new class253(32);
        field2744++;
        if (arg0 != 9721) {
            method1124(66);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IZ)Z")
    public final boolean method1125(int arg0, boolean arg1) {
        field2746++;
        if (!arg1) {
            this.method1129(34, (byte) 8);
        }
        return (this.field2736[arg0] & 0x8) != 0;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IB)Z")
    public final boolean method1126(int arg0, byte arg1) {
        if (arg1 <= 59) {
            return false;
        } else {
            field2740++;
            return (this.field2736[arg0] & 0x4) != 0;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V")
    public static void method1127(boolean arg0) {
        field2735 = null;
        field2743 = null;
        if (!arg0) {
            method1124(-99);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(II)I")
    public final int method1128(int arg0, int arg1) {
        if (arg0 != 3) {
            this.field2734 = 118;
        }
        field2749++;
        return this.field2736[arg1] & 0x3;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(IB)Z")
    public final boolean method1129(int arg0, byte arg1) {
        field2737++;
        int var3 = 41 / ((arg1 + 8) / 55);
        return (this.field2736[arg0] & 0x10) == 0;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIILee;I)V")
    public static final void method1130(int arg0, int arg1, int arg2, class288 arg3, int arg4) {
        field2745++;
        if (arg2 != 128) {
            field2743 = null;
        }
        for (class151 var5 = (class151) class295.field4670.method983(7); var5 != null; var5 = (class151) class295.field4670.method985((byte) -42)) {
            if (var5.field2173 == arg0 && arg1 * 128 == var5.field2172 && (arg4 * 128) == var5.field2190 && var5.field2188.field4323 == arg3.field4323) {
                if (var5.field2175 != null) {
                    class213.field3187.method378(var5.field2175);
                    var5.field2175 = null;
                }
                if (var5.field2193 != null) {
                    class213.field3187.method378(var5.field2193);
                    var5.field2193 = null;
                }
                var5.method538(126);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(I)V")
    public class180(int arg0) {
        this.field2734 = arg0;
        this.field2747 = new int[this.field2734];
        this.field2739 = new int[this.field2734];
        this.field2736 = new byte[this.field2734];
        this.field2750 = new String[this.field2734];
    }
}
