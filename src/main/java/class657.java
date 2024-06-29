import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class657 {

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "Z")
    public boolean field9333 = true;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
    private int field9340 = -1;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "Lcu;")
    private class200 field9327;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    private int field9338;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "Lkga;")
    private class506 field9336;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
    private int field9337;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    private int field9324;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "Luq;")
    private class145 field9331;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "Ltf;")
    private class267 field9341;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "Lsaa;")
    private class298 field9328;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field9325;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field9326;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field9329;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public static int field9332;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
    public static int field9334;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
    public static int field9335;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
    public static int field9339;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "I")
    public static int field9342;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "Lla;")
    public static class419 field9330;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V", line = 5)
    public final void method3716(byte arg0) {
        this.method3722(this.field9324, 128, this.field9331);
        int var2 = 122 % ((-arg0 - 37) / 46);
        field9334++;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ln;BII)V", line = 15)
    public static final void method3717(class17 arg0, byte arg1, int arg2, int arg3) {
        class376.field5054 = arg0;
        int var4 = -75 % ((arg1 + 55) / 43);
        class96.field1309 = arg3;
        class442.field6297 = arg2;
        field9339++;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)I", line = 28)
    public static final int method3718(int arg0, String arg1, int arg2, String arg3) {
        field9326++;
        int var4 = arg1.length();
        int var5 = arg3.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > var6 - var8 || var5 > var7 - var9) {
            if (var6 - var8 >= var4) {
                return -1;
            }
            if (var5 <= (var7 - var9)) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg1.charAt(var6++);
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
            var8 = class498.method2902(var22, (byte) 107);
            var9 = class498.method2902(var24, (byte) 107);
            char var26 = class391.method2292(var22, arg2, (byte) -81);
            char var27 = class391.method2292(var24, arg2, (byte) 120);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class81.method665(var28, arg2, arg0 ^ 0xFFFF8B90) - class81.method665(var29, arg2, 96);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        if (arg0 != -29726) {
            method3717(null, (byte) -21, -2, 94);
        }
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg2 == 2) {
                var16 = var4 - var11 - 1;
                var17 = var5 - var11 - 1;
            } else {
                var17 = var11;
                var16 = var11;
            }
            char var18 = arg1.charAt(var16);
            char var19 = arg3.charAt(var17);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class81.method665(var20, arg2, 96) - class81.method665(var21, arg2, 99);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg1.charAt(var13);
            char var15 = arg3.charAt(var13);
            if (var14 != var15) {
                return class81.method665(var14, arg2, arg0 ^ 0xFFFF8B83) - class81.method665(var15, arg2, 107);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "([BIIB)V", line = 148)
    public final void method3719(byte[] arg0, int arg1, int arg2, byte arg3) {
        field9335++;
        if (arg3 > -86) {
            method3718(33, null, -82, null);
        }
        this.field9341.method938(arg0, arg1, 32290, arg2 * this.field9336.method2982(59, arg1));
        this.method3722(arg2, 128, this.field9341);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V", line = 161)
    private final void method3720(boolean arg0) {
        field9325++;
        if (!this.field9333) {
            return;
        }
        this.field9333 = arg0;
        byte[] var2 = this.field9327.field2415;
        byte[] var3 = this.field9336.field7412;
        int var4 = 0;
        int var5 = this.field9327.field2413;
        int var6 = this.field9327.field2413 * this.field9337 + this.field9338;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field9328 != null && this.field9340 == var4) {
            this.field9333 = false;
            return;
        }
        this.field9340 = var4;
        int var8 = 0;
        int var9 = this.field9338 + (this.field9337 * var5);
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var9] == 0) {
                    int var12 = 0;
                    if (var2[var9 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var9 + var5] != 0) {
                        var12++;
                    }
                    var3[var8++] = (byte) (var12 * 17);
                } else {
                    var3[var8++] = 68;
                }
                var9++;
            }
            var9 += this.field9327.field2413 - 128;
        }
        if (this.field9328 == null) {
            this.field9328 = new class298(this.field9336, 3553, 6406, 128, 128, false, this.field9336.field7412, 6406, false);
            this.field9328.method1767(false, false, 10242);
            this.field9328.method1211(true, (byte) 33);
        } else {
            this.field9328.method1768(0, 0, 128, false, !arg0, 128, 0, 0, this.field9336.field7412, 6406);
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)V", line = 265)
    public static void method3721(byte arg0) {
        int var1 = 37 / ((arg0 + 13) / 54);
        field9330 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IILuq;)V", line = 274)
    private final void method3722(int arg0, int arg1, class145 arg2) {
        field9342++;
        if (arg0 == 0) {
            return;
        }
        this.method3720(false);
        this.field9336.method2932(true, this.field9328);
        if (arg1 != 128) {
            this.field9340 = -128;
        }
        this.field9336.method2984(arg0, 0, 4, arg2, 512);
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lkga;Lcu;Lsm;IIIII)V", line = 361)
    public class657(class506 arg0, class200 arg1, class257 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field9327 = arg1;
        this.field9338 = arg6;
        this.field9336 = arg0;
        this.field9337 = arg7;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field702 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field3486[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field9324 = var10;
        if (var10 <= 0) {
            this.field9328 = null;
        } else {
            class389 var14 = new class389(var10 * 2);
            if (this.field9336.field7353) {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field702 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field3486[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method2261((byte) 43, var18[var19] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field702 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field3486[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method2236(var23[var24] & 0xFFFF, 122);
                            }
                        }
                    }
                }
            }
            this.field9331 = this.field9336.method2980(5123, 1, var14.field5205, false, var14.field5195);
            this.field9341 = new class267(this.field9336, 5123, null, 1);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)Z", line = 304)
    public static final boolean method3723(int arg0, int arg1) {
        if (arg1 != -10) {
            field9330 = null;
        }
        field9329++;
        return arg0 == 7 || arg0 == 8 || arg0 == 9;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ldda;ZI[B)Lav;", line = 320)
    public static final class591 method3724(class349 arg0, boolean arg1, int arg2, byte[] arg3) {
        field9332++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg2);
        OpenGL.glShaderSourceRawARB(var4, arg3);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class372.field5014, 0);
        if (arg1) {
            method3718(-108, null, -32, null);
        }
        if (class372.field5014[0] == 0) {
            if (class372.field5014[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class372.field5014, 1);
            if (class372.field5014[1] > 1) {
                byte[] var6 = new byte[class372.field5014[1]];
                OpenGL.glGetInfoLogARB(var4, class372.field5014[1], class372.field5014, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class372.field5014[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class591(arg0, var4, arg2);
    }
}
