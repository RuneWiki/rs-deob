import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ab")
public class NpcEntity extends PathingEntity {

    @OriginalMember(owner = "ab", name = "rb", descriptor = "B")
    private byte field482 = 0;

    @OriginalMember(owner = "ab", name = "sb", descriptor = "Z")
    private boolean field483 = true;

    @OriginalMember(owner = "ab", name = "tb", descriptor = "Lgc;")
    public NpcType field484;

    @OriginalMember(owner = "ab", name = "a", descriptor = "(B)Lfb;")
    public final Model method123(byte arg0) {
        if (this.field484 == null) {
            return null;
        } else {
            Model var2 = this.method129(372);
            if (var2 == null) {
                return null;
            } else {
                super.field474 = var2.field422;
                if (arg0 != 8) {
                    this.field483 = !this.field483;
                }
                if (super.field461 != -1 && super.field462 != -1) {
                    SpotAnimType var3 = SpotAnimType.field1169[super.field461];
                    Model var4 = var3.method388();
                    if (var4 != null) {
                        int var5 = var3.field1173.field1151[super.field462];
                        Model var6 = new Model(AnimFrame.method62((byte) 7, var5), false, true, true, var4);
                        var6.method152(0, 0, -super.field465, (byte) -20);
                        var6.method146((byte) 107);
                        var6.method147(this.field482, var5);
                        var6.field595 = null;
                        var6.field594 = null;
                        if (var3.field1176 != 128 || var3.field1177 != 128) {
                            var6.method155(var3.field1176, var3.field1177, (byte) -121, var3.field1176);
                        }
                        var6.method156(var3.field1179 + 64, var3.field1180 + 850, -30, -50, -30, true);
                        Model[] var7 = new Model[] { var2, var6 };
                        var2 = new Model(var7, true, 2, 0);
                    }
                }
                if (this.field484.field1021 == 1) {
                    var2.field596 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "ab", name = "c", descriptor = "(I)Lfb;")
    private final Model method129(int arg0) {
        int var2 = 2 / arg0;
        if (super.field456 >= 0 && super.field459 == 0) {
            int var3 = SeqType.field1149[super.field456].field1151[super.field457];
            int var4 = -1;
            if (super.field453 >= 0 && super.field453 != super.field433) {
                var4 = SeqType.field1149[super.field453].field1151[super.field454];
            }
            return this.field484.method346(var3, var4, SeqType.field1149[super.field456].field1155, -567);
        } else {
            int var5 = -1;
            if (super.field453 >= 0) {
                var5 = SeqType.field1149[super.field453].field1151[super.field454];
            }
            return this.field484.method346(var5, -1, (int[]) null, -567);
        }
    }

    @OriginalMember(owner = "ab", name = "b", descriptor = "(I)Z")
    public final boolean method127(int arg0) {
        if (arg0 != -42790) {
            throw new NullPointerException();
        } else {
            return this.field484 != null;
        }
    }
}
