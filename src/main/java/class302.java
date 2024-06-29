import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class302 implements class163 {

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "Z")
    private boolean field4511 = false;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    private int field4509 = -1;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "[Lig;")
    public static class65[] field4506 = new class65[6];

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field4507 = 0;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "I")
    public static int field4516 = 0;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "[[[Lmc;")
    public static class167[][][] field4502;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V", line = 9)
    public final void method286(int arg0) {
        field4514++;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V", line = 23)
    public static final void method2131(byte arg0) {
        field4503++;
        if (class67.field973 != null) {
            class67.field973.method1555(false);
            class67.field973 = null;
        }
        class279.method2039((byte) 82);
        class40.method289();
        for (int var1 = 0; var1 < 4; var1++) {
            class92.field1269[var1].method744(false);
        }
        class213.method1536((byte) 124, false);
        System.gc();
        class261.method1931(0, 2);
        class150.field2187 = -1;
        class65.field958 = false;
        class192.method1386(2, true);
        class202.field2968 = 0;
        class324.field4884 = 0;
        class272.field4123 = 0;
        class276.field4187 = false;
        class169.field2446 = 0;
        for (int var2 = 0; var2 < class351.field5417.length; var2++) {
            class351.field5417[var2] = null;
        }
        class265.field4053 = 0;
        class166.field2384 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class343.field5312[var3] = null;
            class299.field4478[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class300.field4495[var4] = null;
        }
        if (arg0 > -99) {
            method2131((byte) 112);
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class252.field3762[var5][var6][var7] = null;
                }
            }
        }
        class177.method1237(true);
        class30.field425 = 0;
        class99.method782(0);
        class125.method929((byte) -107, true);
        try {
            class114.method858("loggedout", (byte) -67, class54.field787.field878);
        } catch (Throwable var9) {
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V", line = 120)
    public static final void method2132(byte arg0) {
        field4517++;
        class263.field4030.method462(24);
        class357.field5473.method462(24);
        if (arg0 < 66) {
            field4518 = -13;
        }
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "()V", line = 133)
    public final void method283() {
        GL var1 = class141.field2025;
        field4519++;
        class141.method1013(1);
        if (class201.field2955 == null || this.field4509 < 0 || !class98.field1379) {
            var1.glTexEnvi(8960, 34184, 34167);
            return;
        }
        var1.glCallList(this.field4509);
        var1.glActiveTexture(33985);
        class201.field2955.method1632();
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glRotatef(-((float) class126.field1829 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
        var1.glRotatef(-((float) class303.field4530 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
        var1.glScalef(-1.0F, 1.0F, 1.0F);
        var1.glMatrixMode(5888);
        var1.glActiveTexture(33984);
        this.field4511 = true;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()V", line = 162)
    public final void method288() {
        field4505++;
        GL var1 = class141.field2025;
        if (this.field4511) {
            var1.glCallList(this.field4509 + 1);
            this.field4511 = false;
        } else {
            var1.glTexEnvi(8960, 34184, 5890);
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V", line = 243)
    public class302() {
        if (class141.field2042) {
            GL var1 = class141.field2025;
            this.field4509 = var1.glGenLists(2);
            var1.glNewList(this.field4509, 4864);
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
            var1.glNewList(this.field4509 + 1, 4864);
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

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()I", line = 187)
    public final int method281() {
        field4512++;
        return 4;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(B)V", line = 200)
    public static void method2133(byte arg0) {
        field4506 = null;
        field4502 = (class167[][][]) null;
        if (arg0 >= -7) {
            method2133((byte) -34);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)Lcl;", line = 217)
    public static final class164 method2134(int arg0, int arg1) {
        field4504++;
        int var2 = -106 % ((68 - arg0) / 39);
        class164 var3 = (class164) class354.field5438.method551(0, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class11.field180.method2520(26, arg1, (byte) -25);
        class164 var5 = new class164();
        if (var4 != null) {
            var5.method1165(new class190(var4), true);
        }
        class354.field5438.method547((long) arg1, -1, var5);
        return var5;
    }
}
