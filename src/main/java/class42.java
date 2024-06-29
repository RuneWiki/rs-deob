import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!NVHCJIOR")
public class class42 extends class47 {

    @OriginalMember(owner = "client!NVHCJIOR", name = "ub", descriptor = "Z")
    private boolean field1203 = true;

    @OriginalMember(owner = "client!NVHCJIOR", name = "vb", descriptor = "Z")
    private boolean field1204 = true;

    @OriginalMember(owner = "client!NVHCJIOR", name = "wb", descriptor = "I")
    private int field1205 = 8;

    @OriginalMember(owner = "client!NVHCJIOR", name = "xb", descriptor = "LXDDMQHDR;")
    public class68 field1206;

    @OriginalMember(owner = "client!NVHCJIOR", name = "c", descriptor = "(I)LNGYJLUVS;")
    private final class37 method354(int arg0) {
        if (super.field1377 >= 0 && super.field1380 == 0) {
            int var2 = class27.field849[super.field1377].field851[super.field1378];
            int var3 = -1;
            if (super.field1386 >= 0 && super.field1402 != super.field1386) {
                var3 = class27.field849[super.field1386].field851[super.field1387];
            }
            return this.field1206.method584(var3, var2, this.field1205, class27.field849[super.field1377].field855);
        } else {
            int var4 = -1;
            if (arg0 != 4245) {
                this.field1204 = !this.field1204;
            }
            if (super.field1386 >= 0) {
                var4 = class27.field849[super.field1386].field851[super.field1387];
            }
            return this.field1206.method584(-1, var4, this.field1205, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!NVHCJIOR", name = "a", descriptor = "(I)LNGYJLUVS;")
    public final class37 method206(int arg0) {
        if (this.field1206 == null) {
            return null;
        } else {
            class37 var2 = this.method354(4245);
            if (var2 == null) {
                return null;
            } else {
                super.field1368 = var2.field972;
                if (arg0 != -12617) {
                    throw new NullPointerException();
                } else {
                    if (super.field1359 != -1 && super.field1360 != -1) {
                        class13 var3 = class13.field688[super.field1359];
                        class37 var4 = var3.method210();
                        if (var4 != null) {
                            int var5 = var3.field692.field851[super.field1360];
                            class37 var6 = new class37(class49.method428((byte) 9, var5), true, true, var4, false);
                            var6.method304(0, -super.field1363, (byte) 1, 0);
                            var6.method298(false);
                            var6.method299(var5, 0);
                            var6.field1027 = null;
                            var6.field1026 = null;
                            if (var3.field695 != 128 || var3.field696 != 128) {
                                var6.method307(var3.field695, true, var3.field695, var3.field696);
                            }
                            var6.method308(var3.field698 + 64, var3.field699 + 850, -30, -50, -30, true);
                            class37[] var7 = new class37[] { var2, var6 };
                            var2 = new class37(-426, 2, true, var7);
                        }
                    }
                    if (this.field1206.field1740 == 1) {
                        var2.field1028 = true;
                    }
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!NVHCJIOR", name = "a", descriptor = "(Z)Z")
    public final boolean method229(boolean arg0) {
        if (!arg0) {
            this.field1203 = !this.field1203;
        }
        return this.field1206 != null;
    }
}
