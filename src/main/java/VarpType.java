import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("sc")
public class VarpType {

    @OriginalMember(owner = "sc", name = "k", descriptor = "Z")
    public boolean field1190 = false;

    @OriginalMember(owner = "sc", name = "l", descriptor = "Z")
    public boolean field1191 = true;

    @OriginalMember(owner = "sc", name = "n", descriptor = "Z")
    public boolean field1193 = false;

    @OriginalMember(owner = "sc", name = "q", descriptor = "Z")
    public boolean field1196 = false;

    @OriginalMember(owner = "sc", name = "r", descriptor = "I")
    public int field1197 = -1;

    @OriginalMember(owner = "sc", name = "a", descriptor = "I")
    private static int field1180 = 6771;

    @OriginalMember(owner = "sc", name = "c", descriptor = "I")
    private static int field1182 = -45991;

    @OriginalMember(owner = "sc", name = "d", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "sc", name = "f", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "sc", name = "i", descriptor = "I")
    public int field1188;

    @OriginalMember(owner = "sc", name = "j", descriptor = "I")
    public int field1189;

    @OriginalMember(owner = "sc", name = "m", descriptor = "I")
    public int field1192;

    @OriginalMember(owner = "sc", name = "o", descriptor = "I")
    public int field1194;

    @OriginalMember(owner = "sc", name = "p", descriptor = "I")
    public int field1195;

    @OriginalMember(owner = "sc", name = "h", descriptor = "Ljava/lang/String;")
    public String field1187;

    @OriginalMember(owner = "sc", name = "b", descriptor = "Z")
    private static boolean field1181;

    @OriginalMember(owner = "sc", name = "g", descriptor = "[I")
    public static int[] field1186;

    @OriginalMember(owner = "sc", name = "e", descriptor = "[Lsc;")
    public static VarpType[] field1184;

    @OriginalMember(owner = "sc", name = "a", descriptor = "(ILyb;)V")
    public static void method386(int arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method298("varp.dat", null), true);
        field1185 = 0;
        field1183 = var2.method230();
        if (field1180 != arg0) {
            field1182 = -12;
        }
        if (field1184 == null) {
            field1184 = new VarpType[field1183];
        }
        if (field1186 == null) {
            field1186 = new int[field1183];
        }
        for (int var3 = 0; var3 < field1183; var3++) {
            if (field1184[var3] == null) {
                field1184[var3] = new VarpType();
            }
            field1184[var3].method387(var2, var3, field1181);
        }
        if (var2.field713.length != var2.field714) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Lmb;IZ)V")
    public void method387(Packet arg0, int arg1, boolean arg2) {
        if (arg2) {
            return;
        }
        while (true) {
            int var4 = arg0.method228();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1188 = arg0.method228();
            } else if (var4 == 2) {
                this.field1189 = arg0.method228();
            } else if (var4 == 3) {
                this.field1190 = true;
                field1186[field1185++] = arg1;
            } else if (var4 == 4) {
                this.field1191 = false;
            } else if (var4 == 5) {
                this.field1192 = arg0.method230();
            } else if (var4 == 6) {
                this.field1193 = true;
            } else if (var4 == 7) {
                this.field1194 = arg0.method233();
            } else if (var4 == 8) {
                this.field1195 = 1;
                this.field1196 = true;
            } else if (var4 == 10) {
                this.field1187 = arg0.method235();
            } else if (var4 == 11) {
                this.field1196 = true;
            } else if (var4 == 12) {
                this.field1197 = arg0.method233();
            } else if (var4 == 13) {
                this.field1195 = 2;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
