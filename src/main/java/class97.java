import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class97 extends class110 {

    @OriginalMember(owner = "client!jh", name = "Z", descriptor = "I")
    private int field2131;

    @OriginalMember(owner = "client!jh", name = "hb", descriptor = "I")
    private int field2139;

    @OriginalMember(owner = "client!jh", name = "fb", descriptor = "I")
    private int field2137;

    @OriginalMember(owner = "client!jh", name = "bb", descriptor = "I")
    private int field2133;

    @OriginalMember(owner = "client!jh", name = "nb", descriptor = "I")
    private int field2145;

    @OriginalMember(owner = "client!jh", name = "ib", descriptor = "I")
    private int field2140;

    @OriginalMember(owner = "client!jh", name = "ab", descriptor = "Lfa;")
    private class52 field2132;

    @OriginalMember(owner = "client!jh", name = "eb", descriptor = "I")
    private int field2136;

    @OriginalMember(owner = "client!jh", name = "qb", descriptor = "I")
    private int field2148;

    @OriginalMember(owner = "client!jh", name = "cb", descriptor = "Ldd;")
    public static class35 field2134 = class180.method1196((byte) 126, "Registrierter Benutzer");

    @OriginalMember(owner = "client!jh", name = "mb", descriptor = "Ldd;")
    public static class35 field2144 = class180.method1196((byte) 126, "<col=ffff00>*V");

    @OriginalMember(owner = "client!jh", name = "kb", descriptor = "[I")
    public static int[] field2142 = new int[5];

    @OriginalMember(owner = "client!jh", name = "pb", descriptor = "Lld;")
    public static class111 field2147 = new class111(64);

    @OriginalMember(owner = "client!jh", name = "sb", descriptor = "Ldd;")
    private static class35 field2150 = class180.method1196((byte) 126, " is already on your friend list)3");

    @OriginalMember(owner = "client!jh", name = "tb", descriptor = "Ldd;")
    public static class35 field2151 = class180.method1196((byte) -37, "logo");

    @OriginalMember(owner = "client!jh", name = "ub", descriptor = "Ldd;")
    public static class35 field2152 = class180.method1196((byte) -85, "floorshadows");

    @OriginalMember(owner = "client!jh", name = "vb", descriptor = "Ldd;")
    public static class35 field2153 = field2150;

    @OriginalMember(owner = "client!jh", name = "rb", descriptor = "Ljava/lang/Object;")
    public static Object field2149 = new Object();

    @OriginalMember(owner = "client!jh", name = "Y", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!jh", name = "db", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!jh", name = "gb", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!jh", name = "lb", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!jh", name = "ob", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!jh", name = "wb", descriptor = "Lba;")
    public static class12 field2154;

    @OriginalMember(owner = "client!jh", name = "jb", descriptor = "Ls;")
    public static class170 field2141;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "(I)V")
    public static void method735(int arg0) {
        field2151 = null;
        field2149 = null;
        field2142 = null;
        field2147 = null;
        field2153 = null;
        field2144 = null;
        field2150 = null;
        if (arg0 != -6) {
            method735(32);
        }
        field2152 = null;
        field2141 = null;
        field2154 = null;
        field2134 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lag;IZLag;)V")
    public static final void method736(class8 arg0, int arg1, boolean arg2, class8 arg3) {
        class115.field2578 = arg3;
        field2138++;
        class201.field4022 = arg2;
        if (arg1 >= -65) {
            field2141 = null;
        }
        class193.field3862 = arg0;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIZ)V")
    public static final void method737(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class140.method958(arg2, arg1, arg2 + arg3, arg0 + arg1);
        class11.method85();
        class40.field890++;
        field2130++;
        class209.method1378(104, true);
        class55.method485((byte) 124, arg4);
        class209.method1378(104, false);
        class55.method485((byte) 124, false);
        class201.method1333(-1);
        class13.method116((byte) -114);
        if (!class2.field29) {
            int var5 = class35.field750;
            int var6 = class2.field40 + class162.field3291 & 0x7FF;
            if (class84.field1931 / 256 > var5) {
                var5 = class84.field1931 / 256;
            }
            if (class48.field1057[4] && var5 < field2142[4] + 128) {
                var5 = field2142[4] + 128;
            }
            class71.method568(class73.method583(class175.field3585, class71.field1704.field1676, class71.field1704.field1664, (byte) 1) - 50, (byte) -49, class84.field1938, class165.field3330, var5, var6, var5 * 3 + 600);
        }
        int var7;
        if (class2.field29) {
            var7 = class161.method1071(true);
        } else {
            var7 = class89.method655(arg4);
        }
        int var8 = class26.field571;
        int var9 = class51.field1150;
        int var10 = class8.field122;
        int var11 = class55.field1246;
        int var12 = class116.field2593;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class48.field1057[var13]) {
                int var16 = (int) ((double) -class29.field587[var13] + (double) (class29.field587[var13] * 2 + 1) * Math.random() + Math.sin((double) class19.field379[var13] / 100.0D * (double) class37.field810[var13]) * (double) field2142[var13]);
                if (var13 == 1) {
                    class51.field1150 += var16;
                }
                if (var13 == 0) {
                    class26.field571 += var16;
                }
                if (var13 == 3) {
                    class55.field1246 = class55.field1246 + var16 & 0x7FF;
                }
                if (var13 == 4) {
                    class116.field2593 += var16;
                    if (class116.field2593 < 128) {
                        class116.field2593 = 128;
                    }
                    if (class116.field2593 > 383) {
                        class116.field2593 = 383;
                    }
                }
                if (var13 == 2) {
                    class8.field122 += var16;
                }
            }
        }
        int var14 = class17.field329;
        int var15 = class98.field2168;
        if (var14 >= arg2 && var14 < arg2 + arg3 && var15 >= arg1 && var15 < arg0 + arg1) {
            class81.field1877 = true;
            class81.field1895 = class17.field329 - arg2;
            class81.field1875 = 0;
            class81.field1876 = class98.field2168 - arg1;
        } else {
            class81.field1875 = 0;
            class81.field1877 = false;
        }
        class145.method993(true);
        class140.method970(arg2, arg1, arg3, arg0, 0);
        class145.method993(arg4);
        class56.method494(class26.field571, class51.field1150, class8.field122, class116.field2593, class55.field1246, var7);
        class145.method993(true);
        class182.method1217();
        class59.method511(arg3, arg1, false, arg0, arg2);
        class24.method206(arg2, -26100, arg1);
        ((class115) class11.field217).method837((byte) 84, class129.field2782);
        class2.method13(arg1, arg2, arg0, arg3, arg4);
        class55.field1246 = var11;
        class51.field1150 = var9;
        class8.field122 = var10;
        class26.field571 = var8;
        class116.field2593 = var12;
        if (class92.field2049 && class49.method440(0, true, false) == 0) {
            class92.field2049 = false;
        }
        if (class92.field2049) {
            class140.method970(arg2, arg1, arg3, arg0, 0);
            class162.method1076(class172.field3442, (byte) -97, false);
        }
        if (!class92.field2049 && !class52.field1166 && arg2 <= var14 && arg2 + arg3 > var14 && arg1 <= var15 && var15 < arg0 + arg1) {
            class102.method764(var14, arg1, arg2, -1, var15);
        }
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(B)Lia;")
    public final class81 method205(byte arg0) {
        field2143++;
        if (this.field2132 != null) {
            int var2 = class89.field1988 - this.field2148;
            if (var2 > 100 && this.field2132.field1185 > 0) {
                var2 = 100;
            }
            label51: {
                do {
                    do {
                        if (this.field2132.field1159[this.field2136] >= var2) {
                            break label51;
                        }
                        var2 -= this.field2132.field1159[this.field2136];
                        this.field2136++;
                    } while (this.field2132.field1184.length > this.field2136);
                    this.field2136 -= this.field2132.field1185;
                } while (this.field2136 >= 0 && this.field2136 < this.field2132.field1184.length);
                this.field2132 = null;
            }
            this.field2148 = class89.field1988 - var2;
        }
        class145 var3 = class4.method23((byte) 108, this.field2139);
        if (var3.field3018 != null) {
            var3 = var3.method1002((byte) 62);
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field2131 == 1 || this.field2131 == 3) {
            var4 = var3.field3017;
            var5 = var3.field3034;
        } else {
            var4 = var3.field3034;
            var5 = var3.field3017;
        }
        int var6 = (var5 >> 1) + this.field2140;
        int var7 = this.field2140 + (var5 + 1 >> 1);
        int var8 = (var4 >> 1) + this.field2137;
        int[][] var9 = class206.field4109[this.field2145];
        int var10 = (this.field2140 << 7) + (var5 << 6);
        int var11 = (var4 + 1 >> 1) + this.field2137;
        if (arg0 != -115) {
            field2144 = null;
        }
        int var12 = var9[var7][var8] + var9[var6][var11] + var9[var7][var11] + var9[var6][var8] >> 2;
        int var13 = (this.field2137 << 7) + (var4 << 6);
        return var3.method1000(var10, this.field2133, this.field2136, var13, this.field2132, var12, var9, 64, this.field2131);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIILlc;JZ)V")
    public static final void method738(int arg0, int arg1, int arg2, int arg3, class110 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class127 var8 = new class127();
        var8.field2751 = arg4;
        var8.field2748 = arg1 * 128 + 64;
        var8.field2750 = arg2 * 128 + 64;
        var8.field2754 = arg3;
        var8.field2747 = arg5;
        if (class191.field3853[arg0][arg1][arg2] == null) {
            class191.field3853[arg0][arg1][arg2] = new class54(arg0, arg1, arg2);
        }
        class191.field3853[arg0][arg1][arg2].field1230 = var8;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I[BII)I")
    public static final int method739(int arg0, byte[] arg1, int arg2, int arg3) {
        field2135++;
        if (arg2 != -27530) {
            method735(78);
        }
        int var4 = -1;
        for (int var5 = arg0; var5 < arg3; var5++) {
            var4 = var4 >>> 8 ^ class125.field2732[(arg1[var5] ^ var4) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(IIIIIIIZLlc;)V")
    public class97(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class110 arg8) {
        this.field2131 = arg2;
        this.field2139 = arg0;
        this.field2137 = arg5;
        this.field2133 = arg1;
        this.field2145 = arg3;
        this.field2140 = arg4;
        if (arg6 != -1) {
            this.field2132 = class160.method1070((byte) -98, arg6);
            this.field2136 = 0;
            this.field2148 = class89.field1988 - 1;
            if (this.field2132.field1163 == 0 && arg8 != null && arg8 instanceof class97) {
                class97 var10 = (class97) arg8;
                if (this.field2132 == var10.field2132) {
                    this.field2148 = var10.field2148;
                    this.field2136 = var10.field2136;
                    return;
                }
            }
            if (arg7 && this.field2132.field1185 != -1) {
                this.field2136 = (int) ((double) this.field2132.field1184.length * Math.random());
                this.field2148 -= (int) (Math.random() * (double) this.field2132.field1159[this.field2136]);
                return;
            }
        }
    }
}
