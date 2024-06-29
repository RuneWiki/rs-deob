import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class95 extends class141 {

    @OriginalMember(owner = "client!o", name = "G", descriptor = "[J")
    private long[] field2387 = new long[10];

    @OriginalMember(owner = "client!o", name = "v", descriptor = "Lrd;")
    public static class117 field2376 = method812("Sichtbare Karte vorbereitet)3", (byte) 8);

    @OriginalMember(owner = "client!o", name = "B", descriptor = "Lrd;")
    public static class117 field2382 = method812(" )2> ", (byte) 8);

    @OriginalMember(owner = "client!o", name = "A", descriptor = "Lrd;")
    private static class117 field2381 = method812("Malformed login packet)3", (byte) 8);

    @OriginalMember(owner = "client!o", name = "y", descriptor = "[I")
    public static int[] field2379 = new int[32768];

    @OriginalMember(owner = "client!o", name = "M", descriptor = "Lrd;")
    public static class117 field2393 = field2381;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "I")
    private int field2373;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "I")
    private int field2377;

    @OriginalMember(owner = "client!o", name = "x", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!o", name = "C", descriptor = "I")
    private int field2383;

    @OriginalMember(owner = "client!o", name = "D", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!o", name = "E", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!o", name = "F", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!o", name = "H", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!o", name = "I", descriptor = "I")
    private int field2389;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "J")
    private long field2392;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
    public static final void method811(byte arg0) {
        if (client.field624 == 1) {
            if (class66.field1873 >= 6 && class66.field1873 <= 106 && class68.field1909 >= 467 && class68.field1909 <= 499) {
                class18.field458 = true;
                class71.field1976++;
                class18.field462 = (class18.field462 + 1) % 4;
                class115.field2812 = true;
                class25.field754.method739(false, 51);
                class25.field754.method162(class18.field462, -23339);
                class25.field754.method162(class42.field1202, -23339);
                class25.field754.method162(class77.field2095, -23339);
            }
            if (class66.field1873 >= 135 && class66.field1873 <= 235 && class68.field1909 >= 467 && class68.field1909 <= 499) {
                class71.field1976++;
                class18.field458 = true;
                class42.field1202 = (class42.field1202 + 1) % 3;
                class115.field2812 = true;
                class25.field754.method739(false, 51);
                class25.field754.method162(class18.field462, arg0 - 23339);
                class25.field754.method162(class42.field1202, -23339);
                class25.field754.method162(class77.field2095, -23339);
            }
            if (class66.field1873 >= 273 && class66.field1873 <= 373 && class68.field1909 >= 467 && class68.field1909 <= 499) {
                class115.field2812 = true;
                class77.field2095 = (class77.field2095 + 1) % 3;
                class71.field1976++;
                class18.field458 = true;
                class25.field754.method739(false, 51);
                class25.field754.method162(class18.field462, arg0 - 23339);
                class25.field754.method162(class42.field1202, -23339);
                class25.field754.method162(class77.field2095, arg0 ^ 0xFFFFA4D5);
            }
            if (class66.field1873 >= 412 && class66.field1873 <= 512 && class68.field1909 >= 467 && class68.field1909 <= 499) {
                if (class121.field2977 == -1) {
                    class20.method229((byte) -14);
                    if (class44.field1255 != -1) {
                        class110.field2760 = false;
                        class135.field3224 = class121.field2977 = class44.field1255;
                        class134.field3202 = class134.field3215;
                    }
                } else {
                    class52.method572(class134.field3215, -1, 0, class43.field1230);
                    if (class22.field647 != null) {
                        class52.method572(class134.field3215, -1, 0, class22.field647);
                    }
                }
            }
        }
        if (arg0 != 0) {
            method818(null, 29, 50, 91, 66, -73, 116, -88, 18);
        }
        field2388++;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/lang/String;B)Lrd;")
    public static final class117 method812(String arg0, byte arg1) {
        field2380++;
        byte[] var2 = arg0.getBytes();
        int var3 = var2.length;
        class117 var4 = new class117();
        var4.field2851 = new byte[var3];
        if (arg1 != 8) {
            method816(99, null, true);
        }
        int var5 = 0;
        while (var3 > var5) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 <= var5) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field2851[var4.field2858++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var4.field2851[var4.field2858++] = (byte) var6;
            }
        }
        var4.method943((byte) 54);
        return var4.method975((byte) 81);
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(B)V")
    public static void method813(byte arg0) {
        field2382 = null;
        if (arg0 != -98) {
            method816(-68, null, false);
        }
        field2376 = null;
        field2379 = null;
        field2393 = null;
        field2381 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BII)I")
    public final int method814(byte arg0, int arg1, int arg2) {
        if (arg0 != 80) {
            return 95;
        }
        int var4 = this.field2373;
        int var5 = this.field2389;
        this.field2389 = 1;
        this.field2373 = 300;
        this.field2392 = class105.method875((byte) -80);
        field2386++;
        if (this.field2387[this.field2383] == 0L) {
            this.field2389 = var5;
            this.field2373 = var4;
        } else if (this.field2392 > this.field2387[this.field2383]) {
            this.field2373 = (int) ((long) (arg2 * 2560) / (this.field2392 - this.field2387[this.field2383]));
        }
        if (this.field2373 < 25) {
            this.field2373 = 25;
        }
        if (this.field2373 > 256) {
            this.field2373 = 256;
            this.field2389 = (int) ((long) arg2 - (this.field2392 - this.field2387[this.field2383]) / 10L);
        }
        if (arg2 < this.field2389) {
            this.field2389 = arg2;
        }
        this.field2387[this.field2383] = this.field2392;
        this.field2383 = (this.field2383 + 1) % 10;
        if (this.field2389 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field2387[var6] != 0L) {
                    this.field2387[var6] += this.field2389;
                }
            }
        }
        int var7 = 0;
        if (this.field2389 < arg1) {
            this.field2389 = arg1;
        }
        class60.method611((long) this.field2389, true);
        while (this.field2377 < 256) {
            var7++;
            this.field2377 += this.field2373;
        }
        this.field2377 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public final void method815(int arg0) {
        field2374++;
        this.field2389 = 1;
        this.field2373 = 256;
        this.field2377 = 0;
        this.field2392 = class105.method875((byte) -80);
        if (arg0 > -121) {
            field2382 = null;
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field2387[var2] = this.field2392;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILaf;Z)V")
    public static final void method816(int arg0, class7 arg1, boolean arg2) {
        if (arg2) {
            field2393 = null;
        }
        field2384++;
        if (class101.field2538 == null) {
            class45.method491(0, -700420656, (byte) 0, null, 255, true, 255);
            class77.field2110[arg0] = arg1;
        } else {
            class101.field2538.field314 = arg0 * 4 + 5;
            int var3 = class101.field2538.method121((byte) -108);
            arg1.method54(1536, var3);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V")
    public final void method817(boolean arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            this.field2387[var2] = 0L;
        }
        if (arg0) {
            method816(36, null, false);
        }
        field2390++;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
    public class95() {
        this.method815(-122);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lwa;IIIIIIII)V")
    public static final void method818(class144 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg3 != 4) {
            return;
        }
        if (class107.field2668) {
            class72.field2021 = 32;
        } else {
            class72.field2021 = 0;
        }
        class107.field2668 = false;
        field2391++;
        if (arg8 >= arg6 && arg8 < arg6 + 16 && arg4 >= arg5 && arg5 + 16 > arg4) {
            if (arg2 == 2 || arg2 == 3) {
                class18.field458 = true;
            }
            arg0.field3543 -= class14.field336 * 4;
            if (arg2 == 1) {
                class13.field262 = true;
            }
        } else if (arg8 >= arg6 && arg6 + 16 > arg8 && arg7 + arg5 - 16 <= arg4 && arg5 + arg7 > arg4) {
            arg0.field3543 += class14.field336 * 4;
            if (arg2 == 1) {
                class13.field262 = true;
            }
            if (arg2 == 2 || arg2 == 3) {
                class18.field458 = true;
            }
        } else if (arg8 >= arg6 - class72.field2021 && arg6 + class72.field2021 + 16 > arg8 && arg4 >= arg5 + 16 && arg4 < arg5 + arg7 - 16 && class14.field336 > 0) {
            if (arg2 == 2 || arg2 == 3) {
                class18.field458 = true;
            }
            if (arg2 == 1) {
                class13.field262 = true;
            }
            class107.field2668 = true;
            int var9 = (arg7 - 32) * arg7 / arg1;
            if (var9 < 8) {
                var9 = 8;
            }
            int var10 = arg7 - var9 - 32;
            int var11 = arg4 - arg5 - var9 / 2 - 16;
            arg0.field3543 = (arg1 - arg7) * var11 / var10;
        }
        if (class86.field2251 == 0) {
            return;
        }
        int var12 = arg0.field3437;
        if (arg2 == -1) {
            var12 = 479;
        }
        if (arg8 < arg6 - var12 || arg5 > arg4 || arg6 + 16 <= arg8 || arg5 + arg7 < arg4) {
            return;
        }
        arg0.field3543 += class86.field2251 * 45;
        if (arg2 == 1) {
            class13.field262 = true;
        }
        if (arg2 == 2 || arg2 == 3) {
            class18.field458 = true;
        }
        return;
    }
}
