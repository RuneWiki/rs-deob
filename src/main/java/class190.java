import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class190 {

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "[J")
    public static long[] field3108 = new long[500];

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3115 = "wave2:";

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "[S")
    public static short[] field3109;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(JZ)Ljava/lang/String;", line = 4)
    public static final String method1406(long arg0, boolean arg1) {
        field3110++;
        if (arg1) {
            field3115 = (String) null;
        }
        return class33.method179(37, arg0);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Log;I)V", line = 26)
    public static final void method1407(class157 arg0, int arg1) {
        int var2 = arg0.field2467;
        field3111++;
        if (var2 == 324) {
            if (class44.field552 == -1) {
                class2.field20 = arg0.field2567;
                class44.field552 = arg0.field2596;
            }
            if (class282.field4531.field1559) {
                arg0.field2596 = class44.field552;
            } else {
                arg0.field2596 = class2.field20;
            }
        } else if (var2 == 325) {
            if (class44.field552 == -1) {
                class44.field552 = arg0.field2596;
                class2.field20 = arg0.field2567;
            }
            if (class282.field4531.field1559) {
                arg0.field2596 = class2.field20;
            } else {
                arg0.field2596 = class44.field552;
            }
        } else {
            int var3 = 32 / ((-arg1 - 18) / 60);
            if (var2 == 327) {
                arg0.field2492 = 150;
                arg0.field2574 = (int) (Math.sin((double) class240.field3818 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field2516 = 5;
                arg0.field2455 = -1;
            } else if (var2 == 328) {
                if (class191.field3129.field5216 == null) {
                    arg0.field2455 = 0;
                } else {
                    arg0.field2492 = 150;
                    arg0.field2574 = (int) (Math.sin((double) class240.field3818 / 40.0D) * 256.0D) & 0x7FF;
                    arg0.field2516 = 5;
                    arg0.field2455 = ((int) class204.method1491(-26916, class191.field3129.field5216) << 11) + 2047;
                    arg0.field2476 = 0;
                    arg0.field2581 = class191.field3129.field4232;
                    arg0.field2497 = class191.field3129.field4212;
                    arg0.field2584 = class191.field3129.field4191;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)Ljava/lang/String;", line = 101)
    public static final String method1408(int arg0, int arg1) {
        field3112++;
        String var2 = Integer.toString(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class192.field3137 + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class66.field954 + " (" + var2 + ")</col>";
        } else {
            if (arg1 != 150) {
                field3115 = (String) null;
            }
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIII)V", line = 132)
    public static final void method1409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class81.field1127 = arg3;
        field3113++;
        class309.field4814 = arg4;
        class111.field1655 = arg1;
        class167.field2763 = arg2;
        class150.field2326 = arg0;
        if (class81.field1127 >= 100) {
            int var6 = class167.field2763 * 128 + 64;
            int var7 = class309.field4814 * 128 + 64;
            int var8 = class123.method889(1, class49.field698, var7, var6) - class111.field1655;
            int var9 = var7 - class120.field1825;
            int var10 = var8 - class83.field1173;
            int var11 = var6 - class260.field4150;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + (var11 * var11)));
            class74.field1036 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 0x7FF;
            class186.field3076 = (int) (-325.949D * Math.atan2((double) var9, (double) var11)) & 0x7FF;
            if (class74.field1036 < 128) {
                class74.field1036 = 128;
            }
            if (class74.field1036 > 383) {
                class74.field1036 = 383;
            }
        }
        class31.field423 = arg5;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V", line = 174)
    public static void method1410(int arg0) {
        field3108 = null;
        field3109 = null;
        field3115 = null;
        if (arg0 < 14) {
            method1406(114L, true);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZLpi;III)V", line = 191)
    public static final void method1411(int arg0, boolean arg1, class202 arg2, int arg3, int arg4, int arg5) {
        field3114++;
        if (class135.field2148 >= 50 || arg2 == null || arg2.field3289 == null || arg4 >= arg2.field3289.length || arg2.field3289[arg4] == null) {
            return;
        }
        int var6 = arg2.field3289[arg4][0];
        int var7 = var6 >> 5 & 0x7;
        int var8 = arg0 & var6;
        int var9 = var6 >> 8;
        if (arg2.field3289[arg4].length > 1) {
            int var10 = (int) ((double) arg2.field3289[arg4].length * Math.random());
            if (var10 > 0) {
                var9 = arg2.field3289[arg4][var10];
            }
        }
        if (var8 == 0) {
            if (arg1) {
                class50.method327(var7, 0, var9, 255, (byte) 93);
            }
        } else if (class174.field2883 != 0) {
            class193.field3153[class135.field2148] = var9;
            int var11 = (arg5 - 64) / 128;
            class265.field4285[class135.field2148] = var7;
            class105.field1541[class135.field2148] = 0;
            class343.field5333[class135.field2148] = null;
            class8.field116[class135.field2148] = 255;
            int var12 = (arg3 - 64) / 128;
            class111.field1651[class135.field2148] = (var12 << 8) + (var11 << 16) + var8;
            class135.field2148++;
        }
    }
}
