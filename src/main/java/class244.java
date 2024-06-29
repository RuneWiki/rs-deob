import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class244 extends class154 {

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    public int field3832;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    public int field3831;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "Ljava/lang/String;")
    public static String field3827 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I[[[Lbe;IBIZ)Z")
    public static final boolean method1601(int arg0, class91[][][] arg1, int arg2, byte arg3, int arg4, boolean arg5) {
        field3833++;
        byte var6 = arg5 ? 1 : (byte) (class167.field2396 & 0xFF);
        if (class51.field724[class166.field2364][arg4][arg0] == var6) {
            return false;
        } else if ((class164.field2333[class166.field2364][arg4][arg0] & 0x4) == 0) {
            return false;
        } else {
            int var7 = 0;
            byte var8 = 0;
            class23.field357[var8] = arg4;
            int var31 = var8 + 1;
            class301.field4784[var8] = arg0;
            class51.field724[class166.field2364][arg4][arg0] = var6;
            if (arg3 > -88) {
                method1601(-76, (class91[][][]) null, -83, (byte) -29, 124, false);
            }
            while (var7 != var31) {
                int var9 = class23.field357[var7] & 0xFFFF;
                int var10 = class23.field357[var7] >> 16 & 0xFF;
                int var11 = class23.field357[var7] >> 24 & 0xFF;
                int var12 = (class301.field4784[var7] & 0xFFF688) >> 16;
                int var13 = class301.field4784[var7] & 0xFFFF;
                var7 = var7 + 1 & 0xFFF;
                boolean var14 = false;
                boolean var15 = false;
                if ((class164.field2333[class166.field2364][var9][var13] & 0x4) == 0) {
                    var14 = true;
                }
                label227: for (int var16 = class166.field2364 + 1; var16 <= 3; var16++) {
                    if ((class164.field2333[var16][var9][var13] & 0x8) == 0) {
                        if (var14 && arg1[var16][var9][var13] != null) {
                            if (arg1[var16][var9][var13].field1334 != null) {
                                int var19 = class177.method1106((byte) -102, var10);
                                if (arg1[var16][var9][var13].field1334.field2731 == var19 || arg1[var16][var9][var13].field1334.field2734 == var19) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var20 = class177.method1106((byte) -102, var11);
                                    if (arg1[var16][var9][var13].field1334.field2731 == var20 || arg1[var16][var9][var13].field1334.field2734 == var20) {
                                        continue;
                                    }
                                }
                                if (var12 != 0) {
                                    int var21 = class177.method1106((byte) -102, var12);
                                    if (arg1[var16][var9][var13].field1334.field2731 == var21 || arg1[var16][var9][var13].field1334.field2734 == var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg1[var16][var9][var13].field1339 != null) {
                                for (int var22 = 0; var22 < arg1[var16][var9][var13].field1343; var22++) {
                                    int var23 = (int) (arg1[var16][var9][var13].field1339[var22].field2225 >> 14 & 0x3FL);
                                    if (var23 == 21) {
                                        var23 = 19;
                                    }
                                    int var24 = (int) (arg1[var16][var9][var13].field1339[var22].field2225 >> 20 & 0x3L);
                                    int var25 = var24 << 6 | var23;
                                    if (var10 == var25 || var11 != 0 && var11 == var25 || var12 != 0 && var12 == var25) {
                                        continue label227;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class91 var26 = arg1[var16][var9][var13];
                        if (var26 != null && var26.field1343 > 0) {
                            for (int var27 = 0; var27 < var26.field1343; var27++) {
                                class160 var28 = var26.field1339[var27];
                                if (var28.field2234 != var28.field2224 || var28.field2229 != var28.field2228) {
                                    for (int var29 = var28.field2234; var29 <= var28.field2224; var29++) {
                                        for (int var30 = var28.field2229; var30 <= var28.field2228; var30++) {
                                            class51.field724[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class51.field724[var16][var9][var13] = var6;
                    }
                }
                if (var15) {
                    if (class185.field2812[class166.field2364 + 1][var9][var13] > class5.field48[arg2]) {
                        class5.field48[arg2] = class185.field2812[class166.field2364 + 1][var9][var13];
                    }
                    int var17 = var9 << 7;
                    int var18 = var13 << 7;
                    if (class72.field1037[arg2] > var17) {
                        class72.field1037[arg2] = var17;
                    } else if (class31.field465[arg2] < var17) {
                        class31.field465[arg2] = var17;
                    }
                    if (class42.field625[arg2] > var18) {
                        class42.field625[arg2] = var18;
                    } else if (var18 > class136.field1863[arg2]) {
                        class136.field1863[arg2] = var18;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class51.field724[class166.field2364][var9 - 1][var13] != var6) {
                        class23.field357[var31] = class161.method1003(-754974720, class161.method1003(1179648, var9 - 1));
                        class301.field4784[var31] = class161.method1003(1245184, var13);
                        class51.field724[class166.field2364][var9 - 1][var13] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var13++;
                    if (var13 < 104) {
                        if ((var9 - 1) >= 0 && class51.field724[class166.field2364][var9 - 1][var13] != var6 && (class164.field2333[class166.field2364][var9][var13] & 0x4) == 0 && (class164.field2333[class166.field2364][var9 - 1][var13 - 1] & 0x4) == 0) {
                            class23.field357[var31] = class161.method1003(class161.method1003(1179648, var9 - 1), 1375731712);
                            class301.field4784[var31] = class161.method1003(1245184, var13);
                            class51.field724[class166.field2364][var9 - 1][var13] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class51.field724[class166.field2364][var9][var13] != var6) {
                            class23.field357[var31] = class161.method1003(class161.method1003(var9, 5373952), 318767104);
                            class301.field4784[var31] = class161.method1003(5439488, var13);
                            class51.field724[class166.field2364][var9][var13] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < 104 && class51.field724[class166.field2364][var9 + 1][var13] != var6 && (class164.field2333[class166.field2364][var9][var13] & 0x4) == 0 && (class164.field2333[class166.field2364][var9 + 1][var13 - 1] & 0x4) == 0) {
                            class23.field357[var31] = class161.method1003(-1845493760, class161.method1003(5373952, var9 + 1));
                            class301.field4784[var31] = class161.method1003(var13, 5439488);
                            class51.field724[class166.field2364][var9 + 1][var13] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                    var13--;
                    if ((var9 + 1) < 104 && class51.field724[class166.field2364][var9 + 1][var13] != var6) {
                        class23.field357[var31] = class161.method1003(class161.method1003(9568256, var9 + 1), 1392508928);
                        class301.field4784[var31] = class161.method1003(9633792, var13);
                        var31 = var31 + 1 & 0xFFF;
                        class51.field724[class166.field2364][var9 + 1][var13] = var6;
                    }
                    var13--;
                    if (var13 >= 0) {
                        if ((var9 - 1) >= 0 && class51.field724[class166.field2364][var9 - 1][var13] != var6 && (class164.field2333[class166.field2364][var9][var13] & 0x4) == 0 && (class164.field2333[class166.field2364][var9 - 1][var13 + 1] & 0x4) == 0) {
                            class23.field357[var31] = class161.method1003(class161.method1003(var9 - 1, 13762560), 301989888);
                            class301.field4784[var31] = class161.method1003(var13, 13828096);
                            var31 = var31 + 1 & 0xFFF;
                            class51.field724[class166.field2364][var9 - 1][var13] = var6;
                        }
                        if (class51.field724[class166.field2364][var9][var13] != var6) {
                            class23.field357[var31] = class161.method1003(-1828716544, class161.method1003(var9, 13762560));
                            class301.field4784[var31] = class161.method1003(var13, 13828096);
                            class51.field724[class166.field2364][var9][var13] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (var9 + 1 < 104 && class51.field724[class166.field2364][var9 + 1][var13] != var6 && (class164.field2333[class166.field2364][var9][var13] & 0x4) == 0 && (class164.field2333[class166.field2364][var9 + 1][var13 + 1] & 0x4) == 0) {
                            class23.field357[var31] = class161.method1003(-771751936, class161.method1003(var9 + 1, 9568256));
                            class301.field4784[var31] = class161.method1003(9633792, var13);
                            var31 = var31 + 1 & 0xFFF;
                            class51.field724[class166.field2364][var9 + 1][var13] = var6;
                        }
                    }
                }
            }
            if (class5.field48[arg2] != -1000000) {
                class5.field48[arg2] += 10;
                class72.field1037[arg2] -= 50;
                class31.field465[arg2] += 50;
                class136.field1863[arg2] += 50;
                class42.field625[arg2] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
    public static void method1602(byte arg0) {
        if (arg0 > 0) {
            field3827 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V")
    public static final void method1603(byte arg0) {
        class192.field2925.method948((byte) 58);
        field3828++;
        if (arg0 != 99) {
            method1605((class305) null, (class305) null, (class305) null, -54, (class305) null);
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(II)V")
    public class244(int arg0, int arg1) {
        this.field3832 = arg0;
        this.field3831 = arg1;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1604(String arg0, int arg1) {
        field3829++;
        if (arg0 == null) {
            return;
        }
        String var2 = class248.method1618((byte) 104, arg0);
        if (var2 == null) {
            return;
        }
        if (arg1 != -11224) {
            field3827 = null;
        }
        for (int var3 = 0; var3 < class256.field4092; var3++) {
            String var4 = class248.method1618((byte) 117, class195.field2970[var3]);
            if (var4 != null && var4.equals(var2)) {
                class256.field4092--;
                for (int var5 = var3; var5 < class256.field4092; var5++) {
                    class195.field2970[var5] = class195.field2970[var5 + 1];
                    class228.field3573[var5] = class228.field3573[var5 + 1];
                    class26.field418[var5] = class26.field418[var5 + 1];
                }
                class175.field2474++;
                class68.field964 = class142.field1953;
                class231.field3614.method809(19, 0);
                class231.field3614.method1363(class231.method1518(arg0, 85), -38);
                class231.field3614.method1384(arg0, -595448376);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lnh;Lnh;Lnh;ILnh;)V")
    public static final void method1605(class305 arg0, class305 arg1, class305 arg2, int arg3, class305 arg4) {
        field3830++;
        class110.field1568 = arg2;
        class252.field3940 = arg0;
        class255.field4000 = arg4;
        class24.field385 = arg1;
        if (arg3 != -1) {
            field3827 = null;
        }
        class262.field4214 = new class178[class110.field1568.method2048(true)][];
        class191.field2906 = new boolean[class110.field1568.method2048(true)];
    }
}
