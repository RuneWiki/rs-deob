import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class79 extends class259 {

    @OriginalMember(owner = "client!om", name = "M", descriptor = "I")
    public int field1058 = 0;

    @OriginalMember(owner = "client!om", name = "G", descriptor = "I")
    public static int field1052 = 0;

    @OriginalMember(owner = "client!om", name = "I", descriptor = "Ljava/lang/String;")
    public static String field1054 = "glow3:";

    @OriginalMember(owner = "client!om", name = "O", descriptor = "[I")
    public static int[] field1060 = new int[4];

    @OriginalMember(owner = "client!om", name = "A", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!om", name = "B", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!om", name = "C", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!om", name = "D", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!om", name = "F", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!om", name = "J", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!om", name = "L", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!om", name = "H", descriptor = "Lvd;")
    public static class153 field1053;

    @OriginalMember(owner = "client!om", name = "z", descriptor = "Lnk;")
    public static class16 field1045;

    @OriginalMember(owner = "client!om", name = "K", descriptor = "Lnk;")
    public static class16 field1056;

    @OriginalMember(owner = "client!om", name = "E", descriptor = "Ldb;")
    public static class207 field1050;

    @OriginalMember(owner = "client!om", name = "N", descriptor = "[S")
    public static short[] field1059;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I[Lwb;)V", line = 3)
    public static final void method514(int arg0, class175[] arg1) {
        class69.field866[arg0] = arg1;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZILlf;)V", line = 11)
    private final void method515(boolean arg0, int arg1, class143 arg2) {
        if (arg1 == 2) {
            this.field1058 = arg2.method1051(1);
        }
        if (arg0) {
            field1052 = 113;
        }
        field1051++;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lo;B)I", line = 29)
    public static final int method516(class231 arg0, byte arg1) {
        int var2 = 6 % ((71 - arg1) / 40);
        field1057++;
        class140 var3 = arg0.field3503;
        if (var3.field2101 != null) {
            var3 = var3.method961(-114);
            if (var3 == null) {
                return -1;
            }
        }
        int var4 = var3.field2152;
        class282 var5 = arg0.method1719(-1);
        if (arg0.field3778 == var5.field4486) {
            var4 = var3.field2135;
        } else if (arg0.field3778 == var5.field4464 || arg0.field3778 == var5.field4471 || arg0.field3778 == var5.field4492 || arg0.field3778 == var5.field4469) {
            var4 = var3.field2151;
        } else if (arg0.field3778 == var5.field4468 || arg0.field3778 == var5.field4475 || arg0.field3778 == var5.field4458 || arg0.field3778 == var5.field4470) {
            var4 = var3.field2130;
        }
        return var4;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZII)I", line = 67)
    public static final int method517(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method521(78, 55);
        }
        field1055++;
        int var3 = arg2 >>> 31;
        return (arg2 + var3) / arg1 - var3;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIILwf;)V", line = 81)
    public static final void method518(int arg0, int arg1, int arg2, class67 arg3) {
        if ((arg2 & 0x20) != 0) {
            arg3.field3711 = class282.field4499.method1031(false);
            arg3.field3723 = class282.field4499.method1031(false);
        }
        if ((arg2 & 0x80) != 0) {
            int var4 = class282.field4499.method1027(false);
            int var5 = class282.field4499.method1043(true);
            arg3.method1718(var5, arg0 ^ 0x4, var4, class102.field1381);
            arg3.field3775 = class102.field1381 + 300;
            arg3.field3726 = class282.field4499.method1046(2);
        }
        if ((arg2 & 0x2) != 0) {
            int var6 = class282.field4499.method1031(false);
            int var7 = class282.field4499.method1059((byte) 37);
            int var8 = class282.field4499.method1059((byte) 96);
            int var9 = class282.field4499.field2295;
            boolean var10 = (var6 & 0x8000) != 0;
            if (arg3.field848 != null && arg3.field813 != null) {
                long var11 = class294.method2093((byte) 100, arg3.field848);
                boolean var13 = false;
                if (var7 <= 1) {
                    if (var10 || (!class334.field5339 || class174.field2630) && !class201.field3043) {
                        for (int var14 = 0; var14 < class274.field4339; var14++) {
                            if (class337.field5382[var14] == var11) {
                                var13 = true;
                                break;
                            }
                        }
                    } else {
                        var13 = true;
                    }
                }
                if (!var13 && class123.field1706 == 0) {
                    class314.field4935.field2295 = 0;
                    class282.field4499.method1020(var8, class314.field4935.field2260, (byte) 67, 0);
                    int var15 = -1;
                    class314.field4935.field2295 = 0;
                    String var17;
                    if (var10) {
                        var6 &= 0x7FFF;
                        class232 var16 = class331.method2295(arg0 ^ 0xFFFFFF80, class314.field4935);
                        var15 = var16.field3510;
                        var17 = var16.field3508.method2279(class314.field4935, 83);
                    } else {
                        var17 = class240.method1688(class57.method343(class245.method1734(class314.field4935, 32767), 33));
                    }
                    arg3.field3734 = var17.trim();
                    arg3.field3751 = 150;
                    arg3.field3765 = var6 >> 8;
                    arg3.field3805 = var6 & 0xFF;
                    if (var7 == 2) {
                        class277.method1979(var15, "<img=1>" + arg3.method419((byte) -51), (String) null, (byte) -102, var10 ? 17 : 1, var17);
                    } else if (var7 == 1) {
                        class277.method1979(var15, "<img=0>" + arg3.method419((byte) -51), (String) null, (byte) -54, var10 ? 17 : 1, var17);
                    } else {
                        class277.method1979(var15, arg3.method419((byte) -51), (String) null, (byte) -116, var10 ? 17 : 2, var17);
                    }
                }
            }
            class282.field4499.field2295 = var8 + var9;
        }
        field1046++;
        if ((arg2 & 0x800) != arg0) {
            int var18 = class282.field4499.method1027(false);
            int var19 = class282.field4499.method1043(true);
            arg3.method1718(var19, arg0 ^ 0x4, var18, class102.field1381);
        }
        if ((arg2 & 0x400) != 0) {
            arg3.field3761 = class282.field4499.method1062((byte) -20);
            arg3.field3733 = class282.field4499.method1043(true);
            arg3.field3719 = class282.field4499.method1046(2);
            arg3.field3790 = class282.field4499.method1046(2);
            arg3.field3773 = class282.field4499.method1048(arg0 ^ 0x65) + class102.field1381;
            arg3.field3780 = class282.field4499.method1032(0) + class102.field1381;
            arg3.field3770 = class282.field4499.method1062((byte) -20);
            arg3.field3802 = 0;
            arg3.field3789 = 1;
        }
        if ((arg2 & 0x200) != 0) {
            int var20 = class282.field4499.method1046(arg0 + 2);
            int[] var21 = new int[var20];
            int[] var22 = new int[var20];
            int[] var23 = new int[var20];
            for (int var24 = 0; var24 < var20; var24++) {
                int var25 = class282.field4499.method1048(arg0 ^ 0x46);
                if (var25 == 65535) {
                    var25 = -1;
                }
                var22[var24] = var25;
                var21[var24] = class282.field4499.method1046(arg0 + 2);
                var23[var24] = class282.field4499.method1048(111);
            }
            class273.method1969(var21, arg3, var23, var22, true);
        }
        if ((arg2 & 0x4) != 0) {
            arg3.field3734 = class282.field4499.method1040((byte) -128);
            if (arg3.field3734.charAt(0) == '~') {
                arg3.field3734 = arg3.field3734.substring(1);
                class306.method2157(arg3.field3734, false, 2, arg3.method419((byte) -51));
            } else if (class11.field113 == arg3) {
                class306.method2157(arg3.field3734, false, 2, arg3.method419((byte) -51));
            }
            arg3.field3805 = 0;
            arg3.field3751 = 150;
            arg3.field3765 = 0;
        }
        if ((arg2 & 0x10) != 0) {
            int var26 = class282.field4499.method1048(arg0 ^ 0xFFFFFFCF);
            if (var26 == 65535) {
                var26 = -1;
            }
            int var27 = class282.field4499.method1059((byte) 77);
            class122.method785(arg3, var26, var27, true);
        }
        if ((arg2 & 0x100) != 0) {
            int var28 = class282.field4499.method1032(arg0);
            if (var28 == 65535) {
                var28 = -1;
            }
            boolean var29 = true;
            int var30 = class282.field4499.method1057(-105);
            if (var28 != -1 && arg3.field3703 != -1 && class289.method2067((byte) -37, class255.method1803(var28, (byte) -51).field4919).field1521 < class289.method2067((byte) -61, class255.method1803(arg3.field3703, (byte) -51).field4919).field1521) {
                var29 = false;
            }
            if (var29) {
                arg3.field3791 = 1;
                arg3.field3785 = var30 >> 16;
                arg3.field3703 = var28;
                arg3.field3803 = 0;
                arg3.field3752 = 0;
                arg3.field3736 = (var30 & 0xFFFF) + class102.field1381;
                if (arg3.field3736 > class102.field1381) {
                    arg3.field3803 = -1;
                }
                if (arg3.field3703 != -1 && class102.field1381 == arg3.field3736) {
                    int var31 = class255.method1803(arg3.field3703, (byte) -51).field4919;
                    if (var31 != -1) {
                        class111 var32 = class289.method2067((byte) -97, var31);
                        if (var32 != null && var32.field1533 != null) {
                            class313.method2210(var32, 0, 50, arg3.field3763, class11.field113 == arg3, arg3.field3767);
                        }
                    }
                }
            }
        }
        if ((arg2 & 0x1) != 0) {
            int var33 = class282.field4499.method1059((byte) 66);
            byte[] var34 = new byte[var33];
            class143 var35 = new class143(var34);
            class282.field4499.method1008((byte) 95, 0, var33, var34);
            class125.field1772[arg1] = var35;
            arg3.method411(var35, (byte) -127);
        }
        if ((arg2 & 0x8) != 0) {
            arg3.field3792 = class282.field4499.method1031(false);
            if (arg3.field3792 == 65535) {
                arg3.field3792 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "e", descriptor = "(I)V", line = 351)
    public static final void method519(int arg0) {
        field1047++;
        class293.field4614.method383((byte) -48);
        if (arg0 != 1) {
            field1050 = (class207) null;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Llf;Z)V", line = 368)
    public final void method520(class143 arg0, boolean arg1) {
        field1048++;
        while (true) {
            int var3 = arg0.method1043(arg1);
            if (var3 == 0) {
                if (!arg1) {
                    method521(77, 23);
                }
                return;
            }
            this.method515(false, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(II)Lua;", line = 403)
    public static final class103 method521(int arg0, int arg1) {
        class103 var2 = (class103) class45.field516.method380(0, (long) arg0);
        field1049++;
        if (var2 != null) {
            return var2;
        } else if (arg1 >= -41) {
            return (class103) null;
        } else {
            byte[] var3 = class14.field140.method100(36, arg0, (byte) -107);
            class103 var4 = new class103();
            var4.field1391 = arg0;
            if (var3 != null) {
                var4.method651(-24979, new class143(var3));
            }
            class45.field516.method377((long) arg0, var4, -1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!om", name = "f", descriptor = "(I)V", line = 427)
    public static void method522(int arg0) {
        if (arg0 != -10595) {
            field1045 = (class16) null;
        }
        field1060 = null;
        field1053 = null;
        field1059 = null;
        field1056 = null;
        field1045 = null;
        field1050 = null;
        field1054 = null;
    }
}
