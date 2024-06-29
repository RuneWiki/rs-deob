import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class365 {

    @OriginalMember(owner = "client!hq", name = "k", descriptor = "I")
    public int field4683 = -1;

    @OriginalMember(owner = "client!hq", name = "p", descriptor = "Leo;")
    public static class321 field4688;

    @OriginalMember(owner = "client!hq", name = "r", descriptor = "Leo;")
    public static class321 field4690 = field4688 = new class321(false);

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!hq", name = "q", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!hq", name = "s", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!hq", name = "u", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "Lgca;")
    private class209 field4678;

    @OriginalMember(owner = "client!hq", name = "v", descriptor = "Ljava/lang/String;")
    private String field4694;

    @OriginalMember(owner = "client!hq", name = "z", descriptor = "Ljava/lang/String;")
    private String field4698;

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "[I")
    private int[] field4674;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "[I")
    private int[] field4677;

    @OriginalMember(owner = "client!hq", name = "i", descriptor = "[I")
    private int[] field4681;

    @OriginalMember(owner = "client!hq", name = "j", descriptor = "[I")
    private int[] field4682;

    @OriginalMember(owner = "client!hq", name = "l", descriptor = "[I")
    private int[] field4684;

    @OriginalMember(owner = "client!hq", name = "n", descriptor = "[I")
    private int[] field4686;

    @OriginalMember(owner = "client!hq", name = "o", descriptor = "[I")
    private int[] field4687;

    @OriginalMember(owner = "client!hq", name = "y", descriptor = "[I")
    private int[] field4697;

    @OriginalMember(owner = "client!hq", name = "g", descriptor = "[Ljava/lang/String;")
    private String[] field4679;

    @OriginalMember(owner = "client!hq", name = "m", descriptor = "[Ljava/lang/String;")
    private String[] field4685;

    @OriginalMember(owner = "client!hq", name = "t", descriptor = "[[I")
    private int[][] field4692;

    @OriginalMember(owner = "client!hq", name = "w", descriptor = "[[I")
    private int[][] field4695;

    @OriginalMember(owner = "client!hq", name = "x", descriptor = "[[I")
    private int[][] field4696;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V", line = 5)
    public static void method2047(int arg0) {
        field4688 = null;
        field4690 = null;
        if (arg0 != 1) {
            field4690 = null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(BILwu;Lwu;)V", line = 16)
    public static final void method2048(byte arg0, int arg1, class557 arg2, class557 arg3) {
        class210.field2987 = arg3;
        field4676++;
        class295.field3840 = arg2;
        if (arg0 > -60) {
            method2047(59);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(BLvj;)V", line = 31)
    public final void method2049(byte arg0, class26 arg1) {
        if (arg0 != -98) {
            return;
        }
        while (true) {
            int var3 = arg1.method194((byte) 119);
            if (var3 == 0) {
                field4693++;
                return;
            }
            this.method2051(-101, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)V", line = 63)
    public final void method2050(int arg0) {
        if (arg0 == 2) {
            if (this.field4698 == null) {
                this.field4698 = this.field4694;
            }
            field4689++;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILvj;I)V", line = 77)
    private final void method2051(int arg0, class26 arg1, int arg2) {
        if (arg0 > -92) {
            this.method2050(22);
        }
        field4691++;
        if (arg2 == 1) {
            this.field4694 = arg1.method166((byte) -125);
        } else if (arg2 == 2) {
            this.field4698 = arg1.method166((byte) -125);
        } else if (arg2 == 3) {
            int var4 = arg1.method194((byte) 119);
            this.field4692 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4692[var5][0] = arg1.method193(2);
                this.field4692[var5][1] = arg1.method189(255);
                this.field4692[var5][2] = arg1.method189(255);
            }
        } else if (arg2 == 4) {
            int var6 = arg1.method194((byte) 119);
            this.field4695 = new int[var6][3];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4695[var7][0] = arg1.method193(2);
                this.field4695[var7][1] = arg1.method189(255);
                this.field4695[var7][2] = arg1.method189(255);
            }
        } else if (arg2 == 5) {
            arg1.method193(2);
        } else if (arg2 == 6) {
            arg1.method194((byte) 119);
        } else if (arg2 == 7) {
            arg1.method194((byte) 119);
            return;
        } else if (arg2 != 8) {
            if (arg2 == 9) {
                arg1.method194((byte) 119);
                return;
            }
            if (arg2 == 10) {
                int var8 = arg1.method194((byte) 119);
                this.field4674 = new int[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field4674[var9] = arg1.method189(255);
                }
                return;
            }
            if (arg2 == 12) {
                arg1.method189(255);
                return;
            }
            if (arg2 == 13) {
                int var10 = arg1.method194((byte) 119);
                this.field4682 = new int[var10];
                for (int var11 = 0; var11 < var10; var11++) {
                    this.field4682[var11] = arg1.method193(2);
                }
                return;
            }
            if (arg2 != 14) {
                if (arg2 == 15) {
                    arg1.method193(2);
                    return;
                }
                if (arg2 == 17) {
                    this.field4683 = arg1.method193(2);
                    return;
                }
                if (arg2 == 18) {
                    int var12 = arg1.method194((byte) 119);
                    this.field4697 = new int[var12];
                    this.field4679 = new String[var12];
                    this.field4677 = new int[var12];
                    this.field4687 = new int[var12];
                    for (int var13 = 0; var13 < var12; var13++) {
                        this.field4697[var13] = arg1.method189(255);
                        this.field4677[var13] = arg1.method189(255);
                        this.field4687[var13] = arg1.method189(255);
                        this.field4679[var13] = arg1.method196((byte) -92);
                    }
                    return;
                }
                if (arg2 == 19) {
                    int var20 = arg1.method194((byte) 119);
                    this.field4686 = new int[var20];
                    this.field4681 = new int[var20];
                    this.field4684 = new int[var20];
                    this.field4685 = new String[var20];
                    for (int var21 = 0; var21 < var20; var21++) {
                        this.field4684[var21] = arg1.method189(255);
                        this.field4686[var21] = arg1.method189(255);
                        this.field4681[var21] = arg1.method189(255);
                        this.field4685[var21] = arg1.method196((byte) -92);
                    }
                } else if (arg2 == 249) {
                    int var14 = arg1.method194((byte) 119);
                    if (this.field4678 == null) {
                        int var15 = class670.method3834(var14, 23538);
                        this.field4678 = new class209(var15);
                    }
                    for (int var16 = 0; var16 < var14; var16++) {
                        boolean var17 = arg1.method194((byte) 119) == 1;
                        int var18 = arg1.method186((byte) 94);
                        class513 var19;
                        if (var17) {
                            var19 = new class407(arg1.method196((byte) -92));
                        } else {
                            var19 = new class285(arg1.method189(255));
                        }
                        this.field4678.method1387(var19, (long) var18, (byte) -125);
                    }
                    return;
                }
                return;
            }
            int var22 = arg1.method194((byte) 119);
            this.field4696 = new int[var22][2];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field4696[var23][0] = arg1.method194((byte) 119);
                this.field4696[var23][1] = arg1.method194((byte) 119);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILjk;IILha;Lgfa;)Z", line = 354)
    public static final boolean method2052(int arg0, class185 arg1, int arg2, int arg3, class545 arg4, class753 arg5) {
        field4680++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg1.field2703 != null) {
            var7 = (arg1.field2683 + arg5.field10465 - class531.field7460) * (class531.field7453 - class531.field7448) / (class531.field7441 - class531.field7460) + class531.field7448;
            var6 = (class531.field7453 - class531.field7448) * (arg5.field10465 + arg1.field2720 - class531.field7460) / (class531.field7441 - class531.field7460) + class531.field7448;
            var9 = class531.field7461 - ((arg1.field2708 + arg5.field10456 - class531.field7445) * (class531.field7461 - class531.field7446) / (class531.field7443 - class531.field7445));
            var8 = class531.field7461 - ((arg1.field2701 + arg5.field10456 - class531.field7445) * (class531.field7461 - class531.field7446) / (class531.field7443 - class531.field7445));
        }
        class21 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg1.field2696 != -1) {
            if (arg5.field10457 && arg1.field2707 != -1) {
                var10 = arg1.method1236(true, arg4, true);
            } else {
                var10 = arg1.method1236(false, arg4, true);
            }
            if (var10 != null) {
                var11 = arg5.field10455 - (var10.method116() + 1 >> 1);
                if (var11 < var6) {
                    var6 = var11;
                }
                var12 = arg5.field10455 + (var10.method116() + 1 >> 1);
                var13 = arg5.field10458 - (var10.method108() + 1 >> 1);
                if (var7 < var12) {
                    var7 = var12;
                }
                var14 = arg5.field10458 + (var10.method108() + 1 >> 1);
                if (var8 > var13) {
                    var8 = var13;
                }
                if (var14 > var9) {
                    var9 = var14;
                }
            }
        }
        class443 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        if (arg1.field2710 != null) {
            var15 = class305.method1786(arg1.field2712, (byte) -118);
            if (var15 != null) {
                var16 = class608.field8657.method4141(arg1.field2710, arg2 - 24276, class261.field3563, null, null);
                var17 = (class531.field7453 - class531.field7448) * arg1.field2717 / (class531.field7441 - class531.field7460) + arg5.field10455;
                int var24 = arg5.field10458 - ((class531.field7461 - class531.field7446) * arg1.field2699 / (class531.field7443 - class531.field7445));
                if (var10 == null) {
                    var18 = var24 - var15.method2645() * var16 / 2;
                } else {
                    var18 = var24 - ((var10.method108() >> 1) + var15.method2651() * var16);
                }
                for (int var25 = 0; var25 < var16; var25++) {
                    String var26 = class261.field3563[var25];
                    if ((var16 - 1) > var25) {
                        var26 = var26.substring(0, var26.length() - 4);
                    }
                    int var27 = var15.method2648(var26);
                    if (var27 > var19) {
                        var19 = var27;
                    }
                }
                var20 = arg0 + var17 - var19 / 2;
                var21 = var19 / 2 + arg0 + var17;
                if (var20 < var6) {
                    var6 = var20;
                }
                var22 = arg3 + var18;
                if (var21 > var7) {
                    var7 = var21;
                }
                var23 = var18 + (var16 * var15.method2651()) + arg3;
                if (var8 > var22) {
                    var8 = var22;
                }
                if (var9 < var23) {
                    var9 = var23;
                }
            }
        }
        if (class531.field7448 > var7 || class531.field7453 < var6 || var9 < class531.field7446 || class531.field7461 < var8) {
            return true;
        }
        if (arg2 != 24172) {
            field4675 = 24;
        }
        class531.method3164(arg4, arg5, arg1);
        if (var10 != null) {
            if (class536.field7505 > 0 && (class387.field5412 != -1 && class387.field5412 == arg5.field10459 || class507.field7075 != -1 && class507.field7075 == arg1.field2693)) {
                int var28;
                if (class137.field1830 > 50) {
                    var28 = (100 - class137.field1830) * 2;
                } else {
                    var28 = class137.field1830 * 2;
                }
                int var29 = var28 << 24 | 0xFFFF00;
                arg4.method3256(var10.method115() / 2 + 7, var29, arg5.field10458, arg5.field10455, (byte) -66);
                arg4.method3256(var10.method115() / 2 + 5, var29, arg5.field10458, arg5.field10455, (byte) -95);
                arg4.method3256(var10.method115() / 2 + 3, var29, arg5.field10458, arg5.field10455, (byte) -93);
                arg4.method3256(var10.method115() / 2 + 1, var29, arg5.field10458, arg5.field10455, (byte) -73);
                arg4.method3256(var10.method115() / 2, var29, arg5.field10458, arg5.field10455, (byte) 76);
            }
            var10.method101(arg5.field10455 - (var10.method116() >> 1), arg5.field10458 - (var10.method108() >> 1));
        }
        if (arg1.field2710 != null && var15 != null) {
            class465.method2775(var17, arg5, var19, arg1, var16, var18, var15, 10, arg4);
        }
        if (arg1.field2696 != -1 || arg1.field2710 != null) {
            class620 var30 = new class620(arg5);
            var30.field8834 = var12;
            var30.field8830 = var23;
            var30.field8833 = var13;
            var30.field8826 = var22;
            var30.field8825 = var11;
            var30.field8832 = var21;
            var30.field8835 = var20;
            var30.field8827 = var14;
            class19.field235.method3116(29066, var30);
        }
        return false;
    }
}
