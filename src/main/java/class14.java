import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EEUUOAGX")
public class class14 {

    @OriginalMember(owner = "EEUUOAGX", name = "k", descriptor = "Z")
    public boolean field684 = false;

    @OriginalMember(owner = "EEUUOAGX", name = "l", descriptor = "Z")
    public boolean field685 = true;

    @OriginalMember(owner = "EEUUOAGX", name = "n", descriptor = "Z")
    public boolean field687 = false;

    @OriginalMember(owner = "EEUUOAGX", name = "q", descriptor = "Z")
    public boolean field690 = false;

    @OriginalMember(owner = "EEUUOAGX", name = "r", descriptor = "I")
    public int field691 = -1;

    @OriginalMember(owner = "EEUUOAGX", name = "a", descriptor = "I")
    private static int field674;

    @OriginalMember(owner = "EEUUOAGX", name = "d", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "EEUUOAGX", name = "f", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "EEUUOAGX", name = "i", descriptor = "I")
    public int field682;

    @OriginalMember(owner = "EEUUOAGX", name = "j", descriptor = "I")
    public int field683;

    @OriginalMember(owner = "EEUUOAGX", name = "m", descriptor = "I")
    public int field686;

    @OriginalMember(owner = "EEUUOAGX", name = "o", descriptor = "I")
    public int field688;

    @OriginalMember(owner = "EEUUOAGX", name = "p", descriptor = "I")
    public int field689;

    @OriginalMember(owner = "EEUUOAGX", name = "h", descriptor = "Ljava/lang/String;")
    public String field681;

    @OriginalMember(owner = "EEUUOAGX", name = "b", descriptor = "Z")
    private static boolean field675;

    @OriginalMember(owner = "EEUUOAGX", name = "c", descriptor = "Z")
    private static boolean field676;

    @OriginalMember(owner = "EEUUOAGX", name = "g", descriptor = "[I")
    public static int[] field680;

    @OriginalMember(owner = "EEUUOAGX", name = "e", descriptor = "[LEEUUOAGX;")
    public static class14[] field678;

    @OriginalMember(owner = "EEUUOAGX", name = "a", descriptor = "(ILSPZBTZXL;)V")
    public static void method233(int arg0, class51 arg1) {
        class34 var2 = new class34(arg1.method515("varp.dat", null), field674);
        field679 = 0;
        field677 = var2.method404();
        if (field678 == null) {
            field678 = new class14[field677];
        }
        if (field680 == null) {
            field680 = new int[field677];
        }
        for (int var3 = 0; var3 < field677; var3++) {
            if (field678[var3] == null) {
                field678[var3] = new class14();
            }
            field678[var3].method234(field676, var2, var3);
        }
        if (arg0 <= 0) {
            field675 = !field675;
        }
        if (var2.field1072.length != var2.field1073) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "EEUUOAGX", name = "a", descriptor = "(ZLLDILQFVA;I)V")
    public void method234(boolean arg0, class34 arg1, int arg2) {
        if (arg0) {
            return;
        }
        while (true) {
            int var4 = arg1.method402();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field682 = arg1.method402();
            } else if (var4 == 2) {
                this.field683 = arg1.method402();
            } else if (var4 == 3) {
                this.field684 = true;
                field680[field679++] = arg2;
            } else if (var4 == 4) {
                this.field685 = false;
            } else if (var4 == 5) {
                this.field686 = arg1.method404();
            } else if (var4 == 6) {
                this.field687 = true;
            } else if (var4 == 7) {
                this.field688 = arg1.method407();
            } else if (var4 == 8) {
                this.field689 = 1;
                this.field690 = true;
            } else if (var4 == 10) {
                this.field681 = arg1.method409();
            } else if (var4 == 11) {
                this.field690 = true;
            } else if (var4 == 12) {
                this.field691 = arg1.method407();
            } else if (var4 == 13) {
                this.field689 = 2;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
