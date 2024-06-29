import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class390 extends class318 {

    @OriginalMember(owner = "client!fu", name = "r", descriptor = "Leea;")
    private class131 field5516;

    @OriginalMember(owner = "client!fu", name = "p", descriptor = "Lku;")
    private class375 field5514;

    @OriginalMember(owner = "client!fu", name = "s", descriptor = "Z")
    public static boolean field5517 = false;

    @OriginalMember(owner = "client!fu", name = "q", descriptor = "I")
    public static int field5515;

    @OriginalMember(owner = "client!fu", name = "t", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!fu", name = "v", descriptor = "I")
    public static int field5520;

    @OriginalMember(owner = "client!fu", name = "w", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!fu", name = "x", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!fu", name = "y", descriptor = "I")
    public static int field5523;

    @OriginalMember(owner = "client!fu", name = "u", descriptor = "Lfp;")
    public static class323 field5519;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(B)Lku;", line = 5)
    public final class375 method2063(byte arg0) {
        field5521++;
        return arg0 == -79 ? this.field5514 : null;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIILha;ILhba;)V", line = 16)
    public static final void method2452(int arg0, int arg1, int arg2, class58 arg3, int arg4, class10 arg5) {
        field5520++;
        if (arg0 != -65534) {
            return;
        }
        class212 var6 = class48.field564.method1412(9, arg5.field143);
        if (var6.field2798 == -1) {
            return;
        }
        int var8;
        if (arg5.field170) {
            int var7 = arg5.field163 + arg1;
            var8 = var7 & 0x3;
        } else {
            var8 = 0;
        }
        class88 var9 = var6.method1306(arg5.field171, var8, arg3, false);
        if (var9 == null) {
            return;
        }
        int var10 = arg5.field225;
        int var11 = arg5.field230;
        if ((var8 & 0x1) == 1) {
            var10 = arg5.field230;
            var11 = arg5.field225;
        }
        int var12 = var9.method656();
        int var13 = var9.method670();
        if (var6.field2792) {
            var13 = var11 * 4;
            var12 = var10 * 4;
        }
        if (var6.field2797 == 0) {
            var9.method668(arg4, arg2 + 4 - var11 * 4, var12, var13);
        } else {
            var9.method654(arg4, arg2 - (var11 - 1) * 4, var12, var13, 0, var6.field2797 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "(I)V", line = 74)
    public static void method2453(int arg0) {
        if (arg0 != -65534) {
            method2453(102);
        }
        field5519 = null;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIII)V", line = 84)
    public static final void method2454(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5523++;
        class592 var5 = class682.method3825(-652872096, 4, arg1);
        var5.method3351(0);
        var5.field8337 = arg3;
        var5.field8341 = arg0;
        if (arg4 <= 104) {
            method2454(29, -7, -29, 17, -13);
        }
        var5.field8343 = arg2;
    }

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "(B)V", line = 100)
    public static final void method2455(byte arg0) throws IOException {
        field5515++;
        int var1 = -5 % ((arg0 - 54) / 47);
        if (class333.field4663 == null || class176.field2372 <= 0) {
            return;
        }
        int var2 = 0;
        while (true) {
            class519 var3 = (class519) class232.field3138.method2765(-12261);
            if (var3 == null) {
                class522.field7400 = 0;
                class644.field8821 += var2;
                return;
            }
            class333.field4663.method2843(0, var3.field7384.field9154, -81, var3.field7379);
            class176.field2372 -= var3.field7379;
            var2 += var3.field7379;
            var3.method1185(-123);
            var3.field7384.method3721((byte) 110);
            var3.method3040(-120);
        }
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Leea;I)V", line = 132)
    public class390(class131 arg0, int arg1) {
        this.field5516 = arg0;
        this.field5514 = new class375(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "(I)I", line = 141)
    public final int method2456(int arg0) {
        int var2 = -87 / (-arg0 / 37);
        field5518++;
        return this.field5514.field5254;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(FLku;ILku;)Z", line = 157)
    public final boolean method2457(float arg0, class375 arg1, int arg2, class375 arg3) {
        field5522++;
        boolean var5 = true;
        class269 var6 = this.field5516.field1911;
        this.field5516.method398(class529.field7449);
        this.field5516.method424();
        this.field5516.method912(6);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field5514.field5254, this.field5514.field5254);
        this.field5516.method885(false, (byte) 93);
        this.field5516.method898(false, arg2 ^ 0xFFFF9A76);
        this.field5516.method879(false, 120);
        this.field5516.method881((byte) 87, false);
        this.field5516.method922(-115, -2);
        this.field5516.method884(1, true);
        this.field5516.method924(84, 0.0F, 0.0F, arg0, 0.0F);
        this.field5516.method946(false, 34165, 34165);
        this.field5516.method926(arg3, 121);
        this.field5516.method884(arg2, true);
        this.field5516.method891(1, (byte) 17);
        this.field5516.method926(arg1, arg2 ^ 0x6E);
        this.field5516.method877((byte) -99, var6);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method1760(arg2 + 19658, 0, var8, this.field5514);
            var6.method1759(0, arg2 ^ 0x56);
            if (!var6.method1749((byte) -116)) {
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
        var6.method1761(1, 0);
        this.field5516.method913(var6, (byte) -128);
        this.field5516.method884(1, true);
        this.field5516.method926(null, 63);
        this.field5516.method946(false, 8448, 8448);
        this.field5516.method884(0, true);
        this.field5516.method926(null, arg2 + 103);
        OpenGL.glPopAttrib();
        this.field5516.method469(class529.field7449[0], class529.field7449[1], class529.field7449[2], class529.field7449[3]);
        if (var5 && !this.field5516.field1853) {
            this.field5514.method1290(0);
        }
        return var5;
    }
}
