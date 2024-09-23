import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("z")
public class NpcEntity extends PathingEntity {

    @OriginalMember(owner = "z", name = "qb", descriptor = "I")
    private int field457 = 888;

    @OriginalMember(owner = "z", name = "pb", descriptor = "I")
    private int field456;

    @OriginalMember(owner = "z", name = "rb", descriptor = "Lgc;")
    public NpcType field458;

    @OriginalMember(owner = "z", name = "a", descriptor = "(B)Leb;")
    public final Model method109(byte arg0) {
        if (this.field458 == null) {
            return null;
        } else {
            Model var2 = this.method115((byte) -48);
            if (var2 == null) {
                return null;
            } else {
                super.field447 = var2.field398;
                if (arg0 != -59) {
                    this.field457 = -369;
                }
                if (super.field434 != -1 && super.field435 != -1) {
                    SpotAnimType var3 = SpotAnimType.field1177[super.field434];
                    Model var4 = var3.method386();
                    if (var4 != null) {
                        int var5 = var3.field1181.field1157[super.field435];
                        Model var6 = new Model(AnimFrame.method48(var5, 0), false, 0, true, var4);
                        var6.method139(0, -super.field438, 0, (byte) -5);
                        var6.method133(this.field456);
                        var6.method134(-37879, var5);
                        var6.field579 = null;
                        var6.field578 = null;
                        if (var3.field1184 != 128 || var3.field1185 != 128) {
                            var6.method142(var3.field1185, var3.field1184, false, var3.field1184);
                        }
                        var6.method143(var3.field1187 + 64, var3.field1188 + 850, -30, -50, -30, true);
                        Model[] var7 = new Model[] { var2, var6 };
                        var2 = new Model(2, (byte) 6, var7, true);
                    }
                }
                if (this.field458.field1020 == 1) {
                    var2.field580 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "z", name = "c", descriptor = "(B)Leb;")
    private final Model method115(byte arg0) {
        if (super.field429 >= 0 && super.field432 == 0) {
            int var2 = SeqType.field1155[super.field429].field1157[super.field430];
            int var3 = -1;
            if (super.field426 >= 0 && super.field426 != super.field406) {
                var3 = SeqType.field1155[super.field426].field1157[super.field427];
            }
            return this.field458.method343(var3, true, SeqType.field1155[super.field429].field1161, var2);
        } else {
            int var4 = -1;
            if (arg0 != -48) {
                throw new NullPointerException();
            } else {
                if (super.field426 >= 0) {
                    var4 = SeqType.field1155[super.field426].field1157[super.field427];
                }
                return this.field458.method343(-1, true, (int[]) null, var4);
            }
        }
    }

    @OriginalMember(owner = "z", name = "b", descriptor = "(B)Z")
    public final boolean method113(byte arg0) {
        if (arg0 != -120) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        return this.field458 != null;
    }
}
