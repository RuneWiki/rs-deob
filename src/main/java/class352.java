import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class352 {

    @OriginalMember(owner = "client!im", name = "b", descriptor = "I")
    public int field5014 = 1;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "Z")
    public boolean field5013 = false;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "I")
    public int field5021 = -1;

    @OriginalMember(owner = "client!im", name = "k", descriptor = "Z")
    public boolean field5023 = false;

    @OriginalMember(owner = "client!im", name = "j", descriptor = "I")
    public int field5022 = 64;

    @OriginalMember(owner = "client!im", name = "n", descriptor = "I")
    public int field5026 = 64;

    @OriginalMember(owner = "client!im", name = "l", descriptor = "I")
    public int field5024 = 2;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "[I")
    public static int[] field5015 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!im", name = "o", descriptor = "Lsq;")
    public static class442 field5027 = new class442();

    @OriginalMember(owner = "client!im", name = "d", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!im", name = "h", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!im", name = "m", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!im", name = "p", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "Lcba;")
    public static class232 field5017;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "Lgp;")
    public static class561 field5018;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIII[IIII)V")
    public static final void method2131(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7) {
        field5019++;
        if (arg5 > 0 && !class32.method294(arg5, false)) {
            throw new IllegalArgumentException("");
        }
        int var8 = -19 / ((9 - arg0) / 62);
        if (arg6 > 0 && !class32.method294(arg6, false)) {
            throw new IllegalArgumentException("");
        } else if (arg2 == 32993) {
            int var9 = 0;
            int var10 = arg6 <= arg5 ? arg6 : arg5;
            int var11 = arg5 >> 1;
            int var12 = arg6 >> 1;
            int[] var13 = arg4;
            int[] var14 = new int[var11 * var12];
            while (true) {
                OpenGL.glTexImage2Di(arg1, var9, arg3, arg5, arg6, 0, arg2, arg7, var13, 0);
                if (var10 <= 1) {
                    return;
                }
                int var15 = 0;
                int var16 = 0;
                int var17 = arg5 + var16;
                int[] var18 = var14;
                for (int var19 = 0; var19 < var12; var19++) {
                    for (int var20 = 0; var20 < var11; var20++) {
                        int var21 = var13[var16++];
                        int var22 = var13[var17++];
                        int var23 = var13[var16++];
                        int var24 = var21 >> 24 & 0xFF;
                        int var25 = var21 >> 16 & 0xFF;
                        int var26 = var21 >> 8 & 0xFF;
                        int var27 = var21 & 0xFF;
                        int var28 = var13[var17++];
                        int var29 = (var23 >> 24 & 0xFF) + var24;
                        int var30 = ((var23 & 0xFFD25E) >> 16) + var25;
                        int var31 = (var23 & 0xFF) + var27;
                        int var32 = (var23 >> 8 & 0xFF) + var26;
                        int var33 = ((var22 & 0xFFAF) >> 8) + var32;
                        int var34 = (var22 >> 24 & 0xFF) + var29;
                        int var35 = (var22 >> 16 & 0xFF) + var30;
                        int var36 = (var22 & 0xFF) + var31;
                        int var37 = ((var28 & 0xFF4476) >> 16) + var35;
                        int var38 = (var28 & 0xFF) + var36;
                        int var39 = (var28 >> 24 & 0xFF) + var34;
                        int var40 = (var28 >> 8 & 0xFF) + var33;
                        var14[var15++] = class188.method1258(class424.method2540(var38 >> 2, 255), class188.method1258(class424.method2540(65280, var40 << 6), class188.method1258(class424.method2540(var39, 1020) << 22, class424.method2540(16711680, var37 << 14))));
                    }
                    var17 += arg5;
                    var16 += arg5;
                }
                var14 = var13;
                arg6 = var12;
                var13 = var18;
                arg5 = var11;
                var12 >>= 0x1;
                var10 >>= 0x1;
                var9++;
                var11 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IILco;I)V")
    private final void method2132(int arg0, int arg1, class268 arg2, int arg3) {
        if (arg1 != 10029) {
            method2136(53, -78, 56, false);
        }
        field5020++;
        if (arg0 == 1) {
            this.field5021 = arg2.method1745(32132);
            if (this.field5021 == 65535) {
                this.field5021 = -1;
                return;
            }
        } else if (arg0 == 2) {
            this.field5022 = arg2.method1745(32132) + 1;
            this.field5026 = arg2.method1745(arg1 ^ 0x5AA9) + 1;
            return;
        } else if (arg0 == 3) {
            arg2.method1714(arg1 ^ 0xFFFFA3FD);
            return;
        } else if (arg0 == 4) {
            this.field5024 = arg2.method1738(arg1 ^ 0x27D2);
            return;
        } else if (arg0 == 5) {
            this.field5014 = arg2.method1738(arg1 - 9774);
        } else {
            if (arg0 == 6) {
                this.field5013 = true;
            } else if (arg0 == 7) {
                this.field5023 = true;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V")
    public static void method2133(byte arg0) {
        field5027 = null;
        field5015 = null;
        field5018 = null;
        int var1 = -77 % ((arg0 - 35) / 43);
        field5017 = null;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IFIIZIII)[I")
    public static final int[] method2134(int arg0, float arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        if (arg5 != 4096) {
            method2131(17, -98, -30, -81, null, 94, 59, -81);
        }
        field5028++;
        int[] var8 = new int[arg7];
        class581 var9 = new class581();
        var9.field8288 = (int) (arg1 * 4096.0F);
        var9.field8300 = arg0;
        var9.field8297 = arg4;
        var9.field8286 = arg6;
        var9.field8299 = arg3;
        var9.field8291 = arg2;
        var9.method2(-123);
        class378.method2295(arg7, -127, 1);
        var9.method3327(0, var8, (byte) 95);
        return var8;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILco;I)V")
    public final void method2135(int arg0, class268 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method1738(255);
            if (var4 == 0) {
                if (arg0 != 48) {
                    return;
                }
                field5025++;
                return;
            }
            this.method2132(var4, 10029, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIZ)Ljava/lang/String;")
    public static final String method2136(int arg0, int arg1, int arg2, boolean arg3) {
        field5016++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        } else if (arg3 && arg2 >= 0) {
            int var4 = 2;
            for (int var5 = arg2 / arg0; var5 != 0; var5 /= arg0) {
                var4++;
            }
            char[] var6 = new char[var4];
            if (arg1 != 48) {
                method2134(117, 0.087052345F, 12, -65, false, 90, 28, -100);
            }
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg2;
                arg2 /= arg0;
                int var9 = var8 - (arg0 * arg2);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg2, arg0);
        }
    }
}
