import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BUSRYWAJ")
public class class7 {

    @OriginalMember(owner = "BUSRYWAJ", name = "a", descriptor = "I")
    private int field128 = 44842;

    @OriginalMember(owner = "BUSRYWAJ", name = "i", descriptor = "Z")
    public boolean field136 = false;

    @OriginalMember(owner = "BUSRYWAJ", name = "j", descriptor = "Z")
    public boolean field137 = true;

    @OriginalMember(owner = "BUSRYWAJ", name = "l", descriptor = "Z")
    public boolean field139 = false;

    @OriginalMember(owner = "BUSRYWAJ", name = "o", descriptor = "Z")
    public boolean field142 = false;

    @OriginalMember(owner = "BUSRYWAJ", name = "p", descriptor = "I")
    public int field143 = -1;

    @OriginalMember(owner = "BUSRYWAJ", name = "b", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "BUSRYWAJ", name = "d", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "BUSRYWAJ", name = "g", descriptor = "I")
    public int field134;

    @OriginalMember(owner = "BUSRYWAJ", name = "h", descriptor = "I")
    public int field135;

    @OriginalMember(owner = "BUSRYWAJ", name = "k", descriptor = "I")
    public int field138;

    @OriginalMember(owner = "BUSRYWAJ", name = "m", descriptor = "I")
    public int field140;

    @OriginalMember(owner = "BUSRYWAJ", name = "n", descriptor = "I")
    public int field141;

    @OriginalMember(owner = "BUSRYWAJ", name = "f", descriptor = "Ljava/lang/String;")
    public String field133;

    @OriginalMember(owner = "BUSRYWAJ", name = "e", descriptor = "[I")
    public static int[] field132;

    @OriginalMember(owner = "BUSRYWAJ", name = "c", descriptor = "[LBUSRYWAJ;")
    public static class7[] field130;

    @OriginalMember(owner = "BUSRYWAJ", name = "a", descriptor = "(LOTSGNSQM;Z)V")
    public static void method19(class41 arg0, boolean arg1) {
        class68 var2 = new class68(arg0.method376("varp.dat", null), -103);
        if (arg1) {
            return;
        }
        field131 = 0;
        field129 = var2.method551();
        if (field130 == null) {
            field130 = new class7[field129];
        }
        if (field132 == null) {
            field132 = new int[field129];
        }
        for (int var3 = 0; var3 < field129; var3++) {
            if (field130[var3] == null) {
                field130[var3] = new class7();
            }
            field130[var3].method20((byte) -38, var2, var3);
        }
        if (var2.field1611.length != var2.field1612) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "BUSRYWAJ", name = "a", descriptor = "(BLYOXDZEVD;I)V")
    public void method20(byte arg0, class68 arg1, int arg2) {
        if (arg0 != -38) {
            this.field128 = -174;
        }
        while (true) {
            int var4 = arg1.method549();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field134 = arg1.method549();
            } else if (var4 == 2) {
                this.field135 = arg1.method549();
            } else if (var4 == 3) {
                this.field136 = true;
                field132[field131++] = arg2;
            } else if (var4 == 4) {
                this.field137 = false;
            } else if (var4 == 5) {
                this.field138 = arg1.method551();
            } else if (var4 == 6) {
                this.field139 = true;
            } else if (var4 == 7) {
                this.field140 = arg1.method554();
            } else if (var4 == 8) {
                this.field141 = 1;
                this.field142 = true;
            } else if (var4 == 10) {
                this.field133 = arg1.method556();
            } else if (var4 == 11) {
                this.field142 = true;
            } else if (var4 == 12) {
                this.field143 = arg1.method554();
            } else if (var4 == 13) {
                this.field141 = 2;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
