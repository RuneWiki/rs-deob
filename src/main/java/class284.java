import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public abstract class class284 {

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public int field4551;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public int field4557;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public int field4559;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public int field4564;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
    public int field4565;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    public int field4566;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "Lkk;")
    public static class67 field4558;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
    public static final void method1865(int arg0, int arg1, int arg2) {
        field4560++;
        class307 var3 = class218.method1425(arg1, (byte) -124);
        int var4 = var3.field4940;
        int var5 = var3.field4943;
        int var6 = var3.field4935;
        int var7 = class250.field3900[var6 - var4];
        if (arg0 < 0 || var7 < arg0) {
            arg0 = 0;
        }
        int var8 = var7 << var4;
        class233.method1529(arg2 + arg2, var5, arg0 << var4 & var8 | ~var8 & class189.field2864[var5]);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1866(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4555++;
        if (arg0 < 84) {
            method1870((byte) 71);
        }
        if (class261.field4204 <= arg3 - arg5 && class18.field310 >= (arg3 + arg5) && class271.field4322 <= (arg1 - arg5) && class311.field5001 >= arg1 + arg5) {
            class113.method722(arg5, arg3, arg6, arg2, arg1, (byte) 112, arg4);
        } else {
            class124.method797(-26982, arg3, arg4, arg5, arg6, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZI)V")
    public static final void method1867(boolean arg0, int arg1) {
        class243.field3813 = new int[104];
        class131.field1833 = new int[104];
        class174.field2459 = new int[104];
        field4562++;
        class137.field1873 = 99;
        int var2 = 93 / ((arg1 + 44) / 40);
        byte var3;
        if (arg0) {
            var3 = 1;
        } else {
            var3 = 4;
        }
        class20.field328 = new int[5];
        class124.field1753 = new byte[var3][104][104];
        class208.field3087 = new int[104];
        class109.field1551 = new byte[var3][104][104];
        class39.field588 = new int[104];
        class257.field4161 = new int[var3][105][105];
        class16.field284 = new byte[var3][104][104];
        class18.field313 = new byte[var3][104][104];
        class184.field2796 = new byte[var3][105][105];
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1868(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg8 != 0) {
            field4558 = null;
        }
        if (arg4 == arg9 && arg1 == arg6 && arg0 == arg2 && arg3 == arg5) {
            class312.method2113(arg1, arg3, arg9, false, arg7, arg2);
        } else {
            int var10 = arg9;
            int var11 = arg1;
            int var12 = arg1 * 3;
            int var13 = arg9 * 3;
            int var14 = arg4 * 3;
            int var15 = arg6 * 3;
            int var16 = arg0 * 3;
            int var17 = arg5 * 3;
            int var18 = var14 + arg2 - arg9 - var16;
            int var19 = var16 - (var14 - var13) - var14;
            int var20 = var17 + var12 - var15 - var15;
            int var21 = arg3 + var15 - arg1 - var17;
            int var22 = var15 - var12;
            int var23 = var14 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var21 * var26;
                int var28 = var18 * var26;
                int var29 = var20 * var25;
                int var30 = var19 * var25;
                int var31 = var23 * var24;
                int var32 = var22 * var24;
                int var33 = (var28 - (-var30 - var31) >> 12) + arg9;
                int var34 = arg1 + (var27 + var32 + var29 >> 12);
                class312.method2113(var11, var34, var10, false, arg7, var33);
                var11 = var34;
                var10 = var33;
            }
        }
        field4561++;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIILrl;ILnj;ILam;I)V")
    public static final void method1869(int arg0, int arg1, int arg2, class310 arg3, int arg4, class240 arg5, int arg6, class314 arg7, int arg8) {
        field4552++;
        class309 var9 = new class309();
        var9.field4971 = arg4 * 128;
        if (arg2 != 28549) {
            method1867(false, 74);
        }
        var9.field4968 = arg8;
        var9.field4980 = arg6 * 128;
        if (arg5 != null) {
            var9.field4974 = arg5.field3728;
            var9.field4981 = arg5.field3716;
            var9.field4960 = arg5.field3742;
            var9.field4975 = arg5;
            int var10 = arg5.field3713;
            var9.field4972 = arg5.field3698;
            int var11 = arg5.field3760;
            var9.field4973 = arg5.field3743;
            if (arg0 == 1 || arg0 == 3) {
                var10 = arg5.field3760;
                var11 = arg5.field3713;
            }
            var9.field4959 = (arg4 + var11) * 128;
            var9.field4969 = (arg6 + var10) * 128;
            var9.field4976 = arg5.field3749 * 128;
            if (arg5.field3766 != null) {
                var9.field4962 = true;
                var9.method2100(true);
            }
            if (var9.field4973 != null) {
                var9.field4964 = var9.field4972 + ((int) (Math.random() * (double) (var9.field4981 - var9.field4972)));
            }
            class153.field2128.method370((byte) -22, var9);
        } else if (arg3 != null) {
            var9.field4966 = arg3;
            class211 var12 = arg3.field4993;
            if (var12.field3173 != null) {
                var9.field4962 = true;
                var12 = var12.method1316((byte) 28);
            }
            if (var12 != null) {
                var9.field4959 = (var12.field3122 + arg4) * 128;
                var9.field4969 = (var12.field3122 + arg6) * 128;
                var9.field4960 = class157.method974(56, arg3);
                var9.field4974 = var12.field3163;
                var9.field4976 = var12.field3142 * 128;
            }
            class75.field1056.method370((byte) -22, var9);
        } else if (arg7 != null) {
            var9.field4983 = arg7;
            var9.field4969 = (arg6 + arg7.method1683(-120)) * 128;
            var9.field4959 = (arg7.method1683(-115) + arg4) * 128;
            var9.field4960 = class58.method366(3640, arg7);
            var9.field4976 = arg7.field5030 * 128;
            var9.field4974 = arg7.field5042;
            class274.field4357.method1452((long) arg1, var9, 0);
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(III)V")
    public abstract void method489(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
    public static final void method1870(byte arg0) {
        if (arg0 != 56) {
            method1872(-62, (char) 65444);
        }
        for (int var1 = 0; var1 < class232.field3623; var1++) {
            class188 var2 = class4.method17(arg0 + 17831, var1);
            if (var2 != null && var2.field2851 == 0) {
                class31.field470[var1] = 0;
                class189.field2864[var1] = 0;
            }
        }
        class107.field1530 = new class222(16);
        field4556++;
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(III)Lvd;")
    public static final class160 method1871(int arg0, int arg1, int arg2) {
        if (arg1 < 0 || arg1 >= class207.field3086 || arg2 < 0 || arg2 >= class265.field4271) {
            return null;
        }
        class91 var3 = class246.field3856[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        class160 var4 = null;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < var3.field1343; var7++) {
            class160 var8 = var3.field1339[var7];
            if ((var8.field2225 >> 29 & 0x3L) <= 1L && var8.field2234 == arg1 && var8.field2229 == arg2 && (var8.field2224 > var5 || var8.field2228 > var6)) {
                var4 = var8;
                var5 = var8.field2224;
                var6 = var8.field2228;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IC)Z")
    public static final boolean method1872(int arg0, char arg1) {
        field4554++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else if (arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ') {
            return true;
        } else {
            if (arg0 != -8213) {
                method1867(true, 16);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)V")
    public abstract void method487(int arg0, int arg1);

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)V")
    public static void method1873(byte arg0) {
        field4558 = null;
        if (arg0 < 29) {
            method1874((byte) -42);
        }
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(B)Lta;")
    public static final class203 method1874(byte arg0) {
        field4563++;
        int var1 = class137.field1869[0] * class112.field1613[0];
        byte[] var2 = class134.field1847[0];
        class203 var6;
        if (class180.field2728[0]) {
            int[] var3 = new int[var1];
            byte[] var4 = class252.field3945[0];
            for (int var5 = 0; var5 < var1; var5++) {
                var3[var5] = class161.method1003(class32.method199(-16777216, var4[var5] << 24), class298.field4748[class32.method199(255, var2[var5])]);
            }
            var6 = new class269(class242.field3805, class70.field1021, class275.field4376[0], class96.field1381[0], class137.field1869[0], class112.field1613[0], var3);
        } else {
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class298.field4748[class32.method199(255, var2[var8])];
            }
            var6 = new class203(class242.field3805, class70.field1021, class275.field4376[0], class96.field1381[0], class137.field1869[0], class112.field1613[0], var7);
        }
        class282.method1840(true);
        int var9 = 126 / ((3 - arg0) / 52);
        return var6;
    }
}
