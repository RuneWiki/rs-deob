import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class357 {

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "[B")
    public byte[] field4898 = new byte[4096];

    @OriginalMember(owner = "client!wn", name = "h", descriptor = "[B")
    public byte[] field4905 = new byte[18002];

    @OriginalMember(owner = "client!wn", name = "o", descriptor = "[I")
    public int[] field4912 = new int[16];

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "[I")
    public int[] field4902 = new int[256];

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "[[I")
    public int[][] field4900 = new int[6][258];

    @OriginalMember(owner = "client!wn", name = "l", descriptor = "I")
    public int field4909 = 0;

    @OriginalMember(owner = "client!wn", name = "s", descriptor = "[B")
    public byte[] field4916 = new byte[256];

    @OriginalMember(owner = "client!wn", name = "n", descriptor = "I")
    public int field4911 = 0;

    @OriginalMember(owner = "client!wn", name = "u", descriptor = "[[I")
    public int[][] field4918 = new int[6][258];

    @OriginalMember(owner = "client!wn", name = "p", descriptor = "[Z")
    public boolean[] field4913 = new boolean[256];

    @OriginalMember(owner = "client!wn", name = "y", descriptor = "[Z")
    public boolean[] field4922 = new boolean[16];

    @OriginalMember(owner = "client!wn", name = "B", descriptor = "[I")
    public int[] field4925 = new int[6];

    @OriginalMember(owner = "client!wn", name = "G", descriptor = "[B")
    public byte[] field4930 = new byte[18002];

    @OriginalMember(owner = "client!wn", name = "t", descriptor = "[I")
    public int[] field4917 = new int[257];

    @OriginalMember(owner = "client!wn", name = "F", descriptor = "[[B")
    public byte[][] field4929 = new byte[6][258];

    @OriginalMember(owner = "client!wn", name = "J", descriptor = "[[I")
    public int[][] field4933 = new int[6][258];

    @OriginalMember(owner = "client!wn", name = "E", descriptor = "Lcf;")
    public static class92 field4928 = new class92();

    @OriginalMember(owner = "client!wn", name = "K", descriptor = "S")
    public static short field4934 = 205;

    @OriginalMember(owner = "client!wn", name = "I", descriptor = "Lrc;")
    public static class108 field4932 = new class108(53, 7);

    @OriginalMember(owner = "client!wn", name = "L", descriptor = "Z")
    public static boolean field4935 = false;

    @OriginalMember(owner = "client!wn", name = "M", descriptor = "I")
    public static int field4936 = 0;

    @OriginalMember(owner = "client!wn", name = "r", descriptor = "B")
    public byte field4915;

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
    public int field4899;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
    public int field4901;

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "I")
    public int field4903;

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
    public int field4904;

    @OriginalMember(owner = "client!wn", name = "j", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!wn", name = "k", descriptor = "I")
    public int field4908;

    @OriginalMember(owner = "client!wn", name = "q", descriptor = "I")
    public int field4914;

    @OriginalMember(owner = "client!wn", name = "v", descriptor = "I")
    public int field4919;

    @OriginalMember(owner = "client!wn", name = "w", descriptor = "I")
    public int field4920;

    @OriginalMember(owner = "client!wn", name = "x", descriptor = "I")
    public int field4921;

    @OriginalMember(owner = "client!wn", name = "A", descriptor = "I")
    public int field4924;

    @OriginalMember(owner = "client!wn", name = "C", descriptor = "I")
    public int field4926;

    @OriginalMember(owner = "client!wn", name = "D", descriptor = "I")
    public int field4927;

    @OriginalMember(owner = "client!wn", name = "H", descriptor = "I")
    public int field4931;

    @OriginalMember(owner = "client!wn", name = "m", descriptor = "[B")
    public byte[] field4910;

    @OriginalMember(owner = "client!wn", name = "z", descriptor = "[B")
    public byte[] field4923;

    @OriginalMember(owner = "client!wn", name = "i", descriptor = "[Lfq;")
    public static class87[] field4906;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V", line = 84)
    public static void method2207(int arg0) {
        field4928 = null;
        field4906 = null;
        field4932 = null;
        int var1 = -70 % ((arg0 + 38) / 61);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 120)
    public static final void method2208(String arg0, int arg1) {
        field4907++;
        class114.field1604 = arg0;
        if (class436.field6206.field960 == null) {
            return;
        }
        try {
            String var2 = class436.field6206.field960.getParameter("cookieprefix");
            String var3 = class436.field6206.field960.getParameter("cookiehost");
            if (arg1 != -13165) {
                field4906 = null;
            }
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class38.method236(11, class10.method51(arg1 ^ 0x3F02) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class32.method201((byte) -101, class436.field6206.field960, "document.cookie=\"" + var5 + "\"");
        } catch (Throwable var6) {
        }
    }
}
