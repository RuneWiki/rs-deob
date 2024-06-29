import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class43 extends class178 {

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "Z")
    private boolean field600 = false;

    @OriginalMember(owner = "client!ji", name = "L", descriptor = "I")
    private int field618 = -1;

    @OriginalMember(owner = "client!ji", name = "T", descriptor = "I")
    private int field626 = -1;

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "I")
    private int field601 = -32768;

    @OriginalMember(owner = "client!ji", name = "V", descriptor = "Lvd;")
    private class4 field628 = null;

    @OriginalMember(owner = "client!ji", name = "O", descriptor = "I")
    private int field621;

    @OriginalMember(owner = "client!ji", name = "G", descriptor = "I")
    private int field613;

    @OriginalMember(owner = "client!ji", name = "z", descriptor = "I")
    private int field606;

    @OriginalMember(owner = "client!ji", name = "y", descriptor = "I")
    private int field605;

    @OriginalMember(owner = "client!ji", name = "W", descriptor = "I")
    private int field629;

    @OriginalMember(owner = "client!ji", name = "A", descriptor = "I")
    private int field607;

    @OriginalMember(owner = "client!ji", name = "F", descriptor = "I")
    private int field612;

    @OriginalMember(owner = "client!ji", name = "Q", descriptor = "I")
    private int field623;

    @OriginalMember(owner = "client!ji", name = "K", descriptor = "I")
    private int field617;

    @OriginalMember(owner = "client!ji", name = "I", descriptor = "Lpi;")
    private class141 field615;

    @OriginalMember(owner = "client!ji", name = "x", descriptor = "I")
    private int field604;

    @OriginalMember(owner = "client!ji", name = "N", descriptor = "I")
    public static int field620 = 0;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!ji", name = "C", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!ji", name = "D", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!ji", name = "H", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!ji", name = "J", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!ji", name = "M", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!ji", name = "P", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!ji", name = "R", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!ji", name = "B", descriptor = "Lbj;")
    private class157 field608;

    @OriginalMember(owner = "client!ji", name = "S", descriptor = "Llc;")
    public static class86 field625;

    @OriginalMember(owner = "client!ji", name = "E", descriptor = "Ljava/lang/String;")
    public static String field611;

    @OriginalMember(owner = "client!ji", name = "U", descriptor = "[[[Led;")
    public static class187[][][] field627;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)V")
    private final void method323(int arg0, int arg1) {
        field602++;
        boolean var3 = false;
        int var4 = arg0;
        if (arg0 == -1) {
            class36 var5 = class134.method970(this.field613, 0);
            class36 var6 = var5;
            if (var5.field471 != null) {
                var5 = var5.method277(27981);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field476 != null) {
                if (this.field615 != null && var5.method279(this.field615.field2256, 0)) {
                    return;
                }
                var4 = var5.method274(-3);
                if (this.field626 != var5.field477) {
                    var3 = var5.field513;
                }
            } else if (var5.field461 == -1) {
                if (var6 != null && var6.field476 != null) {
                    if (this.field615 != null && var6.method279(this.field615.field2256, 0)) {
                        return;
                    }
                    var4 = var6.method274(-3);
                    if (this.field626 != var6.field477) {
                        var3 = var6.field513;
                    }
                } else if (var6 != null && var6.field461 != -1 && this.field626 != var6.field477) {
                    var3 = var6.field513;
                    var4 = var6.field461;
                }
            } else if (this.field626 != var5.field477) {
                var4 = var5.field461;
                var3 = var5.field513;
            }
        }
        if (var4 == -1) {
            this.field615 = null;
            return;
        }
        if (this.field615 == null || this.field615.field2256 != var4) {
            this.field615 = class285.method1939(var4, 112);
        } else if (this.field615.field2273 == 0) {
            return;
        }
        if (var3) {
            this.field623 = (int) ((double) this.field615.field2252.length * Math.random());
            this.field617 = (int) ((double) this.field615.field2263[this.field623] * Math.random()) + 1;
        } else {
            this.field623 = 0;
            this.field617 = 1;
        }
        int var7 = 5 / ((arg1 - 36) / 50);
        this.field604 = this.field623 + 1;
        if (this.field604 < 0 || this.field604 >= this.field615.field2252.length) {
            this.field604 = -1;
        }
        this.field612 = class264.field4290 - this.field617;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIII)V")
    public final void method4(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method327(arg4, 4242, arg3);
        field624++;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(JI)V")
    public static final void method324(long arg0, int arg1) {
        field610++;
        int var3 = -36 % ((arg1 + 19) / 59);
        if (arg0 <= 0L) {
            return;
        }
        if ((arg0 % 10L) == 0L) {
            class262.method1835((byte) -124, arg0 - 1L);
            class262.method1835((byte) -124, 1L);
        } else {
            class262.method1835((byte) -124, arg0);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIIIIJILbj;)V")
    public final void method2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class157 arg10) {
        field622++;
        class178 var13 = this.method329(-8349);
        if (var13 != null) {
            var13.method2(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field608);
        }
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V")
    public static void method325(int arg0) {
        field611 = null;
        field625 = null;
        if (arg0 != 2) {
            method328(-38, -103, -47);
        }
        field627 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZI)Lwg;")
    private final class178 method326(boolean arg0, int arg1) {
        field599++;
        boolean var3 = class220.field3533 != class169.field2724;
        class36 var4 = class134.method970(this.field613, arg1 - 10897);
        if (var4.field471 != null) {
            var4 = var4.method277(27981);
        }
        if (var4 == null) {
            this.field618 = this.field623;
            this.field626 = -1;
            return null;
        }
        if (!this.field600 && this.field626 != var4.field477) {
            this.method323(-1, -40);
        }
        int var5 = this.field605 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var6 = var4.field487;
            var7 = var4.field501;
        } else {
            var6 = var4.field501;
            var7 = var4.field487;
        }
        int var8 = (var7 + 1 >> 1) + this.field621;
        int var9 = (var6 >> 1) + this.field629;
        if (arg1 != 10897) {
            this.method326(true, -61);
        }
        int var10 = (var6 + 1 >> 1) + this.field629;
        int var11 = (var7 >> 1) + this.field621;
        this.method327(var9 * 128, 4242, var11 * 128);
        boolean var12 = !var3 && var4.field458 && (this.field626 != var4.field477 || (this.field623 != this.field618 || this.field615 != null && (this.field615.field2261 || class217.field3444) && this.field623 != this.field604) && class184.field2953 >= 2);
        if (arg0 && !var12) {
            this.field618 = this.field623;
            this.field626 = var4.field477;
            return null;
        }
        int[][] var13 = class220.field3533[this.field606];
        int var14 = var13[var8][var9] + var13[var11][var9] + var13[var8][var10] + var13[var11][var10] >> 2;
        int var15 = (this.field621 << 7) + (var7 << 6);
        int var16 = (this.field629 << 7) + (var6 << 6);
        int[][] var17 = null;
        if (var3) {
            var17 = class169.field2724[0];
        } else if (this.field606 < 3) {
            var17 = class220.field3533[this.field606 + 1];
        }
        boolean var18 = this.field628 == null;
        class71 var19;
        if (this.field615 == null) {
            var19 = var4.method283(5, var15, var13, var12, var17, var14, false, this.field605, this.field607, var16, var18 ? class60.field839 : this.field628);
        } else {
            var19 = var4.method280(var12, this.field617, var13, var15, var18 ? class60.field839 : this.field628, this.field623, this.field607, this.field615, this.field605, var17, (byte) 54, var14, var16, this.field604);
        }
        if (var19 == null) {
            this.field626 = var4.field477;
            this.field618 = this.field623;
            return null;
        } else {
            this.field626 = var4.field477;
            this.field618 = this.field623;
            return var19.field1042;
        }
    }

    @OriginalMember(owner = "client!ji", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field616++;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(III)V")
    private final void method327(int arg0, int arg1, int arg2) {
        field598++;
        if (arg1 != 4242) {
            this.method329(-64);
        }
        label90: while (true) {
            if (this.field615 == null) {
                if (this.field600) {
                    return;
                }
                this.method323(-1, 93);
                if (this.field615 == null) {
                    return;
                }
            }
            int var4 = class264.field4290 - this.field612;
            if (var4 > 100 && this.field615.field2269 > 0) {
                int var5 = this.field615.field2252.length - this.field615.field2269;
                while (this.field623 < var5 && this.field615.field2263[this.field623] < var4) {
                    var4 -= this.field615.field2263[this.field623];
                    this.field623++;
                }
                if (this.field623 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field615.field2252.length; var7++) {
                        var6 += this.field615.field2263[var7];
                    }
                    var4 %= var6;
                }
                this.field604 = this.field623 + 1;
                if (this.field604 >= this.field615.field2252.length) {
                    this.field604 -= this.field615.field2269;
                    if (this.field604 < 0 || this.field615.field2252.length <= this.field604) {
                        this.field604 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field615.field2263[this.field623] >= var4) {
                            this.field612 = class264.field4290 - var4;
                            this.field617 = var4;
                            return;
                        }
                        class263.method1845(this.field623, arg0, false, arg2, (byte) -96, this.field615);
                        var4 -= this.field615.field2263[this.field623];
                        this.field623++;
                        if (this.field615.field2252.length <= this.field623) {
                            this.field623 -= this.field615.field2269;
                            if (this.field623 < 0 || this.field623 >= this.field615.field2252.length) {
                                this.field615 = null;
                                continue label90;
                            }
                        }
                        this.field604 = this.field623 + 1;
                    } while (this.field604 < this.field615.field2252.length);
                    this.field604 -= this.field615.field2269;
                } while (this.field604 >= 0 && this.field615.field2252.length > this.field604);
                this.field604 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(III)I")
    public static final int method328(int arg0, int arg1, int arg2) {
        field596++;
        if (arg1 == -2) {
            return 12345678;
        }
        int var3 = 85 % ((54 - arg0) / 54);
        if (arg1 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        }
        int var4 = (arg1 & 0x7F) * arg2 >> 7;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 126) {
            var4 = 126;
        }
        return (arg1 & 0xFF80) + var4;
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)Lwg;")
    public final class178 method329(int arg0) {
        field603++;
        if (arg0 != -8349) {
            method324(-6L, -87);
        }
        return this.method326(false, arg0 + 19246);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V")
    public static final void method330(byte arg0) {
        field619++;
        int var1 = class285.field4511.method1257(class280.field4466);
        for (int var2 = 0; var2 < class243.field3890; var2++) {
            int var6 = class285.field4511.method1257(class188.method1401(arg0 ^ 0xFFFFFFE2, var2));
            if (var1 < var6) {
                var1 = var6;
            }
        }
        var1 += 8;
        int var3 = class243.field3890 * 15 + 21;
        int var4 = class272.field4378 - (var1 / 2);
        int var5 = class52.field767;
        if (class154.field2543 < (var3 + var5)) {
            var5 = class154.field2543 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if ((var1 + var4) > class23.field265) {
            var4 = class23.field265 - var1;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        if (arg0 != -32) {
            field611 = null;
        }
        if (class46.field675 != 1) {
            if (class272.field4378 == class126.field1850 && class52.field767 == class101.field1497) {
                class101.field1500 = var1;
                class46.field675 = 0;
                class192.field3096 = var4;
                class98.field1440 = class243.field3890 * 15 + (class202.field3232 ? 26 : 22);
                class206.field3315 = true;
                class116.field1670 = var5;
                return;
            }
            class281.field4471 = class101.field1497;
            class46.field675 = 1;
            class289.field4587 = class126.field1850;
        } else if (class289.field4587 == class272.field4378 && class52.field767 == class281.field4471) {
            class206.field3315 = true;
            class101.field1500 = var1;
            class46.field675 = 0;
            class116.field1670 = var5;
            class192.field3096 = var4;
            class98.field1440 = (class202.field3232 ? 26 : 22) + class243.field3890 * 15;
            return;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "()I")
    public final int method3() {
        field609++;
        return this.field601;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(IIIIIIIZLwg;)V")
    public class43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class178 arg8) {
        this.field621 = arg4;
        this.field613 = arg0;
        this.field606 = arg3;
        this.field605 = arg2;
        this.field629 = arg5;
        this.field607 = arg1;
        if (arg8 != null) {
            this.field600 = true;
            if (arg8 instanceof class43) {
                class43 var10 = (class43) arg8;
                this.field612 = var10.field612;
                this.field623 = var10.field623;
                this.field617 = var10.field617;
                this.field615 = var10.field615;
                this.field604 = var10.field604;
            }
        }
        if (this.field600) {
            this.method323(arg6, 127);
        }
    }
}
