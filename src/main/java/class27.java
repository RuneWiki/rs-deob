import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class27 {

    @OriginalMember(owner = "client!na", name = "d", descriptor = "Lsf;")
    public static class108 field414 = class140.method973(255, "::wm2");

    @OriginalMember(owner = "client!na", name = "c", descriptor = "Lsf;")
    public static class108 field413 = class140.method973(255, "Memory before cleanup=");

    @OriginalMember(owner = "client!na", name = "g", descriptor = "Lca;")
    public static class98 field417 = null;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V", line = 11)
    public static void method175(byte arg0) {
        field414 = null;
        if (arg0 != 48) {
            field415 = -1;
        }
        field413 = null;
        field417 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 23)
    public static final void method176(byte arg0, Component arg1) {
        field419++;
        arg1.addMouseListener(class206.field3694);
        arg1.addMouseMotionListener(class206.field3694);
        arg1.addFocusListener(class206.field3694);
        int var2 = -74 % ((54 - arg0) / 61);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IZ)Z", line = 55)
    public static final boolean method177(int arg0, boolean arg1) {
        field418++;
        if (arg1) {
            return false;
        } else {
            return (arg0 >> 31 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V", line = 89)
    public static final void method178(int arg0) {
        while (true) {
            if (class293.field5127.method1435(class191.field3471, (byte) -18) >= 27) {
                int var1 = class293.field5127.method1431((byte) -94, 15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class159.field2863[var1] == null) {
                        class159.field2863[var1] = new class45();
                        var2 = true;
                    }
                    class45 var3 = class159.field2863[var1];
                    class168.field3020[class61.field969++] = var1;
                    var3.field4459 = class116.field2000;
                    if (var3.field646 != null && var3.field646.method935((byte) 80)) {
                        class320.method2218(var3, (byte) 80);
                    }
                    int var4 = class293.field5127.method1431((byte) -94, 1);
                    if (var4 == 1) {
                        class283.field4947[class312.field5400++] = var1;
                    }
                    int var5 = class293.field5127.method1431((byte) -94, 5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = class276.field4831[class293.field5127.method1431((byte) -94, 3)];
                    if (var2) {
                        var3.field4486 = var3.field4518 = var6;
                    }
                    int var7 = class293.field5127.method1431((byte) -94, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = class293.field5127.method1431((byte) -94, 1);
                    var3.method317(0, class57.method397(0, class293.field5127.method1431((byte) -94, 14)));
                    var3.method1810(var3.field646.field2381, -124);
                    var3.field4496 = var3.field646.field2377;
                    var3.field4510 = var3.field646.field2398;
                    var3.field4455 = var3.field646.field2401;
                    var3.field4465 = var3.field646.field2353;
                    var3.field4449 = var3.field646.field2370;
                    var3.field4490 = var3.field646.field2404;
                    var3.field4470 = var3.field646.field2371;
                    if (var3.field4510 == 0) {
                        var3.field4518 = 0;
                    }
                    var3.field4497 = var3.field646.field2409;
                    var3.method1804(class95.field1513.field4498[0] + var5, var8 == 1, class95.field1513.field4482[0] + var7, var3.method363((byte) 117), 16852);
                    if (var3.field646.method935((byte) 113)) {
                        class290.method2072(var3.field4482[0], 0, (class60) null, class295.field5159, (class51) null, 128, var3.field4498[0], var3);
                    }
                    continue;
                }
            }
            class293.field5127.method1430(-21016);
            int var9 = 69 % ((-arg0 - 21) / 52);
            field412++;
            return;
        }
    }
}
