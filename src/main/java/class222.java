import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class222 {

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "Lwi;")
    private class251 field3763 = null;

    @OriginalMember(owner = "client!qm", name = "K", descriptor = "Z")
    private boolean field3785;

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "Lpa;")
    private class2 field3769;

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "Z")
    private boolean field3757;

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "Z")
    public static boolean field3762 = true;

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "[I")
    public static int[] field3766 = new int[128];

    @OriginalMember(owner = "client!qm", name = "Q", descriptor = "I")
    public static int field3791 = 0;

    @OriginalMember(owner = "client!qm", name = "U", descriptor = "Lcd;")
    public static class64 field3794 = class44.method335((byte) 71, "details");

    @OriginalMember(owner = "client!qm", name = "S", descriptor = "Lcd;")
    private static class64 field3793 = class44.method335((byte) 71, "Connected to update server");

    @OriginalMember(owner = "client!qm", name = "E", descriptor = "Lcd;")
    public static class64 field3779 = field3793;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!qm", name = "u", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!qm", name = "v", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!qm", name = "w", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!qm", name = "x", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!qm", name = "y", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!qm", name = "A", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!qm", name = "C", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!qm", name = "D", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!qm", name = "F", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!qm", name = "G", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!qm", name = "H", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!qm", name = "I", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!qm", name = "L", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!qm", name = "M", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!qm", name = "O", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!qm", name = "P", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!qm", name = "R", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!qm", name = "V", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!qm", name = "W", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!qm", name = "X", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!qm", name = "z", descriptor = "Lqm;")
    public static class222 field3775;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "[Ljava/lang/Object;")
    private Object[] field3751;

    @OriginalMember(owner = "client!qm", name = "N", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field3788;

    @OriginalMember(owner = "client!qm", name = "J", descriptor = "[[[I")
    public static int[][][] field3784;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)Z", line = 4)
    private final boolean method1577(int arg0) {
        field3795++;
        if (arg0 < 16) {
            field3793 = (class64) null;
        }
        if (this.field3763 == null) {
            this.field3763 = this.field3769.method9(false);
            if (this.field3763 == null) {
                return false;
            }
            this.field3788 = new Object[this.field3763.field4373][];
            this.field3751 = new Object[this.field3763.field4373];
        }
        return true;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)V", line = 28)
    private final void method1578(int arg0, int arg1) {
        if (arg0 != -1) {
            this.field3751 = (Object[]) null;
        }
        this.field3769.method10((byte) 4, arg1);
        field3750++;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V", line = 41)
    public static void method1579(int arg0) {
        if (arg0 != -1) {
            method1608(125, -4, (byte) -93, 123, -71, -50);
        }
        field3794 = null;
        field3779 = null;
        field3793 = null;
        field3766 = null;
        field3775 = null;
        field3784 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(III)[B", line = 58)
    public final byte[] method1580(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            field3792++;
            return this.method1591(arg1, (int[]) null, arg2, (byte) -102);
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)I", line = 69)
    public final int method1581(int arg0) {
        field3796++;
        if (!this.method1577(93)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 125 / ((-arg0 - 83) / 38);
        for (int var5 = 0; var5 < this.field3751.length; var5++) {
            if (this.field3763.field4374[var5] > 0) {
                var3 += 100;
                var2 += this.method1582(var5, 0);
            }
        }
        if (var3 == 0) {
            return 100;
        } else {
            return var2 * 100 / var3;
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(II)I", line = 111)
    private final int method1582(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field3751 = (Object[]) null;
        }
        field3768++;
        if (this.method1610((byte) -127, arg0)) {
            return this.field3751[arg0] == null ? this.field3769.method3(arg0, (byte) 127) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(III)Z", line = 131)
    private final boolean method1583(int arg0, int arg1, int arg2) {
        field3772++;
        if (!this.method1577(75)) {
            return false;
        } else if (~arg2 <= arg0 && arg1 >= 0 && arg2 < this.field3763.field4358.length && this.field3763.field4358[arg2] > arg1) {
            return true;
        } else if (class262.field4499) {
            throw new IllegalArgumentException(arg2 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIB)Z", line = 157)
    public final boolean method1584(int arg0, int arg1, byte arg2) {
        field3790++;
        if (!this.method1583(-1, arg0, arg1)) {
            return false;
        } else if (this.field3788[arg1] != null && this.field3788[arg1][arg0] != null) {
            return true;
        } else if (this.field3751[arg1] == null) {
            this.method1607(arg1, -9300);
            if (arg2 != -71) {
                this.field3763 = (class251) null;
            }
            return this.field3751[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(II)Z", line = 188)
    public final boolean method1585(int arg0, int arg1) {
        field3781++;
        if (!this.method1577(57)) {
            return false;
        } else if (this.field3763.field4358.length == 1) {
            return this.method1584(arg0, 0, (byte) -71);
        } else if (this.method1610((byte) -109, arg0)) {
            if (arg1 != 1) {
                this.method1604((class64) null, (class64) null, 97);
            }
            if (this.field3763.field4358[arg0] != 1) {
                throw new RuntimeException();
            }
            return this.method1584(0, arg0, (byte) -71);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "(I)I", line = 217)
    public final int method1586(int arg0) {
        if (arg0 == 0) {
            field3752++;
            return this.method1577(95) ? this.field3763.field4358.length : -1;
        } else {
            return 63;
        }
    }

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "(I)I", line = 232)
    public final int method1587(int arg0) {
        if (arg0 != -2) {
            field3762 = true;
        }
        field3764++;
        if (!this.method1577(45)) {
            throw new IllegalStateException("");
        }
        return this.field3763.field4370;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZI)[B", line = 248)
    public final byte[] method1588(boolean arg0, int arg1) {
        if (!arg0) {
            return (byte[]) null;
        }
        field3754++;
        if (!this.method1577(104)) {
            return null;
        } else if (this.field3763.field4358.length == 1) {
            return this.method1580(0, arg1, 0);
        } else if (!this.method1610((byte) -54, arg1)) {
            return null;
        } else if (this.field3763.field4358[arg1] == 1) {
            return this.method1580(0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)V", line = 277)
    public final void method1589(byte arg0) {
        if (this.field3788 != null) {
            for (int var2 = 0; var2 < this.field3788.length; var2++) {
                this.field3788[var2] = null;
            }
        }
        field3789++;
        if (arg0 >= -126) {
            this.method1580(-87, -77, -15);
        }
    }

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "(II)I", line = 301)
    public static final int method1590(int arg0, int arg1) {
        field3787++;
        if (arg0 != 1023) {
            field3794 = (class64) null;
        }
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I[IIB)[B", line = 321)
    public final byte[] method1591(int arg0, int[] arg1, int arg2, byte arg3) {
        field3797++;
        if (!this.method1583(-1, arg0, arg2)) {
            return null;
        }
        if (this.field3788[arg2] == null || this.field3788[arg2][arg0] == null) {
            boolean var5 = this.method1595(27711, arg2, arg1);
            if (!var5) {
                this.method1607(arg2, arg3 - 9198);
                boolean var6 = this.method1595(27711, arg2, arg1);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class275.method1906(false, 0, this.field3788[arg2][arg0]);
        if (arg3 != -102) {
            this.method1578(7, 1);
        }
        if (this.field3757) {
            this.field3788[arg2][arg0] = null;
            if (this.field3763.field4358[arg2] == 1) {
                this.field3788[arg2] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "(II)[I", line = 360)
    public final int[] method1592(int arg0, int arg1) {
        field3774++;
        if (!this.method1610((byte) -117, arg1)) {
            return null;
        }
        if (arg0 >= -2) {
            field3762 = true;
        }
        int[] var3 = this.field3763.field4372[arg1];
        if (var3 == null) {
            var3 = new int[this.field3763.field4374[arg1]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lpa;ZZ)V", line = 1123)
    public class222(class2 arg0, boolean arg1, boolean arg2) {
        this.field3785 = arg1;
        this.field3769 = arg0;
        this.field3757 = arg2;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lcd;I)I", line = 397)
    public final int method1593(class64 arg0, int arg1) {
        field3756++;
        if (!this.method1577(20)) {
            return 0;
        }
        class64 var3 = arg0.method522(-41);
        if (arg1 == 0) {
            int var4 = this.field3763.field4363.method599(1, var3.method511((byte) -118));
            return this.method1582(var4, arg1);
        } else {
            return -12;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILcd;)V", line = 417)
    public final void method1594(int arg0, class64 arg1) {
        field3780++;
        if (this.method1577(94) && arg0 == 0) {
            class64 var3 = arg1.method522(-41);
            int var4 = this.field3763.field4363.method599(arg0 + 1, var3.method511((byte) 123));
            this.method1578(-1, var4);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(II[I)Z", line = 446)
    private final boolean method1595(int arg0, int arg1, int[] arg2) {
        field3776++;
        if (!this.method1610((byte) -52, arg1)) {
            return false;
        } else if (this.field3751[arg1] == null) {
            return false;
        } else {
            int var4 = this.field3763.field4374[arg1];
            int[] var5 = this.field3763.field4372[arg1];
            boolean var6 = true;
            if (this.field3788[arg1] == null) {
                this.field3788[arg1] = new Object[this.field3763.field4358[arg1]];
            }
            Object[] var7 = this.field3788[arg1];
            if (arg0 != 27711) {
                return true;
            }
            for (int var8 = 0; var8 < var4; var8++) {
                int var9;
                if (var5 == null) {
                    var9 = var8;
                } else {
                    var9 = var5[var8];
                }
                if (var7[var9] == null) {
                    var6 = false;
                    break;
                }
            }
            if (var6) {
                return true;
            }
            byte[] var10;
            if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
                var10 = class275.method1906(false, 0, this.field3751[arg1]);
            } else {
                var10 = class275.method1906(true, 0, this.field3751[arg1]);
                class13 var11 = new class13(var10);
                var11.method119(var11.field254.length, 5, -111, arg2);
            }
            byte[] var12;
            try {
                var12 = class289.method1992(var10, -42);
            } catch (RuntimeException var31) {
                throw class206.method1437(var31, "T3 - " + (arg2 != null) + "," + arg1 + "," + var10.length + "," + class118.method841(var10, var10.length, true) + "," + class118.method841(var10, var10.length - 2, true) + "," + this.field3763.field4366[arg1] + "," + this.field3763.field4370);
            }
            if (this.field3785) {
                this.field3751[arg1] = null;
            }
            if (var4 > 1) {
                int var14 = var12.length;
                int var32 = var14 - 1;
                int var15 = var12[var32] & 0xFF;
                int[] var16 = new int[var4];
                class13 var17 = new class13(var12);
                int var18 = var32 - var15 * 4 * var4;
                var17.field281 = var18;
                for (int var19 = 0; var19 < var15; var19++) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < var4; var21++) {
                        if (var5 != null) {
                        }
                        var20 += var17.method105((byte) 108);
                        var16[var21] += var20;
                    }
                }
                byte[][] var22 = new byte[var4][];
                for (int var23 = 0; var23 < var4; var23++) {
                    var22[var23] = new byte[var16[var23]];
                    var16[var23] = 0;
                }
                int var24 = 0;
                var17.field281 = var18;
                for (int var25 = 0; var25 < var15; var25++) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < var4; var27++) {
                        var26 += var17.method105((byte) 73);
                        class95.method721(var12, var24, var22[var27], var16[var27], var26);
                        var16[var27] += var26;
                        var24 += var26;
                    }
                }
                for (int var28 = 0; var28 < var4; var28++) {
                    int var29;
                    if (var5 == null) {
                        var29 = var28;
                    } else {
                        var29 = var5[var28];
                    }
                    if (this.field3757) {
                        var7[var29] = var22[var28];
                    } else {
                        var7[var29] = class114.method818(false, 136, var22[var28]);
                    }
                }
            } else {
                int var30;
                if (var5 == null) {
                    var30 = 0;
                } else {
                    var30 = var5[0];
                }
                if (this.field3757) {
                    var7[var30] = var12;
                } else {
                    var7[var30] = class114.method818(false, 136, var12);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(ILcd;)Z", line = 644)
    public final boolean method1596(int arg0, class64 arg1) {
        field3760++;
        if (arg0 != -4) {
            field3755 = -71;
        }
        if (this.method1577(arg0 + 95)) {
            class64 var3 = arg1.method522(-41);
            int var4 = this.field3763.field4363.method599(arg0 + 5, var3.method511((byte) -83));
            return var4 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "(II)V", line = 670)
    public final void method1597(int arg0, int arg1) {
        field3782++;
        if (!this.method1610((byte) -69, arg1)) {
            return;
        }
        if (this.field3788 != null) {
            this.field3788[arg1] = null;
        }
        if (arg0 != 0) {
            this.method1586(1);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BIIIIII)V", line = 688)
    public static final void method1598(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3765++;
        class198.method1389(-13173, arg2);
        int var7 = 0;
        int var8 = arg2 - arg5;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg2;
        int var10 = -arg2;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int var15 = arg1 - var8;
        int var16 = arg1 + var8;
        int[] var17 = class124.field2241[arg4];
        class31.method268(var15, 118, arg1 - arg2, var17, arg6);
        class31.method268(var16, arg0 + 102, var15, var17, arg3);
        class31.method268(arg1 + arg2, 127, var16, var17, arg6);
        if (arg0 != 22) {
            return;
        }
        while (var7 < var9) {
            var14 += 2;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class89.field1605[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            var13 += 2;
            var10 += var13;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var9 < var8) {
                    int[] var18 = class124.field2241[arg4 + var9];
                    int[] var19 = class124.field2241[arg4 - var9];
                    int var20 = arg1 + var7;
                    int var21 = class89.field1605[var9];
                    int var22 = arg1 - var7;
                    int var23 = arg1 + var21;
                    int var24 = arg1 - var21;
                    class31.method268(var24, 121, var22, var18, arg6);
                    class31.method268(var23, 127, var24, var18, arg3);
                    class31.method268(var20, 122, var23, var18, arg6);
                    class31.method268(var24, 120, var22, var19, arg6);
                    class31.method268(var23, 127, var24, var19, arg3);
                    class31.method268(var20, arg0 + 99, var23, var19, arg6);
                } else {
                    int[] var25 = class124.field2241[arg4 + var9];
                    int var26 = arg1 + var7;
                    int[] var27 = class124.field2241[arg4 - var9];
                    int var28 = arg1 - var7;
                    class31.method268(var26, 118, var28, var25, arg6);
                    class31.method268(var26, 119, var28, var27, arg6);
                }
            }
            int[] var29 = class124.field2241[arg4 + var7];
            int[] var30 = class124.field2241[arg4 - var7];
            int var31 = arg1 + var9;
            int var32 = arg1 - var9;
            if (var8 > var7) {
                int var33 = var11 < var7 ? class89.field1605[var7] : var11;
                int var34 = arg1 + var33;
                int var35 = arg1 - var33;
                class31.method268(var35, 122, var32, var29, arg6);
                class31.method268(var34, 124, var35, var29, arg3);
                class31.method268(var31, 124, var34, var29, arg6);
                class31.method268(var35, 120, var32, var30, arg6);
                class31.method268(var34, 123, var35, var30, arg3);
                class31.method268(var31, 127, var34, var30, arg6);
            } else {
                class31.method268(var31, 123, var32, var29, arg6);
                class31.method268(var31, 125, var32, var30, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "(II)Z", line = 816)
    public final boolean method1599(int arg0, int arg1) {
        field3778++;
        if (!this.method1610((byte) -61, arg0)) {
            return false;
        } else if (this.field3751[arg0] == null) {
            this.method1607(arg0, -9300);
            if (this.field3751[arg0] == null) {
                if (arg1 <= 83) {
                    this.method1587(-19);
                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IB)I", line = 843)
    public final int method1600(int arg0, byte arg1) {
        if (arg1 > -34) {
            this.method1610((byte) -33, 85);
        }
        field3758++;
        return this.method1610((byte) -70, arg0) ? this.field3763.field4358[arg0] : 0;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lcd;Lcd;Z)Z", line = 860)
    public final boolean method1601(class64 arg0, class64 arg1, boolean arg2) {
        field3761++;
        if (!this.method1577(53)) {
            return false;
        }
        if (arg2) {
            field3762 = false;
        }
        class64 var4 = arg0.method522(-41);
        class64 var5 = arg1.method522(-41);
        int var6 = this.field3763.field4363.method599(1, var4.method511((byte) 112));
        if (this.method1610((byte) -95, var6)) {
            int var7 = this.field3763.field4377[var6].method599(1, var5.method511((byte) -92));
            return this.method1584(var7, var6, (byte) -71);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(ILcd;)Z", line = 884)
    public final boolean method1602(int arg0, class64 arg1) {
        field3777++;
        int var3 = -30 % ((-arg0 - 35) / 60);
        if (this.method1577(71)) {
            class64 var4 = arg1.method522(-41);
            int var5 = this.field3763.field4363.method599(1, var4.method511((byte) -105));
            return this.method1599(var5, 122);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IZZ)V", line = 905)
    public final void method1603(int arg0, boolean arg1, boolean arg2) {
        field3783++;
        if (!this.method1577(43)) {
            return;
        }
        if (arg0 != 2) {
            this.method1602(57, (class64) null);
        }
        if (arg1) {
            this.field3763.field4357 = null;
            this.field3763.field4363 = null;
        }
        if (arg2) {
            this.field3763.field4377 = null;
            this.field3763.field4381 = (int[][]) null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lcd;Lcd;I)[B", line = 931)
    public final byte[] method1604(class64 arg0, class64 arg1, int arg2) {
        field3773++;
        if (arg2 != 100) {
            this.method1577(47);
        }
        if (!this.method1577(arg2 - 81)) {
            return null;
        }
        class64 var4 = arg1.method522(-41);
        class64 var5 = arg0.method522(-41);
        int var6 = this.field3763.field4363.method599(1, var4.method511((byte) 115));
        if (this.method1610((byte) -108, var6)) {
            int var7 = this.field3763.field4377[var6].method599(1, var5.method511((byte) 90));
            return this.method1580(0, var7, var6);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "(I)Z", line = 956)
    public final boolean method1605(int arg0) {
        field3786++;
        if (!this.method1577(33)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field3763.field4362.length; var3++) {
            int var4 = this.field3763.field4362[var3];
            if (this.field3751[var4] == null) {
                this.method1607(var4, -9300);
                if (this.field3751[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "(ILcd;)I", line = 1000)
    public final int method1606(int arg0, class64 arg1) {
        field3753++;
        if (!this.method1577(84)) {
            return -1;
        }
        class64 var3 = arg1.method522(-41);
        int var4 = this.field3763.field4363.method599(1, var3.method511((byte) 106));
        if (arg0 <= 48) {
            return -53;
        } else if (this.method1610((byte) -91, var4)) {
            return var4;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "(II)V", line = 1022)
    private final void method1607(int arg0, int arg1) {
        field3759++;
        if (this.field3785) {
            this.field3751[arg0] = this.field3769.method6(arg0, -14184);
        } else {
            this.field3751[arg0] = class114.method818(false, 136, this.field3769.method6(arg0, -14184));
        }
        if (arg1 != -9300) {
            this.method1601((class64) null, (class64) null, false);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIBIII)V", line = 1044)
    public static final void method1608(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field3771++;
        if (arg2 != 61) {
            return;
        }
        if (class290.field4976 <= arg5 && arg3 <= class153.field2714 && arg4 >= class180.field3098 && arg1 <= class201.field3444) {
            client.method1759(arg5, arg4, arg1, arg0, arg3, 85);
        } else {
            class287.method1985(arg5, arg3, arg0, arg1, arg4, arg2 - 174);
        }
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(III)[B", line = 1062)
    public final byte[] method1609(int arg0, int arg1, int arg2) {
        field3770++;
        if (!this.method1583(-1, arg2, arg1)) {
            return null;
        }
        if (this.field3788[arg1] == null || this.field3788[arg1][arg2] == null) {
            boolean var4 = this.method1595(27711, arg1, (int[]) null);
            if (!var4) {
                this.method1607(arg1, -9300);
                boolean var5 = this.method1595(27711, arg1, (int[]) null);
                if (!var5) {
                    return null;
                }
            }
        }
        return arg0 < 113 ? (byte[]) null : class275.method1906(false, 0, this.field3788[arg1][arg2]);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BI)Z", line = 1096)
    private final boolean method1610(byte arg0, int arg1) {
        if (arg0 >= -29) {
            return false;
        }
        field3767++;
        if (!this.method1577(57)) {
            return false;
        } else if (arg1 >= 0 && arg1 < this.field3763.field4358.length && this.field3763.field4358[arg1] != 0) {
            return true;
        } else if (class262.field4499) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }
}
