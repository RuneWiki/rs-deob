import java.awt.Canvas;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class93 {

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "Leg;")
    public static class37 field1464 = null;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
    public static int field1467 = 0;

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "Leg;")
    private static class37 field1471 = class174.method1167("Please wait )2 attempting to reestablish)3", -67);

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "Leg;")
    public static class37 field1468 = field1471;

    @OriginalMember(owner = "client!ok", name = "x", descriptor = "Leg;")
    private static class37 field1477 = class174.method1167("Loaded world list data", 93);

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "Leg;")
    public static class37 field1456 = field1477;

    @OriginalMember(owner = "client!ok", name = "u", descriptor = "I")
    public static int field1474 = 2301979;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public int field1454;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public int field1455;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public int field1457;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public int field1460;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public int field1462;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!ok", name = "t", descriptor = "I")
    public int field1473;

    @OriginalMember(owner = "client!ok", name = "v", descriptor = "I")
    public int field1475;

    @OriginalMember(owner = "client!ok", name = "w", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "Ljl;")
    public static class101 field1459;

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "Ljl;")
    public static class101 field1470;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1466;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "[B")
    public byte[] field1458;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "[B")
    public byte[] field1461;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIB)V")
    public static final void method608(int arg0, int arg1, byte arg2) {
        int var3 = arg0;
        if (arg0 > 25) {
            var3 = 25;
        }
        field1476++;
        if (arg2 != 55) {
            method610((byte) 60);
        }
        arg0--;
        int var4 = class125.field2092[arg0];
        int var5 = class89.field1428[arg0];
        if (arg1 == 0) {
            class144.field2451++;
            class273.field4778.method1697(249, 123);
            class273.field4778.method1292(var3 + var3 + 3, (byte) -64);
        }
        if (arg1 == 1) {
            class256.field4537++;
            class273.field4778.method1697(98, 109);
            class273.field4778.method1292(var3 + var3 + 17, (byte) -64);
        }
        if (arg1 == 2) {
            class163.field2683++;
            class273.field4778.method1697(218, 97);
            class273.field4778.method1292(var3 + var3 + 3, (byte) -64);
        }
        class273.field4778.method1262(83, class40.field642 + var5);
        class73.field1159 = class89.field1428[0];
        class59.field975 = class125.field2092[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg0--;
            class273.field4778.method1292(class89.field1428[arg0] - var5, (byte) -64);
            class273.field4778.method1288(7846, class125.field2092[arg0] - var4);
        }
        class273.field4778.method1245(class158.field2625[82] ? 1 : 0, -108);
        class273.field4778.method1265(class144.field2456 + var4, -23132);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IJ)Leg;")
    public static final class37 method609(int arg0, long arg1) {
        class280.field4941.setTime(new Date(arg1));
        field1469++;
        int var3 = class280.field4941.get(7);
        if (arg0 != -1) {
            method609(68, -9L);
        }
        int var4 = class280.field4941.get(5);
        int var5 = class280.field4941.get(2);
        int var6 = class280.field4941.get(1);
        int var7 = class280.field4941.get(11);
        int var8 = class280.field4941.get(12);
        int var9 = class280.field4941.get(13);
        return class156.method1061((byte) 47, new class37[] { class228.field3917[var3 - 1], class29.field429, class163.method1096(var4 / 10, (byte) -35), class163.method1096(var4 % 10, (byte) -35), class233.field4023, class133.field2300[var5], class233.field4023, class163.method1096(var6, (byte) -35), class225.field3861, class163.method1096(var7 / 10, (byte) -35), class163.method1096(var7 % 10, (byte) -35), class31.field459, class163.method1096(var8 / 10, (byte) -35), class163.method1096(var8 % 10, (byte) -35), class31.field459, class163.method1096(var9 / 10, (byte) -35), class163.method1096(var9 % 10, (byte) -35), class239.field4256 });
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
    public static void method610(byte arg0) {
        field1464 = null;
        field1459 = null;
        field1456 = null;
        field1470 = null;
        if (arg0 != -74) {
            method610((byte) -15);
        }
        field1466 = null;
        field1468 = null;
        field1471 = null;
        field1477 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BIZZI)V")
    public static final void method611(byte arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        if (arg0 != -97) {
            method610((byte) 120);
        }
        class84.method562(0, class69.field1103.length - 1, 127, arg4, arg2, arg3, arg1);
        field1463++;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIII)V")
    public static final void method612(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class96.field1507 = arg1;
        int var5 = -10 % ((arg0 + 5) / 50);
        field1472++;
        class286.field5050 = arg4;
        class178.field2972 = arg3;
        class217.field3741 = arg2;
    }
}
