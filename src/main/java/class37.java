import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class37 extends class96 {

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "[J")
    private long[] field706 = new long[10];

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "I")
    private int field712 = 1;

    @OriginalMember(owner = "client!dg", name = "t", descriptor = "I")
    private int field711 = 0;

    @OriginalMember(owner = "client!dg", name = "w", descriptor = "I")
    private int field714 = 256;

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "J")
    private long field707 = class52.method315((byte) 109);

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "Led;")
    public static class43 field705 = class191.method1219("Fehler bei der Verbindung zum Server)3", false);

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "Led;")
    private static class43 field708 = class191.method1219("shake:", false);

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "Led;")
    public static class43 field702 = field708;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "Led;")
    public static class43 field703 = field708;

    @OriginalMember(owner = "client!dg", name = "x", descriptor = "Led;")
    public static class43 field715 = class191.method1219("Keine Antwort vom Anmelde)2Server)3", false);

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "I")
    private int field710;

    @OriginalMember(owner = "client!dg", name = "v", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!dg", name = "y", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)I")
    public static final int method206(int arg0, int arg1) {
        if (arg1 >= -59) {
            field715 = null;
        }
        field704++;
        return arg0 >> 11 & 0x3F;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)I")
    public final int method50(int arg0, int arg1, int arg2) {
        field701++;
        int var4 = this.field714;
        if (arg2 < 5) {
            method207(false);
        }
        this.field714 = 300;
        int var5 = this.field712;
        this.field712 = 1;
        this.field707 = class52.method315((byte) -124);
        if (this.field706[this.field710] == 0L) {
            this.field714 = var4;
            this.field712 = var5;
        } else if (this.field706[this.field710] < this.field707) {
            this.field714 = (int) ((long) (arg0 * 2560) / (this.field707 - this.field706[this.field710]));
        }
        if (this.field714 < 25) {
            this.field714 = 25;
        }
        if (this.field714 > 256) {
            this.field714 = 256;
            this.field712 = (int) ((long) arg0 - (this.field707 - this.field706[this.field710]) / 10L);
        }
        if (arg0 < this.field712) {
            this.field712 = arg0;
        }
        this.field706[this.field710] = this.field707;
        this.field710 = (this.field710 + 1) % 10;
        if (this.field712 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field706[var6] != 0L) {
                    this.field706[var6] -= -((long) this.field712);
                }
            }
        }
        int var7 = 0;
        if (this.field712 < arg1) {
            this.field712 = arg1;
        }
        class38.method209((long) this.field712, -7296);
        while (this.field711 < 256) {
            var7++;
            this.field711 += this.field714;
        }
        this.field711 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V")
    public static void method207(boolean arg0) {
        if (arg0) {
            method207(true);
        }
        field703 = null;
        field702 = null;
        field705 = null;
        field708 = null;
        field715 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
    public final void method51(int arg0) {
        field713++;
        if (arg0 <= 88) {
            this.field712 = -8;
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field706[var2] = 0L;
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
    public class37() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field706[var1] = this.field707;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIII)V")
    public static final void method208(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class161.field3259 == 0 && !class174.field3464) {
            class149.method926(class110.field2127, class126.field2496, arg3 + 26723, arg1 - arg0, 40, 0, arg4 - arg2);
            class182.field3606++;
        }
        field716++;
        int var5 = -1;
        for (int var6 = 0; var6 < class199.field3908; var6++) {
            int var7 = class199.field3927[var6];
            int var8 = var7 >> 7 & 0x7F;
            int var9 = var7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && class137.field2842.method1125(class93.field1839, var9, var8, var7) >= 0) {
                    class23 var12 = class92.method592(var11, (byte) 71);
                    if (var12.field438 != null) {
                        var12 = var12.method111(-100);
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (class161.field3259 == 1) {
                        class64.field1311++;
                        class149.method926(class167.method1036(new class43[] { class193.field3740, class32.field593, var12.field394 }, true), class200.field3930, -11, var9, 20, var7, var8);
                    } else if (!class174.field3464) {
                        class73.field1417++;
                        class43[] var13 = var12.field411;
                        if (class54.field1092) {
                            var13 = class124.method803(var13, 5);
                        }
                        if (var13 != null) {
                            for (int var14 = 4; var14 >= 0; var14--) {
                                if (var13[var14] != null) {
                                    class28.field510++;
                                    short var15 = 0;
                                    if (var14 == 0) {
                                        var15 = 26;
                                    }
                                    if (var14 == 1) {
                                        var15 = 49;
                                    }
                                    if (var14 == 2) {
                                        var15 = 32;
                                    }
                                    if (var14 == 3) {
                                        var15 = 3;
                                    }
                                    if (var14 == 4) {
                                        var15 = 1007;
                                    }
                                    class149.method926(class167.method1036(new class43[] { class136.field2827, var12.field394 }, true), var13[var14], arg3 + 26950, var9, var15, var7, var8);
                                }
                            }
                        }
                        class149.method926(class167.method1036(new class43[] { class136.field2827, var12.field394 }, true), class124.field2455, -123, var9, 1001, var12.field435 << 14, var8);
                    } else if ((class27.field486 & 0x4) == 4) {
                        class149.method926(class167.method1036(new class43[] { class29.field534, class32.field593, var12.field394 }, true), class137.field2852, 3, var9, 1, var7, var8);
                        class150.field3033++;
                    }
                }
                if (var10 == 1) {
                    class77 var16 = class172.field3433[var11];
                    if (var16.field1539.field1219 == 1 && (var16.field2347 & 0x7F) == 64 && (var16.field2328 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < class95.field1864; var17++) {
                            class77 var20 = class172.field3433[class158.field3202[var17]];
                            if (var20 != null && var16 != var20 && var20.field1539.field1219 == 1 && var16.field2347 == var20.field2347 && var16.field2328 == var20.field2328) {
                                class163.method1018(class158.field3202[var17], var8, (byte) -128, var9, var20.field1539);
                            }
                        }
                        for (int var18 = 0; var18 < class170.field3399; var18++) {
                            class1 var19 = class12.field183[class125.field2472[var18]];
                            if (var19 != null && var16.field2347 == var19.field2347 && var16.field2328 == var19.field2328) {
                                class15.method65(var9, (byte) -76, var8, var19, class125.field2472[var18]);
                            }
                        }
                    }
                    class163.method1018(var11, var8, (byte) -128, var9, var16.field1539);
                }
                if (var10 == 0) {
                    class1 var21 = class12.field183[var11];
                    if ((var21.field2347 & 0x7F) == 64 && (var21.field2328 & 0x7F) == 64) {
                        for (int var22 = 0; var22 < class95.field1864; var22++) {
                            class77 var25 = class172.field3433[class158.field3202[var22]];
                            if (var25 != null && var25.field1539.field1219 == 1 && var21.field2347 == var25.field2347 && var21.field2328 == var25.field2328) {
                                class163.method1018(class158.field3202[var22], var8, (byte) -128, var9, var25.field1539);
                            }
                        }
                        for (int var23 = 0; var23 < class170.field3399; var23++) {
                            class1 var24 = class12.field183[class125.field2472[var23]];
                            if (var24 != null && var21 != var24 && var21.field2347 == var24.field2347 && var21.field2328 == var24.field2328) {
                                class15.method65(var9, (byte) -93, var8, var24, class125.field2472[var23]);
                            }
                        }
                    }
                    class15.method65(var9, (byte) -33, var8, var21, var11);
                }
                if (var10 == 3) {
                    class118 var26 = class46.field922[class93.field1839][var9][var8];
                    if (var26 != null) {
                        for (class207 var27 = (class207) var26.method749((byte) 126); var27 != null; var27 = (class207) var26.method747(arg3 + 26735)) {
                            class46 var28 = class2.method18(var27.field4040, 0);
                            if (class161.field3259 == 1) {
                                class13.field189++;
                                class149.method926(class167.method1036(new class43[] { class193.field3740, class68.field1369, var28.field905 }, true), class200.field3930, -21, var9, 24, var27.field4040, var8);
                            } else if (!class174.field3464) {
                                class184.field3629++;
                                class43[] var29 = var28.field937;
                                if (class54.field1092) {
                                    var29 = class124.method803(var29, 5);
                                }
                                for (int var30 = 4; var30 >= 0; var30--) {
                                    if (var29 != null && var29[var30] != null) {
                                        class115.field2246++;
                                        byte var31 = 0;
                                        if (var30 == 0) {
                                            var31 = 12;
                                        }
                                        if (var30 == 1) {
                                            var31 = 50;
                                        }
                                        if (var30 == 2) {
                                            var31 = 43;
                                        }
                                        if (var30 == 3) {
                                            var31 = 18;
                                        }
                                        if (var30 == 4) {
                                            var31 = 4;
                                        }
                                        class149.method926(class167.method1036(new class43[] { class50.field1002, var28.field905 }, true), var29[var30], 118, var9, var31, var27.field4040, var8);
                                    } else if (var30 == 2) {
                                        class117.field2280++;
                                        class149.method926(class167.method1036(new class43[] { class50.field1002, var28.field905 }, true), class67.field1350, 21, var9, 43, var27.field4040, var8);
                                    }
                                }
                                class149.method926(class167.method1036(new class43[] { class50.field1002, var28.field905 }, true), class124.field2455, 73, var9, 1005, var27.field4040, var8);
                            } else if ((class27.field486 & 0x1) == 1) {
                                class187.field3669++;
                                class149.method926(class167.method1036(new class43[] { class29.field534, class68.field1369, var28.field905 }, true), class137.field2852, -123, var9, 34, var27.field4040, var8);
                            }
                        }
                    }
                }
            }
        }
        if (arg3 != -26849) {
            method207(false);
        }
    }
}
