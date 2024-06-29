import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class111 extends class85 {

    @OriginalMember(owner = "client!mc", name = "Z", descriptor = "Z")
    private boolean field2493 = false;

    @OriginalMember(owner = "client!mc", name = "ab", descriptor = "I")
    private int field2494 = -1;

    @OriginalMember(owner = "client!mc", name = "ob", descriptor = "Z")
    private volatile boolean field2508 = false;

    @OriginalMember(owner = "client!mc", name = "vb", descriptor = "Lhf;")
    private class71 field2515;

    @OriginalMember(owner = "client!mc", name = "nb", descriptor = "Lhf;")
    private class71 field2507;

    @OriginalMember(owner = "client!mc", name = "xb", descriptor = "I")
    private int field2517;

    @OriginalMember(owner = "client!mc", name = "X", descriptor = "Lgg;")
    public static class63 field2491 = class116.method911(43, "(Udns");

    @OriginalMember(owner = "client!mc", name = "lb", descriptor = "Lgg;")
    public static class63 field2505 = class116.method911(43, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!mc", name = "pb", descriptor = "Lgg;")
    public static class63 field2509 = class116.method911(43, "null");

    @OriginalMember(owner = "client!mc", name = "Y", descriptor = "I")
    private int field2492;

    @OriginalMember(owner = "client!mc", name = "bb", descriptor = "I")
    private int field2495;

    @OriginalMember(owner = "client!mc", name = "cb", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!mc", name = "db", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!mc", name = "eb", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!mc", name = "fb", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!mc", name = "gb", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!mc", name = "hb", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!mc", name = "kb", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!mc", name = "qb", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!mc", name = "rb", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!mc", name = "tb", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!mc", name = "ub", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!mc", name = "wb", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!mc", name = "jb", descriptor = "Lmc;")
    public static class111 field2503;

    @OriginalMember(owner = "client!mc", name = "ib", descriptor = "[Lrc;")
    public static class156[] field2502;

    @OriginalMember(owner = "client!mc", name = "mb", descriptor = "[Lwb;")
    public static class200[] field2506;

    @OriginalMember(owner = "client!mc", name = "sb", descriptor = "[Z")
    private volatile boolean[] field2512;

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lhf;Lhf;IZZZ)V")
    public class111(class71 arg0, class71 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2515 = arg1;
        this.field2493 = arg5;
        this.field2507 = arg0;
        this.field2517 = arg2;
        class202.method1333(16776960, this, this.field2517);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([BIZZZ)V")
    public final void method885(byte[] arg0, int arg1, boolean arg2, boolean arg3, boolean arg4) {
        if (!arg2) {
            this.method753((byte) 100, -7);
        }
        ++field2500;
        if (arg4) {
            if (this.field2508) {
                throw new RuntimeException();
            } else {
                if (this.field2515 != null) {
                    class153.method1068(arg0, this.field2517, false, this.field2515);
                }
                this.method764(1, arg0);
                this.method892(50);
            }
        } else {
            arg0[arg0.length + -2] = (byte) (super.field2049[arg1] >> 8);
            arg0[arg0.length + -1] = (byte) super.field2049[arg1];
            if (this.field2507 != null) {
                class153.method1068(arg0, arg1, false, this.field2507);
                this.field2512[arg1] = true;
            }
            if (arg3) {
                super.field2019[arg1] = class69.method631(arg0, false, (byte) 67);
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)V")
    public final void method753(byte arg0, int arg1) {
        if (arg0 != 2) {
            field2491 = null;
        }
        ++field2498;
        if (this.field2507 != null && this.field2512 != null && this.field2512[arg1]) {
            class27.method262(this.field2507, arg1, this, 121);
        } else {
            class6.method96(true, arg1, this, arg0 + -641280146, (byte) 2, super.field2055[arg1], this.field2517);
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(Z)I")
    public final int method886(boolean arg0) {
        ++field2499;
        if (this.field2508) {
            return 100;
        } else if (super.field2019 != null) {
            return 99;
        } else {
            int var2 = class147.method1028(-1, this.field2517, 255);
            if (arg0) {
                field2509 = null;
            }
            if (var2 >= 100) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(Z)V")
    public static final void method887(boolean arg0) {
        ++field2513;
        int var1 = class39.field926;
        int var2 = class151.field3177;
        int var3 = class109.field2451;
        int var4 = 6116423;
        int var5 = class175.field3606;
        class178.method1191(var1, var2, var3, var5, var4);
        class178.method1191(var1 + 1, var2 - -1, var3 + -2, 16, 0);
        class178.method1186(var1 + 1, var2 - -18, var3 + -2, var5 + -19, 0);
        class29.field675.method644(class134.field2912, var1 - -3, var2 - -14, var4, -1);
        if (arg0) {
            int var6 = class100.field2365;
            int var7 = class188.field3794;
            for (int var8 = 0; class166.field3404 > var8; ++var8) {
                int var9 = 16777215;
                int var10 = (-var8 + -1 + class166.field3404) * 15 + var2 + 31;
                if (~var6 < ~var1 && var1 + var3 > var6 && ~(var10 + -13) > ~var7 && var7 < var10 + 3) {
                    var9 = 16776960;
                }
                class29.field675.method644(class151.method1059(var8, -686459346), var1 + 3, var10, var9, 0);
            }
            class45.method453(class109.field2451, class39.field926, class151.field3177, class175.field3606, (byte) 61);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)I")
    public final int method888(byte arg0) {
        ++field2497;
        int var2 = 0;
        int var3 = 0;
        if (arg0 != 116) {
            this.method886(false);
        }
        for (int var4 = 0; super.field2019.length > var4; ++var4) {
            if (~super.field2021[var4] < -1) {
                var3 += this.method893(var4, (byte) 77);
                var2 += 100;
            }
        }
        if (~var2 == -1) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)V")
    public final void method755(int arg0, int arg1) {
        class167.method1127((byte) -126, arg1, this.field2517);
        ++field2514;
        if (arg0 != 0) {
            this.method893(89, (byte) -123);
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(BII)V")
    public final void method889(byte arg0, int arg1, int arg2) {
        if (arg0 < 104) {
            this.field2494 = 118;
        }
        this.field2495 = arg1;
        ++field2516;
        this.field2492 = arg2;
        if (this.field2515 != null) {
            class27.method262(this.field2515, this.field2517, this, 88);
        } else {
            class6.method96(true, this.field2517, this, -641280144, (byte) 0, this.field2492, 255);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BZLhf;[BI)V")
    public final void method890(byte arg0, boolean arg1, class71 arg2, byte[] arg3, int arg4) {
        ++field2496;
        if (this.field2515 != arg2) {
            if (!arg1 && ~this.field2494 == ~arg4) {
                this.field2508 = true;
            }
            if (arg3 == null || ~arg3.length >= -3) {
                this.field2512[arg4] = false;
                if (this.field2493 || arg1) {
                    class6.method96(arg1, arg4, this, -641280144, (byte) 2, super.field2055[arg4], this.field2517);
                }
                return;
            }
            class108.field2429.reset();
            class108.field2429.update(arg3, 0, arg3.length + -2);
            int var6 = (int) class108.field2429.getValue();
            int var7 = (65280 & arg3[arg3.length + -2] << 8) + (arg3[arg3.length + -1] & 255);
            if (super.field2055[arg4] != var6 || super.field2049[arg4] != var7) {
                this.field2512[arg4] = false;
                if (this.field2493 || arg1) {
                    class6.method96(arg1, arg4, this, -641280144, (byte) 2, super.field2055[arg4], this.field2517);
                }
                return;
            }
            this.field2512[arg4] = true;
            if (arg1) {
                super.field2019[arg4] = class69.method631(arg3, false, (byte) 60);
            }
        } else {
            if (this.field2508) {
                throw new RuntimeException();
            }
            if (arg3 == null) {
                class6.method96(true, this.field2517, this, -641280144, (byte) 0, this.field2492, 255);
                return;
            }
            class108.field2429.reset();
            class108.field2429.update(arg3, 0, arg3.length);
            int var8 = (int) class108.field2429.getValue();
            class3 var9 = new class3(class65.method616(arg3, -5831));
            int var10 = var9.method64(31790);
            if (~var10 != -6 && var10 != 6) {
                throw new RuntimeException("Incorrect JS5 protocol number: " + var10);
            }
            int var11 = 0;
            if (~var10 <= -7) {
                var11 = var9.method56(-1);
            }
            if (~this.field2492 != ~var8 || ~this.field2495 != ~var11) {
                class6.method96(true, this.field2517, this, -641280144, (byte) 0, this.field2492, 255);
                return;
            }
            this.method764(1, arg3);
            this.method892(101);
        }
        if (arg0 > -61) {
            this.field2517 = -26;
        }
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(Z)V")
    public static void method891(boolean arg0) {
        field2502 = null;
        field2506 = null;
        field2503 = null;
        field2505 = null;
        field2491 = null;
        field2509 = null;
        if (!arg0) {
            field2503 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V")
    private final void method892(int arg0) {
        if (arg0 <= 24) {
            field2503 = null;
        }
        this.field2512 = new boolean[super.field2019.length];
        ++field2504;
        for (int var2 = 0; ~this.field2512.length < ~var2; ++var2) {
            this.field2512[var2] = false;
        }
        if (this.field2507 == null) {
            this.field2508 = true;
        } else {
            this.field2494 = -1;
            for (int var3 = 0; var3 < this.field2512.length; ++var3) {
                if (~super.field2021[var3] < -1) {
                    class90.method774(var3, this.field2507, this, true);
                    this.field2494 = var3;
                }
            }
            if (this.field2494 == -1) {
                this.field2508 = true;
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)I")
    private final int method893(int arg0, byte arg1) {
        ++field2511;
        int var3 = 108 % ((arg1 - 6) / 40);
        if (super.field2019[arg0] != null) {
            return 100;
        } else {
            return this.field2512[arg0] ? 100 : class147.method1028(-1, arg0, this.field2517);
        }
    }
}
