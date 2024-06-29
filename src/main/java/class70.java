import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class70 {

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field1106 = 127;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "Lcd;")
    public static class28 field1104 = new class28(0, -1);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IILjava/awt/Component;I)Lta;")
    public static final class272 method559(int arg0, int arg1, Component arg2, int arg3) {
        if (arg3 != -1) {
            field1104 = null;
        }
        field1102++;
        try {
            Class var4 = Class.forName("rk");
            class272 var5 = (class272) var4.getDeclaredConstructor().newInstance();
            var5.method1456(125, arg0, arg2, arg1);
            return var5;
        } catch (Throwable var7) {
            class208 var6 = new class208();
            var6.method1456(61, arg0, arg2, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lub;Z)V")
    public static final void method560(class92 arg0, boolean arg1) {
        field1103++;
        if (arg1) {
            method562(57, -83, (byte) -108, -74, -20);
        }
        class138.field2078 = arg0;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public static void method561(int arg0) {
        if (arg0 <= -79) {
            field1104 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIBII)Lnj;")
    public static final class146 method562(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != -40) {
            method559(-94, 23, (Component) null, -83);
        }
        long var5 = (long) arg1 << 32 & 0xFFFFL << 32 | ((long) arg0 & 0xFFFFL) << 48 | 0xFFFFL << 16 & (long) arg3 << 16 | (long) arg4 & 0xFFFFL;
        class146 var7 = (class146) class134.field2003.method1173(var5, true);
        field1101++;
        if (var7 != null) {
            return var7;
        }
        class275[] var8 = null;
        class175 var9 = class200.method1416(arg4, (byte) 115);
        if (var9.field2700 != null) {
            var8 = new class275[var9.field2700.length];
            for (int var10 = 0; var10 < var8.length; var10++) {
                class123 var11 = class205.method1437(var9.field2700[var10], (byte) -60);
                var8[var10] = new class275(var11.field1860, var11.field1852, var11.field1867, var11.field1865, var11.field1866, var11.field1857, var11.field1861, var11.field1848);
            }
        }
        class146 var12 = new class146(var9.field2697, var8, var9.field2705, arg0, arg1, arg3);
        class134.field2003.method1167((byte) -14, var12, var5);
        return var12;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIBLjava/lang/String;I)V")
    public static final void method563(int arg0, int arg1, byte arg2, String arg3, int arg4) {
        class222 var5 = class77.method605(arg4, arg1, (byte) -32);
        field1105++;
        if (var5 == null) {
            return;
        }
        if (var5.field3519 != null) {
            class26 var6 = new class26();
            var6.field450 = var5.field3519;
            var6.field453 = var5;
            var6.field451 = arg3;
            var6.field444 = arg0;
            class15.method116(8, var6);
        }
        boolean var7 = true;
        if (var5.field3388 > 0) {
            var7 = class15.method117(-1, var5);
        }
        if (!var7 || !client.method1159(var5).method229(1, arg0 - 1)) {
            return;
        }
        if (arg2 < 9) {
            field1104 = null;
        }
        if (arg0 == 1) {
            class240.field3826.method1762(89, true);
            class191.field2987++;
            class240.field3826.method258(arg1, -1527329320);
            class240.field3826.method281((byte) -110, arg4);
        }
        if (arg0 == 2) {
            class248.field3945++;
            class240.field3826.method1762(126, true);
            class240.field3826.method258(arg1, -1527329320);
            class240.field3826.method281((byte) -115, arg4);
        }
        if (arg0 == 3) {
            class240.field3826.method1762(101, true);
            class241.field3847++;
            class240.field3826.method258(arg1, -1527329320);
            class240.field3826.method281((byte) -111, arg4);
        }
        if (arg0 == 4) {
            class240.field3826.method1762(241, true);
            class110.field1703++;
            class240.field3826.method258(arg1, -1527329320);
            class240.field3826.method281((byte) -116, arg4);
        }
        if (arg0 == 5) {
            class207.field3208++;
            class240.field3826.method1762(150, true);
            class240.field3826.method258(arg1, -1527329320);
            class240.field3826.method281((byte) -122, arg4);
        }
        if (arg0 == 6) {
            class240.field3826.method1762(255, true);
            class240.field3826.method258(arg1, -1527329320);
            class240.field3826.method281((byte) -128, arg4);
            class211.field3255++;
        }
        if (arg0 == 7) {
            class240.field3826.method1762(52, true);
            class143.field2136++;
            class240.field3826.method258(arg1, -1527329320);
            class240.field3826.method281((byte) -123, arg4);
        }
        if (arg0 == 8) {
            class240.field3826.method1762(206, true);
            class181.field2844++;
            class240.field3826.method258(arg1, -1527329320);
            class240.field3826.method281((byte) -119, arg4);
        }
        if (arg0 == 9) {
            class149.field2206++;
            class240.field3826.method1762(189, true);
            class240.field3826.method258(arg1, -1527329320);
            class240.field3826.method281((byte) -126, arg4);
        }
        if (arg0 == 10) {
            class240.field3826.method1762(62, true);
            class110.field1706++;
            class240.field3826.method258(arg1, -1527329320);
            class240.field3826.method281((byte) -115, arg4);
        }
    }
}
