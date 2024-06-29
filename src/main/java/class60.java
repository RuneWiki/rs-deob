import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class60 {

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    private int field1457 = 0;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "J")
    private long field1471 = -1L;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "J")
    private long field1466 = -1L;

    @OriginalMember(owner = "client!id", name = "C", descriptor = "Lkd;")
    private class73 field1480;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "J")
    private long field1462;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "J")
    private long field1473;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "J")
    private long field1469;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "[B")
    private byte[] field1461;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "[B")
    private byte[] field1455;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "Lja;")
    public static class62 field1454 = class30.method243(43, "Begeben Sie sich in ein freies Gebiet)1 um");

    @OriginalMember(owner = "client!id", name = "h", descriptor = "Lja;")
    public static class62 field1459 = null;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "Lc;")
    public static class18 field1470 = new class18(30);

    @OriginalMember(owner = "client!id", name = "z", descriptor = "I")
    public static int field1477 = 0;

    @OriginalMember(owner = "client!id", name = "B", descriptor = "[Lja;")
    public static class62[] field1479 = new class62[500];

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    private int field1458;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!id", name = "A", descriptor = "J")
    private long field1478;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "Lpd;")
    public static class108 field1464;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "Ls;")
    public static class128 field1476;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    private final void method428(int arg0) throws IOException {
        if (arg0 != 14771) {
            return;
        }
        field1456++;
        this.field1458 = 0;
        if (this.field1478 != this.field1469) {
            this.field1480.method608(this.field1469, -80);
            this.field1478 = this.field1469;
        }
        this.field1471 = this.field1469;
        while (this.field1455.length > this.field1458) {
            int var2 = this.field1480.method612((byte) 32, this.field1455, this.field1458, this.field1455.length - this.field1458);
            if (var2 == -1) {
                break;
            }
            this.field1458 += var2;
            this.field1478 += var2;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(JI)V")
    public final void method429(long arg0, int arg1) {
        field1467++;
        if (arg0 >= 0L) {
            if (arg1 <= 116) {
                this.method436((byte) -104);
            }
            this.field1469 = arg0;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIBI)V")
    public static final void method430(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        class63 var5 = (class63) class133.field3035.method840(true);
        if (arg3 != -78) {
            field1479 = null;
        }
        while (var5 != null) {
            if (var5.field1543 != -1 || var5.field1575 != null) {
                int var6 = 0;
                if (var5.field1562 < arg4) {
                    var6 += arg4 - var5.field1562;
                } else if (arg4 < var5.field1544) {
                    var6 += var5.field1544 - arg4;
                }
                if (var5.field1565 < arg2) {
                    var6 += arg2 - var5.field1565;
                } else if (var5.field1551 > arg2) {
                    var6 += var5.field1551 - arg2;
                }
                if (var5.field1554 < var6 - 64 || class83.field1993 == 0 || var5.field1567 != arg0) {
                    if (var5.field1563 != null) {
                        class98.field2293.method201(var5.field1563);
                        var5.field1563 = null;
                    }
                    if (var5.field1556 != null) {
                        class98.field2293.method201(var5.field1556);
                        var5.field1556 = null;
                    }
                } else {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = (var5.field1554 - var6) * class83.field1993 / var5.field1554;
                    if (var5.field1563 != null) {
                        var5.field1563.method787(var7);
                    } else if (var5.field1543 >= 0) {
                        class109 var8 = class109.method887(class88.field2086, var5.field1543, 0);
                        if (var8 != null) {
                            class74 var9 = var8.method885().method613(class100.field2316);
                            class99 var10 = class99.method779(var9, 100, var7);
                            var10.method781(-1);
                            class98.field2293.method198(var10);
                            var5.field1563 = var10;
                        }
                    }
                    if (var5.field1556 != null) {
                        var5.field1556.method787(var7);
                        if (!var5.field1556.method1180(-128)) {
                            var5.field1556 = null;
                        }
                    } else if (var5.field1575 != null && (var5.field1550 -= arg1) <= 0) {
                        int var11 = (int) (Math.random() * (double) var5.field1575.length);
                        class109 var12 = class109.method887(class88.field2086, var5.field1575[var11], 0);
                        if (var12 != null) {
                            class74 var13 = var12.method885().method613(class100.field2316);
                            class99 var14 = class99.method779(var13, 100, var7);
                            var14.method781(0);
                            class98.field2293.method198(var14);
                            var5.field1556 = var14;
                            var5.field1550 = (int) (Math.random() * (double) (var5.field1569 - var5.field1545)) + var5.field1545;
                        }
                    }
                }
            }
            var5 = (class63) class133.field3035.method841((byte) 18);
        }
        field1460++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "([BBII)V")
    public final void method431(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        field1452++;
        try {
            if (this.field1473 < (long) arg3 + this.field1469) {
                this.field1473 = (long) arg3 + this.field1469;
            }
            if (this.field1466 != -1L && (this.field1466 > this.field1469 || this.field1469 > this.field1466 + (long) this.field1457)) {
                this.method434(100);
            }
            if (this.field1466 != -1L && (long) arg3 + this.field1469 > (long) this.field1461.length + this.field1466) {
                int var5 = (int) (this.field1466 + (long) this.field1461.length - this.field1469);
                class78.method624(arg0, arg2, this.field1461, (int) (this.field1469 - this.field1466), var5);
                arg3 -= var5;
                arg2 += var5;
                this.field1469 += var5;
                this.field1457 = this.field1461.length;
                this.method434(111);
            }
            if (this.field1461.length < arg3) {
                long var6 = -1L;
                long var8 = -1L;
                if (this.field1478 != this.field1469) {
                    this.field1480.method608(this.field1469, 127);
                    this.field1478 = this.field1469;
                }
                this.field1480.method609(arg3, arg0, arg2, (byte) -51);
                if (this.field1471 <= this.field1469 && this.field1469 < this.field1471 + (long) this.field1458) {
                    var6 = this.field1469;
                } else if (this.field1469 <= this.field1471 && this.field1471 < (long) arg3 + this.field1469) {
                    var6 = this.field1471;
                }
                if (this.field1469 + (long) arg3 > this.field1471 && (long) this.field1458 + this.field1471 >= (long) arg3 + this.field1469) {
                    var8 = (long) arg3 + this.field1469;
                } else if ((long) this.field1458 + this.field1471 > this.field1469 && this.field1471 + (long) this.field1458 <= (long) arg3 + this.field1469) {
                    var8 = (long) this.field1458 + this.field1471;
                }
                this.field1478 += arg3;
                if (this.field1462 < this.field1478) {
                    this.field1462 = this.field1478;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class78.method624(arg0, (int) ((long) arg2 + var6 - this.field1469), this.field1455, (int) (var6 - this.field1471), var10);
                }
                this.field1469 += arg3;
            } else {
                int var11 = 108 / ((64 - arg1) / 41);
                if (arg3 > 0) {
                    if (this.field1466 == -1L) {
                        this.field1466 = this.field1469;
                    }
                    class78.method624(arg0, arg2, this.field1461, (int) (this.field1469 - this.field1466), arg3);
                    this.field1469 += arg3;
                    if (this.field1469 - this.field1466 > (long) this.field1457) {
                        this.field1457 = (int) (this.field1469 - this.field1466);
                    }
                }
            }
        } catch (IOException var13) {
            this.field1478 = -1L;
            throw var13;
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
    public static void method432(int arg0) {
        field1470 = null;
        field1464 = null;
        field1479 = null;
        if (arg0 != 0) {
            method432(-67);
        }
        field1454 = null;
        field1476 = null;
        field1459 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)V")
    public final void method433(boolean arg0) throws IOException {
        field1465++;
        if (!arg0) {
            method430(20, 16, 69, (byte) 74, 42);
        }
        this.method434(102);
        this.field1480.method610((byte) -70);
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V")
    private final void method434(int arg0) throws IOException {
        field1474++;
        if (this.field1466 != -1L) {
            if (this.field1478 != this.field1466) {
                this.field1480.method608(this.field1466, -74);
                this.field1478 = this.field1466;
            }
            this.field1480.method609(this.field1457, this.field1461, 0, (byte) 109);
            long var2 = -1L;
            this.field1478 += this.field1457;
            long var4 = -1L;
            if (this.field1471 <= this.field1466 && this.field1466 < this.field1471 + (long) this.field1458) {
                var2 = this.field1466;
            } else if (this.field1471 >= this.field1466 && (long) this.field1457 + this.field1466 > this.field1471) {
                var2 = this.field1471;
            }
            if (this.field1471 < this.field1466 + (long) this.field1457 && (long) this.field1458 + this.field1471 >= this.field1466 - -((long) this.field1457)) {
                var4 = (long) this.field1457 + this.field1466;
            } else if (this.field1466 < this.field1471 + (long) this.field1458 && (long) this.field1458 + this.field1471 <= (long) this.field1457 + this.field1466) {
                var4 = (long) this.field1458 + this.field1471;
            }
            if (this.field1478 > this.field1462) {
                this.field1462 = this.field1478;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class78.method624(this.field1461, (int) (var2 - this.field1466), this.field1455, (int) (var2 - this.field1471), var6);
            }
            this.field1466 = -1L;
            this.field1457 = 0;
        }
        int var7 = 74 % ((arg0 - 33) / 61);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IBI[B)V")
    public final void method435(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        field1468++;
        try {
            if (arg3.length < arg0 + arg2) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg2 - arg3.length);
            }
            if (this.field1466 != -1L && this.field1466 <= this.field1469 && (long) arg2 + this.field1469 <= (long) this.field1457 + this.field1466) {
                class78.method624(this.field1461, (int) (this.field1469 - this.field1466), arg3, arg0, arg2);
                this.field1469 += arg2;
                return;
            }
            long var5 = this.field1469;
            int var7 = arg2;
            int var8 = arg0;
            if (arg1 != -10) {
                return;
            }
            if (this.field1469 >= this.field1471 && this.field1469 < this.field1471 + (long) this.field1458) {
                int var9 = (int) ((long) this.field1458 + this.field1471 - this.field1469);
                if (arg2 < var9) {
                    var9 = arg2;
                }
                arg2 -= var9;
                class78.method624(this.field1455, (int) (this.field1469 - this.field1471), arg3, arg0, var9);
                this.field1469 += var9;
                arg0 += var9;
            }
            if (arg2 > this.field1455.length) {
                this.field1480.method608(this.field1469, 106);
                this.field1478 = this.field1469;
                while (arg2 > 0) {
                    int var11 = this.field1480.method612((byte) -95, arg3, arg0, arg2);
                    if (var11 == -1) {
                        break;
                    }
                    this.field1478 += var11;
                    arg2 -= var11;
                    this.field1469 += var11;
                    arg0 += var11;
                }
            } else if (arg2 > 0) {
                this.method428(14771);
                int var10 = arg2;
                if (arg2 > this.field1458) {
                    var10 = this.field1458;
                }
                class78.method624(this.field1455, 0, arg3, arg0, var10);
                arg0 += var10;
                this.field1469 += var10;
                arg2 -= var10;
            }
            if (this.field1466 != -1L) {
                if (this.field1469 < this.field1466 && arg2 > 0) {
                    int var12 = arg0 + (int) (this.field1466 - this.field1469);
                    if (arg0 + arg2 < var12) {
                        var12 = arg0 + arg2;
                    }
                    while (var12 > arg0) {
                        arg2--;
                        arg3[arg0++] = 0;
                        this.field1469++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 <= this.field1466 && var5 + (long) var7 > this.field1466) {
                    var13 = this.field1466;
                } else if (this.field1466 <= var5 && (long) this.field1457 + this.field1466 > var5) {
                    var13 = var5;
                }
                if (var5 < (long) this.field1457 + this.field1466 && (long) this.field1457 + this.field1466 <= (long) var7 + var5) {
                    var15 = (long) this.field1457 + this.field1466;
                } else if (this.field1466 < (long) var7 + var5 && (long) var7 + var5 <= this.field1466 - -((long) this.field1457)) {
                    var15 = (long) var7 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class78.method624(this.field1461, (int) (var13 - this.field1466), arg3, var8 + (int) (var13 - var5), var17);
                    if (this.field1469 < var15) {
                        arg2 = (int) ((long) arg2 + this.field1469 - var15);
                        this.field1469 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field1478 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)J")
    public final long method436(byte arg0) {
        if (arg0 == 9) {
            field1472++;
            return this.field1473;
        } else {
            return 12L;
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lkd;II)V")
    public class60(class73 arg0, int arg1, int arg2) throws IOException {
        this.field1480 = arg0;
        this.field1473 = this.field1462 = arg0.method607(2384);
        this.field1469 = 0L;
        this.field1461 = new byte[arg2];
        this.field1455 = new byte[arg1];
    }
}
