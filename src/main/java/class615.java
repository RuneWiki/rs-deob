import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class615 {

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "[I")
    public static int[] field9104 = new int[256];

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "Lbu;")
    public static class19 field9103 = new class19();

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
    public static int field9105;

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "I")
    public static int field9106;

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
    public static int field9108;

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field9107;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)V")
    public static void method3607(byte arg0) {
        if (arg0 <= -5) {
            field9104 = null;
            field9103 = null;
        }
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "()V")
    public class615() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "([BLgw;I)V")
    public final void method3608(byte[] arg0, class148 arg1, int arg2) {
        field9105++;
        if (arg1.field2146[arg1.field2177] != 31 || arg1.field2146[arg1.field2177 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field9107 == null) {
            this.field9107 = new Inflater(true);
        }
        try {
            this.field9107.setInput(arg1.field2146, arg1.field2177 + 10, arg1.field2146.length - (arg1.field2177 + 10 + 8));
            this.field9107.inflate(arg0);
            int var4 = -4 / ((arg2 - 38) / 43);
        } catch (Exception var5) {
            this.field9107.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field9107.reset();
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lqa;Lvp;III)V")
    public static final void method3609(class208 arg0, class162 arg1, int arg2, int arg3, int arg4) {
        field9106++;
        class311 var5 = arg1.method1170(arg0, (byte) 3);
        if (var5 == null) {
            return;
        }
        arg0.method510(arg3, arg4, arg1.field2527 + arg3, arg4 - -arg1.field2459);
        if (arg2 > -49) {
            field9104 = null;
        }
        if (class588.field8727 == 2 || class588.field8727 == 5 || class302.field4155 == null) {
            arg0.method462(-16777216, var5, arg3, arg4);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class531.field7929 == 4) {
            var6 = (int) (-class539.field8023) & 0x3FFF;
            var7 = class214.field3160;
            var8 = class399.field5489;
            var9 = 4096;
        } else {
            var6 = (int) (-class539.field8023) + class300.field4113 & 0x3FFF;
            var7 = class541.field8119.field8496;
            var8 = class541.field8119.field8500;
            var9 = 4096 - (class449.field6301 * 16);
        }
        int var10 = var7 / 32 + 48 - ((class146.field2125 - 104) * 2);
        int var11 = class410.field5609 * 4 + 48 - (var8 / 32) - ((class410.field5609 + -104) * 2);
        class302.field4155.method330((float) arg1.field2527 / 2.0F + (float) arg3, (float) arg1.field2459 / 2.0F + (float) arg4, (float) var10, (float) var11, var9, var6 << 2, var5, arg3, arg4);
        for (class556 var12 = (class556) class89.field1335.method124((byte) 42); var12 != null; var12 = (class556) class89.field1335.method120(91)) {
            int var58 = var12.field8278;
            int var59 = (class406.field5552.field7136[var58] >> 14 & 0x3FFF) - class473.field6687;
            int var60 = (class406.field5552.field7136[var58] & 0x3FFF) - class38.field463;
            int var61 = var59 * 4 + 2 - (var7 / 32);
            int var62 = var60 * 4 + (2 - var8 / 32);
            class333.method2032(var61, arg1, arg0, arg3, var5, class406.field5552.field7140[var58], -2, var62, arg4);
        }
        for (int var13 = 0; var13 < class261.field3739; var13++) {
            int var55 = class396.field5458[var13] * 4 + 2 - (var7 / 32);
            int var56 = class502.field7119[var13] * 4 + 2 - (var8 / 32);
            class145 var57 = class216.field3172.method1505(-24044, class216.field3174[var13]);
            if (var57.field2028 != null) {
                var57 = var57.method991(class556.field8280, true);
                if (var57 == null || var57.field2070 == -1) {
                    continue;
                }
            }
            class333.method2032(var55, arg1, arg0, arg3, var5, var57.field2070, -2, var56, arg4);
        }
        for (class85 var14 = (class85) class45.field544.method2798((byte) -56); var14 != null; var14 = (class85) class45.field544.method2806(true)) {
            int var50 = (int) (var14.field5651 >> 28 & 0x3L);
            if (class428.field5755 == var50) {
                int var51 = (int) (var14.field5651 & 0x3FFFL) - class473.field6687;
                int var52 = (int) (var14.field5651 >> 14 & 0x3FFFL) - class38.field463;
                int var53 = var51 * 4 + 2 - (var7 / 32);
                int var54 = var52 * 4 + 2 - var8 / 32;
                class440.method2558(arg1, var53, var5, arg4, class408.field5574[0], 11643, var54, arg3);
            }
        }
        for (int var15 = 0; var15 < class527.field7717; var15++) {
            class505 var45 = (class505) class510.field7260.method2799((long) class634.field9290[var15], true);
            if (var45 != null) {
                class571 var46 = var45.field7148;
                if (var46.method3403(0) && class541.field8119.field8501 == var46.field8501) {
                    class87 var47 = var46.field8405;
                    if (var47 != null && var47.field1314 != null) {
                        var47 = var47.method655((byte) 108, class556.field8280);
                    }
                    if (var47 != null && var47.field1249 && var47.field1294) {
                        int var48 = var46.field8496 / 32 - (var7 / 32);
                        int var49 = var46.field8500 / 32 - (var8 / 32);
                        if (var47.field1306 == -1) {
                            class440.method2558(arg1, var48, var5, arg4, class408.field5574[1], 11643, var49, arg3);
                        } else {
                            class333.method2032(var48, arg1, arg0, arg3, var5, var47.field1306, -2, var49, arg4);
                        }
                    }
                }
            }
        }
        int var16 = class551.field8224;
        int[] var17 = class314.field4332;
        for (int var18 = 0; var18 < var16; var18++) {
            class373 var37 = class293.field4036[var17[var18]];
            if (var37 != null && var37.method2223(0) && class541.field8119 != var37 && class541.field8119.field8501 == var37.field8501) {
                int var38 = var37.field8496 / 32 - (var7 / 32);
                int var39 = var37.field8500 / 32 - var8 / 32;
                boolean var40 = false;
                for (int var41 = 0; var41 < class304.field4180; var41++) {
                    if (var37.field5138.equals(class538.field8010[var41]) && class372.field5108[var41] != 0) {
                        var40 = true;
                        break;
                    }
                }
                boolean var42 = false;
                for (int var43 = 0; var43 < class125.field1764; var43++) {
                    if (var37.field5138.equals(class455.field6428[var43].field1971)) {
                        var42 = true;
                        break;
                    }
                }
                boolean var44 = false;
                if (class541.field8119.field5128 != 0 && var37.field5128 != 0 && class541.field8119.field5128 == var37.field5128) {
                    var44 = true;
                }
                if (var37.field5124) {
                    class440.method2558(arg1, var38, var5, arg4, class408.field5574[6], 11643, var39, arg3);
                } else if (var40) {
                    class440.method2558(arg1, var38, var5, arg4, class408.field5574[3], 11643, var39, arg3);
                } else if (var42) {
                    class440.method2558(arg1, var38, var5, arg4, class408.field5574[5], 11643, var39, arg3);
                } else if (var44) {
                    class440.method2558(arg1, var38, var5, arg4, class408.field5574[4], 11643, var39, arg3);
                } else {
                    class440.method2558(arg1, var38, var5, arg4, class408.field5574[2], 11643, var39, arg3);
                }
            }
        }
        class190[] var19 = class385.field5293;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class190 var23 = var19[var20];
            if (var23 != null && var23.field2821 != 0 && (class617.field9123 % 20) < 10) {
                if (var23.field2821 == 1) {
                    class505 var24 = (class505) class510.field7260.method2799((long) var23.field2824, true);
                    if (var24 != null) {
                        class571 var25 = var24.field7148;
                        int var26 = var25.field8496 / 32 - (var7 / 32);
                        int var27 = var25.field8500 / 32 - var8 / 32;
                        class266.method1676((byte) 69, arg1, var23.field2823, var26, var5, arg4, var27, arg3, 360000L);
                    }
                }
                if (var23.field2821 == 2) {
                    int var28 = var23.field2819 / 32 - (var7 / 32);
                    int var29 = var23.field2822 / 32 - (var8 / 32);
                    long var30 = (long) (var23.field2818 << 5);
                    long var32 = var30 * var30;
                    class266.method1676((byte) 69, arg1, var23.field2823, var28, var5, arg4, var29, arg3, var32);
                }
                if (var23.field2821 == 10 && var23.field2824 >= 0 && var23.field2824 < class293.field4036.length) {
                    class373 var34 = class293.field4036[var23.field2824];
                    if (var34 != null) {
                        int var35 = var34.field8496 / 32 - var7 / 32;
                        int var36 = var34.field8500 / 32 - (var8 / 32);
                        class266.method1676((byte) 69, arg1, var23.field2823, var35, var5, arg4, var36, arg3, 360000L);
                    }
                }
            }
        }
        if (class531.field7929 == 4) {
            return;
        }
        if (class618.field9137 != 0) {
            int var21 = class618.field9137 * 4 + (2 - var7 / 32) - (-(class541.field8119.method940(-1) * 2) + 2);
            int var22 = class349.field4776 * 4 + class541.field8119.method940(-1) * 2 + 2 - (var8 / 32) - 2;
            class440.method2558(arg1, var21, var5, arg4, class623.field9183[class5.field45 ? 1 : 0], 11643, var22, arg3);
        }
        arg0.method1378(true, arg1.field2527 / 2 + arg3 - 1, -1, 3, 3, arg1.field2459 / 2 + arg4 - 1);
        return;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method3610(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 15488) {
            method3607((byte) -99);
        }
        field9108++;
        if ((class146.field2114[0][arg3][arg2] & 0x2) != 0) {
            return true;
        } else if ((class146.field2114[arg4][arg3][arg2] & 0x10) == 0) {
            return class267.method1694(arg2, (byte) 122, arg3, arg4) == arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(III)V")
    private class615(int arg0, int arg1, int arg2) {
    }
}
