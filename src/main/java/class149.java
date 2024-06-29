import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class149 extends class46 {

    @OriginalMember(owner = "client!vc", name = "Y", descriptor = "Lsc;")
    private static class128 field3427 = class129.method1017(false, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!vc", name = "W", descriptor = "I")
    public static int field3425 = 0;

    @OriginalMember(owner = "client!vc", name = "cb", descriptor = "I")
    public static int field3431 = 0;

    @OriginalMember(owner = "client!vc", name = "db", descriptor = "Lsc;")
    public static class128 field3432 = field3427;

    @OriginalMember(owner = "client!vc", name = "fb", descriptor = "[I")
    public static int[] field3434 = new int[99];

    @OriginalMember(owner = "client!vc", name = "hb", descriptor = "Lsc;")
    public static class128 field3436;

    @OriginalMember(owner = "client!vc", name = "jb", descriptor = "Lsc;")
    public static class128 field3438;

    @OriginalMember(owner = "client!vc", name = "ib", descriptor = "[[B")
    public static byte[][] field3437;

    @OriginalMember(owner = "client!vc", name = "lb", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!vc", name = "X", descriptor = "I")
    public int field3426;

    @OriginalMember(owner = "client!vc", name = "Z", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!vc", name = "ab", descriptor = "I")
    public int field3429;

    @OriginalMember(owner = "client!vc", name = "bb", descriptor = "I")
    public int field3430;

    @OriginalMember(owner = "client!vc", name = "eb", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!vc", name = "gb", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!vc", name = "kb", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!vc", name = "mb", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!vc", name = "nb", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
    public static void method1187(int arg0) {
        field3438 = null;
        field3432 = null;
        field3434 = null;
        field3437 = null;
        if (arg0 != 5555) {
            field3442 = 108;
        }
        field3427 = null;
        field3436 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BLmc;)V")
    public final void method1188(byte arg0, class86 arg1) {
        field3428++;
        if (arg0 != 77) {
            field3425 = -42;
        }
        while (true) {
            int var3 = arg1.method646(-15447);
            if (var3 == 0) {
                return;
            }
            this.method1191(arg1, 1, var3);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILsf;Lsc;Lsc;)Li;")
    public static final class56 method1189(int arg0, class131 arg1, class128 arg2, class128 arg3) {
        field3435++;
        int var4 = arg1.method1036(arg3, (byte) -103);
        if (arg0 == 6858) {
            int var5 = arg1.method1031(var4, arg2, (byte) -106);
            return class113.method864(true, var5, var4, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIII)V")
    public static final void method1190(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3439++;
        class138.method1125(arg1, arg3, arg1 + arg4, arg3 - -arg2);
        class114.method879();
        class58.field1251++;
        class11.method90(true, 1643);
        class42.method302((byte) 113, true);
        class11.method90(false, 1643);
        class42.method302((byte) 77, false);
        class117.method898(-30040);
        class54.method412(false);
        if (!class132.field3053) {
            int var5 = class94.field2184 + class108.field2457 & 0x7FF;
            int var6 = class82.field1813;
            if (var6 < class2.field30 / 256) {
                var6 = class2.field30 / 256;
            }
            if (class79.field1781[4] && var6 < class29.field557[4] + 128) {
                var6 = class29.field557[4] + 128;
            }
            class18.method162(class97.method755(class151.field3473.field987, class29.field553, class151.field3473.field975, 256) - 50, 97, var6 * 3 + 600, var5, var6, class113.field2543, class82.field1819);
        }
        int var7 = 65 % ((25 - arg0) / 49);
        int var8;
        if (class132.field3053) {
            var8 = class64.method475(true);
        } else {
            var8 = class137.method1123(-79);
        }
        int var9 = class65.field1430;
        int var10 = class1.field2;
        int var11 = class147.field3410;
        int var12 = class1.field10;
        int var13 = class156.field3589;
        for (int var14 = 0; var14 < 5; var14++) {
            if (class79.field1781[var14]) {
                int var17 = (int) ((double) (class93.field2118[var14] * 2 + 1) * Math.random() + Math.sin((double) class159.field3653[var14] / 100.0D * (double) class23.field459[var14]) * (double) class29.field557[var14] - (double) class93.field2118[var14]);
                if (var14 == 0) {
                    class147.field3410 += var17;
                }
                if (var14 == 3) {
                    class1.field10 = class1.field10 + var17 & 0x7FF;
                }
                if (var14 == 1) {
                    class65.field1430 += var17;
                }
                if (var14 == 2) {
                    class1.field2 += var17;
                }
                if (var14 == 4) {
                    class156.field3589 += var17;
                    if (class156.field3589 < 128) {
                        class156.field3589 = 128;
                    }
                    if (class156.field3589 > 383) {
                        class156.field3589 = 383;
                    }
                }
            }
        }
        int var15 = class64.field1380;
        int var16 = class18.field330;
        if (arg1 <= var15 && var15 < arg1 + arg4 && arg3 <= var16 && arg2 + arg3 > var16) {
            class78.field1731 = true;
            class78.field1735 = class18.field330 - arg3;
            class78.field1740 = 0;
            class78.field1721 = class64.field1380 - arg1;
        } else {
            class78.field1740 = 0;
            class78.field1731 = false;
        }
        class7.method31((byte) 0);
        class138.method1136(arg1, arg3, arg4, arg2, 0);
        class7.method31((byte) 0);
        class154.field3553.method113(class147.field3410, class65.field1430, class1.field2, class156.field3589, class1.field10, var8);
        class7.method31((byte) 0);
        class154.field3553.method138();
        class55.method429(arg2, arg1, arg4, arg3, 123);
        class150.method1197(20, arg1, arg3);
        ((class115) class114.field2560).method889(class155.field3570, -74);
        class18.method161(arg1, arg4, 19179, arg3, arg2);
        class156.field3589 = var13;
        class147.field3410 = var11;
        class65.field1430 = var9;
        class1.field10 = var12;
        class1.field2 = var10;
        if (class93.field2119 && class19.method166(true, false, 86) == 0) {
            class93.field2119 = false;
        }
        if (class93.field2119) {
            class138.method1136(arg1, arg3, arg4, arg2, 0);
            class63.method468(false, class27.field526, (byte) 64);
        }
        if (!class93.field2119 && !class135.field3180 && arg1 <= var15 && arg1 + arg4 > var15 && arg3 <= var16 && var16 < arg2 + arg3) {
            class79.method597(arg3, arg1, false, var15, var16);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lmc;II)V")
    private final void method1191(class86 arg0, int arg1, int arg2) {
        field3433++;
        if (arg1 == arg2) {
            this.field3430 = arg0.method632((byte) -80);
            this.field3429 = arg0.method646(-15447);
            this.field3426 = arg0.method646(-15447);
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field3434[var1] = var0 / 4;
        }
        field3436 = class129.method1017(false, "Welt");
        field3438 = class129.method1017(false, "null");
        field3437 = new byte[250][];
        field3440 = 255;
    }
}
