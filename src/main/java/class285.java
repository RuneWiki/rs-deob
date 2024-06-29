import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class285 extends class65 {

    @OriginalMember(owner = "client!qaa", name = "u", descriptor = "I")
    public int field4391;

    @OriginalMember(owner = "client!qaa", name = "o", descriptor = "I")
    public int field4385;

    @OriginalMember(owner = "client!qaa", name = "r", descriptor = "[J")
    public static long[] field4388 = new long[256];

    @OriginalMember(owner = "client!qaa", name = "s", descriptor = "I")
    public static int field4389 = -2;

    @OriginalMember(owner = "client!qaa", name = "x", descriptor = "F")
    public static float field4394 = 0.0F;

    @OriginalMember(owner = "client!qaa", name = "w", descriptor = "I")
    public static int field4393 = 16777215;

    @OriginalMember(owner = "client!qaa", name = "y", descriptor = "Z")
    public static boolean field4395;

    @OriginalMember(owner = "client!qaa", name = "k", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!qaa", name = "l", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!qaa", name = "m", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!qaa", name = "n", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!qaa", name = "p", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!qaa", name = "q", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!qaa", name = "t", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!qaa", name = "v", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "(II)Z")
    public final boolean method1864(int arg0, int arg1) {
        field4382++;
        if (arg0 == 2362) {
            return (this.field4391 >> arg1 + 1 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)Z")
    public final boolean method1865(int arg0) {
        if (arg0 == -18211) {
            field4392++;
            return (this.field4391 >> 22 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "(I)I")
    public final int method1866(int arg0) {
        field4383++;
        return arg0 == 1092 ? class140.method1096(this.field4391, 260351) : -54;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(B)Z")
    public final boolean method1867(byte arg0) {
        field4386++;
        if (arg0 != -86) {
            this.field4391 = -46;
        }
        return (this.field4391 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!qaa", name = "e", descriptor = "(B)V")
    public static void method1868(byte arg0) {
        if (arg0 < -103) {
            field4388 = null;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "(I)I")
    public final int method1869(int arg0) {
        if (arg0 != -1752334894) {
            this.method1865(-102);
        }
        field4387++;
        return (this.field4391 & 0x1FA088) >> 18;
    }

    @OriginalMember(owner = "client!qaa", name = "f", descriptor = "(I)Z")
    public final boolean method1870(int arg0) {
        if (arg0 != 8657) {
            this.method1865(25);
        }
        field4390++;
        return (this.field4391 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!qaa", name = "g", descriptor = "(I)Z")
    public static final boolean method1871(int arg0) {
        field4384++;
        if (arg0 == 1023) {
            return class442.field6421 != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(II)V")
    public class285(int arg0, int arg1) {
        this.field4391 = arg0;
        this.field4385 = arg1;
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
            field4388[var0] = var1;
        }
        field4395 = false;
    }
}
