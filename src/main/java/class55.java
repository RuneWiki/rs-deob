import jaggl.OpenGL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class55 extends class478 {

    @OriginalMember(owner = "client!aw", name = "z", descriptor = "I")
    private int field698 = -1;

    @OriginalMember(owner = "client!aw", name = "C", descriptor = "I")
    private int field701 = -1;

    @OriginalMember(owner = "client!aw", name = "w", descriptor = "I")
    public int field695;

    @OriginalMember(owner = "client!aw", name = "x", descriptor = "Ljava/util/Random;")
    public static Random field696 = new Random();

    @OriginalMember(owner = "client!aw", name = "D", descriptor = "Lsa;")
    public static class140 field702 = new class140();

    @OriginalMember(owner = "client!aw", name = "y", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!aw", name = "A", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!aw", name = "B", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!aw", name = "E", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lih;IIZ[[BI)V", line = 7)
    public class55(class503 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field695 = arg2;
        super.field6649.method2968(this, -102);
        for (int var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Dub(34069 - -var7, 0, super.field6670, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method2762(9728, true);
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIIII)V", line = 26)
    public final void method459(int arg0, int arg1, int arg2, int arg3, int arg4) {
        OpenGL.glFramebufferTexture2DEXT(arg2, arg4, arg3, super.field6651, arg0);
        ++field699;
        this.field701 = arg2;
        this.field698 = arg4;
        if (arg1 >= -93) {
            field702 = null;
        }
    }

    @OriginalMember(owner = "client!aw", name = "f", descriptor = "(I)V", line = 39)
    public static void method460(int arg0) {
        field696 = null;
        if (arg0 != 32993) {
            method461(24, -109, -36, 38, -17, -6, 107);
        }
        field702 = null;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIIIIII)V", line = 50)
    public static final void method461(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field697;
        if (arg3 - arg1 >= class392.field5514 && class518.field7624 >= arg3 - -arg1 && ~(-arg1 + arg4) <= ~class303.field4422 && ~(arg1 + arg4) >= ~class353.field5062) {
            class326.method1966(arg5, arg2, arg1, arg6, arg3, 262144, arg4);
        } else {
            class488.method2814(arg2, arg3, arg5, 2, arg1, arg4, arg6);
        }
        if (arg0 != 0) {
            method461(-18, 13, 92, 18, 119, 8, 81);
        }
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lih;IIZ[[I)V", line = 85)
    public class55(class503 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field695 = arg2;
        super.field6649.method2968(this, -114);
        if (arg3) {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                class57.method475(var6 + 34069, 32993, arg4[var6], arg2, arg2, super.field6649.field7442, 1479619105, super.field6670);
            }
        } else {
            for (int var7 = 0; var7 < 6; ++var7) {
                OpenGL.glTexImage2Di(var7 + 34069, 0, super.field6670, arg2, arg2, 0, 32993, super.field6649.field7442, arg4[var7], 0);
            }
        }
        this.method2762(9728, true);
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lih;II)V", line = 116)
    public class55(class503 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field695 = arg2;
        super.field6649.method2968(this, -44);
        for (int var4 = 0; ~var4 > -7; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field6670, arg2, arg2, 0, class527.method3110(super.field6670, 6410), 5121, (byte[]) null, 0);
        }
        this.method2762(9728, true);
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V", line = 72)
    public final void method462(int arg0) {
        ++field700;
        if (arg0 != -1259451258) {
            method461(-10, -43, -58, -95, -128, 24, 111);
        }
        OpenGL.glFramebufferTexture2DEXT(this.field701, this.field698, 3553, 0, 0);
        this.field698 = -1;
        this.field701 = -1;
    }
}
