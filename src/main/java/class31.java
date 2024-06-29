import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class31 extends class35 {

    @OriginalMember(owner = "client!eb", name = "nb", descriptor = "Z")
    private volatile boolean field793 = false;

    @OriginalMember(owner = "client!eb", name = "vb", descriptor = "Z")
    private boolean field801 = false;

    @OriginalMember(owner = "client!eb", name = "zb", descriptor = "I")
    private int field805 = -1;

    @OriginalMember(owner = "client!eb", name = "U", descriptor = "Lcb;")
    private class17 field774;

    @OriginalMember(owner = "client!eb", name = "Z", descriptor = "I")
    private int field779;

    @OriginalMember(owner = "client!eb", name = "tb", descriptor = "Lcb;")
    private class17 field799;

    @OriginalMember(owner = "client!eb", name = "bb", descriptor = "Lhe;")
    public static class54 field781 = class6.method58("Bitte geben Sie Ihr Passwort ein)3", false);

    @OriginalMember(owner = "client!eb", name = "lb", descriptor = "I")
    public static int field791 = 0;

    @OriginalMember(owner = "client!eb", name = "pb", descriptor = "Lhe;")
    private static class54 field795 = class6.method58("Loaded wordpack", false);

    @OriginalMember(owner = "client!eb", name = "eb", descriptor = "Lhe;")
    public static class54 field784 = class6.method58(":chalreq:", false);

    @OriginalMember(owner = "client!eb", name = "X", descriptor = "I")
    public static int field777 = 5063219;

    @OriginalMember(owner = "client!eb", name = "ob", descriptor = "Lhe;")
    public static class54 field794 = class6.method58("mapscene", false);

    @OriginalMember(owner = "client!eb", name = "ab", descriptor = "Lhe;")
    public static class54 field780 = field795;

    @OriginalMember(owner = "client!eb", name = "wb", descriptor = "I")
    public static int field802 = 0;

    @OriginalMember(owner = "client!eb", name = "yb", descriptor = "Z")
    public static boolean field804 = false;

    @OriginalMember(owner = "client!eb", name = "S", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!eb", name = "T", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!eb", name = "V", descriptor = "I")
    private int field775;

    @OriginalMember(owner = "client!eb", name = "W", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!eb", name = "Y", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!eb", name = "cb", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!eb", name = "fb", descriptor = "I")
    private int field785;

    @OriginalMember(owner = "client!eb", name = "hb", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!eb", name = "ib", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!eb", name = "jb", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!eb", name = "kb", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!eb", name = "mb", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!eb", name = "qb", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!eb", name = "rb", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!eb", name = "sb", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!eb", name = "ub", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!eb", name = "xb", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!eb", name = "db", descriptor = "Lgd;")
    public static class46 field783;

    @OriginalMember(owner = "client!eb", name = "gb", descriptor = "[Z")
    private volatile boolean[] field786;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V")
    public final void method225(int arg0, int arg1, int arg2) {
        this.field775 = arg2;
        this.field785 = arg0;
        ++field797;
        if (this.field774 == null) {
            class18.method154(this.field775, this.field779, this, (byte) 0, 255, true, (byte) 99);
        } else {
            class112.method841(-6207, this, this.field779, this.field774);
        }
        if (arg1 != 255) {
            field804 = true;
        }
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)I")
    public final int method226(byte arg0) {
        ++field788;
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; ~var4 > ~super.field868.length; ++var4) {
            if (super.field890[var4] > 0) {
                var2 += 100;
                var3 += this.method236((byte) 114, var4);
            }
        }
        if (arg0 != 119) {
            method235(92);
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(II)V")
    public final void method227(int arg0, int arg1) {
        int var3 = 50 % ((arg0 - -49) / 38);
        ++field790;
        if (this.field799 != null && this.field786 != null && this.field786[arg1]) {
            class112.method841(-6207, this, arg1, this.field799);
        } else {
            class18.method154(super.field876[arg1], arg1, this, (byte) 2, this.field779, true, (byte) 62);
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lcb;Lcb;IZZZ)V")
    public class31(class17 arg0, class17 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field774 = arg1;
        this.field801 = arg5;
        this.field779 = arg2;
        this.field799 = arg0;
        class129.method974(this.field779, this, 255);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lcb;I[BZZ)V")
    public final void method228(class17 arg0, int arg1, byte[] arg2, boolean arg3, boolean arg4) {
        ++field798;
        if (!arg4) {
            if (this.field774 == arg0) {
                if (this.field793) {
                    throw new RuntimeException();
                } else if (arg2 == null) {
                    class18.method154(this.field775, this.field779, this, (byte) 0, 255, true, (byte) 98);
                } else {
                    class83.field2082.reset();
                    class83.field2082.update(arg2, 0, arg2.length);
                    int var6 = (int) class83.field2082.getValue();
                    class83 var7 = new class83(class133.method1000(-38, arg2));
                    int var8 = var7.method638(0);
                    if (~var8 != -6 && var8 != 6) {
                        throw new RuntimeException("Incorrect JS5 protocol number: " + var8);
                    } else {
                        int var9 = 0;
                        if (var8 >= 6) {
                            var9 = var7.method641((byte) 73);
                        }
                        if (this.field775 == var6 && this.field785 == var9) {
                            this.method275((byte) 108, arg2);
                            this.method237(arg4);
                        } else {
                            class18.method154(this.field775, this.field779, this, (byte) 0, 255, true, (byte) -125);
                        }
                    }
                }
            } else {
                if (!arg3 && this.field805 == arg1) {
                    this.field793 = true;
                }
                if (arg2 != null && arg2.length > 2) {
                    class83.field2082.reset();
                    class83.field2082.update(arg2, 0, arg2.length + -2);
                    int var10 = (int) class83.field2082.getValue();
                    int var11 = ((255 & arg2[arg2.length + -2]) << 8) + (arg2[arg2.length + -1] & 255);
                    if (super.field876[arg1] == var10 && ~super.field908[arg1] == ~var11) {
                        this.field786[arg1] = true;
                        if (arg3) {
                            super.field868[arg1] = class132.method994(arg2, false, (byte) 75);
                        }
                    } else {
                        this.field786[arg1] = false;
                        if (this.field801 || arg3) {
                            class18.method154(super.field876[arg1], arg1, this, (byte) 2, this.field779, arg3, (byte) 29);
                        }
                    }
                } else {
                    this.field786[arg1] = false;
                    if (this.field801 || arg3) {
                        class18.method154(super.field876[arg1], arg1, this, (byte) 2, this.field779, arg3, (byte) -127);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB[Lnc;)V")
    public static final void method229(int arg0, byte arg1, class93[] arg2) {
        if (arg1 != 2) {
            method229(20, (byte) 34, (class93[]) null);
        }
        for (int var3 = 0; var3 < arg2.length; ++var3) {
            class93 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field2359 == 0) {
                    if (var4.field2316 != null) {
                        method229(arg0, (byte) 2, var4.field2316);
                    }
                    class112 var5 = (class112) class63.field1530.method246((byte) 117, (long) var4.field2273);
                    if (var5 != null) {
                        class115.method877(0, arg0, var5.field2691);
                    }
                }
                if (~arg0 == -1 && var4.field2234 != null) {
                    class100 var6 = new class100();
                    var6.field2522 = var4.field2234;
                    var6.field2537 = var4;
                    class32.method242(1, var6);
                }
                if (~arg0 == -2 && var4.field2345 != null) {
                    if (var4.field2264 >= 0) {
                        class93 var7 = class121.method938(true, var4.field2273);
                        if (var7 == null || var7.field2316 == null || ~var7.field2316.length >= ~var4.field2264 || var7.field2316[var4.field2264] != var4) {
                            continue;
                        }
                    }
                    class100 var8 = new class100();
                    var8.field2537 = var4;
                    var8.field2522 = var4.field2345;
                    class32.method242(1, var8);
                }
            }
        }
        ++field803;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIB)V")
    public static final void method230(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != -44) {
            method231(41, -48, (byte) 87);
        }
        for (class138 var5 = (class138) class83.field2039.method979(arg4 + -81); var5 != null; var5 = (class138) class83.field2039.method983(18485)) {
            if (var5.field3171 != -1 || var5.field3150 != null) {
                int var6 = 0;
                if (~var5.field3156 <= ~arg3) {
                    if (~var5.field3161 < ~arg3) {
                        var6 += -arg3 + var5.field3161;
                    }
                } else {
                    var6 += arg3 - var5.field3156;
                }
                if (var5.field3175 >= arg2) {
                    if (~var5.field3174 < ~arg2) {
                        var6 += -arg2 + var5.field3174;
                    }
                } else {
                    var6 += -var5.field3175 + arg2;
                }
                if (var6 + -64 <= var5.field3153 && ~class139.field3190 != -1 && ~var5.field3164 == ~arg0) {
                    var6 -= 64;
                    if (~var6 > -1) {
                        var6 = 0;
                    }
                    int var7 = (-var6 + var5.field3153) * class139.field3190 / var5.field3153;
                    if (var5.field3160 != null) {
                        var5.field3160.method906(var7);
                    } else if (var5.field3171 >= 0) {
                        class69 var8 = class69.method548(class131.field2977, var5.field3171, 0);
                        if (var8 != null) {
                            class92 var9 = var8.method551().method734(class13.field357);
                            class119 var10 = class119.method916(var9, 100, var7);
                            var10.method905(-1);
                            class5.field143.method484(var10);
                            var5.field3160 = var10;
                        }
                    }
                    if (var5.field3157 != null) {
                        var5.field3157.method906(var7);
                        if (!var5.field3157.method50(true)) {
                            var5.field3157 = null;
                        }
                    } else if (var5.field3150 != null && (var5.field3176 -= arg1) <= 0) {
                        int var11 = (int) (Math.random() * (double) var5.field3150.length);
                        class69 var12 = class69.method548(class131.field2977, var5.field3150[var11], 0);
                        if (var12 != null) {
                            class92 var13 = var12.method551().method734(class13.field357);
                            class119 var14 = class119.method916(var13, 100, var7);
                            var14.method905(0);
                            class5.field143.method484(var14);
                            var5.field3176 = (int) ((double) (-var5.field3151 + var5.field3155) * Math.random()) + var5.field3151;
                            var5.field3157 = var14;
                        }
                    }
                } else {
                    if (var5.field3160 != null) {
                        class5.field143.method486(var5.field3160);
                        var5.field3160 = null;
                    }
                    if (var5.field3157 != null) {
                        class5.field143.method486(var5.field3157);
                        var5.field3157 = null;
                    }
                }
            }
        }
        ++field789;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIB)Lhe;")
    public static final class54 method231(int arg0, int arg1, byte arg2) {
        ++field800;
        int var3 = arg0 - arg1;
        if (~var3 > 8) {
            return class74.field1822;
        } else {
            if (arg2 != -45) {
                field784 = null;
            }
            if (~var3 > 5) {
                return class7.field208;
            } else if (~var3 > 2) {
                return class82.field2016;
            } else if (~var3 > -1) {
                return class94.field2387;
            } else if (~var3 < -10) {
                return class94.field2379;
            } else if (~var3 < -7) {
                return class15.field458;
            } else if (~var3 < -4) {
                return class9.field264;
            } else {
                return ~var3 < -1 ? class95.field2395 : class155.field3503;
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZZIZ[B)V")
    public final void method232(boolean arg0, boolean arg1, int arg2, boolean arg3, byte[] arg4) {
        if (!arg1) {
            this.method228((class17) null, 78, (byte[]) null, false, false);
        }
        ++field772;
        if (!arg0) {
            arg4[arg4.length - 2] = (byte) (super.field908[arg2] >> 8);
            arg4[arg4.length + -1] = (byte) super.field908[arg2];
            if (this.field799 != null) {
                class39.method295(1778, arg2, arg4, this.field799);
                this.field786[arg2] = true;
            }
            if (arg3) {
                super.field868[arg2] = class132.method994(arg4, false, (byte) 75);
                return;
            }
        } else {
            if (this.field793) {
                throw new RuntimeException();
            }
            if (this.field774 != null) {
                class39.method295(1778, this.field779, arg4, this.field774);
            }
            this.method275((byte) 108, arg4);
            this.method237(false);
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)V")
    public final void method233(int arg0, int arg1) {
        if (arg1 != 10064) {
            field794 = null;
        }
        ++field787;
        class32.method240(arg0, (byte) -85, this.field779);
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)I")
    public final int method234(byte arg0) {
        ++field796;
        if (this.field793) {
            return 100;
        } else {
            if (arg0 != -31) {
                method231(54, 95, (byte) 111);
            }
            if (super.field868 != null) {
                return 99;
            } else {
                int var2 = class52.method367(255, 0, this.field779);
                if (~var2 <= -101) {
                    var2 = 99;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V")
    public static final void method235(int arg0) {
        class156.field3532 = new int[151];
        class124.field2860 = new int[33];
        class91.field2216 = new int[151];
        ++field773;
        class156.field3516 = new int[33];
        for (int var1 = 0; var1 < 33; ++var1) {
            int var6 = 999;
            int var7 = 0;
            for (int var8 = 0; ~var8 > -35; ++var8) {
                if (class4.field136.field573[class4.field136.field574 * var1 + var8] == 0) {
                    if (var6 == 999) {
                        var6 = var8;
                    }
                } else if (var6 != 999) {
                    var7 = var8;
                    break;
                }
            }
            class124.field2860[var1] = var6;
            class156.field3516[var1] = -var6 + var7;
        }
        if (arg0 <= 20) {
            method231(-86, 32, (byte) 7);
        }
        for (int var2 = 5; var2 < 156; ++var2) {
            int var3 = 999;
            int var4 = 0;
            for (int var5 = 25; var5 < 172; ++var5) {
                if (class4.field136.field573[class4.field136.field574 * var2 + var5] != 0 || ~var5 >= -35 && ~var2 >= -35) {
                    if (~var3 != -1000) {
                        var4 = var5;
                        break;
                    }
                } else if (var3 == 999) {
                    var3 = var5;
                }
            }
            class156.field3532[var2 + -5] = var3 - 25;
            class91.field2216[var2 + -5] = var4 - var3;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)I")
    private final int method236(byte arg0, int arg1) {
        ++field778;
        if (arg0 != 114) {
            return -118;
        } else if (super.field868[arg1] != null) {
            return 100;
        } else {
            return this.field786[arg1] ? 100 : class52.method367(this.field779, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V")
    private final void method237(boolean arg0) {
        ++field776;
        this.field786 = new boolean[super.field868.length];
        for (int var2 = 0; this.field786.length > var2; ++var2) {
            this.field786[var2] = false;
        }
        if (this.field799 == null) {
            this.field793 = true;
        } else {
            this.field805 = -1;
            if (!arg0) {
                for (int var3 = 0; ~var3 > ~this.field786.length; ++var3) {
                    if (super.field890[var3] > 0) {
                        class3.method17((byte) 94, this.field799, this, var3);
                        this.field805 = var3;
                    }
                }
                if (this.field805 == -1) {
                    this.field793 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(B)V")
    public static void method238(byte arg0) {
        field781 = null;
        field783 = null;
        field794 = null;
        if (arg0 < -45) {
            field795 = null;
            field780 = null;
            field784 = null;
        }
    }
}
