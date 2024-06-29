import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class381 extends class666 {

    @OriginalMember(owner = "client!mba", name = "Q", descriptor = "I")
    private int field4951 = -1;

    @OriginalMember(owner = "client!mba", name = "F", descriptor = "Lpr;")
    public static class407 field4941 = new class407(0, 5);

    @OriginalMember(owner = "client!mba", name = "P", descriptor = "I")
    public static int field4950 = 1405;

    @OriginalMember(owner = "client!mba", name = "S", descriptor = "[I")
    public static int[] field4953 = new int[5];

    @OriginalMember(owner = "client!mba", name = "T", descriptor = "I")
    public static int field4954 = 0;

    @OriginalMember(owner = "client!mba", name = "D", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!mba", name = "E", descriptor = "I")
    public int field4940;

    @OriginalMember(owner = "client!mba", name = "H", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!mba", name = "I", descriptor = "I")
    public int field4943;

    @OriginalMember(owner = "client!mba", name = "J", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!mba", name = "K", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!mba", name = "L", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!mba", name = "M", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!mba", name = "N", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!mba", name = "R", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!mba", name = "O", descriptor = "[I")
    public int[] field4949;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(ILiaa;Z)V")
    public final void method121(int arg0, class452 arg1, boolean arg2) {
        if (arg0 == 0) {
            this.field4951 = arg1.method2574(-1758460248);
        }
        ++field4946;
        if (!arg2) {
            this.field4949 = null;
        }
    }

    @OriginalMember(owner = "client!mba", name = "c", descriptor = "(I)V")
    public final void method2081(int arg0) {
        super.method2081(arg0);
        ++field4945;
        this.field4949 = null;
    }

    @OriginalMember(owner = "client!mba", name = "h", descriptor = "(I)V")
    public static void method2082(int arg0) {
        int var1 = 72 / ((arg0 - 74) / 46);
        field4941 = null;
        field4953 = null;
    }

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "(I)I")
    public final int method2083(int arg0) {
        ++field4939;
        if (arg0 != 1) {
            this.field4949 = null;
        }
        return this.field4951;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(B)Z")
    public final boolean method2084(byte arg0) {
        ++field4942;
        if (this.field4949 != null) {
            return true;
        } else {
            if (arg0 >= -90) {
                this.field4943 = 101;
            }
            if (this.field4951 >= 0) {
                class563 var2 = ~class22.field204 <= -1 ? class563.method3185(class169.field2029, class22.field204, this.field4951) : class563.method3177(class169.field2029, this.field4951);
                var2.method3189();
                this.field4949 = var2.method3179();
                this.field4943 = var2.field8002;
                this.field4940 = var2.field8005;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!mba", name = "d", descriptor = "(B)V")
    public static final void method2085(byte arg0) {
        ++field4952;
        if (arg0 >= -89) {
            field4953 = null;
        }
        int var1 = class680.field9630.method2532(false);
        int var2 = class680.field9630.method2563(-2263);
        field4954 = class680.field9630.method2553(-209425784);
        int var3 = class680.field9630.method2532(false);
        boolean var4 = class680.field9630.method2563(-2263) == 1;
        class508.method2916((byte) -55);
        class345.method1919((byte) -69, var2);
        class680.field9630.method3459((byte) -116);
        for (int var5 = 0; var5 < 4; ++var5) {
            for (int var20 = 0; ~var20 > ~(class399.field5338 >> 3); ++var20) {
                for (int var21 = 0; var21 < class349.field4567 >> 3; ++var21) {
                    int var22 = class680.field9630.method3465(1, (byte) -118);
                    if (~var22 != -2) {
                        class4.field30[var5][var20][var21] = -1;
                    } else {
                        class4.field30[var5][var20][var21] = class680.field9630.method3465(26, (byte) -98);
                    }
                }
            }
        }
        class680.field9630.method3463((byte) 104);
        int var6 = (class478.field7009 - class680.field9630.field6215) / 16;
        class233.field2974 = new int[var6][4];
        for (int var7 = 0; ~var7 > ~var6; ++var7) {
            for (int var19 = 0; var19 < 4; ++var19) {
                class233.field2974[var7][var19] = class680.field9630.method2575((byte) -48);
            }
        }
        class287.field3696 = new int[var6];
        client.field3410 = null;
        class583.field8295 = new byte[var6][];
        class383.field5136 = new int[var6];
        class351.field4603 = new byte[var6][];
        class196.field2362 = new byte[var6][];
        class136.field1556 = new int[var6];
        class21.field185 = new int[var6];
        class292.field3763 = null;
        class309.field4014 = new byte[var6][];
        class498.field7189 = new int[var6];
        int var8 = 0;
        for (int var9 = 0; ~var9 > -5; ++var9) {
            for (int var10 = 0; var10 < class399.field5338 >> 3; ++var10) {
                for (int var11 = 0; var11 < class349.field4567 >> 3; ++var11) {
                    int var12 = class4.field30[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = (var12 & 16775087) >> 14;
                        int var14 = var12 >> 3 & 2047;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var16 < var8; ++var16) {
                            if (~class287.field3696[var16] == ~var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (~var15 != 0) {
                            class287.field3696[var8] = var15;
                            int var17 = (65511 & var15) >> 8;
                            int var18 = 255 & var15;
                            class498.field7189[var8] = class299.field3914.method1716(true, "m" + var17 + "_" + var18);
                            class136.field1556[var8] = class299.field3914.method1716(true, "l" + var17 + "_" + var18);
                            class383.field5136[var8] = class299.field3914.method1716(true, "um" + var17 + "_" + var18);
                            class21.field185[var8] = class299.field3914.method1716(true, "ul" + var17 + "_" + var18);
                            ++var8;
                        }
                    }
                }
            }
        }
        class162.method975(var3, var4, var1, 11, (byte) -107);
    }

    @OriginalMember(owner = "client!mba", name = "<init>", descriptor = "()V")
    public class381() {
        super(0, false);
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(ILjava/awt/Component;)Lws;")
    public static final class325 method2086(int arg0, Component arg1) {
        if (arg0 != -11356) {
            method2086(89, (Component) null);
        }
        ++field4944;
        return new class320(arg1);
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(IB)[[I")
    public int[][] method1251(int arg0, byte arg1) {
        ++field4947;
        if (arg1 != 98) {
            this.method2081(89);
        }
        int[][] var3 = super.field9471.method3639(114, arg0);
        if (super.field9471.field9180 && this.method2084((byte) -123)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field4943 * (class567.field8041 != this.field4940 ? this.field4940 * arg0 / class567.field8041 : arg0);
            if (~class501.field7222 != ~this.field4943) {
                for (int var8 = 0; ~class501.field7222 < ~var8; ++var8) {
                    int var9 = this.field4943 * var8 / class501.field7222;
                    int var10 = this.field4949[var7 + var9];
                    var6[var8] = class203.method1246(var10, 255) << 4;
                    var5[var8] = class203.method1246(var10 >> 4, 4080);
                    var4[var8] = class203.method1246(4080, var10 >> 12);
                }
            } else {
                for (int var11 = 0; ~var11 > ~class501.field7222; ++var11) {
                    int var12 = this.field4949[var7++];
                    var6[var11] = class203.method1246(4080, var12 << 4);
                    var5[var11] = class203.method1246(4080, var12 >> 4);
                    var4[var11] = class203.method1246(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }
}
