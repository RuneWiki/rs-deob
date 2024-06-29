import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class135 extends class76 {

    @OriginalMember(owner = "client!dj", name = "Z", descriptor = "I")
    private int field2404 = 0;

    @OriginalMember(owner = "client!dj", name = "pb", descriptor = "I")
    private int field2420 = 0;

    @OriginalMember(owner = "client!dj", name = "tb", descriptor = "I")
    private int field2424 = 0;

    @OriginalMember(owner = "client!dj", name = "ab", descriptor = "Lia;")
    public static class257 field2405 = class28.method234(97, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!dj", name = "ib", descriptor = "Lia;")
    public static class257 field2413 = class28.method234(73, "(U0a )2 via: ");

    @OriginalMember(owner = "client!dj", name = "mb", descriptor = "Lia;")
    public static class257 field2417 = class28.method234(79, ")1 ");

    @OriginalMember(owner = "client!dj", name = "Y", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!dj", name = "bb", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!dj", name = "cb", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!dj", name = "db", descriptor = "I")
    private int field2408;

    @OriginalMember(owner = "client!dj", name = "fb", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!dj", name = "hb", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!dj", name = "jb", descriptor = "I")
    private int field2414;

    @OriginalMember(owner = "client!dj", name = "kb", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!dj", name = "lb", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!dj", name = "nb", descriptor = "I")
    private int field2418;

    @OriginalMember(owner = "client!dj", name = "ob", descriptor = "I")
    private int field2419;

    @OriginalMember(owner = "client!dj", name = "qb", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!dj", name = "rb", descriptor = "I")
    private int field2422;

    @OriginalMember(owner = "client!dj", name = "sb", descriptor = "I")
    private int field2423;

    @OriginalMember(owner = "client!dj", name = "gb", descriptor = "Lvb;")
    public static class226 field2411;

    @OriginalMember(owner = "client!dj", name = "eb", descriptor = "[[B")
    public static byte[][] field2409;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(II)Lbk;")
    public static final class19 method934(int arg0, int arg1) {
        class19 var2 = (class19) class126.field2260.method615(false, (long) arg1);
        ++field2407;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class27.field528.method1197(0, arg1, -2);
            if (var3 == null) {
                return null;
            } else {
                class19 var4 = new class19();
                class152 var5 = new class152(var3);
                var5.field2677 = var5.field2638.length + -2;
                int var6 = var5.method1063(-17162);
                int var7 = var5.field2638.length - var6 + -14;
                var5.field2677 = var7;
                if (arg0 != 2048) {
                    method934(-81, 66);
                }
                int var8 = var5.method1042(121);
                var4.field396 = var5.method1063(-17162);
                var4.field412 = var5.method1063(arg0 ^ -19210);
                var4.field408 = var5.method1063(-17162);
                var4.field406 = var5.method1063(arg0 + -19210);
                int var9 = var5.method1051((byte) 95);
                if (var9 > 0) {
                    var4.field413 = new class56[var9];
                    for (int var10 = 0; var10 < var9; ++var10) {
                        int var11 = var5.method1063(-17162);
                        class56 var12 = new class56(class105.method760((byte) 66, var11));
                        var4.field413[var10] = var12;
                        while (~(var11--) < -1) {
                            int var13 = var5.method1042(arg0 ^ 2169);
                            int var14 = var5.method1042(122);
                            var12.method424(new class220(var14), (byte) -40, (long) var13);
                        }
                    }
                }
                int var15 = 0;
                var5.field2677 = 0;
                var4.field401 = var5.method1057((byte) -22);
                var4.field398 = new int[var8];
                var4.field395 = new int[var8];
                var4.field410 = new class257[var8];
                while (var7 > var5.field2677) {
                    int var16 = var5.method1063(-17162);
                    if (var16 != 3) {
                        if (~var16 > -101 && var16 != 21 && ~var16 != -39 && var16 != 39) {
                            var4.field395[var15] = var5.method1042(123);
                        } else {
                            var4.field395[var15] = var5.method1051((byte) 119);
                        }
                    } else {
                        var4.field410[var15] = var5.method1039(1995);
                    }
                    var4.field398[var15++] = var16;
                }
                class126.field2260.method619((byte) 95, var4, (long) arg1);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(B)V")
    public static void method935(byte arg0) {
        field2417 = null;
        field2405 = null;
        if (arg0 < 6) {
            field2405 = null;
        }
        field2413 = null;
        field2411 = null;
        field2409 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIBI)V")
    private final void method936(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 83) {
            this.field2420 = 103;
        }
        ++field2403;
        int var5 = arg1 <= 2048 ? (arg3 + 4096) * arg1 >> 12 : -(arg1 * arg3 >> 12) + arg3 + arg1;
        if (~var5 < -1) {
            int var6 = arg0 * 6;
            int var7 = arg1 - var5 + arg1;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = var6 - (var9 << 12);
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 - -var13;
            int var15 = -var13 + var5;
            if (~var9 == -1) {
                this.field2408 = var14;
                this.field2419 = var7;
                this.field2418 = var5;
                return;
            }
            if (var9 == 1) {
                this.field2408 = var5;
                this.field2419 = var7;
                this.field2418 = var15;
                return;
            }
            if (var9 == 2) {
                this.field2418 = var7;
                this.field2408 = var5;
                this.field2419 = var14;
                return;
            }
            if (var9 == 3) {
                this.field2408 = var15;
                this.field2418 = var7;
                this.field2419 = var5;
                return;
            }
            if (~var9 == -5) {
                this.field2408 = var7;
                this.field2418 = var14;
                this.field2419 = var5;
                return;
            }
            if (var9 == 5) {
                this.field2408 = var7;
                this.field2418 = var5;
                this.field2419 = var15;
                return;
            }
        } else {
            this.field2418 = this.field2408 = this.field2419 = arg1;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lmb;Lmb;Z)V")
    public static final void method937(class178 arg0, class178 arg1, boolean arg2) {
        class14.field310 = class221.method1463(class50.field1109, 0, (byte) 123, arg0, arg1);
        ++field2416;
        class92.field1748 = (class240) class14.field310;
        if (arg2) {
            field2413 = null;
        }
        class3.field93 = class221.method1463(class203.field3495, 0, (byte) 123, arg0, arg1);
        class71.field1399 = class221.method1463(class248.field4293, 0, (byte) 123, arg0, arg1);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IB)[[I")
    public final int[][] method157(int arg0, byte arg1) {
        ++field2410;
        if (arg1 <= 2) {
            this.method936(-65, -39, (byte) 106, -39);
        }
        int[][] var3 = super.field1485.method649(arg0, true);
        if (super.field1485.field1692) {
            int[][] var4 = this.method565((byte) -20, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class96.field1807 < ~var11; ++var11) {
                this.method938(var6[var11], var5[var11], var7[var11], 4096);
                this.field2414 += this.field2424;
                this.field2422 += this.field2420;
                while (this.field2414 < 0) {
                    this.field2414 += 4096;
                }
                while (this.field2414 > 4096) {
                    this.field2414 -= 4096;
                }
                this.field2423 += this.field2404;
                if (this.field2422 < 0) {
                    this.field2422 = 0;
                }
                if (~this.field2423 > -1) {
                    this.field2423 = 0;
                }
                if (~this.field2422 < -4097) {
                    this.field2422 = 4096;
                }
                if (~this.field2423 < -4097) {
                    this.field2423 = 4096;
                }
                this.method936(this.field2414, this.field2423, (byte) 83, this.field2422);
                var8[var11] = this.field2418;
                var9[var11] = this.field2408;
                var10[var11] = this.field2419;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lk;BI)V")
    public final void method158(class152 arg0, byte arg1, int arg2) {
        ++field2412;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field2404 = (arg0.method1060((byte) -58) << 12) / 100;
                }
            } else {
                this.field2420 = (arg0.method1060((byte) -58) << 12) / 100;
            }
        } else {
            this.field2424 = arg0.method1075(-7903);
        }
        if (arg1 > -86) {
            this.method157(49, (byte) -50);
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
    public class135() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIII)V")
    private final void method938(int arg0, int arg1, int arg2, int arg3) {
        ++field2406;
        int var5 = ~arg1 <= ~arg0 ? arg0 : arg1;
        int var6 = ~arg0 <= ~arg1 ? arg0 : arg1;
        int var7 = arg2 <= var6 ? var6 : arg2;
        int var8 = var5 > arg2 ? arg2 : var5;
        int var9 = var7 - var8;
        if (~var9 >= -1) {
            this.field2414 = 0;
        } else {
            int var10 = (-arg0 + var7 << 12) / var9;
            int var11 = (-arg2 + var7 << 12) / var9;
            int var12 = (-arg1 + var7 << 12) / var9;
            if (~arg1 == ~var7) {
                this.field2414 = ~arg0 != ~var8 ? -var10 + 4096 : 20480 - -var11;
            } else if (arg0 == var7) {
                this.field2414 = arg2 == var8 ? var12 + 4096 : 12288 - var11;
            } else {
                this.field2414 = arg1 != var8 ? -var12 + 20480 : var10 + 12288;
            }
            this.field2414 /= 6;
        }
        this.field2423 = (var7 + var8) / 2;
        if (this.field2423 > 0 && ~this.field2423 > -4097) {
            this.field2422 = (var9 << 12) / (this.field2423 > 2048 ? -(this.field2423 * 2) + 8192 : this.field2423 * 2);
        } else {
            this.field2422 = 0;
        }
        if (arg3 != 4096) {
            this.field2418 = 101;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)V")
    public static final void method939(int arg0, int arg1, int arg2) {
        class157.field2751 = true;
        class129.field2312 = arg0;
        class162.field2836 = arg1;
        class139.field2479 = arg2;
        class156.field2741 = -1;
        class108.field2021 = -1;
    }
}
