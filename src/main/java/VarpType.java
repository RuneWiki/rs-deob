import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("rc")
public class VarpType {

    @OriginalMember(owner = "rc", name = "h", descriptor = "Z")
    public boolean field1180 = false;

    @OriginalMember(owner = "rc", name = "i", descriptor = "Z")
    public boolean field1181 = true;

    @OriginalMember(owner = "rc", name = "k", descriptor = "Z")
    public boolean field1183 = false;

    @OriginalMember(owner = "rc", name = "n", descriptor = "Z")
    public boolean field1186 = false;

    @OriginalMember(owner = "rc", name = "o", descriptor = "I")
    public int field1187 = -1;

    @OriginalMember(owner = "rc", name = "a", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "rc", name = "c", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "rc", name = "f", descriptor = "I")
    public int field1178;

    @OriginalMember(owner = "rc", name = "g", descriptor = "I")
    public int field1179;

    @OriginalMember(owner = "rc", name = "j", descriptor = "I")
    public int field1182;

    @OriginalMember(owner = "rc", name = "l", descriptor = "I")
    public int field1184;

    @OriginalMember(owner = "rc", name = "m", descriptor = "I")
    public int field1185;

    @OriginalMember(owner = "rc", name = "e", descriptor = "Ljava/lang/String;")
    public String field1177;

    @OriginalMember(owner = "rc", name = "d", descriptor = "[I")
    public static int[] field1176;

    @OriginalMember(owner = "rc", name = "b", descriptor = "[Lrc;")
    public static VarpType[] field1174;

    @OriginalMember(owner = "rc", name = "a", descriptor = "(ILxb;)V")
    public static void method382(int arg0, Jagfile arg1) {
        Packet var2 = new Packet((byte) 3, arg1.method294("varp.dat", null));
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        field1175 = 0;
        field1173 = var2.method226();
        if (field1174 == null) {
            field1174 = new VarpType[field1173];
        }
        if (field1176 == null) {
            field1176 = new int[field1173];
        }
        for (int var4 = 0; var4 < field1173; var4++) {
            if (field1174[var4] == null) {
                field1174[var4] = new VarpType();
            }
            field1174[var4].method383(0, var4, var2);
        }
        if (var2.field701.length != var2.field702) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "rc", name = "a", descriptor = "(IILlb;)V")
    public void method383(int arg0, int arg1, Packet arg2) {
        if (arg0 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            int var5 = arg2.method224();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field1178 = arg2.method224();
            } else if (var5 == 2) {
                this.field1179 = arg2.method224();
            } else if (var5 == 3) {
                this.field1180 = true;
                field1176[field1175++] = arg1;
            } else if (var5 == 4) {
                this.field1181 = false;
            } else if (var5 == 5) {
                this.field1182 = arg2.method226();
            } else if (var5 == 6) {
                this.field1183 = true;
            } else if (var5 == 7) {
                this.field1184 = arg2.method229();
            } else if (var5 == 8) {
                this.field1185 = 1;
                this.field1186 = true;
            } else if (var5 == 10) {
                this.field1177 = arg2.method231();
            } else if (var5 == 11) {
                this.field1186 = true;
            } else if (var5 == 12) {
                this.field1187 = arg2.method229();
            } else if (var5 == 13) {
                this.field1185 = 2;
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}
