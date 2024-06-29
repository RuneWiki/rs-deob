import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class136 extends class440 {

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "I")
    private int field1990 = 20;

    @OriginalMember(owner = "client!vf", name = "D", descriptor = "I")
    private int field1987 = 1365;

    @OriginalMember(owner = "client!vf", name = "L", descriptor = "I")
    private int field1995 = 0;

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "I")
    private int field1991 = 0;

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "Lnea;")
    public static class664 field1988 = new class664(84, 4);

    @OriginalMember(owner = "client!vf", name = "N", descriptor = "I")
    public static int field1997 = 0;

    @OriginalMember(owner = "client!vf", name = "C", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!vf", name = "J", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!vf", name = "M", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!vf", name = "K", descriptor = "Lmn;")
    public static class333 field1994;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "(I)V", line = 3)
    public static final void method987(int arg0) {
        int var1 = -62 % ((1 - arg0) / 44);
        class228.field3243 = null;
        class261.field3973 = null;
        ++field1986;
        class699.field9885 = false;
        class683.field9625 = null;
        class411.field5991 = null;
        class17.field184 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BI)[I", line = 19)
    public final int[] method229(byte arg0, int arg1) {
        ++field1989;
        int[] var3 = super.field6412.method3250((byte) 5, arg1);
        int var4 = -119 % ((arg0 - -56) / 41);
        if (super.field6412.field8047) {
            for (int var5 = 0; ~class549.field7715 < ~var5; ++var5) {
                int var6 = (class499.field7073[var5] << 12) / this.field1987 - -this.field1991;
                int var7 = (class418.field6099[arg1] << 12) / this.field1987 + this.field1995;
                int var8 = var6;
                int var9 = var7;
                int var10 = var6;
                int var11 = var7;
                int var12 = var6 * var6 >> 12;
                int var13 = var7 * var7 >> 12;
                int var14 = 0;
                while (var12 + var13 < 16384 && ~var14 > ~this.field1990) {
                    var11 = (var10 * var11 >> 12) * 2 - -var9;
                    var10 = -var13 + var12 - -var8;
                    var13 = var11 * var11 >> 12;
                    ++var14;
                    var12 = var10 * var10 >> 12;
                }
                var3[var5] = ~var14 > ~(this.field1990 + -1) ? (var14 << 12) / this.field1990 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lr;I)V", line = 83)
    public static final void method988(class166 arg0, int arg1) {
        arg0.method168(0, 0, class487.field6930, 350);
        ++field1993;
        arg0.method114(0, 0, class487.field6930, 350, 3351159 | class486.field6919 << 24, 1);
        int var2 = 350 / class588.field8242;
        if (class466.field6706 > 0) {
            int var3 = 346 - (class588.field8242 + 4);
            int var4 = var2 * var3 / (var2 - -class466.field6706 + -1);
            int var5 = 4;
            if (~class466.field6706 < -2) {
                var5 += (class466.field6706 + -1 + -class619.field8629) * (-var4 + var3) / (class466.field6706 + -1);
            }
            arg0.method114(class487.field6930 + -16, var5, 12, var4, class486.field6919 << 24 | 3351159, 2);
            for (int var6 = class619.field8629; ~(class619.field8629 - -var2) < ~var6 && ~var6 > ~class466.field6706; ++var6) {
                String[] var7 = class208.method1377('\b', (byte) -118, class520.field7335[var6]);
                int var8 = (class487.field6930 + -16 - 8) / var7.length;
                for (int var9 = 0; ~var9 > ~var7.length; ++var9) {
                    int var10 = 8 - -(var8 * var9);
                    arg0.method168(var10, 0, var8 + -8 + var10, 350);
                    class563.field7931.method2492(-1, class585.method3318(var7[var9], 25005), var10, -16777216, (byte) -107, -((-class619.field8629 + var6) * class588.field8242) + -class244.field3796.field2132 + -class2.field17 + 348);
                }
            }
        }
        class351.field5064.method2507(330, "Build: 618", -16777216, class487.field6930 + -25, -111, -1);
        arg0.method168(0, 0, class487.field6930, 350);
        if (arg1 > -104) {
            field1994 = null;
        }
        arg0.method1147(-28854, -class2.field17 + 350, -1, 0, class487.field6930);
        class26.field391.method2492(-1, "--> " + class585.method3318(class436.field6383, 25005), 10, -16777216, (byte) -124, -class467.field6721.field2132 + 349);
        if (class67.field1229) {
            int var11 = -1;
            if (class564.field7962 % 30 > 15) {
                var11 = 16777215;
            }
            arg0.method1155(12, 8, 10 + class467.field6721.method1039(0, "--> " + class585.method3318(class436.field6383, 25005).substring(0, class689.field9706)), 339 - class467.field6721.field2132, var11);
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V", line = 204)
    public class136() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "(I)V", line = 156)
    public static void method989(int arg0) {
        field1994 = null;
        int var1 = -43 / ((arg0 - -66) / 54);
        field1988 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lr;B)V", line = 167)
    public static final void method990(class166 arg0, byte arg1) {
        ++field1992;
        class185.field2592 = new class355[class254.field3898.length];
        int var2 = 0;
        int var3 = -71 % ((-42 - arg1) / 35);
        while (class254.field3898.length > var2) {
            int var4 = class254.field3898[var2];
            class146 var5 = class412.method2482(29, class558.field7879, var4);
            class416 var6 = arg0.method128(var5, class113.method880(class141.field2086, var4), true);
            class185.field2592[var2] = new class355(var6, var5);
            ++var2;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILmo;I)V", line = 207)
    public final void method234(int arg0, class695 arg1, int arg2) {
        ++field1996;
        if (arg0 != 5) {
            method987(-29);
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 == -4) {
                        this.field1995 = arg1.method3847((byte) 118);
                    }
                } else {
                    this.field1991 = arg1.method3847((byte) 118);
                }
            } else {
                this.field1990 = arg1.method3847((byte) 118);
            }
        } else {
            this.field1987 = arg1.method3847((byte) 118);
        }
    }
}
