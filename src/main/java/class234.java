import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class234 extends class57 {

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "Lvd;")
    public static class222 field4367 = class212.method1357("Bitte versuchen Sie es in ", 10731);

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "Lvd;")
    public static class222 field4361 = class212.method1357("null", 10731);

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "[I")
    public static int[] field4370 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "Lvd;")
    public static class222 field4368 = class212.method1357(":tradereq:", 10731);

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "Lvd;")
    public static class222 field4372 = class212.method1357("Standort", 10731);

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "Lvd;")
    private static class222 field4373 = class212.method1357("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", 10731);

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "[B")
    public static byte[] field4366 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "Lvd;")
    public static class222 field4375 = field4373;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "Lig;")
    public static class93 field4369 = new class93(64);

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "Lvd;")
    public static class222 field4376 = class212.method1357("AUS", 10731);

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lka;I)V")
    public static final void method1527(class109 arg0, int arg1) {
        if (arg1 >= -112) {
            return;
        }
        if (class70.field1312 != null) {
            try {
                class70.field1312.method1501((byte) -77, 0L);
                class70.field1312.method1496(24, arg0.field2053, -1, arg0.field2006);
            } catch (Exception var2) {
            }
        }
        arg0.field2053 += 24;
        field4374++;
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)V")
    public static void method1528(int arg0) {
        field4369 = null;
        field4366 = null;
        field4375 = null;
        field4367 = null;
        field4370 = null;
        field4372 = null;
        field4373 = null;
        field4376 = null;
        field4361 = null;
        if (arg0 != 80) {
            field4369 = null;
        }
        field4368 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
    public static final void method1529(byte arg0) {
        field4363++;
        class162.field3088 = 0;
        if (arg0 != 117) {
            return;
        }
        class179.field3327 = 0;
        class102.method633(arg0 - 121);
        class7.method59(-1);
        class3.method22(-120);
        class111.method723((byte) -103);
        for (int var1 = 0; var1 < class179.field3327; var1++) {
            int var3 = class42.field900[var1];
            if (class175.field3280 != class54.field1024[var3].field1348) {
                class54.field1024[var3] = null;
            }
        }
        if (class70.field1306 != class21.field505.field2053) {
            throw new RuntimeException("gpp1 pos:" + class21.field505.field2053 + " psize:" + class70.field1306);
        }
        for (int var2 = 0; var2 < class38.field859; var2++) {
            if (class54.field1024[class122.field2328[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class38.field859);
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)V")
    public static final void method1530(byte arg0) {
        if (arg0 > 81) {
            field4371++;
            class55.field1028.method596(false);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "([Lvd;I)Lvd;")
    public static final class222 method1531(class222[] arg0, int arg1) {
        field4364++;
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        if (arg1 != -10949) {
            method1530((byte) -74);
        }
        return class204.method1308(arg0.length, (byte) -94, arg0, 0);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BLde;II)V")
    public static final void method1532(byte arg0, class38 arg1, int arg2, int arg3) {
        if (arg0 != 111) {
            return;
        }
        field4362++;
        if (arg1.field1323 == arg3 && arg3 != -1) {
            class183 var4 = class93.method599((byte) -29, arg3);
            int var5 = var4.field3407;
            if (var5 == 1) {
                arg1.field1375 = 0;
                arg1.field1359 = 0;
                arg1.field1338 = arg2;
                arg1.field1318 = 0;
                class120.method770(var4, 115, arg1.field1318, class17.field432 == arg1, arg1.field1353, arg1.field1360);
            }
            if (var5 == 2) {
                arg1.field1375 = 0;
                return;
            }
        } else if (arg3 == -1 || arg1.field1323 == -1 || class93.method599((byte) -38, arg3).field3380 >= class93.method599((byte) -18, arg1.field1323).field3380) {
            arg1.field1323 = arg3;
            arg1.field1363 = arg1.field1326;
            arg1.field1338 = arg2;
            arg1.field1318 = 0;
            arg1.field1375 = 0;
            arg1.field1359 = 0;
            if (arg1.field1323 != -1) {
                class120.method770(class93.method599((byte) -67, arg1.field1323), 124, arg1.field1318, class17.field432 == arg1, arg1.field1353, arg1.field1360);
                return;
            }
        } else {
            return;
        }
    }
}
