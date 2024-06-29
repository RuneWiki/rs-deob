import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class176 {

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    private int field3546 = 32;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "J")
    private long field3532 = class155.method994(102);

    @OriginalMember(owner = "client!ta", name = "y", descriptor = "Z")
    private boolean field3553 = true;

    @OriginalMember(owner = "client!ta", name = "A", descriptor = "I")
    private int field3555 = 0;

    @OriginalMember(owner = "client!ta", name = "B", descriptor = "J")
    private long field3556 = 0L;

    @OriginalMember(owner = "client!ta", name = "F", descriptor = "[Lqh;")
    private class156[] field3560 = new class156[8];

    @OriginalMember(owner = "client!ta", name = "E", descriptor = "I")
    private int field3559 = 0;

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "J")
    private long field3554 = 0L;

    @OriginalMember(owner = "client!ta", name = "G", descriptor = "I")
    private int field3561 = 0;

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "[Lqh;")
    private class156[] field3562 = new class156[8];

    @OriginalMember(owner = "client!ta", name = "D", descriptor = "I")
    private int field3558 = 0;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "Lrf;")
    public static class163 field3541 = class53.method392(-54, "(U(Y");

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "Lrf;")
    private static class163 field3548 = class53.method392(87, "Could not complete login)3");

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "Lrf;")
    public static class163 field3545 = field3548;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    public static int field3542 = 0;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!ta", name = "C", descriptor = "I")
    public int field3557;

    @OriginalMember(owner = "client!ta", name = "I", descriptor = "I")
    public int field3563;

    @OriginalMember(owner = "client!ta", name = "J", descriptor = "I")
    private int field3564;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "Lqh;")
    private class156 field3539;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "[I")
    public int[] field3529;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "[Lwd;")
    public static class206[] field3540;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
    public final synchronized void method1190(int arg0) {
        if (class72.field1503 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class72.field1503.field627[var3] == this) {
                    class72.field1503.field627[var3] = null;
                }
                if (class72.field1503.field627[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class72.field1503.field619 = true;
                while (class72.field1503.field629) {
                    class25.method151(50L, (byte) 0);
                }
                class72.field1503 = null;
            }
        }
        field3536++;
        if (arg0 != 0) {
            this.method1190(-72);
        }
        this.method24();
        this.field3529 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "()V")
    public void method23() throws Exception {
        field3537++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)V")
    private final void method1191(int arg0, int arg1) {
        this.field3561 -= arg1;
        field3544++;
        if (arg0 < ~this.field3561) {
            this.field3561 = 0;
        }
        if (this.field3539 != null) {
            this.field3539.method283(arg1);
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
    public static final void method1192(int arg0) {
        class52.field1043.method399(false);
        class81.field1644.method399(false);
        field3551++;
        if (arg0 != 2) {
            field3540 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILqh;I)V")
    private final void method1193(int arg0, class156 arg1, int arg2) {
        int var4 = arg0 >> 5;
        class156 var5 = this.field3562[var4];
        if (var5 == null) {
            this.field3560[var4] = arg1;
        } else {
            var5.field3221 = arg1;
        }
        this.field3562[var4] = arg1;
        arg1.field3219 = arg0;
        field3549++;
        if (arg2 != 0) {
            method1192(118);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V")
    public final void method1194(boolean arg0) {
        this.field3553 = arg0;
        field3535++;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "()V")
    public void method24() {
        field3531++;
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)V")
    public final synchronized void method1195(int arg0) {
        this.field3553 = true;
        field3543++;
        try {
            if (arg0 < -33) {
                this.method23();
            }
        } catch (Exception var2) {
            this.method24();
            this.field3554 = class155.method994(97) + 2000L;
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(Z)V")
    public final synchronized void method1196(boolean arg0) {
        field3552++;
        if (this.field3529 == null) {
            return;
        }
        long var2 = class155.method994(124);
        try {
            if (this.field3554 != 0L) {
                if (var2 < this.field3554) {
                    return;
                }
                this.method19(this.field3557);
                this.field3554 = 0L;
                this.field3553 = true;
            }
            if (arg0) {
                return;
            }
            int var4 = this.method20();
            if (this.field3559 - var4 > this.field3558) {
                this.field3558 = this.field3559 - var4;
            }
            int var5 = this.field3564 + this.field3563;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field3557) {
                this.field3557 += 1024;
                if (this.field3557 > 16384) {
                    this.field3557 = 16384;
                }
                this.method24();
                var4 = 0;
                this.method19(this.field3557);
                this.field3553 = true;
                if (this.field3557 < var5 + 256) {
                    var5 = this.field3557 - 256;
                    this.field3564 = var5 - this.field3563;
                }
            }
            while (var5 > var4) {
                var4 += 256;
                this.method1199(this.field3529, 256);
                this.method21();
            }
            if (this.field3556 < var2) {
                if (this.field3553) {
                    this.field3553 = false;
                } else if (this.field3558 == 0 && this.field3555 == 0) {
                    this.method24();
                    this.field3554 = var2 + 2000L;
                    return;
                } else {
                    this.field3564 = Math.min(this.field3555, this.field3558);
                    this.field3555 = this.field3558;
                }
                this.field3558 = 0;
                this.field3556 = var2 + 2000L;
            }
            this.field3559 = var4;
        } catch (Exception var7) {
            this.method24();
            this.field3554 = var2 + 2000L;
        }
        try {
            if (this.field3532 + 500000L < var2) {
                var2 = this.field3532;
            }
            while (var2 > this.field3532 + 5000L) {
                this.method1191(-1, 256);
                this.field3532 += 256000 / class188.field3736;
            }
        } catch (Exception var6) {
            this.field3532 = var2;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lqh;I)V")
    public final synchronized void method1197(class156 arg0, int arg1) {
        if (arg1 != 256000) {
            this.method1193(85, null, -88);
        }
        this.field3539 = arg0;
        field3547++;
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "()I")
    public int method20() throws Exception {
        field3530++;
        return this.field3557;
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V")
    public void method19(int arg0) throws Exception {
        field3550++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
    public static void method1198(byte arg0) {
        if (arg0 > -85) {
            field3548 = null;
        }
        field3548 = null;
        field3540 = null;
        field3545 = null;
        field3541 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method22(Component arg0) throws Exception {
        field3533++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([II)V")
    private final void method1199(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class10.field195) {
            var3 = arg1 << 1;
        }
        class123.method829(arg0, 0, var3);
        this.field3561 -= arg1;
        if (this.field3539 != null && this.field3561 <= 0) {
            this.field3561 += class188.field3736 >> 4;
            class112.method774((byte) 66, this.field3539);
            this.method1193(this.field3539.method998(), this.field3539, 0);
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
                        class156 var10 = null;
                        class156 var11 = this.field3560[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class157 var12 = var11.field3220;
                                if (var12 == null || var12.field3222 <= var8) {
                                    var11.field3218 = true;
                                    int var13 = var11.method284();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3222 += var13;
                                    }
                                    if (var4 >= this.field3546) {
                                        break label107;
                                    }
                                    class156 var14 = var11.method276();
                                    if (var14 != null) {
                                        int var15 = var11.field3219;
                                        while (var14 != null) {
                                            this.method1193(var15 * var14.method998() >> 8, var14, 0);
                                            var14 = var11.method278();
                                        }
                                    }
                                    class156 var16 = var11.field3221;
                                    var11.field3221 = null;
                                    if (var10 == null) {
                                        this.field3560[var7] = var16;
                                    } else {
                                        var10.field3221 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3562[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3221;
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
                class156 var18 = this.field3560[var17];
                this.field3560[var17] = this.field3562[var17] = null;
                while (var18 != null) {
                    class156 var19 = var18.field3221;
                    var18.field3221 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3561 < 0) {
            this.field3561 = 0;
        }
        if (this.field3539 != null) {
            this.field3539.method277(arg0, 0, arg1);
        }
        this.field3532 = class155.method994(80);
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "()V")
    public void method21() throws Exception {
        field3538++;
    }
}
