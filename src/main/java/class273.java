import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class273 implements class18 {

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "Z")
    private boolean field3907 = false;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    private int field3915 = -1;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3909 = "Close";

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field3910 = 0;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "[S")
    public static short[] field3908 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "Z")
    public static boolean field3917 = false;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)V", line = 5)
    public static final void method1855(int arg0, int arg1, int arg2) {
        if (arg2 != -14327) {
            return;
        }
        field3911++;
        class54 var3 = class20.field221[class56.field724][arg0][arg1];
        if (var3 == null) {
            class291.method1997(class56.field724, arg0, arg1);
            return;
        }
        int var4 = -99999999;
        class248 var5 = (class248) var3.method413(1253231568);
        class248 var6 = null;
        while (var5 != null) {
            class362 var7 = class172.method1265(var5.field3610.field1813, (byte) -128);
            int var8 = var7.field5717;
            if (var7.field5685 == 1) {
                var8 = (var5.field3610.field1811 + 1) * var8;
            }
            if (var8 > var4) {
                var4 = var8;
                var6 = var5;
            }
            var5 = (class248) var3.method419(48);
        }
        if (var6 == null) {
            class291.method1997(class56.field724, arg0, arg1);
            return;
        }
        var3.method410(var6, (byte) -113);
        class248 var9 = (class248) var3.method413(1253231568);
        class133 var10 = null;
        class133 var11 = null;
        while (var9 != null) {
            class133 var12 = var9.field3610;
            if (var6.field3610.field1813 != var12.field1813) {
                if (var11 == null) {
                    var11 = var12;
                }
                if (var11.field1813 != var12.field1813 && var10 == null) {
                    var10 = var12;
                }
            }
            var9 = (class248) var3.method419(arg2 + 14431);
        }
        long var13 = (long) ((arg1 << 7) + arg0 + 1610612736);
        class193.method1399(class56.field724, arg0, arg1, class271.method1847(arg1 * 128 + 64, true, arg0 * 128 + 64, class56.field724), var6.field3610, var13, var11, var10);
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V", line = 86)
    public static final void method1856(int arg0) {
        class124.field1653 = arg0;
        for (int var1 = 0; var1 < class66.field847; var1++) {
            for (int var2 = 0; var2 < class300.field4413; var2++) {
                if (class345.field5367[arg0][var1][var2] == null) {
                    class345.field5367[arg0][var1][var2] = new class119(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V", line = 210)
    public class273() {
        if (class47.field597) {
            GL var1 = class47.field592;
            this.field3915 = var1.glGenLists(2);
            var1.glNewList(this.field3915, 4864);
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
            var1.glNewList(this.field3915 + 1, 4864);
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

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "()V", line = 119)
    public final void method127() {
        field3906++;
        GL var1 = class47.field592;
        class47.method364(1);
        if (class302.field4433 == null || this.field3915 < 0 || !class67.field856) {
            var1.glTexEnvi(8960, 34184, 34167);
            return;
        }
        var1.glCallList(this.field3915);
        var1.glActiveTexture(33985);
        class302.field4433.method704();
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glRotatef(-((float) class338.field5272 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
        var1.glRotatef(-((float) class255.field3738 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
        var1.glScalef(-1.0F, 1.0F, 1.0F);
        var1.glMatrixMode(5888);
        var1.glActiveTexture(33984);
        this.field3907 = true;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "()V", line = 149)
    public final void method126() {
        field3914++;
        GL var1 = class47.field592;
        if (this.field3907) {
            var1.glCallList(this.field3915 + 1);
            this.field3907 = false;
        } else {
            var1.glTexEnvi(8960, 34184, 5890);
        }
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "()I", line = 169)
    public final int method128() {
        field3913++;
        return 4;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V", line = 182)
    public final void method129(int arg0) {
        field3912++;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V", line = 193)
    public static final void method1857(int arg0) {
        field3918++;
        if (arg0 != 1610612736) {
            method1858(-79);
        }
        class247.field3603.method2262(false);
        class30.field344.method2262(false);
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)V", line = 255)
    public static void method1858(int arg0) {
        field3909 = null;
        if (arg0 != -22938) {
            method1857(55);
        }
        field3908 = null;
    }
}
