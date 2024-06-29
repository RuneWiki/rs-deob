import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public abstract class class248 extends class4 {

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    private int field3662 = 0;

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "I")
    public int field3685 = 0;

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
    public int field3670 = 0;

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "[Lom;")
    public class152[] field3678 = new class152[12];

    @OriginalMember(owner = "client!ke", name = "V", descriptor = "I")
    public int field3695 = 0;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "I")
    public int field3672 = 0;

    @OriginalMember(owner = "client!ke", name = "R", descriptor = "I")
    public int field3691 = 0;

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "I")
    public int field3679 = -1;

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "I")
    public int field3684 = -1000;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    private int field3664 = 0;

    @OriginalMember(owner = "client!ke", name = "kb", descriptor = "I")
    public int field3710 = 0;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "I")
    public int field3675 = 0;

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "I")
    public int field3674 = 0;

    @OriginalMember(owner = "client!ke", name = "pb", descriptor = "I")
    public int field3715 = 0;

    @OriginalMember(owner = "client!ke", name = "Y", descriptor = "Z")
    public boolean field3698 = false;

    @OriginalMember(owner = "client!ke", name = "qb", descriptor = "I")
    public int field3716 = 0;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "[I")
    public int[] field3657 = new int[4];

    @OriginalMember(owner = "client!ke", name = "Cb", descriptor = "I")
    public int field3728 = 0;

    @OriginalMember(owner = "client!ke", name = "Z", descriptor = "I")
    public int field3699 = 0;

    @OriginalMember(owner = "client!ke", name = "Bb", descriptor = "Z")
    private boolean field3727 = false;

    @OriginalMember(owner = "client!ke", name = "O", descriptor = "I")
    public int field3688 = -1;

    @OriginalMember(owner = "client!ke", name = "Lb", descriptor = "I")
    private int field3737 = 1;

    @OriginalMember(owner = "client!ke", name = "nb", descriptor = "I")
    public int field3713 = 0;

    @OriginalMember(owner = "client!ke", name = "Nb", descriptor = "Z")
    public boolean field3739 = false;

    @OriginalMember(owner = "client!ke", name = "S", descriptor = "I")
    public int field3692 = -1;

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "[B")
    public byte[] field3669 = new byte[10];

    @OriginalMember(owner = "client!ke", name = "db", descriptor = "I")
    public int field3703 = 0;

    @OriginalMember(owner = "client!ke", name = "Eb", descriptor = "Z")
    private boolean field3730 = false;

    @OriginalMember(owner = "client!ke", name = "Ab", descriptor = "I")
    public int field3726 = -32768;

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "I")
    public int field3689 = 0;

    @OriginalMember(owner = "client!ke", name = "Ob", descriptor = "I")
    public int field3740 = 0;

    @OriginalMember(owner = "client!ke", name = "wb", descriptor = "I")
    private int field3722 = 0;

    @OriginalMember(owner = "client!ke", name = "Hb", descriptor = "Z")
    public boolean field3733 = false;

    @OriginalMember(owner = "client!ke", name = "ib", descriptor = "I")
    public int field3708 = -1;

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "I")
    public int field3676 = 0;

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "[I")
    public int[] field3686 = new int[10];

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "I")
    public int field3677 = 0;

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "I")
    public int field3687 = 0;

    @OriginalMember(owner = "client!ke", name = "W", descriptor = "[I")
    public int[] field3696 = new int[4];

    @OriginalMember(owner = "client!ke", name = "Fb", descriptor = "Ljava/lang/String;")
    public String field3731 = null;

    @OriginalMember(owner = "client!ke", name = "Pb", descriptor = "I")
    public int field3741 = -1;

    @OriginalMember(owner = "client!ke", name = "jb", descriptor = "I")
    private int field3709 = 0;

    @OriginalMember(owner = "client!ke", name = "Xb", descriptor = "I")
    public int field3749 = 0;

    @OriginalMember(owner = "client!ke", name = "Rb", descriptor = "Z")
    public boolean field3743 = false;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
    public int field3665 = 0;

    @OriginalMember(owner = "client!ke", name = "Tb", descriptor = "I")
    private int field3745 = 0;

    @OriginalMember(owner = "client!ke", name = "ub", descriptor = "I")
    private int field3720 = 0;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public int field3659 = 0;

    @OriginalMember(owner = "client!ke", name = "U", descriptor = "I")
    public int field3694 = 0;

    @OriginalMember(owner = "client!ke", name = "Kb", descriptor = "Z")
    public boolean field3736 = true;

    @OriginalMember(owner = "client!ke", name = "sb", descriptor = "I")
    public int field3718 = -1;

    @OriginalMember(owner = "client!ke", name = "yb", descriptor = "I")
    public int field3724 = 32;

    @OriginalMember(owner = "client!ke", name = "Gb", descriptor = "I")
    public int field3732 = 0;

    @OriginalMember(owner = "client!ke", name = "xb", descriptor = "I")
    public int field3723 = -1;

    @OriginalMember(owner = "client!ke", name = "dc", descriptor = "I")
    public int field3755 = 100;

    @OriginalMember(owner = "client!ke", name = "Zb", descriptor = "I")
    private int field3751 = 0;

    @OriginalMember(owner = "client!ke", name = "ac", descriptor = "I")
    public int field3752 = -1;

    @OriginalMember(owner = "client!ke", name = "Vb", descriptor = "I")
    public int field3747 = 0;

    @OriginalMember(owner = "client!ke", name = "ec", descriptor = "I")
    private int field3756 = 0;

    @OriginalMember(owner = "client!ke", name = "Ib", descriptor = "[I")
    public int[] field3734 = new int[4];

    @OriginalMember(owner = "client!ke", name = "jc", descriptor = "[I")
    public int[] field3761 = new int[10];

    @OriginalMember(owner = "client!ke", name = "ic", descriptor = "I")
    public int field3760 = 0;

    @OriginalMember(owner = "client!ke", name = "eb", descriptor = "[I")
    public static int[] field3704 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!ke", name = "fb", descriptor = "I")
    public static int field3705 = 1;

    @OriginalMember(owner = "client!ke", name = "X", descriptor = "I")
    public static int field3697 = -1;

    @OriginalMember(owner = "client!ke", name = "rb", descriptor = "I")
    public static int field3717 = 0;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    public int field3658;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public int field3660;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    public int field3663;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "I")
    public int field3666;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
    public int field3667;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "I")
    public int field3668;

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "I")
    public int field3671;

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "I")
    public int field3673;

    @OriginalMember(owner = "client!ke", name = "G", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "I")
    public int field3682;

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "I")
    public int field3683;

    @OriginalMember(owner = "client!ke", name = "T", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!ke", name = "ab", descriptor = "I")
    public int field3700;

    @OriginalMember(owner = "client!ke", name = "bb", descriptor = "I")
    public int field3701;

    @OriginalMember(owner = "client!ke", name = "cb", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!ke", name = "gb", descriptor = "I")
    public int field3706;

    @OriginalMember(owner = "client!ke", name = "hb", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!ke", name = "lb", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!ke", name = "mb", descriptor = "I")
    public int field3712;

    @OriginalMember(owner = "client!ke", name = "ob", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!ke", name = "tb", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!ke", name = "vb", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!ke", name = "zb", descriptor = "I")
    public int field3725;

    @OriginalMember(owner = "client!ke", name = "Db", descriptor = "I")
    public int field3729;

    @OriginalMember(owner = "client!ke", name = "Jb", descriptor = "I")
    public int field3735;

    @OriginalMember(owner = "client!ke", name = "Sb", descriptor = "I")
    public int field3744;

    @OriginalMember(owner = "client!ke", name = "Ub", descriptor = "I")
    public int field3746;

    @OriginalMember(owner = "client!ke", name = "Wb", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!ke", name = "Yb", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!ke", name = "bc", descriptor = "I")
    public int field3753;

    @OriginalMember(owner = "client!ke", name = "cc", descriptor = "I")
    public int field3754;

    @OriginalMember(owner = "client!ke", name = "fc", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!ke", name = "gc", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!ke", name = "hc", descriptor = "I")
    public int field3759;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "Ljg;")
    public static class135 field3656;

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "Lui;")
    public class88 field3690;

    @OriginalMember(owner = "client!ke", name = "Qb", descriptor = "Ljava/lang/Object;")
    public Object field3742;

    @OriginalMember(owner = "client!ke", name = "Mb", descriptor = "[Lfi;")
    public static class229[] field3738;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILmg;)V")
    public final void method1703(int arg0, class58 arg1) {
        field3758++;
        class294 var3 = this.method1708(0);
        if (var3.field4707 != 0 || var3.field4717 != 0) {
            int var4 = 0;
            int var5 = 0;
            if (this.field3733 && this.field3687 != 0) {
                if (this.field3687 >= 0) {
                    var5 = var3.field4707;
                } else {
                    var5 = -var3.field4707;
                }
                var4 = var3.field4717;
            }
            if (var3.field4708 != 0) {
                if (this.field3745 != var5) {
                    this.field3745 = var5;
                    if (this.field3751 > 0 && var5 > this.field3720) {
                        int var6 = this.field3751 * this.field3751 / (var3.field4708 * 2);
                        int var7 = var5 - this.field3720;
                        if (var7 < var6) {
                            this.field3730 = false;
                        } else {
                            this.field3664 = (this.field3720 - (var6 - var5)) / 2;
                            this.field3730 = true;
                            int var8 = var3.field4686 * var3.field4686 / (var3.field4708 * 2);
                            int var9 = var5 - var8;
                            if (this.field3664 < var9) {
                                this.field3664 = var9;
                            }
                        }
                    } else if (this.field3751 < 0 && var5 < this.field3720) {
                        int var10 = this.field3751 * this.field3751 / (var3.field4708 * 2);
                        int var11 = var5 - this.field3720;
                        if (var10 <= var11) {
                            this.field3730 = true;
                            int var12 = var3.field4686 * var3.field4686 / (var3.field4708 * 2);
                            this.field3664 = (var5 + var10 + this.field3720) / 2;
                            int var13 = var5 + var12;
                            if (this.field3664 > var13) {
                                this.field3664 = var13;
                            }
                        } else {
                            this.field3730 = false;
                        }
                    } else {
                        this.field3730 = false;
                    }
                }
                if (this.field3751 == 0) {
                    int var14 = this.field3745 - this.field3720;
                    if ((-var3.field4708) < var14 && var14 < var3.field4708) {
                        this.field3720 = this.field3745;
                    } else {
                        this.field3730 = true;
                        this.field3664 = (this.field3745 + this.field3720) / 2;
                        int var15 = var3.field4686 * var3.field4686 / (var3.field4708 * 2);
                        if (var14 >= 0) {
                            this.field3751 = var3.field4708;
                            int var16 = this.field3745 - var15;
                            if (var16 > this.field3664) {
                                this.field3664 = var16;
                            }
                        } else {
                            int var17 = this.field3745 + var15;
                            this.field3751 = -var3.field4708;
                            if (this.field3664 > var17) {
                                this.field3664 = var17;
                            }
                        }
                    }
                } else if (this.field3751 > 0) {
                    if (this.field3720 >= this.field3664) {
                        this.field3730 = false;
                    }
                    if (!this.field3730) {
                        this.field3751 -= var3.field4708;
                        if (this.field3751 < 0) {
                            this.field3751 = 0;
                        }
                    } else if (this.field3751 < var3.field4686) {
                        this.field3751 += var3.field4708;
                    }
                } else {
                    if (this.field3720 <= this.field3664) {
                        this.field3730 = false;
                    }
                    if (!this.field3730) {
                        this.field3751 += var3.field4708;
                        if (this.field3751 > 0) {
                            this.field3751 = 0;
                        }
                    } else if (this.field3751 > -var3.field4686) {
                        this.field3751 -= var3.field4708;
                    }
                }
                this.field3720 += this.field3751;
                if (this.field3720 != 0) {
                    int var18 = this.field3720 >> 5 & 0x7FF;
                    int var19 = arg1.method17() / 2;
                    arg1.method423(0, -var19, 0);
                    arg1.method405(var18);
                    arg1.method423(0, var19, 0);
                }
            }
            if (var3.field4701 != 0) {
                if (this.field3722 != var4) {
                    if (this.field3662 > 0 && this.field3709 < var4) {
                        int var20 = this.field3662 * this.field3662 / (var3.field4701 * 2);
                        int var21 = var4 - this.field3709;
                        if (var21 >= var20) {
                            this.field3756 = (var4 + this.field3709 - var20) / 2;
                            int var22 = var3.field4678 * var3.field4678 / (var3.field4701 * 2);
                            int var23 = var4 - var22;
                            this.field3727 = true;
                            if (var23 > this.field3756) {
                                this.field3756 = var23;
                            }
                        } else {
                            this.field3727 = false;
                        }
                    } else if (this.field3662 < 0 && var4 < this.field3709) {
                        int var24 = this.field3662 * this.field3662 / (var3.field4701 * 2);
                        int var25 = var4 - this.field3709;
                        if (var25 < var24) {
                            this.field3727 = false;
                        } else {
                            this.field3727 = true;
                            this.field3756 = (this.field3709 - (-var24 - var4)) / 2;
                            int var26 = var3.field4678 * var3.field4678 / (var3.field4701 * 2);
                            int var27 = var4 + var26;
                            if (var27 < this.field3756) {
                                this.field3756 = var27;
                            }
                        }
                    } else {
                        this.field3727 = false;
                    }
                    this.field3722 = var4;
                }
                if (this.field3662 == 0) {
                    int var28 = this.field3722 - this.field3709;
                    if (var28 > (-var3.field4701) && var3.field4701 > var28) {
                        this.field3709 = this.field3722;
                    } else {
                        this.field3756 = (this.field3722 + this.field3709) / 2;
                        this.field3727 = true;
                        int var29 = var3.field4678 * var3.field4678 / (var3.field4701 * 2);
                        if (var28 >= 0) {
                            int var30 = this.field3722 - var29;
                            if (this.field3756 < var30) {
                                this.field3756 = var30;
                            }
                            this.field3662 = var3.field4701;
                        } else {
                            this.field3662 = -var3.field4701;
                            int var31 = this.field3722 + var29;
                            if (var31 < this.field3756) {
                                this.field3756 = var31;
                            }
                        }
                    }
                } else if (this.field3662 > 0) {
                    if (this.field3756 <= this.field3709) {
                        this.field3727 = false;
                    }
                    if (!this.field3727) {
                        this.field3662 -= var3.field4701;
                        if (this.field3662 < 0) {
                            this.field3662 = 0;
                        }
                    } else if (var3.field4678 > this.field3662) {
                        this.field3662 += var3.field4701;
                    }
                } else {
                    if (this.field3709 <= this.field3756) {
                        this.field3727 = false;
                    }
                    if (!this.field3727) {
                        this.field3662 += var3.field4701;
                        if (this.field3662 > 0) {
                            this.field3662 = 0;
                        }
                    } else if (this.field3662 > -var3.field4678) {
                        this.field3662 -= var3.field4701;
                    }
                }
                this.field3709 += this.field3662;
                if (this.field3709 != 0) {
                    int var32 = (this.field3709 & 0xFFFD) >> 5;
                    int var33 = arg1.method17() / 2;
                    arg1.method423(0, -var33, 0);
                    arg1.method411(var32);
                    arg1.method423(0, var33, 0);
                }
            }
        }
        if (arg0 <= 88) {
            this.field3670 = -126;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lmg;Lmg;Z)V")
    public final void method1704(class58 arg0, class58 arg1, boolean arg2) {
        field3711++;
        class257 var4 = (class257) arg1;
        class257 var5 = (class257) arg0;
        if ((this.field3690 == null || this.field3690.field1407) && (var4.field3885 != null || var4.field3909 != null || var5 != null && (var5.field3885 != null || var5.field3909 != null))) {
            this.field3690 = new class88(class199.field2930, this.method1467(0), this.method1467(0));
        }
        if (this.field3690 != null) {
            this.field3690.method660(var4.field3885, var4.field3909, false, var4.field3896, var4.field3888, var4.field3899);
        }
        this.field3698 = arg2;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V")
    public static final void method1705(int arg0) {
        field3750++;
        if (class291.field4629 == 0) {
            return;
        }
        try {
            if (++class43.field569 > 2000) {
                if (class281.field4537 != null) {
                    class281.field4537.method1440(arg0 ^ 0xFFFFFFBF);
                    class281.field4537 = null;
                }
                if (class313.field5007 >= 1) {
                    class291.field4629 = 0;
                    class145.field2347 = -5;
                    return;
                }
                class43.field569 = 0;
                class291.field4629 = 1;
                class313.field5007++;
                if (class268.field4313 == class211.field3114) {
                    class268.field4313 = class293.field4671;
                } else {
                    class268.field4313 = class211.field3114;
                }
            }
            if (class291.field4629 == 1) {
                class81.field1302 = class273.field4426.method936(118, class268.field4313, class298.field4794);
                class291.field4629 = 2;
            }
            if (arg0 == 64) {
                if (class291.field4629 == 2) {
                    if (class81.field1302.field936 == 2) {
                        throw new IOException();
                    }
                    if (class81.field1302.field936 != 1) {
                        return;
                    }
                    class281.field4537 = new class203((Socket) class81.field1302.field932, class273.field4426);
                    class81.field1302 = null;
                    class281.field4537.method1435(9, 0, class144.field2338.field758, class144.field2338.field735);
                    if (class16.field170 != null) {
                        class16.field170.method2011(arg0 ^ 0xFFFFFFBF);
                    }
                    if (class113.field1879 != null) {
                        class113.field1879.method2011(arg0 - 65);
                    }
                    int var1 = class281.field4537.method1441(3755);
                    if (class16.field170 != null) {
                        class16.field170.method2011(arg0 ^ 0xFFFFFFBF);
                    }
                    if (class113.field1879 != null) {
                        class113.field1879.method2011(-1);
                    }
                    if (var1 != 21) {
                        class145.field2347 = var1;
                        class291.field4629 = 0;
                        class281.field4537.method1440(-1);
                        class281.field4537 = null;
                        return;
                    }
                    class291.field4629 = 3;
                }
                if (class291.field4629 == 3) {
                    if (class281.field4537.method1434(0) < 1) {
                        return;
                    }
                    class209.field3097 = new String[class281.field4537.method1441(3755)];
                    class291.field4629 = 4;
                }
                if (class291.field4629 == 4 && class281.field4537.method1434(0) >= class209.field3097.length * 8) {
                    class92.field1488.field735 = 0;
                    class281.field4537.method1443(-119, 0, class92.field1488.field758, class209.field3097.length * 8);
                    for (int var2 = 0; var2 < class209.field3097.length; var2++) {
                        class209.field3097[var2] = class38.method240(class92.field1488.method371(22726), true);
                    }
                    class145.field2347 = 21;
                    class291.field4629 = 0;
                    class281.field4537.method1440(-1);
                    class281.field4537 = null;
                }
            }
        } catch (IOException var3) {
            if (class281.field4537 != null) {
                class281.field4537.method1440(-1);
                class281.field4537 = null;
            }
            if (class313.field5007 >= 1) {
                class145.field2347 = -4;
                class291.field4629 = 0;
            } else {
                if (class268.field4313 == class211.field3114) {
                    class268.field4313 = class293.field4671;
                } else {
                    class268.field4313 = class211.field3114;
                }
                class43.field569 = 0;
                class313.field5007++;
                class291.field4629 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BILlc;)Z")
    public static final boolean method1706(byte arg0, int arg1, class270 arg2) {
        field3757++;
        if (arg0 != 114) {
            return false;
        }
        byte[] var3 = arg2.method1886(arg1, false);
        if (var3 == null) {
            return false;
        } else {
            class303.method2064(var3, (byte) 7);
            return true;
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V")
    public static void method1707(byte arg0) {
        if (arg0 > -68) {
            field3697 = -85;
        }
        field3738 = null;
        field3704 = null;
        field3656 = null;
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)Lic;")
    public final class294 method1708(int arg0) {
        field3681++;
        int var2 = this.method92(-91);
        return ~var2 == arg0 ? class265.field4251 : class102.method803(var2, 32);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)V")
    public final void method1709(int arg0, int arg1) {
        field3680++;
        this.field3737 = arg1;
        if (arg0 != -19753) {
            this.field3740 = -80;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIZII)V")
    public final void method1710(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (this.field3741 != -1 && class232.method1609((byte) -32, this.field3741).field1204 == 1) {
            this.field3741 = -1;
        }
        if (this.field3718 != -1) {
            class120 var6 = class152.method1126(this.field3718, (byte) -1);
            if (var6.field1947 && class232.method1609((byte) -32, var6.field1944).field1204 == 1) {
                this.field3718 = -1;
            }
        }
        field3714++;
        if (arg1 >= -108) {
            this.field3692 = -6;
        }
        if (!arg2) {
            int var7 = arg3 - this.field3761[0];
            int var8 = arg4 - this.field3686[0];
            if (var7 >= -8 && var7 <= 8 && var8 >= -8 && var8 <= 8) {
                if (this.field3710 < 9) {
                    this.field3710++;
                }
                for (int var9 = this.field3710; var9 > 0; var9--) {
                    this.field3761[var9] = this.field3761[var9 - 1];
                    this.field3686[var9] = this.field3686[var9 - 1];
                    this.field3669[var9] = this.field3669[var9 - 1];
                }
                this.field3669[0] = 1;
                this.field3761[0] = arg3;
                this.field3686[0] = arg4;
                return;
            }
        }
        this.field3761[0] = arg3;
        this.field3695 = 0;
        this.field3675 = 0;
        this.field3686[0] = arg4;
        this.field3710 = 0;
        this.field3753 = this.field3686[0] * 128 + arg0 * 64;
        this.field3660 = this.field3761[0] * 128 + arg0 * 64;
        if (this.field3690 != null) {
            this.field3690.method654();
        }
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)I")
    public int method1467(int arg0) {
        if (arg0 != 0) {
            this.field3732 = 33;
        }
        field3707++;
        return this.field3737;
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(I)Z")
    public boolean method91(int arg0) {
        if (arg0 < 34) {
            this.method1709(5, -35);
        }
        field3719++;
        return false;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(III)V")
    public final void method1711(int arg0, int arg1, int arg2) {
        field3721++;
        int var4 = this.field3761[0];
        int var5 = this.field3686[0];
        if (this.field3741 != -1 && class232.method1609((byte) -32, this.field3741).field1204 == 1) {
            this.field3741 = -1;
        }
        if (this.field3718 != -1) {
            class120 var6 = class152.method1126(this.field3718, (byte) -1);
            if (var6.field1947 && class232.method1609((byte) -32, var6.field1944).field1204 == 1) {
                this.field3718 = -1;
            }
        }
        if (arg0 == 0) {
            var4--;
            var5++;
        }
        if (arg0 == 1) {
            var5++;
        }
        if (arg0 == 2) {
            var4++;
            var5++;
        }
        if (arg0 == 3) {
            var4--;
        }
        if (this.field3710 < 9) {
            this.field3710++;
        }
        if (arg0 == 4) {
            var4++;
        }
        if (arg0 == 5) {
            var5--;
            var4--;
        }
        for (int var7 = this.field3710; var7 > 0; var7--) {
            this.field3761[var7] = this.field3761[var7 - 1];
            this.field3686[var7] = this.field3686[var7 - 1];
            this.field3669[var7] = this.field3669[var7 - 1];
        }
        if (arg0 == 6) {
            var5--;
        }
        if (arg0 == 7) {
            var5--;
            var4++;
        }
        this.field3669[0] = (byte) arg2;
        this.field3761[0] = var4;
        this.field3686[0] = var5;
        if (arg1 != 15711) {
            this.field3675 = -21;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIBI)V")
    public final void method1712(int arg0, int arg1, byte arg2, int arg3) {
        field3693++;
        int var5 = 0;
        if (arg2 != 123) {
            return;
        }
        while (var5 < 4) {
            if (arg1 >= this.field3696[var5]) {
                this.field3657[var5] = arg0;
                this.field3734[var5] = arg3;
                this.field3696[var5] = arg1 + 70;
                return;
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "(I)I")
    public abstract int method92(int arg0);

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(B)V")
    public final void method1713(byte arg0) {
        this.field3710 = 0;
        this.field3695 = 0;
        int var2 = 24 / ((-arg0 - 46) / 59);
        field3661++;
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(B)I")
    public final int method1714(byte arg0) {
        field3748++;
        if (this.field3726 == -32768) {
            return 200;
        } else {
            if (arg0 > -103) {
                this.field3737 = -111;
            }
            return -this.field3726;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lmg;II)V")
    public final void method1715(class58 arg0, int arg1, int arg2) {
        class295.field4753 = 0;
        class73.field1154 = 0;
        field3702++;
        if (arg1 != 28061) {
            this.method1703(107, (class58) null);
        }
        class7.field72 = 0;
        class294 var4 = this.method1708(0);
        int var5 = var4.field4673;
        int var6 = var4.field4672;
        if (var5 == 0 || var6 == 0) {
            return;
        }
        int var7 = class244.field3590[arg2];
        int var8 = class244.field3592[arg2];
        int var9 = -var6 / 2;
        int var10 = -var5 / 2;
        int var11 = var8 * var9 - var7 * var10 >> 16;
        int var12 = var7 * var9 + var8 * var10 >> 16;
        int var13 = var5 / 2;
        int var14 = class113.method851(class37.field474, 93, this.field3753 + var11, this.field3660 - -var12);
        int var15 = -var6 / 2;
        int var16 = var7 * var15 + var8 * var13 >> 16;
        int var17 = var8 * var15 - var7 * var13 >> 16;
        int var18 = class113.method851(class37.field474, 123, this.field3753 + var17, this.field3660 + var16);
        int var19 = -var5 / 2;
        int var20 = var6 / 2;
        int var21 = var6 / 2;
        int var22 = var8 * var20 - (var7 * var19) >> 16;
        int var23 = var5 / 2;
        int var24 = var7 * var20 + var8 * var19 >> 16;
        int var25 = var7 * var21 + (var8 * var23) >> 16;
        int var26 = class113.method851(class37.field474, -2, this.field3753 + var22, this.field3660 - -var24);
        int var27 = var8 * var21 - var7 * var23 >> 16;
        int var28 = class113.method851(class37.field474, 100, this.field3753 + var27, this.field3660 + var25);
        int var29 = var28 <= var26 ? var28 : var26;
        int var30 = var14 < var26 ? var14 : var26;
        int var31 = var28 > var18 ? var18 : var28;
        int var32 = var18 <= var14 ? var18 : var14;
        class7.field72 = (int) (Math.atan2((double) (var32 - var29), (double) var6) * 325.95D) & 0x7FF;
        if (class7.field72 != 0) {
            arg0.method411(class7.field72);
        }
        class295.field4753 = (int) (Math.atan2((double) (var30 - var31), (double) var5) * 325.95D) & 0x7FF;
        if (class295.field4753 != 0) {
            arg0.method405(class295.field4753);
        }
        class73.field1154 = var14 + var28;
        if ((var18 + var26) < class73.field1154) {
            class73.field1154 = var18 + var26;
        }
        class73.field1154 = (class73.field1154 >> 1) - this.field3759;
        if (class73.field1154 != 0) {
            arg0.method423(0, class73.field1154, 0);
            return;
        }
    }
}
