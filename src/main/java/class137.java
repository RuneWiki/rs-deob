import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class137 extends class28 {

    @OriginalMember(owner = "client!te", name = "V", descriptor = "I")
    public int field3147 = 0;

    @OriginalMember(owner = "client!te", name = "nb", descriptor = "Lja;")
    public class62 field3165 = class138.field3220;

    @OriginalMember(owner = "client!te", name = "hb", descriptor = "Lja;")
    private static class62 field3159 = class30.method243(43, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!te", name = "jb", descriptor = "Lja;")
    public static class62 field3161 = class30.method243(43, "null");

    @OriginalMember(owner = "client!te", name = "mb", descriptor = "I")
    public static int field3164 = -1;

    @OriginalMember(owner = "client!te", name = "rb", descriptor = "Lja;")
    public static class62 field3169 = class30.method243(43, ")1p");

    @OriginalMember(owner = "client!te", name = "Y", descriptor = "Lja;")
    public static class62 field3150 = class30.method243(43, "Neuer Benutzer");

    @OriginalMember(owner = "client!te", name = "ob", descriptor = "I")
    public static int field3166 = -1;

    @OriginalMember(owner = "client!te", name = "fb", descriptor = "Lja;")
    public static class62 field3157 = field3159;

    @OriginalMember(owner = "client!te", name = "W", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!te", name = "X", descriptor = "I")
    public int field3149;

    @OriginalMember(owner = "client!te", name = "Z", descriptor = "I")
    public int field3151;

    @OriginalMember(owner = "client!te", name = "ab", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!te", name = "bb", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!te", name = "cb", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!te", name = "db", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!te", name = "eb", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!te", name = "gb", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!te", name = "kb", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!te", name = "pb", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!te", name = "qb", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!te", name = "tb", descriptor = "I")
    public int field3171;

    @OriginalMember(owner = "client!te", name = "lb", descriptor = "[I")
    public int[] field3163;

    @OriginalMember(owner = "client!te", name = "sb", descriptor = "[I")
    public int[] field3170;

    @OriginalMember(owner = "client!te", name = "ib", descriptor = "[Lja;")
    public class62[] field3160;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(I)V")
    public static void method1095(int arg0) {
        if (arg0 != 1820774599) {
            method1096(-65, -59, 35, 27, 27);
        }
        field3157 = null;
        field3150 = null;
        field3161 = null;
        field3169 = null;
        field3159 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIII)V")
    public static final void method1096(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3167++;
        if (class68.field1692 == arg2 && !class90.field2145) {
            class135.method1079((byte) -113, class83.field1991, class108.field2472, arg0 - arg4, 0, arg3 - arg1, 31);
            class77.field1898++;
        }
        int var5 = -1;
        for (int var6 = 0; var6 < class145.field3416; var6++) {
            int var7 = class145.field3409[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && class119.field2703.method546(class155.field3598, var8, var9, var7) >= 0) {
                    class65 var12 = class84.method653(arg2 ^ 0x6, var11);
                    if (var12.field1594 != null) {
                        var12 = var12.method505(arg2 - 1);
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (class68.field1692 == 1) {
                        class135.method1079((byte) -113, class70.method594(new class62[] { class60.field1459, class141.field3309, var12.field1608 }, 1229), class35.field827, var9, var7, var8, 38);
                        class79.field1911++;
                    } else if (!class90.field2145) {
                        class148.field3500++;
                        class62[] var13 = var12.field1609;
                        if (class116.field2674) {
                            var13 = class34.method266((byte) -81, var13);
                        }
                        if (var13 != null) {
                            for (int var14 = 4; var14 >= 0; var14--) {
                                if (var13[var14] != null) {
                                    short var15 = 0;
                                    if (var14 == 0) {
                                        var15 = 46;
                                    }
                                    field3155++;
                                    if (var14 == 1) {
                                        var15 = 2;
                                    }
                                    if (var14 == 2) {
                                        var15 = 11;
                                    }
                                    if (var14 == 3) {
                                        var15 = 58;
                                    }
                                    if (var14 == 4) {
                                        var15 = 1001;
                                    }
                                    class135.method1079((byte) -113, class70.method594(new class62[] { class1.field12, var12.field1608 }, 1229), var13[var14], var9, var7, var8, var15);
                                }
                            }
                        }
                        class135.method1079((byte) -113, class70.method594(new class62[] { class1.field12, var12.field1608 }, 1229), class39.field906, var9, var12.field1617 << 14, var8, 1006);
                    } else if ((class52.field1201 & 0x4) == 4) {
                        class143.field3333++;
                        class135.method1079((byte) -113, class70.method594(new class62[] { class27.field678, class141.field3309, var12.field1608 }, 1229), class124.field2835, var9, var7, var8, 12);
                    }
                }
                if (var10 == 1) {
                    class130 var16 = class136.field3127[var11];
                    if (var16.field2966.field3178 == 1 && (var16.field136 & 0x7F) == 64 && (var16.field134 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < class83.field2001; var17++) {
                            class130 var20 = class136.field3127[class36.field871[var17]];
                            if (var20 != null && var16 != var20 && var20.field2966.field3178 == 1 && var16.field136 == var20.field136 && var16.field134 == var20.field134) {
                                class20.method150(class36.field871[var17], (byte) -128, var9, var20.field2966, var8);
                            }
                        }
                        for (int var18 = 0; var18 < class147.field3460; var18++) {
                            class115 var19 = class52.field1200[class141.field3311[var18]];
                            if (var19 != null && var16.field136 == var19.field136 && var16.field134 == var19.field134) {
                                class4.method14(var9, (byte) -110, class141.field3311[var18], var19, var8);
                            }
                        }
                    }
                    class20.method150(var11, (byte) -116, var9, var16.field2966, var8);
                }
                if (var10 == 0) {
                    class115 var21 = class52.field1200[var11];
                    if ((var21.field136 & 0x7F) == 64 && (var21.field134 & 0x7F) == 64) {
                        for (int var22 = 0; var22 < class83.field2001; var22++) {
                            class130 var25 = class136.field3127[class36.field871[var22]];
                            if (var25 != null && var25.field2966.field3178 == 1 && var21.field136 == var25.field136 && var21.field134 == var25.field134) {
                                class20.method150(class36.field871[var22], (byte) -69, var9, var25.field2966, var8);
                            }
                        }
                        for (int var23 = 0; var23 < class147.field3460; var23++) {
                            class115 var24 = class52.field1200[class141.field3311[var23]];
                            if (var24 != null && var21 != var24 && var21.field136 == var24.field136 && var21.field134 == var24.field134) {
                                class4.method14(var9, (byte) -110, class141.field3311[var23], var24, var8);
                            }
                        }
                    }
                    class4.method14(var9, (byte) -60, var11, var21, var8);
                }
                if (var10 == 3) {
                    class105 var26 = class32.field765[class155.field3598][var8][var9];
                    if (var26 != null) {
                        for (class146 var27 = (class146) var26.method846((byte) -91); var27 != null; var27 = (class146) var26.method839((byte) -128)) {
                            class23 var28 = class140.method1114(var27.field3441, false);
                            if (class68.field1692 == 1) {
                                class135.method1079((byte) -113, class70.method594(new class62[] { class60.field1459, class36.field864, var28.field571 }, arg2 + 1229), class35.field827, var9, var27.field3441, var8, 16);
                                class121.field2777++;
                            } else if (!class90.field2145) {
                                class53.field1213++;
                                class62[] var29 = var28.field552;
                                if (class116.field2674) {
                                    var29 = class34.method266((byte) -50, var29);
                                }
                                for (int var30 = 4; var30 >= 0; var30--) {
                                    if (var29 != null && var29[var30] != null) {
                                        class86.field2066++;
                                        byte var31 = 0;
                                        if (var30 == 0) {
                                            var31 = 45;
                                        }
                                        if (var30 == 1) {
                                            var31 = 49;
                                        }
                                        if (var30 == 2) {
                                            var31 = 7;
                                        }
                                        if (var30 == 3) {
                                            var31 = 6;
                                        }
                                        if (var30 == 4) {
                                            var31 = 35;
                                        }
                                        class135.method1079((byte) -113, class70.method594(new class62[] { class124.field2833, var28.field571 }, 1229), var29[var30], var9, var27.field3441, var8, var31);
                                    } else if (var30 == 2) {
                                        class35.field829++;
                                        class135.method1079((byte) -113, class70.method594(new class62[] { class124.field2833, var28.field571 }, 1229), class35.field849, var9, var27.field3441, var8, 7);
                                    }
                                }
                                class135.method1079((byte) -113, class70.method594(new class62[] { class124.field2833, var28.field571 }, 1229), class39.field906, var9, var27.field3441, var8, 1002);
                            } else if ((class52.field1201 & 0x1) == 1) {
                                class135.method1079((byte) -113, class70.method594(new class62[] { class27.field678, class36.field864, var28.field571 }, 1229), class124.field2835, var9, var27.field3441, var8, 39);
                                class115.field2659++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Ls;I)V")
    public final void method1097(class128 arg0, int arg1) {
        if (arg1 != -26895) {
            return;
        }
        field3162++;
        while (true) {
            int var3 = arg0.method1025(255);
            if (var3 == 0) {
                return;
            }
            this.method1098(arg0, (byte) 50, var3);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Ls;BI)V")
    private final void method1098(class128 arg0, byte arg1, int arg2) {
        field3158++;
        if (arg1 != 50) {
            method1100(21);
        }
        if (arg2 == 1) {
            this.field3171 = arg0.method1025(255);
        } else if (arg2 == 2) {
            this.field3149 = arg0.method1025(255);
        } else if (arg2 == 3) {
            this.field3165 = arg0.method1015((byte) -79);
        } else if (arg2 == 4) {
            this.field3151 = arg0.method1037(18834);
        } else if (arg2 == 5) {
            this.field3147 = arg0.method1041(212464720);
            this.field3170 = new int[this.field3147];
            this.field3160 = new class62[this.field3147];
            for (int var4 = 0; var4 < this.field3147; var4++) {
                this.field3170[var4] = arg0.method1037(18834);
                this.field3160[var4] = arg0.method1015((byte) -118);
            }
            return;
        } else if (arg2 == 6) {
            this.field3147 = arg0.method1041(212464720);
            this.field3163 = new int[this.field3147];
            this.field3170 = new int[this.field3147];
            for (int var5 = 0; var5 < this.field3147; var5++) {
                this.field3170[var5] = arg0.method1037(arg1 + 18784);
                this.field3163[var5] = arg0.method1037(arg1 + 18784);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!te", name = "f", descriptor = "(I)[Lic;")
    public static final class58[] method1099(int arg0) {
        field3153++;
        class58[] var1 = new class58[class56.field1380];
        for (int var2 = 0; var2 < class56.field1380; var2++) {
            class58 var4 = var1[var2] = new class58();
            var4.field1434 = class10.field256;
            var4.field1437 = class16.field377;
            var4.field1435 = class57.field1397[var2];
            var4.field1431 = class143.field3335[var2];
            var4.field1433 = class23.field539[var2];
            var4.field1436 = class17.field395[var2];
            byte[] var5 = class82.field1986[var2];
            int var6 = var4.field1436 * var4.field1433;
            var4.field1432 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                var4.field1432[var7] = class136.field3146[class24.method192(255, var5[var7])];
            }
        }
        class142.method1125(2157);
        int var3 = -123 % ((arg0 + 79) / 40);
        return var1;
    }

    @OriginalMember(owner = "client!te", name = "g", descriptor = "(I)V")
    public static final void method1100(int arg0) {
        if (arg0 != 1) {
            field3164 = 123;
        }
        for (class81 var1 = (class81) class16.field372.method531(101); var1 != null; var1 = (class81) class16.field372.method536(98)) {
            int var2 = var1.field1963;
            if (class29.method241(var2, -1)) {
                boolean var3 = true;
                class54[] var4 = class131.field2990[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field1322;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field3493;
                    class54 var7 = class62.method456(var6, (byte) 108);
                    if (var7 != null) {
                        client.method163(var7, -103);
                    }
                }
            }
        }
        field3148++;
    }
}
