import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class75 {

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "I")
    public int field1029 = 0;

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "[[I")
    public int[][] field1025 = new int[6][258];

    @OriginalMember(owner = "client!cq", name = "j", descriptor = "[B")
    public byte[] field1033 = new byte[18002];

    @OriginalMember(owner = "client!cq", name = "o", descriptor = "[Z")
    public boolean[] field1038 = new boolean[256];

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "[[I")
    public int[][] field1024 = new int[6][258];

    @OriginalMember(owner = "client!cq", name = "B", descriptor = "[B")
    public byte[] field1051 = new byte[18002];

    @OriginalMember(owner = "client!cq", name = "G", descriptor = "[[I")
    public int[][] field1056 = new int[6][258];

    @OriginalMember(owner = "client!cq", name = "y", descriptor = "[I")
    public int[] field1048 = new int[6];

    @OriginalMember(owner = "client!cq", name = "p", descriptor = "I")
    public int field1039 = 0;

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "[Z")
    public boolean[] field1030 = new boolean[16];

    @OriginalMember(owner = "client!cq", name = "K", descriptor = "[I")
    public int[] field1060 = new int[256];

    @OriginalMember(owner = "client!cq", name = "z", descriptor = "[B")
    public byte[] field1049 = new byte[256];

    @OriginalMember(owner = "client!cq", name = "N", descriptor = "[I")
    public int[] field1063 = new int[257];

    @OriginalMember(owner = "client!cq", name = "k", descriptor = "[[B")
    public byte[][] field1034 = new byte[6][258];

    @OriginalMember(owner = "client!cq", name = "q", descriptor = "[B")
    public byte[] field1040 = new byte[4096];

    @OriginalMember(owner = "client!cq", name = "L", descriptor = "[I")
    public int[] field1061 = new int[16];

    @OriginalMember(owner = "client!cq", name = "A", descriptor = "Z")
    public static boolean field1050 = false;

    @OriginalMember(owner = "client!cq", name = "s", descriptor = "I")
    public static int field1042 = 0;

    @OriginalMember(owner = "client!cq", name = "F", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!cq", name = "I", descriptor = "I")
    public static int field1058 = field1055;

    @OriginalMember(owner = "client!cq", name = "D", descriptor = "I")
    public static int field1053 = field1055 >> 2;

    @OriginalMember(owner = "client!cq", name = "r", descriptor = "I")
    public static int field1041 = 0;

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "Lo;")
    public static class332 field1031 = new class332("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!cq", name = "m", descriptor = "B")
    public byte field1036;

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "I")
    public int field1027;

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "I")
    public int field1028;

    @OriginalMember(owner = "client!cq", name = "i", descriptor = "I")
    public int field1032;

    @OriginalMember(owner = "client!cq", name = "l", descriptor = "I")
    public int field1035;

    @OriginalMember(owner = "client!cq", name = "n", descriptor = "I")
    public int field1037;

    @OriginalMember(owner = "client!cq", name = "t", descriptor = "I")
    public int field1043;

    @OriginalMember(owner = "client!cq", name = "v", descriptor = "I")
    public int field1045;

    @OriginalMember(owner = "client!cq", name = "w", descriptor = "I")
    public int field1046;

    @OriginalMember(owner = "client!cq", name = "x", descriptor = "I")
    public int field1047;

    @OriginalMember(owner = "client!cq", name = "C", descriptor = "I")
    public int field1052;

    @OriginalMember(owner = "client!cq", name = "E", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!cq", name = "H", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!cq", name = "J", descriptor = "I")
    public int field1059;

    @OriginalMember(owner = "client!cq", name = "M", descriptor = "I")
    public int field1062;

    @OriginalMember(owner = "client!cq", name = "O", descriptor = "I")
    public int field1064;

    @OriginalMember(owner = "client!cq", name = "u", descriptor = "[B")
    public byte[] field1044;

    @OriginalMember(owner = "client!cq", name = "P", descriptor = "[B")
    public byte[] field1065;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)V")
    public static void method644(byte arg0) {
        field1031 = null;
        if (arg0 != -126) {
            field1031 = null;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V")
    public static final void method645(int arg0) {
        class449.field6350 = 0;
        class121.field1674 = 0;
        class488.field6849 = 0;
        class115.field1604 = 0;
        field1026++;
        if (arg0 < 76) {
            method644((byte) -58);
        }
    }
}
