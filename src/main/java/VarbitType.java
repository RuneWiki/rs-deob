import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("qc")
public class VarbitType {

    @OriginalMember(owner = "qc", name = "a", descriptor = "I")
    private int field1182 = 2;

    @OriginalMember(owner = "qc", name = "b", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "qc", name = "e", descriptor = "I")
    public int field1186;

    @OriginalMember(owner = "qc", name = "f", descriptor = "I")
    public int field1187;

    @OriginalMember(owner = "qc", name = "g", descriptor = "I")
    public int field1188;

    @OriginalMember(owner = "qc", name = "d", descriptor = "Ljava/lang/String;")
    public String field1185;

    @OriginalMember(owner = "qc", name = "c", descriptor = "[Lqc;")
    public static VarbitType[] field1184;

    @OriginalMember(owner = "qc", name = "a", descriptor = "(Lyb;I)V")
    public static void method389(Jagfile arg0, int arg1) {
        int var2 = 57 / arg1;
        Packet var3 = new Packet(45427, arg0.method309("varbit.dat", null));
        field1183 = var3.method241();
        if (field1184 == null) {
            field1184 = new VarbitType[field1183];
        }
        for (int var4 = 0; var4 < field1183; var4++) {
            if (field1184[var4] == null) {
                field1184[var4] = new VarbitType();
            }
            field1184[var4].method390(var3, var4, 312);
        }
        if (var3.field735.length != var3.field736) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "(Lmb;II)V")
    public void method390(Packet arg0, int arg1, int arg2) {
        if (arg2 <= 0) {
            this.field1182 = -347;
        }
        while (true) {
            int var4 = arg0.method239();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1186 = arg0.method241();
                this.field1187 = arg0.method239();
                this.field1188 = arg0.method239();
            } else if (var4 == 10) {
                this.field1185 = arg0.method246();
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
