import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class435 extends class359 {

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    public int field6374;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
    public int field6381;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "[[I")
    public static int[][] field6380 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    public static int field6382 = 0;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "Ljava/lang/String;")
    public static String field6379 = "flash3:";

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "[I")
    public static int[] field6377 = new int[5];

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
    public static int field6384 = -1;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    public static int field6375;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    public static int field6383;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V")
    public static void method2703(int arg0) {
        field6379 = null;
        field6377 = null;
        if (arg0 != -19769) {
            field6377 = null;
        }
        field6380 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lra;I)V")
    public static final void method2704(class57 arg0, int arg1) {
        field6375++;
        class291.field4166 = arg0;
        if (arg1 == -6941) {
            class291.field4166.method352(35, (byte) -75);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)I")
    public static final int method2705(byte arg0, int arg1) {
        if (arg0 == 96) {
            field6378++;
            return arg1 & 0xFF;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V")
    public static final void method2706(int arg0) {
        field6376++;
        class59.method367(false, (byte) -121);
        class150.field2110 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class349.field5097.length; var2++) {
            if (class291.field4182[var2] != -1 && class349.field5097[var2] == null) {
                class349.field5097[var2] = class282.field3968.method361(class291.field4182[var2], 85, 0);
                if (class349.field5097[var2] == null) {
                    class150.field2110++;
                    var1 = false;
                }
            }
            if (class237.field3226[var2] != -1 && class239.field3252[var2] == null) {
                class239.field3252[var2] = class282.field3968.method328(class315.field4489[var2], (byte) 122, 0, class237.field3226[var2]);
                if (class239.field3252[var2] == null) {
                    class150.field2110++;
                    var1 = false;
                }
            }
            if (class157.field2234[var2] != -1 && class37.field382[var2] == null) {
                class37.field382[var2] = class282.field3968.method361(class157.field2234[var2], 81, 0);
                if (class37.field382[var2] == null) {
                    var1 = false;
                    class150.field2110++;
                }
            }
            if (class193.field2638[var2] != -1 && class98.field1109[var2] == null) {
                class98.field1109[var2] = class282.field3968.method361(class193.field2638[var2], 77, 0);
                if (class98.field1109[var2] == null) {
                    class150.field2110++;
                    var1 = false;
                }
            }
            if (class246.field3338 != null && class433.field6308[var2] == null && class246.field3338[var2] != -1) {
                class433.field6308[var2] = class282.field3968.method328(class315.field4489[var2], (byte) 126, 0, class246.field3338[var2]);
                if (class433.field6308[var2] == null) {
                    class150.field2110++;
                    var1 = false;
                }
            }
        }
        if (class407.field5911 == null) {
            if (class269.field3788 == null || !class54.field611.method342((byte) 127, class269.field3788.field1065 + "_staticelements")) {
                class407.field5911 = new class220(0);
            } else if (class54.field611.method326(100, class269.field3788.field1065 + "_staticelements")) {
                class407.field5911 = class353.method2247((byte) -94, class269.field3788.field1065 + "_staticelements", class54.field611, class166.field2325);
            } else {
                class150.field2110++;
                var1 = false;
            }
        }
        if (!var1) {
            class260.field3591 = 1;
        } else if (arg0 <= -79) {
            class70.field783 = 0;
            boolean var3 = true;
            for (int var4 = 0; var4 < class349.field5097.length; var4++) {
                byte[] var20 = class239.field3252[var4];
                if (var20 != null) {
                    int var21 = (class71.field805[var4] >> 8) * 64 - class40.field427;
                    int var22 = (class71.field805[var4] & 0xFF) * 64 - class217.field2975;
                    if (class150.field2108) {
                        var22 = 10;
                        var21 = 10;
                    }
                    var3 &= class420.method2610(var21, 0, var22, var20);
                }
                byte[] var23 = class98.field1109[var4];
                if (var23 != null) {
                    int var24 = (class71.field805[var4] >> 8) * 64 - class40.field427;
                    int var25 = (class71.field805[var4] & 0xFF) * 64 - class217.field2975;
                    if (class150.field2108) {
                        var24 = 10;
                        var25 = 10;
                    }
                    var3 &= class420.method2610(var24, 0, var25, var23);
                }
            }
            if (var3) {
                if (class260.field3591 != 0) {
                    class289.method1846(class407.field5907 + "<br>(100%)", class2.field20, true, (byte) -112);
                }
                class58.method365(-26586);
                class308.method1926((byte) -32);
                boolean var5 = false;
                if (class218.field2991.method951() && class307.field4399) {
                    for (int var6 = 0; var6 < class349.field5097.length; var6++) {
                        if (class98.field1109[var6] != null || class37.field382[var6] != null) {
                            var5 = true;
                            break;
                        }
                    }
                }
                int var7;
                if (class25.field245) {
                    var7 = class310.field4427[class179.field2465];
                } else {
                    var7 = class188.field2554[class179.field2465];
                }
                if (class218.field2991.method969()) {
                    var7++;
                }
                class99.method535(4, class279.field3935, class164.field2287, var7, var5, class218.field2991.method994() > 0);
                for (int var8 = 0; var8 < 4; var8++) {
                    class54.field613[var8].method240((byte) -103);
                }
                class182.method1180((byte) 45);
                class81.method452(false, 0);
                class274.method1734(2);
                class58.method365(-26586);
                System.gc();
                class59.method367(true, (byte) -125);
                class401.method2538(1, 4);
                int[][] var9 = null;
                if (!class150.field2108) {
                    class215.method1404(177, false);
                    class310.method1943(class390.field5715.field6350[0] >> 3, class390.field5715.field6351[0] >> 3, (byte) 120);
                    class369.method2327(0);
                    class93.method500(false, (int[][]) null, (byte) -98, class218.field2991, 4);
                    var9 = class30.field278[0];
                    class59.method367(true, (byte) -125);
                    class130.method782(false, 230066952);
                    if (class433.field6308 != null) {
                        class364.method2310((byte) 80);
                    }
                }
                if (class150.field2108) {
                    class109.method607(false, (byte) 98);
                    class310.method1943(class390.field5715.field6350[0] >> 3, class390.field5715.field6351[0] >> 3, (byte) -53);
                    class369.method2327(0);
                    class93.method500(false, (int[][]) null, (byte) -104, class218.field2991, 4);
                    var9 = class30.field278[0];
                    class59.method367(true, (byte) -124);
                    class334.method2145(false, (byte) 53);
                }
                class308.method1926((byte) 110);
                class59.method367(true, (byte) -127);
                class67.method399(4, (class319) null, false, class54.field613, 122, class218.field2991);
                class133.method788(4, class218.field2991, 118);
                class59.method367(true, (byte) -121);
                int var10 = class233.field3176;
                if (class410.field5931 < var10) {
                    var10 = class410.field5931;
                }
                if ((class410.field5931 - 1) > var10) {
                    var10 = class410.field5931 - 1;
                }
                if (class257.method1613(-122)) {
                    class83.method456(0);
                } else {
                    class83.method456(var10);
                }
                class192.method1230(true);
                if (var5) {
                    class103.method559(true);
                    class401.method2538(1, 1);
                    if (!class150.field2108) {
                        class215.method1404(177, true);
                        class93.method500(true, var9, (byte) -111, class218.field2991, 1);
                        class59.method367(true, (byte) -123);
                        class130.method782(true, 230066952);
                        class133.method788(1, class218.field2991, 86);
                    }
                    if (class150.field2108) {
                        class109.method607(true, (byte) 87);
                        class93.method500(true, var9, (byte) -125, class218.field2991, 1);
                        class59.method367(true, (byte) -122);
                        class334.method2145(true, (byte) 53);
                    }
                    class308.method1926((byte) -51);
                    class59.method367(true, (byte) -121);
                    class67.method399(1, class78.field887[0], true, class54.field613, -81, class218.field2991);
                    class133.method788(1, class218.field2991, 126);
                    class59.method367(true, (byte) -127);
                    class192.method1230(true);
                    class103.method559(false);
                }
                for (int var11 = 0; var11 < 4; var11++) {
                    for (int var18 = 0; var18 < class279.field3935; var18++) {
                        for (int var19 = 0; var19 < class164.field2287; var19++) {
                            class32.method187(var11, 105, var19, var18);
                        }
                    }
                }
                class119.method677(4);
                class58.method365(-26586);
                client.method1072((byte) -121);
                class308.method1926((byte) -112);
                class400.field5808 = false;
                class189.method1211(false);
                if (class252.field3406 != null && class330.field4719 != null && class105.field1191 == 25) {
                    class119.field1556++;
                    class169.field2360.method809(224, -28022);
                    class169.field2360.method1361((byte) -120, 1057001181);
                }
                if (!class150.field2108) {
                    int var12 = (class426.field6175 - (class279.field3935 >> 4)) / 8;
                    int var13 = (class426.field6175 + (class279.field3935 >> 4)) / 8;
                    int var14 = (class367.field5357 - (class164.field2287 >> 4)) / 8;
                    int var15 = ((class164.field2287 >> 4) + class367.field5357) / 8;
                    for (int var16 = var12 - 1; var16 <= var13 + 1; var16++) {
                        for (int var17 = var14 - 1; var17 <= var15 + 1; var17++) {
                            if (var16 < var12 || var13 < var16 || var17 < var14 || var17 > var15) {
                                class282.field3968.method341((byte) 81, "m" + var16 + "_" + var17);
                                class282.field3968.method341((byte) 106, "l" + var16 + "_" + var17);
                            }
                        }
                    }
                }
                if (class105.field1191 == 28) {
                    class266.method1695(10, (byte) 87);
                } else {
                    class266.method1695(30, (byte) 73);
                    if (class330.field4719 != null) {
                        class169.field2360.method809(151, -28022);
                    }
                }
                class124.method701(81);
                class58.method365(-26586);
                class277.method1747((byte) -112);
            } else {
                class260.field3591 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(II)V")
    public class435(int arg0, int arg1) {
        this.field6374 = arg0;
        this.field6381 = arg1;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIII)I")
    public static final int method2707(int arg0, int arg1, int arg2, int arg3) {
        field6383++;
        if (arg0 == arg1) {
            return arg1;
        }
        int var4 = 128 - arg2;
        if (arg3 != 14760) {
            method2703(-38);
        }
        int var5 = (arg0 & 0x7F) * arg2 + (arg1 & 0x7F) * var4 >> 7;
        int var6 = (arg0 & 0x380) * arg2 + (arg1 & 0x380) * var4 >> 7;
        int var7 = (arg1 & 0xFC00) * var4 + ((arg0 & 0xFC00) * arg2) >> 7;
        return var5 & 0x7F | var7 & 0xFC00 | var6 & 0x380;
    }
}
