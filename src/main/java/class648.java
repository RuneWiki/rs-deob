import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class648 extends class601 {

    @OriginalMember(owner = "client!qr", name = "J", descriptor = "I")
    private int field8269 = 4;

    @OriginalMember(owner = "client!qr", name = "G", descriptor = "I")
    private int field8266 = 4;

    @OriginalMember(owner = "client!qr", name = "N", descriptor = "Luw;")
    public static class208 field8273 = new class208(96, 6);

    @OriginalMember(owner = "client!qr", name = "P", descriptor = "Luw;")
    public static class208 field8275 = new class208(91, 6);

    @OriginalMember(owner = "client!qr", name = "R", descriptor = "Luw;")
    public static class208 field8277 = new class208(12, 0);

    @OriginalMember(owner = "client!qr", name = "S", descriptor = "Lrn;")
    public static class633 field8278 = new class633(44, 7);

    @OriginalMember(owner = "client!qr", name = "F", descriptor = "I")
    public static int field8265;

    @OriginalMember(owner = "client!qr", name = "H", descriptor = "I")
    public static int field8267;

    @OriginalMember(owner = "client!qr", name = "I", descriptor = "I")
    public static int field8268;

    @OriginalMember(owner = "client!qr", name = "K", descriptor = "I")
    public static int field8270;

    @OriginalMember(owner = "client!qr", name = "L", descriptor = "I")
    public static int field8271;

    @OriginalMember(owner = "client!qr", name = "M", descriptor = "I")
    public static int field8272;

    @OriginalMember(owner = "client!qr", name = "O", descriptor = "I")
    public static int field8274;

    @OriginalMember(owner = "client!qr", name = "Q", descriptor = "I")
    public static int field8276;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IB)[I")
    public final int[] method261(int arg0, byte arg1) {
        ++field8274;
        int[] var3 = super.field7643.method2054(arg0, 9986);
        if (super.field7643.field4364) {
            int var4 = class418.field5518 / this.field8266;
            int var5 = class418.field5514 / this.field8269;
            int[] var6;
            if (~var5 >= -1) {
                var6 = this.method3243(0, 27123, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method3243(class418.field5514 * var7 / var5, 27123, 0);
            }
            for (int var8 = 0; class418.field5518 > var8; ++var8) {
                if (var4 <= 0) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class418.field5518 * var9 / var4];
                }
            }
        }
        if (arg1 >= -76) {
            this.method261(-29, (byte) 28);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "(I)V")
    public static void method3499(int arg0) {
        field8278 = null;
        field8277 = null;
        field8273 = null;
        field8275 = null;
        if (arg0 != 6) {
            method3499(-59);
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lmc;II)V")
    public final void method259(class234 arg0, int arg1, int arg2) {
        ++field8268;
        if (arg1 != 0) {
            if (~arg1 == -2) {
                this.field8269 = arg0.method1509(true);
            }
        } else {
            this.field8266 = arg0.method1509(true);
        }
        int var5 = 123 / ((40 - arg2) / 52);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Luaa;Z)Luaa;")
    public static final class391 method3500(class391 arg0, boolean arg1) {
        ++field8265;
        if (!arg1) {
            field8277 = null;
        }
        class391 var2 = client.method2631(arg0);
        if (var2 == null) {
            var2 = arg0.field4995;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "()V")
    public class648() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)V")
    public static final void method3501(boolean arg0) {
        for (class622 var1 = (class622) class168.field2229.method856(17737); var1 != null; var1 = (class622) class168.field2229.method856(17737)) {
            class31.method163((byte) -94, var1);
        }
        ++field8267;
        int var2;
        int var3;
        if (class485.field6252.field6942.method2278(arg0) == 1) {
            var2 = 3;
            var3 = 0;
        } else {
            var2 = class711.field9393;
            var3 = class711.field9393;
        }
        client.method2646();
        for (int var4 = var3; var2 >= var4; ++var4) {
            client.method2644();
            client.method2643(var4);
            client.method2633(var4);
        }
        client.method2638();
        client.method2628();
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(II)[[I")
    public final int[][] method638(int arg0, int arg1) {
        ++field8271;
        int[][] var3 = super.field7647.method3510((byte) -51, arg1);
        if (super.field7647.field8306) {
            int var4 = class418.field5518 / this.field8266;
            int var5 = class418.field5514 / this.field8269;
            int[][] var7;
            if (~var5 < -1) {
                int var6 = arg1 % var5;
                var7 = this.method3247((byte) -96, 0, class418.field5514 * var6 / var5);
            } else {
                var7 = this.method3247((byte) -126, 0, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~var14 > ~class418.field5518; ++var14) {
                int var16;
                if (~var4 < -1) {
                    int var15 = var14 % var4;
                    var16 = class418.field5518 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var9[var16];
                var13[var14] = var10[var16];
            }
        }
        return arg0 != 2017 ? null : var3;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lr;III[Z)Z")
    public static final boolean method3502(class736 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class735.field9973 != class116.field1542) {
            int var6 = class383.field4790[arg1].method2072((byte) 61, arg2, arg3);
            for (int var7 = 0; var7 <= arg1; ++var7) {
                class358 var8 = class383.field4790[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method2072((byte) 106, arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method2057(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method2067(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lqf;IIZ)V")
    public static final void method3503(class403 arg0, int arg1, int arg2, boolean arg3) {
        ++field8270;
        if (class525.field6678) {
            int var4 = 0;
            for (class765 var5 = (class765) arg0.field5365.method3855(0); var5 != null; var5 = (class765) arg0.field5365.method3861(true)) {
                int var10 = class417.method2408((byte) -120, var5);
                if (~var4 > ~var10) {
                    var4 = var10;
                }
            }
            var4 += 8;
            int var6 = arg0.field5360 * 16 + 21;
            class400.field5303 = arg0.field5360 * 16 + (!class689.field8857 ? 22 : 26);
            int var7 = class71.field968 + class283.field3665;
            if (~(var4 + var7) < ~class372.field4550) {
                var7 = -var4 + class283.field3665;
            }
            if (~var7 > -1) {
                var7 = 0;
            }
            int var8 = class689.field8857 ? 33 : 31;
            int var9 = -var8 + 13 + arg1;
            if (class463.field6021 < var6 + var9) {
                var9 = class463.field6021 - var6;
            }
            if (!arg3) {
                method3504(-94, -63, (String) null);
            }
            class29.field256 = var7;
            if (~var9 > -1) {
                var9 = 0;
            }
            class256.field3472 = var9;
            class223.field3036 = arg0;
            class650.field8290 = var4;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method3504(int arg0, int arg1, String arg2) {
        ++field8272;
        class416.method2405(0, "", "", "", arg2, arg1, -1);
        if (arg0 >= -79) {
            field8278 = null;
        }
    }
}
