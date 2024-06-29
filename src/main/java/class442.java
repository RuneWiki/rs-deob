import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public abstract class class442 {

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    private int field6305 = 4;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    private int field6314 = 4;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "[S")
    private short[] field6307 = new short[512];

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
    private int field6317 = 4;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    private int field6306 = 0;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
    public int field6323 = 4;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "[Lp;")
    public static class483[] field6315 = new class483[29];

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "[I")
    public static int[] field6322 = new int[14];

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
    public static int field6321 = -1;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "I")
    public static int field6320 = 0;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field6308;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field6309;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public static int field6310;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public static int field6311;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field6312;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    public static int field6318;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
    public static int field6319;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "[S")
    private short[] field6313;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 4)
    public static void method2607(int arg0) {
        field6322 = null;
        field6315 = null;
        if (arg0 < 17) {
            field6321 = -24;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lab;IZ)V", line = 15)
    public static final void method2608(class256 arg0, int arg1, boolean arg2) {
        field6310++;
        int var3 = arg0.field3628 == 0 ? arg0.field3597 : arg0.field3628;
        if (arg1 >= -23) {
            field6322 = null;
        }
        int var4 = arg0.field3695 == 0 ? arg0.field3707 : arg0.field3695;
        class63.method325(var3, -21, arg0.field3659, var4, arg2, class284.field4130[arg0.field3659 >> 16]);
        if (arg0.field3643 != null) {
            class63.method325(var3, -78, arg0.field3659, var4, arg2, arg0.field3643);
        }
        class68 var5 = (class68) class369.field5270.method233(-51, (long) arg0.field3659);
        if (var5 != null) {
            class300.method1887(var3, (byte) -23, var4, var5.field850, arg2);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V", line = 45)
    private final void method2609(byte arg0) {
        field6308++;
        Random var2 = new Random((long) this.field6306);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field6307[var3] = (short) var3;
        }
        int var4 = -63 / ((arg0 - 2) / 57);
        for (int var5 = 0; var5 < 255; var5++) {
            int var6 = 255 - var5;
            int var7 = class459.method2706(var6, var2, 67);
            short var8 = this.field6307[var7];
            this.field6307[var7] = this.field6307[var6];
            this.field6307[var6] = this.field6307[var6 + 256] = var8;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/lang/String;ZI)V", line = 82)
    public static final void method2610(String arg0, boolean arg1, int arg2) {
        field6319++;
        int var3 = class438.field6286;
        int[] var4 = class79.field944;
        boolean var5 = false;
        int var6 = 0;
        if (!arg1) {
            method2611(-25, (byte[]) null, 58, -107);
        }
        while (var3 > var6) {
            class198 var7 = class46.field596[var4[var6]];
            if (var7 != null && class19.field258 != var7 && var7.field2736 != null && var7.field2736.equalsIgnoreCase(arg0)) {
                if (arg2 == 1) {
                    class244.method1332((byte) -19, class28.field373);
                    class260.field3743++;
                    class230.field3185.method909(0, -1);
                    class230.field3185.method898(var4[var6], false);
                } else if (arg2 == 4) {
                    class274.field3908++;
                    class244.method1332((byte) 127, class41.field491);
                    class230.field3185.method909(0, -1);
                    class230.field3185.method878(true, var4[var6]);
                } else if (arg2 == 5) {
                    class93.field1160++;
                    class244.method1332((byte) 125, class430.field6223);
                    class230.field3185.method898(var4[var6], !arg1);
                    class230.field3185.method909(0, -1);
                } else if (arg2 == 6) {
                    class244.method1332((byte) -90, class360.field5193);
                    class15.field202++;
                    class230.field3185.method909(0, -1);
                    class230.field3185.method889(true, var4[var6]);
                } else if (arg2 == 7) {
                    class244.method1332((byte) -44, class137.field1655);
                    class158.field1882++;
                    class230.field3185.method938(128, 0);
                    class230.field3185.method889(arg1, var4[var6]);
                }
                var5 = true;
                break;
            }
            var6++;
        }
        if (!var5) {
            class104.method499(class16.field209.method205((byte) 101, class68.field849) + arg0, (byte) -10);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I[BII)Ljava/lang/String;", line = 170)
    public static final String method2611(int arg0, byte[] arg1, int arg2, int arg3) {
        field6311++;
        char[] var4 = new char[arg0];
        if (arg2 != -1638480020) {
            return null;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < arg0; var6++) {
            int var7 = arg1[arg3 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class185.field2430[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)Lfc;", line = 211)
    public static final class209 method2612(int arg0, int arg1) {
        field6316++;
        if (arg0 == 0) {
            if ((double) class429.field6195 == 3.0D) {
                return class77.field927;
            }
            if ((double) class429.field6195 == 4.0D) {
                return class364.field5224;
            }
            if ((double) class429.field6195 == 6.0D) {
                return class458.field6455;
            }
            if ((double) class429.field6195 >= 8.0D) {
                return class354.field5088;
            }
        } else if (arg0 == 1) {
            if ((double) class429.field6195 == 3.0D) {
                return class458.field6455;
            }
            if ((double) class429.field6195 == 4.0D) {
                return class354.field5088;
            }
            if ((double) class429.field6195 == 6.0D) {
                return class52.field686;
            }
            if ((double) class429.field6195 >= 8.0D) {
                return class476.field6704;
            }
        } else if (arg0 == 2) {
            if ((double) class429.field6195 == 3.0D) {
                return class52.field686;
            }
            if ((double) class429.field6195 == 4.0D) {
                return class476.field6704;
            }
            if ((double) class429.field6195 == 6.0D) {
                return class356.field5114;
            }
            if ((double) class429.field6195 >= 8.0D) {
                return class128.field1587;
            }
        }
        if (arg1 <= 42) {
            field6321 = 15;
        }
        return null;
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(IIIII)V", line = 519)
    public class442(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6305 = arg4;
        this.field6314 = arg3;
        this.field6317 = arg2;
        this.field6306 = arg0;
        this.field6323 = arg1;
        this.method2613(true);
        this.method2609((byte) -75);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)V", line = 287)
    private final void method2613(boolean arg0) {
        this.field6313 = new short[this.field6323];
        field6318++;
        if (!arg0) {
            field6320 = -90;
        }
        for (int var2 = 0; var2 < this.field6323; var2++) {
            this.field6313[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)V", line = 312)
    public static final void method2614(byte arg0) {
        class368.field5263 = class146.method694(2048, 31, true, 4, 0.4F, 8, 8, 35);
        field6309++;
        int var1 = -70 % ((43 - arg0) / 51);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIBI)V", line = 323)
    public final void method2615(int arg0, int arg1, byte arg2, int arg3) {
        field6312++;
        int[] var5 = new int[arg0];
        int[] var6 = new int[arg1];
        for (int var7 = 0; var7 < arg0; var7++) {
            var5[var7] = (var7 << 12) / arg0;
        }
        int[] var8 = new int[arg3];
        for (int var9 = 0; var9 < arg1; var9++) {
            var6[var9] = (var9 << 12) / arg1;
        }
        for (int var10 = 0; var10 < arg3; var10++) {
            var8[var10] = (var10 << 12) / arg3;
        }
        this.method2128(1);
        if (arg2 != 122) {
            method2612(16, -115);
        }
        for (int var11 = 0; var11 < arg3; var11++) {
            for (int var12 = 0; var12 < arg1; var12++) {
                for (int var13 = 0; var13 < arg0; var13++) {
                    for (int var14 = 0; var14 < this.field6323; var14++) {
                        int var15 = this.field6313[var14] << 12;
                        int var16 = var6[var12] * var15 >> 12;
                        int var17 = var8[var11] * var15 >> 12;
                        int var18 = var5[var13] * var15 >> 12;
                        int var19 = this.field6317 * var15 >> 12;
                        int var20 = this.field6305 * var15 >> 12;
                        int var21 = this.field6314 * var15 >> 12;
                        int var22 = this.field6314 * var16;
                        int var23 = this.field6305 * var17;
                        int var24 = this.field6317 * var18;
                        int var25 = var24 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var25 & 0xFF;
                        int var28 = var22 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var28 & 0xFF;
                        int var31 = var23 >> 12;
                        int var32 = var31 + 1;
                        int var33 = var24 & 0xFFF;
                        int var34;
                        if (var26 < var19) {
                            var34 = var26 & 0xFF;
                        } else {
                            var34 = 0;
                        }
                        int var35 = var22 & 0xFFF;
                        int var36 = var23 & 0xFFF;
                        int var37;
                        if (var29 < var21) {
                            var37 = var29 & 0xFF;
                        } else {
                            var37 = 0;
                        }
                        int var38 = var31 & 0xFF;
                        int var39;
                        if (var20 > var32) {
                            var39 = var32 & 0xFF;
                        } else {
                            var39 = 0;
                        }
                        short var40 = this.field6307[var38];
                        short var41 = this.field6307[var39];
                        int var42 = var36 - 4096;
                        int var43 = class432.field6251[var36];
                        int var44 = class432.field6251[var35];
                        int var45 = var33 - 4096;
                        int var46 = var35 - 4096;
                        int var47 = class432.field6251[var33];
                        short var48 = this.field6307[var30 + var40];
                        short var49 = this.field6307[var37 + var41];
                        short var50 = this.field6307[var30 + var41];
                        short var51 = this.field6307[var37 + var40];
                        int var52 = class259.method1588(16383, var36, var33, this.field6307[var27 + var48], var35);
                        int var53 = class259.method1588(16383, var36, var45, this.field6307[var34 + var48], var35);
                        int var54 = ((var53 - var52) * var47 >> 12) + var52;
                        int var55 = class259.method1588(arg2 ^ 0x3F85, var36, var33, this.field6307[var27 + var51], var46);
                        int var56 = class259.method1588(arg2 + 16261, var36, var45, this.field6307[var34 + var51], var46);
                        int var57 = ((var56 - var55) * var47 >> 12) + var55;
                        int var58 = class259.method1588(16383, var42, var33, this.field6307[var27 + var50], var35);
                        int var59 = var54 + ((var57 - var54) * var44 >> 12);
                        int var60 = class259.method1588(16383, var42, var45, this.field6307[var34 + var50], var35);
                        int var61 = ((var60 - var58) * var47 >> 12) + var58;
                        int var62 = class259.method1588(16383, var42, var33, this.field6307[var27 + var49], var46);
                        int var63 = class259.method1588(16383, var42, var45, this.field6307[var34 + var49], var46);
                        int var64 = var62 + ((var63 - var62) * var47 >> 12);
                        int var65 = var61 + ((var64 - var61) * var44 >> 12);
                        this.method2127(((var65 - var59) * var43 >> 12) + var59, arg2 + -378, var14);
                    }
                    this.method2129(255);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
    public abstract void method2129(int arg0);

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V")
    public abstract void method2128(int arg0);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)V")
    public abstract void method2127(int arg0, int arg1, int arg2);
}
