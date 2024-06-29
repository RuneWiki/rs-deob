import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class136 extends class261 {

    @OriginalMember(owner = "client!km", name = "k", descriptor = "Z")
    private boolean field2299 = false;

    @OriginalMember(owner = "client!km", name = "p", descriptor = "Lcs;")
    private class426 field2304;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "Lvv;")
    public static class313 field2296 = new class313(27, 1);

    @OriginalMember(owner = "client!km", name = "i", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!km", name = "m", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!km", name = "n", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!km", name = "q", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!km", name = "o", descriptor = "Lqm;")
    public static class331 field2303;

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lih;)V", line = 3)
    public class136(class214 arg0) {
        super(arg0);
        if (arg0.field3633) {
            this.field2304 = new class426(arg0, 2);
            this.field2304.method2604(14, 0);
            super.field4358.method1440(1, 0);
            super.field4358.method1482(34165, 8960, 7681);
            super.field4358.method1474(2, 34168, -5000, 770);
            super.field4358.method1484(34167, 0, 770, 34184);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field4358.method1440(0, 0);
            this.field2304.method2601((byte) 122);
            this.field2304.method2604(14, 1);
            super.field4358.method1440(1, 0);
            super.field4358.method1482(8448, 8960, 8448);
            super.field4358.method1474(2, 34166, -5000, 770);
            super.field4358.method1484(5890, 0, 770, 34184);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field4358.method1440(0, 0);
            this.field2304.method2601((byte) 122);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ZB)V", line = 43)
    public final void method1020(boolean arg0, byte arg1) {
        ++field2302;
        if (arg1 >= 23) {
            class358 var3 = super.field4358.method1435(false);
            if (this.field2304 != null && var3 != null && arg0) {
                this.field2304.method2603('\u0000', -17213);
                super.field4358.method1440(1, 0);
                super.field4358.method1471(true, var3);
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadMatrixf(super.field4358.field3675.method1680(13528), 0);
                OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
                OpenGL.glMatrixMode(5888);
                super.field4358.method1440(0, 0);
                this.field2299 = true;
            } else {
                super.field4358.method1484(34168, 0, 770, 34184);
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(III)V", line = 70)
    public final void method1021(int arg0, int arg1, int arg2) {
        int var4 = -100 % ((arg1 - 82) / 41);
        ++field2297;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IZ)V", line = 85)
    public final void method1022(int arg0, boolean arg1) {
        int var3 = 113 / ((arg0 - 87) / 37);
        ++field2298;
        super.field4358.method1482(8448, 8960, 7681);
    }

    @OriginalMember(owner = "client!km", name = "d", descriptor = "(I)V", line = 101)
    public final void method1023(int arg0) {
        ++field2300;
        if (!this.field2299) {
            super.field4358.method1484(5890, 0, 770, 34184);
        } else {
            this.field2304.method2603('\u0001', -17213);
            super.field4358.method1440(1, 0);
            super.field4358.method1471(true, (class179) null);
            super.field4358.method1440(0, 0);
        }
        super.field4358.method1482(8448, 8960, 8448);
        this.field2299 = false;
        if (arg0 != 5000) {
            method1027(27, 69, 41);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IILkk;)V", line = 126)
    public final void method1024(int arg0, int arg1, class179 arg2) {
        super.field4358.method1471(true, arg2);
        ++field2305;
        super.field4358.method1410(arg0, 7681);
        int var4 = 81 % ((21 - arg1) / 36);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V", line = 137)
    public static void method1025(byte arg0) {
        field2303 = null;
        field2296 = null;
        if (arg0 != 30) {
            field2303 = null;
        }
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(I)Z", line = 152)
    public final boolean method1026(int arg0) {
        ++field2301;
        return arg0 >= 69;
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(III)Z", line = 166)
    public static final boolean method1027(int arg0, int arg1, int arg2) {
        int var3 = class76.field1314[arg0][arg1][arg2];
        if (-class290.field4726 == var3) {
            return false;
        } else if (class290.field4726 == var3) {
            return true;
        } else {
            int var4 = arg1 << class276.field4534;
            int var5 = arg2 << class276.field4534;
            if (class331.method2087(var4 + 1, class360.field5592[arg0].method1516(arg1, arg2), var5 + 1) && class331.method2087(class70.field1217 + var4 - 1, class360.field5592[arg0].method1516(arg1 + 1, arg2), var5 + 1) && class331.method2087(class70.field1217 + var4 - 1, class360.field5592[arg0].method1516(arg1 + 1, arg2 + 1), class70.field1217 + var5 - 1) && class331.method2087(var4 + 1, class360.field5592[arg0].method1516(arg1, arg2 + 1), class70.field1217 + var5 - 1) && class331.method2087(class331.field5211 + var4, class360.field5592[arg0].method1516(arg1, arg2), var5 + 1) && class331.method2087(class70.field1217 + var4 - 1, class360.field5592[arg0].method1516(arg1 + 1, arg2), class331.field5211 + var5) && class331.method2087(class331.field5211 + var4, class360.field5592[arg0].method1516(arg1, arg2 + 1), class70.field1217 + var5 - 1) && class331.method2087(class70.field1217 + var4 - 1, class360.field5592[arg0].method1516(arg1, arg2), class331.field5211 + var5) && class331.method2087(class331.field5211 + var4, class360.field5592[arg0].method1516(arg1, arg2), class331.field5211 + var5)) {
                class76.field1314[arg0][arg1][arg2] = class290.field4726;
                return true;
            } else {
                class76.field1314[arg0][arg1][arg2] = -class290.field4726;
                return false;
            }
        }
    }
}
