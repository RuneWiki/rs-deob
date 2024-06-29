import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class222 extends class219 {

    @OriginalMember(owner = "client!e", name = "H", descriptor = "Lij;")
    public class175 field3889 = new class175();

    @OriginalMember(owner = "client!e", name = "P", descriptor = "Lf;")
    public class322 field3897 = new class322();

    @OriginalMember(owner = "client!e", name = "x", descriptor = "Llc;")
    private class278 field3879;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "Lmk;")
    public static class25 field3877 = new class25(0, 0);

    @OriginalMember(owner = "client!e", name = "L", descriptor = "Lke;")
    public static class256 field3893 = class316.method2202("lila:", 27626);

    @OriginalMember(owner = "client!e", name = "J", descriptor = "[I")
    public static int[] field3891 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!e", name = "K", descriptor = "Lke;")
    public static class256 field3892 = class316.method2202("jaune:", 27626);

    @OriginalMember(owner = "client!e", name = "w", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!e", name = "z", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!e", name = "A", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!e", name = "B", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!e", name = "D", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!e", name = "E", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!e", name = "F", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!e", name = "G", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!e", name = "I", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!e", name = "M", descriptor = "I")
    private static int field3894;

    @OriginalMember(owner = "client!e", name = "N", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!e", name = "O", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!e", name = "C", descriptor = "[[[I")
    public static int[][][] field3884;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "()Lfd;", line = 5)
    public final class219 method934() {
        field3880++;
        class234 var1;
        do {
            var1 = (class234) this.field3889.method1277(1);
            if (var1 == null) {
                return null;
            }
        } while (var1.field4017 == null);
        return var1.field4017;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IILnl;)V", line = 24)
    private final void method1526(int arg0, int arg1, class234 arg2) {
        if ((this.field3879.field4776[arg2.field4020] & 0x4) != 0 && arg2.field4005 < 0) {
            int var4 = this.field3879.field4780[arg2.field4020] / class175.field3109;
            int var5 = (var4 + 1048575 - arg2.field4000) / var4;
            arg2.field4000 = arg0 * var4 + arg2.field4000 & 0xFFFFF;
            if (var5 <= arg0) {
                if (this.field3879.field4803[arg2.field4020] == 0) {
                    arg2.field4017 = class133.method948(arg2.field4004, arg2.field4017.method942(), arg2.field4017.method928(), arg2.field4017.method924());
                } else {
                    arg2.field4017 = class133.method948(arg2.field4004, arg2.field4017.method942(), 0, arg2.field4017.method924());
                    this.field3879.method1958((byte) -117, arg2, arg2.field4016.field4943[arg2.field4009] < 0);
                }
                if (arg2.field4016.field4943[arg2.field4009] < 0) {
                    arg2.field4017.method926(-1);
                }
                arg0 = arg2.field4000 / var4;
            }
        }
        arg2.field4017.method912(arg0);
        if (arg1 == -970848160) {
            field3885++;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZI)Lvf;", line = 66)
    public static final class61 method1527(boolean arg0, int arg1) {
        field3895++;
        class61 var2 = (class61) class40.field719.method2077(-13408, (long) arg1);
        if (arg0) {
            field3892 = (class256) null;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class285.field4956.method1016(arg1, 100, 0);
        class61 var4 = new class61(var3);
        var4.method2052(class102.field1846, (int[]) null);
        class40.field719.method2074(var4, (long) arg1, -1);
        return var4;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([III)V", line = 94)
    public final void method941(int[] arg0, int arg1, int arg2) {
        this.field3897.method941(arg0, arg1, arg2);
        field3886++;
        for (class234 var4 = (class234) this.field3889.method1270((byte) -121); var4 != null; var4 = (class234) this.field3889.method1277(1)) {
            if (!this.field3879.method1943(-2, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field4001 >= var6) {
                        this.method1532(var6, arg0, var5 + var6, (byte) 45, var5, var4);
                        var4.field4001 -= var6;
                        break;
                    }
                    this.method1532(var4.field4001, arg0, var5 + var6, (byte) 59, var5, var4);
                    var6 -= var4.field4001;
                    var5 += var4.field4001;
                } while (!this.field3879.method1946(arg0, var6, var5, var4, false));
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIZI)I", line = 132)
    public static final int method1528(int arg0, int arg1, boolean arg2, int arg3) {
        field3887++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg0;
        }
        if (arg2) {
            field3892 = (class256) null;
        }
        if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            return 1023 - arg3;
        }
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(I)V", line = 155)
    public static void method1529(int arg0) {
        if (arg0 != 0) {
            field3893 = (class256) null;
        }
        field3892 = null;
        field3884 = (int[][][]) null;
        field3893 = null;
        field3877 = null;
        field3891 = null;
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V", line = 174)
    public final void method912(int arg0) {
        field3898++;
        this.field3897.method912(arg0);
        for (class234 var2 = (class234) this.field3889.method1270((byte) -121); var2 != null; var2 = (class234) this.field3889.method1277(1)) {
            if (!this.field3879.method1943(-2, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field4001 >= var3) {
                        this.method1526(var3, -970848160, var2);
                        var2.field4001 -= var3;
                        break;
                    }
                    this.method1526(var2.field4001, -970848160, var2);
                    var3 -= var2.field4001;
                } while (!this.field3879.method1946((int[]) null, var3, 0, var2, false));
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIIII)V", line = 209)
    public static final void method1530(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 != 11738) {
            field3877 = (class25) null;
        }
        if (arg6 >= 0 && arg7 >= 0 && arg6 < 103 && arg7 < 103) {
            if (arg0 == 0) {
                class197 var8 = class205.method1456(arg5, arg6, arg7);
                if (var8 != null) {
                    int var9 = Integer.MAX_VALUE & (int) (var8.field3601 >>> 32);
                    if (arg4 == 2) {
                        var8.field3597 = new class101(var9, 2, arg1 + 4, arg5, arg6, arg7, arg2, false, var8.field3597);
                        var8.field3596 = new class101(var9, 2, arg1 + 1 & 0x3, arg5, arg6, arg7, arg2, false, var8.field3596);
                    } else {
                        var8.field3597 = new class101(var9, arg4, arg1, arg5, arg6, arg7, arg2, false, var8.field3597);
                    }
                }
            }
            if (arg0 == 1) {
                class39 var10 = class53.method424(arg5, arg6, arg7);
                if (var10 != null) {
                    int var11 = (int) (var10.field712 >>> 32) & Integer.MAX_VALUE;
                    if (arg4 == 4 || arg4 == 5) {
                        var10.field700 = new class101(var11, 4, arg1, arg5, arg6, arg7, arg2, false, var10.field700);
                    } else if (arg4 == 6) {
                        var10.field700 = new class101(var11, 4, arg1 + 4, arg5, arg6, arg7, arg2, false, var10.field700);
                    } else if (arg4 == 7) {
                        var10.field700 = new class101(var11, 4, (arg1 + 2 & 0x3) + 4, arg5, arg6, arg7, arg2, false, var10.field700);
                    } else if (arg4 == 8) {
                        var10.field700 = new class101(var11, 4, arg1 + 4, arg5, arg6, arg7, arg2, false, var10.field700);
                        var10.field711 = new class101(var11, 4, (arg1 + 2 & 0x3) + 4, arg5, arg6, arg7, arg2, false, var10.field711);
                    }
                }
            }
            if (arg0 == 2) {
                if (arg4 == 11) {
                    arg4 = 10;
                }
                class269 var12 = class48.method384(arg5, arg6, arg7);
                if (var12 != null) {
                    var12.field4590 = new class101((int) (var12.field4601 >>> 32) & Integer.MAX_VALUE, arg4, arg1, arg5, arg6, arg7, arg2, false, var12.field4590);
                }
            }
            if (arg0 == 3) {
                class223 var13 = class37.method286(arg5, arg6, arg7);
                if (var13 != null) {
                    var13.field3905 = new class101((int) (var13.field3902 >>> 32) & Integer.MAX_VALUE, 22, arg1, arg5, arg6, arg7, arg2, false, var13.field3905);
                }
            }
        }
        field3888++;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIZ)I", line = 303)
    public static final int method1531(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3883++;
        if (class255.field4368) {
            class255.field4368 = false;
            arg0 = 1000000;
        }
        class62 var5 = class163.field2889[arg1][arg3];
        float var6 = ((float) arg2 * 0.1F + 0.7F) * var5.field1094;
        int var7 = var5.field1088;
        float var8 = var5.field1091;
        float var9 = var5.field1087;
        if (!arg4) {
            return 95;
        }
        int var10 = var5.field1095;
        int var11 = var5.field1089;
        if (!class74.field1373) {
            var11 = 0;
        }
        if (class205.field3716 != var7 || class92.field1676 != var6 || class74.field1382 != var9 || class189.field3479 != var8 || class269.field4585 != var10 || class66.field1172 != var11) {
            class171.field3036 = 0;
            class108.field1922 = client.field2156;
            class188.field3398 = field3894;
            class180.field3185 = class150.field2678;
            class74.field1382 = var9;
            class92.field1676 = var6;
            class150.field2672 = class105.field1888;
            class269.field4585 = var10;
            class180.field3189 = class146.field2569;
            class41.field739 = class100.field1788;
            class205.field3716 = var7;
            class189.field3479 = var8;
            class66.field1172 = var11;
        }
        if (class171.field3036 < 65536) {
            class171.field3036 += arg0 * 250;
            if (class171.field3036 >= 65536) {
                class171.field3036 = 65536;
            }
            int var12 = class171.field3036 >> 8;
            int var13 = 65536 - class171.field3036 >> 8;
            float var14 = (float) class171.field3036 / 65536.0F;
            class146.field2569 = ((class205.field3716 & 0xFF00FF) * var12 + (class180.field3189 & 0xFF00FF) * var13 & 0xFF00FF00) + ((class205.field3716 & 0xFF00) * var12 + (class180.field3189 & 0xFF00) * var13 & 0xFF0000) >> 8;
            float var15 = (float) (65536 - class171.field3036) / 65536.0F;
            client.field2156 = ((class108.field1922 & 0xFF00FF) * var13 + ((class269.field4585 & 0xFF00FF) * var12) & 0xFF00FF00) + ((class108.field1922 & 0xFF00) * var13 + ((class269.field4585 & 0xFF00) * var12) & 0xFF0000) >> 8;
            field3894 = class188.field3398 * var13 + (class66.field1172 * var12) >> 8;
            class150.field2678 = class189.field3479 * var14 + class180.field3185 * var15;
            class105.field1888 = class92.field1676 * var14 + class150.field2672 * var15;
            class100.field1788 = class74.field1382 * var14 + class41.field739 * var15;
        }
        class169.method1227(class146.field2569, class105.field1888, class100.field1788, class150.field2678);
        class169.method1233(client.field2156, field3894);
        class169.method1230((float) class52.field959, (float) class225.field3920, (float) class130.field2278);
        class169.method1232();
        return client.field2156;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I[IIBILnl;)V", line = 385)
    private final void method1532(int arg0, int[] arg1, int arg2, byte arg3, int arg4, class234 arg5) {
        field3882++;
        if (arg3 <= 37) {
            this.method934();
        }
        if ((this.field3879.field4776[arg5.field4020] & 0x4) != 0 && arg5.field4005 < 0) {
            int var7 = this.field3879.field4780[arg5.field4020] / class175.field3109;
            while (true) {
                int var8 = (var7 + 1048575 - arg5.field4000) / var7;
                if (arg0 < var8) {
                    arg5.field4000 += arg0 * var7;
                    break;
                }
                arg0 -= var8;
                arg5.field4017.method941(arg1, arg4, var8);
                arg4 += var8;
                class133 var9 = arg5.field4017;
                int var10 = 262144 / var7;
                arg5.field4000 += var7 * var8 - 1048576;
                int var11 = class175.field3109 / 100;
                if (var10 < var11) {
                    var11 = var10;
                }
                if (this.field3879.field4803[arg5.field4020] == 0) {
                    arg5.field4017 = class133.method948(arg5.field4004, var9.method942(), var9.method928(), var9.method924());
                } else {
                    arg5.field4017 = class133.method948(arg5.field4004, var9.method942(), 0, var9.method924());
                    this.field3879.method1958((byte) 91, arg5, arg5.field4016.field4943[arg5.field4009] < 0);
                    arg5.field4017.method940(var11, var9.method928());
                }
                if (arg5.field4016.field4943[arg5.field4009] < 0) {
                    arg5.field4017.method926(-1);
                }
                var9.method920(var11);
                var9.method941(arg1, arg4, arg2 - arg4);
                if (var9.method936()) {
                    this.field3897.method2235(var9);
                }
            }
        }
        arg5.field4017.method941(arg1, arg4, arg0);
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "()Lfd;", line = 454)
    public final class219 method913() {
        class234 var1 = (class234) this.field3889.method1270((byte) -121);
        field3896++;
        if (var1 == null) {
            return null;
        } else if (var1.field4017 == null) {
            return this.method934();
        } else {
            return var1.field4017;
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Llc;)V", line = 502)
    public class222(class278 arg0) {
        this.field3879 = arg0;
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "()I", line = 493)
    public final int method915() {
        field3890++;
        return 0;
    }
}
