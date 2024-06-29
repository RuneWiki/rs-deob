import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class113 {

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    public static int field1729 = 0;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field1723 = 0;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "Ljava/lang/String;")
    public static String field1735 = "wishes to trade with you.";

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public int field1724;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public int field1725;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public int field1726;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public int field1727;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    public int field1728;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "I")
    public int field1731;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "I")
    public int field1734;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "Ljava/lang/String;")
    public static String field1737;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "[B")
    public byte[] field1721;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "[B")
    public byte[] field1736;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)V")
    public static void method813(boolean arg0) {
        field1737 = null;
        if (arg0) {
            field1735 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "()V")
    public static final void method814() {
        class54.field899 = 0;
        label191: for (int var0 = 0; var0 < class259.field3971; var0++) {
            class30 var1 = class130.field1920[var0];
            if (class55.field932 != null) {
                for (int var2 = 0; var2 < class55.field932.length; var2++) {
                    if (class55.field932[var2] != -1000000 && (var1.field547 <= class55.field932[var2] || var1.field563 <= class55.field932[var2]) && (var1.field543 <= class101.field1474[var2] || var1.field560 <= class101.field1474[var2]) && (var1.field543 >= class6.field73[var2] || var1.field560 >= class6.field73[var2]) && (var1.field549 <= class182.field2651[var2] || var1.field545 <= class182.field2651[var2]) && (var1.field549 >= class75.field1199[var2] || var1.field545 >= class75.field1199[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field562 == 1) {
                int var3 = var1.field557 + class121.field1807 - class197.field2977;
                if (var3 >= 0 && var3 <= class121.field1807 + class121.field1807) {
                    int var4 = var1.field546 + class121.field1807 - class3.field47;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field553 + class121.field1807 - class3.field47;
                    if (var5 > class121.field1807 + class121.field1807) {
                        var5 = class121.field1807 + class121.field1807;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class71.field1168[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class251.field3892 - var1.field543;
                        if (var7 > 32) {
                            var1.field558 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field558 = 2;
                            var7 = -var7;
                        }
                        var1.field544 = (var1.field549 - class135.field1979 << 8) / var7;
                        var1.field554 = (var1.field545 - class135.field1979 << 8) / var7;
                        var1.field555 = (var1.field547 - class127.field1863 << 8) / var7;
                        var1.field550 = (var1.field563 - class127.field1863 << 8) / var7;
                        class106.field1567[class54.field899++] = var1;
                    }
                }
            } else if (var1.field562 == 2) {
                int var8 = var1.field546 + class121.field1807 - class3.field47;
                if (var8 >= 0 && var8 <= class121.field1807 + class121.field1807) {
                    int var9 = var1.field557 + class121.field1807 - class197.field2977;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field541 + class121.field1807 - class197.field2977;
                    if (var10 > class121.field1807 + class121.field1807) {
                        var10 = class121.field1807 + class121.field1807;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class71.field1168[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class135.field1979 - var1.field549;
                        if (var12 > 32) {
                            var1.field558 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field558 = 4;
                            var12 = -var12;
                        }
                        var1.field548 = (var1.field543 - class251.field3892 << 8) / var12;
                        var1.field556 = (var1.field560 - class251.field3892 << 8) / var12;
                        var1.field555 = (var1.field547 - class127.field1863 << 8) / var12;
                        var1.field550 = (var1.field563 - class127.field1863 << 8) / var12;
                        class106.field1567[class54.field899++] = var1;
                    }
                }
            } else if (var1.field562 == 4) {
                int var13 = var1.field547 - class127.field1863;
                if (var13 > 128) {
                    int var14 = var1.field546 + class121.field1807 - class3.field47;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field553 + class121.field1807 - class3.field47;
                    if (var15 > class121.field1807 + class121.field1807) {
                        var15 = class121.field1807 + class121.field1807;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field557 + class121.field1807 - class197.field2977;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field541 + class121.field1807 - class197.field2977;
                        if (var17 > class121.field1807 + class121.field1807) {
                            var17 = class121.field1807 + class121.field1807;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class71.field1168[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field558 = 5;
                            var1.field548 = (var1.field543 - class251.field3892 << 8) / var13;
                            var1.field556 = (var1.field560 - class251.field3892 << 8) / var13;
                            var1.field544 = (var1.field549 - class135.field1979 << 8) / var13;
                            var1.field554 = (var1.field545 - class135.field1979 << 8) / var13;
                            class106.field1567[class54.field899++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
    public static final void method815(byte arg0) {
        class174.field2551.method940(arg0 ^ 0xFFFFFF8B);
        if (arg0 == -30) {
            field1722++;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIII)V")
    public static final void method816(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1720++;
        int var5 = arg2;
        class222.method1519((byte) -127, arg0 - arg3, class241.field3751[arg1], arg0 + arg3, arg4);
        int var6 = arg3;
        int var7 = -1;
        int var8 = -arg3;
        while (var5 < var6) {
            var5++;
            var7 += 2;
            var8 += var7;
            if (var8 >= 0) {
                var6--;
                var8 -= var6 << 1;
                int[] var9 = class241.field3751[arg1 + var6];
                int var10 = arg0 + var5;
                int var11 = arg0 - var5;
                int[] var12 = class241.field3751[arg1 - var6];
                class222.method1519((byte) -116, var11, var9, var10, arg4);
                class222.method1519((byte) -117, var11, var12, var10, arg4);
            }
            int var13 = arg0 + var6;
            int[] var14 = class241.field3751[arg1 + var5];
            int[] var15 = class241.field3751[arg1 - var5];
            int var16 = arg0 - var6;
            class222.method1519((byte) -124, var16, var14, var13, arg4);
            class222.method1519((byte) -112, var16, var15, var13, arg4);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
    public static final void method817(int arg0) {
        class284.field4354 = null;
        class73.field1189 = null;
        class264.field4130 = null;
        class265.field4136 = null;
        class197.field2978 = null;
        field1730++;
        class167.field2460 = null;
        if (arg0 != -24416) {
            field1723 = -106;
        }
        class51.field834 = null;
        class225.field3516 = null;
        class58.field957 = null;
        class186.field2719 = null;
        class175.field2555 = null;
        class191.field2899 = null;
    }
}
