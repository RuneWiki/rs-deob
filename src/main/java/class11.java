import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class11 extends class244 {

    @OriginalMember(owner = "client!lg", name = "db", descriptor = "Z")
    public static boolean field149 = false;

    @OriginalMember(owner = "client!lg", name = "gb", descriptor = "Ljava/lang/String;")
    public static String field152 = "Loaded world list data";

    @OriginalMember(owner = "client!lg", name = "hb", descriptor = "J")
    public static long field153 = 0L;

    @OriginalMember(owner = "client!lg", name = "kb", descriptor = "Z")
    public static boolean field156 = false;

    @OriginalMember(owner = "client!lg", name = "nb", descriptor = "I")
    public static int field159 = -1;

    @OriginalMember(owner = "client!lg", name = "bb", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!lg", name = "cb", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!lg", name = "eb", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!lg", name = "fb", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!lg", name = "ib", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!lg", name = "jb", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!lg", name = "lb", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!lg", name = "mb", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!lg", name = "ob", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(B)V")
    public static final void method71(byte arg0) {
        ++field148;
        for (int var1 = 0; ~class153.field2497 < ~var1; ++var1) {
            int var10002 = class194.field3171[var1]--;
            if (class194.field3171[var1] >= -10) {
                class280 var3 = class92.field1447[var1];
                if (var3 == null) {
                    var3 = class280.method1881(class205.field3300, class286.field4555[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class194.field3171[var1] += var3.method1884();
                    class92.field1447[var1] = var3;
                }
                if (~class194.field3171[var1] > -1) {
                    int var4;
                    if (class116.field1959[var1] == 0) {
                        var4 = class70.field1175[var1] * class77.field1287 >> 8;
                    } else {
                        int var5 = (255 & class116.field1959[var1]) * 128;
                        int var6 = (class116.field1959[var1] & 65532) >> 8;
                        int var7 = (class116.field1959[var1] & 16752630) >> 16;
                        int var8 = var7 * 128 + -class48.field878.field2849 + 64;
                        if (~var8 > -1) {
                            var8 = -var8;
                        }
                        int var9 = var6 * 128 + 64 - class48.field878.field2887;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var8 - 128 + var9;
                        if (~var10 < ~var5) {
                            class194.field3171[var1] = -100;
                            continue;
                        }
                        if (~var10 > -1) {
                            var10 = 0;
                        }
                        var4 = class70.field1175[var1] * class111.field1719 * (-var10 + var5) / var5 >> 8;
                    }
                    if (var4 > 0) {
                        class86 var11 = var3.method1883().method680(class137.field2310);
                        class221 var12 = class221.method1479(var11, 100, var4);
                        var12.method1485(class4.field60[var1] - 1);
                        class145.field2394.method1240(var12);
                    }
                    class194.field3171[var1] = -100;
                }
            } else {
                --class153.field2497;
                for (int var2 = var1; class153.field2497 > var2; ++var2) {
                    class286.field4555[var2] = class286.field4555[var2 + 1];
                    class92.field1447[var2] = class92.field1447[var2 + 1];
                    class4.field60[var2] = class4.field60[var2 + 1];
                    class194.field3171[var2] = class194.field3171[var2 + 1];
                    class116.field1959[var2] = class116.field1959[var2 + 1];
                    class70.field1175[var2] = class70.field1175[var2 + 1];
                }
                --var1;
            }
        }
        if (arg0 > -29) {
            method77(false, -1);
        }
        if (class178.field2968 && !class189.method1302((byte) -21)) {
            if (~class274.field4382 != -1 && ~class235.field3726 != 0) {
                class31.method269(class10.field134, 0, class274.field4382, class235.field3726, 0, false);
            }
            class178.field2968 = false;
        } else if (~class274.field4382 != -1 && ~class235.field3726 != 0 && !class189.method1302((byte) -21)) {
            ++class239.field3764;
            class87.field1405.method607(122, (byte) 75);
            class87.field1405.method1029(class235.field3726, 15430);
            class235.field3726 = -1;
        }
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(Z)V")
    public static final void method72(boolean arg0) {
        if (class94.field1462 < 0) {
            class80.field1326 = -1;
            client.field4564 = -1;
            class94.field1462 = 0;
        }
        ++field155;
        if (~class159.field2574 > ~class94.field1462) {
            class80.field1326 = -1;
            class94.field1462 = class159.field2574;
            client.field4564 = -1;
        }
        if (!arg0) {
            if (~class22.field343 > -1) {
                class22.field343 = 0;
                class80.field1326 = -1;
                client.field4564 = -1;
            }
            if (~class31.field524 > ~class22.field343) {
                class22.field343 = class31.field524;
                class80.field1326 = -1;
                client.field4564 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)[[I")
    public final int[][] method3(int arg0, int arg1) {
        if (arg0 < 122) {
            this.method3(-98, -125);
        }
        ++field158;
        int[][] var3 = super.field4357.method1949(true, arg1);
        if (super.field4357.field4631 && this.method1622(0)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field3851 * super.field3851;
            for (int var8 = 0; class26.field458 > var8; ++var8) {
                int var9 = super.field3847[var8 % super.field3849 + var7];
                var6[var8] = class64.method498(var9, 255) << 4;
                var5[var8] = class64.method498(var9 >> 4, 4080);
                var4[var8] = class64.method498(var9, 16711680) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIIIZ)V")
    public static final void method73(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        ++field151;
        int var8 = arg2 + arg3;
        if (arg7) {
            field157 = 81;
        }
        for (int var9 = arg2; var8 > var9; ++var9) {
            class224.method1504(arg1, arg6, arg5, class114.field1841[var9], 7);
        }
        int var10 = arg3 + arg5;
        int var11 = arg4 - arg3;
        int var12 = -arg3 + arg6;
        for (int var13 = arg4; var11 < var13; --var13) {
            class224.method1504(arg1, arg6, arg5, class114.field1841[var13], 7);
        }
        for (int var14 = var8; ~var14 >= ~var11; ++var14) {
            int[] var15 = class114.field1841[var14];
            class224.method1504(arg1, var10, arg5, var15, 7);
            class224.method1504(arg0, var12, var10, var15, 7);
            class224.method1504(arg1, arg6, var12, var15, 7);
        }
    }

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "(I)V")
    public static void method74(int arg0) {
        if (arg0 != 100) {
            field153 = 91L;
        }
        field152 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BI)V")
    public static final void method75(byte arg0, int arg1) {
        ++field154;
        class127.field2095.method1163(arg1, false);
        if (arg0 != 21) {
            field156 = true;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BLhb;Lhb;)V")
    public static final void method76(byte arg0, class146 arg1, class146 arg2) {
        if (arg0 == 83) {
            ++field160;
            if (arg1.field2405 != null) {
                arg1.method1074((byte) -117);
            }
            arg1.field2405 = arg2.field2405;
            arg1.field2407 = arg2;
            arg1.field2405.field2407 = arg1;
            arg1.field2407.field2405 = arg1;
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(ZI)V")
    public static final void method77(boolean arg0, int arg1) {
        if (arg1 > -96) {
            field147 = 13;
        }
        for (class132 var2 = (class132) class139.field2329.method1807(-103); var2 != null; var2 = (class132) class139.field2329.method1808((byte) 121)) {
            if (var2.field2205 != null) {
                class145.field2394.method1242(var2.field2205);
                var2.field2205 = null;
            }
            if (var2.field2199 != null) {
                class145.field2394.method1242(var2.field2199);
                var2.field2199 = null;
            }
            var2.method1074((byte) -116);
        }
        if (arg0) {
            for (class132 var3 = (class132) class238.field3755.method1807(-103); var3 != null; var3 = (class132) class238.field3755.method1808((byte) 103)) {
                if (var3.field2205 != null) {
                    class145.field2394.method1242(var3.field2205);
                    var3.field2205 = null;
                }
                var3.method1074((byte) 77);
            }
            for (class132 var4 = (class132) class269.field4315.method1062(-127); var4 != null; var4 = (class132) class269.field4315.method1059(-14608)) {
                if (var4.field2205 != null) {
                    class145.field2394.method1242(var4.field2205);
                    var4.field2205 = null;
                }
                var4.method1074((byte) -33);
            }
        }
        ++field150;
    }
}
