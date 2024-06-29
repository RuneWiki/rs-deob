import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class282 {

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "Z")
    public boolean field4666 = false;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public int field4676 = 0;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    public int field4679 = 8;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public int field4669 = 1190717;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "Z")
    public boolean field4671 = true;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "I")
    public int field4683 = -1;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "Z")
    public boolean field4680 = true;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "I")
    public int field4685 = 16;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public int field4672 = 128;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
    public int field4681 = -1;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "Lph;")
    public static class229 field4673 = class266.method1858("::fps ", 0);

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "[J")
    public static long[] field4682 = new long[100];

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "Lph;")
    public static class229 field4687 = class266.method1858("Continuer", 0);

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "Lph;")
    private static class229 field4688 = class266.method1858("Discard", 0);

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "Lph;")
    public static class229 field4677 = field4688;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field4675 = 0;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "[Lpc;")
    public static class14[] field4678;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIBII)V", line = 4)
    public static final void method1938(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class214.field3533 = arg0;
        field4684++;
        class206.field3398 = arg1;
        if (arg2 >= -6) {
            method1938(-31, 18, (byte) 50, -70, 108);
        }
        class77.field1289 = arg4;
        class192.field3172 = arg3;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZI)I", line = 19)
    public static final int method1939(boolean arg0, int arg1) {
        if (arg0) {
            method1942((byte) 100, (class301) null);
        }
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        field4686++;
        double var4 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        double var10 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        double var12 = 0.0D;
        if (var8 > var6) {
            var8 = var6;
        }
        double var14 = 0.0D;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        int var18 = (int) (var14 * 256.0D);
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        double var19 = var12 / 6.0D;
        int var21 = (int) (var19 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var18 >>= 0x4;
        } else if (var22 > 217) {
            var18 >>= 0x3;
        } else if (var22 > 192) {
            var18 >>= 0x2;
        } else if (var22 > 179) {
            var18 >>= 0x1;
        }
        return (var21 >> 2 << 10) + (var22 >> 1) + (var18 >> 5 << 7);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V", line = 136)
    public static void method1940(boolean arg0) {
        field4687 = null;
        field4673 = null;
        field4677 = null;
        if (arg0) {
            field4682 = null;
            field4678 = null;
            field4688 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lhb;II)V", line = 155)
    public final void method1941(class164 arg0, int arg1, int arg2) {
        field4670++;
        while (true) {
            int var4 = arg0.method1178(arg1 ^ 0x3653);
            if (var4 == 0) {
                if (arg1 != 13915) {
                    this.method1941((class164) null, -34, 46);
                }
                return;
            }
            this.method1943(0, arg2, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BLri;)Lri;", line = 177)
    public static final class301 method1942(byte arg0, class301 arg1) {
        field4667++;
        if (arg1.field5040 != -1) {
            return class206.method1440(arg1.field5040, (byte) -68);
        }
        int var2 = arg1.field4948 >>> 16;
        class200 var3 = new class200(class251.field4176);
        for (class48 var4 = (class48) var3.method1401(1); var4 != null; var4 = (class48) var3.method1403(arg0 + 120)) {
            if (var4.field700 == var2) {
                return class206.method1440((int) var4.field1325, (byte) -68);
            }
        }
        if (arg0 != -121) {
            method1938(-88, 96, (byte) -100, -49, -54);
        }
        return null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIILhb;)V", line = 215)
    private final void method1943(int arg0, int arg1, int arg2, class164 arg3) {
        field4674++;
        if (arg0 != 0) {
            return;
        }
        if (arg2 == 1) {
            this.field4676 = class101.method776(arg3.method1176(1048115912), 64);
        } else if (arg2 == 2) {
            this.field4681 = arg3.method1178(8);
        } else if (arg2 == 3) {
            this.field4681 = arg3.method1161(true);
            if (this.field4681 == 65535) {
                this.field4681 = -1;
            }
        } else if (arg2 == 5) {
            this.field4671 = false;
        } else if (arg2 == 7) {
            this.field4683 = class101.method776(arg3.method1176(arg0 + 1048115912), 64);
        } else if (arg2 == 8) {
            class129.field2123 = arg1;
        } else if (arg2 == 9) {
            this.field4672 = arg3.method1161(true);
        } else if (arg2 == 10) {
            this.field4680 = false;
        } else if (arg2 == 11) {
            this.field4679 = arg3.method1178(8);
        } else if (arg2 == 12) {
            this.field4666 = true;
        } else if (arg2 == 13) {
            this.field4669 = arg3.method1176(1048115912);
        } else if (arg2 == 14) {
            this.field4685 = arg3.method1178(8);
        }
    }
}
