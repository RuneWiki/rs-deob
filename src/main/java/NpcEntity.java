import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("z")
public class NpcEntity extends PathingEntity {

    @OriginalMember(owner = "z", name = "ub", descriptor = "Z")
    private boolean field453 = true;

    @OriginalMember(owner = "z", name = "vb", descriptor = "I")
    private int field454 = 7;

    @OriginalMember(owner = "z", name = "tb", descriptor = "I")
    private int field452;

    @OriginalMember(owner = "z", name = "wb", descriptor = "Lgc;")
    public NpcType field455;

    @OriginalMember(owner = "z", name = "a", descriptor = "(Z)Leb;")
    public final Model method109(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        } else if (this.field455 == null) {
            return null;
        } else {
            Model var2 = this.method115(2);
            if (var2 == null) {
                return null;
            } else {
                super.field443 = var2.field393;
                if (super.field430 != -1 && super.field431 != -1) {
                    SpotAnimType var3 = SpotAnimType.field1148[super.field430];
                    Model var4 = var3.method380();
                    if (var4 != null) {
                        int var5 = var3.field1152.field1128[super.field431];
                        Model var6 = new Model(9, false, AnimFrame.method48(this.field452, var5), true, var4);
                        var6.method138(0, -super.field434, (byte) 25, 0);
                        var6.method132(45941);
                        var6.method133(3, var5);
                        var6.field570 = null;
                        var6.field569 = null;
                        if (var3.field1155 != 128 || var3.field1156 != 128) {
                            var6.method141(var3.field1155, var3.field1155, (byte) 62, var3.field1156);
                        }
                        var6.method142(var3.field1158 + 64, var3.field1159 + 850, -30, -50, -30, true);
                        Model[] var7 = new Model[] { var2, var6 };
                        var2 = new Model(true, var7, true, 2);
                    }
                }
                if (this.field455.field999 == 1) {
                    var2.field571 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "z", name = "a", descriptor = "(I)Leb;")
    private final Model method115(int arg0) {
        if (arg0 != 2) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (super.field425 >= 0 && super.field428 == 0) {
            int var3 = SeqType.field1126[super.field425].field1128[super.field426];
            int var4 = -1;
            if (super.field422 >= 0 && super.field422 != super.field402) {
                var4 = SeqType.field1126[super.field422].field1128[super.field423];
            }
            return this.field455.method338(0, var3, var4, SeqType.field1126[super.field425].field1132);
        } else {
            int var5 = -1;
            if (super.field422 >= 0) {
                var5 = SeqType.field1126[super.field422].field1128[super.field423];
            }
            return this.field455.method338(0, var5, -1, (int[]) null);
        }
    }

    @OriginalMember(owner = "z", name = "b", descriptor = "(B)Z")
    public final boolean method113(byte arg0) {
        if (arg0 != 121) {
            this.field454 = 481;
        }
        return this.field455 != null;
    }
}
