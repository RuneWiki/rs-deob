import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class88 {

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field1946 = 0;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "Z")
    public static boolean field1957 = false;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "[Lp;")
    public static class90[] field1956 = new class90[16384];

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public static int field1958 = 0;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "I")
    public static int field1960 = 0;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "Lec;")
    public static class28 field1961 = class28.method210(-46, "@cr1@");

    @OriginalMember(owner = "client!od", name = "b", descriptor = "Z")
    public static boolean field1947 = true;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "Lec;")
    public static class28 field1952 = class28.method210(-46, "@yel@0 unread messages");

    @OriginalMember(owner = "client!od", name = "r", descriptor = "Lpa;")
    public static class91 field1963 = new class91(64);

    @OriginalMember(owner = "client!od", name = "t", descriptor = "I")
    public static int field1965 = 0;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "Lec;")
    public static class28 field1967 = class28.method210(-46, "(U");

    @OriginalMember(owner = "client!od", name = "x", descriptor = "Lec;")
    public static class28 field1969 = class28.method210(-46, "Unexpected server response: ");

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "Lpa;")
    public static class91 field1970;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "([II)V")
    public static final synchronized void method648(int[] arg0, int arg1) {
        int var2 = 0;
        int var3 = arg1 - 7;
        while (var2 < var3) {
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
        }
        var3 += 7;
        while (var2 < var3) {
            arg0[var2++] = 0;
        }
        if (class37.field834 != null) {
            class37.field834.method241(arg0, 0, var3);
        }
        class78.method595((byte) 27, var3);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BLn;)Z")
    public static final boolean method649(byte arg0, class78 arg1) {
        field1951++;
        int var2 = arg1.field1796;
        if (class25.field560 == 2) {
            if (var2 == 201) {
                class125.field2708 = class125.field2721;
                class76.field1714 = 1;
                class95.field2092 = true;
                class23.field515 = 0;
                class114.field2439 = true;
                class125.field2718 = class96.field2139;
            }
            if (var2 == 202) {
                class23.field515 = 0;
                class76.field1714 = 2;
                class125.field2718 = class53.field1208;
                class114.field2439 = true;
                class125.field2708 = class125.field2721;
                class95.field2092 = true;
            }
        }
        if (var2 == 205) {
            client.field381 = 250;
            return true;
        }
        if (var2 == 501) {
            class125.field2708 = class125.field2721;
            class125.field2718 = class118.field2519;
            class114.field2439 = true;
            class76.field1714 = 4;
            class23.field515 = 0;
            class95.field2092 = true;
        }
        if (var2 == 502) {
            class76.field1714 = 5;
            class95.field2092 = true;
            class23.field515 = 0;
            class125.field2718 = class79.field1834;
            class114.field2439 = true;
            class125.field2708 = class125.field2721;
        }
        if (arg0 != -61) {
            return false;
        }
        if (var2 >= 300 && var2 <= 313) {
            int var3 = (var2 - 300) / 2;
            int var4 = var2 & 0x1;
            class49.field1144.method811(var3, var4 == 1, arg0 + 61);
        }
        if (var2 >= 314 && var2 <= 323) {
            int var5 = (var2 - 314) / 2;
            int var6 = var2 & 0x1;
            class49.field1144.method818(var6 == 1, var5, true);
        }
        if (var2 == 324) {
            class49.field1144.method813(-1, false);
        }
        if (var2 == 325) {
            class49.field1144.method813(arg0 + 60, true);
        }
        if (var2 == 326) {
            class5.field85.method161((byte) 92, 12);
            class49.field1144.method816(28222, class5.field85);
            class123.field2672++;
            return true;
        }
        if (var2 == 620) {
            field1957 = !field1957;
        }
        if (var2 >= 601 && var2 <= 613) {
            class117.method836(arg0 ^ 0xFFFFFF87);
            if (class125.field2719.method214(121) > 0) {
                class5.field85.method161((byte) 85, 72);
                class46.field1040++;
                class5.field85.method854(false, class125.field2719.method237(240));
                class5.field85.method888(var2 - 601, -123);
                class5.field85.method888(field1957 ? 1 : 0, -88);
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
    public static void method650(byte arg0) {
        field1956 = null;
        if (arg0 != -54) {
            field1963 = null;
        }
        field1963 = null;
        field1961 = null;
        field1952 = null;
        field1969 = null;
        field1970 = null;
        field1967 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BI)V")
    public static final synchronized void method651(byte arg0, int arg1) {
        field1950++;
        if (arg0 >= -8) {
            field1947 = false;
        }
        if (class37.field834 != null) {
            class37.field834.method242(arg1);
        }
        class78.method595((byte) 27, arg1);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILnd;B)V")
    public static final void method652(int arg0, class82 arg1, byte arg2) {
        class72.method571(arg1, 122);
        if (arg2 != 42) {
            field1958 = 69;
        }
        if (arg0 > 0) {
            field1970 = new class91(arg0);
        }
        field1955++;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(I)V")
    public class88(int arg0) {
        class114.field2442 = arg0;
        class4.field65 = System.currentTimeMillis();
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(JB)V")
    public static final void method653(long arg0, byte arg1) {
        field1954++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class36.field829; var3++) {
            if (class1.field5[var3] == arg0) {
                class36.field829--;
                class30.field646 = true;
                for (int var4 = var3; var4 < class36.field829; var4++) {
                    class93.field2048[var4] = class93.field2048[var4 + 1];
                    class61.field1348[var4] = class61.field1348[var4 + 1];
                    class1.field5[var4] = class1.field5[var4 + 1];
                }
                class5.field85.method161((byte) 95, 30);
                class93.field2043++;
                class5.field85.method854(false, arg0);
                break;
            }
        }
        if (arg1 != -66) {
            field1965 = 91;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "()V")
    public void method557() {
        field1964++;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(B)V")
    public static final void method654(byte arg0) {
        if (arg0 > -31) {
            field1963 = null;
        }
        class90.field1981.method92((byte) -4);
        field1953++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V")
    public static final void method655(boolean arg0) {
        field1949++;
        if (!class65.field1468) {
            return;
        }
        class1.field10 = null;
        class32.field684 = null;
        class14.field253 = null;
        class11.field180 = null;
        class31.field671 = null;
        class69.field1543 = null;
        class96.field2142 = null;
        class90.field1981 = null;
        class62.field1379 = null;
        class125.field2707 = null;
        class34.field775 = null;
        class3.field31 = null;
        class7.field117 = null;
        class53.field1213 = null;
        class61.field1357 = null;
        class34.field769 = null;
        class45.field1000 = null;
        class57.field1312 = null;
        class47.field1069 = null;
        class63.field1411 = null;
        class15.field292 = null;
        class75.field1687 = null;
        class80.field1843 = null;
        class103.field2197 = null;
        class28.field636 = null;
        class22.field513 = null;
        class25.field541 = null;
        class65.field1468 = false;
        class27.field572 = null;
        if (!arg0) {
            method652(82, null, (byte) -6);
        }
        class5.field94 = null;
        class90.field1979 = null;
        class90.field1976 = null;
        class42.field910 = null;
        class95.field2108 = null;
        class32.field692 = null;
        class57.field1301 = null;
        class40.field866 = null;
        class31.field664 = null;
        class57.field1302 = null;
        class125.field2715 = null;
        class8.field141 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(J)V")
    public void method555(long arg0) {
        field1948++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BLed;)V")
    public static final synchronized void method656(byte arg0, class29 arg1) {
        int var2 = -64 / ((arg0 - 17) / 44);
        class37.field834 = arg1;
        field1968++;
    }
}
