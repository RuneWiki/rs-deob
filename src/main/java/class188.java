import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class188 extends class246 {

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "Z")
    private boolean field2764 = false;

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "Llo;")
    private class365 field2768;

    @OriginalMember(owner = "client!ko", name = "o", descriptor = "Lka;")
    public static class473 field2771 = new class473(8);

    @OriginalMember(owner = "client!ko", name = "k", descriptor = "F")
    public static float field2767;

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!ko", name = "i", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!ko", name = "j", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!ko", name = "n", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!ko", name = "q", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!ko", name = "r", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!ko", name = "s", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!ko", name = "t", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!ko", name = "p", descriptor = "Lrv;")
    public static class223 field2772;

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "[I")
    public static int[] field2769;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)Z")
    public final boolean method738(byte arg0) {
        if (arg0 < 99) {
            field2767 = -0.82601887F;
        }
        ++field2776;
        return true;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V")
    public final void method739(int arg0) {
        ++field2762;
        if (this.field2764) {
            this.field2768.method2183((byte) -41, '\u0001');
            super.field3361.method1990(false, 1);
            super.field3361.method1977((class128) null, true);
            super.field3361.method1990(false, 0);
        } else {
            super.field3361.method1994(0, 770, 5890, 8960);
        }
        int var2 = 57 / ((arg0 - -80) / 32);
        super.field3361.method2023(8448, 8448, 2929);
        this.field2764 = false;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)V")
    public static final void method1256(int arg0) {
        if (arg0 != -15736) {
            field2767 = -0.1334661F;
        }
        ++field2770;
        if (!class76.field1075.method1104(class195.field2849, 0) && ~class366.field5260 != ~class315.field4267) {
            class219.method1369(10, class412.field5874, false, class334.field4874, -118);
        } else {
            class378.method2258(8135, class275.field3737);
            if (class366.field5260 != class187.field2758) {
                class432.method2562((byte) -110);
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZI)V")
    public final void method740(boolean arg0, int arg1) {
        ++field2765;
        if (arg1 != 26715) {
            this.field2768 = null;
        }
        super.field3361.method2023(8448, 7681, arg1 + -23786);
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(I)V")
    public static void method1257(int arg0) {
        field2769 = null;
        field2771 = null;
        if (arg0 != 3168) {
            method1259(-34, (byte) 50, 42, 117, (int[]) null);
        }
        field2772 = null;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILfg;I)V")
    public final void method742(int arg0, class128 arg1, int arg2) {
        super.field3361.method1977(arg1, true);
        ++field2774;
        if (arg0 == 4) {
            super.field3361.method1966(-1, arg2);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Ldk;IIZII)V")
    public static final void method1258(class421 arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        ++field2775;
        class320.field4400 = arg2;
        class135.field2056 = arg0;
        class428.field6223 = arg4;
        class100.field1594 = 10000;
        if (arg1 >= -91) {
            method1259(-75, (byte) 41, 65, 23, (int[]) null);
        }
        class238.field3287 = arg3;
        class390.field5635 = arg5;
        class87.field1418 = 1;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IBII[I)V")
    public static final void method1259(int arg0, byte arg1, int arg2, int arg3, int[] arg4) {
        ++field2766;
        --arg0;
        if (arg1 != 27) {
            field2772 = null;
        }
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
        while (~var11 < ~arg0) {
            ++arg0;
            arg4[arg0] = arg3;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(BII)V")
    public final void method744(byte arg0, int arg1, int arg2) {
        ++field2763;
        if (arg0 != 53) {
            field2772 = null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZB)V")
    public final void method743(boolean arg0, byte arg1) {
        ++field2773;
        class490 var3 = super.field3361.method2002(0);
        if (this.field2768 != null && var3 != null && arg0) {
            this.field2768.method2183((byte) -41, '\u0000');
            super.field3361.method1990(false, 1);
            super.field3361.method1977(var3, true);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field3361.field4801.method3029(-28), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field3361.method1990(false, 0);
            this.field2764 = true;
        } else {
            super.field3361.method1994(0, 770, 34168, 8960);
        }
        if (arg1 < 83) {
            this.method742(-18, (class128) null, -27);
        }
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lpg;)V")
    public class188(class333 arg0) {
        super(arg0);
        if (arg0.field4805) {
            this.field2768 = new class365(arg0, 2);
            this.field2768.method2185(-84, 0);
            super.field3361.method1990(false, 1);
            super.field3361.method2023(34165, 7681, 2929);
            super.field3361.method2040(false, 2, 770, 34168);
            super.field3361.method1994(0, 770, 34167, 8960);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field3361.method1990(false, 0);
            this.field2768.method2186((byte) -104);
            this.field2768.method2185(-119, 1);
            super.field3361.method1990(false, 1);
            super.field3361.method2023(8448, 8448, 2929);
            super.field3361.method2040(false, 2, 770, 34166);
            super.field3361.method1994(0, 770, 5890, 8960);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field3361.method1990(false, 0);
            this.field2768.method2186((byte) -101);
        }
    }
}
