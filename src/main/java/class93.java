import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class93 extends class99 {

    @OriginalMember(owner = "client!nc", name = "S", descriptor = "I")
    public int field2151 = -1;

    @OriginalMember(owner = "client!nc", name = "R", descriptor = "I")
    public int field2150 = -1;

    @OriginalMember(owner = "client!nc", name = "Y", descriptor = "I")
    public int field2157 = -1;

    @OriginalMember(owner = "client!nc", name = "gb", descriptor = "I")
    public int field2165 = 2;

    @OriginalMember(owner = "client!nc", name = "jb", descriptor = "I")
    public int field2168 = -1;

    @OriginalMember(owner = "client!nc", name = "bb", descriptor = "Z")
    public boolean field2160 = false;

    @OriginalMember(owner = "client!nc", name = "rb", descriptor = "I")
    public int field2176 = -1;

    @OriginalMember(owner = "client!nc", name = "pb", descriptor = "I")
    public int field2174 = 99;

    @OriginalMember(owner = "client!nc", name = "wb", descriptor = "I")
    public int field2181 = 5;

    @OriginalMember(owner = "client!nc", name = "X", descriptor = "Laf;")
    public static class7 field2156 = class48.method406(40, "title)3jpg");

    @OriginalMember(owner = "client!nc", name = "db", descriptor = "Lgd;")
    public static class46 field2162 = new class46(64);

    @OriginalMember(owner = "client!nc", name = "tb", descriptor = "Laf;")
    public static class7 field2178 = class48.method406(40, "(Z");

    @OriginalMember(owner = "client!nc", name = "xb", descriptor = "Z")
    public static boolean field2182 = true;

    @OriginalMember(owner = "client!nc", name = "vb", descriptor = "Laf;")
    private static class7 field2180 = class48.method406(40, "Unable to connect)3");

    @OriginalMember(owner = "client!nc", name = "yb", descriptor = "Laf;")
    public static class7 field2183 = field2180;

    @OriginalMember(owner = "client!nc", name = "sb", descriptor = "Laf;")
    public static class7 field2177 = field2180;

    @OriginalMember(owner = "client!nc", name = "T", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!nc", name = "U", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!nc", name = "V", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!nc", name = "W", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!nc", name = "ab", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!nc", name = "cb", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!nc", name = "eb", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!nc", name = "hb", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!nc", name = "lb", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!nc", name = "mb", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!nc", name = "nb", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!nc", name = "ob", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!nc", name = "zb", descriptor = "Lqc;")
    public static class114 field2184;

    @OriginalMember(owner = "client!nc", name = "Z", descriptor = "[I")
    public int[] field2158;

    @OriginalMember(owner = "client!nc", name = "fb", descriptor = "[I")
    public int[] field2164;

    @OriginalMember(owner = "client!nc", name = "ib", descriptor = "[I")
    private int[] field2167;

    @OriginalMember(owner = "client!nc", name = "kb", descriptor = "[I")
    public int[] field2169;

    @OriginalMember(owner = "client!nc", name = "qb", descriptor = "[I")
    private int[] field2175;

    @OriginalMember(owner = "client!nc", name = "ub", descriptor = "[[B")
    public static byte[][] field2179;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILeb;IB)Leb;")
    public final class31 method745(int arg0, class31 arg1, int arg2, byte arg3) {
        int var5 = this.field2158[arg0];
        field2170++;
        class49 var6 = class39.method336(var5 >> 16, -1);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg1.method281(true);
        }
        int var8 = arg2 & 0x3;
        if (arg3 != -25) {
            return null;
        }
        class31 var9 = arg1.method281(!var6.method409(true, var7));
        if (var8 == 1) {
            var9.method279();
        } else if (var8 == 2) {
            var9.method270();
        } else if (var8 == 3) {
            var9.method260();
        }
        var9.method275(var6, var7);
        if (var8 == 1) {
            var9.method260();
        } else if (var8 == 2) {
            var9.method270();
        } else if (var8 == 3) {
            var9.method279();
        }
        return var9;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILeb;I)Leb;")
    public final class31 method746(int arg0, class31 arg1, int arg2) {
        int var4 = this.field2158[arg2];
        field2155++;
        class49 var5 = class39.method336(var4 >> 16, -1);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method281(true);
        }
        if (arg0 != 16278) {
            field2177 = null;
        }
        class31 var7 = arg1.method281(!var5.method409(true, var6));
        var7.method275(var5, var6);
        return var7;
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "(B)V")
    public static final void method747(byte arg0) {
        field2171++;
        class32 var1 = class106.field2589;
        synchronized (class106.field2589) {
            class97.field2311 = class20.field521;
            class113.field2709 = class87.field2035;
            class111.field2681 = class49.field1189;
            class13.field337 = class143.field3394;
            if (arg0 <= 41) {
                field2180 = null;
            }
            class10.field267 = class77.field1779;
            class111.field2668 = class84.field1986;
            class2.field8 = class23.field626;
            class143.field3394 = 0;
        }
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "(B)V")
    public static final void method748(byte arg0) {
        field2159++;
        int var1 = class25.field660.method31(class23.field625);
        for (int var2 = 0; var2 < class19.field449; var2++) {
            int var6 = class25.field660.method31(class81.method680(var2, false));
            if (var1 < var6) {
                var1 = var6;
            }
        }
        if (arg0 <= 123) {
            return;
        }
        class52.field1247 = class19.field449 * 15 + 22;
        int var3 = class19.field449 * 15 + 21;
        var1 += 8;
        class78.field1817 = true;
        int var4 = class10.field267 - var1 / 2;
        class27.field711 = var1;
        if (var1 + var4 > 765) {
            var4 = 765 - var1;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        class24.field640 = var4;
        int var5 = class111.field2668;
        if (var3 + var5 > 503) {
            var5 = 503 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        class18.field436 = var5;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)Z")
    public static final boolean method749(int arg0, byte arg1) {
        field2161++;
        if (arg0 < 0) {
            return false;
        }
        if (arg1 != 1) {
            method749(82, (byte) 29);
        }
        int var2 = class147.field3473[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1004;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lnc;Leb;III)Leb;")
    public final class31 method750(class93 arg0, class31 arg1, int arg2, int arg3, int arg4) {
        int var6 = this.field2158[arg4];
        field2153++;
        class49 var7 = class39.method336(var6 >> 16, -1);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg0.method746(16278, arg1, arg3);
        }
        int var9 = arg0.field2158[arg3];
        if (arg2 > -38) {
            this.method754(-32);
        }
        class49 var10 = class39.method336(var9 >> 16, -1);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class31 var12 = arg1.method281(!var7.method409(true, var8));
            var12.method275(var7, var8);
            return var12;
        } else {
            class31 var13 = arg1.method281(!var7.method409(true, var8) & !var10.method409(true, var11));
            var13.method271(var7, var8, var10, var11, this.field2175);
            return var13;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIII)Ldf;")
    public static final class28 method751(int arg0, int arg1, int arg2, int arg3) {
        field2173++;
        class28 var4 = new class28();
        var4.field734 = arg3;
        var4.field737 = arg0;
        class75.field1748.method130(118, var4, (long) arg1);
        class27.method246(0, arg3);
        class137.method1128((byte) 45, arg3);
        if (arg2 != -1) {
            method749(17, (byte) 14);
        }
        class103 var5 = class37.method328(0, arg1);
        if (var5 != null) {
            class141.method1151(15569, var5);
        }
        if (class12.field317 != null) {
            class141.method1151(15569, class12.field317);
            class12.field317 = null;
        }
        class78.field1817 = false;
        class19.field449 = 0;
        class113.method892(class24.field640, 123, class18.field436, class27.field711, class52.field1247);
        return var4;
    }

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "(B)V")
    public static void method752(byte arg0) {
        field2180 = null;
        field2184 = null;
        field2156 = null;
        if (arg0 != 84) {
            return;
        }
        field2179 = null;
        field2178 = null;
        field2183 = null;
        field2177 = null;
        field2162 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IILeb;)Leb;")
    public final class31 method753(int arg0, int arg1, class31 arg2) {
        int var4 = this.field2158[arg0];
        field2163++;
        class49 var5 = class39.method336(var4 >> 16, -1);
        if (arg1 != 5896) {
            return null;
        }
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method268(true);
        } else {
            class31 var7 = arg2.method268(!var5.method409(true, var6));
            var7.method275(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
    public final void method754(int arg0) {
        field2172++;
        if (~this.field2150 == arg0) {
            if (this.field2175 == null) {
                this.field2150 = 0;
            } else {
                this.field2150 = 2;
            }
        }
        if (this.field2157 != -1) {
            return;
        }
        if (this.field2175 == null) {
            this.field2157 = 0;
        } else {
            this.field2157 = 2;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Leb;II)Leb;")
    public final class31 method755(class31 arg0, int arg1, int arg2) {
        field2152++;
        int var4 = this.field2158[arg1];
        class49 var5 = class39.method336(var4 >> 16, -1);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method281(true);
        }
        class49 var7 = null;
        int var8 = 0;
        if (this.field2167 != null && arg1 < this.field2167.length) {
            int var9 = this.field2167[arg1];
            var7 = class39.method336(var9 >> 16, -1);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class31 var11 = arg0.method281(!var5.method409(true, var6));
            var11.method275(var5, var6);
            return var11;
        } else if (arg2 == 2000) {
            class31 var10 = arg0.method281(!var5.method409(true, var6) & !var7.method409(true, var8));
            var10.method275(var5, var6);
            var10.method275(var7, var8);
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lrd;Z)V")
    public final void method756(class122 arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        field2166++;
        while (true) {
            int var3 = arg0.method931((byte) 124);
            if (var3 == 0) {
                return;
            }
            this.method757(arg0, var3, -26096);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lrd;II)V")
    private final void method757(class122 arg0, int arg1, int arg2) {
        field2154++;
        if (arg1 == 1) {
            int var4 = arg0.method965(false);
            this.field2169 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2169[var5] = arg0.method965(false);
            }
            this.field2158 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field2158[var6] = arg0.method965(false);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field2158[var7] = (arg0.method965(false) << 16) + this.field2158[var7];
            }
        } else if (arg1 == 2) {
            this.field2176 = arg0.method965(false);
        } else if (arg1 == 3) {
            int var13 = arg0.method931((byte) 124);
            this.field2175 = new int[var13 + 1];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field2175[var14] = arg0.method931((byte) 124);
            }
            this.field2175[var13] = 9999999;
        } else if (arg1 == 4) {
            this.field2160 = true;
        } else if (arg1 == 5) {
            this.field2181 = arg0.method931((byte) 124);
        } else if (arg1 == 6) {
            this.field2151 = arg0.method965(false);
        } else if (arg1 == 7) {
            this.field2168 = arg0.method965(false);
        } else if (arg1 == 8) {
            this.field2174 = arg0.method931((byte) 124);
        } else if (arg1 == 9) {
            this.field2150 = arg0.method931((byte) 124);
        } else if (arg1 == 10) {
            this.field2157 = arg0.method931((byte) 124);
        } else if (arg1 == 11) {
            this.field2165 = arg0.method931((byte) 124);
        } else if (arg1 == 12) {
            int var10 = arg0.method931((byte) 124);
            this.field2167 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field2167[var11] = arg0.method965(false);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field2167[var12] = (arg0.method965(false) << 16) + this.field2167[var12];
            }
        } else if (arg1 == 13) {
            int var8 = arg0.method931((byte) 124);
            this.field2164 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2164[var9] = arg0.method953(32);
            }
        }
        if (arg2 != -26096) {
            method749(-80, (byte) -55);
        }
    }
}
