import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class199 {

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public int field2761 = 0;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "Lsd;")
    public static class74 field2764 = new class74(55, 5);

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
    public static int field2769 = 0;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "Z")
    public static boolean field2770 = false;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "Z")
    public static volatile boolean field2772 = true;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lab;B)Z", line = 4)
    public static final boolean method1086(class256 arg0, byte arg1) {
        if (arg1 != 44) {
            method1093(53, -15, 77, (class415) null, (class280) null, 97);
        }
        field2767++;
        if (class48.field630 == arg0.field3591) {
            class432.field6253 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lvt;IZ)V", line = 24)
    private final void method1087(class179 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field2772 = false;
        }
        field2758++;
        if (arg1 == 5) {
            this.field2761 = arg0.method916(21933);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZIZIZ)V", line = 40)
    public static final void method1088(boolean arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        field2771++;
        if (!arg0 && class366.field5243 == arg3 && class312.field4565 == arg1 && class346.field4942 == class100.field1217 || class420.method2503((byte) 125)) {
            return;
        }
        class346.field4942 = class100.field1217;
        class312.field4565 = arg1;
        class366.field5243 = arg3;
        if (class420.method2503((byte) 97)) {
            class346.field4942 = 0;
        }
        if (arg2) {
            class404.method2413(false, 28);
        } else {
            class404.method2413(false, 25);
        }
        class291.method1835(true, class273.field3875, class154.field1854.method205((byte) 106, class68.field849), arg4);
        int var5 = class93.field1163;
        int var6 = class349.field5023;
        class93.field1163 = (class366.field5243 - (class159.field1895 >> 4)) * 8;
        class349.field5023 = (class312.field4565 - (class289.field4316 >> 4)) * 8;
        class283.field4116 = class429.method2570(class366.field5243 * 8, class312.field4565 * 8);
        class340.field4883 = null;
        int var7 = class93.field1163 - var5;
        int var8 = class349.field5023 - var6;
        if (arg2) {
            class356.field5112 = 0;
            int var12 = class159.field1895 * 128 - 128;
            int var13 = (class289.field4316 - 1) * 128;
            for (int var14 = 0; var14 < 32768; var14++) {
                class137 var19 = class448.field6366[var14];
                if (var19 != null) {
                    var19.field1008 -= var7 * 128;
                    var19.field1005 -= var8 * 128;
                    if (var19.field1008 >= 0 && var12 >= var19.field1008 && var19.field1005 >= 0 && var13 >= var19.field1005) {
                        boolean var20 = true;
                        for (int var21 = 0; var21 < 10; var21++) {
                            var19.field2539[var21] -= var7;
                            var19.field2536[var21] -= var8;
                            if (var19.field2539[var21] < 0 || var19.field2539[var21] >= class159.field1895 || var19.field2536[var21] < 0 || var19.field2536[var21] >= class289.field4316) {
                                var20 = false;
                            }
                        }
                        if (var20) {
                            class25.field353[class356.field5112++] = var14;
                        } else {
                            class448.field6366[var14].method651((byte) 123, (class476) null);
                            class448.field6366[var14] = null;
                        }
                    } else {
                        class448.field6366[var14].method651((byte) 124, (class476) null);
                        class448.field6366[var14] = null;
                    }
                }
            }
        } else {
            for (int var9 = 0; var9 < 32768; var9++) {
                class137 var10 = class448.field6366[var9];
                if (var10 != null) {
                    for (int var11 = 0; var11 < 10; var11++) {
                        var10.field2539[var11] -= var7;
                        var10.field2536[var11] -= var8;
                    }
                    var10.field1005 -= var8 * 128;
                    var10.field1008 -= var7 * 128;
                }
            }
        }
        for (int var15 = 0; var15 < 2048; var15++) {
            class198 var17 = class46.field596[var15];
            if (var17 != null) {
                for (int var18 = 0; var18 < 10; var18++) {
                    var17.field2539[var18] -= var7;
                    var17.field2536[var18] -= var8;
                }
                var17.field1008 -= var7 * 128;
                var17.field1005 -= var8 * 128;
            }
        }
        class323.method1973((byte) 70, var7, var8);
        for (class41 var16 = (class41) class56.field712.method802((byte) 107); var16 != null; var16 = (class41) class56.field712.method806((byte) 104)) {
            var16.field490 -= var8;
            var16.field495 -= var7;
            if (var16.field495 < 0 || var16.field490 < 0 || var16.field495 >= class159.field1895 || class289.field4316 <= var16.field490) {
                var16.method702((byte) -114);
            }
        }
        class221.field3084 = 0;
        if (class158.field1886 != 0) {
            class158.field1886 -= var7;
            class4.field52 -= var8;
        }
        if (arg2) {
            class19.field255 -= var7;
            class90.field1130 -= var7;
            class88.field1093 -= var8;
            class233.field3241 -= var8;
            class58.field734 -= var7 * 128;
            class351.field5047 -= var8 * 128;
            if (Math.abs(var7) > class159.field1895 || Math.abs(var8) > class289.field4316) {
                class347.method2099((byte) -120);
            }
        } else if (class358.field5167 == 4) {
            class255.field3554 -= var7 * 128;
            class369.field5280 -= var8 * 128;
            class186.field2445 -= var8 * 128;
            class191.field2617 -= var7 * 128;
        } else {
            class358.field5167 = 1;
        }
        class423.method2521((byte) -102);
        class255.method1567(-1);
        class361.field5198.method813(0);
        class270.field3868.method813(0);
        class192.field2648.method2343(0);
        class47.method250((byte) 127);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)I", line = 250)
    public static final int method1089(int arg0, int arg1) {
        field2759++;
        if (arg0 > -94) {
            method1091(true);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)Lpi;", line = 261)
    public static final class239 method1090(int arg0, int arg1) {
        field2763++;
        if (class470.field6631 && arg1 >= class345.field4935 && arg1 <= class148.field1792) {
            if (arg0 != 128) {
                method1093(-112, -44, 33, (class415) null, (class280) null, 49);
            }
            return class427.field6158[arg1 - class345.field4935];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V", line = 277)
    public static void method1091(boolean arg0) {
        field2764 = null;
        if (!arg0) {
            method1089(118, -114);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLvt;)V", line = 287)
    public final void method1092(byte arg0, class179 arg1) {
        field2760++;
        while (true) {
            int var3 = arg1.method895((byte) -74);
            if (var3 == 0) {
                int var4 = -53 % ((arg0 - 65) / 55);
                return;
            }
            this.method1087(arg1, var3, true);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIILcu;Loj;I)V", line = 317)
    public static final void method1093(int arg0, int arg1, int arg2, class415 arg3, class280 arg4, int arg5) {
        field2765++;
        class417 var6 = class44.field568.method1311((byte) 0, arg3.field5932);
        if (var6.field6005 == -1) {
            return;
        }
        int var8;
        if (arg3.field5973) {
            int var7 = arg3.field5986 + arg1;
            var8 = var7 & 0x3;
        } else {
            var8 = 0;
        }
        class395 var9 = var6.method2483(var8, 177437555, arg4, arg3.field5976);
        if (var9 == null) {
            return;
        }
        int var10 = arg3.field5939;
        int var11 = arg3.field5927;
        if ((var8 & 0x1) == 1) {
            var10 = arg3.field5927;
            var11 = arg3.field5939;
        }
        int var12 = var9.method216();
        int var13 = var9.method222();
        if (var6.field6013) {
            var13 = var11 * 4;
            var12 = var10 * 4;
        }
        if (var6.field6008 == 0) {
            var9.method2364(arg2, arg0 + 4 - (var11 * 4), var12, var13);
        } else {
            var9.method225(arg2, arg0 - ((var11 - 1) * 4), var12, var13, 1, var6.field6008 | 0xFF000000, 1);
        }
        if (arg5 <= 120) {
            method1086((class256) null, (byte) -90);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V", line = 382)
    public static final void method1094(byte arg0) {
        if (arg0 != -47) {
            return;
        }
        if (class460.field6501 != null) {
            class460.field6501.method2646((byte) -89);
        }
        field2762++;
        if (class46.field594 != null) {
            class46.field594.method2646((byte) -89);
        }
    }
}
