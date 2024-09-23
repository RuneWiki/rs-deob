import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("z")
public class NpcEntity extends PathingEntity {

    @OriginalMember(owner = "z", name = "rb", descriptor = "Z")
    private boolean field454 = true;

    @OriginalMember(owner = "z", name = "sb", descriptor = "B")
    private byte field455 = -84;

    @OriginalMember(owner = "z", name = "tb", descriptor = "I")
    private int field456;

    @OriginalMember(owner = "z", name = "ub", descriptor = "Lgc;")
    public NpcType field457;

    @OriginalMember(owner = "z", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        if (this.field457 == null) {
            return null;
        } else {
            Model var2 = this.method115(false);
            if (var2 == null) {
                return null;
            } else {
                super.field445 = var2.field394;
                while (arg0 >= 0) {
                    this.field454 = !this.field454;
                }
                if (super.field432 != -1 && super.field433 != -1) {
                    SpotAnimType var3 = SpotAnimType.field1172[super.field432];
                    Model var4 = var3.method386();
                    if (var4 != null) {
                        int var5 = var3.field1176.field1151[super.field433];
                        Model var6 = new Model(AnimFrame.method48(var5, 45733), false, true, var4, 0);
                        var6.method139(-super.field436, false, 0, 0);
                        var6.method133(true);
                        var6.method134(true, var5);
                        var6.field572 = null;
                        var6.field571 = null;
                        if (var3.field1179 != 128 || var3.field1180 != 128) {
                            var6.method142(var3.field1179, var3.field1179, -34245, var3.field1180);
                        }
                        var6.method143(var3.field1182 + 64, var3.field1183 + 850, -30, -50, -30, true);
                        Model[] var7 = new Model[] { var2, var6 };
                        var2 = new Model(2, var7, (byte) 80, true);
                    }
                }
                if (this.field457.field1020 == 1) {
                    var2.field573 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "z", name = "a", descriptor = "(Z)Leb;")
    private final Model method115(boolean arg0) {
        if (super.field427 >= 0 && super.field430 == 0) {
            int var2 = SeqType.field1149[super.field427].field1151[super.field428];
            int var3 = -1;
            if (super.field424 >= 0 && super.field424 != super.field404) {
                var3 = SeqType.field1149[super.field424].field1151[super.field425];
            }
            return this.field457.method343(var3, SeqType.field1149[super.field427].field1155, var2, false);
        } else {
            int var4 = -1;
            if (arg0) {
                this.field456 = 89;
            }
            if (super.field424 >= 0) {
                var4 = SeqType.field1149[super.field424].field1151[super.field425];
            }
            return this.field457.method343(-1, (int[]) null, var4, false);
        }
    }

    @OriginalMember(owner = "z", name = "a", descriptor = "(B)Z")
    public final boolean method113(byte arg0) {
        if (this.field455 != arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        return this.field457 != null;
    }
}
