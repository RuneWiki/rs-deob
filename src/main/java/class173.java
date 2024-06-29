import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class173 extends class27 {

    @OriginalMember(owner = "client!ta", name = "N", descriptor = "I")
    private int field3427 = 4;

    @OriginalMember(owner = "client!ta", name = "M", descriptor = "I")
    private int field3426 = 4;

    @OriginalMember(owner = "client!ta", name = "O", descriptor = "Lkb;")
    public static class93 field3428 = class76.method390("Wordpack geladen)3", 0);

    @OriginalMember(owner = "client!ta", name = "P", descriptor = "Lkb;")
    public static class93 field3429 = class76.method390("Ladevorgang )2 bitte warten Sie)3", 0);

    @OriginalMember(owner = "client!ta", name = "T", descriptor = "Lkb;")
    public static class93 field3433 = class76.method390("Gegenstand f-Ur Mitglieder", 0);

    @OriginalMember(owner = "client!ta", name = "X", descriptor = "Lkb;")
    public static class93 field3437 = class76.method390("Bitte versuchen Sie)1", 0);

    @OriginalMember(owner = "client!ta", name = "Y", descriptor = "Lkb;")
    public static class93 field3438 = class76.method390("hitmarks", 0);

    @OriginalMember(owner = "client!ta", name = "Q", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!ta", name = "S", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!ta", name = "U", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!ta", name = "W", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!ta", name = "R", descriptor = "Lge;")
    public static class61 field3431;

    @OriginalMember(owner = "client!ta", name = "V", descriptor = "[I")
    public static int[] field3435;

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
    public class173() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)[[I")
    public final int[][] method19(int arg0, int arg1) {
        int var3 = -36 / ((arg0 - 42) / 54);
        int[][] var4 = super.field436.method537(0, arg1);
        if (super.field436.field1771) {
            int var5 = class159.field3209 / this.field3427;
            int var6 = class159.field3205 / this.field3426;
            int[][] var8;
            if (~var6 < -1) {
                int var7 = arg1 % var6;
                var8 = this.method152(class159.field3205 * var7 / var6, 0, 91);
            } else {
                var8 = this.method152(0, 0, 117);
            }
            int[] var9 = var8[0];
            int[] var10 = var8[1];
            int[] var11 = var4[0];
            int[] var12 = var8[2];
            int[] var13 = var4[1];
            int[] var14 = var4[2];
            for (int var15 = 0; ~class159.field3209 < ~var15; ++var15) {
                int var17;
                if (~var5 < -1) {
                    int var16 = var15 % var5;
                    var17 = class159.field3209 * var16 / var5;
                } else {
                    var17 = 0;
                }
                var11[var15] = var9[var17];
                var13[var15] = var10[var17];
                var14[var15] = var12[var17];
            }
        }
        ++field3430;
        return var4;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZ)[I")
    public final int[] method55(int arg0, boolean arg1) {
        ++field3434;
        int[] var3 = super.field447.method1238(arg1, arg0);
        if (super.field447.field3737) {
            int var4 = class159.field3205 / this.field3426;
            int var5 = class159.field3209 / this.field3427;
            int[] var7;
            if (~var4 < -1) {
                int var6 = arg0 % var4;
                var7 = this.method145(0, (byte) 120, class159.field3205 * var6 / var4);
            } else {
                var7 = this.method145(0, (byte) 124, 0);
            }
            for (int var8 = 0; var8 < class159.field3209; ++var8) {
                if (var5 <= 0) {
                    var3[var8] = var7[0];
                } else {
                    int var9 = var8 % var5;
                    var3[var8] = var7[class159.field3209 * var9 / var5];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLve;III)V")
    public static final void method1153(byte arg0, class195 arg1, int arg2, int arg3, int arg4) {
        ++field3436;
        if (~class100.field1841 > -401) {
            if (arg1.field3815 != null) {
                arg1 = arg1.method1256(0);
            }
            if (arg1 != null) {
                if (arg1.field3796) {
                    int var5 = -104 / ((-45 - arg0) / 37);
                    class93 var6 = arg1.field3802;
                    if (~arg1.field3827 != -1) {
                        var6 = class203.method1321(new class93[] { var6, class207.method1347((byte) -68, class106.field1940.field533, arg1.field3827), class178.field3546, class76.field1379, class67.method357((byte) -117, arg1.field3827), class16.field286 }, 109);
                    }
                    if (class144.field2800 != 1) {
                        if (!class103.field1905) {
                            class93[] var7 = arg1.field3780;
                            ++class186.field3672;
                            if (class145.field2830) {
                                var7 = class46.method242(var7, -21826);
                            }
                            if (var7 != null) {
                                for (int var8 = 4; var8 >= 0; --var8) {
                                    if (var7[var8] != null && !var7[var8].method523(124, class152.field2948)) {
                                        ++class50.field800;
                                        byte var9 = 0;
                                        if (var8 == 0) {
                                            var9 = 14;
                                        }
                                        if (~var8 == -2) {
                                            var9 = 23;
                                        }
                                        if (~var8 == -3) {
                                            var9 = 10;
                                        }
                                        if (var8 == 3) {
                                            var9 = 35;
                                        }
                                        if (var8 == 4) {
                                            var9 = 16;
                                        }
                                        class137.method863(var7[var8], 17001, var9, arg3, class203.method1321(new class93[] { class174.field3447, var6 }, 4), arg2, arg4);
                                    }
                                }
                            }
                            if (var7 != null) {
                                for (int var10 = 4; ~var10 <= -1; --var10) {
                                    if (var7[var10] != null && var7[var10].method523(118, class152.field2948)) {
                                        short var11 = 0;
                                        if (arg1.field3827 > class106.field1940.field533) {
                                            var11 = 2000;
                                        }
                                        int var12 = 0;
                                        ++class69.field1276;
                                        if (~var10 == -1) {
                                            var12 = 14 - -var11;
                                        }
                                        if (~var10 == -2) {
                                            var12 = var11 + 23;
                                        }
                                        if (~var10 == -3) {
                                            var12 = var11 + 10;
                                        }
                                        if (var10 == 3) {
                                            var12 = 35 - -var11;
                                        }
                                        if (~var10 == -5) {
                                            var12 = 16 - -var11;
                                        }
                                        class137.method863(var7[var10], 17001, var12, arg3, class203.method1321(new class93[] { class174.field3447, var6 }, -10), arg2, arg4);
                                    }
                                }
                            }
                            class137.method863(class70.field1298, 17001, 1001, arg3, class203.method1321(new class93[] { class174.field3447, var6 }, 11), arg2, arg4);
                            return;
                        }
                        if (~(2 & class75.field1360) == -3) {
                            class137.method863(class207.field4040, 17001, 47, arg3, class203.method1321(new class93[] { class122.field2270, class114.field2126, var6 }, 91), arg2, arg4);
                            ++class39.field650;
                            return;
                        }
                    } else {
                        class137.method863(class154.field3029, 17001, 44, arg3, class203.method1321(new class93[] { class108.field1957, class114.field2126, var6 }, -39), arg2, arg4);
                        ++class122.field2253;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BILrd;)V")
    public final void method15(byte arg0, int arg1, class158 arg2) {
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                this.field3426 = arg2.method1054(128);
            }
        } else {
            this.field3427 = arg2.method1054(128);
        }
        if (arg0 < 106) {
            method1154((byte) -95);
        }
        ++field3432;
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(B)V")
    public static void method1154(byte arg0) {
        field3435 = null;
        field3433 = null;
        if (arg0 != -13) {
            method1153((byte) 66, (class195) null, 125, -110, -26);
        }
        field3431 = null;
        field3429 = null;
        field3428 = null;
        field3438 = null;
        field3437 = null;
    }
}
