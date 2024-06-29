import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class318 extends class17 {

    @OriginalMember(owner = "client!nb", name = "db", descriptor = "I")
    private int field5460 = 0;

    @OriginalMember(owner = "client!nb", name = "hb", descriptor = "I")
    private int field5464 = 0;

    @OriginalMember(owner = "client!nb", name = "qb", descriptor = "I")
    private int field5473 = 0;

    @OriginalMember(owner = "client!nb", name = "ab", descriptor = "Z")
    public static boolean field5457 = false;

    @OriginalMember(owner = "client!nb", name = "eb", descriptor = "Lsf;")
    public static class108 field5461 = class140.method973(255, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!nb", name = "jb", descriptor = "I")
    public static int field5466 = 0;

    @OriginalMember(owner = "client!nb", name = "bb", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!nb", name = "cb", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!nb", name = "fb", descriptor = "I")
    private int field5462;

    @OriginalMember(owner = "client!nb", name = "gb", descriptor = "I")
    private int field5463;

    @OriginalMember(owner = "client!nb", name = "ib", descriptor = "I")
    private int field5465;

    @OriginalMember(owner = "client!nb", name = "kb", descriptor = "I")
    public static int field5467;

    @OriginalMember(owner = "client!nb", name = "lb", descriptor = "I")
    private int field5468;

    @OriginalMember(owner = "client!nb", name = "mb", descriptor = "I")
    private int field5469;

    @OriginalMember(owner = "client!nb", name = "ob", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!nb", name = "pb", descriptor = "I")
    public static int field5472;

    @OriginalMember(owner = "client!nb", name = "rb", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!nb", name = "sb", descriptor = "I")
    private int field5475;

    @OriginalMember(owner = "client!nb", name = "nb", descriptor = "Lf;")
    public static class250 field5470;

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V", line = 73)
    public class318() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BLrm;I)V", line = 19)
    public final void method114(byte arg0, class249 arg1, int arg2) {
        if (arg0 != -114) {
            this.field5465 = 8;
        }
        if (arg2 == 0) {
            this.field5464 = arg1.method1728(true);
        } else if (arg2 == 1) {
            this.field5460 = (arg1.method1721((byte) 74) << 12) / 100;
        } else if (arg2 == 2) {
            this.field5473 = (arg1.method1721((byte) 96) << 12) / 100;
        }
        field5459++;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BIII)V", line = 88)
    private final void method2206(byte arg0, int arg1, int arg2, int arg3) {
        field5458++;
        int var5 = arg3 > 2048 ? arg1 + arg3 - (arg1 * arg3 >> 12) : (arg1 + 4096) * arg3 >> 12;
        if (var5 <= 0) {
            this.field5465 = this.field5463 = this.field5468 = arg3;
        } else {
            int var6 = arg2 * 6;
            int var7 = arg3 + arg3 - var5;
            int var8 = (var5 - var7 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = var6 - (var9 << 12);
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var5 - var13;
            int var15 = var7 + var13;
            if (var9 == 0) {
                this.field5468 = var7;
                this.field5465 = var5;
                this.field5463 = var15;
            } else if (var9 == 1) {
                this.field5463 = var5;
                this.field5468 = var7;
                this.field5465 = var14;
            } else if (var9 == 2) {
                this.field5465 = var7;
                this.field5468 = var15;
                this.field5463 = var5;
            } else if (var9 == 3) {
                this.field5465 = var7;
                this.field5463 = var14;
                this.field5468 = var5;
            } else if (var9 == 4) {
                this.field5465 = var15;
                this.field5463 = var7;
                this.field5468 = var5;
            } else if (var9 == 5) {
                this.field5463 = var7;
                this.field5465 = var5;
                this.field5468 = var14;
            }
        }
        if (arg0 != 76) {
            this.method114((byte) -14, (class249) null, 99);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZI)[[I", line = 197)
    public final int[][] method122(boolean arg0, int arg1) {
        if (arg0) {
            return (int[][]) ((int[][]) null);
        }
        field5472++;
        int[][] var3 = this.field224.method2081(arg1, -115);
        if (this.field224.field5106) {
            int[][] var4 = this.method111(3, arg1, 0);
            int[] var5 = var4[2];
            int[] var6 = var4[1];
            int[] var7 = var4[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; var11 < class116.field2008; var11++) {
                this.method2210(var5[var11], var6[var11], var7[var11], (byte) 68);
                this.field5469 += this.field5473;
                this.field5475 += this.field5464;
                this.field5462 += this.field5460;
                if (this.field5462 < 0) {
                    this.field5462 = 0;
                }
                if (this.field5469 < 0) {
                    this.field5469 = 0;
                }
                if (this.field5462 > 4096) {
                    this.field5462 = 4096;
                }
                if (this.field5469 > 4096) {
                    this.field5469 = 4096;
                }
                while (this.field5475 < 0) {
                    this.field5475 += 4096;
                }
                while (this.field5475 > 4096) {
                    this.field5475 -= 4096;
                }
                this.method2206((byte) 76, this.field5462, this.field5475, this.field5469);
                var10[var11] = this.field5465;
                var8[var11] = this.field5463;
                var9[var11] = this.field5468;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lvl;ZI)V", line = 267)
    public static final void method2207(class80 arg0, boolean arg1, int arg2) {
        field5474++;
        if (class231.field4051 || arg1) {
            int var3 = class21.field331;
            int var4 = var3 * 956 / 503;
            class296.field5168.method72((class73.field1110 - var4) / 2, 0, var4, var3);
            class105.field1814.method404(class73.field1110 / 2 - (class105.field1814.field889 / 2), 18);
        }
        arg0.method545(class184.field3390, class73.field1110 / 2, class21.field331 / 2 - 26, 16777215, -1);
        if (arg2 < 72) {
            method2207((class80) null, false, 26);
        }
        int var5 = class21.field331 / 2 - 18;
        if (class231.field4051) {
            class50.method353(class73.field1110 / 2 - 152, var5, 304, 34, 9179409);
            class50.method353(class73.field1110 / 2 - 151, var5 + 1, 302, 32, 0);
            class50.method348(class73.field1110 / 2 - 150, var5 + 2, class122.field2084 * 3, 30, 9179409);
            class50.method348(class122.field2084 * 3 + class73.field1110 / 2 - 150, var5 + 2, 300 - class122.field2084 * 3, 30, 0);
        } else {
            class28.method183(class73.field1110 / 2 - 152, var5, 304, 34, 9179409);
            class28.method183(class73.field1110 / 2 - 151, var5 - -1, 302, 32, 0);
            class28.method193(class73.field1110 / 2 - 150, var5 + 2, class122.field2084 * 3, 30, 9179409);
            class28.method193(class73.field1110 / 2 + class122.field2084 * 3 - 150, var5 + 2, 300 - (class122.field2084 * 3), 30, 0);
        }
        arg0.method545(class219.field3893, class73.field1110 / 2, class21.field331 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "(I)V", line = 306)
    public static void method2208(int arg0) {
        field5470 = null;
        field5461 = null;
        if (arg0 != -8759) {
            field5470 = (class250) null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lsf;IB)V", line = 324)
    public static final void method2209(class108 arg0, int arg1, byte arg2) {
        field5471++;
        if (arg2 <= 22) {
            field5470 = (class250) null;
        }
        class120 var3 = class248.method1704(2, 86, arg1);
        var3.method844((byte) -28);
        var3.field2063 = arg0;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIB)V", line = 342)
    private final void method2210(int arg0, int arg1, int arg2, byte arg3) {
        int var5 = arg1 < arg2 ? arg2 : arg1;
        int var6 = arg0 > var5 ? arg0 : var5;
        field5467++;
        int var7 = arg2 >= arg1 ? arg1 : arg2;
        int var8 = arg0 >= var7 ? var7 : arg0;
        int var9 = var6 - var8;
        this.field5469 = (var6 + var8) / 2;
        if (arg3 < 13) {
            return;
        }
        if (this.field5469 > 0 && this.field5469 < 4096) {
            this.field5462 = (var9 << 12) / (this.field5469 <= 2048 ? this.field5469 * 2 : 8192 - (this.field5469 * 2));
        } else {
            this.field5462 = 0;
        }
        if (var9 <= 0) {
            this.field5475 = 0;
            return;
        }
        int var10 = (var6 - arg2 << 12) / var9;
        int var11 = (var6 - arg1 << 12) / var9;
        int var12 = (var6 - arg0 << 12) / var9;
        if (arg2 == var6) {
            this.field5475 = arg1 == var8 ? var12 + 20480 : 4096 - var11;
        } else if (arg1 == var6) {
            this.field5475 = arg0 == var8 ? var10 + 4096 : -var12 + 12288;
        } else {
            this.field5475 = arg2 == var8 ? var11 + 12288 : -var10 + 20480;
        }
        this.field5475 /= 6;
    }
}
