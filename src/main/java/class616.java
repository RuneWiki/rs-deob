import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class616 {

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "Z")
    private boolean field8231 = false;

    @OriginalMember(owner = "client!mfa", name = "f", descriptor = "[Ljava/lang/String;")
    private String[] field8235 = new String[0];

    @OriginalMember(owner = "client!mfa", name = "e", descriptor = "I")
    private int field8234 = -1;

    @OriginalMember(owner = "client!mfa", name = "k", descriptor = "I")
    private int field8240;

    @OriginalMember(owner = "client!mfa", name = "i", descriptor = "Z")
    public static boolean field8238 = true;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "I")
    public static int field8230;

    @OriginalMember(owner = "client!mfa", name = "c", descriptor = "I")
    public static int field8232;

    @OriginalMember(owner = "client!mfa", name = "d", descriptor = "I")
    public static int field8233;

    @OriginalMember(owner = "client!mfa", name = "g", descriptor = "I")
    public static int field8236;

    @OriginalMember(owner = "client!mfa", name = "h", descriptor = "I")
    public static int field8237;

    @OriginalMember(owner = "client!mfa", name = "j", descriptor = "I")
    public static int field8239;

    @OriginalMember(owner = "client!mfa", name = "l", descriptor = "I")
    public static int field8241;

    @OriginalMember(owner = "client!mfa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8236++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field8234; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field8235[var2]);
        }
        var1.append("]");
        return var1.toString();
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(II)V")
    private final void method3371(int arg0, int arg1) {
        field8230++;
        String[] var3 = new String[this.method3373(-20, arg1)];
        class335.method2017(this.field8235, 0, var3, 0, this.field8235.length);
        if (arg0 == 32696) {
            this.field8235 = var3;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Ljava/lang/String;II)V")
    private final void method3372(String arg0, int arg1, int arg2) {
        field8233++;
        int var4 = -82 % ((32 - arg2) / 55);
        if (this.field8234 < arg1) {
            this.field8234 = arg1;
        }
        if (this.field8235.length <= arg1) {
            this.method3371(32696, arg1);
        }
        this.field8235[arg1] = arg0;
    }

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "(II)I")
    private final int method3373(int arg0, int arg1) {
        int var3 = 25 / ((76 - arg0) / 47);
        field8232++;
        int var4 = this.field8235.length;
        while (arg1 >= var4) {
            if (!this.field8231) {
                var4 += this.field8240;
            } else if (var4 == 0) {
                var4 = 1;
            } else {
                var4 = this.field8240 * var4;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method3374(int arg0, String arg1) {
        this.method3372(arg1, this.field8234 + 1, 111);
        if (arg0 != -17195) {
            this.field8234 = 77;
        }
        field8241++;
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IZIII)V")
    public static final void method3375(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field8239++;
        if (!arg1 && class161.field2401 == arg0 && class88.field1069 == arg3 && class507.field6775 == class489.field6638 || class411.field5711.field3890.method984(true) == 1) {
            return;
        }
        class88.field1069 = arg3;
        class489.field6638 = class507.field6775;
        class161.field2401 = arg0;
        if (class411.field5711.field3890.method984(true) == 1) {
            class489.field6638 = 0;
        }
        class66.method566(arg2, -21035);
        class88.method675(class180.field2728, class148.field2334, class341.field4807, (byte) -27, true, class517.field6852.method2877(class713.field9854, (byte) -108));
        int var5 = class503.field6752;
        int var6 = class334.field4757;
        class503.field6752 = (class161.field2401 - (class719.field10004 >> 4)) * 8;
        class334.field4757 = (class88.field1069 - (class107.field1453 >> 4)) * 8;
        class681.field9515 = class744.method4155(class161.field2401 * 8, class88.field1069 * 8);
        class668.field9128 = null;
        int var7 = class503.field6752 - var5;
        int var8 = class334.field4757 - var6;
        if (arg2 == 11) {
            for (int var17 = 0; var17 < class243.field3403; var17++) {
                class134 var31 = class302.field4281[var17];
                if (var31 != null) {
                    class556 var32 = var31.field2154;
                    for (int var33 = 0; var33 < 10; var33++) {
                        var32.field10322[var33] -= var7;
                        var32.field10321[var33] -= var8;
                    }
                    var32.field3505 -= var7 * 512;
                    var32.field3502 -= var8 * 512;
                }
            }
        } else {
            class306.field4404 = 0;
            boolean var9 = false;
            int var10 = class719.field10004 * 512 - 512;
            int var11 = class107.field1453 * 512 - 512;
            for (int var12 = 0; var12 < class243.field3403; var12++) {
                class134 var13 = class302.field4281[var12];
                if (var13 != null) {
                    class556 var14 = var13.field2154;
                    var14.field3502 -= var8 * 512;
                    var14.field3505 -= var7 * 512;
                    if (var14.field3505 >= 0 && var14.field3505 <= var10 && var14.field3502 >= 0 && var14.field3502 <= var11) {
                        boolean var15 = true;
                        for (int var16 = 0; var16 < 10; var16++) {
                            var14.field10322[var16] -= var7;
                            var14.field10321[var16] -= var8;
                            if (var14.field10322[var16] < 0 || class719.field10004 <= var14.field10322[var16] || var14.field10321[var16] < 0 || var14.field10321[var16] >= class107.field1453) {
                                var15 = false;
                            }
                        }
                        if (var15) {
                            class628.field8351[class306.field4404++] = var14.field10297;
                        } else {
                            var14.method3099((byte) -86, null);
                            var9 = true;
                            var13.method3564(true);
                        }
                    } else {
                        var14.method3099((byte) -86, null);
                        var9 = true;
                        var13.method3564(true);
                    }
                }
            }
            if (var9) {
                class243.field3403 = class390.field5470.method2147((byte) 32);
                class390.field5470.method2142(class302.field4281, true);
            }
        }
        for (int var18 = 0; var18 < 2048; var18++) {
            class383 var29 = class248.field3438[var18];
            if (var29 != null) {
                for (int var30 = 0; var30 < 10; var30++) {
                    var29.field10322[var30] -= var7;
                    var29.field10321[var30] -= var8;
                }
                var29.field3502 -= var8 * 512;
                var29.field3505 -= var7 * 512;
            }
        }
        class317[] var19 = class27.field435;
        for (int var20 = arg4; var20 < var19.length; var20++) {
            class317 var28 = var19[var20];
            if (var28 != null) {
                var28.field4516 -= var7 * 512;
                var28.field4520 -= var8 * 512;
            }
        }
        for (class302 var21 = (class302) class409.field5677.method21(2); var21 != null; var21 = (class302) class409.field5677.method9(arg4 - 127)) {
            var21.field4289 -= var8;
            var21.field4286 -= var7;
            if (class568.field7464 != 4 && (var21.field4286 < 0 || var21.field4289 < 0 || class719.field10004 <= var21.field4286 || var21.field4289 >= class107.field1453)) {
                var21.method3564(true);
            }
        }
        for (class302 var22 = (class302) class271.field3785.method21(2); var22 != null; var22 = (class302) class271.field3785.method9(arg4 - 127)) {
            var22.field4286 -= var7;
            var22.field4289 -= var8;
            if (class568.field7464 != 4 && (var22.field4286 < 0 || var22.field4289 < 0 || class719.field10004 <= var22.field4286 || class107.field1453 <= var22.field4289)) {
                var22.method3564(true);
            }
        }
        if (class568.field7464 != 4) {
            for (class635 var23 = (class635) class649.field8627.method2144(true); var23 != null; var23 = (class635) class649.field8627.method2146(false)) {
                int var24 = (int) (var23.field8680 & 0x3FFFL);
                int var25 = var24 - class503.field6752;
                int var26 = (int) (var23.field8680 >> 14 & 0x3FFFL);
                int var27 = var26 - class334.field4757;
                if (var25 < 0 || var27 < 0 || var25 >= class719.field10004 || class107.field1453 <= var27) {
                    var23.method3564(true);
                }
            }
        }
        if (class359.field5044 != 0) {
            class102.field1421 -= var8;
            class359.field5044 -= var7;
        }
        class60.method524(-98);
        if (arg2 != 11) {
            class45.field583 -= var7;
            class98.field1230 -= var8;
            class694.field9662 -= var7 * 512;
            class314.field4488 -= var8 * 512;
            class324.field4605 -= var8;
            class617.field8245 -= var7;
            if (Math.abs(var7) > class719.field10004 || Math.abs(var8) > class107.field1453) {
                class320.method1940(1);
            }
        } else if (class278.field3898 == 4) {
            class116.field1879 -= var8 * 512;
            class513.field6808 -= var7 * 512;
            class425.field5854 -= var7 * 512;
            class248.field3439 -= var8 * 512;
        } else {
            class278.field3898 = 1;
            class12.field193 = -1;
            class264.field3680 = -1;
        }
        class492.method2787((byte) -120);
        class586.method3207(arg4 ^ 0xFFFF8408);
        class141.field2256.method23(10);
        class64.field776.method23(10);
        class36.field518.method3872(0);
        class261.method1579(arg4 + 113);
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(I)[Ljava/lang/String;")
    public final String[] method3376(int arg0) {
        if (arg0 <= 38) {
            return null;
        } else {
            field8237++;
            String[] var2 = new String[this.field8234 + 1];
            class335.method2017(this.field8235, 0, var2, 0, this.field8234 + 1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(IZ)V")
    public class616(int arg0, boolean arg1) {
        this.field8231 = arg1;
        this.field8240 = arg0;
    }
}
