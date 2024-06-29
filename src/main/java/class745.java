import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fka")
public class class745 {

    @OriginalMember(owner = "client!fka", name = "h", descriptor = "[B")
    public byte[] field10945 = new byte[18002];

    @OriginalMember(owner = "client!fka", name = "J", descriptor = "[[I")
    public int[][] field10946 = new int[6][258];

    @OriginalMember(owner = "client!fka", name = "g", descriptor = "[B")
    public byte[] field10952 = new byte[4096];

    @OriginalMember(owner = "client!fka", name = "q", descriptor = "[[B")
    public byte[][] field10959 = new byte[6][258];

    @OriginalMember(owner = "client!fka", name = "j", descriptor = "[I")
    public int[] field10960 = new int[256];

    @OriginalMember(owner = "client!fka", name = "F", descriptor = "[[I")
    public int[][] field10964 = new int[6][258];

    @OriginalMember(owner = "client!fka", name = "s", descriptor = "[I")
    public int[] field10961 = new int[16];

    @OriginalMember(owner = "client!fka", name = "n", descriptor = "[I")
    public int[] field10948 = new int[6];

    @OriginalMember(owner = "client!fka", name = "e", descriptor = "[Z")
    public boolean[] field10973 = new boolean[16];

    @OriginalMember(owner = "client!fka", name = "E", descriptor = "[B")
    public byte[] field10949 = new byte[18002];

    @OriginalMember(owner = "client!fka", name = "G", descriptor = "I")
    public int field10954 = 0;

    @OriginalMember(owner = "client!fka", name = "p", descriptor = "[Z")
    public boolean[] field10976 = new boolean[256];

    @OriginalMember(owner = "client!fka", name = "y", descriptor = "[[I")
    public int[][] field10971 = new int[6][258];

    @OriginalMember(owner = "client!fka", name = "I", descriptor = "I")
    public int field10944 = 0;

    @OriginalMember(owner = "client!fka", name = "v", descriptor = "[B")
    public byte[] field10979 = new byte[256];

    @OriginalMember(owner = "client!fka", name = "l", descriptor = "[I")
    public int[] field10978 = new int[257];

    @OriginalMember(owner = "client!fka", name = "K", descriptor = "[Ljava/lang/String;")
    private static final String[] field10980 = new String[] { method5422(method5421(">+{^\u001bp")), method5422(method5421(">+{^\u0018p")) };

    @OriginalMember(owner = "client!fka", name = "o", descriptor = "[C")
    public static char[] field10965 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!fka", name = "d", descriptor = "B")
    public byte field10958;

    @OriginalMember(owner = "client!fka", name = "A", descriptor = "F")
    public static float field10956;

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "F")
    public static float field10968;

    @OriginalMember(owner = "client!fka", name = "C", descriptor = "I")
    public int field10947;

    @OriginalMember(owner = "client!fka", name = "k", descriptor = "I")
    public int field10950;

    @OriginalMember(owner = "client!fka", name = "i", descriptor = "I")
    public static int field10951;

    @OriginalMember(owner = "client!fka", name = "m", descriptor = "I")
    public int field10953;

    @OriginalMember(owner = "client!fka", name = "x", descriptor = "I")
    public int field10955;

    @OriginalMember(owner = "client!fka", name = "t", descriptor = "I")
    public int field10957;

    @OriginalMember(owner = "client!fka", name = "w", descriptor = "I")
    public int field10963;

    @OriginalMember(owner = "client!fka", name = "B", descriptor = "I")
    public int field10966;

    @OriginalMember(owner = "client!fka", name = "r", descriptor = "I")
    public int field10967;

    @OriginalMember(owner = "client!fka", name = "u", descriptor = "I")
    public int field10969;

    @OriginalMember(owner = "client!fka", name = "D", descriptor = "I")
    public int field10970;

    @OriginalMember(owner = "client!fka", name = "c", descriptor = "I")
    public int field10974;

    @OriginalMember(owner = "client!fka", name = "f", descriptor = "I")
    public int field10975;

    @OriginalMember(owner = "client!fka", name = "H", descriptor = "I")
    public int field10977;

    @OriginalMember(owner = "client!fka", name = "z", descriptor = "[B")
    public byte[] field10962;

    @OriginalMember(owner = "client!fka", name = "b", descriptor = "[B")
    public byte[] field10972;

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "(II)V")
    public static final void method5419(int arg0, int arg1) {
        try {
            if (arg1 == 0) {
                if (!class222.field3488 || class622.field8985.length < arg0) {
                    class622.field8985 = new class356[arg0];
                    class329.field5396 = new int[arg0];
                    class468.field7183 = new class210[arg0];
                    class641.field9195 = new int[arg0];
                    class196.field3119 = new int[arg0];
                    class186.field2963 = new int[arg0];
                    class250.field3829 = new class356[arg0];
                }
                field10951++;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10980[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "(I)V")
    public static void method5420(int arg0) {
        try {
            field10965 = null;
            if (arg0 != 256) {
                method5420(68);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field10980[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5421(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x59);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5422(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 88;
                    break;
                case 1:
                    var10005 = 64;
                    break;
                case 2:
                    var10005 = 26;
                    break;
                case 3:
                    var10005 = 112;
                    break;
                default:
                    var10005 = 89;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
