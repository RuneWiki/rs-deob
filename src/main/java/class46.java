import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class46 extends class3 {

    @OriginalMember(owner = "client!m", name = "M", descriptor = "Z")
    public static boolean field722 = true;

    @OriginalMember(owner = "client!m", name = "Q", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field726 = new CRC32();

    @OriginalMember(owner = "client!m", name = "S", descriptor = "Z")
    public static boolean field728 = false;

    @OriginalMember(owner = "client!m", name = "W", descriptor = "I")
    public static int field732 = 0;

    @OriginalMember(owner = "client!m", name = "Y", descriptor = "Lok;")
    public static class41 field734 = class137.method956("Lade Sprites )2 ", 45);

    @OriginalMember(owner = "client!m", name = "X", descriptor = "[Z")
    public static boolean[] field733 = new boolean[100];

    @OriginalMember(owner = "client!m", name = "F", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!m", name = "G", descriptor = "I")
    public int field716;

    @OriginalMember(owner = "client!m", name = "H", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!m", name = "I", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!m", name = "J", descriptor = "I")
    public int field719;

    @OriginalMember(owner = "client!m", name = "K", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!m", name = "L", descriptor = "I")
    public int field721;

    @OriginalMember(owner = "client!m", name = "N", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!m", name = "P", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!m", name = "R", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!m", name = "T", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!m", name = "V", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!m", name = "U", descriptor = "Lji;")
    public static class154 field730;

    @OriginalMember(owner = "client!m", name = "O", descriptor = "Lok;")
    public class41 field724;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(B)V", line = 6)
    public static final void method331(byte arg0) {
        field715++;
        if (arg0 <= 113) {
            return;
        }
        int var1 = class140.field2165.method1794(class51.field773);
        for (int var2 = 0; var2 < class98.field1432; var2++) {
            int var3 = class140.field2165.method1794(class129.method901(var2, 3975));
            if (var3 > var1) {
                var1 = var3;
            }
        }
        var1 += 8;
        int var4 = class98.field1432 * 15 + 21;
        int var5 = class130.field1948;
        if (class14.field182 < var4 + var5) {
            var5 = class14.field182 - var4;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        int var6 = class196.field3164 - (var1 / 2);
        if ((var1 + var6) > class188.field3055) {
            var6 = class188.field3055 - var1;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (class9.field114 == 1) {
            if (class55.field805 == class196.field3164 && class245.field3910 == class130.field1948) {
                class251.field3993 = true;
                class9.field114 = 0;
                class228.field3637 = class98.field1432 * 15 + 22;
                class117.field1717 = var1;
                class109.field1528 = var5;
                class239.field3833 = var6;
            }
        } else if (class196.field3164 == class151.field2358 && class245.field3941 == class130.field1948) {
            class239.field3833 = var6;
            class109.field1528 = var5;
            class228.field3637 = class98.field1432 * 15 + 22;
            class117.field1717 = var1;
            class251.field3993 = true;
            class9.field114 = 0;
        } else {
            class245.field3910 = class245.field3941;
            class9.field114 = 1;
            class55.field805 = class151.field2358;
        }
    }

    @OriginalMember(owner = "client!m", name = "f", descriptor = "(I)V", line = 98)
    public static void method332(int arg0) {
        field733 = null;
        field726 = null;
        field730 = null;
        field734 = null;
        if (arg0 <= 46) {
            field726 = (CRC32) null;
        }
    }

    @OriginalMember(owner = "client!m", name = "g", descriptor = "(I)[Ltb;", line = 114)
    public static final class199[] method333(int arg0) {
        field725++;
        class199[] var1 = new class199[class181.field2940];
        if (arg0 != 255) {
            method332(111);
        }
        for (int var2 = 0; var2 < class181.field2940; var2++) {
            int var3 = class69.field1040[var2] * class173.field2812[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class223.field3562[var2];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class312.field5263[class217.method1563(255, var5[var6])];
            }
            if (class166.field2625) {
                var1[var2] = new class17(class204.field3299, class205.field3318, class95.field1412[var2], class314.field5288[var2], class69.field1040[var2], class173.field2812[var2], var4);
            } else {
                var1[var2] = new class72(class204.field3299, class205.field3318, class95.field1412[var2], class314.field5288[var2], class69.field1040[var2], class173.field2812[var2], var4);
            }
        }
        class286.method2005((byte) -9);
        return var1;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(Z)I", line = 159)
    public final int method334(boolean arg0) {
        if (!arg0) {
            field733 = (boolean[]) null;
        }
        field717++;
        return (int) (this.field844 >>> 32 & 0xFFL);
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(B)I", line = 176)
    public final int method335(byte arg0) {
        field718++;
        return arg0 < 44 ? 94 : (int) this.field844;
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(Z)V", line = 198)
    public final void method336(boolean arg0) {
        if (!arg0) {
            this.method337(127);
        }
        field727++;
        this.field41 = Long.MIN_VALUE & this.field41 | class247.method1762(19166) + 500L;
        class306.field5132.method2055(this, 111);
    }

    @OriginalMember(owner = "client!m", name = "h", descriptor = "(I)V", line = 220)
    public final void method337(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field731++;
        this.field41 |= Long.MIN_VALUE;
        if (this.method338((byte) -100) == 0L) {
            class152.field2394.method2055(this, arg0 ^ 0x19);
        }
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(B)J", line = 234)
    public final long method338(byte arg0) {
        field729++;
        if (arg0 != -100) {
            field726 = (CRC32) null;
        }
        return this.field41 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(II)V", line = 263)
    public class46(int arg0, int arg1) {
        this.field844 = (long) arg1 | (long) arg0 << 32;
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(Z)V", line = 272)
    public static final void method339(boolean arg0) {
        field720++;
        if (class211.field3399.toLowerCase().indexOf("microsoft") == -1) {
            class195.field3156[46] = 72;
            class195.field3156[93] = 43;
            class195.field3156[61] = 27;
            class195.field3156[91] = 42;
            class195.field3156[59] = 57;
            class195.field3156[44] = 71;
            class195.field3156[47] = 73;
            class195.field3156[45] = 26;
            if (class211.field3403 == null) {
                class195.field3156[192] = 58;
                class195.field3156[222] = 59;
            } else {
                class195.field3156[222] = 58;
                class195.field3156[520] = 59;
                class195.field3156[192] = 28;
            }
            class195.field3156[92] = 74;
        } else {
            class195.field3156[192] = 58;
            class195.field3156[223] = 28;
            class195.field3156[186] = 57;
            class195.field3156[190] = 72;
            class195.field3156[219] = 42;
            class195.field3156[191] = 73;
            class195.field3156[220] = 74;
            class195.field3156[189] = 26;
            class195.field3156[221] = 43;
            class195.field3156[187] = 27;
            class195.field3156[188] = 71;
            class195.field3156[222] = 59;
        }
        if (arg0) {
            method332(99);
        }
    }
}
