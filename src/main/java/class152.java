import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class152 extends class178 {

    @OriginalMember(owner = "client!od", name = "R", descriptor = "[I")
    public static int[] field2750 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!od", name = "V", descriptor = "I")
    public static int field2754 = 0;

    @OriginalMember(owner = "client!od", name = "T", descriptor = "I")
    public static int field2752 = 1;

    @OriginalMember(owner = "client!od", name = "Y", descriptor = "Lv;")
    public static class218 field2757 = new class218();

    @OriginalMember(owner = "client!od", name = "bb", descriptor = "Loc;")
    public static class151 field2760 = class137.method873(2, "Der Server wird gerade aktualisiert)3");

    @OriginalMember(owner = "client!od", name = "ab", descriptor = "Loc;")
    public static class151 field2759 = class137.method873(2, "Bitte versuchen Sie)1");

    @OriginalMember(owner = "client!od", name = "K", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!od", name = "L", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!od", name = "M", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!od", name = "N", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!od", name = "O", descriptor = "I")
    public int field2747;

    @OriginalMember(owner = "client!od", name = "P", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!od", name = "Q", descriptor = "I")
    public int field2749;

    @OriginalMember(owner = "client!od", name = "U", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!od", name = "W", descriptor = "I")
    public int field2755;

    @OriginalMember(owner = "client!od", name = "X", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!od", name = "Z", descriptor = "Lsd;")
    public static class192 field2758;

    @OriginalMember(owner = "client!od", name = "S", descriptor = "[[[B")
    public static byte[][][] field2751;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILba;)V")
    public static final void method1000(int arg0, class13 arg1) {
        field2743++;
        if (class112.field1987 == 1) {
            short var2 = 280;
            if (class2.field61 >= var2 && var2 + 14 >= class2.field61 && class209.field3677 >= 4 && class209.field3677 <= 18) {
                class210.method1309(122, 0, 0);
                return;
            }
            if (class2.field61 >= var2 + 15 && class2.field61 <= var2 + 80 && class209.field3677 >= 4 && class209.field3677 <= 18) {
                class210.method1309(24, 1, 0);
                return;
            }
            short var3 = 390;
            if (class2.field61 >= var3 && class2.field61 <= var3 + 14 && class209.field3677 >= 4 && class209.field3677 <= 18) {
                class210.method1309(-113, 0, 1);
                return;
            }
            if (var3 + 15 <= class2.field61 && var3 + 80 >= class2.field61 && class209.field3677 >= 4 && class209.field3677 <= 18) {
                class210.method1309(118, 1, 1);
                return;
            }
            short var4 = 500;
            if (var4 <= class2.field61 && var4 + 14 >= class2.field61 && class209.field3677 >= 4 && class209.field3677 <= 18) {
                class210.method1309(116, 0, 2);
                return;
            }
            if (class2.field61 >= var4 + 15 && class2.field61 <= var4 + 80 && class209.field3677 >= 4 && class209.field3677 <= 18) {
                class210.method1309(121, 1, 2);
                return;
            }
            short var5 = 610;
            if (class2.field61 >= var5 && class2.field61 <= var5 + 14 && class209.field3677 >= 4 && class209.field3677 <= 18) {
                class210.method1309(12, 0, 3);
                return;
            }
            if (var5 + 15 <= class2.field61 && class2.field61 <= var5 + 80 && class209.field3677 >= 4 && class209.field3677 <= 18) {
                class210.method1309(-70, 1, 3);
                return;
            }
            if (class2.field61 >= 700 && class209.field3677 >= 4 && class2.field61 <= 758 && class209.field3677 <= 20) {
                class233.field4295 = false;
                class139.method898(-3793);
                return;
            }
            if (class206.field3649 != -1) {
                class5 var6 = class222.field3849[class206.field3649];
                if (class15.field347 == var6.field92) {
                    byte[] var7 = class126.method761(new class151[] { var6.field97, class180.field3262 }, 10260).method958((byte) 100);
                    class191.field3373 = new String(var7, 0, var7.length);
                    class13.field296 = var6.field90;
                    if (class115.field2052 != 0) {
                        class36.field745 = 43594;
                        class206.field3657 = 43594;
                        class203.field3606 = 443;
                        class115.field2052 = 0;
                    }
                    class233.field4295 = false;
                    class139.method898(-3793);
                    return;
                }
                class151 var8 = class126.method761(new class151[] { class63.field1222, var6.field97, class121.field2182, class137.method874(class123.field2212, false), class41.field862, class137.method874(class13.field300 ? 1 : 0, false), class191.field3385, class137.method874(class159.field2869, false), class208.field3664, class137.method874(class89.field1634, false) }, 10260);
                try {
                    arg1.getAppletContext().showDocument(var8.method964(10837), "_self");
                } catch (Exception var10) {
                }
            }
        }
        int var9 = -109 / ((arg0 + 13) / 47);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IBLwa;)V")
    private final void method1001(int arg0, byte arg1, class229 arg2) {
        field2748++;
        if (arg1 != 25) {
            this.field2749 = 70;
        }
        if (arg0 == 1) {
            this.field2755 = arg2.method1490((byte) 73);
            this.field2747 = arg2.method1475(255);
            this.field2749 = arg2.method1475(arg1 ^ 0xE6);
        }
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V")
    public static final void method1002(int arg0) {
        field2756++;
        if (class16.field362 != null) {
            class101 var1 = class16.field362;
            synchronized (class16.field362) {
                class16.field362 = null;
            }
        }
        if (arg0 != 1) {
            method1003(-43, (byte) -110);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)I")
    public static final int method1003(int arg0, byte arg1) {
        field2746++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        int var3 = -2 % ((-arg1 - 61) / 52);
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Loc;I)Z")
    public static final boolean method1004(class151 arg0, int arg1) {
        field2744++;
        if (arg0 == null) {
            return false;
        }
        if (arg1 != 25252) {
            method1004(null, 34);
        }
        for (int var2 = 0; var2 < class32.field658; var2++) {
            if (arg0.method995((byte) -22, class170.field3103[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLwa;)V")
    public final void method1005(boolean arg0, class229 arg1) {
        field2745++;
        if (!arg0) {
            field2750 = null;
        }
        while (true) {
            int var3 = arg1.method1475(255);
            if (var3 == 0) {
                return;
            }
            this.method1001(var3, (byte) 25, arg1);
        }
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(I)V")
    public static void method1006(int arg0) {
        field2759 = null;
        field2757 = null;
        int var1 = -111 % ((arg0 + 57) / 35);
        field2760 = null;
        field2751 = null;
        field2758 = null;
        field2750 = null;
    }
}
