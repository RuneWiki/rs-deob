import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("rc")
public class VarpType {

    @OriginalMember(owner = "rc", name = "i", descriptor = "Z")
    public boolean field1157 = false;

    @OriginalMember(owner = "rc", name = "j", descriptor = "Z")
    public boolean field1158 = true;

    @OriginalMember(owner = "rc", name = "l", descriptor = "Z")
    public boolean field1160 = false;

    @OriginalMember(owner = "rc", name = "n", descriptor = "Z")
    public boolean field1162 = false;

    @OriginalMember(owner = "rc", name = "o", descriptor = "Z")
    public boolean field1163 = false;

    @OriginalMember(owner = "rc", name = "a", descriptor = "I")
    private static int field1149;

    @OriginalMember(owner = "rc", name = "b", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "rc", name = "d", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "rc", name = "g", descriptor = "I")
    public int field1155;

    @OriginalMember(owner = "rc", name = "h", descriptor = "I")
    public int field1156;

    @OriginalMember(owner = "rc", name = "k", descriptor = "I")
    public int field1159;

    @OriginalMember(owner = "rc", name = "m", descriptor = "I")
    public int field1161;

    @OriginalMember(owner = "rc", name = "f", descriptor = "Ljava/lang/String;")
    public String field1154;

    @OriginalMember(owner = "rc", name = "e", descriptor = "[I")
    public static int[] field1153;

    @OriginalMember(owner = "rc", name = "c", descriptor = "[Lrc;")
    public static VarpType[] field1151;

    @OriginalMember(owner = "rc", name = "a", descriptor = "(Lyb;Z)V")
    public static void method391(Jagfile arg0, boolean arg1) {
        Packet var2 = new Packet(arg0.method309("varp.dat", null), 337);
        if (!arg1) {
            field1149 = 400;
        }
        field1152 = 0;
        field1150 = var2.method241();
        if (field1151 == null) {
            field1151 = new VarpType[field1150];
        }
        if (field1153 == null) {
            field1153 = new int[field1150];
        }
        for (int var3 = 0; var3 < field1150; var3++) {
            if (field1151[var3] == null) {
                field1151[var3] = new VarpType();
            }
            field1151[var3].method392(-448, var3, var2);
        }
        if (var2.field709.length != var2.field710) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "rc", name = "a", descriptor = "(IILmb;)V")
    public void method392(int arg0, int arg1, Packet arg2) {
        while (arg0 >= 0) {
            field1149 = -3;
        }
        while (true) {
            int var4 = arg2.method239();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1155 = arg2.method239();
            } else if (var4 == 2) {
                this.field1156 = arg2.method239();
            } else if (var4 == 3) {
                this.field1157 = true;
                field1153[field1152++] = arg1;
            } else if (var4 == 4) {
                this.field1158 = false;
            } else if (var4 == 5) {
                this.field1159 = arg2.method241();
            } else if (var4 == 6) {
                this.field1160 = true;
            } else if (var4 == 7) {
                this.field1161 = arg2.method244();
            } else if (var4 == 8) {
                this.field1162 = true;
                this.field1163 = true;
            } else if (var4 == 10) {
                this.field1154 = arg2.method246();
            } else if (var4 == 11) {
                this.field1163 = true;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
