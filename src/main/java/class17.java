import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!FZDJIIMM")
public class class17 {

    @OriginalMember(owner = "client!FZDJIIMM", name = "b", descriptor = "Z")
    private boolean field711 = false;

    @OriginalMember(owner = "client!FZDJIIMM", name = "j", descriptor = "Z")
    public boolean field719 = false;

    @OriginalMember(owner = "client!FZDJIIMM", name = "k", descriptor = "Z")
    public boolean field720 = true;

    @OriginalMember(owner = "client!FZDJIIMM", name = "m", descriptor = "Z")
    public boolean field722 = false;

    @OriginalMember(owner = "client!FZDJIIMM", name = "p", descriptor = "Z")
    public boolean field725 = false;

    @OriginalMember(owner = "client!FZDJIIMM", name = "q", descriptor = "I")
    public int field726 = -1;

    @OriginalMember(owner = "client!FZDJIIMM", name = "r", descriptor = "Z")
    public boolean field727 = true;

    @OriginalMember(owner = "client!FZDJIIMM", name = "a", descriptor = "I")
    private static int field710 = 440;

    @OriginalMember(owner = "client!FZDJIIMM", name = "c", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!FZDJIIMM", name = "e", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!FZDJIIMM", name = "h", descriptor = "I")
    public int field717;

    @OriginalMember(owner = "client!FZDJIIMM", name = "i", descriptor = "I")
    public int field718;

    @OriginalMember(owner = "client!FZDJIIMM", name = "l", descriptor = "I")
    public int field721;

    @OriginalMember(owner = "client!FZDJIIMM", name = "n", descriptor = "I")
    public int field723;

    @OriginalMember(owner = "client!FZDJIIMM", name = "o", descriptor = "I")
    public int field724;

    @OriginalMember(owner = "client!FZDJIIMM", name = "g", descriptor = "Ljava/lang/String;")
    public String field716;

    @OriginalMember(owner = "client!FZDJIIMM", name = "f", descriptor = "[I")
    public static int[] field715;

    @OriginalMember(owner = "client!FZDJIIMM", name = "d", descriptor = "[LFZDJIIMM;")
    public static class17[] field713;

    @OriginalMember(owner = "client!FZDJIIMM", name = "a", descriptor = "(LRSPRYUFS;I)V")
    public static void method205(class49 arg0, int arg1) {
        while (arg1 >= 0) {
            field710 = 230;
        }
        class36 var2 = new class36(-587, arg0.method427("varp.dat", null));
        field714 = 0;
        field712 = var2.method341();
        if (field713 == null) {
            field713 = new class17[field712];
        }
        if (field715 == null) {
            field715 = new int[field712];
        }
        for (int var3 = 0; var3 < field712; var3++) {
            if (field713[var3] == null) {
                field713[var3] = new class17();
            }
            field713[var3].method206(var2, 29883, var3);
        }
        if (var2.field1071.length != var2.field1072) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "client!FZDJIIMM", name = "a", descriptor = "(LNQUAUMDT;II)V")
    public void method206(class36 arg0, int arg1, int arg2) {
        if (arg1 != 29883) {
            this.field711 = !this.field711;
        }
        while (true) {
            int var4 = arg0.method339();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field717 = arg0.method339();
            } else if (var4 == 2) {
                this.field718 = arg0.method339();
            } else if (var4 == 3) {
                this.field719 = true;
                field715[field714++] = arg2;
            } else if (var4 == 4) {
                this.field720 = false;
            } else if (var4 == 5) {
                this.field721 = arg0.method341();
            } else if (var4 == 6) {
                this.field722 = true;
            } else if (var4 == 7) {
                this.field723 = arg0.method344();
            } else if (var4 == 8) {
                this.field724 = 1;
                this.field725 = true;
            } else if (var4 == 10) {
                this.field716 = arg0.method346();
            } else if (var4 == 11) {
                this.field725 = true;
            } else if (var4 == 12) {
                this.field726 = arg0.method344();
            } else if (var4 == 13) {
                this.field724 = 2;
                this.field725 = true;
            } else if (var4 == 14) {
                this.field727 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
