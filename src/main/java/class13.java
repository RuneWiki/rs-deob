import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!EFEPEUMF")
public class class13 {

    @OriginalMember(owner = "client!EFEPEUMF", name = "h", descriptor = "Z")
    public boolean field689 = false;

    @OriginalMember(owner = "client!EFEPEUMF", name = "i", descriptor = "I")
    public int field690 = -1;

    @OriginalMember(owner = "client!EFEPEUMF", name = "k", descriptor = "Z")
    public boolean field692 = true;

    @OriginalMember(owner = "client!EFEPEUMF", name = "b", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!EFEPEUMF", name = "e", descriptor = "I")
    public int field686;

    @OriginalMember(owner = "client!EFEPEUMF", name = "f", descriptor = "I")
    public int field687;

    @OriginalMember(owner = "client!EFEPEUMF", name = "g", descriptor = "I")
    public int field688;

    @OriginalMember(owner = "client!EFEPEUMF", name = "j", descriptor = "I")
    public int field691;

    @OriginalMember(owner = "client!EFEPEUMF", name = "d", descriptor = "Ljava/lang/String;")
    public String field685;

    @OriginalMember(owner = "client!EFEPEUMF", name = "a", descriptor = "Z")
    private static boolean field682;

    @OriginalMember(owner = "client!EFEPEUMF", name = "c", descriptor = "[LEFEPEUMF;")
    public static class13[] field684;

    @OriginalMember(owner = "client!EFEPEUMF", name = "a", descriptor = "(ILMAARFNGV;)V")
    public static void method203(int arg0, class29 arg1) {
        class14 var2 = new class14(arg1.method332("varbit.dat", null), true);
        if (arg0 != 0) {
            field682 = !field682;
        }
        field683 = var2.method219();
        if (field684 == null) {
            field684 = new class13[field683];
        }
        for (int var3 = 0; var3 < field683; var3++) {
            if (field684[var3] == null) {
                field684[var3] = new class13();
            }
            field684[var3].method204(false, var2, var3);
            if (field684[var3].field689) {
                class20.field838[field684[var3].field686].field850 = true;
            }
        }
        if (var2.field706.length != var2.field707) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "client!EFEPEUMF", name = "a", descriptor = "(ZLEMWAMCXW;I)V")
    public void method204(boolean arg0, class14 arg1, int arg2) {
        if (arg0) {
            return;
        }
        while (true) {
            int var4 = arg1.method217();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field686 = arg1.method219();
                this.field687 = arg1.method217();
                this.field688 = arg1.method217();
            } else if (var4 == 10) {
                this.field685 = arg1.method224();
            } else if (var4 == 2) {
                this.field689 = true;
            } else if (var4 == 3) {
                this.field690 = arg1.method222();
            } else if (var4 == 4) {
                this.field691 = arg1.method222();
            } else if (var4 == 5) {
                this.field692 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
