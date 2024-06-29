import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class295 {

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "Z")
    public static boolean field4900 = false;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field4901 = 0;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "S")
    public static short field4902 = 32767;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "Z")
    public static boolean field4905 = true;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "Lsi;")
    public static class264 field4899;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V", line = 35)
    public static final void method2087(byte arg0) {
        class183.method1270(false, -1);
        System.gc();
        if (arg0 != 125) {
            field4900 = false;
        }
        class310.method2165(arg0 ^ 0x78, 25);
        field4898++;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZI)Lqn;", line = 72)
    public static final class33 method2088(boolean arg0, int arg1) {
        field4903++;
        class33 var2 = (class33) class196.field3006.method1539(-94, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = class180.field2801.method1504(arg1, !arg0, 1);
        } else {
            var3 = class111.field1654.method1504(arg1 & 0x7FFF, true, 1);
        }
        class33 var4 = new class33();
        if (arg0) {
            return (class33) null;
        }
        if (var3 != null) {
            var4.method274(new class313(var3), (byte) -95);
        }
        if (arg1 >= 32768) {
            var4.method284((byte) 124);
        }
        class196.field3006.method1538(94, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 107)
    public static void method2089(int arg0) {
        if (arg0 == -1769) {
            field4899 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V", line = 173)
    public static final void method2090(int arg0) {
        field4904++;
        int var1 = 0;
        int var2 = -127 % ((-arg0 - 48) / 34);
        while (var1 < class99.field1440) {
            int var3 = class166.field2611[var1];
            class233 var4 = class329.field5377[var3];
            int var5 = class159.field2552.method2224(-121);
            if ((var5 & 0x80) != 0) {
                var5 += class159.field2552.method2224(-119) << 8;
            }
            if ((var5 & 0x8) != 0) {
                var4.field4793 = class159.field2552.method2198(-430);
                var4.field4728 = 100;
            }
            if ((var5 & 0x20) != 0) {
                int var6 = class159.field2552.method2238(-7946);
                int var7 = class159.field2552.method2220(-21362);
                var4.method2023(class58.field875, true, var6, var7);
            }
            if ((var5 & 0x2) != 0) {
                if (var4.field3702.method985((byte) -82)) {
                    class146.method1043(128, var4);
                }
                var4.method1610(-14884, class38.method307(class159.field2552.method2250(-1613178296), 0));
                var4.method2028((byte) -124, var4.field3702.field2220);
                var4.field4722 = var4.field3702.field2202;
                var4.field4732 = var4.field3702.field2228;
                if (var4.field3702.method985((byte) -126)) {
                    class358.method2492(-121, var4.field4757[0], var4.field4762[0], var4, class120.field1779, 0, (class39) null, (class126) null);
                }
            }
            if ((var5 & 0x4) != 0) {
                int var8 = class159.field2552.method2215(true);
                int var9 = class159.field2552.method2205(3);
                if (var8 == 65535) {
                    var8 = -1;
                }
                boolean var10 = true;
                if (var8 != -1 && var4.field4784 != -1 && class68.method476((byte) 102, class214.method1455((byte) -6, var8).field2675).field2011 < class68.method476((byte) 54, class214.method1455((byte) -6, var4.field4784).field2675).field2011) {
                    var10 = false;
                }
                if (var10) {
                    var4.field4718 = 1;
                    var4.field4724 = var9 >> 16;
                    var4.field4712 = 0;
                    var4.field4784 = var8;
                    var4.field4701 = 0;
                    var4.field4777 = (var9 & 0xFFFF) + class58.field875;
                    if (var4.field4777 > class58.field875) {
                        var4.field4701 = -1;
                    }
                    if (var4.field4784 != -1 && class58.field875 == var4.field4777) {
                        int var11 = class214.method1455((byte) -6, var4.field4784).field2675;
                        if (var11 != -1) {
                            class131 var12 = class68.method476((byte) 107, var11);
                            if (var12 != null && var12.field1988 != null) {
                                class276.method1970(var12, false, var4.field4783, 110, var4.field4796, 0);
                            }
                        }
                    }
                }
            }
            if ((var5 & 0x40) != 0) {
                int var13 = class159.field2552.method2241((byte) 66);
                if (var13 == 65535) {
                    var13 = -1;
                }
                int var14 = class159.field2552.method2216((byte) 92);
                class190.method1315(var14, 8600, var4, var13);
            }
            if ((var5 & 0x1) != 0) {
                var4.field4695 = class159.field2552.method2215(true);
                if (var4.field4695 == 65535) {
                    var4.field4695 = -1;
                }
            }
            if ((var5 & 0x100) != 0) {
                int var15 = class159.field2552.method2220(-21362);
                int[] var16 = new int[var15];
                int[] var17 = new int[var15];
                int[] var18 = new int[var15];
                for (int var19 = 0; var19 < var15; var19++) {
                    int var20 = class159.field2552.method2215(true);
                    if (var20 == 65535) {
                        var20 = -1;
                    }
                    var16[var19] = var20;
                    var17[var19] = class159.field2552.method2224(-121);
                    var18[var19] = class159.field2552.method2241((byte) 66);
                }
                class191.method1321(var18, var17, true, var4, var16);
            }
            if ((var5 & 0x200) != 0) {
                var4.field4735 = class159.field2552.method2227(0);
                var4.field4704 = class159.field2552.method2241((byte) 66);
            }
            if ((var5 & 0x10) != 0) {
                int var21 = class159.field2552.method2224(-126);
                int var22 = class159.field2552.method2238(-7946);
                var4.method2023(class58.field875, true, var21, var22);
                var4.field4705 = class58.field875 + 300;
                var4.field4781 = class159.field2552.method2216((byte) 92);
            }
            var1++;
        }
    }
}
