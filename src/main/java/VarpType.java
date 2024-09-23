import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("rc")
public class VarpType {

    @OriginalMember(owner = "rc", name = "i", descriptor = "Z")
    public boolean field1179 = false;

    @OriginalMember(owner = "rc", name = "j", descriptor = "Z")
    public boolean field1180 = true;

    @OriginalMember(owner = "rc", name = "l", descriptor = "Z")
    public boolean field1182 = false;

    @OriginalMember(owner = "rc", name = "o", descriptor = "Z")
    public boolean field1185 = false;

    @OriginalMember(owner = "rc", name = "p", descriptor = "I")
    public int field1186 = -1;

    @OriginalMember(owner = "rc", name = "a", descriptor = "I")
    private static int field1171 = -474;

    @OriginalMember(owner = "rc", name = "b", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "rc", name = "d", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "rc", name = "g", descriptor = "I")
    public int field1177;

    @OriginalMember(owner = "rc", name = "h", descriptor = "I")
    public int field1178;

    @OriginalMember(owner = "rc", name = "k", descriptor = "I")
    public int field1181;

    @OriginalMember(owner = "rc", name = "m", descriptor = "I")
    public int field1183;

    @OriginalMember(owner = "rc", name = "n", descriptor = "I")
    public int field1184;

    @OriginalMember(owner = "rc", name = "f", descriptor = "Ljava/lang/String;")
    public String field1176;

    @OriginalMember(owner = "rc", name = "e", descriptor = "[I")
    public static int[] field1175;

    @OriginalMember(owner = "rc", name = "c", descriptor = "[Lrc;")
    public static VarpType[] field1173;

    @OriginalMember(owner = "rc", name = "a", descriptor = "(Lxb;I)V")
    public static void method383(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(arg0.method295("varp.dat", null), 185);
        field1174 = 0;
        field1172 = var2.method227();
        if (field1173 == null) {
            field1173 = new VarpType[field1172];
        }
        if (field1175 == null) {
            field1175 = new int[field1172];
        }
        for (int var3 = 0; var3 < field1172; var3++) {
            if (field1173[var3] == null) {
                field1173[var3] = new VarpType();
            }
            field1173[var3].method384(var3, var2, 6454);
        }
        while (arg1 >= 0) {
            field1171 = 447;
        }
        if (var2.field707.length != var2.field708) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "rc", name = "a", descriptor = "(ILlb;I)V")
    public void method384(int arg0, Packet arg1, int arg2) {
        if (arg2 != 6454) {
            return;
        }
        while (true) {
            int var4 = arg1.method225();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1177 = arg1.method225();
            } else if (var4 == 2) {
                this.field1178 = arg1.method225();
            } else if (var4 == 3) {
                this.field1179 = true;
                field1175[field1174++] = arg0;
            } else if (var4 == 4) {
                this.field1180 = false;
            } else if (var4 == 5) {
                this.field1181 = arg1.method227();
            } else if (var4 == 6) {
                this.field1182 = true;
            } else if (var4 == 7) {
                this.field1183 = arg1.method230();
            } else if (var4 == 8) {
                this.field1184 = 1;
                this.field1185 = true;
            } else if (var4 == 10) {
                this.field1176 = arg1.method232();
            } else if (var4 == 11) {
                this.field1185 = true;
            } else if (var4 == 12) {
                this.field1186 = arg1.method230();
            } else if (var4 == 13) {
                this.field1184 = 2;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
