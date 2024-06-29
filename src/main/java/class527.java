import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class527 extends class274 {

    @OriginalMember(owner = "client!lr", name = "k", descriptor = "Lef;")
    private class338 field7797;

    @OriginalMember(owner = "client!lr", name = "o", descriptor = "Lvg;")
    private class39 field7801;

    @OriginalMember(owner = "client!lr", name = "m", descriptor = "I")
    public static int field7799 = 104;

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "I")
    public static int field7795;

    @OriginalMember(owner = "client!lr", name = "l", descriptor = "I")
    public static int field7798;

    @OriginalMember(owner = "client!lr", name = "n", descriptor = "I")
    public static int field7800;

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "Lmg;")
    public static class101 field7794;

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "[Lwq;")
    public static class114[] field7796;

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "(I)V")
    public static void method3130(int arg0) {
        field7796 = null;
        field7794 = null;
        if (arg0 != 1) {
            field7794 = null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(B)I")
    public final int method3131(byte arg0) {
        field7800++;
        return arg0 > -53 ? 14 : this.field7801.field490;
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)Lvg;")
    public final class39 method1628(int arg0) {
        field7795++;
        if (arg0 <= 44) {
            this.field7801 = null;
        }
        return this.field7801;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lvg;ILvg;F)Z")
    public final boolean method3132(class39 arg0, int arg1, class39 arg2, float arg3) {
        field7798++;
        boolean var5 = true;
        class276 var6 = this.field7797.field4776;
        class276 var7 = this.field7797.field4801;
        if (this.field7797.field4881.field3641 != arg0.field490 || this.field7797.field4881.field3645 != arg0.field490) {
            this.field7797.field4881 = new class264(this.field7797, 3553, 6408, arg0.field490, arg0.field490);
        }
        if (this.field7797.field4878.field3641 != arg2.field490 || this.field7797.field4878.field3645 != arg2.field490) {
            this.field7797.field4878 = new class264(this.field7797, 3553, 6408, arg2.field490, arg2.field490);
        }
        this.field7797.method234(class94.field1445);
        this.field7797.method260();
        this.field7797.method1964(107);
        OpenGL.glMatrixMode(5889);
        int var8 = 69 / ((arg1 - 77) / 41);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field7801.field490, this.field7801.field490);
        this.field7797.method1932(false, -32);
        this.field7797.method1937(false, -125);
        this.field7797.method1938(34160, false);
        this.field7797.method1985(false, (byte) -86);
        this.field7797.method1944(-2, 12429);
        this.field7797.method1950(-29847, 1);
        this.field7797.method1971(arg3, 0.0F, 0.0F, 0.0F, 17670);
        this.field7797.method1963(true, 34165, 34165);
        this.field7797.method1996(2, null);
        this.field7797.method1950(-29847, 0);
        this.field7797.method1974(1, 4609);
        this.field7797.method1996(2, null);
        int var9 = 0;
        while (var9 < 6) {
            int var10 = var9 + 34069;
            this.field7797.method2001(125, var6);
            var6.method1634(var10, true, arg0, 0);
            this.field7797.method1983(var7, -71);
            var7.method1649(0, (byte) 17, this.field7797.field4881);
            if (var6.method1631(36053) && var7.method1631(36053)) {
                OpenGL.glBlitFramebufferEXT(0, 0, arg0.field490, arg0.field490, 0, 0, arg0.field490, arg0.field490, 16384, 9728);
                var6.method1634(var10, true, arg2, 0);
                var7.method1649(0, (byte) 17, this.field7797.field4878);
                if (var6.method1631(36053) && var7.method1631(36053)) {
                    OpenGL.glBlitFramebufferEXT(0, 0, arg0.field490, arg0.field490, 0, 0, arg0.field490, arg0.field490, 16384, 9728);
                    var6.method1637(121, 0);
                    this.field7797.method1994(5890, var6);
                    var7.method1637(120, 0);
                    this.field7797.method1952(false, var7);
                    this.field7797.method1939(var6, (byte) 80);
                    var6.method1634(var10, true, this.field7801, 0);
                    if (!var6.method1631(36053)) {
                        var6.method1637(119, 0);
                        this.field7797.method2009(var6, 0);
                        var5 = false;
                        break;
                    }
                    this.field7797.method1950(-29847, 1);
                    this.field7797.method1996(2, this.field7797.field4878);
                    this.field7797.method1950(-29847, 0);
                    this.field7797.method1996(2, this.field7797.field4881);
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
                    this.field7797.method1950(-29847, 1);
                    this.field7797.method1996(2, null);
                    this.field7797.method1950(-29847, 0);
                    this.field7797.method1996(2, null);
                    var6.method1637(65, 0);
                    this.field7797.method2009(var6, 0);
                    var9++;
                    continue;
                }
                var6.method1637(92, 0);
                this.field7797.method1994(5890, var6);
                var7.method1637(87, 0);
                var5 = false;
                this.field7797.method1952(false, var7);
                break;
            }
            var6.method1637(107, 0);
            this.field7797.method1994(5890, var6);
            var7.method1637(72, 0);
            this.field7797.method1952(false, var7);
            var5 = false;
            break;
        }
        this.field7797.method1950(-29847, 1);
        this.field7797.method1963(true, 8448, 8448);
        this.field7797.method1950(-29847, 0);
        OpenGL.glPopAttrib();
        this.field7797.method279(class94.field1445[0], class94.field1445[1], class94.field1445[2], class94.field1445[3]);
        if (var5) {
            this.field7801.method336(9323);
        }
        return var5;
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lef;I)V")
    public class527(class338 arg0, int arg1) {
        this.field7797 = arg0;
        this.field7801 = new class39(arg0, 6408, arg1);
    }
}
