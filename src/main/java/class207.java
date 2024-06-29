import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class207 extends class118 {

    @OriginalMember(owner = "client!qh", name = "K", descriptor = "Z")
    public static volatile boolean field3094;

    @OriginalMember(owner = "client!qh", name = "G", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!qh", name = "H", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!qh", name = "I", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!qh", name = "J", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!qh", name = "L", descriptor = "[I")
    public static int[] field3095;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIZZI)V")
    public static final void method1212(int arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        ++field3090;
        if (arg3 || class53.field718 != arg4 || class137.field1860 != arg1 || ~class88.field1263 != ~class143.field1911 && !class360.method2172(74)) {
            class137.field1860 = arg1;
            class88.field1263 = class143.field1911;
            class53.field718 = arg4;
            if (class360.method2172(arg0 + 129)) {
                class88.field1263 = 0;
            }
            if (!arg2) {
                class316.method1929(false, 25);
            } else {
                class316.method1929(false, 28);
            }
            class217.method1322(class380.field5552, class28.field365.method937((byte) 123, class27.field356), 125, true);
            int var5 = class17.field250;
            class17.field250 = (class53.field718 - (class115.field1522 >> 4)) * 8;
            int var6 = class112.field1487;
            class112.field1487 = (-(class198.field3004 >> 4) + class137.field1860) * 8;
            class410.field6113 = class223.method1365(class53.field718 * 8, class137.field1860 * 8);
            class430.field6325 = null;
            int var7 = class17.field250 - var5;
            int var8 = -var6 + class112.field1487;
            if (arg2) {
                class38.field458 = 0;
                int var9 = class115.field1522 * 128 + -128;
                int var10 = class198.field3004 * 128 + -128;
                for (int var11 = 0; var11 < 32768; ++var11) {
                    class155 var12 = class170.field2626[var11];
                    if (var12 != null) {
                        var12.field1900 -= var7 * 128;
                        var12.field1892 -= var8 * 128;
                        if (var12.field1900 >= 0 && ~var12.field1900 >= ~var9 && var12.field1892 >= 0 && ~var12.field1892 >= ~var10) {
                            boolean var13 = true;
                            for (int var14 = 0; ~var14 > -11; ++var14) {
                                var12.field2019[var14] -= var7;
                                var12.field2018[var14] -= var8;
                                if (var12.field2019[var14] < 0 || ~class115.field1522 >= ~var12.field2019[var14] || var12.field2018[var14] < 0 || class198.field3004 <= var12.field2018[var14]) {
                                    var13 = false;
                                }
                            }
                            if (!var13) {
                                class170.field2626[var11].method956((class271) null, arg0 + 5);
                                class170.field2626[var11] = null;
                            } else {
                                class87.field1235[class38.field458++] = var11;
                            }
                        } else {
                            class170.field2626[var11].method956((class271) null, arg0 ^ -5);
                            class170.field2626[var11] = null;
                        }
                    }
                }
            } else {
                for (int var15 = 0; ~var15 > -32769; ++var15) {
                    class155 var20 = class170.field2626[var15];
                    if (var20 != null) {
                        for (int var21 = 0; var21 < 10; ++var21) {
                            var20.field2019[var21] -= var7;
                            var20.field2018[var21] -= var8;
                        }
                        var20.field1892 -= var8 * 128;
                        var20.field1900 -= var7 * 128;
                    }
                }
            }
            for (int var16 = 0; var16 < 2048; ++var16) {
                class169 var18 = class140.field1883[var16];
                if (var18 != null) {
                    for (int var19 = 0; var19 < 10; ++var19) {
                        var18.field2019[var19] -= var7;
                        var18.field2018[var19] -= var8;
                    }
                    var18.field1900 -= var7 * 128;
                    var18.field1892 -= var8 * 128;
                }
            }
            class109.method673(var7, var8, arg0 ^ 75);
            for (class343 var17 = (class343) class192.field2875.method2514((byte) 61); var17 != null; var17 = (class343) class192.field2875.method2511(62)) {
                var17.field5135 -= var8;
                var17.field5129 -= var7;
                if (var17.field5129 < 0 || var17.field5135 < 0 || ~class115.field1522 >= ~var17.field5129 || ~var17.field5135 <= ~class198.field3004) {
                    var17.method625((byte) -50);
                }
            }
            if (~class8.field80 != -1) {
                class452.field6685 -= var8;
                class8.field80 -= var7;
            }
            class5.field64 = 0;
            if (!arg2) {
                if (~class80.field1054 == -5) {
                    class103.field1401 -= var8 * 128;
                    class331.field4950 -= var7 * 128;
                    class155.field2138 -= var8 * 128;
                    class136.field1804 -= var7 * 128;
                } else {
                    class80.field1054 = 1;
                }
            } else {
                class407.field6067 -= var8;
                class341.field5105 -= var8;
                class185.field2790 -= var7 * 128;
                class402.field6007 -= var7;
                class174.field2666 -= var7;
                class196.field2967 -= var8 * 128;
                if (Math.abs(var7) > class115.field1522 || Math.abs(var8) > class198.field3004) {
                    class149.method930((byte) -95);
                }
            }
            class238.method1430(arg0 ^ arg0);
            class314.method1922(0);
            class88.field1245.method2512((byte) 4);
            class301.field4541.method2512((byte) 4);
            class168.field2405.method2121((byte) 63);
            class150.method935(arg0 + 1975);
        }
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)V")
    public static void method1213(byte arg0) {
        if (arg0 >= 119) {
            field3095 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field3093;
        int[] var3 = super.field1537.method2395(arg0 ^ 30962, arg1);
        if (arg0 != 1) {
            method1215((class170) null, true, 13);
        }
        if (super.field1537.field5756) {
            class129.method766(var3, 0, class440.field6474, class160.field2210[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "([I[JI)V")
    public static final void method1214(int[] arg0, long[] arg1, int arg2) {
        class25.method153(-26819, arg1.length + -1, arg1, arg0, 0);
        ++field3091;
        if (arg2 != 29633) {
            field3095 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
    public class207() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lfh;ZI)V")
    public static final void method1215(class170 arg0, boolean arg1, int arg2) {
        ++field3092;
        int var3 = ~arg0.field2577 == -1 ? arg0.field2561 : arg0.field2577;
        if (arg2 > 26) {
            int var4 = arg0.field2598 != 0 ? arg0.field2598 : arg0.field2501;
            class198.method1184(true, var4, var3, class130.field1650[arg0.field2525 >> 16], arg0.field2525, arg1);
            if (arg0.field2625 != null) {
                class198.method1184(true, var4, var3, arg0.field2625, arg0.field2525, arg1);
            }
            class333 var5 = (class333) class308.field4647.method2302((long) arg0.field2525, 23576);
            if (var5 != null) {
                class423.method2609(var4, arg1, var5.field4965, 2109192076, var3);
            }
        }
    }

    static {
        new class151("Ok", "Okay", "OK", "Ok");
        field3094 = true;
    }
}
