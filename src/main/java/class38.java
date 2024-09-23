import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ONNQWBMW")
public class class38 {

    @OriginalMember(owner = "ONNQWBMW", name = "i", descriptor = "Z")
    public boolean field1092 = false;

    @OriginalMember(owner = "ONNQWBMW", name = "j", descriptor = "Z")
    public boolean field1093 = true;

    @OriginalMember(owner = "ONNQWBMW", name = "l", descriptor = "Z")
    public boolean field1095 = false;

    @OriginalMember(owner = "ONNQWBMW", name = "o", descriptor = "Z")
    public boolean field1098 = false;

    @OriginalMember(owner = "ONNQWBMW", name = "p", descriptor = "I")
    public int field1099 = -1;

    @OriginalMember(owner = "ONNQWBMW", name = "a", descriptor = "I")
    private static int field1084 = 8;

    @OriginalMember(owner = "ONNQWBMW", name = "b", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "ONNQWBMW", name = "d", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "ONNQWBMW", name = "g", descriptor = "I")
    public int field1090;

    @OriginalMember(owner = "ONNQWBMW", name = "h", descriptor = "I")
    public int field1091;

    @OriginalMember(owner = "ONNQWBMW", name = "k", descriptor = "I")
    public int field1094;

    @OriginalMember(owner = "ONNQWBMW", name = "m", descriptor = "I")
    public int field1096;

    @OriginalMember(owner = "ONNQWBMW", name = "n", descriptor = "I")
    public int field1097;

    @OriginalMember(owner = "ONNQWBMW", name = "f", descriptor = "Ljava/lang/String;")
    public String field1089;

    @OriginalMember(owner = "ONNQWBMW", name = "e", descriptor = "[I")
    public static int[] field1088;

    @OriginalMember(owner = "ONNQWBMW", name = "c", descriptor = "[LONNQWBMW;")
    public static class38[] field1086;

    @OriginalMember(owner = "ONNQWBMW", name = "a", descriptor = "(LFIGUVTWB;Z)V")
    public static void method398(class15 arg0, boolean arg1) {
        class33 var2 = new class33(field1084, arg0.method209("varp.dat", null));
        if (arg1) {
            return;
        }
        field1087 = 0;
        field1085 = var2.method294();
        if (field1086 == null) {
            field1086 = new class38[field1085];
        }
        if (field1088 == null) {
            field1088 = new int[field1085];
        }
        for (int var3 = 0; var3 < field1085; var3++) {
            if (field1086[var3] == null) {
                field1086[var3] = new class38();
            }
            field1086[var3].method399(0, var2, var3);
        }
        if (var2.field953.length != var2.field954) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "ONNQWBMW", name = "a", descriptor = "(ILMUKVLYLC;I)V")
    public void method399(int arg0, class33 arg1, int arg2) {
        if (arg0 < 0 || arg0 > 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            int var5 = arg1.method292();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field1090 = arg1.method292();
            } else if (var5 == 2) {
                this.field1091 = arg1.method292();
            } else if (var5 == 3) {
                this.field1092 = true;
                field1088[field1087++] = arg2;
            } else if (var5 == 4) {
                this.field1093 = false;
            } else if (var5 == 5) {
                this.field1094 = arg1.method294();
            } else if (var5 == 6) {
                this.field1095 = true;
            } else if (var5 == 7) {
                this.field1096 = arg1.method297();
            } else if (var5 == 8) {
                this.field1097 = 1;
                this.field1098 = true;
            } else if (var5 == 10) {
                this.field1089 = arg1.method299();
            } else if (var5 == 11) {
                this.field1098 = true;
            } else if (var5 == 12) {
                this.field1099 = arg1.method297();
            } else if (var5 == 13) {
                this.field1097 = 2;
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}
