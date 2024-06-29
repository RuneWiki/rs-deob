import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class18 extends class228 {

    @OriginalMember(owner = "client!ff", name = "bb", descriptor = "I")
    private int field194 = 0;

    @OriginalMember(owner = "client!ff", name = "S", descriptor = "I")
    private int field185 = 0;

    @OriginalMember(owner = "client!ff", name = "ab", descriptor = "I")
    private int field193 = 1365;

    @OriginalMember(owner = "client!ff", name = "db", descriptor = "I")
    private int field196 = 20;

    @OriginalMember(owner = "client!ff", name = "Y", descriptor = "Loa;")
    public static class99 field191 = class221.method1463(2844, "Fps:");

    @OriginalMember(owner = "client!ff", name = "cb", descriptor = "I")
    public static int field195 = 0;

    @OriginalMember(owner = "client!ff", name = "Z", descriptor = "I")
    public static int field192 = 0;

    @OriginalMember(owner = "client!ff", name = "eb", descriptor = "Loa;")
    private static class99 field197 = class221.method1463(2844, " is already on your friend list)3");

    @OriginalMember(owner = "client!ff", name = "gb", descriptor = "[I")
    public static int[] field199 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ff", name = "X", descriptor = "Loa;")
    public static class99 field190 = field197;

    @OriginalMember(owner = "client!ff", name = "T", descriptor = "Lbe;")
    public static class28 field186 = new class28();

    @OriginalMember(owner = "client!ff", name = "U", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!ff", name = "W", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!ff", name = "fb", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!ff", name = "hb", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!ff", name = "V", descriptor = "Ltg;")
    public static class182 field188;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)[I")
    public final int[] method106(int arg0, int arg1) {
        ++field189;
        int[] var3 = super.field3952.method1262(arg0, 7492);
        if (arg1 != -3) {
            return null;
        } else {
            if (super.field3952.field3276) {
                for (int var4 = 0; var4 < class234.field4046; ++var4) {
                    int var5 = (class54.field879[arg0] << 12) / this.field193 + this.field194;
                    int var6 = (class281.field4923[var4] << 12) / this.field193 + this.field185;
                    int var7 = var6;
                    int var8 = var6;
                    int var9 = var5;
                    int var10 = var5;
                    int var11 = var6 * var6 >> 12;
                    int var12 = var5 * var5 >> 12;
                    int var13 = 0;
                    while (var11 + var12 < 16384 && this.field196 > var13) {
                        var10 = (var8 * var10 >> 12) * 2 + var9;
                        ++var13;
                        var8 = var7 + var11 + -var12;
                        var12 = var10 * var10 >> 12;
                        var11 = var8 * var8 >> 12;
                    }
                    var3[var4] = ~(this.field196 + -1) >= ~var13 ? 0 : (var13 << 12) / this.field196;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILik;I)V")
    public final void method18(int arg0, class261 arg1, int arg2) {
        ++field200;
        if (arg2 != -7618) {
            this.method106(11, 7);
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 == -4) {
                        this.field194 = arg1.method1740((byte) 122);
                    }
                } else {
                    this.field185 = arg1.method1740((byte) 122);
                }
            } else {
                this.field196 = arg1.method1740((byte) 72);
            }
        } else {
            this.field193 = arg1.method1740((byte) 88);
        }
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)V")
    public static void method107(int arg0) {
        field199 = null;
        field197 = null;
        int var1 = -36 / ((-34 - arg0) / 35);
        field190 = null;
        field186 = null;
        field188 = null;
        field191 = null;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
    public class18() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZIIII)V")
    public static final void method108(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field198;
        if (!arg1) {
            method107(-96);
        }
        class290.field5088 = arg3;
        class280.field4911 = arg0;
        class25.field441 = arg4;
        class35.field622 = arg5;
        class3.field20 = arg2;
        if (class290.field5088 >= 100) {
            int var6 = class35.field622 * 128 + 64;
            int var7 = class3.field20 * 128 + 64;
            int var8 = class115.method777(-1, var7, class255.field4407, var6) - class280.field4911;
            int var9 = -class2.field13 + var6;
            int var10 = var8 - class24.field367;
            int var11 = -class221.field3850 + var7;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class267.field4709 = 2047 & (int) (Math.atan2((double) var10, (double) var12) * 325.949D);
            class173.field3061 = (int) (-325.949D * Math.atan2((double) var9, (double) var11)) & 2047;
            if (class267.field4709 < 128) {
                class267.field4709 = 128;
            }
            if (~class267.field4709 < -384) {
                class267.field4709 = 383;
            }
        }
        class141.field2481 = 2;
    }
}
