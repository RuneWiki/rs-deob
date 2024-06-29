import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class531 {

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public int field7444;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field7442 = 0;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
    public static int field7446 = -1;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field7441;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field7443;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public static int field7445;

    @OriginalMember(owner = "client!tl", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7441++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class531(String arg0, int arg1) {
        this.field7444 = arg1;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I[BIIIII)V")
    public static final void method3056(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7445++;
        if (arg6 > 0 && !class130.method886(1, arg6)) {
            throw new IllegalArgumentException("");
        } else if (arg0 <= 0 || class130.method886(1, arg0)) {
            int var7 = class23.method261(2941, arg5);
            int var8 = 0;
            int var9 = -93 % ((-arg2 - 70) / 55);
            int var10 = arg6 >= arg0 ? arg0 : arg6;
            int var11 = arg6 >> 1;
            int var12 = arg0 >> 1;
            byte[] var13 = arg1;
            byte[] var14 = new byte[var11 * var12 * var7];
            while (true) {
                OpenGL.glTexImage2Dub(arg3, var8, arg4, arg6, arg0, 0, arg5, 5121, var13, 0);
                if (var10 <= 1) {
                    return;
                }
                int var15 = arg6 * var7;
                byte[] var16 = var14;
                for (int var17 = 0; var17 < var7; var17++) {
                    int var18 = var17;
                    int var19 = var17;
                    int var20 = var15 + var17;
                    for (int var21 = 0; var21 < var12; var21++) {
                        for (int var22 = 0; var22 < var11; var22++) {
                            byte var23 = var13[var19];
                            int var24 = var7 + var19;
                            int var25 = var13[var24] + var23;
                            int var26 = var13[var20] + var25;
                            var19 = var7 + var24;
                            int var27 = var7 + var20;
                            int var28 = var13[var27] + var26;
                            var14[var18] = (byte) (var28 >> 2);
                            var20 = var7 + var27;
                            var18 += var7;
                        }
                        var19 += var15;
                        var20 += var15;
                    }
                }
                var14 = var13;
                arg0 = var12;
                arg6 = var11;
                var13 = var16;
                var10 >>= 0x1;
                var11 >>= 0x1;
                var12 >>= 0x1;
                var8++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IBII)Lbe;")
    public static final class33 method3057(int arg0, byte arg1, int arg2, int arg3) {
        field7443++;
        class622 var4 = class356.field4807[arg2][arg3][arg0];
        if (var4 == null) {
            return null;
        }
        class33 var5 = null;
        int var6 = -1;
        for (class559 var7 = var4.field8973; var7 != null; var7 = var7.field7736) {
            class425 var8 = var7.field7742;
            if (var8 instanceof class33) {
                class33 var9 = (class33) var8;
                int var10 = var9.method337(arg1 ^ 0xFFFFFFB7) * 64 + 60 - 64;
                int var11 = var9.field6037 - var10 >> 7;
                int var12 = var9.field6029 - var10 >> 7;
                int var13 = var9.field6037 + var10 >> 7;
                int var14 = var9.field6029 + var10 >> 7;
                if (var11 <= arg3 && arg0 >= var12 && arg3 <= var13 && arg0 <= var14) {
                    int var15 = (var13 + 1 - arg3) * (var14 + 1 - arg0);
                    if (var15 > var6) {
                        var6 = var15;
                        var5 = var9;
                    }
                }
            }
        }
        if (arg1 != -73) {
            method3056(62, null, 64, 54, -107, 88, -43);
        }
        return var5;
    }

    static {
        new class104("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
    }
}
