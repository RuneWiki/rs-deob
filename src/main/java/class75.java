import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class75 {

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public int field1789 = -1;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field1781 = 0;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "Lv;")
    private static class146 field1790 = class159.method1226((byte) -37, "flash1:");

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field1783 = 0;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "Lv;")
    public static class146 field1793 = field1790;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "Lv;")
    public static class146 field1794 = field1790;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "Lv;")
    public static class146 field1792 = class159.method1226((byte) -37, "Sichtbare Karte vorbereitet)3");

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1782 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "Lv;")
    private static class146 field1798 = class159.method1226((byte) -37, "RuneScape has been updated(Q");

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "Lv;")
    public static class146 field1799 = class159.method1226((byte) -37, ")1p");

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "Lv;")
    public static class146 field1797 = field1798;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
    public static int field1801 = -1;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "Lv;")
    public static class146 field1802 = class159.method1226((byte) -37, "title_mute");

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
    public static int field1803 = -1;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    public static int field1804 = 0;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "Lqf;")
    public class117 field1786;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "Lla;")
    public static class77 field1780;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "[I")
    public int[] field1795;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "[I")
    public static int[] field1800;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "[Lv;")
    public class146[] field1787;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B[Lv;)[Lv;")
    public static final class146[] method563(byte arg0, class146[] arg1) {
        field1796++;
        if (arg0 != -116) {
            field1782 = null;
        }
        class146[] var2 = new class146[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class71.method509(new class146[] { method564(false, var3), class122.field2841 }, (byte) -123);
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class71.method509(new class146[] { var2[var3], arg1[var3] }, (byte) 115);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZI)Lv;")
    public static final class146 method564(boolean arg0, int arg1) {
        if (arg0) {
            return null;
        } else {
            field1785++;
            return class71.method508(10, arg1, (byte) 123, false);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static final void method565(int arg0) {
        if (arg0 != 0) {
            method566(71, -104);
        }
        field1791++;
        while (true) {
            class152 var1 = class9.field166;
            class18 var2;
            synchronized (class9.field166) {
                var2 = (class18) class15.field241.method1141(arg0 ^ 0x2);
            }
            if (var2 == null) {
                return;
            }
            var2.field284.method153(120, false, (int) var2.field679, var2.field285, var2.field298);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)V")
    public static final void method566(int arg0, int arg1) {
        int[] var2 = class124.field2879.field1411;
        field1788++;
        int var3 = var2.length;
        for (int var4 = 0; var4 < var3; var4++) {
            var2[var4] = 0;
        }
        for (int var5 = 1; var5 < 103; var5++) {
            int var20 = (103 - var5) * 2048 + 24628;
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class74.field1772[arg0][var21][var5] & 0x18) == 0) {
                    class66.field1496.method1212(var2, var20, 512, arg0, var21, var5);
                }
                if (arg0 < 3 && (class74.field1772[arg0 + 1][var21][var5] & 0x8) != 0) {
                    class66.field1496.method1212(var2, var20, 512, arg0 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        int var6 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16) - arg1 - 10;
        int var7 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        class124.field2879.method432();
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var19 = 1; var19 < 103; var19++) {
                if ((class74.field1772[arg0][var19][var8] & 0x18) == 0) {
                    class123.method926(var19, arg0, var7, (byte) -108, var8, var6);
                }
                if (arg0 < 3 && (class74.field1772[arg0 + 1][var19][var8] & 0x8) != 0) {
                    class123.method926(var19, arg0 + 1, var7, (byte) -100, var8, var6);
                }
            }
        }
        class121.field2815 = 0;
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var10 = 0; var10 < 104; var10++) {
                int var11 = class66.field1496.method1180(class148.field3428, var9, var10);
                if (var11 != 0) {
                    int var12 = var11 >> 14 & 0x7FFF;
                    int var13 = class124.method928(-1, var12).field1626;
                    if (var13 >= 0) {
                        int var14 = var10;
                        int var15 = var9;
                        if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                            int[][] var16 = class64.field1437[class148.field3428].field2185;
                            for (int var17 = 0; var17 < 10; var17++) {
                                int var18 = (int) (Math.random() * 4.0D);
                                if (var18 == 0 && var15 > 0 && var15 > var9 - 3 && (var16[var15 - 1][var14] & 0x12C0108) == 0) {
                                    var15--;
                                }
                                if (var18 == 1 && var15 < 103 && var15 < var9 + 3 && (var16[var15 + 1][var14] & 0x12C0180) == 0) {
                                    var15++;
                                }
                                if (var18 == 2 && var14 > 0 && var14 > var10 - 3 && (var16[var15][var14 - 1] & 0x12C0102) == 0) {
                                    var14--;
                                }
                                if (var18 == 3 && var14 < 103 && var14 < var10 + 3 && (var16[var15][var14 + 1] & 0x12C0120) == 0) {
                                    var14++;
                                }
                            }
                        }
                        class38.field840[class121.field2815] = class66.field1482[var13];
                        class79.field1953[class121.field2815] = var15;
                        class124.field2884[class121.field2815] = var14;
                        class121.field2815++;
                    }
                }
            }
        }
        class141.field3233.method1130((byte) -96);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BLdd;)V")
    public static final void method567(byte arg0, class26 arg1) {
        field1784++;
        if (arg0 <= 111) {
            method564(false, -83);
        }
        if (class41.field931 == arg1.field488) {
            class83.field2013[arg1.field496] = true;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
    public static void method568(byte arg0) {
        field1802 = null;
        if (arg0 != -127) {
            field1794 = null;
        }
        field1799 = null;
        field1790 = null;
        field1800 = null;
        field1797 = null;
        field1792 = null;
        field1780 = null;
        field1794 = null;
        field1798 = null;
        field1782 = null;
        field1793 = null;
    }
}
