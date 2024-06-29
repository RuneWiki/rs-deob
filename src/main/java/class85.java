import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class85 {

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    private int field1547;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    private int field1550;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "[[I")
    private int[][] field1546;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field1549 = 0;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "Lkb;")
    public static class93 field1548 = class76.method390("runes", 0);

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public static int field1552 = 0;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "Lh;")
    public static class65 field1558;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II[Lqf;IIB[B)V")
    public static final void method427(int arg0, int arg1, class151[] arg2, int arg3, int arg4, byte arg5, byte[] arg6) {
        if (arg5 != -78) {
            field1552 = -96;
        }
        field1559++;
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg3 + var12 > 0 && arg3 + var12 < 103 && arg1 + var13 > 0 && arg1 + var13 < 103) {
                        arg2[var7].field2916[arg3 + var12][arg1 + var13] = class91.method479(arg2[var7].field2916[arg3 + var12][arg1 + var13], -16777217);
                    }
                }
            }
        }
        class158 var8 = new class158(arg6);
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class80.method402(var8, arg1 + var11, arg3 + var10, var9, 0, arg0, arg4, arg5 + 21243);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
    public static void method428(boolean arg0) {
        if (!arg0) {
            field1558 = null;
            field1548 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)I")
    public final int method429(byte arg0, int arg1) {
        if (this.field1546 != null) {
            arg1 = (int) ((long) this.field1547 * (long) arg1 / (long) this.field1550) + 6;
        }
        field1545++;
        if (arg0 > -17) {
            this.field1547 = -44;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZ)I")
    public final int method430(int arg0, boolean arg1) {
        if (this.field1546 != null) {
            arg0 = (int) ((long) this.field1547 * (long) arg0 / (long) this.field1550);
        }
        if (arg1) {
            field1551++;
            return arg0;
        } else {
            return 87;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)Z")
    public static final boolean method431(int arg0) {
        field1555++;
        return class24.field365 == arg0 ? class142.field2784.method958(false) : true;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(II)V")
    public class85(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class176.method1164(arg0, 104, arg1);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field1547 = var5;
            this.field1550 = var4;
            this.field1546 = new int[var4][14];
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field1546[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                double var12 = (double) var5 / (double) var4;
                if (var11 > 14) {
                    var11 = 14;
                }
                while (var11 > var10) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLjava/awt/event/KeyEvent;)I")
    public static final int method432(byte arg0, KeyEvent arg1) {
        int var2 = arg1.getKeyChar();
        field1553++;
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return arg0 == 116 ? var2 : -91;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)I")
    public static final int method433(int arg0) {
        if (arg0 != 6783) {
            field1548 = null;
        }
        int var1 = 3;
        field1556++;
        if (class184.field3629 < 310) {
            int var2 = class152.field2939 >> 7;
            int var3 = class81.field1497 >> 7;
            int var4 = class106.field1940.field2032 >> 7;
            if ((class136.field2637[class114.field2145][var2][var3] & 0x4) != 0) {
                var1 = class114.field2145;
            }
            int var5 = class106.field1940.field2045 >> 7;
            int var6;
            if (var2 >= var4) {
                var6 = var2 - var4;
            } else {
                var6 = var4 - var2;
            }
            int var7;
            if (var3 < var5) {
                var7 = var5 - var3;
            } else {
                var7 = var3 - var5;
            }
            if (var6 > var7) {
                int var8 = var7 * 65536 / var6;
                int var9 = 32768;
                while (var2 != var4) {
                    var9 += var8;
                    if (var4 > var2) {
                        var2++;
                    } else if (var2 > var4) {
                        var2--;
                    }
                    if ((class136.field2637[class114.field2145][var2][var3] & 0x4) != 0) {
                        var1 = class114.field2145;
                    }
                    if (var9 >= 65536) {
                        if (var5 > var3) {
                            var3++;
                        } else if (var5 < var3) {
                            var3--;
                        }
                        var9 -= 65536;
                        if ((class136.field2637[class114.field2145][var2][var3] & 0x4) != 0) {
                            var1 = class114.field2145;
                        }
                    }
                }
            } else {
                int var10 = var6 * 65536 / var7;
                int var11 = 32768;
                while (var3 != var5) {
                    if (var3 < var5) {
                        var3++;
                    } else if (var5 < var3) {
                        var3--;
                    }
                    if ((class136.field2637[class114.field2145][var2][var3] & 0x4) != 0) {
                        var1 = class114.field2145;
                    }
                    var11 += var10;
                    if (var11 >= 65536) {
                        var11 -= 65536;
                        if (var4 > var2) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class136.field2637[class114.field2145][var2][var3] & 0x4) != 0) {
                            var1 = class114.field2145;
                        }
                    }
                }
            }
        }
        if ((class136.field2637[class114.field2145][class106.field1940.field2032 >> 7][class106.field1940.field2045 >> 7] & 0x4) != 0) {
            var1 = class114.field2145;
        }
        return var1;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBIIII)V")
    public static final void method434(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field1557++;
        class136.field2644[0].method674(arg4, arg3);
        int var6 = (arg0 - 32) * arg0 / arg5;
        if (var6 < 8) {
            var6 = 8;
        }
        class136.field2644[1].method674(arg4, arg3 + arg0 - 16);
        if (arg1 != -62) {
            field1549 = -28;
        }
        int var7 = (arg0 - var6 - 32) * arg2 / (arg5 - arg0);
        class118.method651(arg4, arg3 + 16, 16, arg0 - 32, class26.field408);
        class118.method651(arg4, arg3 + var7 + 16, 16, var6, class135.field2625);
        class118.method660(arg4, var7 + arg3 + 16, var6, class88.field1598);
        class118.method660(arg4 + 1, var7 + 16 + arg3, var6, class88.field1598);
        class118.method664(arg4, arg3 + var7 + 16, 16, class88.field1598);
        class118.method664(arg4, arg3 + var7 + 17, 16, class88.field1598);
        class118.method660(arg4 + 15, arg3 - -var7 + 16, var6, class32.field526);
        class118.method660(arg4 + 14, arg3 + 17 + var7, var6 - 1, class32.field526);
        class118.method664(arg4, arg3 + var7 + var6 + 15, 16, class32.field526);
        class118.method664(arg4 + 1, arg3 - -14 + var7 + var6, 15, class32.field526);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([BB)[B")
    public final byte[] method435(byte[] arg0, byte arg1) {
        if (arg1 != 108) {
            return null;
        }
        if (this.field1546 != null) {
            int var3 = 0;
            int var4 = 0;
            int var5 = (int) ((long) arg0.length * (long) this.field1547 / (long) this.field1550) + 14;
            int[] var6 = new int[var5];
            for (int var7 = 0; var7 < arg0.length; var7++) {
                int[] var10 = this.field1546[var3];
                byte var11 = arg0[var7];
                for (int var12 = 0; var12 < 14; var12++) {
                    var6[var4 + var12] += var10[var12] * var11;
                }
                int var13 = this.field1547 + var3;
                int var14 = var13 / this.field1550;
                var3 = var13 - this.field1550 * var14;
                var4 += var14;
            }
            arg0 = new byte[var5];
            for (int var8 = 0; var8 < var5; var8++) {
                int var9 = var6[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 > 127) {
                    arg0[var8] = 127;
                } else {
                    arg0[var8] = (byte) var9;
                }
            }
        }
        field1554++;
        return arg0;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B[S[Lkb;)V")
    public static final void method436(byte arg0, short[] arg1, class93[] arg2) {
        if (arg0 != 118) {
            method431(-65);
        }
        class155.method992(arg1, (byte) 36, arg2.length - 1, 0, arg2);
        field1544++;
    }
}
