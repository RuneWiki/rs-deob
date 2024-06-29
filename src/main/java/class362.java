import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class362 {

    @OriginalMember(owner = "client!n", name = "p", descriptor = "Z")
    private boolean field5486 = false;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    private int field5471 = 32;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "J")
    private long field5475 = class435.method2539(-10659);

    @OriginalMember(owner = "client!n", name = "r", descriptor = "I")
    private int field5488 = 0;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "I")
    private int field5489 = 0;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "Z")
    private boolean field5491 = true;

    @OriginalMember(owner = "client!n", name = "A", descriptor = "[Luh;")
    private class375[] field5497 = new class375[8];

    @OriginalMember(owner = "client!n", name = "w", descriptor = "J")
    private long field5493 = 0L;

    @OriginalMember(owner = "client!n", name = "H", descriptor = "[Luh;")
    private class375[] field5504 = new class375[8];

    @OriginalMember(owner = "client!n", name = "G", descriptor = "I")
    private int field5503 = 0;

    @OriginalMember(owner = "client!n", name = "F", descriptor = "J")
    private long field5502 = 0L;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "I")
    private int field5494 = 0;

    @OriginalMember(owner = "client!n", name = "I", descriptor = "[Lun;")
    public static class110[] field5505 = new class110[14];

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field5472;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field5473;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field5476;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public static int field5479;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "I")
    public static int field5482;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "I")
    public static int field5485;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "I")
    public int field5492;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "I")
    private int field5495;

    @OriginalMember(owner = "client!n", name = "z", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!n", name = "B", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!n", name = "C", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!n", name = "D", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!n", name = "E", descriptor = "I")
    public int field5501;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "Luh;")
    private class375 field5477;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "[I")
    public int[] field5483;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "[Ldp;")
    public static class319[] field5484;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field5480;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "()V", line = 5)
    public void method279() throws Exception {
        field5496++;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "()V", line = 12)
    public void method280() {
        field5474++;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V", line = 20)
    public final synchronized void method2223(int arg0) {
        field5476++;
        if (this.field5486) {
            return;
        }
        long var2 = class435.method2539(-10659);
        try {
            if (this.field5475 + 500000L < var2) {
                this.field5475 = var2 - 500000L;
            }
            while ((this.field5475 + 5000L) < var2) {
                this.method2231(121, 256);
                this.field5475 += (long) (256000 / class144.field2047);
            }
        } catch (Exception var7) {
            this.field5475 = var2;
        }
        if (this.field5483 == null) {
            return;
        }
        try {
            if (this.field5493 != 0L) {
                if (this.field5493 > var2) {
                    return;
                }
                this.method275(this.field5492);
                this.field5493 = 0L;
                this.field5491 = true;
            }
            int var4 = this.method277();
            if (this.field5488 < (this.field5494 - var4)) {
                this.field5488 = this.field5494 - var4;
            }
            int var5 = this.field5501 + this.field5495;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field5492) {
                this.field5492 += 1024;
                if (this.field5492 > 16384) {
                    this.field5492 = 16384;
                }
                this.method280();
                this.method275(this.field5492);
                var4 = 0;
                this.field5491 = true;
                if (this.field5492 < var5 + 256) {
                    var5 = this.field5492 - 256;
                    this.field5495 = var5 - this.field5501;
                }
            }
            while (var5 > var4) {
                this.method2225(this.field5483, 256);
                this.method279();
                var4 += 256;
            }
            if (this.field5502 < var2) {
                if (this.field5491) {
                    this.field5491 = false;
                } else if (this.field5488 == 0 && this.field5503 == 0) {
                    this.method280();
                    this.field5493 = var2 + 2000L;
                    return;
                } else {
                    this.field5495 = Math.min(this.field5503, this.field5488);
                    this.field5503 = this.field5488;
                }
                this.field5502 = var2 + 2000L;
                this.field5488 = 0;
            }
            if (arg0 <= 42) {
                this.method2223(-22);
            }
            this.field5494 = var4;
        } catch (Exception var6) {
            this.method280();
            this.field5493 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "()I", line = 140)
    public int method277() throws Exception {
        field5479++;
        return this.field5492;
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "()V", line = 149)
    public void method276() throws Exception {
        field5485++;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Luh;II)V", line = 160)
    private final void method2224(class375 arg0, int arg1, int arg2) {
        field5490++;
        int var4 = arg1 >> 5;
        class375 var5 = this.field5497[var4];
        if (var5 == null) {
            this.field5504[var4] = arg0;
        } else {
            var5.field5607 = arg0;
        }
        this.field5497[var4] = arg0;
        arg0.field5608 = arg1;
        if (arg2 != 5060) {
            this.field5495 = 123;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "([II)V", line = 184)
    private final void method2225(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class436.field6165) {
            var3 = arg1 << 1;
        }
        class149.method1013(arg0, 0, var3);
        this.field5489 -= arg1;
        if (this.field5477 != null && this.field5489 <= 0) {
            this.field5489 += class144.field2047 >> 4;
            class216.method1436(97, this.field5477);
            this.method2224(this.field5477, this.field5477.method74(), 5060);
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
                        class375 var10 = null;
                        class375 var11 = this.field5504[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class152 var12 = var11.field5605;
                                if (var12 == null || var12.field2119 <= var8) {
                                    var11.field5606 = true;
                                    int var13 = var11.method49();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field2119 += var13;
                                    }
                                    if (var4 >= this.field5471) {
                                        break label107;
                                    }
                                    class375 var14 = var11.method86();
                                    if (var14 != null) {
                                        int var15 = var11.field5608;
                                        while (var14 != null) {
                                            this.method2224(var14, var15 * var14.method74() >> 8, 5060);
                                            var14 = var11.method85();
                                        }
                                    }
                                    class375 var16 = var11.field5607;
                                    var11.field5607 = null;
                                    if (var10 == null) {
                                        this.field5504[var7] = var16;
                                    } else {
                                        var10.field5607 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field5497[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field5607;
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
                class375 var18 = this.field5504[var17];
                this.field5504[var17] = this.field5497[var17] = null;
                while (var18 != null) {
                    class375 var19 = var18.field5607;
                    var18.field5607 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field5489 < 0) {
            this.field5489 = 0;
        }
        if (this.field5477 != null) {
            this.field5477.method48(arg0, 0, arg1);
        }
        this.field5475 = class435.method2539(-10659);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V", line = 342)
    public final synchronized void method2226(byte arg0) {
        if (class322.field4847 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class322.field4847.field6059[var3] == this) {
                    class322.field4847.field6059[var3] = null;
                }
                if (class322.field4847.field6059[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class322.field4847.field6051 = true;
                while (class322.field4847.field6056) {
                    class325.method2005(true, 50L);
                }
                class322.field4847 = null;
            }
        }
        field5498++;
        this.method280();
        this.field5486 = true;
        this.field5483 = null;
        if (arg0 >= -124) {
            this.method2229((byte) 21);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Luh;I)V", line = 388)
    public final synchronized void method2227(class375 arg0, int arg1) {
        if (arg1 != 0) {
            this.method2226((byte) -24);
        }
        this.field5477 = arg0;
        field5472++;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V", line = 402)
    public void method275(int arg0) throws Exception {
        field5473++;
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V", line = 410)
    public final void method2228(int arg0) {
        field5478++;
        this.field5491 = true;
        if (arg0 != 0) {
            this.field5503 = 18;
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(B)V", line = 422)
    public final synchronized void method2229(byte arg0) {
        this.field5491 = true;
        field5499++;
        try {
            this.method276();
        } catch (Exception var2) {
            this.method280();
            this.field5493 = class435.method2539(-10659) + 2000L;
        }
        if (arg0 < 119) {
            this.field5492 = 110;
        }
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V", line = 450)
    public static void method2230(int arg0) {
        if (arg0 != 256) {
            field5480 = null;
        }
        field5480 = null;
        field5484 = null;
        field5505 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)V", line = 469)
    private final void method2231(int arg0, int arg1) {
        field5481++;
        if (arg0 <= 60) {
            this.method2229((byte) 40);
        }
        this.field5489 -= arg1;
        if (this.field5489 < 0) {
            this.field5489 = 0;
        }
        if (this.field5477 != null) {
            this.field5477.method58(arg1);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIII)I", line = 492)
    public static final int method2232(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field5500++;
        if (var4 == 0) {
            return arg1;
        } else if (arg2 == var4) {
            return 1023 - arg3;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BLsk;)V", line = 513)
    public static final void method2233(byte arg0, class309 arg1) {
        if ((arg1 instanceof class349)) {
            class349 var3 = (class349) arg1;
            if (var3.field5309 != null) {
                class287.method1835(var3, class472.field6622.field4545 != var3.field4545, arg0 ^ 0x5C);
            }
        } else if (arg1 instanceof class257) {
            class257 var2 = (class257) arg1;
            class294.method1848(var2, class472.field6622.field4545 != var2.field4545, arg0 - 162);
        }
        field5487++;
        if (arg0 != 38) {
            method2232(38, 72, -61, -31);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 541)
    public void method278(Component arg0) throws Exception {
        field5482++;
    }
}
