import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!LSIUBIYU")
public class class33 {

    @OriginalMember(owner = "client!LSIUBIYU", name = "b", descriptor = "Z")
    private boolean field1046 = false;

    @OriginalMember(owner = "client!LSIUBIYU", name = "j", descriptor = "Z")
    public boolean field1054 = false;

    @OriginalMember(owner = "client!LSIUBIYU", name = "k", descriptor = "Z")
    public boolean field1055 = true;

    @OriginalMember(owner = "client!LSIUBIYU", name = "m", descriptor = "Z")
    public boolean field1057 = false;

    @OriginalMember(owner = "client!LSIUBIYU", name = "p", descriptor = "Z")
    public boolean field1060 = false;

    @OriginalMember(owner = "client!LSIUBIYU", name = "q", descriptor = "I")
    public int field1061 = -1;

    @OriginalMember(owner = "client!LSIUBIYU", name = "r", descriptor = "Z")
    public boolean field1062 = true;

    @OriginalMember(owner = "client!LSIUBIYU", name = "a", descriptor = "I")
    private static int field1045 = -29917;

    @OriginalMember(owner = "client!LSIUBIYU", name = "c", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!LSIUBIYU", name = "e", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!LSIUBIYU", name = "h", descriptor = "I")
    public int field1052;

    @OriginalMember(owner = "client!LSIUBIYU", name = "i", descriptor = "I")
    public int field1053;

    @OriginalMember(owner = "client!LSIUBIYU", name = "l", descriptor = "I")
    public int field1056;

    @OriginalMember(owner = "client!LSIUBIYU", name = "n", descriptor = "I")
    public int field1058;

    @OriginalMember(owner = "client!LSIUBIYU", name = "o", descriptor = "I")
    public int field1059;

    @OriginalMember(owner = "client!LSIUBIYU", name = "g", descriptor = "Ljava/lang/String;")
    public String field1051;

    @OriginalMember(owner = "client!LSIUBIYU", name = "f", descriptor = "[I")
    public static int[] field1050;

    @OriginalMember(owner = "client!LSIUBIYU", name = "d", descriptor = "[LLSIUBIYU;")
    public static class33[] field1048;

    @OriginalMember(owner = "client!LSIUBIYU", name = "a", descriptor = "(LFUZJMGZB;I)V")
    public static void method407(class19 arg0, int arg1) {
        class32 var2 = new class32((byte) 114, arg0.method277("varp.dat", null));
        if (arg1 < 5 || arg1 > 5) {
            field1045 = 318;
        }
        field1049 = 0;
        field1047 = var2.method371();
        if (field1048 == null) {
            field1048 = new class33[field1047];
        }
        if (field1050 == null) {
            field1050 = new int[field1047];
        }
        for (int var3 = 0; var3 < field1047; var3++) {
            if (field1048[var3] == null) {
                field1048[var3] = new class33();
            }
            field1048[var3].method408(false, var2, var3);
        }
        if (var2.field1031.length != var2.field1032) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "client!LSIUBIYU", name = "a", descriptor = "(ZLLBBVYYXO;I)V")
    public void method408(boolean arg0, class32 arg1, int arg2) {
        if (arg0) {
            this.field1046 = !this.field1046;
        }
        while (true) {
            int var4 = arg1.method369();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1052 = arg1.method369();
            } else if (var4 == 2) {
                this.field1053 = arg1.method369();
            } else if (var4 == 3) {
                this.field1054 = true;
                field1050[field1049++] = arg2;
            } else if (var4 == 4) {
                this.field1055 = false;
            } else if (var4 == 5) {
                this.field1056 = arg1.method371();
            } else if (var4 == 6) {
                this.field1057 = true;
            } else if (var4 == 7) {
                this.field1058 = arg1.method374();
            } else if (var4 == 8) {
                this.field1059 = 1;
                this.field1060 = true;
            } else if (var4 == 10) {
                this.field1051 = arg1.method376();
            } else if (var4 == 11) {
                this.field1060 = true;
            } else if (var4 == 12) {
                this.field1061 = arg1.method374();
            } else if (var4 == 13) {
                this.field1059 = 2;
                this.field1060 = true;
            } else if (var4 == 14) {
                this.field1062 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
