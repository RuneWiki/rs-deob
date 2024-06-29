import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class59 extends class34 {

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "[B")
    public byte[] field1181;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
    public static int field1184 = -1;

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "[I")
    public static int[] field1191 = new int[32];

    @OriginalMember(owner = "client!ja", name = "C", descriptor = "Lcc;")
    public static class209 field1196 = class95.method669(86, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
    public static int field1188 = 0;

    @OriginalMember(owner = "client!ja", name = "B", descriptor = "Lcc;")
    private static class209 field1195 = class95.method669(108, "Loaded interfaces");

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "Lcc;")
    public static class209 field1183 = field1195;

    @OriginalMember(owner = "client!ja", name = "z", descriptor = "Lcc;")
    public static class209 field1193 = class95.method669(92, ": ");

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "Lsj;")
    public static class49 field1190;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "Z")
    public static boolean field1182;

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "[Z")
    public static boolean[] field1189;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V")
    public static final void method450(int arg0) {
        field1192++;
        class168.field3023 = 1;
        class129.field2488 = 0;
        class8.field164 = -3;
        class79.field1471 = 0;
        class49.field975 = false;
        class262.field4727 = 0;
        class195.field3516 = -1;
        if (arg0 != 6362) {
            method450(-69);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZ)V")
    public static final void method451(int arg0, boolean arg1) {
        field1185++;
        if (arg1 != class185.field3338) {
            int var2 = -126 / ((36 - arg0) / 49);
            class185.field3338 = arg1;
            class215.method1510(89);
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "([B)V")
    public class59(byte[] arg0) {
        this.field1181 = arg0;
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V")
    public static void method452(int arg0) {
        field1191 = null;
        field1190 = null;
        field1183 = null;
        if (arg0 != 0) {
            method450(-106);
        }
        field1195 = null;
        field1189 = null;
        field1196 = null;
        field1193 = null;
    }
}
