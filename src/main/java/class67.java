import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class67 extends class339 {

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "Lbv;")
    private class282 field925;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "Llr;")
    private class237 field924;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "Lpg;")
    public static class492 field920 = new class492(30, 12);

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "Lkh;")
    public static class250 field923;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)I", line = 6)
    public final int method442(int arg0) {
        if (arg0 != 17061) {
            this.field925 = null;
        }
        field922++;
        return this.field924.field3374;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V", line = 25)
    public static void method443(boolean arg0) {
        field920 = null;
        field923 = null;
        if (!arg0) {
            method443(true);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Llr;FLlr;I)Z", line = 38)
    public final boolean method444(class237 arg0, float arg1, class237 arg2, int arg3) {
        field921++;
        boolean var5 = true;
        class317 var6 = this.field925.field4180;
        class317 var7 = this.field925.field4126;
        if (this.field925.field4161.field5980 != arg2.field3374 || this.field925.field4161.field5979 != arg2.field3374) {
            this.field925.field4161 = new class393(this.field925, 3553, 6408, arg2.field3374, arg2.field3374);
        }
        if (this.field925.field4210.field5980 != arg0.field3374 || this.field925.field4210.field5979 != arg0.field3374) {
            this.field925.field4210 = new class393(this.field925, 3553, 6408, arg0.field3374, arg0.field3374);
        }
        this.field925.method1048(class229.field3279);
        this.field925.method1107();
        this.field925.method1813((byte) 121);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field924.field3374, this.field924.field3374);
        this.field925.method1831(false, true);
        this.field925.method1823(-23419, false);
        this.field925.method1801((byte) -123, false);
        this.field925.method1827(false, -27);
        this.field925.method1811(-2, (byte) -87);
        this.field925.method1819(1, (byte) 93);
        this.field925.method1835(0.0F, 0.0F, 0.0F, arg1, -98);
        this.field925.method1776(-30, 34165, 34165);
        this.field925.method1787(null, (byte) 121);
        this.field925.method1819(0, (byte) 101);
        this.field925.method1794(1, 125);
        this.field925.method1787(null, (byte) 121);
        int var8 = 0;
        while (var8 < 6) {
            int var9 = var8 + 34069;
            this.field925.method1777((byte) -111, var6);
            var6.method2060(var9, arg2, 0, (byte) 58);
            this.field925.method1772((byte) 57, var7);
            var7.method2057(0, -122, this.field925.field4161);
            if (var6.method2063(-16436) && var7.method2063(-16436)) {
                OpenGL.glBlitFramebufferEXT(0, 0, arg2.field3374, arg2.field3374, 0, 0, arg2.field3374, arg2.field3374, 16384, 9728);
                var6.method2060(var9, arg0, 0, (byte) -77);
                var7.method2057(0, 73, this.field925.field4210);
                if (var6.method2063(-16436) && var7.method2063(-16436)) {
                    OpenGL.glBlitFramebufferEXT(0, 0, arg2.field3374, arg2.field3374, 0, 0, arg2.field3374, arg2.field3374, 16384, 9728);
                    var6.method2066((byte) 23, 0);
                    this.field925.method1822(var6, 48);
                    var7.method2066((byte) 23, 0);
                    this.field925.method1771(var7, 0);
                    this.field925.method1843(-90, var6);
                    var6.method2060(var9, this.field924, 0, (byte) 70);
                    if (!var6.method2063(-16436)) {
                        var6.method2066((byte) 23, 0);
                        this.field925.method1779(var6, true);
                        var5 = false;
                        break;
                    }
                    this.field925.method1819(1, (byte) 104);
                    this.field925.method1787(this.field925.field4210, (byte) 121);
                    this.field925.method1819(0, (byte) 118);
                    this.field925.method1787(this.field925.field4161, (byte) 121);
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
                    this.field925.method1819(1, (byte) 94);
                    this.field925.method1787(null, (byte) 121);
                    this.field925.method1819(0, (byte) 99);
                    this.field925.method1787(null, (byte) 121);
                    var6.method2066((byte) 23, 0);
                    this.field925.method1779(var6, true);
                    var8++;
                    continue;
                }
                var6.method2066((byte) 23, 0);
                this.field925.method1822(var6, 123);
                var7.method2066((byte) 23, 0);
                var5 = false;
                this.field925.method1771(var7, 0);
                break;
            }
            var6.method2066((byte) 23, 0);
            this.field925.method1822(var6, 100);
            var7.method2066((byte) 23, 0);
            var5 = false;
            this.field925.method1771(var7, 0);
            break;
        }
        int var10 = 35 % ((-arg3 - 74) / 40);
        this.field925.method1819(1, (byte) 95);
        this.field925.method1776(-30, 8448, 8448);
        this.field925.method1819(0, (byte) 123);
        OpenGL.glPopAttrib();
        this.field925.method1046(class229.field3279[0], class229.field3279[1], class229.field3279[2], class229.field3279[3]);
        if (var5) {
            this.field924.method124(124);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)Llr;", line = 175)
    public final class237 method445(byte arg0) {
        field918++;
        if (arg0 < 68) {
            field920 = null;
        }
        return this.field924;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lbv;I)V", line = 185)
    public class67(class282 arg0, int arg1) {
        this.field925 = arg0;
        this.field924 = new class237(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)V", line = 194)
    public static final void method446(byte arg0) {
        field919++;
        int var1 = 0;
        if (class96.field1399.method2171(class441.field6563, 121)) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (!class96.field1399.field5209) {
            var1 |= 0x40;
        }
        class209.method1448(var1, false);
        class56.field755.method2028(var1, 16383);
        class84.field1154.method2445(36, var1);
        class410.field6175.method1220(var1, (byte) 12);
        class275.field3826.method106(var1, -1);
        class454.method2735(var1, false);
        class87.method566(false, var1);
        class128.method817(1, var1);
        class7.method70((byte) 107, var1);
        if (arg0 >= -20) {
            return;
        }
        if (class144.field2077 == 10) {
            class524.method3106(28, (byte) 110);
        } else if (class144.field2077 == 30) {
            class524.method3106(25, (byte) 95);
        }
    }
}
