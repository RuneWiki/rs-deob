import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class21 extends class76 {

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "Lck;")
    private class733 field191;

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "Lmaa;")
    private class528 field197;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "[C")
    public static char[] field196 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "[Laca;")
    public static class230[] field199 = new class230[0];

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "Lhv;")
    public static class151 field195 = new class151();

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(B)I", line = 3)
    public final int method92(byte arg0) {
        field198++;
        return arg0 < 10 ? -61 : this.field197.field6706;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)V", line = 16)
    public static void method93(boolean arg0) {
        field199 = null;
        field195 = null;
        field196 = null;
        if (!arg0) {
            method95(-106);
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)Lmaa;", line = 28)
    public final class528 method94(byte arg0) {
        int var2 = 53 / ((arg0 + 22) / 63);
        field192++;
        return this.field197;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V", line = 39)
    public static final void method95(int arg0) {
        if (arg0 == -65535) {
            field193++;
            class206.field2838.method2617(28812);
            class611.field7716.method2617(28812);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IFLmaa;Lmaa;)Z", line = 58)
    public final boolean method96(int arg0, float arg1, class528 arg2, class528 arg3) {
        field194++;
        boolean var5 = true;
        class39 var6 = this.field191.field9942;
        this.field191.method924(class682.field8799);
        this.field191.method957();
        this.field191.method3927(4733);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field197.field6706, this.field197.field6706);
        this.field191.method3923(-32, false);
        this.field191.method3974(false, arg0 ^ 0x40EE);
        this.field191.method3978(false, (byte) 126);
        this.field191.method3986((byte) -124, false);
        this.field191.method3935(-2, (byte) -42);
        this.field191.method3945(1, false);
        this.field191.method3965(0.0F, 0.0F, arg1, 0.0F, arg0 - 16619);
        this.field191.method3917(82, 34165, 34165);
        this.field191.method3975((byte) 120, arg2);
        this.field191.method3945(0, false);
        this.field191.method3979((byte) -96, 1);
        this.field191.method3975((byte) 119, arg3);
        this.field191.method3988(var6, -113);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method246(this.field197, var8, arg0 - 16680, 0);
            var6.method237((byte) -127, 0);
            if (!var6.method234(-56)) {
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
        var6.method236(0, -3);
        this.field191.method3918(4609, var6);
        this.field191.method3945(1, false);
        this.field191.method3975((byte) 121, null);
        this.field191.method3917(arg0 - 16595, 8448, 8448);
        this.field191.method3945(0, false);
        if (arg0 != 16619) {
            return true;
        }
        this.field191.method3975((byte) 126, null);
        OpenGL.glPopAttrib();
        this.field191.method915(class682.field8799[0], class682.field8799[1], class682.field8799[2], class682.field8799[3]);
        if (var5 && !this.field191.field9900) {
            this.field197.method752(Integer.MAX_VALUE);
        }
        return var5;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lck;I)V", line = 256)
    public class21(class733 arg0, int arg1) {
        this.field191 = arg0;
        this.field197 = new class528(arg0, 6408, arg1);
    }
}
