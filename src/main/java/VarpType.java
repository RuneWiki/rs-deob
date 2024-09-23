import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pc")
public class VarpType {

    @OriginalMember(owner = "pc", name = "h", descriptor = "Z")
    public boolean field1163 = false;

    @OriginalMember(owner = "pc", name = "i", descriptor = "Z")
    public boolean field1164 = true;

    @OriginalMember(owner = "pc", name = "k", descriptor = "Z")
    public boolean field1166 = false;

    @OriginalMember(owner = "pc", name = "m", descriptor = "Z")
    public boolean field1168 = false;

    @OriginalMember(owner = "pc", name = "n", descriptor = "Z")
    public boolean field1169 = false;

    @OriginalMember(owner = "pc", name = "a", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "pc", name = "c", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "pc", name = "f", descriptor = "I")
    public int field1161;

    @OriginalMember(owner = "pc", name = "g", descriptor = "I")
    public int field1162;

    @OriginalMember(owner = "pc", name = "j", descriptor = "I")
    public int field1165;

    @OriginalMember(owner = "pc", name = "l", descriptor = "I")
    public int field1167;

    @OriginalMember(owner = "pc", name = "e", descriptor = "Ljava/lang/String;")
    public String field1160;

    @OriginalMember(owner = "pc", name = "d", descriptor = "[I")
    public static int[] field1159;

    @OriginalMember(owner = "pc", name = "b", descriptor = "[Lpc;")
    public static VarpType[] field1157;

    @OriginalMember(owner = "pc", name = "a", descriptor = "(ILyb;)V")
    public static void method387(int arg0, Jagfile arg1) {
        if (arg0 < 3 || arg0 > 3) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        Packet var3 = new Packet(arg1.method308("varp.dat", null), false);
        field1158 = 0;
        field1156 = var3.method240();
        if (field1157 == null) {
            field1157 = new VarpType[field1156];
        }
        if (field1159 == null) {
            field1159 = new int[field1156];
        }
        for (int var4 = 0; var4 < field1156; var4++) {
            if (field1157[var4] == null) {
                field1157[var4] = new VarpType();
            }
            field1157[var4].method388((byte) 0, var3, var4);
        }
        if (var3.field712.length != var3.field713) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(BLmb;I)V")
    public void method388(byte arg0, Packet arg1, int arg2) {
        if (arg0 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            int var5 = arg1.method238();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field1161 = arg1.method238();
            } else if (var5 == 2) {
                this.field1162 = arg1.method238();
            } else if (var5 == 3) {
                this.field1163 = true;
                field1159[field1158++] = arg2;
            } else if (var5 == 4) {
                this.field1164 = false;
            } else if (var5 == 5) {
                this.field1165 = arg1.method240();
            } else if (var5 == 6) {
                this.field1166 = true;
            } else if (var5 == 7) {
                this.field1167 = arg1.method243();
            } else if (var5 == 8) {
                this.field1168 = true;
                this.field1169 = true;
            } else if (var5 == 10) {
                this.field1160 = arg1.method245();
            } else if (var5 == 11) {
                this.field1169 = true;
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}
