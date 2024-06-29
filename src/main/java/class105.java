import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class105 implements class182 {

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "Z")
    private boolean field1588 = false;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
    private int field1589 = -1;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "F")
    public static float field1584;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "Lrn;")
    public static class18 field1582;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "Lrn;")
    public static class18 field1587;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "Lpe;")
    public static class307 field1583;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "()I", line = 7)
    public final int method230() {
        field1578++;
        return 4;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "()V", line = 16)
    public final void method232() {
        field1585++;
        GL var1 = class240.field3771;
        if (this.field1588) {
            var1.glCallList(this.field1589 + 1);
            this.field1588 = false;
        } else {
            var1.glTexEnvi(8960, 34184, 5890);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BII)V", line = 32)
    public static final void method912(byte arg0, int arg1, int arg2) {
        if (arg0 != -35) {
            return;
        }
        class279.field4312 = (float) arg2;
        class313.field4846 = (float) arg1;
        if (class314.field4858 == 2) {
            class15.field248 = arg1;
            class191.field3005 = arg2;
        }
        class304.method2189((byte) -127);
        field1590++;
        class78.field1138 = true;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V", line = 64)
    public static final void method913(int arg0, int arg1) {
        class326.field5007.method649((byte) 75, arg0);
        field1581++;
        if (arg1 >= 103) {
            class353.field5639.method649((byte) 75, arg0);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V", line = 77)
    public static void method914(byte arg0) {
        if (arg0 == -50) {
            field1583 = null;
            field1582 = null;
            field1587 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V", line = 91)
    public final void method229(int arg0) {
        field1579++;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V", line = 178)
    public class105() {
        if (class240.field3724) {
            GL var1 = class240.field3771;
            this.field1589 = var1.glGenLists(2);
            var1.glNewList(this.field1589, 4864);
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
            var1.glNewList(this.field1589 + 1, 4864);
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

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "()V", line = 108)
    public final void method231() {
        field1586++;
        GL var1 = class240.field3771;
        class240.method1806(1);
        if (class41.field657 == null || this.field1589 < 0 || !class59.field927) {
            var1.glTexEnvi(8960, 34184, 34167);
            return;
        }
        var1.glCallList(this.field1589);
        var1.glActiveTexture(33985);
        class41.field657.method844();
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glRotatef(-((float) class159.field2537 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
        var1.glRotatef(-((float) class290.field4516 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
        var1.glScalef(-1.0F, 1.0F, 1.0F);
        var1.glMatrixMode(5888);
        var1.glActiveTexture(33984);
        this.field1588 = true;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLud;)V", line = 134)
    public static final void method915(byte arg0, class91 arg1) {
        if (class360.field5718 == arg1.field1377 || arg1.field1343 == -1 || arg1.field1302 != 0 || arg1.field1369 + 1 > class126.method1091((byte) 101, arg1.field1343).field1429[arg1.field1329]) {
            int var2 = arg1.field1377 - arg1.field1384;
            int var3 = class360.field5718 - arg1.field1384;
            int var4 = arg1.field1317 * 128 + arg1.method808(114) * 64;
            int var5 = arg1.field1282 * 128 + (arg1.method808(88) * 64);
            int var6 = arg1.field1307 * 128 + (arg1.method808(106) * 64);
            int var7 = arg1.field1386 * 128 + arg1.method808(-122) * 64;
            arg1.field1359 = ((var2 - var3) * var4 + var3 * var6) / var2;
            arg1.field1286 = ((var2 - var3) * var5 + var3 * var7) / var2;
        }
        if (arg0 != 98) {
            method913(93, 41);
        }
        arg1.field1341 = 0;
        field1576++;
        if (arg1.field1356 == 0) {
            arg1.field1289 = 1024;
        }
        if (arg1.field1356 == 1) {
            arg1.field1289 = 1536;
        }
        if (arg1.field1356 == 2) {
            arg1.field1289 = 0;
        }
        if (arg1.field1356 == 3) {
            arg1.field1289 = 512;
        }
        arg1.field1320 = arg1.field1289;
    }
}
