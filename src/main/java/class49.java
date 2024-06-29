import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class49 extends class404 {

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    private int field621 = 0;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "Lek;")
    private class352 field625 = new class352(16);

    @OriginalMember(owner = "client!wc", name = "S", descriptor = "I")
    private int field645 = 0;

    @OriginalMember(owner = "client!wc", name = "U", descriptor = "Lub;")
    private class18 field647 = new class18();

    @OriginalMember(owner = "client!wc", name = "Z", descriptor = "J")
    private long field652 = 0L;

    @OriginalMember(owner = "client!wc", name = "O", descriptor = "I")
    private int field641;

    @OriginalMember(owner = "client!wc", name = "L", descriptor = "Lht;")
    private class412 field638;

    @OriginalMember(owner = "client!wc", name = "T", descriptor = "Z")
    private boolean field646;

    @OriginalMember(owner = "client!wc", name = "X", descriptor = "Lub;")
    private class18 field650;

    @OriginalMember(owner = "client!wc", name = "M", descriptor = "I")
    private int field639;

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "Lsu;")
    private class141 field632;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "Ldn;")
    private class359 field630;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "Lht;")
    private class412 field615;

    @OriginalMember(owner = "client!wc", name = "Y", descriptor = "Z")
    private boolean field651;

    @OriginalMember(owner = "client!wc", name = "H", descriptor = "I")
    private int field634;

    @OriginalMember(owner = "client!wc", name = "G", descriptor = "Lau;")
    private class519 field633;

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "F")
    public static float field629 = 1024.0F;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!wc", name = "J", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!wc", name = "N", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!wc", name = "P", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!wc", name = "R", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!wc", name = "W", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!wc", name = "Q", descriptor = "Ltg;")
    public static class155 field643;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "Lrp;")
    public static class302 field624;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "Lf;")
    private class532 field617;

    @OriginalMember(owner = "client!wc", name = "V", descriptor = "Z")
    private boolean field648;

    @OriginalMember(owner = "client!wc", name = "I", descriptor = "[B")
    private byte[] field635;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(B)I", line = 4)
    public final int method493(byte arg0) {
        field628++;
        if (arg0 >= -28) {
            this.field632 = null;
        }
        if (this.field617 == null) {
            return 0;
        } else if (this.field646) {
            class383 var2 = this.field650.method153(0);
            return var2 == null ? 0 : (int) var2.field5043;
        } else {
            return this.field617.field7836;
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)I", line = 36)
    public final int method494(int arg0) {
        field636++;
        if (arg0 != -2) {
            method509(27);
        }
        return this.field617 == null ? 0 : this.field617.field7836;
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(B)V", line = 51)
    public final void method495(byte arg0) {
        field620++;
        if (this.field650 == null || this.method506((byte) 0) == null) {
            return;
        }
        int var2 = 11 % ((arg0 + 12) / 37);
        for (class383 var3 = this.field647.method153(0); var3 != null; var3 = this.field647.method161(-81)) {
            int var4 = (int) var3.field5043;
            if (var4 < 0 || var4 >= this.field617.field7831 || this.field617.field7818[var4] == 0) {
                var3.method2165(16225);
            } else {
                if (this.field635[var4] == 0) {
                    this.method507(1, var4, -63);
                }
                if (this.field635[var4] == -1) {
                    this.method507(2, var4, -108);
                }
                if (this.field635[var4] == 1) {
                    var3.method2165(16225);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V", line = 96)
    public final void method496(int arg0) {
        field618++;
        if (this.field650 != null) {
            if (this.method506((byte) 0) == null) {
                return;
            }
            if (this.field646) {
                boolean var2 = true;
                for (class383 var3 = this.field650.method153(0); var3 != null; var3 = this.field650.method161(-125)) {
                    int var5 = (int) var3.field5043;
                    if (this.field635[var5] == 0) {
                        this.method507(1, var5, -66);
                    }
                    if (this.field635[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method2165(arg0 ^ 0x3F27);
                    }
                }
                while (this.field617.field7818.length > this.field645) {
                    if (this.field617.field7818[this.field645] == 0) {
                        this.field645++;
                    } else {
                        if (this.field632.field1823 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field635[this.field645] == 0) {
                            this.method507(1, this.field645, -89);
                        }
                        if (this.field635[this.field645] == 0) {
                            class383 var4 = new class383();
                            var4.field5043 = this.field645;
                            this.field650.method163(var4, 0);
                            var2 = false;
                        }
                        this.field645++;
                    }
                }
                if (var2) {
                    this.field645 = 0;
                    this.field646 = false;
                }
            } else if (this.field648) {
                boolean var6 = true;
                for (class383 var7 = this.field650.method153(0); var7 != null; var7 = this.field650.method161(arg0 ^ 0xFFFFFFC9)) {
                    int var9 = (int) var7.field5043;
                    if (this.field635[var9] != 1) {
                        this.method507(2, var9, -125);
                    }
                    if (this.field635[var9] == 1) {
                        var7.method2165(16225);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field617.field7818.length > this.field645) {
                    if (this.field617.field7818[this.field645] == 0) {
                        this.field645++;
                    } else {
                        if (this.field630.method2060(true)) {
                            var6 = false;
                            break;
                        }
                        if (this.field635[this.field645] != 1) {
                            this.method507(2, this.field645, -94);
                        }
                        if (this.field635[this.field645] != 1) {
                            class383 var8 = new class383();
                            var8.field5043 = this.field645;
                            var6 = false;
                            this.field650.method163(var8, 0);
                        }
                        this.field645++;
                    }
                }
                if (var6) {
                    this.field648 = false;
                    this.field645 = 0;
                }
            } else {
                this.field650 = null;
            }
        }
        if (this.field651 && class504.method3034((byte) -112) >= this.field652) {
            for (class519 var10 = (class519) this.field625.method2021(arg0 ^ 0xFFFFFFAB); var10 != null; var10 = (class519) this.field625.method2017(-105)) {
                if (!var10.field7502) {
                    if (var10.field7500) {
                        if (!var10.field7504) {
                            throw new RuntimeException();
                        }
                        var10.method2165(16225);
                    } else {
                        var10.field7500 = true;
                    }
                }
            }
            this.field652 = class504.method3034((byte) -116) + 1000L;
        }
        if (arg0 != 70) {
            this.field652 = -105L;
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(ILht;Lht;Ldn;Lsu;IIZ)V", line = 1063)
    public class49(int arg0, class412 arg1, class412 arg2, class359 arg3, class141 arg4, int arg5, int arg6, boolean arg7) {
        this.field641 = arg0;
        this.field638 = arg1;
        if (this.field638 == null) {
            this.field646 = false;
        } else {
            this.field646 = true;
            this.field650 = new class18();
        }
        this.field639 = arg6;
        this.field632 = arg4;
        this.field630 = arg3;
        this.field615 = arg2;
        this.field651 = arg7;
        this.field634 = arg5;
        if (this.field615 != null) {
            this.field633 = this.field632.method956((byte) 20, this.field641, this.field615);
        }
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(B)I", line = 279)
    public final int method497(byte arg0) {
        int var2 = -76 / ((66 - arg0) / 55);
        field627++;
        return this.field621;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILug;)V", line = 291)
    public static final void method498(int arg0, class395 arg1) {
        if (class519.field7503 == null) {
            class148 var2 = new class148();
            byte[] var3 = var2.method980(16, 128, 128, 125);
            class519.field7503 = class379.method2149(-20569, false, var3);
        }
        field644++;
        if (arg0 != 100) {
            method498(-81, null);
        }
        if (class119.field1616 == null) {
            class386 var4 = new class386();
            byte[] var5 = var4.method2180((byte) -26, 128, 128, 16);
            class119.field1616 = class379.method2149(-20569, false, var5);
        }
        class402 var6 = arg1.field5501;
        if (var6.method2380(false) && class304.field3895 == null) {
            byte[] var7 = class400.method2373(128, 128, 128, 4.0F, 16, new class144(419684), 0.6F, 0.5F, 4.0F, 8, 16.0F);
            class304.field3895 = class379.method2149(arg0 ^ 0xFFFFAFC3, false, var7);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V", line = 333)
    public final void method499(int arg0, int arg1) {
        field622++;
        if (this.field638 == null) {
            return;
        }
        for (class383 var3 = this.field647.method153(arg0 + 638); var3 != null; var3 = this.field647.method161(-38)) {
            if (((long) arg1) == var3.field5043) {
                return;
            }
        }
        class383 var4 = new class383();
        var4.field5043 = arg1;
        this.field647.method163(var4, arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V", line = 359)
    public final void method500(int arg0) {
        field649++;
        int var2 = 79 / ((arg0 - 31) / 39);
        if (this.field638 != null) {
            this.field648 = true;
            if (this.field650 == null) {
                this.field650 = new class18();
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)I", line = 377)
    public final int method501(int arg0) {
        field640++;
        if (arg0 != 255) {
            this.field635 = null;
        }
        if (this.method506((byte) 0) == null) {
            return this.field633 == null ? 0 : this.field633.method1952((byte) -106);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(II)[B", line = 397)
    public final byte[] method502(int arg0, int arg1) {
        field631++;
        class519 var3 = this.method507(arg0, arg1, -67);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method1951(arg0 ^ 0x8);
            var3.method2165(16225);
            return var4;
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)I", line = 416)
    public final int method503(int arg0, int arg1) {
        field626++;
        if (arg1 != 14847) {
            this.field625 = null;
        }
        class519 var3 = (class519) this.field625.method2022(-1, (long) arg0);
        return var3 == null ? 0 : var3.method1952((byte) -106);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BIIIZ)V", line = 434)
    public static final void method504(byte arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg0 != -22) {
            method508(null, null, -90);
        }
        field619++;
        if (class377.field4959 == 0) {
            class280.method1663(false, 1475);
        } else {
            class386.field5067 = class377.field4959;
            class53.method525(112, 0);
        }
        class529.field7800 = arg1;
        class402.field5723 = arg4;
        class149.field1877 = arg2;
        class241.method1474(arg3);
    }

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "(B)V", line = 456)
    public static void method505(byte arg0) {
        field643 = null;
        if (arg0 >= -109) {
            field624 = null;
        }
        field624 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)Lf;", line = 467)
    public final class532 method506(byte arg0) {
        field642++;
        if (this.field617 != null) {
            return this.field617;
        }
        if (this.field633 == null) {
            if (this.field630.method2068((byte) -20)) {
                return null;
            }
            this.field633 = this.field630.method2062(true, this.field641, 255, true, (byte) 0);
        }
        if (this.field633.field7502) {
            return null;
        }
        if (arg0 != 0) {
            method508(null, null, 107);
        }
        byte[] var2 = this.field633.method1951(arg0 ^ 0x8);
        if (this.field633 instanceof class339) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field617 = new class532(var2, this.field634);
                if (this.field617.field7821 != this.field639) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field617 = null;
                if (this.field630.method2068((byte) -48)) {
                    this.field633 = null;
                } else {
                    this.field633 = this.field630.method2062(true, this.field641, 255, true, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field617 = new class532(var2, this.field634);
            } catch (RuntimeException var4) {
                this.field630.method2065(-108);
                this.field617 = null;
                if (this.field630.method2068((byte) -91)) {
                    this.field633 = null;
                } else {
                    this.field633 = this.field630.method2062(true, this.field641, 255, true, (byte) 0);
                }
                return null;
            }
            if (this.field615 != null) {
                this.field632.method961(var2, 2, this.field615, this.field641);
            }
        }
        this.field633 = null;
        if (this.field638 != null) {
            this.field635 = new byte[this.field617.field7831];
            this.field621 = 0;
        }
        return this.field617;
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(III)Lau;", line = 570)
    private final class519 method507(int arg0, int arg1, int arg2) {
        if (arg2 >= -57) {
            this.method493((byte) 50);
        }
        field616++;
        class519 var4 = (class519) this.field625.method2022(-1, (long) arg1);
        if (var4 != null && arg0 == 0 && !var4.field7504 && var4.field7502) {
            var4.method2165(16225);
            var4 = null;
        }
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field638 == null || this.field635[arg1] == -1) {
                    if (this.field630.method2068((byte) -86)) {
                        return null;
                    }
                    var4 = this.field630.method2062(true, arg1, this.field641, true, (byte) 2);
                } else {
                    var4 = this.field632.method956((byte) 20, arg1, this.field638);
                }
            } else if (arg0 == 1) {
                if (this.field638 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field632.method959(-20440, this.field638, arg1);
            } else if (arg0 == 2) {
                if (this.field638 == null) {
                    throw new RuntimeException();
                }
                if (this.field635[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field630.method2060(true)) {
                    return null;
                }
                var4 = this.field630.method2062(false, arg1, this.field641, true, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field625.method2019((byte) -84, var4, (long) arg1);
        }
        if (var4.field7502) {
            return null;
        }
        byte[] var5 = var4.method1951(8);
        if (!var4 instanceof class339) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class117.field1582.reset();
                class117.field1582.update(var5, 0, var5.length - 2);
                int var9 = (int) class117.field1582.getValue();
                if (this.field617.field7837[arg1] != var9) {
                    throw new RuntimeException();
                }
                this.field630.field4650 = 0;
                this.field630.field4651 = 0;
            } catch (RuntimeException var12) {
                this.field630.method2065(-96);
                var4.method2165(16225);
                if (var4.field7504 && !this.field630.method2068((byte) -72)) {
                    class470 var10 = this.field630.method2062(true, arg1, this.field641, true, (byte) 2);
                    this.field625.method2019((byte) -72, var10, (long) arg1);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field617.field7826[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field617.field7826[arg1];
            if (this.field638 != null) {
                this.field632.method961(var5, 2, this.field638, arg1);
                if (this.field635[arg1] != 1) {
                    this.field621++;
                    this.field635[arg1] = 1;
                }
            }
            if (!var4.field7504) {
                var4.method2165(16225);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class117.field1582.reset();
            class117.field1582.update(var5, 0, var5.length - 2);
            int var6 = (int) class117.field1582.getValue();
            if (this.field617.field7837[arg1] != var6) {
                throw new RuntimeException();
            }
            int var7 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field617.field7826[arg1] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field635[arg1] != 1) {
                this.field621++;
                this.field635[arg1] = 1;
            }
            if (!var4.field7504) {
                var4.method2165(16225);
            }
            return var4;
        } catch (Exception var11) {
            this.field635[arg1] = -1;
            var4.method2165(16225);
            if (var4.field7504 && !this.field630.method2068((byte) -99)) {
                class470 var8 = this.field630.method2062(true, arg1, this.field641, true, (byte) 2);
                this.field625.method2019((byte) -101, var8, (long) arg1);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lga;Lya;I)V", line = 795)
    public static final void method508(class278 arg0, class38 arg1, int arg2) {
        field637++;
        if (class241.field3089 == null) {
            return;
        }
        if (class285.field3646 < 10) {
            if (!class241.field3091.method480((byte) 22, class241.field3089.field2018)) {
                class285.field3646 = class231.field2945.method484(class241.field3089.field2018, 0) / 10;
                return;
            }
            class377.method2141(2278);
            class285.field3646 = 10;
        }
        if (class285.field3646 == 10) {
            class241.field3112 = class241.field3089.field2016 >> 6 << 6;
            class241.field3119 = class241.field3089.field2019 >> 6 << 6;
            class241.field3116 = (class241.field3089.field2017 >> 6 << 6) + 64 - class241.field3112;
            class241.field3117 = (class241.field3089.field2006 >> 6 << 6) + 64 - class241.field3119;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class241.field3089.method1022((class23.field336.field2677 >> 7) + class320.field4064, class23.field336.field2676, var3, (byte) 76, (class23.field336.field2666 >> 7) + class441.field6317)) {
                var4 = var3[1] - class241.field3112;
                var5 = var3[2] - class241.field3119;
            }
            if (!class402.field5723 && var4 >= 0 && var4 < class241.field3116 && var5 >= 0 && class241.field3117 > var5) {
                int var6 = var4 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var5 + ((int) (Math.random() * 10.0D) - 5);
                class175.field2277 = var6;
                class38.field496 = var7;
            } else if (class149.field1877 == -1 || class529.field7800 == -1) {
                class241.field3089.method1025(var3, class241.field3089.field2015 & 0x3FFF, false, (class241.field3089.field2015 & 0xFFFD6E3) >> 14);
                class175.field2277 = var3[1] - class241.field3112;
                class38.field496 = var3[2] - class241.field3119;
            } else {
                class241.field3089.method1025(var3, class529.field7800, false, class149.field1877);
                class529.field7800 = -1;
                class149.field1877 = -1;
                if (var3 != null) {
                    class38.field496 = var3[2] - class241.field3119;
                    class175.field2277 = var3[1] - class241.field3112;
                }
                class402.field5723 = false;
            }
            if (class241.field3089.field2010 == 37) {
                class241.field3107 = 3.0F;
                class241.field3106 = 3.0F;
            } else if (class241.field3089.field2010 == 50) {
                class241.field3107 = 4.0F;
                class241.field3106 = 4.0F;
            } else if (class241.field3089.field2010 == 75) {
                class241.field3107 = 6.0F;
                class241.field3106 = 6.0F;
            } else if (class241.field3089.field2010 == 100) {
                class241.field3107 = 8.0F;
                class241.field3106 = 8.0F;
            } else if (class241.field3089.field2010 == 200) {
                class241.field3107 = 16.0F;
                class241.field3106 = 16.0F;
            } else {
                class241.field3107 = 8.0F;
                class241.field3106 = 8.0F;
            }
            class241.field3105 = (int) class241.field3107 >> 1;
            class241.field3100 = class70.method623(class241.field3105, -93);
            class95.method729(0);
            class241.method1468();
            class490.field7145 = new class18();
            class241.field3098 += (int) (Math.random() * 5.0D) - 2;
            if (class241.field3098 < -8) {
                class241.field3098 = -8;
            }
            class241.field3103 += (int) (Math.random() * 5.0D) - 2;
            if (class241.field3098 > 8) {
                class241.field3098 = 8;
            }
            if (class241.field3103 < -16) {
                class241.field3103 = -16;
            }
            if (class241.field3103 > 16) {
                class241.field3103 = 16;
            }
            class241.method1454(arg0, class241.field3098 >> 2 << 10, class241.field3103 >> 1);
            class241.field3097.method1619(1024, -1, 256);
            class241.field3094.method949(256, 256, -63);
            class241.field3090.method1960(arg2 ^ 0xFFFFDD01, 4096);
            class242.field3132.method1692((byte) -70, 256);
            class285.field3646 = 20;
        } else if (class285.field3646 == 20) {
            class494.method2994(true, (byte) -18);
            class241.method1473(arg1, class241.field3098, class241.field3103);
            class285.field3646 = 60;
            class494.method2994(true, (byte) 11);
            class529.method3140(true);
        } else if (class285.field3646 == 60) {
            if (class241.field3091.method459(class241.field3089.field2018 + "_staticelements", 120)) {
                if (!class241.field3091.method480((byte) 22, class241.field3089.field2018 + "_staticelements")) {
                    return;
                }
                class241.field3102 = class214.method1319(class241.field3091, class433.field6147, arg2 ^ 0xFFFFFFCB, class241.field3089.field2018 + "_staticelements");
            } else {
                class241.field3102 = new class66(0);
            }
            class241.method1465();
            class285.field3646 = 70;
            class494.method2994(true, (byte) -67);
            class529.method3140(true);
        } else if (class285.field3646 == 70) {
            class456.field6563 = new class302(arg1, 11, true, class8.field71);
            class285.field3646 = 73;
            class494.method2994(true, (byte) -4);
            class529.method3140(true);
        } else if (class285.field3646 == 73) {
            class36.field442 = new class302(arg1, 12, true, class8.field71);
            class285.field3646 = 76;
            class494.method2994(true, (byte) 124);
            class529.method3140(true);
        } else if (class285.field3646 == 76) {
            class498.field7224 = new class302(arg1, 14, true, class8.field71);
            class285.field3646 = 79;
            class494.method2994(true, (byte) 126);
            class529.method3140(true);
        } else if (class285.field3646 == 79) {
            field624 = new class302(arg1, 17, true, class8.field71);
            class285.field3646 = 82;
            class494.method2994(true, (byte) 122);
            class529.method3140(true);
        } else if (class285.field3646 == 82) {
            class379.field4999 = new class302(arg1, 19, true, class8.field71);
            class285.field3646 = 85;
            class494.method2994(true, (byte) 27);
            class529.method3140(true);
        } else if (class285.field3646 == 85) {
            class440.field6308 = new class302(arg1, 22, true, class8.field71);
            class285.field3646 = 88;
            class494.method2994(true, (byte) 126);
            class529.method3140(true);
        } else if (class285.field3646 == 88) {
            class463.field6680 = new class302(arg1, 26, true, class8.field71);
            class285.field3646 = 91;
            class494.method2994(true, (byte) 116);
            class529.method3140(true);
        } else {
            class63.field828 = new class302(arg1, 30, true, class8.field71);
            class285.field3646 = 100;
            class494.method2994(true, (byte) -25);
            if (arg2 != 91) {
                method508(null, null, -92);
            }
            class529.method3140(true);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "(I)[Lud;", line = 1041)
    public static final class27[] method509(int arg0) {
        if (arg0 > -23) {
            return null;
        } else {
            field623++;
            return new class27[] { class390.field5240, class202.field2630, class209.field2706, class323.field4099, class338.field4245, class47.field609, class524.field7737, class430.field6098, class229.field2924, class3.field27, class442.field6351, class50.field662, class264.field3328, class227.field2906 };
        }
    }
}
