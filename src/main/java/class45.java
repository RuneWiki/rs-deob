import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class45 {

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "Lpj;")
    public static class237 field971 = class33.method353("T", 117);

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field974 = -2;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "Lw;")
    public static class141 field972 = null;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field977 = 0;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "[B")
    public static byte[] field973;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "Lpj;")
    public static class237 field982;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "Lpj;")
    public static class237 field985;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "Lpj;")
    private static class237 field984;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "Lpj;")
    public static class237 field983;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "Lub;")
    public static class88 field981;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "Lpj;")
    public static class237 field976;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BIILw;)V")
    public static final void method422(byte arg0, int arg1, int arg2, class141 arg3) {
        if (arg3.field2569 == 0) {
            arg3.field2438 = arg3.field2425;
        } else if (arg3.field2569 == 1) {
            arg3.field2438 = (arg1 - arg3.field2490) / 2 + arg3.field2425;
        } else if (arg3.field2569 == 2) {
            arg3.field2438 = arg1 - arg3.field2490 - arg3.field2425;
        } else if (arg3.field2569 == 3) {
            arg3.field2438 = arg3.field2425 * arg1 >> 14;
        } else if (arg3.field2569 == 4) {
            arg3.field2438 = (arg3.field2425 * arg1 >> 14) + (arg1 - arg3.field2490) / 2;
        } else {
            arg3.field2438 = arg1 - (arg3.field2425 * arg1 >> 14) - arg3.field2490;
        }
        if (arg0 != -118) {
            return;
        }
        if (arg3.field2476 == 0) {
            arg3.field2416 = arg3.field2510;
        } else if (arg3.field2476 == 1) {
            arg3.field2416 = (arg2 - arg3.field2575) / 2 + arg3.field2510;
        } else if (arg3.field2476 == 2) {
            arg3.field2416 = arg2 - arg3.field2510 - arg3.field2575;
        } else if (arg3.field2476 == 3) {
            arg3.field2416 = arg3.field2510 * arg2 >> 14;
        } else if (arg3.field2476 == 4) {
            arg3.field2416 = (arg3.field2510 * arg2 >> 14) + (arg2 - arg3.field2575) / 2;
        } else {
            arg3.field2416 = arg2 - arg3.field2575 - (arg3.field2510 * arg2 >> 14);
        }
        field979++;
        if (!class215.field3731 || client.method1042(arg3) == 0 && arg3.field2529 != 0) {
            return;
        }
        if (arg3.field2416 < 0) {
            arg3.field2416 = 0;
        } else if (arg3.field2575 + arg3.field2416 > arg2) {
            arg3.field2416 = arg2 - arg3.field2575;
        }
        if (arg3.field2438 < 0) {
            arg3.field2438 = 0;
        } else if (arg1 < arg3.field2438 + arg3.field2490) {
            arg3.field2438 = arg1 - arg3.field2490;
            return;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public static void method423(int arg0) {
        field985 = null;
        field972 = null;
        field971 = null;
        field976 = null;
        field982 = null;
        field973 = null;
        field983 = null;
        field984 = null;
        field981 = null;
        if (arg0 >= -74) {
            method426((byte) 57, -30);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "([[II)V")
    public static final void method424(int[][] arg0, int arg1) {
        class62.field1241 = arg0;
        field978++;
        int var2 = 94 % ((-arg1 - 22) / 46);
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V")
    public static final void method425(int arg0) {
        field975++;
        for (int var1 = arg0; var1 < class155.field2752; var1++) {
            int var2 = class117.field2062[var1];
            class210 var3 = class232.field4022[var2];
            int var4 = class65.field1288.method316((byte) -27);
            if ((var4 & 0x20) != 0) {
                var3.field3719 = class65.field1288.method321((byte) -91);
                if (var3.field3719 == 65535) {
                    var3.field3719 = -1;
                }
            }
            if ((var4 & 0x80) != 0) {
                int var5 = class65.field1288.method343((byte) 100);
                int var6 = class65.field1288.method316((byte) 100);
                var3.method1440(18353, var5, class241.field4246, var6);
            }
            if ((var4 & 0x2) != 0) {
                var3.field3706 = class65.field1288.method314(arg0 ^ 0xD300BCC8);
                var3.field3730 = class65.field1288.method321((byte) -88);
            }
            if ((var4 & 0x4) != 0) {
                var3.field3713 = class65.field1288.method324(1);
                var3.field3694 = 100;
            }
            if ((var4 & 0x10) != 0) {
                int var7 = class65.field1288.method314(arg0 - 754926392);
                int var8 = class65.field1288.method347(255);
                if (var7 == 65535) {
                    var7 = -1;
                }
                class170.method1177(var8, var7, var3, false);
            }
            if ((var4 & 0x1) != 0) {
                if (var3.field3586.method1539((byte) 21)) {
                    class167.method1166(var3, -119);
                }
                var3.field3586 = class271.method1805(class65.field1288.method300(128), arg0 ^ 0xFFFFFF83);
                var3.method1447(var3.field3586.field3989, (byte) 98);
                var3.field3723 = var3.field3586.field4003;
                var3.field3679 = var3.field3586.field3973;
                var3.field3687 = var3.field3586.field3965;
                var3.field3677 = var3.field3586.field3995;
                var3.field3712 = var3.field3586.field3997;
                var3.field3711 = var3.field3586.field3972;
                var3.field3726 = var3.field3586.field4009;
                var3.field3678 = var3.field3586.field3994;
                if (var3.field3586.method1539((byte) 21)) {
                    class96.method719(var3.field3743[0], var3.field3715[0], 0, (class28) null, (byte) 117, (class271) null, var3, class274.field4798);
                }
            }
            if ((var4 & 0x8) != 0) {
                var3.field3734 = class65.field1288.method339(-16777216);
                int var9 = class65.field1288.method326(true);
                var3.field3721 = var9 >> 16;
                var3.field3735 = (var9 & 0xFFFF) + class241.field4246;
                if (var3.field3734 == 65535) {
                    var3.field3734 = -1;
                }
                var3.field3728 = 0;
                var3.field3680 = 0;
                if (var3.field3735 > class241.field4246) {
                    var3.field3680 = -1;
                }
                if (var3.field3734 != -1 && class241.field4246 == var3.field3735) {
                    int var10 = class190.method1288(var3.field3734, (byte) 92).field1054;
                    if (var10 != -1) {
                        class256 var11 = class256.method1732(var10, true);
                        if (var11 != null && var11.field4416 != null) {
                            class95.method706(var3.field3700, false, 0, (byte) 122, var3.field3710, var11);
                        }
                    }
                }
            }
            if ((var4 & 0x40) != 0) {
                int var12 = class65.field1288.method295(arg0 ^ 0x3763);
                int var13 = class65.field1288.method343((byte) 100);
                var3.method1440(18353, var12, class241.field4246, var13);
                var3.field3746 = class241.field4246 + 300;
                var3.field3727 = class65.field1288.method347(255);
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)[B")
    public static final synchronized byte[] method426(byte arg0, int arg1) {
        field980++;
        if (arg1 == 100 && class216.field3764 > 0) {
            byte[] var2 = class264.field4518[--class216.field3764];
            class264.field4518[class216.field3764] = null;
            return var2;
        }
        int var3 = -23 / ((arg0 - 13) / 62);
        if (arg1 == 5000 && class47.field1024 > 0) {
            byte[] var4 = class74.field1415[--class47.field1024];
            class74.field1415[class47.field1024] = null;
            return var4;
        } else if (arg1 == 30000 && class262.field4477 > 0) {
            byte[] var5 = class205.field3499[--class262.field4477];
            class205.field3499[class262.field4477] = null;
            return var5;
        } else {
            return new byte[arg1];
        }
    }

    static {
        int var0 = 0;
        field973 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field973[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field982 = class33.method353(" GMT", 51);
        field985 = class33.method353(":assist:", 63);
        field984 = class33.method353("Loading )2 please wait)3", 124);
        field983 = field984;
        field981 = new class88();
    }
}
