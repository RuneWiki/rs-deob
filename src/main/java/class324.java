import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class324 {

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public int field5311 = -1;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "Z")
    public boolean field5310 = true;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public int field5312 = 128;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    private int field5321 = 0;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "[Z")
    public static boolean[] field5309 = new boolean[100];

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "D")
    public static double field5323 = -1.0D;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public int field5313;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field5314;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public int field5316;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public int field5317;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
    public int field5320;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
    public static int field5322;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "I")
    public static int field5324;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IB)V", line = 5)
    private final void method2316(int arg0, byte arg1) {
        field5324++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg0 & 0xFF9D) >> 8) / 256.0D;
        double var7 = var3;
        double var9 = (double) (arg0 & 0xFF) / 256.0D;
        if (var3 > var5) {
            var7 = var5;
        }
        if (var7 > var9) {
            var7 = var9;
        }
        if (arg1 >= -17) {
            method2322((class221) null, (class221) null, (class230) null, -14, (class221) null);
        }
        double var11 = var3;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var9 > var11) {
            var11 = var9;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var7 + var11) / 2.0D;
        if (var7 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var7) / (var7 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var7) / (2.0D - var11 - var7);
            }
            if (var3 == var11) {
                var13 = (var5 - var9) / (var11 - var7);
            } else if (var5 == var11) {
                var13 = (var9 - var3) / (var11 - var7) + 2.0D;
            } else if (var9 == var11) {
                var13 = (var3 - var5) / (var11 - var7) + 4.0D;
            }
        }
        this.field5313 = (int) (var15 * 256.0D);
        if (this.field5313 < 0) {
            this.field5313 = 0;
        } else if (this.field5313 > 255) {
            this.field5313 = 255;
        }
        if (var17 > 0.5D) {
            this.field5316 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field5316 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field5316 < 1) {
            this.field5316 = 1;
        }
        double var19 = var13 / 6.0D;
        this.field5317 = (int) ((double) this.field5316 * var19);
        this.field5320 = (int) (var17 * 256.0D);
        if (this.field5320 < 0) {
            this.field5320 = 0;
        } else if (this.field5320 > 255) {
            this.field5320 = 255;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILfh;BI)V", line = 102)
    private final void method2317(int arg0, class313 arg1, byte arg2, int arg3) {
        if (arg3 == 1) {
            this.field5321 = arg1.method2249(arg2 - 196);
            this.method2316(this.field5321, (byte) -40);
        } else if (arg3 == 2) {
            this.field5311 = arg1.method2250(-1613178296);
            if (this.field5311 == 65535) {
                this.field5311 = -1;
            }
        } else if (arg3 == 3) {
            this.field5312 = arg1.method2250(-1613178296);
        } else if (arg3 == 4) {
            this.field5310 = false;
        }
        if (arg2 != 100) {
            this.method2319((class313) null, -21, 125);
        }
        field5318++;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lfo;B)V", line = 149)
    public static final void method2318(class239 arg0, byte arg1) {
        field5322++;
        for (int var2 = 0; var2 < class132.field2023.length; var2++) {
            class132.field2023[var2] = 0;
        }
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var5 = (int) (Math.random() * 128.0D * (double) var3);
            class132.field2023[var5] = (int) (Math.random() * 284.0D);
        }
        int var6 = 0;
        if (arg1 >= -91) {
            return;
        }
        while (var6 < 20) {
            for (int var7 = 1; var7 < (var3 - 1); var7++) {
                for (int var8 = 1; var8 < 127; var8++) {
                    int var9 = (var7 << 7) + var8;
                    class296.field4917[var9] = (class132.field2023[var9 + 128] + class132.field2023[var9 - 128] + class132.field2023[var9 + -1] + class132.field2023[var9 + 1]) / 4;
                }
            }
            int[] var10 = class132.field2023;
            class132.field2023 = class296.field4917;
            class296.field4917 = var10;
            var6++;
        }
        if (arg0 == null) {
            return;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg0.field2913; var12++) {
            for (int var13 = 0; var13 < arg0.field2915; var13++) {
                if (arg0.field3776[var11++] != 0) {
                    int var14 = arg0.field2907 + var13 + 16;
                    int var15 = arg0.field2916 + var12 + 16;
                    int var16 = (var15 << 7) + var14;
                    class132.field2023[var16] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lfh;II)V", line = 248)
    public final void method2319(class313 arg0, int arg1, int arg2) {
        if (arg1 != -428) {
            this.method2317(6, (class313) null, (byte) -84, -126);
        }
        field5315++;
        while (true) {
            int var4 = arg0.method2224(-122);
            if (var4 == 0) {
                return;
            }
            this.method2317(arg2, arg0, (byte) 100, var4);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V", line = 278)
    public static void method2320(int arg0) {
        if (arg0 == 13468) {
            field5309 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)V", line = 288)
    public static final void method2321(int arg0, int arg1) {
        class48.field691.method645(arg1, (byte) -120);
        if (arg0 < -8) {
            class154.field2511.method645(arg1, (byte) -63);
            field5319++;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lnm;Lnm;Llm;ILnm;)Z", line = 300)
    public static final boolean method2322(class221 arg0, class221 arg1, class230 arg2, int arg3, class221 arg4) {
        field5314++;
        class20.field245 = arg0;
        class228.field3583 = arg2;
        class340.field5478 = arg1;
        class187.field2908 = arg4;
        if (arg3 != 19062) {
            method2322((class221) null, (class221) null, (class230) null, 50, (class221) null);
        }
        return true;
    }
}
