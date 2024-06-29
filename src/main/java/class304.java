import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class304 extends class393 {

    @OriginalMember(owner = "client!pda", name = "m", descriptor = "I")
    private int field3734 = 0;

    @OriginalMember(owner = "client!pda", name = "D", descriptor = "Lil;")
    private class68 field3751 = new class68(16);

    @OriginalMember(owner = "client!pda", name = "Q", descriptor = "I")
    private int field3764 = 0;

    @OriginalMember(owner = "client!pda", name = "P", descriptor = "Lae;")
    private class40 field3763 = new class40();

    @OriginalMember(owner = "client!pda", name = "U", descriptor = "J")
    private long field3768 = 0L;

    @OriginalMember(owner = "client!pda", name = "t", descriptor = "I")
    private int field3741;

    @OriginalMember(owner = "client!pda", name = "N", descriptor = "Llf;")
    private class676 field3761;

    @OriginalMember(owner = "client!pda", name = "O", descriptor = "Z")
    private boolean field3762;

    @OriginalMember(owner = "client!pda", name = "R", descriptor = "Lae;")
    private class40 field3765;

    @OriginalMember(owner = "client!pda", name = "T", descriptor = "Z")
    private boolean field3767;

    @OriginalMember(owner = "client!pda", name = "B", descriptor = "Llf;")
    private class676 field3749;

    @OriginalMember(owner = "client!pda", name = "E", descriptor = "I")
    private int field3752;

    @OriginalMember(owner = "client!pda", name = "M", descriptor = "Lth;")
    private class286 field3760;

    @OriginalMember(owner = "client!pda", name = "H", descriptor = "Luaa;")
    private class436 field3755;

    @OriginalMember(owner = "client!pda", name = "k", descriptor = "I")
    private int field3732;

    @OriginalMember(owner = "client!pda", name = "n", descriptor = "[B")
    private byte[] field3735;

    @OriginalMember(owner = "client!pda", name = "l", descriptor = "Lft;")
    private class559 field3733;

    @OriginalMember(owner = "client!pda", name = "y", descriptor = "I")
    public static int field3746 = -1;

    @OriginalMember(owner = "client!pda", name = "j", descriptor = "[I")
    public static int[] field3731 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!pda", name = "J", descriptor = "F")
    public static float field3757 = 0.0F;

    @OriginalMember(owner = "client!pda", name = "h", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!pda", name = "i", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!pda", name = "o", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!pda", name = "p", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!pda", name = "r", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!pda", name = "s", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!pda", name = "w", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!pda", name = "x", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!pda", name = "A", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!pda", name = "C", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!pda", name = "F", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!pda", name = "I", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!pda", name = "K", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!pda", name = "L", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!pda", name = "u", descriptor = "Lds;")
    private class375 field3742;

    @OriginalMember(owner = "client!pda", name = "q", descriptor = "Ljava/lang/Object;")
    public static Object field3738;

    @OriginalMember(owner = "client!pda", name = "S", descriptor = "Z")
    private boolean field3766;

    @OriginalMember(owner = "client!pda", name = "G", descriptor = "[B")
    private byte[] field3754;

    @OriginalMember(owner = "client!pda", name = "z", descriptor = "[I")
    public static int[] field3747;

    @OriginalMember(owner = "client!pda", name = "v", descriptor = "[Lro;")
    public static class170[] field3743;

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "(B)I")
    public final int method1734(byte arg0) {
        field3758++;
        if (arg0 < 57) {
            method1746(16, -68);
        }
        if (this.method1743((byte) -14) == null) {
            return this.field3733 == null ? 0 : this.field3733.method229((byte) -69);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!pda", name = "d", descriptor = "(B)V")
    public final void method1735(byte arg0) {
        field3737++;
        if (arg0 != -95) {
            this.field3764 = 56;
        }
        if (this.field3761 != null) {
            this.field3766 = true;
            if (this.field3765 == null) {
                this.field3765 = new class40();
            }
        }
    }

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "(I)V")
    public final void method1736(int arg0) {
        field3730++;
        if (this.field3765 == null || this.method1743((byte) -14) == null) {
            return;
        }
        for (class329 var2 = this.field3763.method237(118); var2 != null; var2 = this.field3763.method245((byte) 69)) {
            int var3 = (int) var2.field4199;
            if (var3 < 0 || this.field3742.field4725 <= var3 || this.field3742.field4737[var3] == 0) {
                var2.method1871(-122);
            } else {
                if (this.field3754[var3] == 0) {
                    this.method1737(var3, 112, 1);
                }
                if (this.field3754[var3] == -1) {
                    this.method1737(var3, -103, 2);
                }
                if (this.field3754[var3] == 1) {
                    var2.method1871(-127);
                }
            }
        }
        if (arg0 > -102) {
            this.method1735((byte) -34);
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(III)Lft;")
    private final class559 method1737(int arg0, int arg1, int arg2) {
        field3744++;
        class559 var4 = (class559) this.field3751.method399(-32748, (long) arg0);
        int var5 = -48 % ((arg1 - 8) / 47);
        if (var4 != null && arg2 == 0 && !var4.field7752 && var4.field7755) {
            var4.method1871(-39);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field3761 == null || this.field3754[arg0] == -1) {
                    if (this.field3755.method2299(26555)) {
                        return null;
                    }
                    var4 = this.field3755.method2288(arg0, this.field3741, 4, true, (byte) 2);
                } else {
                    var4 = this.field3760.method1611(8217, this.field3761, arg0);
                }
            } else if (arg2 == 1) {
                if (this.field3761 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field3760.method1609(arg0, -121, this.field3761);
            } else if (arg2 == 2) {
                if (this.field3761 == null) {
                    throw new RuntimeException();
                }
                if (this.field3754[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field3755.method2297(90)) {
                    return null;
                }
                var4 = this.field3755.method2288(arg0, this.field3741, 4, false, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field3751.method402(var4, (byte) -59, (long) arg0);
        }
        if (var4.field7755) {
            return null;
        }
        byte[] var6 = var4.method232((byte) 114);
        if (!(var4 instanceof class285)) {
            try {
                if (var6 == null || var6.length <= 2) {
                    throw new RuntimeException();
                }
                class374.field4719.reset();
                class374.field4719.update(var6, 0, var6.length - 2);
                int var7 = (int) class374.field4719.getValue();
                if (this.field3742.field4735[arg0] != var7) {
                    throw new RuntimeException();
                }
                if (this.field3742.field4732 != null && this.field3742.field4732[arg0] != null) {
                    byte[] var8 = this.field3742.field4732[arg0];
                    byte[] var9 = class357.method1969(var6.length - 2, var6, -73, 0);
                    for (int var10 = 0; var10 < 64; var10++) {
                        if (var8[var10] != var9[var10]) {
                            throw new RuntimeException();
                        }
                    }
                }
                this.field3755.field5469 = 0;
                this.field3755.field5468 = 0;
            } catch (RuntimeException var18) {
                this.field3755.method2294(true);
                var4.method1871(-27);
                if (var4.field7752 && !this.field3755.method2299(26555)) {
                    class37 var11 = this.field3755.method2288(arg0, this.field3741, 4, true, (byte) 2);
                    this.field3751.method402(var11, (byte) -63, (long) arg0);
                }
                return null;
            }
            var6[var6.length - 2] = (byte) (this.field3742.field4721[arg0] >>> 8);
            var6[var6.length - 1] = (byte) this.field3742.field4721[arg0];
            if (this.field3761 != null) {
                this.field3760.method1610(var6, true, this.field3761, arg0);
                if (this.field3754[arg0] != 1) {
                    this.field3734++;
                    this.field3754[arg0] = 1;
                }
            }
            if (!var4.field7752) {
                var4.method1871(-74);
            }
            return var4;
        }
        try {
            if (var6 == null || var6.length <= 2) {
                throw new RuntimeException();
            }
            class374.field4719.reset();
            class374.field4719.update(var6, 0, var6.length - 2);
            int var12 = (int) class374.field4719.getValue();
            if (this.field3742.field4735[arg0] != var12) {
                throw new RuntimeException();
            }
            if (this.field3742.field4732 != null && this.field3742.field4732[arg0] != null) {
                byte[] var13 = this.field3742.field4732[arg0];
                byte[] var14 = class357.method1969(var6.length - 2, var6, 127, 0);
                for (int var15 = 0; var15 < 64; var15++) {
                    if (var13[var15] != var14[var15]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var16 = (var6[var6.length - 2] & 0xFF << 8) + (var6[var6.length - 1] & 0xFF);
            if ((this.field3742.field4721[arg0] & 0xFFFF) != var16) {
                throw new RuntimeException();
            }
            if (this.field3754[arg0] != 1) {
                this.field3734++;
                this.field3754[arg0] = 1;
            }
            if (!var4.field7752) {
                var4.method1871(-17);
            }
            return var4;
        } catch (Exception var19) {
            this.field3754[arg0] = -1;
            var4.method1871(-126);
            if (var4.field7752 && !this.field3755.method2299(26555)) {
                class37 var17 = this.field3755.method2288(arg0, this.field3741, 4, true, (byte) 2);
                this.field3751.method402(var17, (byte) -84, (long) arg0);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "(I)I")
    public final int method1738(int arg0) {
        field3729++;
        return arg0 == -14311 ? this.field3734 : 76;
    }

    @OriginalMember(owner = "client!pda", name = "d", descriptor = "(I)V")
    public final void method1739(int arg0) {
        field3753++;
        if (this.field3765 != null) {
            if (this.method1743((byte) -14) == null) {
                return;
            }
            if (this.field3762) {
                boolean var6 = true;
                for (class329 var7 = this.field3765.method237(120); var7 != null; var7 = this.field3765.method245((byte) 102)) {
                    int var9 = (int) var7.field4199;
                    if (this.field3754[var9] == 0) {
                        this.method1737(var9, 126, 1);
                    }
                    if (this.field3754[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method1871(-12);
                    }
                }
                while (this.field3742.field4737.length > this.field3764) {
                    if (this.field3742.field4737[this.field3764] == 0) {
                        this.field3764++;
                    } else {
                        if (this.field3760.field3565 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field3754[this.field3764] == 0) {
                            this.method1737(this.field3764, 66, 1);
                        }
                        if (this.field3754[this.field3764] == 0) {
                            class329 var8 = new class329();
                            var8.field4199 = this.field3764;
                            this.field3765.method239(var8, (byte) 93);
                            var6 = false;
                        }
                        this.field3764++;
                    }
                }
                if (var6) {
                    this.field3764 = 0;
                    this.field3762 = false;
                }
            } else if (this.field3766) {
                boolean var2 = true;
                for (class329 var3 = this.field3765.method237(96); var3 != null; var3 = this.field3765.method245((byte) 119)) {
                    int var5 = (int) var3.field4199;
                    if (this.field3754[var5] != 1) {
                        this.method1737(var5, -43, 2);
                    }
                    if (this.field3754[var5] == 1) {
                        var3.method1871(-97);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field3742.field4737.length > this.field3764) {
                    if (this.field3742.field4737[this.field3764] == 0) {
                        this.field3764++;
                    } else {
                        if (this.field3755.method2297(108)) {
                            var2 = false;
                            break;
                        }
                        if (this.field3754[this.field3764] != 1) {
                            this.method1737(this.field3764, -79, 2);
                        }
                        if (this.field3754[this.field3764] != 1) {
                            class329 var4 = new class329();
                            var4.field4199 = this.field3764;
                            this.field3765.method239(var4, (byte) 93);
                            var2 = false;
                        }
                        this.field3764++;
                    }
                }
                if (var2) {
                    this.field3766 = false;
                    this.field3764 = 0;
                }
            } else {
                this.field3765 = null;
            }
        }
        if (this.field3767 && class571.method3150(116) >= this.field3768) {
            for (class559 var10 = (class559) this.field3751.method407((byte) 124); var10 != null; var10 = (class559) this.field3751.method403(12561)) {
                if (!var10.field7755) {
                    if (var10.field7754) {
                        if (!var10.field7752) {
                            throw new RuntimeException();
                        }
                        var10.method1871(-24);
                    } else {
                        var10.field7754 = true;
                    }
                }
            }
            this.field3768 = class571.method3150(112) + 1000L;
        }
        if (arg0 < 53) {
            this.method1735((byte) 13);
        }
    }

    @OriginalMember(owner = "client!pda", name = "e", descriptor = "(I)V")
    public static void method1740(int arg0) {
        if (arg0 != -4058) {
            method1746(-34, -116);
        }
        field3747 = null;
        field3738 = null;
        field3731 = null;
        field3743 = null;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Z)I")
    public final int method1741(boolean arg0) {
        field3740++;
        if (this.field3742 == null) {
            return 0;
        } else if (this.field3762) {
            class329 var2 = this.field3765.method237(123);
            if (var2 == null) {
                return 0;
            } else if (arg0) {
                return (int) var2.field4199;
            } else {
                return 31;
            }
        } else {
            return this.field3742.field4736;
        }
    }

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "(Z)I")
    public final int method1742(boolean arg0) {
        field3759++;
        if (arg0) {
            this.method1748(-1, 56);
        }
        return this.field3742 == null ? 0 : this.field3742.field4736;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(B)Lds;")
    public final class375 method1743(byte arg0) {
        field3756++;
        if (this.field3742 != null) {
            return this.field3742;
        }
        if (this.field3733 == null) {
            if (this.field3755.method2299(26555)) {
                return null;
            }
            this.field3733 = this.field3755.method2288(this.field3741, 255, 4, true, (byte) 0);
        }
        if (this.field3733.field7755) {
            return null;
        }
        if (arg0 != -14) {
            this.method1734((byte) 70);
        }
        byte[] var2 = this.field3733.method232((byte) 121);
        if (this.field3733 instanceof class285) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3742 = new class375(var2, this.field3732, this.field3735);
                if (this.field3742.field4724 != this.field3752) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field3742 = null;
                if (this.field3755.method2299(arg0 + 26569)) {
                    this.field3733 = null;
                } else {
                    this.field3733 = this.field3755.method2288(this.field3741, 255, arg0 ^ 0xFFFFFFF6, true, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3742 = new class375(var2, this.field3732, this.field3735);
            } catch (RuntimeException var4) {
                this.field3755.method2294(true);
                this.field3742 = null;
                if (this.field3755.method2299(26555)) {
                    this.field3733 = null;
                } else {
                    this.field3733 = this.field3755.method2288(this.field3741, 255, arg0 ^ 0xFFFFFFF6, true, (byte) 0);
                }
                return null;
            }
            if (this.field3749 != null) {
                this.field3760.method1610(var2, true, this.field3749, this.field3741);
            }
        }
        if (this.field3761 != null) {
            this.field3734 = 0;
            this.field3754 = new byte[this.field3742.field4725];
        }
        this.field3733 = null;
        return this.field3742;
    }

    @OriginalMember(owner = "client!pda", name = "f", descriptor = "(I)V")
    public static final void method1744(int arg0) {
        if (class196.field2458 > 1) {
            class16.field266 = class450.field5767;
            class196.field2458--;
        }
        field3739++;
        if (class579.field8113) {
            class579.field8113 = false;
            class695.method3919(arg0 - 1);
            return;
        }
        if (!class84.field1188) {
            class477.method2521((byte) 91);
        }
        for (int var1 = 0; var1 < 100 && class266.method1547(true); var1++) {
        }
        if (class504.field6675 != 10) {
            return;
        }
        while (class367.method2013(-25236)) {
            class704 var2 = class314.method1820(class638.field8954, class400.field5014, (byte) 78);
            var2.field9929.method3509(0, (byte) -114);
            int var3 = var2.field9929.field8812;
            class389.method2090(4, var2.field9929);
            var2.field9929.method3487(var2.field9929.field8812 - var3, 2105852);
            class122.method654(var2, (byte) -36);
        }
        if (class373.field4703 == null) {
            if (class571.method3150(106) >= class581.field8124) {
                class373.field4703 = class473.field6005.method257(class131.field1628.field3680, arg0 + 89);
            }
        } else if (class373.field4703.field5346 != -1) {
            class704 var4 = class314.method1820(class147.field1886, class400.field5014, (byte) -128);
            var4.field9929.method3526(class373.field4703.field5346, 13469);
            class122.method654(var4, (byte) -36);
            class373.field4703 = null;
            class581.field8124 = class571.method3150(arg0 ^ 0x6A) + 30000L;
        }
        class368 var5 = (class368) class403.field5058.method237(arg0 ^ 0x52);
        if (var5 != null || class452.field5799 < class571.method3150(125) - 2000L) {
            class704 var6 = null;
            int var7 = 0;
            for (class368 var8 = (class368) class563.field7826.method237(115); var8 != null && (var6 == null || var6.field9929.field8812 - var7 < 240); var8 = (class368) class563.field7826.method245((byte) 22)) {
                var8.method1871(arg0 ^ 0xFFFFFFCA);
                int var9 = var8.method439(true);
                if (var9 < -1) {
                    var9 = -1;
                } else if (var9 > 65534) {
                    var9 = 65534;
                }
                int var10 = var8.method437(9);
                if (var10 < -1) {
                    var10 = -1;
                } else if (var10 > 65534) {
                    var10 = 65534;
                }
                if (class60.field824 != var10 || class370.field4693 != var9) {
                    if (var6 == null) {
                        class395.field4990++;
                        var6 = class314.method1820(class560.field7784, class400.field5014, (byte) 91);
                        var6.field9929.method3509(0, (byte) -115);
                        var7 = var6.field9929.field8812;
                    }
                    int var11 = var10 - class60.field824;
                    class60.field824 = var10;
                    int var12 = var9 - class370.field4693;
                    class370.field4693 = var9;
                    int var13 = (int) ((var8.method436(-84) - class452.field5799) / 20L);
                    if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                        var12 += 32;
                        var11 += 32;
                        var6.field9929.method3526((var13 << 12) + (var11 << 6) + var12, 13469);
                    } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                        var6.field9929.method3509(var13 + 128, (byte) -110);
                        var11 += 128;
                        var12 += 128;
                        var6.field9929.method3526((var11 << 8) + var12, arg0 ^ 0x3495);
                    } else if (var13 >= 32) {
                        var6.field9929.method3526(var13 + 57344, 13469);
                        if (var10 == 1 || var9 == -1) {
                            var6.field9929.method3464(Integer.MIN_VALUE, arg0 ^ 0xFFFFFF9D);
                        } else {
                            var6.field9929.method3464(var10 | var9 << 16, -97);
                        }
                    } else {
                        var6.field9929.method3509(var13 + 192, (byte) -112);
                        if (var10 == 1 || var9 == -1) {
                            var6.field9929.method3464(Integer.MIN_VALUE, -106);
                        } else {
                            var6.field9929.method3464(var10 | var9 << 16, -120);
                        }
                    }
                    class452.field5799 = var8.method436(-71);
                }
            }
            if (var6 != null) {
                var6.field9929.method3487(var6.field9929.field8812 - var7, 2105852);
                class122.method654(var6, (byte) -36);
            }
        }
        if (var5 != null) {
            long var14 = (var5.method436(-106) - class584.field8158) / 50L;
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            class584.field8158 = var5.method436(arg0 ^ 0xFFFFFF86);
            int var16 = var5.method439(true);
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var17 = var5.method437(9);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            byte var18 = 0;
            if (var5.method438(false) == 2) {
                var18 = 1;
            }
            class153.field1985++;
            int var19 = (int) var14;
            class704 var20 = class314.method1820(class157.field2042, class400.field5014, (byte) 119);
            var20.field9929.method3505(arg0 ^ 0xFFFFFF8C, var19 | var18 << 15);
            var20.field9929.method3502(var16 << 16 | var17, -97);
            class122.method654(var20, (byte) -36);
        }
        if (class4.field113 > 0) {
            class360.field4587++;
            class704 var21 = class314.method1820(class241.field3006, class400.field5014, (byte) 74);
            var21.field9929.method3509(class4.field113 * 3, (byte) -119);
            for (int var22 = 0; var22 < class4.field113; var22++) {
                class521 var23 = class265.field3366[var22];
                long var24 = (var23.method564(arg0 + 26009) - class194.field2434) / 50L;
                if (var24 > 65535L) {
                    var24 = 65535L;
                }
                class194.field2434 = var23.method564(26017);
                var21.field9929.method3509(var23.method566((byte) -109), (byte) -122);
                var21.field9929.method3526((int) var24, 13469);
            }
            class122.method654(var21, (byte) -36);
        }
        if (class56.field801 > 0) {
            class56.field801--;
        }
        if (class365.field4649 && class56.field801 <= 0) {
            class365.field4649 = false;
            class253.field3098++;
            class56.field801 = 20;
            class704 var26 = class314.method1820(class199.field2521, class400.field5014, (byte) 124);
            var26.field9929.method3506(128, (int) class331.field4223 >> 3);
            var26.field9929.method3505(arg0 ^ 0xFFFFFF8D, (int) class133.field1739 >> 3);
            class122.method654(var26, (byte) -36);
        }
        if (class668.field9425 != class588.field8273) {
            class486.field6446++;
            class668.field9425 = class588.field8273;
            class704 var27 = class314.method1820(class463.field5899, class400.field5014, (byte) -66);
            var27.field9929.method3509(class588.field8273 ? 1 : 0, (byte) -128);
            class122.method654(var27, (byte) -36);
        }
        if (!class206.field2617) {
            class2.field22++;
            class704 var28 = class314.method1820(class700.field9902, class400.field5014, (byte) -77);
            var28.field9929.method3509(0, (byte) -126);
            int var29 = var28.field9929.field8812;
            class630 var30 = new class630(class529.method2877(4929));
            class301.field3698.method2698(108, var30);
            var28.field9929.method3475(65536, var30.field8812, 0, var30.field8804);
            var28.field9929.method3487(var28.field9929.field8812 - var29, arg0 ^ 0x2021F4);
            class122.method654(var28, (byte) -36);
            class206.field2617 = true;
        }
        if (class270.field3423 != null) {
            if (class296.field3661 == 2) {
                class492.method2648(true);
            } else if (class296.field3661 == 3) {
                class55.method354(arg0 - 1202242084);
            }
        }
        if (class595.field8376) {
            class595.field8376 = false;
        } else {
            field3757 /= 2.0F;
        }
        if (class174.field2265) {
            class174.field2265 = false;
        } else {
            class539.field7228 /= 2.0F;
        }
        class88.method503(arg0 + 3);
        if (class504.field6675 != 10) {
            return;
        }
        class550.method3038((byte) -71);
        class329.method1874(-21715);
        class117.method638((byte) -122);
        class325.field4172++;
        if (class325.field4172 > 750) {
            class695.method3919(7);
            return;
        }
        class612.method3374(0);
        class688.method3875(124);
        class230.method1388(-1);
        for (int var31 = class684.field9606.method1186((byte) -108, true); var31 != -1; var31 = class684.field9606.method1186((byte) 117, false)) {
            class184.method1144(arg0 ^ 0x8, var31);
            class428.field5363[class695.method3921(class88.field1236++, 31)] = var31;
        }
        for (class592 var32 = class649.method3645((byte) 108); var32 != null; var32 = class649.method3645((byte) 116)) {
            int var33 = var32.method3252(arg0 + 247);
            int var34 = var32.method3257(arg0 - 4);
            if (var33 == 1) {
                class412.field5150[var34] = var32.field8314;
                class665.field9381 |= class287.field3574[var34];
                class510.field6939[class695.method3921(31, class492.field6497++)] = var34;
            } else if (var33 == 2) {
                client.field9541[var34] = var32.field8316;
                class213.field2649[class695.method3921(31, class574.field8007++)] = var34;
            } else if (var33 == 3) {
                class507 var57 = class156.method894(arg0 ^ 0xC3472D78, var34);
                if (!var32.field8316.equals(var57.field6840)) {
                    var57.field6840 = var32.field8316;
                    class572.method3158(var57, arg0 + 1015);
                }
            } else if (var33 == 4) {
                class507 var35 = class156.method894(-1018745488, var34);
                int var36 = var32.field8314;
                int var37 = var32.field8312;
                int var38 = var32.field8319;
                if (var35.field6714 != var36 || var35.field6798 != var37 || var35.field6745 != var38) {
                    var35.field6745 = var38;
                    var35.field6714 = var36;
                    var35.field6798 = var37;
                    class572.method3158(var35, 1023);
                }
            } else if (var33 == 5) {
                class507 var55 = class156.method894(-1018745488, var34);
                if (var32.field8314 != var55.field6746 || var32.field8314 == -1) {
                    var55.field6742 = 0;
                    var55.field6746 = var32.field8314;
                    var55.field6717 = 0;
                    var55.field6820 = 1;
                    class395 var56 = var55.field6746 == -1 ? null : class583.field8149.method1844(64, var55.field6746);
                    if (var56 != null) {
                        class106.method602(var56, (byte) 104, var55.field6717);
                    }
                    class572.method3158(var55, 1023);
                }
            } else if (var33 == 6) {
                int var39 = var32.field8314;
                int var40 = var39 >> 10 & 0x1F;
                int var41 = (var39 & 0x3E1) >> 5;
                int var42 = var39 & 0x1F;
                int var43 = (var42 << 3) + (var40 << 19) + (var41 << 11);
                class507 var44 = class156.method894(-1018745488, var34);
                if (var44.field6710 != var43) {
                    var44.field6710 = var43;
                    class572.method3158(var44, arg0 ^ 0x3F7);
                }
            } else if (var33 == 7) {
                class507 var53 = class156.method894(-1018745488, var34);
                boolean var54 = var32.field8314 == 1;
                if (var53.field6859 != var54) {
                    var53.field6859 = var54;
                    class572.method3158(var53, 1023);
                }
            } else if (var33 == 8) {
                class507 var52 = class156.method894(-1018745488, var34);
                if (var32.field8314 != var52.field6813 || var32.field8312 != var52.field6799 || var32.field8319 != var52.field6850) {
                    var52.field6813 = var32.field8314;
                    var52.field6799 = var32.field8312;
                    var52.field6850 = var32.field8319;
                    if (var52.field6832 != -1) {
                        if (var52.field6712 > 0) {
                            var52.field6850 = var52.field6850 * 32 / var52.field6712;
                        } else if (var52.field6823 > 0) {
                            var52.field6850 = var52.field6850 * 32 / var52.field6823;
                        }
                    }
                    class572.method3158(var52, 1023);
                }
            } else if (var33 == 9) {
                class507 var45 = class156.method894(-1018745488, var34);
                if (var32.field8314 != var45.field6832 || var32.field8312 != var45.field6858) {
                    var45.field6858 = var32.field8312;
                    var45.field6832 = var32.field8314;
                    class572.method3158(var45, 1023);
                }
            } else if (var33 == 10) {
                class507 var46 = class156.method894(-1018745488, var34);
                if (var32.field8314 != var46.field6833 || var32.field8312 != var46.field6825 || var32.field8319 != var46.field6867) {
                    var46.field6867 = var32.field8319;
                    var46.field6833 = var32.field8314;
                    var46.field6825 = var32.field8312;
                    class572.method3158(var46, 1023);
                }
            } else if (var33 == 11) {
                class507 var51 = class156.method894(arg0 - 1018745496, var34);
                var51.field6751 = 0;
                var51.field6726 = var51.field6810 = var32.field8314;
                var51.field6724 = var51.field6851 = var32.field8312;
                var51.field6862 = 0;
                class572.method3158(var51, 1023);
            } else if (var33 == 12) {
                class507 var49 = class156.method894(arg0 - 1018745496, var34);
                int var50 = var32.field8314;
                if (var49 != null && var49.field6735 == 0) {
                    if (var50 > (var49.field6852 - var49.field6700)) {
                        var50 = var49.field6852 - var49.field6700;
                    }
                    if (var50 < 0) {
                        var50 = 0;
                    }
                    if (var49.field6769 != var50) {
                        var49.field6769 = var50;
                        class572.method3158(var49, 1023);
                    }
                }
            } else if (var33 == 14) {
                class507 var48 = class156.method894(-1018745488, var34);
                var48.field6783 = var32.field8314;
            } else if (var33 == 15) {
                class436.field5446 = var32.field8312;
                class520.field7095 = true;
                class309.field3946 = var32.field8314;
            } else if (var33 == 16) {
                class507 var47 = class156.method894(arg0 ^ 0xC3472D78, var34);
                var47.field6777 = var32.field8314;
            }
        }
        class653.field9220++;
        if (class369.field4685 != 0) {
            class231.field2890 += 20;
            if (class231.field2890 >= 400) {
                class369.field4685 = 0;
            }
        }
        if (class698.field9867 != null) {
            class532.field7179++;
            if (class532.field7179 >= 15) {
                class572.method3158(class698.field9867, 1023);
                class698.field9867 = null;
            }
        }
        class297.field3663 = false;
        class452.field5801 = null;
        class147.field1887 = null;
        class356.field4538 = false;
        class244.method1452(-1, -1, null, 17274);
        class58.method366((byte) 65, null, -1, -1);
        if (!class664.field9377) {
            class474.field6013 = -1;
        }
        class23.method169((byte) 91);
        class450.field5767++;
        if (class271.field3429) {
            class307.field3915++;
            class704 var58 = class314.method1820(class517.field7070, class400.field5014, (byte) 104);
            var58.field9929.method3472(13412, class402.field5026 | class684.field9610 << 28 | class665.field9382 << 14);
            class122.method654(var58, (byte) -36);
            class271.field3429 = false;
        }
        while (true) {
            class71 var59;
            class507 var60;
            class507 var61;
            do {
                var59 = (class71) class627.field8738.method244(true);
                if (var59 == null) {
                    while (true) {
                        class71 var62;
                        class507 var63;
                        class507 var64;
                        do {
                            var62 = (class71) class51.field768.method244(true);
                            if (var62 == null) {
                                while (true) {
                                    class71 var65;
                                    class507 var66;
                                    class507 var67;
                                    do {
                                        var65 = (class71) class231.field2884.method244(true);
                                        if (var65 == null) {
                                            if (class147.field1887 == null) {
                                                class373.field4707 = 0;
                                            }
                                            if (class358.field4562 != null) {
                                                class353.method1937(7129);
                                            }
                                            if (class199.field2531 > 0 && class277.field3470.method448((byte) -68, 82) && class277.field3470.method448((byte) -68, 81) && class204.field2592 != 0) {
                                                int var68 = class376.field4748.field6470 - class204.field2592;
                                                if (var68 < 0) {
                                                    var68 = 0;
                                                } else if (var68 > 3) {
                                                    var68 = 3;
                                                }
                                                class5.method41(1024908230, var68, class376.field4748.field9754[0] + class630.field8817, class376.field4748.field9758[0] + class145.field1879);
                                            }
                                            class586.method3229(true);
                                            for (int var69 = 0; var69 < 5; var69++) {
                                                int var10002 = class129.field1611[var69]++;
                                            }
                                            if (class665.field9381 && class571.method3150(114) - 60000L > class591.field8305) {
                                                class469.method2484(false);
                                            }
                                            for (class460 var70 = (class460) class594.field8339.method802((byte) 94); var70 != null; var70 = (class460) class594.field8339.method800((byte) -106)) {
                                                if ((class571.method3150(arg0 ^ 0x76) / 1000L - 5L) > ((long) var70.field5846)) {
                                                    if (var70.field5844 > 0) {
                                                        class1.method3("", var70.field5847 + class83.field1127.method476((byte) 90, class250.field3068), 5, -1, "", 0, "");
                                                    }
                                                    if (var70.field5844 == 0) {
                                                        class1.method3("", var70.field5847 + class83.field1128.method476((byte) 117, class250.field3068), 5, -1, "", 0, "");
                                                    }
                                                    var70.method3146(2);
                                                }
                                            }
                                            class630.field8785++;
                                            if (class630.field8785 > 500) {
                                                class630.field8785 = 0;
                                                int var71 = (int) (Math.random() * 8.0D);
                                                if ((var71 & 0x1) == 1) {
                                                    class183.field2335 += class177.field2295;
                                                }
                                                if ((var71 & 0x2) == 2) {
                                                    class413.field5170 += class158.field2054;
                                                }
                                                if ((var71 & 0x4) == 4) {
                                                    class237.field2965 += class657.field9291;
                                                }
                                            }
                                            if (class183.field2335 < -50) {
                                                class177.field2295 = 2;
                                            }
                                            if (class413.field5170 < -55) {
                                                class158.field2054 = 2;
                                            }
                                            if (class183.field2335 > 50) {
                                                class177.field2295 = -2;
                                            }
                                            if (class237.field2965 < -40) {
                                                class657.field9291 = 1;
                                            }
                                            if (class413.field5170 > 55) {
                                                class158.field2054 = -2;
                                            }
                                            if (class237.field2965 > 40) {
                                                class657.field9291 = -1;
                                            }
                                            class335.field4264++;
                                            if (arg0 != 8) {
                                                method1744(58);
                                            }
                                            if (class335.field4264 > 500) {
                                                class335.field4264 = 0;
                                                int var72 = (int) (Math.random() * 8.0D);
                                                if ((var72 & 0x1) == 1) {
                                                    class411.field5135 += class575.field8014;
                                                }
                                                if ((var72 & 0x2) == 2) {
                                                    class354.field4510 += class441.field5578;
                                                }
                                            }
                                            if (class411.field5135 < -60) {
                                                class575.field8014 = 2;
                                            }
                                            if (class411.field5135 > 60) {
                                                class575.field8014 = -2;
                                            }
                                            if (class354.field4510 < -20) {
                                                class441.field5578 = 1;
                                            }
                                            class589.field8277++;
                                            if (class354.field4510 > 10) {
                                                class441.field5578 = -1;
                                            }
                                            if (class589.field8277 > 50) {
                                                class490.field6479++;
                                                class704 var73 = class314.method1820(class674.field9481, class400.field5014, (byte) -88);
                                                class122.method654(var73, (byte) -36);
                                            }
                                            if (class173.field2259) {
                                                class673.method3782(-30184);
                                                class173.field2259 = false;
                                            }
                                            try {
                                                class558.method3071((byte) 119);
                                                return;
                                            } catch (IOException var74) {
                                                class695.method3919(7);
                                                return;
                                            }
                                        }
                                        var66 = var65.field952;
                                        if (var66.field6834 < 0) {
                                            break;
                                        }
                                        var67 = class156.method894(-1018745488, var66.field6719);
                                    } while (var67 == null || var67.field6707 == null || var66.field6834 >= var67.field6707.length || var67.field6707[var66.field6834] != var66);
                                    class197.method1191(var65);
                                }
                            }
                            var63 = var62.field952;
                            if (var63.field6834 < 0) {
                                break;
                            }
                            var64 = class156.method894(arg0 ^ 0xC3472D78, var63.field6719);
                        } while (var64 == null || var64.field6707 == null || var63.field6834 >= var64.field6707.length || var64.field6707[var63.field6834] != var63);
                        class197.method1191(var62);
                    }
                }
                var60 = var59.field952;
                if (var60.field6834 < 0) {
                    break;
                }
                var61 = class156.method894(arg0 - 1018745496, var60.field6719);
            } while (var61 == null || var61.field6707 == null || var60.field6834 >= var61.field6707.length || var61.field6707[var60.field6834] != var60);
            class197.method1191(var59);
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(II)V")
    public final void method1745(int arg0, int arg1) {
        field3748++;
        if (arg0 != 59) {
            this.field3741 = 121;
        }
        if (this.field3761 == null) {
            return;
        }
        for (class329 var3 = this.field3763.method237(90); var3 != null; var3 = this.field3763.method245((byte) 87)) {
            if (((long) arg1) == var3.field4199) {
                return;
            }
        }
        class329 var4 = new class329();
        var4.field4199 = arg1;
        this.field3763.method239(var4, (byte) 93);
    }

    @OriginalMember(owner = "client!pda", name = "d", descriptor = "(II)V")
    public static final void method1746(int arg0, int arg1) {
        field3750++;
        if (arg1 < 0 || arg1 > 2) {
            arg1 = 0;
        }
        class608.field8541 = arg1;
        class474.field6012 = new class93[class573.field7995[class608.field8541] + 1];
        class475.field6032 = arg0;
        class704.field9936 = 0;
    }

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "(II)[B")
    public final byte[] method1747(int arg0, int arg1) {
        field3736++;
        if (arg1 != 750) {
            return null;
        }
        class559 var3 = this.method1737(arg0, -71, 0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method232((byte) 125);
            var3.method1871(-55);
            return var4;
        }
    }

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "(II)I")
    public final int method1748(int arg0, int arg1) {
        field3745++;
        if (arg0 < 71) {
            this.field3766 = true;
        }
        class559 var3 = (class559) this.field3751.method399(-32748, (long) arg1);
        return var3 == null ? 0 : var3.method229((byte) -69);
    }

    @OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(ILlf;Llf;Luaa;Lth;I[BIZ)V")
    public class304(int arg0, class676 arg1, class676 arg2, class436 arg3, class286 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field3741 = arg0;
        this.field3761 = arg1;
        if (this.field3761 == null) {
            this.field3762 = false;
        } else {
            this.field3762 = true;
            this.field3765 = new class40();
        }
        this.field3767 = arg8;
        this.field3749 = arg2;
        this.field3752 = arg7;
        this.field3760 = arg4;
        this.field3755 = arg3;
        this.field3732 = arg5;
        this.field3735 = arg6;
        if (this.field3749 != null) {
            this.field3733 = this.field3760.method1611(8217, this.field3749, this.field3741);
        }
    }
}
