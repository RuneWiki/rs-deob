import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class58 implements class246 {

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    private int field939 = -1;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "Z")
    private boolean field940 = false;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)V", line = 5)
    public static final void method459(int arg0, int arg1) {
        field944++;
        class137 var2 = (class137) class281.field4320.method1222(0, (long) arg1);
        if (var2 != null) {
            var2.method403(1);
            int var3 = 1 % ((28 - arg0) / 45);
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "()I", line = 25)
    public final int method452() {
        field942++;
        return 4;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "()V", line = 38)
    public final void method458() {
        field943++;
        GL var1 = class94.field1473;
        class94.method675(1);
        if (class55.field914 == null || this.field939 < 0 || !class208.field3191) {
            var1.glTexEnvi(8960, 34184, 34167);
            return;
        }
        var1.glCallList(this.field939);
        var1.glActiveTexture(33985);
        class55.field914.method2168();
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glRotatef(-((float) class77.field1239 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
        var1.glRotatef(-((float) class40.field607 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
        var1.glScalef(-1.0F, 1.0F, 1.0F);
        var1.glMatrixMode(5888);
        var1.glActiveTexture(33984);
        this.field940 = true;
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "()V", line = 65)
    public final void method454() {
        field938++;
        GL var1 = class94.field1473;
        if (this.field940) {
            var1.glCallList(this.field939 + 1);
            this.field940 = false;
        } else {
            var1.glTexEnvi(8960, 34184, 5890);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V", line = 88)
    public final void method457(int arg0) {
        field941++;
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V", line = 101)
    public class58() {
        if (class94.field1515) {
            GL var1 = class94.field1473;
            this.field939 = var1.glGenLists(2);
            var1.glNewList(this.field939, 4864);
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
            var1.glNewList(this.field939 + 1, 4864);
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
}
