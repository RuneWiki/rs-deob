import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("qc")
public class VarbitType {

    @OriginalMember(owner = "qc", name = "a", descriptor = "Z")
    private boolean field1166 = false;

    @OriginalMember(owner = "qc", name = "b", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "qc", name = "e", descriptor = "I")
    public int field1170;

    @OriginalMember(owner = "qc", name = "f", descriptor = "I")
    public int field1171;

    @OriginalMember(owner = "qc", name = "g", descriptor = "I")
    public int field1172;

    @OriginalMember(owner = "qc", name = "d", descriptor = "Ljava/lang/String;")
    public String field1169;

    @OriginalMember(owner = "qc", name = "c", descriptor = "[Lqc;")
    public static VarbitType[] field1168;

    @OriginalMember(owner = "qc", name = "a", descriptor = "(ILxb;)V")
    public static void method380(int arg0, Jagfile arg1) {
        Packet var2 = new Packet((byte) 3, arg1.method294("varbit.dat", null));
        int var3 = 44 / arg0;
        field1167 = var2.method226();
        if (field1168 == null) {
            field1168 = new VarbitType[field1167];
        }
        for (int var4 = 0; var4 < field1167; var4++) {
            if (field1168[var4] == null) {
                field1168[var4] = new VarbitType();
            }
            field1168[var4].method381(0, var4, var2);
        }
        if (var2.field701.length != var2.field702) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "(IILlb;)V")
    public void method381(int arg0, int arg1, Packet arg2) {
        if (arg0 != 0) {
            this.field1166 = !this.field1166;
        }
        while (true) {
            int var4 = arg2.method224();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1170 = arg2.method226();
                this.field1171 = arg2.method224();
                this.field1172 = arg2.method224();
            } else if (var4 == 10) {
                this.field1169 = arg2.method231();
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
