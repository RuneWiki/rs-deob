import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class245 extends class88 {

    @OriginalMember(owner = "client!a", name = "J", descriptor = "Ljava/lang/String;")
    public static String field4023 = "Allocated memory";

    @OriginalMember(owner = "client!a", name = "P", descriptor = "[I")
    public static int[] field4029 = new int[32];

    @OriginalMember(owner = "client!a", name = "R", descriptor = "[Ljava/lang/String;")
    public static String[] field4031 = null;

    @OriginalMember(owner = "client!a", name = "E", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!a", name = "K", descriptor = "I")
    public int field4024;

    @OriginalMember(owner = "client!a", name = "L", descriptor = "I")
    public int field4025;

    @OriginalMember(owner = "client!a", name = "N", descriptor = "I")
    public int field4027;

    @OriginalMember(owner = "client!a", name = "Q", descriptor = "I")
    public int field4030;

    @OriginalMember(owner = "client!a", name = "T", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!a", name = "H", descriptor = "Leh;")
    public static class137 field4021;

    @OriginalMember(owner = "client!a", name = "F", descriptor = "Ljava/lang/String;")
    public String field4019;

    @OriginalMember(owner = "client!a", name = "I", descriptor = "[I")
    public int[] field4022;

    @OriginalMember(owner = "client!a", name = "S", descriptor = "[I")
    public int[] field4032;

    @OriginalMember(owner = "client!a", name = "O", descriptor = "[Lsb;")
    public class110[] field4028;

    @OriginalMember(owner = "client!a", name = "M", descriptor = "[Lib;")
    public static class56[] field4026;

    @OriginalMember(owner = "client!a", name = "G", descriptor = "[Ljava/lang/String;")
    public String[] field4020;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(I)V")
    public static void method1704(int arg0) {
        field4029 = null;
        field4026 = null;
        field4021 = null;
        if (arg0 == -8611) {
            field4031 = null;
            field4023 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IILbl;B)V")
    public static final void method1705(int arg0, int arg1, class259 arg2, byte arg3) {
        field4033++;
        if ((arg0 & 0x1) != 0) {
            arg2.field3822 = class96.field1283.method588(false);
            if (arg2.field3822.charAt(0) == '~') {
                arg2.field3822 = arg2.field3822.substring(1);
                class211.method1487(arg2.field3822, arg2.method1770(-1), 2, (byte) -121);
            } else if (class286.field4571 == arg2) {
                class211.method1487(arg2.field3822, arg2.method1770(-1), 2, (byte) -125);
            }
            arg2.field3798 = 0;
            arg2.field3837 = 0;
            arg2.field3773 = 150;
        }
        if ((arg0 & 0x200) != 0) {
            int var4 = class96.field1283.method584(255);
            int[] var5 = new int[var4];
            int[] var6 = new int[var4];
            int[] var7 = new int[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                int var9 = class96.field1283.method548(117);
                if (var9 == 65535) {
                    var9 = -1;
                }
                var5[var8] = var9;
                var7[var8] = class96.field1283.method583(-1);
                var6[var8] = class96.field1283.method562((byte) -18);
            }
            class265.method1786(var6, false, var7, arg2, var5);
        }
        if ((arg0 & 0x4) != 0) {
            int var10 = class96.field1283.method539(-401085592);
            int var11 = class96.field1283.method584(255);
            arg2.method1645(var11, true, var10, class73.field924);
            arg2.field3807 = class73.field924 + 300;
            arg2.field3741 = class96.field1283.method583(-1);
        }
        if ((arg0 & 0x80) != 0) {
            arg2.field3803 = class96.field1283.method548(113);
            arg2.field3806 = class96.field1283.method586((byte) -81);
        }
        if ((arg0 & 0x40) != 0) {
            int var12 = class96.field1283.method563(255);
            byte[] var13 = new byte[var12];
            class96 var14 = new class96(var13);
            class96.field1283.method575(var13, var12, 0, (byte) -39);
            class110.field1568[arg1] = var14;
            arg2.method1771((byte) 127, var14);
        }
        if ((arg0 & 0x800) != 0) {
            int var15 = class96.field1283.method539(-401085592);
            int var16 = class96.field1283.method584(255);
            arg2.method1645(var16, true, var15, class73.field924);
        }
        if ((arg0 & 0x2) != 0) {
            arg2.field3812 = class96.field1283.method586((byte) -81);
            if (arg2.field3812 == 65535) {
                arg2.field3812 = -1;
            }
        }
        if ((arg0 & 0x400) != 0) {
            arg2.field3748 = class96.field1283.method584(255);
            arg2.field3785 = class96.field1283.method583(-1);
            arg2.field3762 = class96.field1283.method585(255);
            arg2.field3777 = class96.field1283.method563(255);
            arg2.field3799 = class96.field1283.method548(121) + class73.field924;
            arg2.field3792 = class96.field1283.method562((byte) -18) + class73.field924;
            arg2.field3764 = class96.field1283.method584(255);
            arg2.field3791 = 1;
            arg2.field3784 = 0;
        }
        if (arg3 > -53) {
            field4031 = null;
        }
        if ((arg0 & 0x8) != 0) {
            int var17 = class96.field1283.method586((byte) -81);
            if (var17 == 65535) {
                var17 = -1;
            }
            int var18 = class96.field1283.method563(255);
            class88.method479(arg2, var18, var17, 0);
        }
        if ((arg0 & 0x20) != 0) {
            int var19 = class96.field1283.method562((byte) -18);
            int var20 = class96.field1283.method583(-1);
            int var21 = class96.field1283.method583(-1);
            boolean var22 = (var19 & 0x8000) != 0;
            int var23 = class96.field1283.field1228;
            if (arg2.field4208 != null && arg2.field4219 != null) {
                long var24 = class185.method1296((byte) -103, arg2.field4208);
                boolean var26 = false;
                if (var20 <= 1) {
                    if (!var22 && (class54.field692 && !class123.field1777 || class216.field3471)) {
                        var26 = true;
                    } else {
                        for (int var27 = 0; var27 < class198.field3141; var27++) {
                            if (class53.field684[var27] == var24) {
                                var26 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var26 && class251.field4093 == 0) {
                    class294.field4657.field1228 = 0;
                    class96.field1283.method578(0, var21, (byte) -24, class294.field4657.field1218);
                    class294.field4657.field1228 = 0;
                    int var28 = -1;
                    String var29;
                    if (var22) {
                        var19 &= 0x7FFF;
                        class103 var30 = class14.method76(class294.field4657, -1);
                        var28 = var30.field1390;
                        var29 = var30.field1391.method1830(class294.field4657, (byte) 59);
                    } else {
                        var29 = class109.method683(class211.method1482(class118.method764((byte) -125, class294.field4657), 105));
                    }
                    arg2.field3822 = var29.trim();
                    arg2.field3837 = var19 >> 8;
                    arg2.field3798 = var19 & 0xFF;
                    arg2.field3773 = 150;
                    if (var20 == 2) {
                        class121.method786(var28, var22 ? 17 : 1, false, (String) null, var29, "<img=1>" + arg2.method1770(-1));
                    } else if (var20 == 1) {
                        class121.method786(var28, var22 ? 17 : 1, false, (String) null, var29, "<img=0>" + arg2.method1770(-1));
                    } else {
                        class121.method786(var28, var22 ? 17 : 2, false, (String) null, var29, arg2.method1770(-1));
                    }
                }
            }
            class96.field1283.field1228 = var21 + var23;
        }
        if ((arg0 & 0x100) == 0) {
            return;
        }
        int var31 = class96.field1283.method586((byte) -81);
        if (var31 == 65535) {
            var31 = -1;
        }
        int var32 = class96.field1283.method552((byte) -96);
        boolean var33 = true;
        if (var31 != -1 && arg2.field3757 != -1 && class208.method1458((byte) -52, class79.method440(var31, (byte) 14).field1318).field2646 < class208.method1458((byte) 84, class79.method440(arg2.field3757, (byte) 14).field1318).field2646) {
            var33 = false;
        }
        if (!var33) {
            return;
        }
        arg2.field3779 = class73.field924 + (var32 & 0xFFFF);
        arg2.field3772 = 0;
        arg2.field3761 = 0;
        arg2.field3757 = var31;
        arg2.field3783 = var32 >> 16;
        if (arg2.field3779 > class73.field924) {
            arg2.field3772 = -1;
        }
        arg2.field3832 = 1;
        if (arg2.field3757 == -1 || class73.field924 != arg2.field3779) {
            return;
        }
        int var34 = class79.method440(arg2.field3757, (byte) 14).field1318;
        if (var34 == -1) {
            return;
        }
        class165 var35 = class208.method1458((byte) 120, var34);
        if (var35 != null && var35.field2624 != null) {
            class221.method1562(0, arg2.field3820, arg2.field3818, var35, (byte) 47, class286.field4571 == arg2);
            return;
        }
    }
}
