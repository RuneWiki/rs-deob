import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class208 {

    @OriginalMember(owner = "client!t", name = "d", descriptor = "[I")
    private int[] field3728;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "Lkh;")
    private static class117 field3727 = class224.method1450((byte) -31, "Try again in 60 secs)3)3)3");

    @OriginalMember(owner = "client!t", name = "b", descriptor = "Lkh;")
    public static class117 field3726 = field3727;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "Lkh;")
    public static class117 field3734 = class224.method1450((byte) -128, "::gc");

    @OriginalMember(owner = "client!t", name = "h", descriptor = "Lkh;")
    public static class117 field3732 = class224.method1450((byte) 109, "<col=ffb000>");

    @OriginalMember(owner = "client!t", name = "f", descriptor = "[I")
    public static int[] field3730 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };

    @OriginalMember(owner = "client!t", name = "i", descriptor = "Lkh;")
    private static class117 field3733 = class224.method1450((byte) -98, "Cancel");

    @OriginalMember(owner = "client!t", name = "e", descriptor = "Lkh;")
    public static class117 field3729 = class224.method1450((byte) -58, "Die Adresse dieses Computers wurde gesperrt)1");

    @OriginalMember(owner = "client!t", name = "m", descriptor = "Lkh;")
    public static class117 field3737 = field3733;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "Lkh;")
    public static class117 field3736 = class224.method1450((byte) -41, "M");

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "[[[B")
    public static byte[][][] field3738;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IZ)I")
    public final int method1367(int arg0, boolean arg1) {
        field3725++;
        if (!arg1) {
            method1368(66);
        }
        int var3 = (this.field3728.length >> 1) - 1;
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field3728[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field3728[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "([I)V")
    public class208(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field3728 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field3728[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field3728[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field3728[var5 + var5] = arg0[var4];
            this.field3728[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public static void method1368(int arg0) {
        field3734 = null;
        field3729 = null;
        field3732 = null;
        field3727 = null;
        if (arg0 > -118) {
            field3738 = null;
        }
        field3730 = null;
        field3736 = null;
        field3738 = null;
        field3737 = null;
        field3726 = null;
        field3733 = null;
    }
}
