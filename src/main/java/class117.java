import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class117 implements class79 {

    @OriginalMember(owner = "client!se", name = "l", descriptor = "Lbb;")
    private class10 field2765 = new class10();

    @OriginalMember(owner = "client!se", name = "t", descriptor = "I")
    private int field2773 = 0;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "D")
    private double field2775 = 1.0D;

    @OriginalMember(owner = "client!se", name = "B", descriptor = "I")
    private int field2781 = 128;

    @OriginalMember(owner = "client!se", name = "H", descriptor = "Lac;")
    private class4 field2787;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "I")
    private int field2778;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "[Loa;")
    private class89[] field2764;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "Lkc;")
    public static class67 field2759 = class19.method144("Die Verbindung konnte", 74);

    @OriginalMember(owner = "client!se", name = "a", descriptor = "Lkc;")
    private static class67 field2754 = class19.method144("No matching objects found)1 please shorten search", 84);

    @OriginalMember(owner = "client!se", name = "g", descriptor = "Lkc;")
    public static class67 field2760 = field2754;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "Lkc;")
    private static class67 field2770 = class19.method144("Please try again)3", 126);

    @OriginalMember(owner = "client!se", name = "r", descriptor = "[I")
    public static int[] field2771 = new int[256];

    @OriginalMember(owner = "client!se", name = "c", descriptor = "Lkc;")
    public static class67 field2756 = field2770;

    @OriginalMember(owner = "client!se", name = "z", descriptor = "Lkc;")
    private static class67 field2779;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "Lkc;")
    public static class67 field2777;

    @OriginalMember(owner = "client!se", name = "E", descriptor = "Lkc;")
    private static class67 field2784;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "Lkc;")
    private static class67 field2776;

    @OriginalMember(owner = "client!se", name = "D", descriptor = "[I")
    public static int[] field2783;

    @OriginalMember(owner = "client!se", name = "L", descriptor = "Lkc;")
    public static class67 field2790;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "Lkc;")
    public static class67 field2782;

    @OriginalMember(owner = "client!se", name = "G", descriptor = "Lkc;")
    private static class67 field2786;

    @OriginalMember(owner = "client!se", name = "A", descriptor = "Lkc;")
    public static class67 field2780;

    @OriginalMember(owner = "client!se", name = "M", descriptor = "Lkc;")
    public static class67 field2791;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!se", name = "F", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!se", name = "K", descriptor = "Ldf;")
    public static class28 field2789;

    @OriginalMember(owner = "client!se", name = "J", descriptor = "Lje;")
    public static class63 field2788;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2771[var0] = var1;
        }
        field2779 = class19.method144("Too many incorrect logins from your address)3", 72);
        field2777 = field2779;
        field2784 = class19.method144("button near the top of that page)3", 124);
        field2776 = class19.method144("Invalid username or password)3", 103);
        field2783 = new int[] { 16, 32, 64, 128 };
        field2790 = field2776;
        field2782 = field2784;
        field2786 = class19.method144("Loaded fonts", 127);
        field2780 = field2786;
        field2791 = class19.method144("Spiel)2Fenster geladen)3", 69);
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(II)Z", line = 5)
    public static final boolean method929(int arg0, int arg1) {
        if (arg0 > -123) {
            return false;
        }
        field2763++;
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)Z", line = 27)
    public final boolean method629(int arg0, int arg1) {
        if (arg1 == 14195) {
            field2762++;
            return this.field2781 == 64;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BI)[I", line = 41)
    public final int[] method632(byte arg0, int arg1) {
        int var3 = 127 % ((arg0 - 4) / 37);
        field2761++;
        class89 var4 = this.field2764[arg1];
        if (var4 != null) {
            if (var4.field2039 != null) {
                this.field2765.method96(32, var4);
                var4.field2041 = true;
                return var4.field2039;
            }
            boolean var5 = var4.method692(this.field2775, this.field2781, this.field2787);
            if (var5) {
                if (this.field2773 == 0) {
                    class89 var6 = (class89) this.field2765.method86(-49);
                    var6.method691();
                } else {
                    this.field2773--;
                }
                this.field2765.method96(32, var4);
                var4.field2041 = true;
                return var4.field2039;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(II)I", line = 85)
    public final int method630(int arg0, int arg1) {
        field2766++;
        if (arg1 != -13190) {
            this.method629(13, 121);
        }
        return this.field2764[arg0] == null ? 0 : this.field2764[arg0].field2045;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZI)Z", line = 108)
    public final boolean method631(boolean arg0, int arg1) {
        field2772++;
        return arg0 ? this.field2764[arg1].field2043 : true;
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(II)V", line = 132)
    public final void method930(int arg0, int arg1) {
        if (arg1 != 97) {
            return;
        }
        for (int var3 = 0; var3 < this.field2764.length; var3++) {
            class89 var4 = this.field2764[var3];
            if (var4 != null && var4.field2046 != 0 && var4.field2041) {
                var4.method689(arg0);
                var4.field2041 = false;
            }
        }
        field2755++;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(DB)V", line = 165)
    public final void method931(double arg0, byte arg1) {
        this.field2775 = arg0;
        field2769++;
        this.method933((byte) 69);
        if (arg1 <= 72) {
            this.method930(84, 89);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V", line = 187)
    public static void method932(boolean arg0) {
        field2784 = null;
        field2783 = null;
        field2754 = null;
        field2776 = null;
        field2791 = null;
        field2782 = null;
        field2759 = null;
        field2786 = null;
        field2771 = null;
        field2770 = null;
        field2756 = null;
        field2788 = null;
        field2790 = null;
        field2789 = null;
        if (!arg0) {
            field2779 = null;
            field2760 = null;
            field2780 = null;
            field2777 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lac;Lac;IDI)V", line = 342)
    public class117(class4 arg0, class4 arg1, int arg2, double arg3, int arg4) {
        this.field2775 = arg3;
        this.field2781 = arg4;
        this.field2787 = arg1;
        this.field2778 = arg2;
        this.field2773 = this.field2778;
        int[] var7 = arg0.method42(0, -99);
        int var8 = var7.length;
        this.field2764 = new class89[arg0.method45(-118, 0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class140 var10 = new class140(arg0.method27(var7[var9], true, 0));
            this.field2764[var7[var9]] = new class89(var10);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V", line = 237)
    public final void method933(byte arg0) {
        int var2 = 122 % ((-arg0 - 6) / 48);
        for (int var3 = 0; var3 < this.field2764.length; var3++) {
            if (this.field2764[var3] != null) {
                this.field2764[var3].method691();
            }
        }
        field2774++;
        this.field2765 = new class10();
        this.field2773 = this.field2778;
    }
}
