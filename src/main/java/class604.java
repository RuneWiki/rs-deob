import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class604 {

    @OriginalMember(owner = "client!un", name = "a", descriptor = "Z")
    private boolean field8246 = false;

    @OriginalMember(owner = "client!un", name = "r", descriptor = "I")
    public int field8263 = 0;

    @OriginalMember(owner = "client!un", name = "u", descriptor = "I")
    public int field8266 = 0;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "Lnc;")
    public static class580 field8250 = new class580();

    @OriginalMember(owner = "client!un", name = "t", descriptor = "[J")
    public static long[] field8265 = new long[256];

    @OriginalMember(owner = "client!un", name = "b", descriptor = "I")
    public static int field8247;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "I")
    public int field8248;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "I")
    private int field8249;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "I")
    public int field8251;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "I")
    public int field8252;

    @OriginalMember(owner = "client!un", name = "h", descriptor = "I")
    public int field8253;

    @OriginalMember(owner = "client!un", name = "i", descriptor = "I")
    public int field8254;

    @OriginalMember(owner = "client!un", name = "j", descriptor = "I")
    public static int field8255;

    @OriginalMember(owner = "client!un", name = "k", descriptor = "I")
    public static int field8256;

    @OriginalMember(owner = "client!un", name = "l", descriptor = "I")
    public static int field8257;

    @OriginalMember(owner = "client!un", name = "m", descriptor = "I")
    public int field8258;

    @OriginalMember(owner = "client!un", name = "n", descriptor = "I")
    public static int field8259;

    @OriginalMember(owner = "client!un", name = "o", descriptor = "I")
    public int field8260;

    @OriginalMember(owner = "client!un", name = "p", descriptor = "I")
    public int field8261;

    @OriginalMember(owner = "client!un", name = "q", descriptor = "I")
    public int field8262;

    @OriginalMember(owner = "client!un", name = "v", descriptor = "I")
    public static int field8267;

    @OriginalMember(owner = "client!un", name = "s", descriptor = "J")
    public long field8264;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Z)V")
    public final void method3338(boolean arg0) {
        if (!arg0) {
            this.method3341((byte) -23, null, -121);
        }
        field8256++;
        this.field8260 = class654.field9260[this.field8249 << 3];
        this.field8252 = (int) Math.sqrt((double) (this.field8254 * this.field8254 + this.field8258 * this.field8258 + this.field8253 * this.field8253));
        if (this.field8251 == 0) {
            this.field8251 = 1;
        }
        if (this.field8261 == 0) {
            this.field8264 = 2147483647L;
        } else if (this.field8261 == 1) {
            this.field8264 = (this.field8252 * 8 / this.field8251);
            this.field8264 *= this.field8264;
        } else if (this.field8261 == 2) {
            this.field8264 = (this.field8252 * 8 / this.field8251);
        }
        if (this.field8246) {
            this.field8252 *= -1;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V")
    public static void method3339(int arg0) {
        if (arg0 == 3143) {
            field8265 = null;
            field8250 = null;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Lll;I)I")
    public static final int method3340(class114 arg0, int arg1) {
        field8247++;
        if (arg1 >= -14) {
            field8250 = null;
        }
        if (class495.field6694 == arg0) {
            return 9216;
        } else if (class202.field2643 == arg0) {
            return 34065;
        } else if (class394.field5646 == arg0) {
            return 34066;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(BLdga;I)V")
    private final void method3341(byte arg0, class138 arg1, int arg2) {
        field8259++;
        if (arg2 == 1) {
            this.field8249 = arg1.method922((byte) -118);
        } else if (arg2 == 2) {
            arg1.method957((byte) -101);
        } else if (arg2 == 3) {
            this.field8253 = arg1.method943(-98);
            this.field8258 = arg1.method943(-108);
            this.field8254 = arg1.method943(-91);
        } else if (arg2 == 4) {
            this.field8261 = arg1.method957((byte) -114);
            this.field8251 = arg1.method943(-88);
        } else if (arg2 == 6) {
            this.field8262 = arg1.method957((byte) -128);
        } else if (arg2 == 8) {
            this.field8263 = 1;
        } else if (arg2 == 9) {
            this.field8266 = 1;
        } else if (arg2 == 10) {
            this.field8246 = true;
        }
        int var4 = 115 / ((arg0 + 54) / 35);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "([ILpq;ILpq;)V")
    public static final void method3342(int[] arg0, class159 arg1, int arg2, class159 arg3) {
        if (arg0 != null) {
            class376.field5407 = arg0;
        }
        class284.field3836 = arg3;
        class482.field6486 = arg1;
        field8257++;
        if (arg2 != 9216) {
            method3339(-10);
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Ldga;B)V")
    public final void method3343(class138 arg0, byte arg1) {
        if (arg1 <= 15) {
            this.field8258 = -121;
        }
        field8255++;
        while (true) {
            int var3 = arg0.method957((byte) -69);
            if (var3 == 0) {
                return;
            }
            this.method3341((byte) -98, arg0, var3);
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field8265[var0] = var1;
        }
    }
}
