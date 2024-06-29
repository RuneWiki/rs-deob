import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public class class309 extends class156 {

    @OriginalMember(owner = "client!gga", name = "c", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!gga", name = "e", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!gga", name = "f", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!gga", name = "g", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!gga", name = "d", descriptor = "[Lnf;")
    public static class604[] field4220;

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(IIZII)V")
    public static final void method1971(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field4223++;
        if (class659.method3706(116, arg0) && arg3 == 8) {
            class584.method3353(-1, arg4, 0, arg1, class431.field5870[arg0], arg2);
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(I)V")
    public static void method1972(int arg0) {
        if (arg0 != 1) {
            field4220 = null;
        }
        field4220 = null;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(IIII)I")
    public static final int method1973(int arg0, int arg1, int arg2, int arg3) {
        field4219++;
        if (class745.field10286 == null) {
            return 0;
        }
        int var4 = arg1 >> 9;
        int var5 = arg2 >> 9;
        if (var4 < 0 || var5 < 0 || var4 > (class483.field6515 - 1) || class65.field926 - 1 < var5) {
            return 0;
        } else if (arg0 == 15356) {
            int var6 = arg3;
            if (arg3 < 3 && (class554.field7832[1][var4][var5] & 0x2) != 0) {
                var6 = arg3 + 1;
            }
            return class745.field10286[var6].method1907(arg1, (byte) -77, arg2);
        } else {
            return -66;
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(ILv;ZI)V")
    public static final void method1974(int arg0, class606 arg1, boolean arg2, int arg3) {
        if (arg2) {
            return;
        }
        field4222++;
        if (!class611.field8532) {
            return;
        }
        int var4 = 0;
        for (class534 var5 = (class534) arg1.field8460.method1951(-723780560); var5 != null; var5 = (class534) arg1.field8460.method1946(-6974)) {
            int var10 = class411.method2438((byte) -70, var5);
            if (var4 < var10) {
                var4 = var10;
            }
        }
        var4 += 8;
        class424.field5808 = arg1.field8457 * 16 + (class608.field8486 ? 26 : 22);
        int var6 = arg1.field8457 * 16 + 21;
        int var7 = class480.field6479 + class326.field4452;
        if ((var4 + var7) > class732.field10098) {
            var7 = class480.field6479 - var4;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = class608.field8486 ? 33 : 31;
        int var9 = arg3 + 13 - var8;
        if (var6 + var9 > class108.field1697) {
            var9 = class108.field1697 - var6;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        class396.field5471 = var7;
        class429.field5856 = var9;
        class119.field2183 = var4;
        class426.field5815 = arg1;
    }
}
