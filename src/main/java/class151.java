import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class151 extends class5 {

    @OriginalMember(owner = "client!bj", name = "P", descriptor = "[Lmc;")
    public class190[] field2801;

    @OriginalMember(owner = "client!bj", name = "D", descriptor = "Z")
    public static boolean field2790 = true;

    @OriginalMember(owner = "client!bj", name = "K", descriptor = "I")
    public static int field2797 = 0;

    @OriginalMember(owner = "client!bj", name = "G", descriptor = "[I")
    public static int[] field2793 = new int[64];

    @OriginalMember(owner = "client!bj", name = "I", descriptor = "Lhj;")
    public static class69 field2795 = class181.method1318("Schrifts-=tze geladen)3", (byte) -116);

    @OriginalMember(owner = "client!bj", name = "N", descriptor = "Lhj;")
    private static class69 field2799 = class181.method1318("Select a world", (byte) -128);

    @OriginalMember(owner = "client!bj", name = "L", descriptor = "Lhj;")
    public static class69 field2798 = field2799;

    @OriginalMember(owner = "client!bj", name = "F", descriptor = "I")
    public static int field2792 = -1;

    @OriginalMember(owner = "client!bj", name = "E", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!bj", name = "H", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!bj", name = "J", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!bj", name = "O", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!bj", name = "Q", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(III)V")
    public static final void method1130(int arg0, int arg1, int arg2) {
        class196.field3566 = true;
        class212.field3850 = arg0;
        class70.field1380 = arg1;
        class170.field3113 = arg2;
        class26.field367 = -1;
        class220.field3959 = -1;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZB)V")
    public static final void method1131(boolean arg0, byte arg1) {
        if (arg1 != -11) {
            field2790 = true;
        }
        if ((class156.field2904.field3985 >> 7) == class129.field2408 && class156.field2904.field4005 >> 7 == class100.field1884) {
            class129.field2408 = 0;
        }
        field2794++;
        int var2 = class98.field1856;
        if (arg0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class108 var4;
            long var5;
            if (arg0) {
                var4 = class156.field2904;
                var5 = 8791798054912L;
            } else {
                var5 = (long) class38.field525[var3] << 32;
                var4 = class35.field491[class38.field525[var3]];
            }
            if (var4 != null && var4.method210(-30948)) {
                var4.field2046 = false;
                if ((class119.field2249 && class98.field1856 > 200 || class98.field1856 > 50) && !arg0 && var4.field3996 == var4.field3982) {
                    var4.field2046 = true;
                }
                int var7 = var4.field3985 >> 7;
                int var8 = var4.field4005 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var4.field2034 == null || class180.field3272 < var4.field2069 || var4.field2068 <= class180.field3272) {
                        if (var4.method813(15963) == 1 && (var4.field3985 & 0x7F) == 64 && (var4.field4005 & 0x7F) == 64) {
                            if (class59.field1083[var7][var8] == class62.field1182) {
                                continue;
                            }
                            class59.field1083[var7][var8] = class62.field1182;
                        }
                        var4.field4044 = class156.method1179(var4.field3985, var4.field4005, arg1 + 36, class52.field927);
                        class213.method1538(class52.field927, var4.field3985, var4.field4005, var4.field4044, (var4.method813(15963) - 1) * 64 + 60, var4, var4.field4003, var5, var4.field4002);
                    } else {
                        var4.field2046 = false;
                        var4.field4044 = class156.method1179(var4.field3985, var4.field4005, 79, class52.field927);
                        class168.method1238(class52.field927, var4.field3985, var4.field4005, var4.field4044, var4, var4.field4003, var5, var4.field2049, var4.field2053, var4.field2078, var4.field2065);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIILed;JZ)V")
    public static final void method1132(int arg0, int arg1, int arg2, int arg3, class177 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class68 var8 = new class68();
        var8.field1288 = arg4;
        var8.field1294 = arg1 * 128 + 64;
        var8.field1290 = arg2 * 128 + 64;
        var8.field1292 = arg3;
        var8.field1293 = arg5;
        if (class158.field2935[arg0][arg1][arg2] == null) {
            class158.field2935[arg0][arg1][arg2] = new class217(arg0, arg1, arg2);
        }
        class158.field2935[arg0][arg1][arg2].field3949 = var8;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)Z")
    public final boolean method1133(int arg0, int arg1) {
        if (arg1 != -19747) {
            method1136(-56, (class83) null, (class83) null);
        }
        field2800++;
        return this.field2801[arg0].field3445;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lnc;Lnc;ZLnc;Lnc;)V")
    public static final void method1134(class83 arg0, class83 arg1, boolean arg2, class83 arg3, class83 arg4) {
        class240.field4413 = arg4;
        class173.field3155 = arg3;
        field2796++;
        if (!arg2) {
            field2790 = false;
        }
        class66.field1268 = arg0;
        class210.field3819 = arg1;
        class116.field2222 = new class50[class210.field3819.method587(-17326)][];
        class223.field4066 = new boolean[class210.field3819.method587(-17326)];
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(B)V")
    public static final void method1135(byte arg0) {
        field2791++;
        int var1 = -83 / ((-arg0 - 4) / 63);
        while (class199.field3595.method295(class33.field451, (byte) 55) >= 11) {
            int var2 = class199.field3595.method305(11, 8);
            if (var2 == 2047) {
                break;
            }
            boolean var3 = false;
            if (class35.field491[var2] == null) {
                var3 = true;
                class35.field491[var2] = new class108();
                if (class28.field398[var2] != null) {
                    class35.field491[var2].method810(true, class28.field398[var2]);
                }
            }
            class38.field525[class98.field1856++] = var2;
            class108 var4 = class35.field491[var2];
            var4.field4041 = class180.field3272;
            int var5 = class199.field3595.method305(5, 8);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class199.field3595.method305(1, 8);
            if (var6 == 1) {
                class102.field1908[class156.field2917++] = var2;
            }
            int var7 = class199.field3595.method305(5, 8);
            int var8 = class199.field3595.method305(1, 8);
            int var9 = class270.field4790[class199.field3595.method305(3, 8)];
            if (var3) {
                var4.field4052 = var4.field4003 = var9;
            }
            if (var7 > 15) {
                var7 -= 32;
            }
            var4.method812(class156.field2904.field3998[0] + var7, 0, var8 == 1, class156.field2904.field4046[0] + var5);
        }
        class199.field3595.method303((byte) -88);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILnc;Lnc;)V")
    public static final void method1136(int arg0, class83 arg1, class83 arg2) {
        class99.field1879 = arg1;
        field2802++;
        if (arg0 != 15) {
            field2792 = -115;
        }
        class53.field943 = arg2;
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)V")
    public static void method1137(int arg0) {
        field2798 = null;
        field2795 = null;
        field2799 = null;
        field2793 = null;
        if (arg0 != -1) {
            field2797 = -81;
        }
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lnc;Lnc;IZ)V")
    public class151(class83 arg0, class83 arg1, int arg2, boolean arg3) {
        class243 var5 = new class243();
        int var6 = arg0.method594(arg2, (byte) -61);
        this.field2801 = new class190[var6];
        int[] var7 = arg0.method608(-20161, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method590(var7[var8], arg2, 0);
            class111 var10 = null;
            int var11 = var9[0] & 0xFF << 8 | var9[1] & 0xFF;
            for (class111 var12 = (class111) var5.method1724(255); var12 != null; var12 = (class111) var5.method1726(109)) {
                if (var12.field2111 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method598((byte) -122, 0, var11);
                } else {
                    var13 = arg1.method598((byte) -78, var11, 0);
                }
                var10 = new class111(var11, var13);
                var5.method1727(-119, var10);
            }
            this.field2801[var7[var8]] = new class190(var9, var10);
        }
    }
}
