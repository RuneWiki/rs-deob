import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ISZVQSTL")
public class class28 {

    @OriginalMember(owner = "ISZVQSTL", name = "i", descriptor = "Z")
    public boolean field969 = false;

    @OriginalMember(owner = "ISZVQSTL", name = "j", descriptor = "Z")
    public boolean field970 = true;

    @OriginalMember(owner = "ISZVQSTL", name = "l", descriptor = "Z")
    public boolean field972 = false;

    @OriginalMember(owner = "ISZVQSTL", name = "o", descriptor = "Z")
    public boolean field975 = false;

    @OriginalMember(owner = "ISZVQSTL", name = "p", descriptor = "I")
    public int field976 = -1;

    @OriginalMember(owner = "ISZVQSTL", name = "q", descriptor = "Z")
    public boolean field977 = true;

    @OriginalMember(owner = "ISZVQSTL", name = "a", descriptor = "Z")
    private static boolean field961 = true;

    @OriginalMember(owner = "ISZVQSTL", name = "b", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "ISZVQSTL", name = "d", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "ISZVQSTL", name = "g", descriptor = "I")
    public int field967;

    @OriginalMember(owner = "ISZVQSTL", name = "h", descriptor = "I")
    public int field968;

    @OriginalMember(owner = "ISZVQSTL", name = "k", descriptor = "I")
    public int field971;

    @OriginalMember(owner = "ISZVQSTL", name = "m", descriptor = "I")
    public int field973;

    @OriginalMember(owner = "ISZVQSTL", name = "n", descriptor = "I")
    public int field974;

    @OriginalMember(owner = "ISZVQSTL", name = "f", descriptor = "Ljava/lang/String;")
    public String field966;

    @OriginalMember(owner = "ISZVQSTL", name = "e", descriptor = "[I")
    public static int[] field965;

    @OriginalMember(owner = "ISZVQSTL", name = "c", descriptor = "[LISZVQSTL;")
    public static class28[] field963;

    @OriginalMember(owner = "ISZVQSTL", name = "a", descriptor = "(ILBBMKAXRK;)V")
    public static void method332(int arg0, class6 arg1) {
        class17 var2 = new class17(arg1.method30("varp.dat", null), -26583);
        field964 = 0;
        while (arg0 >= 0) {
            field961 = !field961;
        }
        field962 = var2.method226();
        if (field963 == null) {
            field963 = new class28[field962];
        }
        if (field965 == null) {
            field965 = new int[field962];
        }
        for (int var3 = 0; var3 < field962; var3++) {
            if (field963[var3] == null) {
                field963[var3] = new class28();
            }
            field963[var3].method333(var3, var2, 0);
        }
        if (var2.field778.length != var2.field779) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "ISZVQSTL", name = "a", descriptor = "(ILEILHLJCE;I)V")
    public void method333(int arg0, class17 arg1, int arg2) {
        if (arg2 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            int var5 = arg1.method224();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field967 = arg1.method224();
            } else if (var5 == 2) {
                this.field968 = arg1.method224();
            } else if (var5 == 3) {
                this.field969 = true;
                field965[field964++] = arg0;
            } else if (var5 == 4) {
                this.field970 = false;
            } else if (var5 == 5) {
                this.field971 = arg1.method226();
            } else if (var5 == 6) {
                this.field972 = true;
            } else if (var5 == 7) {
                this.field973 = arg1.method229();
            } else if (var5 == 8) {
                this.field974 = 1;
                this.field975 = true;
            } else if (var5 == 10) {
                this.field966 = arg1.method231();
            } else if (var5 == 11) {
                this.field975 = true;
            } else if (var5 == 12) {
                this.field976 = arg1.method229();
            } else if (var5 == 13) {
                this.field974 = 2;
                this.field975 = true;
            } else if (var5 == 14) {
                this.field977 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}
