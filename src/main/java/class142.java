import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class142 extends class192 {

    @OriginalMember(owner = "client!nd", name = "tb", descriptor = "Z")
    private boolean field2577 = false;

    @OriginalMember(owner = "client!nd", name = "nb", descriptor = "I")
    private int field2571 = -1;

    @OriginalMember(owner = "client!nd", name = "yb", descriptor = "Z")
    private volatile boolean field2582 = false;

    @OriginalMember(owner = "client!nd", name = "ub", descriptor = "Lgd;")
    private class69 field2578;

    @OriginalMember(owner = "client!nd", name = "sb", descriptor = "I")
    private int field2576;

    @OriginalMember(owner = "client!nd", name = "Gb", descriptor = "Lgd;")
    private class69 field2590;

    @OriginalMember(owner = "client!nd", name = "ob", descriptor = "Loc;")
    private static class151 field2572 = class137.method873(2, "Your account has been disabled)3");

    @OriginalMember(owner = "client!nd", name = "ib", descriptor = "I")
    public static int field2566 = 0;

    @OriginalMember(owner = "client!nd", name = "jb", descriptor = "Loc;")
    public static class151 field2567 = field2572;

    @OriginalMember(owner = "client!nd", name = "Hb", descriptor = "Loc;")
    private static class151 field2591 = class137.method873(2, "Your ignore list is full)3 Max of 100 users)3");

    @OriginalMember(owner = "client!nd", name = "pb", descriptor = "Loc;")
    public static class151 field2573 = field2591;

    @OriginalMember(owner = "client!nd", name = "hb", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!nd", name = "kb", descriptor = "I")
    private int field2568;

    @OriginalMember(owner = "client!nd", name = "lb", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!nd", name = "mb", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!nd", name = "qb", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!nd", name = "rb", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!nd", name = "vb", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!nd", name = "wb", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!nd", name = "xb", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!nd", name = "Ab", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!nd", name = "Bb", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!nd", name = "Cb", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!nd", name = "Db", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!nd", name = "Fb", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!nd", name = "Ib", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!nd", name = "Jb", descriptor = "I")
    private int field2593;

    @OriginalMember(owner = "client!nd", name = "Eb", descriptor = "Leb;")
    public static class47 field2588;

    @OriginalMember(owner = "client!nd", name = "zb", descriptor = "[Z")
    private volatile boolean[] field2583;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V")
    public static final void method907(byte arg0) {
        ++field2585;
        if (class13.field300 && ~class40.field817 != ~class234.field4325) {
            class202.method1285(class228.field3975.field3978[0], arg0 + -163, class169.field3089, class228.field3975.field4031[0], class234.field4325, class233.field4297);
        } else {
            if (arg0 != 43) {
                field2567 = null;
            }
            if (~class58.field1165 != ~class234.field4325) {
                class58.field1165 = class234.field4325;
                class54.method367(class234.field4325, -112);
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lgd;Lgd;IZZZ)V")
    public class142(class69 arg0, class69 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2578 = arg0;
        this.field2577 = arg5;
        this.field2576 = arg2;
        this.field2590 = arg1;
        class138.method891(this, this.field2576, 8);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILoc;SJLoc;II)V")
    public static final void method908(int arg0, class151 arg1, short arg2, long arg3, class151 arg4, int arg5, int arg6) {
        ++field2580;
        if (!class225.field3917) {
            if (class117.field2108 < 500) {
                class182.field3305[class117.field2108] = arg4;
                class225.field3916[class117.field2108] = arg1;
                class185.field3316[class117.field2108] = arg2;
                class179.field3247[class117.field2108] = arg3;
                class117.field2109[class117.field2108] = arg0;
                class115.field2041[class117.field2108] = arg6;
                ++class117.field2108;
            }
            if (arg5 >= -23) {
                field2572 = null;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(II)I")
    public final int method909(int arg0, int arg1) {
        if (arg1 > -20) {
            method907((byte) 71);
        }
        ++field2581;
        if (!this.method1203((byte) 67, arg0)) {
            return 0;
        } else if (super.field3436[arg0] != null) {
            return 100;
        } else {
            return this.field2583[arg0] ? 100 : class102.method625(86, this.field2576, arg0);
        }
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(I)V")
    public static void method910(int arg0) {
        if (arg0 != 0) {
            method917(-72, 8, -39);
        }
        field2567 = null;
        field2572 = null;
        field2588 = null;
        field2573 = null;
        field2591 = null;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(IIB)V")
    public final void method911(int arg0, int arg1, byte arg2) {
        if (arg2 != 0) {
            this.field2568 = -93;
        }
        ++field2586;
        this.field2568 = arg1;
        this.field2593 = arg0;
        if (this.field2590 != null) {
            class162.method1048(this.field2590, this, this.field2576, (byte) 81);
        } else {
            class120.method730(this.field2593, 255, this, arg2 ^ -101, this.field2576, (byte) 0, true);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZ)V")
    public final void method912(int arg0, boolean arg1) {
        ++field2570;
        if (this.method1203((byte) 67, arg0)) {
            if (this.field2578 != null && this.field2583 != null && this.field2583[arg0]) {
                class162.method1048(this.field2578, this, arg0, (byte) 81);
            } else {
                class120.method730(super.field3423[arg0], this.field2576, this, -104, arg0, (byte) 2, true);
            }
            if (arg1) {
                this.method909(39, -9);
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(II)V")
    public final void method913(int arg0, int arg1) {
        ++field2569;
        if (arg1 != 255) {
            this.method911(-13, 69, (byte) 111);
        }
        if (this.method1203((byte) 67, arg0)) {
            class162.method1051((byte) 5, this.field2576, arg0);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lgd;II[BZ)V")
    public final void method914(class69 arg0, int arg1, int arg2, byte[] arg3, boolean arg4) {
        ++field2589;
        if (this.field2590 == arg0) {
            if (this.field2582) {
                throw new RuntimeException();
            }
            if (arg3 == null) {
                class120.method730(this.field2593, 255, this, -95, this.field2576, (byte) 0, true);
                return;
            }
            class120.field2165.reset();
            class120.field2165.update(arg3, 0, arg3.length);
            int var6 = (int) class120.field2165.getValue();
            if (~this.field2593 != ~var6) {
                class120.method730(this.field2593, 255, this, -117, this.field2576, (byte) 0, true);
                return;
            }
            class229 var7;
            try {
                var7 = new class229(class211.method1313((byte) 118, arg3));
            } catch (RuntimeException var12) {
                class120.method730(this.field2593, 255, this, -106, this.field2576, (byte) 0, true);
                return;
            }
            int var8 = var7.method1475(arg1 + 156);
            if (~var8 != -6 && ~var8 != -7) {
                class120.method730(this.field2593, 255, this, -120, this.field2576, (byte) 0, true);
                return;
            }
            int var9 = 0;
            if (var8 >= 6) {
                var9 = var7.method1437(425528536);
            }
            if (this.field2568 != var9) {
                class120.method730(this.field2593, 255, this, -105, this.field2576, (byte) 0, true);
                return;
            }
            this.method1191(arg3, 4396);
            this.method916((byte) -32);
        } else {
            if (!arg4 && ~this.field2571 == ~arg2) {
                this.field2582 = true;
            }
            if (arg3 == null || arg3.length <= 2) {
                this.field2583[arg2] = false;
                if (this.field2577 || arg4) {
                    class120.method730(super.field3423[arg2], this.field2576, this, -125, arg2, (byte) 2, arg4);
                }
                return;
            }
            class120.field2165.reset();
            class120.field2165.update(arg3, 0, arg3.length + -2);
            int var10 = (int) class120.field2165.getValue();
            int var11 = ((arg3[arg3.length + -2] & 255) << 8) - -(arg3[arg3.length - 1] & 255);
            if (super.field3423[arg2] != var10 || super.field3444[arg2] != var11) {
                this.field2583[arg2] = false;
                if (this.field2577 || arg4) {
                    class120.method730(super.field3423[arg2], this.field2576, this, -109, arg2, (byte) 2, arg4);
                }
                return;
            }
            this.field2583[arg2] = true;
            if (arg4) {
                super.field3436[arg2] = class164.method1056(arg3, false, (byte) -104);
            }
        }
        if (arg1 != 99) {
            this.method918((byte) -8);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZZI[B)V")
    public final void method915(int arg0, boolean arg1, boolean arg2, int arg3, byte[] arg4) {
        ++field2574;
        if (arg2) {
            if (this.field2582) {
                throw new RuntimeException();
            }
            if (this.field2590 != null) {
                class37.method273(this.field2576, arg4, this.field2590, false);
            }
            this.method1191(arg4, arg3 ^ 13931);
            this.method916((byte) -32);
        } else {
            arg4[arg4.length + -2] = (byte) (super.field3444[arg0] >> 8);
            arg4[arg4.length - 1] = (byte) super.field3444[arg0];
            if (this.field2578 != null) {
                class37.method273(arg0, arg4, this.field2578, false);
                this.field2583[arg0] = true;
            }
            if (arg1) {
                super.field3436[arg0] = class164.method1056(arg4, false, (byte) -104);
            }
        }
        if (arg3 != 10055) {
            this.field2571 = 30;
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)V")
    private final void method916(byte arg0) {
        this.field2583 = new boolean[super.field3436.length];
        ++field2579;
        if (arg0 == -32) {
            for (int var2 = 0; ~this.field2583.length < ~var2; ++var2) {
                this.field2583[var2] = false;
            }
            if (this.field2578 == null) {
                this.field2582 = true;
            } else {
                this.field2571 = -1;
                for (int var3 = 0; var3 < this.field2583.length; ++var3) {
                    if (super.field3405[var3] > 0) {
                        class124.method750(this, arg0 ^ 31, this.field2578, var3);
                        this.field2571 = var3;
                    }
                }
                if (this.field2571 == -1) {
                    this.field2582 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(III)V")
    public static final void method917(int arg0, int arg1, int arg2) {
        ++field2587;
        if (class197.method1234(arg0, arg2 + -173)) {
            if (arg2 == 255) {
                class15.method126(87, arg1, class115.field2067[arg0]);
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(B)I")
    public final int method918(byte arg0) {
        ++field2592;
        if (this.field2582) {
            return 100;
        } else if (arg0 >= -73) {
            return -76;
        } else if (super.field3436 != null) {
            return 99;
        } else {
            int var2 = class102.method625(-64, 255, this.field2576);
            if (~var2 <= -101) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([Loc;ZII)Loc;")
    public static final class151 method919(class151[] arg0, boolean arg1, int arg2, int arg3) {
        ++field2565;
        int var4 = 0;
        for (int var5 = 0; ~arg3 < ~var5; ++var5) {
            if (arg0[arg2 + var5] == null) {
                arg0[arg2 + var5] = class235.field4329;
            }
            var4 += arg0[arg2 - -var5].field2690;
        }
        int var6 = 0;
        byte[] var7 = new byte[var4];
        if (!arg1) {
            return null;
        } else {
            for (int var8 = 0; ~var8 > ~arg3; ++var8) {
                class151 var10 = arg0[arg2 - -var8];
                class145.method924(var10.field2736, 0, var7, var6, var10.field2690);
                var6 += var10.field2690;
            }
            class151 var9 = new class151();
            var9.field2690 = var4;
            var9.field2736 = var7;
            return var9;
        }
    }
}
