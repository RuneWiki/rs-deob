import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class268 {

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "Le;")
    public static class191 field4730 = class54.method368(")3runescape)3com)4l=", 2047);

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "Z")
    public static volatile boolean field4728 = false;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field4731 = 0;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "Le;")
    public static class191 field4735 = class54.method368("(Z", 2047);

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public static int field4733 = 7759444;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "Le;")
    public static class191 field4737 = class54.method368("Lade Texturen )2 ", 2047);

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "[Lhi;")
    public static class70[] field4734 = new class70[6];

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)Le;")
    public static final class191 method1835(int arg0, int arg1) {
        if (arg0 != -30159) {
            method1839(-70);
        }
        field4727++;
        return class228.method1629(new class191[] { class92.method563(arg0 + 30080, arg1 >> 24 & 0xFF), class23.field328, class92.method563(-56, (arg1 & 0xFF380F) >> 16), class23.field328, class92.method563(-63, arg1 >> 8 & 0xFF), class23.field328, class92.method563(-85, arg1 & 0xFF) }, (byte) -86);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB)V")
    public static final void method1836(int arg0, byte arg1) {
        if (class137.field2301 == null) {
            class137.field2301 = new byte[4][104][104];
        }
        int var2 = -116 / ((arg0 - 28) / 57);
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    class137.field2301[var3][var4][var5] = arg1;
                }
            }
        }
        field4736++;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public static final void method1837(int arg0) {
        field4732++;
        class162.field2751.method1682(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V")
    public static void method1838(boolean arg0) {
        field4730 = null;
        field4737 = null;
        field4735 = null;
        if (arg0) {
            field4734 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V")
    public static final void method1839(int arg0) {
        field4729++;
        if (class183.field3151 == null) {
            return;
        }
        if (class209.field3714 < 10) {
            if (!class153.field2627.method825((byte) -52, class183.field3151.field883) || !class153.field2627.method825((byte) -67, class228.method1629(new class191[] { class183.field3151.field883, class17.field229 }, (byte) -119))) {
                class209.field3714 = class190.field3332.method820((byte) 62, class183.field3151.field883) / 10;
                return;
            }
            class46.method319(8206);
            class209.field3714 = 10;
        }
        if (class209.field3714 == 10) {
            class54.field1009 = class183.field3151.field895 >> 6 << 6;
            class189.field3327 = (class183.field3151.field876 >> 6 << 6) + 64 - class54.field1009;
            int var1 = (class175.field2946.field3003 >> 7) + class225.field4061 - class54.field1009;
            class115.field1905 = 8.0F;
            class216.field3808 = 8.0F;
            int var2 = var1 + (int) (Math.random() * 10.0D) - 5;
            class76.field1319 = class183.field3151.field893 >> 6 << 6;
            class161.field2728 = (class183.field3151.field880 >> 6 << 6) + 64 - class76.field1319;
            int var3 = class161.field2728 + class76.field1319 - (class175.field2946.field2972 >> 7) - class193.field3474 - 1;
            int var4 = var3 + (int) (Math.random() * 10.0D) - 5;
            if (var2 >= 0 && var2 < class189.field3327 && var4 >= 0 && class161.field2728 > var4) {
                class30.field420 = var2;
                class67.field1160 = var4;
            } else {
                class67.field1160 = class76.field1319 - (class183.field3151.field887 * 64 - (class161.field2728 - 1));
                class30.field420 = class183.field3151.field870 * 64 - class54.field1009;
            }
            class185.method1256(0);
            class137.field2296 = new int[class32.field442 + 1];
            int var5 = class168.field2853 >> 2 << 10;
            int var6 = class161.field2728 >> 6;
            int var7 = class207.field3682 >> 1;
            int var8 = class189.field3327 >> 6;
            class213.field3760 = new byte[var8][var6][];
            class145.field2443 = new byte[var8][var6][];
            class147.field2480 = new int[var8][var6][];
            class205.field3633 = new short[var8][var6][];
            class21.field301 = new byte[var8][var6][];
            class81.field1362 = new byte[var8][var6][];
            class68.field1190 = new int[var8][var6][];
            class179.field3065 = new byte[var8][var6][];
            class245.method1710(var5, (byte) 119, var7);
            class209.field3714 = 20;
        } else if (class209.field3714 == 20) {
            class104.method649(new class225(class153.field2627.method802(class183.field3151.field883, (byte) -113, class222.field3968)), 0);
            class209.field3714 = 30;
            class228.method1627(true, 1);
            class240.method1685((byte) 118);
        } else if (class209.field3714 == 30) {
            class12.method84(18214, new class225(class153.field2627.method802(class183.field3151.field883, (byte) -77, class227.field4088)));
            class209.field3714 = 40;
            class240.method1685((byte) 118);
        } else if (class209.field3714 == 40) {
            class191.method1309(arg0 + 1573109099, new class225(class153.field2627.method802(class183.field3151.field883, (byte) -90, class244.field4352)));
            class209.field3714 = 50;
            class240.method1685((byte) 118);
        } else if (class209.field3714 == 50) {
            class9.method69(false, new class225(class153.field2627.method802(class183.field3151.field883, (byte) 80, class181.field3112)));
            class209.field3714 = 60;
            class228.method1627(true, arg0 ^ 0xFFFFFFFA);
            class240.method1685((byte) 118);
        } else if (class209.field3714 == 60) {
            class110.field1849 = class255.method1765(-128, class228.method1629(new class191[] { class183.field3151.field883, class17.field229 }, (byte) -83), class153.field2627);
            class209.field3714 = 70;
            class240.method1685((byte) 118);
        } else if (class209.field3714 == 70) {
            class110.field1831 = new class6(11, true, class51.field909);
            class209.field3714 = 73;
            class228.method1627(true, 1);
            class240.method1685((byte) 118);
        } else {
            if (arg0 != -5) {
                field4728 = true;
            }
            if (class209.field3714 == 73) {
                class161.field2734 = new class6(12, true, class51.field909);
                class209.field3714 = 76;
                class228.method1627(true, 1);
                class240.method1685((byte) 118);
            } else if (class209.field3714 == 76) {
                class206.field3660 = new class6(14, true, class51.field909);
                class209.field3714 = 79;
                class228.method1627(true, 1);
                class240.method1685((byte) 118);
            } else if (class209.field3714 == 79) {
                class49.field869 = new class6(17, true, class51.field909);
                class209.field3714 = 82;
                class228.method1627(true, 1);
                class240.method1685((byte) 118);
            } else if (class209.field3714 == 82) {
                class29.field410 = new class6(19, true, class51.field909);
                class209.field3714 = 85;
                class228.method1627(true, arg0 ^ 0xFFFFFFFA);
                class240.method1685((byte) 118);
            } else if (class209.field3714 == 85) {
                class266.field4712 = new class6(22, true, class51.field909);
                class209.field3714 = 88;
                class228.method1627(true, 1);
                class240.method1685((byte) 118);
            } else if (class209.field3714 == 88) {
                class51.field926 = new class6(26, true, class51.field909);
                class209.field3714 = 91;
                class228.method1627(true, 1);
                class240.method1685((byte) 118);
            } else {
                class225.field4006 = new class6(30, true, class51.field909);
                class209.field3714 = 100;
                class228.method1627(true, arg0 + 6);
                class240.method1685((byte) 118);
                class270.field4767 = -1;
                class225.field4008 = -1;
                System.gc();
            }
        }
    }
}
