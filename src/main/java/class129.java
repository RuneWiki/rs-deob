import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class129 {

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "[I")
    private int[] field1857;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "[I")
    private int[] field1867;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "[B")
    private byte[] field1861;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1854 = "white:";

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field1859 = 0;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "[J")
    public static long[] field1860 = new long[32];

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    public static int field1869 = 0;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "[Z")
    public static boolean[] field1862 = new boolean[100];

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "Lbc;")
    public static class282 field1866;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "[I")
    public static int[] field1855;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public static final String method842(int arg0, byte arg1) {
        field1856++;
        return arg1 == -88 ? (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + ((arg0 & 0xFFD9) >> 8) + "." + (arg0 & 0xFF) : null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I[BIII[B)I")
    public final int method843(int arg0, byte[] arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field1864++;
        if (arg0 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg0 + arg2;
        if (arg4 != 16) {
            this.method845((byte[]) null, true, -127, 67, (byte[]) null, 54);
        }
        int var9 = arg3;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 < 0) {
                var7 = this.field1857[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field1857[var7]) < 0) {
                arg1[arg2++] = (byte) (~var11);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field1857[var7];
            }
            int var12;
            if ((var12 = this.field1857[var7]) < 0) {
                arg1[arg2++] = (byte) (~var12);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field1857[var7];
            }
            int var13;
            if ((var13 = this.field1857[var7]) < 0) {
                arg1[arg2++] = (byte) (~var13);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field1857[var7];
            }
            int var14;
            if ((var14 = this.field1857[var7]) < 0) {
                arg1[arg2++] = (byte) (~var14);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field1857[var7];
            }
            int var15;
            if ((var15 = this.field1857[var7]) < 0) {
                arg1[arg2++] = (byte) (~var15);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field1857[var7];
            }
            int var16;
            if ((var16 = this.field1857[var7]) < 0) {
                arg1[arg2++] = (byte) (~var16);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field1857[var7];
            }
            int var17;
            if ((var17 = this.field1857[var7]) < 0) {
                arg1[arg2++] = (byte) (~var17);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field1857[var7];
            }
            int var18;
            if ((var18 = this.field1857[var7]) < 0) {
                arg1[arg2++] = (byte) (~var18);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg3;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
    public static void method844(byte arg0) {
        field1855 = null;
        field1860 = null;
        if (arg0 >= -10) {
            method846(-71);
        }
        field1862 = null;
        field1866 = null;
        field1854 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "([BZII[BI)I")
    public final int method845(byte[] arg0, boolean arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        int var7 = arg2 + arg5;
        field1863++;
        int var8 = 0;
        if (!arg1) {
            method846(-123);
        }
        int var9 = arg3 << 3;
        while (arg2 < var7) {
            int var10 = arg0[arg2] & 0xFF;
            int var11 = this.field1867[var10];
            byte var12 = this.field1861[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 & 0x7;
            int var14 = var8 & -var13 >> 31;
            int var15 = var9 >> 3;
            int var16 = var15 + (var13 + var12 - 1 >> 3);
            int var17 = var13 + 24;
            arg4[var15] = (byte) (var8 = class220.method1432(var14, var11 >>> var17));
            if (var15 < var16) {
                var15++;
                var13 = var17 - 8;
                arg4[var15] = (byte) (var8 = var11 >>> var13);
                if (var15 < var16) {
                    var15++;
                    var13 -= 8;
                    arg4[var15] = (byte) (var8 = var11 >>> var13);
                    if (var15 < var16) {
                        var13 -= 8;
                        var15++;
                        arg4[var15] = (byte) (var8 = var11 >>> var13);
                        if (var15 < var16) {
                            var15++;
                            var13 -= 8;
                            arg4[var15] = (byte) (var8 = var11 << -var13);
                        }
                    }
                }
            }
            var9 += var12;
            arg2++;
        }
        return (var9 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)Lki;")
    public static final class135 method846(int arg0) {
        field1865++;
        if (arg0 <= 123) {
            return null;
        }
        try {
            return (class135) Class.forName("sa").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class128();
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I[BIILjava/lang/String;I)I")
    public static final int method847(int arg0, byte[] arg1, int arg2, int arg3, String arg4, int arg5) {
        int var6 = arg3 - arg0;
        if (arg2 != 32) {
            method846(-39);
        }
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg4.charAt(arg0 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg1[arg5 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg1[arg5 + var7] = -128;
            } else if (var8 == '‚') {
                arg1[arg5 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg1[arg5 + var7] = -125;
            } else if (var8 == '„') {
                arg1[arg5 + var7] = -124;
            } else if (var8 == '…') {
                arg1[arg5 + var7] = -123;
            } else if (var8 == '†') {
                arg1[arg5 + var7] = -122;
            } else if (var8 == '‡') {
                arg1[arg5 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg1[arg5 + var7] = -120;
            } else if (var8 == '‰') {
                arg1[arg5 + var7] = -119;
            } else if (var8 == 'Š') {
                arg1[arg5 + var7] = -118;
            } else if (var8 == '‹') {
                arg1[arg5 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg1[arg5 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg1[arg5 + var7] = -114;
            } else if (var8 == '‘') {
                arg1[arg5 + var7] = -111;
            } else if (var8 == '’') {
                arg1[arg5 + var7] = -110;
            } else if (var8 == '“') {
                arg1[arg5 + var7] = -109;
            } else if (var8 == '”') {
                arg1[arg5 + var7] = -108;
            } else if (var8 == '•') {
                arg1[arg5 + var7] = -107;
            } else if (var8 == '–') {
                arg1[arg5 + var7] = -106;
            } else if (var8 == '—') {
                arg1[arg5 + var7] = -105;
            } else if (var8 == '˜') {
                arg1[arg5 + var7] = -104;
            } else if (var8 == '™') {
                arg1[arg5 + var7] = -103;
            } else if (var8 == 'š') {
                arg1[arg5 + var7] = -102;
            } else if (var8 == '›') {
                arg1[arg5 + var7] = -101;
            } else if (var8 == 'œ') {
                arg1[arg5 + var7] = -100;
            } else if (var8 == 'ž') {
                arg1[arg5 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg1[arg5 + var7] = -97;
            } else {
                arg1[arg5 + var7] = 63;
            }
        }
        field1868++;
        return var6;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "([B)V")
    public class129(byte[] arg0) {
        int[] var2 = new int[33];
        int var3 = arg0.length;
        this.field1857 = new int[8];
        this.field1867 = new int[var3];
        this.field1861 = arg0;
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var2[var6];
                this.field1867[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    var9 = var7 | var8;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var2[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var2[var10] = var2[var10 - 1];
                            break;
                        }
                        var2[var10] = class220.method1432(var11, var12);
                    }
                } else {
                    var9 = var2[var6 - 1];
                }
                var2[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var2[var13] == var8) {
                        var2[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field1857[var14] == 0) {
                            this.field1857[var14] = var4;
                        }
                        var14 = this.field1857[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field1857.length) {
                        int[] var18 = new int[this.field1857.length * 2];
                        for (int var19 = 0; var19 < this.field1857.length; var19++) {
                            var18[var19] = this.field1857[var19];
                        }
                        this.field1857 = var18;
                    }
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field1857[var14] = ~var5;
            }
        }
    }
}
