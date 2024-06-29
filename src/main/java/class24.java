import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class24 {

    @OriginalMember(owner = "client!db", name = "E", descriptor = "I")
    private int field595 = 32;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "J")
    private long field576 = class29.method235(-329);

    @OriginalMember(owner = "client!db", name = "I", descriptor = "I")
    private int field599 = 0;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "J")
    private long field596 = 0L;

    @OriginalMember(owner = "client!db", name = "L", descriptor = "I")
    private int field602 = 0;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "[Lrf;")
    private class124[] field600 = new class124[8];

    @OriginalMember(owner = "client!db", name = "P", descriptor = "I")
    private int field606 = 0;

    @OriginalMember(owner = "client!db", name = "O", descriptor = "Z")
    private boolean field605 = true;

    @OriginalMember(owner = "client!db", name = "N", descriptor = "I")
    private int field604 = 0;

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "J")
    private long field607 = 0L;

    @OriginalMember(owner = "client!db", name = "R", descriptor = "[Lrf;")
    private class124[] field608 = new class124[8];

    @OriginalMember(owner = "client!db", name = "c", descriptor = "Lic;")
    public static class59 field567 = class59.method433(0, ": ");

    @OriginalMember(owner = "client!db", name = "m", descriptor = "Lic;")
    public static class59 field577 = class59.method433(0, "<col=ffffff>");

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field575 = 0;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "Lic;")
    public static class59 field570 = class59.method433(0, ")4lang)4de");

    @OriginalMember(owner = "client!db", name = "q", descriptor = "Lic;")
    public static class59 field581 = class59.method433(0, "::clientdrop");

    @OriginalMember(owner = "client!db", name = "o", descriptor = "J")
    public static long field579 = 0L;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "Lic;")
    private static class59 field588 = class59.method433(0, "Use");

    @OriginalMember(owner = "client!db", name = "y", descriptor = "Lic;")
    public static class59 field589 = field588;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "[I")
    public static int[] field594 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!db", name = "G", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "I")
    private int field598;

    @OriginalMember(owner = "client!db", name = "K", descriptor = "I")
    public int field601;

    @OriginalMember(owner = "client!db", name = "M", descriptor = "I")
    public int field603;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "Lrf;")
    private class124 field574;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "Lce;")
    public static class20 field587;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "[I")
    public int[] field580;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "()V")
    public void method148() {
        field569++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIZ)I")
    public static final int method149(int arg0, int arg1, int arg2, boolean arg3) {
        field597++;
        if (!arg3) {
            method152(63, -17, 35);
        }
        int var4 = 256 - arg0;
        return ((arg1 & 0xFF00FF) * arg0 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg1 & 0xFF00) * arg0 + (arg2 & 0xFF00) * var4 & 0xFF0000) >> 8;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "()V")
    public void method150() throws Exception {
        field566++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V")
    public final synchronized void method151(boolean arg0) {
        field592++;
        if (class32.field851 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class32.field851.field2414[var3] == this) {
                    class32.field851.field2414[var3] = null;
                }
                if (class32.field851.field2414[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class32.field851.field2419 = true;
                while (class32.field851.field2424) {
                    class126.method962(arg0, 50L);
                }
                class32.field851 = null;
            }
        }
        this.method148();
        if (arg0) {
            this.field574 = null;
        }
        this.field580 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III)V")
    public static final void method152(int arg0, int arg1, int arg2) {
        field571++;
        if (class114.method923(arg1, (byte) -128)) {
            if (arg0 >= -111) {
                field587 = null;
            }
            class115.method924(class46.field1173[arg1], arg2, true);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public static void method153(int arg0) {
        field587 = null;
        field577 = null;
        if (arg0 != 2000) {
            return;
        }
        field570 = null;
        field567 = null;
        field581 = null;
        field589 = null;
        field594 = null;
        field588 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "([II)V")
    private final void method154(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class25.field632) {
            var3 = arg1 << 1;
        }
        class105.method817(arg0, 0, var3);
        this.field599 -= arg1;
        if (this.field574 != null && this.field599 <= 0) {
            this.field599 += class25.field626 >> 4;
            class99.method805(this.field574, 15613);
            this.method158(this.field574, this.field574.method576(), (byte) 31);
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
                        class124 var10 = null;
                        class124 var11 = this.field600[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class50 var12 = var11.field2792;
                                if (var12 == null || var12.field1258 <= var8) {
                                    var11.field2794 = true;
                                    int var13 = var11.method483();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1258 += var13;
                                    }
                                    if (var4 >= this.field595) {
                                        break label107;
                                    }
                                    class124 var14 = var11.method470();
                                    if (var14 != null) {
                                        int var15 = var11.field2793;
                                        while (var14 != null) {
                                            this.method158(var14, var15 * var14.method576() >> 8, (byte) 31);
                                            var14 = var11.method467();
                                        }
                                    }
                                    class124 var16 = var11.field2791;
                                    var11.field2791 = null;
                                    if (var10 == null) {
                                        this.field600[var7] = var16;
                                    } else {
                                        var10.field2791 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field608[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2791;
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
                class124 var18 = this.field600[var17];
                this.field600[var17] = this.field608[var17] = null;
                while (var18 != null) {
                    class124 var19 = var18.field2791;
                    var18.field2791 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field599 < 0) {
            this.field599 = 0;
        }
        if (this.field574 != null) {
            this.field574.method495(arg0, 0, arg1);
        }
        this.field576 = class29.method235(-329);
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
    public final synchronized void method155(int arg0) {
        field584++;
        if (this.field580 == null) {
            return;
        }
        long var2 = class29.method235(-329);
        try {
            if (this.field596 != 0L) {
                if (var2 < this.field596) {
                    return;
                }
                this.method162(this.field603);
                this.field605 = true;
                this.field596 = 0L;
            }
            int var4 = this.method159();
            if (this.field606 < this.field602 - var4) {
                this.field606 = this.field602 - var4;
            }
            int var5 = -72 / ((arg0 - 38) / 52);
            int var6 = this.field601 + this.field598;
            if (var6 + 256 > 16384) {
                var6 = 16128;
            }
            if (var6 + 256 > this.field603) {
                var4 = 0;
                this.field603 += 1024;
                if (this.field603 > 16384) {
                    this.field603 = 16384;
                }
                this.method148();
                this.method162(this.field603);
                this.field605 = true;
                if (var6 + 256 > this.field603) {
                    var6 = this.field603 - 256;
                    this.field598 = var6 - this.field601;
                }
            }
            while (var6 > var4) {
                var4 += 256;
                this.method154(this.field580, 256);
                this.method163();
            }
            if (var2 > this.field607) {
                if (this.field605) {
                    this.field605 = false;
                } else if (this.field606 == 0 && this.field604 == 0) {
                    this.method148();
                    this.field596 = var2 + 2000L;
                    return;
                } else {
                    this.field598 = Math.min(this.field604, this.field606);
                    this.field604 = this.field606;
                }
                this.field607 = var2 + 2000L;
                this.field606 = 0;
            }
            this.field602 = var4;
        } catch (Exception var8) {
            this.method148();
            this.field596 = var2 + 2000L;
        }
        try {
            if (this.field576 + 500000L < var2) {
                var2 = this.field576;
            }
            while (var2 > this.field576 + 5000L) {
                this.method157(256, true);
                this.field576 += 256000 / class25.field626;
            }
        } catch (Exception var7) {
            this.field576 = var2;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)I")
    public static int method156(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IZ)V")
    private final void method157(int arg0, boolean arg1) {
        field568++;
        this.field599 -= arg0;
        if (this.field599 < 0) {
            this.field599 = 0;
        }
        if (this.field574 != null) {
            this.field574.method474(arg0);
        }
        if (!arg1) {
            this.method151(false);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lrf;IB)V")
    private final void method158(class124 arg0, int arg1, byte arg2) {
        field583++;
        int var4 = arg1 >> 5;
        class124 var5 = this.field608[var4];
        if (var5 == null) {
            this.field600[var4] = arg0;
        } else {
            var5.field2791 = arg0;
        }
        if (arg2 != 31) {
            field579 = 18L;
        }
        this.field608[var4] = arg0;
        arg0.field2793 = arg1;
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "()I")
    public int method159() throws Exception {
        field586++;
        return this.field603;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lrf;B)V")
    public final synchronized void method160(class124 arg0, byte arg1) {
        this.field574 = arg0;
        field591++;
        if (arg1 != -26) {
            this.field602 = 6;
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
    public final void method161(int arg0) {
        this.field605 = true;
        if (arg0 != -29104) {
            this.method148();
        }
        field565++;
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(I)V")
    public void method162(int arg0) throws Exception {
        field585++;
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "()V")
    public void method163() throws Exception {
        field573++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method164(Component arg0) throws Exception {
        field572++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
    public final synchronized void method165(byte arg0) {
        field582++;
        this.field605 = true;
        try {
            this.method150();
            if (arg0 >= -20) {
                this.method165((byte) -124);
            }
        } catch (Exception var2) {
            this.method148();
            this.field596 = class29.method235(-329) + 2000L;
        }
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(I)V")
    public static final void method166(int arg0) {
        field593++;
        int var1 = class43.field1105.method1157(class98.field2443);
        for (int var2 = arg0; var2 < class107.field2557; var2++) {
            int var6 = class43.field1105.method1157(class4.method22(var2, false));
            if (var1 < var6) {
                var1 = var6;
            }
        }
        class98.field2440 = true;
        int var3 = class107.field2557 * 15 + 21;
        var1 += 8;
        class30.field781 = class107.field2557 * 15 + 22;
        int var4 = class3.field68 - var1 / 2;
        int var5 = class81.field2005;
        if (var5 + var3 > 503) {
            var5 = 503 - var3;
        }
        class138.field3081 = var1;
        if (var4 + var1 > 765) {
            var4 = 765 - var1;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        class128.field2895 = var5;
        class159.field3646 = var4;
    }
}
