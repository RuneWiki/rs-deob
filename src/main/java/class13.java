import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DDXRHBHP")
public class class13 {

    @OriginalMember(owner = "DDXRHBHP", name = "a", descriptor = "Z")
    private boolean field584 = true;

    @OriginalMember(owner = "DDXRHBHP", name = "h", descriptor = "Z")
    public boolean field591 = false;

    @OriginalMember(owner = "DDXRHBHP", name = "i", descriptor = "I")
    public int field592 = -1;

    @OriginalMember(owner = "DDXRHBHP", name = "k", descriptor = "Z")
    public boolean field594 = true;

    @OriginalMember(owner = "DDXRHBHP", name = "b", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "DDXRHBHP", name = "e", descriptor = "I")
    public int field588;

    @OriginalMember(owner = "DDXRHBHP", name = "f", descriptor = "I")
    public int field589;

    @OriginalMember(owner = "DDXRHBHP", name = "g", descriptor = "I")
    public int field590;

    @OriginalMember(owner = "DDXRHBHP", name = "j", descriptor = "I")
    public int field593;

    @OriginalMember(owner = "DDXRHBHP", name = "d", descriptor = "Ljava/lang/String;")
    public String field587;

    @OriginalMember(owner = "DDXRHBHP", name = "c", descriptor = "[LDDXRHBHP;")
    public static class13[] field586;

    @OriginalMember(owner = "DDXRHBHP", name = "a", descriptor = "(LVSUYIIVA;I)V")
    public static void method232(class62 arg0, int arg1) {
        if (arg1 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class8 var3 = new class8(arg0.method570("varbit.dat", null), 792);
        field585 = var3.method32();
        if (field586 == null) {
            field586 = new class13[field585];
        }
        for (int var4 = 0; var4 < field585; var4++) {
            if (field586[var4] == null) {
                field586[var4] = new class13();
            }
            field586[var4].method233(var4, (byte) 5, var3);
            if (field586[var4].field591) {
                class49.field1285[field586[var4].field588].field1297 = true;
            }
        }
        if (var3.field71.length != var3.field72) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "DDXRHBHP", name = "a", descriptor = "(IBLCFARFRSG;)V")
    public void method233(int arg0, byte arg1, class8 arg2) {
        if (arg1 != 5) {
            this.field584 = !this.field584;
        }
        while (true) {
            int var4 = arg2.method30();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field588 = arg2.method32();
                this.field589 = arg2.method30();
                this.field590 = arg2.method30();
            } else if (var4 == 10) {
                this.field587 = arg2.method37();
            } else if (var4 == 2) {
                this.field591 = true;
            } else if (var4 == 3) {
                this.field592 = arg2.method35();
            } else if (var4 == 4) {
                this.field593 = arg2.method35();
            } else if (var4 == 5) {
                this.field594 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
