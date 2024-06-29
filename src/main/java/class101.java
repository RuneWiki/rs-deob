import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class101 extends class42 {

    @OriginalMember(owner = "client!qe", name = "db", descriptor = "Z")
    public boolean field2442 = true;

    @OriginalMember(owner = "client!qe", name = "lb", descriptor = "I")
    public int field2450 = -1;

    @OriginalMember(owner = "client!qe", name = "nb", descriptor = "I")
    public int field2452 = 0;

    @OriginalMember(owner = "client!qe", name = "hb", descriptor = "I")
    public int field2446 = -1;

    @OriginalMember(owner = "client!qe", name = "kb", descriptor = "[I")
    public static int[] field2449 = new int[32];

    @OriginalMember(owner = "client!qe", name = "Ab", descriptor = "Lad;")
    public static class5 field2465;

    @OriginalMember(owner = "client!qe", name = "Cb", descriptor = "Lad;")
    public static class5 field2467;

    @OriginalMember(owner = "client!qe", name = "Db", descriptor = "Lad;")
    public static class5 field2468;

    @OriginalMember(owner = "client!qe", name = "zb", descriptor = "Lad;")
    public static class5 field2464;

    @OriginalMember(owner = "client!qe", name = "yb", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!qe", name = "xb", descriptor = "Lad;")
    private static class5 field2462;

    @OriginalMember(owner = "client!qe", name = "ub", descriptor = "Lad;")
    public static class5 field2459;

    @OriginalMember(owner = "client!qe", name = "vb", descriptor = "Ldd;")
    public static class23 field2460;

    @OriginalMember(owner = "client!qe", name = "cb", descriptor = "I")
    public int field2441;

    @OriginalMember(owner = "client!qe", name = "eb", descriptor = "I")
    public int field2443;

    @OriginalMember(owner = "client!qe", name = "fb", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!qe", name = "gb", descriptor = "I")
    public int field2445;

    @OriginalMember(owner = "client!qe", name = "ib", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!qe", name = "jb", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!qe", name = "mb", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!qe", name = "ob", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!qe", name = "pb", descriptor = "I")
    public int field2454;

    @OriginalMember(owner = "client!qe", name = "qb", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!qe", name = "rb", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!qe", name = "sb", descriptor = "I")
    public int field2457;

    @OriginalMember(owner = "client!qe", name = "tb", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!qe", name = "Bb", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!qe", name = "Eb", descriptor = "I")
    public int field2469;

    @OriginalMember(owner = "client!qe", name = "wb", descriptor = "Lsb;")
    public static class110 field2461;

    @OriginalMember(owner = "client!qe", name = "Fb", descriptor = "Lsb;")
    public static class110 field2470;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qe", name = "Gb", descriptor = "Ljava/lang/Class;")
    public static Class field2471;

    // $FF: synthetic method
    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method816(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2449[var1] = var0 - 1;
            var0 += var0;
        }
        field2465 = class88.method674("Zu viele Verbindungen von Ihrer Adresse)3", 80);
        field2467 = class88.method674("weiss:", -80);
        field2468 = class88.method674("leuchten3:", -117);
        field2464 = class88.method674("Lade Ignorieren)2Liste)3)3)3", -127);
        field2463 = 10;
        field2462 = class88.method674("Enter name:", 103);
        field2459 = field2462;
        field2460 = new class23();
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lrc;I)Z", line = 14)
    public static final boolean method807(class105 arg0, int arg1) {
        field2447++;
        int var2 = arg0.field2558;
        if (var2 >= 1 && var2 <= 200 || !(var2 < 701 || var2 > 900)) {
            class23.field572++;
            class121.field2996++;
            if (var2 >= 801) {
                var2 -= 701;
            } else if (var2 >= 701) {
                var2 -= 601;
            } else if (var2 < 101) {
                var2--;
            } else {
                var2 -= 101;
            }
            class72.method580(class69.method546(true, new class5[] { class50.field1291, class21.field543[var2] }), 29, client.field499, -121, 0, 0, 0);
            class72.method580(class69.method546(true, new class5[] { class50.field1291, class21.field543[var2] }), 20, class38.field951, -117, 0, 0, 0);
            return true;
        } else if (var2 >= 401 && var2 <= 500) {
            class47.field1230++;
            class72.method580(class69.method546(true, new class5[] { class50.field1291, arg0.field2625 }), 61, client.field499, -121, 0, 0, 0);
            return true;
        } else if (arg1 == 16894) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(Z)V", line = 64)
    public final void method808(boolean arg0) {
        field2453++;
        if (this.field2446 != -1) {
            this.method812(this.field2446, (byte) -109);
            this.field2441 = this.field2443;
            this.field2469 = this.field2445;
            this.field2454 = this.field2457;
        }
        if (arg0) {
            method807(null, -61);
        }
        this.method812(this.field2452, (byte) -126);
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)Lje;", line = 104)
    public static final class59 method809(byte arg0) {
        field2444++;
        try {
            int var1 = -65 % ((44 - arg0) / 44);
            return (class59) Class.forName("tc").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class8();
        }
    }

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)V", line = 118)
    public static final void method810(int arg0) {
        field2451++;
        if (class98.field2375 == null) {
            return;
        }
        long var1 = class95.method728(128);
        if (var1 <= class106.field2682) {
            return;
        }
        class98.field2375.method803(var1);
        int var3 = (int) (var1 - class106.field2682);
        class106.field2682 = var1;
        int var4 = 25 % ((28 - arg0) / 48);
        synchronized (field2471 == null ? (field2471 = method816("qd")) : field2471) {
            class102.field2490 += class102.field2503 * var3;
            int var6 = (class102.field2490 - class102.field2503 * 2000) / 1000;
            if (var6 > 0) {
                if (class19.field522 != null) {
                    class19.field522.method201(var6);
                }
                class102.field2490 -= var6 * 1000;
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "(I)V", line = 155)
    public static void method811(int arg0) {
        field2462 = null;
        if (arg0 != 500) {
            method814(-6);
        }
        field2459 = null;
        field2460 = null;
        field2461 = null;
        field2449 = null;
        field2465 = null;
        field2468 = null;
        field2467 = null;
        field2464 = null;
        field2470 = null;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(IB)V", line = 200)
    private final void method812(int arg0, byte arg1) {
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        field2448++;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (arg1 > -106) {
            return;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        double var13 = 0.0D;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (-var9 + var11) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (-var11 + 2.0D - var9);
            }
        }
        this.field2445 = (int) (var17 * 256.0D);
        this.field2443 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        if (this.field2445 < 0) {
            this.field2445 = 0;
        } else if (this.field2445 > 255) {
            this.field2445 = 255;
        }
        this.field2457 = (int) (var19 * 256.0D);
        if (this.field2443 < 0) {
            this.field2443 = 0;
        } else if (this.field2443 > 255) {
            this.field2443 = 255;
            return;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lgb;III)V", line = 285)
    private final void method813(class39 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 256) {
            this.field2446 = 77;
        }
        if (arg3 == 1) {
            this.field2452 = arg0.method342(-4);
        } else if (arg3 == 2) {
            this.field2450 = arg0.method330(arg2 ^ 0xFFFF8670);
        } else if (arg3 == 5) {
            this.field2442 = false;
        } else if (arg3 == 7) {
            this.field2446 = arg0.method342(-4);
        }
        field2456++;
    }

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "(I)I", line = 322)
    public static final int method814(int arg0) {
        field2466++;
        int var1 = -99 % ((39 - arg0) / 45);
        return class110.field2755++;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILgb;I)V", line = 346)
    public final void method815(int arg0, class39 arg1, int arg2) {
        field2455++;
        while (true) {
            int var4 = arg1.method330(-30864);
            if (var4 == 0) {
                if (arg2 < 55) {
                    this.method815(-27, null, -36);
                    return;
                } else {
                    return;
                }
            }
            this.method813(arg1, arg0, 256, var4);
        }
    }
}
