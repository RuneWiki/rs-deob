import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class154 {

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "[I")
    public static int[] field2680 = new int[256];

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field2679 = 0;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "[J")
    public static long[] field2686 = new long[100];

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "[Lod;")
    public static class155[] field2676;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "[Lod;")
    public static class155[] field2677;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIZ)V")
    public static final void method992(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2685++;
        class42.field785++;
        class135.method908(-105, true);
        class9.method84(true, (byte) -95);
        class135.method908(-105, false);
        class9.method84(false, (byte) -81);
        class168.method1075(1);
        class179.method1134(124);
        if (!class86.field1658) {
            int var5 = class62.field1168;
            if (var5 < class111.field2010 / 256) {
                var5 = class111.field2010 / 256;
            }
            if (class30.field531[4] && var5 < class38.field678[4] + 128) {
                var5 = class38.field678[4] + 128;
            }
            int var6 = class73.field1384 + class31.field550 & 0x7FF;
            class70.method556(2048, var5, arg1, class182.field3171, var5 * 3 + 600, class98.field1814, class40.method278(class96.field1774.field2195, class194.field3403, class96.field1774.field2260, (byte) 101) - 50, var6);
        }
        int var7;
        if (class86.field1658) {
            var7 = class219.method1418(100);
        } else {
            var7 = class198.method1285(-33);
        }
        int var8 = class168.field2878;
        int var9 = class102.field1858;
        int var10 = class35.field628;
        int var11 = class199.field3527;
        int var12 = class38.field675;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class30.field531[var13]) {
                int var20 = (int) ((double) -class147.field2605[var13] + Math.random() * (double) (class147.field2605[var13] * 2 + 1) + Math.sin((double) class96.field1783[var13] / 100.0D * (double) class44.field797[var13]) * (double) class38.field678[var13]);
                if (var13 == 0) {
                    class168.field2878 += var20;
                }
                if (var13 == 2) {
                    class102.field1858 += var20;
                }
                if (var13 == 1) {
                    class35.field628 += var20;
                }
                if (var13 == 3) {
                    class38.field675 = class38.field675 + var20 & 0x7FF;
                }
                if (var13 == 4) {
                    class199.field3527 += var20;
                    if (class199.field3527 < 128) {
                        class199.field3527 = 128;
                    }
                    if (class199.field3527 > 383) {
                        class199.field3527 = 383;
                    }
                }
            }
        }
        class99.method707(arg3, arg0, arg3 + arg2, arg0 + arg1);
        class206.method1345();
        int var14 = class7.field151;
        int var15 = class27.field486;
        if (var15 >= arg3 && var15 < arg3 + arg2 && var14 >= arg0 && arg0 + arg1 > var14) {
            class59.field1111 = true;
            int var16 = class60.field1122;
            class192.field3326 = 0;
            int var17 = class117.field2092;
            int var18 = class160.field2765;
            class71.field1359 = (var18 - var16) * (class27.field486 - arg3) / arg2 + var16;
            int var19 = class196.field3470;
            class109.field1998 = (var19 - var17) * (class7.field151 - arg0) / arg1 + var17;
        } else {
            class59.field1111 = false;
            class192.field3326 = 0;
        }
        class74.method581((byte) -91);
        class99.method688(arg3, arg0, arg2, arg1, 0);
        class114.method801(class168.field2878, class35.field628, class102.field1858, class199.field3527, class38.field675, var7);
        class74.method581((byte) -118);
        class76.method587();
        class88.method648(arg3, 256, arg0, arg2, 256, arg1, arg4);
        class41.method284((byte) -96, arg2, 256, arg1, arg3, arg0, 256);
        ((class74) class206.field3689).method577(class102.field1855, 115);
        class42.method286(arg1, arg3, arg2, (byte) -128, arg0);
        class102.field1858 = var9;
        class168.field2878 = var8;
        class38.field675 = var12;
        class199.field3527 = var11;
        class35.field628 = var10;
        if (class179.field3100 && class194.method1244(false, true, 5270) == 0) {
            class179.field3100 = false;
        }
        if (class179.field3100) {
            class99.method688(arg3, arg0, arg2, arg1, 0);
            class151.method976(false, (byte) 108, class172.field2997);
        }
        if (!class179.field3100 && !class58.field1086 && arg3 <= var15 && arg2 + arg3 > var15 && arg0 <= var14 && arg0 + arg1 > var14) {
            class202.method1303(arg0, var14, (byte) 103, arg2, arg3, arg1, var15);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static void method993(int arg0) {
        field2677 = null;
        field2686 = null;
        field2680 = null;
        if (arg0 != -1) {
            method997(-92, null, -123, (byte) -47, 104, -69, -109);
        }
        field2676 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)V")
    public static final void method994(int arg0, int arg1) {
        field2682++;
        class153 var2 = class119.field2117;
        synchronized (class119.field2117) {
            class30.field535 = arg0;
            if (arg1 != -1) {
                method996(-15, (byte) -17);
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZI)I")
    public static final int method995(boolean arg0, int arg1) {
        field2678++;
        if (!arg0) {
            method995(false, 24);
        }
        if (arg1 >= 65 && arg1 <= 90 || arg1 >= 192 && arg1 <= 222 && arg1 != 215) {
            return arg1 + 32;
        } else if (arg1 == 159) {
            return 255;
        } else if (arg1 == 140) {
            return 156;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)Ltb;")
    public static final class202 method996(int arg0, byte arg1) {
        field2681++;
        class202 var2 = (class202) class104.field1894.method1178((long) arg0, 14176);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class66.field1242.method1466(class46.method349(arg0, 930751783), class153.method986(5, arg0), (byte) -127);
        int var4 = -49 / ((-arg1 - 20) / 54);
        class202 var5 = new class202();
        var5.field3584 = arg0;
        if (var3 != null) {
            var5.method1305(new class66(var3), (byte) -51);
        }
        var5.method1301(-124);
        class104.field1894.method1183((byte) 125, var5, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILld;IBIII)V")
    public static final void method997(int arg0, class124 arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field2684++;
        class168.method1066(arg1.field2260, arg2, arg6, arg0, arg5, arg4, arg1.field2195, arg3 - 4);
        if (arg3 != -94) {
            method996(72, (byte) 62);
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
    public static final void method998(int arg0) {
        if (arg0 != 12715) {
            field2677 = null;
        }
        field2683++;
        if (class32.field565 > class202.field3601) {
            class202.field3601 += class202.field3601 / 30.0D;
            if (class32.field565 < class202.field3601) {
                class202.field3601 = class32.field565;
            }
            class157.method1033((byte) 14);
        } else if (class32.field565 < class202.field3601) {
            class202.field3601 -= class202.field3601 / 30.0D;
            if (class202.field3601 < class32.field565) {
                class202.field3601 = class32.field565;
            }
            class157.method1033((byte) 14);
        }
        if (class77.field1495 == -1 || class54.field994 == -1) {
            return;
        }
        int var1 = class77.field1495 - class2.field38;
        if (var1 < 2 || var1 > 2) {
            var1 >>= 0x4;
        }
        class2.field38 += var1;
        int var2 = class54.field994 - class3.field46;
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        class3.field46 += var2;
        if (var1 == 0 && var2 == 0) {
            class77.field1495 = -1;
            class54.field994 = -1;
        }
        class157.method1033((byte) 14);
    }
}
