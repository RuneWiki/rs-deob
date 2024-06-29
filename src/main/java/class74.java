import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class74 {

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "Lcd;")
    public static class64 field1401 = class44.method335((byte) 71, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "Lcd;")
    public static class64 field1404 = class44.method335((byte) 71, "");

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field1403 = 128;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "Lcd;")
    public static class64 field1402 = class44.method335((byte) 71, "leuchten3:");

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "Lcd;")
    public static class64 field1411 = class44.method335((byte) 71, "M");

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "[I")
    public static int[] field1408;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILja;)Lja;", line = 14)
    public static final class60 method593(int arg0, class60 arg1) {
        field1409++;
        if (arg1.field1113 != -1) {
            return class125.method907(arg1.field1113, arg0 - 103);
        }
        if (arg0 != 4) {
            field1404 = (class64) null;
        }
        int var2 = arg1.field1080 >>> 16;
        class234 var3 = new class234(class159.field2805);
        for (class172 var4 = (class172) var3.method1676(-10409); var4 != null; var4 = (class172) var3.method1680(false)) {
            if (var4.field2967 == var2) {
                return class125.method907((int) var4.field417, -80);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V", line = 44)
    public static void method594(byte arg0) {
        field1411 = null;
        field1408 = null;
        field1404 = null;
        if (arg0 > -5) {
            field1401 = (class64) null;
        }
        field1402 = null;
        field1401 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "()V", line = 98)
    public static final void method595() {
        if (class298.field5146 != null) {
            for (int var0 = 0; var0 < class298.field5146.length; var0++) {
                for (int var1 = 0; var1 < class146.field2588; var1++) {
                    for (int var2 = 0; var2 < class314.field5327; var2++) {
                        class298.field5146[var0][var1][var2] = null;
                    }
                }
            }
        }
        class42.field684 = (class204[][]) null;
        if (class61.field1192 != null) {
            for (int var3 = 0; var3 < class61.field1192.length; var3++) {
                for (int var4 = 0; var4 < class146.field2588; var4++) {
                    for (int var5 = 0; var5 < class314.field5327; var5++) {
                        class61.field1192[var3][var4][var5] = null;
                    }
                }
            }
        }
        class35.field568 = (class204[][]) null;
        class201.field3447 = 0;
        if (class81.field1496 != null) {
            for (int var6 = 0; var6 < class201.field3447; var6++) {
                class81.field1496[var6] = null;
            }
        }
        if (class181.field3107 != null) {
            for (int var7 = 0; var7 < class132.field2354; var7++) {
                class181.field3107[var7] = null;
            }
            class132.field2354 = 0;
        }
        if (class122.field2201 != null) {
            for (int var8 = 0; var8 < class122.field2201.length; var8++) {
                class122.field2201[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V", line = 214)
    public static final void method596(byte arg0) {
        field1405++;
        if (class216.field3626 != null) {
            class216.field3626.method225(1);
            class216.field3626 = null;
        }
        class70.method574(false);
        method595();
        for (int var1 = 0; var1 < 4; var1++) {
            class91.field1637[var1].method413((byte) -111);
        }
        class143.method1018(-126);
        System.gc();
        class54.method418(2, 1382);
        class78.field1469 = -1;
        class43.field696 = false;
        class307.method2141(true, 0);
        class190.field3269 = 0;
        class121.field2184 = 0;
        class70.field1350 = false;
        for (int var2 = 0; var2 < class304.field5197.length; var2++) {
            class304.field5197[var2] = null;
        }
        if (arg0 <= 3) {
            return;
        }
        class218.field3707 = 0;
        class163.field2862 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class284.field4888[var3] = null;
            class181.field3106[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class2.field12[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class274.field4712[var5][var6][var7] = null;
                }
            }
        }
        class269.method1884(true);
        class265.field4562 = 0;
        method598(true, 315);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)I", line = 303)
    public static int method597(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZI)V", line = 311)
    public static final void method598(boolean arg0, int arg1) {
        if (arg0) {
            if (class83.field1524 != -1) {
                class134.method953(2, class83.field1524);
            }
            for (class172 var2 = (class172) class159.field2805.method1143(0); var2 != null; var2 = (class172) class159.field2805.method1147((byte) 18)) {
                class140.method994(var2, true, -24721);
            }
            class83.field1524 = -1;
            class159.field2805 = new class159(8);
            class114.method812(0);
            class83.field1524 = class13.field307;
            class267.method1866(false, 66);
            class242.method1770((byte) 110);
            class58.method450(class83.field1524, (byte) -104);
        }
        class139.field2472 = new class41();
        field1410++;
        class139.field2472.field1865 = 3000;
        class139.field2472.field1859 = 3000;
        if (class123.field2216) {
            if (class238.field4054 == 2) {
                class119.field2156 = class137.field2440 << 7;
                class99.field1791 = class258.field4456 << 7;
            } else {
                class54.method405(44);
            }
            class81.method633(arg1 ^ 0x108);
            class288.method1990((byte) 76);
            class153.method1107(28, (byte) -73);
        } else {
            class259.method1833(arg1 ^ 0x232120, class3.field17);
            class153.method1107(10, (byte) -112);
        }
        if (arg1 != 315) {
            method594((byte) -1);
        }
    }
}
