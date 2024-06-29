import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class179 {

    @OriginalMember(owner = "client!td", name = "b", descriptor = "Lrf;")
    private static class163 field3592 = class53.method392(46, "Please wait 1 minute and try again)3");

    @OriginalMember(owner = "client!td", name = "d", descriptor = "Lrf;")
    public static class163 field3594 = field3592;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "Lrf;")
    public static class163 field3601 = field3592;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static volatile int field3599 = 0;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "Lrf;")
    private static class163 field3597 = class53.method392(-109, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

    @OriginalMember(owner = "client!td", name = "e", descriptor = "Lrf;")
    public static class163 field3595 = class53.method392(49, "Unerwartete Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!td", name = "h", descriptor = "Lrf;")
    private static class163 field3598 = class53.method392(-48, "Your account has been disabled)3");

    @OriginalMember(owner = "client!td", name = "l", descriptor = "Lrf;")
    public static class163 field3602 = class53.method392(54, " weitere Optionen");

    @OriginalMember(owner = "client!td", name = "f", descriptor = "Lrf;")
    public static class163 field3596 = field3598;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "Lrf;")
    public static class163 field3591 = field3597;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(III)I")
    public static final int method1210(int arg0, int arg1, int arg2) {
        if (arg0 != 1) {
            field3592 = null;
        }
        field3593++;
        long var3 = (long) ((arg2 << 16) + arg1);
        return class150.field3108 != null && class150.field3108.field1950 == var3 ? class196.field3892.field1033 * 99 / (class196.field3892.field1054.length - class150.field3108.field808) + 1 : 0;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
    public static final void method1211(int arg0) {
        class181.field3638 = 0;
        if (arg0 != -19899) {
            field3601 = null;
        }
        field3600++;
        class72.field1522 = 0;
        class185.method1253(true);
        class118.method808(arg0 + 20024);
        class128.method843(arg0 ^ 0x4DCE);
        class29.method173(513859944);
        for (int var1 = 0; var1 < class72.field1522; var1++) {
            int var3 = class168.field3434[var1];
            if (class51.field1023 != class121.field2553[var3].field711) {
                class121.field2553[var3] = null;
            }
        }
        if (class74.field1554 != class105.field2195.field1033) {
            throw new RuntimeException("gpp1 pos:" + class105.field2195.field1033 + " psize:" + class74.field1554);
        }
        for (int var2 = 0; var2 < class112.field2377; var2++) {
            if (class121.field2553[class27.field504[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class112.field2377);
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
    public static void method1212(int arg0) {
        field3591 = null;
        field3601 = null;
        field3597 = null;
        field3594 = null;
        field3602 = null;
        field3598 = null;
        if (arg0 != -26122) {
            field3602 = null;
        }
        field3592 = null;
        field3595 = null;
        field3596 = null;
    }
}
