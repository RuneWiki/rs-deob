import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("rc")
public class VarpType {

    @OriginalMember(owner = "rc", name = "i", descriptor = "Z")
    public boolean field1160 = false;

    @OriginalMember(owner = "rc", name = "j", descriptor = "Z")
    public boolean field1161 = true;

    @OriginalMember(owner = "rc", name = "l", descriptor = "Z")
    public boolean field1163 = false;

    @OriginalMember(owner = "rc", name = "n", descriptor = "Z")
    public boolean field1165 = false;

    @OriginalMember(owner = "rc", name = "o", descriptor = "Z")
    public boolean field1166 = false;

    @OriginalMember(owner = "rc", name = "b", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "rc", name = "d", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "rc", name = "g", descriptor = "I")
    public int field1158;

    @OriginalMember(owner = "rc", name = "h", descriptor = "I")
    public int field1159;

    @OriginalMember(owner = "rc", name = "k", descriptor = "I")
    public int field1162;

    @OriginalMember(owner = "rc", name = "m", descriptor = "I")
    public int field1164;

    @OriginalMember(owner = "rc", name = "f", descriptor = "Ljava/lang/String;")
    public String field1157;

    @OriginalMember(owner = "rc", name = "a", descriptor = "Z")
    private static boolean field1152;

    @OriginalMember(owner = "rc", name = "e", descriptor = "[I")
    public static int[] field1156;

    @OriginalMember(owner = "rc", name = "c", descriptor = "[Lrc;")
    public static VarpType[] field1154;

    @OriginalMember(owner = "rc", name = "a", descriptor = "(ZLyb;)V")
    public static void method391(boolean arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method309("varp.dat", null), (byte) 3);
        field1155 = 0;
        field1153 = var2.method241();
        if (field1154 == null) {
            field1154 = new VarpType[field1153];
        }
        if (field1156 == null) {
            field1156 = new int[field1153];
        }
        for (int var3 = 0; var3 < field1153; var3++) {
            if (field1154[var3] == null) {
                field1154[var3] = new VarpType();
            }
            field1154[var3].method392(var3, 890, var2);
        }
        if (!arg0) {
            field1152 = !field1152;
        }
        if (var2.field710.length != var2.field711) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "rc", name = "a", descriptor = "(IILmb;)V")
    public void method392(int arg0, int arg1, Packet arg2) {
        if (arg1 <= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            int var5 = arg2.method239();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field1158 = arg2.method239();
            } else if (var5 == 2) {
                this.field1159 = arg2.method239();
            } else if (var5 == 3) {
                this.field1160 = true;
                field1156[field1155++] = arg0;
            } else if (var5 == 4) {
                this.field1161 = false;
            } else if (var5 == 5) {
                this.field1162 = arg2.method241();
            } else if (var5 == 6) {
                this.field1163 = true;
            } else if (var5 == 7) {
                this.field1164 = arg2.method244();
            } else if (var5 == 8) {
                this.field1165 = true;
                this.field1166 = true;
            } else if (var5 == 10) {
                this.field1157 = arg2.method246();
            } else if (var5 == 11) {
                this.field1166 = true;
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}
