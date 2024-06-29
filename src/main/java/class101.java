import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class101 {

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "I")
    private int field1485 = 0;

    @OriginalMember(owner = "client!pw", name = "m", descriptor = "Z")
    private boolean field1496 = false;

    @OriginalMember(owner = "client!pw", name = "n", descriptor = "I")
    private int field1497 = -1;

    @OriginalMember(owner = "client!pw", name = "v", descriptor = "I")
    private int field1505 = -1;

    @OriginalMember(owner = "client!pw", name = "D", descriptor = "I")
    private int field1513 = 0;

    @OriginalMember(owner = "client!pw", name = "p", descriptor = "Z")
    private boolean field1499 = false;

    @OriginalMember(owner = "client!pw", name = "r", descriptor = "I")
    private int field1501 = -1;

    @OriginalMember(owner = "client!pw", name = "f", descriptor = "Lov;")
    private class668 field1489;

    @OriginalMember(owner = "client!pw", name = "w", descriptor = "B")
    private byte field1506;

    @OriginalMember(owner = "client!pw", name = "s", descriptor = "B")
    private byte field1502;

    @OriginalMember(owner = "client!pw", name = "q", descriptor = "I")
    public int field1500;

    @OriginalMember(owner = "client!pw", name = "L", descriptor = "I")
    public int field1521;

    @OriginalMember(owner = "client!pw", name = "K", descriptor = "I")
    public int field1520;

    @OriginalMember(owner = "client!pw", name = "J", descriptor = "Z")
    private boolean field1519;

    @OriginalMember(owner = "client!pw", name = "z", descriptor = "I")
    public static int field1509 = 0;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "I")
    private int field1486;

    @OriginalMember(owner = "client!pw", name = "d", descriptor = "I")
    private int field1487;

    @OriginalMember(owner = "client!pw", name = "e", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!pw", name = "g", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!pw", name = "h", descriptor = "I")
    private int field1491;

    @OriginalMember(owner = "client!pw", name = "i", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!pw", name = "j", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!pw", name = "l", descriptor = "I")
    private int field1495;

    @OriginalMember(owner = "client!pw", name = "u", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!pw", name = "x", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!pw", name = "y", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!pw", name = "A", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!pw", name = "C", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!pw", name = "F", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!pw", name = "G", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!pw", name = "I", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!pw", name = "t", descriptor = "Lka;")
    private class282 field1503;

    @OriginalMember(owner = "client!pw", name = "k", descriptor = "Lla;")
    public static class422 field1494;

    @OriginalMember(owner = "client!pw", name = "o", descriptor = "Lem;")
    public class627 field1498;

    @OriginalMember(owner = "client!pw", name = "H", descriptor = "Lr;")
    private class706 field1517;

    @OriginalMember(owner = "client!pw", name = "E", descriptor = "Lvga;")
    private class82 field1514;

    @OriginalMember(owner = "client!pw", name = "B", descriptor = "[Z")
    private boolean[] field1511;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(ILha;IILtc;Lka;ZII)V", line = 4)
    public final void method825(int arg0, class544 arg1, int arg2, int arg3, class73 arg4, class282 arg5, boolean arg6, int arg7, int arg8) {
        field1493++;
        int var10 = 18 % ((arg3 - 51) / 53);
        class157[] var11 = arg5.method1020();
        class158[] var12 = arg5.method1036();
        if ((this.field1498 == null || this.field1498.field8793) && (var11 != null || var12 != null)) {
            class595 var13 = class576.field8167.method3074(0, this.field1500);
            if (var13.field8351 != null) {
                var13 = var13.method3413(-1, class422.field6216);
            }
            if (var13 != null) {
                this.field1498 = class627.method3555(class199.field3403, true);
            }
        }
        if (this.field1498 == null) {
            return;
        }
        arg5.method1028(arg4);
        if (arg6) {
            this.field1498.method3561(arg1, (long) class199.field3403, var11, var12, false);
        } else {
            this.field1498.method3551((long) class199.field3403);
        }
        this.field1498.method3560(this.field1502, arg8, arg7, arg0, arg2);
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(II)V", line = 49)
    private final void method826(int arg0, int arg1) {
        field1504++;
        int var3 = arg0;
        boolean var4 = false;
        if (arg0 == -1) {
            class595 var5 = class576.field8167.method3074(0, this.field1500);
            class595 var6 = var5;
            if (var5.field8351 != null) {
                var5 = var5.method3413(-1, class422.field6216);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field8357 != null) {
                if (this.field1514 != null && var5.method3405(this.field1514.field1198, arg1 ^ 0xFFFFFF96)) {
                    return;
                }
                var3 = var5.method3421(false);
                if (this.field1501 != var5.field8386) {
                    var4 = var5.field8347;
                }
            } else if (var5.field8433 == -1) {
                if (var6 != null && var6.field8357 != null) {
                    if (this.field1514 != null && var6.method3405(this.field1514.field1198, -124)) {
                        return;
                    }
                    var3 = var6.method3421(false);
                    if (this.field1501 != var6.field8386) {
                        var4 = var6.field8347;
                    }
                } else if (var6 != null && var6.field8433 != -1 && this.field1501 != var6.field8386) {
                    var3 = var6.field8433;
                    var4 = var6.field8347;
                }
            } else if (this.field1501 != var5.field8386) {
                var3 = var5.field8433;
                var4 = var5.field8347;
            }
        }
        if (var3 == -1) {
            this.field1514 = null;
            return;
        }
        this.field1503 = null;
        if (this.field1514 == null || this.field1514.field1198 != var3) {
            this.field1514 = class83.field1219.method2358((byte) 116, var3);
        } else if (this.field1514.field1195 == 0) {
            return;
        }
        if (this.field1514.field1197 == null) {
            this.field1514 = null;
            return;
        }
        if (var4) {
            this.field1486 = (int) (Math.random() * (double) this.field1514.field1197.length);
            this.field1495 = (int) (Math.random() * (double) this.field1514.field1211[this.field1486]) + 1;
        } else {
            this.field1495 = 1;
            this.field1486 = 0;
        }
        this.field1487 = this.field1486 + arg1;
        if (this.field1487 < 0 || this.field1487 >= this.field1514.field1197.length) {
            this.field1487 = -1;
        }
        this.field1491 = class199.field3403 - this.field1495;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(B)Z", line = 174)
    public final boolean method827(byte arg0) {
        if (arg0 != -74) {
            this.field1487 = -23;
        }
        field1512++;
        return this.field1519;
    }

    @OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(Lha;Ljl;IIIILov;ZI)V", line = 566)
    public class101(class544 arg0, class595 arg1, int arg2, int arg3, int arg4, int arg5, class668 arg6, boolean arg7, int arg8) {
        this.field1499 = arg7;
        this.field1489 = arg6;
        this.field1506 = (byte) arg5;
        this.field1502 = (byte) arg4;
        this.field1500 = arg1.field8386;
        this.field1521 = arg3;
        this.field1520 = arg2;
        this.field1519 = arg0.method220() && arg1.field8400 && !this.field1499;
        if (arg8 != -1) {
            this.field1496 = true;
        }
        this.method826(arg8, 1);
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(Z)I", line = 203)
    public final int method828(boolean arg0) {
        if (!arg0) {
            this.field1503 = null;
        }
        field1515++;
        return this.field1513;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(ZZILha;I)Lka;", line = 215)
    public final class282 method829(boolean arg0, boolean arg1, int arg2, class544 arg3, int arg4) {
        field1516++;
        class595 var6 = class576.field8167.method3074(arg2 ^ arg2, this.field1500);
        if (var6.field8351 != null) {
            var6 = var6.method3413(-1, class422.field6216);
        }
        if (var6 == null) {
            this.method836(arg2 - 87, arg3);
            this.field1501 = -1;
            this.field1505 = -1;
            this.field1497 = -1;
            return null;
        }
        if (!this.field1496 && this.field1501 != var6.field8386) {
            this.field1503 = null;
            this.method826(-1, arg2 ^ -2);
        }
        this.method831((byte) -71, this.field1489);
        if (arg1) {
            boolean var7 = arg1 & this.field1519 & class654.field9289.field5431.method2801(3) != 0;
            arg1 = var7 & (this.field1505 != var6.field8386 || this.field1514 != null && class654.field9289.field5431.method2801(arg2 + 4) >= 2 && (this.field1497 != this.field1486 || (this.field1514.field1206 || class584.field8245) && this.field1487 != this.field1486));
        }
        if (arg0 && !arg1) {
            this.field1501 = var6.field8386;
            return null;
        }
        if (arg1) {
            class31.method162(this.field1517, this.field1506, this.field1489.field9477, this.field1489.field9475, this.field1511);
            this.field1497 = -1;
            this.field1505 = -1;
        }
        class339 var8 = class211.field3511[this.field1506];
        class339 var9;
        if (this.field1499) {
            var9 = class121.field1867[0];
        } else {
            var9 = this.field1506 >= 3 ? null : class211.field3511[this.field1506 + 1];
        }
        class282 var10 = null;
        if (this.field1514 != null) {
            if (arg1) {
                arg4 |= 0x40000;
            }
            var10 = var6.method3422(this.field1489.field9477, this.field1514, arg2, this.field1520 == 11 ? 10 : this.field1520, this.field1486, var9, arg3, var8, this.field1520 == 11 ? this.field1521 + 4 : this.field1521, arg4, var8.method2162(this.field1489.field9475, arg2 + 2, this.field1489.field9477), this.field1495, this.field1489.field9475, this.field1487);
            if (var10 == null) {
                this.field1511 = null;
                this.field1485 = 0;
                this.field1513 = 0;
                this.field1517 = null;
            } else {
                if (arg1) {
                    if (this.field1511 == null) {
                        this.field1511 = new boolean[4];
                    }
                    this.field1517 = var10.method1052(this.field1517);
                    class569.method3302(this.field1517, this.field1506, this.field1489.field9477, this.field1489.field9475, this.field1511);
                    this.field1497 = this.field1486;
                    this.field1505 = var6.field8386;
                }
                this.field1485 = var10.method1033();
                this.field1513 = var10.method1013();
            }
            this.field1503 = null;
        } else if (this.field1503 != null && (this.field1503.method1044() & arg4) == arg4 && this.field1501 == var6.field8386) {
            var10 = this.field1503;
        } else {
            if (this.field1503 != null) {
                arg4 |= this.field1503.method1044();
            }
            class321 var11 = var6.method3416(this.field1489.field9477, var8.method2162(this.field1489.field9475, 1, this.field1489.field9477), (byte) 87, arg4, this.field1520 == 11 ? 10 : this.field1520, var9, var8, arg1, arg3, this.field1520 == 11 ? this.field1521 + 4 : this.field1521, this.field1489.field9475);
            if (var11 == null) {
                this.field1485 = 0;
                this.field1513 = 0;
                this.field1511 = null;
                this.field1517 = null;
                this.field1503 = null;
            } else {
                var10 = var11.field4754;
                this.field1503 = var11.field4754;
                if (arg1) {
                    this.field1511 = null;
                    this.field1517 = var11.field4753;
                    class569.method3302(this.field1517, this.field1506, this.field1489.field9477, this.field1489.field9475, null);
                    this.field1505 = var6.field8386;
                    this.field1497 = -1;
                }
                this.field1485 = var10.method1033();
                this.field1513 = var10.method1013();
            }
        }
        this.field1501 = var6.field8386;
        return var10;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(ILha;)V", line = 352)
    public final void method830(int arg0, class544 arg1) {
        field1492++;
        if (arg0 != 0) {
            this.field1489 = null;
        }
        this.method829(true, true, arg0 - 1, arg1, 262144);
    }

    @OriginalMember(owner = "client!pw", name = "finalize", descriptor = "()V", line = 368)
    protected final void finalize() {
        if (this.field1498 != null) {
            this.field1498.method3557();
        }
        field1484++;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(BLov;)V", line = 381)
    private final void method831(byte arg0, class668 arg1) {
        field1488++;
        if (arg0 != -71) {
            this.method833(-70);
        }
        label90: while (true) {
            if (this.field1514 == null) {
                if (this.field1496) {
                    return;
                }
                this.method826(-1, arg0 + 72);
                if (this.field1514 == null) {
                    return;
                }
            }
            int var3 = class199.field3403 - this.field1491;
            if (var3 > 100 && this.field1514.field1179 > 0) {
                int var4 = this.field1514.field1197.length - this.field1514.field1179;
                while (var4 > this.field1486 && var3 > this.field1514.field1211[this.field1486]) {
                    var3 -= this.field1514.field1211[this.field1486];
                    this.field1486++;
                }
                if (this.field1486 >= var4) {
                    int var5 = 0;
                    for (int var6 = var4; var6 < this.field1514.field1197.length; var6++) {
                        var5 += this.field1514.field1211[var6];
                    }
                    var3 %= var5;
                }
                this.field1487 = this.field1486 + 1;
                if (this.field1487 >= this.field1514.field1197.length) {
                    this.field1487 -= this.field1514.field1179;
                    if (this.field1487 < 0 || this.field1487 >= this.field1514.field1197.length) {
                        this.field1487 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var3 <= this.field1514.field1211[this.field1486]) {
                            this.field1491 = class199.field3403 - var3;
                            this.field1495 = var3;
                            return;
                        }
                        class262.method1747(arg1, this.field1486, this.field1514, arg0 - 26797);
                        var3 -= this.field1514.field1211[this.field1486];
                        this.field1486++;
                        if (this.field1514.field1197.length <= this.field1486) {
                            this.field1486 -= this.field1514.field1179;
                            if (this.field1486 < 0 || this.field1486 >= this.field1514.field1197.length) {
                                this.field1514 = null;
                                continue label90;
                            }
                        }
                        this.field1487 = this.field1486 + 1;
                    } while (this.field1514.field1197.length > this.field1487);
                    this.field1487 -= this.field1514.field1179;
                } while (this.field1487 >= 0 && this.field1514.field1197.length > this.field1487);
                this.field1487 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "(II)V", line = 488)
    public final void method832(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field1487 = 70;
        }
        field1518++;
        this.field1496 = true;
        this.method826(arg1, 1);
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(I)I", line = 501)
    public final int method833(int arg0) {
        field1490++;
        if (arg0 > -25) {
            this.field1501 = -90;
        }
        return this.field1485;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(ZII)V", line = 513)
    public static final void method834(boolean arg0, int arg1, int arg2) {
        field1510++;
        if (!arg0 && class118.method934(arg2, 14)) {
            class472.method2878(true, class158.field2453[arg2], arg1);
        }
    }

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "(Z)V", line = 529)
    public static void method835(boolean arg0) {
        field1494 = null;
        if (arg0) {
            field1507 = 87;
        }
    }

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "(ILha;)V", line = 546)
    public final void method836(int arg0, class544 arg1) {
        if (this.field1517 != null) {
            class31.method162(this.field1517, this.field1506, this.field1489.field9477, this.field1489.field9475, this.field1511);
            this.field1511 = null;
            this.field1517 = null;
        }
        field1508++;
        if (arg0 > -29) {
            field1494 = null;
        }
    }
}
