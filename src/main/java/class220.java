import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class220 extends class228 {

    @OriginalMember(owner = "client!oq", name = "l", descriptor = "I")
    private int field2928;

    @OriginalMember(owner = "client!oq", name = "s", descriptor = "I")
    private int field2935;

    @OriginalMember(owner = "client!oq", name = "n", descriptor = "I")
    private int field2930;

    @OriginalMember(owner = "client!oq", name = "m", descriptor = "I")
    private int field2929;

    @OriginalMember(owner = "client!oq", name = "r", descriptor = "Lgd;")
    public static class206 field2934 = new class206("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!oq", name = "x", descriptor = "[I")
    public static int[] field2940 = new int[13];

    @OriginalMember(owner = "client!oq", name = "v", descriptor = "Lgd;")
    public static class206 field2938 = new class206("M", "M", "M", "M");

    @OriginalMember(owner = "client!oq", name = "o", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!oq", name = "p", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!oq", name = "q", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!oq", name = "t", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!oq", name = "u", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!oq", name = "w", descriptor = "Lci;")
    public static class287 field2939;

    static {
        new class206("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lcf;IZI)V", line = 5)
    public static final void method1248(class395 arg0, int arg1, boolean arg2, int arg3) {
        ++field2931;
        if (arg0 != null && class450.field6121.field1573 != arg0) {
            int var4 = arg0.field5472;
            int var5 = arg0.field5479;
            int var6 = arg0.field5469;
            int var7 = (int) arg0.field5480;
            long var8 = arg0.field5480;
            if (~var6 <= -2001) {
                var6 -= 2000;
            }
            if (~var6 == -22) {
                ++class215.field2886;
                class171.field2349 = arg1;
                class306.field4053 = arg3;
                class369.field5063 = 2;
                class175.field2392 = 0;
                class491.method2861(class129.field1899, 1);
                class203.field2751.method224(class266.field3511 + var5, 0);
                class203.field2751.method229(class162.field2260 + var4, 1309449544);
                class203.field2751.method205(!class449.field6111.method882((byte) 78, 82) ? 0 : 1, 255);
                class203.field2751.method216(var7, -1);
                class370.method2284(var5, var4, 1);
            }
            if (var6 == 45 || ~var6 == -1012) {
                class270.method1534(var5, var7, -1, arg0.field5475, var4);
            }
            if (~var6 == -52) {
                class369.field5063 = 1;
                class171.field2349 = arg1;
                ++class228.field2996;
                class306.field4053 = arg3;
                class175.field2392 = 0;
                class491.method2861(class336.field4533, 1);
                class203.field2751.method216(class336.field4538, -1);
                class203.field2751.method199((byte) -117, class210.field2841);
                class203.field2751.method224(class266.field3511 + var5, 0);
                class203.field2751.method216(class38.field559, -1);
                class203.field2751.method224(class162.field2260 - -var4, 0);
                class302.method1689(true, -4, var5, 0, 1, var4, 1, 120, 0);
            }
            if (var6 == 12) {
                class369.field5063 = 2;
                class175.field2392 = 0;
                class171.field2349 = arg1;
                class306.field4053 = arg3;
                ++class106.field1587;
                class491.method2861(class202.field2742, 1);
                class203.field2751.method224((int) (var8 >>> 32) & Integer.MAX_VALUE, 0);
                class203.field2751.method224(class266.field3511 + var5, 0);
                class203.field2751.method229(var4 - -class162.field2260, 1309449544);
                class203.field2751.method228(class449.field6111.method882((byte) -120, 82) ? 1 : 0, 32);
                class72.method465((byte) 117, var5, var8, var4);
            }
            if (var6 == 1004) {
                ++class76.field1024;
                class175.field2392 = 0;
                class306.field4053 = arg3;
                class369.field5063 = 2;
                class171.field2349 = arg1;
                class491.method2861(class257.field3427, 1);
                class203.field2751.method241(var5 - -class266.field3511, (byte) -74);
                class203.field2751.method216((int) (var8 >>> 32) & Integer.MAX_VALUE, -1);
                class203.field2751.method241(class162.field2260 + var4, (byte) -24);
                class203.field2751.method200(class449.field6111.method882((byte) 79, 82) ? 1 : 0, (byte) 127);
                class72.method465((byte) 117, var5, var8, var4);
            }
            if (var6 == 2) {
                class487 var10 = class413.field5644[var7];
                if (var10 != null) {
                    class306.field4053 = arg3;
                    class175.field2392 = 0;
                    ++class323.field4298;
                    class369.field5063 = 2;
                    class171.field2349 = arg1;
                    class491.method2861(class28.field372, 1);
                    class203.field2751.method205(class449.field6111.method882((byte) -121, 82) ? 1 : 0, 255);
                    class203.field2751.method224(var7, 0);
                    class302.method1689(true, -2, var10.field1197[0], 0, var10.method545(!arg2), var10.field1193[0], var10.method545(!arg2), 125, 0);
                }
            }
            if (~var6 == -1010) {
                class171.field2349 = arg1;
                class306.field4053 = arg3;
                ++class177.field2402;
                class175.field2392 = 0;
                class369.field5063 = 2;
                class491.method2861(class120.field1768, 1);
                class203.field2751.method229(var7, 1309449544);
            }
            if (var6 == 46) {
                ++class221.field2944;
                class175.field2392 = 0;
                class369.field5063 = 2;
                class171.field2349 = arg1;
                class306.field4053 = arg3;
                class491.method2861(class175.field2387, 1);
                class203.field2751.method216(class266.field3511 + var5, -1);
                class203.field2751.method229(var7, 1309449544);
                class203.field2751.method205(!class449.field6111.method882((byte) -77, 82) ? 0 : 1, 255);
                class203.field2751.method241(class162.field2260 + var4, (byte) -59);
                class370.method2284(var5, var4, 1);
            }
            if (var6 == 59) {
                if (class348.field4799 > 0 && class449.field6111.method882((byte) 113, 82) && class449.field6111.method882((byte) -72, 81)) {
                    class150.method889(class233.field3103.field6502, (byte) -58, class266.field3511 + var5, class162.field2260 + var4);
                } else {
                    class306.field4053 = arg3;
                    class175.field2392 = 0;
                    ++class13.field173;
                    class171.field2349 = arg1;
                    class369.field5063 = 1;
                    class491.method2861(class60.field803, 1);
                    class203.field2751.method229(class162.field2260 + var4, 1309449544);
                    class203.field2751.method241(class266.field3511 + var5, (byte) -26);
                }
            }
            if (!arg2) {
                method1251((byte) 5);
            }
            if (~var6 == -1007) {
                class175.field2392 = 0;
                class369.field5063 = 2;
                class171.field2349 = arg1;
                class306.field4053 = arg3;
                class121 var11 = class221.field2941[var7];
                if (var11 != null) {
                    class429 var12 = var11.field1780;
                    if (var12.field5824 != null) {
                        var12 = var12.method2531(class38.field562, 92);
                    }
                    if (var12 != null) {
                        class491.method2861(class480.field6634, 1);
                        ++class80.field1075;
                        class203.field2751.method229(var12.field5867, 1309449544);
                    }
                }
            }
            if (var6 == 4) {
                class121 var13 = class221.field2941[var7];
                if (var13 != null) {
                    class171.field2349 = arg1;
                    class306.field4053 = arg3;
                    class175.field2392 = 0;
                    ++class72.field993;
                    class369.field5063 = 2;
                    class491.method2861(class348.field4793, 1);
                    class203.field2751.method224(var7, 0);
                    class203.field2751.method228(class449.field6111.method882((byte) 71, 82) ? 1 : 0, 32);
                    class302.method1689(true, -2, var13.field1197[0], 0, var13.method545(false), var13.field1193[0], var13.method545(false), 124, 0);
                }
            }
            if (~var6 == -16) {
                class175.field2392 = 0;
                class171.field2349 = arg1;
                class306.field4053 = arg3;
                ++class102.field1465;
                class369.field5063 = 2;
                class491.method2861(class169.field2334, 1);
                class203.field2751.method224(var7, 0);
                class203.field2751.method241(class266.field3511 + var5, (byte) -48);
                class203.field2751.method224(class162.field2260 + var4, 0);
                class203.field2751.method205(class449.field6111.method882((byte) -92, 82) ? 1 : 0, 255);
                class370.method2284(var5, var4, 1);
            }
            if (~var6 == -11) {
                class121 var14 = class221.field2941[var7];
                if (var14 != null) {
                    class306.field4053 = arg3;
                    class171.field2349 = arg1;
                    ++class72.field987;
                    class175.field2392 = 0;
                    class369.field5063 = 2;
                    class491.method2861(class68.field932, 1);
                    class203.field2751.method199((byte) -117, class210.field2841);
                    class203.field2751.method205(class449.field6111.method882((byte) -103, 82) ? 1 : 0, 255);
                    class203.field2751.method224(class336.field4538, 0);
                    class203.field2751.method216(class38.field559, -1);
                    class203.field2751.method229(var7, 1309449544);
                    class302.method1689(true, -2, var14.field1197[0], 0, var14.method545(false), var14.field1193[0], var14.method545(!arg2), 125, 0);
                }
            }
            if (~var6 == -18) {
                class306.field4053 = arg3;
                class171.field2349 = arg1;
                class175.field2392 = 0;
                ++class159.field2185;
                class369.field5063 = 2;
                class491.method2861(class228.field2995, 1);
                class203.field2751.method224(Integer.MAX_VALUE & (int) (var8 >>> 32), 0);
                class203.field2751.method228(!class449.field6111.method882((byte) 90, 82) ? 0 : 1, 32);
                class203.field2751.method229(class162.field2260 + var4, 1309449544);
                class203.field2751.method216(class266.field3511 + var5, -1);
                class72.method465((byte) 117, var5, var8, var4);
            }
            if (var6 == 60) {
                class487 var15 = class413.field5644[var7];
                if (var15 != null) {
                    class369.field5063 = 2;
                    class306.field4053 = arg3;
                    ++class40.field572;
                    class175.field2392 = 0;
                    class171.field2349 = arg1;
                    class491.method2861(class52.field684, 1);
                    class203.field2751.method234((byte) 79, class210.field2841);
                    class203.field2751.method205(class449.field6111.method882((byte) -84, 82) ? 1 : 0, 255);
                    class203.field2751.method216(class38.field559, -1);
                    class203.field2751.method224(class336.field4538, 0);
                    class203.field2751.method216(var7, -1);
                    class302.method1689(true, -2, var15.field1197[0], 0, var15.method545(false), var15.field1193[0], var15.method545(!arg2), 123, 0);
                }
            }
            if (var6 == 20) {
                class171.field2349 = arg1;
                class175.field2392 = 0;
                ++class215.field2892;
                class369.field5063 = 2;
                class306.field4053 = arg3;
                class491.method2861(class206.field2793, 1);
                class203.field2751.method224(class266.field3511 + var5, 0);
                class203.field2751.method241(Integer.MAX_VALUE & (int) (var8 >>> 32), (byte) -56);
                class203.field2751.method229(class162.field2260 + var4, 1309449544);
                class203.field2751.method200(!class449.field6111.method882((byte) 101, 82) ? 0 : 1, (byte) 122);
                class72.method465((byte) 117, var5, var8, var4);
            }
            if (~var6 == -59) {
                class369.field5063 = 2;
                ++class159.field2180;
                class306.field4053 = arg3;
                class171.field2349 = arg1;
                class175.field2392 = 0;
                class491.method2861(class387.field5361, 1);
                class203.field2751.method224(var7, 0);
                class203.field2751.method213((byte) -110, !class449.field6111.method882((byte) -85, 82) ? 0 : 1);
                class203.field2751.method229(class266.field3511 + var5, 1309449544);
                class203.field2751.method216(class162.field2260 + var4, -1);
                class370.method2284(var5, var4, 1);
            }
            if (var6 == 13) {
                class175.field2392 = 0;
                ++class475.field6539;
                class171.field2349 = arg1;
                class306.field4053 = arg3;
                class369.field5063 = 2;
                class491.method2861(class112.field1701, 1);
                class203.field2751.method229(class336.field4538, 1309449544);
                class203.field2751.method224(var7, 0);
                class203.field2751.method216(class162.field2260 + var4, -1);
                class203.field2751.method200(class449.field6111.method882((byte) -119, 82) ? 1 : 0, (byte) 127);
                class203.field2751.method224(class38.field559, 0);
                class203.field2751.method191(-839598448, class210.field2841);
                class203.field2751.method224(class266.field3511 + var5, 0);
                class370.method2284(var5, var4, 1);
            }
            if (~var6 == -24) {
                class487 var16 = class413.field5644[var7];
                if (var16 != null) {
                    ++class202.field2736;
                    class369.field5063 = 2;
                    class171.field2349 = arg1;
                    class175.field2392 = 0;
                    class306.field4053 = arg3;
                    class491.method2861(class96.field1416, 1);
                    class203.field2751.method216(var7, -1);
                    class203.field2751.method213((byte) 102, !class449.field6111.method882((byte) 115, 82) ? 0 : 1);
                    class302.method1689(true, -2, var16.field1197[0], 0, var16.method545(false), var16.field1193[0], var16.method545(false), 120, 0);
                }
            }
            if (var6 == 6) {
                ++class71.field975;
                class306.field4053 = arg3;
                class171.field2349 = arg1;
                class175.field2392 = 0;
                class369.field5063 = 2;
                class491.method2861(class257.field3430, 1);
                class203.field2751.method229(var7, 1309449544);
                class203.field2751.method213((byte) -110, !class449.field6111.method882((byte) 106, 82) ? 0 : 1);
                class203.field2751.method241(class162.field2260 + var4, (byte) -21);
                class203.field2751.method229(class266.field3511 + var5, 1309449544);
                class370.method2284(var5, var4, 1);
            }
            if (~var6 == -23) {
                if (~class348.field4799 < -1 && class449.field6111.method882((byte) -68, 82) && class449.field6111.method882((byte) 127, 81)) {
                    class150.method889(class233.field3103.field6502, (byte) -23, class266.field3511 + var5, class162.field2260 + var4);
                } else {
                    class453.method2660(0, var4, var5, var7);
                    if (var7 != 1) {
                        class171.field2349 = arg1;
                        class175.field2392 = 0;
                        class369.field5063 = 1;
                        class306.field4053 = arg3;
                    } else {
                        class203.field2751.method228(-1, 32);
                        class203.field2751.method228(-1, 32);
                        class203.field2751.method229((int) class270.field3610, 1309449544);
                        class203.field2751.method228(57, 32);
                        class203.field2751.method228(class150.field2119, 32);
                        class203.field2751.method228(class429.field5795, 32);
                        class203.field2751.method228(89, 32);
                        class203.field2751.method229(class233.field3103.field6501, 1309449544);
                        class203.field2751.method229(class233.field3103.field6507, 1309449544);
                        class203.field2751.method228(63, 32);
                    }
                    class302.method1689(true, -4, var5, 0, 1, var4, 1, 122, 0);
                }
            }
            if (~var6 == -51) {
                class306.field4053 = arg3;
                class175.field2392 = 0;
                class369.field5063 = 2;
                class171.field2349 = arg1;
                ++class63.field826;
                class491.method2861(class358.field4951, 1);
                class203.field2751.method216((int) (var8 >>> 32) & Integer.MAX_VALUE, -1);
                class203.field2751.method216(var4 - -class162.field2260, -1);
                class203.field2751.method216(class266.field3511 + var5, -1);
                class203.field2751.method228(class449.field6111.method882((byte) 80, 82) ? 1 : 0, 32);
                class72.method465((byte) 117, var5, var8, var4);
            }
            if (~var6 == -9) {
                class121 var17 = class221.field2941[var7];
                if (var17 != null) {
                    ++class208.field2807;
                    class306.field4053 = arg3;
                    class369.field5063 = 2;
                    class175.field2392 = 0;
                    class171.field2349 = arg1;
                    class491.method2861(class181.field2472, 1);
                    class203.field2751.method229(var7, 1309449544);
                    class203.field2751.method213((byte) -106, class449.field6111.method882((byte) 117, 82) ? 1 : 0);
                    class302.method1689(true, -2, var17.field1197[0], 0, var17.method545(false), var17.field1193[0], var17.method545(false), 121, 0);
                }
            }
            if (var6 == 48) {
                class487 var18 = class413.field5644[var7];
                if (var18 != null) {
                    class171.field2349 = arg1;
                    class369.field5063 = 2;
                    ++class209.field2817;
                    class306.field4053 = arg3;
                    class175.field2392 = 0;
                    class491.method2861(class268.field3568, 1);
                    class203.field2751.method228(class449.field6111.method882((byte) 108, 82) ? 1 : 0, 32);
                    class203.field2751.method216(var7, -1);
                    class302.method1689(true, -2, var18.field1197[0], 0, var18.method545(false), var18.field1193[0], var18.method545(false), 120, 0);
                }
            }
            if (~var6 == -26) {
                class121 var19 = class221.field2941[var7];
                if (var19 != null) {
                    class369.field5063 = 2;
                    class175.field2392 = 0;
                    class171.field2349 = arg1;
                    ++class158.field2179;
                    class306.field4053 = arg3;
                    class491.method2861(class257.field3426, 1);
                    class203.field2751.method224(var7, 0);
                    class203.field2751.method205(!class449.field6111.method882((byte) 62, 82) ? 0 : 1, 255);
                    class302.method1689(true, -2, var19.field1197[0], 0, var19.method545(false), var19.field1193[0], var19.method545(false), 122, 0);
                }
            }
            if (~var6 == -58) {
                ++class358.field4954;
                class171.field2349 = arg1;
                class175.field2392 = 0;
                class369.field5063 = 2;
                class306.field4053 = arg3;
                class491.method2861(class77.field1038, 1);
                class203.field2751.method216(Integer.MAX_VALUE & (int) (var8 >>> 32), -1);
                class203.field2751.method226((byte) 46, class210.field2841);
                class203.field2751.method229(class336.field4538, 1309449544);
                class203.field2751.method228(!class449.field6111.method882((byte) -128, 82) ? 0 : 1, 32);
                class203.field2751.method224(class38.field559, 0);
                class203.field2751.method229(class162.field2260 + var4, 1309449544);
                class203.field2751.method229(class266.field3511 + var5, 1309449544);
                class72.method465((byte) 117, var5, var8, var4);
            }
            if (var6 == 5) {
                class121 var20 = class221.field2941[var7];
                if (var20 != null) {
                    class175.field2392 = 0;
                    class369.field5063 = 2;
                    ++class313.field4135;
                    class306.field4053 = arg3;
                    class171.field2349 = arg1;
                    class491.method2861(class401.field5509, 1);
                    class203.field2751.method200(!class449.field6111.method882((byte) -119, 82) ? 0 : 1, (byte) 127);
                    class203.field2751.method216(var7, -1);
                    class302.method1689(true, -2, var20.field1197[0], 0, var20.method545(false), var20.field1193[0], var20.method545(false), 125, 0);
                }
            }
            if (var6 == 18) {
                class487 var21 = class413.field5644[var7];
                if (var21 != null) {
                    class369.field5063 = 2;
                    class306.field4053 = arg3;
                    class175.field2392 = 0;
                    class171.field2349 = arg1;
                    ++class401.field5515;
                    class491.method2861(class372.field5077, 1);
                    class203.field2751.method224(var7, 0);
                    class203.field2751.method213((byte) 94, class449.field6111.method882((byte) 99, 82) ? 1 : 0);
                    class302.method1689(true, -2, var21.field1197[0], 0, var21.method545(false), var21.field1193[0], var21.method545(!arg2), 123, 0);
                }
            }
            if (var6 == 9) {
                class487 var22 = class413.field5644[var7];
                if (var22 != null) {
                    class175.field2392 = 0;
                    class171.field2349 = arg1;
                    class306.field4053 = arg3;
                    ++class304.field4041;
                    class369.field5063 = 2;
                    class491.method2861(class59.field790, 1);
                    class203.field2751.method216(var7, -1);
                    class203.field2751.method205(class449.field6111.method882((byte) -120, 82) ? 1 : 0, 255);
                    class302.method1689(true, -2, var22.field1197[0], 0, var22.method545(false), var22.field1193[0], var22.method545(!arg2), 127, 0);
                }
            }
            if (var6 == 49) {
                class464 var23 = class78.method519(var5, var4, (byte) -72);
                if (var23 != null) {
                    class78.method513(-1);
                    class222 var24 = client.method1046(var23);
                    class481.method2807(var23.field6291, var24.method1256((byte) -122), var5, var4, (byte) 43, var23.field6375, var24.field2955);
                    class491.field6867 = class67.method446(-17504, var23);
                    if (class491.field6867 == null) {
                        class491.field6867 = "Null";
                    }
                    class31.field407 = var23.field6400 + "<col=ffffff>";
                }
            } else {
                if (~var6 == -1011) {
                    class171.field2349 = arg1;
                    ++class138.field1999;
                    class369.field5063 = 2;
                    class306.field4053 = arg3;
                    class175.field2392 = 0;
                    class491.method2861(class80.field1080, 1);
                    class203.field2751.method229(var7, 1309449544);
                }
                if (var6 == 19) {
                    class487 var25 = class413.field5644[var7];
                    if (var25 != null) {
                        class171.field2349 = arg1;
                        class306.field4053 = arg3;
                        class369.field5063 = 2;
                        class175.field2392 = 0;
                        ++class148.field2108;
                        class491.method2861(class155.field2161, 1);
                        class203.field2751.method224(var7, 0);
                        class203.field2751.method200(!class449.field6111.method882((byte) 125, 82) ? 0 : 1, (byte) 122);
                        class302.method1689(true, -2, var25.field1197[0], 0, var25.method545(false), var25.field1193[0], var25.method545(false), 126, 0);
                    }
                }
                if (var6 == 1008 || var6 == 1002 || var6 == 1012 || ~var6 == -1004 || var6 == 1007) {
                    class456.method2676(var7, var6, var4, 3);
                }
                if (var6 == 11) {
                    class464 var26 = class78.method519(var5, var4, (byte) -72);
                    if (var26 != null) {
                        class347.method2148(var26, -128);
                    }
                }
                if (~var6 == -48) {
                    class487 var27 = class413.field5644[var7];
                    if (var27 != null) {
                        class171.field2349 = arg1;
                        ++class444.field6039;
                        class306.field4053 = arg3;
                        class175.field2392 = 0;
                        class369.field5063 = 2;
                        class491.method2861(class51.field678, 1);
                        class203.field2751.method200(!class449.field6111.method882((byte) 72, 82) ? 0 : 1, (byte) 127);
                        class203.field2751.method216(var7, -1);
                        class302.method1689(true, -2, var27.field1197[0], 0, var27.method545(false), var27.field1193[0], var27.method545(!arg2), 121, 0);
                    }
                }
                if (~var6 == -31 && class16.field231 == null) {
                    class9.method62(var5, 0, var4);
                    class16.field231 = class78.method519(var5, var4, (byte) -72);
                    class490.method2854(class16.field231, (byte) 44);
                }
                if (~var6 == -45) {
                    class487 var28 = class413.field5644[var7];
                    if (var28 != null) {
                        class175.field2392 = 0;
                        ++class16.field223;
                        class306.field4053 = arg3;
                        class369.field5063 = 2;
                        class171.field2349 = arg1;
                        class491.method2861(class445.field6058, 1);
                        class203.field2751.method228(class449.field6111.method882((byte) -107, 82) ? 1 : 0, 32);
                        class203.field2751.method224(var7, 0);
                        class302.method1689(true, -2, var28.field1197[0], 0, var28.method545(false), var28.field1193[0], var28.method545(false), 126, 0);
                    }
                }
                if (var6 == 3) {
                    class121 var29 = class221.field2941[var7];
                    if (var29 != null) {
                        class171.field2349 = arg1;
                        class306.field4053 = arg3;
                        class175.field2392 = 0;
                        ++class7.field86;
                        class369.field5063 = 2;
                        class491.method2861(class250.field3336, 1);
                        class203.field2751.method229(var7, 1309449544);
                        class203.field2751.method200(!class449.field6111.method882((byte) -111, 82) ? 0 : 1, (byte) 122);
                        class302.method1689(true, -2, var29.field1197[0], 0, var29.method545(false), var29.field1193[0], var29.method545(false), 120, 0);
                    }
                }
                if (class289.field3899) {
                    class78.method513(-1);
                }
                if (class3.field41 != null && ~class106.field1593 == -1) {
                    class490.method2854(class3.field41, (byte) 127);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IBI)V", line = 715)
    public final void method181(int arg0, byte arg1, int arg2) {
        ++field2937;
        if (arg1 != -103) {
            this.method180(113, 113, -84);
        }
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)V", line = 726)
    public static final void method1249(int arg0) {
        ++field2932;
        if (class111.field1688) {
            if (arg0 != -2) {
                field2940 = null;
            }
            while (true) {
                while (~class142.field2054 > ~class159.field2195.length) {
                    class348 var1 = class159.field2195[class142.field2054];
                    if (var1 != null && ~var1.field4789 == 0) {
                        if (class483.field6660 == null) {
                            class483.field6660 = class348.field4795.method2182(var1.field4791, (byte) 30);
                        }
                        int var2 = class483.field6660.field574;
                        if (var2 == -1) {
                            return;
                        }
                        class483.field6660 = null;
                        var1.field4789 = var2;
                        ++class142.field2054;
                    } else {
                        ++class142.field2054;
                    }
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "(III)V", line = 770)
    public static final void method1250(int arg0, int arg1, int arg2) {
        class491 var3 = class289.field3897[arg0][arg1][arg2];
        if (var3 != null) {
            if (var3.field6864 != null) {
                var3.field6864 = null;
            }
            if (var3.field6847 != null) {
                var3.field6847 = null;
            }
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(III)V", line = 784)
    public final void method180(int arg0, int arg1, int arg2) {
        ++field2936;
        int var4 = this.field2930 * arg2 >> 12;
        int var5 = this.field2935 * arg2 >> 12;
        int var6 = this.field2928 * arg1 >> 12;
        int var7 = this.field2929 * arg1 >> 12;
        class90.method578(var7, var5, var4, var6, super.field2999, (byte) -127);
        if (arg0 != 0) {
            field2934 = null;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)V", line = 804)
    public static void method1251(byte arg0) {
        int var1 = -22 % ((arg0 - -42) / 43);
        field2938 = null;
        field2940 = null;
        field2939 = null;
        field2934 = null;
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(IIIIII)V", line = 817)
    public class220(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field2928 = arg1;
        this.field2935 = arg2;
        this.field2930 = arg0;
        this.field2929 = arg3;
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(III)V", line = 837)
    public final void method178(int arg0, int arg1, int arg2) {
        if (arg0 <= 119) {
            method1250(4, 70, 92);
        }
        ++field2933;
    }
}
