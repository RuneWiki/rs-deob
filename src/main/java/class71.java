import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZHNLOFBM")
public class class71 extends class3 {

    @OriginalMember(owner = "client!ZHNLOFBM", name = "qb", descriptor = "I")
    private int field1736 = 8;

    @OriginalMember(owner = "client!ZHNLOFBM", name = "pb", descriptor = "I")
    private int field1735;

    @OriginalMember(owner = "client!ZHNLOFBM", name = "rb", descriptor = "LYXSRFNQD;")
    public class69 field1737;

    @OriginalMember(owner = "client!ZHNLOFBM", name = "a", descriptor = "(I)LOGORHYVW;")
    public final class45 method5(int arg0) {
        if (this.field1737 == null) {
            return null;
        } else {
            class45 var2 = this.method600((byte) -94);
            if (var2 == null) {
                return null;
            } else {
                super.field56 = var2.field695;
                if (arg0 != 0) {
                    this.field1736 = 90;
                }
                if (super.field20 != -1 && super.field21 != -1) {
                    class24 var3 = class24.field864[super.field20];
                    class45 var4 = var3.method245();
                    if (var4 != null) {
                        int var5 = var3.field868.field1142[super.field21];
                        class45 var6 = new class45(-18434, true, var4, class47.method467((byte) -39, var5), false);
                        var6.method446(-super.field24, this.field1735, 0, 0);
                        var6.method440(474);
                        var6.method441((byte) 9, var5);
                        var6.field1308 = null;
                        var6.field1307 = null;
                        if (var3.field871 != 128 || var3.field872 != 128) {
                            var6.method449(var3.field871, 23590, var3.field871, var3.field872);
                        }
                        var6.method450(var3.field874 + 64, var3.field875 + 850, -30, -50, -30, true);
                        class45[] var7 = new class45[] { var2, var6 };
                        var2 = new class45(2, true, 0, var7);
                    }
                }
                if (this.field1737.field1716 == 1) {
                    var2.field1309 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "client!ZHNLOFBM", name = "c", descriptor = "(I)Z")
    public final boolean method8(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        } else {
            return this.field1737 != null;
        }
    }

    @OriginalMember(owner = "client!ZHNLOFBM", name = "a", descriptor = "(B)LOGORHYVW;")
    private final class45 method600(byte arg0) {
        if (super.field47 >= 0 && super.field50 == 0) {
            int var2 = class34.field1140[super.field47].field1142[super.field48];
            int var3 = -1;
            if (super.field53 >= 0 && super.field65 != super.field53) {
                var3 = class34.field1140[super.field53].field1142[super.field54];
            }
            return this.field1737.method595(class34.field1140[super.field47].field1146, var3, var2, 866);
        } else {
            int var4 = -1;
            if (arg0 != -94) {
                this.field1736 = 78;
            }
            if (super.field53 >= 0) {
                var4 = class34.field1140[super.field53].field1142[super.field54];
            }
            return this.field1737.method595((int[]) null, -1, var4, 866);
        }
    }
}
