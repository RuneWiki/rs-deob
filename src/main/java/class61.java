import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class61 {

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "[I")
    public static int[] field1095 = new int[2500];

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "Z")
    public static boolean field1105 = false;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "Lid;")
    public static class149 field1094 = class60.method382(")4j", (byte) 8);

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "[Lqk;")
    public static class208[] field1101;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "[Loa;")
    public static class99[] field1096;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static void method383(int arg0) {
        field1094 = null;
        field1101 = null;
        field1096 = null;
        field1095 = null;
        if (arg0 != 0) {
            method386(45, 24L);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IBIII)V")
    public static final void method384(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        class72.method461(arg0, arg2, arg0 + arg4, arg2 + arg3);
        class72.method459(arg0, arg2, arg4, arg3, 0);
        field1103++;
        if (class260.field4581 < 100) {
            return;
        }
        if (class24.field356 == null || class24.field356.field3399 != arg4 || class24.field356.field3398 != arg3) {
            class46 var5 = new class46(arg4, arg3);
            class72.method460(var5.field693, arg4, arg3);
            class64.method402(arg4, 0, class62.field1121, arg3, class287.field5086, 0, 0, 0, (byte) -70);
            class24.field356 = var5;
            class226.field3970.method1895(arg1 - 20);
        }
        class24.field356.method276(arg0, arg2);
        int var6 = class194.field3486 * arg3 / class287.field5086 + arg2;
        if (arg1 != 20) {
            return;
        }
        int var7 = class60.field1083 * arg4 / class62.field1121;
        int var8 = arg0 + (class67.field1178 * arg4 / class62.field1121);
        int var9 = class279.field4979 * arg3 / class287.field5086;
        int var10 = 16711680;
        if (class245.field4306 == 1) {
            var10 = 16777215;
        }
        class72.method462(var8, var6, var7, var9, var10, 128);
        class72.method457(var8, var6, var7, var9, var10);
        if (class118.field2030 <= 0) {
            return;
        }
        int var11;
        if (class11.field162 > 10) {
            var11 = 500 - (class11.field162 * 25);
        } else {
            var11 = class11.field162 * 25;
        }
        for (class258 var12 = (class258) class281.field4995.method1140(0); var12 != null; var12 = (class258) class281.field4995.method1127(0)) {
            if (class195.field3502 == var12.field4508) {
                int var13 = var12.field4520 * arg4 / class62.field1121 + arg0;
                int var14 = arg2 + (var12.field4515 * arg3 / class287.field5086);
                class72.method462(var13 - 2, var14 + -2, 4, 4, 16776960, var11);
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)[Lvc;")
    public static final class190[] method385(byte arg0) {
        field1102++;
        class190[] var1 = new class190[class84.field1528];
        if (arg0 != -62) {
            return null;
        }
        for (int var2 = 0; var2 < class84.field1528; var2++) {
            int var3 = class55.field991[var2] * class283.field5005[var2];
            byte[] var4 = class73.field1276[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class108.field1865[class136.method953(255, var4[var6])];
            }
            var1[var2] = new class46(class251.field4406, class286.field5082, class147.field2651[var2], class18.field259[var2], class283.field5005[var2], class55.field991[var2], var5);
        }
        class103.method731(false);
        return var1;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IJ)V")
    public static final void method386(int arg0, long arg1) {
        field1100++;
        if (arg1 == 0L || arg0 > -89) {
            return;
        }
        for (int var3 = 0; var3 < class49.field892; var3++) {
            if (class87.field1589[var3] == arg1) {
                class27.field405++;
                class49.field892--;
                for (int var4 = var3; var4 < class49.field892; var4++) {
                    class217.field3822[var4] = class217.field3822[var4 + 1];
                    class64.field1139[var4] = class64.field1139[var4 + 1];
                    class213.field3771[var4] = class213.field3771[var4 + 1];
                    class87.field1589[var4] = class87.field1589[var4 + 1];
                    class94.field1656[var4] = class94.field1656[var4 + 1];
                    class116.field1984[var4] = class116.field1984[var4 + 1];
                }
                class38.field562 = class90.field1606;
                class208.field3720.method162(2, 57);
                class208.field3720.method496(2, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLgd;)V")
    public static final void method387(byte arg0, class74 arg1) {
        int var2 = -43 % ((arg0 - 45) / 62);
        field1104++;
        while (true) {
            while (arg1.field1321.length > arg1.field1340) {
                boolean var3 = false;
                int var4 = 0;
                int var5 = 0;
                if (arg1.method489((byte) 78) == 1) {
                    var5 = arg1.method489((byte) 94);
                    var3 = true;
                    var4 = arg1.method489((byte) -67);
                }
                int var6 = arg1.method489((byte) -112);
                int var7 = arg1.method489((byte) 90);
                int var8 = var6 * 64 - class80.field1480;
                int var9 = class91.field1615 + class287.field5086 - (var7 * 64) - 1;
                if (var8 >= 0 && var9 - 63 >= 0 && (var8 + 63) < class62.field1121 && class287.field5086 > var9) {
                    int var10 = var8 >> 6;
                    int var11 = var9 >> 6;
                    for (int var12 = 0; var12 < 64; var12++) {
                        for (int var13 = 0; var13 < 64; var13++) {
                            if (!var3 || var5 * 8 <= var12 && var12 < var5 * 8 + 8 && var13 >= (var4 * 8) && var4 * 8 + 8 > var13) {
                                byte var14 = arg1.method514((byte) 1);
                                if (var14 != 0) {
                                    if (class228.field3992[var10][var11] == null) {
                                        class228.field3992[var10][var11] = new byte[4096];
                                    }
                                    class228.field3992[var10][var11][(63 - var13 << 6) + var12] = var14;
                                    byte var15 = arg1.method514((byte) 1);
                                    if (class240.field4192[var10][var11] == null) {
                                        class240.field4192[var10][var11] = new byte[4096];
                                    }
                                    class240.field4192[var10][var11][(63 - var13 << 6) + var12] = var15;
                                }
                            }
                        }
                    }
                } else {
                    for (int var16 = 0; var16 < (var3 ? 64 : 4096); var16++) {
                        byte var17 = arg1.method514((byte) 1);
                        if (var17 != 0) {
                            arg1.field1340++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
    public static final void method388(int arg0) {
        while (true) {
            if (class11.field150.method164(class68.field1188, 113) >= 27) {
                int var1 = class11.field150.method154((byte) 9, 15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class38.field572[var1] == null) {
                        var2 = true;
                        class38.field572[var1] = new class20();
                    }
                    class20 var3 = class38.field572[var1];
                    class110.field1906[class182.field3281++] = var1;
                    var3.field2403 = class118.field2022;
                    if (var3.field296 != null && var3.field296.method372((byte) 34)) {
                        class163.method1197(-121, var3);
                    }
                    int var4 = class11.field150.method154((byte) 9, 1);
                    int var5 = class163.field3023[class11.field150.method154((byte) 9, 3)];
                    if (var2) {
                        var3.field2335 = var3.field2354 = var5;
                    }
                    int var6 = class11.field150.method154((byte) 9, 1);
                    if (var6 == 1) {
                        class255.field4462[class162.field3013++] = var1;
                    }
                    int var7 = class11.field150.method154((byte) 9, 5);
                    var3.method115((byte) -51, class98.method712(class11.field150.method154((byte) 9, 14), arg0 ^ 0x4A6F));
                    int var8 = class11.field150.method154((byte) 9, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.method925(0, var3.field296.field1049);
                    var3.field2305 = var3.field296.field1029;
                    var3.field2342 = var3.field296.field1027;
                    if (var3.field2305 == 0) {
                        var3.field2354 = 0;
                    }
                    var3.method921(var3.method885((byte) -77), class77.field1449.field2400[0] + var7, (byte) 4, class77.field1449.field2333[0] + var8, var4 == 1);
                    if (var3.field296.method372((byte) 48)) {
                        class185.method1275(var3.field2400[0], (class268) null, 128, class277.field4948, (class127) null, var3.field2333[0], var3, 0);
                    }
                    continue;
                }
            }
            class11.field150.method159(0);
            if (arg0 != -18961) {
                field1095 = null;
            }
            field1093++;
            return;
        }
    }
}
