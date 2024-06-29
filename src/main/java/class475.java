import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class475 extends class149 {

    @OriginalMember(owner = "client!bm", name = "N", descriptor = "I")
    private int field6919 = 10;

    @OriginalMember(owner = "client!bm", name = "R", descriptor = "I")
    private int field6923 = 0;

    @OriginalMember(owner = "client!bm", name = "O", descriptor = "I")
    private int field6920 = 2048;

    @OriginalMember(owner = "client!bm", name = "K", descriptor = "Z")
    public static boolean field6916 = false;

    @OriginalMember(owner = "client!bm", name = "P", descriptor = "I")
    public static int field6921 = 0;

    @OriginalMember(owner = "client!bm", name = "I", descriptor = "I")
    public static int field6914;

    @OriginalMember(owner = "client!bm", name = "J", descriptor = "I")
    public static int field6915;

    @OriginalMember(owner = "client!bm", name = "L", descriptor = "I")
    public static int field6917;

    @OriginalMember(owner = "client!bm", name = "Q", descriptor = "I")
    public static int field6922;

    @OriginalMember(owner = "client!bm", name = "M", descriptor = "[I")
    private int[] field6918;

    @OriginalMember(owner = "client!bm", name = "S", descriptor = "[I")
    private int[] field6924;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "(I)V")
    public final void method99(int arg0) {
        this.method2841(true);
        if (arg0 > -86) {
            this.method93(115, (byte) 33, (class91) null);
        }
        ++field6914;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)[I")
    public final int[] method92(int arg0, int arg1) {
        ++field6922;
        if (arg0 != -10835) {
            this.field6919 = 119;
        }
        int[] var3 = super.field2152.method2891(arg1, (byte) 118);
        if (super.field2152.field7051) {
            int var4 = class185.field2613[arg1];
            if (this.field6923 == 0) {
                short var5 = 0;
                for (int var6 = 0; this.field6919 > var6; ++var6) {
                    if (var4 >= this.field6918[var6] && ~var4 > ~this.field6918[var6 - -1]) {
                        if (~var4 > ~this.field6924[var6]) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class361.method2283(var3, 0, class316.field4838, var5);
            } else {
                for (int var7 = 0; ~class316.field4838 < ~var7; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class197.field2791[var7];
                    int var11 = this.field6923;
                    if (~var11 != -2) {
                        if (var11 != 2) {
                            if (~var11 == -4) {
                                var8 = (var10 - var4 >> 1) + 2048;
                            }
                        } else {
                            var8 = 2048 - -(var4 + -4096 + var10 >> 1);
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; ~var12 > ~this.field6919; ++var12) {
                        if (~var8 <= ~this.field6918[var12] && ~this.field6918[var12 + 1] < ~var8) {
                            if (~this.field6924[var12] < ~var8) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Z)V")
    private final void method2841(boolean arg0) {
        if (arg0) {
            ++field6917;
            int var2 = 0;
            this.field6918 = new int[this.field6919 + 1];
            this.field6924 = new int[this.field6919 - -1];
            int var3 = 4096 / this.field6919;
            int var4 = this.field6920 * var3 >> 12;
            for (int var5 = 0; var5 < this.field6919; ++var5) {
                this.field6918[var5] = var2;
                this.field6924[var5] = var2 + var4;
                var2 += var3;
            }
            this.field6918[this.field6919] = 4096;
            this.field6924[this.field6919] = this.field6924[0] + 4096;
        }
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V")
    public class475() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IBLtl;)V")
    public final void method93(int arg0, byte arg1, class91 arg2) {
        ++field6915;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field6923 = arg2.method618((byte) 100);
                }
            } else {
                this.field6920 = arg2.method631(10494);
            }
        } else {
            this.field6919 = arg2.method618((byte) 100);
        }
        if (arg1 != 35) {
            this.field6920 = -75;
        }
    }
}
