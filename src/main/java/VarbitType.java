import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("qc")
public class VarbitType {

    @OriginalMember(owner = "qc", name = "g", descriptor = "Z")
    public boolean field1191 = false;

    @OriginalMember(owner = "qc", name = "h", descriptor = "I")
    public int field1192 = -1;

    @OriginalMember(owner = "qc", name = "a", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "qc", name = "d", descriptor = "I")
    public int field1188;

    @OriginalMember(owner = "qc", name = "e", descriptor = "I")
    public int field1189;

    @OriginalMember(owner = "qc", name = "f", descriptor = "I")
    public int field1190;

    @OriginalMember(owner = "qc", name = "i", descriptor = "I")
    public int field1193;

    @OriginalMember(owner = "qc", name = "c", descriptor = "Ljava/lang/String;")
    public String field1187;

    @OriginalMember(owner = "qc", name = "b", descriptor = "[Lqc;")
    public static VarbitType[] field1186;

    @OriginalMember(owner = "qc", name = "a", descriptor = "(ILxb;)V")
    public static void method387(int arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method299("varbit.dat", null), -26728);
        field1185 = var2.method231();
        if (field1186 == null) {
            field1186 = new VarbitType[field1185];
        }
        for (int var3 = 0; var3 < field1185; var3++) {
            if (field1186[var3] == null) {
                field1186[var3] = new VarbitType();
            }
            field1186[var3].method388(var3, 39196, var2);
            if (field1186[var3].field1191) {
                VarpType.field1195[field1186[var3].field1188].field1207 = true;
            }
        }
        if (arg0 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (var2.field716.length != var2.field717) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "(IILlb;)V")
    public void method388(int arg0, int arg1, Packet arg2) {
        if (arg1 != 39196) {
            return;
        }
        while (true) {
            int var4 = arg2.method229();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1188 = arg2.method231();
                this.field1189 = arg2.method229();
                this.field1190 = arg2.method229();
            } else if (var4 == 10) {
                this.field1187 = arg2.method236();
            } else if (var4 == 2) {
                this.field1191 = true;
            } else if (var4 == 3) {
                this.field1192 = arg2.method234();
            } else if (var4 == 4) {
                this.field1193 = arg2.method234();
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
