import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class72 {

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    private int field981;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    private int field984;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "[[I")
    public int[][] field988;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    private int field977;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    private int field991;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "[J")
    public static long[] field987 = new long[256];

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public static int field994 = 0;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "Z")
    public static boolean field998;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!la", name = "y", descriptor = "Ljava/lang/String;")
    public static String field999;

    @OriginalMember(owner = "client!la", name = "z", descriptor = "Z")
    public static boolean field1000;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!la", name = "A", descriptor = "Lkm;")
    public static class133 field1001;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZIIIZI)V", line = 13)
    public final void method525(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg4 != -17110) {
            return;
        }
        field985++;
        int var8 = arg3 - this.field991;
        int var9 = arg2 - this.field977;
        int var10 = 256;
        if (arg5) {
            var10 |= 0x20000;
        }
        if (arg1) {
            var10 |= 0x40000000;
        }
        for (int var11 = var9; var11 < var9 + arg0; var11++) {
            if (var11 >= 0 && this.field984 > var11) {
                for (int var12 = var8; var12 < arg6 + var8; var12++) {
                    if (var12 >= 0 && this.field981 > var12) {
                        this.method533(var12, var10, var11, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILkm;)V", line = 64)
    public static final void method526(int arg0, class133 arg1) {
        class183.field2525 = arg1;
        if (arg0 != 26892) {
            field994 = -90;
        }
        field990++;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII)V", line = 76)
    private final void method527(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 8) {
            this.method531(-35, -5, false, -62, -59);
        }
        this.field988[arg2][arg1] = class47.method303(this.field988[arg2][arg1], ~arg3);
        field993++;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V", line = 89)
    public final void method528(int arg0, int arg1, int arg2) {
        if (arg1 > 79) {
            field989++;
            int var4 = arg2 - this.field977;
            int var5 = arg0 - this.field991;
            this.field988[var4][var5] = class190.method1334(this.field988[var4][var5], 262144);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIZIZ)V", line = 107)
    public final void method529(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, boolean arg7) {
        int var9 = arg1 - this.field977;
        field980++;
        if (arg3 == 1 || arg3 == 3) {
            int var10 = arg6;
            arg6 = arg2;
            arg2 = var10;
        }
        int var11 = 256;
        int var12 = arg4 - this.field991;
        if (arg5) {
            var11 |= 0x20000;
        }
        if (arg7) {
            var11 |= 0x40000000;
        }
        for (int var13 = var9; var13 < (arg6 + var9); var13++) {
            if (var13 >= 0 && var13 < this.field984) {
                for (int var14 = var12; var14 < arg2 + var12; var14++) {
                    if (var14 >= 0 && var14 < this.field981) {
                        this.method527(8, var14, var13, var11);
                    }
                }
            }
        }
        if (arg0 != 94) {
            field1000 = false;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIZ)V", line = 161)
    public final void method530(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field994 = -2;
        }
        int var4 = arg1 - this.field977;
        int var5 = arg0 - this.field991;
        this.field988[var4][var5] = class190.method1334(this.field988[var4][var5], 2097152);
        field982++;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIZII)Z", line = 176)
    public final boolean method531(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field986++;
        if (arg3 == arg4 && arg0 == arg1) {
            return true;
        }
        int var6 = arg4 - this.field977;
        if (!arg2) {
            return true;
        }
        int var7 = arg1 - this.field991;
        if (var6 < 0 || this.field984 <= var6 || var7 < 0 || this.field981 <= var7) {
            return false;
        }
        int var8 = arg3 - this.field977;
        int var9 = arg0 - this.field991;
        int var10;
        if (var6 <= var8) {
            var10 = var8 - var6;
        } else {
            var10 = var6 - var8;
        }
        int var11;
        if (var7 <= var9) {
            var11 = var9 - var7;
        } else {
            var11 = var7 - var9;
        }
        if (var11 < var10) {
            int var12 = var11 * 65536 / var10;
            int var13 = 32768;
            while (var6 != var8) {
                if (var6 > var8) {
                    if ((this.field988[var8][var9] & 0x2C0108) != 0) {
                        return false;
                    }
                    var8++;
                } else if (var6 < var8) {
                    if ((this.field988[var8][var9] & 0x2C0180) != 0) {
                        return false;
                    }
                    var8--;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    var13 -= 65536;
                    if (var7 > var9) {
                        if ((this.field988[var8][var9] & 0x2C0102) != 0) {
                            return false;
                        }
                        var9++;
                    } else if (var7 < var9) {
                        if ((this.field988[var8][var9] & 0x2C0120) != 0) {
                            return false;
                        }
                        var9--;
                    }
                }
            }
        } else {
            int var14 = 32768;
            int var15 = var10 * 65536 / var11;
            while (var7 != var9) {
                if (var9 < var7) {
                    if ((this.field988[var8][var9] & 0x2C0102) != 0) {
                        return false;
                    }
                    var9++;
                } else if (var7 < var9) {
                    if ((this.field988[var8][var9] & 0x2C0120) != 0) {
                        return false;
                    }
                    var9--;
                }
                var14 += var15;
                if (var14 >= 65536) {
                    var14 -= 65536;
                    if (var6 > var8) {
                        if ((this.field988[var8][var9] & 0x2C0108) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var6 < var8) {
                        if ((this.field988[var8][var9] & 0x2C0180) != 0) {
                            return false;
                        }
                        var8--;
                    }
                }
            }
        }
        return (this.field988[var6][var7] & 0x240100) == 0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V", line = 329)
    public final void method532(byte arg0) {
        field995++;
        if (arg0 > -107) {
            return;
        }
        for (int var2 = 0; var2 < this.field984; var2++) {
            for (int var3 = 0; var3 < this.field981; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field984 - 5) <= var2 || var3 >= (this.field981 - 5)) {
                    this.field988[var2][var3] = 16777215;
                } else {
                    this.field988[var2][var3] = 2097152;
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIZ)V", line = 362)
    private final void method533(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            field998 = false;
        }
        this.field988[arg2][arg0] = class190.method1334(this.field988[arg2][arg0], arg1);
        field978++;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field987[var0] = var1;
        }
        field997 = 0;
        field998 = false;
        field996 = 0;
        field999 = "scroll:";
        field1000 = true;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(III)V", line = 387)
    public final void method534(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field977;
        int var5 = arg0 - this.field991;
        if (arg2 < -67) {
            field992++;
            this.field988[var4][var5] = class47.method303(this.field988[var4][var5], -262145);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)V", line = 400)
    public static final void method535(int arg0, int arg1) {
        field979++;
        short var2 = 256;
        if (arg1 > var2) {
            arg1 = var2;
        }
        if (arg1 > 10) {
            arg1 = 10;
        }
        class121.field1642 += arg1 * 128;
        if (class47.field577.length < class121.field1642) {
            class121.field1642 -= class47.field577.length;
            int var3 = (int) (Math.random() * 12.0D);
            class323.method2269(class121.field1639[var3], true);
        }
        int var4 = 0;
        int var5 = arg1 * 128;
        int var6 = (var2 - arg1) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = class338.field5085[var4 + var5] - (class47.field577[class47.field577.length - 1 & class121.field1642 + var4] * arg1 / 6);
            if (var8 < 0) {
                var8 = 0;
            }
            class338.field5085[var4++] = var8;
        }
        for (int var9 = var2 - arg1; var9 < var2; var9++) {
            int var10 = var9 * 128;
            for (int var11 = 0; var11 < 128; var11++) {
                int var12 = (int) (Math.random() * 100.0D);
                if (var12 < 50 && var11 > 10 && var11 < 118) {
                    class338.field5085[var10 + var11] = 255;
                } else {
                    class338.field5085[var10 + var11] = 0;
                }
            }
        }
        for (int var13 = 0; var13 < (var2 - arg1); var13++) {
            class88.field1247[var13] = class88.field1247[arg1 + var13];
        }
        for (int var14 = var2 - arg1; var14 < var2; var14++) {
            class88.field1247[var14] = (int) (Math.sin((double) class223.field3223 / 14.0D) * 16.0D + Math.sin((double) class223.field3223 / 15.0D) * 14.0D + Math.sin((double) class223.field3223 / 16.0D) * 12.0D);
            class223.field3223++;
        }
        class13.field140 += arg1;
        if (arg0 != 124) {
            field997 = -15;
        }
        int var15 = (arg1 + (class329.field4966 & 0x1)) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < class13.field140; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            class338.field5085[(var18 << 7) + var17] = 192;
        }
        class13.field140 = 0;
        for (int var19 = 0; var19 < var2; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var22 + var15 < 128) {
                    var20 += class338.field5085[var21 + var22 + var15];
                }
                if ((var22 - var15 - 1) >= 0) {
                    var20 -= class338.field5085[var21 + var22 - var15 - 1];
                }
                if (var22 >= 0) {
                    class123.field1668[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var2; var25++) {
                int var26 = var25 * 128;
                if ((var25 + var15) < var2) {
                    var24 += class123.field1668[var15 * 128 + var26 + var23];
                }
                if (var25 - var15 - 1 >= 0) {
                    var24 -= class123.field1668[var23 + var26 - (var15 * 128 - -128)];
                }
                if (var25 >= 0) {
                    class338.field5085[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIZZ)V", line = 573)
    public final void method536(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        field983++;
        int var8 = arg4 - this.field991;
        int var9 = arg3 - this.field977;
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method527(8, var8, var9, 128);
                this.method527(8, var8, var9 - 1, 8);
            }
            if (arg2 == 1) {
                this.method527(8, var8, var9, 2);
                this.method527(8, var8 + 1, var9, 32);
            }
            if (arg2 == 2) {
                this.method527(8, var8, var9, 8);
                this.method527(arg1 - 24, var8, var9 + 1, 128);
            }
            if (arg2 == 3) {
                this.method527(8, var8, var9, 32);
                this.method527(8, var8 - 1, var9, 2);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method527(8, var8, var9, 1);
                this.method527(arg1 - 24, var8 + 1, var9 - 1, 16);
            }
            if (arg2 == 1) {
                this.method527(arg1 - 24, var8, var9, 4);
                this.method527(8, var8 + 1, var9 - -1, 64);
            }
            if (arg2 == 2) {
                this.method527(8, var8, var9, 16);
                this.method527(8, var8 - 1, var9 + 1, 1);
            }
            if (arg2 == 3) {
                this.method527(8, var8, var9, 64);
                this.method527(8, var8 - 1, var9 + -1, 4);
            }
        }
        if (arg0 == 2) {
            if (arg2 == 0) {
                this.method527(8, var8, var9, 130);
                this.method527(arg1 - 24, var8, var9 - 1, 8);
                this.method527(arg1 ^ 0x28, var8 + 1, var9, 32);
            }
            if (arg2 == 1) {
                this.method527(8, var8, var9, 10);
                this.method527(8, var8 + 1, var9, 32);
                this.method527(8, var8, var9 + 1, 128);
            }
            if (arg2 == 2) {
                this.method527(arg1 ^ 0x28, var8, var9, 40);
                this.method527(8, var8, var9 + 1, 128);
                this.method527(8, var8 - 1, var9, 2);
            }
            if (arg2 == 3) {
                this.method527(8, var8, var9, 160);
                this.method527(8, var8 - 1, var9, 2);
                this.method527(8, var8, var9 - 1, 8);
            }
        }
        if (arg1 != 32) {
            return;
        }
        if (arg6) {
            if (arg0 == 0) {
                if (arg2 == 0) {
                    this.method527(arg1 ^ 0x28, var8, var9, 65536);
                    this.method527(arg1 ^ 0x28, var8, var9 - 1, 4096);
                }
                if (arg2 == 1) {
                    this.method527(arg1 - 24, var8, var9, 1024);
                    this.method527(8, var8 + 1, var9, 16384);
                }
                if (arg2 == 2) {
                    this.method527(arg1 - 24, var8, var9, 4096);
                    this.method527(8, var8, var9 + 1, 65536);
                }
                if (arg2 == 3) {
                    this.method527(8, var8, var9, 16384);
                    this.method527(8, var8 - 1, var9, 1024);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg2 == 0) {
                    this.method527(8, var8, var9, 512);
                    this.method527(8, var8 + 1, var9 + -1, 8192);
                }
                if (arg2 == 1) {
                    this.method527(8, var8, var9, 2048);
                    this.method527(8, var8 + 1, var9 + 1, 32768);
                }
                if (arg2 == 2) {
                    this.method527(8, var8, var9, 8192);
                    this.method527(8, var8 - 1, var9 + 1, 512);
                }
                if (arg2 == 3) {
                    this.method527(8, var8, var9, 32768);
                    this.method527(arg1 ^ 0x28, var8 - 1, var9 + -1, 2048);
                }
            }
            if (arg0 == 2) {
                if (arg2 == 0) {
                    this.method527(8, var8, var9, 66560);
                    this.method527(8, var8, var9 - 1, 4096);
                    this.method527(8, var8 + 1, var9, 16384);
                }
                if (arg2 == 1) {
                    this.method527(8, var8, var9, 5120);
                    this.method527(8, var8 + 1, var9, 16384);
                    this.method527(8, var8, var9 + 1, 65536);
                }
                if (arg2 == 2) {
                    this.method527(8, var8, var9, 20480);
                    this.method527(8, var8, var9 + 1, 65536);
                    this.method527(arg1 ^ 0x28, var8 - 1, var9, 1024);
                }
                if (arg2 == 3) {
                    this.method527(arg1 - 24, var8, var9, 81920);
                    this.method527(arg1 ^ 0x28, var8 - 1, var9, 1024);
                    this.method527(8, var8, var9 - 1, 4096);
                }
            }
        }
        if (!arg5) {
            return;
        }
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method527(arg1 ^ 0x28, var8, var9, 536870912);
                this.method527(arg1 - 24, var8, var9 - 1, 33554432);
            }
            if (arg2 == 1) {
                this.method527(8, var8, var9, 8388608);
                this.method527(8, var8 + 1, var9, 134217728);
            }
            if (arg2 == 2) {
                this.method527(8, var8, var9, 33554432);
                this.method527(8, var8, var9 + 1, 536870912);
            }
            if (arg2 == 3) {
                this.method527(8, var8, var9, 134217728);
                this.method527(8, var8 - 1, var9, 8388608);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method527(arg1 - 24, var8, var9, 4194304);
                this.method527(arg1 ^ 0x28, var8 + 1, var9 + -1, 67108864);
            }
            if (arg2 == 1) {
                this.method527(8, var8, var9, 16777216);
                this.method527(8, var8 + 1, var9 + 1, 268435456);
            }
            if (arg2 == 2) {
                this.method527(8, var8, var9, 67108864);
                this.method527(arg1 - 24, var8 + -1, var9 + 1, 4194304);
            }
            if (arg2 == 3) {
                this.method527(arg1 - 24, var8, var9, 268435456);
                this.method527(8, var8 - 1, var9 + -1, 16777216);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method527(arg1 - 24, var8, var9, 545259520);
            this.method527(arg1 ^ 0x28, var8, var9 - 1, 33554432);
            this.method527(8, var8 + 1, var9, 134217728);
        }
        if (arg2 == 1) {
            this.method527(8, var8, var9, 41943040);
            this.method527(arg1 - 24, var8 + 1, var9, 134217728);
            this.method527(8, var8, var9 + 1, 536870912);
        }
        if (arg2 == 2) {
            this.method527(8, var8, var9, 167772160);
            this.method527(8, var8, var9 + 1, 536870912);
            this.method527(8, var8 - 1, var9, 8388608);
        }
        if (arg2 == 3) {
            this.method527(8, var8, var9, 671088640);
            this.method527(8, var8 - 1, var9, 8388608);
            this.method527(arg1 - 24, var8, var9 - 1, 33554432);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIZIBZ)V", line = 882)
    public final void method537(int arg0, int arg1, int arg2, boolean arg3, int arg4, byte arg5, boolean arg6) {
        int var8 = arg2 - this.field977;
        int var9 = arg4 - this.field991;
        if (arg5 > -94) {
            this.method534(-113, -66, 84);
        }
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method533(var9, 128, var8, false);
                this.method533(var9, 8, var8 - 1, false);
            }
            if (arg1 == 1) {
                this.method533(var9, 2, var8, false);
                this.method533(var9 + 1, 32, var8, false);
            }
            if (arg1 == 2) {
                this.method533(var9, 8, var8, false);
                this.method533(var9, 128, var8 + 1, false);
            }
            if (arg1 == 3) {
                this.method533(var9, 32, var8, false);
                this.method533(var9 - 1, 2, var8, false);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method533(var9, 1, var8, false);
                this.method533(var9 + 1, 16, var8 - 1, false);
            }
            if (arg1 == 1) {
                this.method533(var9, 4, var8, false);
                this.method533(var9 + 1, 64, var8 + 1, false);
            }
            if (arg1 == 2) {
                this.method533(var9, 16, var8, false);
                this.method533(var9 - 1, 1, var8 + 1, false);
            }
            if (arg1 == 3) {
                this.method533(var9, 64, var8, false);
                this.method533(var9 - 1, 4, var8 - 1, false);
            }
        }
        if (arg0 == 2) {
            if (arg1 == 0) {
                this.method533(var9, 130, var8, false);
                this.method533(var9, 8, var8 - 1, false);
                this.method533(var9 + 1, 32, var8, false);
            }
            if (arg1 == 1) {
                this.method533(var9, 10, var8, false);
                this.method533(var9 + 1, 32, var8, false);
                this.method533(var9, 128, var8 + 1, false);
            }
            if (arg1 == 2) {
                this.method533(var9, 40, var8, false);
                this.method533(var9, 128, var8 + 1, false);
                this.method533(var9 - 1, 2, var8, false);
            }
            if (arg1 == 3) {
                this.method533(var9, 160, var8, false);
                this.method533(var9 - 1, 2, var8, false);
                this.method533(var9, 8, var8 - 1, false);
            }
        }
        if (arg6) {
            if (arg0 == 0) {
                if (arg1 == 0) {
                    this.method533(var9, 65536, var8, false);
                    this.method533(var9, 4096, var8 - 1, false);
                }
                if (arg1 == 1) {
                    this.method533(var9, 1024, var8, false);
                    this.method533(var9 + 1, 16384, var8, false);
                }
                if (arg1 == 2) {
                    this.method533(var9, 4096, var8, false);
                    this.method533(var9, 65536, var8 + 1, false);
                }
                if (arg1 == 3) {
                    this.method533(var9, 16384, var8, false);
                    this.method533(var9 - 1, 1024, var8, false);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg1 == 0) {
                    this.method533(var9, 512, var8, false);
                    this.method533(var9 + 1, 8192, var8 - 1, false);
                }
                if (arg1 == 1) {
                    this.method533(var9, 2048, var8, false);
                    this.method533(var9 + 1, 32768, var8 + 1, false);
                }
                if (arg1 == 2) {
                    this.method533(var9, 8192, var8, false);
                    this.method533(var9 - 1, 512, var8 + 1, false);
                }
                if (arg1 == 3) {
                    this.method533(var9, 32768, var8, false);
                    this.method533(var9 - 1, 2048, var8 - 1, false);
                }
            }
            if (arg0 == 2) {
                if (arg1 == 0) {
                    this.method533(var9, 66560, var8, false);
                    this.method533(var9, 4096, var8 - 1, false);
                    this.method533(var9 + 1, 16384, var8, false);
                }
                if (arg1 == 1) {
                    this.method533(var9, 5120, var8, false);
                    this.method533(var9 + 1, 16384, var8, false);
                    this.method533(var9, 65536, var8 + 1, false);
                }
                if (arg1 == 2) {
                    this.method533(var9, 20480, var8, false);
                    this.method533(var9, 65536, var8 + 1, false);
                    this.method533(var9 - 1, 1024, var8, false);
                }
                if (arg1 == 3) {
                    this.method533(var9, 81920, var8, false);
                    this.method533(var9 - 1, 1024, var8, false);
                    this.method533(var9, 4096, var8 - 1, false);
                }
            }
        }
        field976++;
        if (!arg3) {
            return;
        }
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method533(var9, 536870912, var8, false);
                this.method533(var9, 33554432, var8 - 1, false);
            }
            if (arg1 == 1) {
                this.method533(var9, 8388608, var8, false);
                this.method533(var9 + 1, 134217728, var8, false);
            }
            if (arg1 == 2) {
                this.method533(var9, 33554432, var8, false);
                this.method533(var9, 536870912, var8 + 1, false);
            }
            if (arg1 == 3) {
                this.method533(var9, 134217728, var8, false);
                this.method533(var9 - 1, 8388608, var8, false);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method533(var9, 4194304, var8, false);
                this.method533(var9 + 1, 67108864, var8 - 1, false);
            }
            if (arg1 == 1) {
                this.method533(var9, 16777216, var8, false);
                this.method533(var9 + 1, 268435456, var8 + 1, false);
            }
            if (arg1 == 2) {
                this.method533(var9, 67108864, var8, false);
                this.method533(var9 - 1, 4194304, var8 + 1, false);
            }
            if (arg1 == 3) {
                this.method533(var9, 268435456, var8, false);
                this.method533(var9 - 1, 16777216, var8 - 1, false);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method533(var9, 545259520, var8, false);
            this.method533(var9, 33554432, var8 - 1, false);
            this.method533(var9 + 1, 134217728, var8, false);
        }
        if (arg1 == 1) {
            this.method533(var9, 41943040, var8, false);
            this.method533(var9 + 1, 134217728, var8, false);
            this.method533(var9, 536870912, var8 + 1, false);
        }
        if (arg1 == 2) {
            this.method533(var9, 167772160, var8, false);
            this.method533(var9, 536870912, var8 + 1, false);
            this.method533(var9 - 1, 8388608, var8, false);
        }
        if (arg1 == 3) {
            this.method533(var9, 671088640, var8, false);
            this.method533(var9 - 1, 8388608, var8, false);
            this.method533(var9, 33554432, var8 - 1, false);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V", line = 1190)
    public static void method538(boolean arg0) {
        field999 = null;
        field1001 = null;
        field987 = null;
        if (!arg0) {
            field998 = false;
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(II)V", line = 1204)
    public class72(int arg0, int arg1) {
        this.field981 = arg1;
        this.field984 = arg0;
        this.field988 = new int[this.field984][this.field981];
        this.field977 = 0;
        this.field991 = 0;
        this.method532((byte) -121);
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(B)Z", line = 1218)
    public static final boolean method539(byte arg0) throws IOException {
        field975++;
        if (class39.field442 == null) {
            return false;
        }
        int var1 = class39.field442.method1572(0);
        if (var1 == 0) {
            return false;
        }
        if (class159.field2179 == -1) {
            class39.field442.method1573(class157.field2165.field4798, 1, -19451, 0);
            var1--;
            class157.field2165.field4777 = 0;
            class159.field2179 = class157.field2165.method2243((byte) -97);
            class199.field2833 = class151.field2091[class159.field2179];
        }
        if (class199.field2833 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class39.field442.method1573(class157.field2165.field4798, 1, -19451, 0);
            class199.field2833 = class157.field2165.field4798[0] & 0xFF;
            var1--;
        }
        if (class199.field2833 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class39.field442.method1573(class157.field2165.field4798, 2, -19451, 0);
            var1 -= 2;
            class157.field2165.field4777 = 0;
            class199.field2833 = class157.field2165.method2220((byte) 100);
        }
        if (var1 < class199.field2833) {
            return false;
        }
        class157.field2165.field4777 = 0;
        class39.field442.method1573(class157.field2165.field4798, class199.field2833, -19451, 0);
        class199.field2843 = class326.field4931;
        class326.field4931 = class294.field4369;
        class149.field2065 = 0;
        class294.field4369 = class159.field2179;
        if (class159.field2179 == 21) {
            int var392 = class157.field2165.method2220((byte) 91);
            if (class287.method1977((byte) 118, var392)) {
                class151.method1094((byte) -35);
            }
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 104) {
            for (int var2 = 0; var2 < class169.field2306.length; var2++) {
                if (class169.field2306[var2] != null) {
                    class169.field2306[var2].field3668 = -1;
                }
            }
            for (int var3 = 0; var3 < class42.field484.length; var3++) {
                if (class42.field484[var3] != null) {
                    class42.field484[var3].field3668 = -1;
                }
            }
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 61) {
            long var4 = class157.field2165.method2175(false);
            long var6 = (long) class157.field2165.method2220((byte) 120);
            long var8 = (long) class157.field2165.method2210((byte) -5);
            int var10 = class157.field2165.method2219(16448);
            long var11 = (var6 << 32) + var8;
            int var13 = class157.field2165.method2220((byte) 99);
            boolean var14 = false;
            int var15 = 0;
            label1250: while (true) {
                if (var15 < 100) {
                    if (class179.field2408[var15] != var11) {
                        var15++;
                        continue;
                    }
                    var14 = true;
                    break;
                }
                if (var10 <= 1) {
                    for (int var16 = 0; var16 < class64.field826; var16++) {
                        if (class143.field1966[var16] == var4) {
                            var14 = true;
                            break label1250;
                        }
                    }
                }
                break;
            }
            if (!var14 && class88.field1250 == 0) {
                class179.field2408[class122.field1655] = var11;
                class122.field1655 = (class122.field1655 + 1) % 100;
                String var17 = class142.method1023((byte) 27, var13).method1967((byte) 113, class157.field2165);
                if (var10 == 2) {
                    class141.method1021(var17, "<img=1>" + class256.method1746(var4, 0), var13, -100, (String) null, 18);
                } else if (var10 == 1) {
                    class141.method1021(var17, "<img=0>" + class256.method1746(var4, 0), var13, -108, (String) null, 18);
                } else {
                    class141.method1021(var17, class256.method1746(var4, 0), var13, -64, (String) null, 18);
                }
            }
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 176) {
            class79.field1144 = class185.field2549;
            long var18 = class157.field2165.method2175(false);
            if (var18 == 0L) {
                class344.field5239 = null;
                class324.field4917 = 0;
                class159.field2179 = -1;
                class73.field1013 = null;
                class73.field1009 = null;
                return true;
            }
            long var20 = class157.field2165.method2175(false);
            class73.field1009 = class309.method2120(false, var20);
            class73.field1013 = class309.method2120(false, var18);
            class1.field11 = class157.field2165.method2192(3);
            int var22 = class157.field2165.method2219(16448);
            if (var22 == 255) {
                class159.field2179 = -1;
                return true;
            }
            class324.field4917 = var22;
            class112[] var23 = new class112[100];
            for (int var24 = 0; var24 < class324.field4917; var24++) {
                var23[var24] = new class112();
                var23[var24].field2522 = class157.field2165.method2175(false);
                var23[var24].field1535 = class309.method2120(false, var23[var24].field2522);
                var23[var24].field1529 = class157.field2165.method2220((byte) 106);
                var23[var24].field1528 = class157.field2165.method2192(3);
                var23[var24].field1536 = class157.field2165.method2158(-872702056);
                if (class66.field866 == var23[var24].field2522) {
                    class211.field3060 = var23[var24].field1528;
                }
            }
            boolean var25 = false;
            int var26 = class324.field4917;
            while (var26 > 0) {
                boolean var27 = true;
                var26--;
                for (int var28 = 0; var28 < var26; var28++) {
                    if (var23[var28].field1535.compareTo(var23[var28 + 1].field1535) > 0) {
                        var27 = false;
                        class112 var29 = var23[var28];
                        var23[var28] = var23[var28 + 1];
                        var23[var28 + 1] = var29;
                    }
                }
                if (var27) {
                    break;
                }
            }
            class344.field5239 = var23;
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 174) {
            int var389 = class157.field2165.method2198(2);
            int var390 = class157.field2165.method2168((byte) -122);
            int var391 = class157.field2165.method2172((byte) 71);
            if (class287.method1977((byte) 109, var390)) {
                class96.method704((byte) 115, var391, var389);
            }
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 208) {
            if (class183.field2521 != -1) {
                class52.method358(0, class183.field2521, 18248);
            }
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 3) {
            int var384 = class157.field2165.method2220((byte) 85);
            String var385 = class157.field2165.method2158(-872702056);
            Object[] var386 = new Object[var385.length() + 1];
            for (int var387 = var385.length() - 1; var387 >= 0; var387--) {
                if (var385.charAt(var387) == 's') {
                    var386[var387 + 1] = class157.field2165.method2158(-872702056);
                } else {
                    var386[var387 + 1] = Integer.valueOf(class157.field2165.method2172((byte) 71));
                }
            }
            var386[0] = Integer.valueOf(class157.field2165.method2172((byte) 71));
            if (class287.method1977((byte) 123, var384)) {
                class171 var388 = new class171();
                var388.field2333 = var386;
                class314.method2145(127, var388);
            }
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 15) {
            long var30 = class157.field2165.method2175(false);
            class157.field2165.method2192(3);
            long var32 = class157.field2165.method2175(false);
            long var34 = (long) class157.field2165.method2220((byte) 95);
            long var36 = (long) class157.field2165.method2210((byte) -5);
            int var38 = class157.field2165.method2219(16448);
            int var39 = class157.field2165.method2220((byte) 49);
            long var40 = (var34 << 32) + var36;
            boolean var42 = false;
            int var43 = 0;
            label1294: while (true) {
                if (var43 >= 100) {
                    if (var38 <= 1) {
                        for (int var44 = 0; var44 < class64.field826; var44++) {
                            if (class143.field1966[var44] == var30) {
                                var42 = true;
                                break label1294;
                            }
                        }
                    }
                    break;
                }
                if (class179.field2408[var43] == var40) {
                    var42 = true;
                    break;
                }
                var43++;
            }
            if (!var42 && class88.field1250 == 0) {
                class179.field2408[class122.field1655] = var40;
                class122.field1655 = (class122.field1655 + 1) % 100;
                String var45 = class142.method1023((byte) 27, var39).method1967((byte) 86, class157.field2165);
                if (var38 == 2 || var38 == 3) {
                    class141.method1021(var45, "<img=1>" + class256.method1746(var30, 0), var39, -31, class256.method1746(var32, 0), 20);
                } else if (var38 == 1) {
                    class141.method1021(var45, "<img=0>" + class256.method1746(var30, 0), var39, -43, class256.method1746(var32, 0), 20);
                } else {
                    class141.method1021(var45, class256.method1746(var30, 0), var39, -16, class256.method1746(var32, 0), 20);
                }
            }
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 251) {
            int var378 = class157.field2165.method2220((byte) 118);
            int var379 = class157.field2165.method2219(16448);
            int var380 = class157.field2165.method2219(16448);
            int var381 = class157.field2165.method2219(16448);
            int var382 = class157.field2165.method2219(16448);
            int var383 = class157.field2165.method2220((byte) 48);
            if (class287.method1977((byte) 121, var378)) {
                class306.field4592[var379] = true;
                class175.field2381[var379] = var380;
                class237.field3364[var379] = var381;
                class100.field1376[var379] = var382;
                class145.field2005[var379] = var383;
            }
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 23) {
            class64.field826 = class199.field2833 / 8;
            for (int var46 = 0; var46 < class64.field826; var46++) {
                class143.field1966[var46] = class157.field2165.method2175(false);
                class231.field3269[var46] = class127.method916(class143.field1966[var46], (byte) -121);
                class113.field1551[var46] = false;
            }
            class201.field2856 = class185.field2549;
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 0) {
            int var377 = class157.field2165.method2220((byte) 127);
            if (class287.method1977((byte) 122, var377)) {
                class211.method1479((byte) -67);
            }
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 126) {
            class318.method2230(false, true);
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 164) {
            int var47 = class157.field2165.method2172((byte) 71);
            int var48 = class157.field2165.method2168((byte) -102);
            class249.method1703(var48, 19558, var47);
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 37) {
            int var49 = class157.field2165.method2220((byte) 108);
            int var50 = class157.field2165.method2160(70);
            int var51 = class157.field2165.method2194((byte) -57);
            if (class287.method1977((byte) 116, var50)) {
                class13.method73(var51, var49, 80);
            }
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 201) {
            class239.method1640(class199.field2833, class165.field2258, class157.field2165, -107);
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 47) {
            class42.field476 = class157.field2165.method2219(16448);
            class159.field2179 = -1;
            class201.field2856 = class185.field2549;
            return true;
        } else if (class159.field2179 == 200) {
            int var52 = class157.field2165.method2220((byte) 38);
            int var53 = class157.field2165.method2219(16448);
            int var54 = class157.field2165.method2219(16448);
            int var55 = class157.field2165.method2220((byte) 47);
            int var56 = class157.field2165.method2219(16448);
            int var57 = class157.field2165.method2219(16448);
            if (class287.method1977((byte) 109, var52)) {
                class41.method253(var55, var57, var54, true, 3528, var56, var53);
            }
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 136 || class159.field2179 == 46 || class159.field2179 == 140 || class159.field2179 == 7 || class159.field2179 == 111 || class159.field2179 == 133 || class159.field2179 == 247 || class159.field2179 == 70 || class159.field2179 == 41 || class159.field2179 == 101 || class159.field2179 == 159 || class159.field2179 == 193 || class159.field2179 == 197 || class159.field2179 == 215) {
            class21.method130((byte) -109);
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 166) {
            long var58 = class157.field2165.method2175(false);
            class157.field2165.method2192(3);
            long var60 = class157.field2165.method2175(false);
            long var62 = (long) class157.field2165.method2220((byte) 122);
            long var64 = (long) class157.field2165.method2210((byte) -5);
            int var66 = class157.field2165.method2219(16448);
            boolean var67 = false;
            long var68 = (var62 << 32) + var64;
            int var70 = 0;
            label1330: while (true) {
                if (var70 < 100) {
                    if (class179.field2408[var70] != var68) {
                        var70++;
                        continue;
                    }
                    var67 = true;
                    break;
                }
                if (var66 <= 1) {
                    if ((!class45.field555 || class162.field2228) && !field998) {
                        for (int var71 = 0; var71 < class64.field826; var71++) {
                            if (class143.field1966[var71] == var58) {
                                var67 = true;
                                break label1330;
                            }
                        }
                    } else {
                        var67 = true;
                    }
                }
                break;
            }
            if (!var67 && class88.field1250 == 0) {
                class179.field2408[class122.field1655] = var68;
                class122.field1655 = (class122.field1655 + 1) % 100;
                String var72 = class277.method1903(class293.method2001((byte) -97, class175.method1216(class157.field2165, -100)));
                if (var66 == 2 || var66 == 3) {
                    class194.method1360(-29016, var72, 9, class256.method1746(var60, 0), "<img=1>" + class256.method1746(var58, 0));
                } else if (var66 == 1) {
                    class194.method1360(-29016, var72, 9, class256.method1746(var60, 0), "<img=0>" + class256.method1746(var58, 0));
                } else {
                    class194.method1360(-29016, var72, 9, class256.method1746(var60, 0), class256.method1746(var58, 0));
                }
            }
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 138) {
            int var374 = class157.field2165.method2176(9639);
            int var375 = class157.field2165.method2168((byte) -114);
            int var376 = class157.field2165.method2215((byte) -41);
            if (class287.method1977((byte) 114, var375)) {
                class169.method1194(var376, var374, (byte) -14);
            }
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 38) {
            class13.method79(-1);
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 1) {
            int var369 = class157.field2165.method2219(16448);
            int var370 = class157.field2165.method2190((byte) 123);
            int var371 = class157.field2165.method2220((byte) 125);
            int var372 = class157.field2165.method2194((byte) 74);
            if (class287.method1977((byte) 110, var370)) {
                class48 var373 = (class48) class211.field3056.method111(91, (long) var372);
                if (var373 != null) {
                    class290.method1991(var373.field595 != var371, (byte) 112, var373);
                }
                class22.method134(4571, var372, var369, var371);
            }
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 243) {
            int var73 = class157.field2165.method2168((byte) -102);
            int var74 = class157.field2165.method2172((byte) 71);
            int var75 = class157.field2165.method2220((byte) 87);
            int var76 = class157.field2165.method2160(92);
            if (class287.method1977((byte) 122, var75)) {
                class213.method1486((var76 << 16) + var73, var74, (byte) 30);
            }
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 141) {
            int var365 = class157.field2165.method2220((byte) 121);
            int var366 = class157.field2165.method2219(16448);
            if (var365 == 65535) {
                var365 = -1;
            }
            int var367 = class157.field2165.method2220((byte) 37);
            int var368 = class157.field2165.method2219(16448);
            class336.method2330(var365, (byte) 69, var368, var367, var366);
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 63) {
            int var77 = class157.field2165.method2194((byte) 82);
            int var78 = class157.field2165.method2160(71);
            int var79 = class157.field2165.method2190((byte) 118);
            int var80 = class157.field2165.method2220((byte) 127);
            int var81 = class157.field2165.method2220((byte) 105);
            if (class287.method1977((byte) 120, var81)) {
                class44.method284(var78 << 16 | var79, var80, var77, 7, 122);
            }
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 128) {
            class196.field2738 = class157.field2165.method2219(16448);
            class276.field4140 = class157.field2165.method2219(16448);
            class318.field4857 = class157.field2165.method2219(16448);
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 137) {
            int var82 = class157.field2165.method2172((byte) 71);
            int var83 = class157.field2165.method2160(126);
            int var84 = class157.field2165.method2190((byte) 124);
            if (var84 == 65535) {
                var84 = -1;
            }
            if (class287.method1977((byte) 114, var83)) {
                class44.method284(var84, -1, var82, 1, 77);
            }
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 235) {
            int var364 = class157.field2165.method2219(16448);
            if (class157.field2165.method2219(16448) == 0) {
                class216.field3086[var364] = new class219();
            } else {
                class157.field2165.field4777--;
                class216.field3086[var364] = new class219(class157.field2165);
            }
            class159.field2179 = -1;
            class100.field1379 = class185.field2549;
            return true;
        } else if (class159.field2179 == 209) {
            int var85 = class157.field2165.method2172((byte) 71);
            class234.field3302 = class165.field2258.method625(76, var85);
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 35) {
            int var361 = class157.field2165.method2220((byte) 99);
            int var362 = class157.field2165.method2168((byte) -112);
            int var363 = class157.field2165.method2168((byte) -108);
            if (class287.method1977((byte) 117, var362)) {
                class149.method1080(var363, (byte) -122, var361);
            }
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 198) {
            int var358 = class157.field2165.method2219(16448);
            int var359 = class157.field2165.method2183(-70);
            int var360 = class157.field2165.method2219(16448);
            class251.field3603 = var360 >> 1;
            class173.field2356.method1645(var359, var358, (var360 & 0x1) == 1, -48);
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 226) {
            long var86 = class157.field2165.method2175(false);
            int var88 = class157.field2165.method2220((byte) 81);
            boolean var89 = true;
            int var90 = class157.field2165.method2219(16448);
            if (var86 < 0L) {
                var89 = false;
                var86 &= Long.MAX_VALUE;
            }
            String var91 = "";
            if (var88 > 0) {
                var91 = class157.field2165.method2158(-872702056);
            }
            String var92 = class256.method1746(var86, 0);
            for (int var93 = 0; var93 < class44.field535; var93++) {
                if (class89.field1254[var93] == var86) {
                    if (class344.field5271[var93] != var88) {
                        class344.field5271[var93] = var88;
                        if (var88 > 0) {
                            class93.method695((byte) 124, 5, var92 + class313.field4721, "");
                        }
                        if (var88 == 0) {
                            class93.method695((byte) 121, 5, var92 + class204.field2923, "");
                        }
                    }
                    var92 = null;
                    class290.field4325[var93] = var91;
                    class21.field275[var93] = var90;
                    class30.field370[var93] = var89;
                    break;
                }
            }
            boolean var94 = false;
            if (var92 != null && class44.field535 < 200) {
                class89.field1254[class44.field535] = var86;
                class207.field2986[class44.field535] = var92;
                class344.field5271[class44.field535] = var88;
                class290.field4325[class44.field535] = var91;
                class21.field275[class44.field535] = var90;
                class30.field370[class44.field535] = var89;
                class44.field535++;
            }
            class201.field2856 = class185.field2549;
            int var95 = class44.field535;
            while (var95 > 0) {
                var95--;
                boolean var96 = true;
                for (int var97 = 0; var97 < var95; var97++) {
                    if (class344.field5271[var97] != class199.field2838 && class344.field5271[var97 + 1] == class199.field2838 || class344.field5271[var97] == 0 && class344.field5271[var97 + 1] != 0) {
                        int var98 = class344.field5271[var97];
                        var96 = false;
                        class344.field5271[var97] = class344.field5271[var97 + 1];
                        class344.field5271[var97 + 1] = var98;
                        String var99 = class290.field4325[var97];
                        class290.field4325[var97] = class290.field4325[var97 + 1];
                        class290.field4325[var97 + 1] = var99;
                        String var100 = class207.field2986[var97];
                        class207.field2986[var97] = class207.field2986[var97 + 1];
                        class207.field2986[var97 + 1] = var100;
                        long var101 = class89.field1254[var97];
                        class89.field1254[var97] = class89.field1254[var97 + 1];
                        class89.field1254[var97 + 1] = var101;
                        int var103 = class21.field275[var97];
                        class21.field275[var97] = class21.field275[var97 + 1];
                        class21.field275[var97 + 1] = var103;
                        boolean var104 = class30.field370[var97];
                        class30.field370[var97] = class30.field370[var97 + 1];
                        class30.field370[var97 + 1] = var104;
                    }
                }
                if (var96) {
                    break;
                }
            }
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 127) {
            String var105 = class157.field2165.method2158(-872702056);
            if (var105.endsWith(":tradereq:")) {
                String var106 = var105.substring(0, var105.indexOf(":"));
                boolean var107 = false;
                long var108 = class77.method584(var106, 73);
                for (int var110 = 0; var110 < class64.field826; var110++) {
                    if (class143.field1966[var110] == var108) {
                        var107 = true;
                        break;
                    }
                }
                if (!var107 && class88.field1250 == 0) {
                    class93.method695((byte) -119, 4, class85.field1225, var106);
                }
            } else if (var105.endsWith(":chalreq:")) {
                String var111 = var105.substring(0, var105.indexOf(":"));
                long var112 = class77.method584(var111, 92);
                boolean var114 = false;
                for (int var115 = 0; var115 < class64.field826; var115++) {
                    if (class143.field1966[var115] == var112) {
                        var114 = true;
                        break;
                    }
                }
                if (!var114 && class88.field1250 == 0) {
                    String var116 = var105.substring(var105.indexOf(":") + 1, var105.length() + -9);
                    class93.method695((byte) -90, 8, var116, var111);
                }
            } else if (var105.endsWith(":assistreq:")) {
                String var141 = var105.substring(0, var105.indexOf(":"));
                boolean var142 = false;
                long var143 = class77.method584(var141, 72);
                for (int var145 = 0; var145 < class64.field826; var145++) {
                    if (class143.field1966[var145] == var143) {
                        var142 = true;
                        break;
                    }
                }
                if (!var142 && class88.field1250 == 0) {
                    class93.method695((byte) -83, 10, "", var141);
                }
            } else if (var105.endsWith(":clan:")) {
                String var117 = var105.substring(0, var105.indexOf(":clan:"));
                class93.method695((byte) -6, 11, var117, "");
            } else if (var105.endsWith(":trade:")) {
                String var118 = var105.substring(0, var105.indexOf(":trade:"));
                if (class88.field1250 == 0) {
                    class93.method695((byte) -35, 12, var118, "");
                }
            } else if (var105.endsWith(":assist:")) {
                String var119 = var105.substring(0, var105.indexOf(":assist:"));
                if (class88.field1250 == 0) {
                    class93.method695((byte) 97, 13, var119, "");
                }
            } else if (var105.endsWith(":duelstake:")) {
                String var120 = var105.substring(0, var105.indexOf(":"));
                long var121 = class77.method584(var120, 125);
                boolean var123 = false;
                for (int var124 = 0; var124 < class64.field826; var124++) {
                    if (class143.field1966[var124] == var121) {
                        var123 = true;
                        break;
                    }
                }
                if (!var123 && class88.field1250 == 0) {
                    class93.method695((byte) 113, 14, "", var120);
                }
            } else if (var105.endsWith(":duelfriend:")) {
                String var125 = var105.substring(0, var105.indexOf(":"));
                long var126 = class77.method584(var125, 90);
                boolean var128 = false;
                for (int var129 = 0; var129 < class64.field826; var129++) {
                    if (class143.field1966[var129] == var126) {
                        var128 = true;
                        break;
                    }
                }
                if (!var128 && class88.field1250 == 0) {
                    class93.method695((byte) -64, 15, "", var125);
                }
            } else if (var105.endsWith(":clanreq:")) {
                String var130 = var105.substring(0, var105.indexOf(":"));
                long var131 = class77.method584(var130, 95);
                boolean var133 = false;
                for (int var134 = 0; var134 < class64.field826; var134++) {
                    if (class143.field1966[var134] == var131) {
                        var133 = true;
                        break;
                    }
                }
                if (!var133 && class88.field1250 == 0) {
                    class93.method695((byte) -10, 16, "", var130);
                }
            } else if (var105.endsWith(":allyreq:")) {
                String var135 = var105.substring(0, var105.indexOf(":"));
                long var136 = class77.method584(var135, 106);
                boolean var138 = false;
                for (int var139 = 0; var139 < class64.field826; var139++) {
                    if (class143.field1966[var139] == var136) {
                        var138 = true;
                        break;
                    }
                }
                if (!var138 && class88.field1250 == 0) {
                    String var140 = var105.substring(var105.indexOf(":") + 1, var105.length() + -9);
                    class93.method695((byte) -74, 21, var140, var135);
                }
            } else {
                class93.method695((byte) 109, 0, var105, "");
            }
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 94) {
            class198.field2768 = class157.field2165.method2160(81) * 30;
            class159.field2179 = -1;
            class239.field3389 = class185.field2549;
            return true;
        } else if (class159.field2179 == 60) {
            long var354 = class157.field2165.method2175(false);
            int var356 = class157.field2165.method2220((byte) 109);
            String var357 = class142.method1023((byte) 27, var356).method1967((byte) 85, class157.field2165);
            class141.method1021(var357, class256.method1746(var354, 0), var356, -66, (String) null, 19);
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 54) {
            class37.method209(-118);
            class159.field2179 = -1;
            return false;
        } else if (class159.field2179 == 131) {
            int var350 = class157.field2165.method2220((byte) 57);
            if (var350 == 65535) {
                var350 = -1;
            }
            int var351 = class157.field2165.method2219(16448);
            int var352 = class157.field2165.method2176(9639);
            String var353 = class157.field2165.method2158(-872702056);
            if (var351 >= 1 && var351 <= 8) {
                if (var353.equalsIgnoreCase("null")) {
                    var353 = null;
                }
                class210.field3039[var351 - 1] = var353;
                class253.field3630[var351 - 1] = var350;
                class176.field2393[var351 - 1] = var352 == 0;
            }
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 51) {
            int var146 = class157.field2165.method2156(0);
            int var147 = class157.field2165.method2186(106);
            int var148 = class157.field2165.method2220((byte) 93);
            int var149 = class157.field2165.method2161(28984);
            if (class287.method1977((byte) 110, var148)) {
                class98.method712(var146, false, var149, var147);
            }
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 181) {
            long var150 = class157.field2165.method2175(false);
            long var152 = (long) class157.field2165.method2220((byte) 121);
            long var154 = (long) class157.field2165.method2210((byte) -5);
            int var156 = class157.field2165.method2219(16448);
            long var157 = (var152 << 32) + var154;
            boolean var159 = false;
            int var160 = 0;
            label1459: while (true) {
                if (var160 < 100) {
                    if (class179.field2408[var160] != var157) {
                        var160++;
                        continue;
                    }
                    var159 = true;
                    break;
                }
                if (var156 <= 1) {
                    if ((!class45.field555 || class162.field2228) && !field998) {
                        for (int var161 = 0; var161 < class64.field826; var161++) {
                            if (class143.field1966[var161] == var150) {
                                var159 = true;
                                break label1459;
                            }
                        }
                    } else {
                        var159 = true;
                    }
                }
                break;
            }
            if (!var159 && class88.field1250 == 0) {
                class179.field2408[class122.field1655] = var157;
                class122.field1655 = (class122.field1655 + 1) % 100;
                String var162 = class277.method1903(class293.method2001((byte) -97, class175.method1216(class157.field2165, 95)));
                if (var156 == 2 || var156 == 3) {
                    class93.method695((byte) 114, 7, var162, "<img=1>" + class256.method1746(var150, 0));
                } else if (var156 == 1) {
                    class93.method695((byte) 125, 7, var162, "<img=0>" + class256.method1746(var150, 0));
                } else {
                    class93.method695((byte) 121, 3, var162, class256.method1746(var150, 0));
                }
            }
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 80) {
            class31.method181((byte) -74);
            class24.field301 = class157.field2165.method2219(16448);
            class239.field3389 = class185.field2549;
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 228) {
            int var348 = class157.field2165.method2190((byte) 119);
            int var349 = class157.field2165.method2204(90);
            if (class287.method1977((byte) 114, var348)) {
                class145.field2002 = var349;
            }
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 253) {
            int var163 = class157.field2165.method2219(16448);
            int var164 = class157.field2165.method2190((byte) 123);
            int var165 = class157.field2165.method2190((byte) 125);
            if (class287.method1977((byte) 118, var165)) {
                if (var163 == 2) {
                    class71.method519(true);
                }
                class183.field2521 = var164;
                class45.method289(var164, true);
                class134.method977(false, 128);
                class241.method1654(class183.field2521, (byte) -21);
                for (int var166 = 0; var166 < 100; var166++) {
                    class121.field1644[var166] = true;
                }
            }
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 92) {
            int var167 = class157.field2165.method2160(79);
            int var168 = class157.field2165.method2220((byte) 71);
            String var169 = class157.field2165.method2158(-872702056);
            if (class287.method1977((byte) 113, var168)) {
                class237.method1629(var169, -9965, var167);
            }
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 213) {
            class318.method2230(true, true);
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 83) {
            int var345 = class157.field2165.method2168((byte) -113);
            byte var346 = class157.field2165.method2195(128);
            int var347 = class157.field2165.method2168((byte) -106);
            if (class287.method1977((byte) 118, var345)) {
                class197.method1392((byte) 56, var346, var347);
            }
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 56) {
            long var170 = class157.field2165.method2175(false);
            boolean var172 = false;
            if ((Long.MIN_VALUE & var170) != 0L) {
                var172 = true;
            }
            int var173 = class157.field2165.method2220((byte) 61);
            byte var174 = class157.field2165.method2192(3);
            if (var172) {
                if (class324.field4917 == 0) {
                    class159.field2179 = -1;
                    return true;
                }
                long var175 = var170 & Long.MAX_VALUE;
                boolean var177 = false;
                int var178;
                for (var178 = 0; class324.field4917 > var178 && (class344.field5239[var178].field2522 != var175 || class344.field5239[var178].field1529 != var173); var178++) {
                }
                if (var178 < class324.field4917) {
                    while (var178 < class324.field4917 - 1) {
                        class344.field5239[var178] = class344.field5239[var178 + 1];
                        var178++;
                    }
                    class324.field4917--;
                    class344.field5239[class324.field4917] = null;
                }
            } else {
                String var179 = class157.field2165.method2158(-872702056);
                class112 var180 = new class112();
                var180.field2522 = var170;
                var180.field1535 = class309.method2120(false, var180.field2522);
                var180.field1528 = var174;
                var180.field1536 = var179;
                var180.field1529 = var173;
                int var181;
                for (var181 = class324.field4917 - 1; var181 >= 0; var181--) {
                    int var182 = class344.field5239[var181].field1535.compareTo(var180.field1535);
                    if (var182 == 0) {
                        class344.field5239[var181].field1529 = var173;
                        class344.field5239[var181].field1528 = var174;
                        class344.field5239[var181].field1536 = var179;
                        class79.field1144 = class185.field2549;
                        if (class66.field866 == var170) {
                            class211.field3060 = var174;
                        }
                        class159.field2179 = -1;
                        return true;
                    }
                    if (var182 < 0) {
                        break;
                    }
                }
                if (class344.field5239.length <= class324.field4917) {
                    class159.field2179 = -1;
                    return true;
                }
                for (int var183 = class324.field4917 - 1; var183 > var181; var183--) {
                    class344.field5239[var183 + 1] = class344.field5239[var183];
                }
                if (class324.field4917 == 0) {
                    class344.field5239 = new class112[100];
                }
                class344.field5239[var181 + 1] = var180;
                if (class66.field866 == var170) {
                    class211.field3060 = var174;
                }
                class324.field4917++;
            }
            class79.field1144 = class185.field2549;
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 34) {
            if (class199.field2833 == 0) {
                class7.field70 = class273.field4090;
            } else {
                class7.field70 = class157.field2165.method2158(-872702056);
            }
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 187) {
            int var184 = class157.field2165.method2215((byte) -15);
            int var185 = class157.field2165.method2160(89);
            if (class287.method1977((byte) 127, var185)) {
                int var186 = 0;
                if (class173.field2356.field3422 != null) {
                    var186 = class173.field2356.field3422.method432(-109);
                }
                class44.method284(var186, -1, var184, 3, 71);
            }
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 98) {
            int var187 = class157.field2165.method2160(71);
            String var188 = class157.field2165.method2158(-872702056);
            int var189 = class157.field2165.method2190((byte) 120);
            if (class287.method1977((byte) 126, var189)) {
                class237.method1629(var188, -9965, var187);
            }
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 36) {
            int var342 = class157.field2165.method2172((byte) 71);
            class344 var343 = class151.method1101(-49, var342);
            for (int var344 = 0; var344 < var343.field5278.length; var344++) {
                var343.field5278[var344] = -1;
                var343.field5278[var344] = 0;
            }
            class255.method1741(var343, false);
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 49) {
            int var338 = class157.field2165.method2219(16448);
            int var339 = class157.field2165.method2168((byte) -126);
            int var340 = class157.field2165.method2220((byte) 46);
            class329 var341 = class42.field484[var339];
            if (var341 != null) {
                class327.method2289((byte) -128, var340, var341, var338);
            }
            class159.field2179 = -1;
            return true;
        } else if (class159.field2179 == 189) {
            class167.field2278 = 0;
            class159.field2179 = -1;
            return true;
        } else {
            if (arg0 > -93) {
                field1000 = true;
            }
            if (class159.field2179 == 26) {
                int var190 = class157.field2165.method2220((byte) 81);
                int var191 = class157.field2165.method2176(9639);
                class249.method1703(var190, 19558, var191);
                class159.field2179 = -1;
                return true;
            } else if (class159.field2179 == 148) {
                class31.method181((byte) -91);
                class203.field2906 = class157.field2165.method2161(28984);
                class159.field2179 = -1;
                class239.field3389 = class185.field2549;
                return true;
            } else if (class159.field2179 == 130) {
                int var335 = class157.field2165.method2215((byte) -38);
                int var336 = class157.field2165.method2168((byte) -106);
                String var337 = class157.field2165.method2158(-872702056);
                if (class287.method1977((byte) 110, var336)) {
                    class242.method1659(-74, var337, var335);
                }
                class159.field2179 = -1;
                return true;
            } else if (class159.field2179 == 216) {
                int var192 = class157.field2165.method2168((byte) -123);
                int var193 = class157.field2165.method2194((byte) 105);
                int var194 = class157.field2165.method2190((byte) 117);
                if (class287.method1977((byte) 122, var192)) {
                    class197.method1392((byte) 56, var193, var194);
                }
                class159.field2179 = -1;
                return true;
            } else if (class159.field2179 == 183) {
                int var195 = class157.field2165.method2160(76);
                byte var196 = class157.field2165.method2192(3);
                class266.method1810(var196, -19014, var195);
                class159.field2179 = -1;
                return true;
            } else if (class159.field2179 == 82) {
                int var197 = class157.field2165.method2215((byte) -124);
                int var198 = class157.field2165.method2160(97);
                class266.method1810(var197, -19014, var198);
                class159.field2179 = -1;
                return true;
            } else if (class159.field2179 == 103) {
                int var328 = class157.field2165.method2215((byte) -79);
                int var329 = class157.field2165.method2160(75);
                int var330 = class157.field2165.method2172((byte) 71);
                if (class287.method1977((byte) 126, var329)) {
                    class48 var331 = (class48) class211.field3056.method111(-105, (long) var330);
                    class48 var332 = (class48) class211.field3056.method111(62, (long) var328);
                    if (var332 != null) {
                        class290.method1991(var331 == null || var331.field595 != var332.field595, (byte) 102, var332);
                    }
                    if (var331 != null) {
                        var331.method1274((byte) -26);
                        class211.field3056.method120((long) var328, var331, -22851);
                    }
                    class344 var333 = class151.method1101(-116, var330);
                    if (var333 != null) {
                        class255.method1741(var333, false);
                    }
                    class344 var334 = class151.method1101(-52, var328);
                    if (var334 != null) {
                        class255.method1741(var334, false);
                        class275.method1893(-24740, true, var334);
                    }
                    if (class183.field2521 != -1) {
                        class52.method358(1, class183.field2521, 18248);
                    }
                }
                class159.field2179 = -1;
                return true;
            } else if (class159.field2179 == 5) {
                int var322 = class157.field2165.method2220((byte) 84);
                int var323 = class157.field2165.method2219(16448);
                int var324 = class157.field2165.method2219(16448);
                int var325 = class157.field2165.method2220((byte) 123);
                int var326 = class157.field2165.method2219(16448);
                int var327 = class157.field2165.method2219(16448);
                if (class287.method1977((byte) 111, var322)) {
                    class226.method1588(var326, false, var323, var325, var327, var324);
                }
                class159.field2179 = -1;
                return true;
            } else if (class159.field2179 == 123) {
                int var312 = class157.field2165.method2156(0);
                int var313 = class157.field2165.method2160(93);
                if (var313 == 65535) {
                    var313 = -1;
                }
                int var314 = class157.field2165.method2220((byte) 84);
                int var315 = class157.field2165.method2194((byte) -76);
                if (var314 == 65535) {
                    var314 = -1;
                }
                int var316 = class157.field2165.method2160(99);
                if (class287.method1977((byte) 119, var316)) {
                    for (int var317 = var314; var317 <= var313; var317++) {
                        long var318 = ((long) var315 << 32) + (long) var317;
                        class300 var320 = (class300) class13.field150.method111(-114, var318);
                        class300 var321;
                        if (var320 != null) {
                            var321 = new class300(var312, var320.field4427);
                            var320.method1274((byte) -26);
                        } else if (var317 == -1) {
                            var321 = new class300(var312, class151.method1101(-39, var315).field5261.field4427);
                        } else {
                            var321 = new class300(var312, -1);
                        }
                        class13.field150.method120(var318, var321, -22851);
                    }
                }
                class159.field2179 = -1;
                return true;
            } else if (class159.field2179 == 79) {
                int var199 = class157.field2165.method2172((byte) 71);
                int var200 = class157.field2165.method2220((byte) 73);
                int var201 = class157.field2165.method2190((byte) 121);
                int var202 = class157.field2165.method2160(79);
                int var203 = class157.field2165.method2168((byte) -106);
                if (class287.method1977((byte) 127, var201)) {
                    class124.method894(var203, var200, 128, var202, var199);
                }
                class159.field2179 = -1;
                return true;
            } else if (class159.field2179 == 73) {
                int var311 = class157.field2165.method2220((byte) 63);
                class288.method1979(117, var311);
                class218.field3130[class47.method303(class103.field1406++, 31)] = class47.method303(32767, var311);
                class159.field2179 = -1;
                return true;
            } else if (class159.field2179 == 238) {
                class73.method542((byte) -128);
                class31.method181((byte) -96);
                class159.field2179 = -1;
                class287.field4274 += 32;
                return true;
            } else if (class159.field2179 == 152) {
                int var300 = class157.field2165.method2220((byte) 113);
                if (var300 == 65535) {
                    var300 = -1;
                }
                int var301 = class157.field2165.method2176(9639);
                int var302 = var301 & 0x3;
                int var303 = var301 >> 2;
                int var304 = class185.field2557[var303];
                int var305 = class157.field2165.method2156(0);
                int var306 = var305 >> 14 & 0x3FFF;
                int var307 = (var305 & 0x3F4D3F70) >> 28;
                int var308 = var306 - class132.field1809;
                int var309 = var305 & 0x3FFF;
                int var310 = var309 - class296.field4394;
                class192.method1342(var307, var304, var308, var310, var303, var300, var302, (byte) -8);
                class159.field2179 = -1;
                return true;
            } else if (class159.field2179 == 154) {
                class286.field4251 = class157.field2165.method2176(9639);
                class44.field540 = class157.field2165.method2183(92);
                for (int var297 = class286.field4251; var297 < (class286.field4251 + 8); var297++) {
                    for (int var298 = class44.field540; var298 < class44.field540 + 8; var298++) {
                        if (class246.field3544[class251.field3603][var297][var298] != null) {
                            class246.field3544[class251.field3603][var297][var298] = null;
                            class153.method1104(var297, -99999999, var298);
                        }
                    }
                }
                for (class238 var299 = (class238) class53.field706.method1335(1); var299 != null; var299 = (class238) class53.field706.method1336(3)) {
                    if (class286.field4251 <= var299.field3384 && class286.field4251 + 8 > var299.field3384 && class44.field540 <= var299.field3370 && class44.field540 + 8 > var299.field3370 && class251.field3603 == var299.field3379) {
                        var299.field3375 = 0;
                    }
                }
                class159.field2179 = -1;
                return true;
            } else if (class159.field2179 == 156) {
                class286.field4251 = class157.field2165.method2219(16448);
                class44.field540 = class157.field2165.method2183(124);
                class159.field2179 = -1;
                return true;
            } else if (class159.field2179 == 115) {
                for (int var296 = 0; var296 < class324.field4920.length; var296++) {
                    if (class324.field4920[var296] != class273.field4083[var296]) {
                        class324.field4920[var296] = class273.field4083[var296];
                        class248.method1696(var296, (byte) -73);
                        class223.field3222[class47.method303(31, class287.field4274++)] = var296;
                    }
                }
                class159.field2179 = -1;
                return true;
            } else if (class159.field2179 == 143) {
                long var204 = class157.field2165.method2175(false);
                String var206 = class277.method1903(class293.method2001((byte) -97, class175.method1216(class157.field2165, 79)));
                class93.method695((byte) -19, 6, var206, class256.method1746(var204, 0));
                class159.field2179 = -1;
                return true;
            } else if (class159.field2179 == 144) {
                int var207 = class157.field2165.method2160(111);
                int var208 = class157.field2165.method2160(89);
                int var209 = class157.field2165.method2172((byte) 71);
                if (class287.method1977((byte) 112, var207)) {
                    class150.method1083((byte) -76, var208, var209);
                }
                class159.field2179 = -1;
                return true;
            } else if (class159.field2179 == 107) {
                int var286 = class157.field2165.method2190((byte) 112);
                if (var286 == 65535) {
                    var286 = -1;
                }
                int var287 = class157.field2165.method2172((byte) 71);
                int var288 = class157.field2165.method2160(111);
                int var289 = class157.field2165.method2160(118);
                if (var289 == 65535) {
                    var289 = -1;
                }
                int var290 = class157.field2165.method2190((byte) 115);
                if (class287.method1977((byte) 123, var290)) {
                    for (int var291 = var289; var291 <= var286; var291++) {
                        long var292 = ((long) var287 << 32) + ((long) var291);
                        class300 var294 = (class300) class13.field150.method111(105, var292);
                        class300 var295;
                        if (var294 != null) {
                            var295 = new class300(var294.field4426, var288);
                            var294.method1274((byte) -26);
                        } else if (var291 == -1) {
                            var295 = new class300(class151.method1101(-38, var287).field5261.field4426, var288);
                        } else {
                            var295 = new class300(0, var288);
                        }
                        class13.field150.method120(var292, var295, -22851);
                    }
                }
                class159.field2179 = -1;
                return true;
            } else if (class159.field2179 == 151) {
                int var252 = class157.field2165.method2190((byte) 127);
                int var253 = class157.field2165.method2220((byte) 77);
                int var254 = class157.field2165.method2215((byte) -86);
                int var255 = class157.field2165.method2220((byte) 94);
                if (var254 >> 30 != 0) {
                    int var280 = (var254 >> 14 & 0x3FFF) - class132.field1809;
                    int var281 = (var254 & 0x3E8E3237) >> 28;
                    int var282 = (var254 & 0x3FFF) - class296.field4394;
                    if (var280 >= 0 && var282 >= 0 && var280 < 104 && var282 < 104) {
                        int var283 = var282 * 128 + 64;
                        int var284 = var280 * 128 + 64;
                        class245 var285 = new class245(var252, var281, var284, var283, class135.method985(var283, var281, var284, (byte) -119) - var255, var253, class329.field4966);
                        class332.field4994.method1339((byte) 116, new class199(var285));
                    }
                } else if (var254 >> 29 != 0) {
                    int var256 = var254 & 0xFFFF;
                    class329 var257 = class42.field484[var256];
                    if (var257 != null) {
                        if (var252 == 65535) {
                            var252 = -1;
                        }
                        boolean var258 = true;
                        if (var252 != -1 && var257.field3715 != -1) {
                            if (var257.field3715 == var252) {
                                class309 var263 = class336.method2329(-99, var252);
                                if (var263.field4664 && var263.field4662 != -1) {
                                    class125 var264 = class52.method361(true, var263.field4662);
                                    int var265 = var264.field1681;
                                    if (var265 == 1) {
                                        var257.field3737 = 0;
                                        var257.field3723 = 0;
                                        var257.field3713 = 1;
                                        var257.field3718 = 0;
                                        var257.field3710 = class329.field4966 + var253;
                                        var258 = false;
                                        class241.method1651(var257.field3737, false, var257.field3745, var264, var257.field3679, 95);
                                    } else if (var265 == 2) {
                                        var258 = false;
                                        var257.field3760 = 0;
                                    }
                                }
                            } else {
                                class309 var259 = class336.method2329(-116, var252);
                                class309 var260 = class336.method2329(-110, var257.field3715);
                                if (var259.field4662 != -1 && var260.field4662 != -1) {
                                    class125 var261 = class52.method361(true, var259.field4662);
                                    class125 var262 = class52.method361(true, var260.field4662);
                                    if (var262.field1684 > var261.field1684) {
                                        var258 = false;
                                    }
                                }
                            }
                        }
                        if (var258) {
                            var257.field3718 = 0;
                            var257.field3692 = var255;
                            var257.field3710 = class329.field4966 + var253;
                            var257.field3737 = 0;
                            var257.field3715 = var252;
                            if (var257.field3710 > class329.field4966) {
                                var257.field3737 = -1;
                            }
                            var257.field3713 = 1;
                            if (var257.field3715 != -1 && class329.field4966 == var257.field3710) {
                                int var266 = class336.method2329(-126, var257.field3715).field4662;
                                if (var266 != -1) {
                                    class125 var267 = class52.method361(true, var266);
                                    if (var267 != null && var267.field1707 != null) {
                                        class241.method1651(0, false, var257.field3745, var267, var257.field3679, -39);
                                    }
                                }
                            }
                        }
                    }
                } else if ((var254 >> 28) != 0) {
                    int var268 = var254 & 0xFFFF;
                    class241 var269;
                    if (class306.field4593 == var268) {
                        var269 = class173.field2356;
                    } else {
                        var269 = class169.field2306[var268];
                    }
                    if (var269 != null) {
                        boolean var270 = true;
                        if (var252 == 65535) {
                            var252 = -1;
                        }
                        if (var252 != -1 && var269.field3715 != -1) {
                            if (var269.field3715 == var252) {
                                class309 var271 = class336.method2329(-107, var252);
                                if (var271.field4664 && var271.field4662 != -1) {
                                    class125 var272 = class52.method361(true, var271.field4662);
                                    int var273 = var272.field1681;
                                    if (var273 == 1) {
                                        var269.field3737 = 0;
                                        var269.field3710 = class329.field4966 + var253;
                                        var270 = false;
                                        var269.field3718 = 0;
                                        var269.field3723 = 0;
                                        var269.field3713 = 1;
                                        class241.method1651(var269.field3737, false, var269.field3745, var272, var269.field3679, -48);
                                    } else if (var273 == 2) {
                                        var269.field3760 = 0;
                                        var270 = false;
                                    }
                                }
                            } else {
                                class309 var274 = class336.method2329(-56, var252);
                                class309 var275 = class336.method2329(-110, var269.field3715);
                                if (var274.field4662 != -1 && var275.field4662 != -1) {
                                    class125 var276 = class52.method361(true, var274.field4662);
                                    class125 var277 = class52.method361(true, var275.field4662);
                                    if (var277.field1684 > var276.field1684) {
                                        var270 = false;
                                    }
                                }
                            }
                        }
                        if (var270) {
                            var269.field3713 = 1;
                            var269.field3715 = var252;
                            var269.field3710 = class329.field4966 + var253;
                            var269.field3718 = 0;
                            if (var269.field3715 == 65535) {
                                var269.field3715 = -1;
                            }
                            var269.field3692 = var255;
                            var269.field3737 = 0;
                            if (class329.field4966 < var269.field3710) {
                                var269.field3737 = -1;
                            }
                            if (var269.field3715 != -1 && class329.field4966 == var269.field3710) {
                                int var278 = class336.method2329(-124, var269.field3715).field4662;
                                if (var278 != -1) {
                                    class125 var279 = class52.method361(true, var278);
                                    if (var279 != null && var279.field1707 != null) {
                                        class241.method1651(0, class173.field2356 == var269, var269.field3745, var279, var269.field3679, -120);
                                    }
                                }
                            }
                        }
                    }
                }
                class159.field2179 = -1;
                return true;
            } else if (class159.field2179 == 91) {
                int var210 = class157.field2165.method2183(-112);
                int var211 = class157.field2165.method2220((byte) 114);
                if (var211 == 65535) {
                    var211 = -1;
                }
                class71.method523(true, var210, var211);
                class159.field2179 = -1;
                return true;
            } else if (class159.field2179 == 223) {
                int var212 = class157.field2165.method2165(-19235);
                int var213 = class157.field2165.method2220((byte) 68);
                int var214 = class157.field2165.method2204(74);
                if (var213 == 65535) {
                    var213 = -1;
                }
                class63.method422(var214, (byte) 117, var213, var212);
                class159.field2179 = -1;
                return true;
            } else if (class159.field2179 == 255) {
                int var246 = class157.field2165.method2172((byte) 71);
                int var247 = class157.field2165.method2220((byte) 121);
                if (var246 < -70000) {
                    var247 += 32768;
                }
                class344 var248;
                if (var246 < 0) {
                    var248 = null;
                } else {
                    var248 = class151.method1101(-44, var246);
                }
                while (class157.field2165.field4777 < class199.field2833) {
                    int var249 = class157.field2165.method2193(49152);
                    int var250 = class157.field2165.method2220((byte) 70);
                    int var251 = 0;
                    if (var250 != 0) {
                        var251 = class157.field2165.method2219(16448);
                        if (var251 == 255) {
                            var251 = class157.field2165.method2172((byte) 71);
                        }
                    }
                    if (var248 != null && var249 >= 0 && var249 < var248.field5278.length) {
                        var248.field5278[var249] = var250;
                        var248.field5237[var249] = var251;
                    }
                    class241.method1649(var251, (byte) 114, var249, var247, var250 - 1);
                }
                if (var248 != null) {
                    class255.method1741(var248, false);
                }
                class31.method181((byte) -101);
                class218.field3130[class47.method303(31, class103.field1406++)] = class47.method303(32767, var247);
                class159.field2179 = -1;
                return true;
            } else if (class159.field2179 == 124) {
                class157.field2165.field4777 += 28;
                if (class157.field2165.method2203(13121)) {
                    class160.method1155(class157.field2165, class157.field2165.field4777 - 28, 37);
                }
                class159.field2179 = -1;
                return true;
            } else if (class159.field2179 == 229) {
                if (class329.field4964 != null) {
                    class85.method663(class162.field2230, -1, false, (byte) 44, -1);
                }
                byte[] var244 = new byte[class199.field2833];
                class157.field2165.method2236(var244, -119, 0, class199.field2833);
                String var245 = class21.method132(class199.field2833, var244, -1, 0);
                if (class138.field1898 == null && class80.field1151 == 3 || !class80.field1164.startsWith("win") || class148.field2054) {
                    class221.method1557(-125, true, var245);
                } else {
                    class93.field1287 = true;
                    class216.field3083 = var245;
                    class106.field1436 = class165.field2258.method623((byte) 105, var245);
                }
                class159.field2179 = -1;
                return true;
            } else if (class159.field2179 == 10) {
                field996 = class157.field2165.method2219(16448);
                class159.field2179 = -1;
                return true;
            } else if (class159.field2179 == 179) {
                int var215 = class157.field2165.method2190((byte) 127);
                if (var215 == 65535) {
                    var215 = -1;
                }
                int var216 = class157.field2165.method2168((byte) -126);
                int var217 = class157.field2165.method2156(0);
                if (class287.method1977((byte) 119, var216)) {
                    class44.method284(var215, -1, var217, 2, 73);
                }
                class159.field2179 = -1;
                return true;
            } else if (class159.field2179 == 116) {
                int var241 = class157.field2165.method2220((byte) 101);
                int var242 = class157.field2165.method2172((byte) 71);
                if (class287.method1977((byte) 118, var241)) {
                    class48 var243 = (class48) class211.field3056.method111(-114, (long) var242);
                    if (var243 != null) {
                        class290.method1991(true, (byte) 82, var243);
                    }
                    if (class187.field2591 != null) {
                        class255.method1741(class187.field2591, false);
                        class187.field2591 = null;
                    }
                }
                class159.field2179 = -1;
                return true;
            } else if (class159.field2179 == 96) {
                class145.method1047(-117);
                class159.field2179 = -1;
                return true;
            } else if (class159.field2179 == 192) {
                int var233 = class157.field2165.method2172((byte) 71);
                int var234 = class157.field2165.method2220((byte) 65);
                if (var233 < -70000) {
                    var234 += 32768;
                }
                class344 var235;
                if (var233 >= 0) {
                    var235 = class151.method1101(-26, var233);
                } else {
                    var235 = null;
                }
                if (var235 != null) {
                    for (int var236 = 0; var236 < var235.field5278.length; var236++) {
                        var235.field5278[var236] = 0;
                        var235.field5237[var236] = 0;
                    }
                }
                class71.method520((byte) -115, var234);
                int var237 = class157.field2165.method2220((byte) 126);
                for (int var238 = 0; var238 < var237; var238++) {
                    int var239 = class157.field2165.method2183(49);
                    if (var239 == 255) {
                        var239 = class157.field2165.method2194((byte) 90);
                    }
                    int var240 = class157.field2165.method2160(127);
                    if (var235 != null && var235.field5278.length > var238) {
                        var235.field5278[var238] = var240;
                        var235.field5237[var238] = var239;
                    }
                    class241.method1649(var239, (byte) 114, var238, var234, var240 - 1);
                }
                if (var235 != null) {
                    class255.method1741(var235, false);
                }
                class31.method181((byte) -104);
                class218.field3130[class47.method303(class103.field1406++, 31)] = class47.method303(32767, var234);
                class159.field2179 = -1;
                return true;
            } else if (class159.field2179 == 89) {
                class42.method260(107, class157.field2165.method2158(-872702056));
                class159.field2179 = -1;
                return true;
            } else if (class159.field2179 == 211) {
                int var218 = class157.field2165.method2156(0);
                int var219 = class157.field2165.method2160(123);
                int var220 = class157.field2165.method2194((byte) 71);
                int var221 = class157.field2165.method2168((byte) -122);
                if (var221 == 65535) {
                    var221 = -1;
                }
                if (class287.method1977((byte) 127, var219)) {
                    class344 var222 = class151.method1101(-54, var220);
                    if (var222.field5267) {
                        class55.method381(var218, var220, var221, (byte) -47);
                        class198 var223 = class115.method854((byte) -94, var221);
                        class124.method894(var223.field2797, var223.field2812, 128, var223.field2763, var220);
                        class82.method640(var223.field2805, var223.field2808, var220, (byte) -58, var223.field2776);
                    } else if (var221 == -1) {
                        class159.field2179 = -1;
                        var222.field5304 = 0;
                        return true;
                    } else {
                        class198 var224 = class115.method854((byte) -79, var221);
                        var222.field5201 = var221;
                        var222.field5172 = var224.field2797;
                        var222.field5241 = var224.field2812;
                        var222.field5171 = var224.field2763 * 100 / var218;
                        var222.field5304 = 4;
                        class255.method1741(var222, false);
                    }
                }
                class159.field2179 = -1;
                return true;
            } else if (class159.field2179 == 99) {
                class44.field540 = class157.field2165.method2176(9639);
                class286.field4251 = class157.field2165.method2183(-94);
                while (class157.field2165.field4777 < class199.field2833) {
                    class159.field2179 = class157.field2165.method2219(16448);
                    class21.method130((byte) -99);
                }
                class159.field2179 = -1;
                return true;
            } else if (class159.field2179 == 204) {
                class31.method181((byte) -111);
                int var225 = class157.field2165.method2204(67);
                int var226 = class157.field2165.method2172((byte) 71);
                int var227 = class157.field2165.method2183(-117);
                class223.field3221[var225] = var226;
                class213.field3072[var225] = var227;
                class237.field3367[var225] = 1;
                for (int var228 = 0; var228 < 98; var228++) {
                    if (class311.field4702[var228] <= var226) {
                        class237.field3367[var225] = var228 + 2;
                    }
                }
                class269.field3988[class47.method303(31, class106.field1431++)] = var225;
                class159.field2179 = -1;
                return true;
            } else if (class159.field2179 == 30) {
                int var229 = class157.field2165.method2219(16448);
                int var230 = var229 >> 5;
                int var231 = var229 & 0x1F;
                if (var231 == 0) {
                    class294.field4367[var230] = null;
                    class159.field2179 = -1;
                    return true;
                }
                class324 var232 = new class324();
                var232.field4910 = var231;
                var232.field4910 = var229 & 0x3F;
                var232.field4915 = class157.field2165.method2219(16448);
                if (var232.field4915 >= 0 && class286.field4252.length > var232.field4915) {
                    if (var232.field4910 == 1 || var232.field4910 == 10) {
                        var232.field4906 = class157.field2165.method2220((byte) 123);
                        class157.field2165.field4777 += 5;
                    } else if (var232.field4910 >= 2 && var232.field4910 <= 6) {
                        if (var232.field4910 == 2) {
                            var232.field4922 = 64;
                            var232.field4916 = 64;
                        }
                        if (var232.field4910 == 3) {
                            var232.field4916 = 0;
                            var232.field4922 = 64;
                        }
                        if (var232.field4910 == 4) {
                            var232.field4922 = 64;
                            var232.field4916 = 128;
                        }
                        if (var232.field4910 == 5) {
                            var232.field4922 = 0;
                            var232.field4916 = 64;
                        }
                        if (var232.field4910 == 6) {
                            var232.field4916 = 64;
                            var232.field4922 = 128;
                        }
                        var232.field4910 = 2;
                        var232.field4914 = class157.field2165.method2220((byte) 78);
                        var232.field4923 = class157.field2165.method2220((byte) 113);
                        var232.field4921 = class157.field2165.method2219(16448);
                        var232.field4905 = class157.field2165.method2220((byte) 126);
                    }
                    var232.field4919 = class157.field2165.method2220((byte) 37);
                    if (var232.field4919 == 65535) {
                        var232.field4919 = -1;
                    }
                    class294.field4367[var230] = var232;
                }
                class159.field2179 = -1;
                return true;
            } else {
                class187.method1307("T1 - " + class159.field2179 + "," + class326.field4931 + "," + class199.field2843 + " - " + class199.field2833, (Throwable) null, -99);
                class37.method209(-120);
                return true;
            }
        }
    }
}
