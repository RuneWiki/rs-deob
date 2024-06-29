import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class191 extends class189 {

    @OriginalMember(owner = "client!vb", name = "ib", descriptor = "I")
    public static int field3878 = 0;

    @OriginalMember(owner = "client!vb", name = "mb", descriptor = "I")
    public static int field3882 = 0;

    @OriginalMember(owner = "client!vb", name = "jb", descriptor = "Lgg;")
    private static class63 field3879 = class116.method911(43, "Location");

    @OriginalMember(owner = "client!vb", name = "nb", descriptor = "Lgg;")
    public static class63 field3883 = class116.method911(43, "headicons_hint");

    @OriginalMember(owner = "client!vb", name = "ob", descriptor = "[I")
    public static int[] field3884 = new int[128];

    @OriginalMember(owner = "client!vb", name = "rb", descriptor = "Lgg;")
    public static class63 field3887 = field3879;

    @OriginalMember(owner = "client!vb", name = "tb", descriptor = "Lgg;")
    private static class63 field3889 = class116.method911(43, "Too many incorrect logins from your address)3");

    @OriginalMember(owner = "client!vb", name = "kb", descriptor = "Lgg;")
    public static class63 field3880 = class116.method911(43, "gleiten:");

    @OriginalMember(owner = "client!vb", name = "lb", descriptor = "[[I")
    public static int[][] field3881 = new int[104][104];

    @OriginalMember(owner = "client!vb", name = "qb", descriptor = "Lgg;")
    public static class63 field3886 = field3889;

    @OriginalMember(owner = "client!vb", name = "wb", descriptor = "Lgg;")
    public static class63 field3892 = class116.method911(43, "Bitte geben Sie Ihr Passwort ein)3");

    @OriginalMember(owner = "client!vb", name = "hb", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!vb", name = "sb", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!vb", name = "vb", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!vb", name = "xb", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!vb", name = "gb", descriptor = "Ljc;")
    public static class85 field3876;

    @OriginalMember(owner = "client!vb", name = "ub", descriptor = "Lje;")
    public static class87 field3890;

    @OriginalMember(owner = "client!vb", name = "pb", descriptor = "Ljava/awt/Font;")
    public static Font field3885;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIII)V")
    public static final void method1258(int arg0, int arg1, int arg2, int arg3) {
        class96 var4 = class148.field3117[arg0][arg1][arg2];
        if (var4 != null) {
            class109 var5 = var4.field2271;
            if (var5 != null) {
                var5.field2458 = var5.field2458 * arg3 / 16;
                var5.field2462 = var5.field2462 * arg3 / 16;
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(BI)V")
    public static final void method1259(byte arg0, int arg1) {
        ++field3891;
        if (class144.method1026((byte) -127, arg1)) {
            class56.method548(-1, class23.field539[arg1], 0);
            if (arg0 < 124) {
                method1260((byte) -107);
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
    public class191() {
        super(1, true);
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(B)V")
    public static void method1260(byte arg0) {
        field3880 = null;
        field3887 = null;
        field3886 = null;
        field3885 = null;
        field3876 = null;
        field3883 = null;
        field3884 = null;
        int var1 = 21 % ((-51 - arg0) / 52);
        field3890 = null;
        field3889 = null;
        field3881 = null;
        field3892 = null;
        field3879 = null;
    }

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "(B)V")
    public static final void method1261(byte arg0) {
        for (int var1 = 0; class161.field3317 > var1; ++var1) {
            int var10002 = class10.field242[var1]--;
            if (~class10.field242[var1] <= 9) {
                class82 var3 = class126.field2778[var1];
                if (var3 == null) {
                    var3 = class82.method731(class108.field2446, class43.field1043[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class10.field242[var1] += var3.method728();
                    class126.field2778[var1] = var3;
                }
                if (~class10.field242[var1] > -1) {
                    int var4;
                    if (class136.field2948[var1] == 0) {
                        var4 = class59.field1517;
                    } else {
                        int var5 = (class136.field2948[var1] & 16757046) >> 16;
                        int var6 = (class136.field2948[var1] & 255) * 128;
                        int var7 = var5 * 128 + 64 - class3.field72.field1141;
                        if (~var7 > -1) {
                            var7 = -var7;
                        }
                        int var8 = (65452 & class136.field2948[var1]) >> 8;
                        int var9 = var8 * 128 + -class3.field72.field1144 + 64;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var7 - (-var9 - -128);
                        if (var10 > var6) {
                            class10.field242[var1] = -100;
                            continue;
                        }
                        if (~var10 > -1) {
                            var10 = 0;
                        }
                        var4 = (var6 - var10) * class110.field2471 / var6;
                    }
                    if (var4 > 0) {
                        class120 var11 = var3.method729().method925(class199.field3974);
                        class44 var12 = class44.method447(var11, 100, var4);
                        var12.method417(class21.field498[var1] + -1);
                        class124.field2737.method873(var12);
                    }
                    class10.field242[var1] = -100;
                }
            } else {
                --class161.field3317;
                for (int var2 = var1; ~class161.field3317 < ~var2; ++var2) {
                    class43.field1043[var2] = class43.field1043[var2 - -1];
                    class126.field2778[var2] = class126.field2778[var2 - -1];
                    class21.field498[var2] = class21.field498[var2 - -1];
                    class10.field242[var2] = class10.field242[var2 - -1];
                    class136.field2948[var2] = class136.field2948[var2 + 1];
                }
                --var1;
            }
        }
        ++field3888;
        if (class164.field3377 && !class79.method720((byte) -101)) {
            if (class90.field2106 != 0 && ~class6.field158 != 0) {
                class60.method560(0, 32599, class10.field225, false, class6.field158, class90.field2106);
            }
            class164.field3377 = false;
        } else if (~class90.field2106 != -1 && ~class6.field158 != 0 && !class79.method720((byte) -125)) {
            ++class117.field2617;
            class141.field3031.method854(188, true);
            class141.field3031.method76(class6.field158, (byte) 114);
            class6.field158 = -1;
        }
        if (arg0 != 65) {
            field3887 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field3877;
        int[] var3 = super.field3825.method681(arg1, (byte) -51);
        if (arg0 != 0) {
            method1259((byte) -117, -10);
        }
        if (super.field3825.field1840) {
            int[][] var4 = this.method1244((byte) 20, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            for (int var8 = 0; ~class54.field1430 < ~var8; ++var8) {
                var3[var8] = (var5[var8] - -var6[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(BI)V")
    public static final void method1262(byte arg0, int arg1) {
        ++field3893;
        if (~arg1 != 0) {
            if (class14.field332[arg1]) {
                class90.field2104.method762(arg1, 19054);
                if (class23.field539[arg1] != null) {
                    boolean var2 = true;
                    int var3 = 0;
                    if (arg0 == 92) {
                        while (class23.field539[arg1].length > var3) {
                            if (class23.field539[arg1][var3] != null) {
                                if (class23.field539[arg1][var3].field1432 != 2) {
                                    class23.field539[arg1][var3] = null;
                                } else {
                                    var2 = false;
                                }
                            }
                            ++var3;
                        }
                        if (var2) {
                            class23.field539[arg1] = null;
                        }
                        class14.field332[arg1] = false;
                    }
                }
            }
        }
    }
}
