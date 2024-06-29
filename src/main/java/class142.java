import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class142 extends class111 {

    @OriginalMember(owner = "client!v", name = "Qc", descriptor = "Z")
    public boolean field3569 = false;

    @OriginalMember(owner = "client!v", name = "Mc", descriptor = "I")
    public int field3565 = 0;

    @OriginalMember(owner = "client!v", name = "Cc", descriptor = "I")
    public int field3555 = 0;

    @OriginalMember(owner = "client!v", name = "cd", descriptor = "I")
    public int field3581 = 0;

    @OriginalMember(owner = "client!v", name = "zc", descriptor = "I")
    public int field3552 = -1;

    @OriginalMember(owner = "client!v", name = "xc", descriptor = "I")
    public int field3550 = 0;

    @OriginalMember(owner = "client!v", name = "id", descriptor = "I")
    public int field3587 = -1;

    @OriginalMember(owner = "client!v", name = "ad", descriptor = "I")
    public int field3579 = 0;

    @OriginalMember(owner = "client!v", name = "Lc", descriptor = "Z")
    public static boolean field3564 = false;

    @OriginalMember(owner = "client!v", name = "Kc", descriptor = "Lfc;")
    private static class39 field3563 = class90.method774("Accept trade", -118);

    @OriginalMember(owner = "client!v", name = "Vc", descriptor = "[I")
    public static int[] field3574 = new int[25];

    @OriginalMember(owner = "client!v", name = "Bc", descriptor = "Lfc;")
    public static class39 field3554 = class90.method774("<col=00ffff>", -123);

    @OriginalMember(owner = "client!v", name = "Fc", descriptor = "I")
    public static int field3558 = 0;

    @OriginalMember(owner = "client!v", name = "ed", descriptor = "I")
    public static int field3583 = 2301979;

    @OriginalMember(owner = "client!v", name = "Rc", descriptor = "Lfc;")
    public static class39 field3570 = field3563;

    @OriginalMember(owner = "client!v", name = "jd", descriptor = "Lfc;")
    public static class39 field3588 = class90.method774("http:)4)4www)3runescape)3com", -83);

    @OriginalMember(owner = "client!v", name = "dd", descriptor = "Lfc;")
    private static class39 field3582 = class90.method774("Loading title screen )2 ", -90);

    @OriginalMember(owner = "client!v", name = "Ec", descriptor = "Lfc;")
    public static class39 field3557 = field3582;

    @OriginalMember(owner = "client!v", name = "yc", descriptor = "I")
    public int field3551;

    @OriginalMember(owner = "client!v", name = "Dc", descriptor = "I")
    public int field3556;

    @OriginalMember(owner = "client!v", name = "Gc", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!v", name = "Ic", descriptor = "I")
    public int field3561;

    @OriginalMember(owner = "client!v", name = "Jc", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!v", name = "Pc", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!v", name = "Sc", descriptor = "I")
    public int field3571;

    @OriginalMember(owner = "client!v", name = "Tc", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!v", name = "Uc", descriptor = "I")
    public int field3573;

    @OriginalMember(owner = "client!v", name = "Xc", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!v", name = "Yc", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!v", name = "Zc", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!v", name = "gd", descriptor = "I")
    public int field3585;

    @OriginalMember(owner = "client!v", name = "hd", descriptor = "I")
    public int field3586;

    @OriginalMember(owner = "client!v", name = "ld", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!v", name = "md", descriptor = "I")
    public int field3591;

    @OriginalMember(owner = "client!v", name = "Ac", descriptor = "Lu;")
    public class136 field3553;

    @OriginalMember(owner = "client!v", name = "fd", descriptor = "Lda;")
    public class23 field3584;

    @OriginalMember(owner = "client!v", name = "Oc", descriptor = "Ldd;")
    public static class26 field3567;

    @OriginalMember(owner = "client!v", name = "Wc", descriptor = "Lfc;")
    public class39 field3575;

    @OriginalMember(owner = "client!v", name = "bd", descriptor = "Lmf;")
    public static class89 field3580;

    @OriginalMember(owner = "client!v", name = "kd", descriptor = "Z")
    public static boolean field3589;

    @OriginalMember(owner = "client!v", name = "Nc", descriptor = "[I")
    public static int[] field3566;

    @OriginalMember(owner = "client!v", name = "Hc", descriptor = "[Lbe;")
    public static class13[] field3560;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "(I)V", line = 6)
    public static void method1157(int arg0) {
        field3554 = null;
        field3567 = null;
        field3588 = null;
        field3563 = null;
        if (arg0 >= 57) {
            field3560 = null;
            field3580 = null;
            field3574 = null;
            field3582 = null;
            field3557 = null;
            field3566 = null;
            field3570 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V", line = 26)
    public static final void method1158(String arg0, Throwable arg1, int arg2) {
        ++field3578;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class104.method933(-31606, arg1);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class79.field1793.field3365 != null) {
                if (arg2 > -54) {
                    method1158((String) null, (Throwable) null, -114);
                }
                class81 var8 = class79.field1793.method1085(2699, new URL(class79.field1793.field3365.getCodeBase(), "clienterror.ws?c=" + class115.field3009 + "&u=" + class43.field1181 + "&v1=" + class133.field3357 + "&v2=" + class133.field3350 + "&e=" + var7));
                while (var8.field1816 == 0) {
                    class61.method609(-92, 1L);
                }
                if (var8.field1816 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field1820;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZLdc;)V", line = 120)
    public final void method1159(boolean arg0, class25 arg1) {
        ++field3572;
        arg1.field710 = 0;
        int var3 = arg1.method322((byte) -50);
        this.field3552 = arg1.method293(-119);
        int[] var4 = new int[12];
        int var5 = -1;
        this.field3587 = arg1.method293(-128);
        this.field3581 = 0;
        for (int var6 = 0; var6 < 12; ++var6) {
            int var7 = arg1.method322((byte) -50);
            if (var7 == 0) {
                var4[var6] = 0;
            } else {
                int var8 = arg1.method322((byte) -50);
                var4[var6] = (var7 << 8) + var8;
                if (~var6 == -1 && var4[0] == 65535) {
                    var5 = arg1.method301(-4853);
                    break;
                }
                if (~var4[var6] <= -513) {
                    int var12 = class37.method421(!arg0, var4[var6] + -512).field2756;
                    if (var12 != 0) {
                        this.field3581 = var12;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; ++var10) {
            int var11 = arg1.method322((byte) -50);
            if (~var11 > -1 || ~class31.field866[var10].length >= ~var11) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        super.field2920 = arg1.method301(-4853);
        if (super.field2920 == 65535) {
            super.field2920 = -1;
        }
        super.field2896 = arg1.method301(-4853);
        if (arg0) {
            method1157(55);
        }
        if (super.field2896 == 65535) {
            super.field2896 = -1;
        }
        super.field2858 = super.field2896;
        super.field2873 = arg1.method301(-4853);
        if (~super.field2873 == -65536) {
            super.field2873 = -1;
        }
        super.field2861 = arg1.method301(-4853);
        if (super.field2861 == 65535) {
            super.field2861 = -1;
        }
        super.field2917 = arg1.method301(-4853);
        if (~super.field2917 == -65536) {
            super.field2917 = -1;
        }
        super.field2907 = arg1.method301(-4853);
        if (~super.field2907 == -65536) {
            super.field2907 = -1;
        }
        super.field2870 = arg1.method301(-4853);
        if (~super.field2870 == -65536) {
            super.field2870 = -1;
        }
        this.field3575 = class27.method345((byte) -54, arg1.method319((byte) -109)).method447(-98);
        this.field3550 = arg1.method322((byte) -50);
        this.field3555 = arg1.method301(-4853);
        if (this.field3553 == null) {
            this.field3553 = new class136();
        }
        this.field3553.method1098(var5, var9, ~var3 == -2, 7, var4);
    }

    @OriginalMember(owner = "client!v", name = "i", descriptor = "(I)V", line = 244)
    public static final void method1160(int arg0) {
        class116.field3034.method927(false);
        if (arg0 != 0) {
            field3560 = null;
        }
        ++field3576;
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(I)Lda;", line = 258)
    public final class23 method153(int arg0) {
        if (arg0 != 64) {
            return null;
        } else {
            ++field3590;
            if (this.field3553 == null) {
                return null;
            } else {
                class116 var2 = ~super.field2888 != 0 && ~super.field2911 == -1 ? class38.method430(arg0 ^ 2302, super.field2888) : null;
                class116 var3 = super.field2869 == -1 || this.field3569 || ~super.field2920 == ~super.field2869 && var2 != null ? null : class38.method430(2238, super.field2869);
                class23 var4 = this.field3553.method1100(var3, super.field2886, var2, super.field2892, -412250936);
                if (var4 == null) {
                    return null;
                } else {
                    var4.method258();
                    super.field2923 = var4.field2966;
                    if (!this.field3569 && super.field2891 != -1 && ~super.field2866 != 0) {
                        class23 var5 = class60.method598(super.field2891, 32).method943(super.field2866, 16664);
                        if (var5 != null) {
                            var5.method263(0, -super.field2902, 0);
                            class23[] var6 = new class23[] { var4, var5 };
                            var4 = new class23(var6, 2);
                        }
                    }
                    if (!this.field3569 && this.field3584 != null) {
                        if (~this.field3565 >= ~class70.field1654) {
                            this.field3584 = null;
                        }
                        if (~class70.field1654 <= ~this.field3579 && ~class70.field1654 > ~this.field3565) {
                            class23 var7 = this.field3584;
                            class23[] var8 = new class23[] { var4, var7 };
                            var7.method263(this.field3585 - super.field2916, -this.field3591 + this.field3573, -super.field2909 + this.field3586);
                            if (super.field2887 == 512) {
                                var7.method260();
                                var7.method260();
                                var7.method260();
                            } else if (super.field2887 == 1024) {
                                var7.method260();
                                var7.method260();
                            } else if (~super.field2887 == -1537) {
                                var7.method260();
                            }
                            var4 = new class23(var8, 2);
                            if (~super.field2887 == -513) {
                                var7.method260();
                            } else if (super.field2887 == 1024) {
                                var7.method260();
                                var7.method260();
                            } else if (super.field2887 == 1536) {
                                var7.method260();
                                var7.method260();
                                var7.method260();
                            }
                            var7.method263(-this.field3585 + super.field2916, -this.field3573 + this.field3591, -this.field3586 + super.field2909);
                        }
                    }
                    var4.field606 = true;
                    return var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "g", descriptor = "(B)V", line = 356)
    public static final void method1161(byte arg0) {
        if (arg0 != -103) {
            field3589 = true;
        }
        ++field3559;
        if (~class3.field84 == -3) {
            class124.method1042((-class54.field1341 + class107.field2676 << 7) - -class12.field324, field3558 * 2, (-class55.field1382 + class80.field1808 << 7) - -class128.field3265, -27213);
            if (~class14.field370 < 0 && class70.field1654 % 20 < 10) {
                class139.field3511[0].method116(class14.field370 + -12, class61.field1506 + -28);
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "g", descriptor = "(I)Z", line = 384)
    public final boolean method979(int arg0) {
        ++field3568;
        if (arg0 != 18) {
            this.field3585 = -87;
        }
        return this.field3553 != null;
    }
}
