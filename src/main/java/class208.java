import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class208 {

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "Z")
    private boolean field2652 = false;

    @OriginalMember(owner = "client!vm", name = "r", descriptor = "I")
    private int field2668 = 32;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "J")
    private long field2658 = class97.method654((byte) 102);

    @OriginalMember(owner = "client!vm", name = "v", descriptor = "J")
    private long field2672 = 0L;

    @OriginalMember(owner = "client!vm", name = "A", descriptor = "I")
    private int field2677 = 0;

    @OriginalMember(owner = "client!vm", name = "C", descriptor = "[Lrn;")
    private class648[] field2679 = new class648[8];

    @OriginalMember(owner = "client!vm", name = "x", descriptor = "[Lrn;")
    private class648[] field2674 = new class648[8];

    @OriginalMember(owner = "client!vm", name = "w", descriptor = "Z")
    private boolean field2673 = true;

    @OriginalMember(owner = "client!vm", name = "y", descriptor = "I")
    private int field2675 = 0;

    @OriginalMember(owner = "client!vm", name = "D", descriptor = "I")
    private int field2680 = 0;

    @OriginalMember(owner = "client!vm", name = "E", descriptor = "J")
    private long field2681 = 0L;

    @OriginalMember(owner = "client!vm", name = "z", descriptor = "I")
    private int field2676 = 0;

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "[Ljfa;")
    public static class122[] field2663 = new class122[75];

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!vm", name = "n", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!vm", name = "o", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!vm", name = "p", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!vm", name = "q", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!vm", name = "s", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!vm", name = "t", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!vm", name = "u", descriptor = "I")
    public int field2671;

    @OriginalMember(owner = "client!vm", name = "B", descriptor = "I")
    private int field2678;

    @OriginalMember(owner = "client!vm", name = "F", descriptor = "I")
    public int field2682;

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "Lrn;")
    private class648 field2660;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "[I")
    public int[] field2657;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "()V")
    public void method574() throws Exception {
        field2653++;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
    public void method571(int arg0) throws Exception {
        field2664++;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V")
    public final synchronized void method1276(byte arg0) {
        field2661++;
        if (this.field2652) {
            return;
        }
        long var2 = class97.method654((byte) 101);
        try {
            if (this.field2658 + 6000L < var2) {
                this.field2658 = var2 - 6000L;
            }
            while (var2 > this.field2658 + 5000L) {
                this.method1284(256, 127);
                this.field2658 += (256000 / class554.field7780);
                var2 = class97.method654((byte) 74);
            }
        } catch (Exception var7) {
            this.field2658 = var2;
        }
        if (this.field2657 == null) {
            return;
        }
        try {
            if (this.field2672 != 0L) {
                if (var2 < this.field2672) {
                    return;
                }
                this.method571(this.field2671);
                this.field2673 = true;
                this.field2672 = 0L;
            }
            int var4 = this.method572();
            if (this.field2677 - var4 > this.field2675) {
                this.field2675 = this.field2677 - var4;
            }
            if (arg0 != 30) {
                this.field2680 = 61;
            }
            int var5 = this.field2682 + this.field2678;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field2671) {
                this.field2671 += 1024;
                if (this.field2671 > 16384) {
                    this.field2671 = 16384;
                }
                this.method575();
                var4 = 0;
                this.method571(this.field2671);
                this.field2673 = true;
                if (var5 + 256 > this.field2671) {
                    var5 = this.field2671 - 256;
                    this.field2678 = var5 - this.field2682;
                }
            }
            while (var4 < var5) {
                this.method1283(this.field2657, 256);
                this.method574();
                var4 += 256;
            }
            if (var2 > this.field2681) {
                if (this.field2673) {
                    this.field2673 = false;
                } else if (this.field2675 == 0 && this.field2680 == 0) {
                    this.method575();
                    this.field2672 = var2 + 2000L;
                    return;
                } else {
                    this.field2678 = Math.min(this.field2680, this.field2675);
                    this.field2680 = this.field2675;
                }
                this.field2681 = var2 + 2000L;
                this.field2675 = 0;
            }
            this.field2677 = var4;
        } catch (Exception var6) {
            this.method575();
            this.field2672 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BLha;)V")
    public static final void method1277(byte arg0, class454 arg1) {
        if (arg0 <= 32) {
            return;
        }
        field2662++;
        if (class322.field4113) {
            class713.method3952(18172, arg1);
        } else {
            class10.method49((byte) -72, arg1);
        }
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)V")
    public static void method1278(int arg0) {
        if (arg0 != 2000) {
            field2663 = null;
        }
        field2663 = null;
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(I)V")
    public final synchronized void method1279(int arg0) {
        this.field2673 = true;
        field2656++;
        try {
            this.method573();
            if (arg0 != -13373) {
                method1280(-14);
            }
        } catch (Exception var2) {
            this.method575();
            this.field2672 = class97.method654((byte) 98) + 2000L;
        }
    }

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "(I)V")
    public static final void method1280(int arg0) {
        field2659++;
        class114 var1 = class124.field1474;
        synchronized (class124.field1474) {
            class124.field1474.method776((byte) 107);
        }
        class114 var2 = class626.field8729;
        synchronized (class626.field8729) {
            class626.field8729.method776((byte) 106);
            if (arg0 != 23676) {
                field2663 = null;
            }
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILrn;)V")
    public final synchronized void method1281(int arg0, class648 arg1) {
        this.field2660 = arg1;
        field2651++;
        if (arg0 != 28305) {
            this.field2680 = -1;
        }
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "()I")
    public int method572() throws Exception {
        field2666++;
        return this.field2671;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lrn;II)V")
    private final void method1282(class648 arg0, int arg1, int arg2) {
        field2654++;
        if (arg2 != 22194) {
            return;
        }
        int var4 = arg1 >> 5;
        class648 var5 = this.field2674[var4];
        if (var5 == null) {
            this.field2679[var4] = arg0;
        } else {
            var5.field8913 = arg0;
        }
        this.field2674[var4] = arg0;
        arg0.field8911 = arg1;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "([II)V")
    private final void method1283(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class48.field709) {
            var3 = arg1 << 1;
        }
        class617.method3386(arg0, 0, var3);
        this.field2676 -= arg1;
        if (this.field2660 != null && this.field2676 <= 0) {
            this.field2676 += class554.field7780 >> 4;
            class159.method985(this.field2660, -114);
            this.method1282(this.field2660, this.field2660.method3505(), 22194);
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
                        class648 var10 = null;
                        class648 var11 = this.field2679[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class178 var12 = var11.field8910;
                                if (var12 == null || var12.field2296 <= var8) {
                                    var11.field8912 = true;
                                    int var13 = var11.method671();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field2296 += var13;
                                    }
                                    if (var4 >= this.field2668) {
                                        break label107;
                                    }
                                    class648 var14 = var11.method662();
                                    if (var14 != null) {
                                        int var15 = var11.field8911;
                                        while (var14 != null) {
                                            this.method1282(var14, var15 * var14.method3505() >> 8, 22194);
                                            var14 = var11.method673();
                                        }
                                    }
                                    class648 var16 = var11.field8913;
                                    var11.field8913 = null;
                                    if (var10 == null) {
                                        this.field2679[var7] = var16;
                                    } else {
                                        var10.field8913 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2674[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field8913;
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
                class648 var18 = this.field2679[var17];
                this.field2679[var17] = this.field2674[var17] = null;
                while (var18 != null) {
                    class648 var19 = var18.field8913;
                    var18.field8913 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2676 < 0) {
            this.field2676 = 0;
        }
        if (this.field2660 != null) {
            this.field2660.method670(arg0, 0, arg1);
        }
        this.field2658 = class97.method654((byte) 117);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method570(Component arg0) throws Exception {
        field2665++;
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "()V")
    public void method573() throws Exception {
        field2670++;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)V")
    private final void method1284(int arg0, int arg1) {
        this.field2676 -= arg0;
        field2669++;
        if (this.field2676 < 0) {
            this.field2676 = 0;
        }
        if (this.field2660 != null) {
            this.field2660.method661(arg0);
        }
        if (arg1 < 50) {
            this.field2671 = -25;
        }
    }

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "()V")
    public void method575() {
        field2655++;
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(B)V")
    public final synchronized void method1285(byte arg0) {
        field2667++;
        if (class511.field7212 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class511.field7212.field3848[var3] == this) {
                    class511.field7212.field3848[var3] = null;
                }
                if (class511.field7212.field3848[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class511.field7212.field3846 = true;
                while (class511.field7212.field3844) {
                    class517.method2965(50L, -73);
                }
                class511.field7212 = null;
            }
        }
        this.method575();
        this.field2657 = null;
        if (arg0 > -21) {
            this.method1276((byte) 53);
        }
        this.field2652 = true;
    }
}
