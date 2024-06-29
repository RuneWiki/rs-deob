import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class178 extends class159 {

    @OriginalMember(owner = "client!wp", name = "s", descriptor = "Loea;")
    private class594 field2566;

    @OriginalMember(owner = "client!wp", name = "t", descriptor = "Lni;")
    private class518 field2567;

    @OriginalMember(owner = "client!wp", name = "r", descriptor = "[I")
    public static int[] field2565 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!wp", name = "n", descriptor = "I")
    public static int field2561 = -1;

    @OriginalMember(owner = "client!wp", name = "w", descriptor = "Lqca;")
    public static class115 field2570 = new class115(6, 0, 4, 2);

    @OriginalMember(owner = "client!wp", name = "o", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!wp", name = "p", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!wp", name = "q", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!wp", name = "u", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!wp", name = "v", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!wp", name = "x", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)Lni;", line = 6)
    public final class518 method201(byte arg0) {
        field2562++;
        int var2 = -29 / ((arg0 - 35) / 38);
        return this.field2567;
    }

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "(I)V", line = 17)
    public static void method1285(int arg0) {
        field2570 = null;
        if (arg0 == 21590) {
            field2565 = null;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Z)I", line = 29)
    public final int method1286(boolean arg0) {
        if (arg0) {
            method1288(')', 106);
        }
        field2571++;
        return this.field2567.field7358;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZFLni;Lni;)Z", line = 40)
    public final boolean method1287(boolean arg0, float arg1, class518 arg2, class518 arg3) {
        field2564++;
        boolean var5 = true;
        class419 var6 = this.field2566.field8672;
        this.field2566.method624(class675.field9477);
        this.field2566.method601();
        this.field2566.method3439(0);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field2567.field7358, this.field2567.field7358);
        this.field2566.method3414(false, -32);
        this.field2566.method3463(false, (byte) 3);
        this.field2566.method3475(true, false);
        this.field2566.method3483(92, false);
        this.field2566.method3486((byte) 19, -2);
        this.field2566.method3413(1, 33984);
        this.field2566.method3443(0.0F, 0.0F, arg1, 0.0F, arg0);
        this.field2566.method3485(34165, (byte) 42, 34165);
        this.field2566.method3425(arg3, -111);
        this.field2566.method3413(0, 33984);
        this.field2566.method3417(1, 0);
        this.field2566.method3425(arg2, -71);
        this.field2566.method3446(var6, (byte) 110);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method2551(-17968, 0, var8, this.field2567);
            var6.method2569(0, (byte) -86);
            if (!var6.method2557(75)) {
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
        var6.method2555(0, (byte) 124);
        this.field2566.method3442((byte) -69, var6);
        this.field2566.method3413(1, 33984);
        this.field2566.method3425(null, -103);
        this.field2566.method3485(8448, (byte) 100, 8448);
        this.field2566.method3413(0, 33984);
        this.field2566.method3425(null, -124);
        OpenGL.glPopAttrib();
        this.field2566.method584(class675.field9477[0], class675.field9477[1], class675.field9477[2], class675.field9477[3]);
        if (var5 && !this.field2566.field8633) {
            this.field2567.method820(-12650);
        }
        return var5;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(CI)Z", line = 239)
    public static final boolean method1288(char arg0, int arg1) {
        if (arg1 != 65) {
            method1285(-12);
        }
        field2563++;
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Loea;I)V", line = 263)
    public class178(class594 arg0, int arg1) {
        this.field2566 = arg0;
        this.field2567 = new class518(arg0, 6408, arg1);
    }
}
