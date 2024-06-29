import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class207 {

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "B")
    public byte field2729;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "Z")
    public boolean field2721;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "S")
    public short field2730;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "S")
    public short field2726;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public int field2725;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "S")
    public short field2720;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "B")
    public byte field2733;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "[Z")
    public static boolean[] field2728 = new boolean[100];

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "Lao;")
    public static class191 field2727 = new class191(39, 5);

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "Ljc;")
    public static class305 field2734 = new class305("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V", line = 7)
    public static void method1308(int arg0) {
        field2734 = null;
        field2727 = null;
        if (arg0 == -23826) {
            field2728 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;", line = 19)
    public static final String method1309(boolean arg0, String arg1) {
        field2731++;
        String var2 = class474.method2893(class408.method2501(arg1, 57), 34);
        if (!arg0) {
            field2728 = null;
        }
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIZ)Laj;", line = 46)
    public final class207 method1310(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg4) {
            this.field2730 = -89;
        }
        field2732++;
        return new class207(arg1, arg0, arg3, arg2, this.field2730, this.field2726, this.field2720, this.field2729, this.field2733, this.field2721);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BII)Z", line = 60)
    public static final boolean method1311(byte arg0, int arg1, int arg2) {
        field2723++;
        if (arg0 > -52) {
            method1311((byte) -108, 3, -99);
        }
        return (arg1 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V", line = 74)
    public static final void method1312(int arg0) {
        field2722++;
        int var1 = (int) ((double) class308.field4128 * 34.46D);
        int var2 = var1 << 0;
        if (arg0 >= -103) {
            field2734 = null;
        }
        if (class343.field4596.method1168()) {
            var2 += 128;
        }
        class343.field4596.method1200(50, var2);
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(IIIIIIIIIZ)V", line = 99)
    public class207(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field2729 = (byte) arg7;
        this.field2721 = arg9;
        this.field2730 = (short) arg4;
        this.field2726 = (short) arg5;
        this.field2725 = arg0;
        this.field2720 = (short) arg6;
        this.field2733 = (byte) arg8;
    }
}
