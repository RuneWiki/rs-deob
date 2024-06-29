import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class481 extends class43 {

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "Lur;")
    private class377 field7104;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "Lsa;")
    private class139 field7106;

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "Lao;")
    public static class191 field7107;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
    public static int field7111;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    public static int field7102;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
    public static int field7103;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "I")
    public static int field7105;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "I")
    public static int field7108;

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "I")
    public static int field7109;

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "I")
    public static int field7110;

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "Z")
    public static boolean field7112;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)Z")
    public static final boolean method2937(int arg0, int arg1) {
        if (arg1 != -760) {
            field7107 = null;
        }
        field7108++;
        return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(III)Z")
    public static final boolean method2938(int arg0, int arg1, int arg2) {
        field7103++;
        if (arg0 != -2639) {
            field7112 = false;
        }
        return (arg2 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BFLsa;Lsa;)Z")
    public final boolean method2939(byte arg0, float arg1, class139 arg2, class139 arg3) {
        field7105++;
        boolean var5 = true;
        class354 var6 = this.field7104.field5373;
        this.field7104.method1163(class62.field716);
        this.field7104.method1206();
        this.field7104.method2272((byte) 125);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (arg0 < 18) {
            this.field7106 = null;
        }
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field7106.field1855, this.field7106.field1855);
        this.field7104.method2298(false, -12481);
        this.field7104.method2230(-13721, false);
        this.field7104.method2235(false, (byte) -46);
        this.field7104.method2289((byte) 120, false);
        this.field7104.method2299(-2, (byte) 74);
        this.field7104.method2250((byte) 62, 1);
        this.field7104.method2246(0.0F, -13680, 0.0F, 0.0F, arg1);
        this.field7104.method2269(34165, 8960, 34165);
        this.field7104.method2236(arg3, 99);
        this.field7104.method2250((byte) 102, 0);
        this.field7104.method2260(16640, 1);
        this.field7104.method2236(arg2, 102);
        this.field7104.method2264(var6, 106);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method2081(this.field7106, 0, var8, (byte) 67);
            var6.method2075(-110, 0);
            if (!var6.method2076((byte) -98)) {
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
        var6.method2068(1, 0);
        this.field7104.method2271((byte) 39, var6);
        this.field7104.method2250((byte) 55, 1);
        this.field7104.method2236(null, -125);
        this.field7104.method2269(8448, 8960, 8448);
        this.field7104.method2250((byte) 89, 0);
        this.field7104.method2236(null, 126);
        OpenGL.glPopAttrib();
        this.field7104.method1182(class62.field716[0], class62.field716[1], class62.field716[2], class62.field716[3]);
        if (var5 && !this.field7104.field5390) {
            this.field7106.method1561((byte) 126);
        }
        return var5;
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(B)Lsa;")
    public final class139 method251(byte arg0) {
        if (arg0 >= -121) {
            return null;
        } else {
            field7110++;
            return this.field7106;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)I")
    public final int method2940(int arg0) {
        if (arg0 == -65534) {
            field7109++;
            return this.field7106.field1855;
        } else {
            return -34;
        }
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lur;I)V")
    public class481(class377 arg0, int arg1) {
        this.field7104 = arg0;
        this.field7106 = new class139(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)V")
    public static void method2941(int arg0) {
        field7107 = null;
        if (arg0 != 65534) {
            field7111 = -118;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)V")
    public static final void method2942(int arg0, String arg1, String arg2) {
        class516.field7509 = arg2;
        class392.field5663 = arg1;
        field7102++;
        if (class48.field505 != 3 && class392.field5663.equals("") || class516.field7509.equals("")) {
            class326.method1918((byte) 115, 3);
            return;
        }
        class151.field1974 = false;
        if (class48.field505 != 1) {
            class352.field4701 = 0;
            class33.field341 = -1;
        }
        class326.method1918((byte) 124, arg0);
        class328.field4360 = 1;
        class505.field7338 = 0;
        class316.field4210 = 0;
    }

    static {
        new class305("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
        field7107 = new class191(93, 8);
        field7111 = 0;
    }
}
