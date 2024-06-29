import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class203 {

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "Lmb;")
    public static class198 field2384;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "[I")
    public static int[] field2385;

    static {
        new class72("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        new class72("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1242(int arg0) {
        if (arg0 != 17831) {
            method1243(-7, true, 64, (long[]) null, (Object[]) null);
        }
        field2383++;
        class392.field5344.method2290(arg0 ^ 0x73A0);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZI[J[Ljava/lang/Object;)V", line = 18)
    public static final void method1243(int arg0, boolean arg1, int arg2, long[] arg3, Object[] arg4) {
        field2386++;
        if (arg2 < arg0) {
            int var5 = (arg2 + arg0) / 2;
            int var6 = arg2;
            long var7 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var7;
            Object var9 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var9;
            for (int var10 = arg2; var10 < arg0; var10++) {
                if ((long) (var10 & 0x1) + var7 > arg3[var10]) {
                    long var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    Object var13 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6++] = var13;
                }
            }
            arg3[arg0] = arg3[var6];
            arg3[var6] = var7;
            arg4[arg0] = arg4[var6];
            arg4[var6] = var9;
            method1243(var6 - 1, true, arg2, arg3, arg4);
            method1243(arg0, true, var6 + 1, arg3, arg4);
        }
        if (!arg1) {
            method1245(-101, 18, -27, (byte) -46, 35, -108);
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V", line = 76)
    public static void method1244(int arg0) {
        int var1 = -56 % ((arg0 + 43) / 52);
        field2384 = null;
        field2385 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIBII)V", line = 91)
    public static final void method1245(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field2387++;
        for (int var6 = arg1; var6 <= arg4; var6++) {
            class384.method2394(arg0, 98, class228.field2877[var6], arg2, arg5);
        }
        if (arg3 != -68) {
            method1244(51);
        }
    }
}
