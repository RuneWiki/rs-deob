import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class171 extends class335 {

    @OriginalMember(owner = "client!bl", name = "R", descriptor = "I")
    private int field2592 = 0;

    @OriginalMember(owner = "client!bl", name = "M", descriptor = "I")
    private int field2587 = 5;

    @OriginalMember(owner = "client!bl", name = "N", descriptor = "I")
    private int field2588 = 2;

    @OriginalMember(owner = "client!bl", name = "ab", descriptor = "I")
    private int field2601 = 2048;

    @OriginalMember(owner = "client!bl", name = "bb", descriptor = "[S")
    private short[] field2602 = new short[512];

    @OriginalMember(owner = "client!bl", name = "P", descriptor = "I")
    private int field2590 = 1;

    @OriginalMember(owner = "client!bl", name = "Z", descriptor = "I")
    private int field2600 = 5;

    @OriginalMember(owner = "client!bl", name = "fb", descriptor = "[B")
    private byte[] field2606 = new byte[512];

    @OriginalMember(owner = "client!bl", name = "W", descriptor = "I")
    public static int field2597 = 0;

    @OriginalMember(owner = "client!bl", name = "Q", descriptor = "Lba;")
    public static class53 field2591 = new class53(64);

    @OriginalMember(owner = "client!bl", name = "db", descriptor = "I")
    public static int field2604 = 0;

    @OriginalMember(owner = "client!bl", name = "hb", descriptor = "I")
    public static int field2608 = 7759444;

    @OriginalMember(owner = "client!bl", name = "ib", descriptor = "I")
    public static int field2609 = 1;

    @OriginalMember(owner = "client!bl", name = "L", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!bl", name = "O", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!bl", name = "S", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!bl", name = "T", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!bl", name = "U", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!bl", name = "V", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!bl", name = "X", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!bl", name = "Y", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!bl", name = "cb", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!bl", name = "eb", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!bl", name = "gb", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "(I)V", line = 5)
    private final void method1233(int arg0) {
        Random var2 = new Random((long) this.field2592);
        this.field2602 = new short[512];
        field2594++;
        if (arg0 == 12765 && this.field2601 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field2602[var3] = (short) class85.method615(var2, this.field2601, true);
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILtb;)Ljava/lang/String;", line = 31)
    public static final String method1234(int arg0, class220 arg1) {
        field2589++;
        if (client.method393(arg1).method1088((byte) -128) == 0) {
            return null;
        }
        int var2 = 2 / ((arg0 + 75) / 37);
        if (arg1.field3533 == null || arg1.field3533.trim().length() == 0) {
            return class175.field2653 ? "Hidden-use" : null;
        } else {
            return arg1.field3533;
        }
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(B)V", line = 54)
    public static final void method1235(byte arg0) {
        class146.method1027(-20497);
        class208.method1481(110);
        field2593++;
        class178.method1266((byte) -75);
        class187.method1335(-93);
        class59.method461(false);
        if (arg0 >= -74) {
            method1238((byte) 115, -46);
        }
        class152.method1053((byte) 121);
        class318.method2160(101);
        class107.method783(128);
        class76.method558((byte) -113);
        class103.method744(8);
        class259.method1772(16582);
        class156.method1064(124);
        class220.method1555(-125);
        class337.method2338(-16622);
        class50.method425(true);
        class98.method724(false);
        class2.method12((byte) 85);
        class312.method2119(true);
        if (class308.field4780 != 0) {
            for (int var1 = 0; var1 < class188.field2812.length; var1++) {
                class188.field2812[var1] = null;
            }
            class32.field461 = 0;
        }
        class110.method821(-1);
        class115.method852(-1);
        class338.field5280.method2176((byte) -24);
        if (!class94.field1516) {
            ((class315) class15.field207).method2142((byte) 118);
        }
        class16.field230.method440((byte) -111);
        class91.field1446.method955((byte) 119);
        class227.field3603.method955((byte) 97);
        class101.field1585.method955((byte) 46);
        class104.field1615.method955((byte) 70);
        class225.field3575.method955((byte) 107);
        class192.field2872.method955((byte) 127);
        class298.field4597.method955((byte) 76);
        class186.field2788.method955((byte) 123);
        class295.field4561.method955((byte) 89);
        class60.field974.method955((byte) 82);
        class62.field996.method955((byte) 42);
        class278.field4288.method2176((byte) 98);
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V", line = 116)
    public class171() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(B)V", line = 122)
    public static void method1236(byte arg0) {
        field2591 = null;
        if (arg0 != -21) {
            field2608 = -79;
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)[I", line = 141)
    public final int[] method149(int arg0, int arg1) {
        field2595++;
        if (arg1 != 621) {
            field2607 = 109;
        }
        int[] var3 = this.field5233.method1110((byte) 108, arg0);
        if (this.field5233.field2467) {
            int var4 = class280.field4316[arg0] * this.field2600 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class105.field1630; var7++) {
                class264.field4098 = Integer.MAX_VALUE;
                class12.field192 = Integer.MAX_VALUE;
                class225.field3584 = Integer.MAX_VALUE;
                class34.field514 = Integer.MAX_VALUE;
                int var8 = class90.field1437[var7] * this.field2587 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field2606[(var11 >= this.field2600 ? var11 - this.field2600 : var11) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field2606[var12 + (var13 >= this.field2587 ? var13 - this.field2587 : var13) & 0xFF] & 0xFF) * 2;
                        int var27 = var14 + 1;
                        int var15 = var8 - (this.field2602[var14] + (var13 << 12));
                        int var16 = var4 - (var11 << 12) - this.field2602[var27];
                        int var17 = this.field2590;
                        int var18;
                        if (var17 == 1) {
                            var18 = var15 * var15 + var16 * var16 >> 12;
                        } else if (var17 == 3) {
                            int var24 = var15 < 0 ? -var15 : var15;
                            int var25 = var16 < 0 ? -var16 : var16;
                            var18 = var24 <= var25 ? var25 : var24;
                        } else if (var17 == 4) {
                            int var19 = (int) (Math.sqrt((double) ((float) (var15 >= 0 ? var15 : -var15) / 4096.0F)) * 4096.0D);
                            int var20 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                            int var21 = var19 + var20;
                            var18 = var21 * var21 >> 12;
                        } else if (var17 == 5) {
                            int var22 = var16 * var16;
                            int var23 = var15 * var15;
                            var18 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var23 + var22) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var18 = (var16 >= 0 ? var16 : -var16) + (var15 >= 0 ? var15 : -var15);
                        } else {
                            var18 = (int) (Math.sqrt((double) ((float) (var15 * var15 + var16 * var16) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (class34.field514 > var18) {
                            class264.field4098 = class12.field192;
                            class12.field192 = class225.field3584;
                            class225.field3584 = class34.field514;
                            class34.field514 = var18;
                        } else if (var18 < class225.field3584) {
                            class264.field4098 = class12.field192;
                            class12.field192 = class225.field3584;
                            class225.field3584 = var18;
                        } else if (class12.field192 > var18) {
                            class264.field4098 = class12.field192;
                            class12.field192 = var18;
                        } else if (var18 < class264.field4098) {
                            class264.field4098 = var18;
                        }
                    }
                }
                int var26 = this.field2588;
                if (var26 == 0) {
                    var3[var7] = class34.field514;
                } else if (var26 == 1) {
                    var3[var7] = class225.field3584;
                } else if (var26 == 3) {
                    var3[var7] = class12.field192;
                } else if (var26 == 4) {
                    var3[var7] = class264.field4098;
                } else if (var26 == 2) {
                    var3[var7] = class225.field3584 - class34.field514;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILkh;I)V", line = 370)
    public final void method230(int arg0, class166 arg1, int arg2) {
        if (arg0 == 0) {
            this.field2587 = this.field2600 = arg1.method1178(0);
        } else if (arg0 == 1) {
            this.field2592 = arg1.method1178(0);
        } else if (arg0 == 2) {
            this.field2601 = arg1.method1151(-83);
        } else if (arg0 == 3) {
            this.field2588 = arg1.method1178(0);
        } else if (arg0 == 4) {
            this.field2590 = arg1.method1178(0);
        } else if (arg0 == 5) {
            this.field2587 = arg1.method1178(0);
        } else if (arg0 == 6) {
            this.field2600 = arg1.method1178(0);
        }
        field2599++;
        if (arg2 <= 51) {
            this.method149(-34, 73);
        }
    }

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "(B)V", line = 429)
    public static final void method1237(byte arg0) {
        class325.field5058++;
        class106.field1642.method753(126, 53);
        class106.field1642.method1132((byte) 29, class256.method1759(92));
        field2603++;
        class106.field1642.method1150(class188.field2816, -628562744);
        class106.field1642.method1150(class322.field5024, -628562744);
        class106.field1642.method1132((byte) 29, class181.field2734);
        if (arg0 < 31) {
            field2609 = -100;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BI)V", line = 451)
    public static final void method1238(byte arg0, int arg1) {
        field2598++;
        if (class225.field3583 == 0) {
            class160.field2416.method1939(arg1, (byte) 31);
        } else {
            class48.field781 = arg1;
        }
        int var2 = 82 % ((41 - arg0) / 63);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 474)
    public static final String method1239(String arg0, byte arg1, String arg2, String arg3) {
        if (arg1 < 115) {
            method1238((byte) 120, 57);
        }
        int var4 = arg0.indexOf(arg3);
        field2596++;
        while (var4 != -1) {
            arg0 = arg0.substring(0, var4) + arg2 + arg0.substring(var4 + arg3.length());
            var4 = arg0.indexOf(arg3, arg2.length() + var4);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "(I)V", line = 498)
    public final void method381(int arg0) {
        this.field2606 = class313.method2122(this.field2592, (byte) 87);
        field2605++;
        this.method1233(12765);
        int var2 = 120 / ((44 - arg0) / 35);
    }
}
