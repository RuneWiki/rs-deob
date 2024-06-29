import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class270 extends class87 {

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    private int field4135;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    private int field4136;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
    private int field4145;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    private int field4134;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "[I")
    public static int[] field4146 = new int[2000];

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "Lse;")
    public static class211 field4147;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "Lhc;")
    public static class235 field4139;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZI)V")
    public final void method553(int arg0, boolean arg1, int arg2) {
        ++field4141;
        int var4 = this.field4134 * arg0 >> 12;
        int var5 = this.field4135 * arg0 >> 12;
        if (!arg1) {
            this.field4134 = -15;
        }
        int var6 = this.field4145 * arg2 >> 12;
        int var7 = this.field4136 * arg2 >> 12;
        class36.method245(super.field1186, var4, var5, super.field1181, 107, var6, var7);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BI)Lg;")
    public static final class284 method1783(byte arg0, int arg1) {
        ++field4143;
        class284 var2 = (class284) class50.field720.method540((byte) -127, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class203.field2821.method1576(-49, class129.method882(true, arg1), class10.method63((byte) 102, arg1));
            class284 var4 = new class284();
            int var5 = -11 / ((-3 - arg0) / 52);
            var4.field4413 = arg1;
            if (var3 != null) {
                var4.method1908(new class224(var3), (byte) 124);
            }
            var4.method1907(23);
            class50.field720.method543(var4, (long) arg1, 858993459);
            return var4;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)V")
    public final void method548(int arg0, int arg1, int arg2) {
        ++field4138;
        int var4 = this.field4134 * arg1 >> 12;
        int var5 = this.field4136 * arg2 >> 12;
        if (arg0 >= -62) {
            this.field4136 = -56;
        }
        int var6 = this.field4135 * arg1 >> 12;
        int var7 = this.field4145 * arg2 >> 12;
        class265.method1736(super.field1180, var6, 8, var4, var5, var7);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)[Lke;")
    public static final class110[] method1784(byte arg0) {
        ++field4137;
        class110[] var1 = new class110[class175.field2465];
        for (int var2 = 0; class175.field2465 > var2; ++var2) {
            int var4 = class50.field729[var2] * class39.field576[var2];
            byte[] var5 = class140.field1956[var2];
            if (class284.field4429[var2]) {
                byte[] var6 = class154.field2142[var2];
                int[] var7 = new int[var4];
                for (int var8 = 0; var8 < var4; ++var8) {
                    var7[var8] = class54.method339(class9.field79[class235.method1572(var5[var8], 255)], class235.method1572(255, var6[var8]) << 24);
                }
                var1[var2] = new class243(class21.field296, class287.field4535, class273.field4208[var2], class198.field2749[var2], class50.field729[var2], class39.field576[var2], var7);
            } else {
                int[] var9 = new int[var4];
                for (int var10 = 0; ~var10 > ~var4; ++var10) {
                    var9[var10] = class9.field79[class235.method1572(255, var5[var10])];
                }
                var1[var2] = new class128(class21.field296, class287.field4535, class273.field4208[var2], class198.field2749[var2], class50.field729[var2], class39.field576[var2], var9);
            }
        }
        int var3 = -112 / ((arg0 - -31) / 32);
        class15.method88(-15971);
        return var1;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(III)V")
    public final void method552(int arg0, int arg1, int arg2) {
        ++field4142;
        int var4 = this.field4134 * arg0 >> 12;
        int var5 = this.field4135 * arg0 >> 12;
        if (arg1 > 94) {
            int var6 = this.field4145 * arg2 >> 12;
            int var7 = this.field4136 * arg2 >> 12;
            class38.method252(var4, true, super.field1186, super.field1181, var7, super.field1180, var5, var6);
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(IZI)V")
    public static final void method1785(int arg0, boolean arg1, int arg2) {
        ++field4144;
        class67.field906 = class142.field1972 - (arg2 - (class41.field605 + -1));
        if (!arg1) {
            field4147 = null;
        }
        class75.field1054 = -class164.field2273 + arg0;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIZII)V")
    public static final void method1786(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (class273.field4228 <= arg3 && arg3 <= class127.field1782) {
            int var5 = class148.method996(class93.field1294, arg4, 7585, class296.field4668);
            int var6 = class148.method996(class93.field1294, arg1, 7585, class296.field4668);
            class120.method796(2500, arg3, arg0, var6, var5);
        }
        if (arg2) {
            method1787((class198) null);
        }
        ++field4140;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lgg;)V")
    public static final void method1787(class198 arg0) {
        for (int var1 = arg0.field2746; var1 <= arg0.field2765; ++var1) {
            for (int var2 = arg0.field2748; var2 <= arg0.field2763; ++var2) {
                class89 var3 = class194.field2682[arg0.field2764][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field1240; ++var4) {
                        if (var3.field1226[var4] == arg0) {
                            --var3.field1240;
                            for (int var5 = var4; var5 < var3.field1240; ++var5) {
                                var3.field1226[var5] = var3.field1226[var5 + 1];
                                var3.field1230[var5] = var3.field1230[var5 + 1];
                            }
                            var3.field1226[var3.field1240] = null;
                            break;
                        }
                    }
                    var3.field1245 = 0;
                    for (int var6 = 0; var6 < var3.field1240; ++var6) {
                        var3.field1245 |= var3.field1230[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
    public static void method1788(int arg0) {
        field4146 = null;
        field4139 = null;
        if (arg0 > -6) {
            field4139 = null;
        }
        field4147 = null;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(IIIIIII)V")
    public class270(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4135 = arg2;
        this.field4136 = arg1;
        this.field4145 = arg3;
        this.field4134 = arg0;
    }
}
