import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class19 implements Runnable {

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "Z")
    public boolean field390 = true;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field392 = new Object();

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public int field401 = 0;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "[I")
    public int[] field404 = new int[500];

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "[I")
    public int[] field399 = new int[500];

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "Lvc;")
    public static class137 field398 = class45.method325("Bitte starten Sie eine Mitgliedschaft", -46);

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "Lvc;")
    private static class137 field397 = class45.method325("Loaded textures", -46);

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "Lvc;")
    public static class137 field403 = field397;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field391 = 0;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "Lvc;")
    public static class137 field409 = class45.method325(":chalreq:", -46);

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "Lpb;")
    public static class100 field396 = new class100();

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
    public static int field411 = -1;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "Loa;")
    public static class93 field410;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLme;)V")
    public static final void method165(byte arg0, class85 arg1) {
        field407++;
        if (arg0 <= 126) {
            method169(-126, null);
        }
        int var2 = arg1.field1910 >> 16;
        if (class73.field1543 == var2 || class10.field221 == var2) {
            class80.field1825 = true;
        }
        if (class112.field2670 == var2 || class32.field679[class75.field1691] == var2) {
            class34.field737 = true;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZB)V")
    public static final void method166(boolean arg0, byte arg1) {
        class39.field877 = arg0;
        int var2 = 87 / ((22 - arg1) / 53);
        if (class39.field877) {
            class103.field2391.method848((byte) 84);
            for (int var16 = 0; var16 < 4; var16++) {
                for (int var36 = 0; var36 < 13; var36++) {
                    for (int var37 = 0; var37 < 13; var37++) {
                        int var38 = class103.field2391.method847(1, (byte) 56);
                        if (var38 == 1) {
                            class92.field2180[var16][var36][var37] = class103.field2391.method847(26, (byte) 92);
                        } else {
                            class92.field2180[var16][var36][var37] = -1;
                        }
                    }
                }
            }
            class103.field2391.method854(false);
            int var17 = (class68.field1399 - class103.field2391.field2583) / 16;
            client.field479 = new int[var17][4];
            for (int var18 = 0; var18 < var17; var18++) {
                for (int var35 = 0; var35 < 4; var35++) {
                    client.field479[var18][var35] = class103.field2391.method805(-125);
                }
            }
            int var19 = class103.field2391.method831((byte) 105);
            int var20 = class103.field2391.method831((byte) 105);
            int var21 = class103.field2391.method841(-19184);
            int var22 = class103.field2391.method835(2);
            int var23 = class103.field2391.method794((byte) -106);
            class36.field786 = new int[var17];
            class2.field34 = new int[var17];
            class134.field3113 = new int[var17];
            class131.field3039 = new byte[var17][];
            class100.field2329 = new byte[var17][];
            int var24 = 0;
            for (int var25 = 0; var25 < 4; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    for (int var27 = 0; var27 < 13; var27++) {
                        int var28 = class92.field2180[var25][var26][var27];
                        if (var28 != -1) {
                            int var29 = var28 >> 14 & 0x3FF;
                            int var30 = var28 >> 3 & 0x7FF;
                            int var31 = (var29 / 8 << 8) + (var30 / 8);
                            for (int var32 = 0; var32 < var24; var32++) {
                                if (class134.field3113[var32] == var31) {
                                    var31 = -1;
                                    break;
                                }
                            }
                            if (var31 != -1) {
                                int var33 = var31 >> 8 & 0xFF;
                                class134.field3113[var24] = var31;
                                int var34 = var31 & 0xFF;
                                class2.field34[var24] = class22.field518.method641(1, class88.method666(125, new class137[] { class126.field2939, class61.method435(var33, 105), class11.field234, class61.method435(var34, 113) }));
                                class36.field786[var24] = class22.field518.method641(1, class88.method666(-95, new class137[] { class70.field1477, class61.method435(var33, 108), class11.field234, class61.method435(var34, 91) }));
                                var24++;
                            }
                        }
                    }
                }
            }
            client.method198(var20, var21, var23, 0, var22, var19);
        } else {
            int var3 = class103.field2391.method835(2);
            int var4 = class103.field2391.method794((byte) -106);
            int var5 = class103.field2391.method835(2);
            int var6 = (class68.field1399 - class103.field2391.field2583) / 16;
            client.field479 = new int[var6][4];
            for (int var7 = 0; var7 < var6; var7++) {
                for (int var15 = 0; var15 < 4; var15++) {
                    client.field479[var7][var15] = class103.field2391.method832(14722);
                }
            }
            int var8 = class103.field2391.method835(2);
            int var9 = class103.field2391.method831((byte) 105);
            class2.field34 = new int[var6];
            class134.field3113 = new int[var6];
            class100.field2329 = new byte[var6][];
            class131.field3039 = new byte[var6][];
            boolean var10 = false;
            class36.field786 = new int[var6];
            int var11 = 0;
            if ((var8 / 8 == 48 || var8 / 8 == 49) && var3 / 8 == 48) {
                var10 = true;
            }
            if (var8 / 8 == 48 && var3 / 8 == 148) {
                var10 = true;
            }
            for (int var12 = (var8 - 6) / 8; var12 <= (var8 + 6) / 8; var12++) {
                for (int var13 = (var3 - 6) / 8; var13 <= (var3 + 6) / 8; var13++) {
                    int var14 = (var12 << 8) + var13;
                    if (!var10 || var13 != 49 && var13 != 149 && var13 != 147 && var12 != 50 && (var12 != 49 || var13 != 47)) {
                        class134.field3113[var11] = var14;
                        class2.field34[var11] = class22.field518.method641(1, class88.method666(121, new class137[] { class126.field2939, class61.method435(var12, 74), class11.field234, class61.method435(var13, 97) }));
                        class36.field786[var11] = class22.field518.method641(1, class88.method666(116, new class137[] { class70.field1477, class61.method435(var12, 105), class11.field234, class61.method435(var13, 110) }));
                        var11++;
                    }
                }
            }
            client.method198(var5, var3, var4, 0, var8, var9);
        }
        field408++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZLnb;Lnb;)I")
    public static final int method167(boolean arg0, class88 arg1, class88 arg2) {
        field393++;
        if (arg0) {
            method169(-107, null);
        }
        int var3 = 0;
        if (arg2.method660(83, class142.field3347, class115.field2737)) {
            var3++;
        }
        if (arg1.method660(-79, class104.field2409, class115.field2737)) {
            var3++;
        }
        if (arg1.method660(-81, class141.field3283, class115.field2737)) {
            var3++;
        }
        if (arg1.method660(82, class119.field2786, class115.field2737)) {
            var3++;
        }
        if (arg1.method660(127, class84.field1898, class115.field2737)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field400++;
        if (arg0 >= 1 && arg7 >= 1 && arg0 <= 102 && arg7 <= 102) {
            if (class25.field603 && class28.field627 != arg6) {
                return;
            }
            int var8 = 0;
            if (arg1 == 0) {
                var8 = class10.field220.method524(arg6, arg0, arg7);
            }
            boolean var9 = false;
            boolean var10 = true;
            boolean var11 = false;
            if (arg1 == 1) {
                var8 = class10.field220.method520(arg6, arg0, arg7);
            }
            if (arg1 == 2) {
                var8 = class10.field220.method531(arg6, arg0, arg7);
            }
            if (arg1 == 3) {
                var8 = class10.field220.method550(arg6, arg0, arg7);
            }
            if (var8 != 0) {
                int var12 = var8 >> 14 & 0x7FFF;
                int var13 = class10.field220.method511(arg6, arg0, arg7, var8);
                int var14 = var13 & 0x1F;
                int var15 = var13 >> 6 & 0x3;
                if (arg1 == 0) {
                    class10.field220.method545(arg6, arg0, arg7);
                    class126 var16 = class114.method886(6, var12);
                    if (var16.field2919) {
                        class131.field3046[arg6].method414(false, arg7, var16.field2917, var14, var15, arg0);
                    }
                }
                if (arg1 == 1) {
                    class10.field220.method525(arg6, arg0, arg7);
                }
                if (arg1 == 2) {
                    class10.field220.method554(arg6, arg0, arg7);
                    class126 var17 = class114.method886(6, var12);
                    if (var17.field2952 + arg0 > 103 || var17.field2952 + arg7 > 103 || var17.field2971 + arg0 > 103 || arg7 + var17.field2971 > 103) {
                        return;
                    }
                    if (var17.field2919) {
                        class131.field3046[arg6].method420(arg7, var17.field2971, arg0, var17.field2917, (byte) -84, var15, var17.field2952);
                    }
                }
                if (arg1 == 3) {
                    class10.field220.method528(arg6, arg0, arg7);
                    class126 var18 = class114.method886(6, var12);
                    if (var18.field2919 && var18.field2977 == 1) {
                        class131.field3046[arg6].method418((byte) 53, arg0, arg7);
                    }
                }
            }
            if (arg2 >= 0) {
                int var19 = arg6;
                if (arg6 < 3 && (class70.field1490[1][arg0][arg7] & 0x2) == 2) {
                    var19 = arg6 + 1;
                }
                class122.method918(arg0, arg4, class10.field220, arg3, -1890, class131.field3046[arg6], arg2, arg7, var19, arg6);
            }
        }
        if (arg5 != -104) {
            method167(true, null, null);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILvc;)Z")
    public static final boolean method169(int arg0, class137 arg1) {
        field406++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 != -1) {
            field409 = null;
        }
        for (int var2 = 0; var2 < class80.field1832; var2++) {
            if (arg1.method998(4204, class98.field2270[var2])) {
                return true;
            }
        }
        return arg1.method998(4204, class104.field2412.field2909);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
    public static void method170(byte arg0) {
        field409 = null;
        int var1 = 115 / ((arg0 + 13) / 46);
        field397 = null;
        field403 = null;
        field410 = null;
        field398 = null;
        field396 = null;
    }

    @OriginalMember(owner = "client!cd", name = "run", descriptor = "()V")
    public final void run() {
        field395++;
        while (this.field390) {
            Object var1 = this.field392;
            synchronized (this.field392) {
                if (this.field401 < 500) {
                    this.field399[this.field401] = class126.field2956;
                    this.field404[this.field401] = class32.field693;
                    this.field401++;
                }
            }
            class28.method219(true, 50L);
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V")
    public static final void method171(byte arg0) {
        class49.field1107 = 0;
        if (arg0 != 22) {
            method169(28, null);
        }
        class78.field1732 = 0;
        class68.field1399 = 0;
        class72.field1527.field2583 = 0;
        class47.field1052 = 0;
        class11.field241 = -1;
        class103.field2391.field2583 = 0;
        class48.field1088 = 0;
        class45.field1006 = -1;
        class59.field1270 = 0;
        class77.field1718 = false;
        class61.field1323 = -1;
        field405++;
        class109.field2597 = -1;
        for (int var1 = 0; var1 < class102.field2358.length; var1++) {
            if (class102.field2358[var1] != null) {
                class102.field2358[var1].field1625 = -1;
            }
        }
        for (int var2 = 0; var2 < class125.field2914.length; var2++) {
            if (class125.field2914[var2] != null) {
                class125.field2914[var2].field1625 = -1;
            }
        }
        class60.method429(0);
        class33.method245(30, -106);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZ)V")
    public static final void method172(int arg0, boolean arg1) {
        class75.field1689 += arg0;
        while (class85.field2025 <= class75.field1689) {
            class75.field1689 -= class85.field2025;
            class111.field2639 -= class111.field2639 >> 2;
        }
        class111.field2639 -= arg0 * 1000;
        if (!arg1) {
            field397 = null;
        }
        field394++;
        if (class111.field2639 < 0) {
            class111.field2639 = 0;
        }
    }
}
