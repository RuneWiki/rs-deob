import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!IFGHRSOU")
public class class21 {

    @OriginalMember(owner = "client!IFGHRSOU", name = "h", descriptor = "Z")
    public boolean field719 = false;

    @OriginalMember(owner = "client!IFGHRSOU", name = "i", descriptor = "Z")
    public boolean field720 = true;

    @OriginalMember(owner = "client!IFGHRSOU", name = "k", descriptor = "Z")
    public boolean field722 = false;

    @OriginalMember(owner = "client!IFGHRSOU", name = "n", descriptor = "Z")
    public boolean field725 = false;

    @OriginalMember(owner = "client!IFGHRSOU", name = "o", descriptor = "I")
    public int field726 = -1;

    @OriginalMember(owner = "client!IFGHRSOU", name = "p", descriptor = "Z")
    public boolean field727 = true;

    @OriginalMember(owner = "client!IFGHRSOU", name = "a", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!IFGHRSOU", name = "c", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!IFGHRSOU", name = "f", descriptor = "I")
    public int field717;

    @OriginalMember(owner = "client!IFGHRSOU", name = "g", descriptor = "I")
    public int field718;

    @OriginalMember(owner = "client!IFGHRSOU", name = "j", descriptor = "I")
    public int field721;

    @OriginalMember(owner = "client!IFGHRSOU", name = "l", descriptor = "I")
    public int field723;

    @OriginalMember(owner = "client!IFGHRSOU", name = "m", descriptor = "I")
    public int field724;

    @OriginalMember(owner = "client!IFGHRSOU", name = "e", descriptor = "Ljava/lang/String;")
    public String field716;

    @OriginalMember(owner = "client!IFGHRSOU", name = "d", descriptor = "[I")
    public static int[] field715;

    @OriginalMember(owner = "client!IFGHRSOU", name = "b", descriptor = "[LIFGHRSOU;")
    public static class21[] field713;

    @OriginalMember(owner = "client!IFGHRSOU", name = "a", descriptor = "(ZLAKPFVPPG;)V")
    public static void method297(boolean arg0, class2 arg1) {
        if (!arg0) {
            return;
        }
        class13 var2 = new class13(arg1.method7("varp.dat", null), (byte) 3);
        field714 = 0;
        field712 = var2.method215();
        if (field713 == null) {
            field713 = new class21[field712];
        }
        if (field715 == null) {
            field715 = new int[field712];
        }
        for (int var3 = 0; var3 < field712; var3++) {
            if (field713[var3] == null) {
                field713[var3] = new class21();
            }
            field713[var3].method298(var3, var2, -5817);
        }
        if (var2.field642.length != var2.field643) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "client!IFGHRSOU", name = "a", descriptor = "(ILFTMSICIZ;I)V")
    public void method298(int arg0, class13 arg1, int arg2) {
        if (arg2 != -5817) {
            return;
        }
        while (true) {
            int var4 = arg1.method213();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field717 = arg1.method213();
            } else if (var4 == 2) {
                this.field718 = arg1.method213();
            } else if (var4 == 3) {
                this.field719 = true;
                field715[field714++] = arg0;
            } else if (var4 == 4) {
                this.field720 = false;
            } else if (var4 == 5) {
                this.field721 = arg1.method215();
            } else if (var4 == 6) {
                this.field722 = true;
            } else if (var4 == 7) {
                this.field723 = arg1.method218();
            } else if (var4 == 8) {
                this.field724 = 1;
                this.field725 = true;
            } else if (var4 == 10) {
                this.field716 = arg1.method220();
            } else if (var4 == 11) {
                this.field725 = true;
            } else if (var4 == 12) {
                this.field726 = arg1.method218();
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
