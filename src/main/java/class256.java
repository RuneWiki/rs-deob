import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class256 extends class557 {

    @OriginalMember(owner = "client!lm", name = "C", descriptor = "I")
    private int field3549 = 0;

    @OriginalMember(owner = "client!lm", name = "H", descriptor = "Lnj;")
    private class436 field3554 = new class436(16);

    @OriginalMember(owner = "client!lm", name = "K", descriptor = "I")
    private int field3557 = 0;

    @OriginalMember(owner = "client!lm", name = "L", descriptor = "Lrh;")
    private class59 field3558 = new class59();

    @OriginalMember(owner = "client!lm", name = "P", descriptor = "J")
    private long field3562 = 0L;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "Lvh;")
    private class403 field3528;

    @OriginalMember(owner = "client!lm", name = "G", descriptor = "I")
    private int field3553;

    @OriginalMember(owner = "client!lm", name = "O", descriptor = "Z")
    private boolean field3561;

    @OriginalMember(owner = "client!lm", name = "M", descriptor = "Lrh;")
    private class59 field3559;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
    private int field3542;

    @OriginalMember(owner = "client!lm", name = "I", descriptor = "Lmca;")
    private class500 field3555;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
    private int field3545;

    @OriginalMember(owner = "client!lm", name = "Q", descriptor = "Z")
    private boolean field3563;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "Lvh;")
    private class403 field3543;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "Lkl;")
    private class502 field3530;

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "[B")
    private byte[] field3541;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "Lml;")
    private class368 field3537;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "Lcb;")
    public static class318 field3535 = new class318(6, -2);

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!lm", name = "A", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!lm", name = "B", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!lm", name = "D", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!lm", name = "E", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!lm", name = "F", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!lm", name = "J", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "Lnaa;")
    private class413 field3546;

    @OriginalMember(owner = "client!lm", name = "N", descriptor = "Z")
    private boolean field3560;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "[B")
    private byte[] field3527;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V")
    public final void method1600(int arg0) {
        field3540++;
        if (this.field3528 == null) {
            return;
        }
        this.field3560 = true;
        if (this.field3559 == null) {
            this.field3559 = new class59();
        }
        if (arg0 != 2) {
            this.field3528 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)V")
    public static void method1601(int arg0) {
        if (arg0 == 0) {
            field3535 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)I")
    public final int method1602(byte arg0) {
        field3536++;
        if (this.method1608((byte) 84) == null) {
            return this.field3537 == null ? 0 : this.field3537.method86(-82);
        } else if (arg0 == -16) {
            return 100;
        } else {
            return 48;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZLjava/lang/String;)V")
    public static final void method1603(int arg0, boolean arg1, String arg2) {
        if (!arg1) {
            field3535 = null;
        }
        field3544++;
        class19 var3 = class364.method2236(1248116640, arg0, 2);
        var3.method110(12142);
        var3.field170 = arg2;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1604(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3548++;
        for (class620 var7 = (class620) class565.field7805.method2224((byte) -112); var7 != null; var7 = (class620) class565.field7805.method2222((byte) -82)) {
            if (class430.field5984 >= var7.field8423) {
                var7.method2357(3553);
            } else {
                class248.method1551((byte) -105, var7.field8426 * 2, (var7.field8427 << 9) + 256, (var7.field8433 << 9) + 256, arg1, arg2 >> 1, var7.field8430, arg0, arg5 >> 1);
                class622.field8452.method1802(class558.field7608[0] + arg4, 0, var7.field8425, class558.field7608[1] + arg6, var7.field8431 | 0xFF000000, -28812);
            }
        }
        if (arg3 < 16) {
            field3535 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIZ)Lml;")
    private final class368 method1605(int arg0, int arg1, boolean arg2) {
        field3529++;
        class368 var4 = (class368) this.field3554.method2506(115, (long) arg1);
        if (var4 != null && arg0 == 0 && !var4.field5294 && var4.field5297) {
            var4.method175(30604);
            var4 = null;
        }
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field3528 == null || this.field3527[arg1] == -1) {
                    if (this.field3530.method2840(6)) {
                        return null;
                    }
                    var4 = this.field3530.method2830(arg1, true, (byte) 2, 123, this.field3553);
                } else {
                    var4 = this.field3555.method2815(arg1, this.field3528, (byte) 33);
                }
            } else if (arg0 == 1) {
                if (this.field3528 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field3555.method2811(-123, arg1, this.field3528);
            } else if (arg0 == 2) {
                if (this.field3528 == null) {
                    throw new RuntimeException();
                }
                if (this.field3527[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field3530.method2828((byte) -127)) {
                    return null;
                }
                var4 = this.field3530.method2830(arg1, false, (byte) 2, 106, this.field3553);
            } else {
                throw new RuntimeException();
            }
            this.field3554.method2504((long) arg1, 109, var4);
        }
        if (!arg2) {
            return null;
        } else if (var4.field5297) {
            return null;
        } else {
            byte[] var5 = var4.method88(77);
            if (!(var4 instanceof class16)) {
                try {
                    if (var5 == null || var5.length <= 2) {
                        throw new RuntimeException();
                    }
                    class343.field5050.reset();
                    class343.field5050.update(var5, 0, var5.length - 2);
                    int var6 = (int) class343.field5050.getValue();
                    if (this.field3546.field5795[arg1] != var6) {
                        throw new RuntimeException();
                    }
                    if (this.field3546.field5789 != null && this.field3546.field5789[arg1] != null) {
                        byte[] var7 = this.field3546.field5789[arg1];
                        byte[] var8 = class666.method3699((byte) 0, var5.length - 2, 0, var5);
                        for (int var9 = 0; var9 < 64; var9++) {
                            if (var7[var9] != var8[var9]) {
                                throw new RuntimeException();
                            }
                        }
                    }
                    this.field3530.field6800 = 0;
                    this.field3530.field6803 = 0;
                } catch (RuntimeException var17) {
                    this.field3530.method2838(126);
                    var4.method175(30604);
                    if (var4.field5294 && !this.field3530.method2840(6)) {
                        class371 var10 = this.field3530.method2830(arg1, true, (byte) 2, 85, this.field3553);
                        this.field3554.method2504((long) arg1, 123, var10);
                    }
                    return null;
                }
                var5[var5.length - 2] = (byte) (this.field3546.field5785[arg1] >>> 8);
                var5[var5.length - 1] = (byte) this.field3546.field5785[arg1];
                if (this.field3528 != null) {
                    this.field3555.method2816(var5, arg1, -65, this.field3528);
                    if (this.field3527[arg1] != 1) {
                        this.field3549++;
                        this.field3527[arg1] = 1;
                    }
                }
                if (!var4.field5294) {
                    var4.method175(30604);
                }
                return var4;
            }
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class343.field5050.reset();
                class343.field5050.update(var5, 0, var5.length - 2);
                int var11 = (int) class343.field5050.getValue();
                if (this.field3546.field5795[arg1] != var11) {
                    throw new RuntimeException();
                }
                if (this.field3546.field5789 != null && this.field3546.field5789[arg1] != null) {
                    byte[] var12 = this.field3546.field5789[arg1];
                    byte[] var13 = class666.method3699((byte) 0, var5.length - 2, 0, var5);
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (var12[var14] != var13[var14]) {
                            throw new RuntimeException();
                        }
                    }
                }
                int var15 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
                if ((this.field3546.field5785[arg1] & 0xFFFF) != var15) {
                    throw new RuntimeException();
                }
                if (this.field3527[arg1] != 1) {
                    this.field3549++;
                    this.field3527[arg1] = 1;
                }
                if (!var4.field5294) {
                    var4.method175(30604);
                }
                return var4;
            } catch (Exception var18) {
                this.field3527[arg1] = -1;
                var4.method175(30604);
                if (var4.field5294 && !this.field3530.method2840(6)) {
                    class371 var16 = this.field3530.method2830(arg1, true, (byte) 2, -26, this.field3553);
                    this.field3554.method2504((long) arg1, -38, var16);
                }
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(B)I")
    public final int method1606(byte arg0) {
        field3534++;
        if (this.field3546 == null) {
            return 0;
        }
        int var2 = 107 % ((arg0 - 3) / 44);
        if (this.field3561) {
            class28 var3 = this.field3559.method374((byte) 68);
            return var3 == null ? 0 : (int) var3.field272;
        } else {
            return this.field3546.field5782;
        }
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)V")
    public final void method1607(int arg0) {
        field3533++;
        if (this.field3559 == null || this.method1608((byte) 84) == null) {
            return;
        }
        if (arg0 != -31823) {
            this.field3530 = null;
        }
        for (class28 var2 = this.field3558.method374((byte) 99); var2 != null; var2 = this.field3558.method372(-20740)) {
            int var3 = (int) var2.field272;
            if (var3 < 0 || this.field3546.field5790 <= var3 || this.field3546.field5788[var3] == 0) {
                var2.method175(30604);
            } else {
                if (this.field3527[var3] == 0) {
                    this.method1605(1, var3, true);
                }
                if (this.field3527[var3] == -1) {
                    this.method1605(2, var3, true);
                }
                if (this.field3527[var3] == 1) {
                    var2.method175(30604);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)Lnaa;")
    public final class413 method1608(byte arg0) {
        field3547++;
        if (this.field3546 != null) {
            return this.field3546;
        }
        if (this.field3537 == null) {
            if (this.field3530.method2840(6)) {
                return null;
            }
            this.field3537 = this.field3530.method2830(this.field3553, true, (byte) 0, -42, 255);
        }
        if (this.field3537.field5297) {
            return null;
        }
        byte[] var2 = this.field3537.method88(arg0 - 179);
        if (arg0 != 84) {
            return null;
        }
        if (this.field3537 instanceof class16) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3546 = new class413(var2, this.field3542, this.field3541);
                if (this.field3546.field5797 != this.field3545) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field3546 = null;
                if (this.field3530.method2840(6)) {
                    this.field3537 = null;
                } else {
                    this.field3537 = this.field3530.method2830(this.field3553, true, (byte) 0, -28, 255);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3546 = new class413(var2, this.field3542, this.field3541);
            } catch (RuntimeException var4) {
                this.field3530.method2838(arg0 + 40);
                this.field3546 = null;
                if (this.field3530.method2840(arg0 - 78)) {
                    this.field3537 = null;
                } else {
                    this.field3537 = this.field3530.method2830(this.field3553, true, (byte) 0, arg0 - 198, 255);
                }
                return null;
            }
            if (this.field3543 != null) {
                this.field3555.method2816(var2, this.field3553, -121, this.field3543);
            }
        }
        this.field3537 = null;
        if (this.field3528 != null) {
            this.field3527 = new byte[this.field3546.field5790];
            this.field3549 = 0;
        }
        return this.field3546;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZ)I")
    public final int method1609(int arg0, boolean arg1) {
        field3538++;
        if (arg1) {
            class368 var3 = (class368) this.field3554.method2506(99, (long) arg0);
            return var3 == null ? 0 : var3.method86(-94);
        } else {
            return -74;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)[B")
    public final byte[] method1610(int arg0, int arg1) {
        field3552++;
        class368 var3 = this.method1605(arg1, arg0, true);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method88(arg1 ^ 0xFFFFFFBB);
            var3.method175(30604);
            return var4;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZI)V")
    public final void method1611(boolean arg0, int arg1) {
        field3550++;
        if (!arg0) {
            this.method1610(2, 97);
        }
        if (this.field3528 == null) {
            return;
        }
        for (class28 var3 = this.field3558.method374((byte) 115); var3 != null; var3 = this.field3558.method372(-20740)) {
            if (((long) arg1) == var3.field272) {
                return;
            }
        }
        class28 var4 = new class28();
        var4.field272 = arg1;
        this.field3558.method378(var4, 31316);
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(B)I")
    public final int method1612(byte arg0) {
        int var2 = 72 / ((arg0 - 56) / 56);
        field3532++;
        return this.field3546 == null ? 0 : this.field3546.field5782;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(III)I")
    public static final int method1613(int arg0, int arg1, int arg2) {
        field3526++;
        if (arg0 <= 96) {
            method1601(37);
        }
        return arg2 == 4 || arg2 == 5 ? class194.field2509[arg1 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "(B)I")
    public final int method1614(byte arg0) {
        if (arg0 != 1) {
            field3535 = null;
        }
        field3531++;
        return this.field3549;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BLlt;)V")
    public static final void method1615(byte arg0, class95 arg1) {
        arg1.field1176 = null;
        field3556++;
        int var2 = arg1.field1175.length;
        if (arg0 <= 0) {
            return;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            arg1.field1175[var3].field6202 = false;
        }
        class361[] var4 = class648.field9171;
        synchronized (class648.field9171) {
            if (class648.field9171.length > var2 && class388.field5602[var2] < 200) {
                class648.field9171[var2].method2216(4, arg1);
                int var10002 = class388.field5602[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "(I)V")
    public static final void method1616(int arg0) {
        field3539++;
        if (arg0 != -2) {
            return;
        }
        class8 var1 = (class8) class690.field9744.method374((byte) 81);
        boolean var2 = class377.field5414 != null || class614.field8380 > 0;
        if (var2) {
            class688.field9717 = 1;
        }
        if (class483.field6541 && class348.field5096.method32(81, -122) && class179.field2242 > 2) {
            if (var2) {
                class50.field664 = (class69) class37.field371.field825.field275.field275;
            } else {
                class565.method3192((class69) class37.field371.field825.field275.field275, var1.method49((byte) -31), arg0 ^ 0x77, var1.method51(arg0 + 3));
            }
        } else if (var2) {
            class50.field664 = (class69) class37.field371.field825.field275;
        } else {
            class565.method3192((class69) class37.field371.field825.field275, var1.method49((byte) -31), arg0 ^ 0x6F, var1.method51(1));
        }
    }

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "(I)V")
    public final void method1617(int arg0) {
        field3551++;
        if (arg0 != -13694) {
            this.field3549 = -44;
        }
        if (this.field3559 != null) {
            if (this.method1608((byte) 84) == null) {
                return;
            }
            if (this.field3561) {
                boolean var6 = true;
                for (class28 var7 = this.field3559.method374((byte) 105); var7 != null; var7 = this.field3559.method372(arg0 - 7046)) {
                    int var9 = (int) var7.field272;
                    if (this.field3527[var9] == 0) {
                        this.method1605(1, var9, true);
                    }
                    if (this.field3527[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method175(30604);
                    }
                }
                while (this.field3546.field5788.length > this.field3557) {
                    if (this.field3546.field5788[this.field3557] == 0) {
                        this.field3557++;
                    } else {
                        if (this.field3555.field6758 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field3527[this.field3557] == 0) {
                            this.method1605(1, this.field3557, true);
                        }
                        if (this.field3527[this.field3557] == 0) {
                            class28 var8 = new class28();
                            var8.field272 = this.field3557;
                            var6 = false;
                            this.field3559.method378(var8, arg0 ^ 0xFFFFB0D6);
                        }
                        this.field3557++;
                    }
                }
                if (var6) {
                    this.field3561 = false;
                    this.field3557 = 0;
                }
            } else if (this.field3560) {
                boolean var2 = true;
                for (class28 var3 = this.field3559.method374((byte) 83); var3 != null; var3 = this.field3559.method372(arg0 ^ 0x647E)) {
                    int var5 = (int) var3.field272;
                    if (this.field3527[var5] != 1) {
                        this.method1605(2, var5, true);
                    }
                    if (this.field3527[var5] == 1) {
                        var3.method175(30604);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field3546.field5788.length > this.field3557) {
                    if (this.field3546.field5788[this.field3557] == 0) {
                        this.field3557++;
                    } else {
                        if (this.field3530.method2828((byte) -123)) {
                            var2 = false;
                            break;
                        }
                        if (this.field3527[this.field3557] != 1) {
                            this.method1605(2, this.field3557, true);
                        }
                        if (this.field3527[this.field3557] != 1) {
                            class28 var4 = new class28();
                            var4.field272 = this.field3557;
                            var2 = false;
                            this.field3559.method378(var4, 31316);
                        }
                        this.field3557++;
                    }
                }
                if (var2) {
                    this.field3560 = false;
                    this.field3557 = 0;
                }
            } else {
                this.field3559 = null;
            }
        }
        if (!this.field3563 || class669.method3713(0) < this.field3562) {
            return;
        }
        for (class368 var10 = (class368) this.field3554.method2499(-107); var10 != null; var10 = (class368) this.field3554.method2503(0)) {
            if (!var10.field5297) {
                if (var10.field5295) {
                    if (!var10.field5294) {
                        throw new RuntimeException();
                    }
                    var10.method175(30604);
                } else {
                    var10.field5295 = true;
                }
            }
        }
        this.field3562 = class669.method3713(0) + 1000L;
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(ILvh;Lvh;Lkl;Lmca;I[BIZ)V")
    public class256(int arg0, class403 arg1, class403 arg2, class502 arg3, class500 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field3528 = arg1;
        this.field3553 = arg0;
        if (this.field3528 == null) {
            this.field3561 = false;
        } else {
            this.field3561 = true;
            this.field3559 = new class59();
        }
        this.field3542 = arg5;
        this.field3555 = arg4;
        this.field3545 = arg7;
        this.field3563 = arg8;
        this.field3543 = arg2;
        this.field3530 = arg3;
        this.field3541 = arg6;
        if (this.field3543 != null) {
            this.field3537 = this.field3555.method2815(this.field3553, this.field3543, (byte) 85);
        }
    }
}
