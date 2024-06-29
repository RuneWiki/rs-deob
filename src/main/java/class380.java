import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class380 extends class40 {

    @OriginalMember(owner = "client!md", name = "C", descriptor = "I")
    private int field5555 = -1;

    @OriginalMember(owner = "client!md", name = "F", descriptor = "I")
    private int field5558 = -1;

    @OriginalMember(owner = "client!md", name = "x", descriptor = "I")
    public int field5551;

    @OriginalMember(owner = "client!md", name = "D", descriptor = "I")
    public int field5556;

    @OriginalMember(owner = "client!md", name = "w", descriptor = "I")
    public int field5550;

    @OriginalMember(owner = "client!md", name = "E", descriptor = "I")
    public static int field5557 = -1;

    @OriginalMember(owner = "client!md", name = "H", descriptor = "Lqp;")
    public static class466 field5560 = new class466("K", "T", "K", "K");

    @OriginalMember(owner = "client!md", name = "t", descriptor = "I")
    public static int field5547;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!md", name = "y", descriptor = "I")
    public static int field5552;

    @OriginalMember(owner = "client!md", name = "z", descriptor = "I")
    public static int field5553;

    @OriginalMember(owner = "client!md", name = "A", descriptor = "I")
    public static int field5554;

    @OriginalMember(owner = "client!md", name = "G", descriptor = "I")
    public static int field5559;

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lef;IIII)V", line = 3)
    public class380(class338 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg3 * arg4 * arg2, false);
        this.field5551 = arg3;
        this.field5556 = arg4;
        this.field5550 = arg2;
        super.field503.method1996(2, this);
        OpenGL.glTexImage3Dub(super.field505, 0, super.field496, this.field5550, this.field5551, this.field5556, 0, class217.method1344(super.field496, (byte) 127), 5121, (byte[]) null, 0);
        this.method335((byte) 51, true);
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lef;IIII[BI)V", line = 20)
    public class380(class338 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        this.field5550 = arg2;
        this.field5556 = arg4;
        this.field5551 = arg3;
        super.field503.method1996(2, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field505, 0, super.field496, this.field5550, this.field5551, this.field5556, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method335((byte) 51, true);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljn;B)Z", line = 35)
    public static final boolean method2252(class503 arg0, byte arg1) {
        ++field5549;
        class220 var2 = class78.field1141.method2103(arg0.method490(-29679), true);
        if (var2.field3093 == -1) {
            return true;
        } else {
            class256 var3 = class227.field3232.method2423(var2.field3093, 64);
            if (arg1 != 72) {
                method2257(false, (class391) null);
            }
            return var3.field3555 == -1 ? true : var3.method1541((byte) -90);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)Z", line = 60)
    public static final boolean method2253(int arg0, int arg1) {
        if (arg1 != -1) {
            method2257(true, (class391) null);
        }
        ++field5552;
        return ~arg0 == -3 || ~arg0 == -4;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIII)V", line = 76)
    public static final void method2254(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class20.field269.field7650 != 0 && ~arg2 != -1 && class228.field3242 < 50 && arg4 != -1) {
            class275.field3767[class228.field3242++] = new class233((byte) 1, arg4, arg2, arg0, arg1, arg5);
        }
        ++field5547;
        if (arg3 != -1) {
            field5560 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "f", descriptor = "(I)V", line = 96)
    public static void method2255(int arg0) {
        field5560 = null;
        if (arg0 < 93) {
            field5559 = 4;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V", line = 107)
    public final void method332(byte arg0) {
        ++field5548;
        if (arg0 != 37) {
            this.method2256(66, -21, 70, 2, 87, -16, -71, (byte) -122);
        }
        OpenGL.glFramebufferTexture3DEXT(this.field5555, this.field5558, super.field505, 0, 0, 0);
        this.field5558 = -1;
        this.field5555 = -1;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIIIB)V", line = 131)
    public final void method2256(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        ++field5554;
        super.field503.method1996(2, this);
        if (arg7 != 77) {
            method2252((class503) null, (byte) 18);
        }
        OpenGL.glCopyTexSubImage3D(super.field505, 0, arg6, arg5, arg4, arg1, arg3, arg0, arg2);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZLsi;)Ljava/lang/String;", line = 144)
    public static final String method2257(boolean arg0, class391 arg1) {
        if (!arg0) {
            return null;
        } else {
            ++field5553;
            return class148.method992(-64, 32767, arg1);
        }
    }
}
