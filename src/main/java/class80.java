import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class80 extends Canvas {

    @OriginalMember(owner = "client!na", name = "p", descriptor = "Ljava/awt/Component;")
    private Component field1957;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "Lae;")
    private static class6 field1944 = class64.method474(105, "white:");

    @OriginalMember(owner = "client!na", name = "h", descriptor = "Lae;")
    public static class6 field1949 = class64.method474(121, "und die Schaltfl-=che (WSpielkonto erstellen(W am");

    @OriginalMember(owner = "client!na", name = "a", descriptor = "Lae;")
    public static class6 field1942 = field1944;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "Lae;")
    public static class6 field1953 = class64.method474(108, "Cabbage");

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    public static int field1956 = 0;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "Lae;")
    public static class6 field1950 = class64.method474(106, "Zu viele Verbindungen von Ihrer Adresse)3");

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field1946 = 0;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "Lae;")
    private static class6 field1959 = class64.method474(123, "Login server offline)3");

    @OriginalMember(owner = "client!na", name = "j", descriptor = "Lae;")
    public static class6 field1951 = class64.method474(117, "Neuer Benutzer");

    @OriginalMember(owner = "client!na", name = "f", descriptor = "Lae;")
    public static class6 field1947 = field1959;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "I")
    public static int field1960 = 0;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!na", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 3)
    public final void update(Graphics arg0) {
        field1954++;
        this.field1957.update(arg0);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V", line = 15)
    public static final void method686(int arg0) {
        field1943++;
        class12.method125((byte) 54);
        if (class7.field161 == 1) {
            class88.field2110[class43.field1003 / 100].method850(class35.field827 - 8 - 4, class75.field1687 - 8 + -4);
        }
        if (class7.field161 == 2) {
            class88.field2110[class43.field1003 / 100 + 4].method850(class35.field827 - 8 - 4, class75.field1687 + -8 - 4);
        }
        if (arg0 != -32024) {
            return;
        }
        if (class43.field982 != -1) {
            class52.method415(class43.field982, (byte) 127);
            class95.method784(334, 512, 0, class43.field982, 0, -1, 4);
        }
        if (class103.field2449 != -1) {
            class52.method415(class103.field2449, (byte) 112);
            class95.method784(334, 512, 0, class103.field2449, 0, -1, 0);
        }
        class42.method350(false);
        if (!class125.field3052) {
            class6.method66(arg0 ^ 0xFFFF82D9);
            class59.method438(-23401);
        } else if (class67.field1473 == 0) {
            class4.method20(-104);
        }
        if (class69.field1532 == 1) {
            class121.field2994.method850(472, 296);
        }
        if (class34.field808) {
            short var1 = 507;
            int var2 = 16776960;
            byte var3 = 20;
            class102.field2397.method89(class85.method731(new class6[] { class51.field1161, class114.method942((byte) 71, class134.field3266) }, 14569), var1, var3, 16776960);
            int var9 = var3 + 15;
            Runtime var4 = Runtime.getRuntime();
            int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
            if (var5 > 32768 && class82.field2017) {
                var2 = 16711680;
            }
            if (var5 > 65536 && !class82.field2017) {
                var2 = 16711680;
            }
            class102.field2397.method89(class85.method731(new class6[] { class126.field3075, class114.method942((byte) 71, var5), class123.field3032 }, 14569), var1, var9, var2);
            var9 += 15;
            if (class81.field1964) {
                class102.field2397.method89(class35.field831, var1, var9, 16711680);
                class81.field1964 = false;
                var9 += 15;
            }
            if (class102.field2405) {
                class102.field2397.method89(class21.field501, var1, var9, 16711680);
                class102.field2405 = false;
                var9 += 15;
            }
            if (class15.field312) {
                class102.field2397.method89(class58.field1263, var1, var9, 16711680);
                class15.field312 = false;
                var9 += 15;
            }
        }
        if (class78.field1888 == 0) {
            return;
        }
        int var6 = class78.field1888 / 50;
        int var7 = var6 / 60;
        int var8 = var6 % 60;
        if (var8 < 10) {
            class102.field2397.method106(class85.method731(new class6[] { class52.field1167, class114.method942((byte) 71, var7), class68.field1514, class114.method942((byte) 71, var8) }, arg0 + 46593), 4, 329, 16776960);
        } else {
            class102.field2397.method106(class85.method731(new class6[] { class52.field1167, class114.method942((byte) 71, var7), class34.field813, class114.method942((byte) 71, var8) }, 14569), 4, 329, 16776960);
        }
    }

    @OriginalMember(owner = "client!na", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 152)
    public final void paint(Graphics arg0) {
        this.field1957.paint(arg0);
        field1955++;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IB)Lr;", line = 170)
    public static final class107 method687(int arg0, byte arg1) {
        field1948++;
        class107 var2 = (class107) class15.field313.method128((byte) -106, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class95.field2246.method160(30605, 6, arg0);
        class107 var4 = new class107();
        var4.field2526 = arg0;
        if (var3 != null) {
            var4.method908(new class77(var3), 122);
        }
        if (arg1 <= 19) {
            method688((byte) -11);
        }
        var4.method906(false);
        if (var4.field2551) {
            var4.field2547 = false;
            var4.field2522 = false;
        }
        class15.field313.method130(var4, (long) arg0, (byte) 127);
        return var4;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V", line = 208)
    public static final void method688(byte arg0) {
        field1958++;
        for (class96 var1 = (class96) class7.field155.method798(false); var1 != null; var1 = (class96) class7.field155.method792((byte) -87)) {
            if (var1.field2282 != null) {
                var1.method799(-67);
            }
        }
        if (arg0 <= 102) {
            field1946 = -22;
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 231)
    public class80(Component arg0) {
        this.field1957 = arg0;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V", line = 264)
    public static void method689(int arg0) {
        field1953 = null;
        field1947 = null;
        if (arg0 != 296) {
            return;
        }
        field1959 = null;
        field1949 = null;
        field1942 = null;
        field1944 = null;
        field1950 = null;
        field1951 = null;
    }
}
