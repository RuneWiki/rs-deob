import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class261 {

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public int field4268 = -1;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public int field4270 = -1;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public int field4272 = -1;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public int field4273 = -1;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public int field4275 = -1;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public int field4278 = -1;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public int field4279 = 0;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public int field4269 = -1;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public int field4277 = -1;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "I")
    public int field4281 = -1;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "I")
    public int field4284 = -1;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public int field4274 = -1;

    @OriginalMember(owner = "client!s", name = "y", descriptor = "I")
    public int field4291 = 0;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "I")
    public int field4280 = 0;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "I")
    public int field4282 = -1;

    @OriginalMember(owner = "client!s", name = "C", descriptor = "I")
    public int field4295 = 0;

    @OriginalMember(owner = "client!s", name = "F", descriptor = "I")
    public int field4298 = -1;

    @OriginalMember(owner = "client!s", name = "B", descriptor = "I")
    public int field4294 = 0;

    @OriginalMember(owner = "client!s", name = "G", descriptor = "I")
    public int field4299 = -1;

    @OriginalMember(owner = "client!s", name = "H", descriptor = "I")
    public int field4300 = 0;

    @OriginalMember(owner = "client!s", name = "u", descriptor = "I")
    public int field4287 = 0;

    @OriginalMember(owner = "client!s", name = "s", descriptor = "I")
    public int field4285 = -1;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public int field4276 = -1;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public int field4271 = -1;

    @OriginalMember(owner = "client!s", name = "D", descriptor = "I")
    public int field4296 = -1;

    @OriginalMember(owner = "client!s", name = "v", descriptor = "I")
    public int field4288 = 0;

    @OriginalMember(owner = "client!s", name = "M", descriptor = "I")
    public int field4305 = -1;

    @OriginalMember(owner = "client!s", name = "K", descriptor = "I")
    public int field4303 = -1;

    @OriginalMember(owner = "client!s", name = "J", descriptor = "I")
    public int field4302 = -1;

    @OriginalMember(owner = "client!s", name = "t", descriptor = "I")
    public int field4286 = 0;

    @OriginalMember(owner = "client!s", name = "I", descriptor = "I")
    public int field4301 = -1;

    @OriginalMember(owner = "client!s", name = "E", descriptor = "I")
    public int field4297 = 0;

    @OriginalMember(owner = "client!s", name = "P", descriptor = "I")
    public int field4308 = -1;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "[I")
    public static int[] field4267 = new int[1000];

    @OriginalMember(owner = "client!s", name = "z", descriptor = "[I")
    public static int[] field4292 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!s", name = "N", descriptor = "Z")
    public static boolean field4306 = false;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!s", name = "w", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!s", name = "x", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!s", name = "A", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!s", name = "L", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!s", name = "O", descriptor = "[[I")
    public int[][] field4307;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lma;B)V")
    public final void method1806(class202 arg0, byte arg1) {
        field4289++;
        if (arg1 <= 17) {
            this.method1807(4, (class202) null, -102);
        }
        while (true) {
            int var3 = arg0.method1420((byte) 0);
            if (var3 == 0) {
                return;
            }
            this.method1807(var3, arg0, -21632);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILma;I)V")
    private final void method1807(int arg0, class202 arg1, int arg2) {
        if (arg2 != -21632) {
            this.field4299 = -75;
        }
        if (arg0 == 1) {
            this.field4282 = arg1.method1419(105);
            this.field4276 = arg1.method1419(105);
            if (this.field4276 == 65535) {
                this.field4276 = -1;
            }
            if (this.field4282 == 65535) {
                this.field4282 = -1;
            }
        } else if (arg0 == 2) {
            this.field4308 = arg1.method1419(100);
        } else if (arg0 == 3) {
            this.field4281 = arg1.method1419(118);
        } else if (arg0 == 4) {
            this.field4275 = arg1.method1419(80);
        } else if (arg0 == 5) {
            this.field4272 = arg1.method1419(109);
        } else if (arg0 == 6) {
            this.field4299 = arg1.method1419(112);
        } else if (arg0 == 7) {
            this.field4278 = arg1.method1419(127);
        } else if (arg0 == 8) {
            this.field4305 = arg1.method1419(105);
        } else if (arg0 == 9) {
            this.field4302 = arg1.method1419(115);
        } else if (arg0 == 26) {
            this.field4297 = (short) (arg1.method1420((byte) 0) * 4);
            this.field4291 = (short) (arg1.method1420((byte) 0) * 4);
        } else if (arg0 == 27) {
            if (this.field4307 == null) {
                this.field4307 = new int[12][];
            }
            int var4 = arg1.method1420((byte) 0);
            this.field4307[var4] = new int[6];
            for (int var5 = 0; var5 < 6; var5++) {
                this.field4307[var4][var5] = arg1.method1442(-1970239824);
            }
        } else if (arg0 == 29) {
            this.field4300 = arg1.method1420((byte) 0);
        } else if (arg0 == 30) {
            this.field4287 = arg1.method1419(107);
        } else if (arg0 == 31) {
            this.field4295 = arg1.method1420((byte) 0);
        } else if (arg0 == 32) {
            this.field4294 = arg1.method1419(arg2 ^ 0xFFFFABFA);
        } else if (arg0 == 33) {
            this.field4286 = arg1.method1442(-1970239824);
        } else if (arg0 == 34) {
            this.field4279 = arg1.method1420((byte) 0);
        } else if (arg0 == 35) {
            this.field4288 = arg1.method1419(99);
        } else if (arg0 == 36) {
            this.field4280 = arg1.method1442(-1970239824);
        } else if (arg0 == 37) {
            this.field4268 = arg1.method1420((byte) 0);
        } else if (arg0 == 38) {
            this.field4274 = arg1.method1419(122);
        } else if (arg0 == 39) {
            this.field4269 = arg1.method1419(arg2 + 21727);
        } else if (arg0 == 40) {
            this.field4298 = arg1.method1419(79);
        } else if (arg0 == 41) {
            this.field4277 = arg1.method1419(96);
        } else if (arg0 == 42) {
            this.field4284 = arg1.method1419(78);
        } else if (arg0 == 43) {
            arg1.method1419(94);
        } else if (arg0 == 44) {
            arg1.method1419(82);
        } else if (arg0 == 45) {
            this.field4301 = arg1.method1419(70);
        } else if (arg0 == 46) {
            this.field4273 = arg1.method1419(82);
        } else if (arg0 == 47) {
            this.field4285 = arg1.method1419(73);
        } else if (arg0 == 48) {
            this.field4270 = arg1.method1419(64);
        } else if (arg0 == 49) {
            this.field4271 = arg1.method1419(101);
        } else if (arg0 == 50) {
            this.field4303 = arg1.method1419(arg2 + 21717);
        } else if (arg0 == 51) {
            this.field4296 = arg1.method1419(arg2 ^ 0xFFFFABE4);
        }
        field4283++;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)Lli;")
    public static final class314 method1808(int arg0) {
        field4290++;
        if (class13.field166 == null) {
            return null;
        }
        if (arg0 != -10883) {
            field4267 = null;
        }
        class211.field3385.method132(arg0 ^ 0x2AEB, class13.field166);
        class314 var1 = (class314) class211.field3385.method130(29147);
        class195 var2 = class192.method1334(false, var1.field5051);
        return var2 != null && var2.field3083 && var2.method1354(true) ? var1 : class141.method935(arg0 - 18860);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIZ)I")
    public static final int method1809(int arg0, int arg1, boolean arg2) {
        field4293++;
        int var3 = 0;
        while (arg0 > 0) {
            var3 = var3 << 1 | arg1 & 0x1;
            arg1 >>>= 0x1;
            arg0--;
        }
        if (arg2) {
            field4292 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
    public static void method1810(byte arg0) {
        field4267 = null;
        int var1 = 40 / ((arg0 - 2) / 39);
        field4292 = null;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
    public final void method1811(int arg0) {
        if (arg0 == -4667) {
            field4304++;
        }
    }
}
