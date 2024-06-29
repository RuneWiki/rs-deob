import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class382 {

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "[Ljava/lang/String;")
    private static String[] field5234 = new String[1000];

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "[I")
    private static int[] field5243 = new int[1000];

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "[Lol;")
    private static class172[] field5236 = new class172[50];

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    private static int field5237 = 0;

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "[[I")
    private static int[][] field5252 = new int[5][5000];

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    private static int field5233 = 0;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
    private static int field5249 = 0;

    @OriginalMember(owner = "client!lk", name = "y", descriptor = "[I")
    private static int[] field5257 = new int[5];

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "Ljava/util/Calendar;")
    private static Calendar field5251 = Calendar.getInstance();

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "[I")
    private static int[] field5258 = new int[3];

    @OriginalMember(owner = "client!lk", name = "B", descriptor = "[Ljava/lang/String;")
    private static String[] field5260 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!lk", name = "A", descriptor = "Lhu;")
    public static class76 field5259 = new class76(4);

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "Lgr;")
    private static class274 field5250;

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "Lnk;")
    private static class464 field5254;

    @OriginalMember(owner = "client!lk", name = "w", descriptor = "Lnk;")
    private static class464 field5255;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "[I")
    private static int[] field5240;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "[Ljava/lang/String;")
    private static String[] field5247;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "()V")
    public static void method2338() {
        field5240 = null;
        field5247 = null;
        field5257 = null;
        field5252 = null;
        field5243 = null;
        field5234 = null;
        field5236 = null;
        field5254 = null;
        field5255 = null;
        field5250 = null;
        field5251 = null;
        field5260 = null;
        field5258 = null;
        field5259 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
    private static final void method2339(int arg0) {
        class464 var1 = class150.method888((byte) -115, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class464[] var3 = class392.field5437[var2];
        if (var3 == null) {
            class464[] var4 = class146.field2099[var2];
            int var5 = var4.length;
            var3 = class392.field5437[var2] = new class464[var5];
            class380.method2336(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class380.method2336(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lfn;)V")
    public static final void method2340(class82 arg0) {
        method2342(arg0, 200000);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method2341(String arg0, int arg1) {
        if (class348.field4799 == 0 && !(!class458.field6212 || class330.field4384) || class129.field1900) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class311.field4099.method1176(0, (byte) -96))) {
            var3 = 0;
            arg0 = arg0.substring(class311.field4099.method1176(0, (byte) -101).length());
        } else if (var2.startsWith(class132.field1936.method1176(0, (byte) -108))) {
            var3 = 1;
            arg0 = arg0.substring(class132.field1936.method1176(0, (byte) -125).length());
        } else if (var2.startsWith(class437.field5932.method1176(0, (byte) -101))) {
            var3 = 2;
            arg0 = arg0.substring(class437.field5932.method1176(0, (byte) -101).length());
        } else if (var2.startsWith(class318.field4198.method1176(0, (byte) -107))) {
            var3 = 3;
            arg0 = arg0.substring(class318.field4198.method1176(0, (byte) -89).length());
        } else if (var2.startsWith(class135.field1964.method1176(0, (byte) -126))) {
            var3 = 4;
            arg0 = arg0.substring(class135.field1964.method1176(0, (byte) -104).length());
        } else if (var2.startsWith(class298.field3994.method1176(0, (byte) -102))) {
            var3 = 5;
            arg0 = arg0.substring(class298.field3994.method1176(0, (byte) -119).length());
        } else if (var2.startsWith(class4.field52.method1176(0, (byte) -104))) {
            var3 = 6;
            arg0 = arg0.substring(class4.field52.method1176(0, (byte) -99).length());
        } else if (var2.startsWith(class450.field6123.method1176(0, (byte) -106))) {
            var3 = 7;
            arg0 = arg0.substring(class450.field6123.method1176(0, (byte) -95).length());
        } else if (var2.startsWith(class317.field4181.method1176(0, (byte) -103))) {
            var3 = 8;
            arg0 = arg0.substring(class317.field4181.method1176(0, (byte) -102).length());
        } else if (var2.startsWith(class183.field2511.method1176(0, (byte) -91))) {
            var3 = 9;
            arg0 = arg0.substring(class183.field2511.method1176(0, (byte) -126).length());
        } else if (var2.startsWith(class324.field4315.method1176(0, (byte) -116))) {
            var3 = 10;
            arg0 = arg0.substring(class324.field4315.method1176(0, (byte) -115).length());
        } else if (var2.startsWith(class196.field2672.method1176(0, (byte) -114))) {
            var3 = 11;
            arg0 = arg0.substring(class196.field2672.method1176(0, (byte) -108).length());
        } else if (class110.field1676 != 0) {
            if (var2.startsWith(class311.field4099.method1176(class110.field1676, (byte) -110))) {
                var3 = 0;
                arg0 = arg0.substring(class311.field4099.method1176(class110.field1676, (byte) -95).length());
            } else if (var2.startsWith(class132.field1936.method1176(class110.field1676, (byte) -124))) {
                var3 = 1;
                arg0 = arg0.substring(class132.field1936.method1176(class110.field1676, (byte) -115).length());
            } else if (var2.startsWith(class437.field5932.method1176(class110.field1676, (byte) -110))) {
                var3 = 2;
                arg0 = arg0.substring(class437.field5932.method1176(class110.field1676, (byte) -102).length());
            } else if (var2.startsWith(class318.field4198.method1176(class110.field1676, (byte) -91))) {
                var3 = 3;
                arg0 = arg0.substring(class318.field4198.method1176(class110.field1676, (byte) -104).length());
            } else if (var2.startsWith(class135.field1964.method1176(class110.field1676, (byte) -96))) {
                var3 = 4;
                arg0 = arg0.substring(class135.field1964.method1176(class110.field1676, (byte) -120).length());
            } else if (var2.startsWith(class298.field3994.method1176(class110.field1676, (byte) -117))) {
                var3 = 5;
                arg0 = arg0.substring(class298.field3994.method1176(class110.field1676, (byte) -125).length());
            } else if (var2.startsWith(class4.field52.method1176(class110.field1676, (byte) -96))) {
                var3 = 6;
                arg0 = arg0.substring(class4.field52.method1176(class110.field1676, (byte) -94).length());
            } else if (var2.startsWith(class450.field6123.method1176(class110.field1676, (byte) -118))) {
                var3 = 7;
                arg0 = arg0.substring(class450.field6123.method1176(class110.field1676, (byte) -117).length());
            } else if (var2.startsWith(class317.field4181.method1176(class110.field1676, (byte) -89))) {
                var3 = 8;
                arg0 = arg0.substring(class317.field4181.method1176(class110.field1676, (byte) -128).length());
            } else if (var2.startsWith(class183.field2511.method1176(class110.field1676, (byte) -120))) {
                var3 = 9;
                arg0 = arg0.substring(class183.field2511.method1176(class110.field1676, (byte) -126).length());
            } else if (var2.startsWith(class324.field4315.method1176(class110.field1676, (byte) -127))) {
                var3 = 10;
                arg0 = arg0.substring(class324.field4315.method1176(class110.field1676, (byte) -93).length());
            } else if (var2.startsWith(class196.field2672.method1176(class110.field1676, (byte) -94))) {
                var3 = 11;
                arg0 = arg0.substring(class196.field2672.method1176(class110.field1676, (byte) -98).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class197.field2679.method1176(0, (byte) -116))) {
            var5 = 1;
            arg0 = arg0.substring(class197.field2679.method1176(0, (byte) -114).length());
        } else if (var4.startsWith(class87.field1217.method1176(0, (byte) -96))) {
            var5 = 2;
            arg0 = arg0.substring(class87.field1217.method1176(0, (byte) -98).length());
        } else if (var4.startsWith(class62.field819.method1176(0, (byte) -108))) {
            var5 = 3;
            arg0 = arg0.substring(class62.field819.method1176(0, (byte) -101).length());
        } else if (var4.startsWith(class336.field4537.method1176(0, (byte) -127))) {
            var5 = 4;
            arg0 = arg0.substring(class336.field4537.method1176(0, (byte) -127).length());
        } else if (var4.startsWith(class249.field3322.method1176(0, (byte) -113))) {
            var5 = 5;
            arg0 = arg0.substring(class249.field3322.method1176(0, (byte) -116).length());
        } else if (class110.field1676 != 0) {
            if (var4.startsWith(class197.field2679.method1176(class110.field1676, (byte) -88))) {
                var5 = 1;
                arg0 = arg0.substring(class197.field2679.method1176(class110.field1676, (byte) -127).length());
            } else if (var4.startsWith(class87.field1217.method1176(class110.field1676, (byte) -94))) {
                var5 = 2;
                arg0 = arg0.substring(class87.field1217.method1176(class110.field1676, (byte) -101).length());
            } else if (var4.startsWith(class62.field819.method1176(class110.field1676, (byte) -115))) {
                var5 = 3;
                arg0 = arg0.substring(class62.field819.method1176(class110.field1676, (byte) -105).length());
            } else if (var4.startsWith(class336.field4537.method1176(class110.field1676, (byte) -100))) {
                var5 = 4;
                arg0 = arg0.substring(class336.field4537.method1176(class110.field1676, (byte) -99).length());
            } else if (var4.startsWith(class249.field3322.method1176(class110.field1676, (byte) -116))) {
                var5 = 5;
                arg0 = arg0.substring(class249.field3322.method1176(class110.field1676, (byte) -125).length());
            }
        }
        field5244++;
        class491.method2861(class195.field2644, 1);
        class203.field2751.method228(0, 32);
        int var6 = class203.field2751.field456;
        if (arg1 == 5021) {
            class203.field2751.method228(1, 32);
        } else {
            class203.field2751.method228(0, 32);
        }
        class203.field2751.method228(var3, 32);
        class203.field2751.method228(var5, 32);
        class33.method250(arg0, 0, class203.field2751);
        class203.field2751.method247(true, class203.field2751.field456 - var6);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lfn;I)V")
    private static final void method2342(class82 arg0, int arg1) {
        Object[] var2 = arg0.field1085;
        int var3 = (Integer) var2[0];
        class199 var4 = class110.method713(var3, (byte) -50);
        if (var4 == null) {
            return;
        }
        field5240 = new int[var4.field2684];
        int var5 = 0;
        field5247 = new String[var4.field2694];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field1091;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field1092;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field1086 == null ? -1 : arg0.field1086.field6440;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field1095;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field1086 == null ? -1 : arg0.field1086.field6397;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field1093 == null ? -1 : arg0.field1093.field6440;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field1093 == null ? -1 : arg0.field1093.field6397;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field1089;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field1090;
                }
                field5240[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field1096;
                }
                field5247[var6++] = var9;
            }
        }
        method2349(var4, arg1);
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)Ljava/lang/String;")
    private static final String method2343(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field5251.setTime(new Date(var1));
        int var3 = field5251.get(5);
        int var4 = field5251.get(2);
        int var5 = field5251.get(1);
        return var3 + "-" + field5260[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZ)V")
    private static final void method2344(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field5233 -= 3;
                int var2 = field5243[field5233];
                int var3 = field5243[field5233 + 1];
                int var4 = field5243[field5233 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class464 var5 = class150.method888((byte) -115, var2);
                if (var5.field6360 == null) {
                    var5.field6360 = new class464[var4 + 1];
                }
                if (var5.field6360.length <= var4) {
                    class464[] var6 = new class464[var4 + 1];
                    for (int var7 = 0; var7 < var5.field6360.length; var7++) {
                        var6[var7] = var5.field6360[var7];
                    }
                    var5.field6360 = var6;
                }
                if (var4 > 0 && var5.field6360[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class464 var8 = new class464();
                var8.field6358 = var3;
                var8.field6362 = var8.field6440 = var5.field6440;
                var8.field6397 = var4;
                var5.field6360[var4] = var8;
                if (arg1) {
                    field5255 = var8;
                } else {
                    field5254 = var8;
                }
                class490.method2854(var5, (byte) 67);
                return;
            }
            if (arg0 == 101) {
                class464 var9 = arg1 ? field5255 : field5254;
                if (var9.field6397 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class464 var10 = class150.method888((byte) -115, var9.field6440);
                var10.field6360[var9.field6397] = null;
                class490.method2854(var10, (byte) 108);
                return;
            }
            if (arg0 == 102) {
                class464 var11 = class150.method888((byte) -115, field5243[--field5233]);
                var11.field6360 = null;
                class490.method2854(var11, (byte) 37);
                return;
            }
            if (arg0 == 200) {
                field5233 -= 2;
                int var12 = field5243[field5233];
                int var13 = field5243[field5233 + 1];
                class464 var14 = class78.method519(var12, var13, (byte) -72);
                if (var14 != null && var13 != -1) {
                    field5243[field5233++] = 1;
                    if (arg1) {
                        field5255 = var14;
                        return;
                    }
                    field5254 = var14;
                    return;
                }
                field5243[field5233++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field5243[--field5233];
                class464 var16 = class150.method888((byte) -115, var15);
                if (var16 != null) {
                    field5243[field5233++] = 1;
                    if (arg1) {
                        field5255 = var16;
                        return;
                    }
                    field5254 = var16;
                    return;
                }
                field5243[field5233++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field5243[--field5233];
                method2339(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field5243[--field5233];
                method2346(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field5233 -= 2;
                int var19 = field5243[field5233];
                int var20 = field5243[field5233 + 1];
                for (int var21 = 0; var21 < class268.field3577.length; var21++) {
                    if (class268.field3577[var21] == var19) {
                        class233.field3103.field6783.method1146(class28.field366, var21, 117, var20);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class373.field5115.length; var22++) {
                    if (class373.field5115[var22] == var19) {
                        class233.field3103.field6783.method1146(class28.field366, var22, 108, var20);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field5233 -= 2;
                int var23 = field5243[field5233];
                int var24 = field5243[field5233 + 1];
                class233.field3103.field6783.method1152(10, var23, var24);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field5243[--field5233] != 0;
                class233.field3103.field6783.method1148(var25, 1502081775);
                return;
            }
        } else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
            class464 var26;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var26 = class150.method888((byte) -115, field5243[--field5233]);
            } else {
                var26 = arg1 ? field5255 : field5254;
            }
            if (arg0 == 1000) {
                field5233 -= 4;
                var26.field6298 = field5243[field5233];
                var26.field6310 = field5243[field5233 + 1];
                int var27 = field5243[field5233 + 2];
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 5) {
                    var27 = 5;
                }
                int var28 = field5243[field5233 + 3];
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 5) {
                    var28 = 5;
                }
                var26.field6407 = (byte) var27;
                var26.field6426 = (byte) var28;
                class490.method2854(var26, (byte) 76);
                class261.method1467(var26, (byte) 90);
                if (var26.field6397 == -1) {
                    class196.method1120(var26.field6440, 87);
                }
                return;
            }
            if (arg0 == 1001) {
                field5233 -= 4;
                var26.field6392 = field5243[field5233];
                var26.field6381 = field5243[field5233 + 1];
                var26.field6314 = 0;
                var26.field6350 = 0;
                int var29 = field5243[field5233 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 4) {
                    var29 = 4;
                }
                int var30 = field5243[field5233 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 4) {
                    var30 = 4;
                }
                var26.field6434 = (byte) var29;
                var26.field6341 = (byte) var30;
                class490.method2854(var26, (byte) 109);
                class261.method1467(var26, (byte) 83);
                if (var26.field6358 == 0) {
                    class265.method1499(false, var26, (byte) -109);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var31 = field5243[--field5233] == 1;
                if (var26.field6348 != var31) {
                    var26.field6348 = var31;
                    class490.method2854(var26, (byte) 116);
                }
                if (var26.field6397 == -1) {
                    class168.method994(26648, var26.field6440);
                }
                return;
            }
            if (arg0 == 1004) {
                field5233 -= 2;
                var26.field6300 = field5243[field5233];
                var26.field6386 = field5243[field5233 + 1];
                class490.method2854(var26, (byte) 49);
                class261.method1467(var26, (byte) 105);
                if (var26.field6358 == 0) {
                    class265.method1499(false, var26, (byte) 106);
                }
                return;
            }
            if (arg0 == 1005) {
                var26.field6442 = field5243[--field5233] == 1;
                return;
            }
        } else if (!(arg0 < 1100 || arg0 >= 1200) || !(arg0 < 2100 || arg0 >= 2200)) {
            class464 var32;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var32 = class150.method888((byte) -115, field5243[--field5233]);
            } else {
                var32 = arg1 ? field5255 : field5254;
            }
            if (arg0 == 1100) {
                field5233 -= 2;
                var32.field6330 = field5243[field5233];
                if (var32.field6330 > var32.field6368 - var32.field6308) {
                    var32.field6330 = var32.field6368 - var32.field6308;
                }
                if (var32.field6330 < 0) {
                    var32.field6330 = 0;
                }
                var32.field6333 = field5243[field5233 + 1];
                if (var32.field6333 > var32.field6346 - var32.field6340) {
                    var32.field6333 = var32.field6346 - var32.field6340;
                }
                if (var32.field6333 < 0) {
                    var32.field6333 = 0;
                }
                class490.method2854(var32, (byte) 70);
                if (var32.field6397 == -1) {
                    class446.method2622(var32.field6440, (byte) -78);
                }
                return;
            }
            if (arg0 == 1101) {
                var32.field6382 = field5243[--field5233];
                class490.method2854(var32, (byte) 40);
                if (var32.field6397 == -1) {
                    class135.method822(4096, var32.field6440);
                }
                return;
            }
            if (arg0 == 1102) {
                var32.field6430 = field5243[--field5233] == 1;
                class490.method2854(var32, (byte) 120);
                return;
            }
            if (arg0 == 1103) {
                var32.field6425 = field5243[--field5233];
                class490.method2854(var32, (byte) 91);
                return;
            }
            if (arg0 == 1104) {
                var32.field6290 = field5243[--field5233];
                class490.method2854(var32, (byte) 52);
                return;
            }
            if (arg0 == 1105) {
                int var33 = field5243[--field5233];
                if (var32.field6393 != var33) {
                    var32.field6393 = var33;
                    class490.method2854(var32, (byte) 54);
                }
                if (var32.field6397 == -1) {
                    class99.method611(var32.field6440, false);
                }
                return;
            }
            if (arg0 == 1106) {
                var32.field6419 = field5243[--field5233];
                class490.method2854(var32, (byte) 32);
                return;
            }
            if (arg0 == 1107) {
                var32.field6379 = field5243[--field5233] == 1;
                class490.method2854(var32, (byte) 112);
                return;
            }
            if (arg0 == 1108) {
                var32.field6380 = 1;
                var32.field6431 = field5243[--field5233];
                class490.method2854(var32, (byte) 58);
                if (var32.field6397 == -1) {
                    class233.method1303(4, var32.field6440);
                }
                return;
            }
            if (arg0 == 1109) {
                field5233 -= 6;
                var32.field6365 = field5243[field5233];
                var32.field6312 = field5243[field5233 + 1];
                var32.field6445 = field5243[field5233 + 2];
                var32.field6361 = field5243[field5233 + 3];
                var32.field6443 = field5243[field5233 + 4];
                var32.field6324 = field5243[field5233 + 5];
                class490.method2854(var32, (byte) 36);
                if (var32.field6397 == -1) {
                    class365.method2233(5, var32.field6440);
                    class127.method781(true, var32.field6440);
                }
                return;
            }
            if (arg0 == 1110) {
                int var34 = field5243[--field5233];
                if (var32.field6401 != var34) {
                    var32.field6401 = var34;
                    var32.field6307 = 0;
                    var32.field6438 = 1;
                    var32.field6370 = 0;
                    class490.method2854(var32, (byte) 113);
                }
                if (var32.field6397 == -1) {
                    class424.method2504(var32.field6440, (byte) -42);
                }
                return;
            }
            if (arg0 == 1111) {
                var32.field6423 = field5243[--field5233] == 1;
                class490.method2854(var32, (byte) 38);
                return;
            }
            if (arg0 == 1112) {
                String var35 = field5234[--field5237];
                if (!var35.equals(var32.field6439)) {
                    var32.field6439 = var35;
                    class490.method2854(var32, (byte) 98);
                }
                if (var32.field6397 == -1) {
                    class163.method954((byte) -102, var32.field6440);
                }
                return;
            }
            if (arg0 == 1113) {
                var32.field6441 = field5243[--field5233];
                class490.method2854(var32, (byte) 68);
                if (var32.field6397 == -1) {
                    class450.method2650((byte) -95, var32.field6440);
                }
                return;
            }
            if (arg0 == 1114) {
                field5233 -= 3;
                var32.field6398 = field5243[field5233];
                var32.field6391 = field5243[field5233 + 1];
                var32.field6409 = field5243[field5233 + 2];
                class490.method2854(var32, (byte) 91);
                return;
            }
            if (arg0 == 1115) {
                var32.field6427 = field5243[--field5233] == 1;
                class490.method2854(var32, (byte) 66);
                return;
            }
            if (arg0 == 1116) {
                var32.field6366 = field5243[--field5233];
                class490.method2854(var32, (byte) 126);
                return;
            }
            if (arg0 == 1117) {
                var32.field6320 = field5243[--field5233];
                class490.method2854(var32, (byte) 83);
                return;
            }
            if (arg0 == 1118) {
                var32.field6306 = field5243[--field5233] == 1;
                class490.method2854(var32, (byte) 105);
                return;
            }
            if (arg0 == 1119) {
                var32.field6356 = field5243[--field5233] == 1;
                class490.method2854(var32, (byte) 77);
                return;
            }
            if (arg0 == 1120) {
                field5233 -= 2;
                var32.field6368 = field5243[field5233];
                var32.field6346 = field5243[field5233 + 1];
                class490.method2854(var32, (byte) 125);
                if (var32.field6358 == 0) {
                    class265.method1499(false, var32, (byte) -116);
                }
                return;
            }
            if (arg0 == 1121) {
                field5233 -= 2;
                var32.field6404 = (short) field5243[field5233];
                var32.field6292 = (short) field5243[field5233 + 1];
                class490.method2854(var32, (byte) 98);
                return;
            }
            if (arg0 == 1122) {
                var32.field6321 = field5243[--field5233] == 1;
                class490.method2854(var32, (byte) 62);
                return;
            }
            if (arg0 == 1123) {
                var32.field6324 = field5243[--field5233];
                class490.method2854(var32, (byte) 97);
                if (var32.field6397 == -1) {
                    class365.method2233(5, var32.field6440);
                }
                return;
            }
            if (arg0 == 1124) {
                int var36 = field5243[--field5233];
                var32.field6428 = var36 == 1;
                class490.method2854(var32, (byte) 126);
                return;
            }
            if (arg0 == 1125) {
                field5233 -= 2;
                var32.field6416 = field5243[field5233];
                var32.field6322 = field5243[field5233 + 1];
                class490.method2854(var32, (byte) 114);
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class464 var37;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var37 = class150.method888((byte) -115, field5243[--field5233]);
            } else {
                var37 = arg1 ? field5255 : field5254;
            }
            class490.method2854(var37, (byte) 90);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field5233 -= 2;
                int var38 = field5243[field5233];
                int var39 = field5243[field5233 + 1];
                if (var37.field6397 == -1) {
                    class293.method1647(-37, var37.field6440);
                    class365.method2233(5, var37.field6440);
                    class127.method781(true, var37.field6440);
                }
                if (var38 == -1) {
                    var37.field6380 = 1;
                    var37.field6431 = -1;
                    var37.field6402 = -1;
                    return;
                }
                var37.field6402 = var38;
                var37.field6294 = var39;
                if (arg0 == 1208 || arg0 == 1209) {
                    var37.field6297 = true;
                } else {
                    var37.field6297 = false;
                }
                class443 var40 = class175.field2385.method1557(var38, 21992);
                var37.field6445 = var40.field6014;
                var37.field6361 = var40.field5976;
                var37.field6443 = var40.field6018;
                var37.field6365 = var40.field6022;
                var37.field6312 = var40.field6000;
                var37.field6324 = var40.field6009;
                if (arg0 == 1205 || arg0 == 1209) {
                    var37.field6414 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var37.field6414 = 1;
                } else {
                    var37.field6414 = 2;
                }
                if (var37.field6314 > 0) {
                    var37.field6324 = var37.field6324 * 32 / var37.field6314;
                    return;
                }
                if (var37.field6392 > 0) {
                    var37.field6324 = var37.field6324 * 32 / var37.field6392;
                }
                return;
            }
            if (arg0 == 1201) {
                var37.field6380 = 2;
                var37.field6431 = field5243[--field5233];
                if (var37.field6397 == -1) {
                    class233.method1303(4, var37.field6440);
                }
                return;
            }
            if (arg0 == 1202) {
                var37.field6380 = 3;
                var37.field6431 = -1;
                if (var37.field6397 == -1) {
                    class233.method1303(4, var37.field6440);
                }
                return;
            }
            if (arg0 == 1203) {
                var37.field6380 = 6;
                var37.field6431 = field5243[--field5233];
                if (var37.field6397 == -1) {
                    class233.method1303(4, var37.field6440);
                }
                return;
            }
            if (arg0 == 1204) {
                var37.field6380 = 5;
                var37.field6431 = field5243[--field5233];
                if (var37.field6397 == -1) {
                    class233.method1303(4, var37.field6440);
                }
                return;
            }
            if (arg0 == 1206) {
                field5233 -= 4;
                var37.field6367 = field5243[field5233];
                var37.field6347 = field5243[field5233 + 1];
                var37.field6286 = field5243[field5233 + 2];
                var37.field6299 = field5243[field5233 + 3];
                class490.method2854(var37, (byte) 95);
                return;
            }
            if (arg0 == 1207) {
                field5233 -= 2;
                var37.field6352 = field5243[field5233];
                var37.field6406 = field5243[field5233 + 1];
                class490.method2854(var37, (byte) 127);
                return;
            }
            if (arg0 == 1210) {
                field5233 -= 4;
                var37.field6431 = field5243[field5233];
                var37.field6289 = field5243[field5233 + 1];
                if (field5243[field5233 + 2] == 1) {
                    var37.field6380 = 9;
                } else {
                    var37.field6380 = 8;
                }
                if (field5243[field5233 + 3] == 1) {
                    var37.field6297 = true;
                } else {
                    var37.field6297 = false;
                }
                if (var37.field6397 == -1) {
                    class233.method1303(4, var37.field6440);
                }
                return;
            }
            if (arg0 == 1211) {
                var37.field6380 = 5;
                var37.field6431 = class332.field4494;
                var37.field6289 = 0;
                if (var37.field6397 == -1) {
                    class233.method1303(4, var37.field6440);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class464 var48;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var48 = class150.method888((byte) -115, field5243[--field5233]);
                } else {
                    var48 = arg1 ? field5255 : field5254;
                }
                String var49 = field5234[--field5237];
                int[] var50 = null;
                if (var49.length() > 0 && var49.charAt(var49.length() - 1) == 'Y') {
                    int var51 = field5243[--field5233];
                    if (var51 > 0) {
                        var50 = new int[var51];
                        while (var51-- > 0) {
                            var50[var51] = field5243[--field5233];
                        }
                    }
                    var49 = var49.substring(0, var49.length() - 1);
                }
                Object[] var52 = new Object[var49.length() + 1];
                for (int var53 = var52.length - 1; var53 >= 1; var53--) {
                    if (var49.charAt(var53 - 1) == 's') {
                        var52[var53] = field5234[--field5237];
                    } else {
                        var52[var53] = Integer.valueOf(field5243[--field5233]);
                    }
                }
                int var54 = field5243[--field5233];
                if (var54 == -1) {
                    var52 = null;
                } else {
                    var52[0] = Integer.valueOf(var54);
                }
                if (arg0 == 1400) {
                    var48.field6331 = var52;
                } else if (arg0 == 1401) {
                    var48.field6337 = var52;
                } else if (arg0 == 1402) {
                    var48.field6415 = var52;
                } else if (arg0 == 1403) {
                    var48.field6326 = var52;
                } else if (arg0 == 1404) {
                    var48.field6313 = var52;
                } else if (arg0 == 1405) {
                    var48.field6418 = var52;
                } else if (arg0 == 1406) {
                    var48.field6421 = var52;
                } else if (arg0 == 1407) {
                    var48.field6315 = var52;
                    var48.field6301 = var50;
                } else if (arg0 == 1408) {
                    var48.field6383 = var52;
                } else if (arg0 == 1409) {
                    var48.field6395 = var52;
                } else if (arg0 == 1410) {
                    var48.field6311 = var52;
                } else if (arg0 == 1411) {
                    var48.field6403 = var52;
                } else if (arg0 == 1412) {
                    var48.field6325 = var52;
                } else if (arg0 == 1414) {
                    var48.field6413 = var52;
                    var48.field6433 = var50;
                } else if (arg0 == 1415) {
                    var48.field6288 = var52;
                    var48.field6316 = var50;
                } else if (arg0 == 1416) {
                    var48.field6336 = var52;
                } else if (arg0 == 1417) {
                    var48.field6373 = var52;
                } else if (arg0 == 1418) {
                    var48.field6394 = var52;
                } else if (arg0 == 1419) {
                    var48.field6351 = var52;
                } else if (arg0 == 1420) {
                    var48.field6389 = var52;
                } else if (arg0 == 1421) {
                    var48.field6353 = var52;
                } else if (arg0 == 1422) {
                    var48.field6384 = var52;
                } else if (arg0 == 1423) {
                    var48.field6444 = var52;
                } else if (arg0 == 1424) {
                    var48.field6318 = var52;
                } else if (arg0 == 1425) {
                    var48.field6424 = var52;
                } else if (arg0 == 1426) {
                    var48.field6355 = var52;
                } else if (arg0 == 1427) {
                    var48.field6295 = var52;
                } else if (arg0 == 1428) {
                    var48.field6354 = var52;
                    var48.field6385 = var50;
                } else if (arg0 == 1429) {
                    var48.field6296 = var52;
                    var48.field6376 = var50;
                }
                var48.field6446 = true;
                return;
            }
            if (arg0 < 1600) {
                class464 var55 = arg1 ? field5255 : field5254;
                if (arg0 == 1500) {
                    field5243[field5233++] = var55.field6412;
                    return;
                }
                if (arg0 == 1501) {
                    field5243[field5233++] = var55.field6323;
                    return;
                }
                if (arg0 == 1502) {
                    field5243[field5233++] = var55.field6308;
                    return;
                }
                if (arg0 == 1503) {
                    field5243[field5233++] = var55.field6340;
                    return;
                }
                if (arg0 == 1504) {
                    field5243[field5233++] = var55.field6348 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field5243[field5233++] = var55.field6362;
                    return;
                }
            } else if (arg0 < 1700) {
                class464 var56 = arg1 ? field5255 : field5254;
                if (arg0 == 1600) {
                    field5243[field5233++] = var56.field6330;
                    return;
                }
                if (arg0 == 1601) {
                    field5243[field5233++] = var56.field6333;
                    return;
                }
                if (arg0 == 1602) {
                    field5234[field5237++] = var56.field6439;
                    return;
                }
                if (arg0 == 1603) {
                    field5243[field5233++] = var56.field6368;
                    return;
                }
                if (arg0 == 1604) {
                    field5243[field5233++] = var56.field6346;
                    return;
                }
                if (arg0 == 1605) {
                    field5243[field5233++] = var56.field6324;
                    return;
                }
                if (arg0 == 1606) {
                    field5243[field5233++] = var56.field6445;
                    return;
                }
                if (arg0 == 1607) {
                    field5243[field5233++] = var56.field6443;
                    return;
                }
                if (arg0 == 1608) {
                    field5243[field5233++] = var56.field6361;
                    return;
                }
                if (arg0 == 1609) {
                    field5243[field5233++] = var56.field6425;
                    return;
                }
                if (arg0 == 1610) {
                    field5243[field5233++] = var56.field6365;
                    return;
                }
                if (arg0 == 1611) {
                    field5243[field5233++] = var56.field6312;
                    return;
                }
                if (arg0 == 1612) {
                    field5243[field5233++] = var56.field6393;
                    return;
                }
            } else if (arg0 < 1800) {
                class464 var57 = arg1 ? field5255 : field5254;
                if (arg0 == 1700) {
                    field5243[field5233++] = var57.field6402;
                    return;
                }
                if (arg0 == 1701) {
                    if (var57.field6402 != -1) {
                        field5243[field5233++] = var57.field6294;
                        return;
                    }
                    field5243[field5233++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field5243[field5233++] = var57.field6397;
                    return;
                }
            } else if (arg0 < 1900) {
                class464 var58 = arg1 ? field5255 : field5254;
                if (arg0 == 1800) {
                    field5243[field5233++] = client.method1046(var58).method1256((byte) -122);
                    return;
                }
                if (arg0 == 1801) {
                    int var59 = field5243[--field5233];
                    int var315 = var59 - 1;
                    if (var58.field6338 != null && var315 < var58.field6338.length && var58.field6338[var315] != null) {
                        field5234[field5237++] = var58.field6338[var315];
                        return;
                    }
                    field5234[field5237++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var58.field6400 == null) {
                        field5234[field5237++] = "";
                        return;
                    }
                    field5234[field5237++] = var58.field6400;
                    return;
                }
            } else if (arg0 < 2600) {
                class464 var60 = class150.method888((byte) -115, field5243[--field5233]);
                if (arg0 == 2500) {
                    field5243[field5233++] = var60.field6412;
                    return;
                }
                if (arg0 == 2501) {
                    field5243[field5233++] = var60.field6323;
                    return;
                }
                if (arg0 == 2502) {
                    field5243[field5233++] = var60.field6308;
                    return;
                }
                if (arg0 == 2503) {
                    field5243[field5233++] = var60.field6340;
                    return;
                }
                if (arg0 == 2504) {
                    field5243[field5233++] = var60.field6348 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field5243[field5233++] = var60.field6362;
                    return;
                }
            } else if (arg0 < 2700) {
                class464 var61 = class150.method888((byte) -115, field5243[--field5233]);
                if (arg0 == 2600) {
                    field5243[field5233++] = var61.field6330;
                    return;
                }
                if (arg0 == 2601) {
                    field5243[field5233++] = var61.field6333;
                    return;
                }
                if (arg0 == 2602) {
                    field5234[field5237++] = var61.field6439;
                    return;
                }
                if (arg0 == 2603) {
                    field5243[field5233++] = var61.field6368;
                    return;
                }
                if (arg0 == 2604) {
                    field5243[field5233++] = var61.field6346;
                    return;
                }
                if (arg0 == 2605) {
                    field5243[field5233++] = var61.field6324;
                    return;
                }
                if (arg0 == 2606) {
                    field5243[field5233++] = var61.field6445;
                    return;
                }
                if (arg0 == 2607) {
                    field5243[field5233++] = var61.field6443;
                    return;
                }
                if (arg0 == 2608) {
                    field5243[field5233++] = var61.field6361;
                    return;
                }
                if (arg0 == 2609) {
                    field5243[field5233++] = var61.field6425;
                    return;
                }
                if (arg0 == 2610) {
                    field5243[field5233++] = var61.field6365;
                    return;
                }
                if (arg0 == 2611) {
                    field5243[field5233++] = var61.field6312;
                    return;
                }
                if (arg0 == 2612) {
                    field5243[field5233++] = var61.field6393;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class464 var62 = class150.method888((byte) -115, field5243[--field5233]);
                    field5243[field5233++] = var62.field6402;
                    return;
                }
                if (arg0 == 2701) {
                    class464 var63 = class150.method888((byte) -115, field5243[--field5233]);
                    if (var63.field6402 != -1) {
                        field5243[field5233++] = var63.field6294;
                        return;
                    }
                    field5243[field5233++] = 0;
                    return;
                }
                if (arg0 == 2702) {
                    int var64 = field5243[--field5233];
                    class132 var65 = (class132) class214.field2883.method1528((long) var64, 54);
                    if (var65 != null) {
                        field5243[field5233++] = 1;
                        return;
                    }
                    field5243[field5233++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class464 var66 = class150.method888((byte) -115, field5243[--field5233]);
                    if (var66.field6360 == null) {
                        field5243[field5233++] = 0;
                        return;
                    }
                    int var67 = var66.field6360.length;
                    for (int var68 = 0; var68 < var66.field6360.length; var68++) {
                        if (var66.field6360[var68] == null) {
                            var67 = var68;
                            break;
                        }
                    }
                    field5243[field5233++] = var67;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field5233 -= 2;
                    int var69 = field5243[field5233];
                    int var70 = field5243[field5233 + 1];
                    class132 var71 = (class132) class214.field2883.method1528((long) var69, 68);
                    if (var71 != null && var71.field1939 == var70) {
                        field5243[field5233++] = 1;
                        return;
                    }
                    field5243[field5233++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class464 var72 = class150.method888((byte) -115, field5243[--field5233]);
                if (arg0 == 2800) {
                    field5243[field5233++] = client.method1046(var72).method1256((byte) -122);
                    return;
                }
                if (arg0 == 2801) {
                    int var73 = field5243[--field5233];
                    int var316 = var73 - 1;
                    if (var72.field6338 != null && var316 < var72.field6338.length && var72.field6338[var316] != null) {
                        field5234[field5237++] = var72.field6338[var316];
                        return;
                    }
                    field5234[field5237++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var72.field6400 == null) {
                        field5234[field5237++] = "";
                        return;
                    }
                    field5234[field5237++] = var72.field6400;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var74 = field5234[--field5237];
                    class78.method514(0, var74);
                    return;
                }
                if (arg0 == 3101) {
                    field5233 -= 2;
                    class210.method1195(0, class233.field3103, field5243[field5233 + 1], field5243[field5233]);
                    return;
                }
                if (arg0 == 3103) {
                    class136.method825(-1, true);
                    return;
                }
                if (arg0 == 3104) {
                    String var75 = field5234[--field5237];
                    int var76 = 0;
                    if (class59.method419(false, var75)) {
                        var76 = class455.method2673(119, var75);
                    }
                    field5239++;
                    class491.method2861(class94.field1394, 1);
                    class203.field2751.method199((byte) -117, var76);
                    return;
                }
                if (arg0 == 3105) {
                    String var77 = field5234[--field5237];
                    field5253++;
                    class491.method2861(class372.field5071, 1);
                    class203.field2751.method228(var77.length() + 1, 32);
                    class203.field2751.method208(var77, -126);
                    return;
                }
                if (arg0 == 3106) {
                    String var78 = field5234[--field5237];
                    field5256++;
                    class491.method2861(class86.field1173, 1);
                    class203.field2751.method228(var78.length() + 1, 32);
                    class203.field2751.method208(var78, -90);
                    return;
                }
                if (arg0 == 3107) {
                    int var79 = field5243[--field5233];
                    String var80 = field5234[--field5237];
                    class410.method2461(var79, (byte) 116, var80);
                    return;
                }
                if (arg0 == 3108) {
                    field5233 -= 3;
                    int var81 = field5243[field5233];
                    int var82 = field5243[field5233 + 1];
                    int var83 = field5243[field5233 + 2];
                    class464 var84 = class150.method888((byte) -115, var83);
                    class46.method330(true, var81, var82, var84);
                    return;
                }
                if (arg0 == 3109) {
                    field5233 -= 2;
                    int var85 = field5243[field5233];
                    int var86 = field5243[field5233 + 1];
                    class464 var87 = arg1 ? field5255 : field5254;
                    class46.method330(true, var85, var86, var87);
                    return;
                }
                if (arg0 == 3110) {
                    int var88 = field5243[--field5233];
                    field5246++;
                    class491.method2861(class98.field1423, 1);
                    class203.field2751.method229(var88, 1309449544);
                    return;
                }
                if (arg0 == 3111) {
                    field5233 -= 2;
                    int var89 = field5243[field5233];
                    int var90 = field5243[field5233 + 1];
                    class132 var91 = (class132) class214.field2883.method1528((long) var89, 69);
                    if (var91 != null) {
                        class284.method1603(true, true, var91, var91.field1939 != var90);
                    }
                    class257.method1451(var89, 3, 87, true, var90);
                    return;
                }
                if (arg0 == 3112) {
                    field5233--;
                    int var92 = field5243[field5233];
                    class132 var93 = (class132) class214.field2883.method1528((long) var92, 104);
                    if (var93 != null && var93.field1942 == 3) {
                        class284.method1603(true, true, var93, true);
                    }
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field5233 -= 3;
                    class66.method439(field5243[field5233 + 1], false, 255, field5243[field5233 + 2], field5243[field5233]);
                    return;
                }
                if (arg0 == 3201) {
                    class335.method1910((byte) -122, 50, 255, field5243[--field5233]);
                    return;
                }
                if (arg0 == 3202) {
                    field5233 -= 2;
                    class77.method511(field5243[field5233], 1, field5243[field5233 + 1], 255);
                    return;
                }
                if (arg0 == 3203) {
                    field5233 -= 4;
                    class66.method439(field5243[field5233 + 1], false, field5243[field5233 + 3], field5243[field5233 + 2], field5243[field5233]);
                    return;
                }
                if (arg0 == 3204) {
                    field5233 -= 3;
                    class335.method1910((byte) -79, field5243[field5233 + 2], field5243[field5233 + 1], field5243[field5233]);
                    return;
                }
                if (arg0 == 3205) {
                    field5233 -= 3;
                    class77.method511(field5243[field5233], 1, field5243[field5233 + 1], field5243[field5233 + 2]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field5243[field5233++] = class70.field968;
                    return;
                }
                if (arg0 == 3301) {
                    field5233 -= 2;
                    int var94 = field5243[field5233];
                    int var95 = field5243[field5233 + 1];
                    field5243[field5233++] = class297.method1672(false, 6536, var94, var95);
                    return;
                }
                if (arg0 == 3302) {
                    field5233 -= 2;
                    int var96 = field5243[field5233];
                    int var97 = field5243[field5233 + 1];
                    field5243[field5233++] = class134.method817(var97, false, 65280, var96);
                    return;
                }
                if (arg0 == 3303) {
                    field5233 -= 2;
                    int var98 = field5243[field5233];
                    int var99 = field5243[field5233 + 1];
                    field5243[field5233++] = class16.method101(var98, false, var99, (byte) 51);
                    return;
                }
                if (arg0 == 3304) {
                    int var100 = field5243[--field5233];
                    field5243[field5233++] = class152.field2141.method27(var100, 107).field4546;
                    return;
                }
                if (arg0 == 3305) {
                    int var101 = field5243[--field5233];
                    field5243[field5233++] = class475.field6542[var101];
                    return;
                }
                if (arg0 == 3306) {
                    int var102 = field5243[--field5233];
                    field5243[field5233++] = class151.field2136[var102];
                    return;
                }
                if (arg0 == 3307) {
                    int var103 = field5243[--field5233];
                    field5243[field5233++] = class322.field4293[var103];
                    return;
                }
                if (arg0 == 3308) {
                    byte var104 = class233.field3103.field6502;
                    int var105 = (class233.field3103.field6501 >> 7) + class162.field2260;
                    int var106 = (class233.field3103.field6507 >> 7) + class266.field3511;
                    field5243[field5233++] = (var104 << 28) + (var105 << 14) + var106;
                    return;
                }
                if (arg0 == 3309) {
                    int var107 = field5243[--field5233];
                    field5243[field5233++] = var107 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var108 = field5243[--field5233];
                    field5243[field5233++] = var108 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var109 = field5243[--field5233];
                    field5243[field5233++] = var109 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field5243[field5233++] = class158.field2174 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field5233 -= 2;
                    int var110 = field5243[field5233];
                    int var111 = field5243[field5233 + 1];
                    field5243[field5233++] = class297.method1672(true, 6536, var110, var111);
                    return;
                }
                if (arg0 == 3314) {
                    field5233 -= 2;
                    int var112 = field5243[field5233];
                    int var113 = field5243[field5233 + 1];
                    field5243[field5233++] = class134.method817(var113, true, 65280, var112);
                    return;
                }
                if (arg0 == 3315) {
                    field5233 -= 2;
                    int var114 = field5243[field5233];
                    int var115 = field5243[field5233 + 1];
                    field5243[field5233++] = class16.method101(var114, true, var115, (byte) -87);
                    return;
                }
                if (arg0 == 3316) {
                    if (class348.field4799 >= 2) {
                        field5243[field5233++] = class348.field4799;
                        return;
                    }
                    field5243[field5233++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field5243[field5233++] = class370.field5068;
                    return;
                }
                if (arg0 == 3318) {
                    field5243[field5233++] = class33.field506;
                    return;
                }
                if (arg0 == 3321) {
                    field5243[field5233++] = class432.field5888;
                    return;
                }
                if (arg0 == 3322) {
                    field5243[field5233++] = class297.field3978;
                    return;
                }
                if (arg0 == 3323) {
                    if (class91.field1347 >= 5 && class91.field1347 <= 9) {
                        field5243[field5233++] = 1;
                        return;
                    }
                    field5243[field5233++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class91.field1347 >= 5 && class91.field1347 <= 9) {
                        field5243[field5233++] = class91.field1347;
                        return;
                    }
                    field5243[field5233++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field5243[field5233++] = class164.field2275 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field5243[field5233++] = class233.field3103.field6757;
                    return;
                }
                if (arg0 == 3327) {
                    field5243[field5233++] = class233.field3103.field6783.field2725 ? 1 : 0;
                    return;
                }
                if (arg0 == 3328) {
                    field5243[field5233++] = class458.field6212 && !class330.field4384 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field5243[field5233++] = class129.field1900 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var116 = field5243[--field5233];
                    field5243[field5233++] = class318.method1746(var116, false, true);
                    return;
                }
                if (arg0 == 3331) {
                    field5233 -= 2;
                    int var117 = field5243[field5233];
                    int var118 = field5243[field5233 + 1];
                    field5243[field5233++] = class448.method2633(var118, 0, false, false, var117);
                    return;
                }
                if (arg0 == 3332) {
                    field5233 -= 2;
                    int var119 = field5243[field5233];
                    int var120 = field5243[field5233 + 1];
                    field5243[field5233++] = class448.method2633(var120, 0, false, true, var119);
                    return;
                }
                if (arg0 == 3333) {
                    field5243[field5233++] = class357.field4924;
                    return;
                }
                if (arg0 == 3335) {
                    field5243[field5233++] = class110.field1676;
                    return;
                }
                if (arg0 == 3336) {
                    field5233 -= 4;
                    int var121 = field5243[field5233];
                    int var122 = field5243[field5233 + 1];
                    int var123 = field5243[field5233 + 2];
                    int var124 = field5243[field5233 + 3];
                    int var125 = (var122 << 14) + var121;
                    int var126 = (var123 << 28) + var125;
                    int var127 = var124 + var126;
                    field5243[field5233++] = var127;
                    return;
                }
                if (arg0 == 3337) {
                    field5243[field5233++] = class448.field6099;
                    return;
                }
                if (arg0 == 3338) {
                    field5243[field5233++] = class80.method523((byte) -116);
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field5233 -= 2;
                    int var128 = field5243[field5233];
                    int var129 = field5243[field5233 + 1];
                    class12 var130 = class76.field1028.method1741(var128, (byte) -79);
                    field5234[field5237++] = var130.method79(var129, 20);
                    return;
                }
                if (arg0 == 3408) {
                    field5233 -= 4;
                    int var131 = field5243[field5233];
                    int var132 = field5243[field5233 + 1];
                    int var133 = field5243[field5233 + 2];
                    int var134 = field5243[field5233 + 3];
                    class12 var135 = class76.field1028.method1741(var133, (byte) -119);
                    if (var135.field161 == var131 && var135.field159 == var132) {
                        if (var132 == 115) {
                            field5234[field5237++] = var135.method79(var134, 20);
                            return;
                        }
                        field5243[field5233++] = var135.method70(17257, var134);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field5233 -= 3;
                    int var136 = field5243[field5233];
                    int var137 = field5243[field5233 + 1];
                    int var138 = field5243[field5233 + 2];
                    if (var137 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class12 var139 = class76.field1028.method1741(var137, (byte) -112);
                    if (var139.field159 != var136) {
                        throw new RuntimeException("C3409-1");
                    }
                    field5243[field5233++] = var139.method75(12, var138) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var140 = field5243[--field5233];
                    String var141 = field5234[--field5237];
                    if (var140 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class12 var142 = class76.field1028.method1741(var140, (byte) 121);
                    if (var142.field159 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field5243[field5233++] = var142.method73(false, var141) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var143 = field5243[--field5233];
                    class12 var144 = class76.field1028.method1741(var143, (byte) -118);
                    field5243[field5233++] = var144.field156.method1521((byte) -104);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class148.field2104 == 0) {
                        field5243[field5233++] = -2;
                        return;
                    }
                    if (class148.field2104 == 1) {
                        field5243[field5233++] = -1;
                        return;
                    }
                    field5243[field5233++] = class90.field1317;
                    return;
                }
                if (arg0 == 3601) {
                    int var145 = field5243[--field5233];
                    if (class148.field2104 == 2 && var145 < class90.field1317) {
                        field5234[field5237++] = class233.field3106[var145];
                        if (class405.field5554[var145] != null) {
                            field5234[field5237++] = class405.field5554[var145];
                            return;
                        }
                        field5234[field5237++] = "";
                        return;
                    }
                    field5234[field5237++] = "";
                    field5234[field5237++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var146 = field5243[--field5233];
                    if (class148.field2104 == 2 && var146 < class90.field1317) {
                        field5243[field5233++] = class155.field2163[var146];
                        return;
                    }
                    field5243[field5233++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var147 = field5243[--field5233];
                    if (class148.field2104 == 2 && var147 < class90.field1317) {
                        field5243[field5233++] = class70.field964[var147];
                        return;
                    }
                    field5243[field5233++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var148 = field5234[--field5237];
                    int var149 = field5243[--field5233];
                    class60.method420(var149, -25276, var148);
                    return;
                }
                if (arg0 == 3605) {
                    String var150 = field5234[--field5237];
                    class209.method1189(var150, -27552);
                    return;
                }
                if (arg0 == 3606) {
                    String var151 = field5234[--field5237];
                    class32.method214(118, var151);
                    return;
                }
                if (arg0 == 3607) {
                    String var152 = field5234[--field5237];
                    class428.method2521(var152, false, (byte) 63);
                    return;
                }
                if (arg0 == 3608) {
                    String var153 = field5234[--field5237];
                    class408.method2456(var153, true);
                    return;
                }
                if (arg0 == 3609) {
                    String var154 = field5234[--field5237];
                    if (var154.startsWith("<img=0>") || var154.startsWith("<img=1>")) {
                        var154 = var154.substring(7);
                    }
                    field5243[field5233++] = class104.method631(0, var154) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var155 = field5243[--field5233];
                    if (class148.field2104 == 2 && var155 < class90.field1317) {
                        field5234[field5237++] = class117.field1732[var155];
                        return;
                    }
                    field5234[field5237++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class484.field6700 != null) {
                        field5234[field5237++] = class289.method1634((byte) 63, class484.field6700);
                        return;
                    }
                    field5234[field5237++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class484.field6700 != null) {
                        field5243[field5233++] = class312.field4109;
                        return;
                    }
                    field5243[field5233++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var156 = field5243[--field5233];
                    if (class484.field6700 != null && var156 < class312.field4109) {
                        field5234[field5237++] = class68.field928[var156].field5555;
                        return;
                    }
                    field5234[field5237++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var157 = field5243[--field5233];
                    if (class484.field6700 != null && var157 < class312.field4109) {
                        field5243[field5233++] = class68.field928[var157].field5561;
                        return;
                    }
                    field5243[field5233++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var158 = field5243[--field5233];
                    if (class484.field6700 != null && var158 < class312.field4109) {
                        field5243[field5233++] = class68.field928[var158].field5562;
                        return;
                    }
                    field5243[field5233++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field5243[field5233++] = class155.field2169;
                    return;
                }
                if (arg0 == 3617) {
                    String var159 = field5234[--field5237];
                    class67.method444(-20345, var159);
                    return;
                }
                if (arg0 == 3618) {
                    field5243[field5233++] = class274.field3628;
                    return;
                }
                if (arg0 == 3619) {
                    String var160 = field5234[--field5237];
                    class456.method2682(var160, 65535);
                    return;
                }
                if (arg0 == 3620) {
                    class433.method2556(0);
                    return;
                }
                if (arg0 == 3621) {
                    if (class148.field2104 == 0) {
                        field5243[field5233++] = -1;
                        return;
                    }
                    field5243[field5233++] = class65.field865;
                    return;
                }
                if (arg0 == 3622) {
                    int var161 = field5243[--field5233];
                    if (class148.field2104 != 0 && var161 < class65.field865) {
                        field5234[field5237++] = class34.field524[var161];
                        if (class31.field424[var161] != null) {
                            field5234[field5237++] = class31.field424[var161];
                            return;
                        }
                        field5234[field5237++] = "";
                        return;
                    }
                    field5234[field5237++] = "";
                    field5234[field5237++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var162 = field5234[--field5237];
                    if (var162.startsWith("<img=0>") || var162.startsWith("<img=1>")) {
                        var162 = var162.substring(7);
                    }
                    field5243[field5233++] = class4.method31(0, var162) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var163 = field5243[--field5233];
                    if (class68.field928 != null && var163 < class312.field4109 && class68.field928[var163].field5560.equalsIgnoreCase(class233.field3103.field6742)) {
                        field5243[field5233++] = 1;
                        return;
                    }
                    field5243[field5233++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class64.field849 != null) {
                        field5234[field5237++] = class64.field849;
                        return;
                    }
                    field5234[field5237++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var164 = field5243[--field5233];
                    if (class484.field6700 != null && var164 < class312.field4109) {
                        field5234[field5237++] = class68.field928[var164].field5565;
                        return;
                    }
                    field5234[field5237++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var165 = field5243[--field5233];
                    if (class148.field2104 == 2 && var165 >= 0 && var165 < class90.field1317) {
                        field5243[field5233++] = class25.field317[var165] ? 1 : 0;
                        return;
                    }
                    field5243[field5233++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var166 = field5234[--field5237];
                    if (var166.startsWith("<img=0>") || var166.startsWith("<img=1>")) {
                        var166 = var166.substring(7);
                    }
                    field5243[field5233++] = class35.method267(var166, (byte) 88);
                    return;
                }
                if (arg0 == 3629) {
                    field5243[field5233++] = class171.field2353;
                    return;
                }
                if (arg0 == 3630) {
                    String var167 = field5234[--field5237];
                    class428.method2521(var167, true, (byte) 114);
                    return;
                }
                if (arg0 == 3631) {
                    int var168 = field5243[--field5233];
                    field5243[field5233++] = class336.field4539[var168] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var169 = field5243[--field5233];
                    if (class484.field6700 != null && var169 < class312.field4109) {
                        field5234[field5237++] = class68.field928[var169].field5560;
                        return;
                    }
                    field5234[field5237++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var170 = field5243[--field5233];
                    if (class148.field2104 != 0 && var170 < class65.field865) {
                        field5234[field5237++] = class332.field4505[var170];
                        return;
                    }
                    field5234[field5237++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var171 = field5243[--field5233];
                    field5243[field5233++] = class433.field5893[var171].method1536((byte) -23);
                    return;
                }
                if (arg0 == 3904) {
                    int var172 = field5243[--field5233];
                    field5243[field5233++] = class433.field5893[var172].field3594;
                    return;
                }
                if (arg0 == 3905) {
                    int var173 = field5243[--field5233];
                    field5243[field5233++] = class433.field5893[var173].field3597;
                    return;
                }
                if (arg0 == 3906) {
                    int var174 = field5243[--field5233];
                    field5243[field5233++] = class433.field5893[var174].field3600;
                    return;
                }
                if (arg0 == 3907) {
                    int var175 = field5243[--field5233];
                    field5243[field5233++] = class433.field5893[var175].field3595;
                    return;
                }
                if (arg0 == 3908) {
                    int var176 = field5243[--field5233];
                    field5243[field5233++] = class433.field5893[var176].field3606;
                    return;
                }
                if (arg0 == 3910) {
                    int var177 = field5243[--field5233];
                    int var178 = class433.field5893[var177].method1532(7);
                    field5243[field5233++] = var178 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var179 = field5243[--field5233];
                    int var180 = class433.field5893[var179].method1532(7);
                    field5243[field5233++] = var180 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var181 = field5243[--field5233];
                    int var182 = class433.field5893[var181].method1532(7);
                    field5243[field5233++] = var182 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var183 = field5243[--field5233];
                    int var184 = class433.field5893[var183].method1532(7);
                    field5243[field5233++] = var184 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field5233 -= 2;
                    int var185 = field5243[field5233];
                    int var186 = field5243[field5233 + 1];
                    field5243[field5233++] = var185 + var186;
                    return;
                }
                if (arg0 == 4001) {
                    field5233 -= 2;
                    int var187 = field5243[field5233];
                    int var188 = field5243[field5233 + 1];
                    field5243[field5233++] = var187 - var188;
                    return;
                }
                if (arg0 == 4002) {
                    field5233 -= 2;
                    int var189 = field5243[field5233];
                    int var190 = field5243[field5233 + 1];
                    field5243[field5233++] = var189 * var190;
                    return;
                }
                if (arg0 == 4003) {
                    field5233 -= 2;
                    int var191 = field5243[field5233];
                    int var192 = field5243[field5233 + 1];
                    field5243[field5233++] = var191 / var192;
                    return;
                }
                if (arg0 == 4004) {
                    int var193 = field5243[--field5233];
                    field5243[field5233++] = (int) (Math.random() * (double) var193);
                    return;
                }
                if (arg0 == 4005) {
                    int var194 = field5243[--field5233];
                    field5243[field5233++] = (int) (Math.random() * (double) (var194 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field5233 -= 5;
                    int var195 = field5243[field5233];
                    int var196 = field5243[field5233 + 1];
                    int var197 = field5243[field5233 + 2];
                    int var198 = field5243[field5233 + 3];
                    int var199 = field5243[field5233 + 4];
                    field5243[field5233++] = (var196 - var195) * (var199 - var197) / (var198 - var197) + var195;
                    return;
                }
                if (arg0 == 4007) {
                    field5233 -= 2;
                    long var200 = (long) field5243[field5233];
                    long var202 = (long) field5243[field5233 + 1];
                    field5243[field5233++] = (int) (var200 * var202 / 100L + var200);
                    return;
                }
                if (arg0 == 4008) {
                    field5233 -= 2;
                    int var204 = field5243[field5233];
                    int var205 = field5243[field5233 + 1];
                    field5243[field5233++] = var204 | 0x1 << var205;
                    return;
                }
                if (arg0 == 4009) {
                    field5233 -= 2;
                    int var206 = field5243[field5233];
                    int var207 = field5243[field5233 + 1];
                    field5243[field5233++] = var206 & -(0x1 << var207) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field5233 -= 2;
                    int var208 = field5243[field5233];
                    int var209 = field5243[field5233 + 1];
                    field5243[field5233++] = (var208 & 0x1 << var209) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field5233 -= 2;
                    int var210 = field5243[field5233];
                    int var211 = field5243[field5233 + 1];
                    field5243[field5233++] = var210 % var211;
                    return;
                }
                if (arg0 == 4012) {
                    field5233 -= 2;
                    int var212 = field5243[field5233];
                    int var213 = field5243[field5233 + 1];
                    if (var212 == 0) {
                        field5243[field5233++] = 0;
                        return;
                    }
                    field5243[field5233++] = (int) Math.pow((double) var212, (double) var213);
                    return;
                }
                if (arg0 == 4013) {
                    field5233 -= 2;
                    int var214 = field5243[field5233];
                    int var215 = field5243[field5233 + 1];
                    if (var214 == 0) {
                        field5243[field5233++] = 0;
                        return;
                    }
                    if (var215 == 0) {
                        field5243[field5233++] = Integer.MAX_VALUE;
                        return;
                    }
                    field5243[field5233++] = (int) Math.pow((double) var214, 1.0D / (double) var215);
                    return;
                }
                if (arg0 == 4014) {
                    field5233 -= 2;
                    int var216 = field5243[field5233];
                    int var217 = field5243[field5233 + 1];
                    field5243[field5233++] = var216 & var217;
                    return;
                }
                if (arg0 == 4015) {
                    field5233 -= 2;
                    int var218 = field5243[field5233];
                    int var219 = field5243[field5233 + 1];
                    field5243[field5233++] = var218 | var219;
                    return;
                }
                if (arg0 == 4016) {
                    field5233 -= 2;
                    int var220 = field5243[field5233];
                    int var221 = field5243[field5233 + 1];
                    field5243[field5233++] = var220 < var221 ? var220 : var221;
                    return;
                }
                if (arg0 == 4017) {
                    field5233 -= 2;
                    int var222 = field5243[field5233];
                    int var223 = field5243[field5233 + 1];
                    field5243[field5233++] = var222 > var223 ? var222 : var223;
                    return;
                }
                if (arg0 == 4018) {
                    field5233 -= 3;
                    long var224 = (long) field5243[field5233];
                    long var226 = (long) field5243[field5233 + 1];
                    long var228 = (long) field5243[field5233 + 2];
                    field5243[field5233++] = (int) (var224 * var228 / var226);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var230 = field5234[--field5237];
                    int var231 = field5243[--field5233];
                    field5234[field5237++] = var230 + var231;
                    return;
                }
                if (arg0 == 4101) {
                    field5237 -= 2;
                    String var232 = field5234[field5237];
                    String var233 = field5234[field5237 + 1];
                    field5234[field5237++] = var232 + var233;
                    return;
                }
                if (arg0 == 4102) {
                    String var234 = field5234[--field5237];
                    int var235 = field5243[--field5233];
                    field5234[field5237++] = var234 + class171.method998(true, var235, (byte) -61);
                    return;
                }
                if (arg0 == 4103) {
                    String var236 = field5234[--field5237];
                    field5234[field5237++] = var236.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field5234[field5237++] = method2343(field5243[--field5233]);
                    return;
                }
                if (arg0 == 4105) {
                    field5237 -= 2;
                    String var237 = field5234[field5237];
                    String var238 = field5234[field5237 + 1];
                    if (class233.field3103.field6783 != null && class233.field3103.field6783.field2725) {
                        field5234[field5237++] = var238;
                        return;
                    }
                    field5234[field5237++] = var237;
                    return;
                }
                if (arg0 == 4106) {
                    int var239 = field5243[--field5233];
                    field5234[field5237++] = Integer.toString(var239);
                    return;
                }
                if (arg0 == 4107) {
                    field5237 -= 2;
                    field5243[field5233++] = class487.method2832(field5234[field5237 + 1], (byte) -121, field5234[field5237], class110.field1676);
                    return;
                }
                if (arg0 == 4108) {
                    String var240 = field5234[--field5237];
                    field5233 -= 2;
                    int var241 = field5243[field5233];
                    int var242 = field5243[field5233 + 1];
                    class347 var243 = class330.method1836(0, 0, var242, class172.field2358);
                    field5243[field5233++] = var243.method2142((byte) -34, var240, var241, class471.field6498);
                    return;
                }
                if (arg0 == 4109) {
                    String var244 = field5234[--field5237];
                    field5233 -= 2;
                    int var245 = field5243[field5233];
                    int var246 = field5243[field5233 + 1];
                    class347 var247 = class330.method1836(0, 0, var246, class172.field2358);
                    field5243[field5233++] = var247.method2143(class471.field6498, var244, (byte) -65, var245);
                    return;
                }
                if (arg0 == 4110) {
                    field5237 -= 2;
                    String var248 = field5234[field5237];
                    String var249 = field5234[field5237 + 1];
                    if (field5243[--field5233] == 1) {
                        field5234[field5237++] = var248;
                        return;
                    }
                    field5234[field5237++] = var249;
                    return;
                }
                if (arg0 == 4111) {
                    String var250 = field5234[--field5237];
                    field5234[field5237++] = class460.method2702(120, var250);
                    return;
                }
                if (arg0 == 4112) {
                    String var251 = field5234[--field5237];
                    int var252 = field5243[--field5233];
                    if (var252 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field5234[field5237++] = var251 + (char) var252;
                    return;
                }
                if (arg0 == 4113) {
                    int var253 = field5243[--field5233];
                    field5243[field5233++] = class455.method2672((char) var253, 85) ? 1 : 0;
                    return;
                }
                if (arg0 == 4114) {
                    int var254 = field5243[--field5233];
                    field5243[field5233++] = class387.method2379(28407, (char) var254) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var255 = field5243[--field5233];
                    field5243[field5233++] = class17.method107(-123, (char) var255) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var256 = field5243[--field5233];
                    field5243[field5233++] = class251.method1405((byte) -88, (char) var256) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var257 = field5234[--field5237];
                    if (var257 != null) {
                        field5243[field5233++] = var257.length();
                        return;
                    }
                    field5243[field5233++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var258 = field5234[--field5237];
                    field5233 -= 2;
                    int var259 = field5243[field5233];
                    int var260 = field5243[field5233 + 1];
                    field5234[field5237++] = var258.substring(var259, var260);
                    return;
                }
                if (arg0 == 4119) {
                    String var261 = field5234[--field5237];
                    StringBuffer var262 = new StringBuffer(var261.length());
                    boolean var263 = false;
                    for (int var264 = 0; var264 < var261.length(); var264++) {
                        char var265 = var261.charAt(var264);
                        if (var265 == '<') {
                            var263 = true;
                        } else if (var265 == '>') {
                            var263 = false;
                        } else if (!var263) {
                            var262.append(var265);
                        }
                    }
                    field5234[field5237++] = var262.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var266 = field5234[--field5237];
                    field5233 -= 2;
                    int var267 = field5243[field5233];
                    int var268 = field5243[field5233 + 1];
                    field5243[field5233++] = var266.indexOf(var267, var268);
                    return;
                }
                if (arg0 == 4121) {
                    field5237 -= 2;
                    String var269 = field5234[field5237];
                    String var270 = field5234[field5237 + 1];
                    int var271 = field5243[--field5233];
                    field5243[field5233++] = var269.indexOf(var270, var271);
                    return;
                }
                if (arg0 == 4122) {
                    int var272 = field5243[--field5233];
                    field5243[field5233++] = Character.toLowerCase((char) var272);
                    return;
                }
                if (arg0 == 4123) {
                    int var273 = field5243[--field5233];
                    field5243[field5233++] = Character.toUpperCase((char) var273);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var274 = field5243[--field5233] != 0;
                    int var275 = field5243[--field5233];
                    field5234[field5237++] = class72.method469((long) var275, class110.field1676, false, var274, 0);
                    return;
                }
                if (arg0 == 4125) {
                    String var276 = field5234[--field5237];
                    int var277 = field5243[--field5233];
                    class347 var278 = class330.method1836(0, 0, var277, class172.field2358);
                    field5243[field5233++] = var278.method2146(class471.field6498, true, var276);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var279 = field5243[--field5233];
                    field5234[field5237++] = class175.field2385.method1557(var279, 21992).field5996;
                    return;
                }
                if (arg0 == 4201) {
                    field5233 -= 2;
                    int var280 = field5243[field5233];
                    int var281 = field5243[field5233 + 1];
                    class443 var282 = class175.field2385.method1557(var280, 21992);
                    if (var281 >= 1 && var281 <= 5 && var282.field5970[var281 - 1] != null) {
                        field5234[field5237++] = var282.field5970[var281 - 1];
                        return;
                    }
                    field5234[field5237++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field5233 -= 2;
                    int var283 = field5243[field5233];
                    int var284 = field5243[field5233 + 1];
                    class443 var285 = class175.field2385.method1557(var283, 21992);
                    if (var284 >= 1 && var284 <= 5 && var285.field6011[var284 - 1] != null) {
                        field5234[field5237++] = var285.field6011[var284 - 1];
                        return;
                    }
                    field5234[field5237++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var286 = field5243[--field5233];
                    field5243[field5233++] = class175.field2385.method1557(var286, 21992).field5982;
                    return;
                }
                if (arg0 == 4204) {
                    int var287 = field5243[--field5233];
                    field5243[field5233++] = class175.field2385.method1557(var287, 21992).field6016 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var288 = field5243[--field5233];
                    class443 var289 = class175.field2385.method1557(var288, 21992);
                    if (var289.field6029 == -1 && var289.field5956 >= 0) {
                        field5243[field5233++] = var289.field5956;
                        return;
                    }
                    field5243[field5233++] = var288;
                    return;
                }
                if (arg0 == 4206) {
                    int var290 = field5243[--field5233];
                    class443 var291 = class175.field2385.method1557(var290, 21992);
                    if (var291.field6029 >= 0 && var291.field5956 >= 0) {
                        field5243[field5233++] = var291.field5956;
                        return;
                    }
                    field5243[field5233++] = var290;
                    return;
                }
                if (arg0 == 4207) {
                    int var292 = field5243[--field5233];
                    field5243[field5233++] = class175.field2385.method1557(var292, 21992).field5991 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field5233 -= 2;
                    int var293 = field5243[field5233];
                    int var294 = field5243[field5233 + 1];
                    class112 var295 = class94.field1387.method164(27, var294);
                    if (var295.method721(-116)) {
                        field5234[field5237++] = class175.field2385.method1557(var293, 21992).method2590(var295.field1694, var294, -12450);
                        return;
                    }
                    field5243[field5233++] = class175.field2385.method1557(var293, 21992).method2589(125, var295.field1702, var294);
                    return;
                }
                if (arg0 == 4209) {
                    field5233 -= 2;
                    int var296 = field5243[field5233];
                    int var297 = field5243[field5233 + 1] - 1;
                    class443 var298 = class175.field2385.method1557(var296, 21992);
                    if (var298.field6013 == var297) {
                        field5243[field5233++] = var298.field5959;
                        return;
                    }
                    if (var298.field5983 == var297) {
                        field5243[field5233++] = var298.field6008;
                        return;
                    }
                    field5243[field5233++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var299 = field5234[--field5237];
                    int var300 = field5243[--field5233];
                    class125.method765(var299, (byte) 27, var300 == 1);
                    field5243[field5233++] = class251.field3345;
                    return;
                }
                if (arg0 == 4211) {
                    if (class390.field5418 != null && class413.field5645 < class251.field3345) {
                        field5243[field5233++] = class390.field5418[class413.field5645++] & 0xFFFF;
                        return;
                    }
                    field5243[field5233++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class413.field5645 = 0;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field5233 -= 2;
                    int var301 = field5243[field5233];
                    int var302 = field5243[field5233 + 1];
                    class112 var303 = class94.field1387.method164(27, var302);
                    if (var303.method721(-116)) {
                        field5234[field5237++] = class150.field2121.method782(var301, 1).method2528(var303.field1694, var302, (byte) -46);
                        return;
                    }
                    field5243[field5233++] = class150.field2121.method782(var301, 1).method2536(var303.field1702, -21086, var302);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field5233 -= 2;
                    int var304 = field5243[field5233];
                    int var305 = field5243[field5233 + 1];
                    class112 var306 = class94.field1387.method164(27, var305);
                    if (var306.method721(-116)) {
                        field5234[field5237++] = class1.field23.method935(var304, (byte) 93).method561(var306.field1694, 98, var305);
                        return;
                    }
                    field5243[field5233++] = class1.field23.method935(var304, (byte) -98).method573(var306.field1702, 72, var305);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field5233 -= 2;
                    int var307 = field5243[field5233];
                    int var308 = field5243[field5233 + 1];
                    class112 var309 = class94.field1387.method164(27, var308);
                    if (var309.method721(-116)) {
                        field5234[field5237++] = class281.field3787.method1568((byte) 42, var307).method2493(17, var308, var309.field1694);
                        return;
                    }
                    field5243[field5233++] = class281.field3787.method1568((byte) 41, var307).method2490(var308, var309.field1702, 29708);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var310 = field5243[--field5233];
                class280 var311 = class193.field2611.method1203(var310, -125);
                if (var311.field3742 != null && var311.field3742.length > 0) {
                    int var312 = 0;
                    int var313 = var311.field3744[0];
                    for (int var314 = 1; var314 < var311.field3742.length; var314++) {
                        if (var311.field3744[var314] > var313) {
                            var312 = var314;
                            var313 = var311.field3744[var314];
                        }
                    }
                    field5243[field5233++] = var311.field3742[var312];
                    return;
                }
                field5243[field5233++] = var311.field3751;
                return;
            }
        } else {
            class464 var41;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var41 = class150.method888((byte) -115, field5243[--field5233]);
            } else {
                var41 = arg1 ? field5255 : field5254;
            }
            if (arg0 == 1300) {
                int var42 = field5243[--field5233] - 1;
                if (var42 >= 0 && var42 <= 9) {
                    var41.method2732(var42, field5234[--field5237], true);
                    return;
                }
                field5237--;
                return;
            }
            if (arg0 == 1301) {
                field5233 -= 2;
                int var43 = field5243[field5233];
                int var44 = field5243[field5233 + 1];
                var41.field6335 = class78.method519(var43, var44, (byte) -72);
                return;
            }
            if (arg0 == 1302) {
                int var45 = field5243[--field5233];
                if (class162.field2256 != var45 && class279.field3691 != var45 && class192.field2608 != var45) {
                    return;
                }
                var41.field6372 = var45;
                return;
            }
            if (arg0 == 1303) {
                var41.field6293 = field5243[--field5233];
                return;
            }
            if (arg0 == 1304) {
                var41.field6357 = field5243[--field5233];
                return;
            }
            if (arg0 == 1305) {
                var41.field6400 = field5234[--field5237];
                return;
            }
            if (arg0 == 1306) {
                var41.field6327 = field5234[--field5237];
                return;
            }
            if (arg0 == 1307) {
                var41.field6338 = null;
                return;
            }
            if (arg0 == 1308) {
                var41.field6375 = field5243[--field5233];
                var41.field6291 = field5243[--field5233];
                return;
            }
            if (arg0 == 1309) {
                int var46 = field5243[--field5233];
                int var47 = field5243[--field5233];
                if (var47 >= 1 && var47 <= 10) {
                    var41.method2739(var46, -128, var47 - 1);
                }
                return;
            }
            if (arg0 == 1310) {
                var41.field6410 = field5234[--field5237];
                return;
            }
            if (arg0 == 1311) {
                var41.field6334 = field5243[--field5233];
                return;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lbc;II)V")
    public static final void method2345(class225 arg0, int arg1, int arg2) {
        class199 var3 = class481.method2806((byte) 92, arg2, arg0, arg1);
        if (var3 == null) {
            return;
        }
        field5240 = new int[var3.field2684];
        field5247 = new String[var3.field2694];
        if (class79.field1069 == var3.field2687 || class428.field5789 == var3.field2687 || class437.field5929 == var3.field2687) {
            int var4 = 0;
            int var5 = 0;
            if (class181.field2492 != null) {
                var4 = class181.field2492.field6412;
                var5 = class181.field2492.field6323;
            }
            field5240[0] = class34.field523.method1916((byte) -21) - var4;
            field5240[1] = class34.field523.method1925(50) - var5;
        }
        method2349(var3, 200000);
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)V")
    private static final void method2346(int arg0) {
        class464 var1 = class150.method888((byte) -115, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class464[] var3 = class392.field5437[var2];
        if (var3 == null) {
            class464[] var4 = class146.field2099[var2];
            int var5 = var4.length;
            var3 = class392.field5437[var2] = new class464[var5];
            class380.method2336(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class380.method2336(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)V")
    public static final void method2347(int arg0) {
        if (arg0 == -1 || !class492.method2867(arg0, (byte) 125)) {
            return;
        }
        class464[] var1 = class146.field2099[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class464 var3 = var1[var2];
            if (var3.field6378 != null) {
                class82 var4 = new class82();
                var4.field1086 = var3;
                var4.field1085 = var3.field6378;
                method2342(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(IZ)V")
    private static final void method2348(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field5243[field5233++] = class42.field597;
                return;
            }
            if (arg0 == 5001) {
                field5233 -= 3;
                class42.field597 = field5243[field5233];
                class318.field4196 = class280.method1584(79, field5243[field5233 + 1]);
                if (class318.field4196 == null) {
                    class318.field4196 = class214.field2875;
                }
                class401.field5517 = field5243[field5233 + 2];
                field5238++;
                class491.method2861(class246.field3292, 1);
                class203.field2751.method228(class42.field597, 32);
                class203.field2751.method228(class318.field4196.field3115, 32);
                class203.field2751.method228(class401.field5517, 32);
                return;
            }
            if (arg0 == 5002) {
                field5237 -= 2;
                String var2 = field5234[field5237];
                String var3 = field5234[field5237 + 1];
                field5233 -= 2;
                int var4 = field5243[field5233];
                int var5 = field5243[field5233 + 1];
                if (var3 == null) {
                    var3 = "";
                }
                if (var3.length() > 80) {
                    var3 = var3.substring(0, 80);
                }
                field5242++;
                class491.method2861(class128.field1890, 1);
                class203.field2751.method228(class231.method1292((byte) 3, var2) + class231.method1292((byte) 3, var3) + 2, 32);
                class203.field2751.method208(var2, -128);
                class203.field2751.method228(var4 - 1, 32);
                class203.field2751.method228(var5, 32);
                class203.field2751.method208(var3, -98);
                return;
            }
            if (arg0 == 5003) {
                int var6 = field5243[--field5233];
                String var7 = null;
                if (var6 < 100) {
                    var7 = class236.field3121[var6];
                }
                if (var7 == null) {
                    var7 = "";
                }
                field5234[field5237++] = var7;
                return;
            }
            if (arg0 == 5004) {
                int var8 = field5243[--field5233];
                int var9 = -1;
                if (var8 < 100 && class236.field3121[var8] != null) {
                    var9 = class306.field4054[var8];
                }
                field5243[field5233++] = var9;
                return;
            }
            if (arg0 == 5005) {
                if (class318.field4196 == null) {
                    field5243[field5233++] = -1;
                    return;
                }
                field5243[field5233++] = class318.field4196.field3115;
                return;
            }
            if (arg0 == 5008 || arg0 == 5021) {
                String var67 = field5234[--field5237];
                method2341(var67, arg0);
                return;
            }
            if (arg0 == 5009) {
                field5237 -= 2;
                String var10 = field5234[field5237];
                String var11 = field5234[field5237 + 1];
                if (class348.field4799 != 0 || (!class458.field6212 || class330.field4384) && !class129.field1900) {
                    field5245++;
                    class491.method2861(class257.field3428, 1);
                    class203.field2751.method228(0, 32);
                    int var12 = class203.field2751.field456;
                    class203.field2751.method208(var10, -111);
                    class33.method250(var11, 0, class203.field2751);
                    class203.field2751.method247(true, class203.field2751.field456 - var12);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var13 = field5243[--field5233];
                String var14 = null;
                if (var13 < 100) {
                    var14 = class451.field6131[var13];
                }
                if (var14 == null) {
                    var14 = "";
                }
                field5234[field5237++] = var14;
                return;
            }
            if (arg0 == 5011) {
                int var15 = field5243[--field5233];
                String var16 = null;
                if (var15 < 100) {
                    var16 = class92.field1353[var15];
                }
                if (var16 == null) {
                    var16 = "";
                }
                field5234[field5237++] = var16;
                return;
            }
            if (arg0 == 5012) {
                int var17 = field5243[--field5233];
                int var18 = -1;
                if (var17 < 100) {
                    var18 = class59.field793[var17];
                }
                field5243[field5233++] = var18;
                return;
            }
            if (arg0 == 5015) {
                String var19;
                if (class233.field3103 == null || class233.field3103.field6770 == null) {
                    var19 = class80.field1079;
                } else {
                    var19 = class233.field3103.method2835(-20617, true);
                }
                field5234[field5237++] = var19;
                return;
            }
            if (arg0 == 5016) {
                field5243[field5233++] = class401.field5517;
                return;
            }
            if (arg0 == 5017) {
                field5243[field5233++] = class34.field517;
                return;
            }
            if (arg0 == 5018) {
                int var20 = field5243[--field5233];
                int var21 = 0;
                if (var20 < 100 && class236.field3121[var20] != null) {
                    var21 = class306.field4054[var20];
                }
                field5243[field5233++] = var21;
                return;
            }
            if (arg0 == 5019) {
                int var22 = field5243[--field5233];
                String var23 = null;
                if (var22 < 100) {
                    var23 = class64.field852[var22];
                }
                if (var23 == null) {
                    var23 = "";
                }
                field5234[field5237++] = var23;
                return;
            }
            if (arg0 == 5020) {
                String var24;
                if (class233.field3103 == null || class233.field3103.field6770 == null) {
                    var24 = class80.field1079;
                } else {
                    var24 = class233.field3103.method2833(false, -1);
                }
                field5234[field5237++] = var24;
                return;
            }
            if (arg0 == 5050) {
                int var25 = field5243[--field5233];
                field5234[field5237++] = class335.method1913(19025, var25).field2982;
                return;
            }
            if (arg0 == 5051) {
                int var26 = field5243[--field5233];
                class226 var27 = class335.method1913(19025, var26);
                if (var27.field2980 == null) {
                    field5243[field5233++] = 0;
                    return;
                }
                field5243[field5233++] = var27.field2980.length;
                return;
            }
            if (arg0 == 5052) {
                field5233 -= 2;
                int var28 = field5243[field5233];
                int var29 = field5243[field5233 + 1];
                class226 var30 = class335.method1913(19025, var28);
                int var31 = var30.field2980[var29];
                field5243[field5233++] = var31;
                return;
            }
            if (arg0 == 5053) {
                int var32 = field5243[--field5233];
                class226 var33 = class335.method1913(19025, var32);
                if (var33.field2978 == null) {
                    field5243[field5233++] = 0;
                    return;
                }
                field5243[field5233++] = var33.field2978.length;
                return;
            }
            if (arg0 == 5054) {
                field5233 -= 2;
                int var34 = field5243[field5233];
                int var35 = field5243[field5233 + 1];
                field5243[field5233++] = class335.method1913(19025, var34).field2978[var35];
                return;
            }
            if (arg0 == 5055) {
                int var36 = field5243[--field5233];
                field5234[field5237++] = class455.method2674((byte) 113, var36).method1408((byte) 63);
                return;
            }
            if (arg0 == 5056) {
                int var37 = field5243[--field5233];
                class251 var38 = class455.method2674((byte) 123, var37);
                if (var38.field3356 == null) {
                    field5243[field5233++] = 0;
                    return;
                }
                field5243[field5233++] = var38.field3356.length;
                return;
            }
            if (arg0 == 5057) {
                field5233 -= 2;
                int var39 = field5243[field5233];
                int var40 = field5243[field5233 + 1];
                field5243[field5233++] = class455.method2674((byte) 109, var39).field3356[var40];
                return;
            }
            if (arg0 == 5058) {
                field5250 = new class274();
                field5250.field3626 = field5243[--field5233];
                field5250.field3627 = class455.method2674((byte) 121, field5250.field3626);
                field5250.field3625 = new int[field5250.field3627.method1410((byte) -31)];
                return;
            }
            if (arg0 == 5059) {
                field5248++;
                class491.method2861(class446.field6071, 1);
                class203.field2751.method228(0, 32);
                int var41 = class203.field2751.field456;
                class203.field2751.method228(0, 32);
                class203.field2751.method229(field5250.field3626, 1309449544);
                field5250.field3627.method1404(class203.field2751, -101, field5250.field3625);
                class203.field2751.method247(true, class203.field2751.field456 - var41);
                return;
            }
            if (arg0 == 5060) {
                String var42 = field5234[--field5237];
                field5235++;
                class491.method2861(class151.field2134, 1);
                class203.field2751.method228(0, 32);
                int var43 = class203.field2751.field456;
                class203.field2751.method208(var42, -105);
                class203.field2751.method229(field5250.field3626, 1309449544);
                field5250.field3627.method1404(class203.field2751, -125, field5250.field3625);
                class203.field2751.method247(true, class203.field2751.field456 - var43);
                return;
            }
            if (arg0 == 5061) {
                field5248++;
                class491.method2861(class446.field6071, 1);
                class203.field2751.method228(0, 32);
                int var44 = class203.field2751.field456;
                class203.field2751.method228(1, 32);
                class203.field2751.method229(field5250.field3626, 1309449544);
                field5250.field3627.method1404(class203.field2751, -120, field5250.field3625);
                class203.field2751.method247(true, class203.field2751.field456 - var44);
                return;
            }
            if (arg0 == 5062) {
                field5233 -= 2;
                int var45 = field5243[field5233];
                int var46 = field5243[field5233 + 1];
                field5243[field5233++] = class335.method1913(19025, var45).field2979[var46];
                return;
            }
            if (arg0 == 5063) {
                field5233 -= 2;
                int var47 = field5243[field5233];
                int var48 = field5243[field5233 + 1];
                field5243[field5233++] = class335.method1913(19025, var47).field2988[var48];
                return;
            }
            if (arg0 == 5064) {
                field5233 -= 2;
                int var49 = field5243[field5233];
                int var50 = field5243[field5233 + 1];
                if (var50 == -1) {
                    field5243[field5233++] = -1;
                    return;
                }
                field5243[field5233++] = class335.method1913(19025, var49).method1270((char) var50, false);
                return;
            }
            if (arg0 == 5065) {
                field5233 -= 2;
                int var51 = field5243[field5233];
                int var52 = field5243[field5233 + 1];
                if (var52 == -1) {
                    field5243[field5233++] = -1;
                    return;
                }
                field5243[field5233++] = class335.method1913(19025, var51).method1274(true, (char) var52);
                return;
            }
            if (arg0 == 5066) {
                int var53 = field5243[--field5233];
                field5243[field5233++] = class455.method2674((byte) 122, var53).method1410((byte) -79);
                return;
            }
            if (arg0 == 5067) {
                field5233 -= 2;
                int var54 = field5243[field5233];
                int var55 = field5243[field5233 + 1];
                int var56 = class455.method2674((byte) 76, var54).method1403(0, var55);
                field5243[field5233++] = var56;
                return;
            }
            if (arg0 == 5068) {
                field5233 -= 2;
                int var57 = field5243[field5233];
                int var58 = field5243[field5233 + 1];
                field5250.field3625[var57] = var58;
                return;
            }
            if (arg0 == 5069) {
                field5233 -= 2;
                int var59 = field5243[field5233];
                int var60 = field5243[field5233 + 1];
                field5250.field3625[var59] = var60;
                return;
            }
            if (arg0 == 5070) {
                field5233 -= 3;
                int var61 = field5243[field5233];
                int var62 = field5243[field5233 + 1];
                int var63 = field5243[field5233 + 2];
                class251 var64 = class455.method2674((byte) 75, var61);
                if (var64.method1403(0, var62) != 0) {
                    throw new RuntimeException("bad command");
                }
                field5243[field5233++] = var64.method1407(var62, var63, (byte) 124);
                return;
            }
            if (arg0 == 5071) {
                String var65 = field5234[--field5237];
                boolean var66 = field5243[--field5233] == 1;
                class120.method747(var66, var65, 2);
                field5243[field5233++] = class251.field3345;
                return;
            }
            if (arg0 == 5072) {
                if (class390.field5418 != null && class413.field5645 < class251.field3345) {
                    field5243[field5233++] = class390.field5418[class413.field5645++] & 0xFFFF;
                    return;
                }
                field5243[field5233++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class413.field5645 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class449.field6111.method882((byte) 116, 86)) {
                    field5243[field5233++] = 1;
                    return;
                }
                field5243[field5233++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class449.field6111.method882((byte) 67, 82)) {
                    field5243[field5233++] = 1;
                    return;
                }
                field5243[field5233++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class449.field6111.method882((byte) 106, 81)) {
                    field5243[field5233++] = 1;
                    return;
                }
                field5243[field5233++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class412.method2471(128, field5243[--field5233]);
                return;
            }
            if (arg0 == 5201) {
                field5243[field5233++] = class140.method855(200);
                return;
            }
            if (arg0 == 5205) {
                class408.method2454(false, -1, field5243[--field5233], -1, 0);
                return;
            }
            if (arg0 == 5206) {
                int var68 = field5243[--field5233];
                class281 var69 = class55.method402(var68 >> 14 & 0x3FFF, var68 & 0x3FFF);
                if (var69 == null) {
                    field5243[field5233++] = -1;
                    return;
                }
                field5243[field5233++] = var69.field3774;
                return;
            }
            if (arg0 == 5207) {
                class281 var70 = class55.method389(field5243[--field5233]);
                if (var70 != null && var70.field3781 != null) {
                    field5234[field5237++] = var70.field3781;
                    return;
                }
                field5234[field5237++] = "";
                return;
            }
            if (arg0 == 5208) {
                field5243[field5233++] = class160.field2210;
                field5243[field5233++] = class11.field146;
                return;
            }
            if (arg0 == 5209) {
                field5243[field5233++] = class55.field757 + class370.field5065;
                field5243[field5233++] = class55.field754 + class432.field5889;
                return;
            }
            if (arg0 == 5210) {
                int var71 = field5243[--field5233];
                class281 var72 = class55.method389(var71);
                if (var72 == null) {
                    field5243[field5233++] = 0;
                    field5243[field5233++] = 0;
                    return;
                }
                field5243[field5233++] = var72.field3778 >> 14 & 0x3FFF;
                field5243[field5233++] = var72.field3778 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var73 = field5243[--field5233];
                class281 var74 = class55.method389(var73);
                if (var74 == null) {
                    field5243[field5233++] = 0;
                    field5243[field5233++] = 0;
                    return;
                }
                field5243[field5233++] = var74.field3772 - var74.field3776;
                field5243[field5233++] = var74.field3780 - var74.field3767;
                return;
            }
            if (arg0 == 5212) {
                class205 var75 = class117.method736(60);
                if (var75 == null) {
                    field5243[field5233++] = -1;
                    field5243[field5233++] = -1;
                    return;
                }
                field5243[field5233++] = var75.field2775;
                int var76 = var75.field2774 << 28 | class55.field757 + var75.field2777 << 14 | class55.field754 + var75.field2780;
                field5243[field5233++] = var76;
                return;
            }
            if (arg0 == 5213) {
                class205 var77 = class456.method2681(2);
                if (var77 == null) {
                    field5243[field5233++] = -1;
                    field5243[field5233++] = -1;
                    return;
                }
                field5243[field5233++] = var77.field2775;
                int var78 = var77.field2774 << 28 | class55.field757 + var77.field2777 << 14 | class55.field754 + var77.field2780;
                field5243[field5233++] = var78;
                return;
            }
            if (arg0 == 5214) {
                int var79 = field5243[--field5233];
                class281 var80 = class400.method2424(-87);
                if (var80 != null) {
                    boolean var81 = var80.method1587(var79 >> 28 & 0x3, 32765, field5258, var79 >> 14 & 0x3FFF, var79 & 0x3FFF);
                    if (var81) {
                        class444.method2606(field5258[2], field5258[1], (byte) 110);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field5233 -= 2;
                int var82 = field5243[field5233];
                int var83 = field5243[field5233 + 1];
                class46 var84 = class55.method391(var82 >> 14 & 0x3FFF, var82 & 0x3FFF);
                boolean var85 = false;
                for (class281 var86 = (class281) var84.method332(17948); var86 != null; var86 = (class281) var84.method331((byte) 116)) {
                    if (var86.field3774 == var83) {
                        var85 = true;
                        break;
                    }
                }
                if (var85) {
                    field5243[field5233++] = 1;
                    return;
                }
                field5243[field5233++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var87 = field5243[--field5233];
                class281 var88 = class55.method389(var87);
                if (var88 == null) {
                    field5243[field5233++] = -1;
                    return;
                }
                field5243[field5233++] = var88.field3782;
                return;
            }
            if (arg0 == 5220) {
                field5243[field5233++] = class373.field5100 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var89 = field5243[--field5233];
                class444.method2606(var89 & 0x3FFF, var89 >> 14 & 0x3FFF, (byte) 110);
                return;
            }
            if (arg0 == 5222) {
                class281 var90 = class400.method2424(-86);
                if (var90 != null) {
                    boolean var91 = var90.method1591(field5258, class55.field754 + class432.field5889, class55.field757 + class370.field5065, 12800);
                    if (var91) {
                        field5243[field5233++] = field5258[1];
                        field5243[field5233++] = field5258[2];
                        return;
                    }
                    field5243[field5233++] = -1;
                    field5243[field5233++] = -1;
                    return;
                }
                field5243[field5233++] = -1;
                field5243[field5233++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field5233 -= 2;
                int var92 = field5243[field5233];
                int var93 = field5243[field5233 + 1];
                class408.method2454(false, var93 >> 14 & 0x3FFF, var92, var93 & 0x3FFF, 0);
                return;
            }
            if (arg0 == 5224) {
                int var94 = field5243[--field5233];
                class281 var95 = class400.method2424(-127);
                if (var95 != null) {
                    boolean var96 = var95.method1587(var94 >> 28 & 0x3, 32765, field5258, var94 >> 14 & 0x3FFF, var94 & 0x3FFF);
                    if (var96) {
                        field5243[field5233++] = field5258[1];
                        field5243[field5233++] = field5258[2];
                        return;
                    }
                    field5243[field5233++] = -1;
                    field5243[field5233++] = -1;
                    return;
                }
                field5243[field5233++] = -1;
                field5243[field5233++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var97 = field5243[--field5233];
                class281 var98 = class400.method2424(-109);
                if (var98 != null) {
                    boolean var99 = var98.method1591(field5258, var97 & 0x3FFF, var97 >> 14 & 0x3FFF, 12800);
                    if (var99) {
                        field5243[field5233++] = field5258[1];
                        field5243[field5233++] = field5258[2];
                        return;
                    }
                    field5243[field5233++] = -1;
                    field5243[field5233++] = -1;
                    return;
                }
                field5243[field5233++] = -1;
                field5243[field5233++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class15.method98(field5243[--field5233], 96);
                return;
            }
            if (arg0 == 5227) {
                field5233 -= 2;
                int var100 = field5243[field5233];
                int var101 = field5243[field5233 + 1];
                class408.method2454(true, var101 >> 14 & 0x3FFF, var100, var101 & 0x3FFF, 0);
                return;
            }
            if (arg0 == 5228) {
                class77.field1034 = field5243[--field5233] == 1;
                return;
            }
            if (arg0 == 5229) {
                field5243[field5233++] = class77.field1034 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var102 = field5243[--field5233];
                class208.method1182((byte) 32, var102);
                return;
            }
            if (arg0 == 5231) {
                field5233 -= 2;
                int var103 = field5243[field5233];
                boolean var104 = field5243[field5233 + 1] == 1;
                if (class30.field399 != null) {
                    class445 var105 = class30.field399.method1528((long) var103, 70);
                    if (var105 != null && !var104) {
                        var105.method2614((byte) -97);
                        return;
                    }
                    if (var105 == null && var104) {
                        class445 var106 = new class445();
                        class30.field399.method1525((byte) 19, var106, (long) var103);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var107 = field5243[--field5233];
                if (class30.field399 != null) {
                    class445 var108 = class30.field399.method1528((long) var107, 109);
                    field5243[field5233++] = var108 == null ? 0 : 1;
                    return;
                }
                field5243[field5233++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field5233 -= 2;
                int var109 = field5243[field5233];
                boolean var110 = field5243[field5233 + 1] == 1;
                if (class323.field4310 != null) {
                    class445 var111 = class323.field4310.method1528((long) var109, 123);
                    if (var111 != null && !var110) {
                        var111.method2614((byte) -94);
                        return;
                    }
                    if (var111 == null && var110) {
                        class445 var112 = new class445();
                        class323.field4310.method1525((byte) 19, var112, (long) var109);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var113 = field5243[--field5233];
                if (class323.field4310 != null) {
                    class445 var114 = class323.field4310.method1528((long) var113, 95);
                    field5243[field5233++] = var114 == null ? 0 : 1;
                    return;
                }
                field5243[field5233++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field5243[field5233++] = class55.field727 == null ? -1 : class55.field727.field3774;
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field5233 -= 2;
                int var115 = field5243[field5233];
                int var116 = field5243[field5233 + 1];
                class96.method597(var116, 3, (byte) 119, false, var115);
                field5243[field5233++] = class94.field1398 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class94.field1398 != null) {
                    class96.method597(-1, class488.field6789.field6695, (byte) 116, false, -1);
                }
                return;
            }
            if (arg0 == 5302) {
                class49[] var117 = class329.method1832((byte) -16);
                field5243[field5233++] = var117.length;
                return;
            }
            if (arg0 == 5303) {
                int var118 = field5243[--field5233];
                class49[] var119 = class329.method1832((byte) -111);
                field5243[field5233++] = var119[var118].field651;
                field5243[field5233++] = var119[var118].field650;
                return;
            }
            if (arg0 == 5305) {
                int var120 = class488.field6789.field6677;
                int var121 = class488.field6789.field6693;
                int var122 = -1;
                class49[] var123 = class329.method1832((byte) 122);
                for (int var124 = 0; var124 < var123.length; var124++) {
                    class49 var125 = var123[var124];
                    if (var125.field651 == var120 && var125.field650 == var121) {
                        var122 = var124;
                        break;
                    }
                }
                field5243[field5233++] = var122;
                return;
            }
            if (arg0 == 5306) {
                field5243[field5233++] = class6.method41((byte) -121);
                return;
            }
            if (arg0 == 5307) {
                int var126 = field5243[--field5233];
                if (var126 >= 1 && var126 <= 2) {
                    class96.method597(-1, var126, (byte) 104, false, -1);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field5243[field5233++] = class488.field6789.field6695;
                return;
            }
            if (arg0 == 5309) {
                int var127 = field5243[--field5233];
                if (var127 >= 1 && var127 <= 2) {
                    class488.field6789.field6695 = var127;
                    class488.field6789.method2417(51, class251.field3359);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field5237 -= 2;
                String var128 = field5234[field5237];
                String var129 = field5234[field5237 + 1];
                int var130 = field5243[--field5233];
                field5241++;
                class491.method2861(class416.field5657, 1);
                class203.field2751.method228(class231.method1292((byte) 3, var128) + class231.method1292((byte) 3, var129) + 1, 32);
                class203.field2751.method208(var128, -120);
                class203.field2751.method208(var129, -98);
                class203.field2751.method228(var130, 32);
                return;
            }
            if (arg0 == 5401) {
                field5233 -= 2;
                class203.field2753[field5243[field5233]] = (short) class182.method1067((byte) -127, field5243[field5233 + 1]);
                class175.field2385.method1565((byte) 120);
                class175.field2385.method1558(-68);
                class150.field2121.method784((byte) 102);
                class480.method2803((byte) -119);
                return;
            }
            if (arg0 == 5405) {
                field5233 -= 2;
                int var131 = field5243[field5233];
                int var132 = field5243[field5233 + 1];
                if (var131 >= 0 && var131 < 2) {
                    class37.field553[var131] = new int[var132 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field5233 -= 7;
                int var133 = field5243[field5233];
                int var134 = field5243[field5233 + 1] << 1;
                int var135 = field5243[field5233 + 2];
                int var136 = field5243[field5233 + 3];
                int var137 = field5243[field5233 + 4];
                int var138 = field5243[field5233 + 5];
                int var139 = field5243[field5233 + 6];
                if (var133 >= 0 && var133 < 2 && class37.field553[var133] != null && var134 >= 0 && var134 < class37.field553[var133].length) {
                    class37.field553[var133][var134] = new int[] { (var135 >> 14 & 0x3FFF) * 128, var136, (var135 & 0x3FFF) * 128, var139 };
                    class37.field553[var133][var134 + 1] = new int[] { (var137 >> 14 & 0x3FFF) * 128, var138, (var137 & 0x3FFF) * 128 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var140 = class37.field553[field5243[--field5233]].length >> 1;
                field5243[field5233++] = var140;
                return;
            }
            if (arg0 == 5411) {
                if (class94.field1398 != null) {
                    class96.method597(-1, class488.field6789.field6695, (byte) 45, false, -1);
                }
                if (class492.field6883 != null) {
                    class342.method1940(false);
                    System.exit(0);
                    return;
                }
                String var141 = class213.field2870 == null ? class490.method2859((byte) -10) : class213.field2870;
                class301.method1685(var141, class251.field3359, (byte) -123, class222.field2958 == 1, false);
                return;
            }
            if (arg0 == 5419) {
                String var142 = "";
                if (class267.field3553 != null) {
                    if (class267.field3553.field6529 == null) {
                        var142 = class7.method46(false, class267.field3553.field6533);
                    } else {
                        var142 = (String) class267.field3553.field6529;
                    }
                }
                field5234[field5237++] = var142;
                return;
            }
            if (arg0 == 5420) {
                field5243[field5233++] = class241.field3211 == 3 ? 1 : 0;
                return;
            }
            if (arg0 == 5421) {
                if (class94.field1398 != null) {
                    class96.method597(-1, class488.field6789.field6695, (byte) 79, false, -1);
                }
                String var143 = field5234[--field5237];
                boolean var144 = field5243[--field5233] == 1;
                String var145 = class490.method2859((byte) -10) + var143;
                class301.method1685(var145, class251.field3359, (byte) -123, class222.field2958 == 1, var144);
                return;
            }
            if (arg0 == 5422) {
                field5237 -= 2;
                String var146 = field5234[field5237];
                String var147 = field5234[field5237 + 1];
                int var148 = field5243[--field5233];
                if (var146.length() > 0) {
                    if (class450.field6125 == null) {
                        class450.field6125 = new String[class176.field2396[class343.field4601.field4375]];
                    }
                    class450.field6125[var148] = var146;
                }
                if (var147.length() > 0) {
                    if (class140.field2047 == null) {
                        class140.field2047 = new String[class176.field2396[class343.field4601.field4375]];
                    }
                    class140.field2047[var148] = var147;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field5234[--field5237]);
                return;
            }
            if (arg0 == 5424) {
                field5233 -= 11;
                class39.field563 = field5243[field5233];
                class282.field3798 = field5243[field5233 + 1];
                class490.field6834 = field5243[field5233 + 2];
                class127.field1867 = field5243[field5233 + 3];
                class312.field4110 = field5243[field5233 + 4];
                class12.field163 = field5243[field5233 + 5];
                class441.field5950 = field5243[field5233 + 6];
                class94.field1396 = field5243[field5233 + 7];
                class109.field1634 = field5243[field5233 + 8];
                class302.field4027 = field5243[field5233 + 9];
                class164.field2274 = field5243[field5233 + 10];
                class473.field6525.method700((byte) 127, class312.field4110);
                class473.field6525.method700((byte) 78, class12.field163);
                class473.field6525.method700((byte) 97, class441.field5950);
                class473.field6525.method700((byte) 125, class94.field1396);
                class473.field6525.method700((byte) 93, class109.field1634);
                class210.field2839 = null;
                class206.field2788 = null;
                class17.field238 = null;
                class311.field4105 = null;
                class335.field4525 = null;
                class271.field3614 = null;
                class8.field112 = null;
                class412.field5639 = null;
                class316.field4178 = true;
                return;
            }
            if (arg0 == 5425) {
                class98.method604(1413);
                class316.field4178 = false;
                return;
            }
            if (arg0 == 5426) {
                field5233 -= 2;
                class186.field2558 = field5243[field5233];
                class491.field6868 = field5243[field5233 + 1];
                return;
            }
            if (arg0 == 5427) {
                field5233 -= 2;
                class92.field1356 = field5243[field5233 + 1];
                return;
            }
            if (arg0 == 5428) {
                field5233 -= 2;
                int var149 = field5243[field5233];
                int var150 = field5243[field5233 + 1];
                field5243[field5233++] = class443.method2602(var150, var149, 0) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class205.method1172(field5234[--field5237], false, false);
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field5233 -= 4;
                int var151 = field5243[field5233];
                int var152 = field5243[field5233 + 1];
                int var153 = field5243[field5233 + 2];
                int var154 = field5243[field5233 + 3];
                class132.method805(124, (var151 & 0x3FFF) - class266.field3511, var153, var154, false, var152, (var151 >> 14 & 0x3FFF) - class162.field2260);
                return;
            }
            if (arg0 == 5501) {
                field5233 -= 4;
                int var155 = field5243[field5233];
                int var156 = field5243[field5233 + 1];
                int var157 = field5243[field5233 + 2];
                int var158 = field5243[field5233 + 3];
                class447.method2627(var157, var156, (var155 & 0x3FFF) - class266.field3511, 91, var158, (var155 >> 14 & 0x3FFF) - class162.field2260);
                return;
            }
            if (arg0 == 5502) {
                field5233 -= 6;
                int var159 = field5243[field5233];
                if (var159 >= 2) {
                    throw new RuntimeException();
                }
                class358.field4957 = var159;
                int var160 = field5243[field5233 + 1];
                if (var160 + 1 >= class37.field553[class358.field4957].length >> 1) {
                    throw new RuntimeException();
                }
                class110.field1660 = var160;
                class138.field2008 = 0;
                class297.field3966 = field5243[field5233 + 2];
                class226.field2984 = field5243[field5233 + 3];
                int var161 = field5243[field5233 + 4];
                if (var161 >= 2) {
                    throw new RuntimeException();
                }
                class26.field335 = var161;
                int var162 = field5243[field5233 + 5];
                if (var162 + 1 >= class37.field553[class26.field335].length >> 1) {
                    throw new RuntimeException();
                }
                class343.field4600 = var162;
                class56.field772 = 3;
                return;
            }
            if (arg0 == 5503) {
                class35.method264((byte) 122);
                return;
            }
            if (arg0 == 5504) {
                field5233 -= 2;
                class374.method2297(0, field5243[field5233], (byte) 6, field5243[field5233 + 1]);
                return;
            }
            if (arg0 == 5505) {
                field5243[field5233++] = (int) class239.field3186 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field5243[field5233++] = (int) class270.field3610 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class141.method857(67);
                return;
            }
            if (arg0 == 5508) {
                class377.method2318(2850);
                return;
            }
            if (arg0 == 5509) {
                class103.method629((byte) -75);
                return;
            }
            if (arg0 == 5510) {
                class146.method867(-84);
                return;
            }
            if (arg0 == 5511) {
                int var163 = field5243[--field5233];
                int var164 = var163 >> 14 & 0x3FFF;
                int var165 = var163 & 0x3FFF;
                int var166 = var164 - class162.field2260;
                if (var166 < 0) {
                    var166 = 0;
                } else if (var166 >= class295.field3947) {
                    var166 = class295.field3947;
                }
                int var167 = var165 - class266.field3511;
                if (var167 < 0) {
                    var167 = 0;
                } else if (var167 >= class39.field567) {
                    var167 = class39.field567;
                }
                class186.field2560 = var166 * 128 + 64;
                class23.field306 = var167 * 128 + 64;
                class56.field772 = 4;
                return;
            }
            if (arg0 == 5512) {
                class363.method2214(59);
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field5237 -= 2;
                String var168 = field5234[field5237];
                String var169 = field5234[field5237 + 1];
                int var170 = field5243[--field5233];
                if (class18.field258 != 10) {
                    return;
                }
                if (class318.field4190 == 0 && class18.field256 == 0 && class30.field400 == 0 && class222.field2947 == 0) {
                    class429.method2525(var169, var168, var170, (byte) -83);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class405.method2450((byte) -22);
                return;
            }
            if (arg0 == 5602) {
                if (class18.field256 == 0) {
                    class297.field3976 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field5233 -= 4;
                if (class18.field258 != 10) {
                    return;
                }
                if (class318.field4190 == 0 && class18.field256 == 0 && class30.field400 == 0 && class222.field2947 == 0) {
                    class103.method625(field5243[field5233 + 3], field5243[field5233 + 2], 66, field5243[field5233], field5243[field5233 + 1]);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field5237--;
                if (class18.field258 != 10) {
                    return;
                }
                if (class318.field4190 == 0 && class18.field256 == 0 && class30.field400 == 0 && class222.field2947 == 0) {
                    class143.method864(class322.method1790((byte) 116, field5234[field5237]), (byte) 0);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field5237 -= 3;
                field5233 -= 7;
                if (class18.field258 != 10) {
                    return;
                }
                if (class318.field4190 == 0 && class18.field256 == 0 && class30.field400 == 0 && class222.field2947 == 0) {
                    class484.method2815(field5234[field5237 + 1], 0, field5243[field5233], field5243[field5233 + 3], field5243[field5233 + 4] == 1, class322.method1790((byte) 115, field5234[field5237]), field5243[field5233 + 2], field5243[field5233 + 1], field5243[field5233 + 6] == 1, field5243[field5233 + 5] == 1, field5234[field5237 + 2]);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class30.field400 == 0) {
                    class293.field3922 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field5243[field5233++] = class297.field3976;
                return;
            }
            if (arg0 == 5608) {
                field5243[field5233++] = class68.field924;
                return;
            }
            if (arg0 == 5609) {
                field5243[field5233++] = class293.field3922;
                return;
            }
            if (arg0 == 5610) {
                for (int var171 = 0; var171 < 5; var171++) {
                    field5234[field5237++] = class67.field907.length > var171 ? class289.method1634((byte) 63, class67.field907[var171]) : "";
                }
                class67.field907 = null;
                return;
            }
            if (arg0 == 5611) {
                field5243[field5233++] = class71.field970;
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var172 = field5243[--field5233];
                if (var172 < 1) {
                    var172 = 1;
                }
                if (var172 > 4) {
                    var172 = 4;
                }
                class488.field6789.field6664 = var172;
                class18.method119(true);
                class488.field6789.method2417(74, class251.field3359);
                class464.field6399 = false;
                return;
            }
            if (arg0 == 6002) {
                class488.field6789.method2413(field5243[--field5233] == 1, 120);
                class18.method119(true);
                class34.method256(-74);
                class488.field6789.method2417(37, class251.field3359);
                class464.field6399 = false;
                return;
            }
            if (arg0 == 6003) {
                class488.field6789.field6666 = field5243[--field5233] == 1;
                class34.method256(-86);
                class488.field6789.method2417(52, class251.field3359);
                class464.field6399 = false;
                return;
            }
            if (arg0 == 6005) {
                class488.field6789.field6683 = field5243[--field5233] == 1;
                class18.method119(true);
                class488.field6789.method2417(70, class251.field3359);
                class464.field6399 = false;
                return;
            }
            if (arg0 == 6006) {
                class488.field6789.field6668 = field5243[--field5233] == 1;
                class98.field1432.method2093(!class488.field6789.field6668);
                class488.field6789.method2417(84, class251.field3359);
                class464.field6399 = false;
                return;
            }
            if (arg0 == 6007) {
                class488.field6789.field6697 = field5243[--field5233];
                class488.field6789.method2417(35, class251.field3359);
                class464.field6399 = false;
                return;
            }
            if (arg0 == 6008) {
                class488.field6789.field6673 = field5243[--field5233] == 1;
                class488.field6789.method2417(42, class251.field3359);
                class464.field6399 = false;
                return;
            }
            if (arg0 == 6009) {
                class488.field6789.field6676 = field5243[--field5233] == 1;
                class18.method119(true);
                class488.field6789.method2417(70, class251.field3359);
                class464.field6399 = false;
                return;
            }
            if (arg0 == 6010) {
                class488.field6789.field6681 = field5243[--field5233] == 1;
                class488.field6789.method2417(120, class251.field3359);
                class464.field6399 = false;
                return;
            }
            if (arg0 == 6011) {
                int var173 = field5243[--field5233];
                if (var173 < 0 || var173 > 2) {
                    var173 = 0;
                }
                class488.field6789.field6682 = var173;
                class18.method119(true);
                class488.field6789.method2417(127, class251.field3359);
                class464.field6399 = false;
                return;
            }
            if (arg0 == 6012) {
                class488.field6789.field6696 = field5243[--field5233] == 1;
                class449.method2640(-54);
                class488.field6789.method2417(79, class251.field3359);
                class464.field6399 = false;
                return;
            }
            if (arg0 == 6014) {
                class488.field6789.field6686 = field5243[--field5233] == 1;
                class18.method119(true);
                class488.field6789.method2417(42, class251.field3359);
                class464.field6399 = false;
                return;
            }
            if (arg0 == 6015) {
                class488.field6789.field6665 = field5243[--field5233] == 1;
                class18.method119(true);
                class488.field6789.method2417(121, class251.field3359);
                class464.field6399 = false;
                return;
            }
            if (arg0 == 6016) {
                int var174 = field5243[--field5233];
                if (var174 < 0 || var174 > 2) {
                    var174 = 0;
                }
                class488.field6789.field6678 = var174;
                class138.method832(106);
                class488.field6789.method2417(52, class251.field3359);
                return;
            }
            if (arg0 == 6017) {
                class488.field6789.field6672 = field5243[--field5233] == 1;
                class152.method897(-13044);
                class488.field6789.method2417(99, class251.field3359);
                class464.field6399 = false;
                return;
            }
            if (arg0 == 6018) {
                int var175 = field5243[--field5233];
                if (var175 < 0) {
                    var175 = 0;
                }
                if (var175 > 127) {
                    var175 = 127;
                }
                class488.field6789.field6687 = var175;
                class488.field6789.method2417(118, class251.field3359);
                class464.field6399 = false;
                return;
            }
            if (arg0 == 6019) {
                int var176 = field5243[--field5233];
                if (var176 < 0) {
                    var176 = 0;
                }
                if (var176 > 255) {
                    var176 = 255;
                }
                if (class488.field6789.field6688 != var176) {
                    if (class488.field6789.field6688 == 0 && class60.field811 != -1) {
                        class9.method57(var176, (byte) 109, class60.field811, false, 0, class330.field4383);
                        class219.field2925 = false;
                    } else if (var176 == 0) {
                        class11.method68(84);
                        class219.field2925 = false;
                    } else {
                        class259.method1460(var176, true);
                    }
                    class488.field6789.field6688 = var176;
                }
                class488.field6789.method2417(110, class251.field3359);
                class464.field6399 = false;
                return;
            }
            if (arg0 == 6020) {
                int var177 = field5243[--field5233];
                if (var177 < 0) {
                    var177 = 0;
                }
                if (var177 > 127) {
                    var177 = 127;
                }
                class488.field6789.field6671 = var177;
                class488.field6789.method2417(71, class251.field3359);
                class464.field6399 = false;
                return;
            }
            if (arg0 == 6021) {
                class488.field6789.field5491 = field5243[--field5233] == 1;
                class34.method256(101);
                return;
            }
            if (arg0 == 6023) {
                int var178 = field5243[--field5233];
                boolean var179 = false;
                if (var178 < 0) {
                    var178 = 0;
                }
                if (var178 > 2) {
                    var178 = 2;
                }
                if (class428.field5792 < 96) {
                    var178 = 0;
                    var179 = true;
                }
                class146.method869(var178, true);
                class488.field6789.method2417(84, class251.field3359);
                class464.field6399 = false;
                field5243[field5233++] = var179 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var180 = field5243[--field5233];
                if (var180 < 0 || var180 > 2) {
                    var180 = 0;
                }
                class488.field6789.field6691 = var180;
                class488.field6789.method2417(77, class251.field3359);
                return;
            }
            if (arg0 == 6025) {
                int var181 = field5243[--field5233];
                if (var181 < 0 || var181 > class19.method120(class428.field5792, true)) {
                    var181 = 0;
                }
                class488.field6789.field6674 = var181;
                class488.field6789.method2417(111, class251.field3359);
                class464.field6399 = false;
                return;
            }
            if (arg0 == 6027) {
                int var182 = field5243[--field5233];
                if (var182 < 0 || var182 > 1) {
                    var182 = 0;
                }
                class367.method2242(var182 == 1, -5);
                return;
            }
            if (arg0 == 6028) {
                class488.field6789.field6694 = field5243[--field5233] != 0;
                class488.field6789.method2417(93, class251.field3359);
                return;
            }
            if (arg0 == 6029) {
                class488.field6789.field6697 = field5243[--field5233];
                class488.field6789.method2417(91, class251.field3359);
                return;
            }
            if (arg0 == 6030) {
                class488.field6789.field6680 = field5243[--field5233] != 0;
                class488.field6789.method2417(89, class251.field3359);
                class18.method119(true);
                return;
            }
            if (arg0 == 6031) {
                int var183 = field5243[--field5233];
                if (var183 < 0 || var183 > 3) {
                    var183 = 2;
                }
                class107.method664(var183, (byte) 124);
                return;
            }
            if (arg0 == 6032) {
                int var184 = field5243[--field5233];
                if (var184 < 0 || var184 > 3) {
                    var184 = 2;
                }
                class488.field6789.field6663 = var184;
                class488.field6789.method2417(40, class251.field3359);
                class464.field6399 = false;
                return;
            }
            if (arg0 == 6033) {
                int var185 = field5243[--field5233];
                if (var185 < 0 || var185 > 4) {
                    var185 = 2;
                }
                class488.field6789.field6669 = var185;
                class488.field6789.method2417(82, class251.field3359);
                return;
            }
            if (arg0 == 6035) {
                class488.field6789.field5487 = field5243[--field5233] == 1;
                class18.method119(true);
                class34.method256(71);
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field5243[field5233++] = class488.field6789.field6664;
                return;
            }
            if (arg0 == 6102) {
                field5243[field5233++] = class488.field6789.method2416(class222.field2958, (byte) 125) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field5243[field5233++] = class488.field6789.field6666 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field5243[field5233++] = class488.field6789.field6683 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field5243[field5233++] = class488.field6789.field6668 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field5243[field5233++] = class488.field6789.field6697;
                return;
            }
            if (arg0 == 6108) {
                field5243[field5233++] = class488.field6789.field6673 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field5243[field5233++] = class488.field6789.field6676 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field5243[field5233++] = class488.field6789.field6681 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field5243[field5233++] = class488.field6789.field6682;
                return;
            }
            if (arg0 == 6112) {
                field5243[field5233++] = class488.field6789.field6696 ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field5243[field5233++] = class488.field6789.field6686 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field5243[field5233++] = class488.field6789.field6665 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field5243[field5233++] = class488.field6789.field6678;
                return;
            }
            if (arg0 == 6117) {
                field5243[field5233++] = class488.field6789.field6672 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field5243[field5233++] = class488.field6789.field6687;
                return;
            }
            if (arg0 == 6119) {
                field5243[field5233++] = class488.field6789.field6688;
                return;
            }
            if (arg0 == 6120) {
                field5243[field5233++] = class488.field6789.field6671;
                return;
            }
            if (arg0 == 6121) {
                field5243[field5233++] = class98.field1432.method2097() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field5243[field5233++] = class216.method1223(8173);
                return;
            }
            if (arg0 == 6124) {
                field5243[field5233++] = class488.field6789.field6691;
                return;
            }
            if (arg0 == 6125) {
                field5243[field5233++] = class488.field6789.field6674;
                return;
            }
            if (arg0 == 6126) {
                field5243[field5233++] = class98.field1432.method1995() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field5243[field5233++] = class488.field6789.field6679 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field5243[field5233++] = class488.field6789.field6694 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field5243[field5233++] = class488.field6789.field6697;
                return;
            }
            if (arg0 == 6130) {
                field5243[field5233++] = class488.field6789.field6680 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field5243[field5233++] = class222.field2958;
                return;
            }
            if (arg0 == 6132) {
                field5243[field5233++] = class488.field6789.field6663;
                return;
            }
            if (arg0 == 6133) {
                field5243[field5233++] = class241.field3211 == 1 || class241.field3211 == 4 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field5243[field5233++] = class19.method120(class428.field5792, true);
                return;
            }
            if (arg0 == 6135) {
                field5243[field5233++] = class488.field6789.field6669;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field5233 -= 2;
                class153.field2150 = (short) field5243[field5233];
                if (class153.field2150 <= 0) {
                    class153.field2150 = 256;
                }
                class408.field5583 = (short) field5243[field5233 + 1];
                if (class408.field5583 <= 0) {
                    class408.field5583 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field5233 -= 2;
                class89.field1310 = (short) field5243[field5233];
                if (class89.field1310 <= 0) {
                    class89.field1310 = 256;
                }
                class33.field509 = (short) field5243[field5233 + 1];
                if (class33.field509 <= 0) {
                    class33.field509 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field5233 -= 4;
                class107.field1606 = (short) field5243[field5233];
                if (class107.field1606 <= 0) {
                    class107.field1606 = 1;
                }
                class33.field507 = (short) field5243[field5233 + 1];
                if (class33.field507 <= 0) {
                    class33.field507 = 32767;
                } else if (class33.field507 < class107.field1606) {
                    class33.field507 = class107.field1606;
                }
                class138.field2009 = (short) field5243[field5233 + 2];
                if (class138.field2009 <= 0) {
                    class138.field2009 = 1;
                }
                class145.field2092 = (short) field5243[field5233 + 3];
                if (class145.field2092 <= 0) {
                    class145.field2092 = 32767;
                    return;
                }
                if (class145.field2092 < class138.field2009) {
                    class145.field2092 = class138.field2009;
                }
                return;
            }
            if (arg0 == 6203) {
                class223.method1261(0, class42.field601.field6340, false, class42.field601.field6308, 0, (byte) -126);
                field5243[field5233++] = class422.field5730;
                field5243[field5233++] = class13.field182;
                return;
            }
            if (arg0 == 6204) {
                field5243[field5233++] = class89.field1310;
                field5243[field5233++] = class33.field509;
                return;
            }
            if (arg0 == 6205) {
                field5243[field5233++] = class153.field2150;
                field5243[field5233++] = class408.field5583;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field5243[field5233++] = (int) (class440.method2583(25267) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field5243[field5233++] = (int) (class440.method2583(25267) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field5233 -= 3;
                int var186 = field5243[field5233];
                int var187 = field5243[field5233 + 1];
                int var188 = field5243[field5233 + 2];
                field5251.clear();
                field5251.set(11, 12);
                field5251.set(var188, var187, var186);
                field5243[field5233++] = (int) (field5251.getTime().getTime() / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6303) {
                field5251.clear();
                field5251.setTime(new Date(class440.method2583(25267)));
                field5243[field5233++] = field5251.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var189 = field5243[--field5233];
                boolean var190 = true;
                if (var189 < 0) {
                    var190 = (var189 + 1) % 4 == 0;
                } else if (var189 < 1582) {
                    var190 = var189 % 4 == 0;
                } else if (var189 % 4 != 0) {
                    var190 = false;
                } else if (var189 % 100 != 0) {
                    var190 = true;
                } else if (var189 % 400 != 0) {
                    var190 = false;
                }
                field5243[field5233++] = var190 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field5243[field5233++] = class69.method455(-44) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field5243[field5233++] = class401.method2430(true) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class18.field258 == 10 && class318.field4190 == 0 && class18.field256 == 0 && class30.field400 == 0) {
                    field5243[field5233++] = class405.method2445((byte) 98) == -1 ? 0 : 1;
                    return;
                }
                field5243[field5233++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class348 var191 = class225.method1268(0);
                if (var191 != null) {
                    field5243[field5233++] = var191.field4786;
                    field5243[field5233++] = var191.field670;
                    field5234[field5237++] = var191.field4788;
                    class13 var192 = var191.method2152(1343648748);
                    field5243[field5233++] = var192.field178;
                    field5234[field5237++] = var192.field177;
                    field5243[field5233++] = var191.field674;
                    field5243[field5233++] = var191.field4789;
                    return;
                }
                field5243[field5233++] = -1;
                field5243[field5233++] = 0;
                field5234[field5237++] = "";
                field5243[field5233++] = 0;
                field5234[field5237++] = "";
                field5243[field5233++] = 0;
                field5243[field5233++] = 0;
                return;
            }
            if (arg0 == 6502) {
                class348 var193 = class475.method2777(-123);
                if (var193 != null) {
                    field5243[field5233++] = var193.field4786;
                    field5243[field5233++] = var193.field670;
                    field5234[field5237++] = var193.field4788;
                    class13 var194 = var193.method2152(1343648748);
                    field5243[field5233++] = var194.field178;
                    field5234[field5237++] = var194.field177;
                    field5243[field5233++] = var193.field674;
                    field5243[field5233++] = var193.field4789;
                    return;
                }
                field5243[field5233++] = -1;
                field5243[field5233++] = 0;
                field5234[field5237++] = "";
                field5243[field5233++] = 0;
                field5234[field5237++] = "";
                field5243[field5233++] = 0;
                field5243[field5233++] = 0;
                return;
            }
            if (arg0 == 6503) {
                int var195 = field5243[--field5233];
                if (class18.field258 == 10 && class318.field4190 == 0 && class18.field256 == 0 && class30.field400 == 0) {
                    field5243[field5233++] = class385.method2358(var195, (byte) -31) ? 1 : 0;
                    return;
                }
                field5243[field5233++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class488.field6789.field6685 = field5243[--field5233];
                class488.field6789.method2417(96, class251.field3359);
                return;
            }
            if (arg0 == 6505) {
                field5243[field5233++] = class488.field6789.field6685;
                return;
            }
            if (arg0 == 6506) {
                int var196 = field5243[--field5233];
                class348 var197 = class445.method2613(var196, (byte) -13);
                if (var197 != null) {
                    field5243[field5233++] = var197.field670;
                    field5234[field5237++] = var197.field4788;
                    class13 var198 = var197.method2152(1343648748);
                    field5243[field5233++] = var198.field178;
                    field5234[field5237++] = var198.field177;
                    field5243[field5233++] = var197.field674;
                    field5243[field5233++] = var197.field4789;
                    return;
                }
                field5243[field5233++] = -1;
                field5234[field5237++] = "";
                field5243[field5233++] = 0;
                field5234[field5237++] = "";
                field5243[field5233++] = 0;
                field5243[field5233++] = 0;
                return;
            }
            if (arg0 == 6507) {
                field5233 -= 4;
                int var199 = field5243[field5233];
                boolean var200 = field5243[field5233 + 1] == 1;
                int var201 = field5243[field5233 + 2];
                boolean var202 = field5243[field5233 + 3] == 1;
                class343.method1947(var200, var202, (byte) 70, var201, var199);
                return;
            }
            if (arg0 == 6508) {
                class490.method2853(-1);
                return;
            }
            if (arg0 == 6509) {
                if (class18.field258 != 10) {
                    return;
                }
                class111.field1688 = field5243[--field5233] == 1;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class488.field6789.field6670 = field5243[--field5233] == 1;
                class488.field6789.method2417(33, class251.field3359);
                return;
            }
            if (arg0 == 6601) {
                field5243[field5233++] = class488.field6789.field6670 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class357.field4940 == class1.field24) {
            if (arg0 == 6700) {
                int var203 = class214.field2883.method1521((byte) -108);
                if (class196.field2674 != -1) {
                    var203++;
                }
                field5243[field5233++] = var203;
                return;
            }
            if (arg0 == 6701) {
                int var204 = field5243[--field5233];
                if (class196.field2674 != -1) {
                    if (var204 == 0) {
                        field5243[field5233++] = class196.field2674;
                        return;
                    }
                    var204--;
                }
                class132 var205 = (class132) class214.field2883.method1518((byte) -77);
                while (var204-- > 0) {
                    var205 = (class132) class214.field2883.method1517(-30942);
                }
                field5243[field5233++] = var205.field1939;
                return;
            }
            if (arg0 == 6702) {
                int var206 = field5243[--field5233];
                if (class146.field2099[var206] == null) {
                    field5234[field5237++] = "";
                    return;
                }
                String var207 = class146.field2099[var206][0].field6287;
                if (var207 == null) {
                    field5234[field5237++] = "";
                    return;
                }
                field5234[field5237++] = var207.substring(0, var207.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var208 = field5243[--field5233];
                if (class146.field2099[var208] == null) {
                    field5243[field5233++] = 0;
                    return;
                }
                field5243[field5233++] = class146.field2099[var208].length;
                return;
            }
            if (arg0 == 6704) {
                field5233 -= 2;
                int var209 = field5243[field5233];
                int var210 = field5243[field5233 + 1];
                if (class146.field2099[var209] == null) {
                    field5234[field5237++] = "";
                    return;
                }
                String var211 = class146.field2099[var209][var210].field6287;
                if (var211 == null) {
                    field5234[field5237++] = "";
                    return;
                }
                field5234[field5237++] = var211;
                return;
            }
            if (arg0 == 6705) {
                field5233 -= 2;
                int var212 = field5243[field5233];
                int var213 = field5243[field5233 + 1];
                if (class146.field2099[var212] == null) {
                    field5243[field5233++] = 0;
                    return;
                }
                field5243[field5233++] = class146.field2099[var212][var213].field6305;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field5233 -= 3;
                int var214 = field5243[field5233];
                int var215 = field5243[field5233 + 1];
                int var216 = field5243[field5233 + 2];
                class270.method1534(var214 << 16 | var215, 1, -1, "", var216);
                return;
            }
            if (arg0 == 6708) {
                field5233 -= 3;
                int var217 = field5243[field5233];
                int var218 = field5243[field5233 + 1];
                int var219 = field5243[field5233 + 2];
                class270.method1534(var217 << 16 | var218, 2, -1, "", var219);
                return;
            }
            if (arg0 == 6709) {
                field5233 -= 3;
                int var220 = field5243[field5233];
                int var221 = field5243[field5233 + 1];
                int var222 = field5243[field5233 + 2];
                class270.method1534(var220 << 16 | var221, 3, -1, "", var222);
                return;
            }
            if (arg0 == 6710) {
                field5233 -= 3;
                int var223 = field5243[field5233];
                int var224 = field5243[field5233 + 1];
                int var225 = field5243[field5233 + 2];
                class270.method1534(var223 << 16 | var224, 4, -1, "", var225);
                return;
            }
            if (arg0 == 6711) {
                field5233 -= 3;
                int var226 = field5243[field5233];
                int var227 = field5243[field5233 + 1];
                int var228 = field5243[field5233 + 2];
                class270.method1534(var226 << 16 | var227, 5, -1, "", var228);
                return;
            }
            if (arg0 == 6712) {
                field5233 -= 3;
                int var229 = field5243[field5233];
                int var230 = field5243[field5233 + 1];
                int var231 = field5243[field5233 + 2];
                class270.method1534(var229 << 16 | var230, 6, -1, "", var231);
                return;
            }
            if (arg0 == 6713) {
                field5233 -= 3;
                int var232 = field5243[field5233];
                int var233 = field5243[field5233 + 1];
                int var234 = field5243[field5233 + 2];
                class270.method1534(var232 << 16 | var233, 7, -1, "", var234);
                return;
            }
            if (arg0 == 6714) {
                field5233 -= 3;
                int var235 = field5243[field5233];
                int var236 = field5243[field5233 + 1];
                int var237 = field5243[field5233 + 2];
                class270.method1534(var235 << 16 | var236, 8, -1, "", var237);
                return;
            }
            if (arg0 == 6715) {
                field5233 -= 3;
                int var238 = field5243[field5233];
                int var239 = field5243[field5233 + 1];
                int var240 = field5243[field5233 + 2];
                class270.method1534(var238 << 16 | var239, 9, -1, "", var240);
                return;
            }
            if (arg0 == 6716) {
                field5233 -= 3;
                int var241 = field5243[field5233];
                int var242 = field5243[field5233 + 1];
                int var243 = field5243[field5233 + 2];
                class270.method1534(var241 << 16 | var242, 10, -1, "", var243);
                return;
            }
            if (arg0 == 6717) {
                field5233 -= 3;
                int var244 = field5243[field5233];
                int var245 = field5243[field5233 + 1];
                int var246 = field5243[field5233 + 2];
                class464 var247 = class78.method519(var244 << 16 | var245, var246, (byte) -72);
                class78.method513(-1);
                class222 var248 = client.method1046(var247);
                class481.method2807(var247.field6291, var248.method1256((byte) -122), var244 << 16 | var245, var246, (byte) 71, var247.field6375, var248.field2955);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var249 = field5243[--field5233];
                class313 var250 = class464.field6319.method2710(26, var249);
                if (var250.field4136 == null) {
                    field5234[field5237++] = "";
                    return;
                }
                field5234[field5237++] = var250.field4136;
                return;
            }
            if (arg0 == 6801) {
                int var251 = field5243[--field5233];
                class313 var252 = class464.field6319.method2710(26, var251);
                field5243[field5233++] = var252.field4134;
                return;
            }
            if (arg0 == 6802) {
                int var253 = field5243[--field5233];
                class313 var254 = class464.field6319.method2710(26, var253);
                field5243[field5233++] = var254.field4131;
                return;
            }
            if (arg0 == 6803) {
                int var255 = field5243[--field5233];
                class313 var256 = class464.field6319.method2710(26, var255);
                field5243[field5233++] = var256.field4139;
                return;
            }
            if (arg0 == 6804) {
                field5233 -= 2;
                int var257 = field5243[field5233];
                int var258 = field5243[field5233 + 1];
                class112 var259 = class94.field1387.method164(27, var258);
                if (var259.method721(-116)) {
                    field5234[field5237++] = class464.field6319.method2710(26, var257).method1719((byte) 85, var258, var259.field1694);
                    return;
                }
                field5243[field5233++] = class464.field6319.method2710(26, var257).method1722(var259.field1702, var258, false);
                return;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Ljs;I)V")
    private static final void method2349(class199 arg0, int arg1) {
        field5233 = 0;
        field5237 = 0;
        int var2 = -1;
        int[] var3 = arg0.field2686;
        int[] var4 = arg0.field2691;
        byte var5 = -1;
        field5249 = 0;
        try {
            int var6 = 0;
            label260: while (true) {
                var6++;
                if (var6 > arg1) {
                    throw new RuntimeException("slow");
                }
                var2++;
                int var43 = var3[var2];
                if (var43 >= 100) {
                    boolean var35;
                    if (var4[var2] == 1) {
                        var35 = true;
                    } else {
                        var35 = false;
                    }
                    if (var43 >= 100 && var43 < 5000) {
                        method2344(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method2348(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field5243[field5233++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field5243[field5233++] = class38.field562.field4585[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class38.field562.method1943(false, var8, field5243[--field5233]);
                } else if (var43 == 3) {
                    field5234[field5237++] = arg0.field2693[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field5233 -= 2;
                    if (field5243[field5233 + 1] != field5243[field5233]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field5233 -= 2;
                    if (field5243[field5233 + 1] == field5243[field5233]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field5233 -= 2;
                    if (field5243[field5233] < field5243[field5233 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field5233 -= 2;
                    if (field5243[field5233] > field5243[field5233 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field5249 == 0) {
                        return;
                    }
                    class172 var9 = field5236[--field5249];
                    arg0 = var9.field2359;
                    var3 = arg0.field2686;
                    var4 = arg0.field2691;
                    var2 = var9.field2360;
                    field5240 = var9.field2357;
                    field5247 = var9.field2356;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field5243[field5233++] = class38.field562.method1455((byte) -35, var10);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class38.field562.method1942(var11, 0, field5243[--field5233]);
                } else if (var43 == 31) {
                    field5233 -= 2;
                    if (field5243[field5233] <= field5243[field5233 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field5233 -= 2;
                    if (field5243[field5233] >= field5243[field5233 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field5243[field5233++] = field5240[var4[var2]];
                } else if (var43 == 34) {
                    field5240[var4[var2]] = field5243[--field5233];
                } else if (var43 == 35) {
                    field5234[field5237++] = field5247[var4[var2]];
                } else if (var43 == 36) {
                    field5247[var4[var2]] = field5234[--field5237];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field5237 -= var12;
                    String var13 = class387.method2380(field5237, 21870, field5234, var12);
                    field5234[field5237++] = var13;
                } else if (var43 == 38) {
                    field5233--;
                } else if (var43 == 39) {
                    field5237--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class199 var15 = class110.method713(var14, (byte) -50);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field2684];
                    String[] var17 = new String[var15.field2694];
                    for (int var18 = 0; var18 < var15.field2696; var18++) {
                        var16[var18] = field5243[field5233 + var18 - var15.field2696];
                    }
                    for (int var19 = 0; var19 < var15.field2692; var19++) {
                        var17[var19] = field5234[field5237 + var19 - var15.field2692];
                    }
                    field5233 -= var15.field2696;
                    field5237 -= var15.field2692;
                    class172 var20 = new class172();
                    var20.field2359 = arg0;
                    var20.field2360 = var2;
                    var20.field2357 = field5240;
                    var20.field2356 = field5247;
                    if (field5249 >= field5236.length) {
                        throw new RuntimeException();
                    }
                    field5236[field5249++] = var20;
                    arg0 = var15;
                    var3 = var15.field2686;
                    var4 = var15.field2691;
                    var2 = -1;
                    field5240 = var16;
                    field5247 = var17;
                } else if (var43 == 42) {
                    field5243[field5233++] = class311.field4102[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class311.field4102[var21] = field5243[--field5233];
                    class34.method257(var21, 1);
                    class485.field6703 |= class387.field5359[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field5243[--field5233];
                    if (var24 >= 0 && var24 <= 5000) {
                        field5257[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field5252[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field5243[--field5233];
                    if (var28 < 0 || var28 >= field5257[var27]) {
                        throw new RuntimeException();
                    }
                    field5243[field5233++] = field5252[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field5233 -= 2;
                    int var30 = field5243[field5233];
                    if (var30 < 0 || var30 >= field5257[var29]) {
                        throw new RuntimeException();
                    }
                    field5252[var29][var30] = field5243[field5233 + 1];
                } else if (var43 == 47) {
                    String var31 = class311.field4098[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field5234[field5237++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class311.field4098[var32] = field5234[--field5237];
                    class433.method2553(var32, -528142201);
                } else if (var43 == 51) {
                    class268 var33 = arg0.field2689[var4[var2]];
                    class37 var34 = (class37) var33.method1528((long) field5243[--field5233], 93);
                    if (var34 != null) {
                        var2 += var34.field555;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field2685 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field6047).append(" ");
                for (int var41 = field5249 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field5236[var41].field2359.field6047).append(" ");
                }
                var40.append("op: ").append(var5);
                class228.method1278(var42, var40.toString(), -30116);
            } else {
                class78.method514(0, "Clientscript error in: " + arg0.field2685);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field2685).append("\n");
                for (int var38 = field5249 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field5236[var38].field2359.field2685).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class228.method1278(var42, var37.toString(), -30116);
                class279.method1574(var37.toString(), -112);
            }
        }
    }
}
