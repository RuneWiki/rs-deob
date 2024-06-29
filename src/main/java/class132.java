import java.awt.Component;
import java.awt.Font;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class132 {

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "Lci;")
    private class230 field2453 = new class230();

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "Lci;")
    private class230 field2458 = new class230();

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "I")
    private int field2460 = 0;

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "Lci;")
    private class230 field2459 = new class230();

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "Lci;")
    private class230 field2461 = new class230();

    @OriginalMember(owner = "client!kg", name = "A", descriptor = "I")
    private int field2465 = 0;

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "Lfh;")
    private class128 field2464 = new class128(4);

    @OriginalMember(owner = "client!kg", name = "C", descriptor = "I")
    public volatile int field2467 = 0;

    @OriginalMember(owner = "client!kg", name = "D", descriptor = "B")
    private byte field2468 = 0;

    @OriginalMember(owner = "client!kg", name = "E", descriptor = "I")
    public volatile int field2469 = 0;

    @OriginalMember(owner = "client!kg", name = "F", descriptor = "Lfh;")
    private class128 field2470 = new class128(8);

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "Lhj;")
    public static class69 field2443 = class181.method1318("::tele ", (byte) -125);

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
    public static int field2450 = 0;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field2441 = 7759444;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!kg", name = "x", descriptor = "I")
    private int field2462;

    @OriginalMember(owner = "client!kg", name = "B", descriptor = "J")
    private long field2466;

    @OriginalMember(owner = "client!kg", name = "y", descriptor = "Ltc;")
    private class173 field2463;

    @OriginalMember(owner = "client!kg", name = "G", descriptor = "Lb;")
    private class81 field2471;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "Ljava/awt/Font;")
    public static Font field2451;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "[Lhk;")
    public static class121[] field2457;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILjava/awt/Component;BI)Lph;")
    public static final class76 method973(int arg0, Component arg1, byte arg2, int arg3) {
        if (arg2 > -21) {
            method974(true);
        }
        field2439++;
        try {
            Class var4 = Class.forName("dh");
            class76 var5 = (class76) var4.getDeclaredConstructor().newInstance();
            var5.method49(arg3, 26480, arg0, arg1);
            return var5;
        } catch (Throwable var7) {
            class10 var6 = new class10();
            var6.method49(arg3, 26480, arg0, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)V")
    public static void method974(boolean arg0) {
        field2451 = null;
        field2443 = null;
        if (arg0) {
            field2457 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)Z")
    public final boolean method975(int arg0) {
        field2455++;
        if (arg0 > -119) {
            this.field2461 = null;
        }
        return this.field2465 >= 20;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(Z)V")
    public final void method976(boolean arg0) {
        if (arg0) {
            this.method975(72);
        }
        field2442++;
        this.field2467++;
        this.field2468 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZZ)V")
    public final void method977(boolean arg0, boolean arg1) {
        field2447++;
        if (this.field2463 == null) {
            return;
        }
        try {
            this.field2464.field2379 = 0;
            this.field2464.method933(arg1 ? 2 : 3, -20946);
            this.field2464.method922(0, 24758);
            if (!arg0) {
                this.method977(true, false);
            }
            this.field2463.method1267(this.field2464.field2385, (byte) 6, 0, 4);
        } catch (IOException var4) {
            try {
                this.field2463.method1270((byte) 41);
            } catch (Exception var3) {
            }
            this.field2463 = null;
            this.field2469++;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)Lre;")
    public static final class212 method978(int arg0, int arg1, int arg2) {
        class217 var3 = class158.field2935[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class212 var4 = var3.field3946;
            var3.field3946 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V")
    public final void method979(int arg0) {
        if (this.field2463 != null) {
            this.field2463.method1270((byte) 41);
        }
        if (arg0 != 0) {
            field2457 = null;
        }
        field2444++;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZLtc;I)V")
    public final void method980(boolean arg0, class173 arg1, int arg2) {
        if (this.field2463 != null) {
            try {
                this.field2463.method1270((byte) 41);
            } catch (Exception var8) {
            }
            this.field2463 = null;
        }
        this.field2463 = arg1;
        this.method983(1921289680);
        field2446++;
        if (arg2 != -20292) {
            this.field2460 = -39;
        }
        this.method977(true, arg0);
        this.field2471 = null;
        this.field2470.field2379 = 0;
        while (true) {
            class81 var4 = (class81) this.field2458.method1641(true);
            if (var4 == null) {
                while (true) {
                    class81 var5 = (class81) this.field2461.method1641(true);
                    if (var5 == null) {
                        if (this.field2468 != 0) {
                            try {
                                this.field2464.field2379 = 0;
                                this.field2464.method933(4, -20946);
                                this.field2464.method933(this.field2468, arg2 - 654);
                                this.field2464.method943((byte) 127, 0);
                                this.field2463.method1267(this.field2464.field2385, (byte) 6, 0, 4);
                            } catch (IOException var7) {
                                try {
                                    this.field2463.method1270((byte) 41);
                                } catch (Exception var6) {
                                }
                                this.field2469++;
                                this.field2463 = null;
                            }
                        }
                        this.field2462 = 0;
                        this.field2466 = class223.method1584(-25392);
                        return;
                    }
                    this.field2459.method1643(var5, 4096);
                }
            }
            this.field2453.method1643(var4, 4096);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZIIBI)Lb;")
    public final class81 method981(boolean arg0, int arg1, int arg2, byte arg3, int arg4) {
        field2440++;
        long var6 = (long) ((arg2 << 16) + arg4);
        class81 var8 = new class81();
        var8.field1544 = arg3;
        var8.field2987 = arg0;
        var8.field44 = var6;
        if (arg0) {
            if (this.field2460 >= 20) {
                throw new RuntimeException();
            }
            this.field2453.method1643(var8, 4096);
            this.field2460++;
        } else if (this.field2465 < 20) {
            this.field2459.method1643(var8, 4096);
            this.field2465++;
        } else {
            throw new RuntimeException();
        }
        return arg1 <= 123 ? null : var8;
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)V")
    public static final void method982(int arg0) {
        field2451 = null;
        field2456++;
        class20.field289 = null;
        class209.field3798 = null;
        if (arg0 != 8) {
            method973(50, (Component) null, (byte) 103, -50);
        }
    }

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "(I)V")
    private final void method983(int arg0) {
        field2448++;
        if (this.field2463 == null) {
            return;
        }
        try {
            this.field2464.field2379 = 0;
            this.field2464.method933(6, -20946);
            if (arg0 != 1921289680) {
                method982(-124);
            }
            this.field2464.method922(2, 24758);
            this.field2463.method1267(this.field2464.field2385, (byte) 6, 0, 4);
        } catch (IOException var3) {
            try {
                this.field2463.method1270((byte) 41);
            } catch (Exception var2) {
            }
            this.field2469++;
            this.field2463 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)I")
    public final int method984(byte arg0) {
        if (arg0 == -60) {
            field2454++;
            return this.field2460;
        } else {
            return -85;
        }
    }

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "(I)Z")
    public final boolean method985(int arg0) {
        if (arg0 != 20) {
            field2449 = 115;
        }
        field2445++;
        return this.field2460 >= 20;
    }

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "(I)Z")
    public final boolean method986(int arg0) {
        long var2 = class223.method1584(-25392);
        field2452++;
        int var4 = (int) (var2 - this.field2466);
        if (var4 > 200) {
            var4 = 200;
        }
        this.field2466 = var2;
        this.field2462 += var4;
        if (this.field2460 == 0 && this.field2465 == 0) {
            if (this.field2463 == null) {
                return true;
            }
            if (this.field2462 > 30000) {
                try {
                    this.field2463.method1270((byte) 41);
                } catch (Exception var26) {
                }
                this.field2463 = null;
                return true;
            }
        } else if (this.field2463 == null) {
            return false;
        }
        boolean var5 = false;
        try {
            for (class81 var6 = (class81) this.field2453.method1639(true); var6 != null; var6 = (class81) this.field2453.method1640(true)) {
                this.field2464.field2379 = 0;
                this.field2464.method933(1, arg0 - 20433);
                this.field2464.method922((int) var6.field44, arg0 ^ 0xFFFF9D49);
                this.field2463.method1267(this.field2464.field2385, (byte) 6, 0, 4);
                this.field2458.method1643(var6, arg0 + 4609);
            }
            for (class81 var7 = (class81) this.field2459.method1639(true); var7 != null; var7 = (class81) this.field2459.method1640(true)) {
                this.field2464.field2379 = 0;
                this.field2464.method933(0, -20946);
                this.field2464.method922((int) var7.field44, 24758);
                this.field2463.method1267(this.field2464.field2385, (byte) 6, 0, 4);
                this.field2461.method1643(var7, 4096);
            }
            if (arg0 != -513) {
                return false;
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field2463.method1269((byte) -85);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field2462 = 0;
                byte var10 = 0;
                if (this.field2471 == null) {
                    var10 = 8;
                } else if (this.field2471.field1559 == 0) {
                    var10 = 1;
                }
                if (var10 <= 0) {
                    int var11 = this.field2471.field1557.field2385.length - this.field2471.field1544;
                    int var12 = 512 - this.field2471.field1559;
                    if (var12 > var11 - this.field2471.field1557.field2379) {
                        var12 = var11 - this.field2471.field1557.field2379;
                    }
                    if (var9 < var12) {
                        var12 = var9;
                    }
                    this.field2463.method1265(this.field2471.field1557.field2385, -79, this.field2471.field1557.field2379, var12);
                    if (this.field2468 != 0) {
                        for (int var13 = 0; var13 < var12; var13++) {
                            this.field2471.field1557.field2385[this.field2471.field1557.field2379 + var13] = (byte) class197.method1442(this.field2471.field1557.field2385[this.field2471.field1557.field2379 + var13], this.field2468);
                        }
                    }
                    this.field2471.field1557.field2379 += var12;
                    this.field2471.field1559 += var12;
                    if (this.field2471.field1557.field2379 == var11) {
                        this.field2471.method24(true);
                        if (this.field2471.field2987) {
                            this.field2460--;
                        } else {
                            this.field2465--;
                        }
                        this.field2471.field2983 = false;
                        this.field2471 = null;
                    } else if (this.field2471.field1559 == 512) {
                        this.field2471.field1559 = 0;
                    }
                } else {
                    int var14 = var10 - this.field2470.field2379;
                    if (var14 > var9) {
                        var14 = var9;
                    }
                    this.field2463.method1265(this.field2470.field2385, arg0 ^ 0x23E, this.field2470.field2379, var14);
                    if (this.field2468 != 0) {
                        for (int var15 = 0; var15 < var14; var15++) {
                            this.field2470.field2385[this.field2470.field2379 + var15] = (byte) class197.method1442(this.field2470.field2385[this.field2470.field2379 + var15], this.field2468);
                        }
                    }
                    this.field2470.field2379 += var14;
                    if (this.field2470.field2379 >= var10) {
                        if (this.field2471 == null) {
                            this.field2470.field2379 = 0;
                            if (this.field2470.method909(false) == -72057594037927937L) {
                                this.field2470.field2379 = 0;
                                var5 = true;
                            } else {
                                this.field2470.field2379 = 0;
                                int var16 = this.field2470.method937(false);
                                int var17 = this.field2470.method912(-93);
                                long var18 = (long) ((var16 << 16) + var17);
                                int var20 = this.field2470.method937(false);
                                int var21 = this.field2470.method923(true);
                                Object var22 = null;
                                class81 var23 = (class81) this.field2458.method1639(true);
                                label153: while (true) {
                                    if (var23 == null) {
                                        var23 = (class81) this.field2461.method1639(true);
                                        while (true) {
                                            if (var23 == null || var23.field44 == var18) {
                                                break label153;
                                            }
                                            var23 = (class81) this.field2461.method1640(true);
                                        }
                                    }
                                    if (var23.field44 == var18) {
                                        break;
                                    }
                                    var23 = (class81) this.field2458.method1640(true);
                                }
                                if (var23 == null) {
                                    throw new IOException();
                                }
                                int var24 = var20 == 0 ? 5 : 9;
                                this.field2471 = var23;
                                this.field2471.field1557 = new class128(var21 + var24 + this.field2471.field1544);
                                this.field2471.field1557.method933(var20, arg0 - 20433);
                                this.field2471.field1557.method908(false, var21);
                                this.field2471.field1559 = 8;
                                this.field2470.field2379 = 0;
                            }
                        } else if (this.field2471.field1559 != 0) {
                            throw new IOException();
                        } else if (this.field2470.field2385[0] == -1) {
                            this.field2470.field2379 = 0;
                            this.field2471.field1559 = 1;
                        } else {
                            this.field2471 = null;
                        }
                    }
                }
            }
            if (var5) {
                this.field2464.field2379 = 0;
                this.field2464.method933(5, -20946);
                this.field2463.method1267(this.field2464.field2385, (byte) 6, 0, 4);
            }
            return true;
        } catch (IOException var27) {
            try {
                this.field2463.method1270((byte) 41);
            } catch (Exception var25) {
            }
            this.field2463 = null;
            this.field2469++;
            return false;
        }
    }
}
