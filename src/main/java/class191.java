import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class191 extends class228 {

    @OriginalMember(owner = "client!vc", name = "T", descriptor = "I")
    private int field3355 = 2048;

    @OriginalMember(owner = "client!vc", name = "W", descriptor = "I")
    private int field3358 = 2048;

    @OriginalMember(owner = "client!vc", name = "cb", descriptor = "I")
    private int field3364 = 4096;

    @OriginalMember(owner = "client!vc", name = "gb", descriptor = "I")
    private int field3368 = 0;

    @OriginalMember(owner = "client!vc", name = "hb", descriptor = "I")
    private int field3369 = 0;

    @OriginalMember(owner = "client!vc", name = "ib", descriptor = "I")
    private int field3370 = 8192;

    @OriginalMember(owner = "client!vc", name = "eb", descriptor = "I")
    private int field3366 = 12288;

    @OriginalMember(owner = "client!vc", name = "U", descriptor = "Loa;")
    public static class99 field3356 = class221.method1463(2844, "(U2");

    @OriginalMember(owner = "client!vc", name = "Z", descriptor = "Loa;")
    private static class99 field3361 = class221.method1463(2844, "You can(Wt add yourself to your own friend list)3");

    @OriginalMember(owner = "client!vc", name = "ab", descriptor = "I")
    public static int field3362 = 0;

    @OriginalMember(owner = "client!vc", name = "db", descriptor = "Loa;")
    public static class99 field3365 = field3361;

    @OriginalMember(owner = "client!vc", name = "fb", descriptor = "I")
    public static int field3367 = 0;

    @OriginalMember(owner = "client!vc", name = "bb", descriptor = "Loa;")
    public static class99 field3363 = class221.method1463(2844, "<img=0>");

    @OriginalMember(owner = "client!vc", name = "S", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!vc", name = "V", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!vc", name = "X", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!vc", name = "Y", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!vc", name = "jb", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!vc", name = "kb", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILik;I)V")
    public final void method18(int arg0, class261 arg1, int arg2) {
        if (arg2 != -7618) {
            method1296(-15);
        }
        ++field3354;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (arg0 == 6) {
                                    this.field3370 = arg1.method1740((byte) 83);
                                }
                            } else {
                                this.field3364 = arg1.method1740((byte) 69);
                            }
                        } else {
                            this.field3366 = arg1.method1740((byte) 111);
                        }
                    } else {
                        this.field3355 = arg1.method1740((byte) 47);
                    }
                } else {
                    this.field3369 = arg1.method1740((byte) 122);
                }
            } else {
                this.field3368 = arg1.method1740((byte) 126);
            }
        } else {
            this.field3358 = arg1.method1740((byte) 117);
        }
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
    public class191() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BII)Z")
    private final boolean method1295(byte arg0, int arg1, int arg2) {
        ++field3372;
        int var4 = (arg1 + arg2) * this.field3366 >> 12;
        int var5 = class123.field2164[(1046210 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field3366;
        int var7 = (var6 << 12) / this.field3370;
        int var8 = this.field3364 * var7 >> 12;
        if (arg0 < 110) {
            return false;
        } else {
            return -arg2 + arg1 < var8 && ~(-arg2 + arg1) < ~(-var8);
        }
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)V")
    public static void method1296(int arg0) {
        field3361 = null;
        field3363 = null;
        if (arg0 == 255) {
            field3365 = null;
            field3356 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
    public final void method278(int arg0) {
        if (arg0 != -8) {
            this.method278(12);
        }
        class129.method854((byte) -105);
        ++field3359;
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(III)Z")
    private final boolean method1297(int arg0, int arg1, int arg2) {
        ++field3371;
        int var4 = (-arg2 + arg1) * this.field3366 >> 12;
        int var5 = class123.field2164[255 & var4 * 255 >> 12];
        int var6 = 53 % ((29 - arg0) / 34);
        int var7 = (var5 << 12) / this.field3366;
        int var8 = (var7 << 12) / this.field3370;
        int var9 = this.field3364 * var8 >> 12;
        return ~(arg1 + arg2) > ~var9 && -var9 < arg1 + arg2;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)[I")
    public final int[] method106(int arg0, int arg1) {
        ++field3360;
        int[] var3 = super.field3952.method1262(arg0, 7492);
        if (super.field3952.field3276) {
            int var4 = class54.field879[arg0] + -2048;
            for (int var5 = 0; class234.field4046 > var5; ++var5) {
                int var6 = class281.field4923[var5] + -2048;
                int var7 = this.field3358 + var6;
                int var8 = var7 < -2048 ? var7 + 4096 : var7;
                int var9 = var8 <= 2048 ? var8 : var8 + -4096;
                int var10 = var4 - -this.field3368;
                int var11 = ~var10 > 2047 ? var10 + 4096 : var10;
                int var12 = this.field3369 + var6;
                int var13 = this.field3355 + var4;
                int var14 = var12 >= -2048 ? var12 : var12 + 4096;
                int var15 = ~var13 > 2047 ? var13 + 4096 : var13;
                int var16 = ~var11 >= -2049 ? var11 : var11 - 4096;
                int var17 = ~var15 < -2049 ? var15 + -4096 : var15;
                int var18 = var14 <= 2048 ? var14 : var14 + -4096;
                var3[var5] = !this.method1297(113, var16, var9) && !this.method1295((byte) 126, var17, var18) ? 0 : 4096;
            }
        }
        if (arg1 != -3) {
            this.field3358 = 16;
        }
        return var3;
    }
}
