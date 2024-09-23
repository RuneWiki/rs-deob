import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("qc")
public class VarbitType {

    @OriginalMember(owner = "qc", name = "a", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "qc", name = "d", descriptor = "I")
    public int field1146;

    @OriginalMember(owner = "qc", name = "e", descriptor = "I")
    public int field1147;

    @OriginalMember(owner = "qc", name = "f", descriptor = "I")
    public int field1148;

    @OriginalMember(owner = "qc", name = "c", descriptor = "Ljava/lang/String;")
    public String field1145;

    @OriginalMember(owner = "qc", name = "b", descriptor = "[Lqc;")
    public static VarbitType[] field1144;

    @OriginalMember(owner = "qc", name = "a", descriptor = "(Lyb;Z)V")
    public static void method389(Jagfile arg0, boolean arg1) {
        Packet var2 = new Packet(arg0.method309("varbit.dat", null), 337);
        field1143 = var2.method241();
        if (field1144 == null) {
            field1144 = new VarbitType[field1143];
        }
        for (int var3 = 0; var3 < field1143; var3++) {
            if (field1144[var3] == null) {
                field1144[var3] = new VarbitType();
            }
            field1144[var3].method390(-448, var3, var2);
        }
        if (!arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (var2.field709.length != var2.field710) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "(IILmb;)V")
    public void method390(int arg0, int arg1, Packet arg2) {
        if (arg0 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            int var5 = arg2.method239();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field1146 = arg2.method241();
                this.field1147 = arg2.method239();
                this.field1148 = arg2.method239();
            } else if (var5 == 10) {
                this.field1145 = arg2.method246();
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}
