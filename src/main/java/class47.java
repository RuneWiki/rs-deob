import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!TBFTCCSF")
public class class47 extends class61 {

    @OriginalMember(owner = "client!TBFTCCSF", name = "rb", descriptor = "B")
    private byte field1364 = 2;

    @OriginalMember(owner = "client!TBFTCCSF", name = "sb", descriptor = "Z")
    private boolean field1365 = false;

    @OriginalMember(owner = "client!TBFTCCSF", name = "tb", descriptor = "LJRELGTVY;")
    public class29 field1366;

    @OriginalMember(owner = "client!TBFTCCSF", name = "a", descriptor = "(B)LFLXAIVEA;")
    public final class16 method190(byte arg0) {
        if (this.field1366 == null) {
            return null;
        } else {
            class16 var2 = this.method441(507);
            if (this.field1364 == arg0) {
                boolean var3 = false;
                if (var2 == null) {
                    return null;
                } else {
                    super.field1648 = var2.field865;
                    if (super.field1634 != -1 && super.field1635 != -1) {
                        class38 var4 = class38.field1171[super.field1634];
                        class16 var5 = var4.method305();
                        if (var5 != null) {
                            int var6 = var4.field1175.field79[super.field1635];
                            class16 var7 = new class16(var5, class37.method302(true, var6), true, (byte) 8, false);
                            var7.method231(0, -super.field1638, true, 0);
                            var7.method225((byte) -116);
                            var7.method226((byte) 8, var6);
                            var7.field807 = null;
                            var7.field806 = null;
                            if (var4.field1178 != 128 || var4.field1179 != 128) {
                                var7.method234(var4.field1178, var4.field1178, (byte) 73, var4.field1179);
                            }
                            var7.method235(var4.field1181 + 64, var4.field1182 + 850, -30, -50, -30, true);
                            class16[] var8 = new class16[] { var2, var7 };
                            var2 = new class16(2, 0, true, var8);
                        }
                    }
                    if (this.field1366.field1054 == 1) {
                        var2.field808 = true;
                    }
                    return var2;
                }
            } else {
                throw new NullPointerException();
            }
        }
    }

    @OriginalMember(owner = "client!TBFTCCSF", name = "c", descriptor = "(I)LFLXAIVEA;")
    private final class16 method441(int arg0) {
        if (arg0 <= 0) {
            this.field1365 = !this.field1365;
        }
        if (super.field1653 >= 0 && super.field1656 == 0) {
            int var2 = class2.field77[super.field1653].field79[super.field1654];
            int var3 = -1;
            if (super.field1627 >= 0 && super.field1641 != super.field1627) {
                var3 = class2.field77[super.field1627].field79[super.field1628];
            }
            return this.field1366.method270(class2.field77[super.field1653].field83, var3, var2, (byte) -77);
        } else {
            int var4 = -1;
            if (super.field1627 >= 0) {
                var4 = class2.field77[super.field1627].field79[super.field1628];
            }
            return this.field1366.method270((int[]) null, -1, var4, (byte) -77);
        }
    }

    @OriginalMember(owner = "client!TBFTCCSF", name = "b", descriptor = "(I)Z")
    public final boolean method442(int arg0) {
        if (arg0 != -40574) {
            throw new NullPointerException();
        } else {
            return this.field1366 != null;
        }
    }
}
