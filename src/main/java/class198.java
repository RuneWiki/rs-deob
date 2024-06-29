import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class198 extends class84 {

    @OriginalMember(owner = "client!ol", name = "W", descriptor = "I")
    public static int field3157 = 0;

    @OriginalMember(owner = "client!ol", name = "bb", descriptor = "I")
    public static int field3162 = -1;

    @OriginalMember(owner = "client!ol", name = "Y", descriptor = "I")
    public static int field3159 = 0;

    @OriginalMember(owner = "client!ol", name = "Z", descriptor = "I")
    public static int field3160 = 0;

    @OriginalMember(owner = "client!ol", name = "eb", descriptor = "Z")
    public static boolean field3165 = true;

    @OriginalMember(owner = "client!ol", name = "gb", descriptor = "S")
    public static short field3167 = 1;

    @OriginalMember(owner = "client!ol", name = "cb", descriptor = "B")
    public byte field3163;

    @OriginalMember(owner = "client!ol", name = "T", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!ol", name = "U", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!ol", name = "V", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!ol", name = "X", descriptor = "I")
    public int field3158;

    @OriginalMember(owner = "client!ol", name = "ab", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!ol", name = "db", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!ol", name = "fb", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!ol", name = "hb", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!ol", name = "S", descriptor = "Lqm;")
    public class227 field3153;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "(I)V", line = 6)
    public static final void method1523(int arg0) {
        field3154++;
        class216.field3467.method2326(-4);
        if (arg0 < 88) {
            method1524(-110, 126);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)Ld;", line = 19)
    public static final class43 method1524(int arg0, int arg1) {
        field3155++;
        class43 var2 = (class43) class311.field4956.method2329((byte) 107, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class358.field5675.method472(class344.method2425(arg0, (byte) -16), 107, class336.method2342((byte) -27, arg0));
        class43 var4 = new class43();
        var4.field671 = arg0;
        if (var3 != null) {
            var4.method317(new class227(var3), 0);
        }
        var4.method323(24418);
        int var5 = -101 % ((arg1 - 11) / 55);
        class311.field4956.method2333((long) arg0, 0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "(B)[B", line = 45)
    public final byte[] method676(byte arg0) {
        field3161++;
        if (this.field1434 || this.field3153.field3760 < this.field3153.field3793.length - this.field3163) {
            throw new RuntimeException();
        } else if (arg0 > -73) {
            return (byte[]) null;
        } else {
            return this.field3153.field3793;
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(Z)V", line = 69)
    public static final void method1525(boolean arg0) {
        class20.method113(!arg0, class127.field2147);
        field3164++;
        int var1 = (class93.field1562 >> 3) + (class281.field4617 >> 10);
        byte var2 = 0;
        int var3 = (class229.field3807 >> 10) + (class275.field4546 >> 3);
        byte var4 = 8;
        byte var5 = 8;
        byte var6 = 18;
        class310.field4951 = new int[var6];
        class133.field2247 = new int[var6];
        class16.field190 = new byte[var6][];
        class300.field4827 = new int[var6][4];
        class46.field749 = new int[var6];
        class121.field2079 = new int[var6];
        class160.field2546 = new byte[var6][];
        class24.field295 = new byte[var6][];
        class227.field3786 = new byte[var6][];
        class137.field2275 = new int[var6];
        class340.field5434 = new int[var6];
        class352.field5584 = new byte[var6][];
        int var7 = 0;
        for (int var8 = (var1 - 6) / 8; var8 <= (var1 + 6) / 8; var8++) {
            for (int var9 = (var3 - 6) / 8; var9 <= ((var3 + 6) / 8); var9++) {
                int var10 = (var8 << 8) + var9;
                class121.field2079[var7] = var10;
                class46.field749[var7] = class340.field5425.method483(-1, "m" + var8 + "_" + var9);
                class310.field4951[var7] = class340.field5425.method483(-1, "l" + var8 + "_" + var9);
                class137.field2275[var7] = class340.field5425.method483(-1, "n" + var8 + "_" + var9);
                class340.field5434[var7] = class340.field5425.method483(-1, "um" + var8 + "_" + var9);
                class133.field2247[var7] = class340.field5425.method483(-1, "ul" + var8 + "_" + var9);
                if (class137.field2275[var7] == -1) {
                    class46.field749[var7] = -1;
                    class310.field4951[var7] = -1;
                    class340.field5434[var7] = -1;
                    class133.field2247[var7] = -1;
                }
                var7++;
            }
        }
        for (int var11 = var7; var11 < class137.field2275.length; var11++) {
            class137.field2275[var11] = -1;
            class46.field749[var11] = -1;
            class310.field4951[var11] = -1;
            class340.field5434[var11] = -1;
            class133.field2247[var11] = -1;
        }
        class89.method705(var2, var5, arg0, var1, -17690, var3, var4, true);
    }

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "(B)I", line = 149)
    public final int method675(byte arg0) {
        if (arg0 <= 78) {
            field3167 = -5;
        }
        field3166++;
        return this.field3153 == null ? 0 : this.field3153.field3760 * 100 / (this.field3153.field3793.length - this.field3163);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIIB)V", line = 164)
    public static final void method1526(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field3156++;
        int var6 = arg3 - arg1;
        int var7 = arg2 - arg0;
        if (var7 == 0) {
            if (var6 != 0) {
                class177.method1394(arg4, (byte) -73, arg3, arg0, arg1);
            }
        } else if (var6 == 0) {
            class59.method499(arg1, arg2, (byte) -35, arg0, arg4);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg2;
                int var10 = arg0;
                arg0 = arg1;
                arg2 = arg3;
                arg3 = var9;
                arg1 = var10;
            }
            if (arg2 < arg0) {
                int var11 = arg1;
                int var12 = arg0;
                arg0 = arg2;
                arg1 = arg3;
                arg3 = var11;
                arg2 = var12;
            }
            if (arg5 != -70) {
                method1525(true);
            }
            int var13 = arg1;
            int var14 = arg2 - arg0;
            int var15 = arg3 - arg1;
            int var16 = -(var14 >> 1);
            if (var15 < 0) {
                var15 = -var15;
            }
            int var17 = arg1 >= arg3 ? -1 : 1;
            if (var8) {
                for (int var19 = arg0; var19 <= arg2; var19++) {
                    var16 += var15;
                    class353.field5599[var19][var13] = arg4;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var18 = arg0; var18 <= arg2; var18++) {
                    class353.field5599[var13][var18] = arg4;
                    var16 += var15;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            }
        }
    }
}
