import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!EHPXVLSO")
public class class13 {

    @OriginalMember(owner = "client!EHPXVLSO", name = "g", descriptor = "Z")
    public boolean field702 = false;

    @OriginalMember(owner = "client!EHPXVLSO", name = "h", descriptor = "I")
    public int field703 = -1;

    @OriginalMember(owner = "client!EHPXVLSO", name = "j", descriptor = "Z")
    public boolean field705 = true;

    @OriginalMember(owner = "client!EHPXVLSO", name = "a", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!EHPXVLSO", name = "d", descriptor = "I")
    public int field699;

    @OriginalMember(owner = "client!EHPXVLSO", name = "e", descriptor = "I")
    public int field700;

    @OriginalMember(owner = "client!EHPXVLSO", name = "f", descriptor = "I")
    public int field701;

    @OriginalMember(owner = "client!EHPXVLSO", name = "i", descriptor = "I")
    public int field704;

    @OriginalMember(owner = "client!EHPXVLSO", name = "c", descriptor = "Ljava/lang/String;")
    public String field698;

    @OriginalMember(owner = "client!EHPXVLSO", name = "b", descriptor = "[LEHPXVLSO;")
    public static class13[] field697;

    @OriginalMember(owner = "client!EHPXVLSO", name = "a", descriptor = "(LAWEEREDT;I)V")
    public static void method211(class2 arg0, int arg1) {
        class25 var2 = new class25(arg0.method14("varbit.dat", null), 713);
        if (arg1 != 0) {
            return;
        }
        field696 = var2.method247();
        if (field697 == null) {
            field697 = new class13[field696];
        }
        for (int var3 = 0; var3 < field696; var3++) {
            if (field697[var3] == null) {
                field697[var3] = new class13();
            }
            field697[var3].method212(var2, var3, -224);
            if (field697[var3].field702) {
                class58.field1541[field697[var3].field699].field1553 = true;
            }
        }
        if (var2.field836.length != var2.field837) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "client!EHPXVLSO", name = "a", descriptor = "(LIUVBENCV;II)V")
    public void method212(class25 arg0, int arg1, int arg2) {
        if (arg2 >= 0) {
            return;
        }
        while (true) {
            int var4 = arg0.method245();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field699 = arg0.method247();
                this.field700 = arg0.method245();
                this.field701 = arg0.method245();
            } else if (var4 == 10) {
                this.field698 = arg0.method252();
            } else if (var4 == 2) {
                this.field702 = true;
            } else if (var4 == 3) {
                this.field703 = arg0.method250();
            } else if (var4 == 4) {
                this.field704 = arg0.method250();
            } else if (var4 == 5) {
                this.field705 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
