import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class329 {

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "[I")
    public int[] field4925 = new int[3];

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "[I")
    public int[] field4931 = new int[100];

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "[Lhs;")
    public class205[] field4930 = new class205[100];

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "[Lki;")
    public class480[] field4926 = new class480[8];

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "Lft;")
    public static class4 field4932 = new class4();

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "Lbg;")
    public static class310 field4935 = new class310(31, 3);

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "Lcm;")
    public static class491 field4936 = new class491("runescape", 0);

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "F")
    public static float field4933;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public int field4923;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "Lqq;")
    public static class318 field4937;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "Ljava/lang/Object;")
    public Object field4924;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "Ljava/lang/Object;")
    public static Object field4934;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field4938;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIII)I", line = 3)
    public static final int method2046(int arg0, int arg1, int arg2, int arg3) {
        field4929++;
        if (arg0 != -849096504) {
            method2047(false);
        }
        int var4 = 255 - arg3;
        int var5 = ((arg2 & 0xFF00) * arg3 & 0xFF0000 | (arg2 & 0xFF00FF) * arg3 & 0xFF00FF00) >>> 8;
        return (((arg1 & 0xFF00) * var4 & 0xFF0000 | (arg1 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)V", line = 21)
    public static void method2047(boolean arg0) {
        field4935 = null;
        if (!arg0) {
            return;
        }
        field4934 = null;
        field4937 = null;
        field4938 = null;
        field4932 = null;
        field4936 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)Z", line = 40)
    public static final boolean method2048(int arg0) {
        field4927++;
        if (arg0 != 29709) {
            return true;
        }
        if (class112.field1907) {
            try {
                class209.method1278(5633, class7.field86.field3929, "showVideoAd");
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }
}
