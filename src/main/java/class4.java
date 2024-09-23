import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BIGJGRMT")
public class class4 {

    @OriginalMember(owner = "BIGJGRMT", name = "h", descriptor = "Z")
    public boolean field101 = false;

    @OriginalMember(owner = "BIGJGRMT", name = "i", descriptor = "Z")
    public boolean field102 = true;

    @OriginalMember(owner = "BIGJGRMT", name = "k", descriptor = "Z")
    public boolean field104 = false;

    @OriginalMember(owner = "BIGJGRMT", name = "n", descriptor = "Z")
    public boolean field107 = false;

    @OriginalMember(owner = "BIGJGRMT", name = "o", descriptor = "I")
    public int field108 = -1;

    @OriginalMember(owner = "BIGJGRMT", name = "g", descriptor = "I")
    public int field100;

    @OriginalMember(owner = "BIGJGRMT", name = "j", descriptor = "I")
    public int field103;

    @OriginalMember(owner = "BIGJGRMT", name = "l", descriptor = "I")
    public int field105;

    @OriginalMember(owner = "BIGJGRMT", name = "m", descriptor = "I")
    public int field106;

    @OriginalMember(owner = "BIGJGRMT", name = "a", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "BIGJGRMT", name = "c", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "BIGJGRMT", name = "f", descriptor = "I")
    public int field99;

    @OriginalMember(owner = "BIGJGRMT", name = "e", descriptor = "Ljava/lang/String;")
    public String field98;

    @OriginalMember(owner = "BIGJGRMT", name = "d", descriptor = "[I")
    public static int[] field97;

    @OriginalMember(owner = "BIGJGRMT", name = "b", descriptor = "[LBIGJGRMT;")
    public static class4[] field95;

    @OriginalMember(owner = "BIGJGRMT", name = "a", descriptor = "(ZLXRWUKRPO;)V")
    public static void method27(boolean arg0, class65 arg1) {
        class21 var2 = new class21(arg1.method581("varp.dat", null), -49015);
        field96 = 0;
        if (arg0) {
            return;
        }
        field94 = var2.method246();
        if (field95 == null) {
            field95 = new class4[field94];
        }
        if (field97 == null) {
            field97 = new int[field94];
        }
        for (int var3 = 0; var3 < field94; var3++) {
            if (field95[var3] == null) {
                field95[var3] = new class4();
            }
            field95[var3].method28(false, var3, var2);
        }
        if (var2.field817.length != var2.field818) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "BIGJGRMT", name = "a", descriptor = "(ZILGLMIQHJI;)V")
    public void method28(boolean arg0, int arg1, class21 arg2) {
        if (arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            int var5 = arg2.method244();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field99 = arg2.method244();
            } else if (var5 == 2) {
                this.field100 = arg2.method244();
            } else if (var5 == 3) {
                this.field101 = true;
                field97[field96++] = arg1;
            } else if (var5 == 4) {
                this.field102 = false;
            } else if (var5 == 5) {
                this.field103 = arg2.method246();
            } else if (var5 == 6) {
                this.field104 = true;
            } else if (var5 == 7) {
                this.field105 = arg2.method249();
            } else if (var5 == 8) {
                this.field106 = 1;
                this.field107 = true;
            } else if (var5 == 10) {
                this.field98 = arg2.method251();
            } else if (var5 == 11) {
                this.field107 = true;
            } else if (var5 == 12) {
                this.field108 = arg2.method249();
            } else if (var5 == 13) {
                this.field106 = 2;
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}
