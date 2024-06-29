import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!VMSVDNWD")
public class class59 extends class45 {

    @OriginalMember(owner = "client!VMSVDNWD", name = "qb", descriptor = "Z")
    private boolean field1504 = false;

    @OriginalMember(owner = "client!VMSVDNWD", name = "rb", descriptor = "LRDFTXEYV;")
    public class48 field1505;

    @OriginalMember(owner = "client!VMSVDNWD", name = "a", descriptor = "(B)LKUGNQTGL;")
    public final class28 method40(byte arg0) {
        if (this.field1505 == null) {
            return null;
        } else {
            class28 var2 = this.method480(this.field1504);
            if (arg0 == 0) {
                boolean var3 = false;
            } else {
                for (int var4 = 1; var4 > 0; ++var4) {
                }
            }
            if (var2 == null) {
                return null;
            } else {
                super.field1297 = var2.field1679;
                if (super.field1250 != -1 && super.field1251 != -1) {
                    class24 var5 = class24.field759[super.field1250];
                    class28 var6 = var5.method308();
                    if (var6 != null) {
                        int var7 = var5.field763.field1115[super.field1251];
                        class28 var8 = new class28(var6, false, true, class53.method455(true, var7), 584);
                        var8.method343(0, 0, -super.field1254, (byte) 8);
                        var8.method337(4);
                        var8.method338(false, var7);
                        var8.field849 = null;
                        var8.field848 = null;
                        if (var5.field766 != 128 || var5.field767 != 128) {
                            var8.method346(var5.field766, var5.field766, -480, var5.field767);
                        }
                        var8.method347(var5.field769 + 64, var5.field770 + 850, -30, -50, -30, true);
                        class28[] var9 = new class28[] { var2, var8 };
                        var2 = new class28(false, var9, true, 2);
                    }
                }
                if (this.field1505.field1368 == 1) {
                    var2.field850 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "client!VMSVDNWD", name = "a", descriptor = "(Z)LKUGNQTGL;")
    private final class28 method480(boolean arg0) {
        if (super.field1279 >= 0 && super.field1282 == 0) {
            int var2 = class37.field1113[super.field1279].field1115[super.field1280];
            int var3 = -1;
            if (super.field1276 >= 0 && super.field1288 != super.field1276) {
                var3 = class37.field1113[super.field1276].field1115[super.field1277];
            }
            return this.field1505.method435(9, var2, var3, class37.field1113[super.field1279].field1119);
        } else {
            int var4 = -1;
            if (arg0) {
                throw new NullPointerException();
            } else {
                if (super.field1276 >= 0) {
                    var4 = class37.field1113[super.field1276].field1115[super.field1277];
                }
                return this.field1505.method435(9, var4, -1, (int[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!VMSVDNWD", name = "b", descriptor = "(I)Z")
    public final boolean method433(int arg0) {
        int var2 = 90 / arg0;
        return this.field1505 != null;
    }
}
