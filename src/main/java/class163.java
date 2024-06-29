import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class163 implements class97 {

    @OriginalMember(owner = "client!um", name = "e", descriptor = "Z")
    private boolean field2508 = false;

    @OriginalMember(owner = "client!um", name = "l", descriptor = "I")
    private int field2515 = -1;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "[I")
    public static int[] field2506 = new int[32];

    @OriginalMember(owner = "client!um", name = "n", descriptor = "[I")
    public static int[] field2517 = new int[25];

    @OriginalMember(owner = "client!um", name = "o", descriptor = "[I")
    public static int[] field2518 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!um", name = "f", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!um", name = "g", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!um", name = "h", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!um", name = "i", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!um", name = "j", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!um", name = "k", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!um", name = "m", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "()I", line = 6)
    public final int method148() {
        field2513++;
        return 4;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V", line = 15)
    public final void method150(int arg0) {
        field2510++;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V", line = 31)
    public static void method1172(int arg0) {
        if (arg0 == 0) {
            field2518 = null;
            field2517 = null;
            field2506 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V", line = 135)
    public class163() {
        if (class272.field4299) {
            GL var1 = class272.field4310;
            this.field2515 = var1.glGenLists(2);
            var1.glNewList(this.field2515, 4864);
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
            var1.glNewList(this.field2515 + 1, 4864);
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

    @OriginalMember(owner = "client!um", name = "c", descriptor = "()V", line = 49)
    public final void method147() {
        field2512++;
        GL var1 = class272.field4310;
        if (this.field2508) {
            var1.glCallList(this.field2515 + 1);
            this.field2508 = false;
        } else {
            var1.glTexEnvi(8960, 34184, 5890);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIZLnk;III)V", line = 77)
    public static final void method1173(int arg0, int arg1, boolean arg2, class16 arg3, int arg4, int arg5, int arg6) {
        class258.field4083 = arg5;
        class282.field4498 = arg3;
        class2.field23 = arg6;
        field2504++;
        class28.field330 = 1;
        class19.field231 = arg4;
        class203.field3094 = arg2;
        class24.field281 = arg0;
        if (arg1 != -11014) {
            field2517 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "()V", line = 102)
    public final void method152() {
        field2505++;
        GL var1 = class272.field4310;
        class272.method1947(1);
        if (class267.field4205 == null || this.field2515 < 0 || !class290.field4566) {
            var1.glTexEnvi(8960, 34184, 34167);
            return;
        }
        var1.glCallList(this.field2515);
        var1.glActiveTexture(33985);
        class267.field4205.method1762();
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glRotatef(-((float) class189.field2840 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
        var1.glRotatef(-((float) class54.field616 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
        var1.glScalef(-1.0F, 1.0F, 1.0F);
        var1.glMatrixMode(5888);
        var1.glActiveTexture(33984);
        this.field2508 = true;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(JZ)V", line = 186)
    public static final void method1174(long arg0, boolean arg1) {
        field2511++;
        if (!class222.field3355) {
            class103.field1423 += (float) arg0 * class203.field3089 / 40.0F;
            class190.field2855 += (float) arg0 * class296.field4650 / 40.0F;
        }
        int var3 = class11.field113.field3767 + class10.field106;
        int var4 = class11.field113.field3763 + class214.field3246;
        if (arg1) {
            method1172(-14);
        }
        if (class313.field4897 - var3 < -500 || (class313.field4897 - var3) > 500 || (class347.field5497 - var4) < -500 || class347.field5497 - var4 > 500) {
            class313.field4897 = var3;
            class347.field5497 = var4;
        }
        if (class313.field4897 != var3) {
            int var5 = var3 - class313.field4897;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var5 < var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var6 < var5) {
                var6 = var5;
            }
            class313.field4897 += var6;
        }
        if (class347.field5497 != var4) {
            int var7 = var4 - class347.field5497;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class347.field5497 += var8;
        }
        client.method2009(true);
    }
}
