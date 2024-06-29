import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public abstract class class510 {

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "Ljo;")
    public static class382 field7491 = new class382(20);

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "Ljava/lang/String;")
    public static String field7492 = null;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "Luv;")
    public static class2 field7493 = new class2(54, 14);

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field7495 = 0;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "Ldp;")
    public static class347 field7494 = new class347("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field7489;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "Lm;")
    public static class80 field7490;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
    public static void method3010(int arg0) {
        if (arg0 != -7489) {
            return;
        }
        field7491 = null;
        field7490 = null;
        field7494 = null;
        field7492 = null;
        field7493 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIZIIIIII)V")
    public static final void method3011(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == arg6 && arg8 == arg9 && arg1 == arg5 && arg2 == arg7) {
            class29.method267(arg5, arg4, (byte) -29, arg8, arg7, arg0);
        } else {
            int var10 = arg0;
            int var11 = arg8;
            int var12 = arg0 * 3;
            int var13 = arg8 * 3;
            int var14 = arg6 * 3;
            int var15 = arg9 * 3;
            int var16 = arg1 * 3;
            int var17 = arg2 * 3;
            int var18 = arg5 + var14 - arg0 - var16;
            int var19 = arg7 + var15 - var17 - arg8;
            int var20 = var16 - var14 - (var14 - var12);
            int var21 = var13 + var17 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var31 >> 12) + arg0;
                int var34 = (var28 - (-var30 - var32) >> 12) + arg8;
                class29.method267(var33, arg4, (byte) 123, var11, var34, var10);
                var10 = var33;
                var11 = var34;
            }
        }
        field7489++;
        if (arg3) {
            method3010(40);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(FB[FIFFIIFII)V")
    public abstract void method16(float arg0, byte arg1, float[] arg2, int arg3, float arg4, float arg5, int arg6, int arg7, float arg8, int arg9, int arg10);
}
