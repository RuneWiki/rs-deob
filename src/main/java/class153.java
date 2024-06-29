import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class153 {

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    private int field2510 = -1;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    private int field2506 = 0;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "Lj;")
    private class269 field2519 = new class269();

    @OriginalMember(owner = "client!df", name = "u", descriptor = "Z")
    public boolean field2524 = false;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    private int field2512;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "[[[I")
    private int[][][] field2513;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    private int field2515;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "[Lpj;")
    private class171[] field2505;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public static int field2520 = 0;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "Lj;")
    public static class269 field2518 = new class269();

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "Lcm;")
    public static class181 field2507;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "[I")
    public static int[] field2509;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BI)[[I", line = 9)
    public final int[][] method938(byte arg0, int arg1) {
        if (arg0 != -6) {
            this.method947((byte) 115);
        }
        field2521++;
        if (this.field2515 == this.field2512) {
            this.field2524 = this.field2505[arg1] == null;
            this.field2505[arg1] = class306.field5258;
            return this.field2513[arg1];
        } else if (this.field2512 == 1) {
            this.field2524 = this.field2510 != arg1;
            this.field2510 = arg1;
            return this.field2513[0];
        } else {
            class171 var3 = this.field2505[arg1];
            if (var3 == null) {
                this.field2524 = true;
                if (this.field2512 > this.field2506) {
                    var3 = new class171(arg1, this.field2506);
                    this.field2506++;
                } else {
                    class171 var4 = (class171) this.field2519.method1816(128);
                    var3 = new class171(arg1, var4.field2885);
                    this.field2505[var4.field2884] = null;
                    var4.method557((byte) -89);
                }
                this.field2505[arg1] = var3;
            } else {
                this.field2524 = false;
            }
            this.field2519.method1815(var3, arg0 + 6);
            return this.field2513[var3.field2885];
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IBIIII)V", line = 84)
    public static final void method939(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        class75.field1316 = arg4;
        class36.field533 = arg0;
        field2514++;
        if (arg1 >= -66) {
            field2509 = (int[]) null;
        }
        class45.field615 = arg3;
        class277.field4629 = arg2;
        class128.field2134 = arg5;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILfe;)V", line = 100)
    public static final void method940(int arg0, class229 arg1) {
        if (arg0 != 7930) {
            field2518 = (class269) null;
        }
        field2525++;
        while (true) {
            while (arg1.field3905 < arg1.field3879.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method1535((byte) 72) == 1) {
                    var2 = true;
                    var4 = arg1.method1535((byte) 75);
                    var3 = arg1.method1535((byte) 88);
                }
                int var5 = arg1.method1535((byte) 70);
                int var6 = arg1.method1535((byte) 69);
                int var7 = var5 * 64 - class123.field2045;
                int var8 = class134.field2254 - ((var6 * 64) + 1 - class110.field1865);
                if (var7 >= 0 && (var8 - 63) >= 0 && class77.field1345 > var7 + 63 && var8 < class134.field2254) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= (var4 * 8) && var11 < (var4 * 8 + 8) && var3 * 8 <= var12 && var3 * 8 + 8 > var12) {
                                byte var13 = arg1.method1497(false);
                                if (var13 != 0) {
                                    if (class260.field4416[var9][var10] == null) {
                                        class260.field4416[var9][var10] = new byte[4096];
                                    }
                                    class260.field4416[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method1497(false);
                                    if (class180.field3112[var9][var10] == null) {
                                        class180.field3112[var9][var10] = new byte[4096];
                                    }
                                    class180.field3112[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method1497(false);
                        if (var16 != 0) {
                            arg1.field3905++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(III)V", line = 401)
    public class153(int arg0, int arg1, int arg2) {
        this.field2512 = arg0;
        this.field2513 = new int[this.field2512][3][arg2];
        this.field2515 = arg1;
        this.field2505 = new class171[this.field2515];
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILjava/lang/String;)Lbe;", line = 204)
    public static final class283 method941(int arg0, String arg1) {
        field2522++;
        byte[] var2 = arg1.getBytes();
        int var3 = var2.length;
        class283 var4 = new class283();
        int var5 = 119 / ((arg0 - 77) / 48);
        int var6 = 0;
        var4.field4843 = new byte[var3];
        while (var3 > var6) {
            int var7 = var2[var6++] & 0xFF;
            if (var7 <= 45 && var7 >= 40) {
                if (var6 >= var3) {
                    break;
                }
                int var8 = var2[var6++] & 0xFF;
                var4.field4843[var4.field4812++] = (byte) ((var7 - 40) * 43 + var8 - 48);
            } else if (var7 != 0) {
                var4.field4843[var4.field4812++] = (byte) var7;
            }
        }
        var4.method1900((byte) 100);
        return var4.method1903((byte) -107);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BLek;Lek;)V", line = 254)
    public static final void method942(byte arg0, class172 arg1, class172 arg2) {
        class182.field3126 = arg1;
        class140.field2333 = arg2;
        if (arg0 == -39) {
            field2523++;
            class12.field114 = class140.field2333.method1108(3, -128);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)V", line = 274)
    public static final void method943(int arg0, int arg1) {
        field2511++;
        if (class92.method588(arg1, -60)) {
            if (arg0 != 26393) {
                field2518 = (class269) null;
            }
            class141.method891(2047, class122.field2036[arg1], -1);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BZ)V", line = 292)
    public static final void method944(byte arg0, boolean arg1) {
        class97.field1659 = new int[104];
        class248.field4236 = new int[104];
        class124.field2068 = 99;
        field2517++;
        class92.field1573 = new int[104];
        class288.field4891 = new int[104];
        class180.field3101 = new int[104];
        byte var2;
        if (arg1) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class177.field3035 = new byte[var2][104][104];
        class122.field2034 = new byte[var2][104][104];
        class82.field1398 = new int[var2][105][105];
        if (arg0 < 16) {
            field2507 = (class181) null;
        }
        class301.field5092 = new byte[var2][104][104];
        class111.field1877 = new byte[var2][105][105];
        class54.field736 = new byte[var2][104][104];
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V", line = 320)
    public static void method945(boolean arg0) {
        field2509 = null;
        if (!arg0) {
            field2518 = null;
            field2507 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Z)V", line = 344)
    public final void method946(boolean arg0) {
        for (int var2 = 0; var2 < this.field2512; var2++) {
            this.field2513[var2][0] = null;
            this.field2513[var2][1] = null;
            this.field2513[var2][2] = null;
            this.field2513[var2] = (int[][]) null;
        }
        this.field2505 = null;
        if (arg0) {
            field2516++;
            this.field2513 = (int[][][]) null;
            this.field2519.method1810(-116);
            this.field2519 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)[[[I", line = 378)
    public final int[][][] method947(byte arg0) {
        field2504++;
        if (this.field2515 != this.field2512) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0 == -80) {
            for (int var2 = 0; var2 < this.field2512; var2++) {
                this.field2505[var2] = class306.field5258;
            }
            return this.field2513;
        } else {
            return (int[][][]) ((int[][][]) null);
        }
    }
}
