import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class357 extends class111 {

    @OriginalMember(owner = "client!we", name = "l", descriptor = "Lep;")
    private class371 field4581;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "Lrh;")
    private class633 field4583;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "[I")
    public static int[] field4584 = new int[8];

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lrh;Lrh;BF)Z", line = 3)
    public final boolean method2017(class633 arg0, class633 arg1, byte arg2, float arg3) {
        field4580++;
        boolean var5 = true;
        class564 var6 = this.field4581.field5040;
        this.field4581.method2163(class619.field8804);
        this.field4581.method2198();
        this.field4581.method2111(-12787);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        int var7 = -30 % ((64 - arg2) / 36);
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field4583.field9009, this.field4583.field9009);
        this.field4581.method2150(false, 0);
        this.field4581.method2197(false, (byte) -88);
        this.field4581.method2204(false, false);
        this.field4581.method2192(-104, false);
        this.field4581.method2103((byte) -107, -2);
        this.field4581.method2196(1, (byte) 89);
        this.field4581.method2155(0.0F, 0.0F, 0.0F, 93, arg3);
        this.field4581.method2207(34165, 34165, -25248);
        this.field4581.method2154(arg1, -2);
        this.field4581.method2196(0, (byte) 89);
        this.field4581.method2208(1, 6406);
        this.field4581.method2154(arg0, -2);
        this.field4581.method2182(var6, (byte) -107);
        for (int var8 = 0; var8 < 6; var8++) {
            int var9 = var8 + 34069;
            var6.method3369(var9, -103, this.field4583, 0);
            var6.method3375(2, 0);
            if (!var6.method3377(97)) {
                var5 = false;
                break;
            }
            OpenGL.glBegin(7);
            if (var9 == 34069) {
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
            } else if (var9 == 34070) {
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
            } else if (var9 == 34071) {
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
            } else if (var9 == 34072) {
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
            } else if (var9 == 34073) {
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
            } else if (var9 == 34074) {
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
        var6.method3372(0, 36009);
        this.field4581.method2142((byte) -77, var6);
        this.field4581.method2196(1, (byte) 89);
        this.field4581.method2154(null, -2);
        this.field4581.method2207(8448, 8448, -25248);
        this.field4581.method2196(0, (byte) 89);
        this.field4581.method2154(null, -2);
        OpenGL.glPopAttrib();
        this.field4581.method2097(class619.field8804[0], class619.field8804[1], class619.field8804[2], class619.field8804[3]);
        if (var5 && !this.field4581.field5066) {
            this.field4583.method2408((byte) -114);
        }
        return var5;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(I)I", line = 201)
    public final int method2018(int arg0) {
        if (arg0 != 65534) {
            method2019(-6, 74, -51);
        }
        field4582++;
        return this.field4583.field9009;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(III)Z", line = 214)
    public static final boolean method2019(int arg0, int arg1, int arg2) {
        field4585++;
        if (arg1 != 65534) {
            method2019(-12, -36, -26);
        }
        return (arg0 & 0x40000) != 0 | class41.method285(arg2, (byte) 37, arg0) || class164.method1020(arg1 ^ 0xFFFF0001, arg2, arg0);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)Lrh;", line = 225)
    public final class633 method748(int arg0) {
        field4586++;
        return arg0 == 8448 ? this.field4583 : null;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lep;I)V", line = 236)
    public class357(class371 arg0, int arg1) {
        this.field4581 = arg0;
        this.field4583 = new class633(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(I)V", line = 246)
    public static void method2020(int arg0) {
        field4584 = null;
        if (arg0 <= 55) {
            method2019(-109, -88, -80);
        }
    }
}
