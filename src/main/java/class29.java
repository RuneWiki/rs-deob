import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class29 extends class2 {

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "I")
    private int field468 = 0;

    @OriginalMember(owner = "client!nl", name = "O", descriptor = "Ldh;")
    private class159 field485 = new class159(16);

    @OriginalMember(owner = "client!nl", name = "R", descriptor = "I")
    private int field488 = 0;

    @OriginalMember(owner = "client!nl", name = "S", descriptor = "Lke;")
    private class106 field489 = new class106();

    @OriginalMember(owner = "client!nl", name = "cb", descriptor = "J")
    private long field499 = 0L;

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
    private int field458;

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "Lih;")
    private class30 field460;

    @OriginalMember(owner = "client!nl", name = "T", descriptor = "Z")
    private boolean field490;

    @OriginalMember(owner = "client!nl", name = "V", descriptor = "Lke;")
    private class106 field492;

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "Lrl;")
    private class185 field457;

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "Lih;")
    private class30 field466;

    @OriginalMember(owner = "client!nl", name = "X", descriptor = "Z")
    private boolean field494;

    @OriginalMember(owner = "client!nl", name = "P", descriptor = "I")
    private int field486;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "Ljm;")
    private class226 field455;

    @OriginalMember(owner = "client!nl", name = "C", descriptor = "I")
    private int field473;

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "Lde;")
    private class58 field470;

    @OriginalMember(owner = "client!nl", name = "s", descriptor = "I")
    public static int field463 = -1;

    @OriginalMember(owner = "client!nl", name = "E", descriptor = "Lmf;")
    public static class43 field475 = new class43(64);

    @OriginalMember(owner = "client!nl", name = "L", descriptor = "I")
    public static int field482 = 0;

    @OriginalMember(owner = "client!nl", name = "N", descriptor = "Lcd;")
    public static class64 field484 = class44.method335((byte) 71, "::errortest");

    @OriginalMember(owner = "client!nl", name = "W", descriptor = "[Lcd;")
    public static class64[] field493 = new class64[200];

    @OriginalMember(owner = "client!nl", name = "J", descriptor = "Z")
    public static boolean field480 = false;

    @OriginalMember(owner = "client!nl", name = "G", descriptor = "Lkf;")
    public static class213 field477 = new class213();

    @OriginalMember(owner = "client!nl", name = "Y", descriptor = "[I")
    public static int[] field495 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!nl", name = "bb", descriptor = "Lcd;")
    public static class64 field498 = class44.method335((byte) 71, "<col=00ffff>");

    @OriginalMember(owner = "client!nl", name = "ab", descriptor = "Lcd;")
    public static class64 field497 = class44.method335((byte) 71, "Starte 3D)2Softwarebibliothek)3");

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!nl", name = "t", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!nl", name = "u", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!nl", name = "y", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!nl", name = "A", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!nl", name = "D", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!nl", name = "F", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!nl", name = "H", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!nl", name = "I", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!nl", name = "K", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!nl", name = "M", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!nl", name = "Q", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "Lwi;")
    private class251 field472;

    @OriginalMember(owner = "client!nl", name = "U", descriptor = "Z")
    private boolean field491;

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "[B")
    private byte[] field467;

    @OriginalMember(owner = "client!nl", name = "Z", descriptor = "[Lqd;")
    public static class40[] field496;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)I", line = 6)
    public final int method247(int arg0) {
        if (arg0 == 255) {
            field487++;
            return this.field468;
        } else {
            return 47;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V", line = 20)
    public final void method248(byte arg0) {
        field465++;
        if (this.field492 != null) {
            if (this.method9(false) == null) {
                return;
            }
            if (this.field490) {
                boolean var2 = true;
                for (class25 var3 = this.field492.method778(0); var3 != null; var3 = this.field492.method775(26517)) {
                    int var4 = (int) var3.field417;
                    if (this.field467[var4] == 0) {
                        this.method257((byte) 85, 1, var4);
                    }
                    if (this.field467[var4] == 0) {
                        var2 = false;
                    } else {
                        var3.method232(128);
                    }
                }
                while (this.field472.field4374.length > this.field488) {
                    if (this.field472.field4374[this.field488] == 0) {
                        this.field488++;
                    } else {
                        if (this.field455.field3854 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field467[this.field488] == 0) {
                            this.method257((byte) 85, 1, this.field488);
                        }
                        if (this.field467[this.field488] == 0) {
                            var2 = false;
                            class25 var5 = new class25();
                            var5.field417 = (long) this.field488;
                            this.field492.method781(var5, 10751);
                        }
                        this.field488++;
                    }
                }
                if (var2) {
                    this.field488 = 0;
                    this.field490 = false;
                }
            } else if (this.field491) {
                boolean var6 = true;
                for (class25 var7 = this.field492.method778(0); var7 != null; var7 = this.field492.method775(26517)) {
                    int var8 = (int) var7.field417;
                    if (this.field467[var8] != 1) {
                        this.method257((byte) 85, 2, var8);
                    }
                    if (this.field467[var8] == 1) {
                        var7.method232(128);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field472.field4374.length > this.field488) {
                    if (this.field472.field4374[this.field488] == 0) {
                        this.field488++;
                    } else {
                        if (this.field457.method1298(113)) {
                            var6 = false;
                            break;
                        }
                        if (this.field467[this.field488] != 1) {
                            this.method257((byte) 85, 2, this.field488);
                        }
                        if (this.field467[this.field488] != 1) {
                            var6 = false;
                            class25 var9 = new class25();
                            var9.field417 = (long) this.field488;
                            this.field492.method781(var9, arg0 + 10751);
                        }
                        this.field488++;
                    }
                }
                if (var6) {
                    this.field491 = false;
                    this.field488 = 0;
                }
            } else {
                this.field492 = null;
            }
        }
        if (arg0 != 0) {
            field497 = (class64) null;
        }
        if (!this.field494 || class154.method1114(true) < this.field499) {
            return;
        }
        for (class58 var10 = (class58) this.field485.method1143(0); var10 != null; var10 = (class58) this.field485.method1147((byte) 18)) {
            if (!var10.field961) {
                if (var10.field963) {
                    if (!var10.field965) {
                        throw new RuntimeException();
                    }
                    var10.method232(arg0 + 128);
                } else {
                    var10.field963 = true;
                }
            }
        }
        this.field499 = class154.method1114(true) + 1000L;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BI)V", line = 198)
    public final void method10(byte arg0, int arg1) {
        field464++;
        if (this.field460 == null) {
            return;
        }
        if (arg0 != 4) {
            this.field485 = (class159) null;
        }
        for (class25 var3 = this.field489.method778(0); var3 != null; var3 = this.field489.method775(26517)) {
            if (((long) arg1) == var3.field417) {
                return;
            }
        }
        class25 var4 = new class25();
        var4.field417 = (long) arg1;
        this.field489.method781(var4, 10751);
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(B)V", line = 232)
    public static void method249(byte arg0) {
        field475 = null;
        field495 = null;
        field498 = null;
        field484 = null;
        if (arg0 != 72) {
            field463 = -89;
        }
        field477 = null;
        field496 = null;
        field493 = null;
        field497 = null;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(II)[B", line = 249)
    public final byte[] method6(int arg0, int arg1) {
        if (arg1 != -14184) {
            method249((byte) 48);
        }
        field483++;
        class58 var3 = this.method257((byte) 85, 0, arg0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method451(28985);
            var3.method232(arg1 ^ 0xFFFFC818);
            return var4;
        }
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(B)I", line = 272)
    public final int method250(byte arg0) {
        if (arg0 > -56) {
            return -90;
        }
        field459++;
        if (this.method9(false) == null) {
            return this.field470 == null ? 0 : this.field470.method442(false);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIII)V", line = 294)
    public static final void method251(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field481++;
        class31.method268(arg2 + arg4, 124, arg4 - arg2, class124.field2241[arg3], arg0);
        int var5 = 0;
        int var6 = -arg2;
        int var7 = arg2;
        int var8 = -1;
        while (var5 < var7) {
            var5++;
            var8 += 2;
            var6 += var8;
            if (var6 >= 0) {
                var7--;
                int[] var9 = class124.field2241[arg3 - var7];
                int[] var10 = class124.field2241[arg3 + var7];
                var6 -= var7 << 1;
                int var11 = arg4 + var5;
                int var12 = arg4 - var5;
                class31.method268(var11, 123, var12, var10, arg0);
                class31.method268(var11, 125, var12, var9, arg0);
            }
            int var13 = arg4 + var7;
            int[] var14 = class124.field2241[arg3 - var5];
            int[] var15 = class124.field2241[arg3 + var5];
            int var16 = arg4 - var7;
            class31.method268(var13, 124, var16, var15, arg0);
            class31.method268(var13, 127, var16, var14, arg0);
        }
        if (arg1 >= -36) {
            method249((byte) 65);
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(BI)Z", line = 347)
    public static final boolean method252(byte arg0, int arg1) {
        field456++;
        if (arg0 == -13) {
            return (arg1 >> 22 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)V", line = 366)
    public final void method253(int arg0) {
        field462++;
        if (this.field492 == null || this.method9(false) == null) {
            return;
        }
        for (class25 var2 = this.field489.method778(0); var2 != null; var2 = this.field489.method775(26517)) {
            int var3 = (int) var2.field417;
            if (var3 < 0 || var3 >= this.field472.field4373 || this.field472.field4374[var3] == 0) {
                var2.method232(128);
            } else {
                if (this.field467[var3] == 0) {
                    this.method257((byte) 85, 1, var3);
                }
                if (this.field467[var3] == -1) {
                    this.method257((byte) 85, 2, var3);
                }
                if (this.field467[var3] == 1) {
                    var2.method232(128);
                }
            }
        }
        if (arg0 != -579) {
            this.field457 = (class185) null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(I)I", line = 414)
    public final int method254(int arg0) {
        field476++;
        if (this.field472 == null) {
            return 0;
        } else if (this.field490) {
            class25 var2 = this.field492.method778(arg0 + arg0);
            return var2 == null ? 0 : (int) var2.field417;
        } else {
            return this.field472.field4371;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)Lwi;", line = 458)
    public final class251 method9(boolean arg0) {
        field474++;
        if (this.field472 != null) {
            return this.field472;
        }
        if (this.field470 == null) {
            if (this.field457.method1309(false)) {
                return null;
            }
            this.field470 = this.field457.method1305(true, 255, 2627, this.field458, (byte) 0);
        }
        if (this.field470.field961) {
            return null;
        }
        byte[] var2 = this.field470.method451(28985);
        if (this.field470 instanceof class134) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field472 = new class251(var2, this.field473);
                if (this.field472.field4375 != this.field486) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var5) {
                this.field472 = null;
                if (this.field457.method1309(false)) {
                    this.field470 = null;
                } else {
                    this.field470 = this.field457.method1305(true, 255, 2627, this.field458, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field472 = new class251(var2, this.field473);
            } catch (RuntimeException var6) {
                this.field457.method1299(1);
                this.field472 = null;
                if (this.field457.method1309(arg0)) {
                    this.field470 = null;
                } else {
                    this.field470 = this.field457.method1305(true, 255, 2627, this.field458, (byte) 0);
                }
                return null;
            }
            if (this.field466 != null) {
                this.field455.method1638(this.field458, this.field466, var2, (byte) -49);
            }
        }
        if (arg0) {
            field497 = (class64) null;
        }
        this.field470 = null;
        if (this.field460 != null) {
            this.field468 = 0;
            this.field467 = new byte[this.field472.field4373];
        }
        return this.field472;
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(B)I", line = 560)
    public final int method255(byte arg0) {
        if (arg0 >= -10) {
            return -62;
        } else {
            field471++;
            return this.field472 == null ? 0 : this.field472.field4371;
        }
    }

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "(B)V", line = 575)
    public final void method256(byte arg0) {
        if (arg0 != 1) {
            this.field473 = 121;
        }
        field479++;
        if (this.field460 != null) {
            this.field491 = true;
            if (this.field492 == null) {
                this.field492 = new class106();
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(ILih;Lih;Lrl;Ljm;IIZ)V", line = 888)
    public class29(int arg0, class30 arg1, class30 arg2, class185 arg3, class226 arg4, int arg5, int arg6, boolean arg7) {
        this.field458 = arg0;
        this.field460 = arg1;
        if (this.field460 == null) {
            this.field490 = false;
        } else {
            this.field490 = true;
            this.field492 = new class106();
        }
        this.field457 = arg3;
        this.field466 = arg2;
        this.field494 = arg7;
        this.field486 = arg6;
        this.field455 = arg4;
        this.field473 = arg5;
        if (this.field466 != null) {
            this.field470 = this.field455.method1639(-3, this.field466, this.field458);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BII)Lde;", line = 619)
    private final class58 method257(byte arg0, int arg1, int arg2) {
        if (arg0 != 85) {
            this.field489 = (class106) null;
        }
        class58 var4 = (class58) this.field485.method1151((long) arg2, 0);
        if (var4 != null && arg1 == 0 && !var4.field965 && var4.field961) {
            var4.method232(128);
            var4 = null;
        }
        field469++;
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field460 == null || this.field467[arg2] == -1) {
                    if (this.field457.method1309(false)) {
                        return null;
                    }
                    var4 = this.field457.method1305(true, this.field458, 2627, arg2, (byte) 2);
                } else {
                    var4 = this.field455.method1639(arg0 - 88, this.field460, arg2);
                }
            } else if (arg1 == 1) {
                if (this.field460 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field455.method1635(arg2, this.field460, arg0 ^ 0xFFFFFFC4);
            } else if (arg1 == 2) {
                if (this.field460 == null) {
                    throw new RuntimeException();
                }
                if (this.field467[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field457.method1298(-7)) {
                    return null;
                }
                var4 = this.field457.method1305(false, this.field458, 2627, arg2, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field485.method1149(var4, (long) arg2, arg0 - 129);
        }
        if (var4.field961) {
            return null;
        }
        byte[] var5 = var4.method451(28985);
        if (!var4 instanceof class134) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class15.field325.reset();
                class15.field325.update(var5, 0, var5.length - 2);
                int var10 = (int) class15.field325.getValue();
                if (this.field472.field4366[arg2] != var10) {
                    throw new RuntimeException();
                }
                this.field457.field3193 = 0;
                this.field457.field3196 = 0;
            } catch (RuntimeException var14) {
                this.field457.method1299(1);
                var4.method232(128);
                if (var4.field965 && !this.field457.method1309(false)) {
                    class163 var12 = this.field457.method1305(true, this.field458, 2627, arg2, (byte) 2);
                    this.field485.method1149(var12, (long) arg2, -94);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field472.field4364[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field472.field4364[arg2];
            if (this.field460 != null) {
                this.field455.method1638(arg2, this.field460, var5, (byte) -87);
                if (this.field467[arg2] != 1) {
                    this.field468++;
                    this.field467[arg2] = 1;
                }
            }
            if (!var4.field965) {
                var4.method232(128);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class15.field325.reset();
            class15.field325.update(var5, 0, var5.length - 2);
            int var6 = (int) class15.field325.getValue();
            if (this.field472.field4366[arg2] != var6) {
                throw new RuntimeException();
            }
            int var7 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field472.field4364[arg2] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field467[arg2] != 1) {
                if (this.field467[arg2] == 0) {
                }
                this.field468++;
                this.field467[arg2] = 1;
            }
            if (!var4.field965) {
                var4.method232(128);
            }
            return var4;
        } catch (Exception var13) {
            this.field467[arg2] = -1;
            var4.method232(arg0 ^ 0xD5);
            if (var4.field965 && !this.field457.method1309(false)) {
                class163 var9 = this.field457.method1305(true, this.field458, 2627, arg2, (byte) 2);
                this.field485.method1149(var9, (long) arg2, -117);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IB)I", line = 830)
    public final int method3(int arg0, byte arg1) {
        if (arg1 <= 126) {
            return 108;
        } else {
            class58 var3 = (class58) this.field485.method1151((long) arg0, 0);
            field478++;
            return var3 == null ? 0 : var3.method442(false);
        }
    }
}
