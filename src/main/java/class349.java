import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class349 extends class592 {

    @OriginalMember(owner = "client!qfa", name = "r", descriptor = "Z")
    private boolean field4477 = false;

    @OriginalMember(owner = "client!qfa", name = "i", descriptor = "Luj;")
    private class554 field4468;

    @OriginalMember(owner = "client!qfa", name = "k", descriptor = "I")
    public static int field4470 = 0;

    @OriginalMember(owner = "client!qfa", name = "h", descriptor = "Lbc;")
    public static class9 field4467 = new class9(32);

    @OriginalMember(owner = "client!qfa", name = "j", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!qfa", name = "l", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!qfa", name = "m", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!qfa", name = "n", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!qfa", name = "o", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!qfa", name = "p", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!qfa", name = "q", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(I)V", line = 3)
    public static void method2007(int arg0) {
        field4467 = null;
        if (arg0 != 0) {
            field4470 = 40;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IZ)V", line = 16)
    public final void method32(int arg0, boolean arg1) {
        ++field4472;
        if (arg0 != -1) {
            this.method33(false, 25, -106);
        }
        class660 var3 = super.field8014.method3447((byte) 85);
        if (this.field4468 != null && var3 != null && arg1) {
            this.field4468.method2973(26497, '\u0000');
            super.field8014.method3469(1, false);
            super.field8014.method3388(var3, false);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field8014.field8635.method130(6), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field8014.method3469(0, false);
            this.field4477 = true;
        } else {
            super.field8014.method3389((byte) 126, 770, 0, 34168);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I)V", line = 43)
    public final void method29(int arg0) {
        if (arg0 != -1640) {
            method2007(-102);
        }
        ++field4476;
        if (!this.field4477) {
            super.field8014.method3389((byte) 80, 770, 0, 5890);
        } else {
            this.field4468.method2973(26497, '\u0001');
            super.field8014.method3469(1, false);
            super.field8014.method3388((class710) null, false);
            super.field8014.method3469(0, false);
        }
        super.field8014.method3462(8448, arg0 ^ 4254, 8448);
        this.field4477 = false;
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(B)Z", line = 65)
    public final boolean method30(byte arg0) {
        ++field4469;
        if (arg0 > -90) {
            field4467 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(Lji;)V", line = 80)
    public class349(class622 arg0) {
        super(arg0);
        if (arg0.field8615) {
            this.field4468 = new class554(arg0, 2);
            this.field4468.method2971(0, 4864);
            super.field8014.method3469(1, false);
            super.field8014.method3462(7681, -5882, 34165);
            super.field8014.method3453(false, 770, 34168, 2);
            super.field8014.method3389((byte) 78, 770, 0, 34167);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field8014.method3469(0, false);
            this.field4468.method2969((byte) 108);
            this.field4468.method2971(1, 4864);
            super.field8014.method3469(1, false);
            super.field8014.method3462(8448, -5882, 8448);
            super.field8014.method3453(false, 770, 34166, 2);
            super.field8014.method3389((byte) 104, 770, 0, 5890);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field8014.method3469(0, false);
            this.field4468.method2969((byte) 53);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ZII)V", line = 121)
    public final void method33(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            ++field4471;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IB[III)V", line = 131)
    public static final void method2008(int arg0, byte arg1, int[] arg2, int arg3, int arg4) {
        ++field4474;
        --arg3;
        int var6 = arg0 - 1;
        int var5 = -7 + var6;
        if (arg1 >= 8) {
            while (~arg3 > ~var5) {
                int var7 = arg3 + 1;
                arg2[var7] = arg4;
                int var8 = var7 + 1;
                arg2[var8] = arg4;
                int var9 = var8 + 1;
                arg2[var9] = arg4;
                int var10 = var9 + 1;
                arg2[var10] = arg4;
                int var11 = var10 + 1;
                arg2[var11] = arg4;
                int var12 = var11 + 1;
                arg2[var12] = arg4;
                int var13 = var12 + 1;
                arg2[var13] = arg4;
                arg3 = var13 + 1;
                arg2[arg3] = arg4;
            }
            while (arg3 < var6) {
                ++arg3;
                arg2[arg3] = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ZB)V", line = 168)
    public final void method27(boolean arg0, byte arg1) {
        ++field4475;
        if (arg1 <= -67) {
            super.field8014.method3462(7681, -5882, 8448);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IILgq;)V", line = 180)
    public final void method35(int arg0, int arg1, class710 arg2) {
        super.field8014.method3388(arg2, false);
        if (arg1 == 458752) {
            ++field4473;
            super.field8014.method3443(arg0, true);
        }
    }
}
