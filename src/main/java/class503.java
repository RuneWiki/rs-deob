import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class503 extends class446 {

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "Z")
    private boolean field7358 = false;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "Ltm;")
    private class267 field7356;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field7349;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public static int field7350;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    public static int field7351;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public static int field7352;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    public static int field7353;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
    public static int field7354;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
    public static int field7355;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
    public static int field7357;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
    public static int field7359;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
    public static int field7360;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IILac;)V")
    public final void method694(int arg0, int arg1, class381 arg2) {
        ++field7352;
        super.field6642.method381((byte) 28, arg2);
        super.field6642.method288((byte) 62, arg0);
        if (arg1 != 0) {
            this.field7356 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)V")
    public final void method689(int arg0, int arg1, int arg2) {
        ++field7353;
        if (arg0 != -1) {
            method3027(-37, (byte) 44, -21, -80, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIII)V")
    public static final void method3026(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 >= arg1) {
            method3027(arg1, (byte) 127, arg2, arg3, class316.field4797[arg4]);
        } else {
            method3027(arg2, (byte) 127, arg1, arg3, class316.field4797[arg4]);
        }
        ++field7354;
        if (arg0 != 28319) {
            field7359 = 83;
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V")
    public final void method688(int arg0) {
        ++field7351;
        if (!this.field7358) {
            super.field6642.method325(5890, 5126, 770, 0);
        } else {
            this.field7356.method1702(-80, '\u0001');
            super.field6642.method392((byte) 106, 1);
            super.field6642.method381((byte) 28, (class381) null);
            super.field6642.method392((byte) 106, 0);
        }
        super.field6642.method426(8448, 8448, -24610);
        this.field7358 = false;
        if (arg0 <= 5) {
            field7350 = -105;
        }
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lda;)V")
    public class503(class44 arg0) {
        super(arg0);
        if (arg0.field935) {
            this.field7356 = new class267(arg0, 2);
            this.field7356.method1699((byte) 88, 0);
            super.field6642.method392((byte) 106, 1);
            super.field6642.method426(34165, 7681, -24610);
            super.field6642.method412(2, 34168, 770, 83);
            super.field6642.method325(34167, 5126, 770, 0);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field6642.method392((byte) 106, 0);
            this.field7356.method1700(2);
            this.field7356.method1699((byte) 88, 1);
            super.field6642.method392((byte) 106, 1);
            super.field6642.method426(8448, 8448, -24610);
            super.field6642.method412(2, 34166, 770, 77);
            super.field6642.method325(5890, 5126, 770, 0);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field6642.method392((byte) 106, 0);
            this.field7356.method1700(2);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BZ)V")
    public final void method695(byte arg0, boolean arg1) {
        super.field6642.method426(8448, 7681, -24610);
        if (arg0 != -33) {
            this.method696(false, (byte) 46);
        }
        ++field7360;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)Z")
    public final boolean method691(byte arg0) {
        if (arg0 != -93) {
            return false;
        } else {
            ++field7349;
            return true;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZB)V")
    public final void method696(boolean arg0, byte arg1) {
        ++field7355;
        class46 var3 = super.field6642.method395(arg1);
        if (this.field7356 != null && var3 != null && arg0) {
            this.field7356.method1702(arg1 ^ -82, '\u0000');
            super.field6642.method392((byte) 106, 1);
            super.field6642.method381((byte) 28, var3);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field6642.field860.method1582(9), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field6642.method392((byte) 106, 0);
            this.field7358 = true;
        } else {
            super.field6642.method325(34168, 5126, 770, 0);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IBII[I)V")
    public static final void method3027(int arg0, byte arg1, int arg2, int arg3, int[] arg4) {
        --arg0;
        if (arg1 != 127) {
            method3026(-25, -51, -47, 79, 12);
        }
        ++field7357;
        int var11 = arg2 - 1;
        int var5 = var11 + -7;
        while (~var5 < ~arg0) {
            int var6 = arg0 + 1;
            arg4[var6] = arg3;
            int var7 = var6 + 1;
            arg4[var7] = arg3;
            int var8 = var7 + 1;
            arg4[var8] = arg3;
            int var9 = var8 + 1;
            arg4[var9] = arg3;
            int var10 = var9 + 1;
            arg4[var10] = arg3;
            int var12 = var10 + 1;
            arg4[var12] = arg3;
            int var13 = var12 + 1;
            arg4[var13] = arg3;
            arg0 = var13 + 1;
            arg4[arg0] = arg3;
        }
        while (arg0 < var11) {
            ++arg0;
            arg4[arg0] = arg3;
        }
    }
}
