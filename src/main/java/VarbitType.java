import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("qc")
public class VarbitType {

    @OriginalMember(owner = "qc", name = "b", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "qc", name = "e", descriptor = "I")
    public int field1149;

    @OriginalMember(owner = "qc", name = "f", descriptor = "I")
    public int field1150;

    @OriginalMember(owner = "qc", name = "g", descriptor = "I")
    public int field1151;

    @OriginalMember(owner = "qc", name = "d", descriptor = "Ljava/lang/String;")
    public String field1148;

    @OriginalMember(owner = "qc", name = "a", descriptor = "Z")
    private static boolean field1145;

    @OriginalMember(owner = "qc", name = "c", descriptor = "[Lqc;")
    public static VarbitType[] field1147;

    @OriginalMember(owner = "qc", name = "a", descriptor = "(ZLyb;)V")
    public static void method389(boolean arg0, Jagfile arg1) {
        if (!arg0) {
            field1145 = !field1145;
        }
        Packet var2 = new Packet(arg1.method309("varbit.dat", null), (byte) 3);
        field1146 = var2.method241();
        if (field1147 == null) {
            field1147 = new VarbitType[field1146];
        }
        for (int var3 = 0; var3 < field1146; var3++) {
            if (field1147[var3] == null) {
                field1147[var3] = new VarbitType();
            }
            field1147[var3].method390(var3, 890, var2);
        }
        if (var2.field710.length != var2.field711) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "(IILmb;)V")
    public void method390(int arg0, int arg1, Packet arg2) {
        int var4 = 26 / arg1;
        while (true) {
            int var5 = arg2.method239();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field1149 = arg2.method241();
                this.field1150 = arg2.method239();
                this.field1151 = arg2.method239();
            } else if (var5 == 10) {
                this.field1148 = arg2.method246();
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}
