import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("y")
public class NpcEntity extends PathingEntity {

    @OriginalMember(owner = "y", name = "hb", descriptor = "I")
    private int field360;

    @OriginalMember(owner = "y", name = "ib", descriptor = "Lbc;")
    public NpcType field361;

    @OriginalMember(owner = "y", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        if (this.field361 == null) {
            return null;
        } else if (super.field340 != -1 && super.field341 != -1) {
            Model var2 = this.method113(-300);
            SpotAnimType var3 = SpotAnimType.field1033[super.field340];
            Model var4 = new Model(!var3.field1038, (byte) 70, true, var3.method330(), false);
            var4.method133(0, -super.field344, (byte) 1, 0);
            if (arg0 < this.field360 || arg0 > this.field360) {
                for (int var5 = 1; var5 > 0; ++var5) {
                }
            }
            var4.method127(false);
            var4.method128(var3.field1037.field1020[super.field341], 5565);
            var4.field489 = null;
            var4.field488 = null;
            if (var3.field1041 != 128 || var3.field1042 != 128) {
                var4.method136(var3.field1042, var3.field1041, false, var3.field1041);
            }
            var4.method137(var3.field1044 + 64, var3.field1045 + 850, -30, -50, -30, true);
            Model[] var6 = new Model[] { var2, var4 };
            Model var7 = new Model((byte) -80, true, var6, 2);
            if (this.field361.field849 == 1) {
                var7.field490 = true;
            }
            return var7;
        } else {
            return this.method113(-300);
        }
    }

    @OriginalMember(owner = "y", name = "c", descriptor = "(I)Leb;")
    public final Model method113(int arg0) {
        if (super.field335 >= 0 && super.field338 == 0) {
            int var2 = SeqType.field1018[super.field335].field1020[super.field336];
            int var3 = -1;
            if (super.field332 >= 0 && super.field332 != super.field313) {
                var3 = SeqType.field1018[super.field332].field1020[super.field333];
            }
            return this.field361.method290(var2, var3, SeqType.field1018[super.field335].field1024);
        } else {
            int var4 = -1;
            if (arg0 >= 0) {
                throw new NullPointerException();
            } else {
                if (super.field332 >= 0) {
                    var4 = SeqType.field1018[super.field332].field1020[super.field333];
                }
                Model var5 = this.field361.method290(var4, -1, (int[]) null);
                super.field353 = var5.field481;
                return var5;
            }
        }
    }

    @OriginalMember(owner = "y", name = "b", descriptor = "(I)Z")
    public final boolean method112(int arg0) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        } else {
            return this.field361 != null;
        }
    }
}
