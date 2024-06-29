import java.awt.Color;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class440 extends class118 {

    @OriginalMember(owner = "client!qe", name = "K", descriptor = "I")
    private int field6465 = 0;

    @OriginalMember(owner = "client!qe", name = "H", descriptor = "I")
    private int field6462 = 10;

    @OriginalMember(owner = "client!qe", name = "S", descriptor = "I")
    private int field6473 = 2048;

    @OriginalMember(owner = "client!qe", name = "L", descriptor = "Lwl;")
    public static class452 field6466 = new class452(81, 6);

    @OriginalMember(owner = "client!qe", name = "R", descriptor = "Loa;")
    public static class149 field6472 = new class149(128);

    @OriginalMember(owner = "client!qe", name = "U", descriptor = "[I")
    public static int[] field6475;

    @OriginalMember(owner = "client!qe", name = "V", descriptor = "Ljg;")
    public static class241 field6476;

    @OriginalMember(owner = "client!qe", name = "Y", descriptor = "Z")
    public static boolean field6479;

    @OriginalMember(owner = "client!qe", name = "X", descriptor = "Lnn;")
    public static class151 field6478;

    @OriginalMember(owner = "client!qe", name = "G", descriptor = "I")
    public static int field6461;

    @OriginalMember(owner = "client!qe", name = "I", descriptor = "I")
    public static int field6463;

    @OriginalMember(owner = "client!qe", name = "M", descriptor = "I")
    public static int field6467;

    @OriginalMember(owner = "client!qe", name = "N", descriptor = "I")
    public static int field6468;

    @OriginalMember(owner = "client!qe", name = "P", descriptor = "I")
    public static int field6470;

    @OriginalMember(owner = "client!qe", name = "Q", descriptor = "I")
    public static int field6471;

    @OriginalMember(owner = "client!qe", name = "T", descriptor = "I")
    public static int field6474;

    @OriginalMember(owner = "client!qe", name = "W", descriptor = "Ljava/awt/Image;")
    public static Image field6477;

    @OriginalMember(owner = "client!qe", name = "J", descriptor = "[I")
    private int[] field6464;

    @OriginalMember(owner = "client!qe", name = "O", descriptor = "[I")
    private int[] field6469;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(CB)B")
    public static final byte method2693(char arg0, byte arg1) {
        ++field6461;
        if (arg1 != -59) {
            field6475 = null;
        }
        byte var2;
        if ((arg0 <= 0 || ~arg0 <= -129) && (~arg0 > -161 || arg0 > 255)) {
            if (~arg0 == -8365) {
                var2 = -128;
            } else if (arg0 != 8218) {
                if (arg0 == 402) {
                    var2 = -125;
                } else if (arg0 != 8222) {
                    if (~arg0 != -8231) {
                        if (arg0 != 8224) {
                            if (~arg0 != -8226) {
                                if (~arg0 == -711) {
                                    var2 = -120;
                                } else if (arg0 != 8240) {
                                    if (arg0 == 352) {
                                        var2 = -118;
                                    } else if (arg0 == 8249) {
                                        var2 = -117;
                                    } else if (arg0 == 338) {
                                        var2 = -116;
                                    } else if (arg0 != 381) {
                                        if (arg0 == 8216) {
                                            var2 = -111;
                                        } else if (~arg0 != -8218) {
                                            if (~arg0 != -8221) {
                                                if (~arg0 == -8222) {
                                                    var2 = -108;
                                                } else if (arg0 != 8226) {
                                                    if (arg0 != 8211) {
                                                        if (~arg0 != -8213) {
                                                            if (~arg0 == -733) {
                                                                var2 = -104;
                                                            } else if (~arg0 == -8483) {
                                                                var2 = -103;
                                                            } else if (~arg0 != -354) {
                                                                if (arg0 != 8250) {
                                                                    if (~arg0 != -340) {
                                                                        if (~arg0 != -383) {
                                                                            if (arg0 == 376) {
                                                                                var2 = -97;
                                                                            } else {
                                                                                var2 = 63;
                                                                            }
                                                                        } else {
                                                                            var2 = -98;
                                                                        }
                                                                    } else {
                                                                        var2 = -100;
                                                                    }
                                                                } else {
                                                                    var2 = -101;
                                                                }
                                                            } else {
                                                                var2 = -102;
                                                            }
                                                        } else {
                                                            var2 = -105;
                                                        }
                                                    } else {
                                                        var2 = -106;
                                                    }
                                                } else {
                                                    var2 = -107;
                                                }
                                            } else {
                                                var2 = -109;
                                            }
                                        } else {
                                            var2 = -110;
                                        }
                                    } else {
                                        var2 = -114;
                                    }
                                } else {
                                    var2 = -119;
                                }
                            } else {
                                var2 = -121;
                            }
                        } else {
                            var2 = -122;
                        }
                    } else {
                        var2 = -123;
                    }
                } else {
                    var2 = -124;
                }
            } else {
                var2 = -126;
            }
        } else {
            var2 = (byte) arg0;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field6467;
        if (arg0 != 1) {
            method2694(-37);
        }
        int[] var3 = super.field1537.method2395(30963, arg1);
        if (super.field1537.field5756) {
            int var4 = class160.field2210[arg1];
            if (~this.field6465 == -1) {
                short var5 = 0;
                for (int var6 = 0; ~var6 > ~this.field6462; ++var6) {
                    if (~var4 <= ~this.field6464[var6] && var4 < this.field6464[var6 + 1]) {
                        if (var4 < this.field6469[var6]) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class129.method766(var3, 0, field6474, var5);
            } else {
                for (int var7 = 0; var7 < field6474; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class6.field73[var7];
                    int var11 = this.field6465;
                    if (~var11 != -2) {
                        if (var11 != 2) {
                            if (var11 == 3) {
                                var8 = (-var4 + var10 >> 1) + 2048;
                            }
                        } else {
                            var8 = (var4 + var10 + -4096 >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; ~this.field6462 < ~var12; ++var12) {
                        if (~this.field6464[var12] >= ~var8 && ~var8 > ~this.field6464[var12 + 1]) {
                            if (this.field6469[var12] > var8) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)V")
    public static final void method2694(int arg0) {
        class185.field2786.method580(-21396);
        ++field6463;
        class74.field1004.method510(true);
        if (class229.field3496 != null) {
            class229.field3496.method649((byte) -62, class170.field2631);
        }
        class68.field876.method795((byte) -78);
        class170.field2631.setBackground(Color.black);
        class189.field2839 = arg0;
        class185.field2786 = class155.method958(class170.field2631, (byte) 73);
        class74.field1004 = class271.method1681(-128, true, class170.field2631);
        if (class229.field3496 != null) {
            class229.field3496.method648(arg0 + 4, class170.field2631);
        }
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)V")
    public final void method306(int arg0) {
        if (arg0 >= 103) {
            this.method2695((byte) 67);
            ++field6471;
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
    public class440() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)V")
    private final void method2695(byte arg0) {
        ++field6470;
        this.field6469 = new int[this.field6462 + 1];
        int var2 = 105 % ((arg0 - -35) / 55);
        this.field6464 = new int[this.field6462 + 1];
        int var3 = 0;
        int var4 = 4096 / this.field6462;
        int var5 = this.field6473 * var4 >> 12;
        for (int var6 = 0; ~this.field6462 < ~var6; ++var6) {
            this.field6464[var6] = var3;
            this.field6469[var6] = var3 + var5;
            var3 += var4;
        }
        this.field6464[this.field6462] = 4096;
        this.field6469[this.field6462] = this.field6469[0] + 4096;
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(B)V")
    public static void method2696(byte arg0) {
        field6472 = null;
        field6476 = null;
        field6477 = null;
        field6475 = null;
        field6466 = null;
        field6478 = null;
        if (arg0 <= 109) {
            method2693((char) 65469, (byte) 87);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILef;)V")
    public final void method24(int arg0, int arg1, class385 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field6465 = arg2.method2343(255);
                }
            } else {
                this.field6473 = arg2.method2323(-100);
            }
        } else {
            this.field6462 = arg2.method2343(arg1 + 254);
        }
        ++field6468;
        if (arg1 != 1) {
            this.field6465 = -105;
        }
    }

    static {
        new class151((String) null, "geschickt werden.", (String) null, (String) null);
        field6475 = new int[13];
        field6476 = new class241(64);
        field6479 = false;
        field6478 = new class151(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");
    }
}
