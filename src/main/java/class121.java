import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class121 {

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field2706 = 0;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field2711 = 0;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "Loa;")
    private static class98 field2709 = class38.method349(255, "Continue");

    @OriginalMember(owner = "client!re", name = "a", descriptor = "Loa;")
    private static class98 field2704 = class38.method349(255, "and choose the (Wcreate account(W");

    @OriginalMember(owner = "client!re", name = "d", descriptor = "Loa;")
    public static class98 field2707 = field2704;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "Loa;")
    public static class98 field2708 = field2709;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "J")
    public static long field2716;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "Lkd;")
    public static class73 field2714;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
    public static void method959(byte arg0) {
        field2707 = null;
        int var1 = -71 % ((arg0 + 70) / 39);
        field2704 = null;
        field2708 = null;
        field2709 = null;
        field2714 = null;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(B)V")
    public static final void method960(byte arg0) {
        int var1 = -77 % ((-arg0 - 36) / 49);
        field2715++;
        class21.method190((byte) -39);
        class114.field2580 = true;
        class111.method910(81);
        if (class132.field3111 != -1) {
            boolean var3 = class35.method334(1, 190, 0, 10616, class132.field3111, 261, 0);
            if (!var3) {
                class137.field3332 = true;
            }
        } else if (class52.field1163[class31.field709] != -1) {
            boolean var2 = class35.method334(1, 190, 0, 10616, class52.field1163[class31.field709], 261, 0);
            if (!var2) {
                class137.field3332 = true;
            }
        }
        if (class145.field3529 && class49.field1099 == 1) {
            if (class139.field3391 == 1) {
                class42.method363(-29616);
            } else {
                class67.method550(-114);
            }
        }
        class6.method29(false);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZLkd;ILve;)V")
    public static final void method961(boolean arg0, class73 arg1, int arg2, class145 arg3) {
        class117 var4 = new class117();
        if (!arg0) {
            method962(null, 92);
        }
        var4.field2609 = 1;
        var4.field2621 = arg3;
        var4.field2616 = arg1;
        field2713++;
        var4.field2729 = arg2;
        class63 var5 = class53.field1184;
        synchronized (class53.field1184) {
            class53.field1184.method508(86, var4);
        }
        class125.method989(false);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lld;I)V")
    public static final void method962(class80 arg0, int arg1) {
        int var2 = -87 / ((-arg1 - 31) / 44);
        field2717++;
        if (class42.field976 != 1) {
            return;
        }
        short var3 = 280;
        if (var3 <= class150.field3717 && var3 + 14 >= class150.field3717 && class86.field1980 >= 4 && class86.field1980 <= 18) {
            class135.method1100(21794, 0, 0);
            return;
        }
        if (var3 + 15 <= class150.field3717 && var3 + 80 >= class150.field3717 && class86.field1980 >= 4 && class86.field1980 <= 18) {
            class135.method1100(21794, 1, 0);
            return;
        }
        short var4 = 390;
        if (class150.field3717 >= var4 && class150.field3717 <= var4 + 14 && class86.field1980 >= 4 && class86.field1980 <= 18) {
            class135.method1100(21794, 0, 1);
            return;
        }
        if (var4 + 15 <= class150.field3717 && class150.field3717 <= var4 + 80 && class86.field1980 >= 4 && class86.field1980 <= 18) {
            class135.method1100(21794, 1, 1);
            return;
        }
        short var5 = 500;
        if (class150.field3717 >= var5 && class150.field3717 <= var5 + 14 && class86.field1980 >= 4 && class86.field1980 <= 18) {
            class135.method1100(21794, 0, 2);
            return;
        }
        if (var5 + 15 <= class150.field3717 && var5 + 80 >= class150.field3717 && class86.field1980 >= 4 && class86.field1980 <= 18) {
            class135.method1100(21794, 1, 2);
            return;
        }
        short var6 = 610;
        if (class150.field3717 >= var6 && class150.field3717 <= var6 + 14 && class86.field1980 >= 4 && class86.field1980 <= 18) {
            class135.method1100(21794, 0, 3);
            return;
        }
        if (var6 + 15 <= class150.field3717 && class150.field3717 <= var6 + 80 && class86.field1980 >= 4 && class86.field1980 <= 18) {
            class135.method1100(21794, 1, 3);
            return;
        }
        if (class150.field3717 >= 708 && class86.field1980 >= 4 && class150.field3717 <= 758 && class86.field1980 <= 20) {
            class33.field815 = false;
            class118.field2637.method486(0, 0);
            client.field508.method486(382, 0);
            class35.field859.method830(382 - class35.field859.field2325 / 2, 18);
            return;
        }
        if (class24.field594 == -1) {
            return;
        }
        class140 var7 = class19.field427[class24.field594];
        if (class4.field57 == var7.field3414) {
            byte[] var8 = class102.method840(new class98[] { var7.field3411, class51.field1131 }, 10).method802(-11);
            class129.field2979 = new String(var8, 0, var8.length);
            class5.field74 = var7.field3417;
            class33.field815 = false;
            if (class115.field2592 != 0) {
                class115.field2592 = 0;
                class11.field229 = 43594;
                class105.field2416 = 43594;
                class10.field202 = 443;
            }
            class118.field2637.method486(0, 0);
            client.field508.method486(382, 0);
            class35.field859.method830(382 - class35.field859.field2325 / 2, 18);
            return;
        }
        class98 var9 = class102.method840(new class98[] { class115.field2588, var7.field3411, class51.field1131, class145.field3521, class15.field313, class132.method1074(class94.field2151 ? 1 : 0, (byte) -92), class71.field1477, class132.method1074(class147.field3598, (byte) 56), class54.field1202, class132.method1074(class97.field2225, (byte) 70) }, 10);
        try {
            arg0.getAppletContext().showDocument(var9.method808((byte) 84), "_self");
            return;
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BI)Z")
    public static final boolean method963(byte arg0, int arg1) {
        int var2 = -56 / ((9 - arg0) / 36);
        field2712++;
        return (arg1 >> 31 & 0x1) != 0;
    }
}
