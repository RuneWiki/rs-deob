import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pc")
public class VarpType {

    @OriginalMember(owner = "pc", name = "a", descriptor = "I")
    private int field1152 = 439;

    @OriginalMember(owner = "pc", name = "i", descriptor = "Z")
    public boolean field1160 = false;

    @OriginalMember(owner = "pc", name = "j", descriptor = "Z")
    public boolean field1161 = true;

    @OriginalMember(owner = "pc", name = "l", descriptor = "Z")
    public boolean field1163 = false;

    @OriginalMember(owner = "pc", name = "n", descriptor = "Z")
    public boolean field1165 = false;

    @OriginalMember(owner = "pc", name = "o", descriptor = "Z")
    public boolean field1166 = false;

    @OriginalMember(owner = "pc", name = "b", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "pc", name = "d", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "pc", name = "g", descriptor = "I")
    public int field1158;

    @OriginalMember(owner = "pc", name = "h", descriptor = "I")
    public int field1159;

    @OriginalMember(owner = "pc", name = "k", descriptor = "I")
    public int field1162;

    @OriginalMember(owner = "pc", name = "m", descriptor = "I")
    public int field1164;

    @OriginalMember(owner = "pc", name = "f", descriptor = "Ljava/lang/String;")
    public String field1157;

    @OriginalMember(owner = "pc", name = "e", descriptor = "[I")
    public static int[] field1156;

    @OriginalMember(owner = "pc", name = "c", descriptor = "[Lpc;")
    public static VarpType[] field1154;

    @OriginalMember(owner = "pc", name = "a", descriptor = "(Lyb;B)V")
    public static void method387(Jagfile arg0, byte arg1) {
        if (arg1 != 127) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        Packet var3 = new Packet((byte) -109, arg0.method308("varp.dat", null));
        field1155 = 0;
        field1153 = var3.method240();
        if (field1154 == null) {
            field1154 = new VarpType[field1153];
        }
        if (field1156 == null) {
            field1156 = new int[field1153];
        }
        for (int var4 = 0; var4 < field1153; var4++) {
            if (field1154[var4] == null) {
                field1154[var4] = new VarpType();
            }
            field1154[var4].method388(var3, var4, 439);
        }
        if (var3.field718.length != var3.field719) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(Lmb;II)V")
    public void method388(Packet arg0, int arg1, int arg2) {
        if (arg2 <= 0) {
            return;
        }
        while (true) {
            int var4 = arg0.method238();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1158 = arg0.method238();
            } else if (var4 == 2) {
                this.field1159 = arg0.method238();
            } else if (var4 == 3) {
                this.field1160 = true;
                field1156[field1155++] = arg1;
            } else if (var4 == 4) {
                this.field1161 = false;
            } else if (var4 == 5) {
                this.field1162 = arg0.method240();
            } else if (var4 == 6) {
                this.field1163 = true;
            } else if (var4 == 7) {
                this.field1164 = arg0.method243();
            } else if (var4 == 8) {
                this.field1165 = true;
                this.field1166 = true;
            } else if (var4 == 10) {
                this.field1157 = arg0.method245();
            } else if (var4 == 11) {
                this.field1166 = true;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
