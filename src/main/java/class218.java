import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class218 {

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "[I")
    public static int[] field3018;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "Lkn;")
    public static class442 field3019;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "B")
    public byte field3014;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public int field3010;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "Lbo;")
    public static class435 field3020;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "Ljava/lang/String;")
    public String field3008;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "Ljava/lang/String;")
    public String field3011;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "Ljava/lang/String;")
    public String field3017;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public static void method1405(int arg0) {
        field3019 = null;
        field3020 = null;
        if (arg0 == 200) {
            field3018 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIII)V")
    public static final void method1406(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3016++;
        if (class290.field4058 <= arg0 && arg0 <= class442.field6212) {
            int var5 = class302.method1951(class154.field2161, 0, arg1, class233.field3350);
            int var6 = class302.method1951(class154.field2161, 0, arg3, class233.field3350);
            class375.method2398(arg0, (byte) -13, var6, arg4, var5);
        }
        int var7 = -39 % ((arg2 - 59) / 58);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)V")
    public static final void method1407(int arg0, int arg1) {
        field3013++;
        int var2 = -110 % ((arg0 + 77) / 47);
        class25.field457.method901(arg1, 12223);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "([JBI[Ljava/lang/Object;I)V")
    public static final void method1408(long[] arg0, byte arg1, int arg2, Object[] arg3, int arg4) {
        if (arg1 > -125) {
            method1405(74);
        }
        if (arg2 > arg4) {
            int var5 = (arg2 + arg4) / 2;
            int var6 = arg4;
            long var7 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var7;
            Object var9 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var9;
            for (int var10 = arg4; var10 < arg2; var10++) {
                if (arg0[var10] < (long) (var10 & 0x1) + var7) {
                    long var11 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6] = var11;
                    Object var13 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6++] = var13;
                }
            }
            arg0[arg2] = arg0[var6];
            arg0[var6] = var7;
            arg3[arg2] = arg3[var6];
            arg3[var6] = var9;
            method1408(arg0, (byte) -126, var6 - 1, arg3, arg4);
            method1408(arg0, (byte) -127, arg2, arg3, var6 + 1);
        }
        field3009++;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)V")
    public static final void method1409(int arg0, byte arg1) {
        field3012++;
        if (arg1 < 113) {
            method1408((long[]) null, (byte) -106, 72, (Object[]) null, 87);
        }
        class239 var2 = class436.method2740(10, arg0, -323285792);
        var2.method1628(14478);
    }

    static {
        new class442("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
        field3015 = 0;
        field3018 = new int[200];
        field3019 = new class442("Examine", "Untersuchen", "Examiner", "Examinar");
    }
}
