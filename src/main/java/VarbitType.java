import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("qc")
public class VarbitType {

    @OriginalMember(owner = "qc", name = "h", descriptor = "Z")
    public boolean field1193 = false;

    @OriginalMember(owner = "qc", name = "i", descriptor = "I")
    public int field1194 = -1;

    @OriginalMember(owner = "qc", name = "a", descriptor = "I")
    private static int field1186 = 810;

    @OriginalMember(owner = "qc", name = "b", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "qc", name = "e", descriptor = "I")
    public int field1190;

    @OriginalMember(owner = "qc", name = "f", descriptor = "I")
    public int field1191;

    @OriginalMember(owner = "qc", name = "g", descriptor = "I")
    public int field1192;

    @OriginalMember(owner = "qc", name = "j", descriptor = "I")
    public int field1195;

    @OriginalMember(owner = "qc", name = "d", descriptor = "Ljava/lang/String;")
    public String field1189;

    @OriginalMember(owner = "qc", name = "c", descriptor = "[Lqc;")
    public static VarbitType[] field1188;

    @OriginalMember(owner = "qc", name = "a", descriptor = "(ZLxb;)V")
    public static void method383(boolean arg0, Jagfile arg1) {
        if (!arg0) {
            return;
        }
        Packet var2 = new Packet(arg1.method297("varbit.dat", null), 15787);
        field1187 = var2.method229();
        if (field1188 == null) {
            field1188 = new VarbitType[field1187];
        }
        for (int var3 = 0; var3 < field1187; var3++) {
            if (field1188[var3] == null) {
                field1188[var3] = new VarbitType();
            }
            field1188[var3].method384(field1186, var3, var2);
            if (field1188[var3].field1193) {
                VarpType.field1200[field1188[var3].field1190].field1212 = true;
            }
        }
        if (var2.field709.length != var2.field710) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "(IILlb;)V")
    public void method384(int arg0, int arg1, Packet arg2) {
        int var4 = 55 / arg0;
        while (true) {
            int var5 = arg2.method227();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field1190 = arg2.method229();
                this.field1191 = arg2.method227();
                this.field1192 = arg2.method227();
            } else if (var5 == 10) {
                this.field1189 = arg2.method234();
            } else if (var5 == 2) {
                this.field1193 = true;
            } else if (var5 == 3) {
                this.field1194 = arg2.method232();
            } else if (var5 == 4) {
                this.field1195 = arg2.method232();
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}
