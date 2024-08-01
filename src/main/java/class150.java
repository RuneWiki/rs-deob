import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("qb")
public class class150 extends class85 {

    @OriginalMember(owner = "qb", name = "fb", descriptor = "I")
    private int field2898 = -1;

    @OriginalMember(owner = "qb", name = "R", descriptor = "Llf;")
    private static class109 field2884 = class35.method275("Enter your username (V password)3", 2);

    @OriginalMember(owner = "qb", name = "X", descriptor = "Llf;")
    public static class109 field2890 = field2884;

    @OriginalMember(owner = "qb", name = "W", descriptor = "I")
    public static int field2889 = 0;

    @OriginalMember(owner = "qb", name = "Y", descriptor = "Llf;")
    public static class109 field2891 = class35.method275("<col=ffb000>", 2);

    @OriginalMember(owner = "qb", name = "Q", descriptor = "[Lja;")
    public static class86[] field2883 = new class86[2048];

    @OriginalMember(owner = "qb", name = "hb", descriptor = "[[I")
    public static int[][] field2900 = new int[104][104];

    @OriginalMember(owner = "qb", name = "S", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "qb", name = "U", descriptor = "I")
    private int field2887;

    @OriginalMember(owner = "qb", name = "V", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "qb", name = "Z", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "qb", name = "ab", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "qb", name = "bb", descriptor = "I")
    private int field2894;

    @OriginalMember(owner = "qb", name = "db", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "qb", name = "eb", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "qb", name = "T", descriptor = "Lbg;")
    public static class18 field2886;

    @OriginalMember(owner = "qb", name = "cb", descriptor = "Lja;")
    public static class86 field2895;

    @OriginalMember(owner = "qb", name = "gb", descriptor = "[I")
    private int[] field2899;

    @OriginalMember(owner = "qb", name = "e", descriptor = "(I)Z")
    private final boolean method1044(int arg0) {
        if (arg0 != 4080) {
            return true;
        } else {
            ++field2897;
            if (this.field2899 != null) {
                return true;
            } else if (~this.field2898 <= -1) {
                int var2 = class113.field2248.method3(this.field2898, -118) ? 64 : 128;
                this.field2899 = class113.field2248.method8(this.field2898, false);
                this.field2894 = var2;
                this.field2887 = var2;
                return this.field2899 != null;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(BILja;)V")
    public final void method31(byte arg0, int arg1, class86 arg2) {
        if (arg1 == 0) {
            this.field2898 = arg2.method569(true);
        }
        if (arg0 > -120) {
            this.method1044(102);
        }
        ++field2885;
    }

    @OriginalMember(owner = "qb", name = "b", descriptor = "(I)I")
    public final int method545(int arg0) {
        ++field2893;
        if (arg0 != 24649) {
            this.method545(15);
        }
        return this.field2898;
    }

    @OriginalMember(owner = "qb", name = "<init>", descriptor = "()V")
    public class150() {
        super(0, false);
    }

    @OriginalMember(owner = "qb", name = "b", descriptor = "(II)[[I")
    public final int[][] method29(int arg0, int arg1) {
        ++field2896;
        int[][] var3 = super.field1719.method673((byte) -127, arg0);
        if (super.field1719.field1926 && this.method1044(4080)) {
            int var4 = (~class38.field824 != ~this.field2887 ? this.field2887 * arg0 / class38.field824 : arg0) * this.field2894;
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            if (class57.field1152 == this.field2894) {
                for (int var8 = 0; var8 < class57.field1152; ++var8) {
                    int var9 = this.field2899[var4++];
                    var7[var8] = class170.method1140(255, var9) << 4;
                    var5[var8] = class170.method1140(var9, 65280) >> 4;
                    var6[var8] = class170.method1140(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; ~class57.field1152 < ~var10; ++var10) {
                    int var11 = this.field2894 * var10 / class57.field1152;
                    int var12 = this.field2899[var4 - -var11];
                    var7[var10] = class170.method1140(255, var12) << 4;
                    var5[var10] = class170.method1140(var12 >> 4, 4080);
                    var6[var10] = class170.method1140(16711680, var12) >> 12;
                }
            }
        }
        if (arg1 != 2177) {
            this.field2887 = 61;
        }
        return var3;
    }

    @OriginalMember(owner = "qb", name = "b", descriptor = "(Z)V")
    public static void method1045(boolean arg0) {
        if (!arg0) {
            field2884 = null;
            field2883 = null;
            field2895 = null;
            field2886 = null;
            field2890 = null;
            field2900 = null;
            field2891 = null;
        }
    }
}
