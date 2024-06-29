import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class234 {

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "Z")
    private boolean field3214 = false;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "I")
    private int field3210 = 32;

    @OriginalMember(owner = "client!aq", name = "t", descriptor = "J")
    private long field3229 = class108.method902((byte) -93);

    @OriginalMember(owner = "client!aq", name = "y", descriptor = "[Lmi;")
    private class409[] field3234 = new class409[8];

    @OriginalMember(owner = "client!aq", name = "D", descriptor = "[Lmi;")
    private class409[] field3239 = new class409[8];

    @OriginalMember(owner = "client!aq", name = "z", descriptor = "I")
    private int field3235 = 0;

    @OriginalMember(owner = "client!aq", name = "H", descriptor = "J")
    private long field3243 = 0L;

    @OriginalMember(owner = "client!aq", name = "B", descriptor = "I")
    private int field3237 = 0;

    @OriginalMember(owner = "client!aq", name = "E", descriptor = "I")
    private int field3240 = 0;

    @OriginalMember(owner = "client!aq", name = "F", descriptor = "I")
    private int field3241 = 0;

    @OriginalMember(owner = "client!aq", name = "I", descriptor = "J")
    private long field3244 = 0L;

    @OriginalMember(owner = "client!aq", name = "K", descriptor = "Z")
    private boolean field3246 = true;

    @OriginalMember(owner = "client!aq", name = "r", descriptor = "Lef;")
    public static class344 field3227 = new class344(100);

    @OriginalMember(owner = "client!aq", name = "G", descriptor = "[Z")
    public static boolean[] field3242 = new boolean[112];

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!aq", name = "h", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!aq", name = "i", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!aq", name = "j", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!aq", name = "l", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!aq", name = "m", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!aq", name = "n", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!aq", name = "o", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!aq", name = "p", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!aq", name = "q", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!aq", name = "s", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!aq", name = "u", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!aq", name = "w", descriptor = "I")
    public int field3232;

    @OriginalMember(owner = "client!aq", name = "x", descriptor = "I")
    public int field3233;

    @OriginalMember(owner = "client!aq", name = "A", descriptor = "I")
    private int field3236;

    @OriginalMember(owner = "client!aq", name = "C", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!aq", name = "g", descriptor = "Lmi;")
    private class409 field3216;

    @OriginalMember(owner = "client!aq", name = "v", descriptor = "[I")
    public int[] field3231;

    @OriginalMember(owner = "client!aq", name = "J", descriptor = "[S")
    public static short[] field3245;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V", line = 10)
    public final synchronized void method1552(int arg0) {
        field3211++;
        if (this.field3214 || arg0 > -88) {
            return;
        }
        long var2 = class108.method902((byte) -93);
        try {
            if ((this.field3229 + 500000L) < var2) {
                this.field3229 = var2 - 500000L;
            }
            while (var2 > (this.field3229 + 5000L)) {
                this.method1565(256, -10101);
                this.field3229 += (long) (256000 / class413.field5774);
            }
        } catch (Exception var7) {
            this.field3229 = var2;
        }
        if (this.field3231 == null) {
            return;
        }
        try {
            if (this.field3244 != 0L) {
                if (this.field3244 > var2) {
                    return;
                }
                this.method1567(this.field3233);
                this.field3246 = true;
                this.field3244 = 0L;
            }
            int var4 = this.method1557();
            if (this.field3237 < (this.field3241 - var4)) {
                this.field3237 = this.field3241 - var4;
            }
            int var5 = this.field3236 + this.field3232;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field3233) {
                this.field3233 += 1024;
                if (this.field3233 > 16384) {
                    this.field3233 = 16384;
                }
                this.method1554();
                this.method1567(this.field3233);
                var4 = 0;
                this.field3246 = true;
                if (this.field3233 < var5 + 256) {
                    var5 = this.field3233 - 256;
                    this.field3236 = var5 - this.field3232;
                }
            }
            while (var4 < var5) {
                this.method1568(this.field3231, 256);
                var4 += 256;
                this.method1555();
            }
            if (var2 > this.field3243) {
                if (this.field3246) {
                    this.field3246 = false;
                } else if (this.field3237 == 0 && this.field3240 == 0) {
                    this.method1554();
                    this.field3244 = var2 + 2000L;
                    return;
                } else {
                    this.field3236 = Math.min(this.field3240, this.field3237);
                    this.field3240 = this.field3237;
                }
                this.field3243 = var2 + 2000L;
                this.field3237 = 0;
            }
            this.field3241 = var4;
        } catch (Exception var6) {
            this.method1554();
            this.field3244 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lbi;ZLjava/lang/String;)Ljava/lang/String;", line = 128)
    public static final String method1553(class139 arg0, boolean arg1, String arg2) {
        if (!arg1) {
            method1569(-51, 104);
        }
        field3218++;
        if (arg2.indexOf("%") == -1) {
            return arg2;
        }
        while (true) {
            int var3 = arg2.indexOf("%1");
            if (var3 == -1) {
                while (true) {
                    int var4 = arg2.indexOf("%2");
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg2.indexOf("%3");
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg2.indexOf("%4");
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg2.indexOf("%5");
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg2.indexOf("%dns");
                                                    if (var8 == -1) {
                                                        return arg2;
                                                    }
                                                    String var9 = "";
                                                    if (class164.field2419 != null) {
                                                        if (class164.field2419.field3341 == null) {
                                                            var9 = class346.method2189(class164.field2419.field3340, -88);
                                                        } else {
                                                            var9 = (String) class164.field2419.field3341;
                                                        }
                                                    }
                                                    arg2 = arg2.substring(0, var8) + var9 + arg2.substring(var8 + 4);
                                                }
                                            }
                                            arg2 = arg2.substring(0, var7) + class406.method2485(class436.method2708(4, 21721, arg0), true) + arg2.substring(var7 + 2);
                                        }
                                    }
                                    arg2 = arg2.substring(0, var6) + class406.method2485(class436.method2708(3, 21721, arg0), arg1) + arg2.substring(var6 + 2);
                                }
                            }
                            arg2 = arg2.substring(0, var5) + class406.method2485(class436.method2708(2, 21721, arg0), arg1) + arg2.substring(var5 + 2);
                        }
                    }
                    arg2 = arg2.substring(0, var4) + class406.method2485(class436.method2708(1, 21721, arg0), arg1) + arg2.substring(var4 + 2);
                }
            }
            arg2 = arg2.substring(0, var3) + class406.method2485(class436.method2708(0, 21721, arg0), true) + arg2.substring(var3 + 2);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "()V", line = 219)
    public void method1554() {
        field3217++;
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "()V", line = 229)
    public void method1555() throws Exception {
        field3213++;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IILmi;)V", line = 236)
    private final void method1556(int arg0, int arg1, class409 arg2) {
        field3220++;
        int var4 = arg1 >> 5;
        class409 var5 = this.field3234[var4];
        if (arg0 != 0) {
            return;
        }
        if (var5 == null) {
            this.field3239[var4] = arg2;
        } else {
            var5.field5724 = arg2;
        }
        this.field3234[var4] = arg2;
        arg2.field5723 = arg1;
    }

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "()I", line = 258)
    public int method1557() throws Exception {
        field3221++;
        return this.field3233;
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(I)V", line = 267)
    public final synchronized void method1558(int arg0) {
        field3222++;
        if (arg0 != 0) {
            return;
        }
        if (class452.field6558 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class452.field6558.field5886[var3] == this) {
                    class452.field6558.field5886[var3] = null;
                }
                if (class452.field6558.field5886[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class452.field6558.field5885 = true;
                while (class452.field6558.field5892) {
                    class229.method1541(100, 50L);
                }
                class452.field6558 = null;
            }
        }
        this.method1554();
        this.field3214 = true;
        this.field3231 = null;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Z)V", line = 315)
    public final synchronized void method1559(boolean arg0) {
        this.field3246 = arg0;
        field3212++;
        try {
            this.method1564();
        } catch (Exception var2) {
            this.method1554();
            this.field3244 = class108.method902((byte) -93) + 2000L;
        }
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(Z)V", line = 331)
    public static void method1560(boolean arg0) {
        if (arg0) {
            field3242 = null;
        }
        field3242 = null;
        field3245 = null;
        field3227 = null;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IB)V", line = 343)
    public static final void method1561(int arg0, byte arg1) {
        field3215++;
        class28.field484 = arg0;
        if (arg1 <= 90) {
            field3245 = null;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lmi;I)V", line = 354)
    public final synchronized void method1562(class409 arg0, int arg1) {
        if (arg1 == -1) {
            this.field3216 = arg0;
            field3223++;
        }
    }

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "(I)V", line = 365)
    public final void method1563(int arg0) {
        if (arg0 < 119) {
            this.field3216 = null;
        }
        this.field3246 = true;
        field3238++;
    }

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "()V", line = 376)
    public void method1564() throws Exception {
        field3230++;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)V", line = 384)
    private final void method1565(int arg0, int arg1) {
        field3225++;
        this.field3235 -= arg0;
        if (arg1 != -10101) {
            this.field3241 = -89;
        }
        if (this.field3235 < 0) {
            this.field3235 = 0;
        }
        if (this.field3216 != null) {
            this.field3216.method683(arg0);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 409)
    public void method1566(Component arg0) throws Exception {
        field3226++;
    }

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "(I)V", line = 417)
    public void method1567(int arg0) throws Exception {
        field3228++;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "([II)V", line = 426)
    private final void method1568(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class373.field5246) {
            var3 = arg1 << 1;
        }
        class152.method1173(arg0, 0, var3);
        this.field3235 -= arg1;
        if (this.field3216 != null && this.field3235 <= 0) {
            this.field3235 += class413.field5774 >> 4;
            class173.method1284(false, this.field3216);
            this.method1556(0, this.field3216.method710(), this.field3216);
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
                        class409 var10 = null;
                        class409 var11 = this.field3239[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class230 var12 = var11.field5726;
                                if (var12 == null || var12.field3191 <= var8) {
                                    var11.field5725 = true;
                                    int var13 = var11.method687();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3191 += var13;
                                    }
                                    if (var4 >= this.field3210) {
                                        break label107;
                                    }
                                    class409 var14 = var11.method708();
                                    if (var14 != null) {
                                        int var15 = var11.field5723;
                                        while (var14 != null) {
                                            this.method1556(0, var15 * var14.method710() >> 8, var14);
                                            var14 = var11.method690();
                                        }
                                    }
                                    class409 var16 = var11.field5724;
                                    var11.field5724 = null;
                                    if (var10 == null) {
                                        this.field3239[var7] = var16;
                                    } else {
                                        var10.field5724 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3234[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field5724;
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
                class409 var18 = this.field3239[var17];
                this.field3239[var17] = this.field3234[var17] = null;
                while (var18 != null) {
                    class409 var19 = var18.field5724;
                    var18.field5724 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3235 < 0) {
            this.field3235 = 0;
        }
        if (this.field3216 != null) {
            this.field3216.method713(arg0, 0, arg1);
        }
        this.field3229 = class108.method902((byte) -93);
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(II)Lml;", line = 587)
    public static final class452 method1569(int arg0, int arg1) {
        field3224++;
        class410 var2 = class385.field5421;
        class452 var3;
        synchronized (class385.field5421) {
            var3 = (class452) class385.field5421.method2537(arg0 ^ 0xFFFFF7E8, (long) arg1);
            if (arg0 != 2142) {
                field3227 = null;
            }
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class28.field488.method2633(class155.method1187(false, arg1), -1, class283.method1787(arg1, -111));
        class452 var5 = new class452();
        var5.field6549 = arg1;
        if (var4 != null) {
            var5.method2811(new class289(var4), 10);
        }
        var5.method2814(0);
        if (var5.field6529 != -1) {
            var5.method2810(method1569(2142, var5.field6581), method1569(2142, var5.field6529), 1);
        }
        if (var5.field6586 != -1) {
            var5.method2822(method1569(2142, var5.field6586), 5, method1569(arg0, var5.field6579));
        }
        if (!class367.field5045 && var5.field6569) {
            var5.field6567 = null;
            var5.field6534 = class213.field2958;
            var5.field6576 = 0;
            var5.field6545 = class155.field2356;
            var5.field6592 = false;
            var5.field6595 = class127.field1797;
        }
        class410 var6 = class385.field5421;
        synchronized (class385.field5421) {
            class385.field5421.method2542(var5, (byte) 119, (long) arg1);
            return var5;
        }
    }
}
