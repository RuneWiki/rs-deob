import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class111 extends Canvas {

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "Ljava/awt/Component;")
    private Component field1702;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "[I")
    public static int[] field1708 = new int[2048];

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "[[B")
    public static byte[][] field1709;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "[[[Lke;")
    public static class116[][][] field1711;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)I")
    public static final int method775(int arg0, int arg1) {
        if (arg0 > -30) {
            field1711 = null;
        }
        field1712++;
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lrg;B)V")
    public static final void method776(class248 arg0, byte arg1) {
        if (arg1 != 25) {
            field1709 = null;
        }
        if (class311.field5032 == arg0.field3915) {
            class259.field4249[arg0.field3996] = true;
        }
        field1714++;
    }

    @OriginalMember(owner = "client!jj", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field1704++;
        this.field1702.paint(arg0);
    }

    @OriginalMember(owner = "client!jj", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field1715++;
        this.field1702.update(arg0);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
    public static final void method777(byte arg0) {
        class254.field4199.method1876((byte) 123);
        if (arg0 < -3) {
            field1703++;
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)I")
    public static final int method778(int arg0, int arg1) {
        if (arg0 != 12972) {
            field1706 = 25;
        }
        field1707++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)Lua;")
    public static final class122 method779(int arg0, int arg1, int arg2) {
        class116 var3 = class307.field4991[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class122 var4 = var3.field1765;
            var3.field1765 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BI)V")
    public static final void method780(byte arg0, int arg1) {
        field1705++;
        int var2 = class134.field2172;
        if (arg1 == 0) {
            var2 = 1;
        }
        int var10002;
        for (int var3 = 0; var3 < var2; var3++) {
            class12 var20;
            if (arg1 == 0) {
                var20 = class217.field3408;
            } else {
                var20 = class28.field494[field1708[var3]];
            }
            if (var20 != null && var20.method104(-32447)) {
                int var21 = var20.method101(false);
                if (arg1 == 0 || arg1 == var21) {
                    if (var21 == 1) {
                        if ((var20.field994 & 0x7F) == 64 && (var20.field929 & 0x7F) == 64) {
                            int var28 = var20.field994 >> 7;
                            int var29 = var20.field929 >> 7;
                            if (var28 >= 0 && var28 < 104 && var29 >= 0 && var29 < 104) {
                                var10002 = class144.field2319[var28][var29]++;
                            }
                        }
                    } else if (((var21 & 0x1) != 0 || (var20.field994 & 0x7F) == 0 && (var20.field929 & 0x7F) == 0) && ((var21 & 0x1) != 1 || (var20.field994 & 0x7F) == 64 && (var20.field929 & 0x7F) == 64)) {
                        int var22 = var20.field994 - (var21 * 64) >> 7;
                        int var23 = var20.field929 - var21 * 64 >> 7;
                        int var24 = var22 + var20.method101(false);
                        if (var24 > 104) {
                            var24 = 104;
                        }
                        int var25 = var20.method101(false) + var23;
                        if (var23 < 0) {
                            var23 = 0;
                        }
                        if (var25 > 104) {
                            var25 = 104;
                        }
                        if (var22 < 0) {
                            var22 = 0;
                        }
                        for (int var26 = var22; var26 < var24; var26++) {
                            for (int var27 = var23; var27 < var25; var27++) {
                                var10002 = class144.field2319[var26][var27]++;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 >= -113) {
            return;
        }
        label217: for (int var4 = 0; var4 < var2; var4++) {
            class12 var5;
            long var6;
            if (arg1 == 0) {
                var5 = class217.field3408;
                var6 = 8791798054912L;
            } else {
                var5 = class28.field494[field1708[var4]];
                var6 = (long) field1708[var4] << 32;
            }
            if (var5 != null && var5.method104(-32447)) {
                int var8 = var5.method101(false);
                if (arg1 == 0 || arg1 == var8) {
                    var5.field223 = false;
                    var5.field958 = true;
                    if ((class101.field1586 && class134.field2172 > 200 || class134.field2172 > 50) && arg1 != 0 && var5.field947 == var5.method403((byte) 120).field4180) {
                        var5.field223 = true;
                    }
                    if (var8 == 1) {
                        if ((var5.field994 & 0x7F) == 64 && (var5.field929 & 0x7F) == 64) {
                            int var18 = var5.field994 >> 7;
                            int var19 = var5.field929 >> 7;
                            if (var18 < 0 || var18 >= 104 || var19 < 0 || var19 >= 104) {
                                continue;
                            }
                            if (class144.field2319[var18][var19] > 1) {
                                var10002 = class144.field2319[var18][var19]--;
                                continue;
                            }
                        }
                    } else if ((var8 & 0x1) == 0 && (var5.field994 & 0x7F) == 0 && (var5.field929 & 0x7F) == 0 || (var8 & 0x1) == 1 && (var5.field994 & 0x7F) == 64 && (var5.field929 & 0x7F) == 0) {
                        int var9 = var5.field994 - var8 * 64 >> 7;
                        int var10 = var5.field929 - (var8 * 64) >> 7;
                        int var11 = var8 + var10;
                        int var12 = var9 + var8;
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        if (var12 > 104) {
                            var12 = 104;
                        }
                        if (var11 > 104) {
                            var11 = 104;
                        }
                        boolean var13 = true;
                        for (int var14 = var9; var14 < var12; var14++) {
                            for (int var17 = var10; var17 < var11; var17++) {
                                if (class144.field2319[var14][var17] <= 1) {
                                    var13 = false;
                                    break;
                                }
                            }
                        }
                        if (var13) {
                            int var15 = var9;
                            while (true) {
                                if (var12 <= var15) {
                                    continue label217;
                                }
                                for (int var16 = var10; var16 < var11; var16++) {
                                    var10002 = class144.field2319[var15][var16]--;
                                }
                                var15++;
                            }
                        }
                    }
                    if (var5.field910 == null || class274.field4472 < var5.field938 || var5.field922 <= class274.field4472) {
                        var5.field958 = false;
                        var5.field964 = class60.method387(-18796, var5.field929, var5.field994, class214.field3389);
                        class137.method949(class214.field3389, var5.field994, var5.field929, var5.field964, (var8 - 1) * 64 + 60, var5, var5.field954, var6, var5.field948);
                    } else {
                        var5.field958 = false;
                        var5.field223 = false;
                        var5.field964 = class60.method387(-18796, var5.field929, var5.field994, class214.field3389);
                        class290.method1998(class214.field3389, var5.field994, var5.field929, var5.field964, var5, var5.field954, var6, var5.field923, var5.field944, var5.field924, var5.field939);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class111(Component arg0) {
        this.field1702 = arg0;
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(II)I")
    public static final int method781(int arg0, int arg1) {
        field1713++;
        int var2 = arg0 * 6 - 61440;
        int var3 = (arg0 * arg0 >> 12) * arg0 >> 12;
        if (arg1 == -502337972) {
            int var4 = (arg0 * var2 >> 12) + 40960;
            return var3 * var4 >> 12;
        } else {
            return -38;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public static void method782(int arg0) {
        field1709 = null;
        field1711 = null;
        field1708 = null;
        if (arg0 != 1) {
            method776((class248) null, (byte) -49);
        }
    }
}
