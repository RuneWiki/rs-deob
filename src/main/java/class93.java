import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class93 {

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "Lqk;")
    public static class207 field1641 = class24.method212(255, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "[S")
    public static short[] field1646 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "Lqk;")
    private static class207 field1644 = class24.method212(255, "Loaded input handler");

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "Lqk;")
    public static class207 field1647 = class24.method212(255, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "S")
    public static short field1650 = 256;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "[Lml;")
    public static class287[] field1649 = new class287[14];

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "Lqk;")
    public static class207 field1648 = field1644;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "Lqk;")
    public static class207 field1651 = class24.method212(255, ":allyreq:");

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    public static final void method665(byte arg0) {
        field1652++;
        if (!class256.field4588) {
            class268.field4751 = 1;
            class131.field2273[0] = class175.field3166;
            if (class272.field4796 != 0) {
                class16.field261 = class105.field1870;
                class21.field346 = class27.field550;
            } else if (class270.field4778 == 0) {
                class21.field346 = class268.field4747;
                class16.field261 = class20.field322;
            } else {
                class16.field261 = class121.field2092;
                class21.field346 = class47.field939;
            }
            class82.field1494[0] = 1003;
            class110.field1926[0] = class99.field1781;
            class12.field167[0] = class100.field1800;
        }
        if (class165.field2915 != -1) {
            class24.method182(class165.field2915, (byte) -128);
        }
        for (int var1 = 0; var1 < class110.field1930; var1++) {
            if (class140.field2431[var1]) {
                class212.field3766[var1] = true;
            }
            class9.field137[var1] = class140.field2431[var1];
            class140.field2431[var1] = false;
        }
        class127.field2196 = -1;
        class206.field3613 = -1;
        class154.field2672 = class160.field2844;
        class188.field3315 = null;
        if (arg0 != 97) {
            method667(-39, -67, (Random) null);
        }
        class185.field3282 = null;
        if (class165.field2915 != -1) {
            class110.field1930 = 0;
            class95.method685(-110);
        }
        class23.method148();
        class108.method781(107);
        if (class256.field4588) {
            if (class221.field4068) {
                class227.method1622(-27);
            } else {
                class196.method1365(14);
            }
        } else if (class188.field3315 != null) {
            class220.method1566(class188.field3315, class106.field1883, class230.field4226, (byte) 42);
        } else if (class206.field3613 != -1) {
            class220.method1566((class220) null, class206.field3613, class127.field2196, (byte) -128);
        }
        int var2 = class256.field4588 ? -1 : class177.method1266(-2);
        if (var2 == -1) {
            var2 = class118.field2050;
        }
        class192.method1338(var2, 123);
        if (class67.field1200 == 1) {
            class67.field1200 = 2;
        }
        if (class81.field1476 == 1) {
            class81.field1476 = 2;
        }
        if (class199.field3484 == 3) {
            for (int var3 = 0; var3 < class110.field1930; var3++) {
                if (class9.field137[var3]) {
                    class23.method159(class43.field852[var3], class111.field1941[var3], class68.field1209[var3], class128.field2229[var3], 16711935, 128);
                } else if (class212.field3766[var3]) {
                    class23.method159(class43.field852[var3], class111.field1941[var3], class68.field1209[var3], class128.field2229[var3], 16711680, 128);
                }
            }
        }
        class230.method1650(class20.field325, class202.field3565.field5072, (byte) -35, class202.field3565.field5104, field1645);
        class20.field325 = 0;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    public static void method666(int arg0) {
        field1648 = null;
        field1649 = null;
        if (arg0 != 0) {
            return;
        }
        field1646 = null;
        field1647 = null;
        field1641 = null;
        field1644 = null;
        field1651 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILjava/util/Random;)I")
    public static final int method667(int arg0, int arg1, Random arg2) {
        field1642++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class43.method326(arg1 ^ 0xFFFFC1A4, arg0)) {
            return (int) ((long) arg0 * ((long) arg2.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            if (arg1 != 15901) {
                method665((byte) 83);
            }
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg0));
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var3 <= var4);
            return class179.method1278(arg0, var4, 0);
        }
    }
}
