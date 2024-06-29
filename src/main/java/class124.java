import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class124 extends class585 {

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "Lno;")
    private class658 field2079;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "Ljk;")
    private class592 field2078;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "Ldb;")
    public static class298 field2081 = new class298(2, 3);

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "[J")
    public static long[] field2083 = new long[100];

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
    public static int field2085 = 0;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "[I")
    public static int[] field2080;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljk;ZFLjk;)Z", line = 10)
    public final boolean method961(class592 arg0, boolean arg1, float arg2, class592 arg3) {
        field2075++;
        boolean var5 = true;
        class79 var6 = this.field2079.field9280;
        this.field2079.method433(class268.field3743);
        this.field2079.method435();
        this.field2079.method3613((byte) 123);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field2078.field7825, this.field2078.field7825);
        this.field2079.method3619(false, -6137);
        this.field2079.method3653(arg1, 1000);
        this.field2079.method3632((byte) -89, false);
        this.field2079.method3680(-100, false);
        this.field2079.method3679(-57, -2);
        this.field2079.method3629((byte) -107, 1);
        this.field2079.method3685(arg2, 0.0F, 1, 0.0F, 0.0F);
        this.field2079.method3644(34165, 23560, 34165);
        this.field2079.method3630(arg0, -2);
        this.field2079.method3629((byte) 66, 0);
        this.field2079.method3603((byte) -34, 1);
        this.field2079.method3630(arg3, -2);
        this.field2079.method3639(7, var6);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method619((byte) -84, this.field2078, var8, 0);
            var6.method625((byte) 113, 0);
            if (!var6.method623(-32672)) {
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
        var6.method620(1, 0);
        this.field2079.method3658(-128, var6);
        this.field2079.method3629((byte) -94, 1);
        this.field2079.method3630(null, -2);
        this.field2079.method3644(8448, 23560, 8448);
        this.field2079.method3629((byte) 38, 0);
        this.field2079.method3630(null, -2);
        OpenGL.glPopAttrib();
        this.field2079.method421(class268.field3743[0], class268.field3743[1], class268.field3743[2], class268.field3743[3]);
        if (var5 && !this.field2079.field9314) {
            this.field2078.method2167(126);
        }
        return var5;
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(I)I", line = 208)
    public final int method962(int arg0) {
        if (arg0 > -32) {
            field2082 = 2;
        }
        field2084++;
        return this.field2078.field7825;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)Ljk;", line = 220)
    public final class592 method963(int arg0) {
        field2077++;
        if (arg0 != 1) {
            this.method962(7);
        }
        return this.field2078;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lno;I)V", line = 230)
    public class124(class658 arg0, int arg1) {
        this.field2079 = arg0;
        this.field2078 = new class592(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)V", line = 239)
    public static void method964(boolean arg0) {
        field2080 = null;
        if (arg0) {
            field2081 = null;
            field2083 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IILoa;I)V", line = 251)
    public static final void method965(int arg0, int arg1, class651 arg2, int arg3) {
        class251.field3460 = arg2;
        class105.field1570 = new class170[arg0][arg1];
        field2076++;
        if (class394.field5200 != null) {
            class515.field6884 = class210.method1345(class394.field5200[5], class394.field5200[4], class394.field5200[1], class394.field5200[3], class394.field5200[2], class394.field5200[0], 0);
        }
        int var4 = -25 / ((arg3 + 59) / 54);
        class10.field199 = new class170();
        class46.method321(false);
    }
}
