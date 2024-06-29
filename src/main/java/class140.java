import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class140 {

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "Lod;")
    public static class101 field3219 = class46.method335(-64, "::errortest");

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "Lod;")
    private static class101 field3231 = class46.method335(-59, "Loaded interfaces");

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public static int field3229 = 0;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Lod;")
    public static class101 field3226 = field3231;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field3228 = 0;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "Z")
    public static boolean field3232 = false;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "Lod;")
    public static class101 field3234 = class46.method335(-92, "Ihr Spielkonto wird bereits benutzt)3");

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Lie;")
    public static class61 field3220 = new class61(5000);

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "Lod;")
    public static class101 field3235 = class46.method335(-53, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "Lod;")
    public static class101 field3236 = class46.method335(-88, "<col=ff9040>");

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)[Lqe;")
    public static final class116[] method1116(boolean arg0) {
        field3225++;
        if (arg0) {
            return null;
        }
        class116[] var1 = new class116[class82.field1781];
        for (int var2 = 0; var2 < class82.field1781; var2++) {
            class116 var3 = var1[var2] = new class116();
            var3.field2568 = class6.field94;
            var3.field2571 = class34.field862;
            var3.field2567 = class2.field31[var2];
            var3.field2570 = class32.field822[var2];
            var3.field2572 = class150.field3434[var2];
            var3.field2574 = class138.field3173[var2];
            var3.field2573 = class93.field1998;
            var3.field2569 = class67.field1503[var2];
        }
        class63.method433(4096);
        return var1;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    public static void method1117(byte arg0) {
        field3220 = null;
        field3235 = null;
        field3234 = null;
        field3219 = null;
        field3236 = null;
        field3231 = null;
        if (arg0 != -58) {
            method1116(false);
        }
        field3226 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLwc;)V")
    public static final void method1118(byte arg0, class156 arg1) {
        int var2 = 0;
        field3227++;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg1.field3585 == 0) {
            var2 = class33.field857.method556(arg1.field3590, arg1.field3582, arg1.field3593);
        }
        if (arg1.field3585 == 1) {
            var2 = class33.field857.method542(arg1.field3590, arg1.field3582, arg1.field3593);
        }
        if (arg1.field3585 == 2) {
            var2 = class33.field857.method565(arg1.field3590, arg1.field3582, arg1.field3593);
        }
        if (arg1.field3585 == 3) {
            var2 = class33.field857.method572(arg1.field3590, arg1.field3582, arg1.field3593);
        }
        if (var2 != 0) {
            var3 = var2 >> 14 & 0x7FFF;
            int var6 = class33.field857.method554(arg1.field3590, arg1.field3582, arg1.field3593, var2);
            var5 = var6 >> 6 & 0x3;
            var4 = var6 & 0x1F;
        }
        arg1.field3594 = var3;
        if (arg0 <= 33) {
            field3224 = 23;
        }
        arg1.field3583 = var5;
        arg1.field3592 = var4;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lc;BLc;Lc;)V")
    public static final void method1119(class15 arg0, byte arg1, class15 arg2, class15 arg3) {
        field3233++;
        class78.field1644 = arg2;
        if (arg1 == 44) {
            class134.field3081 = arg0;
            class7.field110 = arg3;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V")
    public static final void method1120(byte arg0) {
        field3221++;
        if (!class106.field2292) {
            return;
        }
        class126 var1 = class63.method434(class50.field1168, class56.field1257, arg0 ^ 0x13E);
        if (var1 != null && var1.field2757 != null) {
            class141 var2 = new class141();
            var2.field3238 = var1;
            var2.field3247 = var1.field2757;
            class31.method237((byte) -71, var2);
        }
        class106.field2292 = false;
        if (arg0 != 60) {
            method1122(false);
        }
        class40.method300(false, var1);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static final void method1121(int arg0) {
        class155.field3534 = null;
        field3230++;
        class2.field22 = null;
        if (arg0 == -28194) {
            class149.field3385 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(Z)V")
    public static final void method1122(boolean arg0) {
        class33.field849.method83((byte) -70);
        class11.field167 = 1;
        field3223++;
        class100.field2154 = null;
        if (!arg0) {
            method1116(false);
        }
    }
}
