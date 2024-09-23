import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GBMZYMFW")
public class class23 {

    @OriginalMember(owner = "GBMZYMFW", name = "i", descriptor = "Z")
    public boolean field791 = false;

    @OriginalMember(owner = "GBMZYMFW", name = "j", descriptor = "Z")
    public boolean field792 = true;

    @OriginalMember(owner = "GBMZYMFW", name = "l", descriptor = "Z")
    public boolean field794 = false;

    @OriginalMember(owner = "GBMZYMFW", name = "o", descriptor = "Z")
    public boolean field797 = false;

    @OriginalMember(owner = "GBMZYMFW", name = "p", descriptor = "I")
    public int field798 = -1;

    @OriginalMember(owner = "GBMZYMFW", name = "q", descriptor = "Z")
    public boolean field799 = true;

    @OriginalMember(owner = "GBMZYMFW", name = "b", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "GBMZYMFW", name = "d", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "GBMZYMFW", name = "g", descriptor = "I")
    public int field789;

    @OriginalMember(owner = "GBMZYMFW", name = "h", descriptor = "I")
    public int field790;

    @OriginalMember(owner = "GBMZYMFW", name = "k", descriptor = "I")
    public int field793;

    @OriginalMember(owner = "GBMZYMFW", name = "m", descriptor = "I")
    public int field795;

    @OriginalMember(owner = "GBMZYMFW", name = "n", descriptor = "I")
    public int field796;

    @OriginalMember(owner = "GBMZYMFW", name = "f", descriptor = "Ljava/lang/String;")
    public String field788;

    @OriginalMember(owner = "GBMZYMFW", name = "a", descriptor = "Z")
    private static boolean field783;

    @OriginalMember(owner = "GBMZYMFW", name = "e", descriptor = "[I")
    public static int[] field787;

    @OriginalMember(owner = "GBMZYMFW", name = "c", descriptor = "[LGBMZYMFW;")
    public static class23[] field785;

    @OriginalMember(owner = "GBMZYMFW", name = "a", descriptor = "(ILTKEGJSFV;)V")
    public static void method313(int arg0, class58 arg1) {
        class15 var2 = new class15(arg1.method542("varp.dat", null), false);
        field786 = 0;
        field784 = var2.method263();
        if (arg0 != 0) {
            field783 = !field783;
        }
        if (field785 == null) {
            field785 = new class23[field784];
        }
        if (field787 == null) {
            field787 = new int[field784];
        }
        for (int var3 = 0; var3 < field784; var3++) {
            if (field785[var3] == null) {
                field785[var3] = new class23();
            }
            field785[var3].method314(var2, 792, var3);
        }
        if (var2.field708.length != var2.field709) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "GBMZYMFW", name = "a", descriptor = "(LEGCCHUZS;II)V")
    public void method314(class15 arg0, int arg1, int arg2) {
        if (arg1 <= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            int var5 = arg0.method261();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field789 = arg0.method261();
            } else if (var5 == 2) {
                this.field790 = arg0.method261();
            } else if (var5 == 3) {
                this.field791 = true;
                field787[field786++] = arg2;
            } else if (var5 == 4) {
                this.field792 = false;
            } else if (var5 == 5) {
                this.field793 = arg0.method263();
            } else if (var5 == 6) {
                this.field794 = true;
            } else if (var5 == 7) {
                this.field795 = arg0.method266();
            } else if (var5 == 8) {
                this.field796 = 1;
                this.field797 = true;
            } else if (var5 == 10) {
                this.field788 = arg0.method268();
            } else if (var5 == 11) {
                this.field797 = true;
            } else if (var5 == 12) {
                this.field798 = arg0.method266();
            } else if (var5 == 13) {
                this.field796 = 2;
                this.field797 = true;
            } else if (var5 == 14) {
                this.field799 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}
