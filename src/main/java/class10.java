import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CMGLYFCQ")
public class class10 extends class67 {

    @OriginalMember(owner = "CMGLYFCQ", name = "pb", descriptor = "B")
    private byte field651 = 6;

    @OriginalMember(owner = "CMGLYFCQ", name = "qb", descriptor = "I")
    private int field652 = 7;

    @OriginalMember(owner = "CMGLYFCQ", name = "rb", descriptor = "LFKIKYVJJ;")
    public class19 field653;

    @OriginalMember(owner = "CMGLYFCQ", name = "b", descriptor = "(I)LOIBEFFXI;")
    private final class39 method167(int arg0) {
        if (super.field1575 >= 0 && super.field1578 == 0) {
            int var2 = class9.field163[super.field1575].field165[super.field1576];
            int var3 = -1;
            if (super.field1572 >= 0 && super.field1586 != super.field1572) {
                var3 = class9.field163[super.field1572].field165[super.field1573];
            }
            return this.field653.method208(class9.field163[super.field1575].field169, var2, -837, var3);
        } else {
            int var4 = -1;
            if (arg0 != 0) {
                for (int var5 = 1; var5 > 0; ++var5) {
                }
            }
            if (super.field1572 >= 0) {
                var4 = class9.field163[super.field1572].field165[super.field1573];
            }
            return this.field653.method208((int[]) null, var4, -837, -1);
        }
    }

    @OriginalMember(owner = "CMGLYFCQ", name = "a", descriptor = "(Z)LOIBEFFXI;")
    public final class39 method2(boolean arg0) {
        if (this.field653 == null) {
            return null;
        } else {
            class39 var2 = this.method167(0);
            if (var2 == null) {
                return null;
            } else {
                super.field1558 = var2.field1528;
                if (arg0) {
                    for (int var3 = 1; var3 > 0; ++var3) {
                    }
                }
                if (super.field1580 != -1 && super.field1581 != -1) {
                    class27 var4 = class27.field847[super.field1580];
                    class39 var5 = var4.method233();
                    if (var5 != null) {
                        int var6 = var4.field851.field165[super.field1581];
                        class39 var7 = new class39(false, true, var5, class55.method455(true, var6), 5);
                        var7.method359(0, (byte) 4, 0, -super.field1584);
                        var7.method353(10544);
                        var7.method354(var6, this.field651);
                        var7.field1138 = null;
                        var7.field1137 = null;
                        if (var4.field854 != 128 || var4.field855 != 128) {
                            var7.method362((byte) 7, var4.field855, var4.field854, var4.field854);
                        }
                        var7.method363(var4.field857 + 64, var4.field858 + 850, -30, -50, -30, true);
                        class39[] var8 = new class39[] { var2, var7 };
                        var2 = new class39(2, var8, true, 584);
                    }
                }
                if (this.field653.field754 == 1) {
                    var2.field1139 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "CMGLYFCQ", name = "a", descriptor = "(I)Z")
    public final boolean method1(int arg0) {
        if (arg0 < 8 || arg0 > 8) {
            this.field652 = -481;
        }
        return this.field653 != null;
    }
}
