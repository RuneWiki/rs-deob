import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class97 extends class73 {

    @OriginalMember(owner = "client!ob", name = "G", descriptor = "Lrd;")
    public static class117 field2422 = class95.method812("(U5", (byte) 8);

    @OriginalMember(owner = "client!ob", name = "Q", descriptor = "Lrd;")
    private static class117 field2432 = class95.method812(" has logged out)3", (byte) 8);

    @OriginalMember(owner = "client!ob", name = "U", descriptor = "I")
    public static int field2436 = 0;

    @OriginalMember(owner = "client!ob", name = "L", descriptor = "Lrd;")
    public static class117 field2427 = class95.method812("@cya@", (byte) 8);

    @OriginalMember(owner = "client!ob", name = "ab", descriptor = "I")
    public static int field2442 = 0;

    @OriginalMember(owner = "client!ob", name = "N", descriptor = "Lrd;")
    public static class117 field2429 = field2432;

    @OriginalMember(owner = "client!ob", name = "cb", descriptor = "[[I")
    public static int[][] field2444 = new int[5][5000];

    @OriginalMember(owner = "client!ob", name = "T", descriptor = "Lrd;")
    private static class117 field2435 = class95.method812("Friends", (byte) 8);

    @OriginalMember(owner = "client!ob", name = "W", descriptor = "Lrd;")
    public static class117 field2438 = field2435;

    @OriginalMember(owner = "client!ob", name = "K", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!ob", name = "M", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!ob", name = "P", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!ob", name = "R", descriptor = "I")
    public int field2433;

    @OriginalMember(owner = "client!ob", name = "X", descriptor = "I")
    public int field2439;

    @OriginalMember(owner = "client!ob", name = "db", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!ob", name = "bb", descriptor = "Lga;")
    public static class44 field2443;

    @OriginalMember(owner = "client!ob", name = "O", descriptor = "Laf;")
    public static class7 field2430;

    @OriginalMember(owner = "client!ob", name = "V", descriptor = "Lm;")
    public static class83 field2437;

    @OriginalMember(owner = "client!ob", name = "H", descriptor = "[I")
    public int[] field2423;

    @OriginalMember(owner = "client!ob", name = "I", descriptor = "[I")
    public int[] field2424;

    @OriginalMember(owner = "client!ob", name = "Z", descriptor = "[I")
    public int[] field2441;

    @OriginalMember(owner = "client!ob", name = "J", descriptor = "[Leb;")
    public class31[] field2425;

    @OriginalMember(owner = "client!ob", name = "Y", descriptor = "[Leb;")
    public class31[] field2440;

    @OriginalMember(owner = "client!ob", name = "S", descriptor = "[[[B")
    public byte[][][] field2434;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BLwa;)I")
    public static final int method827(byte arg0, class144 arg1) {
        field2426++;
        int var2 = -1 % ((-arg0 - 1) / 63);
        class116 var3 = (class116) class127.field3025.method20(((long) arg1.field3441 << 32) + ((long) arg1.field3532), true);
        return var3 == null ? arg1.field3478 : var3.field2828;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)Z")
    public static final boolean method828(byte arg0, int arg1) {
        if (arg0 >= -6) {
            method829(false);
        }
        field2428++;
        return (arg1 >> 20 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(Z)V")
    public static void method829(boolean arg0) {
        field2427 = null;
        field2432 = null;
        field2429 = null;
        field2430 = null;
        field2438 = null;
        field2443 = null;
        field2422 = null;
        field2437 = null;
        if (!arg0) {
            method830(44);
        }
        field2435 = null;
        field2444 = null;
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)V")
    public static final void method830(int arg0) {
        field2431++;
        if (class94.field2364 == 0) {
            return;
        }
        int var1 = -89 % ((arg0 + 28) / 34);
        int var2 = 0;
        if (class35.field1025 != 0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < 100; var3++) {
            if (class128.field3107[var3] != null) {
                int var4 = class119.field2919[var3];
                class117 var5 = class43.field1236[var3];
                if (var5 != null && var5.method946((byte) 83, class61.field1698)) {
                    var5 = var5.method949(5, 0);
                }
                if (var5 != null && var5.method946((byte) 83, class39.field1134)) {
                    var5 = var5.method949(5, 0);
                }
                if ((var4 == 3 || var4 == 7) && (var4 == 7 || class42.field1202 == 0 || class42.field1202 == 1 && class59.method609((byte) -104, var5))) {
                    int var6 = 329 - var2 * 13;
                    var2++;
                    if (class121.field2961 > 4 && class66.field1878 - 4 > var6 + -10 && var6 + 3 >= class66.field1878 + -4) {
                        int var7 = class54.field1533.method209(class18.method193(new class117[] { class37.field1086, class58.field1606, var5, class128.field3107[var3] }, 82)) + 25;
                        if (var7 > 450) {
                            var7 = 450;
                        }
                        if (var7 + 4 > class121.field2961) {
                            class62.field1769++;
                            class41.field1173++;
                            if (class24.field676 >= 1) {
                                class38.field1092++;
                                client.method238(0, class18.method193(new class117[] { class121.field2968, var5 }, 45), 0, 108, 0, 2039, class45.field1267);
                            }
                            client.method238(0, class18.method193(new class117[] { class121.field2968, var5 }, 82), 0, -110, 0, 2019, class90.field2314);
                            client.method238(0, class18.method193(new class117[] { class121.field2968, var5 }, 42), 0, 33, 0, 2032, class21.field592);
                        }
                    }
                    if (var2 >= 5) {
                        return;
                    }
                }
                if ((var4 == 5 || var4 == 6) && class42.field1202 < 2) {
                    var2++;
                    if (var2 >= 5) {
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "(I)V")
    public static final void method831(int arg0) {
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
        field2445++;
        if (arg0 == 1) {
            System.exit(1);
        }
    }
}
