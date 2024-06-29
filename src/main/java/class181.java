import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class181 extends class264 {

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "Lhh;")
    public class169 field2990 = new class169();

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "Lli;")
    public class22 field3003 = new class22();

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "Lun;")
    private class121 field2991;

    @OriginalMember(owner = "client!ff", name = "x", descriptor = "[Z")
    public static boolean[] field2993 = new boolean[100];

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!ff", name = "A", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!ff", name = "D", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!ff", name = "E", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!ff", name = "F", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!ff", name = "G", descriptor = "Lad;")
    public static class187 field3002;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)V", line = 4)
    public static void method1353(byte arg0) {
        if (arg0 != 55) {
            method1355(54);
        }
        field3002 = null;
        field2993 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([III)V", line = 16)
    public final void method116(int[] arg0, int arg1, int arg2) {
        field2997++;
        this.field3003.method116(arg0, arg1, arg2);
        for (class309 var4 = (class309) this.field2990.method1240(3); var4 != null; var4 = (class309) this.field2990.method1235(false)) {
            if (!this.field2991.method880(var4, (byte) -123)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field4798 >= var6) {
                        this.method1356(arg0, true, var5 + var6, var4, var5, var6);
                        var4.field4798 -= var6;
                        break;
                    }
                    this.method1356(arg0, true, var5 + var6, var4, var5, var4.field4798);
                    var6 -= var4.field4798;
                    var5 += var4.field4798;
                } while (!this.field2991.method869(var4, var6, arg0, -3598, var5));
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "()I", line = 55)
    public final int method126() {
        field3001++;
        return 0;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIII)V", line = 72)
    public static final void method1354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2992++;
        int var7 = 0;
        class225.method1599(arg1, 7);
        int var8 = arg1;
        int var9 = arg1 - arg6;
        int var10 = -arg1;
        if (var9 < 0) {
            var9 = 0;
        }
        int var11 = -var9;
        int var12 = -1;
        int var13 = var9;
        if (arg2 != 2) {
            method1353((byte) -13);
        }
        int[] var14 = class281.field4523[arg3];
        int var15 = -1;
        int var16 = arg4 - var9;
        int var17 = arg4 + var9;
        class80.method545(arg0, -81, var16, arg4 - arg1, var14);
        class80.method545(arg5, -62, var17, var16, var14);
        class80.method545(arg0, arg2 - 106, arg1 + arg4, var17, var14);
        while (var8 > var7) {
            var12 += 2;
            var11 += var12;
            if (var11 >= 0 && var13 >= 1) {
                class137.field2163[var13] = var7;
                var13--;
                var11 -= var13 << 1;
            }
            var7++;
            var15 += 2;
            var10 += var15;
            if (var10 >= 0) {
                var8--;
                if (var9 <= var8) {
                    int[] var18 = class281.field4523[arg3 + var8];
                    int var19 = arg4 - var7;
                    int[] var20 = class281.field4523[arg3 - var8];
                    int var21 = arg4 + var7;
                    class80.method545(arg0, -87, var21, var19, var18);
                    class80.method545(arg0, -93, var21, var19, var20);
                } else {
                    int[] var22 = class281.field4523[arg3 + var8];
                    int[] var23 = class281.field4523[arg3 - var8];
                    int var24 = class137.field2163[var8];
                    int var25 = arg4 + var24;
                    int var26 = arg4 - var7;
                    int var27 = arg4 + var7;
                    int var28 = arg4 - var24;
                    class80.method545(arg0, arg2 ^ 0xFFFFFF8A, var28, var26, var22);
                    class80.method545(arg5, -49, var25, var28, var22);
                    class80.method545(arg0, arg2 ^ 0xFFFFFF9A, var27, var25, var22);
                    class80.method545(arg0, -81, var28, var26, var23);
                    class80.method545(arg5, -68, var25, var28, var23);
                    class80.method545(arg0, arg2 - 76, var27, var25, var23);
                }
                var10 -= var8 << 1;
            }
            int[] var29 = class281.field4523[arg3 - var7];
            int[] var30 = class281.field4523[arg3 + var7];
            int var31 = arg4 + var8;
            int var32 = arg4 - var8;
            if (var9 <= var7) {
                class80.method545(arg0, -115, var31, var32, var30);
                class80.method545(arg0, -96, var31, var32, var29);
            } else {
                int var33 = var13 >= var7 ? var13 : class137.field2163[var7];
                int var34 = arg4 + var33;
                int var35 = arg4 - var33;
                class80.method545(arg0, -107, var35, var32, var30);
                class80.method545(arg5, arg2 - 99, var34, var35, var30);
                class80.method545(arg0, -74, var31, var34, var30);
                class80.method545(arg0, -106, var35, var32, var29);
                class80.method545(arg5, -114, var34, var35, var29);
                class80.method545(arg0, arg2 ^ 0xFFFFFFAC, var31, var34, var29);
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)V", line = 207)
    public static final void method1355(int arg0) {
        int var1 = 101 / ((arg0 - 58) / 58);
        class340 var2 = (class340) class201.field3267.method1240(3);
        field2989++;
        while (var2 != null) {
            class112 var3 = var2.field5288;
            if (class49.field698 != var3.field1715 || var3.field1713 < class240.field3818) {
                var2.method1212((byte) 100);
            } else if (var3.field1681 <= class240.field3818) {
                if (var3.field1716 > 0) {
                    class234 var4 = class99.field1445[var3.field1716 - 1];
                    if (var4 != null && var4.field4255 >= 0 && var4.field4255 < 13312 && var4.field4264 >= 0 && var4.field4264 < 13312) {
                        var3.method781(class123.method889(1, var3.field1715, var4.field4255, var4.field4264) - var3.field1706, 112, class240.field3818, var4.field4255, var4.field4264);
                    }
                }
                if (var3.field1716 < 0) {
                    int var5 = -var3.field1716 - 1;
                    class334 var6;
                    if (class234.field3758 == var5) {
                        var6 = class191.field3129;
                    } else {
                        var6 = class74.field1049[var5];
                    }
                    if (var6 != null && var6.field4255 >= 0 && var6.field4255 < 13312 && var6.field4264 >= 0 && var6.field4264 < 13312) {
                        var3.method781(class123.method889(1, var3.field1715, var6.field4255, var6.field4264) - var3.field1706, 77, class240.field3818, var6.field4255, var6.field4264);
                    }
                }
                var3.method783(class36.field477, (byte) -57);
                class67.method448(class49.field698, (int) var3.field1709, (int) var3.field1688, (int) var3.field1703, 60, var3, var3.field1685, -1L, false);
            }
            var2 = (class340) class201.field3267.method1235(false);
        }
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "()Lsm;", line = 261)
    public final class264 method119() {
        field2995++;
        class309 var1 = (class309) this.field2990.method1240(3);
        if (var1 == null) {
            return null;
        } else if (var1.field4802 == null) {
            return this.method125();
        } else {
            return var1.field4802;
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "()Lsm;", line = 278)
    public final class264 method125() {
        field2996++;
        class309 var1;
        do {
            var1 = (class309) this.field2990.method1235(false);
            if (var1 == null) {
                return null;
            }
        } while (var1.field4802 == null);
        return var1.field4802;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)V", line = 306)
    public final void method127(int arg0) {
        this.field3003.method127(arg0);
        field2998++;
        for (class309 var2 = (class309) this.field2990.method1240(3); var2 != null; var2 = (class309) this.field2990.method1235(false)) {
            if (!this.field2991.method880(var2, (byte) -120)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field4798) {
                        this.method1358(-1, var2, var3);
                        var2.field4798 -= var3;
                        break;
                    }
                    this.method1358(-1, var2, var2.field4798);
                    var3 -= var2.field4798;
                } while (!this.field2991.method869(var2, var3, (int[]) null, -3598, 0));
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lun;)V", line = 456)
    public class181(class121 arg0) {
        this.field2991 = arg0;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([IZILte;II)V", line = 344)
    private final void method1356(int[] arg0, boolean arg1, int arg2, class309 arg3, int arg4, int arg5) {
        if ((this.field2991.field1891[arg3.field4805] & 0x4) != 0 && arg3.field4825 < 0) {
            int var7 = this.field2991.field1851[arg3.field4805] / class338.field5275;
            while (true) {
                int var8 = (1048575 - (arg3.field4800 - var7)) / var7;
                if (var8 > arg5) {
                    arg3.field4800 += arg5 * var7;
                    break;
                }
                arg5 -= var8;
                arg3.field4802.method116(arg0, arg4, var8);
                arg4 += var8;
                arg3.field4800 += var7 * var8 - 1048576;
                class272 var9 = arg3.field4802;
                int var10 = class338.field5275 / 100;
                int var11 = 262144 / var7;
                if (var11 < var10) {
                    var10 = var11;
                }
                if (this.field2991.field1889[arg3.field4805] == 0) {
                    arg3.field4802 = class272.method1943(arg3.field4809, var9.method1940(), var9.method1962(), var9.method1939());
                } else {
                    arg3.field4802 = class272.method1943(arg3.field4809, var9.method1940(), 0, var9.method1939());
                    this.field2991.method877(arg3, arg3.field4816.field3219[arg3.field4807] < 0, !arg1);
                    arg3.field4802.method1938(var10, var9.method1962());
                }
                if (arg3.field4816.field3219[arg3.field4807] < 0) {
                    arg3.field4802.method1959(-1);
                }
                var9.method1964(var10);
                var9.method116(arg0, arg4, arg2 - arg4);
                if (var9.method1929()) {
                    this.field3003.method120(var9);
                }
            }
        }
        arg3.field4802.method116(arg0, arg4, arg5);
        field2994++;
        if (!arg1) {
            method1357((class172) null, 83);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lak;I)V", line = 404)
    public static final void method1357(class172 arg0, int arg1) {
        field3000++;
        if (arg1 == 25353) {
            class179.field2970 = arg0;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILte;I)V", line = 415)
    private final void method1358(int arg0, class309 arg1, int arg2) {
        field2999++;
        if ((this.field2991.field1891[arg1.field4805] & 0x4) != 0 && arg1.field4825 < 0) {
            int var4 = this.field2991.field1851[arg1.field4805] / class338.field5275;
            int var5 = (var4 + 1048575 - arg1.field4800) / var4;
            arg1.field4800 = arg2 * var4 + arg1.field4800 & 0xFFFFF;
            if (arg2 >= var5) {
                if (this.field2991.field1889[arg1.field4805] == 0) {
                    arg1.field4802 = class272.method1943(arg1.field4809, arg1.field4802.method1940(), arg1.field4802.method1962(), arg1.field4802.method1939());
                } else {
                    arg1.field4802 = class272.method1943(arg1.field4809, arg1.field4802.method1940(), 0, arg1.field4802.method1939());
                    this.field2991.method877(arg1, arg1.field4816.field3219[arg1.field4807] < 0, false);
                }
                if (arg1.field4816.field3219[arg1.field4807] < 0) {
                    arg1.field4802.method1959(-1);
                }
                arg2 = arg1.field4800 / var4;
            }
        }
        arg1.field4802.method127(arg2);
        if (arg0 != -1) {
            field3002 = (class187) null;
        }
    }
}
