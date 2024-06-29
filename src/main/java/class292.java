import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class292 extends class126 {

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "I")
    private int field4656 = 0;

    @OriginalMember(owner = "client!ko", name = "v", descriptor = "Lbn;")
    private class256 field4665 = new class256(16);

    @OriginalMember(owner = "client!ko", name = "R", descriptor = "I")
    private int field4686 = 0;

    @OriginalMember(owner = "client!ko", name = "Q", descriptor = "Lbd;")
    private class37 field4685 = new class37();

    @OriginalMember(owner = "client!ko", name = "T", descriptor = "J")
    private long field4688 = 0L;

    @OriginalMember(owner = "client!ko", name = "N", descriptor = "I")
    private int field4682;

    @OriginalMember(owner = "client!ko", name = "k", descriptor = "Lug;")
    private class333 field4654;

    @OriginalMember(owner = "client!ko", name = "O", descriptor = "Z")
    private boolean field4683;

    @OriginalMember(owner = "client!ko", name = "P", descriptor = "Lbd;")
    private class37 field4684;

    @OriginalMember(owner = "client!ko", name = "G", descriptor = "I")
    private int field4676;

    @OriginalMember(owner = "client!ko", name = "U", descriptor = "Z")
    private boolean field4689;

    @OriginalMember(owner = "client!ko", name = "q", descriptor = "Lug;")
    private class333 field4660;

    @OriginalMember(owner = "client!ko", name = "I", descriptor = "Lbi;")
    private class280 field4678;

    @OriginalMember(owner = "client!ko", name = "y", descriptor = "I")
    private int field4668;

    @OriginalMember(owner = "client!ko", name = "B", descriptor = "Lcq;")
    private class272 field4671;

    @OriginalMember(owner = "client!ko", name = "r", descriptor = "Los;")
    private class255 field4661;

    @OriginalMember(owner = "client!ko", name = "s", descriptor = "I")
    public static int field4662 = 0;

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!ko", name = "n", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!ko", name = "o", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!ko", name = "p", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!ko", name = "t", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!ko", name = "u", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!ko", name = "x", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!ko", name = "z", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!ko", name = "C", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!ko", name = "D", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!ko", name = "E", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!ko", name = "F", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!ko", name = "H", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!ko", name = "J", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!ko", name = "L", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!ko", name = "j", descriptor = "Lij;")
    private class241 field4653;

    @OriginalMember(owner = "client!ko", name = "w", descriptor = "Lmo;")
    public static class447 field4666;

    @OriginalMember(owner = "client!ko", name = "K", descriptor = "Lmp;")
    public static class452 field4680;

    @OriginalMember(owner = "client!ko", name = "S", descriptor = "Z")
    private boolean field4687;

    @OriginalMember(owner = "client!ko", name = "A", descriptor = "[B")
    private byte[] field4670;

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)I")
    public final int method1959(int arg0) {
        if (arg0 <= 64) {
            this.method927(-70, -42);
        }
        field4677++;
        if (this.method931((byte) -66) == null) {
            return this.field4661 == null ? 0 : this.field4661.method812(122);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)V")
    public final void method926(int arg0, int arg1) {
        field4674++;
        if (this.field4654 == null) {
            return;
        }
        if (arg1 >= -4) {
            this.field4687 = true;
        }
        for (class161 var3 = this.field4685.method253((byte) -6); var3 != null; var3 = this.field4685.method247((byte) 26)) {
            if (((long) arg0) == var3.field2539) {
                return;
            }
        }
        class161 var4 = new class161();
        var4.field2539 = (long) arg0;
        this.field4685.method245(500, var4);
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)Lia;")
    public static final class350 method1960(byte arg0) {
        field4672++;
        if (arg0 != 88) {
            method1963((byte) 124);
        }
        try {
            return (class350) Class.forName("ms").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lmo;BLmo;Lmo;Lmo;)V")
    public static final void method1961(class447 arg0, byte arg1, class447 arg2, class447 arg3, class447 arg4) {
        class375.field5666 = arg3;
        int var5 = 11 / ((arg1 - 20) / 58);
        field4663++;
        class236.field3951 = arg0;
        class173.field2883 = arg4;
        class82.field1029 = arg2;
        class203.field3266 = new class172[class173.field2883.method2773(86)][];
        class302.field4780 = new boolean[class173.field2883.method2773(124)];
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(I)I")
    public final int method1962(int arg0) {
        field4667++;
        if (this.field4653 == null) {
            return 0;
        } else {
            if (arg0 != 21735) {
                this.field4682 = -52;
            }
            return this.field4653.field3999;
        }
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(B)V")
    public static void method1963(byte arg0) {
        if (arg0 != 96) {
            method1961((class447) null, (byte) 87, (class447) null, (class447) null, (class447) null);
        }
        field4680 = null;
        field4666 = null;
    }

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "(B)V")
    public final void method1964(byte arg0) {
        field4673++;
        if (this.field4684 != null) {
            if (this.method931((byte) -88) == null) {
                return;
            }
            if (this.field4683) {
                boolean var6 = true;
                for (class161 var7 = this.field4684.method253((byte) -6); var7 != null; var7 = this.field4684.method247((byte) 121)) {
                    int var9 = (int) var7.field2539;
                    if (this.field4670[var9] == 0) {
                        this.method1966(var9, true, 1);
                    }
                    if (this.field4670[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method1120(115);
                    }
                }
                while (this.field4686 < this.field4653.field4003.length) {
                    if (this.field4653.field4003[this.field4686] == 0) {
                        this.field4686++;
                    } else {
                        if (this.field4678.field4490 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field4670[this.field4686] == 0) {
                            this.method1966(this.field4686, true, 1);
                        }
                        if (this.field4670[this.field4686] == 0) {
                            class161 var8 = new class161();
                            var8.field2539 = (long) this.field4686;
                            this.field4684.method245(arg0 ^ 0x1F5, var8);
                            var6 = false;
                        }
                        this.field4686++;
                    }
                }
                if (var6) {
                    this.field4683 = false;
                    this.field4686 = 0;
                }
            } else if (this.field4687) {
                boolean var2 = true;
                for (class161 var3 = this.field4684.method253((byte) -6); var3 != null; var3 = this.field4684.method247((byte) 1)) {
                    int var5 = (int) var3.field2539;
                    if (this.field4670[var5] != 1) {
                        this.method1966(var5, true, 2);
                    }
                    if (this.field4670[var5] == 1) {
                        var3.method1120(-87);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field4653.field4003.length > this.field4686) {
                    if (this.field4653.field4003[this.field4686] == 0) {
                        this.field4686++;
                    } else {
                        if (this.field4671.method1842(-21)) {
                            var2 = false;
                            break;
                        }
                        if (this.field4670[this.field4686] != 1) {
                            this.method1966(this.field4686, true, 2);
                        }
                        if (this.field4670[this.field4686] != 1) {
                            class161 var4 = new class161();
                            var4.field2539 = (long) this.field4686;
                            this.field4684.method245(500, var4);
                            var2 = false;
                        }
                        this.field4686++;
                    }
                }
                if (var2) {
                    this.field4686 = 0;
                    this.field4687 = false;
                }
            } else {
                this.field4684 = null;
            }
        }
        if (this.field4689 && class46.method297(27104) >= this.field4688) {
            for (class255 var10 = (class255) this.field4665.method1776(true); var10 != null; var10 = (class255) this.field4665.method1773(-1)) {
                if (!var10.field4129) {
                    if (var10.field4132) {
                        if (!var10.field4127) {
                            throw new RuntimeException();
                        }
                        var10.method1120(-99);
                    } else {
                        var10.field4132 = true;
                    }
                }
            }
            this.field4688 = class46.method297(arg0 + 27103) + 1000L;
        }
        if (arg0 != 1) {
            this.method927(-91, 42);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)Lij;")
    public final class241 method931(byte arg0) {
        field4679++;
        if (this.field4653 != null) {
            return this.field4653;
        } else if (arg0 > -12) {
            return null;
        } else {
            if (this.field4661 == null) {
                if (this.field4671.method1849(false)) {
                    return null;
                }
                this.field4661 = this.field4671.method1850((byte) 0, this.field4682, true, 255, -6832);
            }
            if (this.field4661.field4129) {
                return null;
            }
            byte[] var2 = this.field4661.method814(-30235);
            if (this.field4661 instanceof class108) {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field4653 = new class241(var2, this.field4676);
                    if (this.field4653.field4006 != this.field4668) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var3) {
                    this.field4653 = null;
                    if (this.field4671.method1849(false)) {
                        this.field4661 = null;
                    } else {
                        this.field4661 = this.field4671.method1850((byte) 0, this.field4682, true, 255, -6832);
                    }
                    return null;
                }
            } else {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field4653 = new class241(var2, this.field4676);
                } catch (RuntimeException var4) {
                    this.field4671.method1839(128);
                    this.field4653 = null;
                    if (this.field4671.method1849(false)) {
                        this.field4661 = null;
                    } else {
                        this.field4661 = this.field4671.method1850((byte) 0, this.field4682, true, 255, -6832);
                    }
                    return null;
                }
                if (this.field4660 != null) {
                    this.field4678.method1914(var2, this.field4660, this.field4682, true);
                }
            }
            this.field4661 = null;
            if (this.field4654 != null) {
                this.field4670 = new byte[this.field4653.field4002];
                this.field4656 = 0;
            }
            return this.field4653;
        }
    }

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "(B)V")
    public final void method1965(byte arg0) {
        field4657++;
        if (this.field4684 == null || this.method931((byte) -43) == null) {
            return;
        }
        class161 var2 = this.field4685.method253((byte) -6);
        int var3 = 109 / ((arg0 + 52) / 54);
        while (var2 != null) {
            int var4 = (int) var2.field2539;
            if (var4 < 0 || this.field4653.field4002 <= var4 || this.field4653.field4003[var4] == 0) {
                var2.method1120(-104);
            } else {
                if (this.field4670[var4] == 0) {
                    this.method1966(var4, true, 1);
                }
                if (this.field4670[var4] == -1) {
                    this.method1966(var4, true, 2);
                }
                if (this.field4670[var4] == 1) {
                    var2.method1120(-127);
                }
            }
            var2 = this.field4685.method247((byte) -128);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IZI)Los;")
    private final class255 method1966(int arg0, boolean arg1, int arg2) {
        field4659++;
        class255 var4 = (class255) this.field4665.method1770(-880, (long) arg0);
        if (var4 != null && arg2 == 0 && !var4.field4127 && var4.field4129) {
            var4.method1120(111);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field4654 == null || this.field4670[arg0] == -1) {
                    if (this.field4671.method1849(false)) {
                        return null;
                    }
                    var4 = this.field4671.method1850((byte) 2, arg0, true, this.field4682, -6832);
                } else {
                    var4 = this.field4678.method1908(arg0, this.field4654, -34);
                }
            } else if (arg2 == 1) {
                if (this.field4654 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field4678.method1913(this.field4654, arg0, 30384);
            } else if (arg2 == 2) {
                if (this.field4654 == null) {
                    throw new RuntimeException();
                }
                if (this.field4670[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field4671.method1842(-21)) {
                    return null;
                }
                var4 = this.field4671.method1850((byte) 2, arg0, false, this.field4682, -6832);
            } else {
                throw new RuntimeException();
            }
            this.field4665.method1766((long) arg0, var4, 105);
        }
        if (var4.field4129) {
            return null;
        } else if (arg1) {
            byte[] var5 = var4.method814(-30235);
            if (!var4 instanceof class108) {
                try {
                    if (var5 == null || var5.length <= 2) {
                        throw new RuntimeException();
                    }
                    class32.field393.reset();
                    class32.field393.update(var5, 0, var5.length - 2);
                    int var9 = (int) class32.field393.getValue();
                    if (this.field4653.field4007[arg0] != var9) {
                        throw new RuntimeException();
                    }
                    this.field4671.field4386 = 0;
                    this.field4671.field4385 = 0;
                } catch (RuntimeException var12) {
                    this.field4671.method1839(128);
                    var4.method1120(116);
                    if (var4.field4127 && !this.field4671.method1849(false)) {
                        class315 var10 = this.field4671.method1850((byte) 2, arg0, true, this.field4682, -6832);
                        this.field4665.method1766((long) arg0, var10, 120);
                    }
                    return null;
                }
                var5[var5.length - 2] = (byte) (this.field4653.field3985[arg0] >>> 8);
                var5[var5.length - 1] = (byte) this.field4653.field3985[arg0];
                if (this.field4654 != null) {
                    this.field4678.method1914(var5, this.field4654, arg0, true);
                    if (this.field4670[arg0] != 1) {
                        this.field4656++;
                        this.field4670[arg0] = 1;
                    }
                }
                if (!var4.field4127) {
                    var4.method1120(73);
                }
                return var4;
            }
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class32.field393.reset();
                class32.field393.update(var5, 0, var5.length - 2);
                int var6 = (int) class32.field393.getValue();
                if (this.field4653.field4007[arg0] != var6) {
                    throw new RuntimeException();
                }
                int var7 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
                if ((this.field4653.field3985[arg0] & 0xFFFF) != var7) {
                    throw new RuntimeException();
                }
                if (this.field4670[arg0] != 1) {
                    this.field4656++;
                    this.field4670[arg0] = 1;
                }
                if (!var4.field4127) {
                    var4.method1120(54);
                }
                return var4;
            } catch (Exception var11) {
                this.field4670[arg0] = -1;
                var4.method1120(-126);
                if (var4.field4127 && !this.field4671.method1849(false)) {
                    class315 var8 = this.field4671.method1850((byte) 2, arg0, true, this.field4682, -6832);
                    this.field4665.method1766((long) arg0, var8, 89);
                }
                return null;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "(B)I")
    public final int method1967(byte arg0) {
        field4658++;
        if (this.field4653 == null) {
            return 0;
        } else if (this.field4683) {
            class161 var2 = this.field4684.method253((byte) -6);
            if (arg0 == -115) {
                return var2 == null ? 0 : (int) var2.field2539;
            } else {
                return -89;
            }
        } else {
            return this.field4653.field3999;
        }
    }

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "(B)V")
    public final void method1968(byte arg0) {
        field4675++;
        if (this.field4654 == null) {
            return;
        }
        this.field4687 = true;
        if (arg0 != 109) {
            this.field4660 = null;
        }
        if (this.field4684 == null) {
            this.field4684 = new class37();
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Z)V")
    public static final void method1969(boolean arg0) {
        field4664++;
        if (arg0 || class189.field3097) {
            return;
        }
        class189.field3097 = true;
        if (class301.field4772) {
            class329.field5153 = (float) ((int) class329.field5153 + 191 & 0xFFFFFF80);
        } else {
            class424.field6260 += (24.0F - class424.field6260) / 2.0F;
        }
        class324.field5089 = true;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IZ)[B")
    public final byte[] method929(int arg0, boolean arg1) {
        field4669++;
        class255 var3 = this.method1966(arg0, arg1, 0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method814(-30235);
            var3.method1120(-105);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(II)I")
    public final int method927(int arg0, int arg1) {
        if (arg1 == 0) {
            field4681++;
            class255 var3 = (class255) this.field4665.method1770(arg1 - 880, (long) arg0);
            return var3 == null ? 0 : var3.method812(-66);
        } else {
            return 62;
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(Z)I")
    public final int method1970(boolean arg0) {
        if (arg0) {
            this.method1966(99, true, -121);
        }
        field4655++;
        return this.field4656;
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(ILug;Lug;Lcq;Lbi;IIZ)V")
    public class292(int arg0, class333 arg1, class333 arg2, class272 arg3, class280 arg4, int arg5, int arg6, boolean arg7) {
        this.field4682 = arg0;
        this.field4654 = arg1;
        if (this.field4654 == null) {
            this.field4683 = false;
        } else {
            this.field4683 = true;
            this.field4684 = new class37();
        }
        this.field4676 = arg5;
        this.field4689 = arg7;
        this.field4660 = arg2;
        this.field4678 = arg4;
        this.field4668 = arg6;
        this.field4671 = arg3;
        if (this.field4660 != null) {
            this.field4661 = this.field4678.method1908(this.field4682, this.field4660, -97);
        }
    }
}
