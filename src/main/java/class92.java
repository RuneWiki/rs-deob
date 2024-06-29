import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class92 extends class7 {

    @OriginalMember(owner = "client!jc", name = "S", descriptor = "Z")
    public static boolean field1836 = false;

    @OriginalMember(owner = "client!jc", name = "bb", descriptor = "[I")
    public static int[] field1845 = new int[1000];

    @OriginalMember(owner = "client!jc", name = "Z", descriptor = "Lvc;")
    public static class212 field1843 = new class212(500);

    @OriginalMember(owner = "client!jc", name = "fb", descriptor = "I")
    public static int field1849 = 1;

    @OriginalMember(owner = "client!jc", name = "ib", descriptor = "I")
    public static int field1852 = 0;

    @OriginalMember(owner = "client!jc", name = "db", descriptor = "Lob;")
    public static class141 field1847 = class175.method1195(40, " loggt sich ein)3");

    @OriginalMember(owner = "client!jc", name = "R", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!jc", name = "T", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!jc", name = "V", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!jc", name = "W", descriptor = "I")
    private int field1840;

    @OriginalMember(owner = "client!jc", name = "X", descriptor = "I")
    private int field1841;

    @OriginalMember(owner = "client!jc", name = "Y", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!jc", name = "ab", descriptor = "I")
    private int field1844;

    @OriginalMember(owner = "client!jc", name = "cb", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!jc", name = "eb", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!jc", name = "hb", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!jc", name = "gb", descriptor = "Lpe;")
    public static class154 field1850;

    @OriginalMember(owner = "client!jc", name = "U", descriptor = "[Lfa;")
    public static class52[] field1838;

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(I)V")
    private class92(int arg0) {
        super(0, false);
        this.method628(10863, arg0);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILog;)V")
    public final void method31(int arg0, int arg1, class146 arg2) {
        if (~arg0 == -1) {
            this.method628(10863, arg2.method1012(-120));
        }
        ++field1846;
        int var5 = -33 / ((arg1 - 66) / 57);
    }

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "(I)V")
    public static void method627(int arg0) {
        field1847 = null;
        field1843 = null;
        field1838 = null;
        field1845 = null;
        int var1 = 114 / (-arg0 / 44);
        field1850 = null;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
    public class92() {
        this(0);
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(II)V")
    private final void method628(int arg0, int arg1) {
        this.field1841 = (arg1 & 255) << 4;
        ++field1839;
        if (arg0 == 10863) {
            this.field1844 = arg1 >> 4 & 4080;
            this.field1840 = arg1 >> 12 & 4080;
        }
    }

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "(I)V")
    public static final void method629(int arg0) {
        if (arg0 == 0) {
            class76.field1562 = null;
            class46.field880 = null;
            ++field1842;
            class143.field2766 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(IB)[[I")
    public final int[][] method51(int arg0, byte arg1) {
        int var3 = -97 % ((-42 - arg1) / 41);
        ++field1835;
        int[][] var4 = super.field97.method1396(arg0, (byte) 45);
        if (super.field97.field4093) {
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            for (int var8 = 0; ~var8 > ~class117.field2272; ++var8) {
                var7[var8] = this.field1840;
                var5[var8] = this.field1844;
                var6[var8] = this.field1841;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "(I)Z")
    public static final boolean method630(int arg0) {
        if (arg0 != 15734) {
            return true;
        } else {
            ++field1837;
            return ~class202.field3820 != -1 ? true : class85.field1690.method460(127);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)Z")
    public static final boolean method631(int arg0, int arg1, int arg2, int arg3) {
        if (!class15.method97(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            int var6 = class110.field2119[arg0][arg1][arg2] - 1;
            int var7 = var6 - 120;
            int var8 = var6 - 230;
            int var9 = var6 - 238;
            if (arg3 < 16) {
                if (arg3 == 1) {
                    if (var4 > class18.field316) {
                        if (!class214.method1399(var4, var6, var5)) {
                            return false;
                        }
                        if (!class214.method1399(var4, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class214.method1399(var4, var7, var5)) {
                            return false;
                        }
                        if (!class214.method1399(var4, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class214.method1399(var4, var8, var5)) {
                        return false;
                    }
                    if (!class214.method1399(var4, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 2) {
                    if (var5 < class35.field710) {
                        if (!class214.method1399(var4, var6, var5 + 128)) {
                            return false;
                        }
                        if (!class214.method1399(var4 + 128, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class214.method1399(var4, var7, var5 + 128)) {
                            return false;
                        }
                        if (!class214.method1399(var4 + 128, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class214.method1399(var4, var8, var5 + 128)) {
                        return false;
                    }
                    if (!class214.method1399(var4 + 128, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 4) {
                    if (var4 < class18.field316) {
                        if (!class214.method1399(var4 + 128, var6, var5)) {
                            return false;
                        }
                        if (!class214.method1399(var4 + 128, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class214.method1399(var4 + 128, var7, var5)) {
                            return false;
                        }
                        if (!class214.method1399(var4 + 128, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class214.method1399(var4 + 128, var8, var5)) {
                        return false;
                    }
                    if (!class214.method1399(var4 + 128, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 8) {
                    if (var5 > class35.field710) {
                        if (!class214.method1399(var4, var6, var5)) {
                            return false;
                        }
                        if (!class214.method1399(var4 + 128, var6, var5)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class214.method1399(var4, var7, var5)) {
                            return false;
                        }
                        if (!class214.method1399(var4 + 128, var7, var5)) {
                            return false;
                        }
                    }
                    if (!class214.method1399(var4, var8, var5)) {
                        return false;
                    }
                    if (!class214.method1399(var4 + 128, var8, var5)) {
                        return false;
                    }
                    return true;
                }
            }
            if (!class214.method1399(var4 + 64, var9, var5 + 64)) {
                return false;
            } else if (arg3 == 16) {
                return class214.method1399(var4, var8, var5 + 128);
            } else if (arg3 == 32) {
                return class214.method1399(var4 + 128, var8, var5 + 128);
            } else if (arg3 == 64) {
                return class214.method1399(var4 + 128, var8, var5);
            } else if (arg3 == 128) {
                return class214.method1399(var4, var8, var5);
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "(I)V")
    public static final void method632(int arg0) {
        ++field1848;
        if (!class114.field2180) {
            class22.field396[0] = class42.field819;
            class223.field4210[0] = class111.field2128;
            class188.field3637 = 1;
            class157.field3026[0] = 1006;
        }
        if (class18.field322 != -1) {
            class76.method533(class18.field322, -126);
        }
        for (int var1 = 0; var1 < class41.field807; ++var1) {
            if (class141.field2737[var1]) {
                class223.field4211[var1] = true;
            }
            class195.field3741[var1] = class141.field2737[var1];
            class141.field2737[var1] = false;
        }
        class141.field2730 = -1;
        class8.field126 = class20.field344;
        class82.field1637 = null;
        class175.field3475 = -1;
        if (arg0 <= -23) {
            if (class18.field322 != -1) {
                class41.field807 = 0;
                class16.method101(0, -1, -58, 0, 765, class18.field322, 503, 0, 0);
            }
            class148.method1036();
            class53.method356(-630);
            if (!class114.field2180) {
                if (class141.field2730 != -1) {
                    class132.method839(class175.field3475, false, class141.field2730);
                }
            } else {
                class47.method312(31970);
            }
            if (~class176.field3490 == -4) {
                for (int var2 = 0; var2 < class41.field807; ++var2) {
                    if (class195.field3741[var2]) {
                        class148.method1033(class37.field739[var2], class16.field289[var2], class109.field2109[var2], class108.field2089[var2], 16711935, 128);
                    } else if (class223.field4211[var2]) {
                        class148.method1033(class37.field739[var2], class16.field289[var2], class109.field2109[var2], class108.field2089[var2], 16711680, 128);
                    }
                }
            }
            class19.method118(class114.field2176.field3854, 0, class66.field1287, class114.field2176.field3889, class34.field695);
            class34.field695 = 0;
        }
    }
}
