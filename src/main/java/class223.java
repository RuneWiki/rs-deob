import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class223 {

    @OriginalMember(owner = "client!on", name = "l", descriptor = "Z")
    private boolean field3483 = false;

    @OriginalMember(owner = "client!on", name = "p", descriptor = "I")
    private int field3487 = 32;

    @OriginalMember(owner = "client!on", name = "h", descriptor = "J")
    private long field3479 = class423.method2578(-19698);

    @OriginalMember(owner = "client!on", name = "u", descriptor = "J")
    private long field3492 = 0L;

    @OriginalMember(owner = "client!on", name = "x", descriptor = "[Lsc;")
    private class232[] field3495 = new class232[8];

    @OriginalMember(owner = "client!on", name = "C", descriptor = "J")
    private long field3500 = 0L;

    @OriginalMember(owner = "client!on", name = "B", descriptor = "I")
    private int field3499 = 0;

    @OriginalMember(owner = "client!on", name = "w", descriptor = "I")
    private int field3494 = 0;

    @OriginalMember(owner = "client!on", name = "z", descriptor = "I")
    private int field3497 = 0;

    @OriginalMember(owner = "client!on", name = "y", descriptor = "[Lsc;")
    private class232[] field3496 = new class232[8];

    @OriginalMember(owner = "client!on", name = "E", descriptor = "I")
    private int field3502 = 0;

    @OriginalMember(owner = "client!on", name = "F", descriptor = "Z")
    private boolean field3503 = true;

    @OriginalMember(owner = "client!on", name = "d", descriptor = "Lje;")
    public static class278 field3475 = new class278(4, 1, 1, 1);

    @OriginalMember(owner = "client!on", name = "a", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!on", name = "b", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!on", name = "e", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!on", name = "f", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!on", name = "i", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!on", name = "k", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!on", name = "m", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!on", name = "n", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!on", name = "o", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!on", name = "q", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!on", name = "r", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!on", name = "s", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!on", name = "v", descriptor = "I")
    public int field3493;

    @OriginalMember(owner = "client!on", name = "A", descriptor = "I")
    public int field3498;

    @OriginalMember(owner = "client!on", name = "D", descriptor = "I")
    private int field3501;

    @OriginalMember(owner = "client!on", name = "t", descriptor = "Lsc;")
    private class232 field3491;

    @OriginalMember(owner = "client!on", name = "j", descriptor = "[I")
    public int[] field3481;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "([II)V", line = 4)
    private final void method1483(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class315.field4754) {
            var3 = arg1 << 1;
        }
        class394.method2452(arg0, 0, var3);
        this.field3499 -= arg1;
        if (this.field3491 != null && this.field3499 <= 0) {
            this.field3499 += class200.field3254 >> 4;
            class366.method2247(true, this.field3491);
            this.method1496(this.field3491.method1532(), this.field3491, 75);
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
                        class232 var10 = null;
                        class232 var11 = this.field3496[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class168 var12 = var11.field3592;
                                if (var12 == null || var12.field2741 <= var8) {
                                    var11.field3593 = true;
                                    int var13 = var11.method639();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field2741 += var13;
                                    }
                                    if (var4 >= this.field3487) {
                                        break label107;
                                    }
                                    class232 var14 = var11.method627();
                                    if (var14 != null) {
                                        int var15 = var11.field3591;
                                        while (var14 != null) {
                                            this.method1496(var15 * var14.method1532() >> 8, var14, 118);
                                            var14 = var11.method641();
                                        }
                                    }
                                    class232 var16 = var11.field3590;
                                    var11.field3590 = null;
                                    if (var10 == null) {
                                        this.field3496[var7] = var16;
                                    } else {
                                        var10.field3590 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3495[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3590;
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
                class232 var18 = this.field3496[var17];
                this.field3496[var17] = this.field3495[var17] = null;
                while (var18 != null) {
                    class232 var19 = var18.field3590;
                    var18.field3590 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3499 < 0) {
            this.field3499 = 0;
        }
        if (this.field3491 != null) {
            this.field3491.method618(arg0, 0, arg1);
        }
        this.field3479 = class423.method2578(-19698);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ZI)V", line = 165)
    private final void method1484(boolean arg0, int arg1) {
        field3480++;
        this.field3499 -= arg1;
        if (arg0) {
            this.field3496 = null;
        }
        if (this.field3499 < 0) {
            this.field3499 = 0;
        }
        if (this.field3491 != null) {
            this.field3491.method648(arg1);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lza;Z)V", line = 184)
    public static final void method1485(class288 arg0, boolean arg1) {
        if (class76.field1543) {
            class329.method2079((byte) -108, arg0);
        } else {
            class408.method2531(arg0, true);
        }
        if (arg1) {
            method1485(null, false);
        }
        field3482++;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(B)V", line = 199)
    public final synchronized void method1486(byte arg0) {
        field3472++;
        if (class466.field6929 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class466.field6929.field7322[var3] == this) {
                    class466.field6929.field7322[var3] = null;
                }
                if (class466.field6929.field7322[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class466.field6929.field7318 = true;
                while (class466.field6929.field7320) {
                    class50.method470(50L, -5);
                }
                class466.field6929 = null;
            }
        }
        this.method1487();
        if (arg0 < -54) {
            this.field3483 = true;
            this.field3481 = null;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "()V", line = 244)
    public void method1487() {
        field3489++;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 259)
    public void method1488(Component arg0) throws Exception {
        field3484++;
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "()V", line = 269)
    public void method1489() throws Exception {
        field3490++;
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "()I", line = 276)
    public int method1490() throws Exception {
        field3485++;
        return this.field3493;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ILsc;)V", line = 293)
    public final synchronized void method1491(int arg0, class232 arg1) {
        field3477++;
        this.field3491 = arg1;
        if (arg0 != 4423) {
            this.method1493(false);
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(B)V", line = 304)
    public final synchronized void method1492(byte arg0) {
        field3478++;
        if (this.field3483) {
            return;
        }
        long var2 = class423.method2578(-19698);
        try {
            if (var2 > (this.field3479 + 500000L)) {
                this.field3479 = var2 - 500000L;
            }
            while (this.field3479 + 5000L < var2) {
                this.method1484(false, 256);
                this.field3479 += (256000 / class200.field3254);
            }
        } catch (Exception var7) {
            this.field3479 = var2;
        }
        if (this.field3481 == null) {
            return;
        }
        try {
            if (this.field3492 != 0L) {
                if (var2 < this.field3492) {
                    return;
                }
                this.method1497(this.field3493);
                this.field3492 = 0L;
                this.field3503 = true;
            }
            if (arg0 != -10) {
                this.field3491 = null;
            }
            int var4 = this.method1490();
            if (this.field3494 < (this.field3502 - var4)) {
                this.field3494 = this.field3502 - var4;
            }
            int var5 = this.field3501 + this.field3498;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field3493) {
                this.field3493 += 1024;
                if (this.field3493 > 16384) {
                    this.field3493 = 16384;
                }
                this.method1487();
                this.method1497(this.field3493);
                var4 = 0;
                this.field3503 = true;
                if (var5 + 256 > this.field3493) {
                    var5 = this.field3493 - 256;
                    this.field3501 = var5 - this.field3498;
                }
            }
            while (var4 < var5) {
                this.method1483(this.field3481, 256);
                this.method1495();
                var4 += 256;
            }
            if (this.field3500 < var2) {
                if (this.field3503) {
                    this.field3503 = false;
                } else if (this.field3494 == 0 && this.field3497 == 0) {
                    this.method1487();
                    this.field3492 = var2 + 2000L;
                    return;
                } else {
                    this.field3501 = Math.min(this.field3497, this.field3494);
                    this.field3497 = this.field3494;
                }
                this.field3494 = 0;
                this.field3500 = var2 + 2000L;
            }
            this.field3502 = var4;
        } catch (Exception var6) {
            this.method1487();
            this.field3492 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)V", line = 426)
    public final synchronized void method1493(boolean arg0) {
        this.field3503 = arg0;
        field3488++;
        try {
            this.method1489();
        } catch (Exception var2) {
            this.method1487();
            this.field3492 = class423.method2578(-19698) + 2000L;
        }
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(B)V", line = 442)
    public final void method1494(byte arg0) {
        if (arg0 == 85) {
            field3474++;
            this.field3503 = true;
        }
    }

    @OriginalMember(owner = "client!on", name = "d", descriptor = "()V", line = 456)
    public void method1495() throws Exception {
        field3473++;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ILsc;I)V", line = 463)
    private final void method1496(int arg0, class232 arg1, int arg2) {
        field3476++;
        int var4 = arg0 >> 5;
        if (arg2 < 60) {
            method1485(null, false);
        }
        class232 var5 = this.field3495[var4];
        if (var5 == null) {
            this.field3496[var4] = arg1;
        } else {
            var5.field3590 = arg1;
        }
        this.field3495[var4] = arg1;
        arg1.field3591 = arg0;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V", line = 488)
    public void method1497(int arg0) throws Exception {
        field3486++;
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(I)V", line = 506)
    public static void method1498(int arg0) {
        if (arg0 == 0) {
            field3475 = null;
        }
    }
}
