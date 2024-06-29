import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class268 {

    @OriginalMember(owner = "client!nq", name = "G", descriptor = "Lvk;")
    private class207 field3730 = null;

    @OriginalMember(owner = "client!nq", name = "p", descriptor = "I")
    public int field3713;

    @OriginalMember(owner = "client!nq", name = "K", descriptor = "Z")
    private boolean field3734;

    @OriginalMember(owner = "client!nq", name = "y", descriptor = "Lpa;")
    private class208 field3722;

    @OriginalMember(owner = "client!nq", name = "B", descriptor = "I")
    public static int field3725 = -1;

    @OriginalMember(owner = "client!nq", name = "D", descriptor = "I")
    public static int field3727 = 99;

    @OriginalMember(owner = "client!nq", name = "z", descriptor = "I")
    public static int field3723 = 0;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!nq", name = "h", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!nq", name = "i", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!nq", name = "j", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!nq", name = "l", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!nq", name = "m", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!nq", name = "n", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!nq", name = "o", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!nq", name = "q", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!nq", name = "r", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!nq", name = "s", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!nq", name = "t", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!nq", name = "u", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!nq", name = "w", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!nq", name = "x", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!nq", name = "A", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!nq", name = "C", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!nq", name = "E", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!nq", name = "F", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!nq", name = "H", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!nq", name = "I", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!nq", name = "L", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!nq", name = "M", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!nq", name = "N", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!nq", name = "O", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!nq", name = "P", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!nq", name = "Q", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!nq", name = "R", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!nq", name = "J", descriptor = "Lwk;")
    public static class76 field3733;

    @OriginalMember(owner = "client!nq", name = "S", descriptor = "[I")
    public static int[] field3742;

    @OriginalMember(owner = "client!nq", name = "v", descriptor = "[Ljava/lang/Object;")
    private Object[] field3719;

    @OriginalMember(owner = "client!nq", name = "k", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field3708;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(III)Z")
    private final boolean method1735(int arg0, int arg1, int arg2) {
        field3739++;
        if (arg0 != 5) {
            this.method1741((String) null, (byte) -3);
        }
        if (!this.method1743(110)) {
            return false;
        } else if (arg2 >= 0 && arg1 >= 0 && this.field3730.field2853.length > arg2 && arg1 < this.field3730.field2853[arg2]) {
            return true;
        } else if (class170.field2335) {
            throw new IllegalArgumentException(arg2 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)I")
    public final int method1736(int arg0) {
        field3718++;
        if (!this.method1743(109)) {
            throw new IllegalStateException("");
        }
        if (arg0 >= -127) {
            this.method1767((byte) 114);
        }
        return this.field3730.field2841;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B")
    public final byte[] method1737(String arg0, int arg1, String arg2) {
        field3710++;
        if (!this.method1743(105)) {
            return null;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field3730.field2849.method480(103, class411.method2580(var4, false));
        if (arg1 != -1) {
            return null;
        } else if (this.method1752((byte) -112, var6)) {
            int var7 = this.field3730.field2839[var6].method480(96, class411.method2580(var5, false));
            return this.method1745(var7, (byte) 101, var6);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public final int method1738(String arg0, boolean arg1) {
        field3712++;
        if (!arg1) {
            field3725 = -90;
        }
        if (this.method1743(49)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field3730.field2849.method480(-103, class411.method2580(var3, false));
            return this.method1768(var4, -16254);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)I")
    public final int method1739(int arg0, int arg1) {
        field3698++;
        if (arg0 <= 53) {
            this.field3722 = null;
        }
        return this.method1752((byte) -112, arg1) ? this.field3730.field2853[arg1] : 0;
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(II)V")
    private final void method1740(int arg0, int arg1) {
        field3699++;
        if (arg0 != 4539) {
            method1760((byte) -105);
        }
        this.field3722.method1135(-21, arg1);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method1741(String arg0, byte arg1) {
        field3737++;
        if (!this.method1743(54)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 != -26) {
            this.method1737((String) null, -10, (String) null);
        }
        int var4 = this.field3730.field2849.method480(107, class411.method2580(var3, false));
        return var4 >= 0;
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)I")
    public final int method1742(int arg0) {
        field3717++;
        if (this.method1743(44)) {
            if (arg0 != -1) {
                this.field3708 = null;
            }
            return this.field3730.field2853.length;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)Z")
    private final boolean method1743(int arg0) {
        if (arg0 < 25) {
            field3725 = 8;
        }
        field3720++;
        if (this.field3730 == null) {
            this.field3730 = this.field3722.method1146(255);
            if (this.field3730 == null) {
                return false;
            }
            this.field3708 = new Object[this.field3730.field2845][];
            this.field3719 = new Object[this.field3730.field2845];
        }
        return true;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)V")
    public static final void method1744(boolean arg0) {
        class39.method369(106, (long) class276.field3837, class64.field949);
        field3736++;
        if (class59.field801 != -1) {
            class361.method2324(8, class59.field801);
        }
        for (int var1 = 0; var1 < class154.field2170; var1++) {
            if (class377.field5395[var1]) {
                class25.field458[var1] = true;
            }
            class141.field2028[var1] = class377.field5395[var1];
            class377.field5395[var1] = false;
        }
        class2.field24 = class276.field3837;
        if (class64.field949.method51()) {
            class360.field4980 = true;
        }
        if (class59.field801 != -1) {
            class154.field2170 = 0;
            class282.method1838((byte) -105);
        }
        class64.field949.method143();
        if (arg0) {
            method1760((byte) 124);
        }
        class416.method2610(class382.field5460, -1);
        class349.field4797 = 0;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IBI)[B")
    public final byte[] method1745(int arg0, byte arg1, int arg2) {
        field3704++;
        int var4 = -56 % ((-arg1 - 33) / 57);
        return this.method1748(arg0, arg2, -997, (int[]) null);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(BZZ)V")
    public final void method1746(byte arg0, boolean arg1, boolean arg2) {
        if (arg0 > -82) {
            this.method1752((byte) 60, 64);
        }
        field3707++;
        if (!this.method1743(80)) {
            return;
        }
        if (arg2) {
            this.field3730.field2839 = null;
            this.field3730.field2840 = null;
        }
        if (arg1) {
            this.field3730.field2852 = null;
            this.field3730.field2849 = null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I[IZI)Z")
    private final boolean method1747(int arg0, int[] arg1, boolean arg2, int arg3) {
        field3705++;
        if (!this.method1752((byte) -112, arg0)) {
            return false;
        } else if (this.field3719[arg0] == null) {
            return false;
        } else {
            int var5 = this.field3730.field2855[arg0];
            int[] var6 = this.field3730.field2854[arg0];
            if (this.field3708[arg0] == null) {
                this.field3708[arg0] = new Object[this.field3730.field2853[arg0]];
            }
            Object[] var7 = this.field3708[arg0];
            boolean var8 = arg2;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10;
                if (var6 == null) {
                    var10 = var9;
                } else {
                    var10 = var6[var9];
                }
                if (var7[var10] == null) {
                    var8 = false;
                    break;
                }
            }
            if (var8) {
                return true;
            }
            byte[] var11;
            if (arg1 != null && (arg1[0] != 0 || arg1[1] != 0 || arg1[2] != 0 || arg1[3] != 0)) {
                var11 = class325.method2091(true, this.field3719[arg0], (byte) 105);
                class11 var12 = new class11(var11);
                var12.method186(var12.field230.length, 5, arg1, (byte) 7);
            } else {
                var11 = class325.method2091(false, this.field3719[arg0], (byte) 105);
            }
            byte[] var13;
            try {
                var13 = class303.method1953(-5, var11);
            } catch (RuntimeException var49) {
                throw class327.method2105(var49, "T3 - " + (arg1 != null) + "," + arg0 + "," + var11.length + "," + class410.method2566(var11.length, -126, var11) + "," + class410.method2566(var11.length - 2, -125, var11) + "," + this.field3730.field2856[arg0] + "," + this.field3730.field2841);
            }
            if (this.field3734) {
                this.field3719[arg0] = null;
            }
            if (var5 <= 1) {
                int var15;
                if (var6 == null) {
                    var15 = 0;
                } else {
                    var15 = var6[0];
                }
                if (this.field3713 == 0) {
                    var7[var15] = class98.method706(false, (byte) 122, var13);
                } else {
                    var7[var15] = var13;
                }
            } else if (this.field3713 == 2) {
                int var32 = var13.length;
                int var51 = var32 - 1;
                int var33 = var13[var51] & 0xFF;
                int var34 = var51 - var33 * 4 * var5;
                class11 var35 = new class11(var13);
                int var36 = 0;
                int var37 = 0;
                var35.field191 = var34;
                for (int var38 = 0; var38 < var33; var38++) {
                    int var39 = 0;
                    for (int var40 = 0; var40 < var5; var40++) {
                        var39 += var35.method185(25239);
                        int var41;
                        if (var6 == null) {
                            var41 = var40;
                        } else {
                            var41 = var6[var40];
                        }
                        if (arg3 == var41) {
                            var36 += var39;
                            var37 = var41;
                        }
                    }
                }
                if (var36 == 0) {
                    return true;
                }
                byte[] var42 = new byte[var36];
                int var43 = 0;
                var35.field191 = var34;
                int var44 = 0;
                for (int var45 = 0; var45 < var33; var45++) {
                    int var46 = 0;
                    for (int var47 = 0; var47 < var5; var47++) {
                        var46 += var35.method185(25239);
                        int var48;
                        if (var6 == null) {
                            var48 = var47;
                        } else {
                            var48 = var6[var47];
                        }
                        if (arg3 == var48) {
                            class36.method344(var13, var44, var42, var43, var46);
                            var43 += var46;
                        }
                        var44 += var46;
                    }
                }
                var7[var37] = var42;
            } else {
                int var16 = var13.length;
                int var50 = var16 - 1;
                int var17 = var13[var50] & 0xFF;
                int var18 = var50 - var5 * var17 * 4;
                class11 var19 = new class11(var13);
                var19.field191 = var18;
                int[] var20 = new int[var5];
                for (int var21 = 0; var21 < var17; var21++) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < var5; var23++) {
                        var22 += var19.method185(25239);
                        var20[var23] += var22;
                    }
                }
                byte[][] var24 = new byte[var5][];
                for (int var25 = 0; var25 < var5; var25++) {
                    var24[var25] = new byte[var20[var25]];
                    var20[var25] = 0;
                }
                var19.field191 = var18;
                int var26 = 0;
                for (int var27 = 0; var27 < var17; var27++) {
                    int var28 = 0;
                    for (int var29 = 0; var29 < var5; var29++) {
                        var28 += var19.method185(25239);
                        class36.method344(var13, var26, var24[var29], var20[var29], var28);
                        var20[var29] += var28;
                        var26 += var28;
                    }
                }
                for (int var30 = 0; var30 < var5; var30++) {
                    int var31;
                    if (var6 == null) {
                        var31 = var30;
                    } else {
                        var31 = var6[var30];
                    }
                    if (this.field3713 == 0) {
                        var7[var31] = class98.method706(false, (byte) 100, var24[var30]);
                    } else {
                        var7[var31] = var24[var30];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(III[I)[B")
    public final byte[] method1748(int arg0, int arg1, int arg2, int[] arg3) {
        field3724++;
        if (!this.method1735(arg2 ^ 0xFFFFFC1E, arg0, arg1)) {
            return null;
        }
        if (this.field3708[arg1] == null || this.field3708[arg1][arg0] == null) {
            boolean var5 = this.method1747(arg1, arg3, true, arg0);
            if (!var5) {
                this.method1762(arg1, (byte) 14);
                boolean var6 = this.method1747(arg1, arg3, true, arg0);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class325.method2091(false, this.field3708[arg1][arg0], (byte) 105);
        if (arg2 != -997) {
            field3733 = null;
        }
        if (this.field3713 == 1) {
            this.field3708[arg1][arg0] = null;
            if (this.field3730.field2853[arg1] == 1) {
                this.field3708[arg1] = null;
            }
        } else if (this.field3713 == 2) {
            this.field3708[arg1] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method1749(int arg0, String arg1) {
        field3738++;
        if (!this.method1743(106)) {
            return false;
        }
        if (arg0 != 0) {
            field3733 = null;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field3730.field2849.method480(arg0 ^ 0xFFFFFFA2, class411.method2580(var3, false));
        return this.method1764(var4, false);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(BI)[I")
    public final int[] method1750(byte arg0, int arg1) {
        field3726++;
        if (!this.method1752((byte) -112, arg1)) {
            return null;
        }
        int[] var3 = this.field3730.field2854[arg1];
        if (var3 == null) {
            var3 = new int[this.field3730.field2855[arg1]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        if (arg0 >= -99) {
            this.field3730 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(ILjava/lang/String;)I")
    public final int method1751(int arg0, String arg1) {
        if (arg0 < 19) {
            return -65;
        }
        field3735++;
        if (this.method1743(114)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field3730.field2849.method480(-97, class411.method2580(var3, false));
            return this.method1752((byte) -112, var4) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(BI)Z")
    private final boolean method1752(byte arg0, int arg1) {
        if (arg0 != -112) {
            this.field3734 = false;
        }
        field3732++;
        if (!this.method1743(101)) {
            return false;
        } else if (arg1 >= 0 && arg1 < this.field3730.field2853.length && this.field3730.field2853[arg1] != 0) {
            return true;
        } else if (class170.field2335) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)V")
    public final void method1753(byte arg0) {
        int var2 = 125 % ((70 - arg0) / 54);
        if (this.field3719 != null) {
            for (int var3 = 0; var3 < this.field3719.length; var3++) {
                this.field3719[var3] = null;
            }
        }
        field3701++;
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(B)I")
    public final int method1754(byte arg0) {
        field3715++;
        if (!this.method1743(77)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (arg0 <= 38) {
            field3727 = -101;
        }
        while (this.field3719.length > var4) {
            if (this.field3730.field2855[var4] > 0) {
                var2 += 100;
                var3 += this.method1768(var4, -16254);
            }
            var4++;
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method1755(String arg0, int arg1) {
        field3728++;
        if (arg1 == -1 && this.method1743(arg1 ^ 0xFFFFFF9E)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field3730.field2849.method480(-47, class411.method2580(var3, false));
            this.method1740(4539, var4);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IB)I")
    public final int method1756(int arg0, byte arg1) {
        field3702++;
        if (!this.method1743(126)) {
            return -1;
        }
        int var3 = this.field3730.field2849.method480(90, arg0);
        if (arg1 > -116) {
            this.method1741((String) null, (byte) 39);
        }
        return this.method1752((byte) -112, var3) ? var3 : -1;
    }

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(II)[B")
    public final byte[] method1757(int arg0, int arg1) {
        field3703++;
        if (!this.method1743(124)) {
            return null;
        }
        if (arg0 != -3) {
            method1769(-41);
        }
        if (this.field3730.field2853.length == 1) {
            return this.method1745(arg1, (byte) -90, 0);
        } else if (!this.method1752((byte) -112, arg1)) {
            return null;
        } else if (this.field3730.field2853[arg1] == 1) {
            return this.method1745(0, (byte) -95, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z")
    public final boolean method1758(String arg0, byte arg1, String arg2) {
        field3709++;
        if (!this.method1743(39)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field3730.field2849.method480(94, class411.method2580(var4, false));
        if (this.method1752((byte) -112, var6)) {
            int var7 = this.field3730.field2839[var6].method480(120, class411.method2580(var5, false));
            return arg1 < 34 ? true : this.method1765(false, var6, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "(II)Z")
    public final boolean method1759(int arg0, int arg1) {
        field3731++;
        if (!this.method1743(63)) {
            return false;
        } else if (this.field3730.field2853.length == 1) {
            return this.method1765(false, 0, arg1);
        } else if (!this.method1752((byte) -112, arg1)) {
            return false;
        } else if (this.field3730.field2853[arg1] == 1) {
            return this.method1765(false, arg1, 0);
        } else if (arg0 > -16) {
            return true;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(B)V")
    public static void method1760(byte arg0) {
        field3742 = null;
        field3733 = null;
        if (arg0 != 50) {
            field3725 = 86;
        }
    }

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "(II)V")
    public final void method1761(int arg0, int arg1) {
        if (arg1 > -15) {
            this.method1767((byte) -115);
        }
        field3716++;
        if (this.method1752((byte) -112, arg0) && this.field3708 != null) {
            this.field3708[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(IB)V")
    private final void method1762(int arg0, byte arg1) {
        if (this.field3734) {
            this.field3719[arg0] = this.field3722.method1147(-650, arg0);
        } else {
            this.field3719[arg0] = class98.method706(false, (byte) 109, this.field3722.method1147(-650, arg0));
        }
        field3721++;
        int var3 = -108 / ((arg1 + 39) / 43);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1763(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg4 & 0x3;
        if ((arg1 & 0x1) == 1) {
            int var8 = arg6;
            arg6 = arg5;
            arg5 = var8;
        }
        int var9 = 19 / ((arg0 + 69) / 43);
        field3706++;
        if (var7 == 0) {
            return arg2;
        } else if (var7 == 1) {
            return arg3;
        } else if (var7 == 2) {
            return 7 + 1 - arg2 - arg6;
        } else {
            return 7 - arg3 - (arg5 + -1);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IZ)Z")
    public final boolean method1764(int arg0, boolean arg1) {
        if (arg1) {
            this.method1738((String) null, true);
        }
        field3741++;
        if (!this.method1752((byte) -112, arg0)) {
            return false;
        } else if (this.field3719[arg0] == null) {
            this.method1762(arg0, (byte) 49);
            return this.field3719[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZII)Z")
    public final boolean method1765(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field3725 = -104;
        }
        field3700++;
        if (!this.method1735(5, arg2, arg1)) {
            return false;
        } else if (this.field3708[arg1] != null && this.field3708[arg1][arg2] != null) {
            return true;
        } else if (this.field3719[arg1] == null) {
            this.method1762(arg1, (byte) -87);
            return this.field3719[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "(I)Z")
    public final boolean method1766(int arg0) {
        field3714++;
        if (!this.method1743(70)) {
            return false;
        }
        boolean var2 = true;
        int var3 = -91 / ((arg0 + 43) / 39);
        for (int var4 = 0; var4 < this.field3730.field2844.length; var4++) {
            int var5 = this.field3730.field2844[var4];
            if (this.field3719[var5] == null) {
                this.method1762(var5, (byte) -119);
                if (this.field3719[var5] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "(B)V")
    public final void method1767(byte arg0) {
        if (this.field3708 != null) {
            for (int var2 = 0; var2 < this.field3708.length; var2++) {
                this.field3708[var2] = null;
            }
        }
        field3729++;
        if (arg0 != -78) {
            this.field3708 = null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lpa;ZI)V")
    public class268(class208 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field3713 = arg2;
        this.field3734 = arg1;
        this.field3722 = arg0;
    }

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "(II)I")
    private final int method1768(int arg0, int arg1) {
        field3711++;
        if (!this.method1752((byte) -112, arg0)) {
            return 0;
        } else if (this.field3719[arg0] == null) {
            if (arg1 != -16254) {
                this.method1759(-11, -106);
            }
            return this.field3722.method1142(arg0, false);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "(I)V")
    public static final void method1769(int arg0) {
        if (arg0 != 2651) {
            method1763(-98, 99, 106, 80, -4, 87, 37);
        }
        field3740++;
        if (class446.field6250 == 10 || class446.field6250 == 28) {
            class35.method340(class20.field376 >> 10, (byte) -69, class106.field1447 >> 10, 5000);
        } else {
            class35.method340(class412.field5841.field5332[0] >> 3, (byte) -104, class412.field5841.field5326[0] >> 3, 5000);
        }
        class206.method1342(false);
        class325.method2086(arg0 - 23199);
        class228.method1580(95);
        class404.method2530((byte) -105);
    }

    static {
        new class442(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
    }
}
