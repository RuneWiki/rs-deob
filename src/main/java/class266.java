import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class266 extends class194 {

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "I")
    private int field4025 = -1;

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "I")
    private int field4028 = -1;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
    public int field4022;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "I")
    public int field4024;

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "I")
    public int field4030;

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "[I")
    public static int[] field4032 = new int[50];

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "Loe;")
    public static class127 field4029 = new class127(74, -2);

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "[I")
    public static int[] field4033;

    @OriginalMember(owner = "client!ga", name = "G", descriptor = "Lsk;")
    public static class423 field4034;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "Lwn;")
    public static class488 field4026;

    static {
        new class423((String) null, "die kürzlich gesprochen oder gehandelt haben.", (String) null, (String) null);
        field4033 = new int[] { 1, -1, -1, 1 };
        field4034 = new class423("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIZIII)V", line = 3)
    public final void method1626(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        ++field4023;
        super.field3065.method2586(this, false);
        OpenGL.glCopyTexSubImage3D(super.field3066, 0, arg7, arg6, arg0, arg1, arg3, arg2, arg5);
        OpenGL.glFlush();
        if (!arg4) {
            method1627(17, -125, -8, -85, false, -23, (class458) null);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIZILlt;)V", line = 18)
    public static final void method1627(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class458 arg6) {
        class232.field3525 = arg1;
        class15.field207 = arg0;
        class107.field1871 = arg6;
        class93.field1656 = arg4;
        class275.field4169 = arg3;
        class322.field4842 = 1;
        ++field4031;
        class91.field1639 = class194.field3056.method634((byte) 37) / arg2;
        if (~class91.field1639 > -2) {
            class91.field1639 = 1;
        }
        if (arg5 <= 56) {
            method1629((byte) -103, (class427) null, -107, -37);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V", line = 43)
    public final void method1111(byte arg0) {
        OpenGL.glFramebufferTexture3DEXT(this.field4025, this.field4028, super.field3066, 0, 0, 0);
        ++field4027;
        if (arg0 > -104) {
            field4032 = null;
        }
        this.field4028 = -1;
        this.field4025 = -1;
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(B)V", line = 63)
    public static void method1628(byte arg0) {
        field4033 = null;
        field4032 = null;
        if (arg0 < -18) {
            field4034 = null;
            field4029 = null;
            field4026 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLtq;II)V", line = 78)
    public static final void method1629(byte arg0, class427 arg1, int arg2, int arg3) {
        if (arg0 > -8) {
            field4032 = null;
        }
        ++field4021;
        class28 var4 = arg1.method2512(class345.field5116, (byte) -58);
        if (var4 != null) {
            class345.field5116.method1982(arg3, arg2, arg1.field6175 + arg3, arg1.field6126 + arg2);
            if (class57.field975 >= 3) {
                class345.field5116.method1994(-16777216, var4, arg3, arg2);
            } else {
                class90.field1629.method991((float) arg1.field6175 / 2.0F + (float) arg3, (float) arg1.field6126 / 2.0F + (float) arg2, 4096, (int) (-class23.field289) << 2 & 65532, var4, arg3, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lbl;IIII[BI)V", line = 108)
    public class266(class442 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg3 * arg4 * arg2, false);
        this.field4022 = arg4;
        this.field4024 = arg3;
        this.field4030 = arg2;
        super.field3065.method2586(this, false);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field3066, 0, super.field3067, this.field4030, this.field4024, this.field4022, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1208(true, false);
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lbl;IIII)V", line = 127)
    public class266(class442 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field4024 = arg3;
        this.field4030 = arg2;
        this.field4022 = arg4;
        super.field3065.method2586(this, false);
        OpenGL.glTexImage3Dub(super.field3066, 0, super.field3067, this.field4030, this.field4024, this.field4022, 0, class458.method2735(super.field3067, 22775), 5121, (byte[]) null, 0);
        this.method1208(true, false);
    }
}
