import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class330 {

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "Z")
    private boolean field5067 = false;

    @OriginalMember(owner = "client!wn", name = "k", descriptor = "I")
    private int field5076 = 32;

    @OriginalMember(owner = "client!wn", name = "n", descriptor = "J")
    private long field5079 = class105.method789((byte) 55);

    @OriginalMember(owner = "client!wn", name = "H", descriptor = "I")
    private int field5099 = 0;

    @OriginalMember(owner = "client!wn", name = "F", descriptor = "I")
    private int field5097 = 0;

    @OriginalMember(owner = "client!wn", name = "G", descriptor = "Z")
    private boolean field5098 = true;

    @OriginalMember(owner = "client!wn", name = "L", descriptor = "I")
    private int field5103 = 0;

    @OriginalMember(owner = "client!wn", name = "M", descriptor = "I")
    private int field5104 = 0;

    @OriginalMember(owner = "client!wn", name = "D", descriptor = "[Lmd;")
    private class244[] field5095 = new class244[8];

    @OriginalMember(owner = "client!wn", name = "C", descriptor = "J")
    private long field5094 = 0L;

    @OriginalMember(owner = "client!wn", name = "I", descriptor = "[Lmd;")
    private class244[] field5100 = new class244[8];

    @OriginalMember(owner = "client!wn", name = "J", descriptor = "J")
    private long field5101 = 0L;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "Ljava/lang/String;")
    public static String field5066 = " has logged in.";

    @OriginalMember(owner = "client!wn", name = "x", descriptor = "Z")
    public static boolean field5089 = false;

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "[Z")
    public static boolean[] field5070 = new boolean[200];

    @OriginalMember(owner = "client!wn", name = "u", descriptor = "Z")
    public static volatile boolean field5086 = true;

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "Lec;")
    public static class99 field5072 = new class99(64);

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!wn", name = "h", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!wn", name = "j", descriptor = "I")
    public static int field5075;

    @OriginalMember(owner = "client!wn", name = "m", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!wn", name = "o", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!wn", name = "p", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!wn", name = "q", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!wn", name = "r", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!wn", name = "s", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!wn", name = "t", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!wn", name = "v", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!wn", name = "w", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!wn", name = "y", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!wn", name = "z", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!wn", name = "A", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!wn", name = "B", descriptor = "I")
    public int field5093;

    @OriginalMember(owner = "client!wn", name = "E", descriptor = "I")
    private int field5096;

    @OriginalMember(owner = "client!wn", name = "K", descriptor = "I")
    public int field5102;

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "Lmd;")
    private class244 field5068;

    @OriginalMember(owner = "client!wn", name = "i", descriptor = "Lvl;")
    public static class6 field5074;

    @OriginalMember(owner = "client!wn", name = "l", descriptor = "[I")
    public int[] field5077;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)V", line = 5)
    public final synchronized void method2295(byte arg0) {
        if (class38.field561 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class38.field561.field4867[var3] == this) {
                    class38.field561.field4867[var3] = null;
                }
                if (class38.field561.field4867[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class38.field561.field4876 = true;
                while (class38.field561.field4868) {
                    class324.method2252(-24861, 50L);
                }
                class38.field561 = null;
            }
        }
        field5090++;
        this.method1996();
        this.field5077 = null;
        if (arg0 > -14) {
            this.field5099 = 69;
        }
        this.field5067 = true;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V", line = 52)
    public static void method2296(int arg0) {
        field5072 = null;
        if (arg0 > -24) {
            method2302(34, -53);
        }
        field5074 = null;
        field5070 = null;
        field5066 = null;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 66)
    public void method1999(Component arg0) throws Exception {
        field5081++;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(BLmd;)V", line = 79)
    public final synchronized void method2297(byte arg0, class244 arg1) {
        int var3 = -111 / ((arg0 - 5) / 57);
        field5078++;
        this.field5068 = arg1;
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(B)V", line = 94)
    public final void method2298(byte arg0) {
        field5083++;
        if (arg0 != 42) {
            this.field5079 = -47L;
        }
        this.field5098 = true;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "([II)V", line = 111)
    private final void method2299(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class325.field5020) {
            var3 = arg1 << 1;
        }
        class126.method943(arg0, 0, var3);
        this.field5097 -= arg1;
        if (this.field5068 != null && this.field5097 <= 0) {
            this.field5097 += class260.field4009 >> 4;
            class309.method2121(this.field5068, 0);
            this.method2305(this.field5068, 0, this.field5068.method1681());
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
                        class244 var10 = null;
                        class244 var11 = this.field5100[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class247 var12 = var11.field3701;
                                if (var12 == null || var12.field3719 <= var8) {
                                    var11.field3704 = true;
                                    int var13 = var11.method146();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3719 += var13;
                                    }
                                    if (var4 >= this.field5076) {
                                        break label105;
                                    }
                                    class244 var14 = var11.method145();
                                    if (var14 != null) {
                                        int var15 = var11.field3702;
                                        while (var14 != null) {
                                            this.method2305(var14, 0, var15 * var14.method1681() >> 8);
                                            var14 = var11.method142();
                                        }
                                    }
                                    class244 var16 = var11.field3703;
                                    var11.field3703 = null;
                                    if (var10 == null) {
                                        this.field5100[var7] = var16;
                                    } else {
                                        var10.field3703 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field5095[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3703;
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
                class244 var18 = this.field5100[var17];
                this.field5100[var17] = this.field5095[var17] = null;
                while (var18 != null) {
                    class244 var19 = var18.field3703;
                    var18.field3703 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field5097 < 0) {
            this.field5097 = 0;
        }
        if (this.field5068 != null) {
            this.field5068.method140(arg0, 0, arg1);
        }
        this.field5079 = class105.method789((byte) 55);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZI)Lml;", line = 271)
    public static final class172 method2300(boolean arg0, int arg1) {
        class172 var2 = (class172) class60.field789.method730((long) arg1, (byte) 90);
        field5092++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class245.field3711.method696(0, (byte) 103, arg1);
        if (var3 == null) {
            return null;
        }
        class172 var4 = new class172();
        if (!arg0) {
            field5089 = false;
        }
        class254 var5 = new class254(var3);
        var5.field3866 = var5.field3840.length - 2;
        int var6 = var5.method1755(false);
        int var7 = var5.field3840.length - var6 - 2 - 12;
        var5.field3866 = var7;
        int var8 = var5.method1741(-32769);
        var4.field2777 = var5.method1755(false);
        var4.field2779 = var5.method1755(!arg0);
        var4.field2771 = var5.method1755(false);
        var4.field2775 = var5.method1755(false);
        int var9 = var5.method1774((byte) 96);
        if (var9 > 0) {
            var4.field2786 = new class250[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method1755(false);
                class250 var12 = new class250(class312.method2135(984942384, var11));
                var4.field2786[var10] = var12;
                while ((var11--) > 0) {
                    int var13 = var5.method1741(-32769);
                    int var14 = var5.method1741(-32769);
                    var12.method1708((long) var13, (byte) -79, new class293(var14));
                }
            }
        }
        var5.field3866 = 0;
        int var15 = 0;
        var4.field2782 = var5.method1745(false);
        var4.field2783 = new int[var8];
        var4.field2780 = new String[var8];
        var4.field2776 = new int[var8];
        while (var7 > var5.field3866) {
            int var16 = var5.method1755(false);
            if (var16 == 3) {
                var4.field2780[var15] = var5.method1778(1258).intern();
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field2776[var15] = var5.method1774((byte) -111);
            } else {
                var4.field2776[var15] = var5.method1741(-32769);
            }
            var4.field2783[var15++] = var16;
        }
        class60.field789.method734((byte) -14, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "()V", line = 361)
    public void method1996() {
        field5075++;
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "()V", line = 370)
    public void method2000() throws Exception {
        field5071++;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 377)
    public static final void method2301(int arg0, Component arg1) {
        field5069++;
        arg1.removeKeyListener(class121.field1857);
        arg1.removeFocusListener(class121.field1857);
        class4.field60 = -1;
        if (arg0 != 16128) {
            field5070 = (boolean[]) null;
        }
    }

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "()I", line = 390)
    public int method1997() throws Exception {
        field5073++;
        return this.field5102;
    }

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "()V", line = 402)
    public void method1998() throws Exception {
        field5082++;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)V", line = 411)
    public static final void method2302(int arg0, int arg1) {
        field5084++;
        if (arg1 == -1 || !class95.field1361[arg1]) {
            return;
        }
        class223.field3398.method701(-6048, arg1);
        if (class8.field128[arg1] == null) {
            return;
        }
        boolean var2 = true;
        int var3 = 0;
        if (arg0 != 17556) {
            field5072 = (class99) null;
        }
        while (var3 < class8.field128[arg1].length) {
            if (class8.field128[arg1][var3] != null) {
                if (class8.field128[arg1][var3].field2590 == 2) {
                    var2 = false;
                } else {
                    class8.field128[arg1][var3] = null;
                }
            }
            var3++;
        }
        if (var2) {
            class8.field128[arg1] = null;
        }
        class95.field1361[arg1] = false;
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)V", line = 459)
    public void method2001(int arg0) throws Exception {
        field5087++;
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(II)V", line = 466)
    private final void method2303(int arg0, int arg1) {
        if (arg0 != 0) {
            field5072 = (class99) null;
        }
        field5085++;
        this.field5097 -= arg1;
        if (this.field5097 < 0) {
            this.field5097 = 0;
        }
        if (this.field5068 != null) {
            this.field5068.method149(arg1);
        }
    }

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "(B)V", line = 484)
    public final synchronized void method2304(byte arg0) {
        field5088++;
        this.field5098 = true;
        try {
            this.method1998();
        } catch (Exception var3) {
            this.method1996();
            this.field5101 = class105.method789((byte) 55) + 2000L;
        }
        if (arg0 < 49) {
            this.method2304((byte) -3);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lmd;II)V", line = 504)
    private final void method2305(class244 arg0, int arg1, int arg2) {
        field5080++;
        int var4 = arg2 >> 5;
        if (arg1 != 0) {
            field5072 = (class99) null;
        }
        class244 var5 = this.field5095[var4];
        if (var5 == null) {
            this.field5100[var4] = arg0;
        } else {
            var5.field3703 = arg0;
        }
        this.field5095[var4] = arg0;
        arg0.field3702 = arg2;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)V", line = 556)
    public final synchronized void method2306(boolean arg0) {
        field5091++;
        if (this.field5067) {
            return;
        }
        long var2 = class105.method789((byte) 55);
        try {
            if (var2 > (this.field5079 + 500000L)) {
                this.field5079 = var2 - 500000L;
            }
            while (var2 > (this.field5079 + 5000L)) {
                this.method2303(0, 256);
                this.field5079 += (long) (256000 / class260.field4009);
            }
        } catch (Exception var9) {
            this.field5079 = var2;
        }
        if (this.field5077 == null) {
            return;
        }
        try {
            if (this.field5101 != 0L) {
                if (this.field5101 > var2) {
                    return;
                }
                this.method2001(this.field5102);
                this.field5098 = true;
                this.field5101 = 0L;
            }
            int var5 = this.method1997();
            if (this.field5103 - var5 > this.field5104) {
                this.field5104 = this.field5103 - var5;
            }
            int var6 = this.field5093 + this.field5096;
            if (var6 + 256 > 16384) {
                var6 = 16128;
            }
            if ((var6 + 256) > this.field5102) {
                this.field5102 += 1024;
                if (this.field5102 > 16384) {
                    this.field5102 = 16384;
                }
                this.method1996();
                var5 = 0;
                this.method2001(this.field5102);
                if ((var6 + 256) > this.field5102) {
                    var6 = this.field5102 - 256;
                    this.field5096 = var6 - this.field5093;
                }
                this.field5098 = true;
            }
            if (!arg0) {
                this.field5104 = -12;
            }
            while (var6 > var5) {
                var5 += 256;
                this.method2299(this.field5077, 256);
                this.method2000();
            }
            if (var2 > this.field5094) {
                if (this.field5098) {
                    this.field5098 = false;
                } else if (this.field5104 == 0 && this.field5099 == 0) {
                    this.method1996();
                    this.field5101 = var2 + 2000L;
                    return;
                } else {
                    this.field5096 = Math.min(this.field5099, this.field5104);
                    this.field5099 = this.field5104;
                }
                this.field5094 = var2 + 2000L;
                this.field5104 = 0;
            }
            this.field5103 = var5;
        } catch (Exception var8) {
            this.method1996();
            this.field5101 = var2 + 2000L;
        }
    }
}
