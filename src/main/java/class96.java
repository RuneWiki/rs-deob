import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class96 extends class28 {

    @OriginalMember(owner = "client!nf", name = "ib", descriptor = "I")
    private int field2240 = 0;

    @OriginalMember(owner = "client!nf", name = "ab", descriptor = "Lja;")
    public static class62 field2232 = class30.method243(43, "Bitte versuchen Sie es erneut)3");

    @OriginalMember(owner = "client!nf", name = "hb", descriptor = "Lja;")
    public static class62 field2239 = class30.method243(43, "Ausw-=hlen");

    @OriginalMember(owner = "client!nf", name = "gb", descriptor = "Llf;")
    public static class82 field2238 = new class82();

    @OriginalMember(owner = "client!nf", name = "jb", descriptor = "[I")
    public static int[] field2241 = new int[99];

    @OriginalMember(owner = "client!nf", name = "lb", descriptor = "Lja;")
    public static class62 field2243 = class30.method243(43, "<col=ff0000>");

    @OriginalMember(owner = "client!nf", name = "mb", descriptor = "Lja;")
    public static class62 field2244;

    @OriginalMember(owner = "client!nf", name = "nb", descriptor = "Lja;")
    public static class62 field2245;

    @OriginalMember(owner = "client!nf", name = "pb", descriptor = "Lja;")
    public static class62 field2247;

    @OriginalMember(owner = "client!nf", name = "ob", descriptor = "Ljf;")
    public static class68 field2246;

    @OriginalMember(owner = "client!nf", name = "qb", descriptor = "Lja;")
    public static class62 field2248;

    @OriginalMember(owner = "client!nf", name = "rb", descriptor = "Lba;")
    public static class8 field2249;

    @OriginalMember(owner = "client!nf", name = "V", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!nf", name = "W", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!nf", name = "X", descriptor = "I")
    public int field2229;

    @OriginalMember(owner = "client!nf", name = "Y", descriptor = "I")
    public int field2230;

    @OriginalMember(owner = "client!nf", name = "Z", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!nf", name = "bb", descriptor = "I")
    public int field2233;

    @OriginalMember(owner = "client!nf", name = "cb", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!nf", name = "db", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!nf", name = "eb", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!nf", name = "fb", descriptor = "I")
    public int field2237;

    @OriginalMember(owner = "client!nf", name = "kb", descriptor = "Lpd;")
    public static class108 field2242;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "(I)V")
    public static void method742(int arg0) {
        int var1 = 22 / ((63 - arg0) / 53);
        field2241 = null;
        field2243 = null;
        field2246 = null;
        field2238 = null;
        field2242 = null;
        field2248 = null;
        field2247 = null;
        field2232 = null;
        field2244 = null;
        field2239 = null;
        field2249 = null;
        field2245 = null;
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(II)V")
    private final void method743(int arg0, int arg1) {
        if (arg0 != 24956) {
            return;
        }
        double var3 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        field2236++;
        double var5 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var5;
        if (var3 < var5) {
            var9 = var3;
        }
        double var11 = var5;
        double var13 = 0.0D;
        if (var5 < var3) {
            var11 = var3;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var15 = 0.0D;
        if (var9 > var7) {
            var9 = var7;
        }
        double var17 = (var9 + var11) / 2.0D;
        this.field2233 = (int) (var17 * 256.0D);
        if (var9 != var11) {
            if (var5 == var11) {
                var13 = (var3 - var7) / (var11 - var9);
            } else if (var3 == var11) {
                var13 = (var7 - var5) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var5 - var3) / (var11 - var9) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (-var11 + 2.0D - var9);
            }
        }
        if (this.field2233 < 0) {
            this.field2233 = 0;
        } else if (this.field2233 > 255) {
            this.field2233 = 255;
        }
        double var19 = var13 / 6.0D;
        if (var17 > 0.5D) {
            this.field2229 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field2229 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field2229 < 1) {
            this.field2229 = 1;
        }
        this.field2237 = (int) (var15 * 256.0D);
        this.field2230 = (int) ((double) this.field2229 * var19);
        if (this.field2237 < 0) {
            this.field2237 = 0;
        } else if (this.field2237 > 255) {
            this.field2237 = 255;
        }
    }

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "(I)V")
    public static final void method744(int arg0) {
        if (arg0 <= 47) {
            return;
        }
        field2227++;
        class26.field616.method127((byte) -121);
        class71.field1800.method127((byte) -126);
        class60.field1470.method127((byte) -126);
        class4.field58.method127((byte) -118);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZII[B)Z")
    public static final boolean method745(boolean arg0, int arg1, int arg2, byte[] arg3) {
        int var4 = -1;
        field2235++;
        class128 var5 = new class128(arg3);
        boolean var6 = arg0;
        label68: while (true) {
            int var7 = var5.method1001((byte) -62);
            if (var7 == 0) {
                return var6;
            }
            var4 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var12;
                class65 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method1001((byte) -115);
                                        if (var17 == 0) {
                                            continue label68;
                                        }
                                        var5.method1025(255);
                                    }
                                    int var10 = var5.method1001((byte) -114);
                                    if (var10 == 0) {
                                        continue label68;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 >> 6 & 0x3F;
                                    var12 = var5.method1025(255) >> 2;
                                    int var13 = var8 & 0x3F;
                                    var14 = var11 + arg1;
                                    var15 = arg2 + var13;
                                } while (var14 <= 0);
                            } while (var15 <= 0);
                        } while (var14 >= 103);
                    } while (var15 >= 103);
                    var16 = class84.method653(6, var4);
                } while (var12 == 22 && class144.field3361 && var16.field1600 == 0 && var16.field1603 != 1 && !var16.field1584);
                var9 = true;
                if (!var16.method497(false)) {
                    var6 = false;
                    class132.field3009++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILs;B)V")
    public final void method746(int arg0, class128 arg1, byte arg2) {
        int var4 = -105 % ((-arg2 - 5) / 46);
        field2231++;
        while (true) {
            int var5 = arg1.method1025(255);
            if (var5 == 0) {
                return;
            }
            this.method747(arg0, (byte) -37, var5, arg1);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IBILs;)V")
    private final void method747(int arg0, byte arg1, int arg2, class128 arg3) {
        if (arg1 > -26) {
            this.method748((byte) 8);
        }
        field2228++;
        if (arg2 == 1) {
            this.field2240 = arg3.method1026((byte) 88);
        }
    }

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "(B)V")
    public final void method748(byte arg0) {
        this.method743(arg0 ^ 0xFFFF9EC0, this.field2240);
        field2234++;
        if (arg0 != -68) {
            this.field2237 = 5;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field2241[var1] = var0 / 4;
        }
        field2244 = class30.method243(43, "Schlie-8en");
        field2245 = class30.method243(43, ")3runescape)3com");
        field2247 = class30.method243(43, " (X");
        field2246 = new class68(4096);
        field2248 = class30.method243(43, "sl_button");
        field2249 = new class8();
    }
}
