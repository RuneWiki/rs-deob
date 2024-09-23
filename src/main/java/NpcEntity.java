import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("y")
public class NpcEntity extends PathingEntity {

    @OriginalMember(owner = "y", name = "ib", descriptor = "Z")
    private boolean field359 = true;

    @OriginalMember(owner = "y", name = "hb", descriptor = "I")
    private int field358;

    @OriginalMember(owner = "y", name = "jb", descriptor = "Lbc;")
    public NpcType field360;

    @OriginalMember(owner = "y", name = "a", descriptor = "(I)Leb;")
    public final Model method108(int arg0) {
        if (this.field360 == null) {
            return null;
        } else if (super.field338 != -1 && super.field339 != -1) {
            Model var2 = this.method112(this.field359);
            SpotAnimType var3 = SpotAnimType.field1061[super.field338];
            Model var4 = new Model(364, var3.method322(), !var3.field1065, false, true);
            var4.method132(0, this.field358, 0, -super.field342);
            var4.method126(797);
            var4.method127(var3.field1064.field1045[super.field339], (byte) -89);
            var4.field486 = null;
            var4.field485 = null;
            if (var3.field1068 != 128 || var3.field1069 != 128) {
                var4.method135(var3.field1069, -221, var3.field1068, var3.field1068);
            }
            var4.method136(var3.field1071 + 64, var3.field1072 + 850, -30, -50, -30, true);
            Model[] var5 = new Model[] { var2, var4 };
            Model var6 = new Model(2, var5, false, true);
            int var7 = 67 / arg0;
            if (this.field360.field865 == 1) {
                var6.field487 = true;
            }
            return var6;
        } else {
            return this.method112(this.field359);
        }
    }

    @OriginalMember(owner = "y", name = "a", descriptor = "(Z)Leb;")
    public final Model method112(boolean arg0) {
        if (!arg0) {
            this.field359 = !this.field359;
        }
        if (super.field333 >= 0 && super.field336 == 0) {
            int var2 = SeqType.field1043[super.field333].field1045[super.field334];
            int var3 = -1;
            if (super.field330 >= 0 && super.field330 != super.field311) {
                var3 = SeqType.field1043[super.field330].field1045[super.field331];
            }
            return this.field360.method283(var2, var3, SeqType.field1043[super.field333].field1049);
        } else {
            int var4 = -1;
            if (super.field330 >= 0) {
                var4 = SeqType.field1043[super.field330].field1045[super.field331];
            }
            Model var5 = this.field360.method283(var4, -1, (int[]) null);
            super.field351 = var5.field478;
            return var5;
        }
    }

    @OriginalMember(owner = "y", name = "b", descriptor = "(I)Z")
    public final boolean method111(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        } else {
            return this.field360 != null;
        }
    }
}
