import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class132 extends class5 {

    @OriginalMember(owner = "client!t", name = "J", descriptor = "Lhe;")
    public static class54 field2981 = class6.method58("Das ist eine Mitglieder)2Welt(Q", false);

    @OriginalMember(owner = "client!t", name = "K", descriptor = "[B")
    public static byte[] field2982 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!t", name = "O", descriptor = "Lhe;")
    private static class54 field2986 = class6.method58("wave2:", false);

    @OriginalMember(owner = "client!t", name = "S", descriptor = "Lhe;")
    public static class54 field2990 = field2986;

    @OriginalMember(owner = "client!t", name = "X", descriptor = "I")
    public static int field2995 = 0;

    @OriginalMember(owner = "client!t", name = "U", descriptor = "Lhe;")
    public static class54 field2992 = field2986;

    @OriginalMember(owner = "client!t", name = "N", descriptor = "Lhe;")
    public static class54 field2985 = class6.method58("::gc", false);

    @OriginalMember(owner = "client!t", name = "T", descriptor = "Lhe;")
    public static class54 field2991 = class6.method58("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie", false);

    @OriginalMember(owner = "client!t", name = "P", descriptor = "Lhe;")
    public static class54 field2987 = class6.method58("null", false);

    @OriginalMember(owner = "client!t", name = "W", descriptor = "I")
    public static volatile int field2994 = 0;

    @OriginalMember(owner = "client!t", name = "I", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!t", name = "M", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!t", name = "R", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!t", name = "Y", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!t", name = "Z", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!t", name = "L", descriptor = "Lqb;")
    public static class113 field2983;

    @OriginalMember(owner = "client!t", name = "H", descriptor = "Lhe;")
    public class54 field2979;

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "[I")
    public static int[] field2988;

    @OriginalMember(owner = "client!t", name = "V", descriptor = "[Lqb;")
    public static class113[] field2993;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([BZB)Ljava/lang/Object;")
    public static final Object method994(byte[] arg0, boolean arg1, byte arg2) {
        field2996++;
        if (arg2 != 75) {
            return null;
        } else if (arg0 == null) {
            return null;
        } else {
            if (arg0.length > 136 && !class111.field2655) {
                try {
                    class82 var3 = (class82) Class.forName("pe").getDeclaredConstructor().newInstance();
                    var3.method625(arg2 ^ 0xFFFFFFE5, arg0);
                    return var3;
                } catch (Throwable var4) {
                    class111.field2655 = true;
                }
            }
            return arg1 ? class88.method704(-24158, arg0) : arg0;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(B)V")
    public static void method995(byte arg0) {
        field2981 = null;
        field2988 = null;
        field2992 = null;
        field2990 = null;
        field2987 = null;
        field2991 = null;
        field2982 = null;
        if (arg0 == 95) {
            field2986 = null;
            field2985 = null;
            field2993 = null;
            field2983 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lhe;Lef;Lhe;Z)[Lqb;")
    public static final class113[] method996(class54 arg0, class35 arg1, class54 arg2, boolean arg3) {
        int var4 = arg1.method273(arg0, 1);
        if (!arg3) {
            field2982 = null;
        }
        field2997++;
        int var5 = arg1.method267(!arg3, arg2, var4);
        return class53.method376(var4, var5, arg1, 0);
    }
}
