import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("qc")
public class VarbitType {

    @OriginalMember(owner = "qc", name = "a", descriptor = "Z")
    private boolean field1190 = false;

    @OriginalMember(owner = "qc", name = "h", descriptor = "Z")
    public boolean field1197 = false;

    @OriginalMember(owner = "qc", name = "i", descriptor = "I")
    public int field1198 = -1;

    @OriginalMember(owner = "qc", name = "b", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "qc", name = "e", descriptor = "I")
    public int field1194;

    @OriginalMember(owner = "qc", name = "f", descriptor = "I")
    public int field1195;

    @OriginalMember(owner = "qc", name = "g", descriptor = "I")
    public int field1196;

    @OriginalMember(owner = "qc", name = "j", descriptor = "I")
    public int field1199;

    @OriginalMember(owner = "qc", name = "d", descriptor = "Ljava/lang/String;")
    public String field1193;

    @OriginalMember(owner = "qc", name = "c", descriptor = "[Lqc;")
    public static VarbitType[] field1192;

    @OriginalMember(owner = "qc", name = "a", descriptor = "(ILxb;)V")
    public static void method387(int arg0, Jagfile arg1) {
        Packet var2 = new Packet(false, arg1.method299("varbit.dat", null));
        field1191 = var2.method231();
        if (field1192 == null) {
            field1192 = new VarbitType[field1191];
        }
        for (int var3 = 0; var3 < field1191; var3++) {
            if (field1192[var3] == null) {
                field1192[var3] = new VarbitType();
            }
            field1192[var3].method388(var2, var3, 2);
            if (field1192[var3].field1197) {
                VarpType.field1201[field1192[var3].field1194].field1213 = true;
            }
        }
        if (arg0 == 35102 && var2.field715.length != var2.field716) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "(Llb;II)V")
    public void method388(Packet arg0, int arg1, int arg2) {
        if (arg2 != 2) {
            this.field1190 = !this.field1190;
        }
        while (true) {
            int var4 = arg0.method229();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1194 = arg0.method231();
                this.field1195 = arg0.method229();
                this.field1196 = arg0.method229();
            } else if (var4 == 10) {
                this.field1193 = arg0.method236();
            } else if (var4 == 2) {
                this.field1197 = true;
            } else if (var4 == 3) {
                this.field1198 = arg0.method234();
            } else if (var4 == 4) {
                this.field1199 = arg0.method234();
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
