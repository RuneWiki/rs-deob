import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class631 implements class590 {

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "Llf;")
    private class505 field9137;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "[Ltg;")
    public static class334[] field9135 = new class334[8];

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field9129;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field9130;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field9131;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field9132;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field9133;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field9134;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public static int field9136;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field9138;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IJ)V", line = 3)
    public static final void method3624(int arg0, long arg1) {
        field9138++;
        if (class603.field8695 != null) {
            if (class684.field9659 == 1 || class684.field9659 == 5) {
                class507.method2883(arg1, -1);
            } else if (class684.field9659 == 4) {
                class324.method2008(arg0 ^ 0xFFFFFFFE, arg1);
            }
        }
        class224.method1397(class332.field4821, (long) class45.field685, (byte) -23);
        if (class567.field8270 != -1) {
            class19.method129(class567.field8270, -18129);
        }
        for (int var3 = 0; var3 < class7.field215; var3++) {
            if (class394.field5969[var3]) {
                class27.field475[var3] = true;
            }
            class586.field8509[var3] = class394.field5969[var3];
            class394.field5969[var3] = false;
        }
        class22.field430 = class45.field685;
        if (class567.field8270 != -1) {
            class7.field215 = 0;
            class51.method304(true);
        }
        class332.field4821.method699();
        class347.method2158(class332.field4821, -86);
        int var4 = class366.method2246(-127);
        if (var4 == -1) {
            var4 = class222.field2943;
        }
        if (var4 == -1) {
            var4 = class676.field9528;
        }
        if (arg0 != -2) {
            field9135 = null;
        }
        class481.method2753((byte) 104, var4);
        int var5 = class321.field4681.method422((byte) 85) << 8;
        class15.method105(class321.field4681.field7905, class321.field4681.field7896 + var5, class321.field4681.field7895 + var5, class255.field3319, -27395);
        class255.field3319 = 0;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BII)Z", line = 68)
    public static final boolean method3625(byte arg0, int arg1, int arg2) {
        field9134++;
        if (arg0 != 16) {
            method3628(null, (byte) 84, null);
        }
        boolean var3 = (arg2 & 0x37) == 0 ? class115.method855(arg2, arg1, -1148) : class403.method2487(0, arg2, arg1);
        return (arg1 & 0x10000) != 0 | class48.method290(arg2, arg0 + 11599, arg1) | var3;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)Z", line = 81)
    public final boolean method941(byte arg0) {
        if (arg0 >= -15) {
            this.field9137 = null;
        }
        field9133++;
        return true;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZ)V", line = 92)
    public final void method944(int arg0, boolean arg1) {
        if (arg1) {
            class332.field4821.method700(0, 0, class454.field6538, class425.field6218, this.field9137.field7151, 0);
        }
        if (arg0 != -31764) {
            method3627(41, 99, 57, 119, -26, 112, 2);
        }
        field9132++;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V", line = 110)
    public static void method3626(int arg0) {
        field9135 = null;
        int var1 = 0 % ((69 - arg0) / 32);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIII)Z", line = 119)
    public static final boolean method3627(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9131++;
        if (!class512.field7212) {
            return false;
        } else if (class56.field890 < 100) {
            return false;
        } else if (arg2 != arg4 || arg1 != arg6) {
            for (int var9 = arg2; var9 <= arg4; var9++) {
                for (int var12 = arg6; var12 <= arg1; var12++) {
                    if (class154.field2177[arg0][var9][var12] == (-class612.field8820)) {
                        return false;
                    }
                }
            }
            int var10 = (arg2 << class125.field1831) + 1;
            int var11 = (arg6 << class125.field1831) + 2;
            if (class682.method3825(var11, class178.field2480[arg0].method3822(arg6, arg2, arg5 + arg5), (arg4 + 1 - arg2) * class263.field3412, arg3, (arg1 + 1 - arg6) * class263.field3412, (byte) -70, var10)) {
                class607.field8766++;
                return true;
            } else {
                return false;
            }
        } else if (class636.method3638(-20628, arg6, arg0, arg2)) {
            int var7 = arg2 << class125.field1831;
            int var8 = arg6 << class125.field1831;
            if (class682.method3825(var8, class178.field2480[arg0].method3822(arg6, arg2, arg5), class263.field3412, arg3, class263.field3412, (byte) -77, var7)) {
                class607.field8766++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Liba;BLcr;)Loda;", line = 182)
    public static final class654 method3628(class211 arg0, byte arg1, class162 arg2) {
        field9129++;
        class654 var3 = class572.method3286(-63);
        var3.field9362 = arg0.field2848;
        var3.field9355 = arg0;
        if (var3.field9362 == -1) {
            var3.field9358 = new class311(260);
        } else if (var3.field9362 == -2) {
            var3.field9358 = new class311(10000);
        } else if (var3.field9362 <= 18) {
            var3.field9358 = new class311(20);
        } else if (var3.field9362 <= 98) {
            var3.field9358 = new class311(100);
        } else {
            var3.field9358 = new class311(260);
        }
        var3.field9358.method1945(arg2, 80);
        var3.field9358.method1939(true, var3.field9355.method1336((byte) 64));
        var3.field9360 = 0;
        return arg1 == -51 ? var3 : null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V", line = 224)
    public final void method940(int arg0) {
        field9130++;
        if (arg0 != -32557) {
            this.field9137 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Llf;)V", line = 234)
    public class631(class505 arg0) {
        this.field9137 = arg0;
    }
}
