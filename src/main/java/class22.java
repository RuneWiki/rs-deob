import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class22 extends class82 {

    @OriginalMember(owner = "client!bj", name = "R", descriptor = "I")
    private int field366 = 4;

    @OriginalMember(owner = "client!bj", name = "bb", descriptor = "I")
    private int field376 = 4;

    @OriginalMember(owner = "client!bj", name = "S", descriptor = "Ldj;")
    public static class44 field367 = class89.method650(255, "<)4col>");

    @OriginalMember(owner = "client!bj", name = "U", descriptor = "I")
    public static int field369 = 4;

    @OriginalMember(owner = "client!bj", name = "V", descriptor = "[I")
    public static int[] field370 = new int[field369];

    @OriginalMember(owner = "client!bj", name = "Q", descriptor = "[[Llj;")
    public static class130[][] field365 = new class130[field369][500];

    @OriginalMember(owner = "client!bj", name = "Z", descriptor = "Ldj;")
    public static class44 field374 = class89.method650(255, "Der Anmelde)2Server ist offline)3");

    @OriginalMember(owner = "client!bj", name = "P", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!bj", name = "T", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!bj", name = "W", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!bj", name = "X", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!bj", name = "Y", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!bj", name = "ab", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIII)V")
    public static final void method160(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field373;
        class99.method707(arg4, arg2, arg3 + arg4, arg2 - -arg0);
        class206.method1345();
        class99.method688(arg4, arg2, arg3, arg0, arg1);
        if (class154.field2679 >= 100) {
            class54.method389(arg2, arg4 - -arg3, -14116, 0, class168.field2896, class214.field3851, 0, arg0 + arg2, arg4);
            int var5 = arg4 - -(class151.field2625 * arg3 / class168.field2896);
            int var6 = class44.field821 * arg0 / class214.field3851 + arg2;
            int var7 = class199.field3518 * arg0 / class214.field3851;
            int var8 = class237.field4405 * arg3 / class168.field2896;
            class99.method694(var5, var6, var8, var7, 16711680, 128);
            class99.method696(var5, var6, var8, var7, 16711680);
            if (~class77.field1493 < -1 && class77.field1493 % 10 < 5) {
                for (class210 var9 = (class210) class192.field3315.method1189(0); var9 != null; var9 = (class210) class192.field3315.method1192((byte) -113)) {
                    if (class157.field2731 == var9.field3756) {
                        int var10 = var9.field3753 * arg3 / class168.field2896 + arg4;
                        int var11 = arg2 - -(var9.field3746 * arg0 / class214.field3851);
                        class99.method688(var10 + -2, var11 + -2, 4, 4, 16776960);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
    public class22() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(II)[[I")
    public final int[][] method6(int arg0, int arg1) {
        ++field368;
        if (arg0 >= -59) {
            method160(-78, 76, 35, -84, 116);
        }
        int[][] var3 = super.field1601.method548(arg1, true);
        if (super.field1601.field1343) {
            int var4 = class129.field2287 / this.field366;
            int var5 = client.field609 / this.field376;
            int[][] var6;
            if (~var5 >= -1) {
                var6 = this.method619(0, true, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method619(client.field609 * var7 / var5, true, 0);
            }
            int[] var8 = var6[1];
            int[] var9 = var6[0];
            int[] var10 = var6[2];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            int[] var13 = var3[0];
            for (int var14 = 0; class129.field2287 > var14; ++var14) {
                int var16;
                if (~var4 < -1) {
                    int var15 = var14 % var4;
                    var16 = class129.field2287 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var13[var14] = var9[var16];
                var11[var14] = var8[var16];
                var12[var14] = var10[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lcc;IIIIII)V")
    public static final void method161(class26 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg0.field466.length;
        for (int var8 = 0; var8 < var7; ++var8) {
            int var21 = arg0.field466[var8] - class191.field3298;
            int var22 = arg0.field462[var8] - class153.field2666;
            int var23 = arg0.field463[var8] - class200.field3546;
            int var24 = arg3 * var23 + arg4 * var21 >> 16;
            int var25 = arg4 * var23 - arg3 * var21 >> 16;
            int var27 = arg2 * var22 - arg1 * var25 >> 16;
            int var28 = arg1 * var22 + arg2 * var25 >> 16;
            if (var28 < 50) {
                return;
            }
            if (arg0.field468 != null) {
                class26.field465[var8] = var24;
                class26.field459[var8] = var27;
                class26.field475[var8] = var28;
            }
            class26.field457[var8] = (var24 << 9) / var28 + class206.field3698;
            class26.field460[var8] = (var27 << 9) / var28 + class206.field3690;
        }
        class206.field3694 = 0;
        int var9 = arg0.field456.length;
        for (int var10 = 0; var10 < var9; ++var10) {
            int var11 = arg0.field456[var10];
            int var12 = arg0.field458[var10];
            int var13 = arg0.field455[var10];
            int var14 = class26.field457[var11];
            int var15 = class26.field457[var12];
            int var16 = class26.field457[var13];
            int var17 = class26.field460[var11];
            int var18 = class26.field460[var12];
            int var19 = class26.field460[var13];
            if ((var14 - var15) * (var19 - var18) - (var16 - var15) * (var17 - var18) > 0) {
                if (class72.field1374 && class14.method123(class216.field3938 + class206.field3698, class206.field3690 + class104.field1897, var17, var18, var19, var14, var15, var16)) {
                    class31.field546 = arg5;
                    class157.field2725 = arg6;
                }
                class206.field3693 = false;
                if (var14 < 0 || var15 < 0 || var16 < 0 || var14 > class206.field3688 || var15 > class206.field3688 || var16 > class206.field3688) {
                    class206.field3693 = true;
                }
                if (arg0.field468 != null && arg0.field468[var10] != -1) {
                    if (!class219.field3965) {
                        if (arg0.field472) {
                            class206.method1339(var17, var18, var19, var14, var15, var16, arg0.field469[var10], arg0.field467[var10], arg0.field476[var10], class26.field465[0], class26.field465[1], class26.field465[3], class26.field459[0], class26.field459[1], class26.field459[3], class26.field475[0], class26.field475[1], class26.field475[3], arg0.field468[var10]);
                        } else {
                            class206.method1339(var17, var18, var19, var14, var15, var16, arg0.field469[var10], arg0.field467[var10], arg0.field476[var10], class26.field465[var11], class26.field465[var12], class26.field465[var13], class26.field459[var11], class26.field459[var12], class26.field459[var13], class26.field475[var11], class26.field475[var12], class26.field475[var13], arg0.field468[var10]);
                        }
                    } else {
                        int var20 = class206.field3689.method369(arg0.field468[var10], (byte) -110);
                        class206.method1338(var17, var18, var19, var14, var15, var16, class62.method464(var20, arg0.field469[var10]), class62.method464(var20, arg0.field467[var10]), class62.method464(var20, arg0.field476[var10]));
                    }
                } else if (arg0.field469[var10] != 12345678) {
                    class206.method1338(var17, var18, var19, var14, var15, var16, arg0.field469[var10], arg0.field467[var10], arg0.field476[var10]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lfj;IB)V")
    public final void method2(class66 arg0, int arg1, byte arg2) {
        ++field371;
        if (arg2 != 68) {
            field374 = null;
        }
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field376 = arg0.method506(255);
            }
        } else {
            this.field366 = arg0.method506(255);
        }
    }

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "(I)V")
    public static void method162(int arg0) {
        field370 = null;
        if (arg0 != -2532) {
            field370 = null;
        }
        field367 = null;
        field374 = null;
        field365 = null;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field375;
        if (arg0 != 25238) {
            return null;
        } else {
            int[] var3 = super.field1595.method603(true, arg1);
            if (super.field1595.field1538) {
                int var4 = client.field609 / this.field376;
                int var5 = class129.field2287 / this.field366;
                int[] var6;
                if (~var4 >= -1) {
                    var6 = this.method620(2652, 0, 0);
                } else {
                    int var7 = arg1 % var4;
                    var6 = this.method620(2652, client.field609 * var7 / var4, 0);
                }
                for (int var8 = 0; var8 < class129.field2287; ++var8) {
                    if (var5 > 0) {
                        int var9 = var8 % var5;
                        var3[var8] = var6[class129.field2287 * var9 / var5];
                    } else {
                        var3[var8] = var6[0];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        ++field364;
        int var8 = arg1 + arg4;
        int var9 = -arg4 + arg3;
        int var10 = arg5 - -arg4;
        int var11 = -arg4 + arg0;
        if (arg6 == -109) {
            for (int var12 = arg1; var8 > var12; ++var12) {
                class42.method290(class108.field1979[var12], -7, arg5, arg0, arg2);
            }
            for (int var13 = arg3; ~var13 < ~var9; --var13) {
                class42.method290(class108.field1979[var13], -7, arg5, arg0, arg2);
            }
            for (int var14 = var8; var14 <= var9; ++var14) {
                int[] var15 = class108.field1979[var14];
                class42.method290(var15, -7, arg5, var10, arg2);
                class42.method290(var15, -7, var10, var11, arg7);
                class42.method290(var15, -7, var11, arg0, arg2);
            }
        }
    }
}
