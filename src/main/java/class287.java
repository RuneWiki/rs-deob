import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class287 extends class190 {

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "Lql;")
    private class346 field3919;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "Lg;")
    private class433 field3921;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "[I")
    private static int[] field3920 = new int[4];

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)Lg;", line = 5)
    public final class433 method1021(int arg0) {
        if (arg0 > -37) {
            field3920 = (int[]) null;
        }
        return this.field3921;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)I", line = 16)
    public final int method1704(byte arg0) {
        int var2 = -94 / ((arg0 + 33) / 48);
        return this.field3921.field6343;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lg;BLg;F)V", line = 29)
    public final void method1705(class433 arg0, byte arg1, class433 arg2, float arg3) {
        opengl var5 = this.field3919.field4697;
        class415 var6 = this.field3919.field4786;
        if (this.field3919.field4803.field2924 != arg0.field6343 || this.field3919.field4803.field2923 != arg0.field6343) {
            this.field3919.field4803 = new class218(this.field3919, 3553, 6408, arg0.field6343, arg0.field6343);
        }
        if (this.field3919.field4759.field2924 != arg2.field6343 || this.field3919.field4759.field2923 != arg2.field6343) {
            this.field3919.field4759 = new class218(this.field3919, 3553, 6408, arg2.field6343, arg2.field6343);
        }
        this.field3919.method1629(field3920);
        this.field3919.method1584();
        this.field3919.method2102(var6);
        this.field3919.method2047();
        var5.glMatrixMode(5889);
        var5.glLoadIdentity();
        var5.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        var5.glMatrixMode(5888);
        var5.glLoadIdentity();
        var5.glPushAttrib(2048);
        var5.glViewport(0, 0, this.field3921.field6343, this.field3921.field6343);
        this.field3919.method2075(false);
        this.field3919.method2094(false);
        this.field3919.method2093(false);
        this.field3919.method2080(false);
        this.field3919.method2091(-2);
        this.field3919.method2052(1);
        this.field3919.method2056(0.0F, 0.0F, 0.0F, arg3);
        this.field3919.method2053(34165, 34165);
        this.field3919.method2052(0);
        this.field3919.method2054(0);
        if (arg1 < 107) {
            field3920 = (int[]) null;
        }
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method2575(0, arg0, var8);
            this.field3919.field4803.method1174(0, 0, arg0.field6343, arg0.field6343, 0, 0);
            var6.method2575(0, arg2, var8);
            this.field3919.field4759.method1174(0, 0, arg2.field6343, arg2.field6343, 0, 0);
            var6.method2575(0, this.field3921, var8);
            this.field3919.method2052(1);
            this.field3919.method2032(this.field3919.field4759);
            this.field3919.method2052(0);
            this.field3919.method2032(this.field3919.field4803);
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
            this.field3919.method2052(1);
            this.field3919.method2032((class50) null);
            this.field3919.method2052(0);
            this.field3919.method2032((class50) null);
        }
        this.field3919.method2052(1);
        this.field3919.method2053(8448, 8448);
        this.field3919.method2052(0);
        var6.method2577(0);
        var5.glPopAttrib();
        this.field3919.method2100(var6);
        this.field3919.method1648(field3920[0], field3920[1], field3920[2], field3920[3]);
        this.field3921.method239();
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lql;I)V", line = 113)
    public class287(class346 arg0, int arg1) {
        this.field3919 = arg0;
        this.field3921 = new class433(arg0, 6408, arg1);
    }
}
