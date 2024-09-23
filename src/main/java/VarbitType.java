import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("qc")
public class VarbitType {

    @OriginalMember(owner = "qc", name = "a", descriptor = "Z")
    private boolean field1170 = true;

    @OriginalMember(owner = "qc", name = "h", descriptor = "Z")
    public boolean field1177 = false;

    @OriginalMember(owner = "qc", name = "i", descriptor = "I")
    public int field1178 = -1;

    @OriginalMember(owner = "qc", name = "b", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "qc", name = "e", descriptor = "I")
    public int field1174;

    @OriginalMember(owner = "qc", name = "f", descriptor = "I")
    public int field1175;

    @OriginalMember(owner = "qc", name = "g", descriptor = "I")
    public int field1176;

    @OriginalMember(owner = "qc", name = "j", descriptor = "I")
    public int field1179;

    @OriginalMember(owner = "qc", name = "d", descriptor = "Ljava/lang/String;")
    public String field1173;

    @OriginalMember(owner = "qc", name = "c", descriptor = "[Lqc;")
    public static VarbitType[] field1172;

    @OriginalMember(owner = "qc", name = "a", descriptor = "(Lxb;I)V")
    public static void method387(Jagfile arg0, int arg1) {
        if (arg1 >= 0) {
            return;
        }
        Packet var2 = new Packet(arg0.method299("varbit.dat", null), 58);
        field1171 = var2.method231();
        if (field1172 == null) {
            field1172 = new VarbitType[field1171];
        }
        for (int var3 = 0; var3 < field1171; var3++) {
            if (field1172[var3] == null) {
                field1172[var3] = new VarbitType();
            }
            field1172[var3].method388(true, var2, var3);
            if (field1172[var3].field1177) {
                VarpType.field1181[field1172[var3].field1174].field1193 = true;
            }
        }
        if (var2.field710.length != var2.field711) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "(ZLlb;I)V")
    public void method388(boolean arg0, Packet arg1, int arg2) {
        if (!arg0) {
            this.field1170 = !this.field1170;
        }
        while (true) {
            int var4 = arg1.method229();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1174 = arg1.method231();
                this.field1175 = arg1.method229();
                this.field1176 = arg1.method229();
            } else if (var4 == 10) {
                this.field1173 = arg1.method236();
            } else if (var4 == 2) {
                this.field1177 = true;
            } else if (var4 == 3) {
                this.field1178 = arg1.method234();
            } else if (var4 == 4) {
                this.field1179 = arg1.method234();
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
