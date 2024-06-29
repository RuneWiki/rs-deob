import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class227 implements class188 {

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "[F")
    private float[] field3779 = new float[4];

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "[Lkb;")
    public static class31[] field3784 = new class31[50];

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "Lok;")
    public static class146 field3789 = class235.method1724(-12908, "tremblement:");

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    public static int field3783 = 0;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "[Lok;")
    public static class146[] field3782 = new class146[500];

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "Lok;")
    public static class146 field3797 = class235.method1724(-12908, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "Lok;")
    public static class146 field3792 = class235.method1724(-12908, ")2");

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "Lok;")
    public static class146 field3788 = class235.method1724(-12908, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "I")
    private int field3798;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "Loh;")
    public static class15 field3790;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "[Lje;")
    public static class70[] field3786;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V", line = 7)
    public final void method512(int arg0) {
        field3780++;
        float var2 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        GL var3 = class271.field4641;
        float var4 = (float) (((arg0 & 0x1A) >> 3) + 1) * 0.01F;
        boolean var5 = (arg0 & 0x80) != 0;
        float var6 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        if (var5) {
            this.field3779[0] = var6;
            this.field3779[3] = 0.0F;
            this.field3779[2] = 0.0F;
            this.field3779[1] = 0.0F;
        } else {
            this.field3779[1] = 0.0F;
            this.field3779[0] = 0.0F;
            this.field3779[2] = var6;
            this.field3779[3] = 0.0F;
        }
        var3.glActiveTexture(33985);
        var3.glMatrixMode(5888);
        var3.glPushMatrix();
        var3.glLoadIdentity();
        var3.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var3.glRotatef((float) class211.field3492 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var3.glRotatef((float) class263.field4374 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var3.glTranslatef((float) (-class56.field999), (float) (-class211.field3498), (float) (-class223.field3717));
        var3.glTexGenfv(8192, 9474, this.field3779, 0);
        this.field3779[3] = (float) class271.field4635 * var2;
        this.field3779[1] = var6;
        this.field3779[2] = 0.0F;
        this.field3779[0] = 0.0F;
        var3.glTexGenfv(8193, 9474, this.field3779, 0);
        var3.glPopMatrix();
        if (class243.field4032) {
            this.field3779[3] = (float) class271.field4635 * var4;
            this.field3779[2] = 0.0F;
            this.field3779[0] = 0.0F;
            this.field3779[1] = 0.0F;
            var3.glTexGenfv(8194, 9473, this.field3779, 0);
        } else {
            int var7 = (int) ((float) class271.field4635 * var4 * 64.0F);
            var3.glBindTexture(3553, class243.field4034[var7 % 64]);
        }
        var3.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "()V", line = 79)
    public final void method514() {
        field3793++;
        GL var1 = class271.field4641;
        var1.glCallList(this.field3798 + 1);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "()I", line = 88)
    public final int method515() {
        field3785++;
        return 0;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V", line = 98)
    public static void method1674(int arg0) {
        field3790 = null;
        field3784 = null;
        field3782 = null;
        field3797 = null;
        field3792 = null;
        field3788 = null;
        field3789 = null;
        field3786 = null;
        if (arg0 != 180) {
            method1674(40);
        }
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V", line = 116)
    private final void method1675(int arg0) {
        field3795++;
        GL var2 = class271.field4641;
        this.field3798 = var2.glGenLists(2);
        var2.glNewList(this.field3798, 4864);
        var2.glActiveTexture(33985);
        if (class243.field4032) {
            var2.glBindTexture(32879, class243.field4037);
            var2.glTexGeni(8194, 9472, 9217);
            var2.glEnable(3170);
            var2.glEnable(32879);
        } else {
            var2.glEnable(3553);
        }
        var2.glTexGeni(8192, 9472, 9216);
        var2.glTexGeni(8193, 9472, 9216);
        var2.glEnable(3168);
        var2.glEnable(3169);
        var2.glActiveTexture(33984);
        var2.glEndList();
        var2.glNewList(this.field3798 + arg0, 4864);
        var2.glActiveTexture(33985);
        if (class243.field4032) {
            var2.glDisable(32879);
            var2.glDisable(3170);
        } else {
            var2.glDisable(3553);
        }
        var2.glDisable(3168);
        var2.glDisable(3169);
        var2.glActiveTexture(33984);
        var2.glEndList();
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V", line = 277)
    public class227() {
        this.method1675(1);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IB)I", line = 177)
    public static final int method1676(int arg0, byte arg1) {
        field3794++;
        if (arg1 >= -26) {
            field3789 = (class146) null;
        }
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(IB)Z", line = 191)
    public static final boolean method1677(int arg0, byte arg1) {
        int var2 = -26 / ((69 - arg1) / 37);
        field3781++;
        return arg0 >= 48 && arg0 <= 57;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IZIIIIII)V", line = 208)
    public static final void method1678(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3791++;
        int var8 = class21.method153(-124, arg3, class123.field2008, class318.field5394);
        int var9 = class21.method153(-123, arg4, class123.field2008, class318.field5394);
        int var10 = class21.method153(-124, arg5, class151.field2564, class126.field2058);
        int var11 = class21.method153(-126, arg6, class151.field2564, class126.field2058);
        int var12 = class21.method153(-122, arg3 + arg7, class123.field2008, class318.field5394);
        if (arg1) {
            method1678(-28, false, 2, -105, 46, -123, 63, -72);
        }
        int var13 = class21.method153(-117, arg4 - arg7, class123.field2008, class318.field5394);
        for (int var14 = var8; var14 < var12; var14++) {
            class40.method281(arg0, var10, class81.field1297[var14], var11, 7);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class40.method281(arg0, var10, class81.field1297[var15], var11, 7);
        }
        int var16 = class21.method153(-127, arg5 + arg7, class151.field2564, class126.field2058);
        int var17 = class21.method153(-121, arg6 - arg7, class151.field2564, class126.field2058);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class81.field1297[var18];
            class40.method281(arg0, var10, var19, var16, 7);
            class40.method281(arg2, var16, var19, var17, 7);
            class40.method281(arg0, var17, var19, var11, 7);
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "()V", line = 269)
    public final void method509() {
        field3796++;
        GL var1 = class271.field4641;
        var1.glCallList(this.field3798);
    }
}
