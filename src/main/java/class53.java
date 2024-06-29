import jaggl.OpenGL;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class53 extends class508 {

    @OriginalMember(owner = "client!lp", name = "p", descriptor = "Lih;")
    private class214 field850;

    @OriginalMember(owner = "client!lp", name = "q", descriptor = "Lhg;")
    private class358 field851;

    @OriginalMember(owner = "client!lp", name = "w", descriptor = "Lnk;")
    public static class326 field857 = new class326(55, 7);

    @OriginalMember(owner = "client!lp", name = "y", descriptor = "Lvv;")
    public static class313 field859 = new class313(18, -2);

    @OriginalMember(owner = "client!lp", name = "A", descriptor = "Z")
    public static boolean field861 = false;

    @OriginalMember(owner = "client!lp", name = "n", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!lp", name = "o", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!lp", name = "r", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!lp", name = "s", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!lp", name = "t", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!lp", name = "v", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!lp", name = "z", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!lp", name = "u", descriptor = "[[B")
    public static byte[][] field855;

    @OriginalMember(owner = "client!lp", name = "x", descriptor = "[[[B")
    public static byte[][][] field858;

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(B)V")
    public static final void method368(byte arg0) {
        field854++;
        if (class350.field5480 == 5) {
            if (arg0 != -20) {
                method368((byte) -87);
            }
            class350.field5480 = 6;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)I")
    public static int method369(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "(I)V")
    public static void method370(int arg0) {
        field855 = null;
        if (arg0 == 34070) {
            field857 = null;
            field859 = null;
            field858 = null;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IFLhg;Lhg;)Z")
    public final boolean method371(int arg0, float arg1, class358 arg2, class358 arg3) {
        field848++;
        boolean var5 = true;
        class533 var6 = this.field850.field3649;
        this.field850.method908(class445.field6635);
        this.field850.method848();
        this.field850.method1408((byte) 6);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field851.field5571, this.field851.field5571);
        this.field850.method1405(-73, false);
        this.field850.method1417(false, false);
        this.field850.method1481(true, false);
        this.field850.method1473(-107, false);
        this.field850.method1463(-2, (byte) 78);
        this.field850.method1440(1, 0);
        this.field850.method1455(0.0F, arg0 ^ 0xFFFFE0E8, arg1, 0.0F, 0.0F);
        this.field850.method1482(34165, arg0 ^ 0x3C68, 34165);
        this.field850.method1471(true, arg2);
        this.field850.method1440(0, 0);
        this.field850.method1410(1, arg0 ^ 0x169);
        this.field850.method1471(true, arg3);
        this.field850.method1429(arg0 ^ arg0, var6);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method3166(0, 0, var8, this.field851);
            var6.method3150(121, 0);
            if (!var6.method3165((byte) 81)) {
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
        var6.method3157(-120, 0);
        this.field850.method1416(var6, -122);
        this.field850.method1440(1, 0);
        this.field850.method1471(true, null);
        this.field850.method1482(8448, 8960, 8448);
        this.field850.method1440(0, 0);
        this.field850.method1471(true, null);
        OpenGL.glPopAttrib();
        this.field850.method829(class445.field6635[0], class445.field6635[1], class445.field6635[2], class445.field6635[3]);
        if (var5 && !this.field850.field3632) {
            this.field851.method1205((byte) 102);
        }
        return var5;
    }

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "(I)I")
    public final int method372(int arg0) {
        int var2 = -66 % ((56 - arg0) / 57);
        field856++;
        return this.field851.field5571;
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lih;I)V")
    public class53(class214 arg0, int arg1) {
        this.field850 = arg0;
        this.field851 = new class358(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)Lhg;")
    public final class358 method373(int arg0) {
        field849++;
        if (arg0 >= -18) {
            this.field850 = null;
        }
        return this.field851;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(BJ)Ljava/lang/String;")
    public static final String method374(byte arg0, long arg1) {
        field853++;
        class343.field5377.setTime(new Date(arg1));
        int var3 = class343.field5377.get(7);
        int var4 = class343.field5377.get(5);
        int var5 = class343.field5377.get(2);
        int var6 = -56 / ((-arg0 - 30) / 55);
        int var7 = class343.field5377.get(1);
        int var8 = class343.field5377.get(11);
        int var9 = class343.field5377.get(12);
        int var10 = class343.field5377.get(13);
        return class347.field5456[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class484.field7113[var5] + "-" + var7 + " " + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10 + " GMT";
    }
}
