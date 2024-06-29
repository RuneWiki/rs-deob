import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class106 {

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    private int field1626;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
    private int field1627;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "[[I")
    private int[][] field1620;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public static int field1615 = -2;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "Lqa;")
    public static class73 field1617;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "[I")
    public static int[] field1624;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "[[[B")
    public static byte[][][] field1623;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V")
    public static void method786(boolean arg0) {
        field1617 = null;
        field1624 = null;
        if (arg0) {
            method794(57, (class114) null, -20, 11, -56, (byte) -95, -101, 92);
        }
        field1623 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZ)V")
    public static final void method787(String arg0, String arg1, int arg2, boolean arg3) {
        field1616++;
        class267.method1819(arg0, -1, (String) null, arg1, 0, arg2);
        if (!arg3) {
            field1623 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIBI)V")
    public static final void method788(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != -74) {
            method795(42, 6, 93, 7, -9);
        }
        field1619++;
        if (class77.field1287 == 0 || arg4 == 0 || class153.field2497 >= 50 || arg0 == -1) {
            return;
        }
        class286.field4555[class153.field2497] = arg0;
        class4.field60[class153.field2497] = arg4;
        class194.field3171[class153.field2497] = arg1;
        class92.field1447[class153.field2497] = null;
        class116.field1959[class153.field2497] = 0;
        class70.field1175[class153.field2497] = arg2;
        class153.field2497++;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IBI)V")
    public static final void method789(int arg0, byte arg1, int arg2) {
        if (class184.field3033 == 2) {
            class146.field2408 = arg0;
            class212.field3400 = arg2;
        }
        if (arg1 >= -36) {
            method789(-3, (byte) 94, 89);
        }
        class161.field2619 = (float) arg0;
        class1.field1 = (float) arg2;
        field1625++;
        class238.method1573(-15);
        class10.field141 = true;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lsb;B)V")
    public static final void method790(class124 arg0, byte arg1) {
        int var2 = -56 % ((-arg1 - 39) / 51);
        field1613++;
        class28.field487 = arg0;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZI)I")
    public final int method791(boolean arg0, int arg1) {
        if (!arg0) {
            return 21;
        }
        if (this.field1620 != null) {
            arg1 = (int) ((long) this.field1626 * (long) arg1 / (long) this.field1627);
        }
        field1622++;
        return arg1;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)I")
    public final int method792(int arg0, int arg1) {
        if (arg1 != 6) {
            this.field1620 = null;
        }
        field1618++;
        if (this.field1620 != null) {
            arg0 = (int) ((long) this.field1626 * (long) arg0 / (long) this.field1627) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I[B)[B")
    public final byte[] method793(int arg0, byte[] arg1) {
        if (arg0 <= 14) {
            return null;
        }
        if (this.field1620 != null) {
            int var3 = 0;
            int var4 = 0;
            int var5 = (int) ((long) arg1.length * (long) this.field1626 / (long) this.field1627) + 14;
            int[] var6 = new int[var5];
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field1620[var4];
                for (int var12 = 0; var12 < 14; var12++) {
                    var6[var3 + var12] += var11[var12] * var10;
                }
                int var13 = this.field1626 + var4;
                int var14 = var13 / this.field1627;
                var3 += var14;
                var4 = var13 - this.field1627 * var14;
            }
            arg1 = new byte[var5];
            for (int var8 = 0; var8 < var5; var8++) {
                int var9 = var6[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 > 127) {
                    arg1[var8] = 127;
                } else {
                    arg1[var8] = (byte) var9;
                }
            }
        }
        field1614++;
        return arg1;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILkj;IIIBII)V")
    public static final void method794(int arg0, class114 arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        if (class174.field2927) {
            class179.field2984 = 32;
        } else {
            class179.field2984 = 0;
        }
        if (arg5 > -86) {
            field1623 = null;
        }
        field1621++;
        class174.field2927 = false;
        if (class216.field3469 != 0) {
            if (arg3 <= arg7 && (arg3 + 16) > arg7 && arg2 >= arg6 && arg6 + 16 > arg2) {
                arg1.field1842 -= 4;
                class72.method556(0, arg1);
            } else if (arg3 <= arg7 && arg7 < arg3 + 16 && arg2 >= arg0 + arg6 - 16 && arg2 < (arg0 + arg6)) {
                arg1.field1842 += 4;
                class72.method556(0, arg1);
            } else if (arg7 >= (arg3 - class179.field2984) && arg7 < arg3 - (-class179.field2984 - 16) && arg2 >= arg6 + 16 && arg6 + arg0 - 16 > arg2) {
                int var8 = (arg0 - 32) * arg0 / arg4;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg0 - var8 - 32;
                int var10 = arg2 - arg6 - (var8 / 2) - 16;
                arg1.field1842 = (arg4 - arg0) * var10 / var9;
                class72.method556(0, arg1);
                class174.field2927 = true;
            }
        }
        if (class208.field3351 == 0) {
            return;
        }
        int var11 = arg1.field1790;
        if (arg3 - var11 <= arg7 && arg6 <= arg2 && arg7 < (arg3 + 16) && (arg0 + arg6) >= arg2) {
            arg1.field1842 += class208.field3351 * 45;
            class72.method556(0, arg1);
            return;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIII)V")
    public static final void method795(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1628++;
        if (arg2 < arg4) {
            for (int var5 = arg2; var5 < arg4; var5++) {
                class114.field1841[var5][arg0] = arg1;
            }
        } else {
            for (int var6 = arg4; var6 < arg2; var6++) {
                class114.field1841[var6][arg0] = arg1;
            }
        }
        int var7 = 19 / ((26 - arg3) / 61);
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(II)V")
    public class106(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class239.method1576(arg0, -32055, arg1);
            int var4 = arg1 / var3;
            this.field1626 = var4;
            int var5 = arg0 / var3;
            this.field1627 = var5;
            this.field1620 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                double var7 = (double) var6 / (double) var5 + 6.0D;
                int[] var9 = this.field1620[var6];
                int var10 = (int) Math.floor(var7 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var7 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                while (var11 > var10) {
                    double var14 = ((double) var10 - var7) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var9[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
