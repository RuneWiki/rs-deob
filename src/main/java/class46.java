import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class46 {

    @OriginalMember(owner = "client!di", name = "n", descriptor = "Lma;")
    private static class5 field706 = class12.method119(" from your ignore list first)3", (byte) 82);

    @OriginalMember(owner = "client!di", name = "o", descriptor = "I")
    public static int field707 = 128;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "Lma;")
    public static class5 field714 = field706;

    @OriginalMember(owner = "client!di", name = "y", descriptor = "Lma;")
    public static class5 field717 = class12.method119("p12_full", (byte) 91);

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public int field694;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public int field696;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    public int field705;

    @OriginalMember(owner = "client!di", name = "q", descriptor = "I")
    public int field709;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!di", name = "s", descriptor = "I")
    public int field711;

    @OriginalMember(owner = "client!di", name = "t", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!di", name = "w", descriptor = "I")
    public int field715;

    @OriginalMember(owner = "client!di", name = "x", descriptor = "I")
    public int field716;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "Lni;")
    public static class202 field703;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "Lvg;")
    public static class23 field704;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "[B")
    public byte[] field708;

    @OriginalMember(owner = "client!di", name = "u", descriptor = "[B")
    public byte[] field713;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)V", line = 6)
    public static final void method343(int arg0, int arg1) {
        field697++;
        class255 var2 = (class255) class300.field5062.method1372(false, (long) arg0);
        int var3 = 84 / ((-arg1 - 40) / 59);
        if (var2 != null) {
            for (int var4 = 0; var4 < var2.field4355.length; var4++) {
                var2.field4355[var4] = -1;
                var2.field4360[var4] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIZ)V", line = 41)
    public static final void method344(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field700++;
        int var5 = 0;
        if (arg4) {
            return;
        }
        while (class188.field2947 > var5) {
            if ((class218.field3510[var5] + class177.field2701[var5]) > arg3 && arg2 + arg3 > class218.field3510[var5] && (class14.field257[var5] + class102.field1523[var5]) > arg1 && (arg0 + arg1) > class14.field257[var5]) {
                class52.field822[var5] = true;
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V", line = 67)
    public static final void method345(int arg0) {
        int var1 = class249.field4126 >> 7;
        class24.field416 &= 0x7FF;
        field701++;
        if (arg0 >= -102) {
            field693 = -101;
        }
        int var2 = class280.field4748 >> 7;
        if (field707 < 128) {
            field707 = 128;
        }
        if (field707 > 383) {
            field707 = 383;
        }
        int var3 = 0;
        int var4 = class20.method161(class280.field4748, class249.field4126, 1, class276.field4701);
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class276.field4701;
                    if (var7 < 3 && (class18.field321[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var4 - class208.field3304[var7][var5][var6];
                    if (var8 > var3) {
                        var3 = var8;
                    }
                }
            }
        }
        int var9 = var3 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class230.field3826 < var9) {
            class230.field3826 += (var9 - class230.field3826) / 24;
        } else if (class230.field3826 > var9) {
            class230.field3826 += (var9 - class230.field3826) / 80;
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)V", line = 140)
    public static void method346(int arg0) {
        field706 = null;
        field704 = null;
        field703 = null;
        if (arg0 >= -66) {
            field706 = (class5) null;
        }
        field714 = null;
        field717 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V", line = 160)
    public static final void method347(byte arg0) {
        if (arg0 <= 53) {
            return;
        }
        class224.method1589();
        field712++;
        class101.field1508 = new class25[7];
        class101.field1508[1] = new class203();
        class101.field1508[2] = new class28();
        class101.field1508[3] = new class3();
        class101.field1508[4] = new class95();
        class101.field1508[5] = new class84();
        class101.field1508[6] = new class132();
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILni;Lni;II)Ljf;", line = 179)
    public static final class82 method348(int arg0, class202 arg1, class202 arg2, int arg3, int arg4) {
        field702++;
        if (class180.method1171(arg4, arg3, arg1, (byte) -128)) {
            int var5 = -50 % ((arg0 + 74) / 40);
            return class188.method1233(arg2.method1342(97, arg4, arg3), (byte) 111);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(III)V", line = 193)
    public static final void method349(int arg0, int arg1, int arg2) {
        class101.field1516 = true;
        class11.field168 = arg0;
        class201.field3188 = arg1;
        class241.field4020 = arg2;
        class242.field4026 = -1;
        class182.field2772 = -1;
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(I)V", line = 206)
    public static final void method350(int arg0) {
        field698++;
        class255.field4354 = class21.field364;
        class237.method1676(false, 0);
        class193.method1267((byte) -66);
        class176.method1151(arg0 - 2826, class255.field4354);
        class151.field2183 = new class91();
        if (arg0 != 2950) {
            field706 = (class5) null;
        }
        class151.field2183.field178 = 3000;
        class151.field2183.field211 = 3000;
        if (class270.field4631 == 2) {
            class74.field1158 = class240.field3984 - 48;
            class193.field3017 = class23.field406 - 48;
            class239.field3970 = class23.field406 * 128 + 64 - (class193.field3017 * 128);
            class23.field406 = class239.field3970 >> 7;
            class303.field5108 = class240.field3984 * 128 + 64 - (class74.field1158 * 128);
            class240.field3984 = class303.field5108 >> 7;
        } else {
            class177.method1154((byte) -89);
        }
        class209.method1377((byte) -66);
        class282.method1916(97);
        class112.method741(28, 5);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILni;Lni;)V", line = 249)
    public static final void method351(int arg0, class202 arg1, class202 arg2) {
        field710++;
        class78.field1215 = arg2;
        if (arg0 == 13665) {
            class37.field586 = arg1;
            class170.field2622 = class37.field586.method1326((byte) -126, 3);
        }
    }
}
