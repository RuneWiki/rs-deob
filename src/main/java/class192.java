import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class192 extends class199 {

    @OriginalMember(owner = "client!ck", name = "W", descriptor = "I")
    private int field2653 = 3216;

    @OriginalMember(owner = "client!ck", name = "T", descriptor = "I")
    private int field2650 = 3216;

    @OriginalMember(owner = "client!ck", name = "X", descriptor = "I")
    private int field2654 = 4096;

    @OriginalMember(owner = "client!ck", name = "eb", descriptor = "[I")
    private int[] field2661 = new int[3];

    @OriginalMember(owner = "client!ck", name = "ab", descriptor = "Z")
    public static boolean field2657 = false;

    @OriginalMember(owner = "client!ck", name = "S", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!ck", name = "U", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!ck", name = "V", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!ck", name = "Y", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!ck", name = "Z", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!ck", name = "cb", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!ck", name = "db", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!ck", name = "gb", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!ck", name = "hb", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!ck", name = "bb", descriptor = "Lfm;")
    public static class179 field2658;

    @OriginalMember(owner = "client!ck", name = "fb", descriptor = "[Luj;")
    public static class158[] field2662;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZC)Z", line = 10)
    public static final boolean method1391(boolean arg0, char arg1) {
        field2664++;
        if (!arg0) {
            field2662 = (class158[]) null;
        }
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V", line = 131)
    public class192() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIILvc;IJZ)Z", line = 25)
    public static final boolean method1392(int arg0, int arg1, int arg2, int arg3, int arg4, class260 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class283.method1925(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "(B)V", line = 61)
    public static final void method1393(byte arg0) {
        field2655++;
        if (class56.field724 == class297.field4308) {
            return;
        }
        if (class139.method1054(10, class56.field724)) {
            class297.field4308 = class56.field724;
        }
        if (arg0 > -38) {
            method1391(true, (char) 65535);
        }
    }

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "(B)Z", line = 83)
    public static final boolean method1394(byte arg0) {
        field2663++;
        try {
            if (class194.field2673 == 2) {
                if (class172.field2385 == null) {
                    class172.field2385 = class164.method1236(class229.field3287, class317.field4671, class314.field4639);
                    if (class172.field2385 == null) {
                        return false;
                    }
                }
                if (class100.field1315 == null) {
                    class100.field1315 = new class82(class156.field2160, class229.field3278);
                }
                if (class360.field5630.method1533(22050, 0, class172.field2385, class44.field541, class100.field1315)) {
                    class360.field5630.method1531((byte) 15);
                    class360.field5630.method1501(128, class172.field2384);
                    class360.field5630.method1526(class29.field330, class172.field2385, (byte) 119);
                    class100.field1315 = null;
                    class172.field2385 = null;
                    class229.field3287 = null;
                    class194.field2673 = 0;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class360.field5630.method1523(21229);
            class100.field1315 = null;
            class194.field2673 = 0;
            class229.field3287 = null;
            class172.field2385 = null;
        }
        return arg0 <= 125 ? false : false;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BLfd;I)V", line = 136)
    public final void method193(byte arg0, class299 arg1, int arg2) {
        field2651++;
        if (arg2 == 0) {
            this.field2654 = arg1.method2083((byte) -92);
        } else if (arg2 == 1) {
            this.field2653 = arg1.method2083((byte) -31);
        } else if (arg2 == 2) {
            this.field2650 = arg1.method2083((byte) -40);
        }
        if (arg0 != -43) {
            method1395(16);
        }
    }

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "(I)V", line = 192)
    public static void method1395(int arg0) {
        field2662 = null;
        if (arg0 == -23112) {
            field2658 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "(B)V", line = 203)
    public final void method189(byte arg0) {
        field2652++;
        this.method1397((byte) -92);
        int var2 = 81 / ((36 - arg0) / 44);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)[I", line = 218)
    public final int[] method190(int arg0, int arg1) {
        int[] var3 = this.field2802.method2502(arg1, -81);
        if (arg0 != -1735) {
            this.field2654 = -70;
        }
        if (this.field2802.field5637) {
            int var4 = class116.field1505 * this.field2654 >> 12;
            int[] var5 = this.method1467(arg0 ^ 0x1895, arg1 - 1 & class156.field2165, 0);
            int[] var6 = this.method1467(arg0 - 6029, arg1, 0);
            int[] var7 = this.method1467(arg0 - 6029, class156.field2165 & arg1 - -1, 0);
            for (int var8 = 0; var8 < class95.field1235; var8++) {
                int var9 = (var6[class245.field3573 & var8 - 1] - var6[class245.field3573 & var8 + 1]) * var4 >> 12;
                int var10 = var9 >> 4;
                int var11 = (var7[var8] - var5[var8]) * var4 >> 12;
                if (var10 < 0) {
                    var10 = -var10;
                }
                int var12 = var11 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                if (var10 > 255) {
                    var10 = 255;
                }
                int var13 = class159.field2266[var10 + ((var12 + 1) * var12 >> 1)] & 0xFF;
                int var14 = var9 * var13 >> 8;
                int var15 = var11 * var13 >> 8;
                int var16 = this.field2661[0] * var14 >> 12;
                int var17 = var13 * 4096 >> 8;
                int var18 = this.field2661[1] * var15 >> 12;
                int var19 = this.field2661[2] * var17 >> 12;
                var3[var8] = var16 + var18 + var19;
            }
        }
        field2656++;
        return var3;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IJ)V", line = 286)
    public static final void method1396(int arg0, long arg1) {
        if (!class48.field638) {
            class302.field4426 += (float) arg1 * class33.field408 / 40.0F;
            class247.field3601 += (float) arg1 * class206.field2874 / 40.0F;
        }
        field2659++;
        if (arg0 != 0) {
            method1391(false, '\u001d');
        }
        int var3 = class359.field5616.field4893 + class91.field1155;
        int var4 = class154.field2143 + class359.field5616.field4855;
        if (class322.field4730 - var4 < -500 || (class322.field4730 - var4) > 500 || (class135.field1845 - var3) < -500 || class135.field1845 - var3 > 500) {
            class135.field1845 = var3;
            class322.field4730 = var4;
        }
        if (class322.field4730 != var4) {
            int var5 = var4 - class322.field4730;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var6 < var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var6 > var5) {
                var6 = var5;
            }
            class322.field4730 += var6;
        }
        if (class135.field1845 != var3) {
            int var7 = var3 - class135.field1845;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class135.field1845 += var8;
        }
        class144.method1125((byte) 35);
    }

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "(B)V", line = 376)
    private final void method1397(byte arg0) {
        field2649++;
        double var2 = Math.cos((double) ((float) this.field2650 / 4096.0F));
        this.field2661[0] = (int) (Math.sin((double) ((float) this.field2653 / 4096.0F)) * 4096.0D * var2);
        this.field2661[1] = (int) (Math.cos((double) ((float) this.field2653 / 4096.0F)) * var2 * 4096.0D);
        this.field2661[2] = (int) (Math.sin((double) ((float) this.field2650 / 4096.0F)) * 4096.0D);
        int var4 = this.field2661[0] * this.field2661[0] >> 12;
        int var5 = this.field2661[2] * this.field2661[2] >> 12;
        int var6 = this.field2661[1] * this.field2661[1] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var5 + var6 >> 12)) * 4096.0D);
        if (arg0 == -92 && var7 != 0) {
            this.field2661[0] = (this.field2661[0] << 12) / var7;
            this.field2661[2] = (this.field2661[2] << 12) / var7;
            this.field2661[1] = (this.field2661[1] << 12) / var7;
        }
    }
}
