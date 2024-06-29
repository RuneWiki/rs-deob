import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class89 {

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    private int field1401;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "I")
    private int field1411;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    private int field1397;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "I")
    private int field1404;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "[[I")
    public int[][] field1396;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "J")
    public static long field1394 = 0L;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "[I")
    public static int[] field1408 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZBZIII)V")
    public final void method674(int arg0, boolean arg1, byte arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field1403++;
        int var8 = arg5 - this.field1404;
        int var9 = arg6 - this.field1397;
        if (arg2 != -66) {
            return;
        }
        int var10 = 256;
        if (arg1) {
            var10 |= 0x20000;
        }
        if (arg3) {
            var10 |= 0x40000000;
        }
        for (int var11 = var9; var11 < var9 + arg4; var11++) {
            if (var11 >= 0 && var11 < this.field1401) {
                for (int var12 = var8; var12 < arg0 + var8; var12++) {
                    if (var12 >= 0 && this.field1411 > var12) {
                        this.method686(var10, arg2 + 264273537, var11, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIBZZII)V")
    public final void method675(int arg0, int arg1, byte arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        int var8 = arg0 - this.field1404;
        int var9 = arg5 - this.field1397;
        if (arg2 >= -82) {
            return;
        }
        field1393++;
        if (arg1 == 0) {
            if (arg6 == 0) {
                this.method686(128, 264273471, var9, var8);
                this.method686(8, 264273471, var9 - 1, var8);
            }
            if (arg6 == 1) {
                this.method686(2, 264273471, var9, var8);
                this.method686(32, 264273471, var9, var8 + 1);
            }
            if (arg6 == 2) {
                this.method686(8, 264273471, var9, var8);
                this.method686(128, 264273471, var9 + 1, var8);
            }
            if (arg6 == 3) {
                this.method686(32, 264273471, var9, var8);
                this.method686(2, 264273471, var9, var8 - 1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg6 == 0) {
                this.method686(1, 264273471, var9, var8);
                this.method686(16, 264273471, var9 - 1, var8 - -1);
            }
            if (arg6 == 1) {
                this.method686(4, 264273471, var9, var8);
                this.method686(64, 264273471, var9 + 1, var8 - -1);
            }
            if (arg6 == 2) {
                this.method686(16, 264273471, var9, var8);
                this.method686(1, 264273471, var9 + 1, var8 + -1);
            }
            if (arg6 == 3) {
                this.method686(64, 264273471, var9, var8);
                this.method686(4, 264273471, var9 - 1, var8 - 1);
            }
        }
        if (arg1 == 2) {
            if (arg6 == 0) {
                this.method686(130, 264273471, var9, var8);
                this.method686(8, 264273471, var9 - 1, var8);
                this.method686(32, 264273471, var9, var8 + 1);
            }
            if (arg6 == 1) {
                this.method686(10, 264273471, var9, var8);
                this.method686(32, 264273471, var9, var8 + 1);
                this.method686(128, 264273471, var9 + 1, var8);
            }
            if (arg6 == 2) {
                this.method686(40, 264273471, var9, var8);
                this.method686(128, 264273471, var9 + 1, var8);
                this.method686(2, 264273471, var9, var8 - 1);
            }
            if (arg6 == 3) {
                this.method686(160, 264273471, var9, var8);
                this.method686(2, 264273471, var9, var8 - 1);
                this.method686(8, 264273471, var9 - 1, var8);
            }
        }
        if (arg3) {
            if (arg1 == 0) {
                if (arg6 == 0) {
                    this.method686(65536, 264273471, var9, var8);
                    this.method686(4096, 264273471, var9 - 1, var8);
                }
                if (arg6 == 1) {
                    this.method686(1024, 264273471, var9, var8);
                    this.method686(16384, 264273471, var9, var8 + 1);
                }
                if (arg6 == 2) {
                    this.method686(4096, 264273471, var9, var8);
                    this.method686(65536, 264273471, var9 + 1, var8);
                }
                if (arg6 == 3) {
                    this.method686(16384, 264273471, var9, var8);
                    this.method686(1024, 264273471, var9, var8 - 1);
                }
            }
            if (arg1 == 1 || arg1 == 3) {
                if (arg6 == 0) {
                    this.method686(512, 264273471, var9, var8);
                    this.method686(8192, 264273471, var9 - 1, var8 - -1);
                }
                if (arg6 == 1) {
                    this.method686(2048, 264273471, var9, var8);
                    this.method686(32768, 264273471, var9 + 1, var8 + 1);
                }
                if (arg6 == 2) {
                    this.method686(8192, 264273471, var9, var8);
                    this.method686(512, 264273471, var9 + 1, var8 + -1);
                }
                if (arg6 == 3) {
                    this.method686(32768, 264273471, var9, var8);
                    this.method686(2048, 264273471, var9 - 1, var8 + -1);
                }
            }
            if (arg1 == 2) {
                if (arg6 == 0) {
                    this.method686(66560, 264273471, var9, var8);
                    this.method686(4096, 264273471, var9 - 1, var8);
                    this.method686(16384, 264273471, var9, var8 + 1);
                }
                if (arg6 == 1) {
                    this.method686(5120, 264273471, var9, var8);
                    this.method686(16384, 264273471, var9, var8 + 1);
                    this.method686(65536, 264273471, var9 + 1, var8);
                }
                if (arg6 == 2) {
                    this.method686(20480, 264273471, var9, var8);
                    this.method686(65536, 264273471, var9 + 1, var8);
                    this.method686(1024, 264273471, var9, var8 - 1);
                }
                if (arg6 == 3) {
                    this.method686(81920, 264273471, var9, var8);
                    this.method686(1024, 264273471, var9, var8 - 1);
                    this.method686(4096, 264273471, var9 - 1, var8);
                }
            }
        }
        if (!arg4) {
            return;
        }
        if (arg1 == 0) {
            if (arg6 == 0) {
                this.method686(536870912, 264273471, var9, var8);
                this.method686(33554432, 264273471, var9 - 1, var8);
            }
            if (arg6 == 1) {
                this.method686(8388608, 264273471, var9, var8);
                this.method686(134217728, 264273471, var9, var8 + 1);
            }
            if (arg6 == 2) {
                this.method686(33554432, 264273471, var9, var8);
                this.method686(536870912, 264273471, var9 + 1, var8);
            }
            if (arg6 == 3) {
                this.method686(134217728, 264273471, var9, var8);
                this.method686(8388608, 264273471, var9, var8 - 1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg6 == 0) {
                this.method686(4194304, 264273471, var9, var8);
                this.method686(67108864, 264273471, var9 - 1, var8 - -1);
            }
            if (arg6 == 1) {
                this.method686(16777216, 264273471, var9, var8);
                this.method686(268435456, 264273471, var9 + 1, var8 + 1);
            }
            if (arg6 == 2) {
                this.method686(67108864, 264273471, var9, var8);
                this.method686(4194304, 264273471, var9 + 1, var8 + -1);
            }
            if (arg6 == 3) {
                this.method686(268435456, 264273471, var9, var8);
                this.method686(16777216, 264273471, var9 - 1, var8 + -1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg6 == 0) {
            this.method686(545259520, 264273471, var9, var8);
            this.method686(33554432, 264273471, var9 - 1, var8);
            this.method686(134217728, 264273471, var9, var8 + 1);
        }
        if (arg6 == 1) {
            this.method686(41943040, 264273471, var9, var8);
            this.method686(134217728, 264273471, var9, var8 + 1);
            this.method686(536870912, 264273471, var9 + 1, var8);
        }
        if (arg6 == 2) {
            this.method686(167772160, 264273471, var9, var8);
            this.method686(536870912, 264273471, var9 + 1, var8);
            this.method686(8388608, 264273471, var9, var8 - 1);
        }
        if (arg6 == 3) {
            this.method686(671088640, 264273471, var9, var8);
            this.method686(8388608, 264273471, var9, var8 - 1);
            this.method686(33554432, 264273471, var9 - 1, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZII)V")
    private final void method676(int arg0, boolean arg1, int arg2, int arg3) {
        this.field1396[arg0][arg3] = class118.method863(this.field1396[arg0][arg3], ~arg2);
        if (arg1) {
            this.method681(false, true, 100, 3, -111, -35, 121, 46);
        }
        field1392++;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZIIZIII)V")
    public final void method677(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg4 != 671744) {
            return;
        }
        int var8 = arg1 - this.field1397;
        field1406++;
        int var9 = arg5 - this.field1404;
        if (arg2 == 0) {
            if (arg6 == 0) {
                this.method676(var8, false, 128, var9);
                this.method676(var8 - 1, false, 8, var9);
            }
            if (arg6 == 1) {
                this.method676(var8, false, 2, var9);
                this.method676(var8, false, 32, var9 + 1);
            }
            if (arg6 == 2) {
                this.method676(var8, false, 8, var9);
                this.method676(var8 + 1, false, 128, var9);
            }
            if (arg6 == 3) {
                this.method676(var8, false, 32, var9);
                this.method676(var8, false, 2, var9 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg6 == 0) {
                this.method676(var8, false, 1, var9);
                this.method676(var8 - 1, false, 16, var9 + 1);
            }
            if (arg6 == 1) {
                this.method676(var8, false, 4, var9);
                this.method676(var8 + 1, false, 64, var9 + 1);
            }
            if (arg6 == 2) {
                this.method676(var8, false, 16, var9);
                this.method676(var8 + 1, false, 1, var9 - 1);
            }
            if (arg6 == 3) {
                this.method676(var8, false, 64, var9);
                this.method676(var8 - 1, false, 4, var9 - 1);
            }
        }
        if (arg2 == 2) {
            if (arg6 == 0) {
                this.method676(var8, false, 130, var9);
                this.method676(var8 - 1, false, 8, var9);
                this.method676(var8, false, 32, var9 + 1);
            }
            if (arg6 == 1) {
                this.method676(var8, false, 10, var9);
                this.method676(var8, false, 32, var9 + 1);
                this.method676(var8 + 1, false, 128, var9);
            }
            if (arg6 == 2) {
                this.method676(var8, false, 40, var9);
                this.method676(var8 + 1, false, 128, var9);
                this.method676(var8, false, 2, var9 - 1);
            }
            if (arg6 == 3) {
                this.method676(var8, false, 160, var9);
                this.method676(var8, false, 2, var9 - 1);
                this.method676(var8 - 1, false, 8, var9);
            }
        }
        if (arg3) {
            if (arg2 == 0) {
                if (arg6 == 0) {
                    this.method676(var8, false, 65536, var9);
                    this.method676(var8 - 1, false, 4096, var9);
                }
                if (arg6 == 1) {
                    this.method676(var8, false, 1024, var9);
                    this.method676(var8, false, 16384, var9 + 1);
                }
                if (arg6 == 2) {
                    this.method676(var8, false, 4096, var9);
                    this.method676(var8 + 1, false, 65536, var9);
                }
                if (arg6 == 3) {
                    this.method676(var8, false, 16384, var9);
                    this.method676(var8, false, 1024, var9 - 1);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg6 == 0) {
                    this.method676(var8, false, 512, var9);
                    this.method676(var8 - 1, false, 8192, var9 + 1);
                }
                if (arg6 == 1) {
                    this.method676(var8, false, 2048, var9);
                    this.method676(var8 + 1, false, 32768, var9 + 1);
                }
                if (arg6 == 2) {
                    this.method676(var8, false, 8192, var9);
                    this.method676(var8 + 1, false, 512, var9 - 1);
                }
                if (arg6 == 3) {
                    this.method676(var8, false, 32768, var9);
                    this.method676(var8 - 1, false, 2048, var9 - 1);
                }
            }
            if (arg2 == 2) {
                if (arg6 == 0) {
                    this.method676(var8, false, 66560, var9);
                    this.method676(var8 - 1, false, 4096, var9);
                    this.method676(var8, false, 16384, var9 + 1);
                }
                if (arg6 == 1) {
                    this.method676(var8, false, 5120, var9);
                    this.method676(var8, false, 16384, var9 + 1);
                    this.method676(var8 + 1, false, 65536, var9);
                }
                if (arg6 == 2) {
                    this.method676(var8, false, 20480, var9);
                    this.method676(var8 + 1, false, 65536, var9);
                    this.method676(var8, false, 1024, var9 - 1);
                }
                if (arg6 == 3) {
                    this.method676(var8, false, 81920, var9);
                    this.method676(var8, false, 1024, var9 - 1);
                    this.method676(var8 - 1, false, 4096, var9);
                }
            }
        }
        if (!arg0) {
            return;
        }
        if (arg2 == 0) {
            if (arg6 == 0) {
                this.method676(var8, false, 536870912, var9);
                this.method676(var8 - 1, false, 33554432, var9);
            }
            if (arg6 == 1) {
                this.method676(var8, false, 8388608, var9);
                this.method676(var8, false, 134217728, var9 + 1);
            }
            if (arg6 == 2) {
                this.method676(var8, false, 33554432, var9);
                this.method676(var8 + 1, false, 536870912, var9);
            }
            if (arg6 == 3) {
                this.method676(var8, false, 134217728, var9);
                this.method676(var8, false, 8388608, var9 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg6 == 0) {
                this.method676(var8, false, 4194304, var9);
                this.method676(var8 - 1, false, 67108864, var9 + 1);
            }
            if (arg6 == 1) {
                this.method676(var8, false, 16777216, var9);
                this.method676(var8 + 1, false, 268435456, var9 + 1);
            }
            if (arg6 == 2) {
                this.method676(var8, false, 67108864, var9);
                this.method676(var8 + 1, false, 4194304, var9 - 1);
            }
            if (arg6 == 3) {
                this.method676(var8, false, 268435456, var9);
                this.method676(var8 - 1, false, 16777216, var9 - 1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg6 == 0) {
            this.method676(var8, false, 545259520, var9);
            this.method676(var8 - 1, false, 33554432, var9);
            this.method676(var8, false, 134217728, var9 + 1);
        }
        if (arg6 == 1) {
            this.method676(var8, false, 41943040, var9);
            this.method676(var8, false, 134217728, var9 + 1);
            this.method676(var8 + 1, false, 536870912, var9);
        }
        if (arg6 == 2) {
            this.method676(var8, false, 167772160, var9);
            this.method676(var8 + 1, false, 536870912, var9);
            this.method676(var8, false, 8388608, var9 - 1);
        }
        if (arg6 == 3) {
            this.method676(var8, false, 671088640, var9);
            this.method676(var8, false, 8388608, var9 - 1);
            this.method676(var8 - 1, false, 33554432, var9);
            return;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZII)Ljava/lang/String;")
    public static final String method678(boolean arg0, int arg1, int arg2) {
        field1402++;
        if (arg0 && arg2 >= 0) {
            return arg1 == 10 ? class168.method1216(10, arg0, arg1 + 98, arg2) : null;
        } else {
            return Integer.toString(arg2);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIB)V")
    public final void method679(int arg0, int arg1, byte arg2) {
        if (arg2 >= -47) {
            this.method674(-9, true, (byte) 19, false, -76, -17, -62);
        }
        field1409++;
        int var4 = arg0 - this.field1404;
        int var5 = arg1 - this.field1397;
        this.field1396[var5][var4] = class44.method377(this.field1396[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BII)V")
    public final void method680(byte arg0, int arg1, int arg2) {
        int var4 = 0 % ((arg0 - 34) / 48);
        field1395++;
        int var5 = arg1 - this.field1397;
        int var6 = arg2 - this.field1404;
        this.field1396[var5][var6] = class44.method377(this.field1396[var5][var6], 2097152);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZZIIIIII)V")
    public final void method681(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1400++;
        if (arg2 == 1 || arg2 == 3) {
            int var9 = arg5;
            arg5 = arg3;
            arg3 = var9;
        }
        int var10 = 256;
        if (arg7 != 7662) {
            return;
        }
        if (arg1) {
            var10 |= 0x20000;
        }
        if (arg0) {
            var10 |= 0x40000000;
        }
        int var11 = arg4 - this.field1397;
        int var12 = arg6 - this.field1404;
        for (int var13 = var11; var13 < arg5 + var11; var13++) {
            if (var13 >= 0 && var13 < this.field1401) {
                for (int var14 = var12; var14 < arg3 + var12; var14++) {
                    if (var14 >= 0 && var14 < this.field1411) {
                        this.method676(var13, false, var10, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)V")
    public static void method682(boolean arg0) {
        if (arg0) {
            field1394 = -61L;
        }
        field1408 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)[Lel;")
    public static final class213[] method683(byte arg0) {
        field1407++;
        class213[] var1 = new class213[class174.field2682];
        int var2 = 0;
        if (arg0 != -83) {
            method684(96, 45, -2, -102, 23);
        }
        while (class174.field2682 > var2) {
            int var3 = class170.field2583[var2] * class104.field1621[var2];
            byte[] var4 = class301.field4847[var2];
            if (class5.field80[var2]) {
                byte[] var7 = class299.field4811[var2];
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class44.method377(class118.method863(var7[var9] << 24, -16777216), class102.field1585[class118.method863(var4[var9], 255)]);
                }
                var1[var2] = new class256(class214.field3278, class234.field3705, class196.field3069[var2], class125.field1877[var2], class104.field1621[var2], class170.field2583[var2], var8);
            } else {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; var6++) {
                    var5[var6] = class102.field1585[class118.method863(255, var4[var6])];
                }
                var1[var2] = new class51(class214.field3278, class234.field3705, class196.field3069[var2], class125.field1877[var2], class104.field1621[var2], class170.field2583[var2], var5);
            }
            var2++;
        }
        class30.method254(2);
        return var1;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIII)V")
    public static final void method684(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class175.field2698 = class92.field1475 * arg1 / arg2;
        class254.field4063 = -1;
        class129.field1920 = class152.field2247 * arg4 / arg3;
        class232.field3674 = -1;
        class195.method1395(28690);
        field1405++;
        int var5 = -44 % ((-arg0 - 70) / 46);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZI)V")
    public final void method685(int arg0, boolean arg1, int arg2) {
        int var4 = arg0 - this.field1404;
        int var5 = arg2 - this.field1397;
        field1410++;
        this.field1396[var5][var4] = class118.method863(this.field1396[var5][var4], -262145);
        if (!arg1) {
            this.method679(14, 106, (byte) 77);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIII)V")
    private final void method686(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 264273471) {
            field1394 = -56L;
        }
        this.field1396[arg2][arg3] = class44.method377(this.field1396[arg2][arg3], arg0);
        field1399++;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)V")
    public final void method687(byte arg0) {
        for (int var2 = 0; var2 < this.field1401; var2++) {
            for (int var4 = 0; var4 < this.field1411; var4++) {
                if (var2 == 0 || var4 == 0 || var2 >= (this.field1401 - 5) || (this.field1411 - 5) <= var4) {
                    this.field1396[var2][var4] = 16777215;
                } else {
                    this.field1396[var2][var4] = 2097152;
                }
            }
        }
        int var3 = -29 % ((arg0 - 40) / 36);
        field1398++;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "()V")
    public static final void method688() {
        if (class108.field1679 != null) {
            for (int var0 = 0; var0 < class108.field1679.length; var0++) {
                for (int var1 = 0; var1 < class235.field3716; var1++) {
                    for (int var2 = 0; var2 < class291.field4515; var2++) {
                        class108.field1679[var0][var1][var2] = null;
                    }
                }
            }
        }
        if (class133.field1999 != null) {
            for (int var3 = 0; var3 < class133.field1999.length; var3++) {
                for (int var4 = 0; var4 < class235.field3716; var4++) {
                    for (int var5 = 0; var5 < class291.field4515; var5++) {
                        class133.field1999[var3][var4][var5] = null;
                    }
                }
            }
        }
        class174.field2690 = 0;
        if (class142.field2112 != null) {
            for (int var6 = 0; var6 < class174.field2690; var6++) {
                class142.field2112[var6] = null;
            }
        }
        if (class246.field3916 != null) {
            for (int var7 = 0; var7 < class296.field4676; var7++) {
                class246.field3916[var7] = null;
            }
            class296.field4676 = 0;
        }
        if (class269.field4264 != null) {
            for (int var8 = 0; var8 < class269.field4264.length; var8++) {
                class269.field4264[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(II)V")
    public class89(int arg0, int arg1) {
        this.field1401 = arg0;
        this.field1411 = arg1;
        this.field1397 = 0;
        this.field1404 = 0;
        this.field1396 = new int[this.field1401][this.field1411];
        this.method687((byte) 112);
    }
}
