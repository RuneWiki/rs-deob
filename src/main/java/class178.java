import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class178 {

    @OriginalMember(owner = "client!kv", name = "j", descriptor = "I")
    public int field2294 = 0;

    @OriginalMember(owner = "client!kv", name = "m", descriptor = "I")
    public int field2297 = 0;

    @OriginalMember(owner = "client!kv", name = "k", descriptor = "Z")
    private boolean field2295 = false;

    @OriginalMember(owner = "client!kv", name = "w", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!kv", name = "x", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "I")
    public int field2286;

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "I")
    private int field2289;

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "I")
    public int field2290;

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!kv", name = "i", descriptor = "I")
    public int field2293;

    @OriginalMember(owner = "client!kv", name = "l", descriptor = "I")
    public int field2296;

    @OriginalMember(owner = "client!kv", name = "n", descriptor = "I")
    public int field2298;

    @OriginalMember(owner = "client!kv", name = "o", descriptor = "I")
    public int field2299;

    @OriginalMember(owner = "client!kv", name = "p", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!kv", name = "q", descriptor = "I")
    public int field2301;

    @OriginalMember(owner = "client!kv", name = "r", descriptor = "I")
    public int field2302;

    @OriginalMember(owner = "client!kv", name = "s", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!kv", name = "t", descriptor = "I")
    public int field2304;

    @OriginalMember(owner = "client!kv", name = "u", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!kv", name = "h", descriptor = "J")
    public long field2292;

    @OriginalMember(owner = "client!kv", name = "v", descriptor = "[Lu;")
    public static class54[] field2306;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1032(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2285++;
        if (arg3 > -2 || arg2 < 1 || arg8 < 1 || (class308.field4128 - 2) < arg2 || arg8 > class426.field6200 - 2) {
            return;
        }
        int var9 = arg7;
        if (arg7 < 3 && class381.method2330(false, arg8, arg2)) {
            var9 = arg7 + 1;
        }
        if (!class319.field4256.method1738(0, class20.field183) && !class90.method497(arg2, arg8, 0, var9, class253.field3369)) {
            return;
        }
        if (class186.field2421 == null) {
            return;
        }
        class442.field6426.method2877(class96.field1223[arg7], arg7, arg2, arg4, class343.field4596, -3567, arg8);
        if (arg1 < 0) {
            return;
        }
        boolean var10 = class319.field4256.field4687;
        class319.field4256.field4687 = true;
        class442.field6426.method2884(arg8, class96.field1223[arg7], var9, arg0, (byte) 97, arg6, arg7, arg5, arg2, class343.field4596, arg1);
        class319.field4256.field4687 = var10;
        return;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(B)V")
    public final void method1033(byte arg0) {
        this.field2299 = class456.field6811[this.field2289 << 3];
        field2291++;
        this.field2293 = (int) Math.sqrt((double) (this.field2304 * this.field2304 + this.field2290 * this.field2290 + (this.field2286 * this.field2286)));
        if (this.field2301 == 0) {
            this.field2301 = 1;
        }
        if (this.field2302 == 0) {
            this.field2292 = 2147483647L;
        } else if (this.field2302 == 1) {
            this.field2292 = (this.field2293 * 8 / this.field2301);
            this.field2292 *= this.field2292;
        } else if (this.field2302 == 2) {
            this.field2292 = (this.field2293 * 8 / this.field2301);
        }
        if (arg0 >= -94) {
            this.field2292 = -34L;
        }
        if (this.field2295) {
            this.field2293 *= -1;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lug;B)V")
    public final void method1034(class396 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2388((byte) -122);
            if (var3 == 0) {
                if (arg1 != -5) {
                    this.method1036(-16, (byte) -109, null);
                }
                field2287++;
                return;
            }
            this.method1036(var3, (byte) 73, arg0);
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Z)V")
    public static void method1035(boolean arg0) {
        if (!arg0) {
            field2307 = -54;
        }
        field2306 = null;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IBLug;)V")
    private final void method1036(int arg0, byte arg1, class396 arg2) {
        field2300++;
        if (arg1 != 73) {
            this.field2298 = 91;
        }
        if (arg0 == 1) {
            this.field2289 = arg2.method2386(arg1 - 23721);
        } else if (arg0 == 2) {
            arg2.method2388((byte) -122);
        } else if (arg0 == 3) {
            this.field2304 = arg2.method2406((byte) -74);
            this.field2290 = arg2.method2406((byte) -96);
            this.field2286 = arg2.method2406((byte) -70);
        } else if (arg0 == 4) {
            this.field2302 = arg2.method2388((byte) -119);
            this.field2301 = arg2.method2406((byte) -123);
        } else if (arg0 == 6) {
            this.field2298 = arg2.method2388((byte) -120);
        } else if (arg0 == 8) {
            this.field2294 = 1;
        } else if (arg0 == 9) {
            this.field2297 = 1;
        } else if (arg0 == 10) {
            this.field2295 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IJLza;)V")
    public static final void method1037(int arg0, long arg1, class287 arg2) {
        class290.field3825 = class186.field2423;
        class423.field6155 = 0;
        field2288++;
        class186.field2423 = arg0;
        long var4 = class45.method252((byte) -8);
        for (class46 var6 = (class46) class508.field7360.method290(-1); var6 != null; var6 = (class46) class508.field7360.method284(10748)) {
            if (var6.method255(arg2, arg1)) {
                class423.field6155++;
            }
        }
        if (class259.field3463 && arg1 % 100L == 0L) {
            System.out.println("Particle system count: " + class508.field7360.method289(true) + ", running: " + class423.field6155 + ". Particles: " + class186.field2423 + ". Time taken: " + (class45.method252((byte) -8) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(II)Z")
    public static final boolean method1038(int arg0, int arg1) {
        if (arg1 == -28083) {
            field2303++;
            return arg0 != 1 && arg0 != 7;
        } else {
            return true;
        }
    }

    static {
        new class305("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
        field2307 = -1;
        field2308 = -1;
    }
}
