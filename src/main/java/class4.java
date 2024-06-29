import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class4 extends class214 {

    @OriginalMember(owner = "client!ff", name = "nb", descriptor = "Lce;")
    private static class126 field21 = class206.method1445(-7923, "slide:");

    @OriginalMember(owner = "client!ff", name = "mb", descriptor = "Lce;")
    public static class126 field20 = field21;

    @OriginalMember(owner = "client!ff", name = "xb", descriptor = "Z")
    public static boolean field31 = false;

    @OriginalMember(owner = "client!ff", name = "tb", descriptor = "Lce;")
    public static class126 field27 = class206.method1445(-7923, "(R");

    @OriginalMember(owner = "client!ff", name = "vb", descriptor = "Lce;")
    public static class126 field29 = class206.method1445(-7923, "<br>");

    @OriginalMember(owner = "client!ff", name = "ob", descriptor = "Lce;")
    public static class126 field22 = field21;

    @OriginalMember(owner = "client!ff", name = "rb", descriptor = "I")
    public static int field25 = 0;

    @OriginalMember(owner = "client!ff", name = "lb", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!ff", name = "pb", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!ff", name = "sb", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!ff", name = "wb", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!ff", name = "zb", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!ff", name = "ub", descriptor = "Lcc;")
    public static class313 field28;

    @OriginalMember(owner = "client!ff", name = "qb", descriptor = "Ld;")
    public static class60 field24;

    @OriginalMember(owner = "client!ff", name = "yb", descriptor = "[I")
    public static int[] field32;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIII)I", line = 16)
    public static final int method24(int arg0, int arg1, int arg2, int arg3) {
        field33++;
        int var4 = arg3 & 0x3;
        if (arg0 > -62) {
            field32 = (int[]) null;
        }
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "(B)V", line = 62)
    public static void method25(byte arg0) {
        field21 = null;
        field24 = null;
        field32 = null;
        field20 = null;
        field29 = null;
        int var1 = 78 / ((arg0 + 25) / 55);
        field27 = null;
        field22 = null;
        field28 = null;
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(II)[[I", line = 83)
    public final int[][] method26(int arg0, int arg1) {
        if (arg0 != 0) {
            field24 = (class60) null;
        }
        field26++;
        int[][] var3 = this.field2775.method319(86, arg1);
        if (this.field2775.field775 && this.method1484(-8)) {
            int[] var4 = var3[0];
            int var5 = arg1 % this.field3638 * this.field3638;
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class244.field4133; var8++) {
                int var9 = this.field3647[var8 % this.field3633 + var5];
                var7[var8] = class47.method289(4080, var9 << 4);
                var6[var8] = class47.method289(4080, var9 >> 4);
                var4[var8] = class47.method289(16711680, var9) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ID)V", line = 126)
    public static final void method27(int arg0, double arg1) {
        if (arg0 < 124) {
            field22 = (class126) null;
        }
        if (class50.field762 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class238.field4017[var3] = var4 <= 255 ? var4 : 255;
            }
            class50.field762 = arg1;
        }
        field30++;
    }

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "(B)V", line = 183)
    public static final void method28(byte arg0) {
        field23++;
        class78.field1274.method1185(1);
        class297.field4938.method1185(1);
        class78.field1275.method1185(1);
        class291.field4819.method1185(1);
        int var1 = -41 / ((arg0 - 30) / 60);
    }
}
