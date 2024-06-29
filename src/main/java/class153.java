import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class153 {

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "Lfk;")
    private class266 field2244 = new class266();

    @OriginalMember(owner = "client!wj", name = "w", descriptor = "Lnb;")
    private class117 field2259 = new class117();

    @OriginalMember(owner = "client!wj", name = "t", descriptor = "I")
    private int field2256;

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "I")
    private int field2254;

    @OriginalMember(owner = "client!wj", name = "v", descriptor = "Lbf;")
    private class209 field2258;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field2240 = -1;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "[Lma;")
    public static class5[] field2239 = new class5[100];

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "Lma;")
    public static class5 field2243 = class12.method119("Sprites geladen)3", (byte) 93);

    @OriginalMember(owner = "client!wj", name = "s", descriptor = "I")
    public static volatile int field2255 = 0;

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "Lma;")
    public static class5 field2249 = class12.method119(")1 ", (byte) 84);

    @OriginalMember(owner = "client!wj", name = "u", descriptor = "Lma;")
    private static class5 field2257 = class12.method119("You can(Wt add yourself to your own friend list)3", (byte) 124);

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "Lma;")
    public static class5 field2242 = field2257;

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "Lma;")
    public static class5 field2250 = class12.method119("Abbrechen", (byte) 57);

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)Lql;", line = 7)
    public final class297 method963(byte arg0) {
        field2253++;
        int var2 = 64 % ((arg0 + 62) / 51);
        return this.field2258.method1380((byte) 66);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IJ)Lfk;", line = 17)
    public final class266 method964(int arg0, long arg1) {
        if (arg0 != -257) {
            method967(-65, 47);
        }
        field2245++;
        class266 var4 = (class266) this.field2258.method1372(false, arg1);
        if (var4 != null) {
            this.field2259.method786(var4, arg0 + 257);
        }
        return var4;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILnc;)V", line = 41)
    public static final void method965(int arg0, class12 arg1) {
        arg1.field173 = arg1.field202;
        field2237++;
        if (arg1.field208 == 0) {
            arg1.field181 = 0;
            return;
        }
        if (arg1.field238 != -1 && arg1.field214 == 0) {
            class33 var2 = class171.method1136(arg1.field238, -6722);
            if (arg1.field172 > 0 && var2.field526 == 0) {
                arg1.field181++;
                return;
            }
            if (arg1.field172 <= 0 && var2.field503 == 0) {
                arg1.field181++;
                return;
            }
        }
        int var3 = arg1.field178;
        int var4 = arg1.field211;
        if (arg0 >= -22) {
            method967(115, 46);
        }
        int var5 = arg1.field175[arg1.field208 - 1] * 128 + arg1.field226 * 64;
        int var6 = arg1.field186[arg1.field208 - 1] * 128 + arg1.field226 * 64;
        if (var5 - var3 > 256 || (var5 - var3) < -256 || var6 - var4 > 256 || var6 - var4 < -256) {
            arg1.field178 = var5;
            arg1.field211 = var6;
            return;
        }
        if (var3 >= var5) {
            if (var5 < var3) {
                if (var6 > var4) {
                    arg1.field215 = 768;
                } else if (var6 < var4) {
                    arg1.field215 = 256;
                } else {
                    arg1.field215 = 512;
                }
            } else if (var6 > var4) {
                arg1.field215 = 1024;
            } else if (var6 < var4) {
                arg1.field215 = 0;
            }
        } else if (var4 < var6) {
            arg1.field215 = 1280;
        } else if (var6 >= var4) {
            arg1.field215 = 1536;
        } else {
            arg1.field215 = 1792;
        }
        int var7 = arg1.field230;
        int var8 = 4;
        boolean var9 = true;
        int var10 = arg1.field215 - arg1.field174 & 0x7FF;
        if (var10 > 1024) {
            var10 -= 2048;
        }
        if (var10 >= -256 && var10 <= 256) {
            var7 = arg1.field206;
        } else if (var10 >= 256 && var10 < 768) {
            var7 = arg1.field233;
        } else if (var10 >= -768 && var10 <= -256) {
            var7 = arg1.field201;
        }
        if (var7 == -1) {
            var7 = arg1.field206;
        }
        arg1.field173 = var7;
        if (arg1 instanceof class177) {
            var9 = ((class177) arg1).field2699.field4885;
        }
        if (var9) {
            if (arg1.field215 != arg1.field174 && arg1.field223 == -1 && arg1.field218 != 0) {
                var8 = 2;
            }
            if (arg1.field208 > 2) {
                var8 = 6;
            }
            if (arg1.field208 > 3) {
                var8 = 8;
            }
            if (arg1.field181 > 0 && arg1.field208 > 1) {
                var8 = 8;
                arg1.field181--;
            }
        } else {
            if (arg1.field208 > 1) {
                var8 = 6;
            }
            if (arg1.field208 > 2) {
                var8 = 8;
            }
            if (arg1.field181 > 0 && arg1.field208 > 1) {
                arg1.field181--;
                var8 = 8;
            }
        }
        if (arg1.field240[arg1.field208 - 1]) {
            var8 <<= 0x1;
        }
        if (var5 > var3) {
            arg1.field178 += var8;
            if (var5 < arg1.field178) {
                arg1.field178 = var5;
            }
        } else if (var5 < var3) {
            arg1.field178 -= var8;
            if (var5 > arg1.field178) {
                arg1.field178 = var5;
            }
        }
        if (var6 > var4) {
            arg1.field211 += var8;
            if (var6 < arg1.field211) {
                arg1.field211 = var6;
            }
        } else if (var4 > var6) {
            arg1.field211 -= var8;
            if (arg1.field211 < var6) {
                arg1.field211 = var6;
            }
        }
        if (arg1.field178 == var5 && arg1.field211 == var6) {
            arg1.field208--;
            if (arg1.field172 > 0) {
                arg1.field172--;
            }
        }
        if (var8 >= 8 && arg1.field206 == arg1.field173 && arg1.field184 != -1) {
            arg1.field173 = arg1.field184;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lfk;JB)V", line = 255)
    public final void method966(class266 arg0, long arg1, byte arg2) {
        field2246++;
        if (arg2 != 73) {
            this.field2256 = -94;
        }
        if (this.field2256 == 0) {
            class266 var5 = this.field2259.method785(74);
            var5.method1997(-27381);
            var5.method1828(-76);
            if (this.field2244 == var5) {
                class266 var6 = this.field2259.method785(106);
                var6.method1997(arg2 - 27454);
                var6.method1828(-116);
            }
        } else {
            this.field2256--;
        }
        this.field2258.method1376(arg1, -1, arg0);
        this.field2259.method786(arg0, 0);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)Lma;", line = 287)
    public static final class5 method967(int arg0, int arg1) {
        if (arg0 >= -72) {
            method969((byte) 13);
        }
        field2252++;
        return class288.method1940((byte) 86, new class5[] { class175.method1148(arg1 >> 24 & 0xFF, false), class161.field2464, class175.method1148(arg1 >> 16 & 0xFF, false), class161.field2464, class175.method1148(arg1 >> 8 & 0xFF, false), class161.field2464, class175.method1148(arg1 & 0xFF, false) });
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Leb;I)V", line = 306)
    public static final void method968(class253 arg0, int arg1) {
        field2251++;
        int var2 = arg0.field4238;
        if (var2 == 324) {
            if (class20.field345 == -1) {
                class20.field345 = arg0.field4230;
                class276.field4712 = arg0.field4246;
            }
            if (class186.field2926.field1891) {
                arg0.field4230 = class20.field345;
            } else {
                arg0.field4230 = class276.field4712;
            }
            return;
        }
        if (arg1 > -30) {
            field2243 = (class5) null;
        }
        if (var2 == 325) {
            if (class20.field345 == -1) {
                class276.field4712 = arg0.field4246;
                class20.field345 = arg0.field4230;
            }
            if (class186.field2926.field1891) {
                arg0.field4230 = class276.field4712;
            } else {
                arg0.field4230 = class20.field345;
            }
        } else if (var2 == 327) {
            arg0.field4302 = 150;
            arg0.field4319 = (int) (Math.sin((double) class50.field784 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field4262 = 5;
            arg0.field4183 = -1;
        } else if (var2 == 328) {
            if (class151.field2183.field1367 == null) {
                arg0.field4183 = 0;
            } else {
                arg0.field4302 = 150;
                arg0.field4319 = (int) (Math.sin((double) class50.field784 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field4262 = 5;
                arg0.field4183 = ((int) class151.field2183.field1367.method69(-49) << 11) + 2047;
                arg0.field4300 = class151.field2183.field173;
                arg0.field4336 = class151.field2183.field237;
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)V", line = 392)
    public static void method969(byte arg0) {
        field2242 = null;
        field2257 = null;
        field2250 = null;
        if (arg0 == 115) {
            field2239 = null;
            field2243 = null;
            field2249 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(I)V", line = 498)
    public class153(int arg0) {
        this.field2256 = arg0;
        this.field2254 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field2258 = new class209(var2);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)Lql;", line = 438)
    public final class297 method970(boolean arg0) {
        field2238++;
        if (arg0) {
            field2242 = (class5) null;
        }
        return this.field2258.method1379(true);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V", line = 467)
    public final void method971(int arg0) {
        field2248++;
        this.field2259.method782(-18590);
        this.field2258.method1382((byte) 91);
        this.field2244 = new class266();
        if (arg0 > 16) {
            this.field2256 = this.field2254;
        }
    }
}
