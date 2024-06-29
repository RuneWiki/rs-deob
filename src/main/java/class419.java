import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class419 extends class100 {

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "Lht;")
    private class410 field6123;

    @OriginalMember(owner = "client!kq", name = "n", descriptor = "Lil;")
    private class7 field6128;

    @OriginalMember(owner = "client!kq", name = "m", descriptor = "J")
    public static long field6127 = 0L;

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "I")
    public static int field6121;

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!kq", name = "j", descriptor = "I")
    public static int field6124;

    @OriginalMember(owner = "client!kq", name = "k", descriptor = "I")
    public static int field6125;

    @OriginalMember(owner = "client!kq", name = "l", descriptor = "I")
    public static int field6126;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IFLil;Lil;)Z", line = 5)
    public final boolean method2509(int arg0, float arg1, class7 arg2, class7 arg3) {
        field6122++;
        boolean var5 = true;
        class527 var6 = this.field6123.field5958;
        class527 var7 = this.field6123.field5985;
        if (this.field6123.field5982.field4219 != arg3.field71 || this.field6123.field5982.field4220 != arg3.field71) {
            this.field6123.field5982 = new class308(this.field6123, 3553, 6408, arg3.field71, arg3.field71);
        }
        if (this.field6123.field5966.field4219 != arg2.field71 || this.field6123.field5966.field4220 != arg2.field71) {
            this.field6123.field5966 = new class308(this.field6123, 3553, 6408, arg2.field71, arg2.field71);
        }
        this.field6123.method514(class154.field2216);
        this.field6123.method526();
        this.field6123.method2404(-74);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field6128.field71, this.field6128.field71);
        this.field6123.method2395(74, false);
        this.field6123.method2433(false, (byte) 117);
        this.field6123.method2411(10217, false);
        this.field6123.method2431(false, arg0 ^ 0xFFFF8C34);
        this.field6123.method2366(-2, 1874);
        this.field6123.method2398(1, (byte) 121);
        if (arg0 != 2060) {
            this.field6128 = null;
        }
        this.field6123.method2374(arg1, 0.0F, 0.0F, 0.0F, 127);
        this.field6123.method2383(34165, 78, 34165);
        this.field6123.method2412((byte) 4, null);
        this.field6123.method2398(0, (byte) 122);
        this.field6123.method2365(true, 1);
        this.field6123.method2412((byte) 4, null);
        int var8 = 0;
        while (var8 < 6) {
            int var9 = var8 + 34069;
            this.field6123.method2367((byte) 21, var6);
            var6.method3094(arg0 ^ 0x869, var9, arg3, 0);
            this.field6123.method2422(true, var7);
            var7.method3097(this.field6123.field5982, 0, (byte) -127);
            if (var6.method3096((byte) 121) && var7.method3096((byte) 124)) {
                OpenGL.glBlitFramebufferEXT(0, 0, arg3.field71, arg3.field71, 0, 0, arg3.field71, arg3.field71, 16384, 9728);
                var6.method3094(86, var9, arg2, 0);
                var7.method3097(this.field6123.field5966, 0, (byte) -126);
                if (var6.method3096((byte) 119) && var7.method3096((byte) 7)) {
                    OpenGL.glBlitFramebufferEXT(0, 0, arg3.field71, arg3.field71, 0, 0, arg3.field71, arg3.field71, 16384, 9728);
                    var6.method3095(0, (byte) -17);
                    this.field6123.method2409(32718, var6);
                    var7.method3095(0, (byte) -17);
                    this.field6123.method2415((byte) -122, var7);
                    this.field6123.method2434(28, var6);
                    var6.method3094(110, var9, this.field6128, 0);
                    if (!var6.method3096((byte) 25)) {
                        var6.method3095(0, (byte) -17);
                        var5 = false;
                        this.field6123.method2425(var6, arg0 - 1992);
                        break;
                    }
                    this.field6123.method2398(1, (byte) -73);
                    this.field6123.method2412((byte) 4, this.field6123.field5966);
                    this.field6123.method2398(0, (byte) 115);
                    this.field6123.method2412((byte) 4, this.field6123.field5982);
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
                    this.field6123.method2398(1, (byte) 113);
                    this.field6123.method2412((byte) 4, null);
                    this.field6123.method2398(0, (byte) -96);
                    this.field6123.method2412((byte) 4, null);
                    var6.method3095(0, (byte) -17);
                    this.field6123.method2425(var6, arg0 - 2179);
                    var8++;
                    continue;
                }
                var6.method3095(0, (byte) -17);
                this.field6123.method2409(32718, var6);
                var7.method3095(0, (byte) -17);
                this.field6123.method2415((byte) -122, var7);
                var5 = false;
                break;
            }
            var6.method3095(0, (byte) -17);
            this.field6123.method2409(arg0 + 30658, var6);
            var7.method3095(0, (byte) -17);
            var5 = false;
            this.field6123.method2415((byte) -122, var7);
            break;
        }
        this.field6123.method2398(1, (byte) 118);
        this.field6123.method2383(8448, arg0 ^ 0x86D, 8448);
        this.field6123.method2398(0, (byte) -54);
        OpenGL.glPopAttrib();
        this.field6123.method462(class154.field2216[0], class154.field2216[1], class154.field2216[2], class154.field2216[3]);
        if (var5) {
            this.field6128.method1127((byte) -63);
        }
        return var5;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Z)I", line = 139)
    public final int method2510(boolean arg0) {
        field6124++;
        if (arg0) {
            field6127 = 124L;
        }
        return this.field6128.field71;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)Lil;", line = 155)
    public final class7 method665(int arg0) {
        if (arg0 == 26263) {
            field6121++;
            return this.field6128;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lht;I)V", line = 169)
    public class419(class410 arg0, int arg1) {
        this.field6123 = arg0;
        this.field6128 = new class7(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "([IIIII)V", line = 178)
    public static final void method2511(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field6126++;
        arg1--;
        int var12 = arg3 - 1;
        int var5 = var12 - 7;
        int var6 = -3 / ((27 - arg4) / 35);
        while (var5 > arg1) {
            int var7 = arg1 + 1;
            arg0[var7] = arg2;
            int var8 = var7 + 1;
            arg0[var8] = arg2;
            int var9 = var8 + 1;
            arg0[var9] = arg2;
            int var10 = var9 + 1;
            arg0[var10] = arg2;
            int var11 = var10 + 1;
            arg0[var11] = arg2;
            int var13 = var11 + 1;
            arg0[var13] = arg2;
            int var14 = var13 + 1;
            arg0[var14] = arg2;
            arg1 = var14 + 1;
            arg0[arg1] = arg2;
        }
        while (arg1 < var12) {
            arg1++;
            arg0[arg1] = arg2;
        }
    }
}
