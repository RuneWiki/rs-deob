import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ab")
public class NpcEntity extends PathingEntity {

    @OriginalMember(owner = "ab", name = "qb", descriptor = "Lgc;")
    public NpcType field464;

    @OriginalMember(owner = "ab", name = "a", descriptor = "(I)Lfb;")
    public final Model method123(int arg0) {
        if (this.field464 == null) {
            return null;
        } else {
            Model var2 = this.method129(-466);
            if (var2 == null) {
                return null;
            } else {
                super.field455 = var2.field406;
                if (arg0 != -28205) {
                    for (int var3 = 1; var3 > 0; ++var3) {
                    }
                }
                if (super.field442 != -1 && super.field443 != -1) {
                    SpotAnimType var4 = SpotAnimType.field1143[super.field442];
                    Model var5 = var4.method388();
                    if (var5 != null) {
                        int var6 = var4.field1147.field1123[super.field443];
                        Model var7 = new Model(AnimFrame.method62((byte) 17, var6), var5, true, 0, false);
                        var7.method152(false, 0, 0, -super.field446);
                        var7.method146(0);
                        var7.method147((byte) 2, var6);
                        var7.field577 = null;
                        var7.field576 = null;
                        if (var4.field1150 != 128 || var4.field1151 != 128) {
                            var7.method155(var4.field1150, (byte) 9, var4.field1150, var4.field1151);
                        }
                        var7.method156(var4.field1153 + 64, var4.field1154 + 850, -30, -50, -30, true);
                        Model[] var8 = new Model[] { var2, var7 };
                        var2 = new Model(var8, 2, 294, true);
                    }
                }
                if (this.field464.field994 == 1) {
                    var2.field578 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "ab", name = "d", descriptor = "(I)Lfb;")
    private final Model method129(int arg0) {
        if (arg0 < 0) {
            if (super.field437 >= 0 && super.field440 == 0) {
                int var2 = SeqType.field1121[super.field437].field1123[super.field438];
                int var3 = -1;
                if (super.field434 >= 0 && super.field434 != super.field414) {
                    var3 = SeqType.field1121[super.field434].field1123[super.field435];
                }
                return this.field464.method346(var2, SeqType.field1121[super.field437].field1127, var3, 0);
            } else {
                int var4 = -1;
                if (super.field434 >= 0) {
                    var4 = SeqType.field1121[super.field434].field1123[super.field435];
                }
                return this.field464.method346(var4, (int[]) null, -1, 0);
            }
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "ab", name = "c", descriptor = "(I)Z")
    public final boolean method127(int arg0) {
        int var2 = 46 / arg0;
        return this.field464 != null;
    }
}
