import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ab")
public class NpcEntity extends PathingEntity {

    @OriginalMember(owner = "ab", name = "ob", descriptor = "I")
    private int field455 = -45277;

    @OriginalMember(owner = "ab", name = "nb", descriptor = "I")
    private int field454;

    @OriginalMember(owner = "ab", name = "pb", descriptor = "Lfc;")
    public NpcType field456;

    @OriginalMember(owner = "ab", name = "a", descriptor = "(Z)Lfb;")
    public final Model method121(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field456 == null) {
            return null;
        } else {
            Model var3 = this.method125((byte) 7);
            if (var3 == null) {
                return null;
            } else {
                super.field447 = var3.field398;
                if (super.field434 != -1 && super.field435 != -1) {
                    SpotAnimType var4 = SpotAnimType.field1097[super.field434];
                    Model var5 = var4.method377();
                    if (var5 != null) {
                        Model var6 = new Model(-435, true, false, var5, !var4.field1102);
                        var6.method148(-super.field438, this.field455, 0, 0);
                        var6.method142(8);
                        var6.method143(true, var4.field1101.field1083[super.field435]);
                        var6.field566 = null;
                        var6.field565 = null;
                        if (var4.field1105 != 128 || var4.field1106 != 128) {
                            var6.method151(var4.field1106, var4.field1105, 0, var4.field1105);
                        }
                        var6.method152(var4.field1108 + 64, var4.field1109 + 850, -30, -50, -30, true);
                        Model[] var7 = new Model[] { var3, var6 };
                        var3 = new Model(var7, 2, true, this.field454);
                    }
                }
                if (this.field456.field965 == 1) {
                    var3.field567 = true;
                }
                return var3;
            }
        }
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(B)Lfb;")
    private final Model method125(byte arg0) {
        if (arg0 != 7) {
            throw new NullPointerException();
        } else if (super.field429 >= 0 && super.field432 == 0) {
            int var2 = SeqType.field1081[super.field429].field1083[super.field430];
            int var3 = -1;
            if (super.field426 >= 0 && super.field426 != super.field407) {
                var3 = SeqType.field1081[super.field426].field1083[super.field427];
            }
            return this.field456.method335(var3, var2, false, SeqType.field1081[super.field429].field1087);
        } else {
            int var4 = -1;
            if (super.field426 >= 0) {
                var4 = SeqType.field1081[super.field426].field1083[super.field427];
            }
            return this.field456.method335(-1, var4, false, (int[]) null);
        }
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(I)Z")
    public final boolean method124(int arg0) {
        if (arg0 != -27441) {
            this.field455 = -263;
        }
        return this.field456 != null;
    }
}
