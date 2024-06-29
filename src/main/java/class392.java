import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class392 extends class312 {

    @OriginalMember(owner = "client!hea", name = "k", descriptor = "Z")
    private boolean field5744 = false;

    @OriginalMember(owner = "client!hea", name = "r", descriptor = "Lqda;")
    private class89 field5751;

    @OriginalMember(owner = "client!hea", name = "p", descriptor = "I")
    public static int field5749 = 0;

    @OriginalMember(owner = "client!hea", name = "m", descriptor = "Lsb;")
    public static class266 field5746 = new class266(21, 0);

    @OriginalMember(owner = "client!hea", name = "g", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!hea", name = "h", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!hea", name = "i", descriptor = "I")
    public static int field5742;

    @OriginalMember(owner = "client!hea", name = "j", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!hea", name = "l", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!hea", name = "n", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!hea", name = "o", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!hea", name = "q", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "(I)V")
    public static void method2425(int arg0) {
        if (arg0 > -89) {
            method2426((byte) 51, (String) null, false, -34);
        }
        field5746 = null;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(I)V")
    public final void method241(int arg0) {
        ++field5741;
        if (this.field5744) {
            this.field5751.method871(false, '\u0001');
            super.field4632.method125(1, -119);
            super.field4632.method5(3845, (class487) null);
            super.field4632.method125(0, 119);
        } else {
            super.field4632.method135((byte) -108, 5890, 0, 770);
        }
        super.field4632.method148(8448, 8448, (byte) -126);
        if (arg0 != -123) {
            this.method240(true, 33);
        }
        this.field5744 = false;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(B)Z")
    public final boolean method242(byte arg0) {
        int var2 = -17 % ((arg0 - 25) / 57);
        ++field5748;
        return true;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ZZ)V")
    public final void method243(boolean arg0, boolean arg1) {
        ++field5750;
        class243 var3 = super.field4632.method87(arg1);
        if (this.field5751 != null && var3 != null && arg0) {
            this.field5751.method871(false, '\u0000');
            super.field4632.method125(1, -82);
            super.field4632.method5(3845, var3);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field4632.field249.method2568(0), 0);
            OpenGL.glMatrixMode(5888);
            super.field4632.method125(0, 109);
            this.field5744 = true;
        } else {
            super.field4632.method135((byte) 61, 34168, 0, 770);
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(BLjava/lang/String;ZI)Z")
    public static final boolean method2426(byte arg0, String arg1, boolean arg2, int arg3) {
        ++field5747;
        if (~arg3 <= -3 && ~arg3 >= -37) {
            if (arg0 <= 41) {
                field5749 = 91;
            }
            boolean var4 = false;
            boolean var5 = false;
            int var6 = 0;
            int var7 = arg1.length();
            for (int var8 = 0; var7 > var8; ++var8) {
                char var9 = arg1.charAt(var8);
                if (var8 == 0) {
                    if (~var9 == -46) {
                        var4 = true;
                        continue;
                    }
                    if (var9 == '+' && arg2) {
                        continue;
                    }
                }
                int var11;
                if (~var9 <= -49 && var9 <= '9') {
                    var11 = var9 - '0';
                } else if (var9 >= 'A' && ~var9 >= -91) {
                    var11 = var9 - '7';
                } else {
                    if (~var9 > -98 || var9 > 'z') {
                        return false;
                    }
                    var11 = var9 - 'W';
                }
                if (~arg3 >= ~var11) {
                    return false;
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg3 * var6 - -var11;
                if (~(var10 / arg3) != ~var6) {
                    return false;
                }
                var5 = true;
                var6 = var10;
            }
            return var5;
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ZI)V")
    public final void method240(boolean arg0, int arg1) {
        if (arg1 <= 102) {
            this.field5751 = null;
        }
        ++field5742;
        super.field4632.method148(7681, 8448, (byte) -108);
    }

    @OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lus;)V")
    public class392(class1 arg0) {
        super(arg0);
        if (arg0.field337) {
            this.field5751 = new class89(arg0, 2);
            this.field5751.method874(0, -125);
            super.field4632.method125(1, 121);
            super.field4632.method148(7681, 34165, (byte) -113);
            super.field4632.method10(2, 770, 34168, 34192);
            super.field4632.method135((byte) 104, 34167, 0, 770);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field4632.method125(0, 109);
            this.field5751.method869((byte) -124);
            this.field5751.method874(1, -124);
            super.field4632.method125(1, 121);
            super.field4632.method148(8448, 8448, (byte) -124);
            super.field4632.method10(2, 770, 34166, 34192);
            super.field4632.method135((byte) -73, 5890, 0, 770);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field4632.method125(0, -48);
            this.field5751.method869((byte) -106);
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IBLum;)V")
    public final void method244(int arg0, byte arg1, class487 arg2) {
        super.field4632.method5(3845, arg2);
        ++field5740;
        super.field4632.method133(arg0, (byte) -120);
        if (arg1 > -78) {
            this.method240(false, -47);
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIB)V")
    public final void method238(int arg0, int arg1, byte arg2) {
        ++field5743;
        int var4 = -51 % ((arg2 - 74) / 45);
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(III)Z")
    public static final boolean method2427(int arg0, int arg1, int arg2) {
        ++field5745;
        if (!class308.field4551) {
            return false;
        } else {
            int var3 = arg1 >> 16;
            if (arg2 != 0) {
                method2425(-50);
            }
            int var4 = arg1 & 65535;
            if (class156.field2667[var3] != null && class156.field2667[var3][var4] != null) {
                class545 var5 = class156.field2667[var3][var4];
                if (arg0 == -1 && var5.field7649 == 0) {
                    for (class300 var6 = (class300) class126.field2292.method1224(-2); var6 != null; var6 = (class300) class126.field2292.method1232(arg2 ^ -2)) {
                        if (~var6.field4465 == -58 || var6.field4465 == 1006 || var6.field4465 == 2 || ~var6.field4465 == -11 || var6.field4465 == 46) {
                            for (class545 var7 = class415.method2533((byte) -88, var6.field4470); var7 != null; var7 = class82.method837(-125, var7)) {
                                if (var5.field7755 == var7.field7755) {
                                    return true;
                                }
                            }
                        }
                    }
                } else {
                    for (class300 var8 = (class300) class126.field2292.method1224(-2); var8 != null; var8 = (class300) class126.field2292.method1232(-2)) {
                        if (var8.field4464 == arg0 && ~var5.field7755 == ~var8.field4470 && (var8.field4465 == 57 || var8.field4465 == 1006 || var8.field4465 == 2 || var8.field4465 == 10 || ~var8.field4465 == -47)) {
                            return true;
                        }
                    }
                }
                return false;
            } else {
                return false;
            }
        }
    }
}
