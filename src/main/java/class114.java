import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class114 extends class170 {

    @OriginalMember(owner = "client!hd", name = "R", descriptor = "I")
    private int field1906 = 12288;

    @OriginalMember(owner = "client!hd", name = "V", descriptor = "I")
    private int field1910 = 2048;

    @OriginalMember(owner = "client!hd", name = "Y", descriptor = "I")
    private int field1913 = 8192;

    @OriginalMember(owner = "client!hd", name = "cb", descriptor = "I")
    private int field1917 = 0;

    @OriginalMember(owner = "client!hd", name = "gb", descriptor = "I")
    private int field1921 = 2048;

    @OriginalMember(owner = "client!hd", name = "hb", descriptor = "I")
    private int field1922 = 0;

    @OriginalMember(owner = "client!hd", name = "db", descriptor = "I")
    private int field1918 = 4096;

    @OriginalMember(owner = "client!hd", name = "S", descriptor = "I")
    public static int field1907 = 0;

    @OriginalMember(owner = "client!hd", name = "bb", descriptor = "Z")
    public static boolean field1916 = true;

    @OriginalMember(owner = "client!hd", name = "T", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!hd", name = "U", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!hd", name = "W", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!hd", name = "X", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!hd", name = "Z", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!hd", name = "ab", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!hd", name = "eb", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!hd", name = "fb", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!hd", name = "ib", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!hd", name = "kb", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!hd", name = "jb", descriptor = "Ljava/awt/Frame;")
    public static Frame field1924;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(BI)I", line = 5)
    public static final int method686(byte arg0, int arg1) {
        if (arg0 <= 26) {
            return -59;
        } else {
            field1919++;
            return arg1 & 0x7F;
        }
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V", line = 57)
    public class114() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)Z", line = 47)
    public static final boolean method687(int arg0, byte arg1) {
        field1920++;
        if (arg1 == -102) {
            return (arg0 >> 30 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(BII)Z", line = 62)
    private final boolean method688(byte arg0, int arg1, int arg2) {
        if (arg0 != -51) {
            this.field1922 = -16;
        }
        int var4 = (arg2 - arg1) * this.field1906 >> 12;
        int var5 = class61.field1151[(var4 * 255 & 0xFFB32) >> 12];
        int var6 = (var5 << 12) / this.field1906;
        int var7 = (var6 << 12) / this.field1913;
        field1911++;
        int var8 = this.field1918 * var7 >> 12;
        return var8 > (arg1 + arg2) && arg1 + arg2 > -var8;
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)V", line = 80)
    public static void method689(int arg0) {
        field1924 = null;
        if (arg0 != 4096) {
            field1924 = (Frame) null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BI)[I", line = 90)
    public final int[] method69(byte arg0, int arg1) {
        field1923++;
        if (arg0 != 85) {
            method687(10, (byte) -112);
        }
        int[] var3 = this.field2977.method1838(false, arg1);
        if (this.field2977.field4552) {
            int var4 = class307.field5221[arg1] - 2048;
            for (int var5 = 0; var5 < class185.field3225; var5++) {
                int var6 = class118.field2002[var5] - 2048;
                int var7 = this.field1910 + var6;
                int var8 = this.field1917 + var4;
                int var9 = var7 >= -2048 ? var7 : var7 + 4096;
                int var10 = var9 > 2048 ? var9 - 4096 : var9;
                int var11 = var8 >= -2048 ? var8 : var8 + 4096;
                int var12 = var11 <= 2048 ? var11 : var11 - 4096;
                int var13 = this.field1921 + var4;
                int var14 = var13 >= -2048 ? var13 : var13 + 4096;
                int var15 = var14 > 2048 ? var14 - 4096 : var14;
                int var16 = this.field1922 + var6;
                int var17 = var16 >= -2048 ? var16 : var16 + 4096;
                int var18 = var17 > 2048 ? var17 - 4096 : var17;
                var3[var5] = this.method688((byte) -51, var10, var12) || this.method691(var18, -19661, var15) ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIILja;I)Lja;", line = 141)
    public static final class60 method690(int arg0, int arg1, int arg2, int arg3, int arg4, class60 arg5, int arg6) {
        long var7 = (long) arg3;
        field1925++;
        if (arg2 != -50) {
            field1924 = (Frame) null;
        }
        class60 var9 = (class60) class201.field3559.method1836(var7, 0);
        if (var9 == null) {
            class168 var10 = class168.method1106(class147.field2539, arg3, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1105(64, 768, -50, -10, -50);
            class201.field3559.method1835((byte) -81, var7, var9);
        }
        int var11 = arg5.method205();
        int var12 = arg5.method190();
        int var13 = arg5.method182();
        int var14 = arg5.method206();
        class60 var15 = var9.method212(true, true);
        if (arg1 != 0) {
            var15.method195(arg1);
        }
        if (class247.field4247) {
            class126 var16 = (class126) var15;
            if (arg0 != class64.method427(arg4 + var11, arg6 + var13, class133.field2315, (byte) 117) || class64.method427(arg4 + var12, arg6 - -var14, class133.field2315, (byte) 100) != arg0) {
                for (int var17 = 0; var17 < var16.field2120; var17++) {
                    var16.field2124[var17] += class64.method427(var16.field2109[var17] + arg4, var16.field2144[var17] + arg6, class133.field2315, (byte) 125) - arg0;
                }
                var16.field2136.field893 = false;
                var16.field2121.field3344 = false;
            }
        } else {
            class29 var18 = (class29) var15;
            if (arg0 != class64.method427(arg4 + var11, arg6 + var13, class133.field2315, (byte) 121) || class64.method427(arg4 + var12, arg6 - -var14, class133.field2315, (byte) 98) != arg0) {
                for (int var19 = 0; var19 < var18.field621; var19++) {
                    var18.field620[var19] += class64.method427(var18.field607[var19] + arg4, var18.field600[var19] + arg6, class133.field2315, (byte) 125) - arg0;
                }
                var18.field608 = false;
            }
        }
        return var15;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V", line = 222)
    public final void method267(int arg0) {
        if (arg0 != -2718) {
            this.field1910 = -118;
        }
        field1909++;
        class39.method265(6361);
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(III)Z", line = 249)
    private final boolean method691(int arg0, int arg1, int arg2) {
        field1915++;
        if (arg1 != -19661) {
            return true;
        }
        int var4 = (arg0 + arg2) * this.field1906 >> 12;
        int var5 = class61.field1151[(var4 * 255 & 0xFF3FB) >> 12];
        int var6 = (var5 << 12) / this.field1906;
        int var7 = (var6 << 12) / this.field1913;
        int var8 = this.field1918 * var7 >> 12;
        return var8 > arg2 - arg0 && arg2 - arg0 > -var8;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IILcf;II)V", line = 272)
    public static final void method692(int arg0, int arg1, class123 arg2, int arg3, int arg4) {
        field1912++;
        if (class163.field2796 == arg2 || class275.field4769 >= 400) {
            return;
        }
        class128 var10;
        if (~arg2.field2060 == arg0) {
            boolean var5 = true;
            if (class163.field2796.field2093 != -1 && arg2.field2093 != -1) {
                int var6 = class163.field2796.field2081 > arg2.field2081 ? class163.field2796.field2081 : arg2.field2081;
                int var7 = class163.field2796.field2093 >= arg2.field2093 ? arg2.field2093 : class163.field2796.field2093;
                int var8 = 5 - (-(var6 * 10 / 100) - var7);
                int var9 = class163.field2796.field2081 - arg2.field2081;
                if (var9 < 0) {
                    var9 = -var9;
                }
                if (var8 < var9) {
                    var5 = false;
                }
            }
            if (arg2.field2074 > arg2.field2081) {
                var10 = class28.method177((byte) -93, new class128[] { arg2.method753(-125), var5 ? class292.method2008(-18955, arg2.field2081, class163.field2796.field2081) : class11.field378, class176.field3104, class278.field4798, class257.method1811(arg2.field2081, (byte) -127), class195.field3430, class257.method1811(arg2.field2074 - arg2.field2081, (byte) 21), class157.field2692 });
            } else {
                var10 = class28.method177((byte) -54, new class128[] { arg2.method753(-88), var5 ? class292.method2008(-18955, arg2.field2081, class163.field2796.field2081) : class11.field378, class176.field3104, class278.field4798, class257.method1811(arg2.field2081, (byte) 18), class157.field2692 });
            }
        } else {
            var10 = class28.method177((byte) -55, new class128[] { arg2.method753(-63), class176.field3104, class150.field2564, class257.method1811(arg2.field2060, (byte) -126), class157.field2692 });
        }
        if (class28.field591 == 1) {
            class89.method559(arg3, class245.field4187, (short) 4, arg4, class28.method177((byte) -88, new class128[] { class194.field3381, class188.field3276, var10 }), 1, (long) arg1);
            class6.field126++;
        } else if (!class31.field685) {
            for (int var11 = 7; var11 >= 0; var11--) {
                if (class217.field3831[var11] != null) {
                    class194.field3373++;
                    boolean var12 = false;
                    short var13 = 0;
                    if (class98.field1701 == 0 && class217.field3831[var11].method861(10362, class196.field3437)) {
                        if (class163.field2796.field2081 < arg2.field2081) {
                            var13 = 2000;
                        }
                        if (class163.field2796.field2087 != 0 && arg2.field2087 != 0) {
                            if (class163.field2796.field2087 == arg2.field2087) {
                                var13 = 2000;
                            } else {
                                var13 = 0;
                            }
                        }
                    } else if (class216.field3807[var11]) {
                        var13 = 2000;
                    }
                    short var14 = class222.field3903[var11];
                    short var15 = (short) (var13 + var14);
                    class89.method559(arg3, class217.field3831[var11], var15, arg4, class28.method177((byte) -84, new class128[] { class11.field378, var10 }), arg0 + 2, (long) arg1);
                }
            }
        } else if ((class284.field4879 & 0x8) == 8) {
            class89.method559(arg3, class140.field2398, (short) 17, arg4, class28.method177((byte) -97, new class128[] { class120.field2024, class188.field3276, var10 }), 1, (long) arg1);
            class152.field2613++;
        }
        for (int var16 = 0; var16 < class275.field4769; var16++) {
            if (class117.field1979[var16] == 51) {
                class210.field3725[var16] = class28.method177((byte) -83, new class128[] { class11.field378, var10 });
                break;
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILbg;B)V", line = 421)
    public final void method63(int arg0, class194 arg1, byte arg2) {
        if (arg2 != 13) {
            this.method691(9, -105, -19);
        }
        if (arg0 == 0) {
            this.field1910 = arg1.method1308(-73);
        } else if (arg0 == 1) {
            this.field1917 = arg1.method1308(-52);
        } else if (arg0 == 2) {
            this.field1922 = arg1.method1308(-73);
        } else if (arg0 == 3) {
            this.field1921 = arg1.method1308(-90);
        } else if (arg0 == 4) {
            this.field1906 = arg1.method1308(-76);
        } else if (arg0 == 5) {
            this.field1918 = arg1.method1308(arg2 ^ 0xFFFFFF8F);
        } else if (arg0 == 6) {
            this.field1913 = arg1.method1308(-60);
        }
        field1914++;
    }
}
