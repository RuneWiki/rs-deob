import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class18 implements class62 {

    @OriginalMember(owner = "client!o", name = "e", descriptor = "Z")
    private boolean field223 = false;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    private int field224 = -1;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "[I")
    public static int[] field220 = new int[256];

    @OriginalMember(owner = "client!o", name = "h", descriptor = "[I")
    public static int[] field226 = new int[2];

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "[I")
    public static int[] field225;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "[I")
    public static int[] field228;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V", line = 8)
    public static final void method116(int arg0, int arg1) {
        if (arg1 != 0) {
            field228 = (int[]) null;
        }
        field222++;
        class148.field2390.method645(arg0, (byte) -99);
        class182.field2831.method645(arg0, (byte) -126);
        class29.field437.method645(arg0, (byte) -43);
        class172.field2680.method645(arg0, (byte) -120);
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "()V", line = 25)
    public final void method117() {
        field229++;
        GL var1 = class245.field3884;
        if (this.field223) {
            var1.glCallList(this.field224 + 1);
            this.field223 = false;
        } else {
            var1.glTexEnvi(8960, 34184, 5890);
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V", line = 44)
    public static void method118(int arg0) {
        if (arg0 == 1) {
            field220 = null;
            field225 = null;
            field228 = null;
            field226 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V", line = 59)
    public final void method119(int arg0) {
        field221++;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V", line = 108)
    public class18() {
        if (class245.field3876) {
            GL var1 = class245.field3884;
            this.field224 = var1.glGenLists(2);
            var1.glNewList(this.field224, 4864);
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
            var1.glNewList(this.field224 + 1, 4864);
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

    @OriginalMember(owner = "client!o", name = "b", descriptor = "()V", line = 84)
    public final void method120() {
        GL var1 = class245.field3884;
        field219++;
        class245.method1709(1);
        if (class165.field2597 == null || this.field224 < 0 || !class322.field5287) {
            var1.glTexEnvi(8960, 34184, 34167);
            return;
        }
        var1.glCallList(this.field224);
        var1.glActiveTexture(33985);
        class165.field2597.method292();
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glRotatef(-((float) class125.field1871 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
        var1.glRotatef(-((float) class98.field1427 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
        var1.glScalef(-1.0F, 1.0F, 1.0F);
        var1.glMatrixMode(5888);
        var1.glActiveTexture(33984);
        this.field223 = true;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "()I", line = 158)
    public final int method121() {
        field227++;
        return 4;
    }
}
