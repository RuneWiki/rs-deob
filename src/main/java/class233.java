import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class233 extends class273 {

    @OriginalMember(owner = "client!qf", name = "ab", descriptor = "I")
    private int field4215 = 585;

    @OriginalMember(owner = "client!qf", name = "S", descriptor = "Z")
    public static boolean field4207 = false;

    @OriginalMember(owner = "client!qf", name = "Z", descriptor = "J")
    public static volatile long field4214 = 0L;

    @OriginalMember(owner = "client!qf", name = "cb", descriptor = "[Lbc;")
    public static class170[] field4217 = new class170[32768];

    @OriginalMember(owner = "client!qf", name = "db", descriptor = "I")
    public static int field4218 = 0;

    @OriginalMember(owner = "client!qf", name = "X", descriptor = "Luk;")
    public static class96 field4212 = new class96(5);

    @OriginalMember(owner = "client!qf", name = "T", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!qf", name = "U", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!qf", name = "V", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!qf", name = "W", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!qf", name = "Y", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!qf", name = "bb", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!qf", name = "eb", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)V")
    public static void method1612(int arg0) {
        field4217 = null;
        field4212 = null;
        if (arg0 != 0) {
            method1615(-11, (byte) -71);
        }
    }

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "(I)V")
    public static final void method1613(int arg0) {
        if (arg0 == 11776) {
            class191.field3395.method703((byte) 122);
            class272.field4773.method703((byte) 122);
            ++field4213;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILbl;Z)V")
    public static final void method1614(int arg0, class33 arg1, boolean arg2) {
        if (class236.field4265 < arg1.field747) {
            class35.method269(arg1, 128);
        } else if (arg1.field697 >= class236.field4265) {
            class264.method1790(arg1, -2);
        } else {
            class193.method1349(arg1, 107);
        }
        if (!arg2) {
            if (arg1.field676 < 128 || arg1.field685 < 128 || ~arg1.field676 <= -13185 || ~arg1.field685 <= -13185) {
                arg1.field697 = 0;
                arg1.field690 = -1;
                arg1.field683 = -1;
                arg1.field747 = 0;
                arg1.field676 = arg1.field707[0] * 128 - -(64 * arg1.method240((byte) 122));
                arg1.field685 = arg1.field705[0] * 128 + 64 * arg1.method240((byte) 43);
                arg1.method239((byte) -100);
            }
            ++field4209;
            if (class124.field2412 == arg1 && (~arg1.field676 > -1537 || ~arg1.field685 > -1537 || arg1.field676 >= 11776 || arg1.field685 >= 11776)) {
                arg1.field690 = -1;
                arg1.field697 = 0;
                arg1.field747 = 0;
                arg1.field683 = -1;
                arg1.field676 = arg1.field707[0] * 128 + 64 * arg1.method240((byte) -115);
                arg1.field685 = arg1.field705[0] * 128 + 64 * arg1.method240((byte) -127);
                arg1.method239((byte) -63);
            }
            class247.method1676(0, arg1);
            class93.method687(-1, arg1);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        ++field4208;
        if (arg0 != -7420) {
            field4212 = null;
        }
        int[] var3 = super.field4800.method1224(arg1, 0);
        if (super.field4800.field3160) {
            int var4 = class143.field2711[arg1];
            for (int var5 = 0; class176.field3200 > var5; ++var5) {
                int var6 = class114.field2184[var5];
                if (var6 > this.field4215 && -this.field4215 + 4096 > var6 && ~var4 < ~(2048 - this.field4215) && ~var4 > ~(this.field4215 + 2048)) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 > -1 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field4215 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (var6 > -this.field4215 + 2048 && 2048 - -this.field4215 > var6) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 <= -1 ? var11 : -var11;
                    int var13 = var12 - this.field4215;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field4215 + 2048);
                } else if (~var4 <= ~this.field4215 && ~(4096 - this.field4215) <= ~var4) {
                    if (this.field4215 <= var6 && -this.field4215 + 4096 >= var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 >= 0 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field4215 + 2048);
                        var3[var5] = 4096 - var18;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field4215;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field4215 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILqk;I)V")
    public final void method34(int arg0, class200 arg1, int arg2) {
        if (~arg0 == -1) {
            this.field4215 = arg1.method1410(-56);
        }
        if (arg2 > -16) {
            field4214 = -122L;
        }
        ++field4211;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(IB)I")
    public static final int method1615(int arg0, byte arg1) {
        ++field4219;
        class77 var2 = class273.method1858((byte) 14, arg0);
        int var3 = var2.field1529;
        int var4 = var2.field1522;
        int var5 = var2.field1525;
        if (arg1 >= -67) {
            field4212 = null;
        }
        int var6 = class275.field4820[-var3 + var4];
        return class273.field4805[var5] >> var3 & var6;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
    public class233() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZLwf;Z)V")
    public static final void method1616(boolean arg0, class1 arg1, boolean arg2) {
        ++field4216;
        int var3 = (int) arg1.field3759;
        int var4 = arg1.field2;
        arg1.method1477(1);
        if (arg2) {
            class161.method1172(0, var4);
        }
        class49.method379((byte) -73, var4);
        class6 var5 = class25.method178(104, var3);
        if (arg0) {
            if (var5 != null) {
                class62.method441(-29481, var5);
            }
            int var6 = class16.field463;
            for (int var7 = 0; ~var6 < ~var7; ++var7) {
                if (class81.method569(class273.field4784[var7], 104)) {
                    class165.method1193(var7, 10120);
                }
            }
            if (class16.field463 == 1) {
                class195.field3506 = false;
                class186.method1280(class202.field3642, arg0, class112.field2144, class127.field2462, class108.field2080);
            } else {
                class186.method1280(class202.field3642, arg0, class112.field2144, class127.field2462, class108.field2080);
                int var8 = class141.field2684.method1767(class198.field3524);
                for (int var9 = 0; class16.field463 > var9; ++var9) {
                    int var10 = class141.field2684.method1767(class127.method896(12307, var9));
                    if (var10 > var8) {
                        var8 = var10;
                    }
                }
                class108.field2080 = var8 + 8;
                class127.field2462 = class16.field463 * 15 + 22;
            }
            if (~class178.field3225 != 0) {
                class67.method476((byte) 95, 1, class178.field3225);
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljd;B)V")
    public static final void method1617(class86 arg0, byte arg1) {
        int var2 = 7 % ((arg1 - -26) / 32);
        ++field4210;
        class130.field2487 = arg0;
        if (class157.field2954.field4514 != null) {
            try {
                class86 var3 = class86.field1666.method630(class157.field2954.field4514, 0);
                class86 var4 = class76.field1511.method630(class157.field2954.field4514, 0);
                class86 var5 = class109.method783(2, new class86[] { var3, class23.field575, arg0, class156.field2945, var4 });
                class86 var6;
                if (~arg0.method612((byte) 107) != -1) {
                    var6 = class109.method783(2, new class86[] { var5, class257.field4568, class38.method320(94608000000L + class253.method1711((byte) -75), (byte) -7), class165.field3096, class14.method106(94608000L, (byte) -54) });
                } else {
                    var6 = class109.method783(2, new class86[] { var5, class76.field1508 });
                }
                class109.method783(2, new class86[] { class3.field30, var6, class135.field2586 }).method602((byte) -69, class157.field2954.field4514);
            } catch (Throwable var7) {
            }
        }
    }
}
