import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class248 {

    @OriginalMember(owner = "client!gaa", name = "m", descriptor = "I")
    private int field3567 = 32;

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "Z")
    private boolean field3556 = false;

    @OriginalMember(owner = "client!gaa", name = "r", descriptor = "J")
    private long field3572 = class598.method3538(true);

    @OriginalMember(owner = "client!gaa", name = "t", descriptor = "J")
    private long field3574 = 0L;

    @OriginalMember(owner = "client!gaa", name = "x", descriptor = "Z")
    private boolean field3578 = true;

    @OriginalMember(owner = "client!gaa", name = "u", descriptor = "I")
    private int field3575 = 0;

    @OriginalMember(owner = "client!gaa", name = "B", descriptor = "I")
    private int field3582 = 0;

    @OriginalMember(owner = "client!gaa", name = "A", descriptor = "I")
    private int field3581 = 0;

    @OriginalMember(owner = "client!gaa", name = "E", descriptor = "[Lkca;")
    private class73[] field3585 = new class73[8];

    @OriginalMember(owner = "client!gaa", name = "D", descriptor = "I")
    private int field3584 = 0;

    @OriginalMember(owner = "client!gaa", name = "C", descriptor = "J")
    private long field3583 = 0L;

    @OriginalMember(owner = "client!gaa", name = "w", descriptor = "[Lkca;")
    private class73[] field3577 = new class73[8];

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!gaa", name = "c", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!gaa", name = "e", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!gaa", name = "f", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!gaa", name = "g", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!gaa", name = "h", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!gaa", name = "j", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!gaa", name = "l", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!gaa", name = "n", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!gaa", name = "o", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!gaa", name = "q", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!gaa", name = "s", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!gaa", name = "v", descriptor = "I")
    private int field3576;

    @OriginalMember(owner = "client!gaa", name = "y", descriptor = "I")
    public int field3579;

    @OriginalMember(owner = "client!gaa", name = "z", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!gaa", name = "F", descriptor = "I")
    public int field3586;

    @OriginalMember(owner = "client!gaa", name = "p", descriptor = "Lkda;")
    public static class328 field3570;

    @OriginalMember(owner = "client!gaa", name = "i", descriptor = "Lkca;")
    private class73 field3563;

    @OriginalMember(owner = "client!gaa", name = "k", descriptor = "[I")
    public int[] field3565;

    @OriginalMember(owner = "client!gaa", name = "d", descriptor = "[Lha;")
    public static class53[] field3558;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I)V", line = 3)
    public final synchronized void method1566(int arg0) {
        field3580++;
        if (class101.field1468 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class101.field1468.field1078[var3] == this) {
                    class101.field1468.field1078[var3] = null;
                }
                if (class101.field1468.field1078[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class101.field1468.field1074 = true;
                while (class101.field1468.field1073) {
                    class236.method1513(true, 50L);
                }
                class101.field1468 = null;
            }
        }
        this.method1578();
        this.field3565 = null;
        this.field3556 = true;
        if (arg0 != -2341) {
            this.field3574 = -26L;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "()V", line = 49)
    public void method1567() throws Exception {
        field3566++;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(II)V", line = 56)
    private final void method1568(int arg0, int arg1) {
        this.field3575 -= arg0;
        field3562++;
        if (this.field3575 < arg1) {
            this.field3575 = 0;
        }
        if (this.field3563 != null) {
            this.field3563.method263(arg0);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "(I)V", line = 71)
    public final synchronized void method1569(int arg0) {
        if (arg0 != 256000) {
            this.field3572 = -112L;
        }
        field3555++;
        this.field3578 = true;
        try {
            this.method1576();
        } catch (Exception var2) {
            this.method1578();
            this.field3583 = class598.method3538(true) + 2000L;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lkca;B)V", line = 91)
    public final synchronized void method1570(class73 arg0, byte arg1) {
        field3564++;
        if (arg1 < 21) {
            this.method1568(111, -126);
        }
        this.field3563 = arg0;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lkca;II)V", line = 102)
    private final void method1571(class73 arg0, int arg1, int arg2) {
        field3561++;
        int var4 = arg2 >> 5;
        class73 var5 = this.field3585[var4];
        if (arg1 != 602771077) {
            this.field3585 = null;
        }
        if (var5 == null) {
            this.field3577[var4] = arg0;
        } else {
            var5.field999 = arg0;
        }
        this.field3585[var4] = arg0;
        arg0.field997 = arg2;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Z)V", line = 125)
    public static final void method1572(boolean arg0) {
        if (arg0) {
            field3568++;
            class46.field549.method837(127);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 138)
    public void method1573(Component arg0) throws Exception {
        field3569++;
    }

    @OriginalMember(owner = "client!gaa", name = "c", descriptor = "(I)V", line = 159)
    public void method1574(int arg0) throws Exception {
        field3559++;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "([II)V", line = 168)
    private final void method1575(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class103.field1505) {
            var3 = arg1 << 1;
        }
        class648.method3735(arg0, 0, var3);
        this.field3575 -= arg1;
        if (this.field3563 != null && this.field3575 <= 0) {
            this.field3575 += class270.field3834 >> 4;
            class143.method975(this.field3563, -82);
            this.method1571(this.field3563, 602771077, this.field3563.method586());
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
                        class73 var10 = null;
                        class73 var11 = this.field3577[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class612 var12 = var11.field998;
                                if (var12 == null || var12.field9067 <= var8) {
                                    var11.field996 = true;
                                    int var13 = var11.method265();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field9067 += var13;
                                    }
                                    if (var4 >= this.field3567) {
                                        break label107;
                                    }
                                    class73 var14 = var11.method256();
                                    if (var14 != null) {
                                        int var15 = var11.field997;
                                        while (var14 != null) {
                                            this.method1571(var14, 602771077, var15 * var14.method586() >> 8);
                                            var14 = var11.method257();
                                        }
                                    }
                                    class73 var16 = var11.field999;
                                    var11.field999 = null;
                                    if (var10 == null) {
                                        this.field3577[var7] = var16;
                                    } else {
                                        var10.field999 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3585[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field999;
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
                class73 var18 = this.field3577[var17];
                this.field3577[var17] = this.field3585[var17] = null;
                while (var18 != null) {
                    class73 var19 = var18.field999;
                    var18.field999 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3575 < 0) {
            this.field3575 = 0;
        }
        if (this.field3563 != null) {
            this.field3563.method262(arg0, 0, arg1);
        }
        this.field3572 = class598.method3538(true);
    }

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "()V", line = 326)
    public void method1576() throws Exception {
        field3571++;
    }

    @OriginalMember(owner = "client!gaa", name = "d", descriptor = "(I)V", line = 333)
    public static void method1577(int arg0) {
        field3570 = null;
        if (arg0 != 0) {
            field3570 = null;
        }
        field3558 = null;
    }

    @OriginalMember(owner = "client!gaa", name = "c", descriptor = "()V", line = 344)
    public void method1578() {
        field3557++;
    }

    @OriginalMember(owner = "client!gaa", name = "d", descriptor = "()I", line = 351)
    public int method1579() throws Exception {
        field3573++;
        return this.field3579;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(B)V", line = 359)
    public final synchronized void method1580(byte arg0) {
        field3560++;
        if (this.field3556) {
            return;
        }
        long var2 = class598.method3538(true);
        try {
            if (this.field3572 + 500000L < var2) {
                this.field3572 = var2 - 500000L;
            }
            while (this.field3572 + 5000L < var2) {
                this.method1568(256, arg0 ^ 0x48);
                this.field3572 += (256000 / class270.field3834);
            }
        } catch (Exception var7) {
            this.field3572 = var2;
        }
        if (this.field3565 == null) {
            return;
        }
        try {
            if (this.field3583 != 0L) {
                if (this.field3583 > var2) {
                    return;
                }
                this.method1574(this.field3579);
                this.field3583 = 0L;
                this.field3578 = true;
            }
            int var4 = this.method1579();
            if (this.field3582 - var4 > this.field3581) {
                this.field3581 = this.field3582 - var4;
            }
            if (arg0 != 72) {
                this.method1566(-70);
            }
            int var5 = this.field3586 + this.field3576;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (this.field3579 < var5 + 256) {
                this.field3579 += 1024;
                if (this.field3579 > 16384) {
                    this.field3579 = 16384;
                }
                this.method1578();
                var4 = 0;
                this.method1574(this.field3579);
                if (var5 + 256 > this.field3579) {
                    var5 = this.field3579 - 256;
                    this.field3576 = var5 - this.field3586;
                }
                this.field3578 = true;
            }
            while (var5 > var4) {
                this.method1575(this.field3565, 256);
                this.method1567();
                var4 += 256;
            }
            if (var2 > this.field3574) {
                if (this.field3578) {
                    this.field3578 = false;
                } else if (this.field3581 == 0 && this.field3584 == 0) {
                    this.method1578();
                    this.field3583 = var2 + 2000L;
                    return;
                } else {
                    this.field3576 = Math.min(this.field3584, this.field3581);
                    this.field3584 = this.field3581;
                }
                this.field3581 = 0;
                this.field3574 = var2 + 2000L;
            }
            this.field3582 = var4;
        } catch (Exception var6) {
            this.method1578();
            this.field3583 = var2 + 2000L;
        }
    }
}
