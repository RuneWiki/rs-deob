import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public abstract class class113 {

    @OriginalMember(owner = "client!de", name = "b", descriptor = "Lcc;")
    public static class222 field1747 = null;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIB)I")
    public abstract int method63(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method839(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class257.field4098[arg0][var8][var14] == -class244.field3891) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class233.field3684[arg0][arg1][arg3] + arg5;
            if (!class58.method483(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class58.method483(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class58.method483(var9, var11, var13)) {
                return false;
            } else if (class58.method483(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class150.method1088(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class58.method483(var6 + 1, class233.field3684[arg0][arg1][arg3] + arg5, var7 + 1) && class58.method483(var6 + 128 - 1, class233.field3684[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class58.method483(var6 + 128 - 1, class233.field3684[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class58.method483(var6 + 1, class233.field3684[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)J")
    public abstract long method62(byte arg0);

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)V")
    public static final void method840(int arg0, int arg1) {
        field1746++;
        class69 var2 = class255.method1723((byte) 32, arg0, 3);
        var2.method554(2009563296);
        if (arg1 < 57) {
            method839(-25, 117, 98, -28, 88, -83);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V")
    public abstract void method61(boolean arg0);

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public static final void method841(int arg0) {
        field1748++;
        if (class92.field1467 == null) {
            return;
        }
        if (class298.field4807 < 10) {
            if (!class153.field2256.method705(class92.field1467.field4877, (byte) 121)) {
                class298.field4807 = class265.field4196.method719((byte) 83, class92.field1467.field4877) / 10;
                return;
            }
            class244.method1655(111);
            class298.field4807 = 10;
        }
        if (class298.field4807 == 10) {
            class147.field2165 = class92.field1467.field4864 >> 6 << 6;
            class152.field2247 = (class92.field1467.field4871 >> 6 << 6) + 64 - class147.field2165;
            class141.field2107 = class92.field1467.field4865 >> 6 << 6;
            class92.field1475 = (class92.field1467.field4863 >> 6 << 6) + 64 - class141.field2107;
            int[] var1 = class92.field1467.method2033((class263.field4168.field4725 >> 7) + class138.field2072, 0, (class263.field4168.field4709 >> 7) + class159.field2379, class130.field1941);
            int var2 = -1;
            int var3 = -1;
            if (var1 != null) {
                var2 = var1[1] - class147.field2165;
                var3 = class92.field1475 - (var1[2] + 1 - class141.field2107);
            }
            if (var2 >= 0 && var2 < class152.field2247 && var3 >= 0 && class92.field1475 > var3) {
                int var4 = var2 + ((int) (Math.random() * 10.0D) - 5);
                int var5 = var3 + (int) (Math.random() * 10.0D) - 5;
                class175.field2698 = var5;
                class129.field1920 = var4;
            } else if (class215.field3295 == -1 || class103.field1611 == -1) {
                int[] var7 = class92.field1467.method2029(0, class92.field1467.field4875 & 0x3FFF, (class92.field1467.field4875 & 0xFFFE5F5) >> 14);
                class175.field2698 = class92.field1475 + class141.field2107 - var7[2] - 1;
                class129.field1920 = var7[1] - class147.field2165;
            } else {
                int[] var6 = class92.field1467.method2029(0, class103.field1611, class215.field3295);
                class103.field1611 = -1;
                class215.field3295 = -1;
                if (var6 != null) {
                    class129.field1920 = var6[1] - class147.field2165;
                    class175.field2698 = class92.field1475 + class141.field2107 - var6[2] - 1;
                }
            }
            if (class92.field1467.field4862 == 37) {
                class247.field3932 = 3.0F;
                class238.field3757 = 3.0F;
            } else if (class92.field1467.field4862 == 50) {
                class247.field3932 = 4.0F;
                class238.field3757 = 4.0F;
            } else if (class92.field1467.field4862 == 75) {
                class247.field3932 = 6.0F;
                class238.field3757 = 6.0F;
            } else if (class92.field1467.field4862 == 100) {
                class247.field3932 = 8.0F;
                class238.field3757 = 8.0F;
            } else if (class92.field1467.field4862 == 200) {
                class247.field3932 = 16.0F;
                class238.field3757 = 16.0F;
            } else {
                class247.field3932 = 8.0F;
                class238.field3757 = 8.0F;
            }
            class195.method1395(arg0 + 10857);
            int var8 = class92.field1475 >> 6;
            int var9 = class56.field889 >> 2 << 10;
            int var10 = class136.field2059 >> 1;
            class86.field1277 = new int[class200.field3097 + 1];
            int var11 = class152.field2247 >> 6;
            class156.field2323 = new int[var11][var8][];
            class127.field1905 = new int[var11][var8][];
            class36.field622 = new int[var11][var8][];
            class116.field1773 = new byte[var11][var8][];
            class276.field4396 = new byte[var11][var8][];
            class300.field4820 = new byte[var11][var8][];
            class197.field3076 = new byte[var11][var8][];
            class45.field764 = new byte[var11][var8][];
            class24.method213(var10, (byte) 69, var9);
            class298.field4807 = 20;
        } else if (class298.field4807 == 20) {
            class22.method195(new class31(class153.field2256.method703(class92.field1467.field4877, "underlay", true)), (byte) -40);
            class298.field4807 = 30;
            class106.method806((byte) 87, true);
            class301.method2018(4096);
        } else if (class298.field4807 == 30) {
            class126.method942(false, new class31(class153.field2256.method703(class92.field1467.field4877, "overlay", true)));
            class298.field4807 = 40;
            class301.method2018(4096);
        } else if (class298.field4807 == 40) {
            class145.method1048(new class31(class153.field2256.method703(class92.field1467.field4877, "overlay2", true)), 61);
            class298.field4807 = 50;
            class301.method2018(4096);
        } else if (arg0 == 17833) {
            if (class298.field4807 == 50) {
                class303.method2031((byte) 125, new class31(class153.field2256.method703(class92.field1467.field4877, "loc", true)));
                class298.field4807 = 60;
                class106.method806((byte) 117, true);
                class301.method2018(4096);
            } else if (class298.field4807 == 60) {
                if (class153.field2256.method708(class92.field1467.field4877 + "_labels", 0)) {
                    if (!class153.field2256.method705(class92.field1467.field4877 + "_labels", (byte) -18)) {
                        return;
                    }
                    class183.field2895 = class118.method860(class153.field2256, class92.field1467.field4877 + "_labels", 21382);
                } else {
                    class183.field2895 = new class297(0);
                }
                class298.field4807 = 70;
                class301.method2018(4096);
            } else if (class298.field4807 == 70) {
                class279.field4423 = new class227(11, true, class105.field1651);
                class298.field4807 = 73;
                class106.method806((byte) 87, true);
                class301.method2018(arg0 - 13737);
            } else if (class298.field4807 == 73) {
                class142.field2115 = new class227(12, true, class105.field1651);
                class298.field4807 = 76;
                class106.method806((byte) 111, true);
                class301.method2018(4096);
            } else if (class298.field4807 == 76) {
                class35.field612 = new class227(14, true, class105.field1651);
                class298.field4807 = 79;
                class106.method806((byte) 79, true);
                class301.method2018(4096);
            } else if (class298.field4807 == 79) {
                class295.field4622 = new class227(17, true, class105.field1651);
                class298.field4807 = 82;
                class106.method806((byte) 98, true);
                class301.method2018(4096);
            } else if (class298.field4807 == 82) {
                class49.field804 = new class227(19, true, class105.field1651);
                class298.field4807 = 85;
                class106.method806((byte) 78, true);
                class301.method2018(4096);
            } else if (class298.field4807 == 85) {
                class298.field4808 = new class227(22, true, class105.field1651);
                class298.field4807 = 88;
                class106.method806((byte) 86, true);
                class301.method2018(arg0 - 13737);
            } else if (class298.field4807 == 88) {
                class35.field613 = new class227(26, true, class105.field1651);
                class298.field4807 = 91;
                class106.method806((byte) 106, true);
                class301.method2018(arg0 ^ 0x55A9);
            } else {
                class112.field1724 = new class227(30, true, class105.field1651);
                class298.field4807 = 100;
                class106.method806((byte) 101, true);
                class301.method2018(4096);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
    public static void method842(int arg0) {
        if (arg0 <= 104) {
            method841(4);
        }
        field1747 = null;
    }
}
