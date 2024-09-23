import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ZWNTUTST")
public class class70 {

    @OriginalMember(owner = "ZWNTUTST", name = "h", descriptor = "Z")
    public boolean field1725 = false;

    @OriginalMember(owner = "ZWNTUTST", name = "i", descriptor = "Z")
    public boolean field1726 = true;

    @OriginalMember(owner = "ZWNTUTST", name = "k", descriptor = "Z")
    public boolean field1728 = false;

    @OriginalMember(owner = "ZWNTUTST", name = "n", descriptor = "Z")
    public boolean field1731 = false;

    @OriginalMember(owner = "ZWNTUTST", name = "o", descriptor = "I")
    public int field1732 = -1;

    @OriginalMember(owner = "ZWNTUTST", name = "p", descriptor = "Z")
    public boolean field1733 = true;

    @OriginalMember(owner = "ZWNTUTST", name = "a", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "ZWNTUTST", name = "c", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "ZWNTUTST", name = "f", descriptor = "I")
    public int field1723;

    @OriginalMember(owner = "ZWNTUTST", name = "g", descriptor = "I")
    public int field1724;

    @OriginalMember(owner = "ZWNTUTST", name = "j", descriptor = "I")
    public int field1727;

    @OriginalMember(owner = "ZWNTUTST", name = "l", descriptor = "I")
    public int field1729;

    @OriginalMember(owner = "ZWNTUTST", name = "m", descriptor = "I")
    public int field1730;

    @OriginalMember(owner = "ZWNTUTST", name = "e", descriptor = "Ljava/lang/String;")
    public String field1722;

    @OriginalMember(owner = "ZWNTUTST", name = "d", descriptor = "[I")
    public static int[] field1721;

    @OriginalMember(owner = "ZWNTUTST", name = "b", descriptor = "[LZWNTUTST;")
    public static class70[] field1719;

    @OriginalMember(owner = "ZWNTUTST", name = "a", descriptor = "(ILQDHHNYHL;)V")
    public static void method597(int arg0, class44 arg1) {
        class42 var2 = new class42(5, arg1.method488("varp.dat", null));
        field1720 = 0;
        field1718 = var2.method422();
        if (field1719 == null) {
            field1719 = new class70[field1718];
        }
        if (field1721 == null) {
            field1721 = new int[field1718];
        }
        for (int var3 = 0; var3 < field1718; var3++) {
            if (field1719[var3] == null) {
                field1719[var3] = new class70();
            }
            field1719[var3].method598((byte) 8, var2, var3);
        }
        if (arg0 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (var2.field1249.length != var2.field1250) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "ZWNTUTST", name = "a", descriptor = "(BLPGNBHFUF;I)V")
    public void method598(byte arg0, class42 arg1, int arg2) {
        if (arg0 != 8) {
            return;
        }
        while (true) {
            int var4 = arg1.method420();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1723 = arg1.method420();
            } else if (var4 == 2) {
                this.field1724 = arg1.method420();
            } else if (var4 == 3) {
                this.field1725 = true;
                field1721[field1720++] = arg2;
            } else if (var4 == 4) {
                this.field1726 = false;
            } else if (var4 == 5) {
                this.field1727 = arg1.method422();
            } else if (var4 == 6) {
                this.field1728 = true;
            } else if (var4 == 7) {
                this.field1729 = arg1.method425();
            } else if (var4 == 8) {
                this.field1730 = 1;
                this.field1731 = true;
            } else if (var4 == 10) {
                this.field1722 = arg1.method427();
            } else if (var4 == 11) {
                this.field1731 = true;
            } else if (var4 == 12) {
                this.field1732 = arg1.method425();
            } else if (var4 == 13) {
                this.field1730 = 2;
                this.field1731 = true;
            } else if (var4 == 14) {
                this.field1733 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
