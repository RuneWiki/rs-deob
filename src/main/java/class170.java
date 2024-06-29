import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class170 {

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    private int field2416 = 0;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "Z")
    public boolean field2427 = true;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
    public int field2428 = -1;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "I")
    public int field2431 = 128;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static volatile int field2418 = 0;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "[I")
    public static int[] field2425 = new int[4096];

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "I")
    public static int field2429 = -14475237;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
    public static int field2426 = 0;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public int field2415;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public int field2419;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public int field2421;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public int field2422;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIZIII)V", line = 5)
    public static final void method1145(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field2414++;
        if (arg0 < 1) {
            arg0 = 1;
        }
        if (arg4 < 1) {
            arg4 = 1;
        }
        int var6 = arg4 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class223.field2995 - class181.field2538) * var6 / 100 + class181.field2538;
        if (var7 < class105.field1576) {
            var7 = class105.field1576;
        } else if (class140.field2003 < var7) {
            var7 = class140.field2003;
        }
        int var8 = arg4 * 512 * var7 / (arg0 * 334);
        if (var8 < class401.field5850) {
            short var12 = class401.field5850;
            var7 = arg0 * var12 * 334 / (arg4 * 512);
            if (var7 > class140.field2003) {
                var7 = class140.field2003;
                int var13 = arg4 * var7 * 512 / (var12 * 334);
                int var14 = (arg0 - var13) / 2;
                if (arg2) {
                    class408.field5920.method1812();
                    class408.field5920.method1762(arg1, arg4, arg3, -16777216, var14, -1);
                    class408.field5920.method1762(arg1, arg4, arg0 + arg3 - var14, -16777216, var14, -1);
                }
                arg0 -= var14 * 2;
                arg3 += var14;
            }
        } else if (var8 > class167.field2385) {
            short var9 = class167.field2385;
            var7 = var9 * 334 * arg0 / (arg4 * 512);
            if (var7 < class105.field1576) {
                var7 = class105.field1576;
                int var10 = arg0 * var9 * 334 / (var7 * 512);
                int var11 = (arg4 - var10) / 2;
                if (arg2) {
                    class408.field5920.method1812();
                    class408.field5920.method1762(arg1, var11, arg3, -16777216, arg0, ~arg5);
                    class408.field5920.method1762(arg1 + arg4 - var11, var11, arg3, -16777216, arg0, -1);
                }
                arg1 += var11;
                arg4 -= var11 * 2;
            }
        }
        class105.field1574 = arg1;
        class9.field141 = (short) arg0;
        class290.field4003 = arg3;
        class28.field453 = arg4 * var7 / 334;
        class16.field195 = (short) arg4;
        if (arg5 != 0) {
            field2426 = -22;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lqj;BLqj;)I", line = 98)
    public static final int method1146(class296 arg0, byte arg1, class296 arg2) {
        field2420++;
        int var3 = 0;
        if (arg0.method1898(class153.field2163, 125)) {
            var3++;
        }
        if (arg0.method1898(class8.field121, 126)) {
            var3++;
        }
        if (arg0.method1898(class132.field1838, 125)) {
            var3++;
        }
        if (arg2.method1898(class153.field2163, 125)) {
            var3++;
        }
        if (arg1 != -76) {
            field2429 = 45;
        }
        if (arg2.method1898(class8.field121, 124)) {
            var3++;
        }
        if (arg2.method1898(class132.field1838, 126)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V", line = 132)
    public static final void method1147(byte arg0) {
        if (arg0 > -96) {
            field2426 = -10;
        }
        class390.field5740 = 0;
        field2417++;
        class167.field2393.method1315(121);
        class349.field4882 = false;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIILeb;)V", line = 148)
    private final void method1148(int arg0, int arg1, int arg2, class371 arg3) {
        field2413++;
        if (arg2 == 1) {
            this.field2416 = arg3.method2425(-125);
            this.method1150(this.field2416, true);
        } else if (arg2 == 2) {
            this.field2428 = arg3.method2403((byte) 91);
            if (this.field2428 == 65535) {
                this.field2428 = -1;
            }
        } else if (arg2 == 3) {
            this.field2431 = arg3.method2403((byte) 117);
        } else if (arg2 == 4) {
            this.field2427 = false;
        }
        if (arg0 != 4096) {
            this.method1148(77, 124, 92, (class371) null);
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)V", line = 213)
    public static void method1149(byte arg0) {
        if (arg0 == -71) {
            field2425 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZ)V", line = 224)
    private final void method1150(int arg0, boolean arg1) {
        field2423++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        this.field2421 = (int) (var17 * 256.0D);
        this.field2422 = (int) (var15 * 256.0D);
        if (!arg1) {
            method1146((class296) null, (byte) -90, (class296) null);
        }
        double var19 = var13 / 6.0D;
        if (this.field2422 < 0) {
            this.field2422 = 0;
        } else if (this.field2422 > 255) {
            this.field2422 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field2419 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field2419 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field2421 < 0) {
            this.field2421 = 0;
        } else if (this.field2421 > 255) {
            this.field2421 = 255;
        }
        if (this.field2419 < 1) {
            this.field2419 = 1;
        }
        this.field2415 = (int) ((double) this.field2419 * var19);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IILeb;)V", line = 316)
    public final void method1151(int arg0, int arg1, class371 arg2) {
        if (arg1 >= -47) {
            return;
        }
        field2424++;
        while (true) {
            int var4 = arg2.method2429(0);
            if (var4 == 0) {
                return;
            }
            this.method1148(4096, arg0, var4, arg2);
        }
    }
}
