import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class184 {

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
    private int field3586 = 32;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "J")
    private long field3580 = class116.method712((byte) -70);

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
    private int field3591 = 0;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    private int field3592 = 0;

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "[Lig;")
    private class79[] field3596 = new class79[8];

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "Z")
    private boolean field3589 = true;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
    private int field3602 = 0;

    @OriginalMember(owner = "client!ud", name = "F", descriptor = "J")
    private long field3605 = 0L;

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "[Lig;")
    private class79[] field3606 = new class79[8];

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "J")
    private long field3599 = 0L;

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "I")
    private int field3603 = 0;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field3574 = 0;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field3578 = 0;

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "Lsg;")
    public static class169 field3597 = class165.method1060(" )2>", 1536);

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
    private int field3590;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
    public int field3595;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "I")
    public int field3598;

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "Lig;")
    private class79 field3579;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "[I")
    public int[] field3585;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "()V")
    public void method230() {
        field3577++;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lig;II)V")
    private final void method1216(class79 arg0, int arg1, int arg2) {
        int var4 = arg1 >> 5;
        if (arg2 != 0) {
            this.method1216(null, 14, 72);
        }
        class79 var5 = this.field3596[var4];
        field3581++;
        if (var5 == null) {
            this.field3606[var4] = arg0;
        } else {
            var5.field1466 = arg0;
        }
        this.field3596[var4] = arg0;
        arg0.field1469 = arg1;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZII)I")
    public static final int method1217(boolean arg0, int arg1, int arg2) {
        field3584++;
        if (arg0) {
            int var3 = arg1 * 57 + arg2;
            int var4 = var3 ^ var3 << 13;
            int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
            return var5 >> 19 & 0xFF;
        } else {
            return -43;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public void method229(int arg0) throws Exception {
        field3587++;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
    public final synchronized void method1218(int arg0) {
        field3575++;
        if (this.field3585 == null) {
            return;
        }
        long var2 = class116.method712((byte) -109);
        try {
            if (this.field3605 != 0L) {
                if (var2 < this.field3605) {
                    return;
                }
                this.method229(this.field3598);
                this.field3589 = true;
                this.field3605 = 0L;
            }
            int var4 = this.method227();
            if (this.field3592 < this.field3603 - var4) {
                this.field3592 = this.field3603 - var4;
            }
            int var5 = this.field3595 + this.field3590;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field3598 < var5 + 256) {
                var4 = 0;
                this.field3598 += 1024;
                if (this.field3598 > 16384) {
                    this.field3598 = 16384;
                }
                this.method230();
                this.method229(this.field3598);
                this.field3589 = true;
                if (this.field3598 < var5 + 256) {
                    var5 = this.field3598 - 256;
                    this.field3590 = var5 - this.field3595;
                }
            }
            while (var4 < var5) {
                this.method1223(this.field3585, 256);
                this.method233();
                var4 += 256;
            }
            if (this.field3599 < var2) {
                if (this.field3589) {
                    this.field3589 = false;
                } else if (this.field3592 == 0 && this.field3591 == 0) {
                    this.method230();
                    this.field3605 = var2 + 2000L;
                    return;
                } else {
                    this.field3590 = Math.min(this.field3591, this.field3592);
                    this.field3591 = this.field3592;
                }
                this.field3599 = var2 + 2000L;
                this.field3592 = 0;
            }
            this.field3603 = var4;
        } catch (Exception var7) {
            this.method230();
            this.field3605 = var2 + 2000L;
        }
        try {
            if (var2 > this.field3580 + 500000L) {
                var2 = this.field3580;
            }
            if (arg0 == -25666) {
                while (this.field3580 + 5000L < var2) {
                    this.method1219(256, (byte) -49);
                    this.field3580 += 256000 / class70.field1313;
                }
            }
        } catch (Exception var6) {
            this.field3580 = var2;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)V")
    private final void method1219(int arg0, byte arg1) {
        this.field3602 -= arg0;
        int var3 = 4 / ((arg1 - 25) / 50);
        if (this.field3602 < 0) {
            this.field3602 = 0;
        }
        if (this.field3579 != null) {
            this.field3579.method485(arg0);
        }
        field3604++;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
    public final synchronized void method1220(int arg0) {
        if (class199.field3893 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class199.field3893.field541[var3] == this) {
                    class199.field3893.field541[var3] = null;
                }
                if (class199.field3893.field541[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class199.field3893.field538 = true;
                while (class199.field3893.field534) {
                    client.method203(50L, (byte) -86);
                }
                class199.field3893 = null;
            }
        }
        if (arg0 <= 16) {
            field3574 = -94;
        }
        field3588++;
        this.method230();
        this.field3585 = null;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "()I")
    public int method227() throws Exception {
        field3594++;
        return this.field3598;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "()V")
    public void method228() throws Exception {
        field3583++;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
    public final synchronized void method1221(byte arg0) {
        if (arg0 != 123) {
            return;
        }
        field3576++;
        this.field3589 = true;
        try {
            this.method228();
        } catch (Exception var2) {
            this.method230();
            this.field3605 = class116.method712((byte) -94) + 2000L;
        }
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)V")
    public static void method1222(int arg0) {
        field3597 = null;
        if (arg0 > -62) {
            field3597 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method231(Component arg0) throws Exception {
        field3582++;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "([II)V")
    private final void method1223(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class51.field931) {
            var3 = arg1 << 1;
        }
        class97.method582(arg0, 0, var3);
        this.field3602 -= arg1;
        if (this.field3579 != null && this.field3602 <= 0) {
            this.field3602 += class70.field1313 >> 4;
            class77.method470(0, this.field3579);
            this.method1216(this.field3579, this.field3579.method483(), 0);
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
                        class79 var10 = null;
                        class79 var11 = this.field3606[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class36 var12 = var11.field1468;
                                if (var12 == null || var12.field712 <= var8) {
                                    var11.field1467 = true;
                                    int var13 = var11.method486();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field712 += var13;
                                    }
                                    if (var4 >= this.field3586) {
                                        break label107;
                                    }
                                    class79 var14 = var11.method480();
                                    if (var14 != null) {
                                        int var15 = var11.field1469;
                                        while (var14 != null) {
                                            this.method1216(var14, var15 * var14.method483() >> 8, 0);
                                            var14 = var11.method481();
                                        }
                                    }
                                    class79 var16 = var11.field1466;
                                    var11.field1466 = null;
                                    if (var10 == null) {
                                        this.field3606[var7] = var16;
                                    } else {
                                        var10.field1466 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3596[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1466;
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
                class79 var18 = this.field3606[var17];
                this.field3606[var17] = this.field3596[var17] = null;
                while (var18 != null) {
                    class79 var19 = var18.field1466;
                    var18.field1466 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3602 < 0) {
            this.field3602 = 0;
        }
        if (this.field3579 != null) {
            this.field3579.method482(arg0, 0, arg1);
        }
        this.field3580 = class116.method712((byte) -80);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lig;I)V")
    public final synchronized void method1224(class79 arg0, int arg1) {
        this.field3579 = arg0;
        field3600++;
        if (arg1 > -32) {
            this.method1224(null, 86);
        }
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "()V")
    public void method233() throws Exception {
        field3601++;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V")
    public final void method1225(boolean arg0) {
        this.field3589 = arg0;
        field3593++;
    }
}
