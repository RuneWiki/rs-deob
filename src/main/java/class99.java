import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class99 extends class477 {

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "Z")
    private boolean field1380 = false;

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "Lbf;")
    private class181 field1389;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "Ljava/lang/String;")
    public static String field1388 = "";

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "Lov;")
    public static class278 field1379;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field1384;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BII)V")
    public final void method272(byte arg0, int arg1, int arg2) {
        ++field1378;
        if (arg0 < 33) {
            this.field1389 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)V")
    public static void method675(boolean arg0) {
        field1379 = null;
        field1384 = null;
        if (!arg0) {
            field1388 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)Z")
    public final boolean method264(byte arg0) {
        ++field1383;
        return arg0 < 45 ? true : true;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lrh;II)V")
    public final void method266(class31 arg0, int arg1, int arg2) {
        super.field6964.method2771(arg0, -16785);
        ++field1381;
        if (arg1 == -11) {
            super.field6964.method2739(arg2, 0);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZZ)V")
    public final void method270(boolean arg0, boolean arg1) {
        ++field1391;
        class244 var3 = super.field6964.method2786(110);
        if (arg0) {
            if (this.field1389 != null && var3 != null && arg1) {
                this.field1389.method1190((byte) 50, '\u0000');
                super.field6964.method2741((byte) -38, 1);
                super.field6964.method2771(var3, -16785);
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadMatrixf(super.field6964.field6800.method2678((byte) -40), 0);
                OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
                OpenGL.glMatrixMode(5888);
                super.field6964.method2741((byte) -38, 0);
                this.field1380 = true;
            } else {
                super.field6964.method2775(770, 34168, 0, -123);
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZI)V")
    public final void method271(boolean arg0, int arg1) {
        if (arg1 != -13) {
            this.field1380 = false;
        }
        super.field6964.method2794(8448, 7681, true);
        ++field1390;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZLjava/lang/String;IB)Z")
    public static final boolean method676(boolean arg0, String arg1, int arg2, byte arg3) {
        ++field1387;
        if (arg2 >= 2 && arg2 <= 36) {
            boolean var4 = false;
            boolean var5 = false;
            int var6 = 0;
            int var7 = arg1.length();
            if (arg3 != -50) {
                return false;
            } else {
                for (int var8 = 0; var8 < var7; ++var8) {
                    char var9 = arg1.charAt(var8);
                    if (~var8 == -1) {
                        if (~var9 == -46) {
                            var4 = true;
                            continue;
                        }
                        if (var9 == '+' && arg0) {
                            continue;
                        }
                    }
                    int var11;
                    if (var9 >= '0' && var9 <= '9') {
                        var11 = var9 - '0';
                    } else if (~var9 <= -66 && ~var9 >= -91) {
                        var11 = var9 - '7';
                    } else {
                        if (var9 < 'a' || ~var9 < -123) {
                            return false;
                        }
                        var11 = var9 - 'W';
                    }
                    if (~arg2 >= ~var11) {
                        return false;
                    }
                    if (var4) {
                        var11 = -var11;
                    }
                    int var10 = arg2 * var6 + var11;
                    if (~(var10 / arg2) != ~var6) {
                        return false;
                    }
                    var5 = true;
                    var6 = var10;
                }
                return var5;
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)V")
    public final void method269(byte arg0) {
        ++field1392;
        if (arg0 == 126) {
            if (!this.field1380) {
                super.field6964.method2775(770, 5890, 0, -74);
            } else {
                this.field1389.method1190((byte) 85, '\u0001');
                super.field6964.method2741((byte) -38, 1);
                super.field6964.method2771((class31) null, -16785);
                super.field6964.method2741((byte) -38, 0);
            }
            super.field6964.method2794(8448, 8448, true);
            this.field1380 = false;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method677(int arg0, String arg1, int arg2) {
        if (arg2 != 34066) {
            method676(false, (String) null, -15, (byte) 32);
        }
        ++field1386;
        class436 var3 = class459.method2712(2, arg0, -1759243680);
        var3.method2574((byte) 73);
        var3.field5975 = arg1;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lgk;)V")
    public class99(class463 arg0) {
        super(arg0);
        if (arg0.field6802) {
            this.field1389 = new class181(arg0, 2);
            this.field1389.method1188(0, (byte) 90);
            super.field6964.method2741((byte) -38, 1);
            super.field6964.method2794(34165, 7681, true);
            super.field6964.method2781(34168, 2, 2479, 770);
            super.field6964.method2775(770, 34167, 0, 73);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field6964.method2741((byte) -38, 0);
            this.field1389.method1193(11);
            this.field1389.method1188(1, (byte) 82);
            super.field6964.method2741((byte) -38, 1);
            super.field6964.method2794(8448, 8448, true);
            super.field6964.method2781(34166, 2, 2479, 770);
            super.field6964.method2775(770, 5890, 0, 76);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field6964.method2741((byte) -38, 0);
            this.field1389.method1193(-125);
        }
    }
}
