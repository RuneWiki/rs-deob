import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class447 extends class238 {

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "I")
    private int field6193 = -1;

    @OriginalMember(owner = "client!lh", name = "E", descriptor = "I")
    private int field6202 = -1;

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "I")
    public int field6195;

    @OriginalMember(owner = "client!lh", name = "y", descriptor = "I")
    public int field6196;

    @OriginalMember(owner = "client!lh", name = "B", descriptor = "I")
    public int field6199;

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "I")
    public static int field6192 = 1403;

    @OriginalMember(owner = "client!lh", name = "F", descriptor = "Z")
    public static boolean field6203 = false;

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "Lvj;")
    public static class373 field6197 = new class373(45, -1);

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "I")
    public static int field6194;

    @OriginalMember(owner = "client!lh", name = "C", descriptor = "I")
    public static int field6200;

    @OriginalMember(owner = "client!lh", name = "D", descriptor = "I")
    public static int field6201;

    @OriginalMember(owner = "client!lh", name = "G", descriptor = "I")
    public static int field6204;

    @OriginalMember(owner = "client!lh", name = "A", descriptor = "Lpq;")
    public static class165 field6198;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIIZI)V")
    public final void method2617(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        ++field6201;
        super.field2988.method3083((byte) 102, this);
        if (!arg6) {
            this.method2617(73, -97, -17, -107, 79, 55, true, -33);
        }
        OpenGL.glCopyTexSubImage3D(super.field2973, 0, arg2, arg5, arg7, arg4, arg0, arg1, arg3);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILdn;II)Lei;")
    public static final class152 method2618(int arg0, class438 arg1, int arg2, int arg3) {
        ++field6194;
        if (arg2 != 3317) {
            return null;
        } else {
            byte[] var4 = arg1.method2558(100, arg3, arg0);
            return var4 == null ? null : new class152(var4);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
    public final void method112(byte arg0) {
        OpenGL.glFramebufferTexture3DEXT(this.field6193, this.field6202, super.field2973, 0, 0, 0);
        ++field6204;
        this.field6202 = -1;
        this.field6193 = -1;
        if (arg0 != 53) {
            this.field6196 = -74;
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lmh;IIII)V")
    public class447(class537 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field6195 = arg3;
        this.field6196 = arg4;
        this.field6199 = arg2;
        super.field2988.method3083((byte) 82, this);
        OpenGL.glTexImage3Dub(super.field2973, 0, super.field2990, this.field6199, this.field6195, this.field6196, 0, class13.method105(6410, super.field2990), 5121, (byte[]) null, 0);
        this.method1358((byte) 118, true);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(III)V")
    public static final void method2619(int arg0, int arg1, int arg2) {
        ++field6200;
        ++class365.field4799;
        class418.method2378(17984, class631.field9075);
        if (arg2 != 45) {
            field6203 = true;
        }
        class136.field1663.method2130(arg2 + -45, arg1);
        class136.field1663.method2115(arg0, 3324);
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lmh;IIII[BI)V")
    public class447(class537 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field6196 = arg4;
        this.field6195 = arg3;
        this.field6199 = arg2;
        super.field2988.method3083((byte) 80, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field2973, 0, super.field2990, this.field6199, this.field6195, this.field6196, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1358((byte) -112, true);
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(B)V")
    public static void method2620(byte arg0) {
        field6197 = null;
        int var1 = -83 % (-arg0 / 33);
        field6198 = null;
    }
}
