import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ab")
public class NpcEntity extends PathingEntity {

    @OriginalMember(owner = "ab", name = "mb", descriptor = "I")
    private int field449 = 487;

    @OriginalMember(owner = "ab", name = "nb", descriptor = "Lfc;")
    public NpcType field450;

    @OriginalMember(owner = "ab", name = "a", descriptor = "(I)Lfb;")
    public final Model method121(int arg0) {
        if (this.field450 == null) {
            return null;
        } else {
            Model var2 = this.method125(this.field449);
            if (arg0 != 0) {
                this.field449 = 73;
            }
            if (var2 == null) {
                return null;
            } else {
                super.field442 = var2.field394;
                if (super.field429 != -1 && super.field430 != -1) {
                    SpotAnimType var3 = SpotAnimType.field1084[super.field429];
                    Model var4 = var3.method373();
                    if (var4 != null) {
                        Model var5 = new Model(8, true, !var3.field1089, false, var4);
                        var5.method148(false, -super.field433, 0, 0);
                        var5.method142((byte) 9);
                        var5.method143(var3.field1088.field1071[super.field430], false);
                        var5.field557 = null;
                        var5.field556 = null;
                        if (var3.field1092 != 128 || var3.field1093 != 128) {
                            var5.method151(var3.field1092, var3.field1092, var3.field1093, -797);
                        }
                        var5.method152(var3.field1095 + 64, var3.field1096 + 850, -30, -50, -30, true);
                        Model[] var6 = new Model[] { var2, var5 };
                        var2 = new Model(true, 2, var6, -591);
                    }
                }
                if (this.field450.field956 == 1) {
                    var2.field558 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "ab", name = "c", descriptor = "(I)Lfb;")
    private final Model method125(int arg0) {
        int var2 = 80 / arg0;
        if (super.field424 >= 0 && super.field427 == 0) {
            int var3 = SeqType.field1069[super.field424].field1071[super.field425];
            int var4 = -1;
            if (super.field421 >= 0 && super.field421 != super.field402) {
                var4 = SeqType.field1069[super.field421].field1071[super.field422];
            }
            return this.field450.method331(var3, var4, SeqType.field1069[super.field424].field1075, 0);
        } else {
            int var5 = -1;
            if (super.field421 >= 0) {
                var5 = SeqType.field1069[super.field421].field1071[super.field422];
            }
            return this.field450.method331(var5, -1, (int[]) null, 0);
        }
    }

    @OriginalMember(owner = "ab", name = "b", descriptor = "(I)Z")
    public final boolean method124(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        } else {
            return this.field450 != null;
        }
    }
}
