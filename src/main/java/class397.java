import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class397 {

    @OriginalMember(owner = "client!lv", name = "j", descriptor = "I")
    public int field6072;

    @OriginalMember(owner = "client!lv", name = "i", descriptor = "S")
    public short field6071;

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "Z")
    public boolean field6066;

    @OriginalMember(owner = "client!lv", name = "l", descriptor = "B")
    public byte field6074;

    @OriginalMember(owner = "client!lv", name = "g", descriptor = "S")
    public short field6069;

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "S")
    public short field6067;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "B")
    public byte field6063;

    @OriginalMember(owner = "client!lv", name = "m", descriptor = "[J")
    public static long[] field6075 = new long[256];

    @OriginalMember(owner = "client!lv", name = "n", descriptor = "Lvv;")
    public static class313 field6076;

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "I")
    public static int field6064;

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!lv", name = "f", descriptor = "I")
    public static int field6068;

    @OriginalMember(owner = "client!lv", name = "h", descriptor = "I")
    public static int field6070;

    @OriginalMember(owner = "client!lv", name = "k", descriptor = "[I")
    public static int[] field6073;

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
            field6075[var0] = var1;
        }
        field6076 = new class313(112, -2);
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(B)V", line = 6)
    public static final void method2480(byte arg0) {
        class333.field5246 = 0;
        class420.field6346 = -1;
        field6065++;
        class314.field4946 = -1;
        if (arg0 == 5) {
            class482.field7087 = -1;
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)V", line = 25)
    public static void method2481(int arg0) {
        if (arg0 != -933) {
            field6076 = null;
        }
        field6075 = null;
        field6073 = null;
        field6076 = null;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(JI)V", line = 37)
    public static final void method2482(long arg0, int arg1) {
        field6064++;
        int var3 = class363.field5662 + class302.field4850.field4716;
        int var4 = class374.field5776 + class302.field4850.field4714;
        if ((class165.field2606 - var3) < -500 || class165.field2606 - var3 > 500 || (class139.field2318 - var4) < -500 || (class139.field2318 - var4) > 500) {
            class139.field2318 = var4;
            class165.field2606 = var3;
        }
        if (class165.field2606 != var3) {
            int var5 = var3 - class165.field2606;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var6 < var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var5 < var6) {
                var6 = var5;
            }
            class165.field2606 += var6;
        }
        if (arg1 < 41) {
            field6073 = null;
        }
        if (!class510.field7403.field5116) {
            class509.field7395 += (float) arg0 * class380.field5886 / 6.0F;
            class88.field1483 += (float) arg0 * class100.field1663 / 6.0F;
        }
        if (class139.field2318 != var4) {
            int var7 = var4 - class139.field2318;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class139.field2318 += var8;
        }
        class249.method1690(-4);
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IIIII)Llv;", line = 132)
    public final class397 method2483(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6070++;
        if (arg3 != 12721) {
            method2484(56, 32, 40, (byte) 4);
        }
        return new class397(arg0, arg4, arg2, arg1, this.field6067, this.field6069, this.field6071, this.field6074, this.field6063, this.field6066);
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IIIB)I", line = 146)
    public static final int method2484(int arg0, int arg1, int arg2, byte arg3) {
        field6068++;
        if (arg1 == arg2) {
            return arg1;
        }
        if (arg3 >= -92) {
            method2480((byte) -61);
        }
        int var4 = 128 - arg0;
        int var5 = (arg1 & 0x7F) * var4 + ((arg2 & 0x7F) * arg0) >> 7;
        int var6 = (arg1 & 0x380) * var4 + (arg2 & 0x380) * arg0 >> 7;
        int var7 = (arg1 & 0xFC00) * var4 + (arg2 & 0xFC00) * arg0 >> 7;
        return var5 & 0x7F | var7 & 0xFC00 | var6 & 0x380;
    }

    @OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(IIIIIIIIIZ)V", line = 201)
    public class397(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field6072 = arg0;
        this.field6071 = (short) arg6;
        this.field6066 = arg9;
        this.field6074 = (byte) arg7;
        this.field6069 = (short) arg5;
        this.field6067 = (short) arg4;
        this.field6063 = (byte) arg8;
    }
}
