import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public abstract class class203 {

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field3112 = 0;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field3111 = -1;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3116 = "";

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "[[[I")
    public static int[][][] field3110;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILnm;Z)Lle;", line = 7)
    public static final class137 method1383(int arg0, int arg1, class221 arg2, boolean arg3) {
        if (!arg3) {
            method1383(24, 72, (class221) null, false);
        }
        field3113++;
        return class334.method2361(arg0, arg2, 16836, arg1) ? class143.method1010(0) : null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZ)V", line = 21)
    public static final void method1384(int arg0, boolean arg1) {
        if (arg1) {
            if (class345.field5538 != -1) {
                class347.method2443(-1, class345.field5538);
            }
            for (class167 var2 = (class167) class218.field3363.method27(124); var2 != null; var2 = (class167) class218.field3363.method34(8)) {
                class70.method489(true, var2, 116);
            }
            class345.field5538 = -1;
            class218.field3363 = new class4(8);
            class352.method2457(3008);
            class345.field5538 = class319.field5254;
            class157.method1123((byte) 120, false);
            class110.method732(100);
            class65.method457(-58, class345.field5538);
        }
        field3114++;
        class83.field1199 = -1;
        class20.method125(26039, class297.field4923);
        class329.field5388 = new class39();
        class329.field5388.field4796 = 3000;
        int var3 = -127 / ((arg0 + 3) / 57);
        class329.field5388.field4783 = 3000;
        if (!class245.field3886 && class179.field2789 == 0) {
            class211.method1437(class69.field1073, (byte) 106);
            class310.method2165(5, 10);
            return;
        }
        if (class269.field4427 == 2) {
            class259.field4098 = class24.field360 << 7;
            class41.field625 = class15.field194 << 7;
        } else {
            class79.method537((byte) 55);
        }
        if (class245.field3886) {
            class146.method1039(false);
        }
        class358.method2490(false);
        class310.method2165(5, 28);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIILkm;JLkm;Lkm;)V", line = 86)
    public static final void method1385(int arg0, int arg1, int arg2, int arg3, class162 arg4, long arg5, class162 arg6, class162 arg7) {
        class286 var9 = new class286();
        var9.field4691 = arg4;
        var9.field4682 = arg1 * 128 + 64;
        var9.field4685 = arg2 * 128 + 64;
        var9.field4679 = arg3;
        var9.field4680 = arg5;
        var9.field4686 = arg6;
        var9.field4687 = arg7;
        int var10 = 0;
        class50 var11 = class264.field4230[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field735; var12++) {
                class258 var13 = var11.field752[var12];
                if ((var13.field4076 & 0x400000L) == 4194304L) {
                    int var14 = var13.field4071.method192();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field4690 = -var10;
        if (class264.field4230[arg0][arg1][arg2] == null) {
            class264.field4230[arg0][arg1][arg2] = new class50(arg0, arg1, arg2);
        }
        class264.field4230[arg0][arg1][arg2].field728 = var9;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V", line = 131)
    public static final void method1386(int arg0) {
        field3117++;
        boolean var1 = true;
        class28.method238(-7, false);
        class92.field1335 = 0;
        for (int var2 = 0; var2 < class202.field3107.length; var2++) {
            if (class285.field4673[var2] != -1 && class202.field3107[var2] == null) {
                class202.field3107[var2] = class97.field1406.method1504(0, true, class285.field4673[var2]);
                if (class202.field3107[var2] == null) {
                    var1 = false;
                    class92.field1335++;
                }
            }
            if (class356.field5644[var2] != -1 && class241.field3778[var2] == null) {
                class241.field3778[var2] = class97.field1406.method1506(class356.field5644[var2], 0, class177.field2752[var2], true);
                if (class241.field3778[var2] == null) {
                    class92.field1335++;
                    var1 = false;
                }
            }
            if (class245.field3886) {
                if (class54.field813[var2] != -1 && class23.field352[var2] == null) {
                    class23.field352[var2] = class97.field1406.method1504(0, true, class54.field813[var2]);
                    if (class23.field352[var2] == null) {
                        var1 = false;
                        class92.field1335++;
                    }
                }
                if (class51.field764[var2] != -1 && class315.field5197[var2] == null) {
                    class315.field5197[var2] = class97.field1406.method1504(0, true, class51.field764[var2]);
                    if (class315.field5197[var2] == null) {
                        var1 = false;
                        class92.field1335++;
                    }
                }
            }
            if (class190.field2956 != null && class71.field1096[var2] == null && class190.field2956[var2] != -1) {
                class71.field1096[var2] = class97.field1406.method1506(class190.field2956[var2], 0, class177.field2752[var2], true);
                if (class71.field1096[var2] == null) {
                    class92.field1335++;
                    var1 = false;
                }
            }
        }
        if (class322.field5292 == null) {
            if (class221.field3400 == null || !class55.field833.method1488(false, class221.field3400.field4525 + "_labels")) {
                class322.field5292 = new class68(0);
            } else if (class55.field833.method1517(126, class221.field3400.field4525 + "_labels")) {
                class322.field5292 = class223.method1525(class221.field3400.field4525 + "_labels", class312.field5106, -1, class55.field833);
            } else {
                class92.field1335++;
                var1 = false;
            }
        }
        if (!var1) {
            class248.field3948 = 1;
            return;
        }
        boolean var3 = true;
        class120.field1771 = 0;
        for (int var4 = 0; var4 < class202.field3107.length; var4++) {
            byte[] var5 = class241.field3778[var4];
            if (var5 != null) {
                int var6 = (class150.field2404[var4] >> 8) * 64 - class215.field3313;
                int var7 = (class150.field2404[var4] & 0xFF) * 64 - class150.field2420;
                if (class96.field1383) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class102.method665(var6, 107, var5, var7);
            }
            if (class245.field3886) {
                byte[] var8 = class315.field5197[var4];
                if (var8 != null) {
                    int var9 = (class150.field2404[var4] & 0xFF) * 64 - class150.field2420;
                    int var10 = (class150.field2404[var4] >> 8) * 64 - class215.field3313;
                    if (class96.field1383) {
                        var10 = 10;
                        var9 = 10;
                    }
                    var3 &= class102.method665(var10, 115, var8, var9);
                }
            }
        }
        if (!var3) {
            class248.field3948 = 2;
            return;
        }
        if (class248.field3948 != 0) {
            class243.method1696(true, (byte) -65, class157.field2525 + "<br>(100%)");
        }
        class190.method1316(-125);
        class262.method1840((byte) 66);
        boolean var11 = false;
        if (class245.field3886 && class347.field5557) {
            for (int var12 = 0; var12 < class202.field3107.length; var12++) {
                if (class315.field5197[var12] != null || class23.field352[var12] != null) {
                    var11 = true;
                    break;
                }
            }
        }
        class356.method2482(4, 104, 104, class245.field3886 ? 28 : 25, var11);
        for (int var13 = 0; var13 < 4; var13++) {
            class124.field1860[var13].method1119(-16746);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class148.field2392[var14][var15][var16] = 0;
                }
            }
        }
        class258.method1827(5, false);
        if (class245.field3886) {
            class149.field2398.method1674();
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    class149.field2400[var17][var18].field2859 = true;
                }
            }
        }
        if (class245.field3886) {
            class254.method1800();
        }
        if (class245.field3886) {
            class251.method1787((byte) 124);
        }
        class190.method1316(-123);
        System.gc();
        class28.method238(-7, true);
        class102.method664(21540, false);
        if (!class96.field1383) {
            class223.method1523(122, false);
            class28.method238(-7, true);
            if (class245.field3886) {
                int var19 = class329.field5388.field4757[0] >> 3;
                int var20 = class329.field5388.field4762[0] >> 3;
                class45.method346(var20, var19, 20102);
            }
            class197.method1346(false, -94);
            if (class71.field1096 != null) {
                class33.method285((byte) 109);
            }
        }
        if (class96.field1383) {
            class220.method1482(false, 22115);
            class28.method238(-7, true);
            if (class245.field3886) {
                int var21 = class329.field5388.field4762[0] >> 3;
                int var22 = class329.field5388.field4757[0] >> 3;
                class45.method346(var21, var22, 20102);
            }
            class159.method1129(false, 14808);
        }
        class262.method1840((byte) 55);
        class28.method238(-7, true);
        class12.method74(class124.field1860, class96.field1383 ? class276.field4549 : (int[][][]) null, (byte) 16, false);
        if (class245.field3886) {
            class254.method1809();
        }
        class28.method238(-7, true);
        int var23 = class107.field1538;
        if (class120.field1779 < var23) {
            var23 = class120.field1779;
        }
        if (var23 < class120.field1779 - 1) {
            int var24 = class120.field1779 - 1;
        }
        if (class261.method1836(0)) {
            class289.method2049(0);
        } else {
            class289.method2049(class107.field1538);
        }
        class54.method388(false);
        if (class245.field3886 && var11) {
            class146.method1042(true);
            class102.method664(21540, true);
            if (!class96.field1383) {
                class223.method1523(87, true);
                class28.method238(-7, true);
                class197.method1346(true, -113);
            }
            if (class96.field1383) {
                class220.method1482(true, 22115);
                class28.method238(-7, true);
                class159.method1129(true, 14808);
            }
            class262.method1840((byte) 121);
            class28.method238(-7, true);
            class12.method74(class124.field1860, class96.field1383 ? class276.field4549 : (int[][][]) null, (byte) 16, true);
            class28.method238(-7, true);
            class54.method388(false);
            class146.method1042(false);
        }
        if (class245.field3886) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    class149.field2400[var25][var26].method1273(class101.field1457[0], var25 * 8, var26 * 8);
                }
            }
        }
        for (int var27 = 0; var27 < 104; var27++) {
            for (int var28 = 0; var28 < 104; var28++) {
                class148.method1055(var27, var28, true);
            }
        }
        int var29 = 83 / ((arg0 + 71) / 52);
        class49.method365(255);
        class190.method1316(-127);
        class246.method1750(true);
        class262.method1840((byte) 94);
        client.field2070 = false;
        if (class245.field3886) {
            class27.method235(-1994937084, true);
        }
        if (class217.field3350 != null && class346.field5545 != null && class346.field5553 == 25) {
            class244.field3846++;
            class195.field2992.method250(21066, 240);
            class195.field2992.method2222(1057001181, 255);
        }
        if (!class96.field1383) {
            int var30 = (class50.field749 + 6) / 8;
            int var31 = (class50.field749 - 6) / 8;
            int var32 = (class328.field5362 - 6) / 8;
            int var33 = (class328.field5362 + 6) / 8;
            for (int var34 = var31 - 1; var34 <= (var30 + 1); var34++) {
                for (int var35 = var32 - 1; var35 <= (var33 + 1); var35++) {
                    if (var31 > var34 || var30 < var34 || var32 > var35 || var35 > var33) {
                        class97.field1406.method1493("m" + var34 + "_" + var35, 0);
                        class97.field1406.method1493("l" + var34 + "_" + var35, 0);
                    }
                }
            }
        }
        if (class346.field5553 == 28) {
            class310.method2165(5, 10);
        } else {
            class310.method2165(5, 30);
            if (class346.field5545 != null) {
                class195.field2992.method250(21066, 103);
            }
        }
        class342.method2416(-26766);
        class190.method1316(-124);
        class7.method51(-119);
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V", line = 640)
    public static void method1387(int arg0) {
        if (arg0 == -1) {
            field3116 = null;
            field3110 = (int[][][]) null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIII)Z", line = 653)
    public static final boolean method1388(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILhn;)Lhn;")
    public abstract class343 method1389(int arg0, class343 arg1);
}
