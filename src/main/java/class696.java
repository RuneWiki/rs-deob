import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class696 extends class362 {

    @OriginalMember(owner = "client!gba", name = "A", descriptor = "I")
    private int field9626 = 20;

    @OriginalMember(owner = "client!gba", name = "C", descriptor = "I")
    private int field9628 = 0;

    @OriginalMember(owner = "client!gba", name = "E", descriptor = "I")
    private int field9629 = 1365;

    @OriginalMember(owner = "client!gba", name = "z", descriptor = "I")
    private int field9625 = 0;

    @OriginalMember(owner = "client!gba", name = "y", descriptor = "I")
    public static int field9624 = 0;

    @OriginalMember(owner = "client!gba", name = "B", descriptor = "I")
    public static int field9627;

    @OriginalMember(owner = "client!gba", name = "F", descriptor = "I")
    public static int field9630;

    @OriginalMember(owner = "client!gba", name = "c", descriptor = "(I)V")
    public static final void method3879(int arg0) {
        class70.field1028 = arg0;
        for (int var1 = 0; var1 < class441.field5980; ++var1) {
            for (int var2 = 0; var2 < class375.field5083; ++var2) {
                if (class325.field4448[arg0][var1][var2] == null) {
                    class325.field4448[arg0][var1][var2] = new class549(arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(II)[I")
    public final int[] method156(int arg0, int arg1) {
        ++field9627;
        int[] var3 = super.field4927.method808(-128, arg1);
        if (super.field4927.field1471) {
            for (int var4 = 0; var4 < class769.field10597; ++var4) {
                int var5 = (class172.field2750[var4] << 12) / this.field9629 - -this.field9628;
                int var6 = (class135.field2287[arg1] << 12) / this.field9629 + this.field9625;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (var11 + var12 < 16384 && ~var13 > ~this.field9626) {
                    var10 = (var9 * var10 >> 12) * 2 - -var8;
                    var9 = -var12 + var11 + var7;
                    var11 = var9 * var9 >> 12;
                    ++var13;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = var13 >= this.field9626 + -1 ? 0 : (var13 << 12) / this.field9626;
            }
        }
        if (arg0 != -2026769311) {
            this.field9626 = 106;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "()V")
    public class696() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lfca;II)V")
    public final void method154(class93 arg0, int arg1, int arg2) {
        if (arg2 == -1) {
            ++field9630;
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (arg1 != 2) {
                        if (arg1 == 3) {
                            this.field9625 = arg0.method763(98);
                        }
                    } else {
                        this.field9628 = arg0.method763(100);
                    }
                } else {
                    this.field9626 = arg0.method763(-117);
                }
            } else {
                this.field9629 = arg0.method763(arg2 ^ 27);
            }
        }
    }
}
