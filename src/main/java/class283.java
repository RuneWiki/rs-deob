import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class283 extends class175 {

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "Ljava/lang/String;")
    public static String field4509 = "Loading...";

    @OriginalMember(owner = "client!ak", name = "B", descriptor = "[[B")
    public static byte[][] field4511 = new byte[1000][];

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "I")
    public static int field4508 = 0;

    @OriginalMember(owner = "client!ak", name = "I", descriptor = "[I")
    public static int[] field4518 = new int[1000];

    @OriginalMember(owner = "client!ak", name = "K", descriptor = "[J")
    public static long[] field4520 = new long[100];

    @OriginalMember(owner = "client!ak", name = "D", descriptor = "F")
    public static float field4513;

    @OriginalMember(owner = "client!ak", name = "C", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!ak", name = "E", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!ak", name = "F", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!ak", name = "G", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!ak", name = "H", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!ak", name = "J", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!ak", name = "L", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!ak", name = "M", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!ak", name = "N", descriptor = "I")
    public int field4523;

    @OriginalMember(owner = "client!ak", name = "P", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!ak", name = "Q", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!ak", name = "R", descriptor = "I")
    public int field4527;

    @OriginalMember(owner = "client!ak", name = "S", descriptor = "I")
    public int field4528;

    @OriginalMember(owner = "client!ak", name = "O", descriptor = "Lmc;")
    public static class163 field4524;

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "Ljava/lang/String;")
    public String field4510;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "(I)V")
    public final void method1893(int arg0) {
        ++field4515;
        super.field2817 |= Long.MIN_VALUE;
        if (arg0 != 0) {
            field4520 = null;
        }
        if (~this.method1901(14065) == -1L) {
            class7.field83.method1634((byte) 46, this);
        }
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(Z)V")
    public static void method1894(boolean arg0) {
        if (!arg0) {
            field4511 = null;
            field4509 = null;
            field4520 = null;
            field4518 = null;
            field4524 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V")
    public static final void method1895(byte arg0) {
        int var1 = -46 / ((arg0 - 25) / 44);
        ++field4519;
        if (class220.method1463(0) == 2) {
            byte var2 = (byte) (255 & class23.field293 + -4);
            int var3 = class23.field293 % 104;
            for (int var4 = 0; var4 < 4; ++var4) {
                for (int var17 = 0; var17 < 104; ++var17) {
                    class243.field3894[var4][var3][var17] = var2;
                }
            }
            if (class28.field336 != 3) {
                for (int var5 = 0; var5 < 2; ++var5) {
                    class160.field2604[var5] = -1000000;
                    class164.field2664[var5] = 1000000;
                    class8.field110[var5] = 0;
                    class129.field2163[var5] = 1000000;
                    class16.field186[var5] = 0;
                }
                if (~class92.field1316 == -2) {
                    if ((class134.field2251[class28.field336][class197.field3179.field614 >> 7][class197.field3179.field613 >> 7] & 4) != 0) {
                        class172.method1198(0, class197.field3179.field613 >> 7, false, class273.field4415, class197.field3179.field614 >> 7, (byte) 24);
                    }
                    if (~class8.field119 > -311) {
                        int var6 = class44.field522 >> 7;
                        int var7 = class119.field2014 >> 7;
                        int var8 = class197.field3179.field613 >> 7;
                        int var9 = class197.field3179.field614 >> 7;
                        int var10;
                        if (var9 > var6) {
                            var10 = -var6 + var9;
                        } else {
                            var10 = -var9 + var6;
                        }
                        int var11;
                        if (~var7 > ~var8) {
                            var11 = -var7 + var8;
                        } else {
                            var11 = -var8 + var7;
                        }
                        if ((var10 != 0 || ~var11 != -1) && ~var10 < 103 && var10 < 104 && ~var11 < 103 && var11 < 104) {
                            if (var11 < var10) {
                                int var12 = var11 * 65536 / var10;
                                int var13 = 32768;
                                while (~var6 != ~var9) {
                                    if (~var6 > ~var9) {
                                        ++var6;
                                    } else if (var9 < var6) {
                                        --var6;
                                    }
                                    if ((4 & class134.field2251[class28.field336][var6][var7]) != 0) {
                                        class172.method1198(1, var7, false, class273.field4415, var6, (byte) 24);
                                        return;
                                    }
                                    var13 += var12;
                                    if (var13 >= 65536) {
                                        var13 -= 65536;
                                        if (var7 < var8) {
                                            ++var7;
                                        } else if (var8 < var7) {
                                            --var7;
                                        }
                                        if ((class134.field2251[class28.field336][var6][var7] & 4) != 0) {
                                            class172.method1198(1, var7, false, class273.field4415, var6, (byte) 24);
                                            return;
                                        }
                                    }
                                }
                                return;
                            }
                            int var14 = var10 * 65536 / var11;
                            int var15 = 32768;
                            while (~var7 != ~var8) {
                                if (~var8 < ~var7) {
                                    ++var7;
                                } else if (~var8 > ~var7) {
                                    --var7;
                                }
                                if (~(4 & class134.field2251[class28.field336][var6][var7]) != -1) {
                                    class172.method1198(1, var7, false, class273.field4415, var6, (byte) 24);
                                    return;
                                }
                                var15 += var14;
                                if (var15 >= 65536) {
                                    if (var6 >= var9) {
                                        if (~var6 < ~var9) {
                                            --var6;
                                        }
                                    } else {
                                        ++var6;
                                    }
                                    var15 -= 65536;
                                    if (~(4 & class134.field2251[class28.field336][var6][var7]) != -1) {
                                        class172.method1198(1, var7, false, class273.field4415, var6, (byte) 24);
                                        return;
                                    }
                                }
                            }
                            return;
                        }
                        class272.method1837("RC: " + var6 + "," + var7 + " " + var9 + "," + var8 + " " + class296.field4685 + "," + class93.field1321, 1, (Throwable) null);
                        return;
                    }
                } else {
                    int var16 = class220.method1461(class44.field522, class28.field336, class119.field2014, 43);
                    if (~(-class193.field3108 + var16) <= -801 || (class134.field2251[class28.field336][class44.field522 >> 7][class119.field2014 >> 7] & 4) == 0) {
                        return;
                    }
                    class172.method1198(1, class119.field2014 >> 7, false, class273.field4415, class44.field522 >> 7, (byte) 24);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZI)I")
    public static final int method1896(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            return 72;
        } else {
            ++field4514;
            int var3 = arg0 + -1 & arg2 >> 31;
            return ((arg2 >>> 31) + arg2) % arg0 + var3;
        }
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(B)I")
    public final int method1897(byte arg0) {
        if (arg0 != 35) {
            field4509 = null;
        }
        ++field4517;
        return (int) super.field962;
    }

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "(I)I")
    public final int method1898(int arg0) {
        ++field4521;
        return arg0 != 2 ? 45 : (int) (255L & super.field962 >>> 32);
    }

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "(I)V")
    public static final void method1899(int arg0) {
        class279.field4463.method1831(-119);
        ++field4525;
        if (arg0 > -115) {
            field4524 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "(Z)V")
    public final void method1900(boolean arg0) {
        super.field2817 = Long.MIN_VALUE & super.field2817 | class182.method1253(20215) + 500L;
        class1.field8.method1634((byte) 85, this);
        ++field4522;
        if (!arg0) {
            method1895((byte) -9);
        }
    }

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "(I)J")
    public final long method1901(int arg0) {
        ++field4526;
        if (arg0 != 14065) {
            this.method1898(15);
        }
        return Long.MAX_VALUE & super.field2817;
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(II)V")
    public class283(int arg0, int arg1) {
        super.field962 = (long) arg1 | (long) arg0 << 32;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIZB)V")
    public static final void method1902(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5) {
        int var6 = 69 % ((62 - arg5) / 59);
        if (~arg1 > -2) {
            arg1 = 1;
        }
        ++field4516;
        if (~arg2 > -2) {
            arg2 = 1;
        }
        class171.field2755 = (short) arg1;
        class273.field4413 = (short) arg2;
    }
}
