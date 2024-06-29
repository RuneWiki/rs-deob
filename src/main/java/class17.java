import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class17 implements class71 {

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    private int field356 = 50;

    @OriginalMember(owner = "client!bg", name = "w", descriptor = "I")
    private int field374 = 128;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "Lkh;")
    private class97 field371;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "Lkh;")
    private class97 field367;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "Lsa;")
    private class162 field353;

    @OriginalMember(owner = "client!bg", name = "B", descriptor = "Lcd;")
    public static class23 field379 = class54.method414("Regeln versto-8en hat)3", -1);

    @OriginalMember(owner = "client!bg", name = "D", descriptor = "Lcd;")
    public static class23 field381 = class54.method414("m-Ochte mit Ihnen handeln)3", -1);

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "[J")
    public static long[] field364 = new long[200];

    @OriginalMember(owner = "client!bg", name = "y", descriptor = "[I")
    public static int[] field376 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "Lcd;")
    private static class23 field370 = class54.method414("You can(Wt add yourself to your own ignore list)3", -1);

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "Lfa;")
    public static class47 field361 = null;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "Lcd;")
    public static class23 field360 = field370;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!bg", name = "x", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!bg", name = "A", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!bg", name = "C", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!bg", name = "E", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(II)Z")
    public final boolean method87(int arg0, int arg1) {
        if (arg0 == -1265) {
            field359++;
            return this.method105((byte) -80, arg1).field1638;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "(II)Lrg;")
    public static final class159 method88(int arg0, int arg1) {
        if (arg0 != -1) {
            field360 = null;
        }
        class159 var2 = (class159) class27.field557.method995(arg0 + 126, (long) arg1);
        field352++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class182.field3601.method651(arg0 ^ 0xFFFFFFFB, arg1, 4);
        class159 var4 = new class159();
        if (var3 != null) {
            var4.method975(new class189(var3), arg1, (byte) 113);
        }
        var4.method974((byte) 10);
        class27.field557.method990(var4, (long) arg1, -4);
        return var4;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
    public final void method89(byte arg0) {
        if (arg0 != -8) {
            this.method98(115, 107);
        }
        this.field353 = new class162(this.field356);
        field375++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILgd;ILug;)V")
    public static final void method90(int arg0, class58 arg1, int arg2, class186 arg3) {
        field373++;
        class20 var4 = new class20();
        var4.field411 = arg3;
        if (arg0 < 44) {
            method96(94);
        }
        var4.field427 = 1;
        var4.field421 = arg1;
        var4.field3317 = arg2;
        class25 var5 = class36.field740;
        synchronized (class36.field740) {
            class36.field740.method186(var4, -26692);
        }
        class145.method918(600);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)Z")
    public final boolean method91(int arg0, int arg1) {
        field354++;
        return arg1 == -18525 ? this.method105((byte) -50, arg0).method517(this, (byte) 64, this.field371) : false;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)V")
    public static final void method92(byte arg0) {
        for (class88 var1 = (class88) class89.field1924.method188((byte) 54); var1 != null; var1 = (class88) class89.field1924.method185((byte) -102)) {
            if (class59.field1385 != var1.field1896 || class15.field339 > var1.field1893) {
                var1.method1018(15789);
            } else if (var1.field1873 <= class15.field339) {
                if (var1.field1889 > 0) {
                    class182 var2 = class91.field1944[var1.field1889 - 1];
                    if (var2 != null && var2.field215 >= 0 && var2.field215 < 13312 && var2.field277 >= 0 && var2.field277 < 13312) {
                        var1.method584(var2.field215, var2.field277, class203.method1330((byte) -88, var2.field277, var2.field215, var1.field1896) - var1.field1883, class15.field339, (byte) 124);
                    }
                }
                if (var1.field1889 < 0) {
                    int var3 = -var1.field1889 - 1;
                    class57 var4;
                    if (class15.field338 == var3) {
                        var4 = class134.field2790;
                    } else {
                        var4 = class95.field2007[var3];
                    }
                    if (var4 != null && var4.field215 >= 0 && var4.field215 < 13312 && var4.field277 >= 0 && var4.field277 < 13312) {
                        var1.method584(var4.field215, var4.field277, class203.method1330((byte) -88, var4.field277, var4.field215, var1.field1896) - var1.field1883, class15.field339, (byte) 97);
                    }
                }
                var1.method582((byte) 44, class138.field2850);
                class205.field4041.method811(class59.field1385, (int) var1.field1894, (int) var1.field1869, (int) var1.field1877, 60, var1, var1.field1879, -1, false);
            }
        }
        field372++;
        if (arg0 > -23) {
            field370 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)I")
    public static final int method93(int arg0) {
        int var1 = 49 % ((12 - arg0) / 50);
        field355++;
        int var2 = 3;
        if (class105.field2266 < 310) {
            int var3 = class119.field2452 >> 7;
            int var4 = class134.field2790.field215 >> 7;
            int var5 = class115.field2404 >> 7;
            if ((class53.field1253[class59.field1385][var3][var5] & 0x4) != 0) {
                var2 = class59.field1385;
            }
            int var6 = class134.field2790.field277 >> 7;
            int var7;
            if (var3 >= var4) {
                var7 = var3 - var4;
            } else {
                var7 = var4 - var3;
            }
            int var8;
            if (var5 >= var6) {
                var8 = var5 - var6;
            } else {
                var8 = var6 - var5;
            }
            if (var8 < var7) {
                int var9 = 32768;
                int var10 = var8 * 65536 / var7;
                while (var3 != var4) {
                    var9 += var10;
                    if (var4 > var3) {
                        var3++;
                    } else if (var3 > var4) {
                        var3--;
                    }
                    if ((class53.field1253[class59.field1385][var3][var5] & 0x4) != 0) {
                        var2 = class59.field1385;
                    }
                    if (var9 >= 65536) {
                        if (var6 > var5) {
                            var5++;
                        } else if (var6 < var5) {
                            var5--;
                        }
                        if ((class53.field1253[class59.field1385][var3][var5] & 0x4) != 0) {
                            var2 = class59.field1385;
                        }
                        var9 -= 65536;
                    }
                }
            } else {
                int var11 = var7 * 65536 / var8;
                int var12 = 32768;
                while (var5 != var6) {
                    var12 += var11;
                    if (var5 < var6) {
                        var5++;
                    } else if (var5 > var6) {
                        var5--;
                    }
                    if ((class53.field1253[class59.field1385][var3][var5] & 0x4) != 0) {
                        var2 = class59.field1385;
                    }
                    if (var12 >= 65536) {
                        if (var3 < var4) {
                            var3++;
                        } else if (var4 < var3) {
                            var3--;
                        }
                        if ((class53.field1253[class59.field1385][var3][var5] & 0x4) != 0) {
                            var2 = class59.field1385;
                        }
                        var12 -= 65536;
                    }
                }
            }
        }
        if ((class53.field1253[class59.field1385][class134.field2790.field215 >> 7][class134.field2790.field277 >> 7] & 0x4) != 0) {
            var2 = class59.field1385;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "(II)Lue;")
    public static final class184 method94(int arg0, int arg1) {
        field362++;
        class184 var2 = (class184) class39.field805.method995(107, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class7.field125.method651(4, 0, arg0);
        if (var3 == null) {
            return null;
        }
        class184 var4 = new class184();
        class189 var5 = new class189(var3);
        var5.field3752 = var5.field3753.length - 12;
        int var6 = 0;
        int var7 = var5.method1190(-4);
        var4.field3617 = var5.method1197(-1);
        var4.field3619 = var5.method1197(-1);
        var4.field3623 = var5.method1197(-1);
        var4.field3610 = var5.method1197(-1);
        var5.field3752 = 0;
        var4.field3612 = var5.method1227((byte) -59);
        var4.field3616 = new class23[var7];
        var4.field3622 = new int[var7];
        var4.field3624 = new int[var7];
        int var8 = -49 / ((-arg1 - 58) / 47);
        while (var5.field3753.length - 12 > var5.field3752) {
            int var9 = var5.method1197(-1);
            if (var9 == 3) {
                var4.field3616[var6] = var5.method1193((byte) -70);
            } else if (var9 >= 100 || var9 == 21 || var9 == 38 || var9 == 39) {
                var4.field3624[var6] = var5.method1202(-53);
            } else {
                var4.field3624[var6] = var5.method1190(-4);
            }
            var4.field3622[var6++] = var9;
        }
        class39.field805.method990(var4, (long) arg0, -127);
        return var4;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIF)[I")
    public final int[] method95(int arg0, int arg1, float arg2) {
        if (arg1 != -12478) {
            this.field356 = -7;
        }
        field365++;
        class72 var4 = this.method105((byte) -123, arg0);
        var4.field1642 = true;
        return var4.method512(this, 0, this.field371, this.field374, arg2);
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
    public static void method96(int arg0) {
        field360 = null;
        field364 = null;
        field379 = null;
        if (arg0 != 20439) {
            method92((byte) -60);
        }
        field381 = null;
        field370 = null;
        field376 = null;
        field361 = null;
    }

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "(II)V")
    public final void method97(int arg0, int arg1) {
        class72 var3 = (class72) this.field353.method994((byte) 93);
        if (arg1 != 19875) {
            this.field374 = -5;
        }
        while (var3 != null) {
            if (var3.field1642) {
                var3.method516(arg0, 18157);
                var3.field1642 = false;
            }
            var3 = (class72) this.field353.method998((byte) -37);
        }
        field380++;
    }

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "(II)Z")
    public final boolean method98(int arg0, int arg1) {
        if (arg1 != 32149) {
            method88(-33, 61);
        }
        field363++;
        return this.method105((byte) -77, arg0).field1653;
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V")
    public static final void method99(int arg0) {
        class27.field557.method997(false);
        int var1 = -43 % ((44 - arg0) / 60);
        field382++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IB)Z")
    public static final boolean method100(int arg0, byte arg1) {
        if (arg1 > -33) {
            field381 = null;
        }
        field357++;
        return (-arg0 & arg0) == arg0;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(II)Z")
    public final boolean method101(int arg0, int arg1) {
        field366++;
        int var3 = 108 / ((arg0 + 19) / 35);
        return this.field374 == 64 || this.method105((byte) -53, arg1).field1643 == 64;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BI)[I")
    public final int[] method102(byte arg0, int arg1) {
        if (arg0 == 10) {
            class189 var3 = new class189(this.field367.method651(4, arg1, 0));
            class72 var4 = new class72(var3);
            field368++;
            return var4.method513(this.field371, this, this.field374, 32231);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "(II)I")
    public final int method103(int arg0, int arg1) {
        field377++;
        return arg0 == 28899 ? this.method105((byte) -54, arg1).field1634 : 95;
    }

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "(II)I")
    public static final int method104(int arg0, int arg1) {
        field378++;
        return arg0 == 1355016679 ? arg1 >> 17 & 0x7 : -35;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(BI)Li;")
    private final class72 method105(byte arg0, int arg1) {
        field358++;
        if (arg0 > -36) {
            field360 = null;
        }
        class72 var3 = (class72) this.field353.method995(126, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field367.method651(4, arg1, 0);
        if (var4 == null) {
            return class62.method460((byte) -62);
        } else {
            class189 var5 = new class189(var4);
            class72 var6 = new class72(var5);
            this.field353.method990(var6, (long) arg1, -112);
            return var6;
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lkh;Lkh;II)V")
    public class17(class97 arg0, class97 arg1, int arg2, int arg3) {
        this.field374 = arg3;
        this.field356 = arg2;
        this.field371 = arg1;
        this.field367 = arg0;
        this.field353 = new class162(this.field356);
    }
}
