import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class290 extends class390 {

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "[Llc;")
    public class387[] field4066;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "[S")
    public short[] field4065;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "[Lvj;")
    public class256[] field4064;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "[B")
    public byte[] field4062;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "[I")
    private int[] field4068;

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "[B")
    public byte[] field4069;

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "[B")
    public byte[] field4072;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
    public int field4059;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public static int field4058 = 0;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "[I")
    public static int[] field4056 = new int[100];

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    public static int field4061 = 104;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!pi", name = "A", descriptor = "Lse;")
    public static class139 field4073;

    @OriginalMember(owner = "client!pi", name = "C", descriptor = "Z")
    public static boolean field4075;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!pi", name = "B", descriptor = "[[[B")
    public static byte[][][] field4074;

    static {
        new class442("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
        field4070 = 0;
        field4073 = new class139(0, -1);
        field4075 = false;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V", line = 7)
    public static final void method1878(int arg0) {
        field4060++;
        if (class41.field603) {
            return;
        }
        if (arg0 != -2) {
            field4074 = null;
        }
        class128.field1806 = true;
        if (class133.field1916) {
            class24.field416 = (float) ((int) class24.field416 - 17 & 0xFFFFFFF0);
        } else {
            class51.field721 += (-class51.field721 - 12.0F) / 2.0F;
        }
        class41.field603 = true;
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)V", line = 38)
    public static void method1879(int arg0) {
        field4074 = null;
        if (arg0 > -69) {
            method1879(107);
        }
        field4073 = null;
        field4056 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "([BILni;[I)Z", line = 63)
    public final boolean method1880(byte[] arg0, int arg1, class305 arg2, int[] arg3) {
        field4067++;
        boolean var5 = true;
        if (arg1 != -2749) {
            field4063 = 116;
        }
        int var6 = 0;
        class256 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field4068[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method1968(var9 >> 2, arg3, -1);
                        } else {
                            var7 = arg2.method1971(arg1 ^ 0xFFFFF53C, arg3, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field4064[var8] = var7;
                        this.field4068[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "(I)V", line = 124)
    public final void method1881(int arg0) {
        field4057++;
        if (arg0 != 0) {
            method1879(-44);
        }
        this.field4068 = null;
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V", line = 150)
    public class290() {
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "([B)V", line = 153)
    public class290(byte[] arg0) {
        this.field4066 = new class387[128];
        this.field4065 = new short[128];
        this.field4064 = new class256[128];
        this.field4062 = new byte[128];
        this.field4068 = new int[128];
        this.field4069 = new byte[128];
        this.field4072 = new byte[128];
        class11 var2 = new class11(arg0);
        int var3;
        for (var3 = 0; var2.field230[var2.field191 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method162(-4436);
        }
        var3++;
        var2.field191++;
        int var6 = var2.field191;
        var2.field191 += var3;
        int var7;
        for (var7 = 0; var2.field230[var2.field191 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method162(-4436);
        }
        var7++;
        var2.field191++;
        int var10 = var2.field191;
        var2.field191 += var7;
        int var11;
        for (var11 = 0; var2.field230[var2.field191 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method162(-4436);
        }
        var2.field191++;
        var11++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            var14[1] = 1;
            int var15 = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method172((byte) 52);
                if (var18 == 0) {
                    var15 = var16++;
                } else {
                    if (var18 <= var15) {
                        var18--;
                    }
                    var15 = var18;
                }
                var14[var17] = (byte) var15;
            }
        } else {
            var16 = var11;
        }
        class387[] var19 = new class387[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class387 var103 = var19[var20] = new class387();
            int var104 = var2.method172((byte) 52);
            if (var104 > 0) {
                var103.field5562 = new byte[var104 * 2];
            }
            int var105 = var2.method172((byte) 52);
            if (var105 > 0) {
                var103.field5555 = new byte[var105 * 2 + 2];
                var103.field5555[1] = 64;
            }
        }
        int var21 = var2.method172((byte) 52);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = var2.method172((byte) 52);
        byte[] var24 = var23 > 0 ? new byte[var23 * 2] : null;
        int var25;
        for (var25 = 0; var2.field230[var2.field191 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method162(-4436);
        }
        var2.field191++;
        var25++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method172((byte) 52);
            this.field4065[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method172((byte) 52);
            this.field4065[var31] = (short) (this.field4065[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var33 >= var26.length) {
                    var32 = -1;
                } else {
                    var32 = var26[var33++];
                }
                var34 = var2.method193(-1);
            }
            this.field4065[var35] = (short) (this.field4065[var35] + class387.method2454(32768, var34 - 1 << 14));
            this.field4068[var35] = var34;
            var32--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field4068[var39] != 0) {
                if (var36 == 0) {
                    var38 = var2.field230[var6++] - 1;
                    if (var37 >= var4.length) {
                        var36 = -1;
                    } else {
                        var36 = var4[var37++];
                    }
                }
                var36--;
                this.field4072[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field4068[var43] != 0) {
                if (var41 == 0) {
                    if (var40 < var8.length) {
                        var41 = var8[var40++];
                    } else {
                        var41 = -1;
                    }
                    var42 = var2.field230[var10++] + 16 << 2;
                }
                this.field4069[var43] = (byte) var42;
                var41--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class387 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field4068[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var44 < var12.length) {
                        var45 = var12[var44++];
                    } else {
                        var45 = -1;
                    }
                }
                this.field4066[var47] = var46;
                var45--;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var49 == 0) {
                if (var48 >= var26.length) {
                    var49 = -1;
                } else {
                    var49 = var26[var48++];
                }
                if (this.field4068[var51] > 0) {
                    var50 = var2.method172((byte) 52) + 1;
                }
            }
            this.field4062[var51] = (byte) var50;
            var49--;
        }
        this.field4059 = var2.method172((byte) 52) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class387 var100 = var19[var52];
            if (var100.field5562 != null) {
                for (int var101 = 1; var101 < var100.field5562.length; var101 += 2) {
                    var100.field5562[var101] = var2.method162(-4436);
                }
            }
            if (var100.field5555 != null) {
                for (int var102 = 3; var102 < (var100.field5555.length - 2); var102 += 2) {
                    var100.field5555[var102] = var2.method162(-4436);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method162(-4436);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method162(-4436);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class387 var97 = var19[var55];
            if (var97.field5555 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field5555.length; var99 += 2) {
                    var98 = var2.method172((byte) 52) + var98 + 1;
                    var97.field5555[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class387 var94 = var19[var56];
            if (var94.field5562 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field5562.length; var96 += 2) {
                    var95 = var95 + var2.method172((byte) 52) + 1;
                    var94.field5562[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method172((byte) 52);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 += var2.method172((byte) 52) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field4062[var61] = (byte) (this.field4062[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var62 < var22.length) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class243.method1646(var65 - var59, var67, (byte) -88);
                    var67 += var66 - var60;
                    this.field4062[var68] = (byte) (this.field4062[var68] * var69 + 32 >> 6);
                }
                var60 = var66;
                var62 += 2;
                var59 = var65;
            }
            Object var63 = null;
            for (int var64 = var59; var64 < 128; var64++) {
                this.field4062[var64] = (byte) (this.field4062[var64] * var60 + 32 >> 6);
            }
        }
        if (var24 != null) {
            int var70 = var2.method172((byte) 52);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = var70 + var2.method172((byte) 52) + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field4069[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field4069[var74] = (byte) var85;
            }
            for (int var75 = 2; var75 < var24.length; var75 += 2) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class243.method1646(var79 - var72, var81, (byte) -88);
                    int var84 = (this.field4069[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    var81 += var80 - var73;
                    this.field4069[var82] = (byte) var84;
                }
                var73 = var80;
                var72 = var79;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field4069[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field4069[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field5556 = var2.method172((byte) 52);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class387 var93 = var19[var87];
            if (var93.field5562 != null) {
                var93.field5565 = var2.method172((byte) 52);
            }
            if (var93.field5555 != null) {
                var93.field5559 = var2.method172((byte) 52);
            }
            if (var93.field5556 > 0) {
                var93.field5553 = var2.method172((byte) 52);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field5558 = var2.method172((byte) 52);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class387 var92 = var19[var89];
            if (var92.field5558 > 0) {
                var92.field5563 = var2.method172((byte) 52);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class387 var91 = var19[var90];
            if (var91.field5563 > 0) {
                var91.field5568 = var2.method172((byte) 52);
            }
        }
    }
}
