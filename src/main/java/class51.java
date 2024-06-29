import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class51 extends class12 {

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "Lkh;")
    public static class117 field1053 = class224.method1450((byte) 115, "::clientdrop");

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "Lah;")
    public static class9 field1045 = null;

    @OriginalMember(owner = "client!ef", name = "K", descriptor = "[Z")
    public static boolean[] field1058 = new boolean[100];

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
    public int field1050;

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "I")
    public int field1051;

    @OriginalMember(owner = "client!ef", name = "D", descriptor = "I")
    public int field1052;

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "I")
    public int field1054;

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "I")
    public int field1055;

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "Lai;")
    public static class10 field1049;

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "Lkh;")
    public class117 field1044;

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "Lah;")
    public class9 field1046;

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "Lah;")
    public class9 field1057;

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "Z")
    public boolean field1056;

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "[Ljava/lang/Object;")
    public Object[] field1048;

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "[[[Lpf;")
    public static class170[][][] field1047;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)V")
    public static final void method391(int arg0, int arg1, int arg2) {
        class170 var3 = class109.field2063[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field3074 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)I")
    public static final int method392(int arg0, byte arg1) {
        if (arg1 != -15) {
            field1058 = null;
        }
        field1043++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(B)V")
    public static void method393(byte arg0) {
        field1053 = null;
        field1047 = null;
        if (arg0 == 61) {
            field1058 = null;
            field1049 = null;
            field1045 = null;
        }
    }
}
