import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class440 {

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
    public static int field6073 = 0;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "Lcq;")
    public static class72 field6067 = new class72("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "[I")
    public static int[] field6074 = new int[2];

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "B")
    public byte field6068;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field6064;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public int field6065;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public static int field6071;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
    public static int field6072;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "Ljava/lang/String;")
    public String field6063;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "Ljava/lang/String;")
    public String field6066;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "Ljava/lang/String;")
    public String field6069;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "Ljava/lang/String;")
    public String field6070;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(BILnh;III)Ljava/awt/Frame;", line = 4)
    public static final Frame method2705(byte arg0, int arg1, class441 arg2, int arg3, int arg4, int arg5) {
        field6072++;
        if (!arg2.method2720(false)) {
            return null;
        }
        if (arg1 == 0) {
            class215[] var6 = class318.method1991(arg2, 29400);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field2656 == arg3 && var6[var8].field2657 == arg5 && (arg4 == 0 || var6[var8].field2653 == arg4) && (!var7 || var6[var8].field2660 > arg1)) {
                    var7 = true;
                    arg1 = var6[var8].field2660;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class315 var9 = arg2.method2728(arg5, arg4, arg3, arg1, -83);
        int var10 = -127 / ((17 - arg0) / 42);
        while (var9.field4244 == 0) {
            class219.method1330(10L, true);
        }
        Frame var11 = (Frame) var9.field4243;
        if (var11 == null) {
            return null;
        } else if (var9.field4244 == 2) {
            class53.method303(true, arg2, var11);
            return null;
        } else {
            return var11;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIIZ)V", line = 70)
    public static final void method2706(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field6064++;
        if (class347.field4722 == null) {
            class267.field3454.method739((byte) -125, -16777216, arg3, arg0, arg4, arg1);
            return;
        }
        class302.field4057++;
        if (class143.field1684 != null && class143.field1684.field1516 - (class143.field1684.method841(true) - 1) * 64 >> 7 == class90.field1043 && class143.field1684.field1514 + 64 - class143.field1684.method841(true) * 64 >> 7 == class249.field3276) {
            class90.field1043 = -1;
            class249.field3276 = -1;
            class57.method315((byte) 114);
        }
        class220.method1337(false);
        if (!arg5) {
            class276.method1739((byte) -27);
        }
        class35.method222((byte) -90);
        class345.method2196(arg4, arg1, arg0, true, true, arg3);
        int var6 = class367.field5012;
        int var7 = class269.field3473;
        int var8 = class229.field2926;
        int var9 = class204.field2465;
        if (class320.field4294 == 1) {
            int var10 = (int) class301.field4020;
            if (class91.field1069 >> 8 > var10) {
                var10 = class91.field1069 >> 8;
            }
            if (class310.field4187[4] && var10 < class449.field6282[4] + 128) {
                var10 = class449.field6282[4] + 128;
            }
            int var11 = (int) class434.field5929 + class301.field4019 & 0x3FFF;
            class397.method2454(class374.field5069, -26713, (var10 >> 3) * 3 + 600, class189.method1170(class143.field1684.field1514, class143.field1684.field1516, true, class43.field513) + -50, class277.field3583, var11, var7, var10);
        } else if (class320.field4294 == 4) {
            int var12 = (int) class301.field4020;
            if (class91.field1069 >> 8 > var12) {
                var12 = class91.field1069 >> 8;
            }
            if (class310.field4187[4] && class449.field6282[4] + 128 > var12) {
                var12 = class449.field6282[4] + 128;
            }
            int var13 = (int) class434.field5929 & 0x3FFF;
            class397.method2454(class374.field5069, arg2 - 26717, (var12 >> 3) * 3 + 600, class189.method1170(class347.field4725, class225.field2856, true, class43.field513) - 50, class277.field3583, var13, var7, var12);
        } else if (class320.field4294 == 5) {
            class304.method1934(var7, arg2 - 1);
        }
        int var14 = class287.field3784;
        int var15 = class51.field587;
        int var16 = class80.field979;
        int var17 = class178.field2081;
        int var18 = class433.field5912;
        for (int var19 = 0; var19 < 5; var19++) {
            if (class310.field4187[var19]) {
                int var22 = (int) ((double) (class255.field3312[var19] * 2 + 1) * Math.random() + Math.sin((double) class207.field2508[var19] / 100.0D * (double) class153.field1790[var19]) * (double) class449.field6282[var19] - (double) class255.field3312[var19]);
                if (var19 == 1) {
                    class51.field587 += var22;
                }
                if (var19 == 0) {
                    class287.field3784 += var22;
                }
                if (var19 == 2) {
                    class80.field979 += var22;
                }
                if (var19 == 3) {
                    class433.field5912 = class433.field5912 + var22 & 0x3FFF;
                }
                if (var19 == 4) {
                    class178.field2081 += var22;
                    if (class178.field2081 < 1024) {
                        class178.field2081 = 1024;
                    } else if (class178.field2081 > 3072) {
                        class178.field2081 = 3072;
                    }
                }
            }
        }
        if (class287.field3784 < 0) {
            class287.field3784 = 0;
        }
        if (((class43.field512 << 7) - 1) < class287.field3784) {
            class287.field3784 = (class43.field512 << 7) - 1;
        }
        if (class80.field979 < 0) {
            class80.field979 = 0;
        }
        if ((class262.field3367 << 7) - 1 < class80.field979) {
            class80.field979 = (class262.field3367 << 7) - 1;
        }
        class413.method2552(arg2 ^ 0xFFFFCF9A);
        class141.method912(true);
        class267.field3454.method774(var9, var6, var8 + var9, var6 - -var7);
        class267.field3454.method725();
        int var20 = class204.field2434;
        if (class451.field6298 == null) {
            class267.field3454.method728(var20);
        } else {
            class451.field6298.method449(var9, class178.field2081, var20, var8, -10571, var7, class267.field3454, class433.field5912, var6, class190.field2231 << 3);
        }
        class94.method589(-119);
        class179.field2092.method928(class287.field3784, class51.field587, class80.field979, -class178.field2081 & 0x3FFF, -class433.field5912 & 0x3FFF, -class127.field1417 & 0x3FFF);
        class267.field3454.method749(class179.field2092);
        class267.field3454.method790(var8 / 2 + var9, var7 / 2 + var6, class307.field4164 << 1, class307.field4164 << 1);
        class391.method2435(var7 / 2 + var6, var8 / 2 + var9, class307.field4164 << 1, 120, class307.field4164 << 1);
        class333.method2137(class287.field3784, -class433.field5912 & 0x3FFF, class80.field979, -class127.field1417 & 0x3FFF, class51.field587, -38, -class178.field2081 & 0x3FFF);
        byte var21 = class450.method2786(-126) == 2 ? (byte) class302.field4057 : 1;
        class220.method1338(class267.field3454, class106.field1273, class279.field3618, class179.field2092, class287.field3784, class51.field587, class80.field979, class183.field2126, class17.field188, class416.field5691, class336.field4584, class186.field2160, field6074, class43.field513 + 1, var21, class143.field1684.field1516 >> 7, class143.field1684.field1514 >> 7, !class40.field482);
        class94.method589(-121);
        if (class174.field2017 == 30) {
            class218.method1328(var7, 256, 14933, 256, var9, var6, var8);
            class356.method2252(var7, var9, var6, var8, 14527, 256, 256);
            class444.method2756(var6, var8, var9, 256, var7, 256, 99);
            class28.method174(var7, var9, var8, 111, var6);
        }
        if (arg2 != 4) {
            field6067 = null;
        }
        class394.method2446();
        class80.field979 = var16;
        class178.field2081 = var17;
        class433.field5912 = var18;
        class51.field587 = var15;
        class287.field3784 = var14;
        if (class219.field2710 && class235.field3094.method2378((byte) 55) == 0) {
            class219.field2710 = false;
        }
        if (class219.field2710) {
            class267.field3454.method739((byte) -125, -16777216, var9, var8, var6, var7);
            class190.method1179(0, class72.field894.method434(class373.field5057, arg2 ^ 0xFFFFE004), false, class55.field636);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V", line = 254)
    public static final void method2707(byte arg0) {
        if (class441.field6075 != 3) {
            class388.field5290 = -1;
        }
        field6071++;
        if (arg0 > -28) {
            field6074 = null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(III)Lqc;", line = 273)
    public static final class226 method2708(int arg0, int arg1, int arg2) {
        class316 var3 = class347.field4722[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4268;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(B)V", line = 288)
    public static void method2709(byte arg0) {
        field6067 = null;
        field6074 = null;
        if (arg0 != 69) {
            field6074 = null;
        }
    }
}
