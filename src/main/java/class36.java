import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class36 {

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "Z")
    public boolean field872 = true;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
    public int field876;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public int field861;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public int field868;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public int field867;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public int field869;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    public int field875;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "Lja;")
    public static class62 field860 = class30.method243(43, ": ");

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "Lja;")
    public static class62 field864 = class30.method243(43, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "Lja;")
    public static class62 field865 = class30.method243(43, "Mitglieder)2Welt");

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field859 = -2;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "Lja;")
    private static class62 field857 = class30.method243(43, "Loaded interfaces");

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "Lja;")
    public static class62 field856 = field857;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "Lja;")
    public static class62 field870 = class30.method243(43, "und loggen sich dann erneut ein)3");

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "[I")
    public static int[] field871 = new int[32768];

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "Lpb;")
    public static class105 field863 = new class105();

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "B")
    public static byte field858;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILic;IIII)V")
    public static final void method275(int arg0, class58 arg1, int arg2, int arg3, int arg4, int arg5) {
        field873++;
        if (arg1 == null) {
            return;
        }
        int var6 = class62.field1495 + class50.field1162 & 0x7FF;
        int var7 = arg0 * arg0 + arg5 * arg5;
        if (var7 > 6400) {
            return;
        }
        int var8 = class66.field1658[var6];
        int var9 = var8 * 256 / (class128.field2909 + 256);
        int var10 = class66.field1647[var6];
        int var11 = var10 * 256 / (class128.field2909 + 256);
        int var12 = arg5 * var9 - arg0 * var11 >> 16;
        if (arg3 != 4) {
            return;
        }
        int var13 = arg0 * var9 + arg5 * var11 >> 16;
        if (var7 <= 2500) {
            arg1.method417(var13 + arg4 + 4 + 94 - arg1.field1437 / 2, -(arg1.field1434 / 2) + arg2 + -4 - (var12 + -83));
        } else {
            arg1.method423(class130.field2974, arg4 + var13 + 94 + 4 - arg1.field1437 / 2, -var12 + -4 + arg2 - -83 - arg1.field1434 / 2);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public static void method276(int arg0) {
        if (arg0 <= 76) {
            return;
        }
        field871 = null;
        field860 = null;
        field857 = null;
        field865 = null;
        field863 = null;
        field870 = null;
        field864 = null;
        field856 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)I")
    public static int method277(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIII)V")
    public static final void method278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field874++;
        if (class28.field694 == arg4 && class80.field1936 == arg2 && (class53.field1221 == arg1 || !class144.field3361)) {
            return;
        }
        class28.field694 = arg4;
        class80.field1936 = arg2;
        class53.field1221 = arg1;
        if (!class144.field3361) {
            class53.field1221 = 0;
        }
        class62.method473((byte) 70, 25);
        class122.method964(class43.field991, arg5 ^ 0x4950, true);
        int var6 = class27.field673;
        int var7 = class40.field926;
        class40.field926 = (arg4 - 6) * 8;
        int var8 = class40.field926 - var7;
        if (arg5 != -32537) {
            field863 = null;
        }
        int var9 = class40.field926;
        class27.field673 = (arg2 - 6) * 8;
        int var10 = class27.field673 - var6;
        int var11 = class27.field673;
        for (int var12 = 0; var12 < 32768; var12++) {
            class130 var28 = class136.field3127[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field193[var29] -= var8;
                    var28.field144[var29] -= var10;
                }
                var28.field136 -= var8 * 128;
                var28.field134 -= var10 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class115 var26 = class52.field1200[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field193[var27] -= var8;
                    var26.field144[var27] -= var10;
                }
                var26.field134 -= var10 * 128;
                var26.field136 -= var8 * 128;
            }
        }
        class155.field3598 = arg1;
        byte var14 = 0;
        class40.field936.method64(arg0, (byte) -24, arg3, false);
        byte var15 = 1;
        byte var16 = 104;
        if (var8 < 0) {
            var14 = 103;
            var16 = -1;
            var15 = -1;
        }
        byte var17 = 0;
        byte var18 = 104;
        byte var19 = 1;
        if (var10 < 0) {
            var17 = 103;
            var18 = -1;
            var19 = -1;
        }
        for (int var20 = var14; var20 != var16; var20 += var15) {
            for (int var22 = var17; var22 != var18; var22 += var19) {
                int var23 = var8 + var20;
                int var24 = var10 + var22;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                        class32.field765[var25][var20][var22] = class32.field765[var25][var23][var24];
                    } else {
                        class32.field765[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class131 var21 = (class131) class138.field3217.method840(true); var21 != null; var21 = (class131) class138.field3217.method841((byte) 18)) {
            var21.field3002 -= var10;
            var21.field2989 -= var8;
            if (var21.field2989 < 0 || var21.field3002 < 0 || var21.field2989 >= 104 || var21.field3002 >= 104) {
                var21.method1176((byte) -122);
            }
        }
        class146.field3436 = 0;
        class47.field1094 = false;
        class12.field298 = -1;
        if (class146.field3444 != 0) {
            class146.field3444 -= var8;
            class24.field597 -= var10;
        }
        class98.field2274.method845((byte) -105);
        class136.field3132.method845((byte) -90);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZLqd;I)V")
    public static final void method279(int arg0, boolean arg1, class115 arg2, int arg3) {
        if (arg2.field177 == arg0 && arg0 != -1) {
            int var4 = class141.method1121(arg0, -24732).field272;
            if (var4 == 1) {
                arg2.field169 = 0;
                arg2.field176 = 0;
                arg2.field139 = 0;
                arg2.field155 = arg3;
            }
            if (var4 == 2) {
                arg2.field176 = 0;
            }
        } else if (arg0 == -1 || arg2.field177 == -1 || class141.method1121(arg0, -24732).field261 >= class141.method1121(arg2.field177, -24732).field261) {
            arg2.field177 = arg0;
            arg2.field169 = 0;
            arg2.field185 = arg2.field156;
            arg2.field139 = 0;
            arg2.field155 = arg3;
            arg2.field176 = 0;
        }
        field862++;
        if (!arg1) {
            field863 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lrf;IZ)V")
    public static final void method280(class124 arg0, int arg1, boolean arg2) {
        field866++;
        if (class126.field2840 != null) {
            try {
                class126.field2840.method978(arg1 + 106);
            } catch (Exception var8) {
            }
            class126.field2840 = null;
        }
        class126.field2840 = arg0;
        if (arg1 != 4) {
            return;
        }
        class80.method633(16, arg2);
        class81.field1953.field2873 = 0;
        class9.field242 = null;
        class146.field3438 = null;
        class82.field1971 = 0;
        while (true) {
            class50 var3 = (class50) class124.field2820.method531(114);
            if (var3 == null) {
                while (true) {
                    class50 var4 = (class50) class96.field2246.method531(arg1 ^ 0x6F);
                    if (var4 == null) {
                        if (class133.field3054 != 0) {
                            try {
                                class128 var5 = new class128(4);
                                var5.method1010(4, 32768);
                                var5.method1010(class133.field3054, 32768);
                                var5.method1039(0, arg1 + 305662276);
                                class126.field2840.method979(4, 19770, var5.field2874, 0);
                            } catch (IOException var7) {
                                try {
                                    class126.field2840.method978(72);
                                } catch (Exception var6) {
                                }
                                class75.field1865++;
                                class126.field2840 = null;
                            }
                        }
                        class128.field2924 = 0;
                        class149.field3519 = class26.method209((byte) -62);
                        return;
                    }
                    class96.field2249.method74(-6789, var4);
                    class138.field3192.method538(var4, (byte) -27, var4.field3493);
                    class155.field3603--;
                    class5.field66++;
                }
            }
            class17.field388.method538(var3, (byte) -27, var3.field3493);
            class18.field401--;
            class1.field8++;
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class36(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field876 = arg1;
        this.field872 = arg6;
        this.field861 = arg2;
        this.field868 = arg4;
        this.field867 = arg3;
        this.field869 = arg5;
        this.field875 = arg0;
    }
}
