import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class81 extends class2 {

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "Lsa;")
    private class260 field1332 = null;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "Z")
    private boolean field1336 = false;

    @OriginalMember(owner = "client!wb", name = "O", descriptor = "I")
    private int field1353 = -32768;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
    private int field1335 = -1;

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "Z")
    private boolean field1350 = false;

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "I")
    private int field1349 = -1;

    @OriginalMember(owner = "client!wb", name = "T", descriptor = "I")
    private int field1358;

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
    private int field1339;

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "I")
    private int field1333;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
    private int field1337;

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "I")
    private int field1352;

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "I")
    private int field1340;

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
    private int field1346;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "Llc;")
    private class307 field1334;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    private int field1330;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "I")
    private int field1341;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
    private int field1331;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "I")
    public static int field1342 = 0;

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "Ljava/lang/String;")
    public static String field1344 = "Loading sprites - ";

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "Lqd;")
    public static class173 field1329 = new class173(64);

    @OriginalMember(owner = "client!wb", name = "Z", descriptor = "I")
    public static int field1364 = 0;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!wb", name = "Q", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!wb", name = "R", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!wb", name = "S", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!wb", name = "U", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!wb", name = "V", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!wb", name = "W", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!wb", name = "X", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "Lic;")
    private class171 field1347;

    @OriginalMember(owner = "client!wb", name = "Y", descriptor = "[Ljava/lang/String;")
    public static String[] field1363;

    @OriginalMember(owner = "client!wb", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field1338++;
        if (this.field1347 != null) {
            this.field1347.method1252();
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)V")
    public static final void method557(byte arg0, int arg1) {
        field1355++;
        if (arg1 == -1 || !class67.method473(arg1, (byte) -117)) {
            return;
        }
        class211[] var2 = class34.field519[arg1];
        if (arg0 != -72) {
            field1342 = 25;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class211 var4 = var2[var3];
            if (var4.field3383 != null) {
                class126 var5 = new class126();
                var5.field2000 = var4;
                var5.field1989 = var4.field3383;
                class186.method1333(2000000, var5, 0);
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V")
    private final void method558(int arg0, int arg1) {
        if (arg0 != -182995615) {
            return;
        }
        field1345++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class158 var5 = class5.method29(this.field1339, true);
            class158 var6 = var5;
            if (var5.field2448 != null) {
                var5 = var5.method1077(-6291);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field2447 != null) {
                if (this.field1334 != null && var5.method1087((byte) 36, this.field1334.field4905)) {
                    return;
                }
                var3 = var5.method1091(true);
                if (this.field1335 != var5.field2474) {
                    var4 = var5.field2500;
                }
            } else if (var5.field2481 == -1) {
                if (var6 != null && var6.field2447 != null) {
                    if (this.field1334 != null && var6.method1087((byte) 3, this.field1334.field4905)) {
                        return;
                    }
                    var3 = var6.method1091(true);
                    if (this.field1335 != var6.field2474) {
                        var4 = var6.field2500;
                    }
                } else if (var6 != null && var6.field2481 != -1 && this.field1335 != var6.field2474) {
                    var4 = var6.field2500;
                    var3 = var6.field2481;
                }
            } else if (this.field1335 != var5.field2474) {
                var3 = var5.field2481;
                var4 = var5.field2500;
            }
        }
        if (var3 == -1) {
            this.field1334 = null;
            return;
        }
        if (this.field1334 == null || this.field1334.field4905 != var3) {
            this.field1334 = class22.method121(var3, true);
        } else if (this.field1334.field4893 == 0) {
            return;
        }
        if (var4) {
            this.field1331 = (int) ((double) this.field1334.field4895.length * Math.random());
            this.field1346 = (int) (Math.random() * (double) this.field1334.field4891[this.field1331]) + 1;
        } else {
            this.field1331 = 0;
            this.field1346 = 1;
        }
        this.field1341 = this.field1331 + 1;
        if (this.field1341 < 0 || this.field1341 >= this.field1334.field4895.length) {
            this.field1341 = -1;
        }
        this.field1330 = class29.field360 - this.field1346;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BLqk;)V")
    private final void method559(byte arg0, class2 arg1) {
        class31 var3 = (class31) arg1;
        if ((this.field1347 == null || this.field1347.field2775) && (var3.field397 != null || var3.field393 != null)) {
            class158 var4 = class5.method29(this.field1339, true);
            if (var4.field2448 != null) {
                var4 = var4.method1077(-6291);
            }
            if (var4 != null) {
                this.field1347 = new class171(class29.field360, var4.field2507, var4.field2487);
            }
        }
        if (arg0 != -39) {
            this.field1349 = -10;
        }
        if (this.field1347 != null) {
            this.field1347.method1248(var3.field397, var3.field393, false, var3.field390, var3.field377, var3.field408);
        }
        this.field1336 = true;
        field1356++;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V")
    public static void method560(int arg0) {
        if (arg0 == 19331) {
            field1363 = null;
            field1329 = null;
            field1344 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(III)V")
    private final void method561(int arg0, int arg1, int arg2) {
        if (arg2 <= 59) {
            return;
        }
        field1348++;
        label92: while (true) {
            if (this.field1334 == null) {
                if (this.field1350) {
                    return;
                }
                this.method558(-182995615, -1);
                if (this.field1334 == null) {
                    return;
                }
            }
            int var4 = class29.field360 - this.field1330;
            if (var4 > 100 && this.field1334.field4921 > 0) {
                int var5 = this.field1334.field4895.length - this.field1334.field4921;
                while (this.field1331 < var5 && this.field1334.field4891[this.field1331] < var4) {
                    var4 -= this.field1334.field4891[this.field1331];
                    this.field1331++;
                }
                if (this.field1331 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field1334.field4895.length; var7++) {
                        var6 += this.field1334.field4891[var7];
                    }
                    var4 %= var6;
                }
                this.field1341 = this.field1331 + 1;
                if (this.field1334.field4895.length <= this.field1341) {
                    this.field1341 -= this.field1334.field4921;
                    if (this.field1341 < 0 || this.field1341 >= this.field1334.field4895.length) {
                        this.field1341 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var4 <= this.field1334.field4891[this.field1331]) {
                            this.field1330 = class29.field360 - var4;
                            this.field1346 = var4;
                            return;
                        }
                        class274.method1838(arg1, false, this.field1334, this.field1331, (byte) -117, arg0);
                        var4 -= this.field1334.field4891[this.field1331];
                        this.field1331++;
                        if (this.field1334.field4895.length <= this.field1331) {
                            this.field1331 -= this.field1334.field4921;
                            if (this.field1331 < 0 || this.field1334.field4895.length <= this.field1331) {
                                this.field1334 = null;
                                continue label92;
                            }
                        }
                        this.field1341 = this.field1331 + 1;
                    } while (this.field1341 < this.field1334.field4895.length);
                    this.field1341 -= this.field1334.field4921;
                } while (this.field1341 >= 0 && this.field1334.field4895.length > this.field1341);
                this.field1341 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIIIIJILic;)V")
    public final void method9(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class171 arg10) {
        field1351++;
        class2 var13 = this.method565(7);
        if (var13 != null) {
            this.method559((byte) -39, var13);
            var13.method9(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1347);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIII)V")
    public final void method10(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class2 var6 = null;
        this.method561(arg3, arg4, 73);
        field1360++;
        if (!this.field1336) {
            if (var6 == null) {
                var6 = this.method565(7);
            }
            if (var6 == null) {
                return;
            }
            this.method559((byte) -39, var6);
        }
        if (this.field1347 != null) {
            this.field1347.method1250(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)Lvh;")
    public static final class115 method562(int arg0, int arg1) {
        field1361++;
        if (arg1 != -20358) {
            field1329 = null;
        }
        class115 var2 = (class115) class196.field3174.method1261(arg1 + 20358, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class205.field3265.method1680(class184.method1326(1024, arg0), class213.method1486(arg0, -94), -88);
        class115 var4 = new class115();
        var4.field1833 = arg0;
        if (var3 != null) {
            var4.method818(new class162(var3), (byte) -118);
        }
        var4.method804((byte) 53);
        if (var4.field1780 != -1) {
            var4.method808(method562(var4.field1818, -20358), (byte) -85, method562(var4.field1780, -20358));
        }
        if (var4.field1801 != -1) {
            var4.method814(method562(var4.field1824, -20358), method562(var4.field1801, arg1), -100);
        }
        if (!class289.field4636 && var4.field1854) {
            var4.field1800 = class179.field2920;
            var4.field1787 = false;
            var4.field1840 = 0;
            var4.field1832 = class265.field4270;
            var4.field1799 = class11.field108;
        }
        class196.field3174.method1264(-1, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)V")
    public static final void method563(boolean arg0) {
        class131.field2053.method823(false);
        field1359++;
        int var1 = class131.field2053.method831(1, arg0);
        if (var1 == 0) {
            return;
        }
        int var2 = class131.field2053.method831(2, true);
        if (var2 == 0) {
            class40.field584[class69.field1145++] = 2047;
        } else if (var2 == 1) {
            int var3 = class131.field2053.method831(3, true);
            class239.field3829.method288((byte) 81, 1, var3);
            int var4 = class131.field2053.method831(1, true);
            if (var4 == 1) {
                class40.field584[class69.field1145++] = 2047;
            }
        } else if (var2 == 2) {
            if (class131.field2053.method831(1, true) == 1) {
                int var5 = class131.field2053.method831(3, true);
                class239.field3829.method288((byte) 120, 2, var5);
                int var6 = class131.field2053.method831(3, arg0);
                class239.field3829.method288((byte) 44, 2, var6);
            } else {
                int var7 = class131.field2053.method831(3, arg0);
                class239.field3829.method288((byte) 112, 0, var7);
            }
            int var8 = class131.field2053.method831(1, true);
            if (var8 == 1) {
                class40.field584[class69.field1145++] = 2047;
            }
        } else if (var2 == 3) {
            int var9 = class131.field2053.method831(7, arg0);
            int var10 = class131.field2053.method831(1, arg0);
            if (var10 == 1) {
                class40.field584[class69.field1145++] = 2047;
            }
            int var11 = class131.field2053.method831(7, true);
            int var12 = class131.field2053.method831(1, true);
            class56.field941 = class131.field2053.method831(2, true);
            class239.field3829.method1975(var9, (byte) -67, var12 == 1, var11);
        }
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(II)V")
    public static final void method564(int arg0, int arg1) {
        field1357++;
        class175 var2 = class182.method1317(arg0, arg1, false);
        var2.method1278((byte) 125);
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "()I")
    public final int method15() {
        field1328++;
        return this.field1353;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)Lqk;")
    public final class2 method565(int arg0) {
        field1354++;
        if (arg0 != 7) {
            method557((byte) 122, -26);
        }
        return this.method567((byte) -114, false);
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(IIIIIIIZLqk;)V")
    public class81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class2 arg8) {
        this.field1358 = arg4;
        this.field1339 = arg0;
        this.field1333 = arg3;
        this.field1337 = arg2;
        this.field1352 = arg5;
        this.field1340 = arg1;
        if (arg8 != null) {
            this.field1350 = true;
            if (arg8 instanceof class81) {
                class81 var10 = (class81) arg8;
                this.field1346 = var10.field1346;
                this.field1334 = var10.field1334;
                this.field1330 = var10.field1330;
                this.field1341 = var10.field1341;
                this.field1331 = var10.field1331;
            }
        }
        if (this.field1350) {
            this.method558(-182995615, arg6);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ldk;I)V")
    public static final void method566(class251 arg0, int arg1) {
        if (arg1 != -1) {
            field1329 = null;
        }
        class240.field3833 = arg0;
        field1362++;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BZ)Lqk;")
    private final class2 method567(byte arg0, boolean arg1) {
        boolean var3 = class267.field4304 != class148.field2320;
        field1343++;
        class158 var4 = class5.method29(this.field1339, true);
        if (var4.field2448 != null) {
            var4 = var4.method1077(-6291);
        }
        if (var4 == null) {
            this.field1335 = -1;
            this.field1349 = this.field1331;
            return null;
        }
        if (!this.field1350 && this.field1335 != var4.field2474) {
            this.method558(-182995615, -1);
        }
        int var5 = this.field1337 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var6 = var4.field2487;
            var7 = var4.field2507;
        } else {
            var6 = var4.field2507;
            var7 = var4.field2487;
        }
        int var8 = (var6 >> 1) + this.field1358;
        int var9 = (var7 + 1 >> 1) + this.field1352;
        int var10 = (var6 + 1 >> 1) + this.field1358;
        int var11 = (var7 >> 1) + this.field1352;
        this.method561(var8 * 128, var11 * 128, 96);
        boolean var12 = !var3 && var4.field2520 && (this.field1335 != var4.field2474 || (this.field1349 != this.field1331 || this.field1334 != null && (this.field1334.field4915 || class174.field2846) && this.field1341 != this.field1331) && class188.field3051 >= 2);
        if (arg1 && !var12) {
            this.field1335 = var4.field2474;
            this.field1349 = this.field1331;
            return null;
        }
        int[][] var13 = class267.field4304[this.field1333];
        int var14 = var13[var8][var11] + var13[var10][var11] + var13[var10][var9] + var13[var8][var9] >> 2;
        if (arg0 > -103) {
            this.finalize();
        }
        int var15 = (this.field1358 << 7) + (var6 << 6);
        int[][] var16 = null;
        int var17 = (this.field1352 << 7) + (var7 << 6);
        if (var3) {
            var16 = class148.field2320[0];
        } else if (this.field1333 < 3) {
            var16 = class267.field4304[this.field1333 + 1];
        }
        boolean var18 = this.field1332 == null;
        class123 var19;
        if (this.field1334 == null) {
            var19 = var4.method1075(36, this.field1340, var17, var15, var18 ? class163.field2639 : this.field1332, this.field1337, var12, false, var16, var13, var14);
        } else {
            var19 = var4.method1081(var13, var14, this.field1334, this.field1341, this.field1346, 120, var18 ? class163.field2639 : this.field1332, var17, var16, this.field1340, this.field1337, this.field1331, var12, var15);
        }
        if (var19 == null) {
            this.field1349 = this.field1331;
            this.field1335 = var4.field2474;
            return null;
        } else {
            this.field1349 = this.field1331;
            this.field1335 = var4.field2474;
            return var19.field1951;
        }
    }
}
