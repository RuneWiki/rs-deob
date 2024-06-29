import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public abstract class class328 {

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
    public int field4884;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    public int field4883;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public int field4880;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "I")
    public static int field4888 = 0;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "Lbn;")
    public static class160 field4887 = new class160(33, 11);

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "Lvq;")
    public static class24 field4889 = new class24(104, 6);

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "Lvq;")
    public static class24 field4890 = new class24(48, 2);

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "[I")
    public static int[] field4892;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "Lct;")
    public static class104 field4891;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "Lhi;")
    public static class365 field4885;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "[Lae;")
    public static class285[] field4886;

    static {
        new class409("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
        field4892 = new int[14];
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lkg;II)Ljava/lang/String;", line = 4)
    public static final String method2146(class223 arg0, int arg1, int arg2) {
        if (arg2 != 2) {
            return null;
        }
        field4881++;
        if (!client.method1811(arg0).method2165(arg1, (byte) -121) && arg0.field3219 == null) {
            return null;
        } else if (arg0.field3267 == null || arg0.field3267.length <= arg1 || arg0.field3267[arg1] == null || arg0.field3267[arg1].trim().length() == 0) {
            return class159.field2133 ? "Hidden-" + arg1 : null;
        } else {
            return arg0.field3267[arg1];
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILjava/lang/String;)V", line = 39)
    public static final void method2147(int arg0, String arg1) {
        class141.method932(0, 0, "", arg1, true, "");
        if (arg0 == 128) {
            field4882++;
        }
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(III)V", line = 53)
    public class328(int arg0, int arg1, int arg2) {
        this.field4884 = arg1;
        this.field4883 = arg0;
        this.field4880 = arg2;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V", line = 63)
    public static void method2148(int arg0) {
        field4892 = null;
        field4890 = null;
        field4889 = null;
        field4885 = null;
        field4887 = null;
        if (arg0 < -36) {
            field4886 = null;
            field4891 = null;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lva;ZI)V", line = 85)
    public static final void method2149(class58 arg0, boolean arg1, int arg2) {
        if (arg1) {
            return;
        }
        field4879++;
        int var3 = -1;
        int var4 = 0;
        if (class388.field5665 < arg0.field760) {
            class257.method1772(arg0, 117);
        } else if (arg0.field743 >= class388.field5665) {
            class377.method2390(2, arg0);
        } else {
            class14.method207(false, (byte) 28, arg0);
            var3 = class411.field5911;
            var4 = class191.field2671;
        }
        if (arg0.field4954 < 128 || arg0.field4951 < 128 || arg0.field4954 >= ((class195.field2745 - 1) * 128) || arg0.field4951 >= ((class78.field984 - 1) * 128)) {
            arg0.field781 = -1;
            arg0.field751 = -1;
            arg0.field743 = 0;
            var4 = 0;
            arg0.field760 = 0;
            var3 = -1;
            arg0.field4954 = arg0.field793[0] * 128 + arg0.method446(10) * 64;
            arg0.field4951 = arg0.field784[0] * 128 + arg0.method446(10) * 64;
            arg0.method444(0);
        }
        if (class187.field2619 == arg0 && (arg0.field4954 < 1536 || arg0.field4951 < 1536 || arg0.field4954 >= ((class195.field2745 - 12) * 128) || class78.field984 * 128 - 1536 <= arg0.field4951)) {
            arg0.field743 = 0;
            arg0.field751 = -1;
            var4 = 0;
            arg0.field781 = -1;
            arg0.field760 = 0;
            var3 = -1;
            arg0.field4954 = arg0.field793[0] * 128 + arg0.method446(10) * 64;
            arg0.field4951 = arg0.field784[0] * 128 + (arg0.method446(10) * 64);
            arg0.method444(0);
        }
        int var5 = class408.method2539(-1, arg0);
        class136.method904(var4, arg0, var5, var3, !arg1);
        class31.method307(arg0, false);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(III)V")
    public abstract void method325(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(BII)V")
    public abstract void method328(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(III)V")
    public abstract void method330(int arg0, int arg1, int arg2);
}
