import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class146 {

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public int field2230 = class554.method3243((byte) -123);

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
    public int field2242;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "Ljava/lang/String;")
    public String field2234;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public int field2239;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "Ljava/lang/String;")
    public String field2229;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "Ljava/lang/String;")
    public String field2232;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public int field2236;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "Ljava/lang/String;")
    public String field2238;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public int field2228;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "Ljava/lang/String;")
    public String field2231;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "[I")
    public static int[] field2233 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "Ljh;")
    public static class158 field2237 = new class158();

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "Lqe;")
    public static class465 field2241 = new class465(25, -2);

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "[[I")
    public static int[][] field2243 = new int[6][];

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V", line = 12)
    public static void method1136(int arg0) {
        if (arg0 != 3) {
            field2243 = null;
        }
        field2233 = null;
        field2243 = null;
        field2237 = null;
        field2241 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V", line = 38)
    public final void method1137(int arg0, String arg1, int arg2, String arg3, String arg4, String arg5, int arg6, String arg7, int arg8) {
        field2235++;
        this.field2230 = class554.method3243((byte) -104);
        this.field2239 = class605.field8787;
        this.field2242 = arg0;
        this.field2236 = arg2;
        this.field2232 = arg3;
        this.field2231 = arg4;
        this.field2234 = arg1;
        this.field2228 = arg6;
        this.field2238 = arg5;
        this.field2229 = arg7;
        if (arg8 <= 46) {
            field2237 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", line = 62)
    public class146(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        this.field2242 = arg6;
        this.field2234 = arg2;
        this.field2239 = class605.field8787;
        this.field2229 = arg7;
        this.field2232 = arg3;
        this.field2236 = arg1;
        this.field2238 = arg4;
        this.field2228 = arg0;
        this.field2231 = arg5;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(DI)V", line = 79)
    public static final void method1138(double arg0, int arg1) {
        field2240++;
        class224.field3198.method160(class160.field2389);
        class224.field3198.method149(0, 0, (int) arg0);
        class154.field2309.method538(class224.field3198);
        if (arg1 < 111) {
            field2233 = null;
        }
    }
}
