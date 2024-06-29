import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class85 extends class196 {

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "I")
    private int field1422 = 10;

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "I")
    private int field1418 = 2048;

    @OriginalMember(owner = "client!ub", name = "S", descriptor = "I")
    private int field1420 = 0;

    @OriginalMember(owner = "client!ub", name = "ab", descriptor = "I")
    public static int field1428 = 0;

    @OriginalMember(owner = "client!ub", name = "hb", descriptor = "Ldf;")
    private static class51 field1435 = class46.method233("Please remove ", 100);

    @OriginalMember(owner = "client!ub", name = "Y", descriptor = "Ldf;")
    public static class51 field1426 = field1435;

    @OriginalMember(owner = "client!ub", name = "V", descriptor = "Ldf;")
    public static class51 field1423 = class46.method233("<br>", 100);

    @OriginalMember(owner = "client!ub", name = "gb", descriptor = "Ldf;")
    public static class51 field1434 = field1435;

    @OriginalMember(owner = "client!ub", name = "R", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!ub", name = "W", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!ub", name = "X", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!ub", name = "bb", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!ub", name = "cb", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!ub", name = "db", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!ub", name = "eb", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!ub", name = "fb", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!ub", name = "jb", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "Lja;")
    public static class55 field1421;

    @OriginalMember(owner = "client!ub", name = "Z", descriptor = "[I")
    private int[] field1427;

    @OriginalMember(owner = "client!ub", name = "ib", descriptor = "[I")
    private int[] field1436;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)V")
    public final void method73(byte arg0) {
        this.method654((byte) -79);
        ++field1430;
        int var2 = -115 % ((arg0 - 43) / 41);
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(B)V")
    private final void method654(byte arg0) {
        this.field1436 = new int[this.field1422 + 1];
        ++field1419;
        this.field1427 = new int[this.field1422 + 1];
        if (arg0 == -79) {
            int var2 = 0;
            int var3 = 4096 / this.field1422;
            int var4 = this.field1418 * var3 >> 12;
            for (int var5 = 0; ~var5 > ~this.field1422; ++var5) {
                this.field1427[var5] = var2;
                this.field1436[var5] = var2 + var4;
                var2 += var3;
            }
            this.field1427[this.field1422] = 4096;
            this.field1436[this.field1422] = 4096 - -this.field1436[0];
        }
    }

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)I")
    public static final int method655(int arg0) {
        ++field1431;
        if (arg0 != -18901) {
            method656(-29L, (byte) -2);
        }
        if (class111.field1881) {
            return 0;
        } else if (!class34.method170(105)) {
            return 1;
        } else {
            return !class142.field2376 ? 1 : 2;
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
    public class85() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(JB)Ldf;")
    public static final class51 method656(long arg0, byte arg1) {
        class57.field949.setTime(new Date(arg0));
        int var3 = -40 / ((46 - arg1) / 48);
        ++field1425;
        int var4 = class57.field949.get(7);
        int var5 = class57.field949.get(5);
        int var6 = class57.field949.get(2);
        int var7 = class57.field949.get(1);
        int var8 = class57.field949.get(11);
        int var9 = class57.field949.get(12);
        int var10 = class57.field949.get(13);
        return class20.method104(-127, new class51[] { class223.field3925[var4 + -1], class146.field2430, class51.method311(var5 / 10, 10), class51.method311(var5 % 10, 10), class70.field1134, class125.field2120[var6], class70.field1134, class51.method311(var7, 10), class191.field3189, class51.method311(var8 / 10, 10), class51.method311(var8 % 10, 10), class34.field502, class51.method311(var9 / 10, 10), class51.method311(var9 % 10, 10), class34.field502, class51.method311(var10 / 10, 10), class51.method311(var10 % 10, 10), class77.field1241 });
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V")
    public static void method657(boolean arg0) {
        field1435 = null;
        if (!arg0) {
            method655(73);
        }
        field1421 = null;
        field1434 = null;
        field1423 = null;
        field1426 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILwc;IIIILug;Lug;)V")
    public static final void method658(int arg0, class213 arg1, int arg2, int arg3, int arg4, int arg5, class187 arg6, class187 arg7) {
        class42.field675 = arg4;
        ++field1432;
        class239.field4153 = arg2;
        if (arg0 != -24905) {
            method657(true);
        }
        class25.field378 = arg3;
        class129.field2153 = arg5;
        class252.field4440 = arg1;
        if (class265.field4644 == null) {
            class234.field4111 = true;
            if (class128.field2146 == null) {
                class128.field2146 = class171.method1204(0, arg0 + 24876, class37.field572, class162.field2651);
            }
            if (class135.field2252 == null) {
                class135.field2252 = class203.method1410(class182.field3013, (byte) -35, 0, class162.field2651);
            }
            if (class195.field3264 == null) {
                class195.field3264 = class203.method1410(class7.field78, (byte) -35, 0, class162.field2651);
            }
            if (class60.field980 == null) {
                class60.field980 = class203.method1410(class234.field4082, (byte) -35, 0, class162.field2651);
            }
            int var8 = class25.field378 / 5;
            int var9 = class25.field378 / 5 * 4;
            class59.method387(class42.field675, class129.field2153, class25.field378, class239.field4153, 0, 168);
            class59.method382(class42.field675, class129.field2153, var8, 23, 12425273, 9135624);
            class59.method382(class42.field675 + var8, class129.field2153, var9, 23, 5197647, 2697513);
            arg7.method1333(class103.field1695, var8 / 2 + class42.field675, class129.field2153 + 15, 0, -1);
            if (class60.field980 != null) {
                class60.field980[1].method1110(class42.field675 + 2 - -var8, class129.field2153 - -1);
                arg6.method1335(class114.field1943, class42.field675 - (-var8 + -12), class129.field2153 + 10, 16777215, -1);
                class60.field980[0].method1110(class42.field675 - -var8 + 2, class129.field2153 + 12);
                arg6.method1335(class75.field1205, var8 + 12 + class42.field675, class129.field2153 + 21, 16777215, -1);
            }
            if (class195.field3264 != null) {
                int var10 = var8 + 140 + class42.field675;
                if (~class204.field3405[0] == -1 && ~class109.field1850[0] == -1) {
                    class195.field3264[2].method1110(var10, class129.field2153 + 4);
                } else {
                    class195.field3264[0].method1110(var10, class129.field2153 + 4);
                }
                if (class204.field3405[0] == 0 && ~class109.field1850[0] == -2) {
                    class195.field3264[3].method1110(var10 - -15, class129.field2153 + 4);
                } else {
                    class195.field3264[1].method1110(var10 + 15, class129.field2153 - -4);
                }
                arg7.method1335(class10.field110, var10 + 32, class129.field2153 + 17, 16777215, -1);
                int var11 = class42.field675 + var8 - -250;
                if (class204.field3405[0] == 1 && class109.field1850[0] == 0) {
                    class195.field3264[2].method1110(var11, class129.field2153 + 4);
                } else {
                    class195.field3264[0].method1110(var11, class129.field2153 - -4);
                }
                if (class204.field3405[0] == 1 && class109.field1850[0] == 1) {
                    class195.field3264[3].method1110(var11 + 15, class129.field2153 + 4);
                } else {
                    class195.field3264[1].method1110(var11 - -15, class129.field2153 + 4);
                }
                arg7.method1335(class78.field1242, var11 - -32, class129.field2153 - -17, 16777215, -1);
                int var12 = class42.field675 - -360 + var8;
                if (class204.field3405[0] == 2 && ~class109.field1850[0] == -1) {
                    class195.field3264[2].method1110(var12, class129.field2153 + 4);
                } else {
                    class195.field3264[0].method1110(var12, class129.field2153 + 4);
                }
                if (class204.field3405[0] == 2 && ~class109.field1850[0] == -2) {
                    class195.field3264[3].method1110(var12 - -15, class129.field2153 + 4);
                } else {
                    class195.field3264[1].method1110(var12 + 15, class129.field2153 + 4);
                }
                arg7.method1335(class32.field462, var12 - -32, class129.field2153 - -17, 16777215, -1);
                int var13 = class42.field675 + 470 - -var8;
                if (~class204.field3405[0] == -4 && ~class109.field1850[0] == -1) {
                    class195.field3264[2].method1110(var13, class129.field2153 + 4);
                } else {
                    class195.field3264[0].method1110(var13, class129.field2153 + 4);
                }
                if (~class204.field3405[0] == -4 && ~class109.field1850[0] == -2) {
                    class195.field3264[3].method1110(var13 + 15, class129.field2153 + 4);
                } else {
                    class195.field3264[1].method1110(var13 + 15, class129.field2153 - -4);
                }
                arg7.method1335(class167.field2723, var13 - -32, class129.field2153 + 17, 16777215, -1);
            }
            class59.method393(class25.field378 + -58 + -10, class129.field2153 + 4, 58, 16, 0);
            class164.field2691 = -1;
            if (class128.field2146 != null) {
                byte var14 = 88;
                byte var15 = 19;
                int var16 = class25.field378 / (var14 + 1);
                int var17 = (class239.field4153 + -23) / (var15 + 1);
                int var18;
                int var19;
                do {
                    var18 = var16;
                    if (~((var16 + -1) * var17) <= ~class234.field4095) {
                        --var16;
                    }
                    var19 = var17;
                    if (~class234.field4095 >= ~((var17 + -1) * var16)) {
                        --var17;
                    }
                    if ((var17 + -1) * var16 >= class234.field4095) {
                        --var17;
                    }
                } while (~var17 != ~var19 || ~var16 != ~var18);
                int var20 = (class25.field378 - var14 * var16) / (var16 + 1);
                if (var20 > 5) {
                    var20 = 5;
                }
                int var21 = (-(var14 * var16) + class25.field378 + -((var16 + -1) * var20)) / 2;
                int var22 = var21;
                int var23 = (class239.field4153 + -23 + -(var15 * var17)) / (var17 + 1);
                if (var23 > 5) {
                    var23 = 5;
                }
                int var24 = 0;
                int var25 = (class239.field4153 + -23 + -(var15 * var17) + -((var17 + -1) * var23)) / 2;
                int var26 = 23 - -var25;
                for (int var27 = 0; var27 < class234.field4095; ++var27) {
                    class149 var28 = class74.field1175[var27];
                    boolean var29 = true;
                    class51 var30 = class51.method311(var28.field2499, 10);
                    if (var28.field2499 != -1) {
                        if (~var28.field2499 < -1981) {
                            var30 = class80.field1312;
                            var29 = false;
                        }
                    } else {
                        var30 = class2.field8;
                        var29 = false;
                    }
                    if (~class89.field1482 <= ~var22 && ~var26 >= ~class90.field1504 && ~class89.field1482 > ~(var14 + var22) && ~(var15 + var26) < ~class90.field1504 && var29) {
                        class164.field2691 = var27;
                        class128.field2146[!var28.field2496 ? 0 : 1].method1201(class42.field675 + var22, class129.field2153 + var26, 128, 16777215);
                    } else {
                        class128.field2146[!var28.field2496 ? 0 : 1].method1103(class42.field675 + var22, class129.field2153 - -var26);
                    }
                    if (class135.field2252 != null) {
                        class135.field2252[var28.field2490 + (!var28.field2496 ? 0 : class135.field2252.length / 2)].method1110(class42.field675 - -var22 - -29, class129.field2153 + var26);
                    }
                    arg7.method1333(class51.method311(var28.field2495, arg0 + 24915), var22 + 15 + class42.field675, var15 / 2 + (class129.field2153 + 5 - -var26), 0, -1);
                    arg6.method1333(var30, class42.field675 + var22 - -60, var15 / 2 + class129.field2153 + var26 + 5, 268435455, -1);
                    var26 += var15 + var23;
                    int var10000 = ~var17;
                    ++var24;
                    if (var10000 >= ~var24) {
                        var22 += var14 + var20;
                        var26 = 23 - -var25;
                        var24 = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(III)Lei;")
    public static final class162 method659(int arg0, int arg1, int arg2) {
        class97 var3 = class27.field395[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class162 var4 = var3.field1614;
            var3.field1614 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILlb;B)V")
    public final void method44(int arg0, class121 arg1, byte arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field1420 = arg1.method897(arg2 + 33);
                }
            } else {
                this.field1418 = arg1.method876(false);
            }
        } else {
            this.field1422 = arg1.method897(127);
        }
        if (arg2 != 82) {
            field1423 = null;
        }
        ++field1424;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        ++field1437;
        int[] var3 = super.field3274.method1476(true, arg0);
        if (arg1 != 10565) {
            method656(-55L, (byte) -13);
        }
        if (super.field3274.field3741) {
            int var4 = class161.field2639[arg0];
            if (~this.field1420 == -1) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field1422; ++var6) {
                    if (~var4 <= ~this.field1427[var6] && ~this.field1427[var6 + 1] < ~var4) {
                        if (var4 < this.field1436[var6]) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class256.method1743(var3, 0, class49.field767, var5);
            } else {
                for (int var7 = 0; class49.field767 > var7; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class211.field3510[var7];
                    int var11 = this.field1420;
                    if (~var11 != -2) {
                        if (~var11 != -3) {
                            if (~var11 == -4) {
                                var8 = (-var4 + var10 >> 1) + 2048;
                            }
                        } else {
                            var8 = (var4 + -4096 + var10 >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; ~this.field1422 < ~var12; ++var12) {
                        if (~var8 <= ~this.field1427[var12] && var8 < this.field1427[var12 + 1]) {
                            if (this.field1436[var12] > var8) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        return var3;
    }
}
