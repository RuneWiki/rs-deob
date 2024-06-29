import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class387 extends class453 {

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "Lme;")
    public class508 field5904;

    @OriginalMember(owner = "client!gu", name = "h", descriptor = "[I")
    public static int[] field5905 = new int[13];

    @OriginalMember(owner = "client!gu", name = "i", descriptor = "Z")
    public static boolean field5906 = false;

    @OriginalMember(owner = "client!gu", name = "k", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5908 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
    public static int field5910 = 1;

    @OriginalMember(owner = "client!gu", name = "j", descriptor = "I")
    public static int field5907;

    @OriginalMember(owner = "client!gu", name = "l", descriptor = "I")
    public static int field5909;

    @OriginalMember(owner = "client!gu", name = "n", descriptor = "I")
    public static int field5911;

    @OriginalMember(owner = "client!gu", name = "o", descriptor = "I")
    public static int field5912;

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lna;II[B)V")
    public class387(class211 arg0, int arg1, int arg2, byte[] arg3) {
        this.field5904 = class502.method3056(false, arg0, 6406, 6406, arg3, arg1, arg2, (byte) -75);
        this.field5904.method3160(false, (byte) 50, false);
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZIIII)V")
    public static final void method2485(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field5909++;
        if (!arg0 && class517.field7675 == arg4 && class95.field1386 == arg3 && class254.field4119 == class201.field3057 || class141.field1911.method1635(class452.field7013, -1)) {
            return;
        }
        class95.field1386 = arg3;
        class254.field4119 = class201.field3057;
        class517.field7675 = arg4;
        if (class141.field1911.method1635(class452.field7013, -1)) {
            class254.field4119 = 0;
        }
        class89.method610(arg1, (byte) -125);
        class57.method439(true, class382.field5862.method1583(89, class12.field131), (byte) -60, class128.field1741);
        int var5 = class453.field7018;
        int var6 = class126.field1718;
        class453.field7018 = (class517.field7675 - (class135.field1839 >> 4)) * 8;
        class126.field1718 = (class95.field1386 - (class197.field3038 >> 4)) * 8;
        class305.field4797 = class194.method1207(class517.field7675 * 8, class95.field1386 * 8);
        class76.field1130 = null;
        int var7 = class453.field7018 - var5;
        int var8 = class126.field1718 - var6;
        if (arg1 == 10) {
            for (int var9 = 0; var9 < class78.field1176; var9++) {
                class38 var10 = class14.field150[var9];
                if (var10 != null) {
                    class378 var11 = var10.field378;
                    for (int var12 = 0; var12 < 10; var12++) {
                        var11.field894[var12] -= var7;
                        var11.field899[var12] -= var8;
                    }
                    var11.field6410 -= var8 * 128;
                    var11.field6417 -= var7 * 128;
                }
            }
        } else {
            boolean var13 = false;
            class378.field5815 = 0;
            int var14 = (class135.field1839 - 1) * 128;
            int var15 = class197.field3038 * 128 - 128;
            for (int var16 = 0; var16 < class78.field1176; var16++) {
                class38 var29 = class14.field150[var16];
                if (var29 != null) {
                    class378 var30 = var29.field378;
                    var30.field6410 -= var8 * 128;
                    var30.field6417 -= var7 * 128;
                    if (var30.field6417 >= 0 && var14 >= var30.field6417 && var30.field6410 >= 0 && var30.field6410 <= var15) {
                        boolean var31 = true;
                        for (int var32 = 0; var32 < 10; var32++) {
                            var30.field894[var32] -= var7;
                            var30.field899[var32] -= var8;
                            if (var30.field894[var32] < 0 || var30.field894[var32] >= class135.field1839 || var30.field899[var32] < 0 || var30.field899[var32] >= class197.field3038) {
                                var31 = false;
                            }
                        }
                        if (var31) {
                            class81.field1198[class378.field5815++] = var30.field847;
                        } else {
                            var30.method2443(null, (byte) -93);
                            var29.method3149(86);
                            var13 = true;
                        }
                    } else {
                        var30.method2443(null, (byte) -103);
                        var29.method3149(96);
                        var13 = true;
                    }
                }
            }
            if (var13) {
                class78.field1176 = class365.field5659.method1126(24946);
                class365.field5659.method1120(class14.field150, 0);
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class350 var27 = class264.field4276[var17];
            if (var27 != null) {
                for (int var28 = 0; var28 < 10; var28++) {
                    var27.field894[var28] -= var7;
                    var27.field899[var28] -= var8;
                }
                var27.field6417 -= var7 * 128;
                var27.field6410 -= var8 * 128;
            }
        }
        if (arg2 < 65) {
            method2487((byte) 32);
        }
        class402[] var18 = class323.field5076;
        for (int var19 = 0; var19 < var18.length; var19++) {
            class402 var26 = var18[var19];
            if (var26 != null) {
                var26.field6050 -= var7 * 128;
                var26.field6045 -= var8 * 128;
            }
        }
        for (class422 var20 = (class422) class497.field7476.method2123(-115); var20 != null; var20 = (class422) class497.field7476.method2126((byte) 61)) {
            var20.field6404 -= var8;
            var20.field6402 -= var7;
            if (class357.field5545 != 4 && (var20.field6402 < 0 || var20.field6404 < 0 || var20.field6402 >= class135.field1839 || var20.field6404 >= class197.field3038)) {
                var20.method3149(71);
            }
        }
        if (class357.field5545 != 4) {
            for (class257 var21 = (class257) class328.field5157.method1119(false); var21 != null; var21 = (class257) class328.field5157.method1121((byte) 120)) {
                int var22 = (int) (var21.field7780 & 0x3FFFL);
                int var23 = var22 - class453.field7018;
                int var24 = (int) (var21.field7780 >> 14 & 0x3FFFL);
                int var25 = var24 - class126.field1718;
                if (var23 < 0 || var25 < 0 || var23 >= class135.field1839 || var25 >= class197.field3038) {
                    var21.method3149(68);
                }
            }
        }
        if (class454.field7026 != 0) {
            class535.field7842 -= var8;
            class454.field7026 -= var7;
        }
        class131.method815((byte) 1);
        if (arg1 != 10) {
            class163.field2367 -= var7 * 128;
            class203.field3094 -= var7;
            class71.field1076 -= var8;
            class259.field4185 -= var7;
            class296.field4667 -= var8;
            class98.field1404 -= var8 * 128;
            if (Math.abs(var7) > class135.field1839 || Math.abs(var8) > class197.field3038) {
                class278.method1866((byte) -94);
            }
        } else if (class334.field5222 == 4) {
            class5.field61 -= var8 * 128;
            class290.field4578 -= var7 * 128;
            class254.field4115 -= var8 * 128;
            class433.field6538 -= var7 * 128;
        } else {
            class334.field5222 = 1;
        }
        class524.method3128((byte) 35);
        class187.method1172(true);
        class286.field4506.method2120((byte) 27);
        class322.field5026.method2120((byte) 27);
        class479.field7319.method2618(-9974);
        class249.method1724(false);
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)V")
    public static final void method2486(byte arg0) {
        field5911++;
        class284.method1915((long) class88.field1278, false, class19.field198);
        if (class509.field7597 != -1) {
            class345.method2281(class509.field7597, -101);
        }
        if (arg0 != -65) {
            method2486((byte) 94);
        }
        for (int var1 = 0; var1 < class126.field1703; var1++) {
            if (class520.field7707[var1]) {
                class98.field1414[var1] = true;
            }
            class442.field6875[var1] = class520.field7707[var1];
            class520.field7707[var1] = false;
        }
        class231.field3821 = class88.field1278;
        if (class19.field198.method1267()) {
            class294.field4634 = true;
        }
        if (class509.field7597 != -1) {
            class126.field1703 = 0;
            class298.method1999(true);
        }
        class19.field198.method1228();
        class167.method1054(arg0 ^ 0xFFFFFFBF, class19.field198);
        int var2 = class291.method1958(true);
        if (var2 == -1) {
            var2 = class436.field6587;
        }
        if (var2 == -1) {
            var2 = class86.field1254;
        }
        class456.method2860(var2, 76);
        class376.field5786 = 0;
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(B)V")
    public static void method2487(byte arg0) {
        field5905 = null;
        field5908 = null;
        int var1 = 88 % ((-arg0 - 63) / 54);
    }
}
