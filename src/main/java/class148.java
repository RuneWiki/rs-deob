import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class148 extends class27 {

    @OriginalMember(owner = "client!qc", name = "V", descriptor = "I")
    private int field2851 = -1;

    @OriginalMember(owner = "client!qc", name = "Y", descriptor = "I")
    public static volatile int field2854 = 0;

    @OriginalMember(owner = "client!qc", name = "S", descriptor = "Lkb;")
    public static class93 field2848 = class76.method390("blaugr-Un:", 0);

    @OriginalMember(owner = "client!qc", name = "Q", descriptor = "[Lkb;")
    public static class93[] field2846 = new class93[8];

    @OriginalMember(owner = "client!qc", name = "eb", descriptor = "Lkb;")
    public static class93 field2860 = class76.method390("<col=ffff00>", 0);

    @OriginalMember(owner = "client!qc", name = "hb", descriptor = "Lkb;")
    public static class93 field2863 = class76.method390("", 0);

    @OriginalMember(owner = "client!qc", name = "P", descriptor = "Lkb;")
    public static class93 field2845 = field2863;

    @OriginalMember(owner = "client!qc", name = "gb", descriptor = "Lkb;")
    public static class93 field2862 = field2863;

    @OriginalMember(owner = "client!qc", name = "U", descriptor = "Lkb;")
    public static class93 field2850 = field2863;

    @OriginalMember(owner = "client!qc", name = "ab", descriptor = "Lkb;")
    public static class93 field2856 = field2863;

    @OriginalMember(owner = "client!qc", name = "N", descriptor = "Lkb;")
    public static class93 field2843 = field2863;

    @OriginalMember(owner = "client!qc", name = "T", descriptor = "Lkb;")
    public static class93 field2849 = field2863;

    @OriginalMember(owner = "client!qc", name = "R", descriptor = "I")
    private int field2847;

    @OriginalMember(owner = "client!qc", name = "W", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!qc", name = "X", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!qc", name = "Z", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!qc", name = "bb", descriptor = "I")
    private int field2857;

    @OriginalMember(owner = "client!qc", name = "cb", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!qc", name = "db", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!qc", name = "fb", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!qc", name = "ib", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!qc", name = "jb", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!qc", name = "M", descriptor = "[I")
    private int[] field2842;

    @OriginalMember(owner = "client!qc", name = "O", descriptor = "[Lna;")
    public static class119[] field2844;

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
    public class148() {
        super(0, false);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lrd;I)Lkb;")
    public static final class93 method904(class158 arg0, int arg1) {
        ++field2864;
        if (arg1 != 2) {
            field2845 = null;
        }
        return class73.method384(32767, arg0, 0);
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(B)Z")
    private final boolean method905(byte arg0) {
        ++field2858;
        if (arg0 < 81) {
            return false;
        } else if (this.field2842 != null) {
            return true;
        } else if (~this.field2851 <= -1) {
            int var2 = !class154.field3032.method1101(this.field2851, true) ? 128 : 64;
            this.field2842 = class154.field3032.method1104(true, this.field2851);
            this.field2847 = var2;
            this.field2857 = var2;
            return this.field2842 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "(B)V")
    public static void method906(byte arg0) {
        field2846 = null;
        field2848 = null;
        field2856 = null;
        field2860 = null;
        field2844 = null;
        field2843 = null;
        field2863 = null;
        field2850 = null;
        field2862 = null;
        field2849 = null;
        if (arg0 != 79) {
            field2856 = null;
        }
        field2845 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)[[I")
    public final int[][] method19(int arg0, int arg1) {
        ++field2859;
        int[][] var3 = super.field436.method537(0, arg1);
        int var4 = 40 / ((arg0 - 42) / 54);
        if (super.field436.field1771 && this.method905((byte) 82)) {
            int var5 = this.field2857 * (~class159.field3205 != ~this.field2847 ? this.field2847 * arg1 / class159.field3205 : arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            if (class159.field3209 == this.field2857) {
                for (int var9 = 0; class159.field3209 > var9; ++var9) {
                    int var10 = this.field2842[var5++];
                    var8[var9] = class91.method479(4080, var10 << 4);
                    var7[var9] = class91.method479(4080, var10 >> 4);
                    var6[var9] = class91.method479(var10 >> 12, 4080);
                }
            } else {
                for (int var11 = 0; ~var11 > ~class159.field3209; ++var11) {
                    int var12 = this.field2857 * var11 / class159.field3209;
                    int var13 = this.field2842[var5 + var12];
                    var8[var11] = class91.method479(4080, var13 << 4);
                    var7[var11] = class91.method479(var13, 65280) >> 4;
                    var6[var11] = class91.method479(var13 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)I")
    public final int method153(byte arg0) {
        if (arg0 > -53) {
            this.field2857 = -2;
        }
        ++field2853;
        return this.field2851;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BILrd;)V")
    public final void method15(byte arg0, int arg1, class158 arg2) {
        if (~arg1 == -1) {
            this.field2851 = arg2.method1071(28101);
        }
        if (arg0 < 106) {
            field2850 = null;
        }
        ++field2865;
    }
}
