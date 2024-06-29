import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class102 {

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "Lqi;")
    private class257 field1484 = new class257();

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "Lqi;")
    private class257 field1493 = new class257();

    @OriginalMember(owner = "client!ig", name = "B", descriptor = "Lqi;")
    private class257 field1496 = new class257();

    @OriginalMember(owner = "client!ig", name = "C", descriptor = "Lqi;")
    private class257 field1497 = new class257();

    @OriginalMember(owner = "client!ig", name = "D", descriptor = "Lwm;")
    private class254 field1498 = new class254(4);

    @OriginalMember(owner = "client!ig", name = "I", descriptor = "I")
    public volatile int field1503 = 0;

    @OriginalMember(owner = "client!ig", name = "J", descriptor = "I")
    public volatile int field1504 = 0;

    @OriginalMember(owner = "client!ig", name = "K", descriptor = "B")
    private byte field1505 = 0;

    @OriginalMember(owner = "client!ig", name = "H", descriptor = "Lwm;")
    private class254 field1502 = new class254(8);

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "[I")
    public static int[] field1472 = new int[99];

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field1469 = new String[100];

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1478 = "white:";

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public static int field1482 = 3;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public static int field1474 = 0;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1473 = "Prepared sound engine";

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!ig", name = "G", descriptor = "I")
    private int field1501;

    @OriginalMember(owner = "client!ig", name = "E", descriptor = "J")
    private long field1499;

    @OriginalMember(owner = "client!ig", name = "F", descriptor = "Le;")
    private class237 field1500;

    @OriginalMember(owner = "client!ig", name = "L", descriptor = "Llb;")
    private class243 field1506;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "Lrj;")
    public static class269 field1470;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "Ljd;")
    public static class95 field1479;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1480;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V", line = 4)
    public static void method765(int arg0) {
        if (arg0 < 26) {
            return;
        }
        field1472 = null;
        field1479 = null;
        field1473 = null;
        field1480 = null;
        field1478 = null;
        field1469 = null;
        field1470 = null;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V", line = 20)
    public static final void method766(int arg0) {
        field1477++;
        if (class341.field5303 > class198.field3035) {
            class198.field3035 = (float) ((double) class198.field3035 / 30.0D + (double) class198.field3035);
            if (class198.field3035 > class341.field5303) {
                class198.field3035 = class341.field5303;
            }
            class7.method73(-13969);
        } else if (class198.field3035 > class341.field5303) {
            class198.field3035 = (float) ((double) class198.field3035 - (double) class198.field3035 / 30.0D);
            if (class198.field3035 < class341.field5303) {
                class198.field3035 = class341.field5303;
            }
            class7.method73(-13969);
        }
        if (arg0 != 200) {
            method766(102);
        }
        if (class78.field1145 == -1 || class114.field1799 == -1) {
            return;
        }
        int var1 = class78.field1145 - class8.field119;
        if (var1 < 2 || var1 > 2) {
            var1 >>= 0x4;
        }
        class8.field119 += var1;
        int var2 = class114.field1799 - class49.field680;
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        class49.field680 += var2;
        if (var1 == 0 && var2 == 0) {
            class78.field1145 = -1;
            class114.field1799 = -1;
        }
        class7.method73(-13969);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILmn;II)V", line = 78)
    public static final void method767(int arg0, class161 arg1, int arg2, int arg3) {
        field1490++;
        if (class32.field393 < 2 && class320.field4939 == 0 && !class7.field110) {
            return;
        }
        String var4 = class225.method1604(-26202);
        if (arg2 != 16777215) {
            field1482 = 38;
        }
        if (arg1 == null) {
            int var6 = class167.field2703.method2268(var4, arg0 + 4, arg3 - -15, 16777215, 0, class130.field1999, class231.field3522);
            class278.method1927(15, arg0 + 4, (byte) -90, arg3, class167.field2703.method2281(var4) + var6);
            return;
        }
        class326 var5 = arg1.method1199(false, class241.field3676);
        if (var5 == null) {
            var5 = class167.field2703;
        }
        var5.method2279(var4, arg0, arg3, arg1.field2619, arg1.field2490, arg1.field2597, arg1.field2568, arg1.field2541, arg1.field2469, class130.field1999, class231.field3522, class281.field4379);
        class278.method1927(class281.field4379[3], class281.field4379[0], (byte) -90, class281.field4379[1], class281.field4379[2]);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZB)V", line = 111)
    public final void method768(boolean arg0, byte arg1) {
        field1488++;
        if (this.field1500 == null || arg1 != 45) {
            return;
        }
        try {
            this.field1498.field3866 = 0;
            this.field1498.method1752(arg0 ? 2 : 3, arg1 ^ 0xFFFFFF81);
            this.field1498.method1771(0, 15608);
            this.field1500.method1651(0, 4, this.field1498.field3840, (byte) -128);
        } catch (IOException var6) {
            try {
                this.field1500.method1653(-19746);
            } catch (Exception var5) {
            }
            this.field1504 = -2;
            this.field1500 = null;
            this.field1503++;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V", line = 141)
    private final void method769(byte arg0) {
        field1481++;
        if (this.field1500 == null) {
            return;
        }
        try {
            int var2 = 14 / ((-arg0 - 43) / 58);
            this.field1498.field3866 = 0;
            this.field1498.method1752(6, -125);
            this.field1498.method1771(3, 15608);
            this.field1500.method1651(0, 4, this.field1498.field3840, (byte) -50);
        } catch (IOException var6) {
            try {
                this.field1500.method1653(-19746);
            } catch (Exception var5) {
            }
            this.field1504 = -2;
            this.field1500 = null;
            this.field1503++;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field1472[var1] = var0 / 4;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IBZII)Llb;", line = 177)
    public final class243 method770(int arg0, byte arg1, boolean arg2, int arg3, int arg4) {
        field1476++;
        long var6 = (long) ((arg4 << 16) + arg3);
        class243 var8 = new class243();
        var8.field3149 = arg2;
        if (arg0 != 9) {
            this.method777((byte) -107);
        }
        var8.field5013 = var6;
        var8.field3697 = arg1;
        if (arg2) {
            if (this.method780(false) >= 20) {
                throw new RuntimeException();
            }
            this.field1484.method1810(var8, false);
        } else if (this.method779(-2) < 20) {
            this.field1496.method1810(var8, false);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)Z", line = 227)
    public final boolean method771(int arg0) {
        field1487++;
        if (this.field1500 != null) {
            long var2 = class105.method789((byte) 55);
            int var4 = (int) (var2 - this.field1499);
            this.field1499 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field1501 += var4;
            if (this.field1501 > 30000) {
                try {
                    this.field1500.method1653(-19746);
                } catch (Exception var30) {
                }
                this.field1500 = null;
            }
        }
        if (this.field1500 == null) {
            return this.method780(false) == 0 && this.method779(-2) == 0;
        }
        try {
            this.field1500.method1649(-28307);
            for (class243 var6 = (class243) this.field1484.method1811(7); var6 != null; var6 = (class243) this.field1484.method1807(126)) {
                this.field1498.field3866 = 0;
                this.field1498.method1752(1, -96);
                this.field1498.method1771((int) var6.field5013, 15608);
                this.field1500.method1651(0, 4, this.field1498.field3840, (byte) -128);
                this.field1493.method1810(var6, false);
            }
            for (class243 var7 = (class243) this.field1496.method1811(7); var7 != null; var7 = (class243) this.field1496.method1807(124)) {
                this.field1498.field3866 = 0;
                this.field1498.method1752(0, -119);
                this.field1498.method1771((int) var7.field5013, 15608);
                this.field1500.method1651(0, 4, this.field1498.field3840, (byte) -91);
                this.field1497.method1810(var7, false);
            }
            if (arg0 >= -95) {
                field1482 = 31;
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field1500.method1648(0);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field1501 = 0;
                byte var10 = 0;
                if (this.field1506 == null) {
                    var10 = 8;
                } else if (this.field1506.field3696 == 0) {
                    var10 = 1;
                }
                if (var10 > 0) {
                    int var11 = var10 - this.field1502.field3866;
                    if (var9 < var11) {
                        var11 = var9;
                    }
                    this.field1500.method1656(var11, true, this.field1502.field3866, this.field1502.field3840);
                    if (this.field1505 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field1502.field3840[this.field1502.field3866 + var12] = (byte) class181.method1355(this.field1502.field3840[this.field1502.field3866 + var12], this.field1505);
                        }
                    }
                    this.field1502.field3866 += var11;
                    if (var10 <= this.field1502.field3866) {
                        if (this.field1506 == null) {
                            this.field1502.field3866 = 0;
                            int var13 = this.field1502.method1774((byte) -123);
                            int var14 = this.field1502.method1755(false);
                            int var15 = this.field1502.method1774((byte) -103);
                            int var16 = this.field1502.method1741(-32769);
                            int var17 = var15 & 0x7F;
                            boolean var18 = (var15 & 0x80) != 0;
                            long var19 = (long) ((var13 << 16) + var14);
                            Object var21 = null;
                            class243 var22;
                            if (var18) {
                                for (var22 = (class243) this.field1497.method1811(7); var22 != null && var22.field5013 != var19; var22 = (class243) this.field1497.method1807(-53)) {
                                }
                            } else {
                                for (var22 = (class243) this.field1493.method1811(7); var22 != null && var22.field5013 != var19; var22 = (class243) this.field1493.method1807(121)) {
                                }
                            }
                            if (var22 == null) {
                                throw new IOException();
                            }
                            this.field1506 = var22;
                            int var23 = var17 == 0 ? 5 : 9;
                            this.field1506.field3694 = new class254(var16 + this.field1506.field3697 + var23);
                            this.field1506.field3694.method1752(var17, -105);
                            this.field1506.field3694.method1773(var16, false);
                            this.field1506.field3696 = 8;
                            this.field1502.field3866 = 0;
                        } else if (this.field1506.field3696 != 0) {
                            throw new IOException();
                        } else if (this.field1502.field3840[0] == -1) {
                            this.field1506.field3696 = 1;
                            this.field1502.field3866 = 0;
                        } else {
                            this.field1506 = null;
                        }
                    }
                } else {
                    int var24 = this.field1506.field3694.field3840.length - this.field1506.field3697;
                    int var25 = 512 - this.field1506.field3696;
                    if (var24 - this.field1506.field3694.field3866 < var25) {
                        var25 = var24 - this.field1506.field3694.field3866;
                    }
                    if (var25 > var9) {
                        var25 = var9;
                    }
                    this.field1500.method1656(var25, true, this.field1506.field3694.field3866, this.field1506.field3694.field3840);
                    if (this.field1505 != 0) {
                        for (int var26 = 0; var26 < var25; var26++) {
                            this.field1506.field3694.field3840[this.field1506.field3694.field3866 + var26] = (byte) class181.method1355(this.field1506.field3694.field3840[this.field1506.field3694.field3866 + var26], this.field1505);
                        }
                    }
                    this.field1506.field3694.field3866 += var25;
                    this.field1506.field3696 += var25;
                    if (this.field1506.field3694.field3866 == var24) {
                        this.field1506.method2257(false);
                        this.field1506.field3139 = false;
                        this.field1506 = null;
                    } else if (this.field1506.field3696 == 512) {
                        this.field1506.field3696 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var31) {
            try {
                this.field1500.method1653(-19746);
            } catch (Exception var29) {
            }
            this.field1503++;
            this.field1504 = -2;
            this.field1500 = null;
            return this.method780(false) == 0 && this.method779(-2) == 0;
        }
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)V", line = 511)
    public final void method772(int arg0) {
        try {
            this.field1500.method1653(-19746);
        } catch (Exception var3) {
        }
        this.field1505 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        if (arg0 <= 94) {
            this.method772(-105);
        }
        field1471++;
        this.field1500 = null;
        this.field1503++;
        this.field1504 = -1;
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(I)Z", line = 529)
    public final boolean method773(int arg0) {
        field1491++;
        if (arg0 > -104) {
            field1474 = -47;
        }
        return this.method779(-2) >= 20;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)Lqe;", line = 546)
    public static final class211 method774(int arg0, int arg1) {
        field1495++;
        class211 var2 = (class211) class305.field4723.method747((long) arg0, (byte) 85);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = field1479.method696(arg0, (byte) 116, 16);
        class211 var4 = new class211();
        if (var3 != null) {
            var4.method1514(new class254(var3), (byte) -120);
        }
        if (arg1 == -2) {
            class305.field4723.method744(var4, -15692, (long) arg0);
            return var4;
        } else {
            return (class211) null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)Z", line = 570)
    public final boolean method775(boolean arg0) {
        field1486++;
        if (!arg0) {
            this.field1503 = 44;
        }
        return this.method780(!arg0) >= 20;
    }

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "(I)V", line = 581)
    public final void method776(int arg0) {
        field1475++;
        if (this.field1500 == null) {
            return;
        }
        try {
            this.field1498.field3866 = 0;
            if (arg0 != 4065) {
                field1482 = 30;
            }
            this.field1498.method1752(7, -111);
            this.field1498.method1771(0, arg0 ^ 0x3319);
            this.field1500.method1651(0, 4, this.field1498.field3840, (byte) -35);
        } catch (IOException var5) {
            try {
                this.field1500.method1653(arg0 - 23811);
            } catch (Exception var4) {
            }
            this.field1503++;
            this.field1500 = null;
            this.field1504 = -2;
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(B)V", line = 613)
    public final void method777(byte arg0) {
        if (this.field1500 != null) {
            this.field1500.method1653(-19746);
        }
        if (arg0 < 65) {
            this.field1497 = (class257) null;
        }
        field1494++;
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(B)V", line = 628)
    public final void method778(byte arg0) {
        field1492++;
        if (this.field1500 != null) {
            this.field1500.method1650(-1);
        }
        int var2 = -90 % ((arg0 - 18) / 42);
    }

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "(I)I", line = 644)
    private final int method779(int arg0) {
        if (arg0 == -2) {
            field1485++;
            return this.field1496.method1808((byte) -80) + this.field1497.method1808((byte) -86);
        } else {
            return -33;
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(Z)I", line = 663)
    public final int method780(boolean arg0) {
        field1483++;
        return arg0 ? 35 : this.field1484.method1808((byte) -94) + this.field1493.method1808((byte) -105);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Le;ZB)V", line = 692)
    public final void method781(class237 arg0, boolean arg1, byte arg2) {
        if (arg2 != -34) {
            return;
        }
        if (this.field1500 != null) {
            try {
                this.field1500.method1653(-19746);
            } catch (Exception var11) {
            }
            this.field1500 = null;
        }
        this.field1500 = arg0;
        field1489++;
        this.method769((byte) 37);
        this.method768(arg1, (byte) 45);
        this.field1502.field3866 = 0;
        this.field1506 = null;
        while (true) {
            class243 var5 = (class243) this.field1493.method1813(1);
            if (var5 == null) {
                while (true) {
                    class243 var6 = (class243) this.field1497.method1813(1);
                    if (var6 == null) {
                        if (this.field1505 != 0) {
                            try {
                                this.field1498.field3866 = 0;
                                this.field1498.method1752(4, -115);
                                this.field1498.method1752(this.field1505, arg2 - 88);
                                this.field1498.method1744(true, 0);
                                this.field1500.method1651(0, 4, this.field1498.field3840, (byte) -51);
                            } catch (IOException var10) {
                                try {
                                    this.field1500.method1653(arg2 ^ 0x4D00);
                                } catch (Exception var9) {
                                }
                                this.field1504 = -2;
                                this.field1500 = null;
                                this.field1503++;
                            }
                        }
                        this.field1501 = 0;
                        this.field1499 = class105.method789((byte) 55);
                        return;
                    }
                    this.field1496.method1810(var6, false);
                }
            }
            this.field1484.method1810(var5, false);
        }
    }
}
