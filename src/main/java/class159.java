import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class159 extends class86 {

    @OriginalMember(owner = "client!vk", name = "t", descriptor = "I")
    public static int field2598 = 0;

    @OriginalMember(owner = "client!vk", name = "B", descriptor = "Lbe;")
    public static class283 field2606 = class153.method941(126, ":trade:");

    @OriginalMember(owner = "client!vk", name = "w", descriptor = "Lbe;")
    public static class283 field2601 = class153.method941(127, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!vk", name = "C", descriptor = "I")
    public static int field2607 = 3353893;

    @OriginalMember(owner = "client!vk", name = "v", descriptor = "I")
    public int field2600;

    @OriginalMember(owner = "client!vk", name = "x", descriptor = "I")
    public int field2602;

    @OriginalMember(owner = "client!vk", name = "z", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!vk", name = "A", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!vk", name = "D", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!vk", name = "y", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field2603;

    @OriginalMember(owner = "client!vk", name = "u", descriptor = "[Lnh;")
    public static class107[] field2599;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Z)V", line = 8)
    public static final void method971(boolean arg0) {
        int var1 = -1;
        if (arg0) {
            method971(true);
        }
        while (var1 < class297.field5033) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class162.field2666[var1];
            }
            class191 var3 = class149.field2436[var2];
            if (var3 != null && var3.field1189 > 0) {
                var3.field1189--;
                if (var3.field1189 == 0) {
                    var3.field1190 = null;
                }
            }
            var1++;
        }
        field2605++;
        for (int var4 = 0; var4 < class242.field4078; var4++) {
            int var5 = class219.field3698[var4];
            class60 var6 = class33.field493[var5];
            if (var6 != null && var6.field1189 > 0) {
                var6.field1189--;
                if (var6.field1189 == 0) {
                    var6.field1190 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILbe;III)V", line = 76)
    public static final void method972(int arg0, class283 arg1, int arg2, int arg3, int arg4) {
        field2608++;
        class69 var5 = class225.method1480((byte) 117, arg3, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field1103 != null) {
            class231 var6 = new class231();
            var6.field3919 = var5.field1103;
            var6.field3914 = arg1;
            var6.field3912 = var5;
            var6.field3925 = arg0;
            class194.method1253(var6, 21258);
        }
        boolean var7 = true;
        if (var5.field975 > 0) {
            var7 = class151.method930(var5, -124);
        }
        if (!var7 || !class219.method1442(arg0 - 1, 103, client.method1601(var5))) {
            return;
        }
        if (arg0 == 1) {
            class48.field657++;
            class228.field3831.method621(199, 8);
            class228.field3831.method1515(arg2, 80);
            class228.field3831.method1510((byte) 56, arg3);
        }
        if (arg4 < 51) {
            method972(-59, (class283) null, -112, 40, -82);
        }
        if (arg0 == 2) {
            class228.field3831.method621(159, 8);
            class13.field134++;
            class228.field3831.method1515(arg2, 64);
            class228.field3831.method1510((byte) 62, arg3);
        }
        if (arg0 == 3) {
            class24.field367++;
            class228.field3831.method621(172, 8);
            class228.field3831.method1515(arg2, 71);
            class228.field3831.method1510((byte) 35, arg3);
        }
        if (arg0 == 4) {
            class178.field3063++;
            class228.field3831.method621(21, 8);
            class228.field3831.method1515(arg2, 119);
            class228.field3831.method1510((byte) 44, arg3);
        }
        if (arg0 == 5) {
            class228.field3831.method621(207, 8);
            class284.field4848++;
            class228.field3831.method1515(arg2, 119);
            class228.field3831.method1510((byte) 121, arg3);
        }
        if (arg0 == 6) {
            class288.field4897++;
            class228.field3831.method621(194, 8);
            class228.field3831.method1515(arg2, 86);
            class228.field3831.method1510((byte) 56, arg3);
        }
        if (arg0 == 7) {
            class226.field3803++;
            class228.field3831.method621(87, 8);
            class228.field3831.method1515(arg2, 100);
            class228.field3831.method1510((byte) 14, arg3);
        }
        if (arg0 == 8) {
            class49.field684++;
            class228.field3831.method621(217, 8);
            class228.field3831.method1515(arg2, 76);
            class228.field3831.method1510((byte) 59, arg3);
        }
        if (arg0 == 9) {
            class228.field3831.method621(89, 8);
            class228.field3831.method1515(arg2, 120);
            class228.field3831.method1510((byte) 28, arg3);
            class60.field832++;
        }
        if (arg0 == 10) {
            class61.field845++;
            class228.field3831.method621(214, 8);
            class228.field3831.method1515(arg2, 71);
            class228.field3831.method1510((byte) 107, arg3);
        }
    }

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "(I)V", line = 228)
    public static void method973(int arg0) {
        int var1 = -14 % ((arg0 - 87) / 36);
        field2599 = null;
        field2603 = null;
        field2606 = null;
        field2601 = null;
    }
}
