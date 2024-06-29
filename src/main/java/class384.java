import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class384 extends class456 {

    @OriginalMember(owner = "client!wi", name = "I", descriptor = "I")
    private int field5680 = 0;

    @OriginalMember(owner = "client!wi", name = "R", descriptor = "I")
    private int field5689 = 0;

    @OriginalMember(owner = "client!wi", name = "N", descriptor = "I")
    private int field5685 = 1;

    @OriginalMember(owner = "client!wi", name = "K", descriptor = "F")
    public static float field5682 = 0.0F;

    @OriginalMember(owner = "client!wi", name = "S", descriptor = "I")
    public static int field5690 = 0;

    @OriginalMember(owner = "client!wi", name = "Q", descriptor = "Lo;")
    public static class332 field5688 = new class332("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!wi", name = "T", descriptor = "I")
    public static int field5691 = -1;

    @OriginalMember(owner = "client!wi", name = "H", descriptor = "I")
    public static int field5679;

    @OriginalMember(owner = "client!wi", name = "J", descriptor = "I")
    public static int field5681;

    @OriginalMember(owner = "client!wi", name = "L", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!wi", name = "M", descriptor = "I")
    public static int field5684;

    @OriginalMember(owner = "client!wi", name = "O", descriptor = "I")
    public static int field5686;

    @OriginalMember(owner = "client!wi", name = "P", descriptor = "I")
    public static int field5687;

    @OriginalMember(owner = "client!wi", name = "U", descriptor = "I")
    public static int field5692;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(III)I")
    public static final int method2333(int arg0, int arg1, int arg2) {
        ++field5686;
        if (arg0 > arg1) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        while (~arg0 != -1) {
            int var4 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var4;
        }
        if (arg2 != 353) {
            method2335(-87);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILjava/lang/String;)[B")
    public static final byte[] method2334(int arg0, String arg1) {
        ++field5683;
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        for (int var4 = 0; var2 > var4; ++var4) {
            char var5 = arg1.charAt(var4);
            if (var5 > 0 && var5 < 128 || var5 >= 160 && var5 <= 255) {
                var3[var4] = (byte) var5;
            } else if (var5 != 8364) {
                if (var5 != 8218) {
                    if (var5 == 402) {
                        var3[var4] = -125;
                    } else if (~var5 != -8223) {
                        if (var5 == 8230) {
                            var3[var4] = -123;
                        } else if (~var5 == -8225) {
                            var3[var4] = -122;
                        } else if (var5 != 8225) {
                            if (~var5 == -711) {
                                var3[var4] = -120;
                            } else if (var5 == 8240) {
                                var3[var4] = -119;
                            } else if (~var5 == -353) {
                                var3[var4] = -118;
                            } else if (var5 == 8249) {
                                var3[var4] = -117;
                            } else if (~var5 == -339) {
                                var3[var4] = -116;
                            } else if (var5 != 381) {
                                if (~var5 == -8217) {
                                    var3[var4] = -111;
                                } else if (var5 != 8217) {
                                    if (var5 == 8220) {
                                        var3[var4] = -109;
                                    } else if (~var5 == -8222) {
                                        var3[var4] = -108;
                                    } else if (var5 != 8226) {
                                        if (var5 != 8211) {
                                            if (~var5 != -8213) {
                                                if (var5 != 732) {
                                                    if (~var5 == -8483) {
                                                        var3[var4] = -103;
                                                    } else if (var5 == 353) {
                                                        var3[var4] = -102;
                                                    } else if (var5 != 8250) {
                                                        if (~var5 == -340) {
                                                            var3[var4] = -100;
                                                        } else if (var5 == 382) {
                                                            var3[var4] = -98;
                                                        } else if (var5 == 376) {
                                                            var3[var4] = -97;
                                                        } else {
                                                            var3[var4] = 63;
                                                        }
                                                    } else {
                                                        var3[var4] = -101;
                                                    }
                                                } else {
                                                    var3[var4] = -104;
                                                }
                                            } else {
                                                var3[var4] = -105;
                                            }
                                        } else {
                                            var3[var4] = -106;
                                        }
                                    } else {
                                        var3[var4] = -107;
                                    }
                                } else {
                                    var3[var4] = -110;
                                }
                            } else {
                                var3[var4] = -114;
                            }
                        } else {
                            var3[var4] = -121;
                        }
                    } else {
                        var3[var4] = -124;
                    }
                } else {
                    var3[var4] = -126;
                }
            } else {
                var3[var4] = -128;
            }
        }
        if (arg0 != 12128) {
            method2333(-50, -46, 84);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "(I)V")
    public static void method2335(int arg0) {
        field5688 = null;
        if (arg0 != 1) {
            method2334(82, (String) null);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V")
    public final void method653(boolean arg0) {
        ++field5679;
        class154.method1056(106);
        if (!arg0) {
            method2335(-9);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IBLre;)V")
    public final void method210(int arg0, byte arg1, class446 arg2) {
        if (arg1 != 55) {
            this.field5680 = 102;
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -4) {
                    this.field5685 = arg2.method2628(49152);
                }
            } else {
                this.field5680 = arg2.method2628(49152);
            }
        } else {
            this.field5689 = arg2.method2628(49152);
        }
        ++field5681;
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
    public class384() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(II)[I")
    public final int[] method33(int arg0, int arg1) {
        ++field5687;
        int[] var3 = super.field6466.method2533(true, arg1);
        if (arg0 != -1) {
            method2335(26);
        }
        if (super.field6466.field6153) {
            int var4 = class14.field206[arg1];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; ~class156.field2169 < ~var6; ++var6) {
                int var7 = class288.field4397[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (this.field5689 == 0) {
                    var9 = (var7 - var4) * this.field5685;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field5685 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (this.field5680 != 0) {
                    if (this.field5680 == 2) {
                        var12 -= 2048;
                        if (~var12 > -1) {
                            var12 = -var12;
                        }
                        var12 = 2048 - var12 << 1;
                    }
                } else {
                    var12 = class346.field5288[255 & var12 >> 4] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIZ)V")
    public static final void method2336(int arg0, int arg1, boolean arg2) {
        if (class486.field6833 == 1) {
            class401.method2404(arg0, 0, class340.field5102, arg1);
        } else if (~class486.field6833 == -3) {
            class150.method1020(arg0, (byte) -49, arg1);
        }
        ++field5684;
        if (!arg2) {
            field5690 = 71;
        }
        class340.field5102 = null;
        class486.field6833 = 0;
    }

    static {
        new class332("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
    }
}
