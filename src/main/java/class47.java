import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class47 extends class475 {

    @OriginalMember(owner = "client!hq", name = "M", descriptor = "Ljava/lang/Object;")
    private Object field627;

    @OriginalMember(owner = "client!hq", name = "H", descriptor = "I")
    public static int field622 = 0;

    @OriginalMember(owner = "client!hq", name = "I", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!hq", name = "J", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!hq", name = "K", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!hq", name = "L", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!hq", name = "N", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "(I)V")
    public static final void method370(int arg0) {
        field624++;
        int var1 = (int) ((double) class430.field6136 * 34.46D);
        if (arg0 != 0) {
            method372((byte) 98);
        }
        int var2 = var1 << 2;
        if (class637.field9048.method778()) {
            var2 += 512;
        }
        class637.field9048.method765(200, var2);
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIZ[Lis;I)V")
    public static final void method371(int arg0, int arg1, int arg2, boolean arg3, class101[] arg4, int arg5) {
        for (int var6 = arg5; var6 < arg4.length; var6++) {
            class101 var7 = arg4[var6];
            if (var7 != null && var7.field1539 == arg0) {
                class293.method1794(arg1, var7, arg2, arg3, -82);
                class104.method878(arg1, arg2, -50, var7);
                if (var7.field1557 - var7.field1604 < var7.field1518) {
                    var7.field1518 = var7.field1557 - var7.field1604;
                }
                if ((var7.field1592 - var7.field1651) < var7.field1523) {
                    var7.field1523 = var7.field1592 - var7.field1651;
                }
                if (var7.field1518 < 0) {
                    var7.field1518 = 0;
                }
                if (var7.field1523 < 0) {
                    var7.field1523 = 0;
                }
                if (var7.field1584 == 0) {
                    class486.method2843(46, arg3, var7);
                }
            }
        }
        field628++;
    }

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "(B)V")
    public static final void method372(byte arg0) {
        class351.field4936.method936(-116);
        if (arg0 != -29) {
            field622 = 32;
        }
        field625++;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method373(boolean arg0) {
        field626++;
        if (!arg0) {
            this.field627 = null;
        }
        return this.field627;
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class47(Object arg0, int arg1) {
        super(arg1);
        this.field627 = arg0;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)Z")
    public final boolean method374(int arg0) {
        if (arg0 != 0) {
            this.method373(false);
        }
        field623++;
        return false;
    }
}
