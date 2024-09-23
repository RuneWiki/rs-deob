import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("KVOIHOSF")
public class class36 {

    @OriginalMember(owner = "KVOIHOSF", name = "i", descriptor = "Z")
    public boolean field1047 = false;

    @OriginalMember(owner = "KVOIHOSF", name = "j", descriptor = "Z")
    public boolean field1048 = true;

    @OriginalMember(owner = "KVOIHOSF", name = "l", descriptor = "Z")
    public boolean field1050 = false;

    @OriginalMember(owner = "KVOIHOSF", name = "o", descriptor = "Z")
    public boolean field1053 = false;

    @OriginalMember(owner = "KVOIHOSF", name = "p", descriptor = "I")
    public int field1054 = -1;

    @OriginalMember(owner = "KVOIHOSF", name = "q", descriptor = "Z")
    public boolean field1055 = true;

    @OriginalMember(owner = "KVOIHOSF", name = "a", descriptor = "Z")
    private static boolean field1039 = true;

    @OriginalMember(owner = "KVOIHOSF", name = "b", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "KVOIHOSF", name = "d", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "KVOIHOSF", name = "g", descriptor = "I")
    public int field1045;

    @OriginalMember(owner = "KVOIHOSF", name = "h", descriptor = "I")
    public int field1046;

    @OriginalMember(owner = "KVOIHOSF", name = "k", descriptor = "I")
    public int field1049;

    @OriginalMember(owner = "KVOIHOSF", name = "m", descriptor = "I")
    public int field1051;

    @OriginalMember(owner = "KVOIHOSF", name = "n", descriptor = "I")
    public int field1052;

    @OriginalMember(owner = "KVOIHOSF", name = "f", descriptor = "Ljava/lang/String;")
    public String field1044;

    @OriginalMember(owner = "KVOIHOSF", name = "e", descriptor = "[I")
    public static int[] field1043;

    @OriginalMember(owner = "KVOIHOSF", name = "c", descriptor = "[LKVOIHOSF;")
    public static class36[] field1041;

    @OriginalMember(owner = "KVOIHOSF", name = "a", descriptor = "(ZLMJLXHQTQ;)V")
    public static void method286(boolean arg0, class44 arg1) {
        class69 var2 = new class69(arg1.method317("varp.dat", null), -82);
        if (!arg0) {
            return;
        }
        field1042 = 0;
        field1040 = var2.method467();
        if (field1041 == null) {
            field1041 = new class36[field1040];
        }
        if (field1043 == null) {
            field1043 = new int[field1040];
        }
        for (int var3 = 0; var3 < field1040; var3++) {
            if (field1041[var3] == null) {
                field1041[var3] = new class36();
            }
            field1041[var3].method287(var3, 0, var2);
        }
        if (var2.field1651.length != var2.field1652) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "KVOIHOSF", name = "a", descriptor = "(IILXGRGMPUQ;)V")
    public void method287(int arg0, int arg1, class69 arg2) {
        if (arg1 != 0) {
            field1039 = !field1039;
        }
        while (true) {
            int var4 = arg2.method465();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1045 = arg2.method465();
            } else if (var4 == 2) {
                this.field1046 = arg2.method465();
            } else if (var4 == 3) {
                this.field1047 = true;
                field1043[field1042++] = arg0;
            } else if (var4 == 4) {
                this.field1048 = false;
            } else if (var4 == 5) {
                this.field1049 = arg2.method467();
            } else if (var4 == 6) {
                this.field1050 = true;
            } else if (var4 == 7) {
                this.field1051 = arg2.method470();
            } else if (var4 == 8) {
                this.field1052 = 1;
                this.field1053 = true;
            } else if (var4 == 10) {
                this.field1044 = arg2.method472();
            } else if (var4 == 11) {
                this.field1053 = true;
            } else if (var4 == 12) {
                this.field1054 = arg2.method470();
            } else if (var4 == 13) {
                this.field1052 = 2;
                this.field1053 = true;
            } else if (var4 == 14) {
                this.field1055 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
