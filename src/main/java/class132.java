import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class132 extends class509 {

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "Z")
    private boolean field1937 = false;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "Lgw;")
    private class108 field1941;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "[I")
    public static int[] field1944 = new int[2048];

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI)V", line = 3)
    public final void method122(boolean arg0, int arg1) {
        ++field1940;
        if (arg1 != 64) {
            this.method125((byte) -37, 59, (class169) null);
        }
        class32 var3 = super.field7409.method1729(true);
        if (this.field1941 != null && var3 != null && arg0) {
            this.field1941.method850(false, '\u0000');
            super.field7409.method1756(1, 104);
            super.field7409.method1749(25752, var3);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field7409.field3981.method2964((byte) -71), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field7409.method1756(0, arg1 ^ 50);
            this.field1937 = true;
        } else {
            super.field7409.method1778(34168, 770, 1, 0);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIIIIIILuh;)Z", line = 36)
    public static final boolean method966(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class407 arg10) {
        ++field1946;
        int var11 = arg9;
        int var12 = arg2;
        if (arg0 > -43) {
            return false;
        } else {
            byte var13 = 64;
            byte var14 = 64;
            int var15 = -var13 + arg9;
            class454.field6755[var13][var14] = 99;
            int var16 = -var14 + arg2;
            class125.field1878[var13][var14] = 0;
            byte var17 = 0;
            class63.field996[var17] = arg9;
            int var18 = 0;
            byte var10001 = var17;
            int var26 = var17 + 1;
            class200.field3104[var10001] = arg2;
            int[][] var19 = arg10.field6004;
            while (~var26 != ~var18) {
                var12 = class200.field3104[var18];
                var11 = class63.field996[var18];
                int var20 = -var16 + var12;
                var18 = 4095 & var18 - -1;
                int var21 = var11 - var15;
                int var22 = var11 - arg10.field6019;
                int var23 = var12 - arg10.field6015;
                if (~arg1 != 3) {
                    if (~arg1 != 2) {
                        if (arg1 != -2) {
                            if (~arg1 != 0) {
                                if (arg1 != 0 && arg1 != 1 && arg1 != 2 && arg1 != 3 && arg1 != 9) {
                                    if (arg10.method2562(arg1, var12, arg5, -2, arg8, arg7, 2, var11)) {
                                        class57.field880 = var11;
                                        class128.field1916 = var12;
                                        return true;
                                    }
                                } else if (arg10.method2572(var11, arg1, var12, arg8, 2, arg5, arg7, (byte) 76)) {
                                    class57.field880 = var11;
                                    class128.field1916 = var12;
                                    return true;
                                }
                            } else if (arg10.method2573(arg3, var12, 2, 8, arg6, arg4, arg5, arg7, var11)) {
                                class57.field880 = var11;
                                class128.field1916 = var12;
                                return true;
                            }
                        } else if (arg10.method2570(var12, 2, arg6, arg7, 2, var11, -6197, arg5, arg3, arg4)) {
                            class57.field880 = var11;
                            class128.field1916 = var12;
                            return true;
                        }
                    } else if (class342.method2204(var11, (byte) 86, 2, arg7, arg5, var12, arg4, arg6, 2)) {
                        class128.field1916 = var12;
                        class57.field880 = var11;
                        return true;
                    }
                } else if (arg7 == var11 && arg5 == var12) {
                    class128.field1916 = var12;
                    class57.field880 = var11;
                    return true;
                }
                int var25 = class125.field1878[var21][var20] + 1;
                if (~var21 < -1 && ~class454.field6755[var21 - 1][var20] == -1 && ~(1134821376 & var19[var22 - 1][var23]) == -1 && (1310982144 & var19[var22 - 1][var23 + 1]) == 0) {
                    class63.field996[var26] = var11 + -1;
                    class200.field3104[var26] = var12;
                    class454.field6755[var21 + -1][var20] = 2;
                    var26 = var26 + 1 & 4095;
                    class125.field1878[var21 - 1][var20] = var25;
                }
                if (var21 < 126 && class454.field6755[var21 - -1][var20] == 0 && ~(1625554944 & var19[var22 - -2][var23]) == -1 && (2015625216 & var19[var22 + 2][var23 + 1]) == 0) {
                    class63.field996[var26] = var11 - -1;
                    class200.field3104[var26] = var12;
                    var26 = var26 - -1 & 4095;
                    class454.field6755[var21 - -1][var20] = 8;
                    class125.field1878[var21 + 1][var20] = var25;
                }
                if (var20 > 0 && ~class454.field6755[var21][var20 - 1] == -1 && ~(var19[var22][var23 + -1] & 1134821376) == -1 && ~(1625554944 & var19[var22 + 1][var23 + -1]) == -1) {
                    class63.field996[var26] = var11;
                    class200.field3104[var26] = var12 + -1;
                    class454.field6755[var21][var20 - 1] = 1;
                    var26 = var26 + 1 & 4095;
                    class125.field1878[var21][var20 - 1] = var25;
                }
                if (~var20 > -127 && class454.field6755[var21][var20 - -1] == 0 && (var19[var22][var23 + 2] & 1310982144) == 0 && (2015625216 & var19[var22 + 1][var23 + 2]) == 0) {
                    class63.field996[var26] = var11;
                    class200.field3104[var26] = var12 + 1;
                    var26 = 4095 & var26 - -1;
                    class454.field6755[var21][var20 - -1] = 4;
                    class125.field1878[var21][var20 + 1] = var25;
                }
                if (var21 > 0 && ~var20 < -1 && class454.field6755[var21 - 1][var20 + -1] == 0 && (var19[var22 - 1][var23] & 1336147968) == 0 && ~(var19[var22 + -1][var23 - 1] & 1134821376) == -1 && (1675886592 & var19[var22][var23 + -1]) == 0) {
                    class63.field996[var26] = var11 + -1;
                    class200.field3104[var26] = var12 - 1;
                    class454.field6755[var21 + -1][var20 + -1] = 3;
                    var26 = 4095 & var26 - -1;
                    class125.field1878[var21 - 1][var20 - 1] = var25;
                }
                if (~var21 > -127 && ~var20 < -1 && class454.field6755[var21 + 1][var20 + -1] == 0 && ~(var19[var22 - -1][var23 + -1] & 1675886592) == -1 && (1625554944 & var19[var22 - -2][var23 - 1]) == 0 && (var19[var22 + 2][var23] & 2028208128) == 0) {
                    class63.field996[var26] = var11 + 1;
                    class200.field3104[var26] = var12 + -1;
                    var26 = 4095 & var26 + 1;
                    class454.field6755[var21 - -1][var20 + -1] = 9;
                    class125.field1878[var21 - -1][var20 + -1] = var25;
                }
                if (~var21 < -1 && ~var20 > -127 && ~class454.field6755[var21 - 1][var20 + 1] == -1 && ~(var19[var22 + -1][var23 + 1] & 1336147968) == -1 && (var19[var22 + -1][var23 + 2] & 1310982144) == 0 && ~(var19[var22][var23 + 2] & 2116288512) == -1) {
                    class63.field996[var26] = var11 + -1;
                    class200.field3104[var26] = var12 + 1;
                    var26 = var26 + 1 & 4095;
                    class454.field6755[var21 + -1][var20 + 1] = 6;
                    class125.field1878[var21 + -1][var20 + 1] = var25;
                }
                if (~var21 > -127 && var20 < 126 && class454.field6755[var21 + 1][var20 + 1] == 0 && (var19[var22 - -1][var23 + 2] & 2116288512) == 0 && ~(2015625216 & var19[var22 + 2][var23 + 2]) == -1 && ~(2028208128 & var19[var22 + 2][var23 + 1]) == -1) {
                    class63.field996[var26] = var11 + 1;
                    class200.field3104[var26] = var12 + 1;
                    class454.field6755[var21 + 1][var20 + 1] = 12;
                    var26 = var26 + 1 & 4095;
                    class125.field1878[var21 + 1][var20 - -1] = var25;
                }
            }
            class128.field1916 = var12;
            class57.field880 = var11;
            return false;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)V", line = 387)
    public static void method967(boolean arg0) {
        if (arg0) {
            method967(false);
        }
        field1944 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIZ)V", line = 400)
    public final void method123(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field1947 = -128;
        }
        ++field1945;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Ltt;)V", line = 477)
    public class132(class249 arg0) {
        super(arg0);
        if (arg0.field4025) {
            this.field1941 = new class108(arg0, 2);
            this.field1941.method848(0, true);
            super.field7409.method1756(1, 122);
            super.field7409.method1741(34165, (byte) -89, 7681);
            super.field7409.method1780(770, 34168, 34176, 2);
            super.field7409.method1778(34167, 770, 1, 0);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field7409.method1756(0, -38);
            this.field1941.method851(93);
            this.field1941.method848(1, true);
            super.field7409.method1756(1, 127);
            super.field7409.method1741(8448, (byte) 118, 8448);
            super.field7409.method1780(770, 34166, 34176, 2);
            super.field7409.method1778(5890, 770, 1, 0);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field7409.method1756(0, 100);
            this.field1941.method851(125);
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)Z", line = 418)
    public final boolean method124(int arg0) {
        if (arg0 != -32170) {
            this.method123(2, 66, false);
        }
        ++field1939;
        return true;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BILin;)V", line = 430)
    public final void method125(byte arg0, int arg1, class169 arg2) {
        ++field1943;
        super.field7409.method1749(25752, arg2);
        super.field7409.method1734(-69, arg1);
        if (arg0 < 9) {
            this.field1937 = false;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V", line = 443)
    public final void method121(byte arg0) {
        if (arg0 == 38) {
            if (this.field1937) {
                this.field1941.method850(false, '\u0001');
                super.field7409.method1756(1, -16);
                super.field7409.method1749(25752, (class169) null);
                super.field7409.method1756(0, arg0 + -140);
            } else {
                super.field7409.method1778(5890, 770, 1, 0);
            }
            ++field1942;
            super.field7409.method1741(8448, (byte) -101, 8448);
            this.field1937 = false;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BZ)V", line = 465)
    public final void method128(byte arg0, boolean arg1) {
        super.field7409.method1741(8448, (byte) -15, 7681);
        ++field1938;
        if (arg0 <= 44) {
            this.method124(124);
        }
    }
}
