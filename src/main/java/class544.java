import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class544 extends class289 {

    @OriginalMember(owner = "client!ms", name = "Q", descriptor = "I")
    public static int field7985 = -1;

    @OriginalMember(owner = "client!ms", name = "P", descriptor = "I")
    public static int field7984 = -1;

    @OriginalMember(owner = "client!ms", name = "K", descriptor = "I")
    public static int field7979;

    @OriginalMember(owner = "client!ms", name = "L", descriptor = "I")
    public static int field7980;

    @OriginalMember(owner = "client!ms", name = "M", descriptor = "I")
    public static int field7981;

    @OriginalMember(owner = "client!ms", name = "N", descriptor = "I")
    public static int field7982;

    @OriginalMember(owner = "client!ms", name = "O", descriptor = "I")
    public static int field7983;

    @OriginalMember(owner = "client!ms", name = "R", descriptor = "I")
    public static int field7986;

    @OriginalMember(owner = "client!ms", name = "S", descriptor = "Lkv;")
    public static class181 field7987;

    @OriginalMember(owner = "client!ms", name = "J", descriptor = "[B")
    private byte[] field7978;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIII)[B")
    public final byte[] method3191(int arg0, int arg1, int arg2, int arg3) {
        field7979++;
        this.field7978 = new byte[arg3 * 2 * arg2 * arg0];
        this.method2846(false, arg0, arg2, arg3);
        if (arg1 != 8004) {
            field7980 = 75;
        }
        return this.field7978;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(FFIFIFILgl;FII[BII)V")
    public static final void method3192(float arg0, float arg1, int arg2, float arg3, int arg4, float arg5, int arg6, class434 arg7, float arg8, int arg9, int arg10, byte[] arg11, int arg12, int arg13) {
        field7982++;
        int var14 = arg4 * arg10;
        float[] var15 = new float[var14];
        for (int var16 = 0; var16 < arg6; var16++) {
            int var19 = arg2;
            arg7.method1353(0, arg5 * 127.0F, arg13, arg4, arg9, -15709, arg3 / (float) arg4, var15, arg0 / (float) arg9, arg10, arg8 / (float) arg10);
            arg3 *= 2.0F;
            arg5 = arg1 * arg5;
            arg0 *= 2.0F;
            arg8 *= 2.0F;
            for (int var20 = 0; var20 < var14; var20++) {
                arg11[var19] = (byte) ((int) ((float) arg11[var19] + var15[var20]));
                var19++;
            }
        }
        int var17 = arg2;
        if (arg12 == -13840) {
            for (int var18 = 0; var18 < var14; var18++) {
                arg11[var17] = (byte) (arg11[var17] + 127);
                var17++;
            }
        }
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(III)Z")
    public static final boolean method3193(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class128.field2002; var3++) {
            class354 var4 = class297.field4438[var3];
            if (var4.field5147 == 1) {
                int var5 = var4.field5156 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field5159 * var5 >> 8) + var4.field5165;
                    int var7 = (var4.field5164 * var5 >> 8) + var4.field5157;
                    int var8 = (var4.field5152 * var5 >> 8) + var4.field5160;
                    int var9 = (var4.field5148 * var5 >> 8) + var4.field5150;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field5147 == 2) {
                int var10 = arg0 - var4.field5156;
                if (var10 > 0) {
                    int var11 = (var4.field5159 * var10 >> 8) + var4.field5165;
                    int var12 = (var4.field5164 * var10 >> 8) + var4.field5157;
                    int var13 = (var4.field5152 * var10 >> 8) + var4.field5160;
                    int var14 = (var4.field5148 * var10 >> 8) + var4.field5150;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field5147 == 3) {
                int var15 = var4.field5165 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field5161 * var15 >> 8) + var4.field5156;
                    int var17 = (var4.field5155 * var15 >> 8) + var4.field5149;
                    int var18 = (var4.field5152 * var15 >> 8) + var4.field5160;
                    int var19 = (var4.field5148 * var15 >> 8) + var4.field5150;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field5147 == 4) {
                int var20 = arg2 - var4.field5165;
                if (var20 > 0) {
                    int var21 = (var4.field5161 * var20 >> 8) + var4.field5156;
                    int var22 = (var4.field5155 * var20 >> 8) + var4.field5149;
                    int var23 = (var4.field5152 * var20 >> 8) + var4.field5160;
                    int var24 = (var4.field5148 * var20 >> 8) + var4.field5150;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field5147 == 5) {
                int var25 = arg1 - var4.field5160;
                if (var25 > 0) {
                    int var26 = (var4.field5161 * var25 >> 8) + var4.field5156;
                    int var27 = (var4.field5155 * var25 >> 8) + var4.field5149;
                    int var28 = (var4.field5159 * var25 >> 8) + var4.field5165;
                    int var29 = (var4.field5164 * var25 >> 8) + var4.field5157;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ms", name = "f", descriptor = "(I)[Lqv;")
    public static final class316[] method3194(int arg0) {
        field7983++;
        if (arg0 != -5817) {
            method3197(-68, -48, 30);
        }
        return new class316[] { class385.field5499, class50.field915, class543.field7972, class49.field912, class504.field7293, class39.field815, class89.field1440, class339.field5018, class459.field6655, class32.field415, class181.field2668, class111.field1638, class176.field2619, class317.field4715, class52.field958, class15.field173, class88.field1421, class224.field3405, class390.field5535, class424.field5992, class168.field2524, class452.field6597, class142.field2188, class19.field209, class5.field25, class181.field2671, class486.field7047, class170.field2536, class467.field6784, class315.field4691, class513.field7462, class167.field2520, class71.field1156, class5.field31, class347.field5088, class21.field222, class241.field3616, class11.field113, class39.field833, class525.field7667, class262.field3954, class258.field3821, class490.field7064, class233.field3482, class436.field6227, class254.field3761, class439.field6249, class214.field3228, class366.field5300, class263.field3981, class275.field4116, class519.field7578, class120.field1868, class511.field7418, class319.field4732, class180.field2658, class202.field3123, class422.field5983, class256.field3792, class474.field6914, class492.field7109, class390.field5537, class525.field7657, class80.field1306, class112.field1660, class37.field803, class287.field4258, class387.field5511, class474.field6917, class335.field4963, class313.field4676, class469.field6803, class345.field5077, class227.field3426, class519.field7528, class92.field1481, class380.field5440, class446.field6359, class280.field4167, class262.field3959, class302.field4478, class438.field6238, class376.field5410, class462.field6686, class134.field2088, class413.field5845, class444.field6333, class475.field6925, class152.field2321, class530.field7832, class461.field6671, class41.field844, class330.field4897, class470.field6822, class501.field7233, class23.field300, class238.field3588, class473.field6894, class270.field4068, class358.field5196, class167.field2509, class483.field7010, class421.field5976, class58.field1049, class494.field7149, class228.field3436, class236.field3556, class146.field2245, class481.field6988, class28.field393, class269.field4046, class306.field4530, class329.field4834, class208.field3158 };
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(BIB)V")
    public final void method1847(byte arg0, int arg1, byte arg2) {
        field7986++;
        int var4 = arg1 * 2;
        int var5 = arg2 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field7978[var10001] = (byte) (var5 * 3 >> 5);
        this.field7978[var6] = (byte) (var5 * 3 >> 5);
        if (arg0 > -113) {
            method3198(-121);
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIIIIBIII)V")
    public static final void method3195(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        field7981++;
        class50 var10 = null;
        for (class50 var11 = (class50) class515.field7469.method863(-1); var11 != null; var11 = (class50) class515.field7469.method865(-1)) {
            if (var11.field931 == arg0 && var11.field924 == arg4 && var11.field919 == arg2 && var11.field930 == arg8) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class50();
            var10.field931 = arg0;
            var10.field930 = arg8;
            var10.field919 = arg2;
            var10.field924 = arg4;
            if (arg4 >= 0 && arg2 >= 0 && arg4 < class69.field1139 && class255.field3763 > arg2) {
                class313.method1989(70, var10);
            }
            class515.field7469.method866((byte) 10, var10);
        }
        var10.field920 = arg7;
        var10.field916 = arg1;
        var10.field929 = arg5;
        int var12 = 116 % ((arg6 - 25) / 39);
        var10.field926 = arg9;
        var10.field928 = arg3;
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "()V")
    public class544() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIIIZZ)V")
    public static final void method3196(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class322.field4795 = arg0;
        class291.field4317 = 0x1 << class322.field4795;
        class185.field2738 = class291.field4317 >> 1;
        class336.field4969 = (int) Math.sqrt((double) (class185.field2738 * class185.field2738 + class185.field2738 * class185.field2738));
        class474.field6913 = class291.field4317 >> 2;
        class111.field1642 = class291.field4317;
        class394.field5608 = arg2;
        class337.field5000 = arg3;
        class272.field4085 = arg4;
        class47.field898 = new class188[arg1][class394.field5608][class337.field5000];
        class393.field5594 = new class24[arg1];
        if (arg5) {
            class303.field4495 = new int[class394.field5608][class337.field5000];
            class18.field198 = new byte[class394.field5608][class337.field5000];
            class539.field7922 = new short[class394.field5608][class337.field5000];
            class277.field4137 = new class188[1][class394.field5608][class337.field5000];
            class477.field6942 = new class24[1];
        } else {
            class303.field4495 = null;
            class18.field198 = null;
            class539.field7922 = null;
            class277.field4137 = null;
            class477.field6942 = null;
        }
        if (arg6) {
            class297.field4444 = new long[arg1][arg2][arg3];
            client.field3117 = new class130[65535];
            class42.field866 = new boolean[65535];
            class234.field3499 = 0;
        } else {
            class297.field4444 = null;
            client.field3117 = null;
            class42.field866 = null;
            class234.field3499 = 0;
        }
        class193.method1317(false);
        class366.field5302 = new class354[1000];
        class269.field4061 = 0;
        class297.field4438 = new class354[1000];
        class128.field2002 = 0;
        class121.field1894 = new int[arg1][class394.field5608 + 1][class337.field5000 + 1];
        class296.field4431 = new class478[5000];
        class504.field7296 = 0;
        class334.field4958 = new boolean[class272.field4085 + class272.field4085 + 1][class272.field4085 + class272.field4085 + 1];
        class214.field3232 = new boolean[class272.field4085 + class272.field4085 + 2][class272.field4085 + class272.field4085 + 2];
        class386.field5506 = null;
    }

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "(III)V")
    public static final void method3197(int arg0, int arg1, int arg2) {
        class188 var3 = class461.field6675[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field2755 != null) {
            var3.field2755 = null;
        }
        if (var3.field2774 != null) {
            var3.field2774 = null;
        }
    }

    @OriginalMember(owner = "client!ms", name = "g", descriptor = "(I)V")
    public static void method3198(int arg0) {
        field7987 = null;
        if (arg0 != -22718) {
            field7984 = -120;
        }
    }
}
