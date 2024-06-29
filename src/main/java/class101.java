import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class101 {

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "Z")
    private boolean field1415 = false;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "Z")
    private boolean field1418 = false;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
    private int field1426 = -1;

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
    private int field1430 = -1;

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "I")
    private int field1434 = -32768;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
    public int field1425;

    @OriginalMember(owner = "client!ja", name = "I", descriptor = "I")
    public int field1444;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public int field1413;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "B")
    private byte field1422;

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "I")
    private int field1436;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "B")
    private byte field1424;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    private int field1410;

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "Z")
    private boolean field1433;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "Lmq;")
    public static class104 field1411 = new class104(64);

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
    private int field1429;

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!ja", name = "B", descriptor = "I")
    private int field1437;

    @OriginalMember(owner = "client!ja", name = "C", descriptor = "I")
    private int field1438;

    @OriginalMember(owner = "client!ja", name = "F", descriptor = "I")
    private int field1441;

    @OriginalMember(owner = "client!ja", name = "G", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!ja", name = "z", descriptor = "Lmr;")
    private class173 field1435;

    @OriginalMember(owner = "client!ja", name = "D", descriptor = "Lab;")
    private class232 field1439;

    @OriginalMember(owner = "client!ja", name = "E", descriptor = "Lfc;")
    public static class343 field1440;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "Lqg;")
    private class372 field1432;

    @OriginalMember(owner = "client!ja", name = "K", descriptor = "Lqc;")
    public static class6 field1446;

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "Lm;")
    public class83 field1445;

    @OriginalMember(owner = "client!ja", name = "H", descriptor = "Z")
    public static boolean field1443;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "[Z")
    private boolean[] field1419;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZZILkm;IB)Lab;", line = 6)
    public final class232 method636(int arg0, boolean arg1, boolean arg2, int arg3, class487 arg4, int arg5, byte arg6) {
        if (arg6 >= -113) {
            return null;
        }
        field1412++;
        class475 var8 = class304.field4160.method2075(this.field1413, false);
        if (var8.field6690 != null) {
            var8 = var8.method2797(class320.field4376, -127);
        }
        if (var8 == null) {
            this.method637(false, arg4);
            this.field1430 = -1;
            this.field1426 = this.field1429;
            return null;
        }
        if (!this.field1418 && this.field1430 != var8.field6705) {
            this.field1439 = null;
            this.method643(-1, (byte) 31);
        }
        this.method641(arg0, 107, arg3);
        boolean var9 = arg2 & this.field1433 & class47.field761 != 0;
        boolean var10 = var9 & (this.field1430 != var8.field6705 || (this.field1429 != this.field1426 || this.field1432 != null && (this.field1432.field5259 || class399.field5582) && this.field1438 != this.field1429) && class47.field761 >= 2);
        if (arg1 && !var10) {
            this.field1430 = var8.field6705;
            this.field1426 = this.field1429;
            return null;
        }
        if (var10) {
            class204.method1291(this.field1435, this.field1422, this.field1410, this.field1436, this.field1419);
        }
        class269 var11 = class317.field4306[this.field1422];
        class269 var12;
        if (this.field1415) {
            var12 = class366.field5215[0];
        } else {
            var12 = this.field1422 >= 3 ? null : class317.field4306[this.field1422 + 1];
        }
        class232 var13 = null;
        if (this.field1432 != null) {
            if (var10) {
                arg5 |= 0x20000;
            }
            var13 = var8.method2792((byte) -38, var11, this.field1436, this.field1425 == 11 ? this.field1444 + 4 : this.field1444, var11.method701(this.field1410, this.field1436), this.field1438, arg5, var12, this.field1432, this.field1429, this.field1410, this.field1425 == 11 ? 10 : this.field1425, arg4, this.field1441);
            if (var13 == null) {
                this.field1435 = null;
                this.field1434 = 0;
                this.field1419 = null;
            } else {
                if (var10) {
                    if (this.field1419 == null) {
                        this.field1419 = new boolean[4];
                    }
                    this.field1435 = var13.method42(this.field1435);
                    class199.method1265(this.field1435, this.field1422, arg3, arg0, this.field1419);
                }
                this.field1434 = var13.method55();
            }
            this.field1439 = null;
        } else if (this.field1439 != null && arg5 == (this.field1439.method50() & arg5) && this.field1430 == var8.field6705) {
            var13 = this.field1439;
        } else {
            if (this.field1439 != null) {
                arg5 |= this.field1439.method50();
            }
            class172 var14 = var8.method2793(var12, this.field1410, this.field1425 == 11 ? 10 : this.field1425, var11, this.field1425 == 11 ? this.field1444 + 4 : this.field1444, arg4, arg5, var10, this.field1436, (byte) 125, var11.method701(this.field1410, this.field1436));
            if (var14 == null) {
                this.field1434 = 0;
                this.field1439 = null;
                this.field1419 = null;
                this.field1435 = null;
            } else {
                var13 = var14.field2549;
                this.field1439 = var14.field2549;
                if (var10) {
                    this.field1419 = null;
                    this.field1435 = var14.field2554;
                    class199.method1265(this.field1435, this.field1422, arg3, arg0, (boolean[]) null);
                }
                this.field1434 = var13.method55();
            }
        }
        this.field1430 = var8.field6705;
        this.field1410 = arg3;
        this.field1436 = arg0;
        this.field1426 = this.field1429;
        return var13;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZLkm;)V", line = 135)
    public final void method637(boolean arg0, class487 arg1) {
        field1427++;
        if (!arg0 && this.field1435 != null) {
            class204.method1291(this.field1435, this.field1422, this.field1410, this.field1436, this.field1419);
            this.field1419 = null;
            this.field1435 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)Z", line = 153)
    public final boolean method638(int arg0) {
        field1442++;
        if (arg0 != 0) {
            this.field1424 = -124;
        }
        return this.field1433;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)V", line = 164)
    public final void method639(int arg0, int arg1) {
        field1416++;
        this.field1418 = true;
        this.method643(arg0, (byte) 31);
        if (arg1 <= 103) {
            this.method641(-79, -107, -115);
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)I", line = 177)
    public final int method640(int arg0) {
        if (arg0 != 0) {
            this.method638(127);
        }
        field1431++;
        return this.field1434;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V", line = 190)
    private final void method641(int arg0, int arg1, int arg2) {
        field1423++;
        if (arg1 <= 106) {
            this.method645((class487) null, true);
        }
        label90: while (true) {
            if (this.field1432 == null) {
                if (this.field1418) {
                    return;
                }
                this.method643(-1, (byte) 31);
                if (this.field1432 == null) {
                    return;
                }
            }
            int var4 = class356.field4972 - this.field1437;
            if (var4 > 100 && this.field1432.field5251 > 0) {
                int var5 = this.field1432.field5278.length - this.field1432.field5251;
                while (this.field1429 < var5 && var4 > this.field1432.field5283[this.field1429]) {
                    var4 -= this.field1432.field5283[this.field1429];
                    this.field1429++;
                }
                if (var5 <= this.field1429) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field1432.field5278.length; var7++) {
                        var6 += this.field1432.field5283[var7];
                    }
                    var4 %= var6;
                }
                this.field1438 = this.field1429 + 1;
                if (this.field1438 >= this.field1432.field5278.length) {
                    this.field1438 -= this.field1432.field5251;
                    if (this.field1438 < 0 || this.field1438 >= this.field1432.field5278.length) {
                        this.field1438 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field1432.field5283[this.field1429] >= var4) {
                            this.field1437 = class356.field4972 - var4;
                            this.field1441 = var4;
                            return;
                        }
                        class272.method1706(this.field1424, this.field1432, false, (byte) 31, arg2, arg0, this.field1429);
                        var4 -= this.field1432.field5283[this.field1429];
                        this.field1429++;
                        if (this.field1432.field5278.length <= this.field1429) {
                            this.field1429 -= this.field1432.field5251;
                            if (this.field1429 < 0 || this.field1429 >= this.field1432.field5278.length) {
                                this.field1432 = null;
                                continue label90;
                            }
                        }
                        this.field1438 = this.field1429 + 1;
                    } while (this.field1438 < this.field1432.field5278.length);
                    this.field1438 -= this.field1432.field5251;
                } while (this.field1438 >= 0 && this.field1438 < this.field1432.field5278.length);
                this.field1438 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lkm;Lcj;IIIIIIZI)V", line = 530)
    public class101(class487 arg0, class475 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field1425 = arg2;
        this.field1415 = arg8;
        this.field1444 = arg3;
        this.field1413 = arg1.field6705;
        this.field1422 = (byte) arg5;
        this.field1436 = arg7;
        this.field1424 = (byte) arg4;
        this.field1410 = arg6;
        this.field1433 = arg0.method1123() && arg1.field6697 && !this.field1415;
        if (arg9 != -1) {
            this.field1418 = true;
        }
        this.method643(arg9, (byte) 31);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIILkm;IILab;Z)V", line = 292)
    public final void method642(int arg0, int arg1, int arg2, class487 arg3, int arg4, int arg5, class232 arg6, boolean arg7) {
        field1421++;
        class356[] var9 = arg6.method40();
        int var10 = -128 % ((69 - arg4) / 51);
        class309[] var11 = arg6.method25();
        if ((this.field1445 == null || this.field1445.field1241) && (var9 != null || var11 != null)) {
            class475 var12 = class304.field4160.method2075(this.field1413, false);
            if (var12.field6690 != null) {
                var12 = var12.method2797(class320.field4376, -128);
            }
            if (var12 != null) {
                this.field1445 = new class83(class356.field4972);
            }
        }
        if (this.field1445 == null) {
            return;
        }
        if (arg7) {
            this.field1445.method576(arg3, (long) class356.field4972, var9, var11, false);
        } else {
            this.field1445.method578((long) class356.field4972);
        }
        this.field1445.method572(this.field1424, arg0, arg1, arg5, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IB)V", line = 328)
    private final void method643(int arg0, byte arg1) {
        field1417++;
        int var3 = arg0;
        boolean var4 = false;
        if (arg0 == -1) {
            class475 var5 = class304.field4160.method2075(this.field1413, false);
            class475 var6 = var5;
            if (var5.field6690 != null) {
                var5 = var5.method2797(class320.field4376, arg1 ^ 0xFFFFFF9E);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field6719 != null) {
                if (this.field1432 != null && var5.method2784(this.field1432.field5252, 0)) {
                    return;
                }
                var3 = var5.method2787(28317);
                if (this.field1430 != var5.field6705) {
                    var4 = var5.field6648;
                }
            } else if (var5.field6724 == -1) {
                if (var6 != null && var6.field6719 != null) {
                    if (this.field1432 != null && var6.method2784(this.field1432.field5252, arg1 ^ 0x1F)) {
                        return;
                    }
                    var3 = var6.method2787(28317);
                    if (this.field1430 != var6.field6705) {
                        var4 = var6.field6648;
                    }
                } else if (var6 != null && var6.field6724 != -1 && this.field1430 != var6.field6705) {
                    var4 = var6.field6648;
                    var3 = var6.field6724;
                }
            } else if (this.field1430 != var5.field6705) {
                var4 = var5.field6648;
                var3 = var5.field6724;
            }
        }
        if (var3 == -1) {
            this.field1432 = null;
            return;
        }
        this.field1439 = null;
        if (this.field1432 == null || this.field1432.field5252 != var3) {
            this.field1432 = class31.field505.method950(true, var3);
        } else if (this.field1432.field5271 == 0) {
            return;
        }
        if (this.field1432.field5278 == null) {
            this.field1432 = null;
            return;
        }
        if (var4) {
            this.field1429 = (int) (Math.random() * (double) this.field1432.field5278.length);
            this.field1441 = (int) ((double) this.field1432.field5283[this.field1429] * Math.random()) + 1;
        } else {
            this.field1441 = 1;
            this.field1429 = 0;
        }
        this.field1438 = this.field1429 + 1;
        if (arg1 != 31) {
            this.field1439 = null;
        }
        if (this.field1438 < 0 || this.field1438 >= this.field1432.field5278.length) {
            this.field1438 = -1;
        }
        this.field1437 = class356.field4972 - this.field1441;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V", line = 455)
    public static void method644(int arg0) {
        field1411 = null;
        int var1 = 18 / ((-arg0 - 86) / 34);
        field1446 = null;
        field1440 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lkm;Z)V", line = 466)
    public final void method645(class487 arg0, boolean arg1) {
        field1420++;
        this.method636(this.field1436, true, arg1, this.field1410, arg0, 131072, (byte) -114);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(II)V", line = 489)
    public static final void method646(int arg0, int arg1) {
        field1428++;
        class265 var2 = class440.method2554(arg0, 2, 4);
        var2.method1677(21748);
        if (arg1 != -30024) {
            field1440 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V", line = 507)
    protected final void finalize() {
        field1414++;
        if (this.field1445 != null) {
            this.field1445.method573();
        }
    }
}
