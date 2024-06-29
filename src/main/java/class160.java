import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class160 {

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "J")
    public long field2225 = 0L;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "[I")
    public static int[] field2235 = new int[2048];

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "Llm;")
    public static class150 field2237 = new class150(50);

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "F")
    public static float field2239 = 128.0F;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "J")
    public static long field2240 = 0L;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public int field2221;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public int field2222;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public int field2223;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public int field2224;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public int field2226;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public int field2227;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public int field2228;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    public int field2229;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public int field2231;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public int field2233;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public int field2234;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "Lsk;")
    public class202 field2230;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "Lnh;")
    public static class305 field2238;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLld;)V")
    public static final void method994(byte arg0, class272 arg1) {
        if (arg0 != -112) {
            method996((byte) 121);
        }
        class229.method1513(200000, (byte) -125, arg1);
        field2232++;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "()V")
    public static final void method995() {
        class17.field302 = 0;
        label191: for (int var0 = 0; var0 < class195.field2991; var0++) {
            class185 var1 = class288.field4590[var0];
            if (class271.field4324 != null) {
                for (int var2 = 0; var2 < class271.field4324.length; var2++) {
                    if (class271.field4324[var2] != -1000000 && (var1.field2817 <= class271.field4324[var2] || var1.field2804 <= class271.field4324[var2]) && (var1.field2801 <= class85.field1233[var2] || var1.field2797 <= class85.field1233[var2]) && (var1.field2801 >= class278.field4420[var2] || var1.field2797 >= class278.field4420[var2]) && (var1.field2811 <= class59.field823[var2] || var1.field2816 <= class59.field823[var2]) && (var1.field2811 >= class15.field270[var2] || var1.field2816 >= class15.field270[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field2806 == 1) {
                int var3 = var1.field2803 + class307.field4936 - class231.field3613;
                if (var3 >= 0 && var3 <= class307.field4936 + class307.field4936) {
                    int var4 = var1.field2798 + class307.field4936 - class216.field3312;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field2810 + class307.field4936 - class216.field3312;
                    if (var5 > class307.field4936 + class307.field4936) {
                        var5 = class307.field4936 + class307.field4936;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class267.field4284[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class272.field4343 - var1.field2801;
                        if (var7 > 32) {
                            var1.field2815 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field2815 = 2;
                            var7 = -var7;
                        }
                        var1.field2800 = (var1.field2811 - class107.field1525 << 8) / var7;
                        var1.field2814 = (var1.field2816 - class107.field1525 << 8) / var7;
                        var1.field2818 = (var1.field2817 - class191.field2892 << 8) / var7;
                        var1.field2807 = (var1.field2804 - class191.field2892 << 8) / var7;
                        class156.field2155[class17.field302++] = var1;
                    }
                }
            } else if (var1.field2806 == 2) {
                int var8 = var1.field2798 + class307.field4936 - class216.field3312;
                if (var8 >= 0 && var8 <= class307.field4936 + class307.field4936) {
                    int var9 = var1.field2803 + class307.field4936 - class231.field3613;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field2799 + class307.field4936 - class231.field3613;
                    if (var10 > class307.field4936 + class307.field4936) {
                        var10 = class307.field4936 + class307.field4936;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class267.field4284[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class107.field1525 - var1.field2811;
                        if (var12 > 32) {
                            var1.field2815 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field2815 = 4;
                            var12 = -var12;
                        }
                        var1.field2819 = (var1.field2801 - class272.field4343 << 8) / var12;
                        var1.field2809 = (var1.field2797 - class272.field4343 << 8) / var12;
                        var1.field2818 = (var1.field2817 - class191.field2892 << 8) / var12;
                        var1.field2807 = (var1.field2804 - class191.field2892 << 8) / var12;
                        class156.field2155[class17.field302++] = var1;
                    }
                }
            } else if (var1.field2806 == 4) {
                int var13 = var1.field2817 - class191.field2892;
                if (var13 > 128) {
                    int var14 = var1.field2798 + class307.field4936 - class216.field3312;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field2810 + class307.field4936 - class216.field3312;
                    if (var15 > class307.field4936 + class307.field4936) {
                        var15 = class307.field4936 + class307.field4936;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field2803 + class307.field4936 - class231.field3613;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field2799 + class307.field4936 - class231.field3613;
                        if (var17 > class307.field4936 + class307.field4936) {
                            var17 = class307.field4936 + class307.field4936;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class267.field4284[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field2815 = 5;
                            var1.field2819 = (var1.field2801 - class272.field4343 << 8) / var13;
                            var1.field2809 = (var1.field2797 - class272.field4343 << 8) / var13;
                            var1.field2800 = (var1.field2811 - class107.field1525 << 8) / var13;
                            var1.field2814 = (var1.field2816 - class107.field1525 << 8) / var13;
                            class156.field2155[class17.field302++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
    public static final void method996(byte arg0) {
        int var1 = class261.field4201.method230(class24.field386);
        field2236++;
        for (int var2 = 0; var2 < class179.field2721; var2++) {
            int var6 = class261.field4201.method230(class45.method291(50, var2));
            if (var6 > var1) {
                var1 = var6;
            }
        }
        var1 += 8;
        int var3 = class179.field2721 * 15 + 21;
        if (arg0 >= -2) {
            return;
        }
        int var4 = class302.field4804 - (var1 / 2);
        if ((var4 + var1) > class218.field3386) {
            var4 = class218.field3386 - var1;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        int var5 = class179.field2717;
        if (class174.field2460 < var3 + var5) {
            var5 = class174.field2460 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class276.field4386 != 1) {
            if (class59.field826 != class302.field4804 || class25.field393 != class179.field2717) {
                class276.field4386 = 1;
                class242.field3799 = class25.field393;
                class247.field3871 = class59.field826;
                return;
            }
            class276.field4386 = 0;
            class171.field2447 = true;
            class227.field3557 = (class158.field2193 ? 26 : 22) + class179.field2721 * 15;
            class295.field4707 = var4;
            class189.field2868 = var5;
            class243.field3815 = var1;
        } else if (class302.field4804 == class247.field3871 && class242.field3799 == class179.field2717) {
            class295.field4707 = var4;
            class276.field4386 = 0;
            class189.field2868 = var5;
            class243.field3815 = var1;
            class227.field3557 = (class158.field2193 ? 26 : 22) + class179.field2721 * 15;
            class171.field2447 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public static void method997(int arg0) {
        field2237 = null;
        field2235 = null;
        if (arg0 == 1) {
            field2238 = null;
        }
    }
}
