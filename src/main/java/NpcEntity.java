import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("y")
public class NpcEntity extends PathingEntity {

    @OriginalMember(owner = "y", name = "fb", descriptor = "I")
    private int field344 = 3073;

    @OriginalMember(owner = "y", name = "gb", descriptor = "I")
    private int field345 = -1992;

    @OriginalMember(owner = "y", name = "hb", descriptor = "Lyb;")
    public NpcType field346;

    @OriginalMember(owner = "y", name = "a", descriptor = "(I)Leb;")
    public final Model method105(int arg0) {
        if (this.field346 == null) {
            return null;
        } else if (super.field324 != -1 && super.field325 != -1) {
            Model var2 = this.method109(0);
            SpotAnimType var3 = SpotAnimType.field952[super.field324];
            Model var4 = new Model(-428, true, var3.method299(), true, false, !var3.field956);
            var4.method128(0, 0, 0, -super.field328);
            var4.method122((byte) 3);
            var4.method123(7, var3.field955.field940[super.field325]);
            if (arg0 != 0) {
                this.field344 = -466;
            }
            var4.field469 = null;
            var4.field468 = null;
            var4.method132(64, 850, -30, -50, -30, true);
            Model[] var5 = new Model[] { var2, var4 };
            Model var6 = new Model(true, true, var5, 2);
            if (this.field346.field781 == 1) {
                var6.field470 = true;
            }
            return var6;
        } else {
            return this.method109(0);
        }
    }

    @OriginalMember(owner = "y", name = "c", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        if (super.field319 >= 0 && super.field322 == 0) {
            int var2 = SeqType.field938[super.field319].field940[super.field320];
            int var3 = -1;
            if (super.field316 >= 0 && super.field316 != super.field297) {
                var3 = SeqType.field938[super.field316].field940[super.field317];
            }
            return this.field346.method261(var2, var3, SeqType.field938[super.field319].field944);
        } else {
            int var4 = -1;
            if (super.field316 >= 0) {
                var4 = SeqType.field938[super.field316].field940[super.field317];
            }
            Model var5 = this.field346.method261(var4, -1, (int[]) null);
            if (arg0 != 0) {
                this.field344 = -127;
            }
            super.field337 = var5.field461;
            return var5;
        }
    }

    @OriginalMember(owner = "y", name = "b", descriptor = "(I)Z")
    public final boolean method108(int arg0) {
        if (arg0 != 0) {
            this.field345 = 188;
        }
        return this.field346 != null;
    }
}
