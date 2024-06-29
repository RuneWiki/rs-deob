import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class252 extends class224 {

    @OriginalMember(owner = "client!ua", name = "fb", descriptor = "I")
    private int field4292 = 4;

    @OriginalMember(owner = "client!ua", name = "Z", descriptor = "I")
    private int field4286 = 0;

    @OriginalMember(owner = "client!ua", name = "hb", descriptor = "I")
    private int field4294 = 1024;

    @OriginalMember(owner = "client!ua", name = "db", descriptor = "I")
    private int field4290 = 1024;

    @OriginalMember(owner = "client!ua", name = "kb", descriptor = "I")
    private int field4297 = 8;

    @OriginalMember(owner = "client!ua", name = "cb", descriptor = "I")
    private int field4289 = 409;

    @OriginalMember(owner = "client!ua", name = "qb", descriptor = "I")
    private int field4303 = 81;

    @OriginalMember(owner = "client!ua", name = "tb", descriptor = "I")
    private int field4306 = 204;

    @OriginalMember(owner = "client!ua", name = "Y", descriptor = "Luf;")
    public static class168 field4285 = class148.method1019(-1720, "Freie Welt");

    @OriginalMember(owner = "client!ua", name = "bb", descriptor = "I")
    public static int field4288 = 0;

    @OriginalMember(owner = "client!ua", name = "V", descriptor = "Luf;")
    private static class168 field4282 = class148.method1019(-1720, "purple:");

    @OriginalMember(owner = "client!ua", name = "ob", descriptor = "Luf;")
    public static class168 field4301 = field4282;

    @OriginalMember(owner = "client!ua", name = "sb", descriptor = "Luf;")
    private static class168 field4305 = class148.method1019(-1720, "Location");

    @OriginalMember(owner = "client!ua", name = "W", descriptor = "Luf;")
    public static class168 field4283 = field4282;

    @OriginalMember(owner = "client!ua", name = "rb", descriptor = "Luf;")
    public static class168 field4304 = field4305;

    @OriginalMember(owner = "client!ua", name = "wb", descriptor = "Luf;")
    public static class168 field4309 = class148.method1019(-1720, "<col=00ff00>");

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!ua", name = "U", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!ua", name = "X", descriptor = "I")
    private int field4284;

    @OriginalMember(owner = "client!ua", name = "ab", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!ua", name = "eb", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!ua", name = "gb", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!ua", name = "ib", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!ua", name = "jb", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!ua", name = "lb", descriptor = "I")
    private int field4298;

    @OriginalMember(owner = "client!ua", name = "mb", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!ua", name = "pb", descriptor = "I")
    private int field4302;

    @OriginalMember(owner = "client!ua", name = "vb", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!ua", name = "xb", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!ua", name = "ub", descriptor = "[I")
    private int[] field4307;

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "[[I")
    private int[][] field4278;

    @OriginalMember(owner = "client!ua", name = "nb", descriptor = "[[I")
    private int[][] field4300;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V", line = 4)
    public final void method80(boolean arg0) {
        field4299++;
        if (arg0) {
            this.field4302 = 1;
        }
        this.method1719(-55);
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)V", line = 19)
    private final void method1719(int arg0) {
        field4295++;
        Random var2 = new Random((long) this.field4297);
        this.field4284 = this.field4303 / 2;
        this.field4307 = new int[this.field4297 + 1];
        this.field4278 = new int[this.field4297][this.field4292 + 1];
        this.field4298 = 4096 / this.field4292;
        this.field4300 = new int[this.field4297][this.field4292];
        int var3 = this.field4298 / 2;
        this.field4302 = 4096 / this.field4297;
        this.field4307[0] = 0;
        int var4 = this.field4302 / 2;
        for (int var5 = 0; var5 < this.field4297; var5++) {
            if (var5 > 0) {
                int var6 = this.field4302;
                int var7 = (class103.method774(4096, var2, Integer.MIN_VALUE) - 2048) * this.field4306 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field4307[var5] = this.field4307[var5 - 1] + var8;
            }
            this.field4278[var5][0] = 0;
            for (int var9 = 0; var9 < this.field4292; var9++) {
                if (var9 > 0) {
                    int var10 = this.field4298;
                    int var11 = (class103.method774(4096, var2, Integer.MIN_VALUE) - 2048) * this.field4289 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field4278[var5][var9] = this.field4278[var5][var9 - 1] + var12;
                }
                this.field4300[var5][var9] = this.field4294 <= 0 ? 4096 : 4096 - class103.method774(this.field4294, var2, Integer.MIN_VALUE);
            }
            this.field4278[var5][this.field4292] = 4096;
        }
        if (arg0 > -36) {
            this.method19(-31, true, (class153) null);
        }
        this.field4307[this.field4297] = 4096;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZIIIII)V", line = 83)
    public static final void method1720(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4293++;
        int var7 = arg2 + arg3;
        int var8 = arg3 + arg6;
        if (!arg1) {
            field4301 = (class168) null;
        }
        int var9 = arg5 - arg3;
        int var10 = arg4 - arg3;
        for (int var11 = arg2; var11 < var7; var11++) {
            class133.method925(14678, arg6, arg0, arg4, class284.field4810[var11]);
        }
        for (int var12 = arg5; var12 > var9; var12--) {
            class133.method925(14678, arg6, arg0, arg4, class284.field4810[var12]);
        }
        for (int var13 = var7; var13 <= var9; var13++) {
            int[] var14 = class284.field4810[var13];
            class133.method925(14678, arg6, arg0, var8, var14);
            class133.method925(14678, var10, arg0, arg4, var14);
        }
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)V", line = 130)
    public static void method1721(int arg0) {
        field4285 = null;
        field4283 = null;
        field4301 = null;
        if (arg0 != 2081856760) {
            method1727(false, true, false);
        }
        field4309 = null;
        field4305 = null;
        field4282 = null;
        field4304 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZII)I", line = 153)
    public static final int method1722(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method1721(-32);
        }
        field4310++;
        long var3 = (long) ((arg2 << 16) + arg1);
        return class101.field1576 != null && class101.field1576.field292 == var3 ? (class23.field285.field2367 * 99 / (class23.field285.field2359.length - class101.field1576.field3590)) + 1 : 0;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V", line = 169)
    public class252() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ldk;I)V", line = 173)
    public static final void method1723(class241 arg0, int arg1) {
        class303.field5111 = arg0;
        int var2 = 61 % ((-arg1 - 78) / 41);
        field4280++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)[I", line = 188)
    public final int[] method18(byte arg0, int arg1) {
        field4296++;
        int var3 = 124 / ((arg0 - 20) / 51);
        int[] var4 = this.field3613.method1866(1, arg1);
        if (this.field3613.field4531) {
            int var5 = 0;
            int var6;
            for (var6 = class303.field5103[arg1] + this.field4286; var6 < 0; var6 += 4096) {
            }
            while (var6 > 4096) {
                var6 -= 4096;
            }
            while (this.field4297 > var5 && var6 >= this.field4307[var5]) {
                var5++;
            }
            int var7 = var5 - 1;
            boolean var8 = (var5 & 0x1) == 0;
            int var9 = this.field4307[var5];
            int var10 = this.field4307[var5 - 1];
            if (var6 > (this.field4284 + var10) && var9 - this.field4284 > var6) {
                for (int var11 = 0; var11 < class187.field2961; var11++) {
                    int var12 = 0;
                    int var13 = var8 ? this.field4290 : -this.field4290;
                    int var14;
                    for (var14 = (this.field4298 * var13 >> 12) + class73.field979[var11]; var14 < 0; var14 += 4096) {
                    }
                    while (var14 > 4096) {
                        var14 -= 4096;
                    }
                    while (this.field4292 > var12 && var14 >= this.field4278[var7][var12]) {
                        var12++;
                    }
                    int var15 = var12 - 1;
                    int var16 = this.field4278[var7][var15];
                    int var17 = this.field4278[var7][var12];
                    if ((this.field4284 + var16) < var14 && (var17 - this.field4284) > var14) {
                        var4[var11] = this.field4300[var7][var15];
                    } else {
                        var4[var11] = 0;
                    }
                }
            } else {
                class185.method1309(var4, 0, class187.field2961, 0);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(IB)I", line = 288)
    public static final int method1724(int arg0, byte arg1) {
        field4291++;
        if (arg1 != -88) {
            field4288 = 83;
        }
        return arg0 >> 17 & 0x7;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Luk;Lkb;I)Lvk;", line = 328)
    public static final class192 method1725(class203 arg0, class80 arg1, int arg2) {
        field4287++;
        long var3 = ((long) arg0.field3337 << 32) + ((long) arg0.field3333 << 56) - (long) (-(arg0.field3327 + 1 << 16) - arg0.field3336);
        if (arg2 != 409) {
            method1723((class241) null, 1);
        }
        class192 var5 = (class192) arg1.method493(var3, 77);
        if (var5 == null) {
            var5 = new class192(arg0.field3327, (float) arg0.field3336, true, false, arg0.field3337);
            arg1.method490(var5, var3, true);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZLj;)V", line = 377)
    public final void method19(int arg0, boolean arg1, class153 arg2) {
        if (arg0 == 0) {
            this.field4292 = arg2.method1042((byte) 108);
        } else if (arg0 == 1) {
            this.field4297 = arg2.method1042((byte) 99);
        } else if (arg0 == 2) {
            this.field4289 = arg2.method1069(125);
        } else if (arg0 == 3) {
            this.field4306 = arg2.method1069(73);
        } else if (arg0 == 4) {
            this.field4290 = arg2.method1069(54);
        } else if (arg0 == 5) {
            this.field4286 = arg2.method1069(67);
        } else if (arg0 == 6) {
            this.field4303 = arg2.method1069(99);
        } else if (arg0 == 7) {
            this.field4294 = arg2.method1069(34);
        }
        if (arg1) {
            field4285 = (class168) null;
        }
        field4308++;
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(Z)V", line = 451)
    public static final void method1726(boolean arg0) {
        class242.field4103++;
        field4279++;
        class249.field4262.method726(86, 2138389379);
        for (class240 var1 = (class240) class26.field319.method499((byte) -99); var1 != null; var1 = (class240) class26.field319.method488(1)) {
            if (var1.field3892 == 0) {
                class67.method378(true, var1, 0);
            }
        }
        if (arg0) {
            field4309 = (class168) null;
        }
        if (class94.field1507 != null) {
            client.method2011((byte) -59, class94.field1507);
            class94.field1507 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZZZ)I", line = 512)
    public static final int method1727(boolean arg0, boolean arg1, boolean arg2) {
        field4281++;
        int var3 = 0;
        if (arg1) {
            var3 += class43.field527 + class233.field3740;
        }
        if (arg0) {
            var3 += class242.field3967 + class189.field3007;
        }
        return arg2 ? 43 : var3;
    }
}
