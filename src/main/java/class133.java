import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class133 {

    @OriginalMember(owner = "client!of", name = "j", descriptor = "Lmd;")
    private class113 field2548 = new class113(256);

    @OriginalMember(owner = "client!of", name = "t", descriptor = "Lmd;")
    private class113 field2558 = new class113(256);

    @OriginalMember(owner = "client!of", name = "h", descriptor = "Ljg;")
    private class89 field2546;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "Ljg;")
    private class89 field2549;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "Lkb;")
    public static class93 field2545 = class76.method390(" x ", 0);

    @OriginalMember(owner = "client!of", name = "e", descriptor = "Lkb;")
    public static class93 field2543 = class76.method390("sl_arrows", 0);

    @OriginalMember(owner = "client!of", name = "c", descriptor = "[Lkb;")
    public static class93[] field2541 = new class93[1000];

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "[[B")
    public static byte[][] field2547;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "([IIB)Lwc;")
    public final class202 method792(int[] arg0, int arg1, byte arg2) {
        field2553++;
        if (this.field2546.method462((byte) -78) == 1) {
            return this.method800(arg0, arg1, 0, -50);
        } else if (this.field2546.method456(arg1, -115) == 1) {
            return this.method800(arg0, 0, arg1, -76);
        } else if (arg2 == 29) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
    public static final void method793(byte arg0) {
        class108.field1955 = null;
        class173.field3435 = null;
        class204.field3953 = null;
        class195.field3784 = null;
        class70.field1287 = null;
        class197.field3841 = null;
        class68.field1266 = null;
        field2555++;
        int var1 = -12 % ((-arg0 - 11) / 58);
        class35.field571 = null;
        class177.field3529 = null;
        class182.field3603 = null;
        class95.field1768 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIB[I)Lwc;")
    private final class202 method794(int arg0, int arg1, byte arg2, int[] arg3) {
        int var5 = (arg0 >>> 12 | arg0 << 4 & 0xFFF1) ^ arg1;
        field2556++;
        if (arg2 >= -77) {
            this.method798(null, 92, false);
        }
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class202 var9 = (class202) this.field2558.method616(var7, -1);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class48 var10 = class48.method257(this.field2549, arg0, arg1);
            if (var10 == null) {
                return null;
            }
            class202 var11 = var10.method260();
            this.field2558.method617(0, var7, var11);
            if (arg3 != null) {
                arg3[0] -= var11.field3910.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V")
    public static void method795(byte arg0) {
        field2541 = null;
        field2545 = null;
        if (arg0 <= 8) {
            method793((byte) -9);
        }
        field2543 = null;
        field2547 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
    public static final Class method796(int arg0, String arg1) throws ClassNotFoundException {
        field2539++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else {
            if (arg0 <= 63) {
                method797(9, -22L);
            }
            if (arg1.equals("J")) {
                return Long.TYPE;
            } else if (arg1.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IJ)Lkb;")
    public static final class93 method797(int arg0, long arg1) {
        field2550++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % (long) arg0 == 0L) {
            return null;
        } else {
            long var3 = arg1;
            int var5 = 0;
            while (var3 != 0L) {
                var5++;
                var3 /= 37L;
            }
            byte[] var6 = new byte[var5];
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var5--;
                var6[var5] = class117.field2187[(int) (var8 - arg1 * 37L)];
            }
            class93 var7 = new class93();
            var7.field1726 = var6;
            var7.field1701 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "([IIZ)Lwc;")
    public final class202 method798(int[] arg0, int arg1, boolean arg2) {
        field2542++;
        if (this.field2549.method462((byte) -78) == 1) {
            return this.method794(0, arg1, (byte) -122, arg0);
        }
        if (!arg2) {
            this.method794(10, 93, (byte) 4, null);
        }
        if (this.field2549.method456(arg1, -56) != 1) {
            throw new RuntimeException();
        }
        return this.method794(arg1, 0, (byte) -127, arg0);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILkb;)V")
    public static final void method799(int arg0, class93 arg1) {
        field2551++;
        if (class98.field1838 == null) {
            return;
        }
        int var2 = 0;
        long var3 = arg1.method482(-50);
        if ((long) arg0 == var3) {
            return;
        }
        while (class98.field1838.length > var2 && class98.field1838[var2].field718 != var3) {
            var2++;
        }
        if (var2 < class98.field1838.length && class98.field1838[var2] != null) {
            class100.field1843++;
            class151.field2908.method47(214, arg0 ^ 0x8);
            class151.field2908.method1064(class98.field1838[var2].field718, -1);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "([IIII)Lwc;")
    private final class202 method800(int[] arg0, int arg1, int arg2, int arg3) {
        int var5 = ((arg2 & 0x20000FFF) << 4 | arg2 >>> 12) ^ arg1;
        field2554++;
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class202 var9 = (class202) this.field2558.method616(var7, -1);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class5 var10 = (class5) this.field2548.method616(var7, -1);
            if (var10 == null) {
                var10 = class5.method34(this.field2546, arg2, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field2548.method617(0, var7, var10);
            }
            class202 var11 = var10.method29(arg0);
            if (var11 == null) {
                return null;
            }
            var10.method235(false);
            if (arg3 >= -35) {
                return null;
            } else {
                this.field2558.method617(0, var7, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Ljg;Ljg;)V")
    public class133(class89 arg0, class89 arg1) {
        this.field2546 = arg1;
        this.field2549 = arg0;
    }
}
