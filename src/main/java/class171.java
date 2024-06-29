import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class171 extends class293 {

    @OriginalMember(owner = "client!im", name = "bb", descriptor = "Z")
    public static boolean field2989 = false;

    @OriginalMember(owner = "client!im", name = "ab", descriptor = "Ltb;")
    public static class210 field2988 = new class210(16);

    @OriginalMember(owner = "client!im", name = "fb", descriptor = "Lmh;")
    public static class128 field2993 = class22.method156(122, "Speicher wird zugewiesen)3");

    @OriginalMember(owner = "client!im", name = "eb", descriptor = "Lmh;")
    public static class128 field2992 = class22.method156(122, "(U4");

    @OriginalMember(owner = "client!im", name = "jb", descriptor = "Lmh;")
    public static class128 field2997 = class22.method156(124, "scrollen:");

    @OriginalMember(owner = "client!im", name = "ib", descriptor = "[I")
    public static int[] field2996 = new int[200];

    @OriginalMember(owner = "client!im", name = "kb", descriptor = "Lmh;")
    public static class128 field2998 = class22.method156(123, "blinken3:");

    @OriginalMember(owner = "client!im", name = "P", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!im", name = "V", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!im", name = "Y", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!im", name = "Z", descriptor = "I")
    public int field2987;

    @OriginalMember(owner = "client!im", name = "cb", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!im", name = "db", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!im", name = "lb", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!im", name = "gb", descriptor = "Lek;")
    public static class174 field2994;

    @OriginalMember(owner = "client!im", name = "X", descriptor = "Lqe;")
    public class177 field2985;

    @OriginalMember(owner = "client!im", name = "hb", descriptor = "Ldj;")
    public static class314 field2995;

    @OriginalMember(owner = "client!im", name = "W", descriptor = "[B")
    public byte[] field2984;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IILaj;ZII)V", line = 5)
    public static final void method1143(int arg0, int arg1, class1 arg2, boolean arg3, int arg4, int arg5) {
        field2982++;
        if (class295.field5039 >= 50 || arg2.field9 == null || arg4 >= arg2.field9.length || arg2.field9[arg4] == null) {
            return;
        }
        int var6 = arg2.field9[arg4][0];
        int var7 = var6 >> 8;
        int var8 = var6 >> 4 & 0x7;
        if (arg2.field9[arg4].length > 1) {
            int var9 = (int) ((double) arg2.field9[arg4].length * Math.random());
            if (var9 > 0) {
                var7 = arg2.field9[arg4][var9];
            }
        }
        int var10 = var6 & 0xF;
        if (var10 == 0) {
            if (arg3) {
                class218.method1510(var8, var7, false, 0);
            }
        } else if (class158.field2699 != 0) {
            int var11 = -122 / ((arg1 - 69) / 46);
            int var12 = (arg5 - 64) / 128;
            class147.field2537[class295.field5039] = var7;
            class176.field3102[class295.field5039] = var8;
            class193.field3338[class295.field5039] = 0;
            class254.field4375[class295.field5039] = null;
            int var13 = (arg0 - 64) / 128;
            class255.field4396[class295.field5039] = (var12 << 16) + (var13 << 8) + var10;
            class295.field5039++;
        }
    }

    @OriginalMember(owner = "client!im", name = "e", descriptor = "(I)[B", line = 63)
    public final byte[] method1144(int arg0) {
        field2983++;
        if (this.field5018) {
            throw new RuntimeException();
        }
        if (arg0 != 100) {
            field2997 = (class128) null;
        }
        return this.field2984;
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(B)V", line = 82)
    public static void method1145(byte arg0) {
        field2988 = null;
        field2995 = null;
        field2997 = null;
        if (arg0 > -13) {
            method1143(-88, -35, (class1) null, false, -90, 0);
        }
        field2996 = null;
        field2993 = null;
        field2998 = null;
        field2992 = null;
        field2994 = null;
    }

    @OriginalMember(owner = "client!im", name = "d", descriptor = "(I)I", line = 102)
    public final int method1146(int arg0) {
        field2999++;
        if (arg0 == 0) {
            return this.field5018 ? 0 : 100;
        } else {
            return -41;
        }
    }

    @OriginalMember(owner = "client!im", name = "f", descriptor = "(I)V", line = 118)
    public static final void method1147(int arg0) {
        class164.field2818.method1832((byte) 107);
        field2986++;
        if (arg0 != -105) {
            field2995 = (class314) null;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIIIZ)V", line = 129)
    public static final void method1148(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field2990++;
        if (class164.field2825 == arg4 && class51.field1010 == arg5 && class281.field4855 == arg2 || class117.method702(true)) {
            return;
        }
        class164.field2825 = arg4;
        class281.field4855 = arg2;
        class51.field1010 = arg5;
        if (class117.method702(true)) {
            class281.field4855 = 0;
        }
        if (arg6) {
            class298.method2039((byte) -52, 28);
        } else {
            class298.method2039((byte) -52, 25);
        }
        class309.method2107(class32.field706, true, -23465);
        int var7 = class4.field72;
        if (arg3 < 26) {
            method1149(true, -90);
        }
        int var8 = class221.field3889;
        class221.field3889 = (arg4 - 6) * 8;
        class4.field72 = arg5 * 8 - 48;
        class297.field5065 = class257.method1807(-14, class51.field1010 * 8, class164.field2825 * 8);
        int var9 = class221.field3889 - var8;
        class144.field2470 = null;
        int var10 = class221.field3889;
        int var11 = class4.field72 - var7;
        int var12 = class4.field72;
        if (arg6) {
            class37.field749 = 0;
            for (int var16 = 0; var16 < 32768; var16++) {
                class115 var17 = class201.field3560[var16];
                if (var17 != null) {
                    var17.field478 -= var9 * 128;
                    var17.field418 -= var11 * 128;
                    if (var17.field478 >= 0 && var17.field478 <= 13184 && var17.field418 >= 0 && var17.field418 <= 13184) {
                        for (int var18 = 0; var18 < 10; var18++) {
                            var17.field450[var18] -= var9;
                            var17.field422[var18] -= var11;
                        }
                        class39.field839[class37.field749++] = var16;
                    } else {
                        class201.field3560[var16].field1934 = null;
                        class201.field3560[var16] = null;
                    }
                }
            }
        } else {
            for (int var13 = 0; var13 < 32768; var13++) {
                class115 var14 = class201.field3560[var13];
                if (var14 != null) {
                    for (int var15 = 0; var15 < 10; var15++) {
                        var14.field450[var15] -= var9;
                        var14.field422[var15] -= var11;
                    }
                    var14.field418 -= var11 * 128;
                    var14.field478 -= var9 * 128;
                }
            }
        }
        for (int var19 = 0; var19 < 2048; var19++) {
            class123 var20 = class140.field2405[var19];
            if (var20 != null) {
                for (int var21 = 0; var21 < 10; var21++) {
                    var20.field450[var21] -= var9;
                    var20.field422[var21] -= var11;
                }
                var20.field478 -= var9 * 128;
                var20.field418 -= var11 * 128;
            }
        }
        class133.field2315 = arg2;
        class163.field2796.method750(arg1, false, -65536, arg0);
        byte var22 = 0;
        byte var23 = 104;
        byte var24 = 1;
        byte var25 = 0;
        if (var9 < 0) {
            var24 = -1;
            var23 = -1;
            var22 = 103;
        }
        byte var26 = 1;
        byte var27 = 104;
        if (var11 < 0) {
            var26 = -1;
            var25 = 103;
            var27 = -1;
        }
        for (int var28 = var22; var28 != var23; var28 += var24) {
            for (int var29 = var25; var29 != var27; var29 += var26) {
                int var30 = var11 + var29;
                int var31 = var28 + var9;
                for (int var32 = 0; var32 < 4; var32++) {
                    if (var31 >= 0 && var30 >= 0 && var31 < 104 && var30 < 104) {
                        class221.field3888[var32][var28][var29] = class221.field3888[var32][var31][var30];
                    } else {
                        class221.field3888[var32][var28][var29] = null;
                    }
                }
            }
        }
        for (class236 var33 = (class236) class214.field3777.method2024(0); var33 != null; var33 = (class236) class214.field3777.method2027(1211754408)) {
            var33.field4055 -= var9;
            var33.field4053 -= var11;
            if (var33.field4055 < 0 || var33.field4053 < 0 || var33.field4055 >= 104 || var33.field4053 >= 104) {
                var33.method1978((byte) -100);
            }
        }
        class295.field5039 = 0;
        if (arg6) {
            class125.field2103 -= var11;
            class276.field4781 -= var11;
            class162.field2770 -= var9;
            class309.field5246 -= var9;
        } else {
            class1.field21 = 1;
        }
        if (class219.field3863 != 0) {
            class114.field1907 -= var11;
            class219.field3863 -= var9;
        }
        if (class247.field4247 && arg6 && (Math.abs(var9) > 104 || Math.abs(var11) > 104)) {
            class129.method872(-1);
        }
        class228.field3971 = -1;
        class156.field2679.method2025((byte) -97);
        class132.field2284.method2025((byte) -97);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ZI)V", line = 376)
    public static final void method1149(boolean arg0, int arg1) {
        class50.field985.method1833(arg1, (byte) 93);
        field2991++;
        if (!arg0) {
            method1149(true, 3);
        }
    }
}
