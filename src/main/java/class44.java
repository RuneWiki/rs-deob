import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class44 implements class67 {

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "Z")
    private boolean field904 = false;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    private int field916 = -1;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "Z")
    public static boolean field911 = false;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "Ljava/lang/String;")
    public static String field914 = "Checking for updates - ";

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "Lsf;")
    public static class124 field906 = new class124(64);

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lek;Z)V", line = 9)
    public static final void method369(class206 arg0, boolean arg1) {
        class76.field1373 = arg0;
        field910++;
        if (!arg1) {
            field906 = (class124) null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "()V", line = 23)
    public final void method222() {
        GL var1 = class241.field4012;
        field915++;
        if (this.field904) {
            var1.glCallList(this.field916 + 1);
            this.field904 = false;
        } else {
            var1.glTexEnvi(8960, 34184, 5890);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(CI)Z", line = 45)
    public static final boolean method370(char arg0, int arg1) {
        field908++;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != '\u0000') {
            int var2 = 0;
            char[] var3 = class57.field1144;
            while (var3.length > var2) {
                char var4 = var3[var2];
                if (arg0 == var4) {
                    return true;
                }
                var2++;
            }
        }
        return arg1 == 160 ? false : false;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZLek;)V", line = 80)
    public static final void method371(boolean arg0, class206 arg1) {
        field907++;
        if (class347.field5547) {
            return;
        }
        if (class241.field4016) {
            class337.method2373();
        } else {
            class270.method1888();
        }
        class135.field2319 = class232.method1619((byte) -90, class135.field2313, arg1);
        int var2 = class287.field4696;
        int var3 = var2 * 956 / 503;
        class135.field2319.method569((class133.field2287 - var3) / 2, 0, var3, var2);
        class7.field240 = class53.method463(arg1, (byte) -124, class257.field4201);
        class7.field240.method34(class133.field2287 / 2 - (class7.field240.field5229 / 2), 18);
        class347.field5547 = arg0;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V", line = 185)
    public class44() {
        if (class241.field3994) {
            GL var1 = class241.field4012;
            this.field916 = var1.glGenLists(2);
            var1.glNewList(this.field916, 4864);
            var1.glActiveTexture(33985);
            var1.glTexEnvi(8960, 34161, 34165);
            var1.glTexEnvi(8960, 34178, 34168);
            var1.glTexEnvi(8960, 34162, 7681);
            var1.glTexEnvi(8960, 34184, 34167);
            var1.glTexGeni(8192, 9472, 34066);
            var1.glTexGeni(8193, 9472, 34066);
            var1.glTexGeni(8194, 9472, 34066);
            var1.glEnable(3168);
            var1.glEnable(3169);
            var1.glEnable(3170);
            var1.glEnable(34067);
            var1.glActiveTexture(33984);
            var1.glEndList();
            var1.glNewList(this.field916 + 1, 4864);
            var1.glActiveTexture(33985);
            var1.glTexEnvi(8960, 34161, 8448);
            var1.glTexEnvi(8960, 34178, 34166);
            var1.glTexEnvi(8960, 34162, 8448);
            var1.glTexEnvi(8960, 34184, 5890);
            var1.glDisable(3168);
            var1.glDisable(3169);
            var1.glDisable(3170);
            var1.glDisable(34067);
            var1.glMatrixMode(5890);
            var1.glLoadIdentity();
            var1.glMatrixMode(5888);
            var1.glActiveTexture(33984);
            var1.glEndList();
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V", line = 113)
    public static void method372(int arg0) {
        field906 = null;
        if (arg0 >= 121) {
            field914 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V", line = 124)
    public final void method225(int arg0) {
        field909++;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "()V", line = 133)
    public final void method224() {
        field905++;
        GL var1 = class241.field4012;
        class241.method1718(1);
        if (class66.field1245 == null || this.field916 < 0 || !class281.field4606) {
            var1.glTexEnvi(8960, 34184, 34167);
            return;
        }
        var1.glCallList(this.field916);
        var1.glActiveTexture(33985);
        class66.field1245.method1844();
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glRotatef(-((float) class281.field4604 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
        var1.glRotatef(-((float) class49.field1023 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
        var1.glScalef(-1.0F, 1.0F, 1.0F);
        var1.glMatrixMode(5888);
        var1.glActiveTexture(33984);
        this.field904 = true;
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "()I", line = 165)
    public final int method226() {
        field912++;
        return 4;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I[BI)I", line = 176)
    public static final int method373(int arg0, byte[] arg1, int arg2) {
        field913++;
        if (arg0 != -11196) {
            field911 = true;
        }
        return class212.method1463(-50, arg2, 0, arg1);
    }
}
