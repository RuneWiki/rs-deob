import java.util.Date;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class114 extends class278 {

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "I")
    private int field1541 = 409;

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "I")
    private int field1537 = 204;

    @OriginalMember(owner = "client!ld", name = "W", descriptor = "I")
    private int field1549 = 4;

    @OriginalMember(owner = "client!ld", name = "I", descriptor = "I")
    private int field1536 = 81;

    @OriginalMember(owner = "client!ld", name = "db", descriptor = "I")
    private int field1556 = 1024;

    @OriginalMember(owner = "client!ld", name = "ab", descriptor = "I")
    private int field1553 = 1024;

    @OriginalMember(owner = "client!ld", name = "Y", descriptor = "I")
    private int field1551 = 8;

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "I")
    private int field1544 = 0;

    @OriginalMember(owner = "client!ld", name = "Z", descriptor = "Lwo;")
    public static class522 field1552 = new class522();

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
    private int field1540;

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "I")
    private int field1545;

    @OriginalMember(owner = "client!ld", name = "T", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!ld", name = "U", descriptor = "I")
    private int field1547;

    @OriginalMember(owner = "client!ld", name = "V", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!ld", name = "X", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!ld", name = "cb", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!ld", name = "bb", descriptor = "[I")
    private int[] field1554;

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "[[I")
    private int[][] field1539;

    @OriginalMember(owner = "client!ld", name = "eb", descriptor = "[[I")
    private int[][] field1557;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)[I", line = 4)
    public final int[] method208(int arg0, int arg1) {
        ++field1550;
        int[] var3 = super.field3750.method256(arg1, -30359);
        if (arg0 != -9) {
            method731((class378) null, -110, 12, -95, (boolean[]) null);
        }
        if (super.field3750.field554) {
            int var4 = 0;
            int var5;
            for (var5 = class454.field6637[arg1] + this.field1544; var5 < 0; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (~var4 > ~this.field1551 && ~this.field1554[var4] >= ~var5) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = (1 & var4) == 0;
            int var8 = this.field1554[var4];
            int var9 = this.field1554[var4 + -1];
            if (~var5 < ~(var9 - -this.field1545) && ~var5 > ~(var8 - this.field1545)) {
                for (int var10 = 0; var10 < class507.field7456; ++var10) {
                    int var11 = 0;
                    int var12 = var7 ? this.field1556 : -this.field1556;
                    int var13;
                    for (var13 = (this.field1540 * var12 >> 12) + class192.field2736[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (~var11 > ~this.field1549 && ~var13 <= ~this.field1539[var6][var11]) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field1539[var6][var11];
                    int var16 = this.field1539[var6][var14];
                    if (~var13 < ~(this.field1545 + var16) && var13 < -this.field1545 + var15) {
                        var3[var10] = this.field1557[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class416.method2486(var3, 0, class507.field7456, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)V", line = 108)
    public final void method207(int arg0) {
        if (arg0 != 2) {
            this.field1544 = -14;
        }
        ++field1546;
        this.method732(409);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 119)
    public static final String method730(long arg0, int arg1) {
        ++field1555;
        class410.field5848.setTime(new Date(arg0));
        int var3 = class410.field5848.get(7);
        int var4 = class410.field5848.get(5);
        int var5 = class410.field5848.get(2);
        int var6 = class410.field5848.get(1);
        int var7 = class410.field5848.get(11);
        if (arg1 != 10) {
            method733((byte) 80, true, (class14) null, false);
        }
        int var8 = class410.field5848.get(12);
        int var9 = class410.field5848.get(13);
        return class386.field5428[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class461.field6707[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lj;III[Z)Z", line = 148)
    public static final boolean method731(class378 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class383.field5391 != class364.field5058) {
            int var6 = class19.field195[arg1].method232(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; ++var7) {
                class35 var8 = class19.field195[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method232(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method230(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method227(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "(I)V", line = 183)
    private final void method732(int arg0) {
        ++field1538;
        Random var2 = new Random((long) this.field1551);
        this.field1547 = 4096 / this.field1551;
        this.field1540 = 4096 / this.field1549;
        this.field1545 = this.field1536 / 2;
        int var3 = this.field1540 / 2;
        this.field1557 = new int[this.field1551][this.field1549];
        this.field1539 = new int[this.field1551][this.field1549 + 1];
        int var4 = this.field1547 / 2;
        if (arg0 != 409) {
            this.field1541 = 75;
        }
        this.field1554 = new int[this.field1551 + 1];
        this.field1554[0] = 0;
        for (int var5 = 0; var5 < this.field1551; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field1547;
                int var7 = (-2048 + class432.method2579((byte) -17, 4096, var2)) * this.field1537 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field1554[var5] = this.field1554[var5 + -1] - -var8;
            }
            this.field1539[var5][0] = 0;
            for (int var9 = 0; ~this.field1549 < ~var9; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field1540;
                    int var11 = (-2048 + class432.method2579((byte) 86, 4096, var2)) * this.field1541 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field1539[var5][var9] = this.field1539[var5][var9 + -1] + var12;
                }
                this.field1557[var5][var9] = this.field1553 > 0 ? -class432.method2579((byte) -122, this.field1553, var2) + 4096 : 4096;
            }
            this.field1539[var5][this.field1549] = 4096;
        }
        this.field1554[this.field1551] = 4096;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V", line = 246)
    public class114() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Llh;II)V", line = 253)
    public final void method210(class365 arg0, int arg1, int arg2) {
        ++field1542;
        if (arg1 != -30446) {
            this.field1547 = 66;
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (arg2 != 6) {
                                    if (arg2 == 7) {
                                        this.field1553 = arg0.method2062((byte) 14);
                                    }
                                } else {
                                    this.field1536 = arg0.method2062((byte) 14);
                                }
                            } else {
                                this.field1544 = arg0.method2062((byte) 14);
                            }
                        } else {
                            this.field1556 = arg0.method2062((byte) 14);
                        }
                    } else {
                        this.field1537 = arg0.method2062((byte) 14);
                    }
                } else {
                    this.field1541 = arg0.method2062((byte) 14);
                }
            } else {
                this.field1551 = arg0.method2099(arg1 + 30701);
            }
        } else {
            this.field1549 = arg0.method2099(255);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BZLqk;Z)V", line = 357)
    public static final void method733(byte arg0, boolean arg1, class14 arg2, boolean arg3) {
        ++field1548;
        int var4 = arg2.field167;
        int var5 = (int) arg2.field7342;
        arg2.method2946(-117);
        if (arg1) {
            class495.method2926(var4, (byte) 118);
        }
        if (arg0 == -90) {
            class422.method2522((byte) 113, var4);
            class295 var6 = class339.method1882((byte) 96, var5);
            if (var6 != null) {
                class150.method952((byte) -10, var6);
            }
            class17.method140((byte) -32);
            if (!arg3 && class319.field4419 != -1) {
                class368.method2131(1, class319.field4419, false);
            }
            class458 var7 = new class458(class269.field3690);
            for (class14 var8 = (class14) var7.method2692((byte) -91); var8 != null; var8 = (class14) var7.method2693(arg0 + 90)) {
                if (!var8.method2944((byte) 119)) {
                    var8 = (class14) var7.method2692((byte) -105);
                    if (var8 == null) {
                        return;
                    }
                }
                if (~var8.field166 == -4) {
                    int var9 = (int) var8.field7342;
                    if (~(var9 >>> 16) == ~var4) {
                        method733((byte) -90, true, var8, arg3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(B)I", line = 424)
    public static final int method734(byte arg0) {
        if (arg0 <= 101) {
            return 17;
        } else {
            ++field1543;
            return 2;
        }
    }

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "(B)V", line = 441)
    public static void method735(byte arg0) {
        if (arg0 != -128) {
            method731((class378) null, 12, 83, -113, (boolean[]) null);
        }
        field1552 = null;
    }
}
