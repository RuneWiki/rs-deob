import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!RGHBDSIJ")
public class NpcEntity extends PathingEntity {

    @OriginalMember(owner = "client!RGHBDSIJ", name = "qb", descriptor = "Z")
    private boolean field1369 = true;

    @OriginalMember(owner = "client!RGHBDSIJ", name = "rb", descriptor = "LSLDUQHOR;")
    public NpcType field1370;

    @OriginalMember(owner = "client!RGHBDSIJ", name = "b", descriptor = "(B)LLZYQDKJV;")
    private final Model method457(byte arg0) {
        if (super.field1171 >= 0 && super.field1174 == 0) {
            int var2 = SeqType.field775[super.field1171].field777[super.field1172];
            int var3 = -1;
            if (super.field1135 >= 0 && super.field1181 != super.field1135) {
                var3 = SeqType.field775[super.field1135].field777[super.field1136];
            }
            return this.field1370.method475(var2, var3, 0, SeqType.field775[super.field1171].field781);
        } else {
            int var4 = -1;
            if (arg0 != 122) {
                this.field1369 = !this.field1369;
            }
            if (super.field1135 >= 0) {
                var4 = SeqType.field775[super.field1135].field777[super.field1136];
            }
            return this.field1370.method475(var4, -1, 0, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!RGHBDSIJ", name = "a", descriptor = "(B)LLZYQDKJV;")
    public final Model method239(byte arg0) {
        if (arg0 != 3) {
            throw new NullPointerException();
        } else {
            boolean var2 = false;
            if (this.field1370 == null) {
                return null;
            } else {
                Model var3 = this.method457((byte) 122);
                if (var3 == null) {
                    return null;
                } else {
                    super.field1141 = var3.field1709;
                    if (super.field1161 != -1 && super.field1162 != -1) {
                        SpotAnimType var4 = SpotAnimType.field1297[super.field1161];
                        Model var5 = var4.method439();
                        if (var5 != null) {
                            int var6 = var4.field1301.field777[super.field1162];
                            Model var7 = new Model(false, false, true, var5, AnimFrame.method265(this.field1369, var6));
                            var7.method372(0, 0, false, -super.field1165);
                            var7.method366(7);
                            var7.method367(var6, (byte) 6);
                            var7.field1226 = null;
                            var7.field1225 = null;
                            if (var4.field1304 != 128 || var4.field1305 != 128) {
                                var7.method375(var4.field1305, var4.field1304, 9, var4.field1304);
                            }
                            var7.method376(var4.field1307 + 64, var4.field1308 + 850, -30, -50, -30, true);
                            Model[] var8 = new Model[] { var3, var7 };
                            var3 = new Model(2, true, 0, var8);
                        }
                    }
                    if (this.field1370.field1445 == 1) {
                        var3.field1227 = true;
                    }
                    return var3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!RGHBDSIJ", name = "b", descriptor = "(I)Z")
    public final boolean method351(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        } else {
            return this.field1370 != null;
        }
    }
}
