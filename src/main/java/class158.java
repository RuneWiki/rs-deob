import java.util.Random;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class158 implements class40 {

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    private int field2607 = -1;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "Z")
    private boolean field2616 = false;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public static int field2608 = -1;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "Ldb;")
    public static class102 field2613 = new class102(64);

    @OriginalMember(owner = "client!am", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2619 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!am", name = "n", descriptor = "Z")
    public static boolean field2620 = false;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "Lka;")
    public static class235 field2614;

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "()V", line = 138)
    public class158() {
        if (class232.field3722) {
            GL var1 = class232.field3716;
            this.field2607 = var1.glGenLists(2);
            var1.glNewList(this.field2607, 4864);
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
            var1.glNewList(this.field2607 + 1, 4864);
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

    @OriginalMember(owner = "client!am", name = "c", descriptor = "()I", line = 12)
    public final int method66() {
        field2617++;
        return 4;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "()V", line = 20)
    public final void method69() {
        field2611++;
        GL var1 = class232.field3716;
        class232.method1664(1);
        if (class278.field4474 == null || this.field2607 < 0 || !class322.field4994) {
            var1.glTexEnvi(8960, 34184, 34167);
            return;
        }
        var1.glCallList(this.field2607);
        var1.glActiveTexture(33985);
        class278.field4474.method2298();
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glRotatef(-((float) class191.field3123 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
        var1.glRotatef(-((float) class61.field883 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
        var1.glScalef(-1.0F, 1.0F, 1.0F);
        var1.glMatrixMode(5888);
        var1.glActiveTexture(33984);
        this.field2616 = true;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(I)V", line = 49)
    public static void method1137(int arg0) {
        if (arg0 != 2) {
            field2614 = (class235) null;
        }
        field2613 = null;
        field2619 = null;
        field2614 = null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IZLjava/util/Random;)I", line = 63)
    public static final int method1138(int arg0, boolean arg1, Random arg2) {
        field2609++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class60.method408(arg0, arg1)) {
            return (int) ((long) arg0 * ((long) arg2.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var3 <= var4);
            return class58.method372(var4, arg0, (byte) -56);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V", line = 97)
    public final void method72(int arg0) {
        field2610++;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "()V", line = 109)
    public final void method71() {
        field2612++;
        GL var1 = class232.field3716;
        if (this.field2616) {
            var1.glCallList(this.field2607 + 1);
            this.field2616 = false;
        } else {
            var1.glTexEnvi(8960, 34184, 5890);
        }
    }
}
