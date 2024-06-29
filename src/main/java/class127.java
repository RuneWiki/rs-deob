import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class127 extends class111 {

    @OriginalMember(owner = "client!qo", name = "k", descriptor = "Lnf;")
    private class256 field1773;

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "Lvm;")
    private class322 field1774;

    @OriginalMember(owner = "client!qo", name = "j", descriptor = "[I")
    private static int[] field1772 = new int[4];

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)Lvm;")
    public final class322 method729(byte arg0) {
        if (arg0 != 70) {
            this.method805((byte) 23);
        }
        return this.field1774;
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lnf;I)V")
    public class127(class256 arg0, int arg1) {
        this.field1773 = arg0;
        this.field1774 = new class322(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lvm;FLvm;I)V")
    public final void method804(class322 arg0, float arg1, class322 arg2, int arg3) {
        opengl var5 = this.field1773.field3634;
        class74 var6 = this.field1773.field3707;
        if (this.field1773.field3706.field2874 != arg0.field4735 || this.field1773.field3706.field2876 != arg0.field4735) {
            this.field1773.field3706 = new class216(this.field1773, 3553, 6408, arg0.field4735, arg0.field4735);
        }
        if (this.field1773.field3731.field2874 != arg2.field4735 || this.field1773.field3731.field2876 != arg2.field4735) {
            this.field1773.field3731 = new class216(this.field1773, 3553, 6408, arg2.field4735, arg2.field4735);
        }
        this.field1773.method1676(field1772);
        this.field1773.method1652();
        this.field1773.method1725(var6);
        this.field1773.method1677();
        var5.glMatrixMode(5889);
        var5.glLoadIdentity();
        var5.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        var5.glMatrixMode(5888);
        var5.glLoadIdentity();
        var5.glPushAttrib(2048);
        var5.glViewport(0, 0, this.field1774.field4735, this.field1774.field4735);
        this.field1773.method1674(false);
        this.field1773.method1636(false);
        this.field1773.method1754(false);
        this.field1773.method1667(false);
        this.field1773.method1722(-2);
        this.field1773.method1777(1);
        this.field1773.method1661(0.0F, 0.0F, 0.0F, arg1);
        this.field1773.method1627(34165, 34165);
        this.field1773.method1777(0);
        this.field1773.method1745(0);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method547(0, arg0, var8);
            this.field1773.field3706.method1272(0, 0, arg0.field4735, arg0.field4735, 0, 0);
            var6.method547(0, arg2, var8);
            this.field1773.field3731.method1272(0, 0, arg2.field4735, arg2.field4735, 0, 0);
            var6.method547(0, this.field1774, var8);
            this.field1773.method1777(1);
            this.field1773.method1669(this.field1773.field3731);
            this.field1773.method1777(0);
            this.field1773.method1669(this.field1773.field3706);
            var5.glBegin(7);
            var5.glTexCoord2f(0.0F, 0.0F);
            var5.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            var5.glVertex2f(0.0F, 0.0F);
            var5.glTexCoord2f(1.0F, 0.0F);
            var5.glMultiTexCoord2f(33985, 1.0F, 0.0F);
            var5.glVertex2f(1.0F, 0.0F);
            var5.glTexCoord2f(1.0F, 1.0F);
            var5.glMultiTexCoord2f(33985, 1.0F, 1.0F);
            var5.glVertex2f(1.0F, 1.0F);
            var5.glTexCoord2f(0.0F, 1.0F);
            var5.glMultiTexCoord2f(33985, 0.0F, 1.0F);
            var5.glVertex2f(0.0F, 1.0F);
            var5.glEnd();
            this.field1773.method1777(1);
            this.field1773.method1669((class360) null);
            this.field1773.method1777(0);
            this.field1773.method1669((class360) null);
        }
        this.field1773.method1777(1);
        this.field1773.method1627(8448, 8448);
        this.field1773.method1777(0);
        var6.method546(arg3);
        var5.glPopAttrib();
        this.field1773.method1765(var6);
        this.field1773.method1767(field1772[0], field1772[1], field1772[2], field1772[3]);
        this.field1774.method2350();
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(B)I")
    public final int method805(byte arg0) {
        if (arg0 != -34) {
            this.field1773 = (class256) null;
        }
        return this.field1774.field4735;
    }
}
