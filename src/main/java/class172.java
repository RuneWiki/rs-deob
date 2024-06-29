import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class172 {

    @OriginalMember(owner = "client!an", name = "b", descriptor = "I")
    public int field2439 = -1;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public int field2440 = -1;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public int field2441 = 8;

    @OriginalMember(owner = "client!an", name = "i", descriptor = "Z")
    public boolean field2446 = true;

    @OriginalMember(owner = "client!an", name = "h", descriptor = "I")
    public int field2445 = 16;

    @OriginalMember(owner = "client!an", name = "n", descriptor = "I")
    public int field2451 = 1190717;

    @OriginalMember(owner = "client!an", name = "k", descriptor = "I")
    public int field2448 = -1;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "I")
    public int field2438 = 128;

    @OriginalMember(owner = "client!an", name = "j", descriptor = "Z")
    public boolean field2447 = true;

    @OriginalMember(owner = "client!an", name = "r", descriptor = "I")
    public int field2455 = 127;

    @OriginalMember(owner = "client!an", name = "q", descriptor = "I")
    public int field2454 = 0;

    @OriginalMember(owner = "client!an", name = "t", descriptor = "Z")
    public boolean field2457 = false;

    @OriginalMember(owner = "client!an", name = "m", descriptor = "[I")
    public static int[] field2450 = new int[16384];

    @OriginalMember(owner = "client!an", name = "s", descriptor = "[I")
    public static int[] field2456 = new int[16384];

    @OriginalMember(owner = "client!an", name = "u", descriptor = "Z")
    public static boolean field2458;

    @OriginalMember(owner = "client!an", name = "v", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!an", name = "x", descriptor = "S")
    public static short field2461;

    @OriginalMember(owner = "client!an", name = "w", descriptor = "Lo;")
    public static class332 field2460;

    @OriginalMember(owner = "client!an", name = "e", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!an", name = "f", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!an", name = "l", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!an", name = "o", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!an", name = "p", descriptor = "I")
    public int field2453;

    @OriginalMember(owner = "client!an", name = "g", descriptor = "Lmo;")
    public class251 field2444;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field2450[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field2456[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
        field2458 = false;
        field2459 = 0;
        field2461 = 1;
        field2460 = new class332("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ZLre;I)V", line = 4)
    private final void method1186(boolean arg0, class446 arg1, int arg2) {
        if (arg2 == 1) {
            this.field2454 = class403.method2414(29146, arg1.method2613(-25778));
        } else if (arg2 == 2) {
            this.field2440 = arg1.method2628(49152);
        } else if (arg2 == 3) {
            this.field2440 = arg1.method2631(2530);
            if (this.field2440 == 65535) {
                this.field2440 = -1;
            }
        } else if (arg2 == 5) {
            this.field2446 = false;
        } else if (arg2 == 7) {
            this.field2448 = class403.method2414(29146, arg1.method2613(-25778));
        } else if (arg2 == 8) {
            this.field2444.field3619 = this.field2453;
        } else if (arg2 == 9) {
            this.field2438 = arg1.method2631(2530);
        } else if (arg2 == 10) {
            this.field2447 = false;
        } else if (arg2 == 11) {
            this.field2441 = arg1.method2628(49152);
        } else if (arg2 == 12) {
            this.field2457 = true;
        } else if (arg2 == 13) {
            this.field2451 = arg1.method2613(-25778);
        } else if (arg2 == 14) {
            this.field2445 = arg1.method2628(49152);
        } else if (arg2 == 15) {
            this.field2439 = arg1.method2631(2530);
            if (this.field2439 == 65535) {
                this.field2439 = -1;
            }
        } else if (arg2 == 16) {
            this.field2455 = arg1.method2628(49152);
        }
        if (arg0) {
            this.method1190((class446) null, (byte) 36);
        }
        field2449++;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V", line = 88)
    public static final void method1187(int arg0) {
        if (arg0 == 0) {
            class230.field3388.method2299((byte) -113);
            field2452++;
        }
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(I)V", line = 103)
    public final void method1188(int arg0) {
        if (this.field2439 == -1) {
            this.field2439 = this.field2440;
        }
        field2443++;
        int var2 = 122 / ((15 - arg0) / 52);
        this.field2441 = this.field2453 | this.field2441 << 8;
    }

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(I)V", line = 124)
    public static void method1189(int arg0) {
        if (arg0 != 0) {
            method1187(-81);
        }
        field2456 = null;
        field2450 = null;
        field2460 = null;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lre;B)V", line = 140)
    public final void method1190(class446 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2628(49152);
            if (var3 == 0) {
                field2442++;
                if (arg1 <= 80) {
                    this.method1190((class446) null, (byte) -75);
                    return;
                }
                return;
            }
            this.method1186(false, arg0, var3);
        }
    }
}
