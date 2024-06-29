import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public abstract class class87 extends class259 {

    @OriginalMember(owner = "client!em", name = "z", descriptor = "[Lem;")
    public class87[] field1387;

    @OriginalMember(owner = "client!em", name = "t", descriptor = "Z")
    public boolean field1381;

    @OriginalMember(owner = "client!em", name = "x", descriptor = "I")
    public static int field1385 = 0;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!em", name = "o", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!em", name = "p", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!em", name = "r", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!em", name = "s", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!em", name = "u", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!em", name = "v", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!em", name = "w", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!em", name = "y", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!em", name = "A", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!em", name = "B", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!em", name = "D", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!em", name = "E", descriptor = "I")
    public int field1392;

    @OriginalMember(owner = "client!em", name = "F", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!em", name = "C", descriptor = "Lpl;")
    public class273 field1390;

    @OriginalMember(owner = "client!em", name = "q", descriptor = "Lcg;")
    public class52 field1378;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method639(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1377++;
        if (arg6 != -7) {
            method647((class53) null, 47);
        }
        if (arg5 < 1 || arg4 < 1 || arg5 > 102 || arg4 > 102) {
            return;
        }
        if (!class273.method1903(arg6 + 107) && (class253.field3806[0][arg5][arg4] & 0x2) == 0) {
            int var8 = arg3;
            if ((class253.field3806[arg3][arg5][arg4] & 0x8) != 0) {
                var8 = 0;
            }
            if (class280.field4510 != var8) {
                return;
            }
        }
        int var9 = arg3;
        if (arg3 < 3 && (class253.field3806[1][arg5][arg4] & 0x2) == 2) {
            var9 = arg3 + 1;
        }
        class240.method1640(arg4, var9, arg5, (byte) 17, class235.field3431[arg3], arg3, arg0);
        if (arg1 < 0) {
            return;
        }
        boolean var10 = class225.field3308;
        class225.field3308 = true;
        class221.method1540(arg2, false, arg3, class235.field3431[arg3], false, arg5, var9, arg1, arg4, 5023, arg7);
        class225.field3308 = var10;
        return;
    }

    @OriginalMember(owner = "client!em", name = "d", descriptor = "(I)I")
    public int method640(int arg0) {
        field1389++;
        if (arg0 < 59) {
            this.field1387 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(III)V")
    public static final void method641(int arg0, int arg1, int arg2) {
        class2 var3 = class37.field475[class37.field474][arg0][arg2];
        field1383++;
        if (var3 == null) {
            class14.method99(class37.field474, arg0, arg2);
            return;
        }
        class193 var4 = null;
        int var5 = -99999999;
        for (class193 var6 = (class193) var3.method8(-105); var6 != null; var6 = (class193) var3.method12((byte) 69)) {
            class31 var13 = class12.method88(var6.field2853.field3073, 27838);
            int var14 = var13.field376;
            if (var13.field367 == 1) {
                var14 = (var6.field2853.field3077 + 1) * var14;
            }
            if (var5 < var14) {
                var4 = var6;
                var5 = var14;
            }
        }
        if (var4 == null) {
            class14.method99(class37.field474, arg0, arg2);
            return;
        }
        var3.method9((byte) -98, var4);
        class193 var7 = (class193) var3.method8(-70);
        class208 var8 = null;
        class208 var9 = null;
        while (var7 != null) {
            class208 var12 = var7.field2853;
            if (var4.field2853.field3073 != var12.field3073) {
                if (var8 == null) {
                    var8 = var12;
                }
                if (var8.field3073 != var12.field3073 && var9 == null) {
                    var9 = var12;
                }
            }
            var7 = (class193) var3.method12((byte) 69);
        }
        if (arg1 != 3391) {
            method647((class53) null, -20);
        }
        long var10 = (long) (arg0 + (arg2 << 7) + 1610612736);
        class141.method1055(class37.field474, arg0, arg2, class113.method851(class37.field474, 114, arg2 * 128 + 64, arg0 * 128 - -64), var4.field2853, var10, var8, var9);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIZ)[I")
    public final int[] method642(int arg0, int arg1, boolean arg2) {
        field1376++;
        if (!arg2) {
            this.method640(-92);
        }
        return this.field1387[arg0].field1381 ? this.field1387[arg0].method37(arg1, !arg2) : this.field1387[arg0].method143(arg1, 6)[0];
    }

    @OriginalMember(owner = "client!em", name = "c", descriptor = "(III)V")
    public final void method643(int arg0, int arg1, int arg2) {
        field1382++;
        int var4 = this.field1392 == arg0 ? arg1 : this.field1392;
        if (this.field1381) {
            this.field1378 = new class52(var4, arg1, arg2);
        } else {
            this.field1390 = new class273(var4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)I")
    public int method644(byte arg0) {
        field1379++;
        int var2 = -69 / ((-arg0 - 23) / 48);
        return -1;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(B)V")
    public void method645(byte arg0) {
        if (this.field1381) {
            this.field1378.method321((byte) -20);
            this.field1378 = null;
        } else {
            this.field1390.method1904((byte) 114);
            this.field1390 = null;
        }
        field1391++;
        if (arg0 >= -10) {
            this.field1378 = null;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II)[[I")
    public int[][] method143(int arg0, int arg1) {
        if (arg1 != 6) {
            this.method136(116);
        }
        field1384++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IZ)[I")
    public int[] method37(int arg0, boolean arg1) {
        if (arg1) {
            method639(-116, 33, -99, 91, 1, -95, -17, 40);
        }
        field1388++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IB)V")
    public static final void method646(int arg0, byte arg1) {
        field1386++;
        int var2 = -59 / ((arg1 + 26) / 63);
        class200.field2944 = 1000 / arg0;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lhc;II)V")
    public void method40(class53 arg0, int arg1, int arg2) {
        field1373++;
        if (arg2 != 25645) {
            method646(41, (byte) 71);
        }
    }

    @OriginalMember(owner = "client!em", name = "e", descriptor = "(I)V")
    public void method136(int arg0) {
        if (arg0 == 0) {
            field1375++;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lhc;I)V")
    public static final void method647(class53 arg0, int arg1) {
        field1393++;
        if ((arg0.field758.length - arg0.field735) < 1) {
            return;
        }
        int var2 = -6 / ((arg1 - 87) / 37);
        int var3 = arg0.method366(-16505);
        if (var3 < 0 || var3 > 11) {
            return;
        }
        byte var4;
        if (var3 == 11) {
            var4 = 33;
        } else if (var3 == 10) {
            var4 = 32;
        } else if (var3 == 9) {
            var4 = 31;
        } else if (var3 == 8) {
            var4 = 30;
        } else if (var3 == 7) {
            var4 = 29;
        } else if (var3 == 6) {
            var4 = 28;
        } else if (var3 == 5) {
            var4 = 28;
        } else if (var3 == 4) {
            var4 = 24;
        } else if (var3 == 3) {
            var4 = 23;
        } else if (var3 == 2) {
            var4 = 22;
        } else if (var3 == 1) {
            var4 = 23;
        } else {
            var4 = 19;
        }
        if (arg0.field758.length - arg0.field735 < var4) {
            return;
        }
        class240.field3525 = arg0.method366(-16505);
        if (class240.field3525 < 1) {
            class240.field3525 = 1;
        } else if (class240.field3525 > 4) {
            class240.field3525 = 4;
        }
        class267.method1834(-31477, arg0.method366(-16505) == 1);
        class51.field705 = arg0.method366(-16505) == 1;
        class225.field3308 = arg0.method366(-16505) == 1;
        class56.field817 = arg0.method366(-16505) == 1;
        class207.field3054 = arg0.method366(-16505) == 1;
        class229.field3368 = arg0.method366(-16505) == 1;
        class69.field1112 = arg0.method366(-16505) == 1;
        class22.field247 = arg0.method366(-16505) == 1;
        class74.field1173 = arg0.method366(-16505);
        if (class74.field1173 > 2) {
            class74.field1173 = 2;
        }
        if (var3 < 2) {
            class47.field658 = arg0.method366(-16505) == 1;
            arg0.method366(-16505);
        } else {
            class47.field658 = arg0.method366(-16505) == 1;
        }
        class294.field4688 = arg0.method366(-16505) == 1;
        class243.field3577 = arg0.method366(-16505) == 1;
        class77.field1218 = arg0.method366(-16505);
        if (class77.field1218 > 2) {
            class77.field1218 = 2;
        }
        class146.field2351 = class77.field1218;
        class281.field4536 = arg0.method366(-16505) == 1;
        class208.field3085 = arg0.method366(-16505);
        if (class208.field3085 > 127) {
            class208.field3085 = 127;
        }
        class99.field1688 = arg0.method366(-16505);
        class171.field2582 = arg0.method366(-16505);
        if (class171.field2582 > 127) {
            class171.field2582 = 127;
        }
        if (var3 >= 1) {
            class79.field1278 = arg0.method331(-126);
            class149.field2388 = arg0.method331(-88);
        }
        if (var3 >= 3 && var3 < 6) {
            arg0.method366(-16505);
        }
        if (var3 >= 4) {
            int var5 = arg0.method366(-16505);
            if (class246.field3634 < 96) {
                var5 = 0;
            }
            class88.method656(var5);
        }
        if (var3 >= 5) {
            class210.field3109 = arg0.method340(-111);
        }
        if (var3 >= 6) {
            class64.field969 = arg0.method366(-16505);
        }
        if (var3 >= 7) {
            class69.field1110 = arg0.method366(-16505) == 1;
        }
        if (var3 >= 8) {
            class299.field4829 = arg0.method366(-16505) == 1;
        }
        if (var3 >= 9) {
            class265.field4245 = arg0.method366(-16505);
        }
        if (var3 >= 10) {
            class306.field4942 = arg0.method366(-16505) != 0;
        }
        if (var3 >= 11) {
            class32.field398 = arg0.method366(-16505) != 0;
        }
    }

    @OriginalMember(owner = "client!em", name = "d", descriptor = "(III)[[I")
    public final int[][] method648(int arg0, int arg1, int arg2) {
        int var4 = 31 / ((-arg1 - 50) / 53);
        field1374++;
        if (this.field1387[arg2].field1381) {
            int[] var5 = this.field1387[arg2].method37(arg0, false);
            return new int[][] { var5, var5, var5 };
        } else {
            return this.field1387[arg2].method143(arg0, 6);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIII)V")
    public static final void method649(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= -60) {
            method641(-94, -9, -99);
        }
        class144.field2338.field735 = 0;
        class144.field2338.method360(20, 25759);
        field1372++;
        class144.field2338.method360(arg4, 25759);
        class144.field2338.method360(arg1, 25759);
        class144.field2338.method376(arg2, false);
        class144.field2338.method376(arg0, false);
        class43.field569 = 0;
        class291.field4629 = 1;
        class313.field5007 = 0;
        class145.field2347 = -3;
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(IZ)V")
    public class87(int arg0, boolean arg1) {
        this.field1387 = new class87[arg0];
        this.field1381 = arg1;
    }
}
