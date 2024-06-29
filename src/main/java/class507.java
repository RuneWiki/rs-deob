import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class507 {

    @OriginalMember(owner = "client!iu", name = "g", descriptor = "Z")
    public boolean field7361 = true;

    @OriginalMember(owner = "client!iu", name = "h", descriptor = "I")
    public int field7362 = 512;

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "I")
    private int field7356 = 0;

    @OriginalMember(owner = "client!iu", name = "o", descriptor = "I")
    public int field7369 = -1;

    @OriginalMember(owner = "client!iu", name = "m", descriptor = "Z")
    public boolean field7367 = true;

    @OriginalMember(owner = "client!iu", name = "p", descriptor = "Lhe;")
    public static class573 field7370 = new class573("WTRC", 1);

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "I")
    public static int field7355;

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "I")
    public static int field7357;

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "I")
    public static int field7358;

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "I")
    public int field7359;

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "I")
    public static int field7360;

    @OriginalMember(owner = "client!iu", name = "i", descriptor = "I")
    public static int field7363;

    @OriginalMember(owner = "client!iu", name = "j", descriptor = "I")
    public int field7364;

    @OriginalMember(owner = "client!iu", name = "k", descriptor = "I")
    public static int field7365;

    @OriginalMember(owner = "client!iu", name = "l", descriptor = "I")
    public int field7366;

    @OriginalMember(owner = "client!iu", name = "n", descriptor = "I")
    public int field7368;

    @OriginalMember(owner = "client!iu", name = "q", descriptor = "I")
    public static int field7371;

    @OriginalMember(owner = "client!iu", name = "r", descriptor = "I")
    public static int field7372;

    @OriginalMember(owner = "client!iu", name = "s", descriptor = "I")
    public static int field7373;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(BLsl;)V", line = 7)
    public final void method3089(byte arg0, class479 arg1) {
        field7357++;
        int var3 = -17 % ((30 - arg0) / 42);
        while (true) {
            int var4 = arg1.method2886(true);
            if (var4 == 0) {
                return;
            }
            this.method3092((byte) -95, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)I", line = 28)
    public static final int method3090(int arg0) {
        field7358++;
        if (class147.field2154) {
            return 6;
        } else if (class242.field3576 == null) {
            return 0;
        } else {
            int var1 = class242.field3576.field4152;
            if (class618.method3588(122, var1)) {
                return 1;
            }
            if (arg0 != 1) {
                field7370 = null;
            }
            if (class238.method1657(var1, -52)) {
                return 2;
            } else if (class503.method3076(var1, (byte) 112)) {
                return 3;
            } else if (class145.method1017(var1, 98)) {
                return 4;
            } else {
                return 5;
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIILeda;IIIIIILcga;)V", line = 64)
    public static final void method3091(int arg0, int arg1, int arg2, int arg3, class14 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class141 arg11) {
        class624.field8867 = arg1;
        class606.field8592 = arg5;
        class347.field5124 = arg9;
        class583.field8315 = arg7;
        if (arg0 != -65536) {
            return;
        }
        class404.field5762 = arg10;
        class413.field5882 = arg11;
        class625.field8881 = arg2;
        class574.field8268 = arg3;
        field7365++;
        class40.field680 = null;
        class189.field2643 = arg4;
        class350.field5197 = arg8;
        class205.field3092 = arg6;
        class542.field7868 = null;
        class463.field6618 = null;
        class192.method1359(arg0 ^ 0xFFFF0033);
        class694.field9824 = true;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(BILsl;)V", line = 91)
    private final void method3092(byte arg0, int arg1, class479 arg2) {
        if (arg0 != -95) {
            this.field7361 = true;
        }
        if (arg1 == 1) {
            this.field7356 = arg2.method2865(255);
            this.method3096((byte) 89, this.field7356);
        } else if (arg1 == 2) {
            this.field7369 = arg2.method2882(-1);
            if (this.field7369 == 65535) {
                this.field7369 = -1;
            }
        } else if (arg1 == 3) {
            this.field7362 = arg2.method2882(-1) << 2;
        } else if (arg1 == 4) {
            this.field7367 = false;
        } else if (arg1 == 5) {
            this.field7361 = false;
        }
        field7371++;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)V", line = 134)
    public static void method3093(byte arg0) {
        field7370 = null;
        if (arg0 <= 13) {
            field7370 = null;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 153)
    public static final boolean method3094(String arg0, int arg1) {
        field7373++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = arg1; var2 < class386.field5583; var2++) {
            if (arg0.equalsIgnoreCase(class196.field2860[var2])) {
                return true;
            }
        }
        return arg0.equalsIgnoreCase(class108.field1536.field9056);
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(B)V", line = 182)
    public static final void method3095(byte arg0) {
        field7363++;
        int var1 = -103 / ((arg0 + 75) / 41);
        for (class279 var2 = (class279) class154.field2233.method3565(107); var2 != null; var2 = (class279) class154.field2233.method3561((byte) 67)) {
            if (var2.field3909 > 0) {
                var2.field3909--;
            }
            if (var2.field3909 != 0) {
                if (var2.field3898 > 0) {
                    var2.field3898--;
                }
                if (var2.field3898 == 0 && var2.field3906 >= 1 && var2.field3901 >= 1 && class184.field2546 - 2 >= var2.field3906 && var2.field3901 <= (class240.field3555 - 2) && (var2.field3910 < 0 || class87.method690(false, var2.field3910, var2.field3900))) {
                    class729.method4068(var2.field3910, var2.field3900, var2.field3907, -1, var2.field3899, -1, var2.field3902, var2.field3906, var2.field3901);
                    var2.field3898 = -1;
                    if (var2.field3910 == var2.field3908 && var2.field3908 == -1) {
                        var2.method2656((byte) 120);
                    } else if (var2.field3910 == var2.field3908 && var2.field3903 == var2.field3902 && var2.field3911 == var2.field3900) {
                        var2.method2656((byte) 117);
                    }
                }
            } else if (var2.field3908 < 0 || class87.method690(false, var2.field3908, var2.field3911)) {
                class729.method4068(var2.field3908, var2.field3911, var2.field3907, -1, var2.field3899, -1, var2.field3903, var2.field3906, var2.field3901);
                var2.method2656((byte) 127);
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(BI)V", line = 238)
    private final void method3096(byte arg0, int arg1) {
        field7355++;
        double var3 = (double) ((arg1 & 0xFF0485) >> 16) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        if (arg0 != 89) {
            this.field7369 = 3;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        double var19 = var13 / 6.0D;
        this.field7366 = (int) (var15 * 256.0D);
        this.field7364 = (int) (var17 * 256.0D);
        if ((var17 > 0.5D)) {
            this.field7359 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field7359 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field7366 < 0) {
            this.field7366 = 0;
        } else if (this.field7366 > 255) {
            this.field7366 = 255;
        }
        if (this.field7364 < 0) {
            this.field7364 = 0;
        } else if (this.field7364 > 255) {
            this.field7364 = 255;
        }
        if (this.field7359 < 1) {
            this.field7359 = 1;
        }
        this.field7368 = (int) ((double) this.field7359 * var19);
    }
}
