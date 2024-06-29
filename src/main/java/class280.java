import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class280 extends class85 {

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "[I")
    public static int[] field4425 = new int[256];

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public static int field4427 = 0;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "[S")
    public static short[] field4429;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "[I")
    public static int[] field4430;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1882(int arg0, String arg1) {
        field4426++;
        if (class83.field1401 == null) {
            return;
        }
        long var2 = class148.method1000(arg1, 934);
        int var4 = 0;
        if (var2 == 0L) {
            return;
        }
        while (class83.field1401.length > var4 && class83.field1401[var4].field2603 != var2) {
            var4++;
        }
        if (class83.field1401.length <= var4 || class83.field1401[var4] == null) {
            return;
        }
        client.field2435.method536((byte) -104, 149);
        if (arg0 != -13554) {
            method1885(-34);
        }
        class219.field3374++;
        client.field2435.method638(class83.field1401[var4].field2603, false);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZIZIII)V")
    public static final void method1883(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field4428++;
        if (arg5 != -765) {
            field4429 = null;
        }
        if (arg0 == 3) {
            method1883(class181.field2829, true, -1, true, arg4, -765, -1);
            return;
        }
        Container var7;
        if (class39.field547 != null) {
            var7 = class39.field547;
        } else if (class47.field685 == null) {
            var7 = class179.field2788.field479;
        } else {
            var7 = class47.field685;
        }
        class266.field4249 = var7.getSize().width;
        client.field2439 = var7.getSize().height;
        if (class47.field685 == var7) {
            Insets var8 = class47.field685.getInsets();
            client.field2439 -= var8.top + var8.bottom;
            class266.field4249 -= var8.right + var8.left;
        }
        if (arg0 < 2) {
            class29.field409 = 765;
            class79.field1310 = 503;
            class103.field1717 = 0;
            class87.field1457 = (class266.field4249 - 765) / 2;
        } else {
            class87.field1457 = 0;
            class79.field1310 = client.field2439;
            class29.field409 = class266.field4249;
            class103.field1717 = 0;
        }
        if (arg3) {
            class39.method288(class230.field3651, -1);
            class126.method879(class230.field3651, arg5 + 29367);
            if (class213.field3320 != null) {
                class213.field3320.method1530(class230.field3651, 6);
            }
            class61.field1053.method1787(arg5 ^ 0xFFFFFD09);
            class72.method528(127, class230.field3651);
            class237.method1632(class230.field3651, -107);
            if (class213.field3320 != null) {
                class213.field3320.method1529(class230.field3651, (byte) -89);
            }
        } else {
            class230.field3651.setSize(class29.field409, class79.field1310);
            if (class47.field685 == var7) {
                Insets var9 = class47.field685.getInsets();
                class230.field3651.setLocation(class87.field1457 + var9.left, class103.field1717 + var9.top);
            } else {
                class230.field3651.setLocation(class87.field1457, class103.field1717);
            }
        }
        if (arg0 > 0) {
            method1883(0, true, -1, true, arg4, -765, -1);
            return;
        }
        class49.field711 = !class191.method1284(-89);
        if (class75.field1236 != -1) {
            class297.method1981(true, 19992);
        }
        if (class249.field4022 != null && (class39.field551 == 30 || class39.field551 == 25)) {
            class41.method299((byte) -10);
        }
        for (int var10 = 0; var10 < 100; var10++) {
            class25.field335[var10] = true;
        }
        class88.field1473 = true;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IB)V")
    public static final void method1884(int arg0, byte arg1) {
        class230.field3654 = (class259) class244.field3974.method285((long) arg0, 13821);
        field4423++;
        int var2 = -10 / ((arg1 - 30) / 58);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
    public static void method1885(int arg0) {
        if (arg0 > -20) {
            field4427 = -108;
        }
        field4425 = null;
        field4430 = null;
        field4429 = null;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var5 = var0;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var5 & 0x1) == 1) {
                    var5 = var5 >>> 1 ^ 0xEDB88320;
                } else {
                    var5 >>>= 0x1;
                }
            }
            field4425[var0] = var5;
        }
        field4429 = new short[] { 6798, 8741, 25238, 4626, 4550 };
        field4430 = new int[99];
        int var1 = 0;
        for (int var2 = 0; var2 < 99; var2++) {
            int var3 = var2 + 1;
            int var4 = (int) (Math.pow(2.0D, (double) var3 / 7.0D) * 300.0D + (double) var3);
            var1 += var4;
            field4430[var2] = var1 / 4;
        }
        field4431 = 0;
    }
}
