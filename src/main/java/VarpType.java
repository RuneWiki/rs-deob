import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lc")
public class VarpType {

    @OriginalMember(owner = "lc", name = "i", descriptor = "Z")
    public boolean field1055 = false;

    @OriginalMember(owner = "lc", name = "j", descriptor = "Z")
    public boolean field1056 = true;

    @OriginalMember(owner = "lc", name = "l", descriptor = "Z")
    public boolean field1058 = false;

    @OriginalMember(owner = "lc", name = "n", descriptor = "Z")
    public boolean field1060 = false;

    @OriginalMember(owner = "lc", name = "a", descriptor = "B")
    private static byte field1047 = 9;

    @OriginalMember(owner = "lc", name = "b", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "lc", name = "d", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "lc", name = "g", descriptor = "I")
    public int field1053;

    @OriginalMember(owner = "lc", name = "h", descriptor = "I")
    public int field1054;

    @OriginalMember(owner = "lc", name = "k", descriptor = "I")
    public int field1057;

    @OriginalMember(owner = "lc", name = "m", descriptor = "I")
    public int field1059;

    @OriginalMember(owner = "lc", name = "f", descriptor = "Ljava/lang/String;")
    public String field1052;

    @OriginalMember(owner = "lc", name = "e", descriptor = "[I")
    public static int[] field1051;

    @OriginalMember(owner = "lc", name = "c", descriptor = "[Llc;")
    public static VarpType[] field1049;

    @OriginalMember(owner = "lc", name = "a", descriptor = "(ILub;)V")
    public static void method331(int arg0, Jagfile arg1) {
        if (arg0 != -5880) {
            return;
        }
        Packet var2 = new Packet((byte) 64, arg1.method257(null, "varp.dat", -31149));
        field1050 = 0;
        field1048 = var2.method218();
        if (field1049 == null) {
            field1049 = new VarpType[field1048];
        }
        if (field1051 == null) {
            field1051 = new int[field1048];
        }
        for (int var3 = 0; var3 < field1048; var3++) {
            if (field1049[var3] == null) {
                field1049[var3] = new VarpType();
            }
            field1049[var3].method332(var2, var3, field1047);
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(Lkb;IB)V")
    public void method332(Packet arg0, int arg1, byte arg2) {
        if (arg2 != 9) {
            return;
        }
        while (true) {
            int var4 = arg0.method216();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1053 = arg0.method216();
            } else if (var4 == 2) {
                this.field1054 = arg0.method216();
            } else if (var4 == 3) {
                this.field1055 = true;
                field1051[field1050++] = arg1;
            } else if (var4 == 4) {
                this.field1056 = false;
            } else if (var4 == 5) {
                this.field1057 = arg0.method218();
            } else if (var4 == 6) {
                this.field1058 = true;
            } else if (var4 == 7) {
                this.field1059 = arg0.method221();
            } else if (var4 == 8) {
                this.field1060 = true;
            } else if (var4 == 10) {
                this.field1052 = arg0.method223();
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
