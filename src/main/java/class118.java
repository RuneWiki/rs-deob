import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class118 {

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    private int field2377 = 0;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    private int field2376;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
    private int field2388;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
    private int field2384;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "[[I")
    public int[][] field2373;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "Ljd;")
    public static class92 field2368 = class202.method1325((byte) 90, "titlebutton");

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "[I")
    public static int[] field2378 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "Lig;")
    public static class86 field2381 = new class86();

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "[B")
    public static byte[] field2392 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "Ljd;")
    public static class92 field2396 = class202.method1325((byte) 90, "Keine Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!mb", name = "G", descriptor = "Z")
    public static boolean field2399 = false;

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "Ljd;")
    public static class92 field2398 = class202.method1325((byte) 90, "scape main");

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "Ljd;")
    public static class92 field2395 = class202.method1325((byte) 90, "<img=0>");

    @OriginalMember(owner = "client!mb", name = "K", descriptor = "Ljd;")
    private static class92 field2403 = class202.method1325((byte) 90, "RuneScape has been updated(Q");

    @OriginalMember(owner = "client!mb", name = "J", descriptor = "I")
    public static int field2402 = -1;

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "Ljd;")
    public static class92 field2393 = field2403;

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "[I")
    public static int[] field2404 = new int[5];

    @OriginalMember(owner = "client!mb", name = "I", descriptor = "[[B")
    public static byte[][] field2401 = new byte[50][];

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "Ldb;")
    public static class33 field2394 = new class33(8);

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "Lnh;")
    public static class133 field2400;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "[S")
    public static short[] field2385;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZZIII)V")
    public final void method790(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = arg3 - this.field2377;
        field2387++;
        int var8 = arg0 - this.field2388;
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method791(128, var8, (byte) 127, var7);
                this.method791(8, var8, (byte) 66, var7 - 1);
            }
            if (arg4 == 1) {
                this.method791(2, var8, (byte) 50, var7);
                this.method791(32, var8 + 1, (byte) 112, var7);
            }
            if (arg4 == 2) {
                this.method791(8, var8, (byte) 95, var7);
                this.method791(128, var8, (byte) 48, var7 + 1);
            }
            if (arg4 == 3) {
                this.method791(32, var8, (byte) 125, var7);
                this.method791(2, var8 - 1, (byte) 102, var7);
            }
        }
        if (arg2) {
            method804(-87, 119, -55, 61);
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method791(1, var8, (byte) 71, var7);
                this.method791(16, var8 + 1, (byte) 69, var7 - 1);
            }
            if (arg4 == 1) {
                this.method791(4, var8, (byte) 120, var7);
                this.method791(64, var8 + 1, (byte) 72, var7 + 1);
            }
            if (arg4 == 2) {
                this.method791(16, var8, (byte) 57, var7);
                this.method791(1, var8 - 1, (byte) 91, var7 + 1);
            }
            if (arg4 == 3) {
                this.method791(64, var8, (byte) 64, var7);
                this.method791(4, var8 - 1, (byte) 124, var7 - 1);
            }
        }
        if (arg5 == 2) {
            if (arg4 == 0) {
                this.method791(130, var8, (byte) 116, var7);
                this.method791(8, var8, (byte) 63, var7 - 1);
                this.method791(32, var8 + 1, (byte) 105, var7);
            }
            if (arg4 == 1) {
                this.method791(10, var8, (byte) 123, var7);
                this.method791(32, var8 + 1, (byte) 46, var7);
                this.method791(128, var8, (byte) 125, var7 + 1);
            }
            if (arg4 == 2) {
                this.method791(40, var8, (byte) 79, var7);
                this.method791(128, var8, (byte) 122, var7 + 1);
                this.method791(2, var8 - 1, (byte) 102, var7);
            }
            if (arg4 == 3) {
                this.method791(160, var8, (byte) 65, var7);
                this.method791(2, var8 - 1, (byte) 54, var7);
                this.method791(8, var8, (byte) 102, var7 - 1);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method791(65536, var8, (byte) 74, var7);
                this.method791(4096, var8, (byte) 47, var7 - 1);
            }
            if (arg4 == 1) {
                this.method791(1024, var8, (byte) 77, var7);
                this.method791(16384, var8 + 1, (byte) 88, var7);
            }
            if (arg4 == 2) {
                this.method791(4096, var8, (byte) 84, var7);
                this.method791(65536, var8, (byte) 47, var7 + 1);
            }
            if (arg4 == 3) {
                this.method791(16384, var8, (byte) 105, var7);
                this.method791(1024, var8 - 1, (byte) 111, var7);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method791(512, var8, (byte) 63, var7);
                this.method791(8192, var8 + 1, (byte) 60, var7 - 1);
            }
            if (arg4 == 1) {
                this.method791(2048, var8, (byte) 106, var7);
                this.method791(32768, var8 + 1, (byte) 112, var7 + 1);
            }
            if (arg4 == 2) {
                this.method791(8192, var8, (byte) 53, var7);
                this.method791(512, var8 - 1, (byte) 64, var7 + 1);
            }
            if (arg4 == 3) {
                this.method791(32768, var8, (byte) 106, var7);
                this.method791(2048, var8 - 1, (byte) 102, var7 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method791(66560, var8, (byte) 54, var7);
            this.method791(4096, var8, (byte) 114, var7 - 1);
            this.method791(16384, var8 + 1, (byte) 123, var7);
        }
        if (arg4 == 1) {
            this.method791(5120, var8, (byte) 107, var7);
            this.method791(16384, var8 + 1, (byte) 91, var7);
            this.method791(65536, var8, (byte) 58, var7 + 1);
        }
        if (arg4 == 2) {
            this.method791(20480, var8, (byte) 51, var7);
            this.method791(65536, var8, (byte) 91, var7 + 1);
            this.method791(1024, var8 - 1, (byte) 116, var7);
        }
        if (arg4 == 3) {
            this.method791(81920, var8, (byte) 104, var7);
            this.method791(1024, var8 - 1, (byte) 93, var7);
            this.method791(4096, var8, (byte) 73, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIBI)V")
    private final void method791(int arg0, int arg1, byte arg2, int arg3) {
        field2382++;
        this.field2373[arg3][arg1] = class196.method1301(this.field2373[arg3][arg1], ~arg0);
        if (arg2 < 45) {
            this.method798(67, (byte) -26, -117, 122);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIBIZ)V")
    public final void method792(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, boolean arg6) {
        int var8 = arg5 - this.field2377;
        field2369++;
        if (arg4 != 104) {
            return;
        }
        int var9 = 256;
        if (arg1 == 1 || arg1 == 3) {
            int var10 = arg2;
            arg2 = arg0;
            arg0 = var10;
        }
        if (arg6) {
            var9 += 131072;
        }
        int var11 = arg3 - this.field2388;
        for (int var12 = var8; var12 < arg2 + var8; var12++) {
            if (var12 >= 0 && var12 < this.field2384) {
                for (int var13 = var11; var13 < arg0 + var11; var13++) {
                    if (var13 >= 0 && this.field2376 > var13) {
                        this.method791(var9, var13, (byte) 90, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method793(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2386++;
        int var9 = arg0 + arg5 - 1;
        int var10 = arg1 + arg6 - 1;
        if (arg0 <= arg3 && var9 >= arg3 && arg7 >= arg1 && var10 >= arg7) {
            return true;
        } else if (arg0 + arg2 == arg3 && arg7 >= arg1 && arg7 <= var10 && (this.field2373[arg3 - this.field2377][arg7 - this.field2388] & 0x8) == 0 && (arg4 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg3 && arg1 <= arg7 && var10 >= arg7 && (this.field2373[arg3 - this.field2377][arg7 - this.field2388] & 0x80) == 0 && (arg4 & 0x2) == 0) {
            return true;
        } else if (arg1 - 1 == arg7 && arg0 <= arg3 && arg3 <= var9 && (this.field2373[arg3 - this.field2377][arg7 - this.field2388] & 0x2) == 0 && (arg4 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg7 && arg0 <= arg3 && var9 >= arg3 && (this.field2373[arg3 - this.field2377][arg7 - this.field2388] & 0x20) == 0 && (arg4 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIB)V")
    public final void method794(int arg0, int arg1, byte arg2) {
        field2371++;
        int var4 = arg1 - this.field2377;
        if (arg2 != -106) {
            this.method798(113, (byte) -53, 33, 109);
        }
        int var5 = arg0 - this.field2388;
        this.field2373[var4][var5] = class67.method396(this.field2373[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)V")
    public final void method795(int arg0, int arg1, int arg2) {
        field2372++;
        int var4 = arg1 - this.field2377;
        int var5 = arg2 - this.field2388;
        this.field2373[var4][var5] = class67.method396(this.field2373[var4][var5], 262144);
        if (arg0 != -4) {
            method804(80, -128, 44, 9);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZIIIII)V")
    public final void method796(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg5 - this.field2388;
        field2397++;
        if (arg2 > -116) {
            field2392 = null;
        }
        int var8 = 256;
        int var9 = arg1 - this.field2377;
        if (arg0) {
            var8 += 131072;
        }
        for (int var10 = var9; var10 < arg3 + var9; var10++) {
            if (var10 >= 0 && var10 < this.field2384) {
                for (int var11 = var7; var11 < var7 + arg4; var11++) {
                    if (var11 >= 0 && this.field2376 > var11) {
                        this.method798(var10, (byte) 95, var11, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIBZII)V")
    public final void method797(int arg0, int arg1, byte arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg1 - this.field2388;
        field2379++;
        int var8 = arg5 - this.field2377;
        if (arg2 != -77) {
            this.field2384 = -64;
        }
        if (arg0 == 0) {
            if (arg4 == 0) {
                this.method798(var8, (byte) 22, var7, 128);
                this.method798(var8 - 1, (byte) -9, var7, 8);
            }
            if (arg4 == 1) {
                this.method798(var8, (byte) 69, var7, 2);
                this.method798(var8, (byte) -116, var7 + 1, 32);
            }
            if (arg4 == 2) {
                this.method798(var8, (byte) -106, var7, 8);
                this.method798(var8 + 1, (byte) 102, var7, 128);
            }
            if (arg4 == 3) {
                this.method798(var8, (byte) 59, var7, 32);
                this.method798(var8, (byte) -118, var7 - 1, 2);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg4 == 0) {
                this.method798(var8, (byte) 81, var7, 1);
                this.method798(var8 - 1, (byte) -116, var7 + 1, 16);
            }
            if (arg4 == 1) {
                this.method798(var8, (byte) -123, var7, 4);
                this.method798(var8 + 1, (byte) -100, var7 + 1, 64);
            }
            if (arg4 == 2) {
                this.method798(var8, (byte) -124, var7, 16);
                this.method798(var8 + 1, (byte) -110, var7 - 1, 1);
            }
            if (arg4 == 3) {
                this.method798(var8, (byte) 95, var7, 64);
                this.method798(var8 - 1, (byte) -107, var7 - 1, 4);
            }
        }
        if (arg0 == 2) {
            if (arg4 == 0) {
                this.method798(var8, (byte) 96, var7, 130);
                this.method798(var8 - 1, (byte) 15, var7, 8);
                this.method798(var8, (byte) 122, var7 + 1, 32);
            }
            if (arg4 == 1) {
                this.method798(var8, (byte) 58, var7, 10);
                this.method798(var8, (byte) -112, var7 + 1, 32);
                this.method798(var8 + 1, (byte) -103, var7, 128);
            }
            if (arg4 == 2) {
                this.method798(var8, (byte) -119, var7, 40);
                this.method798(var8 + 1, (byte) -117, var7, 128);
                this.method798(var8, (byte) 55, var7 - 1, 2);
            }
            if (arg4 == 3) {
                this.method798(var8, (byte) 61, var7, 160);
                this.method798(var8, (byte) -19, var7 - 1, 2);
                this.method798(var8 - 1, (byte) -113, var7, 8);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg0 == 0) {
            if (arg4 == 0) {
                this.method798(var8, (byte) 99, var7, 65536);
                this.method798(var8 - 1, (byte) -115, var7, 4096);
            }
            if (arg4 == 1) {
                this.method798(var8, (byte) -104, var7, 1024);
                this.method798(var8, (byte) -122, var7 + 1, 16384);
            }
            if (arg4 == 2) {
                this.method798(var8, (byte) -108, var7, 4096);
                this.method798(var8 + 1, (byte) -26, var7, 65536);
            }
            if (arg4 == 3) {
                this.method798(var8, (byte) -119, var7, 16384);
                this.method798(var8, (byte) -117, var7 - 1, 1024);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg4 == 0) {
                this.method798(var8, (byte) -124, var7, 512);
                this.method798(var8 - 1, (byte) 43, var7 + 1, 8192);
            }
            if (arg4 == 1) {
                this.method798(var8, (byte) -118, var7, 2048);
                this.method798(var8 + 1, (byte) -108, var7 + 1, 32768);
            }
            if (arg4 == 2) {
                this.method798(var8, (byte) -124, var7, 8192);
                this.method798(var8 + 1, (byte) -106, var7 - 1, 512);
            }
            if (arg4 == 3) {
                this.method798(var8, (byte) 100, var7, 32768);
                this.method798(var8 - 1, (byte) -102, var7 - 1, 2048);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method798(var8, (byte) -109, var7, 66560);
            this.method798(var8 - 1, (byte) -103, var7, 4096);
            this.method798(var8, (byte) -116, var7 + 1, 16384);
        }
        if (arg4 == 1) {
            this.method798(var8, (byte) -118, var7, 5120);
            this.method798(var8, (byte) -114, var7 + 1, 16384);
            this.method798(var8 + 1, (byte) 108, var7, 65536);
        }
        if (arg4 == 2) {
            this.method798(var8, (byte) 13, var7, 20480);
            this.method798(var8 + 1, (byte) 24, var7, 65536);
            this.method798(var8, (byte) -112, var7 - 1, 1024);
        }
        if (arg4 == 3) {
            this.method798(var8, (byte) 113, var7, 81920);
            this.method798(var8, (byte) -125, var7 - 1, 1024);
            this.method798(var8 - 1, (byte) -125, var7, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBII)V")
    private final void method798(int arg0, byte arg1, int arg2, int arg3) {
        field2389++;
        int var5 = 40 / ((arg1 + 65) / 34);
        this.field2373[arg0][arg2] = class67.method396(this.field2373[arg0][arg2], arg3);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
    public final void method799(int arg0) {
        if (arg0 != 1) {
            this.method803(94, -100, 41, -53, -55, -56, -127);
        }
        for (int var2 = 0; var2 < this.field2384; var2++) {
            for (int var3 = 0; var3 < this.field2376; var3++) {
                if (var2 == 0 || var3 == 0 || this.field2384 - 5 <= var2 || this.field2376 - 5 <= var3) {
                    this.field2373[var2][var3] = 16777215;
                } else {
                    this.field2373[var2][var3] = 16777216;
                }
            }
        }
        field2383++;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lh;I)V")
    public static final void method800(class70 arg0, int arg1) {
        field2370++;
        if (arg1 != 28416) {
            field2368 = null;
        }
        byte[] var2 = new byte[24];
        if (class55.field1153 != null) {
            try {
                class55.field1153.method778(arg1 ^ 0xFFFF9081, 0L);
                class55.field1153.method776(var2, -115);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method429(var2, -21, 0, 24);
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
    public static void method801(int arg0) {
        field2395 = null;
        field2403 = null;
        field2385 = null;
        field2368 = null;
        field2401 = null;
        if (arg0 != 128) {
            method801(34);
        }
        field2381 = null;
        field2400 = null;
        field2398 = null;
        field2378 = null;
        field2396 = null;
        field2393 = null;
        field2394 = null;
        field2404 = null;
        field2392 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIBI)Z")
    public final boolean method802(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field2375++;
        if (arg5 != 59) {
            this.method798(57, (byte) -120, 1, -29);
        }
        if (arg2 == arg4 && arg1 == arg6) {
            return true;
        }
        int var8 = arg2 - this.field2377;
        int var9 = arg6 - this.field2388;
        int var10 = arg4 - this.field2377;
        int var11 = arg1 - this.field2388;
        if (arg0 == 0) {
            if (arg3 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field2373[var8][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field2373[var8][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field2373[var8][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field2373[var8][var9] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field2373[var8][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field2373[var8][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field2373[var8][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field2373[var8][var9] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg0 == 2) {
            if (arg3 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field2373[var8][var9] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field2373[var8][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field2373[var8][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field2373[var8][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field2373[var8][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field2373[var8][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field2373[var8][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field2373[var8][var9] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg0 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field2373[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field2373[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field2373[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field2373[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method803(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2391++;
        if (arg0 == arg3 && arg4 == arg5) {
            return true;
        }
        int var8 = arg3 - this.field2377;
        int var9 = arg0 - this.field2377;
        int var10 = arg5 - this.field2388;
        int var11 = arg4 - this.field2388;
        if (arg1 == 6 || arg1 == 7) {
            if (arg1 == 7) {
                arg6 = arg6 + 2 & 0x3;
            }
            if (arg6 == 0) {
                if (var9 + 1 == var8 && var10 == var11 && (this.field2373[var8][var11] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var11 && (this.field2373[var8][var11] & 0x2) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var9 - 1 == var8 && var10 == var11 && (this.field2373[var8][var11] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var11 && (this.field2373[var8][var11] & 0x2) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var9 - 1 == var8 && var10 == var11 && (this.field2373[var8][var11] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var11 && (this.field2373[var8][var11] & 0x20) == 0) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var9 + 1 == var8 && var10 == var11 && (this.field2373[var8][var11] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var11 && (this.field2373[var8][var11] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg2 >= -19) {
            return false;
        }
        if (arg1 == 8) {
            if (var8 == var9 && var10 + 1 == var11 && (this.field2373[var8][var11] & 0x20) == 0) {
                return true;
            }
            if (var8 == var9 && var10 - 1 == var11 && (this.field2373[var8][var11] & 0x2) == 0) {
                return true;
            }
            if (var9 - 1 == var8 && var10 == var11 && (this.field2373[var8][var11] & 0x8) == 0) {
                return true;
            }
            if (var9 + 1 == var8 && var10 == var11 && (this.field2373[var8][var11] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIII)I")
    public static final int method804(int arg0, int arg1, int arg2, int arg3) {
        field2380++;
        int var4 = arg0 >> 7;
        int var5 = arg2 >> 7;
        if (var4 < arg3 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg1;
        if (arg1 < 3 && (class59.field1239[1][var4][var5] & 0x2) == 2) {
            var6 = arg1 + 1;
        }
        int var7 = arg2 & 0x7F;
        int var8 = arg0 & 0x7F;
        int var9 = (128 - var8) * class125.field2538[var6][var4][var5] + class125.field2538[var6][var4 + 1][var5] * var8 >> 7;
        int var10 = (128 - var8) * class125.field2538[var6][var4][var5 - -1] + class125.field2538[var6][var4 + 1][var5 + 1] * var8 >> 7;
        return (128 - var7) * var9 + var7 * var10 >> 7;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(III)V")
    public final void method805(int arg0, int arg1, int arg2) {
        int var4 = -128 / ((4 - arg1) / 59);
        int var5 = arg2 - this.field2377;
        field2390++;
        int var6 = arg0 - this.field2388;
        this.field2373[var5][var6] = class196.method1301(this.field2373[var5][var6], -262145);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljd;I)I")
    public static final int method806(class92 arg0, int arg1) {
        if (arg1 != -12126) {
            field2392 = null;
        }
        field2374++;
        return arg0.method640(true) + 1;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIIIILtg;IZJ)Z")
    public static final boolean method807(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class186 arg8, int arg9, boolean arg10, long arg11) {
        for (int var13 = arg1; var13 < arg1 + arg3; var13++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                if (var13 < 0 || var20 < 0 || var13 >= class64.field1310 || var20 >= class93.field1872) {
                    return false;
                }
                class43 var21 = class31.field698[arg0][var13][var20];
                if (var21 != null && var21.field979 >= 5) {
                    return false;
                }
            }
        }
        class185 var14 = new class185();
        var14.field3495 = arg11;
        var14.field3487 = arg0;
        var14.field3496 = arg5;
        var14.field3490 = arg6;
        var14.field3492 = arg7;
        var14.field3501 = arg8;
        var14.field3499 = arg9;
        var14.field3488 = arg1;
        var14.field3486 = arg2;
        var14.field3489 = arg1 + arg3 - 1;
        var14.field3504 = arg2 + arg4 - 1;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                int var17 = 0;
                if (var15 > arg1) {
                    var17++;
                }
                if (var15 < arg1 + arg3 - 1) {
                    var17 += 4;
                }
                if (var16 > arg2) {
                    var17 += 8;
                }
                if (var16 < arg2 + arg4 - 1) {
                    var17 += 2;
                }
                for (int var18 = arg0; var18 >= 0; var18--) {
                    if (class31.field698[var18][var15][var16] == null) {
                        class31.field698[var18][var15][var16] = new class43(var18, var15, var16);
                    }
                }
                class43 var19 = class31.field698[arg0][var15][var16];
                var19.field966[var19.field979] = var14;
                var19.field976[var19.field979] = var17;
                var19.field981 |= var17;
                var19.field979++;
            }
        }
        if (arg10) {
            class91.field1793[class124.field2525++] = var14;
        }
        return true;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(II)V")
    public class118(int arg0, int arg1) {
        this.field2376 = arg1;
        this.field2388 = 0;
        this.field2384 = arg0;
        this.field2373 = new int[this.field2384][this.field2376];
        this.method799(1);
    }
}
