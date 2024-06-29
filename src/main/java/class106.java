import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class106 extends class523 {

    @OriginalMember(owner = "client!qda", name = "s", descriptor = "Lbi;")
    private class483 field1531;

    @OriginalMember(owner = "client!qda", name = "k", descriptor = "Lkk;")
    private class193 field1523;

    @OriginalMember(owner = "client!qda", name = "q", descriptor = "Lcha;")
    public static class220 field1529 = new class220(1, 8);

    @OriginalMember(owner = "client!qda", name = "v", descriptor = "D")
    public static double field1534 = -1.0D;

    @OriginalMember(owner = "client!qda", name = "l", descriptor = "D")
    public static double field1524;

    @OriginalMember(owner = "client!qda", name = "m", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!qda", name = "n", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!qda", name = "o", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!qda", name = "p", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!qda", name = "r", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!qda", name = "u", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!qda", name = "w", descriptor = "Ljava/lang/String;")
    public static String field1535;

    @OriginalMember(owner = "client!qda", name = "t", descriptor = "[I")
    public static int[] field1532;

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "(III)Lje;")
    public static final class405 method855(int arg0, int arg1, int arg2) {
        if (arg2 != 65535) {
            method858(99);
        }
        field1527++;
        class405 var3 = new class405();
        var3.field5131 = -1;
        var3.field5116 = arg0 + 1 + 5;
        var3.field5122 = -1;
        var3.field5123 = arg1 + 1 + 5;
        var3.field5137 = new int[var3.field5123][var3.field5116];
        var3.method2253(true);
        return var3;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(Z)Lwo;")
    public static final class746 method856(boolean arg0) {
        field1526++;
        class700 var1 = null;
        class746 var2 = new class746(class293.field3867, 0);
        try {
            if (arg0) {
                field1534 = 0.7591826014435694D;
            }
            class181 var3 = class162.field2227.method2638("", 3070, true);
            while (var3.field2538 == 0) {
                class149.method1052(1L, true);
            }
            if (var3.field2538 == 1) {
                var1 = (class700) var3.field2540;
                byte[] var4 = new byte[(int) var1.method3939((byte) 99)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var1.method3938(false, var4, var5, var4.length - var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                var2 = new class746(new class461(var4), class293.field3867, 0);
            }
        } catch (Exception var8) {
        }
        try {
            if (var1 != null) {
                var1.method3941(true);
            }
        } catch (Exception var7) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!qda", name = "c", descriptor = "(I)I")
    public final int method857(int arg0) {
        field1528++;
        if (arg0 <= 48) {
            method859(55);
        }
        return this.field1523.field2643;
    }

    @OriginalMember(owner = "client!qda", name = "d", descriptor = "(I)V")
    public static final void method858(int arg0) {
        if (arg0 != -1) {
            field1524 = 0.2725757027610044D;
        }
        field1525++;
        class739.field10303.method457(class637.field8786, class748.field10451.field10418.method3928((byte) -58) == 1 ? class349.field4507 + 256 << 2 : -1, 0);
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(I)Lkk;")
    public final class193 method420(int arg0) {
        field1530++;
        if (arg0 != 22) {
            method858(-61);
        }
        return this.field1523;
    }

    @OriginalMember(owner = "client!qda", name = "e", descriptor = "(I)V")
    public static void method859(int arg0) {
        field1535 = null;
        if (arg0 == 1) {
            field1532 = null;
            field1529 = null;
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(Lkk;BLkk;F)Z")
    public final boolean method860(class193 arg0, byte arg1, class193 arg2, float arg3) {
        field1533++;
        boolean var5 = true;
        class656 var6 = this.field1531.field6842;
        this.field1531.method483(class117.field1730);
        this.field1531.method446();
        this.field1531.method2785(-1);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field1523.field2643, this.field1523.field2643);
        this.field1531.method2789(false, arg1 ^ 0x3F57);
        this.field1531.method2776(1, false);
        this.field1531.method2801(-1, false);
        this.field1531.method2816((byte) -108, false);
        this.field1531.method2777(-2, 1);
        this.field1531.method2847(1, false);
        this.field1531.method2825((byte) 124, 0.0F, arg3, 0.0F, 0.0F);
        this.field1531.method2799(-27874, 34165, 34165);
        this.field1531.method2850(-86, arg2);
        this.field1531.method2847(0, false);
        this.field1531.method2800(1, -112);
        this.field1531.method2850(arg1 ^ 0xFFFFFFB8, arg0);
        this.field1531.method2815((byte) 69, var6);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method3694(this.field1523, -120, 0, var8);
            var6.method3693(0, 0);
            if (!var6.method3702(-24937)) {
                var5 = false;
                break;
            }
            OpenGL.glBegin(7);
            if (var8 == 34069) {
                OpenGL.glTexCoord3i(65535, 65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65535, 65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65535, -65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(65535, -65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34070) {
                OpenGL.glTexCoord3i(-65535, 65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(-65535, 65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(-65535, -65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65535, -65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34071) {
                OpenGL.glTexCoord3i(-65534, 65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, 65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34072) {
                OpenGL.glTexCoord3i(-65534, -65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, -65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34073) {
                OpenGL.glTexCoord3i(-65534, 65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, -65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34074) {
                OpenGL.glTexCoord3i(65534, 65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(-65534, 65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(-65534, -65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(65534, -65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
                OpenGL.glVertex2f(0.0F, 1.0F);
            }
            OpenGL.glEnd();
        }
        var6.method3688(-104, 0);
        this.field1531.method2851(-128, var6);
        this.field1531.method2847(1, false);
        this.field1531.method2850(arg1 ^ 0x33, null);
        this.field1531.method2799(arg1 ^ 0xFFFF9369, 8448, 8448);
        this.field1531.method2847(0, false);
        this.field1531.method2850(arg1 ^ 0x35, null);
        OpenGL.glPopAttrib();
        this.field1531.method534(class117.field1730[0], class117.field1730[1], class117.field1730[2], class117.field1730[3]);
        if (var5 && !this.field1531.field6832) {
            this.field1523.method3896((byte) -123);
        }
        return arg1 == 119 ? var5 : false;
    }

    @OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(Lbi;I)V")
    public class106(class483 arg0, int arg1) {
        this.field1531 = arg0;
        this.field1523 = new class193(arg0, 6408, arg1);
    }
}
