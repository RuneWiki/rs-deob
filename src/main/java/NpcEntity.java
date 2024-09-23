import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("z")
public class NpcEntity extends PathingEntity {

    @OriginalMember(owner = "z", name = "pb", descriptor = "Z")
    private boolean field455 = true;

    @OriginalMember(owner = "z", name = "rb", descriptor = "Z")
    private boolean field457 = false;

    @OriginalMember(owner = "z", name = "qb", descriptor = "I")
    private int field456;

    @OriginalMember(owner = "z", name = "sb", descriptor = "Lhc;")
    public NpcType field458;

    @OriginalMember(owner = "z", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        if (this.field458 == null) {
            return null;
        } else {
            Model var2 = this.method115(true);
            if (arg0 != -21173) {
                throw new NullPointerException();
            } else if (var2 == null) {
                return null;
            } else {
                super.field446 = var2.field397;
                if (super.field433 != -1 && super.field434 != -1) {
                    SpotAnimType var3 = SpotAnimType.field1158[super.field433];
                    Model var4 = var3.method383();
                    if (var4 != null) {
                        int var5 = var3.field1162.field1138[super.field434];
                        Model var6 = new Model(false, -164, var4, true, AnimFrame.method48(var5, 62));
                        var6.method138(-super.field437, -34664, 0, 0);
                        var6.method132(this.field456);
                        var6.method133(-278, var5);
                        var6.field572 = null;
                        var6.field571 = null;
                        if (var3.field1165 != 128 || var3.field1166 != 128) {
                            var6.method141(var3.field1165, false, var3.field1165, var3.field1166);
                        }
                        var6.method142(var3.field1168 + 64, var3.field1169 + 850, -30, -50, -30, true);
                        Model[] var7 = new Model[] { var2, var6 };
                        var2 = new Model(2, true, var7, 144);
                    }
                }
                if (this.field458.field1010 == 1) {
                    var2.field573 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "z", name = "b", descriptor = "(Z)Leb;")
    private final Model method115(boolean arg0) {
        if (!arg0) {
            this.field455 = !this.field455;
        }
        if (super.field428 >= 0 && super.field431 == 0) {
            int var2 = SeqType.field1136[super.field428].field1138[super.field429];
            int var3 = -1;
            if (super.field425 >= 0 && super.field425 != super.field405) {
                var3 = SeqType.field1136[super.field425].field1138[super.field426];
            }
            return this.field458.method341(this.field457, var3, var2, SeqType.field1136[super.field428].field1142);
        } else {
            int var4 = -1;
            if (super.field425 >= 0) {
                var4 = SeqType.field1136[super.field425].field1138[super.field426];
            }
            return this.field458.method341(this.field457, -1, var4, (int[]) null);
        }
    }

    @OriginalMember(owner = "z", name = "a", descriptor = "(Z)Z")
    public final boolean method113(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        } else {
            return this.field458 != null;
        }
    }
}
