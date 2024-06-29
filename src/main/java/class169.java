import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class169 extends class273 {

    @OriginalMember(owner = "client!wg", name = "W", descriptor = "I")
    private int field3119 = 4096;

    @OriginalMember(owner = "client!wg", name = "U", descriptor = "I")
    private int field3117 = 4096;

    @OriginalMember(owner = "client!wg", name = "Z", descriptor = "I")
    private int field3122 = 4096;

    @OriginalMember(owner = "client!wg", name = "gb", descriptor = "[I")
    private int[] field3129 = new int[3];

    @OriginalMember(owner = "client!wg", name = "cb", descriptor = "I")
    private int field3125 = 409;

    @OriginalMember(owner = "client!wg", name = "V", descriptor = "Ljd;")
    public static class86 field3118 = class122.method868("p12_full", true);

    @OriginalMember(owner = "client!wg", name = "bb", descriptor = "I")
    public static int field3124 = 0;

    @OriginalMember(owner = "client!wg", name = "S", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!wg", name = "X", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!wg", name = "Y", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!wg", name = "ab", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!wg", name = "db", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!wg", name = "eb", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!wg", name = "fb", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!wg", name = "T", descriptor = "[I")
    public static int[] field3116;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(II)V")
    public static final void method1214(int arg0, int arg1) {
        class191.field3395.method693(6, arg1);
        int var2 = 126 % ((-23 - arg0) / 58);
        ++field3123;
        class272.field4773.method693(6, arg1);
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
    public class169() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILqk;I)V")
    public final void method34(int arg0, class200 arg1, int arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 == -5) {
                            int var5 = arg1.method1405(-3);
                            this.field3129[2] = class1.method5(0, var5 >> 12);
                            this.field3129[1] = class1.method5(var5, 65280) >> 4;
                            this.field3129[0] = class1.method5(267386880, var5 << 4);
                        }
                    } else {
                        this.field3119 = arg1.method1410(-65);
                    }
                } else {
                    this.field3122 = arg1.method1410(-89);
                }
            } else {
                this.field3117 = arg1.method1410(-107);
            }
        } else {
            this.field3125 = arg1.method1410(-87);
        }
        if (arg2 >= -16) {
            this.method34(44, (class200) null, -8);
        }
        ++field3126;
    }

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "(I)Ljd;")
    public static final class86 method1215(int arg0) {
        if (arg0 < 92) {
            method1218((byte) -1);
        }
        class86 var1 = class200.field3586;
        if (class220.field3961 != 0) {
            var1 = class64.field1259;
        }
        class86 var2 = class56.field1155;
        if (class130.field2487 != null) {
            var2 = class109.method783(2, new class86[] { class260.field4652, class130.field2487 });
        }
        ++field3120;
        return class109.method783(2, new class86[] { class116.field2213, var1, class37.field882, class4.method26(false, class257.field4558), class224.field4024, class4.method26(false, class179.field3235), var2, class37.field848 });
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IB)[[I")
    public final int[][] method29(int arg0, byte arg1) {
        int var3 = -114 % ((arg1 - 12) / 58);
        int[][] var4 = super.field4787.method1657(arg0, (byte) -92);
        ++field3115;
        if (super.field4787.field4355) {
            int[][] var5 = this.method1859(arg0, 0, 3);
            int[] var6 = var5[0];
            int[] var7 = var5[2];
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var5[1];
            int[] var11 = var4[2];
            for (int var12 = 0; ~var12 > ~class176.field3200; ++var12) {
                int var13 = var6[var12];
                int var14 = -this.field3129[0] + var13;
                if (~var14 > -1) {
                    var14 = -var14;
                }
                if (var14 > this.field3125) {
                    var8[var12] = var13;
                    var9[var12] = var10[var12];
                    var11[var12] = var7[var12];
                } else {
                    int var15 = var10[var12];
                    int var16 = -this.field3129[1] + var15;
                    if (~var16 > -1) {
                        var16 = -var16;
                    }
                    if (~var16 < ~this.field3125) {
                        var8[var12] = var13;
                        var9[var12] = var15;
                        var11[var12] = var7[var12];
                    } else {
                        int var17 = var7[var12];
                        int var18 = -this.field3129[2] + var17;
                        if (var18 < 0) {
                            var18 = -var18;
                        }
                        if (~this.field3125 > ~var18) {
                            var8[var12] = var13;
                            var9[var12] = var15;
                            var11[var12] = var17;
                        } else {
                            var8[var12] = this.field3119 * var13 >> 12;
                            var9[var12] = this.field3122 * var15 >> 12;
                            var11[var12] = this.field3117 * var17 >> 12;
                        }
                    }
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "(I)V")
    public static void method1216(int arg0) {
        field3116 = null;
        if (arg0 != 32) {
            field3118 = null;
        }
        field3118 = null;
    }

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "(I)V")
    public static final void method1217(int arg0) {
        if (arg0 == -2) {
            ++field3128;
            while (~class168.field3102.method1354(class112.field2143, (byte) -125) <= -12) {
                int var1 = class168.field3102.method1352(11, 43);
                if (~var1 == -2048) {
                    break;
                }
                boolean var2 = false;
                if (class186.field3294[var1] == null) {
                    class186.field3294[var1] = new class224();
                    var2 = true;
                    if (class69.field1367[var1] != null) {
                        class186.field3294[var1].method1575(123, class69.field1367[var1]);
                    }
                }
                class142.field2689[class209.field3786++] = var1;
                class224 var3 = class186.field3294[var1];
                var3.field702 = class236.field4265;
                int var4 = class117.field2265[class168.field3102.method1352(3, -118)];
                if (var2) {
                    var3.field716 = var3.field700 = var4;
                }
                int var5 = class168.field3102.method1352(1, -122);
                if (~var5 == -2) {
                    class271.field4762[class164.field3083++] = var1;
                }
                int var6 = class168.field3102.method1352(5, -66);
                if (~var6 < -16) {
                    var6 -= 32;
                }
                int var7 = class168.field3102.method1352(5, -69);
                int var8 = class168.field3102.method1352(1, arg0 + 80);
                if (~var7 < -16) {
                    var7 -= 32;
                }
                var3.method1570(class124.field2412.field705[0] - -var6, ~var8 == -2, class124.field2412.field707[0] + var7, -121);
            }
            class168.field3102.method1359(96);
        }
    }

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "(B)V")
    public static final void method1218(byte arg0) {
        class214.field3869.method703((byte) 122);
        class73.field1475.method703((byte) 122);
        if (arg0 != 39) {
            field3124 = -46;
        }
        class92.field1871.method703((byte) 122);
        ++field3127;
    }
}
