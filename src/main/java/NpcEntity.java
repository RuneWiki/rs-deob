import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ab")
public class NpcEntity extends PathingEntity {

    @OriginalMember(owner = "ab", name = "qb", descriptor = "I")
    private int field463 = 650;

    @OriginalMember(owner = "ab", name = "rb", descriptor = "Lgc;")
    public NpcType field464;

    @OriginalMember(owner = "ab", name = "a", descriptor = "(I)Lfb;")
    public final Model method123(int arg0) {
        if (this.field464 == null) {
            return null;
        } else {
            Model var2 = this.method129(0);
            if (var2 == null) {
                return null;
            } else {
                super.field455 = var2.field404;
                int var3 = 84 / arg0;
                if (super.field442 != -1 && super.field443 != -1) {
                    SpotAnimType var4 = SpotAnimType.field1130[super.field442];
                    Model var5 = var4.method388();
                    if (var5 != null) {
                        int var6 = var4.field1134.field1112[super.field443];
                        Model var7 = new Model(23727, AnimFrame.method62(0, var6), true, var5, false);
                        var7.method152(0, (byte) 119, -super.field446, 0);
                        var7.method146(true);
                        var7.method147(var6, false);
                        var7.field576 = null;
                        var7.field575 = null;
                        if (var4.field1137 != 128 || var4.field1138 != 128) {
                            var7.method155(var4.field1137, (byte) 2, var4.field1138, var4.field1137);
                        }
                        var7.method156(var4.field1140 + 64, var4.field1141 + 850, -30, -50, -30, true);
                        Model[] var8 = new Model[] { var2, var7 };
                        var2 = new Model(2, 962, var8, true);
                    }
                }
                if (this.field464.field986 == 1) {
                    var2.field577 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "ab", name = "c", descriptor = "(I)Lfb;")
    private final Model method129(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (super.field437 >= 0 && super.field440 == 0) {
            int var3 = SeqType.field1110[super.field437].field1112[super.field438];
            int var4 = -1;
            if (super.field434 >= 0 && super.field434 != super.field414) {
                var4 = SeqType.field1110[super.field434].field1112[super.field435];
            }
            return this.field464.method346(var4, var3, -824, SeqType.field1110[super.field437].field1116);
        } else {
            int var5 = -1;
            if (super.field434 >= 0) {
                var5 = SeqType.field1110[super.field434].field1112[super.field435];
            }
            return this.field464.method346(-1, var5, -824, (int[]) null);
        }
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(Z)Z")
    public final boolean method127(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        return this.field464 != null;
    }
}
