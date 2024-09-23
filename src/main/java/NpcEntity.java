import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("y")
public class NpcEntity extends PathingEntity {

    @OriginalMember(owner = "y", name = "hb", descriptor = "Z")
    private boolean field350 = true;

    @OriginalMember(owner = "y", name = "ib", descriptor = "I")
    private int field351 = 34304;

    @OriginalMember(owner = "y", name = "jb", descriptor = "Lbc;")
    public NpcType field352;

    @OriginalMember(owner = "y", name = "a", descriptor = "(Z)Leb;")
    public final Model method108(boolean arg0) {
        if (this.field352 == null) {
            return null;
        } else if (super.field330 != -1 && super.field331 != -1) {
            Model var2 = this.method112(0);
            SpotAnimType var3 = SpotAnimType.field1015[super.field330];
            Model var4 = new Model(var3.method322(), !var3.field1019, 868, false, true);
            var4.method132(0, 0, -super.field334, false);
            var4.method126(true);
            var4.method127(var3.field1018.field1001[super.field331], -227);
            var4.field480 = null;
            var4.field479 = null;
            if (var3.field1022 != 128 || var3.field1023 != 128) {
                var4.method135(var3.field1022, var3.field1022, var3.field1023, -27239);
            }
            var4.method136(var3.field1025 + 64, var3.field1026 + 850, -30, -50, -30, true);
            Model[] var5 = new Model[] { var2, var4 };
            if (arg0) {
                throw new NullPointerException();
            } else {
                Model var6 = new Model(var5, false, 2, true);
                if (this.field352.field831 == 1) {
                    var6.field481 = true;
                }
                return var6;
            }
        } else {
            return this.method112(0);
        }
    }

    @OriginalMember(owner = "y", name = "b", descriptor = "(I)Leb;")
    public final Model method112(int arg0) {
        if (super.field325 >= 0 && super.field328 == 0) {
            int var2 = SeqType.field999[super.field325].field1001[super.field326];
            int var3 = -1;
            if (super.field322 >= 0 && super.field322 != super.field303) {
                var3 = SeqType.field999[super.field322].field1001[super.field323];
            }
            return this.field352.method283(var2, var3, SeqType.field999[super.field325].field1005);
        } else {
            int var4 = -1;
            if (super.field322 >= 0) {
                var4 = SeqType.field999[super.field322].field1001[super.field323];
            }
            Model var5 = this.field352.method283(var4, -1, (int[]) null);
            super.field343 = var5.field472;
            if (arg0 != 0) {
                this.field350 = !this.field350;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "y", name = "a", descriptor = "(I)Z")
    public final boolean method111(int arg0) {
        if (arg0 != 35155) {
            this.field351 = 158;
        }
        return this.field352 != null;
    }
}
