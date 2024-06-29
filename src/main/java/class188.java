import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class188 extends class17 implements class620 {

    @OriginalMember(owner = "client!lw", name = "R", descriptor = "Z")
    private boolean field2413;

    @OriginalMember(owner = "client!lw", name = "M", descriptor = "B")
    private byte field2408;

    @OriginalMember(owner = "client!lw", name = "H", descriptor = "Z")
    private boolean field2403;

    @OriginalMember(owner = "client!lw", name = "Y", descriptor = "S")
    private short field2419;

    @OriginalMember(owner = "client!lw", name = "x", descriptor = "B")
    private byte field2393;

    @OriginalMember(owner = "client!lw", name = "C", descriptor = "Z")
    private boolean field2398;

    @OriginalMember(owner = "client!lw", name = "P", descriptor = "B")
    private byte field2411;

    @OriginalMember(owner = "client!lw", name = "N", descriptor = "Z")
    private boolean field2409;

    @OriginalMember(owner = "client!lw", name = "t", descriptor = "Lba;")
    public class107 field2389;

    @OriginalMember(owner = "client!lw", name = "u", descriptor = "Lw;")
    private class605 field2390;

    @OriginalMember(owner = "client!lw", name = "y", descriptor = "Lnj;")
    public static class415 field2394 = new class415(60, 2);

    @OriginalMember(owner = "client!lw", name = "X", descriptor = "[I")
    public static int[] field2418 = new int[32];

    @OriginalMember(owner = "client!lw", name = "W", descriptor = "[F")
    public static float[] field2417 = new float[16];

    @OriginalMember(owner = "client!lw", name = "r", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!lw", name = "s", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!lw", name = "v", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!lw", name = "w", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!lw", name = "z", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!lw", name = "A", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!lw", name = "B", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!lw", name = "D", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!lw", name = "E", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!lw", name = "F", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!lw", name = "G", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!lw", name = "I", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!lw", name = "J", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!lw", name = "K", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!lw", name = "L", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!lw", name = "O", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!lw", name = "S", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!lw", name = "T", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!lw", name = "U", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!lw", name = "Q", descriptor = "Lcd;")
    private class564 field2412;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)Z", line = 11)
    public final boolean method75(int arg0) {
        int var2 = -33 / ((arg0 - 26) / 38);
        ++field2399;
        return this.field2409;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IILoa;ILcq;ZI)V", line = 22)
    public final void method73(int arg0, int arg1, class43 arg2, int arg3, class274 arg4, boolean arg5, int arg6) {
        ++field2387;
        if (!(arg4 instanceof class188)) {
            if (arg4 instanceof class399) {
                class399 var8 = (class399) arg4;
                if (this.field2389 != null && var8.field5091 != null) {
                    this.field2389.method831(var8.field5091, arg3, arg1, arg0, arg5);
                }
            }
        } else {
            class188 var9 = (class188) arg4;
            if (this.field2389 != null && var9.field2389 != null) {
                this.field2389.method831(var9.field2389, arg3, arg1, arg0, arg5);
            }
        }
        if (arg6 >= -2) {
            field2416 = 103;
        }
    }

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "(I)Z", line = 56)
    public final boolean method78(int arg0) {
        if (arg0 != 0) {
            field2416 = -3;
        }
        ++field2410;
        return this.field2398;
    }

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "(B)I", line = 67)
    public final int method66(byte arg0) {
        ++field2388;
        return arg0 != -42 ? -70 : this.field2408;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(ZILoa;I)Lid;", line = 78)
    private final class390 method1242(boolean arg0, int arg1, class43 arg2, int arg3) {
        ++field2415;
        class698 var5 = class348.field4436.method1900(83, this.field2419 & arg1);
        class88 var6;
        class88 var7;
        if (this.field2413) {
            var6 = class477.field6327[this.field2411];
            var7 = class353.field4540[0];
        } else {
            var6 = class353.field4540[this.field2411];
            if (this.field2411 >= 3) {
                var7 = null;
            } else {
                var7 = class353.field4540[this.field2411 - -1];
            }
        }
        return var5.method3811(arg0, var6, super.field191, super.field192, this.field2408, this.field2393, arg2, arg3, var7, -39, super.field195);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Loa;B)Lpl;", line = 105)
    public final class215 method71(class43 arg0, byte arg1) {
        int var3 = -70 / ((arg1 - 12) / 41);
        ++field2400;
        if (this.field2389 == null) {
            return null;
        } else {
            class151 var4 = arg0.method402();
            var4.method146(super.field195, super.field192, super.field191);
            class215 var5 = null;
            if (this.field2403) {
                var5 = class207.method1331(true, 1);
            }
            this.field2389.method827(var4, var5 != null ? var5.field2770[0] : null, 0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "(I)V", line = 131)
    public static void method1243(int arg0) {
        field2394 = null;
        field2417 = null;
        if (arg0 == 0) {
            field2418 = null;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Z)I", line = 145)
    public final int method70(boolean arg0) {
        if (!arg0) {
            return 119;
        } else {
            ++field2407;
            return this.field2393;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IILoa;I)Z", line = 158)
    public final boolean method74(int arg0, int arg1, class43 arg2, int arg3) {
        ++field2396;
        class107 var5 = this.method1244(arg2, true, 131072);
        if (arg3 > -98) {
            this.field2398 = true;
        }
        if (var5 != null) {
            class151 var6 = arg2.method402();
            var6.method146(super.field195, super.field192, super.field191);
            return var5.method832(arg1, arg0, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Loa;I)V", line = 179)
    public final void method62(class43 arg0, int arg1) {
        ++field2405;
        Object var3 = null;
        if (arg1 != 6526) {
            field2406 = 115;
        }
        class605 var5;
        if (this.field2390 == null && this.field2409) {
            class390 var4 = this.method1242(true, 65535, arg0, 262144);
            var5 = var4 != null ? var4.field4995 : null;
        } else {
            var5 = this.field2390;
            this.field2390 = null;
        }
        if (var5 != null) {
            class183.method1230(var5, this.field2411, super.field195, super.field191, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "(Loa;I)V", line = 209)
    public final void method67(class43 arg0, int arg1) {
        ++field2397;
        if (arg1 != 2) {
            field2406 = -105;
        }
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(Loa;I)V", line = 220)
    public final void method65(class43 arg0, int arg1) {
        if (arg1 >= -121) {
            this.field2412 = null;
        }
        ++field2395;
        Object var3 = null;
        class605 var5;
        if (this.field2390 == null && this.field2409) {
            class390 var4 = this.method1242(true, 65535, arg0, 262144);
            var5 = var4 == null ? null : var4.field4995;
        } else {
            var5 = this.field2390;
            this.field2390 = null;
        }
        if (var5 != null) {
            class567.method3035(var5, this.field2411, super.field195, super.field191, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Loa;II)Lba;", line = 248)
    public final class107 method63(class43 arg0, int arg1, int arg2) {
        ++field2401;
        return arg2 != 25871 ? null : this.method1244(arg0, true, arg1);
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(B)I", line = 259)
    public final int method76(byte arg0) {
        ++field2391;
        return arg0 > -92 ? -73 : 65535 & this.field2419;
    }

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "(B)V", line = 272)
    public final void method77(byte arg0) {
        this.field2398 = false;
        ++field2414;
        if (this.field2389 != null) {
            this.field2389.method825(-65537 & this.field2389.method796());
        }
        if (arg0 != 7) {
            this.method67((class43) null, 117);
        }
    }

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "(Loa;I)Lcd;", line = 292)
    public final class564 method72(class43 arg0, int arg1) {
        if (this.field2412 == null) {
            this.field2412 = class240.method1519(super.field192, this.method1244(arg0, true, 0), super.field195, 1, super.field191);
        }
        if (arg1 != 21098) {
            this.method73(-14, 87, (class43) null, -88, (class274) null, false, -27);
        }
        ++field2404;
        return this.field2412;
    }

    @OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Loa;Lsa;IIIIZIIZ)V", line = 309)
    public class188(class43 arg0, class698 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class385.method2191(arg8, arg7, 16711716));
        this.field2413 = arg6;
        this.field2408 = (byte) arg7;
        this.field2403 = ~arg1.field9660 != -1 && !arg6;
        super.field191 = arg5;
        this.field2419 = (short) arg1.field9625;
        this.field2393 = (byte) arg8;
        this.field2398 = arg9;
        this.field2411 = (byte) arg2;
        super.field195 = arg3;
        this.field2409 = arg0.method389() && arg1.field9591 && !this.field2413 && ~class260.field3509.method733(class364.field4697, (byte) -99) != -1;
        int var11 = 2048;
        if (this.field2398) {
            var11 |= 65536;
        }
        class390 var12 = this.method1242(this.field2409, 65535, arg0, var11);
        if (var12 != null) {
            this.field2389 = var12.field4994;
            this.field2390 = var12.field4995;
            if (this.field2398) {
                this.field2389 = this.field2389.method479((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Loa;ZI)Lba;", line = 344)
    private final class107 method1244(class43 arg0, boolean arg1, int arg2) {
        ++field2392;
        if (!arg1) {
            field2394 = null;
        }
        if (this.field2389 != null && arg0.method377(this.field2389.method796(), arg2) == 0) {
            return this.field2389;
        } else {
            class390 var4 = this.method1242(false, 65535, arg0, arg2);
            return var4 != null ? var4.field4994 : null;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)V", line = 369)
    public final void method64(byte arg0) {
        if (this.field2389 != null) {
            this.field2389.method818();
        }
        int var2 = 112 / ((arg0 - -71) / 39);
        ++field2402;
    }
}
