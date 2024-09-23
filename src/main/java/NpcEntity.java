import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("z")
public class NpcEntity extends PathingEntity {

    @OriginalMember(owner = "z", name = "qb", descriptor = "I")
    private int field448 = 628;

    @OriginalMember(owner = "z", name = "rb", descriptor = "Lgc;")
    public NpcType field449;

    @OriginalMember(owner = "z", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        if (this.field449 == null) {
            return null;
        } else {
            Model var2 = this.method115((byte) 40);
            if (arg0 != 0) {
                this.field448 = -230;
            }
            if (var2 == null) {
                return null;
            } else {
                super.field439 = var2.field389;
                if (super.field426 != -1 && super.field427 != -1) {
                    SpotAnimType var3 = SpotAnimType.field1153[super.field426];
                    Model var4 = var3.method379();
                    if (var4 != null) {
                        int var5 = var3.field1157.field1133[super.field427];
                        Model var6 = new Model(false, true, var4, AnimFrame.method48(var5, 681), 9);
                        var6.method138(0, -super.field430, 0, -97);
                        var6.method132(1);
                        var6.method133(var5, false);
                        var6.field564 = null;
                        var6.field563 = null;
                        if (var3.field1160 != 128 || var3.field1161 != 128) {
                            var6.method141(var3.field1160, var3.field1161, 9, var3.field1160);
                        }
                        var6.method142(var3.field1163 + 64, var3.field1164 + 850, -30, -50, -30, true);
                        Model[] var7 = new Model[] { var2, var6 };
                        var2 = new Model(-638, true, var7, 2);
                    }
                }
                if (this.field449.field1004 == 1) {
                    var2.field565 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "z", name = "a", descriptor = "(B)Leb;")
    private final Model method115(byte arg0) {
        if (super.field421 >= 0 && super.field424 == 0) {
            int var2 = SeqType.field1131[super.field421].field1133[super.field422];
            int var3 = -1;
            if (super.field418 >= 0 && super.field418 != super.field398) {
                var3 = SeqType.field1131[super.field418].field1133[super.field419];
            }
            return this.field449.method337(var2, SeqType.field1131[super.field421].field1137, 0, var3);
        } else {
            int var4 = -1;
            if (arg0 != 40) {
                for (int var5 = 1; var5 > 0; ++var5) {
                }
            }
            if (super.field418 >= 0) {
                var4 = SeqType.field1131[super.field418].field1133[super.field419];
            }
            return this.field449.method337(var4, (int[]) null, 0, -1);
        }
    }

    @OriginalMember(owner = "z", name = "c", descriptor = "(I)Z")
    public final boolean method113(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        } else {
            return this.field449 != null;
        }
    }
}
