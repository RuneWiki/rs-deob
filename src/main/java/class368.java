import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class368 extends class82 {

    @OriginalMember(owner = "client!af", name = "M", descriptor = "[I")
    private int[] field4833 = new int[3];

    @OriginalMember(owner = "client!af", name = "O", descriptor = "I")
    private int field4835 = 4096;

    @OriginalMember(owner = "client!af", name = "R", descriptor = "I")
    private int field4838 = 3216;

    @OriginalMember(owner = "client!af", name = "S", descriptor = "I")
    private int field4839 = 3216;

    @OriginalMember(owner = "client!af", name = "Q", descriptor = "Lbv;")
    public static class255 field4837 = new class255(14, 1);

    @OriginalMember(owner = "client!af", name = "V", descriptor = "Lbv;")
    public static class255 field4842 = new class255(15, 4);

    @OriginalMember(owner = "client!af", name = "X", descriptor = "Lbv;")
    public static class255 field4844 = new class255(16, -2);

    @OriginalMember(owner = "client!af", name = "Y", descriptor = "Lbv;")
    public static class255 field4845 = new class255(17, 0);

    @OriginalMember(owner = "client!af", name = "Z", descriptor = "Lbv;")
    public static class255 field4846 = new class255(18, -2);

    @OriginalMember(owner = "client!af", name = "ab", descriptor = "Lbv;")
    public static class255 field4847 = new class255(19, -2);

    @OriginalMember(owner = "client!af", name = "bb", descriptor = "Lbv;")
    public static class255 field4848 = new class255(20, 6);

    @OriginalMember(owner = "client!af", name = "cb", descriptor = "Lbv;")
    public static class255 field4849 = new class255(21, 9);

    @OriginalMember(owner = "client!af", name = "db", descriptor = "Lbv;")
    public static class255 field4850 = new class255(22, -2);

    @OriginalMember(owner = "client!af", name = "eb", descriptor = "Lbv;")
    public static class255 field4851 = new class255(23, 4);

    @OriginalMember(owner = "client!af", name = "fb", descriptor = "Lbv;")
    public static class255 field4852 = new class255(24, -1);

    @OriginalMember(owner = "client!af", name = "gb", descriptor = "Lbv;")
    public static class255 field4853 = new class255(25, -2);

    @OriginalMember(owner = "client!af", name = "hb", descriptor = "Lbv;")
    public static class255 field4854 = new class255(26, 0);

    @OriginalMember(owner = "client!af", name = "ib", descriptor = "Lbv;")
    public static class255 field4855 = new class255(27, 0);

    @OriginalMember(owner = "client!af", name = "jb", descriptor = "[Lbv;")
    private static class255[] field4856 = new class255[32];

    @OriginalMember(owner = "client!af", name = "lb", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!af", name = "nb", descriptor = "[Lpg;")
    public static class623[] field4860;

    @OriginalMember(owner = "client!af", name = "pb", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!af", name = "L", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!af", name = "P", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!af", name = "T", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!af", name = "U", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!af", name = "W", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!af", name = "mb", descriptor = "Lpp;")
    public static class330 field4859;

    @OriginalMember(owner = "client!af", name = "N", descriptor = "Ldn;")
    public static class438 field4834;

    @OriginalMember(owner = "client!af", name = "kb", descriptor = "Llq;")
    public static class471 field4857;

    @OriginalMember(owner = "client!af", name = "ob", descriptor = "[I")
    public static int[] field4861;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Llp;IIII)V")
    public static final void method2061(class329 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class534.method3050(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class238.field2985) {
            class534.method3050(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class534.method3050(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class548.field8061) {
            class534.method3050(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class548.field8061) {
            class534.method3050(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class238.field2985 && arg4 <= class548.field8061) {
            class534.method3050(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class534.method3050(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class238.field2985 && arg4 > 0) {
            class534.method3050(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!af", name = "h", descriptor = "(I)V")
    private final void method2062(int arg0) {
        ++field4843;
        double var2 = Math.cos((double) ((float) this.field4838 / 4096.0F));
        this.field4833[0] = (int) (var2 * Math.sin((double) ((float) this.field4839 / 4096.0F)) * 4096.0D);
        this.field4833[1] = (int) (Math.cos((double) ((float) this.field4839 / 4096.0F)) * var2 * 4096.0D);
        this.field4833[2] = (int) (4096.0D * Math.sin((double) ((float) this.field4838 / 4096.0F)));
        int var4 = this.field4833[0] * this.field4833[0] >> 12;
        int var5 = this.field4833[1] * this.field4833[1] >> 12;
        int var6 = this.field4833[2] * this.field4833[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var5 + var6 >> 12)));
        if (arg0 != 1470781964) {
            field4848 = null;
        }
        if (~var7 != -1) {
            this.field4833[0] = (this.field4833[0] << 12) / var7;
            this.field4833[2] = (this.field4833[2] << 12) / var7;
            this.field4833[1] = (this.field4833[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)V")
    public final void method438(int arg0) {
        if (arg0 != -2) {
            this.method198(107, 97, (class374) null);
        }
        ++field4836;
        this.method2062(arg0 ^ -1470781966);
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(II)I")
    public static final int method2063(int arg0, int arg1) {
        ++field4832;
        return arg1 <= 76 ? 87 : arg0 >>> 7;
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(II)[I")
    public final int[] method201(int arg0, int arg1) {
        ++field4840;
        if (arg1 != 12218) {
            return null;
        } else {
            int[] var3 = super.field990.method1566((byte) 116, arg0);
            if (super.field990.field3641) {
                int var4 = class323.field4096 * this.field4835 >> 12;
                int[] var5 = this.method489(false, 0, class466.field6523 & arg0 - 1);
                int[] var6 = this.method489(false, 0, arg0);
                int[] var7 = this.method489(false, 0, class466.field6523 & arg0 + 1);
                for (int var8 = 0; var8 < class629.field9033; ++var8) {
                    int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                    int var10 = (var6[var8 + -1 & class129.field1590] + -var6[class129.field1590 & var8 + 1]) * var4 >> 12;
                    int var11 = var10 >> 4;
                    if (~var11 > -1) {
                        var11 = -var11;
                    }
                    int var12 = var9 >> 4;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    if (~var11 < -256) {
                        var11 = 255;
                    }
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    int var13 = 255 & class529.field7435[((var12 + 1) * var12 >> 1) + var11];
                    int var14 = var9 * var13 >> 8;
                    int var15 = var10 * var13 >> 8;
                    int var16 = var13 * 4096 >> 8;
                    int var17 = this.field4833[2] * var16 >> 12;
                    int var18 = this.field4833[0] * var15 >> 12;
                    int var19 = this.field4833[1] * var14 >> 12;
                    var3[var8] = var18 - (-var19 - var17);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IILos;)V")
    public final void method198(int arg0, int arg1, class374 arg2) {
        ++field4841;
        int var4 = -14 % ((arg1 - -69) / 42);
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field4838 = arg2.method2136(false);
                }
            } else {
                this.field4839 = arg2.method2136(false);
            }
        } else {
            this.field4835 = arg2.method2136(false);
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
    public class368() {
        super(1, true);
    }

    @OriginalMember(owner = "client!af", name = "i", descriptor = "(I)V")
    public static void method2064(int arg0) {
        field4834 = null;
        field4842 = null;
        field4852 = null;
        field4849 = null;
        field4857 = null;
        field4856 = null;
        field4847 = null;
        field4848 = null;
        if (arg0 != -13328) {
            method2064(29);
        }
        field4861 = null;
        field4860 = null;
        field4837 = null;
        field4850 = null;
        field4846 = null;
        field4845 = null;
        field4854 = null;
        field4851 = null;
        field4853 = null;
        field4859 = null;
        field4855 = null;
        field4844 = null;
    }

    static {
        class255[] var0 = class544.method3184((byte) 127);
        for (int var1 = 0; ~var0.length < ~var1; ++var1) {
            field4856[var0[var1].field3279] = var0[var1];
        }
        field4858 = 0;
        new class92("", 76);
        field4860 = new class623[16];
        field4862 = 0;
    }
}
