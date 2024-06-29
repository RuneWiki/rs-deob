import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class162 extends class200 {

    @OriginalMember(owner = "client!pa", name = "bb", descriptor = "I")
    private int field2810 = -1;

    @OriginalMember(owner = "client!pa", name = "P", descriptor = "I")
    private int field2798 = 0;

    @OriginalMember(owner = "client!pa", name = "M", descriptor = "I")
    public static int field2795 = -2;

    @OriginalMember(owner = "client!pa", name = "W", descriptor = "Ldj;")
    public static class44 field2805 = class89.method650(255, ")1p");

    @OriginalMember(owner = "client!pa", name = "O", descriptor = "Ldj;")
    public static class44 field2797 = class89.method650(255, "overlay)3dat");

    @OriginalMember(owner = "client!pa", name = "K", descriptor = "I")
    public int field2794;

    @OriginalMember(owner = "client!pa", name = "N", descriptor = "I")
    public int field2796;

    @OriginalMember(owner = "client!pa", name = "Q", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!pa", name = "R", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!pa", name = "S", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!pa", name = "U", descriptor = "I")
    public int field2803;

    @OriginalMember(owner = "client!pa", name = "V", descriptor = "I")
    public int field2804;

    @OriginalMember(owner = "client!pa", name = "X", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!pa", name = "Y", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!pa", name = "Z", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!pa", name = "T", descriptor = "[[S")
    public static short[][] field2802;

    @OriginalMember(owner = "client!pa", name = "ab", descriptor = "[[Z")
    public static boolean[][] field2809;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lfj;II)V")
    public final void method1044(class66 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method506(255);
            if (var4 == 0) {
                field2801++;
                int var5 = -10 / ((arg1 + 44) / 43);
                return;
            }
            this.method1045(arg2, 255, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIILfj;)V")
    private final void method1045(int arg0, int arg1, int arg2, class66 arg3) {
        field2799++;
        if (arg2 == 1) {
            this.field2798 = arg3.method480(107);
            this.method1046(arg1 - 158, this.field2798);
        } else if (arg2 == 2) {
            this.field2810 = arg3.method500(arg1 - 133);
            if (this.field2810 == 65535) {
                this.field2810 = -1;
            }
        } else if (arg2 == 3) {
            arg3.method500(44);
        }
        if (arg1 != 255) {
            this.field2804 = 49;
        }
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(II)V")
    private final void method1046(int arg0, int arg1) {
        field2807++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (arg0 <= 26) {
            this.method1044(null, -96, -108);
        }
        if (var5 < var3) {
            var9 = var5;
        }
        double var11 = 0.0D;
        double var13 = 0.0D;
        if (var9 > var7) {
            var9 = var7;
        }
        double var15 = var3;
        if (var3 < var5) {
            var15 = var5;
        }
        if (var7 > var15) {
            var15 = var7;
        }
        double var17 = (var9 + var15) / 2.0D;
        if (var9 != var15) {
            if (var17 < 0.5D) {
                var13 = (var15 - var9) / (var9 + var15);
            }
            if (var3 == var15) {
                var11 = (var5 - var7) / (var15 - var9);
            } else if (var5 == var15) {
                var11 = (var7 - var3) / (var15 - var9) + 2.0D;
            } else if (var7 == var15) {
                var11 = (var3 - var5) / (-var9 + var15) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var13 = (var15 - var9) / (2.0D - var15 - var9);
            }
        }
        this.field2794 = (int) (var17 * 256.0D);
        if (this.field2794 < 0) {
            this.field2794 = 0;
        } else if (this.field2794 > 255) {
            this.field2794 = 255;
        }
        if (var17 > 0.5D) {
            this.field2804 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field2804 = (int) (var13 * var17 * 512.0D);
        }
        double var19 = var11 / 6.0D;
        this.field2803 = (int) (var13 * 256.0D);
        if (this.field2803 < 0) {
            this.field2803 = 0;
        } else if (this.field2803 > 255) {
            this.field2803 = 255;
        }
        if (this.field2804 < 1) {
            this.field2804 = 1;
        }
        this.field2796 = (int) ((double) this.field2804 * var19);
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(B)V")
    public static void method1047(byte arg0) {
        field2805 = null;
        field2802 = null;
        if (arg0 <= 94) {
            field2809 = null;
        }
        field2797 = null;
        field2809 = null;
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "(II)Z")
    public static final boolean method1048(int arg0, int arg1) {
        if (arg1 != 1) {
            method1049(93, -55);
        }
        field2800++;
        return (arg0 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "(II)I")
    public static final int method1049(int arg0, int arg1) {
        field2808++;
        if (arg1 <= 77) {
            method1047((byte) 121);
        }
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(B)V")
    public static final void method1050(byte arg0) {
        class236.method1538(false);
        class133.method904(true);
        class4.method27(9385);
        field2806++;
        class57.method430(true);
        class191.method1199(-92);
        class190.method1196(-107);
        class46.method348(930751783);
        class115.method806(16020);
        class143.method948((byte) -127);
        class207.method1349(true);
        class123.method849(-1111898163);
        class151.method980(23517);
        ((class74) class206.field3689).method580((byte) 60);
        if (arg0 >= -11) {
            method1049(-54, 102);
        }
        class1.field7.method1179((byte) -88);
        class21.field359.method1479((byte) -95);
        class108.field1993.method1479((byte) -95);
        class201.field3555.method1479((byte) -95);
        class62.field1159.method1479((byte) -95);
        class208.field3736.method1479((byte) -95);
        class211.field3797.method1479((byte) -95);
        class81.field1571.method1479((byte) -95);
        class48.field902.method1479((byte) -95);
        class112.field2021.method1479((byte) -95);
        class102.field1856.method1479((byte) -95);
        class61.field1138.method1479((byte) -95);
    }
}
