import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("rc")
public class VarpType {

    @OriginalMember(owner = "rc", name = "i", descriptor = "Z")
    public boolean field1170 = false;

    @OriginalMember(owner = "rc", name = "j", descriptor = "Z")
    public boolean field1171 = true;

    @OriginalMember(owner = "rc", name = "l", descriptor = "Z")
    public boolean field1173 = false;

    @OriginalMember(owner = "rc", name = "n", descriptor = "Z")
    public boolean field1175 = false;

    @OriginalMember(owner = "rc", name = "o", descriptor = "Z")
    public boolean field1176 = false;

    @OriginalMember(owner = "rc", name = "a", descriptor = "I")
    private static int field1162;

    @OriginalMember(owner = "rc", name = "b", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "rc", name = "d", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "rc", name = "g", descriptor = "I")
    public int field1168;

    @OriginalMember(owner = "rc", name = "h", descriptor = "I")
    public int field1169;

    @OriginalMember(owner = "rc", name = "k", descriptor = "I")
    public int field1172;

    @OriginalMember(owner = "rc", name = "m", descriptor = "I")
    public int field1174;

    @OriginalMember(owner = "rc", name = "f", descriptor = "Ljava/lang/String;")
    public String field1167;

    @OriginalMember(owner = "rc", name = "e", descriptor = "[I")
    public static int[] field1166;

    @OriginalMember(owner = "rc", name = "c", descriptor = "[Lrc;")
    public static VarpType[] field1164;

    @OriginalMember(owner = "rc", name = "a", descriptor = "(ZLyb;)V")
    public static void method391(boolean arg0, Jagfile arg1) {
        if (!arg0) {
            field1162 = -168;
        }
        Packet var2 = new Packet(16, arg1.method309("varp.dat", null));
        field1165 = 0;
        field1163 = var2.method241();
        if (field1164 == null) {
            field1164 = new VarpType[field1163];
        }
        if (field1166 == null) {
            field1166 = new int[field1163];
        }
        for (int var3 = 0; var3 < field1163; var3++) {
            if (field1164[var3] == null) {
                field1164[var3] = new VarpType();
            }
            field1164[var3].method392(var2, -40834, var3);
        }
        if (var2.field716.length != var2.field717) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "rc", name = "a", descriptor = "(Lmb;II)V")
    public void method392(Packet arg0, int arg1, int arg2) {
        if (arg1 != -40834) {
            return;
        }
        while (true) {
            int var4 = arg0.method239();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1168 = arg0.method239();
            } else if (var4 == 2) {
                this.field1169 = arg0.method239();
            } else if (var4 == 3) {
                this.field1170 = true;
                field1166[field1165++] = arg2;
            } else if (var4 == 4) {
                this.field1171 = false;
            } else if (var4 == 5) {
                this.field1172 = arg0.method241();
            } else if (var4 == 6) {
                this.field1173 = true;
            } else if (var4 == 7) {
                this.field1174 = arg0.method244();
            } else if (var4 == 8) {
                this.field1175 = true;
                this.field1176 = true;
            } else if (var4 == 10) {
                this.field1167 = arg0.method246();
            } else if (var4 == 11) {
                this.field1176 = true;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
