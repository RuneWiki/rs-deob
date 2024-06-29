import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class73 {

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
    private int field1429 = 32;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "J")
    private long field1423 = class52.method315((byte) 16);

    @OriginalMember(owner = "client!hh", name = "v", descriptor = "I")
    private int field1437 = 0;

    @OriginalMember(owner = "client!hh", name = "A", descriptor = "Z")
    private boolean field1442 = true;

    @OriginalMember(owner = "client!hh", name = "B", descriptor = "J")
    private long field1443 = 0L;

    @OriginalMember(owner = "client!hh", name = "F", descriptor = "I")
    private int field1447 = 0;

    @OriginalMember(owner = "client!hh", name = "E", descriptor = "[Log;")
    private class134[] field1446 = new class134[8];

    @OriginalMember(owner = "client!hh", name = "H", descriptor = "[Log;")
    private class134[] field1449 = new class134[8];

    @OriginalMember(owner = "client!hh", name = "C", descriptor = "I")
    private int field1444 = 0;

    @OriginalMember(owner = "client!hh", name = "J", descriptor = "I")
    private int field1451 = 0;

    @OriginalMember(owner = "client!hh", name = "D", descriptor = "J")
    private long field1445 = 0L;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field1420 = 7759444;

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "I")
    public static int field1433 = 0;

    @OriginalMember(owner = "client!hh", name = "G", descriptor = "Ln;")
    public static class118 field1448 = new class118();

    @OriginalMember(owner = "client!hh", name = "L", descriptor = "Led;")
    private static class43 field1453 = class191.method1219("Please remove ", false);

    @OriginalMember(owner = "client!hh", name = "N", descriptor = "Led;")
    public static class43 field1455 = field1453;

    @OriginalMember(owner = "client!hh", name = "M", descriptor = "Led;")
    private static class43 field1454 = class191.method1219("Account locked as we suspect it has been stolen)3", false);

    @OriginalMember(owner = "client!hh", name = "O", descriptor = "Led;")
    public static class43 field1456 = field1453;

    @OriginalMember(owner = "client!hh", name = "R", descriptor = "Led;")
    private static class43 field1459 = class191.method1219("glow1:", false);

    @OriginalMember(owner = "client!hh", name = "K", descriptor = "Led;")
    public static class43 field1452 = field1454;

    @OriginalMember(owner = "client!hh", name = "Q", descriptor = "Led;")
    public static class43 field1458 = field1459;

    @OriginalMember(owner = "client!hh", name = "P", descriptor = "I")
    public static int field1457 = 0;

    @OriginalMember(owner = "client!hh", name = "S", descriptor = "Led;")
    public static class43 field1460 = class191.method1219("gleiten:", false);

    @OriginalMember(owner = "client!hh", name = "T", descriptor = "Led;")
    public static class43 field1461 = field1459;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!hh", name = "w", descriptor = "I")
    private int field1438;

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "I")
    public int field1439;

    @OriginalMember(owner = "client!hh", name = "y", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!hh", name = "I", descriptor = "I")
    public int field1450;

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "Log;")
    private class134 field1436;

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "Z")
    public static boolean field1434;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "[I")
    public int[] field1419;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public final synchronized void method443(int arg0) {
        this.field1442 = true;
        field1430++;
        if (arg0 >= -46) {
            field1461 = null;
        }
        try {
            this.method447();
        } catch (Exception var2) {
            this.method454();
            this.field1445 = class52.method315((byte) 99) + 2000L;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BI)V")
    private final void method444(byte arg0, int arg1) {
        if (arg0 >= -16) {
            return;
        }
        field1432++;
        this.field1444 -= arg1;
        if (this.field1444 < 0) {
            this.field1444 = 0;
        }
        if (this.field1436 != null) {
            this.field1436.method652(arg1);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "([II)V")
    private final void method445(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class88.field1708) {
            var3 = arg1 << 1;
        }
        class42.method232(arg0, 0, var3);
        this.field1444 -= arg1;
        if (this.field1436 != null && this.field1444 <= 0) {
            this.field1444 += class38.field726 >> 4;
            class82.method506(false, this.field1436);
            this.method446(this.field1436, this.field1436.method859(), (byte) -4);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class134 var10 = null;
                        class134 var11 = this.field1446[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class192 var12 = var11.field2791;
                                if (var12 == null || var12.field3729 <= var8) {
                                    var11.field2790 = true;
                                    int var13 = var11.method654();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3729 += var13;
                                    }
                                    if (var4 >= this.field1429) {
                                        break label107;
                                    }
                                    class134 var14 = var11.method651();
                                    if (var14 != null) {
                                        int var15 = var11.field2793;
                                        while (var14 != null) {
                                            this.method446(var14, var15 * var14.method859() >> 8, (byte) -4);
                                            var14 = var11.method655();
                                        }
                                    }
                                    class134 var16 = var11.field2792;
                                    var11.field2792 = null;
                                    if (var10 == null) {
                                        this.field1446[var7] = var16;
                                    } else {
                                        var10.field2792 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1449[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2792;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class134 var18 = this.field1446[var17];
                this.field1446[var17] = this.field1449[var17] = null;
                while (var18 != null) {
                    class134 var19 = var18.field2792;
                    var18.field2792 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field1444 < 0) {
            this.field1444 = 0;
        }
        if (this.field1436 != null) {
            this.field1436.method653(arg0, 0, arg1);
        }
        this.field1423 = class52.method315((byte) 97);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Log;IB)V")
    private final void method446(class134 arg0, int arg1, byte arg2) {
        field1425++;
        if (arg2 != -4) {
            field1459 = null;
        }
        int var4 = arg1 >> 5;
        class134 var5 = this.field1449[var4];
        if (var5 == null) {
            this.field1446[var4] = arg0;
        } else {
            var5.field2792 = arg0;
        }
        this.field1449[var4] = arg0;
        arg0.field2793 = arg1;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "()V")
    public void method447() throws Exception {
        field1427++;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public static void method448(byte arg0) {
        field1448 = null;
        field1454 = null;
        field1453 = null;
        field1456 = null;
        field1461 = null;
        field1455 = null;
        field1459 = null;
        field1460 = null;
        field1458 = null;
        if (arg0 != 100) {
            method448((byte) 108);
        }
        field1452 = null;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
    public final synchronized void method449(int arg0) {
        field1416++;
        if (this.field1419 == null) {
            return;
        }
        long var2 = class52.method315((byte) -125);
        try {
            if (arg0 != 2000) {
                return;
            }
            if (this.field1445 != 0L) {
                if (var2 < this.field1445) {
                    return;
                }
                this.method457(this.field1439);
                this.field1442 = true;
                this.field1445 = 0L;
            }
            int var4 = this.method451();
            if (this.field1437 < this.field1451 - var4) {
                this.field1437 = this.field1451 - var4;
            }
            int var5 = this.field1450 + this.field1438;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field1439) {
                var4 = 0;
                this.field1439 += 1024;
                if (this.field1439 > 16384) {
                    this.field1439 = 16384;
                }
                this.method454();
                this.method457(this.field1439);
                this.field1442 = true;
                if (var5 + 256 > this.field1439) {
                    var5 = this.field1439 - 256;
                    this.field1438 = var5 - this.field1450;
                }
            }
            while (var5 > var4) {
                this.method445(this.field1419, 256);
                var4 += 256;
                this.method453();
            }
            if (this.field1443 < var2) {
                if (this.field1442) {
                    this.field1442 = false;
                } else if (this.field1437 == 0 && this.field1447 == 0) {
                    this.method454();
                    this.field1445 = var2 + 2000L;
                    return;
                } else {
                    this.field1438 = Math.min(this.field1447, this.field1437);
                    this.field1447 = this.field1437;
                }
                this.field1443 = var2 + 2000L;
                this.field1437 = 0;
            }
            this.field1451 = var4;
        } catch (Exception var7) {
            this.method454();
            this.field1445 = var2 + 2000L;
        }
        try {
            if (this.field1423 + 500000L < var2) {
                var2 = this.field1423;
            }
            while (this.field1423 + 5000L < var2) {
                this.method444((byte) -92, 256);
                this.field1423 += 256000 / class38.field726;
            }
        } catch (Exception var6) {
            this.field1423 = var2;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILog;)V")
    public final synchronized void method450(int arg0, class134 arg1) {
        field1431++;
        if (arg0 != 2000) {
            this.method443(-2);
        }
        this.field1436 = arg1;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "()I")
    public int method451() throws Exception {
        field1426++;
        return this.field1439;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method452(Component arg0) throws Exception {
        field1422++;
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "()V")
    public void method453() throws Exception {
        field1424++;
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "()V")
    public void method454() {
        field1418++;
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)V")
    public final void method455(int arg0) {
        this.field1442 = true;
        field1428++;
        int var2 = 106 / ((61 - arg0) / 60);
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V")
    public final synchronized void method456(int arg0) {
        field1441++;
        if (class128.field2558 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class128.field2558.field1957[var3] == this) {
                    class128.field2558.field1957[var3] = null;
                }
                if (class128.field2558.field1957[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class128.field2558.field1952 = true;
                while (class128.field2558.field1966) {
                    class38.method209(50L, -7296);
                }
                class128.field2558 = null;
            }
        }
        if (arg0 != 0) {
            this.field1444 = -43;
        }
        this.method454();
        this.field1419 = null;
    }

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "(I)V")
    public void method457(int arg0) throws Exception {
        field1440++;
    }
}
