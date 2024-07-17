import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("y")
public class NpcEntity extends PathingEntity {

    @OriginalMember(owner = "y", name = "hb", descriptor = "Z")
    private boolean field353 = false;

    @OriginalMember(owner = "y", name = "gb", descriptor = "I")
    private int field352;

    @OriginalMember(owner = "y", name = "ib", descriptor = "Lbc;")
    public NpcType field354;

    @OriginalMember(owner = "y", name = "a", descriptor = "(Z)Leb;")
    public final Model method109(boolean arg0) {
        if (this.field354 == null) {
            return null;
        } else if (super.field332 != -1 && super.field333 != -1) {
            Model var2 = this.method113(false);
            SpotAnimType var3 = SpotAnimType.field1043[super.field332];
            Model var4 = new Model(var3.method330(), true, !var3.field1048, this.field352, false);
            var4.method133(-super.field336, 0, -122, 0);
            var4.method127(4);
            var4.method128(-16599, var3.field1047.field1030[super.field333]);
            var4.field480 = null;
            var4.field479 = null;
            if (!arg0) {
                throw new NullPointerException();
            } else {
                if (var3.field1051 != 128 || var3.field1052 != 128) {
                    var4.method136(var3.field1051, 2, var3.field1052, var3.field1051);
                }
                var4.method137(var3.field1054 + 64, var3.field1055 + 850, -30, -50, -30, true);
                Model[] var5 = new Model[] { var2, var4 };
                Model var6 = new Model(var5, (byte) -31, 2, true);
                if (this.field354.field851 == 1) {
                    var6.field481 = true;
                }
                return var6;
            }
        } else {
            return this.method113(false);
        }
    }

    @OriginalMember(owner = "y", name = "c", descriptor = "(Z)Leb;")
    public final Model method113(boolean arg0) {
        if (super.field327 >= 0 && super.field330 == 0) {
            int var2 = SeqType.field1028[super.field327].field1030[super.field328];
            int var3 = -1;
            if (super.field324 >= 0 && super.field324 != super.field305) {
                var3 = SeqType.field1028[super.field324].field1030[super.field325];
            }
            return this.field354.method290(var2, var3, SeqType.field1028[super.field327].field1034);
        } else {
            int var4 = -1;
            if (arg0) {
                throw new NullPointerException();
            } else {
                if (super.field324 >= 0) {
                    var4 = SeqType.field1028[super.field324].field1030[super.field325];
                }
                Model var5 = this.field354.method290(var4, -1, (int[]) null);
                super.field345 = var5.field472;
                return var5;
            }
        }
    }

    @OriginalMember(owner = "y", name = "b", descriptor = "(Z)Z")
    public final boolean method112(boolean arg0) {
        if (arg0) {
            this.field353 = !this.field353;
        }
        return this.field354 != null;
    }
}
