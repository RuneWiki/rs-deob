import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class336 implements class72 {

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "[I")
    public static int[] field5313 = new int[5];

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "Z")
    public static boolean field5318 = true;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field5308;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public static int field5312;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "Lki;")
    public static class190 field5311;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "Z")
    public static boolean field5314;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "[I")
    public static int[] field5310;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "[[S")
    public static short[][] field5316;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "[[[I")
    public static int[][][] field5320;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(JI[II)Ljava/lang/String;", line = 4)
    public final String method611(long arg0, int arg1, int[] arg2, int arg3) {
        field5312++;
        if (arg3 == 0) {
            class48 var7 = class229.method1780(false, arg2[0]);
            return var7.method374((byte) -115, (int) arg0);
        } else if (arg1 != 11) {
            return (String) null;
        } else if (arg3 == 1 || arg3 == 10) {
            class52 var6 = class6.method22((int) arg0, 16430);
            return var6.field871;
        } else if (arg3 == 6 || arg3 == 7 || arg3 == 11) {
            return class229.method1780(false, arg2[0]).method374((byte) -115, (int) arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IBIIII)V", line = 45)
    public static final void method2341(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field5317++;
        int var6 = 0;
        int var7 = arg2;
        int var8 = arg5 * arg5;
        int var9 = arg2 * arg2;
        int var10 = var9 << 1;
        int var11 = arg2 << 1;
        int var12 = (1 - var11) * var8 + var10;
        int var13 = var8 << 1;
        int var14 = var9 << 2;
        int var15 = var9 - (var11 - 1) * var13;
        int var16 = var8 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg2 << 1) - 3) * var13;
        int var19 = (var6 + 1) * var14;
        if (arg1 >= -22) {
            field5316 = (short[][]) ((short[][]) null);
        }
        int var20 = (arg2 - 1) * var16;
        if (arg0 >= class296.field4758 && class273.field4522 >= arg0) {
            int var21 = class315.method2235(class355.field5640, arg3 + arg5, class74.field1269, 127);
            int var22 = class315.method2235(class355.field5640, arg3 - arg5, class74.field1269, 127);
            class161.method1253(var21, class353.field5599[arg0], -1, arg4, var22);
        }
        while (var7 > 0) {
            var7--;
            int var23 = arg0 - var7;
            int var24 = arg0 + var7;
            if (var12 < 0) {
                while (var12 < 0) {
                    var12 += var17;
                    var15 += var19;
                    var19 += var14;
                    var17 += var14;
                    var6++;
                }
            }
            if (var15 < 0) {
                var12 += var17;
                var15 += var19;
                var19 += var14;
                var6++;
                var17 += var14;
            }
            if (var24 >= class296.field4758 && class273.field4522 >= var23) {
                int var25 = class315.method2235(class355.field5640, arg3 + var6, class74.field1269, 123);
                int var26 = class315.method2235(class355.field5640, arg3 - var6, class74.field1269, 112);
                if (class296.field4758 <= var23) {
                    class161.method1253(var25, class353.field5599[var23], -1, arg4, var26);
                }
                if (var24 <= class273.field4522) {
                    class161.method1253(var25, class353.field5599[var24], -1, arg4, var26);
                }
            }
            var12 += -var20;
            var20 -= var16;
            var15 += -var18;
            var18 -= var16;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)I", line = 150)
    public static final int method2342(byte arg0, int arg1) {
        if (arg0 > -5) {
            return -104;
        } else {
            field5319++;
            return arg1 >>> 7;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZI)V", line = 174)
    public static final void method2343(boolean arg0, int arg1) {
        field5306++;
        if (!class278.method2058(arg1, (byte) 4)) {
            return;
        }
        class250[] var2 = class163.field2587[arg1];
        if (arg0) {
            method2344((byte) -72, -31);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class250 var4 = var2[var3];
            if (var4 != null) {
                var4.field4114 = 0;
                var4.field4135 = 1;
                var4.field4116 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(BI)V", line = 213)
    public static final void method2344(byte arg0, int arg1) {
        class321 var2 = class46.method370(8, (byte) -106, arg1);
        if (arg0 != 110) {
            field5311 = (class190) null;
        }
        var2.method2261(-129);
        field5307++;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V", line = 226)
    public static void method2345(int arg0) {
        field5310 = null;
        field5320 = (int[][][]) null;
        field5316 = (short[][]) null;
        field5311 = null;
        field5313 = null;
        if (arg0 != -4584) {
            method2343(false, -33);
        }
    }
}
