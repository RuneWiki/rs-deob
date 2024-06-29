import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class160 extends class181 {

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "[I")
    public static int[] field2323 = new int[5];

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "Z")
    public static boolean field2324 = false;

    @OriginalMember(owner = "client!sj", name = "D", descriptor = "[I")
    public static int[] field2330 = new int[1000];

    @OriginalMember(owner = "client!sj", name = "A", descriptor = "Ljava/lang/String;")
    public static String field2327 = "cyan:";

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "B")
    public byte field2320;

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
    public int field2321;

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!sj", name = "y", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!sj", name = "F", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!sj", name = "E", descriptor = "Lpk;")
    public static class237 field2331;

    @OriginalMember(owner = "client!sj", name = "B", descriptor = "Ljava/lang/String;")
    public String field2328;

    @OriginalMember(owner = "client!sj", name = "C", descriptor = "Ljava/lang/String;")
    public String field2329;

    @OriginalMember(owner = "client!sj", name = "G", descriptor = "[I")
    public static int[] field2333;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIZIZZLvd;IB)Lji;")
    public static final class256 method1078(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, boolean arg5, class261 arg6, int arg7, byte arg8) {
        field2322++;
        class15 var9 = class140.method951((byte) -94, arg3);
        if (arg1 > 1 && var9.field226 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field230[var11] && var9.field230[var11] != 0) {
                    var10 = var9.field226[var11];
                }
            }
            if (var10 != -1) {
                var9 = class140.method951((byte) -94, var10);
            }
        }
        class263 var12 = var9.method107(5, arg6);
        if (var12 == null) {
            return null;
        }
        class289 var13 = null;
        if (var9.field271 != -1) {
            var13 = (class289) method1078(0, 10, false, var9.field220, true, true, arg6, 1, (byte) -93);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field270 != -1) {
            var13 = (class289) method1078(arg0, arg1, false, var9.field228, false, true, arg6, arg7, (byte) -90);
            if (var13 == null) {
                return null;
            }
        }
        int var14 = class72.field1173;
        int[] var15 = class72.field1174;
        int var16 = class72.field1175;
        int[] var17 = new int[4];
        class72.method580(var17);
        class289 var18 = new class289(36, 32);
        class72.method557(var18.field4397, 36, 32);
        class119.method842();
        class119.method853(16, 16);
        if (arg8 >= -89) {
            field2333 = null;
        }
        int var19 = var9.field217;
        class119.field1788 = false;
        if (arg4) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg7 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class119.field1774[var9.field218] * var19 >> 16;
        int var21 = class119.field1776[var9.field218] * var19 >> 16;
        var12.method20(0, var9.field256, var9.field225, var9.field218, var9.field275, (var20 + var9.field240) - (var12.method19() / 2), var9.field240 + var21, -1L);
        if (arg7 >= 1) {
            var18.method1911(1);
            if (arg7 >= 2) {
                var18.method1911(16777215);
            }
            class72.method557(var18.field4397, 36, 32);
        }
        if (arg0 != 0) {
            var18.method1921(arg0);
        }
        if (var9.field271 != -1) {
            var13.method1230(0, 0);
        } else if (var9.field270 != -1) {
            class72.method557(var13.field4397, 36, 32);
            var18.method1230(0, 0);
            var18 = var13;
        }
        if (arg2 && (var9.field267 == 1 || arg1 != 1) && arg1 != -1) {
            class241.field3747.method1291(class231.method1569((byte) -119, arg1), 0, 9, 16776960, 1);
        }
        class72.method557(var15, var14, var16);
        class72.method562(var17);
        class119.method842();
        class119.field1788 = true;
        return var18;
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)V")
    public static void method1079(int arg0) {
        if (arg0 != -30173) {
            return;
        }
        field2331 = null;
        field2333 = null;
        field2330 = null;
        field2323 = null;
        field2327 = null;
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(II)V")
    public static final void method1080(int arg0, int arg1) {
        field2332++;
        if (class176.method1165(arg1, -31001)) {
            if (arg0 != 36) {
                field2323 = null;
            }
            class101.method738(-1, class275.field4236[arg1], arg0 ^ 0xFFFFFFDA);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IILjk;ZI)V")
    public static final void method1081(int arg0, int arg1, class297 arg2, boolean arg3, int arg4) {
        int var5 = arg2.field4627;
        if (arg2.field4540 == 0) {
            arg2.field4627 = arg2.field4686;
        } else if (arg2.field4540 == 1) {
            arg2.field4627 = arg0 - arg2.field4686;
        } else if (arg2.field4540 == 2) {
            arg2.field4627 = arg2.field4686 * arg0 >> 14;
        } else if (arg2.field4540 == 3) {
            if (arg2.field4553 == 2) {
                arg2.field4627 = (arg2.field4686 - 1) * arg2.field4554 + arg2.field4686 * 32;
            } else if (arg2.field4553 == 7) {
                arg2.field4627 = arg2.field4686 * 115 + ((arg2.field4686 - 1) * arg2.field4554);
            }
        }
        int var6 = arg2.field4531;
        if (arg2.field4650 == 0) {
            arg2.field4531 = arg2.field4530;
        } else if (arg2.field4650 == 1) {
            arg2.field4531 = arg1 - arg2.field4530;
        } else if (arg2.field4650 == 2) {
            arg2.field4531 = arg2.field4530 * arg1 >> 14;
        } else if (arg2.field4650 == 3) {
            if (arg2.field4553 == 2) {
                arg2.field4531 = (arg2.field4530 - 1) * arg2.field4620 + arg2.field4530 * 32;
            } else if (arg2.field4553 == 7) {
                arg2.field4531 = (arg2.field4530 - 1) * arg2.field4620 + arg2.field4530 * 12;
            }
        }
        field2326++;
        if (arg2.field4540 == 4) {
            arg2.field4627 = arg2.field4599 * arg2.field4531 / arg2.field4619;
        }
        if (arg4 != 1) {
            method1079(70);
        }
        if (arg2.field4650 == 4) {
            arg2.field4531 = arg2.field4627 * arg2.field4619 / arg2.field4599;
        }
        if (class112.field1712 && (client.method333(arg2).field4515 != 0 || arg2.field4553 == 0)) {
            if (arg2.field4531 < 5 && arg2.field4627 < 5) {
                arg2.field4531 = 5;
                arg2.field4627 = 5;
            } else {
                if (arg2.field4627 <= 0) {
                    arg2.field4627 = 5;
                }
                if (arg2.field4531 <= 0) {
                    arg2.field4531 = 5;
                }
            }
        }
        if (arg2.field4600 == 1337) {
            class174.field2550 = arg2;
        }
        if (arg3 && arg2.field4679 != null && arg2.field4627 != var5 || arg2.field4531 != var6) {
            class43 var7 = new class43();
            var7.field767 = arg2.field4679;
            var7.field750 = arg2;
            class122.field1813.method1881(var7, (byte) -56);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIB)Lee;")
    public static final class195 method1082(int arg0, int arg1, byte arg2) {
        field2325++;
        class195 var3 = new class195();
        for (class283 var4 = (class283) class85.field1297.method315((byte) -64); var4 != null; var4 = (class283) class85.field1297.method310(-116)) {
            if (var4.field4340 && var4.method1876(arg0, arg1, (byte) -68)) {
                var3.method1315((byte) -48, var4);
            }
        }
        int var5 = 61 % ((-arg2 - 33) / 43);
        return var3;
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(I)V")
    public static final void method1083(int arg0) {
        field2319++;
        if (class220.field3433 < 0) {
            class66.field1087 = -1;
            class244.field3784 = -1;
            class220.field3433 = 0;
        }
        if (arg0 != 30661) {
            return;
        }
        if (class220.field3433 > class133.field1956) {
            class66.field1087 = -1;
            class220.field3433 = class133.field1956;
            class244.field3784 = -1;
        }
        if (class12.field171 < 0) {
            class66.field1087 = -1;
            class244.field3784 = -1;
            class12.field171 = 0;
        }
        if (class235.field3619 < class12.field171) {
            class12.field171 = class235.field3619;
            class244.field3784 = -1;
            class66.field1087 = -1;
        }
    }
}
