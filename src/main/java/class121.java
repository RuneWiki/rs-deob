import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class121 extends class105 {

    @OriginalMember(owner = "client!nd", name = "ab", descriptor = "I")
    private int field2438 = 0;

    @OriginalMember(owner = "client!nd", name = "db", descriptor = "I")
    private int field2441 = 12288;

    @OriginalMember(owner = "client!nd", name = "jb", descriptor = "I")
    private int field2447 = 8192;

    @OriginalMember(owner = "client!nd", name = "eb", descriptor = "I")
    private int field2442 = 0;

    @OriginalMember(owner = "client!nd", name = "gb", descriptor = "I")
    private int field2444 = 2048;

    @OriginalMember(owner = "client!nd", name = "lb", descriptor = "I")
    private int field2449 = 4096;

    @OriginalMember(owner = "client!nd", name = "bb", descriptor = "I")
    private int field2439 = 2048;

    @OriginalMember(owner = "client!nd", name = "Y", descriptor = "Leh;")
    public static class47 field2436 = class195.method1282((byte) -4, "cross");

    @OriginalMember(owner = "client!nd", name = "cb", descriptor = "Leh;")
    public static class47 field2440 = class195.method1282((byte) -4, "Hidden)2use");

    @OriginalMember(owner = "client!nd", name = "Z", descriptor = "[I")
    public static int[] field2437 = new int[4000];

    @OriginalMember(owner = "client!nd", name = "kb", descriptor = "[I")
    public static int[] field2448 = new int[2000];

    @OriginalMember(owner = "client!nd", name = "fb", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!nd", name = "hb", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!nd", name = "ib", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!nd", name = "mb", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!nd", name = "nb", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!nd", name = "ob", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!nd", name = "pb", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!nd", name = "qb", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(I)V")
    public final void method13(int arg0) {
        class185.method1227((byte) -75);
        ++field2450;
        if (arg0 != -1) {
            field2448 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(III)Z")
    private final boolean method931(int arg0, int arg1, int arg2) {
        ++field2446;
        int var4 = (-arg1 + arg0) * this.field2441 >> 12;
        int var5 = class72.field1551[(var4 * 255 & arg2) >> 12];
        int var6 = (var5 << 12) / this.field2441;
        int var7 = (var6 << 12) / this.field2447;
        int var8 = this.field2449 * var7 >> 12;
        return ~(arg0 + arg1) > ~var8 && ~(arg0 + arg1) < ~(-var8);
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
    public class121() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(IBI)Z")
    private final boolean method932(int arg0, byte arg1, int arg2) {
        if (arg1 != -40) {
            this.method17(-114, (class68) null, -118);
        }
        int var4 = (arg0 + arg2) * this.field2441 >> 12;
        ++field2454;
        int var5 = class72.field1551[(var4 * 255 & 1045955) >> 12];
        int var6 = (var5 << 12) / this.field2441;
        int var7 = (var6 << 12) / this.field2447;
        int var8 = this.field2449 * var7 >> 12;
        return -arg2 + arg0 < var8 && ~(-var8) > ~(-arg2 + arg0);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILhd;I)V")
    public final void method17(int arg0, class68 arg1, int arg2) {
        ++field2443;
        if (arg2 != -256) {
            field2453 = 42;
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field2447 = arg1.method569(arg2 + 26752);
                                }
                            } else {
                                this.field2449 = arg1.method569(arg2 + 26752);
                            }
                        } else {
                            this.field2441 = arg1.method569(arg2 ^ -26496);
                        }
                    } else {
                        this.field2439 = arg1.method569(arg2 ^ -26496);
                    }
                } else {
                    this.field2442 = arg1.method569(26496);
                }
            } else {
                this.field2438 = arg1.method569(26496);
            }
        } else {
            this.field2444 = arg1.method569(26496);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)[I")
    public final int[] method92(int arg0, byte arg1) {
        ++field2451;
        int[] var3 = super.field2192.method336(-114, arg0);
        if (super.field2192.field770) {
            int var4 = class26.field500[arg0] + -2048;
            for (int var5 = 0; var5 < class149.field2928; ++var5) {
                int var6 = class167.field3237[var5] + -2048;
                int var7 = this.field2444 + var6;
                int var8 = var7 >= -2048 ? var7 : var7 + 4096;
                int var9 = var8 > 2048 ? var8 - 4096 : var8;
                int var10 = this.field2438 + var4;
                int var11 = var10 < -2048 ? var10 + 4096 : var10;
                int var12 = var11 > 2048 ? var11 + -4096 : var11;
                int var13 = this.field2442 + var6;
                int var14 = this.field2439 + var4;
                int var15 = var14 < -2048 ? var14 + 4096 : var14;
                int var16 = ~var15 < -2049 ? var15 + -4096 : var15;
                int var17 = ~var13 > 2047 ? var13 - -4096 : var13;
                int var18 = ~var17 >= -2049 ? var17 : var17 + -4096;
                var3[var5] = !this.method931(var12, var9, 1047499) && !this.method932(var16, (byte) -40, var18) ? 0 : 4096;
            }
        }
        if (arg1 < 78) {
            this.field2439 = -114;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "(I)V")
    public static void method933(int arg0) {
        field2436 = null;
        if (arg0 == 4000) {
            field2448 = null;
            field2440 = null;
            field2437 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II[BI)Z")
    public static final boolean method934(int arg0, int arg1, byte[] arg2, int arg3) {
        ++field2452;
        boolean var4 = true;
        class68 var5 = new class68(arg2);
        int var6 = -1;
        label60: while (true) {
            int var7 = var5.method603((byte) -122);
            if (~var7 == -1) {
                if (arg0 != 11118) {
                    method933(47);
                }
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method603((byte) -112);
                    if (var11 == 0) {
                        continue label60;
                    }
                    var8 += var11 + -1;
                    int var12 = 63 & var8;
                    int var13 = var5.method604((byte) -124) >> 2;
                    int var14 = (var8 & 4070) >> 6;
                    int var15 = var12 - -arg3;
                    int var16 = arg1 + var14;
                    if (~var16 < -1 && var15 > 0 && ~var16 > -104 && ~var15 > -104) {
                        class202 var17 = class99.method806(0, var6);
                        if (~var13 != -23 || !class204.field4029 || var17.field3926 != 0 || ~var17.field3969 == -2 || var17.field3986) {
                            if (!var17.method1316(false)) {
                                ++class132.field2605;
                                var4 = false;
                            }
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method603((byte) -116);
                if (~var10 == -1) {
                    break;
                }
                var5.method604((byte) 119);
            }
        }
    }
}
