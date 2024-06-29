import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class144 {

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "B")
    private byte field2638;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public int field2633;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public int field2627;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
    public int field2643;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public int field2632;

    @OriginalMember(owner = "client!qj", name = "v", descriptor = "I")
    public int field2648;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "Loh;")
    public static class263 field2630 = class253.method1681(-128, "welle2:");

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "Loh;")
    public static class263 field2631 = class253.method1681(-126, "Angreifen");

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "Loh;")
    private static class263 field2635 = class253.method1681(-125, "skill: ");

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "Loh;")
    private static class263 field2629 = class253.method1681(-120, "purple:");

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "Loh;")
    public static class263 field2636 = field2635;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "Loh;")
    public static class263 field2642 = field2629;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "Loh;")
    public static class263 field2639 = field2629;

    @OriginalMember(owner = "client!qj", name = "u", descriptor = "Loh;")
    public static class263 field2647 = class253.method1681(-121, "Versteckt");

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "Loh;")
    private static class263 field2637 = class253.method1681(-119, "Connected to update server");

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "Loh;")
    public static class263 field2645 = field2637;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "[[[B")
    public static byte[][][] field2641;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)I")
    public final int method951(int arg0) {
        if (arg0 >= -117) {
            return -110;
        } else {
            field2646++;
            return (this.field2638 & 0x8) == 8 ? 1 : 0;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V")
    public static void method952(byte arg0) {
        field2630 = null;
        field2636 = null;
        field2647 = null;
        field2645 = null;
        field2635 = null;
        if (arg0 != 95) {
            method955(-59, -73, -105, (byte) -59);
        }
        field2637 = null;
        field2629 = null;
        field2639 = null;
        field2641 = null;
        field2642 = null;
        field2631 = null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ZB)V")
    public static final void method953(boolean arg0, byte arg1) {
        class265.field4635 = arg0;
        field2634++;
        if (class265.field4635) {
            int var2 = class189.field3394.method1273(0);
            int var3 = class189.field3394.method1282(false);
            int var4 = class189.field3394.method1326(arg1 ^ 0xFFFFAB6E);
            class189.field3394.method1511(Integer.MAX_VALUE);
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var22 = 0; var22 < 13; var22++) {
                    for (int var23 = 0; var23 < 13; var23++) {
                        int var24 = class189.field3394.method1512(1, 126);
                        if (var24 == 1) {
                            class259.field4495[var5][var22][var23] = class189.field3394.method1512(26, 126);
                        } else {
                            class259.field4495[var5][var22][var23] = -1;
                        }
                    }
                }
            }
            class189.field3394.method1513(arg1 ^ 0x26);
            int var6 = (class36.field826 - class189.field3394.field3497) / 16;
            class248.field4333 = new int[var6][4];
            for (int var7 = 0; var7 < var6; var7++) {
                for (int var21 = 0; var21 < 4; var21++) {
                    class248.field4333[var7][var21] = class189.field3394.method1266(4);
                }
            }
            int var8 = class189.field3394.method1282(false);
            int var9 = class189.field3394.method1326(-21737);
            class205.field3733 = new int[var6];
            class128.field2370 = new int[var6];
            class51.field1104 = new int[var6];
            class146.field2679 = null;
            class164.field2975 = new int[var6];
            class143.field2621 = new int[var6];
            class195.field3543 = null;
            class78.field1587 = new byte[var6][];
            class233.field4077 = new byte[var6][];
            int var10 = 0;
            for (int var11 = 0; var11 < 4; var11++) {
                for (int var12 = 0; var12 < 13; var12++) {
                    for (int var13 = 0; var13 < 13; var13++) {
                        int var14 = class259.field4495[var11][var12][var13];
                        if (var14 != -1) {
                            int var15 = var14 >> 3 & 0x7FF;
                            int var16 = (var14 & 0xFFFFBF) >> 14;
                            int var17 = (var16 / 8 << 8) + (var15 / 8);
                            for (int var18 = 0; var18 < var10; var18++) {
                                if (class128.field2370[var18] == var17) {
                                    var17 = -1;
                                    break;
                                }
                            }
                            if (var17 != -1) {
                                class128.field2370[var10] = var17;
                                int var19 = var17 >> 8 & 0xFF;
                                int var20 = var17 & 0xFF;
                                class51.field1104[var10] = class190.field3413.method573(arg1 - 122, class124.method797(class38.method239(arg1, -49), new class263[] { class229.field4021, class136.method891(class38.method239(arg1, -60), var19), class188.field3388, class136.method891(-50, var20) }));
                                class205.field3733[var10] = class190.field3413.method573(-1, class124.method797(-120, new class263[] { class89.field1773, class136.method891(-73, var19), class188.field3388, class136.method891(-122, var20) }));
                                class143.field2621[var10] = class190.field3413.method573(arg1 - 122, class124.method797(-97, new class263[] { class21.field602, class136.method891(class38.method239(arg1, -21), var19), class188.field3388, class136.method891(-98, var20) }));
                                class164.field2975[var10] = class190.field3413.method573(-1, class124.method797(-82, new class263[] { class127.field2354, class136.method891(arg1 - 249, var19), class188.field3388, class136.method891(-71, var20) }));
                                var10++;
                            }
                        }
                    }
                }
            }
            class1.method9(var9, var3, var8, var2, var4, (byte) -120, false);
        } else {
            int var25 = class189.field3394.method1295(-1);
            int var26 = class189.field3394.method1295(-1);
            int var27 = (class36.field826 - class189.field3394.field3497) / 16;
            class248.field4333 = new int[var27][4];
            for (int var28 = 0; var28 < var27; var28++) {
                for (int var37 = 0; var37 < 4; var37++) {
                    class248.field4333[var28][var37] = class189.field3394.method1266(4);
                }
            }
            int var29 = class189.field3394.method1273(0);
            boolean var30 = false;
            int var31 = class189.field3394.method1326(arg1 ^ 0xFFFFAB6E);
            int var32 = class189.field3394.method1295(-1);
            class164.field2975 = new int[var27];
            class128.field2370 = new int[var27];
            class146.field2679 = null;
            class51.field1104 = new int[var27];
            class78.field1587 = new byte[var27][];
            class205.field3733 = new int[var27];
            class233.field4077 = new byte[var27][];
            class143.field2621 = new int[var27];
            class195.field3543 = null;
            if (((var31 / 8) == 48 || var31 / 8 == 49) && (var25 / 8) == 48) {
                var30 = true;
            }
            if (var31 / 8 == 48 && (var25 / 8) == 148) {
                var30 = true;
            }
            int var33 = 0;
            for (int var34 = (var31 - 6) / 8; var34 <= (var31 + 6) / 8; var34++) {
                for (int var35 = (var25 - 6) / 8; var35 <= (var25 + 6) / 8; var35++) {
                    int var36 = (var34 << 8) + var35;
                    if (var30 && var35 == 49 || var35 == 149 || var35 == 147 || var34 == 50 || !(var34 != 49 || var35 != 47)) {
                        class128.field2370[var33] = var36;
                        class51.field1104[var33] = -1;
                        class205.field3733[var33] = -1;
                        class143.field2621[var33] = -1;
                        class164.field2975[var33] = -1;
                    } else {
                        class128.field2370[var33] = var36;
                        class51.field1104[var33] = class190.field3413.method573(arg1 - 122, class124.method797(-59, new class263[] { class229.field4021, class136.method891(arg1 + -190, var34), class188.field3388, class136.method891(-94, var35) }));
                        class205.field3733[var33] = class190.field3413.method573(class38.method239(arg1, -122), class124.method797(-70, new class263[] { class89.field1773, class136.method891(-101, var34), class188.field3388, class136.method891(-54, var35) }));
                        class143.field2621[var33] = class190.field3413.method573(class38.method239(arg1, -122), class124.method797(-52, new class263[] { class21.field602, class136.method891(-96, var34), class188.field3388, class136.method891(class38.method239(arg1, -45), var35) }));
                        class164.field2975[var33] = class190.field3413.method573(-1, class124.method797(-50, new class263[] { class127.field2354, class136.method891(class38.method239(arg1, -71), var34), class188.field3388, class136.method891(-109, var35) }));
                    }
                    var33++;
                }
            }
            class1.method9(var26, var25, var32, var29, var31, (byte) -37, false);
        }
        if (arg1 != 121) {
            method953(true, (byte) 122);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)I")
    public final int method954(boolean arg0) {
        if (!arg0) {
            this.field2648 = 22;
        }
        field2644++;
        return this.field2638 & 0x7;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIB)V")
    public static final void method955(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 >= -100) {
            field2629 = null;
        }
        field2640++;
        class21 var4 = class64.method394(arg2, -1943367162, arg1);
        if (var4 != null && var4.field610 != null) {
            class116 var5 = new class116();
            var5.field2173 = var4.field610;
            var5.field2166 = var4;
            class182.method1211(var5, 121);
        }
        class114.field2144 = arg2;
        class5.field108 = arg0;
        class130.field2387 = true;
        class5.field100 = arg1;
        class220.method1508(var4, (byte) -119);
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V")
    public class144() {
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lsi;)V")
    public class144(class194 arg0) {
        this.field2638 = arg0.method1281((byte) -37);
        this.field2633 = arg0.method1294((byte) 3);
        this.field2627 = arg0.method1266(4);
        this.field2643 = arg0.method1266(4);
        this.field2632 = arg0.method1266(4);
        this.field2648 = arg0.method1266(4);
    }
}
