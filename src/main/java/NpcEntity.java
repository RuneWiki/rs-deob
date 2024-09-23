import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("z")
public class NpcEntity extends PathingEntity {

    @OriginalMember(owner = "z", name = "qb", descriptor = "Z")
    private boolean field452 = true;

    @OriginalMember(owner = "z", name = "rb", descriptor = "I")
    private int field453 = 6;

    @OriginalMember(owner = "z", name = "sb", descriptor = "I")
    private int field454 = -262;

    @OriginalMember(owner = "z", name = "tb", descriptor = "Lgc;")
    public NpcType field455;

    @OriginalMember(owner = "z", name = "a", descriptor = "(B)Leb;")
    public final Model method109(byte arg0) {
        if (this.field455 == null) {
            return null;
        } else {
            Model var2 = this.method115(this.field454);
            if (arg0 != -67) {
                this.field452 = !this.field452;
            }
            if (var2 == null) {
                return null;
            } else {
                super.field443 = var2.field394;
                if (super.field430 != -1 && super.field431 != -1) {
                    SpotAnimType var3 = SpotAnimType.field1157[super.field430];
                    Model var4 = var3.method386();
                    if (var4 != null) {
                        int var5 = var3.field1161.field1137[super.field431];
                        Model var6 = new Model(false, true, AnimFrame.method48(4, var5), var4, 396);
                        var6.method139(this.field453, 0, -super.field434, 0);
                        var6.method133(false);
                        var6.method134(2, var5);
                        var6.field573 = null;
                        var6.field572 = null;
                        if (var3.field1164 != 128 || var3.field1165 != 128) {
                            var6.method142(var3.field1164, var3.field1164, var3.field1165, 0);
                        }
                        var6.method143(var3.field1167 + 64, var3.field1168 + 850, -30, -50, -30, true);
                        Model[] var7 = new Model[] { var2, var6 };
                        var2 = new Model(2, false, var7, true);
                    }
                }
                if (this.field455.field1009 == 1) {
                    var2.field574 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "z", name = "b", descriptor = "(I)Leb;")
    private final Model method115(int arg0) {
        if (super.field425 >= 0 && super.field428 == 0) {
            int var2 = SeqType.field1135[super.field425].field1137[super.field426];
            int var3 = -1;
            if (super.field422 >= 0 && super.field422 != super.field402) {
                var3 = SeqType.field1135[super.field422].field1137[super.field423];
            }
            return this.field455.method343(var2, SeqType.field1135[super.field425].field1141, true, var3);
        } else {
            int var4 = -1;
            if (arg0 >= 0) {
                for (int var5 = 1; var5 > 0; ++var5) {
                }
            }
            if (super.field422 >= 0) {
                var4 = SeqType.field1135[super.field422].field1137[super.field423];
            }
            return this.field455.method343(var4, (int[]) null, true, -1);
        }
    }

    @OriginalMember(owner = "z", name = "a", descriptor = "(Z)Z")
    public final boolean method113(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        return this.field455 != null;
    }
}
