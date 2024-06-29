import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class216 {

    @OriginalMember(owner = "client!bp", name = "r", descriptor = "I")
    private int field3523 = 32;

    @OriginalMember(owner = "client!bp", name = "h", descriptor = "Z")
    private boolean field3513 = false;

    @OriginalMember(owner = "client!bp", name = "o", descriptor = "J")
    private long field3520 = class46.method297(27104);

    @OriginalMember(owner = "client!bp", name = "G", descriptor = "[Lkp;")
    private class283[] field3538 = new class283[8];

    @OriginalMember(owner = "client!bp", name = "E", descriptor = "[Lkp;")
    private class283[] field3536 = new class283[8];

    @OriginalMember(owner = "client!bp", name = "y", descriptor = "Z")
    private boolean field3530 = true;

    @OriginalMember(owner = "client!bp", name = "F", descriptor = "I")
    private int field3537 = 0;

    @OriginalMember(owner = "client!bp", name = "H", descriptor = "I")
    private int field3539 = 0;

    @OriginalMember(owner = "client!bp", name = "C", descriptor = "J")
    private long field3534 = 0L;

    @OriginalMember(owner = "client!bp", name = "I", descriptor = "I")
    private int field3540 = 0;

    @OriginalMember(owner = "client!bp", name = "M", descriptor = "I")
    private int field3543 = 0;

    @OriginalMember(owner = "client!bp", name = "L", descriptor = "J")
    private long field3542 = 0L;

    @OriginalMember(owner = "client!bp", name = "i", descriptor = "Z")
    public static boolean field3514 = true;

    @OriginalMember(owner = "client!bp", name = "l", descriptor = "[Ltm;")
    public static class219[] field3517 = new class219[2048];

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "I")
    public static int field3506 = -1;

    @OriginalMember(owner = "client!bp", name = "p", descriptor = "I")
    public static int field3521 = -1;

    @OriginalMember(owner = "client!bp", name = "q", descriptor = "I")
    public static int field3522 = -1;

    @OriginalMember(owner = "client!bp", name = "v", descriptor = "Lal;")
    public static class52 field3527 = new class52(64);

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!bp", name = "j", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!bp", name = "k", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!bp", name = "m", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!bp", name = "t", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!bp", name = "u", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!bp", name = "w", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!bp", name = "x", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!bp", name = "z", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!bp", name = "A", descriptor = "I")
    public int field3532;

    @OriginalMember(owner = "client!bp", name = "B", descriptor = "I")
    public int field3533;

    @OriginalMember(owner = "client!bp", name = "D", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!bp", name = "K", descriptor = "I")
    private int field3541;

    @OriginalMember(owner = "client!bp", name = "N", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!bp", name = "s", descriptor = "Lkp;")
    private class283 field3524;

    @OriginalMember(owner = "client!bp", name = "n", descriptor = "[I")
    public int[] field3519;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "([II)V", line = 11)
    private final void method1541(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class29.field339) {
            var3 = arg1 << 1;
        }
        class408.method2556(arg0, 0, var3);
        this.field3537 -= arg1;
        if (this.field3524 != null && this.field3537 <= 0) {
            this.field3537 += class413.field6106 >> 4;
            class249.method1723(this.field3524, -23046);
            this.method1544((byte) -103, this.field3524, this.field3524.method1414());
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class283 var10 = null;
                        class283 var11 = this.field3538[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class420 var12 = var11.field4542;
                                if (var12 == null || var12.field6201 <= var8) {
                                    var11.field4543 = true;
                                    int var13 = var11.method1067();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field6201 += var13;
                                    }
                                    if (var4 >= this.field3523) {
                                        break label107;
                                    }
                                    class283 var14 = var11.method1066();
                                    if (var14 != null) {
                                        int var15 = var11.field4544;
                                        while (var14 != null) {
                                            this.method1544((byte) 52, var14, var15 * var14.method1414() >> 8);
                                            var14 = var11.method1064();
                                        }
                                    }
                                    class283 var16 = var11.field4545;
                                    var11.field4545 = null;
                                    if (var10 == null) {
                                        this.field3538[var7] = var16;
                                    } else {
                                        var10.field4545 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3536[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field4545;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class283 var18 = this.field3538[var17];
                this.field3538[var17] = this.field3536[var17] = null;
                while (var18 != null) {
                    class283 var19 = var18.field4545;
                    var18.field4545 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3537 < 0) {
            this.field3537 = 0;
        }
        if (this.field3524 != null) {
            this.field3524.method1072(arg0, 0, arg1);
        }
        this.field3520 = class46.method297(27104);
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(BLkp;)V", line = 170)
    public final synchronized void method1542(byte arg0, class283 arg1) {
        this.field3524 = arg1;
        if (arg0 != 63) {
            this.field3536 = null;
        }
        field3518++;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "()V", line = 181)
    public void method1456() {
        field3525++;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V", line = 193)
    public final synchronized void method1543(int arg0) {
        field3510++;
        if (this.field3513) {
            return;
        }
        long var2 = class46.method297(27104);
        try {
            if ((this.field3520 + 500000L) < var2) {
                this.field3520 = var2 - 500000L;
            }
            while (var2 > this.field3520 + 5000L) {
                this.method1551(false, 256);
                this.field3520 += (long) (256000 / class413.field6106);
            }
        } catch (Exception var7) {
            this.field3520 = var2;
        }
        if (this.field3519 == null) {
            return;
        }
        try {
            if (arg0 >= 121) {
                if (this.field3534 != 0L) {
                    if (var2 < this.field3534) {
                        return;
                    }
                    this.method1459(this.field3532);
                    this.field3534 = 0L;
                    this.field3530 = true;
                }
                int var4 = this.method1457();
                if ((this.field3539 - var4) > this.field3543) {
                    this.field3543 = this.field3539 - var4;
                }
                int var5 = this.field3541 + this.field3533;
                if (var5 + 256 > 16384) {
                    var5 = 16128;
                }
                if ((var5 + 256) > this.field3532) {
                    this.field3532 += 1024;
                    if (this.field3532 > 16384) {
                        this.field3532 = 16384;
                    }
                    this.method1456();
                    var4 = 0;
                    this.method1459(this.field3532);
                    if ((var5 + 256) > this.field3532) {
                        var5 = this.field3532 - 256;
                        this.field3541 = var5 - this.field3533;
                    }
                    this.field3530 = true;
                }
                while (var5 > var4) {
                    this.method1541(this.field3519, 256);
                    this.method1455();
                    var4 += 256;
                }
                if (var2 > this.field3542) {
                    if (this.field3530) {
                        this.field3530 = false;
                    } else if (this.field3543 == 0 && this.field3540 == 0) {
                        this.method1456();
                        this.field3534 = var2 + 2000L;
                        return;
                    } else {
                        this.field3541 = Math.min(this.field3540, this.field3543);
                        this.field3540 = this.field3543;
                    }
                    this.field3542 = var2 + 2000L;
                    this.field3543 = 0;
                }
                this.field3539 = var4;
            }
        } catch (Exception var6) {
            this.method1456();
            this.field3534 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(BLkp;I)V", line = 315)
    private final void method1544(byte arg0, class283 arg1, int arg2) {
        field3528++;
        int var4 = arg2 >> 5;
        class283 var5 = this.field3536[var4];
        if (var5 == null) {
            this.field3538[var4] = arg1;
        } else {
            var5.field4545 = arg1;
        }
        int var6 = -86 / ((arg0 + 51) / 38);
        this.field3536[var4] = arg1;
        arg1.field4544 = arg2;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ILsn;I)V", line = 335)
    public static final void method1545(int arg0, class375 arg1, int arg2) {
        if (arg2 != -7286) {
            field3514 = true;
        }
        if (class378.field5701) {
            class378.field5701 = false;
            arg0 = 0;
        }
        field3529++;
        if (class230.field3836 != null && class230.field3836.method2392(arg1, 121)) {
            return;
        }
        class230.field3836 = arg1;
        class250.field4092 = class46.method297(27104);
        class341.field5265 = arg0;
        class367.field5565 = arg0;
        if (class367.field5565 != 0) {
            class324.field5092 = class101.field1406;
            class35.field426 = class326.field5118;
            class145.field2277 = class433.field6396;
            class191.field3114 = class223.field3708;
            class11.field150 = class412.field6102;
            class62.field811 = class271.field4349;
            class142.field2253 = class349.field5385;
            class374.field5640 = class120.field1643;
            class133.field2074 = class246.field4038;
            class452.field6569 = class30.field380;
            return;
        }
        class277.method1864((byte) 23);
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)V", line = 375)
    public final void method1546(int arg0) {
        if (arg0 != 2124) {
            method1548((byte) -26);
        }
        field3516++;
        this.field3530 = true;
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "()I", line = 386)
    public int method1457() throws Exception {
        field3535++;
        return this.field3532;
    }

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "()V", line = 394)
    public void method1458() throws Exception {
        field3526++;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IZ)V", line = 401)
    public static final void method1547(int arg0, boolean arg1) {
        if (!arg1) {
            field3511++;
            class430.field6335 = arg0;
            class115.field1590.method335((byte) 104);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V", line = 413)
    public static void method1548(byte arg0) {
        field3527 = null;
        field3517 = null;
        int var1 = -50 / ((7 - arg0) / 61);
    }

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "(I)V", line = 423)
    public final synchronized void method1549(int arg0) {
        int var2 = 82 % ((60 - arg0) / 35);
        field3515++;
        if (class151.field2358 != null) {
            boolean var3 = true;
            for (int var4 = 0; var4 < 2; var4++) {
                if (class151.field2358.field5033[var4] == this) {
                    class151.field2358.field5033[var4] = null;
                }
                if (class151.field2358.field5033[var4] != null) {
                    var3 = false;
                }
            }
            if (var3) {
                class151.field2358.field5035 = true;
                while (class151.field2358.field5030) {
                    class84.method517((byte) 117, 50L);
                }
                class151.field2358 = null;
            }
        }
        this.method1456();
        this.field3513 = true;
        this.field3519 = null;
    }

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "(I)V", line = 467)
    public void method1459(int arg0) throws Exception {
        field3508++;
    }

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "(I)V", line = 479)
    public final synchronized void method1550(int arg0) {
        field3509++;
        this.field3530 = true;
        if (arg0 != 2000) {
            this.method1541((int[]) null, 9);
        }
        try {
            this.method1458();
        } catch (Exception var2) {
            this.method1456();
            this.field3534 = class46.method297(27104) + 2000L;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZI)V", line = 503)
    private final void method1551(boolean arg0, int arg1) {
        this.field3537 -= arg1;
        field3531++;
        if (arg0) {
            return;
        }
        if (this.field3537 < 0) {
            this.field3537 = 0;
        }
        if (this.field3524 != null) {
            this.field3524.method1065(arg1);
        }
    }

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "()V", line = 527)
    public void method1455() throws Exception {
        field3507++;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 537)
    public void method1454(Component arg0) throws Exception {
        field3512++;
    }
}
