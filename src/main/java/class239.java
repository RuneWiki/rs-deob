import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class239 {

    @OriginalMember(owner = "client!jp", name = "p", descriptor = "I")
    private int field3695 = -1;

    @OriginalMember(owner = "client!jp", name = "u", descriptor = "Z")
    private boolean field3700 = false;

    @OriginalMember(owner = "client!jp", name = "v", descriptor = "Z")
    private boolean field3701 = false;

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
    private int field3683 = -1;

    @OriginalMember(owner = "client!jp", name = "K", descriptor = "I")
    private int field3716 = -32768;

    @OriginalMember(owner = "client!jp", name = "m", descriptor = "I")
    public int field3692;

    @OriginalMember(owner = "client!jp", name = "o", descriptor = "B")
    private byte field3694;

    @OriginalMember(owner = "client!jp", name = "F", descriptor = "I")
    public int field3711;

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "I")
    public int field3687;

    @OriginalMember(owner = "client!jp", name = "L", descriptor = "I")
    private int field3717;

    @OriginalMember(owner = "client!jp", name = "t", descriptor = "I")
    private int field3699;

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "B")
    private byte field3688;

    @OriginalMember(owner = "client!jp", name = "r", descriptor = "Z")
    private boolean field3697;

    @OriginalMember(owner = "client!jp", name = "y", descriptor = "I")
    public static int field3704 = 0;

    @OriginalMember(owner = "client!jp", name = "A", descriptor = "I")
    public static int field3706 = 0;

    @OriginalMember(owner = "client!jp", name = "G", descriptor = "Ls;")
    public static class186 field3712 = new class186(19, -2);

    @OriginalMember(owner = "client!jp", name = "I", descriptor = "Los;")
    public static class309 field3714 = new class309("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!jp", name = "j", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!jp", name = "n", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!jp", name = "q", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!jp", name = "s", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!jp", name = "w", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!jp", name = "x", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!jp", name = "z", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!jp", name = "C", descriptor = "I")
    private int field3708;

    @OriginalMember(owner = "client!jp", name = "D", descriptor = "I")
    private int field3709;

    @OriginalMember(owner = "client!jp", name = "E", descriptor = "I")
    private int field3710;

    @OriginalMember(owner = "client!jp", name = "J", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!jp", name = "N", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!jp", name = "O", descriptor = "I")
    private int field3720;

    @OriginalMember(owner = "client!jp", name = "k", descriptor = "Li;")
    private class31 field3690;

    @OriginalMember(owner = "client!jp", name = "M", descriptor = "Le;")
    private class374 field3718;

    @OriginalMember(owner = "client!jp", name = "B", descriptor = "Loi;")
    public class53 field3707;

    @OriginalMember(owner = "client!jp", name = "H", descriptor = "Ljv;")
    private class57 field3713;

    @OriginalMember(owner = "client!jp", name = "l", descriptor = "[Z")
    private boolean[] field3691;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIB)V", line = 6)
    private final void method1558(int arg0, int arg1, byte arg2) {
        field3703++;
        if (arg2 < 47) {
            return;
        }
        label90: while (true) {
            if (this.field3713 == null) {
                if (this.field3700) {
                    return;
                }
                this.method1561((byte) 28, -1);
                if (this.field3713 == null) {
                    return;
                }
            }
            int var4 = class62.field1268 - this.field3709;
            if (var4 > 100 && this.field3713.field1215 > 0) {
                int var5 = this.field3713.field1202.length - this.field3713.field1215;
                while (this.field3720 < var5 && var4 > this.field3713.field1210[this.field3720]) {
                    var4 -= this.field3713.field1210[this.field3720];
                    this.field3720++;
                }
                if (this.field3720 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field3713.field1202.length; var7++) {
                        var6 += this.field3713.field1210[var7];
                    }
                    var4 %= var6;
                }
                this.field3710 = this.field3720 + 1;
                if (this.field3713.field1202.length <= this.field3710) {
                    this.field3710 -= this.field3713.field1215;
                    if (this.field3710 < 0 || this.field3713.field1202.length <= this.field3710) {
                        this.field3710 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field3713.field1210[this.field3720] >= var4) {
                            this.field3709 = class62.field1268 - var4;
                            this.field3708 = var4;
                            return;
                        }
                        class433.method2602(this.field3713, arg1, arg0, (byte) 62, this.field3688, this.field3720, false);
                        var4 -= this.field3713.field1210[this.field3720];
                        this.field3720++;
                        if (this.field3713.field1202.length <= this.field3720) {
                            this.field3720 -= this.field3713.field1215;
                            if (this.field3720 < 0 || this.field3713.field1202.length <= this.field3720) {
                                this.field3713 = null;
                                continue label90;
                            }
                        }
                        this.field3710 = this.field3720 + 1;
                    } while (this.field3713.field1202.length > this.field3710);
                    this.field3710 -= this.field3713.field1215;
                } while (this.field3710 >= 0 && this.field3710 < this.field3713.field1202.length);
                this.field3710 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIIILza;ZZ)Le;", line = 104)
    public final class374 method1559(int arg0, int arg1, int arg2, int arg3, class288 arg4, boolean arg5, boolean arg6) {
        field3684++;
        class306 var8 = class123.field2142.method1530((byte) -26, this.field3692);
        if (var8.field4593 != null) {
            var8 = var8.method1951(class402.field6080, 0);
        }
        if (var8 == null) {
            this.method1564((byte) 4, arg4);
            this.field3683 = -1;
            this.field3695 = this.field3720;
            return null;
        }
        if (!this.field3700 && this.field3683 != var8.field4626) {
            this.field3718 = null;
            this.method1561((byte) 98, -1);
        }
        this.method1558(arg1, arg0, (byte) 92);
        boolean var9 = arg5 & this.field3697 & class186.field2990.method1130(class133.field2236, 78) != 0;
        boolean var10 = var9 & (this.field3683 != var8.field4626 || (this.field3720 != this.field3695 || this.field3713 != null && (this.field3713.field1206 || class424.field6376) && this.field3720 != this.field3710) && class186.field2990.method1130(class133.field2236, 115) >= 2);
        if (arg6 && !var10) {
            this.field3683 = var8.field4626;
            this.field3695 = this.field3720;
            return null;
        }
        if (var10) {
            class523.method3094(this.field3690, this.field3694, this.field3699, this.field3717, this.field3691);
        }
        class38 var11 = class520.field7560[this.field3694];
        class38 var12;
        if (this.field3701) {
            var12 = class531.field7727[0];
        } else {
            var12 = this.field3694 < 3 ? class520.field7560[this.field3694 + 1] : null;
        }
        if (arg3 != -12) {
            return null;
        }
        class374 var13 = null;
        if (this.field3713 != null) {
            if (var10) {
                arg2 |= 0x40000;
            }
            var13 = var8.method1949(3660, arg2, arg4, var12, this.field3710, this.field3713, this.field3699, var11.method186(this.field3699, this.field3717), var11, this.field3708, this.field3711 == 11 ? 10 : this.field3711, this.field3720, this.field3717, this.field3711 == 11 ? this.field3687 + 4 : this.field3687);
            if (var13 == null) {
                this.field3690 = null;
                this.field3716 = 0;
                this.field3691 = null;
            } else {
                if (var10) {
                    if (this.field3691 == null) {
                        this.field3691 = new boolean[4];
                    }
                    this.field3690 = var13.method731(this.field3690);
                    class1.method10(this.field3690, this.field3694, arg0, arg1, this.field3691);
                }
                this.field3716 = var13.method736();
            }
            this.field3718 = null;
        } else if (this.field3718 != null && (arg2 & this.field3718.method768()) == arg2 && this.field3683 == var8.field4626) {
            var13 = this.field3718;
        } else {
            if (this.field3718 != null) {
                arg2 |= this.field3718.method768();
            }
            class177 var14 = var8.method1956(var10, this.field3711 == 11 ? this.field3687 + 4 : this.field3687, this.field3699, this.field3717, var11.method186(this.field3699, this.field3717), arg2, var11, (byte) -10, arg4, this.field3711 == 11 ? 10 : this.field3711, var12);
            if (var14 == null) {
                this.field3718 = null;
                this.field3691 = null;
                this.field3690 = null;
                this.field3716 = 0;
            } else {
                var13 = var14.field2866;
                this.field3718 = var14.field2866;
                if (var10) {
                    this.field3690 = var14.field2871;
                    this.field3691 = null;
                    class1.method10(this.field3690, this.field3694, arg0, arg1, null);
                }
                this.field3716 = var13.method736();
            }
        }
        this.field3695 = this.field3720;
        this.field3717 = arg1;
        this.field3683 = var8.field4626;
        this.field3699 = arg0;
        return var13;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)Lmd;", line = 228)
    public static final class384 method1560(int arg0, int arg1) {
        field3698++;
        class384 var2 = (class384) class143.field2359.method38((long) arg1, (byte) 41);
        if (var2 != null) {
            return var2;
        } else if (arg0 <= 4) {
            return null;
        } else {
            byte[] var3 = class510.field7434.method2757(arg1, 0, (byte) -120);
            if (var3 == null || var3.length <= 1) {
                return null;
            } else {
                class384 var4 = class193.method1308(38, var3);
                class143.field2359.method35((long) arg1, -1, var4);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(BI)V", line = 252)
    private final void method1561(byte arg0, int arg1) {
        field3682++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class306 var5 = class123.field2142.method1530((byte) -30, this.field3692);
            class306 var6 = var5;
            if (var5.field4593 != null) {
                var5 = var5.method1951(class402.field6080, 0);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field4631 != null) {
                if (this.field3713 != null && var5.method1962(this.field3713.field1205, -126)) {
                    return;
                }
                var3 = var5.method1957(-113);
                if (this.field3683 != var5.field4626) {
                    var4 = var5.field4588;
                }
            } else if (var5.field4563 == -1) {
                if (var6 != null && var6.field4631 != null) {
                    if (this.field3713 != null && var6.method1962(this.field3713.field1205, -125)) {
                        return;
                    }
                    var3 = var6.method1957(-91);
                    if (this.field3683 != var6.field4626) {
                        var4 = var6.field4588;
                    }
                } else if (var6 != null && var6.field4563 != -1 && this.field3683 != var6.field4626) {
                    var3 = var6.field4563;
                    var4 = var6.field4588;
                }
            } else if (this.field3683 != var5.field4626) {
                var3 = var5.field4563;
                var4 = var5.field4588;
            }
        }
        if (var3 == -1) {
            this.field3713 = null;
            return;
        }
        this.field3718 = null;
        if (this.field3713 == null || this.field3713.field1205 != var3) {
            this.field3713 = class422.field6355.method236(var3, (byte) 114);
        } else if (this.field3713.field1203 == 0) {
            return;
        }
        if (this.field3713.field1202 == null) {
            this.field3713 = null;
            return;
        }
        int var7 = 16 / ((arg0 + 24) / 40);
        if (var4) {
            this.field3720 = (int) ((double) this.field3713.field1202.length * Math.random());
            this.field3708 = (int) ((double) this.field3713.field1210[this.field3720] * Math.random()) + 1;
        } else {
            this.field3720 = 0;
            this.field3708 = 1;
        }
        this.field3710 = this.field3720 + 1;
        if (this.field3710 < 0 || this.field3713.field1202.length <= this.field3710) {
            this.field3710 = -1;
        }
        this.field3709 = class62.field1268 - this.field3708;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIIIILe;ZLza;)V", line = 376)
    public final void method1562(int arg0, int arg1, int arg2, int arg3, int arg4, class374 arg5, boolean arg6, class288 arg7) {
        if (arg1 != 1) {
            return;
        }
        field3685++;
        class393[] var9 = arg5.method737();
        class13[] var10 = arg5.method720();
        if ((this.field3707 == null || this.field3707.field1131) && (var9 != null || var10 != null)) {
            class306 var11 = class123.field2142.method1530((byte) -110, this.field3692);
            if (var11.field4593 != null) {
                var11 = var11.method1951(class402.field6080, 0);
            }
            if (var11 != null) {
                this.field3707 = new class53(class62.field1268);
            }
        }
        if (this.field3707 == null) {
            return;
        }
        if (arg6) {
            this.field3707.method501(arg7, (long) class62.field1268, var9, var10, false);
        } else {
            this.field3707.method496((long) class62.field1268);
        }
        this.field3707.method493(this.field3688, arg0, arg3, arg2, arg4);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)Z", line = 419)
    public final boolean method1563(int arg0) {
        if (arg0 != 1) {
            field3704 = -53;
        }
        field3719++;
        return this.field3697;
    }

    @OriginalMember(owner = "client!jp", name = "finalize", descriptor = "()V", line = 433)
    protected final void finalize() {
        field3686++;
        if (this.field3707 != null) {
            this.field3707.method499();
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(BLza;)V", line = 446)
    public final void method1564(byte arg0, class288 arg1) {
        if (this.field3690 != null) {
            class523.method3094(this.field3690, this.field3694, this.field3699, this.field3717, this.field3691);
            this.field3691 = null;
            this.field3690 = null;
        }
        int var3 = 97 % ((arg0 + 65) / 46);
        field3680++;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V", line = 469)
    public static void method1565(byte arg0) {
        field3712 = null;
        field3714 = null;
        int var1 = 90 / ((arg0 - 61) / 35);
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)I", line = 479)
    public static final int method1566(int arg0) {
        field3705++;
        return arg0 == 16 ? 16 : 70;
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(II)V", line = 493)
    public static final void method1567(int arg0, int arg1) {
        class399 var2 = class262.field4002;
        synchronized (class262.field4002) {
            class262.field4002.method2471((byte) 98, arg0);
        }
        field3696++;
        if (arg1 > -50) {
            method1560(-96, 62);
        }
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(B)I", line = 509)
    public final int method1568(byte arg0) {
        if (arg0 != -50) {
            this.method1559(111, 26, 121, -56, null, false, true);
        }
        field3693++;
        return this.field3716;
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lza;Ljc;IIIIIIZI)V", line = 640)
    public class239(class288 arg0, class306 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field3701 = arg8;
        this.field3692 = arg1.field4626;
        this.field3694 = (byte) arg5;
        this.field3711 = arg2;
        this.field3687 = arg3;
        this.field3717 = arg7;
        this.field3699 = arg6;
        this.field3688 = (byte) arg4;
        this.field3697 = arg0.method309() && arg1.field4637 && !this.field3701;
        if (arg9 != -1) {
            this.field3700 = true;
        }
        this.method1561((byte) -115, arg9);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILig;II)V", line = 533)
    public static final void method1569(int arg0, class163 arg1, int arg2, int arg3) {
        field3689++;
        if (arg2 != -1) {
            method1566(-7);
        }
        if (arg1.field7768 == arg0 && arg0 != -1) {
            class57 var4 = class422.field6355.method236(arg0, (byte) -68);
            int var5 = var4.field1203;
            if (var5 == 1) {
                arg1.field7815 = arg3;
                arg1.field7837 = 1;
                arg1.field7830 = 0;
                arg1.field7783 = 0;
                arg1.field7793 = 0;
                class433.method2602(var4, arg1.field6073, arg1.field6078, (byte) 123, arg1.field6084, arg1.field7793, false);
            }
            if (var5 == 2) {
                arg1.field7830 = 0;
            }
        } else if (arg0 == -1 || arg1.field7768 == -1 || class422.field6355.method236(arg0, (byte) -116).field1204 >= class422.field6355.method236(arg1.field7768, (byte) 27).field1204) {
            arg1.field7830 = 0;
            arg1.field7793 = 0;
            arg1.field7783 = 0;
            arg1.field7815 = arg3;
            arg1.field7873 = arg1.field7863;
            arg1.field7837 = 1;
            arg1.field7768 = arg0;
            if (arg1.field7768 == -1) {
                return;
            }
            class433.method2602(class422.field6355.method236(arg1.field7768, (byte) 94), arg1.field6073, arg1.field6078, (byte) 92, arg1.field6084, arg1.field7793, false);
        }
    }

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "(II)V", line = 593)
    public final void method1570(int arg0, int arg1) {
        field3681++;
        this.field3700 = true;
        if (arg0 == 30032) {
            this.method1561((byte) -88, arg1);
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lza;I)V", line = 606)
    public final void method1571(class288 arg0, int arg1) {
        field3702++;
        int var3 = 87 / ((2 - arg1) / 45);
        this.method1559(this.field3699, this.field3717, 262144, -12, arg0, true, true);
    }
}
