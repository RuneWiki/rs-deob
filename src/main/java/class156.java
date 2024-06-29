import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class156 {

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "Z")
    public boolean field2479 = false;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    private int field2480 = 0;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public int field2486 = -1;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    private int field2489 = 128;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    private int field2493 = 0;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
    private int field2495 = 128;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "Z")
    public boolean field2481 = false;

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
    private int field2501 = 0;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "[J")
    public static long[] field2488 = new long[256];

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
    public static int field2494 = 0;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "Z")
    public static boolean field2485 = false;

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public int field2483;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    private int field2491;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "Lgi;")
    public static class164 field2502;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "[S")
    private short[] field2482;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "[S")
    private short[] field2487;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "[S")
    private short[] field2497;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "[S")
    private short[] field2499;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)I")
    public static final int method1052(int arg0, int arg1, int arg2) {
        field2496++;
        class74 var3 = (class74) class57.field829.method371(arg1 ^ 0xFFFFFF8C, (long) arg0);
        if (var3 == null) {
            return 0;
        } else if (arg1 <= arg2 && arg2 < var3.field1188.length) {
            return var3.field1188[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public static final void method1053(int arg0) {
        field2484++;
        class208.field3315 = new class248[class127.field2026.method1146((byte) -90)][];
        class232.field3630 = new boolean[class127.field2026.method1146((byte) -96)];
        if (arg0 >= -36) {
            method1053(42);
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
    public static final void method1054(int arg0) {
        class170.field2791.method1873(-7401);
        if (arg0 <= -6) {
            class202.field3279.method1873(-7401);
            class72.field1156.method1873(-7401);
            field2500++;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZIII)Lha;")
    public final class32 method1055(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            this.field2480 = -40;
        }
        field2503++;
        class32 var5 = (class32) class50.field727.method1879(8887, (long) this.field2483);
        if (var5 == null) {
            class201 var6 = class201.method1380(class273.field4412, this.field2491, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field2499 != null) {
                for (int var7 = 0; var7 < this.field2499.length; var7++) {
                    var6.method1403(this.field2499[var7], this.field2482[var7]);
                }
            }
            if (this.field2497 != null) {
                for (int var8 = 0; var8 < this.field2497.length; var8++) {
                    var6.method1384(this.field2497[var8], this.field2487[var8]);
                }
            }
            var5 = var6.method1391(this.field2493 + 64, 850 - -this.field2501, -30, -50, -30);
            class50.field727.method1883((long) this.field2483, -97, var5);
        }
        class32 var9;
        if (this.field2486 == -1 || arg1 == -1) {
            var9 = var5.method25(true, true, true);
        } else {
            var9 = class159.method1085((byte) -63, this.field2486).method635(arg2, var5, (byte) 112, arg1, arg3);
        }
        if (this.field2489 != 128 || this.field2495 != 128) {
            var9.method47(this.field2489, this.field2495, this.field2489);
        }
        if (this.field2480 != 0) {
            if (this.field2480 == 90) {
                var9.method44();
            }
            if (this.field2480 == 180) {
                var9.method53();
            }
            if (this.field2480 == 270) {
                var9.method29();
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILfj;B)V")
    private final void method1056(int arg0, class274 arg1, byte arg2) {
        field2492++;
        if (arg0 == 1) {
            this.field2491 = arg1.method1837(252);
        } else if (arg0 == 2) {
            this.field2486 = arg1.method1837(252);
        } else if (arg0 == 4) {
            this.field2489 = arg1.method1837(252);
        } else if (arg0 == 5) {
            this.field2495 = arg1.method1837(252);
        } else if (arg0 == 6) {
            this.field2480 = arg1.method1837(252);
        } else if (arg0 == 7) {
            this.field2493 = arg1.method1849(255);
        } else if (arg0 == 8) {
            this.field2501 = arg1.method1849(255);
        } else if (arg0 == 9) {
            this.field2481 = true;
        } else if (arg0 == 10) {
            this.field2479 = true;
        } else if (arg0 == 40) {
            int var4 = arg1.method1849(255);
            this.field2499 = new short[var4];
            this.field2482 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2499[var5] = (short) arg1.method1837(252);
                this.field2482[var5] = (short) arg1.method1837(252);
            }
        } else if (arg0 == 41) {
            int var6 = arg1.method1849(255);
            this.field2487 = new short[var6];
            this.field2497 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2497[var7] = (short) arg1.method1837(252);
                this.field2487[var7] = (short) arg1.method1837(252);
            }
        }
        int var8 = -40 / ((-arg2 - 23) / 42);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lfj;I)V")
    public final void method1057(class274 arg0, int arg1) {
        if (arg1 != 0) {
            method1058(-114);
        }
        while (true) {
            int var3 = arg0.method1849(255);
            if (var3 == 0) {
                field2490++;
                return;
            }
            this.method1056(var3, arg0, (byte) 46);
        }
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V")
    public static void method1058(int arg0) {
        field2502 = null;
        int var1 = 48 % ((arg0 + 19) / 63);
        field2488 = null;
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
            field2488[var0] = var1;
        }
        field2504 = 0;
    }
}
