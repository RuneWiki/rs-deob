import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class107 {

    @OriginalMember(owner = "client!td", name = "b", descriptor = "Z")
    private boolean field1432 = false;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "Z")
    private boolean field1451 = false;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    private int field1446 = -32768;

    @OriginalMember(owner = "client!td", name = "D", descriptor = "I")
    private int field1460 = -1;

    @OriginalMember(owner = "client!td", name = "G", descriptor = "I")
    private int field1463 = -1;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    private int field1433;

    @OriginalMember(owner = "client!td", name = "B", descriptor = "I")
    public int field1458;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "I")
    private int field1449;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "I")
    public int field1456;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "B")
    private byte field1431;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "B")
    private byte field1457;

    @OriginalMember(owner = "client!td", name = "y", descriptor = "I")
    public int field1455;

    @OriginalMember(owner = "client!td", name = "F", descriptor = "Z")
    private boolean field1462;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "Lwq;")
    public static class33 field1452 = new class33(0, 0);

    @OriginalMember(owner = "client!td", name = "E", descriptor = "[I")
    public static int[] field1461 = new int[32];

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    private int field1443;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    private int field1447;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!td", name = "C", descriptor = "I")
    private int field1459;

    @OriginalMember(owner = "client!td", name = "H", descriptor = "I")
    private int field1464;

    @OriginalMember(owner = "client!td", name = "I", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!td", name = "J", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!td", name = "K", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "Lqr;")
    private class15 field1441;

    @OriginalMember(owner = "client!td", name = "M", descriptor = "Lqp;")
    public class279 field1468;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "Loc;")
    private class93 field1434;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "Lqc;")
    private class95 field1436;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "[Z")
    private boolean[] field1438;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(III)V", line = 11)
    private final void method737(int arg0, int arg1, int arg2) {
        int var4 = -12 % ((arg2 + 9) / 57);
        field1453++;
        label88: while (true) {
            if (this.field1441 == null) {
                if (this.field1451) {
                    return;
                }
                this.method745(-97, -1);
                if (this.field1441 == null) {
                    return;
                }
            }
            int var5 = class50.field698 - this.field1464;
            if (var5 > 100 && this.field1441.field174 > 0) {
                int var6 = this.field1441.field150.length - this.field1441.field174;
                while (this.field1447 < var6 && this.field1441.field164[this.field1447] < var5) {
                    var5 -= this.field1441.field164[this.field1447];
                    this.field1447++;
                }
                if (this.field1447 >= var6) {
                    int var7 = 0;
                    for (int var8 = var6; var8 < this.field1441.field150.length; var8++) {
                        var7 += this.field1441.field164[var8];
                    }
                    var5 %= var7;
                }
                this.field1459 = this.field1447 + 1;
                if (this.field1441.field150.length <= this.field1459) {
                    this.field1459 -= this.field1441.field174;
                    if (this.field1459 < 0 || this.field1459 >= this.field1441.field150.length) {
                        this.field1459 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var5 <= this.field1441.field164[this.field1447]) {
                            this.field1443 = var5;
                            this.field1464 = class50.field698 - var5;
                            return;
                        }
                        class277.method1770(arg0, 21155, false, this.field1447, arg1, this.field1441);
                        var5 -= this.field1441.field164[this.field1447];
                        this.field1447++;
                        if (this.field1447 >= this.field1441.field150.length) {
                            this.field1447 -= this.field1441.field174;
                            if (this.field1447 < 0 || this.field1447 >= this.field1441.field150.length) {
                                this.field1441 = null;
                                continue label88;
                            }
                        }
                        this.field1459 = this.field1447 + 1;
                    } while (this.field1459 < this.field1441.field150.length);
                    this.field1459 -= this.field1441.field174;
                } while (this.field1459 >= 0 && this.field1441.field150.length > this.field1459);
                this.field1459 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IZILqc;Lnr;IZI)V", line = 110)
    public final void method738(int arg0, boolean arg1, int arg2, class95 arg3, class437 arg4, int arg5, boolean arg6, int arg7) {
        field1442++;
        class322[] var9 = arg3.method595();
        class145[] var10 = arg3.method607();
        if ((this.field1468 == null || this.field1468.field4091) && (var9 != null || var10 != null)) {
            class404 var11 = class165.method1020(this.field1455, -11);
            if (var11.field5999 != null) {
                var11 = var11.method2626(18);
            }
            if (var11 != null) {
                this.field1468 = new class279(class50.field698);
            }
        }
        if (arg6) {
            this.field1441 = null;
        }
        if (this.field1468 == null) {
            return;
        }
        if (arg1) {
            this.field1468.method1790(arg4, (long) class50.field698, var9, var10, false);
        } else {
            this.field1468.method1785((long) class50.field698);
        }
        this.field1468.method1793(this.field1457, arg0, arg7, arg5, arg2);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILnr;IIZZI)Lqc;", line = 150)
    public final class95 method739(int arg0, class437 arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
        int var8 = 104 % ((21 - arg6) / 41);
        field1439++;
        class404 var9 = class165.method1020(this.field1455, 124);
        if (var9.field5999 != null) {
            var9 = var9.method2626(18);
        }
        if (var9 == null) {
            this.method742(arg1, 4);
            this.field1460 = -1;
            this.field1463 = this.field1447;
            return null;
        }
        if (!this.field1451 && this.field1460 != var9.field6059) {
            this.field1436 = null;
            this.method745(-84, -1);
        }
        this.method737(arg2, arg3, -106);
        boolean var10 = arg4 & this.field1462 & class176.field2300 != 0;
        boolean var11 = var10 & (this.field1460 != var9.field6059 || (this.field1463 != this.field1447 || this.field1441 != null && (this.field1441.field169 || class408.field6114) && this.field1459 != this.field1447) && class176.field2300 >= 2);
        if (arg5 && !var11) {
            this.field1460 = var9.field6059;
            this.field1463 = this.field1447;
            return null;
        }
        if (var11) {
            class132.method897(this.field1434, this.field1431, this.field1449, this.field1433, this.field1438);
        }
        class337 var12 = class88.field1226[this.field1431];
        class337 var13;
        if (this.field1432) {
            var13 = class198.field2829[0];
        } else {
            var13 = this.field1431 < 3 ? class88.field1226[this.field1431 + 1] : null;
        }
        class95 var14 = null;
        if (this.field1441 != null) {
            if (var11) {
                arg0 |= 0x20000;
            }
            var14 = var9.method2627(arg1, var12.method797(this.field1449, this.field1433), this.field1433, this.field1456 == 11 ? this.field1458 + 4 : this.field1458, var12, this.field1443, this.field1449, arg0, this.field1459, this.field1441, this.field1456 == 11 ? 10 : this.field1456, -4, this.field1447, var13);
            if (var14 == null) {
                this.field1446 = 0;
                this.field1438 = null;
                this.field1434 = null;
            } else {
                if (var11) {
                    if (this.field1438 == null) {
                        this.field1438 = new boolean[4];
                    }
                    this.field1434 = var14.method624(this.field1434);
                    class8.method61(this.field1434, this.field1431, arg2, arg3, this.field1438);
                }
                this.field1446 = var14.method597();
            }
            this.field1436 = null;
        } else if (this.field1436 != null && (arg0 & this.field1436.method594()) == arg0 && this.field1460 == var9.field6059) {
            var14 = this.field1436;
        } else {
            if (this.field1436 != null) {
                arg0 |= this.field1436.method594();
            }
            class284 var15 = var9.method2622(this.field1456 == 11 ? 10 : this.field1456, arg1, var12, this.field1456 == 11 ? this.field1458 + 4 : this.field1458, this.field1433, this.field1449, var12.method797(this.field1449, this.field1433), arg0, var13, 113, var11);
            if (var15 == null) {
                this.field1434 = null;
                this.field1436 = null;
                this.field1438 = null;
                this.field1446 = 0;
            } else {
                var14 = var15.field4144;
                this.field1436 = var15.field4144;
                if (var11) {
                    this.field1434 = var15.field4143;
                    this.field1438 = null;
                    class8.method61(this.field1434, this.field1431, arg2, arg3, (boolean[]) null);
                }
                this.field1446 = var14.method597();
            }
        }
        this.field1460 = var9.field6059;
        this.field1433 = arg3;
        this.field1463 = this.field1447;
        this.field1449 = arg2;
        return var14;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V", line = 272)
    public static void method740(int arg0) {
        if (arg0 >= -22) {
            field1452 = null;
        }
        field1461 = null;
        field1452 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lme;)V", line = 285)
    public static final void method741(class361 arg0) {
        for (int var1 = arg0.field5296; var1 <= arg0.field5293; var1++) {
            for (int var2 = arg0.field5288; var2 <= arg0.field5286; var2++) {
                class10 var3 = class343.field5032[arg0.field5291][var1][var2];
                if (var3 != null) {
                    class39 var4 = var3.field109;
                    class39 var5 = null;
                    while (var4 != null) {
                        if (var4.field621 == arg0) {
                            if (var5 == null) {
                                var3.field109 = var4.field627;
                            } else {
                                var5.field627 = var4.field627;
                            }
                            var4.method302(0);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field627;
                    }
                    var3.field104 = 0;
                    for (class39 var6 = var3.field109; var6 != null; var6 = var6.field627) {
                        var3.field104 = (byte) (var3.field104 | var6.field622);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lnr;Lta;IIIIIIZI)V", line = 642)
    public class107(class437 arg0, class404 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field1433 = arg7;
        this.field1458 = arg3;
        this.field1432 = arg8;
        this.field1449 = arg6;
        this.field1456 = arg2;
        this.field1431 = (byte) arg5;
        this.field1457 = (byte) arg4;
        this.field1455 = arg1.field6059;
        this.field1462 = arg0.method2086() && arg1.field6081 && !this.field1432;
        if (arg9 != -1) {
            this.field1451 = true;
        }
        this.method745(-77, arg9);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lnr;I)V", line = 351)
    public final void method742(class437 arg0, int arg1) {
        if (arg1 != 4) {
            this.field1468 = null;
        }
        if (this.field1434 != null) {
            class132.method897(this.field1434, this.field1431, this.field1449, this.field1433, this.field1438);
            this.field1438 = null;
            this.field1434 = null;
        }
        field1435++;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)Z", line = 368)
    public final boolean method743(int arg0) {
        if (arg0 != -1724944720) {
            this.field1438 = null;
        }
        field1437++;
        return this.field1462;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V", line = 382)
    public static final void method744(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class408.field6122[var1] = false;
        }
        field1450++;
        class274.field4035 = 0;
        class125.field1667 = -1;
        class104.field1402 = -1;
        class5.field48 = 1;
        class100.field1358 = arg0;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)V", line = 403)
    private final void method745(int arg0, int arg1) {
        field1466++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class404 var5 = class165.method1020(this.field1455, 19);
            class404 var6 = var5;
            if (var5.field5999 != null) {
                var5 = var5.method2626(18);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field6003 != null) {
                if (this.field1441 != null && var5.method2634(-150, this.field1441.field148)) {
                    return;
                }
                var3 = var5.method2629(-108);
                if (this.field1460 != var5.field6059) {
                    var4 = var5.field6022;
                }
            } else if (var5.field6064 == -1) {
                if (var6 != null && var6.field6003 != null) {
                    if (this.field1441 != null && var6.method2634(-150, this.field1441.field148)) {
                        return;
                    }
                    var3 = var6.method2629(-119);
                    if (this.field1460 != var6.field6059) {
                        var4 = var6.field6022;
                    }
                } else if (var6 != null && var6.field6064 != -1 && this.field1460 != var6.field6059) {
                    var4 = var6.field6022;
                    var3 = var6.field6064;
                }
            } else if (this.field1460 != var5.field6059) {
                var4 = var5.field6022;
                var3 = var5.field6064;
            }
        }
        if (var3 == -1) {
            this.field1441 = null;
            return;
        }
        this.field1436 = null;
        if (this.field1441 == null || this.field1441.field148 != var3) {
            this.field1441 = class391.method2551(var3, (byte) -113);
        } else if (this.field1441.field166 == 0) {
            return;
        }
        if (this.field1441.field150 == null) {
            this.field1441 = null;
            return;
        }
        int var7 = -26 % ((-arg0 - 23) / 32);
        if (var4) {
            this.field1447 = (int) ((double) this.field1441.field150.length * Math.random());
            this.field1443 = ((int) (Math.random() * (double) this.field1441.field164[this.field1447])) + 1;
        } else {
            this.field1443 = 1;
            this.field1447 = 0;
        }
        this.field1459 = this.field1447 + 1;
        if (this.field1459 < 0 || this.field1441.field150.length <= this.field1459) {
            this.field1459 = -1;
        }
        this.field1464 = class50.field698 - this.field1443;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(II)Lro;", line = 522)
    public static final class249 method746(int arg0, int arg1) {
        field1445++;
        int var2 = arg0 >> 16;
        if (arg1 >= -3) {
            method744(42);
        }
        int var3 = arg0 & 0xFFFF;
        if (class119.field1607[var2] == null || class119.field1607[var2][var3] == null) {
            boolean var4 = class126.method864((byte) -92, var2);
            if (!var4) {
                return null;
            }
        }
        return class119.field1607[var2][var3];
    }

    @OriginalMember(owner = "client!td", name = "finalize", descriptor = "()V", line = 547)
    protected final void finalize() {
        field1467++;
        if (this.field1468 != null) {
            this.field1468.method1789();
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V", line = 566)
    public static final void method747(byte arg0) {
        field1444++;
        class24 var1 = class79.field1080;
        synchronized (class79.field1080) {
            class79.field1080.method212(-113);
        }
        int var2 = -40 / ((arg0 + 5) / 38);
        class24 var3 = class29.field500;
        synchronized (class29.field500) {
            class29.field500.method212(-102);
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(B)I", line = 582)
    public final int method748(byte arg0) {
        field1454++;
        int var2 = 105 / ((10 - arg0) / 39);
        return this.field1446;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lnr;B)V", line = 604)
    public final void method749(class437 arg0, byte arg1) {
        if (arg1 != -5) {
            this.field1434 = null;
        }
        field1440++;
        this.method739(131072, arg0, this.field1449, this.field1433, true, true, 127);
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(II)V", line = 623)
    public final void method750(int arg0, int arg1) {
        if (arg1 >= 61) {
            this.field1451 = true;
            field1448++;
            this.method745(54, arg0);
        }
    }
}
