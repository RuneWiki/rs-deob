import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class141 {

    @OriginalMember(owner = "client!n", name = "u", descriptor = "I")
    private int field2652 = 32;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "J")
    private long field2649 = class113.method769(62);

    @OriginalMember(owner = "client!n", name = "A", descriptor = "I")
    private int field2658 = 0;

    @OriginalMember(owner = "client!n", name = "D", descriptor = "J")
    private long field2661 = 0L;

    @OriginalMember(owner = "client!n", name = "H", descriptor = "[Laf;")
    private class7[] field2665 = new class7[8];

    @OriginalMember(owner = "client!n", name = "E", descriptor = "I")
    private int field2662 = 0;

    @OriginalMember(owner = "client!n", name = "G", descriptor = "Z")
    private boolean field2664 = true;

    @OriginalMember(owner = "client!n", name = "F", descriptor = "I")
    private int field2663 = 0;

    @OriginalMember(owner = "client!n", name = "I", descriptor = "I")
    private int field2666 = 0;

    @OriginalMember(owner = "client!n", name = "J", descriptor = "[Laf;")
    private class7[] field2667 = new class7[8];

    @OriginalMember(owner = "client!n", name = "K", descriptor = "J")
    private long field2668 = 0L;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "Lmb;")
    private static class132 field2642 = class166.method1092(" is already on your friend list)3", 116);

    @OriginalMember(owner = "client!n", name = "f", descriptor = "Lmb;")
    public static class132 field2637 = field2642;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public static int field2640 = 0;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "Lmb;")
    public static class132 field2643 = class166.method1092(" )2> ", 111);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!n", name = "z", descriptor = "I")
    public int field2657;

    @OriginalMember(owner = "client!n", name = "B", descriptor = "I")
    private int field2659;

    @OriginalMember(owner = "client!n", name = "C", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!n", name = "L", descriptor = "I")
    public int field2669;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "Laf;")
    private class7 field2648;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "[I")
    public static int[] field2647;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "[I")
    public int[] field2651;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "[I")
    public static int[] field2653;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Laf;B)V")
    public final synchronized void method947(class7 arg0, byte arg1) {
        this.field2648 = arg0;
        field2650++;
        if (arg1 != 30) {
            this.field2668 = -27L;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public final void method948(int arg0) {
        this.field2664 = true;
        if (arg0 == 0) {
            field2644++;
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
    public void method13(int arg0) throws Exception {
        field2635++;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "()V")
    public void method15() {
        field2633++;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)V")
    private final void method949(int arg0, int arg1) {
        field2660++;
        this.field2663 -= arg0;
        if (arg1 > this.field2663) {
            this.field2663 = 0;
        }
        if (this.field2648 != null) {
            this.field2648.method27(arg0);
        }
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V")
    public final synchronized void method950(int arg0) {
        if (class149.field2738 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class149.field2738.field3614[var3] == this) {
                    class149.field2738.field3614[var3] = null;
                }
                if (class149.field2738.field3614[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class149.field2738.field3608 = true;
                while (class149.field2738.field3615) {
                    class130.method856(1, 50L);
                }
                class149.field2738 = null;
            }
        }
        field2656++;
        this.method15();
        if (arg0 != 256000) {
            this.method948(32);
        }
        this.field2651 = null;
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V")
    public final synchronized void method951(int arg0) {
        field2646++;
        if (this.field2651 == null) {
            return;
        }
        long var2 = class113.method769(108);
        try {
            if (this.field2668 != 0L) {
                if (var2 < this.field2668) {
                    return;
                }
                this.method13(this.field2669);
                this.field2668 = 0L;
                this.field2664 = true;
            }
            int var4 = this.method14();
            if (this.field2666 < this.field2658 - var4) {
                this.field2666 = this.field2658 - var4;
            }
            int var5 = this.field2657 + this.field2659;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field2669 < var5 + 256) {
                var4 = 0;
                this.field2669 += 1024;
                if (this.field2669 > 16384) {
                    this.field2669 = 16384;
                }
                this.method15();
                this.method13(this.field2669);
                if (var5 + 256 > this.field2669) {
                    var5 = this.field2669 - 256;
                    this.field2659 = var5 - this.field2657;
                }
                this.field2664 = true;
            }
            while (var4 < var5) {
                this.method954(this.field2651, 256);
                var4 += 256;
                this.method17();
            }
            if (arg0 != 29943) {
                field2640 = -53;
            }
            if (var2 > this.field2661) {
                if (this.field2664) {
                    this.field2664 = false;
                } else if (this.field2666 == 0 && this.field2662 == 0) {
                    this.method15();
                    this.field2668 = var2 + 2000L;
                    return;
                } else {
                    this.field2659 = Math.min(this.field2662, this.field2666);
                    this.field2662 = this.field2666;
                }
                this.field2661 = var2 + 2000L;
                this.field2666 = 0;
            }
            this.field2658 = var4;
        } catch (Exception var7) {
            this.method15();
            this.field2668 = var2 + 2000L;
        }
        try {
            if (var2 > this.field2649 + 500000L) {
                var2 = this.field2649;
            }
            while (var2 > this.field2649 + 5000L) {
                this.method949(256, 0);
                this.field2649 += 256000 / class96.field1728;
            }
        } catch (Exception var6) {
            this.field2649 = var2;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method16(Component arg0) throws Exception {
        field2641++;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "()V")
    public void method17() throws Exception {
        field2638++;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
    public final synchronized void method952(byte arg0) {
        this.field2664 = true;
        try {
            this.method12();
            if (arg0 != 53) {
                this.method951(114);
            }
        } catch (Exception var2) {
            this.method15();
            this.field2668 = class113.method769(arg0 + 25) + 2000L;
        }
        field2645++;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILoc;ILu;)V")
    public static final void method953(int arg0, class155 arg1, int arg2, class214 arg3) {
        if (arg2 != -14111) {
            method956(17);
        }
        field2655++;
        byte[] var4 = null;
        class19 var5 = class128.field2370;
        synchronized (class128.field2370) {
            for (class231 var6 = (class231) class128.field2370.method119(true); var6 != null; var6 = (class231) class128.field2370.method125((byte) -51)) {
                if ((long) arg0 == var6.field2760 && var6.field4160 == arg3 && var6.field4161 == 0) {
                    var4 = var6.field4157;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var7 = arg3.method1332((byte) -90, arg0);
            arg1.method1011(true, arg0, (byte) -104, var7, arg3);
        } else {
            arg1.method1011(true, arg0, (byte) -59, var4, arg3);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "([II)V")
    private final void method954(int[] arg0, int arg1) {
        int var3 = arg1;
        if (client.field533) {
            var3 = arg1 << 1;
        }
        class80.method494(arg0, 0, var3);
        this.field2663 -= arg1;
        if (this.field2648 != null && this.field2663 <= 0) {
            this.field2663 += class96.field1728 >> 4;
            class85.method528(this.field2648, (byte) -118);
            this.method955(3, this.field2648.method29(), this.field2648);
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
                        class7 var10 = null;
                        class7 var11 = this.field2667[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class179 var12 = var11.field67;
                                if (var12 == null || var12.field3291 <= var8) {
                                    var11.field68 = true;
                                    int var13 = var11.method26();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3291 += var13;
                                    }
                                    if (var4 >= this.field2652) {
                                        break label107;
                                    }
                                    class7 var14 = var11.method25();
                                    if (var14 != null) {
                                        int var15 = var11.field66;
                                        while (var14 != null) {
                                            this.method955(3, var15 * var14.method29() >> 8, var14);
                                            var14 = var11.method24();
                                        }
                                    }
                                    class7 var16 = var11.field69;
                                    var11.field69 = null;
                                    if (var10 == null) {
                                        this.field2667[var7] = var16;
                                    } else {
                                        var10.field69 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2665[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field69;
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
                class7 var18 = this.field2667[var17];
                this.field2667[var17] = this.field2665[var17] = null;
                while (var18 != null) {
                    class7 var19 = var18.field69;
                    var18.field69 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2663 < 0) {
            this.field2663 = 0;
        }
        if (this.field2648 != null) {
            this.field2648.method30(arg0, 0, arg1);
        }
        this.field2649 = class113.method769(126);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IILaf;)V")
    private final void method955(int arg0, int arg1, class7 arg2) {
        field2639++;
        int var4 = arg1 >> 5;
        class7 var5 = this.field2665[var4];
        if (var5 == null) {
            this.field2667[var4] = arg2;
        } else {
            var5.field69 = arg2;
        }
        this.field2665[var4] = arg2;
        arg2.field66 = arg1;
        if (arg0 != 3) {
            this.method947(null, (byte) 88);
        }
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "()V")
    public void method12() throws Exception {
        field2654++;
    }

    @OriginalMember(owner = "client!n", name = "e", descriptor = "(I)V")
    public static void method956(int arg0) {
        field2653 = null;
        if (arg0 != 0) {
            method953(62, null, -3, null);
        }
        field2643 = null;
        field2642 = null;
        field2647 = null;
        field2637 = null;
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "()I")
    public int method14() throws Exception {
        field2636++;
        return this.field2669;
    }
}
