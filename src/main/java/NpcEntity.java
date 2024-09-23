import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("y")
public class NpcEntity extends PathingEntity {

    @OriginalMember(owner = "y", name = "fb", descriptor = "Z")
    private boolean field357 = false;

    @OriginalMember(owner = "y", name = "gb", descriptor = "Lbc;")
    public NpcType field358;

    @OriginalMember(owner = "y", name = "a", descriptor = "(I)Leb;")
    public final Model method108(int arg0) {
        if (this.field358 == null) {
            return null;
        } else if (super.field337 != -1 && super.field338 != -1) {
            Model var2 = this.method112(false);
            SpotAnimType var3 = SpotAnimType.field1039[super.field337];
            Model var4 = new Model(!var3.field1043, false, false, var3.method322(), true);
            var4.method132(3, 0, -super.field341, 0);
            var4.method126(-36895);
            var4.method127(1, var3.field1042.field1025[super.field338]);
            var4.field479 = null;
            var4.field478 = null;
            if (var3.field1046 != 128 || var3.field1047 != 128) {
                var4.method135(var3.field1046, var3.field1046, true, var3.field1047);
            }
            var4.method136(var3.field1049 + 64, var3.field1050 + 850, -30, -50, -30, true);
            Model[] var5 = new Model[] { var2, var4 };
            Model var6 = new Model(982, 2, true, var5);
            if (arg0 != 1) {
                this.field357 = !this.field357;
            }
            if (this.field358.field850 == 1) {
                var6.field480 = true;
            }
            return var6;
        } else {
            return this.method112(false);
        }
    }

    @OriginalMember(owner = "y", name = "b", descriptor = "(Z)Leb;")
    public final Model method112(boolean arg0) {
        if (super.field332 >= 0 && super.field335 == 0) {
            int var2 = SeqType.field1023[super.field332].field1025[super.field333];
            int var3 = -1;
            if (super.field329 >= 0 && super.field329 != super.field310) {
                var3 = SeqType.field1023[super.field329].field1025[super.field330];
            }
            return this.field358.method283(var2, var3, SeqType.field1023[super.field332].field1029);
        } else {
            int var4 = -1;
            if (arg0) {
                for (int var5 = 1; var5 > 0; ++var5) {
                }
            }
            if (super.field329 >= 0) {
                var4 = SeqType.field1023[super.field329].field1025[super.field330];
            }
            Model var6 = this.field358.method283(var4, -1, (int[]) null);
            super.field350 = var6.field471;
            return var6;
        }
    }

    @OriginalMember(owner = "y", name = "a", descriptor = "(Z)Z")
    public final boolean method111(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        } else {
            return this.field358 != null;
        }
    }
}
