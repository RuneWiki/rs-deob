import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class323 extends class403 {

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "Lpg;")
    private class333 field4427;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "Lgi;")
    private class490 field4432;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "Lrb;")
    public static class283 field4428 = new class283(56, 16);

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "Lsn;")
    public static class205 field4433 = new class205(8, 3);

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "Lpl;")
    public static class462 field4434 = new class462();

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "I")
    public static int field4435 = 0;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)V")
    public static void method1911(byte arg0) {
        field4428 = null;
        field4433 = null;
        field4434 = null;
        if (arg0 != 55) {
            method1913(46, null);
        }
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)I")
    public final int method1912(int arg0) {
        if (arg0 > -29) {
            return -53;
        } else {
            field4429++;
            return this.field4432.field7082;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILya;)V")
    public static final void method1913(int arg0, class11 arg1) {
        class492.field7122[arg0] = arg1;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(FBLgi;Lgi;)Z")
    public final boolean method1914(float arg0, byte arg1, class490 arg2, class490 arg3) {
        field4430++;
        boolean var5 = true;
        class60 var6 = this.field4427.field4823;
        this.field4427.method495(class439.field6325);
        this.field4427.method477();
        this.field4427.method2038(-385881688);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field4432.field7082, this.field4432.field7082);
        if (arg1 > -44) {
            return false;
        }
        this.field4427.method2020(98, false);
        this.field4427.method2036(30919, false);
        this.field4427.method2016(false, -95);
        this.field4427.method2025(-32, false);
        this.field4427.method1998(-2, (byte) -53);
        this.field4427.method1990(false, 1);
        this.field4427.method2007(0.0F, 0.0F, true, arg0, 0.0F);
        this.field4427.method2023(34165, 34165, 2929);
        this.field4427.method1977(arg3, true);
        this.field4427.method1990(false, 0);
        this.field4427.method1966(-1, 1);
        this.field4427.method1977(arg2, true);
        this.field4427.method2001(var6, 98);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method398((byte) -36, var8, 0, this.field4432);
            var6.method388(-119, 0);
            if (!var6.method401(-1)) {
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
        var6.method397(0, (byte) -81);
        this.field4427.method1970(var6, true);
        this.field4427.method1990(false, 1);
        this.field4427.method1977(null, true);
        this.field4427.method2023(8448, 8448, 2929);
        this.field4427.method1990(false, 0);
        this.field4427.method1977(null, true);
        OpenGL.glPopAttrib();
        this.field4427.method511(class439.field6325[0], class439.field6325[1], class439.field6325[2], class439.field6325[3]);
        if (var5 && !this.field4427.field4783) {
            this.field4432.method925(0);
        }
        return var5;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)Lgi;")
    public final class490 method1915(byte arg0) {
        if (arg0 < 95) {
            return null;
        } else {
            field4431++;
            return this.field4432;
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lpg;I)V")
    public class323(class333 arg0, int arg1) {
        this.field4427 = arg0;
        this.field4432 = new class490(arg0, 6408, arg1);
    }
}
