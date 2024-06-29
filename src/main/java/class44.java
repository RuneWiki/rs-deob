import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class44 {

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "Z")
    public boolean field872 = true;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public int field867;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public int field871;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public int field870;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public int field875;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public int field868;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
    public int field883;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "Led;")
    private static class43 field865 = class191.method1219("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ", false);

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "Led;")
    public static class43 field877 = class191.method1219("(Y", false);

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "Led;")
    public static class43 field866 = field865;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "Led;")
    private static class43 field880 = class191.method1219("Login server offline)3", false);

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "Led;")
    public static class43 field881 = field880;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "Led;")
    private static class43 field884 = class191.method1219("Login limit exceeded)3", false);

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "Led;")
    public static class43 field873 = field884;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "Led;")
    private static class43 field882 = class191.method1219("Loading sprites )2 ", false);

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "Led;")
    public static class43 field885 = class191.method1219("zur-Uck auf die RuneScape)2Webseite gehen", false);

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "Led;")
    public static class43 field876 = field882;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "[I")
    public static int[] field879;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "[[S")
    public static short[][] field869;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
    public static void method275(byte arg0) {
        int var1 = 21 % ((arg0 - 58) / 44);
        field885 = null;
        field876 = null;
        field869 = null;
        field879 = null;
        field873 = null;
        field882 = null;
        field880 = null;
        field866 = null;
        field877 = null;
        field884 = null;
        field881 = null;
        field865 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(JI)V")
    public static final void method276(long arg0, int arg1) {
        try {
            Thread.sleep(arg0);
            if (arg1 < 81) {
                method276(-5L, 10);
            }
        } catch (InterruptedException var3) {
        }
        field878++;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class44(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field867 = arg0;
        this.field872 = arg6;
        this.field871 = arg5;
        this.field870 = arg2;
        this.field875 = arg4;
        this.field868 = arg1;
        this.field883 = arg3;
    }
}
