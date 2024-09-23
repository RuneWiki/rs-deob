import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DIPZNIAB")
public class class9 {

    @OriginalMember(owner = "DIPZNIAB", name = "i", descriptor = "Z")
    public boolean field654 = false;

    @OriginalMember(owner = "DIPZNIAB", name = "j", descriptor = "Z")
    public boolean field655 = true;

    @OriginalMember(owner = "DIPZNIAB", name = "l", descriptor = "Z")
    public boolean field657 = false;

    @OriginalMember(owner = "DIPZNIAB", name = "o", descriptor = "Z")
    public boolean field660 = false;

    @OriginalMember(owner = "DIPZNIAB", name = "p", descriptor = "I")
    public int field661 = -1;

    @OriginalMember(owner = "DIPZNIAB", name = "a", descriptor = "I")
    private static int field646 = -113;

    @OriginalMember(owner = "DIPZNIAB", name = "b", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "DIPZNIAB", name = "d", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "DIPZNIAB", name = "g", descriptor = "I")
    public int field652;

    @OriginalMember(owner = "DIPZNIAB", name = "h", descriptor = "I")
    public int field653;

    @OriginalMember(owner = "DIPZNIAB", name = "k", descriptor = "I")
    public int field656;

    @OriginalMember(owner = "DIPZNIAB", name = "m", descriptor = "I")
    public int field658;

    @OriginalMember(owner = "DIPZNIAB", name = "n", descriptor = "I")
    public int field659;

    @OriginalMember(owner = "DIPZNIAB", name = "f", descriptor = "Ljava/lang/String;")
    public String field651;

    @OriginalMember(owner = "DIPZNIAB", name = "e", descriptor = "[I")
    public static int[] field650;

    @OriginalMember(owner = "DIPZNIAB", name = "c", descriptor = "[LDIPZNIAB;")
    public static class9[] field648;

    @OriginalMember(owner = "DIPZNIAB", name = "a", descriptor = "(ZLEAXVDNXA;)V")
    public static void method235(boolean arg0, class12 arg1) {
        class5 var2 = new class5(2, arg1.method255("varp.dat", null));
        field649 = 0;
        field647 = var2.method46();
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (field648 == null) {
            field648 = new class9[field647];
        }
        if (field650 == null) {
            field650 = new int[field647];
        }
        for (int var4 = 0; var4 < field647; var4++) {
            if (field648[var4] == null) {
                field648[var4] = new class9();
            }
            field648[var4].method236(var4, field646, var2);
        }
        if (var2.field122.length != var2.field123) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "DIPZNIAB", name = "a", descriptor = "(IILCKBTFRZM;)V")
    public void method236(int arg0, int arg1, class5 arg2) {
        if (arg1 >= 0) {
            return;
        }
        while (true) {
            int var4 = arg2.method44();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field652 = arg2.method44();
            } else if (var4 == 2) {
                this.field653 = arg2.method44();
            } else if (var4 == 3) {
                this.field654 = true;
                field650[field649++] = arg0;
            } else if (var4 == 4) {
                this.field655 = false;
            } else if (var4 == 5) {
                this.field656 = arg2.method46();
            } else if (var4 == 6) {
                this.field657 = true;
            } else if (var4 == 7) {
                this.field658 = arg2.method49();
            } else if (var4 == 8) {
                this.field659 = 1;
                this.field660 = true;
            } else if (var4 == 10) {
                this.field651 = arg2.method51();
            } else if (var4 == 11) {
                this.field660 = true;
            } else if (var4 == 12) {
                this.field661 = arg2.method49();
            } else if (var4 == 13) {
                this.field659 = 2;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
