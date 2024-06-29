import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class315 {

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "[I")
    public int[] field4876 = new int[6];

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public int field4878 = 0;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "[I")
    public int[] field4879 = new int[257];

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "[B")
    public byte[] field4887 = new byte[256];

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "[[I")
    public int[][] field4886 = new int[6][258];

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "[I")
    public int[] field4894 = new int[16];

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "[[I")
    public int[][] field4891 = new int[6][258];

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "[B")
    public byte[] field4884 = new byte[4096];

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "[Z")
    public boolean[] field4905 = new boolean[256];

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "[[I")
    public int[][] field4882 = new int[6][258];

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "[Z")
    public boolean[] field4911 = new boolean[16];

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "[[B")
    public byte[][] field4904 = new byte[6][258];

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "[B")
    public byte[] field4896 = new byte[18002];

    @OriginalMember(owner = "client!nb", name = "I", descriptor = "I")
    public int field4910 = 0;

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "[B")
    public byte[] field4914 = new byte[18002];

    @OriginalMember(owner = "client!nb", name = "N", descriptor = "[I")
    public int[] field4915 = new int[256];

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "Lrh;")
    public static class136 field4890 = new class136();

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
    public static int field4906 = 0;

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "Ljava/lang/String;")
    public static String field4902 = "Created gameworld";

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "Ljava/lang/String;")
    public static String field4898 = "wave:";

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "B")
    public byte field4892;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public int field4877;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public int field4880;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public int field4881;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public int field4883;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public int field4885;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public int field4888;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
    public int field4889;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    public int field4893;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
    public int field4895;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
    public int field4899;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
    public int field4900;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
    public int field4907;

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "I")
    public int field4912;

    @OriginalMember(owner = "client!nb", name = "L", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "Llb;")
    public static class211 field4903;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "[B")
    public byte[] field4897;

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "[B")
    public byte[] field4908;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Llb;I)V", line = 32)
    public static final void method2169(class211 arg0, int arg1) {
        class150.field2274 = arg0.method1519((byte) 16, "titlebg");
        if (arg1 <= -4) {
            field4909++;
            class250.field3748 = arg0.method1519((byte) 16, "logo");
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V", line = 57)
    public static void method2170(int arg0) {
        field4902 = null;
        field4903 = null;
        field4890 = null;
        if (arg0 != 256) {
            method2170(-121);
        }
        field4898 = null;
    }
}
