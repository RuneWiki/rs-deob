import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 extends class37 {

    @OriginalMember(owner = "client!ad", name = "T", descriptor = "I")
    public static int field84 = 0;

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "[J")
    public static long[] field82 = new long[100];

    @OriginalMember(owner = "client!ad", name = "V", descriptor = "Ldd;")
    private static class35 field86 = class180.method1196((byte) 127, "Mon");

    @OriginalMember(owner = "client!ad", name = "cb", descriptor = "Ldd;")
    private static class35 field93 = class180.method1196((byte) -110, "Sun");

    @OriginalMember(owner = "client!ad", name = "X", descriptor = "Ldd;")
    private static class35 field88 = class180.method1196((byte) 127, "Sat");

    @OriginalMember(owner = "client!ad", name = "U", descriptor = "Ldd;")
    private static class35 field85 = class180.method1196((byte) -94, "Members object");

    @OriginalMember(owner = "client!ad", name = "db", descriptor = "Ldd;")
    private static class35 field94 = class180.method1196((byte) 126, "Thu");

    @OriginalMember(owner = "client!ad", name = "fb", descriptor = "Ldd;")
    private static class35 field96 = class180.method1196((byte) 126, "Tue");

    @OriginalMember(owner = "client!ad", name = "hb", descriptor = "Ldd;")
    private static class35 field98 = class180.method1196((byte) 127, "Wed");

    @OriginalMember(owner = "client!ad", name = "W", descriptor = "Ldd;")
    public static class35 field87 = field85;

    @OriginalMember(owner = "client!ad", name = "eb", descriptor = "Ldd;")
    private static class35 field95 = class180.method1196((byte) -16, "Fri");

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "[Ldd;")
    public static class35[] field83 = new class35[] { field93, field86, field96, field98, field94, field95, field88 };

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!ad", name = "Y", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!ad", name = "Z", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!ad", name = "ab", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!ad", name = "bb", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!ad", name = "gb", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        if (arg0 != 75) {
            this.method14(-107, -54);
        }
        ++field89;
        int[] var3 = super.field816.method1189((byte) 33, arg1);
        if (super.field816.field3661) {
            int[] var4 = this.method369(0, arg1, (byte) 127);
            for (int var5 = 0; class72.field1719 > var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        ++field92;
        int[][] var3 = super.field832.method653(-30711, arg0);
        if (arg1 < 5) {
            field95 = null;
        }
        if (super.field832.field1978) {
            int[][] var4 = this.method370(arg0, 0, 3);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class72.field1719; ++var11) {
                var8[var11] = -var6[var11] + 4096;
                var9[var11] = 4096 - var5[var11];
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(B)V")
    public static final void method28(byte arg0) {
        ++field90;
        int var1 = class166.field3369 * 128 + 64;
        int var2 = class44.field956 * 128 + 64;
        int var3 = class73.method583(class175.field3585, var1, var2, (byte) 1) - class127.field2755;
        if (~var2 < ~class26.field571) {
            class26.field571 += (var2 - class26.field571) * class102.field2270 / 1000 + class110.field2426;
            if (~var2 > ~class26.field571) {
                class26.field571 = var2;
            }
        }
        if (~var3 < ~class51.field1150) {
            class51.field1150 += (-class51.field1150 + var3) * class102.field2270 / 1000 + class110.field2426;
            if (var3 < class51.field1150) {
                class51.field1150 = var3;
            }
        }
        if (~class8.field122 > ~var1) {
            class8.field122 += class110.field2426 - -((-class8.field122 + var1) * class102.field2270 / 1000);
            if (~var1 > ~class8.field122) {
                class8.field122 = var1;
            }
        }
        if (class26.field571 > var2) {
            class26.field571 -= class110.field2426 - -((-var2 + class26.field571) * class102.field2270 / 1000);
            if (var2 > class26.field571) {
                class26.field571 = var2;
            }
        }
        if (~class8.field122 < ~var1) {
            class8.field122 -= (-var1 + class8.field122) * class102.field2270 / 1000 + class110.field2426;
            if (~var1 < ~class8.field122) {
                class8.field122 = var1;
            }
        }
        if (~class51.field1150 < ~var3) {
            class51.field1150 -= (-var3 + class51.field1150) * class102.field2270 / 1000 + class110.field2426;
            if (~var3 < ~class51.field1150) {
                class51.field1150 = var3;
            }
        }
        int var4 = class101.field2223 * 128 - -64;
        int var5 = class173.field3470 * 128 - -64;
        int var6 = class73.method583(class175.field3585, var5, var4, (byte) 1) - class182.field3736;
        int var7 = -class8.field122 + var5;
        int var8 = -class26.field571 + var4;
        int var9 = -class51.field1150 + var6;
        int var10 = (int) Math.sqrt((double) (var8 * var8 - -(var7 * var7)));
        int var11 = (int) (325.949D * Math.atan2((double) var9, (double) var10)) & 2047;
        int var12 = 2047 & (int) (-325.949D * Math.atan2((double) var8, (double) var7));
        if (~var11 > -129) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (~var11 < ~class116.field2593) {
            class116.field2593 += (var11 - class116.field2593) * class22.field457 / 1000 + class96.field2118;
            if (class116.field2593 > var11) {
                class116.field2593 = var11;
            }
        }
        if (~class116.field2593 < ~var11) {
            class116.field2593 -= (-var11 + class116.field2593) * class22.field457 / 1000 + class96.field2118;
            if (~var11 < ~class116.field2593) {
                class116.field2593 = var11;
            }
        }
        int var13 = -class55.field1246 + var12;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (~var13 < -1) {
            class55.field1246 += class22.field457 * var13 / 1000 + class96.field2118;
            class55.field1246 &= 2047;
        }
        if (var13 < 0) {
            class55.field1246 -= -var13 * class22.field457 / 1000 + class96.field2118;
            class55.field1246 &= 2047;
        }
        int var14 = -10 % ((arg0 - 73) / 51);
        int var15 = var12 - class55.field1246;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (~var15 > 1023) {
            var15 += 2048;
        }
        if (~var15 > -1 && var13 > 0 || ~var15 < -1 && var13 < 0) {
            class55.field1246 = var12;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IILce;)V")
    public final void method1(int arg0, int arg1, class26 arg2) {
        if (arg0 == 0) {
            super.field825 = arg2.method221(-124) == 1;
        }
        ++field81;
        if (arg1 != 1) {
            field91 = 65;
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
    public class5() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)V")
    public static void method29(int arg0) {
        field85 = null;
        field98 = null;
        if (arg0 < 64) {
            method28((byte) 41);
        }
        field95 = null;
        field83 = null;
        field94 = null;
        field86 = null;
        field87 = null;
        field88 = null;
        field82 = null;
        field96 = null;
        field93 = null;
    }
}
