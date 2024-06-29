import jaggl.OpenGL;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class286 extends class140 {

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "Z")
    private boolean field3994 = false;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "Lwl;")
    private class348 field3995;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "Lkda;")
    public static class328 field3991;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "Liaa;")
    public static class423 field3993;

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lte;)V")
    public class286(class527 arg0) {
        super(arg0);
        if (arg0.field7853) {
            this.field3995 = new class348(arg0, 2);
            this.field3995.method2113(0, 25033);
            super.field1984.method3111(33984, 1);
            super.field1984.method3183(34165, -127, 7681);
            super.field1984.method3157(34168, 2, true, 770);
            super.field1984.method3107(34167, (byte) -89, 770, 0);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field1984.method3111(33984, 0);
            this.field3995.method2114(0);
            this.field3995.method2113(1, 25033);
            super.field1984.method3111(33984, 1);
            super.field1984.method3183(8448, -128, 8448);
            super.field1984.method3157(34166, 2, true, 770);
            super.field1984.method3107(5890, (byte) -103, 770, 0);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field1984.method3111(33984, 0);
            this.field3995.method2114(0);
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
    public final void method143(int arg0) {
        ++field3996;
        if (this.field3994) {
            this.field3995.method2110('\u0001', (byte) -123);
            super.field1984.method3111(arg0 + 33991, 1);
            super.field1984.method3152(arg0 ^ 7, (class228) null);
            super.field1984.method3111(33984, 0);
        } else {
            super.field1984.method3107(5890, (byte) -25, 770, 0);
        }
        if (arg0 != -7) {
            method1779(65);
        }
        super.field1984.method3183(8448, arg0 + -120, 8448);
        this.field3994 = false;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)Z")
    public final boolean method149(int arg0) {
        if (arg0 >= -36) {
            field3991 = null;
        }
        ++field4000;
        return true;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILjl;)V")
    public final void method146(int arg0, int arg1, class228 arg2) {
        ++field4001;
        super.field1984.method3152(-2, arg2);
        super.field1984.method3121(-27745, arg1);
        if (arg0 != -7) {
            this.field3994 = true;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(III)Z")
    public static final boolean method1775(int arg0, int arg1, int arg2) {
        ++field4002;
        if (arg1 >= -22) {
            method1777((class162) null, (byte) -95, (class162) null);
        }
        if (!class337.method2056(arg0, (byte) 116, arg2)) {
            return false;
        } else {
            return class301.method1845(1602556193, arg0, arg2) | (arg2 & 36864) != 0 | class391.method2330(arg2, 256, arg0) ? true : ((arg2 & 8192) != 0 | class393.method2336(arg2, -9359, arg0) | class77.method592(0, arg0, arg2)) & (arg0 & 55) == 0;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZB)V")
    public final void method148(boolean arg0, byte arg1) {
        if (arg1 != -86) {
            method1777((class162) null, (byte) 7, (class162) null);
        }
        ++field3990;
        class384 var3 = super.field1984.method3114(31095);
        if (this.field3995 != null && var3 != null && arg0) {
            this.field3995.method2110('\u0000', (byte) -127);
            super.field1984.method3111(33984, 1);
            super.field1984.method3152(arg1 ^ 84, var3);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field1984.field7801.method346(arg1 ^ -5578), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field1984.method3111(33984, 0);
            this.field3994 = true;
        } else {
            super.field1984.method3107(34168, (byte) -47, 770, 0);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
    public static void method1776(byte arg0) {
        field3991 = null;
        field3993 = null;
        int var1 = 71 % ((-39 - arg0) / 41);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)V")
    public final void method144(int arg0, int arg1, int arg2) {
        if (arg1 != -4741) {
            this.method143(23);
        }
        ++field3992;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lvp;BLvp;)V")
    public static final void method1777(class162 arg0, byte arg1, class162 arg2) {
        class402.method2367(class188.field2794, (byte) 119);
        ++class383.field5274;
        ++field3998;
        class112.field1589.method1058(602643080, arg0.field2456);
        class112.field1589.method1008(false, arg2.field2415);
        if (arg1 != 18) {
            method1776((byte) 41);
        }
        class112.field1589.method1008(false, arg2.field2434);
        class112.field1589.method1012(976668456, arg0.field2434);
        class112.field1589.method1017(arg0.field2415, 428082024);
        class112.field1589.method1059(arg2.field2456, (byte) -76);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB)Lvda;")
    public static final class158 method1778(int arg0, byte arg1) {
        ++field3997;
        class158 var2 = (class158) class519.field7397.method842(0, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class388.field5331.method1966(arg0, 1, true);
            class158 var4 = new class158();
            int var5 = 44 % ((-62 - arg1) / 44);
            var4.field2338 = arg0;
            if (var3 != null) {
                var4.method1138(8, new class148(var3));
            }
            var4.method1134(-21011);
            if (var4.field2342 == 2 && class336.field4651.method2799((long) arg0, true) == null) {
                class336.field4651.method2797(-4234, new class556(class604.field8998), (long) arg0);
                class219.field3192[class604.field8998++] = var4;
            }
            class519.field7397.method835((byte) 117, (long) arg0, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)V")
    public static final void method1779(int arg0) {
        ++field3999;
        if (class99.field1448 == null) {
            if (arg0 >= -118) {
                field3993 = null;
            }
            int var1 = class104.field1513;
            int var2 = class587.field8700;
            int var3 = -class165.field2605 + class384.field5289 + -var1;
            int var4 = -class47.field562 + -var2 + class625.field9202;
            if (~var1 < -1 || ~var3 < -1 || var2 > 0 || ~var4 < -1) {
                try {
                    Container var5;
                    if (class390.field5382 != null) {
                        var5 = class390.field5382;
                    } else {
                        var5 = class442.field5896.field4568;
                    }
                    int var6 = 0;
                    int var7 = 0;
                    if (class390.field5382 == var5) {
                        Insets var8 = class390.field5382.getInsets();
                        var6 = var8.left;
                        var7 = var8.top;
                    }
                    Graphics var9 = var5.getGraphics();
                    var9.setColor(Color.black);
                    if (var1 > 0) {
                        var9.fillRect(var6, var7, var1, class625.field9202);
                    }
                    if (var2 > 0) {
                        var9.fillRect(var6, var7, class384.field5289, var2);
                    }
                    if (var3 > 0) {
                        var9.fillRect(var6 - -class384.field5289 + -var3, var7, var3, class625.field9202);
                    }
                    if (var4 > 0) {
                        var9.fillRect(var6, class625.field9202 + var7 + -var4, class384.field5289, var4);
                        return;
                    }
                } catch (Exception var10) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)V")
    public final void method145(int arg0, boolean arg1) {
        if (arg0 == -7) {
            ++field4003;
            super.field1984.method3183(8448, -126, 7681);
        }
    }
}
