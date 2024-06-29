import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class410 {

    @OriginalMember(owner = "client!mt", name = "h", descriptor = "I")
    private int field5700 = 0;

    @OriginalMember(owner = "client!mt", name = "x", descriptor = "I")
    private int field5716 = 0;

    @OriginalMember(owner = "client!mt", name = "t", descriptor = "I")
    private int field5712 = -1;

    @OriginalMember(owner = "client!mt", name = "v", descriptor = "I")
    private int field5714 = -1;

    @OriginalMember(owner = "client!mt", name = "B", descriptor = "I")
    private int field5720 = -1;

    @OriginalMember(owner = "client!mt", name = "j", descriptor = "Z")
    private boolean field5702 = false;

    @OriginalMember(owner = "client!mt", name = "J", descriptor = "Z")
    private boolean field5728 = false;

    @OriginalMember(owner = "client!mt", name = "D", descriptor = "I")
    public int field5722;

    @OriginalMember(owner = "client!mt", name = "F", descriptor = "B")
    private byte field5724;

    @OriginalMember(owner = "client!mt", name = "n", descriptor = "B")
    private byte field5706;

    @OriginalMember(owner = "client!mt", name = "p", descriptor = "Lig;")
    private class674 field5708;

    @OriginalMember(owner = "client!mt", name = "q", descriptor = "I")
    public int field5709;

    @OriginalMember(owner = "client!mt", name = "s", descriptor = "I")
    public int field5711;

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "Z")
    private boolean field5697;

    @OriginalMember(owner = "client!mt", name = "I", descriptor = "Lcba;")
    public static class53 field5727 = new class53(0);

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "I")
    public static int field5693;

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "I")
    public static int field5695;

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "I")
    private int field5696;

    @OriginalMember(owner = "client!mt", name = "f", descriptor = "I")
    public static int field5698;

    @OriginalMember(owner = "client!mt", name = "g", descriptor = "I")
    private int field5699;

    @OriginalMember(owner = "client!mt", name = "i", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!mt", name = "o", descriptor = "I")
    public static int field5707;

    @OriginalMember(owner = "client!mt", name = "r", descriptor = "I")
    public static int field5710;

    @OriginalMember(owner = "client!mt", name = "u", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!mt", name = "w", descriptor = "I")
    public static int field5715;

    @OriginalMember(owner = "client!mt", name = "y", descriptor = "I")
    public static int field5717;

    @OriginalMember(owner = "client!mt", name = "z", descriptor = "I")
    private int field5718;

    @OriginalMember(owner = "client!mt", name = "A", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!mt", name = "C", descriptor = "I")
    public static int field5721;

    @OriginalMember(owner = "client!mt", name = "E", descriptor = "I")
    public static int field5723;

    @OriginalMember(owner = "client!mt", name = "G", descriptor = "I")
    private int field5725;

    @OriginalMember(owner = "client!mt", name = "H", descriptor = "I")
    public static int field5726;

    @OriginalMember(owner = "client!mt", name = "K", descriptor = "Lec;")
    private class103 field5729;

    @OriginalMember(owner = "client!mt", name = "m", descriptor = "Lpba;")
    public class198 field5705;

    @OriginalMember(owner = "client!mt", name = "l", descriptor = "Lka;")
    private class283 field5704;

    @OriginalMember(owner = "client!mt", name = "M", descriptor = "Lha;")
    public static class545 field5731;

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "Lfe;")
    public static class637 field5694;

    @OriginalMember(owner = "client!mt", name = "k", descriptor = "Lr;")
    private class706 field5703;

    @OriginalMember(owner = "client!mt", name = "L", descriptor = "[Z")
    private boolean[] field5730;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)I", line = 11)
    public final int method2498(byte arg0) {
        if (arg0 != -67) {
            this.field5728 = true;
        }
        field5698++;
        return this.field5700;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V", line = 22)
    public static final void method2499(int arg0) {
        if (arg0 >= -26) {
            field5727 = null;
        }
        field5721++;
        for (class200 var1 = (class200) class503.field7030.method3118((byte) 73); var1 != null; var1 = (class200) class503.field7030.method3111(116)) {
            if (var1.field2899 > 0) {
                var1.field2899--;
            }
            if (var1.field2899 != 0) {
                if (var1.field2896 > 0) {
                    var1.field2896--;
                }
                if (var1.field2896 == 0 && var1.field2900 >= 1 && var1.field2895 >= 1 && class514.field7179 - 2 >= var1.field2900 && (class456.field6281 - 2) >= var1.field2895 && (var1.field2891 < 0 || class11.method61((byte) -50, var1.field2903, var1.field2891))) {
                    class262.method1623(var1.field2889, var1.field2893, var1.field2894, var1.field2891, var1.field2900, -118, -1, var1.field2895, var1.field2903);
                    var1.field2896 = -1;
                    if (var1.field2898 == var1.field2891 && var1.field2898 == -1) {
                        var1.method3065(-17363);
                    } else if (var1.field2898 == var1.field2891 && var1.field2892 == var1.field2889 && var1.field2903 == var1.field2901) {
                        var1.method3065(-17363);
                    }
                }
            } else if (var1.field2898 < 0 || class11.method61((byte) -116, var1.field2901, var1.field2898)) {
                class262.method1623(var1.field2892, var1.field2893, var1.field2894, var1.field2898, var1.field2900, -126, -1, var1.field2895, var1.field2901);
                var1.method3065(-17363);
            }
        }
    }

    @OriginalMember(owner = "client!mt", name = "finalize", descriptor = "()V", line = 80)
    protected final void finalize() {
        field5726++;
        if (this.field5705 != null) {
            this.field5705.method1344();
        }
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lha;Lkha;IIIILig;ZI)V", line = 612)
    public class410(class545 arg0, class30 arg1, int arg2, int arg3, int arg4, int arg5, class674 arg6, boolean arg7, int arg8) {
        this.field5722 = arg3;
        this.field5724 = (byte) arg4;
        this.field5706 = (byte) arg5;
        this.field5708 = arg6;
        this.field5709 = arg2;
        this.field5711 = arg1.field442;
        this.field5728 = arg7;
        this.field5697 = arg0.method2086() && arg1.field439 && !this.field5728;
        if (arg8 != -1) {
            this.field5702 = true;
        }
        this.method2502(arg8, 18867);
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IZZBLha;)Lka;", line = 96)
    public final class283 method2500(int arg0, boolean arg1, boolean arg2, byte arg3, class545 arg4) {
        field5707++;
        if (arg3 != -28) {
            this.field5730 = null;
        }
        class30 var6 = class264.field3604.method3188(this.field5711, (byte) -57);
        if (var6.field455 != null) {
            var6 = var6.method219(-1, class554.field7826);
        }
        if (var6 == null) {
            this.method2504(arg4, 57);
            this.field5714 = -1;
            this.field5712 = -1;
            this.field5720 = -1;
            return null;
        }
        if (!this.field5702 && this.field5712 != var6.field442) {
            this.field5704 = null;
            this.method2502(-1, 18867);
        }
        this.method2503(104, this.field5708);
        if (arg1) {
            boolean var7 = arg1 & this.field5697 & class674.field9500.field5151.method2364(0) != 0;
            arg1 = var7 & (this.field5720 != var6.field442 || this.field5729 != null && class674.field9500.field5151.method2364(0) >= 2 && (this.field5714 != this.field5699 || (this.field5729.field1491 || class729.field10218) && this.field5699 != this.field5696));
        }
        if (arg2 && !arg1) {
            this.field5712 = var6.field442;
            return null;
        }
        if (arg1) {
            class308.method1811(this.field5703, this.field5706, this.field5708.field9490, this.field5708.field9489, this.field5730);
            this.field5714 = -1;
            this.field5720 = -1;
        }
        class339 var8 = class52.field741[this.field5706];
        class339 var9;
        if (this.field5728) {
            var9 = class155.field2126[0];
        } else {
            var9 = this.field5706 < 3 ? class52.field741[this.field5706 + 1] : null;
        }
        class283 var10 = null;
        if (this.field5729 != null) {
            if (arg1) {
                arg0 |= 0x40000;
            }
            var10 = var6.method220(this.field5709 == 11 ? this.field5722 + 4 : this.field5722, this.field5729, (byte) -123, var8, var9, this.field5709 == 11 ? 10 : this.field5709, this.field5708.field9490, this.field5696, this.field5725, var8.method1960(this.field5708.field9490, this.field5708.field9489, arg3 ^ 0xFFFFFF99), this.field5708.field9489, arg4, this.field5699, arg0);
            if (var10 == null) {
                this.field5703 = null;
                this.field5716 = 0;
                this.field5700 = 0;
                this.field5730 = null;
            } else {
                if (arg1) {
                    if (this.field5730 == null) {
                        this.field5730 = new boolean[4];
                    }
                    this.field5703 = var10.method1124(this.field5703);
                    class331.method1923(this.field5703, this.field5706, this.field5708.field9490, this.field5708.field9489, this.field5730);
                    this.field5720 = var6.field442;
                    this.field5714 = this.field5699;
                }
                this.field5716 = var10.method1120();
                this.field5700 = var10.method1113();
            }
            this.field5704 = null;
        } else if (this.field5704 != null && arg0 == (this.field5704.method1135() & arg0) && this.field5712 == var6.field442) {
            var10 = this.field5704;
        } else {
            if (this.field5704 != null) {
                arg0 |= this.field5704.method1135();
            }
            class693 var11 = var6.method226(arg0, this.field5708.field9489, arg1, this.field5709 == 11 ? this.field5722 + 4 : this.field5722, arg4, this.field5708.field9490, var8.method1960(this.field5708.field9490, this.field5708.field9489, 119), this.field5709 == 11 ? 10 : this.field5709, var8, 0, var9);
            if (var11 == null) {
                this.field5703 = null;
                this.field5704 = null;
                this.field5716 = 0;
                this.field5700 = 0;
                this.field5730 = null;
            } else {
                var10 = var11.field9689;
                this.field5704 = var11.field9689;
                if (arg1) {
                    this.field5703 = var11.field9692;
                    this.field5730 = null;
                    class331.method1923(this.field5703, this.field5706, this.field5708.field9490, this.field5708.field9489, null);
                    this.field5714 = -1;
                    this.field5720 = var6.field442;
                }
                this.field5716 = var10.method1120();
                this.field5700 = var10.method1113();
            }
        }
        this.field5712 = var6.field442;
        return var10;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IZ)V", line = 241)
    public final void method2501(int arg0, boolean arg1) {
        this.field5702 = arg1;
        field5710++;
        this.method2502(arg0, 18867);
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(II)V", line = 251)
    private final void method2502(int arg0, int arg1) {
        field5713++;
        if (arg1 != 18867) {
            method2499(84);
        }
        int var3 = arg0;
        boolean var4 = false;
        if (arg0 == -1) {
            class30 var5 = class264.field3604.method3188(this.field5711, (byte) -57);
            class30 var6 = var5;
            if (var5.field455 != null) {
                var5 = var5.method219(-1, class554.field7826);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field465 != null) {
                if (this.field5729 != null && var5.method221((byte) 29, this.field5729.field1468)) {
                    return;
                }
                var3 = var5.method213(true);
                if (this.field5712 != var5.field442) {
                    var4 = var5.field406;
                }
            } else if (var5.field387 == -1) {
                if (var6 != null && var6.field465 != null) {
                    if (this.field5729 != null && var6.method221((byte) 82, this.field5729.field1468)) {
                        return;
                    }
                    var3 = var6.method213(true);
                    if (this.field5712 != var6.field442) {
                        var4 = var6.field406;
                    }
                } else if (var6 != null && var6.field387 != -1 && this.field5712 != var6.field442) {
                    var3 = var6.field387;
                    var4 = var6.field406;
                }
            } else if (this.field5712 != var5.field442) {
                var3 = var5.field387;
                var4 = var5.field406;
            }
        }
        if (var3 == -1) {
            this.field5729 = null;
            return;
        }
        this.field5704 = null;
        if (this.field5729 == null || this.field5729.field1468 != var3) {
            this.field5729 = class274.field3684.method1881((byte) -80, var3);
        } else if (this.field5729.field1476 == 0) {
            return;
        }
        if (this.field5729.field1472 == null) {
            this.field5729 = null;
            return;
        }
        if (var4) {
            this.field5699 = (int) (Math.random() * (double) this.field5729.field1472.length);
            this.field5725 = (int) (Math.random() * (double) this.field5729.field1493[this.field5699]) + 1;
        } else {
            this.field5725 = 1;
            this.field5699 = 0;
        }
        this.field5696 = this.field5699 + 1;
        if (this.field5696 < 0 || this.field5729.field1472.length <= this.field5696) {
            this.field5696 = -1;
        }
        this.field5718 = class245.field3409 - this.field5725;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(ILig;)V", line = 378)
    private final void method2503(int arg0, class674 arg1) {
        int var3 = -1 / ((arg0 - 23) / 58);
        field5717++;
        label88: while (true) {
            if (this.field5729 == null) {
                if (this.field5702) {
                    return;
                }
                this.method2502(-1, 18867);
                if (this.field5729 == null) {
                    return;
                }
            }
            int var4 = class245.field3409 - this.field5718;
            if (var4 > 100 && this.field5729.field1487 > 0) {
                int var5 = this.field5729.field1472.length - this.field5729.field1487;
                while (this.field5699 < var5 && var4 > this.field5729.field1493[this.field5699]) {
                    var4 -= this.field5729.field1493[this.field5699];
                    this.field5699++;
                }
                if (this.field5699 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field5729.field1472.length; var7++) {
                        var6 += this.field5729.field1493[var7];
                    }
                    var4 %= var6;
                }
                this.field5696 = this.field5699 + 1;
                if (this.field5729.field1472.length <= this.field5696) {
                    this.field5696 -= this.field5729.field1487;
                    if (this.field5696 < 0 || this.field5696 >= this.field5729.field1472.length) {
                        this.field5696 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var4 <= this.field5729.field1493[this.field5699]) {
                            this.field5725 = var4;
                            this.field5718 = class245.field3409 - var4;
                            return;
                        }
                        class694.method3941(this.field5699, this.field5729, arg1, true);
                        var4 -= this.field5729.field1493[this.field5699];
                        this.field5699++;
                        if (this.field5729.field1472.length <= this.field5699) {
                            this.field5699 -= this.field5729.field1487;
                            if (this.field5699 < 0 || this.field5699 >= this.field5729.field1472.length) {
                                this.field5729 = null;
                                continue label88;
                            }
                        }
                        this.field5696 = this.field5699 + 1;
                    } while (this.field5729.field1472.length > this.field5696);
                    this.field5696 -= this.field5729.field1487;
                } while (this.field5696 >= 0 && this.field5696 < this.field5729.field1472.length);
                this.field5696 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lha;I)V", line = 482)
    public final void method2504(class545 arg0, int arg1) {
        if (this.field5703 != null) {
            class308.method1811(this.field5703, this.field5706, this.field5708.field9490, this.field5708.field9489, this.field5730);
            this.field5703 = null;
            this.field5730 = null;
        }
        field5701++;
        int var3 = 2 / ((-arg1 - 39) / 63);
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(ILka;BIZIILha;Luha;)V", line = 499)
    public final void method2505(int arg0, class283 arg1, byte arg2, int arg3, boolean arg4, int arg5, int arg6, class545 arg7, class723 arg8) {
        field5693++;
        if (arg2 != 14) {
            return;
        }
        class57[] var10 = arg1.method1158();
        class648[] var11 = arg1.method1145();
        if ((this.field5705 == null || this.field5705.field2863) && (var10 != null || var11 != null)) {
            class30 var12 = class264.field3604.method3188(this.field5711, (byte) -57);
            if (var12.field455 != null) {
                var12 = var12.method219(arg2 - 15, class554.field7826);
            }
            if (var12 != null) {
                this.field5705 = class198.method1343(class245.field3409, true);
            }
        }
        if (this.field5705 == null) {
            return;
        }
        arg1.method1172(arg8);
        if (arg4) {
            this.field5705.method1346(arg7, (long) class245.field3409, var10, var11, false);
        } else {
            this.field5705.method1336((long) class245.field3409);
        }
        this.field5705.method1342(this.field5724, arg3, arg0, arg5, arg6);
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(B)V", line = 540)
    public static void method2506(byte arg0) {
        if (arg0 >= -13) {
            method2499(-99);
        }
        field5731 = null;
        field5694 = null;
        field5727 = null;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(ILha;)V", line = 567)
    public final void method2507(int arg0, class545 arg1) {
        this.method2500(262144, true, true, (byte) -28, arg1);
        if (arg0 != 28806) {
            this.field5712 = 107;
        }
        field5719++;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Z)Z", line = 578)
    public final boolean method2508(boolean arg0) {
        if (!arg0) {
            this.method2502(-109, -106);
        }
        field5723++;
        return this.field5697;
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(I)I", line = 598)
    public final int method2509(int arg0) {
        field5695++;
        return arg0 <= 53 ? -85 : this.field5716;
    }
}
