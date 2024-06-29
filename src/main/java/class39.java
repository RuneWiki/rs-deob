import java.awt.Canvas;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class39 {

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    private int field571 = 32;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "J")
    private long field585 = class110.method707((byte) 85);

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
    private int field589 = 0;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "J")
    private long field590 = 0L;

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "I")
    private int field592 = 0;

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "Z")
    private boolean field593 = true;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "[Lfg;")
    private class77[] field588 = new class77[8];

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "J")
    private long field595 = 0L;

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "[Lfg;")
    private class77[] field596 = new class77[8];

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "I")
    private int field600 = 0;

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "I")
    private int field597 = 0;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "Lck;")
    public static class119 field569 = class298.method1987((byte) 24, "hd");

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "Lck;")
    private static class119 field573 = class298.method1987((byte) 124, " more options");

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "Lck;")
    public static class119 field580 = field573;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "I")
    public int field591;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
    public int field598;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "I")
    private int field599;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "Lfg;")
    private class77 field582;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field587;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "[I")
    public int[] field568;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "[[[B")
    public static byte[][][] field570;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([II)V", line = 4)
    private final void method297(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class55.field887) {
            var3 = arg1 << 1;
        }
        class213.method1345(arg0, 0, var3);
        this.field592 -= arg1;
        if (this.field582 != null && this.field592 <= 0) {
            this.field592 += class230.field3728 >> 4;
            class162.method1034(this.field582, 120);
            this.method310(this.field582.method545(), this.field582, -347349723);
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
                        class77 var10 = null;
                        class77 var11 = this.field596[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class149 var12 = var11.field1192;
                                if (var12 == null || var12.field2375 <= var8) {
                                    var11.field1193 = true;
                                    int var13 = var11.method469();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field2375 += var13;
                                    }
                                    if (var4 >= this.field571) {
                                        break label105;
                                    }
                                    class77 var14 = var11.method466();
                                    if (var14 != null) {
                                        int var15 = var11.field1191;
                                        while (var14 != null) {
                                            this.method310(var15 * var14.method545() >> 8, var14, -347349723);
                                            var14 = var11.method462();
                                        }
                                    }
                                    class77 var16 = var11.field1194;
                                    var11.field1194 = null;
                                    if (var10 == null) {
                                        this.field596[var7] = var16;
                                    } else {
                                        var10.field1194 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field588[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1194;
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
                class77 var18 = this.field596[var17];
                this.field596[var17] = this.field588[var17] = null;
                while (var18 != null) {
                    class77 var19 = var18.field1194;
                    var18.field1194 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field592 < 0) {
            this.field592 = 0;
        }
        if (this.field582 != null) {
            this.field582.method458(arg0, 0, arg1);
        }
        this.field585 = class110.method707((byte) 104);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 166)
    public void method298(Component arg0) throws Exception {
        field586++;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "()V", line = 173)
    public void method299() throws Exception {
        field575++;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V", line = 181)
    public final synchronized void method300(boolean arg0) {
        field565++;
        if (this.field568 == null) {
            return;
        }
        long var2 = class110.method707((byte) 66);
        try {
            if (this.field590 != 0L) {
                if (var2 < this.field590) {
                    return;
                }
                this.method312(this.field591);
                this.field593 = true;
                this.field590 = 0L;
            }
            int var4 = this.method302();
            if (this.field589 - var4 > this.field600) {
                this.field600 = this.field589 - var4;
            }
            int var5 = this.field599 + this.field598;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field591) {
                var4 = 0;
                this.field591 += 1024;
                if (this.field591 > 16384) {
                    this.field591 = 16384;
                }
                this.method301();
                this.method312(this.field591);
                this.field593 = true;
                if (this.field591 < (var5 + 256)) {
                    var5 = this.field591 - 256;
                    this.field599 = var5 - this.field598;
                }
            }
            while (var4 < var5) {
                this.method297(this.field568, 256);
                var4 += 256;
                this.method311();
            }
            if (var2 > this.field595) {
                if (this.field593) {
                    this.field593 = false;
                } else if (this.field600 == 0 && this.field597 == 0) {
                    this.method301();
                    this.field590 = var2 + 2000L;
                    return;
                } else {
                    this.field599 = Math.min(this.field597, this.field600);
                    this.field597 = this.field600;
                }
                this.field595 = var2 + 2000L;
                this.field600 = 0;
            }
            this.field589 = var4;
            if (arg0) {
                this.method313(57);
            }
        } catch (Exception var9) {
            this.method301();
            this.field590 = var2 + 2000L;
        }
        try {
            if (var2 > this.field585 + 500000L) {
                var2 = this.field585;
            }
            while (this.field585 + 5000L < var2) {
                this.method304(256, 0);
                this.field585 += (long) (256000 / class230.field3728);
            }
        } catch (Exception var8) {
            this.field585 = var2;
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "()V", line = 295)
    public void method301() {
        field579++;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "()I", line = 303)
    public int method302() throws Exception {
        field564++;
        return this.field591;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([I[Ljava/lang/Object;B)V", line = 319)
    public static final void method303(int[] arg0, Object[] arg1, byte arg2) {
        if (arg2 < -57) {
            class11.method108(0, arg1, arg0.length - 1, arg0, true);
            field581++;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V", line = 332)
    private final void method304(int arg0, int arg1) {
        this.field592 -= arg0;
        if (this.field592 < 0) {
            this.field592 = 0;
        }
        field566++;
        if (this.field582 != null) {
            this.field582.method468(arg0);
        }
        if (arg1 != 0) {
            this.field599 = -19;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II[Lml;)V", line = 365)
    public static final void method305(int arg0, int arg1, class134[] arg2) {
        for (int var3 = arg0; var3 < arg2.length; var3++) {
            class134 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field2135 == 0) {
                    if (var4.field2061 != null) {
                        method305(0, arg1, var4.field2061);
                    }
                    class288 var5 = (class288) class206.field3268.method1329((byte) 90, (long) var4.field2120);
                    if (var5 != null) {
                        class249.method1614(-10170, arg1, var5.field4739);
                    }
                }
                if (arg1 == 0 && var4.field2055 != null) {
                    class1 var6 = new class1();
                    var6.field14 = var4.field2055;
                    var6.field8 = var4;
                    class184.method1170(var6, 87);
                }
                if (arg1 == 1 && var4.field2184 != null) {
                    if (var4.field2138 >= 0) {
                        class134 var7 = class20.method153(arg0 ^ 0x1, var4.field2120);
                        if (var7 == null || var7.field2061 == null || var4.field2138 >= var7.field2061.length || var7.field2061[var4.field2138] != var4) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field8 = var4;
                    var8.field14 = var4.field2184;
                    class184.method1170(var8, 111);
                }
            }
        }
        field594++;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILfg;)V", line = 433)
    public final synchronized void method306(int arg0, class77 arg1) {
        if (arg0 == 0) {
            field567++;
            this.field582 = arg1;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V", line = 447)
    public final void method307(int arg0) {
        field577++;
        if (arg0 != 16384) {
            this.field571 = 73;
        }
        this.field593 = true;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(Z)V", line = 459)
    public static void method308(boolean arg0) {
        field580 = null;
        field573 = null;
        field570 = (byte[][][]) null;
        field587 = null;
        if (arg0) {
            field569 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V", line = 474)
    public final synchronized void method309(int arg0) {
        this.field593 = true;
        try {
            this.method299();
            if (arg0 != 256) {
                method305(38, 72, (class134[]) null);
            }
        } catch (Exception var3) {
            this.method301();
            this.field590 = class110.method707((byte) 121) + 2000L;
        }
        field572++;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILfg;I)V", line = 501)
    private final void method310(int arg0, class77 arg1, int arg2) {
        if (arg2 != -347349723) {
            this.field582 = (class77) null;
        }
        int var4 = arg0 >> 5;
        field578++;
        class77 var5 = this.field588[var4];
        if (var5 == null) {
            this.field596[var4] = arg1;
        } else {
            var5.field1194 = arg1;
        }
        this.field588[var4] = arg1;
        arg1.field1191 = arg0;
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "()V", line = 524)
    public void method311() throws Exception {
        field576++;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V", line = 531)
    public void method312(int arg0) throws Exception {
        field584++;
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)V", line = 559)
    public final synchronized void method313(int arg0) {
        if (class10.field190 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class10.field190.field403[var3] == this) {
                    class10.field190.field403[var3] = null;
                }
                if (class10.field190.field403[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class10.field190.field408 = true;
                while (class10.field190.field402) {
                    class232.method1493(50L, (byte) -51);
                }
                class10.field190 = null;
            }
        }
        this.method301();
        this.field568 = null;
        if (arg0 != 19722) {
            this.method306(61, (class77) null);
        }
        field574++;
    }
}
