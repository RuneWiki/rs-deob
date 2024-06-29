import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class84 extends class80 {

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "Lea;")
    public class204 field1249 = new class204();

    @OriginalMember(owner = "client!bi", name = "I", descriptor = "Lqd;")
    public class44 field1260 = new class44();

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "Lkc;")
    private class36 field1250;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "[I")
    public static int[] field1251 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "[S")
    public static short[] field1254 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!bi", name = "H", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!bi", name = "J", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "Lja;")
    public static class64 field1245;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([IILth;IIB)V", line = 5)
    private final void method599(int[] arg0, int arg1, class86 arg2, int arg3, int arg4, byte arg5) {
        if (arg5 > -90) {
            this.method599((int[]) null, -34, (class86) null, -65, -54, (byte) -65);
        }
        if ((this.field1250.field593[arg2.field1314] & 0x4) != 0 && arg2.field1307 < 0) {
            int var7 = this.field1250.field631[arg2.field1314] / class213.field3404;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field1297) / var7;
                if (arg3 < var8) {
                    arg2.field1297 += arg3 * var7;
                    break;
                }
                arg3 -= var8;
                arg2.field1320.method275(arg0, arg1, var8);
                arg2.field1297 += var7 * var8 - 1048576;
                arg1 += var8;
                class119 var9 = arg2.field1320;
                int var10 = class213.field3404 / 100;
                int var11 = 262144 / var7;
                if (var11 < var10) {
                    var10 = var11;
                }
                if (this.field1250.field600[arg2.field1314] == 0) {
                    arg2.field1320 = class119.method888(arg2.field1296, var9.method905(), var9.method889(), var9.method899());
                } else {
                    arg2.field1320 = class119.method888(arg2.field1296, var9.method905(), 0, var9.method899());
                    this.field1250.method296(arg2.field1318.field4679[arg2.field1306] < 0, arg2, 1241618438);
                    arg2.field1320.method902(var10, var9.method889());
                }
                if (arg2.field1318.field4679[arg2.field1306] < 0) {
                    arg2.field1320.method882(-1);
                }
                var9.method881(var10);
                var9.method275(arg0, arg1, arg4 - arg1);
                if (var9.method884()) {
                    this.field1260.method354(var9);
                }
            }
        }
        arg2.field1320.method275(arg0, arg1, arg3);
        field1261++;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILth;B)V", line = 67)
    private final void method600(int arg0, class86 arg1, byte arg2) {
        field1248++;
        if (arg2 >= -1) {
            return;
        }
        if ((this.field1250.field593[arg1.field1314] & 0x4) != 0 && arg1.field1307 < 0) {
            int var4 = this.field1250.field631[arg1.field1314] / class213.field3404;
            int var5 = (var4 + 1048575 - arg1.field1297) / var4;
            arg1.field1297 = arg0 * var4 + arg1.field1297 & 0xFFFFF;
            if (arg0 >= var5) {
                if (this.field1250.field600[arg1.field1314] == 0) {
                    arg1.field1320 = class119.method888(arg1.field1296, arg1.field1320.method905(), arg1.field1320.method889(), arg1.field1320.method899());
                } else {
                    arg1.field1320 = class119.method888(arg1.field1296, arg1.field1320.method905(), 0, arg1.field1320.method899());
                    this.field1250.method296(arg1.field1318.field4679[arg1.field1306] < 0, arg1, 1241618438);
                }
                if (arg1.field1318.field4679[arg1.field1306] < 0) {
                    arg1.field1320.method882(-1);
                }
                arg0 = arg1.field1297 / var4;
            }
        }
        arg1.field1320.method286(arg0);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lja;III)[Lai;", line = 105)
    public static final class126[] method601(class64 arg0, int arg1, int arg2, int arg3) {
        field1259++;
        if (class150.method1152(arg0, arg3, 50, arg2)) {
            return arg1 == 5 ? class181.method1346(arg1 - 24246) : (class126[]) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(I)V", line = 121)
    public static void method602(int arg0) {
        field1245 = null;
        field1254 = null;
        field1251 = null;
        if (arg0 != 8741) {
            method605((byte) -90);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIII)V", line = 133)
    public static final void method603(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1255++;
        int var6 = arg5 - arg0;
        int var7 = arg3 - arg1;
        if (var7 == 0) {
            if (var6 != 0) {
                class293.method2062(arg0, arg4, arg1, (byte) -107, arg5);
            }
        } else if (var6 == 0) {
            class145.method1096(arg1, arg0, arg4, arg3, (byte) 126);
        } else {
            int var8 = (var6 << 12) / var7;
            int var9 = arg0 - (arg1 * var8 >> 12);
            int var10;
            int var11;
            if (class319.field4965 > arg3) {
                var10 = class319.field4965;
                var11 = var9 + (class319.field4965 * var8 >> 12);
            } else if (arg3 > class116.field1888) {
                var10 = class116.field1888;
                var11 = var9 + (class116.field1888 * var8 >> 12);
            } else {
                var10 = arg3;
                var11 = arg5;
            }
            if (class188.field2995 > var11) {
                var10 = (class188.field2995 - var9 << 12) / var8;
                var11 = class188.field2995;
            } else if (var11 > class195.field3108) {
                var10 = (class195.field3108 - var9 << 12) / var8;
                var11 = class195.field3108;
            }
            int var12 = 28 / ((-arg2 - 75) / 47);
            int var13;
            int var14;
            if (arg1 < class319.field4965) {
                var13 = (class319.field4965 * var8 >> 12) + var9;
                var14 = class319.field4965;
            } else if (arg1 <= class116.field1888) {
                var13 = arg0;
                var14 = arg1;
            } else {
                var14 = class116.field1888;
                var13 = (class116.field1888 * var8 >> 12) + var9;
            }
            if (var13 < class188.field2995) {
                var13 = class188.field2995;
                var14 = (class188.field2995 - var9 << 12) / var8;
            } else if (var13 > class195.field3108) {
                var14 = (class195.field3108 - var9 << 12) / var8;
                var13 = class195.field3108;
            }
            class329.method2246(var10, arg4, -1, var14, var11, var13);
        }
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)V", line = 238)
    public final void method286(int arg0) {
        field1244++;
        this.field1260.method286(arg0);
        for (class86 var2 = (class86) this.field1249.method1490(200); var2 != null; var2 = (class86) this.field1249.method1487((byte) 117)) {
            if (!this.field1250.method297(var2, -83)) {
                int var3 = arg0;
                do {
                    if (var2.field1301 >= var3) {
                        this.method600(var3, var2, (byte) -39);
                        var2.field1301 -= var3;
                        break;
                    }
                    this.method600(var2.field1301, var2, (byte) -67);
                    var3 -= var2.field1301;
                } while (!this.field1250.method276(0, (byte) 33, var2, var3, (int[]) null));
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)Lve;", line = 274)
    public static final class268 method604(int arg0, byte arg1) {
        field1247++;
        class268 var2 = (class268) class320.field4994.method2017(1022, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class30.field507.method467(class14.method122(arg0, (byte) -41), 70, class22.method161(-1, arg0));
        class268 var4 = new class268();
        if (var3 != null) {
            var4.method1931(new class101(var3), 2);
        }
        int var5 = 57 % ((arg1 + 13) / 47);
        class320.field4994.method2018((long) arg0, var4, -71);
        return var4;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V", line = 298)
    public static final void method605(byte arg0) {
        if (class243.field3763 != null) {
            class243.field3763.method83((byte) 108);
        }
        field1256++;
        if (class213.field3400 != null) {
            class213.field3400.method83((byte) 117);
        }
        if (arg0 != 52) {
            method605((byte) 39);
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "()Lvl;", line = 325)
    public final class80 method294() {
        field1253++;
        class86 var1;
        do {
            var1 = (class86) this.field1249.method1487((byte) 117);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1320 == null);
        return var1.field1320;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lkc;)V", line = 459)
    public class84(class36 arg0) {
        this.field1250 = arg0;
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "()I", line = 350)
    public final int method293() {
        field1243++;
        return 0;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(III)I", line = 370)
    public static final int method606(int arg0, int arg1, int arg2) {
        int var3 = arg1 * 57 + arg0;
        field1258++;
        if (arg2 == 0) {
            int var4 = var3 << 13 ^ var3;
            int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
            return var5 >> 19 & 0xFF;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "()Lvl;", line = 386)
    public final class80 method295() {
        field1257++;
        class86 var1 = (class86) this.field1249.method1490(200);
        if (var1 == null) {
            return null;
        } else if (var1.field1320 == null) {
            return this.method294();
        } else {
            return var1.field1320;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lja;Lja;I)V", line = 404)
    public static final void method607(class64 arg0, class64 arg1, int arg2) {
        field1252++;
        int var3 = -30 / ((-arg2 - 41) / 53);
        class127.field2035 = class95.method682(class261.field4048, arg1, (byte) -88, arg0, 0);
        if (class265.field4126) {
            class88.field1356 = class270.method1951(0, class261.field4048, arg0, arg1, (byte) 91);
        } else {
            class88.field1356 = (class266) class127.field2035;
        }
        class64.field1021 = class95.method682(class147.field2372, arg1, (byte) -93, arg0, 0);
        class95.field1558 = class95.method682(class176.field2767, arg1, (byte) -69, arg0, 0);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([III)V", line = 422)
    public final void method275(int[] arg0, int arg1, int arg2) {
        field1246++;
        this.field1260.method275(arg0, arg1, arg2);
        for (class86 var4 = (class86) this.field1249.method1490(200); var4 != null; var4 = (class86) this.field1249.method1487((byte) 117)) {
            if (!this.field1250.method297(var4, -113)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field1301 >= var6) {
                        this.method599(arg0, var5, var4, var6, var5 + var6, (byte) -128);
                        var4.field1301 -= var6;
                        break;
                    }
                    this.method599(arg0, var5, var4, var4.field1301, var5 + var6, (byte) -115);
                    var5 += var4.field1301;
                    var6 -= var4.field1301;
                } while (!this.field1250.method276(var5, (byte) 33, var4, var6, arg0));
            }
        }
    }
}
