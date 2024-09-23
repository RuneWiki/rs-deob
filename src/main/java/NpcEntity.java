import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("z")
public class NpcEntity extends PathingEntity {

    @OriginalMember(owner = "z", name = "qb", descriptor = "Z")
    private boolean field449 = true;

    @OriginalMember(owner = "z", name = "rb", descriptor = "Lgc;")
    public NpcType field450;

    @OriginalMember(owner = "z", name = "a", descriptor = "(Z)Leb;")
    public final Model method109(boolean arg0) {
        if (this.field450 == null) {
            return null;
        } else {
            Model var2 = this.method115(-314);
            if (var2 == null) {
                return null;
            } else {
                super.field440 = var2.field390;
                if (!arg0) {
                    throw new NullPointerException();
                } else {
                    if (super.field427 != -1 && super.field428 != -1) {
                        SpotAnimType var3 = SpotAnimType.field1165[super.field427];
                        Model var4 = var3.method386();
                        if (var4 != null) {
                            int var5 = var3.field1169.field1145[super.field428];
                            Model var6 = new Model(false, 201, var4, AnimFrame.method48(577, var5), true);
                            var6.method139(-9236, 0, -super.field431, 0);
                            var6.method133(5);
                            var6.method134(0, var5);
                            var6.field569 = null;
                            var6.field568 = null;
                            if (var3.field1172 != 128 || var3.field1173 != 128) {
                                var6.method142(var3.field1172, var3.field1173, var3.field1172, (byte) -119);
                            }
                            var6.method143(var3.field1175 + 64, var3.field1176 + 850, -30, -50, -30, true);
                            Model[] var7 = new Model[] { var2, var6 };
                            var2 = new Model((byte) 60, var7, true, 2);
                        }
                    }
                    if (this.field450.field1014 == 1) {
                        var2.field570 = true;
                    }
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "z", name = "c", descriptor = "(I)Leb;")
    private final Model method115(int arg0) {
        if (super.field422 >= 0 && super.field425 == 0) {
            int var2 = SeqType.field1143[super.field422].field1145[super.field423];
            int var3 = -1;
            if (super.field419 >= 0 && super.field419 != super.field399) {
                var3 = SeqType.field1143[super.field419].field1145[super.field420];
            }
            return this.field450.method343(var3, var2, SeqType.field1143[super.field422].field1149, 0);
        } else {
            int var4 = -1;
            if (arg0 >= 0) {
                throw new NullPointerException();
            } else {
                if (super.field419 >= 0) {
                    var4 = SeqType.field1143[super.field419].field1145[super.field420];
                }
                return this.field450.method343(-1, var4, (int[]) null, 0);
            }
        }
    }

    @OriginalMember(owner = "z", name = "b", descriptor = "(I)Z")
    public final boolean method113(int arg0) {
        if (arg0 < 8 || arg0 > 8) {
            this.field449 = !this.field449;
        }
        return this.field450 != null;
    }
}
