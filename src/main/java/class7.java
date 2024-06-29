import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class7 extends class219 {

    @OriginalMember(owner = "client!vg", name = "K", descriptor = "I")
    public int field60 = 1638;

    @OriginalMember(owner = "client!vg", name = "W", descriptor = "I")
    public int field70 = 4;

    @OriginalMember(owner = "client!vg", name = "Z", descriptor = "I")
    public int field73 = 4;

    @OriginalMember(owner = "client!vg", name = "M", descriptor = "I")
    public int field62 = 4;

    @OriginalMember(owner = "client!vg", name = "ib", descriptor = "Z")
    public boolean field82 = true;

    @OriginalMember(owner = "client!vg", name = "O", descriptor = "I")
    public int field64 = 0;

    @OriginalMember(owner = "client!vg", name = "jb", descriptor = "[B")
    private byte[] field83 = new byte[512];

    @OriginalMember(owner = "client!vg", name = "U", descriptor = "Lbd;")
    public static class162 field69 = class17.method142(0, "Starte 3D)2Softwarebibliothek)3");

    @OriginalMember(owner = "client!vg", name = "J", descriptor = "Lbd;")
    public static class162 field59 = class17.method142(0, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!vg", name = "X", descriptor = "S")
    public static short field71 = 256;

    @OriginalMember(owner = "client!vg", name = "N", descriptor = "[I")
    public static int[] field63 = new int[5];

    @OriginalMember(owner = "client!vg", name = "db", descriptor = "Lbd;")
    public static class162 field77 = class17.method142(0, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!vg", name = "L", descriptor = "Z")
    public static boolean field61 = false;

    @OriginalMember(owner = "client!vg", name = "Q", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!vg", name = "R", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!vg", name = "S", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!vg", name = "ab", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!vg", name = "bb", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!vg", name = "cb", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!vg", name = "fb", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!vg", name = "gb", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!vg", name = "hb", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!vg", name = "kb", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!vg", name = "Y", descriptor = "Lwf;")
    public static class215 field72;

    @OriginalMember(owner = "client!vg", name = "P", descriptor = "[S")
    private short[] field65;

    @OriginalMember(owner = "client!vg", name = "eb", descriptor = "[S")
    private short[] field78;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(I)V", line = 6)
    public static void method35(int arg0) {
        field63 = null;
        field72 = null;
        field69 = null;
        if (arg0 != -15457) {
            field61 = true;
        }
        field59 = null;
        field77 = null;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(IIIIIII)I", line = 22)
    private final int method36(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field68++;
        int var8 = arg4 - 4096;
        int var9 = arg2 >> 12;
        int var10 = arg2 & 0xFFF;
        int var11 = class167.field2939[var10];
        int var12 = var10 - 4096;
        int var13 = var9 + 1;
        if (var13 >= arg6) {
            var13 = 0;
        }
        int var14 = var13 & 0xFF;
        int var15 = var9 & 0xFF;
        int var16 = this.field83[arg1 + var15] & 0x3;
        int var17;
        if (var16 <= 1) {
            var17 = var16 == 0 ? arg4 + var10 : arg4 - var10;
        } else {
            var17 = var16 == 2 ? var10 - arg4 : -arg4 + -var10;
        }
        int var18 = this.field83[arg1 + var14] & 0x3;
        int var19;
        if (var18 <= 1) {
            var19 = var18 == 0 ? arg4 + var12 : -var12 + arg4;
        } else {
            var19 = var18 == 2 ? var12 - arg4 : -arg4 + -var12;
        }
        int var20 = this.field83[arg0 + var15] & 0x3;
        if (arg3 != 1530718956) {
            this.method42(24, 66, (class94) null);
        }
        int var21 = ((var19 - var17) * var11 >> 12) + var17;
        int var22;
        if (var20 <= 1) {
            var22 = var20 == 0 ? var8 + var10 : var8 - var10;
        } else {
            var22 = var20 == 2 ? var10 - var8 : -var10 - var8;
        }
        int var23 = this.field83[var14 + arg0] & 0x3;
        int var24;
        if (var23 > 1) {
            var24 = var23 == 2 ? var12 - var8 : -var8 + -var12;
        } else {
            var24 = var23 == 0 ? var12 + var8 : var8 - var12;
        }
        int var25 = var22 + ((var24 - var22) * var11 >> 12);
        return ((var25 - var21) * arg5 >> 12) + var21;
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(I)V", line = 99)
    private final void method37(int arg0) {
        field74++;
        if (arg0 != 1638) {
            return;
        }
        if (this.field60 > 0) {
            this.field65 = new short[this.field62];
            this.field78 = new short[this.field62];
            for (int var2 = 0; var2 < this.field62; var2++) {
                this.field65[var2] = (short) ((int) (Math.pow((double) ((float) this.field60 / 4096.0F), (double) var2) * 4096.0D));
                this.field78[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field65 != null && this.field65.length == this.field62) {
            this.field78 = new short[this.field62];
            for (int var3 = 0; var3 < this.field62; var3++) {
                this.field78[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V", line = 392)
    public class7() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IBIIIII)V", line = 144)
    public static final void method38(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field81++;
        class260.method1796(42, arg5);
        if (arg1 < 12) {
            return;
        }
        int var7 = arg5 - arg2;
        int var8 = -arg5;
        int var9 = 0;
        int var10 = arg5;
        if (var7 < 0) {
            var7 = 0;
        }
        int var11 = -1;
        if (arg3 >= class303.field5106 && arg3 <= class298.field4989) {
            int[] var12 = class184.field3180[arg3];
            int var13 = class19.method172(class112.field2028, arg6 - arg5, class82.field1426, false);
            int var14 = class19.method172(class112.field2028, arg5 + arg6, class82.field1426, false);
            int var15 = class19.method172(class112.field2028, arg6 - var7, class82.field1426, false);
            int var16 = class19.method172(class112.field2028, arg6 + var7, class82.field1426, false);
            class3.method14(arg4, var13, var15, var12, -99);
            class3.method14(arg0, var15, var16, var12, -116);
            class3.method14(arg4, var16, var14, var12, -122);
        }
        int var17 = -1;
        int var18 = -var7;
        int var19 = var7;
        while (var10 > var9) {
            var17 += 2;
            var11 += 2;
            var8 += var11;
            var18 += var17;
            if (var18 >= 0 && var19 >= 1) {
                var19--;
                var18 -= var19 << 1;
                class248.field4108[var19] = var9;
            }
            var9++;
            if (var8 >= 0) {
                var10--;
                int var20 = arg3 - var10;
                var8 -= var10 << 1;
                int var21 = arg3 + var10;
                if (class303.field5106 <= var21 && class298.field4989 >= var20) {
                    if (var10 < var7) {
                        int var22 = class248.field4108[var10];
                        int var23 = class19.method172(class112.field2028, arg6 + var9, class82.field1426, false);
                        int var24 = class19.method172(class112.field2028, arg6 - var9, class82.field1426, false);
                        int var25 = class19.method172(class112.field2028, arg6 + var22, class82.field1426, false);
                        int var26 = class19.method172(class112.field2028, arg6 - var22, class82.field1426, false);
                        if (var21 <= class298.field4989) {
                            int[] var27 = class184.field3180[var21];
                            class3.method14(arg4, var24, var26, var27, -119);
                            class3.method14(arg0, var26, var25, var27, -112);
                            class3.method14(arg4, var25, var23, var27, -121);
                        }
                        if (class303.field5106 <= var20) {
                            int[] var28 = class184.field3180[var20];
                            class3.method14(arg4, var24, var26, var28, -125);
                            class3.method14(arg0, var26, var25, var28, -120);
                            class3.method14(arg4, var25, var23, var28, -128);
                        }
                    } else {
                        int var29 = class19.method172(class112.field2028, arg6 + var9, class82.field1426, false);
                        int var30 = class19.method172(class112.field2028, arg6 - var9, class82.field1426, false);
                        if (class298.field4989 >= var21) {
                            class3.method14(arg4, var30, var29, class184.field3180[var21], -108);
                        }
                        if (class303.field5106 <= var20) {
                            class3.method14(arg4, var30, var29, class184.field3180[var20], -120);
                        }
                    }
                }
            }
            int var31 = arg3 - var9;
            int var32 = arg3 + var9;
            if (var32 >= class303.field5106 && class298.field4989 >= var31) {
                int var33 = arg6 + var10;
                int var34 = arg6 - var10;
                if (var33 >= class112.field2028 && class82.field1426 >= var34) {
                    int var35 = class19.method172(class112.field2028, var33, class82.field1426, false);
                    int var36 = class19.method172(class112.field2028, var34, class82.field1426, false);
                    if (var9 < var7) {
                        int var37 = var9 <= var19 ? var19 : class248.field4108[var9];
                        int var38 = class19.method172(class112.field2028, arg6 + var37, class82.field1426, false);
                        int var39 = class19.method172(class112.field2028, arg6 - var37, class82.field1426, false);
                        if (class298.field4989 >= var32) {
                            int[] var40 = class184.field3180[var32];
                            class3.method14(arg4, var36, var39, var40, -111);
                            class3.method14(arg0, var39, var38, var40, -109);
                            class3.method14(arg4, var38, var35, var40, -110);
                        }
                        if (class303.field5106 <= var31) {
                            int[] var41 = class184.field3180[var31];
                            class3.method14(arg4, var36, var39, var41, -106);
                            class3.method14(arg0, var39, var38, var41, -106);
                            class3.method14(arg4, var38, var35, var41, -109);
                        }
                    } else {
                        if (class298.field4989 >= var32) {
                            class3.method14(arg4, var36, var35, class184.field3180[var32], -101);
                        }
                        if (class303.field5106 <= var31) {
                            class3.method14(arg4, var36, var35, class184.field3180[var31], -109);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(B)V", line = 336)
    public final void method39(byte arg0) {
        field66++;
        this.field83 = class172.method1318(this.field64, 56);
        this.method37(arg0 + 1616);
        if (arg0 != 22) {
            return;
        }
        for (int var2 = this.field62 - 1; var2 >= 1; var2--) {
            short var3 = this.field65[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field62--;
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(ZI)V", line = 371)
    public static final void method40(boolean arg0, int arg1) {
        field76++;
        class63 var2 = class46.method332(7, arg1, -12770);
        if (arg0) {
            method44((byte) 25);
        }
        var2.method427(-22507);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZI)[I", line = 400)
    public final int[] method41(boolean arg0, int arg1) {
        if (!arg0) {
            this.field78 = (short[]) null;
        }
        field79++;
        int[] var3 = this.field3654.method2032(3, arg1);
        if (this.field3654.field4967) {
            this.method45(var3, arg1, 140534700);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IILb;)V", line = 435)
    public final void method42(int arg0, int arg1, class94 arg2) {
        field84++;
        if (arg0 == 0) {
            this.field82 = arg2.method756(arg1 ^ 0x36979D60) == 1;
        } else if (arg0 == 1) {
            this.field62 = arg2.method756(915905888);
        } else if (arg0 == 2) {
            this.field60 = arg2.method750((byte) -24);
            if (this.field60 < 0) {
                this.field65 = new short[this.field62];
                for (int var5 = 0; var5 < this.field62; var5++) {
                    this.field65[var5] = (short) arg2.method750((byte) -24);
                }
            }
        } else if (arg0 == 3) {
            this.field70 = this.field73 = arg2.method756(915905888);
        } else if (arg0 == 4) {
            this.field64 = arg2.method756(915905888);
        } else if (arg0 == 5) {
            this.field70 = arg2.method756(915905888);
        } else if (arg0 == 6) {
            this.field73 = arg2.method756(915905888);
        }
        if (arg1 != 0) {
            this.field60 = 13;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZIIII)V", line = 546)
    public static final void method43(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field67++;
        class224.field3747 = arg4;
        class27.field457 = arg5;
        class260.field4323 = arg3;
        class261.field4348 = arg2;
        class82.field1436 = arg0;
        if (arg1) {
            field71 = -17;
        }
        if (class261.field4348 >= 100) {
            int var6 = class260.field4323 * 128 + 64;
            int var7 = class27.field457 * 128 + 64;
            int var8 = class3.method15(var6, class157.field2765, var7, arg1) - class224.field3747;
            int var9 = var8 - class18.field294;
            int var10 = var6 - class160.field2800;
            int var11 = var7 - class67.field1083;
            int var12 = (int) Math.sqrt((double) (var10 * var10 + var11 * var11));
            class216.field3613 = (int) (Math.atan2((double) var9, (double) var12) * 325.949D) & 0x7FF;
            class180.field3088 = (int) (-325.949D * Math.atan2((double) var10, (double) var11)) & 0x7FF;
            if (class216.field3613 < 128) {
                class216.field3613 = 128;
            }
            if (class216.field3613 > 383) {
                class216.field3613 = 383;
            }
        }
        class302.field5085 = 2;
    }

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "(B)V", line = 595)
    public static final void method44(byte arg0) {
        field80++;
        int var1 = 87 / ((arg0 + 16) / 54);
        for (class172 var2 = (class172) class137.field2440.method1666((byte) -103); var2 != null; var2 = (class172) class137.field2440.method1673((byte) -21)) {
            int var3 = var2.field2985;
            if (class12.method104(var3, 571329488)) {
                boolean var4 = true;
                class78[] var5 = class95.field1739[var3];
                for (int var6 = 0; var6 < var5.length; var6++) {
                    if (var5[var6] != null) {
                        var4 = var5[var6].field1229;
                        break;
                    }
                }
                if (!var4) {
                    int var7 = (int) var2.field2701;
                    class78 var8 = class61.method419((byte) 28, var7);
                    if (var8 != null) {
                        class55.method386(0, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "([III)V", line = 655)
    public final void method45(int[] arg0, int arg1, int arg2) {
        field75++;
        int var4 = class53.field842[arg1] * this.field73;
        if (arg2 != 140534700) {
            return;
        }
        if (this.field62 == 1) {
            int var5 = this.field78[0] << 12;
            int var6 = this.field70 * var5 >> 12;
            int var7 = this.field73 * var5 >> 12;
            short var8 = this.field65[0];
            int var9 = var4 * var5 >> 12;
            int var10 = var9 >> 12;
            int var11 = this.field83[var10 & 0xFF] & 0xFF;
            int var12 = var10 + 1;
            if (var12 >= var7) {
                var12 = 0;
            }
            int var13 = var9 & 0xFFF;
            int var14 = this.field83[var12 & 0xFF] & 0xFF;
            int var15 = class167.field2939[var13];
            if (this.field82) {
                for (int var16 = 0; var16 < class128.field2326; var16++) {
                    int var17 = class280.field4762[var16] * this.field70;
                    int var18 = this.method36(var14, var11, var5 * var17 >> 12, 1530718956, var13, var15, var6);
                    int var19 = var8 * var18 >> 12;
                    arg0[var16] = (var19 >> 1) + 2048;
                }
            } else {
                for (int var20 = 0; var20 < class128.field2326; var20++) {
                    int var21 = class280.field4762[var20] * this.field70;
                    int var22 = this.method36(var14, var11, var5 * var21 >> 12, 1530718956, var13, var15, var6);
                    arg0[var20] = var8 * var22 >> 12;
                }
            }
            return;
        }
        short var23 = this.field65[0];
        if (var23 > 8 || var23 < -8) {
            int var24 = this.field78[0] << 12;
            int var25 = var4 * var24 >> 12;
            int var26 = this.field73 * var24 >> 12;
            int var27 = this.field70 * var24 >> 12;
            int var28 = var25 >> 12;
            int var29 = var28 + 1;
            int var30 = var25 & 0xFFF;
            int var31 = this.field83[var28 & 0xFF] & 0xFF;
            int var32 = class167.field2939[var30];
            if (var26 <= var29) {
                var29 = 0;
            }
            int var33 = this.field83[var29 & 0xFF] & 0xFF;
            for (int var34 = 0; var34 < class128.field2326; var34++) {
                int var35 = class280.field4762[var34] * this.field70;
                int var36 = this.method36(var33, var31, var24 * var35 >> 12, 1530718956, var30, var32, var27);
                arg0[var34] = var23 * var36 >> 12;
            }
        }
        for (int var37 = 1; var37 < this.field62; var37++) {
            short var38 = this.field65[var37];
            if (var38 > 8 || var38 < -8) {
                int var39 = this.field78[var37] << 12;
                int var40 = var4 * var39 >> 12;
                int var41 = this.field70 * var39 >> 12;
                int var42 = this.field73 * var39 >> 12;
                int var43 = var40 >> 12;
                int var44 = var40 & 0xFFF;
                int var45 = class167.field2939[var44];
                int var46 = var43 + 1;
                int var47 = this.field83[var43 & 0xFF] & 0xFF;
                if (var42 <= var46) {
                    var46 = 0;
                }
                int var48 = this.field83[var46 & 0xFF] & 0xFF;
                if (this.field82 && (this.field62 - 1) == var37) {
                    for (int var49 = 0; var49 < class128.field2326; var49++) {
                        int var50 = class280.field4762[var49] * this.field70;
                        int var51 = this.method36(var48, var47, var39 * var50 >> 12, 1530718956, var44, var45, var41);
                        int var52 = arg0[var49] + (var38 * var51 >> 12);
                        arg0[var49] = (var52 >> 1) + 2048;
                    }
                } else {
                    for (int var53 = 0; var53 < class128.field2326; var53++) {
                        int var54 = class280.field4762[var53] * this.field70;
                        int var55 = this.method36(var48, var47, var39 * var54 >> 12, 1530718956, var44, var45, var41);
                        arg0[var53] += var38 * var55 >> 12;
                    }
                }
            }
        }
    }
}
