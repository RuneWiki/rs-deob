import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class182 {

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "I")
    private int field2404 = 32;

    @OriginalMember(owner = "client!gw", name = "f", descriptor = "Z")
    private boolean field2408 = false;

    @OriginalMember(owner = "client!gw", name = "s", descriptor = "J")
    private long field2421 = class302.method1910(0);

    @OriginalMember(owner = "client!gw", name = "w", descriptor = "I")
    private int field2425 = 0;

    @OriginalMember(owner = "client!gw", name = "v", descriptor = "I")
    private int field2424 = 0;

    @OriginalMember(owner = "client!gw", name = "z", descriptor = "J")
    private long field2428 = 0L;

    @OriginalMember(owner = "client!gw", name = "t", descriptor = "I")
    private int field2422 = 0;

    @OriginalMember(owner = "client!gw", name = "B", descriptor = "[Lsia;")
    private class766[] field2430 = new class766[8];

    @OriginalMember(owner = "client!gw", name = "D", descriptor = "Z")
    private boolean field2432 = true;

    @OriginalMember(owner = "client!gw", name = "C", descriptor = "I")
    private int field2431 = 0;

    @OriginalMember(owner = "client!gw", name = "G", descriptor = "J")
    private long field2435 = 0L;

    @OriginalMember(owner = "client!gw", name = "y", descriptor = "[Lsia;")
    private class766[] field2427 = new class766[8];

    @OriginalMember(owner = "client!gw", name = "e", descriptor = "[[B")
    public static byte[][] field2407 = new byte[1000][];

    @OriginalMember(owner = "client!gw", name = "n", descriptor = "[[I")
    public static int[][] field2416 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!gw", name = "g", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!gw", name = "h", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!gw", name = "i", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!gw", name = "j", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!gw", name = "l", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!gw", name = "m", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!gw", name = "p", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!gw", name = "r", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!gw", name = "u", descriptor = "I")
    public int field2423;

    @OriginalMember(owner = "client!gw", name = "x", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!gw", name = "A", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!gw", name = "E", descriptor = "I")
    private int field2433;

    @OriginalMember(owner = "client!gw", name = "F", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!gw", name = "H", descriptor = "I")
    public int field2436;

    @OriginalMember(owner = "client!gw", name = "I", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!gw", name = "q", descriptor = "Lsia;")
    private class766 field2419;

    @OriginalMember(owner = "client!gw", name = "k", descriptor = "[I")
    public static int[] field2413;

    @OriginalMember(owner = "client!gw", name = "o", descriptor = "[I")
    public int[] field2417;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "()I", line = 7)
    public int method249() throws Exception {
        field2415++;
        return this.field2423;
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "()V", line = 16)
    public void method245() throws Exception {
        field2406++;
    }

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "()V", line = 23)
    public void method248() {
        field2410++;
    }

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "()V", line = 31)
    public void method247() throws Exception {
        field2434++;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V", line = 42)
    public void method246(int arg0) throws Exception {
        field2411++;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "([II)V", line = 55)
    private final void method1260(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class418.field6010) {
            var3 = arg1 << 1;
        }
        class278.method1797(arg0, 0, var3);
        this.field2425 -= arg1;
        if (this.field2419 != null && this.field2425 <= 0) {
            this.field2425 += class386.field5629 >> 4;
            class225.method1487(this.field2419, 1);
            this.method1267(this.field2419, this.field2419.method3895(), 8);
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
                        class766 var10 = null;
                        class766 var11 = this.field2427[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class1 var12 = var11.field10576;
                                if (var12 == null || var12.field1 <= var8) {
                                    var11.field10577 = true;
                                    int var13 = var11.method591();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1 += var13;
                                    }
                                    if (var4 >= this.field2404) {
                                        break label107;
                                    }
                                    class766 var14 = var11.method595();
                                    if (var14 != null) {
                                        int var15 = var11.field10579;
                                        while (var14 != null) {
                                            this.method1267(var14, var15 * var14.method3895() >> 8, 8);
                                            var14 = var11.method592();
                                        }
                                    }
                                    class766 var16 = var11.field10578;
                                    var11.field10578 = null;
                                    if (var10 == null) {
                                        this.field2427[var7] = var16;
                                    } else {
                                        var10.field10578 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2430[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field10578;
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
                class766 var18 = this.field2427[var17];
                this.field2427[var17] = this.field2430[var17] = null;
                while (var18 != null) {
                    class766 var19 = var18.field10578;
                    var18.field10578 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2425 < 0) {
            this.field2425 = 0;
        }
        if (this.field2419 != null) {
            this.field2419.method593(arg0, 0, arg1);
        }
        this.field2421 = class302.method1910(0);
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)V", line = 217)
    public final synchronized void method1261(int arg0) {
        field2418++;
        this.field2432 = true;
        try {
            this.method247();
            if (arg0 != -13368) {
                this.method1265(22);
            }
        } catch (Exception var2) {
            this.method248();
            this.field2435 = class302.method1910(0) + 2000L;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(B)V", line = 237)
    public final synchronized void method1262(byte arg0) {
        field2412++;
        if (this.field2408) {
            return;
        }
        long var2 = class302.method1910(0);
        try {
            if (var2 > this.field2421 + 6000L) {
                this.field2421 = var2 - 6000L;
            }
            while ((this.field2421 + 5000L) < var2) {
                this.method1264(-5798, 256);
                this.field2421 += (256000 / class386.field5629);
                var2 = class302.method1910(0);
            }
        } catch (Exception var8) {
            this.field2421 = var2;
        }
        if (this.field2417 == null) {
            return;
        }
        try {
            if (this.field2435 != 0L) {
                if (var2 < this.field2435) {
                    return;
                }
                this.method246(this.field2423);
                this.field2435 = 0L;
                this.field2432 = true;
            }
            int var4 = this.method249();
            if (this.field2422 < (this.field2431 - var4)) {
                this.field2422 = this.field2431 - var4;
            }
            int var5 = this.field2436 + this.field2433;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field2423 < (var5 + 256)) {
                this.field2423 += 1024;
                if (this.field2423 > 16384) {
                    this.field2423 = 16384;
                }
                this.method248();
                this.method246(this.field2423);
                var4 = 0;
                this.field2432 = true;
                if (this.field2423 < var5 + 256) {
                    var5 = this.field2423 - 256;
                    this.field2433 = var5 - this.field2436;
                }
            }
            while (var4 < var5) {
                this.method1260(this.field2417, 256);
                var4 += 256;
                this.method245();
            }
            if (this.field2428 < var2) {
                if (this.field2432) {
                    this.field2432 = false;
                } else if (this.field2422 == 0 && this.field2424 == 0) {
                    this.method248();
                    this.field2435 = var2 + 2000L;
                    return;
                } else {
                    this.field2433 = Math.min(this.field2424, this.field2422);
                    this.field2424 = this.field2422;
                }
                this.field2422 = 0;
                this.field2428 = var2 + 2000L;
            }
            this.field2431 = var4;
            int var6 = -20 / ((13 - arg0) / 44);
        } catch (Exception var7) {
            this.method248();
            this.field2435 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lsia;B)V", line = 357)
    public final synchronized void method1263(class766 arg0, byte arg1) {
        int var3 = 75 % ((43 - arg1) / 37);
        field2429++;
        this.field2419 = arg0;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(II)V", line = 368)
    private final void method1264(int arg0, int arg1) {
        if (arg0 != -5798) {
            this.field2422 = -25;
        }
        field2426++;
        this.field2425 -= arg1;
        if (this.field2425 < 0) {
            this.field2425 = 0;
        }
        if (this.field2419 != null) {
            this.field2419.method596(arg1);
        }
    }

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "(I)V", line = 387)
    public final synchronized void method1265(int arg0) {
        field2409++;
        if (class474.field6606 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class474.field6606.field6030[var3] == this) {
                    class474.field6606.field6030[var3] = null;
                }
                if (class474.field6606.field6030[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class474.field6606.field6031 = true;
                while (class474.field6606.field6036) {
                    class438.method2636(true, 50L);
                }
                class474.field6606 = null;
            }
        }
        this.method248();
        this.field2417 = null;
        if (arg0 != -23318) {
            method1266(-112);
        }
        this.field2408 = true;
    }

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "(I)V", line = 433)
    public static void method1266(int arg0) {
        field2407 = null;
        field2413 = null;
        field2416 = null;
        if (arg0 != 1) {
            method1268(98, 44);
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lsia;II)V", line = 460)
    private final void method1267(class766 arg0, int arg1, int arg2) {
        field2437++;
        int var4 = arg1 >> 5;
        class766 var5 = this.field2430[var4];
        if (var5 == null) {
            this.field2427[var4] = arg0;
        } else {
            var5.field10578 = arg0;
        }
        this.field2430[var4] = arg0;
        if (arg2 == 8) {
            arg0.field10579 = arg1;
        }
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(II)V", line = 483)
    public static final void method1268(int arg0, int arg1) {
        field2420++;
        class16 var2 = class94.method753(2, 13175, (long) arg1);
        var2.method118(585134072);
        if (arg0 <= 117) {
            field2407 = null;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(ZIZ)V", line = 497)
    public static final void method1269(boolean arg0, int arg1, boolean arg2) {
        field2405++;
        if (arg1 != -11692) {
            method1268(125, -115);
        }
        if (arg0) {
            class347.field5095--;
            if (class347.field5095 == 0) {
                class145.field2069 = null;
            }
        }
        if (!arg2) {
            return;
        }
        class476.field6619--;
        if (class476.field6619 == 0) {
            field2413 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 565)
    public void method244(Component arg0) throws Exception {
        field2403++;
    }
}
