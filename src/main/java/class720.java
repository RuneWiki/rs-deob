import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class720 extends class185 {

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "Lhk;")
    private class111 field9898;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "Lbja;")
    private class34 field9891;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
    public static int field9894 = 0;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
    public static int field9896 = 1408;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
    public static int field9892;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    public static int field9893;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "I")
    public static int field9897;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "I")
    public static int field9899;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "[I")
    public static int[] field9895;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)I")
    public final int method3993(byte arg0) {
        if (arg0 == -123) {
            field9892++;
            return this.field9891.field570;
        } else {
            return -43;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lbja;Lbja;IF)Z")
    public final boolean method3994(class34 arg0, class34 arg1, int arg2, float arg3) {
        field9893++;
        boolean var5 = true;
        class621 var6 = this.field9898.field1978;
        this.field9898.method580(class159.field2569);
        this.field9898.method575();
        this.field9898.method984(-20823);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field9891.field570, this.field9891.field570);
        this.field9898.method1000(-4180, false);
        this.field9898.method956(false, 91);
        this.field9898.method950(false, (byte) 75);
        this.field9898.method936(false, -128);
        this.field9898.method1006(1, -2);
        this.field9898.method1002(1, -5172);
        this.field9898.method970((byte) 117, 0.0F, 0.0F, 0.0F, arg3);
        this.field9898.method990(34165, 34165, -29641);
        this.field9898.method939(arg0, 8448);
        this.field9898.method1002(0, -5172);
        this.field9898.method999(true, 1);
        this.field9898.method939(arg1, 8448);
        int var7 = -23 % ((arg2 + 12) / 56);
        this.field9898.method934(false, var6);
        for (int var8 = 0; var8 < 6; var8++) {
            int var9 = var8 + 34069;
            var6.method3503(var9, 0, this.field9891, -81);
            var6.method3504(true, 0);
            if (!var6.method3497((byte) 101)) {
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
        var6.method3500((byte) 123, 0);
        this.field9898.method954(1, var6);
        this.field9898.method1002(1, -5172);
        this.field9898.method939(null, 8448);
        this.field9898.method990(8448, 8448, -29641);
        this.field9898.method1002(0, -5172);
        this.field9898.method939(null, 8448);
        OpenGL.glPopAttrib();
        this.field9898.method512(class159.field2569[0], class159.field2569[1], class159.field2569[2], class159.field2569[3]);
        if (var5 && !this.field9898.field1999) {
            this.field9891.method119((byte) -100);
        }
        return var5;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lfca;I)V")
    public static final void method3995(class93 arg0, int arg1) {
        field9899++;
        int var2 = arg0.method746(false);
        class753.field10401 = new class787[var2];
        if (arg1 != -34073) {
            method3995(null, -124);
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class753.field10401[var3] = new class787();
            class753.field10401[var3].field10802 = arg0.method746(false);
            class753.field10401[var3].field10800 = arg0.method795(-15475);
        }
        class305.field4190 = arg0.method746(false);
        class377.field5127 = arg0.method746(false);
        class686.field9541 = arg0.method746(false);
        class224.field3283 = new class732[class377.field5127 + 1 - class305.field4190];
        for (int var4 = 0; var4 < class686.field9541; var4++) {
            int var5 = arg0.method746(false);
            class732 var6 = class224.field3283[var5] = new class732();
            var6.field5319 = arg0.method793((byte) 24);
            var6.field5323 = arg0.method773(3);
            var6.field10096 = class305.field4190 + var5;
            var6.field10095 = arg0.method795(arg1 + 18598);
            var6.field10099 = arg0.method795(-15475);
        }
        class766.field10572 = arg0.method773(3);
        class397.field5480 = true;
    }

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "(I)V")
    public static void method3996(int arg0) {
        field9895 = null;
        if (arg0 != -65534) {
            method3995(null, 24);
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lhk;I)V")
    public class720(class111 arg0, int arg1) {
        this.field9898 = arg0;
        this.field9891 = new class34(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)Lbja;")
    public final class34 method1378(byte arg0) {
        int var2 = 33 / ((arg0 + 54) / 61);
        field9897++;
        return this.field9891;
    }
}
