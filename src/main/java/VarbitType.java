import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("qc")
public class VarbitType {

    @OriginalMember(owner = "qc", name = "a", descriptor = "I")
    private int field1178 = 45800;

    @OriginalMember(owner = "qc", name = "h", descriptor = "Z")
    public boolean field1185 = false;

    @OriginalMember(owner = "qc", name = "i", descriptor = "I")
    public int field1186 = -1;

    @OriginalMember(owner = "qc", name = "b", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "qc", name = "e", descriptor = "I")
    public int field1182;

    @OriginalMember(owner = "qc", name = "f", descriptor = "I")
    public int field1183;

    @OriginalMember(owner = "qc", name = "g", descriptor = "I")
    public int field1184;

    @OriginalMember(owner = "qc", name = "j", descriptor = "I")
    public int field1187;

    @OriginalMember(owner = "qc", name = "d", descriptor = "Ljava/lang/String;")
    public String field1181;

    @OriginalMember(owner = "qc", name = "c", descriptor = "[Lqc;")
    public static VarbitType[] field1180;

    @OriginalMember(owner = "qc", name = "a", descriptor = "(ZLxb;)V")
    public static void method387(boolean arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method299("varbit.dat", null), (byte) -93);
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        field1179 = var2.method231();
        if (field1180 == null) {
            field1180 = new VarbitType[field1179];
        }
        for (int var4 = 0; var4 < field1179; var4++) {
            if (field1180[var4] == null) {
                field1180[var4] = new VarbitType();
            }
            field1180[var4].method388(var4, var2, -45931);
            if (field1180[var4].field1185) {
                VarpType.field1190[field1180[var4].field1182].field1202 = true;
            }
        }
        if (var2.field712.length != var2.field713) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "(ILlb;I)V")
    public void method388(int arg0, Packet arg1, int arg2) {
        if (arg2 != -45931) {
            this.field1178 = 324;
        }
        while (true) {
            int var4 = arg1.method229();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1182 = arg1.method231();
                this.field1183 = arg1.method229();
                this.field1184 = arg1.method229();
            } else if (var4 == 10) {
                this.field1181 = arg1.method236();
            } else if (var4 == 2) {
                this.field1185 = true;
            } else if (var4 == 3) {
                this.field1186 = arg1.method234();
            } else if (var4 == 4) {
                this.field1187 = arg1.method234();
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
