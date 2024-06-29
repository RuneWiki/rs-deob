import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class129 extends class204 {

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "Lji;")
    private class622 field1640;

    @OriginalMember(owner = "client!fq", name = "k", descriptor = "Lgfa;")
    private class660 field1644;

    @OriginalMember(owner = "client!fq", name = "l", descriptor = "Lnj;")
    public static class415 field1645 = new class415(26, 4);

    @OriginalMember(owner = "client!fq", name = "o", descriptor = "Lra;")
    public static class361 field1648 = new class361(15, 19);

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!fq", name = "m", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!fq", name = "p", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!fq", name = "n", descriptor = "Lpe;")
    public static class615 field1647;

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(B)I", line = 3)
    public final int method926(byte arg0) {
        if (arg0 >= -88) {
            method927((byte) 7);
        }
        field1641++;
        return this.field1644.field9202;
    }

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "(B)V", line = 14)
    public static void method927(byte arg0) {
        field1648 = null;
        if (arg0 == 9) {
            field1647 = null;
            field1645 = null;
        }
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)Lgfa;", line = 26)
    public final class660 method928(int arg0) {
        field1643++;
        int var2 = -122 % ((arg0 - 68) / 44);
        return this.field1644;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lfd;I)Ldq;", line = 40)
    public static final class517 method929(class418 arg0, int arg1) {
        field1649++;
        int var2 = arg0.method2396(arg1 ^ 0x5B8);
        class562 var3 = class167.method1156(106)[arg0.method2396(-125)];
        class573 var4 = class239.method1507((byte) -37)[arg0.method2396(-122)];
        int var5 = arg0.method2383(65280);
        int var6 = arg0.method2383(65280);
        int var7 = arg0.method2393(-30727);
        int var8 = arg0.method2393(arg1 ^ 0xFFFF8228);
        int var9 = arg0.method2355(52);
        int var10 = arg0.method2355(107);
        if (arg1 != 1489) {
            field1647 = null;
        }
        int var11 = arg0.method2355(30);
        boolean var12 = arg0.method2396(-14) == 1;
        return new class517(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lji;I)V", line = 74)
    public class129(class622 arg0, int arg1) {
        this.field1640 = arg0;
        this.field1644 = new class660(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lgfa;BFLgfa;)Z", line = 93)
    public final boolean method930(class660 arg0, byte arg1, float arg2, class660 arg3) {
        field1642++;
        if (arg1 != 76) {
            method929(null, 35);
        }
        boolean var5 = true;
        class701 var6 = this.field1640.field8660;
        this.field1640.method356(class446.field5736);
        this.field1640.method396();
        this.field1640.method3407((byte) -113);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field1644.field9202, this.field1644.field9202);
        this.field1640.method3393(false, -11594);
        this.field1640.method3425(false, 111);
        this.field1640.method3439(false, (byte) -49);
        this.field1640.method3424(false, -32);
        this.field1640.method3459((byte) 103, -2);
        this.field1640.method3469(1, false);
        this.field1640.method3428(arg2, -45, 0.0F, 0.0F, 0.0F);
        this.field1640.method3462(34165, arg1 - 5958, 34165);
        this.field1640.method3388(arg0, false);
        this.field1640.method3469(0, false);
        this.field1640.method3443(1, true);
        this.field1640.method3388(arg3, false);
        this.field1640.method3395(18469, var6);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method3837(var8, this.field1644, 0, true);
            var6.method3840((byte) 103, 0);
            if (!var6.method3833(22734)) {
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
        var6.method3843(-26732, 0);
        this.field1640.method3390(-22078, var6);
        this.field1640.method3469(1, false);
        this.field1640.method3388(null, false);
        this.field1640.method3462(8448, -5882, 8448);
        this.field1640.method3469(0, false);
        this.field1640.method3388(null, false);
        OpenGL.glPopAttrib();
        this.field1640.method376(class446.field5736[0], class446.field5736[1], class446.field5736[2], class446.field5736[3]);
        if (var5 && !this.field1640.field8662) {
            this.field1644.method3906(-26150);
        }
        return var5;
    }
}
