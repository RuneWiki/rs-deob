import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OQGXHJNH")
public class class36 extends class50 {

    @OriginalMember(owner = "OQGXHJNH", name = "ob", descriptor = "I")
    private int field964 = 613;

    @OriginalMember(owner = "OQGXHJNH", name = "pb", descriptor = "I")
    private int field965;

    @OriginalMember(owner = "OQGXHJNH", name = "qb", descriptor = "LCOIHKGSL;")
    public class6 field966;

    @OriginalMember(owner = "OQGXHJNH", name = "a", descriptor = "(Z)LYYHPBDED;")
    public final class70 method2(boolean arg0) {
        if (this.field966 == null) {
            return null;
        } else {
            class70 var2 = this.method363(0);
            if (var2 == null) {
                return null;
            } else {
                super.field1251 = var2.field2;
                if (!arg0) {
                    throw new NullPointerException();
                } else {
                    if (super.field1200 != -1 && super.field1201 != -1) {
                        class37 var3 = class37.field970[super.field1200];
                        class70 var4 = var3.method366();
                        if (var4 != null) {
                            int var5 = var3.field974.field763[super.field1201];
                            class70 var6 = new class70(false, var4, (byte) -15, true, class60.method513(3, var5));
                            var6.method564(-super.field1204, 0, 0, 0);
                            var6.method558(895);
                            var6.method559(var5, -682);
                            var6.field1603 = null;
                            var6.field1602 = null;
                            if (var3.field977 != 128 || var3.field978 != 128) {
                                var6.method567(this.field965, var3.field978, var3.field977, var3.field977);
                            }
                            var6.method568(var3.field980 + 64, var3.field981 + 850, -30, -50, -30, true);
                            class70[] var7 = new class70[] { var2, var6 };
                            var2 = new class70(var7, this.field964, true, 2);
                        }
                    }
                    if (this.field966.field593 == 1) {
                        var2.field1604 = true;
                    }
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "OQGXHJNH", name = "b", descriptor = "(I)LYYHPBDED;")
    private final class70 method363(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        } else if (super.field1234 >= 0 && super.field1237 == 0) {
            int var2 = class22.field761[super.field1234].field763[super.field1235];
            int var3 = -1;
            if (super.field1246 >= 0 && super.field1246 != super.field1239) {
                var3 = class22.field761[super.field1246].field763[super.field1247];
            }
            return this.field966.method166(var2, false, class22.field761[super.field1234].field767, var3);
        } else {
            int var4 = -1;
            if (super.field1246 >= 0) {
                var4 = class22.field761[super.field1246].field763[super.field1247];
            }
            return this.field966.method166(var4, false, (int[]) null, -1);
        }
    }

    @OriginalMember(owner = "OQGXHJNH", name = "a", descriptor = "(I)Z")
    public final boolean method273(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        return this.field966 != null;
    }
}
