import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class49 {

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "Lob;")
    public class134 field835 = new class134();

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    public static int field834 = 0;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "Lpf;")
    public static class17 field825 = new class17(50);

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    public static int field838 = 0;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "Lpf;")
    public static class17 field837 = new class17(64);

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "Z")
    public static boolean field839 = true;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    public static int field841 = 0;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "[Lck;")
    public static class163[] field843 = new class163[14];

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "Ljava/lang/String;")
    public static String field844 = "Loading defaults - ";

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "Z")
    public static boolean field845 = false;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "Lob;")
    private class134 field836;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "[I")
    public static int[] field842;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)Lob;")
    public final class134 method309(int arg0) {
        class134 var2 = this.field835.field2209;
        field826++;
        if (this.field835 == var2) {
            this.field836 = null;
            return null;
        }
        if (arg0 != 0) {
            this.method311(72, (class134) null);
        }
        this.field836 = var2.field2209;
        return var2;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lda;IIIII)V")
    public static final void method310(class312 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class107.field1759 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class21.field379) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class28.field479 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class174 var14 = class90.field1498[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class245.field4123[var11][var12 + 1][var13] + class245.field4123[var11][var12][var13] + class245.field4123[var11][var12][var13 + 1] + class245.field4123[var11][var12 + 1][var13 + 1]) / 4 - (class245.field4123[arg1][arg2 + 1][arg3] + class245.field4123[arg1][arg2][arg3] + class245.field4123[arg1][arg2][arg3 + 1] + class245.field4123[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class184 var16 = var14.field2800;
                                    if (var16 != null) {
                                        if (var16.field2935.method1634()) {
                                            arg0.method1635(var16.field2935, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field2937 != null && var16.field2937.method1634()) {
                                            arg0.method1635(var16.field2937, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field2814; var17++) {
                                        class73 var18 = var14.field2812[var17];
                                        if (var18 != null && var18.field1262.method1634() && (var18.field1270 == var12 || var7 == var12) && (var18.field1266 == var13 || var9 == var13)) {
                                            int var19 = var18.field1269 + 1 - var18.field1270;
                                            int var20 = var18.field1276 + 1 - var18.field1266;
                                            arg0.method1635(var18.field1262, (var18.field1270 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field1266 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILob;)V")
    public final void method311(int arg0, class134 arg1) {
        field831++;
        if (arg1.field2202 != null) {
            arg1.method993(32);
        }
        arg1.field2209 = this.field835;
        arg1.field2202 = this.field835.field2202;
        arg1.field2202.field2209 = arg1;
        arg1.field2209.field2202 = arg1;
        if (arg0 < 74) {
            method310((class312) null, 51, -5, 96, -72, 33);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)Lob;")
    public final class134 method312(byte arg0) {
        int var2 = 77 / ((arg0 + 4) / 57);
        class134 var3 = this.field836;
        field833++;
        if (this.field835 == var3) {
            this.field836 = null;
            return null;
        } else {
            this.field836 = var3.field2209;
            return var3;
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(ILob;)V")
    public final void method313(int arg0, class134 arg1) {
        if (arg1.field2202 != null) {
            arg1.method993(arg0 ^ 0x21);
        }
        arg1.field2202 = this.field835;
        arg1.field2209 = this.field835.field2209;
        if (arg0 != 1) {
            field825 = null;
        }
        field828++;
        arg1.field2202.field2209 = arg1;
        arg1.field2209.field2202 = arg1;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)V")
    public static void method314(byte arg0) {
        field842 = null;
        field825 = null;
        field844 = null;
        field837 = null;
        field843 = null;
        if (arg0 != 48) {
            field844 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLaj;Laj;)V")
    public static final void method315(byte arg0, class151 arg1, class151 arg2) {
        class25.field450 = class131.method974(class21.field380, arg1, 0, 0, arg2);
        field832++;
        if (arg0 == 66) {
            class11.field195 = (class164) class25.field450;
            class169.field2732 = class131.method974(class50.field848, arg1, 0, 0, arg2);
            class183.field2930 = class131.method974(class110.field1805, arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)Lob;")
    public final class134 method316(int arg0) {
        int var2 = -6 % ((28 - arg0) / 45);
        field830++;
        class134 var3 = this.field835.field2209;
        if (this.field835 == var3) {
            return null;
        } else {
            var3.method993(32);
            return var3;
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V")
    public final void method317(int arg0) {
        if (arg0 <= 10) {
            field841 = -74;
        }
        field822++;
        while (true) {
            class134 var2 = this.field835.field2209;
            if (this.field835 == var2) {
                this.field836 = null;
                return;
            }
            var2.method993(32);
        }
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)Lob;")
    public final class134 method318(int arg0) {
        class134 var2 = this.field836;
        field829++;
        if (this.field835 == var2) {
            this.field836 = null;
            return null;
        }
        this.field836 = var2.field2202;
        if (arg0 < 18) {
            field840 = 47;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)Lob;")
    public final class134 method319(int arg0) {
        if (arg0 < 74) {
            field840 = 65;
        }
        field823++;
        class134 var2 = this.field835.field2202;
        if (this.field835 == var2) {
            this.field836 = null;
            return null;
        } else {
            this.field836 = var2.field2202;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILdl;II)V")
    public static final void method320(int arg0, class123 arg1, int arg2, int arg3) {
        if ((arg2 & 0x2) != 0) {
            int var4 = class136.field2239.method1806(-1);
            if (var4 == 65535) {
                var4 = -1;
            }
            int var5 = class136.field2239.method1767(255);
            class115.method881((byte) 13, arg1, var4, var5);
        }
        field824++;
        if ((arg2 & 0x4) != 0) {
            arg1.field746 = class136.field2239.method1769(1);
            if (arg1.field746.charAt(0) == '~') {
                arg1.field746 = arg1.field746.substring(1);
                class160.method1192(arg1.method927(-242, false), 2, 0, arg1.method927(-242, true), arg1.field746, 1464);
            } else if (class16.field314 == arg1) {
                class160.method1192(arg1.method927(-242, false), 2, 0, arg1.method927(-242, true), arg1.field746, 1464);
            }
            arg1.field716 = 0;
            arg1.field768 = 0;
            arg1.field726 = 150;
        }
        if ((arg2 & 0x1) != 0) {
            int var6 = class136.field2239.method1806(-1);
            boolean var7 = (var6 & 0x8000) != 0;
            int var8 = class136.field2239.method1794((byte) 56);
            int var9 = class136.field2239.method1814(-1);
            int var10 = class136.field2239.field4160;
            if (arg1.field2069 != null && arg1.field2081 != null) {
                boolean var11 = false;
                if (var8 <= 1) {
                    if (!var7 && (class69.field1163 && !class146.field2402 || class122.field2042)) {
                        var11 = true;
                    } else if (class42.method255((byte) -95, arg1.field2069)) {
                        var11 = true;
                    }
                }
                if (!var11 && class136.field2238 == 0) {
                    class245.field4120.field4160 = 0;
                    int var12 = -1;
                    class136.field2239.method1796(-128, var9, class245.field4120.field4182, 0);
                    class245.field4120.field4160 = 0;
                    String var14;
                    if (var7) {
                        var6 &= 0x7FFF;
                        class30 var13 = class216.method1543(class245.field4120, (byte) -54);
                        var12 = var13.field502;
                        var14 = var13.field495.method1902(class245.field4120, (byte) -97);
                    } else {
                        var14 = class165.method1238(class95.method677(class151.method1144(class245.field4120, 865122384), 0));
                    }
                    int var15;
                    if (var8 == 1 || var8 == 2) {
                        var15 = var7 ? 17 : 1;
                    } else {
                        var15 = var7 ? 17 : 2;
                    }
                    arg1.field746 = var14.trim();
                    arg1.field716 = var6 & 0xFF;
                    arg1.field768 = var6 >> 8;
                    arg1.field726 = 150;
                    if (var8 == 2) {
                        class246.method1755(0, -1, var12, (String) null, "<img=1>" + arg1.method927(-242, false), var15, "<img=1>" + arg1.method927(-242, true), var14);
                    } else if (var8 == 1) {
                        class246.method1755(0, -1, var12, (String) null, "<img=0>" + arg1.method927(-242, false), var15, "<img=0>" + arg1.method927(-242, true), var14);
                    } else {
                        class246.method1755(0, -1, var12, (String) null, arg1.method927(-242, false), var15, arg1.method927(-242, true), var14);
                    }
                }
            }
            class136.field2239.field4160 = var9 + var10;
        }
        if ((arg2 & 0x80) != 0) {
            int var16 = class136.field2239.method1819(-1741461848);
            int var17 = class136.field2239.method1767(255);
            arg1.method290(class275.field4598, var16, var17, 0);
            arg1.field733 = class275.field4598 + 300;
            arg1.field748 = class136.field2239.method1814(-1);
        }
        if ((arg2 & 0x400) != 0) {
            int var18 = class136.field2239.method1767(255);
            int[] var19 = new int[var18];
            int[] var20 = new int[var18];
            int[] var21 = new int[var18];
            for (int var22 = 0; var22 < var18; var22++) {
                int var23 = class136.field2239.method1806(-1);
                if (var23 == 65535) {
                    var23 = -1;
                }
                var20[var22] = var23;
                var21[var22] = class136.field2239.method1814(-1);
                var19[var22] = class136.field2239.method1818(false);
            }
            class270.method1896(var19, true, var20, var21, arg1);
        }
        if ((arg2 & 0x800) != 0) {
            int var24 = class136.field2239.method1819(-1741461848);
            int var25 = class136.field2239.method1794((byte) -76);
            arg1.method290(class275.field4598, var24, var25, 0);
        }
        if ((arg2 & 0x8) != 0) {
            arg1.field781 = class136.field2239.method1818(false);
            arg1.field758 = class136.field2239.method1818(false);
        }
        if (arg0 < 92) {
            method314((byte) 9);
        }
        if ((arg2 & 0x200) != 0) {
            arg1.field778 = class136.field2239.method1794((byte) -73);
            arg1.field734 = class136.field2239.method1794((byte) -72);
            arg1.field750 = class136.field2239.method1802((byte) -111);
            arg1.field796 = class136.field2239.method1814(-1);
            arg1.field765 = class136.field2239.method1787(-1) + class275.field4598;
            arg1.field708 = class136.field2239.method1806(-1) + class275.field4598;
            arg1.field812 = class136.field2239.method1802((byte) -106);
            arg1.field730 = 1;
            arg1.field755 = 0;
        }
        if ((arg2 & 0x10) != 0) {
            arg1.field764 = class136.field2239.method1806(-1);
            if (arg1.field764 == 65535) {
                arg1.field764 = -1;
            }
        }
        if ((arg2 & 0x100) != 0) {
            int var26 = class136.field2239.method1818(false);
            boolean var27 = true;
            if (var26 == 65535) {
                var26 = -1;
            }
            int var28 = class136.field2239.method1807((byte) -27);
            if (var26 != -1 && arg1.field757 != -1 && class34.method211(class258.method1847(-125, var26).field1404, 3).field2662 < class34.method211(class258.method1847(-119, arg1.field757).field1404, 3).field2662) {
                var27 = false;
            }
            if (var27) {
                arg1.field757 = var26;
                arg1.field751 = (var28 & 0xFFFF) + class275.field4598;
                arg1.field767 = 0;
                arg1.field727 = var28 >> 16;
                arg1.field747 = 0;
                arg1.field742 = 1;
                if (class275.field4598 < arg1.field751) {
                    arg1.field747 = -1;
                }
                if (arg1.field757 != -1 && class275.field4598 == arg1.field751) {
                    int var29 = class258.method1847(-127, arg1.field757).field1404;
                    if (var29 != -1) {
                        class163 var30 = class34.method211(var29, 3);
                        if (var30 != null && var30.field2639 != null) {
                            class131.method980(class16.field314 == arg1, arg1.field771, arg1.field715, 0, (byte) -63, var30);
                        }
                    }
                }
            }
        }
        if ((arg2 & 0x20) == 0) {
            return;
        }
        int var31 = class136.field2239.method1802((byte) 38);
        byte[] var32 = new byte[var31];
        class249 var33 = new class249(var32);
        class136.field2239.method1796(35, var31, var32, 0);
        class77.field1309[arg3] = var33;
        arg1.method923(arg3, var33, 58);
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
    public class49() {
        this.field835.field2209 = this.field835;
        this.field835.field2202 = this.field835;
    }
}
