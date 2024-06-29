import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class13 {

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "Z")
    private boolean field259 = false;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
    private int field260 = 32;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "J")
    private long field261 = class264.method1778(6573);

    @OriginalMember(owner = "client!fg", name = "B", descriptor = "Z")
    private boolean field278 = true;

    @OriginalMember(owner = "client!fg", name = "A", descriptor = "J")
    private long field277 = 0L;

    @OriginalMember(owner = "client!fg", name = "E", descriptor = "[Lvk;")
    private class37[] field281 = new class37[8];

    @OriginalMember(owner = "client!fg", name = "H", descriptor = "I")
    private int field284 = 0;

    @OriginalMember(owner = "client!fg", name = "K", descriptor = "J")
    private long field287 = 0L;

    @OriginalMember(owner = "client!fg", name = "G", descriptor = "[Lvk;")
    private class37[] field283 = new class37[8];

    @OriginalMember(owner = "client!fg", name = "F", descriptor = "I")
    private int field282 = 0;

    @OriginalMember(owner = "client!fg", name = "J", descriptor = "I")
    private int field286 = 0;

    @OriginalMember(owner = "client!fg", name = "D", descriptor = "I")
    private int field280 = 0;

    @OriginalMember(owner = "client!fg", name = "s", descriptor = "Ljava/lang/String;")
    public static String field269 = "";

    @OriginalMember(owner = "client!fg", name = "y", descriptor = "Ljava/lang/String;")
    public static String field275 = "red:";

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!fg", name = "t", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!fg", name = "v", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!fg", name = "w", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!fg", name = "x", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!fg", name = "C", descriptor = "I")
    public int field279;

    @OriginalMember(owner = "client!fg", name = "I", descriptor = "I")
    private int field285;

    @OriginalMember(owner = "client!fg", name = "L", descriptor = "I")
    public int field288;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "Lvk;")
    private class37 field258;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "[I")
    public int[] field257;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "[I")
    public static int[] field264;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "()V")
    public void method106() throws Exception {
        field263++;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "()V")
    public void method107() {
        field268++;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
    public static void method108(int arg0) {
        field264 = null;
        field275 = null;
        field269 = null;
        if (arg0 < 20) {
            field275 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V")
    public final synchronized void method109(int arg0) {
        this.field278 = true;
        field256++;
        try {
            this.method106();
            if (arg0 != -20555) {
                this.method107();
            }
        } catch (Exception var2) {
            this.method107();
            this.field277 = class264.method1778(6573) + 2000L;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method110(Component arg0) throws Exception {
        field267++;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IILgi;Lgi;I)Lge;")
    public static final class73 method111(int arg0, int arg1, class164 arg2, class164 arg3, int arg4) {
        field266++;
        if (class284.method1927(arg4, (byte) -78, arg1, arg2)) {
            if (arg0 != -21486) {
                method120((int[][]) null, (byte) -95);
            }
            return class17.method132(arg3.method1156(arg4, arg1, (byte) -16), (byte) -92);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "([II)V")
    private final void method112(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class253.field4144) {
            var3 = arg1 << 1;
        }
        class282.method1922(arg0, 0, var3);
        this.field282 -= arg1;
        if (this.field258 != null && this.field282 <= 0) {
            this.field282 += class296.field4841 >> 4;
            class296.method2033(this.field258, 0);
            this.method118(this.field258.method271(), -98, this.field258);
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
                        class37 var10 = null;
                        class37 var11 = this.field283[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class204 var12 = var11.field581;
                                if (var12 == null || var12.field3294 <= var8) {
                                    var11.field579 = true;
                                    int var13 = var11.method268();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3294 += var13;
                                    }
                                    if (var4 >= this.field260) {
                                        break label107;
                                    }
                                    class37 var14 = var11.method266();
                                    if (var14 != null) {
                                        int var15 = var11.field582;
                                        while (var14 != null) {
                                            this.method118(var15 * var14.method271() >> 8, 103, var14);
                                            var14 = var11.method269();
                                        }
                                    }
                                    class37 var16 = var11.field580;
                                    var11.field580 = null;
                                    if (var10 == null) {
                                        this.field283[var7] = var16;
                                    } else {
                                        var10.field580 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field281[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field580;
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
                class37 var18 = this.field283[var17];
                this.field283[var17] = this.field281[var17] = null;
                while (var18 != null) {
                    class37 var19 = var18.field580;
                    var18.field580 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field282 < 0) {
            this.field282 = 0;
        }
        if (this.field258 != null) {
            this.field258.method265(arg0, 0, arg1);
        }
        this.field261 = class264.method1778(6573);
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(I)V")
    public final void method113(int arg0) {
        this.field278 = true;
        field276++;
        if (arg0 != 0) {
            this.field259 = false;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
    public final synchronized void method114(byte arg0) {
        field254++;
        if (class285.field4627 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class285.field4627.field99[var3] == this) {
                    class285.field4627.field99[var3] = null;
                }
                if (class285.field4627.field99[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class285.field4627.field97 = true;
                while (class285.field4627.field101) {
                    class33.method250(50L, 256);
                }
                class285.field4627 = null;
            }
        }
        this.method107();
        int var4 = 58 / ((33 - arg0) / 48);
        this.field259 = true;
        this.field257 = null;
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(I)V")
    public final synchronized void method115(int arg0) {
        field265++;
        if (this.field259) {
            return;
        }
        long var2 = class264.method1778(6573);
        try {
            if ((this.field261 + 500000L) < var2) {
                this.field261 = var2 - 500000L;
            }
            while (this.field261 + 5000L < var2) {
                this.method121(256, (byte) 104);
                this.field261 += (long) (256000 / class296.field4841);
            }
        } catch (Exception var7) {
            this.field261 = var2;
        }
        if (this.field257 == null) {
            return;
        }
        try {
            if (this.field277 != 0L) {
                if (this.field277 > var2) {
                    return;
                }
                this.method119(this.field279);
                this.field278 = true;
                this.field277 = 0L;
            }
            int var4 = this.method123();
            if (this.field286 < this.field280 - var4) {
                this.field286 = this.field280 - var4;
            }
            int var5 = this.field288 + this.field285;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (arg0 != 255) {
                this.field281 = null;
            }
            if (this.field279 < (var5 + 256)) {
                this.field279 += 1024;
                var4 = 0;
                if (this.field279 > 16384) {
                    this.field279 = 16384;
                }
                this.method107();
                this.method119(this.field279);
                if (var5 + 256 > this.field279) {
                    var5 = this.field279 - 256;
                    this.field285 = var5 - this.field288;
                }
                this.field278 = true;
            }
            while (var5 > var4) {
                var4 += 256;
                this.method112(this.field257, 256);
                this.method116();
            }
            if (this.field287 < var2) {
                if (this.field278) {
                    this.field278 = false;
                } else if (this.field286 == 0 && this.field284 == 0) {
                    this.method107();
                    this.field277 = var2 + 2000L;
                    return;
                } else {
                    this.field285 = Math.min(this.field284, this.field286);
                    this.field284 = this.field286;
                }
                this.field287 = var2 + 2000L;
                this.field286 = 0;
            }
            this.field280 = var4;
        } catch (Exception var6) {
            this.method107();
            this.field277 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "()V")
    public void method116() throws Exception {
        field262++;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lvk;I)V")
    public final synchronized void method117(class37 arg0, int arg1) {
        if (arg1 < 76) {
            this.field280 = -53;
        }
        this.field258 = arg0;
        field255++;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IILvk;)V")
    private final void method118(int arg0, int arg1, class37 arg2) {
        field251++;
        int var4 = arg0 >> 5;
        class37 var5 = this.field281[var4];
        int var6 = 116 % ((-arg1 - 36) / 32);
        if (var5 == null) {
            this.field283[var4] = arg2;
        } else {
            var5.field580 = arg2;
        }
        this.field281[var4] = arg2;
        arg2.field582 = arg0;
    }

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "(I)V")
    public void method119(int arg0) throws Exception {
        field253++;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "([[IB)V")
    public static final void method120(int[][] arg0, byte arg1) {
        int var2 = 2 % ((26 - arg1) / 56);
        field271++;
        class232.field3629 = arg0;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IB)V")
    private final void method121(int arg0, byte arg1) {
        this.field282 -= arg0;
        if (this.field282 < 0) {
            this.field282 = 0;
        }
        field252++;
        if (arg1 <= 48) {
            this.method115(9);
        }
        if (this.field258 != null) {
            this.field258.method267(arg0);
        }
    }

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "(I)V")
    public static final void method122(int arg0) {
        field273++;
        class202.field3279.method1873(-7401);
        if (arg0 >= -35) {
            field264 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "()I")
    public int method123() throws Exception {
        field274++;
        return this.field279;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lgi;BII)Lrk;")
    public static final class292 method124(class164 arg0, byte arg1, int arg2, int arg3) {
        field270++;
        if (arg1 >= -56) {
            return null;
        } else if (class284.method1927(arg3, (byte) -78, arg2, arg0)) {
            return class259.method1743(0);
        } else {
            return null;
        }
    }
}
