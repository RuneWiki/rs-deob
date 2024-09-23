import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("rc")
public class VarpType {

    @OriginalMember(owner = "rc", name = "j", descriptor = "Z")
    public boolean field1184 = false;

    @OriginalMember(owner = "rc", name = "k", descriptor = "Z")
    public boolean field1185 = true;

    @OriginalMember(owner = "rc", name = "m", descriptor = "Z")
    public boolean field1187 = false;

    @OriginalMember(owner = "rc", name = "p", descriptor = "Z")
    public boolean field1190 = false;

    @OriginalMember(owner = "rc", name = "q", descriptor = "I")
    public int field1191 = -1;

    @OriginalMember(owner = "rc", name = "a", descriptor = "I")
    private static int field1175 = -643;

    @OriginalMember(owner = "rc", name = "b", descriptor = "B")
    private static byte field1176 = 6;

    @OriginalMember(owner = "rc", name = "c", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "rc", name = "e", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "rc", name = "h", descriptor = "I")
    public int field1182;

    @OriginalMember(owner = "rc", name = "i", descriptor = "I")
    public int field1183;

    @OriginalMember(owner = "rc", name = "l", descriptor = "I")
    public int field1186;

    @OriginalMember(owner = "rc", name = "n", descriptor = "I")
    public int field1188;

    @OriginalMember(owner = "rc", name = "o", descriptor = "I")
    public int field1189;

    @OriginalMember(owner = "rc", name = "g", descriptor = "Ljava/lang/String;")
    public String field1181;

    @OriginalMember(owner = "rc", name = "f", descriptor = "[I")
    public static int[] field1180;

    @OriginalMember(owner = "rc", name = "d", descriptor = "[Lrc;")
    public static VarpType[] field1178;

    @OriginalMember(owner = "rc", name = "a", descriptor = "(ZLxb;)V")
    public static void method382(boolean arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method294("varp.dat", null), (byte) 1);
        field1179 = 0;
        field1177 = var2.method226();
        if (field1178 == null) {
            field1178 = new VarpType[field1177];
        }
        if (field1180 == null) {
            field1180 = new int[field1177];
        }
        for (int var3 = 0; var3 < field1177; var3++) {
            if (field1178[var3] == null) {
                field1178[var3] = new VarpType();
            }
            field1178[var3].method383(var2, field1176, var3);
        }
        if (arg0) {
            field1175 = 293;
        }
        if (var2.field708.length != var2.field709) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "rc", name = "a", descriptor = "(Llb;BI)V")
    public void method383(Packet arg0, byte arg1, int arg2) {
        if (arg1 == 6) {
            boolean var4 = false;
        } else {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        while (true) {
            int var6 = arg0.method224();
            if (var6 == 0) {
                return;
            }
            if (var6 == 1) {
                this.field1182 = arg0.method224();
            } else if (var6 == 2) {
                this.field1183 = arg0.method224();
            } else if (var6 == 3) {
                this.field1184 = true;
                field1180[field1179++] = arg2;
            } else if (var6 == 4) {
                this.field1185 = false;
            } else if (var6 == 5) {
                this.field1186 = arg0.method226();
            } else if (var6 == 6) {
                this.field1187 = true;
            } else if (var6 == 7) {
                this.field1188 = arg0.method229();
            } else if (var6 == 8) {
                this.field1189 = 1;
                this.field1190 = true;
            } else if (var6 == 10) {
                this.field1181 = arg0.method231();
            } else if (var6 == 11) {
                this.field1190 = true;
            } else if (var6 == 12) {
                this.field1191 = arg0.method229();
            } else if (var6 == 13) {
                this.field1189 = 2;
            } else {
                System.out.println("Error unrecognised config code: " + var6);
            }
        }
    }
}
