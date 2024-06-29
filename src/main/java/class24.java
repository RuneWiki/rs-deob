import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class24 extends class5 {

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "Lub;")
    public class17 field348;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "Lpa;")
    public static class254 field347 = new class254(6, 14);

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "Lof;")
    public static class446 field349 = new class446("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "Lof;")
    public static class446 field350 = new class446(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "I")
    public static int field353 = 0;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "Lof;")
    public static class446 field352 = new class446("Starting 3D Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!rk", name = "v", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!rk", name = "u", descriptor = "Lgw;")
    public static class117 field354;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "Ln;")
    public static class14 field346;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "[Z")
    public static boolean[] field351;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIII[I)V")
    public static final void method224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
        field344++;
        int var8 = -46 / ((arg6 + 79) / 40);
        if (arg1 > 0 && !class152.method994(arg1, false)) {
            throw new IllegalArgumentException("");
        } else if (arg5 > 0 && !class152.method994(arg5, false)) {
            throw new IllegalArgumentException("");
        } else if (arg3 == 32993) {
            int var9 = 0;
            int var10 = arg1 < arg5 ? arg1 : arg5;
            int var11 = arg1 >> 1;
            int var12 = arg5 >> 1;
            int[] var13 = arg7;
            int[] var14 = new int[var11 * var12];
            while (true) {
                OpenGL.glTexImage2Di(arg0, var9, arg2, arg1, arg5, 0, arg3, arg4, var13, 0);
                if (var10 <= 1) {
                    return;
                }
                int var15 = 0;
                int var16 = 0;
                int var17 = arg1 + var16;
                for (int var18 = 0; var18 < var12; var18++) {
                    for (int var20 = 0; var20 < var11; var20++) {
                        int var21 = var13[var16++];
                        int var22 = var13[var16++];
                        int var23 = var13[var17++];
                        int var24 = var21 & 0xFF;
                        int var25 = var21 >> 16 & 0xFF;
                        int var26 = var21 >> 8 & 0xFF;
                        int var27 = var13[var17++];
                        int var28 = var21 >> 24 & 0xFF;
                        int var29 = (var22 & 0xFF) + var24;
                        int var30 = (var22 >> 16 & 0xFF) + var25;
                        int var31 = (var22 >> 24 & 0xFF) + var28;
                        int var32 = ((var22 & 0xFF0A) >> 8) + var26;
                        int var33 = (var23 >> 8 & 0xFF) + var32;
                        int var34 = (var23 & 0xFF) + var29;
                        int var35 = (var23 >> 24 & 0xFF) + var31;
                        int var36 = ((var23 & 0xFF0045) >> 16) + var30;
                        int var37 = (var27 & 0xFF) + var34;
                        int var38 = (var27 >> 16 & 0xFF) + var36;
                        int var39 = (var27 >> 24 & 0xFF) + var35;
                        int var40 = (var27 >> 8 & 0xFF) + var33;
                        var14[var15++] = class311.method1956(class311.method1956(class519.method3092(var40 << 6, 65280), class311.method1956(class519.method3092(1020, var39) << 22, class519.method3092(16711680, var38 << 14))), class519.method3092(var37 >> 2, 255));
                    }
                    var17 += arg1;
                    var16 += arg1;
                }
                int[] var19 = var14;
                var14 = var13;
                var13 = var19;
                arg1 = var11;
                arg5 = var12;
                var10 >>= 0x1;
                var12 >>= 0x1;
                var11 >>= 0x1;
                var9++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
    public static void method225(int arg0) {
        field352 = null;
        field347 = null;
        field350 = null;
        field346 = null;
        field351 = null;
        field349 = null;
        field354 = null;
        if (arg0 != -30814) {
            method225(100);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZII)Z")
    public static final boolean method226(boolean arg0, int arg1, int arg2) {
        field343++;
        if (arg0) {
            method225(-16);
        }
        return (arg2 & 0x220) == 544 | (arg2 & 0x18) != 0;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZIIBZLjava/lang/String;IILjava/lang/String;JI)V")
    public static final void method227(boolean arg0, int arg1, int arg2, byte arg3, boolean arg4, String arg5, int arg6, int arg7, String arg8, long arg9, int arg10) {
        int var12 = -6 % ((arg3 - 22) / 51);
        field345++;
        if (!class139.field1850 && class367.field5621 < 500) {
            int var13 = arg7 == -1 ? class449.field6752 : arg7;
            class54 var14 = new class54(arg8, arg5, var13, arg1, arg6, arg9, arg10, arg2, arg4, arg0);
            class131.field1769.method453((byte) 124, var14);
            class367.field5621++;
        }
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lub;)V")
    public class24(class17 arg0) {
        this.field348 = arg0;
    }
}
