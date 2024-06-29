import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class123 {

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "[I")
    private static int[] field1993 = new int[1000];

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "[Lhm;")
    private static class186[] field1994 = new class186[50];

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "[[I")
    private static int[][] field1996 = new int[5][5000];

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "[I")
    private static int[] field1991 = new int[5];

    @OriginalMember(owner = "client!mr", name = "o", descriptor = "I")
    private static int field2001 = 0;

    @OriginalMember(owner = "client!mr", name = "p", descriptor = "I")
    private static int field2002 = 0;

    @OriginalMember(owner = "client!mr", name = "t", descriptor = "I")
    private static int field2006 = 0;

    @OriginalMember(owner = "client!mr", name = "w", descriptor = "[Ljava/lang/String;")
    private static String[] field2009 = new String[1000];

    @OriginalMember(owner = "client!mr", name = "y", descriptor = "Ljava/util/Calendar;")
    private static Calendar field2011 = Calendar.getInstance();

    @OriginalMember(owner = "client!mr", name = "z", descriptor = "[Ljava/lang/String;")
    private static String[] field2012 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!mr", name = "B", descriptor = "[I")
    private static int[] field2014 = new int[3];

    @OriginalMember(owner = "client!mr", name = "A", descriptor = "Lh;")
    public static class571 field2013 = new class571(4);

    @OriginalMember(owner = "client!mr", name = "C", descriptor = "I")
    private static int field2015 = 0;

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!mr", name = "k", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!mr", name = "m", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!mr", name = "q", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!mr", name = "r", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!mr", name = "s", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!mr", name = "u", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!mr", name = "x", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "Lmc;")
    private static class114 field1989;

    @OriginalMember(owner = "client!mr", name = "l", descriptor = "Lmc;")
    private static class114 field1998;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "Lsba;")
    private static class183 field1987;

    @OriginalMember(owner = "client!mr", name = "v", descriptor = "[I")
    private static int[] field2008;

    @OriginalMember(owner = "client!mr", name = "n", descriptor = "[Ljava/lang/String;")
    private static String[] field2000;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V")
    public static final void method849(int arg0) {
        if (arg0 == -1 || !class377.method2232(125, arg0)) {
            return;
        }
        class114[] var1 = class618.field8850[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class114 var3 = var1[var2];
            if (var3.field1792 != null) {
                class224 var4 = new class224();
                var4.field3210 = var3;
                var4.field3207 = var3.field1792;
                method852(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method850(String arg0, int arg1) {
        if (class258.field3599 == 0 && !(!class480.field6767 || class600.field8654) || class154.field2314) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class393.field5547.method739(0, 63))) {
            var3 = 0;
            arg0 = arg0.substring(class393.field5547.method739(0, 121).length());
        } else if (var2.startsWith(class576.field7928.method739(0, -113))) {
            var3 = 1;
            arg0 = arg0.substring(class576.field7928.method739(0, -85).length());
        } else if (var2.startsWith(class370.field5015.method739(0, 105))) {
            var3 = 2;
            arg0 = arg0.substring(class370.field5015.method739(0, 87).length());
        } else if (var2.startsWith(class176.field2520.method739(0, -124))) {
            var3 = 3;
            arg0 = arg0.substring(class176.field2520.method739(0, 122).length());
        } else if (var2.startsWith(class621.field8955.method739(0, 55))) {
            var3 = 4;
            arg0 = arg0.substring(class621.field8955.method739(0, 121).length());
        } else if (var2.startsWith(class398.field5675.method739(0, 102))) {
            var3 = 5;
            arg0 = arg0.substring(class398.field5675.method739(0, 83).length());
        } else if (var2.startsWith(class358.field4826.method739(0, 90))) {
            var3 = 6;
            arg0 = arg0.substring(class358.field4826.method739(0, 68).length());
        } else if (var2.startsWith(class585.field8358.method739(0, -69))) {
            var3 = 7;
            arg0 = arg0.substring(class585.field8358.method739(0, 75).length());
        } else if (var2.startsWith(class473.field6639.method739(0, 95))) {
            var3 = 8;
            arg0 = arg0.substring(class473.field6639.method739(0, -73).length());
        } else if (var2.startsWith(class118.field1938.method739(0, 80))) {
            var3 = 9;
            arg0 = arg0.substring(class118.field1938.method739(0, 98).length());
        } else if (var2.startsWith(class645.field9368.method739(0, -115))) {
            var3 = 10;
            arg0 = arg0.substring(class645.field9368.method739(0, 106).length());
        } else if (var2.startsWith(class630.field9225.method739(0, 116))) {
            var3 = 11;
            arg0 = arg0.substring(class630.field9225.method739(0, 85).length());
        } else if (class173.field2491 != 0) {
            if (var2.startsWith(class393.field5547.method739(class173.field2491, -114))) {
                var3 = 0;
                arg0 = arg0.substring(class393.field5547.method739(class173.field2491, 105).length());
            } else if (var2.startsWith(class576.field7928.method739(class173.field2491, 60))) {
                var3 = 1;
                arg0 = arg0.substring(class576.field7928.method739(class173.field2491, 76).length());
            } else if (var2.startsWith(class370.field5015.method739(class173.field2491, 92))) {
                var3 = 2;
                arg0 = arg0.substring(class370.field5015.method739(class173.field2491, -116).length());
            } else if (var2.startsWith(class176.field2520.method739(class173.field2491, -77))) {
                var3 = 3;
                arg0 = arg0.substring(class176.field2520.method739(class173.field2491, 63).length());
            } else if (var2.startsWith(class621.field8955.method739(class173.field2491, -113))) {
                var3 = 4;
                arg0 = arg0.substring(class621.field8955.method739(class173.field2491, 80).length());
            } else if (var2.startsWith(class398.field5675.method739(class173.field2491, 94))) {
                var3 = 5;
                arg0 = arg0.substring(class398.field5675.method739(class173.field2491, -93).length());
            } else if (var2.startsWith(class358.field4826.method739(class173.field2491, -107))) {
                var3 = 6;
                arg0 = arg0.substring(class358.field4826.method739(class173.field2491, -61).length());
            } else if (var2.startsWith(class585.field8358.method739(class173.field2491, 79))) {
                var3 = 7;
                arg0 = arg0.substring(class585.field8358.method739(class173.field2491, -113).length());
            } else if (var2.startsWith(class473.field6639.method739(class173.field2491, 103))) {
                var3 = 8;
                arg0 = arg0.substring(class473.field6639.method739(class173.field2491, 80).length());
            } else if (var2.startsWith(class118.field1938.method739(class173.field2491, -47))) {
                var3 = 9;
                arg0 = arg0.substring(class118.field1938.method739(class173.field2491, 108).length());
            } else if (var2.startsWith(class645.field9368.method739(class173.field2491, 61))) {
                var3 = 10;
                arg0 = arg0.substring(class645.field9368.method739(class173.field2491, 59).length());
            } else if (var2.startsWith(class630.field9225.method739(class173.field2491, 75))) {
                var3 = 11;
                arg0 = arg0.substring(class630.field9225.method739(class173.field2491, -68).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class112.field1724.method739(0, -109))) {
            var5 = 1;
            arg0 = arg0.substring(class112.field1724.method739(0, -62).length());
        } else if (var4.startsWith(class66.field1114.method739(0, 61))) {
            var5 = 2;
            arg0 = arg0.substring(class66.field1114.method739(0, -110).length());
        } else if (var4.startsWith(class404.field5753.method739(0, 73))) {
            var5 = 3;
            arg0 = arg0.substring(class404.field5753.method739(0, 125).length());
        } else if (var4.startsWith(class479.field6762.method739(0, -102))) {
            var5 = 4;
            arg0 = arg0.substring(class479.field6762.method739(0, 105).length());
        } else if (var4.startsWith(class190.field2692.method739(0, 126))) {
            var5 = 5;
            arg0 = arg0.substring(class190.field2692.method739(0, -61).length());
        } else if (class173.field2491 != 0) {
            if (var4.startsWith(class112.field1724.method739(class173.field2491, 108))) {
                var5 = 1;
                arg0 = arg0.substring(class112.field1724.method739(class173.field2491, -71).length());
            } else if (var4.startsWith(class66.field1114.method739(class173.field2491, 99))) {
                var5 = 2;
                arg0 = arg0.substring(class66.field1114.method739(class173.field2491, 103).length());
            } else if (var4.startsWith(class404.field5753.method739(class173.field2491, 108))) {
                var5 = 3;
                arg0 = arg0.substring(class404.field5753.method739(class173.field2491, 58).length());
            } else if (var4.startsWith(class479.field6762.method739(class173.field2491, 121))) {
                var5 = 4;
                arg0 = arg0.substring(class479.field6762.method739(class173.field2491, 69).length());
            } else if (var4.startsWith(class190.field2692.method739(class173.field2491, 77))) {
                var5 = 5;
                arg0 = arg0.substring(class190.field2692.method739(class173.field2491, -109).length());
            }
        }
        field1999++;
        class351.method2108(class552.field7626, -10511);
        class479.field6754.method108((byte) -128, 0);
        int var6 = class479.field6754.field165;
        if (arg1 == 5021) {
            class479.field6754.method108((byte) -128, 1);
        } else {
            class479.field6754.method108((byte) -128, 0);
        }
        class479.field6754.method108((byte) -128, var3);
        class479.field6754.method108((byte) -128, var5);
        class49.method480(arg0, 41, class479.field6754);
        class479.field6754.method66(class479.field6754.field165 - var6, false);
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(I)Ljava/lang/String;")
    private static final String method851(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field2011.setTime(new Date(var1));
        int var3 = field2011.get(5);
        int var4 = field2011.get(2);
        int var5 = field2011.get(1);
        return var3 + "-" + field2012[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lcl;I)V")
    private static final void method852(class224 arg0, int arg1) {
        Object[] var2 = arg0.field3207;
        int var3 = (Integer) var2[0];
        class560 var4 = class218.method1411(true, var3);
        if (var4 == null) {
            return;
        }
        field2008 = new int[var4.field7759];
        int var5 = 0;
        field2000 = new String[var4.field7753];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field3202;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field3211;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field3210 == null ? -1 : arg0.field3210.field1810;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field3212;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field3210 == null ? -1 : arg0.field3210.field1749;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field3204 == null ? -1 : arg0.field3204.field1810;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field3204 == null ? -1 : arg0.field3204.field1749;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field3206;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field3200;
                }
                field2008[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field3201;
                }
                field2000[var6++] = var9;
            }
        }
        field2015 = arg0.field3198;
        method855(var4, arg1);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IZ)V")
    private static final void method853(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field1993[field2001++] = class632.field9247;
                return;
            }
            if (arg0 == 5001) {
                field2001 -= 3;
                class632.field9247 = field1993[field2001];
                class193.field2730 = class107.method756(field1993[field2001 + 1], -118);
                if (class193.field2730 == null) {
                    class193.field2730 = class95.field1455;
                }
                class21.field316 = field1993[field2001 + 2];
                field2003++;
                class351.method2108(class408.field5785, -10511);
                class479.field6754.method108((byte) -128, class632.field9247);
                class479.field6754.method108((byte) -128, class193.field2730.field5787);
                class479.field6754.method108((byte) -128, class21.field316);
                return;
            }
            if (arg0 == 5002) {
                field2006 -= 2;
                String var2 = field2009[field2006];
                String var3 = field2009[field2006 + 1];
                field2001 -= 2;
                int var4 = field1993[field2001];
                int var5 = field1993[field2001 + 1];
                if (var3 == null) {
                    var3 = "";
                }
                if (var3.length() > 80) {
                    var3 = var3.substring(0, 80);
                }
                field2007++;
                class351.method2108(class224.field3199, -10511);
                class479.field6754.method108((byte) -128, class452.method2655(-69, var2) + class452.method2655(-39, var3) + 2);
                class479.field6754.method74(var2, 0);
                class479.field6754.method108((byte) -128, var4 - 1);
                class479.field6754.method108((byte) -128, var5);
                class479.field6754.method74(var3, 0);
                return;
            }
            if (arg0 == 5003) {
                int var6 = field1993[--field2001];
                class170 var7 = class194.method1210(30, var6);
                String var8 = "";
                if (var7 != null && var7.field2464 != null) {
                    var8 = var7.field2464;
                }
                field2009[field2006++] = var8;
                return;
            }
            if (arg0 == 5004) {
                int var9 = field1993[--field2001];
                class170 var10 = class194.method1210(30, var9);
                int var11 = -1;
                if (var10 != null) {
                    var11 = var10.field2452;
                }
                field1993[field2001++] = var11;
                return;
            }
            if (arg0 == 5005) {
                if (class193.field2730 == null) {
                    field1993[field2001++] = -1;
                    return;
                }
                field1993[field2001++] = class193.field2730.field5787;
                return;
            }
            if (arg0 == 5008 || arg0 == 5021) {
                String var12 = field2009[--field2006];
                method850(var12, arg0);
                return;
            }
            if (arg0 == 5009) {
                field2006 -= 2;
                String var13 = field2009[field2006];
                String var14 = field2009[field2006 + 1];
                if (class258.field3599 != 0 || (!class480.field6767 || class600.field8654) && !class154.field2314) {
                    field2004++;
                    class351.method2108(class283.field3904, -10511);
                    class479.field6754.method108((byte) -128, 0);
                    int var15 = class479.field6754.field165;
                    class479.field6754.method74(var13, 0);
                    class49.method480(var14, 102, class479.field6754);
                    class479.field6754.method66(class479.field6754.field165 - var15, false);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var16 = field1993[--field2001];
                class170 var17 = class194.method1210(30, var16);
                String var18 = "";
                if (var17 != null && var17.field2463 != null) {
                    var18 = var17.field2463;
                }
                field2009[field2006++] = var18;
                return;
            }
            if (arg0 == 5011) {
                int var19 = field1993[--field2001];
                class170 var20 = class194.method1210(30, var19);
                String var21 = "";
                if (var20 != null && var20.field2454 != null) {
                    var21 = var20.field2454;
                }
                field2009[field2006++] = var21;
                return;
            }
            if (arg0 == 5012) {
                int var22 = field1993[--field2001];
                class170 var23 = class194.method1210(30, var22);
                int var24 = -1;
                if (var23 != null) {
                    var24 = var23.field2457;
                }
                field1993[field2001++] = var24;
                return;
            }
            if (arg0 == 5015) {
                String var25;
                if (class645.field9372 == null || class645.field9372.field2674 == null) {
                    var25 = class146.field2257;
                } else {
                    var25 = class645.field9372.method1170(true, -11076);
                }
                field2009[field2006++] = var25;
                return;
            }
            if (arg0 == 5016) {
                field1993[field2001++] = class21.field316;
                return;
            }
            if (arg0 == 5017) {
                field1993[field2001++] = class368.method2209(0);
                return;
            }
            if (arg0 == 5018) {
                int var26 = field1993[--field2001];
                class170 var27 = class194.method1210(30, var26);
                int var28 = 0;
                if (var27 != null) {
                    var28 = var27.field2461;
                }
                field1993[field2001++] = var28;
                return;
            }
            if (arg0 == 5019) {
                int var29 = field1993[--field2001];
                class170 var30 = class194.method1210(30, var29);
                String var31 = "";
                if (var30 != null && var30.field2453 != null) {
                    var31 = var30.field2453;
                }
                field2009[field2006++] = var31;
                return;
            }
            if (arg0 == 5020) {
                String var32;
                if (class645.field9372 == null || class645.field9372.field2674 == null) {
                    var32 = class146.field2257;
                } else {
                    var32 = class645.field9372.method1172(false, -107);
                }
                field2009[field2006++] = var32;
                return;
            }
            if (arg0 == 5023) {
                int var33 = field1993[--field2001];
                class170 var34 = class194.method1210(30, var33);
                int var35 = -1;
                if (var34 != null) {
                    var35 = var34.field2458;
                }
                field1993[field2001++] = var35;
                return;
            }
            if (arg0 == 5024) {
                int var36 = field1993[--field2001];
                class170 var37 = class194.method1210(30, var36);
                int var38 = -1;
                if (var37 != null) {
                    var38 = var37.field2456;
                }
                field1993[field2001++] = var38;
                return;
            }
            if (arg0 == 5050) {
                int var39 = field1993[--field2001];
                field2009[field2006++] = class169.field2444.method978((byte) 127, var39).field2222;
                return;
            }
            if (arg0 == 5051) {
                int var40 = field1993[--field2001];
                class144 var41 = class169.field2444.method978((byte) 61, var40);
                if (var41.field2228 == null) {
                    field1993[field2001++] = 0;
                    return;
                }
                field1993[field2001++] = var41.field2228.length;
                return;
            }
            if (arg0 == 5052) {
                field2001 -= 2;
                int var42 = field1993[field2001];
                int var43 = field1993[field2001 + 1];
                class144 var44 = class169.field2444.method978((byte) 68, var42);
                int var45 = var44.field2228[var43];
                field1993[field2001++] = var45;
                return;
            }
            if (arg0 == 5053) {
                int var46 = field1993[--field2001];
                class144 var47 = class169.field2444.method978((byte) 70, var46);
                if (var47.field2223 == null) {
                    field1993[field2001++] = 0;
                    return;
                }
                field1993[field2001++] = var47.field2223.length;
                return;
            }
            if (arg0 == 5054) {
                field2001 -= 2;
                int var48 = field1993[field2001];
                int var49 = field1993[field2001 + 1];
                field1993[field2001++] = class169.field2444.method978((byte) 109, var48).field2223[var49];
                return;
            }
            if (arg0 == 5055) {
                int var50 = field1993[--field2001];
                field2009[field2006++] = class451.field6374.method2202(var50, 116).method2638(17611);
                return;
            }
            if (arg0 == 5056) {
                int var51 = field1993[--field2001];
                class446 var52 = class451.field6374.method2202(var51, 121);
                if (var52.field6336 == null) {
                    field1993[field2001++] = 0;
                    return;
                }
                field1993[field2001++] = var52.field6336.length;
                return;
            }
            if (arg0 == 5057) {
                field2001 -= 2;
                int var53 = field1993[field2001];
                int var54 = field1993[field2001 + 1];
                field1993[field2001++] = class451.field6374.method2202(var53, 118).field6336[var54];
                return;
            }
            if (arg0 == 5058) {
                field1987 = new class183();
                field1987.field2584 = field1993[--field2001];
                field1987.field2582 = class451.field6374.method2202(field1987.field2584, 119);
                field1987.field2586 = new int[field1987.field2582.method2639(0)];
                return;
            }
            if (arg0 == 5059) {
                field1988++;
                class351.method2108(class320.field4327, -10511);
                class479.field6754.method108((byte) -128, 0);
                int var55 = class479.field6754.field165;
                class479.field6754.method108((byte) -128, 0);
                class479.field6754.method84(field1987.field2584, (byte) -112);
                field1987.field2582.method2634((byte) -84, class479.field6754, field1987.field2586);
                class479.field6754.method66(class479.field6754.field165 - var55, false);
                return;
            }
            if (arg0 == 5060) {
                String var56 = field2009[--field2006];
                field1990++;
                class351.method2108(class261.field3624, -10511);
                class479.field6754.method108((byte) -128, 0);
                int var57 = class479.field6754.field165;
                class479.field6754.method74(var56, 0);
                class479.field6754.method84(field1987.field2584, (byte) -118);
                field1987.field2582.method2634((byte) -115, class479.field6754, field1987.field2586);
                class479.field6754.method66(class479.field6754.field165 - var57, false);
                return;
            }
            if (arg0 == 5061) {
                field1988++;
                class351.method2108(class320.field4327, -10511);
                class479.field6754.method108((byte) -128, 0);
                int var58 = class479.field6754.field165;
                class479.field6754.method108((byte) -128, 1);
                class479.field6754.method84(field1987.field2584, (byte) -119);
                field1987.field2582.method2634((byte) -107, class479.field6754, field1987.field2586);
                class479.field6754.method66(class479.field6754.field165 - var58, false);
                return;
            }
            if (arg0 == 5062) {
                field2001 -= 2;
                int var59 = field1993[field2001];
                int var60 = field1993[field2001 + 1];
                field1993[field2001++] = class169.field2444.method978((byte) 98, var59).field2220[var60];
                return;
            }
            if (arg0 == 5063) {
                field2001 -= 2;
                int var61 = field1993[field2001];
                int var62 = field1993[field2001 + 1];
                field1993[field2001++] = class169.field2444.method978((byte) 127, var61).field2218[var62];
                return;
            }
            if (arg0 == 5064) {
                field2001 -= 2;
                int var63 = field1993[field2001];
                int var64 = field1993[field2001 + 1];
                if (var64 == -1) {
                    field1993[field2001++] = -1;
                    return;
                }
                field1993[field2001++] = class169.field2444.method978((byte) 85, var63).method953(18765, (char) var64);
                return;
            }
            if (arg0 == 5065) {
                field2001 -= 2;
                int var65 = field1993[field2001];
                int var66 = field1993[field2001 + 1];
                if (var66 == -1) {
                    field1993[field2001++] = -1;
                    return;
                }
                field1993[field2001++] = class169.field2444.method978((byte) 110, var65).method950((char) var66, 124);
                return;
            }
            if (arg0 == 5066) {
                int var67 = field1993[--field2001];
                field1993[field2001++] = class451.field6374.method2202(var67, 126).method2639(0);
                return;
            }
            if (arg0 == 5067) {
                field2001 -= 2;
                int var68 = field1993[field2001];
                int var69 = field1993[field2001 + 1];
                int var70 = class451.field6374.method2202(var68, 118).method2633(true, var69).field3157;
                field1993[field2001++] = var70;
                return;
            }
            if (arg0 == 5068) {
                field2001 -= 2;
                int var71 = field1993[field2001];
                int var72 = field1993[field2001 + 1];
                field1987.field2586[var71] = var72;
                return;
            }
            if (arg0 == 5069) {
                field2001 -= 2;
                int var73 = field1993[field2001];
                int var74 = field1993[field2001 + 1];
                field1987.field2586[var73] = var74;
                return;
            }
            if (arg0 == 5070) {
                field2001 -= 3;
                int var75 = field1993[field2001];
                int var76 = field1993[field2001 + 1];
                int var77 = field1993[field2001 + 2];
                class446 var78 = class451.field6374.method2202(var75, 114);
                if (var78.method2633(true, var76).field3157 != 0) {
                    throw new RuntimeException("bad command");
                }
                field1993[field2001++] = var78.method2636(false, var77, var76);
                return;
            }
            if (arg0 == 5071) {
                String var79 = field2009[--field2006];
                boolean var80 = field1993[--field2001] == 1;
                class440.method2601((byte) -78, var80, var79);
                field1993[field2001++] = class568.field7844;
                return;
            }
            if (arg0 == 5072) {
                if (class512.field7212 != null && class536.field7493 < class568.field7844) {
                    field1993[field2001++] = class512.field7212[class536.field7493++] & 0xFFFF;
                    return;
                }
                field1993[field2001++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class536.field7493 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class316.field4245.method2691(86, 19521)) {
                    field1993[field2001++] = 1;
                    return;
                }
                field1993[field2001++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class316.field4245.method2691(82, 19521)) {
                    field1993[field2001++] = 1;
                    return;
                }
                field1993[field2001++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class316.field4245.method2691(81, 19521)) {
                    field1993[field2001++] = 1;
                    return;
                }
                field1993[field2001++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class470.method2738(field1993[--field2001], (byte) -44);
                return;
            }
            if (arg0 == 5201) {
                field1993[field2001++] = class516.method2982((byte) 25);
                return;
            }
            if (arg0 == 5205) {
                class341.method2069(22355, -1, -1, field1993[--field2001], false);
                return;
            }
            if (arg0 == 5206) {
                int var81 = field1993[--field2001];
                class477 var82 = class413.method2464(var81 >> 14 & 0x3FFF, var81 & 0x3FFF);
                if (var82 == null) {
                    field1993[field2001++] = -1;
                    return;
                }
                field1993[field2001++] = var82.field6715;
                return;
            }
            if (arg0 == 5207) {
                class477 var83 = class413.method2460(field1993[--field2001]);
                if (var83 != null && var83.field6716 != null) {
                    field2009[field2006++] = var83.field6716;
                    return;
                }
                field2009[field2006++] = "";
                return;
            }
            if (arg0 == 5208) {
                field1993[field2001++] = class86.field1380;
                field1993[field2001++] = class271.field3772;
                return;
            }
            if (arg0 == 5209) {
                field1993[field2001++] = class413.field5829 + class285.field3931;
                field1993[field2001++] = class627.field9160 + class413.field5826;
                return;
            }
            if (arg0 == 5210) {
                int var84 = field1993[--field2001];
                class477 var85 = class413.method2460(var84);
                if (var85 == null) {
                    field1993[field2001++] = 0;
                    field1993[field2001++] = 0;
                    return;
                }
                field1993[field2001++] = var85.field6730 >> 14 & 0x3FFF;
                field1993[field2001++] = var85.field6730 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var86 = field1993[--field2001];
                class477 var87 = class413.method2460(var86);
                if (var87 == null) {
                    field1993[field2001++] = 0;
                    field1993[field2001++] = 0;
                    return;
                }
                field1993[field2001++] = var87.field6717 - var87.field6719;
                field1993[field2001++] = var87.field6720 - var87.field6727;
                return;
            }
            if (arg0 == 5212) {
                class299 var88 = class193.method1199((byte) -127);
                if (var88 == null) {
                    field1993[field2001++] = -1;
                    field1993[field2001++] = -1;
                    return;
                }
                field1993[field2001++] = var88.field4088;
                int var89 = var88.field4086 << 28 | class413.field5829 + var88.field4087 << 14 | class413.field5826 + var88.field4089;
                field1993[field2001++] = var89;
                return;
            }
            if (arg0 == 5213) {
                class299 var90 = class341.method2073((byte) -126);
                if (var90 == null) {
                    field1993[field2001++] = -1;
                    field1993[field2001++] = -1;
                    return;
                }
                field1993[field2001++] = var90.field4088;
                int var91 = var90.field4086 << 28 | class413.field5829 + var90.field4087 << 14 | class413.field5826 + var90.field4089;
                field1993[field2001++] = var91;
                return;
            }
            if (arg0 == 5214) {
                int var92 = field1993[--field2001];
                class477 var93 = class133.method906(-126);
                if (var93 != null) {
                    boolean var94 = var93.method2780(var92 >> 28 & 0x3, var92 >> 14 & 0x3FFF, field2014, var92 & 0x3FFF, -78);
                    if (var94) {
                        class592.method3467(field2014[1], field2014[2], true);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field2001 -= 2;
                int var95 = field1993[field2001];
                int var96 = field1993[field2001 + 1];
                class366 var97 = class413.method2476(var95 >> 14 & 0x3FFF, var95 & 0x3FFF);
                boolean var98 = false;
                for (class477 var99 = (class477) var97.method2197(0); var99 != null; var99 = (class477) var97.method2200(-1)) {
                    if (var99.field6715 == var96) {
                        var98 = true;
                        break;
                    }
                }
                if (var98) {
                    field1993[field2001++] = 1;
                    return;
                }
                field1993[field2001++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var100 = field1993[--field2001];
                class477 var101 = class413.method2460(var100);
                if (var101 == null) {
                    field1993[field2001++] = -1;
                    return;
                }
                field1993[field2001++] = var101.field6713;
                return;
            }
            if (arg0 == 5220) {
                field1993[field2001++] = class132.field2109 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var102 = field1993[--field2001];
                class592.method3467(var102 >> 14 & 0x3FFF, var102 & 0x3FFF, true);
                return;
            }
            if (arg0 == 5222) {
                class477 var103 = class133.method906(122);
                if (var103 != null) {
                    boolean var104 = var103.method2781(class413.field5829 + class285.field3931, 383, class627.field9160 + class413.field5826, field2014);
                    if (var104) {
                        field1993[field2001++] = field2014[1];
                        field1993[field2001++] = field2014[2];
                        return;
                    }
                    field1993[field2001++] = -1;
                    field1993[field2001++] = -1;
                    return;
                }
                field1993[field2001++] = -1;
                field1993[field2001++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field2001 -= 2;
                int var105 = field1993[field2001];
                int var106 = field1993[field2001 + 1];
                class341.method2069(22355, var106 >> 14 & 0x3FFF, var106 & 0x3FFF, var105, false);
                return;
            }
            if (arg0 == 5224) {
                int var107 = field1993[--field2001];
                class477 var108 = class133.method906(-9);
                if (var108 != null) {
                    boolean var109 = var108.method2780(var107 >> 28 & 0x3, var107 >> 14 & 0x3FFF, field2014, var107 & 0x3FFF, 84);
                    if (var109) {
                        field1993[field2001++] = field2014[1];
                        field1993[field2001++] = field2014[2];
                        return;
                    }
                    field1993[field2001++] = -1;
                    field1993[field2001++] = -1;
                    return;
                }
                field1993[field2001++] = -1;
                field1993[field2001++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var110 = field1993[--field2001];
                class477 var111 = class133.method906(-127);
                if (var111 != null) {
                    boolean var112 = var111.method2781(var110 >> 14 & 0x3FFF, 383, var110 & 0x3FFF, field2014);
                    if (var112) {
                        field1993[field2001++] = field2014[1];
                        field1993[field2001++] = field2014[2];
                        return;
                    }
                    field1993[field2001++] = -1;
                    field1993[field2001++] = -1;
                    return;
                }
                field1993[field2001++] = -1;
                field1993[field2001++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class174.method1111((byte) 24, field1993[--field2001]);
                return;
            }
            if (arg0 == 5227) {
                field2001 -= 2;
                int var113 = field1993[field2001];
                int var114 = field1993[field2001 + 1];
                class341.method2069(22355, var114 >> 14 & 0x3FFF, var114 & 0x3FFF, var113, true);
                return;
            }
            if (arg0 == 5228) {
                class485.field6822 = field1993[--field2001] == 1;
                return;
            }
            if (arg0 == 5229) {
                field1993[field2001++] = class485.field6822 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var115 = field1993[--field2001];
                class261.method1704(-2627, var115);
                return;
            }
            if (arg0 == 5231) {
                field2001 -= 2;
                int var116 = field1993[field2001];
                boolean var117 = field1993[field2001 + 1] == 1;
                if (class466.field6563 != null) {
                    class176 var118 = class466.field6563.method1242(0, (long) var116);
                    if (var118 != null && !var117) {
                        var118.method1117(0);
                        return;
                    }
                    if (var118 == null && var117) {
                        class176 var119 = new class176();
                        class466.field6563.method1241(var119, (long) var116, -127);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var120 = field1993[--field2001];
                if (class466.field6563 != null) {
                    class176 var121 = class466.field6563.method1242(0, (long) var120);
                    field1993[field2001++] = var121 == null ? 0 : 1;
                    return;
                }
                field1993[field2001++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field2001 -= 2;
                int var122 = field1993[field2001];
                boolean var123 = field1993[field2001 + 1] == 1;
                if (class534.field7466 != null) {
                    class176 var124 = class534.field7466.method1242(0, (long) var122);
                    if (var124 != null && !var123) {
                        var124.method1117(0);
                        return;
                    }
                    if (var124 == null && var123) {
                        class176 var125 = new class176();
                        class534.field7466.method1241(var125, (long) var122, -107);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var126 = field1993[--field2001];
                if (class534.field7466 != null) {
                    class176 var127 = class534.field7466.method1242(0, (long) var126);
                    field1993[field2001++] = var127 == null ? 0 : 1;
                    return;
                }
                field1993[field2001++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field1993[field2001++] = class413.field5806 == null ? -1 : class413.field5806.field6715;
                return;
            }
            if (arg0 == 5236) {
                field2001 -= 2;
                int var128 = field1993[field2001];
                int var129 = field1993[field2001 + 1];
                int var130 = var129 >> 14 & 0x3FFF;
                int var131 = var129 & 0x3FFF;
                int var132 = class224.method1438(var128, 43, var131, var130);
                if (var132 < 0) {
                    field1993[field2001++] = -1;
                    return;
                }
                field1993[field2001++] = var132;
                return;
            }
            if (arg0 == 5237) {
                class567.method3224((byte) -127);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field2001 -= 2;
                int var133 = field1993[field2001];
                int var134 = field1993[field2001 + 1];
                class512.method2963(3, false, var134, -4, var133);
                field1993[field2001++] = class87.field1383 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class87.field1383 != null) {
                    class512.method2963(class491.field6875.field3359, false, -1, -4, -1);
                }
                return;
            }
            if (arg0 == 5302) {
                class368[] var135 = class505.method2922(1);
                field1993[field2001++] = var135.length;
                return;
            }
            if (arg0 == 5303) {
                int var136 = field1993[--field2001];
                class368[] var137 = class505.method2922(1);
                field1993[field2001++] = var137[var136].field5008;
                field1993[field2001++] = var137[var136].field5009;
                return;
            }
            if (arg0 == 5305) {
                int var138 = class491.field6875.field3379;
                int var139 = class491.field6875.field3355;
                int var140 = -1;
                class368[] var141 = class505.method2922(1);
                for (int var142 = 0; var142 < var141.length; var142++) {
                    class368 var143 = var141[var142];
                    if (var143.field5008 == var138 && var143.field5009 == var139) {
                        var140 = var142;
                        break;
                    }
                }
                field1993[field2001++] = var140;
                return;
            }
            if (arg0 == 5306) {
                field1993[field2001++] = class486.method2827(36);
                return;
            }
            if (arg0 == 5307) {
                int var144 = field1993[--field2001];
                if (var144 >= 1 && var144 <= 2) {
                    class512.method2963(var144, false, -1, -4, -1);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field1993[field2001++] = class491.field6875.field3359;
                return;
            }
            if (arg0 == 5309) {
                int var145 = field1993[--field2001];
                if (var145 >= 1 && var145 <= 2) {
                    class491.field6875.field3359 = var145;
                    class491.field6875.method2607((byte) -107, class500.field6968);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field2006 -= 2;
                String var146 = field2009[field2006];
                String var147 = field2009[field2006 + 1];
                int var148 = field1993[--field2001];
                field2010++;
                class351.method2108(class214.field3035, -10511);
                class479.field6754.method108((byte) -128, class452.method2655(-108, var146) + class452.method2655(-24, var147) + 1);
                class479.field6754.method74(var146, 0);
                class479.field6754.method74(var147, 0);
                class479.field6754.method108((byte) -128, var148);
                return;
            }
            if (arg0 == 5401) {
                field2001 -= 2;
                class555.field7654[field1993[field2001]] = (short) class350.method2103(field1993[field2001 + 1], (byte) -75);
                class181.field2574.method874(-94427865);
                class181.field2574.method875((byte) -115);
                class516.field7253.method3266(64);
                class40.method413(-101);
                return;
            }
            if (arg0 == 5405) {
                field2001 -= 2;
                int var149 = field1993[field2001];
                int var150 = field1993[field2001 + 1];
                if (var149 >= 0 && var149 < 2) {
                    class225.field3221[var149] = new int[var150 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field2001 -= 7;
                int var151 = field1993[field2001];
                int var152 = field1993[field2001 + 1] << 1;
                int var153 = field1993[field2001 + 2];
                int var154 = field1993[field2001 + 3];
                int var155 = field1993[field2001 + 4];
                int var156 = field1993[field2001 + 5];
                int var157 = field1993[field2001 + 6];
                if (var151 >= 0 && var151 < 2 && class225.field3221[var151] != null && var152 >= 0 && var152 < class225.field3221[var151].length) {
                    class225.field3221[var151][var152] = new int[] { (var153 >> 14 & 0x3FFF) << 7, var154, (var153 & 0x3FFF) << 7, var157 };
                    class225.field3221[var151][var152 + 1] = new int[] { (var155 >> 14 & 0x3FFF) << 7, var156, (var155 & 0x3FFF) << 7 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var158 = class225.field3221[field1993[--field2001]].length >> 1;
                field1993[field2001++] = var158;
                return;
            }
            if (arg0 == 5411) {
                if (class87.field1383 != null) {
                    class512.method2963(class491.field6875.field3359, false, -1, -4, -1);
                }
                if (class233.field3284 != null) {
                    class333.method2035(true);
                    System.exit(0);
                    return;
                }
                String var159 = class68.field1154 == null ? class386.method2261(102) : class68.field1154;
                class148.method981(class103.field1570 == 1, 2, class500.field6968, false, var159);
                return;
            }
            if (arg0 == 5419) {
                String var160 = "";
                if (class366.field4988 != null) {
                    if (class366.field4988.field5132 == null) {
                        var160 = class10.method57(class366.field4988.field5135, 6548);
                    } else {
                        var160 = (String) class366.field4988.field5132;
                    }
                }
                field2009[field2006++] = var160;
                return;
            }
            if (arg0 == 5420) {
                field1993[field2001++] = class288.field3965 == 3 ? 1 : 0;
                return;
            }
            if (arg0 == 5421) {
                if (class87.field1383 != null) {
                    class512.method2963(class491.field6875.field3359, false, -1, -4, -1);
                }
                String var161 = field2009[--field2006];
                boolean var162 = field1993[--field2001] == 1;
                String var163 = class386.method2261(110) + var161;
                class148.method981(class103.field1570 == 1, 2, class500.field6968, var162, var163);
                return;
            }
            if (arg0 == 5422) {
                field2006 -= 2;
                String var164 = field2009[field2006];
                String var165 = field2009[field2006 + 1];
                int var166 = field1993[--field2001];
                if (var164.length() > 0) {
                    if (class343.field4615 == null) {
                        class343.field4615 = new String[class192.field2726[class163.field2363.field1720]];
                    }
                    class343.field4615[var166] = var164;
                }
                if (var165.length() > 0) {
                    if (class215.field3070 == null) {
                        class215.field3070 = new String[class192.field2726[class163.field2363.field1720]];
                    }
                    class215.field3070[var166] = var165;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field2009[--field2006]);
                return;
            }
            if (arg0 == 5424) {
                field2001 -= 11;
                class451.field6369 = field1993[field2001];
                class29.field496 = field1993[field2001 + 1];
                class327.field4391 = field1993[field2001 + 2];
                class390.field5520 = field1993[field2001 + 3];
                class506.field7063 = field1993[field2001 + 4];
                class385.field5165 = field1993[field2001 + 5];
                class202.field2832 = field1993[field2001 + 6];
                class53.field991 = field1993[field2001 + 7];
                class439.field6251 = field1993[field2001 + 8];
                class325.field4374 = field1993[field2001 + 9];
                class351.field4717 = field1993[field2001 + 10];
                class645.field9371.method221(class506.field7063, (byte) -80);
                class645.field9371.method221(class385.field5165, (byte) -83);
                class645.field9371.method221(class202.field2832, (byte) 71);
                class645.field9371.method221(class53.field991, (byte) -128);
                class645.field9371.method221(class439.field6251, (byte) -116);
                class401.field5720 = null;
                class572.field7888 = null;
                class56.field1006 = null;
                class385.field5166 = null;
                class296.field4062 = null;
                class401.field5715 = null;
                class487.field6842 = null;
                class80.field1308 = null;
                class379.field5098 = true;
                return;
            }
            if (arg0 == 5425) {
                class239.method1493(-16956);
                class379.field5098 = false;
                return;
            }
            if (arg0 == 5426) {
                field2001 -= 2;
                class644.field9360 = field1993[field2001];
                class212.field2998 = field1993[field2001 + 1];
                return;
            }
            if (arg0 == 5427) {
                field2001 -= 2;
                class68.field1149 = field1993[field2001 + 1];
                return;
            }
            if (arg0 == 5428) {
                field2001 -= 2;
                int var167 = field1993[field2001];
                int var168 = field1993[field2001 + 1];
                field1993[field2001++] = class291.method1878(var168, var167, -123) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class557.method3165(0, false, field2009[--field2006], false);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class54.method508((byte) 56, class500.field6968.field3975, "accountcreated");
                    return;
                } catch (Throwable var291) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class54.method508((byte) 56, class500.field6968.field3975, "accountcreatestarted");
                    return;
                } catch (Throwable var292) {
                    return;
                }
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field2001 -= 4;
                int var169 = field1993[field2001];
                int var170 = field1993[field2001 + 1];
                int var171 = field1993[field2001 + 2];
                int var172 = field1993[field2001 + 3];
                class61.method531(var172, var171, (var169 & 0x3FFF) - class6.field80, 28405, var170, false, (var169 >> 14 & 0x3FFF) - class519.field7304);
                return;
            }
            if (arg0 == 5501) {
                field2001 -= 4;
                int var173 = field1993[field2001];
                int var174 = field1993[field2001 + 1];
                int var175 = field1993[field2001 + 2];
                int var176 = field1993[field2001 + 3];
                class440.method2614(var175, (var173 & 0x3FFF) - class6.field80, var176, (var173 >> 14 & 0x3FFF) - class519.field7304, var174, (byte) -109);
                return;
            }
            if (arg0 == 5502) {
                field2001 -= 6;
                int var177 = field1993[field2001];
                if (var177 >= 2) {
                    throw new RuntimeException();
                }
                class625.field9110 = var177;
                int var178 = field1993[field2001 + 1];
                if (var178 + 1 >= class225.field3221[class625.field9110].length >> 1) {
                    throw new RuntimeException();
                }
                class264.field3690 = var178;
                class434.field6189 = 0;
                class56.field1001 = field1993[field2001 + 2];
                class53.field994 = field1993[field2001 + 3];
                int var179 = field1993[field2001 + 4];
                if (var179 >= 2) {
                    throw new RuntimeException();
                }
                class438.field6221 = var179;
                int var180 = field1993[field2001 + 5];
                if (var180 + 1 >= class225.field3221[class438.field6221].length >> 1) {
                    throw new RuntimeException();
                }
                class88.field1386 = var180;
                class107.field1653 = 3;
                return;
            }
            if (arg0 == 5503) {
                class607.method3565(0);
                return;
            }
            if (arg0 == 5504) {
                field2001 -= 2;
                class48.method472((byte) -72, field1993[field2001], field1993[field2001 + 1], 0);
                return;
            }
            if (arg0 == 5505) {
                field1993[field2001++] = (int) class18.field224 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field1993[field2001++] = (int) class1.field13 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class210.method1380(-16);
                return;
            }
            if (arg0 == 5508) {
                class520.method3006(22783);
                return;
            }
            if (arg0 == 5509) {
                class312.method1951(0);
                return;
            }
            if (arg0 == 5510) {
                class176.method1119(56);
                return;
            }
            if (arg0 == 5511) {
                int var181 = field1993[--field2001];
                int var182 = var181 >> 14 & 0x3FFF;
                int var183 = var181 & 0x3FFF;
                int var184 = var182 - class519.field7304;
                if (var184 < 0) {
                    var184 = 0;
                } else if (var184 >= class32.field513) {
                    var184 = class32.field513;
                }
                int var185 = var183 - class6.field80;
                if (var185 < 0) {
                    var185 = 0;
                } else if (var185 >= class611.field8786) {
                    var185 = class611.field8786;
                }
                class592.field8507 = (var184 << 7) + 64;
                class312.field4212 = (var185 << 7) + 64;
                class107.field1653 = 4;
                return;
            }
            if (arg0 == 5512) {
                class77.method591(2048);
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field2006 -= 2;
                String var186 = field2009[field2006];
                String var187 = field2009[field2006 + 1];
                int var188 = field1993[--field2001];
                if (class440.field6254 != 2) {
                    return;
                }
                if (class348.field4669 == 0 && class10.field109 == 0) {
                    class146.field2257 = var186;
                    class636.field9276 = var187;
                    class320.field4337 = var188;
                    class45.method440(5, 87);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class20.method202(true);
                return;
            }
            if (arg0 == 5602) {
                if (class348.field4669 == 0) {
                    class189.field2677 = -2;
                    class645.field9369 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field2001 -= 4;
                if (class440.field6254 != 2) {
                    return;
                }
                if (class348.field4669 == 0 && class10.field109 == 0) {
                    class597.method3527(field1993[field2001 + 3], field1993[field2001], field1993[field2001 + 2], field1993[field2001 + 1], -66);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field2006--;
                if (class440.field6254 != 2) {
                    return;
                }
                if (class348.field4669 == 0 && class10.field109 == 0) {
                    class401.method2398(63, class639.method3697((byte) 80, field2009[field2006]));
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field2006 -= 2;
                if (class440.field6254 != 2) {
                    return;
                }
                if (class348.field4669 == 0 && class10.field109 == 0) {
                    class618.method3602(606, class639.method3697((byte) 80, field2009[field2006]), false, field2009[field2006 + 1]);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class10.field109 == 0) {
                    class111.field1721 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field1993[field2001++] = class645.field9369;
                return;
            }
            if (arg0 == 5608) {
                field1993[field2001++] = class304.field4150;
                return;
            }
            if (arg0 == 5609) {
                field1993[field2001++] = class111.field1721;
                return;
            }
            if (arg0 == 5610) {
                for (int var189 = 0; var189 < 5; var189++) {
                    field2009[field2006++] = class447.field6349.length > var189 ? class529.method3037((byte) 106, class447.field6349[var189]) : "";
                }
                class447.field6349 = null;
                return;
            }
            if (arg0 == 5611) {
                field1993[field2001++] = class228.field3260;
                return;
            }
            if (arg0 == 5612) {
                int var190 = field1993[--field2001];
                if (class440.field6254 != 6) {
                    return;
                }
                if (class348.field4669 == 0 && class10.field109 == 0) {
                    if (class143.field2203 != null) {
                        class143.field2203.method1004(34065);
                        class143.field2203 = null;
                    }
                    class320.field4337 = var190;
                    class45.method440(8, 47);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field1993[field2001++] = class645.field9369;
                return;
            }
            if (arg0 == 5615) {
                field2006 -= 2;
                String var191 = field2009[field2006];
                String var192 = field2009[field2006 + 1];
                if (class440.field6254 != 2) {
                    return;
                }
                if (class348.field4669 == 0 && class10.field109 == 0) {
                    if (class143.field2203 != null) {
                        class143.field2203.method1004(34065);
                        class143.field2203 = null;
                    }
                    class146.field2257 = var191;
                    class636.field9276 = var192;
                    class45.method440(4, -69);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class368.method2208(false, false);
                return;
            }
            if (arg0 == 5617) {
                field1993[field2001++] = class189.field2677;
                return;
            }
            if (arg0 == 5618) {
                int var193 = field1993[--field2001];
                class297.method1896((byte) 80, false, var193);
                return;
            }
            if (arg0 == 5619) {
                int var194 = field1993[--field2001];
                class297.method1896((byte) 97, true, var194);
                return;
            }
            if (arg0 == 5620) {
                class645.method3717(-113);
                if (class394.field5558 != "" && class394.field5558 != "") {
                    field1993[field2001++] = 1;
                    return;
                }
                field1993[field2001++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field2006 -= 2;
                if (class440.field6254 != 2) {
                    return;
                }
                if (class348.field4669 == 0 && class10.field109 == 0) {
                    class618.method3602(606, class639.method3697((byte) 80, field2009[field2006]), true, field2009[field2006 + 1]);
                    return;
                }
                return;
            }
            if (arg0 == 5622) {
                class382 var195 = class500.field6968.method1840("3", false, (byte) 102);
                while (var195.field5134 == 0) {
                    class21.method220(0, 1L);
                }
                if (var195.field5134 == 2) {
                    throw new RuntimeException("Error opening file");
                }
                class116 var196 = (class116) var195.field5132;
                if (var196.method820(-1).exists()) {
                    class11 var197 = new class11(50);
                    try {
                        var196.method818(50, (byte) -112, var197.field138, 0);
                    } catch (IOException var294) {
                    }
                }
                try {
                    var196.method821(17981);
                    return;
                } catch (Exception var293) {
                    return;
                }
            }
            if (arg0 == 5623) {
                if (class68.field1153 != null) {
                    field1993[field2001++] = 1;
                    return;
                }
                field1993[field2001++] = 0;
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var198 = field1993[--field2001];
                if (var198 < 1) {
                    var198 = 1;
                }
                if (var198 > 4) {
                    var198 = 4;
                }
                class491.field6875.field3350 = var198;
                class173.method1093(3);
                class491.field6875.method2607((byte) -117, class500.field6968);
                class293.field4032 = false;
                return;
            }
            if (arg0 == 6002) {
                class491.field6875.method2596(field1993[--field2001] == 1, -100);
                class173.method1093(3);
                class78.method602((byte) 118);
                class491.field6875.method2607((byte) -118, class500.field6968);
                class293.field4032 = false;
                return;
            }
            if (arg0 == 6003) {
                class491.field6875.field3345 = field1993[--field2001] == 1;
                class78.method602((byte) 65);
                class491.field6875.method2607((byte) -80, class500.field6968);
                class293.field4032 = false;
                return;
            }
            if (arg0 == 6005) {
                class491.field6875.field3367 = field1993[--field2001] == 1;
                class173.method1093(3);
                class491.field6875.method2607((byte) -65, class500.field6968);
                class293.field4032 = false;
                return;
            }
            if (arg0 == 6006) {
                class491.field6875.field3375 = field1993[--field2001] == 1;
                class69.field1165.method1364(!class491.field6875.field3375);
                class491.field6875.method2607((byte) -121, class500.field6968);
                class293.field4032 = false;
                return;
            }
            if (arg0 == 6007) {
                class491.field6875.field3348 = field1993[--field2001];
                class491.field6875.method2607((byte) -84, class500.field6968);
                class293.field4032 = false;
                return;
            }
            if (arg0 == 6008) {
                class491.field6875.field3358 = field1993[--field2001] == 1;
                class491.field6875.method2607((byte) -113, class500.field6968);
                class293.field4032 = false;
                return;
            }
            if (arg0 == 6009) {
                class491.field6875.field3376 = field1993[--field2001] == 1;
                class173.method1093(3);
                class491.field6875.method2607((byte) -73, class500.field6968);
                class293.field4032 = false;
                return;
            }
            if (arg0 == 6010) {
                class491.field6875.field3365 = field1993[--field2001] == 1;
                class491.field6875.method2607((byte) -72, class500.field6968);
                class293.field4032 = false;
                return;
            }
            if (arg0 == 6011) {
                int var199 = field1993[--field2001];
                if (var199 < 0 || var199 > 2) {
                    var199 = 0;
                }
                class491.field6875.method1506(-69, class103.field1570, var199);
                class173.method1093(3);
                class491.field6875.method2607((byte) -86, class500.field6968);
                class293.field4032 = false;
                return;
            }
            if (arg0 == 6012) {
                class491.field6875.method1508(field1993[--field2001] == 1, class103.field1570, -73);
                class510.method2946((byte) -123);
                class465.method2718(-8274);
                class491.field6875.method2607((byte) -111, class500.field6968);
                class293.field4032 = false;
                return;
            }
            if (arg0 == 6014) {
                class491.field6875.field3357 = field1993[--field2001] == 1;
                class173.method1093(3);
                class491.field6875.method2607((byte) -73, class500.field6968);
                class293.field4032 = false;
                return;
            }
            if (arg0 == 6015) {
                class491.field6875.field3346 = field1993[--field2001] == 1;
                class173.method1093(3);
                class491.field6875.method2607((byte) -76, class500.field6968);
                class293.field4032 = false;
                return;
            }
            if (arg0 == 6016) {
                int var200 = field1993[--field2001];
                if (var200 < 0 || var200 > 2) {
                    var200 = 0;
                }
                class491.field6875.field3360 = var200;
                class452.method2658(7, class103.field1570);
                class491.field6875.method2607((byte) -92, class500.field6968);
                return;
            }
            if (arg0 == 6017) {
                class491.field6875.field3364 = field1993[--field2001] == 1;
                class633.method3680(false);
                class491.field6875.method2607((byte) -99, class500.field6968);
                class293.field4032 = false;
                return;
            }
            if (arg0 == 6018) {
                int var201 = field1993[--field2001];
                if (var201 < 0) {
                    var201 = 0;
                }
                if (var201 > 127) {
                    var201 = 127;
                }
                class491.field6875.field3372 = var201;
                class491.field6875.method2607((byte) -69, class500.field6968);
                class293.field4032 = false;
                return;
            }
            if (arg0 == 6019) {
                int var202 = field1993[--field2001];
                if (var202 < 0) {
                    var202 = 0;
                }
                if (var202 > 255) {
                    var202 = 255;
                }
                if (class491.field6875.field3362 != var202) {
                    if (class491.field6875.field3362 == 0 && class531.field7446 != -1) {
                        class360.method2160(class531.field7446, var202, class236.field3305, 15325, 0, false);
                        class144.field2229 = false;
                    } else if (var202 == 0) {
                        class491.method2848(-26978);
                        class144.field2229 = false;
                    } else {
                        class211.method1385((byte) 14, var202);
                    }
                    class491.field6875.field3362 = var202;
                }
                class491.field6875.method2607((byte) -69, class500.field6968);
                class293.field4032 = false;
                return;
            }
            if (arg0 == 6020) {
                int var203 = field1993[--field2001];
                if (var203 < 0) {
                    var203 = 0;
                }
                if (var203 > 127) {
                    var203 = 127;
                }
                class491.field6875.field3354 = var203;
                class491.field6875.method2607((byte) -69, class500.field6968);
                class293.field4032 = false;
                return;
            }
            if (arg0 == 6021) {
                class491.field6875.field6261 = field1993[--field2001] == 1;
                class78.method602((byte) 86);
                return;
            }
            if (arg0 == 6023) {
                int var204 = field1993[--field2001];
                boolean var205 = false;
                if (var204 < 0) {
                    var204 = 0;
                }
                if (var204 > 2) {
                    var204 = 2;
                }
                if (class366.field4987 < 96) {
                    var204 = 0;
                    var205 = true;
                }
                class424.method2529(var204, false);
                class491.field6875.method2607((byte) -74, class500.field6968);
                class293.field4032 = false;
                field1993[field2001++] = var205 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var206 = field1993[--field2001];
                if (var206 < 0 || var206 > 2) {
                    var206 = 0;
                }
                class491.field6875.field3366 = var206;
                class491.field6875.method2607((byte) -122, class500.field6968);
                return;
            }
            if (arg0 == 6025) {
                int var207 = field1993[--field2001];
                if (var207 < 0 || var207 > class562.method3205(class366.field4987, (byte) 123)) {
                    var207 = 0;
                }
                class491.field6875.field3378 = var207;
                class491.field6875.method2607((byte) -122, class500.field6968);
                class293.field4032 = false;
                return;
            }
            if (arg0 == 6027) {
                int var208 = field1993[--field2001];
                if (var208 < 0 || var208 > 1) {
                    var208 = 0;
                }
                class263.method1718(0, var208 == 1);
                return;
            }
            if (arg0 == 6028) {
                class491.field6875.field3344 = field1993[--field2001] != 0;
                class491.field6875.method2607((byte) -99, class500.field6968);
                return;
            }
            if (arg0 == 6029) {
                class491.field6875.field3348 = field1993[--field2001];
                class491.field6875.method2607((byte) -77, class500.field6968);
                return;
            }
            if (arg0 == 6030) {
                class491.field6875.field3374 = field1993[--field2001] != 0;
                class491.field6875.method2607((byte) -83, class500.field6968);
                class173.method1093(3);
                return;
            }
            if (arg0 == 6031) {
                int var209 = field1993[--field2001];
                if (var209 < 0 || var209 > 5) {
                    var209 = 2;
                }
                class452.method2658(7, var209);
                return;
            }
            if (arg0 == 6032) {
                int var210 = field1993[--field2001];
                if (var210 < 0 || var210 > 5) {
                    var210 = 2;
                }
                class491.field6875.field3368 = var210;
                class491.field6875.method2607((byte) -101, class500.field6968);
                class293.field4032 = false;
                return;
            }
            if (arg0 == 6033) {
                int var211 = field1993[--field2001];
                if (var211 < 0 || var211 > 4) {
                    var211 = 2;
                }
                class491.field6875.field3373 = var211;
                class491.field6875.method2607((byte) -66, class500.field6968);
                return;
            }
            if (arg0 == 6034) {
                class491.field6875.field3361 = field1993[--field2001] == 1;
                class491.field6875.method2607((byte) -93, class500.field6968);
                class510.method2946((byte) -122);
                class293.field4032 = false;
                return;
            }
            if (arg0 == 6035) {
                class491.field6875.field6263 = field1993[--field2001] == 1;
                class173.method1093(3);
                class78.method602((byte) 79);
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field1993[field2001++] = class491.field6875.field3350;
                return;
            }
            if (arg0 == 6102) {
                field1993[field2001++] = class491.field6875.method2610(class103.field1570, 0) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field1993[field2001++] = class491.field6875.field3345 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field1993[field2001++] = class491.field6875.field3367 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field1993[field2001++] = class491.field6875.field3375 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field1993[field2001++] = class491.field6875.field3348;
                return;
            }
            if (arg0 == 6108) {
                field1993[field2001++] = class491.field6875.field3358 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field1993[field2001++] = class491.field6875.field3376 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field1993[field2001++] = class491.field6875.field3365 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field1993[field2001++] = class491.field6875.method1507(class103.field1570, (byte) 32);
                return;
            }
            if (arg0 == 6112) {
                field1993[field2001++] = class491.field6875.method1502(class103.field1570, 1) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field1993[field2001++] = class491.field6875.field3357 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field1993[field2001++] = class491.field6875.field3346 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field1993[field2001++] = class491.field6875.field3360;
                return;
            }
            if (arg0 == 6117) {
                field1993[field2001++] = class491.field6875.field3364 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field1993[field2001++] = class491.field6875.field3372;
                return;
            }
            if (arg0 == 6119) {
                field1993[field2001++] = class491.field6875.field3362;
                return;
            }
            if (arg0 == 6120) {
                field1993[field2001++] = class491.field6875.field3354;
                return;
            }
            if (arg0 == 6121) {
                field1993[field2001++] = class69.field1165.method1323() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field1993[field2001++] = class633.method3677((byte) -74);
                return;
            }
            if (arg0 == 6124) {
                field1993[field2001++] = class491.field6875.field3366;
                return;
            }
            if (arg0 == 6125) {
                field1993[field2001++] = class491.field6875.field3378;
                return;
            }
            if (arg0 == 6126) {
                field1993[field2001++] = class69.field1165.method1319() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field1993[field2001++] = class491.field6875.field3351 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field1993[field2001++] = class491.field6875.field3344 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field1993[field2001++] = class491.field6875.field3348;
                return;
            }
            if (arg0 == 6130) {
                field1993[field2001++] = class491.field6875.field3374 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field1993[field2001++] = class103.field1570;
                return;
            }
            if (arg0 == 6132) {
                field1993[field2001++] = class491.field6875.field3368;
                return;
            }
            if (arg0 == 6133) {
                field1993[field2001++] = class288.field3965 == 1 || class288.field3965 == 4 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field1993[field2001++] = class562.method3205(class366.field4987, (byte) 123);
                return;
            }
            if (arg0 == 6135) {
                field1993[field2001++] = class491.field6875.field3373;
                return;
            }
            if (arg0 == 6136) {
                field1993[field2001++] = class491.field6875.field3361 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var212 = true;
                try {
                    var212 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var295) {
                }
                field1993[field2001++] = var212 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field2001 -= 2;
                class547.field7576 = (short) field1993[field2001];
                if (class547.field7576 <= 0) {
                    class547.field7576 = 256;
                }
                class610.field8778 = (short) field1993[field2001 + 1];
                if (class610.field8778 <= 0) {
                    class610.field8778 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field2001 -= 2;
                class510.field7134 = (short) field1993[field2001];
                if (class510.field7134 <= 0) {
                    class510.field7134 = 256;
                }
                class187.field2626 = (short) field1993[field2001 + 1];
                if (class187.field2626 <= 0) {
                    class187.field2626 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field2001 -= 4;
                class494.field6917 = (short) field1993[field2001];
                if (class494.field6917 <= 0) {
                    class494.field6917 = 1;
                }
                class187.field2623 = (short) field1993[field2001 + 1];
                if (class187.field2623 <= 0) {
                    class187.field2623 = 32767;
                } else if (class187.field2623 < class494.field6917) {
                    class187.field2623 = class494.field6917;
                }
                class206.field2904 = (short) field1993[field2001 + 2];
                if (class206.field2904 <= 0) {
                    class206.field2904 = 1;
                }
                class387.field5195 = (short) field1993[field2001 + 3];
                if (class387.field5195 <= 0) {
                    class387.field5195 = 32767;
                    return;
                }
                if (class387.field5195 < class206.field2904) {
                    class387.field5195 = class206.field2904;
                }
                return;
            }
            if (arg0 == 6203) {
                class380.method2250(0, class253.field3513.field1853, true, class253.field3513.field1769, 0, false);
                field1993[field2001++] = class318.field4315;
                field1993[field2001++] = class426.field6056;
                return;
            }
            if (arg0 == 6204) {
                field1993[field2001++] = class510.field7134;
                field1993[field2001++] = class187.field2626;
                return;
            }
            if (arg0 == 6205) {
                field1993[field2001++] = class547.field7576;
                field1993[field2001++] = class610.field8778;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field1993[field2001++] = (int) (class488.method2835(30160) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field1993[field2001++] = (int) (class488.method2835(30160) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field2001 -= 3;
                int var213 = field1993[field2001];
                int var214 = field1993[field2001 + 1];
                int var215 = field1993[field2001 + 2];
                field2011.clear();
                field2011.set(11, 12);
                field2011.set(var215, var214, var213);
                int var216 = (int) (field2011.getTime().getTime() / 86400000L) - 11745;
                if (var215 < 1970) {
                    var216--;
                }
                field1993[field2001++] = var216;
                return;
            }
            if (arg0 == 6303) {
                field2011.clear();
                field2011.setTime(new Date(class488.method2835(30160)));
                field1993[field2001++] = field2011.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var217 = field1993[--field2001];
                boolean var218 = true;
                if (var217 < 0) {
                    var218 = (var217 + 1) % 4 == 0;
                } else if (var217 < 1582) {
                    var218 = var217 % 4 == 0;
                } else if (var217 % 4 != 0) {
                    var218 = false;
                } else if (var217 % 100 != 0) {
                    var218 = true;
                } else if (var217 % 400 != 0) {
                    var218 = false;
                }
                field1993[field2001++] = var218 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field1993[field2001++] = class80.method612(74) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field1993[field2001++] = class153.method999((byte) -32) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class440.field6254 == 6 && class348.field4669 == 0 && class10.field109 == 0) {
                    if (class313.field4218) {
                        field1993[field2001++] = 0;
                        return;
                    }
                    if (class476.field6711 > class488.method2835(30160) - 1000L) {
                        field1993[field2001++] = 1;
                        return;
                    }
                    class313.field4218 = true;
                    class351.method2108(class349.field4694, -10511);
                    class479.field6754.method117(126, class203.field2850);
                    field1993[field2001++] = 0;
                    return;
                }
                field1993[field2001++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class212 var219 = class110.method774((byte) 121);
                if (var219 != null) {
                    field1993[field2001++] = var219.field2994;
                    field1993[field2001++] = var219.field4366;
                    field2009[field2006++] = var219.field2992;
                    class329 var220 = var219.method1387(-17730);
                    field1993[field2001++] = var220.field4403;
                    field2009[field2006++] = var220.field4401;
                    field1993[field2001++] = var219.field4363;
                    field1993[field2001++] = var219.field2996;
                    field2009[field2006++] = var219.field2995;
                    return;
                }
                field1993[field2001++] = -1;
                field1993[field2001++] = 0;
                field2009[field2006++] = "";
                field1993[field2001++] = 0;
                field2009[field2006++] = "";
                field1993[field2001++] = 0;
                field1993[field2001++] = 0;
                field2009[field2006++] = "";
                return;
            }
            if (arg0 == 6502) {
                class212 var221 = class405.method2416((byte) -102);
                if (var221 != null) {
                    field1993[field2001++] = var221.field2994;
                    field1993[field2001++] = var221.field4366;
                    field2009[field2006++] = var221.field2992;
                    class329 var222 = var221.method1387(-17730);
                    field1993[field2001++] = var222.field4403;
                    field2009[field2006++] = var222.field4401;
                    field1993[field2001++] = var221.field4363;
                    field1993[field2001++] = var221.field2996;
                    field2009[field2006++] = var221.field2995;
                    return;
                }
                field1993[field2001++] = -1;
                field1993[field2001++] = 0;
                field2009[field2006++] = "";
                field1993[field2001++] = 0;
                field2009[field2006++] = "";
                field1993[field2001++] = 0;
                field1993[field2001++] = 0;
                field2009[field2006++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var223 = field1993[--field2001];
                String var224 = field2009[--field2006];
                if (class440.field6254 == 6 && class348.field4669 == 0 && class10.field109 == 0) {
                    field1993[field2001++] = class483.method2807(18205, var223, var224) ? 1 : 0;
                    return;
                }
                field1993[field2001++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class491.field6875.field3382 = field1993[--field2001];
                class491.field6875.method2607((byte) -95, class500.field6968);
                return;
            }
            if (arg0 == 6505) {
                field1993[field2001++] = class491.field6875.field3382;
                return;
            }
            if (arg0 == 6506) {
                int var225 = field1993[--field2001];
                class212 var226 = class521.method3007(var225, (byte) -71);
                if (var226 != null) {
                    field1993[field2001++] = var226.field4366;
                    field2009[field2006++] = var226.field2992;
                    class329 var227 = var226.method1387(-17730);
                    field1993[field2001++] = var227.field4403;
                    field2009[field2006++] = var227.field4401;
                    field1993[field2001++] = var226.field4363;
                    field1993[field2001++] = var226.field2996;
                    field2009[field2006++] = var226.field2995;
                    return;
                }
                field1993[field2001++] = -1;
                field2009[field2006++] = "";
                field1993[field2001++] = 0;
                field2009[field2006++] = "";
                field1993[field2001++] = 0;
                field1993[field2001++] = 0;
                field2009[field2006++] = "";
                return;
            }
            if (arg0 == 6507) {
                field2001 -= 4;
                int var228 = field1993[field2001];
                boolean var229 = field1993[field2001 + 1] == 1;
                int var230 = field1993[field2001 + 2];
                boolean var231 = field1993[field2001 + 3] == 1;
                class26.method294(var231, var228, true, var229, var230);
                return;
            }
            if (arg0 == 6508) {
                class629.method3661(0);
                return;
            }
            if (arg0 == 6509) {
                if (class440.field6254 != 6) {
                    return;
                }
                class606.field8738 = field1993[--field2001] == 1;
                return;
            }
            if (arg0 == 6510) {
                field1993[field2001++] = class224.field3218;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class491.field6875.field3369 = field1993[--field2001] == 1;
                class491.field6875.method2607((byte) -97, class500.field6968);
                return;
            }
            if (arg0 == 6601) {
                field1993[field2001++] = class491.field6875.field3369 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class269.field3760 == class173.field2494) {
            if (arg0 == 6700) {
                int var232 = class211.field2971.method1250(0);
                if (class56.field1005 != -1) {
                    var232++;
                }
                field1993[field2001++] = var232;
                return;
            }
            if (arg0 == 6701) {
                int var233 = field1993[--field2001];
                if (class56.field1005 != -1) {
                    if (var233 == 0) {
                        field1993[field2001++] = class56.field1005;
                        return;
                    }
                    var233--;
                }
                class128 var234 = (class128) class211.field2971.method1248(-1);
                while (var233-- > 0) {
                    var234 = (class128) class211.field2971.method1245((byte) 95);
                }
                field1993[field2001++] = var234.field2065;
                return;
            }
            if (arg0 == 6702) {
                int var235 = field1993[--field2001];
                if (class618.field8850[var235] == null) {
                    field2009[field2006++] = "";
                    return;
                }
                String var236 = class618.field8850[var235][0].field1899;
                if (var236 == null) {
                    field2009[field2006++] = "";
                    return;
                }
                field2009[field2006++] = var236.substring(0, var236.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var237 = field1993[--field2001];
                if (class618.field8850[var237] == null) {
                    field1993[field2001++] = 0;
                    return;
                }
                field1993[field2001++] = class618.field8850[var237].length;
                return;
            }
            if (arg0 == 6704) {
                field2001 -= 2;
                int var238 = field1993[field2001];
                int var239 = field1993[field2001 + 1];
                if (class618.field8850[var238] == null) {
                    field2009[field2006++] = "";
                    return;
                }
                String var240 = class618.field8850[var238][var239].field1899;
                if (var240 == null) {
                    field2009[field2006++] = "";
                    return;
                }
                field2009[field2006++] = var240;
                return;
            }
            if (arg0 == 6705) {
                field2001 -= 2;
                int var241 = field1993[field2001];
                int var242 = field1993[field2001 + 1];
                if (class618.field8850[var241] == null) {
                    field1993[field2001++] = 0;
                    return;
                }
                field1993[field2001++] = class618.field8850[var241][var242].field1835;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field2001 -= 3;
                int var243 = field1993[field2001];
                int var244 = field1993[field2001 + 1];
                int var245 = field1993[field2001 + 2];
                class229.method1458(var245, "", var243 << 16 | var244, 1, false);
                return;
            }
            if (arg0 == 6708) {
                field2001 -= 3;
                int var246 = field1993[field2001];
                int var247 = field1993[field2001 + 1];
                int var248 = field1993[field2001 + 2];
                class229.method1458(var248, "", var246 << 16 | var247, 2, false);
                return;
            }
            if (arg0 == 6709) {
                field2001 -= 3;
                int var249 = field1993[field2001];
                int var250 = field1993[field2001 + 1];
                int var251 = field1993[field2001 + 2];
                class229.method1458(var251, "", var249 << 16 | var250, 3, false);
                return;
            }
            if (arg0 == 6710) {
                field2001 -= 3;
                int var252 = field1993[field2001];
                int var253 = field1993[field2001 + 1];
                int var254 = field1993[field2001 + 2];
                class229.method1458(var254, "", var252 << 16 | var253, 4, false);
                return;
            }
            if (arg0 == 6711) {
                field2001 -= 3;
                int var255 = field1993[field2001];
                int var256 = field1993[field2001 + 1];
                int var257 = field1993[field2001 + 2];
                class229.method1458(var257, "", var255 << 16 | var256, 5, false);
                return;
            }
            if (arg0 == 6712) {
                field2001 -= 3;
                int var258 = field1993[field2001];
                int var259 = field1993[field2001 + 1];
                int var260 = field1993[field2001 + 2];
                class229.method1458(var260, "", var258 << 16 | var259, 6, false);
                return;
            }
            if (arg0 == 6713) {
                field2001 -= 3;
                int var261 = field1993[field2001];
                int var262 = field1993[field2001 + 1];
                int var263 = field1993[field2001 + 2];
                class229.method1458(var263, "", var261 << 16 | var262, 7, false);
                return;
            }
            if (arg0 == 6714) {
                field2001 -= 3;
                int var264 = field1993[field2001];
                int var265 = field1993[field2001 + 1];
                int var266 = field1993[field2001 + 2];
                class229.method1458(var266, "", var264 << 16 | var265, 8, false);
                return;
            }
            if (arg0 == 6715) {
                field2001 -= 3;
                int var267 = field1993[field2001];
                int var268 = field1993[field2001 + 1];
                int var269 = field1993[field2001 + 2];
                class229.method1458(var269, "", var267 << 16 | var268, 9, false);
                return;
            }
            if (arg0 == 6716) {
                field2001 -= 3;
                int var270 = field1993[field2001];
                int var271 = field1993[field2001 + 1];
                int var272 = field1993[field2001 + 2];
                class229.method1458(var272, "", var270 << 16 | var271, 10, false);
                return;
            }
            if (arg0 == 6717) {
                field2001 -= 3;
                int var273 = field1993[field2001];
                int var274 = field1993[field2001 + 1];
                int var275 = field1993[field2001 + 2];
                class114 var276 = class512.method2969(var273 << 16 | var274, var275, (byte) 95);
                class339.method2057((byte) -46);
                class500 var277 = client.method1534(var276);
                class412.method2454(var276, var277.field6969, var277.method2897((byte) 123), -2);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var278 = field1993[--field2001];
                class463 var279 = class163.field2366.method2136(-113, var278);
                if (var279.field6531 == null) {
                    field2009[field2006++] = "";
                    return;
                }
                field2009[field2006++] = var279.field6531;
                return;
            }
            if (arg0 == 6801) {
                int var280 = field1993[--field2001];
                class463 var281 = class163.field2366.method2136(-96, var280);
                field1993[field2001++] = var281.field6512;
                return;
            }
            if (arg0 == 6802) {
                int var282 = field1993[--field2001];
                class463 var283 = class163.field2366.method2136(-106, var282);
                field1993[field2001++] = var283.field6538;
                return;
            }
            if (arg0 == 6803) {
                int var284 = field1993[--field2001];
                class463 var285 = class163.field2366.method2136(-116, var284);
                field1993[field2001++] = var285.field6499;
                return;
            }
            if (arg0 == 6804) {
                field2001 -= 2;
                int var286 = field1993[field2001];
                int var287 = field1993[field2001 + 1];
                class22 var288 = class533.field7455.method3115(128, var287);
                if (var288.method256(false)) {
                    field2009[field2006++] = class163.field2366.method2136(-102, var286).method2704(var288.field322, var287, 2);
                    return;
                }
                field1993[field2001++] = class163.field2366.method2136(-88, var286).method2705((byte) -61, var287, var288.field323);
                return;
            }
        } else if (arg0 < 7000) {
            if (arg0 == 6900) {
                field1993[field2001++] = class480.field6767 && !class600.field8654 ? 1 : 0;
                return;
            }
            if (arg0 == 6901) {
                field1993[field2001++] = class148.field2277;
                return;
            }
            if (arg0 == 6902) {
                field1993[field2001++] = class375.field5051;
                return;
            }
            if (arg0 == 6903) {
                field1993[field2001++] = class257.field3557;
                return;
            }
            if (arg0 == 6904) {
                field1993[field2001++] = class363.field4870;
                return;
            }
            if (arg0 == 6905) {
                String var289 = "";
                if (class366.field4988 != null) {
                    if (class366.field4988.field5132 == null) {
                        var289 = class10.method57(class366.field4988.field5135, 6548);
                    } else {
                        var289 = (String) class366.field4988.field5132;
                    }
                }
                field2009[field2006++] = var289;
                return;
            }
            if (arg0 == 6906) {
                field1993[field2001++] = class21.field315;
                return;
            }
            if (arg0 == 6907) {
                field1993[field2001++] = class397.field5665;
                return;
            }
            if (arg0 == 6908) {
                field1993[field2001++] = class261.field3630;
                return;
            }
            if (arg0 == 6909) {
                field1993[field2001++] = class418.field5881 ? 1 : 0;
                return;
            }
            if (arg0 == 6910) {
                field1993[field2001++] = class580.field7981;
                return;
            }
        } else if (arg0 < 7100) {
            if (arg0 == 7000) {
                int var290 = class491.field6875.method2609(-1);
                field1993[field2001++] = class491.field6875.field6275 = class103.field1570;
                field1993[field2001++] = var290;
                class173.method1093(3);
                return;
            }
            if (arg0 == 7001) {
                class491.field6875.method2602(0);
                class173.method1093(3);
                return;
            }
            if (arg0 == 7002) {
                class491.field6875.method2604(1);
                class173.method1093(3);
                return;
            }
            if (arg0 == 7003) {
                class491.field6875.method2605(2);
                class173.method1093(3);
                return;
            }
            if (arg0 == 7004) {
                class491.field6875.method2611((byte) -98);
                class173.method1093(3);
                return;
            }
            if (arg0 == 7005) {
                class491.field6875.field3356 = 0;
                return;
            }
            if (arg0 == 7006) {
                if (class491.field6875.field6275 == 2) {
                    class491.field6875.field6273 = true;
                    return;
                }
                if (class491.field6875.field6275 == 1) {
                    class491.field6875.field6257 = true;
                    return;
                }
                if (class491.field6875.field6275 == 3) {
                    class491.field6875.field6277 = true;
                }
                return;
            }
            if (arg0 == 7007) {
                field1993[field2001++] = class491.field6875.field3356;
                return;
            }
            if (arg0 == 7008) {
                if (class103.field1570 == 0 && class366.field4987 < 96) {
                    field1993[field2001++] = 2;
                    return;
                }
                field1993[field2001++] = 4;
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lfca;II)V")
    public static final void method854(class74 arg0, int arg1, int arg2) {
        class560 var3 = class217.method1405(arg1, (byte) 54, arg0, arg2);
        if (var3 == null) {
            return;
        }
        field2008 = new int[var3.field7759];
        field2000 = new String[var3.field7753];
        if (class272.field3778 == var3.field7750 || class470.field6608 == var3.field7750 || class80.field1302 == var3.field7750) {
            int var4 = 0;
            int var5 = 0;
            if (class319.field4326 != null) {
                var4 = class319.field4326.field1767;
                var5 = class319.field4326.field1814;
            }
            field2008[0] = class602.field8697.method2153((byte) 77) - var4;
            field2008[1] = class602.field8697.method2152(0) - var5;
        }
        method855(var3, 200000);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lfh;I)V")
    private static final void method855(class560 arg0, int arg1) {
        field2001 = 0;
        field2006 = 0;
        int var2 = -1;
        int[] var3 = arg0.field7764;
        int[] var4 = arg0.field7754;
        byte var5 = -1;
        field2002 = 0;
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
                        method861(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method853(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field1993[field2001++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field1993[field2001++] = class189.field2681.field6447[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class189.field2681.method2682(var8, field1993[--field2001], 0);
                } else if (var43 == 3) {
                    field2009[field2006++] = arg0.field7755[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field2001 -= 2;
                    if (field1993[field2001 + 1] != field1993[field2001]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field2001 -= 2;
                    if (field1993[field2001 + 1] == field1993[field2001]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field2001 -= 2;
                    if (field1993[field2001] < field1993[field2001 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field2001 -= 2;
                    if (field1993[field2001] > field1993[field2001 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field2002 == 0) {
                        return;
                    }
                    class186 var9 = field1994[--field2002];
                    arg0 = var9.field2607;
                    var3 = arg0.field7764;
                    var4 = arg0.field7754;
                    var2 = var9.field2609;
                    field2008 = var9.field2611;
                    field2000 = var9.field2605;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field1993[field2001++] = class189.field2681.method577(true, var10);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class189.field2681.method2680(field1993[--field2001], var11, 128);
                } else if (var43 == 31) {
                    field2001 -= 2;
                    if (field1993[field2001] <= field1993[field2001 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field2001 -= 2;
                    if (field1993[field2001] >= field1993[field2001 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field1993[field2001++] = field2008[var4[var2]];
                } else if (var43 == 34) {
                    field2008[var4[var2]] = field1993[--field2001];
                } else if (var43 == 35) {
                    field2009[field2006++] = field2000[var4[var2]];
                } else if (var43 == 36) {
                    field2000[var4[var2]] = field2009[--field2006];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field2006 -= var12;
                    String var13 = class119.method837(field2009, var12, 1, field2006);
                    field2009[field2006++] = var13;
                } else if (var43 == 38) {
                    field2001--;
                } else if (var43 == 39) {
                    field2006--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class560 var15 = class218.method1411(true, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field7759];
                    String[] var17 = new String[var15.field7753];
                    for (int var18 = 0; var18 < var15.field7752; var18++) {
                        var16[var18] = field1993[field2001 + var18 - var15.field7752];
                    }
                    for (int var19 = 0; var19 < var15.field7751; var19++) {
                        var17[var19] = field2009[field2006 + var19 - var15.field7751];
                    }
                    field2001 -= var15.field7752;
                    field2006 -= var15.field7751;
                    class186 var20 = new class186();
                    var20.field2607 = arg0;
                    var20.field2609 = var2;
                    var20.field2611 = field2008;
                    var20.field2605 = field2000;
                    if (field2002 >= field1994.length) {
                        throw new RuntimeException();
                    }
                    field1994[field2002++] = var20;
                    arg0 = var15;
                    var3 = var15.field7764;
                    var4 = var15.field7754;
                    var2 = -1;
                    field2008 = var16;
                    field2000 = var17;
                } else if (var43 == 42) {
                    field1993[field2001++] = class77.field1259[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class77.field1259[var21] = field1993[--field2001];
                    class352.method2111((byte) -87, var21);
                    class173.field2495 |= class552.field7627[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field1993[--field2001];
                    if (var24 >= 0 && var24 <= 5000) {
                        field1991[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field1996[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field1993[--field2001];
                    if (var28 < 0 || var28 >= field1991[var27]) {
                        throw new RuntimeException();
                    }
                    field1993[field2001++] = field1996[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field2001 -= 2;
                    int var30 = field1993[field2001];
                    if (var30 < 0 || var30 >= field1991[var29]) {
                        throw new RuntimeException();
                    }
                    field1996[var29][var30] = field1993[field2001 + 1];
                } else if (var43 == 47) {
                    String var31 = class344.field4633[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field2009[field2006++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class344.field4633[var32] = field2009[--field2006];
                    class400.method2395(var32, true);
                } else if (var43 == 51) {
                    class205 var33 = arg0.field7762[var4[var2]];
                    class10 var34 = (class10) var33.method1242(0, (long) field1993[--field2001]);
                    if (var34 != null) {
                        var2 += var34.field106;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field7760 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field2524).append(" ");
                for (int var41 = field2002 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field1994[var41].field2607.field2524).append(" ");
                }
                var40.append("op: ").append(var5);
                class235.method1474(var42, var40.toString(), (byte) 115);
            } else {
                class176.method1116("Clientscript error in: " + arg0.field7760, true);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field7760).append("\n");
                for (int var38 = field2002 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field1994[var38].field2607.field7760).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class235.method1474(var42, var37.toString(), (byte) 115);
                class77.method597(-1986155574, var37.toString());
            }
        }
    }

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(I)V")
    private static final void method856(int arg0) {
        class114 var1 = class612.method3584(arg0, 0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class114[] var3 = class75.field1198[var2];
        if (var3 == null) {
            class114[] var4 = class618.field8850[var2];
            int var5 = var4.length;
            var3 = class75.field1198[var2] = new class114[var5];
            class416.method2497(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class416.method2497(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(IZ)V")
    public static final void method857(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "()V")
    public static void method858() {
        field2008 = null;
        field2000 = null;
        field1991 = null;
        field1996 = null;
        field1993 = null;
        field2009 = null;
        field1994 = null;
        field1998 = null;
        field1989 = null;
        field1987 = null;
        field2011 = null;
        field2012 = null;
        field2014 = null;
        field2013 = null;
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "()V")
    public static final void method859() {
    }

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "(I)V")
    private static final void method860(int arg0) {
        class114 var1 = class612.method3584(arg0, 0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class114[] var3 = class75.field1198[var2];
        if (var3 == null) {
            class114[] var4 = class618.field8850[var2];
            int var5 = var4.length;
            var3 = class75.field1198[var2] = new class114[var5];
            class416.method2497(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class416.method2497(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(IZ)V")
    private static final void method861(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field2001 -= 3;
                int var2 = field1993[field2001];
                int var3 = field1993[field2001 + 1];
                int var4 = field1993[field2001 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class114 var5 = class612.method3584(var2, 0);
                if (var5.field1886 == null) {
                    var5.field1886 = new class114[var4 + 1];
                }
                if (var5.field1886.length <= var4) {
                    class114[] var6 = new class114[var4 + 1];
                    for (int var7 = 0; var7 < var5.field1886.length; var7++) {
                        var6[var7] = var5.field1886[var7];
                    }
                    var5.field1886 = var6;
                }
                if (var4 > 0 && var5.field1886[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class114 var8 = new class114();
                var8.field1880 = var3;
                var8.field1897 = var8.field1810 = var5.field1810;
                var8.field1749 = var4;
                var5.field1886[var4] = var8;
                if (arg1) {
                    field1989 = var8;
                } else {
                    field1998 = var8;
                }
                class403.method2407(var5, -9130);
                return;
            }
            if (arg0 == 101) {
                class114 var9 = arg1 ? field1989 : field1998;
                if (var9.field1749 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class114 var10 = class612.method3584(var9.field1810, 0);
                var10.field1886[var9.field1749] = null;
                class403.method2407(var10, -9130);
                return;
            }
            if (arg0 == 102) {
                class114 var11 = class612.method3584(field1993[--field2001], 0);
                var11.field1886 = null;
                class403.method2407(var11, -9130);
                return;
            }
            if (arg0 == 200) {
                field2001 -= 2;
                int var12 = field1993[field2001];
                int var13 = field1993[field2001 + 1];
                class114 var14 = class512.method2969(var12, var13, (byte) 107);
                if (var14 != null && var13 != -1) {
                    field1993[field2001++] = 1;
                    if (arg1) {
                        field1989 = var14;
                        return;
                    }
                    field1998 = var14;
                    return;
                }
                field1993[field2001++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field1993[--field2001];
                class114 var16 = class612.method3584(var15, 0);
                if (var16 != null) {
                    field1993[field2001++] = 1;
                    if (arg1) {
                        field1989 = var16;
                        return;
                    }
                    field1998 = var16;
                    return;
                }
                field1993[field2001++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field1993[--field2001];
                method860(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field1993[--field2001];
                method856(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field2001 -= 2;
                int var19 = field1993[field2001];
                int var20 = field1993[field2001 + 1];
                for (int var21 = 0; var21 < class139.field2177.length; var21++) {
                    if (class139.field2177[var21] == var19) {
                        class645.field9372.field2651.method718(var21, (byte) -13, class412.field5801, var20);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class69.field1169.length; var22++) {
                    if (class69.field1169[var22] == var19) {
                        class645.field9372.field2651.method718(var22, (byte) -13, class412.field5801, var20);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field2001 -= 2;
                int var23 = field1993[field2001];
                int var24 = field1993[field2001 + 1];
                class645.field9372.field2651.method723(1073741823, var23, var24);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field1993[--field2001] != 0;
                class645.field9372.field2651.method721(var25, 16873);
                return;
            }
        } else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
            class114 var26;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var26 = class612.method3584(field1993[--field2001], 0);
            } else {
                var26 = arg1 ? field1989 : field1998;
            }
            if (arg0 == 1000) {
                field2001 -= 4;
                var26.field1798 = field1993[field2001];
                var26.field1845 = field1993[field2001 + 1];
                int var27 = field1993[field2001 + 2];
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 5) {
                    var27 = 5;
                }
                int var28 = field1993[field2001 + 3];
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 5) {
                    var28 = 5;
                }
                var26.field1765 = (byte) var27;
                var26.field1813 = (byte) var28;
                class403.method2407(var26, -9130);
                class626.method3655(var26, (byte) 104);
                if (var26.field1749 == -1) {
                    class80.method614(var26.field1810, 19);
                }
                return;
            }
            if (arg0 == 1001) {
                field2001 -= 4;
                var26.field1840 = field1993[field2001];
                var26.field1805 = field1993[field2001 + 1];
                var26.field1779 = 0;
                var26.field1776 = 0;
                int var29 = field1993[field2001 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 4) {
                    var29 = 4;
                }
                int var30 = field1993[field2001 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 4) {
                    var30 = 4;
                }
                var26.field1783 = (byte) var29;
                var26.field1895 = (byte) var30;
                class403.method2407(var26, -9130);
                class626.method3655(var26, (byte) 112);
                if (var26.field1880 == 0) {
                    class274.method1772((byte) -122, var26, false);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var31 = field1993[--field2001] == 1;
                if (var26.field1825 != var31) {
                    var26.field1825 = var31;
                    class403.method2407(var26, -9130);
                }
                if (var26.field1749 == -1) {
                    class379.method2239(-112, var26.field1810);
                }
                return;
            }
            if (arg0 == 1004) {
                field2001 -= 2;
                var26.field1873 = field1993[field2001];
                var26.field1896 = field1993[field2001 + 1];
                class403.method2407(var26, -9130);
                class626.method3655(var26, (byte) 20);
                if (var26.field1880 == 0) {
                    class274.method1772((byte) -122, var26, false);
                }
                return;
            }
            if (arg0 == 1005) {
                var26.field1842 = field1993[--field2001] == 1;
                return;
            }
        } else if (!(arg0 < 1100 || arg0 >= 1200) || !(arg0 < 2100 || arg0 >= 2200)) {
            class114 var32;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var32 = class612.method3584(field1993[--field2001], 0);
            } else {
                var32 = arg1 ? field1989 : field1998;
            }
            if (arg0 == 1100) {
                field2001 -= 2;
                var32.field1800 = field1993[field2001];
                if (var32.field1800 > var32.field1846 - var32.field1853) {
                    var32.field1800 = var32.field1846 - var32.field1853;
                }
                if (var32.field1800 < 0) {
                    var32.field1800 = 0;
                }
                var32.field1904 = field1993[field2001 + 1];
                if (var32.field1904 > var32.field1802 - var32.field1769) {
                    var32.field1904 = var32.field1802 - var32.field1769;
                }
                if (var32.field1904 < 0) {
                    var32.field1904 = 0;
                }
                class403.method2407(var32, -9130);
                if (var32.field1749 == -1) {
                    class638.method3695(var32.field1810, true);
                }
                return;
            }
            if (arg0 == 1101) {
                var32.field1757 = field1993[--field2001];
                class403.method2407(var32, -9130);
                if (var32.field1749 == -1) {
                    class21.method246(var32.field1810, 108);
                }
                return;
            }
            if (arg0 == 1102) {
                var32.field1766 = field1993[--field2001] == 1;
                class403.method2407(var32, -9130);
                return;
            }
            if (arg0 == 1103) {
                var32.field1913 = field1993[--field2001];
                class403.method2407(var32, -9130);
                return;
            }
            if (arg0 == 1104) {
                var32.field1782 = field1993[--field2001];
                class403.method2407(var32, -9130);
                return;
            }
            if (arg0 == 1105) {
                int var33 = field1993[--field2001];
                if (var32.field1903 != var33) {
                    var32.field1903 = var33;
                    class403.method2407(var32, -9130);
                }
                if (var32.field1749 == -1) {
                    class336.method2042((byte) 6, var32.field1810);
                }
                return;
            }
            if (arg0 == 1106) {
                var32.field1912 = field1993[--field2001];
                class403.method2407(var32, -9130);
                return;
            }
            if (arg0 == 1107) {
                var32.field1760 = field1993[--field2001] == 1;
                class403.method2407(var32, -9130);
                return;
            }
            if (arg0 == 1108) {
                var32.field1780 = 1;
                var32.field1820 = field1993[--field2001];
                class403.method2407(var32, -9130);
                if (var32.field1749 == -1) {
                    class139.method929(-118, var32.field1810);
                }
                return;
            }
            if (arg0 == 1109) {
                field2001 -= 6;
                var32.field1841 = field1993[field2001];
                var32.field1786 = field1993[field2001 + 1];
                var32.field1823 = field1993[field2001 + 2];
                var32.field1797 = field1993[field2001 + 3];
                var32.field1876 = field1993[field2001 + 4];
                var32.field1890 = field1993[field2001 + 5];
                class403.method2407(var32, -9130);
                if (var32.field1749 == -1) {
                    class108.method763(var32.field1810, (byte) -97);
                    class392.method2355(10, var32.field1810);
                }
                return;
            }
            if (arg0 == 1110) {
                int var34 = field1993[--field2001];
                if (var32.field1754 != var34) {
                    var32.field1754 = var34;
                    var32.field1804 = 0;
                    var32.field1891 = 1;
                    var32.field1838 = 0;
                    class403.method2407(var32, -9130);
                }
                if (var32.field1749 == -1) {
                    class509.method2940((byte) -26, var32.field1810);
                }
                return;
            }
            if (arg0 == 1111) {
                var32.field1863 = field1993[--field2001] == 1;
                class403.method2407(var32, -9130);
                return;
            }
            if (arg0 == 1112) {
                String var35 = field2009[--field2006];
                if (!var35.equals(var32.field1898)) {
                    var32.field1898 = var35;
                    class403.method2407(var32, -9130);
                }
                if (var32.field1749 == -1) {
                    class264.method1736(var32.field1810, (byte) -66);
                }
                return;
            }
            if (arg0 == 1113) {
                var32.field1910 = field1993[--field2001];
                class403.method2407(var32, -9130);
                if (var32.field1749 == -1) {
                    class207.method1351(var32.field1810, 16);
                }
                return;
            }
            if (arg0 == 1114) {
                field2001 -= 3;
                var32.field1874 = field1993[field2001];
                var32.field1877 = field1993[field2001 + 1];
                var32.field1832 = field1993[field2001 + 2];
                class403.method2407(var32, -9130);
                return;
            }
            if (arg0 == 1115) {
                var32.field1862 = field1993[--field2001] == 1;
                class403.method2407(var32, -9130);
                return;
            }
            if (arg0 == 1116) {
                var32.field1785 = field1993[--field2001];
                class403.method2407(var32, -9130);
                return;
            }
            if (arg0 == 1117) {
                var32.field1807 = field1993[--field2001];
                class403.method2407(var32, -9130);
                return;
            }
            if (arg0 == 1118) {
                var32.field1822 = field1993[--field2001] == 1;
                class403.method2407(var32, -9130);
                return;
            }
            if (arg0 == 1119) {
                var32.field1854 = field1993[--field2001] == 1;
                class403.method2407(var32, -9130);
                return;
            }
            if (arg0 == 1120) {
                field2001 -= 2;
                var32.field1846 = field1993[field2001];
                var32.field1802 = field1993[field2001 + 1];
                class403.method2407(var32, -9130);
                if (var32.field1880 == 0) {
                    class274.method1772((byte) -122, var32, false);
                }
                return;
            }
            if (arg0 == 1121) {
                field2001 -= 2;
                var32.field1902 = (short) field1993[field2001];
                var32.field1751 = (short) field1993[field2001 + 1];
                class403.method2407(var32, -9130);
                return;
            }
            if (arg0 == 1122) {
                var32.field1799 = field1993[--field2001] == 1;
                class403.method2407(var32, -9130);
                return;
            }
            if (arg0 == 1123) {
                var32.field1890 = field1993[--field2001];
                class403.method2407(var32, -9130);
                if (var32.field1749 == -1) {
                    class108.method763(var32.field1810, (byte) 102);
                }
                return;
            }
            if (arg0 == 1124) {
                int var36 = field1993[--field2001];
                var32.field1794 = var36 == 1;
                class403.method2407(var32, -9130);
                return;
            }
            if (arg0 == 1125) {
                field2001 -= 2;
                var32.field1892 = field1993[field2001];
                var32.field1905 = field1993[field2001 + 1];
                class403.method2407(var32, -9130);
                return;
            }
            if (arg0 == 1126) {
                var32.field1793 = field1993[--field2001];
                class403.method2407(var32, -9130);
                return;
            }
            if (arg0 == 1127) {
                field2001 -= 2;
                int var37 = field1993[field2001];
                int var38 = field1993[field2001 + 1];
                class22 var39 = class533.field7455.method3115(128, var37);
                if (var39.field323 != var38) {
                    var32.method809(var37, var38, (byte) -82);
                    return;
                }
                var32.method801(0, var37);
                return;
            }
            if (arg0 == 1128) {
                int var40 = field1993[--field2001];
                String var41 = field2009[--field2006];
                class22 var42 = class533.field7455.method3115(128, var40);
                if (!var42.field322.equals(var41)) {
                    var32.method807(12589, var41, var40);
                    return;
                }
                var32.method801(0, var40);
                return;
            }
        } else if (!(arg0 < 1200 || arg0 >= 1300) || !(arg0 < 2200 || arg0 >= 2300)) {
            class114 var43;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var43 = class612.method3584(field1993[--field2001], 0);
            } else {
                var43 = arg1 ? field1989 : field1998;
            }
            class403.method2407(var43, -9130);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field2001 -= 2;
                int var44 = field1993[field2001];
                int var45 = field1993[field2001 + 1];
                if (var43.field1749 == -1) {
                    class585.method3433(var43.field1810, false);
                    class108.method763(var43.field1810, (byte) 79);
                    class392.method2355(10, var43.field1810);
                }
                if (var44 == -1) {
                    var43.field1780 = 1;
                    var43.field1820 = -1;
                    var43.field1787 = -1;
                    return;
                }
                var43.field1787 = var44;
                var43.field1867 = var45;
                if (arg0 == 1208 || arg0 == 1209) {
                    var43.field1809 = true;
                } else {
                    var43.field1809 = false;
                }
                class621 var46 = class181.field2574.method866(var44, (byte) 79);
                var43.field1823 = var46.field8952;
                var43.field1797 = var46.field8889;
                var43.field1876 = var46.field8961;
                var43.field1841 = var46.field8962;
                var43.field1786 = var46.field8943;
                var43.field1890 = var46.field8925;
                if (arg0 == 1205 || arg0 == 1209) {
                    var43.field1861 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var43.field1861 = 1;
                } else {
                    var43.field1861 = 2;
                }
                if (var43.field1779 > 0) {
                    var43.field1890 = var43.field1890 * 32 / var43.field1779;
                    return;
                }
                if (var43.field1840 > 0) {
                    var43.field1890 = var43.field1890 * 32 / var43.field1840;
                }
                return;
            }
            if (arg0 == 1201) {
                var43.field1780 = 2;
                var43.field1820 = field1993[--field2001];
                if (var43.field1749 == -1) {
                    class139.method929(-119, var43.field1810);
                }
                return;
            }
            if (arg0 == 1202) {
                var43.field1780 = 3;
                var43.field1820 = -1;
                if (var43.field1749 == -1) {
                    class139.method929(-122, var43.field1810);
                }
                return;
            }
            if (arg0 == 1203) {
                var43.field1780 = 6;
                var43.field1820 = field1993[--field2001];
                if (var43.field1749 == -1) {
                    class139.method929(-117, var43.field1810);
                }
                return;
            }
            if (arg0 == 1204) {
                var43.field1780 = 5;
                var43.field1820 = field1993[--field2001];
                if (var43.field1749 == -1) {
                    class139.method929(-119, var43.field1810);
                }
                return;
            }
            if (arg0 == 1206) {
                field2001 -= 4;
                var43.field1828 = field1993[field2001];
                var43.field1815 = field1993[field2001 + 1];
                var43.field1839 = field1993[field2001 + 2];
                var43.field1856 = field1993[field2001 + 3];
                class403.method2407(var43, -9130);
                return;
            }
            if (arg0 == 1207) {
                field2001 -= 2;
                var43.field1831 = field1993[field2001];
                var43.field1848 = field1993[field2001 + 1];
                class403.method2407(var43, -9130);
                return;
            }
            if (arg0 == 1210) {
                field2001 -= 4;
                var43.field1820 = field1993[field2001];
                var43.field1859 = field1993[field2001 + 1];
                if (field1993[field2001 + 2] == 1) {
                    var43.field1780 = 9;
                } else {
                    var43.field1780 = 8;
                }
                if (field1993[field2001 + 3] == 1) {
                    var43.field1809 = true;
                } else {
                    var43.field1809 = false;
                }
                if (var43.field1749 == -1) {
                    class139.method929(-116, var43.field1810);
                }
                return;
            }
            if (arg0 == 1211) {
                var43.field1780 = 5;
                var43.field1820 = class97.field1472;
                var43.field1859 = 0;
                if (var43.field1749 == -1) {
                    class139.method929(-118, var43.field1810);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class114 var58;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var58 = class612.method3584(field1993[--field2001], 0);
                } else {
                    var58 = arg1 ? field1989 : field1998;
                }
                String var59 = field2009[--field2006];
                int[] var60 = null;
                if (var59.length() > 0 && var59.charAt(var59.length() - 1) == 'Y') {
                    int var61 = field1993[--field2001];
                    if (var61 > 0) {
                        var60 = new int[var61];
                        while (var61-- > 0) {
                            var60[var61] = field1993[--field2001];
                        }
                    }
                    var59 = var59.substring(0, var59.length() - 1);
                }
                Object[] var62 = new Object[var59.length() + 1];
                for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                    if (var59.charAt(var63 - 1) == 's') {
                        var62[var63] = field2009[--field2006];
                    } else {
                        var62[var63] = Integer.valueOf(field1993[--field2001]);
                    }
                }
                int var64 = field1993[--field2001];
                if (var64 == -1) {
                    var62 = null;
                } else {
                    var62[0] = Integer.valueOf(var64);
                }
                if (arg0 == 1400) {
                    var58.field1818 = var62;
                } else if (arg0 == 1401) {
                    var58.field1851 = var62;
                } else if (arg0 == 1402) {
                    var58.field1784 = var62;
                } else if (arg0 == 1403) {
                    var58.field1752 = var62;
                } else if (arg0 == 1404) {
                    var58.field1843 = var62;
                } else if (arg0 == 1405) {
                    var58.field1770 = var62;
                } else if (arg0 == 1406) {
                    var58.field1908 = var62;
                } else if (arg0 == 1407) {
                    var58.field1852 = var62;
                    var58.field1875 = var60;
                } else if (arg0 == 1408) {
                    var58.field1755 = var62;
                } else if (arg0 == 1409) {
                    var58.field1821 = var62;
                } else if (arg0 == 1410) {
                    var58.field1808 = var62;
                } else if (arg0 == 1411) {
                    var58.field1865 = var62;
                } else if (arg0 == 1412) {
                    var58.field1781 = var62;
                } else if (arg0 == 1414) {
                    var58.field1836 = var62;
                    var58.field1855 = var60;
                } else if (arg0 == 1415) {
                    var58.field1889 = var62;
                    var58.field1763 = var60;
                } else if (arg0 == 1416) {
                    var58.field1844 = var62;
                } else if (arg0 == 1417) {
                    var58.field1907 = var62;
                } else if (arg0 == 1418) {
                    var58.field1870 = var62;
                } else if (arg0 == 1419) {
                    var58.field1790 = var62;
                } else if (arg0 == 1420) {
                    var58.field1864 = var62;
                } else if (arg0 == 1421) {
                    var58.field1860 = var62;
                } else if (arg0 == 1422) {
                    var58.field1762 = var62;
                } else if (arg0 == 1423) {
                    var58.field1827 = var62;
                } else if (arg0 == 1424) {
                    var58.field1911 = var62;
                } else if (arg0 == 1425) {
                    var58.field1849 = var62;
                } else if (arg0 == 1426) {
                    var58.field1819 = var62;
                } else if (arg0 == 1427) {
                    var58.field1830 = var62;
                } else if (arg0 == 1428) {
                    var58.field1758 = var62;
                    var58.field1777 = var60;
                } else if (arg0 == 1429) {
                    var58.field1884 = var62;
                    var58.field1791 = var60;
                } else if (arg0 == 1430) {
                    var58.field1869 = var62;
                }
                var58.field1900 = true;
                return;
            }
            if (arg0 < 1600) {
                class114 var65 = arg1 ? field1989 : field1998;
                if (arg0 == 1500) {
                    field1993[field2001++] = var65.field1767;
                    return;
                }
                if (arg0 == 1501) {
                    field1993[field2001++] = var65.field1814;
                    return;
                }
                if (arg0 == 1502) {
                    field1993[field2001++] = var65.field1853;
                    return;
                }
                if (arg0 == 1503) {
                    field1993[field2001++] = var65.field1769;
                    return;
                }
                if (arg0 == 1504) {
                    field1993[field2001++] = var65.field1825 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field1993[field2001++] = var65.field1897;
                    return;
                }
                if (arg0 == 1506) {
                    class114 var66 = class104.method741((byte) -128, var65);
                    field1993[field2001++] = var66 == null ? -1 : var66.field1810;
                    return;
                }
            } else if (arg0 < 1700) {
                class114 var67 = arg1 ? field1989 : field1998;
                if (arg0 == 1600) {
                    field1993[field2001++] = var67.field1800;
                    return;
                }
                if (arg0 == 1601) {
                    field1993[field2001++] = var67.field1904;
                    return;
                }
                if (arg0 == 1602) {
                    field2009[field2006++] = var67.field1898;
                    return;
                }
                if (arg0 == 1603) {
                    field1993[field2001++] = var67.field1846;
                    return;
                }
                if (arg0 == 1604) {
                    field1993[field2001++] = var67.field1802;
                    return;
                }
                if (arg0 == 1605) {
                    field1993[field2001++] = var67.field1890;
                    return;
                }
                if (arg0 == 1606) {
                    field1993[field2001++] = var67.field1823;
                    return;
                }
                if (arg0 == 1607) {
                    field1993[field2001++] = var67.field1876;
                    return;
                }
                if (arg0 == 1608) {
                    field1993[field2001++] = var67.field1797;
                    return;
                }
                if (arg0 == 1609) {
                    field1993[field2001++] = var67.field1913;
                    return;
                }
                if (arg0 == 1610) {
                    field1993[field2001++] = var67.field1841;
                    return;
                }
                if (arg0 == 1611) {
                    field1993[field2001++] = var67.field1786;
                    return;
                }
                if (arg0 == 1612) {
                    field1993[field2001++] = var67.field1903;
                    return;
                }
                if (arg0 == 1613) {
                    int var68 = field1993[--field2001];
                    class22 var69 = class533.field7455.method3115(128, var68);
                    if (var69.method256(false)) {
                        field2009[field2006++] = var67.method800(var68, var69.field322, -5530);
                        return;
                    }
                    field1993[field2001++] = var67.method815(var68, (byte) 126, var69.field323);
                    return;
                }
            } else if (arg0 < 1800) {
                class114 var70 = arg1 ? field1989 : field1998;
                if (arg0 == 1700) {
                    field1993[field2001++] = var70.field1787;
                    return;
                }
                if (arg0 == 1701) {
                    if (var70.field1787 != -1) {
                        field1993[field2001++] = var70.field1867;
                        return;
                    }
                    field1993[field2001++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field1993[field2001++] = var70.field1749;
                    return;
                }
            } else if (arg0 < 1900) {
                class114 var71 = arg1 ? field1989 : field1998;
                if (arg0 == 1800) {
                    field1993[field2001++] = client.method1534(var71).method2897((byte) 122);
                    return;
                }
                if (arg0 == 1801) {
                    int var72 = field1993[--field2001];
                    int var334 = var72 - 1;
                    if (var71.field1795 != null && var334 < var71.field1795.length && var71.field1795[var334] != null) {
                        field2009[field2006++] = var71.field1795[var334];
                        return;
                    }
                    field2009[field2006++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var71.field1824 == null) {
                        field2009[field2006++] = "";
                        return;
                    }
                    field2009[field2006++] = var71.field1824;
                    return;
                }
            } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
                class114 var332;
                if (arg0 >= 2000) {
                    var332 = class612.method3584(field1993[--field2001], 0);
                    arg0 -= 1000;
                } else {
                    var332 = arg1 ? field1989 : field1998;
                }
                if (field2015 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var332.field1830 == null) {
                        return;
                    }
                    class224 var333 = new class224();
                    var333.field3210 = var332;
                    var333.field3207 = var332.field1830;
                    var333.field3198 = field2015 + 1;
                    class596.field8616.method463(var333, -115);
                    return;
                }
            } else if (arg0 < 2600) {
                class114 var73 = class612.method3584(field1993[--field2001], 0);
                if (arg0 == 2500) {
                    field1993[field2001++] = var73.field1767;
                    return;
                }
                if (arg0 == 2501) {
                    field1993[field2001++] = var73.field1814;
                    return;
                }
                if (arg0 == 2502) {
                    field1993[field2001++] = var73.field1853;
                    return;
                }
                if (arg0 == 2503) {
                    field1993[field2001++] = var73.field1769;
                    return;
                }
                if (arg0 == 2504) {
                    field1993[field2001++] = var73.field1825 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field1993[field2001++] = var73.field1897;
                    return;
                }
                if (arg0 == 1506) {
                    class114 var74 = class104.method741((byte) -128, var73);
                    field1993[field2001++] = var74 == null ? -1 : var74.field1810;
                    return;
                }
            } else if (arg0 < 2700) {
                class114 var75 = class612.method3584(field1993[--field2001], 0);
                if (arg0 == 2600) {
                    field1993[field2001++] = var75.field1800;
                    return;
                }
                if (arg0 == 2601) {
                    field1993[field2001++] = var75.field1904;
                    return;
                }
                if (arg0 == 2602) {
                    field2009[field2006++] = var75.field1898;
                    return;
                }
                if (arg0 == 2603) {
                    field1993[field2001++] = var75.field1846;
                    return;
                }
                if (arg0 == 2604) {
                    field1993[field2001++] = var75.field1802;
                    return;
                }
                if (arg0 == 2605) {
                    field1993[field2001++] = var75.field1890;
                    return;
                }
                if (arg0 == 2606) {
                    field1993[field2001++] = var75.field1823;
                    return;
                }
                if (arg0 == 2607) {
                    field1993[field2001++] = var75.field1876;
                    return;
                }
                if (arg0 == 2608) {
                    field1993[field2001++] = var75.field1797;
                    return;
                }
                if (arg0 == 2609) {
                    field1993[field2001++] = var75.field1913;
                    return;
                }
                if (arg0 == 2610) {
                    field1993[field2001++] = var75.field1841;
                    return;
                }
                if (arg0 == 2611) {
                    field1993[field2001++] = var75.field1786;
                    return;
                }
                if (arg0 == 2612) {
                    field1993[field2001++] = var75.field1903;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class114 var76 = class612.method3584(field1993[--field2001], 0);
                    field1993[field2001++] = var76.field1787;
                    return;
                }
                if (arg0 == 2701) {
                    class114 var77 = class612.method3584(field1993[--field2001], 0);
                    if (var77.field1787 != -1) {
                        field1993[field2001++] = var77.field1867;
                        return;
                    }
                    field1993[field2001++] = 0;
                    return;
                }
                if (arg0 == 2702) {
                    int var78 = field1993[--field2001];
                    class128 var79 = (class128) class211.field2971.method1242(0, (long) var78);
                    if (var79 != null) {
                        field1993[field2001++] = 1;
                        return;
                    }
                    field1993[field2001++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class114 var80 = class612.method3584(field1993[--field2001], 0);
                    if (var80.field1886 == null) {
                        field1993[field2001++] = 0;
                        return;
                    }
                    int var81 = var80.field1886.length;
                    for (int var82 = 0; var82 < var80.field1886.length; var82++) {
                        if (var80.field1886[var82] == null) {
                            var81 = var82;
                            break;
                        }
                    }
                    field1993[field2001++] = var81;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field2001 -= 2;
                    int var83 = field1993[field2001];
                    int var84 = field1993[field2001 + 1];
                    class128 var85 = (class128) class211.field2971.method1242(0, (long) var83);
                    if (var85 != null && var85.field2065 == var84) {
                        field1993[field2001++] = 1;
                        return;
                    }
                    field1993[field2001++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class114 var86 = class612.method3584(field1993[--field2001], 0);
                if (arg0 == 2800) {
                    field1993[field2001++] = client.method1534(var86).method2897((byte) 117);
                    return;
                }
                if (arg0 == 2801) {
                    int var87 = field1993[--field2001];
                    int var335 = var87 - 1;
                    if (var86.field1795 != null && var335 < var86.field1795.length && var86.field1795[var335] != null) {
                        field2009[field2006++] = var86.field1795[var335];
                        return;
                    }
                    field2009[field2006++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var86.field1824 == null) {
                        field2009[field2006++] = "";
                        return;
                    }
                    field2009[field2006++] = var86.field1824;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var88 = field2009[--field2006];
                    class176.method1116(var88, true);
                    return;
                }
                if (arg0 == 3101) {
                    field2001 -= 2;
                    class564.method3217(class645.field9372, (byte) -23, field1993[field2001 + 1], field1993[field2001]);
                    return;
                }
                if (arg0 == 3103) {
                    class133.method904(0, true);
                    return;
                }
                if (arg0 == 3104) {
                    String var89 = field2009[--field2006];
                    int var90 = 0;
                    if (class510.method2945(var89, (byte) 110)) {
                        var90 = class547.method3122(var89, 117);
                    }
                    field1997++;
                    class351.method2108(class80.field1306, -10511);
                    class479.field6754.method117(120, var90);
                    return;
                }
                if (arg0 == 3105) {
                    String var91 = field2009[--field2006];
                    field2005++;
                    class351.method2108(class400.field5695, -10511);
                    class479.field6754.method108((byte) -128, var91.length() + 1);
                    class479.field6754.method74(var91, 0);
                    return;
                }
                if (arg0 == 3106) {
                    String var92 = field2009[--field2006];
                    field1995++;
                    class351.method2108(class162.field2360, -10511);
                    class479.field6754.method108((byte) -128, var92.length() + 1);
                    class479.field6754.method74(var92, 0);
                    return;
                }
                if (arg0 == 3107) {
                    int var93 = field1993[--field2001];
                    String var94 = field2009[--field2006];
                    class117.method824(var94, (byte) 75, var93);
                    return;
                }
                if (arg0 == 3108) {
                    field2001 -= 3;
                    int var95 = field1993[field2001];
                    int var96 = field1993[field2001 + 1];
                    int var97 = field1993[field2001 + 2];
                    class114 var98 = class612.method3584(var97, 0);
                    class385.method2258(var96, var95, 0, var98);
                    return;
                }
                if (arg0 == 3109) {
                    field2001 -= 2;
                    int var99 = field1993[field2001];
                    int var100 = field1993[field2001 + 1];
                    class114 var101 = arg1 ? field1989 : field1998;
                    class385.method2258(var100, var99, 0, var101);
                    return;
                }
                if (arg0 == 3110) {
                    int var102 = field1993[--field2001];
                    field1992++;
                    class351.method2108(class15.field206, -10511);
                    class479.field6754.method84(var102, (byte) -100);
                    return;
                }
                if (arg0 == 3111) {
                    field2001 -= 2;
                    int var103 = field1993[field2001];
                    int var104 = field1993[field2001 + 1];
                    class128 var105 = (class128) class211.field2971.method1242(0, (long) var103);
                    if (var105 != null) {
                        class299.method1902(var105.field2065 != var104, var105, (byte) 78, true);
                    }
                    class506.method2931(var104, -16962, var103, 3, true);
                    return;
                }
                if (arg0 == 3112) {
                    field2001--;
                    int var106 = field1993[field2001];
                    class128 var107 = (class128) class211.field2971.method1242(0, (long) var106);
                    if (var107 != null && var107.field2063 == 3) {
                        class299.method1902(true, var107, (byte) 78, true);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class467.method2723((byte) 114, field2009[--field2006]);
                    return;
                }
                if (arg0 == 3114) {
                    field2001 -= 2;
                    int var108 = field1993[field2001];
                    int var109 = field1993[field2001 + 1];
                    String var110 = field2009[--field2006];
                    class56.method513("", (byte) 126, var108, var109, "", var110);
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field2001 -= 3;
                    class487.method2832(field1993[field2001 + 1], 0, field1993[field2001 + 2], field1993[field2001], 255);
                    return;
                }
                if (arg0 == 3201) {
                    class80.method622(50, 255, field1993[--field2001], (byte) 76);
                    return;
                }
                if (arg0 == 3202) {
                    field2001 -= 2;
                    class80.method611(field1993[field2001], 121, 255, field1993[field2001 + 1]);
                    return;
                }
                if (arg0 == 3203) {
                    field2001 -= 4;
                    class487.method2832(field1993[field2001 + 1], 0, field1993[field2001 + 2], field1993[field2001], field1993[field2001 + 3]);
                    return;
                }
                if (arg0 == 3204) {
                    field2001 -= 3;
                    class80.method622(field1993[field2001 + 2], field1993[field2001 + 1], field1993[field2001], (byte) 78);
                    return;
                }
                if (arg0 == 3205) {
                    field2001 -= 3;
                    class80.method611(field1993[field2001], 70, field1993[field2001 + 2], field1993[field2001 + 1]);
                    return;
                }
                if (arg0 == 3206) {
                    field2001 -= 4;
                    class425.method2532(field1993[field2001 + 2], field1993[field2001], field1993[field2001 + 3], 0, field1993[field2001 + 1]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field1993[field2001++] = class405.field5763;
                    return;
                }
                if (arg0 == 3301) {
                    field2001 -= 2;
                    int var111 = field1993[field2001];
                    int var112 = field1993[field2001 + 1];
                    field1993[field2001++] = class346.method2089(false, var112, var111, (byte) -116);
                    return;
                }
                if (arg0 == 3302) {
                    field2001 -= 2;
                    int var113 = field1993[field2001];
                    int var114 = field1993[field2001 + 1];
                    field1993[field2001++] = class536.method3081(false, var114, var113, -123);
                    return;
                }
                if (arg0 == 3303) {
                    field2001 -= 2;
                    int var115 = field1993[field2001];
                    int var116 = field1993[field2001 + 1];
                    field1993[field2001++] = class296.method1889(0, false, var115, var116);
                    return;
                }
                if (arg0 == 3304) {
                    int var117 = field1993[--field2001];
                    field1993[field2001++] = class154.field2312.method3522(var117, (byte) 14).field4399;
                    return;
                }
                if (arg0 == 3305) {
                    int var118 = field1993[--field2001];
                    field1993[field2001++] = class297.field4077[var118];
                    return;
                }
                if (arg0 == 3306) {
                    int var119 = field1993[--field2001];
                    field1993[field2001++] = class278.field3854[var119];
                    return;
                }
                if (arg0 == 3307) {
                    int var120 = field1993[--field2001];
                    field1993[field2001++] = class98.field1506[var120];
                    return;
                }
                if (arg0 == 3308) {
                    byte var121 = class645.field9372.field6035;
                    int var122 = (class645.field9372.field6037 >> 7) + class519.field7304;
                    int var123 = (class645.field9372.field6029 >> 7) + class6.field80;
                    field1993[field2001++] = (var121 << 28) + (var122 << 14) + var123;
                    return;
                }
                if (arg0 == 3309) {
                    int var124 = field1993[--field2001];
                    field1993[field2001++] = var124 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var125 = field1993[--field2001];
                    field1993[field2001++] = var125 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var126 = field1993[--field2001];
                    field1993[field2001++] = var126 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field1993[field2001++] = class467.field6579 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field2001 -= 2;
                    int var127 = field1993[field2001];
                    int var128 = field1993[field2001 + 1];
                    field1993[field2001++] = class346.method2089(true, var128, var127, (byte) -116);
                    return;
                }
                if (arg0 == 3314) {
                    field2001 -= 2;
                    int var129 = field1993[field2001];
                    int var130 = field1993[field2001 + 1];
                    field1993[field2001++] = class536.method3081(true, var130, var129, -50);
                    return;
                }
                if (arg0 == 3315) {
                    field2001 -= 2;
                    int var131 = field1993[field2001];
                    int var132 = field1993[field2001 + 1];
                    field1993[field2001++] = class296.method1889(0, true, var131, var132);
                    return;
                }
                if (arg0 == 3316) {
                    if (class258.field3599 >= 2) {
                        field1993[field2001++] = class258.field3599;
                        return;
                    }
                    field1993[field2001++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field1993[field2001++] = class331.field4422;
                    return;
                }
                if (arg0 == 3318) {
                    field1993[field2001++] = class336.field4477.field2680;
                    return;
                }
                if (arg0 == 3321) {
                    field1993[field2001++] = class259.field3607;
                    return;
                }
                if (arg0 == 3322) {
                    field1993[field2001++] = class439.field6250;
                    return;
                }
                if (arg0 == 3323) {
                    if (class628.field9189 >= 5 && class628.field9189 <= 9) {
                        field1993[field2001++] = 1;
                        return;
                    }
                    field1993[field2001++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class628.field9189 >= 5 && class628.field9189 <= 9) {
                        field1993[field2001++] = class628.field9189;
                        return;
                    }
                    field1993[field2001++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field1993[field2001++] = class310.field4179 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field1993[field2001++] = class645.field9372.field2632;
                    return;
                }
                if (arg0 == 3327) {
                    field1993[field2001++] = class645.field9372.field2651.field1525 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field1993[field2001++] = class154.field2314 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var133 = field1993[--field2001];
                    field1993[field2001++] = class212.method1388(var133, 0, false);
                    return;
                }
                if (arg0 == 3331) {
                    field2001 -= 2;
                    int var134 = field1993[field2001];
                    int var135 = field1993[field2001 + 1];
                    field1993[field2001++] = class587.method3444(false, false, var134, -11716, var135);
                    return;
                }
                if (arg0 == 3332) {
                    field2001 -= 2;
                    int var136 = field1993[field2001];
                    int var137 = field1993[field2001 + 1];
                    field1993[field2001++] = class587.method3444(false, true, var136, -11716, var137);
                    return;
                }
                if (arg0 == 3333) {
                    field1993[field2001++] = class320.field4337;
                    return;
                }
                if (arg0 == 3335) {
                    field1993[field2001++] = class173.field2491;
                    return;
                }
                if (arg0 == 3336) {
                    field2001 -= 4;
                    int var138 = field1993[field2001];
                    int var139 = field1993[field2001 + 1];
                    int var140 = field1993[field2001 + 2];
                    int var141 = field1993[field2001 + 3];
                    int var142 = (var139 << 14) + var138;
                    int var143 = (var140 << 28) + var142;
                    int var144 = var141 + var143;
                    field1993[field2001++] = var144;
                    return;
                }
                if (arg0 == 3337) {
                    field1993[field2001++] = class517.field7259;
                    return;
                }
                if (arg0 == 3338) {
                    field1993[field2001++] = class186.method1160((byte) -76);
                    return;
                }
                if (arg0 == 3339) {
                    field1993[field2001++] = class626.field9134 ? 1 : 0;
                    return;
                }
                if (arg0 == 3340) {
                    field1993[field2001++] = class408.field5783 ? 1 : 0;
                    return;
                }
                if (arg0 == 3341) {
                    field1993[field2001++] = class212.field2999 ? 1 : 0;
                    return;
                }
                if (arg0 == 3342) {
                    field1993[field2001++] = class602.field8697.method2153((byte) 108);
                    return;
                }
                if (arg0 == 3343) {
                    field1993[field2001++] = class602.field8697.method2152(0);
                    return;
                }
                if (arg0 == 3344) {
                    field2009[field2006++] = class31.method319(13288);
                    return;
                }
                if (arg0 == 3345) {
                    field2009[field2006++] = class391.method2354(0);
                    return;
                }
                if (arg0 == 3346) {
                    field1993[field2001++] = class140.method931((byte) -37);
                    return;
                }
                if (arg0 == 3347) {
                    field1993[field2001++] = class130.field2094;
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field2001 -= 2;
                    int var145 = field1993[field2001];
                    int var146 = field1993[field2001 + 1];
                    class37 var147 = class643.field9342.method3519(1, var145);
                    field2009[field2006++] = var147.method391((byte) 118, var146);
                    return;
                }
                if (arg0 == 3408) {
                    field2001 -= 4;
                    int var148 = field1993[field2001];
                    int var149 = field1993[field2001 + 1];
                    int var150 = field1993[field2001 + 2];
                    int var151 = field1993[field2001 + 3];
                    class37 var152 = class643.field9342.method3519(1, var150);
                    if (var152.field770 == var148 && var152.field778 == var149) {
                        if (var149 == 115) {
                            field2009[field2006++] = var152.method391((byte) 91, var151);
                            return;
                        }
                        field1993[field2001++] = var152.method386((byte) -98, var151);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field2001 -= 3;
                    int var153 = field1993[field2001];
                    int var154 = field1993[field2001 + 1];
                    int var155 = field1993[field2001 + 2];
                    if (var154 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class37 var156 = class643.field9342.method3519(1, var154);
                    if (var156.field778 != var153) {
                        throw new RuntimeException("C3409-1");
                    }
                    field1993[field2001++] = var156.method390(125, var155) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var157 = field1993[--field2001];
                    String var158 = field2009[--field2006];
                    if (var157 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class37 var159 = class643.field9342.method3519(1, var157);
                    if (var159.field778 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field1993[field2001++] = var159.method393(var158, 1) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var160 = field1993[--field2001];
                    class37 var161 = class643.field9342.method3519(1, var160);
                    field1993[field2001++] = var161.field775.method1250(0);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class608.field8764 == 0) {
                        field1993[field2001++] = -2;
                        return;
                    }
                    if (class608.field8764 == 1) {
                        field1993[field2001++] = -1;
                        return;
                    }
                    field1993[field2001++] = class367.field4989;
                    return;
                }
                if (arg0 == 3601) {
                    int var162 = field1993[--field2001];
                    if (class608.field8764 == 2 && var162 < class367.field4989) {
                        field2009[field2006++] = class474.field6677[var162];
                        if (class326.field4381[var162] != null) {
                            field2009[field2006++] = class326.field4381[var162];
                            return;
                        }
                        field2009[field2006++] = "";
                        return;
                    }
                    field2009[field2006++] = "";
                    field2009[field2006++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var163 = field1993[--field2001];
                    if (class608.field8764 == 2 && var163 < class367.field4989) {
                        field1993[field2001++] = class345.field4645[var163];
                        return;
                    }
                    field1993[field2001++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var164 = field1993[--field2001];
                    if (class608.field8764 == 2 && var164 < class367.field4989) {
                        field1993[field2001++] = class210.field2963[var164];
                        return;
                    }
                    field1993[field2001++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var165 = field2009[--field2006];
                    int var166 = field1993[--field2001];
                    class145.method967(var165, 9, var166);
                    return;
                }
                if (arg0 == 3605) {
                    String var167 = field2009[--field2006];
                    class183.method1145(var167, 0);
                    return;
                }
                if (arg0 == 3606) {
                    String var168 = field2009[--field2006];
                    class270.method1759(var168, -8863);
                    return;
                }
                if (arg0 == 3607) {
                    String var169 = field2009[--field2006];
                    class602.method3550(var169, false, (byte) 53);
                    return;
                }
                if (arg0 == 3608) {
                    String var170 = field2009[--field2006];
                    class561.method3199(-108, var170);
                    return;
                }
                if (arg0 == 3609) {
                    String var171 = field2009[--field2006];
                    if (var171.startsWith("<img=0>") || var171.startsWith("<img=1>")) {
                        var171 = var171.substring(7);
                    }
                    field1993[field2001++] = class621.method3617(var171, 33) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var172 = field1993[--field2001];
                    if (class608.field8764 == 2 && var172 < class367.field4989) {
                        field2009[field2006++] = class165.field2376[var172];
                        return;
                    }
                    field2009[field2006++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class572.field7886 != null) {
                        field2009[field2006++] = class529.method3037((byte) 114, class572.field7886);
                        return;
                    }
                    field2009[field2006++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class572.field7886 != null) {
                        field1993[field2001++] = class594.field8603;
                        return;
                    }
                    field1993[field2001++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var173 = field1993[--field2001];
                    if (class572.field7886 != null && var173 < class594.field8603) {
                        field2009[field2006++] = class587.field8394[var173].field1393;
                        return;
                    }
                    field2009[field2006++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var174 = field1993[--field2001];
                    if (class572.field7886 != null && var174 < class594.field8603) {
                        field1993[field2001++] = class587.field8394[var174].field1387;
                        return;
                    }
                    field1993[field2001++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var175 = field1993[--field2001];
                    if (class572.field7886 != null && var175 < class594.field8603) {
                        field1993[field2001++] = class587.field8394[var175].field1394;
                        return;
                    }
                    field1993[field2001++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field1993[field2001++] = class213.field3023;
                    return;
                }
                if (arg0 == 3617) {
                    String var176 = field2009[--field2006];
                    class441.method2616(var176, 0);
                    return;
                }
                if (arg0 == 3618) {
                    field1993[field2001++] = class204.field2866;
                    return;
                }
                if (arg0 == 3619) {
                    String var177 = field2009[--field2006];
                    class579.method3314(var177, 78);
                    return;
                }
                if (arg0 == 3620) {
                    class521.method3009((byte) 48);
                    return;
                }
                if (arg0 == 3621) {
                    if (class608.field8764 == 0) {
                        field1993[field2001++] = -1;
                        return;
                    }
                    field1993[field2001++] = class536.field7488;
                    return;
                }
                if (arg0 == 3622) {
                    int var178 = field1993[--field2001];
                    if (class608.field8764 != 0 && var178 < class536.field7488) {
                        field2009[field2006++] = class645.field9370[var178];
                        if (class634.field9272[var178] != null) {
                            field2009[field2006++] = class634.field9272[var178];
                            return;
                        }
                        field2009[field2006++] = "";
                        return;
                    }
                    field2009[field2006++] = "";
                    field2009[field2006++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var179 = field2009[--field2006];
                    if (var179.startsWith("<img=0>") || var179.startsWith("<img=1>")) {
                        var179 = var179.substring(7);
                    }
                    field1993[field2001++] = class541.method3103(var179, (byte) 88) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var180 = field1993[--field2001];
                    if (class587.field8394 != null && var180 < class594.field8603 && class587.field8394[var180].field1389.equalsIgnoreCase(class645.field9372.field2630)) {
                        field1993[field2001++] = 1;
                        return;
                    }
                    field1993[field2001++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class113.field1745 != null) {
                        field2009[field2006++] = class113.field1745;
                        return;
                    }
                    field2009[field2006++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var181 = field1993[--field2001];
                    if (class572.field7886 != null && var181 < class594.field8603) {
                        field2009[field2006++] = class587.field8394[var181].field1392;
                        return;
                    }
                    field2009[field2006++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var182 = field1993[--field2001];
                    if (class608.field8764 == 2 && var182 >= 0 && var182 < class367.field4989) {
                        field1993[field2001++] = class254.field3519[var182] ? 1 : 0;
                        return;
                    }
                    field1993[field2001++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var183 = field2009[--field2006];
                    if (var183.startsWith("<img=0>") || var183.startsWith("<img=1>")) {
                        var183 = var183.substring(7);
                    }
                    field1993[field2001++] = class513.method2974(-1, var183);
                    return;
                }
                if (arg0 == 3629) {
                    field1993[field2001++] = class537.field7519;
                    return;
                }
                if (arg0 == 3630) {
                    String var184 = field2009[--field2006];
                    class602.method3550(var184, true, (byte) 34);
                    return;
                }
                if (arg0 == 3631) {
                    int var185 = field1993[--field2001];
                    field1993[field2001++] = class207.field2915[var185] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var186 = field1993[--field2001];
                    if (class572.field7886 != null && var186 < class594.field8603) {
                        field2009[field2006++] = class587.field8394[var186].field1389;
                        return;
                    }
                    field2009[field2006++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var187 = field1993[--field2001];
                    if (class608.field8764 != 0 && var187 < class536.field7488) {
                        field2009[field2006++] = class471.field6623[var187];
                        return;
                    }
                    field2009[field2006++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var188 = field1993[--field2001];
                    field1993[field2001++] = class311.field4183[var188].method3546((byte) -33);
                    return;
                }
                if (arg0 == 3904) {
                    int var189 = field1993[--field2001];
                    field1993[field2001++] = class311.field4183[var189].field8660;
                    return;
                }
                if (arg0 == 3905) {
                    int var190 = field1993[--field2001];
                    field1993[field2001++] = class311.field4183[var190].field8663;
                    return;
                }
                if (arg0 == 3906) {
                    int var191 = field1993[--field2001];
                    field1993[field2001++] = class311.field4183[var191].field8661;
                    return;
                }
                if (arg0 == 3907) {
                    int var192 = field1993[--field2001];
                    field1993[field2001++] = class311.field4183[var192].field8664;
                    return;
                }
                if (arg0 == 3908) {
                    int var193 = field1993[--field2001];
                    field1993[field2001++] = class311.field4183[var193].field8659;
                    return;
                }
                if (arg0 == 3910) {
                    int var194 = field1993[--field2001];
                    int var195 = class311.field4183[var194].method3545((byte) -82);
                    field1993[field2001++] = var195 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var196 = field1993[--field2001];
                    int var197 = class311.field4183[var196].method3545((byte) -65);
                    field1993[field2001++] = var197 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var198 = field1993[--field2001];
                    int var199 = class311.field4183[var198].method3545((byte) -100);
                    field1993[field2001++] = var199 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var200 = field1993[--field2001];
                    int var201 = class311.field4183[var200].method3545((byte) -57);
                    field1993[field2001++] = var201 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field2001 -= 2;
                    int var202 = field1993[field2001];
                    int var203 = field1993[field2001 + 1];
                    field1993[field2001++] = var202 + var203;
                    return;
                }
                if (arg0 == 4001) {
                    field2001 -= 2;
                    int var204 = field1993[field2001];
                    int var205 = field1993[field2001 + 1];
                    field1993[field2001++] = var204 - var205;
                    return;
                }
                if (arg0 == 4002) {
                    field2001 -= 2;
                    int var206 = field1993[field2001];
                    int var207 = field1993[field2001 + 1];
                    field1993[field2001++] = var206 * var207;
                    return;
                }
                if (arg0 == 4003) {
                    field2001 -= 2;
                    int var208 = field1993[field2001];
                    int var209 = field1993[field2001 + 1];
                    field1993[field2001++] = var208 / var209;
                    return;
                }
                if (arg0 == 4004) {
                    int var210 = field1993[--field2001];
                    field1993[field2001++] = (int) (Math.random() * (double) var210);
                    return;
                }
                if (arg0 == 4005) {
                    int var211 = field1993[--field2001];
                    field1993[field2001++] = (int) (Math.random() * (double) (var211 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field2001 -= 5;
                    int var212 = field1993[field2001];
                    int var213 = field1993[field2001 + 1];
                    int var214 = field1993[field2001 + 2];
                    int var215 = field1993[field2001 + 3];
                    int var216 = field1993[field2001 + 4];
                    field1993[field2001++] = (var213 - var212) * (var216 - var214) / (var215 - var214) + var212;
                    return;
                }
                if (arg0 == 4007) {
                    field2001 -= 2;
                    long var217 = (long) field1993[field2001];
                    long var219 = (long) field1993[field2001 + 1];
                    field1993[field2001++] = (int) (var217 * var219 / 100L + var217);
                    return;
                }
                if (arg0 == 4008) {
                    field2001 -= 2;
                    int var221 = field1993[field2001];
                    int var222 = field1993[field2001 + 1];
                    field1993[field2001++] = var221 | 0x1 << var222;
                    return;
                }
                if (arg0 == 4009) {
                    field2001 -= 2;
                    int var223 = field1993[field2001];
                    int var224 = field1993[field2001 + 1];
                    field1993[field2001++] = var223 & -(0x1 << var224) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field2001 -= 2;
                    int var225 = field1993[field2001];
                    int var226 = field1993[field2001 + 1];
                    field1993[field2001++] = (var225 & 0x1 << var226) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field2001 -= 2;
                    int var227 = field1993[field2001];
                    int var228 = field1993[field2001 + 1];
                    field1993[field2001++] = var227 % var228;
                    return;
                }
                if (arg0 == 4012) {
                    field2001 -= 2;
                    int var229 = field1993[field2001];
                    int var230 = field1993[field2001 + 1];
                    if (var229 == 0) {
                        field1993[field2001++] = 0;
                        return;
                    }
                    field1993[field2001++] = (int) Math.pow((double) var229, (double) var230);
                    return;
                }
                if (arg0 == 4013) {
                    field2001 -= 2;
                    int var231 = field1993[field2001];
                    int var232 = field1993[field2001 + 1];
                    if (var231 == 0) {
                        field1993[field2001++] = 0;
                        return;
                    }
                    if (var232 == 0) {
                        field1993[field2001++] = Integer.MAX_VALUE;
                        return;
                    }
                    field1993[field2001++] = (int) Math.pow((double) var231, 1.0D / (double) var232);
                    return;
                }
                if (arg0 == 4014) {
                    field2001 -= 2;
                    int var233 = field1993[field2001];
                    int var234 = field1993[field2001 + 1];
                    field1993[field2001++] = var233 & var234;
                    return;
                }
                if (arg0 == 4015) {
                    field2001 -= 2;
                    int var235 = field1993[field2001];
                    int var236 = field1993[field2001 + 1];
                    field1993[field2001++] = var235 | var236;
                    return;
                }
                if (arg0 == 4016) {
                    field2001 -= 2;
                    int var237 = field1993[field2001];
                    int var238 = field1993[field2001 + 1];
                    field1993[field2001++] = var237 < var238 ? var237 : var238;
                    return;
                }
                if (arg0 == 4017) {
                    field2001 -= 2;
                    int var239 = field1993[field2001];
                    int var240 = field1993[field2001 + 1];
                    field1993[field2001++] = var239 > var240 ? var239 : var240;
                    return;
                }
                if (arg0 == 4018) {
                    field2001 -= 3;
                    long var241 = (long) field1993[field2001];
                    long var243 = (long) field1993[field2001 + 1];
                    long var245 = (long) field1993[field2001 + 2];
                    field1993[field2001++] = (int) (var241 * var245 / var243);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var247 = field2009[--field2006];
                    int var248 = field1993[--field2001];
                    field2009[field2006++] = var247 + var248;
                    return;
                }
                if (arg0 == 4101) {
                    field2006 -= 2;
                    String var249 = field2009[field2006];
                    String var250 = field2009[field2006 + 1];
                    field2009[field2006++] = var249 + var250;
                    return;
                }
                if (arg0 == 4102) {
                    String var251 = field2009[--field2006];
                    int var252 = field1993[--field2001];
                    field2009[field2006++] = var251 + class412.method2452(var252, true, 13371);
                    return;
                }
                if (arg0 == 4103) {
                    String var253 = field2009[--field2006];
                    field2009[field2006++] = var253.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field2009[field2006++] = method851(field1993[--field2001]);
                    return;
                }
                if (arg0 == 4105) {
                    field2006 -= 2;
                    String var254 = field2009[field2006];
                    String var255 = field2009[field2006 + 1];
                    if (class645.field9372.field2651 != null && class645.field9372.field2651.field1525) {
                        field2009[field2006++] = var255;
                        return;
                    }
                    field2009[field2006++] = var254;
                    return;
                }
                if (arg0 == 4106) {
                    int var256 = field1993[--field2001];
                    field2009[field2006++] = Integer.toString(var256);
                    return;
                }
                if (arg0 == 4107) {
                    field2006 -= 2;
                    field1993[field2001++] = class397.method2373(class173.field2491, field2009[field2006 + 1], 0, field2009[field2006]);
                    return;
                }
                if (arg0 == 4108) {
                    String var257 = field2009[--field2006];
                    field2001 -= 2;
                    int var258 = field1993[field2001];
                    int var259 = field1993[field2001 + 1];
                    class483 var260 = class571.method3244(-32635, var259, 0, class385.field5162);
                    field1993[field2001++] = var260.method2813(var257, var258, class257.field3566, (byte) -125);
                    return;
                }
                if (arg0 == 4109) {
                    String var261 = field2009[--field2006];
                    field2001 -= 2;
                    int var262 = field1993[field2001];
                    int var263 = field1993[field2001 + 1];
                    class483 var264 = class571.method3244(-32635, var263, 0, class385.field5162);
                    field1993[field2001++] = var264.method2822(class257.field3566, 28353, var261, var262);
                    return;
                }
                if (arg0 == 4110) {
                    field2006 -= 2;
                    String var265 = field2009[field2006];
                    String var266 = field2009[field2006 + 1];
                    if (field1993[--field2001] == 1) {
                        field2009[field2006++] = var265;
                        return;
                    }
                    field2009[field2006++] = var266;
                    return;
                }
                if (arg0 == 4111) {
                    String var267 = field2009[--field2006];
                    field2009[field2006++] = class645.method3719((byte) -61, var267);
                    return;
                }
                if (arg0 == 4112) {
                    String var268 = field2009[--field2006];
                    int var269 = field1993[--field2001];
                    if (var269 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field2009[field2006++] = var268 + (char) var269;
                    return;
                }
                if (arg0 == 4113) {
                    int var270 = field1993[--field2001];
                    field1993[field2001++] = class372.method2216((byte) 8, (char) var270) ? 1 : 0;
                    return;
                }
                if (arg0 == 4114) {
                    int var271 = field1993[--field2001];
                    field1993[field2001++] = class285.method1824((byte) -57, (char) var271) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var272 = field1993[--field2001];
                    field1993[field2001++] = class463.method2706((char) var272, -20) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var273 = field1993[--field2001];
                    field1993[field2001++] = class298.method1900((byte) 92, (char) var273) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var274 = field2009[--field2006];
                    if (var274 != null) {
                        field1993[field2001++] = var274.length();
                        return;
                    }
                    field1993[field2001++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var275 = field2009[--field2006];
                    field2001 -= 2;
                    int var276 = field1993[field2001];
                    int var277 = field1993[field2001 + 1];
                    field2009[field2006++] = var275.substring(var276, var277);
                    return;
                }
                if (arg0 == 4119) {
                    String var278 = field2009[--field2006];
                    StringBuffer var279 = new StringBuffer(var278.length());
                    boolean var280 = false;
                    for (int var281 = 0; var281 < var278.length(); var281++) {
                        char var282 = var278.charAt(var281);
                        if (var282 == '<') {
                            var280 = true;
                        } else if (var282 == '>') {
                            var280 = false;
                        } else if (!var280) {
                            var279.append(var282);
                        }
                    }
                    field2009[field2006++] = var279.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var283 = field2009[--field2006];
                    field2001 -= 2;
                    int var284 = field1993[field2001];
                    int var285 = field1993[field2001 + 1];
                    field1993[field2001++] = var283.indexOf(var284, var285);
                    return;
                }
                if (arg0 == 4121) {
                    field2006 -= 2;
                    String var286 = field2009[field2006];
                    String var287 = field2009[field2006 + 1];
                    int var288 = field1993[--field2001];
                    field1993[field2001++] = var286.indexOf(var287, var288);
                    return;
                }
                if (arg0 == 4122) {
                    int var289 = field1993[--field2001];
                    field1993[field2001++] = Character.toLowerCase((char) var289);
                    return;
                }
                if (arg0 == 4123) {
                    int var290 = field1993[--field2001];
                    field1993[field2001++] = Character.toUpperCase((char) var290);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var291 = field1993[--field2001] != 0;
                    int var292 = field1993[--field2001];
                    field2009[field2006++] = class474.method2752(class173.field2491, var291, (long) var292, 0, -32768);
                    return;
                }
                if (arg0 == 4125) {
                    String var293 = field2009[--field2006];
                    int var294 = field1993[--field2001];
                    class483 var295 = class571.method3244(-32635, var294, 0, class385.field5162);
                    field1993[field2001++] = var295.method2811(class257.field3566, var293, -41);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var296 = field1993[--field2001];
                    field2009[field2006++] = class181.field2574.method866(var296, (byte) 79).field8924;
                    return;
                }
                if (arg0 == 4201) {
                    field2001 -= 2;
                    int var297 = field1993[field2001];
                    int var298 = field1993[field2001 + 1];
                    class621 var299 = class181.field2574.method866(var297, (byte) 79);
                    if (var298 >= 1 && var298 <= 5 && var299.field8898[var298 - 1] != null) {
                        field2009[field2006++] = var299.field8898[var298 - 1];
                        return;
                    }
                    field2009[field2006++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field2001 -= 2;
                    int var300 = field1993[field2001];
                    int var301 = field1993[field2001 + 1];
                    class621 var302 = class181.field2574.method866(var300, (byte) 79);
                    if (var301 >= 1 && var301 <= 5 && var302.field8938[var301 - 1] != null) {
                        field2009[field2006++] = var302.field8938[var301 - 1];
                        return;
                    }
                    field2009[field2006++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var303 = field1993[--field2001];
                    field1993[field2001++] = class181.field2574.method866(var303, (byte) 79).field8960;
                    return;
                }
                if (arg0 == 4204) {
                    int var304 = field1993[--field2001];
                    field1993[field2001++] = class181.field2574.method866(var304, (byte) 79).field8948 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var305 = field1993[--field2001];
                    class621 var306 = class181.field2574.method866(var305, (byte) 79);
                    if (var306.field8910 == -1 && var306.field8926 >= 0) {
                        field1993[field2001++] = var306.field8926;
                        return;
                    }
                    field1993[field2001++] = var305;
                    return;
                }
                if (arg0 == 4206) {
                    int var307 = field1993[--field2001];
                    class621 var308 = class181.field2574.method866(var307, (byte) 79);
                    if (var308.field8910 >= 0 && var308.field8926 >= 0) {
                        field1993[field2001++] = var308.field8926;
                        return;
                    }
                    field1993[field2001++] = var307;
                    return;
                }
                if (arg0 == 4207) {
                    int var309 = field1993[--field2001];
                    field1993[field2001++] = class181.field2574.method866(var309, (byte) 79).field8956 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field2001 -= 2;
                    int var310 = field1993[field2001];
                    int var311 = field1993[field2001 + 1];
                    class22 var312 = class533.field7455.method3115(128, var311);
                    if (var312.method256(false)) {
                        field2009[field2006++] = class181.field2574.method866(var310, (byte) 79).method3610(var312.field322, (byte) 122, var311);
                        return;
                    }
                    field1993[field2001++] = class181.field2574.method866(var310, (byte) 79).method3628(var311, (byte) -61, var312.field323);
                    return;
                }
                if (arg0 == 4209) {
                    field2001 -= 2;
                    int var313 = field1993[field2001];
                    int var314 = field1993[field2001 + 1] - 1;
                    class621 var315 = class181.field2574.method866(var313, (byte) 79);
                    if (var315.field8904 == var314) {
                        field1993[field2001++] = var315.field8930;
                        return;
                    }
                    if (var315.field8949 == var314) {
                        field1993[field2001++] = var315.field8886;
                        return;
                    }
                    field1993[field2001++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var316 = field2009[--field2006];
                    int var317 = field1993[--field2001];
                    class1.method5(var317 == 1, 1, var316);
                    field1993[field2001++] = class568.field7844;
                    return;
                }
                if (arg0 == 4211) {
                    if (class512.field7212 != null && class536.field7493 < class568.field7844) {
                        field1993[field2001++] = class512.field7212[class536.field7493++] & 0xFFFF;
                        return;
                    }
                    field1993[field2001++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class536.field7493 = 0;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field2001 -= 2;
                    int var318 = field1993[field2001];
                    int var319 = field1993[field2001 + 1];
                    class22 var320 = class533.field7455.method3115(128, var319);
                    if (var320.method256(false)) {
                        field2009[field2006++] = class516.field7253.method3263(var318, (byte) -103).method3514(var319, var320.field322, (byte) 109);
                        return;
                    }
                    field1993[field2001++] = class516.field7253.method3263(var318, (byte) -103).method3513(var320.field323, (byte) 116, var319);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field2001 -= 2;
                    int var321 = field1993[field2001];
                    int var322 = field1993[field2001 + 1];
                    class22 var323 = class533.field7455.method3115(128, var322);
                    if (var323.method256(false)) {
                        field2009[field2006++] = class18.field227.method1201((byte) 95, var321).method2187(var323.field322, var322, -63);
                        return;
                    }
                    field1993[field2001++] = class18.field227.method1201((byte) -121, var321).method2185(var322, 101, var323.field323);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field2001 -= 2;
                    int var324 = field1993[field2001];
                    int var325 = field1993[field2001 + 1];
                    class22 var326 = class533.field7455.method3115(128, var325);
                    if (var326.method256(false)) {
                        field2009[field2006++] = class642.field9327.method3562(var324, (byte) 124).method985(var326.field322, -22122, var325);
                        return;
                    }
                    field1993[field2001++] = class642.field9327.method3562(var324, (byte) 123).method986(-118, var326.field323, var325);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var327 = field1993[--field2001];
                class107 var328 = class263.field3678.method710(260522, var327);
                if (var328.field1622 != null && var328.field1622.length > 0) {
                    int var329 = 0;
                    int var330 = var328.field1610[0];
                    for (int var331 = 1; var331 < var328.field1622.length; var331++) {
                        if (var328.field1610[var331] > var330) {
                            var329 = var331;
                            var330 = var328.field1610[var331];
                        }
                    }
                    field1993[field2001++] = var328.field1622[var329];
                    return;
                }
                field1993[field2001++] = var328.field1616;
                return;
            }
        } else {
            class114 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class612.method3584(field1993[--field2001], 0);
            } else {
                var47 = arg1 ? field1989 : field1998;
            }
            if (arg0 == 1300) {
                int var48 = field1993[--field2001] - 1;
                if (var48 >= 0 && var48 <= 9) {
                    var47.method805(field2009[--field2006], 1, var48);
                    return;
                }
                field2006--;
                return;
            }
            if (arg0 == 1301) {
                field2001 -= 2;
                int var49 = field1993[field2001];
                int var50 = field1993[field2001 + 1];
                if (var49 == -1 && var50 == -1) {
                    var47.field1914 = null;
                    return;
                }
                var47.field1914 = class512.method2969(var49, var50, (byte) 95);
                return;
            }
            if (arg0 == 1302) {
                int var51 = field1993[--field2001];
                if (class206.field2894 != var51 && class144.field2221 != var51 && class69.field1167 != var51) {
                    return;
                }
                var47.field1857 = var51;
                return;
            }
            if (arg0 == 1303) {
                var47.field1879 = field1993[--field2001];
                return;
            }
            if (arg0 == 1304) {
                var47.field1847 = field1993[--field2001];
                return;
            }
            if (arg0 == 1305) {
                var47.field1824 = field2009[--field2006];
                return;
            }
            if (arg0 == 1306) {
                var47.field1826 = field2009[--field2006];
                return;
            }
            if (arg0 == 1307) {
                var47.field1795 = null;
                return;
            }
            if (arg0 == 1308) {
                var47.field1761 = field1993[--field2001];
                var47.field1796 = field1993[--field2001];
                return;
            }
            if (arg0 == 1309) {
                int var52 = field1993[--field2001];
                int var53 = field1993[--field2001];
                if (var53 >= 1 && var53 <= 10) {
                    var47.method804(var53 - 1, 85, var52);
                }
                return;
            }
            if (arg0 == 1310) {
                var47.field1774 = field2009[--field2006];
                return;
            }
            if (arg0 == 1311) {
                var47.field1750 = field1993[--field2001];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var54;
                int var55;
                int var56;
                if (arg0 == 1312) {
                    field2001 -= 3;
                    var54 = field1993[field2001] - 1;
                    var55 = field1993[field2001 + 1];
                    var56 = field1993[field2001 + 2];
                    if (var54 < 0 || var54 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field2001 -= 2;
                    var54 = 10;
                    var55 = field1993[field2001];
                    var56 = field1993[field2001 + 1];
                }
                if (var47.field1872 == null) {
                    if (var55 == 0) {
                        return;
                    }
                    var47.field1872 = new byte[11];
                    var47.field1775 = new byte[11];
                    var47.field1812 = new int[11];
                }
                var47.field1872[var54] = (byte) var55;
                if (var55 == 0) {
                    var47.field1858 = false;
                    for (int var57 = 0; var57 < var47.field1872.length; var57++) {
                        if (var47.field1872[var57] != 0) {
                            var47.field1858 = true;
                            break;
                        }
                    }
                } else {
                    var47.field1858 = true;
                }
                var47.field1775[var54] = (byte) var56;
                return;
            }
            if (arg0 == 1314) {
                var47.field1806 = field1993[--field2001];
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lcl;)V")
    public static final void method862(class224 arg0) {
        method852(arg0, 200000);
    }
}
