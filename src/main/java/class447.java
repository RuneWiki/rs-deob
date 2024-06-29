import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class447 {

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "I")
    private int field6449 = -1;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    private int field6446 = -32768;

    @OriginalMember(owner = "client!pl", name = "G", descriptor = "I")
    private int field6472 = -1;

    @OriginalMember(owner = "client!pl", name = "D", descriptor = "Z")
    private boolean field6469 = false;

    @OriginalMember(owner = "client!pl", name = "R", descriptor = "Z")
    private boolean field6483 = false;

    @OriginalMember(owner = "client!pl", name = "T", descriptor = "B")
    private byte field6485;

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "I")
    private int field6457;

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "I")
    public int field6458;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
    public int field6450;

    @OriginalMember(owner = "client!pl", name = "u", descriptor = "I")
    private int field6460;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "B")
    private byte field6456;

    @OriginalMember(owner = "client!pl", name = "w", descriptor = "I")
    public int field6462;

    @OriginalMember(owner = "client!pl", name = "H", descriptor = "Z")
    private boolean field6473;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field6440 = 2;

    @OriginalMember(owner = "client!pl", name = "Q", descriptor = "I")
    public static int field6482 = 0;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public static int field6441;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field6442;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field6443;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public static int field6445;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    public static int field6447;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    private int field6448;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
    public static int field6452;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "I")
    public static int field6454;

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
    public static int field6455;

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "I")
    public static int field6459;

    @OriginalMember(owner = "client!pl", name = "v", descriptor = "I")
    public static int field6461;

    @OriginalMember(owner = "client!pl", name = "x", descriptor = "I")
    public static int field6463;

    @OriginalMember(owner = "client!pl", name = "y", descriptor = "I")
    private int field6464;

    @OriginalMember(owner = "client!pl", name = "z", descriptor = "I")
    public static int field6465;

    @OriginalMember(owner = "client!pl", name = "A", descriptor = "I")
    public static int field6466;

    @OriginalMember(owner = "client!pl", name = "C", descriptor = "I")
    public static int field6468;

    @OriginalMember(owner = "client!pl", name = "E", descriptor = "I")
    public static int field6470;

    @OriginalMember(owner = "client!pl", name = "F", descriptor = "I")
    public static int field6471;

    @OriginalMember(owner = "client!pl", name = "I", descriptor = "I")
    private int field6474;

    @OriginalMember(owner = "client!pl", name = "J", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!pl", name = "K", descriptor = "I")
    private int field6476;

    @OriginalMember(owner = "client!pl", name = "L", descriptor = "I")
    public static int field6477;

    @OriginalMember(owner = "client!pl", name = "M", descriptor = "I")
    public static int field6478;

    @OriginalMember(owner = "client!pl", name = "N", descriptor = "I")
    public static int field6479;

    @OriginalMember(owner = "client!pl", name = "O", descriptor = "I")
    public static int field6480;

    @OriginalMember(owner = "client!pl", name = "P", descriptor = "I")
    public static int field6481;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "Lqi;")
    private class209 field6444;

    @OriginalMember(owner = "client!pl", name = "B", descriptor = "Lug;")
    private class325 field6467;

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "Lrk;")
    public static class427 field6453;

    @OriginalMember(owner = "client!pl", name = "S", descriptor = "Lha;")
    public class48 field6484;

    @OriginalMember(owner = "client!pl", name = "U", descriptor = "Lsj;")
    private class73 field6486;

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "[Z")
    private boolean[] field6451;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(JB)Ljava/lang/String;", line = 3)
    public static final String method2774(long arg0, byte arg1) {
        class84.field1247.setTime(new Date(arg0));
        field6443++;
        int var3 = class84.field1247.get(7);
        int var4 = class84.field1247.get(5);
        int var5 = class84.field1247.get(2);
        if (arg1 < 1) {
            field6475 = 102;
        }
        int var6 = class84.field1247.get(1);
        int var7 = class84.field1247.get(11);
        int var8 = class84.field1247.get(12);
        int var9 = class84.field1247.get(13);
        return class433.field6146[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class255.field3458[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V", line = 29)
    public static void method2775(int arg0) {
        field6453 = null;
        if (arg0 != -1) {
            method2774(87L, (byte) -99);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lsj;IIILpe;IIZ)V", line = 45)
    public final void method2776(class73 arg0, int arg1, int arg2, int arg3, class391 arg4, int arg5, int arg6, boolean arg7) {
        field6441++;
        if (arg6 != 13) {
            this.method2780((byte) 124, -32);
        }
        class227[] var9 = arg0.method447();
        class276[] var10 = arg0.method472();
        if ((this.field6484 == null || this.field6484.field816) && (var9 != null || var10 != null)) {
            class372 var11 = class10.method53(this.field6458, true);
            if (var11.field5192 != null) {
                var11 = var11.method2323((byte) -107);
            }
            if (var11 != null) {
                this.field6484 = new class48(class414.field5793);
            }
        }
        if (this.field6484 == null) {
            return;
        }
        if (arg7) {
            this.field6484.method482(arg4, (long) class414.field5793, var9, var10, false);
        } else {
            this.field6484.method481((long) class414.field5793);
        }
        this.field6484.method493(this.field6485, arg1, arg2, arg5, arg3);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIB)V", line = 82)
    private final void method2777(int arg0, int arg1, byte arg2) {
        if (arg2 != 122) {
            method2786((byte) 26, (class304) null);
        }
        field6459++;
        label92: while (true) {
            if (this.field6444 == null) {
                if (this.field6469) {
                    return;
                }
                this.method2780((byte) -24, -1);
                if (this.field6444 == null) {
                    return;
                }
            }
            int var4 = class414.field5793 - this.field6476;
            if (var4 > 100 && this.field6444.field2896 > 0) {
                int var5 = this.field6444.field2915.length - this.field6444.field2896;
                while (this.field6448 < var5 && var4 > this.field6444.field2894[this.field6448]) {
                    var4 -= this.field6444.field2894[this.field6448];
                    this.field6448++;
                }
                if (this.field6448 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field6444.field2915.length; var7++) {
                        var6 += this.field6444.field2894[var7];
                    }
                    var4 %= var6;
                }
                this.field6464 = this.field6448 + 1;
                if (this.field6464 >= this.field6444.field2915.length) {
                    this.field6464 -= this.field6444.field2896;
                    if (this.field6464 < 0 || this.field6444.field2915.length <= this.field6464) {
                        this.field6464 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field6444.field2894[this.field6448] >= var4) {
                            this.field6476 = class414.field5793 - var4;
                            this.field6474 = var4;
                            return;
                        }
                        class232.method1547(13238, this.field6444, arg1, false, this.field6448, arg0);
                        var4 -= this.field6444.field2894[this.field6448];
                        this.field6448++;
                        if (this.field6448 >= this.field6444.field2915.length) {
                            this.field6448 -= this.field6444.field2896;
                            if (this.field6448 < 0 || this.field6444.field2915.length <= this.field6448) {
                                this.field6444 = null;
                                continue label92;
                            }
                        }
                        this.field6464 = this.field6448 + 1;
                    } while (this.field6464 < this.field6444.field2915.length);
                    this.field6464 -= this.field6444.field2896;
                } while (this.field6464 >= 0 && this.field6464 < this.field6444.field2915.length);
                this.field6464 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(CIZ)I", line = 180)
    public static final int method2778(char arg0, int arg1, boolean arg2) {
        field6477++;
        if (arg2) {
            return 37;
        }
        int var3 = arg0 << 4;
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            arg0 = Character.toLowerCase(arg0);
            var3 = (arg0 << 4) + 1;
        }
        if (arg0 == 'ñ' && arg1 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)V", line = 206)
    public static final void method2779(boolean arg0) {
        class193.method1382(0);
        field6465++;
        class378.method2359(0);
        class69.method604((byte) 87);
        class323.method2053(0);
        class423.method2603(-125);
        class296.method1907(false);
        class370.method2309((byte) 112);
        class443.method2748(-92);
        class66.method578((byte) -62);
        class77.method662(true);
        class391.method2412(1);
        class276.method1770(124);
        class224.method1527((byte) -120);
        class442.method2745((byte) -115);
        class101.method869((byte) -115);
        class395.method2435(arg0);
        class285.method1797((byte) -119);
        class52.method499((byte) 110);
        class423.method2602(107);
        class107.method895((byte) 85);
        class278.method1776(8556);
        client.method1653((byte) 36);
        class166.method1251((byte) -84);
        class213.field2964.method2539(79);
        class127.field1798.method2539(78);
        class372.field5188.method2539(86);
        class415.field5801.method2539(94);
        class18.field368.method2539(99);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BI)V", line = 241)
    private final void method2780(byte arg0, int arg1) {
        field6452++;
        int var3 = arg1;
        if (arg0 != -24) {
            return;
        }
        boolean var4 = false;
        if (arg1 == -1) {
            class372 var5 = class10.method53(this.field6458, true);
            class372 var6 = var5;
            if (var5.field5192 != null) {
                var5 = var5.method2323((byte) -107);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field5145 != null) {
                if (this.field6444 != null && var5.method2314(this.field6444.field2893, (byte) -124)) {
                    return;
                }
                var3 = var5.method2325(0);
                if (this.field6472 != var5.field5157) {
                    var4 = var5.field5149;
                }
            } else if (var5.field5141 == -1) {
                if (var6 != null && var6.field5145 != null) {
                    if (this.field6444 != null && var6.method2314(this.field6444.field2893, (byte) -124)) {
                        return;
                    }
                    var3 = var6.method2325(0);
                    if (this.field6472 != var6.field5157) {
                        var4 = var6.field5149;
                    }
                } else if (var6 != null && var6.field5141 != -1 && this.field6472 != var6.field5157) {
                    var4 = var6.field5149;
                    var3 = var6.field5141;
                }
            } else if (this.field6472 != var5.field5157) {
                var3 = var5.field5141;
                var4 = var5.field5149;
            }
        }
        if (var3 == -1) {
            this.field6444 = null;
            return;
        }
        this.field6486 = null;
        if (this.field6444 == null || this.field6444.field2893 != var3) {
            this.field6444 = class288.method1819(var3, (byte) 105);
        } else if (this.field6444.field2917 == 0) {
            return;
        }
        if (this.field6444.field2915 == null) {
            this.field6444 = null;
            return;
        }
        if (var4) {
            this.field6448 = (int) ((double) this.field6444.field2915.length * Math.random());
            this.field6474 = (int) (Math.random() * (double) this.field6444.field2894[this.field6448]) + 1;
        } else {
            this.field6474 = 1;
            this.field6448 = 0;
        }
        this.field6464 = this.field6448 + 1;
        if (this.field6464 < 0 || this.field6444.field2915.length <= this.field6464) {
            this.field6464 = -1;
        }
        this.field6476 = class414.field5793 - this.field6474;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lpe;I)V", line = 364)
    public final void method2781(class391 arg0, int arg1) {
        field6471++;
        if (arg1 != -4136) {
            method2778('\u0011', 50, false);
        }
        this.method2782(this.field6460, arg0, true, 131072, this.field6457, arg1 + 4136, true);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILpe;ZIIIZ)Lsj;", line = 376)
    public final class73 method2782(int arg0, class391 arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field6468++;
        class372 var8 = class10.method53(this.field6458, true);
        if (var8.field5192 != null) {
            var8 = var8.method2323((byte) -107);
        }
        if (var8 == null) {
            this.method2783(arg1, (byte) -25);
            this.field6449 = this.field6448;
            this.field6472 = -1;
            return null;
        }
        if (!this.field6469 && this.field6472 != var8.field5157) {
            this.field6486 = null;
            this.method2780((byte) -24, -1);
        }
        this.method2777(arg0, arg4, (byte) 122);
        boolean var9 = arg2 & this.field6473 & class179.field2633 != arg5;
        boolean var10 = var9 & (this.field6472 != var8.field5157 || (this.field6449 != this.field6448 || this.field6444 != null && (this.field6444.field2895 || class258.field3486) && this.field6464 != this.field6448) && class179.field2633 >= 2);
        if (arg6 && !var10) {
            this.field6472 = var8.field5157;
            this.field6449 = this.field6448;
            return null;
        }
        if (var10) {
            class400.method2453(this.field6467, this.field6456, this.field6460, this.field6457, this.field6451);
        }
        class411 var11 = class91.field1351[this.field6456];
        class411 var12;
        if (this.field6483) {
            var12 = class265.field3566[0];
        } else {
            var12 = this.field6456 < 3 ? class91.field1351[this.field6456 + 1] : null;
        }
        class73 var13 = null;
        if (this.field6444 != null) {
            if (var10) {
                arg3 |= 0x20000;
            }
            var13 = var8.method2329(var11.method1515(this.field6460, this.field6457), this.field6450 == 11 ? this.field6462 + 4 : this.field6462, this.field6448, var12, arg1, this.field6460, this.field6474, this.field6464, true, arg3, this.field6450 == 11 ? 10 : this.field6450, this.field6444, var11, this.field6457);
            if (var13 == null) {
                this.field6451 = null;
                this.field6467 = null;
                this.field6446 = 0;
            } else {
                if (var10) {
                    if (this.field6451 == null) {
                        this.field6451 = new boolean[4];
                    }
                    this.field6467 = var13.method471(this.field6467);
                    class415.method2573(this.field6467, this.field6456, arg0, arg4, this.field6451);
                }
                this.field6446 = var13.method420();
            }
            this.field6486 = null;
        } else if (this.field6486 != null && (arg3 & this.field6486.method426()) == arg3 && this.field6472 == var8.field5157) {
            var13 = this.field6486;
        } else {
            if (this.field6486 != null) {
                arg3 |= this.field6486.method426();
            }
            class265 var14 = var8.method2318(this.field6457, this.field6450 == 11 ? this.field6462 + 4 : this.field6462, var10, arg1, (byte) -30, var11, var12, this.field6450 == 11 ? 10 : this.field6450, var11.method1515(this.field6460, this.field6457), arg3, this.field6460);
            if (var14 == null) {
                this.field6446 = 0;
                this.field6451 = null;
                this.field6467 = null;
                this.field6486 = null;
            } else {
                var13 = var14.field3562;
                this.field6486 = var14.field3562;
                if (var10) {
                    this.field6467 = var14.field3561;
                    this.field6451 = null;
                    class415.method2573(this.field6467, this.field6456, arg0, arg4, (boolean[]) null);
                }
                this.field6446 = var13.method420();
            }
        }
        this.field6449 = this.field6448;
        this.field6460 = arg0;
        this.field6457 = arg4;
        this.field6472 = var8.field5157;
        return var13;
    }

    @OriginalMember(owner = "client!pl", name = "finalize", descriptor = "()V", line = 503)
    protected final void finalize() {
        if (this.field6484 != null) {
            this.field6484.method486();
        }
        field6445++;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lpe;B)V", line = 517)
    public final void method2783(class391 arg0, byte arg1) {
        field6442++;
        if (arg1 != -25) {
            this.field6457 = 107;
        }
        if (this.field6467 != null) {
            class400.method2453(this.field6467, this.field6456, this.field6460, this.field6457, this.field6451);
            this.field6467 = null;
            this.field6451 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)J", line = 536)
    public static final long method2784(int arg0) {
        field6466++;
        if (arg0 != 4) {
            method2785(62, (byte) 36);
        }
        return class404.field5626.method775((byte) 126);
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lpe;Lkk;IIIIIIZI)V", line = 719)
    public class447(class391 arg0, class372 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field6483 = arg8;
        this.field6485 = (byte) arg4;
        this.field6457 = arg7;
        this.field6458 = arg1.field5157;
        this.field6450 = arg2;
        this.field6460 = arg6;
        this.field6456 = (byte) arg5;
        this.field6462 = arg3;
        this.field6473 = arg0.method227() && arg1.field5215 && !this.field6483;
        if (arg9 != -1) {
            this.field6469 = true;
        }
        this.method2780((byte) -24, arg9);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IB)V", line = 564)
    public static final void method2785(int arg0, byte arg1) {
        field6461++;
        class114.method924(0);
        class138.method1084((byte) 117);
        class60.method544(true, -81, arg0);
        class272.method1740(-125, class49.field829, class249.field3415, class187.field2705);
        class15.method77(class187.field2705, class249.field3415, arg1 ^ 0x1233);
        if (arg1 != 109) {
            method2786((byte) -30, (class304) null);
        }
        class298.method1916(0, class233.field3208);
        class115.method929(19131);
        class125.method973(arg1 ^ 0x6D);
        if (class166.field2472 == 10) {
            class411.method2546(false, false);
        } else if (class166.field2472 == 30) {
            class29.method340(25, (byte) -58);
            return;
        } else if (class166.field2472 == 5) {
            class244.method1604(class187.field2705, class249.field3415, (byte) 105);
            return;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BLbd;)V", line = 599)
    public static final void method2786(byte arg0, class304 arg1) {
        field6481++;
        class56 var2 = null;
        try {
            if (arg0 <= 53) {
                field6482 = 123;
            }
            class242 var3 = arg1.method1961(12);
            while (var3.field3345 == 0) {
                class229.method1541(64, 1L);
            }
            if (var3.field3345 == 1) {
                var2 = (class56) var3.field3341;
                class289 var4 = class417.method2581((byte) -113);
                var2.method527(var4.field3882, (byte) -59, 0, var4.field3938);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method526(-19635);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)Z", line = 637)
    public final boolean method2787(int arg0) {
        int var2 = 42 / ((-arg0 - 39) / 44);
        field6454++;
        return this.field6473;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZI)V", line = 649)
    public final void method2788(boolean arg0, int arg1) {
        if (arg0) {
            method2784(82);
        }
        field6480++;
        this.field6469 = true;
        this.method2780((byte) -24, arg1);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)I", line = 679)
    public final int method2789(byte arg0) {
        field6479++;
        if (arg0 != 102) {
            field6475 = 123;
        }
        return this.field6446;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)Lfr;", line = 694)
    public static final class101 method2790(int arg0, int arg1) {
        field6470++;
        class101 var2 = (class101) class236.field3262.method2537(-127, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 > -50) {
            field6475 = 105;
        }
        byte[] var3 = class296.field3993.method2633(arg0, -1, 1);
        class101 var4 = new class101();
        if (var3 != null) {
            var4.method866(new class289(var3), (byte) -91, arg0);
        }
        class236.field3262.method2542(var4, (byte) -60, (long) arg0);
        return var4;
    }
}
