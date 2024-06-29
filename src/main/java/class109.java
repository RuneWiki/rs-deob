import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class109 implements class236 {

    @OriginalMember(owner = "client!q", name = "f", descriptor = "Z")
    private boolean field1855 = false;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    private int field1856 = -1;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "Lwb;")
    public static class171 field1854;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "[[Llg;")
    public static class137[][] field1852;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V", line = 5)
    public final void method239(int arg0) {
        field1853++;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V", line = 12)
    public static void method950(byte arg0) {
        field1852 = (class137[][]) null;
        field1854 = null;
        int var1 = -67 % ((arg0 - 49) / 51);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIII)V", line = 22)
    public static final void method951(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class215.field3612 == 1) {
            class259.field4202[class20.field304 / 100].method1248(class207.field3513 - 8, class98.field1603 - 8);
        }
        if (class215.field3612 == 2) {
            class259.field4202[class20.field304 / 100 + 4].method1248(class207.field3513 - 8, class98.field1603 - 8);
        }
        if (arg1 == 8) {
            class56.method503(8211);
            field1850++;
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V", line = 62)
    public static final void method952(int arg0) {
        field1851++;
        for (int var1 = -1; var1 < class291.field4664; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class119.field2064[var1];
            }
            class205 var3 = class135.field2359[var2];
            if (var3 != null && var3.field1937 > 0) {
                var3.field1937--;
                if (var3.field1937 == 0) {
                    var3.field1986 = null;
                }
            }
        }
        if (arg0 != 30978) {
            field1854 = (class171) null;
        }
        for (int var4 = 0; var4 < class191.field3200; var4++) {
            int var5 = class33.field468[var4];
            class278 var6 = class320.field5071[var5];
            if (var6 != null && var6.field1937 > 0) {
                var6.field1937--;
                if (var6.field1937 == 0) {
                    var6.field1986 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "()I", line = 123)
    public final int method237() {
        field1860++;
        return 4;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()V", line = 131)
    public final void method245() {
        field1859++;
        GL var1 = class43.field651;
        class43.method349(1);
        if (class250.field4056 == null || this.field1856 < 0 || !class64.field1001) {
            var1.glTexEnvi(8960, 34184, 34167);
            return;
        }
        var1.glCallList(this.field1856);
        var1.glActiveTexture(33985);
        class250.field4056.method2264();
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glRotatef(-((float) class142.field2598 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
        var1.glRotatef(-((float) class90.field1423 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
        var1.glScalef(-1.0F, 1.0F, 1.0F);
        var1.glMatrixMode(5888);
        var1.glActiveTexture(33984);
        this.field1855 = true;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V", line = 188)
    public class109() {
        if (class43.field647) {
            GL var1 = class43.field651;
            this.field1856 = var1.glGenLists(2);
            var1.glNewList(this.field1856, 4864);
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
            var1.glNewList(this.field1856 + 1, 4864);
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

    @OriginalMember(owner = "client!q", name = "b", descriptor = "()V", line = 172)
    public final void method243() {
        field1858++;
        GL var1 = class43.field651;
        if (this.field1855) {
            var1.glCallList(this.field1856 + 1);
            this.field1855 = false;
        } else {
            var1.glTexEnvi(8960, 34184, 5890);
        }
    }
}
