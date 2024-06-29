import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public class class531 {

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "Z")
    private boolean field7353 = false;

    @OriginalMember(owner = "client!efa", name = "q", descriptor = "I")
    private int field7368 = 32;

    @OriginalMember(owner = "client!efa", name = "s", descriptor = "J")
    private long field7370 = class97.method664((byte) -50);

    @OriginalMember(owner = "client!efa", name = "v", descriptor = "J")
    private long field7373 = 0L;

    @OriginalMember(owner = "client!efa", name = "t", descriptor = "I")
    private int field7371 = 0;

    @OriginalMember(owner = "client!efa", name = "x", descriptor = "I")
    private int field7375 = 0;

    @OriginalMember(owner = "client!efa", name = "A", descriptor = "[Lco;")
    private class725[] field7378 = new class725[8];

    @OriginalMember(owner = "client!efa", name = "B", descriptor = "[Lco;")
    private class725[] field7379 = new class725[8];

    @OriginalMember(owner = "client!efa", name = "D", descriptor = "J")
    private long field7381 = 0L;

    @OriginalMember(owner = "client!efa", name = "E", descriptor = "Z")
    private boolean field7382 = true;

    @OriginalMember(owner = "client!efa", name = "z", descriptor = "I")
    private int field7377 = 0;

    @OriginalMember(owner = "client!efa", name = "y", descriptor = "I")
    private int field7376 = 0;

    @OriginalMember(owner = "client!efa", name = "f", descriptor = "I")
    public static int field7357 = 0;

    @OriginalMember(owner = "client!efa", name = "r", descriptor = "[Z")
    public static boolean[] field7369 = new boolean[100];

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "I")
    public static int field7352;

    @OriginalMember(owner = "client!efa", name = "c", descriptor = "I")
    public static int field7354;

    @OriginalMember(owner = "client!efa", name = "d", descriptor = "I")
    public static int field7355;

    @OriginalMember(owner = "client!efa", name = "e", descriptor = "I")
    public static int field7356;

    @OriginalMember(owner = "client!efa", name = "h", descriptor = "I")
    public static int field7359;

    @OriginalMember(owner = "client!efa", name = "j", descriptor = "I")
    public static int field7361;

    @OriginalMember(owner = "client!efa", name = "l", descriptor = "I")
    public static int field7363;

    @OriginalMember(owner = "client!efa", name = "m", descriptor = "I")
    public static int field7364;

    @OriginalMember(owner = "client!efa", name = "n", descriptor = "I")
    public static int field7365;

    @OriginalMember(owner = "client!efa", name = "o", descriptor = "I")
    public static int field7366;

    @OriginalMember(owner = "client!efa", name = "p", descriptor = "I")
    public static int field7367;

    @OriginalMember(owner = "client!efa", name = "u", descriptor = "I")
    public static int field7372;

    @OriginalMember(owner = "client!efa", name = "w", descriptor = "I")
    public int field7374;

    @OriginalMember(owner = "client!efa", name = "C", descriptor = "I")
    private int field7380;

    @OriginalMember(owner = "client!efa", name = "F", descriptor = "I")
    public int field7383;

    @OriginalMember(owner = "client!efa", name = "g", descriptor = "Lco;")
    private class725 field7358;

    @OriginalMember(owner = "client!efa", name = "k", descriptor = "Ljava/lang/Object;")
    public static Object field7362;

    @OriginalMember(owner = "client!efa", name = "i", descriptor = "[I")
    public int[] field7360;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(B)V", line = 9)
    public final synchronized void method3150(byte arg0) {
        field7372++;
        if (this.field7353) {
            return;
        }
        long var2 = class97.method664((byte) -50);
        try {
            if ((this.field7370 + 6000L) < var2) {
                this.field7370 = var2 - 6000L;
            }
            while (this.field7370 + 5000L < var2) {
                this.method3151(256, (byte) 122);
                this.field7370 += (256000 / class718.field9998);
                var2 = class97.method664((byte) -50);
            }
        } catch (Exception var7) {
            this.field7370 = var2;
        }
        if (this.field7360 == null) {
            return;
        }
        try {
            if (this.field7381 != 0L) {
                if (var2 < this.field7381) {
                    return;
                }
                this.method195(this.field7383);
                this.field7382 = true;
                this.field7381 = 0L;
            }
            if (arg0 < 75) {
                this.field7382 = true;
            }
            int var4 = this.method198();
            if (this.field7377 < (this.field7376 - var4)) {
                this.field7377 = this.field7376 - var4;
            }
            int var5 = this.field7380 + this.field7374;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (this.field7383 < (var5 + 256)) {
                this.field7383 += 1024;
                if (this.field7383 > 16384) {
                    this.field7383 = 16384;
                }
                this.method196();
                var4 = 0;
                this.method195(this.field7383);
                if (var5 + 256 > this.field7383) {
                    var5 = this.field7383 - 256;
                    this.field7380 = var5 - this.field7374;
                }
                this.field7382 = true;
            }
            while (var4 < var5) {
                this.method3155(this.field7360, 256);
                this.method194();
                var4 += 256;
            }
            if (var2 > this.field7373) {
                if (this.field7382) {
                    this.field7382 = false;
                } else if (this.field7377 == 0 && this.field7375 == 0) {
                    this.method196();
                    this.field7381 = var2 + 2000L;
                    return;
                } else {
                    this.field7380 = Math.min(this.field7375, this.field7377);
                    this.field7375 = this.field7377;
                }
                this.field7377 = 0;
                this.field7373 = var2 + 2000L;
            }
            this.field7376 = var4;
        } catch (Exception var6) {
            this.method196();
            this.field7381 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(IB)V", line = 128)
    private final void method3151(int arg0, byte arg1) {
        this.field7371 -= arg0;
        field7352++;
        if (this.field7371 < 0) {
            this.field7371 = 0;
        }
        if (this.field7358 != null) {
            this.field7358.method366(arg0);
        }
        if (arg1 < 99) {
            this.field7375 = -75;
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(ILco;I)V", line = 147)
    private final void method3152(int arg0, class725 arg1, int arg2) {
        field7361++;
        int var4 = arg0 >> 5;
        class725 var5 = this.field7379[var4];
        if (var5 == null) {
            this.field7378[var4] = arg1;
        } else {
            var5.field10052 = arg1;
        }
        this.field7379[var4] = arg1;
        int var6 = -43 % ((-arg2 - 46) / 57);
        arg1.field10054 = arg0;
    }

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "(B)V", line = 167)
    public final synchronized void method3153(byte arg0) {
        if (class115.field1532 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class115.field1532.field4359[var3] == this) {
                    class115.field1532.field4359[var3] = null;
                }
                if (class115.field1532.field4359[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class115.field1532.field4360 = true;
                while (class115.field1532.field4361) {
                    class688.method3874(50L, -7375);
                }
                class115.field1532 = null;
            }
        }
        field7367++;
        this.method196();
        this.field7353 = true;
        this.field7360 = null;
        if (arg0 <= 33) {
            this.field7376 = 96;
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "()V", line = 214)
    public void method194() throws Exception {
        field7366++;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(I)V", line = 225)
    public void method195(int arg0) throws Exception {
        field7355++;
    }

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "()V", line = 237)
    public void method196() {
        field7364++;
    }

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "(I)V", line = 248)
    public static void method3154(int arg0) {
        field7362 = null;
        field7369 = null;
        if (arg0 != -3991) {
            field7357 = -29;
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "([II)V", line = 261)
    private final void method3155(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class644.field8627) {
            var3 = arg1 << 1;
        }
        class245.method1650(arg0, 0, var3);
        this.field7371 -= arg1;
        if (this.field7358 != null && this.field7371 <= 0) {
            this.field7371 += class718.field9998 >> 4;
            class379.method2377(this.field7358, 0);
            this.method3152(this.field7358.method4049(), this.field7358, -124);
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
                        class725 var10 = null;
                        class725 var11 = this.field7378[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class640 var12 = var11.field10053;
                                if (var12 == null || var12.field8574 <= var8) {
                                    var11.field10051 = true;
                                    int var13 = var11.method355();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field8574 += var13;
                                    }
                                    if (var4 >= this.field7368) {
                                        break label107;
                                    }
                                    class725 var14 = var11.method358();
                                    if (var14 != null) {
                                        int var15 = var11.field10054;
                                        while (var14 != null) {
                                            this.method3152(var15 * var14.method4049() >> 8, var14, 121);
                                            var14 = var11.method357();
                                        }
                                    }
                                    class725 var16 = var11.field10052;
                                    var11.field10052 = null;
                                    if (var10 == null) {
                                        this.field7378[var7] = var16;
                                    } else {
                                        var10.field10052 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field7379[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field10052;
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
                class725 var18 = this.field7378[var17];
                this.field7378[var17] = this.field7379[var17] = null;
                while (var18 != null) {
                    class725 var19 = var18.field10052;
                    var18.field10052 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field7371 < 0) {
            this.field7371 = 0;
        }
        if (this.field7358 != null) {
            this.field7358.method360(arg0, 0, arg1);
        }
        this.field7370 = class97.method664((byte) -50);
    }

    @OriginalMember(owner = "client!efa", name = "c", descriptor = "()V", line = 420)
    public void method199() throws Exception {
        field7365++;
    }

    @OriginalMember(owner = "client!efa", name = "c", descriptor = "(I)V", line = 427)
    public final synchronized void method3156(int arg0) {
        if (arg0 != 1) {
            this.method196();
        }
        this.field7382 = true;
        field7356++;
        try {
            this.method199();
        } catch (Exception var2) {
            this.method196();
            this.field7381 = class97.method664((byte) -50) + 2000L;
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 447)
    public void method197(Component arg0) throws Exception {
        field7363++;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(Lco;I)V", line = 463)
    public final synchronized void method3157(class725 arg0, int arg1) {
        field7359++;
        if (arg1 != 256) {
            this.field7378 = null;
        }
        this.field7358 = arg0;
    }

    @OriginalMember(owner = "client!efa", name = "d", descriptor = "()I", line = 503)
    public int method198() throws Exception {
        field7354++;
        return this.field7383;
    }
}
