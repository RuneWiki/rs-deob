import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class124 {

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "Lid;")
    private static class60 field2850 = class11.method72("Drop", (byte) 105);

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "Lid;")
    private static class60 field2857 = class11.method72("Login limit exceeded)3", (byte) -55);

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "Lid;")
    public static class60 field2841 = field2850;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "Lid;")
    public static class60 field2854 = field2857;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2848 = new CRC32();

    @OriginalMember(owner = "client!rf", name = "x", descriptor = "I")
    public static int field2862 = 0;

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "Lid;")
    private static class60 field2863 = class11.method72("Please enter your password)3", (byte) -4);

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "Lid;")
    public static class60 field2861 = field2863;

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "Lfd;")
    public static class40 field2864 = null;

    @OriginalMember(owner = "client!rf", name = "A", descriptor = "Lid;")
    public static class60 field2865 = class11.method72(")4slr)3ws?order=LPWM", (byte) 102);

    @OriginalMember(owner = "client!rf", name = "C", descriptor = "Z")
    public static boolean field2867 = false;

    @OriginalMember(owner = "client!rf", name = "E", descriptor = "[[[B")
    public static byte[][][] field2869 = new byte[4][104][104];

    @OriginalMember(owner = "client!rf", name = "B", descriptor = "Lqd;")
    public static class115 field2866 = new class115(64);

    @OriginalMember(owner = "client!rf", name = "G", descriptor = "Lid;")
    private static class60 field2871 = class11.method72("Members only world", (byte) 2);

    @OriginalMember(owner = "client!rf", name = "F", descriptor = "Lid;")
    public static class60 field2870 = field2871;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public int field2846;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public int field2847;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
    public int field2852;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "I")
    public int field2855;

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
    public int field2860;

    @OriginalMember(owner = "client!rf", name = "D", descriptor = "Le;")
    public static class29 field2868;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "Lha;")
    public class50 field2843;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "Lha;")
    public class50 field2844;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "Lha;")
    public class50 field2851;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "[I")
    public static int[] field2840;

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "[I")
    public static int[] field2859;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIII)V")
    public static final void method978(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class130.method1021(arg4, arg0, arg2 + arg4, arg0 + arg3);
        field2845++;
        class127.method999();
        class23.field556++;
        class55.method397(126, true);
        class136.method1061(true, 20);
        class55.method397(126, false);
        class136.method1061(false, 20);
        class99.method780((byte) 55);
        class69.method521(-1);
        if (!class109.field2661) {
            int var5 = class47.field1248;
            if (class33.field771 / 256 > var5) {
                var5 = class33.field771 / 256;
            }
            int var6 = class157.field3590 + class28.field684 & 0x7FF;
            if (class121.field2788[4] && class136.field3091[4] + 128 > var5) {
                var5 = class136.field3091[4] + 128;
            }
            class52.method388(var6, var5 * 3 + 600, var5, class10.field175, 2047, class50.method381(class46.field1222, class107.field2640.field828, class107.field2640.field854, (byte) 10) - 50, class45.field1186);
        }
        int var7;
        if (class109.field2661) {
            var7 = class33.method251(-14521);
        } else {
            var7 = class151.method1148(-5934);
        }
        int var8 = class140.field3198;
        int var9 = class101.field2461;
        int var10 = class128.field2931;
        int var11 = class63.field1567;
        int var12 = class74.field1787;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class121.field2788[var13]) {
                int var16 = (int) ((double) (class4.field72[var13] * 2 + 1) * Math.random() + Math.sin((double) class153.field3440[var13] / 100.0D * (double) class129.field2940[var13]) * (double) class136.field3091[var13] - (double) class4.field72[var13]);
                if (var13 == 4) {
                    class63.field1567 += var16;
                    if (class63.field1567 < 128) {
                        class63.field1567 = 128;
                    }
                    if (class63.field1567 > 383) {
                        class63.field1567 = 383;
                    }
                }
                if (var13 == 3) {
                    class74.field1787 = class74.field1787 + var16 & 0x7FF;
                }
                if (var13 == 1) {
                    class101.field2461 += var16;
                }
                if (var13 == 2) {
                    class128.field2931 += var16;
                }
                if (var13 == 0) {
                    class140.field3198 += var16;
                }
            }
        }
        int var14 = class43.field1153;
        int var15 = class21.field494;
        if (arg4 <= var14 && var14 < arg4 + arg2 && var15 >= arg0 && var15 < arg0 + arg3) {
            class70.field1709 = 0;
            class70.field1698 = class43.field1153 - arg4;
            class70.field1696 = true;
            class70.field1705 = class21.field494 - arg0;
        } else {
            class70.field1709 = 0;
            class70.field1696 = false;
        }
        class139.method1080((byte) 92);
        class130.method1015(arg4, arg0, arg2, arg3, 0);
        class139.method1080((byte) 75);
        class43.field1151.method599(class140.field3198, class101.field2461, class128.field2931, class63.field1567, class74.field1787, var7);
        class139.method1080((byte) 109);
        class43.field1151.method614();
        class7.method46(arg4, arg2, 107, arg0, arg3);
        class19.method155((byte) 42, arg0, arg4);
        ((class139) class127.field2914).method1084(class75.field1802, -22659);
        class137.method1074(arg4, (byte) 55, arg2, arg0, arg3);
        class101.field2461 = var9;
        class140.field3198 = var8;
        class74.field1787 = var12;
        class63.field1567 = var11;
        class128.field2931 = var10;
        if (class94.field2308 && class18.method145(true, 1, false) == 0) {
            class94.field2308 = false;
        }
        if (arg1 > -80) {
            field2857 = null;
        }
        if (class94.field2308) {
            class130.method1015(arg4, arg0, arg2, arg3, 0);
            class81.method687(false, -1024, class19.field465);
        }
        if (!class94.field2308 && !class135.field3067 && arg4 <= var14 && var14 < arg2 + arg4 && arg0 <= var15 && var15 < arg0 + arg3) {
            class48.method375(false, var14, arg4, arg0, var15);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
    public static final void method979(byte arg0) {
        class22.field519.field2501 = 0;
        class2.field51 = -1;
        class135.field3067 = false;
        class80.field1978 = -1;
        class42.field1119 = 0;
        if (arg0 != 111) {
            return;
        }
        class46.field1200 = 0;
        class48.field1267 = 0;
        class100.field2421 = -1;
        class44.field1161 = 0;
        class80.field1956 = 0;
        class56.field1393.field2501 = 0;
        class94.field2310 = 0;
        field2842++;
        class35.field874 = -1;
        for (int var1 = 0; var1 < class81.field2016.length; var1++) {
            if (class81.field2016[var1] != null) {
                class81.field2016[var1].field807 = -1;
            }
        }
        for (int var2 = 0; var2 < class5.field83.length; var2++) {
            if (class5.field83[var2] != null) {
                class5.field83[var2].field807 = -1;
            }
        }
        class66.method499((byte) -103);
        class45.method348((byte) -69, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class14.field257[var3] = true;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)Laf;")
    public static final class7 method980(int arg0, int arg1) {
        class7 var2 = (class7) class101.field2459.method918(101, (long) arg1);
        field2853++;
        if (var2 != null) {
            return var2;
        }
        int var3 = 59 % ((arg0 - 12) / 53);
        byte[] var4 = class52.field1331.method473((byte) 121, 14, arg1);
        class7 var5 = new class7();
        if (var4 != null) {
            var5.method48(new class103(var4), -75);
        }
        class101.field2459.method914(var5, (long) arg1, (byte) 46);
        return var5;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)V")
    public static void method981(byte arg0) {
        field2840 = null;
        field2861 = null;
        field2850 = null;
        field2869 = null;
        field2859 = null;
        if (arg0 != -51) {
            field2868 = null;
        }
        field2863 = null;
        field2848 = null;
        field2857 = null;
        field2854 = null;
        field2841 = null;
        field2866 = null;
        field2864 = null;
        field2870 = null;
        field2865 = null;
        field2871 = null;
        field2868 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)Z")
    public static final boolean method982(int arg0, int arg1, int arg2) {
        field2856++;
        if (arg0 == 11) {
            arg0 = 10;
        }
        class148 var3 = class31.method238(-29628, arg2);
        if (arg0 >= arg1 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method1125(arg0, (byte) -1);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILef;)V")
    public static final void method983(int arg0, class35 arg1) {
        arg1.field826 = false;
        if (arg1.field875 != -1) {
            class46 var2 = class44.method344(arg1.field875, (byte) -49);
            if (var2 == null || var2.field1218 == null) {
                arg1.field875 = -1;
            } else {
                arg1.field855++;
                if (arg1.field820 < var2.field1218.length && arg1.field855 > var2.field1196[arg1.field820]) {
                    arg1.field820++;
                    arg1.field855 = 1;
                    class75.method569(arg1.field820, arg1.field828, var2, arg0 + 334, arg1.field854);
                }
                if (var2.field1218.length <= arg1.field820) {
                    arg1.field855 = 0;
                    arg1.field820 = 0;
                    class75.method569(arg1.field820, arg1.field828, var2, 333, arg1.field854);
                }
            }
        }
        field2858++;
        if (arg1.field839 != arg0 && arg1.field846 <= class82.field2065) {
            if (arg1.field850 < 0) {
                arg1.field850 = 0;
            }
            int var3 = class13.method81(21299, arg1.field839).field2785;
            if (var3 == -1) {
                arg1.field839 = -1;
            } else {
                class46 var4 = class44.method344(var3, (byte) -56);
                if (var4 == null || var4.field1218 == null) {
                    arg1.field839 = -1;
                } else {
                    arg1.field860++;
                    if (var4.field1218.length > arg1.field850 && var4.field1196[arg1.field850] < arg1.field860) {
                        arg1.field850++;
                        arg1.field860 = 1;
                        class75.method569(arg1.field850, arg1.field828, var4, 333, arg1.field854);
                    }
                    if (arg1.field850 >= var4.field1218.length && (arg1.field850 < 0 || var4.field1218.length <= arg1.field850)) {
                        arg1.field839 = -1;
                    }
                }
            }
        }
        if (arg1.field806 != -1 && arg1.field842 <= 1) {
            class46 var5 = class44.method344(arg1.field806, (byte) -72);
            if (var5.field1202 == 1 && arg1.field844 > 0 && class82.field2065 >= arg1.field851 && arg1.field845 < class82.field2065) {
                arg1.field842 = 1;
                return;
            }
        }
        if (arg1.field806 != -1 && arg1.field842 == 0) {
            class46 var6 = class44.method344(arg1.field806, (byte) -123);
            if (var6 == null || var6.field1218 == null) {
                arg1.field806 = -1;
            } else {
                arg1.field811++;
                if (arg1.field858 < var6.field1218.length && arg1.field811 > var6.field1196[arg1.field858]) {
                    arg1.field858++;
                    arg1.field811 = 1;
                    class75.method569(arg1.field858, arg1.field828, var6, 333, arg1.field854);
                }
                if (arg1.field858 >= var6.field1218.length) {
                    arg1.field853++;
                    arg1.field858 -= var6.field1209;
                    if (var6.field1206 <= arg1.field853) {
                        arg1.field806 = -1;
                    } else if (arg1.field858 >= 0 && var6.field1218.length > arg1.field858) {
                        class75.method569(arg1.field858, arg1.field828, var6, 333, arg1.field854);
                    } else {
                        arg1.field806 = -1;
                    }
                }
                arg1.field826 = var6.field1201;
            }
        }
        if (arg1.field842 > 0) {
            arg1.field842--;
        }
    }
}
