import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class757 {

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "Lqk;")
    private class16 field10547 = new class16();

    @OriginalMember(owner = "client!sw", name = "r", descriptor = "Lqk;")
    private class16 field10563 = new class16();

    @OriginalMember(owner = "client!sw", name = "u", descriptor = "Lqk;")
    private class16 field10566 = new class16();

    @OriginalMember(owner = "client!sw", name = "v", descriptor = "Lqk;")
    private class16 field10567 = new class16();

    @OriginalMember(owner = "client!sw", name = "w", descriptor = "Lsl;")
    private class461 field10568 = new class461(4);

    @OriginalMember(owner = "client!sw", name = "A", descriptor = "I")
    public volatile int field10572 = 0;

    @OriginalMember(owner = "client!sw", name = "B", descriptor = "I")
    public volatile int field10573 = 0;

    @OriginalMember(owner = "client!sw", name = "D", descriptor = "B")
    private byte field10575 = 0;

    @OriginalMember(owner = "client!sw", name = "C", descriptor = "Lsl;")
    private class461 field10574 = new class461(8);

    @OriginalMember(owner = "client!sw", name = "d", descriptor = "Lkg;")
    public static class275 field10549 = new class275(73, -2);

    @OriginalMember(owner = "client!sw", name = "p", descriptor = "Lfh;")
    public static class653 field10561 = new class653();

    @OriginalMember(owner = "client!sw", name = "t", descriptor = "Lfh;")
    public static class653 field10565 = new class653();

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "I")
    public static int field10546;

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "I")
    public static int field10548;

    @OriginalMember(owner = "client!sw", name = "e", descriptor = "I")
    public static int field10550;

    @OriginalMember(owner = "client!sw", name = "f", descriptor = "I")
    public static int field10551;

    @OriginalMember(owner = "client!sw", name = "g", descriptor = "I")
    public static int field10552;

    @OriginalMember(owner = "client!sw", name = "h", descriptor = "I")
    public static int field10553;

    @OriginalMember(owner = "client!sw", name = "i", descriptor = "I")
    public static int field10554;

    @OriginalMember(owner = "client!sw", name = "j", descriptor = "I")
    public static int field10555;

    @OriginalMember(owner = "client!sw", name = "k", descriptor = "I")
    public static int field10556;

    @OriginalMember(owner = "client!sw", name = "l", descriptor = "I")
    public static int field10557;

    @OriginalMember(owner = "client!sw", name = "m", descriptor = "I")
    public static int field10558;

    @OriginalMember(owner = "client!sw", name = "n", descriptor = "I")
    public static int field10559;

    @OriginalMember(owner = "client!sw", name = "o", descriptor = "I")
    public static int field10560;

    @OriginalMember(owner = "client!sw", name = "q", descriptor = "I")
    public static int field10562;

    @OriginalMember(owner = "client!sw", name = "s", descriptor = "I")
    public static int field10564;

    @OriginalMember(owner = "client!sw", name = "y", descriptor = "I")
    private int field10570;

    @OriginalMember(owner = "client!sw", name = "z", descriptor = "J")
    private long field10571;

    @OriginalMember(owner = "client!sw", name = "E", descriptor = "Lue;")
    private class235 field10576;

    @OriginalMember(owner = "client!sw", name = "x", descriptor = "Lvj;")
    private class444 field10569;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(IZIIB)Lue;")
    public final class235 method4203(int arg0, boolean arg1, int arg2, int arg3, byte arg4) {
        field10560++;
        long var6 = (long) ((arg0 << 16) + arg2);
        class235 var8 = new class235();
        var8.field8924 = var6;
        int var9 = -37 % ((arg3 - 33) / 62);
        var8.field1739 = arg1;
        var8.field3061 = arg4;
        if (arg1) {
            if (this.method4211((byte) -52) >= 20) {
                throw new RuntimeException();
            }
            this.field10547.method116(var8, 1);
        } else if (this.method4213(4) < 20) {
            this.field10566.method116(var8, 1);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)Z")
    public final boolean method4204(int arg0) {
        if (arg0 >= -46) {
            return true;
        } else {
            field10552++;
            return this.method4211((byte) -52) >= 20;
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(B)V")
    public final void method4205(byte arg0) {
        field10553++;
        if (this.field10569 == null) {
            return;
        }
        if (arg0 != 32) {
            this.field10568 = null;
        }
        try {
            this.field10568.field6193 = 0;
            this.field10568.method2578(7, arg0 ^ 0xB73181D0);
            this.field10568.method2589(8, 0);
            this.field10569.method2512(0, 4, this.field10568.field6180, 0);
        } catch (IOException var3) {
            try {
                this.field10569.method2514(arg0 - 31437);
            } catch (Exception var2) {
            }
            this.field10572++;
            this.field10569 = null;
            this.field10573 = -2;
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(II)V")
    public static final void method4206(int arg0, int arg1) {
        field10555++;
        class37 var2 = class636.method3571(5, arg1, -59);
        if (arg0 == 17350) {
            var2.method230(arg0 ^ 0xFFFFBC77);
        }
    }

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "(I)V")
    public static void method4207(int arg0) {
        field10549 = null;
        if (arg0 > 36) {
            field10561 = null;
            field10565 = null;
        }
    }

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "(I)V")
    public final void method4208(int arg0) {
        if (arg0 != 0) {
            this.method4210(null, -121, true);
        }
        if (this.field10569 != null) {
            this.field10569.method2514(-31405);
        }
        field10562++;
    }

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "(B)V")
    public final void method4209(byte arg0) {
        if (arg0 == 102) {
            field10548++;
            if (this.field10569 != null) {
                this.field10569.method2517((byte) -123);
            }
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lvj;IZ)V")
    public final void method4210(class444 arg0, int arg1, boolean arg2) {
        field10550++;
        if (this.field10569 != null) {
            try {
                this.field10569.method2514(-31405);
            } catch (Exception var8) {
            }
            this.field10569 = null;
        }
        this.field10569 = arg0;
        this.method4215(-107);
        this.method4217(arg2, arg1);
        this.field10576 = null;
        this.field10574.field6193 = 0;
        while (true) {
            class235 var4 = (class235) this.field10563.method114(-54);
            if (var4 == null) {
                while (true) {
                    class235 var5 = (class235) this.field10567.method114(-106);
                    if (var5 == null) {
                        if (this.field10575 != 0) {
                            try {
                                this.field10568.field6193 = 0;
                                this.field10568.method2578(4, -1221492240);
                                this.field10568.method2578(this.field10575, -1221492240);
                                this.field10568.method2620(0, false);
                                this.field10569.method2512(0, 4, this.field10568.field6180, 0);
                            } catch (IOException var7) {
                                try {
                                    this.field10569.method2514(-31405);
                                } catch (Exception var6) {
                                }
                                this.field10569 = null;
                                this.field10572++;
                                this.field10573 = -2;
                            }
                        }
                        this.field10570 = arg1;
                        this.field10571 = class446.method2525(500);
                        return;
                    }
                    this.field10566.method116(var5, 1);
                }
            }
            this.field10547.method116(var4, 1);
        }
    }

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "(B)I")
    public final int method4211(byte arg0) {
        if (arg0 != -52) {
            this.method4213(-10);
        }
        field10557++;
        return this.field10547.method115((byte) -127) + this.field10563.method115((byte) -119);
    }

    @OriginalMember(owner = "client!sw", name = "d", descriptor = "(B)Z")
    public final boolean method4212(byte arg0) {
        field10554++;
        if (arg0 > -16) {
            return false;
        } else {
            return this.method4213(4) >= 20;
        }
    }

    @OriginalMember(owner = "client!sw", name = "d", descriptor = "(I)I")
    private final int method4213(int arg0) {
        if (arg0 == 4) {
            field10546++;
            return this.field10566.method115((byte) -122) + this.field10567.method115((byte) -113);
        } else {
            return 121;
        }
    }

    @OriginalMember(owner = "client!sw", name = "e", descriptor = "(I)Z")
    public final boolean method4214(int arg0) {
        field10559++;
        if (this.field10569 != null) {
            long var2 = class446.method2525(500);
            int var4 = (int) (var2 - this.field10571);
            this.field10571 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field10570 += var4;
            if (this.field10570 > 30000) {
                try {
                    this.field10569.method2514(-31405);
                } catch (Exception var27) {
                }
                this.field10569 = null;
            }
        }
        if (this.field10569 == null) {
            return this.method4211((byte) -52) == 0 && this.method4213(4) == 0;
        }
        try {
            this.field10569.method2520((byte) -77);
            for (class235 var5 = (class235) this.field10547.method118(-30553); var5 != null; var5 = (class235) this.field10547.method111(arg0 + 22548)) {
                this.field10568.field6193 = 0;
                this.field10568.method2578(1, arg0 ^ 0xB73181F0);
                this.field10568.method2589(8, (int) var5.field8924);
                this.field10569.method2512(0, 4, this.field10568.field6180, 0);
                this.field10563.method116(var5, arg0 ^ 0x1);
            }
            for (class235 var6 = (class235) this.field10566.method118(-30553); var6 != null; var6 = (class235) this.field10566.method111(22548)) {
                this.field10568.field6193 = 0;
                this.field10568.method2578(0, -1221492240);
                this.field10568.method2589(8, (int) var6.field8924);
                this.field10569.method2512(0, 4, this.field10568.field6180, arg0);
                this.field10567.method116(var6, 1);
            }
            for (int var7 = arg0; var7 < 100; var7++) {
                int var8 = this.field10569.method2515(arg0);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field10570 = 0;
                byte var9 = 0;
                if (this.field10576 == null) {
                    var9 = 8;
                } else if (this.field10576.field3067 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field10574.field6193;
                    if (var10 > var8) {
                        var10 = var8;
                    }
                    this.field10569.method2513(this.field10574.field6193, this.field10574.field6180, true, var10);
                    if (this.field10575 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field10574.field6180[this.field10574.field6193 + var11] = (byte) class386.method2198(this.field10574.field6180[this.field10574.field6193 + var11], this.field10575);
                        }
                    }
                    this.field10574.field6193 += var10;
                    if (var9 <= this.field10574.field6193) {
                        if (this.field10576 == null) {
                            this.field10574.field6193 = 0;
                            int var12 = this.field10574.method2600((byte) -128);
                            int var13 = this.field10574.method2566(-2);
                            int var14 = this.field10574.method2600((byte) -124);
                            int var15 = this.field10574.method2622(arg0 ^ 0xDFD6E4F8);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class235 var21;
                            if (var17) {
                                for (var21 = (class235) this.field10567.method118(-30553); var21 != null && var21.field8924 != var18; var21 = (class235) this.field10567.method111(22548)) {
                                }
                            } else {
                                for (var21 = (class235) this.field10563.method118(-30553); var21 != null && var21.field8924 != var18; var21 = (class235) this.field10563.method111(arg0 ^ 0x5814)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field10576 = var21;
                            this.field10576.field3063 = new class461(this.field10576.field3061 + var15 + var22);
                            this.field10576.field3063.method2578(var16, -1221492240);
                            this.field10576.field3063.method2568(var15, -535701016);
                            this.field10574.field6193 = 0;
                            this.field10576.field3067 = 8;
                        } else if (this.field10576.field3067 != 0) {
                            throw new IOException();
                        } else if (this.field10574.field6180[0] == -1) {
                            this.field10574.field6193 = 0;
                            this.field10576.field3067 = 1;
                        } else {
                            this.field10576 = null;
                        }
                    }
                } else {
                    int var23 = this.field10576.field3063.field6180.length - this.field10576.field3061;
                    int var24 = 512 - this.field10576.field3067;
                    if ((var23 - this.field10576.field3063.field6193) < var24) {
                        var24 = var23 - this.field10576.field3063.field6193;
                    }
                    if (var24 > var8) {
                        var24 = var8;
                    }
                    this.field10569.method2513(this.field10576.field3063.field6193, this.field10576.field3063.field6180, true, var24);
                    if (this.field10575 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field10576.field3063.field6180[this.field10576.field3063.field6193 + var25] = (byte) class386.method2198(this.field10576.field3063.field6180[this.field10576.field3063.field6193 + var25], this.field10575);
                        }
                    }
                    this.field10576.field3063.field6193 += var24;
                    this.field10576.field3067 += var24;
                    if (this.field10576.field3063.field6193 == var23) {
                        this.field10576.method3615(5);
                        this.field10576.field1745 = false;
                        this.field10576 = null;
                    } else if (this.field10576.field3067 == 512) {
                        this.field10576.field3067 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field10569.method2514(-31405);
            } catch (Exception var26) {
            }
            this.field10572++;
            this.field10573 = -2;
            this.field10569 = null;
            return this.method4211((byte) -52) == 0 && this.method4213(arg0 + 4) == 0;
        }
    }

    @OriginalMember(owner = "client!sw", name = "f", descriptor = "(I)V")
    private final void method4215(int arg0) {
        field10556++;
        if (this.field10569 == null) {
            return;
        }
        if (arg0 >= -69) {
            field10549 = null;
        }
        try {
            this.field10568.field6193 = 0;
            this.field10568.method2578(6, -1221492240);
            this.field10568.method2589(8, 3);
            this.field10569.method2512(0, 4, this.field10568.field6180, 0);
        } catch (IOException var3) {
            try {
                this.field10569.method2514(-31405);
            } catch (Exception var2) {
            }
            this.field10572++;
            this.field10573 = -2;
            this.field10569 = null;
        }
    }

    @OriginalMember(owner = "client!sw", name = "g", descriptor = "(I)V")
    public final void method4216(int arg0) {
        field10564++;
        try {
            this.field10569.method2514(-31405);
        } catch (Exception var2) {
        }
        this.field10569 = null;
        this.field10575 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field10572++;
        if (arg0 != -23483) {
            field10549 = null;
        }
        this.field10573 = -1;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(ZI)V")
    public final void method4217(boolean arg0, int arg1) {
        field10558++;
        if (this.field10569 == null) {
            return;
        }
        try {
            this.field10568.field6193 = arg1;
            this.field10568.method2578(arg0 ? 2 : 3, -1221492240);
            this.field10568.method2589(8, 0);
            this.field10569.method2512(0, 4, this.field10568.field6180, 0);
        } catch (IOException var4) {
            try {
                this.field10569.method2514(-31405);
            } catch (Exception var3) {
            }
            this.field10572++;
            this.field10569 = null;
            this.field10573 = -2;
        }
    }
}
