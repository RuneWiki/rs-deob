import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class159 {

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "Ltj;")
    private class10 field2583 = new class10();

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "Ltj;")
    private class10 field2585 = new class10();

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "Ltj;")
    private class10 field2586 = new class10();

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "Ltj;")
    private class10 field2587 = new class10();

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "Lig;")
    private class136 field2591 = new class136(4);

    @OriginalMember(owner = "client!hk", name = "C", descriptor = "B")
    private byte field2595 = 0;

    @OriginalMember(owner = "client!hk", name = "B", descriptor = "I")
    public volatile int field2594 = 0;

    @OriginalMember(owner = "client!hk", name = "z", descriptor = "I")
    public volatile int field2592 = 0;

    @OriginalMember(owner = "client!hk", name = "A", descriptor = "Lig;")
    private class136 field2593 = new class136(8);

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "[J")
    public static long[] field2570 = new long[200];

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
    private int field2588;

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "J")
    private long field2590;

    @OriginalMember(owner = "client!hk", name = "E", descriptor = "Lrj;")
    private class274 field2596;

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "Lcd;")
    private class35 field2589;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)I")
    private final int method1138(int arg0) {
        field2582++;
        if (arg0 != 24721) {
            field2570 = null;
        }
        return this.field2586.method59((byte) -65) + this.field2587.method59((byte) -31);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V")
    public final void method1139(boolean arg0) {
        field2573++;
        if (this.field2589 != null) {
            this.field2589.method299(1);
        }
        if (!arg0) {
            this.method1145((byte) 68);
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V")
    private final void method1140(int arg0) {
        field2576++;
        if (this.field2589 == null) {
            return;
        }
        try {
            this.field2591.field2231 = 0;
            this.field2591.method966((byte) 57, 6);
            this.field2591.method1008(3, arg0 ^ 0x270);
            this.field2589.method301(arg0, 0, this.field2591.field2263, (byte) 123);
        } catch (IOException var3) {
            try {
                this.field2589.method294((byte) -95);
            } catch (Exception var2) {
            }
            this.field2592 = -2;
            this.field2594++;
            this.field2589 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZ)V")
    public final void method1141(int arg0, boolean arg1) {
        field2575++;
        if (arg0 > -10) {
            this.method1149((byte) 91);
        }
        if (this.field2589 == null) {
            return;
        }
        try {
            this.field2591.field2231 = 0;
            this.field2591.method966((byte) 76, arg1 ? 2 : 3);
            this.field2591.method1008(0, 628);
            this.field2589.method301(4, 0, this.field2591.field2263, (byte) 103);
        } catch (IOException var4) {
            try {
                this.field2589.method294((byte) -105);
            } catch (Exception var3) {
            }
            this.field2592 = -2;
            this.field2594++;
            this.field2589 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(Z)Z")
    public final boolean method1142(boolean arg0) {
        field2579++;
        if (!arg0) {
            this.field2586 = null;
        }
        return this.method1149((byte) 114) >= 20;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
    public final void method1143(byte arg0) {
        int var2 = -127 % ((arg0 + 39) / 56);
        field2580++;
        try {
            this.field2589.method294((byte) -96);
        } catch (Exception var3) {
        }
        this.field2595 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field2592 = -1;
        this.field2594++;
        this.field2589 = null;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)Z")
    public final boolean method1144(byte arg0) {
        if (arg0 == 101) {
            field2569++;
            return this.method1138(24721) >= 20;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(B)V")
    public final void method1145(byte arg0) {
        field2581++;
        int var2 = -18 % ((-arg0 - 62) / 60);
        if (this.field2589 != null) {
            this.field2589.method294((byte) 108);
        }
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)V")
    public static void method1146(int arg0) {
        if (arg0 != 0) {
            method1146(-55);
        }
        field2570 = null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lcd;ZZ)V")
    public final void method1147(class35 arg0, boolean arg1, boolean arg2) {
        field2578++;
        if (this.field2589 != null) {
            try {
                this.field2589.method294((byte) -89);
            } catch (Exception var8) {
            }
            this.field2589 = null;
        }
        this.field2589 = arg0;
        this.method1140(4);
        this.method1141(-87, arg2);
        this.field2593.field2231 = 0;
        this.field2596 = null;
        while (true) {
            class274 var4 = (class274) this.field2585.method67(10136);
            if (var4 == null) {
                while (true) {
                    class274 var5 = (class274) this.field2587.method67(10136);
                    if (var5 == null) {
                        if (this.field2595 != 0) {
                            try {
                                this.field2591.field2231 = 0;
                                this.field2591.method966((byte) 100, 4);
                                this.field2591.method966((byte) 82, this.field2595);
                                this.field2591.method971(3792, 0);
                                this.field2589.method301(4, 0, this.field2591.field2263, (byte) 122);
                            } catch (IOException var7) {
                                try {
                                    this.field2589.method294((byte) 106);
                                } catch (Exception var6) {
                                }
                                this.field2592 = -2;
                                this.field2594++;
                                this.field2589 = null;
                            }
                        }
                        this.field2588 = 0;
                        if (!arg1) {
                            this.method1140(-31);
                        }
                        this.field2590 = class62.method472(62);
                        return;
                    }
                    this.field2586.method70(3, var5);
                }
            }
            this.field2583.method70(3, var4);
        }
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(Z)V")
    public static final void method1148(boolean arg0) {
        field2584++;
        if (class165.field2709 != null) {
            class165.field2709.method1592((byte) -2);
        }
        if (class212.field3396 != null) {
            class212.field3396.method1592((byte) -2);
        }
        class55.method446(2, 18047, 22050, class179.field2991);
        class165.field2709 = class71.method549(class22.field340, true, 0, class205.field3294, 22050);
        class165.field2709.method1593(class265.field4239, (byte) 101);
        class212.field3396 = class71.method549(class22.field340, true, 1, class205.field3294, 2048);
        if (!arg0) {
            class212.field3396.method1593(class145.field2394, (byte) 101);
        }
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(B)I")
    public final int method1149(byte arg0) {
        if (arg0 < 112) {
            return 112;
        } else {
            field2572++;
            return this.field2583.method59((byte) -115) + this.field2585.method59((byte) 80);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BI)I")
    public static final int method1150(byte arg0, int arg1) {
        if (arg0 != -62) {
            method1150((byte) 55, -115);
        }
        field2568++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BIZIB)Lrj;")
    public final class274 method1151(byte arg0, int arg1, boolean arg2, int arg3, byte arg4) {
        long var6 = (long) ((arg1 << 16) + arg3);
        class274 var8 = new class274();
        field2571++;
        var8.field1727 = var6;
        var8.field3753 = arg2;
        var8.field4384 = arg4;
        int var9 = 34 / ((20 - arg0) / 62);
        if (arg2) {
            if (this.method1149((byte) 115) >= 20) {
                throw new RuntimeException();
            }
            this.field2583.method70(3, var8);
        } else if (this.method1138(24721) < 20) {
            this.field2586.method70(3, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(I)Z")
    public final boolean method1152(int arg0) {
        if (arg0 != -513) {
            return true;
        }
        if (this.field2589 != null) {
            long var2 = class62.method472(126);
            int var4 = (int) (var2 - this.field2590);
            this.field2590 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field2588 += var4;
            if (this.field2588 > 30000) {
                try {
                    this.field2589.method294((byte) -25);
                } catch (Exception var27) {
                }
                this.field2589 = null;
            }
        }
        field2567++;
        if (this.field2589 == null) {
            return this.method1149((byte) 127) == 0 && this.method1138(24721) == 0;
        }
        try {
            this.field2589.method300((byte) 124);
            for (class274 var5 = (class274) this.field2583.method62(0); var5 != null; var5 = (class274) this.field2583.method66((byte) -89)) {
                this.field2591.field2231 = 0;
                this.field2591.method966((byte) 95, 1);
                this.field2591.method1008((int) var5.field1727, 628);
                this.field2589.method301(4, 0, this.field2591.field2263, (byte) 74);
                this.field2585.method70(3, var5);
            }
            for (class274 var6 = (class274) this.field2586.method62(0); var6 != null; var6 = (class274) this.field2586.method66((byte) 87)) {
                this.field2591.field2231 = 0;
                this.field2591.method966((byte) 61, 0);
                this.field2591.method1008((int) var6.field1727, 628);
                this.field2589.method301(4, 0, this.field2591.field2263, (byte) 110);
                this.field2587.method70(3, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field2589.method296(arg0 + 473);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                byte var9 = 0;
                this.field2588 = 0;
                if (this.field2596 == null) {
                    var9 = 8;
                } else if (this.field2596.field4380 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field2596.field4378.field2263.length - this.field2596.field4384;
                    int var11 = 512 - this.field2596.field4380;
                    if (var10 - this.field2596.field4378.field2231 < var11) {
                        var11 = var10 - this.field2596.field4378.field2231;
                    }
                    if (var8 < var11) {
                        var11 = var8;
                    }
                    this.field2589.method303(arg0 ^ 0x200, var11, this.field2596.field4378.field2263, this.field2596.field4378.field2231);
                    if (this.field2595 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field2596.field4378.field2263[this.field2596.field4378.field2231 + var12] = (byte) class172.method1232(this.field2596.field4378.field2263[this.field2596.field4378.field2231 + var12], this.field2595);
                        }
                    }
                    this.field2596.field4378.field2231 += var11;
                    this.field2596.field4380 += var11;
                    if (this.field2596.field4378.field2231 == var10) {
                        this.field2596.method827((byte) -98);
                        this.field2596.field3756 = false;
                        this.field2596 = null;
                    } else if (this.field2596.field4380 == 512) {
                        this.field2596.field4380 = 0;
                    }
                } else {
                    int var13 = var9 - this.field2593.field2231;
                    if (var13 > var8) {
                        var13 = var8;
                    }
                    this.field2589.method303(-1, var13, this.field2593.field2263, this.field2593.field2231);
                    if (this.field2595 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field2593.field2263[this.field2593.field2231 + var14] = (byte) class172.method1232(this.field2593.field2263[this.field2593.field2231 + var14], this.field2595);
                        }
                    }
                    this.field2593.field2231 += var13;
                    if (var9 <= this.field2593.field2231) {
                        if (this.field2596 == null) {
                            this.field2593.field2231 = 0;
                            int var15 = this.field2593.method1012(4);
                            int var16 = this.field2593.method996(65280);
                            long var17 = (long) ((var15 << 16) + var16);
                            int var19 = this.field2593.method1012(4);
                            boolean var20 = (var19 & 0x80) != 0;
                            int var21 = this.field2593.method1022(-65);
                            Object var22 = null;
                            int var23 = var19 & 0x7F;
                            class274 var24;
                            if (var20) {
                                for (var24 = (class274) this.field2587.method62(arg0 + 513); var24 != null && var24.field1727 != var17; var24 = (class274) this.field2587.method66((byte) 85)) {
                                }
                            } else {
                                for (var24 = (class274) this.field2585.method62(0); var24 != null && var24.field1727 != var17; var24 = (class274) this.field2585.method66((byte) -114)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            int var25 = var23 == 0 ? 5 : 9;
                            this.field2596 = var24;
                            this.field2596.field4378 = new class136(var21 + var25 + this.field2596.field4384);
                            this.field2596.field4378.method966((byte) 55, var23);
                            this.field2596.field4378.method1029(var21, 15430);
                            this.field2593.field2231 = 0;
                            this.field2596.field4380 = 8;
                        } else if (this.field2596.field4380 != 0) {
                            throw new IOException();
                        } else if (this.field2593.field2263[0] == -1) {
                            this.field2593.field2231 = 0;
                            this.field2596.field4380 = 1;
                        } else {
                            this.field2596 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field2589.method294((byte) 114);
            } catch (Exception var26) {
            }
            this.field2592 = -2;
            this.field2589 = null;
            this.field2594++;
            return this.method1149((byte) 126) == 0 && this.method1138(24721) == 0;
        }
    }

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "(I)V")
    public final void method1153(int arg0) {
        int var2 = 122 / ((arg0 - 60) / 49);
        field2577++;
        if (this.field2589 == null) {
            return;
        }
        try {
            this.field2591.field2231 = 0;
            this.field2591.method966((byte) 112, 7);
            this.field2591.method1008(0, 628);
            this.field2589.method301(4, 0, this.field2591.field2263, (byte) -41);
        } catch (IOException var4) {
            try {
                this.field2589.method294((byte) -19);
            } catch (Exception var3) {
            }
            this.field2589 = null;
            this.field2594++;
            this.field2592 = -2;
        }
    }
}
