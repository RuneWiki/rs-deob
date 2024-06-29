import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class88 extends class240 {

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "[Lia;")
    public static class210[] field1341 = new class210[4];

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "Lnb;")
    public static class315 field1343 = null;

    @OriginalMember(owner = "client!jk", name = "C", descriptor = "Lik;")
    public static class259 field1355 = new class259(4);

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
    public int field1342;

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!jk", name = "s", descriptor = "I")
    public int field1345;

    @OriginalMember(owner = "client!jk", name = "u", descriptor = "I")
    public int field1347;

    @OriginalMember(owner = "client!jk", name = "v", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!jk", name = "w", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!jk", name = "x", descriptor = "I")
    public int field1350;

    @OriginalMember(owner = "client!jk", name = "y", descriptor = "I")
    public int field1351;

    @OriginalMember(owner = "client!jk", name = "B", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!jk", name = "D", descriptor = "Lui;")
    public static class266 field1356;

    @OriginalMember(owner = "client!jk", name = "t", descriptor = "Lob;")
    public class292 field1346;

    @OriginalMember(owner = "client!jk", name = "E", descriptor = "Lob;")
    public class292 field1357;

    @OriginalMember(owner = "client!jk", name = "A", descriptor = "Ljava/lang/String;")
    public String field1353;

    @OriginalMember(owner = "client!jk", name = "z", descriptor = "Z")
    public boolean field1352;

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "[Ljava/lang/Object;")
    public Object[] field1340;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIBLja;)[Lai;", line = 24)
    public static final class126[] method628(int arg0, int arg1, byte arg2, class64 arg3) {
        field1354++;
        if (class150.method1152(arg3, arg0, 50, arg1)) {
            int var4 = 89 % ((arg2 + 66) / 53);
            return class104.method804((byte) -47);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V", line = 38)
    public static void method629(byte arg0) {
        if (arg0 > -37) {
            method628(-92, -100, (byte) -126, (class64) null);
        }
        field1343 = null;
        field1341 = null;
        field1356 = null;
        field1355 = null;
    }
}
