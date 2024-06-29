import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class494 extends class42 {

    @OriginalMember(owner = "client!no", name = "o", descriptor = "Ljava/lang/String;")
    public String field6857;

    @OriginalMember(owner = "client!no", name = "r", descriptor = "Ljava/lang/String;")
    public static String field6860 = "";

    @OriginalMember(owner = "client!no", name = "q", descriptor = "I")
    public static int field6859 = 0;

    @OriginalMember(owner = "client!no", name = "t", descriptor = "Lff;")
    public static class9 field6862;

    @OriginalMember(owner = "client!no", name = "u", descriptor = "Lff;")
    public static class9 field6863;

    @OriginalMember(owner = "client!no", name = "v", descriptor = "S")
    public static short field6864;

    @OriginalMember(owner = "client!no", name = "y", descriptor = "[[I")
    public static int[][] field6867;

    @OriginalMember(owner = "client!no", name = "w", descriptor = "I")
    public static int field6865;

    @OriginalMember(owner = "client!no", name = "n", descriptor = "I")
    public static int field6856;

    @OriginalMember(owner = "client!no", name = "p", descriptor = "I")
    public static int field6858;

    @OriginalMember(owner = "client!no", name = "x", descriptor = "I")
    public static int field6866;

    @OriginalMember(owner = "client!no", name = "s", descriptor = "[Lf;")
    public static class529[] field6861;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(II)I")
    public static int method2839(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V")
    public static void method2840(int arg0) {
        field6862 = null;
        field6863 = null;
        field6860 = null;
        if (arg0 > 19) {
            field6861 = null;
            field6867 = null;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2841(int arg0, int arg1, byte arg2) {
        if (arg2 > -108) {
            field6859 = -31;
        }
        field6856++;
        return (class23.method210(arg1, arg0, true) | class5.method29(-118, arg0, arg1) | class30.method249((byte) 115, arg0, arg1)) & class228.method1427(arg0, -123, arg1);
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "()V")
    public class494() {
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class494(String arg0) {
        this.field6857 = arg0;
    }

    static {
        new class304("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
        field6862 = new class9(5, -1);
        field6863 = new class9(72, -2);
        field6864 = 256;
        field6867 = new int[128][128];
        field6865 = 0;
    }
}
