import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("rc")
public class VarpType {

    @OriginalMember(owner = "rc", name = "h", descriptor = "Z")
    public boolean field1187 = false;

    @OriginalMember(owner = "rc", name = "i", descriptor = "Z")
    public boolean field1188 = true;

    @OriginalMember(owner = "rc", name = "k", descriptor = "Z")
    public boolean field1190 = false;

    @OriginalMember(owner = "rc", name = "n", descriptor = "Z")
    public boolean field1193 = false;

    @OriginalMember(owner = "rc", name = "o", descriptor = "I")
    public int field1194 = -1;

    @OriginalMember(owner = "rc", name = "a", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "rc", name = "c", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "rc", name = "f", descriptor = "I")
    public int field1185;

    @OriginalMember(owner = "rc", name = "g", descriptor = "I")
    public int field1186;

    @OriginalMember(owner = "rc", name = "j", descriptor = "I")
    public int field1189;

    @OriginalMember(owner = "rc", name = "l", descriptor = "I")
    public int field1191;

    @OriginalMember(owner = "rc", name = "m", descriptor = "I")
    public int field1192;

    @OriginalMember(owner = "rc", name = "e", descriptor = "Ljava/lang/String;")
    public String field1184;

    @OriginalMember(owner = "rc", name = "d", descriptor = "[I")
    public static int[] field1183;

    @OriginalMember(owner = "rc", name = "b", descriptor = "[Lrc;")
    public static VarpType[] field1181;

    @OriginalMember(owner = "rc", name = "a", descriptor = "(Lxb;I)V")
    public static void method389(Jagfile arg0, int arg1) {
        if (arg1 >= 0) {
            return;
        }
        Packet var2 = new Packet(arg0.method299("varp.dat", null), 58);
        field1182 = 0;
        field1180 = var2.method231();
        if (field1181 == null) {
            field1181 = new VarpType[field1180];
        }
        if (field1183 == null) {
            field1183 = new int[field1180];
        }
        for (int var3 = 0; var3 < field1180; var3++) {
            if (field1181[var3] == null) {
                field1181[var3] = new VarpType();
            }
            field1181[var3].method390(true, var2, var3);
        }
        if (var2.field710.length != var2.field711) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "rc", name = "a", descriptor = "(ZLlb;I)V")
    public void method390(boolean arg0, Packet arg1, int arg2) {
        if (!arg0) {
            return;
        }
        while (true) {
            int var4 = arg1.method229();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1185 = arg1.method229();
            } else if (var4 == 2) {
                this.field1186 = arg1.method229();
            } else if (var4 == 3) {
                this.field1187 = true;
                field1183[field1182++] = arg2;
            } else if (var4 == 4) {
                this.field1188 = false;
            } else if (var4 == 5) {
                this.field1189 = arg1.method231();
            } else if (var4 == 6) {
                this.field1190 = true;
            } else if (var4 == 7) {
                this.field1191 = arg1.method234();
            } else if (var4 == 8) {
                this.field1192 = 1;
                this.field1193 = true;
            } else if (var4 == 10) {
                this.field1184 = arg1.method236();
            } else if (var4 == 11) {
                this.field1193 = true;
            } else if (var4 == 12) {
                this.field1194 = arg1.method234();
            } else if (var4 == 13) {
                this.field1192 = 2;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
