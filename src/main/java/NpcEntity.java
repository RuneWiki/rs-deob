import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("y")
public class NpcEntity extends PathingEntity {

    @OriginalMember(owner = "y", name = "ib", descriptor = "Z")
    private boolean field356 = true;

    @OriginalMember(owner = "y", name = "jb", descriptor = "Lbc;")
    public NpcType field357;

    @OriginalMember(owner = "y", name = "a", descriptor = "(I)Leb;")
    public final Model method107(int arg0) {
        if (this.field357 == null) {
            return null;
        } else if (super.field336 != -1 && super.field337 != -1) {
            Model var2 = this.method111(this.field356);
            SpotAnimType var3 = SpotAnimType.field1043[super.field336];
            Model var4 = new Model(false, (byte) 8, true, !var3.field1047, var3.method321());
            var4.method131((byte) -81, -super.field340, 0, 0);
            var4.method125((byte) -17);
            if (arg0 < 7 || arg0 > 7) {
                for (int var5 = 1; var5 > 0; ++var5) {
                }
            }
            var4.method126(var3.field1046.field1028[super.field337], (byte) 1);
            var4.field480 = null;
            var4.field479 = null;
            if (var3.field1050 != 128 || var3.field1051 != 128) {
                var4.method134(var3.field1051, 28022, var3.field1050, var3.field1050);
            }
            var4.method135(var3.field1053 + 64, var3.field1054 + 850, -30, -50, -30, true);
            Model[] var6 = new Model[] { var2, var4 };
            Model var7 = new Model(var6, 2, 0, true);
            if (this.field357.field852 == 1) {
                var7.field481 = true;
            }
            return var7;
        } else {
            return this.method111(this.field356);
        }
    }

    @OriginalMember(owner = "y", name = "b", descriptor = "(Z)Leb;")
    public final Model method111(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        } else if (super.field331 >= 0 && super.field334 == 0) {
            int var2 = SeqType.field1026[super.field331].field1028[super.field332];
            int var3 = -1;
            if (super.field328 >= 0 && super.field328 != super.field309) {
                var3 = SeqType.field1026[super.field328].field1028[super.field329];
            }
            return this.field357.method282(var2, var3, SeqType.field1026[super.field331].field1032);
        } else {
            int var4 = -1;
            if (super.field328 >= 0) {
                var4 = SeqType.field1026[super.field328].field1028[super.field329];
            }
            Model var5 = this.field357.method282(var4, -1, (int[]) null);
            super.field349 = var5.field472;
            return var5;
        }
    }

    @OriginalMember(owner = "y", name = "a", descriptor = "(Z)Z")
    public final boolean method110(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        } else {
            return this.field357 != null;
        }
    }
}
