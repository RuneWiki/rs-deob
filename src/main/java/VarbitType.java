import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("qc")
public class VarbitType {

    @OriginalMember(owner = "qc", name = "h", descriptor = "Z")
    public boolean field1168 = false;

    @OriginalMember(owner = "qc", name = "i", descriptor = "I")
    public int field1169 = -1;

    @OriginalMember(owner = "qc", name = "a", descriptor = "I")
    private static int field1161 = -474;

    @OriginalMember(owner = "qc", name = "b", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "qc", name = "e", descriptor = "I")
    public int field1165;

    @OriginalMember(owner = "qc", name = "f", descriptor = "I")
    public int field1166;

    @OriginalMember(owner = "qc", name = "g", descriptor = "I")
    public int field1167;

    @OriginalMember(owner = "qc", name = "j", descriptor = "I")
    public int field1170;

    @OriginalMember(owner = "qc", name = "d", descriptor = "Ljava/lang/String;")
    public String field1164;

    @OriginalMember(owner = "qc", name = "c", descriptor = "[Lqc;")
    public static VarbitType[] field1163;

    @OriginalMember(owner = "qc", name = "a", descriptor = "(Lxb;I)V")
    public static void method381(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(arg0.method295("varbit.dat", null), 185);
        if (arg1 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        field1162 = var2.method227();
        if (field1163 == null) {
            field1163 = new VarbitType[field1162];
        }
        for (int var4 = 0; var4 < field1162; var4++) {
            if (field1163[var4] == null) {
                field1163[var4] = new VarbitType();
            }
            field1163[var4].method382(var4, var2, 6454);
            if (field1163[var4].field1168) {
                VarpType.field1173[field1163[var4].field1165].field1185 = true;
            }
        }
        if (var2.field707.length != var2.field708) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "(ILlb;I)V")
    public void method382(int arg0, Packet arg1, int arg2) {
        if (arg2 != 6454) {
            field1161 = 17;
        }
        while (true) {
            int var4 = arg1.method225();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1165 = arg1.method227();
                this.field1166 = arg1.method225();
                this.field1167 = arg1.method225();
            } else if (var4 == 10) {
                this.field1164 = arg1.method232();
            } else if (var4 == 2) {
                this.field1168 = true;
            } else if (var4 == 3) {
                this.field1169 = arg1.method230();
            } else if (var4 == 4) {
                this.field1170 = arg1.method230();
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
