import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class137 extends class111 {

    @OriginalMember(owner = "client!ua", name = "jb", descriptor = "I")
    private int field3411 = -1;

    @OriginalMember(owner = "client!ua", name = "Bb", descriptor = "Z")
    private boolean field3429 = false;

    @OriginalMember(owner = "client!ua", name = "Hb", descriptor = "Z")
    private volatile boolean field3435 = false;

    @OriginalMember(owner = "client!ua", name = "fb", descriptor = "I")
    private int field3407;

    @OriginalMember(owner = "client!ua", name = "bb", descriptor = "Lpe;")
    private class109 field3403;

    @OriginalMember(owner = "client!ua", name = "rb", descriptor = "Lpe;")
    private class109 field3419;

    @OriginalMember(owner = "client!ua", name = "cb", descriptor = "Lkd;")
    public static class73 field3404 = class126.method1070((byte) -66, "Startseite auf (WSpielkonto wiederherstellen(W)3");

    @OriginalMember(owner = "client!ua", name = "ab", descriptor = "Lkd;")
    public static class73 field3402 = class126.method1070((byte) -66, "Benutzen Sie bitte eine andere Welt)3");

    @OriginalMember(owner = "client!ua", name = "gb", descriptor = "Lkd;")
    public static class73 field3408 = class126.method1070((byte) -66, "Bitte warten Sie eine Minute");

    @OriginalMember(owner = "client!ua", name = "wb", descriptor = "[Lkd;")
    public static class73[] field3424 = new class73[200];

    @OriginalMember(owner = "client!ua", name = "pb", descriptor = "Lkd;")
    private static class73 field3417 = class126.method1070((byte) -66, "Classic");

    @OriginalMember(owner = "client!ua", name = "Db", descriptor = "Lkd;")
    private static class73 field3431 = class126.method1070((byte) -66, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!ua", name = "ob", descriptor = "I")
    public static int field3416 = 0;

    @OriginalMember(owner = "client!ua", name = "eb", descriptor = "Lkd;")
    public static class73 field3406 = field3431;

    @OriginalMember(owner = "client!ua", name = "kb", descriptor = "Lkd;")
    public static class73 field3412 = field3417;

    @OriginalMember(owner = "client!ua", name = "ub", descriptor = "[I")
    public static int[] field3422 = new int[2048];

    @OriginalMember(owner = "client!ua", name = "sb", descriptor = "I")
    public static int field3420 = -1;

    @OriginalMember(owner = "client!ua", name = "Z", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!ua", name = "db", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!ua", name = "hb", descriptor = "I")
    private int field3409;

    @OriginalMember(owner = "client!ua", name = "ib", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!ua", name = "lb", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!ua", name = "mb", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!ua", name = "qb", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!ua", name = "tb", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!ua", name = "vb", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!ua", name = "xb", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!ua", name = "yb", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!ua", name = "zb", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!ua", name = "Ab", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!ua", name = "Cb", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!ua", name = "Eb", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!ua", name = "Fb", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!ua", name = "Gb", descriptor = "I")
    private int field3434;

    @OriginalMember(owner = "client!ua", name = "Ib", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!ua", name = "Jb", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!ua", name = "nb", descriptor = "[Z")
    private volatile boolean[] field3415;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)V")
    public final void method886(int arg0, int arg1) {
        ++field3430;
        if (arg0 == 0) {
            if (this.field3419 != null && this.field3415 != null && this.field3415[arg1]) {
                class16.method131(this, this.field3419, (byte) -121, arg1);
            } else {
                class64.method541(arg1, 1, this.field3407, this, super.field2742[arg1], (byte) 2, true);
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILkd;Lq;Lkd;)[Lpb;")
    public static final class106[] method1116(int arg0, class73 arg1, class111 arg2, class73 arg3) {
        ++field3426;
        if (arg0 < 24) {
            field3416 = 102;
        }
        int var4 = arg2.method905(arg1, (byte) -72);
        int var5 = arg2.method902(0, var4, arg3);
        return class77.method671(var4, 16267, var5, arg2);
    }

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "(II)I")
    private final int method1117(int arg0, int arg1) {
        ++field3405;
        if (arg1 != -18728) {
            field3425 = 121;
        }
        if (super.field2724[arg0] != null) {
            return 100;
        } else {
            return this.field3415[arg0] ? 100 : class121.method1035(this.field3407, arg0, (byte) 115);
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)Z")
    public static final boolean method1118(int arg0) {
        ++field3410;
        class133 var1 = class115.field2903;
        synchronized (class115.field2903) {
            if (arg0 > -20) {
                return true;
            } else if (~class80.field2031 == ~class25.field729) {
                return false;
            } else {
                class129.field3256 = class131.field3287[class80.field2031];
                class87.field2197 = class58.field1534[class80.field2031];
                class80.field2031 = 127 & class80.field2031 - -1;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)I")
    public final int method1119(int arg0) {
        ++field3432;
        if (this.field3435) {
            return 100;
        } else if (super.field2724 != null) {
            return 99;
        } else {
            int var2 = class121.method1035(255, this.field3407, (byte) 97);
            if (arg0 >= ~var2) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([BIIZLpe;)V")
    public final void method1120(byte[] arg0, int arg1, int arg2, boolean arg3, class109 arg4) {
        if (arg2 != 255) {
            this.method1126(43, -53, -71);
        }
        ++field3428;
        if (this.field3403 == arg4) {
            if (this.field3435) {
                throw new RuntimeException();
            } else if (arg0 == null) {
                class64.method541(this.field3407, 1, 255, this, this.field3434, (byte) 0, true);
            } else {
                class151.field3740.reset();
                class151.field3740.update(arg0, 0, arg0.length);
                int var6 = (int) class151.field3740.getValue();
                if (~this.field3434 == ~var6 && ~this.field3409 == ~super.field2763) {
                    this.method893((byte) -107, arg0);
                    this.method1128(109);
                } else {
                    class64.method541(this.field3407, 1, 255, this, this.field3434, (byte) 0, true);
                }
            }
        } else {
            if (!arg3 && ~this.field3411 == ~arg1) {
                this.field3435 = true;
            }
            if (arg0 != null && ~arg0.length < -3) {
                class151.field3740.reset();
                class151.field3740.update(arg0, 0, arg0.length + -2);
                int var7 = (int) class151.field3740.getValue();
                int var8 = ((255 & arg0[arg0.length - 2]) << 8) + (255 & arg0[arg0.length - 1]);
                if (~super.field2742[arg1] == ~var7 && super.field2730[arg1] == var8) {
                    this.field3415[arg1] = true;
                    if (arg3) {
                        super.field2724[arg1] = class25.method202(false, (byte) 26, arg0);
                    }
                } else {
                    this.field3415[arg1] = false;
                    if (this.field3429 || arg3) {
                        class64.method541(arg1, 1, this.field3407, this, super.field2742[arg1], (byte) 2, arg3);
                    }
                }
            } else {
                this.field3415[arg1] = false;
                if (this.field3429 || arg3) {
                    class64.method541(arg1, arg2 ^ 254, this.field3407, this, super.field2742[arg1], (byte) 2, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)I")
    public final int method1121(int arg0) {
        int var2 = 0;
        ++field3418;
        int var3 = 0;
        for (int var4 = arg0; ~super.field2724.length < ~var4; ++var4) {
            if (super.field2746[var4] > 0) {
                var3 += this.method1117(var4, -18728);
                var2 += 100;
            }
        }
        if (~var2 == -1) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([BZZIB)V")
    public final void method1122(byte[] arg0, boolean arg1, boolean arg2, int arg3, byte arg4) {
        if (arg4 > -67) {
            field3425 = -87;
        }
        ++field3401;
        if (!arg1) {
            arg0[arg0.length + -2] = (byte) (super.field2730[arg3] >> 8);
            arg0[arg0.length + -1] = (byte) super.field2730[arg3];
            if (this.field3419 != null) {
                class141.method1146(this.field3419, (byte) 43, arg3, arg0);
                this.field3415[arg3] = true;
            }
            if (arg2) {
                super.field2724[arg3] = class25.method202(false, (byte) 26, arg0);
                return;
            }
        } else {
            if (this.field3435) {
                throw new RuntimeException();
            }
            if (this.field3403 != null) {
                class141.method1146(this.field3403, (byte) 43, this.field3407, arg0);
            }
            this.method893((byte) -117, arg0);
            this.method1128(91);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lq;Lqe;Lq;Lq;I)Z")
    public static final boolean method1123(class111 arg0, class116 arg1, class111 arg2, class111 arg3, int arg4) {
        class86.field2181 = arg1;
        class23.field670 = arg0;
        class76.field1941 = arg2;
        ++field3427;
        class136.field3390 = arg3;
        if (arg4 != 24121) {
            field3402 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lpe;Lpe;IZZZ)V")
    public class137(class109 arg0, class109 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3407 = arg2;
        this.field3403 = arg1;
        this.field3429 = arg5;
        this.field3419 = arg0;
        class122.method1042(this, this.field3407, -29376);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIBI)I")
    public static final int method1124(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg0 & 3;
        ++field3436;
        if (~var4 == -1) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else {
            if (arg2 >= -53) {
                field3424 = null;
            }
            return var4 == 2 ? -arg3 + 7 : arg1;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
    public static void method1125(boolean arg0) {
        field3404 = null;
        field3406 = null;
        if (!arg0) {
            method1116(0, (class73) null, (class111) null, (class73) null);
        }
        field3412 = null;
        field3417 = null;
        field3408 = null;
        field3422 = null;
        field3424 = null;
        field3402 = null;
        field3431 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZI)V")
    public final void method901(boolean arg0, int arg1) {
        class82.method695(this.field3407, arg1, (byte) 96);
        ++field3437;
        if (!arg0) {
            field3425 = -21;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(III)V")
    public final void method1126(int arg0, int arg1, int arg2) {
        if (arg2 != 22255) {
            this.method1128(-52);
        }
        this.field3434 = arg0;
        this.field3409 = arg1;
        if (this.field3403 != null) {
            class16.method131(this, this.field3403, (byte) -120, this.field3407);
        } else {
            class64.method541(this.field3407, 1, 255, this, this.field3434, (byte) 0, true);
        }
        ++field3413;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIZI)Lpb;")
    public static final class106 method1127(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        long var6 = ((long) arg3 << 40) + (((long) arg0 << 16) + (long) arg5 - -((long) arg2 << 38));
        ++field3421;
        if (!arg4) {
            class106 var8 = (class106) class78.field1991.method538(0, var6);
            if (var8 != null) {
                return var8;
            }
        }
        class126 var9 = class9.method86(arg5, (byte) 108);
        if (arg0 > 1 && var9.field3189 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; ++var11) {
                if (var9.field3235[var11] <= arg0 && ~var9.field3235[var11] != -1) {
                    var10 = var9.field3189[var11];
                }
            }
            if (var10 != -1) {
                var9 = class9.method86(var10, (byte) 112);
            }
        }
        class91 var12 = var9.method1071(1, 78);
        if (var12 == null) {
            return null;
        } else {
            class106 var13 = null;
            if (~var9.field3229 != 0) {
                var13 = method1127(10, -103, 1, 0, true, var9.field3207);
                if (var13 == null) {
                    return null;
                }
            }
            int var14 = class17.field503;
            int var15 = class17.field505;
            int[] var16 = class17.field506;
            int[] var17 = new int[4];
            class17.method145(var17);
            class106 var18 = new class106(36, 32);
            class17.method132(var18.field2626, 36, 32);
            class17.method140();
            class29.method237();
            class29.method230(16, 16);
            class29.field844 = false;
            int var19 = var9.field3199;
            if (arg4) {
                var19 = (int) ((double) var19 * 1.5D);
            } else if (arg2 == 2) {
                var19 = (int) ((double) var19 * 1.04D);
            }
            int var20 = class29.field833[var9.field3196] * var19 >> 16;
            int var21 = class29.field848[var9.field3196] * var19 >> 16;
            var12.method755();
            var12.method762(0, var9.field3219, var9.field3215, var9.field3196, var9.field3208, var20 - -(var12.field514 / 2) + var9.field3224, var9.field3224 + var21);
            if (~arg2 <= -2) {
                var18.method853(1);
            }
            if (arg2 >= 2) {
                var18.method853(16777215);
            }
            if (~arg3 != -1) {
                var18.method866(arg3);
            }
            class17.method132(var18.field2626, 36, 32);
            if (var9.field3229 != -1) {
                var13.method860(0, 0);
            }
            if (!arg4 && (var9.field3238 == 1 || arg0 != 1) && arg0 != -1) {
                class82.field2070.method355(class133.method1107(18299, arg0), 0, 9, 16776960, 1);
            }
            if (!arg4) {
                class78.field1991.method542(var18, -901, var6);
            }
            if (arg1 > -98) {
                method1118(117);
            }
            class17.method132(var16, var14, var15);
            class17.method137(var17);
            class29.method237();
            class29.field844 = true;
            return var18;
        }
    }

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)V")
    private final void method1128(int arg0) {
        ++field3414;
        this.field3415 = new boolean[super.field2724.length];
        for (int var2 = 0; this.field3415.length > var2; ++var2) {
            this.field3415[var2] = false;
        }
        if (this.field3419 == null) {
            this.field3435 = true;
        } else {
            this.field3411 = -1;
            if (arg0 < 15) {
                field3425 = 18;
            }
            for (int var3 = 0; this.field3415.length > var3; ++var3) {
                if (super.field2746[var3] > 0) {
                    class140.method1144(-8089, var3, this, this.field3419);
                    this.field3411 = var3;
                }
            }
            if (this.field3411 == -1) {
                this.field3435 = true;
            }
        }
    }
}
