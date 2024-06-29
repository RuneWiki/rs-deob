import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class628 {

    @OriginalMember(owner = "client!go", name = "c", descriptor = "Z")
    public boolean field8643;

    @OriginalMember(owner = "client!go", name = "n", descriptor = "B")
    public byte field8654;

    @OriginalMember(owner = "client!go", name = "l", descriptor = "I")
    public int field8652;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "S")
    public short field8641;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "B")
    public byte field8646;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "S")
    public short field8644;

    @OriginalMember(owner = "client!go", name = "h", descriptor = "S")
    public short field8648;

    @OriginalMember(owner = "client!go", name = "b", descriptor = "I")
    public int field8642;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "Lsh;")
    public static class70 field8649 = new class70(2);

    @OriginalMember(owner = "client!go", name = "e", descriptor = "I")
    public static int field8645;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "I")
    public static int field8647;

    @OriginalMember(owner = "client!go", name = "j", descriptor = "I")
    public static int field8650;

    @OriginalMember(owner = "client!go", name = "k", descriptor = "I")
    public static int field8651;

    @OriginalMember(owner = "client!go", name = "m", descriptor = "I")
    public static int field8653;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIII)V")
    public static final void method3589(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8647++;
        int var5 = 0;
        if (arg0 > -92) {
            field8649 = null;
        }
        int var6 = arg4;
        int var7 = -arg4;
        int var8 = -1;
        int var9 = class486.method2865(class536.field7419, arg1 + arg4, class140.field2314, -108);
        int var10 = class486.method2865(class536.field7419, arg1 - arg4, class140.field2314, 81);
        class47.method550(-27, var9, class691.field9345[arg3], var10, arg2);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg3 - var6;
                int var12 = arg3 + var6;
                if (class58.field1150 <= var12 && var11 <= class479.field6682) {
                    int var13 = class486.method2865(class536.field7419, arg1 + var5, class140.field2314, 74);
                    int var14 = class486.method2865(class536.field7419, arg1 - var5, class140.field2314, 98);
                    if (var12 <= class479.field6682) {
                        class47.method550(-27, var13, class691.field9345[var12], var14, arg2);
                    }
                    if (var11 >= class58.field1150) {
                        class47.method550(-27, var13, class691.field9345[var11], var14, arg2);
                    }
                }
            }
            var5++;
            int var15 = arg3 - var5;
            int var16 = arg3 + var5;
            if (var16 >= class58.field1150 && class479.field6682 >= var15) {
                int var17 = class486.method2865(class536.field7419, arg1 + var6, class140.field2314, 52);
                int var18 = class486.method2865(class536.field7419, arg1 - var6, class140.field2314, -106);
                if (class479.field6682 >= var16) {
                    class47.method550(-27, var17, class691.field9345[var16], var18, arg2);
                }
                if (class58.field1150 <= var15) {
                    class47.method550(-27, var17, class691.field9345[var15], var18, arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V")
    public static final void method3590(int arg0) {
        field8653++;
        while (class149.field2477.method3738(-62, class57.field1142) >= 15) {
            int var1 = class149.field2477.method3733((byte) -24, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            class751 var3 = (class751) class86.field1546.method1465((long) var1, -6008);
            if (var3 == null) {
                class9 var4 = new class9();
                var4.field5716 = var1;
                var3 = new class751(var4);
                class86.field1546.method1468((byte) 57, (long) var1, var3);
                var2 = true;
                class728.field9860[class77.field1375++] = var3;
            }
            class9 var5 = var3.field10510;
            class737.field9925[class738.field9939++] = var1;
            var5.field5732 = class199.field2904;
            if (var5.field126 != null && var5.field126.method2109(0)) {
                class600.method3414(true, var5);
            }
            int var6 = class149.field2477.method3733((byte) -24, 2);
            int var7 = class149.field2477.method3733((byte) -24, 1);
            int var8 = class149.field2477.method3733((byte) -24, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            int var9 = class149.field2477.method3733((byte) -24, 5);
            if (var9 > 15) {
                var9 -= 32;
            }
            int var10 = class149.field2477.method3733((byte) -24, 3) + 4 << 11 & 0x3D01;
            int var11 = class149.field2477.method3733((byte) -24, 1);
            if (var11 == 1) {
                class633.field8706[class661.field9039++] = var1;
            }
            var5.method61(class510.field7099.method1341(class149.field2477.method3733((byte) -24, 14), -1), arg0 ^ 0x2B297815);
            var5.method2455((byte) 111, var5.field126.field4716);
            var5.field5736 = var5.field126.field4646 << 3;
            if (var2) {
                var5.method2456((byte) -108, var10, true);
            }
            var5.method55(class58.field1147.field5743[0] + var8, var7 == 1, class58.field1147.field5746[0] + var9, arg0 + 724138125, var5.method2457((byte) 50), var6);
            if (var5.field126.method2109(0)) {
                class426.method2607(979190089, var5, var5.field5926, var5.field5743[0], var5.field5746[0], null, null, 0);
            }
        }
        if (arg0 == -724138005) {
            class149.field2477.method3735(false);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIILjava/lang/String;IIII)V")
    public static final void method3591(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6, int arg7) {
        field8645++;
        class583 var8 = new class583();
        var8.field7979 = arg1;
        var8.field7978 = arg7;
        var8.field7982 = arg6;
        var8.field7981 = class641.field8810 + arg0;
        if (arg5 >= -48) {
            method3592(-90, -126, -8);
        }
        var8.field7976 = arg3;
        var8.field7975 = arg2;
        var8.field7980 = arg4;
        class399.field5901.method1298(-103, var8);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(III)I")
    public static final int method3592(int arg0, int arg1, int arg2) {
        field8650++;
        int var3 = arg1 >>> 24;
        int var4 = arg2 - var3;
        int var5 = ((arg1 & 0xFF00) * var3 & 0xFF0000 | (arg1 & 0xFF00FF) * var3 & 0xFF00FF00) >>> 8;
        return (((arg0 & 0xFF00) * var4 & 0xFF0000 | (arg0 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Lha;B)V")
    public static final void method3593(class59 arg0, byte arg1) {
        field8651++;
        int var2 = 0;
        int var3 = 0;
        if (arg1 < 113) {
            field8649 = null;
        }
        if (class241.field3529) {
            var2 = class146.method1163((byte) -127);
            var3 = class313.method2035(false);
        }
        arg0.method303(var2, var3, class467.field6559 + var2, var3 + 350);
        arg0.method217(var2, var3, class467.field6559, 350, class445.field6326 << 24 | 0x332277, 1);
        class546.method3152(-5590, var2, class467.field6559 + var2, var3, var3 + 350);
        int var4 = 350 / class523.field7254;
        if (class605.field8302 > 0) {
            int var5 = 342 - class523.field7254;
            int var6 = var4 * var5 / (var4 + class605.field8302 - 1);
            int var7 = 4;
            if (class605.field8302 > 1) {
                var7 += (var5 - var6) * (class605.field8302 - class685.field9279 - 1) / (class605.field8302 - 1);
            }
            arg0.method217(class467.field6559 + var2 - 16, var3 + var7, 12, var6, class445.field6326 << 24 | 0x332277, 2);
            for (int var8 = class685.field9279; (class685.field9279 + var4) > var8 && var8 < class605.field8302; var8++) {
                String[] var9 = class728.method4031('\b', true, class23.field723[var8]);
                int var10 = (class467.field6559 - 16 - 8) / var9.length;
                for (int var11 = 0; var11 < var9.length; var11++) {
                    int var12 = var10 * var11 + 8;
                    arg0.method303(var2 + var12, var3, var2 + var10 - (-var12 - -8), var3 + 350);
                    class355.field5007.method639(class391.method2462((byte) 31, var9[var11]), -1, var3 - class135.field2268 - (-350 - (-class308.field4276.field8160 + -2)) - ((-class685.field9279 + var8) * class523.field7254), var2 + var12, -16777216, -110);
                }
            }
        }
        class214.field3046.method632("Build: 634", var3 + 350 - 20, -1, class467.field6559 + var2 + -25, -121, -16777216);
        arg0.method303(var2, var3, var2 + class467.field6559, var3 - -350);
        arg0.method617((byte) -80, class467.field6559, var3 + 350 - class135.field2268, -1, var2);
        class168.field2634.method639("--> " + class391.method2462((byte) 31, class257.field3711), -1, var3 - (class140.field2316.field8160 - 350) - 1, var2 + 10, -16777216, -127);
        if (!class195.field2888) {
            return;
        }
        int var13 = -1;
        if (class641.field8810 % 30 > 15) {
            var13 = 16777215;
        }
        arg0.method620((var2 + class140.field2316.method3389(true, "--> " + class391.method2462((byte) 31, class257.field3711).substring(0, class697.field9411))) + 10, var13, 12, var3 + 350 - class140.field2316.field8160 - 11, true);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V")
    public static void method3594(byte arg0) {
        if (arg0 != 0) {
            method3590(29);
        }
        field8649 = null;
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
    public class628(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        this.field8643 = arg9;
        this.field8654 = (byte) arg8;
        this.field8652 = arg10;
        this.field8641 = (short) arg5;
        this.field8646 = (byte) arg7;
        this.field8644 = (short) arg6;
        this.field8648 = (short) arg4;
        this.field8642 = arg0;
    }
}
