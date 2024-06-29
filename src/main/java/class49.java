import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class49 extends class47 {

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
    private final int field828;

    @OriginalMember(owner = "client!ed", name = "N", descriptor = "I")
    private final int field843;

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
    private final int field829;

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "I")
    private final int field831;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "I")
    public static int field827 = 0;

    @OriginalMember(owner = "client!ed", name = "E", descriptor = "I")
    public static int field835 = 0;

    @OriginalMember(owner = "client!ed", name = "F", descriptor = "Lmb;")
    public static class132 field836 = class166.method1092("Art", 112);

    @OriginalMember(owner = "client!ed", name = "I", descriptor = "Lmb;")
    private static class132 field839 = class166.method1092("Loaded update list", 119);

    @OriginalMember(owner = "client!ed", name = "O", descriptor = "Lmb;")
    public static class132 field844 = field839;

    @OriginalMember(owner = "client!ed", name = "D", descriptor = "Lq;")
    public static class174 field834 = new class174(50);

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!ed", name = "G", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!ed", name = "H", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!ed", name = "J", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!ed", name = "L", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lmb;I)Ljb;")
    public static final class100 method322(class132 arg0, int arg1) {
        ++field833;
        if (arg1 == arg0.method902((byte) -4)) {
            return null;
        } else {
            for (class100 var2 = (class100) class138.field2584.method119(true); var2 != null; var2 = (class100) class138.field2584.method125((byte) -96)) {
                if (var2.field1877.method901(-94, arg0)) {
                    return var2;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(IIIIIII)V")
    public class49(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field828 = arg2;
        this.field843 = arg1;
        this.field829 = arg0;
        this.field831 = arg3;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZI)V")
    public final void method310(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field839 = null;
        }
        ++field841;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)V")
    public final void method313(int arg0, int arg1, int arg2) {
        ++field840;
        int var4 = this.field829 * arg1 >> 12;
        int var5 = this.field843 * arg0 >> 12;
        if (arg2 != 1832079585) {
            field839 = null;
        }
        int var6 = this.field831 * arg0 >> 12;
        int var7 = this.field828 * arg1 >> 12;
        class84.method525(var4, var6, super.field818, super.field803, arg2 ^ -1832064089, var7, super.field817, var5);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static void method323(int arg0) {
        field836 = null;
        field844 = null;
        if (arg0 <= 114) {
            method322((class132) null, -10);
        }
        field839 = null;
        field834 = null;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(Z)V")
    public static final void method324(boolean arg0) {
        ++field838;
        try {
            if (arg0) {
                if (class4.field45 == null) {
                    class4.field45 = new class203(class189.field3482, class187.method1197(new class132[] { class15.field214, class132.method889(class149.field2736, (byte) 92), class240.field4319 }, -116).method899(0));
                } else {
                    byte[] var1 = class4.field45.method1282(-2);
                    if (var1 != null) {
                        class112 var2 = new class112(var1);
                        class198.field3687 = var2.method739(-128);
                        class211.field3870 = new class75[class198.field3687];
                        for (int var3 = 0; class198.field3687 > var3; ++var3) {
                            class75 var4 = class211.field3870[var3] = new class75();
                            int var5 = var2.method739(58);
                            var4.field1251 = var5 & 32767;
                            var4.field1257 = (32768 & var5) != 0;
                            var4.field1249 = var2.method720((byte) 106);
                            var4.field1256 = var2.method750(65280);
                            var4.field1253 = var3;
                            var4.field1254 = class156.method1020(var2.method739(-125), (byte) 76);
                        }
                        class14.method76(class211.field3870, 0, class211.field3870.length + -1, (byte) 119);
                        class4.field45 = null;
                        class62.field1040 = true;
                    }
                }
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class4.field45 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIILii;IZI)V")
    public static final void method325(int arg0, int arg1, int arg2, class96 arg3, int arg4, boolean arg5, int arg6) {
        if (arg5) {
            field844 = null;
        }
        int var7 = arg0 * arg0 + arg2 * arg2;
        ++field842;
        if (var7 <= 360000) {
            int var8 = Math.min(arg3.field1830 / 2, arg3.field1740 / 2);
            if (~(var8 * var8) <= ~var7) {
                class218.method1360(arg2, arg6, arg0, class155.field2845[arg1], (byte) 121, arg4, arg3);
            } else {
                var8 -= 10;
                int var9 = class230.field4153 + class166.field3029 & 2047;
                int var10 = class50.field853[var9];
                int var11 = var10 * 256 / (class233.field4196 - -256);
                int var12 = class50.field851[var9];
                int var13 = var12 * 256 / (class233.field4196 + 256);
                int var14 = arg2 * var11 - -(arg0 * var13) >> 16;
                int var15 = arg2 * var13 - arg0 * var11 >> 16;
                double var16 = Math.atan2((double) var14, (double) var15);
                int var18 = (int) (Math.sin(var16) * (double) var8);
                int var19 = (int) ((double) var8 * Math.cos(var16));
                ((class18) class169.field3142[arg1]).method101(arg4 + var18 + -10 - -(arg3.field1830 / 2), arg3.field1740 / 2 + (arg6 - var19) + -10, 20, 20, 15, 15, var16, 256);
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lpb;ILpb;II)Lji;")
    public static final class107 method326(class165 arg0, int arg1, class165 arg2, int arg3, int arg4) {
        ++field832;
        if (arg1 >= -3) {
            return null;
        } else {
            return !class172.method1122(arg3, arg2, arg4, true) ? null : class103.method636(arg0.method1079(arg3, -95, arg4), (byte) -44);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IBI)V")
    public final void method318(int arg0, byte arg1, int arg2) {
        if (arg1 >= 29) {
            int var4 = this.field829 * arg2 >> 12;
            ++field837;
            int var5 = this.field843 * arg0 >> 12;
            int var6 = this.field828 * arg2 >> 12;
            int var7 = this.field831 * arg0 >> 12;
            class69.method426(var4, var6, (byte) 47, var5, var7, super.field818);
        }
    }
}
