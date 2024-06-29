import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ONRKYVGF")
public class class37 {

    @OriginalMember(owner = "client!ONRKYVGF", name = "b", descriptor = "I")
    private int field1084 = -585;

    @OriginalMember(owner = "client!ONRKYVGF", name = "j", descriptor = "Z")
    public boolean field1092 = false;

    @OriginalMember(owner = "client!ONRKYVGF", name = "k", descriptor = "Z")
    public boolean field1093 = true;

    @OriginalMember(owner = "client!ONRKYVGF", name = "m", descriptor = "Z")
    public boolean field1095 = false;

    @OriginalMember(owner = "client!ONRKYVGF", name = "p", descriptor = "Z")
    public boolean field1098 = false;

    @OriginalMember(owner = "client!ONRKYVGF", name = "q", descriptor = "I")
    public int field1099 = -1;

    @OriginalMember(owner = "client!ONRKYVGF", name = "r", descriptor = "Z")
    public boolean field1100 = true;

    @OriginalMember(owner = "client!ONRKYVGF", name = "a", descriptor = "I")
    private static int field1083 = -21443;

    @OriginalMember(owner = "client!ONRKYVGF", name = "c", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!ONRKYVGF", name = "e", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!ONRKYVGF", name = "h", descriptor = "I")
    public int field1090;

    @OriginalMember(owner = "client!ONRKYVGF", name = "i", descriptor = "I")
    public int field1091;

    @OriginalMember(owner = "client!ONRKYVGF", name = "l", descriptor = "I")
    public int field1094;

    @OriginalMember(owner = "client!ONRKYVGF", name = "n", descriptor = "I")
    public int field1096;

    @OriginalMember(owner = "client!ONRKYVGF", name = "o", descriptor = "I")
    public int field1097;

    @OriginalMember(owner = "client!ONRKYVGF", name = "g", descriptor = "Ljava/lang/String;")
    public String field1089;

    @OriginalMember(owner = "client!ONRKYVGF", name = "f", descriptor = "[I")
    public static int[] field1088;

    @OriginalMember(owner = "client!ONRKYVGF", name = "d", descriptor = "[LONRKYVGF;")
    public static class37[] field1086;

    @OriginalMember(owner = "client!ONRKYVGF", name = "a", descriptor = "(ZLVSQMPWOM;)V")
    public static void method361(boolean arg0, class59 arg1) {
        class3 var2 = new class3(arg1.method526("varp.dat", null), -990);
        field1087 = 0;
        field1085 = var2.method56();
        if (field1086 == null) {
            field1086 = new class37[field1085];
        }
        if (field1088 == null) {
            field1088 = new int[field1085];
        }
        for (int var3 = 0; var3 < field1085; var3++) {
            if (field1086[var3] == null) {
                field1086[var3] = new class37();
            }
            field1086[var3].method362(var3, var2, -585);
        }
        if (!arg0) {
            field1083 = -459;
        }
        if (var2.field49.length != var2.field50) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "client!ONRKYVGF", name = "a", descriptor = "(ILBFQIDHPO;I)V")
    public void method362(int arg0, class3 arg1, int arg2) {
        if (arg2 >= 0) {
            return;
        }
        while (true) {
            int var4 = arg1.method54();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1090 = arg1.method54();
            } else if (var4 == 2) {
                this.field1091 = arg1.method54();
            } else if (var4 == 3) {
                this.field1092 = true;
                field1088[field1087++] = arg0;
            } else if (var4 == 4) {
                this.field1093 = false;
            } else if (var4 == 5) {
                this.field1094 = arg1.method56();
            } else if (var4 == 6) {
                this.field1095 = true;
            } else if (var4 == 7) {
                this.field1096 = arg1.method59();
            } else if (var4 == 8) {
                this.field1097 = 1;
                this.field1098 = true;
            } else if (var4 == 10) {
                this.field1089 = arg1.method61();
            } else if (var4 == 11) {
                this.field1098 = true;
            } else if (var4 == 12) {
                this.field1099 = arg1.method59();
            } else if (var4 == 13) {
                this.field1097 = 2;
                this.field1098 = true;
            } else if (var4 == 14) {
                this.field1100 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
