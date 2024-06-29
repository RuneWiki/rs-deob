import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class230 {

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "I")
    public int field2722 = 0;

    @OriginalMember(owner = "client!sba", name = "c", descriptor = "[Z")
    public boolean[] field2724 = new boolean[16];

    @OriginalMember(owner = "client!sba", name = "j", descriptor = "[B")
    public byte[] field2731 = new byte[4096];

    @OriginalMember(owner = "client!sba", name = "m", descriptor = "[[I")
    public int[][] field2734 = new int[6][258];

    @OriginalMember(owner = "client!sba", name = "u", descriptor = "[I")
    public int[] field2742 = new int[256];

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "[[I")
    public int[][] field2723 = new int[6][258];

    @OriginalMember(owner = "client!sba", name = "D", descriptor = "[Z")
    public boolean[] field2751 = new boolean[256];

    @OriginalMember(owner = "client!sba", name = "y", descriptor = "I")
    public int field2746 = 0;

    @OriginalMember(owner = "client!sba", name = "g", descriptor = "[B")
    public byte[] field2728 = new byte[18002];

    @OriginalMember(owner = "client!sba", name = "H", descriptor = "[I")
    public int[] field2755 = new int[257];

    @OriginalMember(owner = "client!sba", name = "F", descriptor = "[[B")
    public byte[][] field2753 = new byte[6][258];

    @OriginalMember(owner = "client!sba", name = "r", descriptor = "[I")
    public int[] field2739 = new int[16];

    @OriginalMember(owner = "client!sba", name = "k", descriptor = "[B")
    public byte[] field2732 = new byte[256];

    @OriginalMember(owner = "client!sba", name = "v", descriptor = "[[I")
    public int[][] field2743 = new int[6][258];

    @OriginalMember(owner = "client!sba", name = "l", descriptor = "[B")
    public byte[] field2733 = new byte[18002];

    @OriginalMember(owner = "client!sba", name = "p", descriptor = "[I")
    public int[] field2737 = new int[6];

    @OriginalMember(owner = "client!sba", name = "x", descriptor = "I")
    public static int field2745 = 13156520;

    @OriginalMember(owner = "client!sba", name = "o", descriptor = "I")
    public static int field2736 = 0;

    @OriginalMember(owner = "client!sba", name = "B", descriptor = "B")
    public byte field2749;

    @OriginalMember(owner = "client!sba", name = "d", descriptor = "I")
    public int field2725;

    @OriginalMember(owner = "client!sba", name = "e", descriptor = "I")
    public int field2726;

    @OriginalMember(owner = "client!sba", name = "f", descriptor = "I")
    public int field2727;

    @OriginalMember(owner = "client!sba", name = "h", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!sba", name = "i", descriptor = "I")
    public int field2730;

    @OriginalMember(owner = "client!sba", name = "n", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!sba", name = "s", descriptor = "I")
    public int field2740;

    @OriginalMember(owner = "client!sba", name = "w", descriptor = "I")
    public int field2744;

    @OriginalMember(owner = "client!sba", name = "z", descriptor = "I")
    public int field2747;

    @OriginalMember(owner = "client!sba", name = "A", descriptor = "I")
    public int field2748;

    @OriginalMember(owner = "client!sba", name = "C", descriptor = "I")
    public int field2750;

    @OriginalMember(owner = "client!sba", name = "E", descriptor = "I")
    public int field2752;

    @OriginalMember(owner = "client!sba", name = "G", descriptor = "I")
    public int field2754;

    @OriginalMember(owner = "client!sba", name = "I", descriptor = "I")
    public int field2756;

    @OriginalMember(owner = "client!sba", name = "J", descriptor = "I")
    public int field2757;

    @OriginalMember(owner = "client!sba", name = "q", descriptor = "[B")
    public byte[] field2738;

    @OriginalMember(owner = "client!sba", name = "t", descriptor = "[B")
    public byte[] field2741;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(IIIIIIILps;IIILft;)V")
    public static final void method1418(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class105 arg7, int arg8, int arg9, int arg10, class4 arg11) {
        field2735++;
        class435.field5745 = arg3;
        class512.field7233 = arg4;
        class153.field1911 = arg6;
        class662.field9093 = null;
        class150.field1878 = arg8;
        class431.field5680 = arg11;
        class212.field2505 = null;
        class194.field2308 = arg5;
        class192.field2294 = arg7;
        class386.field4974 = null;
        class714.field10022 = arg2;
        class441.field5922 = arg9;
        class117.field1483 = arg1;
        class403.field5288 = arg0;
        class674.method3784((byte) -120);
        class83.field1124 = true;
        if (arg10 != 6) {
            field2729 = 85;
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(III)V")
    public static final void method1419(int arg0, int arg1, int arg2) {
        class727 var3 = class107.field1351[arg0][arg1][arg2];
        if (var3 != null) {
            class502.method3001(var3.field10177);
            if (var3.field10177 != null) {
                var3.field10177 = null;
            }
        }
    }
}
