import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class308 {

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "I")
    private int field4427 = -32768;

    @OriginalMember(owner = "client!wca", name = "h", descriptor = "Z")
    private boolean field4434 = false;

    @OriginalMember(owner = "client!wca", name = "u", descriptor = "I")
    private int field4447 = -1;

    @OriginalMember(owner = "client!wca", name = "E", descriptor = "I")
    private int field4457 = -1;

    @OriginalMember(owner = "client!wca", name = "G", descriptor = "Z")
    private boolean field4459 = false;

    @OriginalMember(owner = "client!wca", name = "m", descriptor = "I")
    private int field4439;

    @OriginalMember(owner = "client!wca", name = "g", descriptor = "I")
    public int field4433;

    @OriginalMember(owner = "client!wca", name = "K", descriptor = "B")
    private byte field4463;

    @OriginalMember(owner = "client!wca", name = "d", descriptor = "I")
    public int field4430;

    @OriginalMember(owner = "client!wca", name = "M", descriptor = "B")
    private byte field4465;

    @OriginalMember(owner = "client!wca", name = "c", descriptor = "I")
    private int field4429;

    @OriginalMember(owner = "client!wca", name = "C", descriptor = "I")
    public int field4455;

    @OriginalMember(owner = "client!wca", name = "y", descriptor = "Z")
    private boolean field4451;

    @OriginalMember(owner = "client!wca", name = "o", descriptor = "I")
    public static int field4441 = 1338;

    @OriginalMember(owner = "client!wca", name = "l", descriptor = "Z")
    public static boolean field4438 = false;

    @OriginalMember(owner = "client!wca", name = "v", descriptor = "I")
    public static int field4448 = 0;

    @OriginalMember(owner = "client!wca", name = "N", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!wca", name = "O", descriptor = "Liu;")
    public static class517 field4467;

    @OriginalMember(owner = "client!wca", name = "P", descriptor = "Lfj;")
    public static class602 field4468;

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!wca", name = "f", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!wca", name = "i", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!wca", name = "j", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!wca", name = "k", descriptor = "I")
    private int field4437;

    @OriginalMember(owner = "client!wca", name = "n", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!wca", name = "p", descriptor = "I")
    private int field4442;

    @OriginalMember(owner = "client!wca", name = "q", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!wca", name = "s", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!wca", name = "t", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!wca", name = "w", descriptor = "I")
    private int field4449;

    @OriginalMember(owner = "client!wca", name = "z", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!wca", name = "A", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!wca", name = "D", descriptor = "I")
    private int field4456;

    @OriginalMember(owner = "client!wca", name = "F", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!wca", name = "I", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!wca", name = "J", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!wca", name = "L", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!wca", name = "Q", descriptor = "Lcba;")
    public static class232 field4469;

    @OriginalMember(owner = "client!wca", name = "x", descriptor = "Lbj;")
    private class439 field4450;

    @OriginalMember(owner = "client!wca", name = "r", descriptor = "Lr;")
    private class519 field4444;

    @OriginalMember(owner = "client!wca", name = "H", descriptor = "Lqp;")
    public class585 field4460;

    @OriginalMember(owner = "client!wca", name = "B", descriptor = "Lk;")
    private class88 field4454;

    @OriginalMember(owner = "client!wca", name = "e", descriptor = "[Z")
    private boolean[] field4431;

    static {
        new class567("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
        field4466 = 0;
        field4467 = new class517(17, 9);
        field4468 = null;
    }

    @OriginalMember(owner = "client!wca", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() {
        if (this.field4460 != null) {
            this.field4460.method3347();
        }
        field4445++;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lfd;B)I", line = 16)
    public static final int method1906(class143 arg0, byte arg1) {
        int var2 = 40 % ((48 - arg1) / 48);
        field4440++;
        if (class634.field9219 == arg0) {
            return 7681;
        } else if (class635.field9225 == arg0) {
            return 8448;
        } else if (class609.field8665 == arg0) {
            return 34165;
        } else if (class211.field3065 == arg0) {
            return 260;
        } else if (class466.field6716 == arg0) {
            return 34023;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(Lqa;Ltk;IIIIIIZI)V", line = 669)
    public class308(class167 arg0, class370 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field4439 = arg7;
        this.field4433 = arg2;
        this.field4434 = arg8;
        this.field4463 = (byte) arg5;
        this.field4430 = arg3;
        this.field4465 = (byte) arg4;
        this.field4429 = arg6;
        this.field4455 = arg1.field5335;
        this.field4451 = arg0.method594() && arg1.field5353 && !this.field4434;
        if (arg9 != -1) {
            this.field4459 = true;
        }
        this.method1913(arg9, -100);
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lr;ZILqa;IIII)V", line = 52)
    public final void method1907(class519 arg0, boolean arg1, int arg2, class167 arg3, int arg4, int arg5, int arg6, int arg7) {
        field4458++;
        class595[] var9 = arg0.method1375();
        class643[] var10 = arg0.method1372();
        if (arg4 != 34165) {
            field4441 = -121;
        }
        if ((this.field4460 == null || this.field4460.field8333) && (var9 != null || var10 != null)) {
            class370 var11 = class552.field7819.method2890(0, this.field4455);
            if (var11.field5272 != null) {
                var11 = var11.method2238((byte) 64, class401.field6001);
            }
            if (var11 != null) {
                this.field4460 = class585.method3353(class310.field4553);
            }
        }
        if (this.field4460 == null) {
            return;
        }
        if (arg1) {
            this.field4460.method3345(arg3, (long) class310.field4553, var9, var10, false);
        } else {
            this.field4460.method3349((long) class310.field4553);
        }
        this.field4460.method3346(this.field4465, arg7, arg6, arg2, arg5);
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(IILqa;ZZII)Lr;", line = 94)
    public final class519 method1908(int arg0, int arg1, class167 arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        field4446++;
        if (arg1 != -1) {
            this.method1913(-107, 53);
        }
        class370 var8 = class552.field7819.method2890(0, this.field4455);
        if (var8.field5272 != null) {
            var8 = var8.method2238((byte) 45, class401.field6001);
        }
        if (var8 == null) {
            this.method1911(arg2, arg1 - 8880);
            this.field4457 = -1;
            this.field4447 = this.field4442;
            return null;
        }
        if (!this.field4459 && this.field4457 != var8.field5335) {
            this.field4444 = null;
            this.method1913(-1, -124);
        }
        this.method1912(false, arg5, arg6);
        boolean var9 = arg4 & this.field4451 & class202.field2854.method3143(class646.field9388, 0) != 0;
        boolean var10 = var9 & (this.field4457 != var8.field5335 || (this.field4447 != this.field4442 || this.field4450 != null && (this.field4450.field6410 || class429.field6257) && this.field4456 != this.field4442) && class202.field2854.method3143(class646.field9388, arg1 + 1) >= 2);
        if (arg3 && !var10) {
            this.field4457 = var8.field5335;
            this.field4447 = this.field4442;
            return null;
        }
        if (var10) {
            class246.method1566(this.field4454, this.field4463, this.field4429, this.field4439, this.field4431);
        }
        class542 var11 = class88.field1594[this.field4463];
        class542 var12;
        if (this.field4434) {
            var12 = class587.field8363[0];
        } else {
            var12 = this.field4463 >= 3 ? null : class88.field1594[this.field4463 + 1];
        }
        class519 var13 = null;
        if (this.field4450 != null) {
            if (var10) {
                arg0 |= 0x40000;
            }
            var13 = var8.method2253(this.field4456, arg2, this.field4429, this.field4433 == 11 ? this.field4430 + 4 : this.field4430, arg0, var11.method695(this.field4429, this.field4439), 3, this.field4439, var12, this.field4437, var11, this.field4433 == 11 ? 10 : this.field4433, this.field4450, this.field4442);
            if (var13 == null) {
                this.field4431 = null;
                this.field4454 = null;
                this.field4427 = 0;
            } else {
                if (var10) {
                    if (this.field4431 == null) {
                        this.field4431 = new boolean[4];
                    }
                    this.field4454 = var13.method1403(this.field4454);
                    class371.method2255(this.field4454, this.field4463, arg6, arg5, this.field4431);
                }
                this.field4427 = var13.method1390();
            }
            this.field4444 = null;
        } else if (this.field4444 != null && (this.field4444.method1373() & arg0) == arg0 && this.field4457 == var8.field5335) {
            var13 = this.field4444;
        } else {
            if (this.field4444 != null) {
                arg0 |= this.field4444.method1373();
            }
            class380 var14 = var8.method2246(118, this.field4433 == 11 ? 10 : this.field4433, var11, var12, this.field4433 == 11 ? this.field4430 + 4 : this.field4430, this.field4429, var10, this.field4439, arg0, arg2, var11.method695(this.field4429, this.field4439));
            if (var14 == null) {
                this.field4454 = null;
                this.field4431 = null;
                this.field4444 = null;
                this.field4427 = 0;
            } else {
                var13 = var14.field5589;
                this.field4444 = var14.field5589;
                if (var10) {
                    this.field4431 = null;
                    this.field4454 = var14.field5591;
                    class371.method2255(this.field4454, this.field4463, arg6, arg5, null);
                }
                this.field4427 = var13.method1390();
            }
        }
        this.field4439 = arg5;
        this.field4429 = arg6;
        this.field4457 = var8.field5335;
        this.field4447 = this.field4442;
        return var13;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)V", line = 225)
    public static void method1909(int arg0) {
        field4469 = null;
        field4467 = null;
        if (arg0 != 22500) {
            field4438 = false;
        }
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(I)Z", line = 236)
    public final boolean method1910(int arg0) {
        if (arg0 != -1) {
            this.field4463 = 120;
        }
        field4432++;
        return this.field4451;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lqa;I)V", line = 249)
    public final void method1911(class167 arg0, int arg1) {
        if (this.field4454 != null) {
            class246.method1566(this.field4454, this.field4463, this.field4429, this.field4439, this.field4431);
            this.field4454 = null;
            this.field4431 = null;
        }
        field4436++;
        if (arg1 != -8881) {
            this.method1913(113, -26);
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(ZII)V", line = 270)
    private final void method1912(boolean arg0, int arg1, int arg2) {
        field4461++;
        if (arg0) {
            field4466 = -108;
        }
        label90: while (true) {
            if (this.field4450 == null) {
                if (this.field4459) {
                    return;
                }
                this.method1913(-1, -105);
                if (this.field4450 == null) {
                    return;
                }
            }
            int var4 = class310.field4553 - this.field4449;
            if (var4 > 100 && this.field4450.field6402 > 0) {
                int var5 = this.field4450.field6416.length - this.field4450.field6402;
                while (var5 > this.field4442 && this.field4450.field6413[this.field4442] < var4) {
                    var4 -= this.field4450.field6413[this.field4442];
                    this.field4442++;
                }
                if (this.field4442 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field4450.field6416.length; var7++) {
                        var6 += this.field4450.field6413[var7];
                    }
                    var4 %= var6;
                }
                this.field4456 = this.field4442 + 1;
                if (this.field4450.field6416.length <= this.field4456) {
                    this.field4456 -= this.field4450.field6402;
                    if (this.field4456 < 0 || this.field4450.field6416.length <= this.field4456) {
                        this.field4456 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field4450.field6413[this.field4442] >= var4) {
                            this.field4437 = var4;
                            this.field4449 = class310.field4553 - var4;
                            return;
                        }
                        class402.method2456(false, arg1, this.field4442, this.field4450, (byte) -23, arg2, this.field4465);
                        var4 -= this.field4450.field6413[this.field4442];
                        this.field4442++;
                        if (this.field4442 >= this.field4450.field6416.length) {
                            this.field4442 -= this.field4450.field6402;
                            if (this.field4442 < 0 || this.field4442 >= this.field4450.field6416.length) {
                                this.field4450 = null;
                                continue label90;
                            }
                        }
                        this.field4456 = this.field4442 + 1;
                    } while (this.field4456 < this.field4450.field6416.length);
                    this.field4456 -= this.field4450.field6402;
                } while (this.field4456 >= 0 && this.field4456 < this.field4450.field6416.length);
                this.field4456 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(II)V", line = 367)
    private final void method1913(int arg0, int arg1) {
        field4435++;
        int var3 = arg0;
        boolean var4 = false;
        if (arg0 == -1) {
            class370 var5 = class552.field7819.method2890(0, this.field4455);
            class370 var6 = var5;
            if (var5.field5272 != null) {
                var5 = var5.method2238((byte) 102, class401.field6001);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field5343 != null) {
                if (this.field4450 != null && var5.method2243(this.field4450.field6390, -13667)) {
                    return;
                }
                var3 = var5.method2241(108);
                if (this.field4457 != var5.field5335) {
                    var4 = var5.field5350;
                }
            } else if (var5.field5280 == -1) {
                if (var6 != null && var6.field5343 != null) {
                    if (this.field4450 != null && var6.method2243(this.field4450.field6390, -13667)) {
                        return;
                    }
                    var3 = var6.method2241(-110);
                    if (this.field4457 != var6.field5335) {
                        var4 = var6.field5350;
                    }
                } else if (var6 != null && var6.field5280 != -1 && this.field4457 != var6.field5335) {
                    var4 = var6.field5350;
                    var3 = var6.field5280;
                }
            } else if (this.field4457 != var5.field5335) {
                var3 = var5.field5280;
                var4 = var5.field5350;
            }
        }
        int var7 = -95 % ((-arg1 - 32) / 42);
        if (var3 == -1) {
            this.field4450 = null;
            return;
        }
        this.field4444 = null;
        if (this.field4450 == null || this.field4450.field6390 != var3) {
            this.field4450 = class49.field739.method2297((byte) 118, var3);
        } else if (this.field4450.field6396 == 0) {
            return;
        }
        if (this.field4450.field6416 == null) {
            this.field4450 = null;
            return;
        }
        if (var4) {
            this.field4442 = (int) ((double) this.field4450.field6416.length * Math.random());
            this.field4437 = (int) (Math.random() * (double) this.field4450.field6413[this.field4442]) + 1;
        } else {
            this.field4442 = 0;
            this.field4437 = 1;
        }
        this.field4456 = this.field4442 + 1;
        if (this.field4456 < 0 || this.field4456 >= this.field4450.field6416.length) {
            this.field4456 = -1;
        }
        this.field4449 = class310.field4553 - this.field4437;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(III)V", line = 488)
    public static final void method1914(int arg0, int arg1, int arg2) {
        field4462++;
        class21 var3 = class601.method3413(arg0, 6, (byte) 109);
        var3.method230(18340);
        var3.field308 = arg1;
        if (arg2 <= 126) {
            field4466 = -58;
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(ZIIII)V", line = 503)
    public static final void method1915(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field4453++;
        if (!arg0) {
            method1916(null, -68, -25);
        }
        if (class202.field2854.field7888 != 0 && arg3 != 0 && class621.field8746 < 50 && arg1 != -1) {
            class313.field4568[class621.field8746++] = new class509((byte) 1, arg1, arg3, arg4, arg2, 0);
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "([Loh;II)V", line = 546)
    public static final void method1916(class549[] arg0, int arg1, int arg2) {
        field4464++;
        for (int var3 = arg1; var3 < arg0.length; var3++) {
            class549 var4 = arg0[var3];
            if (var4 != null && var4.field7637 == arg2 && !client.method3529(var4)) {
                if (var4.field7749 == 0) {
                    method1916(arg0, 0, var4.field7734);
                    if (var4.field7684 != null) {
                        method1916(var4.field7684, arg1, var4.field7734);
                    }
                    class553 var5 = (class553) class639.field9274.method740(0, (long) var4.field7734);
                    if (var5 != null) {
                        class537.method3025(false, var5.field7827);
                    }
                }
                if (var4.field7749 == 6 && var4.field7705 != -1) {
                    class439 var6 = class49.field739.method2297((byte) 109, var4.field7705);
                    if (var6 != null) {
                        var4.field7664 += class303.field4378;
                        while (var4.field7664 > var6.field6413[var4.field7712]) {
                            var4.field7664 -= var6.field6413[var4.field7712];
                            var4.field7712++;
                            if (var4.field7712 >= var6.field6416.length) {
                                var4.field7712 -= var6.field6402;
                                if (var4.field7712 < 0 || var4.field7712 >= var6.field6416.length) {
                                    var4.field7712 = 0;
                                }
                            }
                            var4.field7632 = var4.field7712 + 1;
                            if (var4.field7632 >= var6.field6416.length) {
                                var4.field7632 -= var6.field6402;
                                if (var4.field7632 < 0 || var4.field7632 >= var6.field6416.length) {
                                    var4.field7632 = -1;
                                }
                            }
                            class412.method2497(var4, 120);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(BI)V", line = 634)
    public final void method1917(byte arg0, int arg1) {
        this.field4459 = true;
        field4452++;
        this.method1913(arg1, -103);
        if (arg0 <= 78) {
            method1909(103);
        }
    }

    @OriginalMember(owner = "client!wca", name = "c", descriptor = "(I)I", line = 648)
    public final int method1918(int arg0) {
        field4443++;
        if (arg0 >= -79) {
            method1909(104);
        }
        return this.field4427;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(ILqa;)V", line = 693)
    public final void method1919(int arg0, class167 arg1) {
        if (arg0 >= -8) {
            field4466 = -80;
        }
        field4428++;
        this.method1908(262144, -1, arg1, true, true, this.field4439, this.field4429);
    }
}
