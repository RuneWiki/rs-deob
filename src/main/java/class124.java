import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class124 implements Runnable {

    @OriginalMember(owner = "client!la", name = "b", descriptor = "Z")
    public boolean field2064 = true;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "Ljava/lang/Object;")
    public Object field2067 = new Object();

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public int field2072 = 0;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "[I")
    public int[] field2074 = new int[500];

    @OriginalMember(owner = "client!la", name = "k", descriptor = "[I")
    public int[] field2073 = new int[500];

    @OriginalMember(owner = "client!la", name = "a", descriptor = "Z")
    public static boolean field2063 = false;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field2066 = 0;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2070 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Leb;IBII)V")
    public static final void method862(class103 arg0, int arg1, byte arg2, int arg3, int arg4) {
        field2069++;
        class280.method1873((byte) -54);
        int var5 = -118 / ((61 - arg2) / 52);
        class63.method494(arg4, arg1, arg0.field1691 + arg4, arg0.field1693 + arg1);
        if (class52.field742 == 2 || class52.field742 == 5 || class162.field2639 == null) {
            class63.method490(arg4, arg1, 0, arg0.field1711, arg0.field1617);
        } else {
            int var6 = (class197.field3179.field614 / 32) + 48;
            int var7 = (int) class121.field2039 + class93.field1330 & 0x7FF;
            int var8 = 464 - (class197.field3179.field613 / 32);
            ((class43) class162.field2639).method165(arg4, arg1, arg0.field1691, arg0.field1693, var6, var8, var7, class77.field1050 + 256, arg0.field1711, arg0.field1617);
            if (class233.field3699 != null) {
                for (int var9 = 0; var9 < class233.field3699.field1086; var9++) {
                    if (class233.field3699.method591(var9, 4)) {
                        int var10 = ((class233.field3699.field1088[var9] & 0x3FFF) - class93.field1321) * 4 + 2 - (class197.field3179.field613 / 32);
                        int var11 = ((class233.field3699.field1088[var9] >> 14 & 0x3FFF) - class296.field4685) * 4 - (class197.field3179.field614 / 32 - 2);
                        int var12 = class145.field2348[var7];
                        int var13 = var12 * 256 / (class77.field1050 + 256);
                        int var14 = class145.field2338[var7];
                        int var15 = var14 * 256 / (class77.field1050 + 256);
                        int var16 = var10 * var15 + var11 * var13 >> 16;
                        int var17 = var10 * var13 - (var11 * var15) >> 16;
                        class163 var18 = class122.field2050;
                        if (class233.field3699.method592(260, var9) == 1) {
                            var18 = class58.field809;
                        }
                        if (class233.field3699.method592(260, var9) == 2) {
                            var18 = class283.field4524;
                        }
                        int var19 = var18.method1143(class233.field3699.field1083[var9], 100);
                        int var20 = var16 - var19 / 2;
                        if ((-arg0.field1691) <= var20 && arg0.field1691 >= var20 && var17 >= (-arg0.field1693) && var17 <= arg0.field1693) {
                            int var21 = 16777215;
                            if (class233.field3699.field1087[var9] != -1) {
                                var21 = class233.field3699.field1087[var9];
                            }
                            class63.method506(arg0.field1711, arg0.field1617);
                            var18.method1132(class233.field3699.field1083[var9], var20 + (arg0.field1691 / 2) + arg4, arg0.field1693 / 2 + -var17 + arg1, var19, 50, var21, 0, 256, 1, 0, 0);
                            class63.method492();
                        }
                    }
                }
            }
            for (int var22 = 0; var22 < class251.field4020; var22++) {
                int var59 = class283.field4518[var22] * 4 + 2 - class197.field3179.field614 / 32;
                int var60 = class116.field1980[var22] * 4 + 2 - (class197.field3179.field613 / 32);
                class94 var61 = class119.method842(120, class133.field2202[var22]);
                if (var61.field1345 != null) {
                    var61 = var61.method658(3834);
                    if (var61 == null || var61.field1337 == -1) {
                        continue;
                    }
                }
                class156.method1048(var60, arg1, class183.field2930[var61.field1337], var59, arg0, arg4, (byte) 41);
            }
            for (int var23 = 0; var23 < 104; var23++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    class48 var56 = class244.field3913[class28.field336][var23][var55];
                    if (var56 != null) {
                        int var57 = var23 * 4 + 2 - (class197.field3179.field614 / 32);
                        int var58 = var55 * 4 + 2 - class197.field3179.field613 / 32;
                        class156.method1048(var58, arg1, class94.field1364[0], var57, arg0, arg4, (byte) 41);
                    }
                }
            }
            for (int var24 = 0; var24 < class251.field4027; var24++) {
                class275 var51 = class198.field3193[class134.field2250[var24]];
                if (var51 != null && var51.method376(-11127)) {
                    class265 var52 = var51.field4439;
                    if (var52 != null && var52.field4271 != null) {
                        var52 = var52.method1794(-8159);
                    }
                    if (var52 != null && var52.field4268 && var52.field4282) {
                        int var53 = var51.field614 / 32 - (class197.field3179.field614 / 32);
                        int var54 = var51.field613 / 32 - (class197.field3179.field613 / 32);
                        if (var52.field4299 == -1) {
                            class156.method1048(var54, arg1, class94.field1364[1], var53, arg0, arg4, (byte) 41);
                        } else {
                            class156.method1048(var54, arg1, class183.field2930[var52.field4299], var53, arg0, arg4, (byte) 41);
                        }
                    }
                }
            }
            for (int var25 = 0; var25 < class70.field969; var25++) {
                class235 var41 = class260.field4141[class51.field721[var25]];
                if (var41 != null && var41.method376(-11127)) {
                    int var42 = var41.field614 / 32 - (class197.field3179.field614 / 32);
                    int var43 = var41.field613 / 32 - class197.field3179.field613 / 32;
                    long var44 = class238.method1570(var41.field3735, (byte) 101);
                    boolean var46 = false;
                    for (int var47 = 0; var47 < class264.field4224; var47++) {
                        if (class266.field4313[var47] == var44 && class151.field2430[var47] != 0) {
                            var46 = true;
                            break;
                        }
                    }
                    boolean var48 = false;
                    for (int var49 = 0; var49 < class178.field2889; var49++) {
                        if (class69.field961[var49].field962 == var44) {
                            var48 = true;
                            break;
                        }
                    }
                    boolean var50 = false;
                    if (class197.field3179.field3749 != 0 && var41.field3749 != 0 && class197.field3179.field3749 == var41.field3749) {
                        var50 = true;
                    }
                    if (var46) {
                        class156.method1048(var43, arg1, class94.field1364[3], var42, arg0, arg4, (byte) 41);
                    } else if (var48) {
                        class156.method1048(var43, arg1, class94.field1364[5], var42, arg0, arg4, (byte) 41);
                    } else if (var50) {
                        class156.method1048(var43, arg1, class94.field1364[4], var42, arg0, arg4, (byte) 41);
                    } else {
                        class156.method1048(var43, arg1, class94.field1364[2], var42, arg0, arg4, (byte) 41);
                    }
                }
            }
            class115[] var26 = class293.field4649;
            for (int var27 = 0; var27 < var26.length; var27++) {
                class115 var30 = var26[var27];
                if (var30 != null && var30.field1967 != 0 && class9.field141 % 20 < 10) {
                    if (var30.field1967 == 1 && var30.field1960 >= 0 && class198.field3193.length > var30.field1960) {
                        class275 var31 = class198.field3193[var30.field1960];
                        if (var31 != null) {
                            int var32 = var31.field614 / 32 - (class197.field3179.field614 / 32);
                            int var33 = var31.field613 / 32 - class197.field3179.field613 / 32;
                            class189.method1288(false, 360000, arg4, var32, var30.field1970, var33, arg0, arg1);
                        }
                    }
                    if (var30.field1967 == 2) {
                        int var34 = (var30.field1963 - class296.field4685) * 4 + 2 - class197.field3179.field614 / 32;
                        int var35 = var30.field1975 * 4;
                        int var36 = (var30.field1973 - class93.field1321) * 4 + 2 - class197.field3179.field613 / 32;
                        int var37 = var35 * var35;
                        class189.method1288(false, var37, arg4, var34, var30.field1970, var36, arg0, arg1);
                    }
                    if (var30.field1967 == 10 && var30.field1960 >= 0 && var30.field1960 < class260.field4141.length) {
                        class235 var38 = class260.field4141[var30.field1960];
                        if (var38 != null) {
                            int var39 = var38.field614 / 32 - (class197.field3179.field614 / 32);
                            int var40 = var38.field613 / 32 - (class197.field3179.field613 / 32);
                            class189.method1288(false, 360000, arg4, var39, var30.field1970, var40, arg0, arg1);
                        }
                    }
                }
            }
            if (class5.field60 != 0) {
                int var28 = class5.field60 * 4 + (class197.field3179.method385((byte) -61) * 2) + 2 - (class197.field3179.field614 / 32) - 2;
                int var29 = class184.field2932 * 4 + class197.field3179.method385((byte) -85) * 2 + 2 - (class197.field3179.field613 / 32) - 2;
                class156.method1048(var29, arg1, class222.field3531, var28, arg0, arg4, (byte) 41);
            }
            class63.method507(arg4 + (arg0.field1691 / 2) - 1, arg0.field1693 / 2 + arg1 + -1, 3, 3, 16777215);
        }
        class217.field3482[arg3] = true;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BLeb;I)I")
    public static final int method863(byte arg0, class103 arg1, int arg2) {
        field2065++;
        if (arg1.field1689 == null || arg2 >= arg1.field1689.length) {
            return -2;
        }
        try {
            int[] var3 = arg1.field1689[arg2];
            int var4 = 0;
            if (arg0 <= 113) {
                field2063 = true;
            }
            byte var5 = 0;
            int var6 = 0;
            while (true) {
                int var7 = var3[var6++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 1) {
                    var8 = class242.field3886[var3[var6++]];
                }
                if (var7 == 2) {
                    var8 = class52.field735[var3[var6++]];
                }
                if (var7 == 3) {
                    var8 = class281.field4492[var3[var6++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var6++] << 16;
                    int var11 = var10 + var3[var6++];
                    class103 var12 = class168.method1180(8931, var11);
                    int var13 = var3[var6++];
                    if (var13 != -1 && (!class64.method514(var13, 0).field3391 || class294.field4662)) {
                        for (int var14 = 0; var14 < var12.field1547.length; var14++) {
                            if ((var13 + 1) == var12.field1547[var14]) {
                                var8 += var12.field1592[var14];
                            }
                        }
                    }
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 5) {
                    var8 = class214.field3454[var3[var6++]];
                }
                if (var7 == 6) {
                    var8 = class12.field165[class52.field735[var3[var6++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class214.field3454[var3[var6++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class197.field3179.field3760;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class191.field3041[var15]) {
                            var8 += class52.field735[var15];
                        }
                    }
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 10) {
                    int var16 = var3[var6++] << 16;
                    int var17 = var16 + var3[var6++];
                    class103 var18 = class168.method1180(8931, var17);
                    int var19 = var3[var6++];
                    if (var19 != -1 && (!class64.method514(var19, 0).field3391 || class294.field4662)) {
                        for (int var20 = 0; var20 < var18.field1547.length; var20++) {
                            if (var19 + 1 == var18.field1547[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class297.field4708;
                }
                if (var7 == 12) {
                    var8 = class72.field982;
                }
                if (var7 == 13) {
                    int var21 = class214.field3454[var3[var6++]];
                    int var22 = var3[var6++];
                    var8 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var6++];
                    var8 = class293.method1963((byte) -61, var23);
                }
                if (var7 == 18) {
                    var8 = (class197.field3179.field614 >> 7) + class296.field4685;
                }
                if (var7 == 19) {
                    var8 = (class197.field3179.field613 >> 7) + class93.field1321;
                }
                if (var7 == 20) {
                    var8 = var3[var6++];
                }
                if (var9 == 0) {
                    if (var5 == 0) {
                        var4 += var8;
                    }
                    if (var5 == 1) {
                        var4 -= var8;
                    }
                    if (var5 == 2 && var8 != 0) {
                        var4 /= var8;
                    }
                    if (var5 == 3) {
                        var4 *= var8;
                    }
                    var5 = 0;
                } else {
                    var5 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
    public static void method864(byte arg0) {
        field2070 = null;
        int var1 = 44 / ((-arg0 - 10) / 52);
    }

    @OriginalMember(owner = "client!la", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field2064) {
            Object var1 = this.field2067;
            synchronized (this.field2067) {
                if (this.field2072 < 500) {
                    this.field2074[this.field2072] = class109.field1893;
                    this.field2073[this.field2072] = class250.field4000;
                    this.field2072++;
                }
            }
            class208.method1408(90, 50L);
        }
        field2071++;
    }
}
