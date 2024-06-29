import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class115 extends class70 {

    @OriginalMember(owner = "client!qd", name = "Q", descriptor = "[B")
    public byte[] field2724;

    @OriginalMember(owner = "client!qd", name = "N", descriptor = "I")
    public static int field2721 = 0;

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "Lqf;")
    public static class117 field2714 = class72.method514(105, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!qd", name = "M", descriptor = "[Lre;")
    public static class123[] field2720 = new class123[50];

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "Lqf;")
    public static class117 field2715 = class72.method514(111, "backvmid3");

    @OriginalMember(owner = "client!qd", name = "L", descriptor = "I")
    public static int field2719 = -1;

    @OriginalMember(owner = "client!qd", name = "R", descriptor = "Lqf;")
    private static class117 field2725 = class72.method514(102, "go back to the main RuneScape webpage");

    @OriginalMember(owner = "client!qd", name = "P", descriptor = "Lqf;")
    public static class117 field2723 = null;

    @OriginalMember(owner = "client!qd", name = "T", descriptor = "Lqf;")
    public static class117 field2727 = class72.method514(122, "leuchten3:");

    @OriginalMember(owner = "client!qd", name = "V", descriptor = "Lqf;")
    public static class117 field2729 = class72.method514(121, "<col=00ff00>");

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "Z")
    public static boolean field2713 = true;

    @OriginalMember(owner = "client!qd", name = "Y", descriptor = "Lqf;")
    public static class117 field2732 = field2725;

    @OriginalMember(owner = "client!qd", name = "J", descriptor = "Lqf;")
    public static class117 field2717 = class72.method514(103, "nav");

    @OriginalMember(owner = "client!qd", name = "W", descriptor = "I")
    public static int field2730 = 0;

    @OriginalMember(owner = "client!qd", name = "bb", descriptor = "Lqf;")
    private static class117 field2735 = class72.method514(111, "Close");

    @OriginalMember(owner = "client!qd", name = "ab", descriptor = "Lqf;")
    public static class117 field2734 = field2735;

    @OriginalMember(owner = "client!qd", name = "Z", descriptor = "Lqf;")
    private static class117 field2733 = class72.method514(109, "Please use a different world)3");

    @OriginalMember(owner = "client!qd", name = "cb", descriptor = "Lqf;")
    public static class117 field2736 = field2733;

    @OriginalMember(owner = "client!qd", name = "eb", descriptor = "Lqf;")
    public static class117 field2738 = field2733;

    @OriginalMember(owner = "client!qd", name = "K", descriptor = "I")
    public static volatile int field2718 = 0;

    @OriginalMember(owner = "client!qd", name = "db", descriptor = "Lqf;")
    public static class117 field2737 = class72.method514(122, "mn");

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!qd", name = "O", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!qd", name = "S", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!qd", name = "X", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!qd", name = "U", descriptor = "Lr;")
    public static class118 field2728;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILjb;II)[Lr;")
    public static final class118[] method893(int arg0, class64 arg1, int arg2, int arg3) {
        field2726++;
        if (class68.method478(arg3 + 12127, arg0, arg2, arg1)) {
            if (arg3 != 0) {
                field2718 = 32;
            }
            return class5.method28(-20378);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III[B)I")
    public static final int method894(int arg0, int arg1, int arg2, byte[] arg3) {
        field2731++;
        int var4 = -1;
        for (int var5 = arg0; var5 < arg1; var5++) {
            var4 = class153.field3789[(arg3[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
        }
        int var6 = ~var4;
        return arg2 == -1063626008 ? var6 : -96;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)V")
    public static final void method895(int arg0, byte arg1) {
        client.field400 += arg0 * 128;
        short var2 = 256;
        field2716++;
        if (client.field400 > class71.field1503.length) {
            client.field400 -= class71.field1503.length;
            int var3 = (int) (Math.random() * 12.0D);
            class15.method132(class97.field2368[var3], -1);
        }
        if (arg1 != -115) {
            field2729 = null;
        }
        int var4 = 0;
        int var5 = arg0 * 128;
        int var6 = (var2 - arg0) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var27 = class135.field3219[var4 + var5] - class71.field1503[client.field400 + var4 & class71.field1503.length + -1] * arg0 / 6;
            if (var27 < 0) {
                var27 = 0;
            }
            class135.field3219[var4++] = var27;
        }
        for (int var8 = var2 - arg0; var8 < var2; var8++) {
            int var24 = var8 * 128;
            for (int var25 = 0; var25 < 128; var25++) {
                int var26 = (int) (Math.random() * 100.0D);
                if (var26 < 50 && var25 > 10 && var25 < 118) {
                    class135.field3219[var25 + var24] = 255;
                } else {
                    class135.field3219[var25 + var24] = 0;
                }
            }
        }
        if (class82.field1874 > 0) {
            class82.field1874 -= arg0 * 4;
        }
        if (class8.field112 > 0) {
            class8.field112 -= arg0 * 4;
        }
        if (class82.field1874 == 0 && class8.field112 == 0) {
            int var9 = (int) ((double) (2000 / arg0) * Math.random());
            if (var9 == 0) {
                class82.field1874 = 1024;
            }
            if (var9 == 1) {
                class8.field112 = 1024;
            }
        }
        for (int var10 = 0; var10 < var2 - arg0; var10++) {
            class110.field2611[var10] = class110.field2611[arg0 + var10];
        }
        for (int var11 = var2 - arg0; var11 < var2; var11++) {
            class110.field2611[var11] = (int) (Math.sin((double) class29.field588 / 14.0D) * 16.0D + Math.sin((double) class29.field588 / 15.0D) * 14.0D + Math.sin((double) class29.field588 / 16.0D) * 12.0D);
            class29.field588++;
        }
        class105.field2530 += arg0;
        int var12 = ((class43.field856 & 0x1) + arg0) / 2;
        if (var12 <= 0) {
            return;
        }
        for (int var13 = 0; var13 < class105.field2530 * 100; var13++) {
            int var22 = (int) (Math.random() * 124.0D) + 2;
            int var23 = (int) (Math.random() * 128.0D) + 128;
            class135.field3219[(var23 << 7) + var22] = 192;
        }
        class105.field2530 = 0;
        for (int var14 = 0; var14 < var2; var14++) {
            int var19 = var14 * 128;
            int var20 = 0;
            for (int var21 = -var12; var21 < 128; var21++) {
                if (var12 + var21 < 128) {
                    var20 += class135.field3219[var12 + var19 + var21];
                }
                if (var21 - var12 - 1 >= 0) {
                    var20 -= class135.field3219[var21 + var19 - var12 - 1];
                }
                if (var21 >= 0) {
                    class90.field2185[var19 + var21] = var20 / (var12 * 2 + 1);
                }
            }
        }
        for (int var15 = 0; var15 < 128; var15++) {
            int var16 = 0;
            for (int var17 = -var12; var17 < var2; var17++) {
                int var18 = var17 * 128;
                if (var2 > var17 + var12) {
                    var16 += class90.field2185[var12 * 128 + var15 + var18];
                }
                if (var17 - var12 - 1 >= 0) {
                    var16 -= class90.field2185[var15 + var18 - (var12 + 1) * 128];
                }
                if (var17 >= 0) {
                    class135.field3219[var15 + var18] = var16 / (var12 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "(I)V")
    public static void method896(int arg0) {
        field2714 = null;
        field2728 = null;
        field2720 = null;
        field2715 = null;
        field2734 = null;
        field2723 = null;
        field2727 = null;
        field2737 = null;
        field2738 = null;
        field2733 = null;
        field2735 = null;
        field2732 = null;
        field2729 = null;
        field2725 = null;
        field2717 = null;
        field2736 = null;
        if (arg0 != -19310) {
            method896(-103);
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "([B)V")
    public class115(byte[] arg0) {
        this.field2724 = arg0;
    }
}
