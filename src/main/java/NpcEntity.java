import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("z")
public class NpcEntity extends PathingEntity {

    @OriginalMember(owner = "z", name = "qb", descriptor = "Z")
    private boolean field452 = true;

    @OriginalMember(owner = "z", name = "rb", descriptor = "Lgc;")
    public NpcType field453;

    @OriginalMember(owner = "z", name = "a", descriptor = "(Z)Leb;")
    public final Model method109(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field453 == null) {
            return null;
        } else {
            Model var3 = this.method115(true);
            if (var3 == null) {
                return null;
            } else {
                super.field443 = var3.field394;
                if (super.field430 != -1 && super.field431 != -1) {
                    SpotAnimType var4 = SpotAnimType.field1154[super.field430];
                    Model var5 = var4.method379();
                    if (var5 != null) {
                        int var6 = var4.field1158.field1135[super.field431];
                        Model var7 = new Model(true, AnimFrame.method48(var6, 0), var5, true, false);
                        var7.method138(0, -super.field434, (byte) 10, 0);
                        var7.method132(9);
                        var7.method133(var6, -284);
                        var7.field568 = null;
                        var7.field567 = null;
                        if (var4.field1161 != 128 || var4.field1162 != 128) {
                            var7.method141(9, var4.field1161, var4.field1161, var4.field1162);
                        }
                        var7.method142(var4.field1164 + 64, var4.field1165 + 850, -30, -50, -30, true);
                        Model[] var8 = new Model[] { var3, var7 };
                        var3 = new Model(true, (byte) 72, var8, 2);
                    }
                }
                if (this.field453.field1006 == 1) {
                    var3.field569 = true;
                }
                return var3;
            }
        }
    }

    @OriginalMember(owner = "z", name = "c", descriptor = "(Z)Leb;")
    private final Model method115(boolean arg0) {
        if (super.field425 >= 0 && super.field428 == 0) {
            int var2 = SeqType.field1133[super.field425].field1135[super.field426];
            int var3 = -1;
            if (super.field422 >= 0 && super.field422 != super.field402) {
                var3 = SeqType.field1133[super.field422].field1135[super.field423];
            }
            return this.field453.method337(var2, var3, 811, SeqType.field1133[super.field425].field1139);
        } else {
            int var4 = -1;
            if (!arg0) {
                this.field452 = !this.field452;
            }
            if (super.field422 >= 0) {
                var4 = SeqType.field1133[super.field422].field1135[super.field423];
            }
            return this.field453.method337(var4, -1, 811, (int[]) null);
        }
    }

    @OriginalMember(owner = "z", name = "a", descriptor = "(I)Z")
    public final boolean method113(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        } else {
            return this.field453 != null;
        }
    }
}
