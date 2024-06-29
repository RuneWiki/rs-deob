import jaggl.OpenGL;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class127 extends class533 {

    @OriginalMember(owner = "client!vp", name = "n", descriptor = "Lkd;")
    private class188 field1861;

    @OriginalMember(owner = "client!vp", name = "l", descriptor = "Lgl;")
    private class428 field1859;

    @OriginalMember(owner = "client!vp", name = "j", descriptor = "I")
    public static int field1857 = 0;

    @OriginalMember(owner = "client!vp", name = "k", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!vp", name = "m", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!vp", name = "o", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!vp", name = "p", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!vp", name = "q", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!vp", name = "r", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lgl;FLgl;Z)Z")
    public final boolean method926(class428 arg0, float arg1, class428 arg2, boolean arg3) {
        field1865++;
        boolean var5 = true;
        class395 var6 = this.field1861.field3110;
        this.field1861.method351(class486.field7004);
        this.field1861.method267();
        this.field1861.method1287(0);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field1859.field6368, this.field1859.field6368);
        this.field1861.method1303(false, 20873);
        this.field1861.method1272(false, -75);
        this.field1861.method1299(!arg3, false);
        this.field1861.method1294(false, 34165);
        this.field1861.method1304(-26349, -2);
        this.field1861.method1307(1, (byte) 92);
        this.field1861.method1258(0.0F, arg1, 0.0F, (byte) 122, 0.0F);
        this.field1861.method1242(34162, 34165, 34165);
        this.field1861.method1289(-19391, arg0);
        this.field1861.method1307(0, (byte) 92);
        this.field1861.method1248(1, arg3);
        this.field1861.method1289(-19391, arg2);
        this.field1861.method1284(5122, var6);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method2487(this.field1859, 0, true, var8);
            var6.method2483(0, (byte) 124);
            if (!var6.method2488(100)) {
                var5 = false;
                break;
            }
            OpenGL.glBegin(7);
            if (var8 == 34069) {
                OpenGL.glTexCoord3i(65535, 65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65535, 65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65535, -65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(65535, -65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34070) {
                OpenGL.glTexCoord3i(-65535, 65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(-65535, 65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(-65535, -65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65535, -65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34071) {
                OpenGL.glTexCoord3i(-65534, 65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, 65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34072) {
                OpenGL.glTexCoord3i(-65534, -65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, -65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34073) {
                OpenGL.glTexCoord3i(-65534, 65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, -65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34074) {
                OpenGL.glTexCoord3i(65534, 65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(-65534, 65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(-65534, -65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(65534, -65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
                OpenGL.glVertex2f(0.0F, 1.0F);
            }
            OpenGL.glEnd();
        }
        var6.method2489(0, arg3);
        this.field1861.method1283(var6, arg3);
        this.field1861.method1307(1, (byte) 92);
        this.field1861.method1289(-19391, null);
        this.field1861.method1242(34162, 8448, 8448);
        this.field1861.method1307(0, (byte) 92);
        this.field1861.method1289(-19391, null);
        OpenGL.glPopAttrib();
        this.field1861.method313(class486.field7004[0], class486.field7004[1], class486.field7004[2], class486.field7004[3]);
        if (var5 && !this.field1861.field3114) {
            this.field1859.method2759(94);
        }
        return var5;
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lkd;I)V")
    public class127(class188 arg0, int arg1) {
        this.field1861 = arg0;
        this.field1859 = new class428(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIIII)V")
    public static final void method927(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -65534) {
            method928(null, null, 104);
        }
        field1862++;
        for (int var5 = 0; var5 < class109.field1529; var5++) {
            Rectangle var6 = class273.field4183[var5];
            if (arg4 < var6.x + var6.width && var6.x < (arg2 + arg4) && (var6.y + var6.height) > arg0 && var6.y < (arg0 + arg1)) {
                class8.field115[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "([Ljava/lang/Object;[JI)V")
    public static final void method928(Object[] arg0, long[] arg1, int arg2) {
        field1858++;
        if (arg2 < -70) {
            class213.method1478(0, 78, arg0, arg1.length - 1, arg1);
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IB)V")
    public static final void method929(int arg0, byte arg1) {
        field1864++;
        if (!class184.method1223((byte) -66, arg0) || arg1 <= 109) {
            return;
        }
        class114[] var2 = class200.field3326[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class114 var4 = var2[var3];
            if (var4 != null) {
                var4.field1699 = 0;
                var4.field1693 = 1;
                var4.field1695 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)Lgl;")
    public final class428 method930(int arg0) {
        if (arg0 == -11536) {
            field1860++;
            return this.field1859;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(B)I")
    public final int method931(byte arg0) {
        if (arg0 <= 104) {
            field1857 = 116;
        }
        field1863++;
        return this.field1859.field6368;
    }
}
