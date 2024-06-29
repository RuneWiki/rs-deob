import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public class class446 extends class619 {

    @OriginalMember(owner = "client!iea", name = "j", descriptor = "[I")
    public int[] field6421;

    @OriginalMember(owner = "client!iea", name = "g", descriptor = "[I")
    public int[] field6418;

    @OriginalMember(owner = "client!iea", name = "e", descriptor = "I")
    public static int field6416;

    @OriginalMember(owner = "client!iea", name = "f", descriptor = "I")
    public static int field6417;

    @OriginalMember(owner = "client!iea", name = "h", descriptor = "I")
    public static int field6419;

    @OriginalMember(owner = "client!iea", name = "i", descriptor = "I")
    public static int field6420;

    @OriginalMember(owner = "client!iea", name = "k", descriptor = "I")
    public static int field6422;

    @OriginalMember(owner = "client!iea", name = "l", descriptor = "I")
    public static int field6423;

    @OriginalMember(owner = "client!iea", name = "m", descriptor = "I")
    public static int field6424;

    @OriginalMember(owner = "client!iea", name = "n", descriptor = "I")
    public static int field6425;

    // $FF: synthetic field
    @OriginalMember(owner = "client!iea", name = "o", descriptor = "Ljava/lang/Class;")
    public static Class field6426;

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(BLrda;)V")
    public static final void method2681(byte arg0, class616 arg1) {
        field6416++;
        if (arg0 != -15) {
            method2684(26, -71, -52);
        }
        if (class257.field3792 == null) {
            return;
        }
        class83 var2 = null;
        if (arg1.field8944 == 0) {
            var2 = (class83) class264.method1729(arg1.field8952, arg1.field8953, arg1.field8949);
        }
        if (arg1.field8944 == 1) {
            var2 = (class83) class275.method1797(arg1.field8952, arg1.field8953, arg1.field8949);
        }
        if (arg1.field8944 == 2) {
            var2 = (class83) class63.method756(arg1.field8952, arg1.field8953, arg1.field8949, field6426 == null ? (field6426 = method2686("qu")) : field6426);
        }
        if (arg1.field8944 == 3) {
            var2 = (class83) class697.method3897(arg1.field8952, arg1.field8953, arg1.field8949);
        }
        if (var2 == null) {
            arg1.field8946 = 0;
            arg1.field8948 = 0;
            arg1.field8950 = -1;
        } else {
            arg1.field8950 = var2.method841((byte) 52);
            arg1.field8948 = var2.method844((byte) -27);
            arg1.field8946 = var2.method846((byte) -105);
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "([I[JZ)V")
    public static final void method2682(int[] arg0, long[] arg1, boolean arg2) {
        if (arg2) {
            method2684(85, 60, 93);
        }
        class427.method2602(arg0, 0, arg1, arg1.length - 1, 124);
        field6424++;
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(III)Z")
    public static final boolean method2683(int arg0, int arg1, int arg2) {
        field6417++;
        if (arg1 == -6769) {
            return (arg0 & 0x20) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "(III)I")
    public static final int method2684(int arg0, int arg1, int arg2) {
        field6422++;
        int var3 = -2 / ((arg0 + 71) / 47);
        int var4 = class421.method2560(false, arg1 - 1, arg2 - 1) + class421.method2560(false, arg1 - 1, arg2 + 1) - (-class421.method2560(false, arg1 + 1, arg2 + -1) - class421.method2560(false, arg1 + 1, arg2 + 1));
        int var5 = class421.method2560(false, arg1, arg2 - 1) + class421.method2560(false, arg1, arg2 + 1) + (class421.method2560(false, arg1 + -1, arg2) - -class421.method2560(false, arg1 + 1, arg2));
        int var6 = class421.method2560(false, arg1, arg2);
        return var4 / 16 - (-(var5 / 8) - var6 / 4);
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(Lcd;Lqj;Lr;I)V")
    public static final void method2685(class288 arg0, class473 arg1, class167 arg2, int arg3) {
        if (arg3 != -1) {
            method2682(null, null, true);
        }
        field6419++;
        class702 var4 = arg0.method1922((byte) 77, arg2);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method1792();
        if (var5 < var4.method1785()) {
            var5 = var4.method1785();
        }
        byte var6 = 10;
        int var7 = arg1.field6701;
        int var8 = arg1.field6702;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg0.field4308 != null) {
            var9 = class79.field1581.method297(class509.field7225, (byte) -109, null, null, arg0.field4308);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class509.field7225[var12];
                if (var9 - 1 > var12) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class297.field4450.method2303(var13);
                if (var10 < var14) {
                    var10 = var14;
                }
            }
            var11 = class297.field4450.method2298() * var9 + class297.field4450.method2299() / 2;
        }
        int var15 = arg1.field6701 + (var5 / 2);
        if ((class407.field5888 + var5) > var7) {
            var7 = class407.field5888;
            var15 = var10 / 2 + (class407.field5888 + 5 - (-(var5 / 2) + -var6));
        } else if ((class407.field5903 - var5) < var7) {
            var7 = class407.field5903 - var5;
            var15 = class407.field5903 - (var5 / 2 + var6) - var10 / 2 - 5;
        }
        int var16 = arg1.field6702;
        if ((class407.field5894 + var5) > var8) {
            var16 = var5 / 2 + class407.field5894 + var6;
            var8 = class407.field5894;
        } else if (var8 > class407.field5898 - var5) {
            var16 = class407.field5898 - (var5 / 2) - (var6 + var11);
            var8 = class407.field5898 - var5;
        }
        int var17 = (int) (Math.atan2((double) (var7 - arg1.field6701), (double) (var8 - arg1.field6702)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        var4.method3917((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg0.field4308 != null) {
            var19 = var16;
            var18 = var15 - var10 / 2 - 5;
            var20 = var18 + var10 + 10;
            var21 = class297.field4450.method2298() * var9 + var16 + 3;
            if (arg0.field4309 != 0) {
                arg2.method1267(var16, var21 - var16, 1, var20 - var18, var18, arg0.field4309);
            }
            if (arg0.field4305 != 0) {
                arg2.method1261(var21 - var16, arg3 ^ 0xFFFF9C2F, arg0.field4305, var20 - var18, var18, var16);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class509.field7225[var22];
                if ((var9 - 1) > var22) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class297.field4450.method2300(arg2, var23, var15, var16, arg0.field4314, true);
                var16 += class297.field4450.method2298();
            }
        }
        if (arg0.field4306 == -1 && arg0.field4308 == null) {
            return;
        }
        class152 var24 = new class152(arg1);
        int var25 = var5 >> 1;
        var24.field2584 = var19;
        var24.field2595 = var7 + var25;
        var24.field2594 = var21;
        var24.field2586 = var8 - var25;
        var24.field2592 = var20;
        var24.field2588 = var18;
        var24.field2596 = var7 - var25;
        var24.field2597 = var8 + var25;
        class38.field1052.method1229(var24, (byte) 120);
    }

    @OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(II[I[I)V")
    public class446(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field6421 = arg2;
        this.field6418 = arg3;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2686(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
