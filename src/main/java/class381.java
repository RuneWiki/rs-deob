import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class381 {

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "[F")
    public static float[] field5572;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "[F")
    public static float[] field5571;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field5561;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field5562;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field5564;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field5565;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "[B")
    public byte[] field5569;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "[S")
    public short[] field5563;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "[S")
    public short[] field5568;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "[S")
    public short[] field5570;

    static {
        new class466("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
        field5572 = new float[16384];
        field5571 = new float[16384];
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field5571[var2] = (float) Math.sin((double) var2 * var0);
            field5572[var2] = (float) Math.cos((double) var2 * var0);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lnh;)V", line = 4)
    public static final void method2258(class525 arg0) {
        if (class510.field7569 >= 65535) {
            return;
        }
        class153 var1 = arg0.field7770;
        class94.field1451[class510.field7569] = arg0;
        class37.field466[class510.field7569] = false;
        class510.field7569++;
        int var2 = arg0.field7772;
        if (arg0.field7758) {
            var2 = 0;
        }
        int var3 = arg0.field7772;
        if (arg0.field7760) {
            var3 = class253.field3523 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method1027(-601) + class131.field1925 - var1.method1029((byte) -128) >> class523.field7736;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method1027(-601) + var1.method1029((byte) -128) - class131.field1925 >> class523.field7736;
            if (var7 >= class371.field5427) {
                var7 = class371.field5427 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field7767[var5++];
                int var10 = (var1.method1026(true) + class131.field1925 - var1.method1029((byte) -122) >> class523.field7736) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class206.field2881) {
                    var11 = class206.field2881 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class243.field3402[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class243.field3402[var4][var12][var8] = var13 | (long) class510.field7569;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class243.field3402[var4][var12][var8] = var13 | (long) class510.field7569 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class243.field3402[var4][var12][var8] = var13 | (long) class510.field7569 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class243.field3402[var4][var12][var8] = var13 | (long) class510.field7569 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(CLjava/lang/String;Z)I", line = 96)
    public static final int method2259(char arg0, String arg1, boolean arg2) {
        if (!arg2) {
            field5571 = null;
        }
        field5565++;
        int var3 = 0;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg1.charAt(var5) == arg0) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V", line = 130)
    public static void method2260(int arg0) {
        field5572 = null;
        field5571 = null;
        if (arg0 != 0) {
            method2262(72, -31, -123, -39);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)V", line = 142)
    public static final void method2261(int arg0, int arg1, int arg2) {
        if (class296.field4073 == 1) {
            class48.method426(arg1, arg2, class502.field7404, arg0 - 100);
        } else if (class296.field4073 == 2) {
            class323.method1870(arg1, arg2, false);
        }
        field5561++;
        class502.field7404 = null;
        class296.field4073 = arg0;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIII)I", line = 158)
    public static final int method2262(int arg0, int arg1, int arg2, int arg3) {
        field5564++;
        if (class373.field5474 < 100) {
            return -2;
        }
        if (arg2 != 255) {
            field5571 = null;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        int var6 = arg3 - class350.field5133;
        int var7 = arg1 - class350.field5124;
        for (class109 var8 = (class109) class350.field5114.method2818((byte) 117); var8 != null; var8 = (class109) class350.field5114.method2820((byte) -58)) {
            if (var8.field1639 == arg0) {
                int var9 = var8.field1645;
                int var10 = var8.field1644;
                int var11 = class350.field5133 + var9 << 14 | class350.field5124 + var10;
                int var12 = (var7 - var10) * (var7 - var10) + (var6 - var9) * (var6 - var9);
                if (var4 < 0 || var12 < var5) {
                    var5 = var12;
                    var4 = var11;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIILjo;I)V", line = 208)
    public static final void method2263(int arg0, int arg1, int arg2, class220 arg3, int arg4) {
        field5567++;
        class365 var5 = (class365) class490.field7151.method2818((byte) -50);
        if (arg4 != -2063105817) {
            return;
        }
        while (var5 != null) {
            if (var5.field5339 == arg1 && arg2 << 7 == var5.field5347 && (arg0 << 7) == var5.field5335 && var5.field5361.field3110 == arg3.field3110) {
                if (var5.field5356 != null) {
                    class361.field5267.method582(var5.field5356);
                    var5.field5356 = null;
                }
                if (var5.field5342 != null) {
                    class361.field5267.method582(var5.field5342);
                    var5.field5342 = null;
                }
                var5.method1565(0);
                return;
            }
            var5 = (class365) class490.field7151.method2820((byte) -58);
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)Z", line = 256)
    public static final boolean method2264(int arg0) {
        if (arg0 != 12648) {
            return false;
        }
        field5566++;
        if (class194.field2769) {
            try {
                if ((Boolean) class390.method2298("showingVideoAd", class202.field2840.field7425, (byte) 64)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }
}
