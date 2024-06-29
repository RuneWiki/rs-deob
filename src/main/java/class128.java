import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class128 {

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "Lo;")
    public static class84 field2824 = class15.method124("backleft2", 255);

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "Lo;")
    public static class84 field2819 = class15.method124(" ", 255);

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "Lo;")
    public static class84 field2828 = class15.method124("Prepared visibility map", 255);

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "Lo;")
    public static class84 field2827 = class15.method124("redstone2", 255);

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "Lo;")
    public static class84 field2822 = class15.method124("@gre@1 unread message", 255);

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field2820 = 0;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
    public static int field2830 = 0;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "Lo;")
    private static class84 field2838 = class15.method124("Swap this note at any bank for the equivalent item", 255);

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
    public static int field2837 = 0;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "Lo;")
    public static class84 field2826 = field2838;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "Lp;")
    public static class89 field2836;

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I)V", line = 4)
    public class128(int arg0) {
        class14.field251 = arg0;
        class120.field2684 = System.currentTimeMillis();
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V", line = 14)
    public static void method988(int arg0) {
        field2827 = null;
        field2826 = null;
        field2824 = null;
        field2838 = null;
        field2828 = null;
        field2822 = null;
        field2836 = null;
        if (arg0 <= -117) {
            field2819 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(J)V", line = 31)
    public void method407(long arg0) {
        field2825++;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIZ)I", line = 38)
    public static final int method989(int arg0, int arg1, int arg2, boolean arg3) {
        field2823++;
        int var4 = arg1 / arg0;
        int var5 = arg0 - 1 & arg1;
        int var6 = arg2 / arg0;
        int var7 = arg2 & arg0 - 1;
        if (!arg3) {
            return -107;
        }
        int var8 = class25.method185(var4, var6, false);
        int var9 = class25.method185(var4 + 1, var6, false);
        int var10 = class25.method185(var4, var6 + 1, !arg3);
        int var11 = class25.method185(var4 + 1, var6 + 1, false);
        int var12 = class97.method738(var5, 688514529, var8, arg0, var9);
        int var13 = class97.method738(var5, 688514529, var10, arg0, var11);
        return class97.method738(var7, 688514529, var12, arg0, var13);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "()V", line = 70)
    public void method405() {
        field2831++;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLpc;)V", line = 77)
    public static final synchronized void method990(byte arg0, class92 arg1) {
        field2829++;
        class26.field440 = arg1;
        if (arg0 <= 125) {
            method995(21, -6);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IB)V", line = 88)
    public static final synchronized void method991(int arg0, byte arg1) {
        field2835++;
        if (class26.field440 != null) {
            class26.field440.method544(arg0);
        }
        if (arg1 == -64) {
            class12.method106(arg0, true);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V", line = 111)
    public static final void method992(byte arg0) {
        field2834++;
        class106.field2246.method187(false);
        if (arg0 < 38) {
            field2820 = -2;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class107.field2282[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class116.field2520[var2] = 0L;
        }
        class28.field556 = 0;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IILmc;)I", line = 145)
    public static final int method993(int arg0, int arg1, class75 arg2) {
        field2815++;
        if (arg2.field1578 == null || arg0 >= arg2.field1578.length) {
            return -2;
        }
        try {
            int var3 = 0;
            int[] var4 = arg2.field1578[arg0];
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var4[var3++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var5;
                }
                if (var7 == 1) {
                    var8 = class113.field2450[var4[var3++]];
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 2) {
                    var8 = class69.field1481[var4[var3++]];
                }
                if (var7 == 3) {
                    var8 = class57.field1180[var4[var3++]];
                }
                if (var7 == 4) {
                    int var10 = var4[var3++] << 16;
                    int var11 = var10 + var4[var3++];
                    class75 var12 = class99.method752(var11, arg1 ^ 0x5A94);
                    int var13 = var4[var3++];
                    if (var13 != -1 && (!class126.method970(92, var13).field884 || class21.field390)) {
                        for (int var14 = 0; var14 < var12.field1614.length; var14++) {
                            if (var13 + 1 == var12.field1614[var14]) {
                                var8 += var12.field1576[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class79.field1692[var4[var3++]];
                }
                if (var7 == 6) {
                    var8 = class15.field262[class69.field1481[var4[var3++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class79.field1692[var4[var3++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class107.field2271.field1305;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class85.field1925[var15]) {
                            var8 += class69.field1481[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var4[var3++] << 16;
                    int var17 = var16 + var4[var3++];
                    class75 var18 = class99.method752(var17, 694);
                    int var19 = var4[var3++];
                    if (var19 != -1 && (!class126.method970(-115, var19).field884 || class21.field390)) {
                        for (int var20 = 0; var20 < var18.field1614.length; var20++) {
                            if (var19 + 1 == var18.field1614[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class112.field2434;
                }
                if (var7 == 12) {
                    var8 = class86.field1971;
                }
                if (var7 == 13) {
                    int var21 = class79.field1692[var4[var3++]];
                    int var22 = var4[var3++];
                    var8 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var4[var3++];
                    var8 = method995(-23573, var23);
                }
                if (var7 == 18) {
                    var8 = (class107.field2271.field1380 >> 7) + class106.field2242;
                }
                if (var7 == 19) {
                    var8 = (class107.field2271.field1391 >> 7) + class36.field714;
                }
                if (var7 == 20) {
                    var8 = var4[var3++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var5 += var8;
                    }
                    if (var6 == 1) {
                        var5 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var5 /= var8;
                    }
                    if (var6 == 3) {
                        var5 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var24) {
            if (arg1 != 22562) {
                field2822 = null;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)V", line = 353)
    public static final void method994(int arg0, int arg1, int arg2) {
        field2832++;
        long var3 = (long) ((arg0 << arg1) + arg2);
        class48 var5 = (class48) class126.field2783.method66(124, var3);
        if (var5 != null) {
            class86.field1959.method675((byte) -108, var5);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)I", line = 394)
    public static final int method995(int arg0, int arg1) {
        field2818++;
        class6 var2 = class40.method352((byte) -74, arg1);
        int var3 = var2.field102;
        int var4 = var2.field106;
        int var5 = var2.field99;
        int var6 = class120.field2659[var5 - var3];
        return arg0 == -23573 ? var6 & class79.field1692[var4] >> var3 : 70;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([II)V", line = 419)
    public static final synchronized void method996(int[] arg0, int arg1) {
        int var2 = 0;
        int var3 = arg1 - 7;
        while (var2 < var3) {
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
        }
        var3 += 7;
        while (var2 < var3) {
            arg0[var2++] = 0;
        }
        if (class26.field440 != null) {
            class26.field440.method545(arg0, 0, var3);
        }
        class12.method106(var3, true);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/awt/Graphics;Lfc;III)V", line = 450)
    public static final void method997(int arg0, Graphics arg1, class34 arg2, int arg3, int arg4, int arg5) {
        class5.field74.method707(-60);
        field2821++;
        class60.field1250.method732(0, 0);
        arg2.method323(class35.field695, 55, 28, 16777215, true);
        if (arg4 != -14024) {
            field2830 = -20;
        }
        if (arg5 == 0) {
            arg2.method323(class123.field2758, 55, 41, 65280, true);
        }
        if (arg5 == 1) {
            arg2.method323(class80.field1715, 55, 41, 16776960, true);
        }
        if (arg5 == 2) {
            arg2.method323(class113.field2446, 55, 41, 16711680, true);
        }
        if (arg5 == 3) {
            arg2.method323(class6.field119, 55, 41, 65535, true);
        }
        arg2.method323(class62.field1282, 184, 28, 16777215, true);
        if (arg0 == 0) {
            arg2.method323(class123.field2758, 184, 41, 65280, true);
        }
        if (arg0 == 1) {
            arg2.method323(class80.field1715, 184, 41, 16776960, true);
        }
        if (arg0 == 2) {
            arg2.method323(class113.field2446, 184, 41, 16711680, true);
        }
        arg2.method323(class88.field1996, 324, 28, 16777215, true);
        if (arg3 == 0) {
            arg2.method323(class123.field2758, 324, 41, 65280, true);
        }
        if (arg3 == 1) {
            arg2.method323(class80.field1715, 324, 41, 16776960, true);
        }
        if (arg3 == 2) {
            arg2.method323(class113.field2446, 324, 41, 16711680, true);
        }
        arg2.method323(class86.field1956, 458, 33, 16777215, true);
        class5.field74.method705(0, arg1, 0, 453);
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)Z", line = 503)
    public static final boolean method998(int arg0, int arg1) {
        field2833++;
        if (class111.field2418[arg0]) {
            return true;
        } else if (class63.field1315.method901(arg0, arg1 + 20268)) {
            int var2 = class63.field1315.method917(arg0, (byte) 120);
            if (var2 == 0) {
                class111.field2418[arg0] = true;
                return true;
            }
            if (class60.field1254[arg0] == null) {
                class60.field1254[arg0] = new class75[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class60.field1254[arg0][var3] == null) {
                    byte[] var4 = class63.field1315.method909((byte) -121, var3, arg0);
                    if (var4 != null) {
                        class60.field1254[arg0][var3] = new class75();
                        class60.field1254[arg0][var3].method556(new class27(var4), 31911);
                    }
                }
            }
            if (arg1 != -20142) {
                method997(23, null, null, -72, 63, -31);
            }
            class111.field2418[arg0] = true;
            return true;
        } else {
            return false;
        }
    }
}
