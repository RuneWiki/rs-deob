import java.awt.Frame;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class31 extends class33 {

    @OriginalMember(owner = "client!d", name = "Y", descriptor = "[I")
    private int[] field660 = new int[3];

    @OriginalMember(owner = "client!d", name = "W", descriptor = "I")
    private int field658 = 3216;

    @OriginalMember(owner = "client!d", name = "eb", descriptor = "I")
    private int field666 = 4096;

    @OriginalMember(owner = "client!d", name = "gb", descriptor = "I")
    private int field668 = 3216;

    @OriginalMember(owner = "client!d", name = "Q", descriptor = "Lrd;")
    private static class173 field652 = class133.method843("Loading sprites )2 ", 39);

    @OriginalMember(owner = "client!d", name = "S", descriptor = "Lrd;")
    public static class173 field654 = class133.method843("_", 14);

    @OriginalMember(owner = "client!d", name = "O", descriptor = "I")
    public static int field650 = 0;

    @OriginalMember(owner = "client!d", name = "X", descriptor = "Lrd;")
    private static class173 field659 = class133.method843("You can(Wt add yourself to your own friend list)3", -94);

    @OriginalMember(owner = "client!d", name = "Z", descriptor = "I")
    public static int field661 = 0;

    @OriginalMember(owner = "client!d", name = "fb", descriptor = "I")
    public static int field667 = 127;

    @OriginalMember(owner = "client!d", name = "ib", descriptor = "Lrd;")
    public static class173 field670 = class133.method843("Bitte benutzen Sie eine andere Welt)3", 60);

    @OriginalMember(owner = "client!d", name = "T", descriptor = "Lrd;")
    public static class173 field655 = field652;

    @OriginalMember(owner = "client!d", name = "kb", descriptor = "Lrd;")
    public static class173 field672 = field659;

    @OriginalMember(owner = "client!d", name = "M", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!d", name = "N", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!d", name = "P", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!d", name = "U", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!d", name = "V", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!d", name = "ab", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!d", name = "bb", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!d", name = "hb", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!d", name = "jb", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!d", name = "db", descriptor = "Lsa;")
    public static class180 field665;

    @OriginalMember(owner = "client!d", name = "R", descriptor = "Ljava/awt/Frame;")
    public static Frame field653;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "lb", descriptor = "Ljava/lang/Class;")
    public static Class field673;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "mb", descriptor = "Ljava/lang/Class;")
    public static Class field674;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "nb", descriptor = "Ljava/lang/Class;")
    public static Class field675;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "ob", descriptor = "Ljava/lang/Class;")
    public static Class field676;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "pb", descriptor = "Ljava/lang/Class;")
    public static Class field677;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "qb", descriptor = "Ljava/lang/Class;")
    public static Class field678;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "rb", descriptor = "Ljava/lang/Class;")
    public static Class field679;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "sb", descriptor = "Ljava/lang/Class;")
    public static Class field680;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "tb", descriptor = "Ljava/lang/Class;")
    public static Class field681;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "ub", descriptor = "Ljava/lang/Class;")
    public static Class field682;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "vb", descriptor = "Ljava/lang/Class;")
    public static Class field683;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "wb", descriptor = "Ljava/lang/Class;")
    public static Class field684;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "xb", descriptor = "Ljava/lang/Class;")
    public static Class field685;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "yb", descriptor = "Ljava/lang/Class;")
    public static Class field686;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "zb", descriptor = "Ljava/lang/Class;")
    public static Class field687;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "Ab", descriptor = "Ljava/lang/Class;")
    public static Class field688;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "Bb", descriptor = "Ljava/lang/Class;")
    public static Class field689;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "Cb", descriptor = "Ljava/lang/Class;")
    public static Class field690;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "Db", descriptor = "Ljava/lang/Class;")
    public static Class field691;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "Eb", descriptor = "Ljava/lang/Class;")
    public static Class field692;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "Fb", descriptor = "Ljava/lang/Class;")
    public static Class field693;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "Gb", descriptor = "Ljava/lang/Class;")
    public static Class field694;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "Hb", descriptor = "Ljava/lang/Class;")
    public static Class field695;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "Ib", descriptor = "Ljava/lang/Class;")
    public static Class field696;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "Jb", descriptor = "Ljava/lang/Class;")
    public static Class field697;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "Kb", descriptor = "Ljava/lang/Class;")
    public static Class field698;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "Lb", descriptor = "Ljava/lang/Class;")
    public static Class field699;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "Mb", descriptor = "Ljava/lang/Class;")
    public static Class field700;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "Nb", descriptor = "Ljava/lang/Class;")
    public static Class field701;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "Ob", descriptor = "Ljava/lang/Class;")
    public static Class field702;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "Pb", descriptor = "Ljava/lang/Class;")
    public static Class field703;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "Qb", descriptor = "Ljava/lang/Class;")
    public static Class field704;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "Rb", descriptor = "Ljava/lang/Class;")
    public static Class field705;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "Sb", descriptor = "Ljava/lang/Class;")
    public static Class field706;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "Tb", descriptor = "Ljava/lang/Class;")
    public static Class field707;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "Ub", descriptor = "Ljava/lang/Class;")
    public static Class field708;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "Vb", descriptor = "Ljava/lang/Class;")
    public static Class field709;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "Wb", descriptor = "Ljava/lang/Class;")
    public static Class field710;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "Xb", descriptor = "Ljava/lang/Class;")
    public static Class field711;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "Yb", descriptor = "Ljava/lang/Class;")
    public static Class field712;

    @OriginalMember(owner = "client!d", name = "cb", descriptor = "[I")
    public static int[] field664;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(I)V")
    public final void method179(int arg0) {
        ++field662;
        this.method251((byte) -60);
        if (arg0 != -1) {
            this.method251((byte) 2);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)Ljava/lang/Class;")
    public static final Class method250(byte arg0, int arg1) {
        if (arg0 <= 58) {
            return null;
        } else {
            ++field649;
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (~arg1 != -3) {
                        if (~arg1 != -4) {
                            if (arg1 != 4) {
                                if (arg1 != 5) {
                                    if (~arg1 != -7) {
                                        if (~arg1 != -8) {
                                            if (~arg1 != -9) {
                                                if (~arg1 != -10) {
                                                    if (~arg1 != -11) {
                                                        if (~arg1 != -12) {
                                                            if (arg1 != 12) {
                                                                if (~arg1 != -14) {
                                                                    if (~arg1 != -15) {
                                                                        if (arg1 != 15) {
                                                                            if (arg1 != 16) {
                                                                                if (arg1 != 17) {
                                                                                    if (~arg1 != -19) {
                                                                                        if (~arg1 != -20) {
                                                                                            if (~arg1 != -21) {
                                                                                                if (arg1 != 21) {
                                                                                                    if (arg1 != 22) {
                                                                                                        if (~arg1 != -24) {
                                                                                                            if (arg1 != 24) {
                                                                                                                if (arg1 != 25) {
                                                                                                                    if (arg1 != 26) {
                                                                                                                        if (arg1 != 27) {
                                                                                                                            if (arg1 != 28) {
                                                                                                                                if (~arg1 != -30) {
                                                                                                                                    if (arg1 != 30) {
                                                                                                                                        if (~arg1 != -32) {
                                                                                                                                            if (arg1 != 32) {
                                                                                                                                                if (~arg1 != -34) {
                                                                                                                                                    if (arg1 != 34) {
                                                                                                                                                        if (~arg1 != -36) {
                                                                                                                                                            if (arg1 != 36) {
                                                                                                                                                                if (arg1 != 37) {
                                                                                                                                                                    if (~arg1 != -39) {
                                                                                                                                                                        if (arg1 == 39) {
                                                                                                                                                                            return field712 != null ? field712 : (field712 = method257("kd"));
                                                                                                                                                                        } else {
                                                                                                                                                                            return null;
                                                                                                                                                                        }
                                                                                                                                                                    } else {
                                                                                                                                                                        return field711 != null ? field711 : (field711 = method257("mf"));
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    return field710 != null ? field710 : (field710 = method257("gb"));
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                return field709 != null ? field709 : (field709 = method257("ue"));
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            return field708 != null ? field708 : (field708 = method257("si"));
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        return field707 != null ? field707 : (field707 = method257("wh"));
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    return field706 != null ? field706 : (field706 = method257("ch"));
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                return field705 != null ? field705 : (field705 = method257("d"));
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            return field704 != null ? field704 : (field704 = method257("hd"));
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        return field703 != null ? field703 : (field703 = method257("bi"));
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    return field702 != null ? field702 : (field702 = method257("i"));
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                return field701 != null ? field701 : (field701 = method257("he"));
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            return field700 != null ? field700 : (field700 = method257("qd"));
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        return field699 != null ? field699 : (field699 = method257("vb"));
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    return field698 != null ? field698 : (field698 = method257("tf"));
                                                                                                                }
                                                                                                            } else {
                                                                                                                return field697 != null ? field697 : (field697 = method257("p"));
                                                                                                            }
                                                                                                        } else {
                                                                                                            return field696 != null ? field696 : (field696 = method257("gd"));
                                                                                                        }
                                                                                                    } else {
                                                                                                        return field695 != null ? field695 : (field695 = method257("la"));
                                                                                                    }
                                                                                                } else {
                                                                                                    return field694 != null ? field694 : (field694 = method257("gi"));
                                                                                                }
                                                                                            } else {
                                                                                                return field693 != null ? field693 : (field693 = method257("td"));
                                                                                            }
                                                                                        } else {
                                                                                            return field692 != null ? field692 : (field692 = method257("sc"));
                                                                                        }
                                                                                    } else {
                                                                                        return field691 != null ? field691 : (field691 = method257("qa"));
                                                                                    }
                                                                                } else {
                                                                                    return field690 != null ? field690 : (field690 = method257("sh"));
                                                                                }
                                                                            } else {
                                                                                return field689 != null ? field689 : (field689 = method257("od"));
                                                                            }
                                                                        } else {
                                                                            return field688 != null ? field688 : (field688 = method257("r"));
                                                                        }
                                                                    } else {
                                                                        return field687 != null ? field687 : (field687 = method257("qi"));
                                                                    }
                                                                } else {
                                                                    return field686 != null ? field686 : (field686 = method257("va"));
                                                                }
                                                            } else {
                                                                return field685 != null ? field685 : (field685 = method257("qe"));
                                                            }
                                                        } else {
                                                            return field684 != null ? field684 : (field684 = method257("cb"));
                                                        }
                                                    } else {
                                                        return field683 != null ? field683 : (field683 = method257("re"));
                                                    }
                                                } else {
                                                    return field682 != null ? field682 : (field682 = method257("wc"));
                                                }
                                            } else {
                                                return field681 != null ? field681 : (field681 = method257("eg"));
                                            }
                                        } else {
                                            return field680 != null ? field680 : (field680 = method257("vg"));
                                        }
                                    } else {
                                        return field679 != null ? field679 : (field679 = method257("q"));
                                    }
                                } else {
                                    return field678 != null ? field678 : (field678 = method257("f"));
                                }
                            } else {
                                return field677 != null ? field677 : (field677 = method257("hh"));
                            }
                        } else {
                            return field676 != null ? field676 : (field676 = method257("jg"));
                        }
                    } else {
                        return field675 != null ? field675 : (field675 = method257("mh"));
                    }
                } else {
                    return field674 != null ? field674 : (field674 = method257("ji"));
                }
            } else {
                return field673 != null ? field673 : (field673 = method257("tb"));
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IILmb;)V")
    public final void method177(int arg0, int arg1, class121 arg2) {
        ++field648;
        if (arg1 > -99) {
            field653 = null;
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field668 = arg2.method755((byte) -87);
                }
            } else {
                this.field658 = arg2.method755((byte) -84);
            }
        } else {
            this.field666 = arg2.method755((byte) -120);
        }
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(B)V")
    private final void method251(byte arg0) {
        ++field651;
        double var2 = Math.cos((double) ((float) this.field668 / 4096.0F));
        this.field660[0] = (int) (Math.sin((double) ((float) this.field658 / 4096.0F)) * var2 * 4096.0D);
        if (arg0 != -60) {
            method250((byte) -6, -32);
        }
        this.field660[1] = (int) (var2 * Math.cos((double) ((float) this.field658 / 4096.0F)) * 4096.0D);
        this.field660[2] = (int) (Math.sin((double) ((float) this.field668 / 4096.0F)) * 4096.0D);
        int var4 = this.field660[0] * this.field660[0] >> 12;
        int var5 = this.field660[1] * this.field660[1] >> 12;
        int var6 = this.field660[2] * this.field660[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 - (-var5 - var6) >> 12)));
        if (var7 != 0) {
            this.field660[1] = (this.field660[1] << 12) / var7;
            this.field660[2] = (this.field660[2] << 12) / var7;
            this.field660[0] = (this.field660[0] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IB)[I")
    public final int[] method175(int arg0, byte arg1) {
        int var3 = 6 % ((-65 - arg1) / 60);
        ++field669;
        int[] var4 = super.field718.method514(arg0, 127);
        if (super.field718.field1615) {
            int var5 = class199.field3882 * this.field666 >> 12;
            int[] var6 = this.method262(arg0 + -1 & class26.field545, 61, 0);
            int[] var7 = this.method262(arg0, -115, 0);
            int[] var8 = this.method262(class26.field545 & arg0 - -1, 89, 0);
            for (int var9 = 0; class117.field2173 > var9; ++var9) {
                int var10 = (var8[var9] + -var6[var9]) * var5;
                int var11 = (var7[class125.field2347 & var9 + 1] + -var7[class125.field2347 & var9 + -1]) * var5;
                int var12 = var11 >> 12;
                int var13 = var10 >> 12;
                int var14 = var12 * var12 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = (int) (Math.sqrt((double) ((float) (var14 - (-var15 - 4096)) / 4096.0F)) * 4096.0D);
                int var17;
                int var18;
                int var19;
                if (~var16 != -1) {
                    var17 = var11 / var16;
                    var18 = 16777216 / var16;
                    var19 = var10 / var16;
                } else {
                    var17 = 0;
                    var19 = 0;
                    var18 = 0;
                }
                int var20 = this.field660[0] * var17 >> 12;
                int var21 = this.field660[2] * var18 >> 12;
                int var22 = this.field660[1] * var19 >> 12;
                var4[var9] = var20 - (-var21 + -var22);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(B)V")
    public static final void method252(byte arg0) {
        Object var1 = class62.field1221;
        synchronized (class62.field1221) {
            if (~class168.field3243 == -1) {
                class64.field1264.method835(5, -24542, new class68());
            }
            class168.field3243 = 600;
        }
        ++field657;
        if (arg0 > -98) {
            method255((class155) null, 17, 18);
        }
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V")
    public class31() {
        super(1, true);
    }

    @OriginalMember(owner = "client!d", name = "f", descriptor = "(I)V")
    public static void method253(int arg0) {
        field672 = null;
        field653 = null;
        field655 = null;
        if (arg0 != 16777216) {
            field650 = -90;
        }
        field654 = null;
        field652 = null;
        field664 = null;
        field670 = null;
        field665 = null;
        field659 = null;
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(III)V")
    public static final void method254(int arg0, int arg1, int arg2) {
        if (arg0 == 28) {
            ++field656;
            if (class212.method1389(-120, arg1)) {
                class9.method65(17644, arg2, class63.field1232[arg1]);
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lpf;II)V")
    public static final void method255(class155 arg0, int arg1, int arg2) {
        if (arg2 != -472) {
            method250((byte) -46, -27);
        }
        ++field671;
        while (true) {
            class199 var3 = (class199) class140.field2617.method915(-1);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; ~var5 > ~var3.field3876; ++var5) {
                if (var3.field3866[var5] != null) {
                    if (var3.field3866[var5].field4254 == 2) {
                        var3.field3867[var5] = -5;
                    }
                    if (~var3.field3866[var5].field4254 == -1) {
                        var4 = true;
                    }
                }
                if (var3.field3873[var5] != null) {
                    if (var3.field3873[var5].field4254 == 2) {
                        var3.field3867[var5] = -6;
                    }
                    if (var3.field3873[var5].field4254 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method1023(arg1, -21822);
            arg0.method752(0, (byte) -128);
            int var6 = arg0.field2222;
            arg0.method775(732495312, var3.field3883);
            for (int var7 = 0; var3.field3876 > var7; ++var7) {
                if (var3.field3867[var7] != 0) {
                    arg0.method752(var3.field3867[var7], (byte) -128);
                } else {
                    try {
                        int var8 = var3.field3872[var7];
                        if (~var8 == -1) {
                            Field var9 = (Field) var3.field3866[var7].field4256;
                            int var10 = var9.getInt((Object) null);
                            arg0.method752(0, (byte) -128);
                            arg0.method775(732495312, var10);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field3866[var7].field4256;
                            var11.setInt((Object) null, var3.field3870[var7]);
                            arg0.method752(0, (byte) -128);
                        } else if (~var8 == -3) {
                            Field var12 = (Field) var3.field3866[var7].field4256;
                            int var13 = var12.getModifiers();
                            arg0.method752(0, (byte) -128);
                            arg0.method775(732495312, var13);
                        }
                        if (var8 != 3) {
                            if (~var8 == -5) {
                                Method var20 = (Method) var3.field3873[var7].field4256;
                                int var21 = var20.getModifiers();
                                arg0.method752(0, (byte) -128);
                                arg0.method775(arg2 ^ -732494856, var21);
                            }
                        } else {
                            Method var14 = (Method) var3.field3873[var7].field4256;
                            byte[][] var15 = var3.field3878[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; ~var15.length < ~var17; ++var17) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg0.method752(0, (byte) -128);
                            } else if (var19 instanceof Number) {
                                arg0.method752(1, (byte) -128);
                                arg0.method756(((Number) var19).longValue(), arg2 + 578);
                            } else if (var19 instanceof class173) {
                                arg0.method752(2, (byte) -128);
                                arg0.method774(false, (class173) var19);
                            } else {
                                arg0.method752(4, (byte) -128);
                            }
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method752(-10, (byte) -128);
                    } catch (InvalidClassException var23) {
                        arg0.method752(-11, (byte) -128);
                    } catch (StreamCorruptedException var24) {
                        arg0.method752(-12, (byte) -128);
                    } catch (OptionalDataException var25) {
                        arg0.method752(-13, (byte) -128);
                    } catch (IllegalAccessException var26) {
                        arg0.method752(-14, (byte) -128);
                    } catch (IllegalArgumentException var27) {
                        arg0.method752(-15, (byte) -128);
                    } catch (InvocationTargetException var28) {
                        arg0.method752(-16, (byte) -128);
                    } catch (SecurityException var29) {
                        arg0.method752(-17, (byte) -128);
                    } catch (IOException var30) {
                        arg0.method752(-18, (byte) -128);
                    } catch (NullPointerException var31) {
                        arg0.method752(-19, (byte) -128);
                    } catch (Exception var32) {
                        arg0.method752(-20, (byte) -128);
                    } catch (Throwable var33) {
                        arg0.method752(-21, (byte) -128);
                    }
                }
            }
            arg0.method772(var6, (byte) 127);
            arg0.method786(-var6 + arg0.field2222, (byte) -108);
            var3.method824((byte) -127);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BIIIII)V")
    public static final void method256(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field663;
        long var6 = class13.method97(arg2, arg4, arg5);
        if (~var6 != -1L) {
            int var8 = (int) var6 >> 20 & 3;
            int var9 = (519055 & (int) var6) >> 14;
            int var10 = (103 - arg5) * 512 * 4 + arg4 * 4 + 24624;
            int[] var11 = class30.field620.field3546;
            int var12 = arg3;
            if (var6 > 0L) {
                var12 = arg1;
            }
            int var13 = (int) (var6 >>> 32) & Integer.MAX_VALUE;
            class4 var14 = class182.method1237(true, var13);
            if (~var14.field86 == 0) {
                if (~var9 == -1 || var9 == 2) {
                    if (~var8 != -1) {
                        if (var8 != 1) {
                            if (~var8 != -3) {
                                if (~var8 == -4) {
                                    var11[var10 + 1536] = var12;
                                    var11[var10 - -1537] = var12;
                                    var11[var10 + 1536 + 2] = var12;
                                    var11[var10 + 1539] = var12;
                                }
                            } else {
                                var11[var10 - -3] = var12;
                                var11[var10 - -3 + 512] = var12;
                                var11[var10 + 1027] = var12;
                                var11[var10 + 3 + 1536] = var12;
                            }
                        } else {
                            var11[var10] = var12;
                            var11[var10 + 1] = var12;
                            var11[var10 - -2] = var12;
                            var11[var10 + 3] = var12;
                        }
                    } else {
                        var11[var10] = var12;
                        var11[var10 + 512] = var12;
                        var11[var10 + 1024] = var12;
                        var11[var10 + 1536] = var12;
                    }
                }
                if (var9 == 3) {
                    if (~var8 == -1) {
                        var11[var10] = var12;
                    } else if (var8 != 1) {
                        if (var8 == 2) {
                            var11[var10 - -1536 + 3] = var12;
                        } else if (~var8 == -4) {
                            var11[var10 + 1536] = var12;
                        }
                    } else {
                        var11[var10 + 3] = var12;
                    }
                }
                if (var9 == 2) {
                    if (var8 != 3) {
                        if (var8 == 0) {
                            var11[var10] = var12;
                            var11[var10 - -1] = var12;
                            var11[var10 + 2] = var12;
                            var11[var10 + 3] = var12;
                        } else if (var8 == 1) {
                            var11[var10 + 3] = var12;
                            var11[var10 + 515] = var12;
                            var11[var10 + 1024 + 3] = var12;
                            var11[var10 + 1536 + 3] = var12;
                        } else if (~var8 == -3) {
                            var11[var10 + 1536] = var12;
                            var11[var10 + 1536 - -1] = var12;
                            var11[var10 + 1536 + 2] = var12;
                            var11[var10 - -3 + 1536] = var12;
                        }
                    } else {
                        var11[var10] = var12;
                        var11[var10 + 512] = var12;
                        var11[var10 + 1024] = var12;
                        var11[var10 + 1536] = var12;
                    }
                }
            } else {
                class39 var15 = class139.field2600[var14.field86];
                if (var15 != null) {
                    int var16 = (var14.field61 * 4 + -var15.field812) / 2;
                    int var17 = (var14.field67 * 4 + -var15.field809) / 2;
                    var15.method291(arg4 * 4 + var16 + 48, (-arg5 + 104 - var14.field67) * 4 + var17 + 48);
                }
            }
        }
        long var18 = class62.method392(arg2, arg4, arg5);
        if (~var18 != -1L) {
            int var20 = (3242555 & (int) var18) >> 20;
            int var21 = 31 & (int) var18 >> 14;
            int var22 = (int) (var18 >>> 32) & Integer.MAX_VALUE;
            class4 var23 = class182.method1237(true, var22);
            if (var23.field86 != -1) {
                class39 var24 = class139.field2600[var23.field86];
                if (var24 != null) {
                    int var25 = (var23.field61 * 4 + -var24.field812) / 2;
                    int var26 = (var23.field67 * 4 + -var24.field809) / 2;
                    var24.method291(arg4 * 4 + var25 + 48, (-arg5 + 104 + -var23.field67) * 4 + 48 + var26);
                }
            } else if (~var21 == -10) {
                int[] var27 = class30.field620.field3546;
                int var28 = 15658734;
                if (~var18 < -1L) {
                    var28 = 15597568;
                }
                int var29 = arg4 * 4 + (-(arg5 * 512) + 52736) * 4 + 24624;
                if (var20 != 0 && var20 != 2) {
                    var27[var29] = var28;
                    var27[var29 - -512 + 1] = var28;
                    var27[var29 + 1024 + 2] = var28;
                    var27[var29 + 1539] = var28;
                } else {
                    var27[var29 + 1536] = var28;
                    var27[var29 - -1024 + 1] = var28;
                    var27[var29 + 512 + 2] = var28;
                    var27[var29 + 3] = var28;
                }
            }
        }
        if (arg0 != -50) {
            field667 = -69;
        }
        long var30 = class34.method268(arg2, arg4, arg5);
        if (var30 != 0L) {
            int var32 = (int) (var30 >>> 32) & Integer.MAX_VALUE;
            class4 var33 = class182.method1237(true, var32);
            if (var33.field86 != -1) {
                class39 var34 = class139.field2600[var33.field86];
                if (var34 != null) {
                    int var35 = (var33.field67 * 4 + -var34.field809) / 2;
                    int var36 = (var33.field61 * 4 + -var34.field812) / 2;
                    var34.method291(arg4 * 4 + 48 + var36, (-var33.field67 + -arg5 + 104) * 4 + 48 + var35);
                    return;
                }
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method257(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
