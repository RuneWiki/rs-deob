import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ab")
public class NpcEntity extends PathingEntity {

    @OriginalMember(owner = "ab", name = "pb", descriptor = "B")
    private byte field468 = 86;

    @OriginalMember(owner = "ab", name = "qb", descriptor = "Z")
    private boolean field469 = true;

    @OriginalMember(owner = "ab", name = "rb", descriptor = "B")
    private byte field470 = 3;

    @OriginalMember(owner = "ab", name = "sb", descriptor = "Lgc;")
    public NpcType field471;

    @OriginalMember(owner = "ab", name = "a", descriptor = "(I)Lfb;")
    public final Model method122(int arg0) {
        if (this.field471 == null) {
            return null;
        } else {
            Model var2 = this.method128(this.field469);
            if (var2 == null) {
                return null;
            } else {
                super.field460 = var2.field410;
                if (arg0 != -13634) {
                    throw new NullPointerException();
                } else {
                    if (super.field447 != -1 && super.field448 != -1) {
                        SpotAnimType var3 = SpotAnimType.field1142[super.field447];
                        Model var4 = var3.method386();
                        if (var4 != null) {
                            Model var5 = new Model(true, var4, false, true, !var3.field1147);
                            var5.method151(0, (byte) 3, 0, -super.field451);
                            var5.method145(this.field468);
                            var5.method146(true, var3.field1146.field1127[super.field448]);
                            var5.field582 = null;
                            var5.field581 = null;
                            if (var3.field1150 != 128 || var3.field1151 != 128) {
                                var5.method154(var3.field1150, var3.field1150, var3.field1151, 7);
                            }
                            var5.method155(var3.field1153 + 64, var3.field1154 + 850, -30, -50, -30, true);
                            Model[] var6 = new Model[] { var2, var5 };
                            var2 = new Model((byte) 22, 2, true, var6);
                        }
                    }
                    if (this.field471.field998 == 1) {
                        var2.field583 = true;
                    }
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(Z)Lfb;")
    private final Model method128(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        } else if (super.field442 >= 0 && super.field445 == 0) {
            int var2 = SeqType.field1125[super.field442].field1127[super.field443];
            int var3 = -1;
            if (super.field439 >= 0 && super.field439 != super.field419) {
                var3 = SeqType.field1125[super.field439].field1127[super.field440];
            }
            return this.field471.method344(var2, this.field470, SeqType.field1125[super.field442].field1131, var3);
        } else {
            int var4 = -1;
            if (super.field439 >= 0) {
                var4 = SeqType.field1125[super.field439].field1127[super.field440];
            }
            return this.field471.method344(var4, this.field470, (int[]) null, -1);
        }
    }

    @OriginalMember(owner = "ab", name = "b", descriptor = "(B)Z")
    public final boolean method126(byte arg0) {
        if (arg0 != 5) {
            throw new NullPointerException();
        } else {
            return this.field471 != null;
        }
    }
}
