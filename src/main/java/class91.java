import java.awt.Graphics;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class91 extends class17 {

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "Lke;")
    public static class65 field2400 = class1.method17("overlay_multiway", -121);

    @OriginalMember(owner = "client!pb", name = "K", descriptor = "I")
    public static int field2408 = 0;

    @OriginalMember(owner = "client!pb", name = "N", descriptor = "Lke;")
    private static class65 field2411 = class1.method17("Enter name of friend to delete from list", -117);

    @OriginalMember(owner = "client!pb", name = "P", descriptor = "Lke;")
    public static class65 field2413 = field2411;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2396 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!pb", name = "T", descriptor = "Lke;")
    public static class65 field2417 = class1.method17("headicons_hint", -121);

    @OriginalMember(owner = "client!pb", name = "U", descriptor = "I")
    public static int field2418 = 0;

    @OriginalMember(owner = "client!pb", name = "X", descriptor = "I")
    public static int field2421 = 0;

    @OriginalMember(owner = "client!pb", name = "Y", descriptor = "Lke;")
    private static class65 field2422 = class1.method17("Please wait 1 minute and try again)3", -120);

    @OriginalMember(owner = "client!pb", name = "V", descriptor = "Lke;")
    public static class65 field2419 = field2422;

    @OriginalMember(owner = "client!pb", name = "S", descriptor = "Lke;")
    public static class65 field2416 = field2422;

    @OriginalMember(owner = "client!pb", name = "R", descriptor = "Lke;")
    public static class65 field2415 = field2422;

    @OriginalMember(owner = "client!pb", name = "W", descriptor = "Lrc;")
    public static class104 field2420 = new class104(32);

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "I")
    public int field2405;

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!pb", name = "L", descriptor = "I")
    public int field2409;

    @OriginalMember(owner = "client!pb", name = "Q", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!pb", name = "O", descriptor = "Lld;")
    public static class70 field2412;

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "[I")
    public int[] field2399;

    @OriginalMember(owner = "client!pb", name = "J", descriptor = "[I")
    public int[] field2407;

    @OriginalMember(owner = "client!pb", name = "M", descriptor = "[I")
    public int[] field2410;

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "[Lf;")
    public class34[] field2402;

    @OriginalMember(owner = "client!pb", name = "G", descriptor = "[Lf;")
    public class34[] field2404;

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "[[[B")
    public byte[][][] field2398;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IBLjd;)Luc;", line = 3)
    public static final class119 method795(int arg0, byte arg1, class58 arg2) {
        field2403++;
        if (class102.method848((byte) 119, arg2, arg0)) {
            return arg1 >= -45 ? null : class23.method182((byte) -84);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(B)V", line = 20)
    public static final void method796(byte arg0) {
        field2414++;
        if (arg0 != -29) {
            return;
        }
        int var1 = -1;
        if (client.field382 == 0 && class101.field2635 == 0) {
            class58.field1557++;
            class97.method812(field2418, class29.field766, -125, class100.field2591, 20, 0, class52.field1320);
        }
        for (int var2 = 0; var2 < class37.field933; var2++) {
            int var3 = class37.field961[var2];
            int var4 = var3 & 0x7F;
            int var5 = var3 >> 7 & 0x7F;
            int var6 = var3 >> 14 & 0x7FFF;
            int var7 = var3 >> 29 & 0x3;
            if (var1 != var3) {
                var1 = var3;
                if (var7 == 2 && class89.field2377.method608(class19.field462, var4, var5, var3) >= 0) {
                    class19 var8 = class54.method435(arg0 ^ 0xFFFF8214, var6);
                    if (var8.field439 != null) {
                        var8 = var8.method162((byte) -96);
                    }
                    if (var8 == null) {
                        continue;
                    }
                    if (client.field382 == 1) {
                        class97.method812(var4, class88.field2351, -118, class21.method172(-121, new class65[] { class101.field2634, class98.field2524, var8.field470 }), 30, var3, var5);
                        class94.field2485++;
                    } else if (class101.field2635 != 1) {
                        class57.field1508++;
                        class65[] var9 = var8.field440;
                        if (class33.field849) {
                            var9 = class13.method75(5, var9);
                        }
                        if (var9 != null) {
                            for (int var10 = 4; var10 >= 0; var10--) {
                                if (var9[var10] != null) {
                                    class72.field1886++;
                                    short var11 = 0;
                                    if (var10 == 0) {
                                        var11 = 18;
                                    }
                                    if (var10 == 1) {
                                        var11 = 33;
                                    }
                                    if (var10 == 2) {
                                        var11 = 47;
                                    }
                                    if (var10 == 3) {
                                        var11 = 51;
                                    }
                                    if (var10 == 4) {
                                        var11 = 1003;
                                    }
                                    class97.method812(var4, var9[var10], -127, class21.method172(-124, new class65[] { class117.field2935, var8.field470 }), var11, var3, var5);
                                }
                            }
                        }
                        class97.method812(var4, class128.field3088, -124, class21.method172(-50, new class65[] { class117.field2935, var8.field470 }), 1006, var8.field459 << 14, var5);
                    } else if ((class46.field1213 & 0x4) == 4) {
                        class6.field120++;
                        class97.method812(var4, class28.field749, arg0 - 90, class21.method172(arg0 + -85, new class65[] { class51.field1286, class98.field2524, var8.field470 }), 11, var3, var5);
                    }
                }
                if (var7 == 1) {
                    class129 var12 = class31.field817[var6];
                    if (var12.field3126.field1406 == 1 && (var12.field1067 & 0x7F) == 64 && (var12.field1070 & 0x7F) == 64) {
                        for (int var13 = 0; var13 < class113.field2818; var13++) {
                            class129 var16 = class31.field817[class56.field1464[var13]];
                            if (var16 != null && var12 != var16 && var16.field3126.field1406 == 1 && var12.field1067 == var16.field1067 && var12.field1070 == var16.field1070) {
                                class48.method400(var16.field3126, var5, var4, class56.field1464[var13], (byte) -21);
                            }
                        }
                        for (int var14 = 0; var14 < class72.field1895; var14++) {
                            class114 var15 = class52.field1324[class10.field187[var14]];
                            if (var15 != null && var12.field1067 == var15.field1067 && var12.field1070 == var15.field1070) {
                                class81.method709(-98, var4, class10.field187[var14], var5, var15);
                            }
                        }
                    }
                    class48.method400(var12.field3126, var5, var4, var6, (byte) -21);
                }
                if (var7 == 0) {
                    class114 var17 = class52.field1324[var6];
                    if ((var17.field1067 & 0x7F) == 64 && (var17.field1070 & 0x7F) == 64) {
                        for (int var18 = 0; var18 < class113.field2818; var18++) {
                            class129 var21 = class31.field817[class56.field1464[var18]];
                            if (var21 != null && var21.field3126.field1406 == 1 && var17.field1067 == var21.field1067 && var17.field1070 == var21.field1070) {
                                class48.method400(var21.field3126, var5, var4, class56.field1464[var18], (byte) -21);
                            }
                        }
                        for (int var19 = 0; var19 < class72.field1895; var19++) {
                            class114 var20 = class52.field1324[class10.field187[var19]];
                            if (var20 != null && var17 != var20 && var17.field1067 == var20.field1067 && var17.field1070 == var20.field1070) {
                                class81.method709(arg0 ^ 0xFFFFFF92, var4, class10.field187[var19], var5, var20);
                            }
                        }
                    }
                    class81.method709(77, var4, var6, var5, var17);
                }
                if (var7 == 3) {
                    class53 var22 = class64.field1691[class19.field462][var4][var5];
                    if (var22 != null) {
                        for (class93 var23 = (class93) var22.method426((byte) -103); var23 != null; var23 = (class93) var22.method415(arg0 ^ 0xFFFFFF88)) {
                            class57 var24 = class81.method715(false, var23.field2451);
                            if (client.field382 == 1) {
                                class78.field2091++;
                                class97.method812(var4, class88.field2351, arg0 - 92, class21.method172(-64, new class65[] { class101.field2634, class114.field2873, var24.field1482 }), 28, var23.field2451, var5);
                            } else if (class101.field2635 != 1) {
                                class39.field978++;
                                class65[] var25 = var24.field1477;
                                if (class33.field849) {
                                    var25 = class13.method75(5, var25);
                                }
                                for (int var26 = 4; var26 >= 0; var26--) {
                                    if (var25 != null && var25[var26] != null) {
                                        class6.field111++;
                                        byte var27 = 0;
                                        if (var26 == 0) {
                                            var27 = 1;
                                        }
                                        if (var26 == 1) {
                                            var27 = 39;
                                        }
                                        if (var26 == 2) {
                                            var27 = 14;
                                        }
                                        if (var26 == 3) {
                                            var27 = 43;
                                        }
                                        if (var26 == 4) {
                                            var27 = 7;
                                        }
                                        class97.method812(var4, var25[var26], -127, class21.method172(-75, new class65[] { class58.field1586, var24.field1482 }), var27, var23.field2451, var5);
                                    } else if (var26 == 2) {
                                        field2401++;
                                        class97.method812(var4, class52.field1335, arg0 ^ 0x66, class21.method172(-110, new class65[] { class58.field1586, var24.field1482 }), 14, var23.field2451, var5);
                                    }
                                }
                                class97.method812(var4, class128.field3088, arg0 ^ 0x63, class21.method172(-78, new class65[] { class58.field1586, var24.field1482 }), 1002, var23.field2451, var5);
                            } else if ((class46.field1213 & 0x1) == 1) {
                                class86.field2263++;
                                class97.method812(var4, class28.field749, -118, class21.method172(-91, new class65[] { class51.field1286, class114.field2873, var24.field1482 }), 50, var23.field2451, var5);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "(B)V", line = 319)
    public static final void method797(byte arg0) {
        field2406++;
        try {
            Graphics var1 = class10.field210.getGraphics();
            class113.field2828.method790(0, 4, var1, 119);
            class130.field3159.method790(0, 357, var1, 121);
            class60.field1619.method790(722, 4, var1, 110);
            class9.field149.method790(743, 205, var1, -36);
            class88.field2357.method790(0, 0, var1, -110);
            class52.field1322.method790(516, 4, var1, -118);
            class35.field887.method790(516, 205, var1, 118);
            if (arg0 < -79) {
                class3.field68.method790(496, 357, var1, -90);
                class64.field1672.method790(0, 338, var1, -57);
            }
        } catch (Exception var2) {
            class10.field210.repaint();
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V", line = 386)
    public static void method798(boolean arg0) {
        field2396 = null;
        field2419 = null;
        field2422 = null;
        field2420 = null;
        field2417 = null;
        field2412 = null;
        field2413 = null;
        if (!arg0) {
            method795(81, (byte) -45, null);
        }
        field2415 = null;
        field2416 = null;
        field2400 = null;
        field2411 = null;
    }
}
