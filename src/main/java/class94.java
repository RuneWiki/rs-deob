import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class94 {

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "Lhb;")
    public static class44 field2377 = class102.method810("Verbindung konnte nicht hergestellt werden)3", -28606);

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field2384 = 0;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "Lhb;")
    private static class44 field2388 = class102.method810("Continue", -28606);

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "Lhb;")
    public static class44 field2386 = field2388;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "Lfc;")
    public static class34 field2382 = new class34(50);

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "Lfc;")
    public static class34 field2390 = new class34(100);

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "Lhb;")
    public static class44 field2393 = class102.method810("chatback", -28606);

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "Z")
    public static boolean field2392 = true;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "Lhb;")
    private static class44 field2394 = class102.method810("Please remove ", -28606);

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "Lhb;")
    public static class44 field2401 = field2394;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "[B")
    public static byte[] field2395 = new byte[520];

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "Lhb;")
    public static class44 field2403 = class102.method810("Texturen geladen)3", -28606);

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "Lhb;")
    public static class44 field2396 = field2394;

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "I")
    public static int field2404 = 0;

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "I")
    public static int field2405 = 99;

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "Lhb;")
    private static class44 field2402 = class102.method810("Try again in 60 secs)3)3)3", -28606);

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "Lhb;")
    public static class44 field2400 = field2402;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public int field2376;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public int field2379;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public int field2380;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public int field2381;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    public int field2383;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "Lqd;")
    public static class100 field2398;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "Lne;")
    public static class83 field2399;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "Lqa;")
    public class97 field2387;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)Z", line = 13)
    public static final boolean method748(int arg0, int arg1) {
        field2385++;
        if (class69.field1719[arg1]) {
            return true;
        } else if (class109.field2740.method888(arg1, (byte) -114)) {
            int var2 = class109.field2740.method886(0, arg1);
            if (var2 == 0) {
                class69.field1719[arg1] = true;
                return true;
            }
            if (class113.field2777[arg1] == null) {
                class113.field2777[arg1] = new class72[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class113.field2777[arg1][var3] == null) {
                    byte[] var4 = class109.field2740.method892(arg1, var3, false);
                    if (var4 != null) {
                        class113.field2777[arg1][var3] = new class72();
                        class113.field2777[arg1][var3].method609((byte) -121, new class131(var4));
                    }
                }
            }
            if (arg0 != 9902) {
                method750(72, -1);
            }
            class69.field1719[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V", line = 66)
    public static final void method749(byte arg0) {
        if (arg0 != -86) {
            method750(30, 118);
        }
        field2375++;
        if (class16.field325 != null) {
            class16.field325.method101();
            class16.field325 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)V", line = 89)
    public static final void method750(int arg0, int arg1) {
        if (arg1 != 0) {
            method752((byte) 105);
        }
        class77.field1947 = arg0;
        field2389++;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIB)V", line = 111)
    public static final void method751(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        int var5 = arg3;
        if (arg4 != -84) {
            return;
        }
        while (arg0 + arg3 >= var5) {
            for (int var6 = arg2; var6 <= arg1 + arg2; var6++) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class96.field2435[0][var6][var5] = 127;
                    if (arg2 == var6 && var6 > 0) {
                        class64.field1620[0][var6][var5] = class64.field1620[0][var6 - 1][var5];
                    }
                    if (arg2 + arg1 == var6 && var6 < 103) {
                        class64.field1620[0][var6][var5] = class64.field1620[0][var6 + 1][var5];
                    }
                    if (arg3 == var5 && var5 > 0) {
                        class64.field1620[0][var6][var5] = class64.field1620[0][var6][var5 - 1];
                    }
                    if (arg3 + arg0 == var5 && var5 < 103) {
                        class64.field1620[0][var6][var5] = class64.field1620[0][var6][var5 + 1];
                    }
                }
            }
            var5++;
        }
        field2374++;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)V", line = 160)
    public static void method752(byte arg0) {
        field2393 = null;
        field2402 = null;
        field2401 = null;
        field2386 = null;
        field2382 = null;
        field2388 = null;
        field2394 = null;
        field2400 = null;
        field2390 = null;
        if (arg0 != -56) {
            return;
        }
        field2399 = null;
        field2396 = null;
        field2395 = null;
        field2398 = null;
        field2377 = null;
        field2403 = null;
    }
}
