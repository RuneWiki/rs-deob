import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class105 extends class51 {

    @OriginalMember(owner = "client!jg", name = "M", descriptor = "Lwi;")
    public class248 field1915 = new class248();

    @OriginalMember(owner = "client!jg", name = "S", descriptor = "Luf;")
    public class224 field1921 = new class224();

    @OriginalMember(owner = "client!jg", name = "E", descriptor = "Lpg;")
    private class170 field1907;

    @OriginalMember(owner = "client!jg", name = "z", descriptor = "Lwi;")
    public static class248 field1902 = new class248();

    @OriginalMember(owner = "client!jg", name = "I", descriptor = "Li;")
    public static class88 field1911 = class208.method1425(105, "welle2:");

    @OriginalMember(owner = "client!jg", name = "H", descriptor = "[I")
    public static int[] field1910 = new int[128];

    @OriginalMember(owner = "client!jg", name = "R", descriptor = "I")
    public static int field1920 = 0;

    @OriginalMember(owner = "client!jg", name = "J", descriptor = "I")
    public static int field1912 = 0;

    @OriginalMember(owner = "client!jg", name = "P", descriptor = "Li;")
    public static class88 field1918 = class208.method1425(105, "Anmelde)2Zeitlimit -Uberschritten)3");

    @OriginalMember(owner = "client!jg", name = "G", descriptor = "[I")
    public static int[] field1909 = new int[25];

    @OriginalMember(owner = "client!jg", name = "x", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!jg", name = "y", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!jg", name = "B", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!jg", name = "C", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!jg", name = "D", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!jg", name = "F", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!jg", name = "K", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!jg", name = "N", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!jg", name = "O", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!jg", name = "Q", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!jg", name = "T", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!jg", name = "A", descriptor = "Lpf;")
    public static class169 field1903;

    @OriginalMember(owner = "client!jg", name = "L", descriptor = "[[[I")
    public static int[][][] field1914;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIBI)V")
    public static final void method725(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        int var6 = arg1 - arg3;
        int var7 = arg5 - arg0;
        field1905++;
        if (var7 == 0) {
            if (var6 != 0) {
                class109.method755(arg2, arg3, -87, arg0, arg1);
            }
        } else if (var6 == 0) {
            class46.method310(arg3, arg5, arg0, (byte) 84, arg2);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg0;
                arg0 = arg3;
                arg3 = var9;
                int var10 = arg5;
                arg5 = arg1;
                arg1 = var10;
            }
            if (arg5 < arg0) {
                int var11 = arg0;
                int var12 = arg3;
                arg3 = arg1;
                arg0 = arg5;
                arg1 = var12;
                arg5 = var11;
            }
            int var13 = arg1 - arg3;
            int var14 = arg5 - arg0;
            int var15 = 90 / ((35 - arg4) / 35);
            if (var13 < 0) {
                var13 = -var13;
            }
            int var16 = arg3;
            int var17 = -(var14 >> 1);
            int var18 = arg3 < arg1 ? 1 : -1;
            if (var8) {
                for (int var19 = arg0; var19 <= arg5; var19++) {
                    class3.field42[var19][var16] = arg2;
                    var17 += var13;
                    if (var17 > 0) {
                        var16 += var18;
                        var17 -= var14;
                    }
                }
            } else {
                for (int var20 = arg0; var20 <= arg5; var20++) {
                    class3.field42[var16][var20] = arg2;
                    var17 += var13;
                    if (var17 > 0) {
                        var17 -= var14;
                        var16 += var18;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "()I")
    public final int method383() {
        field1901++;
        return 0;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
    public final void method384(int arg0) {
        field1919++;
        this.field1921.method384(arg0);
        for (class127 var2 = (class127) this.field1915.method1612(false); var2 != null; var2 = (class127) this.field1915.method1621(82)) {
            if (!this.field1907.method1202((byte) 69, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field2369 >= var3) {
                        this.method726(var3, 82, var2);
                        var2.field2369 -= var3;
                        break;
                    }
                    this.method726(var2.field2369, 88, var2);
                    var3 -= var2.field2369;
                } while (!this.field1907.method1185(null, var3, -5039, 0, var2));
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "()Lef;")
    public final class51 method385() {
        field1922++;
        class127 var1 = (class127) this.field1915.method1612(false);
        if (var1 == null) {
            return null;
        } else if (var1.field2393 == null) {
            return this.method380();
        } else {
            return var1.field2393;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILlg;)V")
    private final void method726(int arg0, int arg1, class127 arg2) {
        int var4 = 114 % ((arg1 - 17) / 60);
        field1908++;
        if ((this.field1907.field3250[arg2.field2387] & 0x4) != 0 && arg2.field2388 < 0) {
            int var5 = this.field1907.field3284[arg2.field2387] / class11.field161;
            int var6 = (var5 + 1048575 - arg2.field2392) / var5;
            arg2.field2392 = arg2.field2392 + arg0 * var5 & 0xFFFFF;
            if (arg0 >= var6) {
                if (this.field1907.field3288[arg2.field2387] == 0) {
                    arg2.field2393 = class162.method1100(arg2.field2382, arg2.field2393.method1106(), arg2.field2393.method1095(), arg2.field2393.method1105());
                } else {
                    arg2.field2393 = class162.method1100(arg2.field2382, arg2.field2393.method1106(), 0, arg2.field2393.method1105());
                    this.field1907.method1213(arg2, arg2.field2377.field3891[arg2.field2383] < 0, -5622);
                }
                if (arg2.field2377.field3891[arg2.field2383] < 0) {
                    arg2.field2393.method1121(-1);
                }
                arg0 = arg2.field2392 / var5;
            }
        }
        arg2.field2393.method384(arg0);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "()Lef;")
    public final class51 method380() {
        field1906++;
        class127 var1;
        do {
            var1 = (class127) this.field1915.method1621(82);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2393 == null);
        return var1.field2393;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lea;Z)V")
    public static final void method727(class46 arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        if (class175.field3531 != null) {
            try {
                class175.field3531.method820((byte) 110, 0L);
                class175.field3531.method808(arg0.field842, 24, arg0.field831, -6668);
            } catch (Exception var2) {
            }
        }
        arg0.field831 += 24;
        field1917++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)Z")
    public static final boolean method728(int arg0, int arg1, int arg2) {
        if (arg0 < 96) {
            field1912 = -11;
        }
        field1904++;
        return (arg2 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "([III)V")
    public final void method379(int[] arg0, int arg1, int arg2) {
        this.field1921.method379(arg0, arg1, arg2);
        for (class127 var4 = (class127) this.field1915.method1612(false); var4 != null; var4 = (class127) this.field1915.method1621(82)) {
            if (!this.field1907.method1202((byte) 69, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field2369 >= var5) {
                        this.method730(-27799, var5, arg0, var6 + var5, var4, var6);
                        var4.field2369 -= var5;
                        break;
                    }
                    this.method730(-27799, var4.field2369, arg0, var5 + var6, var4, var6);
                    var5 -= var4.field2369;
                    var6 += var4.field2369;
                } while (!this.field1907.method1185(arg0, var5, -5039, var6, var4));
            }
        }
        field1900++;
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)V")
    public static void method729(int arg0) {
        field1911 = null;
        field1909 = null;
        field1918 = null;
        if (arg0 >= -96) {
            method729(-93);
        }
        field1902 = null;
        field1914 = null;
        field1910 = null;
        field1903 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II[IILlg;I)V")
    private final void method730(int arg0, int arg1, int[] arg2, int arg3, class127 arg4, int arg5) {
        if (arg0 != -27799) {
            return;
        }
        field1913++;
        if ((this.field1907.field3250[arg4.field2387] & 0x4) != 0 && arg4.field2388 < 0) {
            int var7 = this.field1907.field3284[arg4.field2387] / class11.field161;
            while (true) {
                int var8 = (var7 + 1048575 - arg4.field2392) / var7;
                if (var8 > arg1) {
                    arg4.field2392 += arg1 * var7;
                    break;
                }
                arg1 -= var8;
                arg4.field2393.method379(arg2, arg5, var8);
                int var9 = class11.field161 / 100;
                arg4.field2392 += var7 * var8 - 1048576;
                int var10 = 262144 / var7;
                class162 var11 = arg4.field2393;
                if (var10 < var9) {
                    var9 = var10;
                }
                if (this.field1907.field3288[arg4.field2387] == 0) {
                    arg4.field2393 = class162.method1100(arg4.field2382, var11.method1106(), var11.method1095(), var11.method1105());
                } else {
                    arg4.field2393 = class162.method1100(arg4.field2382, var11.method1106(), 0, var11.method1105());
                    this.field1907.method1213(arg4, arg4.field2377.field3891[arg4.field2383] < 0, -5622);
                    arg4.field2393.method1118(var9, var11.method1095());
                }
                arg5 += var8;
                if (arg4.field2377.field3891[arg4.field2383] < 0) {
                    arg4.field2393.method1121(-1);
                }
                var11.method1088(var9);
                var11.method379(arg2, arg5, arg3 - arg5);
                if (var11.method1123()) {
                    this.field1921.method1508(var11);
                }
            }
        }
        arg4.field2393.method379(arg2, arg5, arg1);
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(I)I")
    public static final int method731(int arg0) {
        if (arg0 == 0) {
            field1916++;
            return class114.field2070;
        } else {
            return -61;
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lpg;)V")
    public class105(class170 arg0) {
        this.field1907 = arg0;
    }
}
