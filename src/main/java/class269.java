import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public abstract class class269 {

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
    private int field3746 = 4;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    private int field3743 = 0;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
    public int field3753 = 4;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    private int field3745 = 4;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "[S")
    private short[] field3755 = new short[512];

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "I")
    private int field3756 = 4;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "Z")
    public static boolean field3741 = false;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "Lga;")
    public static class282 field3744 = null;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "[[B")
    public static byte[][] field3749 = new byte[1000][];

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "Lga;")
    public static class282 field3742;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "[S")
    private short[] field3747;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V", line = 3)
    private final void method1726(int arg0) {
        field3752++;
        Random var2 = new Random((long) this.field3743);
        for (int var3 = arg0; var3 < 255; var3++) {
            this.field3755[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class491.method2931(var2, Integer.MIN_VALUE, var5);
            short var7 = this.field3755[var6];
            this.field3755[var6] = this.field3755[var5];
            this.field3755[var5] = this.field3755[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V", line = 43)
    private final void method1727(int arg0) {
        field3754++;
        this.field3747 = new short[this.field3753];
        for (int var2 = 0; var2 < this.field3753; var2++) {
            this.field3747[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (arg0 != 2) {
            this.field3747 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLik;I)V", line = 63)
    public static final void method1728(byte arg0, class141 arg1, int arg2) {
        if (arg0 < 2) {
            method1729(14);
        }
        field3750++;
        boolean var3 = arg1.method949(122, 1) == 1;
        if (var3) {
            class224.field3113[class493.field7267++] = arg2;
        }
        int var4 = arg1.method949(111, 2);
        class96 var5 = class241.field3398[arg2];
        if (var4 == 0) {
            if (var3) {
                var5.field1427 = false;
            } else if (class350.field5400 == arg2) {
                throw new RuntimeException("s:lr");
            } else {
                class317 var6 = class95.field1383[arg2] = new class317();
                var6.field4606 = (var5.field3917[0] + class331.field5162 >> 6 << 14) + ((var5.field1866 << 28) + (class328.field5099 + var5.field3915[0] >> 6));
                if (var5.field1386 == -1) {
                    var6.field4603 = var5.field3840.method1008(75);
                } else {
                    var6.field4603 = var5.field1386;
                }
                var6.field4605 = var5.field1388;
                var6.field4602 = var5.field3833;
                if (var5.field1406 > 0) {
                    class340.method2198(var5, 75);
                }
                class241.field3398[arg2] = null;
                if (arg1.method949(87, 1) != 0) {
                    class110.method692(arg1, arg2, 123);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg1.method949(22, 3);
            int var8 = var5.field3917[0];
            int var9 = var5.field3915[0];
            if (var7 == 0) {
                var9--;
                var8--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var9--;
                var8++;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var9++;
                var8--;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var8++;
                var9++;
            }
            if (var3) {
                var5.field1432 = var8;
                var5.field1387 = var9;
                var5.field1427 = true;
            } else {
                var5.method639((byte) 102, class487.field7212[arg2], var9, var8);
            }
        } else if (var4 == 2) {
            int var10 = arg1.method949(14, 4);
            int var11 = var5.field3917[0];
            int var12 = var5.field3915[0];
            if (var10 == 0) {
                var12 -= 2;
                var11 -= 2;
            } else if (var10 == 1) {
                var11--;
                var12 -= 2;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var11++;
                var12 -= 2;
            } else if (var10 == 4) {
                var12 -= 2;
                var11 += 2;
            } else if (var10 == 5) {
                var12--;
                var11 -= 2;
            } else if (var10 == 6) {
                var12--;
                var11 += 2;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var11 -= 2;
                var12++;
            } else if (var10 == 10) {
                var12++;
                var11 += 2;
            } else if (var10 == 11) {
                var12 += 2;
                var11 -= 2;
            } else if (var10 == 12) {
                var11--;
                var12 += 2;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var11++;
                var12 += 2;
            } else if (var10 == 15) {
                var11 += 2;
                var12 += 2;
            }
            if (var3) {
                var5.field1387 = var12;
                var5.field1432 = var11;
                var5.field1427 = true;
            } else {
                var5.method639((byte) 111, class487.field7212[arg2], var12, var11);
            }
        } else {
            int var13 = arg1.method949(64, 1);
            if (var13 == 0) {
                int var14 = arg1.method949(23, 12);
                int var15 = var14 >> 10;
                int var16 = var14 >> 5 & 0x1F;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field3917[0] + var16;
                int var19 = var5.field3915[0] + var17;
                if (var3) {
                    var5.field1387 = var19;
                    var5.field1427 = true;
                    var5.field1432 = var18;
                } else {
                    var5.method639((byte) 89, class487.field7212[arg2], var19, var18);
                }
                var5.field1866 = (byte) (var5.field1866 + var15 & 0x3);
                if (class350.field5400 == arg2) {
                    class367.field5618 = var5.field1866;
                }
            } else {
                int var20 = arg1.method949(27, 30);
                int var21 = var20 >> 28;
                int var22 = var20 >> 14 & 0x3FFF;
                int var23 = var20 & 0x3FFF;
                int var24 = (var5.field3917[0] + var22 + class331.field5162 & 0x3FFF) - class331.field5162;
                int var25 = (class328.field5099 + var23 + var5.field3915[0] & 0x3FFF) - class328.field5099;
                if (var3) {
                    var5.field1432 = var24;
                    var5.field1427 = true;
                    var5.field1387 = var25;
                } else {
                    var5.method639((byte) 126, class487.field7212[arg2], var25, var24);
                }
                var5.field1866 = (byte) (var5.field1866 + var21 & 0x3);
                if (class350.field5400 == arg2) {
                    class367.field5618 = var5.field1866;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)V", line = 375)
    public static void method1729(int arg0) {
        field3742 = null;
        field3744 = null;
        field3749 = null;
        if (arg0 != 1254335756) {
            field3741 = false;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIZIIIZ)V", line = 387)
    public static final void method1730(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        class24.field355 = arg5;
        field3748++;
        class350.field5391 = arg4;
        if (!arg6) {
            method1728((byte) 59, null, -110);
        }
        class388.field5936 = arg0;
        class486.field7194 = arg1;
        class425.field6474 = arg3;
        if (arg2 && class350.field5391 >= 100) {
            class199.field2646 = class486.field7194 * 128 + 64;
            class140.field1869 = class24.field355 * 128 + 64;
            class26.field384 = class352.method2264(-100, class367.field5618, class140.field1869, class199.field2646) - class425.field6474;
        }
        class340.field5269 = 2;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIB)V", line = 416)
    public final void method1731(int arg0, int arg1, int arg2, byte arg3) {
        field3751++;
        int[] var5 = new int[arg1];
        int[] var6 = new int[arg0];
        int[] var7 = new int[arg2];
        if (arg3 <= 78) {
            this.field3743 = 51;
        }
        for (int var8 = 0; var8 < arg1; var8++) {
            var5[var8] = (var8 << 12) / arg1;
        }
        for (int var9 = 0; var9 < arg0; var9++) {
            var6[var9] = (var9 << 12) / arg0;
        }
        for (int var10 = 0; var10 < arg2; var10++) {
            var7[var10] = (var10 << 12) / arg2;
        }
        this.method1732(30);
        for (int var11 = 0; var11 < arg2; var11++) {
            for (int var12 = 0; var12 < arg0; var12++) {
                for (int var13 = 0; var13 < arg1; var13++) {
                    for (int var14 = 0; var14 < this.field3753; var14++) {
                        int var15 = this.field3747[var14] << 12;
                        int var16 = var7[var11] * var15 >> 12;
                        int var17 = this.field3745 * var15 >> 12;
                        int var18 = var5[var13] * var15 >> 12;
                        int var19 = this.field3756 * var15 >> 12;
                        int var20 = this.field3746 * var15 >> 12;
                        int var21 = var6[var12] * var15 >> 12;
                        int var22 = this.field3756 * var18;
                        int var23 = this.field3745 * var21;
                        int var24 = this.field3746 * var16;
                        int var25 = var22 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var23 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var27 & 0xFF;
                        int var31 = var24 >> 12;
                        int var32 = var31 + 1;
                        int var33 = var31 & 0xFF;
                        int var34 = var23 & 0xFFF;
                        int var35;
                        if (var32 >= var20) {
                            var35 = 0;
                        } else {
                            var35 = var32 & 0xFF;
                        }
                        int var36 = var24 & 0xFFF;
                        int var37;
                        if (var17 > var29) {
                            var37 = var29 & 0xFF;
                        } else {
                            var37 = 0;
                        }
                        int var38;
                        if (var19 > var26) {
                            var38 = var26 & 0xFF;
                        } else {
                            var38 = 0;
                        }
                        int var39 = var22 & 0xFFF;
                        short var40 = this.field3755[var35];
                        int var41 = class533.field7845[var36];
                        short var42 = this.field3755[var33];
                        int var43 = var36 - 4096;
                        int var44 = class533.field7845[var39];
                        int var45 = var39 - 4096;
                        int var46 = class533.field7845[var34];
                        int var47 = var34 - 4096;
                        short var48 = this.field3755[var37 + var40];
                        short var49 = this.field3755[var30 + var42];
                        short var50 = this.field3755[var30 + var40];
                        short var51 = this.field3755[var37 + var42];
                        int var52 = class168.method1140(var34, this.field3755[var28 + var49], var36, (byte) 94, var39);
                        int var53 = class168.method1140(var34, this.field3755[var38 + var49], var36, (byte) 120, var45);
                        int var54 = ((var53 - var52) * var44 >> 12) + var52;
                        int var55 = class168.method1140(var47, this.field3755[var28 + var51], var36, (byte) 120, var39);
                        int var56 = class168.method1140(var47, this.field3755[var38 + var51], var36, (byte) 124, var45);
                        int var57 = ((var56 - var55) * var44 >> 12) + var55;
                        int var58 = var54 + ((var57 - var54) * var46 >> 12);
                        int var59 = class168.method1140(var34, this.field3755[var28 + var50], var43, (byte) 109, var39);
                        int var60 = class168.method1140(var34, this.field3755[var38 + var50], var43, (byte) 71, var45);
                        int var61 = ((var60 - var59) * var44 >> 12) + var59;
                        int var62 = class168.method1140(var47, this.field3755[var28 + var48], var43, (byte) 117, var39);
                        int var63 = class168.method1140(var47, this.field3755[var38 + var48], var43, (byte) 102, var45);
                        int var64 = ((var63 - var62) * var44 >> 12) + var62;
                        int var65 = ((var64 - var61) * var46 >> 12) + var61;
                        this.method1734(var14, (byte) 86, ((var65 - var58) * var41 >> 12) + var58);
                    }
                    this.method1733(74);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(IIIII)V", line = 622)
    public class269(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3743 = arg0;
        this.field3746 = arg4;
        this.field3753 = arg1;
        this.field3745 = arg3;
        this.field3756 = arg2;
        this.method1727(2);
        this.method1726(0);
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V")
    public abstract void method1732(int arg0);

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)V")
    public abstract void method1733(int arg0);

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IBI)V")
    public abstract void method1734(int arg0, byte arg1, int arg2);
}
