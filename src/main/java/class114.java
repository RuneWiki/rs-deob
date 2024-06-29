import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class114 extends class60 {

    @OriginalMember(owner = "client!te", name = "J", descriptor = "I")
    public int field1558 = -1;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "I")
    public int field1548 = -1;

    @OriginalMember(owner = "client!te", name = "C", descriptor = "Ll;")
    public static class261 field1551 = new class261(100);

    @OriginalMember(owner = "client!te", name = "H", descriptor = "Lvg;")
    public static class108 field1556 = new class108(5000);

    @OriginalMember(owner = "client!te", name = "A", descriptor = "I")
    public int field1549;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "I")
    public int field1550;

    @OriginalMember(owner = "client!te", name = "D", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!te", name = "E", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!te", name = "F", descriptor = "I")
    public int field1554;

    @OriginalMember(owner = "client!te", name = "G", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!te", name = "I", descriptor = "I")
    public int field1557;

    @OriginalMember(owner = "client!te", name = "K", descriptor = "Lqj;")
    public static class238 field1559;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lnr;I)V")
    public final void method161(class437 arg0, int arg1) {
        ++field1552;
        if (arg1 != 0) {
            field1559 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(Lnr;Z)Lg;")
    public final class433 method145(class437 arg0, boolean arg1) {
        if (arg1) {
            this.field1548 = 71;
        }
        ++field1553;
        class116 var3 = arg0.method2026();
        var3.method809(super.field870, super.field869, super.field871);
        class433 var4 = class436.method2758(3, 12300);
        if (this.field1558 != -1) {
            class95 var5 = class166.method1031(this.field1558, false).method1205((byte) -59, this.field1549, arg0, 0, 0, 1024, (class15) null, (class103) null, -1);
            if (var5 != null) {
                var5.method602(var3, var4.field6381[2], 0);
            }
        }
        if (this.field1548 != -1) {
            class95 var6 = class166.method1031(this.field1548, arg1).method1205((byte) -59, this.field1554, arg0, 0, 0, 1024, (class15) null, (class103) null, -1);
            if (var6 != null) {
                var6.method602(var3, var4.field6381[1], 0);
            }
        }
        class95 var7 = class166.method1031(this.field1557, arg1).method1205((byte) -59, this.field1550, arg0, 0, 0, 1024, (class15) null, (class103) null, -1);
        if (var7 != null) {
            var7.method602(var3, var4.field6381[0], 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public static void method798(int arg0) {
        field1551 = null;
        if (arg0 <= -112) {
            field1559 = null;
            field1556 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILnr;II)Z")
    public final boolean method159(int arg0, class437 arg1, int arg2, int arg3) {
        ++field1555;
        class116 var5 = arg1.method2026();
        if (arg3 <= 12) {
            this.method145((class437) null, false);
        }
        var5.method809(super.field870, super.field869, super.field871);
        class95 var6 = class166.method1031(this.field1557, false).method1205((byte) -59, this.field1550, arg1, 0, 0, 65536, (class15) null, (class103) null, -1);
        if (var6 != null && var6.method619(arg2, arg0, var5, true)) {
            return true;
        } else {
            if (~this.field1548 != 0) {
                class95 var7 = class166.method1031(this.field1548, false).method1205((byte) -59, this.field1554, arg1, 0, 0, 65536, (class15) null, (class103) null, -1);
                if (var7 != null && var7.method619(arg2, arg0, var5, true)) {
                    return true;
                }
            }
            if (this.field1558 != -1) {
                class95 var8 = class166.method1031(this.field1558, false).method1205((byte) -59, this.field1549, arg1, 0, 0, 65536, (class15) null, (class103) null, -1);
                if (var8 != null && var8.method619(arg2, arg0, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }
}
