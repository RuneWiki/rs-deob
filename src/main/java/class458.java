import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class458 {

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
    private int field6797 = -1;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "Z")
    public boolean field6781 = true;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    private int field6795;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    private int field6782;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "Ldr;")
    private class509 field6788;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "Lda;")
    private class44 field6787;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    private int field6791;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "Laf;")
    private class302 field6794;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "Lbi;")
    private class338 field6796;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "Lsq;")
    private class120 field6784;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "[Lei;")
    public static class119[] field6785 = new class119[14];

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
    public static int field6799 = 0;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "Lje;")
    public static class278 field6790 = new class278(15, 0, 1, 0);

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "Lbj;")
    public static class162 field6801 = new class162(17, 16);

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    public static int field6802;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field6786;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public static int field6789;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public static int field6792;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public static int field6793;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
    public static int field6798;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "I")
    public static int field6800;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "Lph;")
    public static class459 field6783;

    static {
        new class309("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
        field6802 = 503;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V", line = 12)
    public final void method2726(boolean arg0) {
        field6800++;
        if (arg0) {
            method2730(-87);
        }
        this.method2729(this.field6791, this.field6794, 4);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V", line = 30)
    private final void method2727(int arg0) {
        field6798++;
        if (!this.field6781) {
            return;
        }
        this.field6781 = false;
        byte[] var2 = this.field6788.field7405;
        byte[] var3 = this.field6787.field950;
        int var4 = 0;
        int var5 = this.field6788.field7412;
        int var6 = this.field6782 + (this.field6788.field7412 * this.field6795);
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field6784 != null && this.field6797 == var4) {
            this.field6781 = false;
            return;
        }
        this.field6797 = var4;
        if (arg0 != 3) {
            return;
        }
        int var8 = this.field6795 * var5 + this.field6782;
        int var9 = 0;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var8] == 0) {
                    int var12 = 0;
                    if (var2[var8 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var5 + var8] != 0) {
                        var12++;
                    }
                    var3[var9++] = (byte) (var12 * 17);
                } else {
                    var3[var9++] = 68;
                }
                var8++;
            }
            var8 += this.field6788.field7412 - 128;
        }
        if (this.field6784 == null) {
            this.field6784 = new class120(this.field6787, 3553, 6406, 128, 128, false, this.field6787.field950, 6406, false);
            this.field6784.method967(8276, false, false);
            this.field6784.method2346(3, true);
        } else {
            this.field6784.method969(128, 0, false, 0, 2, 6406, 128, this.field6787.field950, 0, 0);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IBI[B)V", line = 138)
    public final void method2728(int arg0, byte arg1, int arg2, byte[] arg3) {
        if (arg1 != 60) {
            field6801 = null;
        }
        this.field6796.method1902(arg3, arg2 * this.field6787.method308(arg1 + 67, arg0), -24568, arg0);
        field6786++;
        this.method2729(arg2, this.field6796, 4);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILaf;I)V", line = 151)
    private final void method2729(int arg0, class302 arg1, int arg2) {
        field6789++;
        if (arg0 == 0) {
            return;
        }
        this.method2727(arg2 ^ 0x7);
        this.field6787.method381((byte) 28, this.field6784);
        if (arg2 != 4) {
            this.method2727(115);
        }
        this.field6787.method370(arg0, 4, -109, 0, arg1);
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V", line = 169)
    public static void method2730(int arg0) {
        field6801 = null;
        field6790 = null;
        if (arg0 != -32010) {
            field6785 = null;
        }
        field6785 = null;
        field6783 = null;
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lda;Ldr;Lwv;IIIII)V", line = 320)
    public class458(class44 arg0, class509 arg1, class26 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field6795 = arg7;
        this.field6782 = arg6;
        this.field6788 = arg1;
        this.field6787 = arg0;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field551 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field395[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field6791 = var10;
        if (var10 <= 0) {
            this.field6784 = null;
        } else {
            class289 var14 = new class289(var10 * 2);
            if (this.field6787.field924) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field551 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field395[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method1865(var23[var24] & 0xFFFF, 812856296);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field551 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field395[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method1852(-92, var18[var19] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field6794 = this.field6787.method406(var14.field4399, -96, false, 5123, var14.field4408);
            this.field6796 = new class338(this.field6787, 5123, null, 1);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIII)V", line = 197)
    public static final void method2731(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class358 var5 = (class358) class378.field5531.method1892(118); var5 != null; var5 = (class358) class378.field5531.method1893((byte) -2)) {
            class433.method2603((byte) 75, arg4, arg3, var5, arg1, arg2);
        }
        field6792++;
        for (class358 var6 = (class358) class492.field7212.method1892(119); var6 != null; var6 = (class358) class492.field7212.method1893((byte) -2)) {
            byte var12 = 1;
            class166 var13 = var6.field5253.method3169((byte) 23);
            if (var6.field5253.field7781) {
                var12 = 0;
            } else if (var6.field5253.field7800 == var13.field2684 || var6.field5253.field7800 == var13.field2671 || var6.field5253.field7800 == var13.field2644 || var6.field5253.field7800 == var13.field2677) {
                var12 = 2;
            } else if (var6.field5253.field7800 == var13.field2681 || var6.field5253.field7800 == var13.field2659 || var6.field5253.field7800 == var13.field2663 || var6.field5253.field7800 == var13.field2640) {
                var12 = 3;
            }
            if (var6.field5254 != var12) {
                int var14 = class405.method2518(var6.field5253, -5662);
                if (var6.field5256 != var14) {
                    if (var6.field5248 != null) {
                        class288.field4357.method2157(var6.field5248);
                        var6.field5248 = null;
                    }
                    var6.field5256 = var14;
                }
                var6.field5254 = var12;
            }
            var6.field5262 = var6.field5253.field6073;
            var6.field5250 = var6.field5253.field6073 + (var6.field5253.method2241(-104) << 6);
            var6.field5267 = var6.field5253.field6078;
            var6.field5255 = var6.field5253.field6078 + (var6.field5253.method2241(-107) << 6);
            class433.method2603((byte) -104, arg4, arg3, var6, arg1, arg2);
        }
        class358 var7 = (class358) class407.field6167.method1615(0);
        int var8 = 80 / ((arg0 + 61) / 63);
        while (var7 != null) {
            byte var9 = 1;
            class166 var10 = var7.field5263.method3169((byte) 23);
            if (var7.field5263.field7781) {
                var9 = 0;
            } else if (var7.field5263.field7800 == var10.field2684 || var7.field5263.field7800 == var10.field2671 || var7.field5263.field7800 == var10.field2644 || var7.field5263.field7800 == var10.field2677) {
                var9 = 2;
            } else if (var7.field5263.field7800 == var10.field2681 || var7.field5263.field7800 == var10.field2659 || var7.field5263.field7800 == var10.field2663 || var7.field5263.field7800 == var10.field2640) {
                var9 = 3;
            }
            if (var7.field5254 != var9) {
                int var11 = class268.method1705((byte) -82, var7.field5263);
                if (var7.field5256 != var11) {
                    if (var7.field5248 != null) {
                        class288.field4357.method2157(var7.field5248);
                        var7.field5248 = null;
                    }
                    var7.field5256 = var11;
                }
                var7.field5254 = var9;
            }
            var7.field5262 = var7.field5263.field6073;
            var7.field5250 = var7.field5263.field6073 + (var7.field5263.method2241(-108) << 6);
            var7.field5267 = var7.field5263.field6078;
            var7.field5255 = var7.field5263.field6078 + (var7.field5263.method2241(-124) << 6);
            class433.method2603((byte) 90, arg4, arg3, var7, arg1, arg2);
            var7 = (class358) class407.field6167.method1621((byte) -55);
        }
    }
}
