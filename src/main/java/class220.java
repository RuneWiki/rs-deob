import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class220 extends class185 {

    @OriginalMember(owner = "client!ef", name = "L", descriptor = "I")
    private int field3306 = 20;

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "I")
    private int field3304 = 0;

    @OriginalMember(owner = "client!ef", name = "Q", descriptor = "I")
    private int field3311 = 0;

    @OriginalMember(owner = "client!ef", name = "U", descriptor = "I")
    private int field3314 = 1365;

    @OriginalMember(owner = "client!ef", name = "P", descriptor = "[I")
    public static int[] field3310 = new int[2];

    @OriginalMember(owner = "client!ef", name = "R", descriptor = "I")
    public static int field3312 = -16 + (int) (33.0D * Math.random());

    @OriginalMember(owner = "client!ef", name = "X", descriptor = "[I")
    public static int[] field3316 = new int[128];

    @OriginalMember(owner = "client!ef", name = "K", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!ef", name = "O", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!ef", name = "S", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!ef", name = "Y", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!ef", name = "N", descriptor = "Lpf;")
    public static class294 field3308;

    @OriginalMember(owner = "client!ef", name = "V", descriptor = "[I")
    public static int[] field3315;

    @OriginalMember(owner = "client!ef", name = "M", descriptor = "[Z")
    public static boolean[] field3307;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "(I)V")
    public static void method1410(int arg0) {
        field3310 = null;
        field3308 = null;
        field3307 = null;
        field3316 = null;
        field3315 = null;
        if (arg0 != 69) {
            method1410(77);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILfl;I)V")
    public final void method27(int arg0, class248 arg1, int arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 == 3) {
                        this.field3311 = arg1.method1575(false);
                    }
                } else {
                    this.field3304 = arg1.method1575(false);
                }
            } else {
                this.field3306 = arg1.method1575(false);
            }
        } else {
            this.field3314 = arg1.method1575(false);
        }
        if (arg2 == -6357) {
            ++field3305;
        }
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
    public class220() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IC)C")
    public static final char method1411(int arg0, char arg1) {
        ++field3309;
        if (~arg1 == -199) {
            return 'E';
        } else if (arg1 == 230) {
            return 'e';
        } else if (arg1 == 223) {
            return 's';
        } else if (~arg1 == -339) {
            return 'E';
        } else if (arg1 == 339) {
            return 'e';
        } else {
            if (arg0 != -3202) {
                method1411(82, (char) 65533);
            }
            return '\u0000';
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)[I")
    public final int[] method34(int arg0, int arg1) {
        ++field3317;
        int[] var3 = super.field2804.method561(arg0, -2);
        if (super.field2804.field1384) {
            for (int var4 = 0; class174.field2648 > var4; ++var4) {
                int var5 = (class153.field2304[var4] << 12) / this.field3314 + this.field3304;
                int var6 = (class85.field1356[arg0] << 12) / this.field3314 + this.field3311;
                int var7 = var6;
                int var8 = var5;
                int var9 = var5;
                int var10 = var6 * var6 >> 12;
                int var11 = var6;
                int var12 = var5 * var5 >> 12;
                int var13 = 0;
                while (~(var12 - -var10) > -16385 && ~this.field3306 < ~var13) {
                    var11 = (var8 * var11 >> 12) * 2 - -var7;
                    ++var13;
                    var8 = var12 - var10 + var9;
                    var12 = var8 * var8 >> 12;
                    var10 = var11 * var11 >> 12;
                }
                var3[var4] = this.field3306 + -1 > var13 ? (var13 << 12) / this.field3306 : 0;
            }
        }
        if (arg1 <= 70) {
            method1410(127);
        }
        return var3;
    }
}
