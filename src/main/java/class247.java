import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class247 extends class404 {

    @OriginalMember(owner = "client!oj", name = "K", descriptor = "I")
    private int field3783 = 0;

    @OriginalMember(owner = "client!oj", name = "N", descriptor = "[S")
    private short[] field3786 = new short[257];

    @OriginalMember(owner = "client!oj", name = "A", descriptor = "Z")
    public static boolean field3774 = false;

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "Lba;")
    public static class252 field3773 = new class252(14, 1);

    @OriginalMember(owner = "client!oj", name = "O", descriptor = "Lba;")
    public static class252 field3787 = new class252(15, 4);

    @OriginalMember(owner = "client!oj", name = "Q", descriptor = "Lba;")
    public static class252 field3789 = new class252(16, -2);

    @OriginalMember(owner = "client!oj", name = "R", descriptor = "Lba;")
    public static class252 field3790 = new class252(17, 0);

    @OriginalMember(owner = "client!oj", name = "S", descriptor = "Lba;")
    public static class252 field3791 = new class252(18, -2);

    @OriginalMember(owner = "client!oj", name = "T", descriptor = "Lba;")
    public static class252 field3792 = new class252(20, 6);

    @OriginalMember(owner = "client!oj", name = "U", descriptor = "Lba;")
    public static class252 field3793 = new class252(21, 8);

    @OriginalMember(owner = "client!oj", name = "V", descriptor = "Lba;")
    public static class252 field3794 = new class252(22, -2);

    @OriginalMember(owner = "client!oj", name = "W", descriptor = "Lba;")
    public static class252 field3795 = new class252(23, 4);

    @OriginalMember(owner = "client!oj", name = "X", descriptor = "Lba;")
    public static class252 field3796 = new class252(24, -1);

    @OriginalMember(owner = "client!oj", name = "Y", descriptor = "[Lba;")
    private static class252[] field3797 = new class252[32];

    @OriginalMember(owner = "client!oj", name = "Z", descriptor = "Loe;")
    public static class127 field3798;

    @OriginalMember(owner = "client!oj", name = "ab", descriptor = "Loe;")
    public static class127 field3799;

    @OriginalMember(owner = "client!oj", name = "B", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!oj", name = "C", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!oj", name = "E", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!oj", name = "F", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!oj", name = "H", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!oj", name = "I", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!oj", name = "L", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!oj", name = "M", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!oj", name = "bb", descriptor = "Lvh;")
    public static class232 field3800;

    @OriginalMember(owner = "client!oj", name = "J", descriptor = "[I")
    private int[] field3782;

    @OriginalMember(owner = "client!oj", name = "P", descriptor = "[I")
    private int[] field3788;

    @OriginalMember(owner = "client!oj", name = "G", descriptor = "[[I")
    private int[][] field3779;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZ)[I")
    private final int[] method1490(int arg0, boolean arg1) {
        ++field3780;
        if (~arg0 > -1) {
            return this.field3788;
        } else if (arg0 >= this.field3779.length) {
            return this.field3782;
        } else {
            if (!arg1) {
                field3774 = true;
            }
            return this.field3779[arg0];
        }
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(I)V")
    public final void method211(int arg0) {
        if (this.field3779 == null) {
            this.field3779 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field3778;
        if (this.field3779.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field3783 == arg0) {
                this.method1493(-32528);
            }
            class331.method2053(false);
            this.method1495((byte) 123);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILha;I)V")
    public final void method87(int arg0, class40 arg1, int arg2) {
        if (arg0 == arg2) {
            this.field3783 = arg1.method257((byte) 120);
            this.field3779 = new int[arg1.method257((byte) 94)][2];
            for (int var4 = 0; ~var4 > ~this.field3779.length; ++var4) {
                this.field3779[var4][0] = arg1.method254((byte) -76);
                this.field3779[var4][1] = arg1.method254((byte) -108);
            }
        }
        ++field3776;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V")
    public static void method1491(byte arg0) {
        field3794 = null;
        field3800 = null;
        field3789 = null;
        field3792 = null;
        field3799 = null;
        field3798 = null;
        field3797 = null;
        field3796 = null;
        field3791 = null;
        field3790 = null;
        field3793 = null;
        field3787 = null;
        field3795 = null;
        field3773 = null;
        if (arg0 <= 108) {
            method1492((byte) -67, (String) null);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field3781;
        int[] var3 = super.field5870.method372(arg1, (byte) -118);
        if (arg0 >= -47) {
            field3795 = null;
        }
        if (super.field5870.field810) {
            int[] var4 = this.method2394(0, (byte) 64, arg1);
            for (int var5 = 0; var5 < class431.field6348; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field3786[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BLjava/lang/String;)[B")
    public static final byte[] method1492(byte arg0, String arg1) {
        ++field3775;
        if (arg0 != -68) {
            return null;
        } else {
            int var2 = arg1.length();
            byte[] var3 = new byte[var2];
            for (int var4 = 0; ~var2 < ~var4; ++var4) {
                char var5 = arg1.charAt(var4);
                if (~var5 < -1 && ~var5 > -129 || var5 >= 160 && ~var5 >= -256) {
                    var3[var4] = (byte) var5;
                } else if (var5 != 8364) {
                    if (var5 == 8218) {
                        var3[var4] = -126;
                    } else if (var5 == 402) {
                        var3[var4] = -125;
                    } else if (var5 == 8222) {
                        var3[var4] = -124;
                    } else if (~var5 == -8231) {
                        var3[var4] = -123;
                    } else if (var5 == 8224) {
                        var3[var4] = -122;
                    } else if (~var5 != -8226) {
                        if (~var5 != -711) {
                            if (var5 != 8240) {
                                if (var5 != 352) {
                                    if (var5 == 8249) {
                                        var3[var4] = -117;
                                    } else if (var5 != 338) {
                                        if (var5 != 381) {
                                            if (~var5 == -8217) {
                                                var3[var4] = -111;
                                            } else if (var5 == 8217) {
                                                var3[var4] = -110;
                                            } else if (var5 != 8220) {
                                                if (var5 == 8221) {
                                                    var3[var4] = -108;
                                                } else if (~var5 != -8227) {
                                                    if (var5 != 8211) {
                                                        if (~var5 != -8213) {
                                                            if (~var5 == -733) {
                                                                var3[var4] = -104;
                                                            } else if (~var5 != -8483) {
                                                                if (var5 == 353) {
                                                                    var3[var4] = -102;
                                                                } else if (~var5 == -8251) {
                                                                    var3[var4] = -101;
                                                                } else if (~var5 != -340) {
                                                                    if (var5 != 382) {
                                                                        if (var5 == 376) {
                                                                            var3[var4] = -97;
                                                                        } else {
                                                                            var3[var4] = 63;
                                                                        }
                                                                    } else {
                                                                        var3[var4] = -98;
                                                                    }
                                                                } else {
                                                                    var3[var4] = -100;
                                                                }
                                                            } else {
                                                                var3[var4] = -103;
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
                                                var3[var4] = -109;
                                            }
                                        } else {
                                            var3[var4] = -114;
                                        }
                                    } else {
                                        var3[var4] = -116;
                                    }
                                } else {
                                    var3[var4] = -118;
                                }
                            } else {
                                var3[var4] = -119;
                            }
                        } else {
                            var3[var4] = -120;
                        }
                    } else {
                        var3[var4] = -121;
                    }
                } else {
                    var3[var4] = -128;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V")
    public class247() {
        super(1, true);
    }

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "(I)V")
    private final void method1493(int arg0) {
        if (arg0 != -32528) {
            this.method1490(110, true);
        }
        ++field3785;
        int[] var2 = this.field3779[0];
        int[] var3 = this.field3779[1];
        int[] var4 = this.field3779[this.field3779.length - 2];
        int[] var5 = this.field3779[this.field3779.length + -1];
        this.field3782 = new int[] { var4[0] - (var5[0] - var4[0]), var4[1] + -var5[1] + var4[1] };
        this.field3788 = new int[] { -var3[0] - (-var2[0] - var2[0]), var2[1] - -var2[1] + -var3[1] };
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(III)Z")
    public static final boolean method1494(int arg0, int arg1, int arg2) {
        ++field3784;
        int var3 = -108 % ((arg1 - 82) / 35);
        return ~(arg2 & 33) != -1;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)V")
    private final void method1495(byte arg0) {
        if (arg0 >= 93) {
            int var2 = this.field3783;
            if (~var2 != -3) {
                if (~var2 == -2) {
                    for (int var3 = 0; ~var3 > -258; ++var3) {
                        int var4 = var3 << 4;
                        int var5;
                        for (var5 = 1; var5 < this.field3779.length - 1 && this.field3779[var5][0] <= var4; ++var5) {
                        }
                        int[] var6 = this.field3779[var5 + -1];
                        int[] var7 = this.field3779[var5];
                        int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                        int var9 = 4096 - class251.field3841[var8 >> 5 & 255] >> 1;
                        int var10 = -var9 + 4096;
                        int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                        if (var11 <= -32768) {
                            var11 = -32767;
                        }
                        if (~var11 <= -32769) {
                            var11 = 32767;
                        }
                        this.field3786[var3] = (short) var11;
                    }
                } else {
                    for (int var12 = 0; ~var12 > -258; ++var12) {
                        int var13 = var12 << 4;
                        int var14;
                        for (var14 = 1; var14 < this.field3779.length - 1 && var13 >= this.field3779[var14][0]; ++var14) {
                        }
                        int[] var15 = this.field3779[var14 + -1];
                        int[] var16 = this.field3779[var14];
                        int var17 = (var13 - var15[0] << 12) / (var16[0] + -var15[0]);
                        int var18 = -var17 + 4096;
                        int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                        if (var19 <= -32768) {
                            var19 = -32767;
                        }
                        if (var19 >= 32768) {
                            var19 = 32767;
                        }
                        this.field3786[var12] = (short) var19;
                    }
                }
            } else {
                for (int var20 = 0; var20 < 257; ++var20) {
                    int var21 = var20 << 4;
                    int var22;
                    for (var22 = 1; ~(this.field3779.length + -1) < ~var22 && var21 >= this.field3779[var22][0]; ++var22) {
                    }
                    int[] var23 = this.field3779[var22 + -1];
                    int[] var24 = this.field3779[var22];
                    int var25 = this.method1490(var22 - 2, true)[1];
                    int var26 = var23[1];
                    int var27 = var24[1];
                    int var28 = this.method1490(var22 + 1, true)[1];
                    int var29 = (-var23[0] + var21 << 12) / (var24[0] - var23[0]);
                    int var30 = var29 * var29 >> 12;
                    int var31 = -var27 + var26 + var28 + -var25;
                    int var32 = -var26 + var25 - var31;
                    int var33 = -var25 + var27;
                    int var35 = (var29 * var31 >> 12) * var30 >> 12;
                    int var36 = var30 * var32 >> 12;
                    int var37 = var29 * var33 >> 12;
                    int var38 = var37 - -var26 + var35 + var36;
                    if (~var38 >= 32767) {
                        var38 = -32767;
                    }
                    if (~var38 <= -32769) {
                        var38 = 32767;
                    }
                    this.field3786[var20] = (short) var38;
                }
            }
            ++field3777;
        }
    }

    static {
        class252[] var0 = class496.method2986(540800);
        for (int var1 = 0; var0.length > var1; ++var1) {
            field3797[var0[var1].field3849] = var0[var1];
        }
        field3798 = new class127(45, 0);
        new class423("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
        field3799 = new class127(88, -1);
    }
}
