import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class427 extends class396 {

    @OriginalMember(owner = "client!cf", name = "C", descriptor = "I")
    private int field6298 = -1;

    @OriginalMember(owner = "client!cf", name = "D", descriptor = "I")
    private int field6299 = -1;

    @OriginalMember(owner = "client!cf", name = "H", descriptor = "I")
    public int field6303;

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "I")
    public int field6296;

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "I")
    public int field6294;

    @OriginalMember(owner = "client!cf", name = "E", descriptor = "Lbg;")
    public static class324 field6300 = new class324(30, 3);

    @OriginalMember(owner = "client!cf", name = "I", descriptor = "Llt;")
    public static class475 field6304 = new class475(128);

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "I")
    public static int field6293;

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "I")
    public static int field6295;

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "I")
    public static int field6297;

    @OriginalMember(owner = "client!cf", name = "F", descriptor = "I")
    public static int field6301;

    @OriginalMember(owner = "client!cf", name = "G", descriptor = "I")
    public static int field6302;

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lfd;IIII[BI)V", line = 6)
    public class427(class365 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg3 * arg4 * arg2, false);
        this.field6303 = arg3;
        this.field6296 = arg4;
        this.field6294 = arg2;
        super.field5800.method2188((byte) 78, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field5801, 0, super.field5804, this.field6294, this.field6303, this.field6296, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2421(85, true);
    }

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)V", line = 21)
    public static final void method2603(int arg0) {
        ++field6297;
        class429.field6321.method1105(false);
        if (arg0 != 1) {
            method2603(-101);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V", line = 33)
    public final void method1628(int arg0) {
        if (arg0 >= 121) {
            OpenGL.glFramebufferTexture3DEXT(this.field6298, this.field6299, super.field5801, 0, 0, 0);
            ++field6293;
            this.field6299 = -1;
            this.field6298 = -1;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II[Luu;)V", line = 47)
    public static final void method2604(int arg0, int arg1, class188[] arg2) {
        if (arg1 < 35) {
            field6300 = null;
        }
        for (int var3 = 0; ~arg2.length < ~var3; ++var3) {
            class188 var4 = arg2[var3];
            if (var4 != null) {
                if (~var4.field2727 == -1) {
                    if (var4.field2758 != null) {
                        method2604(arg0, 122, var4.field2758);
                    }
                    class305 var5 = (class305) class49.field545.method875((long) var4.field2678, 126);
                    if (var5 != null) {
                        class389.method2393(var5.field4333, -1, arg0);
                    }
                }
                if (arg0 == 0 && var4.field2716 != null) {
                    class125 var6 = new class125();
                    var6.field1833 = var4.field2716;
                    var6.field1830 = var4;
                    class41.method409(var6);
                }
                if (~arg0 == -2 && var4.field2623 != null) {
                    if (var4.field2773 >= 0) {
                        class188 var7 = class371.method2286(0, var4.field2678);
                        if (var7 == null || var7.field2758 == null || var4.field2773 >= var7.field2758.length || var7.field2758[var4.field2773] != var4) {
                            continue;
                        }
                    }
                    class125 var8 = new class125();
                    var8.field1830 = var4;
                    var8.field1833 = var4.field2623;
                    class41.method409(var8);
                }
            }
        }
        ++field6301;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)I", line = 121)
    public static final int method2605(int arg0, int arg1, int arg2) {
        if (arg0 <= 98) {
            method2606((byte) 51);
        }
        int var3 = (127 & arg1) * arg2 >> 7;
        ++field6295;
        if (var3 >= 2) {
            if (var3 > 126) {
                var3 = 126;
            }
        } else {
            var3 = 2;
        }
        return (arg1 & 65408) + var3;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V", line = 143)
    public static void method2606(byte arg0) {
        field6300 = null;
        if (arg0 != 76) {
            field6300 = null;
        }
        field6304 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIBII)V", line = 154)
    public final void method2607(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        ++field6302;
        super.field5800.method2188((byte) 78, this);
        if (arg5 != -9) {
            this.method2607(64, 57, 63, 83, -112, (byte) 35, -38, 114);
        }
        OpenGL.glCopyTexSubImage3D(super.field5801, 0, arg1, arg0, arg4, arg7, arg2, arg3, arg6);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lfd;IIII)V", line = 176)
    public class427(class365 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field6296 = arg4;
        this.field6294 = arg2;
        this.field6303 = arg3;
        super.field5800.method2188((byte) 78, this);
        OpenGL.glTexImage3Dub(super.field5801, 0, super.field5804, this.field6294, this.field6303, this.field6296, 0, class454.method2741(super.field5804, 13519), 5121, (byte[]) null, 0);
        this.method2421(99, true);
    }
}
