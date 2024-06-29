import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class449 extends class56 {

    @OriginalMember(owner = "client!qt", name = "z", descriptor = "[I")
    private int[] field6694 = new int[this.field868];

    @OriginalMember(owner = "client!qt", name = "v", descriptor = "I")
    public static int field6690 = -60;

    @OriginalMember(owner = "client!qt", name = "t", descriptor = "I")
    public static int field6688 = 0;

    @OriginalMember(owner = "client!qt", name = "B", descriptor = "Lgo;")
    public static class441 field6695 = new class441(0, 2, 2, 1);

    @OriginalMember(owner = "client!qt", name = "p", descriptor = "I")
    public static int field6684;

    @OriginalMember(owner = "client!qt", name = "r", descriptor = "I")
    private int field6686;

    @OriginalMember(owner = "client!qt", name = "s", descriptor = "I")
    public static int field6687;

    @OriginalMember(owner = "client!qt", name = "u", descriptor = "I")
    public static int field6689;

    @OriginalMember(owner = "client!qt", name = "x", descriptor = "I")
    public static int field6692;

    @OriginalMember(owner = "client!qt", name = "y", descriptor = "I")
    public static int field6693;

    @OriginalMember(owner = "client!qt", name = "D", descriptor = "I")
    private int field6696;

    @OriginalMember(owner = "client!qt", name = "F", descriptor = "I")
    public static int field6697;

    @OriginalMember(owner = "client!qt", name = "q", descriptor = "Liv;")
    public static class64 field6685;

    @OriginalMember(owner = "client!qt", name = "w", descriptor = "[B")
    private byte[] field6691;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V", line = 4)
    public final void method338(int arg0) {
        this.field6686 = Math.abs(this.field6686);
        ++field6684;
        if (arg0 >= -6) {
            method2714(-48, (byte) -52);
        }
        if (~this.field6686 <= -4097) {
            this.field6686 = 4095;
        }
        this.method1854((byte) -52, this.field6696++, (byte) (this.field6686 >> 4));
        this.field6686 = 0;
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(IIIIIF)V", line = 20)
    public class449(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~var7 > ~super.field868; ++var7) {
            this.field6694[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIB)V", line = 41)
    public final void method340(int arg0, int arg1, byte arg2) {
        ++field6692;
        if (arg2 != 47) {
            this.field6691 = null;
        }
        this.field6686 += this.field6694[arg0] * arg1 >> 12;
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(B)V", line = 55)
    public final void method344(byte arg0) {
        ++field6697;
        int var2 = -74 % ((arg0 - -77) / 46);
        this.field6696 = 0;
        this.field6686 = 0;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I[B)Lmo;", line = 75)
    public static final class526 method2712(int arg0, byte[] arg1) {
        ++field6693;
        class526 var2 = new class526();
        class209 var3 = new class209(arg1);
        var3.field3037 = var3.field3036.length + -2;
        int var4 = var3.method1450((byte) 26);
        int var5 = -2 - var4 + var3.field3036.length + -12;
        var3.field3037 = var5;
        if (arg0 != -19364) {
            method2714(97, (byte) -60);
        }
        int var6 = var3.method1452(65280);
        var2.field7774 = var3.method1450((byte) 63);
        var2.field7782 = var3.method1450((byte) 50);
        var2.field7775 = var3.method1450((byte) 46);
        var2.field7783 = var3.method1450((byte) 95);
        int var7 = var3.method1428(32122);
        if (~var7 < -1) {
            var2.field7776 = new class433[var7];
            for (int var8 = 0; ~var8 > ~var7; ++var8) {
                int var9 = var3.method1450((byte) 95);
                class433 var10 = new class433(class476.method2841(var9, true));
                var2.field7776[var8] = var10;
                while (~(var9--) < -1) {
                    int var11 = var3.method1452(65280);
                    int var12 = var3.method1452(65280);
                    var10.method2606(new class427(var12), (long) var11, 0);
                }
            }
        }
        var3.field3037 = 0;
        var2.field7779 = var3.method1455((byte) -127);
        var2.field7787 = new int[var6];
        var2.field7781 = new String[var6];
        var2.field7777 = new int[var6];
        int var13 = 0;
        while (~var5 < ~var3.field3037) {
            int var14 = var3.method1450((byte) 100);
            if (~var14 == -4) {
                var2.field7781[var13] = var3.method1449(arg0 + 19466).intern();
            } else if (var14 < 100 && ~var14 != -22 && ~var14 != -39 && ~var14 != -40) {
                var2.field7777[var13] = var3.method1452(65280);
            } else {
                var2.field7777[var13] = var3.method1428(32122);
            }
            var2.field7787[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(BIB)V", line = 160)
    public void method1854(byte arg0, int arg1, byte arg2) {
        if (arg0 != -52) {
            this.method344((byte) 37);
        }
        this.field6691[this.field6696++] = (byte) ((class286.method1847(arg2, 255) >> 1) + 127);
        ++field6687;
    }

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "(I)V", line = 174)
    public static void method2713(int arg0) {
        field6685 = null;
        field6695 = null;
        if (arg0 != 127) {
            method2712(-30, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IB)I", line = 185)
    public static final int method2714(int arg0, byte arg1) {
        ++field6689;
        if (arg1 <= 74) {
            method2714(40, (byte) 13);
        }
        return arg0 & 255;
    }
}
