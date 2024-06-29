import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class244 extends class134 {

    @OriginalMember(owner = "client!k", name = "w", descriptor = "I")
    public int field4092;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public int field4084;

    @OriginalMember(owner = "client!k", name = "u", descriptor = "I")
    public static int field4090 = -1;

    @OriginalMember(owner = "client!k", name = "B", descriptor = "Z")
    public static boolean field4097 = false;

    @OriginalMember(owner = "client!k", name = "y", descriptor = "[I")
    public static int[] field4094 = new int[99];

    @OriginalMember(owner = "client!k", name = "D", descriptor = "Loe;")
    public static class65 field4099;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!k", name = "x", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!k", name = "z", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!k", name = "A", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!k", name = "C", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!k", name = "F", descriptor = "Laj;")
    public static class151 field4101;

    @OriginalMember(owner = "client!k", name = "E", descriptor = "Lnd;")
    public static class191 field4100;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "(I)V")
    public static final void method1744(int arg0) {
        class300.field4901 = null;
        field4096++;
        class310.method2086(class155.field2567, 0, 0, class182.field2901, 0, -1, class243.field4082, (byte) 71, 0);
        int var1 = -127 / ((25 - arg0) / 55);
        if (class300.field4901 != null) {
            class239.method1710(class182.field2901, class90.field1494, -1412584499, -1, 0, class155.field2567, class219.field3696, class78.field1324.field3471, class300.field4901, 0);
            class300.field4901 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "g", descriptor = "(I)V")
    public static final void method1745(int arg0) {
        class240.field4056 = null;
        class4.field115 = null;
        class161.field2617 = null;
        class46.field811 = null;
        class157.field2579 = null;
        class151.field2519 = null;
        class176.field2841 = null;
        class119.field2002 = null;
        class209.field3537 = null;
        class271.field4516 = null;
        if (arg0 < -55) {
            class238.field4009 = null;
            field4098++;
            class200.field3221 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BI)V")
    public static final void method1746(byte arg0, int arg1) {
        field4085++;
        if (arg0 <= 84) {
            field4099 = null;
        }
        if (!class301.method2056(-1, arg1)) {
            return;
        }
        class207[] var2 = class208.field3515[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class207 var4 = var2[var3];
            if (var4 != null) {
                var4.field3512 = 0;
                var4.field3365 = 0;
                var4.field3445 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1747(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4093++;
        class170.method1272(0, arg5);
        int var7 = 0;
        int var8 = arg5;
        int var9 = -arg5;
        int var10 = arg5 - arg6;
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = var10;
        int var12 = -var10;
        if (arg4 > -47) {
            return;
        }
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class41.field630[arg0];
        int var16 = arg1 - var10;
        class134.method996(0, var16, arg1 - arg5, arg2, var15);
        int var17 = arg1 + var10;
        class134.method996(0, var17, var16, arg3, var15);
        class134.method996(0, arg1 + arg5, var17, arg2, var15);
        while (var8 > var7) {
            var13 += 2;
            var9 += var13;
            var14 += 2;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class158.field2591[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var9 >= 0) {
                var8--;
                var9 -= var8 << 1;
                if (var8 >= var10) {
                    int[] var18 = class41.field630[arg0 - var8];
                    int[] var19 = class41.field630[arg0 + var8];
                    int var20 = arg1 + var7;
                    int var21 = arg1 - var7;
                    class134.method996(0, var20, var21, arg2, var19);
                    class134.method996(0, var20, var21, arg2, var18);
                } else {
                    int[] var22 = class41.field630[arg0 + var8];
                    int var23 = arg1 + var7;
                    int var24 = class158.field2591[var8];
                    int[] var25 = class41.field630[arg0 - var8];
                    int var26 = arg1 - var7;
                    int var27 = arg1 + var24;
                    int var28 = arg1 - var24;
                    class134.method996(0, var28, var26, arg2, var22);
                    class134.method996(0, var27, var28, arg3, var22);
                    class134.method996(0, var23, var27, arg2, var22);
                    class134.method996(0, var28, var26, arg2, var25);
                    class134.method996(0, var27, var28, arg3, var25);
                    class134.method996(0, var23, var27, arg2, var25);
                }
            }
            int[] var29 = class41.field630[arg0 + var7];
            int[] var30 = class41.field630[arg0 - var7];
            int var31 = arg1 + var8;
            int var32 = arg1 - var8;
            if (var7 < var10) {
                int var33 = var11 < var7 ? class158.field2591[var7] : var11;
                int var34 = arg1 + var33;
                int var35 = arg1 - var33;
                class134.method996(0, var35, var32, arg2, var29);
                class134.method996(0, var34, var35, arg3, var29);
                class134.method996(0, var31, var34, arg2, var29);
                class134.method996(0, var35, var32, arg2, var30);
                class134.method996(0, var34, var35, arg3, var30);
                class134.method996(0, var31, var34, arg2, var30);
            } else {
                class134.method996(0, var31, var32, arg2, var29);
                class134.method996(0, var31, var32, arg2, var30);
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IBIII)V")
    public static final void method1748(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class215.field3631; var5++) {
            if (class180.field2877[var5] + class17.field348[var5] > arg4 && arg2 + arg4 > class180.field2877[var5] && (class298.field4867[var5] + class159.field2607[var5]) > arg3 && class298.field4867[var5] < (arg0 + arg3)) {
                class143.field2351[var5] = true;
            }
        }
        if (arg1 != -93) {
            method1746((byte) 76, 76);
        }
        field4091++;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(II)V")
    public class244(int arg0, int arg1) {
        this.field4092 = arg1;
        this.field4084 = arg0;
    }

    @OriginalMember(owner = "client!k", name = "h", descriptor = "(I)V")
    public static void method1749(int arg0) {
        field4101 = null;
        field4100 = null;
        if (arg0 > 30) {
            field4094 = null;
            field4099 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "i", descriptor = "(I)V")
    public static final void method1750(int arg0) {
        field4095++;
        int var1 = -109 % ((arg0 + 14) / 51);
        class196.field3156.method94(34);
        class162.field2633.method94(34);
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field4094[var1] = var0 / 4;
        }
        field4099 = new class65();
    }
}
