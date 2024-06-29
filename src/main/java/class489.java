import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class489 {

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
    public int field7400;

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "Lnj;")
    public static class487 field7402 = new class487("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "[I")
    public static int[] field7403 = new int[1];

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "[F")
    public static float[] field7404 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!jt", name = "g", descriptor = "I")
    public static int field7405 = 0;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "I")
    public static int field7399;

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "I")
    public static int field7401;

    @OriginalMember(owner = "client!jt", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7399++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(I)V")
    public class489(int arg0) {
        this.field7400 = arg0;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)V")
    public static void method2961(int arg0) {
        if (arg0 == 0) {
            field7404 = null;
            field7403 = null;
            field7402 = null;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIIIII)V")
    public static final void method2962(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var9 = arg2 + 1;
        class69.method418(arg3, class47.field558[arg2], arg4, (byte) 117, arg5);
        field7401++;
        int var8 = arg1 - 1;
        class69.method418(arg3, class47.field558[arg1], arg4, (byte) 117, arg5);
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class47.field558[var6];
            var7[arg5] = var7[arg4] = arg3;
        }
        if (arg0 > -100) {
            method2962(66, 52, -52, -64, -7, 117);
        }
    }
}
