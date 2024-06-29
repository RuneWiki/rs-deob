import java.math.BigInteger;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class220 implements class257 {

    @OriginalMember(owner = "client!nt", name = "j", descriptor = "I")
    public int field2873;

    @OriginalMember(owner = "client!nt", name = "i", descriptor = "I")
    public int field2872;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "I")
    public int field2864;

    @OriginalMember(owner = "client!nt", name = "k", descriptor = "I")
    public int field2874;

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "Ldp;")
    public class3 field2867;

    @OriginalMember(owner = "client!nt", name = "l", descriptor = "I")
    public int field2875;

    @OriginalMember(owner = "client!nt", name = "h", descriptor = "I")
    public int field2871;

    @OriginalMember(owner = "client!nt", name = "m", descriptor = "Lfv;")
    public class120 field2876;

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
    public int field2865;

    @OriginalMember(owner = "client!nt", name = "n", descriptor = "[Z")
    public static boolean[] field2877 = new boolean[100];

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "Ljava/util/Random;")
    public static Random field2866 = new Random();

    @OriginalMember(owner = "client!nt", name = "o", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2878 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!nt", name = "q", descriptor = "Lbd;")
    public static class60 field2880 = new class60(9, 3);

    @OriginalMember(owner = "client!nt", name = "r", descriptor = "S")
    public static short field2881 = 32767;

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!nt", name = "f", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!nt", name = "g", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!nt", name = "p", descriptor = "Lls;")
    public static class138 field2879;

    @OriginalMember(owner = "client!nt", name = "s", descriptor = "Ljba;")
    public static class398 field2882;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Z)Lg;", line = 3)
    public class153 method769(boolean arg0) {
        if (arg0) {
            method1349(84, true, 110, 17, 65, -70, 84);
        }
        field2868++;
        return null;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V", line = 14)
    public static final void method1348(byte arg0) {
        class584.field8213 = 0;
        class233.field3144 = 0;
        field2869++;
        for (int var1 = 0; var1 < class296.field4168; var1++) {
            int var2 = class224.field3008 * var1;
            for (int var3 = 0; var3 < class224.field3008; var3++) {
                int var4 = var2 + var3;
                class448.field6358[var4].method2194(class338.field4700 * var3, class47.field555 * var1, class338.field4700, class47.field555, 0, 0, true, true);
            }
        }
        if (arg0 <= 89) {
            method1348((byte) 72);
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IZIIIII)V", line = 54)
    public static final void method1349(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg1 ? class557.field7812.field6545.method3029(false) : class557.field7812.field6527.method3029(false)) != 0 && arg2 != 0 && class557.field7828 < 50 && arg0 != -1) {
            class503.field7212[class557.field7828++] = new class319((byte) (arg1 ? 3 : 2), arg0, arg2, arg6, arg5, 0, arg3, null);
        }
        field2870++;
        if (arg4 != 9400) {
            field2881 = 119;
        }
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(B)V", line = 82)
    public static void method1350(byte arg0) {
        field2877 = null;
        field2878 = null;
        field2879 = null;
        field2882 = null;
        field2866 = null;
        field2880 = null;
        if (arg0 != 36) {
            field2866 = null;
        }
    }

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Ldp;Lfv;IIIIIII)V", line = 97)
    public class220(class3 arg0, class120 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field2873 = arg4;
        this.field2872 = arg8;
        this.field2864 = arg7;
        this.field2874 = arg5;
        this.field2867 = arg0;
        this.field2875 = arg3;
        this.field2871 = arg2;
        this.field2876 = arg1;
        this.field2865 = arg6;
    }
}
