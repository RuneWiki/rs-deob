import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class259 {

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
    public int field3331 = 127;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "Z")
    public boolean field3330 = false;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
    public int field3332 = 0;

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "I")
    public int field3339 = 8;

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
    public int field3334 = 128;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "I")
    public int field3333 = 16;

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
    public int field3336 = -1;

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "I")
    public int field3338 = -1;

    @OriginalMember(owner = "client!vn", name = "q", descriptor = "Z")
    public boolean field3342 = true;

    @OriginalMember(owner = "client!vn", name = "r", descriptor = "I")
    public int field3343 = -1;

    @OriginalMember(owner = "client!vn", name = "s", descriptor = "Z")
    public boolean field3344 = true;

    @OriginalMember(owner = "client!vn", name = "t", descriptor = "I")
    public int field3345 = 1190717;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "Ldq;")
    public static class595 field3335 = new class595();

    @OriginalMember(owner = "client!vn", name = "v", descriptor = "[[I")
    public static int[][] field3347 = new int[6][];

    @OriginalMember(owner = "client!vn", name = "w", descriptor = "I")
    public static int field3348 = 0;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!vn", name = "u", descriptor = "I")
    public int field3346;

    @OriginalMember(owner = "client!vn", name = "x", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "Ldd;")
    public static class601 field3340;

    @OriginalMember(owner = "client!vn", name = "p", descriptor = "Liv;")
    public class81 field3341;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILos;)V", line = 12)
    public final void method1452(int arg0, class374 arg1) {
        if (arg0 != -1) {
            return;
        }
        while (true) {
            int var3 = arg1.method2129(-116);
            if (var3 == 0) {
                field3326++;
                return;
            }
            this.method1457(arg1, var3, arg0 - 12);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V", line = 44)
    public static final void method1453(int arg0) {
        field3329++;
        if (class40.field313 > 0) {
            int var1 = 0;
            for (int var2 = 0; var2 < class330.field4302.length; var2++) {
                if (class330.field4302[var2].startsWith("--> ")) {
                    int var10000 = ~class40.field313;
                    var1++;
                    if (var10000 == ~var1) {
                        class279.field3671 = class330.field4302[var2].substring(4);
                        break;
                    }
                }
            }
        } else {
            class279.field3671 = "";
        }
        if (arg0 != 2603) {
            field3335 = null;
        }
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V", line = 81)
    public final void method1454(int arg0) {
        field3327++;
        this.field3339 = this.field3346 | this.field3339 << 8;
        if (this.field3338 == -1) {
            this.field3338 = this.field3336;
        }
        if (arg0 != -1226) {
            this.method1454(-7);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V", line = 110)
    public static void method1455(byte arg0) {
        int var1 = -75 / ((arg0 + 44) / 59);
        field3347 = null;
        field3335 = null;
        field3340 = null;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(III)Z", line = 123)
    public static final boolean method1456(int arg0, int arg1, int arg2) {
        int var3 = -106 / ((58 - arg1) / 63);
        field3328++;
        return (arg2 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Los;II)V", line = 133)
    private final void method1457(class374 arg0, int arg1, int arg2) {
        if (arg2 != -13) {
            this.method1454(-54);
        }
        if (arg1 == 1) {
            this.field3332 = class615.method3536(true, arg0.method2128(true));
        } else if (arg1 == 2) {
            this.field3336 = arg0.method2129(-69);
        } else if (arg1 == 3) {
            this.field3336 = arg0.method2136(false);
            if (this.field3336 == 65535) {
                this.field3336 = -1;
            }
        } else if (arg1 == 5) {
            this.field3342 = false;
        } else if (arg1 == 7) {
            this.field3343 = class615.method3536(true, arg0.method2128(true));
        } else if (arg1 == 8) {
            this.field3341.field978 = this.field3346;
        } else if (arg1 == 9) {
            this.field3334 = arg0.method2136(false) << 0;
        } else if (arg1 == 10) {
            this.field3344 = false;
        } else if (arg1 == 11) {
            this.field3339 = arg0.method2129(-81);
        } else if (arg1 == 12) {
            this.field3330 = true;
        } else if (arg1 == 13) {
            this.field3345 = arg0.method2128(true);
        } else if (arg1 == 14) {
            this.field3333 = arg0.method2129(-111) << 0;
        } else if (arg1 == 15) {
            this.field3338 = arg0.method2136(false);
            if (this.field3338 == 65535) {
                this.field3338 = -1;
            }
        } else if (arg1 == 16) {
            this.field3331 = arg0.method2129(-64);
        }
        field3337++;
    }
}
