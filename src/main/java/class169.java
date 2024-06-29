import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class169 {

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    private int field2585 = 32;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "J")
    private long field2592 = class212.method1404((byte) -91);

    @OriginalMember(owner = "client!q", name = "w", descriptor = "J")
    private long field2598 = 0L;

    @OriginalMember(owner = "client!q", name = "z", descriptor = "[Loj;")
    private class148[] field2601 = new class148[8];

    @OriginalMember(owner = "client!q", name = "x", descriptor = "I")
    private int field2599 = 0;

    @OriginalMember(owner = "client!q", name = "C", descriptor = "[Loj;")
    private class148[] field2604 = new class148[8];

    @OriginalMember(owner = "client!q", name = "E", descriptor = "Z")
    private boolean field2606 = true;

    @OriginalMember(owner = "client!q", name = "F", descriptor = "J")
    private long field2607 = 0L;

    @OriginalMember(owner = "client!q", name = "G", descriptor = "I")
    private int field2608 = 0;

    @OriginalMember(owner = "client!q", name = "y", descriptor = "I")
    private int field2600 = 0;

    @OriginalMember(owner = "client!q", name = "H", descriptor = "I")
    private int field2609 = 0;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field2580 = -1;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "Lsa;")
    public static class77 field2578 = new class77(0, 0);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!q", name = "t", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!q", name = "A", descriptor = "I")
    private int field2602;

    @OriginalMember(owner = "client!q", name = "B", descriptor = "I")
    public int field2603;

    @OriginalMember(owner = "client!q", name = "D", descriptor = "I")
    public int field2605;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "Loj;")
    private class148 field2596;

    @OriginalMember(owner = "client!q", name = "v", descriptor = "Lni;")
    public static class202 field2597;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "[I")
    public int[] field2594;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V", line = 9)
    public final synchronized void method1117(int arg0) {
        field2586++;
        if (arg0 != -1) {
            this.field2599 = -65;
        }
        this.field2606 = true;
        try {
            this.method25();
        } catch (Exception var3) {
            this.method21();
            this.field2607 = class212.method1404((byte) -121) + 2000L;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()V", line = 32)
    public void method25() throws Exception {
        field2588++;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V", line = 41)
    public final synchronized void method1118(int arg0) {
        field2591++;
        if (this.field2594 == null) {
            return;
        }
        long var2 = class212.method1404((byte) -106);
        try {
            if (this.field2607 != 0L) {
                if (var2 < this.field2607) {
                    return;
                }
                this.method24(this.field2605);
                this.field2606 = true;
                this.field2607 = 0L;
            }
            int var4 = this.method22();
            int var5 = this.field2603 + this.field2602;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field2609 - var4 > this.field2600) {
                this.field2600 = this.field2609 - var4;
            }
            if (this.field2605 < var5 + 256) {
                var4 = 0;
                this.field2605 += 1024;
                if (this.field2605 > 16384) {
                    this.field2605 = 16384;
                }
                this.method21();
                this.method24(this.field2605);
                this.field2606 = true;
                if (this.field2605 < var5 + 256) {
                    var5 = this.field2605 - 256;
                    this.field2602 = var5 - this.field2603;
                }
            }
            while (var5 > var4) {
                var4 += 256;
                this.method1119(this.field2594, 256);
                this.method23();
            }
            if (this.field2598 < var2) {
                if (this.field2606) {
                    this.field2606 = false;
                } else if (this.field2600 == 0 && this.field2608 == 0) {
                    this.method21();
                    this.field2607 = var2 + 2000L;
                    return;
                } else {
                    this.field2602 = Math.min(this.field2608, this.field2600);
                    this.field2608 = this.field2600;
                }
                this.field2600 = 0;
                this.field2598 = var2 + 2000L;
            }
            this.field2609 = var4;
        } catch (Exception var9) {
            this.method21();
            this.field2607 = var2 + 2000L;
        }
        try {
            if (var2 > this.field2592 + 500000L) {
                var2 = this.field2592;
            }
            while (this.field2592 + 5000L < var2) {
                this.method1125(256, 0);
                this.field2592 += (long) (256000 / class138.field2049);
            }
        } catch (Exception var8) {
            this.field2592 = var2;
        }
        if (arg0 != 9640) {
            field2597 = (class202) null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "([II)V", line = 165)
    private final void method1119(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class37.field591) {
            var3 = arg1 << 1;
        }
        class42.method298(arg0, 0, var3);
        this.field2599 -= arg1;
        if (this.field2596 != null && this.field2599 <= 0) {
            this.field2599 += class138.field2049 >> 4;
            class219.method1492(0, this.field2596);
            this.method1126(this.field2596, 0, this.field2596.method696());
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
                        class148 var10 = null;
                        class148 var11 = this.field2604[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class125 var12 = var11.field2144;
                                if (var12 == null || var12.field1875 <= var8) {
                                    var11.field2142 = true;
                                    int var13 = var11.method272();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1875 += var13;
                                    }
                                    if (var4 >= this.field2585) {
                                        break label105;
                                    }
                                    class148 var14 = var11.method279();
                                    if (var14 != null) {
                                        int var15 = var11.field2143;
                                        while (var14 != null) {
                                            this.method1126(var14, 0, var15 * var14.method696() >> 8);
                                            var14 = var11.method270();
                                        }
                                    }
                                    class148 var16 = var11.field2145;
                                    var11.field2145 = null;
                                    if (var10 == null) {
                                        this.field2604[var7] = var16;
                                    } else {
                                        var10.field2145 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2601[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2145;
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
                class148 var18 = this.field2604[var17];
                this.field2604[var17] = this.field2601[var17] = null;
                while (var18 != null) {
                    class148 var19 = var18.field2145;
                    var18.field2145 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2599 < 0) {
            this.field2599 = 0;
        }
        if (this.field2596 != null) {
            this.field2596.method271(arg0, 0, arg1);
        }
        this.field2592 = class212.method1404((byte) -88);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V", line = 324)
    public final synchronized void method1120(byte arg0) {
        if (class236.field3906 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class236.field3906.field137[var3] == this) {
                    class236.field3906.field137[var3] = null;
                }
                if (class236.field3906.field137[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class236.field3906.field141 = true;
                while (class236.field3906.field144) {
                    class116.method759(-1, 50L);
                }
                class236.field3906 = null;
            }
        }
        field2587++;
        this.method21();
        this.field2594 = null;
        if (arg0 > -24) {
            this.method1117(58);
        }
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V", line = 370)
    public static void method1121(int arg0) {
        field2597 = null;
        field2578 = null;
        if (arg0 != 5000) {
            field2580 = 8;
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "()I", line = 384)
    public int method22() throws Exception {
        field2579++;
        return this.field2605;
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(I)V", line = 397)
    public void method24(int arg0) throws Exception {
        field2577++;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lii;I)V", line = 408)
    public static final void method1122(class221 arg0, int arg1) {
        field2583++;
        if (arg1 != 63) {
            field2580 = -88;
        }
        while (true) {
            while (arg0.field3617.length > arg0.field3610) {
                int var2 = 0;
                boolean var3 = false;
                int var4 = 0;
                if (arg0.method1509(true) == 1) {
                    var4 = arg0.method1509(true);
                    var2 = arg0.method1509(true);
                    var3 = true;
                }
                int var5 = arg0.method1509(true);
                int var6 = arg0.method1509(true);
                int var7 = var5 * 64 - class206.field3284;
                int var8 = class97.field1460 - (var6 * 64 + -class289.field4918) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && class139.field2066 > (var7 + 63) && class97.field1460 > var8) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var3 || var11 >= var4 * 8 && var11 < (var4 * 8 + 8) && var12 >= var2 * 8 && var2 * 8 + 8 > var12) {
                                byte var13 = arg0.method1543(false);
                                if (var13 != 0) {
                                    if (class267.field4594[var9][var10] == null) {
                                        class267.field4594[var9][var10] = new byte[4096];
                                    }
                                    class267.field4594[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method1543(false);
                                    if (class289.field4912[var9][var10] == null) {
                                        class289.field4912[var9][var10] = new byte[4096];
                                    }
                                    class289.field4912[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var3 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method1543(false);
                        if (var16 != 0) {
                            arg0.field3610++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "()V", line = 502)
    public void method21() {
        field2584++;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIIII)V", line = 510)
    public static final void method1123(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2590++;
        int var8 = class76.method533(class294.field4956, arg1, true, class101.field1505);
        int var9 = class76.method533(class294.field4956, arg2, true, class101.field1505);
        int var10 = class76.method533(class57.field899, arg0, true, class301.field5073);
        int var11 = class76.method533(class57.field899, arg3, true, class301.field5073);
        int var12 = class76.method533(class294.field4956, arg1 + arg5, true, class101.field1505);
        int var13 = class76.method533(class294.field4956, arg2 - arg5, true, class101.field1505);
        for (int var14 = var8; var14 < var12; var14++) {
            class239.method1690(var10, 23267, var11, class137.field2032[var14], arg4);
        }
        if (arg7 < 69) {
            return;
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class239.method1690(var10, 23267, var11, class137.field2032[var15], arg4);
        }
        int var16 = class76.method533(class57.field899, arg0 + arg5, true, class301.field5073);
        int var17 = class76.method533(class57.field899, arg3 - arg5, true, class301.field5073);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class137.field2032[var18];
            class239.method1690(var10, 23267, var16, var19, arg4);
            class239.method1690(var16, 23267, var17, var19, arg6);
            class239.method1690(var17, 23267, var11, var19, arg4);
        }
    }

    @OriginalMember(owner = "client!q", name = "e", descriptor = "(I)V", line = 566)
    public final void method1124(int arg0) {
        field2589++;
        this.field2606 = true;
        if (arg0 != 0) {
            this.field2604 = (class148[]) null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)V", line = 580)
    private final void method1125(int arg0, int arg1) {
        field2582++;
        this.field2599 -= arg0;
        if (arg1 != 0) {
            this.field2609 = 41;
        }
        if (this.field2599 < 0) {
            this.field2599 = 0;
        }
        if (this.field2596 != null) {
            this.field2596.method274(arg0);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Loj;II)V", line = 599)
    private final void method1126(class148 arg0, int arg1, int arg2) {
        field2595++;
        if (arg1 != 0) {
            this.field2606 = false;
        }
        int var4 = arg2 >> 5;
        class148 var5 = this.field2601[var4];
        if (var5 == null) {
            this.field2604[var4] = arg0;
        } else {
            var5.field2145 = arg0;
        }
        this.field2601[var4] = arg0;
        arg0.field2143 = arg2;
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "()V", line = 622)
    public void method23() throws Exception {
        field2581++;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Loj;Z)V", line = 635)
    public final synchronized void method1127(class148 arg0, boolean arg1) {
        field2576++;
        this.field2596 = arg0;
        if (!arg1) {
            method1122((class221) null, 119);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 646)
    public void method20(Component arg0) throws Exception {
        field2593++;
    }
}
