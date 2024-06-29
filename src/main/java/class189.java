import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class189 {

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    private int field3062 = 0;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    private int field3053 = 0;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    private int field3069;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    private int field3056;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "[[I")
    public int[][] field3061;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3057 = "flash1:";

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3070 = "Connection lost.";

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "Lrc;")
    public static class9 field3067 = new class9(30);

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "[Lid;")
    public static class100[] field3076;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "[Lcj;")
    public static class74[] field3054;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIZ)V")
    public final void method1231(int arg0, int arg1, boolean arg2) {
        int var4 = arg1 - this.field3062;
        int var5 = arg0 - this.field3053;
        if (!arg2) {
            this.method1236((byte) -121, 22, 33, 42);
        }
        this.field3061[var4][var5] = class113.method791(this.field3061[var4][var5], -262145);
        field3068++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
    public final void method1232(int arg0) {
        if (arg0 >= -51) {
            return;
        }
        for (int var2 = 0; var2 < this.field3056; var2++) {
            for (int var3 = 0; var3 < this.field3069; var3++) {
                if (var2 == 0 || var3 == 0 || this.field3056 - 5 <= var2 || var3 >= (this.field3069 - 5)) {
                    this.field3061[var2][var3] = 16777215;
                } else {
                    this.field3061[var2][var3] = 2097152;
                }
            }
        }
        field3066++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIBIIZZ)V")
    public final void method1233(int arg0, int arg1, byte arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        field3059++;
        int var8 = arg0 - this.field3062;
        if (arg2 != 42) {
            field3067 = null;
        }
        int var9 = 256;
        if (arg5) {
            var9 |= 0x20000;
        }
        int var10 = arg1 - this.field3053;
        if (arg6) {
            var9 |= 0x40000000;
        }
        for (int var11 = var8; var11 < arg4 + var8; var11++) {
            if (var11 >= 0 && var11 < this.field3056) {
                for (int var12 = var10; var12 < var10 + arg3; var12++) {
                    if (var12 >= 0 && var12 < this.field3069) {
                        this.method1236((byte) -63, var11, var12, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
    public static final void method1234(byte arg0) {
        class91.field1612 = null;
        class107.field1908 = null;
        class61.field1057 = null;
        class48.field840 = null;
        class57.field1006 = null;
        class129.field2264 = null;
        class296.field4700 = null;
        class177.field2912 = null;
        class78.field1332 = null;
        if (arg0 <= -79) {
            field3064++;
            class88.field1566 = null;
            class106.field1887 = null;
            class113.field2040 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V")
    public static void method1235(boolean arg0) {
        field3057 = null;
        if (arg0) {
            field3057 = null;
        }
        field3054 = null;
        field3076 = null;
        field3070 = null;
        field3067 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BIII)V")
    private final void method1236(byte arg0, int arg1, int arg2, int arg3) {
        int var5 = 26 / ((arg0 - 70) / 52);
        this.field3061[arg1][arg2] = class112.method789(this.field3061[arg1][arg2], arg3);
        field3063++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIII)V")
    private final void method1237(int arg0, int arg1, int arg2, int arg3) {
        this.field3061[arg1][arg0] = class113.method791(this.field3061[arg1][arg0], ~arg3);
        int var5 = -58 / ((arg2 + 47) / 53);
        field3075++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIBIZZII)V")
    public final void method1238(int arg0, int arg1, byte arg2, int arg3, boolean arg4, boolean arg5, int arg6, int arg7) {
        field3060++;
        int var9 = -65 / ((arg2 - 13) / 62);
        int var10 = arg7 - this.field3062;
        int var11 = arg3 - this.field3053;
        int var12 = 256;
        if (arg6 == 1 || arg6 == 3) {
            int var13 = arg1;
            arg1 = arg0;
            arg0 = var13;
        }
        if (arg4) {
            var12 |= 0x20000;
        }
        if (arg5) {
            var12 |= 0x40000000;
        }
        for (int var14 = var10; var14 < (var10 + arg1); var14++) {
            if (var14 >= 0 && var14 < this.field3056) {
                for (int var15 = var11; var15 < arg0 + var11; var15++) {
                    if (var15 >= 0 && var15 < this.field3069) {
                        this.method1237(var15, var14, -103, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZIIIZB)V")
    public final void method1239(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, byte arg6) {
        int var8 = arg2 - this.field3053;
        int var9 = arg0 - this.field3062;
        if (arg4 == 0) {
            if (arg3 == 0) {
                this.method1237(var8, var9, 39, 128);
                this.method1237(var8, var9 - 1, -125, 8);
            }
            if (arg3 == 1) {
                this.method1237(var8, var9, -115, 2);
                this.method1237(var8 + 1, var9, arg6 + 83, 32);
            }
            if (arg3 == 2) {
                this.method1237(var8, var9, -108, 8);
                this.method1237(var8, var9 + 1, -109, 128);
            }
            if (arg3 == 3) {
                this.method1237(var8, var9, -102, 32);
                this.method1237(var8 - 1, var9, 31, 2);
            }
        }
        field3058++;
        if (arg4 == 1 || arg4 == 3) {
            if (arg3 == 0) {
                this.method1237(var8, var9, -111, 1);
                this.method1237(var8 + 1, var9 - 1, -122, 16);
            }
            if (arg3 == 1) {
                this.method1237(var8, var9, 74, 4);
                this.method1237(var8 + 1, var9 - -1, -102, 64);
            }
            if (arg3 == 2) {
                this.method1237(var8, var9, 61, 16);
                this.method1237(var8 - 1, var9 - -1, 93, 1);
            }
            if (arg3 == 3) {
                this.method1237(var8, var9, -103, 64);
                this.method1237(var8 - 1, var9 + -1, arg6 ^ 0x44, 4);
            }
        }
        if (arg4 == 2) {
            if (arg3 == 0) {
                this.method1237(var8, var9, 50, 130);
                this.method1237(var8, var9 - 1, arg6 + -74, 8);
                this.method1237(var8 + 1, var9, 75, 32);
            }
            if (arg3 == 1) {
                this.method1237(var8, var9, -107, 10);
                this.method1237(var8 + 1, var9, 56, 32);
                this.method1237(var8, var9 + 1, -112, 128);
            }
            if (arg3 == 2) {
                this.method1237(var8, var9, -107, 40);
                this.method1237(var8, var9 + 1, 33, 128);
                this.method1237(var8 - 1, var9, -104, 2);
            }
            if (arg3 == 3) {
                this.method1237(var8, var9, arg6 + 74, 160);
                this.method1237(var8 - 1, var9, -115, 2);
                this.method1237(var8, var9 - 1, 64, 8);
            }
        }
        if (arg1) {
            if (arg4 == 0) {
                if (arg3 == 0) {
                    this.method1237(var8, var9, -113, 65536);
                    this.method1237(var8, var9 - 1, 79, 4096);
                }
                if (arg3 == 1) {
                    this.method1237(var8, var9, 20, 1024);
                    this.method1237(var8 + 1, var9, -111, 16384);
                }
                if (arg3 == 2) {
                    this.method1237(var8, var9, -124, 4096);
                    this.method1237(var8, var9 + 1, arg6 + 91, 65536);
                }
                if (arg3 == 3) {
                    this.method1237(var8, var9, -104, 16384);
                    this.method1237(var8 - 1, var9, 71, 1024);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg3 == 0) {
                    this.method1237(var8, var9, 40, 512);
                    this.method1237(var8 + 1, var9 - 1, -117, 8192);
                }
                if (arg3 == 1) {
                    this.method1237(var8, var9, -126, 2048);
                    this.method1237(var8 + 1, var9 + 1, -120, 32768);
                }
                if (arg3 == 2) {
                    this.method1237(var8, var9, arg6 + 66, 8192);
                    this.method1237(var8 - 1, var9 - -1, -122, 512);
                }
                if (arg3 == 3) {
                    this.method1237(var8, var9, -104, 32768);
                    this.method1237(var8 - 1, var9 - 1, arg6 + 48, 2048);
                }
            }
            if (arg4 == 2) {
                if (arg3 == 0) {
                    this.method1237(var8, var9, -119, 66560);
                    this.method1237(var8, var9 - 1, 76, 4096);
                    this.method1237(var8 + 1, var9, arg6 - 66, 16384);
                }
                if (arg3 == 1) {
                    this.method1237(var8, var9, 105, 5120);
                    this.method1237(var8 + 1, var9, -115, 16384);
                    this.method1237(var8, var9 + 1, -104, 65536);
                }
                if (arg3 == 2) {
                    this.method1237(var8, var9, arg6 + 82, 20480);
                    this.method1237(var8, var9 + 1, -125, 65536);
                    this.method1237(var8 - 1, var9, -112, 1024);
                }
                if (arg3 == 3) {
                    this.method1237(var8, var9, arg6 ^ 0xFFFFFFB4, 81920);
                    this.method1237(var8 - 1, var9, arg6 ^ 0xFFFFFF8B, 1024);
                    this.method1237(var8, var9 - 1, -122, 4096);
                }
            }
        }
        if (arg6 != -41) {
            field3067 = null;
        }
        if (!arg5) {
            return;
        }
        if (arg4 == 0) {
            if (arg3 == 0) {
                this.method1237(var8, var9, 67, 536870912);
                this.method1237(var8, var9 - 1, -100, 33554432);
            }
            if (arg3 == 1) {
                this.method1237(var8, var9, arg6 - 81, 8388608);
                this.method1237(var8 + 1, var9, 44, 134217728);
            }
            if (arg3 == 2) {
                this.method1237(var8, var9, arg6 ^ 0xFFFFFF9B, 33554432);
                this.method1237(var8, var9 + 1, -119, 536870912);
            }
            if (arg3 == 3) {
                this.method1237(var8, var9, arg6 ^ 0xFFFFFF9B, 134217728);
                this.method1237(var8 - 1, var9, -104, 8388608);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg3 == 0) {
                this.method1237(var8, var9, arg6 ^ 0x53, 4194304);
                this.method1237(var8 + 1, var9 + -1, -103, 67108864);
            }
            if (arg3 == 1) {
                this.method1237(var8, var9, 59, 16777216);
                this.method1237(var8 + 1, var9 + 1, arg6 ^ 0xFFFFFF9A, 268435456);
            }
            if (arg3 == 2) {
                this.method1237(var8, var9, -127, 67108864);
                this.method1237(var8 - 1, var9 + 1, arg6 ^ 0x45, 4194304);
            }
            if (arg3 == 3) {
                this.method1237(var8, var9, -119, 268435456);
                this.method1237(var8 - 1, var9 + -1, -121, 16777216);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method1237(var8, var9, -118, 545259520);
            this.method1237(var8, var9 - 1, -111, 33554432);
            this.method1237(var8 + 1, var9, arg6 ^ 0xFFFFFFA5, 134217728);
        }
        if (arg3 == 1) {
            this.method1237(var8, var9, -101, 41943040);
            this.method1237(var8 + 1, var9, arg6 ^ 0xFFFFFFC6, 134217728);
            this.method1237(var8, var9 + 1, -100, 536870912);
        }
        if (arg3 == 2) {
            this.method1237(var8, var9, 47, 167772160);
            this.method1237(var8, var9 + 1, 81, 536870912);
            this.method1237(var8 - 1, var9, -118, 8388608);
        }
        if (arg3 == 3) {
            this.method1237(var8, var9, 54, 671088640);
            this.method1237(var8 - 1, var9, arg6 + 159, 8388608);
            this.method1237(var8, var9 - 1, arg6 ^ 0x5A, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIB)V")
    public final void method1240(int arg0, int arg1, byte arg2) {
        int var4 = arg0 - this.field3053;
        field3073++;
        int var5 = arg1 - this.field3062;
        int var6 = 71 % ((arg2 - 2) / 49);
        this.field3061[var5][var4] = class112.method789(this.field3061[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZI)Z")
    public static final boolean method1241(int arg0, boolean arg1, int arg2) {
        field3074++;
        if (!class248.field4074) {
            return false;
        }
        if (!arg1) {
            method1241(50, false, -99);
        }
        int var3 = arg2 >> 16;
        int var4 = arg2 & 0xFFFF;
        if (class115.field2068[var3] == null || class115.field2068[var3][var4] == null) {
            return false;
        }
        class46 var5 = class115.field2068[var3][var4];
        if (arg0 == -1 && var5.field812 == 0) {
            for (int var6 = 0; var6 < class275.field4399; var6++) {
                if (class101.field1788[var6] == 45 || class101.field1788[var6] == 1001 || class101.field1788[var6] == 3 || class101.field1788[var6] == 26 || class101.field1788[var6] == 22) {
                    for (class46 var7 = class108.method760(-29533, class145.field2477[var6]); var7 != null; var7 = class224.method1508((byte) -124, var7)) {
                        if (var5.field786 == var7.field786) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < class275.field4399; var8++) {
                if (class60.field1052[var8] == arg0 && class145.field2477[var8] == var5.field786 && (class101.field1788[var8] == 45 || class101.field1788[var8] == 1001 || class101.field1788[var8] == 3 || class101.field1788[var8] == 26 || class101.field1788[var8] == 22)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIZIZII)V")
    public final void method1242(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = arg3 - this.field3062;
        field3071++;
        int var9 = arg6 - this.field3053;
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method1236((byte) -76, var8, var9, 128);
                this.method1236((byte) -95, var8 - 1, var9, 8);
            }
            if (arg1 == 1) {
                this.method1236((byte) 15, var8, var9, 2);
                this.method1236((byte) -59, var8, var9 + 1, 32);
            }
            if (arg1 == 2) {
                this.method1236((byte) 123, var8, var9, 8);
                this.method1236((byte) -15, var8 + 1, var9, 128);
            }
            if (arg1 == 3) {
                this.method1236((byte) -91, var8, var9, 32);
                this.method1236((byte) -22, var8, var9 - 1, 2);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method1236((byte) 122, var8, var9, 1);
                this.method1236((byte) -38, var8 - 1, var9 + 1, 16);
            }
            if (arg1 == 1) {
                this.method1236((byte) 126, var8, var9, 4);
                this.method1236((byte) 122, var8 + 1, var9 + 1, 64);
            }
            if (arg1 == 2) {
                this.method1236((byte) -43, var8, var9, 16);
                this.method1236((byte) -52, var8 + 1, var9 + -1, 1);
            }
            if (arg1 == 3) {
                this.method1236((byte) 125, var8, var9, 64);
                this.method1236((byte) 127, var8 - 1, var9 + -1, 4);
            }
        }
        if (arg0 == 2) {
            if (arg1 == 0) {
                this.method1236((byte) 126, var8, var9, 130);
                this.method1236((byte) -15, var8 - 1, var9, 8);
                this.method1236((byte) 122, var8, var9 + 1, 32);
            }
            if (arg1 == 1) {
                this.method1236((byte) -11, var8, var9, 10);
                this.method1236((byte) 123, var8, var9 + 1, 32);
                this.method1236((byte) 2, var8 + 1, var9, 128);
            }
            if (arg1 == 2) {
                this.method1236((byte) 122, var8, var9, 40);
                this.method1236((byte) -48, var8 + 1, var9, 128);
                this.method1236((byte) -119, var8, var9 - 1, 2);
            }
            if (arg1 == 3) {
                this.method1236((byte) 127, var8, var9, 160);
                this.method1236((byte) -48, var8, var9 - 1, 2);
                this.method1236((byte) -87, var8 - 1, var9, 8);
            }
        }
        if (arg4) {
            if (arg0 == 0) {
                if (arg1 == 0) {
                    this.method1236((byte) -82, var8, var9, 65536);
                    this.method1236((byte) -1, var8 - 1, var9, 4096);
                }
                if (arg1 == 1) {
                    this.method1236((byte) 126, var8, var9, 1024);
                    this.method1236((byte) 17, var8, var9 + 1, 16384);
                }
                if (arg1 == 2) {
                    this.method1236((byte) -24, var8, var9, 4096);
                    this.method1236((byte) 123, var8 + 1, var9, 65536);
                }
                if (arg1 == 3) {
                    this.method1236((byte) -115, var8, var9, 16384);
                    this.method1236((byte) -105, var8, var9 - 1, 1024);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg1 == 0) {
                    this.method1236((byte) -44, var8, var9, 512);
                    this.method1236((byte) 126, var8 - 1, var9 + 1, 8192);
                }
                if (arg1 == 1) {
                    this.method1236((byte) -50, var8, var9, 2048);
                    this.method1236((byte) 122, var8 + 1, var9 + 1, 32768);
                }
                if (arg1 == 2) {
                    this.method1236((byte) 123, var8, var9, 8192);
                    this.method1236((byte) 126, var8 + 1, var9 + -1, 512);
                }
                if (arg1 == 3) {
                    this.method1236((byte) -126, var8, var9, 32768);
                    this.method1236((byte) 125, var8 - 1, var9 + -1, 2048);
                }
            }
            if (arg0 == 2) {
                if (arg1 == 0) {
                    this.method1236((byte) 126, var8, var9, 66560);
                    this.method1236((byte) 122, var8 - 1, var9, 4096);
                    this.method1236((byte) -94, var8, var9 + 1, 16384);
                }
                if (arg1 == 1) {
                    this.method1236((byte) 124, var8, var9, 5120);
                    this.method1236((byte) 124, var8, var9 + 1, 16384);
                    this.method1236((byte) -8, var8 + 1, var9, 65536);
                }
                if (arg1 == 2) {
                    this.method1236((byte) 123, var8, var9, 20480);
                    this.method1236((byte) 123, var8 + 1, var9, 65536);
                    this.method1236((byte) 123, var8, var9 - 1, 1024);
                }
                if (arg1 == 3) {
                    this.method1236((byte) -20, var8, var9, 81920);
                    this.method1236((byte) 126, var8, var9 - 1, 1024);
                    this.method1236((byte) 126, var8 - 1, var9, 4096);
                }
            }
        }
        if (arg5 >= -83) {
            method1234((byte) -87);
        }
        if (!arg2) {
            return;
        }
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method1236((byte) 122, var8, var9, 536870912);
                this.method1236((byte) 124, var8 - 1, var9, 33554432);
            }
            if (arg1 == 1) {
                this.method1236((byte) 124, var8, var9, 8388608);
                this.method1236((byte) 127, var8, var9 + 1, 134217728);
            }
            if (arg1 == 2) {
                this.method1236((byte) 127, var8, var9, 33554432);
                this.method1236((byte) -90, var8 + 1, var9, 536870912);
            }
            if (arg1 == 3) {
                this.method1236((byte) -83, var8, var9, 134217728);
                this.method1236((byte) 125, var8, var9 - 1, 8388608);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method1236((byte) 127, var8, var9, 4194304);
                this.method1236((byte) -119, var8 - 1, var9 + 1, 67108864);
            }
            if (arg1 == 1) {
                this.method1236((byte) 11, var8, var9, 16777216);
                this.method1236((byte) -58, var8 + 1, var9 - -1, 268435456);
            }
            if (arg1 == 2) {
                this.method1236((byte) -7, var8, var9, 67108864);
                this.method1236((byte) 122, var8 + 1, var9 + -1, 4194304);
            }
            if (arg1 == 3) {
                this.method1236((byte) -58, var8, var9, 268435456);
                this.method1236((byte) 125, var8 - 1, var9 + -1, 16777216);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method1236((byte) 122, var8, var9, 545259520);
            this.method1236((byte) 6, var8 - 1, var9, 33554432);
            this.method1236((byte) 126, var8, var9 + 1, 134217728);
        }
        if (arg1 == 1) {
            this.method1236((byte) -118, var8, var9, 41943040);
            this.method1236((byte) 127, var8, var9 + 1, 134217728);
            this.method1236((byte) -61, var8 + 1, var9, 536870912);
        }
        if (arg1 == 2) {
            this.method1236((byte) 124, var8, var9, 167772160);
            this.method1236((byte) -42, var8 + 1, var9, 536870912);
            this.method1236((byte) 126, var8, var9 - 1, 8388608);
        }
        if (arg1 == 3) {
            this.method1236((byte) 126, var8, var9, 671088640);
            this.method1236((byte) 7, var8, var9 - 1, 8388608);
            this.method1236((byte) -14, var8 - 1, var9, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)Lgg;")
    public static final class121 method1243(int arg0, int arg1) {
        field3055++;
        class121 var2 = (class121) class81.field1430.method57((long) arg1, -97);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class42.field619.method746(class234.method1553(255, arg1), (byte) -128, class207.method1384(arg1, false));
        class121 var4 = new class121();
        if (arg0 != 65536) {
            field3054 = null;
        }
        var4.field2121 = arg1;
        if (var3 != null) {
            var4.method826(new class101(var3), arg0 ^ 0x10001);
        }
        class81.field1430.method62(0, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V")
    public final void method1244(int arg0, int arg1, int arg2) {
        if (arg1 == 18309) {
            field3072++;
            int var4 = arg2 - this.field3062;
            int var5 = arg0 - this.field3053;
            this.field3061[var4][var5] = class112.method789(this.field3061[var4][var5], 2097152);
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(II)V")
    public class189(int arg0, int arg1) {
        this.field3069 = arg1;
        this.field3056 = arg0;
        this.field3061 = new int[this.field3056][this.field3069];
        this.method1232(-107);
    }
}
