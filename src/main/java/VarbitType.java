import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("qc")
public class VarbitType {

    @OriginalMember(owner = "qc", name = "i", descriptor = "Z")
    public boolean field1187 = false;

    @OriginalMember(owner = "qc", name = "j", descriptor = "I")
    public int field1188 = -1;

    @OriginalMember(owner = "qc", name = "b", descriptor = "B")
    private static byte field1180;

    @OriginalMember(owner = "qc", name = "c", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "qc", name = "f", descriptor = "I")
    public int field1184;

    @OriginalMember(owner = "qc", name = "g", descriptor = "I")
    public int field1185;

    @OriginalMember(owner = "qc", name = "h", descriptor = "I")
    public int field1186;

    @OriginalMember(owner = "qc", name = "k", descriptor = "I")
    public int field1189;

    @OriginalMember(owner = "qc", name = "e", descriptor = "Ljava/lang/String;")
    public String field1183;

    @OriginalMember(owner = "qc", name = "a", descriptor = "Z")
    private static boolean field1179;

    @OriginalMember(owner = "qc", name = "d", descriptor = "[Lqc;")
    public static VarbitType[] field1182;

    @OriginalMember(owner = "qc", name = "a", descriptor = "(Lxb;I)V")
    public static void method387(Jagfile arg0, int arg1) {
        if (arg1 < 5 || arg1 > 5) {
            return;
        }
        Packet var2 = new Packet(arg0.method299("varbit.dat", null), field1179);
        field1181 = var2.method231();
        if (field1182 == null) {
            field1182 = new VarbitType[field1181];
        }
        for (int var3 = 0; var3 < field1181; var3++) {
            if (field1182[var3] == null) {
                field1182[var3] = new VarbitType();
            }
            field1182[var3].method388(var3, field1180, var2);
            if (field1182[var3].field1187) {
                VarpType.field1193[field1182[var3].field1184].field1205 = true;
            }
        }
        if (var2.field711.length != var2.field712) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "(IBLlb;)V")
    public void method388(int arg0, byte arg1, Packet arg2) {
        if (arg1 != 0) {
            return;
        }
        while (true) {
            int var4 = arg2.method229();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1184 = arg2.method231();
                this.field1185 = arg2.method229();
                this.field1186 = arg2.method229();
            } else if (var4 == 10) {
                this.field1183 = arg2.method236();
            } else if (var4 == 2) {
                this.field1187 = true;
            } else if (var4 == 3) {
                this.field1188 = arg2.method234();
            } else if (var4 == 4) {
                this.field1189 = arg2.method234();
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
