import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class644 {

    @OriginalMember(owner = "client!bea", name = "c", descriptor = "I")
    public static int field9342 = 0;

    @OriginalMember(owner = "client!bea", name = "e", descriptor = "[Z")
    public static boolean[] field9344 = new boolean[100];

    @OriginalMember(owner = "client!bea", name = "i", descriptor = "Lnj;")
    public static class487 field9348;

    @OriginalMember(owner = "client!bea", name = "g", descriptor = "F")
    public static float field9346;

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "I")
    public static int field9341;

    @OriginalMember(owner = "client!bea", name = "d", descriptor = "I")
    public static int field9343;

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "Ldda;")
    public static class597 field9340;

    @OriginalMember(owner = "client!bea", name = "h", descriptor = "Ldda;")
    public static class597 field9347;

    @OriginalMember(owner = "client!bea", name = "f", descriptor = "Ljava/awt/Frame;")
    public static Frame field9345;

    static {
        new class487(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
        new class487("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
        field9348 = new class487("Take", "Nehmen", "Prendre", "Pegar");
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(CI)B", line = 12)
    public static final byte method3724(char arg0, int arg1) {
        field9343++;
        if (arg1 >= -72) {
            return -72;
        }
        byte var2;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            var2 = (byte) arg0;
        } else if (arg0 == '€') {
            var2 = -128;
        } else if (arg0 == '‚') {
            var2 = -126;
        } else if (arg0 == 'ƒ') {
            var2 = -125;
        } else if (arg0 == '„') {
            var2 = -124;
        } else if (arg0 == '…') {
            var2 = -123;
        } else if (arg0 == '†') {
            var2 = -122;
        } else if (arg0 == '‡') {
            var2 = -121;
        } else if (arg0 == 'ˆ') {
            var2 = -120;
        } else if (arg0 == '‰') {
            var2 = -119;
        } else if (arg0 == 'Š') {
            var2 = -118;
        } else if (arg0 == '‹') {
            var2 = -117;
        } else if (arg0 == 'Œ') {
            var2 = -116;
        } else if (arg0 == 'Ž') {
            var2 = -114;
        } else if (arg0 == '‘') {
            var2 = -111;
        } else if (arg0 == '’') {
            var2 = -110;
        } else if (arg0 == '“') {
            var2 = -109;
        } else if (arg0 == '”') {
            var2 = -108;
        } else if (arg0 == '•') {
            var2 = -107;
        } else if (arg0 == '–') {
            var2 = -106;
        } else if (arg0 == '—') {
            var2 = -105;
        } else if (arg0 == '˜') {
            var2 = -104;
        } else if (arg0 == '™') {
            var2 = -103;
        } else if (arg0 == 'š') {
            var2 = -102;
        } else if (arg0 == '›') {
            var2 = -101;
        } else if (arg0 == 'œ') {
            var2 = -100;
        } else if (arg0 == 'ž') {
            var2 = -98;
        } else if (arg0 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIIIIIIIII)V", line = 140)
    public static final void method3725(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field9341++;
        if (arg3 == arg4 && arg2 == arg5 && arg6 == arg9 && arg1 == arg7) {
            class314.method1940(arg4, arg8, arg6, (byte) 104, arg2, arg1);
        } else {
            int var10 = arg4;
            int var11 = arg2;
            int var12 = arg4 * 3;
            int var13 = arg2 * 3;
            int var14 = arg3 * 3;
            int var15 = arg5 * 3;
            int var16 = arg9 * 3;
            int var17 = arg7 * 3;
            int var18 = arg6 + var14 - arg4 - var16;
            int var19 = arg1 + var15 - var17 - arg2;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var17 - var15 - (var15 - var13);
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
                int var33 = (var27 + var29 + var31 >> 12) + arg4;
                int var34 = (var28 + var30 + var32 >> 12) + arg2;
                class314.method1940(var10, arg8, var33, (byte) 94, var11, var34);
                var11 = var34;
                var10 = var33;
            }
        }
        if (arg0 != 11138) {
            method3725(49, 77, -6, 21, -108, 122, 71, -67, -91, -120);
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)V", line = 216)
    public static void method3726(int arg0) {
        field9340 = null;
        if (arg0 != 352) {
            method3724('/', -56);
        }
        field9348 = null;
        field9347 = null;
        field9345 = null;
        field9344 = null;
    }
}
