import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class197 extends class232 {

    @OriginalMember(owner = "client!ch", name = "U", descriptor = "I")
    private int field3369 = 0;

    @OriginalMember(owner = "client!ch", name = "X", descriptor = "I")
    private int field3372 = 10;

    @OriginalMember(owner = "client!ch", name = "gb", descriptor = "I")
    private int field3381 = 2048;

    @OriginalMember(owner = "client!ch", name = "Q", descriptor = "I")
    public static int field3365 = 0;

    @OriginalMember(owner = "client!ch", name = "S", descriptor = "Lhi;")
    public static class82 field3367 = class95.method664((byte) -106, "Atteindre");

    @OriginalMember(owner = "client!ch", name = "eb", descriptor = "Lhi;")
    public static class82 field3379 = class95.method664((byte) -35, "<col=80ff00>");

    @OriginalMember(owner = "client!ch", name = "R", descriptor = "Lam;")
    public static class277 field3366 = new class277();

    @OriginalMember(owner = "client!ch", name = "P", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!ch", name = "T", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!ch", name = "V", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!ch", name = "W", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!ch", name = "Z", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!ch", name = "db", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!ch", name = "fb", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!ch", name = "Y", descriptor = "[I")
    private int[] field3373;

    @OriginalMember(owner = "client!ch", name = "ab", descriptor = "[I")
    public static int[] field3375;

    @OriginalMember(owner = "client!ch", name = "bb", descriptor = "[I")
    private int[] field3376;

    @OriginalMember(owner = "client!ch", name = "cb", descriptor = "[Lti;")
    public static class186[] field3377;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(IB)[I", line = 9)
    public final int[] method80(int arg0, byte arg1) {
        field3364++;
        int[] var3 = this.field4008.method131((byte) -91, arg0);
        if (this.field4008.field256) {
            int var4 = class273.field4607[arg0];
            if (this.field3369 == 0) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field3372; var6++) {
                    if (var4 >= this.field3376[var6] && this.field3376[var6 + 1] > var4) {
                        if (var4 < this.field3373[var6]) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class190.method1321(var3, 0, class54.field858, var5);
            } else {
                for (int var7 = 0; var7 < class54.field858; var7++) {
                    short var8 = 0;
                    int var9 = 0;
                    int var10 = class24.field329[var7];
                    int var11 = this.field3369;
                    if (var11 == 1) {
                        var9 = var10;
                    } else if (var11 == 2) {
                        var9 = (var10 + var4 - 4096 >> 1) + 2048;
                    } else if (var11 == 3) {
                        var9 = (var10 - var4 >> 1) + 2048;
                    }
                    for (int var12 = 0; var12 < this.field3372; var12++) {
                        if (var9 >= this.field3376[var12] && this.field3376[var12 + 1] > var9) {
                            if (this.field3373[var12] > var9) {
                                var8 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var8;
                }
            }
        }
        int var13 = 66 % ((arg1 + 31) / 55);
        return var3;
    }

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "(I)V", line = 126)
    public final void method144(int arg0) {
        field3368++;
        this.method1382(0);
        if (arg0 <= 48) {
            field3375 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(B)I", line = 140)
    public static final int method1380(byte arg0) {
        if (arg0 <= 91) {
            return 101;
        } else {
            field3371++;
            return class297.field5057 == null || class297.field5057.field4312 <= class16.field148 ? -1 : class16.field148++;
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V", line = 153)
    public class197() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "(I)V", line = 160)
    public static void method1381(int arg0) {
        field3375 = null;
        if (arg0 != 0) {
            method1380((byte) 127);
        }
        field3377 = null;
        field3379 = null;
        field3367 = null;
        field3366 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IBLbc;)V", line = 198)
    public final void method81(int arg0, byte arg1, class153 arg2) {
        if (arg1 != -19) {
            return;
        }
        field3378++;
        if (arg0 == 0) {
            this.field3372 = arg2.method1082(-93);
        } else if (arg0 == 1) {
            this.field3381 = arg2.method1090(false);
        } else if (arg0 == 2) {
            this.field3369 = arg2.method1082(arg1 ^ 0x6F);
        }
    }

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "(I)V", line = 259)
    private final void method1382(int arg0) {
        this.field3376 = new int[this.field3372 + 1];
        this.field3373 = new int[this.field3372 + 1];
        field3370++;
        int var2 = 0;
        int var3 = 4096 / this.field3372;
        int var4 = this.field3381 * var3 >> 12;
        for (int var5 = 0; var5 < this.field3372; var5++) {
            this.field3376[var5] = var2;
            this.field3373[var5] = var2 + var4;
            var2 += var3;
        }
        this.field3376[this.field3372] = 4096;
        this.field3373[this.field3372] = this.field3373[arg0] + 4096;
    }
}
