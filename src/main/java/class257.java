import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class257 {

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "Lld;")
    private class114 field3386 = new class114();

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "Lld;")
    private class114 field3395 = new class114();

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "Lld;")
    private class114 field3400 = new class114();

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "Lld;")
    private class114 field3402 = new class114();

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "Lmd;")
    private class379 field3406 = new class379(4);

    @OriginalMember(owner = "client!oj", name = "A", descriptor = "B")
    private byte field3408 = 0;

    @OriginalMember(owner = "client!oj", name = "B", descriptor = "I")
    public volatile int field3409 = 0;

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "I")
    public volatile int field3407 = 0;

    @OriginalMember(owner = "client!oj", name = "C", descriptor = "Lmd;")
    private class379 field3410 = new class379(8);

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "[I")
    public static int[] field3383 = new int[5];

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "I")
    private int field3405;

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "J")
    private long field3404;

    @OriginalMember(owner = "client!oj", name = "D", descriptor = "Lli;")
    private class294 field3411;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "Lqe;")
    private class326 field3403;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "[[B")
    public static byte[][] field3388;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "[[B")
    public static byte[][] field3401;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIBZI)Lli;", line = 3)
    public final class294 method1543(int arg0, int arg1, byte arg2, boolean arg3, int arg4) {
        field3389++;
        long var6 = (long) ((arg4 << 16) + arg0);
        class294 var8 = new class294();
        var8.field3842 = arg2;
        if (arg1 != -21) {
            return null;
        }
        var8.field455 = arg3;
        var8.field6896 = var6;
        if (arg3) {
            if (this.method1550((byte) 28) >= 20) {
                throw new RuntimeException();
            }
            this.field3386.method783(var8, (byte) -111);
        } else if (this.method1554(false) < 20) {
            this.field3400.method783(var8, (byte) -28);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIII)I", line = 46)
    public static final int method1544(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        if (arg1 <= 117) {
            field3401 = null;
        }
        field3393++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 1023 - arg3;
        } else {
            return 1023 - arg0;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)Z", line = 70)
    public final boolean method1545(int arg0) {
        if (this.field3403 != null) {
            long var2 = class498.method2854(-114);
            int var4 = (int) (var2 - this.field3404);
            this.field3404 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field3405 += var4;
            if (this.field3405 > 30000) {
                try {
                    this.field3403.method1886(-1);
                } catch (Exception var27) {
                }
                this.field3403 = null;
            }
        }
        field3398++;
        if (this.field3403 == null) {
            return this.method1550((byte) 28) == 0 && this.method1554(false) == 0;
        }
        try {
            this.field3403.method1882(5000);
            for (class294 var5 = (class294) this.field3386.method786(1); var5 != null; var5 = (class294) this.field3386.method780((byte) -78)) {
                this.field3406.field5173 = 0;
                this.field3406.method2200(arg0 ^ 0x7, 1);
                this.field3406.method2185((int) var5.field6896, true);
                this.field3403.method1880(this.field3406.field5152, arg0 ^ 0x70, 0, 4);
                this.field3395.method783(var5, (byte) -34);
            }
            for (class294 var6 = (class294) this.field3400.method786(arg0 + 1); var6 != null; var6 = (class294) this.field3400.method780((byte) -78)) {
                this.field3406.field5173 = 0;
                this.field3406.method2200(7, 0);
                this.field3406.method2185((int) var6.field6896, true);
                this.field3403.method1880(this.field3406.field5152, 94, 0, 4);
                this.field3402.method783(var6, (byte) -13);
            }
            for (int var7 = arg0; var7 < 100; var7++) {
                int var8 = this.field3403.method1879(0);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field3405 = 0;
                byte var9 = 0;
                if (this.field3411 == null) {
                    var9 = 8;
                } else if (this.field3411.field3841 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field3410.field5173;
                    if (var8 < var10) {
                        var10 = var8;
                    }
                    this.field3403.method1884(var10, this.field3410.field5152, this.field3410.field5173, (byte) 124);
                    if (this.field3408 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field3410.field5152[this.field3410.field5173 + var11] = (byte) class106.method743(this.field3410.field5152[this.field3410.field5173 + var11], this.field3408);
                        }
                    }
                    this.field3410.field5173 += var10;
                    if (this.field3410.field5173 >= var9) {
                        if (this.field3411 == null) {
                            this.field3410.field5173 = 0;
                            int var12 = this.field3410.method2238(255);
                            int var13 = this.field3410.method2212((byte) 83);
                            int var14 = this.field3410.method2238(255);
                            int var15 = this.field3410.method2232((byte) 127);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class294 var21;
                            if (var17) {
                                for (var21 = (class294) this.field3402.method786(1); var21 != null && var21.field6896 != var18; var21 = (class294) this.field3402.method780((byte) -78)) {
                                }
                            } else {
                                for (var21 = (class294) this.field3395.method786(1); var21 != null && var21.field6896 != var18; var21 = (class294) this.field3395.method780((byte) -78)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field3411 = var21;
                            this.field3411.field3849 = new class379(var15 + this.field3411.field3842 + var22);
                            this.field3411.field3849.method2200(7, var16);
                            this.field3411.field3849.method2214(83, var15);
                            this.field3411.field3841 = 8;
                            this.field3410.field5173 = 0;
                        } else if (this.field3411.field3841 != 0) {
                            throw new IOException();
                        } else if (this.field3410.field5152[0] == -1) {
                            this.field3410.field5173 = 0;
                            this.field3411.field3841 = 1;
                        } else {
                            this.field3411 = null;
                        }
                    }
                } else {
                    int var23 = this.field3411.field3849.field5152.length - this.field3411.field3842;
                    int var24 = 512 - this.field3411.field3841;
                    if (var24 > (var23 - this.field3411.field3849.field5173)) {
                        var24 = var23 - this.field3411.field3849.field5173;
                    }
                    if (var8 < var24) {
                        var24 = var8;
                    }
                    this.field3403.method1884(var24, this.field3411.field3849.field5152, this.field3411.field3849.field5173, (byte) 125);
                    if (this.field3408 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field3411.field3849.field5152[this.field3411.field3849.field5173 + var25] = (byte) class106.method743(this.field3411.field3849.field5152[this.field3411.field3849.field5173 + var25], this.field3408);
                        }
                    }
                    this.field3411.field3841 += var24;
                    this.field3411.field3849.field5173 += var24;
                    if (this.field3411.field3849.field5173 == var23) {
                        this.field3411.method2856(0);
                        this.field3411.field456 = false;
                        this.field3411 = null;
                    } else if (this.field3411.field3841 == 512) {
                        this.field3411.field3841 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field3403.method1886(-1);
            } catch (Exception var26) {
            }
            this.field3407 = -2;
            this.field3403 = null;
            this.field3409++;
            return this.method1550((byte) 28) == 0 && this.method1554(false) == 0;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZLqe;I)V", line = 347)
    public final void method1546(boolean arg0, class326 arg1, int arg2) {
        if (this.field3403 != null) {
            try {
                this.field3403.method1886(-1);
            } catch (Exception var8) {
            }
            this.field3403 = null;
        }
        if (arg2 != 4) {
            this.method1555(-17);
        }
        field3396++;
        this.field3403 = arg1;
        this.method1552(false);
        this.method1557((byte) -89, arg0);
        this.field3410.field5173 = 0;
        this.field3411 = null;
        while (true) {
            class294 var4 = (class294) this.field3395.method787((byte) 127);
            if (var4 == null) {
                while (true) {
                    class294 var5 = (class294) this.field3402.method787((byte) 127);
                    if (var5 == null) {
                        if (this.field3408 != 0) {
                            try {
                                this.field3406.field5173 = 0;
                                this.field3406.method2200(7, 4);
                                this.field3406.method2200(7, this.field3408);
                                this.field3406.method2246(0, (byte) -49);
                                this.field3403.method1880(this.field3406.field5152, 112, 0, 4);
                            } catch (IOException var7) {
                                try {
                                    this.field3403.method1886(arg2 - 5);
                                } catch (Exception var6) {
                                }
                                this.field3409++;
                                this.field3403 = null;
                                this.field3407 = -2;
                            }
                        }
                        this.field3405 = 0;
                        this.field3404 = class498.method2854(arg2 ^ 0xFFFFFF84);
                        return;
                    }
                    this.field3400.method783(var5, (byte) -73);
                }
            }
            this.field3386.method783(var4, (byte) -117);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)Z", line = 416)
    public final boolean method1547(boolean arg0) {
        if (!arg0) {
            field3388 = null;
        }
        field3394++;
        return this.method1554(false) >= 20;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V", line = 427)
    public final void method1548(int arg0) {
        if (arg0 == -2) {
            field3397++;
            if (this.field3403 != null) {
                this.field3403.method1886(-1);
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(Z)V", line = 440)
    public final void method1549(boolean arg0) {
        try {
            this.field3403.method1886(-1);
        } catch (Exception var2) {
        }
        field3385++;
        this.field3403 = null;
        this.field3408 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field3409++;
        this.field3407 = -1;
        if (arg0) {
            this.method1551((byte) 7);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)I", line = 460)
    public final int method1550(byte arg0) {
        if (arg0 == 28) {
            field3384++;
            return this.field3386.method785(12899) + this.field3395.method785(12899);
        } else {
            return 71;
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)V", line = 471)
    public final void method1551(byte arg0) {
        int var2 = -69 % ((-arg0 - 23) / 49);
        field3382++;
        if (this.field3403 != null) {
            this.field3403.method1883((byte) -29);
        }
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(Z)V", line = 484)
    private final void method1552(boolean arg0) {
        field3392++;
        if (this.field3403 == null) {
            return;
        }
        try {
            this.field3406.field5173 = 0;
            this.field3406.method2200(7, 6);
            this.field3406.method2185(3, !arg0);
            if (arg0) {
                this.method1556(true);
            }
            this.field3403.method1880(this.field3406.field5152, 124, 0, 4);
        } catch (IOException var3) {
            try {
                this.field3403.method1886(-1);
            } catch (Exception var2) {
            }
            this.field3403 = null;
            this.field3409++;
            this.field3407 = -2;
        }
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V", line = 511)
    public static void method1553(int arg0) {
        field3401 = null;
        if (arg0 <= -74) {
            field3383 = null;
            field3388 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(Z)I", line = 524)
    private final int method1554(boolean arg0) {
        if (arg0) {
            return 106;
        } else {
            field3391++;
            return this.field3400.method785(12899) + this.field3402.method785(12899);
        }
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(I)Z", line = 547)
    public final boolean method1555(int arg0) {
        if (arg0 != 20) {
            this.field3402 = null;
        }
        field3387++;
        return this.method1550((byte) 28) >= 20;
    }

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "(Z)V", line = 558)
    public final void method1556(boolean arg0) {
        field3399++;
        if (arg0) {
            this.method1549(false);
        }
        if (this.field3403 == null) {
            return;
        }
        try {
            this.field3406.field5173 = 0;
            this.field3406.method2200(7, 7);
            this.field3406.method2185(0, true);
            this.field3403.method1880(this.field3406.field5152, 100, 0, 4);
        } catch (IOException var3) {
            try {
                this.field3403.method1886(-1);
            } catch (Exception var2) {
            }
            this.field3409++;
            this.field3403 = null;
            this.field3407 = -2;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BZ)V", line = 589)
    public final void method1557(byte arg0, boolean arg1) {
        field3390++;
        if (this.field3403 == null) {
            return;
        }
        try {
            this.field3406.field5173 = 0;
            this.field3406.method2200(7, arg1 ? 2 : 3);
            this.field3406.method2185(0, true);
            this.field3403.method1880(this.field3406.field5152, arg0 ^ 0xFFFFFFC5, 0, 4);
            if (arg0 != -89) {
                this.field3407 = 32;
            }
        } catch (IOException var4) {
            try {
                this.field3403.method1886(-1);
            } catch (Exception var3) {
            }
            this.field3409++;
            this.field3403 = null;
            this.field3407 = -2;
        }
    }
}
