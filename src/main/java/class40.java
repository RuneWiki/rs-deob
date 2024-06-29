import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class40 extends Canvas {

    @OriginalMember(owner = "client!df", name = "c", descriptor = "Ljava/awt/Component;")
    private Component field753;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "[I")
    public static int[] field759 = new int[128];

    @OriginalMember(owner = "client!df", name = "n", descriptor = "Z")
    public static boolean field764 = false;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "Ldj;")
    public static class44 field762 = class89.method650(255, "Null");

    @OriginalMember(owner = "client!df", name = "k", descriptor = "[I")
    public static int[] field761 = new int[4000];

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field756 = 2301979;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "Ldj;")
    public static class44 field758 = class89.method650(255, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "Lve;")
    public static class225 field751;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "Lve;")
    public static class225 field757;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public static void method277(int arg0) {
        field751 = null;
        field762 = null;
        field757 = null;
        field759 = null;
        if (arg0 == -29455) {
            field758 = null;
            field761 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIB)I")
    public static final int method278(int arg0, int arg1, int arg2, byte arg3) {
        field754++;
        if (arg3 != 101) {
            field757 = null;
        }
        int var4 = arg0 >> 7;
        int var5 = arg2 >> 7;
        if (var5 < 0 || var4 < 0 || var5 > 103 || var4 > 103) {
            return 0;
        }
        int var6 = arg1;
        int var7 = arg2 & 0x7F;
        if (arg1 < 3 && (class47.field875[1][var5][var4] & 0x2) == 2) {
            var6 = arg1 + 1;
        }
        int var8 = arg0 & 0x7F;
        int var9 = (128 - var7) * class211.field3771[var6][var5][var4] + class211.field3771[var6][var5 + 1][var4] * var7 >> 7;
        int var10 = (128 - var7) * class211.field3771[var6][var5][var4 + 1] + class211.field3771[var6][var5 + 1][var4 + 1] * var7 >> 7;
        return (128 - var8) * var9 + var8 * var10 >> 7;
    }

    @OriginalMember(owner = "client!df", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field753.update(arg0);
        field752++;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class40(Component arg0) {
        this.field753 = arg0;
    }

    @OriginalMember(owner = "client!df", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field763++;
        this.field753.paint(arg0);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BII)V")
    public static final void method279(byte arg0, int arg1, int arg2) {
        field760++;
        class190 var3 = client.field599[class194.field3403][arg1][arg2];
        if (var3 == null) {
            class104.method762(class194.field3403, arg1, arg2);
            return;
        }
        if (arg0 != -98) {
            method282(19, -34, null, -83, 18);
        }
        int var4 = -99999999;
        class136 var5 = (class136) var3.method1189(0);
        class136 var6 = null;
        while (var5 != null) {
            class214 var13 = class192.method1227(-31700, var5.field2440.field3712);
            int var14 = var13.field3849;
            if (var13.field3853 == 1) {
                var14 = (var5.field2440.field3704 + 1) * var14;
            }
            if (var14 > var4) {
                var6 = var5;
                var4 = var14;
            }
            var5 = (class136) var3.method1192((byte) -94);
        }
        if (var6 == null) {
            class104.method762(class194.field3403, arg1, arg2);
            return;
        }
        var3.method1186(var6, 125);
        class136 var7 = (class136) var3.method1189(arg0 + 98);
        class207 var8 = null;
        class207 var9 = null;
        while (var7 != null) {
            class207 var12 = var7.field2440;
            if (var6.field2440.field3712 != var12.field3712) {
                if (var8 == null) {
                    var8 = var12;
                }
                if (var8.field3712 != var12.field3712 && var9 == null) {
                    var9 = var12;
                }
            }
            var7 = (class136) var3.method1192((byte) -100);
        }
        long var10 = (long) ((arg2 << 7) + arg1 + 1610612736);
        class75.method583(class194.field3403, arg1, arg2, method278(arg2 * 128 + 64, class194.field3403, arg1 * 128 + 64, (byte) 101), var6.field2440, var10, var8, var9);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
    public static final void method280(byte arg0) {
        while (true) {
            if (class218.field3957.method1169(true, class88.field1680) >= 11) {
                int var1 = class218.field3957.method1173(127, 11);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class122.field2168[var1] == null) {
                        class122.field2168[var1] = new class24();
                        if (class128.field2276[var1] != null) {
                            class122.field2168[var1].method173((byte) 25, class128.field2276[var1]);
                        }
                        var2 = true;
                    }
                    class45.field858[class90.field1702++] = var1;
                    class24 var3 = class122.field2168[var1];
                    var3.field2248 = class46.field868;
                    int var4 = class218.field3957.method1173(127, 1);
                    int var5 = class218.field3957.method1173(arg0 + 96, 1);
                    if (var5 == 1) {
                        class143.field2533[class27.field490++] = var1;
                    }
                    int var6 = class218.field3957.method1173(127, 5);
                    int var7 = class81.field1582[class218.field3957.method1173(arg0 ^ 0x60, 3)];
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    if (var2) {
                        var3.field2211 = var3.field2224 = var7;
                    }
                    int var8 = class218.field3957.method1173(arg0 ^ 0x60, 5);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.method854(class96.field1774.field2240[0] + var8, class96.field1774.field2235[0] + var6, (byte) -37, var4 == 1);
                    continue;
                }
            }
            if (arg0 != 31) {
                field758 = null;
            }
            class218.field3957.method1166((byte) 9);
            field766++;
            return;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZI)Lde;")
    public static final class39 method281(boolean arg0, int arg1) {
        field765++;
        class39 var2 = (class39) class82.field1602.method1178((long) arg1, 14176);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class67.field1278.method1466(class79.method605((byte) -17, arg1), class58.method444(arg0, arg1), (byte) -125);
        class39 var4 = new class39();
        var4.field733 = arg1;
        if (var3 != null) {
            var4.method276(64, new class66(var3));
        }
        var4.method267(0);
        if (!arg0) {
            return null;
        }
        if (var4.field712) {
            var4.field724 = false;
            var4.field706 = 0;
        }
        if (!class20.field341 && var4.field686) {
            var4.field695 = null;
        }
        class82.field1602.method1183((byte) 126, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IILvc;II)V")
    public static final void method282(int arg0, int arg1, class223 arg2, int arg3, int arg4) {
        if (arg0 != -1958521625) {
            method278(73, 18, -72, (byte) 9);
        }
        field767++;
        class74.method581((byte) -122);
        class99.method707(arg4, arg3, arg4 + arg2.field4130, arg2.field4134 + arg3);
        if (class115.field2057 == 2 || class115.field2057 == 5) {
            class99.method699(arg4, arg3, 0, arg2.field4090, arg2.field4106);
        } else {
            int var5 = class96.field1774.field2260 / 32 + 48;
            int var6 = class73.field1384 + class129.field2303 & 0x7FF;
            int var7 = 464 - class96.field1774.field2195 / 32;
            class193.field3388.method1008(arg4, arg3, arg2.field4130, arg2.field4134, var5, var7, var6, class218.field3959 + 256, arg2.field4090, arg2.field4106);
            for (int var8 = 0; var8 < class210.field3748; var8++) {
                int var41 = class73.field1396[var8] * 4 + 2 - class96.field1774.field2260 / 32;
                int var42 = class175.field3038[var8] * 4 + 2 - class96.field1774.field2195 / 32;
                class39 var43 = method281(true, class62.field1160[var8]);
                if (var43.field737 != null) {
                    var43 = var43.method274(103);
                    if (var43 == null || var43.field696 == -1) {
                        continue;
                    }
                }
                class114.method802(arg4, class153.field2660[var43.field696], var42, arg2, true, arg3, var41);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var37 = 0; var37 < 104; var37++) {
                    class190 var38 = client.field599[class194.field3403][var9][var37];
                    if (var38 != null) {
                        int var39 = var37 * 4 + 2 - class96.field1774.field2195 / 32;
                        int var40 = var9 * 4 + 2 - class96.field1774.field2260 / 32;
                        class114.method802(arg4, class234.field4359[0], var39, arg2, true, arg3, var40);
                    }
                }
            }
            for (int var10 = 0; var10 < class158.field2755; var10++) {
                class121 var33 = class170.field2960[class158.field2751[var10]];
                if (var33 != null && var33.method171(2047)) {
                    class202 var34 = var33.field2156;
                    if (var34 != null && var34.field3589 != null) {
                        var34 = var34.method1306(arg0 + 1958521625);
                    }
                    if (var34 != null && var34.field3604 && var34.field3610) {
                        int var35 = var33.field2260 / 32 - class96.field1774.field2260 / 32;
                        int var36 = var33.field2195 / 32 - class96.field1774.field2195 / 32;
                        class114.method802(arg4, class234.field4359[1], var36, arg2, true, arg3, var35);
                    }
                }
            }
            for (int var11 = 0; var11 < class90.field1702; var11++) {
                class24 var25 = class122.field2168[class45.field858[var11]];
                if (var25 != null && var25.method171(2047)) {
                    int var26 = var25.field2260 / 32 - class96.field1774.field2260 / 32;
                    int var27 = var25.field2195 / 32 - class96.field1774.field2195 / 32;
                    boolean var28 = false;
                    long var29 = var25.field395.method306(-58);
                    for (int var31 = 0; var31 < class117.field2085; var31++) {
                        if (class166.field2848[var31] == var29 && class37.field657[var31] != 0) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var32 = false;
                    if (class96.field1774.field403 != 0 && var25.field403 != 0 && class96.field1774.field403 == var25.field403) {
                        var32 = true;
                    }
                    if (var28) {
                        class114.method802(arg4, class234.field4359[3], var27, arg2, true, arg3, var26);
                    } else if (var32) {
                        class114.method802(arg4, class234.field4359[4], var27, arg2, true, arg3, var26);
                    } else {
                        class114.method802(arg4, class234.field4359[2], var27, arg2, true, arg3, var26);
                    }
                }
            }
            int var12 = 0;
            class97[] var13 = class61.field1132;
            while (var13.length > var12) {
                class97 var16 = var13[var12];
                if (var16 != null && var16.field1795 != 0 && class46.field868 % 20 < 10) {
                    if (var16.field1795 == 1 && var16.field1797 >= 0 && class170.field2960.length > var16.field1797) {
                        class121 var17 = class170.field2960[var16.field1797];
                        if (var17 != null) {
                            int var18 = var17.field2260 / 32 - class96.field1774.field2260 / 32;
                            int var19 = var17.field2195 / 32 - class96.field1774.field2195 / 32;
                            class77.method588(arg4, arg2, var16.field1787, var19, (byte) 119, arg3, var18);
                        }
                    }
                    if (var16.field1795 == 2) {
                        int var20 = (var16.field1798 - class222.field4020) * 4 + 2 - class96.field1774.field2260 / 32;
                        int var21 = (var16.field1790 - class143.field2550) * 4 + 2 - class96.field1774.field2195 / 32;
                        class77.method588(arg4, arg2, var16.field1787, var21, (byte) 116, arg3, var20);
                    }
                    if (var16.field1795 == 10 && var16.field1797 >= 0 && class122.field2168.length > var16.field1797) {
                        class24 var22 = class122.field2168[var16.field1797];
                        if (var22 != null) {
                            int var23 = var22.field2260 / 32 - class96.field1774.field2260 / 32;
                            int var24 = var22.field2195 / 32 - class96.field1774.field2195 / 32;
                            class77.method588(arg4, arg2, var16.field1787, var24, (byte) 31, arg3, var23);
                        }
                    }
                }
                var12++;
            }
            if (class198.field3511 != 0) {
                int var14 = class198.field3511 * 4 + 2 - class96.field1774.field2260 / 32;
                int var15 = class38.field668 * 4 + 2 - class96.field1774.field2195 / 32;
                class114.method802(arg4, class196.field3465, var15, arg2, true, arg3, var14);
            }
            class99.method688(arg2.field4130 / 2 + arg4 - 1, arg3 + -1 - -(arg2.field4134 / 2), 3, 3, 16777215);
        }
        class187.field3219[arg1] = true;
    }
}
