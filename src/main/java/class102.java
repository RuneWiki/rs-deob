import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class102 extends class386 {

    @OriginalMember(owner = "client!jj", name = "H", descriptor = "I")
    private int field1360 = 0;

    @OriginalMember(owner = "client!jj", name = "I", descriptor = "I")
    private int field1361 = 20;

    @OriginalMember(owner = "client!jj", name = "G", descriptor = "I")
    private int field1359 = 0;

    @OriginalMember(owner = "client!jj", name = "J", descriptor = "I")
    private int field1362 = 1365;

    @OriginalMember(owner = "client!jj", name = "D", descriptor = "[I")
    public static int[] field1356 = new int[4];

    @OriginalMember(owner = "client!jj", name = "C", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!jj", name = "E", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!jj", name = "F", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(I)V")
    public static void method756(int arg0) {
        if (arg0 != 0) {
            method756(46);
        }
        field1356 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)[I")
    public final int[] method359(int arg0, int arg1) {
        ++field1355;
        int[] var3 = super.field5140.method1564(arg0, true);
        int var4 = -12 / ((arg1 - 13) / 40);
        if (super.field5140.field3482) {
            for (int var5 = 0; var5 < class599.field8643; ++var5) {
                int var6 = (class152.field1879[var5] << 12) / this.field1362 + this.field1360;
                int var7 = (class562.field8114[arg0] << 12) / this.field1362 + this.field1359;
                int var8 = var6;
                int var9 = var7;
                int var10 = var6;
                int var11 = var7;
                int var12 = var6 * var6 >> 12;
                int var13 = var7 * var7 >> 12;
                int var14 = 0;
                while (var12 + var13 < 16384 && this.field1361 > var14) {
                    var11 = (var10 * var11 >> 12) * 2 - -var9;
                    var10 = -var13 - -var8 + var12;
                    var12 = var10 * var10 >> 12;
                    ++var14;
                    var13 = var11 * var11 >> 12;
                }
                var3[var5] = ~var14 <= ~(this.field1361 + -1) ? 0 : (var14 << 12) / this.field1361;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V")
    public class102() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IBLun;)V")
    public final void method355(int arg0, byte arg1, class389 arg2) {
        ++field1358;
        if (arg1 <= 111) {
            this.field1360 = -100;
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 == -4) {
                        this.field1359 = arg2.method2260(-50);
                    }
                } else {
                    this.field1360 = arg2.method2260(-62);
                }
            } else {
                this.field1361 = arg2.method2260(-71);
            }
        } else {
            this.field1362 = arg2.method2260(-47);
        }
    }
}
