import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class9 extends class406 {

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "Ltt;")
    private class249 field105;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "Lrh;")
    private class32 field104;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "[I")
    public static int[] field103 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "Ljp;")
    public static class55 field102 = new class55(41, 2);

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(CI)Z", line = 3)
    public static final boolean method42(char arg0, int arg1) {
        field109++;
        if (arg1 == -58) {
            return arg0 >= '0' && arg0 <= '9';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V", line = 18)
    public static void method43(int arg0) {
        field103 = null;
        if (arg0 < -97) {
            field102 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)Lrh;", line = 33)
    public final class32 method44(int arg0) {
        field108++;
        if (arg0 != 6) {
            this.field104 = null;
        }
        return this.field104;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)I", line = 45)
    public final int method45(byte arg0) {
        field107++;
        return arg0 <= 68 ? 55 : this.field104.field383;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lrh;FLrh;I)Z", line = 56)
    public final boolean method46(class32 arg0, float arg1, class32 arg2, int arg3) {
        field106++;
        boolean var5 = true;
        class35 var6 = this.field105.field3980;
        this.field105.method545(class133.field1954);
        this.field105.method577();
        this.field105.method1784(58);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, (double) arg3);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field104.field383, this.field104.field383);
        this.field105.method1775((byte) -106, false);
        this.field105.method1708(arg3 - 9, false);
        this.field105.method1739((byte) 89, false);
        this.field105.method1706(-82, false);
        this.field105.method1725(-126, -2);
        this.field105.method1756(1, arg3 + 119);
        this.field105.method1709(0.0F, (byte) -33, 0.0F, arg1, 0.0F);
        this.field105.method1741(34165, (byte) 111, 34165);
        this.field105.method1749(25752, arg2);
        this.field105.method1756(0, -24);
        this.field105.method1734(arg3 ^ 0xFFFFFFBB, 1);
        this.field105.method1749(25752, arg0);
        this.field105.method1765(var6, (byte) 21);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method211((byte) 112, this.field104, var8, 0);
            var6.method213((byte) -127, 0);
            if (!var6.method220(-16793)) {
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
        var6.method231((byte) -128, 0);
        this.field105.method1782(var6, true);
        this.field105.method1756(1, 106);
        this.field105.method1749(25752, null);
        this.field105.method1741(8448, (byte) 114, 8448);
        this.field105.method1756(0, -128);
        this.field105.method1749(arg3 + 25751, null);
        OpenGL.glPopAttrib();
        this.field105.method571(class133.field1954[0], class133.field1954[1], class133.field1954[2], class133.field1954[3]);
        if (var5 && !this.field105.field3963) {
            this.field104.method1207(arg3);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Ltt;I)V", line = 257)
    public class9(class249 arg0, int arg1) {
        this.field105 = arg0;
        this.field104 = new class32(arg0, 6408, arg1);
    }
}
