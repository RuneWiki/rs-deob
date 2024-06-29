import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class254 extends class222 {

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "J")
    public static long field4593 = 0L;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public static int field4597 = 0;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    public static int field4594 = 0;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "Lcf;")
    public static class93 field4602 = class147.method1066(" loggt sich ein)3", -48);

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "Z")
    public static boolean field4599 = false;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!ta", name = "y", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "J")
    public long field4598;

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "Lhg;")
    public static class177 field4605;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "Lta;")
    public class254 field4595;

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "Lta;")
    public class254 field4604;

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "[I")
    public static int[] field4601;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZIIII)V")
    public static final void method1725(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        class278.field4975++;
        field4592++;
        class223.method1548(-25755);
        if (arg1) {
            class133.method973(false, -104, false, 0);
        } else {
            class3.method9(0, -105);
            class133.method973(true, -87, false, 0);
            if (class129.field2275 == 0) {
                for (int var7 = 1; var7 <= 5; var7++) {
                    class133.method973(false, -114, false, var7);
                    class133.method973(false, -125, true, var7);
                    class3.method9(var7, -105);
                }
            } else {
                for (int var6 = 1; var6 <= 5; var6++) {
                    class3.method9(var6, -105);
                    class133.method973(false, -65, false, var6);
                    class133.method973(false, -67, true, var6);
                }
            }
        }
        if (!arg1) {
            class1.method3((byte) 7);
        }
        if (arg0 >= -74) {
            return;
        }
        class251.method1701((byte) -98);
        if (class18.field234 == 1) {
            int var8 = class50.field825 + class112.field1919 & 0x7FF;
            int var9 = class211.field3875;
            if (var9 < (class161.field2836 / 256)) {
                var9 = class161.field2836 / 256;
            }
            if (class243.field4383[4] && (class7.field95[4] + 128) > var9) {
                var9 = class7.field95[4] + 128;
            }
            class147.method1065(var8, class78.field1456, var9, class47.field755, var9 * 3 + 600, arg4, class13.method56(class166.field2927.field3784, class166.field2927.field3868, (byte) 42, class138.field2405) - 50, -1761035408);
        }
        int var10 = class77.field1442;
        int var11 = class166.field2925;
        int var12 = class233.field4155;
        int var13 = class198.field3602;
        int var14 = class165.field2919;
        for (int var15 = 0; var15 < 5; var15++) {
            if (class243.field4383[var15]) {
                int var21 = (int) ((double) (-class227.field4060[var15]) + (double) (class227.field4060[var15] * 2 + 1) * Math.random() + Math.sin((double) class259.field4657[var15] / 100.0D * (double) class269.field4809[var15]) * (double) class7.field95[var15]);
                if (var15 == 0) {
                    class166.field2925 += var21;
                }
                if (var15 == 3) {
                    class233.field4155 = class233.field4155 + var21 & 0x7FF;
                }
                if (var15 == 4) {
                    class198.field3602 += var21;
                    if (class198.field3602 < 128) {
                        class198.field3602 = 128;
                    }
                    if (class198.field3602 > 383) {
                        class198.field3602 = 383;
                    }
                }
                if (var15 == 1) {
                    class77.field1442 += var21;
                }
                if (var15 == 2) {
                    class165.field2919 += var21;
                }
            }
        }
        class77.method536(-10918);
        class75.method507(arg3, arg2, arg3 + arg5, arg2 + arg4);
        class179.method1318();
        if (class58.field991 || arg3 > class32.field508 || arg3 + arg5 <= class32.field508 || arg2 > class178.field3145 || (arg2 + arg4) <= class178.field3145) {
            class273.field4854 = 0;
            class45.field726 = false;
        } else {
            class273.field4854 = 0;
            class45.field726 = true;
            int var16 = class231.field4134;
            int var17 = class216.field3931;
            class42.field666 = (var17 - var16) * (class32.field508 - arg3) / arg5 + var16;
            int var18 = class14.field169;
            int var19 = class204.field3685;
            class92.field1626 = (class178.field3145 - arg2) * (var19 - var18) / arg4 + var18;
        }
        class226.method1559(false);
        byte var20 = class213.method1503(126) == 2 ? (byte) class278.field4975 : 1;
        class75.method517(arg3, arg2, arg5, arg4, 0);
        class45.method247(class166.field2925, class77.field1442, class165.field2919, class198.field3602, class233.field4155, class42.field659, class144.field2498, class69.field1249, class124.field2212, class268.field4787, class144.field2496, class138.field2405 + 1, var20, class166.field2927.field3868 >> 7, class166.field2927.field3784 >> 7);
        class226.method1559(false);
        class181.method1334();
        class166.method1205(arg5, 256, arg3, 6, arg2, arg4, 256);
        class259.method1745(true, 256, 256, arg4, arg5, arg3, arg2);
        ((class209) class179.field3156).method1472(class203.field3670, 255);
        class109.method783(arg2, arg5, arg3, 22466, arg4);
        class233.field4155 = var12;
        class166.field2925 = var11;
        class165.field2919 = var14;
        class77.field1442 = var10;
        class198.field3602 = var13;
        if (class82.field1511 && class26.field345.method1398((byte) -121) == 0) {
            class82.field1511 = false;
        }
        if (class82.field1511) {
            class75.method517(arg3, arg2, arg5, arg4, 0);
            class30.method175((byte) 1, false, class200.field3635);
        }
        if (!arg1 && !class82.field1511 && !class58.field991 && class32.field508 >= arg3 && (arg3 + arg5) > class32.field508 && class178.field3145 >= arg2 && arg2 + arg4 > class178.field3145) {
            class7.method32(class178.field3145, arg3, arg2, arg4, 45, arg5, class32.field508);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IBIIII)V")
    public static final void method1726(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field4591++;
        class58.method337(arg3 - arg0, class76.field1406[arg2], arg5, arg0 + arg3, false);
        int var6 = arg4;
        int var7 = 0;
        int var8 = arg4 * arg4;
        int var9 = arg0 * arg0;
        int var10 = var8 << 1;
        int var11 = var9 << 1;
        int var12 = var8 << 2;
        int var13 = var9 << 2;
        int var14 = arg4 << 1;
        int var15 = ((arg4 << 1) - 3) * var11;
        int var16 = ((var7 << 1) + 3) * var10;
        int var17 = var8 - (var14 - 1) * var11;
        int var18 = (1 - var14) * var9 + var10;
        if (arg1 != -51) {
            field4593 = 30L;
        }
        int var19 = (var7 + 1) * var12;
        int var20 = (arg4 - 1) * var13;
        while (var6 > 0) {
            var6--;
            int var21 = arg2 - var6;
            if (var18 < 0) {
                while (var18 < 0) {
                    var17 += var19;
                    var19 += var12;
                    var7++;
                    var18 += var16;
                    var16 += var12;
                }
            }
            int var22 = arg2 + var6;
            if (var17 < 0) {
                var17 += var19;
                var19 += var12;
                var7++;
                var18 += var16;
                var16 += var12;
            }
            int var23 = arg3 - var7;
            var18 += -var20;
            var17 += -var15;
            var15 -= var13;
            int var24 = arg3 + var7;
            class58.method337(var23, class76.field1406[var21], arg5, var24, false);
            var20 -= var13;
            class58.method337(var23, class76.field1406[var22], arg5, var24, false);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)Z")
    public static final boolean method1727(int arg0, int arg1) {
        field4603++;
        class288 var2 = class130.method948(true, arg0);
        if (var2 == null) {
            return false;
        } else if (class286.field5122 == 1 || class286.field5122 == 2 || class106.field1843 == 2) {
            byte[] var3 = var2.field5147.method642(20);
            class157.field2787 = new String(var3, 0, var3.length);
            class74.field1352 = var2.field5140;
            if (class106.field1843 != 0) {
                class283.field5082 = class74.field1352 + 40000;
                class137.field2390 = class283.field5082;
                class148.field2608 = class74.field1352 + 50000;
            }
            return true;
        } else {
            class93 var4 = class266.field4737;
            if (class106.field1843 != 0) {
                var4 = class130.method949((byte) -77, new class93[] { class271.field4818, class148.method1067(-7015, var2.field5140 + 7000) });
            }
            if (arg1 != -25805) {
                method1726(-71, (byte) 107, -59, 34, 67, -21);
            }
            class93 var5 = class266.field4737;
            if (class123.field2197 != null) {
                var5 = class130.method949((byte) -77, new class93[] { class268.field4780, class123.field2197 });
            }
            class93 var6 = class130.method949((byte) -77, new class93[] { class167.field2943, var2.field5147, var4, class136.field2377, class148.method1067(-7015, class104.field1802), class35.field549, class148.method1067(-7015, class276.field4943), var5, class110.field1878, class234.field4186 ? class109.field1868 : class109.field1865, class155.field2706, class104.field1805 ? class109.field1868 : class109.field1865, class180.field3166, class128.field2255 ? class109.field1868 : class109.field1865 });
            try {
                class11.field157.getAppletContext().showDocument(var6.method668(0), "_self");
                return true;
            } catch (Exception var7) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
    public final void method1728(int arg0) {
        field4590++;
        if (this.field4595 == null) {
            return;
        }
        this.field4595.field4604 = this.field4604;
        if (arg0 == 28169) {
            this.field4604.field4595 = this.field4595;
            this.field4604 = null;
            this.field4595 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)V")
    public static final void method1729(int arg0, int arg1) {
        field4606++;
        if (arg1 >= 0 && arg1 < class112.field1917.length && arg0 < -63) {
            class112.field1917[arg1] = !class112.field1917[arg1];
        }
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(B)V")
    public static void method1730(byte arg0) {
        if (arg0 != 93) {
            field4597 = 103;
        }
        field4601 = null;
        field4602 = null;
        field4605 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ltg;B)V")
    public static final void method1731(class181 arg0, byte arg1) {
        int var2 = 19 / ((-arg1 - 13) / 51);
        if (class44.field705 == arg0.field3194) {
            class25.field314[arg0.field3238] = true;
        }
        field4600++;
    }
}
