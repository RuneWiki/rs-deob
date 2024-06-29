import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class718 extends class56 {

    @OriginalMember(owner = "client!jn", name = "F", descriptor = "I")
    private int field9970 = 0;

    @OriginalMember(owner = "client!jn", name = "I", descriptor = "I")
    private int field9973 = 4096;

    @OriginalMember(owner = "client!jn", name = "D", descriptor = "I")
    public static int field9969;

    @OriginalMember(owner = "client!jn", name = "G", descriptor = "I")
    public static int field9971;

    @OriginalMember(owner = "client!jn", name = "H", descriptor = "I")
    public static int field9972;

    @OriginalMember(owner = "client!jn", name = "J", descriptor = "I")
    public static int field9974;

    @OriginalMember(owner = "client!jn", name = "K", descriptor = "[I")
    public static int[] field9975;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IZ)[I")
    public final int[] method24(int arg0, boolean arg1) {
        if (!arg1) {
            method4037(3);
        }
        ++field9972;
        int[] var3 = super.field673.method3270(arg0, (byte) -42);
        if (super.field673.field8073) {
            int[] var4 = this.method367(4463, 0, arg0);
            for (int var5 = 0; class328.field4576 > var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~var6 <= ~this.field9970 && var6 <= this.field9973 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILd;Ljava/awt/Canvas;ILfp;)Lha;")
    public static final class58 method4035(int arg0, class149 arg1, Canvas arg2, int arg3, class323 arg4) {
        ++field9974;
        if (!class221.method1351(1)) {
            throw new RuntimeException("");
        } else if (!class608.method3425("jaggl", true)) {
            throw new RuntimeException("");
        } else {
            OpenGL var5 = new OpenGL();
            if (arg3 != -31955) {
                return null;
            } else {
                long var6 = var5.init(arg2, 8, 8, 8, 24, 0, arg0);
                if (var6 == 0L) {
                    throw new RuntimeException("");
                } else {
                    class378 var8 = new class378(var5, arg2, var6, arg1, arg4, arg0);
                    var8.method1592((byte) 55);
                    return var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILee;I)V")
    public final void method6(int arg0, class675 arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field9973 = arg1.method3757((byte) -65);
            }
        } else {
            this.field9970 = arg1.method3757((byte) -65);
        }
        if (arg0 != 3731) {
            this.field9970 = -108;
        }
        ++field9969;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZII)V")
    public static final void method4036(boolean arg0, int arg1, int arg2) {
        ++field9971;
        if (!arg0) {
            field9975 = null;
        }
        if (class117.field1421 != 1) {
            if (~class117.field1421 == -3) {
                if (class589.field8295) {
                    class3.method14(class575.method3288((byte) -127) + arg2, 118, arg1 - -class171.method1102(5467));
                } else {
                    class3.method14(arg2, 118, arg1);
                }
            }
        } else {
            class209.method1277((byte) -47, arg1, class38.field482, arg2);
        }
        class38.field482 = null;
        class117.field1421 = 0;
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "()V")
    public class718() {
        super(1, true);
    }

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "(I)V")
    public static void method4037(int arg0) {
        field9975 = null;
        if (arg0 != 2535) {
            method4037(11);
        }
    }
}
