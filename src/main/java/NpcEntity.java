import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("z")
public class NpcEntity extends PathingEntity {

    @OriginalMember(owner = "z", name = "sb", descriptor = "I")
    private int field452 = 8;

    @OriginalMember(owner = "z", name = "tb", descriptor = "Z")
    private boolean field453 = true;

    @OriginalMember(owner = "z", name = "rb", descriptor = "I")
    private int field451;

    @OriginalMember(owner = "z", name = "ub", descriptor = "Lgc;")
    public NpcType field454;

    @OriginalMember(owner = "z", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        if (this.field454 == null) {
            return null;
        } else {
            Model var2 = this.method115(false);
            if (arg0 != -37770) {
                throw new NullPointerException();
            } else if (var2 == null) {
                return null;
            } else {
                super.field442 = var2.field392;
                if (super.field429 != -1 && super.field430 != -1) {
                    SpotAnimType var3 = SpotAnimType.field1173[super.field429];
                    Model var4 = var3.method382();
                    if (var4 != null) {
                        int var5 = var3.field1177.field1152[super.field430];
                        Model var6 = new Model(var4, AnimFrame.method48(var5, 0), false, this.field451, true);
                        var6.method138(-super.field433, 0, (byte) 2, 0);
                        var6.method132((byte) 3);
                        var6.method133(var5, 188);
                        var6.field568 = null;
                        var6.field567 = null;
                        if (var3.field1180 != 128 || var3.field1181 != 128) {
                            var6.method141(var3.field1180, var3.field1180, var3.field1181, (byte) 31);
                        }
                        var6.method142(var3.field1183 + 64, var3.field1184 + 850, -30, -50, -30, true);
                        Model[] var7 = new Model[] { var2, var6 };
                        var2 = new Model(true, 0, var7, 2);
                    }
                }
                if (this.field454.field1013 == 1) {
                    var2.field569 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "z", name = "c", descriptor = "(Z)Leb;")
    private final Model method115(boolean arg0) {
        if (arg0) {
            this.field453 = !this.field453;
        }
        if (super.field424 >= 0 && super.field427 == 0) {
            int var2 = SeqType.field1150[super.field424].field1152[super.field425];
            int var3 = -1;
            if (super.field421 >= 0 && super.field421 != super.field401) {
                var3 = SeqType.field1150[super.field421].field1152[super.field422];
            }
            return this.field454.method340(0, var3, var2, SeqType.field1150[super.field424].field1156);
        } else {
            int var4 = -1;
            if (super.field421 >= 0) {
                var4 = SeqType.field1150[super.field421].field1152[super.field422];
            }
            return this.field454.method340(0, -1, var4, (int[]) null);
        }
    }

    @OriginalMember(owner = "z", name = "b", descriptor = "(Z)Z")
    public final boolean method113(boolean arg0) {
        if (!arg0) {
            this.field452 = -80;
        }
        return this.field454 != null;
    }
}
