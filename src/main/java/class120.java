import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class120 extends class28 {

    @OriginalMember(owner = "client!rc", name = "eb", descriptor = "I")
    private int field2744 = 0;

    @OriginalMember(owner = "client!rc", name = "hb", descriptor = "[S")
    private short[] field2747 = new short[6];

    @OriginalMember(owner = "client!rc", name = "cb", descriptor = "I")
    private int field2742 = 128;

    @OriginalMember(owner = "client!rc", name = "ob", descriptor = "I")
    private int field2754 = 128;

    @OriginalMember(owner = "client!rc", name = "sb", descriptor = "I")
    private int field2758 = 0;

    @OriginalMember(owner = "client!rc", name = "gb", descriptor = "[S")
    private short[] field2746 = new short[6];

    @OriginalMember(owner = "client!rc", name = "db", descriptor = "I")
    public int field2743 = -1;

    @OriginalMember(owner = "client!rc", name = "ub", descriptor = "I")
    private int field2760 = 0;

    @OriginalMember(owner = "client!rc", name = "W", descriptor = "Lja;")
    private static class62 field2736 = class30.method243(43, "level)2");

    @OriginalMember(owner = "client!rc", name = "bb", descriptor = "I")
    public static int field2741 = -1;

    @OriginalMember(owner = "client!rc", name = "kb", descriptor = "Z")
    public static boolean field2750 = false;

    @OriginalMember(owner = "client!rc", name = "mb", descriptor = "Lja;")
    public static class62 field2752 = class30.method243(43, "Bitte wenden Sie sich an den Kundendienst)3");

    @OriginalMember(owner = "client!rc", name = "lb", descriptor = "Lja;")
    private static class62 field2751 = class30.method243(43, "Unexpected server response");

    @OriginalMember(owner = "client!rc", name = "nb", descriptor = "[[I")
    public static int[][] field2753 = new int[104][104];

    @OriginalMember(owner = "client!rc", name = "rb", descriptor = "I")
    public static int field2757 = 0;

    @OriginalMember(owner = "client!rc", name = "yb", descriptor = "Lja;")
    public static class62 field2764 = class30.method243(43, "Mem:");

    @OriginalMember(owner = "client!rc", name = "wb", descriptor = "Lja;")
    public static class62 field2762 = null;

    @OriginalMember(owner = "client!rc", name = "vb", descriptor = "Lja;")
    public static class62 field2761 = field2751;

    @OriginalMember(owner = "client!rc", name = "xb", descriptor = "Lja;")
    public static class62 field2763 = field2736;

    @OriginalMember(owner = "client!rc", name = "V", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!rc", name = "X", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!rc", name = "Y", descriptor = "I")
    private int field2738;

    @OriginalMember(owner = "client!rc", name = "Z", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!rc", name = "fb", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!rc", name = "ib", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!rc", name = "jb", descriptor = "I")
    public int field2749;

    @OriginalMember(owner = "client!rc", name = "pb", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!rc", name = "tb", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!rc", name = "qb", descriptor = "Lkb;")
    public static class70 field2756;

    @OriginalMember(owner = "client!rc", name = "ab", descriptor = "Z")
    public static boolean field2740;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)V")
    public static final void method955(int arg0, int arg1, int arg2) {
        class136.field3140.method810(-2, 91);
        field2739++;
        class147.field3472++;
        if (arg0 >= -58) {
            method958(-68);
        }
        class136.field3140.method1002(arg1, -4094);
        class136.field3140.method1039(arg2, 305662280);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIZZI)Lic;")
    public static final class58 method956(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5) {
        long var6 = (long) arg5 + ((long) arg0 << 16) + ((long) arg2 << 38) + ((long) arg1 << 40);
        field2737++;
        if (!arg4) {
            class58 var8 = (class58) class39.field898.method129(var6, 24838);
            if (var8 != null) {
                return var8;
            }
        }
        class23 var9 = class140.method1114(arg5, arg3);
        if (arg0 > 1 && var9.field568 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg0 >= var9.field553[var11] && var9.field553[var11] != 0) {
                    var10 = var9.field568[var11];
                }
            }
            if (var10 != -1) {
                var9 = class140.method1114(var10, false);
            }
        }
        class145 var12 = var9.method187(1, (byte) -5);
        if (var12 == null) {
            return null;
        }
        class58 var13 = null;
        if (var9.field565 != -1) {
            var13 = method956(10, 0, 1, false, true, var9.field535);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class19.field423;
        int var15 = class19.field424;
        int var16 = class19.field427;
        int[] var17 = new int[4];
        class19.method140(var17);
        class58 var18 = new class58(36, 32);
        class19.method136(var18.field1432, 36, 32);
        class19.method133();
        class66.method525();
        class66.method515(16, 16);
        class66.field1652 = arg3;
        int var19 = var9.field579;
        if (arg4) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class66.field1658[var9.field554] * var19 >> 16;
        int var21 = class66.field1647[var9.field554] * var19 >> 16;
        var12.method1163();
        var12.method1158(0, var9.field545, var9.field556, var9.field554, var9.field540, var12.field3265 / 2 + var21 + var9.field577, var9.field577 + var20);
        if (arg2 >= 1) {
            var18.method420(1);
        }
        if (arg2 >= 2) {
            var18.method420(16777215);
        }
        if (arg1 != 0) {
            var18.method421(arg1);
        }
        class19.method136(var18.field1432, 36, 32);
        if (var9.field565 != -1) {
            var13.method417(0, 0);
        }
        if (!arg4 && (var9.field547 == 1 || arg0 != 1) && arg0 != -1) {
            class12.field296.method688(class98.method759((byte) 68, arg0), 0, 9, 16776960, 1);
        }
        if (!arg4) {
            class39.field898.method128((byte) -67, var18, var6);
        }
        class19.method136(var14, var15, var16);
        class19.method147(var17);
        class66.method525();
        class66.field1652 = true;
        return var18;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BLs;)V")
    public final void method957(byte arg0, class128 arg1) {
        if (arg0 >= -91) {
            return;
        }
        while (true) {
            int var3 = arg1.method1025(255);
            if (var3 == 0) {
                field2735++;
                return;
            }
            this.method959(var3, arg1, -76984080);
        }
    }

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)V")
    public static void method958(int arg0) {
        field2736 = null;
        field2761 = null;
        field2752 = null;
        int var1 = -7 / ((arg0 - 49) / 59);
        field2763 = null;
        field2753 = null;
        field2764 = null;
        field2762 = null;
        field2756 = null;
        field2751 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILs;I)V")
    private final void method959(int arg0, class128 arg1, int arg2) {
        if (arg2 != -76984080) {
            return;
        }
        if (arg0 == 1) {
            this.field2738 = arg1.method1041(arg2 + 289448800);
        } else if (arg0 == 2) {
            this.field2743 = arg1.method1041(212464720);
        } else if (arg0 == 4) {
            this.field2742 = arg1.method1041(212464720);
        } else if (arg0 == 5) {
            this.field2754 = arg1.method1041(212464720);
        } else if (arg0 == 6) {
            this.field2758 = arg1.method1041(212464720);
        } else if (arg0 == 7) {
            this.field2760 = arg1.method1025(255);
        } else if (arg0 == 8) {
            this.field2744 = arg1.method1025(255);
        } else if (arg0 >= 40 && arg0 < 50) {
            this.field2746[arg0 - 40] = (short) arg1.method1041(212464720);
        } else if (arg0 >= 50 && arg0 < 60) {
            this.field2747[arg0 - 50] = (short) arg1.method1041(212464720);
        }
        field2759++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIZII)V")
    public static final void method960(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field2755++;
        class19.method141(arg0, arg4, arg0 + arg1, arg3 + arg4);
        class66.method525();
        class116.field2671++;
        class50.method352(arg2, true);
        class34.method261(true, 60);
        class50.method352(false, true);
        class34.method261(false, 60);
        class43.method319(!arg2);
        class105.method842(0);
        if (!class47.field1094) {
            int var5 = class65.field1597;
            int var6 = class62.field1495 + class100.field2328 & 0x7FF;
            if (class80.field1948 / 256 > var5) {
                var5 = class80.field1948 / 256;
            }
            if (class155.field3604[4] && var5 < class43.field1002[4] + 128) {
                var5 = class43.field1002[4] + 128;
            }
            class77.method623(var6, var5, (byte) -121, class23.field567, var5 * 3 + 600, class47.field1079, class111.method908(128, class40.field936.field136, class40.field936.field134, class155.field3598) - 50);
        }
        int var7;
        if (class47.field1094) {
            var7 = class103.method829(arg2);
        } else {
            var7 = method962((byte) 125);
        }
        int var8 = class81.field1959;
        int var9 = class115.field2649;
        int var10 = class140.field3248;
        int var11 = class143.field3351;
        int var12 = class20.field433;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class155.field3604[var13]) {
                int var16 = (int) ((double) -class122.field2785[var13] + Math.random() * (double) (class122.field2785[var13] * 2 + 1) + Math.sin((double) class26.field611[var13] / 100.0D * (double) class149.field3518[var13]) * (double) class43.field1002[var13]);
                if (var13 == 3) {
                    class143.field3351 = class143.field3351 + var16 & 0x7FF;
                }
                if (var13 == 1) {
                    class115.field2649 += var16;
                }
                if (var13 == 2) {
                    class140.field3248 += var16;
                }
                if (var13 == 4) {
                    class20.field433 += var16;
                    if (class20.field433 < 128) {
                        class20.field433 = 128;
                    }
                    if (class20.field433 > 383) {
                        class20.field433 = 383;
                    }
                }
                if (var13 == 0) {
                    class81.field1959 += var16;
                }
            }
        }
        int var14 = class103.field2398;
        int var15 = class84.field2032;
        if (var14 >= arg0 && arg0 + arg1 > var14 && arg4 <= var15 && var15 < arg4 + arg3) {
            class145.field3411 = class103.field2398 - arg0;
            class145.field3412 = class84.field2032 - arg4;
            class145.field3424 = true;
            class145.field3416 = 0;
        } else {
            class145.field3416 = 0;
            class145.field3424 = false;
        }
        class147.method1173((byte) 10);
        class19.method143(arg0, arg4, arg1, arg3, 0);
        class147.method1173((byte) 10);
        class119.field2703.method547(class81.field1959, class115.field2649, class140.field3248, class20.field433, class143.field3351, var7);
        class147.method1173((byte) 10);
        class119.field2703.method560();
        class20.method149(arg3, arg1, arg4, arg0, 256);
        class30.method246(arg4, (byte) -104, arg0);
        ((class13) class66.field1651).method97(class45.field1024, -128);
        class144.method1140(arg1, arg0, arg4, (byte) 78, arg3);
        class20.field433 = var12;
        class115.field2649 = var9;
        class140.field3248 = var10;
        class81.field1959 = var8;
        class143.field3351 = var11;
        if (class28.field681 && class71.method601(false, 2047, true) == 0) {
            class28.field681 = false;
        }
        if (class28.field681) {
            class19.method143(arg0, arg4, arg1, arg3, 0);
            class122.method964(class43.field991, -13897, false);
        }
        if (!class28.field681 && !class119.field2709 && arg0 <= var14 && arg0 + arg1 > var14 && arg4 <= var15 && var15 < arg3 + arg4) {
            class137.method1096(var15, arg0, 0, var14, arg4);
        }
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(II)Lvb;")
    public final class145 method961(int arg0, int arg1) {
        class145 var3 = (class145) class12.field283.method129((long) this.field2749, 24838);
        field2748++;
        if (var3 == null) {
            class112 var4 = class112.method925(client.field505, this.field2738, 0);
            if (var4 == null) {
                return null;
            }
            for (int var5 = 0; var5 < 6; var5++) {
                if (this.field2746[0] != 0) {
                    var4.method909(this.field2746[var5], this.field2747[var5]);
                }
            }
            var3 = var4.method921(this.field2760 + 64, this.field2744 + 850, -30, -50, -30);
            class12.field283.method128((byte) -79, var3, (long) this.field2749);
        }
        class145 var6;
        if (this.field2743 == -1 || arg0 == -1) {
            var6 = var3.method1151(true);
        } else {
            var6 = class141.method1121(this.field2743, -24732).method88(6, var3, arg0);
        }
        if (this.field2742 != 128 || this.field2754 != 128) {
            var6.method1142(this.field2742, this.field2754, this.field2742);
        }
        if (this.field2758 != 0) {
            if (this.field2758 == 90) {
                var6.method1150();
            }
            if (this.field2758 == 180) {
                var6.method1150();
                var6.method1150();
            }
            if (this.field2758 == 270) {
                var6.method1150();
                var6.method1150();
                var6.method1150();
            }
        }
        if (arg1 >= -19) {
            field2752 = null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "(B)I")
    private static final int method962(byte arg0) {
        field2745++;
        int var1 = 3;
        if (class20.field433 < 310) {
            int var2 = class81.field1959 >> 7;
            int var3 = class40.field936.field136 >> 7;
            int var4 = class140.field3248 >> 7;
            if ((class155.field3581[class155.field3598][var2][var4] & 0x4) != 0) {
                var1 = class155.field3598;
            }
            int var5 = class40.field936.field134 >> 7;
            int var6;
            if (var2 < var3) {
                var6 = var3 - var2;
            } else {
                var6 = var2 - var3;
            }
            int var7;
            if (var5 <= var4) {
                var7 = var4 - var5;
            } else {
                var7 = var5 - var4;
            }
            if (var7 < var6) {
                int var8 = 32768;
                int var9 = var7 * 65536 / var6;
                while (var2 != var3) {
                    if (var3 > var2) {
                        var2++;
                    } else if (var2 > var3) {
                        var2--;
                    }
                    var8 += var9;
                    if ((class155.field3581[class155.field3598][var2][var4] & 0x4) != 0) {
                        var1 = class155.field3598;
                    }
                    if (var8 >= 65536) {
                        if (var5 > var4) {
                            var4++;
                        } else if (var4 > var5) {
                            var4--;
                        }
                        var8 -= 65536;
                        if ((class155.field3581[class155.field3598][var2][var4] & 0x4) != 0) {
                            var1 = class155.field3598;
                        }
                    }
                }
            } else {
                int var10 = var6 * 65536 / var7;
                int var11 = 32768;
                while (var4 != var5) {
                    if (var4 < var5) {
                        var4++;
                    } else if (var5 < var4) {
                        var4--;
                    }
                    var11 += var10;
                    if ((class155.field3581[class155.field3598][var2][var4] & 0x4) != 0) {
                        var1 = class155.field3598;
                    }
                    if (var11 >= 65536) {
                        if (var2 < var3) {
                            var2++;
                        } else if (var3 < var2) {
                            var2--;
                        }
                        if ((class155.field3581[class155.field3598][var2][var4] & 0x4) != 0) {
                            var1 = class155.field3598;
                        }
                        var11 -= 65536;
                    }
                }
            }
        }
        if (arg0 <= 104) {
            field2762 = null;
        }
        if ((class155.field3581[class155.field3598][class40.field936.field136 >> 7][class40.field936.field134 >> 7] & 0x4) != 0) {
            var1 = class155.field3598;
        }
        return var1;
    }
}
