import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class261 extends class108 {

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    private int field3663 = 0;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "Ltga;")
    private class64 field3680 = new class64(16);

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
    private int field3690 = 0;

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "Lga;")
    private class420 field3692 = new class420();

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "J")
    private long field3694 = 0L;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    private int field3669;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "Lqia;")
    private class23 field3679;

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "Z")
    private boolean field3688;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "Lga;")
    private class420 field3691;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "Lqia;")
    private class23 field3664;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "Lql;")
    private class766 field3687;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "[B")
    private byte[] field3675;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
    private int field3676;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "Lcca;")
    private class257 field3662;

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "I")
    private int field3684;

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "Z")
    private boolean field3693;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "Lne;")
    private class334 field3660;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "Z")
    public static boolean field3672 = false;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "I")
    public static int field3682 = 0;

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "I")
    public static int field3685 = 0;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "Lew;")
    private class516 field3678;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "Z")
    public static boolean field3671;

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "Z")
    private boolean field3689;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "[B")
    private byte[] field3667;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)I")
    public final int method726(byte arg0, int arg1) {
        field3681++;
        if (arg0 != -85) {
            this.method726((byte) -52, -93);
        }
        class334 var3 = (class334) this.field3680.method380((byte) -3, (long) arg1);
        return var3 == null ? 0 : var3.method2159(0);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)[B")
    public final byte[] method727(int arg0, byte arg1) {
        field3659++;
        class334 var3 = this.method1716(0, arg0, 0);
        if (arg1 != 2) {
            this.field3676 = 91;
        }
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method2160(arg1 ^ 0xFFFFFC93);
            var3.method3117((byte) 3);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)I")
    public final int method1713(int arg0) {
        if (arg0 != 0) {
            this.method727(-46, (byte) 0);
        }
        field3673++;
        return this.field3678 == null ? 0 : this.field3678.field7371;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)I")
    public final int method1714(int arg0) {
        field3677++;
        if (arg0 != -1) {
            this.method730(-51, true);
        }
        if (this.method729((byte) 107) == null) {
            return this.field3660 == null ? 0 : this.field3660.method2159(0);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)I")
    public final int method1715(boolean arg0) {
        field3666++;
        if (!arg0) {
            this.field3693 = false;
        }
        if (this.field3678 == null) {
            return 0;
        } else if (this.field3688) {
            class540 var2 = this.field3691.method2508((byte) 114);
            return var2 == null ? 0 : (int) var2.field7577;
        } else {
            return this.field3678.field7371;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)Lne;")
    private final class334 method1716(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            this.method726((byte) 48, 6);
        }
        field3668++;
        class334 var4 = (class334) this.field3680.method380((byte) -3, (long) arg1);
        if (var4 != null && arg2 == 0 && !var4.field4985 && var4.field4984) {
            var4.method3117((byte) 19);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field3679 == null || this.field3667[arg1] == -1) {
                    if (this.field3687.method4220(20)) {
                        return null;
                    }
                    var4 = this.field3687.method4215(true, arg1, (byte) 2, (byte) -56, this.field3669);
                } else {
                    var4 = this.field3662.method1694(arg1, this.field3679, -8915);
                }
            } else if (arg2 == 1) {
                if (this.field3679 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field3662.method1690(true, arg1, this.field3679);
            } else if (arg2 == 2) {
                if (this.field3679 == null) {
                    throw new RuntimeException();
                }
                if (this.field3667[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field3687.method4223(arg0 ^ 0xFFFFFDFF)) {
                    return null;
                }
                var4 = this.field3687.method4215(false, arg1, (byte) 2, (byte) -112, this.field3669);
            } else {
                throw new RuntimeException();
            }
            this.field3680.method384((long) arg1, var4, false);
        }
        if (var4.field4984) {
            return null;
        }
        byte[] var5 = var4.method2160(-879);
        if (!(var4 instanceof class663)) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class214.field3083.reset();
                class214.field3083.update(var5, 0, var5.length - 2);
                int var6 = (int) class214.field3083.getValue();
                if (this.field3678.field7379[arg1] != var6) {
                    throw new RuntimeException();
                }
                if (this.field3678.field7376 != null && this.field3678.field7376[arg1] != null) {
                    byte[] var7 = this.field3678.field7376[arg1];
                    byte[] var8 = class759.method4188(var5.length - 2, 0, var5, (byte) -107);
                    for (int var9 = 0; var9 < 64; var9++) {
                        if (var7[var9] != var8[var9]) {
                            throw new RuntimeException();
                        }
                    }
                }
                this.field3687.field10572 = 0;
                this.field3687.field10574 = 0;
            } catch (RuntimeException var17) {
                this.field3687.method4219(1);
                var4.method3117((byte) 97);
                if (var4.field4985 && !this.field3687.method4220(arg0 + 20)) {
                    class638 var10 = this.field3687.method4215(true, arg1, (byte) 2, (byte) -104, this.field3669);
                    this.field3680.method384((long) arg1, var10, false);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field3678.field7369[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field3678.field7369[arg1];
            if (this.field3679 != null) {
                this.field3662.method1691(var5, arg1, this.field3679, 78);
                if (this.field3667[arg1] != 1) {
                    this.field3663++;
                    this.field3667[arg1] = 1;
                }
            }
            if (!var4.field4985) {
                var4.method3117((byte) 108);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class214.field3083.reset();
            class214.field3083.update(var5, 0, var5.length - 2);
            int var11 = (int) class214.field3083.getValue();
            if (this.field3678.field7379[arg1] != var11) {
                throw new RuntimeException();
            }
            if (this.field3678.field7376 != null && this.field3678.field7376[arg1] != null) {
                byte[] var12 = this.field3678.field7376[arg1];
                byte[] var13 = class759.method4188(var5.length - 2, 0, var5, (byte) -107);
                for (int var14 = 0; var14 < 64; var14++) {
                    if (var12[var14] != var13[var14]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var15 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field3678.field7369[arg1] & 0xFFFF) != var15) {
                throw new RuntimeException();
            }
            if (this.field3667[arg1] != 1) {
                this.field3663++;
                this.field3667[arg1] = 1;
            }
            if (!var4.field4985) {
                var4.method3117((byte) -106);
            }
            return var4;
        } catch (Exception var18) {
            this.field3667[arg1] = -1;
            var4.method3117((byte) -125);
            if (var4.field4985 && !this.field3687.method4220(20)) {
                class638 var16 = this.field3687.method4215(true, arg1, (byte) 2, (byte) -77, this.field3669);
                this.field3680.method384((long) arg1, var16, false);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)V")
    public final void method1717(byte arg0) {
        if (arg0 > -80) {
            this.method1713(87);
        }
        field3670++;
        if (this.field3691 != null) {
            if (this.method729((byte) 108) == null) {
                return;
            }
            if (this.field3688) {
                boolean var2 = true;
                for (class540 var3 = this.field3691.method2508((byte) 119); var3 != null; var3 = this.field3691.method2505((byte) -55)) {
                    int var5 = (int) var3.field7577;
                    if (this.field3667[var5] == 0) {
                        this.method1716(0, var5, 1);
                    }
                    if (this.field3667[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method3117((byte) 34);
                    }
                }
                while (this.field3678.field7367.length > this.field3690) {
                    if (this.field3678.field7367[this.field3690] == 0) {
                        this.field3690++;
                    } else {
                        if (this.field3662.field3620 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field3667[this.field3690] == 0) {
                            this.method1716(0, this.field3690, 1);
                        }
                        if (this.field3667[this.field3690] == 0) {
                            class540 var4 = new class540();
                            var4.field7577 = this.field3690;
                            this.field3691.method2510(var4, false);
                            var2 = false;
                        }
                        this.field3690++;
                    }
                }
                if (var2) {
                    this.field3690 = 0;
                    this.field3688 = false;
                }
            } else if (this.field3689) {
                boolean var6 = true;
                for (class540 var7 = this.field3691.method2508((byte) 112); var7 != null; var7 = this.field3691.method2505((byte) -55)) {
                    int var9 = (int) var7.field7577;
                    if (this.field3667[var9] != 1) {
                        this.method1716(0, var9, 2);
                    }
                    if (this.field3667[var9] == 1) {
                        var7.method3117((byte) 43);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field3690 < this.field3678.field7367.length) {
                    if (this.field3678.field7367[this.field3690] == 0) {
                        this.field3690++;
                    } else {
                        if (this.field3687.method4223(-513)) {
                            var6 = false;
                            break;
                        }
                        if (this.field3667[this.field3690] != 1) {
                            this.method1716(0, this.field3690, 2);
                        }
                        if (this.field3667[this.field3690] != 1) {
                            class540 var8 = new class540();
                            var8.field7577 = this.field3690;
                            this.field3691.method2510(var8, false);
                            var6 = false;
                        }
                        this.field3690++;
                    }
                }
                if (var6) {
                    this.field3690 = 0;
                    this.field3689 = false;
                }
            } else {
                this.field3691 = null;
            }
        }
        if (!this.field3693 || this.field3694 > class109.method731(21)) {
            return;
        }
        for (class334 var10 = (class334) this.field3680.method382(0); var10 != null; var10 = (class334) this.field3680.method391(37)) {
            if (!var10.field4984) {
                if (var10.field4983) {
                    if (!var10.field4985) {
                        throw new RuntimeException();
                    }
                    var10.method3117((byte) -21);
                } else {
                    var10.field4983 = true;
                }
            }
        }
        this.field3694 = class109.method731(40) + 1000L;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZ)V")
    public final void method730(int arg0, boolean arg1) {
        field3686++;
        if (!arg1) {
            this.field3691 = null;
        }
        if (this.field3679 == null) {
            return;
        }
        for (class540 var3 = this.field3692.method2508((byte) -61); var3 != null; var3 = this.field3692.method2505((byte) -55)) {
            if ((long) arg0 == var3.field7577) {
                return;
            }
        }
        class540 var4 = new class540();
        var4.field7577 = arg0;
        this.field3692.method2510(var4, !arg1);
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V")
    public final void method1718(int arg0) {
        if (arg0 != 0) {
            this.field3669 = 69;
        }
        field3665++;
        if (this.field3691 == null || this.method729((byte) 89) == null) {
            return;
        }
        for (class540 var2 = this.field3692.method2508((byte) -114); var2 != null; var2 = this.field3692.method2505((byte) -55)) {
            int var3 = (int) var2.field7577;
            if (var3 < 0 || this.field3678.field7383 <= var3 || this.field3678.field7367[var3] == 0) {
                var2.method3117((byte) -92);
            } else {
                if (this.field3667[var3] == 0) {
                    this.method1716(0, var3, 1);
                }
                if (this.field3667[var3] == -1) {
                    this.method1716(0, var3, 2);
                }
                if (this.field3667[var3] == 1) {
                    var2.method3117((byte) 111);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)Lew;")
    public final class516 method729(byte arg0) {
        field3683++;
        if (this.field3678 != null) {
            return this.field3678;
        }
        if (this.field3660 == null) {
            if (this.field3687.method4220(20)) {
                return null;
            }
            this.field3660 = this.field3687.method4215(true, this.field3669, (byte) 0, (byte) -101, 255);
        }
        if (this.field3660.field4984) {
            return null;
        }
        byte[] var2 = this.field3660.method2160(-879);
        if (arg0 < 84) {
            return null;
        }
        if (this.field3660 instanceof class663) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3678 = new class516(var2, this.field3684, this.field3675);
                if (this.field3678.field7374 != this.field3676) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field3678 = null;
                if (this.field3687.method4220(20)) {
                    this.field3660 = null;
                } else {
                    this.field3660 = this.field3687.method4215(true, this.field3669, (byte) 0, (byte) -56, 255);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3678 = new class516(var2, this.field3684, this.field3675);
            } catch (RuntimeException var4) {
                this.field3687.method4219(1);
                this.field3678 = null;
                if (this.field3687.method4220(20)) {
                    this.field3660 = null;
                } else {
                    this.field3660 = this.field3687.method4215(true, this.field3669, (byte) 0, (byte) -65, 255);
                }
                return null;
            }
            if (this.field3664 != null) {
                this.field3662.method1691(var2, this.field3669, this.field3664, 82);
            }
        }
        this.field3660 = null;
        if (this.field3679 != null) {
            this.field3663 = 0;
            this.field3667 = new byte[this.field3678.field7383];
        }
        return this.field3678;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(Z)I")
    public final int method1719(boolean arg0) {
        field3674++;
        if (!arg0) {
            this.method1718(110);
        }
        return this.field3663;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(B)V")
    public final void method1720(byte arg0) {
        field3661++;
        if (this.field3679 == null) {
            return;
        }
        this.field3689 = true;
        if (this.field3691 == null) {
            this.field3691 = new class420();
        }
        if (arg0 != 1) {
            this.field3694 = 94L;
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(ILqia;Lqia;Lql;Lcca;I[BIZ)V")
    public class261(int arg0, class23 arg1, class23 arg2, class766 arg3, class257 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field3669 = arg0;
        this.field3679 = arg1;
        if (this.field3679 == null) {
            this.field3688 = false;
        } else {
            this.field3688 = true;
            this.field3691 = new class420();
        }
        this.field3664 = arg2;
        this.field3687 = arg3;
        this.field3675 = arg6;
        this.field3676 = arg7;
        this.field3662 = arg4;
        this.field3684 = arg5;
        this.field3693 = arg8;
        if (this.field3664 != null) {
            this.field3660 = this.field3662.method1694(this.field3669, this.field3664, -8915);
        }
    }
}
