import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CJICJSIY")
public class class6 {

    @OriginalMember(owner = "client!CJICJSIY", name = "a", descriptor = "Z")
    private boolean field102 = true;

    @OriginalMember(owner = "client!CJICJSIY", name = "i", descriptor = "Z")
    public boolean field110 = false;

    @OriginalMember(owner = "client!CJICJSIY", name = "j", descriptor = "Z")
    public boolean field111 = true;

    @OriginalMember(owner = "client!CJICJSIY", name = "l", descriptor = "Z")
    public boolean field113 = false;

    @OriginalMember(owner = "client!CJICJSIY", name = "o", descriptor = "Z")
    public boolean field116 = false;

    @OriginalMember(owner = "client!CJICJSIY", name = "p", descriptor = "I")
    public int field117 = -1;

    @OriginalMember(owner = "client!CJICJSIY", name = "q", descriptor = "Z")
    public boolean field118 = true;

    @OriginalMember(owner = "client!CJICJSIY", name = "b", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!CJICJSIY", name = "d", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!CJICJSIY", name = "g", descriptor = "I")
    public int field108;

    @OriginalMember(owner = "client!CJICJSIY", name = "h", descriptor = "I")
    public int field109;

    @OriginalMember(owner = "client!CJICJSIY", name = "k", descriptor = "I")
    public int field112;

    @OriginalMember(owner = "client!CJICJSIY", name = "m", descriptor = "I")
    public int field114;

    @OriginalMember(owner = "client!CJICJSIY", name = "n", descriptor = "I")
    public int field115;

    @OriginalMember(owner = "client!CJICJSIY", name = "f", descriptor = "Ljava/lang/String;")
    public String field107;

    @OriginalMember(owner = "client!CJICJSIY", name = "e", descriptor = "[I")
    public static int[] field106;

    @OriginalMember(owner = "client!CJICJSIY", name = "c", descriptor = "[LCJICJSIY;")
    public static class6[] field104;

    @OriginalMember(owner = "client!CJICJSIY", name = "a", descriptor = "(BLXOJZVVDK;)V")
    public static void method14(byte arg0, class60 arg1) {
        class41 var2 = new class41(888, arg1.method560("varp.dat", null));
        field105 = 0;
        field103 = var2.method342();
        if (field104 == null) {
            field104 = new class6[field103];
        }
        if (field106 == null) {
            field106 = new int[field103];
        }
        for (int var3 = 0; var3 < field103; var3++) {
            if (field104[var3] == null) {
                field104[var3] = new class6();
            }
            field104[var3].method15(-609, var2, var3);
        }
        if (arg0 != -82) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (var2.field1240.length != var2.field1241) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "client!CJICJSIY", name = "a", descriptor = "(ILPQBRPYKE;I)V")
    public void method15(int arg0, class41 arg1, int arg2) {
        while (arg0 >= 0) {
            this.field102 = !this.field102;
        }
        while (true) {
            int var4 = arg1.method340();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field108 = arg1.method340();
            } else if (var4 == 2) {
                this.field109 = arg1.method340();
            } else if (var4 == 3) {
                this.field110 = true;
                field106[field105++] = arg2;
            } else if (var4 == 4) {
                this.field111 = false;
            } else if (var4 == 5) {
                this.field112 = arg1.method342();
            } else if (var4 == 6) {
                this.field113 = true;
            } else if (var4 == 7) {
                this.field114 = arg1.method345();
            } else if (var4 == 8) {
                this.field115 = 1;
                this.field116 = true;
            } else if (var4 == 10) {
                this.field107 = arg1.method347();
            } else if (var4 == 11) {
                this.field116 = true;
            } else if (var4 == 12) {
                this.field117 = arg1.method345();
            } else if (var4 == 13) {
                this.field115 = 2;
                this.field116 = true;
            } else if (var4 == 14) {
                this.field118 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
