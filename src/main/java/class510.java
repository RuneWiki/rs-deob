import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class510 {

    @OriginalMember(owner = "client!jq", name = "m", descriptor = "[Z")
    public boolean[] field7259 = new boolean[256];

    @OriginalMember(owner = "client!jq", name = "s", descriptor = "[B")
    public byte[] field7265 = new byte[18002];

    @OriginalMember(owner = "client!jq", name = "p", descriptor = "[[B")
    public byte[][] field7262 = new byte[6][258];

    @OriginalMember(owner = "client!jq", name = "q", descriptor = "[B")
    public byte[] field7263 = new byte[18002];

    @OriginalMember(owner = "client!jq", name = "l", descriptor = "[I")
    public int[] field7258 = new int[257];

    @OriginalMember(owner = "client!jq", name = "z", descriptor = "[I")
    public int[] field7272 = new int[256];

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "[Z")
    public boolean[] field7249 = new boolean[16];

    @OriginalMember(owner = "client!jq", name = "D", descriptor = "[I")
    public int[] field7276 = new int[16];

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "[[I")
    public int[][] field7254 = new int[6][258];

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "[B")
    public byte[] field7247 = new byte[4096];

    @OriginalMember(owner = "client!jq", name = "E", descriptor = "I")
    public int field7277 = 0;

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "[[I")
    public int[][] field7252 = new int[6][258];

    @OriginalMember(owner = "client!jq", name = "u", descriptor = "I")
    public int field7267 = 0;

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "[[I")
    public int[][] field7251 = new int[6][258];

    @OriginalMember(owner = "client!jq", name = "x", descriptor = "[B")
    public byte[] field7270 = new byte[256];

    @OriginalMember(owner = "client!jq", name = "L", descriptor = "[I")
    public int[] field7284 = new int[6];

    @OriginalMember(owner = "client!jq", name = "y", descriptor = "S")
    public static short field7271 = 32767;

    @OriginalMember(owner = "client!jq", name = "n", descriptor = "B")
    public byte field7260;

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "I")
    public static int field7248;

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "I")
    public int field7253;

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "I")
    public int field7255;

    @OriginalMember(owner = "client!jq", name = "j", descriptor = "I")
    public int field7256;

    @OriginalMember(owner = "client!jq", name = "k", descriptor = "I")
    public int field7257;

    @OriginalMember(owner = "client!jq", name = "o", descriptor = "I")
    public int field7261;

    @OriginalMember(owner = "client!jq", name = "r", descriptor = "I")
    public int field7264;

    @OriginalMember(owner = "client!jq", name = "t", descriptor = "I")
    public int field7266;

    @OriginalMember(owner = "client!jq", name = "w", descriptor = "I")
    public static int field7269;

    @OriginalMember(owner = "client!jq", name = "A", descriptor = "I")
    public int field7273;

    @OriginalMember(owner = "client!jq", name = "B", descriptor = "I")
    public static int field7274;

    @OriginalMember(owner = "client!jq", name = "F", descriptor = "I")
    public static int field7278;

    @OriginalMember(owner = "client!jq", name = "G", descriptor = "I")
    public int field7279;

    @OriginalMember(owner = "client!jq", name = "H", descriptor = "I")
    public int field7280;

    @OriginalMember(owner = "client!jq", name = "I", descriptor = "I")
    public int field7281;

    @OriginalMember(owner = "client!jq", name = "J", descriptor = "I")
    public static int field7282;

    @OriginalMember(owner = "client!jq", name = "K", descriptor = "I")
    public int field7283;

    @OriginalMember(owner = "client!jq", name = "M", descriptor = "I")
    public int field7285;

    @OriginalMember(owner = "client!jq", name = "v", descriptor = "[B")
    public byte[] field7268;

    @OriginalMember(owner = "client!jq", name = "C", descriptor = "[B")
    public byte[] field7275;

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "[I")
    public static int[] field7250;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IB)V")
    public static final void method3012(int arg0, byte arg1) {
        if (arg1 <= 86) {
            field7271 = 64;
        }
        class541.field7788 = arg0;
        field7274++;
        class657.field9393.method3549(0);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V")
    public static void method3013(int arg0) {
        field7250 = null;
        if (arg0 != 256) {
            field7250 = null;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(III)Lcj;")
    public static final class691 method3014(int arg0, int arg1, int arg2) {
        if (class638.field9170[arg0][arg1][arg2] == null) {
            boolean var3 = class638.field9170[0][arg1][arg2] != null && class638.field9170[0][arg1][arg2].field9737 != null;
            if (var3 && arg0 >= class723.field10134 - 1) {
                return null;
            }
            class267.method1603(arg0, arg1, arg2);
        }
        return class638.field9170[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)I")
    public static final int method3015(int arg0, int arg1) {
        field7282++;
        if (arg0 != 32767) {
            method3014(55, -38, -39);
        }
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V")
    public static final void method3016(int arg0) {
        if (arg0 > -110) {
            method3014(-116, -85, 22);
        }
        class161.field1802 = true;
        field7248++;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lkw;I)V")
    public static final void method3017(class249 arg0, int arg1) {
        field7269++;
        class210.field2474.method1721((byte) -85, arg0);
        arg0.field3015 = arg0.field3016.field2903;
        arg0.field3016.field2903 = 0;
        class189.field2242 += arg0.field3015;
        if (arg1 < 46) {
            field7278 = 33;
        }
    }
}
