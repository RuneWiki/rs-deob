import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BUIWQSXJ")
public class class6 {

    @OriginalMember(owner = "BUIWQSXJ", name = "b", descriptor = "I")
    private int field46 = 262;

    @OriginalMember(owner = "BUIWQSXJ", name = "c", descriptor = "I")
    private int field47 = 8;

    @OriginalMember(owner = "BUIWQSXJ", name = "h", descriptor = "I")
    public int field52 = -1;

    @OriginalMember(owner = "BUIWQSXJ", name = "j", descriptor = "[I")
    public int[] field54 = new int[6];

    @OriginalMember(owner = "BUIWQSXJ", name = "k", descriptor = "[I")
    public int[] field55 = new int[6];

    @OriginalMember(owner = "BUIWQSXJ", name = "l", descriptor = "I")
    public int field56 = 128;

    @OriginalMember(owner = "BUIWQSXJ", name = "m", descriptor = "I")
    public int field57 = 128;

    @OriginalMember(owner = "BUIWQSXJ", name = "a", descriptor = "I")
    private static int field45 = 974;

    @OriginalMember(owner = "BUIWQSXJ", name = "q", descriptor = "LZYLCKQCD;")
    public static class71 field61 = new class71((byte) -89, 30);

    @OriginalMember(owner = "BUIWQSXJ", name = "d", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "BUIWQSXJ", name = "f", descriptor = "I")
    public int field50;

    @OriginalMember(owner = "BUIWQSXJ", name = "g", descriptor = "I")
    public int field51;

    @OriginalMember(owner = "BUIWQSXJ", name = "n", descriptor = "I")
    public int field58;

    @OriginalMember(owner = "BUIWQSXJ", name = "o", descriptor = "I")
    public int field59;

    @OriginalMember(owner = "BUIWQSXJ", name = "p", descriptor = "I")
    public int field60;

    @OriginalMember(owner = "BUIWQSXJ", name = "i", descriptor = "LKIZBPSHZ;")
    public class29 field53;

    @OriginalMember(owner = "BUIWQSXJ", name = "e", descriptor = "[LBUIWQSXJ;")
    public static class6[] field49;

    @OriginalMember(owner = "BUIWQSXJ", name = "a", descriptor = "(ILQDHHNYHL;)V")
    public static void method60(int arg0, class44 arg1) {
        class42 var2 = new class42(5, arg1.method488("spotanim.dat", null));
        field48 = var2.method422();
        if (field49 == null) {
            field49 = new class6[field48];
        }
        for (int var3 = 0; var3 < field48; var3++) {
            if (field49[var3] == null) {
                field49[var3] = new class6();
            }
            field49[var3].field50 = var3;
            field49[var3].method61(var2, field45);
        }
        if (arg0 != 0) {
            field45 = 71;
        }
    }

    @OriginalMember(owner = "BUIWQSXJ", name = "a", descriptor = "(LPGNBHFUF;I)V")
    public void method61(class42 arg0, int arg1) {
        if (arg1 <= 0) {
            this.field46 = -105;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method420();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field51 = arg0.method422();
                } else if (var3 == 2) {
                    this.field52 = arg0.method422();
                    if (class29.field1014 != null) {
                        this.field53 = class29.field1014[this.field52];
                    }
                } else if (var3 == 4) {
                    this.field56 = arg0.method422();
                } else if (var3 == 5) {
                    this.field57 = arg0.method422();
                } else if (var3 == 6) {
                    this.field58 = arg0.method422();
                } else if (var3 == 7) {
                    this.field59 = arg0.method420();
                } else if (var3 == 8) {
                    this.field60 = arg0.method420();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field54[var3 - 40] = arg0.method422();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field55[var3 - 50] = arg0.method422();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "BUIWQSXJ", name = "a", descriptor = "()LPOJFANDE;")
    public class43 method62() {
        class43 var1 = (class43) field61.method599((long) this.field50);
        if (var1 != null) {
            return var1;
        }
        class43 var2 = class43.method460(this.field51);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field54[0] != 0) {
                var2.method474(this.field54[var3], this.field55[var3]);
            }
        }
        field61.method600(var2, this.field47, (long) this.field50);
        return var2;
    }
}
