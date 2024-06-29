import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class24 {

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "Z")
    public static boolean field434 = true;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field431 = new String[100];

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public static int field433 = 0;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "Lir;")
    public static class185 field432;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "Lir;")
    public static class185 field436;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "[Ll;")
    public static class315[] field441;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V", line = 3)
    public static void method212(int arg0) {
        field436 = null;
        field432 = null;
        field431 = null;
        field441 = null;
        if (arg0 > -57) {
            method214((byte) 35);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;IBJII)V", line = 22)
    public static final void method213(int arg0, String arg1, String arg2, int arg3, byte arg4, long arg5, int arg6, int arg7) {
        if (arg4 < 96) {
            return;
        }
        field429++;
        if (!class165.field2244 && class402.field5874 < 500) {
            int var9 = arg3 == -1 ? class295.field4448 : arg3;
            class138 var10 = new class138(arg1, arg2, var9, arg7, arg5, arg6, arg0);
            class186.field2547.method1560(-120, var10);
            class402.field5874++;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V", line = 44)
    public static final void method214(byte arg0) {
        int var1 = 0;
        if (arg0 <= 56) {
            method212(107);
        }
        while (var1 < 5) {
            class403.field5875[var1] = false;
            var1++;
        }
        field430++;
        class112.field1441 = -1;
        class124.field1614 = 0;
        class212.field2884 = 1;
        class432.field6283 = 0;
        class17.field280 = -1;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)V", line = 80)
    public static final void method215(byte arg0) {
        field435++;
        class78.field1095.method177((byte) 105);
        class264.field3890 = null;
        if (arg0 >= -20) {
            field433 = 127;
        }
        class217.field3024 = 1;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lwc;)V", line = 97)
    public static final void method216(class64 arg0) {
        if (class197.field2720 >= 255) {
            return;
        }
        class280.field4131[class197.field2720] = arg0;
        class116.field1511[class197.field2720] = false;
        class197.field2720++;
        int var1 = arg0.field957;
        if (arg0.field960) {
            var1 = 0;
        }
        int var2 = arg0.field957;
        if (arg0.field968) {
            var2 = class134.field1752 - 1;
        }
        for (int var3 = var1; var3 <= var2; var3++) {
            int var4 = 0;
            int var5 = arg0.field269 + 64 - arg0.field263 >> 7;
            if (var5 < 0) {
                var4 -= var5;
                var5 = 0;
            }
            int var6 = arg0.field269 + arg0.field263 - 64 >> 7;
            if (var6 >= class186.field2554) {
                var6 = class186.field2554 - 1;
            }
            for (int var7 = var5; var7 <= var6; var7++) {
                short var8 = arg0.field953[var4++];
                int var9 = (var8 >>> 8) + (arg0.field264 + 64 - arg0.field263 >> 7);
                int var10 = (var8 & 0xFF) + var9 - 1;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var10 >= class108.field1421) {
                    var10 = class108.field1421 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    int var12 = class131.field1714[var3][var11][var7];
                    if ((var12 & 0xFF) == 0) {
                        class131.field1714[var3][var11][var7] = var12 | class197.field2720;
                    } else if ((var12 & 0xFF00) == 0) {
                        class131.field1714[var3][var11][var7] = var12 | class197.field2720 << 8;
                    } else if ((var12 & 0xFF0000) == 0) {
                        class131.field1714[var3][var11][var7] = var12 | class197.field2720 << 16;
                    } else if ((var12 & 0xFF000000) == 0) {
                        class131.field1714[var3][var11][var7] = var12 | class197.field2720 << 24;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BI)V", line = 187)
    public static final void method217(byte arg0, int arg1) {
        if (arg0 > 40) {
            class415.field6013.method379(arg1, false);
            field438++;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IBLsj;)Ljava/lang/String;", line = 200)
    public static final String method218(int arg0, byte arg1, class248 arg2) {
        field440++;
        if (!client.method402(arg2).method1470((byte) 65, arg0) && arg2.field3532 == null) {
            return null;
        }
        int var3 = -113 / ((arg1 + 6) / 60);
        if (arg2.field3486 == null || arg0 >= arg2.field3486.length || arg2.field3486[arg0] == null || arg2.field3486[arg0].trim().length() == 0) {
            return class126.field1649 ? "Hidden-" + arg0 : null;
        } else {
            return arg2.field3486[arg0];
        }
    }
}
