import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class62 extends class292 {

    @OriginalMember(owner = "client!dl", name = "y", descriptor = "I")
    private int field636 = -1;

    @OriginalMember(owner = "client!dl", name = "A", descriptor = "I")
    private int field638 = -1;

    @OriginalMember(owner = "client!dl", name = "w", descriptor = "I")
    public int field634;

    @OriginalMember(owner = "client!dl", name = "x", descriptor = "I")
    public int field635;

    @OriginalMember(owner = "client!dl", name = "t", descriptor = "I")
    public int field631;

    @OriginalMember(owner = "client!dl", name = "u", descriptor = "[Z")
    public static boolean[] field632 = new boolean[200];

    @OriginalMember(owner = "client!dl", name = "C", descriptor = "[Lgt;")
    public static class454[] field640 = new class454[5];

    @OriginalMember(owner = "client!dl", name = "D", descriptor = "I")
    public static int field641 = 1;

    @OriginalMember(owner = "client!dl", name = "v", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!dl", name = "z", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!dl", name = "B", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!dl", name = "E", descriptor = "I")
    public static int field642;

    static {
        for (int var0 = 0; var0 < field640.length; ++var0) {
            field640[var0] = new class454();
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lnv;IIII)V", line = 8)
    public class62(class417 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field634 = arg2;
        this.field635 = arg4;
        this.field631 = arg3;
        super.field3603.method2621(-2, this);
        OpenGL.glTexImage3Dub(super.field3591, 0, super.field3593, this.field634, this.field631, this.field635, 0, class311.method1848(-34845, super.field3593), 5121, (byte[]) null, 0);
        this.method1742(true, 29646);
    }

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "(I)V", line = 23)
    public static final void method468(int arg0) {
        for (int var1 = arg0; class302.field3784 > var1; ++var1) {
            int var2 = class272.field3359[var1];
            class151 var3 = (class151) class253.field3052.method1754(false, (long) var2);
            if (var3 != null) {
                class197 var4 = var3.field1661;
                class606.method3440(var4, (byte) -58, var4.field2293.field4227);
            }
        }
        ++field639;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lnv;IIII[BI)V", line = 50)
    public class62(class417 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg3 * arg4 * arg2, false);
        this.field634 = arg2;
        this.field631 = arg3;
        this.field635 = arg4;
        super.field3603.method2621(-2, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field3591, 0, super.field3593, this.field634, this.field631, this.field635, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1742(true, 29646);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIBIIII)V", line = 66)
    public final void method469(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = -71 / ((arg3 - -43) / 36);
        ++field642;
        super.field3603.method2621(-2, this);
        OpenGL.glCopyTexSubImage3D(super.field3591, 0, arg6, arg5, arg7, arg1, arg2, arg0, arg4);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V", line = 83)
    public final void method66(int arg0) {
        int var2 = -37 / ((80 - arg0) / 44);
        ++field637;
        OpenGL.glFramebufferTexture3DEXT(this.field638, this.field636, super.field3591, 0, 0, 0);
        this.field638 = -1;
        this.field636 = -1;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(CI)C", line = 97)
    public static final char method470(char arg0, int arg1) {
        ++field633;
        if (arg0 == 198) {
            return 'E';
        } else {
            int var2 = -84 % ((arg1 - 55) / 53);
            if (~arg0 == -231) {
                return 'e';
            } else if (~arg0 == -224) {
                return 's';
            } else if (arg0 == 338) {
                return 'E';
            } else {
                return (char) (arg0 == 339 ? 'e' : '\u0000');
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)V", line = 126)
    public static void method471(boolean arg0) {
        field632 = null;
        field640 = null;
        if (!arg0) {
            method470('~', 110);
        }
    }
}
