import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class88 extends class68 {

    @OriginalMember(owner = "client!n", name = "zb", descriptor = "Z")
    public boolean field2189 = false;

    @OriginalMember(owner = "client!n", name = "Kb", descriptor = "I")
    private int field2200 = 0;

    @OriginalMember(owner = "client!n", name = "Fb", descriptor = "I")
    private int field2195 = 0;

    @OriginalMember(owner = "client!n", name = "tb", descriptor = "I")
    private int field2183;

    @OriginalMember(owner = "client!n", name = "wb", descriptor = "I")
    public int field2186;

    @OriginalMember(owner = "client!n", name = "Lb", descriptor = "I")
    public int field2201;

    @OriginalMember(owner = "client!n", name = "ub", descriptor = "I")
    public int field2184;

    @OriginalMember(owner = "client!n", name = "xb", descriptor = "I")
    public int field2187;

    @OriginalMember(owner = "client!n", name = "Wb", descriptor = "I")
    public int field2212;

    @OriginalMember(owner = "client!n", name = "Vb", descriptor = "Lka;")
    private class70 field2211;

    @OriginalMember(owner = "client!n", name = "Bb", descriptor = "Lmb;")
    public static class84 field2191 = class79.method672(true, "backvmid3");

    @OriginalMember(owner = "client!n", name = "Ib", descriptor = "I")
    public static int field2198 = 0;

    @OriginalMember(owner = "client!n", name = "Db", descriptor = "Lsa;")
    public static class119 field2193 = new class119(50);

    @OriginalMember(owner = "client!n", name = "Pb", descriptor = "Lmb;")
    public static class84 field2205 = class79.method672(true, "");

    @OriginalMember(owner = "client!n", name = "Rb", descriptor = "Lmb;")
    public static class84 field2207 = class79.method672(true, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!n", name = "Tb", descriptor = "Lrc;")
    public static class115 field2209 = new class115();

    @OriginalMember(owner = "client!n", name = "Xb", descriptor = "Lmb;")
    private static class84 field2213 = class79.method672(true, "World");

    @OriginalMember(owner = "client!n", name = "ac", descriptor = "Lmb;")
    public static class84 field2216 = field2213;

    @OriginalMember(owner = "client!n", name = "Yb", descriptor = "I")
    public static int field2214 = 0;

    @OriginalMember(owner = "client!n", name = "sb", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!n", name = "vb", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!n", name = "Ab", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!n", name = "Eb", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!n", name = "Gb", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!n", name = "Hb", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!n", name = "Jb", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!n", name = "Nb", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!n", name = "Ob", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!n", name = "Qb", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!n", name = "Sb", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!n", name = "Ub", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!n", name = "Cb", descriptor = "Lsd;")
    public static class122 field2192;

    @OriginalMember(owner = "client!n", name = "yb", descriptor = "Ldf;")
    public static class28 field2188;

    @OriginalMember(owner = "client!n", name = "Zb", descriptor = "Lge;")
    public static class47 field2215;

    @OriginalMember(owner = "client!n", name = "Mb", descriptor = "[[I")
    public static int[][] field2202;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIII)I")
    public static final int method750(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2204++;
        if (arg4 != 2087664304) {
            field2207 = null;
        }
        int var5 = 65536 - class104.field2527[arg2 * 1024 / arg0] >> 1;
        return ((65536 - var5) * arg3 >> 16) + (arg1 * var5 >> 16);
    }

    @OriginalMember(owner = "client!n", name = "g", descriptor = "(I)Ldd;")
    public final class26 method89(int arg0) {
        field2194++;
        class131 var2 = class109.method894(this.field2183, (byte) 112);
        class26 var3;
        if (this.field2189) {
            var3 = var2.method1059(arg0 ^ 0xFFFFE591, -1);
        } else {
            var3 = var2.method1059(0, this.field2200);
        }
        if (var3 == null) {
            return null;
        } else {
            if (arg0 != -6767) {
                method750(-104, -35, -16, -99, 82);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)Lmb;")
    public static final class84 method751(int arg0, byte arg1) {
        field2208++;
        class84 var2 = class93.method787(22245, arg0);
        if (arg1 >= -64) {
            return null;
        }
        for (int var3 = var2.method718(-80) - 3; var3 > 0; var3 -= 3) {
            var2 = class51.method408(new class84[] { var2.method723(false, var3, 0), class68.field1653, var2.method697(124, var3) }, 122);
        }
        if (var2.method718(63) > 8) {
            var2 = class51.method408(new class84[] { class108.field2612, var2.method723(false, var2.method718(-95) - 8, 0), class65.field1600, class115.field2747, var2, class118.field2807 }, 126);
        } else if (var2.method718(-109) > 4) {
            var2 = class51.method408(new class84[] { class138.field3322, var2.method723(false, var2.method718(-89) - 4, 0), class110.field2657, class115.field2747, var2, class118.field2807 }, 19);
        }
        return class51.method408(new class84[] { class16.field348, var2 }, 119);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILmb;)Z")
    public static final boolean method752(int arg0, class84 arg1) {
        field2190++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = arg0; var2 < class125.field3024; var2++) {
            if (arg1.method731((byte) 97, class27.field646[var2])) {
                return true;
            }
        }
        return arg1.method731((byte) 97, class40.field925.field1535);
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(II)V")
    public final void method753(int arg0, int arg1) {
        field2199++;
        if (this.field2189) {
            return;
        }
        this.field2195 += arg1;
        while (this.field2195 > this.field2211.field1716[this.field2200]) {
            this.field2195 -= this.field2211.field1716[this.field2200];
            this.field2200++;
            if (this.field2200 >= this.field2211.field1706.length) {
                this.field2189 = true;
                break;
            }
        }
        if (arg0 != 23489) {
            method750(61, -7, 68, 4, -61);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IBLj;I)V")
    public static final void method754(int arg0, byte arg1, class62 arg2, int arg3) {
        int var4 = -23 / ((arg1 + 41) / 37);
        if (arg2.field3558 == arg3 && arg3 != -1) {
            int var5 = class79.method673(arg3, false).field1710;
            if (var5 == 1) {
                arg2.field3497 = arg0;
                arg2.field3538 = 0;
                arg2.field3543 = 0;
                arg2.field3500 = 0;
            }
            if (var5 == 2) {
                arg2.field3543 = 0;
            }
        } else if (arg3 == -1 || arg2.field3558 == -1 || class79.method673(arg3, false).field1726 >= class79.method673(arg2.field3558, false).field1726) {
            arg2.field3558 = arg3;
            arg2.field3543 = 0;
            arg2.field3518 = arg2.field3555;
            arg2.field3500 = 0;
            arg2.field3497 = arg0;
            arg2.field3538 = 0;
        }
        field2210++;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BJ)V")
    public static final void method755(byte arg0, long arg1) {
        if (arg0 != -87) {
            return;
        }
        field2206++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class86.field2133; var3++) {
            if (class71.field1747[var3] == arg1) {
                class86.field2133--;
                class54.field1237++;
                class89.field2220 = true;
                for (int var4 = var3; var4 < class86.field2133; var4++) {
                    class71.field1747[var4] = class71.field1747[var4 + 1];
                }
                class80.field1978.method769((byte) -8, 92);
                class80.field1978.method419(false, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "h", descriptor = "(I)V")
    public static void method756(int arg0) {
        field2193 = null;
        field2188 = null;
        field2207 = null;
        if (arg0 != -23083) {
            method754(-19, (byte) 22, null, 100);
        }
        field2213 = null;
        field2191 = null;
        field2205 = null;
        field2202 = null;
        field2215 = null;
        field2209 = null;
        field2192 = null;
        field2216 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III)I")
    public static final int method757(int arg0, int arg1, int arg2) {
        int var3 = arg1 >>> 31;
        if (arg2 > -127) {
            method756(124);
        }
        field2196++;
        return (arg1 + var3) / arg0 - var3;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILt;ILge;)V")
    public static final void method758(int arg0, class124 arg1, int arg2, class47 arg3) {
        byte[] var4 = null;
        field2182++;
        int var5 = 55 / ((6 - arg2) / 32);
        class16 var6 = class24.field580;
        synchronized (class24.field580) {
            for (class79 var7 = (class79) class24.field580.method104((byte) 101); var7 != null; var7 = (class79) class24.field580.method107(-2)) {
                if ((long) arg0 == var7.field370 && var7.field1965 == arg1 && var7.field1963 == 0) {
                    var4 = var7.field1952;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = arg1.method1026(false, arg0);
            arg3.method344((byte) 60, arg0, true, arg1, var8);
        } else {
            arg3.method344((byte) 60, arg0, true, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(IIIIIII)V")
    public class88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2183 = arg0;
        this.field2186 = arg1;
        this.field2201 = arg3;
        this.field2184 = arg4;
        this.field2187 = arg2;
        this.field2212 = arg6 + arg5;
        int var8 = class109.method894(this.field2183, (byte) 119).field3142;
        if (var8 == -1) {
            this.field2189 = true;
        } else {
            this.field2189 = false;
            this.field2211 = class79.method673(var8, false);
        }
    }
}
