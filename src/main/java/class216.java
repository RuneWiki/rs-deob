import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class216 {

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "Lef;")
    private class221 field3422 = new class221();

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    private int field3430;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    private int field3433;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "Lnj;")
    private class144 field3438;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field3424 = 0;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public static int field3434 = 0;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "Ljava/lang/String;")
    public static String field3435 = "glow1:";

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "Lcc;")
    public static class216 field3426 = new class216(64);

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "Z")
    public static boolean field3439;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "[I")
    public static int[] field3427;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)V")
    public final void method1548(int arg0, int arg1) {
        if (class39.field549 != null) {
            for (class155 var3 = (class155) this.field3422.method1580(32); var3 != null; var3 = (class155) this.field3422.method1583(false)) {
                if (var3.method1147((byte) 113)) {
                    if (var3.method1150(256) == null) {
                        var3.method1922(-1);
                        var3.method986(0);
                        this.field3433++;
                    }
                } else if (((long) arg0) < (++var3.field2242)) {
                    class155 var4 = class39.field549.method1(true, var3);
                    this.field3438.method1032(false, var4, var3.field4459);
                    class134.method967(var4, (byte) -29, var3);
                    var3.method1922(-1);
                    var3.method986(arg1);
                }
            }
        }
        field3440++;
        if (arg1 != 0) {
            this.field3433 = 103;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIIIILwg;IZJ)Z")
    public static final boolean method1549(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class178 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class241.field3841 == class220.field3533;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var24 = arg2; var24 < arg2 + arg4; var24++) {
                if (var15 < 0 || var24 < 0 || var15 >= class106.field1537 || var24 >= class232.field3724) {
                    return false;
                }
                class286 var25 = class220.field3525[arg0][var15][var24];
                if (var25 != null && var25.field4541 >= 5) {
                    return false;
                }
            }
        }
        class166 var16 = new class166();
        var16.field2683 = arg11;
        var16.field2680 = arg0;
        var16.field2682 = arg5;
        var16.field2687 = arg6;
        var16.field2695 = arg7;
        var16.field2681 = arg8;
        var16.field2693 = arg9;
        var16.field2678 = arg1;
        var16.field2684 = arg2;
        var16.field2688 = arg1 + arg3 - 1;
        var16.field2692 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; var17++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var17 > arg1) {
                    var21++;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class220.field3525[var22][var17][var20] == null) {
                        class220.field3525[var22][var17][var20] = new class286(var22, var17, var20);
                    }
                }
                class286 var23 = class220.field3525[arg0][var17][var20];
                var23.field4530[var23.field4541] = var16;
                var23.field4536[var23.field4541] = var21;
                var23.field4519 |= var21;
                var23.field4541++;
                if (var13 && class253.field4176[var17][var20] != 0) {
                    var14 = class253.field4176[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
                for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
                    if (class253.field4176[var18][var19] == 0) {
                        class253.field4176[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class94.field1399[class29.field342++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public static final void method1550(int arg0) {
        class88.field1307 = 0;
        if (arg0 != 31246) {
            method1555(-20, 0, (byte) -122, 35, 70);
        }
        field3421++;
        class121.field1773 = 0;
        class81.method593((byte) -117);
        class196.method1452(arg0 ^ 0x4504);
        class159.method1186(-8);
        class184.method1373(-10584);
        for (int var1 = 0; var1 < class88.field1307; var1++) {
            int var3 = class115.field1668[var1];
            if (class264.field4290 != class92.field1374[var3].field1977) {
                if (class92.field1374[var3].field353 > 0) {
                    class143.method1022(class92.field1374[var3], 187);
                }
                class92.field1374[var3] = null;
            }
        }
        if (class221.field3534 != class50.field732.field2511) {
            throw new RuntimeException("gpp1 pos:" + class50.field732.field2511 + " psize:" + class221.field3534);
        }
        for (int var2 = 0; var2 < class121.field1772; var2++) {
            if (class92.field1374[class207.field3326[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class121.field1772);
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/lang/Object;IJ)V")
    public final void method1551(Object arg0, int arg1, long arg2) {
        field3436++;
        this.method1552(95, arg2);
        if (this.field3433 == arg1) {
            class155 var5 = (class155) this.field3422.method1581(95);
            var5.method1922(-1);
            var5.method986(0);
        } else {
            this.field3433--;
        }
        class257 var6 = new class257(arg0);
        this.field3438.method1032(false, var6, arg2);
        this.field3422.method1584(var6, (byte) 114);
        var6.field2242 = 0L;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IJ)V")
    public final void method1552(int arg0, long arg1) {
        field3423++;
        if (arg0 <= 28) {
            return;
        }
        class155 var4 = (class155) this.field3438.method1034(arg1, (byte) 21);
        if (var4 != null) {
            var4.method1922(-1);
            var4.method986(0);
            this.field3433++;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(JB)Ljava/lang/Object;")
    public final Object method1553(long arg0, byte arg1) {
        class155 var4 = (class155) this.field3438.method1034(arg0, (byte) 21);
        field3441++;
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method1150(256);
        if (var5 == null) {
            var4.method1922(-1);
            var4.method986(0);
            this.field3433++;
            return null;
        }
        if (arg1 >= -68) {
            method1559(34);
        }
        if (var4.method1147((byte) 93)) {
            class257 var6 = new class257(var5);
            this.field3438.method1032(false, var6, var4.field4459);
            this.field3422.method1584(var6, (byte) 127);
            var6.field2242 = 0L;
            var4.method1922(-1);
            var4.method986(0);
        } else {
            this.field3422.method1584(var4, (byte) 121);
            var4.field2242 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BI)V")
    public static final void method1554(byte arg0, int arg1) {
        int var2 = 73 % ((arg0 + 59) / 63);
        field3431++;
        short var3 = 256;
        if (arg1 > var3) {
            arg1 = var3;
        }
        if (arg1 > 10) {
            arg1 = 10;
        }
        class229.field3691 += arg1 * 128;
        if (class254.field4198.length < class229.field3691) {
            class229.field3691 -= class254.field4198.length;
            int var4 = (int) (Math.random() * 12.0D);
            class190.method1420(class195.field3145[var4], -16);
        }
        int var5 = 0;
        int var6 = arg1 * 128;
        int var7 = (var3 - arg1) * 128;
        for (int var8 = 0; var8 < var7; var8++) {
            int var27 = class220.field3527[var5 + var6] - (class254.field4198[var5 + class229.field3691 & class254.field4198.length - 1] * arg1 / 6);
            if (var27 < 0) {
                var27 = 0;
            }
            class220.field3527[var5++] = var27;
        }
        for (int var9 = var3 - arg1; var9 < var3; var9++) {
            int var24 = var9 * 128;
            for (int var25 = 0; var25 < 128; var25++) {
                int var26 = (int) (Math.random() * 100.0D);
                if (var26 < 50 && var25 > 10 && var25 < 118) {
                    class220.field3527[var25 + var24] = 255;
                } else {
                    class220.field3527[var24 + var25] = 0;
                }
            }
        }
        for (int var10 = 0; var10 < var3 - arg1; var10++) {
            class26.field300[var10] = class26.field300[arg1 + var10];
        }
        for (int var11 = var3 - arg1; var11 < var3; var11++) {
            class26.field300[var11] = (int) (Math.sin((double) class142.field2288 / 14.0D) * 16.0D + Math.sin((double) class142.field2288 / 15.0D) * 14.0D + Math.sin((double) class142.field2288 / 16.0D) * 12.0D);
            class142.field2288++;
        }
        class122.field1779 += arg1;
        int var12 = ((class264.field4290 & 0x1) + arg1) / 2;
        if (var12 <= 0) {
            return;
        }
        for (int var13 = 0; var13 < class122.field1779; var13++) {
            int var22 = (int) (Math.random() * 124.0D) + 2;
            int var23 = (int) (Math.random() * 128.0D) + 128;
            class220.field3527[(var23 << 7) + var22] = 192;
        }
        class122.field1779 = 0;
        for (int var14 = 0; var14 < var3; var14++) {
            int var19 = var14 * 128;
            int var20 = 0;
            for (int var21 = -var12; var21 < 128; var21++) {
                if (var21 + var12 < 128) {
                    var20 += class220.field3527[var12 + var21 + var19];
                }
                if (var21 - var12 - 1 >= 0) {
                    var20 -= class220.field3527[var19 + var21 - (var12 + 1)];
                }
                if (var21 >= 0) {
                    class92.field1387[var19 + var21] = var20 / (var12 * 2 + 1);
                }
            }
        }
        for (int var15 = 0; var15 < 128; var15++) {
            int var16 = 0;
            for (int var17 = -var12; var17 < var3; var17++) {
                int var18 = var17 * 128;
                if (var3 > (var12 + var17)) {
                    var16 += class92.field1387[var12 * 128 + var15 + var18];
                }
                if (var17 - var12 - 1 >= 0) {
                    var16 -= class92.field1387[var15 + var18 - ((var12 + 1) * 128)];
                }
                if (var17 >= 0) {
                    class220.field3527[var15 + var18] = var16 / (var12 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIBII)I")
    public static final int method1555(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field3428++;
        if (arg2 >= -90) {
            return 70;
        } else {
            int var5 = 65536 - class47.field695[arg1 * 1024 / arg4] >> 1;
            return ((65536 - var5) * arg0 >> 16) + (arg3 * var5 >> 16);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
    public final void method1556(byte arg0) {
        if (arg0 > 66) {
            field3425++;
            this.field3422.method1585((byte) -2);
            this.field3438.method1035(95);
            this.field3433 = this.field3430;
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)I")
    public final int method1557(byte arg0) {
        field3432++;
        int var2 = 0;
        for (class155 var3 = (class155) this.field3422.method1580(32); var3 != null; var3 = (class155) this.field3422.method1583(false)) {
            if (!var3.method1147((byte) 76)) {
                var2++;
            }
        }
        if (arg0 <= 32) {
            method1549(122, 88, 56, 33, 33, -9, 26, -60, (class178) null, 47, true, 96L);
        }
        return var2;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
    public final void method1558(int arg0) {
        field3437++;
        for (class155 var2 = (class155) this.field3422.method1580(32); var2 != null; var2 = (class155) this.field3422.method1583(false)) {
            if (var2.method1147((byte) 113)) {
                var2.method1922(-1);
                var2.method986(0);
                this.field3433++;
            }
        }
        if (arg0 > -14) {
            this.method1557((byte) -25);
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V")
    public static void method1559(int arg0) {
        field3427 = null;
        int var1 = -117 % ((58 - arg0) / 38);
        field3435 = null;
        field3426 = null;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(I)V")
    public class216(int arg0) {
        this.field3430 = arg0;
        this.field3433 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field3438 = new class144(var2);
    }
}
