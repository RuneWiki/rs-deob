import jaggl.OpenGL;
import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class392 extends class615 {

    @OriginalMember(owner = "client!gba", name = "s", descriptor = "I")
    private int field4929 = -1;

    @OriginalMember(owner = "client!gba", name = "F", descriptor = "I")
    private int field4941 = -1;

    @OriginalMember(owner = "client!gba", name = "B", descriptor = "I")
    public int field4938;

    @OriginalMember(owner = "client!gba", name = "x", descriptor = "I")
    public int field4934;

    @OriginalMember(owner = "client!gba", name = "D", descriptor = "I")
    public int field4939;

    @OriginalMember(owner = "client!gba", name = "t", descriptor = "Ltb;")
    public static class450 field4930 = new class450(4);

    @OriginalMember(owner = "client!gba", name = "H", descriptor = "[I")
    public static int[] field4943 = new int[2048];

    @OriginalMember(owner = "client!gba", name = "u", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!gba", name = "v", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!gba", name = "w", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!gba", name = "y", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!gba", name = "z", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!gba", name = "A", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!gba", name = "G", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!gba", name = "E", descriptor = "Lgl;")
    public static class646 field4940;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gba", name = "I", descriptor = "Ljava/lang/Class;")
    public static Class field4944;

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "([BI)Z")
    public static final boolean method2102(byte[] arg0, int arg1) {
        ++field4933;
        class630 var2 = new class630(arg0);
        int var3 = var2.method3501(-9268);
        if (var3 != 2) {
            return false;
        } else {
            boolean var4 = ~var2.method3501(-9268) == arg1;
            if (var4) {
                class705.method3951(112, var2);
            }
            class322.method1845(var2, 6130);
            return true;
        }
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lqj;IIII)V")
    public class392(class548 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field4938 = arg4;
        this.field4934 = arg3;
        this.field4939 = arg2;
        super.field8644.method2960(this, -2);
        OpenGL.glTexImage3Dub(super.field8638, 0, super.field8640, this.field4939, this.field4934, this.field4938, 0, class568.method3141(super.field8640, (byte) 29), 5121, (byte[]) null, 0);
        this.method3396(true, 17137);
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lqi;I)V")
    public static final void method2103(class514 arg0, int arg1) {
        ++field4936;
        class164 var2 = (class164) class646.field9086.method399(-32748, (long) arg0.field9676);
        if (var2 == null) {
            class57.method364(-119, arg0, (class441) null, 0, (class307) null, arg0.field9758[0], arg0.field9754[0], arg0.field6470);
        } else {
            var2.method937((byte) -99);
        }
        int var3 = -2 / ((-46 - arg1) / 63);
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(I)V")
    public final void method216(int arg0) {
        OpenGL.glFramebufferTexture3DEXT(this.field4929, this.field4941, super.field8638, 0, 0, 0);
        ++field4932;
        this.field4929 = -1;
        this.field4941 = -1;
        if (arg0 != 29468) {
            field4940 = null;
        }
    }

    @OriginalMember(owner = "client!gba", name = "d", descriptor = "(I)V")
    public static void method2104(int arg0) {
        field4940 = null;
        if (arg0 != -1) {
            field4930 = null;
        }
        field4930 = null;
        field4943 = null;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IIIIIIII)V")
    public final void method2105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        super.field8644.method2960(this, -2);
        ++field4937;
        OpenGL.glCopyTexSubImage3D(super.field8638, arg7, arg4, arg0, arg2, arg6, arg5, arg1, arg3);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IZLjava/io/File;)V")
    public static final void method2106(int arg0, boolean arg1, File arg2) {
        if (class288.field3583 == null) {
            class6.method51(-30983);
        }
        ++field4931;
        try {
            if (arg0 == -4496) {
                Class var3 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
                Method var4 = var3.getDeclaredMethod("dumpHeap", field4944 != null ? field4944 : (field4944 = method2107("java.lang.String")), Boolean.TYPE);
                var4.invoke(class288.field3583, arg2.getAbsolutePath(), new Boolean(arg1));
            }
        } catch (Exception var6) {
            System.out.println("HeapDump error:");
            var6.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lqj;IIII[BI)V")
    public class392(class548 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        this.field4938 = arg4;
        this.field4939 = arg2;
        this.field4934 = arg3;
        super.field8644.method2960(this, -2);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field8638, 0, super.field8640, this.field4939, this.field4934, this.field4938, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method3396(true, 17137);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2107(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
