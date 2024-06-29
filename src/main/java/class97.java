import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class97 {

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "Lqk;")
    public static class207 field1705 = class24.method212(255, "showingVideoAd");

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "Z")
    public static boolean field1714 = false;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "Lqk;")
    public static class207 field1708 = class24.method212(255, "<col=ffff00>");

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public int field1704;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public int field1707;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
    public int field1709;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    public int field1710;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public int field1711;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
    public int field1715;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "I")
    public int field1718;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "[B")
    public byte[] field1706;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "[B")
    public byte[] field1712;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V")
    public static final void method686(byte arg0) {
        field1713++;
        int var1 = class90.field1616 * 128 + 64;
        int var2 = class157.field2789 * 128 + 64;
        int var3 = class22.method139(var2, var1, 23979, class93.field1645) - class217.field3856;
        if (class164.field2902 >= 100) {
            class111.field1939 = class90.field1616 * 128 + 64;
            class209.field3702 = class157.field2789 * 128 + 64;
            class196.field3443 = class22.method139(class209.field3702, class111.field1939, 23979, class93.field1645) - class217.field3856;
        } else {
            if (class196.field3443 < var3) {
                class196.field3443 += (var3 - class196.field3443) * class164.field2902 / 1000 + class250.field4523;
                if (class196.field3443 > var3) {
                    class196.field3443 = var3;
                }
            }
            if (var2 > class209.field3702) {
                class209.field3702 += (var2 - class209.field3702) * class164.field2902 / 1000 + class250.field4523;
                if (var2 < class209.field3702) {
                    class209.field3702 = var2;
                }
            }
            if (var3 < class196.field3443) {
                class196.field3443 -= (class196.field3443 - var3) * class164.field2902 / 1000 + class250.field4523;
                if (class196.field3443 < var3) {
                    class196.field3443 = var3;
                }
            }
            if (var2 < class209.field3702) {
                class209.field3702 -= (class209.field3702 - var2) * class164.field2902 / 1000 + class250.field4523;
                if (var2 > class209.field3702) {
                    class209.field3702 = var2;
                }
            }
            if (var1 > class111.field1939) {
                class111.field1939 += (var1 - class111.field1939) * class164.field2902 / 1000 + class250.field4523;
                if (var1 < class111.field1939) {
                    class111.field1939 = var1;
                }
            }
            if (class111.field1939 > var1) {
                class111.field1939 -= (class111.field1939 - var1) * class164.field2902 / 1000 + class250.field4523;
                if (var1 > class111.field1939) {
                    class111.field1939 = var1;
                }
            }
        }
        int var4 = class25.field531 * 128 + 64;
        int var5 = class55.field1034 * 128 + 64;
        int var6 = class22.method139(var5, var4, 23979, class93.field1645) - class232.field4262;
        int var7 = var6 - class196.field3443;
        int var8 = var5 - class209.field3702;
        int var9 = -99 % ((-arg0 - 2) / 43);
        int var10 = var4 - class111.field1939;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var7, (double) var11) * 325.949D) & 0x7FF;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        int var13 = (int) (-325.949D * Math.atan2((double) var8, (double) var10)) & 0x7FF;
        if (var12 > class228.field4186) {
            class228.field4186 += (var12 - class228.field4186) * class237.field4373 / 1000 + class137.field2369;
            if (class228.field4186 > var12) {
                class228.field4186 = var12;
            }
        }
        int var14 = var13 - class101.field1819;
        if (class228.field4186 > var12) {
            class228.field4186 -= class137.field2369 + ((class228.field4186 - var12) * class237.field4373 / 1000);
            if (class228.field4186 < var12) {
                class228.field4186 = var12;
            }
        }
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            class101.field1819 += class237.field4373 * var14 / 1000 + class137.field2369;
            class101.field1819 &= 0x7FF;
        }
        if (var14 < 0) {
            class101.field1819 -= -var14 * class237.field4373 / 1000 + class137.field2369;
            class101.field1819 &= 0x7FF;
        }
        int var15 = var13 - class101.field1819;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class101.field1819 = var13;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
    public static final void method687(int arg0) {
        if (class98.field1738 != null) {
            class98.field1738.method888(true);
            class98.field1738 = null;
        }
        field1702++;
        class25.method213(-119);
        class284.method1924();
        for (int var1 = 0; var1 < 4; var1++) {
            class133.field2303[var1].method1124((byte) -97);
        }
        class163.method1178((byte) -110, false);
        System.gc();
        class248.method1750(2, (byte) -119);
        class223.field4081 = false;
        class219.field3865 = -1;
        class4.method24((byte) -80, true);
        class270.field4772 = false;
        class199.field3500 = 0;
        class89.field1602 = 0;
        if (arg0 != -22455) {
            return;
        }
        class180.field3231 = 0;
        class21.field349 = 0;
        for (int var2 = 0; var2 < class170.field3025.length; var2++) {
            class170.field3025[var2] = null;
        }
        class31.field629 = 0;
        class138.field2390 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class169.field2953[var3] = null;
            class119.field2064[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class79.field1449[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class276.field4844[var5][var6][var7] = null;
                }
            }
        }
        class119.method852((byte) 35);
        class261.field4651 = 0;
        class157.method1151(arg0 + 51211);
        class87.method640(false, true);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(III)I")
    public static final int method688(int arg0, int arg1, int arg2) {
        field1703++;
        int var3 = class2.method9(arg1 - 1, arg2 + -1, true) - (-class2.method9(arg1 - 1, arg2 + 1, true) - (class2.method9(arg1 + 1, arg0 + arg2, true) + class2.method9(arg1 + 1, arg2 + 1, true)));
        int var4 = class2.method9(arg1, arg2 - 1, true) + (class2.method9(arg1, arg2 + 1, true) + class2.method9(arg1 - 1, arg2, true) + class2.method9(arg1 - -1, arg2, true));
        int var5 = class2.method9(arg1, arg2, true);
        return var4 / 8 + var3 / 16 + var5 / 4;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BI)Lsa;")
    public static final class260 method689(byte arg0, int arg1) {
        if (arg0 != 113) {
            method689((byte) -109, 5);
        }
        field1717++;
        return class1.field15 && arg1 >= class268.field4749 && class234.field4318 >= arg1 ? class113.field1965[arg1 - class268.field4749] : null;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)V")
    public static void method690(byte arg0) {
        int var1 = 99 % ((79 - arg0) / 41);
        field1705 = null;
        field1708 = null;
    }
}
