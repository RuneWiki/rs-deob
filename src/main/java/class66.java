import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public abstract class class66 extends class119 {

    @OriginalMember(owner = "client!jd", name = "N", descriptor = "I")
    public int field1488 = 1000;

    @OriginalMember(owner = "client!jd", name = "M", descriptor = "Lv;")
    public static class146 field1487 = class159.method1226((byte) -37, "<col=ffb000>");

    @OriginalMember(owner = "client!jd", name = "K", descriptor = "Lv;")
    public static class146 field1485 = class159.method1226((byte) -37, "::rect_debug");

    @OriginalMember(owner = "client!jd", name = "I", descriptor = "I")
    public static int field1483 = 0;

    @OriginalMember(owner = "client!jd", name = "L", descriptor = "Lv;")
    public static class146 field1486 = class159.method1226((byte) -37, "<col=ff9040>");

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "Lv;")
    private static class146 field1480 = class159.method1226((byte) -37, "Service unavailable)3");

    @OriginalMember(owner = "client!jd", name = "T", descriptor = "Lv;")
    private static class146 field1494 = class159.method1226((byte) -37, "New User");

    @OriginalMember(owner = "client!jd", name = "P", descriptor = "Lv;")
    public static class146 field1490 = field1494;

    @OriginalMember(owner = "client!jd", name = "S", descriptor = "Lv;")
    public static class146 field1493 = field1480;

    @OriginalMember(owner = "client!jd", name = "J", descriptor = "I")
    public static int field1484 = -1;

    @OriginalMember(owner = "client!jd", name = "G", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!jd", name = "O", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!jd", name = "Q", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!jd", name = "U", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!jd", name = "W", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!jd", name = "X", descriptor = "Lt;")
    public static class132 field1498;

    @OriginalMember(owner = "client!jd", name = "V", descriptor = "Lwc;")
    public static class156 field1496;

    @OriginalMember(owner = "client!jd", name = "R", descriptor = "Lla;")
    public static class77 field1492;

    @OriginalMember(owner = "client!jd", name = "H", descriptor = "[Lie;")
    public static class61[] field1482;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(IIII)V")
    public static final void method471(int arg0, int arg1, int arg2, int arg3) {
        field1489++;
        class26 var4 = class74.method551(arg1, arg0, -32540);
        if (var4 != null && var4.field560 != null) {
            class120 var5 = new class120();
            var5.field2790 = var4.field560;
            var5.field2787 = var4;
            class25.method157(var5, 5);
        }
        class107.field2565 = arg0;
        class110.field2611 = arg1;
        if (arg2 <= 45) {
            field1487 = null;
        }
        class22.field367 = true;
        class142.field3241 = arg3;
        class75.method567((byte) 113, var4);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lla;ZII)[Lue;")
    public static final class144[] method472(class77 arg0, boolean arg1, int arg2, int arg3) {
        field1491++;
        if (class1.method3(arg2, arg3, -117, arg0)) {
            return arg1 ? class20.method110((byte) -123) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIIIII)V")
    public void method473(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1495++;
        class139 var10 = this.method255((byte) -127);
        if (var10 != null) {
            this.field1488 = var10.field1488;
            var10.method473(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)Lu;")
    public class139 method255(byte arg0) {
        field1481++;
        if (arg0 > -90) {
            field1498 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(I)V")
    public static void method474(int arg0) {
        field1485 = null;
        field1482 = null;
        field1487 = null;
        field1496 = null;
        field1498 = null;
        field1480 = null;
        field1493 = null;
        field1494 = null;
        field1492 = null;
        field1490 = null;
        field1486 = null;
        int var1 = -27 % ((arg0 - 61) / 61);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILod;)V")
    public static final void method475(int arg0, class101 arg1) {
        field1497++;
        int var2 = 0;
        if (arg1.field2456 == 0) {
            var2 = field1496.method1168(arg1.field2446, arg1.field2447, arg1.field2453);
        }
        int var3 = 0;
        if (arg1.field2456 == 1) {
            var2 = field1496.method1184(arg1.field2446, arg1.field2447, arg1.field2453);
        }
        if (arg1.field2456 == 2) {
            var2 = field1496.method1204(arg1.field2446, arg1.field2447, arg1.field2453);
        }
        if (arg0 != -17301) {
            return;
        }
        int var4 = 0;
        if (arg1.field2456 == 3) {
            var2 = field1496.method1180(arg1.field2446, arg1.field2447, arg1.field2453);
        }
        int var5 = -1;
        if (var2 != 0) {
            int var6 = field1496.method1196(arg1.field2446, arg1.field2447, arg1.field2453, var2);
            var5 = var2 >> 14 & 0x7FFF;
            var3 = var6 >> 6 & 0x3;
            var4 = var6 & 0x1F;
        }
        arg1.field2462 = var4;
        arg1.field2463 = var3;
        arg1.field2443 = var5;
    }
}
