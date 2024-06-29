import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class107 extends class93 {

    @OriginalMember(owner = "client!kt", name = "m", descriptor = "Lvj;")
    private class303 field1774;

    @OriginalMember(owner = "client!kt", name = "v", descriptor = "Lrd;")
    private class221 field1783;

    @OriginalMember(owner = "client!kt", name = "o", descriptor = "Lno;")
    public static class494 field1776 = new class494("", 17);

    @OriginalMember(owner = "client!kt", name = "s", descriptor = "[Z")
    public static boolean[] field1780 = new boolean[100];

    @OriginalMember(owner = "client!kt", name = "u", descriptor = "[I")
    public static int[] field1782 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!kt", name = "w", descriptor = "Liv;")
    public static class64 field1784;

    @OriginalMember(owner = "client!kt", name = "n", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!kt", name = "p", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!kt", name = "q", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!kt", name = "r", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!kt", name = "t", descriptor = "Lli;")
    public static class293 field1781;

    @OriginalMember(owner = "client!kt", name = "x", descriptor = "[I")
    public static int[] field1785;

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "(B)I")
    public final int method802(byte arg0) {
        field1778++;
        if (arg0 >= -85) {
            field1784 = null;
        }
        return this.field1783.field3173;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lcu;B)Ltm;")
    public static final class264 method803(class145 arg0, byte arg1) {
        field1779++;
        return arg1 > -62 ? null : new class264(arg0.method1122(65280), arg0.method1122(65280), arg0.method1122(65280), arg0.method1122(65280), arg0.method1085(-21), arg0.method1085(-48), arg0.method1063((byte) -86));
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Z)Lrd;")
    public final class221 method713(boolean arg0) {
        field1777++;
        if (arg0) {
            this.field1774 = null;
        }
        return this.field1783;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(BFLrd;Lrd;)Z")
    public final boolean method804(byte arg0, float arg1, class221 arg2, class221 arg3) {
        field1775++;
        boolean var5 = true;
        class240 var6 = this.field1774.field4625;
        class240 var7 = this.field1774.field4552;
        if (this.field1774.field4526.field4076 != arg2.field3173 || this.field1774.field4526.field4074 != arg2.field3173) {
            this.field1774.field4526 = new class286(this.field1774, 3553, 6408, arg2.field3173, arg2.field3173);
        }
        if (this.field1774.field4617.field4076 != arg3.field3173 || this.field1774.field4617.field4074 != arg3.field3173) {
            this.field1774.field4617 = new class286(this.field1774, 3553, 6408, arg3.field3173, arg3.field3173);
        }
        this.field1774.method251(class86.field1486);
        this.field1774.method258();
        this.field1774.method1937(arg0 ^ 0xFFFF891A);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field1783.field3173, this.field1783.field3173);
        this.field1774.method1943(false, (byte) -60);
        this.field1774.method1941(false, 21282);
        this.field1774.method1983(34161, false);
        this.field1774.method1984(100, false);
        if (arg0 != 37) {
            this.method713(false);
        }
        this.field1774.method1970(arg0 ^ 0x22, -2);
        this.field1774.method1929(1, (byte) 69);
        this.field1774.method1967(6406, 0.0F, arg1, 0.0F, 0.0F);
        this.field1774.method1951((byte) 89, 34165, 34165);
        this.field1774.method1990(null, 11864);
        this.field1774.method1929(0, (byte) 112);
        this.field1774.method1989(arg0 ^ 0xFFFFA18A, 1);
        this.field1774.method1990(null, 11864);
        int var8 = 0;
        while (var8 < 6) {
            this.field1774.method1923(var6, -5831);
            int var9 = var8 + 34069;
            var6.method1563(arg0 ^ 0xFFFFF727, var9, arg2, 0);
            this.field1774.method1924((byte) -82, var7);
            var7.method1574(0, (byte) 82, this.field1774.field4526);
            if (var6.method1567(22) && var7.method1567(-124)) {
                OpenGL.glBlitFramebufferEXT(0, 0, arg2.field3173, arg2.field3173, 0, 0, arg2.field3173, arg2.field3173, 16384, 9728);
                var6.method1563(-2302, var9, arg3, 0);
                var7.method1574(0, (byte) 90, this.field1774.field4617);
                if (var6.method1567(arg0 ^ 0xFFFFFFB0) && var7.method1567(-99)) {
                    OpenGL.glBlitFramebufferEXT(0, 0, arg2.field3173, arg2.field3173, 0, 0, arg2.field3173, arg2.field3173, 16384, 9728);
                    var6.method1564(0, 60);
                    this.field1774.method1960(4, var6);
                    var7.method1564(0, arg0 + 54);
                    this.field1774.method1935(arg0 ^ 0xFFFFFFDA, var7);
                    this.field1774.method1945(var6, false);
                    var6.method1563(-2302, var9, this.field1783, 0);
                    if (!var6.method1567(arg0 - 130)) {
                        var6.method1564(0, 59);
                        var5 = false;
                        this.field1774.method1916(var6, 117);
                        break;
                    }
                    this.field1774.method1929(1, (byte) 87);
                    this.field1774.method1990(this.field1774.field4617, 11864);
                    this.field1774.method1929(0, (byte) 89);
                    this.field1774.method1990(this.field1774.field4526, 11864);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2f(0.0F, 0.0F);
                    OpenGL.glTexCoord2f(1.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2f(1.0F, 0.0F);
                    OpenGL.glTexCoord2f(1.0F, 1.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2f(1.0F, 1.0F);
                    OpenGL.glTexCoord2f(0.0F, 1.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2f(0.0F, 1.0F);
                    OpenGL.glEnd();
                    this.field1774.method1929(1, (byte) 91);
                    this.field1774.method1990(null, arg0 ^ 0x2E7D);
                    this.field1774.method1929(0, (byte) 121);
                    this.field1774.method1990(null, arg0 + 11827);
                    var6.method1564(0, arg0 + 69);
                    this.field1774.method1916(var6, 120);
                    var8++;
                    continue;
                }
                var6.method1564(0, 105);
                this.field1774.method1960(4, var6);
                var7.method1564(0, arg0 ^ 0x4B);
                this.field1774.method1935(-1, var7);
                var5 = false;
                break;
            }
            var6.method1564(0, 123);
            this.field1774.method1960(4, var6);
            var7.method1564(0, 54);
            var5 = false;
            this.field1774.method1935(arg0 - 38, var7);
            break;
        }
        this.field1774.method1929(1, (byte) 103);
        this.field1774.method1951((byte) 120, 8448, 8448);
        this.field1774.method1929(0, (byte) 89);
        OpenGL.glPopAttrib();
        this.field1774.method298(class86.field1486[0], class86.field1486[1], class86.field1486[2], class86.field1486[3]);
        if (var5) {
            this.field1783.method2927((byte) -119);
        }
        return var5;
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lvj;I)V")
    public class107(class303 arg0, int arg1) {
        this.field1774 = arg0;
        this.field1783 = new class221(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "(B)V")
    public static void method805(byte arg0) {
        field1781 = null;
        field1784 = null;
        if (arg0 != -121) {
            method805((byte) -120);
        }
        field1780 = null;
        field1785 = null;
        field1782 = null;
        field1776 = null;
    }

    static {
        new class342("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
        field1784 = new class64(95, 2);
    }
}
