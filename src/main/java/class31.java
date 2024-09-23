import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LVQCDTJA")
public class class31 {

    @OriginalMember(owner = "LVQCDTJA", name = "h", descriptor = "Z")
    public boolean field1040 = false;

    @OriginalMember(owner = "LVQCDTJA", name = "i", descriptor = "I")
    public int field1041 = -1;

    @OriginalMember(owner = "LVQCDTJA", name = "k", descriptor = "Z")
    public boolean field1043 = true;

    @OriginalMember(owner = "LVQCDTJA", name = "a", descriptor = "Z")
    private static boolean field1033 = true;

    @OriginalMember(owner = "LVQCDTJA", name = "b", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "LVQCDTJA", name = "e", descriptor = "I")
    public int field1037;

    @OriginalMember(owner = "LVQCDTJA", name = "f", descriptor = "I")
    public int field1038;

    @OriginalMember(owner = "LVQCDTJA", name = "g", descriptor = "I")
    public int field1039;

    @OriginalMember(owner = "LVQCDTJA", name = "j", descriptor = "I")
    public int field1042;

    @OriginalMember(owner = "LVQCDTJA", name = "d", descriptor = "Ljava/lang/String;")
    public String field1036;

    @OriginalMember(owner = "LVQCDTJA", name = "c", descriptor = "[LLVQCDTJA;")
    public static class31[] field1035;

    @OriginalMember(owner = "LVQCDTJA", name = "a", descriptor = "(LFNOQZAYQ;I)V")
    public static void method318(class14 arg0, int arg1) {
        int var2 = 91 / arg1;
        class11 var3 = new class11(arg0.method246("varbit.dat", null), field1033);
        field1034 = var3.method191();
        if (field1035 == null) {
            field1035 = new class31[field1034];
        }
        for (int var4 = 0; var4 < field1034; var4++) {
            if (field1035[var4] == null) {
                field1035[var4] = new class31();
            }
            field1035[var4].method319(var3, var4, (byte) 1);
            if (field1035[var4].field1040) {
                class54.field1311[field1035[var4].field1037].field1323 = true;
            }
        }
        if (var3.field642.length != var3.field643) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "LVQCDTJA", name = "a", descriptor = "(LDNRIFKTO;IB)V")
    public void method319(class11 arg0, int arg1, byte arg2) {
        if (arg2 != 1) {
            return;
        }
        boolean var4 = false;
        while (true) {
            int var5 = arg0.method189();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field1037 = arg0.method191();
                this.field1038 = arg0.method189();
                this.field1039 = arg0.method189();
            } else if (var5 == 10) {
                this.field1036 = arg0.method196();
            } else if (var5 == 2) {
                this.field1040 = true;
            } else if (var5 == 3) {
                this.field1041 = arg0.method194();
            } else if (var5 == 4) {
                this.field1042 = arg0.method194();
            } else if (var5 == 5) {
                this.field1043 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}
