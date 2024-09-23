import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("rc")
public class VarbitType {

    @OriginalMember(owner = "rc", name = "a", descriptor = "I")
    private static int field1171 = -668;

    @OriginalMember(owner = "rc", name = "b", descriptor = "I")
    private static int field1172 = 6771;

    @OriginalMember(owner = "rc", name = "d", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "rc", name = "g", descriptor = "I")
    public int field1177;

    @OriginalMember(owner = "rc", name = "h", descriptor = "I")
    public int field1178;

    @OriginalMember(owner = "rc", name = "i", descriptor = "I")
    public int field1179;

    @OriginalMember(owner = "rc", name = "f", descriptor = "Ljava/lang/String;")
    public String field1176;

    @OriginalMember(owner = "rc", name = "c", descriptor = "Z")
    private static boolean field1173;

    @OriginalMember(owner = "rc", name = "e", descriptor = "[Lrc;")
    public static VarbitType[] field1175;

    @OriginalMember(owner = "rc", name = "a", descriptor = "(ILyb;)V")
    public static void method384(int arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method298("varbit.dat", null), true);
        if (field1172 != arg0) {
            field1171 = -340;
        }
        field1174 = var2.method230();
        if (field1175 == null) {
            field1175 = new VarbitType[field1174];
        }
        for (int var3 = 0; var3 < field1174; var3++) {
            if (field1175[var3] == null) {
                field1175[var3] = new VarbitType();
            }
            field1175[var3].method385(var2, var3, field1173);
        }
        if (var2.field713.length != var2.field714) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "rc", name = "a", descriptor = "(Lmb;IZ)V")
    public void method385(Packet arg0, int arg1, boolean arg2) {
        if (arg2) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            int var5 = arg0.method228();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field1177 = arg0.method230();
                this.field1178 = arg0.method228();
                this.field1179 = arg0.method228();
            } else if (var5 == 10) {
                this.field1176 = arg0.method235();
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}
