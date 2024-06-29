import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class14 {

    @OriginalMember(owner = "client!em", name = "j", descriptor = "Z")
    private boolean field412 = false;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    private int field403 = 32;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "J")
    private long field409 = class218.method1520((byte) 35);

    @OriginalMember(owner = "client!em", name = "w", descriptor = "J")
    private long field425 = 0L;

    @OriginalMember(owner = "client!em", name = "x", descriptor = "[Lmh;")
    private class154[] field426 = new class154[8];

    @OriginalMember(owner = "client!em", name = "z", descriptor = "I")
    private int field428 = 0;

    @OriginalMember(owner = "client!em", name = "E", descriptor = "I")
    private int field433 = 0;

    @OriginalMember(owner = "client!em", name = "C", descriptor = "I")
    private int field431 = 0;

    @OriginalMember(owner = "client!em", name = "F", descriptor = "J")
    private long field434 = 0L;

    @OriginalMember(owner = "client!em", name = "D", descriptor = "I")
    private int field432 = 0;

    @OriginalMember(owner = "client!em", name = "B", descriptor = "Z")
    private boolean field430 = true;

    @OriginalMember(owner = "client!em", name = "A", descriptor = "[Lmh;")
    private class154[] field429 = new class154[8];

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public static int field408 = 0;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!em", name = "o", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!em", name = "p", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!em", name = "q", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!em", name = "r", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!em", name = "s", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!em", name = "t", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!em", name = "v", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!em", name = "y", descriptor = "I")
    public int field427;

    @OriginalMember(owner = "client!em", name = "G", descriptor = "I")
    public int field435;

    @OriginalMember(owner = "client!em", name = "H", descriptor = "I")
    private int field436;

    @OriginalMember(owner = "client!em", name = "u", descriptor = "Lmh;")
    private class154 field423;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "Lje;")
    public static class84 field416;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "[I")
    public int[] field413;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)V", line = 6)
    public final synchronized void method136(byte arg0) {
        field421++;
        if (class153.field2617 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class153.field2617.field2942[var3] == this) {
                    class153.field2617.field2942[var3] = null;
                }
                if (class153.field2617.field2942[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class153.field2617.field2946 = true;
                while (class153.field2617.field2943) {
                    class122.method881(-80, 50L);
                }
                class153.field2617 = null;
            }
        }
        this.method147();
        this.field412 = true;
        this.field413 = null;
        if (arg0 != 92) {
            method148(97);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)Z", line = 51)
    public static final boolean method137(int arg0) {
        field415++;
        if (class241.field4016) {
            return true;
        } else {
            if (arg0 != 256) {
                field408 = -102;
            }
            return class207.field3462;
        }
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(I)V", line = 67)
    public void method138(int arg0) throws Exception {
        field419++;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "()I", line = 78)
    public int method139() throws Exception {
        field406++;
        return this.field435;
    }

    @OriginalMember(owner = "client!em", name = "c", descriptor = "(I)V", line = 89)
    public final void method140(int arg0) {
        if (arg0 <= -57) {
            this.field430 = true;
            field404++;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ILmh;B)V", line = 102)
    private final void method141(int arg0, class154 arg1, byte arg2) {
        field407++;
        int var4 = arg0 >> 5;
        if (arg2 < 73) {
            method148(77);
        }
        class154 var5 = this.field429[var4];
        if (var5 == null) {
            this.field426[var4] = arg1;
        } else {
            var5.field2625 = arg1;
        }
        this.field429[var4] = arg1;
        arg1.field2628 = arg0;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lmh;Z)V", line = 139)
    public final synchronized void method142(class154 arg0, boolean arg1) {
        if (!arg1) {
            this.field423 = arg0;
            field420++;
        }
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "()V", line = 150)
    public void method143() throws Exception {
        field410++;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 158)
    public void method144(Component arg0) throws Exception {
        field418++;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IB)V", line = 165)
    private final void method145(int arg0, byte arg1) {
        field405++;
        this.field431 -= arg0;
        if (this.field431 < 0) {
            this.field431 = 0;
        }
        if (this.field423 != null) {
            this.field423.method828(arg0);
        }
        if (arg1 != 81) {
            this.field430 = false;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "([II)V", line = 186)
    private final void method146(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class277.field4510) {
            var3 = arg1 << 1;
        }
        class89.method684(arg0, 0, var3);
        this.field431 -= arg1;
        if (this.field423 != null && this.field431 <= 0) {
            this.field431 += class194.field3261 >> 4;
            class323.method2322(this.field423, 3429);
            this.method141(this.field423.method1100(), this.field423, (byte) 76);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105: while (var5 != 0) {
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
                        class154 var10 = null;
                        class154 var11 = this.field426[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class32 var12 = var11.field2627;
                                if (var12 == null || var12.field722 <= var8) {
                                    var11.field2626 = true;
                                    int var13 = var11.method820();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field722 += var13;
                                    }
                                    if (var4 >= this.field403) {
                                        break label105;
                                    }
                                    class154 var14 = var11.method829();
                                    if (var14 != null) {
                                        int var15 = var11.field2628;
                                        while (var14 != null) {
                                            this.method141(var15 * var14.method1100() >> 8, var14, (byte) 110);
                                            var14 = var11.method825();
                                        }
                                    }
                                    class154 var16 = var11.field2625;
                                    var11.field2625 = null;
                                    if (var10 == null) {
                                        this.field426[var7] = var16;
                                    } else {
                                        var10.field2625 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field429[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2625;
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
                class154 var18 = this.field426[var17];
                this.field426[var17] = this.field429[var17] = null;
                while (var18 != null) {
                    class154 var19 = var18.field2625;
                    var18.field2625 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field431 < 0) {
            this.field431 = 0;
        }
        if (this.field423 != null) {
            this.field423.method827(arg0, 0, arg1);
        }
        this.field409 = class218.method1520((byte) 89);
    }

    @OriginalMember(owner = "client!em", name = "c", descriptor = "()V", line = 348)
    public void method147() {
        field417++;
    }

    @OriginalMember(owner = "client!em", name = "d", descriptor = "(I)V", line = 355)
    public static void method148(int arg0) {
        field416 = null;
        if (arg0 != 256) {
            method148(-9);
        }
    }

    @OriginalMember(owner = "client!em", name = "d", descriptor = "()V", line = 365)
    public void method149() throws Exception {
        field422++;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)V", line = 378)
    public final synchronized void method150(boolean arg0) {
        this.field430 = arg0;
        try {
            this.method143();
        } catch (Exception var3) {
            this.method147();
            this.field425 = class218.method1520((byte) 90) + 2000L;
        }
        field411++;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(Z)V", line = 394)
    public final synchronized void method151(boolean arg0) {
        field414++;
        if (this.field412) {
            return;
        }
        long var2 = class218.method1520((byte) 71);
        try {
            if (var2 > this.field409 + 500000L) {
                this.field409 = var2 - 500000L;
            }
            while (var2 > (this.field409 + 5000L)) {
                this.method145(256, (byte) 81);
                this.field409 += (long) (256000 / class194.field3261);
            }
        } catch (Exception var9) {
            this.field409 = var2;
        }
        if (this.field413 == null) {
            return;
        }
        try {
            if (this.field425 != 0L) {
                if (var2 < this.field425) {
                    return;
                }
                this.method138(this.field435);
                this.field430 = true;
                this.field425 = 0L;
            }
            int var5 = this.method139();
            int var6 = this.field436 + this.field427;
            if (this.field432 - var5 > this.field433) {
                this.field433 = this.field432 - var5;
            }
            if ((var6 + 256) > 16384) {
                var6 = 16128;
            }
            if (this.field435 < (var6 + 256)) {
                this.field435 += 1024;
                if (this.field435 > 16384) {
                    this.field435 = 16384;
                }
                this.method147();
                var5 = 0;
                this.method138(this.field435);
                this.field430 = true;
                if (var6 + 256 > this.field435) {
                    var6 = this.field435 - 256;
                    this.field436 = var6 - this.field427;
                }
            }
            while (var5 < var6) {
                this.method146(this.field413, 256);
                this.method149();
                var5 += 256;
            }
            if (this.field434 < var2) {
                if (this.field430) {
                    this.field430 = false;
                } else if (this.field433 == 0 && this.field428 == 0) {
                    this.method147();
                    this.field425 = var2 + 2000L;
                    return;
                } else {
                    this.field436 = Math.min(this.field428, this.field433);
                    this.field428 = this.field433;
                }
                this.field433 = 0;
                this.field434 = var2 + 2000L;
            }
            if (arg0) {
                this.method136((byte) 28);
            }
            this.field432 = var5;
        } catch (Exception var8) {
            this.method147();
            this.field425 = var2 + 2000L;
        }
    }
}
