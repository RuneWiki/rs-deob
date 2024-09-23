import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FJJCITCO")
public class class13 extends class60 {

    @OriginalMember(owner = "FJJCITCO", name = "qb", descriptor = "LUGDYQAXI;")
    public class59 field736;

    @OriginalMember(owner = "FJJCITCO", name = "a", descriptor = "(B)LGEUHTGZJ;")
    public final class17 method221(byte arg0) {
        if (arg0 != -43) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field736 == null) {
            return null;
        } else {
            class17 var3 = this.method264(-35311);
            if (var3 == null) {
                return null;
            } else {
                super.field1566 = var3.field639;
                if (super.field1584 != -1 && super.field1585 != -1) {
                    class22 var4 = class22.field913[super.field1584];
                    class17 var5 = var4.method323();
                    if (var5 != null) {
                        int var6 = var4.field917.field684[super.field1585];
                        class17 var7 = new class17((byte) -59, class48.method504(var6, 3), var5, false, true);
                        var7.method298(0, 0, -super.field1588, 0);
                        var7.method292(-20376);
                        var7.method293((byte) 1, var6);
                        var7.field844 = null;
                        var7.field843 = null;
                        if (var4.field920 != 128 || var4.field921 != 128) {
                            var7.method301(var4.field921, var4.field920, (byte) 9, var4.field920);
                        }
                        var7.method302(var4.field923 + 64, var4.field924 + 850, -30, -50, -30, true);
                        class17[] var8 = new class17[] { var3, var7 };
                        var3 = new class17(var8, 2, true, 37504);
                    }
                }
                if (this.field736.field1508 == 1) {
                    var3.field845 = true;
                }
                return var3;
            }
        }
    }

    @OriginalMember(owner = "FJJCITCO", name = "b", descriptor = "(I)Z")
    public final boolean method263(int arg0) {
        if (arg0 < 6 || arg0 > 6) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        return this.field736 != null;
    }

    @OriginalMember(owner = "FJJCITCO", name = "c", descriptor = "(I)LGEUHTGZJ;")
    private final class17 method264(int arg0) {
        if (super.field1552 >= 0 && super.field1555 == 0) {
            int var2 = class9.field682[super.field1552].field684[super.field1553];
            int var3 = -1;
            if (super.field1567 >= 0 && super.field1567 != super.field1545) {
                var3 = class9.field682[super.field1567].field684[super.field1568];
            }
            return this.field736.method575(var3, var2, (byte) -101, class9.field682[super.field1552].field688);
        } else {
            int var4 = -1;
            if (arg0 != -35311) {
                throw new NullPointerException();
            } else {
                if (super.field1567 >= 0) {
                    var4 = class9.field682[super.field1567].field684[super.field1568];
                }
                return this.field736.method575(-1, var4, (byte) -101, (int[]) null);
            }
        }
    }
}
