import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class107 extends class125 {

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "Z")
    private boolean field1454 = false;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "Lpb;")
    private class468 field1459;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "F")
    public static float field1451;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
    public final void method662(int arg0, int arg1, int arg2) {
        if (arg0 >= -35) {
            this.method669(-93, (class252) null, 66);
        }
        ++field1450;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(III)Lpj;")
    public static final class100 method663(int arg0, int arg1, int arg2) {
        class498 var3 = class186.field2421[arg0][arg1][arg2];
        return var3 == null ? null : var3.field7259;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "([Ljava/lang/Object;[JB)V")
    public static final void method664(Object[] arg0, long[] arg1, byte arg2) {
        if (arg2 < -75) {
            ++field1452;
            class392.method2370(arg0, arg1.length + -1, arg1, 0, -1);
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(ZI)V")
    public final void method665(boolean arg0, int arg1) {
        super.field1617.method2269(8448, 8960, 7681);
        if (arg1 > 92) {
            ++field1456;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)Z")
    public final boolean method666(int arg0) {
        ++field1455;
        int var2 = 19 / ((11 - arg0) / 63);
        return true;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
    public final void method667(int arg0) {
        if (arg0 != -18112) {
            this.method666(14);
        }
        ++field1458;
        if (this.field1454) {
            this.field1459.method2856('\u0001', arg0 + 18113);
            super.field1617.method2250((byte) 56, 1);
            super.field1617.method2236((class252) null, -63);
            super.field1617.method2250((byte) 75, 0);
        } else {
            super.field1617.method2277((byte) -112, 770, 0, 5890);
        }
        super.field1617.method2269(8448, arg0 + 27072, 8448);
        this.field1454 = false;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lur;)V")
    public class107(class377 arg0) {
        super(arg0);
        if (arg0.field5430) {
            this.field1459 = new class468(arg0, 2);
            this.field1459.method2854(-61, 0);
            super.field1617.method2250((byte) 80, 1);
            super.field1617.method2269(34165, 8960, 7681);
            super.field1617.method2229(34168, (byte) -18, 2, 770);
            super.field1617.method2277((byte) 15, 770, 0, 34167);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field1617.method2250((byte) 65, 0);
            this.field1459.method2855(22228);
            this.field1459.method2854(-45, 1);
            super.field1617.method2250((byte) 82, 1);
            super.field1617.method2269(8448, 8960, 8448);
            super.field1617.method2229(34166, (byte) -18, 2, 770);
            super.field1617.method2277((byte) 98, 770, 0, 5890);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field1617.method2250((byte) 64, 0);
            this.field1459.method2855(22228);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZI)V")
    public final void method668(boolean arg0, int arg1) {
        if (arg1 != 0) {
            field1451 = 0.60307723F;
        }
        ++field1457;
        class139 var3 = super.field1617.method2268(30323);
        if (this.field1459 != null && var3 != null && arg0) {
            this.field1459.method2856('\u0000', 1);
            super.field1617.method2250((byte) 51, 1);
            super.field1617.method2236(var3, -71);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field1617.field5346.method1591(true), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field1617.method2250((byte) 51, 0);
            this.field1454 = true;
        } else {
            super.field1617.method2277((byte) -122, 770, 0, 34168);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILhe;I)V")
    public final void method669(int arg0, class252 arg1, int arg2) {
        super.field1617.method2236(arg1, -107);
        ++field1453;
        super.field1617.method2260(16640, arg2);
        if (arg0 != 67) {
            this.field1454 = false;
        }
    }
}
