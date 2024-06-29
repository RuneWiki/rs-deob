import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class509 extends class278 {

    @OriginalMember(owner = "client!cp", name = "M", descriptor = "Ltk;")
    public static class228 field7469 = new class228(15, 0, 1, 0);

    @OriginalMember(owner = "client!cp", name = "N", descriptor = "I")
    public static int field7470 = 0;

    @OriginalMember(owner = "client!cp", name = "Q", descriptor = "I")
    public static int field7473 = -1;

    @OriginalMember(owner = "client!cp", name = "I", descriptor = "I")
    public static int field7466;

    @OriginalMember(owner = "client!cp", name = "K", descriptor = "I")
    public static int field7467;

    @OriginalMember(owner = "client!cp", name = "L", descriptor = "I")
    public static int field7468;

    @OriginalMember(owner = "client!cp", name = "O", descriptor = "I")
    public static int field7471;

    @OriginalMember(owner = "client!cp", name = "P", descriptor = "I")
    public static int field7472;

    static {
        new class83(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(II)[I", line = 3)
    public final int[] method208(int arg0, int arg1) {
        ++field7468;
        int[] var3 = super.field3750.method256(arg1, -30359);
        if (super.field3750.field554) {
            int[] var4 = this.method1570(0, 0, arg1);
            for (int var5 = 0; var5 < class507.field7456; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return arg0 != -9 ? null : var3;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(CB)B", line = 36)
    public static final byte method2990(char arg0, byte arg1) {
        int var2 = -112 % ((arg1 - -85) / 37);
        ++field7471;
        byte var3;
        if ((arg0 <= 0 || ~arg0 <= -129) && (~arg0 > -161 || arg0 > 255)) {
            if (arg0 != 8364) {
                if (~arg0 == -8219) {
                    var3 = -126;
                } else if (arg0 == 402) {
                    var3 = -125;
                } else if (arg0 != 8222) {
                    if (arg0 != 8230) {
                        if (~arg0 == -8225) {
                            var3 = -122;
                        } else if (~arg0 != -8226) {
                            if (arg0 == 710) {
                                var3 = -120;
                            } else if (~arg0 != -8241) {
                                if (~arg0 == -353) {
                                    var3 = -118;
                                } else if (arg0 != 8249) {
                                    if (~arg0 == -339) {
                                        var3 = -116;
                                    } else if (arg0 != 381) {
                                        if (arg0 != 8216) {
                                            if (~arg0 != -8218) {
                                                if (arg0 == 8220) {
                                                    var3 = -109;
                                                } else if (~arg0 == -8222) {
                                                    var3 = -108;
                                                } else if (arg0 != 8226) {
                                                    if (~arg0 == -8212) {
                                                        var3 = -106;
                                                    } else if (~arg0 == -8213) {
                                                        var3 = -105;
                                                    } else if (~arg0 != -733) {
                                                        if (arg0 == 8482) {
                                                            var3 = -103;
                                                        } else if (arg0 == 353) {
                                                            var3 = -102;
                                                        } else if (arg0 == 8250) {
                                                            var3 = -101;
                                                        } else if (arg0 != 339) {
                                                            if (arg0 != 382) {
                                                                if (arg0 == 376) {
                                                                    var3 = -97;
                                                                } else {
                                                                    var3 = 63;
                                                                }
                                                            } else {
                                                                var3 = -98;
                                                            }
                                                        } else {
                                                            var3 = -100;
                                                        }
                                                    } else {
                                                        var3 = -104;
                                                    }
                                                } else {
                                                    var3 = -107;
                                                }
                                            } else {
                                                var3 = -110;
                                            }
                                        } else {
                                            var3 = -111;
                                        }
                                    } else {
                                        var3 = -114;
                                    }
                                } else {
                                    var3 = -117;
                                }
                            } else {
                                var3 = -119;
                            }
                        } else {
                            var3 = -121;
                        }
                    } else {
                        var3 = -123;
                    }
                } else {
                    var3 = -124;
                }
            } else {
                var3 = -128;
            }
        } else {
            var3 = (byte) arg0;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cp", name = "g", descriptor = "(I)V", line = 168)
    public static void method2991(int arg0) {
        field7469 = null;
        if (arg0 != -2) {
            method2991(-127);
        }
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V", line = 178)
    public class509() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILlh;)Lwc;", line = 181)
    public static final class47 method2992(int arg0, class365 arg1) {
        ++field7467;
        if (arg0 != -3003) {
            method2992(-85, (class365) null);
        }
        return new class47(arg1.method2069(arg0 + 2881), arg1.method2069(-123), arg1.method2069(arg0 ^ 3008), arg1.method2069(arg0 + 2878), arg1.method2111(-2), arg1.method2111(arg0 + 3001), arg1.method2099(255));
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)[[I", line = 194)
    public final int[][] method324(int arg0, int arg1) {
        ++field7472;
        int[][] var3 = super.field3757.method1450(arg1, -1);
        if (arg0 < 75) {
            method2991(-122);
        }
        if (super.field3757.field3420) {
            int[][] var4 = this.method1568(5426, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class507.field7456; ++var11) {
                var8[var11] = 4096 - var5[var11];
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Llh;II)V", line = 241)
    public final void method210(class365 arg0, int arg1, int arg2) {
        ++field7466;
        if (arg1 == -30446) {
            if (~arg2 == -1) {
                super.field3754 = ~arg0.method2099(255) == -2;
            }
        }
    }
}
