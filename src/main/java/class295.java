import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class295 extends Canvas {

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "Ljava/awt/Component;")
    private Component field4610;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "[I")
    public static int[] field4605 = new int[8];

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4609 = "wave:";

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "[I")
    public static int[] field4607 = new int[32];

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "[I")
    public static int[] field4613;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "[Lbi;")
    public static class91[] field4606;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "[[Lia;")
    public static class222[][] field4611;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V", line = 4)
    public static void method2090(int arg0) {
        field4607 = null;
        field4609 = null;
        field4605 = null;
        if (arg0 == 23040) {
            field4611 = (class222[][]) null;
            field4606 = null;
            field4613 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)V", line = 22)
    public static final void method2091(int arg0, int arg1) {
        field4612++;
        int var2 = class204.field2864;
        if (arg1 == 0) {
            var2 = 1;
        }
        if (arg0 != 27296) {
            return;
        }
        int var10002;
        for (int var3 = 0; var3 < var2; var3++) {
            class109 var4;
            if (arg1 == 0) {
                var4 = class118.field1664;
            } else {
                var4 = class328.field5009[class180.field2612[var3]];
            }
            if (var4 != null && var4.method744(8)) {
                int var5 = var4.method748(false);
                if (arg1 == 0 || arg1 == var5) {
                    if (var5 == 1) {
                        if ((var4.field2392 & 0x7F) == 64 && (var4.field2357 & 0x7F) == 64) {
                            int var6 = var4.field2392 >> 7;
                            int var7 = var4.field2357 >> 7;
                            if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                                var10002 = class17.field233[var6][var7]++;
                            }
                        }
                    } else if (((var5 & 0x1) != 0 || (var4.field2392 & 0x7F) == 0 && (var4.field2357 & 0x7F) == 0) && ((var5 & 0x1) != 1 || (var4.field2392 & 0x7F) == 64 && (var4.field2357 & 0x7F) == 64)) {
                        int var8 = var4.field2392 - var5 * 64 >> 7;
                        int var9 = var4.field2357 - (var5 * 64) >> 7;
                        int var10 = var8 + var4.method748(false);
                        int var11 = var9 + var4.method748(false);
                        if (var10 > 104) {
                            var10 = 104;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        if (var11 > 104) {
                            var11 = 104;
                        }
                        for (int var12 = var8; var12 < var10; var12++) {
                            for (int var13 = var9; var13 < var11; var13++) {
                                var10002 = class17.field233[var12][var13]++;
                            }
                        }
                    }
                }
            }
        }
        label225: for (int var14 = 0; var14 < var2; var14++) {
            long var15;
            class109 var17;
            if (arg1 == 0) {
                var15 = 8791798054912L;
                var17 = class118.field1664;
            } else {
                var15 = (long) class180.field2612[var14] << 32;
                var17 = class328.field5009[class180.field2612[var14]];
            }
            if (var17 != null && var17.method744(8)) {
                int var18 = var17.method748(false);
                if (arg1 == 0 || arg1 == var18) {
                    var17.field2383 = true;
                    var17.field1507 = false;
                    if ((class240.field3616 && class204.field2864 > 200 || class204.field2864 > 50) && arg1 != 0 && var17.field2376 == var17.method1102((byte) -104).field2737) {
                        var17.field1507 = true;
                    }
                    if (var18 == 1) {
                        if ((var17.field2392 & 0x7F) == 64 && (var17.field2357 & 0x7F) == 64) {
                            int var19 = var17.field2357 >> 7;
                            int var20 = var17.field2392 >> 7;
                            if (var20 < 0 || var20 >= 104 || var19 < 0 || var19 >= 104) {
                                continue;
                            }
                            if (class17.field233[var20][var19] > 1) {
                                var10002 = class17.field233[var20][var19]--;
                                continue;
                            }
                        }
                    } else if ((var18 & 0x1) == 0 && (var17.field2392 & 0x7F) == 0 && (var17.field2357 & 0x7F) == 0 || (var18 & 0x1) == 1 && (var17.field2392 & 0x7F) == 64 && (var17.field2357 & 0x7F) == 0) {
                        int var21 = var17.field2392 - var18 * 64 >> 7;
                        int var22 = var17.field2357 - (var18 * 64) >> 7;
                        int var23 = var18 + var21;
                        if (var21 < 0) {
                            var21 = 0;
                        }
                        if (var23 > 104) {
                            var23 = 104;
                        }
                        int var24 = var18 + var22;
                        if (var24 > 104) {
                            var24 = 104;
                        }
                        boolean var25 = true;
                        if (var22 < 0) {
                            var22 = 0;
                        }
                        for (int var26 = var21; var26 < var23; var26++) {
                            for (int var27 = var22; var27 < var24; var27++) {
                                if (class17.field233[var26][var27] <= 1) {
                                    var25 = false;
                                    break;
                                }
                            }
                        }
                        if (var25) {
                            int var28 = var21;
                            while (true) {
                                if (var23 <= var28) {
                                    continue label225;
                                }
                                for (int var29 = var22; var29 < var24; var29++) {
                                    var10002 = class17.field233[var28][var29]--;
                                }
                                var28++;
                            }
                        }
                    }
                    if (var17.field2430 == null || var17.field2381 > class38.field463 || var17.field2434 <= class38.field463) {
                        var17.field2383 = false;
                        var17.field2386 = class184.method1278(class138.field1940, -13660, var17.field2357, var17.field2392);
                        class93.method554(class138.field1940, var17.field2392, var17.field2357, var17.field2386, var18 * 64 + 60 - 64, var17, var17.field2368, var15, var17.field2441);
                    } else {
                        var17.field2383 = false;
                        var17.field1507 = false;
                        var17.field2386 = class184.method1278(class138.field1940, arg0 ^ 0xFFFFA004, var17.field2357, var17.field2392);
                        class73.method445(class138.field1940, var17.field2392, var17.field2357, var17.field2386, var17, var17.field2368, var15, var17.field2451, var17.field2390, var17.field2453, var17.field2429);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 285)
    public final void paint(Graphics arg0) {
        field4608++;
        this.field4610.paint(arg0);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BI)Z", line = 298)
    public static final boolean method2092(byte arg0, int arg1) {
        field4602++;
        class163 var2 = class293.method2087(arg1, (byte) -105);
        if (var2 == null) {
            return false;
        } else if (class265.field4178 == 1 || class265.field4178 == 2 || class5.field83 == 2) {
            class320.field4916 = var2.field2249;
            class109.field1500 = var2.field2254;
            if (class5.field83 != 0) {
                class307.field4746 = class109.field1500 + 50000;
                class15.field200 = class109.field1500 + 40000;
                class152.field2095 = class15.field200;
            }
            return true;
        } else {
            if (arg0 != -69) {
                method2090(12);
            }
            String var3 = "";
            String var4 = "";
            if (class5.field83 != 0) {
                var3 = ":" + (var2.field2254 + 7000);
            }
            if (class230.field3363 != null) {
                var4 = "/p=" + class230.field3363;
            }
            String var5 = "http://" + var2.field2249 + var3 + "/l=" + class172.field2484 + "/a=" + class244.field3667 + var4 + "/j" + (class89.field1119 ? "1" : "0") + ",o" + (class330.field5043 ? "1" : "0") + ",a2,m" + (class175.field2511 ? "1" : "0");
            try {
                class90.field1132.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var7) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 355)
    public class295(Component arg0) {
        this.field4610 = arg0;
    }

    @OriginalMember(owner = "client!ee", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 368)
    public final void update(Graphics arg0) {
        field4603++;
        this.field4610.update(arg0);
    }
}
