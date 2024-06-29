import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class99 {

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
    private int field1789;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "[[I")
    private int[][] field1782;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    private int field1791;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "Loc;")
    public static class151 field1781 = class137.method873(2, "(Udns");

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "[Loc;")
    public static class151[] field1790 = new class151[1000];

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "Loc;")
    private static class151 field1793 = class137.method873(2, "No reply from loginserver)3");

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "Loc;")
    public static class151 field1787 = field1793;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "Loc;")
    public static class151 field1795 = class137.method873(2, "Begeben Sie sich in ein freies Gebiet)1 um");

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    public static int field1794 = 0;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "Lsd;")
    public static class192 field1779;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "Lwd;")
    public static class232 field1786;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static void method607(int arg0) {
        field1786 = null;
        field1779 = null;
        field1787 = null;
        if (arg0 != -6864) {
            field1794 = 65;
        }
        field1790 = null;
        field1781 = null;
        field1795 = null;
        field1793 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI)I")
    public final int method608(byte arg0, int arg1) {
        if (this.field1782 != null) {
            arg1 = (int) ((long) this.field1791 * (long) arg1 / (long) this.field1789) + 6;
        }
        if (arg0 == 11) {
            field1788++;
            return arg1;
        } else {
            return 106;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([BB)[B")
    public final byte[] method609(byte[] arg0, byte arg1) {
        if (this.field1782 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field1791 / (long) this.field1789) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field1782[var5];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var6 + var12] += var11[var12] * var10;
                }
                int var13 = this.field1791 + var5;
                int var14 = var13 / this.field1789;
                var6 += var14;
                var5 = var13 - this.field1789 * var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 <= 127) {
                    arg0[var8] = (byte) var9;
                } else {
                    arg0[var8] = 127;
                }
            }
        }
        if (arg1 >= -120) {
            this.method609(null, (byte) 0);
        }
        field1783++;
        return arg0;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(BI)V")
    public static final void method610(byte arg0, int arg1) {
        if (arg0 >= 0) {
            field1784++;
            class44.field916 = 1000 / arg1;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BIIZZZII)Lhh;")
    public static final class84 method611(byte arg0, int arg1, int arg2, boolean arg3, boolean arg4, boolean arg5, int arg6, int arg7) {
        field1792++;
        long var8 = ((long) arg1 << 40) + (arg3 ? 137438953472L : 0L) + ((long) arg7 << 16) + (long) arg2 + ((long) arg6 << 38);
        if (!arg4 && !arg5) {
            class84 var10 = (class84) class1.field39.method1318((byte) -47, var8);
            if (var10 != null) {
                return var10;
            }
        }
        class12 var11 = class43.method311(arg2, arg0 + 105);
        if (arg7 > 1 && var11.field254 != null) {
            int var12 = -1;
            for (int var13 = 0; var13 < 10; var13++) {
                if (arg7 >= var11.field249[var13] && var11.field249[var13] != 0) {
                    var12 = var11.field254[var13];
                }
            }
            if (var12 != -1) {
                var11 = class43.method311(var12, arg0 ^ 0xFFFFFF97);
            }
        }
        class76 var14 = var11.method96(arg0 + 13);
        if (var14 == null) {
            return null;
        }
        class84 var15 = null;
        if (var11.field237 != -1) {
            var15 = method611((byte) -105, 0, var11.field226, arg3, true, false, 1, 10);
            if (var15 == null) {
                return null;
            }
        } else if (var11.field245 != -1) {
            var15 = method611((byte) -105, arg1, var11.field215, arg3, false, true, arg6, arg7);
            if (var15 == null) {
                return null;
            }
        }
        int[] var16 = class221.field3834;
        int var17 = class221.field3831;
        int var18 = class221.field3833;
        int[] var19 = new int[4];
        class221.method1376(var19);
        class84 var20 = new class84(36, 32);
        class221.method1380(var20.field1590, 36, 32);
        class221.method1381();
        class61.method404();
        class61.method419(16, 16);
        class61.field1205 = false;
        if (var11.field245 != -1) {
            var15.method545(0, 0);
        }
        int var21 = var11.field256;
        if (arg4) {
            var21 = (int) ((double) var21 * 1.5D);
        } else if (arg6 == 2) {
            var21 = (int) ((double) var21 * 1.04D);
        }
        int var22 = class61.field1208[var11.field271] * var21 >> 16;
        int var23 = class61.field1191[var11.field271] * var21 >> 16;
        if (arg0 != -105) {
            field1779 = null;
        }
        var14.method162(0, var11.field258, var11.field225, var11.field271, var11.field233, var23 + var11.field257 - var14.method74() / 2, var11.field257 + var22);
        if (var11.field245 == -1) {
            if (arg6 >= 1) {
                var20.method552(1);
            }
            if (arg6 >= 2) {
                var20.method552(16777215);
            }
            if (arg1 != 0) {
                var20.method539(arg1);
            }
        }
        class221.method1380(var20.field1590, 36, 32);
        if (var11.field237 != -1) {
            var15.method545(0, 0);
        }
        if (!arg4 && (var11.field266 == 1 || arg7 != 1) && arg7 != -1 && arg3) {
            class113.field2016.method1256(class14.method118((byte) -15, arg7), 0, 9, 16776960, 1);
        }
        if (!arg4 && !arg5) {
            class1.field39.method1324(var20, 18373, var8);
        }
        class221.method1380(var16, var18, var17);
        class221.method1385(var19);
        class61.method404();
        class61.field1205 = true;
        return var20;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
    public static final void method612(int arg0) {
        class159.field2862 = null;
        class148.field2650 = null;
        class181.field3271 = null;
        field1780++;
        class128.field2302 = null;
        class174.field3147 = null;
        class67.field1312 = null;
        if (arg0 != -20444) {
            field1786 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)I")
    public final int method613(int arg0, byte arg1) {
        int var3 = 109 / ((-arg1 - 30) / 52);
        if (this.field1782 != null) {
            arg0 = (int) ((long) this.field1791 * (long) arg0 / (long) this.field1789);
        }
        field1785++;
        return arg0;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(II)V")
    public class99(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class157.method1030(arg0, arg1, (byte) -13);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field1789 = var5;
            this.field1782 = new int[var5][14];
            this.field1791 = var4;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field1782[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                double var10 = (double) var4 / (double) var5;
                int var12 = (int) Math.floor(var8 + 1.0D - 7.0D);
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var12 < 0) {
                    var12 = 0;
                }
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var13 > var12) {
                    double var14 = var10;
                    double var16 = ((double) var12 - var8) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var10 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var12 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }
}
