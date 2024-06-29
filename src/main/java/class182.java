import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public class class182 extends class87 {

    @OriginalMember(owner = "client!efa", name = "x", descriptor = "I")
    private int field2596 = -1;

    @OriginalMember(owner = "client!efa", name = "F", descriptor = "I")
    private int field2604 = -1;

    @OriginalMember(owner = "client!efa", name = "I", descriptor = "I")
    public int field2607;

    @OriginalMember(owner = "client!efa", name = "y", descriptor = "I")
    public int field2597;

    @OriginalMember(owner = "client!efa", name = "w", descriptor = "I")
    public int field2595;

    @OriginalMember(owner = "client!efa", name = "z", descriptor = "Lqe;")
    public static class465 field2598 = new class465(114, -2);

    @OriginalMember(owner = "client!efa", name = "G", descriptor = "Z")
    public static boolean field2605 = false;

    @OriginalMember(owner = "client!efa", name = "D", descriptor = "I")
    public static int field2602 = -1;

    @OriginalMember(owner = "client!efa", name = "C", descriptor = "[I")
    public static int[] field2601 = new int[2];

    @OriginalMember(owner = "client!efa", name = "v", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!efa", name = "A", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!efa", name = "B", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!efa", name = "E", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!efa", name = "H", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(ZIIIIIII)V")
    public final void method1302(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        super.field1571.method3425(this, 124);
        if (!arg0) {
            ++field2599;
            OpenGL.glCopyTexSubImage3D(super.field1567, 0, arg3, arg7, arg1, arg6, arg4, arg2, arg5);
            OpenGL.glFlush();
        }
    }

    @OriginalMember(owner = "client!efa", name = "<init>", descriptor = "(Loea;IIII[BI)V")
    public class182(class594 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field2607 = arg2;
        this.field2597 = arg4;
        this.field2595 = arg3;
        super.field1571.method3425(this, 119);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field1567, 0, super.field1562, this.field2607, this.field2595, this.field2597, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method818(true, (byte) 11);
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(I)V")
    public final void method827(int arg0) {
        ++field2600;
        OpenGL.glFramebufferTexture3DEXT(this.field2596, this.field2604, super.field1567, arg0, 0, 0);
        this.field2604 = -1;
        this.field2596 = -1;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(I[Ldm;ZIZI)V")
    public static final void method1303(int arg0, class50[] arg1, boolean arg2, int arg3, boolean arg4, int arg5) {
        ++field2594;
        for (int var6 = 0; var6 < arg1.length; ++var6) {
            class50 var7 = arg1[var6];
            if (var7 != null && ~var7.field791 == ~arg0) {
                class284.method1857(arg5, arg3, arg2, var7, -1031130194);
                class47.method430(arg5, true, arg3, var7);
                if (~var7.field790 < ~(-var7.field783 + var7.field796)) {
                    var7.field790 = -var7.field783 + var7.field796;
                }
                if (-var7.field830 + var7.field779 < var7.field869) {
                    var7.field869 = -var7.field830 + var7.field779;
                }
                if (var7.field790 < 0) {
                    var7.field790 = 0;
                }
                if (var7.field869 < 0) {
                    var7.field869 = 0;
                }
                if (var7.field765 == 0) {
                    class756.method4196((byte) 91, arg2, var7);
                }
            }
        }
        if (arg4) {
            field2598 = null;
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(JJ)J")
    public static long method1304(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!efa", name = "e", descriptor = "(I)V")
    public static void method1305(int arg0) {
        field2601 = null;
        if (arg0 < 57) {
            method1305(-116);
        }
        field2598 = null;
    }

    @OriginalMember(owner = "client!efa", name = "f", descriptor = "(I)Leo;")
    public static final class296 method1306(int arg0) {
        ++field2603;
        if (arg0 != -1) {
            method1305(82);
        }
        class296 var1 = (class296) class359.field5043.method4157((byte) 40);
        if (var1 != null) {
            --class592.field8310;
            return var1;
        } else {
            return new class296();
        }
    }

    @OriginalMember(owner = "client!efa", name = "<init>", descriptor = "(Loea;IIII)V")
    public class182(class594 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg3 * arg4 * arg2, false);
        this.field2595 = arg3;
        this.field2597 = arg4;
        this.field2607 = arg2;
        super.field1571.method3425(this, 115);
        OpenGL.glTexImage3Dub(super.field1567, 0, super.field1562, this.field2607, this.field2595, this.field2597, 0, class634.method3649(super.field1562, (byte) -103), 5121, (byte[]) null, 0);
        this.method818(true, (byte) 11);
    }
}
