import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class144 {

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "Lrf;")
    public static class163 field2956 = class53.method392(64, "sch-Utteln:");

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "[Lmh;")
    public static class121[] field2957 = new class121[100];

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field2961 = 255;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "Lrf;")
    private static class163 field2963 = class53.method392(-80, "Please try using a different world)3");

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "Lrf;")
    public static class163 field2960 = field2963;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "Lrf;")
    public static class163 field2968 = field2963;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "Lrf;")
    public static class163 field2969 = class53.method392(116, "oberen Rand der Webseite ausw-=hlen)3");

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "Lrf;")
    public static class163 field2965 = field2963;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "Lrf;")
    public static class163 field2964 = field2963;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "Lrf;")
    public static class163 field2962 = field2963;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "Lrf;")
    public static class163 field2967 = field2963;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "[I")
    public static int[] field2959;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIII)V")
    public static final void method935(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2958++;
        if (class124.field2591 == 1) {
            class114.field2423[class107.field2218 / 100].method1106(class115.field2442 - 8, class136.field2805 + -8);
        }
        if (class124.field2591 == 2) {
            class114.field2423[class107.field2218 / 100 + 4].method1106(class115.field2442 - 8, class136.field2805 + -8);
        }
        class141.method922((byte) -67);
        if (arg0 != 2) {
            method935(-79, -34, 7, -31, 127);
        }
        if (!class96.field2047) {
            return;
        }
        int var5 = arg3 + 512 - 5;
        int var6 = arg4 + 20;
        class121.field2556.method573(class180.method1216(new class163[] { class29.field541, class34.method217(class118.field2505, -114) }, false), var5, var6, 16776960, -1);
        int var10 = var6 + 15;
        Runtime var7 = Runtime.getRuntime();
        int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
        int var9 = 16776960;
        if (var8 > 32768 && class86.field1880) {
            var9 = 16711680;
        }
        if (var8 > 65536 && !class86.field1880) {
            var9 = 16711680;
        }
        class121.field2556.method573(class180.method1216(new class163[] { class209.field4067, class34.method217(var8, -83), class121.field2554 }, false), var5, var10, var9, -1);
        var6 = var10 + 15;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIILs;IJZ)Z")
    public static final boolean method936(int arg0, int arg1, int arg2, int arg3, int arg4, class166 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class100.method683(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
    public static void method937(byte arg0) {
        field2959 = null;
        if (arg0 <= 11) {
            return;
        }
        field2964 = null;
        field2965 = null;
        field2968 = null;
        field2957 = null;
        field2967 = null;
        field2969 = null;
        field2963 = null;
        field2956 = null;
        field2962 = null;
        field2960 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public static final void method938(int arg0) {
        if (class119.field2518[96]) {
            class117.field2471 += (-class117.field2471 - 24) / 2;
        } else if (class119.field2518[97]) {
            class117.field2471 += (24 - class117.field2471) / 2;
        } else {
            class117.field2471 /= 2;
        }
        if (class119.field2518[98]) {
            class133.field2770 += (12 - class133.field2770) / 2;
        } else if (class119.field2518[99]) {
            class133.field2770 += (-class133.field2770 - 12) / 2;
        } else {
            class133.field2770 /= 2;
        }
        field2966++;
        class77.field1593 = class117.field2471 / 2 + class77.field1593 & 0x7FF;
        class41.field839 += class133.field2770 / 2;
        int var1 = class56.field1136.field679 + class17.field293;
        if (class41.field839 < 128) {
            class41.field839 = 128;
        }
        int var2 = class56.field1136.field716 + class79.field1611;
        int var3 = 0;
        if (class187.field3729 - var2 < -500 || class187.field3729 - var2 > 500 || class142.field2929 - var1 < -500 || class142.field2929 - var1 > 500) {
            class142.field2929 = var1;
            class187.field3729 = var2;
        }
        if (arg0 != 100) {
            method937((byte) 115);
        }
        if (class187.field3729 != var2) {
            class187.field3729 += (var2 - class187.field3729) / 16;
        }
        int var4 = class187.field3729 >> 7;
        if (class41.field839 > 383) {
            class41.field839 = 383;
        }
        if (class142.field2929 != var1) {
            class142.field2929 += (var1 - class142.field2929) / 16;
        }
        int var5 = class142.field2929 >> 7;
        int var6 = class175.method1186(class187.field3729, class60.field1227, class142.field2929, 1);
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var7 = var4 - 4; var7 <= var4 + 4; var7++) {
                for (int var8 = var5 - 4; var8 <= var5 + 4; var8++) {
                    int var9 = class60.field1227;
                    if (var9 < 3 && (class21.field372[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var6 - class154.field3199[var9][var7][var8];
                    if (var10 > var3) {
                        var3 = var10;
                    }
                }
            }
        }
        int var11 = var3 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (class176.field3542 < var11) {
            class176.field3542 += (var11 - class176.field3542) / 24;
        } else if (var11 < class176.field3542) {
            class176.field3542 += (var11 - class176.field3542) / 80;
        }
    }
}
