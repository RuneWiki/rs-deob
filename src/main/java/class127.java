import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class127 extends class58 {

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "Ljaa;")
    private class576 field1548;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "Lgda;")
    private class51 field1549;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public static int field1547 = 0;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)I")
    public final int method830(int arg0) {
        if (arg0 != -65535) {
            this.field1549 = null;
        }
        field1544++;
        return this.field1549.field653;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(FLgda;Lgda;Z)Z")
    public final boolean method831(float arg0, class51 arg1, class51 arg2, boolean arg3) {
        field1545++;
        boolean var5 = true;
        class14 var6 = this.field1548.field7641;
        this.field1548.method478(class261.field3311);
        this.field1548.method410();
        this.field1548.method3192(arg3);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field1549.field653, this.field1549.field653);
        this.field1548.method3154(-4221, arg3);
        this.field1548.method3130(3156, false);
        this.field1548.method3168(-19170, false);
        this.field1548.method3174(false, -32);
        this.field1548.method3171(123, -2);
        this.field1548.method3126(1, -63);
        this.field1548.method3191(arg0, 0.0F, 32521, 0.0F, 0.0F);
        this.field1548.method3185(34165, 34165, (byte) -80);
        this.field1548.method3194((byte) 75, arg1);
        this.field1548.method3126(0, -101);
        this.field1548.method3134(-101, 1);
        this.field1548.method3194((byte) 75, arg2);
        this.field1548.method3119(var6, -2015);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method73(var8, 0, arg3, this.field1549);
            var6.method69(-88, 0);
            if (!var6.method67(80)) {
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
        var6.method81(0, (byte) -57);
        this.field1548.method3164(-80, var6);
        this.field1548.method3126(1, -92);
        this.field1548.method3194((byte) 75, null);
        this.field1548.method3185(8448, 8448, (byte) 119);
        this.field1548.method3126(0, -102);
        this.field1548.method3194((byte) 75, null);
        OpenGL.glPopAttrib();
        this.field1548.method403(class261.field3311[0], class261.field3311[1], class261.field3311[2], class261.field3311[3]);
        if (var5 && !this.field1548.field7674) {
            this.field1549.method1103(false);
        }
        return var5;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I[BBIILjava/lang/String;)I")
    public static final int method832(int arg0, byte[] arg1, byte arg2, int arg3, int arg4, String arg5) {
        field1546++;
        int var6 = arg3 - arg0;
        if (arg2 < 98) {
            method832(24, null, (byte) 101, -65, 28, null);
        }
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg5.charAt(arg0 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg1[arg4 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg1[arg4 + var7] = -128;
            } else if (var8 == '‚') {
                arg1[arg4 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg1[arg4 + var7] = -125;
            } else if (var8 == '„') {
                arg1[arg4 + var7] = -124;
            } else if (var8 == '…') {
                arg1[arg4 + var7] = -123;
            } else if (var8 == '†') {
                arg1[arg4 + var7] = -122;
            } else if (var8 == '‡') {
                arg1[arg4 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg1[arg4 + var7] = -120;
            } else if (var8 == '‰') {
                arg1[arg4 + var7] = -119;
            } else if (var8 == 'Š') {
                arg1[arg4 + var7] = -118;
            } else if (var8 == '‹') {
                arg1[arg4 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg1[arg4 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg1[arg4 + var7] = -114;
            } else if (var8 == '‘') {
                arg1[arg4 + var7] = -111;
            } else if (var8 == '’') {
                arg1[arg4 + var7] = -110;
            } else if (var8 == '“') {
                arg1[arg4 + var7] = -109;
            } else if (var8 == '”') {
                arg1[arg4 + var7] = -108;
            } else if (var8 == '•') {
                arg1[arg4 + var7] = -107;
            } else if (var8 == '–') {
                arg1[arg4 + var7] = -106;
            } else if (var8 == '—') {
                arg1[arg4 + var7] = -105;
            } else if (var8 == '˜') {
                arg1[arg4 + var7] = -104;
            } else if (var8 == '™') {
                arg1[arg4 + var7] = -103;
            } else if (var8 == 'š') {
                arg1[arg4 + var7] = -102;
            } else if (var8 == '›') {
                arg1[arg4 + var7] = -101;
            } else if (var8 == 'œ') {
                arg1[arg4 + var7] = -100;
            } else if (var8 == 'ž') {
                arg1[arg4 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg1[arg4 + var7] = -97;
            } else {
                arg1[arg4 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)Lgda;")
    public final class51 method499(int arg0) {
        if (arg0 != -20699) {
            method832(-113, null, (byte) 21, 77, -14, null);
        }
        field1550++;
        return this.field1549;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Ljaa;I)V")
    public class127(class576 arg0, int arg1) {
        this.field1548 = arg0;
        this.field1549 = new class51(arg0, 6408, arg1);
    }
}
