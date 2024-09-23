import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("z")
public class NpcEntity extends PathingEntity {

    @OriginalMember(owner = "z", name = "ub", descriptor = "Z")
    private boolean field461 = true;

    @OriginalMember(owner = "z", name = "wb", descriptor = "Z")
    private boolean field463 = false;

    @OriginalMember(owner = "z", name = "vb", descriptor = "I")
    private int field462;

    @OriginalMember(owner = "z", name = "xb", descriptor = "Lgc;")
    public NpcType field464;

    @OriginalMember(owner = "z", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        if (this.field464 == null) {
            return null;
        } else {
            Model var2 = this.method115(true);
            if (var2 == null) {
                return null;
            } else {
                super.field452 = var2.field399;
                if (arg0 != -47094) {
                    for (int var3 = 1; var3 > 0; ++var3) {
                    }
                }
                if (super.field439 != -1 && super.field440 != -1) {
                    SpotAnimType var4 = SpotAnimType.field1166[super.field439];
                    Model var5 = var4.method386();
                    if (var5 != null) {
                        int var6 = var4.field1170.field1147[super.field440];
                        Model var7 = new Model(false, -16051, var5, AnimFrame.method48(var6, this.field461), true);
                        var7.method139(-super.field443, 0, 0, 0);
                        var7.method133(true);
                        var7.method134(true, var6);
                        var7.field585 = null;
                        var7.field584 = null;
                        if (var4.field1173 != 128 || var4.field1174 != 128) {
                            var7.method142(19411, var4.field1173, var4.field1173, var4.field1174);
                        }
                        var7.method143(var4.field1176 + 64, var4.field1177 + 850, -30, -50, -30, true);
                        Model[] var8 = new Model[] { var2, var7 };
                        var2 = new Model(3, var8, true, 2);
                    }
                }
                if (this.field464.field1018 == 1) {
                    var2.field586 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "z", name = "b", descriptor = "(Z)Leb;")
    private final Model method115(boolean arg0) {
        if (super.field434 >= 0 && super.field437 == 0) {
            int var2 = SeqType.field1145[super.field434].field1147[super.field435];
            int var3 = -1;
            if (super.field431 >= 0 && super.field431 != super.field411) {
                var3 = SeqType.field1145[super.field431].field1147[super.field432];
            }
            return this.field464.method343(var2, var3, false, SeqType.field1145[super.field434].field1151);
        } else {
            int var4 = -1;
            if (!arg0) {
                for (int var5 = 1; var5 > 0; ++var5) {
                }
            }
            if (super.field431 >= 0) {
                var4 = SeqType.field1145[super.field431].field1147[super.field432];
            }
            return this.field464.method343(var4, -1, false, (int[]) null);
        }
    }

    @OriginalMember(owner = "z", name = "a", descriptor = "(Z)Z")
    public final boolean method113(boolean arg0) {
        if (arg0) {
            this.field462 = -9;
        }
        return this.field464 != null;
    }
}
