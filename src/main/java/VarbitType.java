import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("qc")
public class VarbitType {

    @OriginalMember(owner = "qc", name = "a", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "qc", name = "d", descriptor = "I")
    public int field1159;

    @OriginalMember(owner = "qc", name = "e", descriptor = "I")
    public int field1160;

    @OriginalMember(owner = "qc", name = "f", descriptor = "I")
    public int field1161;

    @OriginalMember(owner = "qc", name = "c", descriptor = "Ljava/lang/String;")
    public String field1158;

    @OriginalMember(owner = "qc", name = "b", descriptor = "[Lqc;")
    public static VarbitType[] field1157;

    @OriginalMember(owner = "qc", name = "a", descriptor = "(ZLyb;)V")
    public static void method389(boolean arg0, Jagfile arg1) {
        Packet var2 = new Packet(16, arg1.method309("varbit.dat", null));
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        field1156 = var2.method241();
        if (field1157 == null) {
            field1157 = new VarbitType[field1156];
        }
        for (int var4 = 0; var4 < field1156; var4++) {
            if (field1157[var4] == null) {
                field1157[var4] = new VarbitType();
            }
            field1157[var4].method390(var2, -40834, var4);
        }
        if (var2.field716.length != var2.field717) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "(Lmb;II)V")
    public void method390(Packet arg0, int arg1, int arg2) {
        if (arg1 != -40834) {
            return;
        }
        while (true) {
            int var4 = arg0.method239();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1159 = arg0.method241();
                this.field1160 = arg0.method239();
                this.field1161 = arg0.method239();
            } else if (var4 == 10) {
                this.field1158 = arg0.method246();
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
