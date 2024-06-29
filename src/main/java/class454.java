import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class454 extends class475 {

    @OriginalMember(owner = "client!um", name = "s", descriptor = "[I")
    private int[] field6784 = new int[this.field7020];

    @OriginalMember(owner = "client!um", name = "p", descriptor = "I")
    public static int field6781 = -1;

    @OriginalMember(owner = "client!um", name = "o", descriptor = "I")
    public static int field6780;

    @OriginalMember(owner = "client!um", name = "q", descriptor = "I")
    public static int field6782;

    @OriginalMember(owner = "client!um", name = "r", descriptor = "I")
    public static int field6783;

    @OriginalMember(owner = "client!um", name = "t", descriptor = "I")
    public static int field6785;

    @OriginalMember(owner = "client!um", name = "u", descriptor = "I")
    public static int field6786;

    @OriginalMember(owner = "client!um", name = "v", descriptor = "I")
    public static int field6787;

    @OriginalMember(owner = "client!um", name = "w", descriptor = "I")
    public static int field6788;

    @OriginalMember(owner = "client!um", name = "x", descriptor = "I")
    public static int field6789;

    @OriginalMember(owner = "client!um", name = "A", descriptor = "I")
    private int field6792;

    @OriginalMember(owner = "client!um", name = "B", descriptor = "I")
    private int field6793;

    @OriginalMember(owner = "client!um", name = "y", descriptor = "Lcm;")
    public static class631 field6790;

    @OriginalMember(owner = "client!um", name = "z", descriptor = "[B")
    private byte[] field6791;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 4)
    public static final void method2803(String arg0, int arg1) {
        ++field6785;
        if (arg0 != null) {
            if (arg0.startsWith("*")) {
                arg0 = arg0.substring(1);
            }
            String var2 = class207.method1323(arg1 ^ 15493, arg0);
            if (var2 != null) {
                if (arg1 == 17199) {
                    for (int var3 = 0; ~var3 > ~class245.field3464; ++var3) {
                        String var4 = class601.field8772[var3];
                        if (var4.startsWith("*")) {
                            var4 = var4.substring(1);
                        }
                        String var5 = class207.method1323(32682, var4);
                        if (var5 != null && var5.equals(var2)) {
                            --class245.field3464;
                            for (int var6 = var3; class245.field3464 > var6; ++var6) {
                                class601.field8772[var6] = class601.field8772[var6 + 1];
                                class104.field1250[var6] = class104.field1250[var6 + 1];
                                class446.field6667[var6] = class446.field6667[var6 + 1];
                                class378.field5756[var6] = class378.field5756[var6 + 1];
                                class135.field1688[var6] = class135.field1688[var6 + 1];
                            }
                            ++class113.field1392;
                            class236.field3383 = class240.field3406;
                            class308.method2044(class409.field6191, -7434);
                            class468.field6960.method1205((byte) -69, class456.method2816(-110, arg0));
                            class468.field6960.method1237(1049279824, arg0);
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V", line = 68)
    public final void method2804(int arg0) {
        this.field6792 = 0;
        this.field6793 = 0;
        if (arg0 == 4096) {
            ++field6780;
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(BII)V", line = 83)
    public void method2101(byte arg0, int arg1, int arg2) {
        this.field6791[this.field6793++] = (byte) (127 + (class643.method3659(255, arg0) >> 1));
        if (arg2 == 2074826817) {
            ++field6783;
        }
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(IIIIIF)V", line = 98)
    public class454(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~super.field7020 < ~var7; ++var7) {
            this.field6784[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(I)J", line = 117)
    public static final long method2805(int arg0) {
        ++field6787;
        if (arg0 >= -15) {
            field6790 = null;
        }
        return class51.field544.method1607((byte) -76);
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(I)V", line = 131)
    public final void method2806(int arg0) {
        ++field6788;
        if (arg0 != 4) {
            this.field6791 = null;
        }
        this.field6792 = Math.abs(this.field6792);
        if (~this.field6792 <= -4097) {
            this.field6792 = 4095;
        }
        this.method2101((byte) (this.field6792 >> 4), this.field6793++, 2074826817);
        this.field6792 = 0;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(BII)V", line = 155)
    public final void method2807(byte arg0, int arg1, int arg2) {
        ++field6782;
        int var4 = -112 / ((-14 - arg0) / 48);
        this.field6792 += this.field6784[arg1] * arg2 >> 12;
    }

    @OriginalMember(owner = "client!um", name = "e", descriptor = "(I)V", line = 165)
    public static void method2808(int arg0) {
        int var1 = -89 % ((arg0 - 15) / 46);
        field6790 = null;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Loa;Llm;Llq;I)V", line = 176)
    public static final void method2809(class605 arg0, class431 arg1, class480 arg2, int arg3) {
        ++field6789;
        class433 var4 = arg1.method2690(arg0, 131072);
        if (var4 != null) {
            int var5 = var4.method1570();
            if (~var5 > ~var4.method1576()) {
                var5 = var4.method1576();
            }
            byte var6 = 10;
            int var7 = arg2.field7056;
            int var8 = arg2.field7058;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            if (arg1.field6418 != null) {
                var9 = class327.field4720.method2561(arg1.field6418, (int[]) null, (byte) -95, (class433[]) null, class484.field7095);
                for (int var12 = 0; var9 > var12; ++var12) {
                    String var13 = class484.field7095[var12];
                    if (~var12 > ~(var9 + -1)) {
                        var13 = var13.substring(0, var13.length() - 4);
                    }
                    int var14 = class34.field391.method2914(var13);
                    if (~var14 < ~var10) {
                        var10 = var14;
                    }
                }
                var11 = var9 * class34.field391.method2913() - -(class34.field391.method2911() / 2);
            }
            int var15 = var5 / 2 + arg2.field7056;
            if (class182.field2277 + var5 <= var7) {
                if (-var5 + class182.field2276 < var7) {
                    var15 = -(var10 / 2) + -var6 + class182.field2276 + -(var5 / 2) - 5;
                    var7 = class182.field2276 - var5;
                }
            } else {
                var7 = class182.field2277;
                var15 = class182.field2277 + 5 - (-(var5 / 2) + -var6 - var10 / 2);
            }
            int var16 = arg2.field7058;
            if (var8 < class182.field2270 - -var5) {
                var8 = class182.field2270;
                var16 = class182.field2270 - -(var5 / 2) + var6;
            } else if (~(-var5 + class182.field2263) > ~var8) {
                var8 = -var5 + class182.field2263;
                var16 = -(var5 / 2) + class182.field2263 + -var11 + -var6;
            }
            int var17 = 65535 & (int) (Math.atan2((double) (var7 - arg2.field7056), (double) (-arg2.field7058 + var8)) / 3.141592653589793D * 32767.0D);
            var4.method2704((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
            if (arg3 <= -39) {
                int var18 = -2;
                int var19 = -2;
                int var20 = -2;
                int var21 = -2;
                if (arg1.field6418 != null) {
                    var19 = var16;
                    var18 = var15 - var10 / 2 + -5;
                    var21 = 3 + (var16 - -(class34.field391.method2913() * var9));
                    var20 = var18 - -10 + var10;
                    if (arg1.field6416 != 0) {
                        arg0.method3524(-var18 + var20, var16, (byte) 92, arg1.field6416, -var16 + var21, var18);
                    }
                    if (~arg1.field6411 != -1) {
                        arg0.method3523(true, -var16 + var21, var16, -var18 + var20, arg1.field6411, var18);
                    }
                    for (int var22 = 0; ~var22 > ~var9; ++var22) {
                        String var23 = class484.field7095[var22];
                        if (~(var9 + -1) < ~var22) {
                            var23 = var23.substring(0, var23.length() - 4);
                        }
                        class34.field391.method2910(arg0, var23, var15, var16, arg1.field6392, true);
                        var16 += class34.field391.method2913();
                    }
                }
                if (~arg1.field6407 != 0 || arg1.field6418 != null) {
                    int var24 = var5 >> 1;
                    class491 var25 = new class491(arg2);
                    var25.field7158 = -var24 + var8;
                    var25.field7155 = var19;
                    var25.field7154 = var8 - -var24;
                    var25.field7160 = var21;
                    var25.field7151 = var20;
                    var25.field7162 = var7 - -var24;
                    var25.field7153 = var7 - var24;
                    var25.field7161 = var18;
                    class501.field7292.method706(var25, true);
                }
            }
        }
    }
}
