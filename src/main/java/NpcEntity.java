import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("z")
public class NpcEntity extends PathingEntity {

    @OriginalMember(owner = "z", name = "tb", descriptor = "I")
    private int field452 = 423;

    @OriginalMember(owner = "z", name = "ub", descriptor = "I")
    private int field453 = -148;

    @OriginalMember(owner = "z", name = "vb", descriptor = "Lgc;")
    public NpcType field454;

    @OriginalMember(owner = "z", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        if (arg0 != 0) {
            this.field452 = 436;
        }
        if (this.field454 == null) {
            return null;
        } else {
            Model var2 = this.method115(this.field453);
            if (var2 == null) {
                return null;
            } else {
                super.field443 = var2.field393;
                if (super.field430 != -1 && super.field431 != -1) {
                    SpotAnimType var3 = SpotAnimType.field1157[super.field430];
                    Model var4 = var3.method386();
                    if (var4 != null) {
                        int var5 = var3.field1161.field1136[super.field431];
                        Model var6 = new Model(var4, true, false, AnimFrame.method48(var5, -47594), 0);
                        var6.method139(-super.field434, 0, 0, 216);
                        var6.method133(0);
                        var6.method134(428, var5);
                        var6.field570 = null;
                        var6.field569 = null;
                        if (var3.field1164 != 128 || var3.field1165 != 128) {
                            var6.method142((byte) 4, var3.field1165, var3.field1164, var3.field1164);
                        }
                        var6.method143(var3.field1167 + 64, var3.field1168 + 850, -30, -50, -30, true);
                        Model[] var7 = new Model[] { var2, var6 };
                        var2 = new Model(true, var7, (byte) 4, 2);
                    }
                }
                if (this.field454.field1001 == 1) {
                    var2.field571 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "z", name = "c", descriptor = "(I)Leb;")
    private final Model method115(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        } else if (super.field425 >= 0 && super.field428 == 0) {
            int var2 = SeqType.field1134[super.field425].field1136[super.field426];
            int var3 = -1;
            if (super.field422 >= 0 && super.field422 != super.field402) {
                var3 = SeqType.field1134[super.field422].field1136[super.field423];
            }
            return this.field454.method343(var2, 175, var3, SeqType.field1134[super.field425].field1140);
        } else {
            int var4 = -1;
            if (super.field422 >= 0) {
                var4 = SeqType.field1134[super.field422].field1136[super.field423];
            }
            return this.field454.method343(var4, 175, -1, (int[]) null);
        }
    }

    @OriginalMember(owner = "z", name = "a", descriptor = "(Z)Z")
    public final boolean method113(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        return this.field454 != null;
    }
}
