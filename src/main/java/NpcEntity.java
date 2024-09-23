import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("z")
public class NpcEntity extends PathingEntity {

    @OriginalMember(owner = "z", name = "qb", descriptor = "I")
    private int field457 = 633;

    @OriginalMember(owner = "z", name = "rb", descriptor = "Lgc;")
    public NpcType field458;

    @OriginalMember(owner = "z", name = "a", descriptor = "(Z)Leb;")
    public final Model method109(boolean arg0) {
        if (!arg0) {
            this.field457 = -254;
        }
        if (this.field458 == null) {
            return null;
        } else {
            Model var2 = this.method115(10728);
            if (var2 == null) {
                return null;
            } else {
                super.field448 = var2.field398;
                if (super.field435 != -1 && super.field436 != -1) {
                    SpotAnimType var3 = SpotAnimType.field1166[super.field435];
                    Model var4 = var3.method386();
                    if (var4 != null) {
                        int var5 = var3.field1170.field1146[super.field436];
                        Model var6 = new Model(false, var4, true, (byte) 119, AnimFrame.method48(var5, (byte) 7));
                        var6.method139(0, 0, false, -super.field439);
                        var6.method133(861);
                        var6.method134((byte) -54, var5);
                        var6.field578 = null;
                        var6.field577 = null;
                        if (var3.field1173 != 128 || var3.field1174 != 128) {
                            var6.method142(var3.field1173, true, var3.field1173, var3.field1174);
                        }
                        var6.method143(var3.field1176 + 64, var3.field1177 + 850, -30, -50, -30, true);
                        Model[] var7 = new Model[] { var2, var6 };
                        var2 = new Model(var7, true, 2, true);
                    }
                }
                if (this.field458.field1014 == 1) {
                    var2.field579 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "z", name = "b", descriptor = "(I)Leb;")
    private final Model method115(int arg0) {
        if (super.field430 >= 0 && super.field433 == 0) {
            int var2 = SeqType.field1144[super.field430].field1146[super.field431];
            int var3 = -1;
            if (super.field427 >= 0 && super.field427 != super.field407) {
                var3 = SeqType.field1144[super.field427].field1146[super.field428];
            }
            return this.field458.method343((byte) 3, var3, var2, SeqType.field1144[super.field430].field1150);
        } else {
            int var4 = -1;
            if (arg0 != 10728) {
                for (int var5 = 1; var5 > 0; ++var5) {
                }
            }
            if (super.field427 >= 0) {
                var4 = SeqType.field1144[super.field427].field1146[super.field428];
            }
            return this.field458.method343((byte) 3, -1, var4, (int[]) null);
        }
    }

    @OriginalMember(owner = "z", name = "b", descriptor = "(Z)Z")
    public final boolean method113(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        } else {
            return this.field458 != null;
        }
    }
}
