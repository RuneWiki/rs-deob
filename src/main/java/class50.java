import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public abstract class class50 {

    @OriginalMember(owner = "client!gp", name = "n", descriptor = "[S")
    private short[] field594 = new short[512];

    @OriginalMember(owner = "client!gp", name = "h", descriptor = "I")
    private int field593 = 4;

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "I")
    private int field592 = 4;

    @OriginalMember(owner = "client!gp", name = "s", descriptor = "I")
    private int field601 = 4;

    @OriginalMember(owner = "client!gp", name = "i", descriptor = "I")
    public int field607 = 4;

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "I")
    private int field609 = 0;

    @OriginalMember(owner = "client!gp", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field610 = new String[] { method523(method522("Ez;\u0006XLca\u0004\u0019")), method523(method522("Ez;v\u0019")), method523(method522("L\u007fyV")), method523(method522("Y$;\u0014L")), method523(method522("Ez;j\u0019")), method523(method522("Ez;k\u0019")), method523(method522("Ez;w\u0019")), method523(method522("Nlt")), method523(method522("Ez;h\u0019")), method523(method522("Ez;q\u0019")), method523(method522("Ez;u\u0019")), method523(method522("Ez;t\u0019")) };

    @OriginalMember(owner = "client!gp", name = "r", descriptor = "F")
    public static float field597;

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!gp", name = "k", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!gp", name = "j", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!gp", name = "t", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!gp", name = "m", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!gp", name = "o", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!gp", name = "q", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!gp", name = "l", descriptor = "Lqh;")
    public static class72 field606;

    @OriginalMember(owner = "client!gp", name = "p", descriptor = "[Lrda;")
    public static class693[] field608;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "[S")
    private short[] field598;

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(IIIII)V", line = 361)
    public class50(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            this.field593 = arg4;
            this.field601 = arg3;
            this.field607 = arg1;
            this.field592 = arg2;
            this.field609 = arg0;
            this.method519(0);
            this.method517(false);
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field610[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Z)Lde;", line = 14)
    public static final class559 method512(boolean arg0) {
        try {
            field600++;
            try {
                if (arg0) {
                    field608 = null;
                }
                return (class559) Class.forName(field610[7]).getDeclaredConstructor().newInstance();
            } catch (Throwable var2) {
                return new class500();
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field610[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V", line = 41)
    public static void method514(int arg0) {
        try {
            field608 = null;
            field606 = null;
            if (arg0 != 0) {
                field608 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field610[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(III)V", line = 63)
    public static final void method515(int arg0, int arg1, int arg2) {
        try {
            field599++;
            if (class504.method3798(127, arg1)) {
                if (arg0 != -90198420) {
                    method518(-79, null);
                }
                class659.method4792(class309.field5028[arg1], arg0 ^ 0xFA9FCB53, arg2);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field610[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(Z)I", line = 78)
    public static final int method516(boolean arg0) {
        try {
            field602++;
            if (arg0) {
                method514(80);
            }
            return class184.field2931 == 1 ? class776.field11329 : 0;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field610[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "(Z)V", line = 92)
    private final void method517(boolean arg0) {
        try {
            field595++;
            Random var2 = new Random((long) this.field609);
            for (int var3 = 0; var3 < 255; var3++) {
                this.field594[var3] = (short) var3;
            }
            int var4 = 0;
            if (arg0) {
                this.method511(-95);
            }
            while (var4 < 255) {
                int var5 = 255 - var4;
                int var6 = class235.method2039(var2, var5, -124);
                short var7 = this.field594[var6];
                this.field594[var6] = this.field594[var5];
                this.field594[var5] = this.field594[var5 + 256] = var7;
                var4++;
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field610[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILnq;)[I", line = 129)
    public static final int[] method518(int arg0, class487 arg1) {
        try {
            field590++;
            class176 var2 = new class176(518);
            int[] var3 = new int[4];
            for (int var4 = 0; var4 < 4; var4++) {
                var3[var4] = (int) (Math.random() * 9.9999999E7D);
            }
            var2.method1678(10, 65280);
            var2.method1641((byte) -108, var3[0]);
            var2.method1641((byte) -108, var3[1]);
            var2.method1641((byte) -108, var3[2]);
            var2.method1641((byte) -108, var3[3]);
            int var5 = 0;
            if (arg0 < 51) {
                return null;
            }
            while (var5 < 10) {
                var2.method1641((byte) -108, (int) (Math.random() * 9.9999999E7D));
                var5++;
            }
            var2.method1650((byte) -95, (int) (Math.random() * 9.9999999E7D));
            var2.method1659(0, class85.field1279, class326.field5328);
            arg1.field7362.method1667(0, var2.field2799, -102, var2.field2805);
            return var3;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field610[4] + arg0 + ',' + (arg1 == null ? field610[2] : field610[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "(I)V", line = 167)
    private final void method519(int arg0) {
        try {
            field591++;
            this.field598 = new short[this.field607];
            for (int var2 = arg0; var2 < this.field607; var2++) {
                this.field598[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field610[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IBII)V", line = 192)
    public final void method521(int arg0, byte arg1, int arg2, int arg3) {
        try {
            field605++;
            int[] var5 = new int[arg0];
            int[] var6 = new int[arg2];
            for (int var7 = 0; var7 < arg0; var7++) {
                var5[var7] = (var7 << 12) / arg0;
            }
            int[] var8 = new int[arg3];
            if (arg1 > 119) {
                for (int var9 = 0; var9 < arg2; var9++) {
                    var6[var9] = (var9 << 12) / arg2;
                }
                for (int var10 = 0; var10 < arg3; var10++) {
                    var8[var10] = (var10 << 12) / arg3;
                }
                this.method513((byte) 115);
                for (int var11 = 0; var11 < arg3; var11++) {
                    for (int var12 = 0; var12 < arg2; var12++) {
                        for (int var13 = 0; var13 < arg0; var13++) {
                            for (int var14 = 0; var14 < this.field607; var14++) {
                                int var15 = this.field598[var14] << 12;
                                int var16 = this.field601 * var15 >> 12;
                                int var17 = this.field592 * var15 >> 12;
                                int var18 = var6[var12] * var15 >> 12;
                                int var19 = this.field593 * var15 >> 12;
                                int var20 = var8[var11] * var15 >> 12;
                                int var21 = var5[var13] * var15 >> 12;
                                int var22 = this.field593 * var20;
                                int var23 = this.field592 * var21;
                                int var24 = this.field601 * var18;
                                int var25 = var23 >> 12;
                                int var26 = var25 + 1;
                                int var27 = var25 & 0xFF;
                                int var28 = var24 >> 12;
                                int var29 = var28 + 1;
                                int var30 = var22 >> 12;
                                int var31 = var28 & 0xFF;
                                int var32 = var30 + 1;
                                int var33;
                                if (var32 >= var19) {
                                    var33 = 0;
                                } else {
                                    var33 = var32 & 0xFF;
                                }
                                int var34 = var30 & 0xFF;
                                int var35 = var23 & 0xFFF;
                                int var36 = var24 & 0xFFF;
                                int var37;
                                if (var17 <= var26) {
                                    var37 = 0;
                                } else {
                                    var37 = var26 & 0xFF;
                                }
                                int var38 = var22 & 0xFFF;
                                int var39;
                                if (var16 <= var29) {
                                    var39 = 0;
                                } else {
                                    var39 = var29 & 0xFF;
                                }
                                int var40 = class18.field186[var38];
                                int var41 = var35 - 4096;
                                short var42 = this.field594[var34];
                                int var43 = var36 - 4096;
                                int var44 = class18.field186[var36];
                                int var45 = var38 - 4096;
                                int var46 = class18.field186[var35];
                                short var47 = this.field594[var33];
                                short var48 = this.field594[var39 + var47];
                                short var49 = this.field594[var31 + var47];
                                short var50 = this.field594[var39 + var42];
                                short var51 = this.field594[var31 + var42];
                                int var52 = class670.method4860(var35, var36, var38, this.field594[var27 + var51], -1);
                                int var53 = class670.method4860(var41, var36, var38, this.field594[var37 + var51], -1);
                                int var54 = ((var53 - var52) * var46 >> 12) + var52;
                                int var55 = class670.method4860(var35, var43, var38, this.field594[var27 + var50], -1);
                                int var56 = class670.method4860(var41, var43, var38, this.field594[var37 + var50], -1);
                                int var57 = ((var56 - var55) * var46 >> 12) + var55;
                                int var58 = ((var57 - var54) * var44 >> 12) + var54;
                                int var59 = class670.method4860(var35, var36, var45, this.field594[var27 + var49], -1);
                                int var60 = class670.method4860(var41, var36, var45, this.field594[var37 + var49], -1);
                                int var61 = var59 + ((var60 - var59) * var46 >> 12);
                                int var62 = class670.method4860(var35, var43, var45, this.field594[var27 + var48], -1);
                                int var63 = class670.method4860(var41, var43, var45, this.field594[var37 + var48], -1);
                                int var64 = ((var63 - var62) * var46 >> 12) + var62;
                                int var65 = ((var64 - var61) * var44 >> 12) + var61;
                                this.method520(var58 + ((var65 - var58) * var40 >> 12), var14, (byte) 101);
                            }
                            this.method511(-1815138708);
                        }
                    }
                }
            }
        } catch (RuntimeException var67) {
            throw class590.method4333(var67, field610[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)V")
    public abstract void method511(int arg0);

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)V")
    public abstract void method513(byte arg0);

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIB)V")
    public abstract void method520(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!gp", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method522(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x31);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gp", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method523(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 34;
                    break;
                case 1:
                    var10005 = 10;
                    break;
                case 2:
                    var10005 = 21;
                    break;
                case 3:
                    var10005 = 58;
                    break;
                default:
                    var10005 = 49;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
