import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class248 {

    @OriginalMember(owner = "client!id", name = "a", descriptor = "[Z")
    public static boolean[] field3650 = new boolean[8];

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field3652 = 0;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field3659 = 0;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "[B")
    public static byte[] field3657;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILfp;)V", line = 4)
    public static final void method1643(int arg0, class9 arg1) {
        field3656++;
        int var2 = class427.field6215;
        int var3 = class441.field6420;
        int var4 = class466.field6860;
        int var5 = class130.field1732;
        int var6 = -10660793;
        arg1.method150(-104, var3, var2, var5, var6, var4);
        arg1.method150(-90, var3 + 1, var2 - -1, 16, -16777216, var4 - 2);
        arg1.method88(var5 - 19, var2 - -1, -16777216, var4 - 2, var3 + 18, -101);
        class111.field1540.method565(-1, 9865, var3 + 14, class42.field565.method2543(false, class153.field2073), var6, var2 + 3);
        int var7 = class223.field3295.method411(0);
        int var8 = class223.field3295.method415(-110);
        int var9 = 0;
        for (class375 var10 = (class375) class138.field1885.method2478(1603); var10 != null; var10 = (class375) class138.field1885.method2486((byte) -82)) {
            int var11 = (class237.field3532 - var9 - 1) * 16 + var3 + 31;
            short var12 = -1;
            if (var7 > var2 && (var2 + var4) > var7 && (var11 - 13) < var8 && (var11 + 3) > var8 && var10.field5478) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class411.method2553(2661, var10.field5469)) {
                var13 = class157.field2119.method176((byte) -72, (int) var10.field5480).field6203;
            } else if (class275.method1878(4, var10.field5469)) {
                class26 var16 = class364.field5260[(int) var10.field5480];
                if (var16 != null) {
                    class327 var17 = var16.field369;
                    if (var17.field4871 != null) {
                        var17 = var17.method2139(true);
                    }
                    if (var17 != null) {
                        var13 = var17.field4815;
                    }
                }
            } else if (class29.method295(16565, var10.field5469)) {
                Object var14 = null;
                class178 var15;
                if (var10.field5469 == 1006) {
                    var15 = class450.method2785((int) var10.field5480, (byte) 118);
                } else {
                    var15 = class450.method2785((int) (var10.field5480 >>> 32 & 0x7FFFFFFFL), (byte) 92);
                }
                if (var15.field2489 != null) {
                    var15 = var15.method1240((byte) -116);
                }
                if (var15 != null) {
                    var13 = var15.field2509;
                }
            }
            String var18 = class265.method1827(var10, true);
            if (var13 != null) {
                var18 = var18 + class447.method2750((byte) -72, var13);
            }
            class111.field1540.method573(var11, var18, class214.field3022, var2 + 3, -126, 0, class77.field979, var12);
            var9++;
            if (var10.field5470) {
                class226.field3383.method1915(var2 + class233.field3502.method2333(-122, var18) + 5, var11 + -12);
            }
        }
        class436.method2685(class441.field6420, 13435, class427.field6215, class466.field6860, class130.field1732);
        if (arg0 != 29725) {
            method1651((byte) -32);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/lang/Object;BZ)[B", line = 109)
    public static final byte[] method1644(Object arg0, byte arg1, boolean arg2) {
        field3653++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg2 ? class455.method2821(var3, 47) : var3;
        } else if (arg0 instanceof class240) {
            class240 var4 = (class240) arg0;
            return var4.method1617((byte) -46);
        } else if (arg1 > -80) {
            return null;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIJ)V", line = 153)
    public static final void method1645(int arg0, int arg1, int arg2, long arg3) {
        field3654++;
        int var5 = (int) arg3 >> 14 & 0x1F;
        int var6 = ((int) arg3 & 0x30684C) >> 20;
        if (arg1 != 23907104) {
            return;
        }
        int var7 = (int) (arg3 >>> 32) & Integer.MAX_VALUE;
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class35.method329(0, arg2, var5, 0, true, arg0, class187.field2619.field793[0], 0, var6, class187.field2619.field784[0], 111);
            return;
        }
        class178 var8 = class450.method2785(var7, (byte) 118);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var9 = var8.field2476;
            var10 = var8.field2533;
        } else {
            var9 = var8.field2533;
            var10 = var8.field2476;
        }
        int var11 = var8.field2497;
        if (var6 != 0) {
            var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
        }
        class35.method329(var11, arg2, 0, var10, true, arg0, class187.field2619.field793[0], var9, 0, class187.field2619.field784[0], 14);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 196)
    public static final int method1646(String arg0, byte arg1) {
        int var2 = 27 % ((arg1 - 15) / 53);
        field3651++;
        return arg0.length() + 1;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lfp;Lje;III)V", line = 210)
    public static final void method1647(class9 arg0, class309 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class329.field4899) {
            class369 var5 = class178.field2530[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field5346 != null && var5.field5346.method34((byte) -114)) {
                arg1.method32(arg0, var5.field5346, true, 0, class100.field1271, -90, 0);
            }
        }
        if (arg4 < class329.field4899) {
            class369 var6 = class178.field2530[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field5346 != null && var6.field5346.method34((byte) 102)) {
                arg1.method32(arg0, var6.field5346, true, 0, 0, -61, class100.field1271);
            }
        }
        if (arg3 < class329.field4899 && arg4 < class380.field5590) {
            class369 var7 = class178.field2530[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field5346 != null && var7.field5346.method34((byte) -127)) {
                arg1.method32(arg0, var7.field5346, true, 0, class100.field1271, -62, class100.field1271);
            }
        }
        if (arg3 < class329.field4899 && arg4 > 0) {
            class369 var8 = class178.field2530[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field5346 != null && var8.field5346.method34((byte) 92)) {
                arg1.method32(arg0, var8.field5346, true, 0, class100.field1271, -89, -class100.field1271);
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BLkg;)Lkg;", line = 260)
    public static final class223 method1648(byte arg0, class223 arg1) {
        field3658++;
        if (arg1.field3319 != -1) {
            return class432.method2655((byte) -90, arg1.field3319);
        }
        int var2 = arg1.field3223 >>> 16;
        if (arg0 > -127) {
            method1646((String) null, (byte) 66);
        }
        class22 var3 = new class22(class252.field3703);
        for (class182 var4 = (class182) var3.method242(0); var4 != null; var4 = (class182) var3.method240((byte) -104)) {
            if (var4.field2564 == var2) {
                return class432.method2655((byte) -73, (int) var4.field3907);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)Z", line = 290)
    public static final boolean method1649(int arg0) {
        field3660++;
        try {
            if (class82.field1008 == 2) {
                if (class195.field2752 == null) {
                    class195.field2752 = class156.method1058(class286.field4209, class67.field897, class71.field928);
                    if (class195.field2752 == null) {
                        return false;
                    }
                }
                if (class270.field4005 == null) {
                    class270.field4005 = new class124(class346.field5096, class154.field2077);
                }
                if (class456.field6750.method2777(22050, class269.field3996, false, class270.field4005, class195.field2752)) {
                    class456.field6750.method2767((byte) 126);
                    class456.field6750.method2764(9411, class316.field4628);
                    class456.field6750.method2792((byte) -53, class195.field2752, class169.field2214);
                    class270.field4005 = null;
                    class286.field4209 = null;
                    class195.field2752 = null;
                    class82.field1008 = 0;
                    return true;
                }
            }
            if (arg0 >= -11) {
                field3657 = null;
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class456.field6750.method2772(-91);
            class286.field4209 = null;
            class195.field2752 = null;
            class270.field4005 = null;
            class82.field1008 = 0;
        }
        return false;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V", line = 340)
    public static final void method1650(byte arg0) {
        class363 var1 = class124.field1645;
        synchronized (class124.field1645) {
            class124.field1645.method2313(94);
        }
        int var2 = 44 % ((arg0 - 38) / 53);
        field3655++;
        class363 var3 = class165.field2180;
        synchronized (class165.field2180) {
            class165.field2180.method2313(127);
        }
        class363 var4 = class459.field6785;
        synchronized (class459.field6785) {
            class459.field6785.method2313(108);
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(B)V", line = 365)
    public static void method1651(byte arg0) {
        if (arg0 != 14) {
            method1647((class9) null, (class309) null, 91, -70, 27);
        }
        field3650 = null;
        field3657 = null;
    }
}
