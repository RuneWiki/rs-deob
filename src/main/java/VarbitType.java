import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("qc")
public class VarbitType {

    @OriginalMember(owner = "qc", name = "a", descriptor = "I")
    private int field1179 = -30133;

    @OriginalMember(owner = "qc", name = "i", descriptor = "Z")
    public boolean field1187 = false;

    @OriginalMember(owner = "qc", name = "j", descriptor = "I")
    public int field1188 = -1;

    @OriginalMember(owner = "qc", name = "b", descriptor = "Z")
    private static boolean field1180 = true;

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

    @OriginalMember(owner = "qc", name = "d", descriptor = "[Lqc;")
    public static VarbitType[] field1182;

    @OriginalMember(owner = "qc", name = "a", descriptor = "(Lxb;Z)V")
    public static void method387(Jagfile arg0, boolean arg1) {
        Packet var2 = new Packet(-49365, arg0.method299("varbit.dat", null));
        if (arg1) {
            field1180 = !field1180;
        }
        field1181 = var2.method231();
        if (field1182 == null) {
            field1182 = new VarbitType[field1181];
        }
        for (int var3 = 0; var3 < field1181; var3++) {
            if (field1182[var3] == null) {
                field1182[var3] = new VarbitType();
            }
            field1182[var3].method388(true, var2, var3);
            if (field1182[var3].field1187) {
                VarpType.field1192[field1182[var3].field1184].field1204 = true;
            }
        }
        if (var2.field721.length != var2.field722) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "(ZLlb;I)V")
    public void method388(boolean arg0, Packet arg1, int arg2) {
        if (!arg0) {
            this.field1179 = 139;
        }
        while (true) {
            int var4 = arg1.method229();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1184 = arg1.method231();
                this.field1185 = arg1.method229();
                this.field1186 = arg1.method229();
            } else if (var4 == 10) {
                this.field1183 = arg1.method236();
            } else if (var4 == 2) {
                this.field1187 = true;
            } else if (var4 == 3) {
                this.field1188 = arg1.method234();
            } else if (var4 == 4) {
                this.field1189 = arg1.method234();
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
