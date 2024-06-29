import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class285 implements class335 {

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    private int field4445 = -1;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "Z")
    private boolean field4454 = false;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field4441 = new String[500];

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4452 = "Allocating memory";

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "[Z")
    public static boolean[] field4455 = new boolean[100];

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "Lpk;")
    public static class120 field4446;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "()V", line = 12)
    public final void method787() {
        GL var1 = class162.field2654;
        if (this.field4454) {
            var1.glCallList(this.field4445 + 1);
            this.field4454 = false;
        } else {
            var1.glTexEnvi(8960, 34184, 5890);
        }
        field4448++;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "()V", line = 33)
    public final void method785() {
        field4440++;
        GL var1 = class162.field2654;
        class162.method1211(1);
        if (class37.field558 == null || this.field4445 < 0 || !class229.field3531) {
            var1.glTexEnvi(8960, 34184, 34167);
            return;
        }
        var1.glCallList(this.field4445);
        var1.glActiveTexture(33985);
        class37.field558.method577();
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glRotatef(-((float) class332.field5185 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
        var1.glRotatef(-((float) class331.field5160 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
        var1.glScalef(-1.0F, 1.0F, 1.0F);
        var1.glMatrixMode(5888);
        var1.glActiveTexture(33984);
        this.field4454 = true;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V", line = 67)
    public static void method1991(int arg0) {
        field4446 = null;
        field4441 = null;
        field4452 = null;
        if (arg0 != 2) {
            method1993((byte) -116, (String[]) null, -80, -83);
        }
        field4455 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIII)I", line = 83)
    public static final int method1992(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4442++;
        int var5 = arg3 - class40.field619[arg1 * 1024 / arg2] >> 1;
        return ((65536 - var5) * arg4 >> 16) + (arg0 * var5 >> 16);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B[Ljava/lang/String;II)Ljava/lang/String;", line = 93)
    public static final String method1993(byte arg0, String[] arg1, int arg2, int arg3) {
        field4450++;
        if (arg3 == 0) {
            return "";
        } else if (arg3 == 1) {
            String var4 = arg1[arg2];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = 0;
            int var6 = arg2 + arg3;
            for (int var7 = arg2; var7 < var6; var7++) {
                String var8 = arg1[var7];
                if (var8 == null) {
                    var5 += 4;
                } else {
                    var5 += var8.length();
                }
            }
            StringBuffer var9 = new StringBuffer(var5);
            int var10 = -114 / ((arg0 - 77) / 48);
            for (int var11 = arg2; var11 < var6; var11++) {
                String var12 = arg1[var11];
                if (var12 == null) {
                    var9.append("null");
                } else {
                    var9.append(var12);
                }
            }
            return var9.toString();
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V", line = 154)
    public final void method786(int arg0) {
        field4444++;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V", line = 167)
    public static final void method1994(byte arg0) {
        field4443++;
        for (int var1 = 0; var1 < class25.field422; var1++) {
            class6 var2 = class309.method2183(0, var1);
            if (var2 != null && var2.field133 == 0) {
                class93.field1518[var1] = 0;
                class123.field1998[var1] = 0;
            }
        }
        int var3 = -98 % ((arg0 + 82) / 40);
        class16.field332 = new class3(16);
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V", line = 206)
    public class285() {
        if (class162.field2644) {
            GL var1 = class162.field2654;
            this.field4445 = var1.glGenLists(2);
            var1.glNewList(this.field4445, 4864);
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
            var1.glNewList(this.field4445 + 1, 4864);
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

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "()I", line = 197)
    public final int method784() {
        field4453++;
        return 4;
    }
}
