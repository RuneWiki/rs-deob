import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class197 {

    @OriginalMember(owner = "client!og", name = "a", descriptor = "Li;")
    public static class207 field3157 = new class207(5000);

    @OriginalMember(owner = "client!og", name = "n", descriptor = "I")
    public static int field3170 = 0;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "[I")
    public static int[] field3166 = new int[100];

    @OriginalMember(owner = "client!og", name = "k", descriptor = "Lqd;")
    public static class40 field3167 = class147.method1106("runes", (byte) -52);

    @OriginalMember(owner = "client!og", name = "m", descriptor = "[I")
    public static int[] field3169 = new int[500];

    @OriginalMember(owner = "client!og", name = "h", descriptor = "B")
    public static byte field3164;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public int field3158;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public int field3162;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public int field3163;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    public int field3165;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lce;Lce;I)V", line = 4)
    public static final void method1391(class239 arg0, class239 arg1, int arg2) {
        class306.field5127 = arg0;
        field3161++;
        class237.field3917 = arg1;
        if (arg2 != -22282) {
            field3157 = (class207) null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V", line = 29)
    public static void method1392(int arg0) {
        field3157 = null;
        field3166 = null;
        int var1 = -74 % ((arg0 - 37) / 63);
        field3167 = null;
        field3169 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILad;Lad;)V", line = 52)
    public static final void method1393(int arg0, class122 arg1, class122 arg2) {
        field3160++;
        if (arg2.field2115 != null) {
            arg2.method921(2);
        }
        arg2.field2115 = arg1;
        arg2.field2123 = arg1.field2123;
        int var3 = 101 % ((-arg0 - 73) / 53);
        arg2.field2115.field2123 = arg2;
        arg2.field2123.field2115 = arg2;
    }
}
