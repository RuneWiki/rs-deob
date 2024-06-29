import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class409 extends class265 {

    @OriginalMember(owner = "client!ht", name = "u", descriptor = "Lfd;")
    private class365 field6083;

    @OriginalMember(owner = "client!ht", name = "x", descriptor = "Lim;")
    private class401 field6086;

    @OriginalMember(owner = "client!ht", name = "y", descriptor = "[I")
    public static int[] field6087;

    @OriginalMember(owner = "client!ht", name = "t", descriptor = "I")
    public static int field6082;

    @OriginalMember(owner = "client!ht", name = "v", descriptor = "I")
    public static int field6084;

    @OriginalMember(owner = "client!ht", name = "w", descriptor = "I")
    public static int field6085;

    @OriginalMember(owner = "client!ht", name = "z", descriptor = "I")
    public static int field6088;

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(I)V")
    public static void method2505(int arg0) {
        field6087 = null;
        if (arg0 != 33985) {
            method2507(49, -70);
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)Lim;")
    public final class401 method1708(int arg0) {
        if (arg0 != 2) {
            this.field6083 = null;
        }
        field6082++;
        return this.field6086;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lim;FLim;I)Z")
    public final boolean method2506(class401 arg0, float arg1, class401 arg2, int arg3) {
        field6085++;
        boolean var5 = true;
        class264 var6 = this.field6083.field5429;
        class264 var7 = this.field6083.field5391;
        if (this.field6083.field5366.field4296 != arg2.field5948 || this.field6083.field5366.field4288 != arg2.field5948) {
            this.field6083.field5366 = new class299(this.field6083, 3553, 6408, arg2.field5948, arg2.field5948);
        }
        if (this.field6083.field5356.field4296 != arg0.field5948 || this.field6083.field5356.field4288 != arg0.field5948) {
            this.field6083.field5356 = new class299(this.field6083, 3553, 6408, arg0.field5948, arg0.field5948);
        }
        this.field6083.method332(class501.field7426);
        this.field6083.method339();
        this.field6083.method2181(true);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field6086.field5948, this.field6086.field5948);
        this.field6083.method2201(false, 0);
        this.field6083.method2189(false, arg3 - 49);
        this.field6083.method2234(false, (byte) 85);
        this.field6083.method2194(arg3 - 32, false);
        this.field6083.method2240(false, -2);
        this.field6083.method2219(1, -122);
        this.field6083.method2196(true, 0.0F, arg1, 0.0F, 0.0F);
        this.field6083.method2195(34165, 34165, true);
        this.field6083.method2188((byte) 78, null);
        this.field6083.method2219(0, -128);
        this.field6083.method2183(7681, 1);
        this.field6083.method2188((byte) 78, null);
        int var8 = arg3;
        while (var8 < 6) {
            this.field6083.method2223((byte) 79, var6);
            int var9 = var8 + 34069;
            var6.method1704(0, -1, arg2, var9);
            this.field6083.method2239(var7, (byte) 54);
            var7.method1707((byte) 76, this.field6083.field5366, 0);
            if (var6.method1698(-36054) && var7.method1698(-36054)) {
                OpenGL.glBlitFramebufferEXT(0, 0, arg2.field5948, arg2.field5948, 0, 0, arg2.field5948, arg2.field5948, 16384, 9728);
                var6.method1704(0, -1, arg0, var9);
                var7.method1707((byte) 76, this.field6083.field5356, 0);
                if (var6.method1698(-36054) && var7.method1698(arg3 ^ 0xFFFF732A)) {
                    OpenGL.glBlitFramebufferEXT(0, 0, arg2.field5948, arg2.field5948, 0, 0, arg2.field5948, arg2.field5948, 16384, 9728);
                    var6.method1691(0, -101);
                    this.field6083.method2218(false, var6);
                    var7.method1691(0, 126);
                    this.field6083.method2232(var7, (byte) -45);
                    this.field6083.method2205(var6, (byte) -101);
                    var6.method1704(0, -1, this.field6086, var9);
                    if (!var6.method1698(-36054)) {
                        var6.method1691(0, arg3 ^ 0x7F);
                        var5 = false;
                        this.field6083.method2254(var6, 49);
                        break;
                    }
                    this.field6083.method2219(1, arg3 - 126);
                    this.field6083.method2188((byte) 78, this.field6083.field5356);
                    this.field6083.method2219(0, arg3 ^ 0xFFFFFF81);
                    this.field6083.method2188((byte) 78, this.field6083.field5366);
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
                    this.field6083.method2219(1, -128);
                    this.field6083.method2188((byte) 78, null);
                    this.field6083.method2219(0, arg3 ^ 0xFFFFFF80);
                    this.field6083.method2188((byte) 78, null);
                    var6.method1691(0, arg3 ^ 0x6D);
                    this.field6083.method2254(var6, 35);
                    var8++;
                    continue;
                }
                var6.method1691(0, 88);
                this.field6083.method2218(false, var6);
                var7.method1691(0, 126);
                var5 = false;
                this.field6083.method2232(var7, (byte) -45);
                break;
            }
            var6.method1691(0, 90);
            this.field6083.method2218(false, var6);
            var7.method1691(0, -117);
            this.field6083.method2232(var7, (byte) -45);
            var5 = false;
            break;
        }
        this.field6083.method2219(1, -123);
        this.field6083.method2195(8448, 8448, true);
        this.field6083.method2219(0, -120);
        OpenGL.glPopAttrib();
        this.field6083.method380(class501.field7426[0], class501.field7426[1], class501.field7426[2], class501.field7426[3]);
        if (var5) {
            this.field6086.method2429(-109);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)V")
    public static final void method2507(int arg0, int arg1) {
        if (arg0 != 0) {
            method2507(29, -64);
        }
        field6084++;
        class215 var2 = class171.method1208(arg1, (byte) 124, 10);
        var2.method1469((byte) -52);
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Lfd;I)V")
    public class409(class365 arg0, int arg1) {
        this.field6083 = arg0;
        this.field6086 = new class401(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "(Z)I")
    public final int method2508(boolean arg0) {
        if (arg0) {
            return -34;
        } else {
            field6088++;
            return this.field6086.field5948;
        }
    }

    static {
        new class331("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
        field6087 = new int[2];
    }
}
