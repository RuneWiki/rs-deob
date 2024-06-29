import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class374 {

    @OriginalMember(owner = "client!jp", name = "o", descriptor = "Z")
    private boolean field5455 = false;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "I")
    private int field5445 = -1;

    @OriginalMember(owner = "client!jp", name = "C", descriptor = "I")
    private int field5469 = -1;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "I")
    private int field5441 = -1;

    @OriginalMember(owner = "client!jp", name = "D", descriptor = "Z")
    private boolean field5470 = false;

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
    private int field5443 = 0;

    @OriginalMember(owner = "client!jp", name = "y", descriptor = "I")
    private int field5465 = 0;

    @OriginalMember(owner = "client!jp", name = "v", descriptor = "B")
    private byte field5462;

    @OriginalMember(owner = "client!jp", name = "p", descriptor = "I")
    public int field5456;

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
    public int field5447;

    @OriginalMember(owner = "client!jp", name = "H", descriptor = "I")
    public int field5474;

    @OriginalMember(owner = "client!jp", name = "x", descriptor = "B")
    private byte field5464;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "Lfq;")
    private class214 field5442;

    @OriginalMember(owner = "client!jp", name = "j", descriptor = "Z")
    private boolean field5450;

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "Ljfa;")
    public static class305 field5448 = new class305();

    @OriginalMember(owner = "client!jp", name = "E", descriptor = "Leo;")
    public static class313 field5471 = new class313(2, 2);

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
    public static int field5444;

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "I")
    private int field5446;

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "I")
    public static int field5449;

    @OriginalMember(owner = "client!jp", name = "k", descriptor = "I")
    private int field5451;

    @OriginalMember(owner = "client!jp", name = "n", descriptor = "I")
    public static int field5454;

    @OriginalMember(owner = "client!jp", name = "q", descriptor = "I")
    private int field5457;

    @OriginalMember(owner = "client!jp", name = "r", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!jp", name = "s", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!jp", name = "u", descriptor = "I")
    public static int field5461;

    @OriginalMember(owner = "client!jp", name = "w", descriptor = "I")
    public static int field5463;

    @OriginalMember(owner = "client!jp", name = "z", descriptor = "I")
    public static int field5466;

    @OriginalMember(owner = "client!jp", name = "A", descriptor = "I")
    public static int field5467;

    @OriginalMember(owner = "client!jp", name = "B", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!jp", name = "F", descriptor = "I")
    public static int field5472;

    @OriginalMember(owner = "client!jp", name = "I", descriptor = "I")
    private int field5475;

    @OriginalMember(owner = "client!jp", name = "L", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!jp", name = "M", descriptor = "I")
    public static int field5479;

    @OriginalMember(owner = "client!jp", name = "l", descriptor = "Lls;")
    public class150 field5452;

    @OriginalMember(owner = "client!jp", name = "K", descriptor = "Lr;")
    private class195 field5477;

    @OriginalMember(owner = "client!jp", name = "m", descriptor = "Lmu;")
    private class317 field5453;

    @OriginalMember(owner = "client!jp", name = "J", descriptor = "Lka;")
    private class497 field5476;

    @OriginalMember(owner = "client!jp", name = "t", descriptor = "Ljca;")
    private class711 field5460;

    @OriginalMember(owner = "client!jp", name = "G", descriptor = "[Z")
    private boolean[] field5473;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)V", line = 5)
    public final void method2340(int arg0, int arg1) {
        field5468++;
        this.field5455 = true;
        int var3 = -42 / ((63 - arg1) / 38);
        this.method2350(0, arg0);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILha;ZIZ)Lka;", line = 16)
    public final class497 method2341(int arg0, class66 arg1, boolean arg2, int arg3, boolean arg4) {
        field5479++;
        class412 var6 = class210.field2705.method1362(0, this.field5447);
        if (var6.field5919 != null) {
            var6 = var6.method2478(class480.field6740, -1);
        }
        if (var6 == null) {
            this.method2343(arg1, false);
            this.field5445 = -1;
            this.field5469 = -1;
            this.field5441 = -1;
            return null;
        }
        if (!this.field5455 && this.field5469 != var6.field5850) {
            this.field5476 = null;
            this.method2350(0, -1);
        }
        this.method2348(this.field5442, 102);
        if (arg4) {
            boolean var7 = arg4 & this.field5450 & class125.field1721.field5156.method159(43) != 0;
            arg4 = var7 & (this.field5441 != var6.field5850 || this.field5453 != null && class125.field1721.field5156.method159(43) >= 2 && (this.field5446 != this.field5445 || (this.field5453.field4471 || class779.field10699) && this.field5475 != this.field5446));
        }
        if (arg2 && !arg4) {
            this.field5469 = var6.field5850;
            return null;
        }
        if (arg4) {
            class526.method3052(this.field5477, this.field5462, this.field5442.field2802, this.field5442.field2810, this.field5473);
            this.field5445 = -1;
            this.field5441 = -1;
        }
        class295 var8 = class645.field8694[this.field5462];
        if (arg0 <= 54) {
            return null;
        }
        class295 var9;
        if (this.field5470) {
            var9 = class648.field8748[0];
        } else {
            var9 = this.field5462 < 3 ? class645.field8694[this.field5462 + 1] : null;
        }
        class497 var10 = null;
        if (this.field5453 != null) {
            if (arg4) {
                arg3 |= 0x40000;
            }
            var10 = var6.method2472(var8, false, arg3, this.field5456 == 11 ? this.field5474 + 4 : this.field5474, this.field5446, this.field5453, var9, this.field5460, this.field5442.field2802, this.field5442.field2810, var8.method1895(this.field5442.field2802, this.field5442.field2810, 71), this.field5457, this.field5456 == 11 ? 10 : this.field5456, this.field5475, arg1);
            if (var10 == null) {
                this.field5443 = 0;
                this.field5473 = null;
                this.field5465 = 0;
                this.field5477 = null;
            } else {
                if (arg4) {
                    if (this.field5473 == null) {
                        this.field5473 = new boolean[4];
                    }
                    this.field5477 = var10.method289(this.field5477);
                    class384.method2380(this.field5477, this.field5462, this.field5442.field2802, this.field5442.field2810, this.field5473);
                    this.field5445 = this.field5446;
                    this.field5441 = var6.field5850;
                }
                this.field5443 = var10.method265();
                this.field5465 = var10.method264();
            }
            this.field5476 = null;
        } else if (this.field5476 != null && (arg3 & this.field5476.method260()) == arg3 && this.field5469 == var6.field5850) {
            var10 = this.field5476;
        } else {
            if (this.field5476 != null) {
                arg3 |= this.field5476.method260();
            }
            class786 var11 = var6.method2475(this.field5442.field2802, var9, this.field5456 == 11 ? 10 : this.field5456, arg3, arg4, arg1, (byte) -71, var8, this.field5460, var8.method1895(this.field5442.field2802, this.field5442.field2810, 70), this.field5456 == 11 ? this.field5474 + 4 : this.field5474, this.field5442.field2810);
            if (var11 == null) {
                this.field5443 = 0;
                this.field5476 = null;
                this.field5477 = null;
                this.field5465 = 0;
                this.field5473 = null;
            } else {
                var10 = var11.field10802;
                this.field5476 = var11.field10802;
                if (arg4) {
                    this.field5477 = var11.field10801;
                    this.field5473 = null;
                    class384.method2380(this.field5477, this.field5462, this.field5442.field2802, this.field5442.field2810, null);
                    this.field5441 = var6.field5850;
                    this.field5445 = -1;
                }
                this.field5443 = var10.method265();
                this.field5465 = var10.method264();
            }
        }
        this.field5469 = var6.field5850;
        return var10;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Z)I", line = 154)
    public final int method2342(boolean arg0) {
        field5454++;
        if (!arg0) {
            this.field5470 = true;
        }
        return this.field5465;
    }

    @OriginalMember(owner = "client!jp", name = "finalize", descriptor = "()V", line = 167)
    protected final void finalize() {
        field5467++;
        if (this.field5452 != null) {
            this.field5452.method1051();
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lha;Z)V", line = 178)
    public final void method2343(class66 arg0, boolean arg1) {
        if (this.field5477 != null) {
            class526.method3052(this.field5477, this.field5462, this.field5442.field2802, this.field5442.field2810, this.field5473);
            this.field5473 = null;
            this.field5477 = null;
        }
        field5472++;
        if (arg1) {
            this.method2350(46, 102);
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V", line = 196)
    public static void method2344(int arg0) {
        if (arg0 != -2834) {
            field5471 = null;
        }
        field5471 = null;
        field5448 = null;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "()V", line = 209)
    public static final void method2345() {
        for (int var0 = 0; var0 < class25.field250; var0++) {
            class539 var1 = class281.field4062[var0];
            class115.method841(var1, true);
            class281.field4062[var0] = null;
        }
        class25.field250 = 0;
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(Z)V", line = 228)
    public static final void method2346(boolean arg0) {
        class151.method1062((byte) -102, class528.field7306);
        field5444++;
        class735.field9960++;
        if (class157.field2116 && class178.field2351) {
            if (!arg0) {
                field5448 = null;
            }
            int var1 = 0;
            int var2 = 0;
            if (class24.field246) {
                var1 = class186.method1252(0);
                var2 = class550.method3163(16383);
            }
            int var3 = class494.field6961.method1652(0) + var1;
            int var4 = var2 + class494.field6961.method1663((byte) 121);
            int var5 = var4 - class99.field1441;
            int var6 = var3 - class723.field9822;
            if (class154.field2089 > var6) {
                var6 = class154.field2089;
            }
            if ((class528.field7306.field4986 + var6) > (class154.field2089 + class237.field3155.field4986)) {
                var6 = class154.field2089 + class237.field3155.field4986 - class528.field7306.field4986;
            }
            if (class350.field5105 > var5) {
                var5 = class350.field5105;
            }
            if ((class350.field5105 + class237.field3155.field4940) < (class528.field7306.field4940 + var5)) {
                var5 = class350.field5105 + class237.field3155.field4940 - class528.field7306.field4940;
            }
            int var7 = class237.field3155.field5004 + var6 - class154.field2089;
            int var8 = var5 + class237.field3155.field4949 - class350.field5105;
            if (class494.field6961.method4278(102)) {
                if (class735.field9960 > class528.field7306.field4903) {
                    int var9 = var6 - class451.field6473;
                    int var10 = var5 - class113.field1542;
                    if (var9 > class528.field7306.field5002 || var9 < -class528.field7306.field5002 || var10 > class528.field7306.field5002 || var10 < -class528.field7306.field5002) {
                        class425.field6177 = true;
                    }
                }
                if (class528.field7306.field4930 != null && class425.field6177) {
                    class158 var11 = new class158();
                    var11.field2128 = class528.field7306.field4930;
                    var11.field2129 = var7;
                    var11.field2137 = class528.field7306;
                    var11.field2123 = var8;
                    class727.method4005(var11);
                    return;
                }
            } else {
                if (class425.field6177) {
                    class579.method3278(-1);
                    if (class528.field7306.field5009 != null) {
                        class158 var12 = new class158();
                        var12.field2129 = var7;
                        var12.field2123 = var8;
                        var12.field2137 = class528.field7306;
                        var12.field2127 = class336.field4737;
                        var12.field2128 = class528.field7306.field5009;
                        class727.method4005(var12);
                    }
                    if (class336.field4737 != null && client.method2044(class528.field7306) != null) {
                        class773.method4249(class336.field4737, -76, class528.field7306);
                    }
                } else if ((class151.field2051 == 1 || class563.method3207((byte) 118)) && class269.field3929 > 2) {
                    class262.method1769((byte) 106, class723.field9822 + class451.field6473, class99.field1441 + class113.field1542);
                } else if (class1.method5(-9112)) {
                    class262.method1769((byte) 106, class723.field9822 + class451.field6473, class99.field1441 + class113.field1542);
                }
                class528.field7306 = null;
            }
        } else if (class735.field9960 > 1) {
            class528.field7306 = null;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZIILal;Lha;IIBLka;)V", line = 360)
    public final void method2347(boolean arg0, int arg1, int arg2, class109 arg3, class66 arg4, int arg5, int arg6, byte arg7, class497 arg8) {
        field5461++;
        if (arg7 != -118) {
            method2345();
        }
        class290[] var10 = arg8.method263();
        class220[] var11 = arg8.method283();
        if ((this.field5452 == null || this.field5452.field2035) && (var10 != null || var11 != null)) {
            class412 var12 = class210.field2705.method1362(0, this.field5447);
            if (var12.field5919 != null) {
                var12 = var12.method2478(class480.field6740, -1);
            }
            if (var12 != null) {
                this.field5452 = class150.method1052(class572.field7788, true);
            }
        }
        if (this.field5452 == null) {
            return;
        }
        arg8.method259(arg3);
        if (arg0) {
            this.field5452.method1045(arg4, (long) class572.field7788, var10, var11, false);
        } else {
            this.field5452.method1050((long) class572.field7788);
        }
        this.field5452.method1058(this.field5464, arg1, arg2, arg6, arg5);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lfq;I)V", line = 398)
    private final void method2348(class214 arg0, int arg1) {
        int var3 = 53 % ((-arg1 - 34) / 63);
        field5458++;
        label88: while (true) {
            if (this.field5453 == null) {
                if (this.field5455) {
                    return;
                }
                this.method2350(0, -1);
                if (this.field5453 == null) {
                    return;
                }
            }
            int var4 = class572.field7788 - this.field5451;
            if (var4 > 100 && this.field5453.field4484 > 0) {
                int var5 = this.field5453.field4493.length - this.field5453.field4484;
                while (this.field5446 < var5 && var4 > this.field5453.field4485[this.field5446]) {
                    var4 -= this.field5453.field4485[this.field5446];
                    this.field5446++;
                }
                if (var5 <= this.field5446) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field5453.field4493.length; var7++) {
                        var6 += this.field5453.field4485[var7];
                    }
                    var4 %= var6;
                }
                this.field5475 = this.field5446 + 1;
                if (this.field5453.field4493.length <= this.field5475) {
                    this.field5475 -= this.field5453.field4484;
                    if (this.field5475 < 0 || this.field5475 >= this.field5453.field4493.length) {
                        this.field5475 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var4 <= this.field5453.field4485[this.field5446]) {
                            this.field5451 = class572.field7788 - var4;
                            this.field5457 = var4;
                            return;
                        }
                        class627.method3466(arg0, this.field5453, -29701, this.field5446);
                        var4 -= this.field5453.field4485[this.field5446];
                        this.field5446++;
                        if (this.field5453.field4493.length <= this.field5446) {
                            this.field5446 -= this.field5453.field4484;
                            if (this.field5446 < 0 || this.field5453.field4493.length <= this.field5446) {
                                this.field5453 = null;
                                continue label88;
                            }
                        }
                        this.field5475 = this.field5446 + 1;
                    } while (this.field5475 < this.field5453.field4493.length);
                    this.field5475 -= this.field5453.field4484;
                } while (this.field5475 >= 0 && this.field5453.field4493.length > this.field5475);
                this.field5475 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Ljca;Z)V", line = 505)
    public final void method2349(class711 arg0, boolean arg1) {
        if (!arg1) {
            this.field5453 = null;
        }
        this.field5476 = null;
        this.field5460 = arg0;
        field5449++;
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(II)V", line = 517)
    private final void method2350(int arg0, int arg1) {
        field5466++;
        int var3 = arg1;
        boolean var4 = false;
        if (~arg1 == arg0) {
            class412 var5 = class210.field2705.method1362(0, this.field5447);
            class412 var6 = var5;
            if (var5.field5919 != null) {
                var5 = var5.method2478(class480.field6740, -1);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field5893 != null) {
                if (this.field5453 != null && var5.method2483(this.field5453.field4476, 6238)) {
                    return;
                }
                var3 = var5.method2474(arg0 ^ 0x4A);
                if (this.field5469 != var5.field5850) {
                    var4 = var5.field5899;
                }
            } else if (var5.field5844 == -1) {
                if (var6 != null && var6.field5893 != null) {
                    if (this.field5453 != null && var6.method2483(this.field5453.field4476, 6238)) {
                        return;
                    }
                    var3 = var6.method2474(75);
                    if (this.field5469 != var6.field5850) {
                        var4 = var6.field5899;
                    }
                } else if (var6 != null && var6.field5844 != -1 && this.field5469 != var6.field5850) {
                    var4 = var6.field5899;
                    var3 = var6.field5844;
                }
            } else if (this.field5469 != var5.field5850) {
                var3 = var5.field5844;
                var4 = var5.field5899;
            }
        }
        if (var3 == -1) {
            this.field5453 = null;
            return;
        }
        this.field5476 = null;
        if (this.field5453 == null || this.field5453.field4476 != var3) {
            this.field5453 = class693.field9223.method2388(var3, 0);
        } else if (this.field5453.field4487 == 0) {
            return;
        }
        if (this.field5453.field4493 == null) {
            this.field5453 = null;
            return;
        }
        if (var4) {
            this.field5446 = (int) (Math.random() * (double) this.field5453.field4493.length);
            this.field5457 = (int) (Math.random() * (double) this.field5453.field4485[this.field5446]) + 1;
        } else {
            this.field5457 = 1;
            this.field5446 = 0;
        }
        this.field5475 = this.field5446 + 1;
        if (this.field5475 < 0 || this.field5475 >= this.field5453.field4493.length) {
            this.field5475 = -1;
        }
        this.field5451 = class572.field7788 - this.field5457;
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lha;Llp;IIIILfq;ZI)V", line = 711)
    public class374(class66 arg0, class412 arg1, int arg2, int arg3, int arg4, int arg5, class214 arg6, boolean arg7, int arg8) {
        this.field5470 = arg7;
        this.field5462 = (byte) arg5;
        this.field5456 = arg2;
        this.field5447 = arg1.field5850;
        this.field5474 = arg3;
        this.field5464 = (byte) arg4;
        this.field5442 = arg6;
        this.field5450 = arg0.method538() && arg1.field5927 && !this.field5470;
        if (arg8 != -1) {
            this.field5455 = true;
        }
        this.method2350(0, arg8);
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)I", line = 654)
    public final int method2351(int arg0) {
        int var2 = -50 % ((arg0 + 26) / 56);
        field5459++;
        return this.field5443;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(BLha;)V", line = 669)
    public final void method2352(byte arg0, class66 arg1) {
        field5478++;
        this.method2341(63, arg1, true, 262144, true);
        int var3 = 12 % ((-arg0 - 27) / 58);
    }

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "(I)Z", line = 696)
    public final boolean method2353(int arg0) {
        field5463++;
        if (arg0 != -1) {
            this.field5470 = true;
        }
        return this.field5450;
    }
}
