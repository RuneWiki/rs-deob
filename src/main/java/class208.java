import java.awt.Component;
import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class208 {

    @OriginalMember(owner = "client!o", name = "r", descriptor = "I")
    private int field3533 = 32;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "J")
    private long field3532 = class12.method57(-93);

    @OriginalMember(owner = "client!o", name = "D", descriptor = "I")
    private int field3545 = 0;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "I")
    private int field3548 = 0;

    @OriginalMember(owner = "client!o", name = "E", descriptor = "J")
    private long field3546 = 0L;

    @OriginalMember(owner = "client!o", name = "C", descriptor = "Z")
    private boolean field3544 = true;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "I")
    private int field3543 = 0;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "J")
    private long field3551 = 0L;

    @OriginalMember(owner = "client!o", name = "I", descriptor = "[Lib;")
    private class126[] field3550 = new class126[8];

    @OriginalMember(owner = "client!o", name = "L", descriptor = "I")
    private int field3553 = 0;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "[Lib;")
    private class126[] field3554 = new class126[8];

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public static int field3525 = 0;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!o", name = "y", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!o", name = "A", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!o", name = "F", descriptor = "I")
    public int field3547;

    @OriginalMember(owner = "client!o", name = "H", descriptor = "I")
    private int field3549;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "I")
    public int field3552;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "Lib;")
    private class126 field3523;

    @OriginalMember(owner = "client!o", name = "x", descriptor = "[I")
    public int[] field3539;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public void method183(int arg0) throws Exception {
        field3534++;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZI)I")
    public static final int method1320(boolean arg0, int arg1) {
        field3542++;
        if (arg0) {
            field3531 = -21;
        }
        return (arg1 & 0x1FB06) >> 11;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V")
    public final synchronized void method1321(boolean arg0) {
        field3517++;
        if (!arg0 || this.field3539 == null) {
            return;
        }
        long var2 = class12.method57(-104);
        try {
            if (this.field3546 != 0L) {
                if (var2 < this.field3546) {
                    return;
                }
                this.method183(this.field3552);
                this.field3544 = true;
                this.field3546 = 0L;
            }
            int var4 = this.method186();
            if ((this.field3545 - var4) > this.field3543) {
                this.field3543 = this.field3545 - var4;
            }
            int var5 = this.field3549 + this.field3547;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field3552) {
                this.field3552 += 1024;
                if (this.field3552 > 16384) {
                    this.field3552 = 16384;
                }
                var4 = 0;
                this.method184();
                this.method183(this.field3552);
                if ((var5 + 256) > this.field3552) {
                    var5 = this.field3552 - 256;
                    this.field3549 = var5 - this.field3547;
                }
                this.field3544 = true;
            }
            while (var4 < var5) {
                this.method1326(this.field3539, 256);
                this.method182();
                var4 += 256;
            }
            if (this.field3551 < var2) {
                if (this.field3544) {
                    this.field3544 = false;
                } else if (this.field3543 == 0 && this.field3553 == 0) {
                    this.method184();
                    this.field3546 = var2 + 2000L;
                    return;
                } else {
                    this.field3549 = Math.min(this.field3553, this.field3543);
                    this.field3553 = this.field3543;
                }
                this.field3551 = var2 + 2000L;
                this.field3543 = 0;
            }
            this.field3545 = var4;
        } catch (Exception var7) {
            this.method184();
            this.field3546 = var2 + 2000L;
        }
        try {
            if (this.field3532 + 500000L < var2) {
                var2 = this.field3532;
            }
            while (var2 > this.field3532 + 5000L) {
                this.method1333(-100, 256);
                this.field3532 += (long) (256000 / class195.field3316);
            }
        } catch (Exception var6) {
            this.field3532 = var2;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "()I")
    public int method186() throws Exception {
        field3521++;
        return this.field3552;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "()V")
    public void method184() {
        field3537++;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
    public final synchronized void method1322(byte arg0) {
        int var2 = 82 % ((arg0 - 69) / 32);
        field3518++;
        if (class134.field2333 != null) {
            boolean var3 = true;
            for (int var4 = 0; var4 < 2; var4++) {
                if (class134.field2333.field1196[var4] == this) {
                    class134.field2333.field1196[var4] = null;
                }
                if (class134.field2333.field1196[var4] != null) {
                    var3 = false;
                }
            }
            if (var3) {
                class134.field2333.field1200 = true;
                while (class134.field2333.field1202) {
                    class171.method1088(112, 50L);
                }
                class134.field2333 = null;
            }
        }
        this.method184();
        this.field3539 = null;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
    public final void method1323(byte arg0) {
        this.field3544 = true;
        field3541++;
        if (arg0 > -54) {
            this.method1333(34, 34);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
    public static final int method1324(int arg0, KeyEvent arg1) {
        field3540++;
        int var2 = arg1.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return arg0 < 31 ? -75 : var2;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method185(Component arg0) throws Exception {
        field3522++;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V")
    public static final void method1325(int arg0, int arg1) {
        class109.field2045 = -1;
        class184.field3136 = arg1;
        if (arg0 != 21726) {
            method1320(true, -11);
        }
        class109.field2045 = -1;
        field3536++;
        class103.method629((byte) -72);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "([II)V")
    private final void method1326(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class216.field3641) {
            var3 = arg1 << 1;
        }
        class68.method423(arg0, 0, var3);
        this.field3548 -= arg1;
        if (this.field3523 != null && this.field3548 <= 0) {
            this.field3548 += class195.field3316 >> 4;
            class75.method442(this.field3523, 86);
            this.method1331(this.field3523.method779(), this.field3523, 94);
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
                        class126 var10 = null;
                        class126 var11 = this.field3550[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class157 var12 = var11.field2251;
                                if (var12 == null || var12.field2686 <= var8) {
                                    var11.field2253 = true;
                                    int var13 = var11.method486();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field2686 += var13;
                                    }
                                    if (var4 >= this.field3533) {
                                        break label107;
                                    }
                                    class126 var14 = var11.method475();
                                    if (var14 != null) {
                                        int var15 = var11.field2252;
                                        while (var14 != null) {
                                            this.method1331(var15 * var14.method779() >> 8, var14, 114);
                                            var14 = var11.method477();
                                        }
                                    }
                                    class126 var16 = var11.field2250;
                                    var11.field2250 = null;
                                    if (var10 == null) {
                                        this.field3550[var7] = var16;
                                    } else {
                                        var10.field2250 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3554[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2250;
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
                class126 var18 = this.field3550[var17];
                this.field3550[var17] = this.field3554[var17] = null;
                while (var18 != null) {
                    class126 var19 = var18.field2250;
                    var18.field2250 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3548 < 0) {
            this.field3548 = 0;
        }
        if (this.field3523 != null) {
            this.field3523.method485(arg0, 0, arg1);
        }
        this.field3532 = class12.method57(-92);
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "()V")
    public void method187() throws Exception {
        field3528++;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V")
    public static final void method1327(int arg0) {
        field3526++;
        class102.method626(5, 20015);
        class254.method1734(8, 5);
        class246.method1643(0, 5);
        class94.method582(arg0 ^ 0x5, 5);
        class54.method310(5, 232);
        class246.method1645((byte) -123, 5);
        class171.method1093(5, (byte) -108);
        class20.method96(5, (byte) -116);
        class92.method541(5, 99);
        class101.method617(false, 5);
        class18.method87(5, 0);
        class103.method628((byte) -99, 50);
        class231.method1557(112, arg0);
        class153.method962(0, 5);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILib;)V")
    public final synchronized void method1328(int arg0, class126 arg1) {
        this.field3523 = arg1;
        field3529++;
        if (arg0 != 7673) {
            this.method1326((int[]) null, 12);
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(Z)V")
    public final synchronized void method1329(boolean arg0) {
        field3520++;
        this.field3544 = arg0;
        try {
            this.method187();
        } catch (Exception var2) {
            this.method184();
            this.field3546 = class12.method57(-110) + 2000L;
        }
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "()V")
    public void method182() throws Exception {
        field3524++;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(JI)V")
    public static final void method1330(long arg0, int arg1) {
        field3519++;
        try {
            int var3 = 66 / ((-arg1 - 48) / 53);
            Thread.sleep(arg0);
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILib;I)V")
    private final void method1331(int arg0, class126 arg1, int arg2) {
        int var4 = arg0 >> 5;
        field3516++;
        class126 var5 = this.field3554[var4];
        if (arg2 < 83) {
            return;
        }
        if (var5 == null) {
            this.field3550[var4] = arg1;
        } else {
            var5.field2250 = arg1;
        }
        this.field3554[var4] = arg1;
        arg1.field2252 = arg0;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IBLn;)Lnf;")
    public static final class213 method1332(int arg0, byte arg1, class138 arg2) {
        field3535++;
        if (class115.method728(false, arg2, arg0)) {
            return arg1 == -97 ? class252.method1686((byte) -112) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(II)V")
    private final void method1333(int arg0, int arg1) {
        this.field3548 -= arg1;
        if (this.field3548 < 0) {
            this.field3548 = 0;
        }
        field3530++;
        if (arg0 <= -73 && this.field3523 != null) {
            this.field3523.method478(arg1);
        }
    }
}
