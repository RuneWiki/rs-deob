import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class538 {

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "Lld;")
    private class561 field7527 = new class561();

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "Lgba;")
    private class358 field7530 = new class358();

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    private int field7532;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    private int field7531;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "Lba;")
    private class607 field7528;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field7523 = 0;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field7521 = 0;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field7518;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field7519;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field7520;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field7522;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field7524;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field7525;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public static int field7526;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static int field7529;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IJIB)V")
    public static final void method2989(int arg0, long arg1, int arg2, byte arg3) {
        field7520++;
        if (arg3 <= 51) {
            field7521 = -61;
        }
        int var5 = ((int) arg1 & 0x7D0C3) >> 14;
        int var6 = (int) arg1 >> 20 & 0x3;
        int var7 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class18.method84(arg2, var6, 0, 0, arg0, 0, 0, var5, true);
            return;
        }
        class137 var8 = class626.field9084.method1093(0, var7);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var10 = var8.field1670;
            var9 = var8.field1717;
        } else {
            var9 = var8.field1670;
            var10 = var8.field1717;
        }
        int var11 = var8.field1673;
        if (var6 != 0) {
            var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
        }
        class18.method84(arg2, 0, var11, var10, arg0, var9, 0, 0, true);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IBI)V")
    public static final void method2990(int arg0, byte arg1, int arg2) {
        if ((class614.field8837 > class614.field8831)) {
            class614.field8831 = (float) ((double) class614.field8831 / 30.0D + (double) class614.field8831);
            if (class614.field8831 > class614.field8837) {
                class614.field8831 = class614.field8837;
            }
            class168.method1000((byte) -27);
            class614.field8839 = (int) class614.field8831 >> 1;
            class614.field8838 = class338.method2137(class614.field8839, 1649632961);
        } else if (class614.field8831 > class614.field8837) {
            class614.field8831 = (float) ((double) class614.field8831 - (double) class614.field8831 / 30.0D);
            if (class614.field8831 < class614.field8837) {
                class614.field8831 = class614.field8837;
            }
            class168.method1000((byte) -27);
            class614.field8839 = (int) class614.field8831 >> 1;
            class614.field8838 = class338.method2137(class614.field8839, 1649632961);
        }
        field7529++;
        if (class217.field2771 != -1 && class124.field1543 != -1) {
            int var3 = class217.field2771 - class80.field1091;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class124.field1543 - class2.field20;
            class80.field1091 += var3;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class2.field20 += var4;
            if (var3 == 0 && var4 == 0) {
                class217.field2771 = -1;
                class124.field1543 = -1;
            }
            class168.method1000((byte) -27);
        }
        if (class592.field8548 <= 0) {
            class145.field1888 = -1;
            class35.field537 = -1;
        } else {
            class535.field7468--;
            if (class535.field7468 == 0) {
                class592.field8548--;
                class535.field7468 = 100;
            }
        }
        if (arg1 <= 47) {
            field7523 = 118;
        }
        if (!class181.field2332 || class612.field8795 == null) {
            return;
        }
        for (class525 var5 = (class525) class612.field8795.method3188((byte) -100); var5 != null; var5 = (class525) class612.field8795.method3182((byte) -54)) {
            class297 var6 = class614.field8823.method1544(36, var5.field7307.field9044);
            if (var5.method2929(arg2, arg0, Integer.MAX_VALUE)) {
                if (var6.field3889 != null) {
                    if (var6.field3889[4] != null) {
                        class431.method2520((long) var5.field7307.field9044, 0, var6.field3866, var6.field3859, 1002, 2, var6.field3889[4], -1, true, false, -1);
                    }
                    if (var6.field3889[3] != null) {
                        class431.method2520((long) var5.field7307.field9044, 0, var6.field3866, var6.field3859, 1008, 2, var6.field3889[3], -1, true, false, -1);
                    }
                    if (var6.field3889[2] != null) {
                        class431.method2520((long) var5.field7307.field9044, 0, var6.field3866, var6.field3859, 1003, 2, var6.field3889[2], -1, true, false, -1);
                    }
                    if (var6.field3889[1] != null) {
                        class431.method2520((long) var5.field7307.field9044, 0, var6.field3866, var6.field3859, 1001, 2, var6.field3889[1], -1, true, false, -1);
                    }
                    if (var6.field3889[0] != null) {
                        class431.method2520((long) var5.field7307.field9044, 0, var6.field3866, var6.field3859, 1010, 2, var6.field3889[0], -1, true, false, -1);
                    }
                }
                if (!var5.field7307.field9043) {
                    var5.field7307.field9043 = true;
                    class218.method1399(class377.field5284, var5.field7307.field9044, var6.field3859);
                }
                if (var5.field7307.field9043) {
                    class218.method1399(class433.field5895, var5.field7307.field9044, var6.field3859);
                }
            } else if (var5.field7307.field9043) {
                var5.field7307.field9043 = false;
                class218.method1399(class330.field4573, var5.field7307.field9044, var6.field3859);
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
    public static final void method2991(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field7526++;
        if (class301.field3918 == null) {
            return;
        }
        class358.field4993.method1874(arg0 ^ 0x5F7B);
        class555.method3110();
        class317.method1979((byte) 123);
        class530.method2956((byte) -86);
        class113.method612(true);
        class275.method1702(-1132255864);
        if (class466.field6615 != null) {
            class466.field6615.method1984(arg0 ^ 0xFFFFA000);
        }
        class153.method832(-83);
        class485.method2738(14);
        class255.method1535(-19278);
        class207.method1319(64, false);
        class192.method1233(-93);
        for (int var1 = 0; var1 < 2048; var1++) {
            class20 var5 = class364.field5092[var1];
            if (var5 != null) {
                var5.field423 = null;
                for (int var6 = 0; var6 < var5.field416.length; var6++) {
                    var5.field416[var6] = null;
                }
            }
        }
        for (int var2 = 0; var2 < class604.field8710; var2++) {
            class585 var3 = class179.field2310[var2].field6729;
            if (var3 != null) {
                for (int var4 = 0; var4 < var3.field416.length; var4++) {
                    var3.field416[var4] = null;
                }
            }
        }
        class643.field9335 = null;
        class82.field1116 = null;
        class301.field3918.method920(-128);
        class301.field3918 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method2992(int arg0, String arg1, int arg2) {
        class118.method650(true, class203.field2668);
        class344.field4767++;
        field7525++;
        class272.field3457.method3060(class194.method1241(arg1, arg2 ^ 0xFFFFFF87) + 1, -25098);
        class272.field3457.method3080(-99, arg0);
        if (arg2 != 2) {
            method2990(-128, (byte) 49, -85);
        }
        class272.field3457.method3040(false, arg1);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILld;J)V")
    public final void method2993(int arg0, class561 arg1, long arg2) {
        field7522++;
        if (this.field7531 == arg0) {
            class561 var5 = this.field7530.method2226(0);
            var5.method589(-8880);
            var5.method3149(-18724);
            if (this.field7527 == var5) {
                class561 var6 = this.field7530.method2226(0);
                var6.method589(-8880);
                var6.method3149(-18724);
            }
        } else {
            this.field7531--;
        }
        this.field7528.method3475(arg0 ^ 0xFFFFFFA2, arg1, arg2);
        this.field7530.method2228((byte) 42, arg1);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIII)V")
    public static final void method2994(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7519++;
        int var5 = 0;
        int var6 = arg3;
        int var7 = -arg3;
        int var8 = arg0;
        int var9 = class69.method398((byte) -127, arg1 + arg3, class355.field4972, class594.field8575);
        int var10 = class69.method398((byte) -117, arg1 - arg3, class355.field4972, class594.field8575);
        class373.method2275((byte) -9, var9, arg4, var10, class256.field3173[arg2]);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg2 - var6;
                int var12 = arg2 + var6;
                if (var12 >= class535.field7467 && var11 <= class113.field1453) {
                    int var13 = class69.method398((byte) 39, arg1 + var5, class355.field4972, class594.field8575);
                    int var14 = class69.method398((byte) -119, arg1 - var5, class355.field4972, class594.field8575);
                    if (var12 <= class113.field1453) {
                        class373.method2275((byte) -9, var13, arg4, var14, class256.field3173[var12]);
                    }
                    if (var11 >= class535.field7467) {
                        class373.method2275((byte) -9, var13, arg4, var14, class256.field3173[var11]);
                    }
                }
            }
            var5++;
            int var15 = arg2 - var5;
            int var16 = arg2 + var5;
            if (var16 >= class535.field7467 && class113.field1453 >= var15) {
                int var17 = class69.method398((byte) -11, arg1 + var6, class355.field4972, class594.field8575);
                int var18 = class69.method398((byte) -121, arg1 - var6, class355.field4972, class594.field8575);
                if (var16 <= class113.field1453) {
                    class373.method2275((byte) -9, var17, arg4, var18, class256.field3173[var16]);
                }
                if (class535.field7467 <= var15) {
                    class373.method2275((byte) -9, var17, arg4, var18, class256.field3173[var15]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IJ)Lld;")
    public final class561 method2995(int arg0, long arg1) {
        if (arg0 != 791) {
            method2991(-116);
        }
        field7518++;
        class561 var4 = (class561) this.field7528.method3476(arg1, (byte) 28);
        if (var4 != null) {
            this.field7530.method2228((byte) 119, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
    public final void method2996(byte arg0) {
        field7524++;
        this.field7530.method2227(16383);
        if (arg0 < -127) {
            this.field7528.method3472((byte) -128);
            this.field7527 = new class561();
            this.field7531 = this.field7532;
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(I)V")
    public class538(int arg0) {
        this.field7532 = arg0;
        this.field7531 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field7528 = new class607(var2);
    }
}
