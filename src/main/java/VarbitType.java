import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("qc")
public class VarbitType {

    @OriginalMember(owner = "qc", name = "a", descriptor = "B")
    private static byte field1167 = 6;

    @OriginalMember(owner = "qc", name = "b", descriptor = "Z")
    private static boolean field1168 = true;

    @OriginalMember(owner = "qc", name = "c", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "qc", name = "f", descriptor = "I")
    public int field1172;

    @OriginalMember(owner = "qc", name = "g", descriptor = "I")
    public int field1173;

    @OriginalMember(owner = "qc", name = "h", descriptor = "I")
    public int field1174;

    @OriginalMember(owner = "qc", name = "e", descriptor = "Ljava/lang/String;")
    public String field1171;

    @OriginalMember(owner = "qc", name = "d", descriptor = "[Lqc;")
    public static VarbitType[] field1170;

    @OriginalMember(owner = "qc", name = "a", descriptor = "(ZLxb;)V")
    public static void method380(boolean arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method294("varbit.dat", null), (byte) 1);
        field1169 = var2.method226();
        if (arg0) {
            field1168 = !field1168;
        }
        if (field1170 == null) {
            field1170 = new VarbitType[field1169];
        }
        for (int var3 = 0; var3 < field1169; var3++) {
            if (field1170[var3] == null) {
                field1170[var3] = new VarbitType();
            }
            field1170[var3].method381(var2, field1167, var3);
        }
        if (var2.field708.length != var2.field709) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "(Llb;BI)V")
    public void method381(Packet arg0, byte arg1, int arg2) {
        if (arg1 != 6) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            int var5 = arg0.method224();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field1172 = arg0.method226();
                this.field1173 = arg0.method224();
                this.field1174 = arg0.method224();
            } else if (var5 == 10) {
                this.field1171 = arg0.method231();
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}
