import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("x")
public class NpcEntity extends PathingEntity {

    @OriginalMember(owner = "x", name = "eb", descriptor = "I")
    private int field330 = 8;

    @OriginalMember(owner = "x", name = "fb", descriptor = "Lxb;")
    public NpcType field331;

    @OriginalMember(owner = "x", name = "a", descriptor = "(I)Ldb;")
    public final Model method90(int arg0) {
        if (this.field331 == null) {
            return null;
        } else if (super.field311 != -1 && super.field312 != -1) {
            Model var2 = this.method93(39767);
            SpotAnimType var3 = SpotAnimType.field944[super.field311];
            Model var4 = new Model(true, !var3.field948, var3.method283(), 440, true, false);
            if (arg0 != 0) {
                throw new NullPointerException();
            } else {
                var4.method114(this.field330, 0, 0, -super.field315);
                var4.method108(0);
                var4.method109(false, var3.field947.field929[super.field312]);
                var4.field455 = null;
                var4.field454 = null;
                var4.method118(64, 850, -30, -50, -30, true);
                Model[] var5 = new Model[] { var2, var4 };
                return new Model(true, var5, 20525, 2);
            }
        } else {
            return this.method93(39767);
        }
    }

    @OriginalMember(owner = "x", name = "b", descriptor = "(I)Ldb;")
    public final Model method93(int arg0) {
        if (arg0 != 39767) {
            throw new NullPointerException();
        } else if (super.field306 >= 0 && super.field309 == 0) {
            int var2 = SeqType.field927[super.field306].field929[super.field307];
            int var3 = -1;
            if (super.field303 >= 0 && super.field303 != super.field289) {
                var3 = SeqType.field927[super.field303].field929[super.field304];
            }
            return this.field331.method245(var2, var3, SeqType.field927[super.field306].field933);
        } else {
            int var4 = -1;
            if (super.field303 >= 0) {
                var4 = SeqType.field927[super.field303].field929[super.field304];
            }
            Model var5 = this.field331.method245(var4, -1, (int[]) null);
            super.field324 = var5.field447;
            return var5;
        }
    }

    @OriginalMember(owner = "x", name = "c", descriptor = "(I)Z")
    public final boolean method94(int arg0) {
        if (arg0 != -29424) {
            throw new NullPointerException();
        } else {
            return this.field331 != null;
        }
    }
}
