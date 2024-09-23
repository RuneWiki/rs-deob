import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("NYAYDXBO")
public class class41 {

    @OriginalMember(owner = "NYAYDXBO", name = "h", descriptor = "Z")
    public boolean field1131 = false;

    @OriginalMember(owner = "NYAYDXBO", name = "i", descriptor = "Z")
    public boolean field1132 = true;

    @OriginalMember(owner = "NYAYDXBO", name = "k", descriptor = "Z")
    public boolean field1134 = false;

    @OriginalMember(owner = "NYAYDXBO", name = "n", descriptor = "Z")
    public boolean field1137 = false;

    @OriginalMember(owner = "NYAYDXBO", name = "o", descriptor = "I")
    public int field1138 = -1;

    @OriginalMember(owner = "NYAYDXBO", name = "a", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "NYAYDXBO", name = "c", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "NYAYDXBO", name = "f", descriptor = "I")
    public int field1129;

    @OriginalMember(owner = "NYAYDXBO", name = "g", descriptor = "I")
    public int field1130;

    @OriginalMember(owner = "NYAYDXBO", name = "j", descriptor = "I")
    public int field1133;

    @OriginalMember(owner = "NYAYDXBO", name = "l", descriptor = "I")
    public int field1135;

    @OriginalMember(owner = "NYAYDXBO", name = "m", descriptor = "I")
    public int field1136;

    @OriginalMember(owner = "NYAYDXBO", name = "e", descriptor = "Ljava/lang/String;")
    public String field1128;

    @OriginalMember(owner = "NYAYDXBO", name = "d", descriptor = "[I")
    public static int[] field1127;

    @OriginalMember(owner = "NYAYDXBO", name = "b", descriptor = "[LNYAYDXBO;")
    public static class41[] field1125;

    @OriginalMember(owner = "NYAYDXBO", name = "a", descriptor = "(ILQKFGLETG;)V")
    public static void method369(int arg0, class50 arg1) {
        class68 var2 = new class68((byte) 9, arg1.method402("varp.dat", null));
        field1126 = 0;
        if (arg0 != 0) {
            return;
        }
        field1124 = var2.method536();
        if (field1125 == null) {
            field1125 = new class41[field1124];
        }
        if (field1127 == null) {
            field1127 = new int[field1124];
        }
        for (int var3 = 0; var3 < field1124; var3++) {
            if (field1125[var3] == null) {
                field1125[var3] = new class41();
            }
            field1125[var3].method370(var2, var3, 857);
        }
        if (var2.field1642.length != var2.field1643) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "NYAYDXBO", name = "a", descriptor = "(LXJCNBMKS;II)V")
    public void method370(class68 arg0, int arg1, int arg2) {
        int var4 = 93 / arg2;
        while (true) {
            int var5 = arg0.method534();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field1129 = arg0.method534();
            } else if (var5 == 2) {
                this.field1130 = arg0.method534();
            } else if (var5 == 3) {
                this.field1131 = true;
                field1127[field1126++] = arg1;
            } else if (var5 == 4) {
                this.field1132 = false;
            } else if (var5 == 5) {
                this.field1133 = arg0.method536();
            } else if (var5 == 6) {
                this.field1134 = true;
            } else if (var5 == 7) {
                this.field1135 = arg0.method539();
            } else if (var5 == 8) {
                this.field1136 = 1;
                this.field1137 = true;
            } else if (var5 == 10) {
                this.field1128 = arg0.method541();
            } else if (var5 == 11) {
                this.field1137 = true;
            } else if (var5 == 12) {
                this.field1138 = arg0.method539();
            } else if (var5 == 13) {
                this.field1136 = 2;
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}
