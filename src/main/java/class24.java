import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("IYJSMCGP")
public class class24 {

    @OriginalMember(owner = "IYJSMCGP", name = "i", descriptor = "Z")
    public boolean field982 = false;

    @OriginalMember(owner = "IYJSMCGP", name = "j", descriptor = "Z")
    public boolean field983 = true;

    @OriginalMember(owner = "IYJSMCGP", name = "l", descriptor = "Z")
    public boolean field985 = false;

    @OriginalMember(owner = "IYJSMCGP", name = "o", descriptor = "Z")
    public boolean field988 = false;

    @OriginalMember(owner = "IYJSMCGP", name = "p", descriptor = "I")
    public int field989 = -1;

    @OriginalMember(owner = "IYJSMCGP", name = "a", descriptor = "I")
    private static int field974;

    @OriginalMember(owner = "IYJSMCGP", name = "b", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "IYJSMCGP", name = "d", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "IYJSMCGP", name = "g", descriptor = "I")
    public int field980;

    @OriginalMember(owner = "IYJSMCGP", name = "h", descriptor = "I")
    public int field981;

    @OriginalMember(owner = "IYJSMCGP", name = "k", descriptor = "I")
    public int field984;

    @OriginalMember(owner = "IYJSMCGP", name = "m", descriptor = "I")
    public int field986;

    @OriginalMember(owner = "IYJSMCGP", name = "n", descriptor = "I")
    public int field987;

    @OriginalMember(owner = "IYJSMCGP", name = "f", descriptor = "Ljava/lang/String;")
    public String field979;

    @OriginalMember(owner = "IYJSMCGP", name = "e", descriptor = "[I")
    public static int[] field978;

    @OriginalMember(owner = "IYJSMCGP", name = "c", descriptor = "[LIYJSMCGP;")
    public static class24[] field976;

    @OriginalMember(owner = "IYJSMCGP", name = "a", descriptor = "(ILSYUGXMZF;)V")
    public static void method324(int arg0, class55 arg1) {
        class30 var2 = new class30(arg1.method551("varp.dat", null), -982);
        field977 = 0;
        field975 = var2.method351();
        if (field976 == null) {
            field976 = new class24[field975];
        }
        if (field978 == null) {
            field978 = new int[field975];
        }
        for (int var3 = 0; var3 < field975; var3++) {
            if (field976[var3] == null) {
                field976[var3] = new class24();
            }
            field976[var3].method325(var3, var2, (byte) 7);
        }
        while (arg0 >= 0) {
            field974 = 81;
        }
        if (var2.field1064.length != var2.field1065) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "IYJSMCGP", name = "a", descriptor = "(ILKHOMSBHW;B)V")
    public void method325(int arg0, class30 arg1, byte arg2) {
        if (arg2 != 7) {
            return;
        }
        while (true) {
            int var4 = arg1.method349();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field980 = arg1.method349();
            } else if (var4 == 2) {
                this.field981 = arg1.method349();
            } else if (var4 == 3) {
                this.field982 = true;
                field978[field977++] = arg0;
            } else if (var4 == 4) {
                this.field983 = false;
            } else if (var4 == 5) {
                this.field984 = arg1.method351();
            } else if (var4 == 6) {
                this.field985 = true;
            } else if (var4 == 7) {
                this.field986 = arg1.method354();
            } else if (var4 == 8) {
                this.field987 = 1;
                this.field988 = true;
            } else if (var4 == 10) {
                this.field979 = arg1.method356();
            } else if (var4 == 11) {
                this.field988 = true;
            } else if (var4 == 12) {
                this.field989 = arg1.method354();
            } else if (var4 == 13) {
                this.field987 = 2;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
