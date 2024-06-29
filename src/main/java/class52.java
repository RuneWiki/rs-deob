import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class52 extends class44 {

    @OriginalMember(owner = "client!mf", name = "V", descriptor = "Lda;")
    public static class275 field860 = class255.method1672(96, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!mf", name = "Y", descriptor = "I")
    public static int field863 = 0;

    @OriginalMember(owner = "client!mf", name = "U", descriptor = "I")
    public static int field859 = -1;

    @OriginalMember(owner = "client!mf", name = "fb", descriptor = "[Z")
    public static boolean[] field870 = new boolean[8];

    @OriginalMember(owner = "client!mf", name = "hb", descriptor = "I")
    public static int field872 = 0;

    @OriginalMember(owner = "client!mf", name = "gb", descriptor = "Lda;")
    public static class275 field871 = class255.method1672(108, "(R");

    @OriginalMember(owner = "client!mf", name = "kb", descriptor = "Ljava/util/Calendar;")
    public static Calendar field875 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!mf", name = "mb", descriptor = "Lda;")
    private static class275 field877 = class255.method1672(108, "Choose Option");

    @OriginalMember(owner = "client!mf", name = "nb", descriptor = "Lda;")
    public static class275 field878 = field877;

    @OriginalMember(owner = "client!mf", name = "ob", descriptor = "Lda;")
    public static class275 field879 = class255.method1672(124, "loginscreen");

    @OriginalMember(owner = "client!mf", name = "W", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!mf", name = "X", descriptor = "I")
    public int field862;

    @OriginalMember(owner = "client!mf", name = "Z", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!mf", name = "ab", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!mf", name = "eb", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!mf", name = "ib", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!mf", name = "lb", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!mf", name = "T", descriptor = "Lob;")
    public class117 field858;

    @OriginalMember(owner = "client!mf", name = "bb", descriptor = "Lmg;")
    public static class219 field866;

    @OriginalMember(owner = "client!mf", name = "db", descriptor = "[B")
    public byte[] field868;

    @OriginalMember(owner = "client!mf", name = "jb", descriptor = "[Lwb;")
    public static class179[] field874;

    @OriginalMember(owner = "client!mf", name = "cb", descriptor = "[Z")
    public static boolean[] field867;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class147 var20 = new class147(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; --var21) {
                if (class235.field4101[var21][arg1][arg2] == null) {
                    class235.field4101[var21][arg1][arg2] = new class3(var21, arg1, arg2);
                }
            }
            class235.field4101[arg0][arg1][arg2].field45 = var20;
        } else if (arg3 != 1) {
            class111 var24 = new class111(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; --var25) {
                if (class235.field4101[var25][arg1][arg2] == null) {
                    class235.field4101[var25][arg1][arg2] = new class3(var25, arg1, arg2);
                }
            }
            class235.field4101[arg0][arg1][arg2].field44 = var24;
        } else {
            class147 var22 = new class147(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; --var23) {
                if (class235.field4101[var23][arg1][arg2] == null) {
                    class235.field4101[var23][arg1][arg2] = new class3(var23, arg1, arg2);
                }
            }
            class235.field4101[arg0][arg1][arg2].field45 = var22;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)I")
    public final int method260(boolean arg0) {
        if (!arg0) {
            field866 = null;
        }
        ++field873;
        return super.field748 ? 0 : 100;
    }

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "(I)V")
    public static final void method325(int arg0) {
        class139.field2435 = class74.field1219;
        class77.field1282 = class231.field4042;
        class114.field2026 = class267.field4643;
        class151.field2640 = class153.field2690;
        class36.field596 = class196.field3342;
        class236.field4114 = class275.field4772;
        class157.field2757 = class31.field472;
        class25.field419 = class133.field2379;
        class112.field1981 = class59.field988;
        class237.field4123 = class30.field452;
        class248.field4368 = class172.field2990;
        class45.field753 = class251.field4458;
        class82.field1339 = class200.field3420;
        class117.field2085 = class237.field4124;
        class269.field4674 = class210.field3551;
        class174.field3008 = class191.field3283;
        class141.field2498 = class147.field2558;
        class270.field4699 = class193.field3327;
        class234.field4088 = class148.field2588;
        class207.field3508 = class193.field3318;
        class73.field1187 = class232.field4068;
        class42.field714 = class216.field3689;
        class141.field2483 = class179.field3083;
        class14.field221 = class78.field1289;
        class211.field3582 = class17.field252;
        class109.field1926 = class212.field3588;
        class267.field4635 = class162.field2837;
        class117.field2091 = class42.field722;
        class189.field3268 = class48.field814;
        class69.field1116 = class229.field4002;
        class207.field3493 = class193.field3318;
        class197.field3368 = class210.field3541;
        class30.field451 = class141.field2495;
        class123.field2198 = class177.field3043;
        class41.field677 = class86.field1459;
        class18.field259 = class184.field3147;
        class66.field1092 = class207.field3494;
        class89.field1520 = class103.field1713;
        class182.field3128 = class255.field4500;
        class219.field3723 = class262.field4555;
        class42.field705 = class216.field3689;
        class159.field2785 = class16.field231;
        class124.field2215 = class60.field1003;
        class57.field952 = class165.field2868;
        class116.field2073 = class119.field2129;
        class39.field652 = class9.field148;
        class92.field1572 = class31.field470;
        class51.field844 = class211.field3583;
        class137.field2409 = class23.field370;
        field878 = class53.field910;
        class106.field1843 = class275.field4787;
        class92.field1568 = class189.field3270;
        class179.field3086 = class83.field1352;
        class174.field3022 = class108.field1874;
        class85.field1406 = class245.field4325;
        class207.field3502 = class36.field601;
        class109.field1892 = class228.field3853;
        class127.field2252 = class277.field4829;
        class6.field80 = class172.field2994;
        class124.field2211 = class45.field756;
        class224.field3781 = class36.field603;
        class129.field2275 = class53.field908;
        class12.field179 = class143.field2509;
        class57.field957 = class157.field2764;
        class39.field658 = class200.field3419;
        class168.field2934 = class72.field1172;
        class84.field1371 = class109.field1915;
        class97.field1649 = class36.field598;
        class195.field3338 = class26.field428;
        class226.field3831 = class161.field2818;
        class147.field2575 = class53.field911;
        class118.field2104 = class146.field2550;
        class14.field224 = class17.field249;
        class122.field2197 = class175.field3037;
        class172.field2995 = class145.field2536;
        class38.field629 = class232.field4067;
        class33.field488 = class171.field2987;
        class82.field1340 = class200.field3420;
        class181.field3109 = class96.field1639;
        ++field869;
        class76.field1242 = class163.field2846;
        class146.field2556 = class87.field1472;
        class4.field63 = class199.field3393;
        class171.field2977 = class267.field4636;
        class165.field2869 = class38.field637;
        if (arg0 != 0) {
            field878 = null;
        }
        class170.field2974 = class261.field4546;
        class255.field4496 = class148.field2583;
        class122.field2186 = class35.field573;
        class187.field3208 = class129.field2271;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)V")
    public static final void method326(int arg0, int arg1) {
        int var2 = -95 % ((57 - arg0) / 36);
        ++field876;
        class70.field1151 = 1000 / arg1;
    }

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "(I)V")
    public static void method327(int arg0) {
        field877 = null;
        field860 = null;
        field878 = null;
        field871 = null;
        field874 = null;
        field866 = null;
        field867 = null;
        field879 = null;
        if (arg0 != -1) {
            field878 = null;
        }
        field875 = null;
        field870 = null;
    }

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "(I)[B")
    public final byte[] method264(int arg0) {
        ++field865;
        if (arg0 != 4055) {
            this.method260(false);
        }
        if (super.field748) {
            throw new RuntimeException();
        } else {
            return this.field868;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(III)V")
    public static final void method328(int arg0, int arg1, int arg2) {
        ++field861;
        class184 var3 = class147.method1044(arg2, (byte) 37, arg1);
        var3.method1226((byte) 26);
        var3.field3145 = arg0;
    }

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "(I)V")
    public static final void method329(int arg0) {
        ++field864;
        for (int var1 = -1; var1 < class32.field486; ++var1) {
            int var5;
            if (~var1 != 0) {
                var5 = class149.field2595[var1];
            } else {
                var5 = 2047;
            }
            class109 var6 = class16.field238[var5];
            if (var6 != null && var6.field1783 > 0) {
                --var6.field1783;
                if (~var6.field1783 == -1) {
                    var6.field1782 = null;
                }
            }
        }
        if (arg0 != 2047) {
            field879 = null;
        }
        for (int var2 = 0; class181.field3118 > var2; ++var2) {
            int var3 = class228.field3851[var2];
            class165 var4 = class31.field478[var3];
            if (var4 != null && ~var4.field1783 < -1) {
                --var4.field1783;
                if (var4.field1783 == 0) {
                    var4.field1782 = null;
                }
            }
        }
    }
}
