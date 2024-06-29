import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class233 extends class115 {

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public int field3273;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public int field3272;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "Laa;")
    public static class76 field3274 = new class76(10, -1);

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "[Z")
    public static boolean[] field3277;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "F")
    public static float field3280;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "Ljf;")
    public static class21 field3279;

    static {
        new class347("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field3277 = new boolean[5];
        field3278 = 2;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIIIII)V", line = 3)
    public static final void method1443(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg7 != 0) {
            return;
        }
        field3276++;
        if (arg8 < 1 || arg1 < 1 || arg8 > class50.field640 - 2 || class448.field6611 - 2 < arg1) {
            return;
        }
        int var9 = arg2;
        if (arg2 < 3 && class252.method1506(0, arg1, arg8)) {
            var9 = arg2 + 1;
        }
        if (!class454.field6661.method1533(-1, class113.field1723) && !class41.method328(var9, 2, arg1, class151.field2295, arg8)) {
            return;
        }
        if (class236.field3305 == null) {
            return;
        }
        class238.field3331.method2189(arg8, class407.field6147, arg2, arg1, (byte) -109, arg6, class151.field2300[arg2]);
        if (arg0 < 0) {
            return;
        }
        boolean var10 = class454.field6661.field991;
        class454.field6661.field991 = true;
        class238.field3331.method2184(var9, arg1, arg8, class151.field2300[arg2], arg5, arg4, arg3, arg2, -127, class407.field6147, arg0);
        class454.field6661.field991 = var10;
        return;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V", line = 49)
    public static void method1444(int arg0) {
        field3277 = null;
        field3274 = null;
        if (arg0 != 0) {
            method1443(31, 14, 51, -123, 77, -100, 45, -114, 109);
        }
        field3279 = null;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(II)V", line = 68)
    public class233(int arg0, int arg1) {
        this.field3273 = arg1;
        this.field3272 = arg0;
    }
}
