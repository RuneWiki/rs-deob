import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class177 {

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public int field2833 = -1;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public int field2839 = -1;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public int field2836 = -1;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public int field2838 = -1;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public int field2846 = 0;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
    public int field2851 = -1;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public int field2840 = 0;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public int field2831 = -1;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public int field2844 = -1;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public int field2841 = -1;

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
    public int field2857 = -1;

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "I")
    public int field2858 = -1;

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "I")
    public int field2856 = -1;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public int field2843 = -1;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
    public int field2847 = -1;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public int field2842 = -1;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public int field2835 = -1;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    public int field2849 = 0;

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "I")
    public int field2865 = -1;

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "I")
    public int field2866 = 0;

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "I")
    public int field2863 = -1;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public int field2834 = -1;

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "I")
    public int field2860 = 0;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "I")
    public int field2862 = -1;

    @OriginalMember(owner = "client!fa", name = "O", descriptor = "I")
    public int field2871 = 0;

    @OriginalMember(owner = "client!fa", name = "M", descriptor = "I")
    public int field2869 = 0;

    @OriginalMember(owner = "client!fa", name = "K", descriptor = "I")
    public int field2867 = 0;

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "I")
    public int field2855 = 0;

    @OriginalMember(owner = "client!fa", name = "R", descriptor = "I")
    public int field2874 = -1;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
    public int field2852 = -1;

    @OriginalMember(owner = "client!fa", name = "N", descriptor = "I")
    public int field2870 = 0;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    public int field2850 = -1;

    @OriginalMember(owner = "client!fa", name = "P", descriptor = "I")
    public static int field2872 = 0;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!fa", name = "L", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!fa", name = "Q", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "Ljl;")
    public static class238 field2848;

    @OriginalMember(owner = "client!fa", name = "C", descriptor = "[[I")
    public int[][] field2859;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BLhi;)V")
    public final void method1219(byte arg0, class264 arg1) {
        field2868++;
        if (arg0 <= 96) {
            this.field2831 = 76;
        }
        while (true) {
            int var3 = arg1.method1779(-51);
            if (var3 == 0) {
                return;
            }
            this.method1230(0, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public static final void method1220(int arg0) {
        if (arg0 > -109) {
            field2872 = 4;
        }
        class44 var1 = (class44) class144.field2328.method365(3);
        field2853++;
        while (var1 != null) {
            if (var1.field523 == -1) {
                var1.field516 = 0;
                class170.method1191((byte) 120, var1);
            } else {
                var1.method544(117);
            }
            var1 = (class44) class144.field2328.method372((byte) 7);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V")
    public static final void method1221(int arg0, int arg1) {
        if (arg1 <= 98) {
            return;
        }
        field2864++;
        if (class130.field2178 == 0) {
            class93.field1326.method773(arg0, (byte) -109);
        } else {
            class20.field236 = arg0;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)J")
    public static final long method1222(int arg0, int arg1, int arg2) {
        class99 var3 = class273.field4415[arg0][arg1][arg2];
        return var3 == null || var3.field1502 == null ? 0L : var3.field1502.field3719;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)Z")
    public static final boolean method1223(int arg0) {
        field2832++;
        if (arg0 < 82) {
            field2861 = 22;
        }
        if (class256.field4096) {
            try {
                class27.method184((byte) 81, "showVideoAd", class250.field4006.field4090);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(III)V")
    public static final void method1224(int arg0, int arg1, int arg2) {
        field2854++;
        class294 var3 = class73.method560(arg1, 2);
        int var4 = var3.field4653;
        int var5 = var3.field4660;
        int var6 = var3.field4659;
        int var7 = class197.field3180[var6 - var4];
        if (arg2 < 0 || var7 < arg2) {
            arg2 = 0;
        }
        int var8 = var7 << var4;
        class273.method1841(var5, 4547, var8 & arg2 << var4 | ~var8 & class108.field1876[var5]);
        if (arg0 > -117) {
            method1226(-20);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
    public static final void method1225(byte arg0) {
        if (arg0 != 42) {
            method1227((class138) null);
        }
        class92.field1306.method1834(arg0 - 42);
        field2845++;
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V")
    public static void method1226(int arg0) {
        if (arg0 == -22336) {
            field2848 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lwb;)V")
    public static final void method1227(class138 arg0) {
        for (int var1 = arg0.field2272; var1 <= arg0.field2289; var1++) {
            for (int var2 = arg0.field2284; var2 <= arg0.field2285; var2++) {
                class99 var3 = class273.field4415[arg0.field2287][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field1503; var4++) {
                        if (var3.field1496[var4] == arg0) {
                            var3.field1503--;
                            for (int var5 = var4; var5 < var3.field1503; var5++) {
                                var3.field1496[var5] = var3.field1496[var5 + 1];
                                var3.field1507[var5] = var3.field1507[var5 + 1];
                            }
                            var3.field1496[var3.field1503] = null;
                            break;
                        }
                    }
                    var3.field1492 = 0;
                    for (int var6 = 0; var6 < var3.field1503; var6++) {
                        var3.field1492 |= var3.field1507[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)V")
    public final void method1228(int arg0) {
        field2873++;
        int var2 = 54 / ((arg0 + 48) / 49);
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(III)Lid;")
    public static final class233 method1229(int arg0, int arg1, int arg2) {
        class99 var3 = class273.field4415[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class233 var4 = var3.field1502;
            var3.field1502 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILhi;I)V")
    private final void method1230(int arg0, class264 arg1, int arg2) {
        field2837++;
        if (arg2 == 1) {
            this.field2862 = arg1.method1777(-92);
            this.field2874 = arg1.method1777(-127);
            if (this.field2874 == 65535) {
                this.field2874 = -1;
            }
            if (this.field2862 == 65535) {
                this.field2862 = -1;
            }
        } else if (arg2 == 2) {
            this.field2858 = arg1.method1777(-92);
        } else if (arg2 == 3) {
            this.field2852 = arg1.method1777(-45);
        } else if (arg2 == 4) {
            this.field2834 = arg1.method1777(arg0 - 59);
        } else if (arg2 == 5) {
            this.field2847 = arg1.method1777(arg0 - 116);
        } else if (arg2 == 6) {
            this.field2831 = arg1.method1777(-105);
        } else if (arg2 == 7) {
            this.field2865 = arg1.method1777(arg0 - 70);
        } else if (arg2 == 8) {
            this.field2856 = arg1.method1777(-95);
        } else if (arg2 == 9) {
            this.field2838 = arg1.method1777(-44);
        } else if (arg2 == 26) {
            this.field2870 = (short) (arg1.method1779(-73) * 4);
            this.field2869 = (short) (arg1.method1779(-96) * 4);
        } else if (arg2 == 27) {
            if (this.field2859 == null) {
                this.field2859 = new int[12][];
            }
            int var4 = arg1.method1779(-76);
            this.field2859[var4] = new int[6];
            for (int var5 = 0; var5 < 6; var5++) {
                this.field2859[var4][var5] = arg1.method1756(arg0 - 91);
            }
        } else if (arg2 == 29) {
            this.field2860 = arg1.method1779(arg0 - 96);
        } else if (arg2 == 30) {
            this.field2855 = arg1.method1777(arg0 - 106);
        } else if (arg2 == 31) {
            this.field2866 = arg1.method1779(arg0 - 85);
        } else if (arg2 == 32) {
            this.field2849 = arg1.method1777(-123);
        } else if (arg2 == 33) {
            this.field2840 = arg1.method1756(-114);
        } else if (arg2 == 34) {
            this.field2867 = arg1.method1779(-116);
        } else if (arg2 == 35) {
            this.field2846 = arg1.method1777(-69);
        } else if (arg2 == 36) {
            this.field2871 = arg1.method1756(-100);
        } else if (arg2 == 37) {
            this.field2841 = arg1.method1779(-121);
        } else if (arg2 == 38) {
            this.field2844 = arg1.method1777(-67);
        } else if (arg2 == 39) {
            this.field2850 = arg1.method1777(-87);
        } else if (arg2 == 40) {
            this.field2835 = arg1.method1777(arg0 ^ 0xFFFFFFAB);
        } else if (arg2 == 41) {
            this.field2842 = arg1.method1777(-86);
        } else if (arg2 == 42) {
            this.field2863 = arg1.method1777(arg0 - 68);
        } else if (arg2 == 43) {
            arg1.method1777(-73);
        } else if (arg2 == 44) {
            arg1.method1777(-72);
        } else if (arg2 == 45) {
            arg1.method1777(-79);
        } else if (arg2 == 46) {
            this.field2836 = arg1.method1777(-56);
        } else if (arg2 == 47) {
            this.field2857 = arg1.method1777(-95);
        } else if (arg2 == 48) {
            this.field2833 = arg1.method1777(arg0 - 118);
        } else if (arg2 == 49) {
            this.field2839 = arg1.method1777(-89);
        } else if (arg2 == 50) {
            this.field2851 = arg1.method1777(-72);
        } else if (arg2 == 51) {
            this.field2843 = arg1.method1777(-89);
        }
        if (arg0 != 0) {
            method1221(124, -102);
        }
    }
}
