import java.awt.Component;
import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class112 {

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field2617 = 2301979;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "Lec;")
    public static class32 field2619 = class73.method594("(Udns", true);

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "Z")
    public static boolean field2623 = false;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "Lec;")
    private static class32 field2627 = class73.method594("Type", true);

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "Lec;")
    public static class32 field2622 = field2627;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "Z")
    public static boolean field2624 = false;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "Lwc;")
    public static class156 field2618 = new class156(32);

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "[I")
    public static int[] field2628 = new int[50];

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "Lwd;")
    public static class157 field2629 = new class157();

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "I")
    public static int field2632 = 0;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "Lec;")
    public static class32 field2630 = class73.method594("k", true);

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "Lec;")
    public static class32 field2631 = class73.method594("Anmelde)2Limit -Uberschritten)3", true);

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "Lec;")
    public static class32 field2635 = class73.method594("scrollen:", true);

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "Lec;")
    public static class32 field2634 = class73.method594("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", true);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field2633;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLea;Lea;Lec;Lec;)Lnf;")
    public static final class96 method881(byte arg0, class30 arg1, class30 arg2, class32 arg3, class32 arg4) {
        int var5 = arg1.method201(3, arg4);
        field2615++;
        if (arg0 > -7) {
            method882(true);
        }
        int var6 = arg1.method215(arg3, var5, true);
        return class129.method1000(var5, arg2, (byte) -116, arg1, var6);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
    public static void method882(boolean arg0) {
        field2619 = null;
        field2622 = null;
        field2628 = null;
        field2630 = null;
        if (!arg0) {
            field2631 = null;
        }
        field2631 = null;
        field2633 = null;
        field2634 = null;
        field2635 = null;
        field2629 = null;
        field2627 = null;
        field2618 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lea;BLea;Ljava/awt/Component;)V")
    public static final void method883(class30 arg0, byte arg1, class30 arg2, Component arg3) {
        field2616++;
        if (class136.field3172) {
            return;
        }
        class141.method1056();
        byte[] var4 = arg0.method219(class82.field1907, 2560, class74.field1749);
        class100.field2322 = new class49(var4, arg3);
        class45.field1053 = class100.field2322.method386();
        class98.field2264 = class136.method1035(class74.field1749, arg2, false, class32.field632);
        class4.field71 = class136.method1035(class74.field1749, arg2, false, class68.field1595);
        class80.field1852 = class136.method1035(class74.field1749, arg2, false, class115.field2762);
        class74.field1753 = class56.method444(class74.field1749, class71.field1674, -11, arg2);
        if (arg1 != -106) {
            field2624 = false;
        }
        class14.field237 = class56.method444(class74.field1749, class105.field2502, -11, arg2);
        class94.field2171 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            class94.field2171[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            class94.field2171[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            class94.field2171[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            class94.field2171[var8 + 192] = 16777215;
        }
        class133.field3088 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            class133.field3088[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            class133.field3088[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            class133.field3088[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class133.field3088[var12 + 192] = 16777215;
        }
        class124.field2892 = new int[256];
        for (int var13 = 0; var13 < 64; var13++) {
            class124.field2892[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class124.field2892[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            class124.field2892[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class124.field2892[var16 + 192] = 16777215;
        }
        class5.field99 = new int[32768];
        class9.field160 = new int[32768];
        class63.field1443 = new int[256];
        class71.method582(-82, null);
        class74.field1752 = class74.field1749;
        if (class158.field3640 == 0) {
            class30.field551 = true;
        } else {
            class30.field551 = false;
        }
        class11.field189 = 0;
        class117.field2794 = false;
        class43.field999 = new int[32768];
        class74.field1739 = class74.field1749;
        class3.field44 = new int[32768];
        if (class30.field551) {
            class152.method1178(2, (byte) 55);
        } else {
            class72.method591(class124.field2889, class73.field1713, 55, false, 255, class74.field1749, 2);
        }
        class94.method742(arg1 + 106, false);
        class136.field3172 = true;
        class100.field2322.method388(0, 0);
        class45.field1053.method388(382, 0);
        class98.field2264.method400(382 - class98.field2264.field1168 / 2, 18);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)V")
    public static final void method884(int arg0, int arg1) {
        class82.method645((byte) -93);
        field2625++;
        class125.method983(true);
        if (arg1 != -2) {
            return;
        }
        int var2 = class56.method441(16, arg0).field1352;
        if (var2 == 0) {
            return;
        }
        int var3 = class27.field504[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class7.method29(0.9D);
                ((class140) class7.field126).method1050(-110, 0.9D);
            }
            if (var3 == 2) {
                class7.method29(0.8D);
                ((class140) class7.field126).method1050(arg1 ^ 0x77, 0.8D);
            }
            if (var3 == 3) {
                class7.method29(0.7D);
                ((class140) class7.field126).method1050(-116, 0.7D);
            }
            if (var3 == 4) {
                class7.method29(0.6D);
                ((class140) class7.field126).method1050(-113, 0.6D);
            }
            class105.method859((byte) -26);
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class158.field3640 != var4) {
                if (class158.field3640 == 0 && class12.field206 != -1) {
                    class154.method1197(class124.field2889, -1, class12.field206, var4, false, 0);
                    field2623 = false;
                } else if (var4 == 0) {
                    class68.method566(true);
                    field2623 = false;
                } else {
                    class68.method569(var4, false);
                }
                class158.field3640 = var4;
            }
        }
        if (var2 == 10) {
            if (var3 == 0) {
                class114.field2648 = 127;
            }
            if (var3 == 1) {
                class114.field2648 = 96;
            }
            if (var3 == 2) {
                class114.field2648 = 64;
            }
            if (var3 == 3) {
                class114.field2648 = 32;
            }
            if (var3 == 4) {
                class114.field2648 = 0;
            }
        }
        if (var2 == 6) {
            class44.field1036 = var3;
        }
        if (var2 == 4) {
            if (var3 == 0) {
                class70.field1630 = 127;
            }
            if (var3 == 1) {
                class70.field1630 = 96;
            }
            if (var3 == 2) {
                class70.field1630 = 64;
            }
            if (var3 == 3) {
                class70.field1630 = 32;
            }
            if (var3 == 4) {
                class70.field1630 = 0;
            }
        }
        if (var2 == 5) {
            class125.field2900 = var3;
        }
        if (var2 == 9) {
            class124.field2887 = var3;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)I")
    public static final int method885(int arg0) {
        field2621++;
        if (arg0 >= -2) {
            field2627 = null;
        }
        return 6;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZI)[B")
    public static final synchronized byte[] method886(boolean arg0, int arg1) {
        field2626++;
        if (arg1 == 100 && class50.field1161 > 0) {
            byte[] var2 = class57.field1315[--class50.field1161];
            class57.field1315[class50.field1161] = null;
            return var2;
        } else if (arg1 == 5000 && class113.field2642 > 0) {
            byte[] var3 = class92.field2127[--class113.field2642];
            class92.field2127[class113.field2642] = null;
            return var3;
        } else {
            if (!arg0) {
                field2623 = false;
            }
            if (arg1 == 30000 && class85.field1980 > 0) {
                byte[] var4 = class156.field3577[--class85.field1980];
                class156.field3577[class85.field1980] = null;
                return var4;
            } else {
                return new byte[arg1];
            }
        }
    }
}
