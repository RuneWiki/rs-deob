import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class349 {

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "[[I")
    public int[][] field4933 = new int[6][258];

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "[B")
    public byte[] field4931 = new byte[256];

    @OriginalMember(owner = "client!fs", name = "m", descriptor = "[[I")
    public int[][] field4940 = new int[6][258];

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
    public int field4930 = 0;

    @OriginalMember(owner = "client!fs", name = "q", descriptor = "[B")
    public byte[] field4944 = new byte[4096];

    @OriginalMember(owner = "client!fs", name = "i", descriptor = "[[B")
    public byte[][] field4936 = new byte[6][258];

    @OriginalMember(owner = "client!fs", name = "u", descriptor = "[[I")
    public int[][] field4948 = new int[6][258];

    @OriginalMember(owner = "client!fs", name = "y", descriptor = "I")
    public int field4952 = 0;

    @OriginalMember(owner = "client!fs", name = "z", descriptor = "[I")
    public int[] field4953 = new int[6];

    @OriginalMember(owner = "client!fs", name = "p", descriptor = "[B")
    public byte[] field4943 = new byte[18002];

    @OriginalMember(owner = "client!fs", name = "v", descriptor = "[I")
    public int[] field4949 = new int[256];

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "[Z")
    public boolean[] field4928 = new boolean[16];

    @OriginalMember(owner = "client!fs", name = "s", descriptor = "[I")
    public int[] field4946 = new int[16];

    @OriginalMember(owner = "client!fs", name = "F", descriptor = "[B")
    public byte[] field4959 = new byte[18002];

    @OriginalMember(owner = "client!fs", name = "A", descriptor = "[I")
    public int[] field4954 = new int[257];

    @OriginalMember(owner = "client!fs", name = "K", descriptor = "[Z")
    public boolean[] field4964 = new boolean[256];

    @OriginalMember(owner = "client!fs", name = "n", descriptor = "I")
    public static volatile int field4941 = -1;

    @OriginalMember(owner = "client!fs", name = "H", descriptor = "Lfg;")
    public static class18 field4961 = new class18(128);

    @OriginalMember(owner = "client!fs", name = "L", descriptor = "I")
    public static int field4965 = -2;

    @OriginalMember(owner = "client!fs", name = "C", descriptor = "B")
    public byte field4956;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
    public int field4929;

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "I")
    public int field4932;

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "I")
    public int field4935;

    @OriginalMember(owner = "client!fs", name = "j", descriptor = "I")
    public int field4937;

    @OriginalMember(owner = "client!fs", name = "k", descriptor = "I")
    public int field4938;

    @OriginalMember(owner = "client!fs", name = "l", descriptor = "I")
    public int field4939;

    @OriginalMember(owner = "client!fs", name = "r", descriptor = "I")
    public int field4945;

    @OriginalMember(owner = "client!fs", name = "t", descriptor = "I")
    public int field4947;

    @OriginalMember(owner = "client!fs", name = "w", descriptor = "I")
    public int field4950;

    @OriginalMember(owner = "client!fs", name = "x", descriptor = "I")
    public int field4951;

    @OriginalMember(owner = "client!fs", name = "B", descriptor = "I")
    public int field4955;

    @OriginalMember(owner = "client!fs", name = "D", descriptor = "I")
    public int field4957;

    @OriginalMember(owner = "client!fs", name = "E", descriptor = "I")
    public int field4958;

    @OriginalMember(owner = "client!fs", name = "I", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!fs", name = "J", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!fs", name = "G", descriptor = "Lac;")
    public static class214 field4960;

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "[B")
    public byte[] field4934;

    @OriginalMember(owner = "client!fs", name = "o", descriptor = "[B")
    public byte[] field4942;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Z)V")
    public static void method2243(boolean arg0) {
        field4960 = null;
        field4961 = null;
        if (!arg0) {
            method2243(false);
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ldp;ZLdp;)V")
    public static final void method2244(class174 arg0, boolean arg1, class174 arg2) {
        class350.field4966 = arg0;
        class182.field2690 = arg2;
        field4963++;
        class350.field4966.method1333(0, 34);
        if (arg1) {
            method2244((class174) null, false, (class174) null);
        }
    }
}
