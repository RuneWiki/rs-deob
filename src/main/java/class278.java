import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class278 implements class90 {

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "Lnd;")
    private class504 field4206;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "Leo;")
    private class266 field4205;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "Lqr;")
    public static class59 field4204;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILjava/lang/String;IIBLla;)I")
    private final int method1814(int arg0, String arg1, int arg2, int arg3, byte arg4, class416 arg5) {
        if (arg4 != 63) {
            method1815(59, 38, -32, -76, 92);
        }
        field4202++;
        return arg5.method2501(null, 0, arg2 + arg3, -(arg2 * 2) + this.field4206.field7120, this.field4206.field7129, null, arg1, 0, null, 0, 0, arg0 + arg2, 0, this.field4206.field7123 - (arg2 * 2), this.field4206.field7118, 0);
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)Z")
    public final boolean method419(byte arg0) {
        if (arg0 <= 56) {
            return false;
        } else {
            field4199++;
            return this.field4205.method1740(-3);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BZ)V")
    public final void method421(byte arg0, boolean arg1) {
        int var3 = -116 / ((7 - arg0) / 56);
        field4201++;
        class511 var4 = this.field4205.method1743(-106, this.field4206.field7119);
        if (var4 == null) {
            return;
        }
        int var5 = this.field4206.field7124.method860(class245.field3815, this.field4206.field7123, (byte) 62) + this.field4206.field7125;
        int var6 = this.field4206.field7127.method3509(class544.field7651, (byte) -75, this.field4206.field7120) + this.field4206.field7117;
        if (this.field4206.field7126) {
            class282.field4228.method219(var5, var6, this.field4206.field7123, this.field4206.field7120, this.field4206.field7121, 0);
        }
        int var7 = var6 + this.method1814(var6, var4.field7189, 5, var5, (byte) 63, class26.field391) * 12;
        int var10 = var7 + 8;
        if (this.field4206.field7126) {
            class282.field4228.method149(var5, var10, var5 + this.field4206.field7123 - 1, var10, this.field4206.field7121, 0);
        }
        var7 = var10 + 1;
        int var8 = var7 + this.method1814(var7, var4.field7191, 5, var5, (byte) 63, class26.field391) * 12;
        int var11 = var8 + 5;
        int var10000 = var11 + this.method1814(var11, var4.field7188, 5, var5, (byte) 63, class26.field391) * 12;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method1815(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4200++;
        if ((class672.field9500[0][arg4][arg2] & 0x2) != 0) {
            return true;
        }
        if (arg0 != 5) {
            field4204 = null;
        }
        if ((class672.field9500[arg1][arg4][arg2] & 0x10) == 0) {
            return arg3 == class35.method422(arg2, 8, arg1, arg4);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)I")
    public static final int method1816(String arg0, int arg1, int arg2, String arg3) {
        field4203++;
        int var4 = arg0.length();
        int var5 = arg3.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        if (arg2 != 12) {
            method1817((byte) 37);
        }
        char var9 = 0;
        while (var4 > (var6 - var8) || var7 - var9 < var5) {
            if (var4 <= var6 - var8) {
                return -1;
            }
            if ((var7 - var9) >= var5) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg0.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg3.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class478.method2801((byte) 35, var22);
            var9 = class478.method2801((byte) 103, var24);
            char var26 = class47.method484(-79, var22, arg1);
            char var27 = class47.method484(-93, var24, arg1);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class266.method1741(arg1, var28, arg2 ^ 0x70) - class266.method1741(arg1, var29, 123);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg1 == 2) {
                var17 = var4 - var11 - 1;
                var16 = var5 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg0.charAt(var17);
            char var19 = arg3.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class266.method1741(arg1, var20, arg2 + 21) - class266.method1741(arg1, var21, 96);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg0.charAt(var13);
            char var15 = arg3.charAt(var13);
            if (var14 != var15) {
                return class266.method1741(arg1, var14, 62) - class266.method1741(arg1, var15, 78);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public final void method420(byte arg0) {
        if (arg0 != 67) {
            this.method420((byte) 75);
        }
        field4198++;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Leo;Lnd;)V")
    public class278(class266 arg0, class504 arg1) {
        this.field4206 = arg1;
        this.field4205 = arg0;
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(B)V")
    public static void method1817(byte arg0) {
        if (arg0 > -105) {
            field4204 = null;
        }
        field4204 = null;
    }
}
