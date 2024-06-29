import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class114 {

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "I")
    private int field2668 = 32;

    @OriginalMember(owner = "client!qc", name = "y", descriptor = "J")
    private long field2670 = class52.method408((byte) -105);

    @OriginalMember(owner = "client!qc", name = "F", descriptor = "J")
    private long field2676 = 0L;

    @OriginalMember(owner = "client!qc", name = "E", descriptor = "Z")
    private boolean field2675 = true;

    @OriginalMember(owner = "client!qc", name = "H", descriptor = "[Lfd;")
    private class40[] field2678 = new class40[8];

    @OriginalMember(owner = "client!qc", name = "G", descriptor = "I")
    private int field2677 = 0;

    @OriginalMember(owner = "client!qc", name = "M", descriptor = "I")
    private int field2683 = 0;

    @OriginalMember(owner = "client!qc", name = "J", descriptor = "J")
    private long field2680 = 0L;

    @OriginalMember(owner = "client!qc", name = "P", descriptor = "I")
    private int field2686 = 0;

    @OriginalMember(owner = "client!qc", name = "O", descriptor = "I")
    private int field2685 = 0;

    @OriginalMember(owner = "client!qc", name = "N", descriptor = "[Lfd;")
    private class40[] field2684 = new class40[8];

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "Lec;")
    public static class32 field2651 = class73.method594(":tradereq:", true);

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "Lec;")
    public static class32 field2663 = class73.method594("Zu viele Verbindungen von Ihrer Adresse)3", true);

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field2648 = 127;

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "Lec;")
    public static class32 field2671 = class73.method594("l", true);

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "Lec;")
    public static class32 field2657 = class73.method594("gleiten:", true);

    @OriginalMember(owner = "client!qc", name = "D", descriptor = "[I")
    public static int[] field2674 = new int[50];

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
    public static int field2662 = 0;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "[I")
    public static int[] field2655 = new int[5];

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "Lec;")
    private static class32 field2654 = class73.method594(" ", true);

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "Lec;")
    public static class32 field2653 = field2654;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!qc", name = "B", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!qc", name = "C", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!qc", name = "I", descriptor = "I")
    private int field2679;

    @OriginalMember(owner = "client!qc", name = "K", descriptor = "I")
    public int field2681;

    @OriginalMember(owner = "client!qc", name = "L", descriptor = "I")
    public int field2682;

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "Lfd;")
    private class40 field2667;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "[I")
    public int[] field2658;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
    public final synchronized void method890(byte arg0) {
        int var2 = -110 / ((arg0 + 18) / 35);
        field2646++;
        if (class132.field3033 != null) {
            boolean var3 = true;
            for (int var4 = 0; var4 < 2; var4++) {
                if (class132.field3033.field487[var4] == this) {
                    class132.field3033.field487[var4] = null;
                }
                if (class132.field3033.field487[var4] != null) {
                    var3 = false;
                }
            }
            if (var3) {
                class132.field3033.field501 = true;
                while (class132.field3033.field497) {
                    class54.method427(50L, -27166);
                }
                class132.field3033 = null;
            }
        }
        this.method144();
        this.field2658 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "([II)V")
    private final void method891(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class56.field1311) {
            var3 = arg1 << 1;
        }
        class60.method459(arg0, 0, var3);
        this.field2685 -= arg1;
        if (this.field2667 != null && this.field2685 <= 0) {
            this.field2685 += class139.field3213 >> 4;
            class100.method799((byte) -15, this.field2667);
            this.method899(0, this.field2667, this.field2667.method322());
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
                        class40 var10 = null;
                        class40 var11 = this.field2678[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class95 var12 = var11.field947;
                                if (var12 == null || var12.field2186 <= var8) {
                                    var11.field948 = true;
                                    int var13 = var11.method87();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field2186 += var13;
                                    }
                                    if (var4 >= this.field2668) {
                                        break label107;
                                    }
                                    class40 var14 = var11.method106();
                                    if (var14 != null) {
                                        int var15 = var11.field946;
                                        while (var14 != null) {
                                            this.method899(0, var14, var15 * var14.method322() >> 8);
                                            var14 = var11.method113();
                                        }
                                    }
                                    class40 var16 = var11.field945;
                                    var11.field945 = null;
                                    if (var10 == null) {
                                        this.field2678[var7] = var16;
                                    } else {
                                        var10.field945 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2684[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field945;
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
                class40 var18 = this.field2678[var17];
                this.field2678[var17] = this.field2684[var17] = null;
                while (var18 != null) {
                    class40 var19 = var18.field945;
                    var18.field945 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2685 < 0) {
            this.field2685 = 0;
        }
        if (this.field2667 != null) {
            this.field2667.method116(arg0, 0, arg1);
        }
        this.field2670 = class52.method408((byte) -34);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lfd;I)V")
    public final synchronized void method892(class40 arg0, int arg1) {
        if (arg1 == 256000) {
            this.field2667 = arg0;
            field2650++;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLec;Lec;Lec;)V")
    public static final void method893(boolean arg0, class32 arg1, class32 arg2, class32 arg3) {
        class74.field1743 = arg3;
        field2664++;
        class74.field1755 = arg1;
        if (arg0) {
            field2663 = null;
        }
        class74.field1741 = arg2;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
    public final void method894(boolean arg0) {
        this.field2675 = arg0;
        field2647++;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method141(Component arg0) throws Exception {
        field2669++;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public void method143(int arg0) throws Exception {
        field2673++;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "()V")
    public void method139() throws Exception {
        field2649++;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
    public final synchronized void method895(int arg0) {
        if (arg0 != 0) {
            field2653 = null;
        }
        field2665++;
        if (this.field2658 == null) {
            return;
        }
        long var2 = class52.method408((byte) -51);
        try {
            if (this.field2680 != 0L) {
                if (var2 < this.field2680) {
                    return;
                }
                this.method143(this.field2682);
                this.field2675 = true;
                this.field2680 = 0L;
            }
            int var4 = this.method138();
            if (this.field2683 - var4 > this.field2686) {
                this.field2686 = this.field2683 - var4;
            }
            int var5 = this.field2681 + this.field2679;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field2682 < var5 + 256) {
                this.field2682 += 1024;
                if (this.field2682 > 16384) {
                    this.field2682 = 16384;
                }
                var4 = 0;
                this.method144();
                this.method143(this.field2682);
                if (var5 + 256 > this.field2682) {
                    var5 = this.field2682 - 256;
                    this.field2679 = var5 - this.field2681;
                }
                this.field2675 = true;
            }
            while (var5 > var4) {
                var4 += 256;
                this.method891(this.field2658, 256);
                this.method139();
            }
            if (var2 > this.field2676) {
                if (this.field2675) {
                    this.field2675 = false;
                } else if (this.field2686 == 0 && this.field2677 == 0) {
                    this.method144();
                    this.field2680 = var2 + 2000L;
                    return;
                } else {
                    this.field2679 = Math.min(this.field2677, this.field2686);
                    this.field2677 = this.field2686;
                }
                this.field2676 = var2 + 2000L;
                this.field2686 = 0;
            }
            this.field2683 = var4;
        } catch (Exception var7) {
            this.method144();
            this.field2680 = var2 + 2000L;
        }
        try {
            if (this.field2670 + 500000L < var2) {
                var2 = this.field2670;
            }
            while (this.field2670 + 5000L < var2) {
                this.method898(13094, 256);
                this.field2670 += 256000 / class139.field3213;
            }
        } catch (Exception var6) {
            this.field2670 = var2;
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(Z)V")
    public final synchronized void method896(boolean arg0) {
        this.field2675 = arg0;
        try {
            this.method142();
        } catch (Exception var2) {
            this.method144();
            this.field2680 = class52.method408((byte) -85) + 2000L;
        }
        field2659++;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "()I")
    public int method138() throws Exception {
        field2672++;
        return this.field2682;
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(Z)V")
    public static void method897(boolean arg0) {
        field2657 = null;
        field2653 = null;
        field2655 = null;
        if (!arg0) {
            return;
        }
        field2654 = null;
        field2674 = null;
        field2663 = null;
        field2671 = null;
        field2651 = null;
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "()V")
    public void method144() {
        field2666++;
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "()V")
    public void method142() throws Exception {
        field2652++;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V")
    private final void method898(int arg0, int arg1) {
        if (arg0 != 13094) {
            this.field2677 = -15;
        }
        this.field2685 -= arg1;
        field2656++;
        if (this.field2685 < 0) {
            this.field2685 = 0;
        }
        if (this.field2667 != null) {
            this.field2667.method104(arg1);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILfd;I)V")
    private final void method899(int arg0, class40 arg1, int arg2) {
        field2660++;
        if (arg0 != 0) {
            this.field2685 = 112;
        }
        int var4 = arg2 >> 5;
        class40 var5 = this.field2684[var4];
        if (var5 == null) {
            this.field2678[var4] = arg1;
        } else {
            var5.field945 = arg1;
        }
        this.field2684[var4] = arg1;
        arg1.field946 = arg2;
    }
}
