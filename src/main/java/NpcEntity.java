import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ab")
public class NpcEntity extends PathingEntity {

    @OriginalMember(owner = "ab", name = "pb", descriptor = "Z")
    private boolean field458 = false;

    @OriginalMember(owner = "ab", name = "qb", descriptor = "I")
    private int field459 = -949;

    @OriginalMember(owner = "ab", name = "rb", descriptor = "I")
    private int field460;

    @OriginalMember(owner = "ab", name = "sb", descriptor = "Lgc;")
    public NpcType field461;

    @OriginalMember(owner = "ab", name = "a", descriptor = "(I)Lfb;")
    public final Model method122(int arg0) {
        if (this.field461 == null) {
            return null;
        } else {
            Model var2 = this.method128(357);
            if (var2 == null) {
                return null;
            } else {
                super.field450 = var2.field400;
                if (arg0 != 5560) {
                    this.field459 = -451;
                }
                if (super.field437 != -1 && super.field438 != -1) {
                    SpotAnimType var3 = SpotAnimType.field1138[super.field437];
                    Model var4 = var3.method386();
                    if (var4 != null) {
                        Model var5 = new Model(var4, true, false, !var3.field1143, -796);
                        var5.method151(-super.field441, 0, 0, false);
                        var5.method145(-591);
                        var5.method146(var3.field1142.field1122[super.field438], 13056);
                        var5.field575 = null;
                        var5.field574 = null;
                        if (var3.field1146 != 128 || var3.field1147 != 128) {
                            var5.method154(var3.field1147, var3.field1146, 4, var3.field1146);
                        }
                        var5.method155(var3.field1149 + 64, var3.field1150 + 850, -30, -50, -30, true);
                        Model[] var6 = new Model[] { var2, var5 };
                        var2 = new Model(this.field460, true, 2, var6);
                    }
                }
                if (this.field461.field996 == 1) {
                    var2.field576 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "ab", name = "c", descriptor = "(I)Lfb;")
    private final Model method128(int arg0) {
        if (super.field432 >= 0 && super.field435 == 0) {
            int var2 = SeqType.field1120[super.field432].field1122[super.field433];
            int var3 = -1;
            if (super.field429 >= 0 && super.field429 != super.field409) {
                var3 = SeqType.field1120[super.field429].field1122[super.field430];
            }
            return this.field461.method344((byte) 0, var2, var3, SeqType.field1120[super.field432].field1126);
        } else {
            int var4 = -1;
            int var5 = 59 / arg0;
            if (super.field429 >= 0) {
                var4 = SeqType.field1120[super.field429].field1122[super.field430];
            }
            return this.field461.method344((byte) 0, var4, -1, (int[]) null);
        }
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(B)Z")
    public final boolean method126(byte arg0) {
        if (arg0 != 8) {
            this.field458 = !this.field458;
        }
        return this.field461 != null;
    }
}
