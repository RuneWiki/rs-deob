import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class287 extends class197 {

    @OriginalMember(owner = "client!si", name = "u", descriptor = "I")
    private int field4574 = -1;

    @OriginalMember(owner = "client!si", name = "x", descriptor = "I")
    private int field4577 = -1;

    @OriginalMember(owner = "client!si", name = "y", descriptor = "I")
    private int field4578 = -32768;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "Z")
    private boolean field4568 = false;

    @OriginalMember(owner = "client!si", name = "M", descriptor = "Lvl;")
    private class68 field4592 = null;

    @OriginalMember(owner = "client!si", name = "H", descriptor = "I")
    private int field4587;

    @OriginalMember(owner = "client!si", name = "L", descriptor = "I")
    private int field4591;

    @OriginalMember(owner = "client!si", name = "K", descriptor = "I")
    private int field4590;

    @OriginalMember(owner = "client!si", name = "S", descriptor = "I")
    private int field4597;

    @OriginalMember(owner = "client!si", name = "R", descriptor = "I")
    private int field4596;

    @OriginalMember(owner = "client!si", name = "v", descriptor = "I")
    private int field4575;

    @OriginalMember(owner = "client!si", name = "N", descriptor = "I")
    private int field4593;

    @OriginalMember(owner = "client!si", name = "t", descriptor = "Lni;")
    private class21 field4573;

    @OriginalMember(owner = "client!si", name = "D", descriptor = "I")
    private int field4583;

    @OriginalMember(owner = "client!si", name = "s", descriptor = "I")
    private int field4572;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "I")
    private int field4571;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!si", name = "w", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!si", name = "z", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!si", name = "A", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!si", name = "B", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!si", name = "C", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!si", name = "F", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!si", name = "I", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!si", name = "J", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!si", name = "O", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!si", name = "P", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!si", name = "E", descriptor = "Ljj;")
    public static class134 field4584;

    @OriginalMember(owner = "client!si", name = "G", descriptor = "Lqc;")
    private class4 field4586;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "[[S")
    public static short[][] field4567;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(B)Lli;")
    public final class197 method1921(byte arg0) {
        field4579++;
        if (arg0 != 48) {
            this.field4574 = -57;
        }
        return this.method1928((byte) -120, false);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIIIIJILqc;)V")
    public final void method85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class4 arg10) {
        field4595++;
        class197 var13 = this.method1921((byte) 48);
        if (var13 != null) {
            var13.method85(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4586);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public static final void method1922(int arg0) {
        class111.field1908.method1834(0);
        field4580++;
        if (arg0 >= -109) {
            field4584 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field4589++;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)V")
    private final void method1923(int arg0, byte arg1) {
        boolean var3 = false;
        int var4 = arg0;
        field4588++;
        if (arg1 != -50) {
            this.field4596 = 13;
        }
        if (arg0 == -1) {
            class94 var5 = class119.method842(arg1 ^ 0x75, this.field4591);
            class94 var6 = var5;
            if (var5.field1345 != null) {
                var5 = var5.method658(arg1 + 3884);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field1378 != null) {
                if (this.field4573 != null && var5.method653(this.field4573.field259, (byte) 127)) {
                    return;
                }
                var4 = var5.method662(0);
                if (this.field4574 != var5.field1388) {
                    var3 = var5.field1335;
                }
            } else if (var5.field1394 == -1) {
                if (var6 != null && var6.field1378 != null) {
                    if (this.field4573 != null && var6.method653(this.field4573.field259, (byte) 126)) {
                        return;
                    }
                    var4 = var6.method662(0);
                    if (this.field4574 != var6.field1388) {
                        var3 = var6.field1335;
                    }
                } else if (var6 != null && var6.field1394 != -1 && this.field4574 != var6.field1388) {
                    var3 = var6.field1335;
                    var4 = var6.field1394;
                }
            } else if (this.field4574 != var5.field1388) {
                var4 = var5.field1394;
                var3 = var5.field1335;
            }
        }
        if (var4 == -1) {
            this.field4573 = null;
            return;
        }
        if (this.field4573 == null || this.field4573.field259 != var4) {
            this.field4573 = class267.method1812((byte) 89, var4);
        } else if (this.field4573.field239 == 0) {
            return;
        }
        if (var3) {
            this.field4571 = (int) (Math.random() * (double) this.field4573.field237.length);
        } else {
            this.field4571 = 0;
        }
        this.field4572 = this.field4571 + 1;
        if (this.field4572 < 0 || this.field4572 >= this.field4573.field237.length) {
            this.field4572 = -1;
        }
        this.field4583 = (int) ((double) this.field4573.field240[this.field4571] * Math.random()) + 1;
        this.field4593 = class9.field141 - this.field4583;
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(III)V")
    private final void method1924(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.field4590 = -99;
        }
        field4576++;
        label92: while (true) {
            if (this.field4573 == null) {
                if (this.field4568) {
                    return;
                }
                this.method1923(-1, (byte) -50);
                if (this.field4573 == null) {
                    return;
                }
            }
            int var4 = class9.field141 - this.field4593;
            if (var4 > 100 && this.field4573.field248 > 0) {
                int var5 = this.field4573.field237.length - this.field4573.field248;
                while (var5 > this.field4571 && var4 > this.field4573.field240[this.field4571]) {
                    var4 -= this.field4573.field240[this.field4571];
                    this.field4571++;
                }
                if (var5 <= this.field4571) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field4573.field237.length; var7++) {
                        var6 += this.field4573.field240[var7];
                    }
                    var4 %= var6;
                }
                this.field4572 = this.field4571 + 1;
                if (this.field4573.field237.length <= this.field4572) {
                    this.field4572 -= this.field4573.field248;
                    if (this.field4572 < 0 || this.field4573.field237.length <= this.field4572) {
                        this.field4572 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var4 <= this.field4573.field240[this.field4571]) {
                            this.field4593 = class9.field141 - var4;
                            this.field4583 = var4;
                            return;
                        }
                        class150.method1022(this.field4573, (byte) 127, this.field4571, arg0, false, arg1);
                        var4 -= this.field4573.field240[this.field4571];
                        this.field4571++;
                        if (this.field4571 >= this.field4573.field237.length) {
                            this.field4571 -= this.field4573.field248;
                            if (this.field4571 < 0 || this.field4571 >= this.field4573.field237.length) {
                                this.field4573 = null;
                                continue label92;
                            }
                        }
                        this.field4572 = this.field4571 + 1;
                    } while (this.field4572 < this.field4573.field237.length);
                    this.field4572 -= this.field4573.field248;
                } while (this.field4572 >= 0 && this.field4573.field237.length > this.field4572);
                this.field4572 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(B)V")
    public static void method1925(byte arg0) {
        field4584 = null;
        field4567 = null;
        int var1 = 6 % ((arg0 + 27) / 63);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIII)V")
    public final void method74(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1924(arg4, arg3, 0);
        field4582++;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BLhi;)V")
    public static final void method1926(byte arg0, class264 arg1) {
        byte[] var2 = new byte[24];
        field4585++;
        if (arg0 <= 53) {
            return;
        }
        if (class101.field1525 != null) {
            try {
                int var3 = 0;
                class101.field1525.method1057((byte) 110, 0L);
                class101.field1525.method1061(var2, true);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method1760(var2, 24, 21015, 0);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIBIIZZ)V")
    public static final void method1927(int arg0, int arg1, byte arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        if (arg2 >= -28) {
            return;
        }
        if (arg0 < arg4) {
            int var7 = (arg0 + arg4) / 2;
            class219 var8 = class106.field1853[var7];
            int var9 = arg0;
            class106.field1853[var7] = class106.field1853[arg4];
            class106.field1853[arg4] = var8;
            for (int var10 = arg0; var10 < arg4; var10++) {
                if (class117.method832(arg1, -65, arg6, class106.field1853[var10], arg3, var8, arg5) <= 0) {
                    class219 var11 = class106.field1853[var10];
                    class106.field1853[var10] = class106.field1853[var9];
                    class106.field1853[var9++] = var11;
                }
            }
            class106.field1853[arg4] = class106.field1853[var9];
            class106.field1853[var9] = var8;
            method1927(arg0, arg1, (byte) -32, arg3, var9 - 1, arg5, arg6);
            method1927(var9 + 1, arg1, (byte) -83, arg3, arg4, arg5, arg6);
        }
        field4570++;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "()I")
    public final int method88() {
        field4569++;
        return this.field4578;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BZ)Lli;")
    private final class197 method1928(byte arg0, boolean arg1) {
        field4581++;
        boolean var3 = class34.field423 != class229.field3641;
        class94 var4 = class119.method842(127, this.field4591);
        if (var4.field1345 != null) {
            var4 = var4.method658(3834);
        }
        if (var4 == null) {
            this.field4574 = -1;
            this.field4577 = this.field4571;
            return null;
        }
        if (!this.field4568 && this.field4574 != var4.field1388) {
            this.method1923(-1, (byte) -50);
        }
        int var5 = this.field4596 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var6 = var4.field1340;
            var7 = var4.field1334;
        } else {
            var6 = var4.field1334;
            var7 = var4.field1340;
        }
        int var8 = this.field4587 + (var6 + 1 >> 1);
        int var9 = (var7 >> 1) + this.field4575;
        int var10 = (var6 >> 1) + this.field4587;
        int var11 = this.field4575 + (var7 + 1 >> 1);
        this.method1924(var9 * 128, var10 * 128, 0);
        boolean var12 = !var3 && var4.field1361 && (this.field4574 != var4.field1388 || (this.field4577 != this.field4571 || this.field4573 != null && (this.field4573.field241 || class51.field712) && this.field4572 != this.field4571) && class96.field1454 >= 2);
        if (arg1 && !var12) {
            this.field4577 = this.field4571;
            this.field4574 = var4.field1388;
            return null;
        }
        int var13 = (this.field4575 << 7) + (var7 << 6);
        int[][] var14 = null;
        if (arg0 > -75) {
            method1922(2);
        }
        int[][] var15 = class229.field3641[this.field4590];
        boolean var16 = this.field4592 == null;
        int var17 = var15[var10][var9] + var15[var8][var11] - (-var15[var8][var9] - var15[var10][var11]) >> 2;
        int var18 = (this.field4587 << 7) + (var6 << 6);
        if (var3) {
            var14 = class34.field423[0];
        } else if (this.field4590 < 3) {
            var14 = class229.field3641[this.field4590 + 1];
        }
        class6 var19;
        if (this.field4573 == null) {
            var19 = var4.method664(var12, this.field4597, false, var18, 0, var14, this.field4596, var13, var17, var15, var16 ? class273.field4412 : this.field4592);
        } else {
            var19 = var4.method667(this.field4571, var13, this.field4597, this.field4573, this.field4583, true, var16 ? class273.field4412 : this.field4592, var18, var14, this.field4596, var12, var17, this.field4572, var15);
        }
        if (var19 == null) {
            this.field4577 = this.field4571;
            this.field4574 = var4.field1388;
            return null;
        } else {
            this.field4574 = var4.field1388;
            this.field4577 = this.field4571;
            return var19.field71;
        }
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(IIIIIIIZLli;)V")
    public class287(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class197 arg8) {
        this.field4587 = arg4;
        this.field4591 = arg0;
        this.field4590 = arg3;
        this.field4597 = arg1;
        this.field4596 = arg2;
        this.field4575 = arg5;
        if (arg8 != null) {
            this.field4568 = true;
            if (arg8 instanceof class287) {
                class287 var10 = (class287) arg8;
                this.field4593 = var10.field4593;
                this.field4573 = var10.field4573;
                this.field4583 = var10.field4583;
                this.field4572 = var10.field4572;
                this.field4571 = var10.field4571;
            }
        }
        if (this.field4568) {
            this.method1923(arg6, (byte) -50);
        }
    }
}
