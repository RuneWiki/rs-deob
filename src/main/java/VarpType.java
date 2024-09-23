import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("rc")
public class VarpType {

    @OriginalMember(owner = "rc", name = "b", descriptor = "I")
    private int field1181 = -47594;

    @OriginalMember(owner = "rc", name = "j", descriptor = "Z")
    public boolean field1189 = false;

    @OriginalMember(owner = "rc", name = "k", descriptor = "Z")
    public boolean field1190 = true;

    @OriginalMember(owner = "rc", name = "m", descriptor = "Z")
    public boolean field1192 = false;

    @OriginalMember(owner = "rc", name = "p", descriptor = "Z")
    public boolean field1195 = false;

    @OriginalMember(owner = "rc", name = "q", descriptor = "I")
    public int field1196 = -1;

    @OriginalMember(owner = "rc", name = "a", descriptor = "I")
    private static int field1180 = 1000;

    @OriginalMember(owner = "rc", name = "c", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "rc", name = "e", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "rc", name = "h", descriptor = "I")
    public int field1187;

    @OriginalMember(owner = "rc", name = "i", descriptor = "I")
    public int field1188;

    @OriginalMember(owner = "rc", name = "l", descriptor = "I")
    public int field1191;

    @OriginalMember(owner = "rc", name = "n", descriptor = "I")
    public int field1193;

    @OriginalMember(owner = "rc", name = "o", descriptor = "I")
    public int field1194;

    @OriginalMember(owner = "rc", name = "g", descriptor = "Ljava/lang/String;")
    public String field1186;

    @OriginalMember(owner = "rc", name = "f", descriptor = "[I")
    public static int[] field1185;

    @OriginalMember(owner = "rc", name = "d", descriptor = "[Lrc;")
    public static VarpType[] field1183;

    @OriginalMember(owner = "rc", name = "a", descriptor = "(Lxb;I)V")
    public static void method389(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(field1180, arg0.method299("varp.dat", null));
        field1184 = 0;
        field1182 = var2.method231();
        if (field1183 == null) {
            field1183 = new VarpType[field1182];
        }
        if (field1185 == null) {
            field1185 = new int[field1182];
        }
        for (int var3 = 0; var3 < field1182; var3++) {
            if (field1183[var3] == null) {
                field1183[var3] = new VarpType();
            }
            field1183[var3].method390(var3, var2, 12249);
        }
        if (arg1 >= 0 && arg1 <= 0 && var2.field702.length != var2.field703) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "rc", name = "a", descriptor = "(ILlb;I)V")
    public void method390(int arg0, Packet arg1, int arg2) {
        if (arg2 != 12249) {
            this.field1181 = -290;
        }
        while (true) {
            int var4 = arg1.method229();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1187 = arg1.method229();
            } else if (var4 == 2) {
                this.field1188 = arg1.method229();
            } else if (var4 == 3) {
                this.field1189 = true;
                field1185[field1184++] = arg0;
            } else if (var4 == 4) {
                this.field1190 = false;
            } else if (var4 == 5) {
                this.field1191 = arg1.method231();
            } else if (var4 == 6) {
                this.field1192 = true;
            } else if (var4 == 7) {
                this.field1193 = arg1.method234();
            } else if (var4 == 8) {
                this.field1194 = 1;
                this.field1195 = true;
            } else if (var4 == 10) {
                this.field1186 = arg1.method236();
            } else if (var4 == 11) {
                this.field1195 = true;
            } else if (var4 == 12) {
                this.field1196 = arg1.method234();
            } else if (var4 == 13) {
                this.field1194 = 2;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
